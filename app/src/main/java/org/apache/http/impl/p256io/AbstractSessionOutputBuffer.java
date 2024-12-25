package org.apache.http.impl.p256io;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.apache.http.Consts;
import org.apache.http.p257io.BufferInfo;
import org.apache.http.p257io.HttpTransportMetrics;
import org.apache.http.p257io.SessionOutputBuffer;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.params.CoreProtocolPNames;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/io/AbstractSessionOutputBuffer.class */
public abstract class AbstractSessionOutputBuffer implements SessionOutputBuffer, BufferInfo {
    private static final byte[] CRLF = {13, 10};
    private boolean ascii;
    private ByteBuffer bbuf;
    private ByteArrayBuffer buffer;
    private Charset charset;
    private CharsetEncoder encoder;
    private HttpTransportMetricsImpl metrics;
    private int minChunkLimit;
    private CodingErrorAction onMalformedCharAction;
    private CodingErrorAction onUnmappableCharAction;
    private OutputStream outstream;

    public AbstractSessionOutputBuffer() {
    }

    public AbstractSessionOutputBuffer(OutputStream outputStream, int i10, Charset charset, int i11, CodingErrorAction codingErrorAction, CodingErrorAction codingErrorAction2) {
        Args.notNull(outputStream, "Input stream");
        Args.notNegative(i10, "Buffer size");
        this.outstream = outputStream;
        this.buffer = new ByteArrayBuffer(i10);
        charset = charset == null ? Consts.ASCII : charset;
        this.charset = charset;
        this.ascii = charset.equals(Consts.ASCII);
        this.encoder = null;
        this.minChunkLimit = i11 < 0 ? 512 : i11;
        this.metrics = createTransportMetrics();
        this.onMalformedCharAction = codingErrorAction == null ? CodingErrorAction.REPORT : codingErrorAction;
        this.onUnmappableCharAction = codingErrorAction2 == null ? CodingErrorAction.REPORT : codingErrorAction2;
    }

    private void handleEncodingResult(CoderResult coderResult) {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.bbuf.flip();
        while (this.bbuf.hasRemaining()) {
            write(this.bbuf.get());
        }
        this.bbuf.compact();
    }

    private void writeEncoded(CharBuffer charBuffer) {
        if (charBuffer.hasRemaining()) {
            if (this.encoder == null) {
                CharsetEncoder newEncoder = this.charset.newEncoder();
                this.encoder = newEncoder;
                newEncoder.onMalformedInput(this.onMalformedCharAction);
                this.encoder.onUnmappableCharacter(this.onUnmappableCharAction);
            }
            if (this.bbuf == null) {
                this.bbuf = ByteBuffer.allocate(1024);
            }
            this.encoder.reset();
            while (charBuffer.hasRemaining()) {
                handleEncodingResult(this.encoder.encode(charBuffer, this.bbuf, true));
            }
            handleEncodingResult(this.encoder.flush(this.bbuf));
            this.bbuf.clear();
        }
    }

    @Override // org.apache.http.p257io.BufferInfo
    public int available() {
        return capacity() - length();
    }

    @Override // org.apache.http.p257io.BufferInfo
    public int capacity() {
        return this.buffer.capacity();
    }

    public HttpTransportMetricsImpl createTransportMetrics() {
        return new HttpTransportMetricsImpl();
    }

    @Override // org.apache.http.p257io.SessionOutputBuffer
    public void flush() {
        flushBuffer();
        this.outstream.flush();
    }

    public void flushBuffer() {
        int length = this.buffer.length();
        if (length > 0) {
            this.outstream.write(this.buffer.buffer(), 0, length);
            this.buffer.clear();
            this.metrics.incrementBytesTransferred(length);
        }
    }

    @Override // org.apache.http.p257io.SessionOutputBuffer
    public HttpTransportMetrics getMetrics() {
        return this.metrics;
    }

    public void init(OutputStream outputStream, int i10, HttpParams httpParams) {
        Args.notNull(outputStream, "Input stream");
        Args.notNegative(i10, "Buffer size");
        Args.notNull(httpParams, "HTTP parameters");
        this.outstream = outputStream;
        this.buffer = new ByteArrayBuffer(i10);
        String str = (String) httpParams.getParameter(CoreProtocolPNames.HTTP_ELEMENT_CHARSET);
        Charset forName = str != null ? Charset.forName(str) : Consts.ASCII;
        this.charset = forName;
        this.ascii = forName.equals(Consts.ASCII);
        this.encoder = null;
        this.minChunkLimit = httpParams.getIntParameter(CoreConnectionPNames.MIN_CHUNK_LIMIT, 512);
        this.metrics = createTransportMetrics();
        CodingErrorAction codingErrorAction = (CodingErrorAction) httpParams.getParameter(CoreProtocolPNames.HTTP_MALFORMED_INPUT_ACTION);
        if (codingErrorAction == null) {
            codingErrorAction = CodingErrorAction.REPORT;
        }
        this.onMalformedCharAction = codingErrorAction;
        CodingErrorAction codingErrorAction2 = (CodingErrorAction) httpParams.getParameter(CoreProtocolPNames.HTTP_UNMAPPABLE_INPUT_ACTION);
        if (codingErrorAction2 == null) {
            codingErrorAction2 = CodingErrorAction.REPORT;
        }
        this.onUnmappableCharAction = codingErrorAction2;
    }

    @Override // org.apache.http.p257io.BufferInfo
    public int length() {
        return this.buffer.length();
    }

    @Override // org.apache.http.p257io.SessionOutputBuffer
    public void write(int i10) {
        if (this.buffer.isFull()) {
            flushBuffer();
        }
        this.buffer.append(i10);
    }

    @Override // org.apache.http.p257io.SessionOutputBuffer
    public void write(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        write(bArr, 0, bArr.length);
    }

    @Override // org.apache.http.p257io.SessionOutputBuffer
    public void write(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            return;
        }
        if (i11 > this.minChunkLimit || i11 > this.buffer.capacity()) {
            flushBuffer();
            this.outstream.write(bArr, i10, i11);
            this.metrics.incrementBytesTransferred(i11);
        } else {
            if (i11 > this.buffer.capacity() - this.buffer.length()) {
                flushBuffer();
            }
            this.buffer.append(bArr, i10, i11);
        }
    }

    @Override // org.apache.http.p257io.SessionOutputBuffer
    public void writeLine(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 0) {
            if (this.ascii) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    write(str.charAt(i10));
                }
            } else {
                writeEncoded(CharBuffer.wrap(str));
            }
        }
        write(CRLF);
    }

    @Override // org.apache.http.p257io.SessionOutputBuffer
    public void writeLine(CharArrayBuffer charArrayBuffer) {
        if (charArrayBuffer == null) {
            return;
        }
        int i10 = 0;
        if (this.ascii) {
            int length = charArrayBuffer.length();
            while (true) {
                int i11 = length;
                if (i11 <= 0) {
                    break;
                }
                int min = Math.min(this.buffer.capacity() - this.buffer.length(), i11);
                if (min > 0) {
                    this.buffer.append(charArrayBuffer, i10, min);
                }
                if (this.buffer.isFull()) {
                    flushBuffer();
                }
                i10 += min;
                length = i11 - min;
            }
        } else {
            writeEncoded(CharBuffer.wrap(charArrayBuffer.buffer(), 0, charArrayBuffer.length()));
        }
        write(CRLF);
    }
}

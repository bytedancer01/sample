package org.apache.http.impl.p256io;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import org.apache.http.p257io.BufferInfo;
import org.apache.http.p257io.HttpTransportMetrics;
import org.apache.http.p257io.SessionOutputBuffer;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/io/SessionOutputBufferImpl.class */
public class SessionOutputBufferImpl implements SessionOutputBuffer, BufferInfo {
    private static final byte[] CRLF = {13, 10};
    private ByteBuffer bbuf;
    private final ByteArrayBuffer buffer;
    private final CharsetEncoder encoder;
    private final int fragementSizeHint;
    private final HttpTransportMetricsImpl metrics;
    private OutputStream outstream;

    public SessionOutputBufferImpl(HttpTransportMetricsImpl httpTransportMetricsImpl, int i10) {
        this(httpTransportMetricsImpl, i10, i10, null);
    }

    public SessionOutputBufferImpl(HttpTransportMetricsImpl httpTransportMetricsImpl, int i10, int i11, CharsetEncoder charsetEncoder) {
        Args.positive(i10, "Buffer size");
        Args.notNull(httpTransportMetricsImpl, "HTTP transport metrcis");
        this.metrics = httpTransportMetricsImpl;
        this.buffer = new ByteArrayBuffer(i10);
        this.fragementSizeHint = i11 < 0 ? 0 : i11;
        this.encoder = charsetEncoder;
    }

    private void flushBuffer() {
        int length = this.buffer.length();
        if (length > 0) {
            streamWrite(this.buffer.buffer(), 0, length);
            this.buffer.clear();
            this.metrics.incrementBytesTransferred(length);
        }
    }

    private void flushStream() {
        OutputStream outputStream = this.outstream;
        if (outputStream != null) {
            outputStream.flush();
        }
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

    private void streamWrite(byte[] bArr, int i10, int i11) {
        Asserts.notNull(this.outstream, "Output stream");
        this.outstream.write(bArr, i10, i11);
    }

    private void writeEncoded(CharBuffer charBuffer) {
        if (charBuffer.hasRemaining()) {
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

    public void bind(OutputStream outputStream) {
        this.outstream = outputStream;
    }

    @Override // org.apache.http.p257io.BufferInfo
    public int capacity() {
        return this.buffer.capacity();
    }

    @Override // org.apache.http.p257io.SessionOutputBuffer
    public void flush() {
        flushBuffer();
        flushStream();
    }

    @Override // org.apache.http.p257io.SessionOutputBuffer
    public HttpTransportMetrics getMetrics() {
        return this.metrics;
    }

    public boolean isBound() {
        return this.outstream != null;
    }

    @Override // org.apache.http.p257io.BufferInfo
    public int length() {
        return this.buffer.length();
    }

    @Override // org.apache.http.p257io.SessionOutputBuffer
    public void write(int i10) {
        if (this.fragementSizeHint <= 0) {
            flushBuffer();
            this.outstream.write(i10);
        } else {
            if (this.buffer.isFull()) {
                flushBuffer();
            }
            this.buffer.append(i10);
        }
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
        if (i11 > this.fragementSizeHint || i11 > this.buffer.capacity()) {
            flushBuffer();
            streamWrite(bArr, i10, i11);
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
            if (this.encoder == null) {
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
        if (this.encoder == null) {
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

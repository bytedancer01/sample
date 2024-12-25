package org.apache.http.impl.p256io;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.apache.http.Consts;
import org.apache.http.p257io.BufferInfo;
import org.apache.http.p257io.HttpTransportMetrics;
import org.apache.http.p257io.SessionInputBuffer;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.params.CoreProtocolPNames;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/io/AbstractSessionInputBuffer.class */
public abstract class AbstractSessionInputBuffer implements SessionInputBuffer, BufferInfo {
    private boolean ascii;
    private byte[] buffer;
    private int bufferlen;
    private int bufferpos;
    private CharBuffer cbuf;
    private Charset charset;
    private CharsetDecoder decoder;
    private InputStream instream;
    private ByteArrayBuffer linebuffer;
    private int maxLineLen;
    private HttpTransportMetricsImpl metrics;
    private int minChunkLimit;
    private CodingErrorAction onMalformedCharAction;
    private CodingErrorAction onUnmappableCharAction;

    private int appendDecoded(CharArrayBuffer charArrayBuffer, ByteBuffer byteBuffer) {
        int i10 = 0;
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (this.decoder == null) {
            CharsetDecoder newDecoder = this.charset.newDecoder();
            this.decoder = newDecoder;
            newDecoder.onMalformedInput(this.onMalformedCharAction);
            this.decoder.onUnmappableCharacter(this.onUnmappableCharAction);
        }
        if (this.cbuf == null) {
            this.cbuf = CharBuffer.allocate(1024);
        }
        this.decoder.reset();
        while (byteBuffer.hasRemaining()) {
            i10 += handleDecodingResult(this.decoder.decode(byteBuffer, this.cbuf, true), charArrayBuffer, byteBuffer);
        }
        int handleDecodingResult = handleDecodingResult(this.decoder.flush(this.cbuf), charArrayBuffer, byteBuffer);
        this.cbuf.clear();
        return i10 + handleDecodingResult;
    }

    private int handleDecodingResult(CoderResult coderResult, CharArrayBuffer charArrayBuffer, ByteBuffer byteBuffer) {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.cbuf.flip();
        int remaining = this.cbuf.remaining();
        while (this.cbuf.hasRemaining()) {
            charArrayBuffer.append(this.cbuf.get());
        }
        this.cbuf.compact();
        return remaining;
    }

    private int lineFromLineBuffer(CharArrayBuffer charArrayBuffer) {
        int length = this.linebuffer.length();
        int i10 = length;
        if (length > 0) {
            int i11 = length;
            if (this.linebuffer.byteAt(length - 1) == 10) {
                i11 = length - 1;
            }
            i10 = i11;
            if (i11 > 0) {
                i10 = i11;
                if (this.linebuffer.byteAt(i11 - 1) == 13) {
                    i10 = i11 - 1;
                }
            }
        }
        if (this.ascii) {
            charArrayBuffer.append(this.linebuffer, 0, i10);
        } else {
            i10 = appendDecoded(charArrayBuffer, ByteBuffer.wrap(this.linebuffer.buffer(), 0, i10));
        }
        this.linebuffer.clear();
        return i10;
    }

    private int lineFromReadBuffer(CharArrayBuffer charArrayBuffer, int i10) {
        int i11 = this.bufferpos;
        this.bufferpos = i10 + 1;
        int i12 = i10;
        if (i10 > i11) {
            i12 = i10;
            if (this.buffer[i10 - 1] == 13) {
                i12 = i10 - 1;
            }
        }
        int i13 = i12 - i11;
        if (this.ascii) {
            charArrayBuffer.append(this.buffer, i11, i13);
        } else {
            i13 = appendDecoded(charArrayBuffer, ByteBuffer.wrap(this.buffer, i11, i13));
        }
        return i13;
    }

    private int locateLF() {
        for (int i10 = this.bufferpos; i10 < this.bufferlen; i10++) {
            if (this.buffer[i10] == 10) {
                return i10;
            }
        }
        return -1;
    }

    @Override // org.apache.http.p257io.BufferInfo
    public int available() {
        return capacity() - length();
    }

    @Override // org.apache.http.p257io.BufferInfo
    public int capacity() {
        return this.buffer.length;
    }

    public HttpTransportMetricsImpl createTransportMetrics() {
        return new HttpTransportMetricsImpl();
    }

    public int fillBuffer() {
        int i10 = this.bufferpos;
        if (i10 > 0) {
            int i11 = this.bufferlen - i10;
            if (i11 > 0) {
                byte[] bArr = this.buffer;
                System.arraycopy(bArr, i10, bArr, 0, i11);
            }
            this.bufferpos = 0;
            this.bufferlen = i11;
        }
        int i12 = this.bufferlen;
        byte[] bArr2 = this.buffer;
        int read = this.instream.read(bArr2, i12, bArr2.length - i12);
        if (read == -1) {
            return -1;
        }
        this.bufferlen = i12 + read;
        this.metrics.incrementBytesTransferred(read);
        return read;
    }

    @Override // org.apache.http.p257io.SessionInputBuffer
    public HttpTransportMetrics getMetrics() {
        return this.metrics;
    }

    public boolean hasBufferedData() {
        return this.bufferpos < this.bufferlen;
    }

    public void init(InputStream inputStream, int i10, HttpParams httpParams) {
        Args.notNull(inputStream, "Input stream");
        Args.notNegative(i10, "Buffer size");
        Args.notNull(httpParams, "HTTP parameters");
        this.instream = inputStream;
        this.buffer = new byte[i10];
        this.bufferpos = 0;
        this.bufferlen = 0;
        this.linebuffer = new ByteArrayBuffer(i10);
        String str = (String) httpParams.getParameter(CoreProtocolPNames.HTTP_ELEMENT_CHARSET);
        Charset forName = str != null ? Charset.forName(str) : Consts.ASCII;
        this.charset = forName;
        this.ascii = forName.equals(Consts.ASCII);
        this.decoder = null;
        this.maxLineLen = httpParams.getIntParameter(CoreConnectionPNames.MAX_LINE_LENGTH, -1);
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
        return this.bufferlen - this.bufferpos;
    }

    @Override // org.apache.http.p257io.SessionInputBuffer
    public int read() {
        while (!hasBufferedData()) {
            if (fillBuffer() == -1) {
                return -1;
            }
        }
        byte[] bArr = this.buffer;
        int i10 = this.bufferpos;
        this.bufferpos = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // org.apache.http.p257io.SessionInputBuffer
    public int read(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return read(bArr, 0, bArr.length);
    }

    @Override // org.apache.http.p257io.SessionInputBuffer
    public int read(byte[] bArr, int i10, int i11) {
        int i12;
        if (bArr == null) {
            return 0;
        }
        if (hasBufferedData()) {
            int min = Math.min(i11, this.bufferlen - this.bufferpos);
            System.arraycopy(this.buffer, this.bufferpos, bArr, i10, min);
            i12 = min;
        } else {
            if (i11 > this.minChunkLimit) {
                int read = this.instream.read(bArr, i10, i11);
                if (read > 0) {
                    this.metrics.incrementBytesTransferred(read);
                }
                return read;
            }
            while (!hasBufferedData()) {
                if (fillBuffer() == -1) {
                    return -1;
                }
            }
            int min2 = Math.min(i11, this.bufferlen - this.bufferpos);
            System.arraycopy(this.buffer, this.bufferpos, bArr, i10, min2);
            i12 = min2;
        }
        this.bufferpos += i12;
        return i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        if (r8 == (-1)) goto L12;
     */
    @Override // org.apache.http.p257io.SessionInputBuffer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int readLine(org.apache.http.util.CharArrayBuffer r7) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.p256io.AbstractSessionInputBuffer.readLine(org.apache.http.util.CharArrayBuffer):int");
    }

    @Override // org.apache.http.p257io.SessionInputBuffer
    public String readLine() {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(64);
        if (readLine(charArrayBuffer) != -1) {
            return charArrayBuffer.toString();
        }
        return null;
    }
}

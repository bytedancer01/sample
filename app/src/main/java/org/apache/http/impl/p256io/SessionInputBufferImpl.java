package org.apache.http.impl.p256io;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import org.apache.http.MessageConstraintException;
import org.apache.http.config.MessageConstraints;
import org.apache.http.p257io.BufferInfo;
import org.apache.http.p257io.HttpTransportMetrics;
import org.apache.http.p257io.SessionInputBuffer;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/io/SessionInputBufferImpl.class */
public class SessionInputBufferImpl implements SessionInputBuffer, BufferInfo {
    private final byte[] buffer;
    private int bufferlen;
    private int bufferpos;
    private CharBuffer cbuf;
    private final MessageConstraints constraints;
    private final CharsetDecoder decoder;
    private InputStream instream;
    private final ByteArrayBuffer linebuffer;
    private final HttpTransportMetricsImpl metrics;
    private final int minChunkLimit;

    public SessionInputBufferImpl(HttpTransportMetricsImpl httpTransportMetricsImpl, int i10) {
        this(httpTransportMetricsImpl, i10, i10, null, null);
    }

    public SessionInputBufferImpl(HttpTransportMetricsImpl httpTransportMetricsImpl, int i10, int i11, MessageConstraints messageConstraints, CharsetDecoder charsetDecoder) {
        Args.notNull(httpTransportMetricsImpl, "HTTP transport metrcis");
        Args.positive(i10, "Buffer size");
        this.metrics = httpTransportMetricsImpl;
        this.buffer = new byte[i10];
        this.bufferpos = 0;
        this.bufferlen = 0;
        this.minChunkLimit = i11 < 0 ? 512 : i11;
        this.constraints = messageConstraints == null ? MessageConstraints.DEFAULT : messageConstraints;
        this.linebuffer = new ByteArrayBuffer(i10);
        this.decoder = charsetDecoder;
    }

    private int appendDecoded(CharArrayBuffer charArrayBuffer, ByteBuffer byteBuffer) {
        int i10 = 0;
        if (!byteBuffer.hasRemaining()) {
            return 0;
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
        if (this.decoder == null) {
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
        if (this.decoder == null) {
            charArrayBuffer.append(this.buffer, i11, i13);
        } else {
            i13 = appendDecoded(charArrayBuffer, ByteBuffer.wrap(this.buffer, i11, i13));
        }
        return i13;
    }

    private int streamRead(byte[] bArr, int i10, int i11) {
        Asserts.notNull(this.instream, "Input stream");
        return this.instream.read(bArr, i10, i11);
    }

    @Override // org.apache.http.p257io.BufferInfo
    public int available() {
        return capacity() - length();
    }

    public void bind(InputStream inputStream) {
        this.instream = inputStream;
    }

    @Override // org.apache.http.p257io.BufferInfo
    public int capacity() {
        return this.buffer.length;
    }

    public void clear() {
        this.bufferpos = 0;
        this.bufferlen = 0;
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
        int streamRead = streamRead(bArr2, i12, bArr2.length - i12);
        if (streamRead == -1) {
            return -1;
        }
        this.bufferlen = i12 + streamRead;
        this.metrics.incrementBytesTransferred(streamRead);
        return streamRead;
    }

    @Override // org.apache.http.p257io.SessionInputBuffer
    public HttpTransportMetrics getMetrics() {
        return this.metrics;
    }

    public boolean hasBufferedData() {
        return this.bufferpos < this.bufferlen;
    }

    public boolean isBound() {
        return this.instream != null;
    }

    @Override // org.apache.http.p257io.SessionInputBuffer
    public boolean isDataAvailable(int i10) {
        return hasBufferedData();
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
                int streamRead = streamRead(bArr, i10, i11);
                if (streamRead > 0) {
                    this.metrics.incrementBytesTransferred(streamRead);
                }
                return streamRead;
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

    @Override // org.apache.http.p257io.SessionInputBuffer
    public int readLine(CharArrayBuffer charArrayBuffer) {
        Args.notNull(charArrayBuffer, "Char array buffer");
        int maxLineLength = this.constraints.getMaxLineLength();
        boolean z10 = true;
        int i10 = 0;
        while (z10) {
            int i11 = this.bufferpos;
            while (true) {
                if (i11 >= this.bufferlen) {
                    i11 = -1;
                    break;
                }
                if (this.buffer[i11] == 10) {
                    break;
                }
                i11++;
            }
            if (maxLineLength > 0) {
                if ((this.linebuffer.length() + (i11 >= 0 ? i11 : this.bufferlen)) - this.bufferpos >= maxLineLength) {
                    throw new MessageConstraintException("Maximum line length limit exceeded");
                }
            }
            if (i11 == -1) {
                if (hasBufferedData()) {
                    int i12 = this.bufferlen;
                    int i13 = this.bufferpos;
                    this.linebuffer.append(this.buffer, i13, i12 - i13);
                    this.bufferpos = this.bufferlen;
                }
                int fillBuffer = fillBuffer();
                i10 = fillBuffer;
                if (fillBuffer == -1) {
                    i10 = fillBuffer;
                }
            } else {
                if (this.linebuffer.isEmpty()) {
                    return lineFromReadBuffer(charArrayBuffer, i11);
                }
                int i14 = i11 + 1;
                int i15 = this.bufferpos;
                this.linebuffer.append(this.buffer, i15, i14 - i15);
                this.bufferpos = i14;
            }
            z10 = false;
        }
        if (i10 == -1 && this.linebuffer.isEmpty()) {
            return -1;
        }
        return lineFromLineBuffer(charArrayBuffer);
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

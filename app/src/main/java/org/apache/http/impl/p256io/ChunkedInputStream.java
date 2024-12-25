package org.apache.http.impl.p256io;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.ConnectionClosedException;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.MalformedChunkCodingException;
import org.apache.http.TruncatedChunkException;
import org.apache.http.config.MessageConstraints;
import org.apache.http.p257io.BufferInfo;
import org.apache.http.p257io.SessionInputBuffer;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/io/ChunkedInputStream.class */
public class ChunkedInputStream extends InputStream {
    private static final int BUFFER_SIZE = 2048;
    private static final int CHUNK_CRLF = 3;
    private static final int CHUNK_DATA = 2;
    private static final int CHUNK_INVALID = Integer.MAX_VALUE;
    private static final int CHUNK_LEN = 1;
    private final CharArrayBuffer buffer;
    private long chunkSize;
    private boolean closed;
    private final MessageConstraints constraints;
    private boolean eof;
    private Header[] footers;

    /* renamed from: in */
    private final SessionInputBuffer f36166in;
    private long pos;
    private int state;

    public ChunkedInputStream(SessionInputBuffer sessionInputBuffer) {
        this(sessionInputBuffer, null);
    }

    public ChunkedInputStream(SessionInputBuffer sessionInputBuffer, MessageConstraints messageConstraints) {
        this.eof = false;
        this.closed = false;
        this.footers = new Header[0];
        this.f36166in = (SessionInputBuffer) Args.notNull(sessionInputBuffer, "Session input buffer");
        this.pos = 0L;
        this.buffer = new CharArrayBuffer(16);
        this.constraints = messageConstraints == null ? MessageConstraints.DEFAULT : messageConstraints;
        this.state = 1;
    }

    private long getChunkSize() {
        int i10 = this.state;
        if (i10 != 1) {
            if (i10 != 3) {
                throw new IllegalStateException("Inconsistent codec state");
            }
            this.buffer.clear();
            if (this.f36166in.readLine(this.buffer) == -1) {
                throw new MalformedChunkCodingException("CRLF expected at end of chunk");
            }
            if (!this.buffer.isEmpty()) {
                throw new MalformedChunkCodingException("Unexpected content at the end of chunk");
            }
            this.state = 1;
        }
        this.buffer.clear();
        if (this.f36166in.readLine(this.buffer) == -1) {
            throw new ConnectionClosedException("Premature end of chunk coded message body: closing chunk expected");
        }
        int indexOf = this.buffer.indexOf(59);
        int i11 = indexOf;
        if (indexOf < 0) {
            i11 = this.buffer.length();
        }
        String substringTrimmed = this.buffer.substringTrimmed(0, i11);
        try {
            return Long.parseLong(substringTrimmed, 16);
        } catch (NumberFormatException e10) {
            throw new MalformedChunkCodingException("Bad chunk header: " + substringTrimmed);
        }
    }

    private void nextChunk() {
        if (this.state == Integer.MAX_VALUE) {
            throw new MalformedChunkCodingException("Corrupt data stream");
        }
        try {
            long chunkSize = getChunkSize();
            this.chunkSize = chunkSize;
            if (chunkSize < 0) {
                throw new MalformedChunkCodingException("Negative chunk size");
            }
            this.state = 2;
            this.pos = 0L;
            if (chunkSize == 0) {
                this.eof = true;
                parseTrailerHeaders();
            }
        } catch (MalformedChunkCodingException e10) {
            this.state = Integer.MAX_VALUE;
            throw e10;
        }
    }

    private void parseTrailerHeaders() {
        try {
            this.footers = AbstractMessageParser.parseHeaders(this.f36166in, this.constraints.getMaxHeaderCount(), this.constraints.getMaxLineLength(), null);
        } catch (HttpException e10) {
            MalformedChunkCodingException malformedChunkCodingException = new MalformedChunkCodingException("Invalid footer: " + e10.getMessage());
            malformedChunkCodingException.initCause(e10);
            throw malformedChunkCodingException;
        }
    }

    @Override // java.io.InputStream
    public int available() {
        if (this.f36166in instanceof BufferInfo) {
            return (int) Math.min(((BufferInfo) r0).length(), this.chunkSize - this.pos);
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        try {
            if (!this.eof && this.state != Integer.MAX_VALUE) {
                do {
                } while (read(new byte[2048]) >= 0);
            }
        } finally {
            this.eof = true;
            this.closed = true;
        }
    }

    public Header[] getFooters() {
        return (Header[]) this.footers.clone();
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.closed) {
            throw new IOException("Attempted read from closed stream.");
        }
        if (this.eof) {
            return -1;
        }
        if (this.state != 2) {
            nextChunk();
            if (this.eof) {
                return -1;
            }
        }
        int read = this.f36166in.read();
        if (read != -1) {
            long j10 = this.pos + 1;
            this.pos = j10;
            if (j10 >= this.chunkSize) {
                this.state = 3;
            }
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        if (this.closed) {
            throw new IOException("Attempted read from closed stream.");
        }
        if (this.eof) {
            return -1;
        }
        if (this.state != 2) {
            nextChunk();
            if (this.eof) {
                return -1;
            }
        }
        int read = this.f36166in.read(bArr, i10, (int) Math.min(i11, this.chunkSize - this.pos));
        if (read != -1) {
            long j10 = this.pos + read;
            this.pos = j10;
            if (j10 >= this.chunkSize) {
                this.state = 3;
            }
            return read;
        }
        this.eof = true;
        throw new TruncatedChunkException("Truncated chunk ( expected size: " + this.chunkSize + "; actual size: " + this.pos + ")");
    }
}

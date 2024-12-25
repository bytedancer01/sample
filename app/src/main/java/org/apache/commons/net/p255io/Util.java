package org.apache.commons.net.p255io;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/io/Util.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/io/Util.class */
public final class Util {
    public static final int DEFAULT_COPY_BUFFER_SIZE = 1024;

    private Util() {
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
            }
        }
    }

    public static void closeQuietly(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e10) {
            }
        }
    }

    public static final long copyReader(Reader reader, Writer writer) {
        return copyReader(reader, writer, 1024);
    }

    public static final long copyReader(Reader reader, Writer writer, int i10) {
        return copyReader(reader, writer, i10, -1L, null);
    }

    public static final long copyReader(Reader reader, Writer writer, int i10, long j10, CopyStreamListener copyStreamListener) {
        if (i10 <= 0) {
            i10 = 1024;
        }
        char[] cArr = new char[i10];
        long j11 = 0;
        while (true) {
            long j12 = j11;
            try {
                int read = reader.read(cArr);
                if (read == -1) {
                    break;
                }
                if (read == 0) {
                    int read2 = reader.read();
                    if (read2 < 0) {
                        break;
                    }
                    writer.write(read2);
                    long j13 = j11;
                    writer.flush();
                    long j14 = j11 + 1;
                    j11 = j14;
                    if (copyStreamListener != null) {
                        copyStreamListener.bytesTransferred(j14, 1, j10);
                        j11 = j14;
                    }
                } else {
                    writer.write(cArr, 0, read);
                    long j15 = j11;
                    writer.flush();
                    long j16 = j11 + read;
                    j11 = j16;
                    if (copyStreamListener != null) {
                        copyStreamListener.bytesTransferred(j16, read, j10);
                        j11 = j16;
                    }
                }
            } catch (IOException e10) {
                throw new CopyStreamException("IOException caught while copying.", j12, e10);
            }
        }
        return j11;
    }

    public static final long copyStream(InputStream inputStream, OutputStream outputStream) {
        return copyStream(inputStream, outputStream, 1024);
    }

    public static final long copyStream(InputStream inputStream, OutputStream outputStream, int i10) {
        return copyStream(inputStream, outputStream, i10, -1L, null);
    }

    public static final long copyStream(InputStream inputStream, OutputStream outputStream, int i10, long j10, CopyStreamListener copyStreamListener) {
        return copyStream(inputStream, outputStream, i10, j10, copyStreamListener, true);
    }

    public static final long copyStream(InputStream inputStream, OutputStream outputStream, int i10, long j10, CopyStreamListener copyStreamListener, boolean z10) {
        if (i10 <= 0) {
            i10 = 1024;
        }
        byte[] bArr = new byte[i10];
        long j11 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                if (read == 0) {
                    int read2 = inputStream.read();
                    if (read2 < 0) {
                        break;
                    }
                    outputStream.write(read2);
                    if (z10) {
                        outputStream.flush();
                    }
                    long j12 = j11 + 1;
                    j11 = j12;
                    if (copyStreamListener != null) {
                        j11 = j12;
                        try {
                            copyStreamListener.bytesTransferred(j12, 1, j10);
                            j11 = j12;
                        } catch (IOException e10) {
                            e = e10;
                            throw new CopyStreamException("IOException caught while copying.", j11, e);
                        }
                    } else {
                        continue;
                    }
                } else {
                    outputStream.write(bArr, 0, read);
                    if (z10) {
                        outputStream.flush();
                    }
                    long j13 = j11 + read;
                    j11 = j13;
                    if (copyStreamListener != null) {
                        copyStreamListener.bytesTransferred(j13, read, j10);
                        j11 = j13;
                    }
                }
            } catch (IOException e11) {
                e = e11;
            }
        }
        return j11;
    }
}

package org.apache.commons.net.p255io;

import java.io.Writer;
import org.apache.commons.net.SocketClient;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/io/DotTerminatedMessageWriter.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/io/DotTerminatedMessageWriter.class */
public final class DotTerminatedMessageWriter extends Writer {
    private static final int __LAST_WAS_CR_STATE = 1;
    private static final int __LAST_WAS_NL_STATE = 2;
    private static final int __NOTHING_SPECIAL_STATE = 0;
    private Writer __output;
    private int __state;

    public DotTerminatedMessageWriter(Writer writer) {
        super(writer);
        this.__output = writer;
        this.__state = 0;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (((Writer) this).lock) {
            Writer writer = this.__output;
            if (writer == null) {
                return;
            }
            int i10 = this.__state;
            if (i10 == 1) {
                writer.write(10);
            } else if (i10 != 2) {
                writer.write(SocketClient.NETASCII_EOL);
            }
            this.__output.write(".\r\n");
            this.__output.flush();
            this.__output = null;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        synchronized (((Writer) this).lock) {
            this.__output.flush();
        }
    }

    @Override // java.io.Writer
    public void write(int i10) {
        synchronized (((Writer) this).lock) {
            if (i10 == 10) {
                if (this.__state != 1) {
                    this.__output.write(13);
                }
                this.__output.write(10);
                this.__state = 2;
                return;
            }
            if (i10 == 13) {
                this.__state = 1;
                this.__output.write(13);
                return;
            }
            if (i10 == 46 && this.__state == 2) {
                this.__output.write(46);
            }
            this.__state = 0;
            this.__output.write(i10);
        }
    }

    @Override // java.io.Writer
    public void write(String str) {
        write(str.toCharArray());
    }

    @Override // java.io.Writer
    public void write(String str, int i10, int i11) {
        write(str.toCharArray(), i10, i11);
    }

    @Override // java.io.Writer
    public void write(char[] cArr) {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        synchronized (((Writer) this).lock) {
            while (i11 > 0) {
                write(cArr[i10]);
                i10++;
                i11--;
            }
        }
    }
}

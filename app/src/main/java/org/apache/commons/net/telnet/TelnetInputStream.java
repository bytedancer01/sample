package org.apache.commons.net.telnet;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/telnet/TelnetInputStream.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/telnet/TelnetInputStream.class */
final class TelnetInputStream extends BufferedInputStream implements Runnable {
    private static final int EOF = -1;
    private static final int WOULD_BLOCK = -2;
    public static final int _STATE_CR = 8;
    public static final int _STATE_DATA = 0;
    public static final int _STATE_DO = 4;
    public static final int _STATE_DONT = 5;
    public static final int _STATE_IAC = 1;
    public static final int _STATE_IAC_SB = 9;
    public static final int _STATE_SB = 6;
    public static final int _STATE_SE = 7;
    public static final int _STATE_WILL = 2;
    public static final int _STATE_WONT = 3;
    private int __bytesAvailable;
    private final TelnetClient __client;
    private boolean __hasReachedEOF;
    private IOException __ioException;
    private volatile boolean __isClosed;
    private final int[] __queue;
    private int __queueHead;
    private int __queueTail;
    private boolean __readIsWaiting;
    private int __receiveState;
    private final int[] __suboption;
    private int __suboption_count;
    private final Thread __thread;
    private volatile boolean __threaded;

    public TelnetInputStream(InputStream inputStream, TelnetClient telnetClient) {
        this(inputStream, telnetClient, true);
    }

    public TelnetInputStream(InputStream inputStream, TelnetClient telnetClient, boolean z10) {
        super(inputStream);
        this.__suboption = new int[512];
        this.__suboption_count = 0;
        this.__client = telnetClient;
        this.__receiveState = 0;
        this.__isClosed = true;
        this.__hasReachedEOF = false;
        this.__queue = new int[2049];
        this.__queueHead = 0;
        this.__queueTail = 0;
        this.__bytesAvailable = 0;
        this.__ioException = null;
        this.__readIsWaiting = false;
        this.__threaded = false;
        if (z10) {
            this.__thread = new Thread(this);
        } else {
            this.__thread = null;
        }
    }

    private boolean __processChar(int i10) {
        boolean z10;
        synchronized (this.__queue) {
            z10 = this.__bytesAvailable == 0;
            while (this.__bytesAvailable >= this.__queue.length - 1) {
                if (!this.__threaded) {
                    throw new IllegalStateException("Queue is full! Cannot process another character.");
                }
                this.__queue.notify();
                try {
                    this.__queue.wait();
                } catch (InterruptedException e10) {
                    throw e10;
                }
            }
            if (this.__readIsWaiting && this.__threaded) {
                this.__queue.notify();
            }
            int[] iArr = this.__queue;
            int i11 = this.__queueTail;
            iArr[i11] = i10;
            this.__bytesAvailable++;
            int i12 = i11 + 1;
            this.__queueTail = i12;
            if (i12 >= iArr.length) {
                this.__queueTail = 0;
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0223 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int __read(boolean r5) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.telnet.TelnetInputStream.__read(boolean):int");
    }

    public void _start() {
        if (this.__thread == null) {
            return;
        }
        this.__isClosed = false;
        int priority = Thread.currentThread().getPriority() + 1;
        int i10 = priority;
        if (priority > 10) {
            i10 = 10;
        }
        this.__thread.setPriority(i10);
        this.__thread.setDaemon(true);
        this.__thread.start();
        this.__threaded = true;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public int available() {
        synchronized (this.__queue) {
            if (this.__threaded) {
                return this.__bytesAvailable;
            }
            return this.__bytesAvailable + super.available();
        }
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        synchronized (this.__queue) {
            this.__hasReachedEOF = true;
            this.__isClosed = true;
            Thread thread = this.__thread;
            if (thread != null && thread.isAlive()) {
                this.__thread.interrupt();
            }
            this.__queue.notifyAll();
        }
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() {
        synchronized (this.__queue) {
            while (true) {
                IOException iOException = this.__ioException;
                if (iOException != null) {
                    this.__ioException = null;
                    throw iOException;
                }
                int i10 = this.__bytesAvailable;
                if (i10 != 0) {
                    int[] iArr = this.__queue;
                    int i11 = this.__queueHead;
                    int i12 = iArr[i11];
                    int i13 = i11 + 1;
                    this.__queueHead = i13;
                    if (i13 >= iArr.length) {
                        this.__queueHead = 0;
                    }
                    int i14 = i10 - 1;
                    this.__bytesAvailable = i14;
                    if (i14 == 0 && this.__threaded) {
                        this.__queue.notify();
                    }
                    return i12;
                }
                if (this.__hasReachedEOF) {
                    return -1;
                }
                if (this.__threaded) {
                    this.__queue.notify();
                    try {
                        this.__readIsWaiting = true;
                        this.__queue.wait();
                        this.__readIsWaiting = false;
                    } catch (InterruptedException e10) {
                        throw new InterruptedIOException("Fatal thread interruption during read.");
                    }
                } else {
                    this.__readIsWaiting = true;
                    boolean z10 = true;
                    while (true) {
                        try {
                            int __read = __read(z10);
                            if (__read < 0 && __read != -2) {
                                return __read;
                            }
                            if (__read != -2) {
                                try {
                                    __processChar(__read);
                                } catch (InterruptedException e11) {
                                    if (this.__isClosed) {
                                        return -1;
                                    }
                                }
                            }
                            if (super.available() <= 0 || this.__bytesAvailable >= this.__queue.length - 1) {
                                break;
                            }
                            z10 = false;
                        } catch (InterruptedIOException e12) {
                            synchronized (this.__queue) {
                                this.__ioException = e12;
                                this.__queue.notifyAll();
                                try {
                                    this.__queue.wait(100L);
                                } catch (InterruptedException e13) {
                                }
                                return -1;
                            }
                        }
                    }
                    this.__readIsWaiting = false;
                }
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        if (i11 < 1) {
            return 0;
        }
        synchronized (this.__queue) {
            int i14 = this.__bytesAvailable;
            i12 = i11;
            if (i11 > i14) {
                i12 = i14;
            }
        }
        int read = read();
        if (read == -1) {
            return -1;
        }
        int i15 = i10;
        while (true) {
            int i16 = i15;
            i13 = i16 + 1;
            bArr[i16] = (byte) read;
            i12--;
            if (i12 <= 0) {
                break;
            }
            read = read();
            if (read == -1) {
                break;
            }
            i15 = i13;
        }
        return i13 - i10;
    }

    @Override // java.lang.Runnable
    public void run() {
        int __read;
        boolean z10;
        while (!this.__isClosed) {
            try {
                try {
                    __read = __read(true);
                } catch (InterruptedIOException e10) {
                    synchronized (this.__queue) {
                        this.__ioException = e10;
                        this.__queue.notifyAll();
                        try {
                            this.__queue.wait(100L);
                        } catch (InterruptedException e11) {
                            if (this.__isClosed) {
                                break;
                            }
                        }
                    }
                } catch (RuntimeException e12) {
                    super.close();
                }
                if (__read < 0) {
                    break;
                }
                try {
                    z10 = __processChar(__read);
                } catch (InterruptedException e13) {
                    if (this.__isClosed) {
                        break;
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    this.__client.notifyInputListener();
                }
            } catch (IOException e14) {
                synchronized (this.__queue) {
                    this.__ioException = e14;
                    this.__client.notifyInputListener();
                }
            }
        }
        synchronized (this.__queue) {
            this.__isClosed = true;
            this.__hasReachedEOF = true;
            this.__queue.notify();
        }
        this.__threaded = false;
    }
}

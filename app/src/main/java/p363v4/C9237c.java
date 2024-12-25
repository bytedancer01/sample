package p363v4;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:v4/c.class
 */
/* renamed from: v4.c */
/* loaded from: combined.jar:classes1.jar:v4/c.class */
public class C9237c extends InputStream {

    /* renamed from: d */
    public static final Queue<C9237c> f42225d = C9242h.m38965c(0);

    /* renamed from: b */
    public InputStream f42226b;

    /* renamed from: c */
    public IOException f42227c;

    /* renamed from: l */
    public static C9237c m38947l(InputStream inputStream) {
        C9237c poll;
        Queue<C9237c> queue = f42225d;
        synchronized (queue) {
            poll = queue.poll();
        }
        C9237c c9237c = poll;
        if (poll == null) {
            c9237c = new C9237c();
        }
        c9237c.m38950p(inputStream);
        return c9237c;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f42226b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f42226b.close();
    }

    /* renamed from: f */
    public IOException m38948f() {
        return this.f42227c;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f42226b.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f42226b.markSupported();
    }

    /* renamed from: o */
    public void m38949o() {
        this.f42227c = null;
        this.f42226b = null;
        Queue<C9237c> queue = f42225d;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    /* renamed from: p */
    public void m38950p(InputStream inputStream) {
        this.f42226b = inputStream;
    }

    @Override // java.io.InputStream
    public int read() {
        int i10;
        try {
            i10 = this.f42226b.read();
        } catch (IOException e10) {
            this.f42227c = e10;
            i10 = -1;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        int i10;
        try {
            i10 = this.f42226b.read(bArr);
        } catch (IOException e10) {
            this.f42227c = e10;
            i10 = -1;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int i12;
        try {
            i12 = this.f42226b.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f42227c = e10;
            i12 = -1;
        }
        return i12;
    }

    @Override // java.io.InputStream
    public void reset() {
        synchronized (this) {
            this.f42226b.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        long j11;
        try {
            j11 = this.f42226b.skip(j10);
        } catch (IOException e10) {
            this.f42227c = e10;
            j11 = 0;
        }
        return j11;
    }
}

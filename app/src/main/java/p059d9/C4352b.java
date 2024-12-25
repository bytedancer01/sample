package p059d9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/b.class
 */
/* renamed from: d9.b */
/* loaded from: combined.jar:classes2.jar:d9/b.class */
public final class C4352b {

    /* renamed from: a */
    public final File f26540a;

    /* renamed from: b */
    public final File f26541b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:d9/b$a.class
     */
    /* renamed from: d9.b$a */
    /* loaded from: combined.jar:classes2.jar:d9/b$a.class */
    public static final class a extends OutputStream {

        /* renamed from: b */
        public final FileOutputStream f26542b;

        /* renamed from: c */
        public boolean f26543c = false;

        public a(File file) {
            this.f26542b = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f26543c) {
                return;
            }
            this.f26543c = true;
            flush();
            try {
                this.f26542b.getFD().sync();
            } catch (IOException e10) {
                C4392v.m22276j("AtomicFile", "Failed to sync file descriptor:", e10);
            }
            this.f26542b.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            this.f26542b.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            this.f26542b.write(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            this.f26542b.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            this.f26542b.write(bArr, i10, i11);
        }
    }

    public C4352b(File file) {
        this.f26540a = file;
        this.f26541b = new File(file.getPath() + ".bak");
    }

    /* renamed from: a */
    public void m21907a() {
        this.f26540a.delete();
        this.f26541b.delete();
    }

    /* renamed from: b */
    public void m21908b(OutputStream outputStream) {
        outputStream.close();
        this.f26541b.delete();
    }

    /* renamed from: c */
    public boolean m21909c() {
        return this.f26540a.exists() || this.f26541b.exists();
    }

    /* renamed from: d */
    public InputStream m21910d() {
        m21911e();
        return new FileInputStream(this.f26540a);
    }

    /* renamed from: e */
    public final void m21911e() {
        if (this.f26541b.exists()) {
            this.f26540a.delete();
            this.f26541b.renameTo(this.f26540a);
        }
    }

    /* renamed from: f */
    public OutputStream m21912f() {
        a aVar;
        if (this.f26540a.exists()) {
            if (this.f26541b.exists()) {
                this.f26540a.delete();
            } else if (!this.f26540a.renameTo(this.f26541b)) {
                C4392v.m22275i("AtomicFile", "Couldn't rename file " + this.f26540a + " to backup file " + this.f26541b);
            }
        }
        try {
            aVar = new a(this.f26540a);
        } catch (FileNotFoundException e10) {
            File parentFile = this.f26540a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + this.f26540a, e10);
            }
            try {
                aVar = new a(this.f26540a);
            } catch (FileNotFoundException e11) {
                throw new IOException("Couldn't create " + this.f26540a, e11);
            }
        }
        return aVar;
    }
}

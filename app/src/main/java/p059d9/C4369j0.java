package p059d9;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/j0.class
 */
/* renamed from: d9.j0 */
/* loaded from: combined.jar:classes2.jar:d9/j0.class */
public final class C4369j0 extends BufferedOutputStream {

    /* renamed from: b */
    public boolean f26592b;

    public C4369j0(OutputStream outputStream) {
        super(outputStream);
    }

    public C4369j0(OutputStream outputStream, int i10) {
        super(outputStream, i10);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Throwable th2;
        this.f26592b = true;
        try {
            flush();
            th = null;
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            ((BufferedOutputStream) this).out.close();
            th2 = th;
        } catch (Throwable th4) {
            th2 = th;
            if (th == null) {
                th2 = th4;
            }
        }
        if (th2 != null) {
            C4401z0.m22352T0(th2);
        }
    }

    /* renamed from: f */
    public void m22053f(OutputStream outputStream) {
        C4349a.m21884g(this.f26592b);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f26592b = false;
    }
}

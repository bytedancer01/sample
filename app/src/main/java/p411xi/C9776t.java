package p411xi;

import java.io.OutputStream;
import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xi/t.class
 */
/* renamed from: xi.t */
/* loaded from: combined.jar:classes2.jar:xi/t.class */
public final class C9776t implements InterfaceC9782z {

    /* renamed from: b */
    public final OutputStream f44556b;

    /* renamed from: c */
    public final C9758c0 f44557c;

    public C9776t(@NotNull OutputStream outputStream, @NotNull C9758c0 c9758c0) {
        C9367f.m39526e(outputStream, "out");
        C9367f.m39526e(c9758c0, "timeout");
        this.f44556b = outputStream;
        this.f44557c = c9758c0;
    }

    @Override // p411xi.InterfaceC9782z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f44556b.close();
    }

    @Override // p411xi.InterfaceC9782z, java.io.Flushable
    public void flush() {
        this.f44556b.flush();
    }

    @Override // p411xi.InterfaceC9782z
    /* renamed from: h */
    public void mo32031h(@NotNull C9761e c9761e, long j10) {
        C9367f.m39526e(c9761e, "source");
        C9757c.m41081b(c9761e.size(), 0L, j10);
        while (j10 > 0) {
            this.f44557c.mo41091f();
            C9779w c9779w = c9761e.f44519b;
            C9367f.m39524c(c9779w);
            int min = (int) Math.min(j10, c9779w.f44568c - c9779w.f44567b);
            this.f44556b.write(c9779w.f44566a, c9779w.f44567b, min);
            c9779w.f44567b += min;
            long j11 = min;
            long j12 = j10 - j11;
            c9761e.m41137Q0(c9761e.size() - j11);
            j10 = j12;
            if (c9779w.f44567b == c9779w.f44568c) {
                c9761e.f44519b = c9779w.m41267b();
                C9780x.m41273b(c9779w);
                j10 = j12;
            }
        }
    }

    @Override // p411xi.InterfaceC9782z
    @NotNull
    public C9758c0 timeout() {
        return this.f44557c;
    }

    @NotNull
    public String toString() {
        return "sink(" + this.f44556b + ')';
    }
}

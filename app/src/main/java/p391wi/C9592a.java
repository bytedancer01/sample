package p391wi;

import java.io.Closeable;
import java.util.zip.Deflater;
import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;
import p411xi.C9761e;
import p411xi.C9764h;
import p411xi.C9765i;
import p411xi.InterfaceC9782z;
import th.C8749a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:wi/a.class
 */
/* renamed from: wi.a */
/* loaded from: combined.jar:classes2.jar:wi/a.class */
public final class C9592a implements Closeable {

    /* renamed from: b */
    public final C9761e f43756b;

    /* renamed from: c */
    public final Deflater f43757c;

    /* renamed from: d */
    public final C9765i f43758d;

    /* renamed from: e */
    public final boolean f43759e;

    public C9592a(boolean z10) {
        this.f43759e = z10;
        C9761e c9761e = new C9761e();
        this.f43756b = c9761e;
        Deflater deflater = new Deflater(-1, true);
        this.f43757c = deflater;
        this.f43758d = new C9765i((InterfaceC9782z) c9761e, deflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f43758d.close();
    }

    /* renamed from: f */
    public final void m40395f(@NotNull C9761e c9761e) {
        C9764h c9764h;
        C9367f.m39526e(c9761e, "buffer");
        if (!(this.f43756b.size() == 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.f43759e) {
            this.f43757c.reset();
        }
        this.f43758d.mo32031h(c9761e, c9761e.size());
        this.f43758d.flush();
        C9761e c9761e2 = this.f43756b;
        c9764h = C9593b.f43760a;
        if (m40396l(c9761e2, c9764h)) {
            long size = this.f43756b.size();
            long j10 = 4;
            C9761e.a m41117I0 = C9761e.m41117I0(this.f43756b, null, 1, null);
            try {
                m41117I0.m41180l(size - j10);
                C8749a.m37542a(m41117I0, null);
            } finally {
            }
        } else {
            this.f43756b.writeByte(0);
        }
        C9761e c9761e3 = this.f43756b;
        c9761e.mo32031h(c9761e3, c9761e3.size());
    }

    /* renamed from: l */
    public final boolean m40396l(C9761e c9761e, C9764h c9764h) {
        return c9761e.m41123F0(c9761e.size() - c9764h.size(), c9764h);
    }
}

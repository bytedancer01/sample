package p391wi;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9367f;
import p411xi.C9761e;
import p411xi.C9764h;
import p411xi.InterfaceC9762f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:wi/h.class
 */
/* renamed from: wi.h */
/* loaded from: combined.jar:classes2.jar:wi/h.class */
public final class C9599h implements Closeable {

    /* renamed from: b */
    public final C9761e f43844b;

    /* renamed from: c */
    public final C9761e f43845c;

    /* renamed from: d */
    public boolean f43846d;

    /* renamed from: e */
    public C9592a f43847e;

    /* renamed from: f */
    public final byte[] f43848f;

    /* renamed from: g */
    public final C9761e.a f43849g;

    /* renamed from: h */
    public final boolean f43850h;

    /* renamed from: i */
    @NotNull
    public final InterfaceC9762f f43851i;

    /* renamed from: j */
    @NotNull
    public final Random f43852j;

    /* renamed from: k */
    public final boolean f43853k;

    /* renamed from: l */
    public final boolean f43854l;

    /* renamed from: m */
    public final long f43855m;

    public C9599h(boolean z10, @NotNull InterfaceC9762f interfaceC9762f, @NotNull Random random, boolean z11, boolean z12, long j10) {
        C9367f.m39526e(interfaceC9762f, "sink");
        C9367f.m39526e(random, "random");
        this.f43850h = z10;
        this.f43851i = interfaceC9762f;
        this.f43852j = random;
        this.f43853k = z11;
        this.f43854l = z12;
        this.f43855m = j10;
        this.f43844b = new C9761e();
        this.f43845c = interfaceC9762f.getBuffer();
        this.f43848f = z10 ? new byte[4] : null;
        this.f43849g = z10 ? new C9761e.a() : null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C9592a c9592a = this.f43847e;
        if (c9592a != null) {
            c9592a.close();
        }
    }

    /* renamed from: f */
    public final void m40439f(int i10, @Nullable C9764h c9764h) {
        C9764h c9764h2 = C9764h.f44530e;
        if (i10 != 0 || c9764h != null) {
            if (i10 != 0) {
                C9597f.f43827a.m40432c(i10);
            }
            C9761e c9761e = new C9761e();
            c9761e.writeShort(i10);
            if (c9764h != null) {
                c9761e.mo41162i0(c9764h);
            }
            c9764h2 = c9761e.m41129K0();
        }
        try {
            m40440l(8, c9764h2);
        } finally {
            this.f43846d = true;
        }
    }

    /* renamed from: l */
    public final void m40440l(int i10, C9764h c9764h) {
        if (this.f43846d) {
            throw new IOException("closed");
        }
        int size = c9764h.size();
        if (!(((long) size) <= 125)) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        this.f43845c.writeByte(i10 | 128);
        if (this.f43850h) {
            this.f43845c.writeByte(size | 128);
            Random random = this.f43852j;
            byte[] bArr = this.f43848f;
            C9367f.m39524c(bArr);
            random.nextBytes(bArr);
            this.f43845c.write(this.f43848f);
            if (size > 0) {
                long size2 = this.f43845c.size();
                this.f43845c.mo41162i0(c9764h);
                C9761e c9761e = this.f43845c;
                C9761e.a aVar = this.f43849g;
                C9367f.m39524c(aVar);
                c9761e.m41126H0(aVar);
                this.f43849g.m41181o(size2);
                C9597f.f43827a.m40431b(this.f43849g, this.f43848f);
                this.f43849g.close();
            }
        } else {
            this.f43845c.writeByte(size);
            this.f43845c.mo41162i0(c9764h);
        }
        this.f43851i.flush();
    }

    /* renamed from: o */
    public final void m40441o(int i10, @NotNull C9764h c9764h) {
        C9367f.m39526e(c9764h, "data");
        if (this.f43846d) {
            throw new IOException("closed");
        }
        this.f43844b.mo41162i0(c9764h);
        int i11 = i10 | 128;
        int i12 = i11;
        if (this.f43853k) {
            i12 = i11;
            if (c9764h.size() >= this.f43855m) {
                C9592a c9592a = this.f43847e;
                if (c9592a == null) {
                    c9592a = new C9592a(this.f43854l);
                    this.f43847e = c9592a;
                }
                c9592a.m40395f(this.f43844b);
                i12 = i11 | 64;
            }
        }
        long size = this.f43844b.size();
        this.f43845c.writeByte(i12);
        int i13 = this.f43850h ? 128 : 0;
        if (size <= 125) {
            this.f43845c.writeByte(((int) size) | i13);
        } else if (size <= 65535) {
            this.f43845c.writeByte(i13 | 126);
            this.f43845c.writeShort((int) size);
        } else {
            this.f43845c.writeByte(i13 | 127);
            this.f43845c.m41152b1(size);
        }
        if (this.f43850h) {
            Random random = this.f43852j;
            byte[] bArr = this.f43848f;
            C9367f.m39524c(bArr);
            random.nextBytes(bArr);
            this.f43845c.write(this.f43848f);
            if (size > 0) {
                C9761e c9761e = this.f43844b;
                C9761e.a aVar = this.f43849g;
                C9367f.m39524c(aVar);
                c9761e.m41126H0(aVar);
                this.f43849g.m41181o(0L);
                C9597f.f43827a.m40431b(this.f43849g, this.f43848f);
                this.f43849g.close();
            }
        }
        this.f43845c.mo32031h(this.f43844b, size);
        this.f43851i.mo41124G();
    }

    /* renamed from: p */
    public final void m40442p(@NotNull C9764h c9764h) {
        C9367f.m39526e(c9764h, "payload");
        m40440l(9, c9764h);
    }

    /* renamed from: q */
    public final void m40443q(@NotNull C9764h c9764h) {
        C9367f.m39526e(c9764h, "payload");
        m40440l(10, c9764h);
    }
}

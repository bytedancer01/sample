package p312ri;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ki.C5634b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p312ri.C8478d;
import p372vh.C9365d;
import p372vh.C9367f;
import p411xi.C9761e;
import p411xi.InterfaceC9762f;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ri/j.class
 */
/* renamed from: ri.j */
/* loaded from: combined.jar:classes2.jar:ri/j.class */
public final class C8484j implements Closeable {

    /* renamed from: b */
    public final C9761e f39774b;

    /* renamed from: c */
    public int f39775c;

    /* renamed from: d */
    public boolean f39776d;

    /* renamed from: e */
    @NotNull
    public final C8478d.b f39777e;

    /* renamed from: f */
    public final InterfaceC9762f f39778f;

    /* renamed from: g */
    public final boolean f39779g;

    /* renamed from: i */
    public static final a f39773i = new a(null);

    /* renamed from: h */
    public static final Logger f39772h = Logger.getLogger(C8479e.class.getName());

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ri/j$a.class
     */
    /* renamed from: ri.j$a */
    /* loaded from: combined.jar:classes2.jar:ri/j$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }
    }

    public C8484j(@NotNull InterfaceC9762f interfaceC9762f, boolean z10) {
        C9367f.m39526e(interfaceC9762f, "sink");
        this.f39778f = interfaceC9762f;
        this.f39779g = z10;
        C9761e c9761e = new C9761e();
        this.f39774b = c9761e;
        this.f39775c = 16384;
        this.f39777e = new C8478d.b(0, false, c9761e, 3, null);
    }

    /* renamed from: J */
    public final void m36581J() {
        synchronized (this) {
            if (this.f39776d) {
                throw new IOException("closed");
            }
            if (this.f39779g) {
                Logger logger = f39772h;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C5634b.m27797q(">> CONNECTION " + C8479e.f39610a.mo41198p(), new Object[0]));
                }
                this.f39778f.mo41162i0(C8479e.f39610a);
                this.f39778f.flush();
            }
        }
    }

    /* renamed from: a */
    public final void m36582a(int i10, long j10) {
        synchronized (this) {
            if (this.f39776d) {
                throw new IOException("closed");
            }
            if (!(j10 != 0 && j10 <= 2147483647L)) {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10).toString());
            }
            m36589o(i10, 4, 8, 0);
            this.f39778f.writeInt((int) j10);
            this.f39778f.flush();
        }
    }

    /* renamed from: a0 */
    public final int m36583a0() {
        return this.f39775c;
    }

    /* renamed from: b */
    public final void m36584b(int i10, int i11, @NotNull List<C8477c> list) {
        synchronized (this) {
            C9367f.m39526e(list, "requestHeaders");
            if (this.f39776d) {
                throw new IOException("closed");
            }
            this.f39777e.m36428g(list);
            long size = this.f39774b.size();
            int min = (int) Math.min(this.f39775c - 4, size);
            long j10 = min;
            m36589o(i10, min + 4, 5, size == j10 ? 4 : 0);
            this.f39778f.writeInt(i11 & Integer.MAX_VALUE);
            this.f39778f.mo32031h(this.f39774b, j10);
            if (size > j10) {
                m36594w(i10, size - j10);
            }
        }
    }

    /* renamed from: c */
    public final void m36585c(boolean z10, int i10, int i11) {
        synchronized (this) {
            if (this.f39776d) {
                throw new IOException("closed");
            }
            m36589o(0, 8, 6, z10 ? 1 : 0);
            this.f39778f.writeInt(i10);
            this.f39778f.writeInt(i11);
            this.f39778f.flush();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            this.f39776d = true;
            this.f39778f.close();
        }
    }

    /* renamed from: f */
    public final void m36586f(@NotNull C8487m c8487m) {
        synchronized (this) {
            C9367f.m39526e(c8487m, "peerSettings");
            if (this.f39776d) {
                throw new IOException("closed");
            }
            this.f39775c = c8487m.m36610e(this.f39775c);
            if (c8487m.m36607b() != -1) {
                this.f39777e.m36426e(c8487m.m36607b());
            }
            m36589o(0, 0, 4, 1);
            this.f39778f.flush();
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.f39776d) {
                throw new IOException("closed");
            }
            this.f39778f.flush();
        }
    }

    /* renamed from: j */
    public final void m36587j(boolean z10, int i10, @Nullable C9761e c9761e, int i11) {
        synchronized (this) {
            if (this.f39776d) {
                throw new IOException("closed");
            }
            m36588l(i10, z10 ? 1 : 0, c9761e, i11);
        }
    }

    /* renamed from: l */
    public final void m36588l(int i10, int i11, @Nullable C9761e c9761e, int i12) {
        m36589o(i10, i12, 0, i11);
        if (i12 > 0) {
            InterfaceC9762f interfaceC9762f = this.f39778f;
            C9367f.m39524c(c9761e);
            interfaceC9762f.mo32031h(c9761e, i12);
        }
    }

    /* renamed from: o */
    public final void m36589o(int i10, int i11, int i12, int i13) {
        Logger logger = f39772h;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C8479e.f39614e.m36432c(false, i10, i11, i12, i13));
        }
        if (!(i11 <= this.f39775c)) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f39775c + ": " + i11).toString());
        }
        if (!((((int) IjkMediaMeta.AV_CH_WIDE_LEFT) & i10) == 0)) {
            throw new IllegalArgumentException(("reserved bit set: " + i10).toString());
        }
        C5634b.m27780X(this.f39778f, i11);
        this.f39778f.writeByte(i12 & 255);
        this.f39778f.writeByte(i13 & 255);
        this.f39778f.writeInt(i10 & Integer.MAX_VALUE);
    }

    /* renamed from: p */
    public final void m36590p(int i10, @NotNull EnumC8476b enumC8476b, @NotNull byte[] bArr) {
        synchronized (this) {
            C9367f.m39526e(enumC8476b, "errorCode");
            C9367f.m39526e(bArr, "debugData");
            if (this.f39776d) {
                throw new IOException("closed");
            }
            if (!(enumC8476b.getHttpCode() != -1)) {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
            m36589o(0, bArr.length + 8, 7, 0);
            this.f39778f.writeInt(i10);
            this.f39778f.writeInt(enumC8476b.getHttpCode());
            boolean z10 = false;
            if (bArr.length == 0) {
                z10 = true;
            }
            if (!z10) {
                this.f39778f.write(bArr);
            }
            this.f39778f.flush();
        }
    }

    /* renamed from: q */
    public final void m36591q(boolean z10, int i10, @NotNull List<C8477c> list) {
        synchronized (this) {
            C9367f.m39526e(list, "headerBlock");
            if (this.f39776d) {
                throw new IOException("closed");
            }
            this.f39777e.m36428g(list);
            long size = this.f39774b.size();
            long min = Math.min(this.f39775c, size);
            int i11 = size == min ? 4 : 0;
            int i12 = i11;
            if (z10) {
                i12 = i11 | 1;
            }
            m36589o(i10, (int) min, 1, i12);
            this.f39778f.mo32031h(this.f39774b, min);
            if (size > min) {
                m36594w(i10, size - min);
            }
        }
    }

    /* renamed from: t */
    public final void m36592t(int i10, @NotNull EnumC8476b enumC8476b) {
        synchronized (this) {
            C9367f.m39526e(enumC8476b, "errorCode");
            if (this.f39776d) {
                throw new IOException("closed");
            }
            if (!(enumC8476b.getHttpCode() != -1)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            m36589o(i10, 4, 3, 0);
            this.f39778f.writeInt(enumC8476b.getHttpCode());
            this.f39778f.flush();
        }
    }

    /* renamed from: v */
    public final void m36593v(@NotNull C8487m c8487m) {
        synchronized (this) {
            C9367f.m39526e(c8487m, "settings");
            if (this.f39776d) {
                throw new IOException("closed");
            }
            int i10 = 0;
            m36589o(0, c8487m.m36614i() * 6, 4, 0);
            while (i10 < 10) {
                if (c8487m.m36611f(i10)) {
                    this.f39778f.writeShort(i10 != 4 ? i10 != 7 ? i10 : 4 : 3);
                    this.f39778f.writeInt(c8487m.m36606a(i10));
                }
                i10++;
            }
            this.f39778f.flush();
        }
    }

    /* renamed from: w */
    public final void m36594w(int i10, long j10) {
        while (j10 > 0) {
            long min = Math.min(this.f39775c, j10);
            j10 -= min;
            m36589o(i10, (int) min, 9, j10 == 0 ? 4 : 0);
            this.f39778f.mo32031h(this.f39774b, min);
        }
    }
}

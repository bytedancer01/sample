package p312ri;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ki.C5634b;
import org.jetbrains.annotations.NotNull;
import p312ri.C8478d;
import p372vh.C9365d;
import p372vh.C9367f;
import p411xi.C9758c0;
import p411xi.C9761e;
import p411xi.C9764h;
import p411xi.InterfaceC9756b0;
import p411xi.InterfaceC9763g;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ri/h.class
 */
/* renamed from: ri.h */
/* loaded from: combined.jar:classes2.jar:ri/h.class */
public final class C8482h implements Closeable {

    /* renamed from: f */
    @NotNull
    public static final Logger f39732f;

    /* renamed from: g */
    public static final a f39733g = new a(null);

    /* renamed from: b */
    public final b f39734b;

    /* renamed from: c */
    public final C8478d.a f39735c;

    /* renamed from: d */
    public final InterfaceC9763g f39736d;

    /* renamed from: e */
    public final boolean f39737e;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ri/h$a.class
     */
    /* renamed from: ri.h$a */
    /* loaded from: combined.jar:classes2.jar:ri/h$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final Logger m36530a() {
            return C8482h.f39732f;
        }

        /* renamed from: b */
        public final int m36531b(int i10, int i11, int i12) {
            int i13 = i10;
            if ((i11 & 8) != 0) {
                i13 = i10 - 1;
            }
            if (i12 <= i13) {
                return i13 - i12;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i12 + " > remaining length " + i13);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ri/h$b.class
     */
    /* renamed from: ri.h$b */
    /* loaded from: combined.jar:classes2.jar:ri/h$b.class */
    public static final class b implements InterfaceC9756b0 {

        /* renamed from: b */
        public int f39738b;

        /* renamed from: c */
        public int f39739c;

        /* renamed from: d */
        public int f39740d;

        /* renamed from: e */
        public int f39741e;

        /* renamed from: f */
        public int f39742f;

        /* renamed from: g */
        public final InterfaceC9763g f39743g;

        public b(@NotNull InterfaceC9763g interfaceC9763g) {
            C9367f.m39526e(interfaceC9763g, "source");
            this.f39743g = interfaceC9763g;
        }

        @Override // p411xi.InterfaceC9756b0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        /* renamed from: f */
        public final int m36532f() {
            return this.f39741e;
        }

        /* renamed from: l */
        public final void m36533l() {
            int i10 = this.f39740d;
            int m27763G = C5634b.m27763G(this.f39743g);
            this.f39741e = m27763G;
            this.f39738b = m27763G;
            int m27782b = C5634b.m27782b(this.f39743g.readByte(), 255);
            this.f39739c = C5634b.m27782b(this.f39743g.readByte(), 255);
            a aVar = C8482h.f39733g;
            if (aVar.m36530a().isLoggable(Level.FINE)) {
                aVar.m36530a().fine(C8479e.f39614e.m36432c(true, this.f39740d, this.f39738b, m27782b, this.f39739c));
            }
            int readInt = this.f39743g.readInt() & Integer.MAX_VALUE;
            this.f39740d = readInt;
            if (m27782b == 9) {
                if (readInt != i10) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(m27782b + " != TYPE_CONTINUATION");
            }
        }

        /* renamed from: o */
        public final void m36534o(int i10) {
            this.f39739c = i10;
        }

        /* renamed from: p */
        public final void m36535p(int i10) {
            this.f39741e = i10;
        }

        /* renamed from: q */
        public final void m36536q(int i10) {
            this.f39738b = i10;
        }

        /* renamed from: t */
        public final void m36537t(int i10) {
            this.f39742f = i10;
        }

        @Override // p411xi.InterfaceC9756b0
        @NotNull
        public C9758c0 timeout() {
            return this.f39743g.timeout();
        }

        /* renamed from: v */
        public final void m36538v(int i10) {
            this.f39740d = i10;
        }

        @Override // p411xi.InterfaceC9756b0
        /* renamed from: x */
        public long mo22901x(@NotNull C9761e c9761e, long j10) {
            C9367f.m39526e(c9761e, "sink");
            while (true) {
                int i10 = this.f39741e;
                if (i10 != 0) {
                    long mo22901x = this.f39743g.mo22901x(c9761e, Math.min(j10, i10));
                    if (mo22901x == -1) {
                        return -1L;
                    }
                    this.f39741e -= (int) mo22901x;
                    return mo22901x;
                }
                this.f39743g.skip(this.f39742f);
                this.f39742f = 0;
                if ((this.f39739c & 4) != 0) {
                    return -1L;
                }
                m36533l();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ri/h$c.class
     */
    /* renamed from: ri.h$c */
    /* loaded from: combined.jar:classes2.jar:ri/h$c.class */
    public interface c {
        /* renamed from: a */
        void mo36500a(int i10, long j10);

        /* renamed from: b */
        void mo36501b(int i10, int i11, @NotNull List<C8477c> list);

        /* renamed from: c */
        void mo36502c(boolean z10, int i10, int i11);

        /* renamed from: e */
        void mo36503e();

        /* renamed from: f */
        void mo36504f(int i10, int i11, int i12, boolean z10);

        /* renamed from: g */
        void mo36505g(boolean z10, int i10, @NotNull InterfaceC9763g interfaceC9763g, int i11);

        /* renamed from: i */
        void mo36506i(boolean z10, int i10, int i11, @NotNull List<C8477c> list);

        /* renamed from: j */
        void mo36507j(boolean z10, @NotNull C8487m c8487m);

        /* renamed from: k */
        void mo36508k(int i10, @NotNull EnumC8476b enumC8476b, @NotNull C9764h c9764h);

        /* renamed from: n */
        void mo36509n(int i10, @NotNull EnumC8476b enumC8476b);
    }

    static {
        Logger logger = Logger.getLogger(C8479e.class.getName());
        C9367f.m39525d(logger, "Logger.getLogger(Http2::class.java.name)");
        f39732f = logger;
    }

    public C8482h(@NotNull InterfaceC9763g interfaceC9763g, boolean z10) {
        C9367f.m39526e(interfaceC9763g, "source");
        this.f39736d = interfaceC9763g;
        this.f39737e = z10;
        b bVar = new b(interfaceC9763g);
        this.f39734b = bVar;
        this.f39735c = new C8478d.a(bVar, 4096, 0, 4, null);
    }

    /* renamed from: A0 */
    public final void m36517A0(c cVar, int i10, int i11, int i12) {
        if (i10 != 4) {
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i10);
        }
        long m27784d = C5634b.m27784d(this.f39736d.readInt(), 2147483647L);
        if (m27784d == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        cVar.mo36500a(i12, m27784d);
    }

    /* renamed from: B */
    public final void m36518B(c cVar, int i10, int i11, int i12) {
        if (i10 == 5) {
            if (i12 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            m36529y(cVar, i12);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i10 + " != 5");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f39736d.close();
    }

    /* renamed from: l */
    public final boolean m36519l(boolean z10, @NotNull c cVar) {
        C9367f.m39526e(cVar, "handler");
        try {
            this.f39736d.mo41151b0(9L);
            int m27763G = C5634b.m27763G(this.f39736d);
            if (m27763G > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + m27763G);
            }
            int m27782b = C5634b.m27782b(this.f39736d.readByte(), 255);
            int m27782b2 = C5634b.m27782b(this.f39736d.readByte(), 255);
            int readInt = this.f39736d.readInt() & Integer.MAX_VALUE;
            Logger logger = f39732f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C8479e.f39614e.m36432c(true, readInt, m27763G, m27782b, m27782b2));
            }
            if (z10 && m27782b != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + C8479e.f39614e.m36431b(m27782b));
            }
            switch (m27782b) {
                case 0:
                    m36522p(cVar, m27763G, m27782b2, readInt);
                    return true;
                case 1:
                    m36526v(cVar, m27763G, m27782b2, readInt);
                    return true;
                case 2:
                    m36518B(cVar, m27763G, m27782b2, readInt);
                    return true;
                case 3:
                    m36524q0(cVar, m27763G, m27782b2, readInt);
                    return true;
                case 4:
                    m36527v0(cVar, m27763G, m27782b2, readInt);
                    return true;
                case 5:
                    m36521o0(cVar, m27763G, m27782b2, readInt);
                    return true;
                case 6:
                    m36528w(cVar, m27763G, m27782b2, readInt);
                    return true;
                case 7:
                    m36523q(cVar, m27763G, m27782b2, readInt);
                    return true;
                case 8:
                    m36517A0(cVar, m27763G, m27782b2, readInt);
                    return true;
                default:
                    this.f39736d.skip(m27763G);
                    return true;
            }
        } catch (EOFException e10) {
            return false;
        }
    }

    /* renamed from: o */
    public final void m36520o(@NotNull c cVar) {
        C9367f.m39526e(cVar, "handler");
        if (this.f39737e) {
            if (!m36519l(true, cVar)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        InterfaceC9763g interfaceC9763g = this.f39736d;
        C9764h c9764h = C8479e.f39610a;
        C9764h mo41159g0 = interfaceC9763g.mo41159g0(c9764h.size());
        Logger logger = f39732f;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C5634b.m27797q("<< CONNECTION " + mo41159g0.mo41198p(), new Object[0]));
        }
        if (!C9367f.m39522a(c9764h, mo41159g0)) {
            throw new IOException("Expected a connection header but was " + mo41159g0.m41188D());
        }
    }

    /* renamed from: o0 */
    public final void m36521o0(c cVar, int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int m27782b = (i11 & 8) != 0 ? C5634b.m27782b(this.f39736d.readByte(), 255) : 0;
        cVar.mo36501b(i12, this.f39736d.readInt() & Integer.MAX_VALUE, m36525t(f39733g.m36531b(i10 - 4, i11, m27782b), m27782b, i11, i12));
    }

    /* renamed from: p */
    public final void m36522p(c cVar, int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z10 = true;
        boolean z11 = (i11 & 1) != 0;
        if ((i11 & 32) == 0) {
            z10 = false;
        }
        if (z10) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int i13 = 0;
        if ((i11 & 8) != 0) {
            i13 = C5634b.m27782b(this.f39736d.readByte(), 255);
        }
        cVar.mo36505g(z11, i12, this.f39736d, f39733g.m36531b(i10, i11, i13));
        this.f39736d.skip(i13);
    }

    /* renamed from: q */
    public final void m36523q(c cVar, int i10, int i11, int i12) {
        if (i10 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i10);
        }
        if (i12 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int readInt = this.f39736d.readInt();
        int readInt2 = this.f39736d.readInt();
        int i13 = i10 - 8;
        EnumC8476b m36398a = EnumC8476b.Companion.m36398a(readInt2);
        if (m36398a == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + readInt2);
        }
        C9764h c9764h = C9764h.f44530e;
        if (i13 > 0) {
            c9764h = this.f39736d.mo41159g0(i13);
        }
        cVar.mo36508k(readInt, m36398a, c9764h);
    }

    /* renamed from: q0 */
    public final void m36524q0(c cVar, int i10, int i11, int i12) {
        if (i10 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i10 + " != 4");
        }
        if (i12 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int readInt = this.f39736d.readInt();
        EnumC8476b m36398a = EnumC8476b.Companion.m36398a(readInt);
        if (m36398a != null) {
            cVar.mo36509n(i12, m36398a);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + readInt);
    }

    /* renamed from: t */
    public final List<C8477c> m36525t(int i10, int i11, int i12, int i13) {
        this.f39734b.m36535p(i10);
        b bVar = this.f39734b;
        bVar.m36536q(bVar.m36532f());
        this.f39734b.m36537t(i11);
        this.f39734b.m36534o(i12);
        this.f39734b.m36538v(i13);
        this.f39735c.m36415k();
        return this.f39735c.m36409e();
    }

    /* renamed from: v */
    public final void m36526v(c cVar, int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        int i13 = 0;
        boolean z10 = (i11 & 1) != 0;
        if ((i11 & 8) != 0) {
            i13 = C5634b.m27782b(this.f39736d.readByte(), 255);
        }
        int i14 = i10;
        if ((i11 & 32) != 0) {
            m36529y(cVar, i12);
            i14 = i10 - 5;
        }
        cVar.mo36506i(z10, i12, -1, m36525t(f39733g.m36531b(i14, i11, i13), i13, i11, i12));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d7, code lost:
    
        throw new java.io.IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + r0);
     */
    /* renamed from: v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m36527v0(p312ri.C8482h.c r5, int r6, int r7, int r8) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p312ri.C8482h.m36527v0(ri.h$c, int, int, int):void");
    }

    /* renamed from: w */
    public final void m36528w(c cVar, int i10, int i11, int i12) {
        if (i10 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i10);
        }
        if (i12 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        int readInt = this.f39736d.readInt();
        int readInt2 = this.f39736d.readInt();
        boolean z10 = true;
        if ((i11 & 1) == 0) {
            z10 = false;
        }
        cVar.mo36502c(z10, readInt, readInt2);
    }

    /* renamed from: y */
    public final void m36529y(c cVar, int i10) {
        int readInt = this.f39736d.readInt();
        cVar.mo36504f(i10, readInt & Integer.MAX_VALUE, C5634b.m27782b(this.f39736d.readByte(), 255) + 1, (readInt & ((int) IjkMediaMeta.AV_CH_WIDE_LEFT)) != 0);
    }
}

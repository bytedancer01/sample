package p391wi;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import ki.C5634b;
import org.jetbrains.annotations.NotNull;
import org.jsoup.parser.CharacterReader;
import p372vh.C9367f;
import p411xi.C9761e;
import p411xi.C9764h;
import p411xi.InterfaceC9763g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:wi/g.class
 */
/* renamed from: wi.g */
/* loaded from: combined.jar:classes2.jar:wi/g.class */
public final class C9598g implements Closeable {

    /* renamed from: b */
    public boolean f43828b;

    /* renamed from: c */
    public int f43829c;

    /* renamed from: d */
    public long f43830d;

    /* renamed from: e */
    public boolean f43831e;

    /* renamed from: f */
    public boolean f43832f;

    /* renamed from: g */
    public boolean f43833g;

    /* renamed from: h */
    public final C9761e f43834h;

    /* renamed from: i */
    public final C9761e f43835i;

    /* renamed from: j */
    public C9594c f43836j;

    /* renamed from: k */
    public final byte[] f43837k;

    /* renamed from: l */
    public final C9761e.a f43838l;

    /* renamed from: m */
    public final boolean f43839m;

    /* renamed from: n */
    @NotNull
    public final InterfaceC9763g f43840n;

    /* renamed from: o */
    public final a f43841o;

    /* renamed from: p */
    public final boolean f43842p;

    /* renamed from: q */
    public final boolean f43843q;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:wi/g$a.class
     */
    /* renamed from: wi.g$a */
    /* loaded from: combined.jar:classes2.jar:wi/g$a.class */
    public interface a {
        /* renamed from: b */
        void mo40403b(@NotNull String str);

        /* renamed from: c */
        void mo40404c(@NotNull C9764h c9764h);

        /* renamed from: d */
        void mo40405d(@NotNull C9764h c9764h);

        /* renamed from: e */
        void mo40406e(@NotNull C9764h c9764h);

        /* renamed from: g */
        void mo40407g(int i10, @NotNull String str);
    }

    public C9598g(boolean z10, @NotNull InterfaceC9763g interfaceC9763g, @NotNull a aVar, boolean z11, boolean z12) {
        C9367f.m39526e(interfaceC9763g, "source");
        C9367f.m39526e(aVar, "frameCallback");
        this.f43839m = z10;
        this.f43840n = interfaceC9763g;
        this.f43841o = aVar;
        this.f43842p = z11;
        this.f43843q = z12;
        this.f43834h = new C9761e();
        this.f43835i = new C9761e();
        this.f43837k = z10 ? null : new byte[4];
        this.f43838l = z10 ? null : new C9761e.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C9594c c9594c = this.f43836j;
        if (c9594c != null) {
            c9594c.close();
        }
    }

    /* renamed from: f */
    public final void m40433f() {
        m40435o();
        if (this.f43832f) {
            m40434l();
        } else {
            m40437q();
        }
    }

    /* renamed from: l */
    public final void m40434l() {
        String str;
        long j10 = this.f43830d;
        if (j10 > 0) {
            this.f43840n.mo41163k(this.f43834h, j10);
            if (!this.f43839m) {
                C9761e c9761e = this.f43834h;
                C9761e.a aVar = this.f43838l;
                C9367f.m39524c(aVar);
                c9761e.m41126H0(aVar);
                this.f43838l.m41181o(0L);
                C9597f c9597f = C9597f.f43827a;
                C9761e.a aVar2 = this.f43838l;
                byte[] bArr = this.f43837k;
                C9367f.m39524c(bArr);
                c9597f.m40431b(aVar2, bArr);
                this.f43838l.close();
            }
        }
        switch (this.f43829c) {
            case 8:
                short s10 = 1005;
                long size = this.f43834h.size();
                if (size == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (size != 0) {
                    s10 = this.f43834h.readShort();
                    str = this.f43834h.m41134O0();
                    String m40430a = C9597f.f43827a.m40430a(s10);
                    if (m40430a != null) {
                        throw new ProtocolException(m40430a);
                    }
                } else {
                    str = "";
                }
                this.f43841o.mo40407g(s10, str);
                this.f43828b = true;
                return;
            case 9:
                this.f43841o.mo40404c(this.f43834h.m41129K0());
                return;
            case 10:
                this.f43841o.mo40406e(this.f43834h.m41129K0());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + C5634b.m27769M(this.f43829c));
        }
    }

    /* renamed from: o */
    public final void m40435o() {
        boolean z10;
        if (this.f43828b) {
            throw new IOException("closed");
        }
        long mo41093h = this.f43840n.timeout().mo41093h();
        this.f43840n.timeout().mo41087b();
        try {
            int m27782b = C5634b.m27782b(this.f43840n.readByte(), 255);
            this.f43840n.timeout().mo41092g(mo41093h, TimeUnit.NANOSECONDS);
            int i10 = m27782b & 15;
            this.f43829c = i10;
            boolean z11 = (m27782b & 128) != 0;
            this.f43831e = z11;
            boolean z12 = (m27782b & 8) != 0;
            this.f43832f = z12;
            if (z12 && !z11) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z13 = (m27782b & 64) != 0;
            if (i10 == 1 || i10 == 2) {
                if (!z13) {
                    z10 = false;
                } else {
                    if (!this.f43842p) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z10 = true;
                }
                this.f43833g = z10;
            } else if (z13) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((m27782b & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((m27782b & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int m27782b2 = C5634b.m27782b(this.f43840n.readByte(), 255);
            boolean z14 = false;
            if ((m27782b2 & 128) != 0) {
                z14 = true;
            }
            if (z14 == this.f43839m) {
                throw new ProtocolException(this.f43839m ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j10 = m27782b2 & 127;
            this.f43830d = j10;
            if (j10 == 126) {
                this.f43830d = C5634b.m27783c(this.f43840n.readShort(), CharacterReader.EOF);
            } else if (j10 == 127) {
                long readLong = this.f43840n.readLong();
                this.f43830d = readLong;
                if (readLong < 0) {
                    throw new ProtocolException("Frame length 0x" + C5634b.m27770N(this.f43830d) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.f43832f && this.f43830d > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z14) {
                InterfaceC9763g interfaceC9763g = this.f43840n;
                byte[] bArr = this.f43837k;
                C9367f.m39524c(bArr);
                interfaceC9763g.readFully(bArr);
            }
        } catch (Throwable th2) {
            this.f43840n.timeout().mo41092g(mo41093h, TimeUnit.NANOSECONDS);
            throw th2;
        }
    }

    /* renamed from: p */
    public final void m40436p() {
        while (!this.f43828b) {
            long j10 = this.f43830d;
            if (j10 > 0) {
                this.f43840n.mo41163k(this.f43835i, j10);
                if (!this.f43839m) {
                    C9761e c9761e = this.f43835i;
                    C9761e.a aVar = this.f43838l;
                    C9367f.m39524c(aVar);
                    c9761e.m41126H0(aVar);
                    this.f43838l.m41181o(this.f43835i.size() - this.f43830d);
                    C9597f c9597f = C9597f.f43827a;
                    C9761e.a aVar2 = this.f43838l;
                    byte[] bArr = this.f43837k;
                    C9367f.m39524c(bArr);
                    c9597f.m40431b(aVar2, bArr);
                    this.f43838l.close();
                }
            }
            if (this.f43831e) {
                return;
            }
            m40438t();
            if (this.f43829c != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + C5634b.m27769M(this.f43829c));
            }
        }
        throw new IOException("closed");
    }

    /* renamed from: q */
    public final void m40437q() {
        int i10 = this.f43829c;
        if (i10 != 1 && i10 != 2) {
            throw new ProtocolException("Unknown opcode: " + C5634b.m27769M(i10));
        }
        m40436p();
        if (this.f43833g) {
            C9594c c9594c = this.f43836j;
            if (c9594c == null) {
                c9594c = new C9594c(this.f43843q);
                this.f43836j = c9594c;
            }
            c9594c.m40398f(this.f43835i);
        }
        if (i10 == 1) {
            this.f43841o.mo40403b(this.f43835i.m41134O0());
        } else {
            this.f43841o.mo40405d(this.f43835i.m41129K0());
        }
    }

    /* renamed from: t */
    public final void m40438t() {
        while (!this.f43828b) {
            m40435o();
            if (!this.f43832f) {
                return;
            } else {
                m40434l();
            }
        }
    }
}

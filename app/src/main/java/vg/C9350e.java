package vg;

import java.io.IOException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.net.SocketClient;
import p411xi.C9758c0;
import p411xi.C9761e;
import p411xi.C9772p;
import p411xi.InterfaceC9756b0;
import p411xi.InterfaceC9762f;
import p411xi.InterfaceC9763g;
import p411xi.InterfaceC9782z;
import tg.C8733i;
import tg.C8734j;
import tg.C8739o;
import tg.C8745u;
import ug.AbstractC9177b;
import ug.C9183h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:vg/e.class
 */
/* renamed from: vg.e */
/* loaded from: combined.jar:classes2.jar:vg/e.class */
public final class C9350e {

    /* renamed from: h */
    public static final byte[] f42802h = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: i */
    public static final byte[] f42803i = {48, 13, 10, 13, 10};

    /* renamed from: a */
    public final C8734j f42804a;

    /* renamed from: b */
    public final C8733i f42805b;

    /* renamed from: c */
    public final Socket f42806c;

    /* renamed from: d */
    public final InterfaceC9763g f42807d;

    /* renamed from: e */
    public final InterfaceC9762f f42808e;

    /* renamed from: f */
    public int f42809f = 0;

    /* renamed from: g */
    public int f42810g = 0;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:vg/e$b.class
     */
    /* renamed from: vg.e$b */
    /* loaded from: combined.jar:classes2.jar:vg/e$b.class */
    public class b {

        /* renamed from: b */
        public final InterfaceC9347b f42811b;

        /* renamed from: c */
        public final InterfaceC9782z f42812c;

        /* renamed from: d */
        public boolean f42813d;

        /* renamed from: e */
        public final C9350e f42814e;

        public b(C9350e c9350e, InterfaceC9347b interfaceC9347b) {
            this.f42814e = c9350e;
            InterfaceC9782z body = interfaceC9347b != null ? interfaceC9347b.body() : null;
            interfaceC9347b = body == null ? null : interfaceC9347b;
            this.f42812c = body;
            this.f42811b = interfaceC9347b;
        }

        /* renamed from: f */
        public final void m39429f(C9761e c9761e, long j10) {
            if (this.f42812c != null) {
                C9761e clone = c9761e.clone();
                clone.skip(clone.size() - j10);
                this.f42812c.mo32031h(clone, j10);
            }
        }

        /* renamed from: l */
        public final void m39430l(boolean z10) {
            if (this.f42814e.f42809f != 5) {
                throw new IllegalStateException("state: " + this.f42814e.f42809f);
            }
            if (this.f42811b != null) {
                this.f42812c.close();
            }
            this.f42814e.f42809f = 0;
            if (z10 && this.f42814e.f42810g == 1) {
                this.f42814e.f42810g = 0;
                AbstractC9177b.f41993b.mo37446h(this.f42814e.f42804a, this.f42814e.f42805b);
            } else if (this.f42814e.f42810g == 2) {
                this.f42814e.f42809f = 6;
                this.f42814e.f42805b.m37346h().close();
            }
        }

        /* renamed from: o */
        public final void m39431o() {
            InterfaceC9347b interfaceC9347b = this.f42811b;
            if (interfaceC9347b != null) {
                interfaceC9347b.abort();
            }
            C9183h.m38684d(this.f42814e.f42805b.m37346h());
            this.f42814e.f42809f = 6;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:vg/e$c.class
     */
    /* renamed from: vg.e$c */
    /* loaded from: combined.jar:classes2.jar:vg/e$c.class */
    public final class c implements InterfaceC9782z {

        /* renamed from: b */
        public final byte[] f42815b;

        /* renamed from: c */
        public boolean f42816c;

        /* renamed from: d */
        public final C9350e f42817d;

        public c(C9350e c9350e) {
            this.f42817d = c9350e;
            this.f42815b = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13, 10};
        }

        @Override // p411xi.InterfaceC9782z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (this) {
                if (this.f42816c) {
                    return;
                }
                this.f42816c = true;
                this.f42817d.f42808e.write(C9350e.f42803i);
                this.f42817d.f42809f = 3;
            }
        }

        /* renamed from: f */
        public final void m39432f(long j10) {
            int i10;
            long j11;
            int i11 = 16;
            do {
                i10 = i11 - 1;
                this.f42815b[i10] = C9350e.f42802h[(int) (15 & j10)];
                j11 = j10 >>> 4;
                i11 = i10;
                j10 = j11;
            } while (j11 != 0);
            InterfaceC9762f interfaceC9762f = this.f42817d.f42808e;
            byte[] bArr = this.f42815b;
            interfaceC9762f.write(bArr, i10, bArr.length - i10);
        }

        @Override // p411xi.InterfaceC9782z, java.io.Flushable
        public void flush() {
            synchronized (this) {
                if (this.f42816c) {
                    return;
                }
                this.f42817d.f42808e.flush();
            }
        }

        @Override // p411xi.InterfaceC9782z
        /* renamed from: h */
        public void mo32031h(C9761e c9761e, long j10) {
            if (this.f42816c) {
                throw new IllegalStateException("closed");
            }
            if (j10 == 0) {
                return;
            }
            m39432f(j10);
            this.f42817d.f42808e.mo32031h(c9761e, j10);
            this.f42817d.f42808e.mo41136Q(SocketClient.NETASCII_EOL);
        }

        @Override // p411xi.InterfaceC9782z
        public C9758c0 timeout() {
            return this.f42817d.f42808e.timeout();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:vg/e$d.class
     */
    /* renamed from: vg.e$d */
    /* loaded from: combined.jar:classes2.jar:vg/e$d.class */
    public class d extends b implements InterfaceC9756b0 {

        /* renamed from: f */
        public int f42818f;

        /* renamed from: g */
        public boolean f42819g;

        /* renamed from: h */
        public final C9352g f42820h;

        /* renamed from: i */
        public final C9350e f42821i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C9350e c9350e, InterfaceC9347b interfaceC9347b, C9352g c9352g) {
            super(c9350e, interfaceC9347b);
            this.f42821i = c9350e;
            this.f42818f = -1;
            this.f42819g = true;
            this.f42820h = c9352g;
        }

        @Override // p411xi.InterfaceC9756b0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f42813d) {
                return;
            }
            if (this.f42819g && !this.f42821i.m39415m(this, 100)) {
                m39431o();
            }
            this.f42813d = true;
        }

        /* renamed from: p */
        public final void m39433p() {
            if (this.f42818f != -1) {
                this.f42821i.f42807d.mo41143V();
            }
            String mo41143V = this.f42821i.f42807d.mo41143V();
            int indexOf = mo41143V.indexOf(";");
            String str = mo41143V;
            if (indexOf != -1) {
                str = mo41143V.substring(0, indexOf);
            }
            try {
                int parseInt = Integer.parseInt(str.trim(), 16);
                this.f42818f = parseInt;
                if (parseInt == 0) {
                    this.f42819g = false;
                    C8739o.b bVar = new C8739o.b();
                    this.f42821i.m39426x(bVar);
                    this.f42820h.m39459t(bVar.m37408e());
                    m39430l(true);
                }
            } catch (NumberFormatException e10) {
                throw new ProtocolException("Expected a hex chunk size but was " + str);
            }
        }

        @Override // p411xi.InterfaceC9756b0
        public C9758c0 timeout() {
            return this.f42821i.f42807d.timeout();
        }

        @Override // p411xi.InterfaceC9756b0
        /* renamed from: x */
        public long mo22901x(C9761e c9761e, long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            }
            if (this.f42813d) {
                throw new IllegalStateException("closed");
            }
            if (!this.f42819g) {
                return -1L;
            }
            int i10 = this.f42818f;
            if (i10 == 0 || i10 == -1) {
                m39433p();
                if (!this.f42819g) {
                    return -1L;
                }
            }
            long mo22901x = this.f42821i.f42807d.mo22901x(c9761e, Math.min(j10, this.f42818f));
            if (mo22901x == -1) {
                m39431o();
                throw new IOException("unexpected end of stream");
            }
            this.f42818f = (int) (this.f42818f - mo22901x);
            m39429f(c9761e, mo22901x);
            return mo22901x;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:vg/e$e.class
     */
    /* renamed from: vg.e$e */
    /* loaded from: combined.jar:classes2.jar:vg/e$e.class */
    public final class e implements InterfaceC9782z {

        /* renamed from: b */
        public boolean f42822b;

        /* renamed from: c */
        public long f42823c;

        /* renamed from: d */
        public final C9350e f42824d;

        public e(C9350e c9350e, long j10) {
            this.f42824d = c9350e;
            this.f42823c = j10;
        }

        @Override // p411xi.InterfaceC9782z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f42822b) {
                return;
            }
            this.f42822b = true;
            if (this.f42823c > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            this.f42824d.f42809f = 3;
        }

        @Override // p411xi.InterfaceC9782z, java.io.Flushable
        public void flush() {
            if (this.f42822b) {
                return;
            }
            this.f42824d.f42808e.flush();
        }

        @Override // p411xi.InterfaceC9782z
        /* renamed from: h */
        public void mo32031h(C9761e c9761e, long j10) {
            if (this.f42822b) {
                throw new IllegalStateException("closed");
            }
            C9183h.m38681a(c9761e.size(), 0L, j10);
            if (j10 <= this.f42823c) {
                this.f42824d.f42808e.mo32031h(c9761e, j10);
                this.f42823c -= j10;
                return;
            }
            throw new ProtocolException("expected " + this.f42823c + " bytes but received " + j10);
        }

        @Override // p411xi.InterfaceC9782z
        public C9758c0 timeout() {
            return this.f42824d.f42808e.timeout();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:vg/e$f.class
     */
    /* renamed from: vg.e$f */
    /* loaded from: combined.jar:classes2.jar:vg/e$f.class */
    public class f extends b implements InterfaceC9756b0 {

        /* renamed from: f */
        public long f42825f;

        /* renamed from: g */
        public final C9350e f42826g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C9350e c9350e, InterfaceC9347b interfaceC9347b, long j10) {
            super(c9350e, interfaceC9347b);
            this.f42826g = c9350e;
            this.f42825f = j10;
            if (j10 == 0) {
                m39430l(true);
            }
        }

        @Override // p411xi.InterfaceC9756b0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f42813d) {
                return;
            }
            if (this.f42825f != 0 && !this.f42826g.m39415m(this, 100)) {
                m39431o();
            }
            this.f42813d = true;
        }

        @Override // p411xi.InterfaceC9756b0
        public C9758c0 timeout() {
            return this.f42826g.f42807d.timeout();
        }

        @Override // p411xi.InterfaceC9756b0
        /* renamed from: x */
        public long mo22901x(C9761e c9761e, long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            }
            if (this.f42813d) {
                throw new IllegalStateException("closed");
            }
            if (this.f42825f == 0) {
                return -1L;
            }
            long mo22901x = this.f42826g.f42807d.mo22901x(c9761e, Math.min(this.f42825f, j10));
            if (mo22901x == -1) {
                m39431o();
                throw new ProtocolException("unexpected end of stream");
            }
            this.f42825f -= mo22901x;
            m39429f(c9761e, mo22901x);
            if (this.f42825f == 0) {
                m39430l(true);
            }
            return mo22901x;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:vg/e$g.class
     */
    /* renamed from: vg.e$g */
    /* loaded from: combined.jar:classes2.jar:vg/e$g.class */
    public class g extends b implements InterfaceC9756b0 {

        /* renamed from: f */
        public boolean f42827f;

        /* renamed from: g */
        public final C9350e f42828g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C9350e c9350e, InterfaceC9347b interfaceC9347b) {
            super(c9350e, interfaceC9347b);
            this.f42828g = c9350e;
        }

        @Override // p411xi.InterfaceC9756b0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f42813d) {
                return;
            }
            if (!this.f42827f) {
                m39431o();
            }
            this.f42813d = true;
        }

        @Override // p411xi.InterfaceC9756b0
        public C9758c0 timeout() {
            return this.f42828g.f42807d.timeout();
        }

        @Override // p411xi.InterfaceC9756b0
        /* renamed from: x */
        public long mo22901x(C9761e c9761e, long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            }
            if (this.f42813d) {
                throw new IllegalStateException("closed");
            }
            if (this.f42827f) {
                return -1L;
            }
            long mo22901x = this.f42828g.f42807d.mo22901x(c9761e, j10);
            if (mo22901x != -1) {
                m39429f(c9761e, mo22901x);
                return mo22901x;
            }
            this.f42827f = true;
            m39430l(false);
            return -1L;
        }
    }

    public C9350e(C8734j c8734j, C8733i c8733i, Socket socket) {
        this.f42804a = c8734j;
        this.f42805b = c8733i;
        this.f42806c = socket;
        this.f42807d = C9772p.m41229c(C9772p.m41238l(socket));
        this.f42808e = C9772p.m41228b(C9772p.m41234h(socket));
    }

    /* renamed from: A */
    public void m39411A(C8739o c8739o, String str) {
        if (this.f42809f != 0) {
            throw new IllegalStateException("state: " + this.f42809f);
        }
        this.f42808e.mo41136Q(str).mo41136Q(SocketClient.NETASCII_EOL);
        for (int i10 = 0; i10 < c8739o.m37401f(); i10++) {
            this.f42808e.mo41136Q(c8739o.m37399d(i10)).mo41136Q(": ").mo41136Q(c8739o.m37402g(i10)).mo41136Q(SocketClient.NETASCII_EOL);
        }
        this.f42808e.mo41136Q(SocketClient.NETASCII_EOL);
        this.f42809f = 1;
    }

    /* renamed from: B */
    public void m39412B(C9357l c9357l) {
        if (this.f42809f == 1) {
            this.f42809f = 3;
            c9357l.m39496l(this.f42808e);
        } else {
            throw new IllegalStateException("state: " + this.f42809f);
        }
    }

    /* renamed from: k */
    public long m39413k() {
        return this.f42807d.mo41177z().size();
    }

    /* renamed from: l */
    public void m39414l() {
        this.f42810g = 2;
        if (this.f42809f == 0) {
            this.f42809f = 6;
            this.f42805b.m37346h().close();
        }
    }

    /* renamed from: m */
    public boolean m39415m(InterfaceC9756b0 interfaceC9756b0, int i10) {
        try {
            int soTimeout = this.f42806c.getSoTimeout();
            this.f42806c.setSoTimeout(i10);
            try {
                return C9183h.m38697q(interfaceC9756b0, i10);
            } finally {
                this.f42806c.setSoTimeout(soTimeout);
            }
        } catch (IOException e10) {
            return false;
        }
    }

    /* renamed from: n */
    public void m39416n() {
        m39423u(null, 0L);
    }

    /* renamed from: o */
    public void m39417o() {
        this.f42808e.flush();
    }

    /* renamed from: p */
    public boolean m39418p() {
        return this.f42809f == 6;
    }

    /* renamed from: q */
    public boolean m39419q() {
        try {
            int soTimeout = this.f42806c.getSoTimeout();
            try {
                this.f42806c.setSoTimeout(1);
                if (this.f42807d.mo41164k0()) {
                    this.f42806c.setSoTimeout(soTimeout);
                    return false;
                }
                this.f42806c.setSoTimeout(soTimeout);
                return true;
            } catch (Throwable th2) {
                this.f42806c.setSoTimeout(soTimeout);
                throw th2;
            }
        } catch (SocketTimeoutException e10) {
            return true;
        } catch (IOException e11) {
            return false;
        }
    }

    /* renamed from: r */
    public InterfaceC9782z m39420r() {
        if (this.f42809f == 1) {
            this.f42809f = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.f42809f);
    }

    /* renamed from: s */
    public InterfaceC9756b0 m39421s(InterfaceC9347b interfaceC9347b, C9352g c9352g) {
        if (this.f42809f == 4) {
            this.f42809f = 5;
            return new d(this, interfaceC9347b, c9352g);
        }
        throw new IllegalStateException("state: " + this.f42809f);
    }

    /* renamed from: t */
    public InterfaceC9782z m39422t(long j10) {
        if (this.f42809f == 1) {
            this.f42809f = 2;
            return new e(j10);
        }
        throw new IllegalStateException("state: " + this.f42809f);
    }

    /* renamed from: u */
    public InterfaceC9756b0 m39423u(InterfaceC9347b interfaceC9347b, long j10) {
        if (this.f42809f == 4) {
            this.f42809f = 5;
            return new f(this, interfaceC9347b, j10);
        }
        throw new IllegalStateException("state: " + this.f42809f);
    }

    /* renamed from: v */
    public InterfaceC9756b0 m39424v(InterfaceC9347b interfaceC9347b) {
        if (this.f42809f == 4) {
            this.f42809f = 5;
            return new g(this, interfaceC9347b);
        }
        throw new IllegalStateException("state: " + this.f42809f);
    }

    /* renamed from: w */
    public void m39425w() {
        this.f42810g = 1;
        if (this.f42809f == 0) {
            this.f42810g = 0;
            AbstractC9177b.f41993b.mo37446h(this.f42804a, this.f42805b);
        }
    }

    /* renamed from: x */
    public void m39426x(C8739o.b bVar) {
        while (true) {
            String mo41143V = this.f42807d.mo41143V();
            if (mo41143V.length() == 0) {
                return;
            } else {
                AbstractC9177b.f41993b.mo37439a(bVar, mo41143V);
            }
        }
    }

    /* renamed from: y */
    public C8745u.b m39427y() {
        C9360o m39518a;
        C8745u.b m37532u;
        int i10 = this.f42809f;
        if (i10 != 1 && i10 != 3) {
            throw new IllegalStateException("state: " + this.f42809f);
        }
        do {
            m39518a = C9360o.m39518a(this.f42807d.mo41143V());
            m37532u = new C8745u.b().m37535x(m39518a.f42895a).m37528q(m39518a.f42896b).m37532u(m39518a.f42897c);
            C8739o.b bVar = new C8739o.b();
            m39426x(bVar);
            bVar.m37405b(C9355j.f42862e, m39518a.f42895a.toString());
            m37532u.m37531t(bVar.m37408e());
        } while (m39518a.f42896b == 100);
        this.f42809f = 4;
        return m37532u;
    }

    /* renamed from: z */
    public void m39428z(int i10, int i11) {
        if (i10 != 0) {
            this.f42807d.timeout().mo41092g(i10, TimeUnit.MILLISECONDS);
        }
        if (i11 != 0) {
            this.f42808e.timeout().mo41092g(i11, TimeUnit.MILLISECONDS);
        }
    }
}

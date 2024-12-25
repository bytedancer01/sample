package p145i7;

import java.util.ArrayDeque;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p057d7.InterfaceC4324g;
import p059d9.C4349a;
import p267p6.C7594k1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:i7/a.class
 */
/* renamed from: i7.a */
/* loaded from: combined.jar:classes2.jar:i7/a.class */
public final class C5193a implements InterfaceC5195c {

    /* renamed from: a */
    public final byte[] f29603a = new byte[8];

    /* renamed from: b */
    public final ArrayDeque<b> f29604b = new ArrayDeque<>();

    /* renamed from: c */
    public final C5199g f29605c = new C5199g();

    /* renamed from: d */
    public InterfaceC5194b f29606d;

    /* renamed from: e */
    public int f29607e;

    /* renamed from: f */
    public int f29608f;

    /* renamed from: g */
    public long f29609g;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:i7/a$b.class
     */
    /* renamed from: i7.a$b */
    /* loaded from: combined.jar:classes2.jar:i7/a$b.class */
    public static final class b {

        /* renamed from: a */
        public final int f29610a;

        /* renamed from: b */
        public final long f29611b;

        public b(int i10, long j10) {
            this.f29610a = i10;
            this.f29611b = j10;
        }
    }

    /* renamed from: f */
    public static String m25882f(InterfaceC4324g interfaceC4324g, int i10) {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        interfaceC4324g.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // p145i7.InterfaceC5195c
    /* renamed from: a */
    public boolean mo25883a(InterfaceC4324g interfaceC4324g) {
        C4349a.m21886i(this.f29606d);
        while (true) {
            b peek = this.f29604b.peek();
            if (peek != null && interfaceC4324g.getPosition() >= peek.f29611b) {
                this.f29606d.mo25890a(this.f29604b.pop().f29610a);
                return true;
            }
            if (this.f29607e == 0) {
                long m25954d = this.f29605c.m25954d(interfaceC4324g, true, false, 4);
                long j10 = m25954d;
                if (m25954d == -2) {
                    j10 = m25885c(interfaceC4324g);
                }
                if (j10 == -1) {
                    return false;
                }
                this.f29608f = (int) j10;
                this.f29607e = 1;
            }
            if (this.f29607e == 1) {
                this.f29609g = this.f29605c.m25954d(interfaceC4324g, false, true, 8);
                this.f29607e = 2;
            }
            int mo25894e = this.f29606d.mo25894e(this.f29608f);
            if (mo25894e != 0) {
                if (mo25894e == 1) {
                    long position = interfaceC4324g.getPosition();
                    this.f29604b.push(new b(this.f29608f, this.f29609g + position));
                    this.f29606d.mo25897h(this.f29608f, position, this.f29609g);
                    this.f29607e = 0;
                    return true;
                }
                if (mo25894e == 2) {
                    long j11 = this.f29609g;
                    if (j11 <= 8) {
                        this.f29606d.mo25893d(this.f29608f, m25887e(interfaceC4324g, (int) j11));
                        this.f29607e = 0;
                        return true;
                    }
                    throw C7594k1.m32822a("Invalid integer size: " + this.f29609g, null);
                }
                if (mo25894e == 3) {
                    long j12 = this.f29609g;
                    if (j12 <= 2147483647L) {
                        this.f29606d.mo25896g(this.f29608f, m25882f(interfaceC4324g, (int) j12));
                        this.f29607e = 0;
                        return true;
                    }
                    throw C7594k1.m32822a("String element size: " + this.f29609g, null);
                }
                if (mo25894e == 4) {
                    this.f29606d.mo25892c(this.f29608f, (int) this.f29609g, interfaceC4324g);
                    this.f29607e = 0;
                    return true;
                }
                if (mo25894e != 5) {
                    throw C7594k1.m32822a("Invalid element type " + mo25894e, null);
                }
                long j13 = this.f29609g;
                if (j13 == 4 || j13 == 8) {
                    this.f29606d.mo25891b(this.f29608f, m25886d(interfaceC4324g, (int) j13));
                    this.f29607e = 0;
                    return true;
                }
                throw C7594k1.m32822a("Invalid float size: " + this.f29609g, null);
            }
            interfaceC4324g.mo21809o((int) this.f29609g);
            this.f29607e = 0;
        }
    }

    @Override // p145i7.InterfaceC5195c
    /* renamed from: b */
    public void mo25884b(InterfaceC5194b interfaceC5194b) {
        this.f29606d = interfaceC5194b;
    }

    @RequiresNonNull({"processor"})
    /* renamed from: c */
    public final long m25885c(InterfaceC4324g interfaceC4324g) {
        interfaceC4324g.mo21801f();
        while (true) {
            interfaceC4324g.mo21811q(this.f29603a, 0, 4);
            int m25952c = C5199g.m25952c(this.f29603a[0]);
            if (m25952c != -1 && m25952c <= 4) {
                int m25951a = (int) C5199g.m25951a(this.f29603a, m25952c, false);
                if (this.f29606d.mo25895f(m25951a)) {
                    interfaceC4324g.mo21809o(m25952c);
                    return m25951a;
                }
            }
            interfaceC4324g.mo21809o(1);
        }
    }

    /* renamed from: d */
    public final double m25886d(InterfaceC4324g interfaceC4324g, int i10) {
        return i10 == 4 ? Float.intBitsToFloat((int) r0) : Double.longBitsToDouble(m25887e(interfaceC4324g, i10));
    }

    /* renamed from: e */
    public final long m25887e(InterfaceC4324g interfaceC4324g, int i10) {
        interfaceC4324g.readFully(this.f29603a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (this.f29603a[i11] & 255);
        }
        return j10;
    }

    @Override // p145i7.InterfaceC5195c
    public void reset() {
        this.f29607e = 0;
        this.f29604b.clear();
        this.f29605c.m25955e();
    }
}

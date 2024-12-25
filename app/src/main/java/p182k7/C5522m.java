package p182k7;

import ec.C4710m;
import java.util.ArrayList;
import java.util.List;
import p057d7.C4334q;
import p057d7.InterfaceC4324g;
import p059d9.C4361f0;
import p267p6.C7594k1;
import p283q7.C7839a;
import p381w7.C9427c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:k7/m.class
 */
/* renamed from: k7.m */
/* loaded from: combined.jar:classes2.jar:k7/m.class */
public final class C5522m {

    /* renamed from: d */
    public static final C4710m f31516d = C4710m.m23679d(':');

    /* renamed from: e */
    public static final C4710m f31517e = C4710m.m23679d('*');

    /* renamed from: a */
    public final List<a> f31518a = new ArrayList();

    /* renamed from: b */
    public int f31519b = 0;

    /* renamed from: c */
    public int f31520c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:k7/m$a.class
     */
    /* renamed from: k7.m$a */
    /* loaded from: combined.jar:classes2.jar:k7/m$a.class */
    public static final class a {

        /* renamed from: a */
        public final int f31521a;

        /* renamed from: b */
        public final long f31522b;

        /* renamed from: c */
        public final int f31523c;

        public a(int i10, long j10, int i11) {
            this.f31521a = i10;
            this.f31522b = j10;
            this.f31523c = i11;
        }
    }

    /* renamed from: b */
    public static int m27480b(String str) {
        str.hashCode();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw C7594k1.m32822a("Invalid SEF name", null);
        }
    }

    /* renamed from: f */
    public static C9427c m27481f(C4361f0 c4361f0, int i10) {
        ArrayList arrayList = new ArrayList();
        List<String> m23681f = f31517e.m23681f(c4361f0.m21968A(i10));
        for (int i11 = 0; i11 < m23681f.size(); i11++) {
            List<String> m23681f2 = f31516d.m23681f(m23681f.get(i11));
            if (m23681f2.size() != 3) {
                throw C7594k1.m32822a(null, null);
            }
            try {
                arrayList.add(new C9427c.b(Long.parseLong(m23681f2.get(0)), Long.parseLong(m23681f2.get(1)), 1 << (Integer.parseInt(m23681f2.get(2)) - 1)));
            } catch (NumberFormatException e10) {
                throw C7594k1.m32822a(null, e10);
            }
        }
        return new C9427c(arrayList);
    }

    /* renamed from: a */
    public final void m27482a(InterfaceC4324g interfaceC4324g, C4334q c4334q) {
        C4361f0 c4361f0 = new C4361f0(8);
        interfaceC4324g.readFully(c4361f0.m21988d(), 0, 8);
        this.f31520c = c4361f0.m22001q() + 8;
        if (c4361f0.m21998n() != 1397048916) {
            c4334q.f26491a = 0L;
        } else {
            c4334q.f26491a = interfaceC4324g.getPosition() - (this.f31520c - 12);
            this.f31519b = 2;
        }
    }

    /* renamed from: c */
    public int m27483c(InterfaceC4324g interfaceC4324g, C4334q c4334q, List<C7839a.b> list) {
        int i10 = this.f31519b;
        if (i10 == 0) {
            long length = interfaceC4324g.getLength();
            long j10 = 0;
            if (length != -1) {
                j10 = length < 8 ? 0L : length - 8;
            }
            c4334q.f26491a = j10;
            this.f31519b = 1;
            return 1;
        }
        if (i10 == 1) {
            m27482a(interfaceC4324g, c4334q);
            return 1;
        }
        if (i10 == 2) {
            m27484d(interfaceC4324g, c4334q);
            return 1;
        }
        if (i10 != 3) {
            throw new IllegalStateException();
        }
        m27485e(interfaceC4324g, list);
        c4334q.f26491a = 0L;
        return 1;
    }

    /* renamed from: d */
    public final void m27484d(InterfaceC4324g interfaceC4324g, C4334q c4334q) {
        long j10;
        long length = interfaceC4324g.getLength();
        int i10 = (this.f31520c - 12) - 8;
        C4361f0 c4361f0 = new C4361f0(i10);
        interfaceC4324g.readFully(c4361f0.m21988d(), 0, i10);
        for (int i11 = 0; i11 < i10 / 12; i11++) {
            c4361f0.m21984Q(2);
            short m22003s = c4361f0.m22003s();
            if (m22003s == 2192 || m22003s == 2816 || m22003s == 2817 || m22003s == 2819 || m22003s == 2820) {
                long j11 = this.f31520c;
                this.f31518a.add(new a(m22003s, (length - j11) - c4361f0.m22001q(), c4361f0.m22001q()));
            } else {
                c4361f0.m21984Q(8);
            }
        }
        if (this.f31518a.isEmpty()) {
            j10 = 0;
        } else {
            this.f31519b = 3;
            j10 = this.f31518a.get(0).f31522b;
        }
        c4334q.f26491a = j10;
    }

    /* renamed from: e */
    public final void m27485e(InterfaceC4324g interfaceC4324g, List<C7839a.b> list) {
        long position = interfaceC4324g.getPosition();
        int length = (int) ((interfaceC4324g.getLength() - interfaceC4324g.getPosition()) - this.f31520c);
        C4361f0 c4361f0 = new C4361f0(length);
        interfaceC4324g.readFully(c4361f0.m21988d(), 0, length);
        for (int i10 = 0; i10 < this.f31518a.size(); i10++) {
            a aVar = this.f31518a.get(i10);
            c4361f0.m21983P((int) (aVar.f31522b - position));
            c4361f0.m21984Q(4);
            int m22001q = c4361f0.m22001q();
            int m27480b = m27480b(c4361f0.m21968A(m22001q));
            int i11 = aVar.f31523c;
            if (m27480b == 2192) {
                list.add(m27481f(c4361f0, i11 - (m22001q + 8)));
            } else if (m27480b != 2816 && m27480b != 2817 && m27480b != 2819 && m27480b != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: g */
    public void m27486g() {
        this.f31518a.clear();
        this.f31519b = 0;
    }
}

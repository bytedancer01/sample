package ke;

import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import p444zd.C10193a;
import td.C8691f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ke/s.class
 */
/* renamed from: ke.s */
/* loaded from: combined.jar:classes2.jar:ke/s.class */
public final class C5589s {

    /* renamed from: a */
    public final C10193a f31672a;

    /* renamed from: b */
    public final C5583m f31673b = new C5583m();

    /* renamed from: c */
    public final StringBuilder f31674c = new StringBuilder();

    public C5589s(C10193a c10193a) {
        this.f31672a = c10193a;
    }

    /* renamed from: g */
    public static int m27633g(C10193a c10193a, int i10, int i11) {
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = i13;
            if (i12 >= i11) {
                return i14;
            }
            int i15 = i14;
            if (c10193a.m42660c(i10 + i12)) {
                i15 = i14 | (1 << ((i11 - i12) - 1));
            }
            i12++;
            i13 = i15;
        }
    }

    /* renamed from: a */
    public String m27634a(StringBuilder sb2, int i10) {
        String str = null;
        while (true) {
            C5585o m27636c = m27636c(i10, str);
            String m27630a = C5588r.m27630a(m27636c.m27622b());
            if (m27630a != null) {
                sb2.append(m27630a);
            }
            str = m27636c.m27624d() ? String.valueOf(m27636c.m27623c()) : null;
            if (i10 == m27636c.m27629a()) {
                return sb2.toString();
            }
            i10 = m27636c.m27629a();
        }
    }

    /* renamed from: b */
    public final C5584n m27635b(int i10) {
        char c10;
        int m27639f = m27639f(i10, 5);
        if (m27639f == 15) {
            return new C5584n(i10 + 5, '$');
        }
        if (m27639f >= 5 && m27639f < 15) {
            return new C5584n(i10 + 5, (char) ((m27639f + 48) - 5));
        }
        int m27639f2 = m27639f(i10, 6);
        if (m27639f2 >= 32 && m27639f2 < 58) {
            return new C5584n(i10 + 6, (char) (m27639f2 + 33));
        }
        switch (m27639f2) {
            case 58:
                c10 = '*';
                break;
            case 59:
                c10 = ',';
                break;
            case 60:
                c10 = '-';
                break;
            case 61:
                c10 = '.';
                break;
            case 62:
                c10 = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: ".concat(String.valueOf(m27639f2)));
        }
        return new C5584n(i10 + 6, c10);
    }

    /* renamed from: c */
    public C5585o m27636c(int i10, String str) {
        this.f31674c.setLength(0);
        if (str != null) {
            this.f31674c.append(str);
        }
        this.f31673b.m27619h(i10);
        C5585o m27647o = m27647o();
        return (m27647o == null || !m27647o.m27624d()) ? new C5585o(this.f31673b.m27612a(), this.f31674c.toString()) : new C5585o(this.f31673b.m27612a(), this.f31674c.toString(), m27647o.m27623c());
    }

    /* renamed from: d */
    public final C5584n m27637d(int i10) {
        char c10;
        int m27639f = m27639f(i10, 5);
        if (m27639f == 15) {
            return new C5584n(i10 + 5, '$');
        }
        if (m27639f >= 5 && m27639f < 15) {
            return new C5584n(i10 + 5, (char) ((m27639f + 48) - 5));
        }
        int m27639f2 = m27639f(i10, 7);
        if (m27639f2 >= 64 && m27639f2 < 90) {
            return new C5584n(i10 + 7, (char) (m27639f2 + 1));
        }
        if (m27639f2 >= 90 && m27639f2 < 116) {
            return new C5584n(i10 + 7, (char) (m27639f2 + 7));
        }
        switch (m27639f(i10, 8)) {
            case 232:
                c10 = '!';
                break;
            case 233:
                c10 = '\"';
                break;
            case FTPReply.SECURITY_DATA_EXCHANGE_COMPLETE /* 234 */:
                c10 = '%';
                break;
            case 235:
                c10 = '&';
                break;
            case TelnetCommand.EOF /* 236 */:
                c10 = '\'';
                break;
            case TelnetCommand.SUSP /* 237 */:
                c10 = '(';
                break;
            case TelnetCommand.ABORT /* 238 */:
                c10 = ')';
                break;
            case TelnetCommand.EOR /* 239 */:
                c10 = '*';
                break;
            case 240:
                c10 = '+';
                break;
            case TelnetCommand.NOP /* 241 */:
                c10 = ',';
                break;
            case 242:
                c10 = '-';
                break;
            case TelnetCommand.BREAK /* 243 */:
                c10 = '.';
                break;
            case 244:
                c10 = '/';
                break;
            case TelnetCommand.f36135AO /* 245 */:
                c10 = ':';
                break;
            case TelnetCommand.AYT /* 246 */:
                c10 = ';';
                break;
            case TelnetCommand.f36138EC /* 247 */:
                c10 = '<';
                break;
            case TelnetCommand.f36139EL /* 248 */:
                c10 = '=';
                break;
            case TelnetCommand.f36140GA /* 249 */:
                c10 = '>';
                break;
            case 250:
                c10 = '?';
                break;
            case 251:
                c10 = '_';
                break;
            case TelnetCommand.WONT /* 252 */:
                c10 = ' ';
                break;
            default:
                throw C8691f.m37197a();
        }
        return new C5584n(i10 + 8, c10);
    }

    /* renamed from: e */
    public final C5586p m27638e(int i10) {
        int i11 = i10 + 7;
        if (i11 > this.f31672a.m42664h()) {
            int m27639f = m27639f(i10, 4);
            return m27639f == 0 ? new C5586p(this.f31672a.m42664h(), 10, 10) : new C5586p(this.f31672a.m42664h(), m27639f - 1, 10);
        }
        int m27639f2 = m27639f(i10, 7) - 8;
        return new C5586p(i11, m27639f2 / 11, m27639f2 % 11);
    }

    /* renamed from: f */
    public int m27639f(int i10, int i11) {
        return m27633g(this.f31672a, i10, i11);
    }

    /* renamed from: h */
    public final boolean m27640h(int i10) {
        int i11 = i10 + 3;
        if (i11 > this.f31672a.m42664h()) {
            return false;
        }
        while (i10 < i11) {
            if (this.f31672a.m42660c(i10)) {
                return false;
            }
            i10++;
        }
        return true;
    }

    /* renamed from: i */
    public final boolean m27641i(int i10) {
        int i11;
        if (i10 + 1 > this.f31672a.m42664h()) {
            return false;
        }
        for (int i12 = 0; i12 < 5 && (i11 = i12 + i10) < this.f31672a.m42664h(); i12++) {
            if (i12 == 2) {
                if (!this.f31672a.m42660c(i10 + 2)) {
                    return false;
                }
            } else if (this.f31672a.m42660c(i11)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public final boolean m27642j(int i10) {
        int i11;
        if (i10 + 1 > this.f31672a.m42664h()) {
            return false;
        }
        for (int i12 = 0; i12 < 4 && (i11 = i12 + i10) < this.f31672a.m42664h(); i12++) {
            if (this.f31672a.m42660c(i11)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public final boolean m27643k(int i10) {
        int m27639f;
        if (i10 + 5 > this.f31672a.m42664h()) {
            return false;
        }
        int m27639f2 = m27639f(i10, 5);
        if (m27639f2 < 5 || m27639f2 >= 16) {
            return i10 + 6 <= this.f31672a.m42664h() && (m27639f = m27639f(i10, 6)) >= 16 && m27639f < 63;
        }
        return true;
    }

    /* renamed from: l */
    public final boolean m27644l(int i10) {
        int m27639f;
        if (i10 + 5 > this.f31672a.m42664h()) {
            return false;
        }
        int m27639f2 = m27639f(i10, 5);
        if (m27639f2 >= 5 && m27639f2 < 16) {
            return true;
        }
        if (i10 + 7 > this.f31672a.m42664h()) {
            return false;
        }
        int m27639f3 = m27639f(i10, 7);
        if (m27639f3 < 64 || m27639f3 >= 116) {
            return i10 + 8 <= this.f31672a.m42664h() && (m27639f = m27639f(i10, 8)) >= 232 && m27639f < 253;
        }
        return true;
    }

    /* renamed from: m */
    public final boolean m27645m(int i10) {
        if (i10 + 7 > this.f31672a.m42664h()) {
            return i10 + 4 <= this.f31672a.m42664h();
        }
        int i11 = i10;
        while (true) {
            int i12 = i10 + 3;
            if (i11 >= i12) {
                return this.f31672a.m42660c(i12);
            }
            if (this.f31672a.m42660c(i11)) {
                return true;
            }
            i11++;
        }
    }

    /* renamed from: n */
    public final C5582l m27646n() {
        while (m27643k(this.f31673b.m27612a())) {
            C5584n m27635b = m27635b(this.f31673b.m27612a());
            this.f31673b.m27619h(m27635b.m27629a());
            if (m27635b.m27621c()) {
                return new C5582l(new C5585o(this.f31673b.m27612a(), this.f31674c.toString()), true);
            }
            this.f31674c.append(m27635b.m27620b());
        }
        if (m27640h(this.f31673b.m27612a())) {
            this.f31673b.m27613b(3);
            this.f31673b.m27618g();
        } else if (m27641i(this.f31673b.m27612a())) {
            if (this.f31673b.m27612a() + 5 < this.f31672a.m42664h()) {
                this.f31673b.m27613b(5);
            } else {
                this.f31673b.m27619h(this.f31672a.m42664h());
            }
            this.f31673b.m27617f();
        }
        return new C5582l(false);
    }

    /* renamed from: o */
    public final C5585o m27647o() {
        C5582l m27646n;
        boolean m27611b;
        do {
            int m27612a = this.f31673b.m27612a();
            m27646n = this.f31673b.m27614c() ? m27646n() : this.f31673b.m27615d() ? m27648p() : m27649q();
            m27611b = m27646n.m27611b();
            if (!(m27612a != this.f31673b.m27612a()) && !m27611b) {
                break;
            }
        } while (!m27611b);
        return m27646n.m27610a();
    }

    /* renamed from: p */
    public final C5582l m27648p() {
        while (m27644l(this.f31673b.m27612a())) {
            C5584n m27637d = m27637d(this.f31673b.m27612a());
            this.f31673b.m27619h(m27637d.m27629a());
            if (m27637d.m27621c()) {
                return new C5582l(new C5585o(this.f31673b.m27612a(), this.f31674c.toString()), true);
            }
            this.f31674c.append(m27637d.m27620b());
        }
        if (m27640h(this.f31673b.m27612a())) {
            this.f31673b.m27613b(3);
            this.f31673b.m27618g();
        } else if (m27641i(this.f31673b.m27612a())) {
            if (this.f31673b.m27612a() + 5 < this.f31672a.m42664h()) {
                this.f31673b.m27613b(5);
            } else {
                this.f31673b.m27619h(this.f31672a.m42664h());
            }
            this.f31673b.m27616e();
        }
        return new C5582l(false);
    }

    /* renamed from: q */
    public final C5582l m27649q() {
        while (m27645m(this.f31673b.m27612a())) {
            C5586p m27638e = m27638e(this.f31673b.m27612a());
            this.f31673b.m27619h(m27638e.m27629a());
            if (m27638e.m27627d()) {
                return new C5582l(m27638e.m27628e() ? new C5585o(this.f31673b.m27612a(), this.f31674c.toString()) : new C5585o(this.f31673b.m27612a(), this.f31674c.toString(), m27638e.m27626c()), true);
            }
            this.f31674c.append(m27638e.m27625b());
            if (m27638e.m27628e()) {
                return new C5582l(new C5585o(this.f31673b.m27612a(), this.f31674c.toString()), true);
            }
            this.f31674c.append(m27638e.m27626c());
        }
        if (m27642j(this.f31673b.m27612a())) {
            this.f31673b.m27616e();
            this.f31673b.m27613b(4);
        }
        return new C5582l(false);
    }
}

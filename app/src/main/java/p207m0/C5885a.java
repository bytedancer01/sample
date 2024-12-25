package p207m0;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:m0/a.class
 */
/* renamed from: m0.a */
/* loaded from: combined.jar:classes1.jar:m0/a.class */
public final class C5885a {

    /* renamed from: d */
    public static final InterfaceC5889e f32962d;

    /* renamed from: e */
    public static final String f32963e;

    /* renamed from: f */
    public static final String f32964f;

    /* renamed from: g */
    public static final C5885a f32965g;

    /* renamed from: h */
    public static final C5885a f32966h;

    /* renamed from: a */
    public final boolean f32967a;

    /* renamed from: b */
    public final int f32968b;

    /* renamed from: c */
    public final InterfaceC5889e f32969c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m0/a$a.class
     */
    /* renamed from: m0.a$a */
    /* loaded from: combined.jar:classes1.jar:m0/a$a.class */
    public static final class a {

        /* renamed from: a */
        public boolean f32970a;

        /* renamed from: b */
        public int f32971b;

        /* renamed from: c */
        public InterfaceC5889e f32972c;

        public a() {
            m28706c(C5885a.m28696e(Locale.getDefault()));
        }

        /* renamed from: b */
        public static C5885a m28704b(boolean z10) {
            return z10 ? C5885a.f32966h : C5885a.f32965g;
        }

        /* renamed from: a */
        public C5885a m28705a() {
            return (this.f32971b == 2 && this.f32972c == C5885a.f32962d) ? m28704b(this.f32970a) : new C5885a(this.f32970a, this.f32971b, this.f32972c);
        }

        /* renamed from: c */
        public final void m28706c(boolean z10) {
            this.f32970a = z10;
            this.f32972c = C5885a.f32962d;
            this.f32971b = 2;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m0/a$b.class
     */
    /* renamed from: m0.a$b */
    /* loaded from: combined.jar:classes1.jar:m0/a$b.class */
    public static class b {

        /* renamed from: f */
        public static final byte[] f32973f = new byte[1792];

        /* renamed from: a */
        public final CharSequence f32974a;

        /* renamed from: b */
        public final boolean f32975b;

        /* renamed from: c */
        public final int f32976c;

        /* renamed from: d */
        public int f32977d;

        /* renamed from: e */
        public char f32978e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f32973f[i10] = Character.getDirectionality(i10);
            }
        }

        public b(CharSequence charSequence, boolean z10) {
            this.f32974a = charSequence;
            this.f32975b = z10;
            this.f32976c = charSequence.length();
        }

        /* renamed from: c */
        public static byte m28707c(char c10) {
            return c10 < 1792 ? f32973f[c10] : Character.getDirectionality(c10);
        }

        /* renamed from: a */
        public byte m28708a() {
            char charAt = this.f32974a.charAt(this.f32977d - 1);
            this.f32978e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f32974a, this.f32977d);
                this.f32977d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f32977d--;
            byte m28707c = m28707c(this.f32978e);
            byte b10 = m28707c;
            if (this.f32975b) {
                char c10 = this.f32978e;
                if (c10 == '>') {
                    b10 = m28714h();
                } else {
                    b10 = m28707c;
                    if (c10 == ';') {
                        b10 = m28712f();
                    }
                }
            }
            return b10;
        }

        /* renamed from: b */
        public byte m28709b() {
            char charAt = this.f32974a.charAt(this.f32977d);
            this.f32978e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f32974a, this.f32977d);
                this.f32977d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f32977d++;
            byte m28707c = m28707c(this.f32978e);
            byte b10 = m28707c;
            if (this.f32975b) {
                char c10 = this.f32978e;
                if (c10 == '<') {
                    b10 = m28715i();
                } else {
                    b10 = m28707c;
                    if (c10 == '&') {
                        b10 = m28713g();
                    }
                }
            }
            return b10;
        }

        /* renamed from: d */
        public int m28710d() {
            this.f32977d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f32977d < this.f32976c && i10 == 0) {
                byte m28709b = m28709b();
                if (m28709b != 0) {
                    if (m28709b == 1 || m28709b == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (m28709b != 9) {
                        switch (m28709b) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f32977d > 0) {
                switch (m28708a()) {
                    case 14:
                    case 15:
                        if (i10 == i12) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        break;
                    case 18:
                        i12++;
                        continue;
                }
                i12--;
            }
            return 0;
        }

        /* renamed from: e */
        public int m28711e() {
            this.f32977d = this.f32976c;
            int i10 = 0;
            int i11 = 0;
            while (this.f32977d > 0) {
                byte m28708a = m28708a();
                if (m28708a != 0) {
                    if (m28708a == 1 || m28708a == 2) {
                        if (i10 == 0) {
                            return 1;
                        }
                        if (i11 == 0) {
                            i11 = i10;
                        }
                    } else if (m28708a != 9) {
                        switch (m28708a) {
                            case 14:
                            case 15:
                                if (i11 == i10) {
                                    return -1;
                                }
                                i10--;
                                break;
                            case 16:
                            case 17:
                                if (i11 == i10) {
                                    return 1;
                                }
                                i10--;
                                break;
                            case 18:
                                i10++;
                                break;
                            default:
                                if (i11 != 0) {
                                    break;
                                } else {
                                    i11 = i10;
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (i10 == 0) {
                        return -1;
                    }
                    if (i11 == 0) {
                        i11 = i10;
                    }
                }
            }
            return 0;
        }

        /* renamed from: f */
        public final byte m28712f() {
            char charAt;
            int i10 = this.f32977d;
            do {
                int i11 = this.f32977d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f32974a;
                int i12 = i11 - 1;
                this.f32977d = i12;
                charAt = charSequence.charAt(i12);
                this.f32978e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f32977d = i10;
            this.f32978e = ';';
            return (byte) 13;
        }

        /* renamed from: g */
        public final byte m28713g() {
            char charAt;
            do {
                int i10 = this.f32977d;
                if (i10 >= this.f32976c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f32974a;
                this.f32977d = i10 + 1;
                charAt = charSequence.charAt(i10);
                this.f32978e = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        /* renamed from: h */
        public final byte m28714h() {
            char charAt;
            int i10 = this.f32977d;
            while (true) {
                int i11 = this.f32977d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f32974a;
                int i12 = i11 - 1;
                this.f32977d = i12;
                char charAt2 = charSequence.charAt(i12);
                this.f32978e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i13 = this.f32977d;
                        if (i13 > 0) {
                            CharSequence charSequence2 = this.f32974a;
                            int i14 = i13 - 1;
                            this.f32977d = i14;
                            charAt = charSequence2.charAt(i14);
                            this.f32978e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f32977d = i10;
            this.f32978e = '>';
            return (byte) 13;
        }

        /* renamed from: i */
        public final byte m28715i() {
            char charAt;
            int i10 = this.f32977d;
            while (true) {
                int i11 = this.f32977d;
                if (i11 >= this.f32976c) {
                    this.f32977d = i10;
                    this.f32978e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f32974a;
                this.f32977d = i11 + 1;
                char charAt2 = charSequence.charAt(i11);
                this.f32978e = charAt2;
                if (charAt2 == '>') {
                    return (byte) 12;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i12 = this.f32977d;
                        if (i12 < this.f32976c) {
                            CharSequence charSequence2 = this.f32974a;
                            this.f32977d = i12 + 1;
                            charAt = charSequence2.charAt(i12);
                            this.f32978e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
        }
    }

    static {
        InterfaceC5889e interfaceC5889e = C5890f.f32994c;
        f32962d = interfaceC5889e;
        f32963e = Character.toString((char) 8206);
        f32964f = Character.toString((char) 8207);
        f32965g = new C5885a(false, 2, interfaceC5889e);
        f32966h = new C5885a(true, 2, interfaceC5889e);
    }

    public C5885a(boolean z10, int i10, InterfaceC5889e interfaceC5889e) {
        this.f32967a = z10;
        this.f32968b = i10;
        this.f32969c = interfaceC5889e;
    }

    /* renamed from: a */
    public static int m28693a(CharSequence charSequence) {
        return new b(charSequence, false).m28710d();
    }

    /* renamed from: b */
    public static int m28694b(CharSequence charSequence) {
        return new b(charSequence, false).m28711e();
    }

    /* renamed from: c */
    public static C5885a m28695c() {
        return new a().m28705a();
    }

    /* renamed from: e */
    public static boolean m28696e(Locale locale) {
        boolean z10 = true;
        if (C5891g.m28734a(locale) != 1) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: d */
    public boolean m28697d() {
        return (this.f32968b & 2) != 0;
    }

    /* renamed from: f */
    public final String m28698f(CharSequence charSequence, InterfaceC5889e interfaceC5889e) {
        boolean isRtl = interfaceC5889e.isRtl(charSequence, 0, charSequence.length());
        return (this.f32967a || !(isRtl || m28694b(charSequence) == 1)) ? this.f32967a ? (!isRtl || m28694b(charSequence) == -1) ? f32964f : "" : "" : f32963e;
    }

    /* renamed from: g */
    public final String m28699g(CharSequence charSequence, InterfaceC5889e interfaceC5889e) {
        boolean isRtl = interfaceC5889e.isRtl(charSequence, 0, charSequence.length());
        return (this.f32967a || !(isRtl || m28693a(charSequence) == 1)) ? this.f32967a ? (!isRtl || m28693a(charSequence) == -1) ? f32964f : "" : "" : f32963e;
    }

    /* renamed from: h */
    public CharSequence m28700h(CharSequence charSequence) {
        return m28701i(charSequence, this.f32969c, true);
    }

    /* renamed from: i */
    public CharSequence m28701i(CharSequence charSequence, InterfaceC5889e interfaceC5889e, boolean z10) {
        if (charSequence == null) {
            return null;
        }
        boolean isRtl = interfaceC5889e.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (m28697d() && z10) {
            spannableStringBuilder.append((CharSequence) m28699g(charSequence, isRtl ? C5890f.f32993b : C5890f.f32992a));
        }
        if (isRtl != this.f32967a) {
            spannableStringBuilder.append(isRtl ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            spannableStringBuilder.append((CharSequence) m28698f(charSequence, isRtl ? C5890f.f32993b : C5890f.f32992a));
        }
        return spannableStringBuilder;
    }

    /* renamed from: j */
    public String m28702j(String str) {
        return m28703k(str, this.f32969c, true);
    }

    /* renamed from: k */
    public String m28703k(String str, InterfaceC5889e interfaceC5889e, boolean z10) {
        if (str == null) {
            return null;
        }
        return m28701i(str, interfaceC5889e, z10).toString();
    }
}

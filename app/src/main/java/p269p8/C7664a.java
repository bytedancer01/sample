package p269p8;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.apache.http.HttpStatus;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p059d9.C4349a;
import p059d9.C4361f0;
import p059d9.C4392v;
import p059d9.C4401z0;
import p243o8.AbstractC6928j;
import p243o8.C6919a;
import p243o8.C6927i;
import p243o8.InterfaceC6923e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p8/a.class
 */
/* renamed from: p8.a */
/* loaded from: combined.jar:classes2.jar:p8/a.class */
public final class C7664a extends AbstractC7668e {

    /* renamed from: h */
    public final int f37316h;

    /* renamed from: i */
    public final int f37317i;

    /* renamed from: j */
    public final int f37318j;

    /* renamed from: k */
    public final long f37319k;

    /* renamed from: n */
    public List<C6919a> f37322n;

    /* renamed from: o */
    public List<C6919a> f37323o;

    /* renamed from: p */
    public int f37324p;

    /* renamed from: q */
    public int f37325q;

    /* renamed from: r */
    public boolean f37326r;

    /* renamed from: s */
    public boolean f37327s;

    /* renamed from: t */
    public byte f37328t;

    /* renamed from: u */
    public byte f37329u;

    /* renamed from: w */
    public boolean f37331w;

    /* renamed from: x */
    public long f37332x;

    /* renamed from: y */
    public static final int[] f37313y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z */
    public static final int[] f37314z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: A */
    public static final int[] f37307A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: B */
    public static final int[] f37308B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, FTPReply.DATA_CONNECTION_OPEN, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, TelnetCommand.SUSP, TelnetCommand.BREAK, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, NNTPReply.NEW_NEWSGROUP_LIST_FOLLOWS, TelnetCommand.f36138EC, 209, TelnetCommand.NOP, 9632};

    /* renamed from: C */
    public static final int[] f37309C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, FTPReply.CLOSING_DATA_CONNECTION, FTPReply.SECURITY_DATA_EXCHANGE_COMPLETE, TelnetCommand.ABORT, 244, 251};

    /* renamed from: D */
    public static final int[] f37310D = {193, 201, 211, 218, 220, TelnetCommand.WONT, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, NNTPReply.DEBUG_OUTPUT, 200, 202, HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION, 235, HttpStatus.SC_PARTIAL_CONTENT, HttpStatus.SC_MULTI_STATUS, TelnetCommand.EOR, FTPReply.DIRECTORY_STATUS, 217, TelnetCommand.f36140GA, 219, 171, 187};

    /* renamed from: E */
    public static final int[] f37311E = {195, FTPReply.ENTERING_PASSIVE_MODE, 205, HttpStatus.SC_NO_CONTENT, TelnetCommand.EOF, 210, 242, FTPReply.FILE_STATUS, TelnetCommand.f36135AO, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, TelnetCommand.AYT, NNTPReply.ARTICLE_RETRIEVED_REQUEST_TEXT_SEPARATELY, 165, 164, 9474, 197, FTPReply.ENTERING_EPSV_MODE, 216, TelnetCommand.f36139EL, 9484, 9488, 9492, 9496};

    /* renamed from: F */
    public static final boolean[] f37312F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g */
    public final C4361f0 f37315g = new C4361f0();

    /* renamed from: l */
    public final ArrayList<a> f37320l = new ArrayList<>();

    /* renamed from: m */
    public a f37321m = new a(0, 4);

    /* renamed from: v */
    public int f37330v = 0;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p8/a$a.class
     */
    /* renamed from: p8.a$a */
    /* loaded from: combined.jar:classes2.jar:p8/a$a.class */
    public static final class a {

        /* renamed from: a */
        public final List<C10328a> f37333a = new ArrayList();

        /* renamed from: b */
        public final List<SpannableString> f37334b = new ArrayList();

        /* renamed from: c */
        public final StringBuilder f37335c = new StringBuilder();

        /* renamed from: d */
        public int f37336d;

        /* renamed from: e */
        public int f37337e;

        /* renamed from: f */
        public int f37338f;

        /* renamed from: g */
        public int f37339g;

        /* renamed from: h */
        public int f37340h;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:p8/a$a$a.class
         */
        /* renamed from: p8.a$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:p8/a$a$a.class */
        public static class C10328a {

            /* renamed from: a */
            public final int f37341a;

            /* renamed from: b */
            public final boolean f37342b;

            /* renamed from: c */
            public int f37343c;

            public C10328a(int i10, boolean z10, int i11) {
                this.f37341a = i10;
                this.f37342b = z10;
                this.f37343c = i11;
            }
        }

        public a(int i10, int i11) {
            m33504j(i10);
            this.f37340h = i11;
        }

        /* renamed from: n */
        public static void m33496n(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
            if (i12 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
        }

        /* renamed from: o */
        public static void m33497o(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
        }

        /* renamed from: q */
        public static void m33498q(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }

        /* renamed from: e */
        public void m33499e(char c10) {
            if (this.f37335c.length() < 32) {
                this.f37335c.append(c10);
            }
        }

        /* renamed from: f */
        public void m33500f() {
            C10328a c10328a;
            int i10;
            int length = this.f37335c.length();
            if (length > 0) {
                this.f37335c.delete(length - 1, length);
                for (int size = this.f37333a.size() - 1; size >= 0 && (i10 = (c10328a = this.f37333a.get(size)).f37343c) == length; size--) {
                    c10328a.f37343c = i10 - 1;
                }
            }
        }

        /* renamed from: g */
        public C6919a m33501g(int i10) {
            int i11;
            int i12 = this.f37337e + this.f37338f;
            int i13 = 32 - i12;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i14 = 0; i14 < this.f37334b.size(); i14++) {
                spannableStringBuilder.append(C4401z0.m22382f1(this.f37334b.get(i14), i13));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(C4401z0.m22382f1(m33502h(), i13));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i13 - spannableStringBuilder.length();
            int i15 = i12 - length;
            if (i10 == Integer.MIN_VALUE) {
                i10 = (this.f37339g != 2 || (Math.abs(i15) >= 3 && length >= 0)) ? (this.f37339g != 2 || i15 <= 0) ? 0 : 2 : 1;
            }
            float f10 = i10 != 1 ? (((i10 != 2 ? i12 : 32 - length) / 32.0f) * 0.8f) + 0.1f : 0.5f;
            int i16 = this.f37336d;
            if (i16 > 7) {
                i11 = (i16 - 15) - 2;
            } else {
                i11 = i16;
                if (this.f37339g == 1) {
                    i11 = i16 - (this.f37340h - 1);
                }
            }
            return new C6919a.b().m31871o(spannableStringBuilder).m31872p(Layout.Alignment.ALIGN_NORMAL).m31864h(i11, 1).m31867k(f10).m31868l(i10).m31857a();
        }

        /* renamed from: h */
        public final SpannableString m33502h() {
            int i10;
            int i11;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f37335c);
            int length = spannableStringBuilder.length();
            int i12 = 0;
            int i13 = -1;
            int i14 = -1;
            int i15 = 0;
            int i16 = -1;
            int i17 = -1;
            boolean z10 = false;
            while (i12 < this.f37333a.size()) {
                C10328a c10328a = this.f37333a.get(i12);
                boolean z11 = c10328a.f37342b;
                int i18 = c10328a.f37341a;
                int i19 = i17;
                boolean z12 = z10;
                if (i18 != 8) {
                    boolean z13 = i18 == 7;
                    if (i18 != 7) {
                        i17 = C7664a.f37307A[i18];
                    }
                    z12 = z13;
                    i19 = i17;
                }
                int i20 = c10328a.f37343c;
                int i21 = i12 + 1;
                if (i20 == (i21 < this.f37333a.size() ? this.f37333a.get(i21).f37343c : length)) {
                    i12 = i21;
                    i17 = i19;
                    z10 = z12;
                } else {
                    if (i13 == -1 || z11) {
                        i10 = i13;
                        if (i13 == -1) {
                            i10 = i13;
                            if (z11) {
                                i10 = i20;
                            }
                        }
                    } else {
                        m33498q(spannableStringBuilder, i13, i20);
                        i10 = -1;
                    }
                    if (i14 == -1 || z12) {
                        i11 = i14;
                        if (i14 == -1) {
                            i11 = i14;
                            if (z12) {
                                i11 = i20;
                            }
                        }
                    } else {
                        m33497o(spannableStringBuilder, i14, i20);
                        i11 = -1;
                    }
                    i12 = i21;
                    i13 = i10;
                    i14 = i11;
                    i17 = i19;
                    z10 = z12;
                    if (i19 != i16) {
                        m33496n(spannableStringBuilder, i15, i20, i16);
                        i16 = i19;
                        i12 = i21;
                        i13 = i10;
                        i14 = i11;
                        i15 = i20;
                        i17 = i19;
                        z10 = z12;
                    }
                }
            }
            if (i13 != -1 && i13 != length) {
                m33498q(spannableStringBuilder, i13, length);
            }
            if (i14 != -1 && i14 != length) {
                m33497o(spannableStringBuilder, i14, length);
            }
            if (i15 != length) {
                m33496n(spannableStringBuilder, i15, length, i16);
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: i */
        public boolean m33503i() {
            return this.f37333a.isEmpty() && this.f37334b.isEmpty() && this.f37335c.length() == 0;
        }

        /* renamed from: j */
        public void m33504j(int i10) {
            this.f37339g = i10;
            this.f37333a.clear();
            this.f37334b.clear();
            this.f37335c.setLength(0);
            this.f37336d = 15;
            this.f37337e = 0;
            this.f37338f = 0;
        }

        /* renamed from: k */
        public void m33505k() {
            this.f37334b.add(m33502h());
            this.f37335c.setLength(0);
            this.f37333a.clear();
            int min = Math.min(this.f37340h, this.f37336d);
            while (this.f37334b.size() >= min) {
                this.f37334b.remove(0);
            }
        }

        /* renamed from: l */
        public void m33506l(int i10) {
            this.f37339g = i10;
        }

        /* renamed from: m */
        public void m33507m(int i10) {
            this.f37340h = i10;
        }

        /* renamed from: p */
        public void m33508p(int i10, boolean z10) {
            this.f37333a.add(new C10328a(i10, z10, this.f37335c.length()));
        }
    }

    public C7664a(String str, int i10, long j10) {
        this.f37319k = j10 > 0 ? j10 * 1000 : -9223372036854775807L;
        this.f37316h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 != 1) {
            if (i10 == 2) {
                this.f37318j = 1;
                this.f37317i = 0;
                m33477M(0);
                m33476L();
                this.f37331w = true;
                this.f37332x = -9223372036854775807L;
            }
            if (i10 == 3) {
                this.f37318j = 0;
            } else if (i10 != 4) {
                C4392v.m22275i("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            } else {
                this.f37318j = 1;
            }
            this.f37317i = 1;
            m33477M(0);
            m33476L();
            this.f37331w = true;
            this.f37332x = -9223372036854775807L;
        }
        this.f37318j = 0;
        this.f37317i = 0;
        m33477M(0);
        m33476L();
        this.f37331w = true;
        this.f37332x = -9223372036854775807L;
    }

    /* renamed from: A */
    public static boolean m33457A(byte b10, byte b11) {
        return (b10 & 246) == 18 && (b11 & 224) == 32;
    }

    /* renamed from: B */
    public static boolean m33458B(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    /* renamed from: C */
    public static boolean m33459C(byte b10, byte b11) {
        return (b10 & 246) == 20 && (b11 & 240) == 32;
    }

    /* renamed from: D */
    public static boolean m33460D(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & 192) == 64;
    }

    /* renamed from: E */
    public static boolean m33461E(byte b10) {
        return (b10 & 240) == 16;
    }

    /* renamed from: G */
    public static boolean m33462G(byte b10) {
        return (b10 & 247) == 20;
    }

    /* renamed from: H */
    public static boolean m33463H(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 48;
    }

    /* renamed from: I */
    public static boolean m33464I(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    /* renamed from: J */
    public static boolean m33465J(byte b10) {
        boolean z10 = true;
        if (1 > b10 || b10 > 15) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: p */
    public static char m33467p(byte b10) {
        return (char) f37308B[(b10 & Byte.MAX_VALUE) - 32];
    }

    /* renamed from: q */
    public static int m33468q(byte b10) {
        return (b10 >> 3) & 1;
    }

    /* renamed from: s */
    public static char m33469s(byte b10) {
        return (char) f37310D[b10 & 31];
    }

    /* renamed from: t */
    public static char m33470t(byte b10) {
        return (char) f37311E[b10 & 31];
    }

    /* renamed from: u */
    public static char m33471u(byte b10, byte b11) {
        return (b10 & 1) == 0 ? m33469s(b11) : m33470t(b11);
    }

    /* renamed from: v */
    public static char m33472v(byte b10) {
        return (char) f37309C[b10 & 15];
    }

    /* renamed from: z */
    public static boolean m33473z(byte b10) {
        return (b10 & 224) == 0;
    }

    /* renamed from: F */
    public final boolean m33474F(boolean z10, byte b10, byte b11) {
        if (!z10 || !m33461E(b10)) {
            this.f37327s = false;
            return false;
        }
        if (this.f37327s && this.f37328t == b10 && this.f37329u == b11) {
            this.f37327s = false;
            return true;
        }
        this.f37327s = true;
        this.f37328t = b10;
        this.f37329u = b11;
        return false;
    }

    /* renamed from: K */
    public final void m33475K(byte b10, byte b11) {
        if (!m33465J(b10)) {
            if (m33462G(b10)) {
                if (b11 != 32 && b11 != 47) {
                    switch (b11) {
                        default:
                            switch (b11) {
                            }
                            return;
                        case 37:
                        case 38:
                        case 39:
                            this.f37331w = true;
                            return;
                    }
                }
                this.f37331w = true;
                return;
            }
            return;
        }
        this.f37331w = false;
    }

    /* renamed from: L */
    public final void m33476L() {
        this.f37321m.m33504j(this.f37324p);
        this.f37320l.clear();
        this.f37320l.add(this.f37321m);
    }

    /* renamed from: M */
    public final void m33477M(int i10) {
        int i11 = this.f37324p;
        if (i11 == i10) {
            return;
        }
        this.f37324p = i10;
        if (i10 == 3) {
            for (int i12 = 0; i12 < this.f37320l.size(); i12++) {
                this.f37320l.get(i12).m33506l(i10);
            }
            return;
        }
        m33476L();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.f37322n = Collections.emptyList();
        }
    }

    /* renamed from: N */
    public final void m33478N(int i10) {
        this.f37325q = i10;
        this.f37321m.m33507m(i10);
    }

    /* renamed from: O */
    public final boolean m33479O() {
        boolean z10 = false;
        if (this.f37319k != -9223372036854775807L) {
            if (this.f37332x == -9223372036854775807L) {
                z10 = false;
            } else {
                z10 = false;
                if (m33549j() - this.f37332x >= this.f37319k) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    /* renamed from: P */
    public final boolean m33480P(byte b10) {
        if (m33473z(b10)) {
            this.f37330v = m33468q(b10);
        }
        return this.f37330v == this.f37318j;
    }

    @Override // p269p8.AbstractC7668e, p243o8.InterfaceC6924f
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo31878a(long j10) {
        super.mo31878a(j10);
    }

    @Override // p269p8.AbstractC7668e
    /* renamed from: e */
    public InterfaceC6923e mo33482e() {
        List<C6919a> list = this.f37322n;
        this.f37323o = list;
        return new C7669f((List) C4349a.m21882e(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x001d A[SYNTHETIC] */
    @Override // p269p8.AbstractC7668e
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo33483f(p243o8.C6927i r6) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p269p8.C7664a.mo33483f(o8.i):void");
    }

    @Override // p269p8.AbstractC7668e, p332t6.InterfaceC8635c
    public void flush() {
        super.flush();
        this.f37322n = null;
        this.f37323o = null;
        m33477M(0);
        m33478N(4);
        m33476L();
        this.f37326r = false;
        this.f37327s = false;
        this.f37328t = (byte) 0;
        this.f37329u = (byte) 0;
        this.f37330v = 0;
        this.f37331w = true;
        this.f37332x = -9223372036854775807L;
    }

    @Override // p269p8.AbstractC7668e
    /* renamed from: g */
    public /* bridge */ /* synthetic */ C6927i mo33547d() {
        return super.mo33547d();
    }

    @Override // p332t6.InterfaceC8635c
    public String getName() {
        return "Cea608Decoder";
    }

    @Override // p269p8.AbstractC7668e, p332t6.InterfaceC8635c
    /* renamed from: h */
    public AbstractC6928j mo33481b() {
        AbstractC6928j m33548i;
        AbstractC6928j mo33481b = super.mo33481b();
        if (mo33481b != null) {
            return mo33481b;
        }
        if (!m33479O() || (m33548i = m33548i()) == null) {
            return null;
        }
        this.f37322n = Collections.emptyList();
        this.f37332x = -9223372036854775807L;
        m33548i.m31889e(m33549j(), mo33482e(), Long.MAX_VALUE);
        return m33548i;
    }

    @Override // p269p8.AbstractC7668e
    /* renamed from: k */
    public boolean mo33486k() {
        return this.f37322n != this.f37323o;
    }

    @Override // p269p8.AbstractC7668e
    /* renamed from: l */
    public /* bridge */ /* synthetic */ void mo33546c(C6927i c6927i) {
        super.mo33546c(c6927i);
    }

    /* renamed from: r */
    public final List<C6919a> m33488r() {
        int size = this.f37320l.size();
        ArrayList arrayList = new ArrayList(size);
        int i10 = 2;
        int i11 = 0;
        while (i11 < size) {
            C6919a m33501g = this.f37320l.get(i11).m33501g(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
            arrayList.add(m33501g);
            int i12 = i10;
            if (m33501g != null) {
                i12 = Math.min(i10, m33501g.f35804i);
            }
            i11++;
            i10 = i12;
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i13 = 0; i13 < size; i13++) {
            C6919a c6919a = (C6919a) arrayList.get(i13);
            if (c6919a != null) {
                C6919a c6919a2 = c6919a;
                if (c6919a.f35804i != i10) {
                    c6919a2 = (C6919a) C4349a.m21882e(this.f37320l.get(i13).m33501g(i10));
                }
                arrayList2.add(c6919a2);
            }
        }
        return arrayList2;
    }

    @Override // p269p8.AbstractC7668e, p332t6.InterfaceC8635c
    public void release() {
    }

    /* renamed from: w */
    public final void m33489w(byte b10) {
        this.f37321m.m33499e(' ');
        this.f37321m.m33508p((b10 >> 1) & 7, (b10 & 1) == 1);
    }

    /* renamed from: x */
    public final void m33490x(byte b10) {
        if (b10 == 32) {
            m33477M(2);
            return;
        }
        if (b10 == 41) {
            m33477M(3);
            return;
        }
        switch (b10) {
            case 37:
                m33477M(1);
                m33478N(2);
                break;
            case 38:
                m33477M(1);
                m33478N(3);
                break;
            case 39:
                m33477M(1);
                m33478N(4);
                break;
            default:
                int i10 = this.f37324p;
                if (i10 != 0) {
                    if (b10 == 33) {
                        this.f37321m.m33500f();
                        break;
                    } else {
                        switch (b10) {
                            case 44:
                                this.f37322n = Collections.emptyList();
                                int i11 = this.f37324p;
                                if (i11 != 1 && i11 != 3) {
                                }
                                break;
                            case 45:
                                if (i10 == 1 && !this.f37321m.m33503i()) {
                                    this.f37321m.m33505k();
                                    break;
                                }
                                break;
                            case 47:
                                this.f37322n = m33488r();
                                break;
                        }
                        m33476L();
                        break;
                    }
                }
                break;
        }
    }

    /* renamed from: y */
    public final void m33491y(byte b10, byte b11) {
        int i10 = f37313y[b10 & 7];
        boolean z10 = false;
        int i11 = i10;
        if ((b11 & 32) != 0) {
            i11 = i10 + 1;
        }
        if (i11 != this.f37321m.f37336d) {
            if (this.f37324p != 1 && !this.f37321m.m33503i()) {
                a aVar = new a(this.f37324p, this.f37325q);
                this.f37321m = aVar;
                this.f37320l.add(aVar);
            }
            this.f37321m.f37336d = i11;
        }
        boolean z11 = (b11 & 16) == 16;
        if ((b11 & 1) == 1) {
            z10 = true;
        }
        int i12 = (b11 >> 1) & 7;
        this.f37321m.m33508p(z11 ? 8 : i12, z10);
        if (z11) {
            this.f37321m.f37337e = f37314z[i12];
        }
    }
}

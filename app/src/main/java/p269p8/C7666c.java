package p269p8;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.imap.IMAP;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p059d9.C4349a;
import p059d9.C4356d;
import p059d9.C4359e0;
import p059d9.C4361f0;
import p059d9.C4392v;
import p243o8.AbstractC6928j;
import p243o8.C6919a;
import p243o8.C6927i;
import p243o8.InterfaceC6923e;
import p269p8.C7666c;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p8/c.class
 */
/* renamed from: p8.c */
/* loaded from: combined.jar:classes2.jar:p8/c.class */
public final class C7666c extends AbstractC7668e {

    /* renamed from: g */
    public final C4361f0 f37344g = new C4361f0();

    /* renamed from: h */
    public final C4359e0 f37345h = new C4359e0();

    /* renamed from: i */
    public int f37346i = -1;

    /* renamed from: j */
    public final boolean f37347j;

    /* renamed from: k */
    public final int f37348k;

    /* renamed from: l */
    public final b[] f37349l;

    /* renamed from: m */
    public b f37350m;

    /* renamed from: n */
    public List<C6919a> f37351n;

    /* renamed from: o */
    public List<C6919a> f37352o;

    /* renamed from: p */
    public c f37353p;

    /* renamed from: q */
    public int f37354q;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p8/c$a.class
     */
    /* renamed from: p8.c$a */
    /* loaded from: combined.jar:classes2.jar:p8/c$a.class */
    public static final class a {

        /* renamed from: c */
        public static final Comparator<a> f37355c = new Comparator() { // from class: p8.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m33528c;
                m33528c = C7666c.a.m33528c((C7666c.a) obj, (C7666c.a) obj2);
                return m33528c;
            }
        };

        /* renamed from: a */
        public final C6919a f37356a;

        /* renamed from: b */
        public final int f37357b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            C6919a.b m31870n = new C6919a.b().m31871o(charSequence).m31872p(alignment).m31864h(f10, i10).m31865i(i11).m31867k(f11).m31868l(i12).m31870n(f12);
            if (z10) {
                m31870n.m31875s(i13);
            }
            this.f37356a = m31870n.m31857a();
            this.f37357b = i14;
        }

        /* renamed from: c */
        public static /* synthetic */ int m33528c(a aVar, a aVar2) {
            return Integer.compare(aVar2.f37357b, aVar.f37357b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p8/c$b.class
     */
    /* renamed from: p8.c$b */
    /* loaded from: combined.jar:classes2.jar:p8/c$b.class */
    public static final class b {

        /* renamed from: A */
        public static final int[] f37358A;

        /* renamed from: B */
        public static final int[] f37359B;

        /* renamed from: C */
        public static final boolean[] f37360C;

        /* renamed from: D */
        public static final int[] f37361D;

        /* renamed from: E */
        public static final int[] f37362E;

        /* renamed from: F */
        public static final int[] f37363F;

        /* renamed from: G */
        public static final int[] f37364G;

        /* renamed from: w */
        public static final int f37365w = m33530h(2, 2, 2, 0);

        /* renamed from: x */
        public static final int f37366x;

        /* renamed from: y */
        public static final int f37367y;

        /* renamed from: z */
        public static final int[] f37368z;

        /* renamed from: a */
        public final List<SpannableString> f37369a = new ArrayList();

        /* renamed from: b */
        public final SpannableStringBuilder f37370b = new SpannableStringBuilder();

        /* renamed from: c */
        public boolean f37371c;

        /* renamed from: d */
        public boolean f37372d;

        /* renamed from: e */
        public int f37373e;

        /* renamed from: f */
        public boolean f37374f;

        /* renamed from: g */
        public int f37375g;

        /* renamed from: h */
        public int f37376h;

        /* renamed from: i */
        public int f37377i;

        /* renamed from: j */
        public int f37378j;

        /* renamed from: k */
        public boolean f37379k;

        /* renamed from: l */
        public int f37380l;

        /* renamed from: m */
        public int f37381m;

        /* renamed from: n */
        public int f37382n;

        /* renamed from: o */
        public int f37383o;

        /* renamed from: p */
        public int f37384p;

        /* renamed from: q */
        public int f37385q;

        /* renamed from: r */
        public int f37386r;

        /* renamed from: s */
        public int f37387s;

        /* renamed from: t */
        public int f37388t;

        /* renamed from: u */
        public int f37389u;

        /* renamed from: v */
        public int f37390v;

        static {
            int m33530h = m33530h(0, 0, 0, 0);
            f37366x = m33530h;
            int m33530h2 = m33530h(0, 0, 0, 3);
            f37367y = m33530h2;
            f37368z = new int[]{0, 0, 0, 0, 0, 2, 0};
            f37358A = new int[]{0, 0, 0, 0, 0, 0, 2};
            f37359B = new int[]{3, 3, 3, 3, 3, 3, 1};
            f37360C = new boolean[]{false, false, false, true, true, true, false};
            f37361D = new int[]{m33530h, m33530h2, m33530h, m33530h, m33530h2, m33530h, m33530h};
            f37362E = new int[]{0, 1, 2, 3, 4, 3, 4};
            f37363F = new int[]{0, 0, 0, 0, 0, 3, 3};
            f37364G = new int[]{m33530h, m33530h, m33530h, m33530h, m33530h, m33530h2, m33530h2};
        }

        public b() {
            m33540l();
        }

        /* renamed from: g */
        public static int m33529g(int i10, int i11, int i12) {
            return m33530h(i10, i11, i12, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int m33530h(int r5, int r6, int r7, int r8) {
            /*
                r0 = 0
                r9 = r0
                r0 = r5
                r1 = 0
                r2 = 4
                int r0 = p059d9.C4349a.m21880c(r0, r1, r2)
                r0 = r6
                r1 = 0
                r2 = 4
                int r0 = p059d9.C4349a.m21880c(r0, r1, r2)
                r0 = r7
                r1 = 0
                r2 = 4
                int r0 = p059d9.C4349a.m21880c(r0, r1, r2)
                r0 = r8
                r1 = 0
                r2 = 4
                int r0 = p059d9.C4349a.m21880c(r0, r1, r2)
                r0 = r8
                if (r0 == 0) goto L40
                r0 = r8
                r1 = 1
                if (r0 == r1) goto L40
                r0 = r8
                r1 = 2
                if (r0 == r1) goto L3a
                r0 = r8
                r1 = 3
                if (r0 == r1) goto L35
                goto L40
            L35:
                r0 = 0
                r8 = r0
                goto L44
            L3a:
                r0 = 127(0x7f, float:1.78E-43)
                r8 = r0
                goto L44
            L40:
                r0 = 255(0xff, float:3.57E-43)
                r8 = r0
            L44:
                r0 = r5
                r1 = 1
                if (r0 <= r1) goto L50
                r0 = 255(0xff, float:3.57E-43)
                r5 = r0
                goto L52
            L50:
                r0 = 0
                r5 = r0
            L52:
                r0 = r6
                r1 = 1
                if (r0 <= r1) goto L5e
                r0 = 255(0xff, float:3.57E-43)
                r6 = r0
                goto L60
            L5e:
                r0 = 0
                r6 = r0
            L60:
                r0 = r7
                r1 = 1
                if (r0 <= r1) goto L6a
                r0 = 255(0xff, float:3.57E-43)
                r9 = r0
            L6a:
                r0 = r8
                r1 = r5
                r2 = r6
                r3 = r9
                int r0 = android.graphics.Color.argb(r0, r1, r2, r3)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p269p8.C7666c.b.m33530h(int, int, int, int):int");
        }

        /* renamed from: a */
        public void m33531a(char c10) {
            if (c10 != '\n') {
                this.f37370b.append(c10);
                return;
            }
            this.f37369a.add(m33534d());
            this.f37370b.clear();
            if (this.f37384p != -1) {
                this.f37384p = 0;
            }
            if (this.f37385q != -1) {
                this.f37385q = 0;
            }
            if (this.f37386r != -1) {
                this.f37386r = 0;
            }
            if (this.f37388t != -1) {
                this.f37388t = 0;
            }
            while (true) {
                if ((!this.f37379k || this.f37369a.size() < this.f37378j) && this.f37369a.size() < 15) {
                    return;
                } else {
                    this.f37369a.remove(0);
                }
            }
        }

        /* renamed from: b */
        public void m33532b() {
            int length = this.f37370b.length();
            if (length > 0) {
                this.f37370b.delete(length - 1, length);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00e2  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00fd  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0103  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00c3  */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p269p8.C7666c.a m33533c() {
            /*
                Method dump skipped, instructions count: 331
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p269p8.C7666c.b.m33533c():p8.c$a");
        }

        /* renamed from: d */
        public SpannableString m33534d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f37370b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f37384p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f37384p, length, 33);
                }
                if (this.f37385q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f37385q, length, 33);
                }
                if (this.f37386r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f37387s), this.f37386r, length, 33);
                }
                if (this.f37388t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f37389u), this.f37388t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: e */
        public void m33535e() {
            this.f37369a.clear();
            this.f37370b.clear();
            this.f37384p = -1;
            this.f37385q = -1;
            this.f37386r = -1;
            this.f37388t = -1;
            this.f37390v = 0;
        }

        /* renamed from: f */
        public void m33536f(boolean z10, boolean z11, boolean z12, int i10, boolean z13, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f37371c = true;
            this.f37372d = z10;
            this.f37379k = z11;
            this.f37373e = i10;
            this.f37374f = z13;
            this.f37375g = i11;
            this.f37376h = i12;
            this.f37377i = i15;
            int i18 = i13 + 1;
            if (this.f37378j != i18) {
                this.f37378j = i18;
                while (true) {
                    if ((!z11 || this.f37369a.size() < this.f37378j) && this.f37369a.size() < 15) {
                        break;
                    } else {
                        this.f37369a.remove(0);
                    }
                }
            }
            if (i16 != 0 && this.f37381m != i16) {
                this.f37381m = i16;
                int i19 = i16 - 1;
                m33545q(f37361D[i19], f37367y, f37360C[i19], 0, f37358A[i19], f37359B[i19], f37368z[i19]);
            }
            if (i17 == 0 || this.f37382n == i17) {
                return;
            }
            this.f37382n = i17;
            int i20 = i17 - 1;
            m33541m(0, 1, 1, false, false, f37363F[i20], f37362E[i20]);
            m33542n(f37365w, f37364G[i20], f37366x);
        }

        /* renamed from: i */
        public boolean m33537i() {
            return this.f37371c;
        }

        /* renamed from: j */
        public boolean m33538j() {
            return !m33537i() || (this.f37369a.isEmpty() && this.f37370b.length() == 0);
        }

        /* renamed from: k */
        public boolean m33539k() {
            return this.f37372d;
        }

        /* renamed from: l */
        public void m33540l() {
            m33535e();
            this.f37371c = false;
            this.f37372d = false;
            this.f37373e = 4;
            this.f37374f = false;
            this.f37375g = 0;
            this.f37376h = 0;
            this.f37377i = 0;
            this.f37378j = 15;
            this.f37379k = true;
            this.f37380l = 0;
            this.f37381m = 0;
            this.f37382n = 0;
            int i10 = f37366x;
            this.f37383o = i10;
            this.f37387s = f37365w;
            this.f37389u = i10;
        }

        /* renamed from: m */
        public void m33541m(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.f37384p != -1) {
                if (!z10) {
                    this.f37370b.setSpan(new StyleSpan(2), this.f37384p, this.f37370b.length(), 33);
                    this.f37384p = -1;
                }
            } else if (z10) {
                this.f37384p = this.f37370b.length();
            }
            if (this.f37385q == -1) {
                if (z11) {
                    this.f37385q = this.f37370b.length();
                }
            } else {
                if (z11) {
                    return;
                }
                this.f37370b.setSpan(new UnderlineSpan(), this.f37385q, this.f37370b.length(), 33);
                this.f37385q = -1;
            }
        }

        /* renamed from: n */
        public void m33542n(int i10, int i11, int i12) {
            if (this.f37386r != -1 && this.f37387s != i10) {
                this.f37370b.setSpan(new ForegroundColorSpan(this.f37387s), this.f37386r, this.f37370b.length(), 33);
            }
            if (i10 != f37365w) {
                this.f37386r = this.f37370b.length();
                this.f37387s = i10;
            }
            if (this.f37388t != -1 && this.f37389u != i11) {
                this.f37370b.setSpan(new BackgroundColorSpan(this.f37389u), this.f37388t, this.f37370b.length(), 33);
            }
            if (i11 != f37366x) {
                this.f37388t = this.f37370b.length();
                this.f37389u = i11;
            }
        }

        /* renamed from: o */
        public void m33543o(int i10, int i11) {
            if (this.f37390v != i10) {
                m33531a('\n');
            }
            this.f37390v = i10;
        }

        /* renamed from: p */
        public void m33544p(boolean z10) {
            this.f37372d = z10;
        }

        /* renamed from: q */
        public void m33545q(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f37383o = i10;
            this.f37380l = i15;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p8/c$c.class
     */
    /* renamed from: p8.c$c */
    /* loaded from: combined.jar:classes2.jar:p8/c$c.class */
    public static final class c {

        /* renamed from: a */
        public final int f37391a;

        /* renamed from: b */
        public final int f37392b;

        /* renamed from: c */
        public final byte[] f37393c;

        /* renamed from: d */
        public int f37394d = 0;

        public c(int i10, int i11) {
            this.f37391a = i10;
            this.f37392b = i11;
            this.f37393c = new byte[(i11 * 2) - 1];
        }
    }

    public C7666c(int i10, List<byte[]> list) {
        boolean z10 = true;
        this.f37348k = i10 == -1 ? 1 : i10;
        this.f37347j = (list == null || !C4356d.m21936h(list)) ? false : z10;
        this.f37349l = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f37349l[i11] = new b();
        }
        this.f37350m = this.f37349l[0];
    }

    /* renamed from: A */
    public final void m33509A() {
        int m33530h = b.m33530h(this.f37345h.m21950h(2), this.f37345h.m21950h(2), this.f37345h.m21950h(2), this.f37345h.m21950h(2));
        int m33530h2 = b.m33530h(this.f37345h.m21950h(2), this.f37345h.m21950h(2), this.f37345h.m21950h(2), this.f37345h.m21950h(2));
        this.f37345h.m21960r(2);
        this.f37350m.m33542n(m33530h, m33530h2, b.m33529g(this.f37345h.m21950h(2), this.f37345h.m21950h(2), this.f37345h.m21950h(2)));
    }

    /* renamed from: B */
    public final void m33510B() {
        this.f37345h.m21960r(4);
        int m21950h = this.f37345h.m21950h(4);
        this.f37345h.m21960r(2);
        this.f37350m.m33543o(m21950h, this.f37345h.m21950h(6));
    }

    /* renamed from: C */
    public final void m33511C() {
        int m33530h = b.m33530h(this.f37345h.m21950h(2), this.f37345h.m21950h(2), this.f37345h.m21950h(2), this.f37345h.m21950h(2));
        int m21950h = this.f37345h.m21950h(2);
        int m33529g = b.m33529g(this.f37345h.m21950h(2), this.f37345h.m21950h(2), this.f37345h.m21950h(2));
        int i10 = m21950h;
        if (this.f37345h.m21949g()) {
            i10 = m21950h | 4;
        }
        boolean m21949g = this.f37345h.m21949g();
        int m21950h2 = this.f37345h.m21950h(2);
        int m21950h3 = this.f37345h.m21950h(2);
        int m21950h4 = this.f37345h.m21950h(2);
        this.f37345h.m21960r(8);
        this.f37350m.m33545q(m33530h, m33529g, m21949g, i10, m21950h2, m21950h3, m21950h4);
    }

    @RequiresNonNull({"currentDtvCcPacket"})
    /* renamed from: D */
    public final void m33512D() {
        StringBuilder sb2;
        String str;
        c cVar = this.f37353p;
        if (cVar.f37394d != (cVar.f37392b * 2) - 1) {
            C4392v.m22268b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f37353p.f37392b * 2) - 1) + ", but current index is " + this.f37353p.f37394d + " (sequence number " + this.f37353p.f37391a + ");");
        }
        C4359e0 c4359e0 = this.f37345h;
        c cVar2 = this.f37353p;
        c4359e0.m21957o(cVar2.f37393c, cVar2.f37394d);
        int m21950h = this.f37345h.m21950h(3);
        int m21950h2 = this.f37345h.m21950h(5);
        int i10 = m21950h;
        if (m21950h == 7) {
            this.f37345h.m21960r(2);
            int m21950h3 = this.f37345h.m21950h(6);
            i10 = m21950h3;
            if (m21950h3 < 7) {
                C4392v.m22275i("Cea708Decoder", "Invalid extended service number: " + m21950h3);
                i10 = m21950h3;
            }
        }
        if (m21950h2 == 0) {
            if (i10 != 0) {
                C4392v.m22275i("Cea708Decoder", "serviceNumber is non-zero (" + i10 + ") when blockSize is 0");
                return;
            }
            return;
        }
        if (i10 != this.f37348k) {
            return;
        }
        boolean z10 = false;
        while (this.f37345h.m21944b() > 0) {
            int m21950h4 = this.f37345h.m21950h(8);
            if (m21950h4 == 16) {
                m21950h4 = this.f37345h.m21950h(8);
                if (m21950h4 <= 31) {
                    m33518s(m21950h4);
                } else {
                    if (m21950h4 <= 127) {
                        m33523x(m21950h4);
                    } else if (m21950h4 <= 159) {
                        m33519t(m21950h4);
                    } else if (m21950h4 <= 255) {
                        m33524y(m21950h4);
                    } else {
                        sb2 = new StringBuilder();
                        str = "Invalid extended command: ";
                        sb2.append(str);
                        sb2.append(m21950h4);
                        C4392v.m22275i("Cea708Decoder", sb2.toString());
                    }
                    z10 = true;
                }
            } else if (m21950h4 <= 31) {
                m33516q(m21950h4);
            } else {
                if (m21950h4 <= 127) {
                    m33521v(m21950h4);
                } else if (m21950h4 <= 159) {
                    m33517r(m21950h4);
                } else if (m21950h4 <= 255) {
                    m33522w(m21950h4);
                } else {
                    sb2 = new StringBuilder();
                    str = "Invalid base command: ";
                    sb2.append(str);
                    sb2.append(m21950h4);
                    C4392v.m22275i("Cea708Decoder", sb2.toString());
                }
                z10 = true;
            }
        }
        if (z10) {
            this.f37351n = m33515p();
        }
    }

    /* renamed from: E */
    public final void m33513E() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f37349l[i10].m33540l();
        }
    }

    @Override // p269p8.AbstractC7668e, p243o8.InterfaceC6924f
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo31878a(long j10) {
        super.mo31878a(j10);
    }

    @Override // p269p8.AbstractC7668e
    /* renamed from: e */
    public InterfaceC6923e mo33482e() {
        List<C6919a> list = this.f37351n;
        this.f37352o = list;
        return new C7669f((List) C4349a.m21882e(list));
    }

    @Override // p269p8.AbstractC7668e
    /* renamed from: f */
    public void mo33483f(C6927i c6927i) {
        ByteBuffer byteBuffer = (ByteBuffer) C4349a.m21882e(c6927i.f40327c);
        this.f37344g.m21981N(byteBuffer.array(), byteBuffer.limit());
        while (this.f37344g.m21985a() >= 3) {
            int m21971D = this.f37344g.m21971D() & 7;
            int i10 = m21971D & 3;
            boolean z10 = false;
            boolean z11 = (m21971D & 4) == 4;
            byte m21971D2 = (byte) this.f37344g.m21971D();
            byte m21971D3 = (byte) this.f37344g.m21971D();
            if (i10 == 2 || i10 == 3) {
                if (z11) {
                    if (i10 == 3) {
                        m33514o();
                        int i11 = (m21971D2 & 192) >> 6;
                        int i12 = this.f37346i;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            m33513E();
                            C4392v.m22275i("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f37346i + " current=" + i11);
                        }
                        this.f37346i = i11;
                        int i13 = m21971D2 & 63;
                        int i14 = i13;
                        if (i13 == 0) {
                            i14 = 64;
                        }
                        c cVar = new c(i11, i14);
                        this.f37353p = cVar;
                        byte[] bArr = cVar.f37393c;
                        int i15 = cVar.f37394d;
                        cVar.f37394d = i15 + 1;
                        bArr[i15] = m21971D3;
                    } else {
                        if (i10 == 2) {
                            z10 = true;
                        }
                        C4349a.m21878a(z10);
                        c cVar2 = this.f37353p;
                        if (cVar2 == null) {
                            C4392v.m22270d("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = cVar2.f37393c;
                            int i16 = cVar2.f37394d;
                            int i17 = i16 + 1;
                            bArr2[i16] = m21971D2;
                            cVar2.f37394d = i17 + 1;
                            bArr2[i17] = m21971D3;
                        }
                    }
                    c cVar3 = this.f37353p;
                    if (cVar3.f37394d == (cVar3.f37392b * 2) - 1) {
                        m33514o();
                    }
                }
            }
        }
    }

    @Override // p269p8.AbstractC7668e, p332t6.InterfaceC8635c
    public void flush() {
        super.flush();
        this.f37351n = null;
        this.f37352o = null;
        this.f37354q = 0;
        this.f37350m = this.f37349l[0];
        m33513E();
        this.f37353p = null;
    }

    @Override // p269p8.AbstractC7668e
    /* renamed from: g */
    public /* bridge */ /* synthetic */ C6927i mo33547d() {
        return super.mo33547d();
    }

    @Override // p332t6.InterfaceC8635c
    public String getName() {
        return "Cea708Decoder";
    }

    @Override // p269p8.AbstractC7668e
    /* renamed from: h */
    public /* bridge */ /* synthetic */ AbstractC6928j mo33481b() {
        return super.mo33481b();
    }

    @Override // p269p8.AbstractC7668e
    /* renamed from: k */
    public boolean mo33486k() {
        return this.f37351n != this.f37352o;
    }

    @Override // p269p8.AbstractC7668e
    /* renamed from: l */
    public /* bridge */ /* synthetic */ void mo33546c(C6927i c6927i) {
        super.mo33546c(c6927i);
    }

    /* renamed from: o */
    public final void m33514o() {
        if (this.f37353p == null) {
            return;
        }
        m33512D();
        this.f37353p = null;
    }

    /* renamed from: p */
    public final List<C6919a> m33515p() {
        a m33533c;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f37349l[i10].m33538j() && this.f37349l[i10].m33539k() && (m33533c = this.f37349l[i10].m33533c()) != null) {
                arrayList.add(m33533c);
            }
        }
        Collections.sort(arrayList, a.f37355c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f37356a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    /* renamed from: q */
    public final void m33516q(int i10) {
        C4359e0 c4359e0;
        int i11;
        if (i10 != 0) {
            if (i10 == 3) {
                this.f37351n = m33515p();
            }
            if (i10 == 8) {
                this.f37350m.m33532b();
                return;
            }
            switch (i10) {
                case 12:
                    m33513E();
                    break;
                case 13:
                    this.f37350m.m33531a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i10 >= 17 && i10 <= 23) {
                        C4392v.m22275i("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i10);
                        c4359e0 = this.f37345h;
                        i11 = 8;
                    } else if (i10 < 24 || i10 > 31) {
                        C4392v.m22275i("Cea708Decoder", "Invalid C0 command: " + i10);
                        break;
                    } else {
                        C4392v.m22275i("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i10);
                        c4359e0 = this.f37345h;
                        i11 = 16;
                    }
                    c4359e0.m21960r(i11);
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: r */
    public final void m33517r(int i10) {
        b bVar;
        C4359e0 c4359e0;
        int i11;
        switch (i10) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i12 = i10 - 128;
                if (this.f37354q != i12) {
                    this.f37354q = i12;
                    bVar = this.f37349l[i12];
                    this.f37350m = bVar;
                    break;
                }
                break;
            case 136:
                for (int i13 = 1; i13 <= 8; i13++) {
                    if (this.f37345h.m21949g()) {
                        this.f37349l[8 - i13].m33535e();
                    }
                }
                break;
            case 137:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f37345h.m21949g()) {
                        this.f37349l[8 - i14].m33544p(true);
                    }
                }
                break;
            case 138:
                for (int i15 = 1; i15 <= 8; i15++) {
                    if (this.f37345h.m21949g()) {
                        this.f37349l[8 - i15].m33544p(false);
                    }
                }
                break;
            case 139:
                for (int i16 = 1; i16 <= 8; i16++) {
                    if (this.f37345h.m21949g()) {
                        this.f37349l[8 - i16].m33544p(!r0.m33539k());
                    }
                }
                break;
            case 140:
                for (int i17 = 1; i17 <= 8; i17++) {
                    if (this.f37345h.m21949g()) {
                        this.f37349l[8 - i17].m33540l();
                    }
                }
                break;
            case 141:
                this.f37345h.m21960r(8);
                break;
            case 142:
                break;
            case IMAP.DEFAULT_PORT /* 143 */:
                m33513E();
                break;
            case IjkMediaMeta.FF_PROFILE_H264_HIGH_444 /* 144 */:
                if (this.f37350m.m33537i()) {
                    m33525z();
                    break;
                }
                c4359e0 = this.f37345h;
                i11 = 16;
                c4359e0.m21960r(i11);
                break;
            case 145:
                if (this.f37350m.m33537i()) {
                    m33509A();
                    break;
                } else {
                    c4359e0 = this.f37345h;
                    i11 = 24;
                    c4359e0.m21960r(i11);
                    break;
                }
            case 146:
                if (this.f37350m.m33537i()) {
                    m33510B();
                    break;
                }
                c4359e0 = this.f37345h;
                i11 = 16;
                c4359e0.m21960r(i11);
                break;
            case 147:
            case 148:
            case 149:
            case FTPReply.FILE_STATUS_OK /* 150 */:
            default:
                C4392v.m22275i("Cea708Decoder", "Invalid C1 command: " + i10);
                break;
            case 151:
                if (this.f37350m.m33537i()) {
                    m33511C();
                    break;
                } else {
                    c4359e0 = this.f37345h;
                    i11 = 32;
                    c4359e0.m21960r(i11);
                    break;
                }
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i18 = i10 - 152;
                m33520u(i18);
                if (this.f37354q != i18) {
                    this.f37354q = i18;
                    bVar = this.f37349l[i18];
                    this.f37350m = bVar;
                    break;
                }
                break;
        }
    }

    @Override // p269p8.AbstractC7668e, p332t6.InterfaceC8635c
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    /* renamed from: s */
    public final void m33518s(int i10) {
        C4359e0 c4359e0;
        int i11;
        if (i10 <= 7) {
            return;
        }
        if (i10 <= 15) {
            c4359e0 = this.f37345h;
            i11 = 8;
        } else if (i10 <= 23) {
            c4359e0 = this.f37345h;
            i11 = 16;
        } else {
            if (i10 > 31) {
                return;
            }
            c4359e0 = this.f37345h;
            i11 = 24;
        }
        c4359e0.m21960r(i11);
    }

    /* renamed from: t */
    public final void m33519t(int i10) {
        C4359e0 c4359e0;
        int i11;
        if (i10 <= 135) {
            c4359e0 = this.f37345h;
            i11 = 32;
        } else {
            if (i10 > 143) {
                if (i10 <= 159) {
                    this.f37345h.m21960r(2);
                    this.f37345h.m21960r(this.f37345h.m21950h(6) * 8);
                    return;
                }
                return;
            }
            c4359e0 = this.f37345h;
            i11 = 40;
        }
        c4359e0.m21960r(i11);
    }

    /* renamed from: u */
    public final void m33520u(int i10) {
        b bVar = this.f37349l[i10];
        this.f37345h.m21960r(2);
        boolean m21949g = this.f37345h.m21949g();
        boolean m21949g2 = this.f37345h.m21949g();
        boolean m21949g3 = this.f37345h.m21949g();
        int m21950h = this.f37345h.m21950h(3);
        boolean m21949g4 = this.f37345h.m21949g();
        int m21950h2 = this.f37345h.m21950h(7);
        int m21950h3 = this.f37345h.m21950h(8);
        int m21950h4 = this.f37345h.m21950h(4);
        int m21950h5 = this.f37345h.m21950h(4);
        this.f37345h.m21960r(2);
        int m21950h6 = this.f37345h.m21950h(6);
        this.f37345h.m21960r(2);
        bVar.m33536f(m21949g, m21949g2, m21949g3, m21950h, m21949g4, m21950h2, m21950h3, m21950h5, m21950h6, m21950h4, this.f37345h.m21950h(3), this.f37345h.m21950h(3));
    }

    /* renamed from: v */
    public final void m33521v(int i10) {
        if (i10 == 127) {
            this.f37350m.m33531a((char) 9835);
        } else {
            this.f37350m.m33531a((char) (i10 & 255));
        }
    }

    /* renamed from: w */
    public final void m33522w(int i10) {
        this.f37350m.m33531a((char) (i10 & 255));
    }

    /* renamed from: x */
    public final void m33523x(int i10) {
        b bVar;
        char c10 = ' ';
        if (i10 == 32) {
            bVar = this.f37350m;
        } else if (i10 == 33) {
            bVar = this.f37350m;
            c10 = 160;
        } else if (i10 == 37) {
            bVar = this.f37350m;
            c10 = 8230;
        } else if (i10 == 42) {
            bVar = this.f37350m;
            c10 = 352;
        } else if (i10 == 44) {
            bVar = this.f37350m;
            c10 = 338;
        } else if (i10 == 63) {
            bVar = this.f37350m;
            c10 = 376;
        } else if (i10 == 57) {
            bVar = this.f37350m;
            c10 = 8482;
        } else if (i10 == 58) {
            bVar = this.f37350m;
            c10 = 353;
        } else if (i10 == 60) {
            bVar = this.f37350m;
            c10 = 339;
        } else if (i10 != 61) {
            switch (i10) {
                case 48:
                    bVar = this.f37350m;
                    c10 = 9608;
                    break;
                case 49:
                    bVar = this.f37350m;
                    c10 = 8216;
                    break;
                case 50:
                    bVar = this.f37350m;
                    c10 = 8217;
                    break;
                case 51:
                    bVar = this.f37350m;
                    c10 = 8220;
                    break;
                case 52:
                    bVar = this.f37350m;
                    c10 = 8221;
                    break;
                case 53:
                    bVar = this.f37350m;
                    c10 = 8226;
                    break;
                default:
                    switch (i10) {
                        case 118:
                            bVar = this.f37350m;
                            c10 = 8539;
                            break;
                        case 119:
                            bVar = this.f37350m;
                            c10 = 8540;
                            break;
                        case 120:
                            bVar = this.f37350m;
                            c10 = 8541;
                            break;
                        case 121:
                            bVar = this.f37350m;
                            c10 = 8542;
                            break;
                        case 122:
                            bVar = this.f37350m;
                            c10 = 9474;
                            break;
                        case 123:
                            bVar = this.f37350m;
                            c10 = 9488;
                            break;
                        case 124:
                            bVar = this.f37350m;
                            c10 = 9492;
                            break;
                        case 125:
                            bVar = this.f37350m;
                            c10 = 9472;
                            break;
                        case 126:
                            bVar = this.f37350m;
                            c10 = 9496;
                            break;
                        case 127:
                            bVar = this.f37350m;
                            c10 = 9484;
                            break;
                        default:
                            C4392v.m22275i("Cea708Decoder", "Invalid G2 character: " + i10);
                            return;
                    }
            }
        } else {
            bVar = this.f37350m;
            c10 = 8480;
        }
        bVar.m33531a(c10);
    }

    /* renamed from: y */
    public final void m33524y(int i10) {
        b bVar;
        char c10;
        if (i10 == 160) {
            bVar = this.f37350m;
            c10 = 13252;
        } else {
            C4392v.m22275i("Cea708Decoder", "Invalid G3 character: " + i10);
            bVar = this.f37350m;
            c10 = '_';
        }
        bVar.m33531a(c10);
    }

    /* renamed from: z */
    public final void m33525z() {
        this.f37350m.m33541m(this.f37345h.m21950h(4), this.f37345h.m21950h(2), this.f37345h.m21950h(2), this.f37345h.m21949g(), this.f37345h.m21949g(), this.f37345h.m21950h(3), this.f37345h.m21950h(3));
    }
}

package androidx.leanback.widget;

import org.apache.http.impl.auth.NTLMEngineImpl;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/g1.class
 */
/* renamed from: androidx.leanback.widget.g1 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/g1.class */
public class C0513g1 {

    /* renamed from: a */
    public int f3424a = 0;

    /* renamed from: b */
    public final a f3425b;

    /* renamed from: c */
    public final a f3426c;

    /* renamed from: d */
    public a f3427d;

    /* renamed from: e */
    public a f3428e;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/g1$a.class
     */
    /* renamed from: androidx.leanback.widget.g1$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/g1$a.class */
    public static class a {

        /* renamed from: a */
        public int f3429a;

        /* renamed from: b */
        public int f3430b;

        /* renamed from: c */
        public int f3431c;

        /* renamed from: d */
        public int f3432d;

        /* renamed from: e */
        public int f3433e = 2;

        /* renamed from: f */
        public int f3434f = 3;

        /* renamed from: g */
        public int f3435g = 0;

        /* renamed from: h */
        public float f3436h = 50.0f;

        /* renamed from: i */
        public int f3437i;

        /* renamed from: j */
        public int f3438j;

        /* renamed from: k */
        public int f3439k;

        /* renamed from: l */
        public boolean f3440l;

        /* renamed from: m */
        public String f3441m;

        public a(String str) {
            m2627s();
            this.f3441m = str;
        }

        /* renamed from: A */
        public final void m2607A(float f10) {
            if ((f10 < 0.0f || f10 > 100.0f) && f10 != -1.0f) {
                throw new IllegalArgumentException();
            }
            this.f3436h = f10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
        
            r6.f3431c = (r6.f3429a - r6.f3438j) - r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00bd, code lost:
        
            if (m2626r() != false) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00c0, code lost:
        
            r6.f3432d = java.lang.Math.min(r6.f3432d, m2610b(r10, r0));
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00d2, code lost:
        
            r6.f3431c = java.lang.Math.max(r6.f3432d, r6.f3431c);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00ee, code lost:
        
            if (m2625q() != false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0106, code lost:
        
            r6.f3431c = java.lang.Math.max(r6.f3431c, m2610b(r9, r0));
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0103, code lost:
        
            if (m2626r() != false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0133, code lost:
        
            if (m2625q() != false) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
        
            r7 = r6.f3430b - r6.f3438j;
         */
        /* renamed from: B */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m2608B(int r7, int r8, int r9, int r10) {
            /*
                Method dump skipped, instructions count: 314
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0513g1.a.m2608B(int, int, int, int):void");
        }

        /* renamed from: a */
        public final int m2609a() {
            int i10;
            if (this.f3440l) {
                int i11 = this.f3435g;
                int i12 = i11 >= 0 ? this.f3437i - i11 : -i11;
                float f10 = this.f3436h;
                i10 = i12;
                if (f10 != -1.0f) {
                    i10 = i12 - ((int) ((this.f3437i * f10) / 100.0f));
                }
            } else {
                int i13 = this.f3435g;
                if (i13 < 0) {
                    i13 += this.f3437i;
                }
                float f11 = this.f3436h;
                i10 = i13;
                if (f11 != -1.0f) {
                    i10 = i13 + ((int) ((this.f3437i * f11) / 100.0f));
                }
            }
            return i10;
        }

        /* renamed from: b */
        public final int m2610b(int i10, int i11) {
            return i10 - i11;
        }

        /* renamed from: c */
        public final int m2611c() {
            return (this.f3437i - this.f3438j) - this.f3439k;
        }

        /* renamed from: d */
        public final int m2612d() {
            return this.f3431c;
        }

        /* renamed from: e */
        public final int m2613e() {
            return this.f3432d;
        }

        /* renamed from: f */
        public final int m2614f() {
            return this.f3439k;
        }

        /* renamed from: g */
        public final int m2615g() {
            return this.f3438j;
        }

        /* renamed from: h */
        public final int m2616h(int i10) {
            int m2617i = m2617i();
            int m2609a = m2609a();
            boolean m2624p = m2624p();
            boolean m2623o = m2623o();
            if (!m2624p) {
                int i11 = this.f3438j;
                if (this.f3440l ? (this.f3434f & 2) != 0 : (this.f3434f & 1) != 0) {
                    int i12 = this.f3430b;
                    if (i10 - i12 <= m2609a - i11) {
                        int i13 = i12 - i11;
                        int i14 = i13;
                        if (!m2623o) {
                            int i15 = this.f3431c;
                            i14 = i13;
                            if (i13 > i15) {
                                i14 = i15;
                            }
                        }
                        return i14;
                    }
                }
            }
            if (!m2623o) {
                int i16 = this.f3439k;
                if (this.f3440l ? (this.f3434f & 1) != 0 : (this.f3434f & 2) != 0) {
                    int i17 = this.f3429a;
                    if (i17 - i10 <= (m2617i - m2609a) - i16) {
                        int i18 = i17 - (m2617i - i16);
                        int i19 = i18;
                        if (!m2624p) {
                            int i20 = this.f3432d;
                            i19 = i18;
                            if (i18 < i20) {
                                i19 = i20;
                            }
                        }
                        return i19;
                    }
                }
            }
            return m2610b(i10, m2609a);
        }

        /* renamed from: i */
        public final int m2617i() {
            return this.f3437i;
        }

        /* renamed from: j */
        public final int m2618j() {
            return this.f3434f;
        }

        /* renamed from: k */
        public final int m2619k() {
            return this.f3435g;
        }

        /* renamed from: l */
        public final float m2620l() {
            return this.f3436h;
        }

        /* renamed from: m */
        public final void m2621m() {
            this.f3429a = Integer.MAX_VALUE;
            this.f3431c = Integer.MAX_VALUE;
        }

        /* renamed from: n */
        public final void m2622n() {
            this.f3430b = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
            this.f3432d = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
        }

        /* renamed from: o */
        public final boolean m2623o() {
            return this.f3429a == Integer.MAX_VALUE;
        }

        /* renamed from: p */
        public final boolean m2624p() {
            return this.f3430b == Integer.MIN_VALUE;
        }

        /* renamed from: q */
        public final boolean m2625q() {
            return (this.f3433e & 2) != 0;
        }

        /* renamed from: r */
        public final boolean m2626r() {
            boolean z10 = true;
            if ((this.f3433e & 1) == 0) {
                z10 = false;
            }
            return z10;
        }

        /* renamed from: s */
        public void m2627s() {
            this.f3430b = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
            this.f3429a = Integer.MAX_VALUE;
        }

        /* renamed from: t */
        public final void m2628t(int i10, int i11) {
            this.f3438j = i10;
            this.f3439k = i11;
        }

        public String toString() {
            return " min:" + this.f3430b + " " + this.f3432d + " max:" + this.f3429a + " " + this.f3431c;
        }

        /* renamed from: u */
        public final void m2629u(boolean z10) {
            this.f3433e = z10 ? this.f3433e | 2 : this.f3433e & (-3);
        }

        /* renamed from: v */
        public final void m2630v(boolean z10) {
            this.f3433e = z10 ? this.f3433e | 1 : this.f3433e & (-2);
        }

        /* renamed from: w */
        public final void m2631w(boolean z10) {
            this.f3440l = z10;
        }

        /* renamed from: x */
        public final void m2632x(int i10) {
            this.f3437i = i10;
        }

        /* renamed from: y */
        public final void m2633y(int i10) {
            this.f3434f = i10;
        }

        /* renamed from: z */
        public final void m2634z(int i10) {
            this.f3435g = i10;
        }
    }

    public C0513g1() {
        a aVar = new a("vertical");
        this.f3425b = aVar;
        a aVar2 = new a("horizontal");
        this.f3426c = aVar2;
        this.f3427d = aVar2;
        this.f3428e = aVar;
    }

    /* renamed from: a */
    public final a m2603a() {
        return this.f3427d;
    }

    /* renamed from: b */
    public final void m2604b() {
        m2603a().m2627s();
    }

    /* renamed from: c */
    public final a m2605c() {
        return this.f3428e;
    }

    /* renamed from: d */
    public final void m2606d(int i10) {
        a aVar;
        this.f3424a = i10;
        if (i10 == 0) {
            this.f3427d = this.f3426c;
            aVar = this.f3425b;
        } else {
            this.f3427d = this.f3425b;
            aVar = this.f3426c;
        }
        this.f3428e = aVar;
    }

    public String toString() {
        return "horizontal=" + this.f3426c + "; vertical=" + this.f3425b;
    }
}

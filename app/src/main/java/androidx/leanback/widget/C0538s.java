package androidx.leanback.widget;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/s.class
 */
/* renamed from: androidx.leanback.widget.s */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/s.class */
public final class C0538s {

    /* renamed from: a */
    public a[] f3602a = {new a()};

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/s$a.class
     */
    /* renamed from: androidx.leanback.widget.s$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/s$a.class */
    public static class a {

        /* renamed from: a */
        public int f3603a = -1;

        /* renamed from: b */
        public int f3604b = -1;

        /* renamed from: c */
        public int f3605c = 0;

        /* renamed from: d */
        public float f3606d = 50.0f;

        /* renamed from: e */
        public boolean f3607e = false;

        /* renamed from: f */
        public boolean f3608f;

        /* renamed from: a */
        public final int m2981a() {
            int i10 = this.f3604b;
            if (i10 == -1) {
                i10 = this.f3603a;
            }
            return i10;
        }

        /* renamed from: b */
        public final int m2982b() {
            return this.f3605c;
        }

        /* renamed from: c */
        public final float m2983c() {
            return this.f3606d;
        }

        /* renamed from: d */
        public final int m2984d() {
            return this.f3603a;
        }

        /* renamed from: e */
        public boolean m2985e() {
            return this.f3608f;
        }

        /* renamed from: f */
        public final void m2986f(int i10) {
            this.f3605c = i10;
        }

        /* renamed from: g */
        public final void m2987g(float f10) {
            if ((f10 < 0.0f || f10 > 100.0f) && f10 != -1.0f) {
                throw new IllegalArgumentException();
            }
            this.f3606d = f10;
        }

        /* renamed from: h */
        public final void m2988h(boolean z10) {
            this.f3607e = z10;
        }

        /* renamed from: i */
        public final void m2989i(int i10) {
            this.f3603a = i10;
        }
    }

    /* renamed from: a */
    public a[] m2980a() {
        return this.f3602a;
    }
}

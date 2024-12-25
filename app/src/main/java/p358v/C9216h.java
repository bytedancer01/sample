package p358v;

import java.util.Arrays;
import java.util.Comparator;
import p358v.C9210b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:v/h.class
 */
/* renamed from: v.h */
/* loaded from: combined.jar:classes1.jar:v/h.class */
public class C9216h extends C9210b {

    /* renamed from: g */
    public int f42064g;

    /* renamed from: h */
    public C9217i[] f42065h;

    /* renamed from: i */
    public C9217i[] f42066i;

    /* renamed from: j */
    public int f42067j;

    /* renamed from: k */
    public b f42068k;

    /* renamed from: l */
    public C9211c f42069l;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:v/h$a.class
     */
    /* renamed from: v.h$a */
    /* loaded from: combined.jar:classes1.jar:v/h$a.class */
    public class a implements Comparator<C9217i> {

        /* renamed from: b */
        public final C9216h f42070b;

        public a(C9216h c9216h) {
            this.f42070b = c9216h;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C9217i c9217i, C9217i c9217i2) {
            return c9217i.f42077c - c9217i2.f42077c;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:v/h$b.class
     */
    /* renamed from: v.h$b */
    /* loaded from: combined.jar:classes1.jar:v/h$b.class */
    public class b implements Comparable {

        /* renamed from: b */
        public C9217i f42071b;

        /* renamed from: c */
        public C9216h f42072c;

        /* renamed from: d */
        public final C9216h f42073d;

        public b(C9216h c9216h, C9216h c9216h2) {
            this.f42073d = c9216h;
            this.f42072c = c9216h2;
        }

        /* renamed from: a */
        public boolean m38778a(C9217i c9217i, float f10) {
            boolean z10 = true;
            if (!this.f42071b.f42075a) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float f11 = c9217i.f42083i[i10];
                    if (f11 != 0.0f) {
                        float f12 = f11 * f10;
                        float f13 = f12;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f13 = 0.0f;
                        }
                        this.f42071b.f42083i[i10] = f13;
                    } else {
                        this.f42071b.f42083i[i10] = 0.0f;
                    }
                }
                return true;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float[] fArr = this.f42071b.f42083i;
                float f14 = fArr[i11] + (c9217i.f42083i[i11] * f10);
                fArr[i11] = f14;
                if (Math.abs(f14) < 1.0E-4f) {
                    this.f42071b.f42083i[i11] = 0.0f;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                return false;
            }
            this.f42073d.m38776G(this.f42071b);
            return false;
        }

        /* renamed from: b */
        public void m38779b(C9217i c9217i) {
            this.f42071b = c9217i;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f42071b.f42077c - ((C9217i) obj).f42077c;
        }

        /* renamed from: d */
        public final boolean m38780d() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.f42071b.f42083i[i10];
                if (f10 > 0.0f) {
                    return false;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        public final boolean m38781e(C9217i c9217i) {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = c9217i.f42083i[i10];
                float f11 = this.f42071b.f42083i[i10];
                if (f11 != f10) {
                    return f11 < f10;
                }
            }
            return false;
        }

        /* renamed from: f */
        public void m38782f() {
            Arrays.fill(this.f42071b.f42083i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            String str2 = str;
            if (this.f42071b != null) {
                int i10 = 0;
                while (true) {
                    str2 = str;
                    if (i10 >= 9) {
                        break;
                    }
                    str = str + this.f42071b.f42083i[i10] + " ";
                    i10++;
                }
            }
            return str2 + "] " + this.f42071b;
        }
    }

    public C9216h(C9211c c9211c) {
        super(c9211c);
        this.f42064g = 128;
        this.f42065h = new C9217i[128];
        this.f42066i = new C9217i[128];
        this.f42067j = 0;
        this.f42068k = new b(this, this);
        this.f42069l = c9211c;
    }

    @Override // p358v.C9210b
    /* renamed from: C */
    public void mo38713C(C9210b c9210b, boolean z10) {
        C9217i c9217i = c9210b.f42031a;
        if (c9217i == null) {
            return;
        }
        C9210b.a aVar = c9210b.f42035e;
        int mo38705f = aVar.mo38705f();
        for (int i10 = 0; i10 < mo38705f; i10++) {
            C9217i mo38701b = aVar.mo38701b(i10);
            float mo38707h = aVar.mo38707h(i10);
            this.f42068k.m38779b(mo38701b);
            if (this.f42068k.m38778a(c9217i, mo38707h)) {
                m38775F(mo38701b);
            }
            this.f42032b += c9210b.f42032b * mo38707h;
        }
        m38776G(c9217i);
    }

    /* renamed from: F */
    public final void m38775F(C9217i c9217i) {
        int i10;
        int i11 = this.f42067j;
        C9217i[] c9217iArr = this.f42065h;
        if (i11 + 1 > c9217iArr.length) {
            C9217i[] c9217iArr2 = (C9217i[]) Arrays.copyOf(c9217iArr, c9217iArr.length * 2);
            this.f42065h = c9217iArr2;
            this.f42066i = (C9217i[]) Arrays.copyOf(c9217iArr2, c9217iArr2.length * 2);
        }
        C9217i[] c9217iArr3 = this.f42065h;
        int i12 = this.f42067j;
        c9217iArr3[i12] = c9217i;
        int i13 = i12 + 1;
        this.f42067j = i13;
        if (i13 > 1 && c9217iArr3[i13 - 1].f42077c > c9217i.f42077c) {
            int i14 = 0;
            while (true) {
                i10 = this.f42067j;
                if (i14 >= i10) {
                    break;
                }
                this.f42066i[i14] = this.f42065h[i14];
                i14++;
            }
            Arrays.sort(this.f42066i, 0, i10, new a(this));
            for (int i15 = 0; i15 < this.f42067j; i15++) {
                this.f42065h[i15] = this.f42066i[i15];
            }
        }
        c9217i.f42075a = true;
        c9217i.m38784a(this);
    }

    /* renamed from: G */
    public final void m38776G(C9217i c9217i) {
        int i10 = 0;
        while (i10 < this.f42067j) {
            if (this.f42065h[i10] == c9217i) {
                while (true) {
                    int i11 = this.f42067j;
                    if (i10 >= i11 - 1) {
                        this.f42067j = i11 - 1;
                        c9217i.f42075a = false;
                        return;
                    } else {
                        C9217i[] c9217iArr = this.f42065h;
                        int i12 = i10 + 1;
                        c9217iArr[i10] = c9217iArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // p358v.C9210b, p358v.C9212d.a
    /* renamed from: a */
    public C9217i mo38715a(C9212d c9212d, boolean[] zArr) {
        int i10;
        int i11;
        int i12 = 0;
        int i13 = -1;
        while (true) {
            i10 = i13;
            if (i12 >= this.f42067j) {
                break;
            }
            C9217i c9217i = this.f42065h[i12];
            if (zArr[c9217i.f42077c]) {
                i11 = i10;
            } else {
                this.f42068k.m38779b(c9217i);
                b bVar = this.f42068k;
                if (i10 == -1) {
                    i11 = i10;
                    if (!bVar.m38780d()) {
                    }
                    i11 = i12;
                } else {
                    i11 = i10;
                    if (!bVar.m38781e(this.f42065h[i10])) {
                    }
                    i11 = i12;
                }
            }
            i12++;
            i13 = i11;
        }
        if (i10 == -1) {
            return null;
        }
        return this.f42065h[i10];
    }

    @Override // p358v.C9210b, p358v.C9212d.a
    /* renamed from: b */
    public void mo38716b(C9217i c9217i) {
        this.f42068k.m38779b(c9217i);
        this.f42068k.m38782f();
        c9217i.f42083i[c9217i.f42079e] = 1.0f;
        m38775F(c9217i);
    }

    @Override // p358v.C9210b, p358v.C9212d.a
    public void clear() {
        this.f42067j = 0;
        this.f42032b = 0.0f;
    }

    @Override // p358v.C9210b
    public String toString() {
        String str = " goal -> (" + this.f42032b + ") : ";
        for (int i10 = 0; i10 < this.f42067j; i10++) {
            this.f42068k.m38779b(this.f42065h[i10]);
            str = str + this.f42068k + " ";
        }
        return str;
    }
}

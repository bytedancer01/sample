package ie;

import td.C8701p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ie/c.class
 */
/* renamed from: ie.c */
/* loaded from: combined.jar:classes2.jar:ie/c.class */
public final class C5247c {

    /* renamed from: a */
    public final int f29988a;

    /* renamed from: b */
    public final int[] f29989b;

    /* renamed from: c */
    public final C8701p[] f29990c;

    public C5247c(int i10, int[] iArr, int i11, int i12, int i13) {
        this.f29988a = i10;
        this.f29989b = iArr;
        float f10 = i13;
        this.f29990c = new C8701p[]{new C8701p(i11, f10), new C8701p(i12, f10)};
    }

    /* renamed from: a */
    public C8701p[] m26174a() {
        return this.f29990c;
    }

    /* renamed from: b */
    public int[] m26175b() {
        return this.f29989b;
    }

    /* renamed from: c */
    public int m26176c() {
        return this.f29988a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5247c) && this.f29988a == ((C5247c) obj).f29988a;
    }

    public int hashCode() {
        return this.f29988a;
    }
}

package ma;

import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/yi.class
 */
/* renamed from: ma.yi */
/* loaded from: combined.jar:classes2.jar:ma/yi.class */
public final class C6524yi {

    /* renamed from: f */
    public static final C6524yi f34187f = new C6524yi(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f34188a;

    /* renamed from: b */
    public int[] f34189b;

    /* renamed from: c */
    public Object[] f34190c;

    /* renamed from: d */
    public int f34191d;

    /* renamed from: e */
    public boolean f34192e;

    public C6524yi() {
        this(0, new int[8], new Object[8], true);
    }

    public C6524yi(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f34191d = -1;
        this.f34188a = 0;
        this.f34189b = iArr;
        this.f34190c = objArr;
        this.f34192e = z10;
    }

    /* renamed from: c */
    public static C6524yi m30175c() {
        return f34187f;
    }

    /* renamed from: e */
    public static C6524yi m30176e(C6524yi c6524yi, C6524yi c6524yi2) {
        int i10 = c6524yi.f34188a;
        int i11 = c6524yi2.f34188a;
        int[] copyOf = Arrays.copyOf(c6524yi.f34189b, 0);
        System.arraycopy(c6524yi2.f34189b, 0, copyOf, 0, 0);
        Object[] copyOf2 = Arrays.copyOf(c6524yi.f34190c, 0);
        System.arraycopy(c6524yi2.f34190c, 0, copyOf2, 0, 0);
        return new C6524yi(0, copyOf, copyOf2, true);
    }

    /* renamed from: a */
    public final int m30177a() {
        int i10 = this.f34191d;
        int i11 = i10;
        if (i10 == -1) {
            i11 = 0;
            this.f34191d = 0;
        }
        return i11;
    }

    /* renamed from: b */
    public final int m30178b() {
        int i10 = this.f34191d;
        int i11 = i10;
        if (i10 == -1) {
            i11 = 0;
            this.f34191d = 0;
        }
        return i11;
    }

    /* renamed from: d */
    public final C6524yi m30179d(C6524yi c6524yi) {
        if (c6524yi.equals(f34187f)) {
            return this;
        }
        if (!this.f34192e) {
            throw new UnsupportedOperationException();
        }
        int[] iArr = this.f34189b;
        int length = iArr.length;
        System.arraycopy(c6524yi.f34189b, 0, iArr, 0, 0);
        System.arraycopy(c6524yi.f34190c, 0, this.f34190c, 0, 0);
        this.f34188a = 0;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C6524yi)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void m30180f() {
        if (this.f34192e) {
            this.f34192e = false;
        }
    }

    /* renamed from: g */
    public final void m30181g(StringBuilder sb2, int i10) {
    }

    public final int hashCode() {
        return 506991;
    }
}

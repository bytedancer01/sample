package p009a8;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:a8/u.class
 */
/* renamed from: a8.u */
/* loaded from: combined.jar:classes2.jar:a8/u.class */
public class C0123u {

    /* renamed from: a */
    public final Object f544a;

    /* renamed from: b */
    public final int f545b;

    /* renamed from: c */
    public final int f546c;

    /* renamed from: d */
    public final long f547d;

    /* renamed from: e */
    public final int f548e;

    public C0123u(C0123u c0123u) {
        this.f544a = c0123u.f544a;
        this.f545b = c0123u.f545b;
        this.f546c = c0123u.f546c;
        this.f547d = c0123u.f547d;
        this.f548e = c0123u.f548e;
    }

    public C0123u(Object obj) {
        this(obj, -1L);
    }

    public C0123u(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    public C0123u(Object obj, int i10, int i11, long j10, int i12) {
        this.f544a = obj;
        this.f545b = i10;
        this.f546c = i11;
        this.f547d = j10;
        this.f548e = i12;
    }

    public C0123u(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public C0123u(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }

    /* renamed from: a */
    public C0123u m629a(Object obj) {
        return this.f544a.equals(obj) ? this : new C0123u(obj, this.f545b, this.f546c, this.f547d, this.f548e);
    }

    /* renamed from: b */
    public boolean m630b() {
        return this.f545b != -1;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0123u)) {
            return false;
        }
        C0123u c0123u = (C0123u) obj;
        if (!this.f544a.equals(c0123u.f544a) || this.f545b != c0123u.f545b || this.f546c != c0123u.f546c || this.f547d != c0123u.f547d || this.f548e != c0123u.f548e) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return ((((((((527 + this.f544a.hashCode()) * 31) + this.f545b) * 31) + this.f546c) * 31) + ((int) this.f547d)) * 31) + this.f548e;
    }
}

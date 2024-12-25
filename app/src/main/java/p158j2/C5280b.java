package p158j2;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:j2/b.class
 */
/* renamed from: j2.b */
/* loaded from: combined.jar:classes1.jar:j2/b.class */
public class C5280b {

    /* renamed from: a */
    public boolean f30320a;

    /* renamed from: b */
    public boolean f30321b;

    /* renamed from: c */
    public boolean f30322c;

    /* renamed from: d */
    public boolean f30323d;

    public C5280b(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f30320a = z10;
        this.f30321b = z11;
        this.f30322c = z12;
        this.f30323d = z13;
    }

    /* renamed from: a */
    public boolean m26362a() {
        return this.f30320a;
    }

    /* renamed from: b */
    public boolean m26363b() {
        return this.f30322c;
    }

    /* renamed from: c */
    public boolean m26364c() {
        return this.f30323d;
    }

    /* renamed from: d */
    public boolean m26365d() {
        return this.f30321b;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5280b)) {
            return false;
        }
        C5280b c5280b = (C5280b) obj;
        if (this.f30320a != c5280b.f30320a || this.f30321b != c5280b.f30321b || this.f30322c != c5280b.f30322c || this.f30323d != c5280b.f30323d) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        boolean z10 = this.f30320a;
        int i10 = z10 ? 1 : 0;
        if (this.f30321b) {
            i10 = (z10 ? 1 : 0) + 16;
        }
        int i11 = i10;
        if (this.f30322c) {
            i11 = i10 + 256;
        }
        int i12 = i11;
        if (this.f30323d) {
            i12 = i11 + 4096;
        }
        return i12;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f30320a), Boolean.valueOf(this.f30321b), Boolean.valueOf(this.f30322c), Boolean.valueOf(this.f30323d));
    }
}

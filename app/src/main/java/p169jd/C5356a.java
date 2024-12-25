package p169jd;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:jd/a.class
 */
/* renamed from: jd.a */
/* loaded from: combined.jar:classes2.jar:jd/a.class */
public final class C5356a extends AbstractC5361f {

    /* renamed from: a */
    public final String f30670a;

    /* renamed from: b */
    public final String f30671b;

    public C5356a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f30670a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f30671b = str2;
    }

    @Override // p169jd.AbstractC5361f
    /* renamed from: b */
    public String mo26652b() {
        return this.f30670a;
    }

    @Override // p169jd.AbstractC5361f
    /* renamed from: c */
    public String mo26653c() {
        return this.f30671b;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5361f)) {
            return false;
        }
        AbstractC5361f abstractC5361f = (AbstractC5361f) obj;
        if (!this.f30670a.equals(abstractC5361f.mo26652b()) || !this.f30671b.equals(abstractC5361f.mo26653c())) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return ((this.f30670a.hashCode() ^ 1000003) * 1000003) ^ this.f30671b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f30670a + ", version=" + this.f30671b + "}";
    }
}

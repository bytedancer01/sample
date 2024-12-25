package p223n2;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:n2/d.class
 */
/* renamed from: n2.d */
/* loaded from: combined.jar:classes1.jar:n2/d.class */
public class C6624d {

    /* renamed from: a */
    public String f34545a;

    /* renamed from: b */
    public Long f34546b;

    public C6624d(String str, long j10) {
        this.f34545a = str;
        this.f34546b = Long.valueOf(j10);
    }

    public C6624d(String str, boolean z10) {
        this(str, z10 ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6624d)) {
            return false;
        }
        C6624d c6624d = (C6624d) obj;
        if (!this.f34545a.equals(c6624d.f34545a)) {
            return false;
        }
        Long l10 = this.f34546b;
        Long l11 = c6624d.f34546b;
        if (l10 != null) {
            z10 = l10.equals(l11);
        } else if (l11 != null) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        int hashCode = this.f34545a.hashCode();
        Long l10 = this.f34546b;
        return (hashCode * 31) + (l10 != null ? l10.hashCode() : 0);
    }
}

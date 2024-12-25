package p305ra;

import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/j8.class
 */
/* renamed from: ra.j8 */
/* loaded from: combined.jar:classes2.jar:ra/j8.class */
public final class C8203j8 implements Map.Entry, Comparable<C8203j8> {

    /* renamed from: b */
    public final Comparable f39134b;

    /* renamed from: c */
    public Object f39135c;

    /* renamed from: d */
    public final C8248m8 f39136d;

    public C8203j8(C8248m8 c8248m8, Comparable comparable, Object obj) {
        this.f39136d = c8248m8;
        this.f39134b = comparable;
        this.f39135c = obj;
    }

    /* renamed from: e */
    public static final boolean m35515e(Object obj, Object obj2) {
        boolean equals;
        if (obj != null) {
            equals = obj.equals(obj2);
        } else {
            if (obj2 == null) {
                return true;
            }
            equals = false;
        }
        return equals;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C8203j8 c8203j8) {
        return this.f39134b.compareTo(c8203j8.f39134b);
    }

    /* renamed from: d */
    public final Comparable m35516d() {
        return this.f39134b;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m35515e(this.f39134b, entry.getKey()) && m35515e(this.f39135c, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.f39134b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f39135c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f39134b;
        int i10 = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f39135c;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return hashCode ^ i10;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f39136d.m35624n();
        Object obj2 = this.f39135c;
        this.f39135c = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f39134b);
        String valueOf2 = String.valueOf(this.f39135c);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb2.append(valueOf);
        sb2.append("=");
        sb2.append(valueOf2);
        return sb2.toString();
    }
}

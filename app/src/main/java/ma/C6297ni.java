package ma;

import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/ni.class
 */
/* renamed from: ma.ni */
/* loaded from: combined.jar:classes2.jar:ma/ni.class */
public final class C6297ni implements Map.Entry, Comparable {

    /* renamed from: b */
    public final Comparable f33915b;

    /* renamed from: c */
    public Object f33916c;

    /* renamed from: d */
    public final C6423ti f33917d;

    public C6297ni(C6423ti c6423ti, Comparable comparable, Object obj) {
        this.f33917d = c6423ti;
        this.f33915b = comparable;
        this.f33916c = obj;
    }

    /* renamed from: e */
    public static final boolean m29919e(Object obj, Object obj2) {
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
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f33915b.compareTo(((C6297ni) obj).f33915b);
    }

    /* renamed from: d */
    public final Comparable m29920d() {
        return this.f33915b;
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
        return m29919e(this.f33915b, entry.getKey()) && m29919e(this.f33916c, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f33915b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f33916c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f33915b;
        int i10 = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f33916c;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return hashCode ^ i10;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f33917d.m30057o();
        Object obj2 = this.f33916c;
        this.f33916c = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f33915b) + "=" + String.valueOf(this.f33916c);
    }
}

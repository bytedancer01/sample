package p447zg;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zg/a0.class
 */
/* renamed from: zg.a0 */
/* loaded from: combined.jar:classes2.jar:zg/a0.class */
public final class C10209a0 implements CharSequence, Comparable {

    /* renamed from: b */
    public String f46709b;

    public C10209a0(String str) {
        if (str == null) {
            throw new NullPointerException("String initializer must be non-null");
        }
        this.f46709b = str;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return toString().charAt(i10);
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return toString().compareTo(obj.toString());
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10209a0) && toString().equals(obj.toString());
    }

    public int hashCode() {
        return toString().hashCode();
    }

    @Override // java.lang.CharSequence
    public int length() {
        return toString().length();
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return toString().subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f46709b;
    }
}

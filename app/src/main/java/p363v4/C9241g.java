package p363v4;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:v4/g.class
 */
/* renamed from: v4.g */
/* loaded from: combined.jar:classes1.jar:v4/g.class */
public class C9241g {

    /* renamed from: a */
    public Class<?> f42234a;

    /* renamed from: b */
    public Class<?> f42235b;

    public C9241g() {
    }

    public C9241g(Class<?> cls, Class<?> cls2) {
        m38962a(cls, cls2);
    }

    /* renamed from: a */
    public void m38962a(Class<?> cls, Class<?> cls2) {
        this.f42234a = cls;
        this.f42235b = cls2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9241g c9241g = (C9241g) obj;
        return this.f42234a.equals(c9241g.f42234a) && this.f42235b.equals(c9241g.f42235b);
    }

    public int hashCode() {
        return (this.f42234a.hashCode() * 31) + this.f42235b.hashCode();
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f42234a + ", second=" + this.f42235b + '}';
    }
}

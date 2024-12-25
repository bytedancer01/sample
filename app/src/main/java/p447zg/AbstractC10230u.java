package p447zg;

import com.sun.jna.Pointer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zg/u.class
 */
/* renamed from: zg.u */
/* loaded from: combined.jar:classes2.jar:zg/u.class */
public abstract class AbstractC10230u implements InterfaceC10226q {

    /* renamed from: b */
    public Pointer f46827b = Pointer.f26141b;

    @Override // p447zg.InterfaceC10226q
    /* renamed from: a */
    public Class<?> mo42751a() {
        return Pointer.class;
    }

    @Override // p447zg.InterfaceC10226q
    /* renamed from: b */
    public Object mo42752b(Object obj, C10213d c10213d) {
        if (obj == null) {
            return null;
        }
        AbstractC10230u abstractC10230u = (AbstractC10230u) AbstractC10220k.m42756a(getClass());
        abstractC10230u.f46827b = (Pointer) obj;
        return abstractC10230u;
    }

    @Override // p447zg.InterfaceC10226q
    /* renamed from: c */
    public Object mo42753c() {
        return m42817d();
    }

    /* renamed from: d */
    public Pointer m42817d() {
        return this.f46827b;
    }

    /* renamed from: e */
    public void m42818e(Pointer pointer) {
        this.f46827b = pointer;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC10230u)) {
            return false;
        }
        Pointer m42817d = ((AbstractC10230u) obj).m42817d();
        Pointer pointer = this.f46827b;
        if (pointer != null) {
            return pointer.equals(m42817d);
        }
        if (m42817d != null) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        Pointer pointer = this.f46827b;
        return pointer != null ? pointer.hashCode() : 0;
    }

    public String toString() {
        String str;
        if (this.f46827b == null) {
            str = "NULL";
        } else {
            str = this.f46827b.toString() + " (" + super.toString() + ")";
        }
        return str;
    }
}

package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/y6.class
 */
/* renamed from: ra.y6 */
/* loaded from: combined.jar:classes2.jar:ra/y6.class */
public class C8426y6 {

    /* renamed from: c */
    public static final C8425y5 f39415c = C8425y5.m36226a();

    /* renamed from: a */
    public volatile InterfaceC8307q7 f39416a;

    /* renamed from: b */
    public volatile AbstractC8230l5 f39417b;

    /* renamed from: a */
    public final int m36229a() {
        if (this.f39417b != null) {
            return ((C8200j5) this.f39417b).f39133f.length;
        }
        if (this.f39416a != null) {
            return this.f39416a.mo35586g();
        }
        return 0;
    }

    /* renamed from: b */
    public final AbstractC8230l5 m36230b() {
        if (this.f39417b != null) {
            return this.f39417b;
        }
        synchronized (this) {
            if (this.f39417b != null) {
                return this.f39417b;
            }
            this.f39417b = this.f39416a == null ? AbstractC8230l5.f39165c : this.f39416a.mo35732c();
            return this.f39417b;
        }
    }

    /* renamed from: c */
    public final void m36231c(InterfaceC8307q7 interfaceC8307q7) {
        if (this.f39416a != null) {
            return;
        }
        synchronized (this) {
            if (this.f39416a == null) {
                try {
                    this.f39416a = interfaceC8307q7;
                    this.f39417b = AbstractC8230l5.f39165c;
                } catch (C8396w6 e10) {
                    this.f39416a = interfaceC8307q7;
                    this.f39417b = AbstractC8230l5.f39165c;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8426y6)) {
            return false;
        }
        C8426y6 c8426y6 = (C8426y6) obj;
        InterfaceC8307q7 interfaceC8307q7 = this.f39416a;
        InterfaceC8307q7 interfaceC8307q72 = c8426y6.f39416a;
        if (interfaceC8307q7 == null && interfaceC8307q72 == null) {
            return m36230b().equals(c8426y6.m36230b());
        }
        if (interfaceC8307q7 != null && interfaceC8307q72 != null) {
            return interfaceC8307q7.equals(interfaceC8307q72);
        }
        if (interfaceC8307q7 != null) {
            c8426y6.m36231c(interfaceC8307q7.mo35441d());
            return interfaceC8307q7.equals(c8426y6.f39416a);
        }
        m36231c(interfaceC8307q72.mo35441d());
        return this.f39416a.equals(interfaceC8307q72);
    }

    public int hashCode() {
        return 1;
    }
}

package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/zg.class
 */
/* renamed from: ma.zg */
/* loaded from: combined.jar:classes2.jar:ma/zg.class */
public class C6542zg {

    /* renamed from: c */
    public static final C6064cg f34205c = C6064cg.f33711b;

    /* renamed from: a */
    public volatile InterfaceC6443uh f34206a;

    /* renamed from: b */
    public volatile AbstractC6399sf f34207b;

    /* renamed from: a */
    public final int m30192a() {
        if (this.f34207b != null) {
            return ((C6336pf) this.f34207b).f33966f.length;
        }
        if (this.f34206a != null) {
            return this.f34206a.mo29916r();
        }
        return 0;
    }

    /* renamed from: b */
    public final AbstractC6399sf m30193b() {
        if (this.f34207b != null) {
            return this.f34207b;
        }
        synchronized (this) {
            if (this.f34207b != null) {
                return this.f34207b;
            }
            this.f34207b = this.f34206a == null ? AbstractC6399sf.f34033c : this.f34206a.mo29569i();
            return this.f34207b;
        }
    }

    /* renamed from: c */
    public final void m30194c(InterfaceC6443uh interfaceC6443uh) {
        if (this.f34206a != null) {
            return;
        }
        synchronized (this) {
            if (this.f34206a == null) {
                try {
                    this.f34206a = interfaceC6443uh;
                    this.f34207b = AbstractC6399sf.f34033c;
                } catch (C6502xg e10) {
                    this.f34206a = interfaceC6443uh;
                    this.f34207b = AbstractC6399sf.f34033c;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6542zg)) {
            return false;
        }
        C6542zg c6542zg = (C6542zg) obj;
        InterfaceC6443uh interfaceC6443uh = this.f34206a;
        InterfaceC6443uh interfaceC6443uh2 = c6542zg.f34206a;
        if (interfaceC6443uh == null && interfaceC6443uh2 == null) {
            return m30193b().equals(c6542zg.m30193b());
        }
        if (interfaceC6443uh != null && interfaceC6443uh2 != null) {
            return interfaceC6443uh.equals(interfaceC6443uh2);
        }
        if (interfaceC6443uh != null) {
            c6542zg.m30194c(interfaceC6443uh.mo29913m());
            return interfaceC6443uh.equals(c6542zg.f34206a);
        }
        m30194c(interfaceC6443uh2.mo29913m());
        return this.f34206a.equals(interfaceC6443uh2);
    }

    public int hashCode() {
        return 1;
    }
}

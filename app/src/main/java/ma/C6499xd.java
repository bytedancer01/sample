package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/xd.class
 */
/* renamed from: ma.xd */
/* loaded from: combined.jar:classes2.jar:ma/xd.class */
public final class C6499xd extends AbstractC6376rd {
    public /* synthetic */ C6499xd(C6125fe c6125fe) {
        super(null);
    }

    @Override // ma.AbstractC6376rd
    /* renamed from: a */
    public final C6439ud mo29388a(AbstractC6062ce abstractC6062ce, C6439ud c6439ud) {
        C6439ud c6439ud2;
        synchronized (abstractC6062ce) {
            c6439ud2 = abstractC6062ce.f33709c;
            if (c6439ud2 != c6439ud) {
                abstractC6062ce.f33709c = c6439ud;
            }
        }
        return c6439ud2;
    }

    @Override // ma.AbstractC6376rd
    /* renamed from: b */
    public final C6041be mo29389b(AbstractC6062ce abstractC6062ce, C6041be c6041be) {
        C6041be c6041be2;
        synchronized (abstractC6062ce) {
            c6041be2 = abstractC6062ce.f33710d;
            if (c6041be2 != c6041be) {
                abstractC6062ce.f33710d = c6041be;
            }
        }
        return c6041be2;
    }

    @Override // ma.AbstractC6376rd
    /* renamed from: c */
    public final void mo29390c(C6041be c6041be, C6041be c6041be2) {
        c6041be.f33688b = c6041be2;
    }

    @Override // ma.AbstractC6376rd
    /* renamed from: d */
    public final void mo29391d(C6041be c6041be, Thread thread) {
        c6041be.f33687a = thread;
    }

    @Override // ma.AbstractC6376rd
    /* renamed from: e */
    public final boolean mo29392e(AbstractC6062ce abstractC6062ce, C6439ud c6439ud, C6439ud c6439ud2) {
        C6439ud c6439ud3;
        synchronized (abstractC6062ce) {
            c6439ud3 = abstractC6062ce.f33709c;
            if (c6439ud3 != c6439ud) {
                return false;
            }
            abstractC6062ce.f33709c = c6439ud2;
            return true;
        }
    }

    @Override // ma.AbstractC6376rd
    /* renamed from: f */
    public final boolean mo29393f(AbstractC6062ce abstractC6062ce, Object obj, Object obj2) {
        Object obj3;
        synchronized (abstractC6062ce) {
            obj3 = abstractC6062ce.f33708b;
            if (obj3 != obj) {
                return false;
            }
            abstractC6062ce.f33708b = obj2;
            return true;
        }
    }

    @Override // ma.AbstractC6376rd
    /* renamed from: g */
    public final boolean mo29394g(AbstractC6062ce abstractC6062ce, C6041be c6041be, C6041be c6041be2) {
        C6041be c6041be3;
        synchronized (abstractC6062ce) {
            c6041be3 = abstractC6062ce.f33710d;
            if (c6041be3 != c6041be) {
                return false;
            }
            abstractC6062ce.f33710d = c6041be2;
            return true;
        }
    }
}

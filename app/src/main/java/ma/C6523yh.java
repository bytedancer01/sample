package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/yh.class
 */
/* renamed from: ma.yh */
/* loaded from: combined.jar:classes2.jar:ma/yh.class */
public final class C6523yh implements InterfaceC6150gi {

    /* renamed from: a */
    public final InterfaceC6443uh f34183a;

    /* renamed from: b */
    public final AbstractC6504xi f34184b;

    /* renamed from: c */
    public final boolean f34185c;

    /* renamed from: d */
    public final AbstractC6085dg f34186d;

    public C6523yh(AbstractC6504xi abstractC6504xi, AbstractC6085dg abstractC6085dg, InterfaceC6443uh interfaceC6443uh) {
        this.f34184b = abstractC6504xi;
        this.f34185c = abstractC6085dg.mo29552c(interfaceC6443uh);
        this.f34186d = abstractC6085dg;
        this.f34183a = interfaceC6443uh;
    }

    /* renamed from: h */
    public static C6523yh m30174h(AbstractC6504xi abstractC6504xi, AbstractC6085dg abstractC6085dg, InterfaceC6443uh interfaceC6443uh) {
        return new C6523yh(abstractC6504xi, abstractC6085dg, interfaceC6443uh);
    }

    @Override // ma.InterfaceC6150gi
    /* renamed from: a */
    public final void mo29642a(Object obj) {
        this.f34184b.mo30151e(obj);
        this.f34186d.mo29551b(obj);
    }

    @Override // ma.InterfaceC6150gi
    /* renamed from: b */
    public final int mo29643b(Object obj) {
        int hashCode = this.f34184b.mo30149c(obj).hashCode();
        if (!this.f34185c) {
            return hashCode;
        }
        this.f34186d.mo29550a(obj);
        throw null;
    }

    @Override // ma.InterfaceC6150gi
    /* renamed from: c */
    public final int mo29644c(Object obj) {
        AbstractC6504xi abstractC6504xi = this.f34184b;
        int mo30148b = abstractC6504xi.mo30148b(abstractC6504xi.mo30149c(obj));
        if (!this.f34185c) {
            return mo30148b;
        }
        this.f34186d.mo29550a(obj);
        throw null;
    }

    @Override // ma.InterfaceC6150gi
    /* renamed from: d */
    public final void mo29645d(Object obj, InterfaceC6340pj interfaceC6340pj) {
        this.f34186d.mo29550a(obj);
        throw null;
    }

    @Override // ma.InterfaceC6150gi
    /* renamed from: e */
    public final boolean mo29646e(Object obj, Object obj2) {
        if (!this.f34184b.mo30149c(obj).equals(this.f34184b.mo30149c(obj2))) {
            return false;
        }
        if (!this.f34185c) {
            return true;
        }
        this.f34186d.mo29550a(obj);
        this.f34186d.mo29550a(obj2);
        throw null;
    }

    @Override // ma.InterfaceC6150gi
    /* renamed from: f */
    public final void mo29647f(Object obj, Object obj2) {
        C6192ii.m29709b(this.f34184b, obj, obj2);
        if (this.f34185c) {
            this.f34186d.mo29550a(obj2);
            throw null;
        }
    }

    @Override // ma.InterfaceC6150gi
    /* renamed from: g */
    public final boolean mo29648g(Object obj) {
        this.f34186d.mo29550a(obj);
        throw null;
    }

    @Override // ma.InterfaceC6150gi
    /* renamed from: l */
    public final Object mo29649l() {
        InterfaceC6443uh interfaceC6443uh = this.f34183a;
        return interfaceC6443uh instanceof AbstractC6295ng ? ((AbstractC6295ng) interfaceC6443uh).m29918u() : interfaceC6443uh.mo29907e().mo29841q();
    }
}

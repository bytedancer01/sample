package ma;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/vd.class
 */
/* renamed from: ma.vd */
/* loaded from: combined.jar:classes2.jar:ma/vd.class */
public final class C6459vd extends AbstractC6376rd {

    /* renamed from: a */
    public final AtomicReferenceFieldUpdater<C6041be, Thread> f34107a;

    /* renamed from: b */
    public final AtomicReferenceFieldUpdater<C6041be, C6041be> f34108b;

    /* renamed from: c */
    public final AtomicReferenceFieldUpdater<AbstractC6062ce, C6041be> f34109c;

    /* renamed from: d */
    public final AtomicReferenceFieldUpdater<AbstractC6062ce, C6439ud> f34110d;

    /* renamed from: e */
    public final AtomicReferenceFieldUpdater<AbstractC6062ce, Object> f34111e;

    public C6459vd(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f34107a = atomicReferenceFieldUpdater;
        this.f34108b = atomicReferenceFieldUpdater2;
        this.f34109c = atomicReferenceFieldUpdater3;
        this.f34110d = atomicReferenceFieldUpdater4;
        this.f34111e = atomicReferenceFieldUpdater5;
    }

    @Override // ma.AbstractC6376rd
    /* renamed from: a */
    public final C6439ud mo29388a(AbstractC6062ce abstractC6062ce, C6439ud c6439ud) {
        return this.f34110d.getAndSet(abstractC6062ce, c6439ud);
    }

    @Override // ma.AbstractC6376rd
    /* renamed from: b */
    public final C6041be mo29389b(AbstractC6062ce abstractC6062ce, C6041be c6041be) {
        return this.f34109c.getAndSet(abstractC6062ce, c6041be);
    }

    @Override // ma.AbstractC6376rd
    /* renamed from: c */
    public final void mo29390c(C6041be c6041be, C6041be c6041be2) {
        this.f34108b.lazySet(c6041be, c6041be2);
    }

    @Override // ma.AbstractC6376rd
    /* renamed from: d */
    public final void mo29391d(C6041be c6041be, Thread thread) {
        this.f34107a.lazySet(c6041be, thread);
    }

    @Override // ma.AbstractC6376rd
    /* renamed from: e */
    public final boolean mo29392e(AbstractC6062ce abstractC6062ce, C6439ud c6439ud, C6439ud c6439ud2) {
        return C6083de.m29549a(this.f34110d, abstractC6062ce, c6439ud, c6439ud2);
    }

    @Override // ma.AbstractC6376rd
    /* renamed from: f */
    public final boolean mo29393f(AbstractC6062ce abstractC6062ce, Object obj, Object obj2) {
        return C6083de.m29549a(this.f34111e, abstractC6062ce, obj, obj2);
    }

    @Override // ma.AbstractC6376rd
    /* renamed from: g */
    public final boolean mo29394g(AbstractC6062ce abstractC6062ce, C6041be c6041be, C6041be c6041be2) {
        return C6083de.m29549a(this.f34109c, abstractC6062ce, c6041be, c6041be2);
    }
}

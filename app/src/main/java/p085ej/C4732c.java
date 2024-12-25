package p085ej;

import dj.InterfaceC4539f;
import p173ji.AbstractC5412g0;
import p188kd.AbstractC5569v;
import p188kd.C5552e;

/* renamed from: ej.c */
/* loaded from: combined.jar:classes3.jar:ej/c.class */
public final class C4732c<T> implements InterfaceC4539f<AbstractC5412g0, T> {

    /* renamed from: a */
    public final C5552e f27882a;

    /* renamed from: b */
    public final AbstractC5569v<T> f27883b;

    public C4732c(C5552e c5552e, AbstractC5569v<T> abstractC5569v) {
        this.f27882a = c5552e;
        this.f27883b = abstractC5569v;
    }

    @Override // dj.InterfaceC4539f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public T mo22855a(AbstractC5412g0 abstractC5412g0) {
        try {
            return this.f27883b.mo27561b(this.f27882a.m27552p(abstractC5412g0.m26966f()));
        } finally {
            abstractC5412g0.close();
        }
    }
}

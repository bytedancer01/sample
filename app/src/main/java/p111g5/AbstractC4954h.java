package p111g5;

import p074e5.C4640q;
import p074e5.EnumC4637n;
import p111g5.AbstractC4954h;
import p111g5.InterfaceC4948b;
import p180k5.C5484i;
import p196l5.AbstractC5681a;
import p319s5.C8535d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:g5/h.class
 */
/* renamed from: g5.h */
/* loaded from: combined.jar:classes1.jar:g5/h.class */
public abstract class AbstractC4954h<CFG extends InterfaceC4948b, T extends AbstractC4954h<CFG, T>> extends AbstractC4953g<T> {

    /* renamed from: m */
    public static final int f28728m = AbstractC4953g.m24940b(EnumC4637n.class);

    /* renamed from: f */
    public final C5484i f28729f;

    /* renamed from: g */
    public final AbstractC5681a f28730g;

    /* renamed from: h */
    public final C4640q f28731h;

    /* renamed from: i */
    public final Class<?> f28732i;

    /* renamed from: j */
    public final AbstractC4950d f28733j;

    /* renamed from: k */
    public final C8535d f28734k;

    /* renamed from: l */
    public final C4949c f28735l;

    public AbstractC4954h(C4947a c4947a, AbstractC5681a abstractC5681a, C5484i c5484i, C8535d c8535d, C4949c c4949c) {
        super(c4947a, f28728m);
        this.f28729f = c5484i;
        this.f28730g = abstractC5681a;
        this.f28734k = c8535d;
        this.f28731h = null;
        this.f28732i = null;
        this.f28733j = AbstractC4950d.m24938a();
        this.f28735l = c4949c;
    }

    public AbstractC4954h(AbstractC4954h<CFG, T> abstractC4954h, int i10) {
        super(abstractC4954h, i10);
        this.f28729f = abstractC4954h.f28729f;
        this.f28730g = abstractC4954h.f28730g;
        this.f28734k = abstractC4954h.f28734k;
        this.f28731h = abstractC4954h.f28731h;
        this.f28732i = abstractC4954h.f28732i;
        this.f28733j = abstractC4954h.f28733j;
        this.f28735l = abstractC4954h.f28735l;
    }

    @Override // p180k5.AbstractC5481f.a
    /* renamed from: a */
    public final Class<?> mo24944a(Class<?> cls) {
        return this.f28729f.mo24944a(cls);
    }
}

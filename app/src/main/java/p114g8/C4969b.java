package p114g8;

import p057d7.C4334q;
import p057d7.InterfaceC4323f;
import p057d7.InterfaceC4324g;
import p057d7.InterfaceC4325h;
import p059d9.C4349a;
import p059d9.C4389t0;
import p163j7.C5310f;
import p182k7.C5516g;
import p228n7.C6662b;
import p228n7.C6668e;
import p228n7.C6674h;
import p228n7.C6675h0;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:g8/b.class
 */
/* renamed from: g8.b */
/* loaded from: combined.jar:classes2.jar:g8/b.class */
public final class C4969b implements InterfaceC4978k {

    /* renamed from: d */
    public static final C4334q f28808d = new C4334q();

    /* renamed from: a */
    public final InterfaceC4323f f28809a;

    /* renamed from: b */
    public final C7629w0 f28810b;

    /* renamed from: c */
    public final C4389t0 f28811c;

    public C4969b(InterfaceC4323f interfaceC4323f, C7629w0 c7629w0, C4389t0 c4389t0) {
        this.f28809a = interfaceC4323f;
        this.f28810b = c7629w0;
        this.f28811c = c4389t0;
    }

    @Override // p114g8.InterfaceC4978k
    /* renamed from: a */
    public boolean mo25009a(InterfaceC4324g interfaceC4324g) {
        return this.f28809a.mo12033h(interfaceC4324g, f28808d) == 0;
    }

    @Override // p114g8.InterfaceC4978k
    /* renamed from: b */
    public void mo25010b() {
        this.f28809a.mo12027a(0L, 0L);
    }

    @Override // p114g8.InterfaceC4978k
    /* renamed from: c */
    public void mo25011c(InterfaceC4325h interfaceC4325h) {
        this.f28809a.mo12028c(interfaceC4325h);
    }

    @Override // p114g8.InterfaceC4978k
    /* renamed from: d */
    public boolean mo25012d() {
        InterfaceC4323f interfaceC4323f = this.f28809a;
        return (interfaceC4323f instanceof C6675h0) || (interfaceC4323f instanceof C5516g);
    }

    @Override // p114g8.InterfaceC4978k
    /* renamed from: e */
    public boolean mo25013e() {
        InterfaceC4323f interfaceC4323f = this.f28809a;
        return (interfaceC4323f instanceof C6674h) || (interfaceC4323f instanceof C6662b) || (interfaceC4323f instanceof C6668e) || (interfaceC4323f instanceof C5310f);
    }

    @Override // p114g8.InterfaceC4978k
    /* renamed from: f */
    public InterfaceC4978k mo25014f() {
        InterfaceC4323f c5310f;
        C4349a.m21884g(!mo25012d());
        InterfaceC4323f interfaceC4323f = this.f28809a;
        if (interfaceC4323f instanceof C4989v) {
            c5310f = new C4989v(this.f28810b.f37077d, this.f28811c);
        } else if (interfaceC4323f instanceof C6674h) {
            c5310f = new C6674h();
        } else if (interfaceC4323f instanceof C6662b) {
            c5310f = new C6662b();
        } else if (interfaceC4323f instanceof C6668e) {
            c5310f = new C6668e();
        } else {
            if (!(interfaceC4323f instanceof C5310f)) {
                throw new IllegalStateException("Unexpected extractor type for recreation: " + this.f28809a.getClass().getSimpleName());
            }
            c5310f = new C5310f();
        }
        return new C4969b(c5310f, this.f28810b, this.f28811c);
    }
}

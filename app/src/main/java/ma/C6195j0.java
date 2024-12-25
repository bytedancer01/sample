package ma;

import p216m9.AbstractC5989s;
import p216m9.C5941c;
import p216m9.InterfaceC5993u;
import p304r9.C8015b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/j0.class
 */
/* renamed from: ma.j0 */
/* loaded from: combined.jar:classes2.jar:ma/j0.class */
public final class C6195j0 implements InterfaceC5993u {

    /* renamed from: a */
    public final C6216k0 f33837a;

    public /* synthetic */ C6195j0(C6216k0 c6216k0, C6174i0 c6174i0) {
        this.f33837a = c6216k0;
    }

    @Override // p216m9.InterfaceC5993u
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo14735a(AbstractC5989s abstractC5989s, int i10) {
        C8015b c8015b;
        int i11;
        c8015b = C6216k0.f33851i;
        c8015b.m34873a("onSessionEnded with error = %d", Integer.valueOf(i10));
        C6216k0.m29797g(this.f33837a);
        C6216k0 c6216k0 = this.f33837a;
        i11 = c6216k0.f33856e;
        if (i11 == 2) {
            return;
        }
        c6216k0.m29806p();
    }

    @Override // p216m9.InterfaceC5993u
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo14736b(AbstractC5989s abstractC5989s) {
    }

    @Override // p216m9.InterfaceC5993u
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo14738d(AbstractC5989s abstractC5989s, String str) {
        C8015b c8015b;
        int i10;
        C5941c c5941c;
        int i11;
        c8015b = C6216k0.f33851i;
        i10 = this.f33837a.f33856e;
        c8015b.m34873a("onSessionStarted with transferType = %d", Integer.valueOf(i10));
        c5941c = this.f33837a.f33852a;
        if (c5941c.m29263b0()) {
            C6216k0 c6216k0 = this.f33837a;
            i11 = c6216k0.f33856e;
            if (i11 == 2) {
                C6216k0.m29799i(c6216k0);
            }
        }
        this.f33837a.m29806p();
    }

    @Override // p216m9.InterfaceC5993u
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo14739e(AbstractC5989s abstractC5989s, int i10) {
    }

    @Override // p216m9.InterfaceC5993u
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo14740f(AbstractC5989s abstractC5989s, int i10) {
    }

    @Override // p216m9.InterfaceC5993u
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo14744j(AbstractC5989s abstractC5989s, boolean z10) {
    }

    @Override // p216m9.InterfaceC5993u
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ void mo14746l(AbstractC5989s abstractC5989s, String str) {
    }

    @Override // p216m9.InterfaceC5993u
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ void mo14748n(AbstractC5989s abstractC5989s, int i10) {
    }

    @Override // p216m9.InterfaceC5993u
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ void mo14749o(AbstractC5989s abstractC5989s) {
    }
}

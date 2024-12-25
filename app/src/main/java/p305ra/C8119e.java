package p305ra;

import android.app.Activity;
import ga.BinderC4994b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/e.class
 */
/* renamed from: ra.e */
/* loaded from: combined.jar:classes2.jar:ra/e.class */
public final class C8119e extends AbstractRunnableC8374v {

    /* renamed from: f */
    public final Activity f39037f;

    /* renamed from: g */
    public final String f39038g;

    /* renamed from: h */
    public final String f39039h;

    /* renamed from: i */
    public final C8120e0 f39040i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8119e(C8120e0 c8120e0, Activity activity, String str, String str2) {
        super(c8120e0, true);
        this.f39040i = c8120e0;
        this.f39037f = activity;
        this.f39038g = str;
        this.f39039h = str2;
    }

    @Override // p305ra.AbstractRunnableC8374v
    /* renamed from: a */
    public final void mo34987a() {
        InterfaceC8313qd interfaceC8313qd;
        interfaceC8313qd = this.f39040i.f39051i;
        interfaceC8313qd.setCurrentScreen(BinderC4994b.m25160B1(this.f39037f), this.f39038g, this.f39039h, this.f39326b);
    }
}

package p383w9;

import com.google.android.gms.common.api.C2414a;
import java.util.ArrayList;
import p422y9.InterfaceC9917i;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/i0.class
 */
/* renamed from: w9.i0 */
/* loaded from: combined.jar:classes2.jar:w9/i0.class */
public final class C9473i0 extends AbstractRunnableC9503o0 {

    /* renamed from: c */
    public final ArrayList<C2414a.f> f43294c;

    /* renamed from: d */
    public final C9508p0 f43295d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9473i0(C9508p0 c9508p0, ArrayList<C2414a.f> arrayList) {
        super(c9508p0, null);
        this.f43295d = c9508p0;
        this.f43294c = arrayList;
    }

    @Override // p383w9.AbstractRunnableC9503o0
    /* renamed from: a */
    public final void mo39920a() {
        C9544y0 c9544y0;
        InterfaceC9917i interfaceC9917i;
        C9544y0 c9544y02;
        C9508p0 c9508p0 = this.f43295d;
        c9544y0 = c9508p0.f43370a;
        c9544y0.f43504o.f43450p = C9508p0.m39996x(c9508p0);
        ArrayList<C2414a.f> arrayList = this.f43294c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2414a.f fVar = arrayList.get(i10);
            C9508p0 c9508p02 = this.f43295d;
            interfaceC9917i = c9508p02.f43384o;
            c9544y02 = c9508p02.f43370a;
            fVar.getRemoteService(interfaceC9917i, c9544y02.f43504o.f43450p);
        }
    }
}

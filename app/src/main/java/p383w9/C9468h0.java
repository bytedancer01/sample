package p383w9;

import android.content.Context;
import com.google.android.gms.common.api.C2414a;
import java.util.ArrayList;
import java.util.Map;
import p350u9.C8804b;
import p350u9.C8814g;
import p384wa.InterfaceC9556f;
import p422y9.C9918i0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/h0.class
 */
/* renamed from: w9.h0 */
/* loaded from: combined.jar:classes2.jar:w9/h0.class */
public final class C9468h0 extends AbstractRunnableC9503o0 {

    /* renamed from: c */
    public final Map<C2414a.f, C9453e0> f43286c;

    /* renamed from: d */
    public final C9508p0 f43287d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9468h0(C9508p0 c9508p0, Map<C2414a.f, C9453e0> map) {
        super(c9508p0, null);
        this.f43287d = c9508p0;
        this.f43286c = map;
    }

    @Override // p383w9.AbstractRunnableC9503o0
    /* renamed from: a */
    public final void mo39920a() {
        C8814g c8814g;
        Context context;
        boolean z10;
        Context context2;
        C9544y0 c9544y0;
        InterfaceC9556f interfaceC9556f;
        InterfaceC9556f interfaceC9556f2;
        C9544y0 c9544y02;
        Context context3;
        boolean z11;
        c8814g = this.f43287d.f43373d;
        C9918i0 c9918i0 = new C9918i0(c8814g);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C2414a.f fVar : this.f43286c.keySet()) {
            if (fVar.requiresGooglePlayServices()) {
                z11 = this.f43286c.get(fVar).f43231c;
                if (!z11) {
                    arrayList.add(fVar);
                }
            }
            arrayList2.add(fVar);
        }
        int i10 = -1;
        int i11 = 0;
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    break;
                }
                C2414a.f fVar2 = (C2414a.f) arrayList2.get(i12);
                context3 = this.f43287d.f43372c;
                int m41806b = c9918i0.m41806b(context3, fVar2);
                i12++;
                i10 = m41806b;
                if (m41806b == 0) {
                    i10 = m41806b;
                    break;
                }
            }
        } else {
            int size2 = arrayList.size();
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                C2414a.f fVar3 = (C2414a.f) arrayList.get(i11);
                context = this.f43287d.f43372c;
                int m41806b2 = c9918i0.m41806b(context, fVar3);
                i11++;
                i10 = m41806b2;
                if (m41806b2 != 0) {
                    i10 = m41806b2;
                    break;
                }
            }
        }
        if (i10 != 0) {
            C8804b c8804b = new C8804b(i10, null);
            C9508p0 c9508p0 = this.f43287d;
            c9544y02 = c9508p0.f43370a;
            c9544y02.m40086l(new C9458f0(this, c9508p0, c8804b));
            return;
        }
        C9508p0 c9508p02 = this.f43287d;
        z10 = c9508p02.f43382m;
        if (z10) {
            interfaceC9556f = c9508p02.f43380k;
            if (interfaceC9556f != null) {
                interfaceC9556f2 = c9508p02.f43380k;
                interfaceC9556f2.mo40091c();
            }
        }
        for (C2414a.f fVar4 : this.f43286c.keySet()) {
            C9453e0 c9453e0 = this.f43286c.get(fVar4);
            if (fVar4.requiresGooglePlayServices()) {
                context2 = this.f43287d.f43372c;
                if (c9918i0.m41806b(context2, fVar4) != 0) {
                    C9508p0 c9508p03 = this.f43287d;
                    c9544y0 = c9508p03.f43370a;
                    c9544y0.m40086l(new C9463g0(this, c9508p03, c9453e0));
                }
            }
            fVar4.connect(c9453e0);
        }
    }
}

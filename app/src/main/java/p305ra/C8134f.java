package p305ra;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import ga.BinderC4994b;
import ua.C9096v4;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/f.class
 */
/* renamed from: ra.f */
/* loaded from: combined.jar:classes2.jar:ra/f.class */
public final class C8134f extends AbstractRunnableC8374v {

    /* renamed from: f */
    public final String f39069f;

    /* renamed from: g */
    public final String f39070g;

    /* renamed from: h */
    public final Context f39071h;

    /* renamed from: i */
    public final Bundle f39072i;

    /* renamed from: j */
    public final C8120e0 f39073j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8134f(C8120e0 c8120e0, String str, String str2, Context context, Bundle bundle) {
        super(c8120e0, true);
        this.f39073j = c8120e0;
        this.f39069f = str;
        this.f39070g = str2;
        this.f39071h = context;
        this.f39072i = bundle;
    }

    @Override // p305ra.AbstractRunnableC8374v
    /* renamed from: a */
    public final void mo34987a() {
        boolean m35229s;
        String str;
        String str2;
        String str3;
        Boolean bool;
        InterfaceC8313qd interfaceC8313qd;
        boolean z10;
        InterfaceC8313qd interfaceC8313qd2;
        String str4;
        String str5;
        try {
            C8120e0 c8120e0 = this.f39073j;
            m35229s = C8120e0.m35229s(this.f39069f, this.f39070g);
            if (m35229s) {
                str3 = this.f39070g;
                str2 = this.f39069f;
                str5 = this.f39073j.f39043a;
                str = str5;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            C8120e0.m35223j(this.f39071h);
            bool = C8120e0.f39042k;
            boolean z11 = bool.booleanValue() || str2 != null;
            C8120e0 c8120e02 = this.f39073j;
            c8120e02.f39051i = c8120e02.m35248v(this.f39071h, z11);
            interfaceC8313qd = this.f39073j.f39051i;
            if (interfaceC8313qd == null) {
                str4 = this.f39073j.f39043a;
                Log.w(str4, "Failed to connect to measurement client.");
                return;
            }
            int m13172a = DynamiteModule.m13172a(this.f39071h, ModuleDescriptor.MODULE_ID);
            int m13173c = DynamiteModule.m13173c(this.f39071h, ModuleDescriptor.MODULE_ID);
            if (z11) {
                int max = Math.max(m13172a, m13173c);
                z10 = m13173c < m13172a;
                m13173c = max;
            } else {
                if (m13172a > 0) {
                    m13173c = m13172a;
                }
                z10 = m13172a > 0;
            }
            C8433yd c8433yd = new C8433yd(37000L, m13173c, z10, str, str2, str3, this.f39072i, C9096v4.m38315a(this.f39071h));
            interfaceC8313qd2 = this.f39073j.f39051i;
            interfaceC8313qd2.initialize(BinderC4994b.m25160B1(this.f39071h), c8433yd, this.f39326b);
        } catch (Exception e10) {
            this.f39073j.m35245q(e10, true, false);
        }
    }
}

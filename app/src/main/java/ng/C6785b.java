package ng;

import android.annotation.SuppressLint;
import mg.AbstractC6598a;
import mg.InterfaceC6600c;
import org.apache.http.impl.auth.NTLMEngineImpl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ng/b.class
 */
/* renamed from: ng.b */
/* loaded from: combined.jar:classes2.jar:ng/b.class */
public class C6785b extends AbstractC6598a {

    /* renamed from: b */
    public boolean f35406b = false;

    /* renamed from: c */
    public int f35407c = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;

    /* renamed from: d */
    public String f35408d;

    /* renamed from: e */
    public float f35409e;

    /* renamed from: a */
    public void m31293a(InterfaceC6600c interfaceC6600c) {
        boolean z10 = this.f35406b;
        if (z10 && this.f35407c == 1) {
            interfaceC6600c.mo30486e(this.f35408d, this.f35409e);
        } else if (!z10 && this.f35407c == 1) {
            interfaceC6600c.mo30482a(this.f35408d, this.f35409e);
        }
        this.f35407c = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
    }

    @Override // mg.AbstractC6598a, mg.InterfaceC6604g
    /* renamed from: c */
    public void mo30475c(String str) {
        this.f35408d = str;
    }

    @Override // mg.AbstractC6598a, mg.InterfaceC6604g
    @SuppressLint({"SwitchIntDef"})
    /* renamed from: h */
    public void mo17044h(int i10) {
        if (i10 == 0) {
            this.f35406b = false;
        } else if (i10 == 1) {
            this.f35406b = true;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f35406b = false;
        }
    }

    @Override // mg.AbstractC6598a, mg.InterfaceC6604g
    /* renamed from: n */
    public void mo30481n(float f10) {
        this.f35409e = f10;
    }

    @Override // mg.AbstractC6598a, mg.InterfaceC6604g
    public void onError(int i10) {
        if (i10 == 1) {
            this.f35407c = i10;
        }
    }
}

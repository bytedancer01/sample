package p383w9;

import android.util.Log;
import com.google.android.gms.common.api.C2414a;
import com.google.android.gms.common.api.Scope;
import java.util.Map;
import java.util.Set;
import p350u9.C8804b;
import p422y9.AbstractC9899c;
import p422y9.InterfaceC9917i;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/k1.class
 */
/* renamed from: w9.k1 */
/* loaded from: combined.jar:classes2.jar:w9/k1.class */
public final class C9484k1 implements AbstractC9899c.c, InterfaceC9460f2 {

    /* renamed from: a */
    public final C2414a.f f43319a;

    /* renamed from: b */
    public final C9437b<?> f43320b;

    /* renamed from: c */
    public InterfaceC9917i f43321c = null;

    /* renamed from: d */
    public Set<Scope> f43322d = null;

    /* renamed from: e */
    public boolean f43323e = false;

    /* renamed from: f */
    public final C9457f f43324f;

    public C9484k1(C9457f c9457f, C2414a.f fVar, C9437b<?> c9437b) {
        this.f43324f = c9457f;
        this.f43319a = fVar;
        this.f43320b = c9437b;
    }

    @Override // p383w9.InterfaceC9460f2
    /* renamed from: a */
    public final void mo39864a(InterfaceC9917i interfaceC9917i, Set<Scope> set) {
        if (interfaceC9917i == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            mo39865b(new C8804b(4));
        } else {
            this.f43321c = interfaceC9917i;
            this.f43322d = set;
            m39940h();
        }
    }

    @Override // p383w9.InterfaceC9460f2
    /* renamed from: b */
    public final void mo39865b(C8804b c8804b) {
        Map map;
        map = this.f43324f.f43251m;
        C9464g1 c9464g1 = (C9464g1) map.get(this.f43320b);
        if (c9464g1 != null) {
            c9464g1.m39885F(c8804b);
        }
    }

    @Override // p422y9.AbstractC9899c.c
    /* renamed from: c */
    public final void mo39826c(C8804b c8804b) {
        this.f43324f.f43255q.post(new RunnableC9479j1(this, c8804b));
    }

    /* renamed from: h */
    public final void m39940h() {
        InterfaceC9917i interfaceC9917i;
        if (!this.f43323e || (interfaceC9917i = this.f43321c) == null) {
            return;
        }
        this.f43319a.getRemoteService(interfaceC9917i, this.f43322d);
    }
}

package p383w9;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.C2414a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC2418a;
import java.util.Iterator;
import java.util.Set;
import p350u9.C8804b;
import p368v9.InterfaceC9320f;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/c0.class
 */
/* renamed from: w9.c0 */
/* loaded from: combined.jar:classes2.jar:w9/c0.class */
public final class C9443c0 implements InterfaceC9532v0 {

    /* renamed from: a */
    public final C9544y0 f43221a;

    /* renamed from: b */
    public boolean f43222b = false;

    public C9443c0(C9544y0 c9544y0) {
        this.f43221a = c9544y0;
    }

    @Override // p383w9.InterfaceC9532v0
    /* renamed from: a */
    public final void mo39816a(C8804b c8804b, C2414a<?> c2414a, boolean z10) {
    }

    @Override // p383w9.InterfaceC9532v0
    /* renamed from: b */
    public final void mo39817b(Bundle bundle) {
    }

    @Override // p383w9.InterfaceC9532v0
    /* renamed from: c */
    public final void mo39818c() {
    }

    @Override // p383w9.InterfaceC9532v0
    /* renamed from: d */
    public final void mo39819d() {
        if (this.f43222b) {
            this.f43222b = false;
            this.f43221a.m40086l(new C9438b0(this, this));
        }
    }

    @Override // p383w9.InterfaceC9532v0
    /* renamed from: e */
    public final void mo39820e(int i10) {
        this.f43221a.m40085k(null);
        this.f43221a.f43505p.mo39928c(i10, this.f43222b);
    }

    @Override // p383w9.InterfaceC9532v0
    /* renamed from: f */
    public final boolean mo39821f() {
        if (this.f43222b) {
            return false;
        }
        Set<C9495m2> set = this.f43221a.f43504o.f43457w;
        if (set == null || set.isEmpty()) {
            this.f43221a.m40085k(null);
            return true;
        }
        this.f43222b = true;
        Iterator<C9495m2> it = set.iterator();
        while (it.hasNext()) {
            it.next().m39957f();
        }
        return false;
    }

    @Override // p383w9.InterfaceC9532v0
    /* renamed from: g */
    public final <A extends C2414a.b, T extends AbstractC2418a<? extends InterfaceC9320f, A>> T mo39822g(T t10) {
        try {
            this.f43221a.f43504o.f43458x.m39975a(t10);
            C9528u0 c9528u0 = this.f43221a.f43504o;
            C2414a.f fVar = c9528u0.f43449o.get(t10.m13167s());
            C9935o.m41851k(fVar, "Appropriate Api was not requested.");
            if (fVar.isConnected() || !this.f43221a.f43497h.containsKey(t10.m13167s())) {
                t10.m13169u(fVar);
            } else {
                t10.m13171w(new Status(17));
            }
        } catch (DeadObjectException e10) {
            this.f43221a.m40086l(new C9433a0(this, this));
        }
        return t10;
    }

    /* renamed from: i */
    public final void m39823i() {
        if (this.f43222b) {
            this.f43222b = false;
            this.f43221a.f43504o.f43458x.m39976b();
            mo39821f();
        }
    }
}

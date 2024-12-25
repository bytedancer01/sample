package p383w9;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.C2414a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.AbstractC2418a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import p350u9.C8804b;
import p350u9.C8814g;
import p368v9.InterfaceC9320f;
import p384wa.C9551a;
import p384wa.InterfaceC9556f;
import p403xa.C9704l;
import p422y9.C9902d;
import p422y9.C9930m0;
import p422y9.C9935o;
import p422y9.C9964z;
import p422y9.InterfaceC9917i;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/p0.class
 */
/* renamed from: w9.p0 */
/* loaded from: combined.jar:classes2.jar:w9/p0.class */
public final class C9508p0 implements InterfaceC9532v0 {

    /* renamed from: a */
    public final C9544y0 f43370a;

    /* renamed from: b */
    public final Lock f43371b;

    /* renamed from: c */
    public final Context f43372c;

    /* renamed from: d */
    public final C8814g f43373d;

    /* renamed from: e */
    public C8804b f43374e;

    /* renamed from: f */
    public int f43375f;

    /* renamed from: h */
    public int f43377h;

    /* renamed from: k */
    public InterfaceC9556f f43380k;

    /* renamed from: l */
    public boolean f43381l;

    /* renamed from: m */
    public boolean f43382m;

    /* renamed from: n */
    public boolean f43383n;

    /* renamed from: o */
    public InterfaceC9917i f43384o;

    /* renamed from: p */
    public boolean f43385p;

    /* renamed from: q */
    public boolean f43386q;

    /* renamed from: r */
    public final C9902d f43387r;

    /* renamed from: s */
    public final Map<C2414a<?>, Boolean> f43388s;

    /* renamed from: t */
    public final C2414a.a<? extends InterfaceC9556f, C9551a> f43389t;

    /* renamed from: g */
    public int f43376g = 0;

    /* renamed from: i */
    public final Bundle f43378i = new Bundle();

    /* renamed from: j */
    public final Set<C2414a.c> f43379j = new HashSet();

    /* renamed from: u */
    public final ArrayList<Future<?>> f43390u = new ArrayList<>();

    public C9508p0(C9544y0 c9544y0, C9902d c9902d, Map<C2414a<?>, Boolean> map, C8814g c8814g, C2414a.a<? extends InterfaceC9556f, C9551a> aVar, Lock lock, Context context) {
        this.f43370a = c9544y0;
        this.f43387r = c9902d;
        this.f43388s = map;
        this.f43373d = c8814g;
        this.f43389t = aVar;
        this.f43371b = lock;
        this.f43372c = context;
    }

    /* renamed from: A */
    public static /* bridge */ /* synthetic */ void m39981A(C9508p0 c9508p0, C9704l c9704l) {
        if (c9508p0.m40006n(0)) {
            C8804b m40807P = c9704l.m40807P();
            if (!m40807P.m37663T()) {
                if (!c9508p0.m40008p(m40807P)) {
                    c9508p0.m40003k(m40807P);
                    return;
                } else {
                    c9508p0.m40000h();
                    c9508p0.m40005m();
                    return;
                }
            }
            C9930m0 c9930m0 = (C9930m0) C9935o.m41850j(c9704l.m40808Q());
            C8804b m41827P = c9930m0.m41827P();
            if (!m41827P.m37663T()) {
                String valueOf = String.valueOf(m41827P);
                Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                c9508p0.m40003k(m41827P);
                return;
            }
            c9508p0.f43383n = true;
            c9508p0.f43384o = (InterfaceC9917i) C9935o.m41850j(c9930m0.m41828Q());
            c9508p0.f43385p = c9930m0.m41829R();
            c9508p0.f43386q = c9930m0.m41830S();
            c9508p0.m40005m();
        }
    }

    /* renamed from: q */
    public static final String m39989q(int i10) {
        return i10 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.Set] */
    /* renamed from: x */
    public static /* bridge */ /* synthetic */ Set m39996x(C9508p0 c9508p0) {
        HashSet hashSet;
        C9902d c9902d = c9508p0.f43387r;
        if (c9902d == null) {
            hashSet = Collections.emptySet();
        } else {
            HashSet hashSet2 = new HashSet(c9902d.m41769e());
            Map<C2414a<?>, C9964z> m41773i = c9508p0.f43387r.m41773i();
            for (C2414a<?> c2414a : m41773i.keySet()) {
                if (!c9508p0.f43370a.f43497h.containsKey(c2414a.m13129b())) {
                    hashSet2.addAll(m41773i.get(c2414a).f45657a);
                }
            }
            hashSet = hashSet2;
        }
        return hashSet;
    }

    /* renamed from: I */
    public final void m39999I() {
        ArrayList<Future<?>> arrayList = this.f43390u;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).cancel(true);
        }
        this.f43390u.clear();
    }

    @Override // p383w9.InterfaceC9532v0
    /* renamed from: a */
    public final void mo39816a(C8804b c8804b, C2414a<?> c2414a, boolean z10) {
        if (m40006n(1)) {
            m40004l(c8804b, c2414a, z10);
            if (m40007o()) {
                m40002j();
            }
        }
    }

    @Override // p383w9.InterfaceC9532v0
    /* renamed from: b */
    public final void mo39817b(Bundle bundle) {
        if (m40006n(1)) {
            if (bundle != null) {
                this.f43378i.putAll(bundle);
            }
            if (m40007o()) {
                m40002j();
            }
        }
    }

    @Override // p383w9.InterfaceC9532v0
    /* renamed from: c */
    public final void mo39818c() {
        this.f43370a.f43497h.clear();
        this.f43382m = false;
        this.f43374e = null;
        this.f43376g = 0;
        this.f43381l = true;
        this.f43383n = false;
        this.f43385p = false;
        HashMap hashMap = new HashMap();
        boolean z10 = false;
        for (C2414a<?> c2414a : this.f43388s.keySet()) {
            C2414a.f fVar = (C2414a.f) C9935o.m41850j(this.f43370a.f43496g.get(c2414a.m13129b()));
            z10 |= c2414a.m13130c().getPriority() == 1;
            boolean booleanValue = this.f43388s.get(c2414a).booleanValue();
            if (fVar.requiresSignIn()) {
                this.f43382m = true;
                if (booleanValue) {
                    this.f43379j.add(c2414a.m13129b());
                } else {
                    this.f43381l = false;
                }
            }
            hashMap.put(fVar, new C9453e0(this, c2414a, booleanValue));
        }
        if (z10) {
            this.f43382m = false;
        }
        if (this.f43382m) {
            C9935o.m41850j(this.f43387r);
            C9935o.m41850j(this.f43389t);
            this.f43387r.m41774j(Integer.valueOf(System.identityHashCode(this.f43370a.f43504o)));
            C9493m0 c9493m0 = new C9493m0(this, null);
            C2414a.a<? extends InterfaceC9556f, C9551a> aVar = this.f43389t;
            Context context = this.f43372c;
            Looper mo13109f = this.f43370a.f43504o.mo13109f();
            C9902d c9902d = this.f43387r;
            this.f43380k = aVar.buildClient(context, mo13109f, c9902d, (C9902d) c9902d.m41770f(), (GoogleApiClient.InterfaceC2412b) c9493m0, (GoogleApiClient.InterfaceC2413c) c9493m0);
        }
        this.f43377h = this.f43370a.f43496g.size();
        this.f43390u.add(C9548z0.m40088a().submit(new C9468h0(this, hashMap)));
    }

    @Override // p383w9.InterfaceC9532v0
    /* renamed from: d */
    public final void mo39819d() {
    }

    @Override // p383w9.InterfaceC9532v0
    /* renamed from: e */
    public final void mo39820e(int i10) {
        m40003k(new C8804b(8, null));
    }

    @Override // p383w9.InterfaceC9532v0
    /* renamed from: f */
    public final boolean mo39821f() {
        m39999I();
        m40001i(true);
        this.f43370a.m40085k(null);
        return true;
    }

    @Override // p383w9.InterfaceC9532v0
    /* renamed from: g */
    public final <A extends C2414a.b, T extends AbstractC2418a<? extends InterfaceC9320f, A>> T mo39822g(T t10) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* renamed from: h */
    public final void m40000h() {
        this.f43382m = false;
        this.f43370a.f43504o.f43450p = Collections.emptySet();
        for (C2414a.c<?> cVar : this.f43379j) {
            if (!this.f43370a.f43497h.containsKey(cVar)) {
                this.f43370a.f43497h.put(cVar, new C8804b(17, null));
            }
        }
    }

    /* renamed from: i */
    public final void m40001i(boolean z10) {
        InterfaceC9556f interfaceC9556f = this.f43380k;
        if (interfaceC9556f != null) {
            if (interfaceC9556f.isConnected() && z10) {
                interfaceC9556f.mo40090b();
            }
            interfaceC9556f.disconnect();
            this.f43384o = null;
        }
    }

    /* renamed from: j */
    public final void m40002j() {
        this.f43370a.m40083i();
        C9548z0.m40088a().execute(new RunnableC9448d0(this));
        InterfaceC9556f interfaceC9556f = this.f43380k;
        if (interfaceC9556f != null) {
            if (this.f43385p) {
                interfaceC9556f.mo40092d((InterfaceC9917i) C9935o.m41850j(this.f43384o), this.f43386q);
            }
            m40001i(false);
        }
        Iterator<C2414a.c<?>> it = this.f43370a.f43497h.keySet().iterator();
        while (it.hasNext()) {
            ((C2414a.f) C9935o.m41850j(this.f43370a.f43496g.get(it.next()))).disconnect();
        }
        this.f43370a.f43505p.mo39926a(this.f43378i.isEmpty() ? null : this.f43378i);
    }

    /* renamed from: k */
    public final void m40003k(C8804b c8804b) {
        m39999I();
        m40001i(!c8804b.m37662S());
        this.f43370a.m40085k(c8804b);
        this.f43370a.f43505p.mo39927b(c8804b);
    }

    /* renamed from: l */
    public final void m40004l(C8804b c8804b, C2414a<?> c2414a, boolean z10) {
        int priority = c2414a.m13130c().getPriority();
        if ((!z10 || c8804b.m37662S() || this.f43373d.m37700c(c8804b.m37659P()) != null) && (this.f43374e == null || priority < this.f43375f)) {
            this.f43374e = c8804b;
            this.f43375f = priority;
        }
        this.f43370a.f43497h.put(c2414a.m13129b(), c8804b);
    }

    /* renamed from: m */
    public final void m40005m() {
        if (this.f43377h != 0) {
            return;
        }
        if (!this.f43382m || this.f43383n) {
            ArrayList arrayList = new ArrayList();
            this.f43376g = 1;
            this.f43377h = this.f43370a.f43496g.size();
            for (C2414a.c<?> cVar : this.f43370a.f43496g.keySet()) {
                if (!this.f43370a.f43497h.containsKey(cVar)) {
                    arrayList.add(this.f43370a.f43496g.get(cVar));
                } else if (m40007o()) {
                    m40002j();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.f43390u.add(C9548z0.m40088a().submit(new C9473i0(this, arrayList)));
        }
    }

    /* renamed from: n */
    public final boolean m40006n(int i10) {
        if (this.f43376g == i10) {
            return true;
        }
        Log.w("GACConnecting", this.f43370a.f43504o.m40055m());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        int i11 = this.f43377h;
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("mRemainingConnections=");
        sb2.append(i11);
        Log.w("GACConnecting", sb2.toString());
        String m39989q = m39989q(this.f43376g);
        String m39989q2 = m39989q(i10);
        StringBuilder sb3 = new StringBuilder(m39989q.length() + 70 + m39989q2.length());
        sb3.append("GoogleApiClient connecting is in step ");
        sb3.append(m39989q);
        sb3.append(" but received callback for step ");
        sb3.append(m39989q2);
        Log.e("GACConnecting", sb3.toString(), new Exception());
        m40003k(new C8804b(8, null));
        return false;
    }

    /* renamed from: o */
    public final boolean m40007o() {
        C8804b c8804b;
        int i10 = this.f43377h - 1;
        this.f43377h = i10;
        if (i10 > 0) {
            return false;
        }
        if (i10 < 0) {
            Log.w("GACConnecting", this.f43370a.f43504o.m40055m());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            c8804b = new C8804b(8, null);
        } else {
            c8804b = this.f43374e;
            if (c8804b == null) {
                return true;
            }
            this.f43370a.f43503n = this.f43375f;
        }
        m40003k(c8804b);
        return false;
    }

    /* renamed from: p */
    public final boolean m40008p(C8804b c8804b) {
        return this.f43381l && !c8804b.m37662S();
    }
}

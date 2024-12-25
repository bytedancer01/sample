package p383w9;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC2416c;
import com.google.android.gms.common.api.C2414a;
import com.google.android.gms.common.api.C2414a.d;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p011aa.C0140e;
import p060da.C4403b;
import p294r.C7928a;
import p350u9.C8804b;
import p350u9.C8808d;
import p368v9.C9325k;
import p383w9.C9472i;
import p422y9.C9932n;
import p422y9.C9935o;
import za.C10146j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/g1.class
 */
/* renamed from: w9.g1 */
/* loaded from: combined.jar:classes2.jar:w9/g1.class */
public final class C9464g1<O extends C2414a.d> implements GoogleApiClient.InterfaceC2412b, GoogleApiClient.InterfaceC2413c, InterfaceC9466g3 {

    /* renamed from: c */
    @NotOnlyInitialized
    public final C2414a.f f43266c;

    /* renamed from: d */
    public final C9437b<O> f43267d;

    /* renamed from: e */
    public final C9535w f43268e;

    /* renamed from: h */
    public final int f43271h;

    /* renamed from: i */
    public final BinderC9465g2 f43272i;

    /* renamed from: j */
    public boolean f43273j;

    /* renamed from: n */
    public final C9457f f43277n;

    /* renamed from: b */
    public final Queue<AbstractC9526t2> f43265b = new LinkedList();

    /* renamed from: f */
    public final Set<C9538w2> f43269f = new HashSet();

    /* renamed from: g */
    public final Map<C9472i.a<?>, C9537w1> f43270g = new HashMap();

    /* renamed from: k */
    public final List<C9474i1> f43274k = new ArrayList();

    /* renamed from: l */
    public C8804b f43275l = null;

    /* renamed from: m */
    public int f43276m = 0;

    public C9464g1(C9457f c9457f, AbstractC2416c<O> abstractC2416c) {
        this.f43277n = c9457f;
        C2414a.f zab = abstractC2416c.zab(c9457f.f43255q.getLooper(), this);
        this.f43266c = zab;
        this.f43267d = abstractC2416c.getApiKey();
        this.f43268e = new C9535w();
        this.f43271h = abstractC2416c.zaa();
        if (zab.requiresSignIn()) {
            this.f43272i = abstractC2416c.zac(c9457f.f43246h, c9457f.f43255q);
        } else {
            this.f43272i = null;
        }
    }

    /* renamed from: y */
    public static /* bridge */ /* synthetic */ void m39878y(C9464g1 c9464g1, C9474i1 c9474i1) {
        if (c9464g1.f43274k.contains(c9474i1) && !c9464g1.f43273j) {
            if (c9464g1.f43266c.isConnected()) {
                c9464g1.m39898f();
            } else {
                c9464g1.m39881B();
            }
        }
    }

    /* renamed from: z */
    public static /* bridge */ /* synthetic */ void m39879z(C9464g1 c9464g1, C9474i1 c9474i1) {
        C8808d c8808d;
        C8808d[] mo40010g;
        if (c9464g1.f43274k.remove(c9474i1)) {
            c9464g1.f43277n.f43255q.removeMessages(15, c9474i1);
            c9464g1.f43277n.f43255q.removeMessages(16, c9474i1);
            c8808d = c9474i1.f43297b;
            ArrayList arrayList = new ArrayList(c9464g1.f43265b.size());
            for (AbstractC9526t2 abstractC9526t2 : c9464g1.f43265b) {
                if ((abstractC9526t2 instanceof AbstractC9509p1) && (mo40010g = ((AbstractC9509p1) abstractC9526t2).mo40010g(c9464g1)) != null && C4403b.m22429c(mo40010g, c8808d)) {
                    arrayList.add(abstractC9526t2);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC9526t2 abstractC9526t22 = (AbstractC9526t2) arrayList.get(i10);
                c9464g1.f43265b.remove(abstractC9526t22);
                abstractC9526t22.mo39942b(new C9325k(c8808d));
            }
        }
    }

    /* renamed from: A */
    public final void m39880A() {
        C9935o.m41843c(this.f43277n.f43255q);
        this.f43275l = null;
    }

    /* renamed from: B */
    public final void m39881B() {
        C8804b c8804b;
        C9935o.m41843c(this.f43277n.f43255q);
        if (this.f43266c.isConnected() || this.f43266c.isConnecting()) {
            return;
        }
        try {
            C9457f c9457f = this.f43277n;
            int m41806b = c9457f.f43248j.m41806b(c9457f.f43246h, this.f43266c);
            if (m41806b == 0) {
                C9457f c9457f2 = this.f43277n;
                C2414a.f fVar = this.f43266c;
                C9484k1 c9484k1 = new C9484k1(c9457f2, fVar, this.f43267d);
                if (fVar.requiresSignIn()) {
                    ((BinderC9465g2) C9935o.m41850j(this.f43272i)).m39914C1(c9484k1);
                }
                try {
                    this.f43266c.connect(c9484k1);
                    return;
                } catch (SecurityException e10) {
                    e = e10;
                    c8804b = new C8804b(10);
                    m39884E(c8804b, e);
                    return;
                }
            }
            C8804b c8804b2 = new C8804b(m41806b, null);
            String name = this.f43266c.getClass().getName();
            String obj = c8804b2.toString();
            StringBuilder sb2 = new StringBuilder(name.length() + 35 + obj.length());
            sb2.append("The service for ");
            sb2.append(name);
            sb2.append(" is not available: ");
            sb2.append(obj);
            Log.w("GoogleApiManager", sb2.toString());
            m39884E(c8804b2, null);
        } catch (IllegalStateException e11) {
            e = e11;
            c8804b = new C8804b(10);
        }
    }

    /* renamed from: C */
    public final void m39882C(AbstractC9526t2 abstractC9526t2) {
        C9935o.m41843c(this.f43277n.f43255q);
        if (this.f43266c.isConnected()) {
            if (m39904l(abstractC9526t2)) {
                m39901i();
                return;
            } else {
                this.f43265b.add(abstractC9526t2);
                return;
            }
        }
        this.f43265b.add(abstractC9526t2);
        C8804b c8804b = this.f43275l;
        if (c8804b == null || !c8804b.m37662S()) {
            m39881B();
        } else {
            m39884E(this.f43275l, null);
        }
    }

    /* renamed from: D */
    public final void m39883D() {
        this.f43276m++;
    }

    /* renamed from: E */
    public final void m39884E(C8804b c8804b, Exception exc) {
        C9935o.m41843c(this.f43277n.f43255q);
        BinderC9465g2 binderC9465g2 = this.f43272i;
        if (binderC9465g2 != null) {
            binderC9465g2.m39915D1();
        }
        m39880A();
        this.f43277n.f43248j.m41807c();
        m39895c(c8804b);
        if ((this.f43266c instanceof C0140e) && c8804b.m37659P() != 24) {
            this.f43277n.f43243e = true;
            C9457f c9457f = this.f43277n;
            c9457f.f43255q.sendMessageDelayed(c9457f.f43255q.obtainMessage(19), 300000L);
        }
        if (c8804b.m37659P() == 4) {
            m39896d(C9457f.f43237t);
            return;
        }
        if (this.f43265b.isEmpty()) {
            this.f43275l = c8804b;
            return;
        }
        if (exc != null) {
            C9935o.m41843c(this.f43277n.f43255q);
            m39897e(null, exc, false);
            return;
        }
        if (!this.f43277n.f43256r) {
            m39896d(C9457f.m39832h(this.f43267d, c8804b));
            return;
        }
        m39897e(C9457f.m39832h(this.f43267d, c8804b), null, true);
        if (this.f43265b.isEmpty() || m39905m(c8804b) || this.f43277n.m39855g(c8804b, this.f43271h)) {
            return;
        }
        if (c8804b.m37659P() == 18) {
            this.f43273j = true;
        }
        if (!this.f43273j) {
            m39896d(C9457f.m39832h(this.f43267d, c8804b));
        } else {
            C9457f c9457f2 = this.f43277n;
            c9457f2.f43255q.sendMessageDelayed(Message.obtain(c9457f2.f43255q, 9, this.f43267d), this.f43277n.f43240b);
        }
    }

    /* renamed from: F */
    public final void m39885F(C8804b c8804b) {
        C9935o.m41843c(this.f43277n.f43255q);
        C2414a.f fVar = this.f43266c;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(c8804b);
        StringBuilder sb2 = new StringBuilder(name.length() + 25 + valueOf.length());
        sb2.append("onSignInFailed for ");
        sb2.append(name);
        sb2.append(" with ");
        sb2.append(valueOf);
        fVar.disconnect(sb2.toString());
        m39884E(c8804b, null);
    }

    /* renamed from: G */
    public final void m39886G(C9538w2 c9538w2) {
        C9935o.m41843c(this.f43277n.f43255q);
        this.f43269f.add(c9538w2);
    }

    /* renamed from: H */
    public final void m39887H() {
        C9935o.m41843c(this.f43277n.f43255q);
        if (this.f43273j) {
            m39881B();
        }
    }

    /* renamed from: I */
    public final void m39888I() {
        C9935o.m41843c(this.f43277n.f43255q);
        m39896d(C9457f.f43236s);
        this.f43268e.m40068f();
        for (C9472i.a aVar : (C9472i.a[]) this.f43270g.keySet().toArray(new C9472i.a[0])) {
            m39882C(new C9522s2(aVar, new C10146j()));
        }
        m39895c(new C8804b(4));
        if (this.f43266c.isConnected()) {
            this.f43266c.onUserSignOut(new C9459f1(this));
        }
    }

    /* renamed from: J */
    public final void m39889J() {
        C9935o.m41843c(this.f43277n.f43255q);
        if (this.f43273j) {
            m39903k();
            C9457f c9457f = this.f43277n;
            m39896d(c9457f.f43247i.mo37680i(c9457f.f43246h) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f43266c.disconnect("Timing out connection while resuming.");
        }
    }

    /* renamed from: L */
    public final boolean m39890L() {
        return this.f43266c.isConnected();
    }

    /* renamed from: M */
    public final boolean m39891M() {
        return this.f43266c.requiresSignIn();
    }

    @Override // p383w9.InterfaceC9466g3
    /* renamed from: Z */
    public final void mo39892Z(C8804b c8804b, C2414a<?> c2414a, boolean z10) {
        throw null;
    }

    /* renamed from: a */
    public final boolean m39893a() {
        return m39906n(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final C8808d m39894b(C8808d[] c8808dArr) {
        if (c8808dArr == null || c8808dArr.length == 0) {
            return null;
        }
        C8808d[] availableFeatures = this.f43266c.getAvailableFeatures();
        C8808d[] c8808dArr2 = availableFeatures;
        if (availableFeatures == null) {
            c8808dArr2 = new C8808d[0];
        }
        C7928a c7928a = new C7928a(c8808dArr2.length);
        for (C8808d c8808d : c8808dArr2) {
            c7928a.put(c8808d.getName(), Long.valueOf(c8808d.m37672P()));
        }
        for (C8808d c8808d2 : c8808dArr) {
            Long l10 = (Long) c7928a.get(c8808d2.getName());
            if (l10 == null || l10.longValue() < c8808d2.m37672P()) {
                return c8808d2;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void m39895c(C8804b c8804b) {
        Iterator<C9538w2> it = this.f43269f.iterator();
        while (it.hasNext()) {
            it.next().m40073b(this.f43267d, c8804b, C9932n.m41832b(c8804b, C8804b.f40818h) ? this.f43266c.getEndpointPackageName() : null);
        }
        this.f43269f.clear();
    }

    /* renamed from: d */
    public final void m39896d(Status status) {
        C9935o.m41843c(this.f43277n.f43255q);
        m39897e(status, null, false);
    }

    /* renamed from: e */
    public final void m39897e(Status status, Exception exc, boolean z10) {
        C9935o.m41843c(this.f43277n.f43255q);
        boolean z11 = false;
        boolean z12 = status == null;
        if (exc == null) {
            z11 = true;
        }
        if (z12 == z11) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator<AbstractC9526t2> it = this.f43265b.iterator();
        while (it.hasNext()) {
            AbstractC9526t2 next = it.next();
            if (!z10 || next.f43433a == 2) {
                if (status != null) {
                    next.mo39941a(status);
                } else {
                    next.mo39942b(exc);
                }
                it.remove();
            }
        }
    }

    /* renamed from: f */
    public final void m39898f() {
        ArrayList arrayList = new ArrayList(this.f43265b);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC9526t2 abstractC9526t2 = (AbstractC9526t2) arrayList.get(i10);
            if (!this.f43266c.isConnected()) {
                return;
            }
            if (m39904l(abstractC9526t2)) {
                this.f43265b.remove(abstractC9526t2);
            }
        }
    }

    /* renamed from: g */
    public final void m39899g() {
        m39880A();
        m39895c(C8804b.f40818h);
        m39903k();
        Iterator<C9537w1> it = this.f43270g.values().iterator();
        while (it.hasNext()) {
            C9537w1 next = it.next();
            if (m39894b(next.f43475a.m39947c()) == null) {
                try {
                    next.f43475a.mo39948d(this.f43266c, new C10146j<>());
                } catch (DeadObjectException e10) {
                    onConnectionSuspended(3);
                    this.f43266c.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException e11) {
                }
            }
            it.remove();
        }
        m39898f();
        m39901i();
    }

    /* renamed from: h */
    public final void m39900h(int i10) {
        m39880A();
        this.f43273j = true;
        this.f43268e.m40067e(i10, this.f43266c.getLastDisconnectMessage());
        C9457f c9457f = this.f43277n;
        c9457f.f43255q.sendMessageDelayed(Message.obtain(c9457f.f43255q, 9, this.f43267d), this.f43277n.f43240b);
        C9457f c9457f2 = this.f43277n;
        c9457f2.f43255q.sendMessageDelayed(Message.obtain(c9457f2.f43255q, 11, this.f43267d), this.f43277n.f43241c);
        this.f43277n.f43248j.m41807c();
        Iterator<C9537w1> it = this.f43270g.values().iterator();
        while (it.hasNext()) {
            it.next().f43477c.run();
        }
    }

    /* renamed from: i */
    public final void m39901i() {
        this.f43277n.f43255q.removeMessages(12, this.f43267d);
        C9457f c9457f = this.f43277n;
        c9457f.f43255q.sendMessageDelayed(c9457f.f43255q.obtainMessage(12, this.f43267d), this.f43277n.f43242d);
    }

    /* renamed from: j */
    public final void m39902j(AbstractC9526t2 abstractC9526t2) {
        abstractC9526t2.mo40011d(this.f43268e, m39891M());
        try {
            abstractC9526t2.mo39943c(this);
        } catch (DeadObjectException e10) {
            onConnectionSuspended(1);
            this.f43266c.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    /* renamed from: k */
    public final void m39903k() {
        if (this.f43273j) {
            this.f43277n.f43255q.removeMessages(11, this.f43267d);
            this.f43277n.f43255q.removeMessages(9, this.f43267d);
            this.f43273j = false;
        }
    }

    /* renamed from: l */
    public final boolean m39904l(AbstractC9526t2 abstractC9526t2) {
        if (!(abstractC9526t2 instanceof AbstractC9509p1)) {
            m39902j(abstractC9526t2);
            return true;
        }
        AbstractC9509p1 abstractC9509p1 = (AbstractC9509p1) abstractC9526t2;
        C8808d m39894b = m39894b(abstractC9509p1.mo40010g(this));
        if (m39894b == null) {
            m39902j(abstractC9526t2);
            return true;
        }
        String name = this.f43266c.getClass().getName();
        String name2 = m39894b.getName();
        long m37672P = m39894b.m37672P();
        StringBuilder sb2 = new StringBuilder(name.length() + 77 + String.valueOf(name2).length());
        sb2.append(name);
        sb2.append(" could not execute call because it requires feature (");
        sb2.append(name2);
        sb2.append(", ");
        sb2.append(m37672P);
        sb2.append(").");
        Log.w("GoogleApiManager", sb2.toString());
        if (!this.f43277n.f43256r || !abstractC9509p1.mo40009f(this)) {
            abstractC9509p1.mo39942b(new C9325k(m39894b));
            return true;
        }
        C9474i1 c9474i1 = new C9474i1(this.f43267d, m39894b, null);
        int indexOf = this.f43274k.indexOf(c9474i1);
        if (indexOf >= 0) {
            C9474i1 c9474i12 = this.f43274k.get(indexOf);
            this.f43277n.f43255q.removeMessages(15, c9474i12);
            C9457f c9457f = this.f43277n;
            c9457f.f43255q.sendMessageDelayed(Message.obtain(c9457f.f43255q, 15, c9474i12), this.f43277n.f43240b);
            return false;
        }
        this.f43274k.add(c9474i1);
        C9457f c9457f2 = this.f43277n;
        c9457f2.f43255q.sendMessageDelayed(Message.obtain(c9457f2.f43255q, 15, c9474i1), this.f43277n.f43240b);
        C9457f c9457f3 = this.f43277n;
        c9457f3.f43255q.sendMessageDelayed(Message.obtain(c9457f3.f43255q, 16, c9474i1), this.f43277n.f43241c);
        C8804b c8804b = new C8804b(2, null);
        if (m39905m(c8804b)) {
            return false;
        }
        this.f43277n.m39855g(c8804b, this.f43271h);
        return false;
    }

    /* renamed from: m */
    public final boolean m39905m(C8804b c8804b) {
        synchronized (C9457f.f43238u) {
            C9457f c9457f = this.f43277n;
            if (c9457f.f43252n == null || !c9457f.f43253o.contains(this.f43267d)) {
                return false;
            }
            this.f43277n.f43252n.m39808s(c8804b, this.f43271h);
            return true;
        }
    }

    /* renamed from: n */
    public final boolean m39906n(boolean z10) {
        C9935o.m41843c(this.f43277n.f43255q);
        if (!this.f43266c.isConnected() || this.f43270g.size() != 0) {
            return false;
        }
        if (!this.f43268e.m40069g()) {
            this.f43266c.disconnect("Timing out service connection.");
            return true;
        }
        if (!z10) {
            return false;
        }
        m39901i();
        return false;
    }

    /* renamed from: o */
    public final int m39907o() {
        return this.f43271h;
    }

    @Override // p383w9.InterfaceC9452e
    public final void onConnected(Bundle bundle) {
        if (Looper.myLooper() == this.f43277n.f43255q.getLooper()) {
            m39899g();
        } else {
            this.f43277n.f43255q.post(new RunnableC9444c1(this));
        }
    }

    @Override // p383w9.InterfaceC9487l
    public final void onConnectionFailed(C8804b c8804b) {
        m39884E(c8804b, null);
    }

    @Override // p383w9.InterfaceC9452e
    public final void onConnectionSuspended(int i10) {
        if (Looper.myLooper() == this.f43277n.f43255q.getLooper()) {
            m39900h(i10);
        } else {
            this.f43277n.f43255q.post(new RunnableC9449d1(this, i10));
        }
    }

    /* renamed from: p */
    public final int m39908p() {
        return this.f43276m;
    }

    /* renamed from: q */
    public final C8804b m39909q() {
        C9935o.m41843c(this.f43277n.f43255q);
        return this.f43275l;
    }

    /* renamed from: s */
    public final C2414a.f m39910s() {
        return this.f43266c;
    }

    /* renamed from: u */
    public final Map<C9472i.a<?>, C9537w1> m39911u() {
        return this.f43270g;
    }
}

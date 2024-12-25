package p383w9;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.C2414a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC2418a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import la.C5831e;
import p294r.C7928a;
import p350u9.C8804b;
import p350u9.C8814g;
import p368v9.InterfaceC9320f;
import p384wa.C9551a;
import p384wa.InterfaceC9556f;
import p422y9.C9902d;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/t.class
 */
/* renamed from: w9.t */
/* loaded from: combined.jar:classes2.jar:w9/t.class */
public final class C9523t implements InterfaceC9513q1 {

    /* renamed from: b */
    public final Context f43417b;

    /* renamed from: c */
    public final C9528u0 f43418c;

    /* renamed from: d */
    public final Looper f43419d;

    /* renamed from: e */
    public final C9544y0 f43420e;

    /* renamed from: f */
    public final C9544y0 f43421f;

    /* renamed from: g */
    public final Map<C2414a.c<?>, C9544y0> f43422g;

    /* renamed from: i */
    public final C2414a.f f43424i;

    /* renamed from: j */
    public Bundle f43425j;

    /* renamed from: n */
    public final Lock f43429n;

    /* renamed from: h */
    public final Set<InterfaceC9507p> f43423h = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: k */
    public C8804b f43426k = null;

    /* renamed from: l */
    public C8804b f43427l = null;

    /* renamed from: m */
    public boolean f43428m = false;

    /* renamed from: o */
    public int f43430o = 0;

    public C9523t(Context context, C9528u0 c9528u0, Lock lock, Looper looper, C8814g c8814g, Map<C2414a.c<?>, C2414a.f> map, Map<C2414a.c<?>, C2414a.f> map2, C9902d c9902d, C2414a.a<? extends InterfaceC9556f, C9551a> aVar, C2414a.f fVar, ArrayList<C9461f3> arrayList, ArrayList<C9461f3> arrayList2, Map<C2414a<?>, Boolean> map3, Map<C2414a<?>, Boolean> map4) {
        this.f43417b = context;
        this.f43418c = c9528u0;
        this.f43429n = lock;
        this.f43419d = looper;
        this.f43424i = fVar;
        this.f43420e = new C9544y0(context, c9528u0, lock, looper, c8814g, map2, null, map4, null, arrayList2, new C9476i3(this, null));
        this.f43421f = new C9544y0(context, c9528u0, lock, looper, c8814g, map, c9902d, map3, aVar, arrayList, new C9486k3(this, null));
        C7928a c7928a = new C7928a();
        Iterator<C2414a.c<?>> it = map2.keySet().iterator();
        while (it.hasNext()) {
            c7928a.put(it.next(), this.f43420e);
        }
        Iterator<C2414a.c<?>> it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            c7928a.put(it2.next(), this.f43421f);
        }
        this.f43422g = Collections.unmodifiableMap(c7928a);
    }

    /* renamed from: k */
    public static boolean m40032k(C8804b c8804b) {
        return c8804b != null && c8804b.m37663T();
    }

    /* renamed from: m */
    public static C9523t m40034m(Context context, C9528u0 c9528u0, Lock lock, Looper looper, C8814g c8814g, Map<C2414a.c<?>, C2414a.f> map, C9902d c9902d, Map<C2414a<?>, Boolean> map2, C2414a.a<? extends InterfaceC9556f, C9551a> aVar, ArrayList<C9461f3> arrayList) {
        C7928a c7928a = new C7928a();
        C7928a c7928a2 = new C7928a();
        C2414a.f fVar = null;
        for (Map.Entry<C2414a.c<?>, C2414a.f> entry : map.entrySet()) {
            C2414a.f value = entry.getValue();
            if (true == value.providesSignIn()) {
                fVar = value;
            }
            boolean requiresSignIn = value.requiresSignIn();
            C2414a.c<?> key = entry.getKey();
            if (requiresSignIn) {
                c7928a.put(key, value);
            } else {
                c7928a2.put(key, value);
            }
        }
        C9935o.m41854n(!c7928a.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        C7928a c7928a3 = new C7928a();
        C7928a c7928a4 = new C7928a();
        for (C2414a<?> c2414a : map2.keySet()) {
            C2414a.c<?> m13129b = c2414a.m13129b();
            if (c7928a.containsKey(m13129b)) {
                c7928a3.put(c2414a, map2.get(c2414a));
            } else {
                if (!c7928a2.containsKey(m13129b)) {
                    throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                }
                c7928a4.put(c2414a, map2.get(c2414a));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C9461f3 c9461f3 = arrayList.get(i10);
            if (c7928a3.containsKey(c9461f3.f43260b)) {
                arrayList2.add(c9461f3);
            } else {
                if (!c7928a4.containsKey(c9461f3.f43260b)) {
                    throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                }
                arrayList3.add(c9461f3);
            }
        }
        return new C9523t(context, c9528u0, lock, looper, c8814g, c7928a, c7928a2, c9902d, aVar, fVar, arrayList2, arrayList3, c7928a3, c7928a4);
    }

    /* renamed from: t */
    public static /* bridge */ /* synthetic */ void m40041t(C9523t c9523t, int i10, boolean z10) {
        c9523t.f43418c.mo39928c(i10, z10);
        c9523t.f43427l = null;
        c9523t.f43426k = null;
    }

    /* renamed from: u */
    public static /* bridge */ /* synthetic */ void m40042u(C9523t c9523t, Bundle bundle) {
        Bundle bundle2 = c9523t.f43425j;
        if (bundle2 == null) {
            c9523t.f43425j = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    /* renamed from: v */
    public static /* bridge */ /* synthetic */ void m40043v(C9523t c9523t) {
        C8804b c8804b;
        if (!m40032k(c9523t.f43426k)) {
            if (c9523t.f43426k != null && m40032k(c9523t.f43427l)) {
                c9523t.f43421f.mo40014c();
                c9523t.m40045g((C8804b) C9935o.m41850j(c9523t.f43426k));
                return;
            }
            C8804b c8804b2 = c9523t.f43426k;
            if (c8804b2 == null || (c8804b = c9523t.f43427l) == null) {
                return;
            }
            if (c9523t.f43421f.f43503n < c9523t.f43420e.f43503n) {
                c8804b2 = c8804b;
            }
            c9523t.m40045g(c8804b2);
            return;
        }
        if (!m40032k(c9523t.f43427l) && !c9523t.m40047i()) {
            C8804b c8804b3 = c9523t.f43427l;
            if (c8804b3 != null) {
                if (c9523t.f43430o == 1) {
                    c9523t.m40046h();
                    return;
                } else {
                    c9523t.m40045g(c8804b3);
                    c9523t.f43420e.mo40014c();
                    return;
                }
            }
            return;
        }
        int i10 = c9523t.f43430o;
        if (i10 != 1) {
            if (i10 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                c9523t.f43430o = 0;
            }
            ((C9528u0) C9935o.m41850j(c9523t.f43418c)).mo39926a(c9523t.f43425j);
        }
        c9523t.m40046h();
        c9523t.f43430o = 0;
    }

    @Override // p383w9.InterfaceC9513q1
    /* renamed from: a */
    public final void mo40012a() {
        this.f43430o = 2;
        this.f43428m = false;
        this.f43427l = null;
        this.f43426k = null;
        this.f43420e.mo40012a();
        this.f43421f.mo40012a();
    }

    @Override // p383w9.InterfaceC9513q1
    /* renamed from: b */
    public final void mo40013b() {
        this.f43420e.mo40013b();
        this.f43421f.mo40013b();
    }

    @Override // p383w9.InterfaceC9513q1
    /* renamed from: c */
    public final void mo40014c() {
        this.f43427l = null;
        this.f43426k = null;
        this.f43430o = 0;
        this.f43420e.mo40014c();
        this.f43421f.mo40014c();
        m40046h();
    }

    @Override // p383w9.InterfaceC9513q1
    /* renamed from: d */
    public final void mo40015d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f43421f.mo40015d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f43420e.mo40015d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r3.f43430o == 1) goto L13;
     */
    @Override // p383w9.InterfaceC9513q1
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo40016e() {
        /*
            r3 = this;
            r0 = r3
            java.util.concurrent.locks.Lock r0 = r0.f43429n
            r0.lock()
            r0 = r3
            w9.y0 r0 = r0.f43420e     // Catch: java.lang.Throwable -> L45
            boolean r0 = r0.mo40016e()     // Catch: java.lang.Throwable -> L45
            r7 = r0
            r0 = 0
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r7
            if (r0 == 0) goto L3a
            r0 = r3
            w9.y0 r0 = r0.f43421f     // Catch: java.lang.Throwable -> L45
            boolean r0 = r0.mo40016e()     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto L38
            r0 = r3
            boolean r0 = r0.m40047i()     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto L38
            r0 = r3
            int r0 = r0.f43430o     // Catch: java.lang.Throwable -> L45
            r4 = r0
            r0 = r6
            r5 = r0
            r0 = r4
            r1 = 1
            if (r0 != r1) goto L3a
        L38:
            r0 = 1
            r5 = r0
        L3a:
            r0 = r3
            java.util.concurrent.locks.Lock r0 = r0.f43429n
            r0.unlock()
            r0 = r5
            return r0
        L45:
            r8 = move-exception
            r0 = r3
            java.util.concurrent.locks.Lock r0 = r0.f43429n
            r0.unlock()
            r0 = r8
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p383w9.C9523t.mo40016e():boolean");
    }

    @Override // p383w9.InterfaceC9513q1
    /* renamed from: f */
    public final <A extends C2414a.b, T extends AbstractC2418a<? extends InterfaceC9320f, A>> T mo40017f(T t10) {
        if (!m40048j(t10)) {
            return (T) this.f43420e.mo40017f(t10);
        }
        if (!m40047i()) {
            return (T) this.f43421f.mo40017f(t10);
        }
        t10.m13171w(new Status(4, (String) null, m40049x()));
        return t10;
    }

    /* renamed from: g */
    public final void m40045g(C8804b c8804b) {
        int i10 = this.f43430o;
        if (i10 != 1) {
            if (i10 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f43430o = 0;
            }
            this.f43418c.mo39927b(c8804b);
        }
        m40046h();
        this.f43430o = 0;
    }

    /* renamed from: h */
    public final void m40046h() {
        Iterator<InterfaceC9507p> it = this.f43423h.iterator();
        while (it.hasNext()) {
            it.next().m39980a();
        }
        this.f43423h.clear();
    }

    /* renamed from: i */
    public final boolean m40047i() {
        C8804b c8804b = this.f43427l;
        return c8804b != null && c8804b.m37659P() == 4;
    }

    /* renamed from: j */
    public final boolean m40048j(AbstractC2418a<? extends InterfaceC9320f, ? extends C2414a.b> abstractC2418a) {
        C9544y0 c9544y0 = this.f43422g.get(abstractC2418a.m13167s());
        C9935o.m41851k(c9544y0, "GoogleApiClient is not configured to use the API required for this call.");
        return c9544y0.equals(this.f43421f);
    }

    /* renamed from: x */
    public final PendingIntent m40049x() {
        if (this.f43424i == null) {
            return null;
        }
        return C5831e.m28418a(this.f43417b, System.identityHashCode(this.f43418c), this.f43424i.getSignInIntent(), C5831e.f32453a | 134217728);
    }
}

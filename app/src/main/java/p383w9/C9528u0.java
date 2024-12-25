package p383w9;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.C2414a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC2418a;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import p060da.C4405d;
import p350u9.C8804b;
import p350u9.C8812f;
import p368v9.InterfaceC9320f;
import p384wa.C9551a;
import p384wa.InterfaceC9556f;
import p422y9.C9902d;
import p422y9.C9915h0;
import p422y9.C9935o;
import p422y9.InterfaceC9912g0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/u0.class
 */
/* renamed from: w9.u0 */
/* loaded from: combined.jar:classes2.jar:w9/u0.class */
public final class C9528u0 extends GoogleApiClient implements InterfaceC9504o1 {

    /* renamed from: b */
    public final Lock f43436b;

    /* renamed from: c */
    public final C9915h0 f43437c;

    /* renamed from: e */
    public final int f43439e;

    /* renamed from: f */
    public final Context f43440f;

    /* renamed from: g */
    public final Looper f43441g;

    /* renamed from: i */
    public volatile boolean f43443i;

    /* renamed from: j */
    public long f43444j;

    /* renamed from: k */
    public long f43445k;

    /* renamed from: l */
    public final HandlerC9520s0 f43446l;

    /* renamed from: m */
    public final C8812f f43447m;

    /* renamed from: n */
    public C9499n1 f43448n;

    /* renamed from: o */
    public final Map<C2414a.c<?>, C2414a.f> f43449o;

    /* renamed from: p */
    public Set<Scope> f43450p;

    /* renamed from: q */
    public final C9902d f43451q;

    /* renamed from: r */
    public final Map<C2414a<?>, Boolean> f43452r;

    /* renamed from: s */
    public final C2414a.a<? extends InterfaceC9556f, C9551a> f43453s;

    /* renamed from: t */
    public final C9477j f43454t;

    /* renamed from: u */
    public final ArrayList<C9461f3> f43455u;

    /* renamed from: v */
    public Integer f43456v;

    /* renamed from: w */
    public Set<C9495m2> f43457w;

    /* renamed from: x */
    public final C9505o2 f43458x;

    /* renamed from: y */
    public final InterfaceC9912g0 f43459y;

    /* renamed from: d */
    public InterfaceC9513q1 f43438d = null;

    /* renamed from: h */
    public final Queue<AbstractC2418a<?, ?>> f43442h = new LinkedList();

    public C9528u0(Context context, Lock lock, Looper looper, C9902d c9902d, C8812f c8812f, C2414a.a<? extends InterfaceC9556f, C9551a> aVar, Map<C2414a<?>, Boolean> map, List<GoogleApiClient.InterfaceC2412b> list, List<GoogleApiClient.InterfaceC2413c> list2, Map<C2414a.c<?>, C2414a.f> map2, int i10, int i11, ArrayList<C9461f3> arrayList) {
        this.f43444j = true != C4405d.m22431a() ? 120000L : 10000L;
        this.f43445k = 5000L;
        this.f43450p = new HashSet();
        this.f43454t = new C9477j();
        this.f43456v = null;
        this.f43457w = null;
        C9516r0 c9516r0 = new C9516r0(this);
        this.f43459y = c9516r0;
        this.f43440f = context;
        this.f43436b = lock;
        this.f43437c = new C9915h0(looper, c9516r0);
        this.f43441g = looper;
        this.f43446l = new HandlerC9520s0(this, looper);
        this.f43447m = c8812f;
        this.f43439e = i10;
        if (i10 >= 0) {
            this.f43456v = Integer.valueOf(i11);
        }
        this.f43452r = map;
        this.f43449o = map2;
        this.f43455u = arrayList;
        this.f43458x = new C9505o2();
        Iterator<GoogleApiClient.InterfaceC2412b> it = list.iterator();
        while (it.hasNext()) {
            this.f43437c.m41800f(it.next());
        }
        Iterator<GoogleApiClient.InterfaceC2413c> it2 = list2.iterator();
        while (it2.hasNext()) {
            this.f43437c.m41801g(it2.next());
        }
        this.f43451q = c9902d;
        this.f43453s = aVar;
    }

    /* renamed from: l */
    public static int m40051l(Iterable<C2414a.f> iterable, boolean z10) {
        boolean z11;
        Iterator<C2414a.f> it = iterable.iterator();
        boolean z12 = false;
        boolean z13 = false;
        while (true) {
            z11 = z13;
            if (!it.hasNext()) {
                break;
            }
            C2414a.f next = it.next();
            z12 |= next.requiresSignIn();
            z13 = z11 | next.providesSignIn();
        }
        if (z12) {
            return (z11 && z10) ? 2 : 1;
        }
        return 3;
    }

    /* renamed from: n */
    public static String m40052n(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    /* renamed from: o */
    public static /* bridge */ /* synthetic */ void m40053o(C9528u0 c9528u0) {
        c9528u0.f43436b.lock();
        try {
            if (c9528u0.f43443i) {
                c9528u0.m40058s();
            }
        } finally {
            c9528u0.f43436b.unlock();
        }
    }

    /* renamed from: p */
    public static /* bridge */ /* synthetic */ void m40054p(C9528u0 c9528u0) {
        c9528u0.f43436b.lock();
        try {
            if (c9528u0.m40056q()) {
                c9528u0.m40058s();
            }
        } finally {
            c9528u0.f43436b.unlock();
        }
    }

    @Override // p383w9.InterfaceC9504o1
    /* renamed from: a */
    public final void mo39926a(Bundle bundle) {
        while (!this.f43442h.isEmpty()) {
            mo13108e(this.f43442h.remove());
        }
        this.f43437c.m41798d(bundle);
    }

    @Override // p383w9.InterfaceC9504o1
    /* renamed from: b */
    public final void mo39927b(C8804b c8804b) {
        if (!this.f43447m.m37702k(this.f43440f, c8804b.m37659P())) {
            m40056q();
        }
        if (this.f43443i) {
            return;
        }
        this.f43437c.m41797c(c8804b);
        this.f43437c.m41795a();
    }

    @Override // p383w9.InterfaceC9504o1
    /* renamed from: c */
    public final void mo39928c(int i10, boolean z10) {
        int i11 = i10;
        if (i10 == 1) {
            if (!z10 && !this.f43443i) {
                this.f43443i = true;
                if (this.f43448n == null && !C4405d.m22431a()) {
                    try {
                        this.f43448n = this.f43447m.m37689v(this.f43440f.getApplicationContext(), new C9524t0(this));
                    } catch (SecurityException e10) {
                    }
                }
                HandlerC9520s0 handlerC9520s0 = this.f43446l;
                handlerC9520s0.sendMessageDelayed(handlerC9520s0.obtainMessage(1), this.f43444j);
                HandlerC9520s0 handlerC9520s02 = this.f43446l;
                handlerC9520s02.sendMessageDelayed(handlerC9520s02.obtainMessage(2), this.f43445k);
            }
            i11 = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f43458x.f43364a.toArray(new BasePendingResult[0])) {
            basePendingResult.m13143f(C9505o2.f43363c);
        }
        this.f43437c.m41799e(i11);
        this.f43437c.m41795a();
        if (i11 == 2) {
            m40058s();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        boolean z10;
        this.f43436b.lock();
        try {
            if (this.f43439e >= 0) {
                C9935o.m41854n(this.f43456v != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f43456v;
                if (num == null) {
                    this.f43456v = Integer.valueOf(m40051l(this.f43449o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int intValue = ((Integer) C9935o.m41850j(this.f43456v)).intValue();
            this.f43436b.lock();
            if (intValue != 3 && intValue != 1) {
                if (intValue != 2) {
                    z10 = false;
                    StringBuilder sb2 = new StringBuilder(33);
                    sb2.append("Illegal sign-in mode: ");
                    sb2.append(intValue);
                    C9935o.m41842b(z10, sb2.toString());
                    m40057r(intValue);
                    m40058s();
                    this.f43436b.unlock();
                }
                intValue = 2;
            }
            z10 = true;
            StringBuilder sb22 = new StringBuilder(33);
            sb22.append("Illegal sign-in mode: ");
            sb22.append(intValue);
            C9935o.m41842b(z10, sb22.toString());
            m40057r(intValue);
            m40058s();
            this.f43436b.unlock();
        } catch (Throwable th2) {
            throw th2;
        } finally {
            this.f43436b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: d */
    public final void mo13107d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f43440f);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.f43443i);
        printWriter.append(" mWorkQueue.size()=").print(this.f43442h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f43458x.f43364a.size());
        InterfaceC9513q1 interfaceC9513q1 = this.f43438d;
        if (interfaceC9513q1 != null) {
            interfaceC9513q1.mo40015d(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        this.f43436b.lock();
        try {
            this.f43458x.m39976b();
            InterfaceC9513q1 interfaceC9513q1 = this.f43438d;
            if (interfaceC9513q1 != null) {
                interfaceC9513q1.mo40014c();
            }
            this.f43454t.m39930b();
            for (AbstractC2418a<?, ?> abstractC2418a : this.f43442h) {
                abstractC2418a.m13151p(null);
                abstractC2418a.mo13140c();
            }
            this.f43442h.clear();
            if (this.f43438d != null) {
                m40056q();
                this.f43437c.m41795a();
            }
        } finally {
            this.f43436b.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [com.google.android.gms.common.api.internal.a] */
    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: e */
    public final <A extends C2414a.b, T extends AbstractC2418a<? extends InterfaceC9320f, A>> T mo13108e(T t10) {
        T mo40017f;
        C2414a<?> m13166r = t10.m13166r();
        boolean containsKey = this.f43449o.containsKey(t10.m13167s());
        String m13131d = m13166r != null ? m13166r.m13131d() : "the API";
        StringBuilder sb2 = new StringBuilder(String.valueOf(m13131d).length() + 65);
        sb2.append("GoogleApiClient is not configured to use ");
        sb2.append(m13131d);
        sb2.append(" required for this call.");
        C9935o.m41842b(containsKey, sb2.toString());
        this.f43436b.lock();
        try {
            InterfaceC9513q1 interfaceC9513q1 = this.f43438d;
            if (interfaceC9513q1 == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.f43443i) {
                this.f43442h.add(t10);
                while (true) {
                    mo40017f = t10;
                    if (this.f43442h.isEmpty()) {
                        break;
                    }
                    AbstractC2418a<?, ?> remove = this.f43442h.remove();
                    this.f43458x.m39975a(remove);
                    remove.m13171w(Status.f14795k);
                }
            } else {
                mo40017f = interfaceC9513q1.mo40017f(t10);
            }
            this.f43436b.unlock();
            return mo40017f;
        } catch (Throwable th2) {
            this.f43436b.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: f */
    public final Looper mo13109f() {
        return this.f43441g;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: g */
    public final boolean mo13110g() {
        InterfaceC9513q1 interfaceC9513q1 = this.f43438d;
        return interfaceC9513q1 != null && interfaceC9513q1.mo40016e();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: h */
    public final void mo13111h(GoogleApiClient.InterfaceC2413c interfaceC2413c) {
        this.f43437c.m41801g(interfaceC2413c);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: i */
    public final void mo13112i(GoogleApiClient.InterfaceC2413c interfaceC2413c) {
        this.f43437c.m41802h(interfaceC2413c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        if ((!r0) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a7, code lost:
    
        throw r5;
     */
    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo13113j(p383w9.C9495m2 r5) {
        /*
            r4 = this;
            r0 = r4
            java.util.concurrent.locks.Lock r0 = r0.f43436b
            r0.lock()
            r0 = r4
            java.util.Set<w9.m2> r0 = r0.f43457w     // Catch: java.lang.Throwable -> L9c
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L2a
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L9c
            r5 = r0
            r0 = r5
            r0.<init>()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r0 = "Attempted to remove pending transform when no transforms are registered."
            r7 = r0
        L1e:
            java.lang.String r0 = "GoogleApiClientImpl"
            r1 = r7
            r2 = r5
            int r0 = android.util.Log.wtf(r0, r1, r2)     // Catch: java.lang.Throwable -> L9c
            goto L86
        L2a:
            r0 = r7
            r1 = r5
            boolean r0 = r0.remove(r1)     // Catch: java.lang.Throwable -> L9c
            if (r0 != 0) goto L43
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L9c
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> L9c
            r5 = r0
            java.lang.String r0 = "Failed to remove pending transform - this may lead to memory leaks!"
            r7 = r0
            goto L1e
        L43:
            r0 = r4
            java.util.concurrent.locks.Lock r0 = r0.f43436b     // Catch: java.lang.Throwable -> L9c
            r0.lock()     // Catch: java.lang.Throwable -> L9c
            r0 = r4
            java.util.Set<w9.m2> r0 = r0.f43457w     // Catch: java.lang.Throwable -> L90
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L61
            r0 = r4
            java.util.concurrent.locks.Lock r0 = r0.f43436b     // Catch: java.lang.Throwable -> L9c
            r0.unlock()     // Catch: java.lang.Throwable -> L9c
            goto L77
        L61:
            r0 = r5
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L90
            r6 = r0
            r0 = r4
            java.util.concurrent.locks.Lock r0 = r0.f43436b     // Catch: java.lang.Throwable -> L9c
            r0.unlock()     // Catch: java.lang.Throwable -> L9c
            r0 = r6
            r1 = 1
            r0 = r0 ^ r1
            if (r0 != 0) goto L86
        L77:
            r0 = r4
            w9.q1 r0 = r0.f43438d     // Catch: java.lang.Throwable -> L9c
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L86
            r0 = r5
            r0.mo40013b()     // Catch: java.lang.Throwable -> L9c
        L86:
            r0 = r4
            java.util.concurrent.locks.Lock r0 = r0.f43436b
            r0.unlock()
            return
        L90:
            r5 = move-exception
            r0 = r4
            java.util.concurrent.locks.Lock r0 = r0.f43436b     // Catch: java.lang.Throwable -> L9c
            r0.unlock()     // Catch: java.lang.Throwable -> L9c
            r0 = r5
            throw r0     // Catch: java.lang.Throwable -> L9c
        L9c:
            r5 = move-exception
            r0 = r4
            java.util.concurrent.locks.Lock r0 = r0.f43436b
            r0.unlock()
            r0 = r5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p383w9.C9528u0.mo13113j(w9.m2):void");
    }

    /* renamed from: m */
    public final String m40055m() {
        StringWriter stringWriter = new StringWriter();
        mo13107d("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    /* renamed from: q */
    public final boolean m40056q() {
        if (!this.f43443i) {
            return false;
        }
        this.f43443i = false;
        this.f43446l.removeMessages(2);
        this.f43446l.removeMessages(1);
        C9499n1 c9499n1 = this.f43448n;
        if (c9499n1 == null) {
            return true;
        }
        c9499n1.m39974b();
        this.f43448n = null;
        return true;
    }

    /* renamed from: r */
    public final void m40057r(int i10) {
        boolean z10;
        InterfaceC9513q1 c9544y0;
        Integer num = this.f43456v;
        if (num == null) {
            this.f43456v = Integer.valueOf(i10);
        } else if (num.intValue() != i10) {
            String m40052n = m40052n(i10);
            String m40052n2 = m40052n(this.f43456v.intValue());
            StringBuilder sb2 = new StringBuilder(m40052n.length() + 51 + m40052n2.length());
            sb2.append("Cannot use sign-in mode: ");
            sb2.append(m40052n);
            sb2.append(". Mode was already set to ");
            sb2.append(m40052n2);
            throw new IllegalStateException(sb2.toString());
        }
        if (this.f43438d != null) {
            return;
        }
        Iterator<C2414a.f> it = this.f43449o.values().iterator();
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            z10 = z12;
            if (!it.hasNext()) {
                break;
            }
            C2414a.f next = it.next();
            z11 |= next.requiresSignIn();
            z12 = z10 | next.providesSignIn();
        }
        int intValue = this.f43456v.intValue();
        if (intValue != 1) {
            if (intValue == 2 && z11) {
                c9544y0 = C9523t.m40034m(this.f43440f, this, this.f43436b, this.f43441g, this.f43447m, this.f43449o, this.f43451q, this.f43452r, this.f43453s, this.f43455u);
                this.f43438d = c9544y0;
            }
        } else {
            if (!z11) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            if (z10) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        }
        c9544y0 = new C9544y0(this.f43440f, this, this.f43436b, this.f43441g, this.f43447m, this.f43449o, this.f43451q, this.f43452r, this.f43453s, this.f43455u, this);
        this.f43438d = c9544y0;
    }

    /* renamed from: s */
    public final void m40058s() {
        this.f43437c.m41796b();
        ((InterfaceC9513q1) C9935o.m41850j(this.f43438d)).mo40012a();
    }
}

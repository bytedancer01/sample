package p435z3;

import android.util.Log;
import p034c4.InterfaceC0988b;
import p299r4.InterfaceC7957e;
import p329t3.EnumC8619i;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:z3/i.class
 */
/* renamed from: z3.i */
/* loaded from: combined.jar:classes1.jar:z3/i.class */
public class RunnableC10045i implements Runnable, InterfaceC0988b {

    /* renamed from: b */
    public final EnumC8619i f46105b;

    /* renamed from: c */
    public final a f46106c;

    /* renamed from: d */
    public final C10037a<?, ?, ?> f46107d;

    /* renamed from: e */
    public b f46108e = b.CACHE;

    /* renamed from: f */
    public volatile boolean f46109f;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:z3/i$a.class
     */
    /* renamed from: z3.i$a */
    /* loaded from: combined.jar:classes1.jar:z3/i$a.class */
    public interface a extends InterfaceC7957e {
        /* renamed from: g */
        void mo42240g(RunnableC10045i runnableC10045i);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:z3/i$b.class
     */
    /* renamed from: z3.i$b */
    /* loaded from: combined.jar:classes1.jar:z3/i$b.class */
    public enum b {
        CACHE,
        SOURCE
    }

    public RunnableC10045i(a aVar, C10037a<?, ?, ?> c10037a, EnumC8619i enumC8619i) {
        this.f46106c = aVar;
        this.f46107d = c10037a;
        this.f46105b = enumC8619i;
    }

    /* renamed from: a */
    public void m42254a() {
        this.f46109f = true;
        this.f46107d.m42209c();
    }

    /* renamed from: b */
    public final InterfaceC10048l<?> m42255b() {
        return m42258e() ? m42256c() : m42257d();
    }

    /* renamed from: c */
    public final InterfaceC10048l<?> m42256c() {
        InterfaceC10048l<?> interfaceC10048l;
        try {
            interfaceC10048l = this.f46107d.m42212f();
        } catch (Exception e10) {
            if (Log.isLoggable("EngineRunnable", 3)) {
                Log.d("EngineRunnable", "Exception decoding result from cache: " + e10);
            }
            interfaceC10048l = null;
        }
        InterfaceC10048l<?> interfaceC10048l2 = interfaceC10048l;
        if (interfaceC10048l == null) {
            interfaceC10048l2 = this.f46107d.m42214h();
        }
        return interfaceC10048l2;
    }

    /* renamed from: d */
    public final InterfaceC10048l<?> m42257d() {
        return this.f46107d.m42210d();
    }

    /* renamed from: e */
    public final boolean m42258e() {
        return this.f46108e == b.CACHE;
    }

    /* renamed from: f */
    public final void m42259f(InterfaceC10048l interfaceC10048l) {
        this.f46106c.mo34488e(interfaceC10048l);
    }

    /* renamed from: g */
    public final void m42260g(Exception exc) {
        if (!m42258e()) {
            this.f46106c.mo34484a(exc);
        } else {
            this.f46108e = b.SOURCE;
            this.f46106c.mo42240g(this);
        }
    }

    @Override // p034c4.InterfaceC0988b
    public int getPriority() {
        return this.f46105b.ordinal();
    }

    @Override // java.lang.Runnable
    public void run() {
        Exception e10;
        if (this.f46109f) {
            return;
        }
        InterfaceC10048l<?> interfaceC10048l = null;
        try {
            interfaceC10048l = m42255b();
            e10 = null;
        } catch (Exception e11) {
            e10 = e11;
            if (Log.isLoggable("EngineRunnable", 2)) {
                Log.v("EngineRunnable", "Exception decoding", e10);
            }
        } catch (OutOfMemoryError e12) {
            if (Log.isLoggable("EngineRunnable", 2)) {
                Log.v("EngineRunnable", "Out Of Memory Error decoding", e12);
            }
            e10 = new C10046j(e12);
        }
        if (this.f46109f) {
            if (interfaceC10048l != null) {
                interfaceC10048l.mo25232b();
            }
        } else if (interfaceC10048l == null) {
            m42260g(e10);
        } else {
            m42259f(interfaceC10048l);
        }
    }
}

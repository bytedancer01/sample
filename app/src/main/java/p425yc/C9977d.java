package p425yc;

import android.content.Context;
import bd.InterfaceC0891b;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p287qc.C7882d;
import p287qc.C7896q;
import p287qc.C7902w;
import p287qc.InterfaceC7884e;
import p425yc.InterfaceC9979f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yc/d.class
 */
/* renamed from: yc.d */
/* loaded from: combined.jar:classes2.jar:yc/d.class */
public class C9977d implements InterfaceC9979f {

    /* renamed from: d */
    public static final ThreadFactory f45697d = ThreadFactoryC9976c.m41916a();

    /* renamed from: a */
    public InterfaceC0891b<C9980g> f45698a;

    /* renamed from: b */
    public final Set<InterfaceC9978e> f45699b;

    /* renamed from: c */
    public final Executor f45700c;

    public C9977d(Context context, Set<InterfaceC9978e> set) {
        this(new C7902w(C9974a.m41914a(context)), set, new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f45697d));
    }

    public C9977d(InterfaceC0891b<C9980g> interfaceC0891b, Set<InterfaceC9978e> set, Executor executor) {
        this.f45698a = interfaceC0891b;
        this.f45699b = set;
        this.f45700c = executor;
    }

    /* renamed from: b */
    public static C7882d<InterfaceC9979f> m41917b() {
        return C7882d.m34166a(InterfaceC9979f.class).m34181b(C7896q.m34235i(Context.class)).m34181b(C7896q.m34236j(InterfaceC9978e.class)).m34185f(C9975b.m41915b()).m34183d();
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceC9979f m41918c(InterfaceC7884e interfaceC7884e) {
        return new C9977d((Context) interfaceC7884e.get(Context.class), interfaceC7884e.mo34154b(InterfaceC9978e.class));
    }

    /* renamed from: e */
    public static /* synthetic */ Thread m41920e(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    @Override // p425yc.InterfaceC9979f
    /* renamed from: a */
    public InterfaceC9979f.a mo41921a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean m41925d = this.f45698a.get().m41925d(str, currentTimeMillis);
        boolean m41924c = this.f45698a.get().m41924c(currentTimeMillis);
        return (m41925d && m41924c) ? InterfaceC9979f.a.COMBINED : m41924c ? InterfaceC9979f.a.GLOBAL : m41925d ? InterfaceC9979f.a.SDK : InterfaceC9979f.a.NONE;
    }
}

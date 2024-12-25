package p159j3;

import com.amazonaws.mobileconnectors.appsync.AppSyncMutationCall;
import com.amazonaws.mobileconnectors.appsync.AppSyncPrefetch;
import com.amazonaws.mobileconnectors.appsync.AppSyncQueryCall;
import com.amazonaws.mobileconnectors.appsync.AppSyncQueryWatcher;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p004a3.InterfaceC0049c;
import p004a3.InterfaceC0050d;
import p004a3.InterfaceC0051e;
import p004a3.InterfaceC0052f;
import p004a3.InterfaceC0063q;
import p033c3.C0986f;
import p434z2.InterfaceC10034c;
import p434z2.InterfaceC10035d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:j3/a.class
 */
/* renamed from: j3.a */
/* loaded from: combined.jar:classes1.jar:j3/a.class */
public final class C5283a {

    /* renamed from: a */
    public final Map<InterfaceC0051e, Set<AppSyncPrefetch>> f30328a = new HashMap();

    /* renamed from: b */
    public final Map<InterfaceC0051e, Set<AppSyncQueryCall>> f30329b = new HashMap();

    /* renamed from: c */
    public final Map<InterfaceC0051e, Set<AppSyncMutationCall>> f30330c = new HashMap();

    /* renamed from: d */
    public final Map<InterfaceC0051e, Set<AppSyncQueryWatcher>> f30331d = new HashMap();

    /* renamed from: e */
    public final AtomicInteger f30332e = new AtomicInteger();

    /* renamed from: f */
    public InterfaceC10035d f30333f;

    /* renamed from: a */
    public final <CALL> Set<CALL> m26371a(Map<InterfaceC0051e, Set<CALL>> map, InterfaceC0051e interfaceC0051e) {
        Set<CALL> hashSet;
        C0986f.m5892c(interfaceC0051e, "operationName == null");
        synchronized (map) {
            Set<CALL> set = map.get(interfaceC0051e);
            hashSet = set != null ? new HashSet<>(set) : Collections.emptySet();
        }
        return hashSet;
    }

    /* renamed from: b */
    public Set<AppSyncQueryWatcher> m26372b(InterfaceC0051e interfaceC0051e) {
        return m26371a(this.f30331d, interfaceC0051e);
    }

    /* renamed from: c */
    public final void m26373c() {
        InterfaceC10035d interfaceC10035d = this.f30333f;
        if (interfaceC10035d != null) {
            interfaceC10035d.m42205a();
        }
    }

    /* renamed from: d */
    public final <CALL> void m26374d(Map<InterfaceC0051e, Set<CALL>> map, InterfaceC0051e interfaceC0051e, CALL call) {
        synchronized (map) {
            Set<CALL> set = map.get(interfaceC0051e);
            Set<CALL> set2 = set;
            if (set == null) {
                set2 = new HashSet<>();
                map.put(interfaceC0051e, set2);
            }
            set2.add(call);
        }
        this.f30332e.incrementAndGet();
    }

    /* renamed from: e */
    public void m26375e(InterfaceC10034c interfaceC10034c) {
        C0986f.m5892c(interfaceC10034c, "call == null");
        InterfaceC0050d operation = interfaceC10034c.operation();
        if (operation instanceof InterfaceC0052f) {
            m26378h((AppSyncQueryCall) interfaceC10034c);
        } else if (operation instanceof InterfaceC0049c) {
            m26376f((AppSyncMutationCall) interfaceC10034c);
        } else if (!(operation instanceof InterfaceC0063q)) {
            throw new IllegalArgumentException("Unknown call type");
        }
    }

    /* renamed from: f */
    public void m26376f(AppSyncMutationCall appSyncMutationCall) {
        C0986f.m5892c(appSyncMutationCall, "appSyncMutationCall == null");
        m26374d(this.f30330c, appSyncMutationCall.operation().name(), appSyncMutationCall);
    }

    /* renamed from: g */
    public void m26377g(AppSyncPrefetch appSyncPrefetch) {
        C0986f.m5892c(appSyncPrefetch, "appSyncPrefetch == null");
        m26374d(this.f30328a, appSyncPrefetch.operation().name(), appSyncPrefetch);
    }

    /* renamed from: h */
    public void m26378h(AppSyncQueryCall appSyncQueryCall) {
        C0986f.m5892c(appSyncQueryCall, "appSyncQueryCall == null");
        m26374d(this.f30329b, appSyncQueryCall.operation().name(), appSyncQueryCall);
    }

    /* renamed from: i */
    public void m26379i(AppSyncQueryWatcher appSyncQueryWatcher) {
        C0986f.m5892c(appSyncQueryWatcher, "queryWatcher == null");
        m26374d(this.f30331d, appSyncQueryWatcher.operation().name(), appSyncQueryWatcher);
    }

    /* renamed from: j */
    public final <CALL> void m26380j(Map<InterfaceC0051e, Set<CALL>> map, InterfaceC0051e interfaceC0051e, CALL call) {
        synchronized (map) {
            Set<CALL> set = map.get(interfaceC0051e);
            if (set == null || !set.remove(call)) {
                throw new AssertionError("Call wasn't registered before");
            }
            if (set.isEmpty()) {
                map.remove(interfaceC0051e);
            }
        }
        if (this.f30332e.decrementAndGet() == 0) {
            m26373c();
        }
    }

    /* renamed from: k */
    public void m26381k(InterfaceC10034c interfaceC10034c) {
        C0986f.m5892c(interfaceC10034c, "call == null");
        InterfaceC0050d operation = interfaceC10034c.operation();
        if (operation instanceof InterfaceC0052f) {
            m26384n((AppSyncQueryCall) interfaceC10034c);
        } else if (operation instanceof InterfaceC0049c) {
            m26382l((AppSyncMutationCall) interfaceC10034c);
        } else if (!(operation instanceof InterfaceC0063q)) {
            throw new IllegalArgumentException("Unknown call type");
        }
    }

    /* renamed from: l */
    public void m26382l(AppSyncMutationCall appSyncMutationCall) {
        C0986f.m5892c(appSyncMutationCall, "appSyncMutationCall == null");
        m26380j(this.f30330c, appSyncMutationCall.operation().name(), appSyncMutationCall);
    }

    /* renamed from: m */
    public void m26383m(AppSyncPrefetch appSyncPrefetch) {
        C0986f.m5892c(appSyncPrefetch, "appSyncPrefetch == null");
        m26380j(this.f30328a, appSyncPrefetch.operation().name(), appSyncPrefetch);
    }

    /* renamed from: n */
    public void m26384n(AppSyncQueryCall appSyncQueryCall) {
        C0986f.m5892c(appSyncQueryCall, "appSyncQueryCall == null");
        m26380j(this.f30329b, appSyncQueryCall.operation().name(), appSyncQueryCall);
    }

    /* renamed from: o */
    public void m26385o(AppSyncQueryWatcher appSyncQueryWatcher) {
        C0986f.m5892c(appSyncQueryWatcher, "queryWatcher == null");
        m26380j(this.f30331d, appSyncQueryWatcher.operation().name(), appSyncQueryWatcher);
    }
}

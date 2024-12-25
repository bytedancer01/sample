package ma;

import android.content.Context;
import android.os.Looper;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p200l9.C5762f;
import p208m1.C5900i;
import p208m1.C5901j;
import p216m9.AbstractC5987r0;
import p304r9.C8015b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/v.class
 */
/* renamed from: ma.v */
/* loaded from: combined.jar:classes2.jar:ma/v.class */
public final class C6445v extends C5901j.a {

    /* renamed from: f */
    public static final C8015b f34095f = new C8015b("MRDiscoveryCallback");

    /* renamed from: e */
    public final C6425u f34100e;

    /* renamed from: c */
    public final Map f34098c = Collections.synchronizedMap(new HashMap());

    /* renamed from: d */
    public final LinkedHashSet f34099d = new LinkedHashSet();

    /* renamed from: b */
    public final Set f34097b = Collections.synchronizedSet(new LinkedHashSet());

    /* renamed from: a */
    public final C6404t f34096a = new C6404t(this);

    public C6445v(Context context) {
        this.f34100e = new C6425u(context);
    }

    @Override // p208m1.C5901j.a
    /* renamed from: d */
    public final void mo3234d(C5901j c5901j, C5901j.h hVar) {
        f34095f.m34873a("MediaRouterDiscoveryCallback.onRouteAdded.", new Object[0]);
        m30074t(hVar, true);
    }

    @Override // p208m1.C5901j.a
    /* renamed from: e */
    public final void mo3235e(C5901j c5901j, C5901j.h hVar) {
        f34095f.m34873a("MediaRouterDiscoveryCallback.onRouteChanged.", new Object[0]);
        m30074t(hVar, true);
    }

    @Override // p208m1.C5901j.a
    /* renamed from: g */
    public final void mo3236g(C5901j c5901j, C5901j.h hVar) {
        f34095f.m34873a("MediaRouterDiscoveryCallback.onRouteRemoved.", new Object[0]);
        m30074t(hVar, false);
    }

    /* renamed from: o */
    public final void m30069o(List list) {
        f34095f.m34873a("SetRouteDiscovery for " + list.size() + " IDs", new Object[0]);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(C6447v1.m30075a((String) it.next()));
        }
        f34095f.m34873a("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.f34098c.keySet())), new Object[0]);
        HashMap hashMap = new HashMap();
        synchronized (this.f34098c) {
            for (String str : linkedHashSet) {
                C6383s c6383s = (C6383s) this.f34098c.get(C6447v1.m30075a(str));
                if (c6383s != null) {
                    hashMap.put(str, c6383s);
                }
            }
            this.f34098c.clear();
            this.f34098c.putAll(hashMap);
        }
        f34095f.m34873a("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.f34098c.keySet())), new Object[0]);
        synchronized (this.f34099d) {
            this.f34099d.clear();
            this.f34099d.addAll(linkedHashSet);
        }
        m30070p();
    }

    /* renamed from: p */
    public final void m30070p() {
        C8015b c8015b = f34095f;
        c8015b.m34873a("Starting RouteDiscovery with " + this.f34099d.size() + " IDs", new Object[0]);
        c8015b.m34873a("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.f34098c.keySet())), new Object[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m30071q();
        } else {
            new HandlerC6385s1(Looper.getMainLooper()).post(new Runnable(this) { // from class: ma.r

                /* renamed from: b */
                public final C6445v f33990b;

                {
                    this.f33990b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f33990b.m30071q();
                }
            });
        }
    }

    /* renamed from: q */
    public final void m30071q() {
        this.f34100e.m30059b(this);
        synchronized (this.f34099d) {
            Iterator it = this.f34099d.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                C5900i m28863d = new C5900i.a().m28861b(C5762f.m28194a(str)).m28863d();
                if (((C6383s) this.f34098c.get(str)) == null) {
                    this.f34098c.put(str, new C6383s(m28863d));
                }
                C8015b c8015b = f34095f;
                c8015b.m34873a("Adding mediaRouter callback for control category " + C5762f.m28194a(str), new Object[0]);
                this.f34100e.m30058a().m28872b(m28863d, this, 4);
            }
        }
        f34095f.m34873a("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.f34098c.keySet())), new Object[0]);
    }

    /* renamed from: r */
    public final void m30072r() {
        f34095f.m34873a("Stopping RouteDiscovery.", new Object[0]);
        this.f34098c.clear();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f34100e.m30059b(this);
        } else {
            new HandlerC6385s1(Looper.getMainLooper()).post(new Runnable(this) { // from class: ma.q

                /* renamed from: b */
                public final C6445v f33971b;

                {
                    this.f33971b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f33971b.m30073s();
                }
            });
        }
    }

    /* renamed from: s */
    public final void m30073s() {
        this.f34100e.m30059b(this);
    }

    /* renamed from: t */
    public final void m30074t(C5901j.h hVar, boolean z10) {
        boolean z11;
        C8015b c8015b = f34095f;
        c8015b.m34873a("MediaRouterDiscoveryCallback.updateRouteToAppIds (add=%b) route %s", Boolean.valueOf(z10), hVar);
        synchronized (this.f34098c) {
            c8015b.m34873a("appIdToRouteInfo has these appId route keys: " + String.valueOf(this.f34098c.keySet()), new Object[0]);
            z11 = false;
            for (Map.Entry entry : this.f34098c.entrySet()) {
                String str = (String) entry.getKey();
                C6383s c6383s = (C6383s) entry.getValue();
                if (hVar.m28977E(c6383s.f34004b)) {
                    if (z10) {
                        C8015b c8015b2 = f34095f;
                        c8015b2.m34873a("Adding/updating route for appId " + str, new Object[0]);
                        boolean add = c6383s.f34003a.add(hVar);
                        z11 = add;
                        if (!add) {
                            c8015b2.m34878f("Route " + String.valueOf(hVar) + " already exists for appId " + str, new Object[0]);
                            z11 = add;
                        }
                    } else {
                        C8015b c8015b3 = f34095f;
                        c8015b3.m34873a("Removing route for appId " + str, new Object[0]);
                        boolean remove = c6383s.f34003a.remove(hVar);
                        z11 = remove;
                        if (!remove) {
                            c8015b3.m34878f("Route " + String.valueOf(hVar) + " already removed from appId " + str, new Object[0]);
                            z11 = remove;
                        }
                    }
                }
            }
        }
        if (z11) {
            f34095f.m34873a("Invoking callback.onRouteUpdated.", new Object[0]);
            synchronized (this.f34097b) {
                HashMap hashMap = new HashMap();
                synchronized (this.f34098c) {
                    for (String str2 : this.f34098c.keySet()) {
                        C6383s c6383s2 = (C6383s) this.f34098c.get(C6447v1.m30075a(str2));
                        AbstractC6428u2 m30063x = c6383s2 == null ? AbstractC6428u2.m30063x() : AbstractC6428u2.m30062w(c6383s2.f34003a);
                        if (!m30063x.isEmpty()) {
                            hashMap.put(str2, m30063x);
                        }
                    }
                }
                AbstractC6407t2.m30033d(hashMap.entrySet());
                Iterator it = this.f34097b.iterator();
                while (it.hasNext()) {
                    ((AbstractC5987r0) it.next()).m29347a();
                }
            }
        }
    }
}

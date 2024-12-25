package p208m1;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p208m1.AbstractC5897f;
import p208m1.ServiceConnectionC5913v;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:m1/x.class
 */
/* renamed from: m1.x */
/* loaded from: combined.jar:classes1.jar:m1/x.class */
public final class C5915x {

    /* renamed from: a */
    public final Context f33247a;

    /* renamed from: b */
    public final c f33248b;

    /* renamed from: d */
    public final PackageManager f33250d;

    /* renamed from: f */
    public boolean f33252f;

    /* renamed from: e */
    public final ArrayList<ServiceConnectionC5913v> f33251e = new ArrayList<>();

    /* renamed from: g */
    public final BroadcastReceiver f33253g = new a(this);

    /* renamed from: h */
    public final Runnable f33254h = new b(this);

    /* renamed from: c */
    public final Handler f33249c = new Handler();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/x$a.class
     */
    /* renamed from: m1.x$a */
    /* loaded from: combined.jar:classes1.jar:m1/x$a.class */
    public class a extends BroadcastReceiver {

        /* renamed from: a */
        public final C5915x f33255a;

        public a(C5915x c5915x) {
            this.f33255a = c5915x;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            this.f33255a.m29141g();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/x$b.class
     */
    /* renamed from: m1.x$b */
    /* loaded from: combined.jar:classes1.jar:m1/x$b.class */
    public class b implements Runnable {

        /* renamed from: b */
        public final C5915x f33256b;

        public b(C5915x c5915x) {
            this.f33256b = c5915x;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f33256b.m29141g();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/x$c.class
     */
    /* renamed from: m1.x$c */
    /* loaded from: combined.jar:classes1.jar:m1/x$c.class */
    public interface c {
        /* renamed from: b */
        void mo28921b(ServiceConnectionC5913v serviceConnectionC5913v, AbstractC5897f.e eVar);

        /* renamed from: c */
        void mo28922c(AbstractC5897f abstractC5897f);

        /* renamed from: d */
        void mo28923d(AbstractC5897f abstractC5897f);
    }

    public C5915x(Context context, c cVar) {
        this.f33247a = context;
        this.f33248b = cVar;
        this.f33250d = context.getPackageManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m29136d(ServiceConnectionC5913v serviceConnectionC5913v, AbstractC5897f.e eVar) {
        this.f33248b.mo28921b(serviceConnectionC5913v, eVar);
    }

    /* renamed from: e */
    public static boolean m29137e(List<ServiceInfo> list, ServiceInfo serviceInfo) {
        if (serviceInfo == null || list == null || list.isEmpty()) {
            return false;
        }
        for (ServiceInfo serviceInfo2 : list) {
            if (serviceInfo.packageName.equals(serviceInfo2.packageName) && serviceInfo.name.equals(serviceInfo2.name)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final int m29138b(String str, String str2) {
        int size = this.f33251e.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f33251e.get(i10).m29088G(str, str2)) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public List<ServiceInfo> m29139c() {
        Intent intent = new Intent("android.media.MediaRoute2ProviderService");
        ArrayList arrayList = new ArrayList();
        Iterator<ResolveInfo> it = this.f33250d.queryIntentServices(intent, 0).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().serviceInfo);
        }
        return arrayList;
    }

    /* renamed from: f */
    public void m29140f() {
        this.f33249c.post(this.f33254h);
    }

    /* renamed from: g */
    public void m29141g() {
        if (this.f33252f) {
            List<ServiceInfo> arrayList = new ArrayList();
            if (Build.VERSION.SDK_INT >= 30) {
                arrayList = m29139c();
            }
            int i10 = 0;
            Iterator<ResolveInfo> it = this.f33250d.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null && (!C5901j.m28869p() || !m29137e(arrayList, serviceInfo))) {
                    int m29138b = m29138b(serviceInfo.packageName, serviceInfo.name);
                    if (m29138b < 0) {
                        final ServiceConnectionC5913v serviceConnectionC5913v = new ServiceConnectionC5913v(this.f33247a, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        serviceConnectionC5913v.m29097P(new ServiceConnectionC5913v.b(this, serviceConnectionC5913v) { // from class: m1.w

                            /* renamed from: a */
                            public final C5915x f33245a;

                            /* renamed from: b */
                            public final ServiceConnectionC5913v f33246b;

                            {
                                this.f33245a = this;
                                this.f33246b = serviceConnectionC5913v;
                            }

                            @Override // p208m1.ServiceConnectionC5913v.b
                            /* renamed from: a */
                            public final void mo29128a(AbstractC5897f.e eVar) {
                                this.f33245a.m29136d(this.f33246b, eVar);
                            }
                        });
                        serviceConnectionC5913v.m29099R();
                        this.f33251e.add(i10, serviceConnectionC5913v);
                        this.f33248b.mo28923d(serviceConnectionC5913v);
                        i10++;
                    } else if (m29138b >= i10) {
                        ServiceConnectionC5913v serviceConnectionC5913v2 = this.f33251e.get(m29138b);
                        serviceConnectionC5913v2.m29099R();
                        serviceConnectionC5913v2.m29096O();
                        Collections.swap(this.f33251e, m29138b, i10);
                        i10++;
                    }
                }
            }
            if (i10 < this.f33251e.size()) {
                for (int size = this.f33251e.size() - 1; size >= i10; size--) {
                    ServiceConnectionC5913v serviceConnectionC5913v3 = this.f33251e.get(size);
                    this.f33248b.mo28922c(serviceConnectionC5913v3);
                    this.f33251e.remove(serviceConnectionC5913v3);
                    serviceConnectionC5913v3.m29097P(null);
                    serviceConnectionC5913v3.m29100S();
                }
            }
        }
    }

    /* renamed from: h */
    public void m29142h() {
        if (this.f33252f) {
            return;
        }
        this.f33252f = true;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
        intentFilter.addDataScheme("package");
        this.f33247a.registerReceiver(this.f33253g, intentFilter, null, this.f33249c);
        this.f33249c.post(this.f33254h);
    }
}

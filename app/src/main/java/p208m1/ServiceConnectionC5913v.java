package p208m1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p208m1.AbstractC5897f;
import p208m1.C5901j;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:m1/v.class
 */
/* renamed from: m1.v */
/* loaded from: combined.jar:classes1.jar:m1/v.class */
public final class ServiceConnectionC5913v extends AbstractC5897f implements ServiceConnection {

    /* renamed from: r */
    public static final boolean f33206r = Log.isLoggable("MediaRouteProviderProxy", 3);

    /* renamed from: j */
    public final ComponentName f33207j;

    /* renamed from: k */
    public final d f33208k;

    /* renamed from: l */
    public final ArrayList<c> f33209l;

    /* renamed from: m */
    public boolean f33210m;

    /* renamed from: n */
    public boolean f33211n;

    /* renamed from: o */
    public a f33212o;

    /* renamed from: p */
    public boolean f33213p;

    /* renamed from: q */
    public b f33214q;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/v$a.class
     */
    /* renamed from: m1.v$a */
    /* loaded from: combined.jar:classes1.jar:m1/v$a.class */
    public final class a implements IBinder.DeathRecipient {

        /* renamed from: a */
        public final Messenger f33215a;

        /* renamed from: b */
        public final e f33216b;

        /* renamed from: c */
        public final Messenger f33217c;

        /* renamed from: f */
        public int f33220f;

        /* renamed from: g */
        public int f33221g;

        /* renamed from: i */
        public final ServiceConnectionC5913v f33223i;

        /* renamed from: d */
        public int f33218d = 1;

        /* renamed from: e */
        public int f33219e = 1;

        /* renamed from: h */
        public final SparseArray<C5901j.c> f33222h = new SparseArray<>();

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:m1/v$a$a.class
         */
        /* renamed from: m1.v$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes1.jar:m1/v$a$a.class */
        public class RunnableC10319a implements Runnable {

            /* renamed from: b */
            public final a f33224b;

            public RunnableC10319a(a aVar) {
                this.f33224b = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f33224b.m29108e();
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:m1/v$a$b.class
         */
        /* renamed from: m1.v$a$b */
        /* loaded from: combined.jar:classes1.jar:m1/v$a$b.class */
        public class b implements Runnable {

            /* renamed from: b */
            public final a f33225b;

            public b(a aVar) {
                this.f33225b = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = this.f33225b;
                aVar.f33223i.m29091J(aVar);
            }
        }

        public a(ServiceConnectionC5913v serviceConnectionC5913v, Messenger messenger) {
            this.f33223i = serviceConnectionC5913v;
            this.f33215a = messenger;
            e eVar = new e(this);
            this.f33216b = eVar;
            this.f33217c = new Messenger(eVar);
        }

        /* renamed from: a */
        public void m29104a(int i10, String str) {
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = this.f33218d;
            this.f33218d = i11 + 1;
            m29122s(12, i11, i10, null, bundle);
        }

        /* renamed from: b */
        public int m29105b(String str, C5901j.c cVar) {
            int i10 = this.f33219e;
            this.f33219e = i10 + 1;
            int i11 = this.f33218d;
            this.f33218d = i11 + 1;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            m29122s(11, i11, i10, null, bundle);
            this.f33222h.put(i11, cVar);
            return i10;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            this.f33223i.f33208k.post(new b(this));
        }

        /* renamed from: c */
        public int m29106c(String str, String str2) {
            int i10 = this.f33219e;
            this.f33219e = i10 + 1;
            Bundle bundle = new Bundle();
            bundle.putString("routeId", str);
            bundle.putString("routeGroupId", str2);
            int i11 = this.f33218d;
            this.f33218d = i11 + 1;
            m29122s(3, i11, i10, null, bundle);
            return i10;
        }

        /* renamed from: d */
        public void m29107d() {
            m29122s(2, 0, 0, null, null);
            this.f33216b.m29132a();
            this.f33215a.getBinder().unlinkToDeath(this, 0);
            this.f33223i.f33208k.post(new RunnableC10319a(this));
        }

        /* renamed from: e */
        public void m29108e() {
            int size = this.f33222h.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f33222h.valueAt(i10).mo28895a(null, null);
            }
            this.f33222h.clear();
        }

        /* renamed from: f */
        public boolean m29109f(int i10, String str, Bundle bundle) {
            C5901j.c cVar = this.f33222h.get(i10);
            if (cVar == null) {
                return false;
            }
            this.f33222h.remove(i10);
            cVar.mo28895a(str, bundle);
            return true;
        }

        /* renamed from: g */
        public boolean m29110g(int i10, Bundle bundle) {
            C5901j.c cVar = this.f33222h.get(i10);
            if (cVar == null) {
                return false;
            }
            this.f33222h.remove(i10);
            cVar.mo28896b(bundle);
            return true;
        }

        /* renamed from: h */
        public void m29111h(int i10) {
            this.f33223i.m29089H(this, i10);
        }

        /* renamed from: i */
        public boolean m29112i(Bundle bundle) {
            if (this.f33220f == 0) {
                return false;
            }
            this.f33223i.m29090I(this, C5898g.m28843a(bundle));
            return true;
        }

        /* renamed from: j */
        public void m29113j(int i10, Bundle bundle) {
            C5901j.c cVar = this.f33222h.get(i10);
            if (bundle == null || !bundle.containsKey("routeId")) {
                cVar.mo28895a("DynamicGroupRouteController is created without valid route id.", bundle);
            } else {
                this.f33222h.remove(i10);
                cVar.mo28896b(bundle);
            }
        }

        /* renamed from: k */
        public boolean m29114k(int i10, Bundle bundle) {
            if (this.f33220f == 0) {
                return false;
            }
            C5895d c5895d = null;
            Bundle bundle2 = (Bundle) bundle.getParcelable("groupRoute");
            if (bundle2 != null) {
                c5895d = C5895d.m28762d(bundle2);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("dynamicRoutes");
            ArrayList arrayList = new ArrayList();
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC5897f.b.c.m28826a((Bundle) it.next()));
            }
            this.f33223i.m29095N(this, i10, c5895d, arrayList);
            return true;
        }

        /* renamed from: l */
        public boolean m29115l(int i10) {
            if (i10 == this.f33221g) {
                this.f33221g = 0;
                this.f33223i.m29092K(this, "Registration failed");
            }
            C5901j.c cVar = this.f33222h.get(i10);
            if (cVar == null) {
                return true;
            }
            this.f33222h.remove(i10);
            cVar.mo28895a(null, null);
            return true;
        }

        /* renamed from: m */
        public boolean m29116m(int i10) {
            return true;
        }

        /* renamed from: n */
        public boolean m29117n(int i10, int i11, Bundle bundle) {
            if (this.f33220f != 0 || i10 != this.f33221g || i11 < 1) {
                return false;
            }
            this.f33221g = 0;
            this.f33220f = i11;
            this.f33223i.m29090I(this, C5898g.m28843a(bundle));
            this.f33223i.m29093L(this);
            return true;
        }

        /* renamed from: o */
        public boolean m29118o() {
            int i10 = this.f33218d;
            this.f33218d = i10 + 1;
            this.f33221g = i10;
            if (!m29122s(1, i10, 4, null, null)) {
                return false;
            }
            try {
                this.f33215a.getBinder().linkToDeath(this, 0);
                return true;
            } catch (RemoteException e10) {
                binderDied();
                return false;
            }
        }

        /* renamed from: p */
        public void m29119p(int i10) {
            int i11 = this.f33218d;
            this.f33218d = i11 + 1;
            m29122s(4, i11, i10, null, null);
        }

        /* renamed from: q */
        public void m29120q(int i10, String str) {
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = this.f33218d;
            this.f33218d = i11 + 1;
            m29122s(13, i11, i10, null, bundle);
        }

        /* renamed from: r */
        public void m29121r(int i10) {
            int i11 = this.f33218d;
            this.f33218d = i11 + 1;
            m29122s(5, i11, i10, null, null);
        }

        /* renamed from: s */
        public final boolean m29122s(int i10, int i11, int i12, Object obj, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i10;
            obtain.arg1 = i11;
            obtain.arg2 = i12;
            obtain.obj = obj;
            obtain.setData(bundle);
            obtain.replyTo = this.f33217c;
            try {
                this.f33215a.send(obtain);
                return true;
            } catch (DeadObjectException e10) {
                return false;
            } catch (RemoteException e11) {
                if (i10 == 2) {
                    return false;
                }
                Log.e("MediaRouteProviderProxy", "Could not send message to service.", e11);
                return false;
            }
        }

        /* renamed from: t */
        public void m29123t(C5896e c5896e) {
            int i10 = this.f33218d;
            this.f33218d = i10 + 1;
            m29122s(10, i10, 0, c5896e != null ? c5896e.m28806a() : null, null);
        }

        /* renamed from: u */
        public void m29124u(int i10, int i11) {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i11);
            int i12 = this.f33218d;
            this.f33218d = i12 + 1;
            m29122s(7, i12, i10, null, bundle);
        }

        /* renamed from: v */
        public void m29125v(int i10, int i11) {
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i11);
            int i12 = this.f33218d;
            this.f33218d = i12 + 1;
            m29122s(6, i12, i10, null, bundle);
        }

        /* renamed from: w */
        public void m29126w(int i10, List<String> list) {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i11 = this.f33218d;
            this.f33218d = i11 + 1;
            m29122s(14, i11, i10, null, bundle);
        }

        /* renamed from: x */
        public void m29127x(int i10, int i11) {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i11);
            int i12 = this.f33218d;
            this.f33218d = i12 + 1;
            m29122s(8, i12, i10, null, bundle);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/v$b.class
     */
    /* renamed from: m1.v$b */
    /* loaded from: combined.jar:classes1.jar:m1/v$b.class */
    public interface b {
        /* renamed from: a */
        void mo29128a(AbstractC5897f.e eVar);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/v$c.class
     */
    /* renamed from: m1.v$c */
    /* loaded from: combined.jar:classes1.jar:m1/v$c.class */
    public interface c {
        /* renamed from: a */
        void mo29129a(a aVar);

        /* renamed from: b */
        int mo29130b();

        /* renamed from: c */
        void mo29131c();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/v$d.class
     */
    /* renamed from: m1.v$d */
    /* loaded from: combined.jar:classes1.jar:m1/v$d.class */
    public static final class d extends Handler {
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/v$e.class
     */
    /* renamed from: m1.v$e */
    /* loaded from: combined.jar:classes1.jar:m1/v$e.class */
    public static final class e extends Handler {

        /* renamed from: a */
        public final WeakReference<a> f33226a;

        public e(a aVar) {
            this.f33226a = new WeakReference<>(aVar);
        }

        /* renamed from: a */
        public void m29132a() {
            this.f33226a.clear();
        }

        /* renamed from: b */
        public final boolean m29133b(a aVar, int i10, int i11, int i12, Object obj, Bundle bundle) {
            switch (i10) {
                case 0:
                    aVar.m29115l(i11);
                    return true;
                case 1:
                    aVar.m29116m(i11);
                    return true;
                case 2:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.m29117n(i11, i12, (Bundle) obj);
                    }
                    return false;
                case 3:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.m29110g(i11, (Bundle) obj);
                    }
                    return false;
                case 4:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.m29109f(i11, bundle == null ? null : bundle.getString("error"), (Bundle) obj);
                    }
                    return false;
                case 5:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.m29112i((Bundle) obj);
                    }
                    return false;
                case 6:
                    if (obj instanceof Bundle) {
                        aVar.m29113j(i11, (Bundle) obj);
                        return false;
                    }
                    Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
                    return false;
                case 7:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.m29114k(i12, (Bundle) obj);
                    }
                    return false;
                case 8:
                    aVar.m29111h(i12);
                    return false;
                default:
                    return false;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar = this.f33226a.get();
            if (aVar == null || m29133b(aVar, message.what, message.arg1, message.arg2, message.obj, message.peekData()) || !ServiceConnectionC5913v.f33206r) {
                return;
            }
            Log.d("MediaRouteProviderProxy", "Unhandled message from server: " + message);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/v$f.class
     */
    /* renamed from: m1.v$f */
    /* loaded from: combined.jar:classes1.jar:m1/v$f.class */
    public final class f extends AbstractC5897f.b implements c {

        /* renamed from: f */
        public final String f33227f;

        /* renamed from: g */
        public String f33228g;

        /* renamed from: h */
        public String f33229h;

        /* renamed from: i */
        public boolean f33230i;

        /* renamed from: k */
        public int f33232k;

        /* renamed from: l */
        public a f33233l;

        /* renamed from: n */
        public final ServiceConnectionC5913v f33235n;

        /* renamed from: j */
        public int f33231j = -1;

        /* renamed from: m */
        public int f33234m = -1;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:m1/v$f$a.class
         */
        /* renamed from: m1.v$f$a */
        /* loaded from: combined.jar:classes1.jar:m1/v$f$a.class */
        public class a extends C5901j.c {

            /* renamed from: a */
            public final f f33236a;

            public a(f fVar) {
                this.f33236a = fVar;
            }

            @Override // p208m1.C5901j.c
            /* renamed from: a */
            public void mo28895a(String str, Bundle bundle) {
                Log.d("MediaRouteProviderProxy", "Error: " + str + ", data: " + bundle);
            }

            @Override // p208m1.C5901j.c
            /* renamed from: b */
            public void mo28896b(Bundle bundle) {
                this.f33236a.f33228g = bundle.getString("groupableTitle");
                this.f33236a.f33229h = bundle.getString("transferableTitle");
            }
        }

        public f(ServiceConnectionC5913v serviceConnectionC5913v, String str) {
            this.f33235n = serviceConnectionC5913v;
            this.f33227f = str;
        }

        @Override // p208m1.ServiceConnectionC5913v.c
        /* renamed from: a */
        public void mo29129a(a aVar) {
            a aVar2 = new a(this);
            this.f33233l = aVar;
            int m29105b = aVar.m29105b(this.f33227f, aVar2);
            this.f33234m = m29105b;
            if (this.f33230i) {
                aVar.m29121r(m29105b);
                int i10 = this.f33231j;
                if (i10 >= 0) {
                    aVar.m29124u(this.f33234m, i10);
                    this.f33231j = -1;
                }
                int i11 = this.f33232k;
                if (i11 != 0) {
                    aVar.m29127x(this.f33234m, i11);
                    this.f33232k = 0;
                }
            }
        }

        @Override // p208m1.ServiceConnectionC5913v.c
        /* renamed from: b */
        public int mo29130b() {
            return this.f33234m;
        }

        @Override // p208m1.ServiceConnectionC5913v.c
        /* renamed from: c */
        public void mo29131c() {
            a aVar = this.f33233l;
            if (aVar != null) {
                aVar.m29119p(this.f33234m);
                this.f33233l = null;
                this.f33234m = 0;
            }
        }

        @Override // p208m1.AbstractC5897f.e
        /* renamed from: d */
        public void mo28751d() {
            this.f33235n.m29094M(this);
        }

        @Override // p208m1.AbstractC5897f.e
        /* renamed from: e */
        public void mo28840e() {
            this.f33230i = true;
            a aVar = this.f33233l;
            if (aVar != null) {
                aVar.m29121r(this.f33234m);
            }
        }

        @Override // p208m1.AbstractC5897f.e
        /* renamed from: f */
        public void mo28752f(int i10) {
            a aVar = this.f33233l;
            if (aVar != null) {
                aVar.m29124u(this.f33234m, i10);
            } else {
                this.f33231j = i10;
                this.f33232k = 0;
            }
        }

        @Override // p208m1.AbstractC5897f.e
        /* renamed from: g */
        public void mo28841g() {
            mo28842h(0);
        }

        @Override // p208m1.AbstractC5897f.e
        /* renamed from: h */
        public void mo28842h(int i10) {
            this.f33230i = false;
            a aVar = this.f33233l;
            if (aVar != null) {
                aVar.m29125v(this.f33234m, i10);
            }
        }

        @Override // p208m1.AbstractC5897f.e
        /* renamed from: i */
        public void mo28753i(int i10) {
            a aVar = this.f33233l;
            if (aVar != null) {
                aVar.m29127x(this.f33234m, i10);
            } else {
                this.f33232k += i10;
            }
        }

        @Override // p208m1.AbstractC5897f.b
        /* renamed from: j */
        public String mo28822j() {
            return this.f33228g;
        }

        @Override // p208m1.AbstractC5897f.b
        /* renamed from: k */
        public String mo28823k() {
            return this.f33229h;
        }

        @Override // p208m1.AbstractC5897f.b
        /* renamed from: m */
        public void mo28754m(String str) {
            a aVar = this.f33233l;
            if (aVar != null) {
                aVar.m29104a(this.f33234m, str);
            }
        }

        @Override // p208m1.AbstractC5897f.b
        /* renamed from: n */
        public void mo28755n(String str) {
            a aVar = this.f33233l;
            if (aVar != null) {
                aVar.m29120q(this.f33234m, str);
            }
        }

        @Override // p208m1.AbstractC5897f.b
        /* renamed from: o */
        public void mo28756o(List<String> list) {
            a aVar = this.f33233l;
            if (aVar != null) {
                aVar.m29126w(this.f33234m, list);
            }
        }

        /* renamed from: q */
        public void m29134q(C5895d c5895d, List<AbstractC5897f.b.c> list) {
            m28824l(c5895d, list);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/v$g.class
     */
    /* renamed from: m1.v$g */
    /* loaded from: combined.jar:classes1.jar:m1/v$g.class */
    public final class g extends AbstractC5897f.e implements c {

        /* renamed from: a */
        public final String f33237a;

        /* renamed from: b */
        public final String f33238b;

        /* renamed from: c */
        public boolean f33239c;

        /* renamed from: d */
        public int f33240d = -1;

        /* renamed from: e */
        public int f33241e;

        /* renamed from: f */
        public a f33242f;

        /* renamed from: g */
        public int f33243g;

        /* renamed from: h */
        public final ServiceConnectionC5913v f33244h;

        public g(ServiceConnectionC5913v serviceConnectionC5913v, String str, String str2) {
            this.f33244h = serviceConnectionC5913v;
            this.f33237a = str;
            this.f33238b = str2;
        }

        @Override // p208m1.ServiceConnectionC5913v.c
        /* renamed from: a */
        public void mo29129a(a aVar) {
            this.f33242f = aVar;
            int m29106c = aVar.m29106c(this.f33237a, this.f33238b);
            this.f33243g = m29106c;
            if (this.f33239c) {
                aVar.m29121r(m29106c);
                int i10 = this.f33240d;
                if (i10 >= 0) {
                    aVar.m29124u(this.f33243g, i10);
                    this.f33240d = -1;
                }
                int i11 = this.f33241e;
                if (i11 != 0) {
                    aVar.m29127x(this.f33243g, i11);
                    this.f33241e = 0;
                }
            }
        }

        @Override // p208m1.ServiceConnectionC5913v.c
        /* renamed from: b */
        public int mo29130b() {
            return this.f33243g;
        }

        @Override // p208m1.ServiceConnectionC5913v.c
        /* renamed from: c */
        public void mo29131c() {
            a aVar = this.f33242f;
            if (aVar != null) {
                aVar.m29119p(this.f33243g);
                this.f33242f = null;
                this.f33243g = 0;
            }
        }

        @Override // p208m1.AbstractC5897f.e
        /* renamed from: d */
        public void mo28751d() {
            this.f33244h.m29094M(this);
        }

        @Override // p208m1.AbstractC5897f.e
        /* renamed from: e */
        public void mo28840e() {
            this.f33239c = true;
            a aVar = this.f33242f;
            if (aVar != null) {
                aVar.m29121r(this.f33243g);
            }
        }

        @Override // p208m1.AbstractC5897f.e
        /* renamed from: f */
        public void mo28752f(int i10) {
            a aVar = this.f33242f;
            if (aVar != null) {
                aVar.m29124u(this.f33243g, i10);
            } else {
                this.f33240d = i10;
                this.f33241e = 0;
            }
        }

        @Override // p208m1.AbstractC5897f.e
        /* renamed from: g */
        public void mo28841g() {
            mo28842h(0);
        }

        @Override // p208m1.AbstractC5897f.e
        /* renamed from: h */
        public void mo28842h(int i10) {
            this.f33239c = false;
            a aVar = this.f33242f;
            if (aVar != null) {
                aVar.m29125v(this.f33243g, i10);
            }
        }

        @Override // p208m1.AbstractC5897f.e
        /* renamed from: i */
        public void mo28753i(int i10) {
            a aVar = this.f33242f;
            if (aVar != null) {
                aVar.m29127x(this.f33243g, i10);
            } else {
                this.f33241e += i10;
            }
        }
    }

    public ServiceConnectionC5913v(Context context, ComponentName componentName) {
        super(context, new AbstractC5897f.d(componentName));
        this.f33209l = new ArrayList<>();
        this.f33207j = componentName;
        this.f33208k = new d();
    }

    /* renamed from: A */
    public final void m29082A() {
        if (this.f33211n) {
            return;
        }
        boolean z10 = f33206r;
        if (z10) {
            Log.d("MediaRouteProviderProxy", this + ": Binding");
        }
        Intent intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.f33207j);
        int i10 = 1;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                i10 = 4097;
            }
            boolean bindService = m28813n().bindService(intent, this, i10);
            this.f33211n = bindService;
            if (bindService || !z10) {
                return;
            }
            Log.d("MediaRouteProviderProxy", this + ": Bind failed");
        } catch (SecurityException e10) {
            if (f33206r) {
                Log.d("MediaRouteProviderProxy", this + ": Bind failed", e10);
            }
        }
    }

    /* renamed from: B */
    public final AbstractC5897f.b m29083B(String str) {
        C5898g m28814o = m28814o();
        if (m28814o == null) {
            return null;
        }
        List<C5895d> m28844b = m28814o.m28844b();
        int size = m28844b.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (m28844b.get(i10).m28773l().equals(str)) {
                f fVar = new f(this, str);
                this.f33209l.add(fVar);
                if (this.f33213p) {
                    fVar.mo29129a(this.f33212o);
                }
                m29102U();
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: C */
    public final AbstractC5897f.e m29084C(String str, String str2) {
        C5898g m28814o = m28814o();
        if (m28814o == null) {
            return null;
        }
        List<C5895d> m28844b = m28814o.m28844b();
        int size = m28844b.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (m28844b.get(i10).m28773l().equals(str)) {
                g gVar = new g(this, str, str2);
                this.f33209l.add(gVar);
                if (this.f33213p) {
                    gVar.mo29129a(this.f33212o);
                }
                m29102U();
                return gVar;
            }
        }
        return null;
    }

    /* renamed from: D */
    public final void m29085D() {
        int size = this.f33209l.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f33209l.get(i10).mo29131c();
        }
    }

    /* renamed from: E */
    public final void m29086E() {
        if (this.f33212o != null) {
            m28818w(null);
            this.f33213p = false;
            m29085D();
            this.f33212o.m29107d();
            this.f33212o = null;
        }
    }

    /* renamed from: F */
    public final c m29087F(int i10) {
        Iterator<c> it = this.f33209l.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.mo29130b() == i10) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: G */
    public boolean m29088G(String str, String str2) {
        return this.f33207j.getPackageName().equals(str) && this.f33207j.getClassName().equals(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: H */
    public void m29089H(a aVar, int i10) {
        if (this.f33212o == aVar) {
            c m29087F = m29087F(i10);
            b bVar = this.f33214q;
            if (bVar != null && (m29087F instanceof AbstractC5897f.e)) {
                bVar.mo29128a((AbstractC5897f.e) m29087F);
            }
            m29094M(m29087F);
        }
    }

    /* renamed from: I */
    public void m29090I(a aVar, C5898g c5898g) {
        if (this.f33212o == aVar) {
            if (f33206r) {
                Log.d("MediaRouteProviderProxy", this + ": Descriptor changed, descriptor=" + c5898g);
            }
            m28818w(c5898g);
        }
    }

    /* renamed from: J */
    public void m29091J(a aVar) {
        if (this.f33212o == aVar) {
            if (f33206r) {
                Log.d("MediaRouteProviderProxy", this + ": Service connection died");
            }
            m29086E();
        }
    }

    /* renamed from: K */
    public void m29092K(a aVar, String str) {
        if (this.f33212o == aVar) {
            if (f33206r) {
                Log.d("MediaRouteProviderProxy", this + ": Service connection error - " + str);
            }
            m29101T();
        }
    }

    /* renamed from: L */
    public void m29093L(a aVar) {
        if (this.f33212o == aVar) {
            this.f33213p = true;
            m29103z();
            C5896e m28815p = m28815p();
            if (m28815p != null) {
                this.f33212o.m29123t(m28815p);
            }
        }
    }

    /* renamed from: M */
    public void m29094M(c cVar) {
        this.f33209l.remove(cVar);
        cVar.mo29131c();
        m29102U();
    }

    /* renamed from: N */
    public void m29095N(a aVar, int i10, C5895d c5895d, List<AbstractC5897f.b.c> list) {
        if (this.f33212o == aVar) {
            if (f33206r) {
                Log.d("MediaRouteProviderProxy", this + ": DynamicRouteDescriptors changed, descriptors=" + list);
            }
            c m29087F = m29087F(i10);
            if (m29087F instanceof f) {
                ((f) m29087F).m29134q(c5895d, list);
            }
        }
    }

    /* renamed from: O */
    public void m29096O() {
        if (this.f33212o == null && m29098Q()) {
            m29101T();
            m29082A();
        }
    }

    /* renamed from: P */
    public void m29097P(b bVar) {
        this.f33214q = bVar;
    }

    /* renamed from: Q */
    public final boolean m29098Q() {
        if (this.f33210m) {
            return (m28815p() == null && this.f33209l.isEmpty()) ? false : true;
        }
        return false;
    }

    /* renamed from: R */
    public void m29099R() {
        if (this.f33210m) {
            return;
        }
        if (f33206r) {
            Log.d("MediaRouteProviderProxy", this + ": Starting");
        }
        this.f33210m = true;
        m29102U();
    }

    /* renamed from: S */
    public void m29100S() {
        if (this.f33210m) {
            if (f33206r) {
                Log.d("MediaRouteProviderProxy", this + ": Stopping");
            }
            this.f33210m = false;
            m29102U();
        }
    }

    /* renamed from: T */
    public final void m29101T() {
        if (this.f33211n) {
            if (f33206r) {
                Log.d("MediaRouteProviderProxy", this + ": Unbinding");
            }
            this.f33211n = false;
            m29086E();
            try {
                m28813n().unbindService(this);
            } catch (IllegalArgumentException e10) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e10);
            }
        }
    }

    /* renamed from: U */
    public final void m29102U() {
        if (m29098Q()) {
            m29082A();
        } else {
            m29101T();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z10 = f33206r;
        if (z10) {
            Log.d("MediaRouteProviderProxy", this + ": Connected");
        }
        if (this.f33211n) {
            m29086E();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (!AbstractC5899h.m28851a(messenger)) {
                Log.e("MediaRouteProviderProxy", this + ": Service returned invalid messenger binder");
                return;
            }
            a aVar = new a(this, messenger);
            if (aVar.m29118o()) {
                this.f33212o = aVar;
            } else if (z10) {
                Log.d("MediaRouteProviderProxy", this + ": Registration failed");
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (f33206r) {
            Log.d("MediaRouteProviderProxy", this + ": Service disconnected");
        }
        m29086E();
    }

    @Override // p208m1.AbstractC5897f
    /* renamed from: r */
    public AbstractC5897f.b mo28742r(String str) {
        if (str != null) {
            return m29083B(str);
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    @Override // p208m1.AbstractC5897f
    /* renamed from: s */
    public AbstractC5897f.e mo28743s(String str) {
        if (str != null) {
            return m29084C(str, null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override // p208m1.AbstractC5897f
    /* renamed from: t */
    public AbstractC5897f.e mo28744t(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return m29084C(str, str2);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    public String toString() {
        return "Service connection " + this.f33207j.flattenToShortString();
    }

    @Override // p208m1.AbstractC5897f
    /* renamed from: u */
    public void mo28745u(C5896e c5896e) {
        if (this.f33213p) {
            this.f33212o.m29123t(c5896e);
        }
        m29102U();
    }

    /* renamed from: z */
    public final void m29103z() {
        int size = this.f33209l.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f33209l.get(i10).mo29129a(this.f33212o);
        }
    }
}

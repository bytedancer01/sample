package p208m1;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p192l1.C5654j;
import p208m1.AbstractC5897f;
import p208m1.C5893b;
import p208m1.C5895d;
import p208m1.C5898g;
import p208m1.C5900i;
import p208m1.C5901j;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:m1/b.class
 */
/* renamed from: m1.b */
/* loaded from: combined.jar:classes1.jar:m1/b.class */
public class C5893b extends AbstractC5897f {

    /* renamed from: t */
    public static final boolean f33006t = Log.isLoggable("MR2Provider", 3);

    /* renamed from: j */
    public final MediaRouter2 f33007j;

    /* renamed from: k */
    public final a f33008k;

    /* renamed from: l */
    public final Map<MediaRouter2.RoutingController, c> f33009l;

    /* renamed from: m */
    public final MediaRouter2.RouteCallback f33010m;

    /* renamed from: n */
    public final MediaRouter2.TransferCallback f33011n;

    /* renamed from: o */
    public final MediaRouter2.ControllerCallback f33012o;

    /* renamed from: p */
    public final Handler f33013p;

    /* renamed from: q */
    public final Executor f33014q;

    /* renamed from: r */
    public List<MediaRoute2Info> f33015r;

    /* renamed from: s */
    public Map<String, String> f33016s;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/b$a.class
     */
    /* renamed from: m1.b$a */
    /* loaded from: combined.jar:classes1.jar:m1/b$a.class */
    public static abstract class a {
        /* renamed from: a */
        public abstract void mo28746a(AbstractC5897f.e eVar);

        /* renamed from: b */
        public abstract void mo28747b(int i10);

        /* renamed from: c */
        public abstract void mo28748c(String str, int i10);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/b$b.class
     */
    /* renamed from: m1.b$b */
    /* loaded from: combined.jar:classes1.jar:m1/b$b.class */
    public class b extends MediaRouter2.ControllerCallback {

        /* renamed from: a */
        public final C5893b f33017a;

        public b(C5893b c5893b) {
            this.f33017a = c5893b;
        }

        public void onControllerUpdated(MediaRouter2.RoutingController routingController) {
            this.f33017a.m28739D(routingController);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/b$c.class
     */
    /* renamed from: m1.b$c */
    /* loaded from: combined.jar:classes1.jar:m1/b$c.class */
    public class c extends AbstractC5897f.b {

        /* renamed from: f */
        public final String f33018f;

        /* renamed from: g */
        public final MediaRouter2.RoutingController f33019g;

        /* renamed from: h */
        public final Messenger f33020h;

        /* renamed from: i */
        public final Messenger f33021i;

        /* renamed from: k */
        public final Handler f33023k;

        /* renamed from: o */
        public C5895d f33027o;

        /* renamed from: p */
        public final C5893b f33028p;

        /* renamed from: j */
        public final SparseArray<C5901j.c> f33022j = new SparseArray<>();

        /* renamed from: l */
        public AtomicInteger f33024l = new AtomicInteger(1);

        /* renamed from: m */
        public final Runnable f33025m = new Runnable(this) { // from class: m1.c

            /* renamed from: b */
            public final C5893b.c f33035b;

            {
                this.f33035b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f33035b.m28750s();
            }
        };

        /* renamed from: n */
        public int f33026n = -1;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:m1/b$c$a.class
         */
        /* renamed from: m1.b$c$a */
        /* loaded from: combined.jar:classes1.jar:m1/b$c$a.class */
        public class a extends Handler {

            /* renamed from: a */
            public final c f33029a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar) {
                super(Looper.getMainLooper());
                this.f33029a = cVar;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i10 = message.what;
                int i11 = message.arg1;
                Object obj = message.obj;
                Bundle peekData = message.peekData();
                C5901j.c cVar = this.f33029a.f33022j.get(i11);
                if (cVar == null) {
                    Log.w("MR2Provider", "Pending callback not found for control request.");
                    return;
                }
                this.f33029a.f33022j.remove(i11);
                if (i10 == 3) {
                    cVar.mo28896b((Bundle) obj);
                } else {
                    if (i10 != 4) {
                        return;
                    }
                    cVar.mo28895a(peekData == null ? null : peekData.getString("error"), (Bundle) obj);
                }
            }
        }

        public c(C5893b c5893b, MediaRouter2.RoutingController routingController, String str) {
            this.f33028p = c5893b;
            this.f33019g = routingController;
            this.f33018f = str;
            Messenger m28736z = C5893b.m28736z(routingController);
            this.f33020h = m28736z;
            this.f33021i = m28736z == null ? null : new Messenger(new a(this));
            this.f33023k = new Handler(Looper.getMainLooper());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public /* synthetic */ void m28750s() {
            this.f33026n = -1;
        }

        @Override // p208m1.AbstractC5897f.e
        /* renamed from: d */
        public void mo28751d() {
            this.f33019g.release();
        }

        @Override // p208m1.AbstractC5897f.e
        /* renamed from: f */
        public void mo28752f(int i10) {
            MediaRouter2.RoutingController routingController = this.f33019g;
            if (routingController == null) {
                return;
            }
            routingController.setVolume(i10);
            this.f33026n = i10;
            m28758t();
        }

        @Override // p208m1.AbstractC5897f.e
        /* renamed from: i */
        public void mo28753i(int i10) {
            MediaRouter2.RoutingController routingController = this.f33019g;
            if (routingController == null) {
                return;
            }
            int i11 = this.f33026n;
            int i12 = i11;
            if (i11 < 0) {
                i12 = routingController.getVolume();
            }
            int max = Math.max(0, Math.min(i12 + i10, this.f33019g.getVolumeMax()));
            this.f33026n = max;
            this.f33019g.setVolume(max);
            m28758t();
        }

        @Override // p208m1.AbstractC5897f.b
        /* renamed from: m */
        public void mo28754m(String str) {
            if (str == null || str.isEmpty()) {
                Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
                return;
            }
            MediaRoute2Info m28737A = this.f33028p.m28737A(str);
            if (m28737A != null) {
                this.f33019g.selectRoute(m28737A);
                return;
            }
            Log.w("MR2Provider", "onAddMemberRoute: Specified route not found. routeId=" + str);
        }

        @Override // p208m1.AbstractC5897f.b
        /* renamed from: n */
        public void mo28755n(String str) {
            if (str == null || str.isEmpty()) {
                Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
                return;
            }
            MediaRoute2Info m28737A = this.f33028p.m28737A(str);
            if (m28737A != null) {
                this.f33019g.deselectRoute(m28737A);
                return;
            }
            Log.w("MR2Provider", "onRemoveMemberRoute: Specified route not found. routeId=" + str);
        }

        @Override // p208m1.AbstractC5897f.b
        /* renamed from: o */
        public void mo28756o(List<String> list) {
            if (list == null || list.isEmpty()) {
                Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
                return;
            }
            String str = list.get(0);
            MediaRoute2Info m28737A = this.f33028p.m28737A(str);
            if (m28737A != null) {
                this.f33028p.f33007j.transferTo(m28737A);
                return;
            }
            Log.w("MR2Provider", "onUpdateMemberRoutes: Specified route not found. routeId=" + str);
        }

        /* renamed from: r */
        public String m28757r() {
            C5895d c5895d = this.f33027o;
            return c5895d != null ? c5895d.m28773l() : this.f33019g.getId();
        }

        /* renamed from: t */
        public final void m28758t() {
            this.f33023k.removeCallbacks(this.f33025m);
            this.f33023k.postDelayed(this.f33025m, 1000L);
        }

        /* renamed from: u */
        public void m28759u(C5895d c5895d) {
            this.f33027o = c5895d;
        }

        /* renamed from: v */
        public void m28760v(String str, int i10) {
            MediaRouter2.RoutingController routingController = this.f33019g;
            if (routingController == null || routingController.isReleased() || this.f33020h == null) {
                return;
            }
            int andIncrement = this.f33024l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i10);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f33021i;
            try {
                this.f33020h.send(obtain);
            } catch (DeadObjectException e10) {
            } catch (RemoteException e11) {
                Log.e("MR2Provider", "Could not send control request to service.", e11);
            }
        }

        /* renamed from: w */
        public void m28761w(String str, int i10) {
            MediaRouter2.RoutingController routingController = this.f33019g;
            if (routingController == null || routingController.isReleased() || this.f33020h == null) {
                return;
            }
            int andIncrement = this.f33024l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 8;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i10);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f33021i;
            try {
                this.f33020h.send(obtain);
            } catch (DeadObjectException e10) {
            } catch (RemoteException e11) {
                Log.e("MR2Provider", "Could not send control request to service.", e11);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/b$d.class
     */
    /* renamed from: m1.b$d */
    /* loaded from: combined.jar:classes1.jar:m1/b$d.class */
    public class d extends AbstractC5897f.e {

        /* renamed from: a */
        public final String f33030a;

        /* renamed from: b */
        public final c f33031b;

        /* renamed from: c */
        public final C5893b f33032c;

        public d(C5893b c5893b, String str, c cVar) {
            this.f33032c = c5893b;
            this.f33030a = str;
            this.f33031b = cVar;
        }

        @Override // p208m1.AbstractC5897f.e
        /* renamed from: f */
        public void mo28752f(int i10) {
            c cVar;
            String str = this.f33030a;
            if (str == null || (cVar = this.f33031b) == null) {
                return;
            }
            cVar.m28760v(str, i10);
        }

        @Override // p208m1.AbstractC5897f.e
        /* renamed from: i */
        public void mo28753i(int i10) {
            c cVar;
            String str = this.f33030a;
            if (str == null || (cVar = this.f33031b) == null) {
                return;
            }
            cVar.m28761w(str, i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/b$e.class
     */
    /* renamed from: m1.b$e */
    /* loaded from: combined.jar:classes1.jar:m1/b$e.class */
    public class e extends MediaRouter2.RouteCallback {

        /* renamed from: a */
        public final C5893b f33033a;

        public e(C5893b c5893b) {
            this.f33033a = c5893b;
        }

        public void onRoutesAdded(List<MediaRoute2Info> list) {
            this.f33033a.m28738C();
        }

        public void onRoutesChanged(List<MediaRoute2Info> list) {
            this.f33033a.m28738C();
        }

        public void onRoutesRemoved(List<MediaRoute2Info> list) {
            this.f33033a.m28738C();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/b$f.class
     */
    /* renamed from: m1.b$f */
    /* loaded from: combined.jar:classes1.jar:m1/b$f.class */
    public class f extends MediaRouter2.TransferCallback {

        /* renamed from: a */
        public final C5893b f33034a;

        public f(C5893b c5893b) {
            this.f33034a = c5893b;
        }

        public void onStop(MediaRouter2.RoutingController routingController) {
            c remove = this.f33034a.f33009l.remove(routingController);
            if (remove != null) {
                this.f33034a.f33008k.mo28746a(remove);
                return;
            }
            Log.w("MR2Provider", "onStop: No matching routeController found. routingController=" + routingController);
        }

        public void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
            this.f33034a.f33009l.remove(routingController);
            if (routingController2 == this.f33034a.f33007j.getSystemController()) {
                this.f33034a.f33008k.mo28747b(3);
                return;
            }
            List<MediaRoute2Info> selectedRoutes = routingController2.getSelectedRoutes();
            if (selectedRoutes.isEmpty()) {
                Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
                return;
            }
            String id2 = selectedRoutes.get(0).getId();
            this.f33034a.f33009l.put(routingController2, new c(this.f33034a, routingController2, id2));
            this.f33034a.f33008k.mo28748c(id2, 3);
            this.f33034a.m28739D(routingController2);
        }

        public void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
            Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
        }
    }

    public C5893b(Context context, a aVar) {
        super(context);
        this.f33009l = new ArrayMap();
        this.f33010m = new e(this);
        this.f33011n = new f(this);
        this.f33012o = new b(this);
        this.f33015r = new ArrayList();
        this.f33016s = new ArrayMap();
        this.f33007j = MediaRouter2.getInstance(context);
        this.f33008k = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f33013p = handler;
        Objects.requireNonNull(handler);
        this.f33014q = new ExecutorC5892a(handler);
    }

    /* renamed from: B */
    public static String m28735B(AbstractC5897f.e eVar) {
        if (!(eVar instanceof c)) {
            return null;
        }
        MediaRouter2.RoutingController routingController = ((c) eVar).f33019g;
        return routingController == null ? null : routingController.getId();
    }

    /* renamed from: z */
    public static Messenger m28736z(MediaRouter2.RoutingController routingController) {
        if (routingController == null) {
            return null;
        }
        Bundle controlHints = routingController.getControlHints();
        return controlHints == null ? null : (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
    }

    /* renamed from: A */
    public MediaRoute2Info m28737A(String str) {
        if (str == null) {
            return null;
        }
        for (MediaRoute2Info mediaRoute2Info : this.f33015r) {
            if (TextUtils.equals(mediaRoute2Info.getId(), str)) {
                return mediaRoute2Info;
            }
        }
        return null;
    }

    /* renamed from: C */
    public void m28738C() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        for (MediaRoute2Info mediaRoute2Info : this.f33007j.getRoutes()) {
            if (mediaRoute2Info != null && !arraySet.contains(mediaRoute2Info) && !mediaRoute2Info.isSystemRoute()) {
                arraySet.add(mediaRoute2Info);
                arrayList.add(mediaRoute2Info);
            }
        }
        if (arrayList.equals(this.f33015r)) {
            return;
        }
        this.f33015r = arrayList;
        this.f33016s.clear();
        for (MediaRoute2Info mediaRoute2Info2 : this.f33015r) {
            Bundle extras = mediaRoute2Info2.getExtras();
            if (extras == null || extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                Log.w("MR2Provider", "Cannot find the original route Id. route=" + mediaRoute2Info2);
            } else {
                this.f33016s.put(mediaRoute2Info2.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (MediaRoute2Info mediaRoute2Info3 : this.f33015r) {
            C5895d m29017c = C5904m.m29017c(mediaRoute2Info3);
            if (mediaRoute2Info3 != null) {
                arrayList2.add(m29017c);
            }
        }
        m28818w(new C5898g.a().m28850d(true).m28848b(arrayList2).m28849c());
    }

    /* renamed from: D */
    public void m28739D(MediaRouter2.RoutingController routingController) {
        c cVar = this.f33009l.get(routingController);
        if (cVar == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No matching routeController found. routingController=" + routingController);
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=" + routingController);
            return;
        }
        List<String> m29015a = C5904m.m29015a(selectedRoutes);
        C5895d m29017c = C5904m.m29017c(selectedRoutes.get(0));
        Bundle controlHints = routingController.getControlHints();
        String string = m28813n().getString(C5654j.f31895p);
        C5895d c5895d = null;
        String str = string;
        if (controlHints != null) {
            str = string;
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                String str2 = string;
                if (!TextUtils.isEmpty(string2)) {
                    str2 = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                c5895d = null;
                str = str2;
                if (bundle != null) {
                    str = str2;
                    c5895d = C5895d.m28762d(bundle);
                    str = str2;
                }
            } catch (Exception e10) {
                Log.w("MR2Provider", "Exception while unparceling control hints.", e10);
                c5895d = null;
            }
        }
        C5895d c5895d2 = c5895d;
        if (c5895d == null) {
            c5895d2 = new C5895d.a(routingController.getId(), str).m28792g(2).m28801p(1).m28803r(routingController.getVolume()).m28805t(routingController.getVolumeMax()).m28804s(routingController.getVolumeHandling()).m28787b(m29017c.m28767f()).m28789d(m29015a).m28790e();
        }
        List<String> m29015a2 = C5904m.m29015a(routingController.getSelectableRoutes());
        List<String> m29015a3 = C5904m.m29015a(routingController.getDeselectableRoutes());
        C5898g m28814o = m28814o();
        if (m28814o == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<C5895d> m28844b = m28814o.m28844b();
        if (!m28844b.isEmpty()) {
            for (C5895d c5895d3 : m28844b) {
                String m28773l = c5895d3.m28773l();
                arrayList.add(new AbstractC5897f.b.c.a(c5895d3).m28836e(m29015a.contains(m28773l) ? 3 : 1).m28833b(m29015a2.contains(m28773l)).m28835d(m29015a3.contains(m28773l)).m28834c(true).m28832a());
            }
        }
        cVar.m28759u(c5895d2);
        cVar.m28824l(c5895d2, arrayList);
    }

    /* renamed from: E */
    public void m28740E(String str) {
        MediaRoute2Info m28737A = m28737A(str);
        if (m28737A != null) {
            this.f33007j.transferTo(m28737A);
            return;
        }
        Log.w("MR2Provider", "transferTo: Specified route not found. routeId=" + str);
    }

    /* renamed from: F */
    public final C5896e m28741F(C5896e c5896e, boolean z10) {
        C5896e c5896e2 = c5896e;
        if (c5896e == null) {
            c5896e2 = new C5896e(C5900i.f33081c, false);
        }
        List<String> m28856e = c5896e2.m28808c().m28856e();
        if (!z10) {
            m28856e.remove("android.media.intent.category.LIVE_AUDIO");
        } else if (!m28856e.contains("android.media.intent.category.LIVE_AUDIO")) {
            m28856e.add("android.media.intent.category.LIVE_AUDIO");
        }
        return new C5896e(new C5900i.a().m28860a(m28856e).m28863d(), c5896e2.m28809d());
    }

    @Override // p208m1.AbstractC5897f
    /* renamed from: r */
    public AbstractC5897f.b mo28742r(String str) {
        Iterator<Map.Entry<MediaRouter2.RoutingController, c>> it = this.f33009l.entrySet().iterator();
        while (it.hasNext()) {
            c value = it.next().getValue();
            if (TextUtils.equals(str, value.f33018f)) {
                return value;
            }
        }
        return null;
    }

    @Override // p208m1.AbstractC5897f
    /* renamed from: s */
    public AbstractC5897f.e mo28743s(String str) {
        return new d(this, this.f33016s.get(str), null);
    }

    @Override // p208m1.AbstractC5897f
    /* renamed from: t */
    public AbstractC5897f.e mo28744t(String str, String str2) {
        String str3 = this.f33016s.get(str);
        for (c cVar : this.f33009l.values()) {
            if (TextUtils.equals(str2, cVar.m28757r())) {
                return new d(this, str3, cVar);
            }
        }
        Log.w("MR2Provider", "Could not find the matching GroupRouteController. routeId=" + str + ", routeGroupId=" + str2);
        return new d(this, str3, null);
    }

    @Override // p208m1.AbstractC5897f
    /* renamed from: u */
    public void mo28745u(C5896e c5896e) {
        if (C5901j.m28865h() <= 0) {
            this.f33007j.unregisterRouteCallback(this.f33010m);
            this.f33007j.unregisterTransferCallback(this.f33011n);
            this.f33007j.unregisterControllerCallback(this.f33012o);
        } else {
            this.f33007j.registerRouteCallback(this.f33014q, this.f33010m, C5904m.m29016b(m28741F(c5896e, C5901j.m28870r())));
            this.f33007j.registerTransferCallback(this.f33014q, this.f33011n);
            this.f33007j.registerControllerCallback(this.f33014q, this.f33012o);
        }
    }
}

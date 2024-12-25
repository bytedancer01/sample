package p208m1;

import android.content.Context;
import android.media.MediaRouter;
import android.media.RemoteControlClient;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:m1/q.class
 */
/* renamed from: m1.q */
/* loaded from: combined.jar:classes1.jar:m1/q.class */
public final class C5908q {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/q$a.class
     */
    /* renamed from: m1.q$a */
    /* loaded from: combined.jar:classes1.jar:m1/q$a.class */
    public interface a {
        /* renamed from: b */
        void mo29034b(Object obj, Object obj2);

        /* renamed from: c */
        void mo29035c(Object obj, Object obj2, int i10);

        /* renamed from: e */
        void mo29036e(Object obj);

        /* renamed from: f */
        void mo29037f(int i10, Object obj);

        /* renamed from: g */
        void mo29038g(Object obj);

        /* renamed from: h */
        void mo29039h(int i10, Object obj);

        /* renamed from: j */
        void mo29040j(Object obj);

        /* renamed from: k */
        void mo29041k(Object obj);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/q$b.class
     */
    /* renamed from: m1.q$b */
    /* loaded from: combined.jar:classes1.jar:m1/q$b.class */
    public static class b<T extends a> extends MediaRouter.Callback {

        /* renamed from: a */
        public final T f33194a;

        public b(T t10) {
            this.f33194a = t10;
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.f33194a.mo29040j(routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.f33194a.mo29036e(routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i10) {
            this.f33194a.mo29035c(routeInfo, routeGroup, i10);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.f33194a.mo29038g(routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteSelected(MediaRouter mediaRouter, int i10, MediaRouter.RouteInfo routeInfo) {
            this.f33194a.mo29039h(i10, routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
            this.f33194a.mo29034b(routeInfo, routeGroup);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteUnselected(MediaRouter mediaRouter, int i10, MediaRouter.RouteInfo routeInfo) {
            this.f33194a.mo29037f(i10, routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.f33194a.mo29041k(routeInfo);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/q$c.class
     */
    /* renamed from: m1.q$c */
    /* loaded from: combined.jar:classes1.jar:m1/q$c.class */
    public static final class c {
        /* renamed from: a */
        public static CharSequence m29042a(Object obj, Context context) {
            return ((MediaRouter.RouteInfo) obj).getName(context);
        }

        /* renamed from: b */
        public static int m29043b(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getPlaybackStream();
        }

        /* renamed from: c */
        public static int m29044c(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getPlaybackType();
        }

        /* renamed from: d */
        public static int m29045d(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getSupportedTypes();
        }

        /* renamed from: e */
        public static Object m29046e(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getTag();
        }

        /* renamed from: f */
        public static int m29047f(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getVolume();
        }

        /* renamed from: g */
        public static int m29048g(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getVolumeHandling();
        }

        /* renamed from: h */
        public static int m29049h(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getVolumeMax();
        }

        /* renamed from: i */
        public static void m29050i(Object obj, int i10) {
            ((MediaRouter.RouteInfo) obj).requestSetVolume(i10);
        }

        /* renamed from: j */
        public static void m29051j(Object obj, int i10) {
            ((MediaRouter.RouteInfo) obj).requestUpdateVolume(i10);
        }

        /* renamed from: k */
        public static void m29052k(Object obj, Object obj2) {
            ((MediaRouter.RouteInfo) obj).setTag(obj2);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/q$d.class
     */
    /* renamed from: m1.q$d */
    /* loaded from: combined.jar:classes1.jar:m1/q$d.class */
    public static final class d {
        /* renamed from: a */
        public static void m29053a(Object obj, CharSequence charSequence) {
            ((MediaRouter.UserRouteInfo) obj).setName(charSequence);
        }

        /* renamed from: b */
        public static void m29054b(Object obj, int i10) {
            ((MediaRouter.UserRouteInfo) obj).setPlaybackStream(i10);
        }

        /* renamed from: c */
        public static void m29055c(Object obj, int i10) {
            ((MediaRouter.UserRouteInfo) obj).setPlaybackType(i10);
        }

        /* renamed from: d */
        public static void m29056d(Object obj, Object obj2) {
            ((MediaRouter.UserRouteInfo) obj).setRemoteControlClient((RemoteControlClient) obj2);
        }

        /* renamed from: e */
        public static void m29057e(Object obj, int i10) {
            ((MediaRouter.UserRouteInfo) obj).setVolume(i10);
        }

        /* renamed from: f */
        public static void m29058f(Object obj, Object obj2) {
            ((MediaRouter.UserRouteInfo) obj).setVolumeCallback((MediaRouter.VolumeCallback) obj2);
        }

        /* renamed from: g */
        public static void m29059g(Object obj, int i10) {
            ((MediaRouter.UserRouteInfo) obj).setVolumeHandling(i10);
        }

        /* renamed from: h */
        public static void m29060h(Object obj, int i10) {
            ((MediaRouter.UserRouteInfo) obj).setVolumeMax(i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/q$e.class
     */
    /* renamed from: m1.q$e */
    /* loaded from: combined.jar:classes1.jar:m1/q$e.class */
    public interface e {
        /* renamed from: a */
        void mo29061a(Object obj, int i10);

        /* renamed from: d */
        void mo29062d(Object obj, int i10);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/q$f.class
     */
    /* renamed from: m1.q$f */
    /* loaded from: combined.jar:classes1.jar:m1/q$f.class */
    public static class f<T extends e> extends MediaRouter.VolumeCallback {

        /* renamed from: a */
        public final T f33195a;

        public f(T t10) {
            this.f33195a = t10;
        }

        @Override // android.media.MediaRouter.VolumeCallback
        public void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i10) {
            this.f33195a.mo29062d(routeInfo, i10);
        }

        @Override // android.media.MediaRouter.VolumeCallback
        public void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i10) {
            this.f33195a.mo29061a(routeInfo, i10);
        }
    }

    /* renamed from: a */
    public static void m29024a(Object obj, Object obj2) {
        ((MediaRouter) obj).addUserRoute((MediaRouter.UserRouteInfo) obj2);
    }

    /* renamed from: b */
    public static Object m29025b(Object obj, String str, boolean z10) {
        return ((MediaRouter) obj).createRouteCategory(str, z10);
    }

    /* renamed from: c */
    public static Object m29026c(Object obj, Object obj2) {
        return ((MediaRouter) obj).createUserRoute((MediaRouter.RouteCategory) obj2);
    }

    /* renamed from: d */
    public static Object m29027d(e eVar) {
        return new f(eVar);
    }

    /* renamed from: e */
    public static Object m29028e(Context context) {
        return context.getSystemService("media_router");
    }

    /* renamed from: f */
    public static List m29029f(Object obj) {
        MediaRouter mediaRouter = (MediaRouter) obj;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        for (int i10 = 0; i10 < routeCount; i10++) {
            arrayList.add(mediaRouter.getRouteAt(i10));
        }
        return arrayList;
    }

    /* renamed from: g */
    public static Object m29030g(Object obj, int i10) {
        return ((MediaRouter) obj).getSelectedRoute(i10);
    }

    /* renamed from: h */
    public static void m29031h(Object obj, Object obj2) {
        ((MediaRouter) obj).removeCallback((MediaRouter.Callback) obj2);
    }

    /* renamed from: i */
    public static void m29032i(Object obj, Object obj2) {
        ((MediaRouter) obj).removeUserRoute((MediaRouter.UserRouteInfo) obj2);
    }

    /* renamed from: j */
    public static void m29033j(Object obj, int i10, Object obj2) {
        ((MediaRouter) obj).selectRoute(i10, (MediaRouter.RouteInfo) obj2);
    }
}

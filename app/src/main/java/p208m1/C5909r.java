package p208m1;

import android.media.MediaRouter;
import android.util.Log;
import android.view.Display;
import p208m1.C5908q;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:m1/r.class
 */
/* renamed from: m1.r */
/* loaded from: combined.jar:classes1.jar:m1/r.class */
public final class C5909r {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/r$a.class
     */
    /* renamed from: m1.r$a */
    /* loaded from: combined.jar:classes1.jar:m1/r$a.class */
    public interface a extends C5908q.a {
        /* renamed from: i */
        void mo29064i(Object obj);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/r$b.class
     */
    /* renamed from: m1.r$b */
    /* loaded from: combined.jar:classes1.jar:m1/r$b.class */
    public static class b<T extends a> extends C5908q.b<T> {
        public b(T t10) {
            super(t10);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            ((a) this.f33194a).mo29064i(routeInfo);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/r$c.class
     */
    /* renamed from: m1.r$c */
    /* loaded from: combined.jar:classes1.jar:m1/r$c.class */
    public static final class c {
        /* renamed from: a */
        public static Display m29065a(Object obj) {
            try {
                return ((MediaRouter.RouteInfo) obj).getPresentationDisplay();
            } catch (NoSuchMethodError e10) {
                Log.w("MediaRouterJellybeanMr1", "Cannot get presentation display for the route.", e10);
                return null;
            }
        }

        /* renamed from: b */
        public static boolean m29066b(Object obj) {
            return ((MediaRouter.RouteInfo) obj).isEnabled();
        }
    }

    /* renamed from: a */
    public static Object m29063a(a aVar) {
        return new b(aVar);
    }
}

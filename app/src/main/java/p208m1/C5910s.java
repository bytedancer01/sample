package p208m1;

import android.media.MediaRouter;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:m1/s.class
 */
/* renamed from: m1.s */
/* loaded from: combined.jar:classes1.jar:m1/s.class */
public final class C5910s {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/s$a.class
     */
    /* renamed from: m1.s$a */
    /* loaded from: combined.jar:classes1.jar:m1/s$a.class */
    public static final class a {
        /* renamed from: a */
        public static CharSequence m29069a(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getDescription();
        }

        /* renamed from: b */
        public static boolean m29070b(Object obj) {
            return ((MediaRouter.RouteInfo) obj).isConnecting();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/s$b.class
     */
    /* renamed from: m1.s$b */
    /* loaded from: combined.jar:classes1.jar:m1/s$b.class */
    public static final class b {
        /* renamed from: a */
        public static void m29071a(Object obj, CharSequence charSequence) {
            ((MediaRouter.UserRouteInfo) obj).setDescription(charSequence);
        }
    }

    /* renamed from: a */
    public static void m29067a(Object obj, int i10, Object obj2, int i11) {
        ((MediaRouter) obj).addCallback(i10, (MediaRouter.Callback) obj2, i11);
    }

    /* renamed from: b */
    public static Object m29068b(Object obj) {
        return ((MediaRouter) obj).getDefaultRoute();
    }
}

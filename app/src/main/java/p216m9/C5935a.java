package p216m9;

import android.content.Context;
import android.os.RemoteException;
import android.view.Menu;
import android.view.MenuItem;
import androidx.mediarouter.app.C0608e;
import androidx.mediarouter.app.MediaRouteActionProvider;
import androidx.mediarouter.app.MediaRouteButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import ma.C6026b;
import ma.C6126ff;
import ma.EnumC6057c9;
import p208m1.C5900i;
import p235o0.C6845p;
import p304r9.C8015b;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:m9/a.class
 */
/* renamed from: m9.a */
/* loaded from: combined.jar:classes2.jar:m9/a.class */
public final class C5935a {

    /* renamed from: a */
    public static final C8015b f33381a = new C8015b("CastButtonFactory");

    /* renamed from: b */
    public static final List f33382b = new ArrayList();

    /* renamed from: c */
    public static final List f33383c = new ArrayList();

    /* renamed from: d */
    public static C5999x f33384d = null;

    /* renamed from: a */
    public static MenuItem m29218a(Context context, Menu menu, int i10) {
        C9935o.m41845e("Must be called from the main thread.");
        C9935o.m41850j(menu);
        MenuItem findItem = menu.findItem(i10);
        if (findItem == null) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "menu doesn't contain a menu item whose ID is %d.", Integer.valueOf(i10)));
        }
        boolean m29226i = m29226i(context);
        try {
            MediaRouteActionProvider m29221d = m29221d(findItem);
            if (m29221d != null && m29227j(context, null)) {
                m29221d.m3228o(true);
            }
            m29224g(context, findItem, m29222e(null, m29226i));
            f33382b.add(new WeakReference(findItem));
            m29223f(null, m29226i);
            return findItem;
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "menu item with ID %d doesn't have a MediaRouteActionProvider.", Integer.valueOf(i10)), e10);
        }
    }

    /* renamed from: b */
    public static void m29219b(Context context, MediaRouteButton mediaRouteButton) {
        C9935o.m41845e("Must be called from the main thread.");
        boolean m29226i = m29226i(context);
        if (mediaRouteButton != null) {
            if (m29227j(context, null)) {
                mediaRouteButton.setAlwaysVisible(true);
            }
            m29225h(context, mediaRouteButton, m29222e(null, m29226i));
            f33383c.add(new WeakReference(mediaRouteButton));
        }
        m29223f(null, m29226i);
    }

    /* renamed from: c */
    public static void m29220c(C5999x c5999x) {
        C8015b c8015b;
        InterfaceC5988r1 interfaceC5988r1;
        f33384d = c5999x;
        try {
            interfaceC5988r1 = ((C6004z0) c5999x).f33639a.f33389b;
            interfaceC5988r1.mo29332J0(false);
        } catch (RemoteException e10) {
            c8015b = C5938b.f33385q;
            c8015b.m34874b(e10, "Unable to call %s on %s.", "setCustomMediaRouteDialogFactorySetUp", InterfaceC5988r1.class.getSimpleName());
        }
    }

    /* renamed from: d */
    public static MediaRouteActionProvider m29221d(MenuItem menuItem) {
        MediaRouteActionProvider mediaRouteActionProvider = (MediaRouteActionProvider) C6845p.m31618a(menuItem);
        MediaRouteActionProvider mediaRouteActionProvider2 = mediaRouteActionProvider;
        if (mediaRouteActionProvider == null) {
            mediaRouteActionProvider2 = null;
        }
        return mediaRouteActionProvider2;
    }

    /* renamed from: e */
    public static C0608e m29222e(C0608e c0608e, boolean z10) {
        if (z10) {
            return C6026b.m29435d();
        }
        return null;
    }

    /* renamed from: f */
    public static void m29223f(C0608e c0608e, boolean z10) {
        C6126ff.m29603d(z10 ? EnumC6057c9.CAST_SDK_DEFAULT_DEVICE_DIALOG : EnumC6057c9.CAST_DEFAULT_MEDIA_ROUTER_DIALOG);
    }

    /* renamed from: g */
    public static void m29224g(Context context, MenuItem menuItem, C0608e c0608e) {
        C5900i m29242b;
        C9935o.m41845e("Must be called from the main thread.");
        MediaRouteActionProvider m29221d = m29221d(menuItem);
        if (m29221d == null) {
            throw new IllegalArgumentException("cannot refreshButtonSelector with null mediaRouteActionProvider");
        }
        C5938b m29236g = C5938b.m29236g(context);
        if (m29236g != null && (m29242b = m29236g.m29242b()) != null) {
            m29221d.m3230q(m29242b);
        }
        if (c0608e != null) {
            m29221d.m3229p(c0608e);
        }
    }

    /* renamed from: h */
    public static void m29225h(Context context, MediaRouteButton mediaRouteButton, C0608e c0608e) {
        C5900i m29242b;
        C9935o.m41845e("Must be called from the main thread.");
        C5938b m29236g = C5938b.m29236g(context);
        if (m29236g != null && (m29242b = m29236g.m29242b()) != null) {
            mediaRouteButton.setRouteSelector(m29242b);
        }
        if (c0608e != null) {
            mediaRouteButton.setDialogFactory(c0608e);
        }
    }

    /* renamed from: i */
    public static boolean m29226i(Context context) {
        C5938b m29236g = C5938b.m29236g(context);
        return m29236g != null && m29236g.m29241a().m29261Z();
    }

    /* renamed from: j */
    public static boolean m29227j(Context context, C0608e c0608e) {
        return m29226i(context);
    }
}

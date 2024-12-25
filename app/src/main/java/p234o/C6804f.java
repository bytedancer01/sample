package p234o;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o/f.class
 */
/* renamed from: o.f */
/* loaded from: combined.jar:classes1.jar:o/f.class */
public final class C6804f {

    /* renamed from: a */
    public final Object f35486a = new Object();

    /* renamed from: b */
    public final ICustomTabsService f35487b;

    /* renamed from: c */
    public final ICustomTabsCallback f35488c;

    /* renamed from: d */
    public final ComponentName f35489d;

    /* renamed from: e */
    public final PendingIntent f35490e;

    public C6804f(ICustomTabsService iCustomTabsService, ICustomTabsCallback iCustomTabsCallback, ComponentName componentName, PendingIntent pendingIntent) {
        this.f35487b = iCustomTabsService;
        this.f35488c = iCustomTabsCallback;
        this.f35489d = componentName;
        this.f35490e = pendingIntent;
    }

    /* renamed from: a */
    public final void m31361a(Bundle bundle) {
        PendingIntent pendingIntent = this.f35490e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    /* renamed from: b */
    public final Bundle m31362b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        m31361a(bundle2);
        return bundle2;
    }

    /* renamed from: c */
    public IBinder m31363c() {
        return this.f35488c.asBinder();
    }

    /* renamed from: d */
    public ComponentName m31364d() {
        return this.f35489d;
    }

    /* renamed from: e */
    public PendingIntent m31365e() {
        return this.f35490e;
    }

    /* renamed from: f */
    public boolean m31366f(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.f35487b.mayLaunchUrl(this.f35488c, uri, m31362b(bundle), list);
        } catch (RemoteException e10) {
            return false;
        }
    }
}

package p139i1;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:i1/a.class
 */
/* renamed from: i1.a */
/* loaded from: combined.jar:classes1.jar:i1/a.class */
public class C5147a {
    /* renamed from: a */
    public static boolean m25780a(Bundle bundle, Bundle bundle2) {
        boolean z10 = true;
        if (bundle == bundle2) {
            return true;
        }
        if (bundle != null) {
            if (bundle2 == null) {
                return bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == -1 && bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1;
            }
            return bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) && bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
        }
        if (bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) != -1 || bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) != -1) {
            z10 = false;
        }
        return z10;
    }
}

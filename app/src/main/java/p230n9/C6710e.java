package p230n9;

import android.net.Uri;
import com.google.android.gms.cast.MediaInfo;
import p200l9.C5782l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n9/e.class
 */
/* renamed from: n9.e */
/* loaded from: combined.jar:classes2.jar:n9/e.class */
public class C6710e {
    /* renamed from: a */
    public static Uri m30909a(MediaInfo mediaInfo, int i10) {
        C5782l m13065Y;
        if (mediaInfo == null || (m13065Y = mediaInfo.m13065Y()) == null || m13065Y.m28244Q() == null || m13065Y.m28244Q().size() <= i10) {
            return null;
        }
        return m13065Y.m28244Q().get(i10).m40801P();
    }
}

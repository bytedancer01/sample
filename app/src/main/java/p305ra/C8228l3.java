package p305ra;

import android.net.Uri;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/l3.class
 */
/* renamed from: ra.l3 */
/* loaded from: combined.jar:classes2.jar:ra/l3.class */
public final class C8228l3 {

    /* renamed from: a */
    public final Map<String, Map<String, String>> f39163a;

    public C8228l3(Map<String, Map<String, String>> map) {
        this.f39163a = map;
    }

    /* renamed from: a */
    public final String m35567a(Uri uri, String str, String str2, String str3) {
        if (uri == null) {
            return null;
        }
        Map<String, String> map = this.f39163a.get(uri.toString());
        if (map == null) {
            return null;
        }
        String valueOf = String.valueOf(str3);
        return map.get(valueOf.length() != 0 ? "".concat(valueOf) : new String(""));
    }
}

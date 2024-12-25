package p073e4;

import android.net.Uri;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferTable;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e4/a.class
 */
/* renamed from: e4.a */
/* loaded from: combined.jar:classes1.jar:e4/a.class */
public final class C4606a {

    /* renamed from: a */
    public static final int f27280a = 22;

    /* renamed from: a */
    public static boolean m23225a(Uri uri) {
        boolean z10 = false;
        if (TransferTable.COLUMN_FILE.equals(uri.getScheme())) {
            z10 = false;
            if (!uri.getPathSegments().isEmpty()) {
                z10 = false;
                if ("android_asset".equals(uri.getPathSegments().get(0))) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    /* renamed from: b */
    public static String m23226b(Uri uri) {
        return uri.toString().substring(f27280a);
    }
}

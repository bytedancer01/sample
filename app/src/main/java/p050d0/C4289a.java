package p050d0;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import p175k0.C5441b;
import p175k0.C5449j;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:d0/a.class
 */
/* renamed from: d0.a */
/* loaded from: combined.jar:classes1.jar:d0/a.class */
public final class C4289a {
    /* renamed from: a */
    public static Cursor m21721a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, C5441b c5441b) {
        Object m27191b;
        if (c5441b != null) {
            try {
                m27191b = c5441b.m27191b();
            } catch (Exception e10) {
                if (e10 instanceof OperationCanceledException) {
                    throw new C5449j();
                }
                throw e10;
            }
        } else {
            m27191b = null;
        }
        return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) m27191b);
    }
}

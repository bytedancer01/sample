package p305ra;

import android.net.Uri;
import p294r.C7928a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/n3.class
 */
/* renamed from: ra.n3 */
/* loaded from: combined.jar:classes2.jar:ra/n3.class */
public final class C8258n3 {

    /* renamed from: a */
    public static final C7928a<String, Uri> f39205a = new C7928a<>();

    /* renamed from: a */
    public static Uri m35645a(String str) {
        Uri uri;
        synchronized (C8258n3.class) {
            try {
                C7928a<String, Uri> c7928a = f39205a;
                Uri uri2 = c7928a.get("com.google.android.gms.measurement");
                uri = uri2;
                if (uri2 == null) {
                    String valueOf = String.valueOf(Uri.encode("com.google.android.gms.measurement"));
                    uri = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                    c7928a.put("com.google.android.gms.measurement", uri);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uri;
    }
}

package qa;

import android.os.StrictMode;
import java.util.concurrent.Callable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qa/d.class
 */
/* renamed from: qa.d */
/* loaded from: combined.jar:classes2.jar:qa/d.class */
public final class C7873d {
    /* renamed from: a */
    public static <T> T m34144a(Callable<T> callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}

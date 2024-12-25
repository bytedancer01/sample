package p060da;

import java.io.Closeable;
import java.io.IOException;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:da/k.class
 */
@Deprecated
/* renamed from: da.k */
/* loaded from: combined.jar:classes2.jar:da/k.class */
public final class C4412k {
    /* renamed from: a */
    public static void m22448a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
            }
        }
    }
}

package pa;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:pa/h.class
 */
/* renamed from: pa.h */
/* loaded from: combined.jar:classes2.jar:pa/h.class */
public final class C7689h {

    /* renamed from: a */
    public static final Logger f37431a = Logger.getLogger(C7689h.class.getName());

    /* renamed from: a */
    public static void m33629a(@NullableDecl InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException e10) {
            try {
                f37431a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", (Throwable) e10);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}

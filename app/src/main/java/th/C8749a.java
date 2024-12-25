package th;

import java.io.Closeable;
import org.jetbrains.annotations.Nullable;
import p172jh.C5382a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:th/a.class
 */
/* renamed from: th.a */
/* loaded from: combined.jar:classes2.jar:th/a.class */
public final class C8749a {
    /* renamed from: a */
    public static final void m37542a(@Nullable Closeable closeable, @Nullable Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                C5382a.m26732a(th2, th3);
            }
        }
    }
}

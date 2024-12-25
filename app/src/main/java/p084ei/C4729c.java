package p084ei;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p172jh.C5392k;
import p172jh.C5393l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ei/c.class
 */
/* renamed from: ei.c */
/* loaded from: combined.jar:classes2.jar:ei/c.class */
public final class C4729c {

    /* renamed from: a */
    @Nullable
    public static final AbstractC4728b f27876a;

    @Nullable
    private static volatile Choreographer choreographer;

    static {
        Object m26741a;
        try {
            C5392k.a aVar = C5392k.f30764b;
            m26741a = C5392k.m26741a(new C4727a(m23883a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th2) {
            C5392k.a aVar2 = C5392k.f30764b;
            m26741a = C5392k.m26741a(C5393l.m26745a(th2));
        }
        if (C5392k.m26743c(m26741a)) {
            m26741a = null;
        }
        f27876a = (AbstractC4728b) m26741a;
    }

    @NotNull
    /* renamed from: a */
    public static final Handler m23883a(@NotNull Looper looper, boolean z10) {
        if (!z10) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException e10) {
                return new Handler(looper);
            }
        }
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        if (invoke != null) {
            return (Handler) invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
    }
}

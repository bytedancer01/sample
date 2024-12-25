package p175k0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k0/e.class
 */
/* renamed from: k0.e */
/* loaded from: combined.jar:classes1.jar:k0/e.class */
public final class C5444e {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k0/e$a.class
     */
    /* renamed from: k0.e$a */
    /* loaded from: combined.jar:classes1.jar:k0/e$a.class */
    public static class a {
        /* renamed from: a */
        public static Handler m27198a(Looper looper) {
            Handler createAsync;
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
    }

    /* renamed from: a */
    public static Handler m27197a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m27198a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e10) {
            e = e10;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e11) {
            e = e11;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e12) {
            e = e12;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e13) {
            Throwable cause = e13.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }
}

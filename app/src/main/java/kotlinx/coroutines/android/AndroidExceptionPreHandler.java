package kotlinx.coroutines.android;

import android.os.Build;
import androidx.annotation.Keep;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233nh.AbstractC6786a;
import p233nh.InterfaceC6792g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kotlinx/coroutines/android/AndroidExceptionPreHandler.class
 */
@Keep
/* loaded from: combined.jar:classes2.jar:kotlinx/coroutines/android/AndroidExceptionPreHandler.class */
public final class AndroidExceptionPreHandler extends AbstractC6786a implements CoroutineExceptionHandler {

    @Nullable
    private volatile Object _preHandler;

    public AndroidExceptionPreHandler() {
        super(CoroutineExceptionHandler.f31716c0);
        this._preHandler = this;
    }

    private final Method preHandler() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            boolean z10 = false;
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                z10 = false;
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    z10 = true;
                }
            }
            if (z10) {
                method = declaredMethod;
            }
        } catch (Throwable th2) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(@NotNull InterfaceC6792g interfaceC6792g, @NotNull Throwable th2) {
        Thread currentThread = Thread.currentThread();
        if (Build.VERSION.SDK_INT >= 28) {
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
            return;
        }
        Method preHandler = preHandler();
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
        Object invoke = preHandler == null ? null : preHandler.invoke(null, new Object[0]);
        if (invoke instanceof Thread.UncaughtExceptionHandler) {
            uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) invoke;
        }
        if (uncaughtExceptionHandler == null) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(currentThread, th2);
    }
}

package p067di;

import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;
import p172jh.C5382a;
import p233nh.InterfaceC6792g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/d0.class
 */
/* renamed from: di.d0 */
/* loaded from: combined.jar:classes2.jar:di/d0.class */
public final class C4468d0 {
    /* renamed from: a */
    public static final void m22650a(@NotNull InterfaceC6792g interfaceC6792g, @NotNull Throwable th2) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) interfaceC6792g.get(CoroutineExceptionHandler.f31716c0);
            if (coroutineExceptionHandler == null) {
                C4465c0.m22638a(interfaceC6792g, th2);
            } else {
                coroutineExceptionHandler.handleException(interfaceC6792g, th2);
            }
        } catch (Throwable th3) {
            C4465c0.m22638a(interfaceC6792g, m22651b(th2, th3));
        }
    }

    @NotNull
    /* renamed from: b */
    public static final Throwable m22651b(@NotNull Throwable th2, @NotNull Throwable th3) {
        if (th2 == th3) {
            return th2;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
        C5382a.m26732a(runtimeException, th2);
        return runtimeException;
    }
}

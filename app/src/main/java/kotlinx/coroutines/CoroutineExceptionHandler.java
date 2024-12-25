package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import p233nh.InterfaceC6792g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kotlinx/coroutines/CoroutineExceptionHandler.class
 */
/* loaded from: combined.jar:classes2.jar:kotlinx/coroutines/CoroutineExceptionHandler.class */
public interface CoroutineExceptionHandler extends InterfaceC6792g.b {

    /* renamed from: c0 */
    @NotNull
    public static final C5635a f31716c0 = C5635a.f31717b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:kotlinx/coroutines/CoroutineExceptionHandler$a.class
     */
    /* renamed from: kotlinx.coroutines.CoroutineExceptionHandler$a */
    /* loaded from: combined.jar:classes2.jar:kotlinx/coroutines/CoroutineExceptionHandler$a.class */
    public static final class C5635a implements InterfaceC6792g.c<CoroutineExceptionHandler> {

        /* renamed from: b */
        public static final C5635a f31717b = new C5635a();
    }

    void handleException(@NotNull InterfaceC6792g interfaceC6792g, @NotNull Throwable th2);
}

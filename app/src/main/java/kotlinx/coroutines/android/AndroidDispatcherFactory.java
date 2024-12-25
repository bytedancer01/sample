package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p067di.AbstractC4496m1;
import p084ei.C4727a;
import p084ei.C4729c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kotlinx/coroutines/android/AndroidDispatcherFactory.class
 */
/* loaded from: combined.jar:classes2.jar:kotlinx/coroutines/android/AndroidDispatcherFactory.class */
public final class AndroidDispatcherFactory implements MainDispatcherFactory {
    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public /* bridge */ /* synthetic */ AbstractC4496m1 createDispatcher(List list) {
        return createDispatcher((List<? extends MainDispatcherFactory>) list);
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    @NotNull
    public C4727a createDispatcher(@NotNull List<? extends MainDispatcherFactory> list) {
        return new C4727a(C4729c.m23883a(Looper.getMainLooper(), true), null, 2, null);
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public int getLoadPriority() {
        return 1073741823;
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    @Nullable
    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}

package kotlinx.coroutines.internal;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p067di.AbstractC4496m1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kotlinx/coroutines/internal/MainDispatcherFactory.class
 */
/* loaded from: combined.jar:classes2.jar:kotlinx/coroutines/internal/MainDispatcherFactory.class */
public interface MainDispatcherFactory {
    @NotNull
    AbstractC4496m1 createDispatcher(@NotNull List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    @Nullable
    String hintOnError();
}

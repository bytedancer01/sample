package android.view;

import android.annotation.NonNull;
import android.graphics.Insets;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:android/view/WindowInsets$Builder.class
 */
/* loaded from: combined.jar:classes1.jar:android/view/WindowInsets$Builder.class */
public final /* synthetic */ class WindowInsets$Builder {
    static {
        throw new NoClassDefFoundError();
    }

    public /* synthetic */ WindowInsets$Builder() {
    }

    public /* synthetic */ WindowInsets$Builder(@NonNull WindowInsets windowInsets) {
    }

    @NonNull
    public native /* synthetic */ WindowInsets build();

    @NonNull
    @Deprecated
    public native /* synthetic */ WindowInsets$Builder setMandatorySystemGestureInsets(@NonNull Insets insets);

    @NonNull
    @Deprecated
    public native /* synthetic */ WindowInsets$Builder setStableInsets(@NonNull Insets insets);

    @NonNull
    @Deprecated
    public native /* synthetic */ WindowInsets$Builder setSystemGestureInsets(@NonNull Insets insets);

    @NonNull
    @Deprecated
    public native /* synthetic */ WindowInsets$Builder setSystemWindowInsets(@NonNull Insets insets);

    @NonNull
    @Deprecated
    public native /* synthetic */ WindowInsets$Builder setTappableElementInsets(@NonNull Insets insets);
}

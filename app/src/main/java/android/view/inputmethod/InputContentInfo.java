package android.view.inputmethod;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:android/view/inputmethod/InputContentInfo.class
 */
/* loaded from: combined.jar:classes1.jar:android/view/inputmethod/InputContentInfo.class */
public final /* synthetic */ class InputContentInfo implements Parcelable {
    static {
        throw new NoClassDefFoundError();
    }

    public /* synthetic */ InputContentInfo(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
    }

    @NonNull
    public native /* synthetic */ Uri getContentUri();

    @NonNull
    public native /* synthetic */ ClipDescription getDescription();

    @Nullable
    public native /* synthetic */ Uri getLinkUri();

    public native /* synthetic */ void requestPermission();
}

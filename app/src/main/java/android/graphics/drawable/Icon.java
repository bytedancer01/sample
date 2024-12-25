package android.graphics.drawable;

import android.annotation.NonNull;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:android/graphics/drawable/Icon.class
 */
/* loaded from: combined.jar:classes1.jar:android/graphics/drawable/Icon.class */
public final /* synthetic */ class Icon implements Parcelable {
    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public static native /* synthetic */ Icon createWithBitmap(Bitmap bitmap);

    @NonNull
    public static native /* synthetic */ Icon createWithContentUri(String str);

    @NonNull
    public static native /* synthetic */ Icon createWithData(byte[] bArr, int i10, int i11);

    @NonNull
    public static native /* synthetic */ Icon createWithResource(Context context, int i10);

    @NonNull
    public static native /* synthetic */ Icon createWithResource(String str, int i10);

    @NonNull
    public native /* synthetic */ Icon setTintList(ColorStateList colorStateList);

    @NonNull
    public native /* synthetic */ Icon setTintMode(@NonNull PorterDuff.Mode mode);
}

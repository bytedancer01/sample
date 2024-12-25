package p314s0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:s0/f.class
 */
/* renamed from: s0.f */
/* loaded from: combined.jar:classes1.jar:s0/f.class */
public class C8498f {
    /* renamed from: a */
    public static ColorStateList m36690a(ImageView imageView) {
        return imageView.getImageTintList();
    }

    /* renamed from: b */
    public static PorterDuff.Mode m36691b(ImageView imageView) {
        return imageView.getImageTintMode();
    }

    /* renamed from: c */
    public static void m36692c(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        int i10 = Build.VERSION.SDK_INT;
        imageView.setImageTintList(colorStateList);
        if (i10 != 21 || (drawable = imageView.getDrawable()) == null || imageView.getImageTintList() == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }

    /* renamed from: d */
    public static void m36693d(ImageView imageView, PorterDuff.Mode mode) {
        Drawable drawable;
        int i10 = Build.VERSION.SDK_INT;
        imageView.setImageTintMode(mode);
        if (i10 != 21 || (drawable = imageView.getDrawable()) == null || imageView.getImageTintList() == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }
}

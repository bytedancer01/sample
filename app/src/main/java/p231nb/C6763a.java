package p231nb;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:nb/a.class
 */
/* renamed from: nb.a */
/* loaded from: combined.jar:classes2.jar:nb/a.class */
public final class C6763a {
    /* renamed from: a */
    public static PorterDuffColorFilter m31078a(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}

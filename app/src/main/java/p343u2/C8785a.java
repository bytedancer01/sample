package p343u2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:u2/a.class
 */
/* renamed from: u2.a */
/* loaded from: combined.jar:classes1.jar:u2/a.class */
public class C8785a {
    /* renamed from: a */
    public static int m37590a(Context context, int i10) {
        return m37591b(context, i10, 0);
    }

    /* renamed from: b */
    public static int m37591b(Context context, int i10, int i11) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i10});
        try {
            return obtainStyledAttributes.getColor(0, i11);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: c */
    public static void m37592c(View view, Drawable drawable) {
        view.setBackground(drawable);
    }
}

package p316s2;

import android.util.TypedValue;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:s2/c.class
 */
/* renamed from: s2.c */
/* loaded from: combined.jar:classes1.jar:s2/c.class */
public final class C8522c {

    /* renamed from: a */
    public static final TypedValue f39899a = new TypedValue();

    /* renamed from: a */
    public static <T> T m36737a(View view, int i10, String str, Class<T> cls) {
        try {
            return cls.cast(view);
        } catch (ClassCastException e10) {
            throw new IllegalStateException("View '" + m36740d(view, i10) + "' with ID " + i10 + " for " + str + " was of the wrong type. See cause for more info.", e10);
        }
    }

    /* renamed from: b */
    public static View m36738b(View view, int i10, String str) {
        View findViewById = view.findViewById(i10);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalStateException("Required view '" + m36740d(view, i10) + "' with ID " + i10 + " for " + str + " was not found. If this view is optional add '@Nullable' (fields) or '@Optional' (methods) annotation.");
    }

    /* renamed from: c */
    public static <T> T m36739c(View view, int i10, String str, Class<T> cls) {
        return (T) m36737a(m36738b(view, i10, str), i10, str, cls);
    }

    /* renamed from: d */
    public static String m36740d(View view, int i10) {
        return view.isInEditMode() ? "<unavailable while editing>" : view.getContext().getResources().getResourceEntryName(i10);
    }
}

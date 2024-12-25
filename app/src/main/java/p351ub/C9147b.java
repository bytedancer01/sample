package p351ub;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ub/b.class
 */
/* renamed from: ub.b */
/* loaded from: combined.jar:classes2.jar:ub/b.class */
public class C9147b {
    /* renamed from: a */
    public static TypedValue m38472a(Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m38473b(Context context, int i10, boolean z10) {
        TypedValue m38472a = m38472a(context, i10);
        boolean z11 = z10;
        if (m38472a != null) {
            z11 = z10;
            if (m38472a.type == 18) {
                z11 = m38472a.data != 0;
            }
        }
        return z11;
    }

    /* renamed from: c */
    public static int m38474c(Context context, int i10, String str) {
        TypedValue m38472a = m38472a(context, i10);
        if (m38472a != null) {
            return m38472a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i10)));
    }

    /* renamed from: d */
    public static int m38475d(View view, int i10) {
        return m38474c(view.getContext(), i10, view.getClass().getCanonicalName());
    }
}

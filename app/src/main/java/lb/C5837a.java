package lb;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import p087f0.C4738a;
import p351ub.C9147b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:lb/a.class
 */
/* renamed from: lb.a */
/* loaded from: combined.jar:classes2.jar:lb/a.class */
public class C5837a {
    /* renamed from: a */
    public static int m28422a(Context context, int i10, int i11) {
        TypedValue m38472a = C9147b.m38472a(context, i10);
        return m38472a != null ? m38472a.data : i11;
    }

    /* renamed from: b */
    public static int m28423b(Context context, int i10, String str) {
        return C9147b.m38474c(context, i10, str);
    }

    /* renamed from: c */
    public static int m28424c(View view, int i10) {
        return C9147b.m38475d(view, i10);
    }

    /* renamed from: d */
    public static int m28425d(View view, int i10, int i11) {
        return m28422a(view.getContext(), i10, i11);
    }

    /* renamed from: e */
    public static int m28426e(int i10, int i11) {
        return C4738a.m23970i(i11, i10);
    }

    /* renamed from: f */
    public static int m28427f(int i10, int i11, float f10) {
        return m28426e(i10, C4738a.m23974m(i11, Math.round(Color.alpha(i11) * f10)));
    }

    /* renamed from: g */
    public static int m28428g(View view, int i10, int i11, float f10) {
        return m28427f(m28424c(view, i10), m28424c(view, i11), f10);
    }
}

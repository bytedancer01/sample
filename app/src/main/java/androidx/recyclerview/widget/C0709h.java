package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import p235o0.C6824g0;
import p315s1.C8518c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/recyclerview/widget/h.class
 */
/* renamed from: androidx.recyclerview.widget.h */
/* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/h.class */
public class C0709h implements InterfaceC0708g {

    /* renamed from: a */
    public static final InterfaceC0708g f4932a = new C0709h();

    /* renamed from: e */
    public static float m4593e(RecyclerView recyclerView, View view) {
        float f10;
        int childCount = recyclerView.getChildCount();
        float f11 = 0.0f;
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = recyclerView.getChildAt(i10);
            if (childAt == view) {
                f10 = f11;
            } else {
                float m31552w = C6824g0.m31552w(childAt);
                f10 = f11;
                if (m31552w > f11) {
                    f10 = m31552w;
                }
            }
            i10++;
            f11 = f10;
        }
        return f11;
    }

    @Override // androidx.recyclerview.widget.InterfaceC0708g
    /* renamed from: a */
    public void mo4589a(View view) {
        int i10 = C8518c.f39878a;
        Object tag = view.getTag(i10);
        if (tag instanceof Float) {
            C6824g0.m31553w0(view, ((Float) tag).floatValue());
        }
        view.setTag(i10, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.InterfaceC0708g
    /* renamed from: b */
    public void mo4590b(View view) {
    }

    @Override // androidx.recyclerview.widget.InterfaceC0708g
    /* renamed from: c */
    public void mo4591c(Canvas canvas, RecyclerView recyclerView, View view, float f10, float f11, int i10, boolean z10) {
        if (z10) {
            int i11 = C8518c.f39878a;
            if (view.getTag(i11) == null) {
                float m31552w = C6824g0.m31552w(view);
                C6824g0.m31553w0(view, m4593e(recyclerView, view) + 1.0f);
                view.setTag(i11, Float.valueOf(m31552w));
            }
        }
        view.setTranslationX(f10);
        view.setTranslationY(f11);
    }

    @Override // androidx.recyclerview.widget.InterfaceC0708g
    /* renamed from: d */
    public void mo4592d(Canvas canvas, RecyclerView recyclerView, View view, float f10, float f11, int i10, boolean z10) {
    }
}

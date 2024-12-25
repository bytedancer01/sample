package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/recyclerview/widget/o.class
 */
/* renamed from: androidx.recyclerview.widget.o */
/* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/o.class */
public class C0716o {
    /* renamed from: a */
    public static int m4651a(RecyclerView.C0668b0 c0668b0, AbstractC0713l abstractC0713l, View view, View view2, RecyclerView.AbstractC0685p abstractC0685p, boolean z10) {
        if (abstractC0685p.m4217h0() == 0 || c0668b0.m4009c() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(abstractC0685p.m4155B0(view) - abstractC0685p.m4155B0(view2)) + 1;
        }
        return Math.min(abstractC0713l.mo4624n(), abstractC0713l.mo4614d(view2) - abstractC0713l.mo4617g(view));
    }

    /* renamed from: b */
    public static int m4652b(RecyclerView.C0668b0 c0668b0, AbstractC0713l abstractC0713l, View view, View view2, RecyclerView.AbstractC0685p abstractC0685p, boolean z10, boolean z11) {
        if (abstractC0685p.m4217h0() == 0 || c0668b0.m4009c() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z11 ? Math.max(0, (c0668b0.m4009c() - Math.max(abstractC0685p.m4155B0(view), abstractC0685p.m4155B0(view2))) - 1) : Math.max(0, Math.min(abstractC0685p.m4155B0(view), abstractC0685p.m4155B0(view2)));
        if (z10) {
            return Math.round((max * (Math.abs(abstractC0713l.mo4614d(view2) - abstractC0713l.mo4617g(view)) / (Math.abs(abstractC0685p.m4155B0(view) - abstractC0685p.m4155B0(view2)) + 1))) + (abstractC0713l.mo4623m() - abstractC0713l.mo4617g(view)));
        }
        return max;
    }

    /* renamed from: c */
    public static int m4653c(RecyclerView.C0668b0 c0668b0, AbstractC0713l abstractC0713l, View view, View view2, RecyclerView.AbstractC0685p abstractC0685p, boolean z10) {
        if (abstractC0685p.m4217h0() == 0 || c0668b0.m4009c() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return c0668b0.m4009c();
        }
        return (int) (((abstractC0713l.mo4614d(view2) - abstractC0713l.mo4617g(view)) / (Math.abs(abstractC0685p.m4155B0(view) - abstractC0685p.m4155B0(view2)) + 1)) * c0668b0.m4009c());
    }
}

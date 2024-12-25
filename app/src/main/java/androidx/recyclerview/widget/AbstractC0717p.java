package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/recyclerview/widget/p.class
 */
/* renamed from: androidx.recyclerview.widget.p */
/* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/p.class */
public abstract class AbstractC0717p extends RecyclerView.AbstractC0682m {

    /* renamed from: g */
    public boolean f4961g = true;

    /* renamed from: A */
    public abstract boolean mo4478A(RecyclerView.AbstractC0674e0 abstractC0674e0);

    /* renamed from: B */
    public final void m4654B(RecyclerView.AbstractC0674e0 abstractC0674e0) {
        m4662J(abstractC0674e0);
        m4121h(abstractC0674e0);
    }

    /* renamed from: C */
    public final void m4655C(RecyclerView.AbstractC0674e0 abstractC0674e0) {
        m4663K(abstractC0674e0);
    }

    /* renamed from: D */
    public final void m4656D(RecyclerView.AbstractC0674e0 abstractC0674e0, boolean z10) {
        m4664L(abstractC0674e0, z10);
        m4121h(abstractC0674e0);
    }

    /* renamed from: E */
    public final void m4657E(RecyclerView.AbstractC0674e0 abstractC0674e0, boolean z10) {
        m4665M(abstractC0674e0, z10);
    }

    /* renamed from: F */
    public final void m4658F(RecyclerView.AbstractC0674e0 abstractC0674e0) {
        m4666N(abstractC0674e0);
        m4121h(abstractC0674e0);
    }

    /* renamed from: G */
    public final void m4659G(RecyclerView.AbstractC0674e0 abstractC0674e0) {
        m4667O(abstractC0674e0);
    }

    /* renamed from: H */
    public final void m4660H(RecyclerView.AbstractC0674e0 abstractC0674e0) {
        m4668P(abstractC0674e0);
        m4121h(abstractC0674e0);
    }

    /* renamed from: I */
    public final void m4661I(RecyclerView.AbstractC0674e0 abstractC0674e0) {
        m4669Q(abstractC0674e0);
    }

    /* renamed from: J */
    public void m4662J(RecyclerView.AbstractC0674e0 abstractC0674e0) {
    }

    /* renamed from: K */
    public void m4663K(RecyclerView.AbstractC0674e0 abstractC0674e0) {
    }

    /* renamed from: L */
    public void m4664L(RecyclerView.AbstractC0674e0 abstractC0674e0, boolean z10) {
    }

    /* renamed from: M */
    public void m4665M(RecyclerView.AbstractC0674e0 abstractC0674e0, boolean z10) {
    }

    /* renamed from: N */
    public void m4666N(RecyclerView.AbstractC0674e0 abstractC0674e0) {
    }

    /* renamed from: O */
    public void m4667O(RecyclerView.AbstractC0674e0 abstractC0674e0) {
    }

    /* renamed from: P */
    public void m4668P(RecyclerView.AbstractC0674e0 abstractC0674e0) {
    }

    /* renamed from: Q */
    public void m4669Q(RecyclerView.AbstractC0674e0 abstractC0674e0) {
    }

    /* renamed from: R */
    public void m4670R(boolean z10) {
        this.f4961g = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0682m
    /* renamed from: a */
    public boolean mo4115a(RecyclerView.AbstractC0674e0 abstractC0674e0, RecyclerView.AbstractC0682m.c cVar, RecyclerView.AbstractC0682m.c cVar2) {
        int i10;
        int i11;
        return (cVar == null || ((i10 = cVar.f4650a) == (i11 = cVar2.f4650a) && cVar.f4651b == cVar2.f4651b)) ? mo4489x(abstractC0674e0) : mo4491z(abstractC0674e0, i10, cVar.f4651b, i11, cVar2.f4651b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0682m
    /* renamed from: b */
    public boolean mo4116b(RecyclerView.AbstractC0674e0 abstractC0674e0, RecyclerView.AbstractC0674e0 abstractC0674e02, RecyclerView.AbstractC0682m.c cVar, RecyclerView.AbstractC0682m.c cVar2) {
        int i10;
        int i11;
        int i12 = cVar.f4650a;
        int i13 = cVar.f4651b;
        if (abstractC0674e02.m4051O()) {
            i10 = cVar.f4650a;
            i11 = cVar.f4651b;
        } else {
            i10 = cVar2.f4650a;
            i11 = cVar2.f4651b;
        }
        return mo4490y(abstractC0674e0, abstractC0674e02, i12, i13, i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0682m
    /* renamed from: c */
    public boolean mo4117c(RecyclerView.AbstractC0674e0 abstractC0674e0, RecyclerView.AbstractC0682m.c cVar, RecyclerView.AbstractC0682m.c cVar2) {
        int i10 = cVar.f4650a;
        int i11 = cVar.f4651b;
        View view = abstractC0674e0.f4620a;
        int left = cVar2 == null ? view.getLeft() : cVar2.f4650a;
        int top = cVar2 == null ? view.getTop() : cVar2.f4651b;
        if (abstractC0674e0.m4037A() || (i10 == left && i11 == top)) {
            return mo4478A(abstractC0674e0);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo4491z(abstractC0674e0, i10, i11, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0682m
    /* renamed from: d */
    public boolean mo4118d(RecyclerView.AbstractC0674e0 abstractC0674e0, RecyclerView.AbstractC0682m.c cVar, RecyclerView.AbstractC0682m.c cVar2) {
        int i10 = cVar.f4650a;
        int i11 = cVar2.f4650a;
        if (i10 != i11 || cVar.f4651b != cVar2.f4651b) {
            return mo4491z(abstractC0674e0, i10, cVar.f4651b, i11, cVar2.f4651b);
        }
        m4658F(abstractC0674e0);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0682m
    /* renamed from: f */
    public boolean mo4119f(RecyclerView.AbstractC0674e0 abstractC0674e0) {
        return !this.f4961g || abstractC0674e0.m4075y();
    }

    /* renamed from: x */
    public abstract boolean mo4489x(RecyclerView.AbstractC0674e0 abstractC0674e0);

    /* renamed from: y */
    public abstract boolean mo4490y(RecyclerView.AbstractC0674e0 abstractC0674e0, RecyclerView.AbstractC0674e0 abstractC0674e02, int i10, int i11, int i12, int i13);

    /* renamed from: z */
    public abstract boolean mo4491z(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, int i11, int i12, int i13);
}

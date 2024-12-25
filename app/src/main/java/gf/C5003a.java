package gf;

import android.graphics.Canvas;
import androidx.recyclerview.widget.C0707f;
import androidx.recyclerview.widget.RecyclerView;
import gf.C5004b;
import p235o0.C6824g0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:gf/a.class
 */
/* renamed from: gf.a */
/* loaded from: combined.jar:classes2.jar:gf/a.class */
public class C5003a extends C0707f.e {

    /* renamed from: d */
    public final a f29012d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:gf/a$a.class
     */
    /* renamed from: gf.a$a */
    /* loaded from: combined.jar:classes2.jar:gf/a$a.class */
    public interface a {
        /* renamed from: d */
        void mo25177d(int i10);

        /* renamed from: g */
        boolean mo25178g(int i10, int i11);
    }

    public C5003a(a aVar) {
        this.f29012d = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.C0707f.e
    /* renamed from: A */
    public void mo4558A(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10) {
        if (i10 != 0 && (abstractC0674e0 instanceof C5004b.e)) {
            ((C5004b.e) abstractC0674e0).mo25188b();
        }
        super.mo4558A(abstractC0674e0, i10);
    }

    @Override // androidx.recyclerview.widget.C0707f.e
    /* renamed from: B */
    public void mo4559B(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10) {
        this.f29012d.mo25177d(abstractC0674e0.m4064n());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.C0707f.e
    /* renamed from: c */
    public void mo4562c(RecyclerView recyclerView, RecyclerView.AbstractC0674e0 abstractC0674e0) {
        super.mo4562c(recyclerView, abstractC0674e0);
        if (abstractC0674e0 instanceof C5004b.e) {
            ((C5004b.e) abstractC0674e0).mo25187a();
        }
    }

    @Override // androidx.recyclerview.widget.C0707f.e
    /* renamed from: k */
    public int mo4569k(RecyclerView recyclerView, RecyclerView.AbstractC0674e0 abstractC0674e0) {
        return C0707f.e.m4557t(3, 32);
    }

    @Override // androidx.recyclerview.widget.C0707f.e
    /* renamed from: q */
    public boolean mo4575q() {
        return true;
    }

    @Override // androidx.recyclerview.widget.C0707f.e
    /* renamed from: r */
    public boolean mo4576r() {
        return true;
    }

    @Override // androidx.recyclerview.widget.C0707f.e
    /* renamed from: u */
    public void mo4577u(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC0674e0 abstractC0674e0, float f10, float f11, int i10, boolean z10) {
        if (i10 != 1) {
            super.mo4577u(canvas, recyclerView, abstractC0674e0, f10, f11, i10, z10);
        } else if (abstractC0674e0 instanceof C5004b.g) {
            C6824g0.m31482G0(((C5004b.g) abstractC0674e0).f29024B, f10);
        }
    }

    @Override // androidx.recyclerview.widget.C0707f.e
    /* renamed from: y */
    public boolean mo4581y(RecyclerView recyclerView, RecyclerView.AbstractC0674e0 abstractC0674e0, RecyclerView.AbstractC0674e0 abstractC0674e02) {
        if (abstractC0674e0.m4067q() != abstractC0674e02.m4067q()) {
            return false;
        }
        this.f29012d.mo25178g(abstractC0674e0.m4064n(), abstractC0674e02.m4064n());
        return true;
    }
}

package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/recyclerview/widget/q.class
 */
/* renamed from: androidx.recyclerview.widget.q */
/* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/q.class */
public abstract class AbstractC0718q extends RecyclerView.AbstractC0688s {

    /* renamed from: a */
    public RecyclerView f4962a;

    /* renamed from: b */
    public Scroller f4963b;

    /* renamed from: c */
    public final RecyclerView.AbstractC0690u f4964c = new a(this);

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/q$a.class
     */
    /* renamed from: androidx.recyclerview.widget.q$a */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/q$a.class */
    public class a extends RecyclerView.AbstractC0690u {

        /* renamed from: a */
        public boolean f4965a = false;

        /* renamed from: b */
        public final AbstractC0718q f4966b;

        public a(AbstractC0718q abstractC0718q) {
            this.f4966b = abstractC0718q;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0690u
        /* renamed from: a */
        public void mo4258a(RecyclerView recyclerView, int i10) {
            super.mo4258a(recyclerView, i10);
            if (i10 == 0 && this.f4965a) {
                this.f4965a = false;
                this.f4966b.m4675j();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0690u
        /* renamed from: b */
        public void mo4259b(RecyclerView recyclerView, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f4965a = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (java.lang.Math.abs(r6) > r0) goto L14;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0688s
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo4254a(int r6, int r7) {
        /*
            r5 = this;
            r0 = r5
            androidx.recyclerview.widget.RecyclerView r0 = r0.f4962a
            androidx.recyclerview.widget.RecyclerView$p r0 = r0.getLayoutManager()
            r11 = r0
            r0 = 0
            r10 = r0
            r0 = r11
            if (r0 != 0) goto L13
            r0 = 0
            return r0
        L13:
            r0 = r5
            androidx.recyclerview.widget.RecyclerView r0 = r0.f4962a
            androidx.recyclerview.widget.RecyclerView$h r0 = r0.getAdapter()
            if (r0 != 0) goto L1f
            r0 = 0
            return r0
        L1f:
            r0 = r5
            androidx.recyclerview.widget.RecyclerView r0 = r0.f4962a
            int r0 = r0.getMinFlingVelocity()
            r8 = r0
            r0 = r7
            int r0 = java.lang.Math.abs(r0)
            r1 = r8
            if (r0 > r1) goto L3b
            r0 = r10
            r9 = r0
            r0 = r6
            int r0 = java.lang.Math.abs(r0)
            r1 = r8
            if (r0 <= r1) goto L4d
        L3b:
            r0 = r10
            r9 = r0
            r0 = r5
            r1 = r11
            r2 = r6
            r3 = r7
            boolean r0 = r0.m4674i(r1, r2, r3)
            if (r0 == 0) goto L4d
            r0 = 1
            r9 = r0
        L4d:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.AbstractC0718q.mo4254a(int, int):boolean");
    }

    /* renamed from: b */
    public void m4671b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4962a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m4672e();
        }
        this.f4962a = recyclerView;
        if (recyclerView != null) {
            m4673h();
            this.f4963b = new Scroller(this.f4962a.getContext(), new DecelerateInterpolator());
            m4675j();
        }
    }

    /* renamed from: c */
    public abstract int[] mo4630c(RecyclerView.AbstractC0685p abstractC0685p, View view);

    /* renamed from: d */
    public abstract RecyclerView.AbstractC0666a0 mo4631d(RecyclerView.AbstractC0685p abstractC0685p);

    /* renamed from: e */
    public final void m4672e() {
        this.f4962a.m3929e1(this.f4964c);
        this.f4962a.setOnFlingListener(null);
    }

    /* renamed from: f */
    public abstract View mo4632f(RecyclerView.AbstractC0685p abstractC0685p);

    /* renamed from: g */
    public abstract int mo4633g(RecyclerView.AbstractC0685p abstractC0685p, int i10, int i11);

    /* renamed from: h */
    public final void m4673h() {
        if (this.f4962a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f4962a.m3945l(this.f4964c);
        this.f4962a.setOnFlingListener(this);
    }

    /* renamed from: i */
    public final boolean m4674i(RecyclerView.AbstractC0685p abstractC0685p, int i10, int i11) {
        RecyclerView.AbstractC0666a0 mo4631d;
        int mo4633g;
        if (!(abstractC0685p instanceof RecyclerView.AbstractC0666a0.b) || (mo4631d = mo4631d(abstractC0685p)) == null || (mo4633g = mo4633g(abstractC0685p, i10, i11)) == -1) {
            return false;
        }
        mo4631d.m3999p(mo4633g);
        abstractC0685p.mo2803h2(mo4631d);
        return true;
    }

    /* renamed from: j */
    public void m4675j() {
        RecyclerView.AbstractC0685p layoutManager;
        View mo4632f;
        RecyclerView recyclerView = this.f4962a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (mo4632f = mo4632f(layoutManager)) == null) {
            return;
        }
        int[] mo4630c = mo4630c(layoutManager, mo4632f);
        int i10 = mo4630c[0];
        if (i10 == 0 && mo4630c[1] == 0) {
            return;
        }
        this.f4962a.m3964r1(i10, mo4630c[1]);
    }
}

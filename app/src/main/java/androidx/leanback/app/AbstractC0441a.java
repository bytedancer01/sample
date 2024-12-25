package androidx.leanback.app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.leanback.widget.AbstractC0494a0;
import androidx.leanback.widget.AbstractC0503d0;
import androidx.leanback.widget.AbstractC0521k0;
import androidx.leanback.widget.C0542u;
import androidx.leanback.widget.VerticalGridView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/app/a.class
 */
/* renamed from: androidx.leanback.app.a */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/app/a.class */
public abstract class AbstractC0441a extends Fragment {

    /* renamed from: b */
    public AbstractC0494a0 f3106b;

    /* renamed from: c */
    public VerticalGridView f3107c;

    /* renamed from: d */
    public AbstractC0521k0 f3108d;

    /* renamed from: g */
    public boolean f3111g;

    /* renamed from: e */
    public final C0542u f3109e = new C0542u();

    /* renamed from: f */
    public int f3110f = -1;

    /* renamed from: h */
    public b f3112h = new b(this);

    /* renamed from: i */
    public final AbstractC0503d0 f3113i = new a(this);

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/app/a$a.class
     */
    /* renamed from: androidx.leanback.app.a$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/app/a$a.class */
    public class a extends AbstractC0503d0 {

        /* renamed from: a */
        public final AbstractC0441a f3114a;

        public a(AbstractC0441a abstractC0441a) {
            this.f3114a = abstractC0441a;
        }

        @Override // androidx.leanback.widget.AbstractC0503d0
        /* renamed from: a */
        public void mo2417a(RecyclerView recyclerView, RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, int i11) {
            AbstractC0441a abstractC0441a = this.f3114a;
            if (abstractC0441a.f3112h.f3115a) {
                return;
            }
            abstractC0441a.f3110f = i10;
            abstractC0441a.mo2414w(recyclerView, abstractC0674e0, i10, i11);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/app/a$b.class
     */
    /* renamed from: androidx.leanback.app.a$b */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/app/a$b.class */
    public class b extends RecyclerView.AbstractC0679j {

        /* renamed from: a */
        public boolean f3115a = false;

        /* renamed from: b */
        public final AbstractC0441a f3116b;

        public b(AbstractC0441a abstractC0441a) {
            this.f3116b = abstractC0441a;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0679j
        /* renamed from: a */
        public void mo2418a() {
            m2420g();
        }

        /* renamed from: f */
        public void m2419f() {
            if (this.f3115a) {
                this.f3115a = false;
                this.f3116b.f3109e.m4092Z(this);
            }
        }

        /* renamed from: g */
        public void m2420g() {
            m2419f();
            AbstractC0441a abstractC0441a = this.f3116b;
            VerticalGridView verticalGridView = abstractC0441a.f3107c;
            if (verticalGridView != null) {
                verticalGridView.setSelectedPosition(abstractC0441a.f3110f);
            }
        }

        /* renamed from: h */
        public void m2421h() {
            this.f3115a = true;
            this.f3116b.f3109e.m4090U(this);
        }
    }

    /* renamed from: A */
    public void m2404A() {
        if (this.f3106b == null) {
            return;
        }
        RecyclerView.AbstractC0677h adapter = this.f3107c.getAdapter();
        C0542u c0542u = this.f3109e;
        if (adapter != c0542u) {
            this.f3107c.setAdapter(c0542u);
        }
        if (this.f3109e.mo3013n() == 0 && this.f3110f >= 0) {
            this.f3112h.m2421h();
            return;
        }
        int i10 = this.f3110f;
        if (i10 >= 0) {
            this.f3107c.setSelectedPosition(i10);
        }
    }

    /* renamed from: B */
    public void mo2405B(int i10) {
        mo2406E(i10, true);
    }

    /* renamed from: E */
    public void mo2406E(int i10, boolean z10) {
        if (this.f3110f == i10) {
            return;
        }
        this.f3110f = i10;
        VerticalGridView verticalGridView = this.f3107c;
        if (verticalGridView == null || this.f3112h.f3115a) {
            return;
        }
        if (z10) {
            verticalGridView.setSelectedPositionSmooth(i10);
        } else {
            verticalGridView.setSelectedPosition(i10);
        }
    }

    /* renamed from: F */
    public void mo2407F() {
        this.f3109e.m3011l0(this.f3106b);
        this.f3109e.m3015o0(this.f3108d);
        if (this.f3107c != null) {
            m2404A();
        }
    }

    /* renamed from: m */
    public abstract VerticalGridView mo2408m(View view);

    /* renamed from: n */
    public final AbstractC0494a0 m2409n() {
        return this.f3106b;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(mo2411q(), viewGroup, false);
        this.f3107c = mo2408m(inflate);
        if (this.f3111g) {
            this.f3111g = false;
            mo2415x();
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f3112h.m2419f();
        this.f3107c = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("currentSelectedPosition", this.f3110f);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        if (bundle != null) {
            this.f3110f = bundle.getInt("currentSelectedPosition", -1);
        }
        m2404A();
        this.f3107c.setOnChildViewHolderSelectedListener(this.f3113i);
    }

    /* renamed from: p */
    public final C0542u m2410p() {
        return this.f3109e;
    }

    /* renamed from: q */
    public abstract int mo2411q();

    /* renamed from: s */
    public int mo2412s() {
        return this.f3110f;
    }

    /* renamed from: u */
    public final VerticalGridView m2413u() {
        return this.f3107c;
    }

    /* renamed from: w */
    public abstract void mo2414w(RecyclerView recyclerView, RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, int i11);

    /* renamed from: x */
    public boolean mo2415x() {
        VerticalGridView verticalGridView = this.f3107c;
        if (verticalGridView == null) {
            this.f3111g = true;
            return false;
        }
        verticalGridView.setAnimateChildLayout(false);
        this.f3107c.setScrollEnabled(false);
        return true;
    }

    /* renamed from: y */
    public final void m2416y(AbstractC0494a0 abstractC0494a0) {
        if (this.f3106b != abstractC0494a0) {
            this.f3106b = abstractC0494a0;
            mo2407F();
        }
    }
}

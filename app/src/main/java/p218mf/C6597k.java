package p218mf;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.AbstractC0428n;
import androidx.fragment.app.AbstractC0433s;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0414d;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.exoplayer2.p048ui.TrackSelectionView;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p009a8.C0083a1;
import p049d.DialogC4281g;
import p059d9.C4349a;
import p421y8.AbstractC9886j;
import p421y8.C9882f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:mf/k.class
 */
/* renamed from: mf.k */
/* loaded from: combined.jar:classes2.jar:mf/k.class */
public final class C6597k extends DialogInterfaceOnCancelListenerC0414d {

    /* renamed from: r */
    public final SparseArray<b> f34456r = new SparseArray<>();

    /* renamed from: s */
    public final ArrayList<Integer> f34457s = new ArrayList<>();

    /* renamed from: t */
    public int f34458t;

    /* renamed from: u */
    public DialogInterface.OnClickListener f34459u;

    /* renamed from: v */
    public DialogInterface.OnDismissListener f34460v;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mf/k$a.class
     */
    /* renamed from: mf.k$a */
    /* loaded from: combined.jar:classes2.jar:mf/k$a.class */
    public final class a extends AbstractC0433s {

        /* renamed from: h */
        public final C6597k f34461h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @SuppressLint({"WrongConstant"})
        public a(C6597k c6597k, AbstractC0428n abstractC0428n) {
            super(abstractC0428n, 1);
            this.f34461h = c6597k;
        }

        @Override // p052d2.AbstractC4300a
        /* renamed from: c */
        public int mo21760c() {
            return this.f34461h.f34456r.size();
        }

        @Override // p052d2.AbstractC4300a
        /* renamed from: e */
        public CharSequence mo21762e(int i10) {
            return C6597k.m30465f0(this.f34461h.getResources(), ((Integer) this.f34461h.f34457s.get(i10)).intValue());
        }

        @Override // androidx.fragment.app.AbstractC0433s
        /* renamed from: p */
        public Fragment mo2308p(int i10) {
            return (Fragment) this.f34461h.f34456r.valueAt(i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mf/k$b.class
     */
    /* renamed from: mf.k$b */
    /* loaded from: combined.jar:classes2.jar:mf/k$b.class */
    public static final class b extends Fragment implements TrackSelectionView.InterfaceC2394d {

        /* renamed from: b */
        public AbstractC9886j.a f34462b;

        /* renamed from: c */
        public int f34463c;

        /* renamed from: d */
        public boolean f34464d;

        /* renamed from: e */
        public boolean f34465e;

        /* renamed from: f */
        public boolean f34466f;

        /* renamed from: g */
        public List<C9882f.f> f34467g;

        public b() {
            setRetainInstance(true);
        }

        @Override // com.google.android.exoplayer2.p048ui.TrackSelectionView.InterfaceC2394d
        /* renamed from: g */
        public void mo12611g(boolean z10, List<C9882f.f> list) {
            this.f34466f = z10;
            this.f34467g = list;
        }

        /* renamed from: m */
        public void m30474m(AbstractC9886j.a aVar, int i10, boolean z10, C9882f.f fVar, boolean z11, boolean z12) {
            this.f34462b = aVar;
            this.f34463c = i10;
            this.f34466f = z10;
            this.f34467g = fVar == null ? Collections.emptyList() : Collections.singletonList(fVar);
            this.f34464d = z11;
            this.f34465e = z12;
        }

        @Override // androidx.fragment.app.Fragment
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View inflate = layoutInflater.inflate(2131624206, viewGroup, false);
            TrackSelectionView trackSelectionView = (TrackSelectionView) inflate.findViewById(2131427984);
            trackSelectionView.setShowDisableOption(true);
            trackSelectionView.setAllowMultipleOverrides(this.f34465e);
            trackSelectionView.setAllowAdaptiveSelections(this.f34464d);
            trackSelectionView.m12603e(this.f34462b, this.f34463c, this.f34466f, this.f34467g, null, this);
            return inflate;
        }
    }

    public C6597k() {
        setRetainInstance(true);
    }

    /* renamed from: Y */
    public static C6597k m30463Y(int i10, AbstractC9886j.a aVar, C9882f.d dVar, boolean z10, boolean z11, DialogInterface.OnClickListener onClickListener, DialogInterface.OnDismissListener onDismissListener) {
        C6597k c6597k = new C6597k();
        c6597k.m30473g0(i10, aVar, dVar, z10, z11, onClickListener, onDismissListener);
        return c6597k;
    }

    /* renamed from: Z */
    public static C6597k m30464Z(final C9882f c9882f, DialogInterface.OnDismissListener onDismissListener) {
        final AbstractC9886j.a aVar = (AbstractC9886j.a) C4349a.m21882e(c9882f.m41705g());
        final C6597k c6597k = new C6597k();
        final C9882f.d m41646u = c9882f.m41646u();
        c6597k.m30473g0(2132018715, aVar, m41646u, true, false, new DialogInterface.OnClickListener(m41646u, aVar, c6597k, c9882f) { // from class: mf.j

            /* renamed from: b */
            public final C9882f.d f34452b;

            /* renamed from: c */
            public final AbstractC9886j.a f34453c;

            /* renamed from: d */
            public final C6597k f34454d;

            /* renamed from: e */
            public final C9882f f34455e;

            {
                this.f34452b = m41646u;
                this.f34453c = aVar;
                this.f34454d = c6597k;
                this.f34455e = c9882f;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                C6597k.m30467i0(this.f34452b, this.f34453c, this.f34454d, this.f34455e, dialogInterface, i10);
            }
        }, onDismissListener);
        return c6597k;
    }

    /* renamed from: f0 */
    public static String m30465f0(Resources resources, int i10) {
        int i11;
        if (i10 == 1) {
            i11 = 2132017747;
        } else if (i10 == 2) {
            i11 = 2132017749;
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException();
            }
            i11 = 2132017748;
        }
        return resources.getString(i11);
    }

    /* renamed from: h0 */
    public static boolean m30466h0(int i10) {
        return i10 == 1 || i10 == 2 || i10 == 3;
    }

    /* renamed from: i0 */
    public static /* synthetic */ void m30467i0(C9882f.d dVar, AbstractC9886j.a aVar, C6597k c6597k, C9882f c9882f, DialogInterface dialogInterface, int i10) {
        C9882f.e m41657m = dVar.m41657m();
        for (int i11 = 0; i11 < aVar.m41708c(); i11++) {
            m41657m.m41680Q(i11).m41685W(i11, c6597k.m30471d0(i11));
            List<C9882f.f> m30472e0 = c6597k.m30472e0(i11);
            if (!m30472e0.isEmpty()) {
                m41657m.m41686X(i11, aVar.m41712g(i11), m30472e0.get(0));
            }
        }
        c9882f.m41644M(m41657m);
    }

    /* renamed from: j0 */
    public static boolean m30468j0(AbstractC9886j.a aVar, int i10) {
        if (aVar.m41712g(i10).f261b == 0) {
            return false;
        }
        return m30466h0(aVar.m41711f(i10));
    }

    /* renamed from: k0 */
    public static boolean m30469k0(C9882f c9882f) {
        AbstractC9886j.a m41705g = c9882f.m41705g();
        return m41705g != null && m30470l0(m41705g);
    }

    /* renamed from: l0 */
    public static boolean m30470l0(AbstractC9886j.a aVar) {
        for (int i10 = 0; i10 < aVar.m41708c(); i10++) {
            if (m30468j0(aVar, i10)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$1(View view) {
        m2025q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$2(View view) {
        this.f34459u.onClick(m2027u(), -1);
        m2025q();
    }

    /* renamed from: d0 */
    public boolean m30471d0(int i10) {
        b bVar = this.f34456r.get(i10);
        return bVar != null && bVar.f34466f;
    }

    /* renamed from: e0 */
    public List<C9882f.f> m30472e0(int i10) {
        b bVar = this.f34456r.get(i10);
        return bVar == null ? Collections.emptyList() : bVar.f34467g;
    }

    /* renamed from: g0 */
    public final void m30473g0(int i10, AbstractC9886j.a aVar, C9882f.d dVar, boolean z10, boolean z11, DialogInterface.OnClickListener onClickListener, DialogInterface.OnDismissListener onDismissListener) {
        this.f34458t = i10;
        this.f34459u = onClickListener;
        this.f34460v = onDismissListener;
        for (int i11 = 0; i11 < aVar.m41708c(); i11++) {
            if (m30468j0(aVar, i11)) {
                int m41711f = aVar.m41711f(i11);
                C0083a1 m41712g = aVar.m41712g(i11);
                b bVar = new b();
                bVar.m30474m(aVar, i11, dVar.m41658o(i11), dVar.m41659p(i11, m41712g), z10, z11);
                this.f34456r.put(i11, bVar);
                this.f34457s.add(Integer.valueOf(m41711f));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = 0;
        View inflate = layoutInflater.inflate(2131624547, viewGroup, false);
        TabLayout tabLayout = (TabLayout) inflate.findViewById(2131429330);
        ViewPager viewPager = (ViewPager) inflate.findViewById(2131429331);
        Button button = (Button) inflate.findViewById(2131429328);
        Button button2 = (Button) inflate.findViewById(2131429329);
        viewPager.setAdapter(new a(this, getChildFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
        if (this.f34456r.size() <= 1) {
            i10 = 8;
        }
        tabLayout.setVisibility(i10);
        button.setOnClickListener(new View.OnClickListener(this) { // from class: mf.h

            /* renamed from: b */
            public final C6597k f34450b;

            {
                this.f34450b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34450b.lambda$onCreateView$1(view);
            }
        });
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: mf.i

            /* renamed from: b */
            public final C6597k f34451b;

            {
                this.f34451b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34451b.lambda$onCreateView$2(view);
            }
        });
        return inflate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0414d, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.f34460v.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0414d
    /* renamed from: x */
    public Dialog mo2029x(Bundle bundle) {
        DialogC4281g dialogC4281g = new DialogC4281g(getActivity(), 2132083440);
        dialogC4281g.setTitle(this.f34458t);
        return dialogC4281g;
    }
}

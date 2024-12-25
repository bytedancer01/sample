package com.maxdigitall.maxdigitaliptvbox.view.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.google.android.material.tabs.TabLayout;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import java.util.ArrayList;
import p203lf.C5863p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalCotrolFragment.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalCotrolFragment.class */
public class ParentalCotrolFragment extends Fragment {

    /* renamed from: b */
    public Unbinder f22272b;

    /* renamed from: c */
    public Context f22273c;

    /* renamed from: d */
    public ArrayList<Integer> f22274d = new ArrayList<>();

    /* renamed from: e */
    public Typeface f22275e;

    /* renamed from: f */
    public Typeface f22276f;

    /* renamed from: g */
    public String f22277g;

    /* renamed from: h */
    public String f22278h;

    /* renamed from: i */
    public InterfaceC3711b f22279i;

    @BindView
    public ImageView ivLine;

    @BindView
    public View lineBelowTabs;

    @BindView
    public ViewPager pager;

    @BindView
    public RelativeLayout rlMyInvoices;

    @BindView
    public TabLayout tabLayoutInvoices;

    @BindView
    public TextView tvMyInvoices;

    @BindView
    public View viewLineMyInvoices;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalCotrolFragment$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalCotrolFragment$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalCotrolFragment$a.class */
    public class C3710a implements TabLayout.InterfaceC2517d {

        /* renamed from: a */
        public final C5863p f22280a;

        /* renamed from: b */
        public final ParentalCotrolFragment f22281b;

        public C3710a(ParentalCotrolFragment parentalCotrolFragment, C5863p c5863p) {
            this.f22281b = parentalCotrolFragment;
            this.f22280a = c5863p;
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC2516c
        /* renamed from: a */
        public void mo13956a(TabLayout.C2520g c2520g) {
            this.f22281b.pager.setCurrentItem(c2520g.m13973g());
            int m13973g = c2520g.m13973g();
            View m13971e = c2520g.m13971e();
            if (m13973g == 0) {
                this.f22280a.m28572r(m13971e, this.f22281b.f22275e, m13973g);
                return;
            }
            if (m13973g == 1 || m13973g == 2) {
                this.f22280a.m28574t(m13971e, this.f22281b.f22275e, m13973g);
            } else {
                if (m13973g != 3) {
                    return;
                }
                this.f22280a.m28573s(m13971e, this.f22281b.f22275e);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC2516c
        /* renamed from: b */
        public void mo13957b(TabLayout.C2520g c2520g) {
            int m13973g = c2520g.m13973g();
            View m13971e = c2520g.m13971e();
            if (m13973g == 0) {
                this.f22280a.m28578x(m13971e, this.f22281b.f22276f);
                return;
            }
            if (m13973g == 1 || m13973g == 2) {
                this.f22280a.m28577w(m13971e, this.f22281b.f22276f);
            } else {
                if (m13973g != 3) {
                    return;
                }
                this.f22280a.m28579y(m13971e, this.f22281b.f22276f);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC2516c
        /* renamed from: c */
        public void mo13958c(TabLayout.C2520g c2520g) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalCotrolFragment$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalCotrolFragment$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalCotrolFragment$b.class */
    public interface InterfaceC3711b {
    }

    /* renamed from: m */
    public final void m18118m() {
        this.f22273c = getContext();
        getActivity().getSharedPreferences("loginPrefs", 0);
        m18119n();
    }

    /* renamed from: n */
    public final void m18119n() {
        TabLayout tabLayout;
        TabLayout.C2520g m13954z;
        Resources resources;
        int i10;
        String m15373f = SharepreferenceDBHandler.m15373f(this.f22273c);
        if (m15373f.equals("m3u")) {
            tabLayout = this.tabLayoutInvoices;
            m13954z = tabLayout.m13954z();
            resources = this.f22273c.getResources();
            i10 = 2132017297;
        } else {
            TabLayout tabLayout2 = this.tabLayoutInvoices;
            tabLayout2.m13934e(tabLayout2.m13954z().m13984r(getResources().getString(2132017450)));
            TabLayout tabLayout3 = this.tabLayoutInvoices;
            tabLayout3.m13934e(tabLayout3.m13954z().m13984r(getResources().getString(2132018785)));
            TabLayout tabLayout4 = this.tabLayoutInvoices;
            tabLayout4.m13934e(tabLayout4.m13954z().m13984r(getResources().getString(2132018547)));
            tabLayout = this.tabLayoutInvoices;
            m13954z = tabLayout.m13954z();
            resources = getResources();
            i10 = 2132018431;
        }
        tabLayout.m13934e(m13954z.m13984r(resources.getString(i10)));
        TabLayout tabLayout5 = this.tabLayoutInvoices;
        tabLayout5.m13934e(tabLayout5.m13954z().m13984r(getResources().getString(2132018750)));
        this.tabLayoutInvoices.setTabGravity(0);
        C5863p c5863p = new C5863p(getChildFragmentManager(), this.tabLayoutInvoices.getTabCount(), getContext(), this.f22274d, m15373f);
        this.pager.setAdapter(c5863p);
        this.tabLayoutInvoices.setupWithViewPager(this.pager);
        for (int i11 = 0; i11 < this.tabLayoutInvoices.getTabCount(); i11++) {
            this.tabLayoutInvoices.m13952x(i11).m13981o(c5863p.m28571q(i11));
        }
        View m13971e = this.tabLayoutInvoices.m13952x(0).m13971e();
        View m13971e2 = this.tabLayoutInvoices.m13952x(1).m13971e();
        c5863p.m28575u(m13971e, this.f22275e);
        c5863p.m28576v(m13971e2, this.f22275e);
        this.pager.setCurrentItem(0);
        this.pager.m4768c(new TabLayout.C2521h(this.tabLayoutInvoices));
        this.tabLayoutInvoices.m13933d(new C3710a(this, c5863p));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof InterfaceC3711b) {
            this.f22279i = (InterfaceC3711b) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f22277g = getArguments().getString("param1");
            this.f22278h = getArguments().getString("param2");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(2131624217, viewGroup, false);
        this.f22272b = ButterKnife.m5627b(this, inflate);
        m18118m();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f22279i = null;
    }
}

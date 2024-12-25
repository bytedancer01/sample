package com.maxdigitall.maxdigitaliptvbox.view.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import com.google.android.material.tabs.TabLayout;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalCotrolFragment_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalCotrolFragment_ViewBinding.class */
public class ParentalCotrolFragment_ViewBinding implements Unbinder {

    /* renamed from: b */
    public ParentalCotrolFragment f22282b;

    public ParentalCotrolFragment_ViewBinding(ParentalCotrolFragment parentalCotrolFragment, View view) {
        this.f22282b = parentalCotrolFragment;
        parentalCotrolFragment.ivLine = (ImageView) C8522c.m36739c(view, 2131428189, "field 'ivLine'", ImageView.class);
        parentalCotrolFragment.tvMyInvoices = (TextView) C8522c.m36739c(view, 2131429522, "field 'tvMyInvoices'", TextView.class);
        parentalCotrolFragment.viewLineMyInvoices = C8522c.m36738b(view, 2131429680, "field 'viewLineMyInvoices'");
        parentalCotrolFragment.tabLayoutInvoices = (TabLayout) C8522c.m36739c(view, 2131429255, "field 'tabLayoutInvoices'", TabLayout.class);
        parentalCotrolFragment.lineBelowTabs = C8522c.m36738b(view, 2131428298, "field 'lineBelowTabs'");
        parentalCotrolFragment.pager = (ViewPager) C8522c.m36739c(view, 2131428809, "field 'pager'", ViewPager.class);
        parentalCotrolFragment.rlMyInvoices = (RelativeLayout) C8522c.m36739c(view, 2131429017, "field 'rlMyInvoices'", RelativeLayout.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        ParentalCotrolFragment parentalCotrolFragment = this.f22282b;
        if (parentalCotrolFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f22282b = null;
        parentalCotrolFragment.ivLine = null;
        parentalCotrolFragment.tvMyInvoices = null;
        parentalCotrolFragment.viewLineMyInvoices = null;
        parentalCotrolFragment.tabLayoutInvoices = null;
        parentalCotrolFragment.lineBelowTabs = null;
        parentalCotrolFragment.pager = null;
        parentalCotrolFragment.rlMyInvoices = null;
    }
}

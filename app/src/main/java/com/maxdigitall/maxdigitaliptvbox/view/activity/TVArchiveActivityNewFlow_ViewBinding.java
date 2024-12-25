package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityNewFlow_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityNewFlow_ViewBinding.class */
public class TVArchiveActivityNewFlow_ViewBinding implements Unbinder {

    /* renamed from: b */
    public TVArchiveActivityNewFlow f19080b;

    public TVArchiveActivityNewFlow_ViewBinding(TVArchiveActivityNewFlow tVArchiveActivityNewFlow, View view) {
        this.f19080b = tVArchiveActivityNewFlow;
        tVArchiveActivityNewFlow.pbLoader = (ProgressBar) C8522c.m36739c(view, 2131428830, "field 'pbLoader'", ProgressBar.class);
        tVArchiveActivityNewFlow.viewpager = (ViewPager) C8522c.m36739c(view, 2131429685, "field 'viewpager'", ViewPager.class);
        tVArchiveActivityNewFlow.toolbar = (Toolbar) C8522c.m36739c(view, 2131429320, "field 'toolbar'", Toolbar.class);
        tVArchiveActivityNewFlow.appbarToolbar = (AppBarLayout) C8522c.m36739c(view, 2131427548, "field 'appbarToolbar'", AppBarLayout.class);
        tVArchiveActivityNewFlow.pbPagingLoader = (ProgressBar) C8522c.m36739c(view, 2131428840, "field 'pbPagingLoader'", ProgressBar.class);
        tVArchiveActivityNewFlow.myRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131428747, "field 'myRecyclerView'", RecyclerView.class);
        tVArchiveActivityNewFlow.emptyView = (TextView) C8522c.m36739c(view, 2131427887, "field 'emptyView'", TextView.class);
        tVArchiveActivityNewFlow.frameLayout = (FrameLayout) C8522c.m36739c(view, 2131428025, "field 'frameLayout'", FrameLayout.class);
        tVArchiveActivityNewFlow.ivBTUP = (ImageView) C8522c.m36739c(view, 2131428153, "field 'ivBTUP'", ImageView.class);
        tVArchiveActivityNewFlow.tvNoStream = (TextView) C8522c.m36739c(view, 2131429535, "field 'tvNoStream'", TextView.class);
        tVArchiveActivityNewFlow.tvNoRecordFound = (TextView) C8522c.m36739c(view, 2131429538, "field 'tvNoRecordFound'", TextView.class);
        tVArchiveActivityNewFlow.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
        tVArchiveActivityNewFlow.iv_back_button = (ImageView) C8522c.m36739c(view, 2131428145, "field 'iv_back_button'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        TVArchiveActivityNewFlow tVArchiveActivityNewFlow = this.f19080b;
        if (tVArchiveActivityNewFlow == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f19080b = null;
        tVArchiveActivityNewFlow.pbLoader = null;
        tVArchiveActivityNewFlow.viewpager = null;
        tVArchiveActivityNewFlow.toolbar = null;
        tVArchiveActivityNewFlow.appbarToolbar = null;
        tVArchiveActivityNewFlow.pbPagingLoader = null;
        tVArchiveActivityNewFlow.myRecyclerView = null;
        tVArchiveActivityNewFlow.emptyView = null;
        tVArchiveActivityNewFlow.frameLayout = null;
        tVArchiveActivityNewFlow.ivBTUP = null;
        tVArchiveActivityNewFlow.tvNoStream = null;
        tVArchiveActivityNewFlow.tvNoRecordFound = null;
        tVArchiveActivityNewFlow.logo = null;
        tVArchiveActivityNewFlow.iv_back_button = null;
    }
}

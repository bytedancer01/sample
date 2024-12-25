package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityLayout_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivityLayout_ViewBinding.class */
public class TVArchiveActivityLayout_ViewBinding implements Unbinder {

    /* renamed from: b */
    public TVArchiveActivityLayout f19022b;

    public TVArchiveActivityLayout_ViewBinding(TVArchiveActivityLayout tVArchiveActivityLayout, View view) {
        this.f19022b = tVArchiveActivityLayout;
        tVArchiveActivityLayout.toolbar = (Toolbar) C8522c.m36739c(view, 2131429320, "field 'toolbar'", Toolbar.class);
        tVArchiveActivityLayout.appbarToolbar = (AppBarLayout) C8522c.m36739c(view, 2131427548, "field 'appbarToolbar'", AppBarLayout.class);
        tVArchiveActivityLayout.pbLoader = (ProgressBar) C8522c.m36739c(view, 2131428830, "field 'pbLoader'", ProgressBar.class);
        tVArchiveActivityLayout.myRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131428747, "field 'myRecyclerView'", RecyclerView.class);
        tVArchiveActivityLayout.tvNoStream = (TextView) C8522c.m36739c(view, 2131429535, "field 'tvNoStream'", TextView.class);
        tVArchiveActivityLayout.tvNoRecordFound = (TextView) C8522c.m36739c(view, 2131429538, "field 'tvNoRecordFound'", TextView.class);
        tVArchiveActivityLayout.tvViewProvider = (TextView) C8522c.m36739c(view, 2131429636, "field 'tvViewProvider'", TextView.class);
        tVArchiveActivityLayout.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
        tVArchiveActivityLayout.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        tVArchiveActivityLayout.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
        tVArchiveActivityLayout.iv_back_button = (ImageView) C8522c.m36739c(view, 2131428145, "field 'iv_back_button'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        TVArchiveActivityLayout tVArchiveActivityLayout = this.f19022b;
        if (tVArchiveActivityLayout == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f19022b = null;
        tVArchiveActivityLayout.toolbar = null;
        tVArchiveActivityLayout.appbarToolbar = null;
        tVArchiveActivityLayout.pbLoader = null;
        tVArchiveActivityLayout.myRecyclerView = null;
        tVArchiveActivityLayout.tvNoStream = null;
        tVArchiveActivityLayout.tvNoRecordFound = null;
        tVArchiveActivityLayout.tvViewProvider = null;
        tVArchiveActivityLayout.date = null;
        tVArchiveActivityLayout.time = null;
        tVArchiveActivityLayout.logo = null;
        tVArchiveActivityLayout.iv_back_button = null;
    }
}

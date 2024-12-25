package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivitNewFlowSubCat_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivitNewFlowSubCat_ViewBinding.class */
public class SeriesActivitNewFlowSubCat_ViewBinding implements Unbinder {

    /* renamed from: b */
    public SeriesActivitNewFlowSubCat f18249b;

    public SeriesActivitNewFlowSubCat_ViewBinding(SeriesActivitNewFlowSubCat seriesActivitNewFlowSubCat, View view) {
        this.f18249b = seriesActivitNewFlowSubCat;
        seriesActivitNewFlowSubCat.toolbar = (Toolbar) C8522c.m36739c(view, 2131429320, "field 'toolbar'", Toolbar.class);
        seriesActivitNewFlowSubCat.appbarToolbar = (AppBarLayout) C8522c.m36739c(view, 2131427548, "field 'appbarToolbar'", AppBarLayout.class);
        seriesActivitNewFlowSubCat.pbLoader = (ProgressBar) C8522c.m36739c(view, 2131428830, "field 'pbLoader'", ProgressBar.class);
        seriesActivitNewFlowSubCat.myRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131428747, "field 'myRecyclerView'", RecyclerView.class);
        seriesActivitNewFlowSubCat.tvNoStream = (TextView) C8522c.m36739c(view, 2131429535, "field 'tvNoStream'", TextView.class);
        seriesActivitNewFlowSubCat.tvNoRecordFound = (TextView) C8522c.m36739c(view, 2131429538, "field 'tvNoRecordFound'", TextView.class);
        seriesActivitNewFlowSubCat.tvViewProvider = (TextView) C8522c.m36739c(view, 2131429636, "field 'tvViewProvider'", TextView.class);
        seriesActivitNewFlowSubCat.vodCategoryName = (TextView) C8522c.m36739c(view, 2131429607, "field 'vodCategoryName'", TextView.class);
        seriesActivitNewFlowSubCat.rl_sub_cat = (RelativeLayout) C8522c.m36739c(view, 2131429059, "field 'rl_sub_cat'", RelativeLayout.class);
        seriesActivitNewFlowSubCat.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        SeriesActivitNewFlowSubCat seriesActivitNewFlowSubCat = this.f18249b;
        if (seriesActivitNewFlowSubCat == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f18249b = null;
        seriesActivitNewFlowSubCat.toolbar = null;
        seriesActivitNewFlowSubCat.appbarToolbar = null;
        seriesActivitNewFlowSubCat.pbLoader = null;
        seriesActivitNewFlowSubCat.myRecyclerView = null;
        seriesActivitNewFlowSubCat.tvNoStream = null;
        seriesActivitNewFlowSubCat.tvNoRecordFound = null;
        seriesActivitNewFlowSubCat.tvViewProvider = null;
        seriesActivitNewFlowSubCat.vodCategoryName = null;
        seriesActivitNewFlowSubCat.rl_sub_cat = null;
        seriesActivitNewFlowSubCat.logo = null;
    }
}

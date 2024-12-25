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
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U_ViewBinding.class */
public class SeriesActivityNewFlowSubCategoriesM3U_ViewBinding implements Unbinder {

    /* renamed from: b */
    public SeriesActivityNewFlowSubCategoriesM3U f18367b;

    public SeriesActivityNewFlowSubCategoriesM3U_ViewBinding(SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U, View view) {
        this.f18367b = seriesActivityNewFlowSubCategoriesM3U;
        seriesActivityNewFlowSubCategoriesM3U.toolbar = (Toolbar) C8522c.m36739c(view, 2131429320, "field 'toolbar'", Toolbar.class);
        seriesActivityNewFlowSubCategoriesM3U.appbarToolbar = (AppBarLayout) C8522c.m36739c(view, 2131427548, "field 'appbarToolbar'", AppBarLayout.class);
        seriesActivityNewFlowSubCategoriesM3U.pbLoader = (ProgressBar) C8522c.m36739c(view, 2131428830, "field 'pbLoader'", ProgressBar.class);
        seriesActivityNewFlowSubCategoriesM3U.myRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131428747, "field 'myRecyclerView'", RecyclerView.class);
        seriesActivityNewFlowSubCategoriesM3U.tvNoStream = (TextView) C8522c.m36739c(view, 2131429535, "field 'tvNoStream'", TextView.class);
        seriesActivityNewFlowSubCategoriesM3U.tvNoRecordFound = (TextView) C8522c.m36739c(view, 2131429538, "field 'tvNoRecordFound'", TextView.class);
        seriesActivityNewFlowSubCategoriesM3U.tvViewProvider = (TextView) C8522c.m36739c(view, 2131429636, "field 'tvViewProvider'", TextView.class);
        seriesActivityNewFlowSubCategoriesM3U.vodCategoryName = (TextView) C8522c.m36739c(view, 2131429607, "field 'vodCategoryName'", TextView.class);
        seriesActivityNewFlowSubCategoriesM3U.rl_sub_cat = (RelativeLayout) C8522c.m36739c(view, 2131429059, "field 'rl_sub_cat'", RelativeLayout.class);
        seriesActivityNewFlowSubCategoriesM3U.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U = this.f18367b;
        if (seriesActivityNewFlowSubCategoriesM3U == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f18367b = null;
        seriesActivityNewFlowSubCategoriesM3U.toolbar = null;
        seriesActivityNewFlowSubCategoriesM3U.appbarToolbar = null;
        seriesActivityNewFlowSubCategoriesM3U.pbLoader = null;
        seriesActivityNewFlowSubCategoriesM3U.myRecyclerView = null;
        seriesActivityNewFlowSubCategoriesM3U.tvNoStream = null;
        seriesActivityNewFlowSubCategoriesM3U.tvNoRecordFound = null;
        seriesActivityNewFlowSubCategoriesM3U.tvViewProvider = null;
        seriesActivityNewFlowSubCategoriesM3U.vodCategoryName = null;
        seriesActivityNewFlowSubCategoriesM3U.rl_sub_cat = null;
        seriesActivityNewFlowSubCategoriesM3U.logo = null;
    }
}

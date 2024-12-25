package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowM3U_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowM3U_ViewBinding.class */
public class SeriesActivityNewFlowM3U_ViewBinding implements Unbinder {

    /* renamed from: b */
    public SeriesActivityNewFlowM3U f18299b;

    public SeriesActivityNewFlowM3U_ViewBinding(SeriesActivityNewFlowM3U seriesActivityNewFlowM3U, View view) {
        this.f18299b = seriesActivityNewFlowM3U;
        seriesActivityNewFlowM3U.pbLoader = (ProgressBar) C8522c.m36739c(view, 2131428830, "field 'pbLoader'", ProgressBar.class);
        seriesActivityNewFlowM3U.toolbar = (Toolbar) C8522c.m36739c(view, 2131429320, "field 'toolbar'", Toolbar.class);
        seriesActivityNewFlowM3U.appbarToolbar = (AppBarLayout) C8522c.m36739c(view, 2131427548, "field 'appbarToolbar'", AppBarLayout.class);
        seriesActivityNewFlowM3U.activityLogin = (LinearLayout) C8522c.m36739c(view, 2131428570, "field 'activityLogin'", LinearLayout.class);
        seriesActivityNewFlowM3U.pbPagingLoader = (ProgressBar) C8522c.m36739c(view, 2131428840, "field 'pbPagingLoader'", ProgressBar.class);
        seriesActivityNewFlowM3U.myRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131428747, "field 'myRecyclerView'", RecyclerView.class);
        seriesActivityNewFlowM3U.tvNoRecordFound = (TextView) C8522c.m36739c(view, 2131427887, "field 'tvNoRecordFound'", TextView.class);
        seriesActivityNewFlowM3U.frameLayout = (FrameLayout) C8522c.m36739c(view, 2131428025, "field 'frameLayout'", FrameLayout.class);
        seriesActivityNewFlowM3U.home = (TextView) C8522c.m36739c(view, 2131428097, "field 'home'", TextView.class);
        seriesActivityNewFlowM3U.rl_vod_layout = (RelativeLayout) C8522c.m36739c(view, 2131429077, "field 'rl_vod_layout'", RelativeLayout.class);
        seriesActivityNewFlowM3U.tvSettings = (TextView) C8522c.m36739c(view, 2131429607, "field 'tvSettings'", TextView.class);
        seriesActivityNewFlowM3U.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
        seriesActivityNewFlowM3U.iv_back_button = (ImageView) C8522c.m36739c(view, 2131428145, "field 'iv_back_button'", ImageView.class);
        seriesActivityNewFlowM3U.rl_no_arrangement_found = (RelativeLayout) C8522c.m36739c(view, 2131429021, "field 'rl_no_arrangement_found'", RelativeLayout.class);
        seriesActivityNewFlowM3U.bt_explore_all = (Button) C8522c.m36739c(view, 2131427609, "field 'bt_explore_all'", Button.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        SeriesActivityNewFlowM3U seriesActivityNewFlowM3U = this.f18299b;
        if (seriesActivityNewFlowM3U == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f18299b = null;
        seriesActivityNewFlowM3U.pbLoader = null;
        seriesActivityNewFlowM3U.toolbar = null;
        seriesActivityNewFlowM3U.appbarToolbar = null;
        seriesActivityNewFlowM3U.activityLogin = null;
        seriesActivityNewFlowM3U.pbPagingLoader = null;
        seriesActivityNewFlowM3U.myRecyclerView = null;
        seriesActivityNewFlowM3U.tvNoRecordFound = null;
        seriesActivityNewFlowM3U.frameLayout = null;
        seriesActivityNewFlowM3U.home = null;
        seriesActivityNewFlowM3U.rl_vod_layout = null;
        seriesActivityNewFlowM3U.tvSettings = null;
        seriesActivityNewFlowM3U.logo = null;
        seriesActivityNewFlowM3U.iv_back_button = null;
        seriesActivityNewFlowM3U.rl_no_arrangement_found = null;
        seriesActivityNewFlowM3U.bt_explore_all = null;
    }
}

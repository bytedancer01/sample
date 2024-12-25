package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
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
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivtyNewFlow_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivtyNewFlow_ViewBinding.class */
public class SeriesActivtyNewFlow_ViewBinding implements Unbinder {

    /* renamed from: b */
    public SeriesActivtyNewFlow f18411b;

    public SeriesActivtyNewFlow_ViewBinding(SeriesActivtyNewFlow seriesActivtyNewFlow, View view) {
        this.f18411b = seriesActivtyNewFlow;
        seriesActivtyNewFlow.pbLoader = (ProgressBar) C8522c.m36739c(view, 2131428830, "field 'pbLoader'", ProgressBar.class);
        seriesActivtyNewFlow.toolbar = (Toolbar) C8522c.m36739c(view, 2131429320, "field 'toolbar'", Toolbar.class);
        seriesActivtyNewFlow.appbarToolbar = (AppBarLayout) C8522c.m36739c(view, 2131427548, "field 'appbarToolbar'", AppBarLayout.class);
        seriesActivtyNewFlow.activityLogin = (LinearLayout) C8522c.m36739c(view, 2131428570, "field 'activityLogin'", LinearLayout.class);
        seriesActivtyNewFlow.pbPagingLoader = (ProgressBar) C8522c.m36739c(view, 2131428840, "field 'pbPagingLoader'", ProgressBar.class);
        seriesActivtyNewFlow.myRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131428747, "field 'myRecyclerView'", RecyclerView.class);
        seriesActivtyNewFlow.tvNoRecordFound = (TextView) C8522c.m36739c(view, 2131427887, "field 'tvNoRecordFound'", TextView.class);
        seriesActivtyNewFlow.frameLayout = (FrameLayout) C8522c.m36739c(view, 2131428025, "field 'frameLayout'", FrameLayout.class);
        seriesActivtyNewFlow.home = (TextView) C8522c.m36739c(view, 2131428097, "field 'home'", TextView.class);
        seriesActivtyNewFlow.rl_vod_layout = (RelativeLayout) C8522c.m36739c(view, 2131429077, "field 'rl_vod_layout'", RelativeLayout.class);
        seriesActivtyNewFlow.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        SeriesActivtyNewFlow seriesActivtyNewFlow = this.f18411b;
        if (seriesActivtyNewFlow == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f18411b = null;
        seriesActivtyNewFlow.pbLoader = null;
        seriesActivtyNewFlow.toolbar = null;
        seriesActivtyNewFlow.appbarToolbar = null;
        seriesActivtyNewFlow.activityLogin = null;
        seriesActivtyNewFlow.pbPagingLoader = null;
        seriesActivtyNewFlow.myRecyclerView = null;
        seriesActivtyNewFlow.tvNoRecordFound = null;
        seriesActivtyNewFlow.frameLayout = null;
        seriesActivtyNewFlow.home = null;
        seriesActivtyNewFlow.rl_vod_layout = null;
        seriesActivtyNewFlow.logo = null;
    }
}

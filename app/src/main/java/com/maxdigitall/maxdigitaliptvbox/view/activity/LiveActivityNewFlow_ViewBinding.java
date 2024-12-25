package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
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
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveActivityNewFlow_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveActivityNewFlow_ViewBinding.class */
public class LiveActivityNewFlow_ViewBinding implements Unbinder {

    /* renamed from: b */
    public LiveActivityNewFlow f17459b;

    public LiveActivityNewFlow_ViewBinding(LiveActivityNewFlow liveActivityNewFlow, View view) {
        this.f17459b = liveActivityNewFlow;
        liveActivityNewFlow.pbLoader = (ProgressBar) C8522c.m36739c(view, 2131428830, "field 'pbLoader'", ProgressBar.class);
        liveActivityNewFlow.toolbar = (Toolbar) C8522c.m36739c(view, 2131429320, "field 'toolbar'", Toolbar.class);
        liveActivityNewFlow.appbarToolbar = (AppBarLayout) C8522c.m36739c(view, 2131427548, "field 'appbarToolbar'", AppBarLayout.class);
        liveActivityNewFlow.pbPagingLoader = (ProgressBar) C8522c.m36739c(view, 2131428840, "field 'pbPagingLoader'", ProgressBar.class);
        liveActivityNewFlow.myRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131428747, "field 'myRecyclerView'", RecyclerView.class);
        liveActivityNewFlow.emptyView = (TextView) C8522c.m36739c(view, 2131427887, "field 'emptyView'", TextView.class);
        liveActivityNewFlow.frameLayout = (FrameLayout) C8522c.m36739c(view, 2131428025, "field 'frameLayout'", FrameLayout.class);
        liveActivityNewFlow.ivBTUP = (ImageView) C8522c.m36739c(view, 2131428153, "field 'ivBTUP'", ImageView.class);
        liveActivityNewFlow.tvNoStream = (TextView) C8522c.m36739c(view, 2131429535, "field 'tvNoStream'", TextView.class);
        liveActivityNewFlow.tvNoRecordFound = (TextView) C8522c.m36739c(view, 2131429538, "field 'tvNoRecordFound'", TextView.class);
        liveActivityNewFlow.rl_no_arrangement_found = (RelativeLayout) C8522c.m36739c(view, 2131429021, "field 'rl_no_arrangement_found'", RelativeLayout.class);
        liveActivityNewFlow.bt_explore_all = (Button) C8522c.m36739c(view, 2131427609, "field 'bt_explore_all'", Button.class);
        liveActivityNewFlow.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        LiveActivityNewFlow liveActivityNewFlow = this.f17459b;
        if (liveActivityNewFlow == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f17459b = null;
        liveActivityNewFlow.pbLoader = null;
        liveActivityNewFlow.toolbar = null;
        liveActivityNewFlow.appbarToolbar = null;
        liveActivityNewFlow.pbPagingLoader = null;
        liveActivityNewFlow.myRecyclerView = null;
        liveActivityNewFlow.emptyView = null;
        liveActivityNewFlow.frameLayout = null;
        liveActivityNewFlow.ivBTUP = null;
        liveActivityNewFlow.tvNoStream = null;
        liveActivityNewFlow.tvNoRecordFound = null;
        liveActivityNewFlow.rl_no_arrangement_found = null;
        liveActivityNewFlow.bt_explore_all = null;
        liveActivityNewFlow.logo = null;
    }
}

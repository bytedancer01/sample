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
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlow_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlow_ViewBinding.class */
public class VodActivityNewFlow_ViewBinding implements Unbinder {

    /* renamed from: b */
    public VodActivityNewFlow f19545b;

    public VodActivityNewFlow_ViewBinding(VodActivityNewFlow vodActivityNewFlow, View view) {
        this.f19545b = vodActivityNewFlow;
        vodActivityNewFlow.pbLoader = (ProgressBar) C8522c.m36739c(view, 2131428830, "field 'pbLoader'", ProgressBar.class);
        vodActivityNewFlow.toolbar = (Toolbar) C8522c.m36739c(view, 2131429320, "field 'toolbar'", Toolbar.class);
        vodActivityNewFlow.appbarToolbar = (AppBarLayout) C8522c.m36739c(view, 2131427548, "field 'appbarToolbar'", AppBarLayout.class);
        vodActivityNewFlow.activityLogin = (LinearLayout) C8522c.m36739c(view, 2131428570, "field 'activityLogin'", LinearLayout.class);
        vodActivityNewFlow.pbPagingLoader = (ProgressBar) C8522c.m36739c(view, 2131428840, "field 'pbPagingLoader'", ProgressBar.class);
        vodActivityNewFlow.myRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131428747, "field 'myRecyclerView'", RecyclerView.class);
        vodActivityNewFlow.tvNoRecordFound = (TextView) C8522c.m36739c(view, 2131427887, "field 'tvNoRecordFound'", TextView.class);
        vodActivityNewFlow.frameLayout = (FrameLayout) C8522c.m36739c(view, 2131428025, "field 'frameLayout'", FrameLayout.class);
        vodActivityNewFlow.home = (TextView) C8522c.m36739c(view, 2131428097, "field 'home'", TextView.class);
        vodActivityNewFlow.rl_vod_layout = (RelativeLayout) C8522c.m36739c(view, 2131429077, "field 'rl_vod_layout'", RelativeLayout.class);
        vodActivityNewFlow.rl_no_arrangement_found = (RelativeLayout) C8522c.m36739c(view, 2131429021, "field 'rl_no_arrangement_found'", RelativeLayout.class);
        vodActivityNewFlow.bt_explore_all = (Button) C8522c.m36739c(view, 2131427609, "field 'bt_explore_all'", Button.class);
        vodActivityNewFlow.iv_back_button = (ImageView) C8522c.m36739c(view, 2131428145, "field 'iv_back_button'", ImageView.class);
        vodActivityNewFlow.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        VodActivityNewFlow vodActivityNewFlow = this.f19545b;
        if (vodActivityNewFlow == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f19545b = null;
        vodActivityNewFlow.pbLoader = null;
        vodActivityNewFlow.toolbar = null;
        vodActivityNewFlow.appbarToolbar = null;
        vodActivityNewFlow.activityLogin = null;
        vodActivityNewFlow.pbPagingLoader = null;
        vodActivityNewFlow.myRecyclerView = null;
        vodActivityNewFlow.tvNoRecordFound = null;
        vodActivityNewFlow.frameLayout = null;
        vodActivityNewFlow.home = null;
        vodActivityNewFlow.rl_vod_layout = null;
        vodActivityNewFlow.rl_no_arrangement_found = null;
        vodActivityNewFlow.bt_explore_all = null;
        vodActivityNewFlow.iv_back_button = null;
        vodActivityNewFlow.logo = null;
    }
}

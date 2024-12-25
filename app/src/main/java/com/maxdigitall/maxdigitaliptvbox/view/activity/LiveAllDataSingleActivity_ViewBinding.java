package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import p204lg.C5876c;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveAllDataSingleActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LiveAllDataSingleActivity_ViewBinding.class */
public class LiveAllDataSingleActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public LiveAllDataSingleActivity f17525b;

    public LiveAllDataSingleActivity_ViewBinding(LiveAllDataSingleActivity liveAllDataSingleActivity, View view) {
        this.f17525b = liveAllDataSingleActivity;
        liveAllDataSingleActivity.rl_left = (RelativeLayout) C8522c.m36739c(view, 2131429006, "field 'rl_left'", RelativeLayout.class);
        liveAllDataSingleActivity.rl_right = (RelativeLayout) C8522c.m36739c(view, 2131429048, "field 'rl_right'", RelativeLayout.class);
        liveAllDataSingleActivity.iv_hamburger_sidebar = (ImageView) C8522c.m36739c(view, 2131428184, "field 'iv_hamburger_sidebar'", ImageView.class);
        liveAllDataSingleActivity.rl_search_cat = (RelativeLayout) C8522c.m36739c(view, 2131429049, "field 'rl_search_cat'", RelativeLayout.class);
        liveAllDataSingleActivity.iv_close_sidebar = (ImageView) C8522c.m36739c(view, 2131428162, "field 'iv_close_sidebar'", ImageView.class);
        liveAllDataSingleActivity.recycler_view_left_sidebar = (RecyclerView) C8522c.m36739c(view, 2131428923, "field 'recycler_view_left_sidebar'", RecyclerView.class);
        liveAllDataSingleActivity.recycler_view = (RecyclerView) C8522c.m36739c(view, C5876c.f32947k, "field 'recycler_view'", RecyclerView.class);
        liveAllDataSingleActivity.ll_series_data = (LinearLayout) C8522c.m36739c(view, 2131428503, "field 'll_series_data'", LinearLayout.class);
        liveAllDataSingleActivity.ll_loader = (LinearLayout) C8522c.m36739c(view, 2131428434, "field 'll_loader'", LinearLayout.class);
        liveAllDataSingleActivity.tv_no_record_found = (TextView) C8522c.m36739c(view, 2131429538, "field 'tv_no_record_found'", TextView.class);
        liveAllDataSingleActivity.tv_main_cat_name = (TextView) C8522c.m36739c(view, 2131429501, "field 'tv_main_cat_name'", TextView.class);
        liveAllDataSingleActivity.et_search_left_side = (EditText) C8522c.m36739c(view, 2131427919, "field 'et_search_left_side'", EditText.class);
        liveAllDataSingleActivity.ll_no_cat_found = (LinearLayout) C8522c.m36739c(view, 2131428449, "field 'll_no_cat_found'", LinearLayout.class);
        liveAllDataSingleActivity.toolbar = (Toolbar) C8522c.m36739c(view, 2131429320, "field 'toolbar'", Toolbar.class);
        liveAllDataSingleActivity.appbarToolbar = (AppBarLayout) C8522c.m36739c(view, 2131427548, "field 'appbarToolbar'", AppBarLayout.class);
        liveAllDataSingleActivity.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
        liveAllDataSingleActivity.iv_back_button_1 = (ImageView) C8522c.m36739c(view, 2131428146, "field 'iv_back_button_1'", ImageView.class);
        liveAllDataSingleActivity.iv_back_button_2 = (ImageView) C8522c.m36739c(view, 2131428147, "field 'iv_back_button_2'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        LiveAllDataSingleActivity liveAllDataSingleActivity = this.f17525b;
        if (liveAllDataSingleActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f17525b = null;
        liveAllDataSingleActivity.rl_left = null;
        liveAllDataSingleActivity.rl_right = null;
        liveAllDataSingleActivity.iv_hamburger_sidebar = null;
        liveAllDataSingleActivity.rl_search_cat = null;
        liveAllDataSingleActivity.iv_close_sidebar = null;
        liveAllDataSingleActivity.recycler_view_left_sidebar = null;
        liveAllDataSingleActivity.recycler_view = null;
        liveAllDataSingleActivity.ll_series_data = null;
        liveAllDataSingleActivity.ll_loader = null;
        liveAllDataSingleActivity.tv_no_record_found = null;
        liveAllDataSingleActivity.tv_main_cat_name = null;
        liveAllDataSingleActivity.et_search_left_side = null;
        liveAllDataSingleActivity.ll_no_cat_found = null;
        liveAllDataSingleActivity.toolbar = null;
        liveAllDataSingleActivity.appbarToolbar = null;
        liveAllDataSingleActivity.logo = null;
        liveAllDataSingleActivity.iv_back_button_1 = null;
        liveAllDataSingleActivity.iv_back_button_2 = null;
    }
}

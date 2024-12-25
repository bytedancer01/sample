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
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodAllDataSingleActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodAllDataSingleActivity_ViewBinding.class */
public class VodAllDataSingleActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public VodAllDataSingleActivity f19610b;

    public VodAllDataSingleActivity_ViewBinding(VodAllDataSingleActivity vodAllDataSingleActivity, View view) {
        this.f19610b = vodAllDataSingleActivity;
        vodAllDataSingleActivity.rl_left = (RelativeLayout) C8522c.m36739c(view, 2131429006, "field 'rl_left'", RelativeLayout.class);
        vodAllDataSingleActivity.rl_right = (RelativeLayout) C8522c.m36739c(view, 2131429048, "field 'rl_right'", RelativeLayout.class);
        vodAllDataSingleActivity.iv_hamburger_sidebar = (ImageView) C8522c.m36739c(view, 2131428184, "field 'iv_hamburger_sidebar'", ImageView.class);
        vodAllDataSingleActivity.rl_search_cat = (RelativeLayout) C8522c.m36739c(view, 2131429049, "field 'rl_search_cat'", RelativeLayout.class);
        vodAllDataSingleActivity.iv_close_sidebar = (ImageView) C8522c.m36739c(view, 2131428162, "field 'iv_close_sidebar'", ImageView.class);
        vodAllDataSingleActivity.recycler_view_left_sidebar = (RecyclerView) C8522c.m36739c(view, 2131428923, "field 'recycler_view_left_sidebar'", RecyclerView.class);
        vodAllDataSingleActivity.recycler_view = (RecyclerView) C8522c.m36739c(view, C5876c.f32947k, "field 'recycler_view'", RecyclerView.class);
        vodAllDataSingleActivity.ll_series_data = (LinearLayout) C8522c.m36739c(view, 2131428503, "field 'll_series_data'", LinearLayout.class);
        vodAllDataSingleActivity.ll_loader = (LinearLayout) C8522c.m36739c(view, 2131428434, "field 'll_loader'", LinearLayout.class);
        vodAllDataSingleActivity.tv_no_record_found = (TextView) C8522c.m36739c(view, 2131429538, "field 'tv_no_record_found'", TextView.class);
        vodAllDataSingleActivity.tv_main_cat_name = (TextView) C8522c.m36739c(view, 2131429501, "field 'tv_main_cat_name'", TextView.class);
        vodAllDataSingleActivity.et_search_left_side = (EditText) C8522c.m36739c(view, 2131427919, "field 'et_search_left_side'", EditText.class);
        vodAllDataSingleActivity.ll_no_cat_found = (LinearLayout) C8522c.m36739c(view, 2131428449, "field 'll_no_cat_found'", LinearLayout.class);
        vodAllDataSingleActivity.toolbar = (Toolbar) C8522c.m36739c(view, 2131429320, "field 'toolbar'", Toolbar.class);
        vodAllDataSingleActivity.appbarToolbar = (AppBarLayout) C8522c.m36739c(view, 2131427548, "field 'appbarToolbar'", AppBarLayout.class);
        vodAllDataSingleActivity.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
        vodAllDataSingleActivity.iv_back_button_1 = (ImageView) C8522c.m36739c(view, 2131428146, "field 'iv_back_button_1'", ImageView.class);
        vodAllDataSingleActivity.iv_back_button_2 = (ImageView) C8522c.m36739c(view, 2131428147, "field 'iv_back_button_2'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        VodAllDataSingleActivity vodAllDataSingleActivity = this.f19610b;
        if (vodAllDataSingleActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f19610b = null;
        vodAllDataSingleActivity.rl_left = null;
        vodAllDataSingleActivity.rl_right = null;
        vodAllDataSingleActivity.iv_hamburger_sidebar = null;
        vodAllDataSingleActivity.rl_search_cat = null;
        vodAllDataSingleActivity.iv_close_sidebar = null;
        vodAllDataSingleActivity.recycler_view_left_sidebar = null;
        vodAllDataSingleActivity.recycler_view = null;
        vodAllDataSingleActivity.ll_series_data = null;
        vodAllDataSingleActivity.ll_loader = null;
        vodAllDataSingleActivity.tv_no_record_found = null;
        vodAllDataSingleActivity.tv_main_cat_name = null;
        vodAllDataSingleActivity.et_search_left_side = null;
        vodAllDataSingleActivity.ll_no_cat_found = null;
        vodAllDataSingleActivity.toolbar = null;
        vodAllDataSingleActivity.appbarToolbar = null;
        vodAllDataSingleActivity.logo = null;
        vodAllDataSingleActivity.iv_back_button_1 = null;
        vodAllDataSingleActivity.iv_back_button_2 = null;
    }
}

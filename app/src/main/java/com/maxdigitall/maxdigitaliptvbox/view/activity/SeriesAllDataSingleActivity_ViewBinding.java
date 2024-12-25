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
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesAllDataSingleActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesAllDataSingleActivity_ViewBinding.class */
public class SeriesAllDataSingleActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public SeriesAllDataSingleActivity f18476b;

    public SeriesAllDataSingleActivity_ViewBinding(SeriesAllDataSingleActivity seriesAllDataSingleActivity, View view) {
        this.f18476b = seriesAllDataSingleActivity;
        seriesAllDataSingleActivity.rl_left = (RelativeLayout) C8522c.m36739c(view, 2131429006, "field 'rl_left'", RelativeLayout.class);
        seriesAllDataSingleActivity.rl_right = (RelativeLayout) C8522c.m36739c(view, 2131429048, "field 'rl_right'", RelativeLayout.class);
        seriesAllDataSingleActivity.iv_hamburger_sidebar = (ImageView) C8522c.m36739c(view, 2131428184, "field 'iv_hamburger_sidebar'", ImageView.class);
        seriesAllDataSingleActivity.rl_search_cat = (RelativeLayout) C8522c.m36739c(view, 2131429049, "field 'rl_search_cat'", RelativeLayout.class);
        seriesAllDataSingleActivity.iv_close_sidebar = (ImageView) C8522c.m36739c(view, 2131428162, "field 'iv_close_sidebar'", ImageView.class);
        seriesAllDataSingleActivity.recycler_view_left_sidebar = (RecyclerView) C8522c.m36739c(view, 2131428923, "field 'recycler_view_left_sidebar'", RecyclerView.class);
        seriesAllDataSingleActivity.recycler_view = (RecyclerView) C8522c.m36739c(view, C5876c.f32947k, "field 'recycler_view'", RecyclerView.class);
        seriesAllDataSingleActivity.ll_series_data = (LinearLayout) C8522c.m36739c(view, 2131428503, "field 'll_series_data'", LinearLayout.class);
        seriesAllDataSingleActivity.ll_loader = (LinearLayout) C8522c.m36739c(view, 2131428434, "field 'll_loader'", LinearLayout.class);
        seriesAllDataSingleActivity.tv_no_record_found = (TextView) C8522c.m36739c(view, 2131429538, "field 'tv_no_record_found'", TextView.class);
        seriesAllDataSingleActivity.tv_main_cat_name = (TextView) C8522c.m36739c(view, 2131429501, "field 'tv_main_cat_name'", TextView.class);
        seriesAllDataSingleActivity.et_search_left_side = (EditText) C8522c.m36739c(view, 2131427919, "field 'et_search_left_side'", EditText.class);
        seriesAllDataSingleActivity.ll_no_cat_found = (LinearLayout) C8522c.m36739c(view, 2131428449, "field 'll_no_cat_found'", LinearLayout.class);
        seriesAllDataSingleActivity.toolbar = (Toolbar) C8522c.m36739c(view, 2131429320, "field 'toolbar'", Toolbar.class);
        seriesAllDataSingleActivity.appbarToolbar = (AppBarLayout) C8522c.m36739c(view, 2131427548, "field 'appbarToolbar'", AppBarLayout.class);
        seriesAllDataSingleActivity.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
        seriesAllDataSingleActivity.iv_back_button_1 = (ImageView) C8522c.m36739c(view, 2131428146, "field 'iv_back_button_1'", ImageView.class);
        seriesAllDataSingleActivity.iv_back_button_2 = (ImageView) C8522c.m36739c(view, 2131428147, "field 'iv_back_button_2'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        SeriesAllDataSingleActivity seriesAllDataSingleActivity = this.f18476b;
        if (seriesAllDataSingleActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f18476b = null;
        seriesAllDataSingleActivity.rl_left = null;
        seriesAllDataSingleActivity.rl_right = null;
        seriesAllDataSingleActivity.iv_hamburger_sidebar = null;
        seriesAllDataSingleActivity.rl_search_cat = null;
        seriesAllDataSingleActivity.iv_close_sidebar = null;
        seriesAllDataSingleActivity.recycler_view_left_sidebar = null;
        seriesAllDataSingleActivity.recycler_view = null;
        seriesAllDataSingleActivity.ll_series_data = null;
        seriesAllDataSingleActivity.ll_loader = null;
        seriesAllDataSingleActivity.tv_no_record_found = null;
        seriesAllDataSingleActivity.tv_main_cat_name = null;
        seriesAllDataSingleActivity.et_search_left_side = null;
        seriesAllDataSingleActivity.ll_no_cat_found = null;
        seriesAllDataSingleActivity.toolbar = null;
        seriesAllDataSingleActivity.appbarToolbar = null;
        seriesAllDataSingleActivity.logo = null;
        seriesAllDataSingleActivity.iv_back_button_1 = null;
        seriesAllDataSingleActivity.iv_back_button_2 = null;
    }
}

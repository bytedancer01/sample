package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SubTVArchiveActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SubTVArchiveActivity_ViewBinding.class */
public class SubTVArchiveActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public SubTVArchiveActivity f18962b;

    public SubTVArchiveActivity_ViewBinding(SubTVArchiveActivity subTVArchiveActivity, View view) {
        this.f18962b = subTVArchiveActivity;
        subTVArchiveActivity.toolbar = (Toolbar) C8522c.m36739c(view, 2131429320, "field 'toolbar'", Toolbar.class);
        subTVArchiveActivity.slidingTabs = (TabLayout) C8522c.m36739c(view, 2131429174, "field 'slidingTabs'", TabLayout.class);
        subTVArchiveActivity.viewpager = (ViewPager) C8522c.m36739c(view, 2131429685, "field 'viewpager'", ViewPager.class);
        subTVArchiveActivity.pbLoader = (ProgressBar) C8522c.m36739c(view, 2131428830, "field 'pbLoader'", ProgressBar.class);
        subTVArchiveActivity.appbarToolbar = (AppBarLayout) C8522c.m36739c(view, 2131427548, "field 'appbarToolbar'", AppBarLayout.class);
        subTVArchiveActivity.tvNoRecordFound = (TextView) C8522c.m36739c(view, 2131429538, "field 'tvNoRecordFound'", TextView.class);
        subTVArchiveActivity.rlTvArchiveTitle = (RelativeLayout) C8522c.m36739c(view, 2131429068, "field 'rlTvArchiveTitle'", RelativeLayout.class);
        subTVArchiveActivity.tvEpgRequired = (TextView) C8522c.m36739c(view, 2131429428, "field 'tvEpgRequired'", TextView.class);
        subTVArchiveActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
        subTVArchiveActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        subTVArchiveActivity.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
        subTVArchiveActivity.iv_back_button = (ImageView) C8522c.m36739c(view, 2131428145, "field 'iv_back_button'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        SubTVArchiveActivity subTVArchiveActivity = this.f18962b;
        if (subTVArchiveActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f18962b = null;
        subTVArchiveActivity.toolbar = null;
        subTVArchiveActivity.slidingTabs = null;
        subTVArchiveActivity.viewpager = null;
        subTVArchiveActivity.pbLoader = null;
        subTVArchiveActivity.appbarToolbar = null;
        subTVArchiveActivity.tvNoRecordFound = null;
        subTVArchiveActivity.rlTvArchiveTitle = null;
        subTVArchiveActivity.tvEpgRequired = null;
        subTVArchiveActivity.date = null;
        subTVArchiveActivity.time = null;
        subTVArchiveActivity.logo = null;
        subTVArchiveActivity.iv_back_button = null;
    }
}

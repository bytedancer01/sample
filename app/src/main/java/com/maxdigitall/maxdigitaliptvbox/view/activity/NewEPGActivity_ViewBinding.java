package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGActivity_ViewBinding.class */
public class NewEPGActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public NewEPGActivity f17841b;

    public NewEPGActivity_ViewBinding(NewEPGActivity newEPGActivity, View view) {
        this.f17841b = newEPGActivity;
        newEPGActivity.pbLoader = (ProgressBar) C8522c.m36739c(view, 2131428830, "field 'pbLoader'", ProgressBar.class);
        newEPGActivity.slidingTabs = (TabLayout) C8522c.m36739c(view, 2131429174, "field 'slidingTabs'", TabLayout.class);
        newEPGActivity.viewpager = (ViewPager) C8522c.m36739c(view, 2131429685, "field 'viewpager'", ViewPager.class);
        newEPGActivity.tvHeaderTitle = (TextView) C8522c.m36739c(view, 2131429468, "field 'tvHeaderTitle'", TextView.class);
        newEPGActivity.toolbar = (Toolbar) C8522c.m36739c(view, 2131429320, "field 'toolbar'", Toolbar.class);
        newEPGActivity.appbarToolbar = (AppBarLayout) C8522c.m36739c(view, 2131427548, "field 'appbarToolbar'", AppBarLayout.class);
        newEPGActivity.tv_cat_title = (TextView) C8522c.m36739c(view, 2131429379, "field 'tv_cat_title'", TextView.class);
        newEPGActivity.ll_header = (LinearLayout) C8522c.m36739c(view, 2131428416, "field 'll_header'", LinearLayout.class);
        newEPGActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
        newEPGActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        newEPGActivity.iv_back_button = (ImageView) C8522c.m36739c(view, 2131428145, "field 'iv_back_button'", ImageView.class);
        newEPGActivity.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        NewEPGActivity newEPGActivity = this.f17841b;
        if (newEPGActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f17841b = null;
        newEPGActivity.pbLoader = null;
        newEPGActivity.slidingTabs = null;
        newEPGActivity.viewpager = null;
        newEPGActivity.tvHeaderTitle = null;
        newEPGActivity.toolbar = null;
        newEPGActivity.appbarToolbar = null;
        newEPGActivity.tv_cat_title = null;
        newEPGActivity.ll_header = null;
        newEPGActivity.date = null;
        newEPGActivity.time = null;
        newEPGActivity.iv_back_button = null;
        newEPGActivity.logo = null;
    }
}

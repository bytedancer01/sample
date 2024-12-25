package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivity_ViewBinding.class */
public class TVArchiveActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public TVArchiveActivity f19081b;

    public TVArchiveActivity_ViewBinding(TVArchiveActivity tVArchiveActivity, View view) {
        this.f19081b = tVArchiveActivity;
        tVArchiveActivity.pbLoader = (ProgressBar) C8522c.m36739c(view, 2131428830, "field 'pbLoader'", ProgressBar.class);
        tVArchiveActivity.slidingTabs = (TabLayout) C8522c.m36739c(view, 2131429174, "field 'slidingTabs'", TabLayout.class);
        tVArchiveActivity.viewpager = (ViewPager) C8522c.m36739c(view, 2131429685, "field 'viewpager'", ViewPager.class);
        tVArchiveActivity.tvHeaderTitle = (ImageView) C8522c.m36739c(view, 2131429468, "field 'tvHeaderTitle'", ImageView.class);
        tVArchiveActivity.toolbar = (Toolbar) C8522c.m36739c(view, 2131429320, "field 'toolbar'", Toolbar.class);
        tVArchiveActivity.appbarToolbar = (AppBarLayout) C8522c.m36739c(view, 2131427548, "field 'appbarToolbar'", AppBarLayout.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        TVArchiveActivity tVArchiveActivity = this.f19081b;
        if (tVArchiveActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f19081b = null;
        tVArchiveActivity.pbLoader = null;
        tVArchiveActivity.slidingTabs = null;
        tVArchiveActivity.viewpager = null;
        tVArchiveActivity.tvHeaderTitle = null;
        tVArchiveActivity.toolbar = null;
        tVArchiveActivity.appbarToolbar = null;
    }
}

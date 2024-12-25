package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGCategoriesActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGCategoriesActivity_ViewBinding.class */
public class NewEPGCategoriesActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public NewEPGCategoriesActivity f17901b;

    public NewEPGCategoriesActivity_ViewBinding(NewEPGCategoriesActivity newEPGCategoriesActivity, View view) {
        this.f17901b = newEPGCategoriesActivity;
        newEPGCategoriesActivity.pbLoader = (ProgressBar) C8522c.m36739c(view, 2131428830, "field 'pbLoader'", ProgressBar.class);
        newEPGCategoriesActivity.viewpager = (ViewPager) C8522c.m36739c(view, 2131429685, "field 'viewpager'", ViewPager.class);
        newEPGCategoriesActivity.toolbar = (Toolbar) C8522c.m36739c(view, 2131429320, "field 'toolbar'", Toolbar.class);
        newEPGCategoriesActivity.appbarToolbar = (AppBarLayout) C8522c.m36739c(view, 2131427548, "field 'appbarToolbar'", AppBarLayout.class);
        newEPGCategoriesActivity.pbPagingLoader = (ProgressBar) C8522c.m36739c(view, 2131428840, "field 'pbPagingLoader'", ProgressBar.class);
        newEPGCategoriesActivity.myRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131428747, "field 'myRecyclerView'", RecyclerView.class);
        newEPGCategoriesActivity.emptyView = (TextView) C8522c.m36739c(view, 2131427887, "field 'emptyView'", TextView.class);
        newEPGCategoriesActivity.frameLayout = (FrameLayout) C8522c.m36739c(view, 2131428025, "field 'frameLayout'", FrameLayout.class);
        newEPGCategoriesActivity.ivBTUP = (ImageView) C8522c.m36739c(view, 2131428153, "field 'ivBTUP'", ImageView.class);
        newEPGCategoriesActivity.tvNoStream = (TextView) C8522c.m36739c(view, 2131429535, "field 'tvNoStream'", TextView.class);
        newEPGCategoriesActivity.tvNoRecordFound = (TextView) C8522c.m36739c(view, 2131429538, "field 'tvNoRecordFound'", TextView.class);
        newEPGCategoriesActivity.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
        newEPGCategoriesActivity.iv_back_button = (ImageView) C8522c.m36739c(view, 2131428145, "field 'iv_back_button'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        NewEPGCategoriesActivity newEPGCategoriesActivity = this.f17901b;
        if (newEPGCategoriesActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f17901b = null;
        newEPGCategoriesActivity.pbLoader = null;
        newEPGCategoriesActivity.viewpager = null;
        newEPGCategoriesActivity.toolbar = null;
        newEPGCategoriesActivity.appbarToolbar = null;
        newEPGCategoriesActivity.pbPagingLoader = null;
        newEPGCategoriesActivity.myRecyclerView = null;
        newEPGCategoriesActivity.emptyView = null;
        newEPGCategoriesActivity.frameLayout = null;
        newEPGCategoriesActivity.ivBTUP = null;
        newEPGCategoriesActivity.tvNoStream = null;
        newEPGCategoriesActivity.tvNoRecordFound = null;
        newEPGCategoriesActivity.logo = null;
        newEPGCategoriesActivity.iv_back_button = null;
    }
}

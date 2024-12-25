package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
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
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories_ViewBinding.class */
public class VodActivityNewFlowSubCategories_ViewBinding implements Unbinder {

    /* renamed from: b */
    public VodActivityNewFlowSubCategories f19544b;

    public VodActivityNewFlowSubCategories_ViewBinding(VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories, View view) {
        this.f19544b = vodActivityNewFlowSubCategories;
        vodActivityNewFlowSubCategories.toolbar = (Toolbar) C8522c.m36739c(view, 2131429320, "field 'toolbar'", Toolbar.class);
        vodActivityNewFlowSubCategories.appbarToolbar = (AppBarLayout) C8522c.m36739c(view, 2131427548, "field 'appbarToolbar'", AppBarLayout.class);
        vodActivityNewFlowSubCategories.pbLoader = (ProgressBar) C8522c.m36739c(view, 2131428830, "field 'pbLoader'", ProgressBar.class);
        vodActivityNewFlowSubCategories.myRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131428747, "field 'myRecyclerView'", RecyclerView.class);
        vodActivityNewFlowSubCategories.tvNoStream = (TextView) C8522c.m36739c(view, 2131429535, "field 'tvNoStream'", TextView.class);
        vodActivityNewFlowSubCategories.tvNoRecordFound = (TextView) C8522c.m36739c(view, 2131429538, "field 'tvNoRecordFound'", TextView.class);
        vodActivityNewFlowSubCategories.tvViewProvider = (TextView) C8522c.m36739c(view, 2131429636, "field 'tvViewProvider'", TextView.class);
        vodActivityNewFlowSubCategories.vodCategoryName = (TextView) C8522c.m36739c(view, 2131429607, "field 'vodCategoryName'", TextView.class);
        vodActivityNewFlowSubCategories.rl_sub_cat = (RelativeLayout) C8522c.m36739c(view, 2131429059, "field 'rl_sub_cat'", RelativeLayout.class);
        vodActivityNewFlowSubCategories.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
        vodActivityNewFlowSubCategories.iv_back_button = (ImageView) C8522c.m36739c(view, 2131428145, "field 'iv_back_button'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories = this.f19544b;
        if (vodActivityNewFlowSubCategories == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f19544b = null;
        vodActivityNewFlowSubCategories.toolbar = null;
        vodActivityNewFlowSubCategories.appbarToolbar = null;
        vodActivityNewFlowSubCategories.pbLoader = null;
        vodActivityNewFlowSubCategories.myRecyclerView = null;
        vodActivityNewFlowSubCategories.tvNoStream = null;
        vodActivityNewFlowSubCategories.tvNoRecordFound = null;
        vodActivityNewFlowSubCategories.tvViewProvider = null;
        vodActivityNewFlowSubCategories.vodCategoryName = null;
        vodActivityNewFlowSubCategories.rl_sub_cat = null;
        vodActivityNewFlowSubCategories.logo = null;
        vodActivityNewFlowSubCategories.iv_back_button = null;
    }
}

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
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSecondSubCategories_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSecondSubCategories_ViewBinding.class */
public class VodActivityNewFlowSecondSubCategories_ViewBinding implements Unbinder {

    /* renamed from: b */
    public VodActivityNewFlowSecondSubCategories f19473b;

    public VodActivityNewFlowSecondSubCategories_ViewBinding(VodActivityNewFlowSecondSubCategories vodActivityNewFlowSecondSubCategories, View view) {
        this.f19473b = vodActivityNewFlowSecondSubCategories;
        vodActivityNewFlowSecondSubCategories.toolbar = (Toolbar) C8522c.m36739c(view, 2131429320, "field 'toolbar'", Toolbar.class);
        vodActivityNewFlowSecondSubCategories.appbarToolbar = (AppBarLayout) C8522c.m36739c(view, 2131427548, "field 'appbarToolbar'", AppBarLayout.class);
        vodActivityNewFlowSecondSubCategories.pbLoader = (ProgressBar) C8522c.m36739c(view, 2131428830, "field 'pbLoader'", ProgressBar.class);
        vodActivityNewFlowSecondSubCategories.myRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131428747, "field 'myRecyclerView'", RecyclerView.class);
        vodActivityNewFlowSecondSubCategories.tvNoStream = (TextView) C8522c.m36739c(view, 2131429535, "field 'tvNoStream'", TextView.class);
        vodActivityNewFlowSecondSubCategories.tvNoRecordFound = (TextView) C8522c.m36739c(view, 2131429538, "field 'tvNoRecordFound'", TextView.class);
        vodActivityNewFlowSecondSubCategories.tvViewProvider = (TextView) C8522c.m36739c(view, 2131429636, "field 'tvViewProvider'", TextView.class);
        vodActivityNewFlowSecondSubCategories.vodCategoryName = (TextView) C8522c.m36739c(view, 2131429607, "field 'vodCategoryName'", TextView.class);
        vodActivityNewFlowSecondSubCategories.rl_sub_cat = (RelativeLayout) C8522c.m36739c(view, 2131429059, "field 'rl_sub_cat'", RelativeLayout.class);
        vodActivityNewFlowSecondSubCategories.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        VodActivityNewFlowSecondSubCategories vodActivityNewFlowSecondSubCategories = this.f19473b;
        if (vodActivityNewFlowSecondSubCategories == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f19473b = null;
        vodActivityNewFlowSecondSubCategories.toolbar = null;
        vodActivityNewFlowSecondSubCategories.appbarToolbar = null;
        vodActivityNewFlowSecondSubCategories.pbLoader = null;
        vodActivityNewFlowSecondSubCategories.myRecyclerView = null;
        vodActivityNewFlowSecondSubCategories.tvNoStream = null;
        vodActivityNewFlowSecondSubCategories.tvNoRecordFound = null;
        vodActivityNewFlowSecondSubCategories.tvViewProvider = null;
        vodActivityNewFlowSecondSubCategories.vodCategoryName = null;
        vodActivityNewFlowSecondSubCategories.rl_sub_cat = null;
        vodActivityNewFlowSecondSubCategories.logo = null;
    }
}

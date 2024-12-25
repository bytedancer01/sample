package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityLayout_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityLayout_ViewBinding.class */
public class VodActivityLayout_ViewBinding implements Unbinder {

    /* renamed from: b */
    public VodActivityLayout f19375b;

    public VodActivityLayout_ViewBinding(VodActivityLayout vodActivityLayout, View view) {
        this.f19375b = vodActivityLayout;
        vodActivityLayout.toolbar = (Toolbar) C8522c.m36739c(view, 2131429320, "field 'toolbar'", Toolbar.class);
        vodActivityLayout.appbarToolbar = (AppBarLayout) C8522c.m36739c(view, 2131427548, "field 'appbarToolbar'", AppBarLayout.class);
        vodActivityLayout.pbLoader = (ProgressBar) C8522c.m36739c(view, 2131428830, "field 'pbLoader'", ProgressBar.class);
        vodActivityLayout.myRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131428747, "field 'myRecyclerView'", RecyclerView.class);
        vodActivityLayout.tvNoStream = (TextView) C8522c.m36739c(view, 2131429535, "field 'tvNoStream'", TextView.class);
        vodActivityLayout.tvNoRecordFound = (TextView) C8522c.m36739c(view, 2131429538, "field 'tvNoRecordFound'", TextView.class);
        vodActivityLayout.tvViewProvider = (TextView) C8522c.m36739c(view, 2131429636, "field 'tvViewProvider'", TextView.class);
        vodActivityLayout.vodCategoryName = (TextView) C8522c.m36739c(view, 2131429607, "field 'vodCategoryName'", TextView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        VodActivityLayout vodActivityLayout = this.f19375b;
        if (vodActivityLayout == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f19375b = null;
        vodActivityLayout.toolbar = null;
        vodActivityLayout.appbarToolbar = null;
        vodActivityLayout.pbLoader = null;
        vodActivityLayout.myRecyclerView = null;
        vodActivityLayout.tvNoStream = null;
        vodActivityLayout.tvNoRecordFound = null;
        vodActivityLayout.tvViewProvider = null;
        vodActivityLayout.vodCategoryName = null;
    }
}

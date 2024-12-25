package com.maxdigitall.maxdigitaliptvbox.view.fragment;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlCategoriesFragment_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlCategoriesFragment_ViewBinding.class */
public class ParentalControlCategoriesFragment_ViewBinding implements Unbinder {

    /* renamed from: b */
    public ParentalControlCategoriesFragment f22170b;

    public ParentalControlCategoriesFragment_ViewBinding(ParentalControlCategoriesFragment parentalControlCategoriesFragment, View view) {
        this.f22170b = parentalControlCategoriesFragment;
        parentalControlCategoriesFragment.myRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131428747, "field 'myRecyclerView'", RecyclerView.class);
        parentalControlCategoriesFragment.emptyView = (TextView) C8522c.m36739c(view, 2131427887, "field 'emptyView'", TextView.class);
        parentalControlCategoriesFragment.pbLoader = (ProgressBar) C8522c.m36739c(view, 2131428830, "field 'pbLoader'", ProgressBar.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        ParentalControlCategoriesFragment parentalControlCategoriesFragment = this.f22170b;
        if (parentalControlCategoriesFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f22170b = null;
        parentalControlCategoriesFragment.myRecyclerView = null;
        parentalControlCategoriesFragment.emptyView = null;
        parentalControlCategoriesFragment.pbLoader = null;
    }
}

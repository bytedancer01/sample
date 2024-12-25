package com.maxdigitall.maxdigitaliptvbox.view.fragment;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlRadioCategoriesFragment_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlRadioCategoriesFragment_ViewBinding.class */
public class ParentalControlRadioCategoriesFragment_ViewBinding implements Unbinder {

    /* renamed from: b */
    public ParentalControlRadioCategoriesFragment f22214b;

    public ParentalControlRadioCategoriesFragment_ViewBinding(ParentalControlRadioCategoriesFragment parentalControlRadioCategoriesFragment, View view) {
        this.f22214b = parentalControlRadioCategoriesFragment;
        parentalControlRadioCategoriesFragment.myRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131428747, "field 'myRecyclerView'", RecyclerView.class);
        parentalControlRadioCategoriesFragment.emptyView = (TextView) C8522c.m36739c(view, 2131427887, "field 'emptyView'", TextView.class);
        parentalControlRadioCategoriesFragment.pbLoader = (ProgressBar) C8522c.m36739c(view, 2131428830, "field 'pbLoader'", ProgressBar.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        ParentalControlRadioCategoriesFragment parentalControlRadioCategoriesFragment = this.f22214b;
        if (parentalControlRadioCategoriesFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f22214b = null;
        parentalControlRadioCategoriesFragment.myRecyclerView = null;
        parentalControlRadioCategoriesFragment.emptyView = null;
        parentalControlRadioCategoriesFragment.pbLoader = null;
    }
}

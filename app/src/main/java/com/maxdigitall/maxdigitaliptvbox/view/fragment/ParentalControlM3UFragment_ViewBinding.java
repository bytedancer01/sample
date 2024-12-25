package com.maxdigitall.maxdigitaliptvbox.view.fragment;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlM3UFragment_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlM3UFragment_ViewBinding.class */
public class ParentalControlM3UFragment_ViewBinding implements Unbinder {

    /* renamed from: b */
    public ParentalControlM3UFragment f22192b;

    public ParentalControlM3UFragment_ViewBinding(ParentalControlM3UFragment parentalControlM3UFragment, View view) {
        this.f22192b = parentalControlM3UFragment;
        parentalControlM3UFragment.myRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131428747, "field 'myRecyclerView'", RecyclerView.class);
        parentalControlM3UFragment.emptyView = (TextView) C8522c.m36739c(view, 2131427887, "field 'emptyView'", TextView.class);
        parentalControlM3UFragment.pbLoader = (ProgressBar) C8522c.m36739c(view, 2131428830, "field 'pbLoader'", ProgressBar.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        ParentalControlM3UFragment parentalControlM3UFragment = this.f22192b;
        if (parentalControlM3UFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f22192b = null;
        parentalControlM3UFragment.myRecyclerView = null;
        parentalControlM3UFragment.emptyView = null;
        parentalControlM3UFragment.pbLoader = null;
    }
}

package com.maxdigitall.maxdigitaliptvbox.view.fragment;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlSeriesCatFragment_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlSeriesCatFragment_ViewBinding.class */
public class ParentalControlSeriesCatFragment_ViewBinding implements Unbinder {

    /* renamed from: b */
    public ParentalControlSeriesCatFragment f22236b;

    public ParentalControlSeriesCatFragment_ViewBinding(ParentalControlSeriesCatFragment parentalControlSeriesCatFragment, View view) {
        this.f22236b = parentalControlSeriesCatFragment;
        parentalControlSeriesCatFragment.myRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131428747, "field 'myRecyclerView'", RecyclerView.class);
        parentalControlSeriesCatFragment.emptyView = (TextView) C8522c.m36739c(view, 2131427887, "field 'emptyView'", TextView.class);
        parentalControlSeriesCatFragment.pbLoader = (ProgressBar) C8522c.m36739c(view, 2131428830, "field 'pbLoader'", ProgressBar.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        ParentalControlSeriesCatFragment parentalControlSeriesCatFragment = this.f22236b;
        if (parentalControlSeriesCatFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f22236b = null;
        parentalControlSeriesCatFragment.myRecyclerView = null;
        parentalControlSeriesCatFragment.emptyView = null;
        parentalControlSeriesCatFragment.pbLoader = null;
    }
}

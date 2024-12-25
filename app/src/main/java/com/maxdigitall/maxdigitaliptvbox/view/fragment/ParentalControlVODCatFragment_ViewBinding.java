package com.maxdigitall.maxdigitaliptvbox.view.fragment;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlVODCatFragment_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlVODCatFragment_ViewBinding.class */
public class ParentalControlVODCatFragment_ViewBinding implements Unbinder {

    /* renamed from: b */
    public ParentalControlVODCatFragment f22271b;

    public ParentalControlVODCatFragment_ViewBinding(ParentalControlVODCatFragment parentalControlVODCatFragment, View view) {
        this.f22271b = parentalControlVODCatFragment;
        parentalControlVODCatFragment.myRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131428747, "field 'myRecyclerView'", RecyclerView.class);
        parentalControlVODCatFragment.emptyView = (TextView) C8522c.m36739c(view, 2131427887, "field 'emptyView'", TextView.class);
        parentalControlVODCatFragment.pbLoader = (ProgressBar) C8522c.m36739c(view, 2131428830, "field 'pbLoader'", ProgressBar.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        ParentalControlVODCatFragment parentalControlVODCatFragment = this.f22271b;
        if (parentalControlVODCatFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f22271b = null;
        parentalControlVODCatFragment.myRecyclerView = null;
        parentalControlVODCatFragment.emptyView = null;
        parentalControlVODCatFragment.pbLoader = null;
    }
}

package com.maxdigitall.maxdigitaliptvbox.view.fragment;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/VodFragment_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/VodFragment_ViewBinding.class */
public class VodFragment_ViewBinding implements Unbinder {

    /* renamed from: b */
    public VodFragment f22436b;

    public VodFragment_ViewBinding(VodFragment vodFragment, View view) {
        this.f22436b = vodFragment;
        vodFragment.pbLoader = (ProgressBar) C8522c.m36739c(view, 2131428830, "field 'pbLoader'", ProgressBar.class);
        vodFragment.myRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131428747, "field 'myRecyclerView'", RecyclerView.class);
        vodFragment.tvNoStream = (TextView) C8522c.m36739c(view, 2131429535, "field 'tvNoStream'", TextView.class);
        vodFragment.tvNoRecordFound = (TextView) C8522c.m36739c(view, 2131429538, "field 'tvNoRecordFound'", TextView.class);
        vodFragment.tvViewProvider = (TextView) C8522c.m36739c(view, 2131429636, "field 'tvViewProvider'", TextView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        VodFragment vodFragment = this.f22436b;
        if (vodFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f22436b = null;
        vodFragment.pbLoader = null;
        vodFragment.myRecyclerView = null;
        vodFragment.tvNoStream = null;
        vodFragment.tvNoRecordFound = null;
        vodFragment.tvViewProvider = null;
    }
}

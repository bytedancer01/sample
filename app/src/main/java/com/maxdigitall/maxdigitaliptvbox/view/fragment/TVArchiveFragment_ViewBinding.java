package com.maxdigitall.maxdigitaliptvbox.view.fragment;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/TVArchiveFragment_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/TVArchiveFragment_ViewBinding.class */
public class TVArchiveFragment_ViewBinding implements Unbinder {

    /* renamed from: b */
    public TVArchiveFragment f22397b;

    public TVArchiveFragment_ViewBinding(TVArchiveFragment tVArchiveFragment, View view) {
        this.f22397b = tVArchiveFragment;
        tVArchiveFragment.pbLoader = (ProgressBar) C8522c.m36739c(view, 2131428830, "field 'pbLoader'", ProgressBar.class);
        tVArchiveFragment.myRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131428747, "field 'myRecyclerView'", RecyclerView.class);
        tVArchiveFragment.tvNoStream = (TextView) C8522c.m36739c(view, 2131429535, "field 'tvNoStream'", TextView.class);
        tVArchiveFragment.tvNoRecordFound = (TextView) C8522c.m36739c(view, 2131429538, "field 'tvNoRecordFound'", TextView.class);
        tVArchiveFragment.tvEgpRequired = (TextView) C8522c.m36739c(view, 2131429428, "field 'tvEgpRequired'", TextView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        TVArchiveFragment tVArchiveFragment = this.f22397b;
        if (tVArchiveFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f22397b = null;
        tVArchiveFragment.pbLoader = null;
        tVArchiveFragment.myRecyclerView = null;
        tVArchiveFragment.tvNoStream = null;
        tVArchiveFragment.tvNoRecordFound = null;
        tVArchiveFragment.tvEgpRequired = null;
    }
}

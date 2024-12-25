package com.maxdigitall.maxdigitaliptvbox.view.fragment;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SubTVArchiveFragment_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SubTVArchiveFragment_ViewBinding.class */
public class SubTVArchiveFragment_ViewBinding implements Unbinder {

    /* renamed from: b */
    public SubTVArchiveFragment f22360b;

    public SubTVArchiveFragment_ViewBinding(SubTVArchiveFragment subTVArchiveFragment, View view) {
        this.f22360b = subTVArchiveFragment;
        subTVArchiveFragment.myRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131428747, "field 'myRecyclerView'", RecyclerView.class);
        subTVArchiveFragment.tvNoStream = (TextView) C8522c.m36739c(view, 2131429535, "field 'tvNoStream'", TextView.class);
        subTVArchiveFragment.tvNoRecordFound = (TextView) C8522c.m36739c(view, 2131429538, "field 'tvNoRecordFound'", TextView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        SubTVArchiveFragment subTVArchiveFragment = this.f22360b;
        if (subTVArchiveFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f22360b = null;
        subTVArchiveFragment.myRecyclerView = null;
        subTVArchiveFragment.tvNoStream = null;
        subTVArchiveFragment.tvNoRecordFound = null;
    }
}

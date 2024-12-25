package com.maxdigitall.maxdigitaliptvbox.view.fragment;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SeriesTabFragment_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/SeriesTabFragment_ViewBinding.class */
public class SeriesTabFragment_ViewBinding implements Unbinder {

    /* renamed from: b */
    public SeriesTabFragment f22344b;

    public SeriesTabFragment_ViewBinding(SeriesTabFragment seriesTabFragment, View view) {
        this.f22344b = seriesTabFragment;
        seriesTabFragment.pbLoader = (ProgressBar) C8522c.m36739c(view, 2131428830, "field 'pbLoader'", ProgressBar.class);
        seriesTabFragment.myRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131428747, "field 'myRecyclerView'", RecyclerView.class);
        seriesTabFragment.tvNoStream = (TextView) C8522c.m36739c(view, 2131429535, "field 'tvNoStream'", TextView.class);
        seriesTabFragment.tvNoRecordFound = (TextView) C8522c.m36739c(view, 2131429538, "field 'tvNoRecordFound'", TextView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        SeriesTabFragment seriesTabFragment = this.f22344b;
        if (seriesTabFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f22344b = null;
        seriesTabFragment.pbLoader = null;
        seriesTabFragment.myRecyclerView = null;
        seriesTabFragment.tvNoStream = null;
        seriesTabFragment.tvNoRecordFound = null;
    }
}

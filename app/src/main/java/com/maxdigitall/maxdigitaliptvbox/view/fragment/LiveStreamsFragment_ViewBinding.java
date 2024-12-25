package com.maxdigitall.maxdigitaliptvbox.view.fragment;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/LiveStreamsFragment_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/LiveStreamsFragment_ViewBinding.class */
public class LiveStreamsFragment_ViewBinding implements Unbinder {

    /* renamed from: b */
    public LiveStreamsFragment f22093b;

    public LiveStreamsFragment_ViewBinding(LiveStreamsFragment liveStreamsFragment, View view) {
        this.f22093b = liveStreamsFragment;
        liveStreamsFragment.pbLoader = (ProgressBar) C8522c.m36739c(view, 2131428830, "field 'pbLoader'", ProgressBar.class);
        liveStreamsFragment.myRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131428747, "field 'myRecyclerView'", RecyclerView.class);
        liveStreamsFragment.tvNoStream = (TextView) C8522c.m36739c(view, 2131429535, "field 'tvNoStream'", TextView.class);
        liveStreamsFragment.tvNoRecordFound = (TextView) C8522c.m36739c(view, 2131429538, "field 'tvNoRecordFound'", TextView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        LiveStreamsFragment liveStreamsFragment = this.f22093b;
        if (liveStreamsFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f22093b = null;
        liveStreamsFragment.pbLoader = null;
        liveStreamsFragment.myRecyclerView = null;
        liveStreamsFragment.tvNoStream = null;
        liveStreamsFragment.tvNoRecordFound = null;
    }
}

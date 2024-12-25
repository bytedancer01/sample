package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.github.ybq.android.spinkit.SpinKitView;
import p204lg.C5876c;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/PendingServiceActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/PendingServiceActivity_ViewBinding.class */
public class PendingServiceActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public PendingServiceActivity f16092b;

    public PendingServiceActivity_ViewBinding(PendingServiceActivity pendingServiceActivity, View view) {
        this.f16092b = pendingServiceActivity;
        pendingServiceActivity.recyclerView = (RecyclerView) C8522c.m36739c(view, 2131428920, "field 'recyclerView'", RecyclerView.class);
        pendingServiceActivity.tv_no_active_services = (TextView) C8522c.m36739c(view, 2131429536, "field 'tv_no_active_services'", TextView.class);
        pendingServiceActivity.progress = (SpinKitView) C8522c.m36739c(view, C5876c.f32946j, "field 'progress'", SpinKitView.class);
        pendingServiceActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
        pendingServiceActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        pendingServiceActivity.tv_title = (TextView) C8522c.m36739c(view, 2131429631, "field 'tv_title'", TextView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        PendingServiceActivity pendingServiceActivity = this.f16092b;
        if (pendingServiceActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f16092b = null;
        pendingServiceActivity.recyclerView = null;
        pendingServiceActivity.tv_no_active_services = null;
        pendingServiceActivity.progress = null;
        pendingServiceActivity.date = null;
        pendingServiceActivity.time = null;
        pendingServiceActivity.tv_title = null;
    }
}

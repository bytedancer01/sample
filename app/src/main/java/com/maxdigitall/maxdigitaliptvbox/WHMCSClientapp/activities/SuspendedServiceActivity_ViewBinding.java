package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.github.ybq.android.spinkit.SpinKitView;
import p204lg.C5876c;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/SuspendedServiceActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/SuspendedServiceActivity_ViewBinding.class */
public class SuspendedServiceActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public SuspendedServiceActivity f16159b;

    public SuspendedServiceActivity_ViewBinding(SuspendedServiceActivity suspendedServiceActivity, View view) {
        this.f16159b = suspendedServiceActivity;
        suspendedServiceActivity.recyclerView = (RecyclerView) C8522c.m36739c(view, 2131428920, "field 'recyclerView'", RecyclerView.class);
        suspendedServiceActivity.tv_no_active_services = (TextView) C8522c.m36739c(view, 2131429536, "field 'tv_no_active_services'", TextView.class);
        suspendedServiceActivity.progress = (SpinKitView) C8522c.m36739c(view, C5876c.f32946j, "field 'progress'", SpinKitView.class);
        suspendedServiceActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
        suspendedServiceActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        suspendedServiceActivity.tv_title = (TextView) C8522c.m36739c(view, 2131429631, "field 'tv_title'", TextView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        SuspendedServiceActivity suspendedServiceActivity = this.f16159b;
        if (suspendedServiceActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f16159b = null;
        suspendedServiceActivity.recyclerView = null;
        suspendedServiceActivity.tv_no_active_services = null;
        suspendedServiceActivity.progress = null;
        suspendedServiceActivity.date = null;
        suspendedServiceActivity.time = null;
        suspendedServiceActivity.tv_title = null;
    }
}

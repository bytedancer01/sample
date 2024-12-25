package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.github.ybq.android.spinkit.SpinKitView;
import p204lg.C5876c;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/TerminatedServiceActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/TerminatedServiceActivity_ViewBinding.class */
public class TerminatedServiceActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public TerminatedServiceActivity f16164b;

    public TerminatedServiceActivity_ViewBinding(TerminatedServiceActivity terminatedServiceActivity, View view) {
        this.f16164b = terminatedServiceActivity;
        terminatedServiceActivity.recyclerView = (RecyclerView) C8522c.m36739c(view, 2131428920, "field 'recyclerView'", RecyclerView.class);
        terminatedServiceActivity.tv_no_active_services = (TextView) C8522c.m36739c(view, 2131429536, "field 'tv_no_active_services'", TextView.class);
        terminatedServiceActivity.progress = (SpinKitView) C8522c.m36739c(view, C5876c.f32946j, "field 'progress'", SpinKitView.class);
        terminatedServiceActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
        terminatedServiceActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        terminatedServiceActivity.tv_title = (TextView) C8522c.m36739c(view, 2131429631, "field 'tv_title'", TextView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        TerminatedServiceActivity terminatedServiceActivity = this.f16164b;
        if (terminatedServiceActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f16164b = null;
        terminatedServiceActivity.recyclerView = null;
        terminatedServiceActivity.tv_no_active_services = null;
        terminatedServiceActivity.progress = null;
        terminatedServiceActivity.date = null;
        terminatedServiceActivity.time = null;
        terminatedServiceActivity.tv_title = null;
    }
}

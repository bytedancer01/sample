package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.github.ybq.android.spinkit.SpinKitView;
import p204lg.C5876c;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/FraudServiceActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/FraudServiceActivity_ViewBinding.class */
public class FraudServiceActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public FraudServiceActivity f15951b;

    public FraudServiceActivity_ViewBinding(FraudServiceActivity fraudServiceActivity, View view) {
        this.f15951b = fraudServiceActivity;
        fraudServiceActivity.recyclerView = (RecyclerView) C8522c.m36739c(view, 2131428920, "field 'recyclerView'", RecyclerView.class);
        fraudServiceActivity.tv_no_active_services = (TextView) C8522c.m36739c(view, 2131429536, "field 'tv_no_active_services'", TextView.class);
        fraudServiceActivity.progress = (SpinKitView) C8522c.m36739c(view, C5876c.f32946j, "field 'progress'", SpinKitView.class);
        fraudServiceActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
        fraudServiceActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        fraudServiceActivity.tv_title = (TextView) C8522c.m36739c(view, 2131429631, "field 'tv_title'", TextView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        FraudServiceActivity fraudServiceActivity = this.f15951b;
        if (fraudServiceActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f15951b = null;
        fraudServiceActivity.recyclerView = null;
        fraudServiceActivity.tv_no_active_services = null;
        fraudServiceActivity.progress = null;
        fraudServiceActivity.date = null;
        fraudServiceActivity.time = null;
        fraudServiceActivity.tv_title = null;
    }
}

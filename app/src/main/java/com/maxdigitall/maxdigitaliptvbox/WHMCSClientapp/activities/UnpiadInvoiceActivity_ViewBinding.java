package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.github.ybq.android.spinkit.SpinKitView;
import p204lg.C5876c;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/UnpiadInvoiceActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/UnpiadInvoiceActivity_ViewBinding.class */
public class UnpiadInvoiceActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public UnpiadInvoiceActivity f16168b;

    public UnpiadInvoiceActivity_ViewBinding(UnpiadInvoiceActivity unpiadInvoiceActivity, View view) {
        this.f16168b = unpiadInvoiceActivity;
        unpiadInvoiceActivity.noRecordFound = (TextView) C8522c.m36739c(view, 2131428785, "field 'noRecordFound'", TextView.class);
        unpiadInvoiceActivity.recyclerView = (RecyclerView) C8522c.m36739c(view, 2131428925, "field 'recyclerView'", RecyclerView.class);
        unpiadInvoiceActivity.progress = (SpinKitView) C8522c.m36739c(view, C5876c.f32946j, "field 'progress'", SpinKitView.class);
        unpiadInvoiceActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        unpiadInvoiceActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        UnpiadInvoiceActivity unpiadInvoiceActivity = this.f16168b;
        if (unpiadInvoiceActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f16168b = null;
        unpiadInvoiceActivity.noRecordFound = null;
        unpiadInvoiceActivity.recyclerView = null;
        unpiadInvoiceActivity.progress = null;
        unpiadInvoiceActivity.time = null;
        unpiadInvoiceActivity.date = null;
    }
}

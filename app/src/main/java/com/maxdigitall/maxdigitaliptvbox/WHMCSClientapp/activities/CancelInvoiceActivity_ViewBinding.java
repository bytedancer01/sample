package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.github.ybq.android.spinkit.SpinKitView;
import p204lg.C5876c;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/CancelInvoiceActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/CancelInvoiceActivity_ViewBinding.class */
public class CancelInvoiceActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public CancelInvoiceActivity f15941b;

    public CancelInvoiceActivity_ViewBinding(CancelInvoiceActivity cancelInvoiceActivity, View view) {
        this.f15941b = cancelInvoiceActivity;
        cancelInvoiceActivity.recyclerView = (RecyclerView) C8522c.m36739c(view, 2131428919, "field 'recyclerView'", RecyclerView.class);
        cancelInvoiceActivity.textNotFound = (TextView) C8522c.m36739c(view, 2131429299, "field 'textNotFound'", TextView.class);
        cancelInvoiceActivity.progress = (SpinKitView) C8522c.m36739c(view, C5876c.f32946j, "field 'progress'", SpinKitView.class);
        cancelInvoiceActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
        cancelInvoiceActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        CancelInvoiceActivity cancelInvoiceActivity = this.f15941b;
        if (cancelInvoiceActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f15941b = null;
        cancelInvoiceActivity.recyclerView = null;
        cancelInvoiceActivity.textNotFound = null;
        cancelInvoiceActivity.progress = null;
        cancelInvoiceActivity.date = null;
        cancelInvoiceActivity.time = null;
    }
}

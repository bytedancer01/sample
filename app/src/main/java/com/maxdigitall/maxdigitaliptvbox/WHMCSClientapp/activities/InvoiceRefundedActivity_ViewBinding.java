package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.github.ybq.android.spinkit.SpinKitView;
import p204lg.C5876c;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/InvoiceRefundedActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/InvoiceRefundedActivity_ViewBinding.class */
public class InvoiceRefundedActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public InvoiceRefundedActivity f16007b;

    public InvoiceRefundedActivity_ViewBinding(InvoiceRefundedActivity invoiceRefundedActivity, View view) {
        this.f16007b = invoiceRefundedActivity;
        invoiceRefundedActivity.recyclerView = (RecyclerView) C8522c.m36739c(view, 2131428919, "field 'recyclerView'", RecyclerView.class);
        invoiceRefundedActivity.textNotFound = (TextView) C8522c.m36739c(view, 2131429299, "field 'textNotFound'", TextView.class);
        invoiceRefundedActivity.progress = (SpinKitView) C8522c.m36739c(view, C5876c.f32946j, "field 'progress'", SpinKitView.class);
        invoiceRefundedActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        invoiceRefundedActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        InvoiceRefundedActivity invoiceRefundedActivity = this.f16007b;
        if (invoiceRefundedActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f16007b = null;
        invoiceRefundedActivity.recyclerView = null;
        invoiceRefundedActivity.textNotFound = null;
        invoiceRefundedActivity.progress = null;
        invoiceRefundedActivity.time = null;
        invoiceRefundedActivity.date = null;
    }
}

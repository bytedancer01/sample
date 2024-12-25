package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.github.ybq.android.spinkit.SpinKitView;
import p204lg.C5876c;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/PaidInvoiceActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/PaidInvoiceActivity_ViewBinding.class */
public class PaidInvoiceActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public PaidInvoiceActivity f16087b;

    public PaidInvoiceActivity_ViewBinding(PaidInvoiceActivity paidInvoiceActivity, View view) {
        this.f16087b = paidInvoiceActivity;
        paidInvoiceActivity.recyclerView = (RecyclerView) C8522c.m36739c(view, 2131428919, "field 'recyclerView'", RecyclerView.class);
        paidInvoiceActivity.textNotFound = (TextView) C8522c.m36739c(view, 2131429299, "field 'textNotFound'", TextView.class);
        paidInvoiceActivity.progress = (SpinKitView) C8522c.m36739c(view, C5876c.f32946j, "field 'progress'", SpinKitView.class);
        paidInvoiceActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        paidInvoiceActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        PaidInvoiceActivity paidInvoiceActivity = this.f16087b;
        if (paidInvoiceActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f16087b = null;
        paidInvoiceActivity.recyclerView = null;
        paidInvoiceActivity.textNotFound = null;
        paidInvoiceActivity.progress = null;
        paidInvoiceActivity.time = null;
        paidInvoiceActivity.date = null;
    }
}

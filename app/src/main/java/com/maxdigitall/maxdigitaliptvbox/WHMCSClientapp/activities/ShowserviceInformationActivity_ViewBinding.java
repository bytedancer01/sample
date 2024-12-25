package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/ShowserviceInformationActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/ShowserviceInformationActivity_ViewBinding.class */
public class ShowserviceInformationActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public ShowserviceInformationActivity f16154b;

    public ShowserviceInformationActivity_ViewBinding(ShowserviceInformationActivity showserviceInformationActivity, View view) {
        this.f16154b = showserviceInformationActivity;
        showserviceInformationActivity.tv_title = (TextView) C8522c.m36739c(view, 2131429631, "field 'tv_title'", TextView.class);
        showserviceInformationActivity.tv_product = (TextView) C8522c.m36739c(view, 2131429568, "field 'tv_product'", TextView.class);
        showserviceInformationActivity.tv_status = (TextView) C8522c.m36739c(view, 2131429616, "field 'tv_status'", TextView.class);
        showserviceInformationActivity.tv_registration_date = (TextView) C8522c.m36739c(view, 2131429589, "field 'tv_registration_date'", TextView.class);
        showserviceInformationActivity.tv_next_due_date = (TextView) C8522c.m36739c(view, 2131429526, "field 'tv_next_due_date'", TextView.class);
        showserviceInformationActivity.tv_recurring_amount = (TextView) C8522c.m36739c(view, 2131429588, "field 'tv_recurring_amount'", TextView.class);
        showserviceInformationActivity.tv_billing_cycle = (TextView) C8522c.m36739c(view, 2131429364, "field 'tv_billing_cycle'", TextView.class);
        showserviceInformationActivity.tv_payment_method = (TextView) C8522c.m36739c(view, 2131429552, "field 'tv_payment_method'", TextView.class);
        showserviceInformationActivity.tv_first_time_payment = (TextView) C8522c.m36739c(view, 2131429457, "field 'tv_first_time_payment'", TextView.class);
        showserviceInformationActivity.btn_back = (Button) C8522c.m36739c(view, 2131427632, "field 'btn_back'", Button.class);
        showserviceInformationActivity.btn_service_home = (Button) C8522c.m36739c(view, 2131427671, "field 'btn_service_home'", Button.class);
        showserviceInformationActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
        showserviceInformationActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        ShowserviceInformationActivity showserviceInformationActivity = this.f16154b;
        if (showserviceInformationActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f16154b = null;
        showserviceInformationActivity.tv_title = null;
        showserviceInformationActivity.tv_product = null;
        showserviceInformationActivity.tv_status = null;
        showserviceInformationActivity.tv_registration_date = null;
        showserviceInformationActivity.tv_next_due_date = null;
        showserviceInformationActivity.tv_recurring_amount = null;
        showserviceInformationActivity.tv_billing_cycle = null;
        showserviceInformationActivity.tv_payment_method = null;
        showserviceInformationActivity.tv_first_time_payment = null;
        showserviceInformationActivity.btn_back = null;
        showserviceInformationActivity.btn_service_home = null;
        showserviceInformationActivity.date = null;
        showserviceInformationActivity.time = null;
    }
}

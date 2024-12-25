package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.Unbinder;
import p316s2.AbstractViewOnClickListenerC8521b;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/OpenTicketActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/OpenTicketActivity_ViewBinding.class */
public class OpenTicketActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public OpenTicketActivity f16077b;

    /* renamed from: c */
    public View f16078c;

    /* renamed from: d */
    public View f16079d;

    public OpenTicketActivity_ViewBinding(OpenTicketActivity openTicketActivity, View view) {
        this.f16077b = openTicketActivity;
        openTicketActivity.et_subject_value = (EditText) C8522c.m36739c(view, 2131427928, "field 'et_subject_value'", EditText.class);
        openTicketActivity.tvDepartement = (TextView) C8522c.m36739c(view, 2131429413, "field 'tvDepartement'", TextView.class);
        openTicketActivity.spDepartmentValue = (Spinner) C8522c.m36739c(view, 2131429188, "field 'spDepartmentValue'", Spinner.class);
        openTicketActivity.tvPriority = (TextView) C8522c.m36739c(view, 2131429567, "field 'tvPriority'", TextView.class);
        openTicketActivity.sp_priority = (Spinner) C8522c.m36739c(view, 2131429191, "field 'sp_priority'", Spinner.class);
        openTicketActivity.tvMessage = (TextView) C8522c.m36739c(view, 2131429508, "field 'tvMessage'", TextView.class);
        openTicketActivity.etMessage = (EditText) C8522c.m36739c(view, 2131427914, "field 'etMessage'", EditText.class);
        View m36738b = C8522c.m36738b(view, 2131427629, "field 'btSubmit' and method 'onViewClicked'");
        openTicketActivity.btSubmit = (Button) C8522c.m36737a(m36738b, 2131427629, "field 'btSubmit'", Button.class);
        this.f16078c = m36738b;
        m36738b.setOnClickListener(new AbstractViewOnClickListenerC8521b(this, openTicketActivity) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.OpenTicketActivity_ViewBinding.1

            /* renamed from: d */
            public final OpenTicketActivity f16080d;

            /* renamed from: e */
            public final OpenTicketActivity_ViewBinding f16081e;

            {
                this.f16081e = this;
                this.f16080d = openTicketActivity;
            }

            @Override // p316s2.AbstractViewOnClickListenerC8521b
            /* renamed from: b */
            public void mo14535b(View view2) {
                this.f16080d.onViewClicked(view2);
            }
        });
        View m36738b2 = C8522c.m36738b(view, 2131427605, "field 'bt_close' and method 'onViewClicked'");
        openTicketActivity.bt_close = (Button) C8522c.m36737a(m36738b2, 2131427605, "field 'bt_close'", Button.class);
        this.f16079d = m36738b2;
        m36738b2.setOnClickListener(new AbstractViewOnClickListenerC8521b(this, openTicketActivity) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.OpenTicketActivity_ViewBinding.2

            /* renamed from: d */
            public final OpenTicketActivity f16082d;

            /* renamed from: e */
            public final OpenTicketActivity_ViewBinding f16083e;

            {
                this.f16083e = this;
                this.f16082d = openTicketActivity;
            }

            @Override // p316s2.AbstractViewOnClickListenerC8521b
            /* renamed from: b */
            public void mo14535b(View view2) {
                this.f16082d.onViewClicked(view2);
            }
        });
        openTicketActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        openTicketActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        OpenTicketActivity openTicketActivity = this.f16077b;
        if (openTicketActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f16077b = null;
        openTicketActivity.et_subject_value = null;
        openTicketActivity.tvDepartement = null;
        openTicketActivity.spDepartmentValue = null;
        openTicketActivity.tvPriority = null;
        openTicketActivity.sp_priority = null;
        openTicketActivity.tvMessage = null;
        openTicketActivity.etMessage = null;
        openTicketActivity.btSubmit = null;
        openTicketActivity.bt_close = null;
        openTicketActivity.time = null;
        openTicketActivity.date = null;
        this.f16078c.setOnClickListener(null);
        this.f16078c = null;
        this.f16079d.setOnClickListener(null);
        this.f16079d = null;
    }
}

package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.wang.avi.AVLoadingIndicatorView;
import p316s2.AbstractViewOnClickListenerC8521b;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/MyInvoiceActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/MyInvoiceActivity_ViewBinding.class */
public class MyInvoiceActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public MyInvoiceActivity f16015b;

    /* renamed from: c */
    public View f16016c;

    /* renamed from: d */
    public View f16017d;

    /* renamed from: e */
    public View f16018e;

    /* renamed from: f */
    public View f16019f;

    public MyInvoiceActivity_ViewBinding(MyInvoiceActivity myInvoiceActivity, View view) {
        this.f16015b = myInvoiceActivity;
        myInvoiceActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        myInvoiceActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
        myInvoiceActivity.sow_no = (TextView) C8522c.m36739c(view, 2131429184, "field 'sow_no'", TextView.class);
        myInvoiceActivity.sow_up = (TextView) C8522c.m36739c(view, 2131429186, "field 'sow_up'", TextView.class);
        myInvoiceActivity.sow_rf = (TextView) C8522c.m36739c(view, 2131429185, "field 'sow_rf'", TextView.class);
        myInvoiceActivity.sow_cnl = (TextView) C8522c.m36739c(view, 2131429183, "field 'sow_cnl'", TextView.class);
        myInvoiceActivity.loader_show = (AVLoadingIndicatorView) C8522c.m36739c(view, 2131428545, "field 'loader_show'", AVLoadingIndicatorView.class);
        myInvoiceActivity.loader_showup = (AVLoadingIndicatorView) C8522c.m36739c(view, 2131428548, "field 'loader_showup'", AVLoadingIndicatorView.class);
        myInvoiceActivity.loader_showrf = (AVLoadingIndicatorView) C8522c.m36739c(view, 2131428547, "field 'loader_showrf'", AVLoadingIndicatorView.class);
        myInvoiceActivity.loader_showcnl = (AVLoadingIndicatorView) C8522c.m36739c(view, 2131428546, "field 'loader_showcnl'", AVLoadingIndicatorView.class);
        View m36738b = C8522c.m36738b(view, 2131429654, "field 'unpaid_box' and method 'click'");
        myInvoiceActivity.unpaid_box = (LinearLayout) C8522c.m36737a(m36738b, 2131429654, "field 'unpaid_box'", LinearLayout.class);
        this.f16016c = m36738b;
        m36738b.setOnClickListener(new AbstractViewOnClickListenerC8521b(this, myInvoiceActivity) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.MyInvoiceActivity_ViewBinding.1

            /* renamed from: d */
            public final MyInvoiceActivity f16020d;

            /* renamed from: e */
            public final MyInvoiceActivity_ViewBinding f16021e;

            {
                this.f16021e = this;
                this.f16020d = myInvoiceActivity;
            }

            @Override // p316s2.AbstractViewOnClickListenerC8521b
            /* renamed from: b */
            public void mo14535b(View view2) {
                this.f16020d.click(view2);
            }
        });
        View m36738b2 = C8522c.m36738b(view, 2131428810, "field 'paid_box' and method 'click'");
        myInvoiceActivity.paid_box = (LinearLayout) C8522c.m36737a(m36738b2, 2131428810, "field 'paid_box'", LinearLayout.class);
        this.f16017d = m36738b2;
        m36738b2.setOnClickListener(new AbstractViewOnClickListenerC8521b(this, myInvoiceActivity) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.MyInvoiceActivity_ViewBinding.2

            /* renamed from: d */
            public final MyInvoiceActivity f16022d;

            /* renamed from: e */
            public final MyInvoiceActivity_ViewBinding f16023e;

            {
                this.f16023e = this;
                this.f16022d = myInvoiceActivity;
            }

            @Override // p316s2.AbstractViewOnClickListenerC8521b
            /* renamed from: b */
            public void mo14535b(View view2) {
                this.f16022d.click(view2);
            }
        });
        View m36738b3 = C8522c.m36738b(view, 2131428926, "field 'refound_box' and method 'click'");
        myInvoiceActivity.refound_box = (LinearLayout) C8522c.m36737a(m36738b3, 2131428926, "field 'refound_box'", LinearLayout.class);
        this.f16018e = m36738b3;
        m36738b3.setOnClickListener(new AbstractViewOnClickListenerC8521b(this, myInvoiceActivity) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.MyInvoiceActivity_ViewBinding.3

            /* renamed from: d */
            public final MyInvoiceActivity f16024d;

            /* renamed from: e */
            public final MyInvoiceActivity_ViewBinding f16025e;

            {
                this.f16025e = this;
                this.f16024d = myInvoiceActivity;
            }

            @Override // p316s2.AbstractViewOnClickListenerC8521b
            /* renamed from: b */
            public void mo14535b(View view2) {
                this.f16024d.click(view2);
            }
        });
        View m36738b4 = C8522c.m36738b(view, 2131427691, "field 'cancel_box' and method 'click'");
        myInvoiceActivity.cancel_box = (LinearLayout) C8522c.m36737a(m36738b4, 2131427691, "field 'cancel_box'", LinearLayout.class);
        this.f16019f = m36738b4;
        m36738b4.setOnClickListener(new AbstractViewOnClickListenerC8521b(this, myInvoiceActivity) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.MyInvoiceActivity_ViewBinding.4

            /* renamed from: d */
            public final MyInvoiceActivity f16026d;

            /* renamed from: e */
            public final MyInvoiceActivity_ViewBinding f16027e;

            {
                this.f16027e = this;
                this.f16026d = myInvoiceActivity;
            }

            @Override // p316s2.AbstractViewOnClickListenerC8521b
            /* renamed from: b */
            public void mo14535b(View view2) {
                this.f16026d.click(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        MyInvoiceActivity myInvoiceActivity = this.f16015b;
        if (myInvoiceActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f16015b = null;
        myInvoiceActivity.time = null;
        myInvoiceActivity.date = null;
        myInvoiceActivity.sow_no = null;
        myInvoiceActivity.sow_up = null;
        myInvoiceActivity.sow_rf = null;
        myInvoiceActivity.sow_cnl = null;
        myInvoiceActivity.loader_show = null;
        myInvoiceActivity.loader_showup = null;
        myInvoiceActivity.loader_showrf = null;
        myInvoiceActivity.loader_showcnl = null;
        myInvoiceActivity.unpaid_box = null;
        myInvoiceActivity.paid_box = null;
        myInvoiceActivity.refound_box = null;
        myInvoiceActivity.cancel_box = null;
        this.f16016c.setOnClickListener(null);
        this.f16016c = null;
        this.f16017d.setOnClickListener(null);
        this.f16017d = null;
        this.f16018e.setOnClickListener(null);
        this.f16018e = null;
        this.f16019f.setOnClickListener(null);
        this.f16019f = null;
    }
}

package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.wang.avi.AVLoadingIndicatorView;
import p316s2.AbstractViewOnClickListenerC8521b;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/MySerivcesActiviy_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/MySerivcesActiviy_ViewBinding.class */
public class MySerivcesActiviy_ViewBinding implements Unbinder {

    /* renamed from: b */
    public MySerivcesActiviy f16035b;

    /* renamed from: c */
    public View f16036c;

    /* renamed from: d */
    public View f16037d;

    /* renamed from: e */
    public View f16038e;

    /* renamed from: f */
    public View f16039f;

    /* renamed from: g */
    public View f16040g;

    /* renamed from: h */
    public View f16041h;

    public MySerivcesActiviy_ViewBinding(MySerivcesActiviy mySerivcesActiviy, View view) {
        this.f16035b = mySerivcesActiviy;
        mySerivcesActiviy.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
        mySerivcesActiviy.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        View m36738b = C8522c.m36738b(view, 2131428315, "field 'll_active' and method 'onclick'");
        mySerivcesActiviy.ll_active = (LinearLayout) C8522c.m36737a(m36738b, 2131428315, "field 'll_active'", LinearLayout.class);
        this.f16036c = m36738b;
        m36738b.setOnClickListener(new AbstractViewOnClickListenerC8521b(this, mySerivcesActiviy) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.MySerivcesActiviy_ViewBinding.1

            /* renamed from: d */
            public final MySerivcesActiviy f16042d;

            /* renamed from: e */
            public final MySerivcesActiviy_ViewBinding f16043e;

            {
                this.f16043e = this;
                this.f16042d = mySerivcesActiviy;
            }

            @Override // p316s2.AbstractViewOnClickListenerC8521b
            /* renamed from: b */
            public void mo14535b(View view2) {
                this.f16042d.onclick(view2);
            }
        });
        View m36738b2 = C8522c.m36738b(view, 2131428344, "field 'll_cancelled' and method 'onclick'");
        mySerivcesActiviy.ll_cancelled = (LinearLayout) C8522c.m36737a(m36738b2, 2131428344, "field 'll_cancelled'", LinearLayout.class);
        this.f16037d = m36738b2;
        m36738b2.setOnClickListener(new AbstractViewOnClickListenerC8521b(this, mySerivcesActiviy) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.MySerivcesActiviy_ViewBinding.2

            /* renamed from: d */
            public final MySerivcesActiviy f16044d;

            /* renamed from: e */
            public final MySerivcesActiviy_ViewBinding f16045e;

            {
                this.f16045e = this;
                this.f16044d = mySerivcesActiviy;
            }

            @Override // p316s2.AbstractViewOnClickListenerC8521b
            /* renamed from: b */
            public void mo14535b(View view2) {
                this.f16044d.onclick(view2);
            }
        });
        View m36738b3 = C8522c.m36738b(view, 2131428465, "field 'll_pending' and method 'onclick'");
        mySerivcesActiviy.ll_pending = (LinearLayout) C8522c.m36737a(m36738b3, 2131428465, "field 'll_pending'", LinearLayout.class);
        this.f16038e = m36738b3;
        m36738b3.setOnClickListener(new AbstractViewOnClickListenerC8521b(this, mySerivcesActiviy) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.MySerivcesActiviy_ViewBinding.3

            /* renamed from: d */
            public final MySerivcesActiviy f16046d;

            /* renamed from: e */
            public final MySerivcesActiviy_ViewBinding f16047e;

            {
                this.f16047e = this;
                this.f16046d = mySerivcesActiviy;
            }

            @Override // p316s2.AbstractViewOnClickListenerC8521b
            /* renamed from: b */
            public void mo14535b(View view2) {
                this.f16046d.onclick(view2);
            }
        });
        View m36738b4 = C8522c.m36738b(view, 2131428518, "field 'll_suspended' and method 'onclick'");
        mySerivcesActiviy.ll_suspended = (LinearLayout) C8522c.m36737a(m36738b4, 2131428518, "field 'll_suspended'", LinearLayout.class);
        this.f16039f = m36738b4;
        m36738b4.setOnClickListener(new AbstractViewOnClickListenerC8521b(this, mySerivcesActiviy) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.MySerivcesActiviy_ViewBinding.4

            /* renamed from: d */
            public final MySerivcesActiviy f16048d;

            /* renamed from: e */
            public final MySerivcesActiviy_ViewBinding f16049e;

            {
                this.f16049e = this;
                this.f16048d = mySerivcesActiviy;
            }

            @Override // p316s2.AbstractViewOnClickListenerC8521b
            /* renamed from: b */
            public void mo14535b(View view2) {
                this.f16048d.onclick(view2);
            }
        });
        View m36738b5 = C8522c.m36738b(view, 2131428521, "field 'll_terminated' and method 'onclick'");
        mySerivcesActiviy.ll_terminated = (LinearLayout) C8522c.m36737a(m36738b5, 2131428521, "field 'll_terminated'", LinearLayout.class);
        this.f16040g = m36738b5;
        m36738b5.setOnClickListener(new AbstractViewOnClickListenerC8521b(this, mySerivcesActiviy) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.MySerivcesActiviy_ViewBinding.5

            /* renamed from: d */
            public final MySerivcesActiviy f16050d;

            /* renamed from: e */
            public final MySerivcesActiviy_ViewBinding f16051e;

            {
                this.f16051e = this;
                this.f16050d = mySerivcesActiviy;
            }

            @Override // p316s2.AbstractViewOnClickListenerC8521b
            /* renamed from: b */
            public void mo14535b(View view2) {
                this.f16050d.onclick(view2);
            }
        });
        View m36738b6 = C8522c.m36738b(view, 2131428409, "field 'll_fraud' and method 'onclick'");
        mySerivcesActiviy.ll_fraud = (LinearLayout) C8522c.m36737a(m36738b6, 2131428409, "field 'll_fraud'", LinearLayout.class);
        this.f16041h = m36738b6;
        m36738b6.setOnClickListener(new AbstractViewOnClickListenerC8521b(this, mySerivcesActiviy) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.MySerivcesActiviy_ViewBinding.6

            /* renamed from: d */
            public final MySerivcesActiviy f16052d;

            /* renamed from: e */
            public final MySerivcesActiviy_ViewBinding f16053e;

            {
                this.f16053e = this;
                this.f16052d = mySerivcesActiviy;
            }

            @Override // p316s2.AbstractViewOnClickListenerC8521b
            /* renamed from: b */
            public void mo14535b(View view2) {
                this.f16052d.onclick(view2);
            }
        });
        mySerivcesActiviy.pb_loader_pending = (AVLoadingIndicatorView) C8522c.m36739c(view, 2131428835, "field 'pb_loader_pending'", AVLoadingIndicatorView.class);
        mySerivcesActiviy.pb_loader_active = (AVLoadingIndicatorView) C8522c.m36739c(view, 2131428831, "field 'pb_loader_active'", AVLoadingIndicatorView.class);
        mySerivcesActiviy.pb_loader_cancelled = (AVLoadingIndicatorView) C8522c.m36739c(view, 2131428832, "field 'pb_loader_cancelled'", AVLoadingIndicatorView.class);
        mySerivcesActiviy.pb_loader_suspended = (AVLoadingIndicatorView) C8522c.m36739c(view, 2131428837, "field 'pb_loader_suspended'", AVLoadingIndicatorView.class);
        mySerivcesActiviy.pb_loader_terminated = (AVLoadingIndicatorView) C8522c.m36739c(view, 2131428838, "field 'pb_loader_terminated'", AVLoadingIndicatorView.class);
        mySerivcesActiviy.pb_loader_fraud = (AVLoadingIndicatorView) C8522c.m36739c(view, 2131428833, "field 'pb_loader_fraud'", AVLoadingIndicatorView.class);
        mySerivcesActiviy.tv_active_count = (TextView) C8522c.m36739c(view, 2131429347, "field 'tv_active_count'", TextView.class);
        mySerivcesActiviy.tv_cancelled_count = (TextView) C8522c.m36739c(view, 2131429370, "field 'tv_cancelled_count'", TextView.class);
        mySerivcesActiviy.tv_pending_count = (TextView) C8522c.m36739c(view, 2131429553, "field 'tv_pending_count'", TextView.class);
        mySerivcesActiviy.tv_suspended_count = (TextView) C8522c.m36739c(view, 2131429624, "field 'tv_suspended_count'", TextView.class);
        mySerivcesActiviy.tv_terminated_count = (TextView) C8522c.m36739c(view, 2131429627, "field 'tv_terminated_count'", TextView.class);
        mySerivcesActiviy.tv_fraud_count = (TextView) C8522c.m36739c(view, 2131429461, "field 'tv_fraud_count'", TextView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        MySerivcesActiviy mySerivcesActiviy = this.f16035b;
        if (mySerivcesActiviy == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f16035b = null;
        mySerivcesActiviy.date = null;
        mySerivcesActiviy.time = null;
        mySerivcesActiviy.ll_active = null;
        mySerivcesActiviy.ll_cancelled = null;
        mySerivcesActiviy.ll_pending = null;
        mySerivcesActiviy.ll_suspended = null;
        mySerivcesActiviy.ll_terminated = null;
        mySerivcesActiviy.ll_fraud = null;
        mySerivcesActiviy.pb_loader_pending = null;
        mySerivcesActiviy.pb_loader_active = null;
        mySerivcesActiviy.pb_loader_cancelled = null;
        mySerivcesActiviy.pb_loader_suspended = null;
        mySerivcesActiviy.pb_loader_terminated = null;
        mySerivcesActiviy.pb_loader_fraud = null;
        mySerivcesActiviy.tv_active_count = null;
        mySerivcesActiviy.tv_cancelled_count = null;
        mySerivcesActiviy.tv_pending_count = null;
        mySerivcesActiviy.tv_suspended_count = null;
        mySerivcesActiviy.tv_terminated_count = null;
        mySerivcesActiviy.tv_fraud_count = null;
        this.f16036c.setOnClickListener(null);
        this.f16036c = null;
        this.f16037d.setOnClickListener(null);
        this.f16037d = null;
        this.f16038e.setOnClickListener(null);
        this.f16038e = null;
        this.f16039f.setOnClickListener(null);
        this.f16039f = null;
        this.f16040g.setOnClickListener(null);
        this.f16040g = null;
        this.f16041h.setOnClickListener(null);
        this.f16041h = null;
    }
}

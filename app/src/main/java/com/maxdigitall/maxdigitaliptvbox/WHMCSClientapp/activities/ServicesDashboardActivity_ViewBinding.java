package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.wang.avi.AVLoadingIndicatorView;
import p316s2.AbstractViewOnClickListenerC8521b;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/ServicesDashboardActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/ServicesDashboardActivity_ViewBinding.class */
public class ServicesDashboardActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public ServicesDashboardActivity f16115b;

    /* renamed from: c */
    public View f16116c;

    /* renamed from: d */
    public View f16117d;

    /* renamed from: e */
    public View f16118e;

    /* renamed from: f */
    public View f16119f;

    /* renamed from: g */
    public View f16120g;

    /* renamed from: h */
    public View f16121h;

    /* renamed from: i */
    public View f16122i;

    /* renamed from: j */
    public View f16123j;

    public ServicesDashboardActivity_ViewBinding(ServicesDashboardActivity servicesDashboardActivity, View view) {
        this.f16115b = servicesDashboardActivity;
        servicesDashboardActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
        servicesDashboardActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        servicesDashboardActivity.pb_loader_service = (AVLoadingIndicatorView) C8522c.m36739c(view, 2131428836, "field 'pb_loader_service'", AVLoadingIndicatorView.class);
        servicesDashboardActivity.pb_loader_invoice = (AVLoadingIndicatorView) C8522c.m36739c(view, 2131428834, "field 'pb_loader_invoice'", AVLoadingIndicatorView.class);
        servicesDashboardActivity.pb_loader_ticket = (AVLoadingIndicatorView) C8522c.m36739c(view, 2131428839, "field 'pb_loader_ticket'", AVLoadingIndicatorView.class);
        servicesDashboardActivity.tv_service_count = (TextView) C8522c.m36739c(view, 2131429605, "field 'tv_service_count'", TextView.class);
        servicesDashboardActivity.tv_invoice_count = (TextView) C8522c.m36739c(view, 2131429473, "field 'tv_invoice_count'", TextView.class);
        servicesDashboardActivity.tv_ticket_count = (TextView) C8522c.m36739c(view, 2131429629, "field 'tv_ticket_count'", TextView.class);
        View m36738b = C8522c.m36738b(view, 2131428229, "field 'iv_settings' and method 'onclick'");
        servicesDashboardActivity.iv_settings = (ImageView) C8522c.m36737a(m36738b, 2131428229, "field 'iv_settings'", ImageView.class);
        this.f16116c = m36738b;
        m36738b.setOnClickListener(new AbstractViewOnClickListenerC8521b(this, servicesDashboardActivity) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.ServicesDashboardActivity_ViewBinding.1

            /* renamed from: d */
            public final ServicesDashboardActivity f16124d;

            /* renamed from: e */
            public final ServicesDashboardActivity_ViewBinding f16125e;

            {
                this.f16125e = this;
                this.f16124d = servicesDashboardActivity;
            }

            @Override // p316s2.AbstractViewOnClickListenerC8521b
            /* renamed from: b */
            public void mo14535b(View view2) {
                this.f16124d.onclick(view2);
            }
        });
        View m36738b2 = C8522c.m36738b(view, 2131429252, "field 'ivSwitchUser' and method 'onclick'");
        servicesDashboardActivity.ivSwitchUser = (ImageView) C8522c.m36737a(m36738b2, 2131429252, "field 'ivSwitchUser'", ImageView.class);
        this.f16117d = m36738b2;
        m36738b2.setOnClickListener(new AbstractViewOnClickListenerC8521b(this, servicesDashboardActivity) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.ServicesDashboardActivity_ViewBinding.2

            /* renamed from: d */
            public final ServicesDashboardActivity f16126d;

            /* renamed from: e */
            public final ServicesDashboardActivity_ViewBinding f16127e;

            {
                this.f16127e = this;
                this.f16126d = servicesDashboardActivity;
            }

            @Override // p316s2.AbstractViewOnClickListenerC8521b
            /* renamed from: b */
            public void mo14535b(View view2) {
                this.f16126d.onclick(view2);
            }
        });
        View m36738b3 = C8522c.m36738b(view, 2131428205, "field 'iv_notification' and method 'onclick'");
        servicesDashboardActivity.iv_notification = (ImageView) C8522c.m36737a(m36738b3, 2131428205, "field 'iv_notification'", ImageView.class);
        this.f16118e = m36738b3;
        m36738b3.setOnClickListener(new AbstractViewOnClickListenerC8521b(this, servicesDashboardActivity) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.ServicesDashboardActivity_ViewBinding.3

            /* renamed from: d */
            public final ServicesDashboardActivity f16128d;

            /* renamed from: e */
            public final ServicesDashboardActivity_ViewBinding f16129e;

            {
                this.f16129e = this;
                this.f16128d = servicesDashboardActivity;
            }

            @Override // p316s2.AbstractViewOnClickListenerC8521b
            /* renamed from: b */
            public void mo14535b(View view2) {
                this.f16128d.onclick(view2);
            }
        });
        servicesDashboardActivity.tv_notification = (TextView) C8522c.m36739c(view, 2131429545, "field 'tv_notification'", TextView.class);
        View m36738b4 = C8522c.m36738b(view, 2131427397, "field 'account_info' and method 'onclick'");
        servicesDashboardActivity.account_info = (ImageView) C8522c.m36737a(m36738b4, 2131427397, "field 'account_info'", ImageView.class);
        this.f16119f = m36738b4;
        m36738b4.setOnClickListener(new AbstractViewOnClickListenerC8521b(this, servicesDashboardActivity) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.ServicesDashboardActivity_ViewBinding.4

            /* renamed from: d */
            public final ServicesDashboardActivity f16130d;

            /* renamed from: e */
            public final ServicesDashboardActivity_ViewBinding f16131e;

            {
                this.f16131e = this;
                this.f16130d = servicesDashboardActivity;
            }

            @Override // p316s2.AbstractViewOnClickListenerC8521b
            /* renamed from: b */
            public void mo14535b(View view2) {
                this.f16130d.onclick(view2);
            }
        });
        servicesDashboardActivity.tvAccountinfoButton = (TextView) C8522c.m36739c(view, 2131429344, "field 'tvAccountinfoButton'", TextView.class);
        View m36738b5 = C8522c.m36738b(view, 2131428505, "field 'll_services' and method 'onclick'");
        servicesDashboardActivity.ll_services = (LinearLayout) C8522c.m36737a(m36738b5, 2131428505, "field 'll_services'", LinearLayout.class);
        this.f16120g = m36738b5;
        m36738b5.setOnClickListener(new AbstractViewOnClickListenerC8521b(this, servicesDashboardActivity) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.ServicesDashboardActivity_ViewBinding.5

            /* renamed from: d */
            public final ServicesDashboardActivity f16132d;

            /* renamed from: e */
            public final ServicesDashboardActivity_ViewBinding f16133e;

            {
                this.f16133e = this;
                this.f16132d = servicesDashboardActivity;
            }

            @Override // p316s2.AbstractViewOnClickListenerC8521b
            /* renamed from: b */
            public void mo14535b(View view2) {
                this.f16132d.onclick(view2);
            }
        });
        View m36738b6 = C8522c.m36738b(view, 2131428422, "field 'll_invoices' and method 'onclick'");
        servicesDashboardActivity.ll_invoices = (LinearLayout) C8522c.m36737a(m36738b6, 2131428422, "field 'll_invoices'", LinearLayout.class);
        this.f16121h = m36738b6;
        m36738b6.setOnClickListener(new AbstractViewOnClickListenerC8521b(this, servicesDashboardActivity) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.ServicesDashboardActivity_ViewBinding.6

            /* renamed from: d */
            public final ServicesDashboardActivity f16134d;

            /* renamed from: e */
            public final ServicesDashboardActivity_ViewBinding f16135e;

            {
                this.f16135e = this;
                this.f16134d = servicesDashboardActivity;
            }

            @Override // p316s2.AbstractViewOnClickListenerC8521b
            /* renamed from: b */
            public void mo14535b(View view2) {
                this.f16134d.onclick(view2);
            }
        });
        View m36738b7 = C8522c.m36738b(view, 2131428524, "field 'll_tickets' and method 'onclick'");
        servicesDashboardActivity.ll_tickets = (LinearLayout) C8522c.m36737a(m36738b7, 2131428524, "field 'll_tickets'", LinearLayout.class);
        this.f16122i = m36738b7;
        m36738b7.setOnClickListener(new AbstractViewOnClickListenerC8521b(this, servicesDashboardActivity) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.ServicesDashboardActivity_ViewBinding.7

            /* renamed from: d */
            public final ServicesDashboardActivity f16136d;

            /* renamed from: e */
            public final ServicesDashboardActivity_ViewBinding f16137e;

            {
                this.f16137e = this;
                this.f16136d = servicesDashboardActivity;
            }

            @Override // p316s2.AbstractViewOnClickListenerC8521b
            /* renamed from: b */
            public void mo14535b(View view2) {
                this.f16136d.onclick(view2);
            }
        });
        servicesDashboardActivity.ll_buy_now = (LinearLayout) C8522c.m36739c(view, 2131428342, "field 'll_buy_now'", LinearLayout.class);
        servicesDashboardActivity.tv_freetrai_time = (TextView) C8522c.m36739c(view, 2131429463, "field 'tv_freetrai_time'", TextView.class);
        servicesDashboardActivity.tv_free_trial_title = (TextView) C8522c.m36739c(view, 2131429462, "field 'tv_free_trial_title'", TextView.class);
        View m36738b8 = C8522c.m36738b(view, 2131427635, "field 'btn_buy_now' and method 'onclick'");
        servicesDashboardActivity.btn_buy_now = (Button) C8522c.m36737a(m36738b8, 2131427635, "field 'btn_buy_now'", Button.class);
        this.f16123j = m36738b8;
        m36738b8.setOnClickListener(new AbstractViewOnClickListenerC8521b(this, servicesDashboardActivity) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.ServicesDashboardActivity_ViewBinding.8

            /* renamed from: d */
            public final ServicesDashboardActivity f16138d;

            /* renamed from: e */
            public final ServicesDashboardActivity_ViewBinding f16139e;

            {
                this.f16139e = this;
                this.f16138d = servicesDashboardActivity;
            }

            @Override // p316s2.AbstractViewOnClickListenerC8521b
            /* renamed from: b */
            public void mo14535b(View view2) {
                this.f16138d.onclick(view2);
            }
        });
        servicesDashboardActivity.tvSwitchUserButton = (TextView) C8522c.m36739c(view, 2131429625, "field 'tvSwitchUserButton'", TextView.class);
        servicesDashboardActivity.tvSettingsButton = (TextView) C8522c.m36739c(view, 2131429608, "field 'tvSettingsButton'", TextView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        ServicesDashboardActivity servicesDashboardActivity = this.f16115b;
        if (servicesDashboardActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f16115b = null;
        servicesDashboardActivity.date = null;
        servicesDashboardActivity.time = null;
        servicesDashboardActivity.pb_loader_service = null;
        servicesDashboardActivity.pb_loader_invoice = null;
        servicesDashboardActivity.pb_loader_ticket = null;
        servicesDashboardActivity.tv_service_count = null;
        servicesDashboardActivity.tv_invoice_count = null;
        servicesDashboardActivity.tv_ticket_count = null;
        servicesDashboardActivity.iv_settings = null;
        servicesDashboardActivity.ivSwitchUser = null;
        servicesDashboardActivity.iv_notification = null;
        servicesDashboardActivity.tv_notification = null;
        servicesDashboardActivity.account_info = null;
        servicesDashboardActivity.tvAccountinfoButton = null;
        servicesDashboardActivity.ll_services = null;
        servicesDashboardActivity.ll_invoices = null;
        servicesDashboardActivity.ll_tickets = null;
        servicesDashboardActivity.ll_buy_now = null;
        servicesDashboardActivity.tv_freetrai_time = null;
        servicesDashboardActivity.tv_free_trial_title = null;
        servicesDashboardActivity.btn_buy_now = null;
        servicesDashboardActivity.tvSwitchUserButton = null;
        servicesDashboardActivity.tvSettingsButton = null;
        this.f16116c.setOnClickListener(null);
        this.f16116c = null;
        this.f16117d.setOnClickListener(null);
        this.f16117d = null;
        this.f16118e.setOnClickListener(null);
        this.f16118e = null;
        this.f16119f.setOnClickListener(null);
        this.f16119f = null;
        this.f16120g.setOnClickListener(null);
        this.f16120g = null;
        this.f16121h.setOnClickListener(null);
        this.f16121h = null;
        this.f16122i.setOnClickListener(null);
        this.f16122i = null;
        this.f16123j.setOnClickListener(null);
        this.f16123j = null;
    }
}

package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities;

import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import butterknife.Unbinder;
import p316s2.AbstractViewOnClickListenerC8521b;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/InvoicePaidDetailActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/InvoicePaidDetailActivity_ViewBinding.class */
public class InvoicePaidDetailActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public InvoicePaidDetailActivity f16000b;

    /* renamed from: c */
    public View f16001c;

    public InvoicePaidDetailActivity_ViewBinding(InvoicePaidDetailActivity invoicePaidDetailActivity, View view) {
        this.f16000b = invoicePaidDetailActivity;
        invoicePaidDetailActivity.webview = (WebView) C8522c.m36739c(view, 2131429694, "field 'webview'", WebView.class);
        View m36738b = C8522c.m36738b(view, 2131427562, "field 'back' and method 'onClick'");
        invoicePaidDetailActivity.back = (Button) C8522c.m36737a(m36738b, 2131427562, "field 'back'", Button.class);
        this.f16001c = m36738b;
        m36738b.setOnClickListener(new AbstractViewOnClickListenerC8521b(this, invoicePaidDetailActivity) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.InvoicePaidDetailActivity_ViewBinding.1

            /* renamed from: d */
            public final InvoicePaidDetailActivity f16002d;

            /* renamed from: e */
            public final InvoicePaidDetailActivity_ViewBinding f16003e;

            {
                this.f16003e = this;
                this.f16002d = invoicePaidDetailActivity;
            }

            @Override // p316s2.AbstractViewOnClickListenerC8521b
            /* renamed from: b */
            public void mo14535b(View view2) {
                this.f16002d.onClick(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        InvoicePaidDetailActivity invoicePaidDetailActivity = this.f16000b;
        if (invoicePaidDetailActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f16000b = null;
        invoicePaidDetailActivity.webview = null;
        invoicePaidDetailActivity.back = null;
        this.f16001c.setOnClickListener(null);
        this.f16001c = null;
    }
}

package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.fragment;

import android.view.View;
import android.webkit.WebView;
import butterknife.Unbinder;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/fragment/InvoiceFragment_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/fragment/InvoiceFragment_ViewBinding.class */
public class InvoiceFragment_ViewBinding implements Unbinder {

    /* renamed from: b */
    public InvoiceFragment f16265b;

    public InvoiceFragment_ViewBinding(InvoiceFragment invoiceFragment, View view) {
        this.f16265b = invoiceFragment;
        invoiceFragment.webView = (WebView) C8522c.m36739c(view, 2131429694, "field 'webView'", WebView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        InvoiceFragment invoiceFragment = this.f16265b;
        if (invoiceFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f16265b = null;
        invoiceFragment.webView = null;
    }
}

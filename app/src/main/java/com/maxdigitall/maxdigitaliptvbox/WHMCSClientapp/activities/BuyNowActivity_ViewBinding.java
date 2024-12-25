package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities;

import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import butterknife.Unbinder;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/BuyNowActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/BuyNowActivity_ViewBinding.class */
public class BuyNowActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public BuyNowActivity f15937b;

    public BuyNowActivity_ViewBinding(BuyNowActivity buyNowActivity, View view) {
        this.f15937b = buyNowActivity;
        buyNowActivity.webview = (WebView) C8522c.m36739c(view, 2131429694, "field 'webview'", WebView.class);
        buyNowActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
        buyNowActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        buyNowActivity.tv_title = (TextView) C8522c.m36739c(view, 2131429631, "field 'tv_title'", TextView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        BuyNowActivity buyNowActivity = this.f15937b;
        if (buyNowActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f15937b = null;
        buyNowActivity.webview = null;
        buyNowActivity.date = null;
        buyNowActivity.time = null;
        buyNowActivity.tv_title = null;
    }
}

package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import androidx.appcompat.app.ActivityC0243b;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.Clientdatabase.ClientSharepreferenceHandler;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/InvoicePaidDetailActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/InvoicePaidDetailActivity.class */
public class InvoicePaidDetailActivity extends ActivityC0243b {

    @BindView
    public Button back;

    /* renamed from: d */
    public String f15996d = "";

    /* renamed from: e */
    public String f15997e = "";

    /* renamed from: f */
    public String f15998f = "";

    /* renamed from: g */
    public Context f15999g;

    @BindView
    public WebView webview;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, (Class<?>) MyInvoiceActivity.class));
    }

    @OnClick
    public void onClick(View view) {
        if (view.getId() != 2131427562) {
            return;
        }
        startActivity(this.f15997e.equalsIgnoreCase("paid") ? new Intent(this, (Class<?>) PaidInvoiceActivity.class) : this.f15997e.equalsIgnoreCase("Unpaid") ? new Intent(this, (Class<?>) UnpiadInvoiceActivity.class) : this.f15997e.equalsIgnoreCase("Cancelled") ? new Intent(this, (Class<?>) CancelInvoiceActivity.class) : this.f15997e.equalsIgnoreCase("Refund") ? new Intent(this, (Class<?>) InvoiceRefundedActivity.class) : new Intent(this, (Class<?>) MyInvoiceActivity.class));
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624005);
        ButterKnife.m5626a(this);
        this.f15999g = this;
        Intent intent = getIntent();
        this.f15997e = intent.getStringExtra("status");
        this.f15996d = intent.getStringExtra("invoice_id");
        m14534q0();
    }

    /* renamed from: q0 */
    public final void m14534q0() {
        if (this.f15996d != null) {
            WebView webView = (WebView) findViewById(2131429694);
            this.webview = webView;
            webView.loadUrl("https://cms.alldrama.tv/viewinvoice.php?id=" + this.f15996d + "&loginemail=" + ClientSharepreferenceHandler.m14492c(this.f15999g) + "&api_username=OUBQqC6334OcxjS&gotourl=viewinvoice.php?id=" + this.f15996d);
        }
    }
}

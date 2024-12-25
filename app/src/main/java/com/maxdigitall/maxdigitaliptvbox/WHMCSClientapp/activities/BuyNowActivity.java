package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0243b;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.Clientdatabase.ClientSharepreferenceHandler;
import java.util.Calendar;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/BuyNowActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/BuyNowActivity.class */
public class BuyNowActivity extends ActivityC0243b {

    @BindView
    public TextView date;

    /* renamed from: f */
    public ProgressDialog f15929f;

    /* renamed from: g */
    public Context f15930g;

    @BindView
    public TextView time;

    @BindView
    public TextView tv_title;

    @BindView
    public WebView webview;

    /* renamed from: d */
    public String f15927d = "";

    /* renamed from: e */
    public String f15928e = "";

    /* renamed from: h */
    public String f15931h = "";

    /* renamed from: i */
    public String f15932i = "";

    /* renamed from: j */
    public String f15933j = "";

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/BuyNowActivity$CountDownRunner.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/BuyNowActivity$CountDownRunner.class */
    public class CountDownRunner implements Runnable {

        /* renamed from: b */
        public final BuyNowActivity f15936b;

        public CountDownRunner(BuyNowActivity buyNowActivity) {
            this.f15936b = buyNowActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f15936b.m14505s0();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                } catch (Exception e11) {
                }
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Intent intent = new Intent(this, (Class<?>) ServicesDashboardActivity.class);
        intent.setFlags(67141632);
        intent.setAction("check_buy_now");
        startActivity(intent);
        finish();
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131623977);
        ButterKnife.m5626a(this);
        this.tv_title.setText(getResources().getString(2132017184));
        Intent intent = getIntent();
        this.f15931h = intent.getAction();
        new Thread(new CountDownRunner(this)).start();
        this.f15930g = this;
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f15929f = progressDialog;
        progressDialog.setMessage(this.f15930g.getResources().getString(2132018355));
        this.f15929f.show();
        this.f15929f.setCancelable(false);
        Context context = this.f15930g;
        if (context != null) {
            this.f15929f.setMessage(context.getResources().getString(2132018355));
        }
        this.webview.getSettings().setJavaScriptEnabled(true);
        this.webview.getSettings().setLoadWithOverviewMode(true);
        this.webview.getSettings().setUseWideViewPort(true);
        this.webview.setWebViewClient(new WebViewClient(this) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.BuyNowActivity.1

            /* renamed from: a */
            public final BuyNowActivity f15934a;

            {
                this.f15934a = this;
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                this.f15934a.f15929f.dismiss();
                this.f15934a.webview.setVisibility(0);
            }
        });
        String str = this.f15931h;
        if (str == null || !str.equalsIgnoreCase("Invoice_action")) {
            this.f15928e = intent.getStringExtra("service_id");
            m14504r0();
        } else {
            this.f15933j = intent.getStringExtra("status");
            this.f15932i = intent.getStringExtra("invoice_id");
            m14503q0();
        }
    }

    /* renamed from: q0 */
    public final void m14503q0() {
        if (this.f15932i != null) {
            this.webview.loadUrl("https://cms.alldrama.tv/viewinvoice.php?id=" + this.f15932i + "&loginemail=" + ClientSharepreferenceHandler.m14492c(this.f15930g) + "&api_username=OUBQqC6334OcxjS&gotourl=viewinvoice.php?id=" + this.f15932i);
        }
    }

    /* renamed from: r0 */
    public final void m14504r0() {
        this.webview.loadUrl("http://51.75.16.104/upgrade.php?type=package&id=" + this.f15928e + "&loginemail=" + ClientSharepreferenceHandler.m14492c(this) + "&api_username=OUBQqC6334OcxjS&gotourl=upgrade.php");
    }

    /* renamed from: s0 */
    public void m14505s0() {
        runOnUiThread(new Runnable(this) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.BuyNowActivity.2

            /* renamed from: b */
            public final BuyNowActivity f15935b;

            {
                this.f15935b = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    String date = Calendar.getInstance().getTime().toString();
                    String m26199B = C5255e.m26199B(this.f15935b.f15930g);
                    String m26249p = C5255e.m26249p(date);
                    TextView textView = this.f15935b.time;
                    if (textView != null) {
                        textView.setText(m26199B);
                    }
                    TextView textView2 = this.f15935b.date;
                    if (textView2 != null) {
                        textView2.setText(m26249p);
                    }
                } catch (Exception e10) {
                }
            }
        });
    }
}

package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import java.util.Calendar;
import nf.C6783a;
import p151if.C5251a;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RateUsActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RateUsActivity.class */
public class RateUsActivity extends ActivityC0243b {

    @BindView
    public Button btn_later;

    @BindView
    public Button btn_rateus;

    /* renamed from: d */
    public Context f18053d;

    @BindView
    public TextView date;

    /* renamed from: e */
    public C6783a f18054e;

    /* renamed from: f */
    public Thread f18055f = null;

    @BindView
    public ImageView logo;

    @BindView
    public TextView time;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RateUsActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.RateUsActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RateUsActivity$a.class */
    public class ViewOnClickListenerC2952a implements View.OnClickListener {

        /* renamed from: b */
        public final RateUsActivity f18056b;

        public ViewOnClickListenerC2952a(RateUsActivity rateUsActivity) {
            this.f18056b = rateUsActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f18056b.f18053d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RateUsActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.RateUsActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RateUsActivity$b.class */
    public class RunnableC2953b implements Runnable {

        /* renamed from: b */
        public final RateUsActivity f18057b;

        public RunnableC2953b(RateUsActivity rateUsActivity) {
            this.f18057b = rateUsActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String date = Calendar.getInstance().getTime().toString();
                String m26199B = C5255e.m26199B(this.f18057b.f18053d);
                String m26249p = C5255e.m26249p(date);
                TextView textView = this.f18057b.time;
                if (textView != null) {
                    textView.setText(m26199B);
                }
                TextView textView2 = this.f18057b.date;
                if (textView2 != null) {
                    textView2.setText(m26249p);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RateUsActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.RateUsActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RateUsActivity$c.class */
    public class RunnableC2954c implements Runnable {

        /* renamed from: b */
        public final RateUsActivity f18058b;

        public RunnableC2954c(RateUsActivity rateUsActivity) {
            this.f18058b = rateUsActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f18058b.m16265q0();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                } catch (Exception e11) {
                }
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f18053d = this;
        super.onCreate(bundle);
        C6783a c6783a = new C6783a(this.f18053d);
        this.f18054e = c6783a;
        setContentView(c6783a.m31288z().equals(C5251a.f30065s0) ? 2131624034 : 2131624033);
        ButterKnife.m5626a(this);
        Button button = this.btn_rateus;
        button.setOnFocusChangeListener(new C5255e.i((View) button, this));
        this.btn_rateus.requestFocus();
        this.btn_rateus.requestFocusFromTouch();
        Button button2 = this.btn_later;
        button2.setOnFocusChangeListener(new C5255e.i((View) button2, this));
        Thread thread = this.f18055f;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC2954c(this));
            this.f18055f = thread2;
            thread2.start();
        }
        this.logo.setOnClickListener(new ViewOnClickListenerC2952a(this));
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f18055f;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f18055f.interrupt();
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f18055f;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC2954c(this));
            this.f18055f = thread2;
            thread2.start();
        }
        overridePendingTransition(2130772003, 2130772000);
    }

    @OnClick
    public void onViewClicked(View view) {
        int id2 = view.getId();
        if (id2 == 2131427649) {
            SharepreferenceDBHandler.m15359W(0, this.f18053d);
            onBackPressed();
            return;
        }
        if (id2 != 2131427664) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + getApplicationContext().getPackageName()));
            SharepreferenceDBHandler.m15360X(true, this.f18053d);
            startActivity(intent);
        } catch (Exception e10) {
            Toast.makeText(this.f18053d, getResources().getString(2132017572), 0).show();
        }
    }

    /* renamed from: q0 */
    public void m16265q0() {
        runOnUiThread(new RunnableC2953b(this));
    }
}

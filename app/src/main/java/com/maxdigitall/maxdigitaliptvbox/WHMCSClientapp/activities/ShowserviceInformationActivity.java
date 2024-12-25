package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0243b;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.Clientdatabase.ClientSharepreferenceHandler;
import java.util.Calendar;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/ShowserviceInformationActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/ShowserviceInformationActivity.class */
public class ShowserviceInformationActivity extends ActivityC0243b {

    @BindView
    public Button btn_back;

    @BindView
    public Button btn_service_home;

    /* renamed from: d */
    public Context f16140d;

    @BindView
    public TextView date;

    /* renamed from: e */
    public String f16141e = "";

    /* renamed from: f */
    public String f16142f = "";

    /* renamed from: g */
    public String f16143g = "";

    /* renamed from: h */
    public String f16144h = "";

    /* renamed from: i */
    public String f16145i = "";

    /* renamed from: j */
    public String f16146j = "";

    /* renamed from: k */
    public String f16147k = "";

    /* renamed from: l */
    public String f16148l = "";

    /* renamed from: m */
    public Thread f16149m = null;

    @BindView
    public TextView time;

    @BindView
    public TextView tv_billing_cycle;

    @BindView
    public TextView tv_first_time_payment;

    @BindView
    public TextView tv_next_due_date;

    @BindView
    public TextView tv_payment_method;

    @BindView
    public TextView tv_product;

    @BindView
    public TextView tv_recurring_amount;

    @BindView
    public TextView tv_registration_date;

    @BindView
    public TextView tv_status;

    @BindView
    public TextView tv_title;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/ShowserviceInformationActivity$CountDownRunner.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/ShowserviceInformationActivity$CountDownRunner.class */
    public class CountDownRunner implements Runnable {

        /* renamed from: b */
        public final ShowserviceInformationActivity f16153b;

        public CountDownRunner(ShowserviceInformationActivity showserviceInformationActivity) {
            this.f16153b = showserviceInformationActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f16153b.m14582q0();
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
        TextView textView;
        String string;
        TextView textView2;
        String string2;
        TextView textView3;
        String string3;
        TextView textView4;
        String string4;
        TextView textView5;
        String string5;
        TextView textView6;
        String string6;
        TextView textView7;
        String string7;
        super.onCreate(bundle);
        setContentView(2131624061);
        ButterKnife.m5626a(this);
        this.f16140d = this;
        Thread thread = this.f16149m;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new CountDownRunner(this));
            this.f16149m = thread2;
            thread2.start();
        }
        Intent intent = getIntent();
        this.f16141e = intent.getStringExtra("product");
        this.f16142f = intent.getStringExtra("status");
        this.f16143g = intent.getStringExtra("Registration_date");
        this.f16144h = intent.getStringExtra("next_due_date");
        this.f16145i = intent.getStringExtra("recurring_amount");
        this.f16148l = intent.getStringExtra("billing_cycle");
        this.f16146j = intent.getStringExtra("payment_method");
        this.f16147k = intent.getStringExtra("first_time_payment");
        if (this.f16148l.equalsIgnoreCase("Free Account")) {
            string2 = "- - -";
            this.tv_next_due_date.setText("- - -");
            textView2 = this.tv_recurring_amount;
        } else {
            String str = this.f16144h;
            if (str == null || str.equalsIgnoreCase("")) {
                textView = this.tv_next_due_date;
                string = getResources().getString(2132017171);
            } else {
                textView = this.tv_next_due_date;
                string = this.f16144h;
            }
            textView.setText(string);
            String str2 = this.f16145i;
            if (str2 == null || str2.equalsIgnoreCase("")) {
                textView2 = this.tv_recurring_amount;
                string2 = getResources().getString(2132017171);
            } else {
                textView2 = this.tv_recurring_amount;
                string2 = ClientSharepreferenceHandler.m14493d(this.f16140d) + this.f16145i + ClientSharepreferenceHandler.m14494e(this.f16140d);
            }
        }
        textView2.setText(string2);
        String str3 = this.f16141e;
        if (str3 == null || str3.equalsIgnoreCase("")) {
            textView3 = this.tv_product;
            string3 = getResources().getString(2132017171);
        } else {
            textView3 = this.tv_product;
            string3 = this.f16141e;
        }
        textView3.setText(string3);
        String str4 = this.f16142f;
        if (str4 == null || str4.equalsIgnoreCase("")) {
            this.tv_status.setText(getResources().getString(2132017171));
            this.tv_title.setVisibility(8);
        } else {
            this.tv_status.setText(this.f16142f);
            this.tv_title.setText(this.f16142f + " Service Information");
        }
        String str5 = this.f16143g;
        if (str5 == null || str5.equalsIgnoreCase("")) {
            textView4 = this.tv_registration_date;
            string4 = getResources().getString(2132017171);
        } else {
            textView4 = this.tv_registration_date;
            string4 = this.f16143g;
        }
        textView4.setText(string4);
        String str6 = this.f16148l;
        if (str6 == null || str6.equalsIgnoreCase("")) {
            textView5 = this.tv_billing_cycle;
            string5 = getResources().getString(2132017171);
        } else {
            textView5 = this.tv_billing_cycle;
            string5 = this.f16148l;
        }
        textView5.setText(string5);
        String str7 = this.f16146j;
        if (str7 == null || str7.equalsIgnoreCase("")) {
            textView6 = this.tv_payment_method;
            string6 = getResources().getString(2132017171);
        } else {
            textView6 = this.tv_payment_method;
            string6 = this.f16146j;
        }
        textView6.setText(string6);
        String str8 = this.f16147k;
        if (str8 == null || str8.equalsIgnoreCase("")) {
            textView7 = this.tv_first_time_payment;
            string7 = getResources().getString(2132017171);
        } else {
            textView7 = this.tv_first_time_payment;
            string7 = ClientSharepreferenceHandler.m14493d(this.f16140d) + this.f16147k + ClientSharepreferenceHandler.m14494e(this.f16140d);
        }
        textView7.setText(string7);
        this.btn_back.setOnClickListener(new View.OnClickListener(this) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.ShowserviceInformationActivity.1

            /* renamed from: b */
            public final ShowserviceInformationActivity f16150b;

            {
                this.f16150b = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.f16150b.onBackPressed();
            }
        });
        this.btn_service_home.setOnClickListener(new View.OnClickListener(this) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.ShowserviceInformationActivity.2

            /* renamed from: b */
            public final ShowserviceInformationActivity f16151b;

            {
                this.f16151b = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent2 = new Intent(this.f16151b, (Class<?>) ServicesDashboardActivity.class);
                intent2.setFlags(67141632);
                this.f16151b.startActivity(intent2);
                this.f16151b.finish();
            }
        });
        Button button = this.btn_service_home;
        button.setOnFocusChangeListener(new C5255e.i(button, this));
        Button button2 = this.btn_back;
        button2.setOnFocusChangeListener(new C5255e.i(button2, this));
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f16149m;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f16149m.interrupt();
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f16149m;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new CountDownRunner(this));
            this.f16149m = thread2;
            thread2.start();
        }
    }

    /* renamed from: q0 */
    public void m14582q0() {
        runOnUiThread(new Runnable(this) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.ShowserviceInformationActivity.3

            /* renamed from: b */
            public final ShowserviceInformationActivity f16152b;

            {
                this.f16152b = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    String date = Calendar.getInstance().getTime().toString();
                    String m26199B = C5255e.m26199B(this.f16152b.f16140d);
                    String m26249p = C5255e.m26249p(date);
                    TextView textView = this.f16152b.time;
                    if (textView != null) {
                        textView.setText(m26199B);
                    }
                    TextView textView2 = this.f16152b.date;
                    if (textView2 != null) {
                        textView2.setText(m26249p);
                    }
                } catch (Exception e10) {
                }
            }
        });
    }
}

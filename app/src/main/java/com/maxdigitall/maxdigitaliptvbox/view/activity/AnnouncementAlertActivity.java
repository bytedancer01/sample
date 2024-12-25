package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import java.util.Calendar;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AnnouncementAlertActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AnnouncementAlertActivity.class */
public class AnnouncementAlertActivity extends Activity {

    /* renamed from: b */
    public TextView f16859b;

    /* renamed from: c */
    public TextView f16860c;

    @BindView
    public TextView date;

    /* renamed from: f */
    public AnnouncementAlertActivity f16863f;

    @BindView
    public ImageView logo;

    @BindView
    public TextView time;

    /* renamed from: d */
    public String f16861d = "";

    /* renamed from: e */
    public String f16862e = "";

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AnnouncementAlertActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AnnouncementAlertActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AnnouncementAlertActivity$a.class */
    public class ViewOnClickListenerC2680a implements View.OnClickListener {

        /* renamed from: b */
        public final AnnouncementAlertActivity f16864b;

        public ViewOnClickListenerC2680a(AnnouncementAlertActivity announcementAlertActivity) {
            this.f16864b = announcementAlertActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f16864b.f16863f);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AnnouncementAlertActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AnnouncementAlertActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AnnouncementAlertActivity$b.class */
    public class RunnableC2681b implements Runnable {

        /* renamed from: b */
        public final AnnouncementAlertActivity f16865b;

        public RunnableC2681b(AnnouncementAlertActivity announcementAlertActivity) {
            this.f16865b = announcementAlertActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String date = Calendar.getInstance().getTime().toString();
                String m26199B = C5255e.m26199B(this.f16865b.f16863f);
                String m26249p = C5255e.m26249p(date);
                TextView textView = this.f16865b.time;
                if (textView != null) {
                    textView.setText(m26199B);
                }
                TextView textView2 = this.f16865b.date;
                if (textView2 != null) {
                    textView2.setText(m26249p);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AnnouncementAlertActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AnnouncementAlertActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AnnouncementAlertActivity$c.class */
    public class RunnableC2682c implements Runnable {

        /* renamed from: b */
        public final AnnouncementAlertActivity f16866b;

        public RunnableC2682c(AnnouncementAlertActivity announcementAlertActivity) {
            this.f16866b = announcementAlertActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f16866b.m15569a();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                } catch (Exception e11) {
                }
            }
        }
    }

    /* renamed from: a */
    public void m15569a() {
        runOnUiThread(new RunnableC2681b(this));
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(2130772003, 2130772000);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131623969);
        this.f16863f = this;
        ButterKnife.m5626a(this);
        this.f16860c = (TextView) findViewById(2131429353);
        this.f16859b = (TextView) findViewById(2131429354);
        Intent intent = getIntent();
        this.f16861d = intent.getStringExtra("Title");
        this.f16862e = intent.getStringExtra("Description");
        this.f16859b.setText(this.f16861d);
        this.f16860c.setText(this.f16862e);
        this.logo.setOnClickListener(new ViewOnClickListenerC2680a(this));
        new Thread(new RunnableC2682c(this)).start();
    }
}

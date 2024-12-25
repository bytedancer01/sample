package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.amazonaws.services.p045s3.model.BucketVersioningConfiguration;
import com.github.ybq.android.spinkit.SpinKitView;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.CallBacks.AllServiceApiCallBack;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.adapters.MyAllServiceAdapter;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.interfaces.CommanApiHitClass;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess.ActiveServiceModelClass;
import java.util.ArrayList;
import java.util.Calendar;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/SuspendedServiceActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/SuspendedServiceActivity.class */
public class SuspendedServiceActivity extends ActivityC0243b implements AllServiceApiCallBack {

    /* renamed from: d */
    public Context f16155d;

    @BindView
    public TextView date;

    /* renamed from: e */
    public Thread f16156e = null;

    @BindView
    public SpinKitView progress;

    @BindView
    public RecyclerView recyclerView;

    @BindView
    public TextView time;

    @BindView
    public TextView tv_no_active_services;

    @BindView
    public TextView tv_title;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/SuspendedServiceActivity$CountDownRunner.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/SuspendedServiceActivity$CountDownRunner.class */
    public class CountDownRunner implements Runnable {

        /* renamed from: b */
        public final SuspendedServiceActivity f16158b;

        public CountDownRunner(SuspendedServiceActivity suspendedServiceActivity) {
            this.f16158b = suspendedServiceActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f16158b.m14584q0();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                } catch (Exception e11) {
                }
            }
        }
    }

    @Override // com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.CallBacks.AllServiceApiCallBack
    /* renamed from: A */
    public void mo14486A(ArrayList<ActiveServiceModelClass> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            this.recyclerView.setVisibility(8);
            this.tv_no_active_services.setVisibility(0);
            this.progress.setVisibility(8);
        } else {
            m14583b();
            this.recyclerView.setAdapter(new MyAllServiceAdapter(this.f16155d, arrayList));
        }
    }

    /* renamed from: b */
    public void m14583b() {
        this.progress.setVisibility(8);
        this.recyclerView.setVisibility(0);
        this.tv_no_active_services.setVisibility(8);
    }

    @Override // com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.CallBacks.AllServiceApiCallBack
    /* renamed from: l */
    public void mo14487l(String str) {
        Toast.makeText(this.f16155d, "" + str, 0).show();
        this.progress.setVisibility(8);
        this.recyclerView.setVisibility(0);
        this.tv_no_active_services.setVisibility(0);
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624070);
        ButterKnife.m5626a(this);
        this.tv_title.setText(getResources().getString(2132018154));
        this.f16155d = this;
        Thread thread = this.f16156e;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new CountDownRunner(this));
            this.f16156e = thread2;
            thread2.start();
        }
        this.recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        new CommanApiHitClass(this, this.f16155d, BucketVersioningConfiguration.SUSPENDED).m14647a();
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f16156e;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f16156e.interrupt();
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f16156e;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new CountDownRunner(this));
            this.f16156e = thread2;
            thread2.start();
        }
    }

    /* renamed from: q0 */
    public void m14584q0() {
        runOnUiThread(new Runnable(this) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.SuspendedServiceActivity.1

            /* renamed from: b */
            public final SuspendedServiceActivity f16157b;

            {
                this.f16157b = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    String date = Calendar.getInstance().getTime().toString();
                    String m26199B = C5255e.m26199B(this.f16157b.f16155d);
                    String m26249p = C5255e.m26249p(date);
                    TextView textView = this.f16157b.time;
                    if (textView != null) {
                        textView.setText(m26199B);
                    }
                    TextView textView2 = this.f16157b.date;
                    if (textView2 != null) {
                        textView2.setText(m26249p);
                    }
                } catch (Exception e10) {
                }
            }
        });
    }
}

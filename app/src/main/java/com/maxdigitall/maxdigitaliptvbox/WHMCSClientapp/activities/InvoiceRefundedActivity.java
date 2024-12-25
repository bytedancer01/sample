package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0243b;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.github.ybq.android.spinkit.SpinKitView;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.CallBacks.InvoiceData;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.adapters.UnpaidAdapter;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.interfaces.InvoicesApiHitClass;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess.InvoicesModelClass;
import java.util.Calendar;
import java.util.List;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/InvoiceRefundedActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/InvoiceRefundedActivity.class */
public class InvoiceRefundedActivity extends ActivityC0243b implements InvoiceData {

    /* renamed from: d */
    public Context f16004d;

    @BindView
    public TextView date;

    @BindView
    public SpinKitView progress;

    @BindView
    public RecyclerView recyclerView;

    @BindView
    public TextView textNotFound;

    @BindView
    public TextView time;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/InvoiceRefundedActivity$countDown.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/InvoiceRefundedActivity$countDown.class */
    public class countDown implements Runnable {

        /* renamed from: b */
        public final InvoiceRefundedActivity f16005b;

        public countDown(InvoiceRefundedActivity invoiceRefundedActivity) {
            this.f16005b = invoiceRefundedActivity;
        }

        /* renamed from: a */
        public final void m14537a() {
            this.f16005b.runOnUiThread(new Runnable(this) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.InvoiceRefundedActivity.countDown.1

                /* renamed from: b */
                public final countDown f16006b;

                {
                    this.f16006b = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    String date = Calendar.getInstance().getTime().toString();
                    String m26199B = C5255e.m26199B(this.f16006b.f16005b.f16004d);
                    String m26249p = C5255e.m26249p(date);
                    TextView textView = this.f16006b.f16005b.time;
                    if (textView != null) {
                        textView.setText(m26199B);
                    }
                    TextView textView2 = this.f16006b.f16005b.date;
                    if (textView2 != null) {
                        textView2.setText(m26249p);
                    }
                }
            });
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
            try {
                m14537a();
                Thread.sleep(1000L);
            } catch (InterruptedException e10) {
                e10.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.CallBacks.InvoiceData
    /* renamed from: J */
    public void mo14488J(String str) {
        this.progress.setVisibility(8);
        this.recyclerView.setVisibility(8);
        this.textNotFound.setVisibility(0);
        this.textNotFound.setText(getResources().getString(2132018218));
    }

    /* renamed from: b */
    public void m14536b() {
        this.progress.setVisibility(8);
        this.recyclerView.setVisibility(0);
        this.textNotFound.setVisibility(8);
    }

    @Override // com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.CallBacks.InvoiceData
    /* renamed from: n */
    public void mo14489n(List<InvoicesModelClass.Invoices.Invoice> list) {
        if (list != null && !list.isEmpty() && list.size() > 0) {
            m14536b();
            this.recyclerView.setAdapter(new UnpaidAdapter(this.f16004d, list));
        } else {
            this.progress.setVisibility(8);
            this.recyclerView.setVisibility(8);
            this.textNotFound.setVisibility(0);
            this.textNotFound.setText(getResources().getString(2132018218));
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624037);
        ButterKnife.m5626a(this);
        this.f16004d = this;
        new Thread(new countDown(this)).start();
        this.recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        new InvoicesApiHitClass(this, this.f16004d, "Refunded").m14650a();
    }
}

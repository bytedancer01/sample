package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.Clientdatabase.ClientSharepreferenceHandler;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.interfaces.ApiService;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.interfaces.ApiclientRetrofit;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess.ServicesIncoiveTicketCoutModelClass;
import com.wang.avi.AVLoadingIndicatorView;
import dj.C4554u;
import dj.InterfaceC4535b;
import dj.InterfaceC4537d;
import java.util.Calendar;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/MyInvoiceActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/MyInvoiceActivity.class */
public class MyInvoiceActivity extends ActivityC0243b {

    @BindView
    public LinearLayout cancel_box;

    /* renamed from: d */
    public Context f16008d;

    @BindView
    public TextView date;

    /* renamed from: e */
    public Thread f16009e = null;

    @BindView
    public AVLoadingIndicatorView loader_show;

    @BindView
    public AVLoadingIndicatorView loader_showcnl;

    @BindView
    public AVLoadingIndicatorView loader_showrf;

    @BindView
    public AVLoadingIndicatorView loader_showup;

    @BindView
    public LinearLayout paid_box;

    @BindView
    public LinearLayout refound_box;

    @BindView
    public TextView sow_cnl;

    @BindView
    public TextView sow_no;

    @BindView
    public TextView sow_rf;

    @BindView
    public TextView sow_up;

    @BindView
    public TextView time;

    @BindView
    public LinearLayout unpaid_box;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/MyInvoiceActivity$CountTime.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/MyInvoiceActivity$CountTime.class */
    public class CountTime implements Runnable {

        /* renamed from: b */
        public final MyInvoiceActivity f16011b;

        public CountTime(MyInvoiceActivity myInvoiceActivity) {
            this.f16011b = myInvoiceActivity;
        }

        /* renamed from: a */
        public final void m14540a() {
            this.f16011b.runOnUiThread(new Runnable(this) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.MyInvoiceActivity.CountTime.1

                /* renamed from: b */
                public final CountTime f16012b;

                {
                    this.f16012b = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        String date = Calendar.getInstance().getTime().toString();
                        String m26199B = C5255e.m26199B(this.f16012b.f16011b.f16008d);
                        String m26249p = C5255e.m26249p(date);
                        TextView textView = this.f16012b.f16011b.time;
                        if (textView != null) {
                            textView.setText(m26199B);
                        }
                        TextView textView2 = this.f16012b.f16011b.date;
                        if (textView2 != null) {
                            textView2.setText(m26249p);
                        }
                    } catch (Exception e10) {
                    }
                }
            });
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    m14540a();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/MyInvoiceActivity$onFocusChange.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/MyInvoiceActivity$onFocusChange.class */
    public class onFocusChange implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f16013b;

        /* renamed from: c */
        public final MyInvoiceActivity f16014c;

        public onFocusChange(MyInvoiceActivity myInvoiceActivity, View view) {
            this.f16014c = myInvoiceActivity;
            this.f16013b = view;
        }

        /* renamed from: a */
        public void m14541a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16013b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public void m14542b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16013b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public void m14543c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16013b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            if (z10) {
                Log.e("id is", "" + this.f16013b.getTag());
                if (this.f16013b.getTag().equals("7")) {
                    float f10 = z10 ? 2.0f : 1.0f;
                    m14542b(f10);
                    m14543c(f10);
                } else {
                    float f11 = z10 ? 1.09f : 1.0f;
                    m14542b(f11);
                    m14543c(f11);
                    if (this.f16013b.getTag().equals("1")) {
                        this.f16013b.setBackgroundResource(2131231675);
                    }
                    if (this.f16013b.getTag().equals("2")) {
                        this.f16013b.setBackgroundResource(2131231989);
                    }
                    if (this.f16013b.getTag().equals("3")) {
                        this.f16013b.setBackgroundResource(2131231741);
                    }
                    if (this.f16013b.getTag().equals("4")) {
                        this.f16013b.setBackgroundResource(2131230882);
                    }
                }
            }
            if (z10) {
                return;
            }
            if (this.f16013b.getTag().equals("7")) {
                float f12 = z10 ? 2.0f : 1.0f;
                m14542b(f12);
                m14543c(f12);
                m14541a(z10);
                return;
            }
            float f13 = z10 ? 1.09f : 1.0f;
            m14542b(f13);
            m14543c(f13);
            m14541a(z10);
            if (this.f16013b.getTag().equals("1")) {
                this.f16013b.setBackgroundResource(2131231674);
            }
            if (this.f16013b.getTag().equals("2")) {
                this.f16013b.setBackgroundResource(2131231988);
            }
            if (this.f16013b.getTag().equals("3")) {
                this.f16013b.setBackgroundResource(2131231740);
            }
            if (this.f16013b.getTag().equals("4")) {
                this.f16013b.setBackgroundResource(2131230881);
            }
        }
    }

    @OnClick
    public void click(View view) {
        Intent intent;
        switch (view.getId()) {
            case 2131427691:
                intent = new Intent(this, (Class<?>) CancelInvoiceActivity.class);
                break;
            case 2131428810:
                intent = new Intent(this, (Class<?>) PaidInvoiceActivity.class);
                break;
            case 2131428926:
                intent = new Intent(this, (Class<?>) InvoiceRefundedActivity.class);
                break;
            case 2131429654:
                intent = new Intent(this, (Class<?>) UnpiadInvoiceActivity.class);
                break;
            default:
                return;
        }
        startActivity(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624018);
        ButterKnife.m5626a(this);
        this.f16008d = this;
        Thread thread = this.f16009e;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new CountTime(this));
            this.f16009e = thread2;
            thread2.start();
        }
        LinearLayout linearLayout = this.paid_box;
        linearLayout.setOnFocusChangeListener(new onFocusChange(this, linearLayout));
        LinearLayout linearLayout2 = this.unpaid_box;
        linearLayout2.setOnFocusChangeListener(new onFocusChange(this, linearLayout2));
        LinearLayout linearLayout3 = this.cancel_box;
        linearLayout3.setOnFocusChangeListener(new onFocusChange(this, linearLayout3));
        LinearLayout linearLayout4 = this.refound_box;
        linearLayout4.setOnFocusChangeListener(new onFocusChange(this, linearLayout4));
        m14539r0();
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f16009e;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f16009e.interrupt();
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f16009e;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new CountTime(this));
            this.f16009e = thread2;
            thread2.start();
        }
    }

    /* renamed from: r0 */
    public final void m14539r0() {
        ((ApiService) ApiclientRetrofit.m14644a().m22958b(ApiService.class)).m14640h("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "sitcount", "yes", ClientSharepreferenceHandler.m14490a(this.f16008d)).mo22862f(new InterfaceC4537d<ServicesIncoiveTicketCoutModelClass>(this) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.MyInvoiceActivity.1

            /* renamed from: a */
            public final MyInvoiceActivity f16010a;

            {
                this.f16010a = this;
            }

            @Override // dj.InterfaceC4537d
            /* renamed from: a */
            public void mo14532a(InterfaceC4535b<ServicesIncoiveTicketCoutModelClass> interfaceC4535b, C4554u<ServicesIncoiveTicketCoutModelClass> c4554u) {
                if (c4554u.m22952a() == null || !c4554u.m22954d()) {
                    Toast.makeText(this.f16010a.f16008d, "" + c4554u.m22953b() + " | Error", 0).show();
                    return;
                }
                if (c4554u.m22952a().m14682a().m14684a() != null) {
                    int intValue = c4554u.m22952a().m14682a().m14684a().m14688b().intValue();
                    int intValue2 = c4554u.m22952a().m14682a().m14684a().m14690d().intValue();
                    int intValue3 = c4554u.m22952a().m14682a().m14684a().m14689c().intValue();
                    int intValue4 = c4554u.m22952a().m14682a().m14684a().m14687a().intValue();
                    this.f16010a.sow_no.setText(String.valueOf(intValue));
                    this.f16010a.loader_show.setVisibility(8);
                    this.f16010a.sow_no.setVisibility(0);
                    this.f16010a.sow_up.setText(String.valueOf(intValue2));
                    this.f16010a.loader_showup.setVisibility(8);
                    this.f16010a.sow_up.setVisibility(0);
                    this.f16010a.sow_rf.setText(String.valueOf(intValue3));
                    this.f16010a.loader_showrf.setVisibility(8);
                    this.f16010a.sow_rf.setVisibility(0);
                    this.f16010a.sow_cnl.setText(String.valueOf(intValue4));
                    this.f16010a.loader_showcnl.setVisibility(8);
                    this.f16010a.sow_cnl.setVisibility(0);
                }
            }

            @Override // dj.InterfaceC4537d
            /* renamed from: b */
            public void mo14533b(InterfaceC4535b<ServicesIncoiveTicketCoutModelClass> interfaceC4535b, Throwable th2) {
                this.f16010a.paid_box.setVisibility(8);
                this.f16010a.cancel_box.setVisibility(8);
                this.f16010a.refound_box.setVisibility(8);
                this.f16010a.unpaid_box.setVisibility(8);
                Toast.makeText(this.f16010a.f16008d, "No Response from server", 0).show();
            }
        });
    }
}

package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
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
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/MySerivcesActiviy.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/MySerivcesActiviy.class */
public class MySerivcesActiviy extends ActivityC0243b {

    /* renamed from: d */
    public Context f16028d;

    @BindView
    public TextView date;

    /* renamed from: e */
    public Thread f16029e = null;

    @BindView
    public LinearLayout ll_active;

    @BindView
    public LinearLayout ll_cancelled;

    @BindView
    public LinearLayout ll_fraud;

    @BindView
    public LinearLayout ll_pending;

    @BindView
    public LinearLayout ll_suspended;

    @BindView
    public LinearLayout ll_terminated;

    @BindView
    public AVLoadingIndicatorView pb_loader_active;

    @BindView
    public AVLoadingIndicatorView pb_loader_cancelled;

    @BindView
    public AVLoadingIndicatorView pb_loader_fraud;

    @BindView
    public AVLoadingIndicatorView pb_loader_pending;

    @BindView
    public AVLoadingIndicatorView pb_loader_suspended;

    @BindView
    public AVLoadingIndicatorView pb_loader_terminated;

    @BindView
    public TextView time;

    @BindView
    public TextView tv_active_count;

    @BindView
    public TextView tv_cancelled_count;

    @BindView
    public TextView tv_fraud_count;

    @BindView
    public TextView tv_pending_count;

    @BindView
    public TextView tv_suspended_count;

    @BindView
    public TextView tv_terminated_count;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/MySerivcesActiviy$CountDownRunner.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/MySerivcesActiviy$CountDownRunner.class */
    public class CountDownRunner implements Runnable {

        /* renamed from: b */
        public final MySerivcesActiviy f16032b;

        public CountDownRunner(MySerivcesActiviy mySerivcesActiviy) {
            this.f16032b = mySerivcesActiviy;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f16032b.m14545r0();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                } catch (Exception e11) {
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/MySerivcesActiviy$OnFocusChangeAccountListener.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/MySerivcesActiviy$OnFocusChangeAccountListener.class */
    public class OnFocusChangeAccountListener implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f16033b;

        /* renamed from: c */
        public final MySerivcesActiviy f16034c;

        public OnFocusChangeAccountListener(MySerivcesActiviy mySerivcesActiviy, View view) {
            this.f16034c = mySerivcesActiviy;
            this.f16033b = view;
        }

        /* renamed from: a */
        public final void m14547a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16033b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m14548b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16033b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m14549c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16033b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            View view2;
            int i10;
            float f10 = 2.0f;
            float f11 = 1.09f;
            if (z10) {
                Log.e("id is", "" + this.f16033b.getTag());
                if (this.f16033b.getTag().equals("7")) {
                    if (!z10) {
                        f10 = 1.0f;
                    }
                    m14548b(f10);
                    m14549c(f10);
                    return;
                }
                if (!z10) {
                    f11 = 1.0f;
                }
                m14548b(f11);
                m14549c(f11);
                if (this.f16033b.getTag().equals("1")) {
                    view2 = this.f16033b;
                    i10 = 2131230808;
                } else if (this.f16033b.getTag().equals("2")) {
                    view2 = this.f16033b;
                    i10 = 2131230882;
                } else if (this.f16033b.getTag().equals("3")) {
                    view2 = this.f16033b;
                    i10 = 2131231977;
                } else if (this.f16033b.getTag().equals("4")) {
                    view2 = this.f16033b;
                    i10 = 2131231968;
                } else if (this.f16033b.getTag().equals("5")) {
                    view2 = this.f16033b;
                    i10 = 2131231974;
                } else {
                    if (!this.f16033b.getTag().equals("6")) {
                        return;
                    }
                    view2 = this.f16033b;
                    i10 = 2131231096;
                }
            } else {
                if (z10) {
                    return;
                }
                if (this.f16033b.getTag().equals("7")) {
                    if (!z10) {
                        f10 = 1.0f;
                    }
                    m14548b(f10);
                    m14549c(f10);
                    m14547a(z10);
                    return;
                }
                if (!z10) {
                    f11 = 1.0f;
                }
                m14548b(f11);
                m14549c(f11);
                m14547a(z10);
                if (this.f16033b.getTag().equals("1")) {
                    view2 = this.f16033b;
                    i10 = 2131230807;
                } else if (this.f16033b.getTag().equals("2")) {
                    view2 = this.f16033b;
                    i10 = 2131230881;
                } else if (this.f16033b.getTag().equals("3")) {
                    view2 = this.f16033b;
                    i10 = 2131231976;
                } else if (this.f16033b.getTag().equals("4")) {
                    view2 = this.f16033b;
                    i10 = 2131231967;
                } else if (this.f16033b.getTag().equals("5")) {
                    view2 = this.f16033b;
                    i10 = 2131231973;
                } else {
                    if (!this.f16033b.getTag().equals("6")) {
                        return;
                    }
                    view2 = this.f16033b;
                    i10 = 2131231095;
                }
            }
            view2.setBackgroundResource(i10);
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624019);
        ButterKnife.m5626a(this);
        this.f16028d = this;
        Thread thread = this.f16029e;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new CountDownRunner(this));
            this.f16029e = thread2;
            thread2.start();
        }
        LinearLayout linearLayout = this.ll_active;
        linearLayout.setOnFocusChangeListener(new OnFocusChangeAccountListener(this, linearLayout));
        LinearLayout linearLayout2 = this.ll_cancelled;
        linearLayout2.setOnFocusChangeListener(new OnFocusChangeAccountListener(this, linearLayout2));
        LinearLayout linearLayout3 = this.ll_pending;
        linearLayout3.setOnFocusChangeListener(new OnFocusChangeAccountListener(this, linearLayout3));
        LinearLayout linearLayout4 = this.ll_suspended;
        linearLayout4.setOnFocusChangeListener(new OnFocusChangeAccountListener(this, linearLayout4));
        LinearLayout linearLayout5 = this.ll_terminated;
        linearLayout5.setOnFocusChangeListener(new OnFocusChangeAccountListener(this, linearLayout5));
        LinearLayout linearLayout6 = this.ll_fraud;
        linearLayout6.setOnFocusChangeListener(new OnFocusChangeAccountListener(this, linearLayout6));
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f16029e;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f16029e.interrupt();
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f16029e;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new CountDownRunner(this));
            this.f16029e = thread2;
            thread2.start();
        }
        m14546s0();
    }

    @OnClick
    public void onclick(View view) {
        Intent intent;
        switch (view.getId()) {
            case 2131428315:
                intent = new Intent(this, (Class<?>) ActiveServiceActivity.class);
                break;
            case 2131428344:
                intent = new Intent(this, (Class<?>) CancelledSerivceActivity.class);
                break;
            case 2131428409:
                intent = new Intent(this, (Class<?>) FraudServiceActivity.class);
                break;
            case 2131428465:
                intent = new Intent(this, (Class<?>) PendingServiceActivity.class);
                break;
            case 2131428518:
                intent = new Intent(this, (Class<?>) SuspendedServiceActivity.class);
                break;
            case 2131428521:
                intent = new Intent(this, (Class<?>) TerminatedServiceActivity.class);
                break;
            default:
                return;
        }
        startActivity(intent);
    }

    /* renamed from: r0 */
    public void m14545r0() {
        runOnUiThread(new Runnable(this) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.MySerivcesActiviy.2

            /* renamed from: b */
            public final MySerivcesActiviy f16031b;

            {
                this.f16031b = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    String date = Calendar.getInstance().getTime().toString();
                    String m26199B = C5255e.m26199B(this.f16031b.f16028d);
                    String m26249p = C5255e.m26249p(date);
                    TextView textView = this.f16031b.time;
                    if (textView != null) {
                        textView.setText(m26199B);
                    }
                    TextView textView2 = this.f16031b.date;
                    if (textView2 != null) {
                        textView2.setText(m26249p);
                    }
                } catch (Exception e10) {
                }
            }
        });
    }

    /* renamed from: s0 */
    public void m14546s0() {
        ((ApiService) ApiclientRetrofit.m14644a().m22958b(ApiService.class)).m14640h("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "sitcount", "yes", ClientSharepreferenceHandler.m14490a(this.f16028d)).mo22862f(new InterfaceC4537d<ServicesIncoiveTicketCoutModelClass>(this) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.MySerivcesActiviy.1

            /* renamed from: a */
            public final MySerivcesActiviy f16030a;

            {
                this.f16030a = this;
            }

            @Override // dj.InterfaceC4537d
            /* renamed from: a */
            public void mo14532a(InterfaceC4535b<ServicesIncoiveTicketCoutModelClass> interfaceC4535b, C4554u<ServicesIncoiveTicketCoutModelClass> c4554u) {
                Context context;
                String str;
                if (!c4554u.m22954d() || c4554u.m22952a() == null) {
                    context = this.f16030a.f16028d;
                    str = "" + c4554u.m22953b() + " | Error";
                } else {
                    if (c4554u.m22952a().m14683b().equalsIgnoreCase("success")) {
                        if (c4554u.m22952a().m14682a().m14685b() == null || c4554u.m22952a().m14682a().m14684a() == null || c4554u.m22952a().m14682a().m14686c() == null) {
                            return;
                        }
                        int intValue = c4554u.m22952a().m14682a().m14685b().m14691a().intValue();
                        int intValue2 = c4554u.m22952a().m14682a().m14685b().m14692b().intValue();
                        int intValue3 = c4554u.m22952a().m14682a().m14685b().m14694d().intValue();
                        int intValue4 = c4554u.m22952a().m14682a().m14685b().m14695e().intValue();
                        int intValue5 = c4554u.m22952a().m14682a().m14685b().m14696f().intValue();
                        int intValue6 = c4554u.m22952a().m14682a().m14685b().m14693c().intValue();
                        this.f16030a.tv_active_count.setText(String.valueOf(intValue));
                        this.f16030a.pb_loader_active.m21502f();
                        this.f16030a.tv_active_count.setVisibility(0);
                        this.f16030a.tv_cancelled_count.setText(String.valueOf(intValue2));
                        this.f16030a.pb_loader_cancelled.m21502f();
                        this.f16030a.tv_cancelled_count.setVisibility(0);
                        this.f16030a.tv_pending_count.setText(String.valueOf(intValue3));
                        this.f16030a.pb_loader_pending.m21502f();
                        this.f16030a.tv_pending_count.setVisibility(0);
                        this.f16030a.tv_suspended_count.setText(String.valueOf(intValue4));
                        this.f16030a.pb_loader_suspended.m21502f();
                        this.f16030a.tv_suspended_count.setVisibility(0);
                        this.f16030a.tv_terminated_count.setText(String.valueOf(intValue5));
                        this.f16030a.pb_loader_terminated.m21502f();
                        this.f16030a.tv_terminated_count.setVisibility(0);
                        this.f16030a.tv_fraud_count.setText(String.valueOf(intValue6));
                        this.f16030a.pb_loader_fraud.m21502f();
                        this.f16030a.tv_fraud_count.setVisibility(0);
                        return;
                    }
                    context = this.f16030a.f16028d;
                    str = "Failed";
                }
                Toast.makeText(context, str, 0).show();
            }

            @Override // dj.InterfaceC4537d
            /* renamed from: b */
            public void mo14533b(InterfaceC4535b<ServicesIncoiveTicketCoutModelClass> interfaceC4535b, Throwable th2) {
                this.f16030a.m14546s0();
            }
        });
    }
}

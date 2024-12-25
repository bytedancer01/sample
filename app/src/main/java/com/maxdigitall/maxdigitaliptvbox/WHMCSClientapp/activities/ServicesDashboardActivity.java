package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.CallBacks.AllServiceApiCallBack;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.Clientdatabase.ClientSharepreferenceHandler;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.interfaces.ApiService;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.interfaces.ApiclientRetrofit;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.interfaces.CommanApiHitClass;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess.ActiveServiceModelClass;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess.BuyNowModelClass;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess.LoginWHMCSModelClass;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess.ServicesIncoiveTicketCoutModelClass;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.activity.AnnouncementsActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.SettingsActivity;
import com.wang.avi.AVLoadingIndicatorView;
import dj.C4554u;
import dj.InterfaceC4535b;
import dj.InterfaceC4537d;
import java.util.ArrayList;
import java.util.Calendar;
import p151if.C5251a;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/ServicesDashboardActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/ServicesDashboardActivity.class */
public class ServicesDashboardActivity extends ActivityC0243b implements AllServiceApiCallBack {

    /* renamed from: m */
    public static PopupWindow f16093m;

    @BindView
    public ImageView account_info;

    @BindView
    public Button btn_buy_now;

    /* renamed from: d */
    public Context f16094d;

    @BindView
    public TextView date;

    /* renamed from: e */
    public TextView f16095e;

    /* renamed from: f */
    public TextView f16096f;

    /* renamed from: g */
    public Button f16097g;

    /* renamed from: h */
    public Button f16098h;

    @BindView
    public ImageView ivSwitchUser;

    @BindView
    public ImageView iv_notification;

    @BindView
    public ImageView iv_settings;

    /* renamed from: k */
    public CountDownTimer f16101k;

    @BindView
    public LinearLayout ll_buy_now;

    @BindView
    public LinearLayout ll_invoices;

    @BindView
    public LinearLayout ll_services;

    @BindView
    public LinearLayout ll_tickets;

    @BindView
    public AVLoadingIndicatorView pb_loader_invoice;

    @BindView
    public AVLoadingIndicatorView pb_loader_service;

    @BindView
    public AVLoadingIndicatorView pb_loader_ticket;

    @BindView
    public TextView time;

    @BindView
    public TextView tvAccountinfoButton;

    @BindView
    public TextView tvSettingsButton;

    @BindView
    public TextView tvSwitchUserButton;

    @BindView
    public TextView tv_free_trial_title;

    @BindView
    public TextView tv_freetrai_time;

    @BindView
    public TextView tv_invoice_count;

    @BindView
    public TextView tv_notification;

    @BindView
    public TextView tv_service_count;

    @BindView
    public TextView tv_ticket_count;

    /* renamed from: i */
    public String f16099i = "";

    /* renamed from: j */
    public String f16100j = "";

    /* renamed from: l */
    public Thread f16102l = null;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/ServicesDashboardActivity$CountDownRunner.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/ServicesDashboardActivity$CountDownRunner.class */
    public class CountDownRunner implements Runnable {

        /* renamed from: b */
        public final ServicesDashboardActivity f16112b;

        public CountDownRunner(ServicesDashboardActivity servicesDashboardActivity) {
            this.f16112b = servicesDashboardActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f16112b.m14575v0();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                } catch (Exception e11) {
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/ServicesDashboardActivity$OnFocusChangeAccountListener.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/ServicesDashboardActivity$OnFocusChangeAccountListener.class */
    public class OnFocusChangeAccountListener implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f16113b;

        /* renamed from: c */
        public final ServicesDashboardActivity f16114c;

        public OnFocusChangeAccountListener(ServicesDashboardActivity servicesDashboardActivity, View view) {
            this.f16114c = servicesDashboardActivity;
            this.f16113b = view;
        }

        /* renamed from: a */
        public final void m14579a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16113b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m14580b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16113b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m14581c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16113b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0233  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x00ed  */
        @Override // android.view.View.OnFocusChangeListener
        @android.annotation.SuppressLint({"ResourceType"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onFocusChange(android.view.View r4, boolean r5) {
            /*
                Method dump skipped, instructions count: 837
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.ServicesDashboardActivity.OnFocusChangeAccountListener.onFocusChange(android.view.View, boolean):void");
        }
    }

    @Override // com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.CallBacks.AllServiceApiCallBack
    /* renamed from: A */
    public void mo14486A(ArrayList<ActiveServiceModelClass> arrayList) {
        C5255e.m26205H();
        if (arrayList == null || arrayList.size() <= 0 || arrayList.get(0) == null) {
            return;
        }
        this.f16100j = arrayList.get(0).m14653c();
        try {
            Intent intent = new Intent(this, (Class<?>) BuyNowActivity.class);
            intent.putExtra("service_id", this.f16100j);
            startActivity(intent);
        } catch (Exception e10) {
        }
    }

    @Override // com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.CallBacks.AllServiceApiCallBack
    /* renamed from: l */
    public void mo14487l(String str) {
        try {
            C5255e.m26205H();
        } catch (Exception e10) {
            C5255e.m26241k0(this.f16094d, str);
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624056);
        ButterKnife.m5626a(this);
        this.f16094d = this;
        Thread thread = this.f16102l;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new CountDownRunner(this));
            this.f16102l = thread2;
            thread2.start();
        }
        Button button = this.btn_buy_now;
        button.setOnFocusChangeListener(new OnFocusChangeAccountListener(this, button));
        ImageView imageView = this.account_info;
        imageView.setOnFocusChangeListener(new OnFocusChangeAccountListener(this, imageView));
        ImageView imageView2 = this.iv_settings;
        imageView2.setOnFocusChangeListener(new OnFocusChangeAccountListener(this, imageView2));
        ImageView imageView3 = this.ivSwitchUser;
        imageView3.setOnFocusChangeListener(new OnFocusChangeAccountListener(this, imageView3));
        LinearLayout linearLayout = this.ll_tickets;
        linearLayout.setOnFocusChangeListener(new OnFocusChangeAccountListener(this, linearLayout));
        ImageView imageView4 = this.iv_notification;
        imageView4.setOnFocusChangeListener(new OnFocusChangeAccountListener(this, imageView4));
        LinearLayout linearLayout2 = this.ll_invoices;
        linearLayout2.setOnFocusChangeListener(new OnFocusChangeAccountListener(this, linearLayout2));
        LinearLayout linearLayout3 = this.ll_services;
        linearLayout3.setOnFocusChangeListener(new OnFocusChangeAccountListener(this, linearLayout3));
        this.ll_services.requestFocus();
        if (C5251a.f30032c.booleanValue()) {
            return;
        }
        this.ivSwitchUser.setImageResource(2131231579);
        this.tvSwitchUserButton.setText(getResources().getString(2132018040));
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            CountDownTimer countDownTimer = this.f16101k;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
        } catch (Exception e10) {
        }
        try {
            Thread thread = this.f16102l;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f16102l.interrupt();
        } catch (Exception e11) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        m14576w0();
        this.f16099i = getIntent().getAction();
        Thread thread = this.f16102l;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new CountDownRunner(this));
            this.f16102l = thread2;
            thread2.start();
        }
        m14572q0();
    }

    @OnClick
    public void onclick(View view) {
        Intent intent;
        switch (view.getId()) {
            case 2131427397:
                startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
                finish();
                overridePendingTransition(2130772003, 2130772000);
                return;
            case 2131427635:
                m14574s0();
                return;
            case 2131428205:
                intent = new Intent(this, (Class<?>) AnnouncementsActivity.class);
                break;
            case 2131428229:
                intent = new Intent(this, (Class<?>) SettingsActivity.class);
                break;
            case 2131428422:
                intent = new Intent(this, (Class<?>) MyInvoiceActivity.class);
                break;
            case 2131428505:
                intent = new Intent(this, (Class<?>) MySerivcesActiviy.class);
                break;
            case 2131428524:
                intent = new Intent(this, (Class<?>) MyTicketActivity.class);
                break;
            case 2131429252:
                if ((!C5251a.f30032c.booleanValue() || !SharepreferenceDBHandler.m15373f(this.f16094d).equals("api")) && (!C5251a.f30036e.booleanValue() || !SharepreferenceDBHandler.m15373f(this.f16094d).equals("m3u"))) {
                    m14578z0();
                    return;
                }
                finish();
                C5251a.f30011J = Boolean.TRUE;
                C5255e.m26211N(this.f16094d);
                overridePendingTransition(2130772003, 2130772000);
                return;
            default:
                return;
        }
        startActivity(intent);
    }

    /* renamed from: q0 */
    public final void m14572q0() {
        C5255e.m26236h0(this);
        ((ApiService) ApiclientRetrofit.m14644a().m22958b(ApiService.class)).m14638f("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "validateCustomLogin", "yes", SharepreferenceDBHandler.m15338B(this.f16094d), SharepreferenceDBHandler.m15339C(this.f16094d)).mo22862f(new InterfaceC4537d<LoginWHMCSModelClass>(this) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.ServicesDashboardActivity.1

            /* renamed from: a */
            public final ServicesDashboardActivity f16103a;

            {
                this.f16103a = this;
            }

            @Override // dj.InterfaceC4537d
            /* renamed from: a */
            public void mo14532a(InterfaceC4535b<LoginWHMCSModelClass> interfaceC4535b, C4554u<LoginWHMCSModelClass> c4554u) {
                Toast makeText;
                if (!c4554u.m22954d()) {
                    makeText = Toast.makeText(this.f16103a.f16094d, "", 0);
                } else {
                    if (c4554u.m22952a() != null && c4554u.m22952a().m14675c() != null && c4554u.m22952a().m14675c().equalsIgnoreCase("success")) {
                        ClientSharepreferenceHandler.m14496g(c4554u.m22952a().m14673a().m14678c(), this.f16103a.f16094d);
                        ClientSharepreferenceHandler.m14495f(c4554u.m22952a().m14673a().m14676a().intValue(), this.f16103a.f16094d);
                        ClientSharepreferenceHandler.m14498i(c4554u.m22952a().m14673a().m14677b(), this.f16103a.f16094d);
                        ClientSharepreferenceHandler.m14499j(c4554u.m22952a().m14673a().m14679d(), this.f16103a.f16094d);
                        ClientSharepreferenceHandler.m14500k(c4554u.m22952a().m14673a().m14680e(), this.f16103a.f16094d);
                        this.f16103a.m14573r0();
                        return;
                    }
                    makeText = Toast.makeText(this.f16103a.f16094d, "" + c4554u.m22952a().m14674b(), 0);
                }
                makeText.show();
            }

            @Override // dj.InterfaceC4537d
            /* renamed from: b */
            public void mo14533b(InterfaceC4535b<LoginWHMCSModelClass> interfaceC4535b, Throwable th2) {
                C5255e.m26205H();
                ServicesDashboardActivity servicesDashboardActivity = this.f16103a;
                Toast.makeText(servicesDashboardActivity.f16094d, servicesDashboardActivity.getResources().getString(2132018606), 0).show();
            }
        });
    }

    /* renamed from: r0 */
    public final void m14573r0() {
        int m14490a = ClientSharepreferenceHandler.m14490a(this.f16094d);
        String m15338B = SharepreferenceDBHandler.m15338B(this.f16094d);
        String m15339C = SharepreferenceDBHandler.m15339C(this.f16094d);
        ((ApiService) ApiclientRetrofit.m14644a().m22958b(ApiService.class)).m14639g("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", m15338B, m15339C, "buyNowButton", "yes", m14490a).mo22862f(new InterfaceC4537d<BuyNowModelClass>(this, SharepreferenceDBHandler.m15402y(this.f16094d)) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.ServicesDashboardActivity.4

            /* renamed from: a */
            public final String f16106a;

            /* renamed from: b */
            public final ServicesDashboardActivity f16107b;

            {
                this.f16107b = this;
                this.f16106a = r5;
            }

            @Override // dj.InterfaceC4537d
            /* renamed from: a */
            public void mo14532a(InterfaceC4535b<BuyNowModelClass> interfaceC4535b, C4554u<BuyNowModelClass> c4554u) {
                View view;
                C5255e.m26205H();
                if (c4554u.m22954d() && c4554u.m22952a() != null && c4554u.m22952a().m14660a() != null) {
                    if (c4554u.m22952a().m14660a().equalsIgnoreCase("yes")) {
                        this.f16107b.ll_buy_now.setVisibility(0);
                        if (this.f16106a.equals("1")) {
                            ServicesDashboardActivity servicesDashboardActivity = this.f16107b;
                            servicesDashboardActivity.m14577x0(ClientSharepreferenceHandler.m14491b(servicesDashboardActivity.f16094d), this.f16107b.tv_freetrai_time);
                            return;
                        } else {
                            this.f16107b.tv_free_trial_title.setVisibility(8);
                            view = this.f16107b.tv_freetrai_time;
                            view.setVisibility(8);
                        }
                    }
                    if (this.f16106a.equals("1")) {
                        ServicesDashboardActivity servicesDashboardActivity2 = this.f16107b;
                        servicesDashboardActivity2.m14577x0(ClientSharepreferenceHandler.m14491b(servicesDashboardActivity2.f16094d), this.f16107b.tv_freetrai_time);
                    } else {
                        this.f16107b.tv_free_trial_title.setVisibility(8);
                        this.f16107b.tv_freetrai_time.setVisibility(8);
                    }
                    ClientSharepreferenceHandler.m14497h("free trail", this.f16107b.f16094d);
                }
                view = this.f16107b.ll_buy_now;
                view.setVisibility(8);
            }

            @Override // dj.InterfaceC4537d
            /* renamed from: b */
            public void mo14533b(InterfaceC4535b<BuyNowModelClass> interfaceC4535b, Throwable th2) {
                this.f16107b.ll_buy_now.setVisibility(8);
            }
        });
    }

    /* renamed from: s0 */
    public final void m14574s0() {
        C5255e.m26236h0(this);
        new CommanApiHitClass(this, this.f16094d, "Active").m14647a();
    }

    /* renamed from: v0 */
    public void m14575v0() {
        runOnUiThread(new Runnable(this) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.ServicesDashboardActivity.2

            /* renamed from: b */
            public final ServicesDashboardActivity f16104b;

            {
                this.f16104b = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    String date = Calendar.getInstance().getTime().toString();
                    String m26199B = C5255e.m26199B(this.f16104b.f16094d);
                    String m26249p = C5255e.m26249p(date);
                    TextView textView = this.f16104b.time;
                    if (textView != null) {
                        textView.setText(m26199B);
                    }
                    TextView textView2 = this.f16104b.date;
                    if (textView2 != null) {
                        textView2.setText(m26249p);
                    }
                } catch (Exception e10) {
                }
            }
        });
    }

    /* renamed from: w0 */
    public void m14576w0() {
        ((ApiService) ApiclientRetrofit.m14644a().m22958b(ApiService.class)).m14640h("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "sitcount", "yes", ClientSharepreferenceHandler.m14490a(this.f16094d)).mo22862f(new InterfaceC4537d<ServicesIncoiveTicketCoutModelClass>(this) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.ServicesDashboardActivity.3

            /* renamed from: a */
            public final ServicesDashboardActivity f16105a;

            {
                this.f16105a = this;
            }

            @Override // dj.InterfaceC4537d
            /* renamed from: a */
            public void mo14532a(InterfaceC4535b<ServicesIncoiveTicketCoutModelClass> interfaceC4535b, C4554u<ServicesIncoiveTicketCoutModelClass> c4554u) {
                Context context;
                String str;
                if (!c4554u.m22954d() || c4554u.m22952a() == null) {
                    context = this.f16105a.f16094d;
                    str = "" + c4554u.m22953b() + " | Error";
                } else {
                    if (c4554u.m22952a().m14683b().equalsIgnoreCase("success")) {
                        if (c4554u.m22952a().m14682a().m14685b() == null || c4554u.m22952a().m14682a().m14684a() == null || c4554u.m22952a().m14682a().m14686c() == null) {
                            return;
                        }
                        int intValue = c4554u.m22952a().m14682a().m14685b().m14691a().intValue();
                        int intValue2 = c4554u.m22952a().m14682a().m14684a().m14690d().intValue();
                        String m14697a = c4554u.m22952a().m14682a().m14686c().m14697a();
                        this.f16105a.tv_service_count.setText(String.valueOf(intValue));
                        this.f16105a.pb_loader_service.m21502f();
                        this.f16105a.tv_service_count.setVisibility(0);
                        this.f16105a.tv_invoice_count.setText(String.valueOf(intValue2));
                        this.f16105a.pb_loader_invoice.m21502f();
                        this.f16105a.tv_invoice_count.setVisibility(0);
                        this.f16105a.tv_ticket_count.setText(m14697a);
                        this.f16105a.pb_loader_ticket.m21502f();
                        this.f16105a.tv_ticket_count.setVisibility(0);
                        return;
                    }
                    context = this.f16105a.f16094d;
                    str = "Failed";
                }
                Toast.makeText(context, str, 0).show();
            }

            @Override // dj.InterfaceC4537d
            /* renamed from: b */
            public void mo14533b(InterfaceC4535b<ServicesIncoiveTicketCoutModelClass> interfaceC4535b, Throwable th2) {
            }
        });
    }

    /* renamed from: x0 */
    public void m14577x0(int i10, TextView textView) {
        this.f16101k = new CountDownTimer(this, (i10 * 1000) + 1000, 1000L, textView) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.ServicesDashboardActivity.7

            /* renamed from: a */
            public final TextView f16110a;

            /* renamed from: b */
            public final ServicesDashboardActivity f16111b;

            {
                this.f16111b = this;
                this.f16110a = textView;
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                this.f16110a.setText(2132017636);
                this.f16111b.tv_free_trial_title.setText(2132017291);
                ServicesDashboardActivity servicesDashboardActivity = this.f16111b;
                servicesDashboardActivity.tv_free_trial_title.setTextColor(servicesDashboardActivity.getResources().getColor(2131100100));
                ServicesDashboardActivity servicesDashboardActivity2 = this.f16111b;
                servicesDashboardActivity2.tv_freetrai_time.setTextColor(servicesDashboardActivity2.getResources().getColor(2131100100));
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j10) {
                int i11 = (int) (j10 / 1000);
                int i12 = i11 / 3600;
                int i13 = i11 - ((i12 * 60) * 60);
                int i14 = i13 / 60;
                this.f16110a.setText(" " + String.format("%02d", Integer.valueOf(i12)) + ":" + String.format("%02d", Integer.valueOf(i14)) + ":" + String.format("%02d", Integer.valueOf(i13 - (i14 * 60))) + " Hrs");
                if (i12 <= 3) {
                    ServicesDashboardActivity servicesDashboardActivity = this.f16111b;
                    servicesDashboardActivity.tv_free_trial_title.setTextColor(servicesDashboardActivity.getResources().getColor(2131100100));
                    ServicesDashboardActivity servicesDashboardActivity2 = this.f16111b;
                    servicesDashboardActivity2.tv_freetrai_time.setTextColor(servicesDashboardActivity2.getResources().getColor(2131100100));
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.1f, 1.0f);
                    alphaAnimation.setDuration(1000L);
                    alphaAnimation.setStartOffset(20L);
                    alphaAnimation.setRepeatMode(2);
                    alphaAnimation.setRepeatCount(-1);
                    this.f16111b.tv_free_trial_title.startAnimation(alphaAnimation);
                    this.f16111b.tv_freetrai_time.startAnimation(alphaAnimation);
                }
            }
        }.start();
    }

    /* renamed from: z0 */
    public void m14578z0() {
        if (this.f16094d != null) {
            View inflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(2131624152, (RelativeLayout) findViewById(2131429033));
            PopupWindow popupWindow = new PopupWindow(this);
            f16093m = popupWindow;
            popupWindow.setContentView(inflate);
            f16093m.setWidth(-1);
            f16093m.setHeight(-1);
            f16093m.setFocusable(true);
            f16093m.showAtLocation(inflate, 17, 0, 0);
            this.f16095e = (TextView) inflate.findViewById(2131429550);
            this.f16096f = (TextView) inflate.findViewById(2131429411);
            this.f16097g = (Button) inflate.findViewById(2131427628);
            this.f16098h = (Button) inflate.findViewById(2131427605);
            TextView textView = this.f16095e;
            if (textView != null) {
                textView.setText(getResources().getString(2132017988));
            }
            TextView textView2 = this.f16096f;
            if (textView2 != null) {
                textView2.setText(getResources().getString(2132017987));
            }
            Button button = this.f16097g;
            if (button != null) {
                button.setOnFocusChangeListener(new C5255e.i(button, this));
            }
            Button button2 = this.f16098h;
            if (button2 != null) {
                button2.setOnFocusChangeListener(new C5255e.i(button2, this));
            }
            this.f16098h.setOnClickListener(new View.OnClickListener(this) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.ServicesDashboardActivity.5

                /* renamed from: b */
                public final ServicesDashboardActivity f16108b;

                {
                    this.f16108b = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ServicesDashboardActivity.f16093m.dismiss();
                }
            });
            Button button3 = this.f16097g;
            if (button3 != null) {
                button3.setOnClickListener(new View.OnClickListener(this) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.ServicesDashboardActivity.6

                    /* renamed from: b */
                    public final ServicesDashboardActivity f16109b;

                    {
                        this.f16109b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        this.f16109b.finish();
                        C5255e.m26211N(this.f16109b.f16094d);
                        this.f16109b.overridePendingTransition(2130772003, 2130772000);
                    }
                });
            }
        }
    }
}

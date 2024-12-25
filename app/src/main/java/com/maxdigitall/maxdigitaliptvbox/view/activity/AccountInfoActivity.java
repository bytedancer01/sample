package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.R;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.app.DialogC0242a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.Clientdatabase.ClientSharepreferenceHandler;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.ServicesDashboardActivity;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.interfaces.ApiService;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.interfaces.ApiclientRetrofit;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess.LoginWHMCSModelClass;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import dj.C4554u;
import dj.InterfaceC4535b;
import dj.InterfaceC4537d;
import java.util.Calendar;
import nf.C6783a;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5251a;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity.class */
public class AccountInfoActivity extends ActivityC0243b implements View.OnClickListener {

    /* renamed from: k */
    public static C6783a f16813k;

    @BindView
    public Button Logout;

    @BindView
    public AppBarLayout appbarToolbar;

    @BindView
    public Button btnBackAccountInfo;

    @BindView
    public Button btn_buy_now;

    /* renamed from: d */
    public Context f16814d;

    @BindView
    public TextView date;

    /* renamed from: e */
    public ProgressDialog f16815e;

    /* renamed from: f */
    public SharedPreferences f16816f;

    /* renamed from: g */
    public LiveStreamDBHandler f16817g;

    @BindView
    public ImageView iv_back_button;

    @BindView
    public ImageView logo;

    @BindView
    public TextView time;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tvActiveConn;

    @BindView
    public TextView tvCreatedAt;

    @BindView
    public TextView tvExpiryDate;

    @BindView
    public TextView tvIsTrial;

    @BindView
    public TextView tvMaxConnections;

    @BindView
    public TextView tvStatus;

    @BindView
    public TextView tvUsername;

    @BindView
    public TextView tv_username_label;

    /* renamed from: h */
    public String f16818h = "";

    /* renamed from: i */
    public String f16819i = "";

    /* renamed from: j */
    public Thread f16820j = null;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AccountInfoActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$a.class */
    public class DialogInterfaceOnClickListenerC2659a implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final AccountInfoActivity f16821b;

        public DialogInterfaceOnClickListenerC2659a(AccountInfoActivity accountInfoActivity) {
            this.f16821b = accountInfoActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f16821b.f16814d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AccountInfoActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$b.class */
    public class DialogInterfaceOnClickListenerC2660b implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final AccountInfoActivity f16822b;

        public DialogInterfaceOnClickListenerC2660b(AccountInfoActivity accountInfoActivity) {
            this.f16822b = accountInfoActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AccountInfoActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$c.class */
    public class DialogInterfaceOnClickListenerC2661c implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final AccountInfoActivity f16823b;

        public DialogInterfaceOnClickListenerC2661c(AccountInfoActivity accountInfoActivity) {
            this.f16823b = accountInfoActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AccountInfoActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$d.class */
    public class DialogInterfaceOnClickListenerC2662d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final AccountInfoActivity f16824b;

        public DialogInterfaceOnClickListenerC2662d(AccountInfoActivity accountInfoActivity) {
            this.f16824b = accountInfoActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AccountInfoActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$e.class */
    public class ViewOnClickListenerC2663e implements View.OnClickListener {

        /* renamed from: b */
        public final AccountInfoActivity f16825b;

        public ViewOnClickListenerC2663e(AccountInfoActivity accountInfoActivity) {
            this.f16825b = accountInfoActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f16825b.f16814d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AccountInfoActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$f.class */
    public class ViewOnClickListenerC2664f implements View.OnClickListener {

        /* renamed from: b */
        public final AccountInfoActivity f16826b;

        public ViewOnClickListenerC2664f(AccountInfoActivity accountInfoActivity) {
            this.f16826b = accountInfoActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f16826b.onBackPressed();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AccountInfoActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$g.class */
    public class ViewOnClickListenerC2665g implements View.OnClickListener {

        /* renamed from: b */
        public final AccountInfoActivity f16827b;

        public ViewOnClickListenerC2665g(AccountInfoActivity accountInfoActivity) {
            this.f16827b = accountInfoActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f16827b.onBackPressed();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AccountInfoActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$h.class */
    public class ViewOnClickListenerC2666h implements View.OnClickListener {

        /* renamed from: b */
        public final AccountInfoActivity f16828b;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$h$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AccountInfoActivity$h$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$h$a.class */
        public class a implements DialogInterface.OnClickListener {

            /* renamed from: b */
            public final ViewOnClickListenerC2666h f16829b;

            public a(ViewOnClickListenerC2666h viewOnClickListenerC2666h) {
                this.f16829b = viewOnClickListenerC2666h;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                dialogInterface.dismiss();
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$h$b.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AccountInfoActivity$h$b */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$h$b.class */
        public class b implements DialogInterface.OnClickListener {

            /* renamed from: b */
            public final ViewOnClickListenerC2666h f16830b;

            public b(ViewOnClickListenerC2666h viewOnClickListenerC2666h) {
                this.f16830b = viewOnClickListenerC2666h;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                C5255e.m26211N(this.f16830b.f16828b.f16814d);
            }
        }

        public ViewOnClickListenerC2666h(AccountInfoActivity accountInfoActivity) {
            this.f16828b = accountInfoActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            new DialogC0242a.a(this.f16828b, 2132082693).setTitle(this.f16828b.getResources().getString(2132017988)).m857e(this.f16828b.getResources().getString(2132017987)).m861i(this.f16828b.getResources().getString(2132018825), new b(this)).m858f(this.f16828b.getResources().getString(2132018187), new a(this)).m865m();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AccountInfoActivity$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$i.class */
    public class ViewOnClickListenerC2667i implements View.OnClickListener {

        /* renamed from: b */
        public final AccountInfoActivity f16831b;

        public ViewOnClickListenerC2667i(AccountInfoActivity accountInfoActivity) {
            this.f16831b = accountInfoActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f16831b.m15553q0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AccountInfoActivity$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$j.class */
    public class C2668j implements InterfaceC4537d<LoginWHMCSModelClass> {

        /* renamed from: a */
        public final AccountInfoActivity f16832a;

        public C2668j(AccountInfoActivity accountInfoActivity) {
            this.f16832a = accountInfoActivity;
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: a */
        public void mo14532a(InterfaceC4535b<LoginWHMCSModelClass> interfaceC4535b, C4554u<LoginWHMCSModelClass> c4554u) {
            Toast makeText;
            String str;
            Context context;
            C5255e.m26205H();
            if (c4554u.m22954d()) {
                if (c4554u.m22952a() == null || !c4554u.m22952a().m14675c().equalsIgnoreCase("success")) {
                    Context context2 = this.f16832a.f16814d;
                    str = "" + c4554u.m22952a().m14674b();
                    context = context2;
                } else {
                    ClientSharepreferenceHandler.m14495f(c4554u.m22952a().m14673a().m14676a().intValue(), this.f16832a.f16814d);
                    ClientSharepreferenceHandler.m14498i(c4554u.m22952a().m14673a().m14677b(), this.f16832a.f16814d);
                    ClientSharepreferenceHandler.m14499j(c4554u.m22952a().m14673a().m14679d(), this.f16832a.f16814d);
                    ClientSharepreferenceHandler.m14500k(c4554u.m22952a().m14673a().m14680e(), this.f16832a.f16814d);
                    this.f16832a.startActivity(new Intent(this.f16832a, (Class<?>) ServicesDashboardActivity.class));
                    context = this.f16832a.f16814d;
                    str = "successfully Login";
                }
                makeText = Toast.makeText(context, str, 0);
            } else {
                makeText = Toast.makeText(this.f16832a.f16814d, "", 0);
            }
            makeText.show();
        }

        @Override // dj.InterfaceC4537d
        /* renamed from: b */
        public void mo14533b(InterfaceC4535b<LoginWHMCSModelClass> interfaceC4535b, Throwable th2) {
            C5255e.m26205H();
            Toast.makeText(this.f16832a.f16814d, "error", 0).show();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AccountInfoActivity$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$k.class */
    public class RunnableC2669k implements Runnable {

        /* renamed from: b */
        public final AccountInfoActivity f16833b;

        public RunnableC2669k(AccountInfoActivity accountInfoActivity) {
            this.f16833b = accountInfoActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String date = Calendar.getInstance().getTime().toString();
                String m26199B = C5255e.m26199B(this.f16833b.f16814d);
                String m26249p = C5255e.m26249p(date);
                TextView textView = this.f16833b.time;
                if (textView != null) {
                    textView.setText(m26199B);
                }
                TextView textView2 = this.f16833b.date;
                if (textView2 != null) {
                    textView2.setText(m26249p);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$l.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AccountInfoActivity$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$l.class */
    public class DialogInterfaceOnClickListenerC2670l implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final AccountInfoActivity f16834b;

        public DialogInterfaceOnClickListenerC2670l(AccountInfoActivity accountInfoActivity) {
            this.f16834b = accountInfoActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$m.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AccountInfoActivity$m */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$m.class */
    public class DialogInterfaceOnClickListenerC2671m implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final AccountInfoActivity f16835b;

        public DialogInterfaceOnClickListenerC2671m(AccountInfoActivity accountInfoActivity) {
            this.f16835b = accountInfoActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f16835b.f16814d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$n.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AccountInfoActivity$n */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$n.class */
    public class RunnableC2672n implements Runnable {

        /* renamed from: b */
        public final AccountInfoActivity f16836b;

        public RunnableC2672n(AccountInfoActivity accountInfoActivity) {
            this.f16836b = accountInfoActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f16836b.m15555u0();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                } catch (Exception e11) {
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$o.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AccountInfoActivity$o */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity$o.class */
    public class ViewOnFocusChangeListenerC2673o implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f16837b;

        /* renamed from: c */
        public final AccountInfoActivity f16838c;

        public ViewOnFocusChangeListenerC2673o(AccountInfoActivity accountInfoActivity, View view) {
            this.f16838c = accountInfoActivity;
            this.f16837b = view;
        }

        /* renamed from: a */
        public final void m15558a(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16837b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: b */
        public final void m15559b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16837b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            View view2;
            int i10;
            float f10 = 1.0f;
            if (!z10) {
                if (z10) {
                    return;
                }
                if (z10) {
                    f10 = 1.09f;
                }
                m15558a(f10);
                m15559b(f10);
                if (this.f16837b.getTag().equals("1") || this.f16837b.getTag().equals("2")) {
                    this.f16837b.setBackgroundResource(2131230845);
                    return;
                }
                return;
            }
            if (z10) {
                f10 = 1.05f;
            }
            m15558a(f10);
            m15559b(f10);
            Log.e("id is", "" + this.f16837b.getTag());
            if (this.f16837b.getTag().equals("1")) {
                view2 = this.f16837b;
                i10 = 2131230828;
            } else {
                if (!this.f16837b.getTag().equals("2")) {
                    return;
                }
                view2 = this.f16837b;
                i10 = 2131231576;
            }
            view2.setBackgroundResource(i10);
        }
    }

    /* renamed from: b */
    public void m15552b() {
        ProgressDialog progressDialog = this.f16815e;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(2130772003, 2130772000);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != 2131429468) {
            return;
        }
        startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
        overridePendingTransition(2130772003, 2130772000);
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f16814d = this;
        super.onCreate(bundle);
        C6783a c6783a = new C6783a(this.f16814d);
        f16813k = c6783a;
        setContentView(c6783a.m31288z().equals(C5251a.f30065s0) ? 2131623965 : 2131623964);
        ButterKnife.m5626a(this);
        m15554t0();
        m15556v0();
        m878n0((Toolbar) findViewById(2131429320));
        getWindow().setFlags(1024, 1024);
        m15557w0();
        Thread thread = this.f16820j;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC2672n(this));
            this.f16820j = thread2;
            thread2.start();
        }
        this.logo.setOnClickListener(new ViewOnClickListenerC2663e(this));
        this.btnBackAccountInfo.setOnClickListener(new ViewOnClickListenerC2664f(this));
        this.iv_back_button.setOnClickListener(new ViewOnClickListenerC2665g(this));
        this.Logout.setOnClickListener(new ViewOnClickListenerC2666h(this));
        Button button = this.btn_buy_now;
        button.setOnFocusChangeListener(new C5255e.i(button, this));
        this.btn_buy_now.setOnClickListener(new ViewOnClickListenerC2667i(this));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.m1224x(2131689500);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i10 = 0; i10 < this.toolbar.getChildCount(); i10++) {
            if (this.toolbar.getChildAt(i10) instanceof ActionMenuView) {
                ((Toolbar.C0292e) this.toolbar.getChildAt(i10).getLayoutParams()).f26228a = 16;
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        int itemId = menuItem.getItemId();
        if (itemId == 2131428761) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == 2131428776) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == 2131427416 && (context = this.f16814d) != null) {
            new DialogC0242a.a(context, 2132082693).setTitle(getResources().getString(2132017988)).m857e(getResources().getString(2132017987)).m861i(getResources().getString(2132018825), new DialogInterfaceOnClickListenerC2671m(this)).m858f(getResources().getString(2132018187), new DialogInterfaceOnClickListenerC2670l(this)).m865m();
        }
        if (itemId == 2131428637) {
            DialogC0242a.a aVar = new DialogC0242a.a(this);
            aVar.setTitle(this.f16814d.getResources().getString(2132017514));
            aVar.m857e(this.f16814d.getResources().getString(2132017585));
            aVar.m855c(2131231731);
            aVar.m861i(this.f16814d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC2659a(this));
            aVar.m858f(this.f16814d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC2660b(this));
            aVar.m865m();
        }
        if (itemId == 2131428639) {
            DialogC0242a.a aVar2 = new DialogC0242a.a(this);
            aVar2.setTitle(this.f16814d.getResources().getString(2132017514));
            aVar2.m857e(this.f16814d.getResources().getString(2132017585));
            aVar2.m855c(2131231731);
            aVar2.m861i(this.f16814d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC2661c(this));
            aVar2.m858f(this.f16814d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC2662d(this));
            aVar2.m865m();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f16820j;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f16820j.interrupt();
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f16820j;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC2672n(this));
            this.f16820j = thread2;
            thread2.start();
        }
        C5255e.m26233f(this.f16814d);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f16816f = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f16816f.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
            overridePendingTransition(2130772003, 2130772000);
        } else if (this.f16814d != null) {
            m15552b();
        }
    }

    /* renamed from: q0 */
    public final void m15553q0() {
        C5255e.m26236h0(this);
        ((ApiService) ApiclientRetrofit.m14644a().m22958b(ApiService.class)).m14638f("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "validateCustomLogin", "yes", SharepreferenceDBHandler.m15338B(this.f16814d), SharepreferenceDBHandler.m15339C(this.f16814d)).mo22862f(new C2668j(this));
    }

    /* renamed from: t0 */
    public final void m15554t0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: u0 */
    public void m15555u0() {
        runOnUiThread(new RunnableC2669k(this));
    }

    /* renamed from: v0 */
    public final void m15556v0() {
        Button button = this.btnBackAccountInfo;
        if (button != null) {
            button.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2673o(this, button));
            this.btnBackAccountInfo.requestFocus();
            this.btnBackAccountInfo.requestFocusFromTouch();
        }
        Button button2 = this.Logout;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2673o(this, button2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x00ac, code lost:
    
        if (r11 != null) goto L12;
     */
    /* renamed from: w0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m15557w0() {
        /*
            Method dump skipped, instructions count: 808
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.AccountInfoActivity.m15557w0():void");
    }
}

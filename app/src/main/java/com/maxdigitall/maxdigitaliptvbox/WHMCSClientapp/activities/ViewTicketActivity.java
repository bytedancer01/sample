package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.amplifyframework.core.model.ModelIdentifier;
import com.github.ybq.android.spinkit.SpinKitView;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.Clientdatabase.ClientSharepreferenceHandler;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.adapters.TicketMessageAdapter;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.interfaces.ApiService;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.interfaces.ApiclientRetrofit;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess.TickedMessageModelClass;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess.TicketModelClass;
import dj.C4554u;
import dj.InterfaceC4535b;
import dj.InterfaceC4537d;
import java.util.Calendar;
import java.util.List;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/ViewTicketActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/ViewTicketActivity.class */
public class ViewTicketActivity extends ActivityC0243b {

    @BindView
    public Button btReply;

    @BindView
    public Button bt_cancel_reply;

    @BindView
    public TextView date;

    /* renamed from: e */
    public RecyclerView.AbstractC0677h f16170e;

    /* renamed from: f */
    public Context f16171f;

    /* renamed from: g */
    public List<TickedMessageModelClass.Replies.Reply> f16172g;

    /* renamed from: i */
    public AlertDialog f16174i;

    @BindView
    public LinearLayout ll_replay;

    @BindView
    public SpinKitView progress;

    @BindView
    public RecyclerView recyclerView;

    @BindView
    public TextView textNotFound;

    @BindView
    public TextView time;

    @BindView
    public TextView tv_title;

    /* renamed from: d */
    public Bundle f16169d = null;

    /* renamed from: h */
    public String f16173h = "";

    /* renamed from: j */
    public String f16175j = "";

    /* renamed from: k */
    public Thread f16176k = null;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/ViewTicketActivity$CountDownRunner.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/ViewTicketActivity$CountDownRunner.class */
    public class CountDownRunner implements Runnable {

        /* renamed from: b */
        public final ViewTicketActivity f16184b;

        public CountDownRunner(ViewTicketActivity viewTicketActivity) {
            this.f16184b = viewTicketActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f16184b.m14596w0();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                } catch (Exception e11) {
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/ViewTicketActivity$OnFocusChangeAccountListener.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/ViewTicketActivity$OnFocusChangeAccountListener.class */
    public class OnFocusChangeAccountListener implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f16185b;

        /* renamed from: a */
        public final void m14599a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16185b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m14600b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16185b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m14601c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16185b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            float f10 = 1.09f;
            if (!z10) {
                if (z10) {
                    return;
                }
                if (!z10) {
                    f10 = 1.0f;
                }
                m14600b(f10);
                m14601c(f10);
                m14599a(z10);
                return;
            }
            Log.e("id is", "" + this.f16185b.getTag());
            if (!z10) {
                f10 = 1.0f;
            }
            m14600b(f10);
            m14601c(f10);
        }
    }

    /* renamed from: A0 */
    public void m14594A0() {
        if (this.f16171f != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this, 2132082693);
            View inflate = LayoutInflater.from(this).inflate(2131624494, (ViewGroup) null);
            Button button = (Button) inflate.findViewById(2131427670);
            Button button2 = (Button) inflate.findViewById(2131427602);
            button.setOnFocusChangeListener(new C5255e.i(button, this));
            button2.setOnFocusChangeListener(new C5255e.i(button2, this));
            button.setOnClickListener(new View.OnClickListener(this, (EditText) inflate.findViewById(2131427914)) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.ViewTicketActivity.4

                /* renamed from: b */
                public final EditText f16181b;

                /* renamed from: c */
                public final ViewTicketActivity f16182c;

                {
                    this.f16182c = this;
                    this.f16181b = r5;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    String obj = this.f16181b.getText().toString();
                    if (obj != null && obj.equalsIgnoreCase("")) {
                        C5255e.m26241k0(this.f16182c.f16171f, "Please enter message");
                    } else {
                        ViewTicketActivity viewTicketActivity = this.f16182c;
                        viewTicketActivity.m14597x0(obj, viewTicketActivity.f16174i);
                    }
                }
            });
            button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.ViewTicketActivity.5

                /* renamed from: b */
                public final ViewTicketActivity f16183b;

                {
                    this.f16183b = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    this.f16183b.f16174i.dismiss();
                }
            });
            builder.setView(inflate);
            this.f16174i = builder.create();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(this.f16174i.getWindow().getAttributes());
            layoutParams.width = -1;
            layoutParams.height = -2;
            this.f16174i.show();
            this.f16174i.getWindow().setAttributes(layoutParams);
            this.f16174i.setCancelable(false);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624087);
        ButterKnife.m5626a(this);
        this.f16171f = this;
        Thread thread = this.f16176k;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new CountDownRunner(this));
            this.f16176k = thread2;
            thread2.start();
        }
        Button button = this.btReply;
        button.setOnFocusChangeListener(new C5255e.i(button, this));
        Button button2 = this.bt_cancel_reply;
        button2.setOnFocusChangeListener(new C5255e.i(button2, this));
        Intent intent = getIntent();
        this.f16173h = intent.getStringExtra("ticketid");
        String stringExtra = intent.getStringExtra("Title");
        this.f16175j = stringExtra;
        if (stringExtra == null || stringExtra.equalsIgnoreCase("")) {
            this.tv_title.setVisibility(8);
        } else {
            this.tv_title.setText(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + this.f16175j);
        }
        m14595q0();
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f16176k;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f16176k.interrupt();
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f16176k;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new CountDownRunner(this));
            this.f16176k = thread2;
            thread2.start();
        }
    }

    @OnClick
    public void onViewClicked(View view) {
        int id2 = view.getId();
        if (id2 == 2131427602) {
            onBackPressed();
        } else {
            if (id2 != 2131427615) {
                return;
            }
            m14594A0();
        }
    }

    /* renamed from: q0 */
    public final void m14595q0() {
        ((ApiService) ApiclientRetrofit.m14644a().m22958b(ApiService.class)).m14633a("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "GetTicket", "no", this.f16173h).mo22862f(new InterfaceC4537d<TickedMessageModelClass>(this) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.ViewTicketActivity.3

            /* renamed from: a */
            public final ViewTicketActivity f16180a;

            {
                this.f16180a = this;
            }

            @Override // dj.InterfaceC4537d
            /* renamed from: a */
            public void mo14532a(InterfaceC4535b<TickedMessageModelClass> interfaceC4535b, C4554u<TickedMessageModelClass> c4554u) {
                if (!c4554u.m22954d() || c4554u.m22952a() == null || !c4554u.m22952a().m14699b().equals("success")) {
                    this.f16180a.m14598z0(Boolean.FALSE);
                    return;
                }
                this.f16180a.m14598z0(Boolean.TRUE);
                this.f16180a.f16172g = c4554u.m22952a().m14698a().m14700a();
                List<TickedMessageModelClass.Replies.Reply> list = this.f16180a.f16172g;
                if (list == null || list.size() <= 0) {
                    return;
                }
                ViewTicketActivity viewTicketActivity = this.f16180a;
                viewTicketActivity.recyclerView.setLayoutManager(new LinearLayoutManager(viewTicketActivity));
                ViewTicketActivity viewTicketActivity2 = this.f16180a;
                viewTicketActivity2.f16170e = new TicketMessageAdapter(viewTicketActivity2.f16171f, this.f16180a.f16172g);
                ViewTicketActivity viewTicketActivity3 = this.f16180a;
                viewTicketActivity3.recyclerView.setAdapter(viewTicketActivity3.f16170e);
                this.f16180a.f16170e.m4099w();
            }

            @Override // dj.InterfaceC4537d
            /* renamed from: b */
            public void mo14533b(InterfaceC4535b<TickedMessageModelClass> interfaceC4535b, Throwable th2) {
                this.f16180a.m14598z0(Boolean.FALSE);
            }
        });
    }

    /* renamed from: w0 */
    public void m14596w0() {
        runOnUiThread(new Runnable(this) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.ViewTicketActivity.1

            /* renamed from: b */
            public final ViewTicketActivity f16177b;

            {
                this.f16177b = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    String date = Calendar.getInstance().getTime().toString();
                    String m26199B = C5255e.m26199B(this.f16177b.f16171f);
                    String m26249p = C5255e.m26249p(date);
                    TextView textView = this.f16177b.time;
                    if (textView != null) {
                        textView.setText(m26199B);
                    }
                    TextView textView2 = this.f16177b.date;
                    if (textView2 != null) {
                        textView2.setText(m26249p);
                    }
                } catch (Exception e10) {
                }
            }
        });
    }

    /* renamed from: x0 */
    public final void m14597x0(String str, AlertDialog alertDialog) {
        if (this.f16171f != null) {
            C5255e.m26236h0(this);
            ((ApiService) ApiclientRetrofit.m14644a().m22958b(ApiService.class)).m14641i("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "AddTicketReply", "no", str, ClientSharepreferenceHandler.m14490a(this.f16171f), this.f16173h).mo22862f(new InterfaceC4537d<TicketModelClass>(this, alertDialog) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.ViewTicketActivity.2

                /* renamed from: a */
                public final AlertDialog f16178a;

                /* renamed from: b */
                public final ViewTicketActivity f16179b;

                {
                    this.f16179b = this;
                    this.f16178a = alertDialog;
                }

                @Override // dj.InterfaceC4537d
                /* renamed from: a */
                public void mo14532a(InterfaceC4535b<TicketModelClass> interfaceC4535b, C4554u<TicketModelClass> c4554u) {
                    Context context;
                    CharSequence charSequence;
                    C5255e.m26205H();
                    if (!c4554u.m22954d() || c4554u.m22952a() == null) {
                        context = this.f16179b.f16171f;
                        charSequence = "Response Error";
                    } else {
                        if (c4554u.m22952a().m14705a().equals("success")) {
                            Toast.makeText(this.f16179b.getApplicationContext(), "Your ticket added successfully", 0).show();
                            AlertDialog alertDialog2 = this.f16178a;
                            if (alertDialog2 != null) {
                                alertDialog2.dismiss();
                            }
                            this.f16179b.m14595q0();
                            return;
                        }
                        context = this.f16179b.f16171f;
                        charSequence = "Error";
                    }
                    Toast.makeText(context, charSequence, 0).show();
                }

                @Override // dj.InterfaceC4537d
                /* renamed from: b */
                public void mo14533b(InterfaceC4535b<TicketModelClass> interfaceC4535b, Throwable th2) {
                    Toast.makeText(this.f16179b.f16171f, "Network error occured! Please try again", 0).show();
                    C5255e.m26205H();
                }
            });
        }
    }

    /* renamed from: z0 */
    public void m14598z0(Boolean bool) {
        if (bool.booleanValue()) {
            this.recyclerView.setVisibility(0);
            this.btReply.setVisibility(0);
            this.ll_replay.setVisibility(0);
        } else {
            this.textNotFound.setVisibility(0);
            this.btReply.setVisibility(8);
            this.ll_replay.setVisibility(8);
        }
        this.progress.setVisibility(8);
    }
}

package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.github.ybq.android.spinkit.SpinKitView;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.Clientdatabase.ClientSharepreferenceHandler;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.adapters.TicketAdapter;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.interfaces.ApiService;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.interfaces.ApiclientRetrofit;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.modelclassess.TicketModelClass;
import dj.C4554u;
import dj.InterfaceC4535b;
import dj.InterfaceC4537d;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/MyTicketActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/MyTicketActivity.class */
public class MyTicketActivity extends ActivityC0243b {

    /* renamed from: d */
    public Context f16054d;

    /* renamed from: e */
    public RecyclerView.AbstractC0677h f16055e;

    /* renamed from: f */
    public boolean f16056f = false;

    @BindView
    public ImageView iv_fab;

    @BindView
    public LinearLayout llFloatingButton;

    @BindView
    public LinearLayout llRecycleview;

    @BindView
    public SpinKitView progress;

    @BindView
    public RecyclerView recyclerView;

    @BindView
    public TextView tvNoSupportTicket;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/MyTicketActivity$OnFocusChangeAccountListener.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/MyTicketActivity$OnFocusChangeAccountListener.class */
    public class OnFocusChangeAccountListener implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f16058b;

        /* renamed from: c */
        public final MyTicketActivity f16059c;

        public OnFocusChangeAccountListener(MyTicketActivity myTicketActivity, View view) {
            this.f16059c = myTicketActivity;
            this.f16058b = view;
        }

        /* renamed from: a */
        public final void m14555a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16058b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m14556b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16058b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m14557c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16058b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            float f10 = 1.25f;
            if (!z10) {
                if (z10 || !this.f16058b.getTag().equals("7")) {
                    return;
                }
                if (!z10) {
                    f10 = 1.0f;
                }
                m14556b(f10);
                m14557c(f10);
                m14555a(z10);
                return;
            }
            Log.e("id is", "" + this.f16058b.getTag());
            if (this.f16058b.getTag().equals("7")) {
                if (!z10) {
                    f10 = 1.0f;
                }
                m14556b(f10);
                m14557c(f10);
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624020);
        ButterKnife.m5626a(this);
        this.f16054d = this;
        ImageView imageView = this.iv_fab;
        imageView.setOnFocusChangeListener(new OnFocusChangeAccountListener(this, imageView));
        String action = getIntent().getAction();
        if (action == null || !action.equalsIgnoreCase("updateticket") || this.f16056f) {
            return;
        }
        m14553t0();
        this.f16056f = true;
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f16056f) {
            return;
        }
        m14553t0();
        this.f16056f = true;
    }

    @OnClick
    public void onViewClicked() {
        startActivity(new Intent(this, (Class<?>) OpenTicketActivity.class));
    }

    /* renamed from: t0 */
    public final void m14553t0() {
        ((ApiService) ApiclientRetrofit.m14644a().m22958b(ApiService.class)).m14634b("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "GetTickets", "no", ClientSharepreferenceHandler.m14490a(this.f16054d)).mo22862f(new InterfaceC4537d<TicketModelClass>(this) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.MyTicketActivity.1

            /* renamed from: a */
            public final MyTicketActivity f16057a;

            {
                this.f16057a = this;
            }

            @Override // dj.InterfaceC4537d
            /* renamed from: a */
            public void mo14532a(InterfaceC4535b<TicketModelClass> interfaceC4535b, C4554u<TicketModelClass> c4554u) {
                if (c4554u.m22952a() != null && c4554u.m22954d() && c4554u.m22952a() != null && c4554u.m22952a().m14705a().equalsIgnoreCase("success")) {
                    this.f16057a.m14554u0(Boolean.TRUE);
                    if (c4554u.m22952a().m14706b() != null) {
                        List<TicketModelClass.Tickets.Ticket> m14707a = c4554u.m22952a().m14706b().m14707a();
                        MyTicketActivity myTicketActivity = this.f16057a;
                        myTicketActivity.recyclerView.setLayoutManager(new GridLayoutManager(myTicketActivity, 2));
                        if (m14707a == null || m14707a.size() <= 0) {
                            return;
                        }
                        MyTicketActivity myTicketActivity2 = this.f16057a;
                        myTicketActivity2.f16055e = new TicketAdapter(m14707a, myTicketActivity2.f16054d);
                        MyTicketActivity myTicketActivity3 = this.f16057a;
                        myTicketActivity3.recyclerView.setAdapter(myTicketActivity3.f16055e);
                        this.f16057a.f16055e.m4099w();
                        return;
                    }
                }
                this.f16057a.m14554u0(Boolean.FALSE);
            }

            @Override // dj.InterfaceC4537d
            /* renamed from: b */
            public void mo14533b(InterfaceC4535b<TicketModelClass> interfaceC4535b, Throwable th2) {
                Toast.makeText(this.f16057a, "Network error occured! Please try again", 0).show();
                this.f16057a.m14554u0(Boolean.FALSE);
            }
        });
    }

    /* renamed from: u0 */
    public void m14554u0(Boolean bool) {
        (bool.booleanValue() ? this.recyclerView : this.tvNoSupportTicket).setVisibility(0);
        this.progress.setVisibility(8);
    }
}

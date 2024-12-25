package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import androidx.recyclerview.widget.C0704c;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.maxdigitall.maxdigitaliptvbox.model.MultiUserDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.MultiUserDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.MultiUserAdapter;
import java.util.ArrayList;
import nf.C6783a;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5251a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiUserActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiUserActivity.class */
public class MultiUserActivity extends ActivityC0243b {

    @BindView
    public ImageView addmore;

    /* renamed from: d */
    public Context f17714d;

    /* renamed from: e */
    public Handler f17715e;

    @BindView
    public TextView emptyView;

    /* renamed from: f */
    public MultiUserDBHandler f17716f;

    @BindView
    public FrameLayout frameLayout;

    /* renamed from: g */
    public SharedPreferences f17717g;

    /* renamed from: h */
    public Boolean f17718h;

    /* renamed from: i */
    public MultiUserAdapter f17719i;

    @BindView
    public ImageView ivBTUP;

    /* renamed from: j */
    public GridLayoutManager f17720j;

    /* renamed from: k */
    public Intent f17721k;

    @BindView
    public LinearLayout ll_add_new_user;

    @BindView
    public LinearLayout ll_add_user;

    @BindView
    public LinearLayout ll_termsandservices;

    @BindView
    public RecyclerView myRecyclerView;

    /* renamed from: n */
    public C6783a f17724n;

    @BindView
    public ProgressBar pbLoader;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public TextView tvNoStream;

    @BindView
    public TextView tv_link2;

    @BindView
    public TextView tv_list_options;

    /* renamed from: l */
    public boolean f17722l = false;

    /* renamed from: m */
    public String f17723m = "false";

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiUserActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.MultiUserActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiUserActivity$a.class */
    public class ViewOnClickListenerC2857a implements View.OnClickListener {

        /* renamed from: b */
        public final MultiUserActivity f17725b;

        public ViewOnClickListenerC2857a(MultiUserActivity multiUserActivity) {
            this.f17725b = multiUserActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("https://www.iptvsmarters.com/terms-and-conditions/"));
                this.f17725b.startActivity(intent);
            } catch (Exception e10) {
                Toast.makeText(this.f17725b.getApplicationContext(), "Your Device Not Supported !!", 1).show();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiUserActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.MultiUserActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiUserActivity$b.class */
    public class ViewOnFocusChangeListenerC2858b implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f17726b;

        /* renamed from: c */
        public final MultiUserActivity f17727c;

        public ViewOnFocusChangeListenerC2858b(MultiUserActivity multiUserActivity, View view) {
            this.f17727c = multiUserActivity;
            this.f17726b = view;
        }

        /* renamed from: a */
        public final void m16071a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17726b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m16072b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17726b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m16073c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17726b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            float f10 = 2.0f;
            if (!z10) {
                if (z10 || !this.f17726b.getTag().equals("7")) {
                    return;
                }
                if (!z10) {
                    f10 = 1.0f;
                }
                m16072b(f10);
                m16073c(f10);
                m16071a(z10);
                return;
            }
            Log.e("id is", "" + this.f17726b.getTag());
            if (this.f17726b.getTag().equals("7")) {
                if (!z10) {
                    f10 = 1.0f;
                }
                m16072b(f10);
                m16073c(f10);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f17714d = this;
        super.onCreate(bundle);
        requestWindowFeature(1);
        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
        }
        C6783a c6783a = new C6783a(this.f17714d);
        this.f17724n = c6783a;
        setContentView(c6783a.m31288z().equals(C5251a.f30065s0) ? 2131624017 : 2131624016);
        ButterKnife.m5626a(this);
        if (C5251a.f30014M.booleanValue()) {
            this.ll_termsandservices.setVisibility(0);
        } else {
            this.ll_termsandservices.setVisibility(8);
        }
        Intent intent = getIntent();
        this.f17721k = intent;
        String stringExtra = intent.getStringExtra("from_login");
        this.f17723m = stringExtra;
        if (stringExtra == null) {
            this.f17723m = "false";
        }
        this.f17723m.equals("true");
        getWindow().setFlags(1024, 1024);
        m16068q0();
        this.tv_link2.setOnClickListener(new ViewOnClickListenerC2857a(this));
        getSharedPreferences("Accept_clicked", 0).getString("Accept_clicked", "");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedprefremberme", 0);
        this.f17717g = sharedPreferences;
        this.f17718h = Boolean.valueOf(sharedPreferences.getBoolean("savelogin", false));
        ImageView imageView = this.addmore;
        imageView.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2858b(this, imageView));
        this.f17716f = new MultiUserDBHandler(this.f17714d);
        m16069r0();
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        overridePendingTransition(2130772003, 2130772000);
    }

    @OnClick
    public void onViewClicked(View view) {
        int id2 = view.getId();
        if (id2 == 2131428318 || id2 == 2131428322) {
            startActivity(C5251a.f30036e.booleanValue() ? new Intent(this, (Class<?>) RoutingActivity.class) : new Intent(this, (Class<?>) LoginActivity.class));
            overridePendingTransition(2130772003, 2130772000);
            C5251a.f30012K = Boolean.TRUE;
            finish();
        }
    }

    /* renamed from: q0 */
    public final void m16068q0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: r0 */
    public void m16069r0() {
        Handler handler = new Handler();
        this.f17715e = handler;
        handler.removeCallbacksAndMessages(null);
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        m16070s0();
        ProgressBar progressBar2 = this.pbLoader;
        if (progressBar2 != null) {
            progressBar2.setVisibility(8);
        }
    }

    /* renamed from: s0 */
    public void m16070s0() {
        ArrayList<MultiUserDBModel> m15281w = this.f17716f.m15281w();
        MultiUserDBModel multiUserDBModel = (!SharepreferenceDBHandler.m15373f(this.f17714d).equals("m3u") || m15281w.size() <= 0) ? null : m15281w.get(0);
        ArrayList<MultiUserDBModel> m15279v = this.f17716f.m15279v();
        MultiUserDBModel multiUserDBModel2 = multiUserDBModel;
        if (SharepreferenceDBHandler.m15373f(this.f17714d).equals("api")) {
            multiUserDBModel2 = multiUserDBModel;
            if (m15279v.size() > 0) {
                multiUserDBModel2 = m15279v.get(0);
            }
        }
        m15281w.addAll(m15279v);
        if (m15281w.size() > 0) {
            this.tv_list_options.setVisibility(8);
            this.f17719i = new MultiUserAdapter(this, m15281w, this.f17714d, this.ll_add_new_user, this.tv_list_options, this.f17723m, multiUserDBModel2, this.ll_add_user);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
            this.f17720j = gridLayoutManager;
            this.myRecyclerView.setLayoutManager(gridLayoutManager);
            this.myRecyclerView.setItemAnimator(new C0704c());
            this.myRecyclerView.setAdapter(this.f17719i);
        } else {
            this.ll_add_new_user.setVisibility(0);
            this.ll_add_user.setNextFocusDownId(2131428318);
        }
        C5251a.f30013L = Boolean.FALSE;
    }
}

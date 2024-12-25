package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamCategoryIdDBModel;
import java.util.ArrayList;
import java.util.Calendar;
import nf.C6783a;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5255e;
import p203lf.C5861n;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGActivity.class */
public class NewEPGActivity extends ActivityC0243b implements View.OnClickListener {

    @BindView
    public AppBarLayout appbarToolbar;

    /* renamed from: d */
    public Context f17828d;

    @BindView
    public TextView date;

    /* renamed from: e */
    public SharedPreferences f17829e;

    /* renamed from: g */
    public ArrayList<LiveStreamCategoryIdDBModel> f17831g;

    @BindView
    public ImageView iv_back_button;

    /* renamed from: k */
    public C6783a f17835k;

    @BindView
    public LinearLayout ll_header;

    @BindView
    public ImageView logo;

    @BindView
    public ProgressBar pbLoader;

    @BindView
    public TabLayout slidingTabs;

    @BindView
    public TextView time;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tvHeaderTitle;

    @BindView
    public TextView tv_cat_title;

    @BindView
    public ViewPager viewpager;

    /* renamed from: f */
    public ArrayList<String> f17830f = new ArrayList<>();

    /* renamed from: h */
    public String f17832h = "";

    /* renamed from: i */
    public String f17833i = "";

    /* renamed from: j */
    public boolean f17834j = false;

    /* renamed from: l */
    public Thread f17836l = null;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewEPGActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGActivity$a.class */
    public class ViewOnClickListenerC2883a implements View.OnClickListener {

        /* renamed from: b */
        public final NewEPGActivity f17837b;

        public ViewOnClickListenerC2883a(NewEPGActivity newEPGActivity) {
            this.f17837b = newEPGActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f17837b.f17828d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewEPGActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGActivity$b.class */
    public class ViewOnClickListenerC2884b implements View.OnClickListener {

        /* renamed from: b */
        public final NewEPGActivity f17838b;

        public ViewOnClickListenerC2884b(NewEPGActivity newEPGActivity) {
            this.f17838b = newEPGActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f17838b.onBackPressed();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewEPGActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGActivity$c.class */
    public class RunnableC2885c implements Runnable {

        /* renamed from: b */
        public final NewEPGActivity f17839b;

        public RunnableC2885c(NewEPGActivity newEPGActivity) {
            this.f17839b = newEPGActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String date = Calendar.getInstance().getTime().toString();
                String m26199B = C5255e.m26199B(this.f17839b.f17828d);
                String m26249p = C5255e.m26249p(date);
                TextView textView = this.f17839b.time;
                if (textView != null) {
                    textView.setText(m26199B);
                }
                TextView textView2 = this.f17839b.date;
                if (textView2 != null) {
                    textView2.setText(m26249p);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.NewEPGActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/NewEPGActivity$d.class */
    public class RunnableC2886d implements Runnable {

        /* renamed from: b */
        public final NewEPGActivity f17840b;

        public RunnableC2886d(NewEPGActivity newEPGActivity) {
            this.f17840b = newEPGActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f17840b.m16175s0();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                } catch (Exception e11) {
                }
            }
        }
    }

    /* renamed from: b */
    public void m16173b() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        if (r4.f17834j == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
    
        if (r4.f17834j == false) goto L7;
     */
    @Override // androidx.appcompat.app.ActivityC0243b, p030c0.ActivityC0952l, android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r5) {
        /*
            r4 = this;
            r0 = r5
            int r0 = r0.getAction()
            r6 = r0
            r0 = r5
            int r0 = r0.getKeyCode()
            switch(r0) {
                case 20: goto L27;
                case 21: goto L61;
                case 22: goto L6b;
                default: goto L24;
            }
        L24:
            goto L75
        L27:
            r0 = r4
            boolean r0 = r0.f17834j
            if (r0 != 0) goto L4d
        L2e:
            r0 = r4
            android.widget.LinearLayout r0 = r0.ll_header
            boolean r0 = r0.requestFocus()
            r0 = r4
            android.widget.LinearLayout r0 = r0.ll_header
            r1 = r4
            android.content.Context r1 = r1.f17828d
            r2 = 2131099777(0x7f060081, float:1.7811917E38)
            android.graphics.drawable.Drawable r1 = p050d0.C4290b.m21726e(r1, r2)
            r0.setBackground(r1)
            r0 = r4
            r1 = 1
            r0.f17834j = r1
            r0 = 1
            return r0
        L4d:
            r0 = r6
            if (r0 != 0) goto L61
            r0 = r4
            android.widget.LinearLayout r0 = r0.ll_header
            r1 = r4
            android.content.Context r1 = r1.f17828d
            r2 = 2131231982(0x7f0804ee, float:1.808006E38)
            android.graphics.drawable.Drawable r1 = p050d0.C4290b.m21726e(r1, r2)
            r0.setBackground(r1)
        L61:
            r0 = r4
            boolean r0 = r0.f17834j
            if (r0 != 0) goto L6b
            goto L2e
        L6b:
            r0 = r4
            boolean r0 = r0.f17834j
            if (r0 != 0) goto L75
            goto L2e
        L75:
            r0 = r4
            r1 = r5
            boolean r0 = super.dispatchKeyEvent(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.NewEPGActivity.dispatchKeyEvent(android.view.KeyEvent):boolean");
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
        m16178v0();
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m16176t0();
        setContentView(2131624021);
        ButterKnife.m5626a(this);
        overridePendingTransition(2130772003, 2130772000);
        m16174r0();
        m878n0((Toolbar) findViewById(2131429320));
        Intent intent = getIntent();
        if (intent != null) {
            this.f17832h = intent.getStringExtra("category_id");
            String stringExtra = intent.getStringExtra("category_name");
            this.f17833i = stringExtra;
            TextView textView = this.tv_cat_title;
            if (textView != null) {
                textView.setText(stringExtra);
            }
        }
        this.f17828d = this;
        C6783a c6783a = new C6783a(this);
        this.f17835k = c6783a;
        try {
            if (c6783a.m31285w() != 3) {
                IjkMediaPlayer.loadLibrariesOnce(null);
                IjkMediaPlayer.native_profileBegin("libijkplayer.so");
            }
        } catch (Exception | UnsatisfiedLinkError e10) {
        }
        Thread thread = this.f17836l;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC2886d(this));
            this.f17836l = thread2;
            thread2.start();
        }
        m16177u0();
        this.tvHeaderTitle.setOnClickListener(this);
        this.tvHeaderTitle.sendAccessibilityEvent(8);
        this.logo.setOnClickListener(new ViewOnClickListenerC2883a(this));
        this.iv_back_button.setOnClickListener(new ViewOnClickListenerC2884b(this));
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f17836l;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f17836l.interrupt();
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        m16176t0();
        super.onResume();
        Thread thread = this.f17836l;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC2886d(this));
            this.f17836l = thread2;
            thread2.start();
        }
        C5255e.m26233f(this.f17828d);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f17829e = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f17829e.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f17828d != null) {
            m16173b();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        m16176t0();
    }

    /* renamed from: r0 */
    public final void m16174r0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: s0 */
    public void m16175s0() {
        runOnUiThread(new RunnableC2885c(this));
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: t0 */
    public void m16176t0() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception e10) {
        }
    }

    /* renamed from: u0 */
    public final void m16177u0() {
        ViewPager viewPager;
        if (this.f17828d != null) {
            this.f17831g = new ArrayList<>();
            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
            liveStreamCategoryIdDBModel.m14792g(this.f17832h);
            liveStreamCategoryIdDBModel.m14793h(this.f17833i);
            this.f17831g.add(liveStreamCategoryIdDBModel);
            ArrayList<LiveStreamCategoryIdDBModel> arrayList = this.f17831g;
            if (arrayList == null || (viewPager = this.viewpager) == null || this.slidingTabs == null) {
                return;
            }
            viewPager.setAdapter(new C5861n(arrayList, getSupportFragmentManager(), this));
        }
    }

    /* renamed from: v0 */
    public final void m16178v0() {
        startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
    }
}

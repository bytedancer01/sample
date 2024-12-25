package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.app.DialogC0242a;
import androidx.recyclerview.widget.C0704c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cf.C1082f;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.RecordingAdapter;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Objects;
import nf.C6783a;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p030c0.C0936d;
import p050d0.C4290b;
import p151if.C5251a;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RecordingActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RecordingActivity.class */
public class RecordingActivity extends ActivityC0243b implements View.OnClickListener {

    /* renamed from: o */
    public static C6783a f18066o;

    @BindView
    public AppBarLayout appbarToolbar;

    @BindView
    public Button btBrowse;

    /* renamed from: d */
    public Context f18067d;

    @BindView
    public TextView date;

    /* renamed from: e */
    public SharedPreferences f18068e;

    /* renamed from: f */
    public RecordingAdapter f18069f;

    /* renamed from: h */
    public RecyclerView.AbstractC0685p f18071h;

    /* renamed from: i */
    public SharedPreferences.Editor f18072i;

    @BindView
    public ImageView iv_back_button;

    /* renamed from: j */
    public SharedPreferences f18073j;

    @BindView
    public ImageView logo;

    /* renamed from: m */
    public String f18076m;

    /* renamed from: n */
    public DialogC0242a f18077n;

    @BindView
    public ProgressBar pbLoader;

    @BindView
    public RecyclerView recyclerView;

    @BindView
    public LinearLayout rlRecordingDirChange;

    @BindView
    public TextView textViewRecordingDir;

    @BindView
    public TextView time;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public TextView tv_no_record_found_dontaskmeagain;

    /* renamed from: g */
    public ArrayList<File> f18070g = new ArrayList<>();

    /* renamed from: k */
    public Boolean f18074k = Boolean.FALSE;

    /* renamed from: l */
    public Thread f18075l = null;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RecordingActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.RecordingActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RecordingActivity$a.class */
    public class ViewOnClickListenerC2957a implements View.OnClickListener {

        /* renamed from: b */
        public final RecordingActivity f18078b;

        public ViewOnClickListenerC2957a(RecordingActivity recordingActivity) {
            this.f18078b = recordingActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f18078b.f18067d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RecordingActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.RecordingActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RecordingActivity$b.class */
    public class ViewOnClickListenerC2958b implements View.OnClickListener {

        /* renamed from: b */
        public final RecordingActivity f18079b;

        public ViewOnClickListenerC2958b(RecordingActivity recordingActivity) {
            this.f18079b = recordingActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f18079b.onBackPressed();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RecordingActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.RecordingActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RecordingActivity$c.class */
    public class ViewOnClickListenerC2959c implements View.OnClickListener {

        /* renamed from: b */
        public final RecordingActivity f18080b;

        public ViewOnClickListenerC2959c(RecordingActivity recordingActivity) {
            this.f18080b = recordingActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", this.f18080b.getPackageName(), null));
                this.f18080b.startActivityForResult(intent, 101);
                Toast.makeText(this.f18080b.f18067d, this.f18080b.f18067d.getResources().getString(2132017828), 1).show();
            } catch (Exception e10) {
            }
            this.f18080b.f18077n.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RecordingActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.RecordingActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RecordingActivity$d.class */
    public class ViewOnClickListenerC2960d implements View.OnClickListener {

        /* renamed from: b */
        public final RecordingActivity f18081b;

        public ViewOnClickListenerC2960d(RecordingActivity recordingActivity) {
            this.f18081b = recordingActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f18081b.f18077n.dismiss();
            this.f18081b.onBackPressed();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RecordingActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.RecordingActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RecordingActivity$e.class */
    public class C2961e implements C1082f.j {

        /* renamed from: a */
        public final String[] f18082a;

        /* renamed from: b */
        public final RecordingActivity f18083b;

        public C2961e(RecordingActivity recordingActivity, String[] strArr) {
            this.f18083b = recordingActivity;
            this.f18082a = strArr;
        }

        @Override // cf.C1082f.j
        /* renamed from: a */
        public void mo6437a(String str) {
            this.f18082a[0] = str;
            RecordingActivity recordingActivity = this.f18083b;
            recordingActivity.f18072i = recordingActivity.f18073j.edit();
            this.f18083b.f18072i.putString("recordingDir", str);
            this.f18083b.f18072i.apply();
            this.f18083b.textViewRecordingDir.setText(this.f18083b.f18067d.getResources().getString(2132018834) + str);
            this.f18083b.m16271A0();
            Toast.makeText(this.f18083b.f18067d, this.f18083b.f18067d.getResources().getString(2132017468) + str, 1).show();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RecordingActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.RecordingActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RecordingActivity$f.class */
    public class RunnableC2962f implements Runnable {

        /* renamed from: b */
        public final RecordingActivity f18084b;

        public RunnableC2962f(RecordingActivity recordingActivity) {
            this.f18084b = recordingActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String date = Calendar.getInstance().getTime().toString();
                String m26199B = C5255e.m26199B(this.f18084b.f18067d);
                String m26249p = C5255e.m26249p(date);
                TextView textView = this.f18084b.time;
                if (textView != null) {
                    textView.setText(m26199B);
                }
                TextView textView2 = this.f18084b.date;
                if (textView2 != null) {
                    textView2.setText(m26249p);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RecordingActivity$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.RecordingActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RecordingActivity$g.class */
    public class RunnableC2963g implements Runnable {

        /* renamed from: b */
        public final RecordingActivity f18085b;

        public RunnableC2963g(RecordingActivity recordingActivity) {
            this.f18085b = recordingActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f18085b.m16276w0();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                } catch (Exception e11) {
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RecordingActivity$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.RecordingActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RecordingActivity$h.class */
    public class ViewOnFocusChangeListenerC2964h implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f18086b;

        /* renamed from: c */
        public final RecordingActivity f18087c;

        public ViewOnFocusChangeListenerC2964h(RecordingActivity recordingActivity, View view) {
            this.f18087c = recordingActivity;
            this.f18086b = view;
        }

        /* renamed from: a */
        public final void m16279a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18086b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m16280b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18086b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m16281c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18086b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            int i10;
            View view2;
            View view3;
            int i11;
            try {
                if (z10) {
                    m16280b(1.0f);
                    m16281c(1.0f);
                    View view4 = this.f18086b;
                    i10 = 2131230828;
                    if (view4 == null || view4.getTag() == null || !this.f18086b.getTag().equals("3")) {
                        View view5 = this.f18086b;
                        if (view5 == null || view5.getTag() == null || !this.f18086b.getTag().equals("1")) {
                            View view6 = this.f18086b;
                            if (view6 == null || view6.getTag() == null || !this.f18086b.getTag().equals("2")) {
                                view3 = this.f18086b;
                                if (view3 == null) {
                                    return;
                                } else {
                                    i11 = 2131231882;
                                }
                            } else {
                                view3 = this.f18086b;
                                i11 = 2131231576;
                            }
                            view3.setBackgroundResource(i11);
                            return;
                        }
                        view = this.f18086b;
                    } else {
                        m16280b(1.0f);
                        m16281c(1.0f);
                    }
                } else {
                    if (z10) {
                        return;
                    }
                    m16280b(1.0f);
                    m16281c(1.0f);
                    m16279a(z10);
                    View view7 = this.f18086b;
                    i10 = 2131230845;
                    if (view7 == null || view7.getTag() == null || !this.f18086b.getTag().equals("3")) {
                        View view8 = this.f18086b;
                        if ((view8 == null || view8.getTag() == null || !this.f18086b.getTag().equals("1")) && ((view2 = this.f18086b) == null || view2.getTag() == null || !this.f18086b.getTag().equals("2"))) {
                            view3 = this.f18086b;
                            if (view3 != null) {
                                i11 = 2131100138;
                                view3.setBackgroundResource(i11);
                                return;
                            }
                            return;
                        }
                        view = this.f18086b;
                    } else {
                        m16280b(1.0f);
                        m16281c(1.0f);
                    }
                }
                view.setBackgroundResource(i10);
            } catch (Exception e10) {
            }
        }
    }

    /* renamed from: A0 */
    public void m16271A0() {
        if (this.f18067d != null) {
            this.tv_no_record_found_dontaskmeagain.setVisibility(8);
            this.tvNoRecordFound.setVisibility(8);
            this.rlRecordingDirChange.setVisibility(0);
            this.f18073j = this.f18067d.getSharedPreferences("recordingDir", 0);
            this.textViewRecordingDir.setText(getResources().getString(2132018835) + this.f18073j.getString("recordingDir", String.valueOf(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "MAXDIGITAL"))));
            File[] m26198A = C5255e.m26198A(this.f18067d);
            if (m26198A == null || m26198A.length <= 0) {
                this.f18070g.clear();
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f18067d);
                this.f18071h = linearLayoutManager;
                this.recyclerView.setLayoutManager(linearLayoutManager);
                this.f18069f = new RecordingAdapter(this, this.f18070g);
                this.recyclerView.setItemAnimator(new C0704c());
                this.recyclerView.setAdapter(this.f18069f);
                this.tvNoRecordFound.setVisibility(0);
                this.tvNoRecordFound.setText(getResources().getString(2132018220));
                return;
            }
            this.f18070g.clear();
            for (File file : m26198A) {
                if (file.toString().endsWith(".ts")) {
                    this.f18070g.addAll(Arrays.asList(file));
                }
            }
            if (this.f18070g.size() > 0) {
                this.rlRecordingDirChange.setVisibility(0);
                this.tvNoRecordFound.setVisibility(8);
                this.tv_no_record_found_dontaskmeagain.setFocusable(false);
            } else {
                this.tvNoRecordFound.setVisibility(0);
                this.tvNoRecordFound.setText(getResources().getString(2132018220));
                this.tvNoRecordFound.setClickable(false);
                this.rlRecordingDirChange.setVisibility(0);
            }
            this.f18071h = new LinearLayoutManager(this.f18067d);
            Collections.reverse(this.f18070g);
            this.recyclerView.setLayoutManager(this.f18071h);
            this.f18069f = new RecordingAdapter(this, this.f18070g);
            this.recyclerView.setItemAnimator(new C0704c());
            this.recyclerView.setAdapter(this.f18069f);
        }
    }

    /* renamed from: B0 */
    public void m16272B0() {
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 23 || i10 >= 33) {
                return;
            }
            if (checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0 && checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                return;
            }
            C0936d.m5641r(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 101);
        } catch (Exception e10) {
        }
    }

    /* renamed from: C0 */
    public void m16273C0(File file, RecordingActivity recordingActivity) {
        if (recordingActivity == null || this.f18069f == null || this.f18070g == null || this.tvNoRecordFound == null) {
            return;
        }
        new C5255e().m26261f0(recordingActivity, file, this.f18069f, this.f18070g, this.tvNoRecordFound);
    }

    @OnClick
    public void HandleDontAsk() {
        Toast.makeText(this, this.f18067d.getResources().getString(2132017828), 1).show();
        this.f18074k = Boolean.TRUE;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", getPackageName(), null));
            startActivityForResult(intent, 101);
        } catch (Exception e10) {
        }
    }

    @OnClick
    public void NoRecordingfound() {
        try {
            m16272B0();
            m16272B0();
        } catch (Exception e10) {
        }
    }

    /* renamed from: b */
    public void m16274b() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 101) {
            try {
                m16272B0();
            } catch (Exception e10) {
            }
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
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f18067d = this;
        m16278z0();
        super.onCreate(bundle);
        C6783a c6783a = new C6783a(this.f18067d);
        f18066o = c6783a;
        String m31288z = c6783a.m31288z();
        this.f18076m = m31288z;
        setContentView(m31288z.equals(C5251a.f30065s0) ? 2131624036 : 2131624035);
        ButterKnife.m5626a(this);
        m16275v0();
        m16277x0();
        overridePendingTransition(2130772003, 2130772000);
        AppBarLayout appBarLayout = this.appbarToolbar;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(2131230844));
        }
        getWindow().setFlags(1024, 1024);
        m16272B0();
        m16271A0();
        this.logo.setOnClickListener(new ViewOnClickListenerC2957a(this));
        this.iv_back_button.setOnClickListener(new ViewOnClickListenerC2958b(this));
        Thread thread = this.f18075l;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC2963g(this));
            this.f18075l = thread2;
            thread2.start();
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f18075l;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f18075l.interrupt();
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 != 101) {
            return;
        }
        try {
            if (iArr.length > 0 && iArr[0] == 0 && iArr[1] == 0) {
                m16272B0();
            } else if (Build.VERSION.SDK_INT < 23 || shouldShowRequestPermissionRationale(strArr[0])) {
                onBackPressed();
            } else {
                DialogC0242a.a aVar = new DialogC0242a.a(this, 2132082693);
                View inflate = LayoutInflater.from(this).inflate(2131624461, (ViewGroup) null);
                Button button = (Button) inflate.findViewById(2131427646);
                Button button2 = (Button) inflate.findViewById(2131427636);
                button.setOnFocusChangeListener(new C5255e.i((View) button, this));
                button2.setOnFocusChangeListener(new C5255e.i((View) button2, this));
                button.requestFocus();
                button.setOnClickListener(new ViewOnClickListenerC2959c(this));
                button2.setOnClickListener(new ViewOnClickListenerC2960d(this));
                aVar.setView(inflate);
                this.f18077n = aVar.create();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = this.f18077n.getWindow();
                Objects.requireNonNull(window);
                Window window2 = window;
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = -1;
                layoutParams.height = -2;
                this.f18077n.show();
                this.f18077n.getWindow().setAttributes(layoutParams);
                this.f18077n.setCancelable(false);
                this.f18077n.show();
            }
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        m16278z0();
        super.onResume();
        Thread thread = this.f18075l;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC2963g(this));
            this.f18075l = thread2;
            thread2.start();
        }
        C5255e.m26233f(this.f18067d);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f18068e = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f18068e.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f18067d != null) {
            m16274b();
        }
    }

    @OnClick
    public void onViewClicked() {
        C1082f c1082f = new C1082f(this.f18067d, new C2961e(this, new String[]{""}));
        if (Build.VERSION.SDK_INT >= 30) {
            c1082f.m6429E("");
        } else {
            c1082f.m6428D("");
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        m16278z0();
    }

    /* renamed from: v0 */
    public final void m16275v0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: w0 */
    public void m16276w0() {
        runOnUiThread(new RunnableC2962f(this));
    }

    /* renamed from: x0 */
    public final void m16277x0() {
        Button button = this.btBrowse;
        if (button != null) {
            button.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2964h(this, button));
            this.btBrowse.requestFocus();
            this.btBrowse.requestFocusFromTouch();
            this.btBrowse.setBackgroundResource(2131230828);
        }
        TextView textView = this.tv_no_record_found_dontaskmeagain;
        if (textView != null) {
            textView.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2964h(this, textView));
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: z0 */
    public void m16278z0() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception e10) {
        }
    }
}

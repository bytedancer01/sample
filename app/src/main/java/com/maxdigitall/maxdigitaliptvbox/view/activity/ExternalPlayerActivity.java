package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0243b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.maxdigitall.maxdigitaliptvbox.model.database.ExternalPlayerDataBase;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.ExternalPlayerAdapter;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import nf.C6783a;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5251a;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ExternalPlayerActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ExternalPlayerActivity.class */
public class ExternalPlayerActivity extends ActivityC0243b implements ExternalPlayerAdapter.InterfaceC3379b {

    /* renamed from: d */
    public List<ApplicationInfo> f17186d;

    @BindView
    public TextView date;

    /* renamed from: e */
    public List<ApplicationInfo> f17187e;

    /* renamed from: f */
    public PackageManager f17188f;

    /* renamed from: g */
    public Context f17189g;

    /* renamed from: i */
    public ExternalPlayerDataBase f17191i;

    /* renamed from: j */
    public C6783a f17192j;

    @BindView
    public LinearLayout ll_no_data_found;

    @BindView
    public LinearLayout ll_progressbar;

    @BindView
    public ImageView logo;

    @BindView
    public RecyclerView recyclerView;

    @BindView
    public TextView time;

    /* renamed from: h */
    public AlertDialog f17190h = null;

    /* renamed from: k */
    public Thread f17193k = null;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ExternalPlayerActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ExternalPlayerActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ExternalPlayerActivity$a.class */
    public class ViewOnClickListenerC2764a implements View.OnClickListener {

        /* renamed from: b */
        public final ExternalPlayerActivity f17194b;

        public ViewOnClickListenerC2764a(ExternalPlayerActivity externalPlayerActivity) {
            this.f17194b = externalPlayerActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f17194b.f17189g);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ExternalPlayerActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ExternalPlayerActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ExternalPlayerActivity$b.class */
    public class RunnableC2765b implements Runnable {

        /* renamed from: b */
        public final ExternalPlayerActivity f17195b;

        public RunnableC2765b(ExternalPlayerActivity externalPlayerActivity) {
            this.f17195b = externalPlayerActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String date = Calendar.getInstance().getTime().toString();
                String m26199B = C5255e.m26199B(this.f17195b.f17189g);
                String m26249p = C5255e.m26249p(date);
                TextView textView = this.f17195b.time;
                if (textView != null) {
                    textView.setText(m26199B);
                }
                TextView textView2 = this.f17195b.date;
                if (textView2 != null) {
                    textView2.setText(m26249p);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ExternalPlayerActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ExternalPlayerActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ExternalPlayerActivity$c.class */
    public class ViewOnClickListenerC2766c implements View.OnClickListener {

        /* renamed from: b */
        public final PopupWindow f17196b;

        /* renamed from: c */
        public final ExternalPlayerActivity f17197c;

        public ViewOnClickListenerC2766c(ExternalPlayerActivity externalPlayerActivity, PopupWindow popupWindow) {
            this.f17197c = externalPlayerActivity;
            this.f17196b = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PopupWindow popupWindow = this.f17196b;
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            this.f17196b.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ExternalPlayerActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ExternalPlayerActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ExternalPlayerActivity$d.class */
    public class ViewOnClickListenerC2767d implements View.OnClickListener {

        /* renamed from: b */
        public final String f17198b;

        /* renamed from: c */
        public final String f17199c;

        /* renamed from: d */
        public final PopupWindow f17200d;

        /* renamed from: e */
        public final ExternalPlayerActivity f17201e;

        public ViewOnClickListenerC2767d(ExternalPlayerActivity externalPlayerActivity, String str, String str2, PopupWindow popupWindow) {
            this.f17201e = externalPlayerActivity;
            this.f17198b = str;
            this.f17199c = str2;
            this.f17200d = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f17201e.f17191i = new ExternalPlayerDataBase(this.f17201e.f17189g);
            if (this.f17201e.f17191i.m15130f(this.f17198b)) {
                C5255e.m26241k0(this.f17201e.f17189g, "Already Added");
            } else {
                this.f17201e.f17191i.m15131l(this.f17198b, this.f17199c);
                C5255e.m26241k0(this.f17201e.f17189g, this.f17198b + " " + this.f17201e.getResources().getString(2132017286));
                this.f17201e.onBackPressed();
            }
            PopupWindow popupWindow = this.f17200d;
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            this.f17200d.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ExternalPlayerActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ExternalPlayerActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ExternalPlayerActivity$e.class */
    public class RunnableC2768e implements Runnable {

        /* renamed from: b */
        public final ExternalPlayerActivity f17202b;

        public RunnableC2768e(ExternalPlayerActivity externalPlayerActivity) {
            this.f17202b = externalPlayerActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f17202b.m15760w0();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                } catch (Exception e11) {
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ExternalPlayerActivity$f.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ExternalPlayerActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ExternalPlayerActivity$f.class */
    public class AsyncTaskC2769f extends AsyncTask<Boolean, Void, Boolean> {

        /* renamed from: a */
        public final ExternalPlayerActivity f17203a;

        public AsyncTaskC2769f(ExternalPlayerActivity externalPlayerActivity) {
            this.f17203a = externalPlayerActivity;
        }

        public /* synthetic */ AsyncTaskC2769f(ExternalPlayerActivity externalPlayerActivity, ViewOnClickListenerC2764a viewOnClickListenerC2764a) {
            this(externalPlayerActivity);
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Boolean... boolArr) {
            return this.f17203a.m15761x0();
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            List<ApplicationInfo> list;
            super.onPostExecute(bool);
            this.f17203a.ll_progressbar.setVisibility(8);
            if (!bool.booleanValue() || (list = this.f17203a.f17187e) == null || list.size() <= 0) {
                this.f17203a.m15762z0(Boolean.FALSE);
                return;
            }
            this.f17203a.m15762z0(Boolean.TRUE);
            ExternalPlayerActivity externalPlayerActivity = this.f17203a;
            externalPlayerActivity.recyclerView.setLayoutManager(new LinearLayoutManager(externalPlayerActivity.f17189g, 1, false));
            ExternalPlayerActivity externalPlayerActivity2 = this.f17203a;
            RecyclerView recyclerView = externalPlayerActivity2.recyclerView;
            Context context = externalPlayerActivity2.f17189g;
            ExternalPlayerActivity externalPlayerActivity3 = this.f17203a;
            recyclerView.setAdapter(new ExternalPlayerAdapter(context, externalPlayerActivity3.f17187e, externalPlayerActivity3));
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f17203a.ll_no_data_found.setVisibility(8);
            this.f17203a.recyclerView.setVisibility(8);
            this.f17203a.ll_progressbar.setVisibility(0);
        }
    }

    @SuppressLint({"RtlHardcoded"})
    /* renamed from: A0 */
    public final void m15756A0(String str, String str2) {
        try {
            View inflate = ((LayoutInflater) this.f17189g.getSystemService("layout_inflater")).inflate(2131624468, (RelativeLayout) findViewById(2131429028));
            PopupWindow popupWindow = new PopupWindow(this.f17189g);
            popupWindow.setContentView(inflate);
            popupWindow.setWidth(-1);
            popupWindow.setHeight(-1);
            popupWindow.setFocusable(true);
            popupWindow.showAtLocation(inflate, 17, 0, 0);
            Button button = (Button) inflate.findViewById(2131427653);
            Button button2 = (Button) inflate.findViewById(2131427681);
            ((TextView) inflate.findViewById(2131429415)).setText(getResources().getString(2132017334));
            button.setOnFocusChangeListener(new C5255e.i(button, this));
            button2.setOnFocusChangeListener(new C5255e.i(button2, this));
            button.setOnClickListener(new ViewOnClickListenerC2766c(this, popupWindow));
            button2.setOnClickListener(new ViewOnClickListenerC2767d(this, str, str2, popupWindow));
        } catch (NullPointerException | Exception e10) {
        }
    }

    /* renamed from: B0 */
    public void m15757B0() {
        new AsyncTaskC2769f(this, null).execute(new Boolean[0]);
    }

    @Override // com.maxdigitall.maxdigitaliptvbox.view.adapter.ExternalPlayerAdapter.InterfaceC3379b
    /* renamed from: O */
    public void mo15758O(View view, String str, String str2) {
        m15756A0(str, str2);
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f17189g = this;
        super.onCreate(bundle);
        C6783a c6783a = new C6783a(this.f17189g);
        this.f17192j = c6783a;
        setContentView(c6783a.m31288z().equals(C5251a.f30065s0) ? 2131623993 : 2131623992);
        ButterKnife.m5626a(this);
        getWindow().setFlags(1024, 1024);
        m15759v0();
        Thread thread = this.f17193k;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC2768e(this));
            this.f17193k = thread2;
            thread2.start();
        }
        m15757B0();
        this.logo.setOnClickListener(new ViewOnClickListenerC2764a(this));
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f17193k;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f17193k.interrupt();
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f17193k;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC2768e(this));
            this.f17193k = thread2;
            thread2.start();
        }
        overridePendingTransition(2130772003, 2130772000);
    }

    /* renamed from: v0 */
    public final void m15759v0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: w0 */
    public void m15760w0() {
        runOnUiThread(new RunnableC2765b(this));
    }

    /* renamed from: x0 */
    public final Boolean m15761x0() {
        this.f17186d = new ArrayList();
        this.f17187e = new ArrayList();
        PackageManager packageManager = this.f17189g.getPackageManager();
        this.f17188f = packageManager;
        this.f17186d = packageManager.getInstalledApplications(128);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(Uri.fromFile(new File("content://media/internal/video/media")), "video/*");
        Iterator<ResolveInfo> it = getPackageManager().queryIntentActivities(intent, 0).iterator();
        while (it.hasNext()) {
            try {
                this.f17187e.add(this.f17188f.getApplicationInfo(it.next().activityInfo.packageName, 128));
            } catch (PackageManager.NameNotFoundException e10) {
                e10.printStackTrace();
            }
        }
        return Boolean.TRUE;
    }

    /* renamed from: z0 */
    public final void m15762z0(Boolean bool) {
        if (bool.booleanValue()) {
            this.ll_no_data_found.setVisibility(8);
            this.recyclerView.setVisibility(0);
        } else {
            this.ll_no_data_found.setVisibility(0);
            this.recyclerView.setVisibility(8);
        }
    }
}

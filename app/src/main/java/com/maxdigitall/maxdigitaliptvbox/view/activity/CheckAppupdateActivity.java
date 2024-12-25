package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import androidx.core.widget.NestedScrollView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import java.io.IOException;
import java.util.Calendar;
import nf.C6783a;
import org.apache.commons.net.tftp.TFTP;
import org.jsoup.Jsoup;
import p151if.C5251a;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/CheckAppupdateActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/CheckAppupdateActivity.class */
public class CheckAppupdateActivity extends ActivityC0243b {

    @BindView
    public Button btn_later;

    @BindView
    public Button btn_update;

    @BindView
    public TextView date;

    /* renamed from: f */
    public Context f17001f;

    /* renamed from: g */
    public C6783a f17002g;

    @BindView
    public LinearLayout ll_marginLayout;

    @BindView
    public ImageView logo;

    @BindView
    public TextView message;

    @BindView
    public NestedScrollView nested_checkupdate;

    @BindView
    public ProgressBar pbLoader;

    @BindView
    public TextView time;

    @BindView
    public TextView title;

    /* renamed from: d */
    public String f16999d = "";

    /* renamed from: e */
    public boolean f17000e = false;

    /* renamed from: h */
    public Thread f17003h = null;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/CheckAppupdateActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.CheckAppupdateActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/CheckAppupdateActivity$a.class */
    public class ViewOnClickListenerC2719a implements View.OnClickListener {

        /* renamed from: b */
        public final CheckAppupdateActivity f17004b;

        public ViewOnClickListenerC2719a(CheckAppupdateActivity checkAppupdateActivity) {
            this.f17004b = checkAppupdateActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f17004b.f17001f);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/CheckAppupdateActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.CheckAppupdateActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/CheckAppupdateActivity$b.class */
    public class RunnableC2720b implements Runnable {

        /* renamed from: b */
        public final CheckAppupdateActivity f17005b;

        public RunnableC2720b(CheckAppupdateActivity checkAppupdateActivity) {
            this.f17005b = checkAppupdateActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String date = Calendar.getInstance().getTime().toString();
                String m26199B = C5255e.m26199B(this.f17005b.f17001f);
                String m26249p = C5255e.m26249p(date);
                TextView textView = this.f17005b.time;
                if (textView != null) {
                    textView.setText(m26199B);
                }
                TextView textView2 = this.f17005b.date;
                if (textView2 != null) {
                    textView2.setText(m26249p);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/CheckAppupdateActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.CheckAppupdateActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/CheckAppupdateActivity$c.class */
    public class AsyncTaskC2721c extends AsyncTask<Void, String, String> {

        /* renamed from: a */
        public Context f17006a;

        /* renamed from: b */
        public String f17007b;

        /* renamed from: c */
        public final CheckAppupdateActivity f17008c;

        public AsyncTaskC2721c(CheckAppupdateActivity checkAppupdateActivity, Context context, String str) {
            this.f17008c = checkAppupdateActivity;
            this.f17006a = context;
            this.f17007b = str;
        }

        /* renamed from: a */
        public String m15676a(String str) {
            return str.replaceAll("[\\-\\+\\.\\^:,]", "");
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String doInBackground(Void... voidArr) {
            String str;
            try {
                str = Jsoup.connect("https://play.google.com/store/apps/details?id=com.maxdigitall.maxdigitaliptvbox&hl=en").timeout(TFTP.DEFAULT_TIMEOUT).userAgent("Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6").referrer("http://www.google.com").get().select(" div.hAyfc:nth-child(4) > span:nth-child(2) >div:nth-child(1) > span:nth-child(1)").first().ownText();
            } catch (IOException e10) {
                e10.printStackTrace();
                str = null;
            }
            return str;
        }

        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            String str2;
            String str3;
            int i10;
            int i11;
            super.onPostExecute(str);
            this.f17008c.m15673b();
            if (str != null && !str.isEmpty()) {
                SharepreferenceDBHandler.m15353Q(true, this.f17006a);
                if (str.matches("\\d\\.\\d") || str.matches("\\d\\.\\d\\.\\d") || str.matches("\\d\\.\\d\\.\\d\\.\\d")) {
                    String m15676a = m15676a(str);
                    String m15676a2 = m15676a(this.f17007b);
                    if (m15676a.length() > m15676a2.length()) {
                        int length = m15676a.length();
                        int length2 = m15676a2.length();
                        StringBuffer stringBuffer = new StringBuffer(m15676a2);
                        for (int i12 = 0; i12 < length - length2; i12++) {
                            stringBuffer.append(0);
                        }
                        str2 = stringBuffer.toString();
                        str3 = m15676a;
                    } else {
                        str2 = m15676a2;
                        str3 = m15676a;
                        if (m15676a.length() < m15676a2.length()) {
                            int length3 = m15676a2.length();
                            int length4 = m15676a.length();
                            StringBuffer stringBuffer2 = new StringBuffer(m15676a);
                            for (int i13 = 0; i13 < length3 - length4; i13++) {
                                stringBuffer2.append(0);
                            }
                            str3 = stringBuffer2.toString();
                            str2 = m15676a2;
                        }
                    }
                    try {
                        i10 = Integer.parseInt(str3);
                        i11 = Integer.parseInt(str2);
                    } catch (NumberFormatException e10) {
                        i10 = 1;
                        i11 = 1;
                    }
                    if (i10 > i11) {
                        this.f17008c.m15675r0(true);
                        return;
                    }
                }
            }
            this.f17008c.m15675r0(false);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f17008c.m15672a();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/CheckAppupdateActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.CheckAppupdateActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/CheckAppupdateActivity$d.class */
    public class RunnableC2722d implements Runnable {

        /* renamed from: b */
        public final CheckAppupdateActivity f17009b;

        public RunnableC2722d(CheckAppupdateActivity checkAppupdateActivity) {
            this.f17009b = checkAppupdateActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f17009b.m15674q0();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                } catch (Exception e11) {
                }
            }
        }
    }

    /* renamed from: a */
    public void m15672a() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        this.nested_checkupdate.setVisibility(8);
    }

    /* renamed from: b */
    public void m15673b() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        this.nested_checkupdate.setVisibility(0);
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 101) {
            try {
                this.f16999d = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException e10) {
                e10.printStackTrace();
            }
            new AsyncTaskC2721c(this, this, this.f16999d).execute(new Void[0]);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(2130772003, 2130772000);
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f17001f = this;
        super.onCreate(bundle);
        C6783a c6783a = new C6783a(this.f17001f);
        this.f17002g = c6783a;
        setContentView(c6783a.m31288z().equals(C5251a.f30065s0) ? 2131623981 : 2131623980);
        ButterKnife.m5626a(this);
        Thread thread = this.f17003h;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC2722d(this));
            this.f17003h = thread2;
            thread2.start();
        }
        try {
            this.f16999d = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
        }
        Button button = this.btn_update;
        button.setOnFocusChangeListener(new C5255e.i((View) button, this));
        this.btn_update.requestFocus();
        this.btn_update.requestFocusFromTouch();
        Button button2 = this.btn_later;
        button2.setOnFocusChangeListener(new C5255e.i((View) button2, this));
        new AsyncTaskC2721c(this, this, this.f16999d).execute(new Void[0]);
        this.logo.setOnClickListener(new ViewOnClickListenerC2719a(this));
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f17003h;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f17003h.interrupt();
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f17003h;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC2722d(this));
            this.f17003h = thread2;
            thread2.start();
        }
        overridePendingTransition(2130772003, 2130772000);
    }

    @OnClick
    public void onclickView(View view) {
        int id2 = view.getId();
        if (id2 == 2131427649) {
            onBackPressed();
            return;
        }
        if (id2 != 2131427680) {
            return;
        }
        try {
            startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + getApplicationContext().getPackageName())), 101);
        } catch (Exception e10) {
            Toast.makeText(this.f17001f, getResources().getString(2132017572), 0).show();
        }
    }

    /* renamed from: q0 */
    public void m15674q0() {
        runOnUiThread(new RunnableC2720b(this));
    }

    /* renamed from: r0 */
    public void m15675r0(boolean z10) {
        if (z10) {
            this.nested_checkupdate.setVisibility(0);
            return;
        }
        this.message.setText(getResources().getString(2132018743) + this.f16999d + " " + getResources().getString(2132018744));
        this.title.setText(getResources().getString(2132018233));
        this.btn_update.setVisibility(8);
        this.btn_later.setText(getResources().getString(2132017353));
        this.ll_marginLayout.setVisibility(8);
        this.btn_later.requestFocus();
        this.btn_later.requestFocusFromTouch();
    }
}

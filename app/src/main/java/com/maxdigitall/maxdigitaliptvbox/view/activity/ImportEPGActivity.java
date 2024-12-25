package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0243b;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.XMLTVProgrammePojo;
import com.maxdigitall.maxdigitaliptvbox.view.utility.LoadingGearSpinner;
import java.util.ArrayList;
import nf.C6783a;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5255e;
import p355uf.C9175c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ImportEPGActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ImportEPGActivity.class */
public class ImportEPGActivity extends ActivityC0243b {

    /* renamed from: d */
    public Context f17385d;

    /* renamed from: e */
    public LiveStreamDBHandler f17386e;

    /* renamed from: f */
    public SharedPreferences f17387f;

    /* renamed from: g */
    public ArrayList<XMLTVProgrammePojo> f17388g;

    /* renamed from: h */
    public C6783a f17389h;

    @BindView
    public LoadingGearSpinner ivGearLoader;

    @BindView
    public ProgressBar progressBar;

    @BindView
    public RelativeLayout rlImportLayout;

    @BindView
    public RelativeLayout rlImportProcess;

    @BindView
    public TextView tvCountings;

    @BindView
    public TextView tvImportingEpg;

    @BindView
    public TextView tvPercentage;

    @BindView
    public TextView tvSettingStreams;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ImportEPGActivity$a.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ImportEPGActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ImportEPGActivity$a.class */
    public class AsyncTaskC2795a extends AsyncTask<Void, Boolean, Boolean> {

        /* renamed from: a */
        public C9175c f17390a;

        /* renamed from: b */
        public final ImportEPGActivity f17391b;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ImportEPGActivity$a$a.class
         */
        @SuppressLint({"StaticFieldLeak"})
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ImportEPGActivity$a$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ImportEPGActivity$a$a.class */
        public class a extends AsyncTask<String, Integer, Boolean> {

            /* renamed from: a */
            public volatile boolean f17392a = true;

            /* renamed from: b */
            public Context f17393b;

            /* renamed from: c */
            public final int f17394c;

            /* renamed from: d */
            public final AsyncTaskC2795a f17395d;

            public a(AsyncTaskC2795a asyncTaskC2795a, Context context) {
                this.f17395d = asyncTaskC2795a;
                this.f17393b = null;
                this.f17394c = asyncTaskC2795a.f17391b.f17388g.size();
                this.f17393b = context;
            }

            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean doInBackground(String... strArr) {
                publishProgress(0);
                ImportEPGActivity importEPGActivity = this.f17395d.f17391b;
                LiveStreamDBHandler liveStreamDBHandler = importEPGActivity.f17386e;
                if (liveStreamDBHandler != null) {
                    liveStreamDBHandler.m15256v(importEPGActivity.f17388g);
                }
                return Boolean.TRUE;
            }

            @Override // android.os.AsyncTask
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Boolean bool) {
                int size = this.f17395d.f17391b.f17388g.size();
                ImportEPGActivity importEPGActivity = this.f17395d.f17391b;
                importEPGActivity.f17387f = importEPGActivity.getSharedPreferences("loginPrefs", 0);
                this.f17395d.f17391b.f17387f.getString("skip", "");
                C5255e.m26241k0(this.f17395d.f17391b.f17385d, this.f17395d.f17391b.getResources().getString(2132017668) + " (" + size + ")");
                this.f17395d.f17391b.f17386e.m15158D2("epg", "1");
                if (this.f17395d.f17391b.f17385d != null) {
                    this.f17395d.f17391b.startActivity(new Intent(this.f17395d.f17391b.f17385d, (Class<?>) NewDashboardActivity.class));
                    this.f17395d.f17391b.finish();
                }
            }

            @Override // android.os.AsyncTask
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onProgressUpdate(Integer... numArr) {
            }

            @Override // android.os.AsyncTask
            public void onCancelled() {
                this.f17392a = false;
            }

            @Override // android.os.AsyncTask
            public void onPreExecute() {
            }
        }

        public AsyncTaskC2795a(ImportEPGActivity importEPGActivity) {
            this.f17391b = importEPGActivity;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            C9175c c9175c = new C9175c();
            this.f17390a = c9175c;
            c9175c.m38610a(this.f17391b.f17385d);
            this.f17391b.f17388g = this.f17390a.m38611b();
            return (this.f17391b.f17388g == null || this.f17391b.f17388g.size() <= 0) ? Boolean.FALSE : Boolean.TRUE;
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            Intent intent;
            if (bool.booleanValue()) {
                try {
                    ImportEPGActivity importEPGActivity = this.f17391b;
                    TextView textView = importEPGActivity.tvImportingEpg;
                    if (textView != null) {
                        textView.setText(importEPGActivity.getResources().getString(2132017845));
                    }
                    new a(this, this.f17391b.f17385d).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
                    return;
                } catch (Exception e10) {
                    this.f17391b.f17386e.m15158D2("epg", "1");
                    if (this.f17391b.f17385d == null) {
                        return;
                    } else {
                        intent = new Intent(this.f17391b.f17385d, (Class<?>) NewDashboardActivity.class);
                    }
                }
            } else {
                ImportEPGActivity importEPGActivity2 = this.f17391b;
                C5255e.m26241k0(importEPGActivity2.f17385d, importEPGActivity2.getResources().getString(2132018197));
                this.f17391b.f17386e.m15158D2("epg", "0");
                if (this.f17391b.f17385d == null) {
                    return;
                } else {
                    intent = new Intent(this.f17391b.f17385d, (Class<?>) NewDashboardActivity.class);
                }
            }
            this.f17391b.startActivity(intent);
            this.f17391b.finish();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
        overridePendingTransition(2130772003, 2130772000);
        finish();
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624001);
        ButterKnife.m5626a(this);
        m15869u0();
        this.f17385d = this;
        this.f17386e = new LiveStreamDBHandler(this.f17385d);
        C6783a c6783a = new C6783a(this.f17385d);
        this.f17389h = c6783a;
        if (c6783a.m31265c()) {
            C5255e.m26237i(this.f17385d);
        }
        m15870v0();
        getWindow().setFlags(1024, 1024);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        C5255e.m26233f(this.f17385d);
        getWindow().setFlags(1024, 1024);
    }

    /* renamed from: u0 */
    public final void m15869u0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: v0 */
    public final void m15870v0() {
        if (this.f17385d != null) {
            this.f17387f = getSharedPreferences("loginPrefs", 0);
            new AsyncTaskC2795a(this).execute(new Void[0]);
        }
    }
}

package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0243b;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferTable;
import com.maxdigitall.maxdigitaliptvbox.model.MultiUserDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.ImportStatusModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.MultiUserDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.utility.LoadingGearSpinner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.util.ArrayList;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p030c0.C0936d;
import p050d0.C4290b;
import p151if.C5255e;
import tf.C8724a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ImportM3uActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ImportM3uActivity.class */
public class ImportM3uActivity extends ActivityC0243b {

    /* renamed from: d */
    public Context f17397d;

    /* renamed from: e */
    public LiveStreamDBHandler f17398e;

    /* renamed from: f */
    public SharedPreferences f17399f;

    /* renamed from: g */
    public InputStream f17400g;

    /* renamed from: h */
    public final C8724a f17401h = new C8724a();

    /* renamed from: i */
    public MultiUserDBHandler f17402i;

    @BindView
    public LoadingGearSpinner ivGearLoader;

    @BindView
    public ProgressBar progressBar;

    @BindView
    public RelativeLayout rlImportLayout;

    @BindView
    public LinearLayout rlImportProcess;

    @BindView
    public TextView tvCountings;

    @BindView
    public TextView tvImportingStreams;

    @BindView
    public TextView tvPercentage;

    @BindView
    public TextView tvSettingStreams;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ImportM3uActivity$b.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ImportM3uActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ImportM3uActivity$b.class */
    public class AsyncTaskC2797b extends AsyncTask<String, String, Boolean> {

        /* renamed from: a */
        public final ImportM3uActivity f17403a;

        public AsyncTaskC2797b(ImportM3uActivity importM3uActivity) {
            this.f17403a = importM3uActivity;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                URL url = new URL(strArr[0]);
                this.f17403a.m15880u0();
                File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "MAXDIGITAL");
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(this.f17403a.f17397d.getFilesDir() + "/data_temp.txt");
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(this.f17403a.f17397d.getFilesDir() + "/data_temp.txt").toString())));
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        bufferedWriter.write(sb2.toString());
                        bufferedWriter.flush();
                        bufferedWriter.close();
                        return Boolean.TRUE;
                    }
                    sb2.append(readLine);
                    sb2.append('\n');
                }
            } catch (Exception e11) {
                Log.d("Google", "DownloadFileFromUrl " + e11.getMessage());
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            try {
                if (!bool.booleanValue()) {
                    C5255e.m26241k0(this.f17403a.f17397d, "Incorrect File/URL");
                    this.f17403a.onBackPressed();
                    return;
                }
                ImportM3uActivity importM3uActivity = this.f17403a;
                TextView textView = importM3uActivity.tvImportingStreams;
                if (textView != null) {
                    textView.setText(importM3uActivity.getResources().getString(2132017844));
                }
                new AsyncTaskC2798c(this.f17403a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f17403a.f17397d.getFilesDir() + "/data_temp.txt");
            } catch (Exception e10) {
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(String... strArr) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ImportM3uActivity$c.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ImportM3uActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ImportM3uActivity$c.class */
    public class AsyncTaskC2798c extends AsyncTask<String, Void, Boolean> {

        /* renamed from: a */
        public final ImportM3uActivity f17404a;

        public AsyncTaskC2798c(ImportM3uActivity importM3uActivity) {
            this.f17404a = importM3uActivity;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                this.f17404a.f17400g = new FileInputStream(new File(strArr[0]));
                ImportM3uActivity importM3uActivity = this.f17404a;
                if (importM3uActivity.f17401h.m37278d(importM3uActivity.f17400g, importM3uActivity.f17397d)) {
                    this.f17404a.f17398e.m15180N0();
                    this.f17404a.f17398e.m15186Q0();
                }
                return Boolean.TRUE;
            } catch (Exception e10) {
                return Boolean.FALSE;
            } catch (OutOfMemoryError e11) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            Intent intent;
            super.onPostExecute(bool);
            try {
                File file = new File(this.f17404a.f17397d.getFilesDir() + "/data_temp.txt");
                if (file.exists()) {
                    file.delete();
                }
            } catch (Exception e10) {
            }
            if (bool.booleanValue()) {
                LiveStreamDBHandler liveStreamDBHandler = this.f17404a.f17398e;
                if (liveStreamDBHandler != null) {
                    liveStreamDBHandler.m15158D2("all", "1");
                }
                SharedPreferences sharedPreferences = this.f17404a.getSharedPreferences("loginPrefs", 0);
                sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
                sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
                String string = sharedPreferences.getString("serverUrl", "");
                sharedPreferences.getString("serverM3UUrl", "");
                sharedPreferences.getString("anyName", "M3ULine");
                if (!string.startsWith("http://")) {
                    string.startsWith("https://");
                }
                SharepreferenceDBHandler.m15351O("m3u", this.f17404a.f17397d);
                this.f17404a.f17402i = new MultiUserDBHandler(this.f17404a.f17397d);
                if (this.f17404a.f17397d == null) {
                    return;
                } else {
                    intent = new Intent(this.f17404a.f17397d, (Class<?>) NewDashboardActivity.class);
                }
            } else {
                LiveStreamDBHandler liveStreamDBHandler2 = this.f17404a.f17398e;
                if (liveStreamDBHandler2 != null) {
                    liveStreamDBHandler2.m15158D2("all", "2");
                }
                if (this.f17404a.f17397d == null) {
                    return;
                } else {
                    intent = new Intent(this.f17404a.f17397d, (Class<?>) NewDashboardActivity.class);
                }
            }
            this.f17404a.startActivity(intent);
            this.f17404a.finish();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            LiveStreamDBHandler liveStreamDBHandler = this.f17404a.f17398e;
            if (liveStreamDBHandler != null) {
                liveStreamDBHandler.m15158D2("all", "3");
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624002);
        ButterKnife.m5626a(this);
        m15877r0();
        getWindow().setFlags(1024, 1024);
        this.f17397d = this;
        this.f17398e = new LiveStreamDBHandler(this.f17397d);
        this.f17402i = new MultiUserDBHandler(this.f17397d);
        if (this.f17398e.m15177L1("m3u") == 0) {
            ArrayList<ImportStatusModel> arrayList = new ArrayList<>();
            ImportStatusModel importStatusModel = new ImportStatusModel();
            importStatusModel.m15145l("all");
            importStatusModel.m15143j("0");
            importStatusModel.m15140g("");
            arrayList.add(0, importStatusModel);
            this.f17398e.m15228k2(arrayList, "m3u");
        }
        m15878s0();
        m15879t0();
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        C5255e.m26233f(this.f17397d);
        getWindow().setFlags(1024, 1024);
    }

    /* renamed from: r0 */
    public final void m15877r0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: s0 */
    public void m15878s0() {
        LiveStreamDBHandler liveStreamDBHandler = this.f17398e;
        if (liveStreamDBHandler != null) {
            liveStreamDBHandler.m15235n2();
        }
    }

    /* renamed from: t0 */
    public final void m15879t0() {
        Intent intent;
        if (this.f17397d != null) {
            this.f17399f = getSharedPreferences("loginPrefs", 0);
            ArrayList<MultiUserDBModel> m15274o0 = this.f17402i.m15274o0(SharepreferenceDBHandler.m15337A(this.f17397d));
            if (m15274o0 == null || m15274o0.size() <= 0) {
                Context context = this.f17397d;
                C5255e.m26241k0(context, context.getResources().getString(2132018763));
                intent = new Intent(this.f17397d, (Class<?>) NewDashboardActivity.class);
            } else {
                String m14873c = m15274o0.get(0).m14873c();
                File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "MAXDIGITAL");
                if (!file.exists()) {
                    file.mkdirs();
                }
                if (m15274o0.get(0).m14872b().equals(TransferTable.COLUMN_FILE)) {
                    if (!m14873c.equals("")) {
                        TextView textView = this.tvImportingStreams;
                        if (textView != null) {
                            textView.setText(getResources().getString(2132017844));
                        }
                        new AsyncTaskC2798c(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, m14873c);
                        return;
                    }
                    Context context2 = this.f17397d;
                    C5255e.m26241k0(context2, context2.getResources().getString(2132017995));
                    intent = new Intent(this.f17397d, (Class<?>) NewDashboardActivity.class);
                } else if (!m14873c.equals("")) {
                    new AsyncTaskC2797b().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, m14873c);
                    return;
                } else {
                    Context context3 = this.f17397d;
                    C5255e.m26241k0(context3, context3.getResources().getString(2132017996));
                    intent = new Intent(this.f17397d, (Class<?>) NewDashboardActivity.class);
                }
            }
            startActivity(intent);
            finish();
        }
    }

    /* renamed from: u0 */
    public void m15880u0() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            if (i10 >= 33) {
                return;
            }
            if (C4290b.m21722a(this, "android.permission.READ_EXTERNAL_STORAGEandroid.permission.READ_EXTERNAL_STORAGE") != 0) {
                Log.v("TAG", "Permission is revoked");
                C0936d.m5641r(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 101);
                return;
            }
        }
        Log.v("TAG", "Permission is granted");
    }
}

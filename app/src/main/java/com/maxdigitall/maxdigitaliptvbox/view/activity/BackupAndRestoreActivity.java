package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.options.StorageDownloadFileOptions;
import com.amplifyframework.storage.result.StorageDownloadFileResult;
import com.amplifyframework.storage.result.StorageRemoveResult;
import com.amplifyframework.storage.result.StorageTransferProgress;
import com.google.android.material.appbar.AppBarLayout;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.RecentWatchDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SeriesRecentWatchDatabase;
import com.maxdigitall.maxdigitaliptvbox.view.activity.BackupAndRestoreActivity;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import nf.C6783a;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.slf4j.Marker;
import p050d0.C4290b;
import p151if.C5251a;
import p151if.C5255e;
import p189kf.C5594e;
import p189kf.C5595f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity.class */
public class BackupAndRestoreActivity extends ActivityC0243b implements View.OnClickListener {

    @BindView
    public AppBarLayout appbarToolbar;

    @BindView
    public Button btSaveChanges;

    @BindView
    public Button btnBackPlayerselection;

    /* renamed from: d */
    public Context f16945d;

    @BindView
    public TextView date;

    /* renamed from: e */
    public C6783a f16946e;

    /* renamed from: g */
    public PopupWindow f16948g;

    /* renamed from: h */
    public Button f16949h;

    /* renamed from: i */
    public Button f16950i;

    /* renamed from: j */
    public RecentWatchDBHandler f16951j;

    /* renamed from: k */
    public SeriesRecentWatchDatabase f16952k;

    /* renamed from: l */
    public LiveStreamDBHandler f16953l;

    @BindView
    public ImageView logo;

    /* renamed from: m */
    public DatabaseHandler f16954m;

    /* renamed from: n */
    public SharedPreferences f16955n;

    /* renamed from: t */
    public Handler f16961t;

    @BindView
    public TextView time;

    @BindView
    public Toolbar toolbar;

    /* renamed from: f */
    public Thread f16947f = null;

    /* renamed from: o */
    public String f16956o = "";

    /* renamed from: p */
    public String f16957p = "";

    /* renamed from: q */
    public String f16958q = "";

    /* renamed from: r */
    public String f16959r = "";

    /* renamed from: s */
    public String f16960s = "";

    /* renamed from: u */
    public boolean f16962u = false;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.BackupAndRestoreActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity$a.class */
    public class HandlerC2705a extends Handler {

        /* renamed from: a */
        public final BackupAndRestoreActivity f16963a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandlerC2705a(BackupAndRestoreActivity backupAndRestoreActivity, Looper looper) {
            super(looper);
            this.f16963a = backupAndRestoreActivity;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                BackupAndRestoreActivity backupAndRestoreActivity = this.f16963a;
                new DialogC2713i(backupAndRestoreActivity, (Activity) backupAndRestoreActivity.f16945d).show();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.BackupAndRestoreActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity$b.class */
    public class ViewOnClickListenerC2706b implements View.OnClickListener {

        /* renamed from: b */
        public final BackupAndRestoreActivity f16964b;

        public ViewOnClickListenerC2706b(BackupAndRestoreActivity backupAndRestoreActivity) {
            this.f16964b = backupAndRestoreActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f16964b.f16945d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.BackupAndRestoreActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity$c.class */
    public class RunnableC2707c implements Runnable {

        /* renamed from: b */
        public final BackupAndRestoreActivity f16965b;

        public RunnableC2707c(BackupAndRestoreActivity backupAndRestoreActivity) {
            this.f16965b = backupAndRestoreActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String date = Calendar.getInstance().getTime().toString();
                String m26199B = C5255e.m26199B(this.f16965b.f16945d);
                String m26249p = C5255e.m26249p(date);
                TextView textView = this.f16965b.time;
                if (textView != null) {
                    textView.setText(m26199B);
                }
                TextView textView2 = this.f16965b.date;
                if (textView2 != null) {
                    textView2.setText(m26249p);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.BackupAndRestoreActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity$d.class */
    public class ViewOnClickListenerC2708d implements View.OnClickListener {

        /* renamed from: b */
        public final BackupAndRestoreActivity f16966b;

        public ViewOnClickListenerC2708d(BackupAndRestoreActivity backupAndRestoreActivity) {
            this.f16966b = backupAndRestoreActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f16966b.f16948g.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.BackupAndRestoreActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity$e.class */
    public class ViewOnClickListenerC2709e implements View.OnClickListener {

        /* renamed from: b */
        public final String f16967b;

        /* renamed from: c */
        public final BackupAndRestoreActivity f16968c;

        /* renamed from: d */
        public final String[] f16969d;

        /* renamed from: e */
        public final EditText f16970e;

        /* renamed from: f */
        public final BackupAndRestoreActivity f16971f;

        public ViewOnClickListenerC2709e(BackupAndRestoreActivity backupAndRestoreActivity, String str, BackupAndRestoreActivity backupAndRestoreActivity2, String[] strArr, EditText editText) {
            this.f16971f = backupAndRestoreActivity;
            this.f16967b = str;
            this.f16968c = backupAndRestoreActivity2;
            this.f16969d = strArr;
            this.f16970e = editText;
        }

        /* renamed from: g */
        public static /* synthetic */ void m15659g(StorageTransferProgress storageTransferProgress) {
            Log.i("MyAmplifyApp", "Fraction completed: " + storageTransferProgress.getFractionCompleted());
        }

        /* renamed from: d */
        public final void m15660d(StorageDownloadFileResult storageDownloadFileResult) {
            new AsyncTaskC2716l(this.f16971f).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, storageDownloadFileResult.getFile().getParent());
        }

        /* renamed from: e */
        public final void m15661e(StorageException storageException) {
            this.f16971f.f16959r = "405";
            C5255e.m26205H();
            try {
                this.f16971f.f16961t.obtainMessage(1, this.f16971f.f16959r).sendToTarget();
            } catch (Exception e10) {
            }
        }

        /* renamed from: f */
        public final boolean m15662f() {
            this.f16969d[0] = String.valueOf(this.f16970e.getText());
            String[] strArr = this.f16969d;
            if (strArr != null && strArr[0].equals("")) {
                Toast.makeText(this.f16968c, this.f16971f.getResources().getString(2132017658), 1).show();
                return false;
            }
            this.f16971f.f16960s = this.f16969d[0];
            return true;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (m15662f()) {
                this.f16971f.f16948g.dismiss();
                if (this.f16967b.equals("backup")) {
                    new AsyncTaskC2715k(this.f16971f).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
                    return;
                }
                if (this.f16967b.equals("download")) {
                    Log.e("honey", "download backup started");
                    C5255e.m26236h0(this.f16968c);
                    String string = this.f16971f.f16955n.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
                    String string2 = this.f16971f.f16955n.getString("serverUrl", "");
                    String m26212O = C5255e.m26212O(string + "-" + string2);
                    String m26212O2 = C5255e.m26212O(string + "-" + string2 + "-" + this.f16971f.f16960s + Marker.ANY_MARKER + "NB!@#12ZKWd");
                    try {
                        Amplify.Storage.downloadFile(m26212O + "/" + m26212O2 + ".zip", new File(this.f16971f.getApplicationContext().getFilesDir().getParent() + "/download.zip"), StorageDownloadFileOptions.defaultInstance(), new Consumer() { // from class: kf.g
                            @Override // com.amplifyframework.core.Consumer
                            public final void accept(Object obj) {
                                BackupAndRestoreActivity.ViewOnClickListenerC2709e.m15659g((StorageTransferProgress) obj);
                            }
                        }, new Consumer(this) { // from class: kf.h

                            /* renamed from: a */
                            public final BackupAndRestoreActivity.ViewOnClickListenerC2709e f31682a;

                            {
                                this.f31682a = this;
                            }

                            @Override // com.amplifyframework.core.Consumer
                            public final void accept(Object obj) {
                                this.f31682a.m15660d((StorageDownloadFileResult) obj);
                            }
                        }, new Consumer(this) { // from class: kf.i

                            /* renamed from: a */
                            public final BackupAndRestoreActivity.ViewOnClickListenerC2709e f31683a;

                            {
                                this.f31683a = this;
                            }

                            @Override // com.amplifyframework.core.Consumer
                            public final void accept(Object obj) {
                                this.f31683a.m15661e((StorageException) obj);
                            }
                        });
                    } catch (Exception e10) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.BackupAndRestoreActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity$f.class */
    public class ViewOnClickListenerC2710f implements View.OnClickListener {

        /* renamed from: b */
        public final BackupAndRestoreActivity f16972b;

        public ViewOnClickListenerC2710f(BackupAndRestoreActivity backupAndRestoreActivity) {
            this.f16972b = backupAndRestoreActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f16972b.f16948g.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.BackupAndRestoreActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity$g.class */
    public class ViewOnClickListenerC2711g implements View.OnClickListener {

        /* renamed from: b */
        public final String[] f16973b;

        /* renamed from: c */
        public final EditText f16974c;

        /* renamed from: d */
        public final Activity f16975d;

        /* renamed from: e */
        public final BackupAndRestoreActivity f16976e;

        public ViewOnClickListenerC2711g(BackupAndRestoreActivity backupAndRestoreActivity, String[] strArr, EditText editText, Activity activity) {
            this.f16976e = backupAndRestoreActivity;
            this.f16973b = strArr;
            this.f16974c = editText;
            this.f16975d = activity;
        }

        /* renamed from: a */
        public final boolean m15663a() {
            this.f16973b[0] = String.valueOf(this.f16974c.getText());
            String[] strArr = this.f16973b;
            if (strArr != null && strArr[0].equals("")) {
                Toast.makeText(this.f16975d, this.f16976e.getResources().getString(2132017658), 1).show();
                return false;
            }
            this.f16976e.f16960s = this.f16973b[0];
            return true;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (m15663a()) {
                this.f16976e.f16948g.dismiss();
                this.f16976e.f16962u = true;
                new AsyncTaskC2715k(this.f16976e).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.BackupAndRestoreActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity$h.class */
    public class RunnableC2712h implements Runnable {

        /* renamed from: b */
        public final BackupAndRestoreActivity f16977b;

        public RunnableC2712h(BackupAndRestoreActivity backupAndRestoreActivity) {
            this.f16977b = backupAndRestoreActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f16977b.m15642Q0();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                } catch (Exception e11) {
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.BackupAndRestoreActivity$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity$i.class */
    public class DialogC2713i extends Dialog implements View.OnClickListener {

        /* renamed from: b */
        public Activity f16978b;

        /* renamed from: c */
        public TextView f16979c;

        /* renamed from: d */
        public TextView f16980d;

        /* renamed from: e */
        public TextView f16981e;

        /* renamed from: f */
        public ImageView f16982f;

        /* renamed from: g */
        public LinearLayout f16983g;

        /* renamed from: h */
        public LinearLayout f16984h;

        /* renamed from: i */
        public final BackupAndRestoreActivity f16985i;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity$i$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.BackupAndRestoreActivity$i$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity$i$a.class */
        public class a implements View.OnFocusChangeListener {

            /* renamed from: b */
            public View f16986b;

            /* renamed from: c */
            public final DialogC2713i f16987c;

            public a(DialogC2713i dialogC2713i, View view) {
                this.f16987c = dialogC2713i;
                this.f16986b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z10) {
                int i10;
                LinearLayout linearLayout;
                if (z10) {
                    View view2 = this.f16986b;
                    i10 = 2131230846;
                    if (view2 == null || view2.getTag() == null || !this.f16986b.getTag().equals("1")) {
                        View view3 = this.f16986b;
                        if (view3 == null || view3.getTag() == null || !this.f16986b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f16987c.f16984h;
                    }
                    linearLayout = this.f16987c.f16983g;
                } else {
                    View view4 = this.f16986b;
                    i10 = 2131230845;
                    if (view4 == null || view4.getTag() == null || !this.f16986b.getTag().equals("1")) {
                        View view5 = this.f16986b;
                        if (view5 == null || view5.getTag() == null || !this.f16986b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f16987c.f16984h;
                    }
                    linearLayout = this.f16987c.f16983g;
                }
                linearLayout.setBackgroundResource(i10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogC2713i(BackupAndRestoreActivity backupAndRestoreActivity, Activity activity) {
            super(activity);
            this.f16985i = backupAndRestoreActivity;
            this.f16978b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id2 = view.getId();
            try {
                if (id2 == 2131427643) {
                    dismiss();
                    BackupAndRestoreActivity backupAndRestoreActivity = this.f16985i;
                    backupAndRestoreActivity.m15647X0((BackupAndRestoreActivity) backupAndRestoreActivity.f16945d);
                } else if (id2 != 2131427654) {
                } else {
                    dismiss();
                }
            } catch (Exception e10) {
            }
        }

        @Override // android.app.Dialog
        @SuppressLint({"SetTextI18n"})
        public void onCreate(Bundle bundle) {
            TextView textView;
            StringBuilder sb2;
            Resources resources;
            int i10;
            String sb3;
            Resources resources2;
            int i11;
            super.onCreate(bundle);
            setContentView(this.f16985i.f16946e.m31288z().equals(C5251a.f30065s0) ? 2131624148 : 2131624147);
            this.f16979c = (TextView) findViewById(2131427654);
            this.f16980d = (TextView) findViewById(2131427643);
            this.f16983g = (LinearLayout) findViewById(2131428408);
            this.f16984h = (LinearLayout) findViewById(2131428458);
            this.f16981e = (TextView) findViewById(2131429631);
            this.f16982f = (ImageView) findViewById(2131428187);
            int i12 = 2131231106;
            if (this.f16985i.f16959r != null && this.f16985i.f16959r.equals("uploaded")) {
                this.f16983g.setVisibility(8);
                textView = this.f16981e;
                resources2 = this.f16985i.getResources();
                i11 = 2132017362;
            } else {
                if (this.f16985i.f16959r != null && this.f16985i.f16959r.equals("downloaded")) {
                    try {
                        Log.e("honey", "restart your application");
                        this.f16983g.setVisibility(8);
                        this.f16981e.setText(this.f16985i.getResources().getString(2132017358));
                        this.f16982f.setImageResource(2131231106);
                    } catch (Exception e10) {
                    }
                    this.f16979c.setOnClickListener(this);
                    this.f16980d.setOnClickListener(this);
                    TextView textView2 = this.f16979c;
                    textView2.setOnFocusChangeListener(new a(this, textView2));
                    TextView textView3 = this.f16980d;
                    textView3.setOnFocusChangeListener(new a(this, textView3));
                }
                i12 = 2131232008;
                if (this.f16985i.f16959r == null || !this.f16985i.f16959r.equals("error3")) {
                    if (this.f16985i.f16959r == null || !this.f16985i.f16959r.equals("405")) {
                        this.f16983g.setVisibility(8);
                        textView = this.f16981e;
                        sb2 = new StringBuilder();
                        resources = this.f16985i.getResources();
                        i10 = 2132017696;
                    } else {
                        this.f16983g.setVisibility(8);
                        textView = this.f16981e;
                        sb2 = new StringBuilder();
                        resources = this.f16985i.getResources();
                        i10 = 2132017361;
                    }
                    sb2.append(resources.getString(i10));
                    sb2.append(" ");
                    sb2.append(this.f16985i.f16959r);
                    sb3 = sb2.toString();
                    textView.setText(sb3);
                    this.f16982f.setImageResource(i12);
                    this.f16979c.setOnClickListener(this);
                    this.f16980d.setOnClickListener(this);
                    TextView textView22 = this.f16979c;
                    textView22.setOnFocusChangeListener(new a(this, textView22));
                    TextView textView32 = this.f16980d;
                    textView32.setOnFocusChangeListener(new a(this, textView32));
                }
                this.f16983g.setVisibility(0);
                textView = this.f16981e;
                resources2 = this.f16985i.getResources();
                i11 = 2132017360;
            }
            sb3 = resources2.getString(i11);
            textView.setText(sb3);
            this.f16982f.setImageResource(i12);
            this.f16979c.setOnClickListener(this);
            this.f16980d.setOnClickListener(this);
            TextView textView222 = this.f16979c;
            textView222.setOnFocusChangeListener(new a(this, textView222));
            TextView textView322 = this.f16980d;
            textView322.setOnFocusChangeListener(new a(this, textView322));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.BackupAndRestoreActivity$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity$j.class */
    public static class ViewOnFocusChangeListenerC2714j implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f16988b;

        public ViewOnFocusChangeListenerC2714j(View view) {
            this.f16988b = view;
        }

        /* renamed from: a */
        public final void m15666a(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16988b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: b */
        public final void m15667b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16988b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            View view2;
            View view3;
            View view4;
            View view5;
            View view6;
            View view7;
            int i10;
            float f10 = 1.0f;
            if (!z10) {
                if (z10) {
                    return;
                }
                if (z10) {
                    f10 = 1.09f;
                }
                m15666a(f10);
                m15667b(f10);
                View view8 = this.f16988b;
                if ((view8 == null || view8.getTag() == null || !this.f16988b.getTag().equals("1")) && (((view2 = this.f16988b) == null || view2.getTag() == null || !this.f16988b.getTag().equals("8")) && (((view3 = this.f16988b) == null || view3.getTag() == null || !this.f16988b.getTag().equals("2")) && ((view4 = this.f16988b) == null || view4.getTag() == null || !this.f16988b.getTag().equals("9"))))) {
                    return;
                }
                this.f16988b.setBackgroundResource(2131230845);
                return;
            }
            if (z10) {
                f10 = 1.05f;
            }
            View view9 = this.f16988b;
            if ((view9 == null || view9.getTag() == null || !this.f16988b.getTag().equals("1")) && ((view5 = this.f16988b) == null || view5.getTag() == null || !this.f16988b.getTag().equals("8"))) {
                View view10 = this.f16988b;
                if ((view10 == null || view10.getTag() == null || !this.f16988b.getTag().equals("2")) && ((view6 = this.f16988b) == null || view6.getTag() == null || !this.f16988b.getTag().equals("9"))) {
                    return;
                }
                m15666a(f10);
                m15667b(f10);
                view7 = this.f16988b;
                i10 = 2131231576;
            } else {
                m15666a(f10);
                m15667b(f10);
                view7 = this.f16988b;
                i10 = 2131230846;
            }
            view7.setBackgroundResource(i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity$k.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.BackupAndRestoreActivity$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity$k.class */
    public class AsyncTaskC2715k extends AsyncTask<String, Void, Boolean> {

        /* renamed from: a */
        public final BackupAndRestoreActivity f16989a;

        public AsyncTaskC2715k(BackupAndRestoreActivity backupAndRestoreActivity) {
            this.f16989a = backupAndRestoreActivity;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return Boolean.valueOf(this.f16989a.m15648Y0());
            } catch (Exception e10) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (bool.booleanValue()) {
                this.f16989a.m15652c1();
            } else {
                C5255e.m26205H();
                Toast.makeText(this.f16989a.f16945d, "Error while uploading backup.", 0).show();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            C5255e.m26238i0(this.f16989a.f16945d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity$l.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.BackupAndRestoreActivity$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity$l.class */
    public class AsyncTaskC2716l extends AsyncTask<String, Void, Boolean> {

        /* renamed from: a */
        public final BackupAndRestoreActivity f16990a;

        public AsyncTaskC2716l(BackupAndRestoreActivity backupAndRestoreActivity) {
            this.f16990a = backupAndRestoreActivity;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return this.f16990a.m15649Z0(strArr[0]);
            } catch (Exception e10) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            try {
                File file = new File(this.f16990a.getFilesDir().getParent() + "/file.json");
                if (file.exists()) {
                    C5255e.m26240k(file);
                }
            } catch (Exception e10) {
            }
            Log.e("honey", "download backup done");
            this.f16990a.f16959r = "downloaded";
            C5255e.m26205H();
            try {
                this.f16990a.f16961t.obtainMessage(1, this.f16990a.f16959r).sendToTarget();
            } catch (Exception e11) {
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* renamed from: L0 */
    public final void m15637L0(StorageException storageException) {
        this.f16959r = "401";
        C5255e.m26205H();
        try {
            this.f16961t.obtainMessage(1, this.f16959r).sendToTarget();
        } catch (Exception e10) {
        }
    }

    /* renamed from: M0 */
    public final void m15638M0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01e6  */
    /* renamed from: N0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m15639N0(com.amplifyframework.storage.result.StorageListResult r9) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.BackupAndRestoreActivity.m15639N0(com.amplifyframework.storage.result.StorageListResult):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:9:0x008a
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* renamed from: O0 */
    public final void m15640O0(com.amplifyframework.storage.StorageException r5) {
        /*
            r4 = this;
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L8a
            r6 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8a
            r5 = r0
            r0 = r5
            r0.<init>()     // Catch: java.lang.Exception -> L8a
            r0 = r5
            r1 = r4
            java.io.File r1 = r1.getFilesDir()     // Catch: java.lang.Exception -> L8a
            java.lang.String r1 = r1.getParent()     // Catch: java.lang.Exception -> L8a
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L8a
            r0 = r5
            java.lang.String r1 = "/backup_database.zip"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L8a
            r0 = r6
            r1 = r5
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L8a
            r0.<init>(r1)     // Catch: java.lang.Exception -> L8a
            r0 = r6
            boolean r0 = r0.exists()     // Catch: java.lang.Exception -> L8a
            if (r0 == 0) goto L33
            r0 = r6
            p151if.C5255e.m26240k(r0)     // Catch: java.lang.Exception -> L8a
        L33:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L8a java.lang.Exception -> L8e
            r5 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8e
            r6 = r0
            r0 = r6
            r0.<init>()     // Catch: java.lang.Exception -> L8e
            r0 = r6
            r1 = r4
            java.io.File r1 = r1.getFilesDir()     // Catch: java.lang.Exception -> L8e
            java.lang.String r1 = r1.getParent()     // Catch: java.lang.Exception -> L8e
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L8e
            r0 = r6
            java.lang.String r1 = "/file.json"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L8e
            r0 = r5
            r1 = r6
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L8e
            r0.<init>(r1)     // Catch: java.lang.Exception -> L8e
            r0 = r5
            boolean r0 = r0.exists()     // Catch: java.lang.Exception -> L8e
            if (r0 == 0) goto L66
            r0 = r5
            p151if.C5255e.m26240k(r0)     // Catch: java.lang.Exception -> L8e
        L66:
            java.lang.String r0 = "honey"
            java.lang.String r1 = "backup error"
            int r0 = android.util.Log.e(r0, r1)
            r0 = r4
            java.lang.String r1 = "404"
            r0.f16959r = r1
            p151if.C5255e.m26205H()
            r0 = r4
            android.os.Handler r0 = r0.f16961t     // Catch: java.lang.Exception -> L92
            r1 = 1
            r2 = r4
            java.lang.String r2 = r2.f16959r     // Catch: java.lang.Exception -> L92
            android.os.Message r0 = r0.obtainMessage(r1, r2)     // Catch: java.lang.Exception -> L92
            r0.sendToTarget()     // Catch: java.lang.Exception -> L92
        L89:
            return
        L8a:
            r5 = move-exception
            goto L33
        L8e:
            r5 = move-exception
            goto L66
        L92:
            r5 = move-exception
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.BackupAndRestoreActivity.m15640O0(com.amplifyframework.storage.StorageException):void");
    }

    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public final void m15627V0(StorageRemoveResult storageRemoveResult, String str) {
        File file = new File(getFilesDir().getParent() + "/backup_database.zip");
        if (file.exists()) {
            Amplify.Storage.uploadFile(this.f16958q + "/" + str, file, new C5594e(this), new C5595f(this));
        }
    }

    /* renamed from: Q0 */
    public void m15642Q0() {
        runOnUiThread(new RunnableC2707c(this));
    }

    /* renamed from: R0 */
    public final void m15643R0() {
        Button button = this.btSaveChanges;
        if (button != null) {
            button.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2714j(button));
            this.btSaveChanges.requestFocus();
            this.btSaveChanges.requestFocusFromTouch();
        }
        Button button2 = this.btnBackPlayerselection;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2714j(button2));
        }
    }

    /* renamed from: S0 */
    public String m15644S0(String str) {
        String[] split = str.split("/");
        return split.length == 0 ? "" : split[split.length - 1];
    }

    /* renamed from: T0 */
    public final void m15645T0() {
        this.f16954m = new DatabaseHandler(this.f16945d);
        this.f16953l = new LiveStreamDBHandler(this.f16945d);
        this.f16951j = new RecentWatchDBHandler(this.f16945d);
        this.f16952k = new SeriesRecentWatchDatabase(this.f16945d);
        this.f16955n = getSharedPreferences("loginPrefs", 0);
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: W0 */
    public final void m15646W0(BackupAndRestoreActivity backupAndRestoreActivity, String str) {
        try {
            RelativeLayout relativeLayout = (RelativeLayout) backupAndRestoreActivity.findViewById(2131429032);
            LayoutInflater layoutInflater = (LayoutInflater) backupAndRestoreActivity.getSystemService("layout_inflater");
            View inflate = this.f16946e.m31288z().equals(C5251a.f30065s0) ? layoutInflater.inflate(2131624552, relativeLayout) : layoutInflater.inflate(2131624551, relativeLayout);
            PopupWindow popupWindow = new PopupWindow(backupAndRestoreActivity);
            this.f16948g = popupWindow;
            popupWindow.setContentView(inflate);
            this.f16948g.setWidth(-1);
            this.f16948g.setHeight(-1);
            this.f16948g.setFocusable(true);
            this.f16948g.showAtLocation(inflate, 17, 0, 0);
            this.f16949h = (Button) inflate.findViewById(2131427624);
            TextView textView = (TextView) inflate.findViewById(2131429555);
            if (str.equals("backup")) {
                ((TextView) inflate.findViewById(2131429363)).setText(getResources().getString(2132018559));
                textView.setVisibility(0);
                textView.setText(getResources().getString(2132017363));
            } else if (str.equals("download")) {
                ((TextView) inflate.findViewById(2131429363)).setText(getResources().getString(2132017589));
                textView.setVisibility(8);
            }
            this.f16950i = (Button) inflate.findViewById(2131427605);
            Button button = this.f16949h;
            if (button != null) {
                button.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2714j(button));
            }
            Button button2 = this.f16950i;
            if (button2 != null) {
                button2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2714j(button2));
            }
            EditText editText = (EditText) inflate.findViewById(2131427917);
            if (backupAndRestoreActivity.getSharedPreferences("selected_language", 0).getString("selected_language", "English").equalsIgnoreCase("Arabic")) {
                editText.setGravity(21);
            }
            this.f16950i.setOnClickListener(new ViewOnClickListenerC2708d(this));
            this.f16949h.setOnClickListener(new ViewOnClickListenerC2709e(this, str, backupAndRestoreActivity, new String[1], editText));
        } catch (NullPointerException | Exception e10) {
        }
    }

    /* renamed from: X0 */
    public final void m15647X0(Activity activity) {
        try {
            RelativeLayout relativeLayout = (RelativeLayout) activity.findViewById(2131429032);
            LayoutInflater layoutInflater = (LayoutInflater) activity.getSystemService("layout_inflater");
            View inflate = this.f16946e.m31288z().equals(C5251a.f30065s0) ? layoutInflater.inflate(2131624552, relativeLayout) : layoutInflater.inflate(2131624551, relativeLayout);
            PopupWindow popupWindow = new PopupWindow(activity);
            this.f16948g = popupWindow;
            popupWindow.setContentView(inflate);
            this.f16948g.setWidth(-1);
            this.f16948g.setHeight(-1);
            this.f16948g.setFocusable(true);
            this.f16948g.showAtLocation(inflate, 17, 0, 0);
            EditText editText = (EditText) inflate.findViewById(2131427917);
            TextView textView = (TextView) inflate.findViewById(2131429555);
            textView.setText(getResources().getString(2132018755));
            textView.setTextColor(getResources().getColor(2131100100));
            editText.setHint(getResources().getString(2132017657));
            this.f16949h = (Button) inflate.findViewById(2131427624);
            this.f16950i = (Button) inflate.findViewById(2131427605);
            Button button = this.f16949h;
            if (button != null) {
                button.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2714j(button));
            }
            Button button2 = this.f16950i;
            if (button2 != null) {
                button2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2714j(button2));
            }
            if (activity.getSharedPreferences("selected_language", 0).getString("selected_language", "English").equalsIgnoreCase("Arabic")) {
                editText.setGravity(21);
            }
            this.f16950i.setOnClickListener(new ViewOnClickListenerC2710f(this));
            this.f16949h.setOnClickListener(new ViewOnClickListenerC2711g(this, new String[1], editText, activity));
        } catch (NullPointerException | Exception e10) {
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:70:0x05b0
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* renamed from: Y0 */
    public final boolean m15648Y0() {
        /*
            Method dump skipped, instructions count: 1526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.BackupAndRestoreActivity.m15648Y0():boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:245:0x0c9b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04c7 A[Catch: Exception -> 0x0c5c, TRY_ENTER, TryCatch #8 {Exception -> 0x0c5c, blocks: (B:8:0x005d, B:12:0x0060, B:143:0x0377, B:147:0x0386, B:151:0x0401, B:153:0x0408, B:156:0x041f, B:160:0x042a, B:162:0x0433, B:165:0x0443, B:171:0x0455, B:173:0x045f, B:176:0x046e, B:180:0x047a, B:182:0x0481, B:184:0x048e, B:186:0x04bf, B:188:0x04c7, B:190:0x04cc, B:194:0x04d7, B:196:0x04e1, B:198:0x04ef, B:200:0x04f6, B:202:0x04ff, B:204:0x0507, B:262:0x06d7, B:264:0x06df, B:266:0x06e5, B:268:0x0718, B:442:0x049b, B:444:0x04a3, B:447:0x04af, B:449:0x04b6, B:452:0x039b, B:456:0x03aa, B:462:0x03bf, B:466:0x03ce, B:468:0x03d8), top: B:7:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0507 A[Catch: Exception -> 0x0c5c, TRY_ENTER, TryCatch #8 {Exception -> 0x0c5c, blocks: (B:8:0x005d, B:12:0x0060, B:143:0x0377, B:147:0x0386, B:151:0x0401, B:153:0x0408, B:156:0x041f, B:160:0x042a, B:162:0x0433, B:165:0x0443, B:171:0x0455, B:173:0x045f, B:176:0x046e, B:180:0x047a, B:182:0x0481, B:184:0x048e, B:186:0x04bf, B:188:0x04c7, B:190:0x04cc, B:194:0x04d7, B:196:0x04e1, B:198:0x04ef, B:200:0x04f6, B:202:0x04ff, B:204:0x0507, B:262:0x06d7, B:264:0x06df, B:266:0x06e5, B:268:0x0718, B:442:0x049b, B:444:0x04a3, B:447:0x04af, B:449:0x04b6, B:452:0x039b, B:456:0x03aa, B:462:0x03bf, B:466:0x03ce, B:468:0x03d8), top: B:7:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x054f A[Catch: Exception -> 0x0c8d, TRY_ENTER, TryCatch #22 {Exception -> 0x0c8d, blocks: (B:207:0x0517, B:209:0x0542, B:211:0x054f, B:214:0x0571, B:219:0x061c, B:221:0x0626, B:223:0x063f, B:225:0x064a, B:229:0x0653, B:231:0x065b, B:257:0x06c7, B:259:0x06ce), top: B:206:0x0517 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0626 A[Catch: Exception -> 0x0c8d, TRY_LEAVE, TryCatch #22 {Exception -> 0x0c8d, blocks: (B:207:0x0517, B:209:0x0542, B:211:0x054f, B:214:0x0571, B:219:0x061c, B:221:0x0626, B:223:0x063f, B:225:0x064a, B:229:0x0653, B:231:0x065b, B:257:0x06c7, B:259:0x06ce), top: B:206:0x0517 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x06df A[Catch: Exception -> 0x0c5c, TRY_ENTER, TryCatch #8 {Exception -> 0x0c5c, blocks: (B:8:0x005d, B:12:0x0060, B:143:0x0377, B:147:0x0386, B:151:0x0401, B:153:0x0408, B:156:0x041f, B:160:0x042a, B:162:0x0433, B:165:0x0443, B:171:0x0455, B:173:0x045f, B:176:0x046e, B:180:0x047a, B:182:0x0481, B:184:0x048e, B:186:0x04bf, B:188:0x04c7, B:190:0x04cc, B:194:0x04d7, B:196:0x04e1, B:198:0x04ef, B:200:0x04f6, B:202:0x04ff, B:204:0x0507, B:262:0x06d7, B:264:0x06df, B:266:0x06e5, B:268:0x0718, B:442:0x049b, B:444:0x04a3, B:447:0x04af, B:449:0x04b6, B:452:0x039b, B:456:0x03aa, B:462:0x03bf, B:466:0x03ce, B:468:0x03d8), top: B:7:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0744 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0926 A[Catch: Exception -> 0x0ca0, TRY_LEAVE, TryCatch #7 {Exception -> 0x0ca0, blocks: (B:272:0x0744, B:275:0x0767, B:285:0x091d, B:287:0x0926, B:296:0x0965, B:298:0x096d, B:301:0x098d, B:303:0x0997, B:305:0x09c1, B:309:0x09cf, B:370:0x0b5f, B:429:0x0c40), top: B:271:0x0744 }] */
    /* renamed from: Z0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean m15649Z0(java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 3294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.BackupAndRestoreActivity.m15649Z0(java.lang.String):java.lang.Boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:9:0x008a
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* renamed from: a1 */
    public final void m15650a1(com.amplifyframework.storage.StorageException r5) {
        /*
            r4 = this;
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L8a
            r6 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8a
            r5 = r0
            r0 = r5
            r0.<init>()     // Catch: java.lang.Exception -> L8a
            r0 = r5
            r1 = r4
            java.io.File r1 = r1.getFilesDir()     // Catch: java.lang.Exception -> L8a
            java.lang.String r1 = r1.getParent()     // Catch: java.lang.Exception -> L8a
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L8a
            r0 = r5
            java.lang.String r1 = "/backup_database.zip"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L8a
            r0 = r6
            r1 = r5
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L8a
            r0.<init>(r1)     // Catch: java.lang.Exception -> L8a
            r0 = r6
            boolean r0 = r0.exists()     // Catch: java.lang.Exception -> L8a
            if (r0 == 0) goto L33
            r0 = r6
            p151if.C5255e.m26240k(r0)     // Catch: java.lang.Exception -> L8a
        L33:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L8a java.lang.Exception -> L8e
            r5 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8e
            r6 = r0
            r0 = r6
            r0.<init>()     // Catch: java.lang.Exception -> L8e
            r0 = r6
            r1 = r4
            java.io.File r1 = r1.getFilesDir()     // Catch: java.lang.Exception -> L8e
            java.lang.String r1 = r1.getParent()     // Catch: java.lang.Exception -> L8e
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L8e
            r0 = r6
            java.lang.String r1 = "/file.json"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L8e
            r0 = r5
            r1 = r6
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L8e
            r0.<init>(r1)     // Catch: java.lang.Exception -> L8e
            r0 = r5
            boolean r0 = r0.exists()     // Catch: java.lang.Exception -> L8e
            if (r0 == 0) goto L66
            r0 = r5
            p151if.C5255e.m26240k(r0)     // Catch: java.lang.Exception -> L8e
        L66:
            java.lang.String r0 = "honey"
            java.lang.String r1 = "backup error"
            int r0 = android.util.Log.e(r0, r1)
            r0 = r4
            java.lang.String r1 = "403"
            r0.f16959r = r1
            p151if.C5255e.m26205H()
            r0 = r4
            android.os.Handler r0 = r0.f16961t     // Catch: java.lang.Exception -> L92
            r1 = 1
            r2 = r4
            java.lang.String r2 = r2.f16959r     // Catch: java.lang.Exception -> L92
            android.os.Message r0 = r0.obtainMessage(r1, r2)     // Catch: java.lang.Exception -> L92
            r0.sendToTarget()     // Catch: java.lang.Exception -> L92
        L89:
            return
        L8a:
            r5 = move-exception
            goto L33
        L8e:
            r5 = move-exception
            goto L66
        L92:
            r5 = move-exception
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.BackupAndRestoreActivity.m15650a1(com.amplifyframework.storage.StorageException):void");
    }

    /* renamed from: b1 */
    public final boolean m15651b1(String str, String str2) {
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(str + str2)));
            byte[] bArr = new byte[1024];
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return true;
                }
                String name = nextEntry.getName();
                String str3 = name;
                if (name.contains("/com.maxdigitall.maxdigitaliptvbox/")) {
                    str3 = name.replaceAll("/com.maxdigitall.maxdigitaliptvbox/", "");
                }
                if (nextEntry.isDirectory()) {
                    new File(str + str3).mkdirs();
                } else {
                    FileOutputStream fileOutputStream = new FileOutputStream(str + str3);
                    while (true) {
                        int read = zipInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileOutputStream.close();
                    zipInputStream.closeEntry();
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:16:0x0103
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* renamed from: c1 */
    public final void m15652c1() {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.BackupAndRestoreActivity.m15652c1():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:9:0x008a
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* renamed from: d1 */
    public final void m15653d1(com.amplifyframework.storage.result.StorageUploadFileResult r5) {
        /*
            r4 = this;
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L8a
            r5 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8a
            r6 = r0
            r0 = r6
            r0.<init>()     // Catch: java.lang.Exception -> L8a
            r0 = r6
            r1 = r4
            java.io.File r1 = r1.getFilesDir()     // Catch: java.lang.Exception -> L8a
            java.lang.String r1 = r1.getParent()     // Catch: java.lang.Exception -> L8a
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L8a
            r0 = r6
            java.lang.String r1 = "/backup_database.zip"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L8a
            r0 = r5
            r1 = r6
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L8a
            r0.<init>(r1)     // Catch: java.lang.Exception -> L8a
            r0 = r5
            boolean r0 = r0.exists()     // Catch: java.lang.Exception -> L8a
            if (r0 == 0) goto L33
            r0 = r5
            p151if.C5255e.m26240k(r0)     // Catch: java.lang.Exception -> L8a
        L33:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L8a java.lang.Exception -> L8e
            r5 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8e
            r6 = r0
            r0 = r6
            r0.<init>()     // Catch: java.lang.Exception -> L8e
            r0 = r6
            r1 = r4
            java.io.File r1 = r1.getFilesDir()     // Catch: java.lang.Exception -> L8e
            java.lang.String r1 = r1.getParent()     // Catch: java.lang.Exception -> L8e
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L8e
            r0 = r6
            java.lang.String r1 = "/file.json"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L8e
            r0 = r5
            r1 = r6
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L8e
            r0.<init>(r1)     // Catch: java.lang.Exception -> L8e
            r0 = r5
            boolean r0 = r0.exists()     // Catch: java.lang.Exception -> L8e
            if (r0 == 0) goto L66
            r0 = r5
            p151if.C5255e.m26240k(r0)     // Catch: java.lang.Exception -> L8e
        L66:
            java.lang.String r0 = "honey"
            java.lang.String r1 = "backup finished"
            int r0 = android.util.Log.e(r0, r1)
            r0 = r4
            java.lang.String r1 = "uploaded"
            r0.f16959r = r1
            p151if.C5255e.m26205H()
            r0 = r4
            android.os.Handler r0 = r0.f16961t     // Catch: java.lang.Exception -> L92
            r1 = 1
            r2 = r4
            java.lang.String r2 = r2.f16959r     // Catch: java.lang.Exception -> L92
            android.os.Message r0 = r0.obtainMessage(r1, r2)     // Catch: java.lang.Exception -> L92
            r0.sendToTarget()     // Catch: java.lang.Exception -> L92
        L89:
            return
        L8a:
            r5 = move-exception
            goto L33
        L8e:
            r5 = move-exception
            goto L66
        L92:
            r5 = move-exception
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.BackupAndRestoreActivity.m15653d1(com.amplifyframework.storage.result.StorageUploadFileResult):void");
    }

    /* renamed from: e1 */
    public boolean m15654e1(String str, String str2) {
        File file = new File(str);
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(str2)));
            if (!file.isDirectory()) {
                byte[] bArr = new byte[2048];
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(str), 2048);
                ZipEntry zipEntry = new ZipEntry(m15644S0(str));
                zipEntry.setTime(file.lastModified());
                zipOutputStream.putNextEntry(zipEntry);
                while (true) {
                    int read = bufferedInputStream.read(bArr, 0, 2048);
                    if (read == -1) {
                        break;
                    }
                    zipOutputStream.write(bArr, 0, read);
                }
            } else {
                m15655f1(zipOutputStream, file, file.getParent().length());
            }
            zipOutputStream.close();
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x019a
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* renamed from: f1 */
    public final void m15655f1(java.util.zip.ZipOutputStream r6, java.io.File r7, int r8) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.BackupAndRestoreActivity.m15655f1(java.util.zip.ZipOutputStream, java.io.File, int):void");
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
        this.f16945d = this;
        super.onCreate(bundle);
        C6783a c6783a = new C6783a(this.f16945d);
        this.f16946e = c6783a;
        setContentView(c6783a.m31288z().equals(C5251a.f30065s0) ? 2131623976 : 2131623975);
        ButterKnife.m5626a(this);
        m15645T0();
        m15643R0();
        try {
            this.f16961t = new HandlerC2705a(this, Looper.getMainLooper());
        } catch (Exception e10) {
        }
        m15638M0();
        m878n0((Toolbar) findViewById(2131429320));
        getWindow().setFlags(1024, 1024);
        Thread thread = this.f16947f;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC2712h(this));
            this.f16947f = thread2;
            thread2.start();
        }
        this.logo.setOnClickListener(new ViewOnClickListenerC2706b(this));
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f16947f;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f16947f.interrupt();
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f16947f;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC2712h(this));
            this.f16947f = thread2;
            thread2.start();
        }
        C5255e.m26233f(this.f16945d);
    }

    @OnClick
    public void onViewClicked(View view) {
        String str;
        int id2 = view.getId();
        if (id2 == 2131427598) {
            str = "backup";
        } else if (id2 != 2131427616) {
            return;
        } else {
            str = "download";
        }
        m15646W0(this, str);
    }
}

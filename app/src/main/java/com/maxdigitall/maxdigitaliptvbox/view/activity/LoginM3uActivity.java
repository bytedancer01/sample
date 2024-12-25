package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.app.DialogC0242a;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cf.C1083g;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferTable;
import com.amazonaws.services.p045s3.internal.Constants;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.MultiUserDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.vpn.activities.ProfileActivity;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import nf.C6783a;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.json.JSONObject;
import org.pcap4j.packet.namednumber.EtherType;
import org.slf4j.Marker;
import p030c0.C0936d;
import p050d0.C4290b;
import p151if.C5251a;
import p151if.C5255e;
import p355uf.C9174b;
import p407xe.C9740b;
import p407xe.C9744f;
import p407xe.C9745g;
import p407xe.InterfaceC9741c;
import tf.C8724a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity.class */
public class LoginM3uActivity extends ActivityC0243b implements InterfaceC9741c<String> {

    /* renamed from: S */
    public static final File f17615S;

    /* renamed from: T */
    public static final File f17616T;

    /* renamed from: U */
    public static C6783a f17617U;

    /* renamed from: A */
    public String f17618A;

    /* renamed from: B */
    public String f17619B;

    /* renamed from: C */
    public int f17620C;

    /* renamed from: G */
    public String f17624G;

    /* renamed from: H */
    public SharedPreferences f17625H;

    /* renamed from: I */
    public SharedPreferences.Editor f17626I;

    /* renamed from: J */
    public SharedPreferences.Editor f17627J;

    /* renamed from: K */
    public SharedPreferences f17628K;

    /* renamed from: L */
    public SharedPreferences f17629L;

    /* renamed from: P */
    public String f17633P;

    /* renamed from: Q */
    public DialogC0242a f17634Q;

    /* renamed from: R */
    public Uri f17635R;

    @BindView
    public Button bt_browse;

    /* renamed from: d */
    public InputStream f17636d;

    @BindView
    public EditText etM3uLine;

    @BindView
    public EditText etM3uLineFile;

    @BindView
    public EditText etName;

    /* renamed from: f */
    public String f17638f;

    /* renamed from: g */
    public String f17639g;

    /* renamed from: h */
    public String f17640h;

    /* renamed from: i */
    public LiveStreamDBHandler f17641i;

    @BindView
    public ImageView iv_add_user;

    @BindView
    public ImageView iv_list_users;

    /* renamed from: j */
    public MultiUserDBHandler f17642j;

    /* renamed from: k */
    public DatabaseHandler f17643k;

    /* renamed from: l */
    public SharedPreferences f17644l;

    /* renamed from: m */
    public SharedPreferences.Editor f17645m;

    /* renamed from: n */
    public SharedPreferences f17646n;

    /* renamed from: o */
    public SharedPreferences f17647o;

    /* renamed from: p */
    public SharedPreferences f17648p;

    /* renamed from: q */
    public SharedPreferences f17649q;

    /* renamed from: r */
    public SharedPreferences.Editor f17650r;

    @BindView
    public RadioButton rbFile;

    @BindView
    public RadioButton rbM3U;

    @BindView
    public RelativeLayout rl_add_user;

    @BindView
    public RelativeLayout rl_list_users;

    @BindView
    public RelativeLayout rl_playlist_name;

    /* renamed from: s */
    public SharedPreferences.Editor f17651s;

    /* renamed from: t */
    public SharedPreferences.Editor f17652t;

    @BindView
    public TextView tv_add_user;

    @BindView
    public TextView tv_browse_error;

    @BindView
    public TextView tv_file_path;

    @BindView
    public TextView tv_list_users;

    /* renamed from: u */
    public SharedPreferences.Editor f17653u;

    /* renamed from: v */
    public RadioGroup f17654v;

    @BindView
    public Button vpn_button;

    /* renamed from: x */
    public SharedPreferences f17656x;

    /* renamed from: y */
    public SharedPreferences.Editor f17657y;

    /* renamed from: z */
    public String f17658z;

    /* renamed from: e */
    public Context f17637e = this;

    /* renamed from: w */
    public final C8724a f17655w = new C8724a();

    /* renamed from: D */
    public String f17621D = "";

    /* renamed from: E */
    public String f17622E = "";

    /* renamed from: F */
    public long f17623F = -1;

    /* renamed from: M */
    public String f17630M = "";

    /* renamed from: N */
    public ArrayList<String> f17631N = new ArrayList<>();

    /* renamed from: O */
    public String f17632O = TransferTable.COLUMN_FILE;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LoginM3uActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity$a.class */
    public class ViewOnClickListenerC2833a implements View.OnClickListener {

        /* renamed from: b */
        public final LoginM3uActivity f17659b;

        public ViewOnClickListenerC2833a(LoginM3uActivity loginM3uActivity) {
            this.f17659b = loginM3uActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5251a.f30028a = true;
            SharepreferenceDBHandler.m15374f0("login", this.f17659b.f17637e);
            Intent intent = new Intent(this.f17659b.f17637e, (Class<?>) ProfileActivity.class);
            intent.putExtra("typeid", "login");
            this.f17659b.startActivity(intent);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LoginM3uActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity$b.class */
    public class ViewOnClickListenerC2834b implements View.OnClickListener {

        /* renamed from: b */
        public final LoginM3uActivity f17660b;

        public ViewOnClickListenerC2834b(LoginM3uActivity loginM3uActivity) {
            this.f17660b = loginM3uActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(this.f17660b.f17637e, (Class<?>) MultiUserActivity.class);
            SharepreferenceDBHandler.m15351O("m3u", this.f17660b.f17637e);
            this.f17660b.startActivity(intent);
            this.f17660b.overridePendingTransition(2130772003, 2130772000);
            this.f17660b.finish();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LoginM3uActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity$c.class */
    public class C2835c implements C1083g.g {

        /* renamed from: a */
        public final String[] f17661a;

        /* renamed from: b */
        public final LoginM3uActivity f17662b;

        public C2835c(LoginM3uActivity loginM3uActivity, String[] strArr) {
            this.f17662b = loginM3uActivity;
            this.f17661a = strArr;
        }

        @Override // cf.C1083g.g
        /* renamed from: a */
        public void mo6468a(String str) {
            this.f17661a[0] = str;
            this.f17662b.etM3uLineFile.setText(str);
            this.f17662b.tv_browse_error.setVisibility(8);
            this.f17662b.tv_file_path.setVisibility(0);
            this.f17662b.tv_file_path.setText(str);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LoginM3uActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity$d.class */
    public class ViewOnClickListenerC2836d implements View.OnClickListener {

        /* renamed from: b */
        public final LoginM3uActivity f17663b;

        public ViewOnClickListenerC2836d(LoginM3uActivity loginM3uActivity) {
            this.f17663b = loginM3uActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", this.f17663b.getPackageName(), null));
                this.f17663b.startActivityForResult(intent, 101);
                Toast.makeText(this.f17663b.f17637e, this.f17663b.f17637e.getResources().getString(2132017828), 1).show();
            } catch (Exception e10) {
            }
            this.f17663b.f17634Q.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LoginM3uActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity$e.class */
    public class ViewOnClickListenerC2837e implements View.OnClickListener {

        /* renamed from: b */
        public final LoginM3uActivity f17664b;

        public ViewOnClickListenerC2837e(LoginM3uActivity loginM3uActivity) {
            this.f17664b = loginM3uActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f17664b.f17634Q.dismiss();
            this.f17664b.onBackPressed();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LoginM3uActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity$f.class */
    public class DialogC2838f extends Dialog implements View.OnClickListener {

        /* renamed from: b */
        public Activity f17665b;

        /* renamed from: c */
        public TextView f17666c;

        /* renamed from: d */
        public TextView f17667d;

        /* renamed from: e */
        public LinearLayout f17668e;

        /* renamed from: f */
        public LinearLayout f17669f;

        /* renamed from: g */
        public final LoginM3uActivity f17670g;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity$f$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LoginM3uActivity$f$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity$f$a.class */
        public class a implements View.OnFocusChangeListener {

            /* renamed from: b */
            public View f17671b;

            /* renamed from: c */
            public final DialogC2838f f17672c;

            public a(DialogC2838f dialogC2838f, View view) {
                this.f17672c = dialogC2838f;
                this.f17671b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z10) {
                int i10;
                LinearLayout linearLayout;
                if (z10) {
                    View view2 = this.f17671b;
                    i10 = 2131230846;
                    if (view2 == null || view2.getTag() == null || !this.f17671b.getTag().equals("1")) {
                        View view3 = this.f17671b;
                        if (view3 == null || view3.getTag() == null || !this.f17671b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f17672c.f17669f;
                    }
                    linearLayout = this.f17672c.f17668e;
                } else {
                    View view4 = this.f17671b;
                    i10 = 2131230845;
                    if (view4 == null || view4.getTag() == null || !this.f17671b.getTag().equals("1")) {
                        View view5 = this.f17671b;
                        if (view5 == null || view5.getTag() == null || !this.f17671b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f17672c.f17669f;
                    }
                    linearLayout = this.f17672c.f17668e;
                }
                linearLayout.setBackgroundResource(i10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogC2838f(LoginM3uActivity loginM3uActivity, Activity activity) {
            super(activity);
            this.f17670g = loginM3uActivity;
            this.f17665b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id2 = view.getId();
            try {
                if (id2 == 2131427639) {
                    dismiss();
                    return;
                }
                if (id2 != 2131427678) {
                    return;
                }
                dismiss();
                int checkedRadioButtonId = this.f17670g.f17654v.getCheckedRadioButtonId();
                if (checkedRadioButtonId == 2131428901 && this.f17670g.m16033M0()) {
                    LoginM3uActivity loginM3uActivity = this.f17670g;
                    loginM3uActivity.f17640h = loginM3uActivity.etName.getText().toString().trim();
                    LoginM3uActivity loginM3uActivity2 = this.f17670g;
                    loginM3uActivity2.f17639g = loginM3uActivity2.etM3uLineFile.getText().toString().trim();
                    this.f17670g.f17632O = TransferTable.COLUMN_FILE;
                    new AsyncTaskC2844l(this.f17670g).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f17670g.f17639g);
                }
                if (checkedRadioButtonId == 2131428904 && this.f17670g.m16034N0()) {
                    LoginM3uActivity loginM3uActivity3 = this.f17670g;
                    loginM3uActivity3.f17638f = loginM3uActivity3.etM3uLine.getText().toString().trim();
                    LoginM3uActivity loginM3uActivity4 = this.f17670g;
                    loginM3uActivity4.f17640h = loginM3uActivity4.etName.getText().toString().trim();
                    this.f17670g.f17632O = "url";
                    new AsyncTaskC2841i(this.f17670g).execute(new Void[0]);
                }
            } catch (Exception e10) {
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(LoginM3uActivity.f17617U.m31288z().equals(C5251a.f30065s0) ? 2131624141 : 2131624140);
            this.f17666c = (TextView) findViewById(2131427678);
            this.f17667d = (TextView) findViewById(2131427639);
            this.f17668e = (LinearLayout) findViewById(2131428541);
            this.f17669f = (LinearLayout) findViewById(2131428448);
            this.f17666c.setOnClickListener(this);
            this.f17667d.setOnClickListener(this);
            TextView textView = this.f17666c;
            textView.setOnFocusChangeListener(new a(this, textView));
            TextView textView2 = this.f17667d;
            textView2.setOnFocusChangeListener(new a(this, textView2));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity$g.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LoginM3uActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity$g.class */
    public class AsyncTaskC2839g extends AsyncTask<String, String, Boolean> {

        /* renamed from: a */
        public final LoginM3uActivity f17673a;

        public AsyncTaskC2839g(LoginM3uActivity loginM3uActivity) {
            this.f17673a = loginM3uActivity;
        }

        public /* synthetic */ AsyncTaskC2839g(LoginM3uActivity loginM3uActivity, ViewOnClickListenerC2833a viewOnClickListenerC2833a) {
            this(loginM3uActivity);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x011e A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:29:? A[LOOP:0: B:10:0x00da->B:29:?, LOOP_END, SYNTHETIC] */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Boolean doInBackground(java.lang.String... r5) {
            /*
                Method dump skipped, instructions count: 358
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.LoginM3uActivity.AsyncTaskC2839g.doInBackground(java.lang.String[]):java.lang.Boolean");
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            try {
                if (bool.booleanValue()) {
                    new AsyncTaskC2844l(this.f17673a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f17673a.f17637e.getFilesDir() + "/data_temp.txt");
                } else {
                    C5255e.m26205H();
                    C5255e.m26241k0(this.f17673a.f17637e, "Incorrect File/URL");
                }
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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity$h.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LoginM3uActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity$h.class */
    public class AsyncTaskC2840h extends AsyncTask<Void, Boolean, Boolean> {

        /* renamed from: a */
        public final LoginM3uActivity f17674a;

        public AsyncTaskC2840h(LoginM3uActivity loginM3uActivity) {
            this.f17674a = loginM3uActivity;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("http://www.google.com").openConnection();
                httpURLConnection.setRequestMethod(HttpHead.METHOD_NAME);
                httpURLConnection.setReadTimeout(EtherType.IEEE802_3_MAX_LENGTH);
                httpURLConnection.setConnectTimeout(EtherType.IEEE802_3_MAX_LENGTH);
                return Boolean.valueOf(httpURLConnection.getResponseCode() == 200);
            } catch (Exception e10) {
                Log.e("LOG_TAG", e10.toString());
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (bool.booleanValue()) {
                this.f17674a.m16042s0();
                return;
            }
            C5255e.m26205H();
            LoginM3uActivity loginM3uActivity = this.f17674a;
            DialogC2838f dialogC2838f = new DialogC2838f(loginM3uActivity, (Activity) loginM3uActivity.f17637e);
            dialogC2838f.setCancelable(false);
            dialogC2838f.show();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity$i.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LoginM3uActivity$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity$i.class */
    public class AsyncTaskC2841i extends AsyncTask<Void, Boolean, Boolean> {

        /* renamed from: a */
        public final LoginM3uActivity f17675a;

        public AsyncTaskC2841i(LoginM3uActivity loginM3uActivity) {
            this.f17675a = loginM3uActivity;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("http://www.google.com").openConnection();
                httpURLConnection.setRequestMethod(HttpHead.METHOD_NAME);
                httpURLConnection.setReadTimeout(EtherType.IEEE802_3_MAX_LENGTH);
                httpURLConnection.setConnectTimeout(EtherType.IEEE802_3_MAX_LENGTH);
                return Boolean.valueOf(httpURLConnection.getResponseCode() == 200);
            } catch (Exception e10) {
                Log.e("LOG_TAG", e10.toString());
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (bool.booleanValue()) {
                new AsyncTaskC2843k(this.f17675a, null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f17675a.f17638f);
                return;
            }
            C5255e.m26205H();
            LoginM3uActivity loginM3uActivity = this.f17675a;
            DialogC2838f dialogC2838f = new DialogC2838f(loginM3uActivity, (Activity) loginM3uActivity.f17637e);
            dialogC2838f.setCancelable(false);
            dialogC2838f.show();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            C5255e.m26236h0(this.f17675a);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LoginM3uActivity$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity$j.class */
    public class ViewOnFocusChangeListenerC2842j implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f17676b;

        /* renamed from: c */
        public final LoginM3uActivity f17677c;

        public ViewOnFocusChangeListenerC2842j(LoginM3uActivity loginM3uActivity, View view) {
            this.f17677c = loginM3uActivity;
            this.f17676b = view;
        }

        /* renamed from: a */
        public final void m16052a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17676b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m16053b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17676b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m16054c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17676b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            LoginM3uActivity loginM3uActivity;
            TextView textView;
            TextView textView2;
            int color;
            float f10 = 1.0f;
            if (!z10) {
                if (z10) {
                    return;
                }
                if (z10) {
                    f10 = 1.09f;
                }
                m16053b(f10);
                m16054c(f10);
                m16052a(z10);
                View view2 = this.f17676b;
                if (view2 != null && view2.getTag() != null && this.f17676b.getTag().equals("3")) {
                    view.setBackgroundResource(2131231575);
                    return;
                }
                View view3 = this.f17676b;
                if (view3 == null || view3.getTag() == null || !this.f17676b.getTag().equals("rl_add_user")) {
                    View view4 = this.f17676b;
                    if (view4 == null || view4.getTag() == null || !this.f17676b.getTag().equals("rl_list_users")) {
                        return;
                    }
                    this.f17677c.rl_list_users.setBackgroundResource(2131231558);
                    this.f17677c.iv_list_users.setImageResource(2131231564);
                    loginM3uActivity = this.f17677c;
                    textView = loginM3uActivity.tv_list_users;
                } else {
                    this.f17677c.rl_add_user.setBackgroundResource(2131231558);
                    this.f17677c.iv_add_user.setImageResource(2131230811);
                    loginM3uActivity = this.f17677c;
                    textView = loginM3uActivity.tv_add_user;
                }
                textView.setTextColor(loginM3uActivity.f17637e.getResources().getColor(2131099723));
                return;
            }
            if (z10) {
                f10 = 1.1f;
            }
            try {
                m16053b(f10);
                m16054c(f10);
                View view5 = this.f17676b;
                if (view5 != null && view5.getTag() != null && this.f17676b.getTag().equals("3")) {
                    m16053b(f10);
                    m16054c(f10);
                    view.setBackgroundResource(2131230846);
                    return;
                }
                View view6 = this.f17676b;
                if (view6 == null || view6.getTag() == null || !this.f17676b.getTag().equals("rl_add_user")) {
                    View view7 = this.f17676b;
                    if (view7 == null || view7.getTag() == null || !this.f17676b.getTag().equals("rl_list_users")) {
                        return;
                    }
                    this.f17677c.rl_list_users.setBackgroundResource(2131231557);
                    this.f17677c.iv_list_users.setImageResource(2131231563);
                    LoginM3uActivity loginM3uActivity2 = this.f17677c;
                    textView2 = loginM3uActivity2.tv_list_users;
                    color = loginM3uActivity2.f17637e.getResources().getColor(2131100158);
                } else {
                    this.f17677c.rl_add_user.setBackgroundResource(2131231557);
                    this.f17677c.iv_add_user.setImageResource(2131230812);
                    LoginM3uActivity loginM3uActivity3 = this.f17677c;
                    textView2 = loginM3uActivity3.tv_add_user;
                    color = loginM3uActivity3.f17637e.getResources().getColor(2131100158);
                }
                textView2.setTextColor(color);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity$k.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LoginM3uActivity$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity$k.class */
    public class AsyncTaskC2843k extends AsyncTask<String, Void, Boolean> {

        /* renamed from: a */
        public final LoginM3uActivity f17678a;

        public AsyncTaskC2843k(LoginM3uActivity loginM3uActivity) {
            this.f17678a = loginM3uActivity;
        }

        public /* synthetic */ AsyncTaskC2843k(LoginM3uActivity loginM3uActivity, ViewOnClickListenerC2833a viewOnClickListenerC2833a) {
            this(loginM3uActivity);
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                boolean z10 = false;
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strArr[0]).openConnection();
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(30000);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200 || responseCode == 405 || responseCode == 404) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            } catch (Exception e10) {
                Log.e("Google", e10.toString());
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (bool.booleanValue()) {
                new AsyncTaskC2839g(this.f17678a, null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f17678a.f17638f);
            } else {
                C5255e.m26205H();
                C5255e.m26241k0(this.f17678a.f17637e, this.f17678a.f17637e.getResources().getString(2132017796));
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity$l.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LoginM3uActivity$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity$l.class */
    public class AsyncTaskC2844l extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        public final LoginM3uActivity f17679a;

        public AsyncTaskC2844l(LoginM3uActivity loginM3uActivity) {
            this.f17679a = loginM3uActivity;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            try {
                this.f17679a.f17636d = new FileInputStream(new File(strArr[0]));
                LoginM3uActivity loginM3uActivity = this.f17679a;
                return loginM3uActivity.f17655w.m37277c(loginM3uActivity.f17636d, loginM3uActivity.f17637e);
            } catch (Exception e10) {
                return "";
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            try {
                if (str.equals("")) {
                    C5255e.m26205H();
                    Toast.makeText(this.f17679a.f17637e, this.f17679a.f17637e.getResources().getString(2132018729), 1).show();
                } else {
                    this.f17679a.f17630M = str;
                    if (C5251a.f30014M.booleanValue()) {
                        this.f17679a.m16029H0();
                    } else if (this.f17679a.f17632O == null || !this.f17679a.f17632O.equals("url")) {
                        new AsyncTaskC2840h(this.f17679a).execute(new Void[0]);
                    } else {
                        this.f17679a.m16042s0();
                    }
                }
            } catch (Exception e10) {
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (this.f17679a.f17632O == null || !this.f17679a.f17632O.equals("url")) {
                C5255e.m26236h0(this.f17679a);
            }
        }
    }

    static {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        f17615S = externalStorageDirectory;
        f17616T = new File(externalStorageDirectory.getPath() + "/IPTVSmartersM3u");
    }

    /* renamed from: J0 */
    public static String m16020J0(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (char c10 : charArray) {
            if (z10 && Character.isLetter(c10)) {
                sb2.append(Character.toUpperCase(c10));
                z10 = false;
            } else {
                if (Character.isWhitespace(c10)) {
                    z10 = true;
                }
                sb2.append(c10);
            }
        }
        return sb2.toString();
    }

    /* renamed from: P0 */
    public static String m16021P0() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return m16020J0(str2);
        }
        return m16020J0(str) + " " + str2;
    }

    /* renamed from: S0 */
    public static String m16022S0(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : digest) {
                String hexString = Integer.toHexString(b10 & 255);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb2.append(hexString);
            }
            return sb2.toString();
        } catch (NoSuchAlgorithmException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    @Override // p407xe.InterfaceC9741c
    /* renamed from: E */
    public void mo15570E(int i10) {
        String string;
        boolean z10;
        C5255e.m26205H();
        try {
            if (C5251a.f30034d.booleanValue()) {
                String m41039a = C9744f.m41039a(this);
                this.f17621D = m41039a;
                if (m41039a != null && !m41039a.equals("") && !this.f17621D.isEmpty()) {
                    this.f17631N = new ArrayList<>(Arrays.asList(this.f17621D.split(",")));
                }
                ArrayList<String> arrayList = this.f17631N;
                if (arrayList == null || arrayList.size() < 1) {
                    string = this.f17637e.getResources().getString(2132018343);
                } else {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= this.f17631N.size()) {
                            z10 = false;
                            break;
                        }
                        String str = this.f17630M;
                        if (str != null && str.contains(this.f17631N.get(i11))) {
                            m16029H0();
                            z10 = true;
                            break;
                        }
                        i11++;
                    }
                    if (z10) {
                        return;
                    }
                    C5255e.m26205H();
                    string = this.f17637e.getResources().getString(2132017784);
                }
            } else {
                String str2 = this.f17630M;
                if (str2 != null && str2.contains(C9744f.m41039a(this))) {
                    m16029H0();
                    return;
                } else {
                    C5255e.m26205H();
                    string = this.f17637e.getResources().getString(2132018343);
                }
            }
            Toast.makeText(this, string, 0).show();
        } catch (Exception e10) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0449 A[Catch: Exception -> 0x05be, TRY_ENTER, TryCatch #0 {Exception -> 0x05be, blocks: (B:2:0x0000, B:4:0x0043, B:6:0x004e, B:8:0x0065, B:9:0x008b, B:11:0x0154, B:13:0x016a, B:15:0x017e, B:17:0x0188, B:19:0x01a2, B:21:0x01b9, B:23:0x01d3, B:25:0x01e8, B:27:0x0202, B:29:0x0218, B:31:0x0232, B:33:0x0249, B:34:0x0262, B:34:0x0262, B:35:0x0265, B:37:0x027d, B:39:0x0288, B:41:0x02a5, B:43:0x02d3, B:45:0x032c, B:47:0x035a, B:48:0x0437, B:50:0x0449, B:52:0x0489, B:54:0x0499, B:56:0x04a1, B:59:0x04c6, B:61:0x04cc, B:63:0x04ee, B:69:0x04b1, B:71:0x04b7, B:73:0x04f7, B:75:0x04ff, B:77:0x050d, B:79:0x0532, B:81:0x053e, B:82:0x0561, B:83:0x0584, B:85:0x058c, B:87:0x059a, B:91:0x0364, B:93:0x0381, B:95:0x03ae, B:97:0x0407, B:98:0x0073), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0499 A[Catch: Exception -> 0x05be, TRY_ENTER, TryCatch #0 {Exception -> 0x05be, blocks: (B:2:0x0000, B:4:0x0043, B:6:0x004e, B:8:0x0065, B:9:0x008b, B:11:0x0154, B:13:0x016a, B:15:0x017e, B:17:0x0188, B:19:0x01a2, B:21:0x01b9, B:23:0x01d3, B:25:0x01e8, B:27:0x0202, B:29:0x0218, B:31:0x0232, B:33:0x0249, B:34:0x0262, B:34:0x0262, B:35:0x0265, B:37:0x027d, B:39:0x0288, B:41:0x02a5, B:43:0x02d3, B:45:0x032c, B:47:0x035a, B:48:0x0437, B:50:0x0449, B:52:0x0489, B:54:0x0499, B:56:0x04a1, B:59:0x04c6, B:61:0x04cc, B:63:0x04ee, B:69:0x04b1, B:71:0x04b7, B:73:0x04f7, B:75:0x04ff, B:77:0x050d, B:79:0x0532, B:81:0x053e, B:82:0x0561, B:83:0x0584, B:85:0x058c, B:87:0x059a, B:91:0x0364, B:93:0x0381, B:95:0x03ae, B:97:0x0407, B:98:0x0073), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x05bd A[ORIG_RETURN, RETURN] */
    /* renamed from: H0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m16029H0() {
        /*
            Method dump skipped, instructions count: 1475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.LoginM3uActivity.m16029H0():void");
    }

    /* renamed from: I0 */
    public void m16030I0() {
        try {
            this.f17619B = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: K0 */
    public final void m16031K0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: L0 */
    public boolean m16032L0() {
        return this.f17637e.getSharedPreferences("automation_channels", 0).getString("automation_channels", "").equals("checked");
    }

    /* renamed from: M0 */
    public boolean m16033M0() {
        TextView textView;
        String string;
        if (C5251a.f30034d.booleanValue()) {
            if (this.etName.getText().toString().trim().length() == 0) {
                this.etName.requestFocus();
                textView = this.etName;
                string = getResources().getString(2132017638);
                textView.setError(string);
                return false;
            }
            if (this.etM3uLineFile.getText().toString().trim().length() != 0) {
                return true;
            }
        } else if (this.etM3uLineFile.getText().toString().trim().length() != 0) {
            return true;
        }
        this.tv_browse_error.setVisibility(0);
        this.tv_browse_error.requestFocus();
        textView = this.tv_browse_error;
        string = this.f17637e.getResources().getString(2132017466);
        textView.setError(string);
        return false;
    }

    /* renamed from: N0 */
    public boolean m16034N0() {
        EditText editText;
        String string;
        if (C5251a.f30034d.booleanValue()) {
            if (this.etName.getText().toString().trim().length() == 0) {
                this.etName.requestFocus();
                editText = this.etName;
                string = getResources().getString(2132017638);
                editText.setError(string);
                return false;
            }
            if (this.etM3uLine.getText().toString().trim().length() != 0) {
                return true;
            }
        } else if (this.etM3uLine.getText().toString().trim().length() != 0) {
            return true;
        }
        this.etM3uLine.requestFocus();
        editText = this.etM3uLine;
        string = getResources().getString(2132017644);
        editText.setError(string);
        return false;
    }

    /* renamed from: O0 */
    public void m16035O0() {
        C1083g c1083g = new C1083g(this.f17637e, new C2835c(this, new String[]{""}));
        if (Build.VERSION.SDK_INT >= 30) {
            c1083g.m6463v("");
        } else {
            c1083g.m6462u("");
        }
    }

    /* renamed from: Q0 */
    public final void m16036Q0() {
        try {
            this.f17642j = new MultiUserDBHandler(this.f17637e);
            this.f17641i = new LiveStreamDBHandler(this.f17637e);
            this.f17643k = new DatabaseHandler(this.f17637e);
            C9745g.f44477c = new C9745g(this);
            SharedPreferences sharedPreferences = getSharedPreferences("loginPrefsserverurl", 0);
            this.f17625H = sharedPreferences;
            this.f17626I = sharedPreferences.edit();
            SharedPreferences sharedPreferences2 = getSharedPreferences("sharedPreference", 0);
            this.f17628K = sharedPreferences2;
            this.f17627J = sharedPreferences2.edit();
            this.f17629L = getSharedPreferences("loginPrefs", 0);
            this.f17654v = (RadioGroup) findViewById(2131428935);
            if (C5251a.f30034d.booleanValue()) {
                this.rl_playlist_name.setVisibility(0);
                this.etName.requestFocus();
                this.rl_list_users.setVisibility(0);
            } else {
                this.rl_playlist_name.setVisibility(8);
                this.rbFile.requestFocus();
                this.rl_list_users.setVisibility(4);
                this.tv_add_user.setText(getResources().getString(2132017984));
            }
            this.f17644l = this.f17637e.getSharedPreferences("allowedFormat", 0);
            Button button = this.bt_browse;
            button.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2842j(this, button));
            RelativeLayout relativeLayout = this.rl_add_user;
            relativeLayout.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2842j(this, relativeLayout));
            RelativeLayout relativeLayout2 = this.rl_list_users;
            relativeLayout2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2842j(this, relativeLayout2));
            this.vpn_button.setOnClickListener(new ViewOnClickListenerC2833a(this));
            this.rl_list_users.setOnClickListener(new ViewOnClickListenerC2834b(this));
        } catch (Resources.NotFoundException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: R0 */
    public void m16037R0() {
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

    @Override // p407xe.InterfaceC9741c
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public void mo15571Y(String str, int i10, boolean z10) {
        Toast makeText;
        boolean z11;
        if (z10 && i10 == 1) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                C9740b.f44453a = jSONObject;
                if (jSONObject.getString("status").equalsIgnoreCase("true")) {
                    this.f17621D = C9740b.f44453a.getString("su");
                    this.f17622E = C9740b.f44453a.getString("ndd");
                    this.f17623F = System.currentTimeMillis();
                    C9744f.m41043e(this, C9740b.f44453a.optString("su"));
                    this.f17624G = m16022S0(C9740b.f44453a.optString("su") + Marker.ANY_MARKER + C9744f.m41042d(this) + Marker.ANY_MARKER + C9740b.f44454b);
                    C9740b.f44453a.getString("sc").equalsIgnoreCase(this.f17624G);
                    if (C5251a.f30034d.booleanValue()) {
                        String str2 = this.f17621D;
                        if (str2 != null && !str2.equals("") && !this.f17621D.isEmpty()) {
                            this.f17631N = new ArrayList<>(Arrays.asList(this.f17621D.split(",")));
                        }
                        ArrayList<String> arrayList = this.f17631N;
                        if (arrayList == null || arrayList.size() < 1) {
                            makeText = Toast.makeText(this, this.f17637e.getResources().getString(2132018343), 0);
                        } else {
                            int i11 = 0;
                            while (true) {
                                if (i11 >= this.f17631N.size()) {
                                    z11 = false;
                                    break;
                                }
                                String str3 = this.f17630M;
                                if (str3 != null && str3.contains(this.f17631N.get(i11))) {
                                    m16029H0();
                                    z11 = true;
                                    break;
                                }
                                i11++;
                            }
                            if (z11) {
                                return;
                            }
                            C5255e.m26205H();
                            makeText = Toast.makeText(this, this.f17637e.getResources().getString(2132017784), 0);
                        }
                    } else {
                        String str4 = this.f17630M;
                        if (str4 != null && str4.contains(C9744f.m41039a(this))) {
                            m16029H0();
                            return;
                        } else {
                            C5255e.m26205H();
                            makeText = Toast.makeText(this, this.f17637e.getResources().getString(2132017877), 0);
                        }
                    }
                    makeText.show();
                }
            } catch (Exception e10) {
                Log.e("Login check", e10.getMessage());
            }
        }
    }

    /* renamed from: V0 */
    public final void m16039V0(Intent intent) {
        String str;
        Cursor cursor;
        if (intent == null || Build.VERSION.SDK_INT < 23) {
            return;
        }
        try {
            this.f17635R = intent.getData();
            if ((getContentResolver() == null || getContentResolver().getType(this.f17635R) == null || !Objects.equals(getContentResolver().getType(this.f17635R), "audio/mpegurl")) && (getContentResolver() == null || getContentResolver().getType(this.f17635R) == null || !Objects.equals(getContentResolver().getType(this.f17635R), "audio/x-mpegurl"))) {
                Toast.makeText(this, this.f17637e.getResources().getString(2132017784), 0).show();
                str = "";
            } else {
                str = "";
                if (DocumentsContract.isDocumentUri(this.f17637e.getApplicationContext(), this.f17635R)) {
                    if (C9174b.m38609c(this.f17635R)) {
                        Uri uri = this.f17635R;
                        str = "";
                        if (uri != null) {
                            str = "";
                            if (uri.getPath() != null) {
                                str = "";
                                if (this.f17635R.getPathSegments() != null) {
                                    str = "";
                                    if (this.f17635R.getPathSegments().size() >= 2) {
                                        String[] split = this.f17635R.getPathSegments().get(1).split(":");
                                        String str2 = split[0];
                                        if (str2.contains("primary")) {
                                            str = Environment.getExternalStorageDirectory() + "/" + split[1];
                                        } else if (str2.contains("raw")) {
                                            str = split[1];
                                        } else {
                                            str = "/storage/" + str2 + "/" + split[1];
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        str = "";
                        if (C9174b.m38608b(this.f17635R)) {
                            try {
                                Cursor query = this.f17637e.getContentResolver().query(this.f17635R, new String[]{"_display_name"}, null, null, null);
                                String str3 = "";
                                if (query != null) {
                                    str3 = "";
                                    try {
                                        if (query.moveToFirst()) {
                                            str3 = Environment.getExternalStorageDirectory().toString() + "/Download/" + query.getString(0);
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        cursor = query;
                                        throw th;
                                    }
                                }
                                str = str3;
                                if (query != null) {
                                    query.close();
                                    str = str3;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                cursor = null;
                            }
                        }
                    }
                }
                if (str.length() == 0) {
                    Cursor cursor2 = null;
                    try {
                        Cursor query2 = this.f17637e.getContentResolver().query(this.f17635R, new String[]{"_data"}, null, null, null);
                        int columnIndexOrThrow = query2.getColumnIndexOrThrow("_data");
                        query2.moveToFirst();
                        cursor2 = query2;
                        String string = query2.getString(columnIndexOrThrow);
                        query2.close();
                        str = string;
                    } finally {
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                    }
                }
            }
            this.etM3uLineFile.setText(str);
            this.tv_browse_error.setVisibility(8);
            this.tv_file_path.setVisibility(0);
            this.tv_file_path.setText(str);
        } catch (Exception e10) {
            Log.e("EditProfile>>>", "Execpetion >>>" + e10);
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 101) {
            try {
                m16037R0();
            } catch (Exception e10) {
            }
        } else if (i10 == 201) {
            m16039V0(intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(2130772003, 2130772000);
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    @SuppressLint({"RtlHardcoded"})
    public void onCreate(Bundle bundle) {
        this.f17637e = this;
        super.onCreate(bundle);
        C6783a c6783a = new C6783a(this.f17637e);
        f17617U = c6783a;
        String m31288z = c6783a.m31288z();
        this.f17633P = m31288z;
        setContentView(m31288z.equals(C5251a.f30065s0) ? 2131624011 : 2131624010);
        ButterKnife.m5626a(this);
        m16037R0();
        m16036Q0();
        if (C5251a.f30014M.booleanValue()) {
            return;
        }
        m16030I0();
        m16040q0();
        m16021P0();
        m16041r0();
        m16031K0();
    }

    public void onRadioButtonClicked(View view) {
        boolean isChecked = ((RadioButton) view).isChecked();
        int id2 = view.getId();
        if (id2 == 2131428901) {
            if (isChecked) {
                this.tv_file_path.setVisibility(0);
                this.bt_browse.setVisibility(0);
                this.etM3uLine.setVisibility(8);
                this.tv_browse_error.setVisibility(8);
                return;
            }
            return;
        }
        if (id2 == 2131428904 && isChecked) {
            this.tv_file_path.setVisibility(8);
            this.bt_browse.setVisibility(8);
            this.tv_browse_error.setVisibility(8);
            this.etM3uLine.setVisibility(0);
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 != 101) {
            return;
        }
        try {
            if (iArr.length > 0 && iArr[0] == 0 && iArr[1] == 0) {
                m16037R0();
            } else if (Build.VERSION.SDK_INT < 23 || shouldShowRequestPermissionRationale(strArr[0])) {
                onBackPressed();
            } else {
                DialogC0242a.a aVar = new DialogC0242a.a(this, 2132082693);
                View inflate = LayoutInflater.from(this).inflate(2131624461, (ViewGroup) null);
                Button button = (Button) inflate.findViewById(2131427646);
                Button button2 = (Button) inflate.findViewById(2131427636);
                button.setOnFocusChangeListener(new C5255e.i(button, this));
                button2.setOnFocusChangeListener(new C5255e.i(button2, this));
                button.requestFocus();
                button.setOnClickListener(new ViewOnClickListenerC2836d(this));
                button2.setOnClickListener(new ViewOnClickListenerC2837e(this));
                aVar.setView(inflate);
                this.f17634Q = aVar.create();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = this.f17634Q.getWindow();
                Objects.requireNonNull(window);
                Window window2 = window;
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = -1;
                layoutParams.height = -2;
                this.f17634Q.show();
                this.f17634Q.getWindow().setAttributes(layoutParams);
                this.f17634Q.setCancelable(false);
                this.f17634Q.show();
            }
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        C5255e.m26233f(this.f17637e);
    }

    @OnClick
    public void onViewClicked(View view) {
        int id2 = view.getId();
        if (id2 == 2131427599) {
            try {
                if (!this.f17633P.equals(C5251a.f30065s0)) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 23) {
                        Intent intent = new Intent();
                        intent.setType((i10 == 23 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 27 || i10 == 28) ? "audio/mpegurl" : (i10 == 29 || i10 == 30) ? "audio/x-mpegurl" : "audio/*");
                        intent.setAction("android.intent.action.GET_CONTENT");
                        startActivityForResult(Intent.createChooser(intent, "Select File"), 201);
                        return;
                    }
                }
                m16035O0();
                return;
            } catch (Exception e10) {
                return;
            }
        }
        if (id2 != 2131428947) {
            return;
        }
        int checkedRadioButtonId = this.f17654v.getCheckedRadioButtonId();
        if (checkedRadioButtonId == 2131428901 && m16033M0()) {
            this.f17640h = this.etName.getText().toString().trim();
            this.f17639g = this.etM3uLineFile.getText().toString().trim();
            this.f17632O = TransferTable.COLUMN_FILE;
            new AsyncTaskC2844l(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f17639g);
        }
        if (checkedRadioButtonId == 2131428904 && m16034N0()) {
            this.f17638f = this.etM3uLine.getText().toString().trim();
            this.f17640h = this.etName.getText().toString().trim();
            this.f17632O = "url";
            new AsyncTaskC2841i(this).execute(new Void[0]);
        }
    }

    /* renamed from: q0 */
    public void m16040q0() {
        this.f17618A = Build.VERSION.RELEASE + " " + Build.VERSION_CODES.class.getFields()[Build.VERSION.SDK_INT].getName();
    }

    /* renamed from: r0 */
    public void m16041r0() {
        int nextInt = new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS;
        this.f17620C = nextInt;
        C9740b.f44454b = String.valueOf(nextInt);
    }

    /* renamed from: s0 */
    public void m16042s0() {
        this.f17658z = m16022S0(C9744f.m41041c(this) + Marker.ANY_MARKER + C9744f.m41042d(this) + "-playlist-" + C9740b.f44454b + "-" + this.f17619B + "-unknown-" + m16021P0() + "-" + this.f17618A);
        ArrayList arrayList = new ArrayList();
        C9745g.f44476b = arrayList;
        arrayList.add(C9745g.m41047a("m", "gu"));
        C9745g.f44476b.add(C9745g.m41047a("k", C9744f.m41041c(this)));
        C9745g.f44476b.add(C9745g.m41047a("sc", this.f17658z));
        C9745g.f44476b.add(C9745g.m41047a("u", "playlist"));
        C9745g.f44476b.add(C9745g.m41047a("pw", "no_password"));
        C9745g.f44476b.add(C9745g.m41047a("r", C9740b.f44454b));
        C9745g.f44476b.add(C9745g.m41047a("av", this.f17619B));
        C9745g.f44476b.add(C9745g.m41047a("dt", "unknown"));
        C9745g.f44476b.add(C9745g.m41047a("d", m16021P0()));
        C9745g.f44476b.add(C9745g.m41047a("do", this.f17618A));
        C9745g.f44477c.m41048b(this);
    }
}

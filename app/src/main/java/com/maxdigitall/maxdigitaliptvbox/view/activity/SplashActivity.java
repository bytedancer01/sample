package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;
import androidx.appcompat.app.ActivityC0243b;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferTable;
import com.amazonaws.services.p045s3.internal.Constants;
import com.maxdigitall.maxdigitaliptvbox.miscelleneious.StopProcessingTasksService;
import com.maxdigitall.maxdigitaliptvbox.model.MultiUserDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.callback.LoginCallback;
import com.maxdigitall.maxdigitaliptvbox.model.database.ImportStatusModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.MultiUserDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
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
import p170jf.C5371c;
import p324sf.InterfaceC8567f;
import p407xe.C9740b;
import p407xe.C9743e;
import p407xe.C9744f;
import p407xe.C9745g;
import p407xe.InterfaceC9741c;
import tf.C8724a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SplashActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SplashActivity.class */
public class SplashActivity extends ActivityC0243b implements InterfaceC8567f, InterfaceC9741c<String> {

    /* renamed from: A */
    public SharedPreferences f18853A;

    /* renamed from: B */
    public SharedPreferences.Editor f18854B;

    /* renamed from: C */
    public SharedPreferences.Editor f18855C;

    /* renamed from: D */
    public SharedPreferences.Editor f18856D;

    /* renamed from: E */
    public SharedPreferences f18857E;

    /* renamed from: F */
    public SharedPreferences f18858F;

    /* renamed from: G */
    public SharedPreferences f18859G;

    /* renamed from: H */
    public SharedPreferences f18860H;

    /* renamed from: I */
    public SharedPreferences f18861I;

    /* renamed from: J */
    public SharedPreferences.Editor f18862J;

    /* renamed from: K */
    public SharedPreferences.Editor f18863K;

    /* renamed from: L */
    public SharedPreferences.Editor f18864L;

    /* renamed from: M */
    public SharedPreferences.Editor f18865M;

    /* renamed from: N */
    public SharedPreferences.Editor f18866N;

    /* renamed from: O */
    public SharedPreferences f18867O;

    /* renamed from: P */
    public SharedPreferences.Editor f18868P;

    /* renamed from: Q */
    public LiveStreamDBHandler f18869Q;

    /* renamed from: R */
    public SharedPreferences f18870R;

    /* renamed from: T */
    public String f18872T;

    /* renamed from: U */
    public String f18873U;

    /* renamed from: V */
    public String f18874V;

    /* renamed from: X */
    public C5371c f18876X;

    /* renamed from: Y */
    public InputStream f18877Y;

    /* renamed from: d */
    public SharedPreferences f18879d;

    /* renamed from: e */
    public SharedPreferences f18880e;

    /* renamed from: f */
    public Context f18881f;

    /* renamed from: f0 */
    public String f18882f0;

    /* renamed from: g */
    public MultiUserDBHandler f18883g;

    /* renamed from: g0 */
    public LinearLayout f18884g0;

    /* renamed from: h */
    public SharedPreferences f18885h;

    /* renamed from: k */
    public ImageView f18888k;

    /* renamed from: l */
    public ImageView f18889l;

    /* renamed from: n */
    public VideoView f18891n;

    /* renamed from: o */
    public C6783a f18892o;

    /* renamed from: p */
    public String f18893p;

    /* renamed from: q */
    public String f18894q;

    /* renamed from: r */
    public String f18895r;

    /* renamed from: s */
    public int f18896s;

    /* renamed from: t */
    public String f18897t;

    /* renamed from: u */
    public String f18898u;

    /* renamed from: y */
    public Boolean f18902y;

    /* renamed from: z */
    public SharedPreferences f18903z;

    /* renamed from: i */
    public Boolean f18886i = Boolean.FALSE;

    /* renamed from: j */
    public String f18887j = "";

    /* renamed from: m */
    public int f18890m = 0;

    /* renamed from: v */
    public String f18899v = "";

    /* renamed from: w */
    public String f18900w = "";

    /* renamed from: x */
    public long f18901x = -1;

    /* renamed from: S */
    public ArrayList<String> f18871S = new ArrayList<>();

    /* renamed from: W */
    public int f18875W = EtherType.IEEE802_3_MAX_LENGTH;

    /* renamed from: Z */
    public final C8724a f18878Z = new C8724a();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SplashActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SplashActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SplashActivity$a.class */
    public class C3165a implements MediaPlayer.OnCompletionListener {

        /* renamed from: a */
        public final SplashActivity f18904a;

        public C3165a(SplashActivity splashActivity) {
            this.f18904a = splashActivity;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            this.f18904a.f18875W = 0;
            this.f18904a.m16682J0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SplashActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SplashActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SplashActivity$b.class */
    public class C3166b implements MediaPlayer.OnPreparedListener {

        /* renamed from: a */
        public final SplashActivity f18905a;

        public C3166b(SplashActivity splashActivity) {
            this.f18905a = splashActivity;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            SplashActivity splashActivity = this.f18905a;
            splashActivity.f18891n.seekTo(splashActivity.f18890m);
            SplashActivity splashActivity2 = this.f18905a;
            int i10 = splashActivity2.f18890m;
            VideoView videoView = splashActivity2.f18891n;
            if (i10 == 0) {
                videoView.start();
            } else {
                videoView.pause();
                this.f18905a.m16682J0();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SplashActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SplashActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SplashActivity$c.class */
    public class RunnableC3167c implements Runnable {

        /* renamed from: b */
        public final SplashActivity f18906b;

        public RunnableC3167c(SplashActivity splashActivity) {
            this.f18906b = splashActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18906b.m16683K0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SplashActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SplashActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SplashActivity$d.class */
    public class RunnableC3168d implements Runnable {

        /* renamed from: b */
        public final SplashActivity f18907b;

        public RunnableC3168d(SplashActivity splashActivity) {
            this.f18907b = splashActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18907b.m16683K0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SplashActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SplashActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SplashActivity$e.class */
    public class RunnableC3169e implements Runnable {

        /* renamed from: b */
        public final SplashActivity f18908b;

        public RunnableC3169e(SplashActivity splashActivity) {
            this.f18908b = splashActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18908b.m16683K0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SplashActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SplashActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SplashActivity$f.class */
    public class DialogC3170f extends Dialog implements View.OnClickListener {

        /* renamed from: b */
        public Activity f18909b;

        /* renamed from: c */
        public TextView f18910c;

        /* renamed from: d */
        public TextView f18911d;

        /* renamed from: e */
        public LinearLayout f18912e;

        /* renamed from: f */
        public LinearLayout f18913f;

        /* renamed from: g */
        public final SplashActivity f18914g;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SplashActivity$f$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SplashActivity$f$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SplashActivity$f$a.class */
        public class a implements View.OnFocusChangeListener {

            /* renamed from: b */
            public View f18915b;

            /* renamed from: c */
            public final DialogC3170f f18916c;

            public a(DialogC3170f dialogC3170f, View view) {
                this.f18916c = dialogC3170f;
                this.f18915b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z10) {
                int i10;
                LinearLayout linearLayout;
                if (z10) {
                    View view2 = this.f18915b;
                    i10 = 2131230846;
                    if (view2 == null || view2.getTag() == null || !this.f18915b.getTag().equals("1")) {
                        View view3 = this.f18915b;
                        if (view3 == null || view3.getTag() == null || !this.f18915b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f18916c.f18913f;
                    }
                    linearLayout = this.f18916c.f18912e;
                } else {
                    View view4 = this.f18915b;
                    i10 = 2131230845;
                    if (view4 == null || view4.getTag() == null || !this.f18915b.getTag().equals("1")) {
                        View view5 = this.f18915b;
                        if (view5 == null || view5.getTag() == null || !this.f18915b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f18916c.f18913f;
                    }
                    linearLayout = this.f18916c.f18912e;
                }
                linearLayout.setBackgroundResource(i10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogC3170f(SplashActivity splashActivity, Activity activity) {
            super(activity);
            this.f18914g = splashActivity;
            this.f18909b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id2 = view.getId();
            try {
                if (id2 == 2131427639) {
                    dismiss();
                    this.f18914g.finishAffinity();
                } else {
                    if (id2 != 2131427678) {
                        return;
                    }
                    dismiss();
                    new AsyncTaskC3172h(this.f18914g).execute(new Void[0]);
                }
            } catch (Exception e10) {
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(this.f18914g.f18892o.m31288z().equals(C5251a.f30065s0) ? 2131624141 : 2131624140);
            this.f18910c = (TextView) findViewById(2131427678);
            this.f18911d = (TextView) findViewById(2131427639);
            this.f18912e = (LinearLayout) findViewById(2131428541);
            this.f18913f = (LinearLayout) findViewById(2131428448);
            this.f18910c.setOnClickListener(this);
            this.f18911d.setOnClickListener(this);
            TextView textView = this.f18910c;
            textView.setOnFocusChangeListener(new a(this, textView));
            TextView textView2 = this.f18911d;
            textView2.setOnFocusChangeListener(new a(this, textView2));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SplashActivity$g.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SplashActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SplashActivity$g.class */
    public class AsyncTaskC3171g extends AsyncTask<String, String, Boolean> {

        /* renamed from: a */
        public final SplashActivity f18917a;

        public AsyncTaskC3171g(SplashActivity splashActivity) {
            this.f18917a = splashActivity;
        }

        public /* synthetic */ AsyncTaskC3171g(SplashActivity splashActivity, C3165a c3165a) {
            this(splashActivity);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0125 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:29:? A[LOOP:0: B:10:0x00e1->B:29:?, LOOP_END, SYNTHETIC] */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Boolean doInBackground(java.lang.String... r5) {
            /*
                Method dump skipped, instructions count: 365
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.SplashActivity.AsyncTaskC3171g.doInBackground(java.lang.String[]):java.lang.Boolean");
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            try {
                if (bool.booleanValue()) {
                    this.f18917a.m16691s0();
                    return;
                }
                Context context = this.f18917a.f18881f;
                C5255e.m26241k0(context, context.getResources().getString(2132017796));
                this.f18917a.startActivity(C5251a.f30032c.booleanValue() ? new Intent(this.f18917a, (Class<?>) MultiUserActivity.class) : new Intent(this.f18917a, (Class<?>) RoutingActivity.class));
                this.f18917a.overridePendingTransition(2130772003, 2130772000);
                this.f18917a.finish();
            } catch (Exception e10) {
                Context context2 = this.f18917a.f18881f;
                C5255e.m26241k0(context2, context2.getResources().getString(2132017796));
                this.f18917a.startActivity(C5251a.f30032c.booleanValue() ? new Intent(this.f18917a, (Class<?>) MultiUserActivity.class) : new Intent(this.f18917a, (Class<?>) RoutingActivity.class));
                this.f18917a.overridePendingTransition(2130772003, 2130772000);
                this.f18917a.finish();
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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SplashActivity$h.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SplashActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SplashActivity$h.class */
    public class AsyncTaskC3172h extends AsyncTask<Void, Boolean, Boolean> {

        /* renamed from: a */
        public final SplashActivity f18918a;

        public AsyncTaskC3172h(SplashActivity splashActivity) {
            this.f18918a = splashActivity;
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
                this.f18918a.m16691s0();
                return;
            }
            SplashActivity splashActivity = this.f18918a;
            DialogC3170f dialogC3170f = new DialogC3170f(splashActivity, (Activity) splashActivity.f18881f);
            dialogC3170f.setCancelable(false);
            dialogC3170f.show();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SplashActivity$i.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SplashActivity$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SplashActivity$i.class */
    public class AsyncTaskC3173i extends AsyncTask<Void, Boolean, Boolean> {

        /* renamed from: a */
        public final SplashActivity f18919a;

        public AsyncTaskC3173i(SplashActivity splashActivity) {
            this.f18919a = splashActivity;
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
                new AsyncTaskC3174j(this.f18919a, null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f18919a.f18874V);
                return;
            }
            SplashActivity splashActivity = this.f18919a;
            DialogC3170f dialogC3170f = new DialogC3170f(splashActivity, (Activity) splashActivity.f18881f);
            dialogC3170f.setCancelable(false);
            dialogC3170f.show();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SplashActivity$j.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SplashActivity$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SplashActivity$j.class */
    public class AsyncTaskC3174j extends AsyncTask<String, Void, Boolean> {

        /* renamed from: a */
        public final SplashActivity f18920a;

        public AsyncTaskC3174j(SplashActivity splashActivity) {
            this.f18920a = splashActivity;
        }

        public /* synthetic */ AsyncTaskC3174j(SplashActivity splashActivity, C3165a c3165a) {
            this(splashActivity);
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
                new AsyncTaskC3171g(this.f18920a, null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f18920a.f18874V);
                return;
            }
            Context context = this.f18920a.f18881f;
            C5255e.m26241k0(context, context.getResources().getString(2132017796));
            this.f18920a.startActivity(C5251a.f30032c.booleanValue() ? new Intent(this.f18920a, (Class<?>) MultiUserActivity.class) : new Intent(this.f18920a, (Class<?>) RoutingActivity.class));
            this.f18920a.overridePendingTransition(2130772003, 2130772000);
            this.f18920a.finish();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SplashActivity$k.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SplashActivity$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SplashActivity$k.class */
    public class AsyncTaskC3175k extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        public final SplashActivity f18921a;

        public AsyncTaskC3175k(SplashActivity splashActivity) {
            this.f18921a = splashActivity;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            try {
                this.f18921a.f18877Y = new FileInputStream(new File(strArr[0]));
                SplashActivity splashActivity = this.f18921a;
                return splashActivity.f18878Z.m37277c(splashActivity.f18877Y, this.f18921a.f18881f);
            } catch (Exception e10) {
                return "";
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            SplashActivity splashActivity;
            boolean z10;
            super.onPostExecute(str);
            try {
                if (str.equals("")) {
                    Context context = this.f18921a.f18881f;
                    Toast.makeText(context, context.getResources().getString(2132018730), 1).show();
                    this.f18921a.startActivity(new Intent(this.f18921a, (Class<?>) MultiUserActivity.class));
                    this.f18921a.overridePendingTransition(2130772003, 2130772000);
                    splashActivity = this.f18921a;
                } else {
                    this.f18921a.f18882f0 = str;
                    if (C5251a.f30034d.booleanValue()) {
                        SplashActivity splashActivity2 = this.f18921a;
                        splashActivity2.f18899v = C9744f.m41039a(splashActivity2.f18881f);
                        String str2 = this.f18921a.f18899v;
                        if (str2 != null && !str2.equals("") && !this.f18921a.f18899v.isEmpty()) {
                            this.f18921a.f18871S = new ArrayList<>(Arrays.asList(this.f18921a.f18899v.split(",")));
                        }
                        ArrayList<String> arrayList = this.f18921a.f18871S;
                        if (arrayList == null || arrayList.size() < 1) {
                            Context context2 = this.f18921a.f18881f;
                            Toast.makeText(context2, context2.getResources().getString(2132018343), 0).show();
                            this.f18921a.startActivity(C5251a.f30032c.booleanValue() ? new Intent(this.f18921a, (Class<?>) MultiUserActivity.class) : new Intent(this.f18921a, (Class<?>) RoutingActivity.class));
                            this.f18921a.overridePendingTransition(2130772003, 2130772000);
                            splashActivity = this.f18921a;
                        } else {
                            int i10 = 0;
                            while (true) {
                                if (i10 >= this.f18921a.f18871S.size()) {
                                    z10 = false;
                                    break;
                                } else {
                                    if (this.f18921a.f18882f0 != null && this.f18921a.f18882f0.contains(this.f18921a.f18871S.get(i10))) {
                                        this.f18921a.m16677C0();
                                        z10 = true;
                                        break;
                                    }
                                    i10++;
                                }
                            }
                            if (z10) {
                                return;
                            }
                            SplashActivity splashActivity3 = this.f18921a;
                            Toast.makeText(splashActivity3.f18881f, splashActivity3.getResources().getString(2132017877), 0).show();
                            this.f18921a.startActivity(new Intent(this.f18921a, (Class<?>) MultiUserActivity.class));
                            this.f18921a.overridePendingTransition(2130772003, 2130772000);
                            splashActivity = this.f18921a;
                        }
                    } else {
                        if (this.f18921a.f18882f0.contains(C9744f.m41039a(this.f18921a.f18881f))) {
                            this.f18921a.m16677C0();
                            return;
                        }
                        SplashActivity splashActivity4 = this.f18921a;
                        Toast.makeText(splashActivity4.f18881f, splashActivity4.getResources().getString(2132017877), 0).show();
                        this.f18921a.startActivity(new Intent(this.f18921a, (Class<?>) RoutingActivity.class));
                        this.f18921a.overridePendingTransition(2130772003, 2130772000);
                        splashActivity = this.f18921a;
                    }
                }
                splashActivity.finish();
            } catch (Exception e10) {
                Context context3 = this.f18921a.f18881f;
                Toast.makeText(context3, context3.getResources().getString(2132017796), 0).show();
                this.f18921a.startActivity(C5251a.f30032c.booleanValue() ? new Intent(this.f18921a, (Class<?>) MultiUserActivity.class) : new Intent(this.f18921a, (Class<?>) RoutingActivity.class));
                this.f18921a.overridePendingTransition(2130772003, 2130772000);
                this.f18921a.finish();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* renamed from: E0 */
    public static String m16668E0(String str) {
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

    /* renamed from: H0 */
    public static String m16669H0() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return m16668E0(str2);
        }
        return m16668E0(str) + " " + str2;
    }

    /* renamed from: M0 */
    public static String m16670M0(String str) {
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

    /* renamed from: C0 */
    public final void m16677C0() {
        Activity activity;
        try {
            if (this.f18869Q.m15177L1("m3u") == 0) {
                ArrayList<ImportStatusModel> arrayList = new ArrayList<>();
                ImportStatusModel importStatusModel = new ImportStatusModel();
                importStatusModel.m15145l("all");
                importStatusModel.m15143j("0");
                importStatusModel.m15140g("");
                arrayList.add(0, importStatusModel);
                this.f18869Q.m15228k2(arrayList, "m3u");
            }
            ImportStatusModel m15222h2 = this.f18869Q.m15222h2("all");
            if (m15222h2 != null) {
                if ((m15222h2.m15137d() == null || !m15222h2.m15137d().equals("0")) && (m15222h2.m15137d() == null || !m15222h2.m15137d().equals("2"))) {
                    if (m15222h2.m15137d() != null && m15222h2.m15137d().equals("1")) {
                        long m26250q = C5255e.m26250q(new SimpleDateFormat("dd/MM/yyyy", Locale.US), m15222h2.m15134a(), C5255e.m26235h());
                        if (!m16680G0() || m26250q < this.f18892o.m31269g()) {
                            this.f18881f.startActivity(new Intent(this.f18881f, (Class<?>) NewDashboardActivity.class));
                            activity = (Activity) this.f18881f;
                        } else {
                            this.f18881f.startActivity(new Intent(this.f18881f, (Class<?>) ImportM3uActivity.class));
                            activity = (Activity) this.f18881f;
                        }
                    } else {
                        if (m15222h2.m15137d() == null || !m15222h2.m15137d().equals("3")) {
                            return;
                        }
                        this.f18881f.startActivity(new Intent(this.f18881f, (Class<?>) ImportM3uActivity.class));
                        activity = (Activity) this.f18881f;
                    }
                } else {
                    if (this.f18881f == null) {
                        return;
                    }
                    this.f18881f.startActivity(new Intent(this.f18881f, (Class<?>) ImportM3uActivity.class));
                    activity = (Activity) this.f18881f;
                }
                activity.finish();
            }
        } catch (Exception e10) {
            Context context = this.f18881f;
            Toast.makeText(context, context.getResources().getString(2132017796), 0).show();
            startActivity(C5251a.f30032c.booleanValue() ? new Intent(this, (Class<?>) MultiUserActivity.class) : new Intent(this, (Class<?>) RoutingActivity.class));
            overridePendingTransition(2130772003, 2130772000);
            finish();
        }
    }

    @Override // p324sf.InterfaceC8567f
    /* renamed from: D */
    public void mo15980D(LoginCallback loginCallback, String str, ArrayList<String> arrayList) {
        Intent intent;
        try {
            if (loginCallback.m15009b() == null || loginCallback.m15008a() == null) {
                if (arrayList == null || arrayList.size() <= 0) {
                    intent = new Intent(this, (Class<?>) MultiUserActivity.class);
                    startActivity(intent);
                    finish();
                    C5255e.m26241k0(this.f18881f, "Your Account is invalid or has expired !");
                    return;
                }
                this.f18854B.putString(C5251a.f30066t, arrayList.get(0).trim());
                this.f18854B.apply();
                arrayList.remove(0);
                this.f18876X.m26704h(this.f18897t, this.f18898u, arrayList);
                return;
            }
            if (loginCallback.m15009b() == null) {
                mo15998c(getResources().getString(2132017876));
                return;
            }
            if (loginCallback.m15009b().m15084c().intValue() != 1) {
                if (str.equals("validateLogin")) {
                    Toast.makeText(this, getResources().getString(2132017873), 0).show();
                    return;
                }
                return;
            }
            if (!loginCallback.m15009b().m15090i().equals("Active")) {
                if (arrayList == null || arrayList.size() <= 0) {
                    intent = new Intent(this, (Class<?>) MultiUserActivity.class);
                    startActivity(intent);
                    finish();
                    C5255e.m26241k0(this.f18881f, "Your Account is invalid or has expired !");
                    return;
                }
                this.f18854B.putString(C5251a.f30066t, arrayList.get(0).trim());
                this.f18854B.apply();
                arrayList.remove(0);
                this.f18876X.m26704h(this.f18897t, this.f18898u, arrayList);
                return;
            }
            String m15091j = loginCallback.m15009b().m15091j();
            String m15089h = loginCallback.m15009b().m15089h();
            String m15061b = loginCallback.m15008a().m15061b();
            String m15065f = loginCallback.m15008a().m15065f();
            String m15086e = loginCallback.m15009b().m15086e();
            String m15087f = loginCallback.m15009b().m15087f();
            String m15082a = loginCallback.m15009b().m15082a();
            String m15085d = loginCallback.m15009b().m15085d();
            String m15088g = loginCallback.m15009b().m15088g();
            List<String> m15083b = loginCallback.m15009b().m15083b();
            String m15063d = loginCallback.m15008a().m15063d();
            String m15060a = loginCallback.m15008a().m15060a();
            String m15062c = loginCallback.m15008a().m15062c();
            String m15064e = loginCallback.m15008a().m15064e();
            if (m15083b.size() != 0) {
                m15083b.get(0);
            }
            this.f18881f.getSharedPreferences("loginPrefsserverurl", 0).getString(C5251a.f30066t, "").toLowerCase();
            SharedPreferences.Editor edit = getSharedPreferences("loginPrefs", 0).edit();
            edit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, m15091j);
            edit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, m15089h);
            edit.putString("serverPort", m15061b);
            edit.putString("serverUrl", m15065f);
            edit.putString("expDate", m15086e);
            edit.putString("isTrial", m15087f);
            edit.putString("activeCons", m15082a);
            edit.putString("createdAt", m15085d);
            edit.putString("maxConnections", m15088g);
            edit.putString(C5251a.f30066t, m15065f + ":" + m15061b);
            edit.putString("serverProtocol", m15063d);
            edit.putString("serverPortHttps", m15060a);
            edit.putString("serverPortRtmp", m15062c);
            edit.putString("serverTimeZone", m15064e);
            edit.apply();
            this.f18857E = this.f18881f.getSharedPreferences("allowedFormat", 0);
            this.f18858F = this.f18881f.getSharedPreferences("timeFormat", 0);
            this.f18859G = this.f18881f.getSharedPreferences("epgchannelupdate", 0);
            this.f18860H = this.f18881f.getSharedPreferences("automation_channels", 0);
            this.f18861I = this.f18881f.getSharedPreferences("automation_epg", 0);
            this.f18864L = this.f18857E.edit();
            this.f18862J = this.f18858F.edit();
            this.f18863K = this.f18859G.edit();
            this.f18865M = this.f18860H.edit();
            this.f18866N = this.f18861I.edit();
            SharedPreferences sharedPreferences = this.f18881f.getSharedPreferences("auto_start", 0);
            this.f18867O = sharedPreferences;
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            this.f18868P = edit2;
            if (edit2 != null) {
                edit2.putBoolean("full_epg", true);
                this.f18868P.apply();
            }
            if (this.f18860H.getString("automation_channels", "").equals("")) {
                this.f18865M.putString("automation_channels", "checked");
                this.f18865M.apply();
            }
            if (this.f18861I.getString("automation_epg", "").equals("")) {
                this.f18866N.putString("automation_epg", "checked");
                this.f18866N.apply();
            }
            C5251a.f30012K = Boolean.FALSE;
            if (this.f18857E.getString("allowedFormat", "").equals("")) {
                this.f18864L.putString("allowedFormat", "ts");
                this.f18864L.apply();
            }
            if (this.f18858F.getString("timeFormat", C5251a.f30053m0).equals("")) {
                this.f18862J.putString("timeFormat", C5251a.f30053m0);
                this.f18862J.apply();
            }
            if (this.f18859G.getString("epgchannelupdate", "").equals("")) {
                this.f18863K.putString("epgchannelupdate", "all");
                this.f18863K.apply();
            }
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
            return;
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        e10.printStackTrace();
    }

    /* renamed from: D0 */
    public void m16678D0() {
        try {
            this.f18895r = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
        }
    }

    @Override // p407xe.InterfaceC9741c
    /* renamed from: E */
    public void mo15570E(int i10) {
        Context context = this.f18881f;
        if (context != null) {
            try {
                if (SharepreferenceDBHandler.m15373f(context).equals("m3u")) {
                    String str = this.f18873U;
                    if (str == null || !str.equals(TransferTable.COLUMN_FILE)) {
                        String str2 = this.f18873U;
                        if (str2 != null && str2.equals("url")) {
                            new AsyncTaskC3175k(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f18881f.getFilesDir() + "/data_temp.txt");
                        }
                    } else {
                        new AsyncTaskC3175k(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f18874V);
                    }
                } else {
                    this.f18876X.m26703g(this.f18897t, this.f18898u);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* renamed from: F0 */
    public final void m16679F0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: G0 */
    public boolean m16680G0() {
        return this.f18881f.getSharedPreferences("automation_channels", 0).getString("automation_channels", "").equals("checked");
    }

    @Override // p324sf.InterfaceC8567f
    /* renamed from: H */
    public void mo15984H(ArrayList<String> arrayList, String str) {
        if (arrayList == null || arrayList.size() <= 0) {
            startActivity(new Intent(this, (Class<?>) MultiUserActivity.class));
            finish();
            C5255e.m26241k0(this.f18881f, "Your Account is invalid or has expired !");
            return;
        }
        try {
            this.f18854B.putString(C5251a.f30066t, arrayList.get(0).trim());
            this.f18854B.apply();
            arrayList.remove(0);
            this.f18876X.m26704h(this.f18897t, this.f18898u, arrayList);
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: I0 */
    public void m16681I0() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception e10) {
        }
    }

    /* renamed from: J0 */
    public void m16682J0() {
        Handler handler;
        Runnable runnableC3169e;
        if (!C5251a.f30014M.booleanValue()) {
            if (SharepreferenceDBHandler.m15373f(this.f18881f).equals("m3u")) {
                SharedPreferences sharedPreferences = this.f18879d;
                if (sharedPreferences != null) {
                    String string = sharedPreferences.getString("serverUrl", "");
                    this.f18874V = string;
                    if (string == null || string.equals("")) {
                        handler = new Handler();
                        runnableC3169e = new RunnableC3168d(this);
                    }
                    m16683K0();
                    return;
                }
                return;
            }
            SharedPreferences sharedPreferences2 = this.f18879d;
            if (sharedPreferences2 != null) {
                String string2 = sharedPreferences2.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
                String string3 = this.f18879d.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
                if (string2 == null || string3 == null || string2.equals("") || string3.equals("") || C5251a.f30030b.booleanValue()) {
                    handler = new Handler();
                    runnableC3169e = new RunnableC3169e(this);
                }
            }
            m16683K0();
            return;
        }
        handler = new Handler();
        runnableC3169e = new RunnableC3167c(this);
        handler.postDelayed(runnableC3169e, this.f18875W);
    }

    /* renamed from: K0 */
    public void m16683K0() {
        Intent intent;
        C6783a c6783a = this.f18892o;
        if (c6783a != null) {
            String m31288z = c6783a.m31288z();
            if (m31288z == null || m31288z.equals("")) {
                startActivity(new Intent(this, (Class<?>) ScreenTypeActivity.class));
                finish();
            }
            if (C5251a.f30014M.booleanValue()) {
                SharedPreferences sharedPreferences = this.f18879d;
                if (sharedPreferences != null) {
                    String string = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
                    if (string == null || string.equals("")) {
                        String string2 = this.f18881f.getSharedPreferences("loginprefsmultiuser", 0).getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
                        intent = (string2 == null || string2.equals("")) ? new Intent(this, (Class<?>) RoutingActivity.class) : new Intent(this, (Class<?>) MultiUserActivity.class);
                    } else {
                        intent = new Intent(this, (Class<?>) NewDashboardActivity.class);
                    }
                } else {
                    intent = new Intent(this, (Class<?>) RoutingActivity.class);
                }
            } else {
                try {
                    if (SharepreferenceDBHandler.m15373f(this.f18881f).equals("m3u")) {
                        if (!C5251a.f30036e.booleanValue()) {
                            return;
                        }
                        SharedPreferences sharedPreferences2 = this.f18879d;
                        if (sharedPreferences2 != null) {
                            String string3 = sharedPreferences2.getString("serverUrl", "");
                            this.f18874V = string3;
                            if (string3 == null || string3.equals("")) {
                                startActivity(C5251a.f30032c.booleanValue() ? new Intent(this, (Class<?>) MultiUserActivity.class) : new Intent(this, (Class<?>) RoutingActivity.class));
                                overridePendingTransition(2130772003, 2130772000);
                            } else {
                                ArrayList<MultiUserDBModel> m15274o0 = this.f18883g.m15274o0(SharepreferenceDBHandler.m15337A(this.f18881f));
                                if (m15274o0 == null || m15274o0.size() <= 0) {
                                    Toast.makeText(this.f18881f, getResources().getString(2132018763), 0).show();
                                    startActivity(C5251a.f30032c.booleanValue() ? new Intent(this, (Class<?>) MultiUserActivity.class) : new Intent(this, (Class<?>) RoutingActivity.class));
                                    overridePendingTransition(2130772003, 2130772000);
                                } else if (m15274o0.get(0).m14872b().equals(TransferTable.COLUMN_FILE)) {
                                    this.f18873U = TransferTable.COLUMN_FILE;
                                    if (new File(this.f18874V).exists()) {
                                        new AsyncTaskC3172h(this).execute(new Void[0]);
                                        return;
                                    } else {
                                        Toast.makeText(this.f18881f, getResources().getString(2132017995), 0).show();
                                        startActivity(C5251a.f30032c.booleanValue() ? new Intent(this, (Class<?>) MultiUserActivity.class) : new Intent(this, (Class<?>) RoutingActivity.class));
                                        overridePendingTransition(2130772003, 2130772000);
                                    }
                                } else if (m15274o0.get(0).m14872b().equals("url")) {
                                    this.f18873U = "url";
                                    new AsyncTaskC3173i(this).execute(new Void[0]);
                                    return;
                                } else {
                                    startActivity(new Intent(this, (Class<?>) RoutingActivity.class));
                                    overridePendingTransition(2130772003, 2130772000);
                                }
                            }
                        } else {
                            startActivity(new Intent(this, (Class<?>) RoutingActivity.class));
                            overridePendingTransition(2130772003, 2130772000);
                        }
                    } else if (C5251a.f30034d.booleanValue()) {
                        SharedPreferences sharedPreferences3 = this.f18879d;
                        if (sharedPreferences3 != null) {
                            String string4 = sharedPreferences3.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
                            String string5 = this.f18879d.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
                            if (string4 == null || string5 == null || string4.equals("") || string5.equals("")) {
                                startActivity(new Intent(this, (Class<?>) MultiUserActivity.class));
                                overridePendingTransition(2130772003, 2130772000);
                            } else {
                                this.f18897t = string4;
                                this.f18898u = string5;
                                if (!C5251a.f30030b.booleanValue()) {
                                    new AsyncTaskC3172h(this).execute(new Void[0]);
                                    return;
                                } else {
                                    startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
                                    overridePendingTransition(2130772003, 2130772000);
                                }
                            }
                        } else {
                            startActivity(new Intent(this, (Class<?>) MultiUserActivity.class));
                            overridePendingTransition(2130772003, 2130772000);
                        }
                    } else {
                        SharedPreferences sharedPreferences4 = this.f18879d;
                        if (sharedPreferences4 != null) {
                            String string6 = sharedPreferences4.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
                            String string7 = this.f18879d.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
                            if (string6 == null || string7 == null || string6.equals("") || string7.equals("")) {
                                startActivity(C5251a.f30038f.booleanValue() ? new Intent(this, (Class<?>) RoutingActivity.class) : new Intent(this, (Class<?>) LoginActivity.class));
                                overridePendingTransition(2130772003, 2130772000);
                            } else {
                                this.f18897t = string6;
                                this.f18898u = string7;
                                if (!C5251a.f30030b.booleanValue()) {
                                    new AsyncTaskC3172h(this).execute(new Void[0]);
                                    return;
                                } else {
                                    startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
                                    overridePendingTransition(2130772003, 2130772000);
                                }
                            }
                        } else {
                            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
                            overridePendingTransition(2130772003, 2130772000);
                        }
                    }
                    finish();
                    return;
                } catch (Exception e10) {
                    intent = C5251a.f30038f.booleanValue() ? new Intent(this, (Class<?>) RoutingActivity.class) : new Intent(this, (Class<?>) LoginActivity.class);
                }
            }
        } else {
            intent = new Intent(this, (Class<?>) LoginActivity.class);
        }
        startActivity(intent);
        overridePendingTransition(2130772003, 2130772000);
        finish();
    }

    /* renamed from: L0 */
    public boolean m16684L0() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23) {
            Log.v("TAG", "Permission is granted");
            return true;
        }
        if (i10 >= 33) {
            return true;
        }
        if (checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            Log.v("TAG", "Permission is granted");
            return true;
        }
        Log.v("TAG", "Permission is revoked");
        C0936d.m5641r(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 1);
        return false;
    }

    @Override // p407xe.InterfaceC9741c
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public void mo15571Y(String str, int i10, boolean z10) {
        Intent intent;
        if (z10) {
            try {
                if (i10 == 1) {
                    JSONObject jSONObject = new JSONObject(str);
                    C9740b.f44453a = jSONObject;
                    if (jSONObject.getString("status").equalsIgnoreCase("true")) {
                        this.f18899v = C9740b.f44453a.getString("su");
                        this.f18900w = C9740b.f44453a.getString("ndd");
                        this.f18901x = System.currentTimeMillis();
                        try {
                            C9744f.m41043e(this, C9740b.f44453a.optString("su"));
                            this.f18872T = m16670M0(C9740b.f44453a.optString("su") + Marker.ANY_MARKER + C9744f.m41042d(this) + Marker.ANY_MARKER + C9740b.f44454b);
                            C9740b.f44453a.getString("sc").equalsIgnoreCase(this.f18872T);
                            if (SharepreferenceDBHandler.m15373f(this.f18881f).equals("m3u")) {
                                String str2 = this.f18873U;
                                if (str2 != null && str2.equals(TransferTable.COLUMN_FILE)) {
                                    new AsyncTaskC3175k(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f18874V);
                                    return;
                                }
                                String str3 = this.f18873U;
                                if (str3 == null || !str3.equals("url")) {
                                    return;
                                }
                                new AsyncTaskC3175k(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f18881f.getFilesDir() + "/data_temp.txt");
                                return;
                            }
                            String string = this.f18879d.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
                            String string2 = this.f18879d.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
                            if (string != null && string2 != null && !string.equals("") && !string2.equals("")) {
                                this.f18897t = string;
                                this.f18898u = string2;
                            }
                            this.f18854B.putString(C5251a.f30066t, C9744f.m41039a(this));
                            this.f18854B.apply();
                            this.f18856D.putString(C5251a.f30066t, C9744f.m41039a(this));
                            this.f18856D.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, this.f18897t);
                            this.f18856D.apply();
                            if (C5251a.f30034d.booleanValue()) {
                                m16686O0(this.f18899v.toLowerCase());
                                return;
                            } else {
                                this.f18876X.m26703g(this.f18897t, this.f18898u);
                                return;
                            }
                        } catch (Exception e10) {
                            startActivity(C5251a.f30038f.booleanValue() ? new Intent(this, (Class<?>) RoutingActivity.class) : new Intent(this, (Class<?>) LoginActivity.class));
                            overridePendingTransition(2130772003, 2130772000);
                        }
                    } else {
                        Toast.makeText(this, this.f18881f.getResources().getString(2132018652), 0).show();
                        startActivity(C5251a.f30038f.booleanValue() ? new Intent(this, (Class<?>) RoutingActivity.class) : new Intent(this, (Class<?>) LoginActivity.class));
                        overridePendingTransition(2130772003, 2130772000);
                    }
                } else {
                    startActivity(C5251a.f30038f.booleanValue() ? new Intent(this, (Class<?>) RoutingActivity.class) : new Intent(this, (Class<?>) LoginActivity.class));
                    overridePendingTransition(2130772003, 2130772000);
                }
                finish();
                return;
            } catch (Exception e11) {
                intent = C5251a.f30038f.booleanValue() ? new Intent(this, (Class<?>) RoutingActivity.class) : new Intent(this, (Class<?>) LoginActivity.class);
            }
        } else {
            Toast.makeText(this, this.f18881f.getResources().getString(2132017529), 0).show();
            intent = C5251a.f30038f.booleanValue() ? new Intent(this, (Class<?>) RoutingActivity.class) : new Intent(this, (Class<?>) LoginActivity.class);
        }
        startActivity(intent);
        overridePendingTransition(2130772003, 2130772000);
        finish();
    }

    /* renamed from: O0 */
    public final void m16686O0(String str) {
        if (str != null && !str.equals("") && !str.isEmpty()) {
            this.f18871S = new ArrayList<>(Arrays.asList(str.split(",")));
        }
        ArrayList<String> arrayList = this.f18871S;
        if (arrayList == null || arrayList.size() < 1) {
            ArrayList<String> arrayList2 = this.f18871S;
            if (arrayList2 == null || arrayList2.size() != 0) {
                return;
            }
            Toast.makeText(this, this.f18881f.getResources().getString(2132018343), 0).show();
            return;
        }
        try {
            this.f18854B.putString(C5251a.f30066t, this.f18871S.get(0).trim());
            this.f18854B.commit();
            this.f18871S.remove(0);
            this.f18876X.m26704h(this.f18897t, this.f18898u, this.f18871S);
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    @Override // p324sf.InterfaceC8567f
    /* renamed from: P */
    public void mo15991P(String str) {
    }

    /* renamed from: P0 */
    public void m16687P0() {
        this.f18891n.setVisibility(8);
        this.f18889l.setVisibility(0);
        this.f18888k.setVisibility(0);
    }

    @Override // p324sf.InterfaceC8567f
    /* renamed from: Q */
    public void mo15993Q(ArrayList<String> arrayList, String str) {
        if (arrayList == null || arrayList.size() <= 0) {
            startActivity(new Intent(this, (Class<?>) MultiUserActivity.class));
            finish();
            C5255e.m26241k0(this.f18881f, "Your Account is invalid or has expired !");
            return;
        }
        try {
            this.f18854B.putString(C5251a.f30066t, arrayList.get(0).trim());
            this.f18854B.apply();
            arrayList.remove(0);
            this.f18876X.m26704h(this.f18897t, this.f18898u, arrayList);
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: Q0 */
    public void m16688Q0() {
        this.f18891n.setVisibility(0);
        this.f18889l.setVisibility(8);
        this.f18888k.setVisibility(8);
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: c */
    public void mo15998c(String str) {
    }

    @Override // p324sf.InterfaceC8567f
    /* renamed from: i */
    public void mo15999i(LoginCallback loginCallback, String str) {
        String string;
        if (this.f18881f != null) {
            if (loginCallback == null || loginCallback.m15009b() == null) {
                startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
                finish();
                mo15998c(getResources().getString(2132017876));
                return;
            }
            if (loginCallback.m15009b().m15084c().intValue() == 1) {
                String m15090i = loginCallback.m15009b().m15090i();
                if (m15090i.equals("Active")) {
                    String m15091j = loginCallback.m15009b().m15091j();
                    String m15089h = loginCallback.m15009b().m15089h();
                    String m15061b = loginCallback.m15008a().m15061b();
                    String m15065f = loginCallback.m15008a().m15065f();
                    String m15086e = loginCallback.m15009b().m15086e();
                    String m15087f = loginCallback.m15009b().m15087f();
                    String m15082a = loginCallback.m15009b().m15082a();
                    String m15085d = loginCallback.m15009b().m15085d();
                    String m15088g = loginCallback.m15009b().m15088g();
                    List<String> m15083b = loginCallback.m15009b().m15083b();
                    String m15063d = loginCallback.m15008a().m15063d();
                    String m15060a = loginCallback.m15008a().m15060a();
                    String m15062c = loginCallback.m15008a().m15062c();
                    String m15064e = loginCallback.m15008a().m15064e();
                    if (m15083b.size() != 0) {
                        m15083b.get(0);
                    }
                    this.f18881f.getSharedPreferences("loginPrefsserverurl", 0).getString(C5251a.f30066t, "").toLowerCase();
                    SharedPreferences.Editor edit = getSharedPreferences("loginPrefs", 0).edit();
                    edit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, m15091j);
                    edit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, m15089h);
                    edit.putString("serverPort", m15061b);
                    edit.putString("serverUrl", m15065f);
                    edit.putString("expDate", m15086e);
                    edit.putString("isTrial", m15087f);
                    edit.putString("activeCons", m15082a);
                    edit.putString("createdAt", m15085d);
                    edit.putString("maxConnections", m15088g);
                    edit.putString(C5251a.f30066t, m15065f + ":" + m15061b);
                    edit.putString("serverProtocol", m15063d);
                    edit.putString("serverPortHttps", m15060a);
                    edit.putString("serverPortRtmp", m15062c);
                    edit.putString("serverTimeZone", m15064e);
                    edit.apply();
                    this.f18857E = this.f18881f.getSharedPreferences("allowedFormat", 0);
                    this.f18858F = this.f18881f.getSharedPreferences("timeFormat", 0);
                    this.f18859G = this.f18881f.getSharedPreferences("epgchannelupdate", 0);
                    this.f18860H = this.f18881f.getSharedPreferences("automation_channels", 0);
                    this.f18861I = this.f18881f.getSharedPreferences("automation_epg", 0);
                    this.f18864L = this.f18857E.edit();
                    this.f18862J = this.f18858F.edit();
                    this.f18863K = this.f18859G.edit();
                    this.f18865M = this.f18860H.edit();
                    this.f18866N = this.f18861I.edit();
                    SharedPreferences sharedPreferences = this.f18881f.getSharedPreferences("auto_start", 0);
                    this.f18867O = sharedPreferences;
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    this.f18868P = edit2;
                    if (edit2 != null) {
                        edit2.putBoolean("full_epg", true);
                        this.f18868P.apply();
                    }
                    if (this.f18860H.getString("automation_channels", "").equals("")) {
                        this.f18865M.putString("automation_channels", "checked");
                        this.f18865M.apply();
                    }
                    if (this.f18861I.getString("automation_epg", "").equals("")) {
                        this.f18866N.putString("automation_epg", "checked");
                        this.f18866N.apply();
                    }
                    C5251a.f30012K = Boolean.FALSE;
                    if (this.f18857E.getString("allowedFormat", "").equals("")) {
                        this.f18864L.putString("allowedFormat", "ts");
                        this.f18864L.apply();
                    }
                    if (this.f18858F.getString("timeFormat", C5251a.f30053m0).equals("")) {
                        this.f18862J.putString("timeFormat", C5251a.f30053m0);
                        this.f18862J.apply();
                    }
                    if (this.f18859G.getString("epgchannelupdate", "").equals("")) {
                        this.f18863K.putString("epgchannelupdate", "all");
                        this.f18863K.apply();
                    }
                    startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
                    finish();
                    return;
                }
                startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
                finish();
                string = getResources().getString(2132017878) + m15090i;
            } else {
                startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
                finish();
                string = getResources().getString(2132017873);
            }
            Toast.makeText(this, string, 0).show();
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f18881f = this;
        super.onCreate(bundle);
        try {
            startService(new Intent(getBaseContext(), (Class<?>) StopProcessingTasksService.class));
        } catch (Exception e10) {
        }
        m16681I0();
        setContentView(2131624066);
        if (!C5251a.f30014M.booleanValue()) {
            m16678D0();
            m16689q0();
            m16669H0();
            m16690r0();
        }
        this.f18892o = new C6783a(this.f18881f);
        C9745g.f44477c = new C9745g(this);
        this.f18891n = (VideoView) findViewById(2131429669);
        this.f18884g0 = (LinearLayout) findViewById(2131428520);
        if (C5251a.f30014M.booleanValue()) {
            this.f18884g0.setVisibility(0);
        } else {
            this.f18884g0.setVisibility(8);
        }
        ((RelativeLayout) findViewById(2131428570)).setSystemUiVisibility(4871);
        this.f18888k = (ImageView) findViewById(2131428232);
        this.f18889l = (ImageView) findViewById(2131428199);
        this.f18869Q = new LiveStreamDBHandler(this.f18881f);
        SharedPreferences sharedPreferences = getSharedPreferences("sharedPreference", 0);
        this.f18870R = sharedPreferences;
        this.f18856D = sharedPreferences.edit();
        this.f18879d = getSharedPreferences("loginPrefs", 0);
        SharedPreferences sharedPreferences2 = getSharedPreferences("sharedprefremberme", 0);
        this.f18903z = sharedPreferences2;
        this.f18902y = Boolean.valueOf(sharedPreferences2.getBoolean("savelogin", true));
        SharedPreferences sharedPreferences3 = getSharedPreferences("loginPrefsserverurl", 0);
        this.f18853A = sharedPreferences3;
        this.f18854B = sharedPreferences3.edit();
        this.f18880e = getSharedPreferences("selected_language", 0);
        this.f18855C = this.f18903z.edit();
        String string = this.f18880e.getString("selected_language", "");
        if (!string.equals("")) {
            C5255e.m26232e0(this.f18881f, string);
        }
        this.f18876X = new C5371c(this, this.f18881f);
        this.f18883g = new MultiUserDBHandler(this.f18881f);
        if (SharepreferenceDBHandler.m15344H(this.f18881f)) {
            SharepreferenceDBHandler.m15390n0(true, this.f18881f);
        }
        if (C5251a.f30058p.booleanValue()) {
            try {
                m16688Q0();
            } catch (Exception e11) {
                m16687P0();
                this.f18875W = EtherType.IEEE802_3_MAX_LENGTH;
                m16682J0();
            }
            this.f18891n.setOnCompletionListener(new C3165a(this));
            this.f18891n.setOnPreparedListener(new C3166b(this));
        } else {
            m16687P0();
            this.f18875W = EtherType.IEEE802_3_MAX_LENGTH;
            m16682J0();
        }
        m16679F0();
        this.f18885h = this.f18881f.getSharedPreferences("update_version", 0);
        C9744f.m41045g(this, "Kf859a9185dd33f611a84c7637bd23d2d");
        C9744f.m41044f(this, "Kf859a9185dd33f611a84c7637bd23d2d");
        C9744f.m41046h(this, "NB!@#12ZKWd");
        this.f18880e = getSharedPreferences("selected_language", 0);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        String string = this.f18880e.getString("selected_language", "");
        if (string.equals("")) {
            return;
        }
        C5255e.m26232e0(this.f18881f, string);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        m16681I0();
    }

    /* renamed from: q0 */
    public void m16689q0() {
        this.f18894q = Build.VERSION.RELEASE + " " + Build.VERSION_CODES.class.getFields()[Build.VERSION.SDK_INT].getName();
    }

    /* renamed from: r0 */
    public void m16690r0() {
        int nextInt = new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS;
        this.f18896s = nextInt;
        C9740b.f44454b = String.valueOf(nextInt);
    }

    /* renamed from: s0 */
    public void m16691s0() {
        StringBuilder sb2;
        List<C9743e> list;
        String str;
        if (SharepreferenceDBHandler.m15373f(this.f18881f).equals("m3u")) {
            sb2 = new StringBuilder();
            sb2.append(C9744f.m41041c(this));
            sb2.append(Marker.ANY_MARKER);
            sb2.append(C9744f.m41042d(this));
            sb2.append("-");
            sb2.append("playlist");
        } else {
            sb2 = new StringBuilder();
            sb2.append(C9744f.m41041c(this));
            sb2.append(Marker.ANY_MARKER);
            sb2.append(C9744f.m41042d(this));
            sb2.append("-");
            sb2.append(this.f18897t);
        }
        sb2.append("-");
        sb2.append(C9740b.f44454b);
        sb2.append("-");
        sb2.append(this.f18895r);
        sb2.append("-unknown-");
        sb2.append(m16669H0());
        sb2.append("-");
        sb2.append(this.f18894q);
        this.f18893p = m16670M0(sb2.toString());
        ArrayList arrayList = new ArrayList();
        C9745g.f44476b = arrayList;
        arrayList.add(C9745g.m41047a("m", "gu"));
        C9745g.f44476b.add(C9745g.m41047a("k", C9744f.m41041c(this)));
        C9745g.f44476b.add(C9745g.m41047a("sc", this.f18893p));
        if (SharepreferenceDBHandler.m15373f(this.f18881f).equals("m3u")) {
            list = C9745g.f44476b;
            str = "playlist";
        } else {
            list = C9745g.f44476b;
            str = this.f18897t;
        }
        list.add(C9745g.m41047a("u", str));
        C9745g.f44476b.add(C9745g.m41047a("pw", "no_password"));
        C9745g.f44476b.add(C9745g.m41047a("r", C9740b.f44454b));
        C9745g.f44476b.add(C9745g.m41047a("av", this.f18895r));
        C9745g.f44476b.add(C9745g.m41047a("dt", "unknown"));
        C9745g.f44476b.add(C9745g.m41047a("d", m16669H0()));
        C9745g.f44476b.add(C9745g.m41047a("do", this.f18894q));
        C9745g.f44477c.m41048b(this);
    }

    @Override // p324sf.InterfaceC8567f
    /* renamed from: t */
    public void mo16003t(String str) {
        startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
        overridePendingTransition(2130772003, 2130772000);
        finish();
    }
}

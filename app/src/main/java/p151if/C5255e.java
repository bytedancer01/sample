package p151if;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.media.AudioAttributes;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.Environment;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import cf.C1082f;
import com.amazonaws.mobileconnectors.appsync.AWSAppSyncClient;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferService;
import com.maxdigitall.maxdigitaliptvbox.model.callback.GetEpisdoeDetailsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.database.EPGSourcesModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.ExternalPlayerDataBase;
import com.maxdigitall.maxdigitaliptvbox.model.database.ImportStatusModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.XMLTVProgrammePojo;
import com.maxdigitall.maxdigitaliptvbox.view.activity.CheckAppupdateActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.ExoPlayerMoviesSeriesActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.HoneyPlayer;
import com.maxdigitall.maxdigitaliptvbox.view.activity.ImportM3uActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.LoginActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.MultiUserActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.NotificationActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.PlayExternalPlayerActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.RateUsActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.RecordingActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.RoutingActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSubCategories;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.RecordingAdapter;
import com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity;
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerEPGActivity;
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity;
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.C4043b;
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.C4044c;
import dj.C4555v;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.NetworkInterface;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import nf.C6783a;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.methods.HttpGet;
import org.joda.time.LocalDateTime;
import org.slf4j.Marker;
import p030c0.C0964r;
import p085ej.C4730a;
import p173ji.C5402b0;
import p355uf.C9175c;
import pf.C7705a;
import pf.C7707c;
import pf.C7708d;
import pf.C7709e;
import pf.C7711g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:if/e.class
 */
/* renamed from: if.e */
/* loaded from: combined.jar:classes2.jar:if/e.class */
public class C5255e {

    /* renamed from: h */
    public static PopupWindow f30084h;

    /* renamed from: i */
    public static SharedPreferences f30085i;

    /* renamed from: j */
    public static SharedPreferences f30086j;

    /* renamed from: k */
    public static C6783a f30087k;

    /* renamed from: l */
    public static AsyncTask f30088l;

    /* renamed from: m */
    public static AsyncTask f30089m;

    /* renamed from: n */
    public static AsyncTask f30090n;

    /* renamed from: o */
    public static AsyncTask f30091o;

    /* renamed from: p */
    public static boolean f30092p;

    /* renamed from: q */
    public static AsyncTask f30093q;

    /* renamed from: r */
    public static String[] f30094r = {"android.permission.POST_NOTIFICATIONS"};

    /* renamed from: s */
    public static String[] f30095s = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};

    /* renamed from: t */
    public static Dialog f30096t;

    /* renamed from: a */
    public SharedPreferences f30097a;

    /* renamed from: b */
    public int f30098b = 0;

    /* renamed from: c */
    public boolean f30099c = false;

    /* renamed from: d */
    public int f30100d = 5;

    /* renamed from: e */
    public int[] f30101e = {1};

    /* renamed from: f */
    public String f30102f = "";

    /* renamed from: g */
    public ArrayList<String> f30103g = new ArrayList<>();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:if/e$a.class
     */
    /* renamed from: if.e$a */
    /* loaded from: combined.jar:classes2.jar:if/e$a.class */
    public class a implements View.OnClickListener {

        /* renamed from: b */
        public final C5255e f30104b;

        public a(C5255e c5255e) {
            this.f30104b = c5255e;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.f30084h.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:if/e$b.class
     */
    /* renamed from: if.e$b */
    /* loaded from: combined.jar:classes2.jar:if/e$b.class */
    public class b implements View.OnClickListener {

        /* renamed from: b */
        public final Activity f30105b;

        /* renamed from: c */
        public final C5255e f30106c;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:if/e$b$a.class
         */
        /* renamed from: if.e$b$a */
        /* loaded from: combined.jar:classes2.jar:if/e$b$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final b f30107b;

            public a(b bVar) {
                this.f30107b = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C5255e.f30084h.dismiss();
            }
        }

        public b(C5255e c5255e, Activity activity) {
            this.f30106c = c5255e;
            this.f30105b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f30106c.f30097a = PreferenceManager.getDefaultSharedPreferences(this.f30105b);
            SharedPreferences.Editor edit = this.f30106c.f30097a.edit();
            edit.putBoolean("CANCELLED", true);
            edit.apply();
            this.f30106c.m26264o0(this.f30105b, "stopped");
            Activity activity = this.f30105b;
            Toast.makeText(activity, activity.getResources().getString(2132017600), 0).show();
            new Handler().postDelayed(new a(this), 500L);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:if/e$c.class
     */
    /* renamed from: if.e$c */
    /* loaded from: combined.jar:classes2.jar:if/e$c.class */
    public class c implements View.OnClickListener {

        /* renamed from: b */
        public final C5255e f30108b;

        public c(C5255e c5255e) {
            this.f30108b = c5255e;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.f30084h.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:if/e$d.class
     */
    /* renamed from: if.e$d */
    /* loaded from: combined.jar:classes2.jar:if/e$d.class */
    public class d implements View.OnClickListener {

        /* renamed from: b */
        public String f30109b = "";

        /* renamed from: c */
        public boolean f30110c = true;

        /* renamed from: d */
        public final Activity f30111d;

        /* renamed from: e */
        public final EditText f30112e;

        /* renamed from: f */
        public final SharedPreferences f30113f;

        /* renamed from: g */
        public final C5255e f30114g;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:if/e$d$a.class
         */
        /* renamed from: if.e$d$a */
        /* loaded from: combined.jar:classes2.jar:if/e$d$a.class */
        public class a implements C1082f.j {

            /* renamed from: a */
            public final d f30115a;

            public a(d dVar) {
                this.f30115a = dVar;
            }

            @Override // cf.C1082f.j
            /* renamed from: a */
            public void mo6437a(String str) {
                this.f30115a.f30109b = str;
                this.f30115a.f30112e.setText(str);
                SharedPreferences.Editor edit = this.f30115a.f30113f.edit();
                edit.putString("recordingDir", str);
                edit.apply();
                Toast.makeText(this.f30115a.f30111d, "Chosen directory: " + str, 1).show();
            }
        }

        public d(C5255e c5255e, Activity activity, EditText editText, SharedPreferences sharedPreferences) {
            this.f30114g = c5255e;
            this.f30111d = activity;
            this.f30112e = editText;
            this.f30113f = sharedPreferences;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1082f c1082f = new C1082f(this.f30111d, new a(this));
            c1082f.m6434K(this.f30110c);
            if (Build.VERSION.SDK_INT >= 30) {
                c1082f.m6429E("");
            } else {
                c1082f.m6428D("");
            }
            this.f30110c = !this.f30110c;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:if/e$e.class
     */
    /* renamed from: if.e$e */
    /* loaded from: combined.jar:classes2.jar:if/e$e.class */
    public class e implements View.OnClickListener {

        /* renamed from: b */
        public final EditText f30116b;

        /* renamed from: c */
        public final Activity f30117c;

        /* renamed from: d */
        public final String f30118d;

        /* renamed from: e */
        public final EditText f30119e;

        /* renamed from: f */
        public final EditText f30120f;

        /* renamed from: g */
        public final C5255e f30121g;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:if/e$e$a.class
         */
        /* renamed from: if.e$e$a */
        /* loaded from: combined.jar:classes2.jar:if/e$e$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final e f30122b;

            public a(e eVar) {
                this.f30122b = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C5255e.f30084h.dismiss();
            }
        }

        public e(C5255e c5255e, EditText editText, Activity activity, String str, EditText editText2, EditText editText3) {
            this.f30121g = c5255e;
            this.f30116b = editText;
            this.f30117c = activity;
            this.f30118d = str;
            this.f30119e = editText2;
            this.f30120f = editText3;
        }

        /* renamed from: a */
        public final boolean m26266a() {
            Activity activity;
            Resources resources;
            int i10;
            if (this.f30119e.getText().toString().trim().length() == 0) {
                activity = this.f30117c;
                resources = activity.getResources();
                i10 = 2132017862;
            } else if (this.f30116b.getText().toString().trim().length() == 0) {
                activity = this.f30117c;
                resources = activity.getResources();
                i10 = 2132017861;
            } else {
                if (this.f30116b.getText().toString().trim().length() == 0) {
                    return true;
                }
                try {
                    C5255e.m26215R(this.f30116b.getText().toString());
                    return true;
                } catch (NumberFormatException e10) {
                    activity = this.f30117c;
                    resources = activity.getResources();
                    i10 = 2132017641;
                }
            }
            Toast.makeText(activity, resources.getString(i10), 1).show();
            return false;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i10;
            if (m26266a()) {
                try {
                    i10 = C5255e.m26215R(this.f30116b.getText().toString());
                } catch (NumberFormatException e10) {
                    i10 = 0;
                }
                new h(this.f30121g, this.f30117c, this.f30118d, i10, this.f30119e.getText().toString(), true, this.f30120f.getText().toString());
                new Handler().postDelayed(new a(this), 500L);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:if/e$f.class
     */
    /* renamed from: if.e$f */
    /* loaded from: combined.jar:classes2.jar:if/e$f.class */
    public class f implements View.OnClickListener {

        /* renamed from: b */
        public final C5255e f30123b;

        public f(C5255e c5255e) {
            this.f30123b = c5255e;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.f30084h.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:if/e$g.class
     */
    /* renamed from: if.e$g */
    /* loaded from: combined.jar:classes2.jar:if/e$g.class */
    public class g implements View.OnClickListener {

        /* renamed from: b */
        public final File f30124b;

        /* renamed from: c */
        public final RecordingActivity f30125c;

        /* renamed from: d */
        public final ArrayList f30126d;

        /* renamed from: e */
        public final RecordingAdapter f30127e;

        /* renamed from: f */
        public final TextView f30128f;

        /* renamed from: g */
        public final C5255e f30129g;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:if/e$g$a.class
         */
        /* renamed from: if.e$g$a */
        /* loaded from: combined.jar:classes2.jar:if/e$g$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final g f30130b;

            public a(g gVar) {
                this.f30130b = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C5255e.f30084h.dismiss();
            }
        }

        public g(C5255e c5255e, File file, RecordingActivity recordingActivity, ArrayList arrayList, RecordingAdapter recordingAdapter, TextView textView) {
            this.f30129g = c5255e;
            this.f30124b = file;
            this.f30125c = recordingActivity;
            this.f30126d = arrayList;
            this.f30127e = recordingAdapter;
            this.f30128f = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f30124b.exists() && this.f30124b.delete()) {
                RecordingActivity recordingActivity = this.f30125c;
                Toast.makeText(recordingActivity, recordingActivity.getResources().getString(2132018446), 0).show();
                File[] m26198A = C5255e.m26198A(this.f30125c);
                if (m26198A != null && m26198A.length > 0) {
                    this.f30126d.clear();
                    for (File file : m26198A) {
                        if (file.toString().endsWith(".ts")) {
                            this.f30126d.addAll(Arrays.asList(file));
                        }
                    }
                    ArrayList arrayList = this.f30126d;
                    if (arrayList != null && arrayList.size() > 0) {
                        this.f30127e.m4099w();
                        new Handler().postDelayed(new a(this), 500L);
                    }
                }
                this.f30126d.clear();
                this.f30127e.m4099w();
                this.f30128f.setVisibility(0);
                new Handler().postDelayed(new a(this), 500L);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:if/e$h.class
     */
    /* renamed from: if.e$h */
    /* loaded from: combined.jar:classes2.jar:if/e$h.class */
    public class h {

        /* renamed from: a */
        public Context f30131a;

        /* renamed from: b */
        public int f30132b;

        /* renamed from: c */
        public int f30133c;

        /* renamed from: d */
        public String f30134d;

        /* renamed from: e */
        public int f30135e;

        /* renamed from: f */
        public String f30136f;

        /* renamed from: g */
        public String f30137g;

        /* renamed from: i */
        public NotificationManager f30139i;

        /* renamed from: j */
        public NotificationManager f30140j;

        /* renamed from: k */
        public Notification f30141k;

        /* renamed from: l */
        public C0964r.e f30142l;

        /* renamed from: m */
        public C0964r.e f30143m;

        /* renamed from: r */
        public boolean f30148r;

        /* renamed from: s */
        public CountDownTimer f30149s;

        /* renamed from: t */
        public CountDownTimer f30150t;

        /* renamed from: x */
        public final C5255e f30154x;

        /* renamed from: h */
        public String f30138h = "";

        /* renamed from: n */
        public int f30144n = 234231;

        /* renamed from: o */
        public boolean f30145o = false;

        /* renamed from: p */
        public boolean f30146p = false;

        /* renamed from: q */
        public boolean f30147q = false;

        /* renamed from: u */
        public final String f30151u = "CANCELLED";

        /* renamed from: v */
        public boolean f30152v = false;

        /* renamed from: w */
        public boolean f30153w = false;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:if/e$h$a.class
         */
        /* renamed from: if.e$h$a */
        /* loaded from: combined.jar:classes2.jar:if/e$h$a.class */
        public class a extends CountDownTimer {

            /* renamed from: a */
            public final h f30155a;

            /* JADX WARN: Classes with same name are omitted:
              classes2.jar:if/e$h$a$a.class
             */
            /* renamed from: if.e$h$a$a, reason: collision with other inner class name */
            /* loaded from: combined.jar:classes2.jar:if/e$h$a$a.class */
            public class CountDownTimerC10300a extends CountDownTimer {

                /* renamed from: a */
                public final a f30156a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public CountDownTimerC10300a(a aVar, long j10, long j11) {
                    super(j10, j11);
                    this.f30156a = aVar;
                }

                @Override // android.os.CountDownTimer
                public void onFinish() {
                    this.f30156a.f30155a.f30150t.cancel();
                    this.f30156a.f30155a.f30145o = true;
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j10) {
                    NotificationManager notificationManager;
                    int i10;
                    Notification m5773c;
                    Notification.Builder channelId;
                    if (this.f30156a.f30155a.f30152v) {
                        h hVar = this.f30156a.f30155a;
                        if (!hVar.f30154x.f30099c) {
                            Log.e("Debugging:", "cancelled recording");
                            this.f30156a.f30155a.f30139i.cancelAll();
                            this.f30156a.f30155a.f30150t.cancel();
                            this.f30156a.f30155a.m26295C("stopped");
                            return;
                        }
                        hVar.f30132b -= this.f30156a.f30155a.f30154x.f30101e[0];
                        h hVar2 = this.f30156a.f30155a;
                        hVar2.f30133c = hVar2.f30132b * 1000;
                        Log.e("Debugging:", "retrying: " + this.f30156a.f30155a.f30133c);
                        this.f30156a.f30155a.f30150t.cancel();
                        return;
                    }
                    int[] iArr = this.f30156a.f30155a.f30154x.f30101e;
                    int i11 = iArr[0];
                    iArr[0] = i11 + 1;
                    if (Build.VERSION.SDK_INT >= 26) {
                        h hVar3 = this.f30156a.f30155a;
                        hVar3.f30154x.f30097a = PreferenceManager.getDefaultSharedPreferences(hVar3.f30131a);
                        SharedPreferences.Editor edit = this.f30156a.f30155a.f30154x.f30097a.edit();
                        edit.putBoolean("CANCELLED", false);
                        edit.apply();
                        h hVar4 = this.f30156a.f30155a;
                        NotificationActivity.m16200a(hVar4.f30144n, hVar4.f30131a);
                        h hVar5 = this.f30156a.f30155a;
                        Notification.Builder builder = new Notification.Builder(this.f30156a.f30155a.f30131a);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this.f30156a.f30155a.f30131a.getResources().getString(2132018447));
                        sb2.append(this.f30156a.f30155a.f30154x.m26260d0(i11));
                        sb2.append(" - ");
                        h hVar6 = this.f30156a.f30155a;
                        sb2.append(hVar6.f30154x.m26260d0(hVar6.f30135e / 1000));
                        channelId = builder.setContentTitle(sb2.toString()).setSmallIcon(2131755009).setChannelId("ksjadf87");
                        hVar5.f30141k = channelId.setSound((Uri) null, (AudioAttributes) null).build();
                        this.f30156a.f30155a.f30139i.createNotificationChannel(new NotificationChannel("ksjadf87", this.f30156a.f30155a.f30131a.getResources().getString(2132018447), 2));
                        h hVar7 = this.f30156a.f30155a;
                        notificationManager = hVar7.f30139i;
                        i10 = hVar7.f30144n;
                        m5773c = hVar7.f30141k;
                    } else {
                        C0964r.e eVar = this.f30156a.f30155a.f30142l;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(this.f30156a.f30155a.f30131a.getResources().getString(2132018447));
                        sb3.append(this.f30156a.f30155a.f30154x.m26260d0(i11));
                        sb3.append(" - ");
                        h hVar8 = this.f30156a.f30155a;
                        sb3.append(hVar8.f30154x.m26260d0(hVar8.f30135e / 1000));
                        eVar.m5782m(sb3.toString());
                        h hVar9 = this.f30156a.f30155a;
                        notificationManager = hVar9.f30139i;
                        i10 = hVar9.f30144n;
                        m5773c = hVar9.f30142l.m5773c();
                    }
                    notificationManager.notify(i10, m5773c);
                    if (this.f30156a.f30155a.f30153w) {
                        this.f30156a.f30155a.f30139i.cancelAll();
                        this.f30156a.f30155a.f30150t.cancel();
                    }
                    Log.e("Debugging:", "Seconds:" + this.f30156a.f30155a.f30154x.m26260d0(i11) + "   Reverse Seconds:" + this.f30156a.f30155a.f30154x.m26260d0((int) (j10 / 1000)) + " asdf:" + this.f30156a.f30155a.f30133c + " Timeinseconds:" + this.f30156a.f30155a.f30132b);
                    h hVar10 = this.f30156a.f30155a;
                    hVar10.f30154x.m26264o0(hVar10.f30131a, "processing");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(h hVar, long j10, long j11) {
                super(j10, j11);
                this.f30155a = hVar;
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                cancel();
                h hVar = this.f30155a;
                if (hVar.f30154x.f30099c || !hVar.f30147q) {
                    return;
                }
                this.f30155a.m26295C("failed");
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j10) {
                Log.e("onTick", "Testing:" + j10);
                if (this.f30155a.f30146p) {
                    Log.e("download started", "Testing:" + j10);
                    cancel();
                    h hVar = this.f30155a;
                    hVar.f30150t = new CountDownTimerC10300a(this, (long) hVar.f30133c, 1000L).start();
                }
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:if/e$h$b.class
         */
        @SuppressLint({"StaticFieldLeak"})
        /* renamed from: if.e$h$b */
        /* loaded from: combined.jar:classes2.jar:if/e$h$b.class */
        public class b extends AsyncTask<Void, Void, Void> {

            /* renamed from: a */
            public File f30157a;

            /* renamed from: b */
            public FileOutputStream f30158b;

            /* renamed from: c */
            public final h f30159c;

            /* JADX WARN: Classes with same name are omitted:
              classes2.jar:if/e$h$b$a.class
             */
            /* renamed from: if.e$h$b$a */
            /* loaded from: combined.jar:classes2.jar:if/e$h$b$a.class */
            public class a implements Runnable {

                /* renamed from: b */
                public final b f30160b;

                public a(b bVar) {
                    this.f30160b = bVar;
                }

                @Override // java.lang.Runnable
                public void run() {
                    h hVar = this.f30160b.f30159c;
                    hVar.f30154x.f30098b++;
                    C5255e.m26241k0(hVar.f30131a, "Retrying (" + this.f30160b.f30159c.f30154x.f30098b + "/" + this.f30160b.f30159c.f30154x.f30100d + ")");
                    new b(this.f30160b.f30159c, null).execute(new Void[0]);
                }
            }

            /* JADX WARN: Classes with same name are omitted:
              classes2.jar:if/e$h$b$b.class
             */
            /* renamed from: if.e$h$b$b, reason: collision with other inner class name */
            /* loaded from: combined.jar:classes2.jar:if/e$h$b$b.class */
            public class RunnableC10301b implements Runnable {

                /* renamed from: b */
                public final b f30161b;

                public RunnableC10301b(b bVar) {
                    this.f30161b = bVar;
                }

                @Override // java.lang.Runnable
                public void run() {
                    h hVar = this.f30161b.f30159c;
                    hVar.f30154x.f30098b++;
                    C5255e.m26241k0(hVar.f30131a, "Retrying (" + this.f30161b.f30159c.f30154x.f30098b + "/" + this.f30161b.f30159c.f30154x.f30100d + ")");
                    new b(this.f30161b.f30159c, null).execute(new Void[0]);
                }
            }

            public b(h hVar) {
                this.f30159c = hVar;
                this.f30157a = null;
                this.f30158b = null;
            }

            public /* synthetic */ b(h hVar, DialogInterfaceOnClickListenerC5254d dialogInterfaceOnClickListenerC5254d) {
                this(hVar);
            }

            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void doInBackground(Void... voidArr) {
                File file;
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f30159c.f30136f).openConnection();
                    httpURLConnection.setRequestMethod(HttpGet.METHOD_NAME);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.connect();
                    if (httpURLConnection.getResponseCode() != 200) {
                        Log.e("Download Task", "Server returned HTTP " + httpURLConnection.getResponseCode() + " " + httpURLConnection.getResponseMessage());
                        SharedPreferences.Editor edit = this.f30159c.f30154x.f30097a.edit();
                        edit.putBoolean("CANCELLED", true);
                        edit.apply();
                        this.f30159c.f30152v = true;
                        h hVar = this.f30159c;
                        hVar.f30154x.f30099c = true;
                        hVar.f30146p = false;
                        return null;
                    }
                    if (this.f30159c.f30134d == null || this.f30159c.f30134d.equals("")) {
                        File file2 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "MAXDIGITAL");
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                        this.f30159c.f30134d = String.valueOf(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "MAXDIGITAL"));
                    }
                    if (this.f30159c.f30138h == null || this.f30159c.f30138h.equals("")) {
                        if (!this.f30159c.f30137g.contains(".ts")) {
                            this.f30159c.f30137g = this.f30159c.f30137g + ".ts";
                        }
                        File file3 = new File(String.valueOf(this.f30159c.f30134d + "/" + this.f30159c.f30137g));
                        file = file3;
                        if (file3.exists()) {
                            file = file3;
                            if (!this.f30159c.f30154x.f30099c) {
                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
                                Date date = new Date();
                                this.f30159c.f30138h = simpleDateFormat.format(date) + AWSAppSyncClient.DATABASE_NAME_DELIMITER + this.f30159c.f30137g;
                                file = new File(String.valueOf(this.f30159c.f30134d + "/" + this.f30159c.f30138h));
                            }
                        }
                    } else {
                        file = new File(String.valueOf(this.f30159c.f30134d + "/" + this.f30159c.f30138h));
                    }
                    this.f30158b = new FileOutputStream(file, true);
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(this.f30158b);
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
                    byte[] bArr = new byte[1024];
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    long j10 = this.f30159c.f30132b;
                    this.f30159c.f30146p = true;
                    this.f30159c.f30152v = false;
                    while (true) {
                        int read = bufferedInputStream.read(bArr);
                        if (read != -1 && System.currentTimeMillis() / 1000 < currentTimeMillis + j10 && !this.f30159c.f30145o) {
                            h hVar2 = this.f30159c;
                            hVar2.f30154x.f30097a = PreferenceManager.getDefaultSharedPreferences(hVar2.f30131a);
                            h hVar3 = this.f30159c;
                            hVar3.f30152v = hVar3.f30154x.f30097a.getBoolean("CANCELLED", false);
                            if (this.f30159c.f30152v) {
                                this.f30159c.f30152v = true;
                                C5255e c5255e = this.f30159c.f30154x;
                                c5255e.f30098b = 0;
                                c5255e.f30099c = false;
                                SharedPreferences.Editor edit2 = c5255e.f30097a.edit();
                                edit2.putBoolean("CANCELLED", true);
                                edit2.apply();
                                break;
                            }
                            C5255e c5255e2 = this.f30159c.f30154x;
                            c5255e2.f30098b = 0;
                            c5255e2.f30099c = false;
                            bufferedOutputStream.write(bArr, 0, read);
                        } else {
                            break;
                        }
                    }
                    bufferedOutputStream.close();
                    bufferedInputStream.close();
                    return null;
                } catch (Exception e10) {
                    SharedPreferences.Editor edit3 = this.f30159c.f30154x.f30097a.edit();
                    edit3.putBoolean("CANCELLED", true);
                    edit3.apply();
                    this.f30159c.f30152v = true;
                    h hVar4 = this.f30159c;
                    hVar4.f30154x.f30099c = true;
                    hVar4.f30146p = false;
                    Log.e("Download Task", "Retrying " + e10.getMessage());
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Void r62) {
                Handler handler;
                Runnable runnableC10301b;
                h hVar;
                String string;
                try {
                } catch (Exception e10) {
                    e10.printStackTrace();
                    this.f30159c.f30147q = true;
                    h hVar2 = this.f30159c;
                    hVar2.m26295C(hVar2.f30131a.getResources().getString(2132017765));
                }
                if (this.f30158b == null) {
                    C5255e c5255e = this.f30159c.f30154x;
                    if (c5255e.f30099c) {
                        if (c5255e.f30098b >= c5255e.f30100d) {
                            h hVar3 = this.f30159c;
                            hVar3.f30154x.f30099c = false;
                            hVar3.f30147q = true;
                            hVar = this.f30159c;
                            string = hVar.f30131a.getResources().getString(2132017765);
                            hVar.m26295C(string);
                        } else {
                            this.f30159c.f30154x.f30099c = true;
                            handler = new Handler();
                            runnableC10301b = new RunnableC10301b(this);
                            handler.postDelayed(runnableC10301b, 10000L);
                        }
                    }
                    super.onPostExecute(r62);
                }
                if (this.f30159c.f30152v) {
                    C5255e c5255e2 = this.f30159c.f30154x;
                    if (c5255e2.f30099c) {
                        if (c5255e2.f30098b >= c5255e2.f30100d) {
                            C5255e.m26241k0(this.f30159c.f30131a, this.f30159c.f30131a.getResources().getString(2132017159));
                            h hVar4 = this.f30159c;
                            hVar4.f30154x.f30099c = false;
                            hVar4.f30147q = true;
                            hVar = this.f30159c;
                            string = hVar.f30131a.getResources().getString(2132017765);
                        } else {
                            this.f30159c.f30154x.f30099c = true;
                            handler = new Handler();
                            runnableC10301b = new a(this);
                            handler.postDelayed(runnableC10301b, 10000L);
                        }
                    }
                    super.onPostExecute(r62);
                }
                hVar = this.f30159c;
                string = hVar.f30131a.getResources().getString(2132017508);
                hVar.m26295C(string);
                super.onPostExecute(r62);
            }

            @Override // android.os.AsyncTask
            public void onPreExecute() {
                super.onPreExecute();
                this.f30159c.m26294B();
                this.f30159c.m26293A();
            }
        }

        public h(C5255e c5255e, Activity activity, String str, int i10, String str2, boolean z10, String str3) {
            this.f30154x = c5255e;
            this.f30131a = activity;
            this.f30136f = str;
            int i11 = i10 * 60;
            int i12 = i11 * 1000;
            this.f30133c = i12;
            this.f30135e = i12;
            this.f30132b = i11;
            this.f30148r = z10;
            this.f30134d = str3;
            this.f30137g = str2;
            c5255e.f30097a = PreferenceManager.getDefaultSharedPreferences(activity);
            new b(this, null).execute(new Void[0]);
        }

        /* renamed from: A */
        public void m26293A() {
            this.f30154x.f30097a = PreferenceManager.getDefaultSharedPreferences(this.f30131a);
            SharedPreferences.Editor edit = this.f30154x.f30097a.edit();
            edit.putBoolean("CANCELLED", false);
            edit.apply();
            PendingIntent m16200a = NotificationActivity.m16200a(this.f30144n, this.f30131a);
            if (Build.VERSION.SDK_INT >= 26) {
                return;
            }
            this.f30142l.m5771a(2131231963, "Stop", m16200a);
        }

        /* renamed from: B */
        public void m26294B() {
            NotificationManager notificationManager;
            int i10;
            Notification m5773c;
            Notification.Builder channelId;
            NotificationManager notificationManager2 = this.f30139i;
            if (notificationManager2 != null) {
                notificationManager2.cancelAll();
            }
            NotificationManager notificationManager3 = this.f30140j;
            if (notificationManager3 != null) {
                notificationManager3.cancelAll();
            }
            if (!this.f30154x.f30099c) {
                Context context = this.f30131a;
                Toast.makeText(context, context.getResources().getString(2132017599), 0).show();
            }
            this.f30139i = (NotificationManager) this.f30131a.getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
            C0964r.e eVar = new C0964r.e(this.f30131a);
            this.f30142l = eVar;
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel("ksjadf87", this.f30131a.getResources().getString(2132018447), 2);
                channelId = new Notification.Builder(this.f30131a).setContentTitle(this.f30131a.getResources().getString(2132017956)).setContentText(this.f30131a.getResources().getString(2132018447)).setSmallIcon(2131755009).setChannelId("ksjadf87");
                this.f30141k = channelId.setProgress(100, 0, true).build();
                this.f30139i.createNotificationChannel(notificationChannel);
                notificationManager = this.f30139i;
                i10 = this.f30144n;
                m5773c = this.f30141k;
            } else {
                eVar.m5783n(this.f30131a.getResources().getString(2132017956)).m5762B(100, 0, true).m5782m(this.f30131a.getResources().getString(2132018447)).m5764D(2131755009);
                notificationManager = this.f30139i;
                i10 = this.f30144n;
                m5773c = this.f30142l.m5773c();
            }
            notificationManager.notify(i10, m5773c);
            CountDownTimer countDownTimer = this.f30149s;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.f30149s = new a(this, 20000L, 1000L).start();
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x00cf, code lost:
        
            if (r5.f30154x.f30099c == false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0111, code lost:
        
            if (r5.f30154x.f30099c == false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0078, code lost:
        
            if (r5.f30154x.f30099c == false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x007b, code lost:
        
            r0 = r5.f30131a;
            android.widget.Toast.makeText(r0, r0.getResources().getString(r7), 0).show();
         */
        /* renamed from: C */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m26295C(java.lang.String r6) {
            /*
                Method dump skipped, instructions count: 312
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p151if.C5255e.h.m26295C(java.lang.String):void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:if/e$i.class
     */
    /* renamed from: if.e$i */
    /* loaded from: combined.jar:classes2.jar:if/e$i.class */
    public static class i implements View.OnFocusChangeListener {

        /* renamed from: b */
        public View f30162b;

        /* renamed from: c */
        public Activity f30163c;

        public i(View view, Activity activity) {
            this.f30162b = view;
            this.f30163c = activity;
        }

        public i(View view, CheckAppupdateActivity checkAppupdateActivity) {
            this.f30162b = view;
            this.f30163c = checkAppupdateActivity;
        }

        public i(View view, MultiUserActivity multiUserActivity) {
            this.f30162b = view;
            this.f30163c = multiUserActivity;
        }

        public i(View view, NewDashboardActivity newDashboardActivity) {
            this.f30162b = view;
            this.f30163c = newDashboardActivity;
        }

        public i(View view, RateUsActivity rateUsActivity) {
            this.f30162b = view;
            this.f30163c = rateUsActivity;
        }

        public i(View view, RecordingActivity recordingActivity) {
            this.f30162b = view;
            this.f30163c = recordingActivity;
        }

        public i(View view, VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories) {
            this.f30162b = view;
            this.f30163c = vodActivityNewFlowSubCategories;
        }

        public i(View view, NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity) {
            this.f30162b = view;
            this.f30163c = nSTIJKPlayerSkyActivity;
        }

        /* renamed from: a */
        public final void m26298a(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f30162b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: b */
        public final void m26299b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f30162b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            int i10;
            if (this.f30163c != null) {
                float f10 = 1.0f;
                if (!z10) {
                    if (z10) {
                        return;
                    }
                    m26298a(1.0f);
                    m26299b(1.0f);
                    View view2 = this.f30162b;
                    if (view2 != null && view2.getTag() != null && this.f30162b.getTag().equals("1")) {
                        view.setBackgroundResource(2131230845);
                    }
                    View view3 = this.f30162b;
                    if (view3 != null && view3.getTag() != null && this.f30162b.getTag().equals("2")) {
                        view.setBackgroundResource(2131230845);
                    }
                    View view4 = this.f30162b;
                    if (view4 == null || view4.getTag() == null || !this.f30162b.getTag().equals("3")) {
                        return;
                    }
                    view.setBackgroundResource(2131230845);
                    return;
                }
                if (z10) {
                    f10 = 1.12f;
                }
                View view5 = this.f30162b;
                if (view5 == null || view5.getTag() == null || !this.f30162b.getTag().equals("1")) {
                    View view6 = this.f30162b;
                    if (view6 == null || view6.getTag() == null || !this.f30162b.getTag().equals("2")) {
                        View view7 = this.f30162b;
                        if (view7 == null || view7.getTag() == null || !this.f30162b.getTag().equals("3")) {
                            view.setBackground(this.f30163c.getResources().getDrawable(2131231786));
                            return;
                        } else {
                            m26298a(f10);
                            m26299b(f10);
                            i10 = 2131230846;
                        }
                    } else {
                        m26298a(f10);
                        m26299b(f10);
                        i10 = 2131231576;
                    }
                } else {
                    m26298a(f10);
                    m26299b(f10);
                    i10 = 2131230828;
                }
                view.setBackgroundResource(i10);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:if/e$j.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: if.e$j */
    /* loaded from: combined.jar:classes2.jar:if/e$j.class */
    public static class j extends AsyncTask<Void, Boolean, Boolean> {

        /* renamed from: a */
        public final Context f30164a;

        /* renamed from: b */
        public final LiveStreamDBHandler f30165b;

        /* renamed from: c */
        public ArrayList<XMLTVProgrammePojo> f30166c;

        /* renamed from: d */
        public C9175c f30167d;

        /* renamed from: e */
        public String f30168e;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:if/e$j$a.class
         */
        @SuppressLint({"StaticFieldLeak"})
        /* renamed from: if.e$j$a */
        /* loaded from: combined.jar:classes2.jar:if/e$j$a.class */
        public class a extends AsyncTask<String, Integer, Boolean> {

            /* renamed from: a */
            public volatile boolean f30169a = true;

            /* renamed from: b */
            public Context f30170b;

            /* renamed from: c */
            public final j f30171c;

            public a(j jVar, Context context) {
                this.f30171c = jVar;
                this.f30170b = context;
            }

            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean doInBackground(String... strArr) {
                publishProgress(0);
                if (this.f30171c.f30165b != null) {
                    this.f30171c.f30165b.m15265y(this.f30171c.f30166c);
                    this.f30171c.f30166c.clear();
                    this.f30171c.f30165b.m15161E2("epg", "1", this.f30171c.f30168e);
                }
                return Boolean.TRUE;
            }

            @Override // android.os.AsyncTask
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Boolean bool) {
            }

            @Override // android.os.AsyncTask
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onProgressUpdate(Integer... numArr) {
            }

            @Override // android.os.AsyncTask
            public void onCancelled() {
                this.f30169a = false;
            }

            @Override // android.os.AsyncTask
            public void onPreExecute() {
            }
        }

        public j(int i10, Context context, LiveStreamDBHandler liveStreamDBHandler) {
            this.f30168e = "0";
            this.f30168e = String.valueOf(i10);
            this.f30164a = context;
            this.f30165b = liveStreamDBHandler;
        }

        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            LiveStreamDBHandler liveStreamDBHandler;
            if (!this.f30168e.equals("0") && (liveStreamDBHandler = this.f30165b) != null) {
                liveStreamDBHandler.m15246q2(this.f30168e);
            }
            Log.e("honey", "epg u 1");
            this.f30167d = new C9175c();
            Log.e("honey", "epg u 2");
            this.f30167d.m38610a(this.f30164a);
            Log.e("honey", "epg u 3");
            this.f30166c = this.f30167d.m38611b();
            Log.e("honey", "epg u 4");
            ArrayList<XMLTVProgrammePojo> arrayList = this.f30166c;
            if (arrayList == null || arrayList.size() <= 0) {
                LiveStreamDBHandler liveStreamDBHandler2 = this.f30165b;
                if (liveStreamDBHandler2 == null || liveStreamDBHandler2.m15163F1(this.f30168e) == 0) {
                    return Boolean.FALSE;
                }
                this.f30165b.m15161E2("epg", "1", this.f30168e);
            } else {
                Log.e("honey", "size u :" + this.f30166c.size());
            }
            return Boolean.TRUE;
        }

        @Override // android.os.AsyncTask
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            LiveStreamDBHandler liveStreamDBHandler;
            String str;
            try {
                if (bool.booleanValue()) {
                    C5251a.f30061q0 = false;
                    ArrayList<XMLTVProgrammePojo> arrayList = this.f30166c;
                    if (arrayList == null || arrayList.size() <= 0) {
                        return;
                    }
                    try {
                        C5255e.f30093q = new a(this, this.f30164a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
                        return;
                    } catch (Exception e10) {
                        liveStreamDBHandler = this.f30165b;
                        str = "0";
                    }
                } else {
                    liveStreamDBHandler = this.f30165b;
                    str = "2";
                }
                liveStreamDBHandler.m15161E2("epg", str, this.f30168e);
            } catch (Exception e11) {
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* renamed from: A */
    public static File[] m26198A(Context context) {
        if (context != null) {
            return new File(context.getSharedPreferences("recordingDir", 0).getString("recordingDir", String.valueOf(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "MAXDIGITAL")))).listFiles();
        }
        return null;
    }

    /* renamed from: B */
    public static String m26199B(Context context) {
        String str = "";
        if (context != null) {
            try {
                str = new SimpleDateFormat(context.getSharedPreferences("timeFormat", 0).getString("timeFormat", C5251a.f30053m0), Locale.US).format(new Date());
            } catch (Exception e10) {
                str = "";
            }
        }
        return str;
    }

    /* renamed from: C */
    public static long m26200C(Context context) {
        if (context == null) {
            return 0L;
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("loginPrefs", 0);
            f30085i = sharedPreferences;
            if (sharedPreferences != null) {
                return m26255v(sharedPreferences.getString("selectedEPGShift", C5251a.f30049k0));
            }
            return 0L;
        } catch (Exception e10) {
            return 0L;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f7, code lost:
    
        if (r0.equals(org.apache.http.HttpHost.DEFAULT_SCHEME_NAME) == false) goto L11;
     */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m26201D(android.content.Context r4, int r5, java.lang.String r6, java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p151if.C5255e.m26201D(android.content.Context, int, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c7, code lost:
    
        if (r0.equals(org.apache.http.HttpHost.DEFAULT_SCHEME_NAME) == false) goto L6;
     */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m26202E(android.content.Context r4, int r5, java.lang.String r6, java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p151if.C5255e.m26202E(android.content.Context, int, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c7, code lost:
    
        if (r0.equals(org.apache.http.HttpHost.DEFAULT_SCHEME_NAME) == false) goto L6;
     */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m26203F(android.content.Context r4, int r5, java.lang.String r6, java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 899
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p151if.C5255e.m26203F(android.content.Context, int, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b9, code lost:
    
        if (r0.equals(org.apache.http.HttpHost.DEFAULT_SCHEME_NAME) == false) goto L4;
     */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m26204G(android.content.Context r4) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p151if.C5255e.m26204G(android.content.Context):java.lang.String");
    }

    /* renamed from: H */
    public static void m26205H() {
        try {
            Dialog dialog = f30096t;
            if (dialog == null || !dialog.isShowing()) {
                return;
            }
            f30096t.dismiss();
        } catch (Exception e10) {
        }
    }

    /* renamed from: I */
    public static void m26206I(Context context) {
        LiveStreamDBHandler liveStreamDBHandler = new LiveStreamDBHandler(context);
        C6783a c6783a = new C6783a(context);
        ArrayList<EPGSourcesModel> m15208b1 = liveStreamDBHandler.m15208b1();
        String valueOf = (m15208b1 == null || m15208b1.size() <= 0) ? "0" : String.valueOf(m15208b1.get(0).m15121c());
        if (valueOf.equals("0")) {
            return;
        }
        ImportStatusModel m15224i2 = liveStreamDBHandler.m15224i2("epg", valueOf);
        ImportStatusModel importStatusModel = m15224i2;
        if (m15224i2.m15137d() == null) {
            importStatusModel = m15224i2;
            if (m15224i2.m15138e() == null) {
                importStatusModel = m15224i2;
                if (m15224i2.m15139f() == null) {
                    importStatusModel = new ImportStatusModel();
                    importStatusModel.m15145l("epg");
                    importStatusModel.m15143j("0");
                    importStatusModel.m15140g("");
                    importStatusModel.m15144k("");
                    importStatusModel.m15142i(valueOf);
                    ArrayList<ImportStatusModel> arrayList = new ArrayList<>();
                    arrayList.add(0, importStatusModel);
                    liveStreamDBHandler.m15228k2(arrayList, SharepreferenceDBHandler.m15373f(context));
                }
            }
        }
        if ((importStatusModel.m15137d() == null || !importStatusModel.m15137d().equals("2")) && (importStatusModel.m15137d() == null || !importStatusModel.m15137d().equals("0"))) {
            if (importStatusModel.m15137d() == null || !importStatusModel.m15137d().equals("1")) {
                if (importStatusModel.m15137d() != null) {
                    importStatusModel.m15137d().equals("3");
                    return;
                }
                return;
            } else {
                long m26250q = m26250q(new SimpleDateFormat("dd/MM/yyyy", Locale.US), importStatusModel.m15134a(), m26235h());
                if (!m26234g(context) || m26250q < c6783a.m31270h()) {
                    return;
                }
            }
        }
        m26207J(liveStreamDBHandler, valueOf, context);
    }

    /* renamed from: J */
    public static void m26207J(LiveStreamDBHandler liveStreamDBHandler, String str, Context context) {
        if (C5251a.f30061q0) {
            C5251a.f30061q0 = false;
        }
        liveStreamDBHandler.m15158D2("epg", "3");
        new j(m26215R(str), context, liveStreamDBHandler).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* renamed from: K */
    public static boolean m26208K(long j10, long j11, Context context) {
        if (context == null) {
            return false;
        }
        try {
            long millis = LocalDateTime.now().toDateTime().getMillis() + m26200C(context);
            return j10 <= millis && j11 >= millis;
        } catch (Exception e10) {
            return false;
        }
    }

    /* renamed from: L */
    public static String m26209L(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    /* renamed from: M */
    public static void m26210M(Context context) {
        if (context != null && C5251a.f30036e.booleanValue() && SharepreferenceDBHandler.m15373f(context).equals("m3u")) {
            context.startActivity(new Intent(context, (Class<?>) ImportM3uActivity.class));
        }
    }

    /* renamed from: N */
    public static void m26211N(Context context) {
        if (context != null) {
            if (!C5251a.f30011J.booleanValue()) {
                Toast.makeText(context, context.getString(2132017978), 0).show();
            }
            C5251a.f30011J = Boolean.FALSE;
            Intent intent = C5251a.f30034d.booleanValue() ? new Intent(context, (Class<?>) MultiUserActivity.class) : (C5251a.f30036e.booleanValue() && C5251a.f30038f.booleanValue()) ? new Intent(context, (Class<?>) RoutingActivity.class) : new Intent(context, (Class<?>) LoginActivity.class);
            SharedPreferences sharedPreferences = context.getSharedPreferences("loginPrefs", 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            String string = sharedPreferences.getString("selectedEPGShift", "");
            edit.clear();
            edit.apply();
            edit.putString("selectedEPGShift", string);
            edit.apply();
            SharedPreferences.Editor edit2 = context.getSharedPreferences("sharedprefremberme", 0).edit();
            edit2.clear();
            edit2.apply();
            if (C5251a.f30036e.booleanValue() && C5251a.f30038f.booleanValue()) {
                SharedPreferences.Editor edit3 = context.getSharedPreferences("sharedprefremberme", 0).edit();
                edit3.putBoolean("savelogin", false);
                edit3.apply();
                if (SharepreferenceDBHandler.m15373f(context).equalsIgnoreCase("m3u")) {
                    SharedPreferences.Editor edit4 = context.getSharedPreferences("sharedprefremberme", 0).edit();
                    edit4.clear();
                    edit4.apply();
                }
            }
            if (C5251a.f30032c.booleanValue() && !(C5251a.f30036e.booleanValue() && C5251a.f30038f.booleanValue())) {
                context.startActivity(intent);
            } else {
                context.startActivity(intent);
                ((Activity) context).finish();
            }
        }
    }

    /* renamed from: O */
    public static String m26212O(String str) {
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

    /* renamed from: P */
    public static String m26213P(String str) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").format(new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.US).parse(str));
        } catch (ParseException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* renamed from: Q */
    public static int m26214Q(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            return -1;
        }
    }

    /* renamed from: R */
    public static int m26215R(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            return 0;
        }
    }

    /* renamed from: S */
    public static String[] m26216S() {
        return Build.VERSION.SDK_INT >= 33 ? f30094r : f30095s;
    }

    /* renamed from: T */
    public static void m26217T(Context context, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        f30087k = new C6783a(context);
        Intent intent = new Intent(context, (Class<?>) NSTIJKPlayerEPGActivity.class);
        intent.putExtra("MultiPlayer", "true");
        intent.putExtra("OPENED_STREAM_ID", i10);
        intent.putExtra("STREAM_TYPE", str);
        intent.putExtra("VIDEO_NUM", !str2.equals("") ? m26215R(str2) : -1);
        intent.putExtra("VIDEO_TITLE", str3);
        intent.putExtra("EPG_CHANNEL_ID", str4);
        intent.putExtra("EPG_CHANNEL_LOGO", str5);
        intent.putExtra("OPENED_CAT_ID", str6);
        intent.putExtra("VIDEO_URL", str7);
        context.startActivity(intent);
    }

    /* renamed from: U */
    public static void m26218U(Context context, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Intent intent;
        if (context != null) {
            try {
                String m15369d = SharepreferenceDBHandler.m15369d(context);
                if (!SharepreferenceDBHandler.m15369d(context).equals(CookieSpecs.DEFAULT) && !new ExternalPlayerDataBase(context).m15130f(m15369d)) {
                    SharepreferenceDBHandler.m15350N(CookieSpecs.DEFAULT, CookieSpecs.DEFAULT, context);
                }
                f30087k = new C6783a(context);
                String m15371e = SharepreferenceDBHandler.m15371e(context);
                if (!m15371e.equals(CookieSpecs.DEFAULT)) {
                    String m26201D = m26201D(context, i10, str6, str8);
                    String m15369d2 = SharepreferenceDBHandler.m15369d(context);
                    Intent intent2 = new Intent(context, (Class<?>) PlayExternalPlayerActivity.class);
                    intent2.putExtra("url", m26201D);
                    intent2.putExtra("packagename", m15371e);
                    intent2.putExtra("app_name", m15369d2);
                    context.startActivity(intent2);
                    return;
                }
                if (f30087k.m31285w() == 3) {
                    f30087k.m31258Q(context.getResources().getString(2132017829));
                    intent = new Intent(context, (Class<?>) HoneyPlayer.class);
                } else {
                    intent = new Intent(context, (Class<?>) HoneyPlayer.class);
                }
                intent.putExtra("OPENED_STREAM_ID", i10);
                intent.putExtra("type", "catch_up");
                intent.putExtra("VIDEO_NUM", m26215R(str2));
                intent.putExtra("VIDEO_TITLE", str3);
                intent.putExtra("STREAM_START_TIME", str6);
                intent.putExtra("STREAM_STOP_TIME", str8);
                context.startActivity(intent);
            } catch (Exception e10) {
            }
        }
    }

    /* renamed from: V */
    public static void m26219V(Context context, String str, int i10, String str2, String str3, String str4, String str5, List<GetEpisdoeDetailsCallback> list, String str6) {
        Intent intent;
        if (context != null) {
            String m15398u = SharepreferenceDBHandler.m15398u(context);
            if (!SharepreferenceDBHandler.m15399v(context).equals(CookieSpecs.DEFAULT) && !new ExternalPlayerDataBase(context).m15130f(m15398u)) {
                SharepreferenceDBHandler.m15366b0(CookieSpecs.DEFAULT, CookieSpecs.DEFAULT, context);
            }
            String m15399v = SharepreferenceDBHandler.m15399v(context);
            if (!m15399v.equals(CookieSpecs.DEFAULT)) {
                String m26202E = SharepreferenceDBHandler.m15373f(context).equals("m3u") ? str6 : m26202E(context, i10, str3, "series");
                String m15398u2 = SharepreferenceDBHandler.m15398u(context);
                Intent intent2 = new Intent(context, (Class<?>) PlayExternalPlayerActivity.class);
                intent2.putExtra("url", m26202E);
                intent2.putExtra("packagename", m15399v);
                intent2.putExtra("app_name", m15398u2);
                context.startActivity(intent2);
                return;
            }
            f30087k = new C6783a(context);
            String str7 = SharepreferenceDBHandler.m15373f(context).equalsIgnoreCase("m3u") ? "movies_m3u" : "series";
            if (f30087k.m31285w() == 3) {
                f30087k.m31258Q(context.getResources().getString(2132017829));
                intent = new Intent(context, (Class<?>) HoneyPlayer.class);
                intent.putExtra("type", str7);
                intent.putExtra("OPENED_STREAM_ID", i10);
                intent.putExtra("STREAM_TYPE", str2);
                intent.putExtra("VIDEO_NUM", m26215R(str4));
                intent.putExtra("VIDEO_TITLE", str5);
                intent.putExtra("CONTAINER_EXTENSION", str3);
                intent.putExtra("EPISODES", (Serializable) list);
                intent.putExtra("VIDEO_URL", str6);
            } else {
                intent = new Intent(context, (Class<?>) HoneyPlayer.class);
            }
            intent.putExtra("type", str7);
            intent.putExtra("OPENED_STREAM_ID", i10);
            intent.putExtra("STREAM_TYPE", str2);
            intent.putExtra("VIDEO_NUM", m26215R(str4));
            intent.putExtra("VIDEO_TITLE", str5);
            intent.putExtra("CONTAINER_EXTENSION", str3);
            intent.putExtra("EPISODES", (Serializable) list);
            intent.putExtra("VIDEO_URL", str6);
            context.startActivity(intent);
        }
    }

    /* renamed from: W */
    public static void m26220W(Context context, String str, int i10, String str2, String str3, String str4, String str5, String str6, int i11) {
        if (context != null) {
            String m15340D = SharepreferenceDBHandler.m15340D(context);
            if (!SharepreferenceDBHandler.m15341E(context).equals(CookieSpecs.DEFAULT) && !new ExternalPlayerDataBase(context).m15130f(m15340D)) {
                SharepreferenceDBHandler.m15382j0(CookieSpecs.DEFAULT, CookieSpecs.DEFAULT, context);
            }
            String str7 = SharepreferenceDBHandler.m15373f(context).equalsIgnoreCase("m3u") ? "movies_m3u" : "movies";
            String m15340D2 = SharepreferenceDBHandler.m15340D(context);
            String m15341E = SharepreferenceDBHandler.m15341E(context);
            if (!m15341E.equals(CookieSpecs.DEFAULT)) {
                if (!SharepreferenceDBHandler.m15373f(context).equalsIgnoreCase("m3u")) {
                    str6 = m26202E(context, i10, str3, "movie");
                }
                Intent intent = new Intent(context, (Class<?>) PlayExternalPlayerActivity.class);
                intent.putExtra("url", str6);
                intent.putExtra("packagename", m15341E);
                intent.putExtra("app_name", m15340D2);
                context.startActivity(intent);
                return;
            }
            C6783a c6783a = new C6783a(context);
            f30087k = c6783a;
            Intent intent2 = c6783a.m31285w() == 3 ? new Intent(context, (Class<?>) ExoPlayerMoviesSeriesActivity.class) : new Intent(context, (Class<?>) HoneyPlayer.class);
            intent2.putExtra("type", str7);
            intent2.putExtra("OPENED_STREAM_ID", i10);
            intent2.putExtra("STREAM_TYPE", str2);
            intent2.putExtra("STREAM_TOTAL_DURATION", i11);
            intent2.putExtra("VIDEO_NUM", m26215R(str4));
            intent2.putExtra("VIDEO_TITLE", str5);
            intent2.putExtra("CONTAINER_EXTENSION", str3);
            intent2.putExtra("VIDEO_URL", str6);
            context.startActivity(intent2);
        }
    }

    /* renamed from: X */
    public static void m26221X(Context context, String str, int i10, String str2, int i11, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (context != null) {
            f30087k = new C6783a(context);
            String m15385l = SharepreferenceDBHandler.m15385l(context);
            Intent intent = (m15385l == null || !m15385l.equalsIgnoreCase(CookieSpecs.DEFAULT)) ? new Intent(context, (Class<?>) NSTEXOPlayerSkyActivity.class) : new Intent(context, (Class<?>) NSTIJKPlayerSkyActivity.class);
            intent.putExtra("OPENED_STREAM_ID", i10);
            intent.putExtra("STREAM_TYPE", str2);
            intent.putExtra("VIDEO_NUM", i11);
            intent.putExtra("VIDEO_TITLE", str3);
            intent.putExtra("EPG_CHANNEL_ID", str4);
            intent.putExtra("EPG_CHANNEL_LOGO", str5);
            intent.putExtra("OPENED_CAT_ID", str6);
            intent.putExtra("VIDEO_URL", str7);
            intent.putExtra("OPENED_CAT_NAME", str8);
            context.startActivity(intent);
        }
    }

    /* renamed from: Y */
    public static void m26222Y(Context context, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        String str9;
        Intent intent;
        if (context != null) {
            String m15375g = SharepreferenceDBHandler.m15375g(context);
            if (!SharepreferenceDBHandler.m15377h(context).equals(CookieSpecs.DEFAULT) && !new ExternalPlayerDataBase(context).m15130f(m15375g)) {
                SharepreferenceDBHandler.m15352P(CookieSpecs.DEFAULT, CookieSpecs.DEFAULT, context);
            }
            String m15377h = SharepreferenceDBHandler.m15377h(context);
            if (m15377h.equals(CookieSpecs.DEFAULT)) {
                C6783a c6783a = new C6783a(context);
                f30087k = c6783a;
                if (c6783a.m31285w() == 3) {
                    f30087k.m31258Q(context.getResources().getString(2132017829));
                    intent = new Intent(context, (Class<?>) NSTIJKPlayerEPGActivity.class);
                } else {
                    intent = new Intent(context, (Class<?>) NSTIJKPlayerEPGActivity.class);
                }
                intent.putExtra("MultiPlayer", "false");
                intent.putExtra("OPENED_STREAM_ID", i10);
                intent.putExtra("STREAM_TYPE", str2);
                int i11 = -1;
                if (!str3.equals("")) {
                    i11 = m26215R(str3);
                }
                intent.putExtra("VIDEO_NUM", i11);
                intent.putExtra("VIDEO_TITLE", str4);
                intent.putExtra("EPG_CHANNEL_ID", str5);
                intent.putExtra("EPG_CHANNEL_LOGO", str6);
                intent.putExtra("OPENED_CAT_ID", str7);
                intent.putExtra("VIDEO_URL", str8);
                context.startActivity(intent);
                return;
            }
            String string = context.getSharedPreferences("allowedFormat", 0).getString("allowedFormat", "");
            if (string != null && !string.isEmpty() && !string.equals("") && string.equals(CookieSpecs.DEFAULT)) {
                str9 = "";
            } else if (string == null || string.isEmpty() || string.equals("") || !string.equals("ts")) {
                str9 = "";
                if (string != null) {
                    str9 = "";
                    if (!string.isEmpty()) {
                        str9 = "";
                        if (!string.equals("")) {
                            str9 = "";
                            if (string.equals("m3u8")) {
                                str9 = ".m3u8";
                            }
                        }
                    }
                }
            } else {
                str9 = ".ts";
            }
            if (!SharepreferenceDBHandler.m15373f(context).equalsIgnoreCase("m3u")) {
                str8 = m26203F(context, i10, str9, "live");
            }
            String m15375g2 = SharepreferenceDBHandler.m15375g(context);
            Intent intent2 = new Intent(context, (Class<?>) PlayExternalPlayerActivity.class);
            intent2.putExtra("url", str8);
            intent2.putExtra("packagename", m15377h);
            intent2.putExtra("app_name", m15375g2);
            context.startActivity(intent2);
        }
    }

    /* renamed from: Z */
    public static C4555v m26223Z(Context context) {
        if (context == null) {
            return null;
        }
        try {
            String lowerCase = context.getSharedPreferences("loginPrefsserverurl", 0).getString(C5251a.f30066t, "").toLowerCase();
            Log.e("URl from Back", ">>>>>>>>" + lowerCase);
            String str = lowerCase;
            if (!lowerCase.startsWith("http://")) {
                str = lowerCase;
                if (!lowerCase.startsWith("https://")) {
                    str = "http://" + lowerCase;
                }
            }
            String str2 = str;
            if (!str.endsWith("/")) {
                str2 = str + "/";
            }
            C5251a.f30009H = str2;
            C5402b0.a aVar = new C5402b0.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            return new C4555v.b().m22968b(str2).m22972f(aVar.m26828c(60L, timeUnit).m26825M(60L, timeUnit).m26823K(60L, timeUnit).m26830e(true).m26827b()).m22967a(C4730a.m23884f()).m22970d();
        } catch (IllegalArgumentException | NullPointerException | Exception e10) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m26224a(Context context) {
        context.startActivity(new Intent(context, (Class<?>) NewDashboardActivity.class));
    }

    /* renamed from: a0 */
    public static C4555v m26225a0(Context context) {
        if (context == null) {
            return null;
        }
        try {
            C5402b0.a aVar = new C5402b0.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            return new C4555v.b().m22968b("https://users.iptvsmarters.com/").m22972f(aVar.m26828c(60L, timeUnit).m26825M(60L, timeUnit).m26823K(60L, timeUnit).m26830e(false).m26827b()).m22967a(C4730a.m23884f()).m22970d();
        } catch (IllegalArgumentException | NullPointerException | Exception e10) {
            return null;
        }
    }

    /* renamed from: b0 */
    public static C4555v m26227b0(Context context) {
        if (context == null) {
            return null;
        }
        try {
            C5402b0.a aVar = new C5402b0.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            return new C4555v.b().m22968b("http://api.themoviedb.org/3/").m22972f(aVar.m26828c(60L, timeUnit).m26825M(60L, timeUnit).m26823K(60L, timeUnit).m26830e(false).m26827b()).m22967a(C4730a.m23884f()).m22970d();
        } catch (IllegalArgumentException | NullPointerException | Exception e10) {
            return null;
        }
    }

    /* renamed from: c0 */
    public static void m26229c0(Context context) {
        if (context != null) {
            try {
                new C6783a(context).m31288z();
            } catch (Exception e10) {
            }
        }
    }

    /* renamed from: e */
    public static boolean m26231e(String str, Context context) {
        if (context == null) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException e10) {
            return false;
        }
    }

    /* renamed from: e0 */
    public static void m26232e0(Context context, String str) {
        String str2 = "en";
        if (!str.equals("English")) {
            if (str.equals("Polish")) {
                str2 = "pl";
            } else if (str.equals("Portuguese")) {
                str2 = "pt";
            } else if (str.equals("Turkish")) {
                str2 = "tr";
            } else if (str.equals("Croatian")) {
                str2 = "hr";
            } else if (str.equals("Spanish")) {
                str2 = "es";
            } else if (str.equals("Arabic")) {
                str2 = "ar";
            } else if (str.equals("French")) {
                str2 = "fr";
            } else if (str.equals("German")) {
                str2 = "de";
            } else if (str.equals("Italian")) {
                str2 = "it";
            } else if (str.equals("Romanian")) {
                str2 = "ro";
            } else if (str.equals("Hungary")) {
                str2 = "hu";
            } else if (str.equals("Albanian")) {
                str2 = "sq";
            } else if (str.equals("Korean")) {
                str2 = "ko";
            } else if (str.equals("Hebrew")) {
                str2 = "he";
            } else if (str.equals("Ukrainian")) {
                str2 = "uk";
            } else if (str.equals("Malay")) {
                str2 = "ms";
            } else if (str.equals("Dutch")) {
                str2 = "nl";
            } else if (str.equals("Indonesian")) {
                str2 = "in";
            } else if (str.equals("Swedish")) {
                str2 = "sv";
            }
        }
        if (context != null) {
            Resources resources = context.getResources();
            Resources resources2 = context.getApplicationContext().getResources();
            Locale locale = new Locale(str2);
            Locale.setDefault(locale);
            Configuration configuration = new Configuration();
            configuration.locale = locale;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            resources2.updateConfiguration(configuration, resources.getDisplayMetrics());
            Configuration configuration2 = resources.getConfiguration();
            configuration2.setLocale(locale);
            context.getApplicationContext().createConfigurationContext(configuration2);
            context.createConfigurationContext(configuration2);
        }
    }

    /* renamed from: f */
    public static void m26233f(Context context) {
        if (context != null) {
            String string = context.getSharedPreferences("selected_language", 0).getString("selected_language", "");
            if (string.equals("")) {
                return;
            }
            m26232e0(context, string);
        }
    }

    /* renamed from: g */
    public static boolean m26234g(Context context) {
        return context.getSharedPreferences("automation_epg", 0).getString("automation_epg", "").equals("checked");
    }

    /* renamed from: h */
    public static String m26235h() {
        return m26213P(Calendar.getInstance().getTime().toString());
    }

    /* renamed from: h0 */
    public static void m26236h0(Activity activity) {
        try {
            Dialog dialog = new Dialog(activity);
            f30096t = dialog;
            dialog.setContentView(2131624518);
            f30096t.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            f30096t.getWindow().setGravity(17);
            f30096t.setCancelable(false);
            f30096t.show();
        } catch (Exception e10) {
        }
    }

    /* renamed from: i */
    public static void m26237i(Context context) {
        try {
            m26239j(context.getCacheDir());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: i0 */
    public static void m26238i0(Context context) {
        Dialog dialog = new Dialog(context);
        f30096t = dialog;
        dialog.setContentView(2131624518);
        f30096t.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        f30096t.getWindow().setGravity(17);
        f30096t.setCancelable(false);
        f30096t.show();
    }

    /* renamed from: j */
    public static boolean m26239j(File file) {
        if (file == null || !file.isDirectory()) {
            if (file == null || !file.isFile()) {
                return false;
            }
            return file.delete();
        }
        for (String str : file.list()) {
            if (!m26239j(new File(file, str))) {
                return false;
            }
        }
        return file.delete();
    }

    /* renamed from: k */
    public static void m26240k(File file) {
        try {
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    m26240k(file2);
                }
            }
            file.delete();
        } catch (Exception e10) {
        }
    }

    /* renamed from: k0 */
    public static void m26241k0(Context context, String str) {
        if (context == null || str == "" || str.isEmpty()) {
            return;
        }
        Toast.makeText(context, str, 0).show();
    }

    /* renamed from: l */
    public static long m26242l(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: l0 */
    public static void m26243l0(Context context, String str) {
        if (context == null || str == "" || str.isEmpty()) {
            return;
        }
        Toast.makeText(context, str, 1).show();
    }

    /* renamed from: m */
    public static long m26244m(String str, Context context) {
        if (str == null) {
            return 0L;
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(new C6783a(context).m31243B()));
            return simpleDateFormat.parse(str.substring(0, 14)).getTime();
        } catch (NumberFormatException e10) {
            Log.e("XMLTVReader", "Exception", e10);
            return 0L;
        } catch (Exception e11) {
            Log.e("XMLTVReader", "Exception", e11);
            return 0L;
        }
    }

    /* renamed from: m0 */
    public static String m26245m0(long j10) {
        try {
            TimeUnit timeUnit = TimeUnit.DAYS;
            int i10 = 0;
            List asList = Arrays.asList(Long.valueOf(timeUnit.toMillis(365L)), Long.valueOf(timeUnit.toMillis(30L)), Long.valueOf(timeUnit.toMillis(1L)), Long.valueOf(TimeUnit.HOURS.toMillis(1L)), Long.valueOf(TimeUnit.MINUTES.toMillis(1L)), Long.valueOf(TimeUnit.SECONDS.toMillis(1L)));
            List asList2 = Arrays.asList("year", "month", "day", "hour", "min", "sec");
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                if (i10 >= asList.size()) {
                    break;
                }
                long longValue = j10 / ((Long) asList.get(i10)).longValue();
                if (longValue > 0) {
                    stringBuffer.append(longValue);
                    stringBuffer.append(" ");
                    stringBuffer.append((String) asList2.get(i10));
                    stringBuffer.append(longValue != 1 ? "s" : "");
                    stringBuffer.append(" ago");
                } else {
                    i10++;
                }
            }
            return "".equals(stringBuffer.toString()) ? "0 sec ago" : stringBuffer.toString();
        } catch (Exception e10) {
            return "0 sec ago";
        }
    }

    /* renamed from: n */
    public static void m26246n(Context context) {
        String m26247n0 = m26247n0(C7705a.m33651a());
        String packageName = context.getApplicationContext().getPackageName();
        String m26209L = m26209L(context);
        String m26247n02 = m26247n0(C7708d.m33672d());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.US);
        if (m26242l(simpleDateFormat, simpleDateFormat.format(new Date(C7709e.m33680a(context))), simpleDateFormat.format(new Date())) < C7707c.m33667p() || m26247n0 == null || m26247n02 == null) {
            return;
        }
        if (m26209L.equals(m26247n0) && packageName.equals(m26247n02)) {
            return;
        }
        Toast.makeText(context, m26247n0(C7711g.m33686a() + C7711g.m33687i()) + m26247n0(C4044c.m19709i() + C4044c.m19708h()) + m26247n0(C4043b.m19702f() + C4043b.m19703h()), 1).show();
        ((Activity) context).finishAffinity();
    }

    /* renamed from: n0 */
    public static String m26247n0(String str) {
        return new String(Base64.decode(str, 0), StandardCharsets.UTF_8);
    }

    /* renamed from: o */
    public static C4555v m26248o(Context context) {
        C5402b0.a aVar = new C5402b0.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return new C4555v.b().m22968b("http://51.158.145.183/").m22972f(aVar.m26828c(60L, timeUnit).m26825M(60L, timeUnit).m26823K(60L, timeUnit).m26830e(false).m26827b()).m22967a(C4730a.m23884f()).m22970d();
    }

    /* renamed from: p */
    public static String m26249p(String str) {
        try {
            return new SimpleDateFormat(" MMMM dd,yyyy").format(new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.US).parse(str));
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* renamed from: q */
    public static long m26250q(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: r */
    public static String m26251r() {
        return Build.MANUFACTURER + " " + Build.PRODUCT;
    }

    /* renamed from: s */
    public static String m26252s(String str) {
        return str.replaceAll(" ", "%20");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: t */
    public static int m26253t(String str) {
        str.hashCode();
        int i10 = 19;
        boolean z10 = -1;
        switch (str.hashCode()) {
            case 3121:
                if (str.equals("ar")) {
                    z10 = false;
                    break;
                }
                break;
            case 3201:
                if (str.equals("de")) {
                    z10 = true;
                    break;
                }
                break;
            case 3241:
                if (str.equals("en")) {
                    z10 = 2;
                    break;
                }
                break;
            case 3246:
                if (str.equals("es")) {
                    z10 = 3;
                    break;
                }
                break;
            case 3276:
                if (str.equals("fr")) {
                    z10 = 4;
                    break;
                }
                break;
            case 3325:
                if (str.equals("he")) {
                    z10 = 5;
                    break;
                }
                break;
            case 3338:
                if (str.equals("hr")) {
                    z10 = 6;
                    break;
                }
                break;
            case 3341:
                if (str.equals("hu")) {
                    z10 = 7;
                    break;
                }
                break;
            case 3365:
                if (str.equals("in")) {
                    z10 = 8;
                    break;
                }
                break;
            case 3371:
                if (str.equals("it")) {
                    z10 = 9;
                    break;
                }
                break;
            case 3428:
                if (str.equals("ko")) {
                    z10 = 10;
                    break;
                }
                break;
            case 3494:
                if (str.equals("ms")) {
                    z10 = 11;
                    break;
                }
                break;
            case 3518:
                if (str.equals("nl")) {
                    z10 = 12;
                    break;
                }
                break;
            case 3580:
                if (str.equals("pl")) {
                    z10 = 13;
                    break;
                }
                break;
            case 3588:
                if (str.equals("pt")) {
                    z10 = 14;
                    break;
                }
                break;
            case 3645:
                if (str.equals("ro")) {
                    z10 = 15;
                    break;
                }
                break;
            case 3678:
                if (str.equals("sq")) {
                    z10 = 16;
                    break;
                }
                break;
            case 3683:
                if (str.equals("sv")) {
                    z10 = 17;
                    break;
                }
                break;
            case 3710:
                if (str.equals("tr")) {
                    z10 = 18;
                    break;
                }
                break;
            case 3734:
                if (str.equals("uk")) {
                    z10 = 19;
                    break;
                }
                break;
        }
        switch (z10) {
            case false:
                i10 = 6;
                break;
            case true:
                i10 = 8;
                break;
            case true:
            default:
                i10 = 0;
                break;
            case true:
                i10 = 5;
                break;
            case true:
                i10 = 7;
                break;
            case true:
                i10 = 14;
                break;
            case true:
                i10 = 4;
                break;
            case true:
                i10 = 11;
                break;
            case true:
                i10 = 18;
                break;
            case true:
                i10 = 9;
                break;
            case true:
                i10 = 13;
                break;
            case true:
                i10 = 16;
                break;
            case true:
                i10 = 17;
                break;
            case true:
                i10 = 1;
                break;
            case true:
                i10 = 2;
                break;
            case true:
                i10 = 10;
                break;
            case true:
                i10 = 12;
                break;
            case true:
                break;
            case true:
                i10 = 3;
                break;
            case true:
                i10 = 15;
                break;
        }
        return i10;
    }

    @SuppressLint({"HardwareIds"})
    /* renamed from: u */
    public static String m26254u(Context context) {
        NetworkInterface networkInterface;
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (string != null && !string.equals("")) {
                return string;
            }
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            do {
                if (!it.hasNext()) {
                    return "";
                }
                networkInterface = (NetworkInterface) it.next();
            } while (!networkInterface.getName().equalsIgnoreCase("wlan0"));
            byte[] hardwareAddress = networkInterface.getHardwareAddress();
            if (hardwareAddress == null) {
                try {
                    return ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getMacAddress();
                } catch (Exception e10) {
                    return "";
                }
            }
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : hardwareAddress) {
                sb2.append(String.format("%02X:", Byte.valueOf(b10)));
            }
            if (sb2.length() > 0) {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            return sb2.toString();
        } catch (Exception e11) {
            return "";
        }
    }

    /* renamed from: v */
    public static int m26255v(String str) {
        int i10;
        int i11 = 0;
        if (str != null) {
            i11 = 0;
            try {
                if (!str.isEmpty()) {
                    if (str.contains(Marker.ANY_NON_NULL_MARKER)) {
                        i10 = m26215R(str.split("\\+")[1]);
                    } else {
                        i11 = 0;
                        if (str.contains("-")) {
                            i10 = -m26215R(str.split("\\-")[1]);
                        }
                    }
                    i11 = i10 * 60 * 60 * 1000;
                }
            } catch (Exception e10) {
                i11 = 0;
            }
        }
        return i11;
    }

    /* renamed from: w */
    public static String m26256w(String str, Context context) {
        String str2;
        try {
            String string = context.getSharedPreferences("timeFormat", 0).getString("timeFormat", C5251a.f30053m0);
            C6783a c6783a = new C6783a(context);
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(string, locale);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(c6783a.m31243B()));
            str2 = simpleDateFormat2.format(new Date(Long.parseLong(String.valueOf(Long.valueOf(simpleDateFormat.parse(str).getTime())))));
            Log.e("TimeZone", TimeZone.getDefault().getID());
        } catch (Exception e10) {
            str2 = "00-00-0000 00:00";
        }
        return str2;
    }

    /* renamed from: x */
    public static int m26257x(Context context) {
        return (int) ((r0.widthPixels / context.getResources().getDisplayMetrics().density) / 180.0f);
    }

    /* renamed from: y */
    public static int m26258y(long j10, long j11, Context context) {
        if (context == null) {
            return 0;
        }
        try {
            long millis = LocalDateTime.now().toDateTime().getMillis() + m26200C(context);
            if (j10 >= j11 || millis >= j11) {
                return 0;
            }
            if (millis <= j10) {
                return 100;
            }
            return (int) (((j11 - millis) * 100) / (j11 - j10));
        } catch (Exception e10) {
            return 0;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: z */
    public static int m26259z(String str) {
        str.hashCode();
        int i10 = 21;
        boolean z10 = -1;
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    z10 = false;
                    break;
                }
                break;
            case 1382:
                if (str.equals("+1")) {
                    z10 = true;
                    break;
                }
                break;
            case 1383:
                if (str.equals("+2")) {
                    z10 = 2;
                    break;
                }
                break;
            case 1384:
                if (str.equals("+3")) {
                    z10 = 3;
                    break;
                }
                break;
            case 1385:
                if (str.equals("+4")) {
                    z10 = 4;
                    break;
                }
                break;
            case 1386:
                if (str.equals("+5")) {
                    z10 = 5;
                    break;
                }
                break;
            case 1387:
                if (str.equals("+6")) {
                    z10 = 6;
                    break;
                }
                break;
            case 1388:
                if (str.equals("+7")) {
                    z10 = 7;
                    break;
                }
                break;
            case 1389:
                if (str.equals("+8")) {
                    z10 = 8;
                    break;
                }
                break;
            case 1390:
                if (str.equals("+9")) {
                    z10 = 9;
                    break;
                }
                break;
            case 1444:
                if (str.equals("-1")) {
                    z10 = 10;
                    break;
                }
                break;
            case 1445:
                if (str.equals("-2")) {
                    z10 = 11;
                    break;
                }
                break;
            case 1446:
                if (str.equals("-3")) {
                    z10 = 12;
                    break;
                }
                break;
            case 1447:
                if (str.equals("-4")) {
                    z10 = 13;
                    break;
                }
                break;
            case 1448:
                if (str.equals("-5")) {
                    z10 = 14;
                    break;
                }
                break;
            case 1449:
                if (str.equals("-6")) {
                    z10 = 15;
                    break;
                }
                break;
            case 1450:
                if (str.equals("-7")) {
                    z10 = 16;
                    break;
                }
                break;
            case 1451:
                if (str.equals("-8")) {
                    z10 = 17;
                    break;
                }
                break;
            case 1452:
                if (str.equals("-9")) {
                    z10 = 18;
                    break;
                }
                break;
            case 42890:
                if (str.equals("+10")) {
                    z10 = 19;
                    break;
                }
                break;
            case 42891:
                if (str.equals("+11")) {
                    z10 = 20;
                    break;
                }
                break;
            case 42892:
                if (str.equals("+12")) {
                    z10 = 21;
                    break;
                }
                break;
            case 44812:
                if (str.equals("-10")) {
                    z10 = 22;
                    break;
                }
                break;
            case 44813:
                if (str.equals("-11")) {
                    z10 = 23;
                    break;
                }
                break;
            case 44814:
                if (str.equals("-12")) {
                    z10 = 24;
                    break;
                }
                break;
        }
        switch (z10) {
            case false:
            default:
                i10 = 12;
                break;
            case true:
                i10 = 13;
                break;
            case true:
                i10 = 14;
                break;
            case true:
                i10 = 15;
                break;
            case true:
                i10 = 16;
                break;
            case true:
                i10 = 17;
                break;
            case true:
                i10 = 18;
                break;
            case true:
                i10 = 19;
                break;
            case true:
                i10 = 20;
                break;
            case true:
                break;
            case true:
                i10 = 11;
                break;
            case true:
                i10 = 10;
                break;
            case true:
                i10 = 9;
                break;
            case true:
                i10 = 8;
                break;
            case true:
                i10 = 7;
                break;
            case true:
                i10 = 6;
                break;
            case true:
                i10 = 5;
                break;
            case true:
                i10 = 4;
                break;
            case true:
                i10 = 3;
                break;
            case true:
                i10 = 22;
                break;
            case true:
                i10 = 23;
                break;
            case true:
                i10 = 24;
                break;
            case true:
                i10 = 2;
                break;
            case true:
                i10 = 1;
                break;
            case true:
                i10 = 0;
                break;
        }
        return i10;
    }

    @SuppressLint({"DefaultLocale"})
    /* renamed from: d0 */
    public String m26260d0(int i10) {
        return String.format("%02d:%02d:%02d", Integer.valueOf(i10 / 3600), Integer.valueOf((i10 % 3600) / 60), Integer.valueOf(i10 % 60));
    }

    /* renamed from: f0 */
    public void m26261f0(RecordingActivity recordingActivity, File file, RecordingAdapter recordingAdapter, ArrayList<File> arrayList, TextView textView) {
        if (recordingActivity != null) {
            RelativeLayout relativeLayout = (RelativeLayout) recordingActivity.findViewById(2131429033);
            LayoutInflater layoutInflater = (LayoutInflater) recordingActivity.getSystemService("layout_inflater");
            C6783a c6783a = new C6783a(recordingActivity);
            f30087k = c6783a;
            View inflate = layoutInflater.inflate(c6783a.m31288z().equals(C5251a.f30065s0) ? 2131624153 : 2131624152, relativeLayout);
            PopupWindow popupWindow = new PopupWindow(recordingActivity);
            f30084h = popupWindow;
            popupWindow.setContentView(inflate);
            f30084h.setWidth(-1);
            f30084h.setHeight(-1);
            f30084h.setFocusable(true);
            f30084h.showAtLocation(inflate, 17, 0, 0);
            Button button = (Button) inflate.findViewById(2131427628);
            Button button2 = (Button) inflate.findViewById(2131427605);
            if (button != null) {
                button.setOnFocusChangeListener(new i((View) button, recordingActivity));
                button.requestFocus();
                button.requestFocusFromTouch();
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new i((View) button2, recordingActivity));
            }
            button2.setOnClickListener(new f(this));
            if (button != null) {
                button.setOnClickListener(new g(this, file, recordingActivity, arrayList, recordingAdapter, textView));
            }
        }
    }

    /* renamed from: g0 */
    public void m26262g0(Activity activity) {
        if (activity != null) {
            RelativeLayout relativeLayout = (RelativeLayout) activity.findViewById(2131429033);
            LayoutInflater layoutInflater = (LayoutInflater) activity.getSystemService("layout_inflater");
            C6783a c6783a = new C6783a(activity);
            f30087k = c6783a;
            View inflate = layoutInflater.inflate(c6783a.m31288z().equals(C5251a.f30065s0) ? 2131624180 : 2131624179, relativeLayout);
            PopupWindow popupWindow = new PopupWindow(activity);
            f30084h = popupWindow;
            popupWindow.setContentView(inflate);
            f30084h.setWidth(-1);
            f30084h.setHeight(-1);
            f30084h.setFocusable(true);
            f30084h.showAtLocation(inflate, 17, 0, 0);
            Button button = (Button) inflate.findViewById(2131427628);
            Button button2 = (Button) inflate.findViewById(2131427605);
            if (button != null) {
                button.setOnFocusChangeListener(new i(button, activity));
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new i(button2, activity));
            }
            button2.setOnClickListener(new a(this));
            if (button != null) {
                button.setOnClickListener(new b(this, activity));
            }
        }
    }

    /* renamed from: j0 */
    public void m26263j0(Activity activity, String str, String str2, String str3, int i10, String str4) {
        String str5;
        if (activity != null) {
            RelativeLayout relativeLayout = (RelativeLayout) activity.findViewById(2131429033);
            LayoutInflater layoutInflater = (LayoutInflater) activity.getSystemService("layout_inflater");
            C6783a c6783a = new C6783a(activity);
            f30087k = c6783a;
            View inflate = layoutInflater.inflate(c6783a.m31288z().equals(C5251a.f30065s0) ? 2131624493 : 2131624492, relativeLayout);
            PopupWindow popupWindow = new PopupWindow(activity);
            f30084h = popupWindow;
            popupWindow.setContentView(inflate);
            f30084h.setWidth(-1);
            f30084h.setHeight(-1);
            f30084h.setFocusable(true);
            Button button = (Button) inflate.findViewById(2131427628);
            Button button2 = (Button) inflate.findViewById(2131427605);
            EditText editText = (EditText) inflate.findViewById(2131427910);
            EditText editText2 = (EditText) inflate.findViewById(2131427906);
            Button button3 = (Button) inflate.findViewById(2131427599);
            EditText editText3 = (EditText) inflate.findViewById(2131427903);
            if (button != null) {
                button.setOnFocusChangeListener(new i(button, activity));
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new i(button2, activity));
            }
            if (button3 != null) {
                button3.setOnFocusChangeListener(new i(button3, activity));
            }
            String str6 = str + ".ts";
            if (SharepreferenceDBHandler.m15373f(activity).equals("m3u")) {
                str5 = str4;
            } else if (str2.equals("")) {
                str5 = str3 + i10;
            } else {
                str5 = str3 + i10 + ".ts";
            }
            editText.setText(str6);
            editText.requestFocus();
            editText3.setEnabled(false);
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "MAXDIGITAL");
            if (!file.exists()) {
                file.mkdirs();
            }
            SharedPreferences sharedPreferences = activity.getSharedPreferences("recordingDir", 0);
            editText3.setText(sharedPreferences.getString("recordingDir", String.valueOf(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "MAXDIGITAL"))));
            button2.setOnClickListener(new c(this));
            button3.setOnClickListener(new d(this, activity, editText3, sharedPreferences));
            if (button != null) {
                button.setOnClickListener(new e(this, editText2, activity, str5, editText, editText3));
            }
            f30084h.showAtLocation(inflate, 17, 0, 0);
        }
    }

    /* renamed from: o0 */
    public void m26264o0(Context context, String str) {
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("downloadStatus", 0);
            f30086j = sharedPreferences;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("downloadStatus", str);
            edit.apply();
        }
    }
}

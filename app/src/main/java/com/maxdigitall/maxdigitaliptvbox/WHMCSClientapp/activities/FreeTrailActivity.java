package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.amazonaws.services.p045s3.internal.Constants;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.Clientdatabase.ClientSharepreferenceHandler;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.interfaces.ApiService;
import com.maxdigitall.maxdigitaliptvbox.model.FreeTrailModelClass;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.MultiUserDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.activity.LoginActivity;
import dj.C4554u;
import dj.C4555v;
import dj.InterfaceC4535b;
import dj.InterfaceC4537d;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import nf.C6783a;
import org.achartengine.renderer.DefaultRenderer;
import p085ej.C4730a;
import p151if.C5251a;
import p151if.C5255e;
import p173ji.C5402b0;
import p355uf.C9174b;
import p407xe.C9740b;
import p407xe.C9745g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/FreeTrailActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/FreeTrailActivity.class */
public class FreeTrailActivity extends ActivityC0243b {

    /* renamed from: Q */
    public static InputFilter f15952Q = new InputFilter() { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.FreeTrailActivity.4
        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
            while (i10 < i11) {
                if (Character.getType(charSequence.charAt(i10)) == 19) {
                    return "";
                }
                i10++;
            }
            return null;
        }
    };

    /* renamed from: A */
    public ProgressDialog f15953A;

    /* renamed from: B */
    public String f15954B;

    /* renamed from: C */
    public SharedPreferences f15955C;

    /* renamed from: D */
    public SharedPreferences.Editor f15956D;

    /* renamed from: E */
    public SharedPreferences f15957E;

    /* renamed from: F */
    public SharedPreferences f15958F;

    /* renamed from: G */
    public SharedPreferences f15959G;

    /* renamed from: H */
    public SharedPreferences.Editor f15960H;

    /* renamed from: I */
    public Boolean f15961I;

    /* renamed from: J */
    public SharedPreferences f15962J;

    /* renamed from: K */
    public SharedPreferences.Editor f15963K;

    /* renamed from: L */
    public LiveStreamDBHandler f15964L;

    /* renamed from: M */
    public SharedPreferences.Editor f15965M;

    /* renamed from: N */
    public SharedPreferences f15966N;

    /* renamed from: O */
    public DatabaseHandler f15967O;

    /* renamed from: P */
    public MultiUserDBHandler f15968P;

    /* renamed from: d */
    public EditText f15969d;

    /* renamed from: e */
    public EditText f15970e;

    /* renamed from: f */
    public EditText f15971f;

    /* renamed from: g */
    public EditText f15972g;

    /* renamed from: h */
    public Button f15973h;

    /* renamed from: i */
    public TextView f15974i;

    /* renamed from: n */
    public String f15979n;

    /* renamed from: o */
    public String f15980o;

    @BindView
    public RelativeLayout rl_already_register;

    @BindView
    public RelativeLayout rl_bt_submit;

    @BindView
    public RelativeLayout rl_confirmpassword;

    @BindView
    public RelativeLayout rl_email;

    @BindView
    public RelativeLayout rl_password;

    @BindView
    public RelativeLayout rl_username;

    /* renamed from: w */
    public int f15988w;

    /* renamed from: x */
    public Context f15989x;

    /* renamed from: j */
    public String f15975j = "";

    /* renamed from: k */
    public String f15976k = "";

    /* renamed from: l */
    public String f15977l = "";

    /* renamed from: m */
    public String f15978m = "";

    /* renamed from: p */
    public String f15981p = "";

    /* renamed from: q */
    public String f15982q = "";

    /* renamed from: r */
    public String f15983r = "";

    /* renamed from: s */
    public String f15984s = "";

    /* renamed from: t */
    public long f15985t = -1;

    /* renamed from: u */
    public String f15986u = "";

    /* renamed from: v */
    public String f15987v = Build.MODEL;

    /* renamed from: y */
    public String f15990y = "";

    /* renamed from: z */
    public long f15991z = -1;

    /* renamed from: D0 */
    public static String m14514D0(String str) {
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

    /* renamed from: E0 */
    public static String m14515E0() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return m14514D0(str2);
        }
        return m14514D0(str) + " " + str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        r0 = r0.getHardwareAddress();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if (r0 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        r0 = new java.lang.StringBuilder();
        r0 = r0.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (r8 >= r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        r0.append(java.lang.String.format("%02X:", java.lang.Byte.valueOf(r0[r8])));
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        if (r0.length() <= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        r0.deleteCharAt(r0.length() - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        r10 = r0.toString();
     */
    /* renamed from: F0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m14516F0() {
        /*
            java.lang.String r0 = ""
            r11 = r0
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.lang.Exception -> L8e
            java.util.ArrayList r0 = java.util.Collections.list(r0)     // Catch: java.lang.Exception -> L8e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L8e
            r12 = r0
        L10:
            r0 = r11
            r10 = r0
            r0 = r12
            boolean r0 = r0.hasNext()     // Catch: java.lang.Exception -> L8e
            if (r0 == 0) goto L8c
            r0 = r12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Exception -> L8e
            java.net.NetworkInterface r0 = (java.net.NetworkInterface) r0     // Catch: java.lang.Exception -> L8e
            r10 = r0
            r0 = r10
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> L8e
            java.lang.String r1 = "wlan0"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Exception -> L8e
            if (r0 != 0) goto L36
            goto L10
        L36:
            r0 = r10
            byte[] r0 = r0.getHardwareAddress()     // Catch: java.lang.Exception -> L8e
            r12 = r0
            r0 = r12
            if (r0 != 0) goto L44
            java.lang.String r0 = ""
            return r0
        L44:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8e
            r10 = r0
            r0 = r10
            r0.<init>()     // Catch: java.lang.Exception -> L8e
            r0 = r12
            int r0 = r0.length     // Catch: java.lang.Exception -> L8e
            r9 = r0
            r0 = 0
            r8 = r0
        L52:
            r0 = r8
            r1 = r9
            if (r0 >= r1) goto L75
            r0 = r10
            java.lang.String r1 = "%02X:"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L8e
            r3 = r2
            r4 = 0
            r5 = r12
            r6 = r8
            r5 = r5[r6]     // Catch: java.lang.Exception -> L8e
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)     // Catch: java.lang.Exception -> L8e
            r3[r4] = r5     // Catch: java.lang.Exception -> L8e
            java.lang.String r1 = java.lang.String.format(r1, r2)     // Catch: java.lang.Exception -> L8e
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L8e
            int r8 = r8 + 1
            goto L52
        L75:
            r0 = r10
            int r0 = r0.length()     // Catch: java.lang.Exception -> L8e
            if (r0 <= 0) goto L87
            r0 = r10
            r1 = r10
            int r1 = r1.length()     // Catch: java.lang.Exception -> L8e
            r2 = 1
            int r1 = r1 - r2
            java.lang.StringBuilder r0 = r0.deleteCharAt(r1)     // Catch: java.lang.Exception -> L8e
        L87:
            r0 = r10
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L8e
            r10 = r0
        L8c:
            r0 = r10
            return r0
        L8e:
            r10 = move-exception
            r0 = r11
            r10 = r0
            goto L8c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.FreeTrailActivity.m14516F0():java.lang.String");
    }

    /* renamed from: C0 */
    public void m14523C0() {
        try {
            this.f15980o = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: G0 */
    public String m14524G0() {
        return ((WifiManager) getApplicationContext().getSystemService("wifi")).getConnectionInfo().getMacAddress();
    }

    /* renamed from: H0 */
    public boolean m14525H0(String str) {
        return Pattern.compile("^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$", 2).matcher(str).matches();
    }

    /* renamed from: P */
    public void m14526P(String str) {
        ProgressDialog progressDialog = this.f15953A;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (str.equals("")) {
            C5255e.m26241k0(this.f15989x, "Your Account is invalid or expired !");
        } else {
            C5255e.m26241k0(this.f15989x, str);
        }
    }

    /* renamed from: a */
    public void m14527a() {
        ProgressDialog progressDialog = this.f15953A;
        if (progressDialog != null) {
            progressDialog.show();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (C5251a.f30044i.booleanValue()) {
            C5251a.f30042h = Boolean.TRUE;
        }
        finish();
        super.onBackPressed();
        overridePendingTransition(2130772003, 2130772000);
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    @SuppressLint({"ResourceType"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C9745g.f44477c = new C9745g(this);
        setContentView(2131623997);
        ButterKnife.m5626a(this);
        m14523C0();
        m14528q0();
        m14515E0();
        m14530s0();
        String m14516F0 = m14516F0();
        this.f15954B = m14516F0;
        if (m14516F0.equalsIgnoreCase("")) {
            this.f15954B = m14524G0();
        }
        this.f15989x = this;
        this.f15964L = new LiveStreamDBHandler(this.f15989x);
        this.f15968P = new MultiUserDBHandler(this.f15989x);
        this.f15967O = new DatabaseHandler(this.f15989x);
        this.f15971f = new EditText(this);
        this.f15971f.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f15971f.setPaddingRelative(35, 0, 35, 0);
        this.f15971f.setHint(getResources().getString(2132017626));
        this.f15971f.setHintTextColor(getResources().getColor(2131100158));
        this.f15971f.setHintTextColor(-1);
        this.f15971f.setTextSize(22.0f);
        this.f15971f.setId(101);
        this.f15971f.setBackground(getResources().getDrawable(2131231802));
        this.f15971f.setFocusable(true);
        this.f15971f.setTypeface(Typeface.SANS_SERIF);
        this.f15971f.setInputType(32);
        this.rl_email.addView(this.f15971f);
        this.f15969d = new EditText(this);
        this.f15969d.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f15969d.setPaddingRelative(35, 0, 35, 0);
        this.f15969d.setHint(getResources().getString(2132018764));
        this.f15969d.setHintTextColor(getResources().getColor(2131100158));
        this.f15969d.setHintTextColor(-1);
        this.f15969d.setTextSize(22.0f);
        this.f15969d.setId(101);
        this.f15969d.setBackground(getResources().getDrawable(2131231802));
        this.f15969d.setFocusable(true);
        this.f15969d.setTypeface(Typeface.SANS_SERIF);
        this.f15969d.setInputType(1);
        this.rl_username.addView(this.f15969d);
        this.f15970e = new EditText(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        this.f15970e.setPaddingRelative(35, 0, 35, 0);
        this.f15970e.setLayoutParams(layoutParams);
        this.f15970e.setHint(getResources().getString(2132017648));
        this.f15970e.setHintTextColor(getResources().getColor(2131100158));
        this.f15970e.setHintTextColor(-1);
        this.f15970e.setTextSize(22.0f);
        this.f15970e.setId(101);
        this.f15970e.setBackground(getResources().getDrawable(2131231802));
        this.f15970e.setFocusable(true);
        this.f15970e.setTypeface(Typeface.SANS_SERIF);
        this.f15970e.setInputType(129);
        this.rl_password.addView(this.f15970e);
        this.f15972g = new EditText(this);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        this.f15972g.setPaddingRelative(35, 0, 35, 0);
        this.f15972g.setLayoutParams(layoutParams2);
        this.f15972g.setHint(getResources().getString(2132017513));
        this.f15972g.setHintTextColor(getResources().getColor(2131100158));
        this.f15972g.setHintTextColor(-1);
        this.f15972g.setTextSize(22.0f);
        this.f15972g.setId(101);
        this.f15972g.setBackground(getResources().getDrawable(2131231802));
        this.f15972g.setFocusable(true);
        this.f15972g.setTypeface(Typeface.SANS_SERIF);
        this.f15972g.setInputType(129);
        this.rl_confirmpassword.addView(this.f15972g);
        this.f15973h = new Button(this);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
        this.f15973h.setPaddingRelative(35, 0, 35, 0);
        this.f15973h.setLayoutParams(layoutParams3);
        this.f15973h.setText(getResources().getString(2132018585));
        this.f15973h.setTextColor(DefaultRenderer.BACKGROUND_COLOR);
        this.f15973h.setTextSize(22.0f);
        this.f15973h.setId(105);
        this.f15973h.setBackground(getResources().getDrawable(2131231784));
        this.f15973h.setFocusable(true);
        this.f15973h.setGravity(17);
        this.f15973h.setTypeface(Typeface.SANS_SERIF);
        this.rl_bt_submit.addView(this.f15973h);
        this.f15974i = new TextView(this);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -1);
        this.f15974i.setPaddingRelative(35, 0, 35, 0);
        this.f15974i.setLayoutParams(layoutParams4);
        this.f15974i.setTextColor(-1);
        if (new C6783a(this.f15989x).m31288z().equals(C5251a.f30065s0)) {
            this.f15974i.setTextSize(22.0f);
        } else {
            this.f15974i.setTextSize(15.0f);
        }
        this.f15974i.setText(getResources().getString(2132017309));
        this.f15974i.setId(105);
        this.f15974i.setGravity(16);
        this.f15974i.setBackground(getResources().getDrawable(2131231786));
        this.f15974i.setFocusable(true);
        this.rl_already_register.addView(this.f15974i);
        if (this.f15989x != null) {
            ProgressDialog progressDialog = new ProgressDialog(this.f15989x);
            this.f15953A = progressDialog;
            progressDialog.setMessage("Please wait while we are creating free trial for you");
            this.f15953A.setCanceledOnTouchOutside(false);
            this.f15953A.setCancelable(false);
            this.f15953A.setProgressStyle(0);
        }
        this.f15955C = getSharedPreferences("sharedPreference", 0);
        this.f15957E = getSharedPreferences("sharedprefremberme", 0);
        this.f15958F = getSharedPreferences("loginPrefs", 0);
        this.f15959G = getSharedPreferences("selected_language", 0);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefsserverurl", 0);
        this.f15962J = sharedPreferences;
        this.f15963K = sharedPreferences.edit();
        SharedPreferences sharedPreferences2 = getSharedPreferences("upgradeDatePref", 0);
        this.f15966N = sharedPreferences2;
        this.f15965M = sharedPreferences2.edit();
        this.f15960H = this.f15957E.edit();
        this.f15956D = this.f15955C.edit();
        this.f15961I = Boolean.valueOf(this.f15957E.getBoolean("savelogin", false));
        this.f15974i.setOnClickListener(new View.OnClickListener(this) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.FreeTrailActivity.1

            /* renamed from: b */
            public final FreeTrailActivity f15992b;

            {
                this.f15992b = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.f15992b.startActivity(new Intent(this.f15992b, (Class<?>) LoginActivity.class));
                this.f15992b.finish();
            }
        });
        C9174b.m38607a(this.f15970e);
        this.f15969d.setFilters(new InputFilter[]{f15952Q});
        this.f15973h.setOnClickListener(new View.OnClickListener(this) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.FreeTrailActivity.2

            /* renamed from: b */
            public final FreeTrailActivity f15993b;

            {
                this.f15993b = this;
            }

            /* renamed from: a */
            public final void m14531a() {
                Context context;
                Resources resources;
                int i10;
                FreeTrailActivity freeTrailActivity = this.f15993b;
                freeTrailActivity.f15975j = freeTrailActivity.f15971f.getText().toString().trim();
                FreeTrailActivity freeTrailActivity2 = this.f15993b;
                freeTrailActivity2.f15976k = freeTrailActivity2.f15969d.getText().toString().trim();
                FreeTrailActivity freeTrailActivity3 = this.f15993b;
                freeTrailActivity3.f15977l = freeTrailActivity3.f15970e.getText().toString().trim();
                FreeTrailActivity freeTrailActivity4 = this.f15993b;
                freeTrailActivity4.f15978m = freeTrailActivity4.f15972g.getText().toString().trim();
                if (this.f15993b.f15975j.isEmpty()) {
                    FreeTrailActivity freeTrailActivity5 = this.f15993b;
                    context = freeTrailActivity5.f15989x;
                    resources = freeTrailActivity5.getResources();
                    i10 = 2132018346;
                } else {
                    FreeTrailActivity freeTrailActivity6 = this.f15993b;
                    if (!freeTrailActivity6.m14525H0(freeTrailActivity6.f15975j)) {
                        FreeTrailActivity freeTrailActivity7 = this.f15993b;
                        context = freeTrailActivity7.f15989x;
                        resources = freeTrailActivity7.getResources();
                        i10 = 2132018824;
                    } else if (this.f15993b.f15976k.isEmpty()) {
                        FreeTrailActivity freeTrailActivity8 = this.f15993b;
                        context = freeTrailActivity8.f15989x;
                        resources = freeTrailActivity8.getResources();
                        i10 = 2132018350;
                    } else if (this.f15993b.f15977l.isEmpty()) {
                        FreeTrailActivity freeTrailActivity9 = this.f15993b;
                        context = freeTrailActivity9.f15989x;
                        resources = freeTrailActivity9.getResources();
                        i10 = 2132018347;
                    } else if (this.f15993b.f15978m.equalsIgnoreCase("")) {
                        FreeTrailActivity freeTrailActivity10 = this.f15993b;
                        context = freeTrailActivity10.f15989x;
                        resources = freeTrailActivity10.getResources();
                        i10 = 2132018344;
                    } else {
                        if (this.f15993b.f15977l.equals(this.f15993b.f15978m)) {
                            SharepreferenceDBHandler.m15378h0("", this.f15993b.f15989x);
                            SharepreferenceDBHandler.m15380i0("", this.f15993b.f15989x);
                            this.f15993b.m14527a();
                            this.f15993b.m14529r0();
                            return;
                        }
                        FreeTrailActivity freeTrailActivity11 = this.f15993b;
                        context = freeTrailActivity11.f15989x;
                        resources = freeTrailActivity11.getResources();
                        i10 = 2132018287;
                    }
                }
                Toast.makeText(context, resources.getString(i10), 0).show();
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                m14531a();
            }
        });
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        C5255e.m26233f(this.f15989x);
    }

    /* renamed from: q0 */
    public void m14528q0() {
        this.f15979n = Build.VERSION.RELEASE + " " + Build.VERSION_CODES.class.getFields()[Build.VERSION.SDK_INT].getName();
    }

    /* renamed from: r0 */
    public void m14529r0() {
        C5402b0.a aVar = new C5402b0.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ((ApiService) new C4555v.b().m22968b("https://cms.alldrama.tv/").m22972f(aVar.m26828c(300L, timeUnit).m26825M(300L, timeUnit).m26823K(300L, timeUnit).m26830e(false).m26827b()).m22967a(C4730a.m23884f()).m22970d().m22958b(ApiService.class)).m14643k("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "freetrail", "yes", this.f15975j, this.f15976k, this.f15977l, this.f15954B, "com.maxdigitall.maxdigitaliptvbox").mo22862f(new InterfaceC4537d<FreeTrailModelClass>(this) { // from class: com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.FreeTrailActivity.3

            /* renamed from: a */
            public final FreeTrailActivity f15994a;

            {
                this.f15994a = this;
            }

            @Override // dj.InterfaceC4537d
            /* renamed from: a */
            public void mo14532a(InterfaceC4535b<FreeTrailModelClass> interfaceC4535b, C4554u<FreeTrailModelClass> c4554u) {
                FreeTrailActivity freeTrailActivity;
                String str;
                if (c4554u == null || !c4554u.m22954d() || c4554u.m22952a() == null) {
                    freeTrailActivity = this.f15994a;
                    str = "No Response from server";
                } else {
                    if (c4554u.m22952a().m14785b() != null && c4554u.m22952a().m14785b().equalsIgnoreCase("success")) {
                        ClientSharepreferenceHandler.m14497h("", this.f15994a.f15989x);
                        if (C5251a.f30042h.booleanValue()) {
                            C5251a.f30042h = Boolean.FALSE;
                        }
                        SharepreferenceDBHandler.m15378h0(this.f15994a.f15976k, this.f15994a.f15989x);
                        SharepreferenceDBHandler.m15380i0(this.f15994a.f15977l, this.f15994a.f15989x);
                        Intent intent = new Intent(this.f15994a, (Class<?>) LoginActivity.class);
                        intent.setAction("login_perform");
                        this.f15994a.startActivity(intent);
                        this.f15994a.finish();
                        return;
                    }
                    freeTrailActivity = this.f15994a;
                    str = c4554u.m22952a().m14784a();
                }
                freeTrailActivity.m14526P(str);
            }

            @Override // dj.InterfaceC4537d
            /* renamed from: b */
            public void mo14533b(InterfaceC4535b<FreeTrailModelClass> interfaceC4535b, Throwable th2) {
                FreeTrailActivity freeTrailActivity = this.f15994a;
                freeTrailActivity.m14526P(freeTrailActivity.getResources().getString(2132017529));
            }
        });
    }

    /* renamed from: s0 */
    public void m14530s0() {
        int nextInt = new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS;
        this.f15988w = nextInt;
        C9740b.f44454b = String.valueOf(nextInt);
    }
}

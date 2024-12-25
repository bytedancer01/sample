package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amazonaws.services.p045s3.internal.Constants;
import com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities.FreeTrailActivity;
import com.maxdigitall.maxdigitaliptvbox.model.MultiUserDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.callback.ActivationCallBack;
import com.maxdigitall.maxdigitaliptvbox.model.callback.LoginCallback;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.MultiUserDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.vpn.activities.ProfileActivity;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import nf.C6783a;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.json.JSONObject;
import org.pcap4j.packet.namednumber.EtherType;
import org.slf4j.Marker;
import p050d0.C4290b;
import p151if.C5251a;
import p151if.C5255e;
import p170jf.C5369a;
import p170jf.C5371c;
import p324sf.InterfaceC8562a;
import p324sf.InterfaceC8567f;
import p355uf.C9174b;
import p407xe.C9740b;
import p407xe.C9744f;
import p407xe.C9745g;
import p407xe.InterfaceC9741c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginActivity.class */
public class LoginActivity extends ActivityC0243b implements InterfaceC8567f, InterfaceC9741c<String>, InterfaceC8562a {

    /* renamed from: v0 */
    public static InputFilter f17530v0 = new C2822a();

    /* renamed from: A */
    public SharedPreferences f17531A;

    /* renamed from: B */
    public SharedPreferences f17532B;

    /* renamed from: C */
    public SharedPreferences f17533C;

    /* renamed from: D */
    public SharedPreferences.Editor f17534D;

    /* renamed from: E */
    public SharedPreferences.Editor f17535E;

    /* renamed from: F */
    public SharedPreferences.Editor f17536F;

    /* renamed from: G */
    public SharedPreferences.Editor f17537G;

    /* renamed from: H */
    public SharedPreferences.Editor f17538H;

    /* renamed from: I */
    public SharedPreferences.Editor f17539I;

    /* renamed from: J */
    public SharedPreferences f17540J;

    /* renamed from: K */
    public SharedPreferences f17541K;

    /* renamed from: L */
    public SharedPreferences.Editor f17542L;

    /* renamed from: M */
    public MultiUserDBHandler f17543M;

    /* renamed from: N */
    public DatabaseHandler f17544N;

    /* renamed from: W */
    public String f17553W;

    /* renamed from: X */
    public SharedPreferences f17554X;

    /* renamed from: Y */
    public SharedPreferences.Editor f17555Y;

    /* renamed from: Z */
    public SharedPreferences f17556Z;

    @BindView
    public LinearLayout activityLogin;

    @BindView
    public Button btn_free_trail;

    /* renamed from: d */
    public EditText f17557d;

    /* renamed from: e */
    public EditText f17558e;

    @BindView
    public ImageView eyepass;

    /* renamed from: f */
    public EditText f17559f;

    /* renamed from: f0 */
    public SharedPreferences.Editor f17560f0;

    /* renamed from: g */
    public EditText f17561g;

    /* renamed from: g0 */
    public SharedPreferences f17562g0;

    @BindView
    public ImageView iv_connect_vpn;

    @BindView
    public ImageView iv_list_users;

    /* renamed from: j */
    public C5371c f17567j;

    /* renamed from: l */
    public String f17571l;

    @BindView
    public LinearLayout linearLayout;

    @BindView
    public TextView link_transform;

    @BindView
    public TextView loginTV;

    /* renamed from: m */
    public String f17573m;

    /* renamed from: m0 */
    public String f17574m0;

    /* renamed from: n */
    public String f17575n;

    /* renamed from: n0 */
    public String f17576n0;

    /* renamed from: o */
    public ProgressDialog f17577o;

    /* renamed from: o0 */
    public String f17578o0;

    /* renamed from: p */
    public SharedPreferences f17579p;

    /* renamed from: p0 */
    public String f17580p0;

    @BindView
    public LinearLayout password_full;

    /* renamed from: q */
    public SharedPreferences.Editor f17581q;

    /* renamed from: r */
    public SharedPreferences f17583r;

    /* renamed from: r0 */
    public int f17584r0;

    @BindView
    public Button rl_bt_refresh;

    @BindView
    public RelativeLayout rl_bt_submit;

    @BindView
    public RelativeLayout rl_connect_vpn;

    @BindView
    public RelativeLayout rl_email;

    @BindView
    public RelativeLayout rl_list_users;

    @BindView
    public RelativeLayout rl_name;

    @BindView
    public RelativeLayout rl_password;

    @BindView
    public RelativeLayout rl_server_url;

    /* renamed from: s */
    public SharedPreferences f17585s;

    /* renamed from: s0 */
    public String f17586s0;

    /* renamed from: t */
    public SharedPreferences f17587t;

    /* renamed from: t0 */
    public C5369a f17588t0;

    @BindView
    public TextView tv_add_user;

    @BindView
    public TextView tv_list_users;

    @BindView
    public TextView tv_vpn_con;

    /* renamed from: u */
    public SharedPreferences.Editor f17589u;

    /* renamed from: u0 */
    public C6783a f17590u0;

    /* renamed from: v */
    public SharedPreferences f17591v;

    /* renamed from: w */
    public SharedPreferences.Editor f17592w;

    /* renamed from: x */
    public LiveStreamDBHandler f17593x;

    /* renamed from: y */
    public SharedPreferences f17594y;

    @BindView
    public ImageView yourLogioTV;

    /* renamed from: z */
    public SharedPreferences f17595z;

    /* renamed from: h */
    public int f17563h = -1;

    /* renamed from: i */
    public boolean f17565i = false;

    /* renamed from: k */
    public Context f17569k = this;

    /* renamed from: O */
    public String f17545O = "";

    /* renamed from: P */
    public String f17546P = "";

    /* renamed from: Q */
    public String f17547Q = "";

    /* renamed from: R */
    public String f17548R = "";

    /* renamed from: S */
    public long f17549S = -1;

    /* renamed from: T */
    public String f17550T = "";

    /* renamed from: U */
    public String f17551U = "";

    /* renamed from: V */
    public long f17552V = -1;

    /* renamed from: h0 */
    public String f17564h0 = "";

    /* renamed from: i0 */
    public ArrayList<String> f17566i0 = new ArrayList<>();

    /* renamed from: j0 */
    public String f17568j0 = m15986I0();

    /* renamed from: k0 */
    public long f17570k0 = 0;

    /* renamed from: l0 */
    public SimpleDateFormat f17572l0 = new SimpleDateFormat("dd/MM/yyyy");

    /* renamed from: q0 */
    public String f17582q0 = Build.MODEL;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LoginActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginActivity$a.class */
    public class C2822a implements InputFilter {
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
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LoginActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginActivity$b.class */
    public class ViewOnClickListenerC2823b implements View.OnClickListener {

        /* renamed from: b */
        public final LoginActivity f17596b;

        public ViewOnClickListenerC2823b(LoginActivity loginActivity) {
            this.f17596b = loginActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5251a.f30028a = true;
            SharepreferenceDBHandler.m15374f0("login", this.f17596b.f17569k);
            Intent intent = new Intent(this.f17596b.f17569k, (Class<?>) ProfileActivity.class);
            intent.putExtra("typeid", "login");
            this.f17596b.startActivity(intent);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LoginActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginActivity$c.class */
    public class ViewOnClickListenerC2824c implements View.OnClickListener {

        /* renamed from: b */
        public final LoginActivity f17597b;

        public ViewOnClickListenerC2824c(LoginActivity loginActivity) {
            this.f17597b = loginActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f17597b.m15995R0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LoginActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginActivity$d.class */
    public class ViewOnClickListenerC2825d implements View.OnClickListener {

        /* renamed from: b */
        public final LoginActivity f17598b;

        public ViewOnClickListenerC2825d(LoginActivity loginActivity) {
            this.f17598b = loginActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f17598b.m15992P0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LoginActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginActivity$e.class */
    public class ViewOnClickListenerC2826e implements View.OnClickListener {

        /* renamed from: b */
        public final LoginActivity f17599b;

        public ViewOnClickListenerC2826e(LoginActivity loginActivity) {
            this.f17599b = loginActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f17599b.startActivity(new Intent(this.f17599b, (Class<?>) FreeTrailActivity.class));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LoginActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginActivity$f.class */
    public class ViewOnClickListenerC2827f implements View.OnClickListener {

        /* renamed from: b */
        public final LoginActivity f17600b;

        public ViewOnClickListenerC2827f(LoginActivity loginActivity) {
            this.f17600b = loginActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5251a.f30042h = C5251a.f30042h.booleanValue() ? Boolean.FALSE : Boolean.TRUE;
            this.f17600b.m15987K0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginActivity$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LoginActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginActivity$g.class */
    public class ViewOnClickListenerC2828g implements View.OnClickListener {

        /* renamed from: b */
        public final LoginActivity f17601b;

        public ViewOnClickListenerC2828g(LoginActivity loginActivity) {
            this.f17601b = loginActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LoginActivity loginActivity = this.f17601b;
            int i10 = loginActivity.f17563h;
            if (i10 != -1) {
                loginActivity.f17563h = i10 - 1;
                loginActivity.f17558e.setInputType(129);
                this.f17601b.eyepass.setImageResource(2131231115);
            } else {
                loginActivity.f17558e.setInputType(145);
                this.f17601b.eyepass.setImageResource(2131231948);
                this.f17601b.f17563h++;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginActivity$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LoginActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginActivity$h.class */
    public class RunnableC2829h implements Runnable {

        /* renamed from: b */
        public final LoginActivity f17602b;

        public RunnableC2829h(LoginActivity loginActivity) {
            this.f17602b = loginActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f17602b.f17565i = false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginActivity$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LoginActivity$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginActivity$i.class */
    public class DialogC2830i extends Dialog implements View.OnClickListener {

        /* renamed from: b */
        public Activity f17603b;

        /* renamed from: c */
        public TextView f17604c;

        /* renamed from: d */
        public TextView f17605d;

        /* renamed from: e */
        public LinearLayout f17606e;

        /* renamed from: f */
        public LinearLayout f17607f;

        /* renamed from: g */
        public final LoginActivity f17608g;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginActivity$i$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LoginActivity$i$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginActivity$i$a.class */
        public class a implements View.OnFocusChangeListener {

            /* renamed from: b */
            public View f17609b;

            /* renamed from: c */
            public final DialogC2830i f17610c;

            public a(DialogC2830i dialogC2830i, View view) {
                this.f17610c = dialogC2830i;
                this.f17609b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z10) {
                int i10;
                LinearLayout linearLayout;
                if (z10) {
                    View view2 = this.f17609b;
                    i10 = 2131230846;
                    if (view2 == null || view2.getTag() == null || !this.f17609b.getTag().equals("1")) {
                        View view3 = this.f17609b;
                        if (view3 == null || view3.getTag() == null || !this.f17609b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f17610c.f17607f;
                    }
                    linearLayout = this.f17610c.f17606e;
                } else {
                    View view4 = this.f17609b;
                    i10 = 2131230845;
                    if (view4 == null || view4.getTag() == null || !this.f17609b.getTag().equals("1")) {
                        View view5 = this.f17609b;
                        if (view5 == null || view5.getTag() == null || !this.f17609b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f17610c.f17607f;
                    }
                    linearLayout = this.f17610c.f17606e;
                }
                linearLayout.setBackgroundResource(i10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogC2830i(LoginActivity loginActivity, Activity activity) {
            super(activity);
            this.f17608g = loginActivity;
            this.f17603b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id2 = view.getId();
            try {
                if (id2 == 2131427639) {
                    dismiss();
                } else {
                    if (id2 != 2131427678) {
                        return;
                    }
                    dismiss();
                    this.f17608g.m15995R0();
                }
            } catch (Exception e10) {
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(this.f17608g.f17590u0.m31288z().equals(C5251a.f30065s0) ? 2131624141 : 2131624140);
            this.f17604c = (TextView) findViewById(2131427678);
            this.f17605d = (TextView) findViewById(2131427639);
            this.f17606e = (LinearLayout) findViewById(2131428541);
            this.f17607f = (LinearLayout) findViewById(2131428448);
            this.f17604c.setOnClickListener(this);
            this.f17605d.setOnClickListener(this);
            TextView textView = this.f17604c;
            textView.setOnFocusChangeListener(new a(this, textView));
            TextView textView2 = this.f17605d;
            textView2.setOnFocusChangeListener(new a(this, textView2));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginActivity$j.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LoginActivity$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginActivity$j.class */
    public class AsyncTaskC2831j extends AsyncTask<Void, Boolean, Boolean> {

        /* renamed from: a */
        public final LoginActivity f17611a;

        public AsyncTaskC2831j(LoginActivity loginActivity) {
            this.f17611a = loginActivity;
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
            if (!bool.booleanValue()) {
                this.f17611a.mo15997b();
                LoginActivity loginActivity = this.f17611a;
                DialogC2830i dialogC2830i = new DialogC2830i(loginActivity, (Activity) loginActivity.f17569k);
                dialogC2830i.setCancelable(false);
                dialogC2830i.show();
                return;
            }
            if (!C5251a.f30042h.booleanValue()) {
                this.f17611a.m16002s0();
                return;
            }
            LoginActivity loginActivity2 = this.f17611a;
            loginActivity2.f17588t0 = new C5369a(loginActivity2, loginActivity2.f17569k);
            this.f17611a.f17588t0.m26693a(this.f17611a.f17571l);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginActivity$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LoginActivity$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginActivity$k.class */
    public class ViewOnFocusChangeListenerC2832k implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f17612b;

        /* renamed from: c */
        public final LoginActivity f17613c;

        public ViewOnFocusChangeListenerC2832k(LoginActivity loginActivity, View view) {
            this.f17613c = loginActivity;
            this.f17612b = view;
        }

        /* renamed from: a */
        public final void m16010a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17612b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m16011b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17612b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m16012c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17612b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            TextView textView;
            int color;
            EditText editText;
            int length;
            LoginActivity loginActivity;
            TextView textView2;
            if (!z10) {
                if (z10) {
                    return;
                }
                float f10 = z10 ? 1.09f : 1.0f;
                m16011b(f10);
                m16012c(f10);
                m16010a(z10);
                View view2 = this.f17612b;
                if (view2 == null || view2.getTag() == null || !this.f17612b.getTag().equals("rl_list_users")) {
                    View view3 = this.f17612b;
                    if (view3 == null || view3.getTag() == null || !this.f17612b.getTag().equals("rl_connect_vpn")) {
                        View view4 = this.f17612b;
                        if (view4 == null || view4.getTag() == null || !this.f17612b.getTag().equals("rl_bt_submit")) {
                            return;
                        }
                        this.f17613c.rl_bt_submit.setBackgroundResource(2131230851);
                        LoginActivity loginActivity2 = this.f17613c;
                        loginActivity2.tv_add_user.setTextColor(loginActivity2.f17569k.getResources().getColor(2131100158));
                        return;
                    }
                    this.f17613c.rl_connect_vpn.setBackgroundResource(2131231911);
                    this.f17613c.iv_connect_vpn.setImageResource(2131231562);
                    loginActivity = this.f17613c;
                    textView2 = loginActivity.tv_vpn_con;
                } else {
                    this.f17613c.rl_list_users.setBackgroundResource(2131231911);
                    this.f17613c.iv_list_users.setImageResource(2131231564);
                    loginActivity = this.f17613c;
                    textView2 = loginActivity.tv_list_users;
                }
                textView2.setTextColor(loginActivity.f17569k.getResources().getColor(2131099723));
                return;
            }
            try {
                Log.e("id is", "" + this.f17612b.getTag());
                if (this.f17612b.getTag().equals("1")) {
                    editText = this.f17613c.f17557d;
                    length = editText.length();
                } else if (this.f17612b.getTag().equals("2")) {
                    editText = this.f17613c.f17558e;
                    length = editText.length();
                } else {
                    if (!this.f17612b.getTag().equals("3")) {
                        if (this.f17612b.getTag().equals("rl_list_users")) {
                            LoginActivity loginActivity3 = this.f17613c;
                            loginActivity3.rl_list_users.setBackground(loginActivity3.getResources().getDrawable(2131231803));
                            this.f17613c.iv_list_users.setImageResource(2131231564);
                            LoginActivity loginActivity4 = this.f17613c;
                            textView = loginActivity4.tv_list_users;
                            color = loginActivity4.f17569k.getResources().getColor(2131099723);
                        } else {
                            if (!this.f17612b.getTag().equals("rl_connect_vpn")) {
                                if (this.f17612b.getTag().equals("rl_bt_submit")) {
                                    LoginActivity loginActivity5 = this.f17613c;
                                    loginActivity5.rl_bt_submit.setBackground(loginActivity5.getResources().getDrawable(2131231804));
                                    LoginActivity loginActivity6 = this.f17613c;
                                    loginActivity6.tv_add_user.setTextColor(loginActivity6.f17569k.getResources().getColor(2131100158));
                                    return;
                                }
                                return;
                            }
                            LoginActivity loginActivity7 = this.f17613c;
                            loginActivity7.rl_connect_vpn.setBackground(loginActivity7.getResources().getDrawable(2131231803));
                            this.f17613c.iv_connect_vpn.setImageResource(2131231562);
                            LoginActivity loginActivity8 = this.f17613c;
                            textView = loginActivity8.tv_vpn_con;
                            color = loginActivity8.f17569k.getResources().getColor(2131099723);
                        }
                        textView.setTextColor(color);
                        return;
                    }
                    editText = this.f17613c.f17559f;
                    length = editText.length();
                }
                editText.setSelection(length);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* renamed from: E0 */
    public static String m15971E0(String str) {
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

    /* renamed from: J0 */
    public static String m15972J0() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return m15971E0(str2);
        }
        return m15971E0(str) + " " + str2;
    }

    /* renamed from: M0 */
    public static String m15973M0(String str) {
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

    /* JADX WARN: Code restructure failed: missing block: B:53:0x057b, code lost:
    
        if (p151if.C5251a.f30030b.booleanValue() != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0623, code lost:
    
        p151if.C5255e.m26241k0(r8.f17569k, "Your Account is invalid or has expired !");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x062d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x060c, code lost:
    
        r9 = getResources().getString(2132017872);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0609, code lost:
    
        if (p151if.C5251a.f30030b.booleanValue() != false) goto L68;
     */
    @Override // p324sf.InterfaceC8567f
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo15980D(com.maxdigitall.maxdigitaliptvbox.model.callback.LoginCallback r9, java.lang.String r10, java.util.ArrayList<java.lang.String> r11) {
        /*
            Method dump skipped, instructions count: 1582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.LoginActivity.mo15980D(com.maxdigitall.maxdigitaliptvbox.model.callback.LoginCallback, java.lang.String, java.util.ArrayList):void");
    }

    /* renamed from: D0 */
    public void m15981D0() {
        try {
            this.f17580p0 = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
        }
    }

    @Override // p407xe.InterfaceC9741c
    /* renamed from: E */
    public void mo15570E(int i10) {
        if (this.f17569k != null) {
            mo15997b();
            Toast.makeText(this, this.f17569k.getResources().getString(2132017529), 0).show();
        }
    }

    /* renamed from: F0 */
    public final void m15982F0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: G0 */
    public boolean m15983G0() {
        EditText editText;
        Resources resources;
        int i10;
        EditText editText2;
        Resources resources2;
        int i11;
        if (this.f17557d.getText().toString().trim().length() == 0) {
            this.f17557d.requestFocus();
            if (C5251a.f30042h.booleanValue()) {
                editText2 = this.f17557d;
                resources2 = getResources();
                i11 = 2132017637;
            } else {
                editText2 = this.f17557d;
                resources2 = getResources();
                i11 = 2132017654;
            }
            editText2.setError(resources2.getString(i11));
            return false;
        }
        if (!C5251a.f30042h.booleanValue() && this.f17558e.getText().toString().trim().length() == 0) {
            this.f17558e.requestFocus();
            editText = this.f17558e;
            resources = getResources();
            i10 = 2132017649;
        } else {
            if (!C5251a.f30014M.booleanValue() || this.f17559f.getText().toString().trim().length() != 0) {
                return true;
            }
            this.f17559f.requestFocus();
            editText = this.f17559f;
            resources = getResources();
            i10 = 2132017650;
        }
        editText.setError(resources.getString(i10));
        return false;
    }

    @Override // p324sf.InterfaceC8567f
    /* renamed from: H */
    public void mo15984H(ArrayList<String> arrayList, String str) {
        if (arrayList == null || arrayList.size() <= 0) {
            mo15997b();
            if (C5251a.f30030b.booleanValue()) {
                Toast.makeText(this, getResources().getString(2132017872), 0).show();
                return;
            } else {
                C5255e.m26241k0(this.f17569k, "Your Account is invalid or has expired !");
                return;
            }
        }
        try {
            this.f17592w.putString(C5251a.f30066t, arrayList.get(0).trim());
            this.f17592w.apply();
            arrayList.remove(0);
            this.f17567j.m26704h(this.f17571l, this.f17573m, arrayList);
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    @SuppressLint({"ResourceType"})
    /* renamed from: H0 */
    public void m15985H0() {
        Button button;
        int i10;
        m15990O0();
        this.rl_connect_vpn.setOnClickListener(new ViewOnClickListenerC2823b(this));
        this.rl_bt_submit.setOnClickListener(new ViewOnClickListenerC2824c(this));
        this.rl_list_users.setOnClickListener(new ViewOnClickListenerC2825d(this));
        if (C5251a.f30040g.booleanValue()) {
            button = this.btn_free_trail;
            i10 = 0;
        } else {
            button = this.btn_free_trail;
            i10 = 8;
        }
        button.setVisibility(i10);
        this.btn_free_trail.setOnClickListener(new ViewOnClickListenerC2826e(this));
        this.link_transform.setOnClickListener(new ViewOnClickListenerC2827f(this));
    }

    /* renamed from: I0 */
    public final String m15986I0() {
        return C5255e.m26213P(Calendar.getInstance().getTime().toString());
    }

    /* renamed from: K0 */
    public final void m15987K0() {
        RelativeLayout relativeLayout;
        RelativeLayout relativeLayout2;
        ProgressDialog progressDialog;
        String string;
        try {
            this.f17569k = this;
            this.f17543M = new MultiUserDBHandler(this.f17569k);
            this.f17593x = new LiveStreamDBHandler(this.f17569k);
            if (C5251a.f30044i.booleanValue()) {
                this.link_transform.setVisibility(0);
            }
            if (C5251a.f30034d.booleanValue()) {
                this.link_transform.setNextFocusLeftId(2131429009);
            } else {
                this.link_transform.setNextFocusLeftId(2131428968);
            }
            if (C5251a.f30042h.booleanValue()) {
                this.f17557d.setHint((CharSequence) null);
                this.f17557d.setHint("");
                this.link_transform.setText(getResources().getString(2132018819));
                this.loginTV.setText(getResources().getString(2132017637));
                this.rl_server_url.setVisibility(8);
                this.password_full.setVisibility(8);
                this.f17557d.setVisibility(8);
                this.f17557d.setVisibility(0);
                this.f17557d.setHint(getResources().getString(2132017255));
                this.tv_add_user.setText(getResources().getString(2132017485));
                (C5251a.f30034d.booleanValue() ? this.rl_name : this.rl_name).setVisibility(8);
                if (C5251a.f30032c.booleanValue() && C5251a.f30034d.booleanValue()) {
                    relativeLayout2 = this.rl_list_users;
                } else if (C5251a.f30036e.booleanValue()) {
                    relativeLayout2 = this.rl_list_users;
                } else {
                    relativeLayout = this.rl_list_users;
                    relativeLayout.setVisibility(8);
                }
                relativeLayout2.setVisibility(0);
            } else {
                if (C5251a.f30034d.booleanValue()) {
                    this.f17557d.setHint((CharSequence) null);
                    this.f17557d.setHint("");
                    this.link_transform.setText(getResources().getString(2132018821));
                    this.tv_add_user.setText(getResources().getString(2132017285));
                    this.f17557d.setVisibility(8);
                    this.f17557d.setVisibility(0);
                    this.f17557d.setHint(getResources().getString(2132018764));
                    this.password_full.setVisibility(0);
                    this.rl_name.setVisibility(8);
                    if (C5251a.f30014M.booleanValue()) {
                        this.rl_server_url.setVisibility(0);
                    } else {
                        this.rl_server_url.setVisibility(8);
                    }
                    if (C5251a.f30032c.booleanValue() && C5251a.f30034d.booleanValue()) {
                        relativeLayout2 = this.rl_list_users;
                    } else if (C5251a.f30036e.booleanValue()) {
                        relativeLayout2 = this.rl_list_users;
                    } else {
                        relativeLayout = this.rl_list_users;
                    }
                    relativeLayout2.setVisibility(0);
                } else {
                    this.f17557d.setHint((CharSequence) null);
                    this.f17557d.setHint("");
                    this.link_transform.setText(getResources().getString(2132018821));
                    this.loginTV.setText(getResources().getString(2132017532));
                    this.f17557d.setVisibility(8);
                    this.f17557d.setVisibility(0);
                    this.password_full.setVisibility(0);
                    this.f17557d.setHint(getResources().getString(2132018764));
                    this.tv_add_user.setText(getResources().getString(2132018661));
                    this.rl_server_url.setVisibility(8);
                    this.rl_name.setVisibility(8);
                    relativeLayout = this.rl_list_users;
                }
                relativeLayout.setVisibility(8);
            }
            this.f17561g.setError(null);
            this.f17557d.setError(null);
            this.f17558e.setError(null);
            this.f17544N = new DatabaseHandler(this.f17569k);
            if (this.f17569k != null) {
                this.f17577o = new ProgressDialog(this.f17569k);
                String str = this.f17586s0;
                if (str != null && str.equalsIgnoreCase("login_perform")) {
                    progressDialog = this.f17577o;
                    string = "Auto Login";
                } else if (C5251a.f30042h.booleanValue()) {
                    this.f17577o.setMessage("");
                    progressDialog = this.f17577o;
                    string = getResources().getString(2132018353);
                } else {
                    this.f17577o.setMessage("");
                    progressDialog = this.f17577o;
                    string = getResources().getString(2132018352);
                }
                progressDialog.setMessage(string);
                this.f17577o.setCanceledOnTouchOutside(false);
                this.f17577o.setCancelable(false);
                this.f17577o.setProgressStyle(0);
            }
            this.f17571l = this.f17557d.getText().toString();
            this.f17573m = this.f17558e.getText().toString();
            this.f17567j = new C5371c(this, this.f17569k);
            this.f17579p = getSharedPreferences("sharedPreference", 0);
            this.f17585s = getSharedPreferences("loginPrefs", 0);
            this.f17587t = getSharedPreferences("selected_language", 0);
            SharedPreferences sharedPreferences = getSharedPreferences("loginPrefsserverurl", 0);
            this.f17591v = sharedPreferences;
            this.f17592w = sharedPreferences.edit();
            SharedPreferences sharedPreferences2 = getSharedPreferences("upgradeDatePref", 0);
            this.f17540J = sharedPreferences2;
            this.f17539I = sharedPreferences2.edit();
            this.f17589u = this.f17583r.edit();
            this.f17581q = this.f17579p.edit();
            SharedPreferences sharedPreferences3 = getSharedPreferences("multiDNS", 0);
            this.f17554X = sharedPreferences3;
            this.f17555Y = sharedPreferences3.edit();
            SharedPreferences sharedPreferences4 = getSharedPreferences("multiDNSValid", 0);
            this.f17556Z = sharedPreferences4;
            this.f17560f0 = sharedPreferences4.edit();
            this.f17562g0 = getSharedPreferences("serverUrlDNS", 0);
            if (C5251a.f30034d.booleanValue()) {
                this.f17557d.setText("");
                this.f17558e.setText("");
            }
            m15988L0();
        } catch (Resources.NotFoundException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: L0 */
    public void m15988L0() {
        EditText editText;
        try {
            if (C5251a.f30034d.booleanValue()) {
                this.f17557d.requestFocus();
                editText = this.f17557d;
            } else {
                this.f17557d.requestFocus();
                editText = this.f17557d;
            }
            editText.requestFocusFromTouch();
            mo15997b();
        } catch (Exception e10) {
        }
    }

    @Override // p407xe.InterfaceC9741c
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public void mo15571Y(String str, int i10, boolean z10) {
        String trim;
        if (!z10) {
            mo15997b();
            Toast.makeText(this, this.f17569k.getResources().getString(2132017529), 0).show();
            return;
        }
        if (i10 == 1) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                C9740b.f44453a = jSONObject;
                if (!jSONObject.getString("status").equalsIgnoreCase("true")) {
                    mo15997b();
                    Toast.makeText(this, this.f17569k.getResources().getString(2132018652), 0).show();
                    return;
                }
                this.f17550T = C9740b.f44453a.getString("su");
                this.f17551U = C9740b.f44453a.getString("ndd");
                this.f17552V = System.currentTimeMillis();
                try {
                    if (C5251a.f30042h.booleanValue()) {
                        this.f17571l = SharepreferenceDBHandler.m15338B(this.f17569k);
                        trim = SharepreferenceDBHandler.m15339C(this.f17569k);
                    } else {
                        this.f17571l = this.f17557d.getText().toString().trim();
                        trim = this.f17558e.getText().toString().trim();
                    }
                    this.f17573m = trim;
                    C9744f.m41043e(this, C9740b.f44453a.optString("su"));
                    this.f17576n0 = m15973M0(C9740b.f44453a.optString("su") + Marker.ANY_MARKER + C9744f.m41042d(this) + Marker.ANY_MARKER + C9740b.f44454b);
                    C9740b.f44453a.getString("sc").equalsIgnoreCase(this.f17576n0);
                    this.f17592w.putString(C5251a.f30066t, C9744f.m41039a(this));
                    this.f17592w.apply();
                    this.f17581q.putString(C5251a.f30066t, C9744f.m41039a(this));
                    this.f17581q.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, this.f17571l);
                    this.f17581q.apply();
                    if (C5251a.f30034d.booleanValue()) {
                        m15994Q0(this.f17550T.toLowerCase());
                    } else {
                        this.f17567j.m26703g(this.f17571l, this.f17573m);
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            } catch (Exception e11) {
                Log.e("Login check", e11.getMessage());
            }
        }
    }

    @SuppressLint({"ResourceType"})
    /* renamed from: O0 */
    public final void m15990O0() {
        this.f17561g = new EditText(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        this.f17561g.setPaddingRelative(35, 0, 35, 0);
        this.f17561g.setLayoutParams(layoutParams);
        this.f17561g.setHint(getResources().getString(2132018837));
        this.f17561g.setHintTextColor(getResources().getColor(2131100158));
        this.f17561g.setTextColor(-1);
        if (C5251a.f30034d.booleanValue()) {
            this.f17561g.setNextFocusLeftId(2131429009);
        } else {
            this.f17561g.setNextFocusLeftId(2131428968);
        }
        this.f17561g.setTextSize(22.0f);
        this.f17561g.setId(101);
        this.f17561g.setNextFocusRightId(101);
        this.f17561g.setBackground(getResources().getDrawable(2131231802));
        this.f17561g.setFocusable(true);
        this.f17561g.setTypeface(Typeface.SANS_SERIF);
        this.f17561g.setInputType(161);
        this.rl_name.addView(this.f17561g);
        this.f17557d = new EditText(this);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        this.f17557d.setPaddingRelative(35, 0, 35, 0);
        this.f17557d.setLayoutParams(layoutParams2);
        if (C5251a.f30044i.booleanValue()) {
            this.linearLayout.setGravity(16);
        }
        this.f17557d.setHint(getResources().getString(2132018764));
        this.f17557d.setHintTextColor(getResources().getColor(2131100158));
        this.f17557d.setTextColor(-1);
        this.f17557d.setTextSize(22.0f);
        this.f17557d.setId(102);
        this.f17557d.setNextFocusRightId(102);
        if (C5251a.f30034d.booleanValue()) {
            this.f17557d.setNextFocusLeftId(2131429009);
        } else {
            this.f17557d.setNextFocusLeftId(2131428968);
        }
        this.f17557d.setFocusable(true);
        this.f17557d.setBackground(getResources().getDrawable(2131231802));
        this.f17557d.setTypeface(Typeface.SANS_SERIF);
        this.f17557d.setInputType(161);
        this.rl_email.addView(this.f17557d);
        this.f17558e = new EditText(this);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
        this.f17558e.setPaddingRelative(35, 0, 35, 0);
        this.f17558e.setLayoutParams(layoutParams3);
        this.f17558e.setHint(getResources().getString(2132018283));
        this.f17558e.setHintTextColor(getResources().getColor(2131100158));
        this.f17558e.setTextColor(-1);
        this.f17558e.setTextSize(22.0f);
        this.f17558e.setId(103);
        if (C5251a.f30034d.booleanValue()) {
            this.f17558e.setNextFocusLeftId(2131429009);
        } else {
            this.f17558e.setNextFocusLeftId(2131428968);
        }
        this.f17558e.setBackground(getResources().getDrawable(2131231802));
        this.f17558e.setFocusable(true);
        this.f17558e.setTypeface(Typeface.SANS_SERIF);
        this.f17558e.setInputType(129);
        this.rl_password.addView(this.f17558e);
        this.eyepass.setId(110);
        this.eyepass.setFocusable(true);
        this.f17558e.setNextFocusDownId(104);
        this.f17558e.setNextFocusUpId(102);
        this.eyepass.setNextFocusDownId(104);
        this.eyepass.setNextFocusUpId(102);
        this.eyepass.setBackground(getResources().getDrawable(2131231802));
        this.eyepass.setOnClickListener(new ViewOnClickListenerC2828g(this));
        if (C5251a.f30014M.booleanValue()) {
            this.f17559f = new EditText(this);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -1);
            this.f17559f.setPaddingRelative(35, 0, 35, 0);
            this.f17559f.setLayoutParams(layoutParams4);
            this.f17559f.setHint(getResources().getString(2132018551));
            this.f17559f.setHintTextColor(getResources().getColor(2131100158));
            this.f17559f.setHintTextColor(-1);
            this.f17559f.setTextSize(22.0f);
            this.f17559f.setId(104);
            this.f17559f.setBackground(getResources().getDrawable(2131231802));
            this.f17559f.setFocusable(true);
            this.f17559f.setTypeface(Typeface.SANS_SERIF);
            this.f17559f.setInputType(161);
            this.rl_server_url.addView(this.f17559f);
        }
        C5251a.f30034d.booleanValue();
        this.f17557d.requestFocus();
        this.f17557d.requestFocusFromTouch();
    }

    @Override // p324sf.InterfaceC8567f
    /* renamed from: P */
    public void mo15991P(String str) {
        ProgressDialog progressDialog = this.f17577o;
        if (progressDialog != null) {
            progressDialog.dismiss();
            Toast.makeText(this, this.f17569k.getResources().getString(2132017877), 0).show();
        }
    }

    /* renamed from: P0 */
    public final void m15992P0() {
        SharepreferenceDBHandler.m15351O("api", this.f17569k);
        startActivity(new Intent(this, (Class<?>) MultiUserActivity.class));
        overridePendingTransition(2130772003, 2130772000);
        finish();
    }

    @Override // p324sf.InterfaceC8567f
    /* renamed from: Q */
    public void mo15993Q(ArrayList<String> arrayList, String str) {
        if (arrayList == null || arrayList.size() <= 0) {
            mo15997b();
            if (C5251a.f30030b.booleanValue()) {
                Toast.makeText(this, getResources().getString(2132017872), 0).show();
                return;
            } else {
                C5255e.m26241k0(this.f17569k, "Your Account is invalid or has expired !");
                return;
            }
        }
        try {
            this.f17592w.putString(C5251a.f30066t, arrayList.get(0).trim());
            this.f17592w.apply();
            arrayList.remove(0);
            this.f17567j.m26704h(this.f17571l, this.f17573m, arrayList);
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: Q0 */
    public final void m15994Q0(String str) {
        if (str != null && !str.equals("") && !str.isEmpty()) {
            this.f17566i0 = new ArrayList<>(Arrays.asList(str.split(",")));
        }
        ArrayList<String> arrayList = this.f17566i0;
        if (arrayList == null || arrayList.size() < 1) {
            ArrayList<String> arrayList2 = this.f17566i0;
            if (arrayList2 == null || arrayList2.size() != 0) {
                return;
            }
            mo15997b();
            Toast.makeText(this, this.f17569k.getResources().getString(2132018343), 0).show();
            return;
        }
        try {
            this.f17592w.putString(C5251a.f30066t, this.f17566i0.get(0).trim());
            this.f17592w.commit();
            this.f17566i0.remove(0);
            this.f17567j.m26704h(this.f17571l, this.f17573m, this.f17566i0);
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: R0 */
    public final void m15995R0() {
        C5371c c5371c;
        String str;
        ArrayList<MultiUserDBModel> m15279v = this.f17543M.m15279v();
        if (m15279v != null) {
            int size = m15279v.size();
            this.f17561g.setText("User" + (size + 1));
        }
        this.f17571l = this.f17557d.getText().toString().trim();
        this.f17573m = this.f17558e.getText().toString().trim();
        this.f17553W = this.f17561g.getText().toString().trim();
        this.f17592w = this.f17591v.edit();
        if (C5251a.f30042h.booleanValue() || !m15983G0()) {
            if (C5251a.f30042h.booleanValue()) {
                C5251a.f30069u0 = C5251a.f30071v0;
                if (m15983G0()) {
                    SharepreferenceDBHandler.m15347K(this.f17569k, this.f17571l);
                    mo15996a();
                    this.f17553W = this.f17561g.getText().toString().trim();
                    new AsyncTaskC2831j(this).execute(new Void[0]);
                    return;
                }
                return;
            }
            return;
        }
        C5251a.f30069u0 = C5251a.f30073w0;
        mo15996a();
        if (C5251a.f30030b.booleanValue()) {
            this.f17592w.putString(C5251a.f30066t, "");
            this.f17592w.apply();
            this.f17581q.putString(C5251a.f30066t, "");
            this.f17581q.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, this.f17571l);
            this.f17581q.apply();
            if (C5251a.f30034d.booleanValue()) {
                m15994Q0("");
                this.f17589u.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, this.f17571l);
                this.f17589u.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, this.f17573m);
                this.f17589u.putString("activationCode", "");
                this.f17589u.putString("loginWith", "loginWithDetails");
                this.f17589u.apply();
                this.f17592w.apply();
            }
            c5371c = this.f17567j;
            str = this.f17571l;
        } else {
            if (!C5251a.f30014M.booleanValue()) {
                new AsyncTaskC2831j(this).execute(new Void[0]);
                this.f17589u.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, this.f17571l);
                this.f17589u.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, this.f17573m);
                this.f17589u.putString("activationCode", "");
                this.f17589u.putString("loginWith", "loginWithDetails");
                this.f17589u.apply();
                this.f17592w.apply();
            }
            String lowerCase = this.f17559f.getText().toString().trim().toLowerCase();
            this.f17575n = lowerCase;
            this.f17592w.putString(C5251a.f30066t, lowerCase);
            this.f17592w.apply();
            this.f17581q.putString(C5251a.f30066t, this.f17575n);
            this.f17581q.apply();
            c5371c = this.f17567j;
            str = this.f17571l;
        }
        c5371c.m26703g(str, this.f17573m);
        this.f17589u.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, this.f17571l);
        this.f17589u.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, this.f17573m);
        this.f17589u.putString("activationCode", "");
        this.f17589u.putString("loginWith", "loginWithDetails");
        this.f17589u.apply();
        this.f17592w.apply();
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: a */
    public void mo15996a() {
        ProgressDialog progressDialog = this.f17577o;
        if (progressDialog != null) {
            progressDialog.show();
        }
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: b */
    public void mo15997b() {
        try {
            ProgressDialog progressDialog = this.f17577o;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        } catch (Exception e10) {
        }
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: c */
    public void mo15998c(String str) {
        if (this.f17569k == null || str.isEmpty()) {
            return;
        }
        C5255e.m26241k0(this.f17569k, str);
    }

    @Override // p324sf.InterfaceC8567f
    /* renamed from: i */
    public void mo15999i(LoginCallback loginCallback, String str) {
        String string;
        Context context;
        String str2;
        if (this.f17569k != null) {
            if (loginCallback == null || loginCallback.m15009b() == null) {
                mo15997b();
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
                    this.f17569k.getSharedPreferences("loginPrefsserverurl", 0).getString(C5251a.f30066t, "").toLowerCase();
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
                    this.f17594y = this.f17569k.getSharedPreferences("allowedFormat", 0);
                    this.f17595z = this.f17569k.getSharedPreferences("timeFormat", 0);
                    this.f17531A = this.f17569k.getSharedPreferences("epgchannelupdate", 0);
                    this.f17532B = this.f17569k.getSharedPreferences("automation_channels", 0);
                    this.f17533C = this.f17569k.getSharedPreferences("automation_epg", 0);
                    this.f17536F = this.f17594y.edit();
                    this.f17534D = this.f17595z.edit();
                    this.f17535E = this.f17531A.edit();
                    this.f17537G = this.f17532B.edit();
                    this.f17538H = this.f17533C.edit();
                    SharedPreferences sharedPreferences = this.f17569k.getSharedPreferences("auto_start", 0);
                    this.f17541K = sharedPreferences;
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    this.f17542L = edit2;
                    if (edit2 != null) {
                        edit2.putBoolean("full_epg", true);
                        this.f17542L.apply();
                    }
                    if (this.f17532B.getString("automation_channels", "").equals("")) {
                        this.f17537G.putString("automation_channels", "checked");
                        this.f17537G.apply();
                    }
                    if (this.f17533C.getString("automation_epg", "").equals("")) {
                        this.f17538H.putString("automation_epg", "checked");
                        this.f17538H.apply();
                    }
                    C5251a.f30012K = Boolean.FALSE;
                    if (this.f17594y.getString("allowedFormat", "").equals("")) {
                        this.f17536F.putString("allowedFormat", "ts");
                        this.f17536F.apply();
                    }
                    if (this.f17595z.getString("timeFormat", C5251a.f30053m0).equals("")) {
                        this.f17534D.putString("timeFormat", C5251a.f30053m0);
                        this.f17534D.apply();
                    }
                    if (this.f17531A.getString("epgchannelupdate", "").equals("")) {
                        this.f17535E.putString("epgchannelupdate", "all");
                        this.f17535E.apply();
                    }
                    this.f17543M = new MultiUserDBHandler(this.f17569k);
                    boolean booleanValue = C5251a.f30014M.booleanValue();
                    MultiUserDBHandler multiUserDBHandler = this.f17543M;
                    if (booleanValue) {
                        try {
                            if (multiUserDBHandler.m15275p(this.f17553W, m15091j, m15089h, m15065f, "api", m15065f)) {
                                mo15997b();
                                context = this.f17569k;
                                str2 = getString(2132017307) + this.f17553W + getString(2132018766) + m15091j + getString(2132017313) + C5251a.f30009H;
                            } else {
                                this.f17543M.m15271f(this.f17553W, m15091j, m15089h, C5251a.f30009H, m15065f, C5251a.f30069u0);
                                context = this.f17569k;
                                str2 = getResources().getString(2132018760);
                            }
                            Toast.makeText(context, str2, 0).show();
                        } catch (WindowManager.BadTokenException e10) {
                        }
                        SharedPreferences.Editor edit3 = this.f17569k.getSharedPreferences("loginprefsmultiuser", 0).edit();
                        edit3.putString("name", this.f17553W);
                        edit3.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, m15091j);
                        edit3.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, m15089h);
                        edit3.putString(C5251a.f30066t, m15065f);
                        edit3.apply();
                    } else if (!multiUserDBHandler.m15275p("", m15091j, m15089h, m15065f, "api", m15065f)) {
                        this.f17543M.m15271f("", m15091j, m15089h, C5251a.f30009H, m15065f, C5251a.f30069u0);
                    }
                    try {
                        if (Build.VERSION.SDK_INT != 25) {
                            Toast.makeText(this.f17569k, getResources().getString(2132017976), 0).show();
                        }
                    } catch (WindowManager.BadTokenException e11) {
                    }
                    if (this.f17569k != null) {
                        SharepreferenceDBHandler.m15376g0(this.f17543M.m15282y(this.f17553W, m15091j, m15089h, m15065f, "api", m15065f), this.f17569k);
                    }
                    mo15997b();
                    startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
                    finish();
                    return;
                }
                mo15997b();
                string = getResources().getString(2132017878) + m15090i;
            } else {
                if (!str.equals("validateLogin")) {
                    return;
                }
                mo15997b();
                string = getResources().getString(2132017873);
            }
            Toast.makeText(this, string, 0).show();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:16:0x004a
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        /*
            r5 = this;
            java.lang.Boolean r0 = p151if.C5251a.f30036e
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L10
            r0 = r5
            super.onBackPressed()
            goto L49
        L10:
            r0 = r5
            boolean r0 = r0.f17565i
            if (r0 == 0) goto L1c
            r0 = r5
            super.onBackPressed()
            return
        L1c:
            r0 = r5
            r1 = 1
            r0.f17565i = r1
            r0 = r5
            r1 = r5
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Exception -> L4a
            r2 = 2132018406(0x7f1404e6, float:1.9675118E38)
            java.lang.String r1 = r1.getString(r2)     // Catch: java.lang.Exception -> L4a
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)     // Catch: java.lang.Exception -> L4a
            r0.show()     // Catch: java.lang.Exception -> L4a
        L33:
            android.os.Handler r0 = new android.os.Handler     // Catch: java.lang.Exception -> L4a
            r1 = r0
            r1.<init>()
            com.maxdigitall.maxdigitaliptvbox.view.activity.LoginActivity$h r1 = new com.maxdigitall.maxdigitaliptvbox.view.activity.LoginActivity$h
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r2 = 2000(0x7d0, double:9.88E-321)
            boolean r0 = r0.postDelayed(r1, r2)
        L49:
            return
        L4a:
            r6 = move-exception
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.LoginActivity.onBackPressed():void");
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    @SuppressLint({"RtlHardcoded"})
    public void onCreate(Bundle bundle) {
        EditText editText;
        int i10;
        EditText editText2;
        this.f17569k = this;
        C9745g.f44477c = new C9745g(this);
        super.onCreate(bundle);
        C6783a c6783a = new C6783a(this.f17569k);
        this.f17590u0 = c6783a;
        setContentView(c6783a.m31288z().equals(C5251a.f30065s0) ? 2131624336 : 2131624335);
        ButterKnife.m5626a(this);
        if (!C5251a.f30014M.booleanValue()) {
            m15981D0();
            m16000q0();
            m15972J0();
            m16001r0();
        }
        this.f17583r = getSharedPreferences("sharedprefremberme", 0);
        m15985H0();
        m15987K0();
        m15982F0();
        String string = this.f17569k.getSharedPreferences("selected_language", 0).getString("selected_language", "English");
        this.f17564h0 = string;
        if (string.equalsIgnoreCase("Arabic")) {
            editText = this.f17558e;
            i10 = 21;
        } else {
            editText = this.f17558e;
            i10 = 19;
        }
        editText.setGravity(i10);
        C5251a.f30034d.booleanValue();
        this.f17557d.requestFocus();
        RelativeLayout relativeLayout = this.rl_connect_vpn;
        relativeLayout.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2832k(this, relativeLayout));
        RelativeLayout relativeLayout2 = this.rl_list_users;
        relativeLayout2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2832k(this, relativeLayout2));
        RelativeLayout relativeLayout3 = this.rl_bt_submit;
        relativeLayout3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2832k(this, relativeLayout3));
        if (C5251a.f30034d.booleanValue()) {
            this.rl_bt_submit.setNextFocusLeftId(2131429009);
            if (C5251a.f30014M.booleanValue() && (editText2 = this.f17559f) != null) {
                editText2.setNextFocusLeftId(2131429009);
            }
        } else {
            this.rl_bt_submit.setNextFocusLeftId(2131428968);
        }
        if (C5251a.f30034d.booleanValue()) {
            this.rl_connect_vpn.setNextFocusRightId(2131429009);
        } else {
            this.rl_connect_vpn.setNextFocusRightId(2131428961);
        }
        this.rl_list_users.setNextFocusRightId(2131428961);
        C9174b.m38607a(this.f17558e);
        this.f17557d.setFilters(new InputFilter[]{f17530v0});
        String action = getIntent().getAction();
        this.f17586s0 = action;
        if (action == null || !action.equalsIgnoreCase("login_perform")) {
            return;
        }
        this.f17557d.setText(SharepreferenceDBHandler.m15338B(this.f17569k));
        this.f17558e.setText(SharepreferenceDBHandler.m15339C(this.f17569k));
        if (C5251a.f30034d.booleanValue()) {
            this.f17561g.setText("Free Trial");
        }
        this.rl_bt_submit.performClick();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 19) {
            return super.onKeyUp(i10, keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        C5255e.m26233f(this.f17569k);
        overridePendingTransition(2130772003, 2130772000);
    }

    /* renamed from: q0 */
    public void m16000q0() {
        this.f17578o0 = Build.VERSION.RELEASE + " " + Build.VERSION_CODES.class.getFields()[Build.VERSION.SDK_INT].getName();
    }

    /* renamed from: r0 */
    public void m16001r0() {
        int nextInt = new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS;
        this.f17584r0 = nextInt;
        C9740b.f44454b = String.valueOf(nextInt);
    }

    /* renamed from: s0 */
    public void m16002s0() {
        this.f17574m0 = m15973M0(C9744f.m41041c(this) + Marker.ANY_MARKER + C9744f.m41042d(this) + "-" + this.f17571l + "-" + C9740b.f44454b + "-" + this.f17580p0 + "-unknown-" + m15972J0() + "-" + this.f17578o0);
        ArrayList arrayList = new ArrayList();
        C9745g.f44476b = arrayList;
        arrayList.add(C9745g.m41047a("m", "gu"));
        C9745g.f44476b.add(C9745g.m41047a("k", C9744f.m41041c(this)));
        C9745g.f44476b.add(C9745g.m41047a("sc", this.f17574m0));
        C9745g.f44476b.add(C9745g.m41047a("u", this.f17571l));
        C9745g.f44476b.add(C9745g.m41047a("pw", "no_password"));
        C9745g.f44476b.add(C9745g.m41047a("r", C9740b.f44454b));
        C9745g.f44476b.add(C9745g.m41047a("av", this.f17580p0));
        C9745g.f44476b.add(C9745g.m41047a("dt", "unknown"));
        C9745g.f44476b.add(C9745g.m41047a("d", m15972J0()));
        C9745g.f44476b.add(C9745g.m41047a("do", this.f17578o0));
        C9745g.f44477c.m41048b(this);
    }

    @Override // p324sf.InterfaceC8567f
    /* renamed from: t */
    public void mo16003t(String str) {
        mo15997b();
        if (!str.equals("")) {
            C5255e.m26241k0(this.f17569k, str);
        } else if (C5251a.f30030b.booleanValue()) {
            Toast.makeText(this, getResources().getString(2132017872), 0).show();
        } else {
            C5255e.m26241k0(this.f17569k, "Your Account is invalid or has expired !");
        }
    }

    @Override // p324sf.InterfaceC8562a
    /* renamed from: w */
    public void mo16004w(String str) {
        mo15997b();
        if (str != null) {
            C5255e.m26241k0(this.f17569k, str);
        } else {
            C5255e.m26241k0(this.f17569k, "Your Activation code is not invalid");
        }
    }

    @Override // p324sf.InterfaceC8562a
    /* renamed from: y */
    public void mo16005y(ActivationCallBack activationCallBack, String str) {
        m16002s0();
    }
}

package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import com.google.android.exoplayer2.p048ui.C2399e;
import com.google.android.exoplayer2.p048ui.StyledPlayerView;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.activity.ExoPlayerMoviesSeriesActivity;
import java.util.Collections;
import java.util.List;
import org.apache.http.HttpHost;
import org.apache.http.client.config.CookieSpecs;
import p009a8.C0083a1;
import p009a8.C0103k;
import p027b9.InterfaceC0854m;
import p059d9.C4372l;
import p059d9.C4401z0;
import p059d9.InterfaceC4370k;
import p078e9.C4670d0;
import p078e9.C4682p;
import p151if.C5255e;
import p204lg.C5876c;
import p218mf.C6588b;
import p218mf.C6597k;
import p267p6.AbstractC7574e2;
import p267p6.C7561b1;
import p267p6.C7562b2;
import p267p6.C7565c1;
import p267p6.C7597l1;
import p267p6.C7603n1;
import p267p6.C7609p1;
import p267p6.C7612q1;
import p267p6.InterfaceC7606o1;
import p267p6.InterfaceC7639z1;
import p268p7.AbstractC7654o;
import p268p7.C7653n;
import p268p7.C7661v;
import p283q7.C7839a;
import p301r6.C7972d;
import p347u6.C8795a;
import p421y8.AbstractC9886j;
import p421y8.C9882f;
import p421y8.C9888l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ExoPlayerMoviesSeriesActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ExoPlayerMoviesSeriesActivity.class */
public class ExoPlayerMoviesSeriesActivity extends ActivityC0243b implements View.OnClickListener, C2399e.m {

    /* renamed from: B */
    public String f17160B;

    /* renamed from: d */
    public StyledPlayerView f17161d;

    /* renamed from: e */
    public LinearLayout f17162e;

    /* renamed from: f */
    public C7562b2 f17163f;

    /* renamed from: g */
    public boolean f17164g;

    /* renamed from: h */
    public Button f17165h;

    /* renamed from: i */
    public InterfaceC0854m.a f17166i;

    /* renamed from: j */
    public List<C7561b1> f17167j;

    /* renamed from: k */
    public C9882f f17168k;

    /* renamed from: l */
    public C9882f.d f17169l;

    /* renamed from: m */
    public C0083a1 f17170m;

    /* renamed from: n */
    public boolean f17171n;

    /* renamed from: o */
    public int f17172o;

    /* renamed from: p */
    public long f17173p;

    /* renamed from: q */
    public SharedPreferences f17174q;

    /* renamed from: r */
    public SharedPreferences f17175r;

    /* renamed from: s */
    public Context f17176s;

    /* renamed from: t */
    public String f17177t;

    /* renamed from: y */
    public String f17182y;

    /* renamed from: u */
    public String f17178u = "";

    /* renamed from: v */
    public int f17179v = -1;

    /* renamed from: w */
    public int f17180w = -1;

    /* renamed from: x */
    public int f17181x = 0;

    /* renamed from: z */
    public String f17183z = "";

    /* renamed from: A */
    public String f17159A = "";

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ExoPlayerMoviesSeriesActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ExoPlayerMoviesSeriesActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ExoPlayerMoviesSeriesActivity$b.class */
    public class C2762b implements InterfaceC4370k<C7597l1> {

        /* renamed from: a */
        public final ExoPlayerMoviesSeriesActivity f17184a;

        public C2762b(ExoPlayerMoviesSeriesActivity exoPlayerMoviesSeriesActivity) {
            this.f17184a = exoPlayerMoviesSeriesActivity;
        }

        @Override // p059d9.InterfaceC4370k
        @SuppressLint({"StringFormatInvalid"})
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Pair<Integer, String> mo15749a(C7597l1 c7597l1) {
            String string = this.f17184a.getString(2132017684);
            Throwable cause = c7597l1.getCause();
            String str = string;
            if (cause instanceof AbstractC7654o.a) {
                AbstractC7654o.a aVar = (AbstractC7654o.a) cause;
                C7653n c7653n = aVar.f37288d;
                str = c7653n == null ? aVar.getCause() instanceof C7661v.c ? this.f17184a.getString(2132017690) : aVar.f37287c ? this.f17184a.getString(2132017688, aVar.f37286b) : this.f17184a.getString(2132017687, aVar.f37286b) : this.f17184a.getString(2132017686, c7653n.f37201a);
            }
            return Pair.create(0, str);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ExoPlayerMoviesSeriesActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ExoPlayerMoviesSeriesActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ExoPlayerMoviesSeriesActivity$c.class */
    public class C2763c implements InterfaceC7606o1.e {

        /* renamed from: b */
        public final ExoPlayerMoviesSeriesActivity f17185b;

        public C2763c(ExoPlayerMoviesSeriesActivity exoPlayerMoviesSeriesActivity) {
            this.f17185b = exoPlayerMoviesSeriesActivity;
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: A */
        public void mo12514A(C7597l1 c7597l1) {
            if (c7597l1.f36854b == 1002) {
                this.f17185b.f17163f.m32651c0();
                this.f17185b.f17163f.prepare();
            } else {
                this.f17185b.m15744G0();
                this.f17185b.m15741D0();
            }
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: C */
        public /* synthetic */ void mo12515C(InterfaceC7606o1 interfaceC7606o1, InterfaceC7606o1.d dVar) {
            C7612q1.m32987f(this, interfaceC7606o1, dVar);
        }

        @Override // p078e9.InterfaceC4683q
        /* renamed from: D */
        public /* synthetic */ void mo12516D() {
            C7612q1.m33000s(this);
        }

        @Override // p243o8.InterfaceC6929k
        /* renamed from: E */
        public /* synthetic */ void mo12517E(List list) {
            C7612q1.m32984c(this, list);
        }

        @Override // p078e9.InterfaceC4683q
        /* renamed from: I */
        public /* synthetic */ void mo12518I(int i10, int i11) {
            C7612q1.m33004w(this, i10, i11);
        }

        @Override // p283q7.InterfaceC7844f
        /* renamed from: L */
        public /* synthetic */ void mo12519L(C7839a c7839a) {
            C7612q1.m32992k(this, c7839a);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: M */
        public /* synthetic */ void mo12520M(int i10) {
            C7609p1.m32891l(this, i10);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: N */
        public /* synthetic */ void mo12521N(boolean z10) {
            C7612q1.m32988g(this, z10);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: O */
        public /* synthetic */ void mo12522O() {
            C7609p1.m32894o(this);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: Q */
        public /* synthetic */ void mo12523Q(InterfaceC7606o1.b bVar) {
            C7612q1.m32983b(this, bVar);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: R */
        public /* synthetic */ void mo12524R(C7597l1 c7597l1) {
            C7612q1.m32998q(this, c7597l1);
        }

        @Override // p301r6.InterfaceC7978g
        /* renamed from: S */
        public /* synthetic */ void mo12525S(C7972d c7972d) {
            C7612q1.m32982a(this, c7972d);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: Y */
        public /* synthetic */ void mo12526Y(boolean z10, int i10) {
            C7609p1.m32890k(this, z10, i10);
        }

        @Override // p301r6.InterfaceC7978g
        /* renamed from: a */
        public /* synthetic */ void mo12527a(boolean z10) {
            C7612q1.m33003v(this, z10);
        }

        @Override // p078e9.InterfaceC4683q
        /* renamed from: a0 */
        public /* synthetic */ void mo12528a0(int i10, int i11, int i12, float f10) {
            C4682p.m23609a(this, i10, i11, i12, f10);
        }

        @Override // p078e9.InterfaceC4683q
        /* renamed from: c */
        public /* synthetic */ void mo12529c(C4670d0 c4670d0) {
            C7612q1.m33007z(this, c4670d0);
        }

        @Override // p347u6.InterfaceC8796b
        /* renamed from: d0 */
        public /* synthetic */ void mo12531d0(C8795a c8795a) {
            C7612q1.m32985d(this, c8795a);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: e */
        public /* synthetic */ void mo12532e(C7603n1 c7603n1) {
            C7612q1.m32994m(this, c7603n1);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: e0 */
        public void mo12533e0(C0083a1 c0083a1, C9888l c9888l) {
            this.f17185b.m15744G0();
            if (c0083a1 != this.f17185b.f17170m) {
                AbstractC9886j.a m41705g = this.f17185b.f17168k.m41705g();
                if (m41705g != null) {
                    if (m41705g.m41714i(2) == 1) {
                        this.f17185b.m15742E0(2132017695);
                    }
                    if (m41705g.m41714i(1) == 1) {
                        this.f17185b.m15742E0(2132017694);
                    }
                }
                this.f17185b.f17170m = c0083a1;
            }
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: f */
        public /* synthetic */ void mo12534f(int i10) {
            C7612q1.m32996o(this, i10);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: g0 */
        public /* synthetic */ void mo12535g0(boolean z10, int i10) {
            C7612q1.m32993l(this, z10, i10);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: h */
        public /* synthetic */ void mo12536h(boolean z10) {
            C7609p1.m32883d(this, z10);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: i0 */
        public /* synthetic */ void mo12537i0(InterfaceC7606o1.f fVar, InterfaceC7606o1.f fVar2, int i10) {
            C7612q1.m32999r(this, fVar, fVar2, i10);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: j */
        public /* synthetic */ void mo12538j(List list) {
            C7609p1.m32896q(this, list);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: m */
        public void mo12539m(int i10) {
            if (i10 == 4) {
                this.f17185b.m15741D0();
            }
            this.f17185b.m15744G0();
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: m0 */
        public /* synthetic */ void mo12540m0(boolean z10) {
            C7612q1.m32989h(this, z10);
        }

        @Override // p267p6.InterfaceC7606o1.c
        public /* synthetic */ void onRepeatModeChanged(int i10) {
            C7612q1.m33001t(this, i10);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: p */
        public /* synthetic */ void mo12541p(AbstractC7574e2 abstractC7574e2, int i10) {
            C7612q1.m33005x(this, abstractC7574e2, i10);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: s */
        public /* synthetic */ void mo12542s(boolean z10) {
            C7612q1.m33002u(this, z10);
        }

        @Override // p347u6.InterfaceC8796b
        /* renamed from: w */
        public /* synthetic */ void mo12543w(int i10, boolean z10) {
            C7612q1.m32986e(this, i10, z10);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: x */
        public /* synthetic */ void mo12544x(C7561b1 c7561b1, int i10) {
            C7612q1.m32990i(this, c7561b1, i10);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: y */
        public /* synthetic */ void mo12545y(C7565c1 c7565c1) {
            C7612q1.m32991j(this, c7565c1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0 */
    public /* synthetic */ void m15731A0(DialogInterface dialogInterface) {
        this.f17164g = false;
    }

    /* renamed from: B0 */
    public void m15739B0() {
        if (this.f17163f != null) {
            m15746I0();
            m15745H0();
            this.f17163f.m32448g1();
            this.f17163f = null;
            this.f17167j = Collections.emptyList();
            this.f17168k = null;
        }
    }

    /* renamed from: C0 */
    public void m15740C0() {
        setContentView(2131624463);
    }

    /* renamed from: D0 */
    public final void m15741D0() {
        this.f17162e.setVisibility(0);
    }

    /* renamed from: E0 */
    public final void m15742E0(int i10) {
        m15743F0(getString(i10));
    }

    /* renamed from: F0 */
    public final void m15743F0(String str) {
        Toast.makeText(getApplicationContext(), str, 1).show();
    }

    /* renamed from: G0 */
    public final void m15744G0() {
        this.f17165h.setEnabled(this.f17163f != null && C6597k.m30469k0(this.f17168k));
    }

    /* renamed from: H0 */
    public final void m15745H0() {
        C7562b2 c7562b2 = this.f17163f;
        if (c7562b2 != null) {
            this.f17171n = c7562b2.mo32480y();
            this.f17172o = this.f17163f.mo32451i();
            this.f17173p = Math.max(0L, this.f17163f.mo32417H());
        }
    }

    /* renamed from: I0 */
    public final void m15746I0() {
        C9882f c9882f = this.f17168k;
        if (c9882f != null) {
            this.f17169l = c9882f.m41646u();
        }
    }

    @Override // com.google.android.exoplayer2.p048ui.C2399e.m
    /* renamed from: d */
    public void mo12590d(int i10) {
        this.f17162e.setVisibility(i10);
    }

    @Override // androidx.appcompat.app.ActivityC0243b, p030c0.ActivityC0952l, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f17161d.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f17165h && !this.f17164g && C6597k.m30469k0(this.f17168k)) {
            this.f17164g = true;
            C6597k.m30464Z(this.f17168k, new DialogInterface.OnDismissListener(this) { // from class: kf.k

                /* renamed from: b */
                public final ExoPlayerMoviesSeriesActivity f31686b;

                {
                    this.f31686b = this;
                }

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f31686b.m15731A0(dialogInterface);
                }
            }).mo2024M(getSupportFragmentManager(), null);
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f17176s = this;
        super.onCreate(bundle);
        this.f17166i = C6588b.m30439d(this);
        m15740C0();
        this.f17162e = (LinearLayout) findViewById(C5876c.f32937a);
        Button button = (Button) findViewById(2131429139);
        this.f17165h = button;
        button.setOnClickListener(this);
        StyledPlayerView styledPlayerView = (StyledPlayerView) findViewById(2131428863);
        this.f17161d = styledPlayerView;
        styledPlayerView.setControllerVisibilityListener(this);
        this.f17161d.setErrorMessageProvider(new C2762b());
        this.f17161d.requestFocus();
        if (bundle == null) {
            this.f17169l = new C9882f.e(this).mo41689w();
            m15747x0();
        } else {
            this.f17169l = (C9882f.d) bundle.getParcelable("track_selector_parameters");
            this.f17171n = bundle.getBoolean("auto_play");
            this.f17172o = bundle.getInt("window");
            this.f17173p = bundle.getLong("position");
        }
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m15739B0();
        m15747x0();
        setIntent(intent);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        if (C4401z0.f26679a <= 23) {
            StyledPlayerView styledPlayerView = this.f17161d;
            if (styledPlayerView != null) {
                styledPlayerView.m12589z();
            }
            m15739B0();
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (iArr.length == 0) {
            return;
        }
        if (iArr[0] == 0) {
            m15748z0();
        } else {
            m15742E0(2132018655);
            finish();
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        if (C4401z0.f26679a <= 23 || this.f17163f == null) {
            m15748z0();
            StyledPlayerView styledPlayerView = this.f17161d;
            if (styledPlayerView != null) {
                styledPlayerView.m12566A();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m15746I0();
        m15745H0();
        bundle.putParcelable("track_selector_parameters", this.f17169l);
        bundle.putBoolean("auto_play", this.f17171n);
        bundle.putInt("window", this.f17172o);
        bundle.putLong("position", this.f17173p);
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onStart() {
        super.onStart();
        if (C4401z0.f26679a > 23) {
            m15748z0();
            StyledPlayerView styledPlayerView = this.f17161d;
            if (styledPlayerView != null) {
                styledPlayerView.m12566A();
            }
        }
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onStop() {
        super.onStop();
        if (C4401z0.f26679a > 23) {
            StyledPlayerView styledPlayerView = this.f17161d;
            if (styledPlayerView != null) {
                styledPlayerView.m12589z();
            }
            m15739B0();
        }
    }

    /* renamed from: x0 */
    public void m15747x0() {
        this.f17171n = true;
        this.f17172o = -1;
        this.f17173p = -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: z0 */
    public boolean m15748z0() {
        String str;
        boolean z10;
        String str2;
        StringBuilder sb2;
        String sb3;
        String str3;
        String str4;
        boolean z11;
        StringBuilder sb4;
        if (this.f17163f == null) {
            Intent intent = getIntent();
            this.f17183z = getIntent().getStringExtra("type");
            this.f17174q = getSharedPreferences("loginPrefs", 0);
            this.f17175r = this.f17176s.getSharedPreferences("allowedFormat", 0);
            String string = this.f17174q.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
            String string2 = this.f17174q.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
            this.f17177t = this.f17175r.getString("allowedFormat", "");
            String string3 = this.f17174q.getString("serverUrl", "");
            String string4 = this.f17174q.getString("serverProtocol", "");
            String string5 = this.f17174q.getString("serverPortHttps", "");
            String string6 = this.f17174q.getString("serverPort", "");
            String string7 = this.f17174q.getString("serverPortRtmp", "");
            if (string4 != null) {
                switch (string4.hashCode()) {
                    case 3213448:
                        if (string4.equals(HttpHost.DEFAULT_SCHEME_NAME)) {
                            z11 = false;
                            break;
                        }
                        z11 = -1;
                        break;
                    case 3504631:
                        if (string4.equals("rmtp")) {
                            z11 = true;
                            break;
                        }
                        z11 = -1;
                        break;
                    case 99617003:
                        if (string4.equals(ClientConstants.DOMAIN_SCHEME)) {
                            z11 = 2;
                            break;
                        }
                        z11 = -1;
                        break;
                    default:
                        z11 = -1;
                        break;
                }
                switch (z11) {
                    case false:
                        str = string3;
                        if (string3 != null) {
                            str = string3;
                            if (!string3.startsWith("http://")) {
                                sb4 = new StringBuilder();
                                sb4.append("http://");
                                sb4.append(string3);
                                str = sb4.toString();
                                break;
                            }
                        }
                        break;
                    case true:
                        str = string3;
                        if (string3 != null) {
                            str = string3;
                            if (!string3.startsWith("rmtp://")) {
                                str = "rmtp://" + string3;
                            }
                        }
                        string6 = string7;
                        break;
                    case true:
                        str = string3;
                        string6 = string5;
                        if (string3 != null) {
                            str = string3;
                            string6 = string5;
                            if (!string3.startsWith("https://")) {
                                str = "https://" + string3;
                                string6 = string5;
                                break;
                            }
                        }
                        break;
                    default:
                        str = string3;
                        if (string3 != null) {
                            str = string3;
                            if (!string3.startsWith("http://")) {
                                str = string3;
                                if (!string3.startsWith("https://")) {
                                    sb4 = new StringBuilder();
                                    sb4.append("http://");
                                    sb4.append(string3);
                                    str = sb4.toString();
                                    break;
                                }
                            }
                        }
                        break;
                }
            } else {
                string6 = "";
                str = string3;
            }
            this.f17178u = getIntent().getStringExtra("VIDEO_TITLE");
            this.f17179v = getIntent().getIntExtra("OPENED_STREAM_ID", 0);
            this.f17180w = getIntent().getIntExtra("STREAM_TOTAL_DURATION", 0);
            this.f17182y = getIntent().getStringExtra("VIDEO_URL");
            this.f17181x = getIntent().getIntExtra("VIDEO_NUM", 0);
            String stringExtra = getIntent().getStringExtra("STREAM_START_TIME");
            String stringExtra2 = getIntent().getStringExtra("STREAM_STOP_TIME");
            String stringExtra3 = getIntent().getStringExtra("CONTAINER_EXTENSION");
            String str5 = this.f17183z;
            if (str5 != null) {
                if (str5.equals("catch_up")) {
                    String str6 = this.f17177t;
                    if ((str6 == null || str6.isEmpty() || this.f17177t.equals("") || !this.f17177t.equals(CookieSpecs.DEFAULT)) && !(((str3 = this.f17177t) != null && !str3.isEmpty() && !this.f17177t.equals("") && this.f17177t.equals("ts")) || (str4 = this.f17177t) == null || str4.isEmpty() || this.f17177t.equals("") || !this.f17177t.equals("m3u8"))) {
                        this.f17177t = ".m3u8";
                    } else {
                        this.f17177t = ".ts";
                    }
                }
                SharepreferenceDBHandler.m15372e0(this.f17183z, this.f17176s);
                String str7 = this.f17183z;
                str7.hashCode();
                switch (str7.hashCode()) {
                    case -1811604269:
                        if (str7.equals("movies_m3u")) {
                            z10 = false;
                            break;
                        }
                        z10 = -1;
                        break;
                    case -1068259517:
                        if (str7.equals("movies")) {
                            z10 = true;
                            break;
                        }
                        z10 = -1;
                        break;
                    case -905838985:
                        if (str7.equals("series")) {
                            z10 = 2;
                            break;
                        }
                        z10 = -1;
                        break;
                    case 48678559:
                        if (str7.equals("catch_up")) {
                            z10 = 3;
                            break;
                        }
                        z10 = -1;
                        break;
                    case 993558001:
                        if (str7.equals("recording")) {
                            z10 = 4;
                            break;
                        }
                        z10 = -1;
                        break;
                    default:
                        z10 = -1;
                        break;
                }
                switch (z10) {
                    case false:
                        this.f17182y = getIntent().getStringExtra("VIDEO_URL");
                        break;
                    case true:
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(str);
                        sb5.append(":");
                        sb5.append(string6);
                        str2 = "/movie/";
                        sb2 = sb5;
                        sb2.append(str2);
                        sb2.append(string);
                        sb2.append("/");
                        sb2.append(string2);
                        sb2.append("/");
                        sb3 = sb2.toString();
                        this.f17159A = sb3;
                        break;
                    case true:
                        this.f17182y = getIntent().getStringExtra("VIDEO_URL");
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(str);
                        sb6.append(":");
                        sb6.append(string6);
                        str2 = "/series/";
                        sb2 = sb6;
                        sb2.append(str2);
                        sb2.append(string);
                        sb2.append("/");
                        sb2.append(string2);
                        sb2.append("/");
                        sb3 = sb2.toString();
                        this.f17159A = sb3;
                        break;
                    case true:
                        this.f17181x = getIntent().getIntExtra("VIDEO_NUM", 0);
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(str);
                        sb7.append(":");
                        sb7.append(string6);
                        sb7.append("/timeshift/");
                        sb7.append(string);
                        sb7.append("/");
                        sb7.append(string2);
                        sb7.append("/");
                        sb7.append(stringExtra2);
                        sb7.append("/");
                        sb7.append(stringExtra);
                        sb2 = sb7;
                        sb2.append("/");
                        sb3 = sb2.toString();
                        this.f17159A = sb3;
                        break;
                    case true:
                        sb3 = getIntent().getStringExtra("VIDEO_PATH");
                        this.f17159A = sb3;
                        break;
                }
            }
            String str8 = this.f17183z;
            this.f17160B = (str8 == null || !str8.equalsIgnoreCase("recording")) ? C5255e.m26252s(this.f17159A) : this.f17159A;
            this.f17160B += this.f17179v + InstructionFileId.DOT + stringExtra3;
            InterfaceC7639z1 m30437b = C6588b.m30437b(this, intent.getBooleanExtra("prefer_extension_decoders", false));
            C0103k c0103k = new C0103k(this.f17166i);
            C9882f c9882f = new C9882f(this);
            this.f17168k = c9882f;
            c9882f.m41643L(this.f17169l);
            this.f17170m = null;
            C7562b2 m32510z = new C7562b2.b(this, m30437b).m32508A(c0103k).m32509B(this.f17168k).m32510z();
            this.f17163f = m32510z;
            m32510z.mo32447g(new C2763c());
            this.f17163f.m32422M0(new C4372l(this.f17168k));
            this.f17163f.m32466q1(C7972d.f38501f, true);
            this.f17163f.mo32456l(this.f17171n);
            this.f17161d.setPlayer(this.f17163f);
        }
        int i10 = this.f17172o;
        if (i10 != -1) {
            this.f17163f.mo32476w(i10, this.f17173p);
        }
        this.f17163f.m32639Q(0, C7561b1.m32345c(this.f17160B));
        this.f17163f.prepare();
        m15744G0();
        return true;
    }
}

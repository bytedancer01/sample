package com.maxdigitall.maxdigitaliptvbox.view.demo;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import com.google.android.exoplayer2.p048ui.C2399e;
import com.google.android.exoplayer2.p048ui.StyledPlayerView;
import com.maxdigitall.maxdigitaliptvbox.view.demo.PlayerActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p009a8.C0083a1;
import p009a8.C0103k;
import p026b8.InterfaceC0822c;
import p027b9.InterfaceC0854m;
import p059d9.C4349a;
import p059d9.C4372l;
import p059d9.C4401z0;
import p059d9.InterfaceC4370k;
import p059d9.RunnableC4366i;
import p078e9.C4670d0;
import p078e9.C4682p;
import p204lg.C5876c;
import p218mf.C6588b;
import p218mf.C6589c;
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
import p365v6.C9270l0;
import p420y7.C9874x;
import p421y8.AbstractC9886j;
import p421y8.C9882f;
import p421y8.C9888l;
import p438z6.C10063c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/PlayerActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/PlayerActivity.class */
public class PlayerActivity extends ActivityC0243b implements View.OnClickListener, C2399e.m {

    /* renamed from: d */
    public StyledPlayerView f22000d;

    /* renamed from: e */
    public LinearLayout f22001e;

    /* renamed from: f */
    public TextView f22002f;

    /* renamed from: g */
    public C7562b2 f22003g;

    /* renamed from: h */
    public boolean f22004h;

    /* renamed from: i */
    public Button f22005i;

    /* renamed from: j */
    public InterfaceC0854m.a f22006j;

    /* renamed from: k */
    public List<C7561b1> f22007k;

    /* renamed from: l */
    public C9882f f22008l;

    /* renamed from: m */
    public C9882f.d f22009m;

    /* renamed from: n */
    public RunnableC4366i f22010n;

    /* renamed from: o */
    public C0083a1 f22011o;

    /* renamed from: p */
    public boolean f22012p;

    /* renamed from: q */
    public int f22013q;

    /* renamed from: r */
    public long f22014r;

    /* renamed from: s */
    public InterfaceC0822c f22015s;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/PlayerActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.PlayerActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/PlayerActivity$b.class */
    public class C3655b implements InterfaceC4370k<C7597l1> {

        /* renamed from: a */
        public final PlayerActivity f22016a;

        public C3655b(PlayerActivity playerActivity) {
            this.f22016a = playerActivity;
        }

        @Override // p059d9.InterfaceC4370k
        @SuppressLint({"StringFormatInvalid"})
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Pair<Integer, String> mo15749a(C7597l1 c7597l1) {
            String string = this.f22016a.getString(2132017684);
            Throwable cause = c7597l1.getCause();
            String str = string;
            if (cause instanceof AbstractC7654o.a) {
                AbstractC7654o.a aVar = (AbstractC7654o.a) cause;
                C7653n c7653n = aVar.f37288d;
                str = c7653n == null ? aVar.getCause() instanceof C7661v.c ? this.f22016a.getString(2132017690) : aVar.f37287c ? this.f22016a.getString(2132017688, aVar.f37286b) : this.f22016a.getString(2132017687, aVar.f37286b) : this.f22016a.getString(2132017686, c7653n.f37201a);
            }
            return Pair.create(0, str);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/PlayerActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.PlayerActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/PlayerActivity$c.class */
    public class C3656c implements InterfaceC7606o1.e {

        /* renamed from: b */
        public final PlayerActivity f22017b;

        public C3656c(PlayerActivity playerActivity) {
            this.f22017b = playerActivity;
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: A */
        public void mo12514A(C7597l1 c7597l1) {
            if (c7597l1.f36854b == 1002) {
                this.f22017b.f22003g.m32651c0();
                this.f22017b.f22003g.prepare();
            } else {
                this.f22017b.m17994M0();
                this.f22017b.m17991J0();
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
            this.f22017b.m17994M0();
            if (c0083a1 != this.f22017b.f22011o) {
                AbstractC9886j.a m41705g = this.f22017b.f22008l.m41705g();
                if (m41705g != null) {
                    if (m41705g.m41714i(2) == 1) {
                        this.f22017b.m17992K0(2132017695);
                    }
                    if (m41705g.m41714i(1) == 1) {
                        this.f22017b.m17992K0(2132017694);
                    }
                }
                this.f22017b.f22011o = c0083a1;
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
                this.f22017b.m17991J0();
            }
            this.f22017b.m17994M0();
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

    /* renamed from: B0 */
    public static List<C7561b1> m17974B0(Intent intent, C3662a c3662a) {
        ArrayList arrayList = new ArrayList();
        for (C7561b1 c7561b1 : C6589c.m30454f(intent)) {
            C9874x m18025g = c3662a.m18025g(((C7561b1.g) C4349a.m21882e(c7561b1.f36449b)).f36504a);
            C7561b1 c7561b12 = c7561b1;
            if (m18025g != null) {
                C7561b1.c m32346a = c7561b1.m32346a();
                m32346a.m32371v(m18025g.f45309b).m32348B(m18025g.f45310c).m32356g(m18025g.f45314g).m32373x(m18025g.f45311d).m32374y(m18025g.f45312e).m32358i(m18025g.f45313f).m32359j(m17975D0(c7561b1));
                c7561b12 = m32346a.m32350a();
            }
            arrayList.add(c7561b12);
        }
        return arrayList;
    }

    /* renamed from: D0 */
    public static Map<String, String> m17975D0(C7561b1 c7561b1) {
        C7561b1.e eVar = c7561b1.f36449b.f36506c;
        return eVar != null ? eVar.f36491c : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F0 */
    public /* synthetic */ void m17976F0(DialogInterface dialogInterface) {
        this.f22004h = false;
    }

    @SuppressLint({"StringFormatInvalid"})
    /* renamed from: A0 */
    public final List<C7561b1> m17985A0(Intent intent) {
        int i10;
        String action = intent.getAction();
        if ("com.google.android.exoplayer.demo.action.VIEW_LIST".equals(action) || "com.google.android.exoplayer.demo.action.VIEW".equals(action)) {
            List<C7561b1> m17974B0 = m17974B0(intent, C6588b.m30445j(this));
            boolean z10 = false;
            for (int i11 = 0; i11 < m17974B0.size(); i11++) {
                C7561b1 c7561b1 = m17974B0.get(i11);
                if (!C4401z0.m22399n(c7561b1)) {
                    i10 = 2132017677;
                } else {
                    if (C4401z0.m22316B0(this, c7561b1)) {
                        return Collections.emptyList();
                    }
                    C7561b1.e eVar = ((C7561b1.g) C4349a.m21882e(c7561b1.f36449b)).f36506c;
                    if (eVar != null) {
                        if (C4401z0.f26679a < 18) {
                            i10 = 2132017681;
                        } else if (!C9270l0.m39123w(eVar.f36489a)) {
                            i10 = 2132017682;
                        }
                    }
                    z10 |= c7561b1.f36449b.f36507d != null;
                }
                m17992K0(i10);
            }
            if (!z10) {
                m17988G0();
            }
            return m17974B0;
        }
        m17993L0(getString(2132018732, action));
        finish();
        return Collections.emptyList();
    }

    /* renamed from: C0 */
    public final InterfaceC0822c m17986C0(C7561b1.b bVar) {
        if (this.f22015s == null) {
            this.f22015s = new C10063c.b(this).m42345a();
        }
        this.f22015s.mo5253k(this.f22003g);
        return this.f22015s;
    }

    /* renamed from: E0 */
    public boolean m17987E0() {
        boolean z10 = false;
        if (this.f22003g == null) {
            Intent intent = getIntent();
            List<C7561b1> m17985A0 = m17985A0(intent);
            this.f22007k = m17985A0;
            if (m17985A0.isEmpty()) {
                return false;
            }
            InterfaceC7639z1 m30437b = C6588b.m30437b(this, intent.getBooleanExtra("prefer_extension_decoders", false));
            C0103k m441g = new C0103k(this.f22006j).m442h(new C0103k.a(this) { // from class: mf.f

                /* renamed from: a */
                public final PlayerActivity f34448a;

                {
                    this.f34448a = this;
                }

                @Override // p009a8.C0103k.a
                /* renamed from: a */
                public final InterfaceC0822c mo444a(C7561b1.b bVar) {
                    InterfaceC0822c m17986C0;
                    m17986C0 = this.f34448a.m17986C0(bVar);
                    return m17986C0;
                }
            }).m441g(this.f22000d);
            C9882f c9882f = new C9882f(this);
            this.f22008l = c9882f;
            c9882f.m41643L(this.f22009m);
            this.f22011o = null;
            C7562b2 m32510z = new C7562b2.b(this, m30437b).m32508A(m441g).m32509B(this.f22008l).m32510z();
            this.f22003g = m32510z;
            m32510z.mo32447g(new C3656c());
            this.f22003g.m32422M0(new C4372l(this.f22008l));
            this.f22003g.m32466q1(C7972d.f38501f, true);
            this.f22003g.mo32456l(this.f22012p);
            this.f22000d.setPlayer(this.f22003g);
            RunnableC4366i runnableC4366i = new RunnableC4366i(this.f22003g, this.f22002f);
            this.f22010n = runnableC4366i;
            runnableC4366i.m22038o();
        }
        int i10 = this.f22013q;
        if (i10 != -1) {
            z10 = true;
        }
        if (z10) {
            this.f22003g.mo32476w(i10, this.f22014r);
        }
        this.f22003g.m32468r1(this.f22007k, !z10);
        this.f22003g.prepare();
        m17994M0();
        return true;
    }

    /* renamed from: G0 */
    public final void m17988G0() {
        InterfaceC0822c interfaceC0822c = this.f22015s;
        if (interfaceC0822c != null) {
            interfaceC0822c.release();
            this.f22015s = null;
            this.f22000d.getOverlayFrameLayout().removeAllViews();
        }
    }

    /* renamed from: H0 */
    public void m17989H0() {
        if (this.f22003g != null) {
            m17996O0();
            m17995N0();
            this.f22010n.m22039q();
            this.f22010n = null;
            this.f22003g.m32448g1();
            this.f22003g = null;
            this.f22007k = Collections.emptyList();
            this.f22008l = null;
        }
        InterfaceC0822c interfaceC0822c = this.f22015s;
        if (interfaceC0822c != null) {
            interfaceC0822c.mo5253k(null);
        }
    }

    /* renamed from: I0 */
    public void m17990I0() {
        setContentView(2131624463);
    }

    /* renamed from: J0 */
    public final void m17991J0() {
        this.f22001e.setVisibility(0);
    }

    /* renamed from: K0 */
    public final void m17992K0(int i10) {
        m17993L0(getString(i10));
    }

    /* renamed from: L0 */
    public final void m17993L0(String str) {
        Toast.makeText(getApplicationContext(), str, 1).show();
    }

    /* renamed from: M0 */
    public final void m17994M0() {
        this.f22005i.setEnabled(this.f22003g != null && C6597k.m30469k0(this.f22008l));
    }

    /* renamed from: N0 */
    public final void m17995N0() {
        C7562b2 c7562b2 = this.f22003g;
        if (c7562b2 != null) {
            this.f22012p = c7562b2.mo32480y();
            this.f22013q = this.f22003g.mo32451i();
            this.f22014r = Math.max(0L, this.f22003g.mo32417H());
        }
    }

    /* renamed from: O0 */
    public final void m17996O0() {
        C9882f c9882f = this.f22008l;
        if (c9882f != null) {
            this.f22009m = c9882f.m41646u();
        }
    }

    @Override // com.google.android.exoplayer2.p048ui.C2399e.m
    /* renamed from: d */
    public void mo12590d(int i10) {
        this.f22001e.setVisibility(i10);
    }

    @Override // androidx.appcompat.app.ActivityC0243b, p030c0.ActivityC0952l, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f22000d.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f22005i && !this.f22004h && C6597k.m30469k0(this.f22008l)) {
            this.f22004h = true;
            C6597k.m30464Z(this.f22008l, new DialogInterface.OnDismissListener(this) { // from class: mf.g

                /* renamed from: b */
                public final PlayerActivity f34449b;

                {
                    this.f34449b = this;
                }

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f34449b.m17976F0(dialogInterface);
                }
            }).mo2024M(getSupportFragmentManager(), null);
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f22006j = C6588b.m30439d(this);
        m17990I0();
        this.f22001e = (LinearLayout) findViewById(C5876c.f32937a);
        this.f22002f = (TextView) findViewById(2131427820);
        Button button = (Button) findViewById(2131429139);
        this.f22005i = button;
        button.setOnClickListener(this);
        StyledPlayerView styledPlayerView = (StyledPlayerView) findViewById(2131428863);
        this.f22000d = styledPlayerView;
        styledPlayerView.setControllerVisibilityListener(this);
        this.f22000d.setErrorMessageProvider(new C3655b());
        this.f22000d.requestFocus();
        if (bundle == null) {
            this.f22009m = new C9882f.e(this).mo41689w();
            m17997z0();
        } else {
            this.f22009m = (C9882f.d) bundle.getParcelable("track_selector_parameters");
            this.f22012p = bundle.getBoolean("auto_play");
            this.f22013q = bundle.getInt("window");
            this.f22014r = bundle.getLong("position");
        }
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m17988G0();
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m17989H0();
        m17988G0();
        m17997z0();
        setIntent(intent);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        if (C4401z0.f26679a <= 23) {
            StyledPlayerView styledPlayerView = this.f22000d;
            if (styledPlayerView != null) {
                styledPlayerView.m12589z();
            }
            m17989H0();
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (iArr.length == 0) {
            return;
        }
        if (iArr[0] == 0) {
            m17987E0();
        } else {
            m17992K0(2132018655);
            finish();
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        if (C4401z0.f26679a <= 23 || this.f22003g == null) {
            m17987E0();
            StyledPlayerView styledPlayerView = this.f22000d;
            if (styledPlayerView != null) {
                styledPlayerView.m12566A();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m17996O0();
        m17995N0();
        bundle.putParcelable("track_selector_parameters", this.f22009m);
        bundle.putBoolean("auto_play", this.f22012p);
        bundle.putInt("window", this.f22013q);
        bundle.putLong("position", this.f22014r);
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onStart() {
        super.onStart();
        if (C4401z0.f26679a > 23) {
            m17987E0();
            StyledPlayerView styledPlayerView = this.f22000d;
            if (styledPlayerView != null) {
                styledPlayerView.m12566A();
            }
        }
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onStop() {
        super.onStop();
        if (C4401z0.f26679a > 23) {
            StyledPlayerView styledPlayerView = this.f22000d;
            if (styledPlayerView != null) {
                styledPlayerView.m12589z();
            }
            m17989H0();
        }
    }

    /* renamed from: z0 */
    public void m17997z0() {
        this.f22012p = true;
        this.f22013q = -1;
        this.f22014r = -9223372036854775807L;
    }
}

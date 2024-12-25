package p059d9;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.widget.TextView;
import java.util.List;
import java.util.Locale;
import p009a8.C0083a1;
import p078e9.C4670d0;
import p078e9.C4682p;
import p267p6.AbstractC7574e2;
import p267p6.C7561b1;
import p267p6.C7562b2;
import p267p6.C7565c1;
import p267p6.C7597l1;
import p267p6.C7603n1;
import p267p6.C7609p1;
import p267p6.C7612q1;
import p267p6.C7629w0;
import p267p6.InterfaceC7606o1;
import p283q7.C7839a;
import p301r6.C7972d;
import p332t6.C8636d;
import p347u6.C8795a;
import p421y8.C9888l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/i.class
 */
/* renamed from: d9.i */
/* loaded from: combined.jar:classes2.jar:d9/i.class */
public class RunnableC4366i implements InterfaceC7606o1.e, Runnable {

    /* renamed from: b */
    public final C7562b2 f26581b;

    /* renamed from: c */
    public final TextView f26582c;

    /* renamed from: d */
    public boolean f26583d;

    public RunnableC4366i(C7562b2 c7562b2, TextView textView) {
        C4349a.m21878a(c7562b2.mo32469s() == Looper.getMainLooper());
        this.f26581b = c7562b2;
        this.f26582c = textView;
    }

    /* renamed from: g */
    public static String m22031g(C8636d c8636d) {
        if (c8636d == null) {
            return "";
        }
        c8636d.m37078c();
        return " sib:" + c8636d.f40318d + " sb:" + c8636d.f40320f + " rb:" + c8636d.f40319e + " db:" + c8636d.f40321g + " mcdb:" + c8636d.f40322h + " dk:" + c8636d.f40323i;
    }

    /* renamed from: i */
    public static String m22032i(float f10) {
        String str;
        if (f10 == -1.0f || f10 == 1.0f) {
            str = "";
        } else {
            str = " par:" + String.format(Locale.US, "%.02f", Float.valueOf(f10));
        }
        return str;
    }

    /* renamed from: l */
    public static String m22033l(long j10, int i10) {
        return i10 == 0 ? "N/A" : String.valueOf((long) (j10 / i10));
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: A */
    public /* synthetic */ void mo12514A(C7597l1 c7597l1) {
        C7612q1.m32997p(this, c7597l1);
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

    /* renamed from: b */
    public String m22034b() {
        C7629w0 m32435Y0 = this.f26581b.m32435Y0();
        C8636d m32434X0 = this.f26581b.m32434X0();
        if (m32435Y0 == null || m32434X0 == null) {
            return "";
        }
        return "\n" + m32435Y0.f37086m + "(id:" + m32435Y0.f37075b + " hz:" + m32435Y0.f37068A + " ch:" + m32435Y0.f37099z + m22031g(m32434X0) + ")";
    }

    @Override // p078e9.InterfaceC4683q
    /* renamed from: c */
    public /* synthetic */ void mo12529c(C4670d0 c4670d0) {
        C7612q1.m33007z(this, c4670d0);
    }

    /* renamed from: d */
    public String m22035d() {
        return m22036k() + m22037n() + m22034b();
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
    public /* synthetic */ void mo12533e0(C0083a1 c0083a1, C9888l c9888l) {
        C7612q1.m33006y(this, c0083a1, c9888l);
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: f */
    public /* synthetic */ void mo12534f(int i10) {
        C7612q1.m32996o(this, i10);
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: g0 */
    public final void mo12535g0(boolean z10, int i10) {
        m22040r();
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: h */
    public /* synthetic */ void mo12536h(boolean z10) {
        C7609p1.m32883d(this, z10);
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: i0 */
    public final void mo12537i0(InterfaceC7606o1.f fVar, InterfaceC7606o1.f fVar2, int i10) {
        m22040r();
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: j */
    public /* synthetic */ void mo12538j(List list) {
        C7609p1.m32896q(this, list);
    }

    /* renamed from: k */
    public String m22036k() {
        int playbackState = this.f26581b.getPlaybackState();
        return String.format("playWhenReady:%s playbackState:%s window:%s", Boolean.valueOf(this.f26581b.mo32480y()), playbackState != 1 ? playbackState != 2 ? playbackState != 3 ? playbackState != 4 ? "unknown" : "ended" : "ready" : "buffering" : "idle", Integer.valueOf(this.f26581b.mo32451i()));
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: m */
    public final void mo12539m(int i10) {
        m22040r();
    }

    @Override // p267p6.InterfaceC7606o1.c
    /* renamed from: m0 */
    public /* synthetic */ void mo12540m0(boolean z10) {
        C7612q1.m32989h(this, z10);
    }

    /* renamed from: n */
    public String m22037n() {
        C7629w0 m32441c1 = this.f26581b.m32441c1();
        C8636d m32439b1 = this.f26581b.m32439b1();
        if (m32441c1 == null || m32439b1 == null) {
            return "";
        }
        return "\n" + m32441c1.f37086m + "(id:" + m32441c1.f37075b + " r:" + m32441c1.f37091r + "x" + m32441c1.f37092s + m22032i(m32441c1.f37095v) + m22031g(m32439b1) + " vfpo: " + m22033l(m32439b1.f40324j, m32439b1.f40325k) + ")";
    }

    /* renamed from: o */
    public final void m22038o() {
        if (this.f26583d) {
            return;
        }
        this.f26583d = true;
        this.f26581b.mo32447g(this);
        m22040r();
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

    /* renamed from: q */
    public final void m22039q() {
        try {
            if (this.f26583d) {
                this.f26583d = false;
                this.f26581b.mo32410A(this);
                this.f26582c.removeCallbacks(this);
            }
        } catch (Exception e10) {
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: r */
    public final void m22040r() {
        try {
            this.f26582c.setText(m22035d());
            this.f26582c.removeCallbacks(this);
            this.f26582c.postDelayed(this, 1000L);
        } catch (Exception e10) {
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        m22040r();
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

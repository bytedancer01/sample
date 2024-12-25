package p270p9;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0439y;
import androidx.fragment.app.ActivityC0416e;
import androidx.fragment.app.Fragment;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ma.AbstractC6070d1;
import ma.C6007a1;
import ma.C6028b1;
import ma.C6049c1;
import ma.C6091e1;
import ma.C6126ff;
import ma.C6237l0;
import ma.C6258m0;
import ma.C6279n0;
import ma.C6321p0;
import ma.C6342q0;
import ma.C6384s0;
import ma.C6405t0;
import ma.C6426u0;
import ma.C6466w0;
import ma.C6486x0;
import ma.C6506y0;
import ma.C6526z0;
import ma.EnumC6057c9;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p200l9.C5794p;
import p216m9.AbstractC5989s;
import p216m9.C5938b;
import p216m9.C5947e;
import p216m9.C5991t;
import p216m9.InterfaceC5993u;
import p230n9.C6698a;
import p230n9.C6701b;
import p230n9.C6721i;
import p230n9.C6723j;
import p304r9.C8015b;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p9/b.class
 */
/* renamed from: p9.b */
/* loaded from: combined.jar:classes2.jar:p9/b.class */
public class C7671b implements C6721i.b, InterfaceC5993u<C5947e> {

    /* renamed from: h */
    public static final C8015b f37406h = new C8015b("UIMediaController");

    /* renamed from: a */
    public final Activity f37407a;

    /* renamed from: b */
    public final C5991t f37408b;

    /* renamed from: c */
    public final Map f37409c = new HashMap();

    /* renamed from: d */
    public final Set f37410d = new HashSet();

    /* renamed from: e */
    public final C7672c f37411e = C7672c.m33606f();

    /* renamed from: f */
    public C6721i.b f37412f;

    /* renamed from: g */
    public C6721i f37413g;

    public C7671b(Activity activity) {
        this.f37407a = activity;
        C5938b m29236g = C5938b.m29236g(activity);
        C6126ff.m29603d(EnumC6057c9.UI_MEDIA_CONTROLLER);
        C5991t m29243c = m29236g != null ? m29236g.m29243c() : null;
        this.f37408b = m29243c;
        if (m29243c != null) {
            m29243c.m29356a(this, C5947e.class);
            m33589j0(m29243c.m29358c());
        }
    }

    /* renamed from: A */
    public void m33554A(View view) {
        C9935o.m41845e("Must be called from the main thread.");
        view.setOnClickListener(new ViewOnClickListenerC7680k(this));
        m33593n0(view, new C6384s0(view));
    }

    /* renamed from: B */
    public void m33555B(View view) {
        C9935o.m41845e("Must be called from the main thread.");
        m33593n0(view, new C6405t0(view));
    }

    /* renamed from: C */
    public void m33556C(View view, long j10) {
        C9935o.m41845e("Must be called from the main thread.");
        view.setOnClickListener(new ViewOnClickListenerC7678i(this, j10));
        m33593n0(view, new C6526z0(view, this.f37411e));
    }

    /* renamed from: D */
    public void m33557D(View view, int i10) {
        C9935o.m41845e("Must be called from the main thread.");
        view.setOnClickListener(new ViewOnClickListenerC7675f(this));
        m33593n0(view, new C6007a1(view, i10));
    }

    /* renamed from: E */
    public void m33558E(View view, int i10) {
        C9935o.m41845e("Must be called from the main thread.");
        view.setOnClickListener(new ViewOnClickListenerC7676g(this));
        m33593n0(view, new C6028b1(view, i10));
    }

    /* renamed from: F */
    public void m33559F(View view, AbstractC7670a abstractC7670a) {
        C9935o.m41845e("Must be called from the main thread.");
        m33593n0(view, abstractC7670a);
    }

    /* renamed from: G */
    public void m33560G(View view, int i10) {
        C9935o.m41845e("Must be called from the main thread.");
        m33593n0(view, new C6091e1(view, i10));
    }

    /* renamed from: H */
    public void m33561H() {
        C9935o.m41845e("Must be called from the main thread.");
        m33588i0();
        this.f37409c.clear();
        C5991t c5991t = this.f37408b;
        if (c5991t != null) {
            c5991t.m29360e(this, C5947e.class);
        }
        this.f37412f = null;
    }

    /* renamed from: I */
    public C6721i m33562I() {
        C9935o.m41845e("Must be called from the main thread.");
        return this.f37413g;
    }

    @EnsuresNonNullIf(expression = {"remoteMediaClient"}, result = true)
    /* renamed from: J */
    public boolean m33563J() {
        C9935o.m41845e("Must be called from the main thread.");
        return this.f37413g != null;
    }

    /* renamed from: K */
    public void m33564K(View view) {
        C6721i m33562I = m33562I();
        if (m33562I != null && m33562I.m31020p() && (this.f37407a instanceof ActivityC0416e)) {
            C6723j m31041N = C6723j.m31041N();
            ActivityC0416e activityC0416e = (ActivityC0416e) this.f37407a;
            AbstractC0439y m2216m = activityC0416e.getSupportFragmentManager().m2216m();
            Fragment m2206i0 = activityC0416e.getSupportFragmentManager().m2206i0("TRACKS_CHOOSER_DIALOG_TAG");
            if (m2206i0 != null) {
                m2216m.mo1970q(m2206i0);
            }
            m31041N.m2023J(m2216m, "TRACKS_CHOOSER_DIALOG_TAG");
        }
    }

    /* renamed from: L */
    public void m33565L(View view, long j10) {
        C6721i m33562I = m33562I();
        if (m33562I == null || !m33562I.m31020p()) {
            return;
        }
        if (!m33562I.m31023q0()) {
            m33562I.m30990Q(m33562I.m31006g() + j10);
            return;
        }
        m33562I.m30990Q(Math.min(m33562I.m31006g() + j10, r0.m33610c() + this.f37411e.m33612e()));
    }

    /* renamed from: M */
    public void m33566M(View view) {
        C6698a m29251P = C5938b.m29235e(this.f37407a).m29241a().m29251P();
        if (m29251P == null || TextUtils.isEmpty(m29251P.m30856P())) {
            return;
        }
        ComponentName componentName = new ComponentName(this.f37407a.getApplicationContext(), m29251P.m30856P());
        Intent intent = new Intent();
        intent.setComponent(componentName);
        this.f37407a.startActivity(intent);
    }

    /* renamed from: N */
    public void m33567N(ImageView imageView) {
        C5947e m29358c = C5938b.m29235e(this.f37407a.getApplicationContext()).m29243c().m29358c();
        if (m29358c == null || !m29358c.m29348c()) {
            return;
        }
        try {
            m29358c.m29293u(!m29358c.m29291s());
        } catch (IOException | IllegalArgumentException e10) {
            f37406h.m34875c("Unable to call CastSession.setMute(boolean).", e10);
        }
    }

    /* renamed from: O */
    public void m33568O(ImageView imageView) {
        C6721i m33562I = m33562I();
        if (m33562I == null || !m33562I.m31020p()) {
            return;
        }
        m33562I.m30995V();
    }

    /* renamed from: P */
    public void m33569P(View view, long j10) {
        C6721i m33562I = m33562I();
        if (m33562I == null || !m33562I.m31020p()) {
            return;
        }
        if (!m33562I.m31023q0()) {
            m33562I.m30990Q(m33562I.m31006g() - j10);
            return;
        }
        m33562I.m30990Q(Math.max(m33562I.m31006g() - j10, r0.m33611d() + this.f37411e.m33612e()));
    }

    @Override // p216m9.InterfaceC5993u
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo14735a(C5947e c5947e, int i10) {
        m33588i0();
    }

    @Override // p216m9.InterfaceC5993u
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo14736b(C5947e c5947e) {
    }

    @Override // p216m9.InterfaceC5993u
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public void mo14740f(C5947e c5947e, int i10) {
        m33588i0();
    }

    @Override // p216m9.InterfaceC5993u
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public void mo14744j(C5947e c5947e, boolean z10) {
        m33589j0(c5947e);
    }

    @Override // p216m9.InterfaceC5993u
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public void mo14746l(C5947e c5947e, String str) {
    }

    @Override // p216m9.InterfaceC5993u
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public void mo14748n(C5947e c5947e, int i10) {
        m33588i0();
    }

    @Override // p216m9.InterfaceC5993u
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo14738d(C5947e c5947e, String str) {
        m33589j0(c5947e);
    }

    @Override // p216m9.InterfaceC5993u
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public void mo14749o(C5947e c5947e) {
    }

    @Override // p216m9.InterfaceC5993u
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void mo14739e(C5947e c5947e, int i10) {
    }

    /* renamed from: Z */
    public void m33579Z(View view) {
        C6721i m33562I = m33562I();
        if (m33562I == null || !m33562I.m31020p()) {
            return;
        }
        m33562I.m30982I(null);
    }

    /* renamed from: a0 */
    public void m33580a0(View view) {
        C6721i m33562I = m33562I();
        if (m33562I == null || !m33562I.m31020p()) {
            return;
        }
        m33562I.m30983J(null);
    }

    /* renamed from: b0 */
    public void m33581b0(C6721i.b bVar) {
        C9935o.m41845e("Must be called from the main thread.");
        this.f37412f = bVar;
    }

    @Override // p230n9.C6721i.b
    /* renamed from: c */
    public void mo23745c() {
        m33594o0();
        C6721i.b bVar = this.f37412f;
        if (bVar != null) {
            bVar.mo23745c();
        }
    }

    /* renamed from: c0 */
    public final C7672c m33582c0() {
        return this.f37411e;
    }

    /* renamed from: d0 */
    public final void m33583d0(ImageView imageView, C6701b c6701b, View view, C6321p0 c6321p0) {
        C9935o.m41845e("Must be called from the main thread.");
        m33593n0(imageView, new C6342q0(imageView, this.f37407a, c6701b, 0, view, c6321p0));
    }

    /* renamed from: e0 */
    public final void m33584e0(CastSeekBar castSeekBar, int i10, boolean z10) {
        m33590k0(i10, z10);
    }

    /* renamed from: f0 */
    public final void m33585f0(CastSeekBar castSeekBar) {
        m33591l0();
    }

    @Override // p230n9.C6721i.b
    /* renamed from: g */
    public void mo23746g() {
        m33594o0();
        C6721i.b bVar = this.f37412f;
        if (bVar != null) {
            bVar.mo23746g();
        }
    }

    /* renamed from: g0 */
    public final void m33586g0(CastSeekBar castSeekBar) {
        m33592m0(castSeekBar.getProgress());
    }

    @Override // p230n9.C6721i.b
    /* renamed from: h */
    public void mo23747h() {
        m33594o0();
        C6721i.b bVar = this.f37412f;
        if (bVar != null) {
            bVar.mo23747h();
        }
    }

    /* renamed from: h0 */
    public final void m33587h0(AbstractC6070d1 abstractC6070d1) {
        this.f37410d.add(abstractC6070d1);
    }

    @Override // p230n9.C6721i.b
    /* renamed from: i */
    public void mo23748i() {
        Iterator it = this.f37409c.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                ((AbstractC7670a) it2.next()).mo29376d();
            }
        }
        C6721i.b bVar = this.f37412f;
        if (bVar != null) {
            bVar.mo23748i();
        }
    }

    /* renamed from: i0 */
    public final void m33588i0() {
        if (m33563J()) {
            this.f37411e.f37414a = null;
            Iterator it = this.f37409c.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((List) it.next()).iterator();
                while (it2.hasNext()) {
                    ((AbstractC7670a) it2.next()).mo29378f();
                }
            }
            C9935o.m41850j(this.f37413g);
            this.f37413g.m30987N(this);
            this.f37413g = null;
        }
    }

    /* renamed from: j0 */
    public final void m33589j0(AbstractC5989s abstractC5989s) {
        if (m33563J() || abstractC5989s == null || !abstractC5989s.m29348c()) {
            return;
        }
        C5947e c5947e = (C5947e) abstractC5989s;
        C6721i m29290r = c5947e.m29290r();
        this.f37413g = m29290r;
        if (m29290r != null) {
            m29290r.m30998b(this);
            C9935o.m41850j(this.f37411e);
            this.f37411e.f37414a = c5947e.m29290r();
            Iterator it = this.f37409c.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((List) it.next()).iterator();
                while (it2.hasNext()) {
                    ((AbstractC7670a) it2.next()).mo29377e(c5947e);
                }
            }
            m33594o0();
        }
    }

    @Override // p230n9.C6721i.b
    /* renamed from: k */
    public void mo23749k() {
        m33594o0();
        C6721i.b bVar = this.f37412f;
        if (bVar != null) {
            bVar.mo23749k();
        }
    }

    /* renamed from: k0 */
    public final void m33590k0(int i10, boolean z10) {
        if (z10) {
            Iterator it = this.f37410d.iterator();
            while (it.hasNext()) {
                ((AbstractC6070d1) it.next()).mo29538h(i10 + this.f37411e.m33612e());
            }
        }
    }

    /* renamed from: l0 */
    public final void m33591l0() {
        Iterator it = this.f37410d.iterator();
        while (it.hasNext()) {
            ((AbstractC6070d1) it.next()).mo29537g(false);
        }
    }

    @Override // p230n9.C6721i.b
    /* renamed from: m */
    public void mo23750m() {
        m33594o0();
        C6721i.b bVar = this.f37412f;
        if (bVar != null) {
            bVar.mo23750m();
        }
    }

    /* renamed from: m0 */
    public final void m33592m0(int i10) {
        boolean z10;
        Iterator it = this.f37410d.iterator();
        while (true) {
            z10 = true;
            if (!it.hasNext()) {
                break;
            } else {
                ((AbstractC6070d1) it.next()).mo29537g(true);
            }
        }
        C6721i m33562I = m33562I();
        if (m33562I == null || !m33562I.m31020p()) {
            return;
        }
        long m33612e = i10 + this.f37411e.m33612e();
        C5794p.a aVar = new C5794p.a();
        aVar.m28301d(m33612e);
        if (!m33562I.m31024r() || !this.f37411e.m33620n(m33612e)) {
            z10 = false;
        }
        aVar.m28300c(z10);
        m33562I.m30992S(aVar.m28298a());
    }

    /* renamed from: n0 */
    public final void m33593n0(View view, AbstractC7670a abstractC7670a) {
        if (this.f37408b == null) {
            return;
        }
        List list = (List) this.f37409c.get(view);
        List list2 = list;
        if (list == null) {
            list2 = new ArrayList();
            this.f37409c.put(view, list2);
        }
        list2.add(abstractC7670a);
        if (m33563J()) {
            abstractC7670a.mo29377e((C5947e) C9935o.m41850j(this.f37408b.m29358c()));
            m33594o0();
        }
    }

    /* renamed from: o0 */
    public final void m33594o0() {
        Iterator it = this.f37409c.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                ((AbstractC7670a) it2.next()).mo29375c();
            }
        }
    }

    /* renamed from: p */
    public void m33595p(ImageView imageView, C6701b c6701b, int i10) {
        C9935o.m41845e("Must be called from the main thread.");
        m33593n0(imageView, new C6342q0(imageView, this.f37407a, c6701b, i10, null, null));
    }

    /* renamed from: q */
    public void m33596q(ImageView imageView) {
        C9935o.m41845e("Must be called from the main thread.");
        imageView.setOnClickListener(new ViewOnClickListenerC7673d(this));
        m33593n0(imageView, new C6466w0(imageView, this.f37407a));
    }

    /* renamed from: r */
    public void m33597r(ImageView imageView, Drawable drawable, Drawable drawable2, Drawable drawable3, View view, boolean z10) {
        C9935o.m41845e("Must be called from the main thread.");
        C6126ff.m29603d(EnumC6057c9.PAUSE_CONTROLLER);
        imageView.setOnClickListener(new ViewOnClickListenerC7674e(this));
        m33593n0(imageView, new C6486x0(imageView, this.f37407a, drawable, drawable2, drawable3, view, z10));
    }

    /* renamed from: s */
    public void m33598s(ProgressBar progressBar) {
        m33599t(progressBar, 1000L);
    }

    /* renamed from: t */
    public void m33599t(ProgressBar progressBar, long j10) {
        C9935o.m41845e("Must be called from the main thread.");
        m33593n0(progressBar, new C6506y0(progressBar, j10));
    }

    /* renamed from: u */
    public void m33600u(CastSeekBar castSeekBar, long j10) {
        C9935o.m41845e("Must be called from the main thread.");
        C6126ff.m29603d(EnumC6057c9.SEEK_CONTROLLER);
        castSeekBar.f14731g = new C7679j(this);
        m33593n0(castSeekBar, new C6237l0(castSeekBar, j10, this.f37411e));
    }

    /* renamed from: v */
    public void m33601v(TextView textView, String str) {
        C9935o.m41845e("Must be called from the main thread.");
        m33602w(textView, Collections.singletonList(str));
    }

    /* renamed from: w */
    public void m33602w(TextView textView, List<String> list) {
        C9935o.m41845e("Must be called from the main thread.");
        m33593n0(textView, new C6426u0(textView, list));
    }

    /* renamed from: x */
    public void m33603x(TextView textView) {
        C9935o.m41845e("Must be called from the main thread.");
        m33593n0(textView, new C6049c1(textView));
    }

    /* renamed from: y */
    public void m33604y(View view) {
        C9935o.m41845e("Must be called from the main thread.");
        view.setOnClickListener(new ViewOnClickListenerC7681l(this));
        m33593n0(view, new C6258m0(view, this.f37407a));
    }

    /* renamed from: z */
    public void m33605z(View view, long j10) {
        C9935o.m41845e("Must be called from the main thread.");
        view.setOnClickListener(new ViewOnClickListenerC7677h(this, j10));
        m33593n0(view, new C6279n0(view, this.f37411e));
    }
}

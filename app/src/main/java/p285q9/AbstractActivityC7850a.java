package p285q9;

import android.annotation.TargetApi;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import java.util.Timer;
import ma.AbstractC6070d1;
import ma.C6112f1;
import ma.C6126ff;
import ma.C6133g1;
import ma.C6154h1;
import ma.C6175i1;
import ma.EnumC6057c9;
import p029c.C0920a;
import p049d.AbstractC4275a;
import p060da.C4414m;
import p200l9.C5742a;
import p200l9.C5758e;
import p200l9.C5782l;
import p200l9.C5797q;
import p216m9.C5938b;
import p216m9.C5947e;
import p216m9.C5965k;
import p216m9.C5971m;
import p216m9.C5974n;
import p216m9.C5977o;
import p216m9.C5980p;
import p216m9.C5983q;
import p216m9.C5986r;
import p216m9.C5991t;
import p216m9.InterfaceC5993u;
import p230n9.C6701b;
import p230n9.C6721i;
import p244o9.C6932b;
import p244o9.C6953w;
import p270p9.C7671b;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:q9/a.class
 */
/* renamed from: q9.a */
/* loaded from: combined.jar:classes2.jar:q9/a.class */
public abstract class AbstractActivityC7850a extends ActivityC0243b {

    /* renamed from: A */
    public ImageView f37875A;

    /* renamed from: B */
    public ImageView f37876B;

    /* renamed from: C */
    public int[] f37877C;

    /* renamed from: E */
    public View f37879E;

    /* renamed from: F */
    public View f37880F;

    /* renamed from: G */
    public ImageView f37881G;

    /* renamed from: H */
    public TextView f37882H;

    /* renamed from: I */
    public TextView f37883I;

    /* renamed from: J */
    public TextView f37884J;

    /* renamed from: K */
    public TextView f37885K;

    /* renamed from: L */
    public C6932b f37886L;

    /* renamed from: M */
    public C7671b f37887M;

    /* renamed from: N */
    public C5991t f37888N;

    /* renamed from: O */
    public C5758e.d f37889O;

    /* renamed from: P */
    public boolean f37890P;

    /* renamed from: Q */
    public boolean f37891Q;

    /* renamed from: R */
    public Timer f37892R;

    /* renamed from: S */
    public String f37893S;

    /* renamed from: f */
    public int f37896f;

    /* renamed from: g */
    public int f37897g;

    /* renamed from: h */
    public int f37898h;

    /* renamed from: i */
    public int f37899i;

    /* renamed from: j */
    public int f37900j;

    /* renamed from: k */
    public int f37901k;

    /* renamed from: l */
    public int f37902l;

    /* renamed from: m */
    public int f37903m;

    /* renamed from: n */
    public int f37904n;

    /* renamed from: o */
    public int f37905o;

    /* renamed from: p */
    public int f37906p;

    /* renamed from: q */
    public int f37907q;

    /* renamed from: r */
    public int f37908r;

    /* renamed from: s */
    public int f37909s;

    /* renamed from: t */
    public int f37910t;

    /* renamed from: u */
    public int f37911u;

    /* renamed from: v */
    public int f37912v;

    /* renamed from: w */
    public int f37913w;

    /* renamed from: x */
    public TextView f37914x;

    /* renamed from: y */
    public SeekBar f37915y;

    /* renamed from: z */
    public CastSeekBar f37916z;

    /* renamed from: d */
    public final InterfaceC5993u f37894d = new C7868s(this, null);

    /* renamed from: e */
    public final C6721i.b f37895e = new C7866q(this, null);

    /* renamed from: D */
    public final ImageView[] f37878D = new ImageView[4];

    /* renamed from: A0 */
    public final C6721i m34131A0() {
        C5947e m29358c = this.f37888N.m29358c();
        if (m29358c == null || !m29358c.m29348c()) {
            return null;
        }
        return m29358c.m29290r();
    }

    /* renamed from: B0 */
    public final void m34132B0(String str) {
        this.f37886L.m31903d(Uri.parse(str));
        this.f37880F.setVisibility(8);
    }

    /* renamed from: C0 */
    public final void m34133C0(View view, int i10, int i11, C7671b c7671b) {
        ImageView imageView = (ImageView) view.findViewById(i10);
        if (i11 == C5974n.f33530s) {
            imageView.setVisibility(4);
            return;
        }
        if (i11 == C5974n.f33533v) {
            imageView.setBackgroundResource(this.f37896f);
            Drawable m34139b = C7869t.m34139b(this, this.f37910t, this.f37898h);
            Drawable m34139b2 = C7869t.m34139b(this, this.f37910t, this.f37897g);
            Drawable m34139b3 = C7869t.m34139b(this, this.f37910t, this.f37899i);
            imageView.setImageDrawable(m34139b2);
            c7671b.m33597r(imageView, m34139b2, m34139b, m34139b3, null, false);
            return;
        }
        if (i11 == C5974n.f33536y) {
            imageView.setBackgroundResource(this.f37896f);
            imageView.setImageDrawable(C7869t.m34139b(this, this.f37910t, this.f37900j));
            imageView.setContentDescription(getResources().getString(C5980p.f33568t));
            c7671b.m33558E(imageView, 0);
            return;
        }
        if (i11 == C5974n.f33535x) {
            imageView.setBackgroundResource(this.f37896f);
            imageView.setImageDrawable(C7869t.m34139b(this, this.f37910t, this.f37901k));
            imageView.setContentDescription(getResources().getString(C5980p.f33567s));
            c7671b.m33557D(imageView, 0);
            return;
        }
        if (i11 == C5974n.f33534w) {
            imageView.setBackgroundResource(this.f37896f);
            imageView.setImageDrawable(C7869t.m34139b(this, this.f37910t, this.f37902l));
            imageView.setContentDescription(getResources().getString(C5980p.f33566r));
            c7671b.m33556C(imageView, 30000L);
            return;
        }
        if (i11 == C5974n.f33531t) {
            imageView.setBackgroundResource(this.f37896f);
            imageView.setImageDrawable(C7869t.m34139b(this, this.f37910t, this.f37903m));
            imageView.setContentDescription(getResources().getString(C5980p.f33559k));
            c7671b.m33605z(imageView, 30000L);
            return;
        }
        if (i11 == C5974n.f33532u) {
            imageView.setBackgroundResource(this.f37896f);
            imageView.setImageDrawable(C7869t.m34139b(this, this.f37910t, this.f37904n));
            c7671b.m33596q(imageView);
        } else if (i11 == C5974n.f33528q) {
            imageView.setBackgroundResource(this.f37896f);
            imageView.setImageDrawable(C7869t.m34139b(this, this.f37910t, this.f37905o));
            c7671b.m33604y(imageView);
        }
    }

    /* renamed from: D0 */
    public final void m34134D0(C6721i c6721i) {
        C5797q m31012l;
        if (this.f37890P || (m31012l = c6721i.m31012l()) == null || c6721i.m31022q()) {
            return;
        }
        this.f37884J.setVisibility(8);
        this.f37885K.setVisibility(8);
        C5742a m28306R = m31012l.m28306R();
        if (m28306R == null || m28306R.m28142Z() == -1) {
            return;
        }
        if (!this.f37891Q) {
            C7861l c7861l = new C7861l(this, c6721i);
            Timer timer = new Timer();
            this.f37892R = timer;
            timer.scheduleAtFixedRate(c7861l, 0L, 500L);
            this.f37891Q = true;
        }
        if (m28306R.m28142Z() - c6721i.m31000d() > 0.0f) {
            this.f37885K.setVisibility(0);
            this.f37885K.setText(getResources().getString(C5980p.f33556h, Integer.valueOf((int) Math.ceil(r0 / 1000.0f))));
            this.f37884J.setClickable(false);
        } else {
            if (this.f37891Q) {
                this.f37892R.cancel();
                this.f37891Q = false;
            }
            this.f37884J.setVisibility(0);
            this.f37884J.setClickable(true);
        }
    }

    /* renamed from: E0 */
    public final void m34135E0() {
        CastDevice m29289q;
        C5947e m29358c = this.f37888N.m29358c();
        if (m29358c != null && (m29289q = m29358c.m29289q()) != null) {
            String m13041R = m29289q.m13041R();
            if (!TextUtils.isEmpty(m13041R)) {
                this.f37914x.setText(getResources().getString(C5980p.f33550b, m13041R));
                return;
            }
        }
        this.f37914x.setText("");
    }

    /* renamed from: F0 */
    public final void m34136F0() {
        MediaInfo m31009j;
        C5782l m13065Y;
        AbstractC4275a m868f0;
        C6721i m34131A0 = m34131A0();
        if (m34131A0 == null || !m34131A0.m31020p() || (m31009j = m34131A0.m31009j()) == null || (m13065Y = m31009j.m13065Y()) == null || (m868f0 = m868f0()) == null) {
            return;
        }
        m868f0.mo21525v(m13065Y.m28246S("com.google.android.gms.cast.metadata.TITLE"));
        String m31944e = C6953w.m31944e(m13065Y);
        if (m31944e != null) {
            m868f0.mo21524u(m31944e);
        }
    }

    @TargetApi(23)
    /* renamed from: G0 */
    public final void m34137G0() {
        C5797q m31012l;
        String str;
        Drawable drawable;
        Bitmap bitmap;
        Bitmap m34138a;
        C6721i m34131A0 = m34131A0();
        if (m34131A0 == null || (m31012l = m34131A0.m31012l()) == null) {
            return;
        }
        String str2 = null;
        if (!m31012l.m28331q0()) {
            this.f37885K.setVisibility(8);
            this.f37884J.setVisibility(8);
            this.f37879E.setVisibility(8);
            this.f37876B.setVisibility(8);
            this.f37876B.setImageBitmap(null);
            return;
        }
        if (this.f37876B.getVisibility() == 8 && (drawable = this.f37875A.getDrawable()) != null && (drawable instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null && (m34138a = C7869t.m34138a(this, bitmap, 0.25f, 7.5f)) != null) {
            this.f37876B.setImageBitmap(m34138a);
            this.f37876B.setVisibility(0);
        }
        C5742a m28306R = m31012l.m28306R();
        if (m28306R != null) {
            str = m28306R.m28140X();
            str2 = m28306R.m28138V();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            m34132B0(str2);
        } else if (TextUtils.isEmpty(this.f37893S)) {
            this.f37882H.setVisibility(0);
            this.f37880F.setVisibility(0);
            this.f37881G.setVisibility(8);
        } else {
            m34132B0(this.f37893S);
        }
        TextView textView = this.f37883I;
        String str3 = str;
        if (TextUtils.isEmpty(str)) {
            str3 = getResources().getString(C5980p.f33549a);
        }
        textView.setText(str3);
        if (C4414m.m22456g()) {
            this.f37883I.setTextAppearance(this.f37911u);
        } else {
            this.f37883I.setTextAppearance(this, this.f37911u);
        }
        this.f37879E.setVisibility(0);
        m34134D0(m34131A0);
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C5991t m29243c = C5938b.m29235e(this).m29243c();
        this.f37888N = m29243c;
        if (m29243c.m29358c() == null) {
            finish();
        }
        C7671b c7671b = new C7671b(this);
        this.f37887M = c7671b;
        c7671b.m33581b0(this.f37895e);
        setContentView(C5977o.f33539b);
        TypedArray obtainStyledAttributes = obtainStyledAttributes(new int[]{C0920a.f6100O});
        this.f37896f = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = obtainStyledAttributes(null, C5986r.f33599b, C5965k.f33453a, C5983q.f33575a);
        this.f37910t = obtainStyledAttributes2.getResourceId(C5986r.f33607j, 0);
        this.f37897g = obtainStyledAttributes2.getResourceId(C5986r.f33616s, 0);
        this.f37898h = obtainStyledAttributes2.getResourceId(C5986r.f33615r, 0);
        this.f37899i = obtainStyledAttributes2.getResourceId(C5986r.f33577A, 0);
        this.f37900j = obtainStyledAttributes2.getResourceId(C5986r.f33623z, 0);
        this.f37901k = obtainStyledAttributes2.getResourceId(C5986r.f33622y, 0);
        this.f37902l = obtainStyledAttributes2.getResourceId(C5986r.f33617t, 0);
        this.f37903m = obtainStyledAttributes2.getResourceId(C5986r.f33612o, 0);
        this.f37904n = obtainStyledAttributes2.getResourceId(C5986r.f33614q, 0);
        this.f37905o = obtainStyledAttributes2.getResourceId(C5986r.f33608k, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(C5986r.f33609l, 0);
        if (resourceId != 0) {
            TypedArray obtainTypedArray = getResources().obtainTypedArray(resourceId);
            C9935o.m41841a(obtainTypedArray.length() == 4);
            this.f37877C = new int[obtainTypedArray.length()];
            for (int i10 = 0; i10 < obtainTypedArray.length(); i10++) {
                this.f37877C[i10] = obtainTypedArray.getResourceId(i10, 0);
            }
            obtainTypedArray.recycle();
        } else {
            int i11 = C5974n.f33530s;
            this.f37877C = new int[]{i11, i11, i11, i11};
        }
        this.f37909s = obtainStyledAttributes2.getColor(C5986r.f33611n, 0);
        this.f37906p = getResources().getColor(obtainStyledAttributes2.getResourceId(C5986r.f33604g, 0));
        this.f37907q = getResources().getColor(obtainStyledAttributes2.getResourceId(C5986r.f33603f, 0));
        this.f37908r = getResources().getColor(obtainStyledAttributes2.getResourceId(C5986r.f33606i, 0));
        this.f37911u = obtainStyledAttributes2.getResourceId(C5986r.f33605h, 0);
        this.f37912v = obtainStyledAttributes2.getResourceId(C5986r.f33601d, 0);
        this.f37913w = obtainStyledAttributes2.getResourceId(C5986r.f33602e, 0);
        int resourceId2 = obtainStyledAttributes2.getResourceId(C5986r.f33610m, 0);
        if (resourceId2 != 0) {
            this.f37893S = getApplicationContext().getResources().getString(resourceId2);
        }
        obtainStyledAttributes2.recycle();
        View findViewById = findViewById(C5974n.f33492M);
        C7671b c7671b2 = this.f37887M;
        this.f37875A = (ImageView) findViewById.findViewById(C5974n.f33520i);
        this.f37876B = (ImageView) findViewById.findViewById(C5974n.f33522k);
        View findViewById2 = findViewById.findViewById(C5974n.f33521j);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        c7671b2.m33583d0(this.f37875A, new C6701b(4, displayMetrics.widthPixels, displayMetrics.heightPixels), findViewById2, new C7864o(this, null));
        this.f37914x = (TextView) findViewById.findViewById(C5974n.f33503X);
        ProgressBar progressBar = (ProgressBar) findViewById.findViewById(C5974n.f33498S);
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        int i12 = this.f37909s;
        if (i12 != 0) {
            indeterminateDrawable.setColorFilter(i12, PorterDuff.Mode.SRC_IN);
        }
        c7671b2.m33555B(progressBar);
        TextView textView = (TextView) findViewById.findViewById(C5974n.f33502W);
        TextView textView2 = (TextView) findViewById.findViewById(C5974n.f33491L);
        this.f37915y = (SeekBar) findViewById.findViewById(C5974n.f33501V);
        CastSeekBar castSeekBar = (CastSeekBar) findViewById.findViewById(C5974n.f33488I);
        this.f37916z = castSeekBar;
        c7671b2.m33600u(castSeekBar, 1000L);
        c7671b2.m33559F(textView, new C6154h1(textView, c7671b2.m33582c0()));
        c7671b2.m33559F(textView2, new C6112f1(textView2, c7671b2.m33582c0()));
        View findViewById3 = findViewById.findViewById(C5974n.f33497R);
        c7671b2.m33559F(findViewById3, new C6133g1(findViewById3, c7671b2.m33582c0()));
        RelativeLayout relativeLayout = (RelativeLayout) findViewById.findViewById(C5974n.f33517f0);
        AbstractC6070d1 c6175i1 = new C6175i1(relativeLayout, this.f37916z, c7671b2.m33582c0());
        c7671b2.m33559F(relativeLayout, c6175i1);
        c7671b2.m33587h0(c6175i1);
        ImageView[] imageViewArr = this.f37878D;
        int i13 = C5974n.f33523l;
        imageViewArr[0] = (ImageView) findViewById.findViewById(i13);
        ImageView[] imageViewArr2 = this.f37878D;
        int i14 = C5974n.f33524m;
        imageViewArr2[1] = (ImageView) findViewById.findViewById(i14);
        ImageView[] imageViewArr3 = this.f37878D;
        int i15 = C5974n.f33525n;
        imageViewArr3[2] = (ImageView) findViewById.findViewById(i15);
        ImageView[] imageViewArr4 = this.f37878D;
        int i16 = C5974n.f33526o;
        imageViewArr4[3] = (ImageView) findViewById.findViewById(i16);
        m34133C0(findViewById, i13, this.f37877C[0], c7671b2);
        m34133C0(findViewById, i14, this.f37877C[1], c7671b2);
        m34133C0(findViewById, C5974n.f33527p, C5974n.f33533v, c7671b2);
        m34133C0(findViewById, i15, this.f37877C[2], c7671b2);
        m34133C0(findViewById, i16, this.f37877C[3], c7671b2);
        View findViewById4 = findViewById(C5974n.f33508b);
        this.f37879E = findViewById4;
        this.f37881G = (ImageView) findViewById4.findViewById(C5974n.f33510c);
        this.f37880F = this.f37879E.findViewById(C5974n.f33506a);
        TextView textView3 = (TextView) this.f37879E.findViewById(C5974n.f33514e);
        this.f37883I = textView3;
        textView3.setTextColor(this.f37908r);
        this.f37883I.setBackgroundColor(this.f37906p);
        this.f37882H = (TextView) this.f37879E.findViewById(C5974n.f33512d);
        this.f37885K = (TextView) findViewById(C5974n.f33518g);
        TextView textView4 = (TextView) findViewById(C5974n.f33516f);
        this.f37884J = textView4;
        textView4.setOnClickListener(new ViewOnClickListenerC7859j(this));
        m878n0((Toolbar) findViewById(C5974n.f33513d0));
        AbstractC4275a m868f0 = m868f0();
        if (m868f0 != null) {
            m868f0.mo21521r(true);
            m868f0.mo21522s(C5971m.f33479o);
        }
        m34135E0();
        m34136F0();
        if (this.f37882H != null && this.f37913w != 0) {
            if (C4414m.m22456g()) {
                this.f37882H.setTextAppearance(this.f37912v);
            } else {
                this.f37882H.setTextAppearance(getApplicationContext(), this.f37912v);
            }
            this.f37882H.setTextColor(this.f37907q);
            this.f37882H.setText(this.f37913w);
        }
        C6932b c6932b = new C6932b(getApplicationContext(), new C6701b(-1, this.f37881G.getWidth(), this.f37881G.getHeight()));
        this.f37886L = c6932b;
        c6932b.m31902c(new C7858i(this));
        C6126ff.m29603d(EnumC6057c9.CAF_EXPANDED_CONTROLLER);
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onDestroy() {
        this.f37886L.m31900a();
        C7671b c7671b = this.f37887M;
        if (c7671b != null) {
            c7671b.m33581b0(null);
            this.f37887M.m33561H();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        finish();
        return true;
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        C5991t c5991t = this.f37888N;
        if (c5991t == null) {
            return;
        }
        C5947e m29358c = c5991t.m29358c();
        C5758e.d dVar = this.f37889O;
        if (dVar != null && m29358c != null) {
            m29358c.m29292t(dVar);
            this.f37889O = null;
        }
        this.f37888N.m29360e(this.f37894d, C5947e.class);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        C5991t c5991t = this.f37888N;
        if (c5991t == null) {
            return;
        }
        c5991t.m29356a(this.f37894d, C5947e.class);
        C5947e m29358c = this.f37888N.m29358c();
        if (m29358c == null || !(m29358c.m29348c() || m29358c.m29349d())) {
            finish();
        } else {
            C7862m c7862m = new C7862m(this);
            this.f37889O = c7862m;
            m29358c.m29288p(c7862m);
        }
        C6721i m34131A0 = m34131A0();
        boolean z10 = true;
        if (m34131A0 != null) {
            z10 = !m34131A0.m31020p();
        }
        this.f37890P = z10;
        m34135E0();
        m34137G0();
        super.onResume();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility() ^ 2;
            int i10 = systemUiVisibility;
            if (C4414m.m22451b()) {
                i10 = systemUiVisibility ^ 4;
            }
            int i11 = i10;
            if (C4414m.m22453d()) {
                i11 = i10 ^ 4096;
            }
            getWindow().getDecorView().setSystemUiVisibility(i11);
            setImmersive(true);
        }
    }
}

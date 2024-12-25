package p251og;

import android.R;
import android.animation.Animator;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.pierfrancescosoffritti.youtubeplayer.player.YouTubePlayerView;
import mg.InterfaceC6600c;
import mg.InterfaceC6602e;
import mg.InterfaceC6604g;
import p050d0.C4290b;
import p204lg.C5875b;
import p204lg.C5876c;
import p204lg.C5877d;
import p291qg.C7921a;
import p310rg.C8473c;
import pg.InterfaceC7713b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:og/a.class
 */
/* renamed from: og.a */
/* loaded from: combined.jar:classes2.jar:og/a.class */
public class ViewOnClickListenerC6972a implements InterfaceC6973b, InterfaceC6604g, InterfaceC6602e, View.OnClickListener, SeekBar.OnSeekBarChangeListener {

    /* renamed from: b */
    public final YouTubePlayerView f35957b;

    /* renamed from: c */
    public final InterfaceC6600c f35958c;

    /* renamed from: d */
    public InterfaceC7713b f35959d;

    /* renamed from: e */
    public View f35960e;

    /* renamed from: f */
    public View f35961f;

    /* renamed from: g */
    public LinearLayout f35962g;

    /* renamed from: h */
    public TextView f35963h;

    /* renamed from: i */
    public TextView f35964i;

    /* renamed from: j */
    public TextView f35965j;

    /* renamed from: k */
    public TextView f35966k;

    /* renamed from: l */
    public ProgressBar f35967l;

    /* renamed from: m */
    public ImageView f35968m;

    /* renamed from: n */
    public ImageView f35969n;

    /* renamed from: o */
    public ImageView f35970o;

    /* renamed from: p */
    public ImageView f35971p;

    /* renamed from: q */
    public ImageView f35972q;

    /* renamed from: r */
    public ImageView f35973r;

    /* renamed from: s */
    public SeekBar f35974s;

    /* renamed from: t */
    public View.OnClickListener f35975t;

    /* renamed from: u */
    public View.OnClickListener f35976u;

    /* renamed from: v */
    public boolean f35977v = false;

    /* renamed from: w */
    public boolean f35978w = true;

    /* renamed from: x */
    public boolean f35979x = false;

    /* renamed from: y */
    public boolean f35980y = true;

    /* renamed from: z */
    public boolean f35981z = true;

    /* renamed from: A */
    public boolean f35952A = true;

    /* renamed from: B */
    public final Handler f35953B = new Handler(Looper.getMainLooper());

    /* renamed from: C */
    public final Runnable f35954C = new a(this);

    /* renamed from: D */
    public boolean f35955D = false;

    /* renamed from: E */
    public int f35956E = -1;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:og/a$a.class
     */
    /* renamed from: og.a$a */
    /* loaded from: combined.jar:classes2.jar:og/a$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final ViewOnClickListenerC6972a f35982b;

        public a(ViewOnClickListenerC6972a viewOnClickListenerC6972a) {
            this.f35982b = viewOnClickListenerC6972a;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35982b.m31994t(0.0f);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:og/a$b.class
     */
    /* renamed from: og.a$b */
    /* loaded from: combined.jar:classes2.jar:og/a$b.class */
    public class b implements Animator.AnimatorListener {

        /* renamed from: b */
        public final float f35983b;

        /* renamed from: c */
        public final ViewOnClickListenerC6972a f35984c;

        public b(ViewOnClickListenerC6972a viewOnClickListenerC6972a, float f10) {
            this.f35984c = viewOnClickListenerC6972a;
            this.f35983b = f10;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f35983b == 0.0f) {
                this.f35984c.f35961f.setVisibility(8);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f35983b == 1.0f) {
                this.f35984c.f35961f.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:og/a$c.class
     */
    /* renamed from: og.a$c */
    /* loaded from: combined.jar:classes2.jar:og/a$c.class */
    public class c implements View.OnClickListener {

        /* renamed from: b */
        public final String f35985b;

        /* renamed from: c */
        public final ViewOnClickListenerC6972a f35986c;

        public c(ViewOnClickListenerC6972a viewOnClickListenerC6972a, String str) {
            this.f35986c = viewOnClickListenerC6972a;
            this.f35985b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f35986c.f35961f.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.youtube.com/watch?v=" + this.f35985b + "#t=" + this.f35986c.f35974s.getProgress())));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:og/a$d.class
     */
    /* renamed from: og.a$d */
    /* loaded from: combined.jar:classes2.jar:og/a$d.class */
    public class d implements Runnable {

        /* renamed from: b */
        public final ViewOnClickListenerC6972a f35987b;

        public d(ViewOnClickListenerC6972a viewOnClickListenerC6972a) {
            this.f35987b = viewOnClickListenerC6972a;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35987b.f35965j.setText("");
        }
    }

    public ViewOnClickListenerC6972a(YouTubePlayerView youTubePlayerView, InterfaceC6600c interfaceC6600c) {
        this.f35957b = youTubePlayerView;
        this.f35958c = interfaceC6600c;
        m31995u(View.inflate(youTubePlayerView.getContext(), C5877d.f32954a, youTubePlayerView));
        this.f35959d = new C7921a(youTubePlayerView.getContext());
    }

    /* renamed from: A */
    public final void m31987A() {
        m31994t(this.f35978w ? 0.0f : 1.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
    
        if (r5 != 2) goto L14;
     */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m31988B(int r5) {
        /*
            r4 = this;
            r0 = r5
            r1 = -1
            if (r0 == r1) goto L26
            r0 = r5
            if (r0 == 0) goto L1e
            r0 = r5
            r1 = 1
            if (r0 == r1) goto L16
            r0 = r5
            r1 = 2
            if (r0 == r1) goto L1e
            goto L2a
        L16:
            r0 = r4
            r1 = 1
            r0.f35977v = r1
            goto L2a
        L1e:
            r0 = r4
            r1 = 0
            r0.f35977v = r1
            goto L2a
        L26:
            r0 = r4
            r0.m31999y()
        L2a:
            r0 = r4
            r1 = r4
            boolean r1 = r1.f35977v
            r2 = 1
            r1 = r1 ^ r2
            r0.m31989C(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p251og.ViewOnClickListenerC6972a.m31988B(int):void");
    }

    /* renamed from: C */
    public final void m31989C(boolean z10) {
        this.f35969n.setImageResource(z10 ? C5875b.f32935c : C5875b.f32936d);
    }

    @Override // p251og.InterfaceC6973b
    /* renamed from: a */
    public void mo31990a(boolean z10) {
        this.f35971p.setVisibility(z10 ? 0 : 8);
    }

    @Override // p251og.InterfaceC6973b
    /* renamed from: b */
    public void mo31991b(boolean z10) {
        this.f35970o.setVisibility(z10 ? 0 : 8);
    }

    @Override // mg.InterfaceC6604g
    /* renamed from: c */
    public void mo30475c(String str) {
        this.f35970o.setOnClickListener(new c(this, str));
    }

    @Override // mg.InterfaceC6602e
    /* renamed from: d */
    public void mo30496d() {
        this.f35971p.setImageResource(C5875b.f32933a);
    }

    @Override // mg.InterfaceC6604g
    /* renamed from: e */
    public void mo30476e(float f10) {
        this.f35965j.setText(C8473c.m36396a(f10));
        this.f35974s.setMax((int) f10);
    }

    @Override // mg.InterfaceC6604g
    /* renamed from: f */
    public void mo30477f() {
    }

    @Override // mg.InterfaceC6602e
    /* renamed from: g */
    public void mo30497g() {
        this.f35971p.setImageResource(C5875b.f32934b);
    }

    @Override // mg.InterfaceC6604g
    /* renamed from: h */
    public void mo17044h(int i10) {
        this.f35956E = -1;
        m31988B(i10);
        boolean z10 = true;
        if (i10 == 1 || i10 == 2 || i10 == 5) {
            this.f35960e.setBackgroundColor(C4290b.m21724c(this.f35957b.getContext(), R.color.transparent));
            this.f35967l.setVisibility(8);
            if (this.f35981z) {
                this.f35969n.setVisibility(0);
            }
            this.f35979x = true;
            if (i10 != 1) {
                z10 = false;
            }
            m31989C(z10);
            if (z10) {
                m32000z();
                return;
            } else {
                this.f35953B.removeCallbacks(this.f35954C);
                return;
            }
        }
        m31989C(false);
        m31994t(1.0f);
        if (i10 == 3) {
            this.f35960e.setBackgroundColor(C4290b.m21724c(this.f35957b.getContext(), R.color.transparent));
            if (this.f35981z) {
                this.f35969n.setVisibility(4);
            }
            this.f35972q.setVisibility(8);
            this.f35973r.setVisibility(8);
            this.f35979x = false;
        }
        if (i10 == -1) {
            this.f35979x = false;
            this.f35967l.setVisibility(8);
            if (this.f35981z) {
                this.f35969n.setVisibility(0);
            }
        }
    }

    @Override // mg.InterfaceC6604g
    /* renamed from: i */
    public void mo30478i(String str) {
    }

    @Override // mg.InterfaceC6604g
    /* renamed from: j */
    public void mo30479j(String str) {
    }

    @Override // mg.InterfaceC6604g
    /* renamed from: k */
    public void mo30480k(float f10) {
        if (!this.f35952A) {
            this.f35974s.setSecondaryProgress(0);
        } else {
            this.f35974s.setSecondaryProgress((int) (f10 * r0.getMax()));
        }
    }

    @Override // mg.InterfaceC6604g
    /* renamed from: l */
    public void mo17045l() {
    }

    @Override // p251og.InterfaceC6973b
    /* renamed from: m */
    public void mo31992m(boolean z10) {
        this.f35963h.setVisibility(z10 ? 0 : 8);
    }

    @Override // mg.InterfaceC6604g
    /* renamed from: n */
    public void mo30481n(float f10) {
        if (this.f35955D) {
            return;
        }
        if (this.f35956E <= 0 || C8473c.m36396a(f10).equals(C8473c.m36396a(this.f35956E))) {
            this.f35956E = -1;
            this.f35974s.setProgress((int) f10);
        }
    }

    @Override // p251og.InterfaceC6973b
    /* renamed from: o */
    public void mo31993o(boolean z10) {
        this.f35969n.setVisibility(z10 ? 0 : 8);
        this.f35981z = z10;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f35960e) {
            m31987A();
            return;
        }
        if (view == this.f35969n) {
            m31998x();
        } else if (view == this.f35971p) {
            m31996v();
        } else if (view == this.f35968m) {
            m31997w();
        }
    }

    @Override // mg.InterfaceC6604g
    public void onError(int i10) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
        this.f35964i.setText(C8473c.m36396a(i10));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        this.f35955D = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        if (this.f35977v) {
            this.f35956E = seekBar.getProgress();
        }
        this.f35958c.mo30487f(seekBar.getProgress());
        this.f35955D = false;
    }

    /* renamed from: t */
    public final void m31994t(float f10) {
        if (this.f35979x && this.f35980y) {
            this.f35978w = f10 != 0.0f;
            if (f10 == 1.0f && this.f35977v) {
                m32000z();
            } else {
                this.f35953B.removeCallbacks(this.f35954C);
            }
            this.f35961f.animate().alpha(f10).setDuration(300L).setListener(new b(this, f10)).start();
        }
    }

    /* renamed from: u */
    public final void m31995u(View view) {
        this.f35960e = view.findViewById(C5876c.f32944h);
        this.f35961f = view.findViewById(C5876c.f32937a);
        this.f35962g = (LinearLayout) view.findViewById(C5876c.f32940d);
        this.f35963h = (TextView) view.findViewById(C5876c.f32952p);
        this.f35964i = (TextView) view.findViewById(C5876c.f32950n);
        this.f35965j = (TextView) view.findViewById(C5876c.f32951o);
        this.f35966k = (TextView) view.findViewById(C5876c.f32942f);
        this.f35967l = (ProgressBar) view.findViewById(C5876c.f32946j);
        this.f35968m = (ImageView) view.findViewById(C5876c.f32943g);
        this.f35969n = (ImageView) view.findViewById(C5876c.f32945i);
        this.f35970o = (ImageView) view.findViewById(C5876c.f32953q);
        this.f35971p = (ImageView) view.findViewById(C5876c.f32941e);
        this.f35972q = (ImageView) view.findViewById(C5876c.f32938b);
        this.f35973r = (ImageView) view.findViewById(C5876c.f32939c);
        SeekBar seekBar = (SeekBar) view.findViewById(C5876c.f32948l);
        this.f35974s = seekBar;
        seekBar.setOnSeekBarChangeListener(this);
        this.f35960e.setOnClickListener(this);
        this.f35969n.setOnClickListener(this);
        this.f35968m.setOnClickListener(this);
        this.f35971p.setOnClickListener(this);
    }

    /* renamed from: v */
    public final void m31996v() {
        View.OnClickListener onClickListener = this.f35975t;
        if (onClickListener == null) {
            this.f35957b.m21321n();
        } else {
            onClickListener.onClick(this.f35971p);
        }
    }

    /* renamed from: w */
    public final void m31997w() {
        View.OnClickListener onClickListener = this.f35976u;
        if (onClickListener == null) {
            this.f35959d.mo33703a(this.f35968m);
        } else {
            onClickListener.onClick(this.f35968m);
        }
    }

    /* renamed from: x */
    public final void m31998x() {
        if (this.f35977v) {
            this.f35958c.pause();
        } else {
            this.f35958c.play();
        }
    }

    /* renamed from: y */
    public final void m31999y() {
        this.f35974s.setProgress(0);
        this.f35974s.setMax(0);
        this.f35965j.post(new d(this));
    }

    /* renamed from: z */
    public final void m32000z() {
        this.f35953B.postDelayed(this.f35954C, 3000L);
    }
}

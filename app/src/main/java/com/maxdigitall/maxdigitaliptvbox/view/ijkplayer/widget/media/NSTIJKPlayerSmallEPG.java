package com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.TableLayout;
import android.widget.TextView;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferTable;
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import nf.C6783a;
import p151if.C5251a;
import p151if.C5255e;
import p250of.ServiceC6971a;
import p440z8.C10105q;
import pf.C7705a;
import pf.C7709e;
import pf.InterfaceC7706b;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkTimedText;
import tv.danmaku.ijk.media.player.misc.ITrackInfo;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSmallEPG.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSmallEPG.class */
public class NSTIJKPlayerSmallEPG extends FrameLayout implements MediaController.MediaPlayerControl {

    /* renamed from: O0 */
    public static final int[] f24615O0 = {0, 1, 2, 3, 4, 5};

    /* renamed from: A */
    public long f24616A;

    /* renamed from: A0 */
    public IMediaPlayer.OnPreparedListener f24617A0;

    /* renamed from: B */
    public boolean f24618B;

    /* renamed from: B0 */
    public IMediaPlayer.OnCompletionListener f24619B0;

    /* renamed from: C */
    public boolean f24620C;

    /* renamed from: C0 */
    public IMediaPlayer.OnInfoListener f24621C0;

    /* renamed from: D */
    public boolean f24622D;

    /* renamed from: D0 */
    public IMediaPlayer.OnErrorListener f24623D0;

    /* renamed from: E */
    public int f24624E;

    /* renamed from: E0 */
    public IMediaPlayer.OnBufferingUpdateListener f24625E0;

    /* renamed from: F */
    public Handler f24626F;

    /* renamed from: F0 */
    public IMediaPlayer.OnSeekCompleteListener f24627F0;

    /* renamed from: G */
    public Handler f24628G;

    /* renamed from: G0 */
    public IMediaPlayer.OnTimedTextListener f24629G0;

    /* renamed from: H */
    public boolean f24630H;

    /* renamed from: H0 */
    public InterfaceC4042a.a f24631H0;

    /* renamed from: I */
    public int f24632I;

    /* renamed from: I0 */
    public int f24633I0;

    /* renamed from: J */
    public boolean f24634J;

    /* renamed from: J0 */
    public int f24635J0;

    /* renamed from: K */
    public int f24636K;

    /* renamed from: K0 */
    public List<Integer> f24637K0;

    /* renamed from: L */
    public int f24638L;

    /* renamed from: L0 */
    public int f24639L0;

    /* renamed from: M */
    public boolean f24640M;

    /* renamed from: M0 */
    public int f24641M0;

    /* renamed from: N */
    public SharedPreferences f24642N;

    /* renamed from: N0 */
    public boolean f24643N0;

    /* renamed from: O */
    public SharedPreferences f24644O;

    /* renamed from: P */
    public Context f24645P;

    /* renamed from: Q */
    public C6783a f24646Q;

    /* renamed from: R */
    public InterfaceC4042a f24647R;

    /* renamed from: S */
    public int f24648S;

    /* renamed from: T */
    public int f24649T;

    /* renamed from: U */
    public long f24650U;

    /* renamed from: V */
    public long f24651V;

    /* renamed from: W */
    public long f24652W;

    /* renamed from: b */
    public String f24653b;

    /* renamed from: c */
    public Uri f24654c;

    /* renamed from: d */
    public String f24655d;

    /* renamed from: e */
    public Map<String, String> f24656e;

    /* renamed from: f */
    public int f24657f;

    /* renamed from: f0 */
    public long f24658f0;

    /* renamed from: g */
    public int f24659g;

    /* renamed from: g0 */
    public TextView f24660g0;

    /* renamed from: h */
    public int f24661h;

    /* renamed from: h0 */
    public Activity f24662h0;

    /* renamed from: i */
    public InterfaceC4042a.b f24663i;

    /* renamed from: i0 */
    public NSTIJKPlayerSmallEPG f24664i0;

    /* renamed from: j */
    public IMediaPlayer f24665j;

    /* renamed from: j0 */
    public AudioManager f24666j0;

    /* renamed from: k */
    public int f24667k;

    /* renamed from: k0 */
    public int f24668k0;

    /* renamed from: l */
    public int f24669l;

    /* renamed from: l0 */
    public float f24670l0;

    /* renamed from: m */
    public int f24671m;

    /* renamed from: m0 */
    public int f24672m0;

    /* renamed from: n */
    public int f24673n;

    /* renamed from: n0 */
    public C4012m f24674n0;

    /* renamed from: o */
    public int f24675o;

    /* renamed from: o0 */
    public Boolean f24676o0;

    /* renamed from: p */
    public InterfaceC7706b f24677p;

    /* renamed from: p0 */
    public Boolean f24678p0;

    /* renamed from: q */
    public IMediaPlayer.OnCompletionListener f24679q;

    /* renamed from: q0 */
    public Boolean f24680q0;

    /* renamed from: r */
    public IMediaPlayer.OnPreparedListener f24681r;

    /* renamed from: r0 */
    public Boolean f24682r0;

    /* renamed from: s */
    public int f24683s;

    /* renamed from: s0 */
    public Boolean f24684s0;

    /* renamed from: t */
    public IMediaPlayer.OnErrorListener f24685t;

    /* renamed from: t0 */
    public Boolean f24686t0;

    /* renamed from: u */
    public IMediaPlayer.OnInfoListener f24687u;

    /* renamed from: u0 */
    public SharedPreferences f24688u0;

    /* renamed from: v */
    public int f24689v;

    /* renamed from: v0 */
    public SharedPreferences f24690v0;

    /* renamed from: w */
    public boolean f24691w;

    /* renamed from: w0 */
    public SharedPreferences f24692w0;

    /* renamed from: x */
    public boolean f24693x;

    /* renamed from: x0 */
    public SharedPreferences f24694x0;

    /* renamed from: y */
    public boolean f24695y;

    /* renamed from: y0 */
    public Handler f24696y0;

    /* renamed from: z */
    public int f24697z;

    /* renamed from: z0 */
    public IMediaPlayer.OnVideoSizeChangedListener f24698z0;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSmallEPG$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSmallEPG$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSmallEPG$a.class */
    public class C4000a implements IMediaPlayer.OnBufferingUpdateListener {

        /* renamed from: a */
        public final NSTIJKPlayerSmallEPG f24699a;

        public C4000a(NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG) {
            this.f24699a = nSTIJKPlayerSmallEPG;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i10) {
            this.f24699a.f24683s = i10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSmallEPG$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSmallEPG$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSmallEPG$b.class */
    public class C4001b implements IMediaPlayer.OnSeekCompleteListener {

        /* renamed from: a */
        public final NSTIJKPlayerSmallEPG f24700a;

        public C4001b(NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG) {
            this.f24700a = nSTIJKPlayerSmallEPG;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            this.f24700a.f24658f0 = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSmallEPG$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSmallEPG$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSmallEPG$c.class */
    public class C4002c implements IMediaPlayer.OnTimedTextListener {

        /* renamed from: a */
        public final NSTIJKPlayerSmallEPG f24701a;

        public C4002c(NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG) {
            this.f24701a = nSTIJKPlayerSmallEPG;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnTimedTextListener
        public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            if (ijkTimedText != null) {
                this.f24701a.f24660g0.setText(ijkTimedText.getText().replace("{\\b1}", "").replace("{\\b0}", "").replace("{\\i1}", "").replace("{\\i0}", ""));
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSmallEPG$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSmallEPG$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSmallEPG$d.class */
    public class C4003d implements InterfaceC4042a.a {

        /* renamed from: a */
        public final NSTIJKPlayerSmallEPG f24702a;

        public C4003d(NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG) {
            this.f24702a = nSTIJKPlayerSmallEPG;
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.a
        /* renamed from: a */
        public void mo18794a(InterfaceC4042a.b bVar, int i10, int i11, int i12) {
            if (bVar.mo19699a() != this.f24702a.f24647R) {
                Log.e(this.f24702a.f24653b, "onSurfaceChanged: unmatched render callback\n");
                return;
            }
            this.f24702a.f24671m = i11;
            this.f24702a.f24673n = i12;
            boolean z10 = this.f24702a.f24661h == 3;
            boolean z11 = true;
            if (this.f24702a.f24647R.mo19697d()) {
                z11 = this.f24702a.f24667k == i11 && this.f24702a.f24669l == i12;
            }
            if (this.f24702a.f24665j != null && z10 && z11) {
                if (this.f24702a.f24689v != 0) {
                    NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG = this.f24702a;
                    nSTIJKPlayerSmallEPG.seekTo(nSTIJKPlayerSmallEPG.f24689v);
                }
                this.f24702a.start();
            }
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.a
        /* renamed from: b */
        public void mo18795b(InterfaceC4042a.b bVar) {
            if (bVar.mo19699a() != this.f24702a.f24647R) {
                Log.e(this.f24702a.f24653b, "onSurfaceDestroyed: unmatched render callback\n");
            } else {
                this.f24702a.f24663i = null;
                this.f24702a.m19529X();
            }
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.a
        /* renamed from: c */
        public void mo18796c(InterfaceC4042a.b bVar, int i10, int i11) {
            if (bVar.mo19699a() != this.f24702a.f24647R) {
                Log.e(this.f24702a.f24653b, "onSurfaceCreated: unmatched render callback\n");
                return;
            }
            this.f24702a.f24663i = bVar;
            if (this.f24702a.f24665j == null) {
                this.f24702a.m19527V();
            } else {
                NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG = this.f24702a;
                nSTIJKPlayerSmallEPG.m19515J(nSTIJKPlayerSmallEPG.f24665j, bVar);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSmallEPG$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSmallEPG$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSmallEPG$e.class */
    public class RunnableC4004e implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerSmallEPG f24703b;

        public RunnableC4004e(NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG) {
            this.f24703b = nSTIJKPlayerSmallEPG;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f24703b.m19521P();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSmallEPG$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSmallEPG$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSmallEPG$f.class */
    public class HandlerC4005f extends Handler {

        /* renamed from: a */
        public final NSTIJKPlayerSmallEPG f24704a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandlerC4005f(NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG, Looper looper) {
            super(looper);
            this.f24704a = nSTIJKPlayerSmallEPG;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 2) {
                this.f24704a.m19519N(false);
            } else {
                if (i10 != 4) {
                    return;
                }
                this.f24704a.f24674n0.m19543b(2131427540).m19542a();
                this.f24704a.f24674n0.m19543b(2131427478).m19542a();
                this.f24704a.f24674n0.m19543b(2131427500).m19542a();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSmallEPG$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSmallEPG$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSmallEPG$g.class */
    public class RunnableC4006g implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerSmallEPG f24705b;

        public RunnableC4006g(NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG) {
            this.f24705b = nSTIJKPlayerSmallEPG;
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG = this.f24705b;
            nSTIJKPlayerSmallEPG.f24636K++;
            nSTIJKPlayerSmallEPG.m19520O();
            C5255e.m26241k0(this.f24705b.f24662h0, this.f24705b.f24662h0.getResources().getString(2132018322) + " (" + this.f24705b.f24636K + "/" + this.f24705b.f24638L + ")");
            this.f24705b.m19527V();
            this.f24705b.start();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSmallEPG$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSmallEPG$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSmallEPG$h.class */
    public class C4007h implements IMediaPlayer.OnVideoSizeChangedListener {

        /* renamed from: a */
        public final NSTIJKPlayerSmallEPG f24706a;

        public C4007h(NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG) {
            this.f24706a = nSTIJKPlayerSmallEPG;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i10, int i11, int i12, int i13) {
            this.f24706a.f24667k = iMediaPlayer.getVideoWidth();
            this.f24706a.f24669l = iMediaPlayer.getVideoHeight();
            this.f24706a.f24648S = iMediaPlayer.getVideoSarNum();
            this.f24706a.f24649T = iMediaPlayer.getVideoSarDen();
            if (this.f24706a.f24667k == 0 || this.f24706a.f24669l == 0) {
                return;
            }
            if (this.f24706a.f24647R != null) {
                this.f24706a.f24647R.mo19696c(this.f24706a.f24667k, this.f24706a.f24669l);
                this.f24706a.f24647R.mo19694a(this.f24706a.f24648S, this.f24706a.f24649T);
            }
            this.f24706a.requestLayout();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSmallEPG$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSmallEPG$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSmallEPG$i.class */
    public class C4008i implements IMediaPlayer.OnPreparedListener {

        /* renamed from: a */
        public final NSTIJKPlayerSmallEPG f24707a;

        public C4008i(NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG) {
            this.f24707a = nSTIJKPlayerSmallEPG;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            this.f24707a.f24651V = System.currentTimeMillis();
            this.f24707a.f24659g = 2;
            if (this.f24707a.f24681r != null) {
                this.f24707a.f24681r.onPrepared(this.f24707a.f24665j);
            }
            if (this.f24707a.f24677p != null) {
                this.f24707a.f24677p.setEnabled(true);
            }
            this.f24707a.f24667k = iMediaPlayer.getVideoWidth();
            this.f24707a.f24669l = iMediaPlayer.getVideoHeight();
            int i10 = this.f24707a.f24689v;
            if (i10 != 0) {
                this.f24707a.seekTo(i10);
            }
            if (this.f24707a.f24667k == 0 || this.f24707a.f24669l == 0) {
                if (this.f24707a.f24661h == 3) {
                    this.f24707a.start();
                    return;
                }
                return;
            }
            if (this.f24707a.f24647R != null) {
                this.f24707a.f24647R.mo19696c(this.f24707a.f24667k, this.f24707a.f24669l);
                this.f24707a.f24647R.mo19694a(this.f24707a.f24648S, this.f24707a.f24649T);
                if (!this.f24707a.f24647R.mo19697d() || (this.f24707a.f24671m == this.f24707a.f24667k && this.f24707a.f24673n == this.f24707a.f24669l)) {
                    if (this.f24707a.f24661h == 3) {
                        this.f24707a.start();
                        if (this.f24707a.f24677p != null) {
                            this.f24707a.f24677p.show();
                            return;
                        }
                        return;
                    }
                    if (this.f24707a.isPlaying()) {
                        return;
                    }
                    if ((i10 != 0 || this.f24707a.getCurrentPosition() > 0) && this.f24707a.f24677p != null) {
                        this.f24707a.f24677p.show(0);
                    }
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSmallEPG$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSmallEPG$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSmallEPG$j.class */
    public class C4009j implements IMediaPlayer.OnCompletionListener {

        /* renamed from: a */
        public final NSTIJKPlayerSmallEPG f24708a;

        public C4009j(NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG) {
            this.f24708a = nSTIJKPlayerSmallEPG;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            this.f24708a.f24659g = 5;
            this.f24708a.f24661h = 5;
            if (this.f24708a.f24677p != null) {
                this.f24708a.f24677p.m33655d();
            }
            this.f24708a.m19537f0(-1);
            if (this.f24708a.f24679q != null) {
                this.f24708a.f24679q.onCompletion(this.f24708a.f24665j);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSmallEPG$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSmallEPG$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSmallEPG$k.class */
    public class C4010k implements IMediaPlayer.OnInfoListener {

        /* renamed from: a */
        public final NSTIJKPlayerSmallEPG f24709a;

        public C4010k(NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG) {
            this.f24709a = nSTIJKPlayerSmallEPG;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i10, int i11) {
            String str;
            String str2;
            if (this.f24709a.f24687u != null) {
                this.f24709a.f24687u.onInfo(iMediaPlayer, i10, i11);
            }
            if (i10 == 3) {
                this.f24709a.m19537f0(2);
                str = this.f24709a.f24653b;
                str2 = "MEDIA_INFO_VIDEO_RENDERING_START:";
            } else if (i10 == 10005) {
                this.f24709a.m19537f0(1);
                str = this.f24709a.f24653b;
                str2 = "MEDIA_INFO_OPEN_INPUT:";
            } else if (i10 == 901) {
                str = this.f24709a.f24653b;
                str2 = "MEDIA_INFO_UNSUPPORTED_SUBTITLE:";
            } else if (i10 == 902) {
                str = this.f24709a.f24653b;
                str2 = "MEDIA_INFO_SUBTITLE_TIMED_OUT:";
            } else {
                if (i10 == 10001) {
                    this.f24709a.f24675o = i11;
                    Log.d(this.f24709a.f24653b, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i11);
                    if (this.f24709a.f24647R == null) {
                        return true;
                    }
                    this.f24709a.f24647R.setVideoRotation(i11);
                    return true;
                }
                if (i10 != 10002) {
                    switch (i10) {
                        case 700:
                            str = this.f24709a.f24653b;
                            str2 = "MEDIA_INFO_VIDEO_TRACK_LAGGING:";
                            break;
                        case IMediaPlayer.MEDIA_INFO_BUFFERING_START /* 701 */:
                            this.f24709a.m19537f0(1);
                            str = this.f24709a.f24653b;
                            str2 = "MEDIA_INFO_BUFFERING_START:";
                            break;
                        case IMediaPlayer.MEDIA_INFO_BUFFERING_END /* 702 */:
                            this.f24709a.m19537f0(6);
                            str = this.f24709a.f24653b;
                            str2 = "MEDIA_INFO_BUFFERING_END:";
                            break;
                        case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                            str = this.f24709a.f24653b;
                            str2 = "MEDIA_INFO_NETWORK_BANDWIDTH: " + i11;
                            break;
                        default:
                            switch (i10) {
                                case 800:
                                    str = this.f24709a.f24653b;
                                    str2 = "MEDIA_INFO_BAD_INTERLEAVING:";
                                    break;
                                case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                    str = this.f24709a.f24653b;
                                    str2 = "MEDIA_INFO_NOT_SEEKABLE:";
                                    break;
                                case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                    str = this.f24709a.f24653b;
                                    str2 = "MEDIA_INFO_METADATA_UPDATE:";
                                    break;
                                default:
                                    return true;
                            }
                    }
                } else {
                    str = this.f24709a.f24653b;
                    str2 = "MEDIA_INFO_AUDIO_RENDERING_START:";
                }
            }
            Log.d(str, str2);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSmallEPG$l.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSmallEPG$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSmallEPG$l.class */
    public class C4011l implements IMediaPlayer.OnErrorListener {

        /* renamed from: a */
        public final NSTIJKPlayerSmallEPG f24710a;

        public C4011l(NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG) {
            this.f24710a = nSTIJKPlayerSmallEPG;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i10, int i11) {
            Log.d(this.f24710a.f24653b, "Error: " + i10 + "," + i11);
            this.f24710a.f24659g = -1;
            this.f24710a.f24661h = -1;
            if (this.f24710a.f24677p != null) {
                this.f24710a.f24677p.m33655d();
            }
            this.f24710a.m19537f0(-1);
            if (this.f24710a.f24685t == null) {
                return true;
            }
            this.f24710a.f24685t.onError(this.f24710a.f24665j, i10, i11);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSmallEPG$m.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSmallEPG$m */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSmallEPG$m.class */
    public class C4012m {

        /* renamed from: a */
        public final Activity f24711a;

        /* renamed from: b */
        public View f24712b;

        /* renamed from: c */
        public final NSTIJKPlayerSmallEPG f24713c;

        public C4012m(NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG, Activity activity) {
            this.f24713c = nSTIJKPlayerSmallEPG;
            this.f24711a = activity;
        }

        /* renamed from: a */
        public C4012m m19542a() {
            View view = this.f24712b;
            if (view != null) {
                view.setVisibility(8);
            }
            return this;
        }

        /* renamed from: b */
        public C4012m m19543b(int i10) {
            this.f24712b = this.f24711a.findViewById(i10);
            return this;
        }

        /* renamed from: c */
        public C4012m m19544c() {
            View view = this.f24712b;
            if (view != null) {
                view.setVisibility(4);
            }
            return this;
        }

        /* renamed from: d */
        public C4012m m19545d() {
            View view = this.f24712b;
            if (view != null) {
                view.requestFocus();
            }
            return this;
        }

        /* renamed from: e */
        public C4012m m19546e(CharSequence charSequence) {
            View view = this.f24712b;
            if (view != null && (view instanceof TextView)) {
                ((TextView) view).setText(charSequence);
            }
            return this;
        }

        /* renamed from: f */
        public C4012m m19547f(int i10) {
            View view = this.f24712b;
            if (view != null) {
                view.setVisibility(i10);
            }
            return this;
        }

        /* renamed from: g */
        public C4012m m19548g() {
            View view = this.f24712b;
            if (view != null) {
                view.setVisibility(0);
            }
            return this;
        }
    }

    public NSTIJKPlayerSmallEPG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24653b = "NSTIJKPlayerSmallEPG";
        this.f24657f = 0;
        this.f24659g = 0;
        this.f24661h = 0;
        this.f24663i = null;
        this.f24665j = null;
        this.f24691w = true;
        this.f24693x = true;
        this.f24695y = true;
        this.f24697z = -1;
        this.f24616A = -1L;
        this.f24620C = true;
        this.f24622D = false;
        this.f24624E = 7000;
        this.f24632I = 0;
        this.f24636K = 0;
        this.f24638L = 5;
        this.f24640M = false;
        this.f24650U = 0L;
        this.f24651V = 0L;
        this.f24652W = 0L;
        this.f24658f0 = 0L;
        this.f24670l0 = -1.0f;
        Boolean bool = Boolean.FALSE;
        this.f24676o0 = bool;
        this.f24678p0 = bool;
        this.f24680q0 = bool;
        this.f24682r0 = bool;
        this.f24684s0 = bool;
        this.f24686t0 = bool;
        this.f24696y0 = new HandlerC4005f(this, Looper.getMainLooper());
        this.f24698z0 = new C4007h(this);
        this.f24617A0 = new C4008i(this);
        this.f24619B0 = new C4009j(this);
        this.f24621C0 = new C4010k(this);
        this.f24623D0 = new C4011l(this);
        this.f24625E0 = new C4000a(this);
        this.f24627F0 = new C4001b(this);
        this.f24629G0 = new C4002c(this);
        this.f24631H0 = new C4003d(this);
        this.f24633I0 = 4;
        this.f24635J0 = f24615O0[0];
        this.f24637K0 = new ArrayList();
        this.f24639L0 = 0;
        this.f24641M0 = 0;
        this.f24643N0 = false;
        m19524S(context);
    }

    /* renamed from: J */
    public final void m19515J(IMediaPlayer iMediaPlayer, InterfaceC4042a.b bVar) {
        if (iMediaPlayer == null) {
            return;
        }
        if (bVar == null) {
            iMediaPlayer.setDisplay(null);
        } else {
            bVar.mo19700b(iMediaPlayer);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e2  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tv.danmaku.ijk.media.player.IMediaPlayer m19516K(int r7) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSmallEPG.m19516K(int):tv.danmaku.ijk.media.player.IMediaPlayer");
    }

    /* renamed from: L */
    public void m19517L(int i10) {
        C7709e.m33681b(this.f24665j, i10);
    }

    /* renamed from: M */
    public void m19518M() {
        ServiceC6971a.m31982d(this.f24665j);
    }

    /* renamed from: N */
    public void m19519N(boolean z10) {
        if (z10 || this.f24618B) {
            m19535d0(false);
            this.f24674n0.m19543b(2131427532).m19542a();
            this.f24674n0.m19543b(2131427785).m19542a();
            this.f24674n0.m19543b(2131427506).m19544c();
            this.f24674n0.m19543b(2131428499).m19542a();
            this.f24618B = false;
            m19521P();
        }
    }

    /* renamed from: O */
    public final void m19520O() {
        this.f24674n0.m19543b(2131427507).m19542a();
        this.f24674n0.m19543b(2131427519).m19542a();
        if (C5251a.f30048k.booleanValue()) {
            this.f24674n0.m19543b(2131429693).m19542a();
        }
        m19535d0(false);
        m19521P();
    }

    /* renamed from: P */
    public void m19521P() {
        this.f24674n0.m19543b(2131427532).m19542a();
        this.f24674n0.m19543b(2131427785).m19542a();
        this.f24674n0.m19543b(2131428499).m19542a();
        this.f24618B = false;
        this.f24626F.removeCallbacksAndMessages(null);
        if (C5251a.f30048k.booleanValue()) {
            this.f24674n0.m19543b(2131429693).m19548g();
        }
    }

    /* renamed from: Q */
    public final void m19522Q() {
        boolean m31278p = this.f24646Q.m31278p();
        this.f24643N0 = m31278p;
        if (m31278p) {
            ServiceC6971a.m31980b(getContext());
            this.f24665j = ServiceC6971a.m31979a();
        }
    }

    /* renamed from: R */
    public final void m19523R() {
        this.f24637K0.clear();
        if (this.f24646Q.m31281s()) {
            this.f24637K0.add(1);
        }
        if (this.f24646Q.m31282t()) {
            this.f24637K0.add(2);
        }
        if (this.f24646Q.m31280r()) {
            this.f24637K0.add(0);
        }
        if (this.f24637K0.isEmpty()) {
            this.f24637K0.add(1);
        }
        int intValue = this.f24637K0.get(this.f24639L0).intValue();
        this.f24641M0 = intValue;
        setRender(intValue);
    }

    /* renamed from: S */
    public final void m19524S(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f24645P = applicationContext;
        this.f24646Q = new C6783a(applicationContext);
        m19522Q();
        m19523R();
        this.f24667k = 0;
        this.f24669l = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f24659g = 0;
        this.f24661h = 0;
        TextView textView = new TextView(context);
        this.f24660g0 = textView;
        textView.setTextSize(24.0f);
        this.f24660g0.setTextColor(context.getResources().getColor(2131100158));
        this.f24660g0.setGravity(17);
        addView(this.f24660g0, new FrameLayout.LayoutParams(-1, -2, 80));
    }

    /* renamed from: T */
    public boolean m19525T() {
        return this.f24643N0;
    }

    /* renamed from: U */
    public final boolean m19526U() {
        int i10;
        boolean z10 = true;
        if (this.f24665j == null || (i10 = this.f24659g) == -1 || i10 == 0 || i10 == 1) {
            z10 = false;
        }
        return z10;
    }

    @TargetApi(23)
    /* renamed from: V */
    public void m19527V() {
        IMediaPlayer.OnErrorListener onErrorListener;
        IMediaPlayer iMediaPlayer;
        if (this.f24654c == null || this.f24663i == null) {
            return;
        }
        m19528W(false);
        try {
            ((AudioManager) this.f24645P.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        } catch (Exception e10) {
        }
        try {
            try {
                try {
                    this.f24665j = m19516K(this.f24646Q.m31285w());
                    getContext();
                    this.f24665j.setOnPreparedListener(this.f24617A0);
                    this.f24665j.setOnVideoSizeChangedListener(this.f24698z0);
                    this.f24665j.setOnCompletionListener(this.f24619B0);
                    this.f24665j.setOnErrorListener(this.f24623D0);
                    this.f24665j.setOnInfoListener(this.f24621C0);
                    this.f24665j.setOnBufferingUpdateListener(this.f24625E0);
                    this.f24665j.setOnSeekCompleteListener(this.f24627F0);
                    this.f24665j.setOnTimedTextListener(this.f24629G0);
                    this.f24683s = 0;
                    String scheme = this.f24654c.getScheme();
                    if (Build.VERSION.SDK_INT >= 23 && this.f24646Q.m31246E() && (TextUtils.isEmpty(scheme) || scheme.equalsIgnoreCase(TransferTable.COLUMN_FILE))) {
                        this.f24665j.setDataSource(new C7705a(new File(this.f24654c.toString())));
                    } else {
                        this.f24665j.setDataSource(this.f24645P, this.f24654c, this.f24656e);
                    }
                    m19515J(this.f24665j, this.f24663i);
                    this.f24665j.setAudioStreamType(3);
                    this.f24665j.setScreenOnWhilePlaying(true);
                    this.f24650U = System.currentTimeMillis();
                    this.f24665j.prepareAsync();
                    this.f24672m0 = this.f24662h0.getResources().getDisplayMetrics().widthPixels;
                    AudioManager audioManager = (AudioManager) this.f24662h0.getSystemService("audio");
                    this.f24666j0 = audioManager;
                    this.f24668k0 = audioManager.getStreamMaxVolume(3);
                    this.f24659g = 1;
                } catch (IOException e11) {
                    Log.w(this.f24653b, "Unable to open content: " + this.f24654c, e11);
                    this.f24659g = -1;
                    this.f24661h = -1;
                    onErrorListener = this.f24623D0;
                    iMediaPlayer = this.f24665j;
                    onErrorListener.onError(iMediaPlayer, 1, 0);
                } catch (IllegalArgumentException e12) {
                    Log.w(this.f24653b, "Unable to open content: " + this.f24654c, e12);
                    this.f24659g = -1;
                    this.f24661h = -1;
                    onErrorListener = this.f24623D0;
                    iMediaPlayer = this.f24665j;
                    onErrorListener.onError(iMediaPlayer, 1, 0);
                }
            } catch (NullPointerException e13) {
                Log.w(this.f24653b, "Unable to open content: " + this.f24654c, e13);
                this.f24659g = -1;
                this.f24661h = -1;
                onErrorListener = this.f24623D0;
                iMediaPlayer = this.f24665j;
                onErrorListener.onError(iMediaPlayer, 1, 0);
            }
        } catch (Exception e14) {
            Log.w(this.f24653b, "Unable to open content: " + this.f24654c, e14);
            this.f24659g = -1;
            this.f24661h = -1;
            onErrorListener = this.f24623D0;
            iMediaPlayer = this.f24665j;
            onErrorListener.onError(iMediaPlayer, 1, 0);
        }
    }

    /* renamed from: W */
    public void m19528W(boolean z10) {
        IMediaPlayer iMediaPlayer = this.f24665j;
        if (iMediaPlayer != null) {
            iMediaPlayer.reset();
            this.f24665j.release();
            this.f24665j = null;
            this.f24659g = 0;
            if (z10) {
                this.f24661h = 0;
            }
            ((AudioManager) this.f24645P.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    /* renamed from: X */
    public void m19529X() {
        IMediaPlayer iMediaPlayer = this.f24665j;
        if (iMediaPlayer != null) {
            iMediaPlayer.setDisplay(null);
        }
    }

    /* renamed from: Y */
    public void m19530Y(int i10) {
        C7709e.m33684e(this.f24665j, i10);
    }

    /* renamed from: Z */
    public void m19531Z(Activity activity, NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG) {
        this.f24662h0 = activity;
        this.f24664i0 = nSTIJKPlayerSmallEPG;
        this.f24626F = new Handler();
        this.f24628G = new Handler();
        this.f24674n0 = new C4012m(this, activity);
    }

    /* renamed from: a0 */
    public final void m19532a0(Uri uri, Map<String, String> map, boolean z10, String str) {
        this.f24654c = uri;
        this.f24655d = str;
        this.f24656e = map;
        this.f24689v = 0;
        this.f24634J = z10;
        m19539h0();
        m19527V();
        requestLayout();
        invalidate();
    }

    /* renamed from: b0 */
    public void m19533b0(Uri uri, boolean z10, String str) {
        m19532a0(uri, null, z10, str);
    }

    /* renamed from: c0 */
    public void m19534c0(int i10) {
        this.f24674n0.m19543b(2131427532).m19548g();
        this.f24674n0.m19543b(2131427785).m19548g();
        this.f24674n0.m19543b(2131428499).m19548g();
        if (!this.f24622D) {
            m19535d0(true);
        }
        if (!this.f24630H) {
            this.f24674n0.m19543b(2131427506).m19548g();
        }
        ((LinearLayout) this.f24662h0.findViewById(2131428350)).setVisibility(0);
        this.f24626F.postDelayed(new RunnableC4004e(this), 5000L);
        m19541j0();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.f24691w;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.f24693x;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.f24695y;
    }

    /* renamed from: d0 */
    public void m19535d0(boolean z10) {
        this.f24674n0.m19543b(2131427490).m19547f(z10 ? 0 : 8);
        this.f24674n0.m19543b(2131427494).m19547f(z10 ? 0 : 8);
        this.f24674n0.m19543b(2131427515).m19547f(z10 ? 0 : 8);
    }

    /* renamed from: e0 */
    public final void m19536e0(String str) {
        this.f24674n0.m19543b(2131429674).m19542a();
        this.f24674n0.m19543b(2131427519).m19548g();
        this.f24674n0.m19543b(2131427523).m19546e(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0189, code lost:
    
        if (r0 == (-1)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01b2, code lost:
    
        m19530Y(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x019b, code lost:
    
        m19517L(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0198, code lost:
    
        if (r0 != (-1)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01ac, code lost:
    
        if (r0 == (-1)) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x022d  */
    /* renamed from: f0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m19537f0(int r6) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSmallEPG.m19537f0(int):void");
    }

    /* renamed from: g0 */
    public void m19538g0() {
        ServiceC6971a.m31982d(null);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f24665j != null) {
            return this.f24683s;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (m19526U()) {
            return (int) this.f24665j.getCurrentPosition();
        }
        return 0;
    }

    public int getCurrentWindowIndex() {
        return this.f24632I;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (m19526U()) {
            return (int) this.f24665j.getDuration();
        }
        return -1;
    }

    public Boolean getFullScreenValue() {
        return Boolean.valueOf(this.f24634J);
    }

    public ITrackInfo[] getTrackInfo() {
        IMediaPlayer iMediaPlayer = this.f24665j;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.getTrackInfo();
    }

    /* renamed from: h0 */
    public void m19539h0() {
        IMediaPlayer iMediaPlayer = this.f24665j;
        if (iMediaPlayer != null) {
            iMediaPlayer.stop();
            this.f24665j.release();
            this.f24665j = null;
            this.f24659g = 0;
            this.f24661h = 0;
            ((AudioManager) this.f24645P.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    /* renamed from: i0 */
    public final void m19540i0() {
        if (this.f24677p.m33652a()) {
            this.f24677p.m33655d();
        } else {
            this.f24677p.show();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        IMediaPlayer iMediaPlayer;
        return m19526U() && (iMediaPlayer = this.f24665j) != null && iMediaPlayer.isPlaying();
    }

    /* renamed from: j0 */
    public final void m19541j0() {
        C4012m m19543b;
        IMediaPlayer iMediaPlayer = this.f24665j;
        if (iMediaPlayer == null || !iMediaPlayer.isPlaying()) {
            this.f24674n0.m19543b(C10105q.f46301B).m19542a();
            this.f24674n0.m19543b(C10105q.f46302C).m19548g();
            m19543b = this.f24674n0.m19543b(C10105q.f46302C);
        } else {
            this.f24674n0.m19543b(C10105q.f46302C).m19542a();
            this.f24674n0.m19543b(C10105q.f46301B).m19548g();
            m19543b = this.f24674n0.m19543b(C10105q.f46301B);
        }
        m19543b.m19545d();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10 = (i10 == 4 || i10 == 24 || i10 == 25 || i10 == 164 || i10 == 82 || i10 == 5 || i10 == 6) ? false : true;
        if (m19526U() && z10 && this.f24677p != null) {
            if (i10 == 79 || i10 == 85) {
                IMediaPlayer iMediaPlayer = this.f24665j;
                if (iMediaPlayer == null || !iMediaPlayer.isPlaying()) {
                    start();
                    this.f24677p.m33655d();
                    return true;
                }
                pause();
                this.f24677p.show();
                return true;
            }
            if (i10 == 126) {
                IMediaPlayer iMediaPlayer2 = this.f24665j;
                if (iMediaPlayer2 == null || iMediaPlayer2.isPlaying()) {
                    return true;
                }
                start();
                this.f24677p.m33655d();
                return true;
            }
            if (i10 == 86 || i10 == 127) {
                IMediaPlayer iMediaPlayer3 = this.f24665j;
                if (iMediaPlayer3 == null || !iMediaPlayer3.isPlaying()) {
                    return true;
                }
                pause();
                this.f24677p.show();
                return true;
            }
            m19540i0();
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        IMediaPlayer iMediaPlayer;
        if (m19526U() && (iMediaPlayer = this.f24665j) != null && iMediaPlayer.isPlaying()) {
            this.f24665j.pause();
            this.f24659g = 4;
        }
        this.f24661h = 4;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i10) {
        int i11 = i10;
        if (m19526U()) {
            this.f24652W = System.currentTimeMillis();
            this.f24665j.seekTo(i10);
            i11 = 0;
        }
        this.f24689v = i11;
    }

    public void setCurrentWindowIndex(int i10) {
        this.f24632I = i10;
    }

    public void setHudView(TableLayout tableLayout) {
    }

    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.f24679q = onCompletionListener;
    }

    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        this.f24685t = onErrorListener;
    }

    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.f24687u = onInfoListener;
    }

    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.f24681r = onPreparedListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setRender(int i10) {
        C4043b c4043b;
        if (i10 == 0) {
            c4043b = null;
        } else if (i10 == 1) {
            c4043b = new C4043b(getContext());
        } else {
            if (i10 != 2) {
                Log.e(this.f24653b, String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i10)));
                return;
            }
            C4044c c4044c = new C4044c(getContext());
            c4043b = c4044c;
            if (this.f24665j != null) {
                c4044c.getSurfaceHolder().mo19700b(this.f24665j);
                c4044c.mo19696c(this.f24665j.getVideoWidth(), this.f24665j.getVideoHeight());
                c4044c.mo19694a(this.f24665j.getVideoSarNum(), this.f24665j.getVideoSarDen());
                c4044c.setAspectRatio(this.f24635J0);
                c4043b = c4044c;
            }
        }
        setRenderView(c4043b);
    }

    public void setRenderView(InterfaceC4042a interfaceC4042a) {
        int i10;
        int i11;
        if (this.f24647R != null) {
            IMediaPlayer iMediaPlayer = this.f24665j;
            if (iMediaPlayer != null) {
                iMediaPlayer.setDisplay(null);
            }
            View view = this.f24647R.getView();
            this.f24647R.mo19695b(this.f24631H0);
            this.f24647R = null;
            removeView(view);
        }
        if (interfaceC4042a == null) {
            return;
        }
        this.f24647R = interfaceC4042a;
        SharedPreferences sharedPreferences = this.f24645P.getSharedPreferences("loginPrefs", 0);
        this.f24642N = sharedPreferences;
        int i12 = sharedPreferences.getInt("aspect_ratio", 4);
        this.f24633I0 = i12;
        interfaceC4042a.setAspectRatio(i12);
        int i13 = this.f24667k;
        if (i13 > 0 && (i11 = this.f24669l) > 0) {
            interfaceC4042a.mo19696c(i13, i11);
        }
        int i14 = this.f24648S;
        if (i14 > 0 && (i10 = this.f24649T) > 0) {
            interfaceC4042a.mo19694a(i14, i10);
        }
        View view2 = this.f24647R.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(view2);
        this.f24647R.mo19698e(this.f24631H0);
        this.f24647R.setVideoRotation(this.f24675o);
    }

    public void setTitle(CharSequence charSequence) {
        this.f24674n0.m19543b(2131427528).m19546e(charSequence);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (m19526U()) {
            this.f24665j.start();
            this.f24659g = 3;
        }
        this.f24661h = 3;
    }
}

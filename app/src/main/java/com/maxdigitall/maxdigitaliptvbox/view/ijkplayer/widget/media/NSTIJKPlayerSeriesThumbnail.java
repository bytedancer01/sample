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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.TableLayout;
import android.widget.TextView;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferTable;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import nf.C6783a;
import p151if.C5251a;
import p250of.ServiceC6971a;
import pf.C7705a;
import pf.C7709e;
import pf.InterfaceC7706b;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkTimedText;
import tv.danmaku.ijk.media.player.misc.ITrackInfo;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSeriesThumbnail.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSeriesThumbnail.class */
public class NSTIJKPlayerSeriesThumbnail extends FrameLayout implements MediaController.MediaPlayerControl {

    /* renamed from: W0 */
    public static final int[] f24155W0 = {0, 1, 2, 3, 4, 5};

    /* renamed from: A */
    public long f24156A;

    /* renamed from: A0 */
    public LinearLayout f24157A0;

    /* renamed from: B */
    public boolean f24158B;

    /* renamed from: B0 */
    public ImageView f24159B0;

    /* renamed from: C */
    public boolean f24160C;

    /* renamed from: C0 */
    public LinearLayout f24161C0;

    /* renamed from: D */
    public int f24162D;

    /* renamed from: D0 */
    public LinearLayout f24163D0;

    /* renamed from: E */
    public Handler f24164E;

    /* renamed from: E0 */
    public ProgressBar f24165E0;

    /* renamed from: F */
    public Handler f24166F;

    /* renamed from: F0 */
    public int f24167F0;

    /* renamed from: G */
    public int f24168G;

    /* renamed from: G0 */
    public Handler f24169G0;

    /* renamed from: H */
    public boolean f24170H;

    /* renamed from: H0 */
    public IMediaPlayer.OnVideoSizeChangedListener f24171H0;

    /* renamed from: I */
    public int f24172I;

    /* renamed from: I0 */
    public IMediaPlayer.OnPreparedListener f24173I0;

    /* renamed from: J */
    public int f24174J;

    /* renamed from: J0 */
    public IMediaPlayer.OnCompletionListener f24175J0;

    /* renamed from: K */
    public boolean f24176K;

    /* renamed from: K0 */
    public IMediaPlayer.OnInfoListener f24177K0;

    /* renamed from: L */
    public SharedPreferences f24178L;

    /* renamed from: L0 */
    public IMediaPlayer.OnErrorListener f24179L0;

    /* renamed from: M */
    public SharedPreferences f24180M;

    /* renamed from: M0 */
    public IMediaPlayer.OnBufferingUpdateListener f24181M0;

    /* renamed from: N */
    public Context f24182N;

    /* renamed from: N0 */
    public IMediaPlayer.OnSeekCompleteListener f24183N0;

    /* renamed from: O */
    public C6783a f24184O;

    /* renamed from: O0 */
    public IMediaPlayer.OnTimedTextListener f24185O0;

    /* renamed from: P */
    public InterfaceC4042a f24186P;

    /* renamed from: P0 */
    public InterfaceC4042a.a f24187P0;

    /* renamed from: Q */
    public int f24188Q;

    /* renamed from: Q0 */
    public int f24189Q0;

    /* renamed from: R */
    public int f24190R;

    /* renamed from: R0 */
    public int f24191R0;

    /* renamed from: S */
    public long f24192S;

    /* renamed from: S0 */
    public List<Integer> f24193S0;

    /* renamed from: T */
    public long f24194T;

    /* renamed from: T0 */
    public int f24195T0;

    /* renamed from: U */
    public long f24196U;

    /* renamed from: U0 */
    public int f24197U0;

    /* renamed from: V */
    public long f24198V;

    /* renamed from: V0 */
    public boolean f24199V0;

    /* renamed from: W */
    public TextView f24200W;

    /* renamed from: b */
    public String f24201b;

    /* renamed from: c */
    public Uri f24202c;

    /* renamed from: d */
    public String f24203d;

    /* renamed from: e */
    public Map<String, String> f24204e;

    /* renamed from: f */
    public int f24205f;

    /* renamed from: f0 */
    public Activity f24206f0;

    /* renamed from: g */
    public int f24207g;

    /* renamed from: g0 */
    public NSTIJKPlayerSeriesThumbnail f24208g0;

    /* renamed from: h */
    public int f24209h;

    /* renamed from: h0 */
    public AudioManager f24210h0;

    /* renamed from: i */
    public InterfaceC4042a.b f24211i;

    /* renamed from: i0 */
    public int f24212i0;

    /* renamed from: j */
    public IMediaPlayer f24213j;

    /* renamed from: j0 */
    public float f24214j0;

    /* renamed from: k */
    public int f24215k;

    /* renamed from: k0 */
    public int f24216k0;

    /* renamed from: l */
    public int f24217l;

    /* renamed from: l0 */
    public C3947k f24218l0;

    /* renamed from: m */
    public int f24219m;

    /* renamed from: m0 */
    public Boolean f24220m0;

    /* renamed from: n */
    public int f24221n;

    /* renamed from: n0 */
    public Boolean f24222n0;

    /* renamed from: o */
    public int f24223o;

    /* renamed from: o0 */
    public Boolean f24224o0;

    /* renamed from: p */
    public InterfaceC7706b f24225p;

    /* renamed from: p0 */
    public Boolean f24226p0;

    /* renamed from: q */
    public IMediaPlayer.OnCompletionListener f24227q;

    /* renamed from: q0 */
    public Boolean f24228q0;

    /* renamed from: r */
    public IMediaPlayer.OnPreparedListener f24229r;

    /* renamed from: r0 */
    public Boolean f24230r0;

    /* renamed from: s */
    public int f24231s;

    /* renamed from: s0 */
    public SharedPreferences f24232s0;

    /* renamed from: t */
    public IMediaPlayer.OnErrorListener f24233t;

    /* renamed from: t0 */
    public SharedPreferences f24234t0;

    /* renamed from: u */
    public IMediaPlayer.OnInfoListener f24235u;

    /* renamed from: u0 */
    public SharedPreferences f24236u0;

    /* renamed from: v */
    public int f24237v;

    /* renamed from: v0 */
    public SharedPreferences f24238v0;

    /* renamed from: w */
    public boolean f24239w;

    /* renamed from: w0 */
    public LiveStreamDBHandler f24240w0;

    /* renamed from: x */
    public boolean f24241x;

    /* renamed from: x0 */
    public Context f24242x0;

    /* renamed from: y */
    public boolean f24243y;

    /* renamed from: y0 */
    public NSTIJKPlayerSeriesThumbnail f24244y0;

    /* renamed from: z */
    public int f24245z;

    /* renamed from: z0 */
    public LinearLayout f24246z0;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSeriesThumbnail$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSeriesThumbnail$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSeriesThumbnail$a.class */
    public class C3937a implements InterfaceC4042a.a {

        /* renamed from: a */
        public final NSTIJKPlayerSeriesThumbnail f24247a;

        public C3937a(NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail) {
            this.f24247a = nSTIJKPlayerSeriesThumbnail;
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.a
        /* renamed from: a */
        public void mo18794a(InterfaceC4042a.b bVar, int i10, int i11, int i12) {
            if (bVar.mo19699a() != this.f24247a.f24186P) {
                Log.e(this.f24247a.f24201b, "onSurfaceChanged: unmatched render callback\n");
                return;
            }
            this.f24247a.f24219m = i11;
            this.f24247a.f24221n = i12;
            boolean z10 = this.f24247a.f24209h == 3;
            boolean z11 = true;
            if (this.f24247a.f24186P.mo19697d()) {
                z11 = this.f24247a.f24215k == i11 && this.f24247a.f24217l == i12;
            }
            if (this.f24247a.f24213j != null && z10 && z11) {
                if (this.f24247a.f24237v != 0) {
                    NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail = this.f24247a;
                    nSTIJKPlayerSeriesThumbnail.seekTo(nSTIJKPlayerSeriesThumbnail.f24237v);
                }
                this.f24247a.start();
            }
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.a
        /* renamed from: b */
        public void mo18795b(InterfaceC4042a.b bVar) {
            if (bVar.mo19699a() != this.f24247a.f24186P) {
                Log.e(this.f24247a.f24201b, "onSurfaceDestroyed: unmatched render callback\n");
            } else {
                this.f24247a.f24211i = null;
                this.f24247a.m19252W();
            }
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.a
        /* renamed from: c */
        public void mo18796c(InterfaceC4042a.b bVar, int i10, int i11) {
            if (bVar.mo19699a() != this.f24247a.f24186P) {
                Log.e(this.f24247a.f24201b, "onSurfaceCreated: unmatched render callback\n");
                return;
            }
            this.f24247a.f24211i = bVar;
            if (this.f24247a.f24213j == null) {
                this.f24247a.m19250U();
            } else {
                NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail = this.f24247a;
                nSTIJKPlayerSeriesThumbnail.m19237H(nSTIJKPlayerSeriesThumbnail.f24213j, bVar);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSeriesThumbnail$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSeriesThumbnail$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSeriesThumbnail$b.class */
    public class HandlerC3938b extends Handler {

        /* renamed from: a */
        public final NSTIJKPlayerSeriesThumbnail f24248a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandlerC3938b(NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail, Looper looper) {
            super(looper);
            this.f24248a = nSTIJKPlayerSeriesThumbnail;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 2) {
                this.f24248a.m19241L(false);
            } else {
                if (i10 != 4) {
                    return;
                }
                this.f24248a.f24218l0.m19263b(2131427540).m19262a();
                this.f24248a.f24218l0.m19263b(2131427478).m19262a();
                this.f24248a.f24218l0.m19263b(2131427500).m19262a();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSeriesThumbnail$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSeriesThumbnail$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSeriesThumbnail$c.class */
    public class C3939c implements IMediaPlayer.OnVideoSizeChangedListener {

        /* renamed from: a */
        public final NSTIJKPlayerSeriesThumbnail f24249a;

        public C3939c(NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail) {
            this.f24249a = nSTIJKPlayerSeriesThumbnail;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i10, int i11, int i12, int i13) {
            this.f24249a.f24215k = iMediaPlayer.getVideoWidth();
            this.f24249a.f24217l = iMediaPlayer.getVideoHeight();
            this.f24249a.f24188Q = iMediaPlayer.getVideoSarNum();
            this.f24249a.f24190R = iMediaPlayer.getVideoSarDen();
            if (this.f24249a.f24215k == 0 || this.f24249a.f24217l == 0) {
                return;
            }
            if (this.f24249a.f24186P != null) {
                this.f24249a.f24186P.mo19696c(this.f24249a.f24215k, this.f24249a.f24217l);
                this.f24249a.f24186P.mo19694a(this.f24249a.f24188Q, this.f24249a.f24190R);
            }
            this.f24249a.requestLayout();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSeriesThumbnail$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSeriesThumbnail$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSeriesThumbnail$d.class */
    public class C3940d implements IMediaPlayer.OnPreparedListener {

        /* renamed from: a */
        public final NSTIJKPlayerSeriesThumbnail f24250a;

        public C3940d(NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail) {
            this.f24250a = nSTIJKPlayerSeriesThumbnail;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            this.f24250a.f24194T = System.currentTimeMillis();
            this.f24250a.f24207g = 2;
            if (this.f24250a.f24229r != null) {
                this.f24250a.f24229r.onPrepared(this.f24250a.f24213j);
            }
            if (this.f24250a.f24225p != null) {
                this.f24250a.f24225p.setEnabled(true);
            }
            this.f24250a.f24215k = iMediaPlayer.getVideoWidth();
            this.f24250a.f24217l = iMediaPlayer.getVideoHeight();
            int i10 = this.f24250a.f24237v;
            if (i10 != 0) {
                this.f24250a.seekTo(i10);
            }
            if (this.f24250a.f24215k == 0 || this.f24250a.f24217l == 0) {
                if (this.f24250a.f24209h == 3) {
                    this.f24250a.start();
                    return;
                }
                return;
            }
            if (this.f24250a.f24186P != null) {
                this.f24250a.f24186P.mo19696c(this.f24250a.f24215k, this.f24250a.f24217l);
                this.f24250a.f24186P.mo19694a(this.f24250a.f24188Q, this.f24250a.f24190R);
                if (!this.f24250a.f24186P.mo19697d() || (this.f24250a.f24219m == this.f24250a.f24215k && this.f24250a.f24221n == this.f24250a.f24217l)) {
                    if (this.f24250a.f24209h == 3) {
                        this.f24250a.start();
                        if (this.f24250a.f24225p != null) {
                            this.f24250a.f24225p.show();
                            return;
                        }
                        return;
                    }
                    if (this.f24250a.isPlaying()) {
                        return;
                    }
                    if ((i10 != 0 || this.f24250a.getCurrentPosition() > 0) && this.f24250a.f24225p != null) {
                        this.f24250a.f24225p.show(0);
                    }
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSeriesThumbnail$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSeriesThumbnail$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSeriesThumbnail$e.class */
    public class C3941e implements IMediaPlayer.OnCompletionListener {

        /* renamed from: a */
        public final NSTIJKPlayerSeriesThumbnail f24251a;

        public C3941e(NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail) {
            this.f24251a = nSTIJKPlayerSeriesThumbnail;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            this.f24251a.f24207g = 5;
            this.f24251a.f24209h = 5;
            if (this.f24251a.f24225p != null) {
                this.f24251a.f24225p.m33655d();
            }
            this.f24251a.m19258c0(-1);
            if (this.f24251a.f24227q != null) {
                this.f24251a.f24227q.onCompletion(this.f24251a.f24213j);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSeriesThumbnail$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSeriesThumbnail$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSeriesThumbnail$f.class */
    public class C3942f implements IMediaPlayer.OnInfoListener {

        /* renamed from: a */
        public final NSTIJKPlayerSeriesThumbnail f24252a;

        public C3942f(NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail) {
            this.f24252a = nSTIJKPlayerSeriesThumbnail;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i10, int i11) {
            String str;
            String str2;
            if (this.f24252a.f24235u != null) {
                this.f24252a.f24235u.onInfo(iMediaPlayer, i10, i11);
            }
            if (i10 == 3) {
                this.f24252a.m19258c0(2);
                str = this.f24252a.f24201b;
                str2 = "MEDIA_INFO_VIDEO_RENDERING_START:";
            } else if (i10 == 10005) {
                this.f24252a.m19258c0(1);
                str = this.f24252a.f24201b;
                str2 = "MEDIA_INFO_OPEN_INPUT:";
            } else if (i10 == 901) {
                str = this.f24252a.f24201b;
                str2 = "MEDIA_INFO_UNSUPPORTED_SUBTITLE:";
            } else if (i10 == 902) {
                str = this.f24252a.f24201b;
                str2 = "MEDIA_INFO_SUBTITLE_TIMED_OUT:";
            } else {
                if (i10 == 10001) {
                    this.f24252a.f24223o = i11;
                    Log.d(this.f24252a.f24201b, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i11);
                    if (this.f24252a.f24186P == null) {
                        return true;
                    }
                    this.f24252a.f24186P.setVideoRotation(i11);
                    return true;
                }
                if (i10 != 10002) {
                    switch (i10) {
                        case 700:
                            str = this.f24252a.f24201b;
                            str2 = "MEDIA_INFO_VIDEO_TRACK_LAGGING:";
                            break;
                        case IMediaPlayer.MEDIA_INFO_BUFFERING_START /* 701 */:
                            this.f24252a.m19258c0(1);
                            str = this.f24252a.f24201b;
                            str2 = "MEDIA_INFO_BUFFERING_START:";
                            break;
                        case IMediaPlayer.MEDIA_INFO_BUFFERING_END /* 702 */:
                            this.f24252a.m19258c0(6);
                            str = this.f24252a.f24201b;
                            str2 = "MEDIA_INFO_BUFFERING_END:";
                            break;
                        case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                            str = this.f24252a.f24201b;
                            str2 = "MEDIA_INFO_NETWORK_BANDWIDTH: " + i11;
                            break;
                        default:
                            switch (i10) {
                                case 800:
                                    str = this.f24252a.f24201b;
                                    str2 = "MEDIA_INFO_BAD_INTERLEAVING:";
                                    break;
                                case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                    str = this.f24252a.f24201b;
                                    str2 = "MEDIA_INFO_NOT_SEEKABLE:";
                                    break;
                                case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                    str = this.f24252a.f24201b;
                                    str2 = "MEDIA_INFO_METADATA_UPDATE:";
                                    break;
                                default:
                                    return true;
                            }
                    }
                } else {
                    str = this.f24252a.f24201b;
                    str2 = "MEDIA_INFO_AUDIO_RENDERING_START:";
                }
            }
            Log.d(str, str2);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSeriesThumbnail$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSeriesThumbnail$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSeriesThumbnail$g.class */
    public class C3943g implements IMediaPlayer.OnErrorListener {

        /* renamed from: a */
        public final NSTIJKPlayerSeriesThumbnail f24253a;

        public C3943g(NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail) {
            this.f24253a = nSTIJKPlayerSeriesThumbnail;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i10, int i11) {
            Log.d(this.f24253a.f24201b, "Error: " + i10 + "," + i11);
            this.f24253a.f24207g = -1;
            this.f24253a.f24209h = -1;
            if (this.f24253a.f24225p != null) {
                this.f24253a.f24225p.m33655d();
            }
            this.f24253a.m19258c0(-1);
            if (this.f24253a.f24233t == null) {
                return true;
            }
            this.f24253a.f24233t.onError(this.f24253a.f24213j, i10, i11);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSeriesThumbnail$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSeriesThumbnail$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSeriesThumbnail$h.class */
    public class C3944h implements IMediaPlayer.OnBufferingUpdateListener {

        /* renamed from: a */
        public final NSTIJKPlayerSeriesThumbnail f24254a;

        public C3944h(NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail) {
            this.f24254a = nSTIJKPlayerSeriesThumbnail;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i10) {
            this.f24254a.f24231s = i10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSeriesThumbnail$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSeriesThumbnail$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSeriesThumbnail$i.class */
    public class C3945i implements IMediaPlayer.OnSeekCompleteListener {

        /* renamed from: a */
        public final NSTIJKPlayerSeriesThumbnail f24255a;

        public C3945i(NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail) {
            this.f24255a = nSTIJKPlayerSeriesThumbnail;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            this.f24255a.f24198V = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSeriesThumbnail$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSeriesThumbnail$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSeriesThumbnail$j.class */
    public class C3946j implements IMediaPlayer.OnTimedTextListener {

        /* renamed from: a */
        public final NSTIJKPlayerSeriesThumbnail f24256a;

        public C3946j(NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail) {
            this.f24256a = nSTIJKPlayerSeriesThumbnail;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnTimedTextListener
        public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            if (ijkTimedText != null) {
                this.f24256a.f24200W.setText(ijkTimedText.getText().replace("{\\b1}", "").replace("{\\b0}", "").replace("{\\i1}", "").replace("{\\i0}", ""));
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSeriesThumbnail$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSeriesThumbnail$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSeriesThumbnail$k.class */
    public class C3947k {

        /* renamed from: a */
        public final Activity f24257a;

        /* renamed from: b */
        public View f24258b;

        /* renamed from: c */
        public final NSTIJKPlayerSeriesThumbnail f24259c;

        public C3947k(NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail, Activity activity) {
            this.f24259c = nSTIJKPlayerSeriesThumbnail;
            this.f24257a = activity;
        }

        /* renamed from: a */
        public C3947k m19262a() {
            View view = this.f24258b;
            if (view != null) {
                view.setVisibility(8);
            }
            return this;
        }

        /* renamed from: b */
        public C3947k m19263b(int i10) {
            this.f24258b = this.f24257a.findViewById(i10);
            return this;
        }

        /* renamed from: c */
        public C3947k m19264c() {
            View view = this.f24258b;
            if (view != null) {
                view.setVisibility(4);
            }
            return this;
        }

        /* renamed from: d */
        public C3947k m19265d() {
            View view = this.f24258b;
            if (view != null) {
                view.requestFocus();
            }
            return this;
        }

        /* renamed from: e */
        public C3947k m19266e(CharSequence charSequence) {
            View view = this.f24258b;
            if (view != null && (view instanceof TextView)) {
                ((TextView) view).setText(charSequence);
            }
            return this;
        }

        /* renamed from: f */
        public C3947k m19267f(int i10) {
            View view = this.f24258b;
            if (view != null) {
                view.setVisibility(i10);
            }
            return this;
        }

        /* renamed from: g */
        public C3947k m19268g() {
            View view = this.f24258b;
            if (view != null) {
                view.setVisibility(0);
            }
            return this;
        }
    }

    public NSTIJKPlayerSeriesThumbnail(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24201b = "NSTIJKPlayerEPG";
        this.f24205f = 0;
        this.f24207g = 0;
        this.f24209h = 0;
        this.f24211i = null;
        this.f24213j = null;
        this.f24239w = true;
        this.f24241x = true;
        this.f24243y = true;
        this.f24245z = -1;
        this.f24156A = -1L;
        this.f24160C = false;
        this.f24162D = 7000;
        this.f24168G = 0;
        this.f24172I = 0;
        this.f24174J = 5;
        this.f24176K = false;
        this.f24192S = 0L;
        this.f24194T = 0L;
        this.f24196U = 0L;
        this.f24198V = 0L;
        this.f24214j0 = -1.0f;
        Boolean bool = Boolean.FALSE;
        this.f24220m0 = bool;
        this.f24222n0 = bool;
        this.f24224o0 = bool;
        this.f24226p0 = bool;
        this.f24228q0 = bool;
        this.f24230r0 = bool;
        this.f24167F0 = 0;
        this.f24169G0 = new HandlerC3938b(this, Looper.getMainLooper());
        this.f24171H0 = new C3939c(this);
        this.f24173I0 = new C3940d(this);
        this.f24175J0 = new C3941e(this);
        this.f24177K0 = new C3942f(this);
        this.f24179L0 = new C3943g(this);
        this.f24181M0 = new C3944h(this);
        this.f24183N0 = new C3945i(this);
        this.f24185O0 = new C3946j(this);
        this.f24187P0 = new C3937a(this);
        this.f24189Q0 = 4;
        this.f24191R0 = f24155W0[0];
        this.f24193S0 = new ArrayList();
        this.f24195T0 = 0;
        this.f24197U0 = 0;
        this.f24199V0 = false;
        m19246Q(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.view.View] */
    /* renamed from: G */
    public final void m19236G() {
        InterfaceC7706b interfaceC7706b;
        if (this.f24213j == null || (interfaceC7706b = this.f24225p) == null) {
            return;
        }
        interfaceC7706b.m33654c(this);
        this.f24225p.m33653b(getParent() instanceof View ? (View) getParent() : this);
        this.f24225p.setEnabled(m19248S());
    }

    /* renamed from: H */
    public final void m19237H(IMediaPlayer iMediaPlayer, InterfaceC4042a.b bVar) {
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
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tv.danmaku.ijk.media.player.IMediaPlayer m19238I(int r7) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSeriesThumbnail.m19238I(int):tv.danmaku.ijk.media.player.IMediaPlayer");
    }

    /* renamed from: J */
    public void m19239J(int i10) {
        C7709e.m33681b(this.f24213j, i10);
    }

    /* renamed from: K */
    public void m19240K() {
        ServiceC6971a.m31982d(this.f24213j);
    }

    /* renamed from: L */
    public void m19241L(boolean z10) {
        if (z10 || this.f24158B) {
            m19257b0(false);
            this.f24218l0.m19263b(2131427532).m19262a();
            this.f24218l0.m19263b(2131427785).m19262a();
            this.f24218l0.m19263b(2131427506).m19264c();
            this.f24218l0.m19263b(2131428499).m19262a();
            this.f24158B = false;
            m19243N();
        }
    }

    /* renamed from: M */
    public void m19242M(NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail, LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, LinearLayout linearLayout3, LinearLayout linearLayout4, ProgressBar progressBar, int i10) {
        this.f24244y0 = nSTIJKPlayerSeriesThumbnail;
        this.f24246z0 = linearLayout;
        this.f24157A0 = linearLayout2;
        this.f24159B0 = imageView;
        this.f24161C0 = linearLayout3;
        this.f24163D0 = linearLayout4;
        this.f24165E0 = progressBar;
        this.f24167F0 = i10;
    }

    /* renamed from: N */
    public void m19243N() {
        this.f24218l0.m19263b(2131427532).m19262a();
        this.f24218l0.m19263b(2131427785).m19262a();
        this.f24218l0.m19263b(2131428499).m19262a();
        this.f24158B = false;
        this.f24164E.removeCallbacksAndMessages(null);
        if (C5251a.f30048k.booleanValue()) {
            this.f24218l0.m19263b(2131429693).m19268g();
        }
    }

    /* renamed from: O */
    public final void m19244O() {
        boolean m31278p = this.f24184O.m31278p();
        this.f24199V0 = m31278p;
        if (m31278p) {
            ServiceC6971a.m31980b(getContext());
            this.f24213j = ServiceC6971a.m31979a();
        }
    }

    /* renamed from: P */
    public final void m19245P() {
        this.f24193S0.clear();
        if (this.f24184O.m31281s()) {
            this.f24193S0.add(1);
        }
        if (this.f24184O.m31282t()) {
            this.f24193S0.add(2);
        }
        if (this.f24184O.m31280r()) {
            this.f24193S0.add(0);
        }
        if (this.f24193S0.isEmpty()) {
            this.f24193S0.add(1);
        }
        int intValue = this.f24193S0.get(this.f24195T0).intValue();
        this.f24197U0 = intValue;
        setRender(intValue);
    }

    /* renamed from: Q */
    public final void m19246Q(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f24182N = applicationContext;
        this.f24184O = new C6783a(applicationContext);
        m19244O();
        m19245P();
        this.f24215k = 0;
        this.f24217l = 0;
        this.f24207g = 0;
        this.f24209h = 0;
        TextView textView = new TextView(context);
        this.f24200W = textView;
        textView.setTextSize(24.0f);
        this.f24200W.setTextColor(context.getResources().getColor(2131100158));
        this.f24200W.setGravity(17);
        addView(this.f24200W, new FrameLayout.LayoutParams(-1, -2, 80));
    }

    /* renamed from: R */
    public boolean m19247R() {
        return this.f24199V0;
    }

    /* renamed from: S */
    public final boolean m19248S() {
        int i10;
        boolean z10 = true;
        if (this.f24213j == null || (i10 = this.f24207g) == -1 || i10 == 0 || i10 == 1) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: T */
    public void m19249T() {
        IMediaPlayer iMediaPlayer = this.f24213j;
        if (iMediaPlayer != null) {
            iMediaPlayer.setVolume(0.0f, 0.0f);
        }
    }

    @TargetApi(23)
    /* renamed from: U */
    public void m19250U() {
        IMediaPlayer.OnErrorListener onErrorListener;
        IMediaPlayer iMediaPlayer;
        if (this.f24202c == null || this.f24211i == null) {
            return;
        }
        m19251V(false);
        try {
            ((AudioManager) this.f24182N.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        } catch (Exception e10) {
        }
        try {
            try {
                try {
                    this.f24213j = m19238I(this.f24184O.m31285w());
                    getContext();
                    this.f24213j.setOnPreparedListener(this.f24173I0);
                    this.f24213j.setOnVideoSizeChangedListener(this.f24171H0);
                    this.f24213j.setOnCompletionListener(this.f24175J0);
                    this.f24213j.setOnErrorListener(this.f24179L0);
                    this.f24213j.setOnInfoListener(this.f24177K0);
                    this.f24213j.setOnBufferingUpdateListener(this.f24181M0);
                    this.f24213j.setOnSeekCompleteListener(this.f24183N0);
                    this.f24213j.setOnTimedTextListener(this.f24185O0);
                    this.f24231s = 0;
                    String scheme = this.f24202c.getScheme();
                    if (Build.VERSION.SDK_INT >= 23 && this.f24184O.m31246E() && (TextUtils.isEmpty(scheme) || scheme.equalsIgnoreCase(TransferTable.COLUMN_FILE))) {
                        this.f24213j.setDataSource(new C7705a(new File(this.f24202c.toString())));
                    } else {
                        this.f24213j.setDataSource(this.f24182N, this.f24202c, this.f24204e);
                    }
                    m19237H(this.f24213j, this.f24211i);
                    this.f24213j.setAudioStreamType(3);
                    this.f24213j.setScreenOnWhilePlaying(true);
                    this.f24192S = System.currentTimeMillis();
                    this.f24213j.prepareAsync();
                    this.f24216k0 = this.f24206f0.getResources().getDisplayMetrics().widthPixels;
                    AudioManager audioManager = (AudioManager) this.f24206f0.getSystemService("audio");
                    this.f24210h0 = audioManager;
                    this.f24212i0 = audioManager.getStreamMaxVolume(3);
                    m19249T();
                    this.f24207g = 1;
                } catch (IOException e11) {
                    Log.w(this.f24201b, "Unable to open content: " + this.f24202c, e11);
                    this.f24207g = -1;
                    this.f24209h = -1;
                    onErrorListener = this.f24179L0;
                    iMediaPlayer = this.f24213j;
                    onErrorListener.onError(iMediaPlayer, 1, 0);
                } catch (Exception e12) {
                    Log.w(this.f24201b, "Unable to open content: " + this.f24202c, e12);
                    this.f24207g = -1;
                    this.f24209h = -1;
                    onErrorListener = this.f24179L0;
                    iMediaPlayer = this.f24213j;
                    onErrorListener.onError(iMediaPlayer, 1, 0);
                }
            } catch (NullPointerException e13) {
                Log.w(this.f24201b, "Unable to open content: " + this.f24202c, e13);
                this.f24207g = -1;
                this.f24209h = -1;
                onErrorListener = this.f24179L0;
                iMediaPlayer = this.f24213j;
                onErrorListener.onError(iMediaPlayer, 1, 0);
            }
        } catch (IllegalArgumentException e14) {
            Log.w(this.f24201b, "Unable to open content: " + this.f24202c, e14);
            this.f24207g = -1;
            this.f24209h = -1;
            onErrorListener = this.f24179L0;
            iMediaPlayer = this.f24213j;
            onErrorListener.onError(iMediaPlayer, 1, 0);
        }
    }

    /* renamed from: V */
    public void m19251V(boolean z10) {
        IMediaPlayer iMediaPlayer = this.f24213j;
        if (iMediaPlayer != null) {
            iMediaPlayer.reset();
            this.f24213j.release();
            this.f24213j = null;
            this.f24207g = 0;
            if (z10) {
                this.f24209h = 0;
            }
            ((AudioManager) this.f24182N.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    /* renamed from: W */
    public void m19252W() {
        IMediaPlayer iMediaPlayer = this.f24213j;
        if (iMediaPlayer != null) {
            iMediaPlayer.setDisplay(null);
        }
    }

    /* renamed from: X */
    public void m19253X(int i10) {
        C7709e.m33684e(this.f24213j, i10);
    }

    /* renamed from: Y */
    public void m19254Y(Activity activity, NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail) {
        this.f24206f0 = activity;
        this.f24208g0 = nSTIJKPlayerSeriesThumbnail;
        this.f24164E = new Handler();
        this.f24166F = new Handler();
        this.f24218l0 = new C3947k(this, activity);
    }

    /* renamed from: Z */
    public final void m19255Z(Uri uri, Map<String, String> map, boolean z10, String str) {
        this.f24202c = uri;
        this.f24203d = str;
        this.f24204e = map;
        this.f24237v = 0;
        this.f24170H = z10;
        m19260e0();
        m19250U();
        requestLayout();
        invalidate();
    }

    /* renamed from: a0 */
    public void m19256a0(Uri uri, boolean z10, String str) {
        m19255Z(uri, null, z10, str);
    }

    /* renamed from: b0 */
    public void m19257b0(boolean z10) {
        this.f24218l0.m19263b(2131427490).m19267f(z10 ? 0 : 8);
        this.f24218l0.m19263b(2131427494).m19267f(z10 ? 0 : 8);
        this.f24218l0.m19263b(2131427515).m19267f(z10 ? 0 : 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x024f, code lost:
    
        if (r0 != (-1)) goto L62;
     */
    /* renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m19258c0(int r5) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSeriesThumbnail.m19258c0(int):void");
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.f24239w;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.f24241x;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.f24243y;
    }

    /* renamed from: d0 */
    public void m19259d0() {
        ServiceC6971a.m31982d(null);
    }

    /* renamed from: e0 */
    public void m19260e0() {
        IMediaPlayer iMediaPlayer = this.f24213j;
        if (iMediaPlayer != null) {
            iMediaPlayer.stop();
            this.f24213j.release();
            this.f24213j = null;
            this.f24207g = 0;
            this.f24209h = 0;
            ((AudioManager) this.f24182N.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    /* renamed from: f0 */
    public final void m19261f0() {
        if (this.f24225p.m33652a()) {
            this.f24225p.m33655d();
        } else {
            this.f24225p.show();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f24213j != null) {
            return this.f24231s;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (m19248S()) {
            return (int) this.f24213j.getCurrentPosition();
        }
        return 0;
    }

    public int getCurrentWindowIndex() {
        return this.f24168G;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (m19248S()) {
            return (int) this.f24213j.getDuration();
        }
        return -1;
    }

    public Boolean getFullScreenValue() {
        return Boolean.valueOf(this.f24170H);
    }

    public ITrackInfo[] getTrackInfo() {
        IMediaPlayer iMediaPlayer = this.f24213j;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.getTrackInfo();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        IMediaPlayer iMediaPlayer;
        return m19248S() && (iMediaPlayer = this.f24213j) != null && iMediaPlayer.isPlaying();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10 = (i10 == 4 || i10 == 24 || i10 == 25 || i10 == 164 || i10 == 82 || i10 == 5 || i10 == 6) ? false : true;
        if (m19248S() && z10 && this.f24225p != null) {
            if (i10 == 79 || i10 == 85) {
                IMediaPlayer iMediaPlayer = this.f24213j;
                if (iMediaPlayer == null || !iMediaPlayer.isPlaying()) {
                    start();
                    this.f24225p.m33655d();
                    return true;
                }
                pause();
                this.f24225p.show();
                return true;
            }
            if (i10 == 126) {
                IMediaPlayer iMediaPlayer2 = this.f24213j;
                if (iMediaPlayer2 == null || iMediaPlayer2.isPlaying()) {
                    return true;
                }
                start();
                this.f24225p.m33655d();
                return true;
            }
            if (i10 == 86 || i10 == 127) {
                IMediaPlayer iMediaPlayer3 = this.f24213j;
                if (iMediaPlayer3 == null || !iMediaPlayer3.isPlaying()) {
                    return true;
                }
                pause();
                this.f24225p.show();
                return true;
            }
            m19261f0();
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        IMediaPlayer iMediaPlayer;
        if (m19248S() && (iMediaPlayer = this.f24213j) != null && iMediaPlayer.isPlaying()) {
            this.f24213j.pause();
            this.f24207g = 4;
        }
        this.f24209h = 4;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i10) {
        int i11 = i10;
        if (m19248S()) {
            this.f24196U = System.currentTimeMillis();
            this.f24213j.seekTo(i10);
            i11 = 0;
        }
        this.f24237v = i11;
    }

    public void setContext(Context context) {
        this.f24242x0 = context;
    }

    public void setCurrentWindowIndex(int i10) {
        this.f24168G = i10;
    }

    public void setHudView(TableLayout tableLayout) {
    }

    public void setLiveStreamDBHandler(LiveStreamDBHandler liveStreamDBHandler) {
        this.f24240w0 = liveStreamDBHandler;
    }

    public void setMediaController(InterfaceC7706b interfaceC7706b) {
        InterfaceC7706b interfaceC7706b2 = this.f24225p;
        if (interfaceC7706b2 != null) {
            interfaceC7706b2.m33655d();
        }
        this.f24225p = interfaceC7706b;
        m19236G();
    }

    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.f24227q = onCompletionListener;
    }

    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        this.f24233t = onErrorListener;
    }

    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.f24235u = onInfoListener;
    }

    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.f24229r = onPreparedListener;
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
                Log.e(this.f24201b, String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i10)));
                return;
            }
            C4044c c4044c = new C4044c(getContext());
            c4043b = c4044c;
            if (this.f24213j != null) {
                c4044c.getSurfaceHolder().mo19700b(this.f24213j);
                c4044c.mo19696c(this.f24213j.getVideoWidth(), this.f24213j.getVideoHeight());
                c4044c.mo19694a(this.f24213j.getVideoSarNum(), this.f24213j.getVideoSarDen());
                c4044c.setAspectRatio(this.f24191R0);
                c4043b = c4044c;
            }
        }
        setRenderView(c4043b);
    }

    public void setRenderView(InterfaceC4042a interfaceC4042a) {
        int i10;
        int i11;
        if (this.f24186P != null) {
            IMediaPlayer iMediaPlayer = this.f24213j;
            if (iMediaPlayer != null) {
                iMediaPlayer.setDisplay(null);
            }
            View view = this.f24186P.getView();
            this.f24186P.mo19695b(this.f24187P0);
            this.f24186P = null;
            removeView(view);
        }
        if (interfaceC4042a == null) {
            return;
        }
        this.f24186P = interfaceC4042a;
        SharedPreferences sharedPreferences = this.f24182N.getSharedPreferences("loginPrefs", 0);
        this.f24178L = sharedPreferences;
        int i12 = sharedPreferences.getInt("aspect_ratio", 4);
        this.f24189Q0 = i12;
        interfaceC4042a.setAspectRatio(i12);
        int i13 = this.f24215k;
        if (i13 > 0 && (i11 = this.f24217l) > 0) {
            interfaceC4042a.mo19696c(i13, i11);
        }
        int i14 = this.f24188Q;
        if (i14 > 0 && (i10 = this.f24190R) > 0) {
            interfaceC4042a.mo19694a(i14, i10);
        }
        View view2 = this.f24186P.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(view2);
        this.f24186P.mo19698e(this.f24187P0);
        this.f24186P.setVideoRotation(this.f24223o);
    }

    public void setTitle(CharSequence charSequence) {
        this.f24218l0.m19263b(2131427528).m19266e(charSequence);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (m19248S()) {
            this.f24213j.start();
            this.f24207g = 3;
        }
        this.f24209h = 3;
    }
}

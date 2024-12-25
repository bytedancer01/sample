package com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.MediaController;
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
import p151if.C5255e;
import p250of.ServiceC6971a;
import p440z8.C10105q;
import pf.C7705a;
import pf.InterfaceC7706b;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti2.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti2.class */
public class NSTIJKPlayerMulti2 extends FrameLayout implements MediaController.MediaPlayerControl {

    /* renamed from: A */
    public int f23966A;

    /* renamed from: B */
    public int f23967B;

    /* renamed from: C */
    public boolean f23968C;

    /* renamed from: D */
    public SharedPreferences f23969D;

    /* renamed from: E */
    public SharedPreferences f23970E;

    /* renamed from: F */
    public Context f23971F;

    /* renamed from: G */
    public C6783a f23972G;

    /* renamed from: H */
    public InterfaceC4042a f23973H;

    /* renamed from: I */
    public int f23974I;

    /* renamed from: J */
    public int f23975J;

    /* renamed from: K */
    public Activity f23976K;

    /* renamed from: L */
    public NSTIJKPlayerMulti2 f23977L;

    /* renamed from: M */
    public AudioManager f23978M;

    /* renamed from: N */
    public C3918i f23979N;

    /* renamed from: O */
    public LiveStreamDBHandler f23980O;

    /* renamed from: P */
    public Context f23981P;

    /* renamed from: Q */
    public IMediaPlayer.OnVideoSizeChangedListener f23982Q;

    /* renamed from: R */
    public IMediaPlayer.OnPreparedListener f23983R;

    /* renamed from: S */
    public IMediaPlayer.OnCompletionListener f23984S;

    /* renamed from: T */
    public IMediaPlayer.OnInfoListener f23985T;

    /* renamed from: U */
    public IMediaPlayer.OnErrorListener f23986U;

    /* renamed from: V */
    public IMediaPlayer.OnBufferingUpdateListener f23987V;

    /* renamed from: W */
    public InterfaceC4042a.a f23988W;

    /* renamed from: b */
    public String f23989b;

    /* renamed from: c */
    public Uri f23990c;

    /* renamed from: d */
    public Map<String, String> f23991d;

    /* renamed from: e */
    public int f23992e;

    /* renamed from: f */
    public int f23993f;

    /* renamed from: f0 */
    public List<Integer> f23994f0;

    /* renamed from: g */
    public int f23995g;

    /* renamed from: g0 */
    public int f23996g0;

    /* renamed from: h */
    public InterfaceC4042a.b f23997h;

    /* renamed from: h0 */
    public int f23998h0;

    /* renamed from: i */
    public IMediaPlayer f23999i;

    /* renamed from: i0 */
    public boolean f24000i0;

    /* renamed from: j */
    public int f24001j;

    /* renamed from: k */
    public int f24002k;

    /* renamed from: l */
    public int f24003l;

    /* renamed from: m */
    public int f24004m;

    /* renamed from: n */
    public int f24005n;

    /* renamed from: o */
    public InterfaceC7706b f24006o;

    /* renamed from: p */
    public IMediaPlayer.OnCompletionListener f24007p;

    /* renamed from: q */
    public IMediaPlayer.OnPreparedListener f24008q;

    /* renamed from: r */
    public int f24009r;

    /* renamed from: s */
    public IMediaPlayer.OnErrorListener f24010s;

    /* renamed from: t */
    public IMediaPlayer.OnInfoListener f24011t;

    /* renamed from: u */
    public int f24012u;

    /* renamed from: v */
    public boolean f24013v;

    /* renamed from: w */
    public boolean f24014w;

    /* renamed from: x */
    public boolean f24015x;

    /* renamed from: y */
    public Handler f24016y;

    /* renamed from: z */
    public boolean f24017z;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti2$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti2$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti2$a.class */
    public class RunnableC3910a implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerMulti2 f24018b;

        public RunnableC3910a(NSTIJKPlayerMulti2 nSTIJKPlayerMulti2) {
            this.f24018b = nSTIJKPlayerMulti2;
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerMulti2 nSTIJKPlayerMulti2 = this.f24018b;
            nSTIJKPlayerMulti2.f23966A++;
            nSTIJKPlayerMulti2.m19057K();
            C5255e.m26241k0(this.f24018b.f23976K, this.f24018b.f23976K.getResources().getString(2132018322) + " (" + this.f24018b.f23966A + "/" + this.f24018b.f23967B + ")");
            this.f24018b.m19065S();
            this.f24018b.start();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti2$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti2$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti2$b.class */
    public class C3911b implements IMediaPlayer.OnVideoSizeChangedListener {

        /* renamed from: a */
        public final NSTIJKPlayerMulti2 f24019a;

        public C3911b(NSTIJKPlayerMulti2 nSTIJKPlayerMulti2) {
            this.f24019a = nSTIJKPlayerMulti2;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i10, int i11, int i12, int i13) {
            this.f24019a.f24001j = iMediaPlayer.getVideoWidth();
            this.f24019a.f24002k = iMediaPlayer.getVideoHeight();
            this.f24019a.f23974I = iMediaPlayer.getVideoSarNum();
            this.f24019a.f23975J = iMediaPlayer.getVideoSarDen();
            if (this.f24019a.f24001j == 0 || this.f24019a.f24002k == 0) {
                return;
            }
            if (this.f24019a.f23973H != null) {
                this.f24019a.f23973H.mo19696c(this.f24019a.f24001j, this.f24019a.f24002k);
                this.f24019a.f23973H.mo19694a(this.f24019a.f23974I, this.f24019a.f23975J);
            }
            this.f24019a.requestLayout();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti2$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti2$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti2$c.class */
    public class C3912c implements IMediaPlayer.OnPreparedListener {

        /* renamed from: a */
        public final NSTIJKPlayerMulti2 f24020a;

        public C3912c(NSTIJKPlayerMulti2 nSTIJKPlayerMulti2) {
            this.f24020a = nSTIJKPlayerMulti2;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            this.f24020a.f23993f = 2;
            if (this.f24020a.f24008q != null) {
                this.f24020a.f24008q.onPrepared(this.f24020a.f23999i);
            }
            if (this.f24020a.f24006o != null) {
                this.f24020a.f24006o.setEnabled(true);
            }
            this.f24020a.f24001j = iMediaPlayer.getVideoWidth();
            this.f24020a.f24002k = iMediaPlayer.getVideoHeight();
            if (this.f24020a.f24001j == 0 || this.f24020a.f24002k == 0) {
                if (this.f24020a.f23995g == 3) {
                    this.f24020a.start();
                }
            } else if (this.f24020a.f23973H != null) {
                this.f24020a.f23973H.mo19696c(this.f24020a.f24001j, this.f24020a.f24002k);
                this.f24020a.f23973H.mo19694a(this.f24020a.f23974I, this.f24020a.f23975J);
                if ((!this.f24020a.f23973H.mo19697d() || (this.f24020a.f24003l == this.f24020a.f24001j && this.f24020a.f24004m == this.f24020a.f24002k)) && this.f24020a.f23995g == 3) {
                    this.f24020a.start();
                    if (this.f24020a.f24006o != null) {
                        this.f24020a.f24006o.show();
                    }
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti2$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti2$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti2$d.class */
    public class C3913d implements IMediaPlayer.OnCompletionListener {

        /* renamed from: a */
        public final NSTIJKPlayerMulti2 f24021a;

        public C3913d(NSTIJKPlayerMulti2 nSTIJKPlayerMulti2) {
            this.f24021a = nSTIJKPlayerMulti2;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            this.f24021a.f23993f = 5;
            this.f24021a.f23995g = 5;
            if (this.f24021a.f24006o != null) {
                this.f24021a.f24006o.m33655d();
            }
            this.f24021a.m19073a0(-1);
            if (this.f24021a.f24007p != null) {
                this.f24021a.f24007p.onCompletion(this.f24021a.f23999i);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti2$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti2$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti2$e.class */
    public class C3914e implements IMediaPlayer.OnInfoListener {

        /* renamed from: a */
        public final NSTIJKPlayerMulti2 f24022a;

        public C3914e(NSTIJKPlayerMulti2 nSTIJKPlayerMulti2) {
            this.f24022a = nSTIJKPlayerMulti2;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i10, int i11) {
            String str;
            String str2;
            if (this.f24022a.f24011t != null) {
                this.f24022a.f24011t.onInfo(iMediaPlayer, i10, i11);
            }
            if (i10 == 3) {
                this.f24022a.m19073a0(2);
                str = this.f24022a.f23989b;
                str2 = "MEDIA_INFO_VIDEO_RENDERING_START:";
            } else if (i10 == 10005) {
                this.f24022a.m19073a0(1);
                str = this.f24022a.f23989b;
                str2 = "MEDIA_INFO_OPEN_INPUT:";
            } else if (i10 == 901) {
                str = this.f24022a.f23989b;
                str2 = "MEDIA_INFO_UNSUPPORTED_SUBTITLE:";
            } else if (i10 == 902) {
                str = this.f24022a.f23989b;
                str2 = "MEDIA_INFO_SUBTITLE_TIMED_OUT:";
            } else {
                if (i10 == 10001) {
                    this.f24022a.f24005n = i11;
                    Log.d(this.f24022a.f23989b, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i11);
                    if (this.f24022a.f23973H == null) {
                        return true;
                    }
                    this.f24022a.f23973H.setVideoRotation(i11);
                    return true;
                }
                if (i10 != 10002) {
                    switch (i10) {
                        case 700:
                            str = this.f24022a.f23989b;
                            str2 = "MEDIA_INFO_VIDEO_TRACK_LAGGING:";
                            break;
                        case IMediaPlayer.MEDIA_INFO_BUFFERING_START /* 701 */:
                            this.f24022a.m19073a0(1);
                            str = this.f24022a.f23989b;
                            str2 = "MEDIA_INFO_BUFFERING_START:";
                            break;
                        case IMediaPlayer.MEDIA_INFO_BUFFERING_END /* 702 */:
                            this.f24022a.m19073a0(6);
                            str = this.f24022a.f23989b;
                            str2 = "MEDIA_INFO_BUFFERING_END:";
                            break;
                        case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                            str = this.f24022a.f23989b;
                            str2 = "MEDIA_INFO_NETWORK_BANDWIDTH: " + i11;
                            break;
                        default:
                            switch (i10) {
                                case 800:
                                    str = this.f24022a.f23989b;
                                    str2 = "MEDIA_INFO_BAD_INTERLEAVING:";
                                    break;
                                case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                    str = this.f24022a.f23989b;
                                    str2 = "MEDIA_INFO_NOT_SEEKABLE:";
                                    break;
                                case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                    str = this.f24022a.f23989b;
                                    str2 = "MEDIA_INFO_METADATA_UPDATE:";
                                    break;
                                default:
                                    return true;
                            }
                    }
                } else {
                    str = this.f24022a.f23989b;
                    str2 = "MEDIA_INFO_AUDIO_RENDERING_START:";
                }
            }
            Log.d(str, str2);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti2$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti2$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti2$f.class */
    public class C3915f implements IMediaPlayer.OnErrorListener {

        /* renamed from: a */
        public final NSTIJKPlayerMulti2 f24023a;

        public C3915f(NSTIJKPlayerMulti2 nSTIJKPlayerMulti2) {
            this.f24023a = nSTIJKPlayerMulti2;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i10, int i11) {
            Log.d(this.f24023a.f23989b, "Error: " + i10 + "," + i11);
            this.f24023a.f23993f = -1;
            this.f24023a.f23995g = -1;
            if (this.f24023a.f24006o != null) {
                this.f24023a.f24006o.m33655d();
            }
            this.f24023a.m19073a0(-1);
            if (this.f24023a.f24010s == null) {
                return true;
            }
            this.f24023a.f24010s.onError(this.f24023a.f23999i, i10, i11);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti2$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti2$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti2$g.class */
    public class C3916g implements IMediaPlayer.OnBufferingUpdateListener {

        /* renamed from: a */
        public final NSTIJKPlayerMulti2 f24024a;

        public C3916g(NSTIJKPlayerMulti2 nSTIJKPlayerMulti2) {
            this.f24024a = nSTIJKPlayerMulti2;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i10) {
            this.f24024a.f24009r = i10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti2$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti2$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti2$h.class */
    public class C3917h implements InterfaceC4042a.a {

        /* renamed from: a */
        public final NSTIJKPlayerMulti2 f24025a;

        public C3917h(NSTIJKPlayerMulti2 nSTIJKPlayerMulti2) {
            this.f24025a = nSTIJKPlayerMulti2;
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.a
        /* renamed from: a */
        public void mo18794a(InterfaceC4042a.b bVar, int i10, int i11, int i12) {
            if (bVar.mo19699a() != this.f24025a.f23973H) {
                Log.e(this.f24025a.f23989b, "onSurfaceChanged: unmatched render callback\n");
                return;
            }
            this.f24025a.f24003l = i11;
            this.f24025a.f24004m = i12;
            boolean z10 = this.f24025a.f23995g == 3;
            boolean z11 = true;
            if (this.f24025a.f23973H.mo19697d()) {
                z11 = this.f24025a.f24001j == i11 && this.f24025a.f24002k == i12;
            }
            if (this.f24025a.f23999i != null && z10 && z11) {
                if (this.f24025a.f24012u != 0) {
                    NSTIJKPlayerMulti2 nSTIJKPlayerMulti2 = this.f24025a;
                    nSTIJKPlayerMulti2.seekTo(nSTIJKPlayerMulti2.f24012u);
                }
                this.f24025a.start();
            }
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.a
        /* renamed from: b */
        public void mo18795b(InterfaceC4042a.b bVar) {
            if (bVar.mo19699a() != this.f24025a.f23973H) {
                Log.e(this.f24025a.f23989b, "onSurfaceDestroyed: unmatched render callback\n");
            } else {
                this.f24025a.f23997h = null;
                this.f24025a.m19067U();
            }
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.a
        /* renamed from: c */
        public void mo18796c(InterfaceC4042a.b bVar, int i10, int i11) {
            if (bVar.mo19699a() != this.f24025a.f23973H) {
                Log.e(this.f24025a.f23989b, "onSurfaceCreated: unmatched render callback\n");
                return;
            }
            this.f24025a.f23997h = bVar;
            if (this.f24025a.f23999i == null) {
                this.f24025a.m19065S();
            } else {
                NSTIJKPlayerMulti2 nSTIJKPlayerMulti2 = this.f24025a;
                nSTIJKPlayerMulti2.m19054H(nSTIJKPlayerMulti2.f23999i, bVar);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti2$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti2$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti2$i.class */
    public class C3918i {

        /* renamed from: a */
        public final Activity f24026a;

        /* renamed from: b */
        public View f24027b;

        /* renamed from: c */
        public final NSTIJKPlayerMulti2 f24028c;

        public C3918i(NSTIJKPlayerMulti2 nSTIJKPlayerMulti2, Activity activity) {
            this.f24028c = nSTIJKPlayerMulti2;
            this.f24026a = activity;
        }

        /* renamed from: a */
        public C3918i m19077a() {
            View view = this.f24027b;
            if (view != null) {
                view.setVisibility(8);
            }
            return this;
        }

        /* renamed from: b */
        public C3918i m19078b(int i10) {
            this.f24027b = this.f24026a.findViewById(i10);
            return this;
        }

        /* renamed from: c */
        public C3918i m19079c() {
            View view = this.f24027b;
            if (view != null) {
                view.requestFocus();
            }
            return this;
        }

        /* renamed from: d */
        public C3918i m19080d(CharSequence charSequence) {
            View view = this.f24027b;
            if (view != null && (view instanceof TextView)) {
                ((TextView) view).setText(charSequence);
            }
            return this;
        }

        /* renamed from: e */
        public C3918i m19081e() {
            View view = this.f24027b;
            if (view != null) {
                view.setVisibility(0);
            }
            return this;
        }
    }

    public NSTIJKPlayerMulti2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23989b = "NSTIJKPlayerMulti2";
        this.f23992e = 0;
        this.f23993f = 0;
        this.f23995g = 0;
        this.f23997h = null;
        this.f23999i = null;
        this.f24013v = true;
        this.f24014w = true;
        this.f24015x = true;
        this.f23966A = 0;
        this.f23967B = 5;
        this.f23968C = false;
        this.f23982Q = new C3911b(this);
        this.f23983R = new C3912c(this);
        this.f23984S = new C3913d(this);
        this.f23985T = new C3914e(this);
        this.f23986U = new C3915f(this);
        this.f23987V = new C3916g(this);
        this.f23988W = new C3917h(this);
        this.f23994f0 = new ArrayList();
        this.f23996g0 = 0;
        this.f23998h0 = 0;
        this.f24000i0 = false;
        m19061O(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.view.View] */
    /* renamed from: G */
    public final void m19053G() {
        InterfaceC7706b interfaceC7706b;
        if (this.f23999i == null || (interfaceC7706b = this.f24006o) == null) {
            return;
        }
        interfaceC7706b.m33654c(this);
        this.f24006o.m33653b(getParent() instanceof View ? (View) getParent() : this);
        this.f24006o.setEnabled(m19063Q());
    }

    /* renamed from: H */
    public final void m19054H(IMediaPlayer iMediaPlayer, InterfaceC4042a.b bVar) {
        if (iMediaPlayer == null) {
            return;
        }
        if (bVar == null) {
            iMediaPlayer.setDisplay(null);
        } else {
            bVar.mo19700b(iMediaPlayer);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00de  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tv.danmaku.ijk.media.player.IMediaPlayer m19055I(int r7) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti2.m19055I(int):tv.danmaku.ijk.media.player.IMediaPlayer");
    }

    /* renamed from: J */
    public void m19056J() {
        ServiceC6971a.m31982d(this.f23999i);
    }

    /* renamed from: K */
    public final void m19057K() {
        this.f23979N.m19078b(2131427509).m19077a();
        this.f23979N.m19078b(2131427520).m19077a();
        m19058L();
    }

    /* renamed from: L */
    public void m19058L() {
        this.f23979N.m19078b(2131427533).m19077a();
        this.f23979N.m19078b(2131427786).m19077a();
        this.f23979N.m19078b(2131428500).m19077a();
        this.f24016y.removeCallbacksAndMessages(null);
    }

    /* renamed from: M */
    public final void m19059M() {
        boolean m31278p = this.f23972G.m31278p();
        this.f24000i0 = m31278p;
        if (m31278p) {
            ServiceC6971a.m31980b(getContext());
            this.f23999i = ServiceC6971a.m31979a();
        }
    }

    /* renamed from: N */
    public final void m19060N() {
        this.f23994f0.clear();
        if (this.f23972G.m31281s()) {
            this.f23994f0.add(1);
        }
        if (this.f23972G.m31282t()) {
            this.f23994f0.add(2);
        }
        if (this.f23972G.m31280r()) {
            this.f23994f0.add(0);
        }
        if (this.f23994f0.isEmpty()) {
            this.f23994f0.add(1);
        }
        int intValue = this.f23994f0.get(this.f23996g0).intValue();
        this.f23998h0 = intValue;
        setRender(intValue);
    }

    /* renamed from: O */
    public final void m19061O(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f23971F = applicationContext;
        this.f23972G = new C6783a(applicationContext);
        m19059M();
        m19060N();
        this.f24001j = 0;
        this.f24002k = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f23993f = 0;
        this.f23995g = 0;
    }

    /* renamed from: P */
    public boolean m19062P() {
        return this.f24000i0;
    }

    /* renamed from: Q */
    public final boolean m19063Q() {
        int i10;
        boolean z10 = true;
        if (this.f23999i == null || (i10 = this.f23993f) == -1 || i10 == 0 || i10 == 1) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: R */
    public void m19064R() {
        IMediaPlayer iMediaPlayer = this.f23999i;
        if (iMediaPlayer != null) {
            iMediaPlayer.setVolume(0.0f, 0.0f);
        }
    }

    @TargetApi(23)
    /* renamed from: S */
    public void m19065S() {
        IMediaPlayer.OnErrorListener onErrorListener;
        IMediaPlayer iMediaPlayer;
        if (this.f23990c == null || this.f23997h == null) {
            return;
        }
        m19066T(false);
        ((AudioManager) this.f23971F.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        this.f23979N.m19078b(2131427520).m19077a();
        try {
            try {
                try {
                    IMediaPlayer m19055I = m19055I(this.f23972G.m31285w());
                    this.f23999i = m19055I;
                    m19055I.setOnPreparedListener(this.f23983R);
                    this.f23999i.setOnVideoSizeChangedListener(this.f23982Q);
                    this.f23999i.setOnCompletionListener(this.f23984S);
                    this.f23999i.setOnErrorListener(this.f23986U);
                    this.f23999i.setOnInfoListener(this.f23985T);
                    this.f23999i.setOnBufferingUpdateListener(this.f23987V);
                    this.f24009r = 0;
                    String scheme = this.f23990c.getScheme();
                    if (Build.VERSION.SDK_INT >= 23 && this.f23972G.m31246E() && (TextUtils.isEmpty(scheme) || scheme.equalsIgnoreCase(TransferTable.COLUMN_FILE))) {
                        this.f23999i.setDataSource(new C7705a(new File(this.f23990c.toString())));
                    } else {
                        this.f23999i.setDataSource(this.f23971F, this.f23990c, this.f23991d);
                    }
                    m19054H(this.f23999i, this.f23997h);
                    this.f23999i.setAudioStreamType(3);
                    this.f23999i.setScreenOnWhilePlaying(true);
                    this.f23999i.prepareAsync();
                    this.f23978M = (AudioManager) this.f23976K.getSystemService("audio");
                    this.f23993f = 1;
                } catch (IllegalArgumentException e10) {
                    Log.w(this.f23989b, "Unable to open content: " + this.f23990c, e10);
                    this.f23993f = -1;
                    this.f23995g = -1;
                    onErrorListener = this.f23986U;
                    iMediaPlayer = this.f23999i;
                    onErrorListener.onError(iMediaPlayer, 1, 0);
                } catch (NullPointerException e11) {
                    Log.w(this.f23989b, "Unable to open content: " + this.f23990c, e11);
                    this.f23993f = -1;
                    this.f23995g = -1;
                    onErrorListener = this.f23986U;
                    iMediaPlayer = this.f23999i;
                    onErrorListener.onError(iMediaPlayer, 1, 0);
                }
            } catch (IOException e12) {
                Log.w(this.f23989b, "Unable to open content: " + this.f23990c, e12);
                this.f23993f = -1;
                this.f23995g = -1;
                onErrorListener = this.f23986U;
                iMediaPlayer = this.f23999i;
                onErrorListener.onError(iMediaPlayer, 1, 0);
            }
        } catch (Exception e13) {
            Log.w(this.f23989b, "Unable to open content: " + this.f23990c, e13);
            this.f23993f = -1;
            this.f23995g = -1;
            onErrorListener = this.f23986U;
            iMediaPlayer = this.f23999i;
            onErrorListener.onError(iMediaPlayer, 1, 0);
        }
    }

    /* renamed from: T */
    public void m19066T(boolean z10) {
        IMediaPlayer iMediaPlayer = this.f23999i;
        if (iMediaPlayer != null) {
            iMediaPlayer.reset();
            this.f23999i.release();
            this.f23999i = null;
            this.f23993f = 0;
            if (z10) {
                this.f23995g = 0;
            }
            ((AudioManager) this.f23971F.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    /* renamed from: U */
    public void m19067U() {
        IMediaPlayer iMediaPlayer = this.f23999i;
        if (iMediaPlayer != null) {
            iMediaPlayer.setDisplay(null);
        }
    }

    /* renamed from: V */
    public void m19068V() {
        Handler handler = this.f24016y;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: W */
    public void m19069W(Activity activity, NSTIJKPlayerMulti2 nSTIJKPlayerMulti2) {
        this.f23976K = activity;
        this.f23977L = nSTIJKPlayerMulti2;
        this.f24016y = new Handler();
        this.f23979N = new C3918i(this, activity);
    }

    /* renamed from: X */
    public final void m19070X(Uri uri, Map<String, String> map, boolean z10, String str) {
        this.f23990c = uri;
        this.f23991d = map;
        this.f24012u = 0;
        this.f24017z = z10;
        m19075c0();
        m19065S();
        requestLayout();
        invalidate();
    }

    /* renamed from: Y */
    public void m19071Y(Uri uri, boolean z10, String str) {
        m19070X(uri, null, z10, str);
    }

    /* renamed from: Z */
    public final void m19072Z(String str) {
        this.f23979N.m19078b(2131429676).m19077a();
        this.f23979N.m19078b(2131427520).m19081e();
        this.f23979N.m19078b(2131427524).m19080d(str);
    }

    /* renamed from: a0 */
    public final void m19073a0(int i10) {
        this.f23992e = i10;
        if (i10 == -1) {
            if (this.f23966A < this.f23967B) {
                this.f23968C = true;
                this.f24016y.postDelayed(new RunnableC3910a(this), 3000L);
                return;
            }
            m19057K();
            this.f23990c = null;
            m19072Z(this.f23976K.getResources().getString(2132018603));
            m19075c0();
            this.f23968C = false;
            return;
        }
        if (i10 == 1) {
            this.f23979N.m19078b(2131427509).m19081e();
            return;
        }
        if (i10 == 3) {
            this.f23966A = 0;
            this.f23979N.m19078b(C10105q.f46302C).m19077a();
            this.f23979N.m19078b(C10105q.f46301B).m19081e();
            if (this.f24017z) {
                this.f23979N.m19078b(C10105q.f46301B).m19079c();
            }
        } else {
            if (i10 != 6) {
                if (i10 != 2) {
                    if (i10 == 4) {
                        this.f23979N.m19078b(C10105q.f46302C).m19081e();
                        this.f23979N.m19078b(C10105q.f46301B).m19077a();
                        if (this.f24017z) {
                            this.f23979N.m19078b(C10105q.f46302C).m19079c();
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f23966A = 0;
                this.f23979N.m19078b(2131427520).m19077a();
                this.f23979N.m19078b(2131429676).m19081e();
                this.f23979N.m19078b(C10105q.f46302C).m19077a();
                this.f23979N.m19078b(C10105q.f46301B).m19081e();
                this.f23979N.m19078b(2131427509).m19077a();
                if (this.f23976K.findViewById(2131427471).isFocusable()) {
                    return;
                }
                m19064R();
                return;
            }
            this.f23966A = 0;
            this.f23979N.m19078b(2131427520).m19077a();
            this.f23979N.m19078b(2131429676).m19081e();
            this.f23979N.m19078b(C10105q.f46302C).m19077a();
            this.f23979N.m19078b(C10105q.f46301B).m19081e();
        }
        this.f23979N.m19078b(2131427509).m19077a();
    }

    /* renamed from: b0 */
    public void m19074b0() {
        ServiceC6971a.m31982d(null);
    }

    /* renamed from: c0 */
    public void m19075c0() {
        IMediaPlayer iMediaPlayer = this.f23999i;
        if (iMediaPlayer != null) {
            iMediaPlayer.stop();
            this.f23999i.release();
            this.f23999i = null;
            this.f23993f = 0;
            this.f23995g = 0;
            ((AudioManager) this.f23971F.getSystemService("audio")).abandonAudioFocus(null);
            InterfaceC4042a.b bVar = this.f23997h;
            if (bVar == null || bVar.mo19701c() == null) {
                return;
            }
            this.f23997h.mo19701c().setFormat(-2);
            this.f23997h.mo19701c().setFormat(-1);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.f24013v;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.f24014w;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.f24015x;
    }

    /* renamed from: d0 */
    public void m19076d0() {
        IMediaPlayer iMediaPlayer = this.f23999i;
        if (iMediaPlayer != null) {
            iMediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f23999i != null) {
            return this.f24009r;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (m19063Q()) {
            return (int) this.f23999i.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (m19063Q()) {
            return (int) this.f23999i.getDuration();
        }
        return -1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        IMediaPlayer iMediaPlayer;
        return m19063Q() && (iMediaPlayer = this.f23999i) != null && iMediaPlayer.isPlaying();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10 = (i10 == 4 || i10 == 24 || i10 == 25 || i10 == 164 || i10 == 82 || i10 == 5 || i10 == 6) ? false : true;
        if (m19063Q() && z10 && this.f24006o != null) {
            if (i10 == 79 || i10 == 85) {
                IMediaPlayer iMediaPlayer = this.f23999i;
                if (iMediaPlayer == null || !iMediaPlayer.isPlaying()) {
                    start();
                    this.f24006o.m33655d();
                    return true;
                }
                pause();
                this.f24006o.show();
                return true;
            }
            if (i10 == 126) {
                IMediaPlayer iMediaPlayer2 = this.f23999i;
                if (iMediaPlayer2 == null || iMediaPlayer2.isPlaying()) {
                    return true;
                }
                start();
                this.f24006o.m33655d();
                return true;
            }
            if (i10 == 86 || i10 == 127) {
                IMediaPlayer iMediaPlayer3 = this.f23999i;
                if (iMediaPlayer3 == null || !iMediaPlayer3.isPlaying()) {
                    return true;
                }
                pause();
                this.f24006o.show();
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        IMediaPlayer iMediaPlayer;
        if (m19063Q() && (iMediaPlayer = this.f23999i) != null && iMediaPlayer.isPlaying()) {
            this.f23999i.pause();
            this.f23993f = 4;
        }
        this.f23995g = 4;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i10) {
        int i11 = i10;
        if (m19063Q()) {
            this.f23999i.seekTo(i10);
            i11 = 0;
        }
        this.f24012u = i11;
    }

    public void setContext(Context context) {
        this.f23981P = context;
    }

    public void setLiveStreamDBHandler(LiveStreamDBHandler liveStreamDBHandler) {
        this.f23980O = liveStreamDBHandler;
    }

    public void setMediaController(InterfaceC7706b interfaceC7706b) {
        InterfaceC7706b interfaceC7706b2 = this.f24006o;
        if (interfaceC7706b2 != null) {
            interfaceC7706b2.m33655d();
        }
        this.f24006o = interfaceC7706b;
        m19053G();
    }

    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.f24007p = onCompletionListener;
    }

    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        this.f24010s = onErrorListener;
    }

    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.f24011t = onInfoListener;
    }

    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.f24008q = onPreparedListener;
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
                Log.e(this.f23989b, String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i10)));
                return;
            }
            C4044c c4044c = new C4044c(getContext());
            c4043b = c4044c;
            if (this.f23999i != null) {
                c4044c.getSurfaceHolder().mo19700b(this.f23999i);
                c4044c.mo19696c(this.f23999i.getVideoWidth(), this.f23999i.getVideoHeight());
                c4044c.mo19694a(this.f23999i.getVideoSarNum(), this.f23999i.getVideoSarDen());
                c4043b = c4044c;
            }
        }
        setRenderView(c4043b);
    }

    public void setRenderView(InterfaceC4042a interfaceC4042a) {
        int i10;
        int i11;
        if (this.f23973H != null) {
            IMediaPlayer iMediaPlayer = this.f23999i;
            if (iMediaPlayer != null) {
                iMediaPlayer.setDisplay(null);
            }
            View view = this.f23973H.getView();
            this.f23973H.mo19695b(this.f23988W);
            this.f23973H = null;
            removeView(view);
        }
        if (interfaceC4042a == null) {
            return;
        }
        this.f23973H = interfaceC4042a;
        this.f23969D = this.f23971F.getSharedPreferences("loginPrefs", 0);
        int i12 = this.f24001j;
        if (i12 > 0 && (i11 = this.f24002k) > 0) {
            interfaceC4042a.mo19696c(i12, i11);
        }
        int i13 = this.f23974I;
        if (i13 > 0 && (i10 = this.f23975J) > 0) {
            interfaceC4042a.mo19694a(i13, i10);
        }
        View view2 = this.f23973H.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(view2);
        this.f23973H.mo19698e(this.f23988W);
        this.f23973H.setVideoRotation(this.f24005n);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (m19063Q()) {
            this.f23999i.start();
            this.f23993f = 3;
        }
        this.f23995g = 3;
    }
}

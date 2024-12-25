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
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti1.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti1.class */
public class NSTIJKPlayerMulti1 extends FrameLayout implements MediaController.MediaPlayerControl {

    /* renamed from: A */
    public int f23903A;

    /* renamed from: B */
    public int f23904B;

    /* renamed from: C */
    public boolean f23905C;

    /* renamed from: D */
    public SharedPreferences f23906D;

    /* renamed from: E */
    public SharedPreferences f23907E;

    /* renamed from: F */
    public Context f23908F;

    /* renamed from: G */
    public C6783a f23909G;

    /* renamed from: H */
    public InterfaceC4042a f23910H;

    /* renamed from: I */
    public int f23911I;

    /* renamed from: J */
    public int f23912J;

    /* renamed from: K */
    public Activity f23913K;

    /* renamed from: L */
    public NSTIJKPlayerMulti1 f23914L;

    /* renamed from: M */
    public AudioManager f23915M;

    /* renamed from: N */
    public C3909i f23916N;

    /* renamed from: O */
    public LiveStreamDBHandler f23917O;

    /* renamed from: P */
    public Context f23918P;

    /* renamed from: Q */
    public IMediaPlayer.OnVideoSizeChangedListener f23919Q;

    /* renamed from: R */
    public IMediaPlayer.OnPreparedListener f23920R;

    /* renamed from: S */
    public IMediaPlayer.OnCompletionListener f23921S;

    /* renamed from: T */
    public IMediaPlayer.OnInfoListener f23922T;

    /* renamed from: U */
    public IMediaPlayer.OnErrorListener f23923U;

    /* renamed from: V */
    public IMediaPlayer.OnBufferingUpdateListener f23924V;

    /* renamed from: W */
    public InterfaceC4042a.a f23925W;

    /* renamed from: b */
    public String f23926b;

    /* renamed from: c */
    public Uri f23927c;

    /* renamed from: d */
    public Map<String, String> f23928d;

    /* renamed from: e */
    public int f23929e;

    /* renamed from: f */
    public int f23930f;

    /* renamed from: f0 */
    public List<Integer> f23931f0;

    /* renamed from: g */
    public int f23932g;

    /* renamed from: g0 */
    public int f23933g0;

    /* renamed from: h */
    public InterfaceC4042a.b f23934h;

    /* renamed from: h0 */
    public int f23935h0;

    /* renamed from: i */
    public IMediaPlayer f23936i;

    /* renamed from: i0 */
    public boolean f23937i0;

    /* renamed from: j */
    public int f23938j;

    /* renamed from: k */
    public int f23939k;

    /* renamed from: l */
    public int f23940l;

    /* renamed from: m */
    public int f23941m;

    /* renamed from: n */
    public int f23942n;

    /* renamed from: o */
    public InterfaceC7706b f23943o;

    /* renamed from: p */
    public IMediaPlayer.OnCompletionListener f23944p;

    /* renamed from: q */
    public IMediaPlayer.OnPreparedListener f23945q;

    /* renamed from: r */
    public int f23946r;

    /* renamed from: s */
    public IMediaPlayer.OnErrorListener f23947s;

    /* renamed from: t */
    public IMediaPlayer.OnInfoListener f23948t;

    /* renamed from: u */
    public int f23949u;

    /* renamed from: v */
    public boolean f23950v;

    /* renamed from: w */
    public boolean f23951w;

    /* renamed from: x */
    public boolean f23952x;

    /* renamed from: y */
    public Handler f23953y;

    /* renamed from: z */
    public boolean f23954z;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti1$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti1$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti1$a.class */
    public class RunnableC3901a implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerMulti1 f23955b;

        public RunnableC3901a(NSTIJKPlayerMulti1 nSTIJKPlayerMulti1) {
            this.f23955b = nSTIJKPlayerMulti1;
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerMulti1 nSTIJKPlayerMulti1 = this.f23955b;
            nSTIJKPlayerMulti1.f23903A++;
            nSTIJKPlayerMulti1.m18996K();
            C5255e.m26241k0(this.f23955b.f23913K, this.f23955b.f23913K.getResources().getString(2132018322) + " (" + this.f23955b.f23903A + "/" + this.f23955b.f23904B + ")");
            this.f23955b.m19004S();
            this.f23955b.start();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti1$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti1$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti1$b.class */
    public class C3902b implements IMediaPlayer.OnVideoSizeChangedListener {

        /* renamed from: a */
        public final NSTIJKPlayerMulti1 f23956a;

        public C3902b(NSTIJKPlayerMulti1 nSTIJKPlayerMulti1) {
            this.f23956a = nSTIJKPlayerMulti1;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i10, int i11, int i12, int i13) {
            this.f23956a.f23938j = iMediaPlayer.getVideoWidth();
            this.f23956a.f23939k = iMediaPlayer.getVideoHeight();
            this.f23956a.f23911I = iMediaPlayer.getVideoSarNum();
            this.f23956a.f23912J = iMediaPlayer.getVideoSarDen();
            if (this.f23956a.f23938j == 0 || this.f23956a.f23939k == 0) {
                return;
            }
            if (this.f23956a.f23910H != null) {
                this.f23956a.f23910H.mo19696c(this.f23956a.f23938j, this.f23956a.f23939k);
                this.f23956a.f23910H.mo19694a(this.f23956a.f23911I, this.f23956a.f23912J);
            }
            this.f23956a.requestLayout();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti1$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti1$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti1$c.class */
    public class C3903c implements IMediaPlayer.OnPreparedListener {

        /* renamed from: a */
        public final NSTIJKPlayerMulti1 f23957a;

        public C3903c(NSTIJKPlayerMulti1 nSTIJKPlayerMulti1) {
            this.f23957a = nSTIJKPlayerMulti1;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            this.f23957a.f23930f = 2;
            if (this.f23957a.f23945q != null) {
                this.f23957a.f23945q.onPrepared(this.f23957a.f23936i);
            }
            if (this.f23957a.f23943o != null) {
                this.f23957a.f23943o.setEnabled(true);
            }
            this.f23957a.f23938j = iMediaPlayer.getVideoWidth();
            this.f23957a.f23939k = iMediaPlayer.getVideoHeight();
            if (this.f23957a.f23938j == 0 || this.f23957a.f23939k == 0) {
                if (this.f23957a.f23932g == 3) {
                    this.f23957a.start();
                }
            } else if (this.f23957a.f23910H != null) {
                this.f23957a.f23910H.mo19696c(this.f23957a.f23938j, this.f23957a.f23939k);
                this.f23957a.f23910H.mo19694a(this.f23957a.f23911I, this.f23957a.f23912J);
                if ((!this.f23957a.f23910H.mo19697d() || (this.f23957a.f23940l == this.f23957a.f23938j && this.f23957a.f23941m == this.f23957a.f23939k)) && this.f23957a.f23932g == 3) {
                    this.f23957a.start();
                    if (this.f23957a.f23943o != null) {
                        this.f23957a.f23943o.show();
                    }
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti1$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti1$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti1$d.class */
    public class C3904d implements IMediaPlayer.OnCompletionListener {

        /* renamed from: a */
        public final NSTIJKPlayerMulti1 f23958a;

        public C3904d(NSTIJKPlayerMulti1 nSTIJKPlayerMulti1) {
            this.f23958a = nSTIJKPlayerMulti1;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            this.f23958a.f23930f = 5;
            this.f23958a.f23932g = 5;
            if (this.f23958a.f23943o != null) {
                this.f23958a.f23943o.m33655d();
            }
            this.f23958a.m19012a0(-1);
            if (this.f23958a.f23944p != null) {
                this.f23958a.f23944p.onCompletion(this.f23958a.f23936i);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti1$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti1$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti1$e.class */
    public class C3905e implements IMediaPlayer.OnInfoListener {

        /* renamed from: a */
        public final NSTIJKPlayerMulti1 f23959a;

        public C3905e(NSTIJKPlayerMulti1 nSTIJKPlayerMulti1) {
            this.f23959a = nSTIJKPlayerMulti1;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i10, int i11) {
            String str;
            String str2;
            if (this.f23959a.f23948t != null) {
                this.f23959a.f23948t.onInfo(iMediaPlayer, i10, i11);
            }
            if (i10 == 3) {
                this.f23959a.m19012a0(2);
                str = this.f23959a.f23926b;
                str2 = "MEDIA_INFO_VIDEO_RENDERING_START:";
            } else if (i10 == 10005) {
                this.f23959a.m19012a0(1);
                str = this.f23959a.f23926b;
                str2 = "MEDIA_INFO_OPEN_INPUT:";
            } else if (i10 == 901) {
                str = this.f23959a.f23926b;
                str2 = "MEDIA_INFO_UNSUPPORTED_SUBTITLE:";
            } else if (i10 == 902) {
                str = this.f23959a.f23926b;
                str2 = "MEDIA_INFO_SUBTITLE_TIMED_OUT:";
            } else {
                if (i10 == 10001) {
                    this.f23959a.f23942n = i11;
                    Log.d(this.f23959a.f23926b, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i11);
                    if (this.f23959a.f23910H == null) {
                        return true;
                    }
                    this.f23959a.f23910H.setVideoRotation(i11);
                    return true;
                }
                if (i10 != 10002) {
                    switch (i10) {
                        case 700:
                            str = this.f23959a.f23926b;
                            str2 = "MEDIA_INFO_VIDEO_TRACK_LAGGING:";
                            break;
                        case IMediaPlayer.MEDIA_INFO_BUFFERING_START /* 701 */:
                            this.f23959a.m19012a0(1);
                            str = this.f23959a.f23926b;
                            str2 = "MEDIA_INFO_BUFFERING_START:";
                            break;
                        case IMediaPlayer.MEDIA_INFO_BUFFERING_END /* 702 */:
                            this.f23959a.m19012a0(6);
                            str = this.f23959a.f23926b;
                            str2 = "MEDIA_INFO_BUFFERING_END:";
                            break;
                        case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                            str = this.f23959a.f23926b;
                            str2 = "MEDIA_INFO_NETWORK_BANDWIDTH: " + i11;
                            break;
                        default:
                            switch (i10) {
                                case 800:
                                    str = this.f23959a.f23926b;
                                    str2 = "MEDIA_INFO_BAD_INTERLEAVING:";
                                    break;
                                case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                    str = this.f23959a.f23926b;
                                    str2 = "MEDIA_INFO_NOT_SEEKABLE:";
                                    break;
                                case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                    str = this.f23959a.f23926b;
                                    str2 = "MEDIA_INFO_METADATA_UPDATE:";
                                    break;
                                default:
                                    return true;
                            }
                    }
                } else {
                    str = this.f23959a.f23926b;
                    str2 = "MEDIA_INFO_AUDIO_RENDERING_START:";
                }
            }
            Log.d(str, str2);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti1$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti1$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti1$f.class */
    public class C3906f implements IMediaPlayer.OnErrorListener {

        /* renamed from: a */
        public final NSTIJKPlayerMulti1 f23960a;

        public C3906f(NSTIJKPlayerMulti1 nSTIJKPlayerMulti1) {
            this.f23960a = nSTIJKPlayerMulti1;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i10, int i11) {
            Log.d(this.f23960a.f23926b, "Error: " + i10 + "," + i11);
            this.f23960a.f23930f = -1;
            this.f23960a.f23932g = -1;
            if (this.f23960a.f23943o != null) {
                this.f23960a.f23943o.m33655d();
            }
            this.f23960a.m19012a0(-1);
            if (this.f23960a.f23947s == null) {
                return true;
            }
            this.f23960a.f23947s.onError(this.f23960a.f23936i, i10, i11);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti1$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti1$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti1$g.class */
    public class C3907g implements IMediaPlayer.OnBufferingUpdateListener {

        /* renamed from: a */
        public final NSTIJKPlayerMulti1 f23961a;

        public C3907g(NSTIJKPlayerMulti1 nSTIJKPlayerMulti1) {
            this.f23961a = nSTIJKPlayerMulti1;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i10) {
            this.f23961a.f23946r = i10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti1$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti1$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti1$h.class */
    public class C3908h implements InterfaceC4042a.a {

        /* renamed from: a */
        public final NSTIJKPlayerMulti1 f23962a;

        public C3908h(NSTIJKPlayerMulti1 nSTIJKPlayerMulti1) {
            this.f23962a = nSTIJKPlayerMulti1;
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.a
        /* renamed from: a */
        public void mo18794a(InterfaceC4042a.b bVar, int i10, int i11, int i12) {
            if (bVar.mo19699a() != this.f23962a.f23910H) {
                Log.e(this.f23962a.f23926b, "onSurfaceChanged: unmatched render callback\n");
                return;
            }
            this.f23962a.f23940l = i11;
            this.f23962a.f23941m = i12;
            boolean z10 = this.f23962a.f23932g == 3;
            boolean z11 = true;
            if (this.f23962a.f23910H.mo19697d()) {
                z11 = this.f23962a.f23938j == i11 && this.f23962a.f23939k == i12;
            }
            if (this.f23962a.f23936i != null && z10 && z11) {
                if (this.f23962a.f23949u != 0) {
                    NSTIJKPlayerMulti1 nSTIJKPlayerMulti1 = this.f23962a;
                    nSTIJKPlayerMulti1.seekTo(nSTIJKPlayerMulti1.f23949u);
                }
                this.f23962a.start();
            }
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.a
        /* renamed from: b */
        public void mo18795b(InterfaceC4042a.b bVar) {
            if (bVar.mo19699a() != this.f23962a.f23910H) {
                Log.e(this.f23962a.f23926b, "onSurfaceDestroyed: unmatched render callback\n");
            } else {
                this.f23962a.f23934h = null;
                this.f23962a.m19006U();
            }
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.a
        /* renamed from: c */
        public void mo18796c(InterfaceC4042a.b bVar, int i10, int i11) {
            if (bVar.mo19699a() != this.f23962a.f23910H) {
                Log.e(this.f23962a.f23926b, "onSurfaceCreated: unmatched render callback\n");
                return;
            }
            this.f23962a.f23934h = bVar;
            if (this.f23962a.f23936i == null) {
                this.f23962a.m19004S();
            } else {
                NSTIJKPlayerMulti1 nSTIJKPlayerMulti1 = this.f23962a;
                nSTIJKPlayerMulti1.m18993H(nSTIJKPlayerMulti1.f23936i, bVar);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti1$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti1$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti1$i.class */
    public class C3909i {

        /* renamed from: a */
        public final Activity f23963a;

        /* renamed from: b */
        public View f23964b;

        /* renamed from: c */
        public final NSTIJKPlayerMulti1 f23965c;

        public C3909i(NSTIJKPlayerMulti1 nSTIJKPlayerMulti1, Activity activity) {
            this.f23965c = nSTIJKPlayerMulti1;
            this.f23963a = activity;
        }

        /* renamed from: a */
        public C3909i m19016a() {
            View view = this.f23964b;
            if (view != null) {
                view.setVisibility(8);
            }
            return this;
        }

        /* renamed from: b */
        public C3909i m19017b(int i10) {
            this.f23964b = this.f23963a.findViewById(i10);
            return this;
        }

        /* renamed from: c */
        public C3909i m19018c() {
            View view = this.f23964b;
            if (view != null) {
                view.requestFocus();
            }
            return this;
        }

        /* renamed from: d */
        public C3909i m19019d(CharSequence charSequence) {
            View view = this.f23964b;
            if (view != null && (view instanceof TextView)) {
                ((TextView) view).setText(charSequence);
            }
            return this;
        }

        /* renamed from: e */
        public C3909i m19020e() {
            View view = this.f23964b;
            if (view != null) {
                view.setVisibility(0);
            }
            return this;
        }
    }

    public NSTIJKPlayerMulti1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23926b = "NSTIJKPlayerMulti1";
        this.f23929e = 0;
        this.f23930f = 0;
        this.f23932g = 0;
        this.f23934h = null;
        this.f23936i = null;
        this.f23950v = true;
        this.f23951w = true;
        this.f23952x = true;
        this.f23903A = 0;
        this.f23904B = 5;
        this.f23905C = false;
        this.f23919Q = new C3902b(this);
        this.f23920R = new C3903c(this);
        this.f23921S = new C3904d(this);
        this.f23922T = new C3905e(this);
        this.f23923U = new C3906f(this);
        this.f23924V = new C3907g(this);
        this.f23925W = new C3908h(this);
        this.f23931f0 = new ArrayList();
        this.f23933g0 = 0;
        this.f23935h0 = 0;
        this.f23937i0 = false;
        m19000O(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.view.View] */
    /* renamed from: G */
    public final void m18992G() {
        InterfaceC7706b interfaceC7706b;
        if (this.f23936i == null || (interfaceC7706b = this.f23943o) == null) {
            return;
        }
        interfaceC7706b.m33654c(this);
        this.f23943o.m33653b(getParent() instanceof View ? (View) getParent() : this);
        this.f23943o.setEnabled(m19002Q());
    }

    /* renamed from: H */
    public final void m18993H(IMediaPlayer iMediaPlayer, InterfaceC4042a.b bVar) {
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
    public tv.danmaku.ijk.media.player.IMediaPlayer m18994I(int r7) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti1.m18994I(int):tv.danmaku.ijk.media.player.IMediaPlayer");
    }

    /* renamed from: J */
    public void m18995J() {
        ServiceC6971a.m31982d(this.f23936i);
    }

    /* renamed from: K */
    public final void m18996K() {
        this.f23916N.m19017b(2131427508).m19016a();
        this.f23916N.m19017b(2131427519).m19016a();
        m18997L();
    }

    /* renamed from: L */
    public void m18997L() {
        this.f23916N.m19017b(2131427532).m19016a();
        this.f23916N.m19017b(2131427785).m19016a();
        this.f23916N.m19017b(2131428499).m19016a();
        this.f23953y.removeCallbacksAndMessages(null);
    }

    /* renamed from: M */
    public final void m18998M() {
        boolean m31278p = this.f23909G.m31278p();
        this.f23937i0 = m31278p;
        if (m31278p) {
            ServiceC6971a.m31980b(getContext());
            this.f23936i = ServiceC6971a.m31979a();
        }
    }

    /* renamed from: N */
    public final void m18999N() {
        this.f23931f0.clear();
        if (this.f23909G.m31281s()) {
            this.f23931f0.add(1);
        }
        if (this.f23909G.m31282t()) {
            this.f23931f0.add(2);
        }
        if (this.f23909G.m31280r()) {
            this.f23931f0.add(0);
        }
        if (this.f23931f0.isEmpty()) {
            this.f23931f0.add(1);
        }
        int intValue = this.f23931f0.get(this.f23933g0).intValue();
        this.f23935h0 = intValue;
        setRender(intValue);
    }

    /* renamed from: O */
    public final void m19000O(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f23908F = applicationContext;
        this.f23909G = new C6783a(applicationContext);
        m18998M();
        m18999N();
        this.f23938j = 0;
        this.f23939k = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f23930f = 0;
        this.f23932g = 0;
    }

    /* renamed from: P */
    public boolean m19001P() {
        return this.f23937i0;
    }

    /* renamed from: Q */
    public final boolean m19002Q() {
        int i10;
        boolean z10 = true;
        if (this.f23936i == null || (i10 = this.f23930f) == -1 || i10 == 0 || i10 == 1) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: R */
    public void m19003R() {
        IMediaPlayer iMediaPlayer = this.f23936i;
        if (iMediaPlayer != null) {
            iMediaPlayer.setVolume(0.0f, 0.0f);
        }
    }

    @TargetApi(23)
    /* renamed from: S */
    public void m19004S() {
        IMediaPlayer.OnErrorListener onErrorListener;
        IMediaPlayer iMediaPlayer;
        if (this.f23927c == null || this.f23934h == null) {
            return;
        }
        m19005T(false);
        try {
            ((AudioManager) this.f23908F.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        } catch (Exception e10) {
        }
        this.f23916N.m19017b(2131427519).m19016a();
        try {
            try {
                try {
                    IMediaPlayer m18994I = m18994I(this.f23909G.m31285w());
                    this.f23936i = m18994I;
                    m18994I.setOnPreparedListener(this.f23920R);
                    this.f23936i.setOnVideoSizeChangedListener(this.f23919Q);
                    this.f23936i.setOnCompletionListener(this.f23921S);
                    this.f23936i.setOnErrorListener(this.f23923U);
                    this.f23936i.setOnInfoListener(this.f23922T);
                    this.f23936i.setOnBufferingUpdateListener(this.f23924V);
                    this.f23946r = 0;
                    String scheme = this.f23927c.getScheme();
                    if (Build.VERSION.SDK_INT >= 23 && this.f23909G.m31246E() && (TextUtils.isEmpty(scheme) || scheme.equalsIgnoreCase(TransferTable.COLUMN_FILE))) {
                        this.f23936i.setDataSource(new C7705a(new File(this.f23927c.toString())));
                    } else {
                        this.f23936i.setDataSource(this.f23908F, this.f23927c, this.f23928d);
                    }
                    m18993H(this.f23936i, this.f23934h);
                    this.f23936i.setAudioStreamType(3);
                    this.f23936i.setScreenOnWhilePlaying(true);
                    this.f23936i.prepareAsync();
                    this.f23915M = (AudioManager) this.f23913K.getSystemService("audio");
                    this.f23930f = 1;
                } catch (IllegalArgumentException e11) {
                    Log.w(this.f23926b, "Unable to open content: " + this.f23927c, e11);
                    this.f23930f = -1;
                    this.f23932g = -1;
                    onErrorListener = this.f23923U;
                    iMediaPlayer = this.f23936i;
                    onErrorListener.onError(iMediaPlayer, 1, 0);
                } catch (NullPointerException e12) {
                    Log.w(this.f23926b, "Unable to open content: " + this.f23927c, e12);
                    this.f23930f = -1;
                    this.f23932g = -1;
                    onErrorListener = this.f23923U;
                    iMediaPlayer = this.f23936i;
                    onErrorListener.onError(iMediaPlayer, 1, 0);
                }
            } catch (IOException e13) {
                Log.w(this.f23926b, "Unable to open content: " + this.f23927c, e13);
                this.f23930f = -1;
                this.f23932g = -1;
                onErrorListener = this.f23923U;
                iMediaPlayer = this.f23936i;
                onErrorListener.onError(iMediaPlayer, 1, 0);
            }
        } catch (Exception e14) {
            Log.w(this.f23926b, "Unable to open content: " + this.f23927c, e14);
            this.f23930f = -1;
            this.f23932g = -1;
            onErrorListener = this.f23923U;
            iMediaPlayer = this.f23936i;
            onErrorListener.onError(iMediaPlayer, 1, 0);
        }
    }

    /* renamed from: T */
    public void m19005T(boolean z10) {
        IMediaPlayer iMediaPlayer = this.f23936i;
        if (iMediaPlayer != null) {
            iMediaPlayer.reset();
            this.f23936i.release();
            this.f23936i = null;
            this.f23930f = 0;
            if (z10) {
                this.f23932g = 0;
            }
            ((AudioManager) this.f23908F.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    /* renamed from: U */
    public void m19006U() {
        IMediaPlayer iMediaPlayer = this.f23936i;
        if (iMediaPlayer != null) {
            iMediaPlayer.setDisplay(null);
        }
    }

    /* renamed from: V */
    public void m19007V() {
        Handler handler = this.f23953y;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: W */
    public void m19008W(Activity activity, NSTIJKPlayerMulti1 nSTIJKPlayerMulti1) {
        this.f23913K = activity;
        this.f23914L = nSTIJKPlayerMulti1;
        this.f23953y = new Handler();
        this.f23916N = new C3909i(this, activity);
    }

    /* renamed from: X */
    public final void m19009X(Uri uri, Map<String, String> map, boolean z10, String str) {
        this.f23927c = uri;
        this.f23928d = map;
        this.f23949u = 0;
        this.f23954z = z10;
        m19014c0();
        m19004S();
        requestLayout();
        invalidate();
    }

    /* renamed from: Y */
    public void m19010Y(Uri uri, boolean z10, String str) {
        m19009X(uri, null, z10, str);
    }

    /* renamed from: Z */
    public final void m19011Z(String str) {
        this.f23916N.m19017b(2131429675).m19016a();
        this.f23916N.m19017b(2131427519).m19020e();
        this.f23916N.m19017b(2131427523).m19019d(str);
    }

    /* renamed from: a0 */
    public final void m19012a0(int i10) {
        this.f23929e = i10;
        if (i10 == -1) {
            if (this.f23903A < this.f23904B) {
                this.f23905C = true;
                this.f23953y.postDelayed(new RunnableC3901a(this), 3000L);
                return;
            }
            m18996K();
            this.f23927c = null;
            m19011Z(this.f23913K.getResources().getString(2132018603));
            m19014c0();
            this.f23905C = false;
            return;
        }
        if (i10 == 1) {
            this.f23916N.m19017b(2131427508).m19020e();
            return;
        }
        if (i10 == 3) {
            this.f23903A = 0;
            this.f23916N.m19017b(C10105q.f46302C).m19016a();
            this.f23916N.m19017b(C10105q.f46301B).m19020e();
            if (this.f23954z) {
                this.f23916N.m19017b(C10105q.f46301B).m19018c();
            }
        } else {
            if (i10 != 6) {
                if (i10 != 2) {
                    if (i10 == 4) {
                        this.f23916N.m19017b(C10105q.f46302C).m19020e();
                        this.f23916N.m19017b(C10105q.f46301B).m19016a();
                        if (this.f23954z) {
                            this.f23916N.m19017b(C10105q.f46302C).m19018c();
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f23903A = 0;
                this.f23916N.m19017b(2131427519).m19016a();
                this.f23916N.m19017b(2131429675).m19020e();
                this.f23916N.m19017b(C10105q.f46302C).m19016a();
                this.f23916N.m19017b(C10105q.f46301B).m19020e();
                this.f23916N.m19017b(2131427508).m19016a();
                if (this.f23913K.findViewById(2131427470).isFocusable()) {
                    return;
                }
                m19003R();
                return;
            }
            this.f23903A = 0;
            this.f23916N.m19017b(2131427519).m19016a();
            this.f23916N.m19017b(2131429675).m19020e();
            this.f23916N.m19017b(C10105q.f46302C).m19016a();
            this.f23916N.m19017b(C10105q.f46301B).m19020e();
        }
        this.f23916N.m19017b(2131427508).m19016a();
    }

    /* renamed from: b0 */
    public void m19013b0() {
        ServiceC6971a.m31982d(null);
    }

    /* renamed from: c0 */
    public void m19014c0() {
        IMediaPlayer iMediaPlayer = this.f23936i;
        if (iMediaPlayer != null) {
            iMediaPlayer.stop();
            this.f23936i.release();
            this.f23936i = null;
            this.f23930f = 0;
            this.f23932g = 0;
            ((AudioManager) this.f23908F.getSystemService("audio")).abandonAudioFocus(null);
            InterfaceC4042a.b bVar = this.f23934h;
            if (bVar == null || bVar.mo19701c() == null) {
                return;
            }
            this.f23934h.mo19701c().setFormat(-2);
            this.f23934h.mo19701c().setFormat(-1);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.f23950v;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.f23951w;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.f23952x;
    }

    /* renamed from: d0 */
    public void m19015d0() {
        IMediaPlayer iMediaPlayer = this.f23936i;
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
        if (this.f23936i != null) {
            return this.f23946r;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (m19002Q()) {
            return (int) this.f23936i.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (m19002Q()) {
            return (int) this.f23936i.getDuration();
        }
        return -1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        IMediaPlayer iMediaPlayer;
        return m19002Q() && (iMediaPlayer = this.f23936i) != null && iMediaPlayer.isPlaying();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10 = (i10 == 4 || i10 == 24 || i10 == 25 || i10 == 164 || i10 == 82 || i10 == 5 || i10 == 6) ? false : true;
        if (m19002Q() && z10 && this.f23943o != null) {
            if (i10 == 79 || i10 == 85) {
                IMediaPlayer iMediaPlayer = this.f23936i;
                if (iMediaPlayer == null || !iMediaPlayer.isPlaying()) {
                    start();
                    this.f23943o.m33655d();
                    return true;
                }
                pause();
                this.f23943o.show();
                return true;
            }
            if (i10 == 126) {
                IMediaPlayer iMediaPlayer2 = this.f23936i;
                if (iMediaPlayer2 == null || iMediaPlayer2.isPlaying()) {
                    return true;
                }
                start();
                this.f23943o.m33655d();
                return true;
            }
            if (i10 == 86 || i10 == 127) {
                IMediaPlayer iMediaPlayer3 = this.f23936i;
                if (iMediaPlayer3 == null || !iMediaPlayer3.isPlaying()) {
                    return true;
                }
                pause();
                this.f23943o.show();
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        IMediaPlayer iMediaPlayer;
        if (m19002Q() && (iMediaPlayer = this.f23936i) != null && iMediaPlayer.isPlaying()) {
            this.f23936i.pause();
            this.f23930f = 4;
        }
        this.f23932g = 4;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i10) {
        int i11 = i10;
        if (m19002Q()) {
            this.f23936i.seekTo(i10);
            i11 = 0;
        }
        this.f23949u = i11;
    }

    public void setContext(Context context) {
        this.f23918P = context;
    }

    public void setLiveStreamDBHandler(LiveStreamDBHandler liveStreamDBHandler) {
        this.f23917O = liveStreamDBHandler;
    }

    public void setMediaController(InterfaceC7706b interfaceC7706b) {
        InterfaceC7706b interfaceC7706b2 = this.f23943o;
        if (interfaceC7706b2 != null) {
            interfaceC7706b2.m33655d();
        }
        this.f23943o = interfaceC7706b;
        m18992G();
    }

    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.f23944p = onCompletionListener;
    }

    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        this.f23947s = onErrorListener;
    }

    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.f23948t = onInfoListener;
    }

    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.f23945q = onPreparedListener;
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
                Log.e(this.f23926b, String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i10)));
                return;
            }
            C4044c c4044c = new C4044c(getContext());
            c4043b = c4044c;
            if (this.f23936i != null) {
                c4044c.getSurfaceHolder().mo19700b(this.f23936i);
                c4044c.mo19696c(this.f23936i.getVideoWidth(), this.f23936i.getVideoHeight());
                c4044c.mo19694a(this.f23936i.getVideoSarNum(), this.f23936i.getVideoSarDen());
                c4043b = c4044c;
            }
        }
        setRenderView(c4043b);
    }

    public void setRenderView(InterfaceC4042a interfaceC4042a) {
        int i10;
        int i11;
        if (this.f23910H != null) {
            IMediaPlayer iMediaPlayer = this.f23936i;
            if (iMediaPlayer != null) {
                iMediaPlayer.setDisplay(null);
            }
            View view = this.f23910H.getView();
            this.f23910H.mo19695b(this.f23925W);
            this.f23910H = null;
            removeView(view);
        }
        if (interfaceC4042a == null) {
            return;
        }
        this.f23910H = interfaceC4042a;
        this.f23906D = this.f23908F.getSharedPreferences("loginPrefs", 0);
        int i12 = this.f23938j;
        if (i12 > 0 && (i11 = this.f23939k) > 0) {
            interfaceC4042a.mo19696c(i12, i11);
        }
        int i13 = this.f23911I;
        if (i13 > 0 && (i10 = this.f23912J) > 0) {
            interfaceC4042a.mo19694a(i13, i10);
        }
        View view2 = this.f23910H.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(view2);
        this.f23910H.mo19698e(this.f23925W);
        this.f23910H.setVideoRotation(this.f23942n);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (m19002Q()) {
            this.f23936i.start();
            this.f23930f = 3;
        }
        this.f23932g = 3;
    }
}

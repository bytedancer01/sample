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
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti3.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti3.class */
public class NSTIJKPlayerMulti3 extends FrameLayout implements MediaController.MediaPlayerControl {

    /* renamed from: A */
    public int f24029A;

    /* renamed from: B */
    public int f24030B;

    /* renamed from: C */
    public boolean f24031C;

    /* renamed from: D */
    public SharedPreferences f24032D;

    /* renamed from: E */
    public SharedPreferences f24033E;

    /* renamed from: F */
    public Context f24034F;

    /* renamed from: G */
    public C6783a f24035G;

    /* renamed from: H */
    public InterfaceC4042a f24036H;

    /* renamed from: I */
    public int f24037I;

    /* renamed from: J */
    public int f24038J;

    /* renamed from: K */
    public Activity f24039K;

    /* renamed from: L */
    public NSTIJKPlayerMulti3 f24040L;

    /* renamed from: M */
    public AudioManager f24041M;

    /* renamed from: N */
    public C3927i f24042N;

    /* renamed from: O */
    public LiveStreamDBHandler f24043O;

    /* renamed from: P */
    public Context f24044P;

    /* renamed from: Q */
    public IMediaPlayer.OnVideoSizeChangedListener f24045Q;

    /* renamed from: R */
    public IMediaPlayer.OnPreparedListener f24046R;

    /* renamed from: S */
    public IMediaPlayer.OnCompletionListener f24047S;

    /* renamed from: T */
    public IMediaPlayer.OnInfoListener f24048T;

    /* renamed from: U */
    public IMediaPlayer.OnErrorListener f24049U;

    /* renamed from: V */
    public IMediaPlayer.OnBufferingUpdateListener f24050V;

    /* renamed from: W */
    public InterfaceC4042a.a f24051W;

    /* renamed from: b */
    public String f24052b;

    /* renamed from: c */
    public Uri f24053c;

    /* renamed from: d */
    public Map<String, String> f24054d;

    /* renamed from: e */
    public int f24055e;

    /* renamed from: f */
    public int f24056f;

    /* renamed from: f0 */
    public List<Integer> f24057f0;

    /* renamed from: g */
    public int f24058g;

    /* renamed from: g0 */
    public int f24059g0;

    /* renamed from: h */
    public InterfaceC4042a.b f24060h;

    /* renamed from: h0 */
    public int f24061h0;

    /* renamed from: i */
    public IMediaPlayer f24062i;

    /* renamed from: i0 */
    public boolean f24063i0;

    /* renamed from: j */
    public int f24064j;

    /* renamed from: k */
    public int f24065k;

    /* renamed from: l */
    public int f24066l;

    /* renamed from: m */
    public int f24067m;

    /* renamed from: n */
    public int f24068n;

    /* renamed from: o */
    public InterfaceC7706b f24069o;

    /* renamed from: p */
    public IMediaPlayer.OnCompletionListener f24070p;

    /* renamed from: q */
    public IMediaPlayer.OnPreparedListener f24071q;

    /* renamed from: r */
    public int f24072r;

    /* renamed from: s */
    public IMediaPlayer.OnErrorListener f24073s;

    /* renamed from: t */
    public IMediaPlayer.OnInfoListener f24074t;

    /* renamed from: u */
    public int f24075u;

    /* renamed from: v */
    public boolean f24076v;

    /* renamed from: w */
    public boolean f24077w;

    /* renamed from: x */
    public boolean f24078x;

    /* renamed from: y */
    public Handler f24079y;

    /* renamed from: z */
    public boolean f24080z;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti3$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti3$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti3$a.class */
    public class RunnableC3919a implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerMulti3 f24081b;

        public RunnableC3919a(NSTIJKPlayerMulti3 nSTIJKPlayerMulti3) {
            this.f24081b = nSTIJKPlayerMulti3;
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerMulti3 nSTIJKPlayerMulti3 = this.f24081b;
            nSTIJKPlayerMulti3.f24029A++;
            nSTIJKPlayerMulti3.m19118K();
            C5255e.m26241k0(this.f24081b.f24039K, this.f24081b.f24039K.getResources().getString(2132018322) + " (" + this.f24081b.f24029A + "/" + this.f24081b.f24030B + ")");
            this.f24081b.m19126S();
            this.f24081b.start();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti3$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti3$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti3$b.class */
    public class C3920b implements IMediaPlayer.OnVideoSizeChangedListener {

        /* renamed from: a */
        public final NSTIJKPlayerMulti3 f24082a;

        public C3920b(NSTIJKPlayerMulti3 nSTIJKPlayerMulti3) {
            this.f24082a = nSTIJKPlayerMulti3;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i10, int i11, int i12, int i13) {
            this.f24082a.f24064j = iMediaPlayer.getVideoWidth();
            this.f24082a.f24065k = iMediaPlayer.getVideoHeight();
            this.f24082a.f24037I = iMediaPlayer.getVideoSarNum();
            this.f24082a.f24038J = iMediaPlayer.getVideoSarDen();
            if (this.f24082a.f24064j == 0 || this.f24082a.f24065k == 0) {
                return;
            }
            if (this.f24082a.f24036H != null) {
                this.f24082a.f24036H.mo19696c(this.f24082a.f24064j, this.f24082a.f24065k);
                this.f24082a.f24036H.mo19694a(this.f24082a.f24037I, this.f24082a.f24038J);
            }
            this.f24082a.requestLayout();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti3$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti3$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti3$c.class */
    public class C3921c implements IMediaPlayer.OnPreparedListener {

        /* renamed from: a */
        public final NSTIJKPlayerMulti3 f24083a;

        public C3921c(NSTIJKPlayerMulti3 nSTIJKPlayerMulti3) {
            this.f24083a = nSTIJKPlayerMulti3;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            this.f24083a.f24056f = 2;
            if (this.f24083a.f24071q != null) {
                this.f24083a.f24071q.onPrepared(this.f24083a.f24062i);
            }
            if (this.f24083a.f24069o != null) {
                this.f24083a.f24069o.setEnabled(true);
            }
            this.f24083a.f24064j = iMediaPlayer.getVideoWidth();
            this.f24083a.f24065k = iMediaPlayer.getVideoHeight();
            if (this.f24083a.f24064j == 0 || this.f24083a.f24065k == 0) {
                if (this.f24083a.f24058g == 3) {
                    this.f24083a.start();
                }
            } else if (this.f24083a.f24036H != null) {
                this.f24083a.f24036H.mo19696c(this.f24083a.f24064j, this.f24083a.f24065k);
                this.f24083a.f24036H.mo19694a(this.f24083a.f24037I, this.f24083a.f24038J);
                if ((!this.f24083a.f24036H.mo19697d() || (this.f24083a.f24066l == this.f24083a.f24064j && this.f24083a.f24067m == this.f24083a.f24065k)) && this.f24083a.f24058g == 3) {
                    this.f24083a.start();
                    if (this.f24083a.f24069o != null) {
                        this.f24083a.f24069o.show();
                    }
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti3$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti3$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti3$d.class */
    public class C3922d implements IMediaPlayer.OnCompletionListener {

        /* renamed from: a */
        public final NSTIJKPlayerMulti3 f24084a;

        public C3922d(NSTIJKPlayerMulti3 nSTIJKPlayerMulti3) {
            this.f24084a = nSTIJKPlayerMulti3;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            this.f24084a.f24056f = 5;
            this.f24084a.f24058g = 5;
            if (this.f24084a.f24069o != null) {
                this.f24084a.f24069o.m33655d();
            }
            this.f24084a.m19134a0(-1);
            if (this.f24084a.f24070p != null) {
                this.f24084a.f24070p.onCompletion(this.f24084a.f24062i);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti3$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti3$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti3$e.class */
    public class C3923e implements IMediaPlayer.OnInfoListener {

        /* renamed from: a */
        public final NSTIJKPlayerMulti3 f24085a;

        public C3923e(NSTIJKPlayerMulti3 nSTIJKPlayerMulti3) {
            this.f24085a = nSTIJKPlayerMulti3;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i10, int i11) {
            String str;
            String str2;
            if (this.f24085a.f24074t != null) {
                this.f24085a.f24074t.onInfo(iMediaPlayer, i10, i11);
            }
            if (i10 == 3) {
                this.f24085a.m19134a0(2);
                str = this.f24085a.f24052b;
                str2 = "MEDIA_INFO_VIDEO_RENDERING_START:";
            } else if (i10 == 10005) {
                this.f24085a.m19134a0(1);
                str = this.f24085a.f24052b;
                str2 = "MEDIA_INFO_OPEN_INPUT:";
            } else if (i10 == 901) {
                str = this.f24085a.f24052b;
                str2 = "MEDIA_INFO_UNSUPPORTED_SUBTITLE:";
            } else if (i10 == 902) {
                str = this.f24085a.f24052b;
                str2 = "MEDIA_INFO_SUBTITLE_TIMED_OUT:";
            } else {
                if (i10 == 10001) {
                    this.f24085a.f24068n = i11;
                    Log.d(this.f24085a.f24052b, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i11);
                    if (this.f24085a.f24036H == null) {
                        return true;
                    }
                    this.f24085a.f24036H.setVideoRotation(i11);
                    return true;
                }
                if (i10 != 10002) {
                    switch (i10) {
                        case 700:
                            str = this.f24085a.f24052b;
                            str2 = "MEDIA_INFO_VIDEO_TRACK_LAGGING:";
                            break;
                        case IMediaPlayer.MEDIA_INFO_BUFFERING_START /* 701 */:
                            this.f24085a.m19134a0(1);
                            str = this.f24085a.f24052b;
                            str2 = "MEDIA_INFO_BUFFERING_START:";
                            break;
                        case IMediaPlayer.MEDIA_INFO_BUFFERING_END /* 702 */:
                            this.f24085a.m19134a0(6);
                            str = this.f24085a.f24052b;
                            str2 = "MEDIA_INFO_BUFFERING_END:";
                            break;
                        case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                            str = this.f24085a.f24052b;
                            str2 = "MEDIA_INFO_NETWORK_BANDWIDTH: " + i11;
                            break;
                        default:
                            switch (i10) {
                                case 800:
                                    str = this.f24085a.f24052b;
                                    str2 = "MEDIA_INFO_BAD_INTERLEAVING:";
                                    break;
                                case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                    str = this.f24085a.f24052b;
                                    str2 = "MEDIA_INFO_NOT_SEEKABLE:";
                                    break;
                                case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                    str = this.f24085a.f24052b;
                                    str2 = "MEDIA_INFO_METADATA_UPDATE:";
                                    break;
                                default:
                                    return true;
                            }
                    }
                } else {
                    str = this.f24085a.f24052b;
                    str2 = "MEDIA_INFO_AUDIO_RENDERING_START:";
                }
            }
            Log.d(str, str2);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti3$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti3$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti3$f.class */
    public class C3924f implements IMediaPlayer.OnErrorListener {

        /* renamed from: a */
        public final NSTIJKPlayerMulti3 f24086a;

        public C3924f(NSTIJKPlayerMulti3 nSTIJKPlayerMulti3) {
            this.f24086a = nSTIJKPlayerMulti3;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i10, int i11) {
            Log.d(this.f24086a.f24052b, "Error: " + i10 + "," + i11);
            this.f24086a.f24056f = -1;
            this.f24086a.f24058g = -1;
            if (this.f24086a.f24069o != null) {
                this.f24086a.f24069o.m33655d();
            }
            this.f24086a.m19134a0(-1);
            if (this.f24086a.f24073s == null) {
                return true;
            }
            this.f24086a.f24073s.onError(this.f24086a.f24062i, i10, i11);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti3$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti3$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti3$g.class */
    public class C3925g implements IMediaPlayer.OnBufferingUpdateListener {

        /* renamed from: a */
        public final NSTIJKPlayerMulti3 f24087a;

        public C3925g(NSTIJKPlayerMulti3 nSTIJKPlayerMulti3) {
            this.f24087a = nSTIJKPlayerMulti3;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i10) {
            this.f24087a.f24072r = i10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti3$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti3$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti3$h.class */
    public class C3926h implements InterfaceC4042a.a {

        /* renamed from: a */
        public final NSTIJKPlayerMulti3 f24088a;

        public C3926h(NSTIJKPlayerMulti3 nSTIJKPlayerMulti3) {
            this.f24088a = nSTIJKPlayerMulti3;
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.a
        /* renamed from: a */
        public void mo18794a(InterfaceC4042a.b bVar, int i10, int i11, int i12) {
            if (bVar.mo19699a() != this.f24088a.f24036H) {
                Log.e(this.f24088a.f24052b, "onSurfaceChanged: unmatched render callback\n");
                return;
            }
            this.f24088a.f24066l = i11;
            this.f24088a.f24067m = i12;
            boolean z10 = this.f24088a.f24058g == 3;
            boolean z11 = true;
            if (this.f24088a.f24036H.mo19697d()) {
                z11 = this.f24088a.f24064j == i11 && this.f24088a.f24065k == i12;
            }
            if (this.f24088a.f24062i != null && z10 && z11) {
                if (this.f24088a.f24075u != 0) {
                    NSTIJKPlayerMulti3 nSTIJKPlayerMulti3 = this.f24088a;
                    nSTIJKPlayerMulti3.seekTo(nSTIJKPlayerMulti3.f24075u);
                }
                this.f24088a.start();
            }
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.a
        /* renamed from: b */
        public void mo18795b(InterfaceC4042a.b bVar) {
            if (bVar.mo19699a() != this.f24088a.f24036H) {
                Log.e(this.f24088a.f24052b, "onSurfaceDestroyed: unmatched render callback\n");
            } else {
                this.f24088a.f24060h = null;
                this.f24088a.m19128U();
            }
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.a
        /* renamed from: c */
        public void mo18796c(InterfaceC4042a.b bVar, int i10, int i11) {
            if (bVar.mo19699a() != this.f24088a.f24036H) {
                Log.e(this.f24088a.f24052b, "onSurfaceCreated: unmatched render callback\n");
                return;
            }
            this.f24088a.f24060h = bVar;
            if (this.f24088a.f24062i == null) {
                this.f24088a.m19126S();
            } else {
                NSTIJKPlayerMulti3 nSTIJKPlayerMulti3 = this.f24088a;
                nSTIJKPlayerMulti3.m19115H(nSTIJKPlayerMulti3.f24062i, bVar);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti3$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti3$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti3$i.class */
    public class C3927i {

        /* renamed from: a */
        public final Activity f24089a;

        /* renamed from: b */
        public View f24090b;

        /* renamed from: c */
        public final NSTIJKPlayerMulti3 f24091c;

        public C3927i(NSTIJKPlayerMulti3 nSTIJKPlayerMulti3, Activity activity) {
            this.f24091c = nSTIJKPlayerMulti3;
            this.f24089a = activity;
        }

        /* renamed from: a */
        public C3927i m19138a() {
            View view = this.f24090b;
            if (view != null) {
                view.setVisibility(8);
            }
            return this;
        }

        /* renamed from: b */
        public C3927i m19139b(int i10) {
            this.f24090b = this.f24089a.findViewById(i10);
            return this;
        }

        /* renamed from: c */
        public C3927i m19140c() {
            View view = this.f24090b;
            if (view != null) {
                view.requestFocus();
            }
            return this;
        }

        /* renamed from: d */
        public C3927i m19141d(CharSequence charSequence) {
            View view = this.f24090b;
            if (view != null && (view instanceof TextView)) {
                ((TextView) view).setText(charSequence);
            }
            return this;
        }

        /* renamed from: e */
        public C3927i m19142e() {
            View view = this.f24090b;
            if (view != null) {
                view.setVisibility(0);
            }
            return this;
        }
    }

    public NSTIJKPlayerMulti3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24052b = "NSTIJKPlayerMulti3";
        this.f24055e = 0;
        this.f24056f = 0;
        this.f24058g = 0;
        this.f24060h = null;
        this.f24062i = null;
        this.f24076v = true;
        this.f24077w = true;
        this.f24078x = true;
        this.f24029A = 0;
        this.f24030B = 5;
        this.f24031C = false;
        this.f24045Q = new C3920b(this);
        this.f24046R = new C3921c(this);
        this.f24047S = new C3922d(this);
        this.f24048T = new C3923e(this);
        this.f24049U = new C3924f(this);
        this.f24050V = new C3925g(this);
        this.f24051W = new C3926h(this);
        this.f24057f0 = new ArrayList();
        this.f24059g0 = 0;
        this.f24061h0 = 0;
        this.f24063i0 = false;
        m19122O(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.view.View] */
    /* renamed from: G */
    public final void m19114G() {
        InterfaceC7706b interfaceC7706b;
        if (this.f24062i == null || (interfaceC7706b = this.f24069o) == null) {
            return;
        }
        interfaceC7706b.m33654c(this);
        this.f24069o.m33653b(getParent() instanceof View ? (View) getParent() : this);
        this.f24069o.setEnabled(m19124Q());
    }

    /* renamed from: H */
    public final void m19115H(IMediaPlayer iMediaPlayer, InterfaceC4042a.b bVar) {
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
    public tv.danmaku.ijk.media.player.IMediaPlayer m19116I(int r7) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti3.m19116I(int):tv.danmaku.ijk.media.player.IMediaPlayer");
    }

    /* renamed from: J */
    public void m19117J() {
        ServiceC6971a.m31982d(this.f24062i);
    }

    /* renamed from: K */
    public final void m19118K() {
        this.f24042N.m19139b(2131427510).m19138a();
        this.f24042N.m19139b(2131427521).m19138a();
        m19119L();
    }

    /* renamed from: L */
    public void m19119L() {
        this.f24042N.m19139b(2131427534).m19138a();
        this.f24042N.m19139b(2131427787).m19138a();
        this.f24042N.m19139b(2131428501).m19138a();
        this.f24079y.removeCallbacksAndMessages(null);
    }

    /* renamed from: M */
    public final void m19120M() {
        boolean m31278p = this.f24035G.m31278p();
        this.f24063i0 = m31278p;
        if (m31278p) {
            ServiceC6971a.m31980b(getContext());
            this.f24062i = ServiceC6971a.m31979a();
        }
    }

    /* renamed from: N */
    public final void m19121N() {
        this.f24057f0.clear();
        if (this.f24035G.m31281s()) {
            this.f24057f0.add(1);
        }
        if (this.f24035G.m31282t()) {
            this.f24057f0.add(2);
        }
        if (this.f24035G.m31280r()) {
            this.f24057f0.add(0);
        }
        if (this.f24057f0.isEmpty()) {
            this.f24057f0.add(1);
        }
        int intValue = this.f24057f0.get(this.f24059g0).intValue();
        this.f24061h0 = intValue;
        setRender(intValue);
    }

    /* renamed from: O */
    public final void m19122O(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f24034F = applicationContext;
        this.f24035G = new C6783a(applicationContext);
        m19120M();
        m19121N();
        this.f24064j = 0;
        this.f24065k = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f24056f = 0;
        this.f24058g = 0;
    }

    /* renamed from: P */
    public boolean m19123P() {
        return this.f24063i0;
    }

    /* renamed from: Q */
    public final boolean m19124Q() {
        int i10;
        boolean z10 = true;
        if (this.f24062i == null || (i10 = this.f24056f) == -1 || i10 == 0 || i10 == 1) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: R */
    public void m19125R() {
        IMediaPlayer iMediaPlayer = this.f24062i;
        if (iMediaPlayer != null) {
            iMediaPlayer.setVolume(0.0f, 0.0f);
        }
    }

    @TargetApi(23)
    /* renamed from: S */
    public void m19126S() {
        IMediaPlayer.OnErrorListener onErrorListener;
        IMediaPlayer iMediaPlayer;
        if (this.f24053c == null || this.f24060h == null) {
            return;
        }
        m19127T(false);
        try {
            ((AudioManager) this.f24034F.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        } catch (Exception e10) {
        }
        this.f24042N.m19139b(2131427521).m19138a();
        try {
            try {
                try {
                    IMediaPlayer m19116I = m19116I(this.f24035G.m31285w());
                    this.f24062i = m19116I;
                    m19116I.setOnPreparedListener(this.f24046R);
                    this.f24062i.setOnVideoSizeChangedListener(this.f24045Q);
                    this.f24062i.setOnCompletionListener(this.f24047S);
                    this.f24062i.setOnErrorListener(this.f24049U);
                    this.f24062i.setOnInfoListener(this.f24048T);
                    this.f24062i.setOnBufferingUpdateListener(this.f24050V);
                    this.f24072r = 0;
                    String scheme = this.f24053c.getScheme();
                    if (Build.VERSION.SDK_INT >= 23 && this.f24035G.m31246E() && (TextUtils.isEmpty(scheme) || scheme.equalsIgnoreCase(TransferTable.COLUMN_FILE))) {
                        this.f24062i.setDataSource(new C7705a(new File(this.f24053c.toString())));
                    } else {
                        this.f24062i.setDataSource(this.f24034F, this.f24053c, this.f24054d);
                    }
                    m19115H(this.f24062i, this.f24060h);
                    this.f24062i.setAudioStreamType(3);
                    this.f24062i.setScreenOnWhilePlaying(true);
                    this.f24062i.prepareAsync();
                    this.f24041M = (AudioManager) this.f24039K.getSystemService("audio");
                    this.f24056f = 1;
                } catch (IllegalArgumentException e11) {
                    Log.w(this.f24052b, "Unable to open content: " + this.f24053c, e11);
                    this.f24056f = -1;
                    this.f24058g = -1;
                    onErrorListener = this.f24049U;
                    iMediaPlayer = this.f24062i;
                    onErrorListener.onError(iMediaPlayer, 1, 0);
                } catch (NullPointerException e12) {
                    Log.w(this.f24052b, "Unable to open content: " + this.f24053c, e12);
                    this.f24056f = -1;
                    this.f24058g = -1;
                    onErrorListener = this.f24049U;
                    iMediaPlayer = this.f24062i;
                    onErrorListener.onError(iMediaPlayer, 1, 0);
                }
            } catch (IOException e13) {
                Log.w(this.f24052b, "Unable to open content: " + this.f24053c, e13);
                this.f24056f = -1;
                this.f24058g = -1;
                onErrorListener = this.f24049U;
                iMediaPlayer = this.f24062i;
                onErrorListener.onError(iMediaPlayer, 1, 0);
            }
        } catch (Exception e14) {
            Log.w(this.f24052b, "Unable to open content: " + this.f24053c, e14);
            this.f24056f = -1;
            this.f24058g = -1;
            onErrorListener = this.f24049U;
            iMediaPlayer = this.f24062i;
            onErrorListener.onError(iMediaPlayer, 1, 0);
        }
    }

    /* renamed from: T */
    public void m19127T(boolean z10) {
        IMediaPlayer iMediaPlayer = this.f24062i;
        if (iMediaPlayer != null) {
            iMediaPlayer.reset();
            this.f24062i.release();
            this.f24062i = null;
            this.f24056f = 0;
            if (z10) {
                this.f24058g = 0;
            }
            ((AudioManager) this.f24034F.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    /* renamed from: U */
    public void m19128U() {
        IMediaPlayer iMediaPlayer = this.f24062i;
        if (iMediaPlayer != null) {
            iMediaPlayer.setDisplay(null);
        }
    }

    /* renamed from: V */
    public void m19129V() {
        Handler handler = this.f24079y;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: W */
    public void m19130W(Activity activity, NSTIJKPlayerMulti3 nSTIJKPlayerMulti3) {
        this.f24039K = activity;
        this.f24040L = nSTIJKPlayerMulti3;
        this.f24079y = new Handler();
        this.f24042N = new C3927i(this, activity);
    }

    /* renamed from: X */
    public final void m19131X(Uri uri, Map<String, String> map, boolean z10, String str) {
        this.f24053c = uri;
        this.f24054d = map;
        this.f24075u = 0;
        this.f24080z = z10;
        m19136c0();
        m19126S();
        requestLayout();
        invalidate();
    }

    /* renamed from: Y */
    public void m19132Y(Uri uri, boolean z10, String str) {
        m19131X(uri, null, z10, str);
    }

    /* renamed from: Z */
    public final void m19133Z(String str) {
        this.f24042N.m19139b(2131429677).m19138a();
        this.f24042N.m19139b(2131427521).m19142e();
        this.f24042N.m19139b(2131427525).m19141d(str);
    }

    /* renamed from: a0 */
    public final void m19134a0(int i10) {
        this.f24055e = i10;
        if (i10 == -1) {
            if (this.f24029A < this.f24030B) {
                this.f24031C = true;
                this.f24079y.postDelayed(new RunnableC3919a(this), 3000L);
                return;
            }
            m19118K();
            this.f24053c = null;
            m19133Z(this.f24039K.getResources().getString(2132018603));
            m19136c0();
            this.f24031C = false;
            return;
        }
        if (i10 == 1) {
            this.f24042N.m19139b(2131427510).m19142e();
            return;
        }
        if (i10 == 3) {
            this.f24029A = 0;
            this.f24042N.m19139b(C10105q.f46302C).m19138a();
            this.f24042N.m19139b(C10105q.f46301B).m19142e();
            if (this.f24080z) {
                this.f24042N.m19139b(C10105q.f46301B).m19140c();
            }
        } else {
            if (i10 != 6) {
                if (i10 != 2) {
                    if (i10 == 4) {
                        this.f24042N.m19139b(C10105q.f46302C).m19142e();
                        this.f24042N.m19139b(C10105q.f46301B).m19138a();
                        if (this.f24080z) {
                            this.f24042N.m19139b(C10105q.f46302C).m19140c();
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f24029A = 0;
                this.f24042N.m19139b(2131427521).m19138a();
                this.f24042N.m19139b(2131429677).m19142e();
                this.f24042N.m19139b(C10105q.f46302C).m19138a();
                this.f24042N.m19139b(C10105q.f46301B).m19142e();
                this.f24042N.m19139b(2131427510).m19138a();
                if (this.f24039K.findViewById(2131427472).isFocusable()) {
                    return;
                }
                m19125R();
                return;
            }
            this.f24029A = 0;
            this.f24042N.m19139b(2131427521).m19138a();
            this.f24042N.m19139b(2131429677).m19142e();
            this.f24042N.m19139b(C10105q.f46302C).m19138a();
            this.f24042N.m19139b(C10105q.f46301B).m19142e();
        }
        this.f24042N.m19139b(2131427510).m19138a();
    }

    /* renamed from: b0 */
    public void m19135b0() {
        ServiceC6971a.m31982d(null);
    }

    /* renamed from: c0 */
    public void m19136c0() {
        IMediaPlayer iMediaPlayer = this.f24062i;
        if (iMediaPlayer != null) {
            iMediaPlayer.stop();
            this.f24062i.release();
            this.f24062i = null;
            this.f24056f = 0;
            this.f24058g = 0;
            ((AudioManager) this.f24034F.getSystemService("audio")).abandonAudioFocus(null);
            InterfaceC4042a.b bVar = this.f24060h;
            if (bVar == null || bVar.mo19701c() == null) {
                return;
            }
            this.f24060h.mo19701c().setFormat(-2);
            this.f24060h.mo19701c().setFormat(-1);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.f24076v;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.f24077w;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.f24078x;
    }

    /* renamed from: d0 */
    public void m19137d0() {
        IMediaPlayer iMediaPlayer = this.f24062i;
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
        if (this.f24062i != null) {
            return this.f24072r;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (m19124Q()) {
            return (int) this.f24062i.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (m19124Q()) {
            return (int) this.f24062i.getDuration();
        }
        return -1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        IMediaPlayer iMediaPlayer;
        return m19124Q() && (iMediaPlayer = this.f24062i) != null && iMediaPlayer.isPlaying();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10 = (i10 == 4 || i10 == 24 || i10 == 25 || i10 == 164 || i10 == 82 || i10 == 5 || i10 == 6) ? false : true;
        if (m19124Q() && z10 && this.f24069o != null) {
            if (i10 == 79 || i10 == 85) {
                IMediaPlayer iMediaPlayer = this.f24062i;
                if (iMediaPlayer == null || !iMediaPlayer.isPlaying()) {
                    start();
                    this.f24069o.m33655d();
                    return true;
                }
                pause();
                this.f24069o.show();
                return true;
            }
            if (i10 == 126) {
                IMediaPlayer iMediaPlayer2 = this.f24062i;
                if (iMediaPlayer2 == null || iMediaPlayer2.isPlaying()) {
                    return true;
                }
                start();
                this.f24069o.m33655d();
                return true;
            }
            if (i10 == 86 || i10 == 127) {
                IMediaPlayer iMediaPlayer3 = this.f24062i;
                if (iMediaPlayer3 == null || !iMediaPlayer3.isPlaying()) {
                    return true;
                }
                pause();
                this.f24069o.show();
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        IMediaPlayer iMediaPlayer;
        if (m19124Q() && (iMediaPlayer = this.f24062i) != null && iMediaPlayer.isPlaying()) {
            this.f24062i.pause();
            this.f24056f = 4;
        }
        this.f24058g = 4;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i10) {
        int i11 = i10;
        if (m19124Q()) {
            this.f24062i.seekTo(i10);
            i11 = 0;
        }
        this.f24075u = i11;
    }

    public void setContext(Context context) {
        this.f24044P = context;
    }

    public void setLiveStreamDBHandler(LiveStreamDBHandler liveStreamDBHandler) {
        this.f24043O = liveStreamDBHandler;
    }

    public void setMediaController(InterfaceC7706b interfaceC7706b) {
        InterfaceC7706b interfaceC7706b2 = this.f24069o;
        if (interfaceC7706b2 != null) {
            interfaceC7706b2.m33655d();
        }
        this.f24069o = interfaceC7706b;
        m19114G();
    }

    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.f24070p = onCompletionListener;
    }

    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        this.f24073s = onErrorListener;
    }

    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.f24074t = onInfoListener;
    }

    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.f24071q = onPreparedListener;
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
                Log.e(this.f24052b, String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i10)));
                return;
            }
            C4044c c4044c = new C4044c(getContext());
            c4043b = c4044c;
            if (this.f24062i != null) {
                c4044c.getSurfaceHolder().mo19700b(this.f24062i);
                c4044c.mo19696c(this.f24062i.getVideoWidth(), this.f24062i.getVideoHeight());
                c4044c.mo19694a(this.f24062i.getVideoSarNum(), this.f24062i.getVideoSarDen());
                c4043b = c4044c;
            }
        }
        setRenderView(c4043b);
    }

    public void setRenderView(InterfaceC4042a interfaceC4042a) {
        int i10;
        int i11;
        if (this.f24036H != null) {
            IMediaPlayer iMediaPlayer = this.f24062i;
            if (iMediaPlayer != null) {
                iMediaPlayer.setDisplay(null);
            }
            View view = this.f24036H.getView();
            this.f24036H.mo19695b(this.f24051W);
            this.f24036H = null;
            removeView(view);
        }
        if (interfaceC4042a == null) {
            return;
        }
        this.f24036H = interfaceC4042a;
        this.f24032D = this.f24034F.getSharedPreferences("loginPrefs", 0);
        int i12 = this.f24064j;
        if (i12 > 0 && (i11 = this.f24065k) > 0) {
            interfaceC4042a.mo19696c(i12, i11);
        }
        int i13 = this.f24037I;
        if (i13 > 0 && (i10 = this.f24038J) > 0) {
            interfaceC4042a.mo19694a(i13, i10);
        }
        View view2 = this.f24036H.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(view2);
        this.f24036H.mo19698e(this.f24051W);
        this.f24036H.setVideoRotation(this.f24068n);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (m19124Q()) {
            this.f24062i.start();
            this.f24056f = 3;
        }
        this.f24058g = 3;
    }
}

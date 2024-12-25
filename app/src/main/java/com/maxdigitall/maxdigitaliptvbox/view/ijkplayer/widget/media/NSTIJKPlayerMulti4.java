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
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti4.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti4.class */
public class NSTIJKPlayerMulti4 extends FrameLayout implements MediaController.MediaPlayerControl {

    /* renamed from: A */
    public int f24092A;

    /* renamed from: B */
    public int f24093B;

    /* renamed from: C */
    public boolean f24094C;

    /* renamed from: D */
    public SharedPreferences f24095D;

    /* renamed from: E */
    public SharedPreferences f24096E;

    /* renamed from: F */
    public Context f24097F;

    /* renamed from: G */
    public C6783a f24098G;

    /* renamed from: H */
    public InterfaceC4042a f24099H;

    /* renamed from: I */
    public int f24100I;

    /* renamed from: J */
    public int f24101J;

    /* renamed from: K */
    public Activity f24102K;

    /* renamed from: L */
    public NSTIJKPlayerMulti4 f24103L;

    /* renamed from: M */
    public AudioManager f24104M;

    /* renamed from: N */
    public C3936i f24105N;

    /* renamed from: O */
    public LiveStreamDBHandler f24106O;

    /* renamed from: P */
    public Context f24107P;

    /* renamed from: Q */
    public IMediaPlayer.OnVideoSizeChangedListener f24108Q;

    /* renamed from: R */
    public IMediaPlayer.OnPreparedListener f24109R;

    /* renamed from: S */
    public IMediaPlayer.OnCompletionListener f24110S;

    /* renamed from: T */
    public IMediaPlayer.OnInfoListener f24111T;

    /* renamed from: U */
    public IMediaPlayer.OnErrorListener f24112U;

    /* renamed from: V */
    public IMediaPlayer.OnBufferingUpdateListener f24113V;

    /* renamed from: W */
    public InterfaceC4042a.a f24114W;

    /* renamed from: b */
    public String f24115b;

    /* renamed from: c */
    public Uri f24116c;

    /* renamed from: d */
    public Map<String, String> f24117d;

    /* renamed from: e */
    public int f24118e;

    /* renamed from: f */
    public int f24119f;

    /* renamed from: f0 */
    public List<Integer> f24120f0;

    /* renamed from: g */
    public int f24121g;

    /* renamed from: g0 */
    public int f24122g0;

    /* renamed from: h */
    public InterfaceC4042a.b f24123h;

    /* renamed from: h0 */
    public int f24124h0;

    /* renamed from: i */
    public IMediaPlayer f24125i;

    /* renamed from: i0 */
    public boolean f24126i0;

    /* renamed from: j */
    public int f24127j;

    /* renamed from: k */
    public int f24128k;

    /* renamed from: l */
    public int f24129l;

    /* renamed from: m */
    public int f24130m;

    /* renamed from: n */
    public int f24131n;

    /* renamed from: o */
    public InterfaceC7706b f24132o;

    /* renamed from: p */
    public IMediaPlayer.OnCompletionListener f24133p;

    /* renamed from: q */
    public IMediaPlayer.OnPreparedListener f24134q;

    /* renamed from: r */
    public int f24135r;

    /* renamed from: s */
    public IMediaPlayer.OnErrorListener f24136s;

    /* renamed from: t */
    public IMediaPlayer.OnInfoListener f24137t;

    /* renamed from: u */
    public int f24138u;

    /* renamed from: v */
    public boolean f24139v;

    /* renamed from: w */
    public boolean f24140w;

    /* renamed from: x */
    public boolean f24141x;

    /* renamed from: y */
    public Handler f24142y;

    /* renamed from: z */
    public boolean f24143z;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti4$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti4$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti4$a.class */
    public class RunnableC3928a implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerMulti4 f24144b;

        public RunnableC3928a(NSTIJKPlayerMulti4 nSTIJKPlayerMulti4) {
            this.f24144b = nSTIJKPlayerMulti4;
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerMulti4 nSTIJKPlayerMulti4 = this.f24144b;
            nSTIJKPlayerMulti4.f24092A++;
            nSTIJKPlayerMulti4.m19179K();
            C5255e.m26241k0(this.f24144b.f24102K, this.f24144b.f24102K.getResources().getString(2132018322) + " (" + this.f24144b.f24092A + "/" + this.f24144b.f24093B + ")");
            this.f24144b.m19187S();
            this.f24144b.start();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti4$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti4$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti4$b.class */
    public class C3929b implements IMediaPlayer.OnVideoSizeChangedListener {

        /* renamed from: a */
        public final NSTIJKPlayerMulti4 f24145a;

        public C3929b(NSTIJKPlayerMulti4 nSTIJKPlayerMulti4) {
            this.f24145a = nSTIJKPlayerMulti4;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i10, int i11, int i12, int i13) {
            this.f24145a.f24127j = iMediaPlayer.getVideoWidth();
            this.f24145a.f24128k = iMediaPlayer.getVideoHeight();
            this.f24145a.f24100I = iMediaPlayer.getVideoSarNum();
            this.f24145a.f24101J = iMediaPlayer.getVideoSarDen();
            if (this.f24145a.f24127j == 0 || this.f24145a.f24128k == 0) {
                return;
            }
            if (this.f24145a.f24099H != null) {
                this.f24145a.f24099H.mo19696c(this.f24145a.f24127j, this.f24145a.f24128k);
                this.f24145a.f24099H.mo19694a(this.f24145a.f24100I, this.f24145a.f24101J);
            }
            this.f24145a.requestLayout();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti4$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti4$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti4$c.class */
    public class C3930c implements IMediaPlayer.OnPreparedListener {

        /* renamed from: a */
        public final NSTIJKPlayerMulti4 f24146a;

        public C3930c(NSTIJKPlayerMulti4 nSTIJKPlayerMulti4) {
            this.f24146a = nSTIJKPlayerMulti4;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            this.f24146a.f24119f = 2;
            if (this.f24146a.f24134q != null) {
                this.f24146a.f24134q.onPrepared(this.f24146a.f24125i);
            }
            if (this.f24146a.f24132o != null) {
                this.f24146a.f24132o.setEnabled(true);
            }
            this.f24146a.f24127j = iMediaPlayer.getVideoWidth();
            this.f24146a.f24128k = iMediaPlayer.getVideoHeight();
            if (this.f24146a.f24127j == 0 || this.f24146a.f24128k == 0) {
                if (this.f24146a.f24121g == 3) {
                    this.f24146a.start();
                }
            } else if (this.f24146a.f24099H != null) {
                this.f24146a.f24099H.mo19696c(this.f24146a.f24127j, this.f24146a.f24128k);
                this.f24146a.f24099H.mo19694a(this.f24146a.f24100I, this.f24146a.f24101J);
                if ((!this.f24146a.f24099H.mo19697d() || (this.f24146a.f24129l == this.f24146a.f24127j && this.f24146a.f24130m == this.f24146a.f24128k)) && this.f24146a.f24121g == 3) {
                    this.f24146a.start();
                    if (this.f24146a.f24132o != null) {
                        this.f24146a.f24132o.show();
                    }
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti4$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti4$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti4$d.class */
    public class C3931d implements IMediaPlayer.OnCompletionListener {

        /* renamed from: a */
        public final NSTIJKPlayerMulti4 f24147a;

        public C3931d(NSTIJKPlayerMulti4 nSTIJKPlayerMulti4) {
            this.f24147a = nSTIJKPlayerMulti4;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            this.f24147a.f24119f = 5;
            this.f24147a.f24121g = 5;
            if (this.f24147a.f24132o != null) {
                this.f24147a.f24132o.m33655d();
            }
            this.f24147a.m19195a0(-1);
            if (this.f24147a.f24133p != null) {
                this.f24147a.f24133p.onCompletion(this.f24147a.f24125i);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti4$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti4$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti4$e.class */
    public class C3932e implements IMediaPlayer.OnInfoListener {

        /* renamed from: a */
        public final NSTIJKPlayerMulti4 f24148a;

        public C3932e(NSTIJKPlayerMulti4 nSTIJKPlayerMulti4) {
            this.f24148a = nSTIJKPlayerMulti4;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i10, int i11) {
            String str;
            String str2;
            if (this.f24148a.f24137t != null) {
                this.f24148a.f24137t.onInfo(iMediaPlayer, i10, i11);
            }
            if (i10 == 3) {
                this.f24148a.m19195a0(2);
                str = this.f24148a.f24115b;
                str2 = "MEDIA_INFO_VIDEO_RENDERING_START:";
            } else if (i10 == 10005) {
                this.f24148a.m19195a0(1);
                str = this.f24148a.f24115b;
                str2 = "MEDIA_INFO_OPEN_INPUT:";
            } else if (i10 == 901) {
                str = this.f24148a.f24115b;
                str2 = "MEDIA_INFO_UNSUPPORTED_SUBTITLE:";
            } else if (i10 == 902) {
                str = this.f24148a.f24115b;
                str2 = "MEDIA_INFO_SUBTITLE_TIMED_OUT:";
            } else {
                if (i10 == 10001) {
                    this.f24148a.f24131n = i11;
                    Log.d(this.f24148a.f24115b, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i11);
                    if (this.f24148a.f24099H == null) {
                        return true;
                    }
                    this.f24148a.f24099H.setVideoRotation(i11);
                    return true;
                }
                if (i10 != 10002) {
                    switch (i10) {
                        case 700:
                            str = this.f24148a.f24115b;
                            str2 = "MEDIA_INFO_VIDEO_TRACK_LAGGING:";
                            break;
                        case IMediaPlayer.MEDIA_INFO_BUFFERING_START /* 701 */:
                            this.f24148a.m19195a0(1);
                            str = this.f24148a.f24115b;
                            str2 = "MEDIA_INFO_BUFFERING_START:";
                            break;
                        case IMediaPlayer.MEDIA_INFO_BUFFERING_END /* 702 */:
                            this.f24148a.m19195a0(6);
                            str = this.f24148a.f24115b;
                            str2 = "MEDIA_INFO_BUFFERING_END:";
                            break;
                        case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                            str = this.f24148a.f24115b;
                            str2 = "MEDIA_INFO_NETWORK_BANDWIDTH: " + i11;
                            break;
                        default:
                            switch (i10) {
                                case 800:
                                    str = this.f24148a.f24115b;
                                    str2 = "MEDIA_INFO_BAD_INTERLEAVING:";
                                    break;
                                case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                    str = this.f24148a.f24115b;
                                    str2 = "MEDIA_INFO_NOT_SEEKABLE:";
                                    break;
                                case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                    str = this.f24148a.f24115b;
                                    str2 = "MEDIA_INFO_METADATA_UPDATE:";
                                    break;
                                default:
                                    return true;
                            }
                    }
                } else {
                    str = this.f24148a.f24115b;
                    str2 = "MEDIA_INFO_AUDIO_RENDERING_START:";
                }
            }
            Log.d(str, str2);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti4$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti4$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti4$f.class */
    public class C3933f implements IMediaPlayer.OnErrorListener {

        /* renamed from: a */
        public final NSTIJKPlayerMulti4 f24149a;

        public C3933f(NSTIJKPlayerMulti4 nSTIJKPlayerMulti4) {
            this.f24149a = nSTIJKPlayerMulti4;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i10, int i11) {
            Log.d(this.f24149a.f24115b, "Error: " + i10 + "," + i11);
            this.f24149a.f24119f = -1;
            this.f24149a.f24121g = -1;
            if (this.f24149a.f24132o != null) {
                this.f24149a.f24132o.m33655d();
            }
            this.f24149a.m19195a0(-1);
            if (this.f24149a.f24136s == null) {
                return true;
            }
            this.f24149a.f24136s.onError(this.f24149a.f24125i, i10, i11);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti4$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti4$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti4$g.class */
    public class C3934g implements IMediaPlayer.OnBufferingUpdateListener {

        /* renamed from: a */
        public final NSTIJKPlayerMulti4 f24150a;

        public C3934g(NSTIJKPlayerMulti4 nSTIJKPlayerMulti4) {
            this.f24150a = nSTIJKPlayerMulti4;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i10) {
            this.f24150a.f24135r = i10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti4$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti4$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti4$h.class */
    public class C3935h implements InterfaceC4042a.a {

        /* renamed from: a */
        public final NSTIJKPlayerMulti4 f24151a;

        public C3935h(NSTIJKPlayerMulti4 nSTIJKPlayerMulti4) {
            this.f24151a = nSTIJKPlayerMulti4;
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.a
        /* renamed from: a */
        public void mo18794a(InterfaceC4042a.b bVar, int i10, int i11, int i12) {
            if (bVar.mo19699a() != this.f24151a.f24099H) {
                Log.e(this.f24151a.f24115b, "onSurfaceChanged: unmatched render callback\n");
                return;
            }
            this.f24151a.f24129l = i11;
            this.f24151a.f24130m = i12;
            boolean z10 = this.f24151a.f24121g == 3;
            boolean z11 = true;
            if (this.f24151a.f24099H.mo19697d()) {
                z11 = this.f24151a.f24127j == i11 && this.f24151a.f24128k == i12;
            }
            if (this.f24151a.f24125i != null && z10 && z11) {
                if (this.f24151a.f24138u != 0) {
                    NSTIJKPlayerMulti4 nSTIJKPlayerMulti4 = this.f24151a;
                    nSTIJKPlayerMulti4.seekTo(nSTIJKPlayerMulti4.f24138u);
                }
                this.f24151a.start();
            }
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.a
        /* renamed from: b */
        public void mo18795b(InterfaceC4042a.b bVar) {
            if (bVar.mo19699a() != this.f24151a.f24099H) {
                Log.e(this.f24151a.f24115b, "onSurfaceDestroyed: unmatched render callback\n");
            } else {
                this.f24151a.f24123h = null;
                this.f24151a.m19189U();
            }
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.a
        /* renamed from: c */
        public void mo18796c(InterfaceC4042a.b bVar, int i10, int i11) {
            if (bVar.mo19699a() != this.f24151a.f24099H) {
                Log.e(this.f24151a.f24115b, "onSurfaceCreated: unmatched render callback\n");
                return;
            }
            this.f24151a.f24123h = bVar;
            if (this.f24151a.f24125i == null) {
                this.f24151a.m19187S();
            } else {
                NSTIJKPlayerMulti4 nSTIJKPlayerMulti4 = this.f24151a;
                nSTIJKPlayerMulti4.m19176H(nSTIJKPlayerMulti4.f24125i, bVar);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti4$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti4$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerMulti4$i.class */
    public class C3936i {

        /* renamed from: a */
        public final Activity f24152a;

        /* renamed from: b */
        public View f24153b;

        /* renamed from: c */
        public final NSTIJKPlayerMulti4 f24154c;

        public C3936i(NSTIJKPlayerMulti4 nSTIJKPlayerMulti4, Activity activity) {
            this.f24154c = nSTIJKPlayerMulti4;
            this.f24152a = activity;
        }

        /* renamed from: a */
        public C3936i m19199a() {
            View view = this.f24153b;
            if (view != null) {
                view.setVisibility(8);
            }
            return this;
        }

        /* renamed from: b */
        public C3936i m19200b(int i10) {
            this.f24153b = this.f24152a.findViewById(i10);
            return this;
        }

        /* renamed from: c */
        public C3936i m19201c() {
            View view = this.f24153b;
            if (view != null) {
                view.requestFocus();
            }
            return this;
        }

        /* renamed from: d */
        public C3936i m19202d(CharSequence charSequence) {
            View view = this.f24153b;
            if (view != null && (view instanceof TextView)) {
                ((TextView) view).setText(charSequence);
            }
            return this;
        }

        /* renamed from: e */
        public C3936i m19203e() {
            View view = this.f24153b;
            if (view != null) {
                view.setVisibility(0);
            }
            return this;
        }
    }

    public NSTIJKPlayerMulti4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24115b = "NSTIJKPlayerMulti4";
        this.f24118e = 0;
        this.f24119f = 0;
        this.f24121g = 0;
        this.f24123h = null;
        this.f24125i = null;
        this.f24139v = true;
        this.f24140w = true;
        this.f24141x = true;
        this.f24092A = 0;
        this.f24093B = 5;
        this.f24094C = false;
        this.f24108Q = new C3929b(this);
        this.f24109R = new C3930c(this);
        this.f24110S = new C3931d(this);
        this.f24111T = new C3932e(this);
        this.f24112U = new C3933f(this);
        this.f24113V = new C3934g(this);
        this.f24114W = new C3935h(this);
        this.f24120f0 = new ArrayList();
        this.f24122g0 = 0;
        this.f24124h0 = 0;
        this.f24126i0 = false;
        m19183O(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.view.View] */
    /* renamed from: G */
    public final void m19175G() {
        InterfaceC7706b interfaceC7706b;
        if (this.f24125i == null || (interfaceC7706b = this.f24132o) == null) {
            return;
        }
        interfaceC7706b.m33654c(this);
        this.f24132o.m33653b(getParent() instanceof View ? (View) getParent() : this);
        this.f24132o.setEnabled(m19185Q());
    }

    /* renamed from: H */
    public final void m19176H(IMediaPlayer iMediaPlayer, InterfaceC4042a.b bVar) {
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
    public tv.danmaku.ijk.media.player.IMediaPlayer m19177I(int r7) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti4.m19177I(int):tv.danmaku.ijk.media.player.IMediaPlayer");
    }

    /* renamed from: J */
    public void m19178J() {
        ServiceC6971a.m31982d(this.f24125i);
    }

    /* renamed from: K */
    public final void m19179K() {
        this.f24105N.m19200b(2131427511).m19199a();
        this.f24105N.m19200b(2131427522).m19199a();
        m19180L();
    }

    /* renamed from: L */
    public void m19180L() {
        this.f24105N.m19200b(2131427535).m19199a();
        this.f24105N.m19200b(2131427788).m19199a();
        this.f24105N.m19200b(2131428502).m19199a();
        this.f24142y.removeCallbacksAndMessages(null);
    }

    /* renamed from: M */
    public final void m19181M() {
        boolean m31278p = this.f24098G.m31278p();
        this.f24126i0 = m31278p;
        if (m31278p) {
            ServiceC6971a.m31980b(getContext());
            this.f24125i = ServiceC6971a.m31979a();
        }
    }

    /* renamed from: N */
    public final void m19182N() {
        this.f24120f0.clear();
        if (this.f24098G.m31281s()) {
            this.f24120f0.add(1);
        }
        if (this.f24098G.m31282t()) {
            this.f24120f0.add(2);
        }
        if (this.f24098G.m31280r()) {
            this.f24120f0.add(0);
        }
        if (this.f24120f0.isEmpty()) {
            this.f24120f0.add(1);
        }
        int intValue = this.f24120f0.get(this.f24122g0).intValue();
        this.f24124h0 = intValue;
        setRender(intValue);
    }

    /* renamed from: O */
    public final void m19183O(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f24097F = applicationContext;
        this.f24098G = new C6783a(applicationContext);
        m19181M();
        m19182N();
        this.f24127j = 0;
        this.f24128k = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f24119f = 0;
        this.f24121g = 0;
    }

    /* renamed from: P */
    public boolean m19184P() {
        return this.f24126i0;
    }

    /* renamed from: Q */
    public final boolean m19185Q() {
        int i10;
        boolean z10 = true;
        if (this.f24125i == null || (i10 = this.f24119f) == -1 || i10 == 0 || i10 == 1) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: R */
    public void m19186R() {
        IMediaPlayer iMediaPlayer = this.f24125i;
        if (iMediaPlayer != null) {
            iMediaPlayer.setVolume(0.0f, 0.0f);
        }
    }

    @TargetApi(23)
    /* renamed from: S */
    public void m19187S() {
        IMediaPlayer.OnErrorListener onErrorListener;
        IMediaPlayer iMediaPlayer;
        if (this.f24116c == null || this.f24123h == null) {
            return;
        }
        m19188T(false);
        try {
            ((AudioManager) this.f24097F.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        } catch (Exception e10) {
        }
        this.f24105N.m19200b(2131427522).m19199a();
        try {
            try {
                try {
                    IMediaPlayer m19177I = m19177I(this.f24098G.m31285w());
                    this.f24125i = m19177I;
                    m19177I.setOnPreparedListener(this.f24109R);
                    this.f24125i.setOnVideoSizeChangedListener(this.f24108Q);
                    this.f24125i.setOnCompletionListener(this.f24110S);
                    this.f24125i.setOnErrorListener(this.f24112U);
                    this.f24125i.setOnInfoListener(this.f24111T);
                    this.f24125i.setOnBufferingUpdateListener(this.f24113V);
                    this.f24135r = 0;
                    String scheme = this.f24116c.getScheme();
                    if (Build.VERSION.SDK_INT >= 23 && this.f24098G.m31246E() && (TextUtils.isEmpty(scheme) || scheme.equalsIgnoreCase(TransferTable.COLUMN_FILE))) {
                        this.f24125i.setDataSource(new C7705a(new File(this.f24116c.toString())));
                    } else {
                        this.f24125i.setDataSource(this.f24097F, this.f24116c, this.f24117d);
                    }
                    m19176H(this.f24125i, this.f24123h);
                    this.f24125i.setAudioStreamType(3);
                    this.f24125i.setScreenOnWhilePlaying(true);
                    this.f24125i.prepareAsync();
                    this.f24104M = (AudioManager) this.f24102K.getSystemService("audio");
                    this.f24119f = 1;
                } catch (IllegalArgumentException e11) {
                    Log.w(this.f24115b, "Unable to open content: " + this.f24116c, e11);
                    this.f24119f = -1;
                    this.f24121g = -1;
                    onErrorListener = this.f24112U;
                    iMediaPlayer = this.f24125i;
                    onErrorListener.onError(iMediaPlayer, 1, 0);
                } catch (NullPointerException e12) {
                    Log.w(this.f24115b, "Unable to open content: " + this.f24116c, e12);
                    this.f24119f = -1;
                    this.f24121g = -1;
                    onErrorListener = this.f24112U;
                    iMediaPlayer = this.f24125i;
                    onErrorListener.onError(iMediaPlayer, 1, 0);
                }
            } catch (IOException e13) {
                Log.w(this.f24115b, "Unable to open content: " + this.f24116c, e13);
                this.f24119f = -1;
                this.f24121g = -1;
                onErrorListener = this.f24112U;
                iMediaPlayer = this.f24125i;
                onErrorListener.onError(iMediaPlayer, 1, 0);
            }
        } catch (Exception e14) {
            Log.w(this.f24115b, "Unable to open content: " + this.f24116c, e14);
            this.f24119f = -1;
            this.f24121g = -1;
            onErrorListener = this.f24112U;
            iMediaPlayer = this.f24125i;
            onErrorListener.onError(iMediaPlayer, 1, 0);
        }
    }

    /* renamed from: T */
    public void m19188T(boolean z10) {
        IMediaPlayer iMediaPlayer = this.f24125i;
        if (iMediaPlayer != null) {
            iMediaPlayer.reset();
            this.f24125i.release();
            this.f24125i = null;
            this.f24119f = 0;
            if (z10) {
                this.f24121g = 0;
            }
            ((AudioManager) this.f24097F.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    /* renamed from: U */
    public void m19189U() {
        IMediaPlayer iMediaPlayer = this.f24125i;
        if (iMediaPlayer != null) {
            iMediaPlayer.setDisplay(null);
        }
    }

    /* renamed from: V */
    public void m19190V() {
        Handler handler = this.f24142y;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: W */
    public void m19191W(Activity activity, NSTIJKPlayerMulti4 nSTIJKPlayerMulti4) {
        this.f24102K = activity;
        this.f24103L = nSTIJKPlayerMulti4;
        this.f24142y = new Handler();
        this.f24105N = new C3936i(this, activity);
    }

    /* renamed from: X */
    public final void m19192X(Uri uri, Map<String, String> map, boolean z10, String str) {
        this.f24116c = uri;
        this.f24117d = map;
        this.f24138u = 0;
        this.f24143z = z10;
        m19197c0();
        m19187S();
        requestLayout();
        invalidate();
    }

    /* renamed from: Y */
    public void m19193Y(Uri uri, boolean z10, String str) {
        m19192X(uri, null, z10, str);
    }

    /* renamed from: Z */
    public final void m19194Z(String str) {
        this.f24105N.m19200b(2131429678).m19199a();
        this.f24105N.m19200b(2131427522).m19203e();
        this.f24105N.m19200b(2131427526).m19202d(str);
    }

    /* renamed from: a0 */
    public final void m19195a0(int i10) {
        this.f24118e = i10;
        if (i10 == -1) {
            if (this.f24092A < this.f24093B) {
                this.f24094C = true;
                this.f24142y.postDelayed(new RunnableC3928a(this), 3000L);
                return;
            }
            m19179K();
            this.f24116c = null;
            m19194Z(this.f24102K.getResources().getString(2132018603));
            m19197c0();
            this.f24094C = false;
            return;
        }
        if (i10 == 1) {
            this.f24105N.m19200b(2131427511).m19203e();
            return;
        }
        if (i10 == 3) {
            this.f24092A = 0;
            this.f24105N.m19200b(C10105q.f46302C).m19199a();
            this.f24105N.m19200b(C10105q.f46301B).m19203e();
            if (this.f24143z) {
                this.f24105N.m19200b(C10105q.f46301B).m19201c();
            }
        } else {
            if (i10 != 6) {
                if (i10 != 2) {
                    if (i10 == 4) {
                        this.f24105N.m19200b(C10105q.f46302C).m19203e();
                        this.f24105N.m19200b(C10105q.f46301B).m19199a();
                        if (this.f24143z) {
                            this.f24105N.m19200b(C10105q.f46302C).m19201c();
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f24092A = 0;
                this.f24105N.m19200b(2131427522).m19199a();
                this.f24105N.m19200b(2131429678).m19203e();
                this.f24105N.m19200b(C10105q.f46302C).m19199a();
                this.f24105N.m19200b(C10105q.f46301B).m19203e();
                this.f24105N.m19200b(2131427511).m19199a();
                if (this.f24102K.findViewById(2131427473).isFocusable()) {
                    return;
                }
                m19186R();
                return;
            }
            this.f24092A = 0;
            this.f24105N.m19200b(2131427522).m19199a();
            this.f24105N.m19200b(2131429678).m19203e();
            this.f24105N.m19200b(C10105q.f46302C).m19199a();
            this.f24105N.m19200b(C10105q.f46301B).m19203e();
        }
        this.f24105N.m19200b(2131427511).m19199a();
    }

    /* renamed from: b0 */
    public void m19196b0() {
        ServiceC6971a.m31982d(null);
    }

    /* renamed from: c0 */
    public void m19197c0() {
        IMediaPlayer iMediaPlayer = this.f24125i;
        if (iMediaPlayer != null) {
            iMediaPlayer.stop();
            this.f24125i.release();
            this.f24125i = null;
            this.f24119f = 0;
            this.f24121g = 0;
            ((AudioManager) this.f24097F.getSystemService("audio")).abandonAudioFocus(null);
            InterfaceC4042a.b bVar = this.f24123h;
            if (bVar == null || bVar.mo19701c() == null) {
                return;
            }
            this.f24123h.mo19701c().setFormat(-2);
            this.f24123h.mo19701c().setFormat(-1);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.f24139v;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.f24140w;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.f24141x;
    }

    /* renamed from: d0 */
    public void m19198d0() {
        IMediaPlayer iMediaPlayer = this.f24125i;
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
        if (this.f24125i != null) {
            return this.f24135r;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (m19185Q()) {
            return (int) this.f24125i.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (m19185Q()) {
            return (int) this.f24125i.getDuration();
        }
        return -1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        IMediaPlayer iMediaPlayer;
        return m19185Q() && (iMediaPlayer = this.f24125i) != null && iMediaPlayer.isPlaying();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10 = (i10 == 4 || i10 == 24 || i10 == 25 || i10 == 164 || i10 == 82 || i10 == 5 || i10 == 6) ? false : true;
        if (m19185Q() && z10 && this.f24132o != null) {
            if (i10 == 79 || i10 == 85) {
                IMediaPlayer iMediaPlayer = this.f24125i;
                if (iMediaPlayer == null || !iMediaPlayer.isPlaying()) {
                    start();
                    this.f24132o.m33655d();
                    return true;
                }
                pause();
                this.f24132o.show();
                return true;
            }
            if (i10 == 126) {
                IMediaPlayer iMediaPlayer2 = this.f24125i;
                if (iMediaPlayer2 == null || iMediaPlayer2.isPlaying()) {
                    return true;
                }
                start();
                this.f24132o.m33655d();
                return true;
            }
            if (i10 == 86 || i10 == 127) {
                IMediaPlayer iMediaPlayer3 = this.f24125i;
                if (iMediaPlayer3 == null || !iMediaPlayer3.isPlaying()) {
                    return true;
                }
                pause();
                this.f24132o.show();
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        IMediaPlayer iMediaPlayer;
        if (m19185Q() && (iMediaPlayer = this.f24125i) != null && iMediaPlayer.isPlaying()) {
            this.f24125i.pause();
            this.f24119f = 4;
        }
        this.f24121g = 4;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i10) {
        int i11 = i10;
        if (m19185Q()) {
            this.f24125i.seekTo(i10);
            i11 = 0;
        }
        this.f24138u = i11;
    }

    public void setContext(Context context) {
        this.f24107P = context;
    }

    public void setLiveStreamDBHandler(LiveStreamDBHandler liveStreamDBHandler) {
        this.f24106O = liveStreamDBHandler;
    }

    public void setMediaController(InterfaceC7706b interfaceC7706b) {
        InterfaceC7706b interfaceC7706b2 = this.f24132o;
        if (interfaceC7706b2 != null) {
            interfaceC7706b2.m33655d();
        }
        this.f24132o = interfaceC7706b;
        m19175G();
    }

    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.f24133p = onCompletionListener;
    }

    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        this.f24136s = onErrorListener;
    }

    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.f24137t = onInfoListener;
    }

    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.f24134q = onPreparedListener;
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
                Log.e(this.f24115b, String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i10)));
                return;
            }
            C4044c c4044c = new C4044c(getContext());
            c4043b = c4044c;
            if (this.f24125i != null) {
                c4044c.getSurfaceHolder().mo19700b(this.f24125i);
                c4044c.mo19696c(this.f24125i.getVideoWidth(), this.f24125i.getVideoHeight());
                c4044c.mo19694a(this.f24125i.getVideoSarNum(), this.f24125i.getVideoSarDen());
                c4043b = c4044c;
            }
        }
        setRenderView(c4043b);
    }

    public void setRenderView(InterfaceC4042a interfaceC4042a) {
        int i10;
        int i11;
        if (this.f24099H != null) {
            IMediaPlayer iMediaPlayer = this.f24125i;
            if (iMediaPlayer != null) {
                iMediaPlayer.setDisplay(null);
            }
            View view = this.f24099H.getView();
            this.f24099H.mo19695b(this.f24114W);
            this.f24099H = null;
            removeView(view);
        }
        if (interfaceC4042a == null) {
            return;
        }
        this.f24099H = interfaceC4042a;
        this.f24095D = this.f24097F.getSharedPreferences("loginPrefs", 0);
        int i12 = this.f24127j;
        if (i12 > 0 && (i11 = this.f24128k) > 0) {
            interfaceC4042a.mo19696c(i12, i11);
        }
        int i13 = this.f24100I;
        if (i13 > 0 && (i10 = this.f24101J) > 0) {
            interfaceC4042a.mo19694a(i13, i10);
        }
        View view2 = this.f24099H.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(view2);
        this.f24099H.mo19698e(this.f24114W);
        this.f24099H.setVideoRotation(this.f24131n);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (m19185Q()) {
            this.f24125i.start();
            this.f24119f = 3;
        }
        this.f24121g = 3;
    }
}

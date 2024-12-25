package com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.appcompat.app.DialogC0242a;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferTable;
import com.maxdigitall.maxdigitaliptvbox.model.callback.VodInfoCallback;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity;
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import nf.C6783a;
import org.achartengine.renderer.DefaultRenderer;
import org.apache.commons.net.tftp.TFTP;
import org.apache.http.protocol.HttpRequestExecutor;
import p050d0.C4290b;
import p151if.C5251a;
import p151if.C5255e;
import p170jf.C5378j;
import p216m9.C5974n;
import p250of.ServiceC6971a;
import p324sf.InterfaceC8574m;
import p440z8.C10105q;
import pf.C7705a;
import pf.C7709e;
import pf.InterfaceC7706b;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkTimedText;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;
import tv.danmaku.ijk.media.player.misc.ITrackInfo;
import tv.danmaku.ijk.media.player.misc.IjkMediaFormat;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky.class */
public class NSTIJKPlayerSky extends FrameLayout implements MediaController.MediaPlayerControl, InterfaceC8574m {

    /* renamed from: Y1 */
    public static final int[] f24260Y1 = {0, 1, 2, 3, 4, 5};

    /* renamed from: A */
    public long f24261A;

    /* renamed from: A0 */
    public boolean f24262A0;

    /* renamed from: A1 */
    public boolean f24263A1;

    /* renamed from: B */
    public boolean f24264B;

    /* renamed from: B0 */
    public boolean f24265B0;

    /* renamed from: B1 */
    public String f24266B1;

    /* renamed from: C */
    public boolean f24267C;

    /* renamed from: C0 */
    public SharedPreferences f24268C0;

    /* renamed from: C1 */
    public String f24269C1;

    /* renamed from: D */
    public int f24270D;

    /* renamed from: D0 */
    public SharedPreferences f24271D0;

    /* renamed from: D1 */
    public Handler f24272D1;

    /* renamed from: E */
    public Handler f24273E;

    /* renamed from: E0 */
    public SharedPreferences f24274E0;

    /* renamed from: E1 */
    public Context f24275E1;

    /* renamed from: F */
    public Handler f24276F;

    /* renamed from: F0 */
    public SharedPreferences f24277F0;

    /* renamed from: F1 */
    public LiveStreamDBHandler f24278F1;

    /* renamed from: G */
    public int f24279G;

    /* renamed from: G0 */
    public SharedPreferences.Editor f24280G0;

    /* renamed from: G1 */
    public AbstractC3970w f24281G1;

    /* renamed from: H */
    public boolean f24282H;

    /* renamed from: H0 */
    public SharedPreferences.Editor f24283H0;

    /* renamed from: H1 */
    public final SeekBar.OnSeekBarChangeListener f24284H1;

    /* renamed from: I */
    public int f24285I;

    /* renamed from: I0 */
    public SharedPreferences.Editor f24286I0;

    /* renamed from: I1 */
    public final SeekBar.OnSeekBarChangeListener f24287I1;

    /* renamed from: J */
    public int f24288J;

    /* renamed from: J0 */
    public boolean f24289J0;

    /* renamed from: J1 */
    public IMediaPlayer.OnVideoSizeChangedListener f24290J1;

    /* renamed from: K */
    public boolean f24291K;

    /* renamed from: K0 */
    public boolean f24292K0;

    /* renamed from: K1 */
    public IMediaPlayer.OnPreparedListener f24293K1;

    /* renamed from: L */
    public SharedPreferences f24294L;

    /* renamed from: L0 */
    public SharedPreferences f24295L0;

    /* renamed from: L1 */
    public IMediaPlayer.OnCompletionListener f24296L1;

    /* renamed from: M */
    public SharedPreferences.Editor f24297M;

    /* renamed from: M0 */
    public C5378j f24298M0;

    /* renamed from: M1 */
    public IMediaPlayer.OnInfoListener f24299M1;

    /* renamed from: N */
    public SharedPreferences f24300N;

    /* renamed from: N0 */
    public boolean f24301N0;

    /* renamed from: N1 */
    public IMediaPlayer.OnErrorListener f24302N1;

    /* renamed from: O */
    public Context f24303O;

    /* renamed from: O0 */
    public TextView f24304O0;

    /* renamed from: O1 */
    public IMediaPlayer.OnBufferingUpdateListener f24305O1;

    /* renamed from: P */
    public C6783a f24306P;

    /* renamed from: P0 */
    public TextView f24307P0;

    /* renamed from: P1 */
    public IMediaPlayer.OnSeekCompleteListener f24308P1;

    /* renamed from: Q */
    public InterfaceC4042a f24309Q;

    /* renamed from: Q0 */
    public TextView f24310Q0;

    /* renamed from: Q1 */
    public IMediaPlayer.OnTimedTextListener f24311Q1;

    /* renamed from: R */
    public int f24312R;

    /* renamed from: R0 */
    public RadioGroup f24313R0;

    /* renamed from: R1 */
    public InterfaceC4042a.a f24314R1;

    /* renamed from: S */
    public int f24315S;

    /* renamed from: S0 */
    public RadioGroup f24316S0;

    /* renamed from: S1 */
    public int f24317S1;

    /* renamed from: T */
    public long f24318T;

    /* renamed from: T0 */
    public RadioGroup f24319T0;

    /* renamed from: T1 */
    public int f24320T1;

    /* renamed from: U */
    public long f24321U;

    /* renamed from: U0 */
    public SharedPreferences.Editor f24322U0;

    /* renamed from: U1 */
    public List<Integer> f24323U1;

    /* renamed from: V */
    public long f24324V;

    /* renamed from: V0 */
    public TextView f24325V0;

    /* renamed from: V1 */
    public int f24326V1;

    /* renamed from: W */
    public long f24327W;

    /* renamed from: W0 */
    public FrameLayout f24328W0;

    /* renamed from: W1 */
    public int f24329W1;

    /* renamed from: X0 */
    public DialogC0242a f24330X0;

    /* renamed from: X1 */
    public boolean f24331X1;

    /* renamed from: Y0 */
    public SeekBar f24332Y0;

    /* renamed from: Z0 */
    public SeekBar f24333Z0;

    /* renamed from: a1 */
    public LinearLayout f24334a1;

    /* renamed from: b */
    public String f24335b;

    /* renamed from: b1 */
    public Handler f24336b1;

    /* renamed from: c */
    public Uri f24337c;

    /* renamed from: c1 */
    public Runnable f24338c1;

    /* renamed from: d */
    public String f24339d;

    /* renamed from: d1 */
    public Handler f24340d1;

    /* renamed from: e */
    public Map<String, String> f24341e;

    /* renamed from: e1 */
    public Runnable f24342e1;

    /* renamed from: f */
    public int f24343f;

    /* renamed from: f0 */
    public TextView f24344f0;

    /* renamed from: f1 */
    public Animation f24345f1;

    /* renamed from: g */
    public int f24346g;

    /* renamed from: g0 */
    public String f24347g0;

    /* renamed from: g1 */
    public Animation f24348g1;

    /* renamed from: h */
    public int f24349h;

    /* renamed from: h0 */
    public Activity f24350h0;

    /* renamed from: h1 */
    public ImageView f24351h1;

    /* renamed from: i */
    public InterfaceC4042a.b f24352i;

    /* renamed from: i0 */
    public NSTIJKPlayerSky f24353i0;

    /* renamed from: i1 */
    public ImageView f24354i1;

    /* renamed from: j */
    public IMediaPlayer f24355j;

    /* renamed from: j0 */
    public AudioManager f24356j0;

    /* renamed from: j1 */
    public LinearLayout f24357j1;

    /* renamed from: k */
    public int f24358k;

    /* renamed from: k0 */
    public int f24359k0;

    /* renamed from: k1 */
    public LinearLayout f24360k1;

    /* renamed from: l */
    public int f24361l;

    /* renamed from: l0 */
    public float f24362l0;

    /* renamed from: l1 */
    public int f24363l1;

    /* renamed from: m */
    public int f24364m;

    /* renamed from: m0 */
    public GestureDetector f24365m0;

    /* renamed from: m1 */
    public TextView f24366m1;

    /* renamed from: n */
    public int f24367n;

    /* renamed from: n0 */
    public int f24368n0;

    /* renamed from: n1 */
    public TextView f24369n1;

    /* renamed from: o */
    public int f24370o;

    /* renamed from: o0 */
    public View f24371o0;

    /* renamed from: o1 */
    public LinearLayout f24372o1;

    /* renamed from: p */
    public InterfaceC7706b f24373p;

    /* renamed from: p0 */
    public C3973z f24374p0;

    /* renamed from: p1 */
    public Animation f24375p1;

    /* renamed from: q */
    public IMediaPlayer.OnCompletionListener f24376q;

    /* renamed from: q0 */
    public Button f24377q0;

    /* renamed from: q1 */
    public Animation f24378q1;

    /* renamed from: r */
    public IMediaPlayer.OnPreparedListener f24379r;

    /* renamed from: r0 */
    public Boolean f24380r0;

    /* renamed from: r1 */
    public RelativeLayout f24381r1;

    /* renamed from: s */
    public int f24382s;

    /* renamed from: s0 */
    public Boolean f24383s0;

    /* renamed from: s1 */
    public Animation f24384s1;

    /* renamed from: t */
    public IMediaPlayer.OnErrorListener f24385t;

    /* renamed from: t0 */
    public Boolean f24386t0;

    /* renamed from: t1 */
    public LinearLayout f24387t1;

    /* renamed from: u */
    public IMediaPlayer.OnInfoListener f24388u;

    /* renamed from: u0 */
    public Boolean f24389u0;

    /* renamed from: u1 */
    public Animation f24390u1;

    /* renamed from: v */
    public int f24391v;

    /* renamed from: v0 */
    public Boolean f24392v0;

    /* renamed from: v1 */
    public Animation f24393v1;

    /* renamed from: w */
    public boolean f24394w;

    /* renamed from: w0 */
    public Boolean f24395w0;

    /* renamed from: w1 */
    public Animation f24396w1;

    /* renamed from: x */
    public boolean f24397x;

    /* renamed from: x0 */
    public boolean f24398x0;

    /* renamed from: x1 */
    public SharedPreferences f24399x1;

    /* renamed from: y */
    public boolean f24400y;

    /* renamed from: y0 */
    public StringBuilder f24401y0;

    /* renamed from: y1 */
    public RelativeLayout f24402y1;

    /* renamed from: z */
    public int f24403z;

    /* renamed from: z0 */
    public Formatter f24404z0;

    /* renamed from: z1 */
    public boolean f24405z1;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$a.class */
    public class C3948a implements IMediaPlayer.OnInfoListener {

        /* renamed from: a */
        public final NSTIJKPlayerSky f24406a;

        public C3948a(NSTIJKPlayerSky nSTIJKPlayerSky) {
            this.f24406a = nSTIJKPlayerSky;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i10, int i11) {
            String str;
            String str2;
            if (this.f24406a.f24388u != null) {
                this.f24406a.f24388u.onInfo(iMediaPlayer, i10, i11);
            }
            if (i10 == 3) {
                this.f24406a.m19357i1(2);
                str = this.f24406a.f24335b;
                str2 = "MEDIA_INFO_VIDEO_RENDERING_START:";
            } else if (i10 == 10005) {
                this.f24406a.m19357i1(1);
                str = this.f24406a.f24335b;
                str2 = "MEDIA_INFO_OPEN_INPUT:";
            } else if (i10 == 901) {
                str = this.f24406a.f24335b;
                str2 = "MEDIA_INFO_UNSUPPORTED_SUBTITLE:";
            } else if (i10 == 902) {
                str = this.f24406a.f24335b;
                str2 = "MEDIA_INFO_SUBTITLE_TIMED_OUT:";
            } else {
                if (i10 == 10001) {
                    this.f24406a.f24370o = i11;
                    Log.d(this.f24406a.f24335b, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i11);
                    InterfaceC4042a interfaceC4042a = this.f24406a.f24309Q;
                    if (interfaceC4042a == null) {
                        return true;
                    }
                    interfaceC4042a.setVideoRotation(i11);
                    return true;
                }
                if (i10 != 10002) {
                    switch (i10) {
                        case 700:
                            str = this.f24406a.f24335b;
                            str2 = "MEDIA_INFO_VIDEO_TRACK_LAGGING:";
                            break;
                        case IMediaPlayer.MEDIA_INFO_BUFFERING_START /* 701 */:
                            this.f24406a.m19357i1(1);
                            str = this.f24406a.f24335b;
                            str2 = "MEDIA_INFO_BUFFERING_START:";
                            break;
                        case IMediaPlayer.MEDIA_INFO_BUFFERING_END /* 702 */:
                            this.f24406a.m19357i1(6);
                            str = this.f24406a.f24335b;
                            str2 = "MEDIA_INFO_BUFFERING_END:";
                            break;
                        case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                            str = this.f24406a.f24335b;
                            str2 = "MEDIA_INFO_NETWORK_BANDWIDTH: " + i11;
                            break;
                        default:
                            switch (i10) {
                                case 800:
                                    str = this.f24406a.f24335b;
                                    str2 = "MEDIA_INFO_BAD_INTERLEAVING:";
                                    break;
                                case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                    str = this.f24406a.f24335b;
                                    str2 = "MEDIA_INFO_NOT_SEEKABLE:";
                                    break;
                                case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                    str = this.f24406a.f24335b;
                                    str2 = "MEDIA_INFO_METADATA_UPDATE:";
                                    break;
                                default:
                                    return true;
                            }
                    }
                } else {
                    str = this.f24406a.f24335b;
                    str2 = "MEDIA_INFO_AUDIO_RENDERING_START:";
                }
            }
            Log.d(str, str2);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$b.class */
    public class C3949b implements IMediaPlayer.OnErrorListener {

        /* renamed from: a */
        public final NSTIJKPlayerSky f24407a;

        public C3949b(NSTIJKPlayerSky nSTIJKPlayerSky) {
            this.f24407a = nSTIJKPlayerSky;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i10, int i11) {
            Log.d(this.f24407a.f24335b, "Error: " + i10 + "," + i11);
            this.f24407a.f24346g = -1;
            this.f24407a.f24349h = -1;
            if (this.f24407a.f24373p != null) {
                this.f24407a.f24373p.m33655d();
            }
            this.f24407a.m19357i1(-1);
            if (this.f24407a.f24385t == null) {
                return true;
            }
            this.f24407a.f24385t.onError(this.f24407a.f24355j, i10, i11);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$c.class */
    public class C3950c implements IMediaPlayer.OnBufferingUpdateListener {

        /* renamed from: a */
        public final NSTIJKPlayerSky f24408a;

        public C3950c(NSTIJKPlayerSky nSTIJKPlayerSky) {
            this.f24408a = nSTIJKPlayerSky;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i10) {
            this.f24408a.f24382s = i10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$d.class */
    public class C3951d implements IMediaPlayer.OnSeekCompleteListener {

        /* renamed from: a */
        public final NSTIJKPlayerSky f24409a;

        public C3951d(NSTIJKPlayerSky nSTIJKPlayerSky) {
            this.f24409a = nSTIJKPlayerSky;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            this.f24409a.f24327W = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$e.class */
    public class C3952e implements IMediaPlayer.OnTimedTextListener {

        /* renamed from: a */
        public final NSTIJKPlayerSky f24410a;

        public C3952e(NSTIJKPlayerSky nSTIJKPlayerSky) {
            this.f24410a = nSTIJKPlayerSky;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnTimedTextListener
        public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            String str;
            TextView textView;
            if (ijkTimedText == null) {
                this.f24410a.f24344f0.setVisibility(8);
                return;
            }
            String replace = ijkTimedText.getText().replace("{\\b1}", "").replace("{\\b0}", "").replace("{\\i1}", "").replace("{\\i0}", "").replace("{\\c}", "");
            StringBuilder sb2 = new StringBuilder();
            try {
                if (replace.contains("{")) {
                    for (String str2 : replace.split("\\{")) {
                        String str3 = str2;
                        if (str2.contains("}")) {
                            str3 = str2.substring(str2.lastIndexOf("}") + 1);
                        }
                        sb2.append(str3);
                    }
                }
            } catch (Exception e10) {
            }
            NSTIJKPlayerSky nSTIJKPlayerSky = this.f24410a;
            nSTIJKPlayerSky.f24295L0 = nSTIJKPlayerSky.f24303O.getSharedPreferences("pref.using_sub_font_size", 0);
            try {
                this.f24410a.f24344f0.setTextSize(2, Float.parseFloat(this.f24410a.f24295L0.getString("pref.using_sub_font_size", C5251a.f30039f0)));
            } catch (Exception e11) {
            }
            if (this.f24410a.getShowOrHideSubtitles().equals("visible")) {
                this.f24410a.f24344f0.setVisibility(0);
            } else {
                this.f24410a.f24344f0.setVisibility(8);
            }
            if (sb2.length() > 0) {
                textView = this.f24410a.f24344f0;
                str = sb2.toString();
            } else {
                str = replace;
                textView = this.f24410a.f24344f0;
            }
            textView.setText(str);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$f.class */
    public class C3953f implements InterfaceC4042a.a {

        /* renamed from: a */
        public final NSTIJKPlayerSky f24411a;

        public C3953f(NSTIJKPlayerSky nSTIJKPlayerSky) {
            this.f24411a = nSTIJKPlayerSky;
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.a
        /* renamed from: a */
        public void mo18794a(InterfaceC4042a.b bVar, int i10, int i11, int i12) {
            InterfaceC4042a mo19699a = bVar.mo19699a();
            NSTIJKPlayerSky nSTIJKPlayerSky = this.f24411a;
            if (mo19699a != nSTIJKPlayerSky.f24309Q) {
                Log.e(nSTIJKPlayerSky.f24335b, "onSurfaceChanged: unmatched render callback\n");
                return;
            }
            nSTIJKPlayerSky.f24364m = i11;
            this.f24411a.f24367n = i12;
            boolean z10 = this.f24411a.f24349h == 3;
            boolean z11 = true;
            if (this.f24411a.f24309Q.mo19697d()) {
                z11 = this.f24411a.f24358k == i11 && this.f24411a.f24361l == i12;
            }
            if (this.f24411a.f24355j != null && z10 && z11) {
                if (this.f24411a.f24391v != 0) {
                    NSTIJKPlayerSky nSTIJKPlayerSky2 = this.f24411a;
                    nSTIJKPlayerSky2.seekTo(nSTIJKPlayerSky2.f24391v);
                }
                this.f24411a.start();
            }
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.a
        /* renamed from: b */
        public void mo18795b(InterfaceC4042a.b bVar) {
            InterfaceC4042a mo19699a = bVar.mo19699a();
            NSTIJKPlayerSky nSTIJKPlayerSky = this.f24411a;
            if (mo19699a != nSTIJKPlayerSky.f24309Q) {
                Log.e(nSTIJKPlayerSky.f24335b, "onSurfaceDestroyed: unmatched render callback\n");
            } else {
                nSTIJKPlayerSky.f24352i = null;
                this.f24411a.m19345W0();
            }
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.a
        /* renamed from: c */
        public void mo18796c(InterfaceC4042a.b bVar, int i10, int i11) {
            InterfaceC4042a mo19699a = bVar.mo19699a();
            NSTIJKPlayerSky nSTIJKPlayerSky = this.f24411a;
            if (mo19699a != nSTIJKPlayerSky.f24309Q) {
                Log.e(nSTIJKPlayerSky.f24335b, "onSurfaceCreated: unmatched render callback\n");
                return;
            }
            nSTIJKPlayerSky.f24352i = bVar;
            if (this.f24411a.f24355j == null) {
                this.f24411a.m19343U0();
            } else {
                NSTIJKPlayerSky nSTIJKPlayerSky2 = this.f24411a;
                nSTIJKPlayerSky2.m19330H0(nSTIJKPlayerSky2.f24355j, bVar);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$g.class */
    public class RunnableC3954g implements Runnable {

        /* renamed from: b */
        public final LinearLayout f24412b;

        /* renamed from: c */
        public final NSTIJKPlayerSky f24413c;

        public RunnableC3954g(NSTIJKPlayerSky nSTIJKPlayerSky, LinearLayout linearLayout) {
            this.f24413c = nSTIJKPlayerSky;
            this.f24412b = linearLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f24412b.setVisibility(8);
            if (this.f24413c.f24334a1.getVisibility() != 0 || this.f24413c.f24372o1 == null) {
                return;
            }
            this.f24413c.f24372o1.setVisibility(0);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$h.class */
    public class ViewOnClickListenerC3955h implements View.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerSky f24414b;

        public ViewOnClickListenerC3955h(NSTIJKPlayerSky nSTIJKPlayerSky) {
            this.f24414b = nSTIJKPlayerSky;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f24414b.m19362n1();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$i.class */
    public class C3956i implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a */
        public final int f24415a;

        /* renamed from: b */
        public final NSTIJKPlayerSky f24416b;

        public C3956i(NSTIJKPlayerSky nSTIJKPlayerSky, int i10) {
            this.f24416b = nSTIJKPlayerSky;
            this.f24415a = i10;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i10) {
            NSTIJKPlayerSky nSTIJKPlayerSky = this.f24416b;
            nSTIJKPlayerSky.f24286I0 = nSTIJKPlayerSky.f24277F0.edit();
            if (i10 == 111 || i10 == 11111111) {
                this.f24416b.f24286I0.putInt("currentVideoTrack", -1);
                this.f24416b.m19333K0(this.f24415a);
            } else {
                this.f24416b.f24286I0.putInt("currentVideoTrack", i10);
                this.f24416b.m19349a1(i10);
            }
            this.f24416b.f24286I0.apply();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$j.class */
    public class C3957j implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a */
        public final int f24417a;

        /* renamed from: b */
        public final NSTIJKPlayerSky f24418b;

        public C3957j(NSTIJKPlayerSky nSTIJKPlayerSky, int i10) {
            this.f24418b = nSTIJKPlayerSky;
            this.f24417a = i10;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i10) {
            NSTIJKPlayerSky nSTIJKPlayerSky = this.f24418b;
            nSTIJKPlayerSky.f24283H0 = nSTIJKPlayerSky.f24274E0.edit();
            if (i10 == 1111 || i10 == 1111111) {
                this.f24418b.f24283H0.putInt("currentAudioTrack", -1);
                this.f24418b.m19333K0(this.f24417a);
            } else {
                this.f24418b.f24283H0.putInt("currentAudioTrack", i10);
                int currentPosition = (int) this.f24418b.f24355j.getCurrentPosition();
                this.f24418b.m19349a1(i10);
                this.f24418b.f24355j.seekTo(Long.parseLong(String.valueOf(currentPosition)));
            }
            this.f24418b.f24283H0.apply();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$k.class */
    public class C3958k implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: b */
        public final NSTIJKPlayerSky f24419b;

        public C3958k(NSTIJKPlayerSky nSTIJKPlayerSky) {
            this.f24419b = nSTIJKPlayerSky;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            TextView textView;
            Resources resources;
            int i11;
            this.f24419b.f24362l0 = i10;
            int i12 = (int) ((this.f24419b.f24362l0 / 255.0f) * 100.0f);
            if (i12 < 20) {
                textView = this.f24419b.f24366m1;
                resources = this.f24419b.getResources();
                i11 = 2131231123;
            } else if (i12 < 30) {
                textView = this.f24419b.f24366m1;
                resources = this.f24419b.getResources();
                i11 = 2131231124;
            } else if (i12 < 40) {
                textView = this.f24419b.f24366m1;
                resources = this.f24419b.getResources();
                i11 = 2131231125;
            } else if (i12 < 50) {
                textView = this.f24419b.f24366m1;
                resources = this.f24419b.getResources();
                i11 = 2131231126;
            } else if (i12 < 60) {
                textView = this.f24419b.f24366m1;
                resources = this.f24419b.getResources();
                i11 = 2131231127;
            } else if (i12 < 70) {
                textView = this.f24419b.f24366m1;
                resources = this.f24419b.getResources();
                i11 = 2131231128;
            } else {
                textView = this.f24419b.f24366m1;
                resources = this.f24419b.getResources();
                i11 = 2131231129;
            }
            textView.setBackground(resources.getDrawable(i11));
            WindowManager.LayoutParams attributes = this.f24419b.f24350h0.getWindow().getAttributes();
            attributes.screenBrightness = this.f24419b.f24362l0 / 255.0f;
            this.f24419b.f24306P.m31256O((int) this.f24419b.f24362l0);
            this.f24419b.f24350h0.getWindow().setAttributes(attributes);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            this.f24419b.m19359k1();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            this.f24419b.m19359k1();
            this.f24419b.m19328F0(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$l.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$l.class */
    public class C3959l implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a */
        public final int f24420a;

        /* renamed from: b */
        public final NSTIJKPlayerSky f24421b;

        public C3959l(NSTIJKPlayerSky nSTIJKPlayerSky, int i10) {
            this.f24421b = nSTIJKPlayerSky;
            this.f24420a = i10;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i10) {
            NSTIJKPlayerSky nSTIJKPlayerSky = this.f24421b;
            nSTIJKPlayerSky.f24280G0 = nSTIJKPlayerSky.f24271D0.edit();
            if (i10 == 11111 || i10 == 111111) {
                TextView textView = this.f24421b.f24344f0;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                this.f24421b.f24280G0.putInt("currentSubtitleTrack", -1);
                this.f24421b.m19333K0(this.f24420a);
            } else {
                TextView textView2 = this.f24421b.f24344f0;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                this.f24421b.f24280G0.putInt("currentSubtitleTrack", i10);
                this.f24421b.m19349a1(i10);
            }
            this.f24421b.f24280G0.apply();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$m.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky$m */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$m.class */
    public class DialogInterfaceOnClickListenerC3960m implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerSky f24422b;

        public DialogInterfaceOnClickListenerC3960m(NSTIJKPlayerSky nSTIJKPlayerSky) {
            this.f24422b = nSTIJKPlayerSky;
        }

        @Override // android.content.DialogInterface.OnClickListener
        @SuppressLint({"SetTextI18n"})
        public void onClick(DialogInterface dialogInterface, int i10) {
            NSTIJKPlayerSky nSTIJKPlayerSky;
            String str;
            switch (i10) {
                case 0:
                    nSTIJKPlayerSky = this.f24422b;
                    str = "10";
                    break;
                case 1:
                    nSTIJKPlayerSky = this.f24422b;
                    str = "12";
                    break;
                case 2:
                    nSTIJKPlayerSky = this.f24422b;
                    str = "14";
                    break;
                case 3:
                    nSTIJKPlayerSky = this.f24422b;
                    str = "16";
                    break;
                case 4:
                    nSTIJKPlayerSky = this.f24422b;
                    str = "18";
                    break;
                case 5:
                    nSTIJKPlayerSky = this.f24422b;
                    str = "20";
                    break;
                case 6:
                    nSTIJKPlayerSky = this.f24422b;
                    str = "22";
                    break;
                case 7:
                    nSTIJKPlayerSky = this.f24422b;
                    str = "24";
                    break;
                case 8:
                    nSTIJKPlayerSky = this.f24422b;
                    str = "26";
                    break;
                case 9:
                    nSTIJKPlayerSky = this.f24422b;
                    str = "28";
                    break;
                case 10:
                    nSTIJKPlayerSky = this.f24422b;
                    str = "30";
                    break;
                case 11:
                    nSTIJKPlayerSky = this.f24422b;
                    str = "32";
                    break;
                case 12:
                    nSTIJKPlayerSky = this.f24422b;
                    str = "34";
                    break;
                case 13:
                    nSTIJKPlayerSky = this.f24422b;
                    str = "36";
                    break;
                case 14:
                    nSTIJKPlayerSky = this.f24422b;
                    str = "38";
                    break;
                case 15:
                    nSTIJKPlayerSky = this.f24422b;
                    str = "40";
                    break;
                default:
                    return;
            }
            nSTIJKPlayerSky.m19363o1(str);
            this.f24422b.f24325V0.setText(str);
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$n.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky$n */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$n.class */
    public class DialogInterfaceOnDismissListenerC3961n implements DialogInterface.OnDismissListener {

        /* renamed from: b */
        public final NSTIJKPlayerSky f24423b;

        public DialogInterfaceOnDismissListenerC3961n(NSTIJKPlayerSky nSTIJKPlayerSky) {
            this.f24423b = nSTIJKPlayerSky;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$o.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky$o */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$o.class */
    public class C3962o implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: b */
        public final NSTIJKPlayerSky f24424b;

        public C3962o(NSTIJKPlayerSky nSTIJKPlayerSky) {
            this.f24424b = nSTIJKPlayerSky;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            TextView textView;
            Drawable drawable;
            Resources resources;
            if (this.f24424b.f24356j0 != null) {
                try {
                    this.f24424b.f24356j0.setStreamVolume(3, i10, 0);
                    int streamVolume = (int) ((this.f24424b.f24356j0.getStreamVolume(3) / this.f24424b.f24359k0) * 100.0f);
                    if (streamVolume == 0 || streamVolume < 0) {
                        textView = this.f24424b.f24369n1;
                        drawable = this.f24424b.getResources().getDrawable(2131231157);
                    } else if (streamVolume < 40) {
                        textView = this.f24424b.f24369n1;
                        drawable = this.f24424b.getResources().getDrawable(2131231154);
                    } else if (streamVolume < 80) {
                        textView = this.f24424b.f24369n1;
                        drawable = this.f24424b.getResources().getDrawable(2131231155);
                    } else {
                        if (streamVolume < 100) {
                            textView = this.f24424b.f24369n1;
                            resources = this.f24424b.getResources();
                        } else {
                            textView = this.f24424b.f24369n1;
                            resources = this.f24424b.getResources();
                        }
                        drawable = resources.getDrawable(2131231156);
                    }
                    textView.setBackground(drawable);
                } catch (Exception e10) {
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            this.f24424b.m19359k1();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            this.f24424b.m19359k1();
            this.f24424b.m19328F0(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$p.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky$p */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$p.class */
    public class ViewOnTouchListenerC3963p implements View.OnTouchListener {

        /* renamed from: b */
        public final NSTIJKPlayerSky f24425b;

        public ViewOnTouchListenerC3963p(NSTIJKPlayerSky nSTIJKPlayerSky) {
            this.f24425b = nSTIJKPlayerSky;
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return (((LinearLayout) this.f24425b.f24350h0.findViewById(2131428428)).getVisibility() == 0 || motionEvent == null || !this.f24425b.f24365m0.onTouchEvent(motionEvent)) ? false : true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$q.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky$q */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$q.class */
    public class RunnableC3964q implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerSky f24426b;

        public RunnableC3964q(NSTIJKPlayerSky nSTIJKPlayerSky) {
            this.f24426b = nSTIJKPlayerSky;
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSky nSTIJKPlayerSky = this.f24426b;
            nSTIJKPlayerSky.f24285I++;
            C5255e.m26241k0(nSTIJKPlayerSky.f24350h0, this.f24426b.f24350h0.getResources().getString(2132018322) + " (" + this.f24426b.f24285I + "/" + this.f24426b.f24288J + ")");
            this.f24426b.m19343U0();
            this.f24426b.start();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$r.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky$r */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$r.class */
    public class RunnableC3965r implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerSky f24427b;

        public RunnableC3965r(NSTIJKPlayerSky nSTIJKPlayerSky) {
            this.f24427b = nSTIJKPlayerSky;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f24427b.m19337O0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$s.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky$s */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$s.class */
    public class RunnableC3966s implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerSky f24428b;

        public RunnableC3966s(NSTIJKPlayerSky nSTIJKPlayerSky) {
            this.f24428b = nSTIJKPlayerSky;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f24428b.m19336N0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$t.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky$t */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$t.class */
    public class C3967t implements IMediaPlayer.OnVideoSizeChangedListener {

        /* renamed from: a */
        public final NSTIJKPlayerSky f24429a;

        public C3967t(NSTIJKPlayerSky nSTIJKPlayerSky) {
            this.f24429a = nSTIJKPlayerSky;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i10, int i11, int i12, int i13) {
            this.f24429a.f24358k = iMediaPlayer.getVideoWidth();
            this.f24429a.f24361l = iMediaPlayer.getVideoHeight();
            this.f24429a.f24312R = iMediaPlayer.getVideoSarNum();
            this.f24429a.f24315S = iMediaPlayer.getVideoSarDen();
            if (this.f24429a.f24358k == 0 || this.f24429a.f24361l == 0) {
                return;
            }
            NSTIJKPlayerSky nSTIJKPlayerSky = this.f24429a;
            InterfaceC4042a interfaceC4042a = nSTIJKPlayerSky.f24309Q;
            if (interfaceC4042a != null) {
                interfaceC4042a.mo19696c(nSTIJKPlayerSky.f24358k, this.f24429a.f24361l);
                NSTIJKPlayerSky nSTIJKPlayerSky2 = this.f24429a;
                nSTIJKPlayerSky2.f24309Q.mo19694a(nSTIJKPlayerSky2.f24312R, this.f24429a.f24315S);
            }
            this.f24429a.requestLayout();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$u.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky$u */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$u.class */
    public class C3968u implements IMediaPlayer.OnPreparedListener {

        /* renamed from: a */
        public final NSTIJKPlayerSky f24430a;

        public C3968u(NSTIJKPlayerSky nSTIJKPlayerSky) {
            this.f24430a = nSTIJKPlayerSky;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            this.f24430a.f24321U = System.currentTimeMillis();
            this.f24430a.f24346g = 2;
            if (this.f24430a.f24379r != null) {
                this.f24430a.f24379r.onPrepared(this.f24430a.f24355j);
            }
            if (this.f24430a.f24373p != null) {
                this.f24430a.f24373p.setEnabled(true);
            }
            this.f24430a.f24358k = iMediaPlayer.getVideoWidth();
            this.f24430a.f24361l = iMediaPlayer.getVideoHeight();
            int i10 = this.f24430a.f24391v;
            if (i10 != 0) {
                this.f24430a.seekTo(i10);
            }
            if (this.f24430a.f24358k == 0 || this.f24430a.f24361l == 0) {
                if (this.f24430a.f24349h == 3) {
                    this.f24430a.start();
                    return;
                }
                return;
            }
            NSTIJKPlayerSky nSTIJKPlayerSky = this.f24430a;
            InterfaceC4042a interfaceC4042a = nSTIJKPlayerSky.f24309Q;
            if (interfaceC4042a != null) {
                interfaceC4042a.mo19696c(nSTIJKPlayerSky.f24358k, this.f24430a.f24361l);
                NSTIJKPlayerSky nSTIJKPlayerSky2 = this.f24430a;
                nSTIJKPlayerSky2.f24309Q.mo19694a(nSTIJKPlayerSky2.f24312R, this.f24430a.f24315S);
                if (!this.f24430a.f24309Q.mo19697d() || (this.f24430a.f24364m == this.f24430a.f24358k && this.f24430a.f24367n == this.f24430a.f24361l)) {
                    if (this.f24430a.f24349h == 3) {
                        this.f24430a.start();
                        if (this.f24430a.f24373p != null) {
                            this.f24430a.f24373p.show();
                            return;
                        }
                        return;
                    }
                    if (this.f24430a.isPlaying()) {
                        return;
                    }
                    if ((i10 != 0 || this.f24430a.getCurrentPosition() > 0) && this.f24430a.f24373p != null) {
                        this.f24430a.f24373p.show(0);
                    }
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$v.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky$v */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$v.class */
    public class C3969v implements IMediaPlayer.OnCompletionListener {

        /* renamed from: a */
        public final NSTIJKPlayerSky f24431a;

        public C3969v(NSTIJKPlayerSky nSTIJKPlayerSky) {
            this.f24431a = nSTIJKPlayerSky;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            this.f24431a.f24346g = 5;
            this.f24431a.f24349h = 5;
            if (this.f24431a.f24373p != null) {
                this.f24431a.f24373p.m33655d();
            }
            this.f24431a.m19359k1();
            this.f24431a.m19353e1();
            this.f24431a.m19328F0(TFTP.DEFAULT_TIMEOUT);
            if (this.f24431a.f24376q != null) {
                this.f24431a.f24376q.onCompletion(this.f24431a.f24355j);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$w.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky$w */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$w.class */
    public static abstract class AbstractC3970w {
        /* renamed from: a */
        public abstract void mo17780a();

        /* renamed from: b */
        public abstract void mo17781b();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$x.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky$x */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$x.class */
    public class ViewOnFocusChangeListenerC3971x implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f24432b;

        /* renamed from: c */
        public final NSTIJKPlayerSky f24433c;

        public ViewOnFocusChangeListenerC3971x(NSTIJKPlayerSky nSTIJKPlayerSky, View view) {
            this.f24433c = nSTIJKPlayerSky;
            this.f24432b = view;
        }

        /* renamed from: a */
        public final void m19370a(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f24432b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: b */
        public final void m19371b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f24432b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            float f10 = 1.0f;
            if (!z10) {
                if (z10) {
                    return;
                }
                View view2 = this.f24432b;
                if (view2 != null && view2.getTag() != null && this.f24432b.getTag().equals("1") && this.f24433c.f24377q0 != null) {
                    this.f24433c.f24377q0.setBackgroundResource(2131230845);
                }
                m19370a(1.0f);
                m19371b(1.0f);
                return;
            }
            View view3 = this.f24432b;
            if (view3 != null && view3.getTag() != null && this.f24432b.getTag().equals("2")) {
                view.setBackground(this.f24433c.getResources().getDrawable(2131231814));
                return;
            }
            if (z10) {
                f10 = 1.12f;
            }
            m19370a(f10);
            m19371b(f10);
            View view4 = this.f24432b;
            if (view4 == null || view4.getTag() == null || !this.f24432b.getTag().equals("1") || this.f24433c.f24377q0 == null) {
                return;
            }
            this.f24433c.f24377q0.setBackgroundResource(2131230828);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$y.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky$y */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$y.class */
    public class C3972y extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: b */
        public boolean f24434b;

        /* renamed from: c */
        public final NSTIJKPlayerSky f24435c;

        public C3972y(NSTIJKPlayerSky nSTIJKPlayerSky) {
            this.f24435c = nSTIJKPlayerSky;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            this.f24434b = true;
            return super.onDown(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            this.f24435c.m19365q1();
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$z.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky$z */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerSky$z.class */
    public class C3973z {

        /* renamed from: a */
        public final Activity f24436a;

        /* renamed from: b */
        public View f24437b;

        /* renamed from: c */
        public final NSTIJKPlayerSky f24438c;

        public C3973z(NSTIJKPlayerSky nSTIJKPlayerSky, Activity activity) {
            this.f24438c = nSTIJKPlayerSky;
            this.f24436a = activity;
        }

        /* renamed from: a */
        public C3973z m19372a() {
            View view = this.f24437b;
            if (view != null) {
                view.setVisibility(8);
            }
            return this;
        }

        /* renamed from: b */
        public C3973z m19373b(int i10) {
            this.f24437b = this.f24436a.findViewById(i10);
            return this;
        }

        /* renamed from: c */
        public C3973z m19374c() {
            View view = this.f24437b;
            if (view != null) {
                view.requestFocus();
            }
            return this;
        }

        /* renamed from: d */
        public C3973z m19375d(CharSequence charSequence) {
            View view = this.f24437b;
            if (view != null && (view instanceof TextView)) {
                ((TextView) view).setText(charSequence);
            }
            return this;
        }

        /* renamed from: e */
        public C3973z m19376e() {
            View view = this.f24437b;
            if (view != null) {
                view.setVisibility(0);
            }
            return this;
        }
    }

    public NSTIJKPlayerSky(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24335b = "NSTIJKPlayerSky";
        this.f24343f = 0;
        this.f24346g = 0;
        this.f24349h = 0;
        this.f24352i = null;
        this.f24355j = null;
        this.f24394w = true;
        this.f24397x = true;
        this.f24400y = true;
        this.f24403z = -1;
        this.f24261A = -1L;
        this.f24264B = true;
        this.f24267C = false;
        this.f24270D = 7000;
        this.f24279G = 0;
        this.f24285I = 0;
        this.f24288J = 5;
        this.f24291K = false;
        this.f24318T = 0L;
        this.f24321U = 0L;
        this.f24324V = 0L;
        this.f24327W = 0L;
        this.f24347g0 = "visible";
        this.f24362l0 = -1.0f;
        Boolean bool = Boolean.FALSE;
        this.f24380r0 = bool;
        this.f24383s0 = bool;
        this.f24386t0 = bool;
        this.f24389u0 = bool;
        this.f24392v0 = bool;
        this.f24395w0 = bool;
        this.f24398x0 = false;
        this.f24262A0 = false;
        this.f24265B0 = false;
        this.f24289J0 = false;
        this.f24292K0 = false;
        this.f24301N0 = false;
        this.f24363l1 = 0;
        this.f24263A1 = false;
        this.f24284H1 = new C3958k(this);
        this.f24287I1 = new C3962o(this);
        this.f24290J1 = new C3967t(this);
        this.f24293K1 = new C3968u(this);
        this.f24296L1 = new C3969v(this);
        this.f24299M1 = new C3948a(this);
        this.f24302N1 = new C3949b(this);
        this.f24305O1 = new C3950c(this);
        this.f24308P1 = new C3951d(this);
        this.f24311Q1 = new C3952e(this);
        this.f24314R1 = new C3953f(this);
        this.f24317S1 = 4;
        this.f24320T1 = f24260Y1[0];
        this.f24323U1 = new ArrayList();
        this.f24326V1 = 0;
        this.f24329W1 = 0;
        this.f24331X1 = false;
        m19340R0(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.view.View] */
    /* renamed from: E0 */
    public final void m19327E0() {
        InterfaceC7706b interfaceC7706b;
        if (this.f24355j == null || (interfaceC7706b = this.f24373p) == null) {
            return;
        }
        interfaceC7706b.m33654c(this);
        this.f24373p.m33653b(getParent() instanceof View ? (View) getParent() : this);
        this.f24373p.setEnabled(m19342T0());
    }

    /* renamed from: F0 */
    public void m19328F0(int i10) {
        if (NSTIJKPlayerSkyActivity.f22737F3) {
            return;
        }
        RunnableC3966s runnableC3966s = new RunnableC3966s(this);
        this.f24338c1 = runnableC3966s;
        this.f24336b1.postDelayed(runnableC3966s, i10);
    }

    /* renamed from: G0 */
    public void m19329G0(int i10) {
        RunnableC3965r runnableC3965r = new RunnableC3965r(this);
        this.f24342e1 = runnableC3965r;
        this.f24340d1.postDelayed(runnableC3965r, i10);
    }

    /* renamed from: H0 */
    public final void m19330H0(IMediaPlayer iMediaPlayer, InterfaceC4042a.b bVar) {
        if (iMediaPlayer == null) {
            return;
        }
        if (bVar == null) {
            iMediaPlayer.setDisplay(null);
        } else {
            bVar.mo19700b(iMediaPlayer);
        }
    }

    /* renamed from: I0 */
    public final String m19331I0(String str) {
        String str2 = str;
        if (TextUtils.isEmpty(str)) {
            str2 = "und";
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /* renamed from: J0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tv.danmaku.ijk.media.player.IMediaPlayer m19332J0(int r7) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky.m19332J0(int):tv.danmaku.ijk.media.player.IMediaPlayer");
    }

    @Override // p324sf.InterfaceC8574m
    /* renamed from: K */
    public void mo16817K(VodInfoCallback vodInfoCallback) {
    }

    /* renamed from: K0 */
    public void m19333K0(int i10) {
        C7709e.m33681b(this.f24355j, i10);
    }

    /* renamed from: L0 */
    public void m19334L0() {
        ServiceC6971a.m31982d(this.f24355j);
    }

    /* renamed from: M0 */
    public void m19335M0(Boolean bool) {
        this.f24282H = bool.booleanValue();
    }

    /* renamed from: N0 */
    public void m19336N0() {
        if (NSTIJKPlayerSkyActivity.f22737F3 || this.f24334a1.getVisibility() != 0) {
            return;
        }
        this.f24334a1.startAnimation(this.f24348g1);
        if (this.f24357j1.getVisibility() == 0) {
            this.f24357j1.startAnimation(this.f24348g1);
        }
        if (this.f24351h1.getVisibility() == 0) {
            this.f24351h1.startAnimation(this.f24348g1);
        }
        if (this.f24372o1.getVisibility() == 0) {
            this.f24372o1.startAnimation(this.f24348g1);
        }
        if (this.f24354i1.getVisibility() == 0) {
            this.f24354i1.startAnimation(this.f24348g1);
        }
        if (this.f24360k1.getVisibility() == 0) {
            this.f24360k1.startAnimation(this.f24348g1);
        }
        this.f24334a1.setVisibility(8);
        if (this.f24357j1.getVisibility() == 0) {
            this.f24357j1.setVisibility(8);
        }
        if (this.f24351h1.getVisibility() == 0) {
            this.f24351h1.setVisibility(8);
        }
        if (this.f24372o1.getVisibility() == 0) {
            this.f24372o1.setVisibility(8);
        }
        if (this.f24354i1.getVisibility() == 0) {
            this.f24354i1.setVisibility(8);
        }
        if (this.f24360k1.getVisibility() == 0) {
            this.f24360k1.setVisibility(8);
        }
    }

    /* renamed from: O0 */
    public void m19337O0() {
        if (this.f24387t1.getVisibility() == 0) {
            this.f24387t1.startAnimation(this.f24393v1);
            this.f24387t1.setVisibility(8);
        }
    }

    /* renamed from: P0 */
    public final void m19338P0() {
        boolean m31278p = this.f24306P.m31278p();
        this.f24331X1 = m31278p;
        if (m31278p) {
            ServiceC6971a.m31980b(getContext());
            this.f24355j = ServiceC6971a.m31979a();
        }
    }

    /* renamed from: Q0 */
    public final void m19339Q0() {
        this.f24323U1.clear();
        if (this.f24306P.m31281s()) {
            this.f24323U1.add(1);
        }
        if (this.f24306P.m31282t()) {
            this.f24323U1.add(2);
        }
        if (this.f24306P.m31280r()) {
            this.f24323U1.add(0);
        }
        if (this.f24323U1.isEmpty()) {
            this.f24323U1.add(1);
        }
        int intValue = this.f24323U1.get(this.f24326V1).intValue();
        this.f24329W1 = intValue;
        setRender(intValue);
    }

    /* renamed from: R0 */
    public final void m19340R0(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f24303O = applicationContext;
        this.f24306P = new C6783a(applicationContext);
        this.f24298M0 = new C5378j(this, this.f24303O);
        m19338P0();
        m19339Q0();
        this.f24358k = 0;
        this.f24361l = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f24346g = 0;
        this.f24349h = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences("pref.using_sub_font_size", 0);
        this.f24295L0 = sharedPreferences;
        String string = sharedPreferences.getString("pref.using_sub_font_size", C5251a.f30039f0);
        TextView textView = new TextView(context);
        this.f24344f0 = textView;
        try {
            textView.setTextSize(2, Float.parseFloat(string));
        } catch (Exception e10) {
        }
        this.f24344f0.setTextColor(context.getResources().getColor(2131100158));
        this.f24344f0.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams.setMargins(0, 0, 0, 40);
        addView(this.f24344f0, layoutParams);
    }

    /* renamed from: S0 */
    public boolean m19341S0() {
        return this.f24331X1;
    }

    /* renamed from: T0 */
    public final boolean m19342T0() {
        int i10;
        boolean z10 = true;
        if (this.f24355j == null || (i10 = this.f24346g) == -1 || i10 == 0 || i10 == 1) {
            z10 = false;
        }
        return z10;
    }

    @TargetApi(23)
    /* renamed from: U0 */
    public void m19343U0() {
        IMediaPlayer.OnErrorListener onErrorListener;
        IMediaPlayer iMediaPlayer;
        if (this.f24337c == null || this.f24352i == null) {
            return;
        }
        m19344V0(false);
        try {
            ((AudioManager) this.f24303O.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        } catch (Exception e10) {
        }
        try {
            try {
                try {
                    this.f24355j = m19332J0(this.f24306P.m31285w());
                    getContext();
                    this.f24355j.setOnPreparedListener(this.f24293K1);
                    this.f24355j.setOnVideoSizeChangedListener(this.f24290J1);
                    this.f24355j.setOnCompletionListener(this.f24296L1);
                    this.f24355j.setOnErrorListener(this.f24302N1);
                    this.f24355j.setOnInfoListener(this.f24299M1);
                    this.f24355j.setOnBufferingUpdateListener(this.f24305O1);
                    this.f24355j.setOnSeekCompleteListener(this.f24308P1);
                    this.f24355j.setOnTimedTextListener(this.f24311Q1);
                    this.f24382s = 0;
                    String scheme = this.f24337c.getScheme();
                    if (Build.VERSION.SDK_INT >= 23 && this.f24306P.m31246E() && (TextUtils.isEmpty(scheme) || scheme.equalsIgnoreCase(TransferTable.COLUMN_FILE))) {
                        this.f24355j.setDataSource(new C7705a(new File(this.f24337c.toString())));
                    } else {
                        this.f24355j.setDataSource(this.f24303O, this.f24337c, this.f24341e);
                    }
                    m19330H0(this.f24355j, this.f24352i);
                    this.f24355j.setAudioStreamType(3);
                    this.f24355j.setScreenOnWhilePlaying(true);
                    this.f24318T = System.currentTimeMillis();
                    this.f24355j.prepareAsync();
                    this.f24368n0 = this.f24350h0.getResources().getDisplayMetrics().widthPixels;
                    AudioManager audioManager = (AudioManager) this.f24350h0.getSystemService("audio");
                    this.f24356j0 = audioManager;
                    this.f24359k0 = audioManager.getStreamMaxVolume(3);
                    int streamVolume = this.f24356j0.getStreamVolume(3);
                    this.f24333Z0.setMax(this.f24356j0.getStreamMaxVolume(3));
                    this.f24333Z0.setProgress(streamVolume);
                    this.f24365m0 = new GestureDetector(this.f24350h0, new C3972y(this));
                    m19367s1();
                    this.f24401y0 = new StringBuilder();
                    this.f24404z0 = new Formatter(this.f24401y0, Locale.getDefault());
                    this.f24346g = 1;
                } catch (IllegalArgumentException e11) {
                    Log.w(this.f24335b, "Unable to open content: " + this.f24337c, e11);
                    this.f24346g = -1;
                    this.f24349h = -1;
                    onErrorListener = this.f24302N1;
                    iMediaPlayer = this.f24355j;
                    onErrorListener.onError(iMediaPlayer, 1, 0);
                } catch (Exception e12) {
                    Log.w(this.f24335b, "Unable to open content: " + this.f24337c, e12);
                    this.f24346g = -1;
                    this.f24349h = -1;
                    onErrorListener = this.f24302N1;
                    iMediaPlayer = this.f24355j;
                    onErrorListener.onError(iMediaPlayer, 1, 0);
                }
            } catch (IOException e13) {
                Log.w(this.f24335b, "Unable to open content: " + this.f24337c, e13);
                this.f24346g = -1;
                this.f24349h = -1;
                onErrorListener = this.f24302N1;
                iMediaPlayer = this.f24355j;
                onErrorListener.onError(iMediaPlayer, 1, 0);
            }
        } catch (NullPointerException e14) {
            Log.w(this.f24335b, "Unable to open content: " + this.f24337c, e14);
            this.f24346g = -1;
            this.f24349h = -1;
            onErrorListener = this.f24302N1;
            iMediaPlayer = this.f24355j;
            onErrorListener.onError(iMediaPlayer, 1, 0);
        }
    }

    @Override // p324sf.InterfaceC8574m
    /* renamed from: V */
    public void mo16825V(String str) {
    }

    /* renamed from: V0 */
    public void m19344V0(boolean z10) {
        IMediaPlayer iMediaPlayer = this.f24355j;
        if (iMediaPlayer != null) {
            iMediaPlayer.reset();
            this.f24355j.release();
            this.f24355j = null;
            this.f24346g = 0;
            if (z10) {
                this.f24349h = 0;
            }
            ((AudioManager) this.f24303O.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    /* renamed from: W0 */
    public void m19345W0() {
        IMediaPlayer iMediaPlayer = this.f24355j;
        if (iMediaPlayer != null) {
            iMediaPlayer.setDisplay(null);
        }
    }

    /* renamed from: X0 */
    public void m19346X0() {
        Handler handler = this.f24273E;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: Y0 */
    public int m19347Y0() {
        InterfaceC4042a interfaceC4042a = this.f24309Q;
        if (interfaceC4042a == null || interfaceC4042a.getView() == null || this.f24309Q.getView().getHeight() == 0) {
            return 0;
        }
        return this.f24309Q.getView().getHeight();
    }

    /* renamed from: Z0 */
    public int m19348Z0() {
        InterfaceC4042a interfaceC4042a = this.f24309Q;
        if (interfaceC4042a == null || interfaceC4042a.getView() == null || this.f24309Q.getView().getWidth() == 0) {
            return 0;
        }
        return this.f24309Q.getView().getWidth();
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: a */
    public void mo15996a() {
    }

    /* renamed from: a1 */
    public void m19349a1(int i10) {
        C7709e.m33684e(this.f24355j, i10);
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: b */
    public void mo15997b() {
    }

    /* renamed from: b1 */
    public void m19350b1(Activity activity, NSTIJKPlayerSky nSTIJKPlayerSky, RadioGroup radioGroup, RadioGroup radioGroup2, RadioGroup radioGroup3, TextView textView, TextView textView2, TextView textView3, TextView textView4, SeekBar seekBar, SeekBar seekBar2, LinearLayout linearLayout, Animation animation, Animation animation2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView5, LinearLayout linearLayout4, Animation animation3, Animation animation4, TextView textView6, RelativeLayout relativeLayout, Animation animation5, LinearLayout linearLayout5, Animation animation6, Animation animation7, RelativeLayout relativeLayout2, Animation animation8, FrameLayout frameLayout) {
        this.f24350h0 = activity;
        this.f24353i0 = nSTIJKPlayerSky;
        this.f24273E = new Handler();
        this.f24276F = new Handler();
        this.f24313R0 = radioGroup;
        this.f24316S0 = radioGroup2;
        this.f24319T0 = radioGroup3;
        this.f24310Q0 = textView;
        this.f24307P0 = textView2;
        this.f24304O0 = textView3;
        this.f24325V0 = textView4;
        this.f24332Y0 = seekBar;
        this.f24333Z0 = seekBar2;
        this.f24334a1 = linearLayout;
        this.f24336b1 = new Handler();
        this.f24340d1 = new Handler();
        this.f24345f1 = animation;
        this.f24348g1 = animation2;
        this.f24351h1 = imageView;
        this.f24354i1 = imageView2;
        this.f24357j1 = linearLayout2;
        this.f24360k1 = linearLayout3;
        this.f24332Y0.setOnSeekBarChangeListener(this.f24284H1);
        this.f24333Z0.setOnSeekBarChangeListener(this.f24287I1);
        this.f24366m1 = textView5;
        seekBar.setKeyProgressIncrement(1);
        float f10 = this.f24350h0.getWindow().getAttributes().screenBrightness;
        this.f24362l0 = f10;
        if (f10 == -1.0f) {
            this.f24362l0 = this.f24306P != null ? r0.m31277o() : C5251a.f30063r0;
        }
        seekBar.setProgress((int) this.f24362l0);
        this.f24372o1 = linearLayout4;
        this.f24375p1 = animation3;
        this.f24378q1 = animation4;
        this.f24369n1 = textView6;
        this.f24381r1 = relativeLayout;
        this.f24384s1 = animation5;
        this.f24387t1 = linearLayout5;
        this.f24390u1 = animation6;
        this.f24393v1 = animation7;
        this.f24402y1 = relativeLayout2;
        this.f24396w1 = animation8;
        this.f24328W0 = frameLayout;
        this.f24374p0 = new C3973z(this, activity);
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: c */
    public void mo15998c(String str) {
    }

    /* renamed from: c1 */
    public final void m19351c1(Uri uri, Map<String, String> map, boolean z10, String str) {
        this.f24337c = uri;
        this.f24339d = str;
        this.f24341e = map;
        this.f24391v = 0;
        this.f24282H = z10;
        this.f24279G = this.f24279G;
        m19361m1();
        m19343U0();
        requestLayout();
        invalidate();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.f24394w;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.f24397x;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.f24400y;
    }

    /* renamed from: d1 */
    public void m19352d1(Uri uri, boolean z10, String str) {
        m19351c1(uri, null, z10, str);
    }

    /* renamed from: e1 */
    public void m19353e1() {
        if (!NSTIJKPlayerSkyActivity.f22737F3 && NSTIJKPlayerSkyActivity.f22733B3 && this.f24334a1.getVisibility() == 8) {
            m19368t1();
            this.f24334a1.startAnimation(this.f24345f1);
            this.f24334a1.setVisibility(0);
            if (this.f24357j1.getVisibility() == 8) {
                this.f24357j1.startAnimation(this.f24345f1);
                this.f24357j1.setVisibility(0);
            }
            if (this.f24351h1.getVisibility() == 8) {
                this.f24351h1.startAnimation(this.f24345f1);
                this.f24351h1.setVisibility(0);
            }
            if (this.f24372o1.getVisibility() == 8 && !NSTIJKPlayerSkyActivity.m18339L1()) {
                this.f24372o1.startAnimation(this.f24345f1);
                this.f24372o1.setVisibility(0);
            }
            if (this.f24354i1.getVisibility() == 8) {
                this.f24354i1.startAnimation(this.f24345f1);
                this.f24354i1.setVisibility(0);
            }
            if (this.f24360k1.getVisibility() == 8) {
                this.f24360k1.startAnimation(this.f24345f1);
                this.f24360k1.setVisibility(0);
            }
        }
    }

    /* renamed from: f1 */
    public void m19354f1() {
        if (this.f24334a1.getVisibility() == 8) {
            this.f24387t1.startAnimation(this.f24390u1);
            this.f24387t1.setVisibility(0);
        }
    }

    /* renamed from: g1 */
    public final void m19355g1(String str) {
        this.f24374p0.m19373b(2131429674).m19372a();
        this.f24374p0.m19373b(2131427519).m19376e();
        this.f24374p0.m19373b(2131427523).m19375d(str);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f24355j != null) {
            return this.f24382s;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (m19342T0()) {
            return (int) this.f24355j.getCurrentPosition();
        }
        return 0;
    }

    public int getCurrentWindowIndex() {
        return this.f24279G;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (m19342T0()) {
            return (int) this.f24355j.getDuration();
        }
        return -1;
    }

    public Boolean getFullScreenValue() {
        return Boolean.valueOf(this.f24282H);
    }

    public int getNewSeekPosition() {
        return (int) this.f24261A;
    }

    public boolean getPlayerIsPrepared() {
        return this.f24301N0;
    }

    public String getShowOrHideSubtitles() {
        return this.f24347g0;
    }

    public ITrackInfo[] getTrackInfo() {
        IMediaPlayer iMediaPlayer = this.f24355j;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.getTrackInfo();
    }

    @SuppressLint({"SetTextI18n", "ResourceType"})
    /* renamed from: h1 */
    public void m19356h1(RadioGroup radioGroup, RadioGroup radioGroup2, RadioGroup radioGroup3, TextView textView, TextView textView2, TextView textView3, TextView textView4, FrameLayout frameLayout) {
        if (this.f24355j == null) {
            return;
        }
        radioGroup.removeAllViews();
        radioGroup2.removeAllViews();
        radioGroup3.removeAllViews();
        try {
            SharedPreferences sharedPreferences = this.f24350h0.getSharedPreferences("pref.using_sub_font_size", 0);
            this.f24295L0 = sharedPreferences;
            textView4.setText(sharedPreferences.getString("pref.using_sub_font_size", C5251a.f30039f0));
            frameLayout.setOnClickListener(new ViewOnClickListenerC3955h(this));
        } catch (Exception e10) {
        }
        Boolean bool = Boolean.FALSE;
        this.f24395w0 = bool;
        this.f24392v0 = bool;
        this.f24389u0 = bool;
        this.f24383s0 = bool;
        this.f24380r0 = bool;
        this.f24386t0 = bool;
        int m33683d = C7709e.m33683d(this.f24355j, 1);
        int m33683d2 = C7709e.m33683d(this.f24355j, 2);
        int m33683d3 = C7709e.m33683d(this.f24355j, 3);
        ITrackInfo[] trackInfo = this.f24355j.getTrackInfo();
        if (trackInfo == null || trackInfo.length <= 0) {
            textView.setVisibility(0);
            textView2.setVisibility(0);
        } else {
            int i10 = -1;
            for (ITrackInfo iTrackInfo : trackInfo) {
                i10++;
                int trackType = iTrackInfo.getTrackType();
                IMediaFormat format = iTrackInfo.getFormat();
                if (format != null && (format instanceof IjkMediaFormat)) {
                    if (trackType == 1) {
                        Boolean bool2 = Boolean.TRUE;
                        this.f24389u0 = bool2;
                        if (!this.f24380r0.booleanValue()) {
                            this.f24380r0 = bool2;
                            RadioButton radioButton = new RadioButton(this.f24350h0);
                            radioButton.setText("Disable");
                            radioButton.setTextColor(getResources().getColor(2131100158));
                            radioButton.setTextSize(13.0f);
                            radioButton.setId(11111111);
                            radioButton.setButtonTintList(ColorStateList.valueOf(C4290b.m21724c(this.f24303O, 2131100158)));
                            radioButton.setPadding(0, 0, 16, 0);
                            radioButton.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3971x(this, radioButton));
                            if (m33683d == -1) {
                                radioButton.setChecked(true);
                                radioGroup.setOnCheckedChangeListener(null);
                            }
                            radioButton.setTag("2");
                            radioGroup.addView(radioButton);
                        }
                        RadioButton radioButton2 = new RadioButton(this.f24350h0);
                        iTrackInfo.getInfoInline();
                        radioButton2.setText(i10 + ", " + iTrackInfo.getInfoInline());
                        if (i10 == -1) {
                            radioButton2.setId(111);
                        } else {
                            radioButton2.setId(i10);
                        }
                        radioButton2.setTextColor(getResources().getColor(2131100158));
                        radioButton2.setTextSize(13.0f);
                        radioButton2.setButtonTintList(ColorStateList.valueOf(C4290b.m21724c(this.f24303O, 2131100158)));
                        radioButton2.setPadding(0, 0, 16, 0);
                        radioButton2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3971x(this, radioButton2));
                        if (i10 == m33683d) {
                            radioButton2.setChecked(true);
                            radioGroup.setOnCheckedChangeListener(null);
                        }
                        radioButton2.setTag("2");
                        radioGroup.addView(radioButton2);
                        radioGroup.setOnCheckedChangeListener(new C3956i(this, m33683d));
                    } else if (trackType == 2) {
                        Boolean bool3 = Boolean.TRUE;
                        this.f24392v0 = bool3;
                        if (!this.f24383s0.booleanValue()) {
                            this.f24383s0 = bool3;
                            RadioButton radioButton3 = new RadioButton(this.f24350h0);
                            radioButton3.setText("Disable");
                            radioButton3.setTextColor(getResources().getColor(2131100158));
                            radioButton3.setTextSize(13.0f);
                            radioButton3.setButtonTintList(ColorStateList.valueOf(C4290b.m21724c(this.f24303O, 2131100158)));
                            radioButton3.setId(1111111);
                            radioButton3.setPadding(0, 0, 16, 0);
                            radioButton3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3971x(this, radioButton3));
                            if (m33683d2 == -1) {
                                radioButton3.setChecked(true);
                                radioGroup2.setOnCheckedChangeListener(null);
                            }
                            radioButton3.setTag("2");
                            radioGroup2.addView(radioButton3);
                        }
                        RadioButton radioButton4 = new RadioButton(this.f24350h0);
                        radioButton4.setText(i10 + ", " + iTrackInfo.getInfoInline() + ", " + m19331I0(iTrackInfo.getLanguage()));
                        radioButton4.setTextColor(getResources().getColor(2131100158));
                        radioButton4.setTextSize(13.0f);
                        radioButton4.setButtonTintList(ColorStateList.valueOf(C4290b.m21724c(this.f24303O, 2131100158)));
                        if (i10 == -1) {
                            radioButton4.setId(1111);
                        } else {
                            radioButton4.setId(i10);
                        }
                        radioButton4.setPadding(0, 0, 16, 0);
                        radioButton4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3971x(this, radioButton4));
                        if (i10 == m33683d2) {
                            radioButton4.setChecked(true);
                            radioGroup2.setOnCheckedChangeListener(null);
                        }
                        radioButton4.setTag("2");
                        radioGroup2.addView(radioButton4);
                        radioGroup2.setOnCheckedChangeListener(new C3957j(this, m33683d2));
                    } else if (trackType == 3) {
                        Boolean bool4 = Boolean.TRUE;
                        this.f24395w0 = bool4;
                        if (!this.f24386t0.booleanValue()) {
                            this.f24386t0 = bool4;
                            RadioButton radioButton5 = new RadioButton(this.f24350h0);
                            radioButton5.setText("Disable");
                            radioButton5.setTextColor(getResources().getColor(2131100158));
                            radioButton5.setTextSize(13.0f);
                            radioButton5.setButtonTintList(ColorStateList.valueOf(C4290b.m21724c(this.f24303O, 2131100158)));
                            radioButton5.setId(111111);
                            radioButton5.setPadding(0, 0, 16, 0);
                            radioButton5.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3971x(this, radioButton5));
                            if (m33683d3 == -1) {
                                radioButton5.setChecked(true);
                                radioGroup3.setOnCheckedChangeListener(null);
                            }
                            radioButton5.setTag("2");
                            radioGroup3.addView(radioButton5);
                        }
                        RadioButton radioButton6 = new RadioButton(this.f24350h0);
                        radioButton6.setText(i10 + ", " + iTrackInfo.getInfoInline());
                        radioButton6.setTextColor(getResources().getColor(2131100158));
                        radioButton6.setTextSize(13.0f);
                        radioButton6.setButtonTintList(ColorStateList.valueOf(C4290b.m21724c(this.f24303O, 2131100158)));
                        if (i10 == -1) {
                            radioButton6.setId(11111);
                        } else {
                            radioButton6.setId(i10);
                        }
                        radioButton6.setPadding(0, 0, 16, 0);
                        radioButton6.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3971x(this, radioButton6));
                        if (i10 == m33683d3) {
                            radioButton6.setChecked(true);
                            radioGroup3.setOnCheckedChangeListener(null);
                        }
                        radioButton6.setTag("2");
                        radioGroup3.addView(radioButton6);
                        radioGroup3.setOnCheckedChangeListener(new C3959l(this, m33683d3));
                    }
                }
            }
            if (this.f24389u0.booleanValue()) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
            if (this.f24392v0.booleanValue()) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
            if (this.f24395w0.booleanValue()) {
                textView3.setVisibility(8);
                return;
            }
        }
        textView3.setVisibility(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0218, code lost:
    
        if (r0 == (-1)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0241, code lost:
    
        m19349a1(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x022a, code lost:
    
        m19333K0(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0227, code lost:
    
        if (r0 != (-1)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x023b, code lost:
    
        if (r0 == (-1)) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02e7  */
    /* renamed from: i1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m19357i1(int r11) {
        /*
            Method dump skipped, instructions count: 878
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky.m19357i1(int):void");
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        IMediaPlayer iMediaPlayer;
        return m19342T0() && (iMediaPlayer = this.f24355j) != null && iMediaPlayer.isPlaying();
    }

    /* renamed from: j1 */
    public void m19358j1() {
        ServiceC6971a.m31982d(null);
    }

    /* renamed from: k1 */
    public void m19359k1() {
        Handler handler;
        if (NSTIJKPlayerSkyActivity.f22737F3 || (handler = this.f24336b1) == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    /* renamed from: l1 */
    public void m19360l1() {
        Handler handler = this.f24340d1;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: m1 */
    public void m19361m1() {
        IMediaPlayer iMediaPlayer = this.f24355j;
        if (iMediaPlayer != null) {
            iMediaPlayer.stop();
            this.f24355j.release();
            this.f24355j = null;
            this.f24346g = 0;
            this.f24349h = 0;
            ((AudioManager) this.f24303O.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: n1 */
    public final void m19362n1() {
        int i10;
        DialogC0242a.a aVar = new DialogC0242a.a(this.f24275E1);
        aVar.setTitle(getResources().getString(2132018666));
        String string = this.f24295L0.getString("pref.using_sub_font_size", C5251a.f30039f0);
        string.hashCode();
        boolean z10 = -1;
        switch (string.hashCode()) {
            case 1567:
                if (string.equals("10")) {
                    z10 = false;
                    break;
                }
                break;
            case 1569:
                if (string.equals("12")) {
                    z10 = true;
                    break;
                }
                break;
            case 1571:
                if (string.equals("14")) {
                    z10 = 2;
                    break;
                }
                break;
            case 1573:
                if (string.equals("16")) {
                    z10 = 3;
                    break;
                }
                break;
            case 1575:
                if (string.equals("18")) {
                    z10 = 4;
                    break;
                }
                break;
            case 1598:
                if (string.equals("20")) {
                    z10 = 5;
                    break;
                }
                break;
            case 1600:
                if (string.equals("22")) {
                    z10 = 6;
                    break;
                }
                break;
            case 1602:
                if (string.equals("24")) {
                    z10 = 7;
                    break;
                }
                break;
            case 1604:
                if (string.equals("26")) {
                    z10 = 8;
                    break;
                }
                break;
            case 1606:
                if (string.equals("28")) {
                    z10 = 9;
                    break;
                }
                break;
            case 1629:
                if (string.equals("30")) {
                    z10 = 10;
                    break;
                }
                break;
            case 1631:
                if (string.equals("32")) {
                    z10 = 11;
                    break;
                }
                break;
            case 1633:
                if (string.equals("34")) {
                    z10 = 12;
                    break;
                }
                break;
            case 1635:
                if (string.equals("36")) {
                    z10 = 13;
                    break;
                }
                break;
            case 1637:
                if (string.equals("38")) {
                    z10 = 14;
                    break;
                }
                break;
            case 1660:
                if (string.equals("40")) {
                    z10 = 15;
                    break;
                }
                break;
        }
        switch (z10) {
            case false:
            default:
                i10 = 0;
                break;
            case true:
                i10 = 1;
                break;
            case true:
                i10 = 2;
                break;
            case true:
                i10 = 3;
                break;
            case true:
                i10 = 4;
                break;
            case true:
                i10 = 5;
                break;
            case true:
                i10 = 6;
                break;
            case true:
                i10 = 7;
                break;
            case true:
                i10 = 8;
                break;
            case true:
                i10 = 9;
                break;
            case true:
                i10 = 10;
                break;
            case true:
                i10 = 11;
                break;
            case true:
                i10 = 12;
                break;
            case true:
                i10 = 13;
                break;
            case true:
                i10 = 14;
                break;
            case true:
                i10 = 15;
                break;
        }
        aVar.m863k(new CharSequence[]{"10", "12", "14", "16", "18", "20", "22", "24", "26", "28", "30", "32", "34", "36", "38", "40"}, i10, new DialogInterfaceOnClickListenerC3960m(this));
        DialogC0242a create = aVar.create();
        this.f24330X0 = create;
        create.setOnDismissListener(new DialogInterfaceOnDismissListenerC3961n(this));
        this.f24330X0.show();
    }

    /* renamed from: o1 */
    public final void m19363o1(String str) {
        try {
            SharedPreferences sharedPreferences = this.f24350h0.getSharedPreferences("pref.using_sub_font_size", 0);
            this.f24295L0 = sharedPreferences;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            this.f24322U0 = edit;
            if (edit != null) {
                edit.putString("pref.using_sub_font_size", str);
                this.f24322U0.apply();
            }
        } catch (Exception e10) {
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10 = (i10 == 4 || i10 == 24 || i10 == 25 || i10 == 164 || i10 == 82 || i10 == 5 || i10 == 6) ? false : true;
        if (m19342T0() && z10 && this.f24373p != null) {
            if (i10 == 79 || i10 == 85) {
                IMediaPlayer iMediaPlayer = this.f24355j;
                if (iMediaPlayer == null || !iMediaPlayer.isPlaying()) {
                    start();
                    this.f24373p.m33655d();
                    return true;
                }
                pause();
                this.f24373p.show();
                return true;
            }
            if (i10 == 126) {
                IMediaPlayer iMediaPlayer2 = this.f24355j;
                if (iMediaPlayer2 == null || iMediaPlayer2.isPlaying()) {
                    return true;
                }
                start();
                this.f24373p.m33655d();
                return true;
            }
            if (i10 == 86 || i10 == 127) {
                IMediaPlayer iMediaPlayer3 = this.f24355j;
                if (iMediaPlayer3 == null || !iMediaPlayer3.isPlaying()) {
                    return true;
                }
                pause();
                this.f24373p.show();
                return true;
            }
            m19366r1();
        }
        return super.onKeyDown(i10, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0104  */
    /* renamed from: p1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int m19364p1() {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky.m19364p1():int");
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        IMediaPlayer iMediaPlayer;
        if (m19342T0() && (iMediaPlayer = this.f24355j) != null && iMediaPlayer.isPlaying()) {
            this.f24355j.pause();
            this.f24346g = 4;
        }
        this.f24349h = 4;
    }

    /* renamed from: q1 */
    public void m19365q1() {
        RelativeLayout relativeLayout;
        if (NSTIJKPlayerSkyActivity.f22737F3) {
            m19360l1();
            if (this.f24387t1.getVisibility() == 0) {
                m19337O0();
                return;
            } else {
                m19354f1();
                m19329G0(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
                return;
            }
        }
        SeekBar seekBar = this.f24333Z0;
        if (seekBar != null) {
            seekBar.setProgress(this.f24356j0.getStreamVolume(3));
        }
        m19359k1();
        if (this.f24381r1.getVisibility() == 0) {
            this.f24381r1.startAnimation(this.f24384s1);
            relativeLayout = this.f24381r1;
        } else {
            if (this.f24402y1.getVisibility() != 0) {
                if (this.f24334a1.getVisibility() == 0) {
                    m19336N0();
                    return;
                } else {
                    m19353e1();
                    m19328F0(TFTP.DEFAULT_TIMEOUT);
                    return;
                }
            }
            this.f24402y1.startAnimation(this.f24396w1);
            relativeLayout = this.f24402y1;
        }
        relativeLayout.setVisibility(8);
    }

    /* renamed from: r1 */
    public final void m19366r1() {
        if (this.f24373p.m33652a()) {
            this.f24373p.m33655d();
        } else {
            this.f24373p.show();
        }
    }

    /* renamed from: s1 */
    public final void m19367s1() {
        View findViewById = this.f24350h0.findViewById(2131427469);
        this.f24371o0 = findViewById;
        findViewById.setClickable(true);
        this.f24371o0.setOnTouchListener(new ViewOnTouchListenerC3963p(this));
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i10) {
        int i11 = i10;
        if (m19342T0()) {
            this.f24324V = System.currentTimeMillis();
            this.f24355j.seekTo(i10);
            i11 = 0;
        }
        this.f24391v = i11;
    }

    public void setAdjustViewBounds(boolean z10) {
        if (this.f24405z1 == z10) {
            return;
        }
        this.f24405z1 = z10;
        if (z10) {
            setBackground(null);
        } else {
            setBackgroundColor(DefaultRenderer.BACKGROUND_COLOR);
        }
        requestLayout();
    }

    public void setContext(Context context) {
        this.f24275E1 = context;
    }

    public void setCurrentChannelLogo(String str) {
        this.f24269C1 = str;
    }

    public void setCurrentEpgChannelID(String str) {
        this.f24266B1 = str;
    }

    public void setCurrentWindowIndex(int i10) {
        this.f24279G = i10;
    }

    public void setEPGHandler(Handler handler) {
        this.f24272D1 = handler;
    }

    public void setHudView(TableLayout tableLayout) {
    }

    public void setLiveStreamDBHandler(LiveStreamDBHandler liveStreamDBHandler) {
        this.f24278F1 = liveStreamDBHandler;
    }

    public void setMediaController(InterfaceC7706b interfaceC7706b) {
        InterfaceC7706b interfaceC7706b2 = this.f24373p;
        if (interfaceC7706b2 != null) {
            interfaceC7706b2.m33655d();
        }
        this.f24373p = interfaceC7706b;
        m19327E0();
    }

    public void setMovieListener(AbstractC3970w abstractC3970w) {
        this.f24281G1 = abstractC3970w;
    }

    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.f24376q = onCompletionListener;
    }

    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        this.f24385t = onErrorListener;
    }

    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.f24388u = onInfoListener;
    }

    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.f24379r = onPreparedListener;
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
                Log.e(this.f24335b, String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i10)));
                return;
            }
            C4044c c4044c = new C4044c(getContext());
            c4043b = c4044c;
            if (this.f24355j != null) {
                c4044c.getSurfaceHolder().mo19700b(this.f24355j);
                c4044c.mo19696c(this.f24355j.getVideoWidth(), this.f24355j.getVideoHeight());
                c4044c.mo19694a(this.f24355j.getVideoSarNum(), this.f24355j.getVideoSarDen());
                c4044c.setAspectRatio(this.f24320T1);
                c4043b = c4044c;
            }
        }
        setRenderView(c4043b);
    }

    public void setRenderView(InterfaceC4042a interfaceC4042a) {
        int i10;
        int i11;
        if (this.f24309Q != null) {
            IMediaPlayer iMediaPlayer = this.f24355j;
            if (iMediaPlayer != null) {
                iMediaPlayer.setDisplay(null);
            }
            View view = this.f24309Q.getView();
            this.f24309Q.mo19695b(this.f24314R1);
            this.f24309Q = null;
            removeView(view);
        }
        if (interfaceC4042a == null) {
            return;
        }
        this.f24309Q = interfaceC4042a;
        SharedPreferences sharedPreferences = this.f24303O.getSharedPreferences("loginPrefs", 0);
        this.f24294L = sharedPreferences;
        int i12 = sharedPreferences.getInt("aspect_ratio", 4);
        this.f24317S1 = i12;
        interfaceC4042a.setAspectRatio(i12);
        int i13 = this.f24358k;
        if (i13 > 0 && (i11 = this.f24361l) > 0) {
            interfaceC4042a.mo19696c(i13, i11);
        }
        int i14 = this.f24312R;
        if (i14 > 0 && (i10 = this.f24315S) > 0) {
            interfaceC4042a.mo19694a(i14, i10);
        }
        View view2 = this.f24309Q.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(view2);
        this.f24309Q.mo19698e(this.f24314R1);
        this.f24309Q.setVideoRotation(this.f24370o);
    }

    public void setShowOrHideSubtitles(String str) {
        this.f24347g0 = str;
    }

    public void setTitle(CharSequence charSequence) {
        this.f24374p0.m19373b(C10105q.f46321V).m19375d(charSequence);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        try {
            this.f24374p0.m19373b(2131429674).m19376e();
            this.f24374p0.m19373b(2131427519).m19372a();
            this.f24374p0.m19373b(2131427523).m19375d("");
        } catch (Exception e10) {
        }
        if (m19342T0()) {
            this.f24355j.start();
            this.f24346g = 3;
        }
        this.f24349h = 3;
    }

    /* renamed from: t1 */
    public void m19368t1() {
        ProgressBar progressBar = (ProgressBar) this.f24350h0.findViewById(C5974n.f33499T);
        TextView textView = (TextView) this.f24350h0.findViewById(2131429397);
        TextView textView2 = (TextView) this.f24350h0.findViewById(2131429402);
        TextView textView3 = (TextView) this.f24350h0.findViewById(2131429527);
        TextView textView4 = (TextView) this.f24350h0.findViewById(2131429531);
        ImageView imageView = (ImageView) this.f24350h0.findViewById(2131428156);
        LinearLayout linearLayout = (LinearLayout) this.f24350h0.findViewById(2131428383);
        LinearLayout linearLayout2 = (LinearLayout) this.f24350h0.findViewById(2131428386);
        LinearLayout linearLayout3 = (LinearLayout) this.f24350h0.findViewById(2131428389);
        LinearLayout linearLayout4 = (LinearLayout) this.f24350h0.findViewById(2131428392);
        LinearLayout linearLayout5 = (LinearLayout) this.f24350h0.findViewById(2131428452);
        LinearLayout linearLayout6 = (LinearLayout) this.f24350h0.findViewById(2131428396);
        TextView textView5 = (TextView) this.f24350h0.findViewById(2131429433);
        TextView textView6 = (TextView) this.f24350h0.findViewById(2131429436);
        TextView textView7 = (TextView) this.f24350h0.findViewById(2131429439);
        TextView textView8 = (TextView) this.f24350h0.findViewById(2131429442);
        TextView textView9 = (TextView) this.f24350h0.findViewById(2131429435);
        TextView textView10 = (TextView) this.f24350h0.findViewById(2131429438);
        TextView textView11 = (TextView) this.f24350h0.findViewById(2131429441);
        TextView textView12 = (TextView) this.f24350h0.findViewById(2131429444);
        Handler handler = this.f24272D1;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        new NSTIJKPlayerSkyActivity().m18406M2(this.f24266B1, this.f24269C1, this.f24278F1, this.f24275E1, progressBar, textView, textView2, textView3, textView4, imageView, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12);
    }

    /* renamed from: u1 */
    public final void m19369u1() {
        try {
            IMediaPlayer iMediaPlayer = this.f24355j;
            if (iMediaPlayer == null || !iMediaPlayer.isPlaying()) {
                this.f24374p0.m19373b(2131428207).m19372a();
                this.f24374p0.m19373b(2131428208).m19376e();
                AbstractC3970w abstractC3970w = this.f24281G1;
                if (abstractC3970w != null) {
                    abstractC3970w.mo17781b();
                }
            } else {
                this.f24374p0.m19373b(2131428208).m19372a();
                this.f24374p0.m19373b(2131428207).m19376e();
                AbstractC3970w abstractC3970w2 = this.f24281G1;
                if (abstractC3970w2 != null) {
                    abstractC3970w2.mo17780a();
                }
            }
        } catch (Exception e10) {
        }
    }
}

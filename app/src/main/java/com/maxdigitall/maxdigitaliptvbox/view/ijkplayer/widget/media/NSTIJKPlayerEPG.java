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
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerEPGActivity;
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
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG.class */
public class NSTIJKPlayerEPG extends FrameLayout implements MediaController.MediaPlayerControl, InterfaceC8574m {

    /* renamed from: Y1 */
    public static final int[] f23490Y1 = {0, 1, 2, 3, 4, 5};

    /* renamed from: A */
    public long f23491A;

    /* renamed from: A0 */
    public boolean f23492A0;

    /* renamed from: A1 */
    public boolean f23493A1;

    /* renamed from: B */
    public boolean f23494B;

    /* renamed from: B0 */
    public boolean f23495B0;

    /* renamed from: B1 */
    public String f23496B1;

    /* renamed from: C */
    public boolean f23497C;

    /* renamed from: C0 */
    public SharedPreferences f23498C0;

    /* renamed from: C1 */
    public String f23499C1;

    /* renamed from: D */
    public int f23500D;

    /* renamed from: D0 */
    public SharedPreferences f23501D0;

    /* renamed from: D1 */
    public Handler f23502D1;

    /* renamed from: E */
    public Handler f23503E;

    /* renamed from: E0 */
    public SharedPreferences f23504E0;

    /* renamed from: E1 */
    public Context f23505E1;

    /* renamed from: F */
    public Handler f23506F;

    /* renamed from: F0 */
    public SharedPreferences f23507F0;

    /* renamed from: F1 */
    public LiveStreamDBHandler f23508F1;

    /* renamed from: G */
    public int f23509G;

    /* renamed from: G0 */
    public SharedPreferences.Editor f23510G0;

    /* renamed from: G1 */
    public String f23511G1;

    /* renamed from: H */
    public boolean f23512H;

    /* renamed from: H0 */
    public SharedPreferences.Editor f23513H0;

    /* renamed from: H1 */
    public final SeekBar.OnSeekBarChangeListener f23514H1;

    /* renamed from: I */
    public int f23515I;

    /* renamed from: I0 */
    public SharedPreferences.Editor f23516I0;

    /* renamed from: I1 */
    public final SeekBar.OnSeekBarChangeListener f23517I1;

    /* renamed from: J */
    public int f23518J;

    /* renamed from: J0 */
    public boolean f23519J0;

    /* renamed from: J1 */
    public IMediaPlayer.OnVideoSizeChangedListener f23520J1;

    /* renamed from: K */
    public boolean f23521K;

    /* renamed from: K0 */
    public boolean f23522K0;

    /* renamed from: K1 */
    public IMediaPlayer.OnPreparedListener f23523K1;

    /* renamed from: L */
    public SharedPreferences f23524L;

    /* renamed from: L0 */
    public SharedPreferences f23525L0;

    /* renamed from: L1 */
    public IMediaPlayer.OnCompletionListener f23526L1;

    /* renamed from: M */
    public SharedPreferences.Editor f23527M;

    /* renamed from: M0 */
    public C5378j f23528M0;

    /* renamed from: M1 */
    public IMediaPlayer.OnInfoListener f23529M1;

    /* renamed from: N */
    public SharedPreferences f23530N;

    /* renamed from: N0 */
    public boolean f23531N0;

    /* renamed from: N1 */
    public IMediaPlayer.OnErrorListener f23532N1;

    /* renamed from: O */
    public Context f23533O;

    /* renamed from: O0 */
    public TextView f23534O0;

    /* renamed from: O1 */
    public IMediaPlayer.OnBufferingUpdateListener f23535O1;

    /* renamed from: P */
    public C6783a f23536P;

    /* renamed from: P0 */
    public TextView f23537P0;

    /* renamed from: P1 */
    public IMediaPlayer.OnSeekCompleteListener f23538P1;

    /* renamed from: Q */
    public InterfaceC4042a f23539Q;

    /* renamed from: Q0 */
    public TextView f23540Q0;

    /* renamed from: Q1 */
    public IMediaPlayer.OnTimedTextListener f23541Q1;

    /* renamed from: R */
    public int f23542R;

    /* renamed from: R0 */
    public RadioGroup f23543R0;

    /* renamed from: R1 */
    public InterfaceC4042a.a f23544R1;

    /* renamed from: S */
    public int f23545S;

    /* renamed from: S0 */
    public RadioGroup f23546S0;

    /* renamed from: S1 */
    public int f23547S1;

    /* renamed from: T */
    public long f23548T;

    /* renamed from: T0 */
    public RadioGroup f23549T0;

    /* renamed from: T1 */
    public int f23550T1;

    /* renamed from: U */
    public long f23551U;

    /* renamed from: U0 */
    public SharedPreferences.Editor f23552U0;

    /* renamed from: U1 */
    public List<Integer> f23553U1;

    /* renamed from: V */
    public long f23554V;

    /* renamed from: V0 */
    public TextView f23555V0;

    /* renamed from: V1 */
    public int f23556V1;

    /* renamed from: W */
    public long f23557W;

    /* renamed from: W0 */
    public FrameLayout f23558W0;

    /* renamed from: W1 */
    public int f23559W1;

    /* renamed from: X0 */
    public DialogC0242a f23560X0;

    /* renamed from: X1 */
    public boolean f23561X1;

    /* renamed from: Y0 */
    public SeekBar f23562Y0;

    /* renamed from: Z0 */
    public SeekBar f23563Z0;

    /* renamed from: a1 */
    public LinearLayout f23564a1;

    /* renamed from: b */
    public String f23565b;

    /* renamed from: b1 */
    public Handler f23566b1;

    /* renamed from: c */
    public Uri f23567c;

    /* renamed from: c1 */
    public Runnable f23568c1;

    /* renamed from: d */
    public String f23569d;

    /* renamed from: d1 */
    public Handler f23570d1;

    /* renamed from: e */
    public Map<String, String> f23571e;

    /* renamed from: e1 */
    public Runnable f23572e1;

    /* renamed from: f */
    public int f23573f;

    /* renamed from: f0 */
    public TextView f23574f0;

    /* renamed from: f1 */
    public Animation f23575f1;

    /* renamed from: g */
    public int f23576g;

    /* renamed from: g0 */
    public String f23577g0;

    /* renamed from: g1 */
    public Animation f23578g1;

    /* renamed from: h */
    public int f23579h;

    /* renamed from: h0 */
    public Activity f23580h0;

    /* renamed from: h1 */
    public ImageView f23581h1;

    /* renamed from: i */
    public InterfaceC4042a.b f23582i;

    /* renamed from: i0 */
    public NSTIJKPlayerEPG f23583i0;

    /* renamed from: i1 */
    public ImageView f23584i1;

    /* renamed from: j */
    public IMediaPlayer f23585j;

    /* renamed from: j0 */
    public AudioManager f23586j0;

    /* renamed from: j1 */
    public LinearLayout f23587j1;

    /* renamed from: k */
    public int f23588k;

    /* renamed from: k0 */
    public int f23589k0;

    /* renamed from: k1 */
    public LinearLayout f23590k1;

    /* renamed from: l */
    public int f23591l;

    /* renamed from: l0 */
    public float f23592l0;

    /* renamed from: l1 */
    public int f23593l1;

    /* renamed from: m */
    public int f23594m;

    /* renamed from: m0 */
    public GestureDetector f23595m0;

    /* renamed from: m1 */
    public TextView f23596m1;

    /* renamed from: n */
    public int f23597n;

    /* renamed from: n0 */
    public int f23598n0;

    /* renamed from: n1 */
    public TextView f23599n1;

    /* renamed from: o */
    public int f23600o;

    /* renamed from: o0 */
    public View f23601o0;

    /* renamed from: o1 */
    public LinearLayout f23602o1;

    /* renamed from: p */
    public InterfaceC7706b f23603p;

    /* renamed from: p0 */
    public C3864z f23604p0;

    /* renamed from: p1 */
    public Animation f23605p1;

    /* renamed from: q */
    public IMediaPlayer.OnCompletionListener f23606q;

    /* renamed from: q0 */
    public Button f23607q0;

    /* renamed from: q1 */
    public Animation f23608q1;

    /* renamed from: r */
    public IMediaPlayer.OnPreparedListener f23609r;

    /* renamed from: r0 */
    public Boolean f23610r0;

    /* renamed from: r1 */
    public RelativeLayout f23611r1;

    /* renamed from: s */
    public int f23612s;

    /* renamed from: s0 */
    public Boolean f23613s0;

    /* renamed from: s1 */
    public Animation f23614s1;

    /* renamed from: t */
    public IMediaPlayer.OnErrorListener f23615t;

    /* renamed from: t0 */
    public Boolean f23616t0;

    /* renamed from: t1 */
    public LinearLayout f23617t1;

    /* renamed from: u */
    public IMediaPlayer.OnInfoListener f23618u;

    /* renamed from: u0 */
    public Boolean f23619u0;

    /* renamed from: u1 */
    public Animation f23620u1;

    /* renamed from: v */
    public int f23621v;

    /* renamed from: v0 */
    public Boolean f23622v0;

    /* renamed from: v1 */
    public Animation f23623v1;

    /* renamed from: w */
    public boolean f23624w;

    /* renamed from: w0 */
    public Boolean f23625w0;

    /* renamed from: w1 */
    public Animation f23626w1;

    /* renamed from: x */
    public boolean f23627x;

    /* renamed from: x0 */
    public boolean f23628x0;

    /* renamed from: x1 */
    public SharedPreferences f23629x1;

    /* renamed from: y */
    public boolean f23630y;

    /* renamed from: y0 */
    public StringBuilder f23631y0;

    /* renamed from: y1 */
    public RelativeLayout f23632y1;

    /* renamed from: z */
    public int f23633z;

    /* renamed from: z0 */
    public Formatter f23634z0;

    /* renamed from: z1 */
    public boolean f23635z1;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$a.class */
    public class C3839a implements IMediaPlayer.OnInfoListener {

        /* renamed from: a */
        public final NSTIJKPlayerEPG f23636a;

        public C3839a(NSTIJKPlayerEPG nSTIJKPlayerEPG) {
            this.f23636a = nSTIJKPlayerEPG;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i10, int i11) {
            String str;
            String str2;
            if (this.f23636a.f23618u != null) {
                this.f23636a.f23618u.onInfo(iMediaPlayer, i10, i11);
            }
            if (i10 == 3) {
                this.f23636a.m18782f1(2);
                str = this.f23636a.f23565b;
                str2 = "MEDIA_INFO_VIDEO_RENDERING_START:";
            } else if (i10 == 10005) {
                this.f23636a.m18782f1(1);
                str = this.f23636a.f23565b;
                str2 = "MEDIA_INFO_OPEN_INPUT:";
            } else if (i10 == 901) {
                str = this.f23636a.f23565b;
                str2 = "MEDIA_INFO_UNSUPPORTED_SUBTITLE:";
            } else if (i10 == 902) {
                str = this.f23636a.f23565b;
                str2 = "MEDIA_INFO_SUBTITLE_TIMED_OUT:";
            } else {
                if (i10 == 10001) {
                    this.f23636a.f23600o = i11;
                    Log.d(this.f23636a.f23565b, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i11);
                    InterfaceC4042a interfaceC4042a = this.f23636a.f23539Q;
                    if (interfaceC4042a == null) {
                        return true;
                    }
                    interfaceC4042a.setVideoRotation(i11);
                    return true;
                }
                if (i10 != 10002) {
                    switch (i10) {
                        case 700:
                            str = this.f23636a.f23565b;
                            str2 = "MEDIA_INFO_VIDEO_TRACK_LAGGING:";
                            break;
                        case IMediaPlayer.MEDIA_INFO_BUFFERING_START /* 701 */:
                            this.f23636a.m18782f1(1);
                            str = this.f23636a.f23565b;
                            str2 = "MEDIA_INFO_BUFFERING_START:";
                            break;
                        case IMediaPlayer.MEDIA_INFO_BUFFERING_END /* 702 */:
                            this.f23636a.m18782f1(6);
                            str = this.f23636a.f23565b;
                            str2 = "MEDIA_INFO_BUFFERING_END:";
                            break;
                        case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                            str = this.f23636a.f23565b;
                            str2 = "MEDIA_INFO_NETWORK_BANDWIDTH: " + i11;
                            break;
                        default:
                            switch (i10) {
                                case 800:
                                    str = this.f23636a.f23565b;
                                    str2 = "MEDIA_INFO_BAD_INTERLEAVING:";
                                    break;
                                case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                    str = this.f23636a.f23565b;
                                    str2 = "MEDIA_INFO_NOT_SEEKABLE:";
                                    break;
                                case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                    str = this.f23636a.f23565b;
                                    str2 = "MEDIA_INFO_METADATA_UPDATE:";
                                    break;
                                default:
                                    return true;
                            }
                    }
                } else {
                    str = this.f23636a.f23565b;
                    str2 = "MEDIA_INFO_AUDIO_RENDERING_START:";
                }
            }
            Log.d(str, str2);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$b.class */
    public class C3840b implements IMediaPlayer.OnErrorListener {

        /* renamed from: a */
        public final NSTIJKPlayerEPG f23637a;

        public C3840b(NSTIJKPlayerEPG nSTIJKPlayerEPG) {
            this.f23637a = nSTIJKPlayerEPG;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i10, int i11) {
            Log.d(this.f23637a.f23565b, "Error: " + i10 + "," + i11);
            this.f23637a.f23576g = -1;
            this.f23637a.f23579h = -1;
            if (this.f23637a.f23603p != null) {
                this.f23637a.f23603p.m33655d();
            }
            this.f23637a.m18782f1(-1);
            if (this.f23637a.f23615t == null) {
                return true;
            }
            this.f23637a.f23615t.onError(this.f23637a.f23585j, i10, i11);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$c.class */
    public class C3841c implements IMediaPlayer.OnBufferingUpdateListener {

        /* renamed from: a */
        public final NSTIJKPlayerEPG f23638a;

        public C3841c(NSTIJKPlayerEPG nSTIJKPlayerEPG) {
            this.f23638a = nSTIJKPlayerEPG;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i10) {
            this.f23638a.f23612s = i10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$d.class */
    public class C3842d implements IMediaPlayer.OnSeekCompleteListener {

        /* renamed from: a */
        public final NSTIJKPlayerEPG f23639a;

        public C3842d(NSTIJKPlayerEPG nSTIJKPlayerEPG) {
            this.f23639a = nSTIJKPlayerEPG;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            this.f23639a.f23557W = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$e.class */
    public class C3843e implements IMediaPlayer.OnTimedTextListener {

        /* renamed from: a */
        public final NSTIJKPlayerEPG f23640a;

        public C3843e(NSTIJKPlayerEPG nSTIJKPlayerEPG) {
            this.f23640a = nSTIJKPlayerEPG;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnTimedTextListener
        public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            TextView textView;
            if (ijkTimedText == null) {
                this.f23640a.f23574f0.setVisibility(8);
                return;
            }
            String replace = ijkTimedText.getText().replace("{\\b1}", "").replace("{\\b0}", "").replace("{\\i1}", "").replace("{\\i0}", "").replace("{\\c}", "");
            StringBuilder sb2 = new StringBuilder();
            try {
                if (replace.contains("{")) {
                    for (String str : replace.split("\\{")) {
                        String str2 = str;
                        if (str.contains("}")) {
                            str2 = str.substring(str.lastIndexOf("}") + 1);
                        }
                        sb2.append(str2);
                    }
                }
            } catch (Exception e10) {
            }
            NSTIJKPlayerEPG nSTIJKPlayerEPG = this.f23640a;
            nSTIJKPlayerEPG.f23525L0 = nSTIJKPlayerEPG.f23533O.getSharedPreferences("pref.using_sub_font_size", 0);
            try {
                this.f23640a.f23574f0.setTextSize(2, Float.parseFloat(this.f23640a.f23525L0.getString("pref.using_sub_font_size", C5251a.f30039f0)));
            } catch (Exception e11) {
            }
            if (this.f23640a.getShowOrHideSubtitles().equals("visible")) {
                this.f23640a.f23574f0.setVisibility(0);
            } else {
                this.f23640a.f23574f0.setVisibility(8);
            }
            if (sb2.length() > 0) {
                textView = this.f23640a.f23574f0;
                replace = sb2.toString();
            } else {
                textView = this.f23640a.f23574f0;
            }
            textView.setText(replace);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$f.class */
    public class C3844f implements InterfaceC4042a.a {

        /* renamed from: a */
        public final NSTIJKPlayerEPG f23641a;

        public C3844f(NSTIJKPlayerEPG nSTIJKPlayerEPG) {
            this.f23641a = nSTIJKPlayerEPG;
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.a
        /* renamed from: a */
        public void mo18794a(InterfaceC4042a.b bVar, int i10, int i11, int i12) {
            InterfaceC4042a mo19699a = bVar.mo19699a();
            NSTIJKPlayerEPG nSTIJKPlayerEPG = this.f23641a;
            if (mo19699a != nSTIJKPlayerEPG.f23539Q) {
                Log.e(nSTIJKPlayerEPG.f23565b, "onSurfaceChanged: unmatched render callback\n");
                return;
            }
            nSTIJKPlayerEPG.f23594m = i11;
            this.f23641a.f23597n = i12;
            boolean z10 = this.f23641a.f23579h == 3;
            boolean z11 = true;
            if (this.f23641a.f23539Q.mo19697d()) {
                z11 = this.f23641a.f23588k == i11 && this.f23641a.f23591l == i12;
            }
            if (this.f23641a.f23585j != null && z10 && z11) {
                if (this.f23641a.f23621v != 0) {
                    NSTIJKPlayerEPG nSTIJKPlayerEPG2 = this.f23641a;
                    nSTIJKPlayerEPG2.seekTo(nSTIJKPlayerEPG2.f23621v);
                }
                this.f23641a.start();
            }
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.a
        /* renamed from: b */
        public void mo18795b(InterfaceC4042a.b bVar) {
            InterfaceC4042a mo19699a = bVar.mo19699a();
            NSTIJKPlayerEPG nSTIJKPlayerEPG = this.f23641a;
            if (mo19699a != nSTIJKPlayerEPG.f23539Q) {
                Log.e(nSTIJKPlayerEPG.f23565b, "onSurfaceDestroyed: unmatched render callback\n");
            } else {
                nSTIJKPlayerEPG.f23582i = null;
                this.f23641a.m18773W0();
            }
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.a
        /* renamed from: c */
        public void mo18796c(InterfaceC4042a.b bVar, int i10, int i11) {
            InterfaceC4042a mo19699a = bVar.mo19699a();
            NSTIJKPlayerEPG nSTIJKPlayerEPG = this.f23641a;
            if (mo19699a != nSTIJKPlayerEPG.f23539Q) {
                Log.e(nSTIJKPlayerEPG.f23565b, "onSurfaceCreated: unmatched render callback\n");
                return;
            }
            nSTIJKPlayerEPG.f23582i = bVar;
            if (this.f23641a.f23585j == null) {
                this.f23641a.m18771U0();
            } else {
                NSTIJKPlayerEPG nSTIJKPlayerEPG2 = this.f23641a;
                nSTIJKPlayerEPG2.m18758H0(nSTIJKPlayerEPG2.f23585j, bVar);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$g.class */
    public class RunnableC3845g implements Runnable {

        /* renamed from: b */
        public final LinearLayout f23642b;

        /* renamed from: c */
        public final NSTIJKPlayerEPG f23643c;

        public RunnableC3845g(NSTIJKPlayerEPG nSTIJKPlayerEPG, LinearLayout linearLayout) {
            this.f23643c = nSTIJKPlayerEPG;
            this.f23642b = linearLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23642b.setVisibility(8);
            if (this.f23643c.f23564a1.getVisibility() != 0 || this.f23643c.f23602o1 == null) {
                return;
            }
            this.f23643c.f23602o1.setVisibility(0);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$h.class */
    public class ViewOnClickListenerC3846h implements View.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerEPG f23644b;

        public ViewOnClickListenerC3846h(NSTIJKPlayerEPG nSTIJKPlayerEPG) {
            this.f23644b = nSTIJKPlayerEPG;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f23644b.m18787k1();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$i.class */
    public class C3847i implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a */
        public final int f23645a;

        /* renamed from: b */
        public final NSTIJKPlayerEPG f23646b;

        public C3847i(NSTIJKPlayerEPG nSTIJKPlayerEPG, int i10) {
            this.f23646b = nSTIJKPlayerEPG;
            this.f23645a = i10;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i10) {
            NSTIJKPlayerEPG nSTIJKPlayerEPG = this.f23646b;
            nSTIJKPlayerEPG.f23516I0 = nSTIJKPlayerEPG.f23507F0.edit();
            if (i10 == 111 || i10 == 11111111) {
                this.f23646b.f23516I0.putInt("currentVideoTrack", -1);
                this.f23646b.m18761K0(this.f23645a);
            } else {
                this.f23646b.f23516I0.putInt("currentVideoTrack", i10);
                this.f23646b.m18775Y0(i10);
            }
            this.f23646b.f23516I0.apply();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$j.class */
    public class C3848j implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a */
        public final int f23647a;

        /* renamed from: b */
        public final NSTIJKPlayerEPG f23648b;

        public C3848j(NSTIJKPlayerEPG nSTIJKPlayerEPG, int i10) {
            this.f23648b = nSTIJKPlayerEPG;
            this.f23647a = i10;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i10) {
            NSTIJKPlayerEPG nSTIJKPlayerEPG = this.f23648b;
            nSTIJKPlayerEPG.f23513H0 = nSTIJKPlayerEPG.f23504E0.edit();
            if (i10 == 1111 || i10 == 1111111) {
                this.f23648b.f23513H0.putInt("currentAudioTrack", -1);
                this.f23648b.m18761K0(this.f23647a);
            } else {
                this.f23648b.f23513H0.putInt("currentAudioTrack", i10);
                int currentPosition = (int) this.f23648b.f23585j.getCurrentPosition();
                this.f23648b.m18775Y0(i10);
                this.f23648b.f23585j.seekTo(Long.parseLong(String.valueOf(currentPosition)));
            }
            this.f23648b.f23513H0.apply();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$k.class */
    public class C3849k implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: b */
        public final NSTIJKPlayerEPG f23649b;

        public C3849k(NSTIJKPlayerEPG nSTIJKPlayerEPG) {
            this.f23649b = nSTIJKPlayerEPG;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            TextView textView;
            Resources resources;
            int i11;
            this.f23649b.f23592l0 = i10;
            int i12 = (int) ((this.f23649b.f23592l0 / 255.0f) * 100.0f);
            if (i12 < 20) {
                textView = this.f23649b.f23596m1;
                resources = this.f23649b.getResources();
                i11 = 2131231123;
            } else if (i12 < 30) {
                textView = this.f23649b.f23596m1;
                resources = this.f23649b.getResources();
                i11 = 2131231124;
            } else if (i12 < 40) {
                textView = this.f23649b.f23596m1;
                resources = this.f23649b.getResources();
                i11 = 2131231125;
            } else if (i12 < 50) {
                textView = this.f23649b.f23596m1;
                resources = this.f23649b.getResources();
                i11 = 2131231126;
            } else if (i12 < 60) {
                textView = this.f23649b.f23596m1;
                resources = this.f23649b.getResources();
                i11 = 2131231127;
            } else if (i12 < 70) {
                textView = this.f23649b.f23596m1;
                resources = this.f23649b.getResources();
                i11 = 2131231128;
            } else {
                textView = this.f23649b.f23596m1;
                resources = this.f23649b.getResources();
                i11 = 2131231129;
            }
            textView.setBackground(resources.getDrawable(i11));
            WindowManager.LayoutParams attributes = this.f23649b.f23580h0.getWindow().getAttributes();
            attributes.screenBrightness = this.f23649b.f23592l0 / 255.0f;
            this.f23649b.f23536P.m31256O((int) this.f23649b.f23592l0);
            this.f23649b.f23580h0.getWindow().setAttributes(attributes);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            this.f23649b.m18784h1();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            this.f23649b.m18784h1();
            this.f23649b.m18756F0(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$l.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$l.class */
    public class C3850l implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a */
        public final int f23650a;

        /* renamed from: b */
        public final NSTIJKPlayerEPG f23651b;

        public C3850l(NSTIJKPlayerEPG nSTIJKPlayerEPG, int i10) {
            this.f23651b = nSTIJKPlayerEPG;
            this.f23650a = i10;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i10) {
            NSTIJKPlayerEPG nSTIJKPlayerEPG = this.f23651b;
            nSTIJKPlayerEPG.f23510G0 = nSTIJKPlayerEPG.f23501D0.edit();
            if (i10 == 11111 || i10 == 111111) {
                TextView textView = this.f23651b.f23574f0;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                this.f23651b.f23510G0.putInt("currentSubtitleTrack", -1);
                this.f23651b.m18761K0(this.f23650a);
            } else {
                TextView textView2 = this.f23651b.f23574f0;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                this.f23651b.f23510G0.putInt("currentSubtitleTrack", i10);
                this.f23651b.m18775Y0(i10);
            }
            this.f23651b.f23510G0.apply();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$m.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG$m */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$m.class */
    public class DialogInterfaceOnClickListenerC3851m implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerEPG f23652b;

        public DialogInterfaceOnClickListenerC3851m(NSTIJKPlayerEPG nSTIJKPlayerEPG) {
            this.f23652b = nSTIJKPlayerEPG;
        }

        @Override // android.content.DialogInterface.OnClickListener
        @SuppressLint({"SetTextI18n"})
        public void onClick(DialogInterface dialogInterface, int i10) {
            NSTIJKPlayerEPG nSTIJKPlayerEPG;
            String str;
            switch (i10) {
                case 0:
                    nSTIJKPlayerEPG = this.f23652b;
                    str = "10";
                    break;
                case 1:
                    nSTIJKPlayerEPG = this.f23652b;
                    str = "12";
                    break;
                case 2:
                    nSTIJKPlayerEPG = this.f23652b;
                    str = "14";
                    break;
                case 3:
                    nSTIJKPlayerEPG = this.f23652b;
                    str = "16";
                    break;
                case 4:
                    nSTIJKPlayerEPG = this.f23652b;
                    str = "18";
                    break;
                case 5:
                    nSTIJKPlayerEPG = this.f23652b;
                    str = "20";
                    break;
                case 6:
                    nSTIJKPlayerEPG = this.f23652b;
                    str = "22";
                    break;
                case 7:
                    nSTIJKPlayerEPG = this.f23652b;
                    str = "24";
                    break;
                case 8:
                    nSTIJKPlayerEPG = this.f23652b;
                    str = "26";
                    break;
                case 9:
                    nSTIJKPlayerEPG = this.f23652b;
                    str = "28";
                    break;
                case 10:
                    nSTIJKPlayerEPG = this.f23652b;
                    str = "30";
                    break;
                case 11:
                    nSTIJKPlayerEPG = this.f23652b;
                    str = "32";
                    break;
                case 12:
                    nSTIJKPlayerEPG = this.f23652b;
                    str = "34";
                    break;
                case 13:
                    nSTIJKPlayerEPG = this.f23652b;
                    str = "36";
                    break;
                case 14:
                    nSTIJKPlayerEPG = this.f23652b;
                    str = "38";
                    break;
                case 15:
                    nSTIJKPlayerEPG = this.f23652b;
                    str = "40";
                    break;
                default:
                    return;
            }
            nSTIJKPlayerEPG.m18788l1(str);
            this.f23652b.f23555V0.setText(str);
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$n.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG$n */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$n.class */
    public class DialogInterfaceOnDismissListenerC3852n implements DialogInterface.OnDismissListener {

        /* renamed from: b */
        public final NSTIJKPlayerEPG f23653b;

        public DialogInterfaceOnDismissListenerC3852n(NSTIJKPlayerEPG nSTIJKPlayerEPG) {
            this.f23653b = nSTIJKPlayerEPG;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$o.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG$o */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$o.class */
    public class C3853o implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: b */
        public final NSTIJKPlayerEPG f23654b;

        public C3853o(NSTIJKPlayerEPG nSTIJKPlayerEPG) {
            this.f23654b = nSTIJKPlayerEPG;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            TextView textView;
            Drawable drawable;
            Resources resources;
            if (this.f23654b.f23586j0 != null) {
                try {
                    this.f23654b.f23586j0.setStreamVolume(3, i10, 0);
                    int streamVolume = (int) ((this.f23654b.f23586j0.getStreamVolume(3) / this.f23654b.f23589k0) * 100.0f);
                    if (streamVolume == 0 || streamVolume < 0) {
                        textView = this.f23654b.f23599n1;
                        drawable = this.f23654b.getResources().getDrawable(2131231157);
                    } else if (streamVolume < 40) {
                        textView = this.f23654b.f23599n1;
                        drawable = this.f23654b.getResources().getDrawable(2131231154);
                    } else if (streamVolume < 80) {
                        textView = this.f23654b.f23599n1;
                        drawable = this.f23654b.getResources().getDrawable(2131231155);
                    } else {
                        if (streamVolume < 100) {
                            textView = this.f23654b.f23599n1;
                            resources = this.f23654b.getResources();
                        } else {
                            textView = this.f23654b.f23599n1;
                            resources = this.f23654b.getResources();
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
            this.f23654b.m18784h1();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            this.f23654b.m18784h1();
            this.f23654b.m18756F0(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$p.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG$p */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$p.class */
    public class ViewOnTouchListenerC3854p implements View.OnTouchListener {

        /* renamed from: b */
        public final NSTIJKPlayerEPG f23655b;

        public ViewOnTouchListenerC3854p(NSTIJKPlayerEPG nSTIJKPlayerEPG) {
            this.f23655b = nSTIJKPlayerEPG;
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return motionEvent != null && this.f23655b.f23595m0.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$q.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG$q */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$q.class */
    public class RunnableC3855q implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerEPG f23656b;

        public RunnableC3855q(NSTIJKPlayerEPG nSTIJKPlayerEPG) {
            this.f23656b = nSTIJKPlayerEPG;
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerEPG nSTIJKPlayerEPG = this.f23656b;
            nSTIJKPlayerEPG.f23515I++;
            C5255e.m26241k0(nSTIJKPlayerEPG.f23580h0, this.f23656b.f23580h0.getResources().getString(2132018322) + " (" + this.f23656b.f23515I + "/" + this.f23656b.f23518J + ")");
            this.f23656b.m18771U0();
            this.f23656b.start();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$r.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG$r */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$r.class */
    public class RunnableC3856r implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerEPG f23657b;

        public RunnableC3856r(NSTIJKPlayerEPG nSTIJKPlayerEPG) {
            this.f23657b = nSTIJKPlayerEPG;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23657b.m18765O0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$s.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG$s */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$s.class */
    public class RunnableC3857s implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerEPG f23658b;

        public RunnableC3857s(NSTIJKPlayerEPG nSTIJKPlayerEPG) {
            this.f23658b = nSTIJKPlayerEPG;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23658b.m18764N0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$t.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG$t */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$t.class */
    public class C3858t implements IMediaPlayer.OnVideoSizeChangedListener {

        /* renamed from: a */
        public final NSTIJKPlayerEPG f23659a;

        public C3858t(NSTIJKPlayerEPG nSTIJKPlayerEPG) {
            this.f23659a = nSTIJKPlayerEPG;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i10, int i11, int i12, int i13) {
            this.f23659a.f23588k = iMediaPlayer.getVideoWidth();
            this.f23659a.f23591l = iMediaPlayer.getVideoHeight();
            this.f23659a.f23542R = iMediaPlayer.getVideoSarNum();
            this.f23659a.f23545S = iMediaPlayer.getVideoSarDen();
            if (this.f23659a.f23588k == 0 || this.f23659a.f23591l == 0) {
                return;
            }
            NSTIJKPlayerEPG nSTIJKPlayerEPG = this.f23659a;
            InterfaceC4042a interfaceC4042a = nSTIJKPlayerEPG.f23539Q;
            if (interfaceC4042a != null) {
                interfaceC4042a.mo19696c(nSTIJKPlayerEPG.f23588k, this.f23659a.f23591l);
                NSTIJKPlayerEPG nSTIJKPlayerEPG2 = this.f23659a;
                nSTIJKPlayerEPG2.f23539Q.mo19694a(nSTIJKPlayerEPG2.f23542R, this.f23659a.f23545S);
            }
            this.f23659a.requestLayout();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$u.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG$u */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$u.class */
    public class C3859u implements IMediaPlayer.OnPreparedListener {

        /* renamed from: a */
        public final NSTIJKPlayerEPG f23660a;

        public C3859u(NSTIJKPlayerEPG nSTIJKPlayerEPG) {
            this.f23660a = nSTIJKPlayerEPG;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            this.f23660a.f23551U = System.currentTimeMillis();
            this.f23660a.f23576g = 2;
            if (this.f23660a.f23609r != null) {
                this.f23660a.f23609r.onPrepared(this.f23660a.f23585j);
            }
            if (this.f23660a.f23603p != null) {
                this.f23660a.f23603p.setEnabled(true);
            }
            this.f23660a.f23588k = iMediaPlayer.getVideoWidth();
            this.f23660a.f23591l = iMediaPlayer.getVideoHeight();
            int i10 = this.f23660a.f23621v;
            if (i10 != 0) {
                this.f23660a.seekTo(i10);
            }
            if (this.f23660a.f23588k == 0 || this.f23660a.f23591l == 0) {
                if (this.f23660a.f23579h == 3) {
                    this.f23660a.start();
                    return;
                }
                return;
            }
            NSTIJKPlayerEPG nSTIJKPlayerEPG = this.f23660a;
            InterfaceC4042a interfaceC4042a = nSTIJKPlayerEPG.f23539Q;
            if (interfaceC4042a != null) {
                interfaceC4042a.mo19696c(nSTIJKPlayerEPG.f23588k, this.f23660a.f23591l);
                NSTIJKPlayerEPG nSTIJKPlayerEPG2 = this.f23660a;
                nSTIJKPlayerEPG2.f23539Q.mo19694a(nSTIJKPlayerEPG2.f23542R, this.f23660a.f23545S);
                if (!this.f23660a.f23539Q.mo19697d() || (this.f23660a.f23594m == this.f23660a.f23588k && this.f23660a.f23597n == this.f23660a.f23591l)) {
                    if (this.f23660a.f23579h == 3) {
                        this.f23660a.start();
                        if (this.f23660a.f23603p != null) {
                            this.f23660a.f23603p.show();
                            return;
                        }
                        return;
                    }
                    if (this.f23660a.isPlaying()) {
                        return;
                    }
                    if ((i10 != 0 || this.f23660a.getCurrentPosition() > 0) && this.f23660a.f23603p != null) {
                        this.f23660a.f23603p.show(0);
                    }
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$v.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG$v */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$v.class */
    public class C3860v implements IMediaPlayer.OnCompletionListener {

        /* renamed from: a */
        public final NSTIJKPlayerEPG f23661a;

        public C3860v(NSTIJKPlayerEPG nSTIJKPlayerEPG) {
            this.f23661a = nSTIJKPlayerEPG;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            this.f23661a.f23576g = 5;
            this.f23661a.f23579h = 5;
            if (this.f23661a.f23603p != null) {
                this.f23661a.f23603p.m33655d();
            }
            this.f23661a.m18784h1();
            this.f23661a.m18779c1();
            this.f23661a.m18756F0(TFTP.DEFAULT_TIMEOUT);
            if (this.f23661a.f23606q != null) {
                this.f23661a.f23606q.onCompletion(this.f23661a.f23585j);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$w.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG$w */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$w.class */
    public static abstract class AbstractC3861w {
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$x.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG$x */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$x.class */
    public class ViewOnFocusChangeListenerC3862x implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f23662b;

        /* renamed from: c */
        public final NSTIJKPlayerEPG f23663c;

        public ViewOnFocusChangeListenerC3862x(NSTIJKPlayerEPG nSTIJKPlayerEPG, View view) {
            this.f23663c = nSTIJKPlayerEPG;
            this.f23662b = view;
        }

        /* renamed from: a */
        public final void m18797a(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f23662b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: b */
        public final void m18798b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f23662b, "scaleY", f10);
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
                View view2 = this.f23662b;
                if (view2 != null && view2.getTag() != null && this.f23662b.getTag().equals("1") && this.f23663c.f23607q0 != null) {
                    this.f23663c.f23607q0.setBackgroundResource(2131230845);
                }
                m18797a(1.0f);
                m18798b(1.0f);
                return;
            }
            View view3 = this.f23662b;
            if (view3 != null && view3.getTag() != null && this.f23662b.getTag().equals("2")) {
                view.setBackground(this.f23663c.getResources().getDrawable(2131231814));
                return;
            }
            if (z10) {
                f10 = 1.12f;
            }
            m18797a(f10);
            m18798b(f10);
            View view4 = this.f23662b;
            if (view4 == null || view4.getTag() == null || !this.f23662b.getTag().equals("1") || this.f23663c.f23607q0 == null) {
                return;
            }
            this.f23663c.f23607q0.setBackgroundResource(2131230828);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$y.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG$y */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$y.class */
    public class C3863y extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: b */
        public boolean f23664b;

        /* renamed from: c */
        public final NSTIJKPlayerEPG f23665c;

        public C3863y(NSTIJKPlayerEPG nSTIJKPlayerEPG) {
            this.f23665c = nSTIJKPlayerEPG;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            this.f23664b = true;
            return super.onDown(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            this.f23665c.m18790n1();
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$z.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG$z */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEPG$z.class */
    public class C3864z {

        /* renamed from: a */
        public final Activity f23666a;

        /* renamed from: b */
        public View f23667b;

        /* renamed from: c */
        public final NSTIJKPlayerEPG f23668c;

        public C3864z(NSTIJKPlayerEPG nSTIJKPlayerEPG, Activity activity) {
            this.f23668c = nSTIJKPlayerEPG;
            this.f23666a = activity;
        }

        /* renamed from: a */
        public C3864z m18799a() {
            View view = this.f23667b;
            if (view != null) {
                view.setVisibility(8);
            }
            return this;
        }

        /* renamed from: b */
        public C3864z m18800b(int i10) {
            this.f23667b = this.f23666a.findViewById(i10);
            return this;
        }

        /* renamed from: c */
        public C3864z m18801c() {
            View view = this.f23667b;
            if (view != null) {
                view.requestFocus();
            }
            return this;
        }

        /* renamed from: d */
        public C3864z m18802d(CharSequence charSequence) {
            View view = this.f23667b;
            if (view != null && (view instanceof TextView)) {
                ((TextView) view).setText(charSequence);
            }
            return this;
        }

        /* renamed from: e */
        public C3864z m18803e() {
            View view = this.f23667b;
            if (view != null) {
                view.setVisibility(0);
            }
            return this;
        }
    }

    public NSTIJKPlayerEPG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23565b = "NSTIJKPlayerEPG";
        this.f23573f = 0;
        this.f23576g = 0;
        this.f23579h = 0;
        this.f23582i = null;
        this.f23585j = null;
        this.f23624w = true;
        this.f23627x = true;
        this.f23630y = true;
        this.f23633z = -1;
        this.f23491A = -1L;
        this.f23494B = true;
        this.f23497C = false;
        this.f23500D = 7000;
        this.f23509G = 0;
        this.f23515I = 0;
        this.f23518J = 5;
        this.f23521K = false;
        this.f23548T = 0L;
        this.f23551U = 0L;
        this.f23554V = 0L;
        this.f23557W = 0L;
        this.f23577g0 = "visible";
        this.f23592l0 = -1.0f;
        Boolean bool = Boolean.FALSE;
        this.f23610r0 = bool;
        this.f23613s0 = bool;
        this.f23616t0 = bool;
        this.f23619u0 = bool;
        this.f23622v0 = bool;
        this.f23625w0 = bool;
        this.f23628x0 = false;
        this.f23492A0 = false;
        this.f23495B0 = false;
        this.f23519J0 = false;
        this.f23522K0 = false;
        this.f23531N0 = false;
        this.f23593l1 = 0;
        this.f23493A1 = false;
        this.f23511G1 = "";
        this.f23514H1 = new C3849k(this);
        this.f23517I1 = new C3853o(this);
        this.f23520J1 = new C3858t(this);
        this.f23523K1 = new C3859u(this);
        this.f23526L1 = new C3860v(this);
        this.f23529M1 = new C3839a(this);
        this.f23532N1 = new C3840b(this);
        this.f23535O1 = new C3841c(this);
        this.f23538P1 = new C3842d(this);
        this.f23541Q1 = new C3843e(this);
        this.f23544R1 = new C3844f(this);
        this.f23547S1 = 4;
        this.f23550T1 = f23490Y1[0];
        this.f23553U1 = new ArrayList();
        this.f23556V1 = 0;
        this.f23559W1 = 0;
        this.f23561X1 = false;
        m18768R0(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.view.View] */
    /* renamed from: E0 */
    public final void m18755E0() {
        InterfaceC7706b interfaceC7706b;
        if (this.f23585j == null || (interfaceC7706b = this.f23603p) == null) {
            return;
        }
        interfaceC7706b.m33654c(this);
        this.f23603p.m33653b(getParent() instanceof View ? (View) getParent() : this);
        this.f23603p.setEnabled(m18770T0());
    }

    /* renamed from: F0 */
    public void m18756F0(int i10) {
        if (NSTIJKPlayerEPGActivity.f22476N1) {
            return;
        }
        RunnableC3857s runnableC3857s = new RunnableC3857s(this);
        this.f23568c1 = runnableC3857s;
        this.f23566b1.postDelayed(runnableC3857s, i10);
    }

    /* renamed from: G0 */
    public void m18757G0(int i10) {
        RunnableC3856r runnableC3856r = new RunnableC3856r(this);
        this.f23572e1 = runnableC3856r;
        this.f23570d1.postDelayed(runnableC3856r, i10);
    }

    /* renamed from: H0 */
    public final void m18758H0(IMediaPlayer iMediaPlayer, InterfaceC4042a.b bVar) {
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
    public final String m18759I0(String str) {
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
    public tv.danmaku.ijk.media.player.IMediaPlayer m18760J0(int r7) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG.m18760J0(int):tv.danmaku.ijk.media.player.IMediaPlayer");
    }

    @Override // p324sf.InterfaceC8574m
    /* renamed from: K */
    public void mo16817K(VodInfoCallback vodInfoCallback) {
    }

    /* renamed from: K0 */
    public void m18761K0(int i10) {
        C7709e.m33681b(this.f23585j, i10);
    }

    /* renamed from: L0 */
    public void m18762L0() {
        ServiceC6971a.m31982d(this.f23585j);
    }

    /* renamed from: M0 */
    public void m18763M0(Boolean bool) {
        this.f23512H = bool.booleanValue();
    }

    /* renamed from: N0 */
    public void m18764N0() {
        if (NSTIJKPlayerEPGActivity.f22476N1 || this.f23564a1.getVisibility() != 0) {
            return;
        }
        this.f23564a1.startAnimation(this.f23578g1);
        if (this.f23587j1.getVisibility() == 0) {
            this.f23587j1.startAnimation(this.f23578g1);
        }
        if (this.f23581h1.getVisibility() == 0) {
            this.f23581h1.startAnimation(this.f23578g1);
        }
        if (this.f23602o1.getVisibility() == 0) {
            this.f23602o1.startAnimation(this.f23578g1);
        }
        if (!this.f23511G1.equals("true") && this.f23584i1.getVisibility() == 0) {
            this.f23584i1.startAnimation(this.f23578g1);
        }
        if (this.f23590k1.getVisibility() == 0) {
            this.f23590k1.startAnimation(this.f23578g1);
        }
        this.f23564a1.setVisibility(8);
        if (this.f23587j1.getVisibility() == 0) {
            this.f23587j1.setVisibility(8);
        }
        if (this.f23581h1.getVisibility() == 0) {
            this.f23581h1.setVisibility(8);
        }
        if (this.f23602o1.getVisibility() == 0) {
            this.f23602o1.setVisibility(8);
        }
        if (!this.f23511G1.equals("true") && this.f23584i1.getVisibility() == 0) {
            this.f23584i1.setVisibility(8);
        }
        if (this.f23590k1.getVisibility() == 0) {
            this.f23590k1.setVisibility(8);
        }
    }

    /* renamed from: O0 */
    public void m18765O0() {
        if (this.f23617t1.getVisibility() == 0) {
            this.f23617t1.startAnimation(this.f23623v1);
            this.f23617t1.setVisibility(8);
        }
    }

    /* renamed from: P0 */
    public final void m18766P0() {
        boolean m31278p = this.f23536P.m31278p();
        this.f23561X1 = m31278p;
        if (m31278p) {
            ServiceC6971a.m31980b(getContext());
            this.f23585j = ServiceC6971a.m31979a();
        }
    }

    /* renamed from: Q0 */
    public final void m18767Q0() {
        this.f23553U1.clear();
        if (this.f23536P.m31281s()) {
            this.f23553U1.add(1);
        }
        if (this.f23536P.m31282t()) {
            this.f23553U1.add(2);
        }
        if (this.f23536P.m31280r()) {
            this.f23553U1.add(0);
        }
        if (this.f23553U1.isEmpty()) {
            this.f23553U1.add(1);
        }
        int intValue = this.f23553U1.get(this.f23556V1).intValue();
        this.f23559W1 = intValue;
        setRender(intValue);
    }

    /* renamed from: R0 */
    public final void m18768R0(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f23533O = applicationContext;
        this.f23536P = new C6783a(applicationContext);
        this.f23528M0 = new C5378j(this, this.f23533O);
        m18766P0();
        m18767Q0();
        this.f23588k = 0;
        this.f23591l = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f23576g = 0;
        this.f23579h = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences("pref.using_sub_font_size", 0);
        this.f23525L0 = sharedPreferences;
        String string = sharedPreferences.getString("pref.using_sub_font_size", C5251a.f30039f0);
        TextView textView = new TextView(context);
        this.f23574f0 = textView;
        try {
            textView.setTextSize(2, Float.parseFloat(string));
        } catch (Exception e10) {
        }
        this.f23574f0.setTextColor(context.getResources().getColor(2131100158));
        this.f23574f0.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams.setMargins(0, 0, 0, 40);
        addView(this.f23574f0, layoutParams);
    }

    /* renamed from: S0 */
    public boolean m18769S0() {
        return this.f23561X1;
    }

    /* renamed from: T0 */
    public final boolean m18770T0() {
        int i10;
        boolean z10 = true;
        if (this.f23585j == null || (i10 = this.f23576g) == -1 || i10 == 0 || i10 == 1) {
            z10 = false;
        }
        return z10;
    }

    @TargetApi(23)
    /* renamed from: U0 */
    public void m18771U0() {
        IMediaPlayer.OnErrorListener onErrorListener;
        IMediaPlayer iMediaPlayer;
        if (this.f23567c == null || this.f23582i == null) {
            return;
        }
        m18772V0(false);
        try {
            ((AudioManager) this.f23533O.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        } catch (Exception e10) {
        }
        try {
            try {
                try {
                    this.f23585j = m18760J0(this.f23536P.m31285w());
                    getContext();
                    this.f23585j.setOnPreparedListener(this.f23523K1);
                    this.f23585j.setOnVideoSizeChangedListener(this.f23520J1);
                    this.f23585j.setOnCompletionListener(this.f23526L1);
                    this.f23585j.setOnErrorListener(this.f23532N1);
                    this.f23585j.setOnInfoListener(this.f23529M1);
                    this.f23585j.setOnBufferingUpdateListener(this.f23535O1);
                    this.f23585j.setOnSeekCompleteListener(this.f23538P1);
                    this.f23585j.setOnTimedTextListener(this.f23541Q1);
                    this.f23612s = 0;
                    String scheme = this.f23567c.getScheme();
                    if (Build.VERSION.SDK_INT >= 23 && this.f23536P.m31246E() && (TextUtils.isEmpty(scheme) || scheme.equalsIgnoreCase(TransferTable.COLUMN_FILE))) {
                        this.f23585j.setDataSource(new C7705a(new File(this.f23567c.toString())));
                    } else {
                        this.f23585j.setDataSource(this.f23533O, this.f23567c, this.f23571e);
                    }
                    m18758H0(this.f23585j, this.f23582i);
                    this.f23585j.setAudioStreamType(3);
                    this.f23585j.setScreenOnWhilePlaying(true);
                    this.f23548T = System.currentTimeMillis();
                    this.f23585j.prepareAsync();
                    this.f23598n0 = this.f23580h0.getResources().getDisplayMetrics().widthPixels;
                    AudioManager audioManager = (AudioManager) this.f23580h0.getSystemService("audio");
                    this.f23586j0 = audioManager;
                    this.f23589k0 = audioManager.getStreamMaxVolume(3);
                    int streamVolume = this.f23586j0.getStreamVolume(3);
                    this.f23563Z0.setMax(this.f23586j0.getStreamMaxVolume(3));
                    this.f23563Z0.setProgress(streamVolume);
                    this.f23595m0 = new GestureDetector(this.f23580h0, new C3863y(this));
                    m18792p1();
                    this.f23631y0 = new StringBuilder();
                    this.f23634z0 = new Formatter(this.f23631y0, Locale.getDefault());
                    this.f23576g = 1;
                } catch (IllegalArgumentException e11) {
                    Log.w(this.f23565b, "Unable to open content: " + this.f23567c, e11);
                    this.f23576g = -1;
                    this.f23579h = -1;
                    onErrorListener = this.f23532N1;
                    iMediaPlayer = this.f23585j;
                    onErrorListener.onError(iMediaPlayer, 1, 0);
                } catch (Exception e12) {
                    Log.w(this.f23565b, "Unable to open content: " + this.f23567c, e12);
                    this.f23576g = -1;
                    this.f23579h = -1;
                    onErrorListener = this.f23532N1;
                    iMediaPlayer = this.f23585j;
                    onErrorListener.onError(iMediaPlayer, 1, 0);
                }
            } catch (IOException e13) {
                Log.w(this.f23565b, "Unable to open content: " + this.f23567c, e13);
                this.f23576g = -1;
                this.f23579h = -1;
                onErrorListener = this.f23532N1;
                iMediaPlayer = this.f23585j;
                onErrorListener.onError(iMediaPlayer, 1, 0);
            }
        } catch (NullPointerException e14) {
            Log.w(this.f23565b, "Unable to open content: " + this.f23567c, e14);
            this.f23576g = -1;
            this.f23579h = -1;
            onErrorListener = this.f23532N1;
            iMediaPlayer = this.f23585j;
            onErrorListener.onError(iMediaPlayer, 1, 0);
        }
    }

    @Override // p324sf.InterfaceC8574m
    /* renamed from: V */
    public void mo16825V(String str) {
    }

    /* renamed from: V0 */
    public void m18772V0(boolean z10) {
        IMediaPlayer iMediaPlayer = this.f23585j;
        if (iMediaPlayer != null) {
            iMediaPlayer.reset();
            this.f23585j.release();
            this.f23585j = null;
            this.f23576g = 0;
            if (z10) {
                this.f23579h = 0;
            }
            ((AudioManager) this.f23533O.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    /* renamed from: W0 */
    public void m18773W0() {
        IMediaPlayer iMediaPlayer = this.f23585j;
        if (iMediaPlayer != null) {
            iMediaPlayer.setDisplay(null);
        }
    }

    /* renamed from: X0 */
    public void m18774X0() {
        Handler handler = this.f23503E;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: Y0 */
    public void m18775Y0(int i10) {
        C7709e.m33684e(this.f23585j, i10);
    }

    /* renamed from: Z0 */
    public void m18776Z0(Activity activity, NSTIJKPlayerEPG nSTIJKPlayerEPG, RadioGroup radioGroup, RadioGroup radioGroup2, RadioGroup radioGroup3, TextView textView, TextView textView2, TextView textView3, TextView textView4, SeekBar seekBar, SeekBar seekBar2, LinearLayout linearLayout, Animation animation, Animation animation2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView5, LinearLayout linearLayout4, Animation animation3, Animation animation4, TextView textView6, RelativeLayout relativeLayout, Animation animation5, LinearLayout linearLayout5, Animation animation6, Animation animation7, RelativeLayout relativeLayout2, Animation animation8, String str, FrameLayout frameLayout) {
        this.f23580h0 = activity;
        this.f23583i0 = nSTIJKPlayerEPG;
        this.f23503E = new Handler();
        this.f23506F = new Handler();
        this.f23543R0 = radioGroup;
        this.f23546S0 = radioGroup2;
        this.f23549T0 = radioGroup3;
        this.f23540Q0 = textView;
        this.f23537P0 = textView2;
        this.f23534O0 = textView3;
        this.f23555V0 = textView4;
        this.f23562Y0 = seekBar;
        this.f23563Z0 = seekBar2;
        this.f23564a1 = linearLayout;
        this.f23566b1 = new Handler();
        this.f23570d1 = new Handler();
        this.f23575f1 = animation;
        this.f23578g1 = animation2;
        this.f23581h1 = imageView;
        this.f23584i1 = imageView2;
        this.f23587j1 = linearLayout2;
        this.f23590k1 = linearLayout3;
        this.f23562Y0.setOnSeekBarChangeListener(this.f23514H1);
        this.f23563Z0.setOnSeekBarChangeListener(this.f23517I1);
        this.f23596m1 = textView5;
        seekBar.setKeyProgressIncrement(1);
        float f10 = this.f23580h0.getWindow().getAttributes().screenBrightness;
        this.f23592l0 = f10;
        if (f10 == -1.0f) {
            this.f23592l0 = this.f23536P != null ? r0.m31277o() : C5251a.f30063r0;
        }
        seekBar.setProgress((int) this.f23592l0);
        this.f23602o1 = linearLayout4;
        this.f23605p1 = animation3;
        this.f23608q1 = animation4;
        this.f23599n1 = textView6;
        this.f23611r1 = relativeLayout;
        this.f23614s1 = animation5;
        this.f23617t1 = linearLayout5;
        this.f23620u1 = animation6;
        this.f23623v1 = animation7;
        this.f23632y1 = relativeLayout2;
        this.f23626w1 = animation8;
        this.f23511G1 = str;
        this.f23558W0 = frameLayout;
        this.f23604p0 = new C3864z(this, activity);
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: a */
    public void mo15996a() {
    }

    /* renamed from: a1 */
    public final void m18777a1(Uri uri, Map<String, String> map, boolean z10, String str) {
        this.f23567c = uri;
        this.f23569d = str;
        this.f23571e = map;
        this.f23621v = 0;
        this.f23512H = z10;
        this.f23509G = this.f23509G;
        m18786j1();
        m18771U0();
        requestLayout();
        invalidate();
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: b */
    public void mo15997b() {
    }

    /* renamed from: b1 */
    public void m18778b1(Uri uri, boolean z10, String str) {
        m18777a1(uri, null, z10, str);
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: c */
    public void mo15998c(String str) {
    }

    /* renamed from: c1 */
    public void m18779c1() {
        if (NSTIJKPlayerEPGActivity.f22476N1 || this.f23564a1.getVisibility() != 8) {
            return;
        }
        this.f23564a1.startAnimation(this.f23575f1);
        this.f23564a1.setVisibility(0);
        if (this.f23587j1.getVisibility() == 8) {
            this.f23587j1.startAnimation(this.f23575f1);
            this.f23587j1.setVisibility(0);
        }
        if (!this.f23511G1.equals("true") && this.f23581h1.getVisibility() == 8) {
            this.f23581h1.startAnimation(this.f23575f1);
            this.f23581h1.setVisibility(8);
        }
        if (this.f23602o1.getVisibility() == 8 && !NSTIJKPlayerEPGActivity.m18243D0()) {
            this.f23602o1.startAnimation(this.f23575f1);
            this.f23602o1.setVisibility(0);
        }
        if (!this.f23511G1.equals("true") && this.f23584i1.getVisibility() == 8) {
            this.f23584i1.startAnimation(this.f23575f1);
            this.f23584i1.setVisibility(8);
        }
        if (this.f23590k1.getVisibility() == 8) {
            this.f23590k1.startAnimation(this.f23575f1);
            this.f23590k1.setVisibility(0);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.f23624w;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.f23627x;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.f23630y;
    }

    /* renamed from: d1 */
    public void m18780d1() {
        if (this.f23564a1.getVisibility() == 8) {
            this.f23617t1.startAnimation(this.f23620u1);
            this.f23617t1.setVisibility(0);
        }
    }

    @SuppressLint({"SetTextI18n", "ResourceType"})
    /* renamed from: e1 */
    public void m18781e1(RadioGroup radioGroup, RadioGroup radioGroup2, RadioGroup radioGroup3, TextView textView, TextView textView2, TextView textView3, TextView textView4, FrameLayout frameLayout) {
        if (this.f23585j == null) {
            return;
        }
        radioGroup.removeAllViews();
        radioGroup2.removeAllViews();
        radioGroup3.removeAllViews();
        try {
            SharedPreferences sharedPreferences = this.f23580h0.getSharedPreferences("pref.using_sub_font_size", 0);
            this.f23525L0 = sharedPreferences;
            textView4.setText(sharedPreferences.getString("pref.using_sub_font_size", C5251a.f30039f0));
            frameLayout.setOnClickListener(new ViewOnClickListenerC3846h(this));
        } catch (Exception e10) {
        }
        Boolean bool = Boolean.FALSE;
        this.f23625w0 = bool;
        this.f23622v0 = bool;
        this.f23619u0 = bool;
        this.f23613s0 = bool;
        this.f23610r0 = bool;
        this.f23616t0 = bool;
        int m33683d = C7709e.m33683d(this.f23585j, 1);
        int m33683d2 = C7709e.m33683d(this.f23585j, 2);
        int m33683d3 = C7709e.m33683d(this.f23585j, 3);
        ITrackInfo[] trackInfo = this.f23585j.getTrackInfo();
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
                        this.f23619u0 = bool2;
                        if (!this.f23610r0.booleanValue()) {
                            this.f23610r0 = bool2;
                            RadioButton radioButton = new RadioButton(this.f23580h0);
                            radioButton.setText("Disable");
                            radioButton.setTextColor(getResources().getColor(2131100158));
                            radioButton.setTextSize(13.0f);
                            radioButton.setId(11111111);
                            radioButton.setButtonTintList(ColorStateList.valueOf(C4290b.m21724c(this.f23533O, 2131100158)));
                            radioButton.setPadding(0, 0, 16, 0);
                            radioButton.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3862x(this, radioButton));
                            if (m33683d == -1) {
                                radioButton.setChecked(true);
                                radioGroup.setOnCheckedChangeListener(null);
                            }
                            radioButton.setTag("2");
                            radioGroup.addView(radioButton);
                        }
                        RadioButton radioButton2 = new RadioButton(this.f23580h0);
                        iTrackInfo.getInfoInline();
                        radioButton2.setText(i10 + ", " + iTrackInfo.getInfoInline());
                        if (i10 == -1) {
                            radioButton2.setId(111);
                        } else {
                            radioButton2.setId(i10);
                        }
                        radioButton2.setTextColor(getResources().getColor(2131100158));
                        radioButton2.setTextSize(13.0f);
                        radioButton2.setButtonTintList(ColorStateList.valueOf(C4290b.m21724c(this.f23533O, 2131100158)));
                        radioButton2.setPadding(0, 0, 16, 0);
                        radioButton2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3862x(this, radioButton2));
                        if (i10 == m33683d) {
                            radioButton2.setChecked(true);
                            radioGroup.setOnCheckedChangeListener(null);
                        }
                        radioButton2.setTag("2");
                        radioGroup.addView(radioButton2);
                        radioGroup.setOnCheckedChangeListener(new C3847i(this, m33683d));
                    } else if (trackType == 2) {
                        Boolean bool3 = Boolean.TRUE;
                        this.f23622v0 = bool3;
                        if (!this.f23613s0.booleanValue()) {
                            this.f23613s0 = bool3;
                            RadioButton radioButton3 = new RadioButton(this.f23580h0);
                            radioButton3.setText("Disable");
                            radioButton3.setTextColor(getResources().getColor(2131100158));
                            radioButton3.setTextSize(13.0f);
                            radioButton3.setButtonTintList(ColorStateList.valueOf(C4290b.m21724c(this.f23533O, 2131100158)));
                            radioButton3.setId(1111111);
                            radioButton3.setPadding(0, 0, 16, 0);
                            radioButton3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3862x(this, radioButton3));
                            if (m33683d2 == -1) {
                                radioButton3.setChecked(true);
                                radioGroup2.setOnCheckedChangeListener(null);
                            }
                            radioButton3.setTag("2");
                            radioGroup2.addView(radioButton3);
                        }
                        RadioButton radioButton4 = new RadioButton(this.f23580h0);
                        radioButton4.setText(i10 + ", " + iTrackInfo.getInfoInline() + ", " + m18759I0(iTrackInfo.getLanguage()));
                        radioButton4.setTextColor(getResources().getColor(2131100158));
                        radioButton4.setTextSize(13.0f);
                        radioButton4.setButtonTintList(ColorStateList.valueOf(C4290b.m21724c(this.f23533O, 2131100158)));
                        if (i10 == -1) {
                            radioButton4.setId(1111);
                        } else {
                            radioButton4.setId(i10);
                        }
                        radioButton4.setPadding(0, 0, 16, 0);
                        radioButton4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3862x(this, radioButton4));
                        if (i10 == m33683d2) {
                            radioButton4.setChecked(true);
                            radioGroup2.setOnCheckedChangeListener(null);
                        }
                        radioButton4.setTag("2");
                        radioGroup2.addView(radioButton4);
                        radioGroup2.setOnCheckedChangeListener(new C3848j(this, m33683d2));
                    } else if (trackType == 3) {
                        Boolean bool4 = Boolean.TRUE;
                        this.f23625w0 = bool4;
                        if (!this.f23616t0.booleanValue()) {
                            this.f23616t0 = bool4;
                            RadioButton radioButton5 = new RadioButton(this.f23580h0);
                            radioButton5.setText("Disable");
                            radioButton5.setTextColor(getResources().getColor(2131100158));
                            radioButton5.setTextSize(13.0f);
                            radioButton5.setButtonTintList(ColorStateList.valueOf(C4290b.m21724c(this.f23533O, 2131100158)));
                            radioButton5.setId(111111);
                            radioButton5.setPadding(0, 0, 16, 0);
                            radioButton5.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3862x(this, radioButton5));
                            if (m33683d3 == -1) {
                                radioButton5.setChecked(true);
                                radioGroup3.setOnCheckedChangeListener(null);
                            }
                            radioButton5.setTag("2");
                            radioGroup3.addView(radioButton5);
                        }
                        RadioButton radioButton6 = new RadioButton(this.f23580h0);
                        radioButton6.setText(i10 + ", " + iTrackInfo.getInfoInline());
                        radioButton6.setTextColor(getResources().getColor(2131100158));
                        radioButton6.setTextSize(13.0f);
                        radioButton6.setButtonTintList(ColorStateList.valueOf(C4290b.m21724c(this.f23533O, 2131100158)));
                        if (i10 == -1) {
                            radioButton6.setId(11111);
                        } else {
                            radioButton6.setId(i10);
                        }
                        radioButton6.setPadding(0, 0, 16, 0);
                        radioButton6.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3862x(this, radioButton6));
                        if (i10 == m33683d3) {
                            radioButton6.setChecked(true);
                            radioGroup3.setOnCheckedChangeListener(null);
                        }
                        radioButton6.setTag("2");
                        radioGroup3.addView(radioButton6);
                        radioGroup3.setOnCheckedChangeListener(new C3850l(this, m33683d3));
                    }
                }
            }
            if (this.f23619u0.booleanValue()) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
            if (this.f23622v0.booleanValue()) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
            if (this.f23625w0.booleanValue()) {
                textView3.setVisibility(8);
                return;
            }
        }
        textView3.setVisibility(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0209, code lost:
    
        if (r0 == (-1)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0232, code lost:
    
        m18775Y0(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x021b, code lost:
    
        m18761K0(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0218, code lost:
    
        if (r0 != (-1)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x022c, code lost:
    
        if (r0 == (-1)) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02b8  */
    /* renamed from: f1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m18782f1(int r11) {
        /*
            Method dump skipped, instructions count: 831
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG.m18782f1(int):void");
    }

    /* renamed from: g1 */
    public void m18783g1() {
        ServiceC6971a.m31982d(null);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f23585j != null) {
            return this.f23612s;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (m18770T0()) {
            return (int) this.f23585j.getCurrentPosition();
        }
        return 0;
    }

    public int getCurrentWindowIndex() {
        return this.f23509G;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (m18770T0()) {
            return (int) this.f23585j.getDuration();
        }
        return -1;
    }

    public Boolean getFullScreenValue() {
        return Boolean.valueOf(this.f23512H);
    }

    public int getNewSeekPosition() {
        return (int) this.f23491A;
    }

    public boolean getPlayerIsPrepared() {
        return this.f23531N0;
    }

    public String getShowOrHideSubtitles() {
        return this.f23577g0;
    }

    public ITrackInfo[] getTrackInfo() {
        IMediaPlayer iMediaPlayer = this.f23585j;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.getTrackInfo();
    }

    /* renamed from: h1 */
    public void m18784h1() {
        Handler handler;
        if (NSTIJKPlayerEPGActivity.f22476N1 || (handler = this.f23566b1) == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    /* renamed from: i1 */
    public void m18785i1() {
        Handler handler = this.f23570d1;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        IMediaPlayer iMediaPlayer;
        return m18770T0() && (iMediaPlayer = this.f23585j) != null && iMediaPlayer.isPlaying();
    }

    /* renamed from: j1 */
    public void m18786j1() {
        IMediaPlayer iMediaPlayer = this.f23585j;
        if (iMediaPlayer != null) {
            iMediaPlayer.stop();
            this.f23585j.release();
            this.f23585j = null;
            this.f23576g = 0;
            this.f23579h = 0;
            ((AudioManager) this.f23533O.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: k1 */
    public final void m18787k1() {
        int i10;
        DialogC0242a.a aVar = new DialogC0242a.a(this.f23505E1);
        aVar.setTitle(getResources().getString(2132018666));
        String string = this.f23525L0.getString("pref.using_sub_font_size", C5251a.f30039f0);
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
        aVar.m863k(new CharSequence[]{"10", "12", "14", "16", "18", "20", "22", "24", "26", "28", "30", "32", "34", "36", "38", "40"}, i10, new DialogInterfaceOnClickListenerC3851m(this));
        try {
            DialogC0242a create = aVar.create();
            this.f23560X0 = create;
            create.setOnDismissListener(new DialogInterfaceOnDismissListenerC3852n(this));
            this.f23560X0.show();
        } catch (Exception e10) {
        }
    }

    /* renamed from: l1 */
    public final void m18788l1(String str) {
        try {
            SharedPreferences sharedPreferences = this.f23580h0.getSharedPreferences("pref.using_sub_font_size", 0);
            this.f23525L0 = sharedPreferences;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            this.f23552U0 = edit;
            if (edit != null) {
                edit.putString("pref.using_sub_font_size", str);
                this.f23552U0.apply();
            }
        } catch (Exception e10) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0104  */
    /* renamed from: m1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int m18789m1() {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG.m18789m1():int");
    }

    /* renamed from: n1 */
    public void m18790n1() {
        RelativeLayout relativeLayout;
        if (NSTIJKPlayerEPGActivity.f22476N1) {
            m18785i1();
            if (this.f23617t1.getVisibility() == 0) {
                m18765O0();
                return;
            } else {
                m18780d1();
                m18757G0(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
                return;
            }
        }
        SeekBar seekBar = this.f23563Z0;
        if (seekBar != null) {
            seekBar.setProgress(this.f23586j0.getStreamVolume(3));
        }
        m18784h1();
        if (this.f23611r1.getVisibility() == 0) {
            this.f23611r1.startAnimation(this.f23614s1);
            relativeLayout = this.f23611r1;
        } else {
            if (this.f23632y1.getVisibility() != 0) {
                if (this.f23564a1.getVisibility() == 0) {
                    m18764N0();
                    return;
                } else {
                    m18779c1();
                    m18756F0(TFTP.DEFAULT_TIMEOUT);
                    return;
                }
            }
            this.f23632y1.startAnimation(this.f23626w1);
            relativeLayout = this.f23632y1;
        }
        relativeLayout.setVisibility(8);
    }

    /* renamed from: o1 */
    public final void m18791o1() {
        if (this.f23603p.m33652a()) {
            this.f23603p.m33655d();
        } else {
            this.f23603p.show();
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10 = (i10 == 4 || i10 == 24 || i10 == 25 || i10 == 164 || i10 == 82 || i10 == 5 || i10 == 6) ? false : true;
        if (m18770T0() && z10 && this.f23603p != null) {
            if (i10 == 79 || i10 == 85) {
                IMediaPlayer iMediaPlayer = this.f23585j;
                if (iMediaPlayer == null || !iMediaPlayer.isPlaying()) {
                    start();
                    this.f23603p.m33655d();
                    return true;
                }
                pause();
                this.f23603p.show();
                return true;
            }
            if (i10 == 126) {
                IMediaPlayer iMediaPlayer2 = this.f23585j;
                if (iMediaPlayer2 == null || iMediaPlayer2.isPlaying()) {
                    return true;
                }
                start();
                this.f23603p.m33655d();
                return true;
            }
            if (i10 == 86 || i10 == 127) {
                IMediaPlayer iMediaPlayer3 = this.f23585j;
                if (iMediaPlayer3 == null || !iMediaPlayer3.isPlaying()) {
                    return true;
                }
                pause();
                this.f23603p.show();
                return true;
            }
            m18791o1();
        }
        return super.onKeyDown(i10, keyEvent);
    }

    /* renamed from: p1 */
    public final void m18792p1() {
        View findViewById = this.f23580h0.findViewById(2131427469);
        this.f23601o0 = findViewById;
        findViewById.setClickable(true);
        this.f23601o0.setOnTouchListener(new ViewOnTouchListenerC3854p(this));
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        IMediaPlayer iMediaPlayer;
        if (m18770T0() && (iMediaPlayer = this.f23585j) != null && iMediaPlayer.isPlaying()) {
            this.f23585j.pause();
            this.f23576g = 4;
        }
        this.f23579h = 4;
    }

    /* renamed from: q1 */
    public final void m18793q1() {
        C3864z m18800b;
        try {
            IMediaPlayer iMediaPlayer = this.f23585j;
            if (iMediaPlayer == null || !iMediaPlayer.isPlaying()) {
                this.f23604p0.m18800b(2131428207).m18799a();
                m18800b = this.f23604p0.m18800b(2131428208);
            } else {
                this.f23604p0.m18800b(2131428208).m18799a();
                m18800b = this.f23604p0.m18800b(2131428207);
            }
            m18800b.m18803e();
        } catch (Exception e10) {
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i10) {
        int i11 = i10;
        if (m18770T0()) {
            this.f23554V = System.currentTimeMillis();
            this.f23585j.seekTo(i10);
            i11 = 0;
        }
        this.f23621v = i11;
    }

    public void setAdjustViewBounds(boolean z10) {
        if (this.f23635z1 == z10) {
            return;
        }
        this.f23635z1 = z10;
        if (z10) {
            setBackground(null);
        } else {
            setBackgroundColor(DefaultRenderer.BACKGROUND_COLOR);
        }
        requestLayout();
    }

    public void setContext(Context context) {
        this.f23505E1 = context;
    }

    public void setCurrentChannelLogo(String str) {
        this.f23499C1 = str;
    }

    public void setCurrentEpgChannelID(String str) {
        this.f23496B1 = str;
    }

    public void setCurrentWindowIndex(int i10) {
        this.f23509G = i10;
    }

    public void setEPGHandler(Handler handler) {
        this.f23502D1 = handler;
    }

    public void setHudView(TableLayout tableLayout) {
    }

    public void setLiveStreamDBHandler(LiveStreamDBHandler liveStreamDBHandler) {
        this.f23508F1 = liveStreamDBHandler;
    }

    public void setMediaController(InterfaceC7706b interfaceC7706b) {
        InterfaceC7706b interfaceC7706b2 = this.f23603p;
        if (interfaceC7706b2 != null) {
            interfaceC7706b2.m33655d();
        }
        this.f23603p = interfaceC7706b;
        m18755E0();
    }

    public void setMovieListener(AbstractC3861w abstractC3861w) {
    }

    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.f23606q = onCompletionListener;
    }

    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        this.f23615t = onErrorListener;
    }

    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.f23618u = onInfoListener;
    }

    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.f23609r = onPreparedListener;
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
                Log.e(this.f23565b, String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i10)));
                return;
            }
            C4044c c4044c = new C4044c(getContext());
            c4043b = c4044c;
            if (this.f23585j != null) {
                c4044c.getSurfaceHolder().mo19700b(this.f23585j);
                c4044c.mo19696c(this.f23585j.getVideoWidth(), this.f23585j.getVideoHeight());
                c4044c.mo19694a(this.f23585j.getVideoSarNum(), this.f23585j.getVideoSarDen());
                c4044c.setAspectRatio(this.f23550T1);
                c4043b = c4044c;
            }
        }
        setRenderView(c4043b);
    }

    public void setRenderView(InterfaceC4042a interfaceC4042a) {
        int i10;
        int i11;
        if (this.f23539Q != null) {
            IMediaPlayer iMediaPlayer = this.f23585j;
            if (iMediaPlayer != null) {
                iMediaPlayer.setDisplay(null);
            }
            View view = this.f23539Q.getView();
            this.f23539Q.mo19695b(this.f23544R1);
            this.f23539Q = null;
            removeView(view);
        }
        if (interfaceC4042a == null) {
            return;
        }
        this.f23539Q = interfaceC4042a;
        SharedPreferences sharedPreferences = this.f23533O.getSharedPreferences("loginPrefs", 0);
        this.f23524L = sharedPreferences;
        int i12 = sharedPreferences.getInt("aspect_ratio", 4);
        this.f23547S1 = i12;
        interfaceC4042a.setAspectRatio(i12);
        int i13 = this.f23588k;
        if (i13 > 0 && (i11 = this.f23591l) > 0) {
            interfaceC4042a.mo19696c(i13, i11);
        }
        int i14 = this.f23542R;
        if (i14 > 0 && (i10 = this.f23545S) > 0) {
            interfaceC4042a.mo19694a(i14, i10);
        }
        View view2 = this.f23539Q.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(view2);
        this.f23539Q.mo19698e(this.f23544R1);
        this.f23539Q.setVideoRotation(this.f23600o);
    }

    public void setShowOrHideSubtitles(String str) {
        this.f23577g0 = str;
    }

    public void setTitle(CharSequence charSequence) {
        this.f23604p0.m18800b(C10105q.f46321V).m18802d(charSequence);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (m18770T0()) {
            this.f23585j.start();
            this.f23576g = 3;
        }
        this.f23579h = 3;
    }
}

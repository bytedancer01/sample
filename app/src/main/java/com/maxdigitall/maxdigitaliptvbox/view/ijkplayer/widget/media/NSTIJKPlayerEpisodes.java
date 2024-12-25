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
import android.os.Looper;
import android.os.Message;
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
import com.amazonaws.services.p045s3.internal.Constants;
import com.maxdigitall.maxdigitaliptvbox.model.EpisodesUsingSinglton;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.callback.GetEpisdoeDetailsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.VodInfoCallback;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.PlayerResumeDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.RecentWatchDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SeriesRecentWatchDatabase;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.PanelAvailableChannelsPojo;
import com.maxdigitall.maxdigitaliptvbox.view.activity.HoneyPlayer;
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
import org.joda.time.DateTimeConstants;
import org.slf4j.Marker;
import p050d0.C4290b;
import p151if.C5251a;
import p151if.C5255e;
import p170jf.C5378j;
import p189kf.C5602m;
import p250of.ServiceC6971a;
import p290qf.C7920a;
import p324sf.InterfaceC8574m;
import p428yg.C10014t;
import pf.C7705a;
import pf.C7707c;
import pf.C7709e;
import pf.InterfaceC7706b;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.player.IjkTimedText;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;
import tv.danmaku.ijk.media.player.misc.ITrackInfo;
import tv.danmaku.ijk.media.player.misc.IjkMediaFormat;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes.class */
public class NSTIJKPlayerEpisodes extends FrameLayout implements MediaController.MediaPlayerControl, InterfaceC8574m, View.OnClickListener {

    /* renamed from: P2 */
    public static final int[] f23669P2 = {0, 1, 2, 3, 4, 5};

    /* renamed from: A */
    public long f23670A;

    /* renamed from: A0 */
    public boolean f23671A0;

    /* renamed from: A1 */
    public RadioGroup f23672A1;

    /* renamed from: A2 */
    public IMediaPlayer.OnPreparedListener f23673A2;

    /* renamed from: B */
    public boolean f23674B;

    /* renamed from: B0 */
    public TextView f23675B0;

    /* renamed from: B1 */
    public SharedPreferences.Editor f23676B1;

    /* renamed from: B2 */
    public IMediaPlayer.OnCompletionListener f23677B2;

    /* renamed from: C */
    public boolean f23678C;

    /* renamed from: C0 */
    public TextView f23679C0;

    /* renamed from: C1 */
    public TextView f23680C1;

    /* renamed from: C2 */
    public final View.OnClickListener f23681C2;

    /* renamed from: D */
    public boolean f23682D;

    /* renamed from: D0 */
    public StringBuilder f23683D0;

    /* renamed from: D1 */
    public FrameLayout f23684D1;

    /* renamed from: D2 */
    public IMediaPlayer.OnInfoListener f23685D2;

    /* renamed from: E */
    public int f23686E;

    /* renamed from: E0 */
    public Formatter f23687E0;

    /* renamed from: E1 */
    public DialogC0242a f23688E1;

    /* renamed from: E2 */
    public IMediaPlayer.OnErrorListener f23689E2;

    /* renamed from: F */
    public Handler f23690F;

    /* renamed from: F0 */
    public SharedPreferences f23691F0;

    /* renamed from: F1 */
    public SeekBar f23692F1;

    /* renamed from: F2 */
    public IMediaPlayer.OnBufferingUpdateListener f23693F2;

    /* renamed from: G */
    public Handler f23694G;

    /* renamed from: G0 */
    public SharedPreferences.Editor f23695G0;

    /* renamed from: G1 */
    public SeekBar f23696G1;

    /* renamed from: G2 */
    public IMediaPlayer.OnSeekCompleteListener f23697G2;

    /* renamed from: H */
    public int f23698H;

    /* renamed from: H0 */
    public RecentWatchDBHandler f23699H0;

    /* renamed from: H1 */
    public LinearLayout f23700H1;

    /* renamed from: H2 */
    public IMediaPlayer.OnTimedTextListener f23701H2;

    /* renamed from: I */
    public boolean f23702I;

    /* renamed from: I0 */
    public LiveStreamDBHandler f23703I0;

    /* renamed from: I1 */
    public Handler f23704I1;

    /* renamed from: I2 */
    public InterfaceC4042a.a f23705I2;

    /* renamed from: J */
    public int f23706J;

    /* renamed from: J0 */
    public PlayerResumeDBHandler f23707J0;

    /* renamed from: J1 */
    public Runnable f23708J1;

    /* renamed from: J2 */
    public int f23709J2;

    /* renamed from: K */
    public int f23710K;

    /* renamed from: K0 */
    public boolean f23711K0;

    /* renamed from: K1 */
    public Handler f23712K1;

    /* renamed from: K2 */
    public int f23713K2;

    /* renamed from: L */
    public boolean f23714L;

    /* renamed from: L0 */
    public int f23715L0;

    /* renamed from: L1 */
    public Runnable f23716L1;

    /* renamed from: L2 */
    public List<Integer> f23717L2;

    /* renamed from: M */
    public SharedPreferences f23718M;

    /* renamed from: M0 */
    public int f23719M0;

    /* renamed from: M1 */
    public Handler f23720M1;

    /* renamed from: M2 */
    public int f23721M2;

    /* renamed from: N */
    public SharedPreferences.Editor f23722N;

    /* renamed from: N0 */
    public long f23723N0;

    /* renamed from: N1 */
    public Handler f23724N1;

    /* renamed from: N2 */
    public int f23725N2;

    /* renamed from: O */
    public SharedPreferences f23726O;

    /* renamed from: O0 */
    public int f23727O0;

    /* renamed from: O1 */
    public Handler f23728O1;

    /* renamed from: O2 */
    public boolean f23729O2;

    /* renamed from: P */
    public Context f23730P;

    /* renamed from: P0 */
    public boolean f23731P0;

    /* renamed from: P1 */
    public Runnable f23732P1;

    /* renamed from: Q */
    public C6783a f23733Q;

    /* renamed from: Q0 */
    public String f23734Q0;

    /* renamed from: Q1 */
    public boolean f23735Q1;

    /* renamed from: R */
    public InterfaceC4042a f23736R;

    /* renamed from: R0 */
    public String f23737R0;

    /* renamed from: R1 */
    public Animation f23738R1;

    /* renamed from: S */
    public int f23739S;

    /* renamed from: S0 */
    public String f23740S0;

    /* renamed from: S1 */
    public Animation f23741S1;

    /* renamed from: T */
    public int f23742T;

    /* renamed from: T0 */
    public ArrayList<LiveStreamsDBModel> f23743T0;

    /* renamed from: T1 */
    public TextView f23744T1;

    /* renamed from: U */
    public C7707c f23745U;

    /* renamed from: U0 */
    public boolean f23746U0;

    /* renamed from: U1 */
    public TextView f23747U1;

    /* renamed from: V */
    public long f23748V;

    /* renamed from: V0 */
    public SharedPreferences f23749V0;

    /* renamed from: V1 */
    public LinearLayout f23750V1;

    /* renamed from: W */
    public long f23751W;

    /* renamed from: W0 */
    public SharedPreferences f23752W0;

    /* renamed from: W1 */
    public LinearLayout f23753W1;

    /* renamed from: X0 */
    public SharedPreferences f23754X0;

    /* renamed from: X1 */
    public int f23755X1;

    /* renamed from: Y0 */
    public SharedPreferences f23756Y0;

    /* renamed from: Y1 */
    public TextView f23757Y1;

    /* renamed from: Z0 */
    public SharedPreferences f23758Z0;

    /* renamed from: Z1 */
    public TextView f23759Z1;

    /* renamed from: a1 */
    public SharedPreferences.Editor f23760a1;

    /* renamed from: a2 */
    public LinearLayout f23761a2;

    /* renamed from: b */
    public String f23762b;

    /* renamed from: b1 */
    public SharedPreferences.Editor f23763b1;

    /* renamed from: b2 */
    public String f23764b2;

    /* renamed from: c */
    public Uri f23765c;

    /* renamed from: c1 */
    public SharedPreferences.Editor f23766c1;

    /* renamed from: c2 */
    public String f23767c2;

    /* renamed from: d */
    public String f23768d;

    /* renamed from: d1 */
    public int f23769d1;

    /* renamed from: d2 */
    public TextView f23770d2;

    /* renamed from: e */
    public Map<String, String> f23771e;

    /* renamed from: e1 */
    public boolean f23772e1;

    /* renamed from: e2 */
    public TextView f23773e2;

    /* renamed from: f */
    public int f23774f;

    /* renamed from: f0 */
    public long f23775f0;

    /* renamed from: f1 */
    public boolean f23776f1;

    /* renamed from: f2 */
    public FrameLayout f23777f2;

    /* renamed from: g */
    public int f23778g;

    /* renamed from: g0 */
    public long f23779g0;

    /* renamed from: g1 */
    public boolean f23780g1;

    /* renamed from: g2 */
    public FrameLayout f23781g2;

    /* renamed from: h */
    public int f23782h;

    /* renamed from: h0 */
    public TextView f23783h0;

    /* renamed from: h1 */
    public boolean f23784h1;

    /* renamed from: h2 */
    public Animation f23785h2;

    /* renamed from: i */
    public InterfaceC4042a.b f23786i;

    /* renamed from: i0 */
    public String f23787i0;

    /* renamed from: i1 */
    public SeriesRecentWatchDatabase f23788i1;

    /* renamed from: i2 */
    public Animation f23789i2;

    /* renamed from: j */
    public IMediaPlayer f23790j;

    /* renamed from: j0 */
    public Activity f23791j0;

    /* renamed from: j1 */
    public boolean f23792j1;

    /* renamed from: j2 */
    public RelativeLayout f23793j2;

    /* renamed from: k */
    public int f23794k;

    /* renamed from: k0 */
    public NSTIJKPlayerEpisodes f23795k0;

    /* renamed from: k1 */
    public C5602m f23796k1;

    /* renamed from: k2 */
    public Animation f23797k2;

    /* renamed from: l */
    public int f23798l;

    /* renamed from: l0 */
    public AudioManager f23799l0;

    /* renamed from: l1 */
    public SharedPreferences f23800l1;

    /* renamed from: l2 */
    public LinearLayout f23801l2;

    /* renamed from: m */
    public int f23802m;

    /* renamed from: m0 */
    public int f23803m0;

    /* renamed from: m1 */
    public C5378j f23804m1;

    /* renamed from: m2 */
    public Animation f23805m2;

    /* renamed from: n */
    public int f23806n;

    /* renamed from: n0 */
    public float f23807n0;

    /* renamed from: n1 */
    public RelativeLayout f23808n1;

    /* renamed from: n2 */
    public Animation f23809n2;

    /* renamed from: o */
    public int f23810o;

    /* renamed from: o0 */
    public GestureDetector f23811o0;

    /* renamed from: o1 */
    public ImageView f23812o1;

    /* renamed from: o2 */
    public SharedPreferences f23813o2;

    /* renamed from: p */
    public InterfaceC7706b f23814p;

    /* renamed from: p0 */
    public int f23815p0;

    /* renamed from: p1 */
    public int f23816p1;

    /* renamed from: p2 */
    public RelativeLayout f23817p2;

    /* renamed from: q */
    public IMediaPlayer.OnCompletionListener f23818q;

    /* renamed from: q0 */
    public View f23819q0;

    /* renamed from: q1 */
    public TextView f23820q1;

    /* renamed from: q2 */
    public boolean f23821q2;

    /* renamed from: r */
    public IMediaPlayer.OnPreparedListener f23822r;

    /* renamed from: r0 */
    public C3884j0 f23823r0;

    /* renamed from: r1 */
    public TextView f23824r1;

    /* renamed from: r2 */
    public boolean f23825r2;

    /* renamed from: s */
    public int f23826s;

    /* renamed from: s0 */
    public Button f23827s0;

    /* renamed from: s1 */
    public TextView f23828s1;

    /* renamed from: s2 */
    public int f23829s2;

    /* renamed from: t */
    public IMediaPlayer.OnErrorListener f23830t;

    /* renamed from: t0 */
    public Boolean f23831t0;

    /* renamed from: t1 */
    public LinearLayout f23832t1;

    /* renamed from: t2 */
    public boolean f23833t2;

    /* renamed from: u */
    public IMediaPlayer.OnInfoListener f23834u;

    /* renamed from: u0 */
    public Boolean f23835u0;

    /* renamed from: u1 */
    public boolean f23836u1;

    /* renamed from: u2 */
    public AbstractC3878g0 f23837u2;

    /* renamed from: v */
    public int f23838v;

    /* renamed from: v0 */
    public Boolean f23839v0;

    /* renamed from: v1 */
    public TextView f23840v1;

    /* renamed from: v2 */
    public final SeekBar.OnSeekBarChangeListener f23841v2;

    /* renamed from: w */
    public boolean f23842w;

    /* renamed from: w0 */
    public Boolean f23843w0;

    /* renamed from: w1 */
    public TextView f23844w1;

    /* renamed from: w2 */
    public final SeekBar.OnSeekBarChangeListener f23845w2;

    /* renamed from: x */
    public boolean f23846x;

    /* renamed from: x0 */
    public Boolean f23847x0;

    /* renamed from: x1 */
    public TextView f23848x1;

    /* renamed from: x2 */
    public final SeekBar.OnSeekBarChangeListener f23849x2;

    /* renamed from: y */
    public boolean f23850y;

    /* renamed from: y0 */
    public Boolean f23851y0;

    /* renamed from: y1 */
    public RadioGroup f23852y1;

    /* renamed from: y2 */
    public Handler f23853y2;

    /* renamed from: z */
    public int f23854z;

    /* renamed from: z0 */
    public SeekBar f23855z0;

    /* renamed from: z1 */
    public RadioGroup f23856z1;

    /* renamed from: z2 */
    public IMediaPlayer.OnVideoSizeChangedListener f23857z2;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$a.class */
    public class ViewOnClickListenerC3865a implements View.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerEpisodes f23858b;

        public ViewOnClickListenerC3865a(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes) {
            this.f23858b = nSTIJKPlayerEpisodes;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f23858b.m18895E1();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$a0.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$a0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$a0.class */
    public class ViewOnTouchListenerC3866a0 implements View.OnTouchListener {

        /* renamed from: b */
        public final NSTIJKPlayerEpisodes f23859b;

        public ViewOnTouchListenerC3866a0(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes) {
            this.f23859b = nSTIJKPlayerEpisodes;
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return motionEvent != null && this.f23859b.f23811o0.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$b.class */
    public class RunnableC3867b implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerEpisodes f23860b;

        public RunnableC3867b(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes) {
            this.f23860b = nSTIJKPlayerEpisodes;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23860b.m18948w1();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$b0.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$b0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$b0.class */
    public class HandlerC3868b0 extends Handler {

        /* renamed from: a */
        public final NSTIJKPlayerEpisodes f23861a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandlerC3868b0(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes, Looper looper) {
            super(looper);
            this.f23861a = nSTIJKPlayerEpisodes;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                this.f23861a.m18908R1();
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f23861a;
                if (nSTIJKPlayerEpisodes.f23780g1 || !nSTIJKPlayerEpisodes.f23674B) {
                    return;
                }
                this.f23861a.f23853y2.sendMessageDelayed(this.f23861a.f23853y2.obtainMessage(1), 300L);
                this.f23861a.m18941p2();
                return;
            }
            if (i10 == 2) {
                this.f23861a.m18944s1(false);
                return;
            }
            if (i10 == 3) {
                if (this.f23861a.f23670A >= 0) {
                    this.f23861a.f23795k0.seekTo((int) this.f23861a.f23670A);
                    this.f23861a.f23670A = -1L;
                    return;
                }
                return;
            }
            if (i10 != 4) {
                return;
            }
            this.f23861a.f23823r0.m18955b(2131427540).m18954a();
            this.f23861a.f23823r0.m18955b(2131427478).m18954a();
            this.f23861a.f23823r0.m18955b(2131427500).m18954a();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$c.class */
    public class RunnableC3869c implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerEpisodes f23862b;

        public RunnableC3869c(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes) {
            this.f23862b = nSTIJKPlayerEpisodes;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23862b.m18947v1();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$c0.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$c0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$c0.class */
    public class RunnableC3870c0 implements Runnable {

        /* renamed from: b */
        public final long f23863b;

        /* renamed from: c */
        public final NSTIJKPlayerEpisodes f23864c;

        public RunnableC3870c0(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes, long j10) {
            this.f23864c = nSTIJKPlayerEpisodes;
            this.f23863b = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            Activity activity;
            StringBuilder sb2;
            Resources resources;
            int i10;
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f23864c;
            nSTIJKPlayerEpisodes.f23706J++;
            nSTIJKPlayerEpisodes.m18945t1();
            if (this.f23864c.f23737R0.equals("dfo") || this.f23864c.f23737R0.equals("devicedata")) {
                activity = this.f23864c.f23791j0;
                sb2 = new StringBuilder();
                resources = this.f23864c.f23791j0.getResources();
                i10 = 2132017383;
            } else {
                activity = this.f23864c.f23791j0;
                sb2 = new StringBuilder();
                resources = this.f23864c.f23791j0.getResources();
                i10 = 2132018322;
            }
            sb2.append(resources.getString(i10));
            sb2.append(" (");
            sb2.append(this.f23864c.f23706J);
            sb2.append("/");
            sb2.append(this.f23864c.f23710K);
            sb2.append(")");
            C5255e.m26241k0(activity, sb2.toString());
            this.f23864c.f23795k0.setProgress(true);
            if (this.f23863b != 0) {
                this.f23864c.f23795k0.setCurrentPositionSeekbar((int) this.f23863b);
            }
            this.f23864c.m18894D1();
            this.f23864c.start();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$d.class */
    public class RunnableC3871d implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerEpisodes f23865b;

        public RunnableC3871d(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes) {
            this.f23865b = nSTIJKPlayerEpisodes;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView;
            CharSequence charSequence;
            if (this.f23865b.f23795k0.getCurrentPosition() + this.f23865b.f23755X1 > 0) {
                this.f23865b.f23795k0.seekTo(this.f23865b.f23795k0.getCurrentPosition() + this.f23865b.f23755X1);
            } else {
                this.f23865b.f23795k0.seekTo(0);
            }
            this.f23865b.f23755X1 = 0;
            this.f23865b.f23781g2.startAnimation(this.f23865b.f23741S1);
            this.f23865b.f23781g2.setVisibility(8);
            if (this.f23865b.f23767c2 == null || !this.f23865b.f23767c2.equals("catch_up")) {
                textView = this.f23865b.f23744T1;
                charSequence = "-10s";
            } else {
                textView = this.f23865b.f23744T1;
                charSequence = "-60s";
            }
            textView.setText(charSequence);
            if (this.f23865b.f23700H1.getVisibility() == 8) {
                this.f23865b.f23744T1.startAnimation(this.f23865b.f23741S1);
                this.f23865b.f23744T1.setVisibility(8);
            }
            this.f23865b.m18928j1(1000);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$d0.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$d0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$d0.class */
    public class RunnableC3872d0 implements Runnable {

        /* renamed from: b */
        public final int f23866b;

        /* renamed from: c */
        public final NSTIJKPlayerEpisodes f23867c;

        public RunnableC3872d0(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes, int i10) {
            this.f23867c = nSTIJKPlayerEpisodes;
            this.f23866b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = this.f23866b;
            if (i10 != 0) {
                this.f23867c.m18938o1(i10);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$e.class */
    public class RunnableC3873e implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerEpisodes f23868b;

        public RunnableC3873e(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes) {
            this.f23868b = nSTIJKPlayerEpisodes;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23868b.f23795k0.seekTo((int) (this.f23868b.f23795k0.getDuration() * ((this.f23868b.f23855z0.getProgress() * 1.0d) / 1000.0d)));
            this.f23868b.f23795k0.start();
            this.f23868b.f23853y2.removeMessages(1);
            this.f23868b.f23799l0.setStreamMute(3, false);
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f23868b;
            nSTIJKPlayerEpisodes.f23780g1 = false;
            nSTIJKPlayerEpisodes.f23853y2.sendEmptyMessageDelayed(1, 1000L);
            this.f23868b.m18928j1(1000);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$e0.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$e0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$e0.class */
    public class ViewOnClickListenerC3874e0 implements View.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerEpisodes f23869b;

        public ViewOnClickListenerC3874e0(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes) {
            this.f23869b = nSTIJKPlayerEpisodes;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f23869b.m18946u1();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$f.class */
    public class RunnableC3875f implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerEpisodes f23870b;

        public RunnableC3875f(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes) {
            this.f23870b = nSTIJKPlayerEpisodes;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView;
            CharSequence charSequence;
            this.f23870b.f23795k0.seekTo(this.f23870b.f23795k0.getCurrentPosition() + this.f23870b.f23755X1);
            this.f23870b.f23755X1 = 0;
            this.f23870b.f23777f2.startAnimation(this.f23870b.f23741S1);
            this.f23870b.f23777f2.setVisibility(8);
            if (this.f23870b.f23767c2 == null || !this.f23870b.f23767c2.equals("catch_up")) {
                textView = this.f23870b.f23747U1;
                charSequence = "+10s";
            } else {
                textView = this.f23870b.f23747U1;
                charSequence = "+60s";
            }
            textView.setText(charSequence);
            if (this.f23870b.f23700H1.getVisibility() == 8) {
                this.f23870b.f23747U1.startAnimation(this.f23870b.f23741S1);
                this.f23870b.f23747U1.setVisibility(8);
            }
            this.f23870b.m18928j1(1000);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$f0.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$f0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$f0.class */
    public class ViewOnClickListenerC3876f0 implements View.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerEpisodes f23871b;

        public ViewOnClickListenerC3876f0(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes) {
            this.f23871b = nSTIJKPlayerEpisodes;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f23871b.m18895E1();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$g.class */
    public class C3877g implements IMediaPlayer.OnVideoSizeChangedListener {

        /* renamed from: a */
        public final NSTIJKPlayerEpisodes f23872a;

        public C3877g(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes) {
            this.f23872a = nSTIJKPlayerEpisodes;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i10, int i11, int i12, int i13) {
            this.f23872a.f23794k = iMediaPlayer.getVideoWidth();
            this.f23872a.f23798l = iMediaPlayer.getVideoHeight();
            this.f23872a.f23739S = iMediaPlayer.getVideoSarNum();
            this.f23872a.f23742T = iMediaPlayer.getVideoSarDen();
            if (this.f23872a.f23794k == 0 || this.f23872a.f23798l == 0) {
                return;
            }
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f23872a;
            InterfaceC4042a interfaceC4042a = nSTIJKPlayerEpisodes.f23736R;
            if (interfaceC4042a != null) {
                interfaceC4042a.mo19696c(nSTIJKPlayerEpisodes.f23794k, this.f23872a.f23798l);
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = this.f23872a;
                nSTIJKPlayerEpisodes2.f23736R.mo19694a(nSTIJKPlayerEpisodes2.f23739S, this.f23872a.f23742T);
            }
            this.f23872a.requestLayout();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$g0.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$g0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$g0.class */
    public static abstract class AbstractC3878g0 {
        /* renamed from: a */
        public abstract void mo15860a();

        /* renamed from: b */
        public abstract void mo15861b();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$h.class */
    public class C3879h implements IMediaPlayer.OnPreparedListener {

        /* renamed from: a */
        public final NSTIJKPlayerEpisodes f23873a;

        public C3879h(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes) {
            this.f23873a = nSTIJKPlayerEpisodes;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            this.f23873a.f23751W = System.currentTimeMillis();
            this.f23873a.f23745U.m33670n(this.f23873a.f23751W - this.f23873a.f23748V);
            this.f23873a.f23778g = 2;
            if (this.f23873a.f23822r != null) {
                this.f23873a.f23822r.onPrepared(this.f23873a.f23790j);
            }
            if (this.f23873a.f23814p != null) {
                this.f23873a.f23814p.setEnabled(true);
            }
            this.f23873a.f23794k = iMediaPlayer.getVideoWidth();
            this.f23873a.f23798l = iMediaPlayer.getVideoHeight();
            int i10 = this.f23873a.f23838v;
            if (i10 != 0) {
                this.f23873a.seekTo(i10);
            }
            if (this.f23873a.f23794k == 0 || this.f23873a.f23798l == 0) {
                if (this.f23873a.f23782h == 3) {
                    this.f23873a.start();
                    return;
                }
                return;
            }
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f23873a;
            InterfaceC4042a interfaceC4042a = nSTIJKPlayerEpisodes.f23736R;
            if (interfaceC4042a != null) {
                interfaceC4042a.mo19696c(nSTIJKPlayerEpisodes.f23794k, this.f23873a.f23798l);
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = this.f23873a;
                nSTIJKPlayerEpisodes2.f23736R.mo19694a(nSTIJKPlayerEpisodes2.f23739S, this.f23873a.f23742T);
                if (!this.f23873a.f23736R.mo19697d() || (this.f23873a.f23802m == this.f23873a.f23794k && this.f23873a.f23806n == this.f23873a.f23798l)) {
                    if (this.f23873a.f23782h == 3) {
                        this.f23873a.start();
                        if (this.f23873a.f23814p != null) {
                            this.f23873a.f23814p.show();
                            return;
                        }
                        return;
                    }
                    if (this.f23873a.isPlaying()) {
                        return;
                    }
                    if ((i10 != 0 || this.f23873a.getCurrentPosition() > 0) && this.f23873a.f23814p != null) {
                        this.f23873a.f23814p.show(0);
                    }
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$h0.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$h0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$h0.class */
    public class ViewOnFocusChangeListenerC3880h0 implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f23874b;

        /* renamed from: c */
        public final NSTIJKPlayerEpisodes f23875c;

        public ViewOnFocusChangeListenerC3880h0(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes, View view) {
            this.f23875c = nSTIJKPlayerEpisodes;
            this.f23874b = view;
        }

        /* renamed from: a */
        public final void m18952a(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f23874b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: b */
        public final void m18953b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f23874b, "scaleY", f10);
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
                View view2 = this.f23874b;
                if (view2 != null && view2.getTag() != null && this.f23874b.getTag().equals("1") && this.f23875c.f23827s0 != null) {
                    this.f23875c.f23827s0.setBackgroundResource(2131230845);
                }
                m18952a(1.0f);
                m18953b(1.0f);
                return;
            }
            View view3 = this.f23874b;
            if (view3 != null && view3.getTag() != null && this.f23874b.getTag().equals("2")) {
                view.setBackground(this.f23875c.getResources().getDrawable(2131231814));
                return;
            }
            if (z10) {
                f10 = 1.12f;
            }
            m18952a(f10);
            m18953b(f10);
            View view4 = this.f23874b;
            if (view4 == null || view4.getTag() == null || !this.f23874b.getTag().equals("1") || this.f23875c.f23827s0 == null) {
                return;
            }
            this.f23875c.f23827s0.setBackgroundResource(2131230828);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$i.class */
    public class C3881i implements IMediaPlayer.OnCompletionListener {

        /* renamed from: a */
        public final NSTIJKPlayerEpisodes f23876a;

        public C3881i(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes) {
            this.f23876a = nSTIJKPlayerEpisodes;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x00ce, code lost:
        
            if (r0.equals("catch_up") == false) goto L27;
         */
        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onCompletion(tv.danmaku.ijk.media.player.IMediaPlayer r4) {
            /*
                Method dump skipped, instructions count: 263
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes.C3881i.onCompletion(tv.danmaku.ijk.media.player.IMediaPlayer):void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$i0.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$i0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$i0.class */
    public class C3882i0 extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: b */
        public boolean f23877b;

        /* renamed from: c */
        public final NSTIJKPlayerEpisodes f23878c;

        public C3882i0(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes) {
            this.f23878c = nSTIJKPlayerEpisodes;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (this.f23878c.f23795k0 == null) {
                return true;
            }
            if (motionEvent.getX() < this.f23878c.f23795k0.getWidth() / 2.0f) {
                this.f23878c.m18902L1();
                return true;
            }
            this.f23878c.m18903M1();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            this.f23877b = true;
            return super.onDown(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            this.f23878c.m18935m2();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$j.class */
    public class ViewOnClickListenerC3883j implements View.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerEpisodes f23879b;

        public ViewOnClickListenerC3883j(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes) {
            this.f23879b = nSTIJKPlayerEpisodes;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getId() == 2131427997 || view.getId() == 2131428371) {
                this.f23879b.m18895E1();
            } else if (view.getId() == 2131427693) {
                this.f23879b.m18946u1();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$j0.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$j0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$j0.class */
    public class C3884j0 {

        /* renamed from: a */
        public final Activity f23880a;

        /* renamed from: b */
        public View f23881b;

        /* renamed from: c */
        public final NSTIJKPlayerEpisodes f23882c;

        public C3884j0(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes, Activity activity) {
            this.f23882c = nSTIJKPlayerEpisodes;
            this.f23880a = activity;
        }

        /* renamed from: a */
        public C3884j0 m18954a() {
            View view = this.f23881b;
            if (view != null) {
                view.setVisibility(8);
            }
            return this;
        }

        /* renamed from: b */
        public C3884j0 m18955b(int i10) {
            this.f23881b = this.f23880a.findViewById(i10);
            return this;
        }

        /* renamed from: c */
        public C3884j0 m18956c() {
            View view = this.f23881b;
            if (view != null) {
                view.requestFocus();
            }
            return this;
        }

        /* renamed from: d */
        public C3884j0 m18957d(CharSequence charSequence) {
            View view = this.f23881b;
            if (view != null && (view instanceof TextView)) {
                ((TextView) view).setText(charSequence);
            }
            return this;
        }

        /* renamed from: e */
        public C3884j0 m18958e() {
            View view = this.f23881b;
            if (view != null) {
                view.setVisibility(0);
            }
            return this;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$k.class */
    public class C3885k implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: b */
        public final NSTIJKPlayerEpisodes f23883b;

        public C3885k(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes) {
            this.f23883b = nSTIJKPlayerEpisodes;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            TextView textView;
            Resources resources;
            int i11;
            this.f23883b.f23807n0 = i10;
            int i12 = (int) ((this.f23883b.f23807n0 / 255.0f) * 100.0f);
            if (i12 < 20) {
                textView = this.f23883b.f23757Y1;
                resources = this.f23883b.getResources();
                i11 = 2131231123;
            } else if (i12 < 30) {
                textView = this.f23883b.f23757Y1;
                resources = this.f23883b.getResources();
                i11 = 2131231124;
            } else if (i12 < 40) {
                textView = this.f23883b.f23757Y1;
                resources = this.f23883b.getResources();
                i11 = 2131231125;
            } else if (i12 < 50) {
                textView = this.f23883b.f23757Y1;
                resources = this.f23883b.getResources();
                i11 = 2131231126;
            } else if (i12 < 60) {
                textView = this.f23883b.f23757Y1;
                resources = this.f23883b.getResources();
                i11 = 2131231127;
            } else if (i12 < 70) {
                textView = this.f23883b.f23757Y1;
                resources = this.f23883b.getResources();
                i11 = 2131231128;
            } else {
                textView = this.f23883b.f23757Y1;
                resources = this.f23883b.getResources();
                i11 = 2131231129;
            }
            textView.setBackground(resources.getDrawable(i11));
            WindowManager.LayoutParams attributes = this.f23883b.f23791j0.getWindow().getAttributes();
            attributes.screenBrightness = this.f23883b.f23807n0 / 255.0f;
            this.f23883b.f23733Q.m31256O((int) this.f23883b.f23807n0);
            this.f23883b.f23791j0.getWindow().setAttributes(attributes);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            this.f23883b.m18922e2();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            this.f23883b.m18922e2();
            this.f23883b.m18928j1(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$l.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$l.class */
    public class C3886l implements IMediaPlayer.OnInfoListener {

        /* renamed from: a */
        public final NSTIJKPlayerEpisodes f23884a;

        public C3886l(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes) {
            this.f23884a = nSTIJKPlayerEpisodes;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i10, int i11) {
            String str;
            String str2;
            if (this.f23884a.f23834u != null) {
                this.f23884a.f23834u.onInfo(iMediaPlayer, i10, i11);
            }
            if (i10 == 3) {
                this.f23884a.m18918b2(2);
                str = this.f23884a.f23762b;
                str2 = "MEDIA_INFO_VIDEO_RENDERING_START:";
            } else if (i10 == 10005) {
                this.f23884a.m18918b2(1);
                str = this.f23884a.f23762b;
                str2 = "MEDIA_INFO_OPEN_INPUT:";
            } else if (i10 == 901) {
                str = this.f23884a.f23762b;
                str2 = "MEDIA_INFO_UNSUPPORTED_SUBTITLE:";
            } else if (i10 == 902) {
                str = this.f23884a.f23762b;
                str2 = "MEDIA_INFO_SUBTITLE_TIMED_OUT:";
            } else {
                if (i10 == 10001) {
                    this.f23884a.f23810o = i11;
                    Log.d(this.f23884a.f23762b, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i11);
                    InterfaceC4042a interfaceC4042a = this.f23884a.f23736R;
                    if (interfaceC4042a == null) {
                        return true;
                    }
                    interfaceC4042a.setVideoRotation(i11);
                    return true;
                }
                if (i10 != 10002) {
                    switch (i10) {
                        case 700:
                            str = this.f23884a.f23762b;
                            str2 = "MEDIA_INFO_VIDEO_TRACK_LAGGING:";
                            break;
                        case IMediaPlayer.MEDIA_INFO_BUFFERING_START /* 701 */:
                            this.f23884a.m18918b2(1);
                            str = this.f23884a.f23762b;
                            str2 = "MEDIA_INFO_BUFFERING_START:";
                            break;
                        case IMediaPlayer.MEDIA_INFO_BUFFERING_END /* 702 */:
                            this.f23884a.m18918b2(6);
                            str = this.f23884a.f23762b;
                            str2 = "MEDIA_INFO_BUFFERING_END:";
                            break;
                        case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                            str = this.f23884a.f23762b;
                            str2 = "MEDIA_INFO_NETWORK_BANDWIDTH: " + i11;
                            break;
                        default:
                            switch (i10) {
                                case 800:
                                    str = this.f23884a.f23762b;
                                    str2 = "MEDIA_INFO_BAD_INTERLEAVING:";
                                    break;
                                case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                    str = this.f23884a.f23762b;
                                    str2 = "MEDIA_INFO_NOT_SEEKABLE:";
                                    break;
                                case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                    str = this.f23884a.f23762b;
                                    str2 = "MEDIA_INFO_METADATA_UPDATE:";
                                    break;
                                default:
                                    return true;
                            }
                    }
                } else {
                    str = this.f23884a.f23762b;
                    str2 = "MEDIA_INFO_AUDIO_RENDERING_START:";
                }
            }
            Log.d(str, str2);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$m.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$m */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$m.class */
    public class C3887m implements IMediaPlayer.OnErrorListener {

        /* renamed from: a */
        public final NSTIJKPlayerEpisodes f23885a;

        public C3887m(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes) {
            this.f23885a = nSTIJKPlayerEpisodes;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i10, int i11) {
            Log.d(this.f23885a.f23762b, "Error: " + i10 + "," + i11);
            this.f23885a.f23778g = -1;
            this.f23885a.f23782h = -1;
            if (this.f23885a.f23814p != null) {
                this.f23885a.f23814p.m33655d();
            }
            this.f23885a.m18918b2(-1);
            if (this.f23885a.f23830t == null) {
                return true;
            }
            this.f23885a.f23830t.onError(this.f23885a.f23790j, i10, i11);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$n.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$n */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$n.class */
    public class C3888n implements IMediaPlayer.OnBufferingUpdateListener {

        /* renamed from: a */
        public final NSTIJKPlayerEpisodes f23886a;

        public C3888n(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes) {
            this.f23886a = nSTIJKPlayerEpisodes;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i10) {
            this.f23886a.f23826s = i10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$o.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$o */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$o.class */
    public class C3889o implements IMediaPlayer.OnSeekCompleteListener {

        /* renamed from: a */
        public final NSTIJKPlayerEpisodes f23887a;

        public C3889o(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes) {
            this.f23887a = nSTIJKPlayerEpisodes;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            this.f23887a.f23779g0 = System.currentTimeMillis();
            this.f23887a.f23745U.m33671o(this.f23887a.f23779g0 - this.f23887a.f23775f0);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$p.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$p */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$p.class */
    public class C3890p implements IMediaPlayer.OnTimedTextListener {

        /* renamed from: a */
        public final NSTIJKPlayerEpisodes f23888a;

        public C3890p(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes) {
            this.f23888a = nSTIJKPlayerEpisodes;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnTimedTextListener
        public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            TextView textView;
            if (ijkTimedText == null) {
                this.f23888a.f23783h0.setVisibility(8);
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
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f23888a;
            nSTIJKPlayerEpisodes.f23800l1 = nSTIJKPlayerEpisodes.f23730P.getSharedPreferences("pref.using_sub_font_size", 0);
            try {
                this.f23888a.f23783h0.setTextSize(2, Float.parseFloat(this.f23888a.f23800l1.getString("pref.using_sub_font_size", C5251a.f30039f0)));
            } catch (Exception e11) {
            }
            if (this.f23888a.getShowOrHideSubtitles().equals("visible")) {
                this.f23888a.f23783h0.setVisibility(0);
            } else {
                this.f23888a.f23783h0.setVisibility(8);
            }
            if (sb2.length() > 0) {
                textView = this.f23888a.f23783h0;
                replace = sb2.toString();
            } else {
                textView = this.f23888a.f23783h0;
            }
            textView.setText(replace);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$q.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$q */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$q.class */
    public class C3891q implements InterfaceC4042a.a {

        /* renamed from: a */
        public final NSTIJKPlayerEpisodes f23889a;

        public C3891q(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes) {
            this.f23889a = nSTIJKPlayerEpisodes;
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.a
        /* renamed from: a */
        public void mo18794a(InterfaceC4042a.b bVar, int i10, int i11, int i12) {
            InterfaceC4042a mo19699a = bVar.mo19699a();
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f23889a;
            if (mo19699a != nSTIJKPlayerEpisodes.f23736R) {
                Log.e(nSTIJKPlayerEpisodes.f23762b, "onSurfaceChanged: unmatched render callback\n");
                return;
            }
            nSTIJKPlayerEpisodes.f23802m = i11;
            this.f23889a.f23806n = i12;
            boolean z10 = this.f23889a.f23782h == 3;
            boolean z11 = true;
            if (this.f23889a.f23736R.mo19697d()) {
                z11 = this.f23889a.f23794k == i11 && this.f23889a.f23798l == i12;
            }
            if (this.f23889a.f23790j != null && z10 && z11) {
                if (this.f23889a.f23838v != 0) {
                    NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = this.f23889a;
                    nSTIJKPlayerEpisodes2.seekTo(nSTIJKPlayerEpisodes2.f23838v);
                }
                this.f23889a.start();
            }
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.a
        /* renamed from: b */
        public void mo18795b(InterfaceC4042a.b bVar) {
            InterfaceC4042a mo19699a = bVar.mo19699a();
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f23889a;
            if (mo19699a != nSTIJKPlayerEpisodes.f23736R) {
                Log.e(nSTIJKPlayerEpisodes.f23762b, "onSurfaceDestroyed: unmatched render callback\n");
            } else {
                nSTIJKPlayerEpisodes.f23786i = null;
                this.f23889a.m18897G1();
            }
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.a
        /* renamed from: c */
        public void mo18796c(InterfaceC4042a.b bVar, int i10, int i11) {
            InterfaceC4042a mo19699a = bVar.mo19699a();
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f23889a;
            if (mo19699a != nSTIJKPlayerEpisodes.f23736R) {
                Log.e(nSTIJKPlayerEpisodes.f23762b, "onSurfaceCreated: unmatched render callback\n");
                return;
            }
            nSTIJKPlayerEpisodes.f23786i = bVar;
            if (this.f23889a.f23790j == null) {
                this.f23889a.m18894D1();
            } else {
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = this.f23889a;
                nSTIJKPlayerEpisodes2.m18932l1(nSTIJKPlayerEpisodes2.f23790j, bVar);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$r.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$r */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$r.class */
    public class RunnableC3892r implements Runnable {

        /* renamed from: b */
        public final LinearLayout f23890b;

        /* renamed from: c */
        public final NSTIJKPlayerEpisodes f23891c;

        public RunnableC3892r(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes, LinearLayout linearLayout) {
            this.f23891c = nSTIJKPlayerEpisodes;
            this.f23890b = linearLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23890b.setVisibility(8);
            if (this.f23891c.f23700H1.getVisibility() != 0 || this.f23891c.f23761a2 == null) {
                return;
            }
            this.f23891c.f23761a2.setVisibility(0);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$s.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$s */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$s.class */
    public class ViewOnClickListenerC3893s implements View.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerEpisodes f23892b;

        public ViewOnClickListenerC3893s(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes) {
            this.f23892b = nSTIJKPlayerEpisodes;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f23892b.m18929j2();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$t.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$t */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$t.class */
    public class C3894t implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a */
        public final int f23893a;

        /* renamed from: b */
        public final NSTIJKPlayerEpisodes f23894b;

        public C3894t(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes, int i10) {
            this.f23894b = nSTIJKPlayerEpisodes;
            this.f23893a = i10;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i10) {
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f23894b;
            nSTIJKPlayerEpisodes.f23766c1 = nSTIJKPlayerEpisodes.f23756Y0.edit();
            if (i10 == 111 || i10 == 11111111) {
                this.f23894b.f23766c1.putInt("currentVideoTrack", -1);
                this.f23894b.m18942q1(this.f23893a);
            } else {
                this.f23894b.f23766c1.putInt("currentVideoTrack", i10);
                this.f23894b.m18904N1(i10);
            }
            this.f23894b.f23766c1.apply();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$u.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$u */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$u.class */
    public class C3895u implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a */
        public final int f23895a;

        /* renamed from: b */
        public final NSTIJKPlayerEpisodes f23896b;

        public C3895u(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes, int i10) {
            this.f23896b = nSTIJKPlayerEpisodes;
            this.f23895a = i10;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i10) {
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f23896b;
            nSTIJKPlayerEpisodes.f23763b1 = nSTIJKPlayerEpisodes.f23754X0.edit();
            if (i10 == 1111 || i10 == 1111111) {
                this.f23896b.f23763b1.putInt("currentAudioTrack", -1);
                this.f23896b.m18942q1(this.f23895a);
            } else {
                this.f23896b.f23763b1.putInt("currentAudioTrack", i10);
                int currentPosition = (int) this.f23896b.f23790j.getCurrentPosition();
                this.f23896b.m18904N1(i10);
                this.f23896b.f23790j.seekTo(Long.parseLong(String.valueOf(currentPosition)));
            }
            this.f23896b.f23763b1.apply();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$v.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$v */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$v.class */
    public class C3896v implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: b */
        public final NSTIJKPlayerEpisodes f23897b;

        public C3896v(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes) {
            this.f23897b = nSTIJKPlayerEpisodes;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            TextView textView;
            Drawable drawable;
            Resources resources;
            if (this.f23897b.f23799l0 != null) {
                try {
                    this.f23897b.f23799l0.setStreamVolume(3, i10, 0);
                    int streamVolume = (int) ((this.f23897b.f23799l0.getStreamVolume(3) / this.f23897b.f23803m0) * 100.0f);
                    if (streamVolume == 0 || streamVolume < 0) {
                        textView = this.f23897b.f23759Z1;
                        drawable = this.f23897b.getResources().getDrawable(2131231157);
                    } else if (streamVolume < 40) {
                        textView = this.f23897b.f23759Z1;
                        drawable = this.f23897b.getResources().getDrawable(2131231154);
                    } else if (streamVolume < 80) {
                        textView = this.f23897b.f23759Z1;
                        drawable = this.f23897b.getResources().getDrawable(2131231155);
                    } else {
                        if (streamVolume < 100) {
                            textView = this.f23897b.f23759Z1;
                            resources = this.f23897b.getResources();
                        } else {
                            textView = this.f23897b.f23759Z1;
                            resources = this.f23897b.getResources();
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
            this.f23897b.m18922e2();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            this.f23897b.m18922e2();
            this.f23897b.m18928j1(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$w.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$w */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$w.class */
    public class C3897w implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a */
        public final int f23898a;

        /* renamed from: b */
        public final NSTIJKPlayerEpisodes f23899b;

        public C3897w(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes, int i10) {
            this.f23899b = nSTIJKPlayerEpisodes;
            this.f23898a = i10;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i10) {
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f23899b;
            nSTIJKPlayerEpisodes.f23760a1 = nSTIJKPlayerEpisodes.f23752W0.edit();
            if (i10 == 11111 || i10 == 111111) {
                TextView textView = this.f23899b.f23783h0;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                this.f23899b.f23760a1.putInt("currentSubtitleTrack", -1);
                this.f23899b.m18942q1(this.f23898a);
            } else {
                TextView textView2 = this.f23899b.f23783h0;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                this.f23899b.f23760a1.putInt("currentSubtitleTrack", i10);
                this.f23899b.m18904N1(i10);
            }
            this.f23899b.f23760a1.apply();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$x.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$x */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$x.class */
    public class DialogInterfaceOnClickListenerC3898x implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerEpisodes f23900b;

        public DialogInterfaceOnClickListenerC3898x(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes) {
            this.f23900b = nSTIJKPlayerEpisodes;
        }

        @Override // android.content.DialogInterface.OnClickListener
        @SuppressLint({"SetTextI18n"})
        public void onClick(DialogInterface dialogInterface, int i10) {
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes;
            String str;
            switch (i10) {
                case 0:
                    nSTIJKPlayerEpisodes = this.f23900b;
                    str = "10";
                    break;
                case 1:
                    nSTIJKPlayerEpisodes = this.f23900b;
                    str = "12";
                    break;
                case 2:
                    nSTIJKPlayerEpisodes = this.f23900b;
                    str = "14";
                    break;
                case 3:
                    nSTIJKPlayerEpisodes = this.f23900b;
                    str = "16";
                    break;
                case 4:
                    nSTIJKPlayerEpisodes = this.f23900b;
                    str = "18";
                    break;
                case 5:
                    nSTIJKPlayerEpisodes = this.f23900b;
                    str = "20";
                    break;
                case 6:
                    nSTIJKPlayerEpisodes = this.f23900b;
                    str = "22";
                    break;
                case 7:
                    nSTIJKPlayerEpisodes = this.f23900b;
                    str = "24";
                    break;
                case 8:
                    nSTIJKPlayerEpisodes = this.f23900b;
                    str = "26";
                    break;
                case 9:
                    nSTIJKPlayerEpisodes = this.f23900b;
                    str = "28";
                    break;
                case 10:
                    nSTIJKPlayerEpisodes = this.f23900b;
                    str = "30";
                    break;
                case 11:
                    nSTIJKPlayerEpisodes = this.f23900b;
                    str = "32";
                    break;
                case 12:
                    nSTIJKPlayerEpisodes = this.f23900b;
                    str = "34";
                    break;
                case 13:
                    nSTIJKPlayerEpisodes = this.f23900b;
                    str = "36";
                    break;
                case 14:
                    nSTIJKPlayerEpisodes = this.f23900b;
                    str = "38";
                    break;
                case 15:
                    nSTIJKPlayerEpisodes = this.f23900b;
                    str = "40";
                    break;
                default:
                    return;
            }
            nSTIJKPlayerEpisodes.m18931k2(str);
            this.f23900b.f23680C1.setText(str);
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$y.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$y */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$y.class */
    public class DialogInterfaceOnDismissListenerC3899y implements DialogInterface.OnDismissListener {

        /* renamed from: b */
        public final NSTIJKPlayerEpisodes f23901b;

        public DialogInterfaceOnDismissListenerC3899y(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes) {
            this.f23901b = nSTIJKPlayerEpisodes;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$z.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes$z */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/NSTIJKPlayerEpisodes$z.class */
    public class C3900z implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: b */
        public final NSTIJKPlayerEpisodes f23902b;

        public C3900z(NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes) {
            this.f23902b = nSTIJKPlayerEpisodes;
        }

        /* renamed from: a */
        public String m18959a(long j10) {
            int i10 = (int) (j10 / 1000);
            int i11 = i10 % 60;
            int i12 = (i10 / 60) % 60;
            int i13 = i10 / 3600;
            return i13 > 0 ? String.format("%02d:%02d:%02d", Integer.valueOf(i13), Integer.valueOf(i12), Integer.valueOf(i11)) : String.format("%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i11));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (z10 && this.f23902b.f23790j != null) {
                this.f23902b.f23823r0.m18955b(2131427519).m18954a();
                this.f23902b.f23670A = (int) (r0.f23795k0.getDuration() * ((i10 * 1.0d) / 1000.0d));
                m18959a(this.f23902b.f23670A);
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f23902b;
                nSTIJKPlayerEpisodes.f23780g1 = true;
                nSTIJKPlayerEpisodes.f23853y2.removeMessages(1);
                if (this.f23902b.f23795k0.isPlaying()) {
                    this.f23902b.f23795k0.pause();
                }
                this.f23902b.m18922e2();
                TextView textView = this.f23902b.f23675B0;
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = this.f23902b;
                textView.setText(nSTIJKPlayerEpisodes2.m18927i2((int) nSTIJKPlayerEpisodes2.f23670A));
                TextView textView2 = this.f23902b.f23679C0;
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes3 = this.f23902b;
                textView2.setText(nSTIJKPlayerEpisodes3.m18927i2(nSTIJKPlayerEpisodes3.f23795k0.getDuration()));
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f23902b;
            nSTIJKPlayerEpisodes.f23780g1 = true;
            nSTIJKPlayerEpisodes.f23853y2.removeMessages(1);
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = this.f23902b;
            if (nSTIJKPlayerEpisodes2.f23784h1) {
                nSTIJKPlayerEpisodes2.f23799l0.setStreamMute(3, true);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            if (this.f23902b.f23790j == null) {
                return;
            }
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f23902b;
            if (!nSTIJKPlayerEpisodes.f23784h1) {
                nSTIJKPlayerEpisodes.f23795k0.seekTo((int) (this.f23902b.f23795k0.getDuration() * ((seekBar.getProgress() * 1.0d) / 1000.0d)));
            }
            this.f23902b.f23795k0.start();
            this.f23902b.m18922e2();
            this.f23902b.m18928j1(0);
            this.f23902b.f23853y2.removeMessages(1);
            this.f23902b.f23799l0.setStreamMute(3, false);
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = this.f23902b;
            nSTIJKPlayerEpisodes2.f23780g1 = false;
            nSTIJKPlayerEpisodes2.f23853y2.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    public NSTIJKPlayerEpisodes(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23762b = "NSTIJKPlayerEpisodes";
        this.f23774f = 0;
        this.f23778g = 0;
        this.f23782h = 0;
        this.f23786i = null;
        this.f23790j = null;
        this.f23842w = true;
        this.f23846x = true;
        this.f23850y = true;
        this.f23854z = -1;
        this.f23670A = -1L;
        this.f23678C = true;
        this.f23682D = false;
        this.f23686E = 7000;
        this.f23698H = 0;
        this.f23706J = 0;
        this.f23710K = 5;
        this.f23714L = false;
        this.f23748V = 0L;
        this.f23751W = 0L;
        this.f23775f0 = 0L;
        this.f23779g0 = 0L;
        this.f23787i0 = "visible";
        this.f23807n0 = -1.0f;
        Boolean bool = Boolean.FALSE;
        this.f23831t0 = bool;
        this.f23835u0 = bool;
        this.f23839v0 = bool;
        this.f23843w0 = bool;
        this.f23847x0 = bool;
        this.f23851y0 = bool;
        this.f23671A0 = false;
        this.f23711K0 = false;
        this.f23731P0 = false;
        this.f23746U0 = false;
        this.f23772e1 = false;
        this.f23776f1 = false;
        this.f23792j1 = false;
        this.f23816p1 = 0;
        this.f23836u1 = false;
        this.f23735Q1 = false;
        this.f23755X1 = 0;
        this.f23825r2 = false;
        this.f23829s2 = 5;
        this.f23833t2 = false;
        this.f23841v2 = new C3885k(this);
        this.f23845w2 = new C3896v(this);
        this.f23849x2 = new C3900z(this);
        this.f23853y2 = new HandlerC3868b0(this, Looper.getMainLooper());
        this.f23857z2 = new C3877g(this);
        this.f23673A2 = new C3879h(this);
        this.f23677B2 = new C3881i(this);
        this.f23681C2 = new ViewOnClickListenerC3883j(this);
        this.f23685D2 = new C3886l(this);
        this.f23689E2 = new C3887m(this);
        this.f23693F2 = new C3888n(this);
        this.f23697G2 = new C3889o(this);
        this.f23701H2 = new C3890p(this);
        this.f23705I2 = new C3891q(this);
        this.f23709J2 = 4;
        this.f23713K2 = f23669P2[0];
        this.f23717L2 = new ArrayList();
        this.f23721M2 = 0;
        this.f23725N2 = 0;
        this.f23729O2 = false;
        m18891A1(context);
    }

    /* renamed from: A1 */
    public final void m18891A1(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f23730P = applicationContext;
        this.f23733Q = new C6783a(applicationContext);
        this.f23804m1 = new C5378j(this, this.f23730P);
        m18950y1();
        m18951z1();
        this.f23794k = 0;
        this.f23798l = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f23778g = 0;
        this.f23782h = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences("pref.using_sub_font_size", 0);
        this.f23800l1 = sharedPreferences;
        String string = sharedPreferences.getString("pref.using_sub_font_size", C5251a.f30039f0);
        TextView textView = new TextView(context);
        this.f23783h0 = textView;
        try {
            textView.setTextSize(2, Float.parseFloat(string));
        } catch (Exception e10) {
        }
        this.f23783h0.setTextColor(context.getResources().getColor(2131100158));
        this.f23783h0.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams.setMargins(0, 0, 0, 40);
        addView(this.f23783h0, layoutParams);
    }

    /* renamed from: B1 */
    public boolean m18892B1() {
        return this.f23729O2;
    }

    /* renamed from: C1 */
    public final boolean m18893C1() {
        int i10;
        boolean z10 = true;
        if (this.f23790j == null || (i10 = this.f23778g) == -1 || i10 == 0 || i10 == 1) {
            z10 = false;
        }
        return z10;
    }

    @TargetApi(23)
    /* renamed from: D1 */
    public void m18894D1() {
        IMediaPlayer.OnErrorListener onErrorListener;
        IMediaPlayer iMediaPlayer;
        if (this.f23765c == null || this.f23786i == null) {
            return;
        }
        m18896F1(false);
        try {
            ((AudioManager) this.f23730P.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        } catch (Exception e10) {
        }
        try {
            try {
                try {
                    this.f23790j = m18940p1(this.f23733Q.m31285w());
                    getContext();
                    this.f23790j.setOnPreparedListener(this.f23673A2);
                    this.f23790j.setOnVideoSizeChangedListener(this.f23857z2);
                    this.f23790j.setOnCompletionListener(this.f23677B2);
                    this.f23790j.setOnErrorListener(this.f23689E2);
                    this.f23790j.setOnInfoListener(this.f23685D2);
                    this.f23790j.setOnBufferingUpdateListener(this.f23693F2);
                    this.f23790j.setOnSeekCompleteListener(this.f23697G2);
                    this.f23790j.setOnTimedTextListener(this.f23701H2);
                    this.f23826s = 0;
                    String scheme = this.f23765c.getScheme();
                    if (Build.VERSION.SDK_INT >= 23 && this.f23733Q.m31246E() && (TextUtils.isEmpty(scheme) || scheme.equalsIgnoreCase(TransferTable.COLUMN_FILE))) {
                        this.f23790j.setDataSource(new C7705a(new File(this.f23765c.toString())));
                    } else {
                        this.f23790j.setDataSource(this.f23730P, this.f23765c, this.f23771e);
                    }
                    m18932l1(this.f23790j, this.f23786i);
                    this.f23790j.setAudioStreamType(3);
                    this.f23790j.setScreenOnWhilePlaying(true);
                    this.f23748V = System.currentTimeMillis();
                    this.f23790j.prepareAsync();
                    this.f23815p0 = this.f23791j0.getResources().getDisplayMetrics().widthPixels;
                    AudioManager audioManager = (AudioManager) this.f23791j0.getSystemService("audio");
                    this.f23799l0 = audioManager;
                    this.f23803m0 = audioManager.getStreamMaxVolume(3);
                    int streamVolume = this.f23799l0.getStreamVolume(3);
                    this.f23696G1.setMax(this.f23799l0.getStreamMaxVolume(3));
                    this.f23696G1.setProgress(streamVolume);
                    this.f23811o0 = new GestureDetector(this.f23791j0, new C3882i0(this));
                    this.f23735Q1 = false;
                    m18939o2();
                    SeekBar seekBar = this.f23855z0;
                    if (seekBar != null) {
                        seekBar.setMax(1000);
                        this.f23855z0.setKeyProgressIncrement(5);
                        this.f23855z0.setOnSeekBarChangeListener(this.f23849x2);
                    }
                    this.f23683D0 = new StringBuilder();
                    this.f23687E0 = new Formatter(this.f23683D0, Locale.getDefault());
                    C7707c c7707c = this.f23745U;
                    if (c7707c != null) {
                        c7707c.m33668l(this.f23790j);
                    }
                    this.f23778g = 1;
                } catch (IllegalArgumentException e11) {
                    Log.w(this.f23762b, "Unable to open content: " + this.f23765c, e11);
                    this.f23778g = -1;
                    this.f23782h = -1;
                    onErrorListener = this.f23689E2;
                    iMediaPlayer = this.f23790j;
                    onErrorListener.onError(iMediaPlayer, 1, 0);
                } catch (NullPointerException e12) {
                    Log.w(this.f23762b, "Unable to open content: " + this.f23765c, e12);
                    this.f23778g = -1;
                    this.f23782h = -1;
                    onErrorListener = this.f23689E2;
                    iMediaPlayer = this.f23790j;
                    onErrorListener.onError(iMediaPlayer, 1, 0);
                }
            } catch (Exception e13) {
                Log.w(this.f23762b, "Unable to open content: " + this.f23765c, e13);
                this.f23778g = -1;
                this.f23782h = -1;
                onErrorListener = this.f23689E2;
                iMediaPlayer = this.f23790j;
                onErrorListener.onError(iMediaPlayer, 1, 0);
            }
        } catch (IOException e14) {
            Log.w(this.f23762b, "Unable to open content: " + this.f23765c, e14);
            this.f23778g = -1;
            this.f23782h = -1;
            onErrorListener = this.f23689E2;
            iMediaPlayer = this.f23790j;
            onErrorListener.onError(iMediaPlayer, 1, 0);
        }
    }

    /* renamed from: E1 */
    public final void m18895E1() {
        try {
            m18946u1();
            LinearLayout linearLayout = (LinearLayout) this.f23791j0.findViewById(2131428447);
            if (linearLayout != null) {
                linearLayout.performClick();
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: F1 */
    public void m18896F1(boolean z10) {
        try {
            m18921d2();
            IMediaPlayer iMediaPlayer = this.f23790j;
            if (iMediaPlayer != null) {
                iMediaPlayer.reset();
                this.f23790j.release();
                this.f23790j = null;
                this.f23778g = 0;
                if (z10) {
                    this.f23782h = 0;
                }
                ((AudioManager) this.f23730P.getSystemService("audio")).abandonAudioFocus(null);
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: G1 */
    public void m18897G1() {
        IMediaPlayer iMediaPlayer = this.f23790j;
        if (iMediaPlayer != null) {
            iMediaPlayer.setDisplay(null);
        }
    }

    /* renamed from: H1 */
    public void m18898H1(boolean z10) {
        this.f23772e1 = z10;
    }

    /* renamed from: I1 */
    public int m18899I1() {
        InterfaceC4042a interfaceC4042a = this.f23736R;
        if (interfaceC4042a == null || interfaceC4042a.getView() == null || this.f23736R.getView().getHeight() == 0) {
            return 0;
        }
        return this.f23736R.getView().getHeight();
    }

    /* renamed from: J1 */
    public int m18900J1() {
        InterfaceC4042a interfaceC4042a = this.f23736R;
        if (interfaceC4042a == null || interfaceC4042a.getView() == null || this.f23736R.getView().getWidth() == 0) {
            return 0;
        }
        return this.f23736R.getView().getWidth();
    }

    @Override // p324sf.InterfaceC8574m
    /* renamed from: K */
    public void mo16817K(VodInfoCallback vodInfoCallback) {
    }

    /* renamed from: K1 */
    public void m18901K1(int i10) {
        if (this.f23790j == null) {
            return;
        }
        this.f23670A = (int) (this.f23795k0.getDuration() * ((i10 * 1.0d) / 1000.0d));
        this.f23780g1 = true;
        this.f23853y2.removeMessages(1);
        if (this.f23795k0.isPlaying()) {
            this.f23795k0.pause();
        }
        m18922e2();
        this.f23675B0.setText(m18927i2((int) this.f23670A));
        this.f23679C0.setText(m18927i2(this.f23795k0.getDuration()));
        Handler handler = this.f23724N1;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f23724N1.postDelayed(new RunnableC3873e(this), 1000L);
        }
    }

    /* renamed from: L1 */
    public final void m18902L1() {
        TextView textView;
        StringBuilder sb2;
        m18922e2();
        if (HoneyPlayer.f17266m1 || m18936n1() || this.f23795k0 == null || this.f23777f2.getVisibility() != 8) {
            return;
        }
        this.f23720M1.removeCallbacksAndMessages(null);
        String str = this.f23764b2;
        if (str != null && !str.equals("")) {
            this.f23755X1 -= Constants.MAXIMUM_UPLOAD_PARTS;
        }
        String str2 = this.f23767c2;
        this.f23755X1 = (str2 == null || !str2.equals("catch_up")) ? this.f23755X1 - Constants.MAXIMUM_UPLOAD_PARTS : this.f23755X1 - DateTimeConstants.MILLIS_PER_MINUTE;
        if (this.f23755X1 > 0) {
            textView = this.f23773e2;
            sb2 = new StringBuilder();
            sb2.append(Marker.ANY_NON_NULL_MARKER);
        } else {
            textView = this.f23773e2;
            sb2 = new StringBuilder();
        }
        sb2.append(this.f23755X1 / 1000);
        sb2.append("s");
        textView.setText(sb2.toString());
        this.f23744T1.setText("");
        this.f23744T1.startAnimation(this.f23789i2);
        this.f23744T1.setVisibility(0);
        if (this.f23781g2.getVisibility() == 8) {
            this.f23781g2.startAnimation(this.f23785h2);
            this.f23781g2.setVisibility(0);
        } else {
            this.f23781g2.startAnimation(this.f23789i2);
        }
        this.f23720M1.postDelayed(new RunnableC3871d(this), 1000L);
    }

    /* renamed from: M1 */
    public void m18903M1() {
        TextView textView;
        StringBuilder sb2;
        m18922e2();
        if (HoneyPlayer.f17266m1 || m18936n1() || this.f23795k0 == null || this.f23781g2.getVisibility() != 8) {
            return;
        }
        this.f23720M1.removeCallbacksAndMessages(null);
        String str = this.f23764b2;
        if (str != null && !str.equals("")) {
            this.f23755X1 += Constants.MAXIMUM_UPLOAD_PARTS;
        }
        String str2 = this.f23767c2;
        if (str2 == null || !str2.equals("catch_up")) {
            this.f23755X1 += Constants.MAXIMUM_UPLOAD_PARTS;
        } else {
            this.f23755X1 += DateTimeConstants.MILLIS_PER_MINUTE;
        }
        if (this.f23755X1 > 0) {
            textView = this.f23770d2;
            sb2 = new StringBuilder();
            sb2.append(Marker.ANY_NON_NULL_MARKER);
        } else {
            textView = this.f23770d2;
            sb2 = new StringBuilder();
        }
        sb2.append(this.f23755X1 / 1000);
        sb2.append("s");
        textView.setText(sb2.toString());
        this.f23747U1.setText("");
        this.f23747U1.startAnimation(this.f23789i2);
        this.f23747U1.setVisibility(0);
        if (this.f23777f2.getVisibility() == 8) {
            this.f23777f2.startAnimation(this.f23785h2);
            this.f23777f2.setVisibility(0);
        } else {
            this.f23777f2.startAnimation(this.f23789i2);
        }
        this.f23720M1.postDelayed(new RunnableC3875f(this), 1000L);
    }

    /* renamed from: N1 */
    public void m18904N1(int i10) {
        C7709e.m33684e(this.f23790j, i10);
    }

    /* renamed from: O1 */
    public void m18905O1(Activity activity, NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes, SeekBar seekBar, TextView textView, TextView textView2, RadioGroup radioGroup, RadioGroup radioGroup2, RadioGroup radioGroup3, TextView textView3, TextView textView4, TextView textView5, TextView textView6, SeekBar seekBar2, SeekBar seekBar3, LinearLayout linearLayout, Animation animation, Animation animation2, TextView textView7, TextView textView8, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView9, LinearLayout linearLayout4, String str, String str2, TextView textView10, FrameLayout frameLayout, Animation animation3, Animation animation4, TextView textView11, FrameLayout frameLayout2, TextView textView12, RelativeLayout relativeLayout, Animation animation5, LinearLayout linearLayout5, Animation animation6, Animation animation7, RelativeLayout relativeLayout2, ImageView imageView, TextView textView13, RelativeLayout relativeLayout3, TextView textView14, TextView textView15, LinearLayout linearLayout6, FrameLayout frameLayout3) {
        this.f23791j0 = activity;
        this.f23795k0 = nSTIJKPlayerEpisodes;
        this.f23690F = new Handler();
        this.f23855z0 = seekBar;
        this.f23675B0 = textView;
        this.f23679C0 = textView2;
        this.f23694G = new Handler();
        this.f23699H0 = new RecentWatchDBHandler(activity);
        this.f23703I0 = new LiveStreamDBHandler(activity);
        this.f23852y1 = radioGroup;
        this.f23856z1 = radioGroup2;
        this.f23672A1 = radioGroup3;
        this.f23848x1 = textView3;
        this.f23844w1 = textView4;
        this.f23840v1 = textView5;
        this.f23680C1 = textView6;
        this.f23692F1 = seekBar2;
        this.f23696G1 = seekBar3;
        this.f23700H1 = linearLayout;
        this.f23704I1 = new Handler();
        this.f23712K1 = new Handler();
        this.f23720M1 = new Handler();
        this.f23728O1 = new Handler();
        this.f23724N1 = new Handler();
        this.f23738R1 = animation;
        this.f23741S1 = animation2;
        this.f23744T1 = textView7;
        textView7.setOnClickListener(this);
        this.f23747U1 = textView8;
        textView8.setOnClickListener(this);
        this.f23750V1 = linearLayout2;
        this.f23753W1 = linearLayout3;
        this.f23692F1.setOnSeekBarChangeListener(this.f23841v2);
        this.f23696G1.setOnSeekBarChangeListener(this.f23845w2);
        this.f23757Y1 = textView9;
        seekBar2.setKeyProgressIncrement(1);
        float f10 = this.f23791j0.getWindow().getAttributes().screenBrightness;
        this.f23807n0 = f10;
        if (f10 == -1.0f) {
            this.f23807n0 = this.f23733Q != null ? r0.m31277o() : C5251a.f30063r0;
        }
        seekBar2.setProgress((int) this.f23807n0);
        this.f23761a2 = linearLayout4;
        this.f23764b2 = str;
        this.f23767c2 = str2;
        this.f23770d2 = textView10;
        this.f23773e2 = textView11;
        this.f23777f2 = frameLayout;
        this.f23781g2 = frameLayout2;
        this.f23785h2 = animation3;
        this.f23789i2 = animation4;
        this.f23759Z1 = textView12;
        this.f23793j2 = relativeLayout;
        this.f23797k2 = animation5;
        this.f23801l2 = linearLayout5;
        this.f23805m2 = animation6;
        this.f23809n2 = animation7;
        this.f23808n1 = relativeLayout2;
        this.f23812o1 = imageView;
        this.f23820q1 = textView13;
        this.f23817p2 = relativeLayout3;
        this.f23824r1 = textView14;
        this.f23828s1 = textView15;
        this.f23832t1 = linearLayout6;
        this.f23823r0 = new C3884j0(this, activity);
        this.f23684D1 = frameLayout3;
    }

    /* renamed from: P1 */
    public void m18906P1(Context context, ArrayList<LiveStreamsDBModel> arrayList, int i10) {
        String m14805L = arrayList.get(i10).m14805L();
        String name = arrayList.get(i10).getName();
        String m14812S = arrayList.get(i10).m14812S();
        String m14811R = arrayList.get(i10).m14811R();
        String m14810Q = arrayList.get(i10).m14810Q();
        String m14798E = arrayList.get(i10).m14798E();
        String m14823d = arrayList.get(i10).m14823d();
        String m14827g = arrayList.get(i10).m14827g();
        String m14796A = arrayList.get(i10).m14796A();
        arrayList.get(i10).m14813T();
        String m14797D = arrayList.get(i10).m14797D();
        String m14814U = arrayList.get(i10).m14814U();
        String m14815V = arrayList.get(i10).m14815V();
        String m14830i = arrayList.get(i10).m14830i();
        String m14809P = arrayList.get(i10).m14809P();
        String m14802I = arrayList.get(i10).m14802I();
        String m14846x = arrayList.get(i10).m14846x();
        String m14808O = arrayList.get(i10).m14808O();
        String m14807N = arrayList.get(i10).m14807N();
        PanelAvailableChannelsPojo panelAvailableChannelsPojo = new PanelAvailableChannelsPojo();
        panelAvailableChannelsPojo.m15428H(Integer.valueOf(m14805L));
        panelAvailableChannelsPojo.m15427G(name);
        panelAvailableChannelsPojo.m15434N(m14812S);
        panelAvailableChannelsPojo.m15433M(m14811R);
        panelAvailableChannelsPojo.m15432L(m14810Q);
        panelAvailableChannelsPojo.m15423C(m14798E);
        panelAvailableChannelsPojo.m15461w(m14823d);
        panelAvailableChannelsPojo.m15462x(m14827g);
        panelAvailableChannelsPojo.m15421A(m14796A);
        panelAvailableChannelsPojo.m15435O(0);
        panelAvailableChannelsPojo.m15422B(m14797D);
        panelAvailableChannelsPojo.m15436P(m14814U);
        panelAvailableChannelsPojo.m15437Q(m14815V);
        panelAvailableChannelsPojo.m15463y(m14830i);
        panelAvailableChannelsPojo.m15431K(m14809P);
        panelAvailableChannelsPojo.m15424D(m14802I);
        panelAvailableChannelsPojo.m15464z(m14846x);
        panelAvailableChannelsPojo.m15438R(SharepreferenceDBHandler.m15337A(context));
        panelAvailableChannelsPojo.m15426F(0L);
        panelAvailableChannelsPojo.m15425E(0L);
        panelAvailableChannelsPojo.m15430J(m14808O);
        panelAvailableChannelsPojo.m15429I(m14807N);
        this.f23699H0.m15307f(panelAvailableChannelsPojo);
    }

    /* renamed from: Q1 */
    public void m18907Q1() {
        int m18925h2;
        Context context = getContext();
        if (C7920a.m34301l() == null || (m18925h2 = m18925h2(C7920a.m34301l().m34311o(), SharepreferenceDBHandler.m15337A(context))) > 0 || m18925h2 != 0 || this.f23737R0.equals("dfo") || this.f23737R0.equals("devicedata")) {
            return;
        }
        m18909S1(context, C7920a.m34301l().m34306c(), C7920a.m34301l().m34307j());
    }

    /* renamed from: R1 */
    public final int m18908R1() {
        if (this.f23780g1) {
            return 0;
        }
        if (this.f23772e1) {
            m18944s1(true);
            this.f23772e1 = false;
            return 0;
        }
        int currentPosition = this.f23795k0.getCurrentPosition();
        int duration = this.f23795k0.getDuration();
        SeekBar seekBar = this.f23855z0;
        if (seekBar != null) {
            if (duration > 0) {
                seekBar.setProgress((int) ((currentPosition * 1000) / duration));
            }
            this.f23855z0.setSecondaryProgress(this.f23795k0.getBufferPercentage() * 10);
        }
        try {
            if (duration == 0) {
                this.f23675B0.setText("Live");
                this.f23679C0.setText("");
            } else {
                this.f23675B0.setText(m18927i2(currentPosition));
                this.f23679C0.setText(m18927i2(duration));
            }
        } catch (Exception e10) {
        }
        return currentPosition;
    }

    /* renamed from: S1 */
    public final void m18909S1(Context context, ArrayList<LiveStreamsDBModel> arrayList, int i10) {
        m18906P1(context, arrayList, i10);
    }

    /* renamed from: T1 */
    public void m18910T1(String str, boolean z10, String str2, long j10, int i10, String str3, ArrayList<LiveStreamsDBModel> arrayList, int i11, int i12, String str4, String str5) {
        this.f23737R0 = str5;
        m18912V1(Uri.parse(str), z10, str2, j10, i10, str3, arrayList, i11, i12, str4);
    }

    /* renamed from: U1 */
    public final void m18911U1(Uri uri, Map<String, String> map, boolean z10, String str, long j10, int i10, String str2, ArrayList<LiveStreamsDBModel> arrayList, int i11, int i12, String str3) {
        this.f23765c = uri;
        this.f23768d = str;
        this.f23771e = map;
        this.f23838v = 0;
        this.f23702I = z10;
        this.f23740S0 = str2;
        this.f23723N0 = j10;
        this.f23715L0 = i10;
        this.f23727O0 = i12;
        this.f23743T0 = arrayList;
        this.f23707J0 = new PlayerResumeDBHandler(this.f23791j0);
        this.f23699H0 = new RecentWatchDBHandler(this.f23791j0);
        this.f23788i1 = new SeriesRecentWatchDatabase(this.f23791j0);
        this.f23796k1 = new C5602m(this.f23791j0);
        this.f23703I0 = new LiveStreamDBHandler(this.f23791j0);
        this.f23719M0 = SharepreferenceDBHandler.m15337A(this.f23791j0);
        this.f23698H = i11;
        this.f23734Q0 = str3;
        m18924g2();
        m18894D1();
        requestLayout();
        invalidate();
    }

    @Override // p324sf.InterfaceC8574m
    /* renamed from: V */
    public void mo16825V(String str) {
    }

    /* renamed from: V1 */
    public void m18912V1(Uri uri, boolean z10, String str, long j10, int i10, String str2, ArrayList<LiveStreamsDBModel> arrayList, int i11, int i12, String str3) {
        m18911U1(uri, null, z10, str, j10, i10, str2, arrayList, i11, i12, str3);
    }

    /* renamed from: W1 */
    public void m18913W1() {
        if (HoneyPlayer.f17266m1 || m18936n1() || this.f23700H1.getVisibility() != 8) {
            return;
        }
        m18920d();
        this.f23700H1.startAnimation(this.f23738R1);
        this.f23700H1.setVisibility(0);
        if (this.f23750V1.getVisibility() == 8) {
            this.f23750V1.startAnimation(this.f23738R1);
            this.f23750V1.setVisibility(0);
        }
        if (this.f23744T1.getVisibility() == 8) {
            this.f23744T1.startAnimation(this.f23738R1);
            this.f23744T1.setVisibility(0);
        }
        if (this.f23761a2.getVisibility() == 8 && !HoneyPlayer.m15790I0()) {
            this.f23761a2.startAnimation(this.f23738R1);
            this.f23761a2.setVisibility(0);
        }
        if (this.f23747U1.getVisibility() == 8) {
            this.f23747U1.startAnimation(this.f23738R1);
            this.f23747U1.setVisibility(0);
        }
        if (this.f23753W1.getVisibility() == 8) {
            this.f23753W1.startAnimation(this.f23738R1);
            this.f23753W1.setVisibility(0);
        }
    }

    /* renamed from: X1 */
    public void m18914X1() {
        if (this.f23700H1.getVisibility() == 8) {
            this.f23801l2.startAnimation(this.f23805m2);
            this.f23801l2.setVisibility(0);
        }
    }

    /* renamed from: Y1 */
    public final void m18915Y1(String str) {
        this.f23823r0.m18955b(2131429674).m18954a();
        this.f23823r0.m18955b(2131427519).m18958e();
        this.f23823r0.m18955b(2131427523).m18957d(str);
    }

    @SuppressLint({"SetTextI18n", "ResourceType"})
    /* renamed from: Z1 */
    public void m18916Z1(RadioGroup radioGroup, RadioGroup radioGroup2, RadioGroup radioGroup3, TextView textView, TextView textView2, TextView textView3, TextView textView4, FrameLayout frameLayout) {
        if (this.f23790j == null) {
            return;
        }
        radioGroup.removeAllViews();
        radioGroup2.removeAllViews();
        radioGroup3.removeAllViews();
        try {
            SharedPreferences sharedPreferences = this.f23791j0.getSharedPreferences("pref.using_sub_font_size", 0);
            this.f23800l1 = sharedPreferences;
            textView4.setText(sharedPreferences.getString("pref.using_sub_font_size", C5251a.f30039f0));
            frameLayout.setOnClickListener(new ViewOnClickListenerC3893s(this));
        } catch (Exception e10) {
        }
        Boolean bool = Boolean.FALSE;
        this.f23851y0 = bool;
        this.f23847x0 = bool;
        this.f23843w0 = bool;
        this.f23835u0 = bool;
        this.f23831t0 = bool;
        this.f23839v0 = bool;
        int m33683d = C7709e.m33683d(this.f23790j, 1);
        int m33683d2 = C7709e.m33683d(this.f23790j, 2);
        int m33683d3 = C7709e.m33683d(this.f23790j, 3);
        ITrackInfo[] trackInfo = this.f23790j.getTrackInfo();
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
                        this.f23843w0 = bool2;
                        if (!this.f23831t0.booleanValue()) {
                            this.f23831t0 = bool2;
                            RadioButton radioButton = new RadioButton(this.f23791j0);
                            radioButton.setText("Disable");
                            radioButton.setTextColor(getResources().getColor(2131100158));
                            radioButton.setTextSize(13.0f);
                            radioButton.setId(11111111);
                            radioButton.setButtonTintList(ColorStateList.valueOf(C4290b.m21724c(this.f23730P, 2131100158)));
                            radioButton.setPadding(0, 0, 16, 0);
                            radioButton.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3880h0(this, radioButton));
                            if (m33683d == -1) {
                                radioButton.setChecked(true);
                                radioGroup.setOnCheckedChangeListener(null);
                            }
                            radioButton.setTag("2");
                            radioGroup.addView(radioButton);
                        }
                        RadioButton radioButton2 = new RadioButton(this.f23791j0);
                        iTrackInfo.getInfoInline();
                        radioButton2.setText(i10 + ", " + iTrackInfo.getInfoInline());
                        if (i10 == -1) {
                            radioButton2.setId(111);
                        } else {
                            radioButton2.setId(i10);
                        }
                        radioButton2.setTextColor(getResources().getColor(2131100158));
                        radioButton2.setTextSize(13.0f);
                        radioButton2.setButtonTintList(ColorStateList.valueOf(C4290b.m21724c(this.f23730P, 2131100158)));
                        radioButton2.setPadding(0, 0, 16, 0);
                        radioButton2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3880h0(this, radioButton2));
                        if (i10 == m33683d) {
                            radioButton2.setChecked(true);
                            radioGroup.setOnCheckedChangeListener(null);
                        }
                        radioButton2.setTag("2");
                        radioGroup.addView(radioButton2);
                        radioGroup.setOnCheckedChangeListener(new C3894t(this, m33683d));
                    } else if (trackType == 2) {
                        Boolean bool3 = Boolean.TRUE;
                        this.f23847x0 = bool3;
                        if (!this.f23835u0.booleanValue()) {
                            this.f23835u0 = bool3;
                            RadioButton radioButton3 = new RadioButton(this.f23791j0);
                            radioButton3.setText("Disable");
                            radioButton3.setTextColor(getResources().getColor(2131100158));
                            radioButton3.setTextSize(13.0f);
                            radioButton3.setButtonTintList(ColorStateList.valueOf(C4290b.m21724c(this.f23730P, 2131100158)));
                            radioButton3.setId(1111111);
                            radioButton3.setPadding(0, 0, 16, 0);
                            radioButton3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3880h0(this, radioButton3));
                            if (m33683d2 == -1) {
                                radioButton3.setChecked(true);
                                radioGroup2.setOnCheckedChangeListener(null);
                            }
                            radioButton3.setTag("2");
                            radioGroup2.addView(radioButton3);
                        }
                        RadioButton radioButton4 = new RadioButton(this.f23791j0);
                        radioButton4.setText(i10 + ", " + iTrackInfo.getInfoInline() + ", " + m18934m1(iTrackInfo.getLanguage()));
                        radioButton4.setTextColor(getResources().getColor(2131100158));
                        radioButton4.setTextSize(13.0f);
                        radioButton4.setButtonTintList(ColorStateList.valueOf(C4290b.m21724c(this.f23730P, 2131100158)));
                        if (i10 == -1) {
                            radioButton4.setId(1111);
                        } else {
                            radioButton4.setId(i10);
                        }
                        radioButton4.setPadding(0, 0, 16, 0);
                        radioButton4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3880h0(this, radioButton4));
                        if (i10 == m33683d2) {
                            radioButton4.setChecked(true);
                            radioGroup2.setOnCheckedChangeListener(null);
                        }
                        radioButton4.setTag("2");
                        radioGroup2.addView(radioButton4);
                        radioGroup2.setOnCheckedChangeListener(new C3895u(this, m33683d2));
                    } else if (trackType == 3) {
                        Boolean bool4 = Boolean.TRUE;
                        this.f23851y0 = bool4;
                        if (!this.f23839v0.booleanValue()) {
                            this.f23839v0 = bool4;
                            RadioButton radioButton5 = new RadioButton(this.f23791j0);
                            radioButton5.setText("Disable");
                            radioButton5.setTextColor(getResources().getColor(2131100158));
                            radioButton5.setTextSize(13.0f);
                            radioButton5.setButtonTintList(ColorStateList.valueOf(C4290b.m21724c(this.f23730P, 2131100158)));
                            radioButton5.setId(111111);
                            radioButton5.setPadding(0, 0, 16, 0);
                            radioButton5.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3880h0(this, radioButton5));
                            if (m33683d3 == -1) {
                                radioButton5.setChecked(true);
                                radioGroup3.setOnCheckedChangeListener(null);
                            }
                            radioButton5.setTag("2");
                            radioGroup3.addView(radioButton5);
                        }
                        RadioButton radioButton6 = new RadioButton(this.f23791j0);
                        radioButton6.setText(i10 + ", " + iTrackInfo.getInfoInline());
                        radioButton6.setTextColor(getResources().getColor(2131100158));
                        radioButton6.setTextSize(13.0f);
                        radioButton6.setButtonTintList(ColorStateList.valueOf(C4290b.m21724c(this.f23730P, 2131100158)));
                        if (i10 == -1) {
                            radioButton6.setId(11111);
                        } else {
                            radioButton6.setId(i10);
                        }
                        radioButton6.setPadding(0, 0, 16, 0);
                        radioButton6.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3880h0(this, radioButton6));
                        if (i10 == m33683d3) {
                            radioButton6.setChecked(true);
                            radioGroup3.setOnCheckedChangeListener(null);
                        }
                        radioButton6.setTag("2");
                        radioGroup3.addView(radioButton6);
                        radioGroup3.setOnCheckedChangeListener(new C3897w(this, m33683d3));
                    }
                }
            }
            if (this.f23843w0.booleanValue()) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
            if (this.f23847x0.booleanValue()) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
            if (this.f23851y0.booleanValue()) {
                textView3.setVisibility(8);
                return;
            }
        }
        textView3.setVisibility(0);
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: a */
    public void mo15996a() {
    }

    /* renamed from: a2 */
    public void m18917a2() {
        try {
            SharedPreferences sharedPreferences = this.f23791j0.getSharedPreferences("auto_start", 0);
            this.f23758Z0 = sharedPreferences;
            String string = sharedPreferences.getString("autoplay_seconds", C5251a.f30031b0);
            int m26215R = C5255e.m26215R(C5251a.f30031b0);
            int i10 = m26215R;
            if (string != null) {
                i10 = m26215R;
                if (string.contains("s")) {
                    i10 = C5255e.m26215R(string.split("s")[0]);
                }
            }
            if (this.f23728O1 != null) {
                this.f23732P1 = new RunnableC3872d0(this, i10);
                m18921d2();
                this.f23728O1.postDelayed(this.f23732P1, 1000L);
            }
        } catch (Exception e10) {
        }
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: b */
    public void mo15997b() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x02ab, code lost:
    
        if (r0 != (-1)) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02bf, code lost:
    
        if (r0 == (-1)) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x029c, code lost:
    
        if (r0 == (-1)) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02c5, code lost:
    
        m18904N1(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02ae, code lost:
    
        m18942q1(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03a9  */
    /* renamed from: b2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m18918b2(int r11) {
        /*
            Method dump skipped, instructions count: 1077
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes.m18918b2(int):void");
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: c */
    public void mo15998c(String str) {
    }

    /* renamed from: c2 */
    public void m18919c2() {
        ServiceC6971a.m31982d(null);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.f23842w;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.f23846x;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.f23850y;
    }

    /* renamed from: d */
    public void m18920d() {
        if (!this.f23674B) {
            this.f23674B = true;
        }
        m18941p2();
        Handler handler = this.f23853y2;
        if (handler != null) {
            handler.sendEmptyMessage(1);
        }
    }

    /* renamed from: d2 */
    public void m18921d2() {
        Handler handler = this.f23728O1;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: e2 */
    public void m18922e2() {
        Handler handler;
        if (HoneyPlayer.f17266m1 || (handler = this.f23704I1) == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    /* renamed from: f2 */
    public void m18923f2() {
        Handler handler = this.f23712K1;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: g2 */
    public void m18924g2() {
        try {
            IMediaPlayer iMediaPlayer = this.f23790j;
            if (iMediaPlayer != null) {
                iMediaPlayer.stop();
                this.f23790j.release();
                this.f23790j = null;
                C7707c c7707c = this.f23745U;
                if (c7707c != null) {
                    c7707c.m33668l(null);
                }
                this.f23778g = 0;
                this.f23782h = 0;
                ((AudioManager) this.f23730P.getSystemService("audio")).abandonAudioFocus(null);
            }
        } catch (Exception e10) {
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f23790j != null) {
            return this.f23826s;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (m18893C1()) {
            return (int) this.f23790j.getCurrentPosition();
        }
        return 0;
    }

    public int getCurrentPositionSeekbar() {
        return this.f23769d1;
    }

    public int getCurrentWindowIndex() {
        return this.f23698H;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (m18893C1()) {
            return (int) this.f23790j.getDuration();
        }
        return -1;
    }

    public Boolean getFullScreenValue() {
        return Boolean.valueOf(this.f23702I);
    }

    public int getNewSeekPosition() {
        return (int) this.f23670A;
    }

    public boolean getPlayerIsPrepared() {
        return this.f23836u1;
    }

    public boolean getProgress() {
        return this.f23776f1;
    }

    public String getShowOrHideSubtitles() {
        return this.f23787i0;
    }

    public ITrackInfo[] getTrackInfo() {
        IMediaPlayer iMediaPlayer = this.f23790j;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.getTrackInfo();
    }

    /* renamed from: h2 */
    public final int m18925h2(int i10, int i11) {
        return this.f23699H0.m15303D0(String.valueOf(i10), i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.view.View] */
    /* renamed from: i1 */
    public final void m18926i1() {
        InterfaceC7706b interfaceC7706b;
        if (this.f23790j == null || (interfaceC7706b = this.f23814p) == null) {
            return;
        }
        interfaceC7706b.m33654c(this);
        this.f23814p.m33653b(getParent() instanceof View ? (View) getParent() : this);
        this.f23814p.setEnabled(m18893C1());
    }

    /* renamed from: i2 */
    public String m18927i2(int i10) {
        int i11 = i10 / 1000;
        int i12 = i11 % 60;
        int i13 = (i11 / 60) % 60;
        int i14 = i11 / 3600;
        try {
            this.f23683D0.setLength(0);
            return i14 > 0 ? this.f23687E0.format("%d:%02d:%02d", Integer.valueOf(i14), Integer.valueOf(i13), Integer.valueOf(i12)).toString() : this.f23687E0.format("%02d:%02d", Integer.valueOf(i13), Integer.valueOf(i12)).toString();
        } catch (Exception e10) {
            return this.f23687E0.format("%02d:%02d", Integer.valueOf(i13), Integer.valueOf(i12)).toString();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        IMediaPlayer iMediaPlayer;
        return m18893C1() && (iMediaPlayer = this.f23790j) != null && iMediaPlayer.isPlaying();
    }

    /* renamed from: j1 */
    public void m18928j1(int i10) {
        if (HoneyPlayer.f17266m1) {
            return;
        }
        if (!m18936n1()) {
            this.f23708J1 = new RunnableC3869c(this);
        }
        this.f23704I1.postDelayed(this.f23708J1, i10);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: j2 */
    public final void m18929j2() {
        int i10;
        DialogC0242a.a aVar = new DialogC0242a.a(getContext());
        aVar.setTitle(getResources().getString(2132018666));
        String string = this.f23800l1.getString("pref.using_sub_font_size", C5251a.f30039f0);
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
        aVar.m863k(new CharSequence[]{"10", "12", "14", "16", "18", "20", "22", "24", "26", "28", "30", "32", "34", "36", "38", "40"}, i10, new DialogInterfaceOnClickListenerC3898x(this));
        try {
            DialogC0242a create = aVar.create();
            this.f23688E1 = create;
            create.setOnDismissListener(new DialogInterfaceOnDismissListenerC3899y(this));
            this.f23688E1.show();
        } catch (Exception e10) {
        }
    }

    /* renamed from: k1 */
    public void m18930k1(int i10) {
        RunnableC3867b runnableC3867b = new RunnableC3867b(this);
        this.f23716L1 = runnableC3867b;
        this.f23712K1.postDelayed(runnableC3867b, i10);
    }

    /* renamed from: k2 */
    public final void m18931k2(String str) {
        try {
            SharedPreferences sharedPreferences = this.f23791j0.getSharedPreferences("pref.using_sub_font_size", 0);
            this.f23800l1 = sharedPreferences;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            this.f23676B1 = edit;
            if (edit != null) {
                edit.putString("pref.using_sub_font_size", str);
                this.f23676B1.apply();
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: l1 */
    public final void m18932l1(IMediaPlayer iMediaPlayer, InterfaceC4042a.b bVar) {
        if (iMediaPlayer == null) {
            return;
        }
        if (bVar == null) {
            iMediaPlayer.setDisplay(null);
        } else {
            bVar.mo19700b(iMediaPlayer);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0104  */
    /* renamed from: l2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int m18933l2() {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes.m18933l2():int");
    }

    /* renamed from: m1 */
    public final String m18934m1(String str) {
        String str2 = str;
        if (TextUtils.isEmpty(str)) {
            str2 = "und";
        }
        return str2;
    }

    /* renamed from: m2 */
    public void m18935m2() {
        this.f23795k0.m18949x1();
        RelativeLayout relativeLayout = this.f23817p2;
        if (relativeLayout == null || relativeLayout.getVisibility() != 0) {
            if (HoneyPlayer.f17266m1) {
                if (m18936n1()) {
                    return;
                }
                m18923f2();
                if (this.f23801l2.getVisibility() == 0) {
                    m18948w1();
                    return;
                } else {
                    m18914X1();
                    m18930k1(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
                    return;
                }
            }
            if (m18936n1()) {
                return;
            }
            SeekBar seekBar = this.f23696G1;
            if (seekBar != null) {
                seekBar.setProgress(this.f23799l0.getStreamVolume(3));
            }
            m18922e2();
            if (this.f23793j2.getVisibility() == 0) {
                this.f23793j2.startAnimation(this.f23797k2);
                this.f23793j2.setVisibility(8);
            } else if (this.f23700H1.getVisibility() == 0) {
                m18947v1();
            } else {
                m18913W1();
                m18928j1(TFTP.DEFAULT_TIMEOUT);
            }
        }
    }

    /* renamed from: n1 */
    public boolean m18936n1() {
        RelativeLayout relativeLayout = this.f23808n1;
        return relativeLayout != null && relativeLayout.getVisibility() == 0;
    }

    /* renamed from: n2 */
    public final void m18937n2() {
        if (this.f23814p.m33652a()) {
            this.f23814p.m33655d();
        } else {
            this.f23814p.show();
        }
    }

    /* renamed from: o1 */
    public final void m18938o1(int i10) {
        Handler handler;
        Activity activity;
        boolean isInPictureInPictureMode;
        List<GetEpisdoeDetailsCallback> m14755b;
        try {
            if (this.f23728O1 != null) {
                if ((getDuration() / 1000) - (getCurrentPosition() / 1000) < i10) {
                    this.f23833t2 = true;
                    this.f23829s2--;
                }
                int i11 = this.f23829s2;
                if (i11 < i10 && i11 != 0 && this.f23833t2) {
                    Log.e(this.f23762b, "timeup: " + this.f23829s2);
                    TextView textView = this.f23824r1;
                    if (textView != null) {
                        textView.setText(String.valueOf(this.f23829s2));
                    }
                    TextView textView2 = this.f23828s1;
                    if (textView2 != null && this.f23820q1 != null && !textView2.isFocused() && !this.f23820q1.isFocused()) {
                        m18922e2();
                        m18928j1(0);
                        this.f23828s1.requestFocus();
                    }
                    if (this.f23808n1 != null) {
                        try {
                            if (Build.VERSION.SDK_INT >= 24 && (activity = this.f23791j0) != null) {
                                isInPictureInPictureMode = activity.isInPictureInPictureMode();
                                if (isInPictureInPictureMode) {
                                    this.f23808n1.setVisibility(8);
                                    this.f23825r2 = true;
                                }
                            }
                            this.f23825r2 = false;
                        } catch (Exception e10) {
                        }
                    }
                    RelativeLayout relativeLayout = this.f23808n1;
                    if (relativeLayout != null && relativeLayout.getVisibility() == 8 && !this.f23825r2) {
                        this.f23808n1.setVisibility(0);
                        if (this.f23812o1 != null && (m14755b = EpisodesUsingSinglton.m14753c().m14755b()) != null && m14755b.size() > 0) {
                            if (this.f23698H == m14755b.size() - 1) {
                                this.f23698H = 0;
                            } else {
                                this.f23698H++;
                            }
                            if (m14755b.size() > 1 && this.f23698H <= m14755b.size() - 1) {
                                try {
                                    C10014t.m42105q(this.f23730P.getApplicationContext()).m42116l(m14755b.get(this.f23698H).m14962n()).m42151g(this.f23812o1);
                                } catch (Exception e11) {
                                    Log.e(this.f23762b, "honey: " + e11.getMessage());
                                }
                            }
                        }
                        this.f23820q1.setOnClickListener(new ViewOnClickListenerC3874e0(this));
                        this.f23828s1.setOnClickListener(new ViewOnClickListenerC3876f0(this));
                        this.f23832t1.setOnClickListener(new ViewOnClickListenerC3865a(this));
                    }
                    m18921d2();
                    handler = this.f23728O1;
                } else if (i11 == 0 || i11 == 1) {
                    m18921d2();
                    m18895E1();
                    return;
                } else {
                    m18921d2();
                    handler = this.f23728O1;
                }
                handler.postDelayed(this.f23732P1, 1000L);
            }
        } catch (Exception e12) {
        }
    }

    /* renamed from: o2 */
    public final void m18939o2() {
        View findViewById = this.f23791j0.findViewById(2131427469);
        this.f23819q0 = findViewById;
        findViewById.setClickable(true);
        this.f23819q0.setOnTouchListener(new ViewOnTouchListenerC3866a0(this));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == 2131429598) {
            m18902L1();
        } else {
            if (id2 != 2131429600) {
                return;
            }
            m18903M1();
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10 = (i10 == 4 || i10 == 24 || i10 == 25 || i10 == 164 || i10 == 82 || i10 == 5 || i10 == 6) ? false : true;
        if (m18893C1() && z10 && this.f23814p != null) {
            if (i10 == 79 || i10 == 85) {
                IMediaPlayer iMediaPlayer = this.f23790j;
                if (iMediaPlayer == null || !iMediaPlayer.isPlaying()) {
                    start();
                    this.f23814p.m33655d();
                    return true;
                }
                pause();
                this.f23814p.show();
                return true;
            }
            if (i10 == 126) {
                IMediaPlayer iMediaPlayer2 = this.f23790j;
                if (iMediaPlayer2 == null || iMediaPlayer2.isPlaying()) {
                    return true;
                }
                start();
                this.f23814p.m33655d();
                return true;
            }
            if (i10 == 86 || i10 == 127) {
                IMediaPlayer iMediaPlayer3 = this.f23790j;
                if (iMediaPlayer3 == null || !iMediaPlayer3.isPlaying()) {
                    return true;
                }
                pause();
                this.f23814p.show();
                return true;
            }
            m18937n2();
        }
        return super.onKeyDown(i10, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* renamed from: p1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tv.danmaku.ijk.media.player.IMediaPlayer m18940p1(int r7) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes.m18940p1(int):tv.danmaku.ijk.media.player.IMediaPlayer");
    }

    /* renamed from: p2 */
    public final void m18941p2() {
        IMediaPlayer iMediaPlayer = this.f23790j;
        if (iMediaPlayer == null || !iMediaPlayer.isPlaying()) {
            this.f23823r0.m18955b(2131428207).m18954a();
            this.f23823r0.m18955b(2131428208).m18958e();
            AbstractC3878g0 abstractC3878g0 = this.f23837u2;
            if (abstractC3878g0 != null) {
                abstractC3878g0.mo15861b();
                return;
            }
            return;
        }
        this.f23823r0.m18955b(2131428208).m18954a();
        this.f23823r0.m18955b(2131428207).m18958e();
        AbstractC3878g0 abstractC3878g02 = this.f23837u2;
        if (abstractC3878g02 != null) {
            abstractC3878g02.mo15860a();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        IMediaPlayer iMediaPlayer;
        if (m18893C1() && (iMediaPlayer = this.f23790j) != null && iMediaPlayer.isPlaying()) {
            this.f23790j.pause();
            this.f23778g = 4;
        }
        this.f23782h = 4;
    }

    /* renamed from: q1 */
    public void m18942q1(int i10) {
        C7709e.m33681b(this.f23790j, i10);
    }

    /* renamed from: r1 */
    public void m18943r1() {
        ServiceC6971a.m31982d(this.f23790j);
    }

    /* renamed from: s1 */
    public void m18944s1(boolean z10) {
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i10) {
        int i11 = i10;
        if (m18893C1()) {
            this.f23775f0 = System.currentTimeMillis();
            this.f23790j.seekTo(i10);
            i11 = 0;
        }
        this.f23838v = i11;
    }

    public void setAdjustViewBounds(boolean z10) {
        if (this.f23821q2 == z10) {
            return;
        }
        this.f23821q2 = z10;
        if (z10) {
            setBackground(null);
        } else {
            setBackgroundColor(DefaultRenderer.BACKGROUND_COLOR);
        }
        requestLayout();
    }

    public void setCurrentPositionSeekbar(int i10) {
        this.f23769d1 = i10;
    }

    public void setCurrentWindowIndex(int i10) {
        this.f23698H = i10;
    }

    public void setHudView(TableLayout tableLayout) {
        this.f23745U = new C7707c(getContext(), tableLayout);
    }

    public void setMediaController(InterfaceC7706b interfaceC7706b) {
        InterfaceC7706b interfaceC7706b2 = this.f23814p;
        if (interfaceC7706b2 != null) {
            interfaceC7706b2.m33655d();
        }
        this.f23814p = interfaceC7706b;
        m18926i1();
    }

    public void setMovieListener(AbstractC3878g0 abstractC3878g0) {
        this.f23837u2 = abstractC3878g0;
    }

    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.f23818q = onCompletionListener;
    }

    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        this.f23830t = onErrorListener;
    }

    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.f23834u = onInfoListener;
    }

    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.f23822r = onPreparedListener;
    }

    public void setProgress(boolean z10) {
        this.f23776f1 = z10;
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
                Log.e(this.f23762b, String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i10)));
                return;
            }
            C4044c c4044c = new C4044c(getContext());
            c4043b = c4044c;
            if (this.f23790j != null) {
                c4044c.getSurfaceHolder().mo19700b(this.f23790j);
                c4044c.mo19696c(this.f23790j.getVideoWidth(), this.f23790j.getVideoHeight());
                c4044c.mo19694a(this.f23790j.getVideoSarNum(), this.f23790j.getVideoSarDen());
                c4044c.setAspectRatio(this.f23713K2);
                c4043b = c4044c;
            }
        }
        setRenderView(c4043b);
    }

    public void setRenderView(InterfaceC4042a interfaceC4042a) {
        int i10;
        int i11;
        if (this.f23736R != null) {
            IMediaPlayer iMediaPlayer = this.f23790j;
            if (iMediaPlayer != null) {
                iMediaPlayer.setDisplay(null);
            }
            View view = this.f23736R.getView();
            this.f23736R.mo19695b(this.f23705I2);
            this.f23736R = null;
            removeView(view);
        }
        if (interfaceC4042a == null) {
            return;
        }
        this.f23736R = interfaceC4042a;
        SharedPreferences sharedPreferences = this.f23730P.getSharedPreferences("loginPrefs", 0);
        this.f23718M = sharedPreferences;
        int i12 = sharedPreferences.getInt("aspect_ratio", 4);
        this.f23709J2 = i12;
        interfaceC4042a.setAspectRatio(i12);
        int i13 = this.f23794k;
        if (i13 > 0 && (i11 = this.f23798l) > 0) {
            interfaceC4042a.mo19696c(i13, i11);
        }
        int i14 = this.f23739S;
        if (i14 > 0 && (i10 = this.f23742T) > 0) {
            interfaceC4042a.mo19694a(i14, i10);
        }
        View view2 = this.f23736R.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(view2);
        this.f23736R.mo19698e(this.f23705I2);
        this.f23736R.setVideoRotation(this.f23810o);
    }

    public void setShowOrHideSubtitles(String str) {
        this.f23787i0 = str;
    }

    public void setSpeed(float f10) {
        try {
            ((IjkMediaPlayer) this.f23790j).setSpeed(f10);
            this.f23795k0.m18949x1();
        } catch (Exception e10) {
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (m18893C1()) {
            this.f23790j.start();
            this.f23778g = 3;
        }
        this.f23782h = 3;
    }

    /* renamed from: t1 */
    public final void m18945t1() {
    }

    /* renamed from: u1 */
    public void m18946u1() {
        Runnable runnable;
        Handler handler = this.f23728O1;
        if (handler != null && (runnable = this.f23732P1) != null) {
            handler.removeCallbacks(runnable);
        }
        this.f23735Q1 = true;
        this.f23808n1.setAnimation(this.f23741S1);
        this.f23808n1.setVisibility(8);
    }

    /* renamed from: v1 */
    public void m18947v1() {
        this.f23795k0.m18949x1();
        this.f23853y2.removeMessages(1);
        if (HoneyPlayer.f17266m1 || this.f23700H1.getVisibility() != 0) {
            return;
        }
        this.f23700H1.startAnimation(this.f23741S1);
        if (this.f23750V1.getVisibility() == 0) {
            this.f23750V1.startAnimation(this.f23741S1);
        }
        if (this.f23744T1.getVisibility() == 0) {
            this.f23744T1.startAnimation(this.f23741S1);
        }
        if (this.f23761a2.getVisibility() == 0) {
            this.f23761a2.startAnimation(this.f23741S1);
        }
        if (this.f23747U1.getVisibility() == 0) {
            this.f23747U1.startAnimation(this.f23741S1);
        }
        if (this.f23753W1.getVisibility() == 0) {
            this.f23753W1.startAnimation(this.f23741S1);
        }
        this.f23700H1.setVisibility(8);
        if (this.f23750V1.getVisibility() == 0) {
            this.f23750V1.setVisibility(8);
        }
        if (this.f23744T1.getVisibility() == 0) {
            this.f23744T1.setVisibility(8);
        }
        if (this.f23761a2.getVisibility() == 0) {
            this.f23761a2.setVisibility(8);
        }
        if (this.f23747U1.getVisibility() == 0) {
            this.f23747U1.setVisibility(8);
        }
        if (this.f23753W1.getVisibility() == 0) {
            this.f23753W1.setVisibility(8);
        }
    }

    /* renamed from: w1 */
    public void m18948w1() {
        this.f23795k0.m18949x1();
        if (this.f23801l2.getVisibility() == 0) {
            this.f23801l2.startAnimation(this.f23809n2);
            this.f23801l2.setVisibility(8);
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: x1 */
    public void m18949x1() {
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f23795k0;
        if (nSTIJKPlayerEpisodes != null) {
            nSTIJKPlayerEpisodes.setSystemUiVisibility(1799);
        }
    }

    /* renamed from: y1 */
    public final void m18950y1() {
        boolean m31278p = this.f23733Q.m31278p();
        this.f23729O2 = m31278p;
        if (m31278p) {
            ServiceC6971a.m31980b(getContext());
            IMediaPlayer m31979a = ServiceC6971a.m31979a();
            this.f23790j = m31979a;
            C7707c c7707c = this.f23745U;
            if (c7707c != null) {
                c7707c.m33668l(m31979a);
            }
        }
    }

    /* renamed from: z1 */
    public final void m18951z1() {
        this.f23717L2.clear();
        if (this.f23733Q.m31281s()) {
            this.f23717L2.add(1);
        }
        if (this.f23733Q.m31282t()) {
            this.f23717L2.add(2);
        }
        if (this.f23733Q.m31280r()) {
            this.f23717L2.add(0);
        }
        if (this.f23717L2.isEmpty()) {
            this.f23717L2.add(1);
        }
        int intValue = this.f23717L2.get(this.f23721M2).intValue();
        this.f23725N2 = intValue;
        setRender(intValue);
    }
}

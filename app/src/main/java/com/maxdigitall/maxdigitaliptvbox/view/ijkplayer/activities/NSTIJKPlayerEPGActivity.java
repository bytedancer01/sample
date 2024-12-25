package com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0243b;
import butterknife.BindView;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteM3UModel;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamCategoryIdDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.PasswordStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import nf.C6783a;
import org.apache.commons.net.tftp.TFTP;
import org.apache.http.protocol.HttpRequestExecutor;
import org.joda.time.LocalDateTime;
import p151if.C5251a;
import p151if.C5255e;
import p331t5.C8632a;
import p428yg.C10014t;
import pf.C7707c;
import pf.C7709e;
import pf.C7711g;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerEPGActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerEPGActivity.class */
public class NSTIJKPlayerEPGActivity extends ActivityC0243b implements SurfaceHolder.Callback, View.OnClickListener {

    /* renamed from: J1 */
    public static SharedPreferences f22472J1;

    /* renamed from: K1 */
    public static SharedPreferences f22473K1;

    /* renamed from: L1 */
    public static String f22474L1;

    /* renamed from: M1 */
    public static String f22475M1;

    /* renamed from: N1 */
    public static boolean f22476N1;

    /* renamed from: O1 */
    public static ProgressBar f22477O1;

    /* renamed from: A0 */
    public SharedPreferences.Editor f22479A0;

    /* renamed from: A1 */
    public Animation f22480A1;

    /* renamed from: B */
    public RelativeLayout f22481B;

    /* renamed from: B0 */
    public TextView f22482B0;

    /* renamed from: B1 */
    public Animation f22483B1;

    /* renamed from: C */
    public ArrayList<LiveStreamsDBModel> f22484C;

    /* renamed from: C0 */
    public TextView f22485C0;

    /* renamed from: C1 */
    public Animation f22486C1;

    /* renamed from: D */
    public ArrayList<LiveStreamsDBModel> f22487D;

    /* renamed from: D0 */
    public Handler f22488D0;

    /* renamed from: D1 */
    public String f22489D1;

    /* renamed from: E0 */
    public Handler f22491E0;

    /* renamed from: E1 */
    public String f22492E1;

    /* renamed from: F0 */
    public Handler f22494F0;

    /* renamed from: F1 */
    public String f22495F1;

    /* renamed from: G0 */
    public Handler f22497G0;

    /* renamed from: G1 */
    public int f22498G1;

    /* renamed from: H */
    public LiveStreamDBHandler f22499H;

    /* renamed from: H0 */
    public SharedPreferences.Editor f22500H0;

    /* renamed from: H1 */
    public Animation f22501H1;

    /* renamed from: I */
    public SharedPreferences f22502I;

    /* renamed from: I0 */
    public SharedPreferences.Editor f22503I0;

    /* renamed from: I1 */
    public Animation f22504I1;

    /* renamed from: J */
    public SharedPreferences f22505J;

    /* renamed from: J0 */
    public SharedPreferences.Editor f22506J0;

    /* renamed from: K */
    public SharedPreferences f22507K;

    /* renamed from: L */
    public SharedPreferences f22509L;

    /* renamed from: M */
    public SharedPreferences f22511M;

    /* renamed from: M0 */
    public LinearLayout f22512M0;

    /* renamed from: N */
    public SharedPreferences f22513N;

    /* renamed from: N0 */
    public TextView f22514N0;

    /* renamed from: O */
    public SharedPreferences f22515O;

    /* renamed from: P */
    public SimpleDateFormat f22517P;

    /* renamed from: P0 */
    public Boolean f22518P0;

    /* renamed from: Q */
    public String f22519Q;

    /* renamed from: Q0 */
    public Menu f22520Q0;

    /* renamed from: R */
    public String f22521R;

    /* renamed from: R0 */
    public DateFormat f22522R0;

    /* renamed from: S0 */
    public String f22524S0;

    /* renamed from: T */
    public ArrayList<LiveStreamCategoryIdDBModel> f22525T;

    /* renamed from: T0 */
    public NSTIJKPlayerEPG f22526T0;

    /* renamed from: U */
    public ArrayList<LiveStreamCategoryIdDBModel> f22527U;

    /* renamed from: U0 */
    public String f22528U0;

    /* renamed from: V */
    public ArrayList<LiveStreamCategoryIdDBModel> f22529V;

    /* renamed from: V0 */
    public Boolean f22530V0;

    /* renamed from: W */
    public ArrayList<LiveStreamCategoryIdDBModel> f22531W;

    /* renamed from: W0 */
    public String f22532W0;

    /* renamed from: X */
    public ArrayList<LiveStreamsDBModel> f22533X;

    /* renamed from: X0 */
    public int f22534X0;

    /* renamed from: Y */
    public ArrayList<LiveStreamsDBModel> f22535Y;

    /* renamed from: Y0 */
    public String f22536Y0;

    /* renamed from: Z */
    public ArrayList<LiveStreamsDBModel> f22537Z;

    /* renamed from: Z0 */
    public SharedPreferences f22538Z0;

    /* renamed from: a1 */
    public String f22539a1;

    /* renamed from: b1 */
    public String f22540b1;

    /* renamed from: c1 */
    public String f22541c1;

    /* renamed from: d1 */
    public Long f22543d1;

    /* renamed from: e */
    public String f22544e;

    /* renamed from: e1 */
    public String f22545e1;

    /* renamed from: f */
    public View f22546f;

    /* renamed from: f0 */
    public ArrayList<LiveStreamsDBModel> f22547f0;

    /* renamed from: f1 */
    public String f22548f1;

    @BindView
    public FrameLayout fl_sub_font_size;

    /* renamed from: g */
    public View f22549g;

    /* renamed from: g0 */
    public ArrayList<LiveStreamsDBModel> f22550g0;

    /* renamed from: g1 */
    public Boolean f22551g1;

    /* renamed from: h */
    public ImageView f22552h;

    /* renamed from: h0 */
    public ArrayList<LiveStreamsDBModel> f22553h0;

    /* renamed from: h1 */
    public SharedPreferences f22554h1;

    /* renamed from: i */
    public View f22555i;

    /* renamed from: i0 */
    public ArrayList<LiveStreamsDBModel> f22556i0;

    /* renamed from: i1 */
    public Date f22557i1;

    @BindView
    public ImageView iv_audio_subtitle_track;

    @BindView
    public ImageView iv_back;

    @BindView
    public ImageView iv_back_episodes;

    @BindView
    public ImageView iv_back_settings;

    @BindView
    public ImageView iv_hp_lock;

    @BindView
    public ImageView iv_hp_play_from_beginning;

    @BindView
    public ImageView iv_pause;

    @BindView
    public ImageView iv_play;

    @BindView
    public ImageView iv_unlock_button;

    /* renamed from: j */
    public ImageView f22558j;

    /* renamed from: j1 */
    public Boolean f22560j1;

    /* renamed from: k */
    public View f22561k;

    /* renamed from: k0 */
    public ArrayList<LiveStreamCategoryIdDBModel> f22562k0;

    /* renamed from: k1 */
    public Boolean f22563k1;

    /* renamed from: l0 */
    public ArrayList<PasswordStatusDBModel> f22565l0;

    /* renamed from: l1 */
    public Boolean f22566l1;

    @BindView
    public LinearLayout ll_audio_subtitle_settings;

    @BindView
    public LinearLayout ll_audio_subtitle_settings_click;

    @BindView
    public LinearLayout ll_back;

    @BindView
    public LinearLayout ll_back_click;

    @BindView
    public LinearLayout ll_brightness;

    @BindView
    public LinearLayout ll_channels_list;

    @BindView
    public LinearLayout ll_crop;

    @BindView
    public LinearLayout ll_hp_lock_click;

    @BindView
    public LinearLayout ll_multi_screen;

    @BindView
    public LinearLayout ll_no_cat_found;

    @BindView
    public LinearLayout ll_pause_play;

    @BindView
    public LinearLayout ll_player_header_footer;

    @BindView
    public LinearLayout ll_restart;

    @BindView
    public LinearLayout ll_screen_locked;

    @BindView
    public LinearLayout ll_volume;

    /* renamed from: m */
    public LinearLayout f22567m;

    /* renamed from: m0 */
    public ProgressBar f22568m0;

    /* renamed from: m1 */
    public Boolean f22569m1;

    /* renamed from: n */
    public TextView f22570n;

    /* renamed from: n0 */
    public TextView f22571n0;

    /* renamed from: n1 */
    public Boolean f22572n1;

    @BindView
    public TextView no_audio_track;

    @BindView
    public TextView no_subtitle_track;

    @BindView
    public TextView no_video_track;

    /* renamed from: o */
    public TextView f22573o;

    /* renamed from: o0 */
    public TextView f22574o0;

    /* renamed from: o1 */
    public Boolean f22575o1;

    /* renamed from: p */
    public SeekBar f22576p;

    /* renamed from: p1 */
    public C6783a f22578p1;

    /* renamed from: q */
    public ImageView f22579q;

    /* renamed from: q1 */
    public Handler f22581q1;

    /* renamed from: r */
    public TextView f22582r;

    /* renamed from: r1 */
    public C8632a f22584r1;

    @BindView
    public RadioGroup rg_audio;

    @BindView
    public RadioGroup rg_subtitle;

    @BindView
    public RadioGroup rg_video;

    @BindView
    public RelativeLayout rl_episodes_box;

    @BindView
    public RelativeLayout rl_settings_box;

    /* renamed from: s */
    public TextView f22585s;

    /* renamed from: s1 */
    public SimpleDateFormat f22587s1;

    @BindView
    public SeekBar sb_brightness;

    @BindView
    public SeekBar sb_volume;

    /* renamed from: t */
    public TextView f22588t;

    /* renamed from: t0 */
    public String f22589t0;

    /* renamed from: t1 */
    public String f22590t1;

    @BindView
    public TextView tv_brightness;

    @BindView
    public TextView tv_episode_name;

    @BindView
    public ImageView tv_seek_left;

    @BindView
    public ImageView tv_seek_right;

    @BindView
    public TextView tv_sub_font_size;

    @BindView
    public TextView tv_volume;

    /* renamed from: u */
    public TextView f22591u;

    /* renamed from: u1 */
    public Animation f22593u1;

    /* renamed from: v */
    public LinearLayout f22594v;

    /* renamed from: v1 */
    public Animation f22596v1;

    /* renamed from: w */
    public ProgressBar f22597w;

    /* renamed from: w1 */
    public Animation f22599w1;

    /* renamed from: x */
    public ProgressBar f22600x;

    /* renamed from: x0 */
    public int f22601x0;

    /* renamed from: x1 */
    public Animation f22602x1;

    /* renamed from: y0 */
    public DatabaseHandler f22604y0;

    /* renamed from: y1 */
    public Animation f22605y1;

    /* renamed from: z0 */
    public SharedPreferences.Editor f22607z0;

    /* renamed from: z1 */
    public Animation f22608z1;

    /* renamed from: d */
    public Context f22542d = this;

    /* renamed from: l */
    public boolean f22564l = false;

    /* renamed from: y */
    public boolean f22603y = true;

    /* renamed from: z */
    public boolean f22606z = false;

    /* renamed from: A */
    public boolean f22478A = false;

    /* renamed from: E */
    public boolean f22490E = true;

    /* renamed from: F */
    public long f22493F = 2500;

    /* renamed from: G */
    public boolean f22496G = true;

    /* renamed from: S */
    public int f22523S = 0;

    /* renamed from: j0 */
    public ArrayList<String> f22559j0 = new ArrayList<>();

    /* renamed from: p0 */
    public boolean f22577p0 = true;

    /* renamed from: q0 */
    public boolean f22580q0 = false;

    /* renamed from: r0 */
    public boolean f22583r0 = false;

    /* renamed from: s0 */
    public boolean f22586s0 = false;

    /* renamed from: u0 */
    public boolean f22592u0 = true;

    /* renamed from: v0 */
    public String f22595v0 = "";

    /* renamed from: w0 */
    public String f22598w0 = "";

    /* renamed from: K0 */
    public int f22508K0 = 0;

    /* renamed from: L0 */
    public StringBuilder f22510L0 = new StringBuilder();

    /* renamed from: O0 */
    public int f22516O0 = -1;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerEPGActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerEPGActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerEPGActivity$a.class */
    public class RunnableC3747a implements Runnable {

        /* renamed from: b */
        public final String f22609b;

        /* renamed from: c */
        public final String f22610c;

        /* renamed from: d */
        public final NSTIJKPlayerEPGActivity f22611d;

        public RunnableC3747a(NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity, String str, String str2) {
            this.f22611d = nSTIJKPlayerEPGActivity;
            this.f22609b = str;
            this.f22610c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity = this.f22611d;
            nSTIJKPlayerEPGActivity.f22539a1 = this.f22609b;
            nSTIJKPlayerEPGActivity.f22540b1 = this.f22610c;
            nSTIJKPlayerEPGActivity.f22526T0.setCurrentEpgChannelID(this.f22611d.f22539a1);
            this.f22611d.f22526T0.setCurrentChannelLogo(this.f22611d.f22540b1);
            NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity2 = this.f22611d;
            nSTIJKPlayerEPGActivity2.m18280f1(nSTIJKPlayerEPGActivity2.f22539a1, nSTIJKPlayerEPGActivity2.f22540b1);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerEPGActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerEPGActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerEPGActivity$b.class */
    public class RunnableC3748b implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerEPGActivity f22612b;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerEPGActivity$b$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerEPGActivity$b$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerEPGActivity$b$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final RunnableC3748b f22613b;

            public a(RunnableC3748b runnableC3748b) {
                this.f22613b = runnableC3748b;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f22613b.f22612b.f22514N0.setText("");
                this.f22613b.f22612b.f22512M0.setVisibility(8);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerEPGActivity$b$b.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerEPGActivity$b$b */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerEPGActivity$b$b.class */
        public class b implements Runnable {

            /* renamed from: b */
            public final RunnableC3748b f22614b;

            public b(RunnableC3748b runnableC3748b) {
                this.f22614b = runnableC3748b;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f22614b.f22612b.f22514N0.setText("");
                this.f22614b.f22612b.f22512M0.setVisibility(8);
            }
        }

        public RunnableC3748b(NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity) {
            this.f22612b = nSTIJKPlayerEPGActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            Handler handler;
            Runnable bVar;
            boolean z10;
            NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity = this.f22612b;
            nSTIJKPlayerEPGActivity.f22589t0 = nSTIJKPlayerEPGActivity.f22510L0.toString();
            this.f22612b.f22514N0.setText("");
            this.f22612b.f22512M0.setVisibility(8);
            NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity2 = this.f22612b;
            ArrayList<LiveStreamsDBModel> m15157D1 = nSTIJKPlayerEPGActivity2.f22499H.m15157D1(nSTIJKPlayerEPGActivity2.f22589t0, "live");
            this.f22612b.f22510L0.setLength(0);
            if (m15157D1 == null || m15157D1.size() == 0) {
                NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity3 = this.f22612b;
                nSTIJKPlayerEPGActivity3.f22514N0.setText(nSTIJKPlayerEPGActivity3.f22542d.getResources().getString(2132018196));
                this.f22612b.f22512M0.setVisibility(0);
                handler = new Handler();
                bVar = new b(this);
            } else {
                NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity4 = this.f22612b;
                if (nSTIJKPlayerEPGActivity4.f22499H.m15189R1(SharepreferenceDBHandler.m15337A(nSTIJKPlayerEPGActivity4.f22542d)) <= 0 || this.f22612b.f22559j0 == null) {
                    z10 = false;
                } else {
                    NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity5 = this.f22612b;
                    z10 = nSTIJKPlayerEPGActivity5.m18264O0(m15157D1, nSTIJKPlayerEPGActivity5.f22559j0);
                }
                if (!z10) {
                    NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity6 = this.f22612b;
                    nSTIJKPlayerEPGActivity6.f22583r0 = true;
                    nSTIJKPlayerEPGActivity6.f22586s0 = true;
                    nSTIJKPlayerEPGActivity6.f22595v0 = "0";
                    String m14811R = m15157D1.get(0).m14811R();
                    String name = m15157D1.get(0).getName();
                    String m14798E = m15157D1.get(0).m14798E();
                    String m14810Q = m15157D1.get(0).m14810Q();
                    String m14816W = m15157D1.get(0).m14816W();
                    this.f22612b.f22526T0.setTitle(this.f22612b.f22589t0 + " - " + name);
                    this.f22612b.f22526T0.m18774X0();
                    if (this.f22612b.f22521R.equals("m3u")) {
                        this.f22612b.f22526T0.m18778b1(Uri.parse(m14816W), this.f22612b.f22580q0, name);
                    } else {
                        this.f22612b.f22526T0.m18778b1(Uri.parse(this.f22612b.f22544e + C5255e.m26214Q(m14811R) + this.f22612b.f22519Q), this.f22612b.f22580q0, name);
                    }
                    this.f22612b.f22526T0.f23515I = 0;
                    this.f22612b.f22526T0.f23521K = false;
                    this.f22612b.f22526T0.start();
                    this.f22612b.f22494F0.removeCallbacksAndMessages(null);
                    this.f22612b.m18270V0();
                    NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity7 = this.f22612b;
                    nSTIJKPlayerEPGActivity7.f22539a1 = m14798E;
                    nSTIJKPlayerEPGActivity7.f22540b1 = m14810Q;
                    nSTIJKPlayerEPGActivity7.f22526T0.setCurrentEpgChannelID(this.f22612b.f22539a1);
                    this.f22612b.f22526T0.setCurrentChannelLogo(this.f22612b.f22540b1);
                    NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity8 = this.f22612b;
                    nSTIJKPlayerEPGActivity8.m18280f1(nSTIJKPlayerEPGActivity8.f22539a1, nSTIJKPlayerEPGActivity8.f22540b1);
                    this.f22612b.f22601x0 = C5255e.m26214Q(m14811R);
                    if (this.f22612b.f22607z0 != null) {
                        this.f22612b.f22607z0.putString("currentlyPlayingVideo", m14811R);
                        this.f22612b.f22607z0.apply();
                    }
                    m15157D1.clear();
                    return;
                }
                NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity9 = this.f22612b;
                nSTIJKPlayerEPGActivity9.f22514N0.setText(nSTIJKPlayerEPGActivity9.f22542d.getResources().getString(2132018196));
                this.f22612b.f22512M0.setVisibility(0);
                handler = new Handler();
                bVar = new a(this);
            }
            handler.postDelayed(bVar, 1000L);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerEPGActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerEPGActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerEPGActivity$c.class */
    public class RunnableC3749c implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerEPGActivity f22615b;

        public RunnableC3749c(NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity) {
            this.f22615b = nSTIJKPlayerEPGActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22615b.m18267R0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerEPGActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerEPGActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerEPGActivity$d.class */
    public class RunnableC3750d implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerEPGActivity f22616b;

        public RunnableC3750d(NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity) {
            this.f22616b = nSTIJKPlayerEPGActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22616b.m18266Q0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerEPGActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerEPGActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerEPGActivity$e.class */
    public class ViewOnFocusChangeListenerC3751e implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f22617b;

        /* renamed from: c */
        public final NSTIJKPlayerEPGActivity f22618c;

        public ViewOnFocusChangeListenerC3751e(NSTIJKPlayerEPGActivity nSTIJKPlayerEPGActivity, View view) {
            this.f22618c = nSTIJKPlayerEPGActivity;
            this.f22617b = view;
        }

        /* renamed from: a */
        public final void m18283a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f22617b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m18284b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f22617b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m18285c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f22617b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            View view2;
            View view3;
            View view4;
            LinearLayout linearLayout;
            View view5;
            View view6;
            View view7;
            LinearLayout linearLayout2;
            float f10 = 1.08f;
            if (z10) {
                if (!z10) {
                    f10 = 1.0f;
                }
                View view8 = this.f22617b;
                if (view8 == null || view8.getTag() == null || !this.f22617b.getTag().equals("1")) {
                    View view9 = this.f22617b;
                    if (view9 == null || view9.getTag() == null || !this.f22617b.getTag().equals("2")) {
                        View view10 = this.f22617b;
                        if (view10 == null || view10.getTag() == null || !this.f22617b.getTag().equals("3")) {
                            View view11 = this.f22617b;
                            if ((view11 != null && view11.getTag() != null && this.f22617b.getTag().equals("4")) || (((view5 = this.f22617b) != null && view5.getTag() != null && this.f22617b.getTag().equals("5")) || (((view6 = this.f22617b) != null && view6.getTag() != null && this.f22617b.getTag().equals("6")) || ((view7 = this.f22617b) != null && view7.getTag() != null && this.f22617b.getTag().equals("7"))))) {
                                view.setBackground(this.f22618c.getResources().getDrawable(2131231461));
                                return;
                            }
                            View view12 = this.f22617b;
                            if (view12 != null && view12.getTag() != null && this.f22617b.getTag().equals("8")) {
                                return;
                            }
                            View view13 = this.f22617b;
                            if (view13 == null || view13.getTag() == null || !this.f22617b.getTag().equals("9")) {
                                View view14 = this.f22617b;
                                if (view14 == null || view14.getTag() == null || !this.f22617b.getTag().equals("10")) {
                                    return;
                                }
                                view.setBackground(this.f22618c.getResources().getDrawable(2131231460));
                                m18284b(f10);
                                m18285c(f10);
                                linearLayout2 = this.f22618c.ll_restart;
                            }
                        }
                        view.setBackground(this.f22618c.getResources().getDrawable(2131231460));
                        m18284b(f10);
                        m18285c(f10);
                        return;
                    }
                    view.setBackground(this.f22618c.getResources().getDrawable(2131231460));
                    m18284b(f10);
                    m18285c(f10);
                    linearLayout2 = this.f22618c.ll_audio_subtitle_settings;
                } else {
                    view.setBackground(this.f22618c.getResources().getDrawable(2131231460));
                    m18284b(f10);
                    m18285c(f10);
                    linearLayout2 = this.f22618c.ll_back;
                }
                linearLayout2.setVisibility(0);
                return;
            }
            if (z10) {
                return;
            }
            if (!z10) {
                f10 = 1.0f;
            }
            View view15 = this.f22617b;
            if (view15 == null || view15.getTag() == null || !this.f22617b.getTag().equals("1")) {
                View view16 = this.f22617b;
                if (view16 == null || view16.getTag() == null || !this.f22617b.getTag().equals("2")) {
                    View view17 = this.f22617b;
                    if (view17 == null || view17.getTag() == null || !this.f22617b.getTag().equals("3")) {
                        View view18 = this.f22617b;
                        if ((view18 != null && view18.getTag() != null && this.f22617b.getTag().equals("4")) || (((view2 = this.f22617b) != null && view2.getTag() != null && this.f22617b.getTag().equals("5")) || (((view3 = this.f22617b) != null && view3.getTag() != null && this.f22617b.getTag().equals("6")) || ((view4 = this.f22617b) != null && view4.getTag() != null && this.f22617b.getTag().equals("7"))))) {
                            view.setBackground(null);
                            return;
                        }
                        View view19 = this.f22617b;
                        if (view19 != null && view19.getTag() != null && this.f22617b.getTag().equals("8")) {
                            return;
                        }
                        View view20 = this.f22617b;
                        if (view20 == null || view20.getTag() == null || !this.f22617b.getTag().equals("9")) {
                            View view21 = this.f22617b;
                            if (view21 == null || view21.getTag() == null || !this.f22617b.getTag().equals("10")) {
                                return;
                            }
                            view.setBackground(this.f22618c.getResources().getDrawable(2131231458));
                            m18284b(f10);
                            m18285c(f10);
                            m18283a(z10);
                            linearLayout = this.f22618c.ll_restart;
                        }
                    }
                    view.setBackground(this.f22618c.getResources().getDrawable(2131231458));
                    m18284b(f10);
                    m18285c(f10);
                    m18283a(z10);
                    return;
                }
                view.setBackground(this.f22618c.getResources().getDrawable(2131231458));
                m18284b(f10);
                m18285c(f10);
                m18283a(z10);
                linearLayout = this.f22618c.ll_audio_subtitle_settings;
            } else {
                view.setBackground(this.f22618c.getResources().getDrawable(2131231458));
                m18284b(f10);
                m18285c(f10);
                m18283a(z10);
                linearLayout = this.f22618c.ll_back;
            }
            linearLayout.setVisibility(8);
        }
    }

    public NSTIJKPlayerEPGActivity() {
        Boolean bool = Boolean.FALSE;
        this.f22518P0 = bool;
        this.f22524S0 = "";
        this.f22530V0 = bool;
        this.f22532W0 = "";
        this.f22534X0 = 0;
        this.f22551g1 = Boolean.TRUE;
        this.f22560j1 = bool;
        this.f22563k1 = bool;
        this.f22566l1 = bool;
        this.f22569m1 = bool;
        this.f22572n1 = bool;
        this.f22575o1 = bool;
        this.f22489D1 = "mobile";
        this.f22492E1 = "0";
        this.f22495F1 = "0";
        this.f22498G1 = 0;
    }

    /* renamed from: D0 */
    public static boolean m18243D0() {
        ProgressBar progressBar = f22477O1;
        return progressBar != null && progressBar.getVisibility() == 0;
    }

    /* renamed from: E0 */
    public static long m18244E0(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: H0 */
    public static String m18245H0(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    /* renamed from: A0 */
    public void m18253A0() {
        this.f22487D = new ArrayList<>();
        m18258I0();
        this.f22537Z = this.f22487D;
    }

    /* renamed from: B0 */
    public final void m18254B0(int i10) {
        if (f22476N1) {
            return;
        }
        this.f22526T0.f23568c1 = new RunnableC3750d(this);
        NSTIJKPlayerEPG nSTIJKPlayerEPG = this.f22526T0;
        nSTIJKPlayerEPG.f23566b1.postDelayed(nSTIJKPlayerEPG.f23568c1, i10);
    }

    /* renamed from: C0 */
    public void m18255C0(int i10) {
        if (f22476N1) {
            return;
        }
        this.f22526T0.f23568c1 = new RunnableC3749c(this);
        NSTIJKPlayerEPG nSTIJKPlayerEPG = this.f22526T0;
        nSTIJKPlayerEPG.f23566b1.postDelayed(nSTIJKPlayerEPG.f23568c1, i10);
    }

    /* renamed from: F0 */
    public final void m18256F0() {
        ImageView imageView = this.iv_play;
        imageView.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3751e(this, imageView));
        ImageView imageView2 = this.iv_pause;
        imageView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3751e(this, imageView2));
        ImageView imageView3 = this.iv_back;
        imageView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3751e(this, imageView3));
        ImageView imageView4 = this.iv_audio_subtitle_track;
        imageView4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3751e(this, imageView4));
        ImageView imageView5 = this.iv_hp_play_from_beginning;
        imageView5.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3751e(this, imageView5));
        LinearLayout linearLayout = this.ll_channels_list;
        linearLayout.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3751e(this, linearLayout));
        LinearLayout linearLayout2 = this.ll_crop;
        linearLayout2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3751e(this, linearLayout2));
        LinearLayout linearLayout3 = this.ll_multi_screen;
        linearLayout3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3751e(this, linearLayout3));
        ImageView imageView6 = this.iv_back_episodes;
        imageView6.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3751e(this, imageView6));
        ImageView imageView7 = this.iv_back_settings;
        imageView7.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3751e(this, imageView7));
        ImageView imageView8 = this.iv_hp_lock;
        imageView8.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3751e(this, imageView8));
        ImageView imageView9 = this.iv_hp_lock;
        imageView9.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3751e(this, imageView9));
    }

    /* renamed from: G0 */
    public void m18257G0() {
        if (this.f22526T0 != null) {
            m18268S0();
        }
        NSTIJKPlayerEPG nSTIJKPlayerEPG = this.f22526T0;
        ((nSTIJKPlayerEPG == null || !nSTIJKPlayerEPG.isPlaying()) ? this.f22546f : this.f22549g).requestFocus();
    }

    /* renamed from: I0 */
    public void m18258I0() {
        ArrayList<LiveStreamsDBModel> arrayList;
        if (this.f22521R.equals("m3u")) {
            LiveStreamDBHandler liveStreamDBHandler = this.f22499H;
            if (liveStreamDBHandler == null) {
                return;
            }
            ArrayList<FavouriteM3UModel> m15175K1 = liveStreamDBHandler.m15175K1("live");
            arrayList = new ArrayList<>();
            Iterator<FavouriteM3UModel> it = m15175K1.iterator();
            while (it.hasNext()) {
                FavouriteM3UModel next = it.next();
                ArrayList<LiveStreamsDBModel> m15183O1 = this.f22499H.m15183O1(next.m14775a(), next.m14777c());
                if (m15183O1 != null && m15183O1.size() > 0) {
                    arrayList.add(m15183O1.get(0));
                }
            }
            if (arrayList.size() == 0) {
                return;
            }
        } else {
            DatabaseHandler databaseHandler = this.f22604y0;
            if (databaseHandler == null) {
                return;
            }
            ArrayList<FavouriteDBModel> m15116v = databaseHandler.m15116v("live", SharepreferenceDBHandler.m15337A(this.f22542d));
            arrayList = new ArrayList<>();
            Iterator<FavouriteDBModel> it2 = m15116v.iterator();
            while (it2.hasNext()) {
                FavouriteDBModel next2 = it2.next();
                LiveStreamsDBModel m15179M1 = new LiveStreamDBHandler(this.f22542d).m15179M1(next2.m14760a(), String.valueOf(next2.m14764e()));
                if (m15179M1 != null) {
                    arrayList.add(m15179M1);
                }
            }
            if (arrayList.size() == 0) {
                return;
            }
        }
        this.f22487D = arrayList;
    }

    /* renamed from: J0 */
    public int m18259J0(ArrayList<LiveStreamsDBModel> arrayList, int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            i11 = 0;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (C5255e.m26215R(arrayList.get(i12).m14805L()) == i10) {
                i11 = i12;
                break;
            }
            i12++;
        }
        return i11;
    }

    /* renamed from: K0 */
    public final ArrayList<String> m18260K0() {
        ArrayList<PasswordStatusDBModel> m15232m1 = this.f22499H.m15232m1(SharepreferenceDBHandler.m15337A(this.f22542d));
        this.f22565l0 = m15232m1;
        if (m15232m1 != null) {
            Iterator<PasswordStatusDBModel> it = m15232m1.iterator();
            while (it.hasNext()) {
                PasswordStatusDBModel next = it.next();
                if (next.m15290a().equals("1")) {
                    this.f22559j0.add(next.m15291b());
                }
            }
        }
        return this.f22559j0;
    }

    /* renamed from: L0 */
    public int m18261L0(long j10, long j11, Context context) {
        if (context == null) {
            return 0;
        }
        long millis = LocalDateTime.now().toDateTime().getMillis();
        Long l10 = this.f22543d1;
        long j12 = millis;
        if (l10 != null) {
            j12 = millis + l10.longValue();
        }
        if (j10 >= j11 || j12 >= j11) {
            return 0;
        }
        if (j12 <= j10) {
            return 100;
        }
        return (int) (((j11 - j12) * 100) / (j11 - j10));
    }

    /* renamed from: M0 */
    public long m18262M0(Context context) {
        if (context == null) {
            return 0L;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("loginPrefs", 0);
        f22473K1 = sharedPreferences;
        if (sharedPreferences != null) {
            return C5255e.m26255v(sharedPreferences.getString("selectedEPGShift", C5251a.f30049k0));
        }
        return 0L;
    }

    /* renamed from: N0 */
    public final ArrayList<LiveStreamsDBModel> m18263N0(ArrayList<LiveStreamsDBModel> arrayList, ArrayList<String> arrayList2) {
        boolean z10;
        Iterator<LiveStreamsDBModel> it = arrayList.iterator();
        while (it.hasNext()) {
            LiveStreamsDBModel next = it.next();
            Iterator<String> it2 = arrayList2.iterator();
            while (true) {
                z10 = false;
                if (!it2.hasNext()) {
                    break;
                }
                if (next.m14827g().equals(it2.next())) {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                this.f22533X.add(next);
            }
        }
        return this.f22533X;
    }

    /* renamed from: O0 */
    public final boolean m18264O0(ArrayList<LiveStreamsDBModel> arrayList, ArrayList<String> arrayList2) {
        Iterator<LiveStreamsDBModel> it = arrayList.iterator();
        while (it.hasNext()) {
            LiveStreamsDBModel next = it.next();
            Iterator<String> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (next.m14827g().equals(it2.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: P0 */
    public final void m18265P0() {
        this.f22597w.setProgress(0);
        this.f22582r.setText(this.f22542d.getResources().getString(2132018252));
        this.f22585s.setText("");
        this.f22588t.setText(this.f22542d.getResources().getString(2132018186));
        this.f22591u.setText("");
    }

    /* renamed from: Q0 */
    public final void m18266Q0() {
        if (this.ll_player_header_footer.getVisibility() == 0) {
            this.ll_player_header_footer.startAnimation(this.f22480A1);
            if (this.ll_brightness.getVisibility() == 0) {
                this.ll_brightness.startAnimation(this.f22480A1);
            }
            if (!this.f22590t1.equals("true") && this.tv_seek_left.getVisibility() == 0) {
                this.tv_seek_left.startAnimation(this.f22480A1);
            }
            if (this.ll_pause_play.getVisibility() == 0) {
                this.ll_pause_play.startAnimation(this.f22480A1);
            }
            if (!this.f22590t1.equals("true") && this.tv_seek_right.getVisibility() == 0) {
                this.tv_seek_right.startAnimation(this.f22480A1);
            }
            if (this.ll_volume.getVisibility() == 0) {
                this.ll_volume.startAnimation(this.f22480A1);
            }
            this.ll_player_header_footer.setVisibility(8);
            if (this.ll_brightness.getVisibility() == 0) {
                this.ll_brightness.setVisibility(8);
            }
            if (!this.f22590t1.equals("true") && this.tv_seek_left.getVisibility() == 0) {
                this.tv_seek_left.setVisibility(8);
            }
            if (this.ll_pause_play.getVisibility() == 0) {
                this.ll_pause_play.setVisibility(8);
            }
            if (!this.f22590t1.equals("true") && this.tv_seek_right.getVisibility() == 0) {
                this.tv_seek_right.setVisibility(8);
            }
            if (this.ll_volume.getVisibility() == 0) {
                this.ll_volume.setVisibility(8);
            }
        }
    }

    /* renamed from: R0 */
    public void m18267R0() {
        if (f22476N1 || this.ll_player_header_footer.getVisibility() != 0) {
            return;
        }
        this.ll_player_header_footer.startAnimation(this.f22480A1);
        if (this.ll_brightness.getVisibility() == 0) {
            this.ll_brightness.startAnimation(this.f22480A1);
        }
        if (!this.f22590t1.equals("true") && this.tv_seek_left.getVisibility() == 0) {
            this.tv_seek_left.startAnimation(this.f22480A1);
        }
        if (this.ll_pause_play.getVisibility() == 0) {
            this.ll_pause_play.startAnimation(this.f22480A1);
        }
        if (!this.f22590t1.equals("true") && this.tv_seek_right.getVisibility() == 0) {
            this.tv_seek_right.startAnimation(this.f22480A1);
        }
        if (this.ll_volume.getVisibility() == 0) {
            this.ll_volume.startAnimation(this.f22480A1);
        }
        this.ll_player_header_footer.setVisibility(8);
        if (this.ll_brightness.getVisibility() == 0) {
            this.ll_brightness.setVisibility(8);
        }
        if (!this.f22590t1.equals("true") && this.tv_seek_left.getVisibility() == 0) {
            this.tv_seek_left.setVisibility(8);
        }
        if (this.ll_pause_play.getVisibility() == 0) {
            this.ll_pause_play.setVisibility(8);
        }
        if (!this.f22590t1.equals("true") && this.tv_seek_right.getVisibility() == 0) {
            this.tv_seek_right.setVisibility(8);
        }
        if (this.ll_volume.getVisibility() == 0) {
            this.ll_volume.setVisibility(8);
        }
    }

    /* renamed from: S0 */
    public final void m18268S0() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception e10) {
        }
    }

    /* renamed from: T0 */
    public boolean m18269T0(long j10, long j11, Context context) {
        if (context == null) {
            return false;
        }
        long millis = LocalDateTime.now().toDateTime().getMillis();
        Long l10 = this.f22543d1;
        long j12 = millis;
        if (l10 != null) {
            j12 = millis + l10.longValue();
        }
        return j10 <= j12 && j11 >= j12;
    }

    /* renamed from: V0 */
    public final void m18270V0() {
        this.f22597w.setProgress(0);
        this.f22582r.setText(this.f22542d.getResources().getString(2132018251));
        this.f22585s.setText("");
        this.f22588t.setText(this.f22542d.getResources().getString(2132018185));
        this.f22591u.setText("");
    }

    /* renamed from: W0 */
    public void m18271W0() {
        this.f22567m.setVisibility(0);
        this.f22570n.setText(this.f22542d.getResources().getString(2132018196));
        if (C5251a.f30048k.booleanValue()) {
            findViewById(2131429693).setVisibility(8);
        }
    }

    /* renamed from: X0 */
    public final void m18272X0() {
        this.iv_play.setOnClickListener(this);
        this.iv_pause.setOnClickListener(this);
        this.ll_back_click.setOnClickListener(this);
        this.iv_back.setOnClickListener(this);
        this.ll_audio_subtitle_settings_click.setOnClickListener(this);
        this.iv_audio_subtitle_track.setOnClickListener(this);
        this.ll_channels_list.setOnClickListener(this);
        this.ll_crop.setOnClickListener(this);
        this.ll_multi_screen.setOnClickListener(this);
        this.iv_back_episodes.setOnClickListener(this);
        this.iv_back_settings.setOnClickListener(this);
        this.ll_hp_lock_click.setOnClickListener(this);
        this.iv_unlock_button.setOnClickListener(this);
        this.iv_hp_play_from_beginning.setOnClickListener(this);
    }

    /* renamed from: Y0 */
    public final void m18273Y0(ArrayList<LiveStreamsDBModel> arrayList, int i10) {
        NSTIJKPlayerEPG nSTIJKPlayerEPG;
        Uri parse;
        String str;
        String str2;
        if (arrayList == null || arrayList.size() <= 0 || this.f22508K0 >= arrayList.size()) {
            return;
        }
        if (this.f22508K0 == 0) {
            this.f22508K0 = m18259J0(arrayList, i10);
        }
        String name = arrayList.get(this.f22508K0).getName();
        String m14805L = arrayList.get(this.f22508K0).m14805L();
        int m26214Q = C5255e.m26214Q(arrayList.get(this.f22508K0).m14811R());
        String m14816W = arrayList.get(this.f22508K0).m14816W();
        String m26247n0 = C5255e.m26247n0(C7711g.m33686a() + C7711g.m33687i());
        String m14798E = arrayList.get(this.f22508K0).m14798E();
        String m14810Q = arrayList.get(this.f22508K0).m14810Q();
        try {
            if (m14810Q.equals("") || m14810Q.isEmpty()) {
                this.f22579q.setImageDrawable(this.f22542d.getResources().getDrawable(2131231571));
            } else {
                C10014t.m42105q(this.f22542d).m42116l(m14810Q).m42154j(2131231571).m42148d(2131231571).m42151g(this.f22579q);
            }
        } catch (Exception e10) {
            this.f22579q.setImageDrawable(this.f22542d.getResources().getDrawable(2131231571));
        }
        SharedPreferences.Editor editor = this.f22607z0;
        if (editor != null) {
            editor.putString("currentlyPlayingVideo", String.valueOf(arrayList.get(this.f22508K0).m14811R()));
            this.f22607z0.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(arrayList.get(this.f22508K0).m14816W()));
            this.f22607z0.apply();
        }
        SharedPreferences.Editor editor2 = this.f22479A0;
        if (editor2 != null) {
            editor2.putInt("currentlyPlayingVideoPosition", this.f22508K0);
            this.f22479A0.apply();
        }
        this.f22601x0 = m26214Q;
        this.f22526T0.setTitle(m14805L + " - " + name);
        this.f22526T0.setCurrentWindowIndex(this.f22508K0);
        SimpleDateFormat simpleDateFormat = this.f22587s1;
        if (m18244E0(simpleDateFormat, simpleDateFormat.format(new Date(C7709e.m33680a(this.f22542d))), this.f22522R0.format(this.f22557i1)) >= C7707c.m33667p() && (str = this.f22528U0) != null && this.f22536Y0 != null && (!f22475M1.equals(str) || (this.f22528U0 != null && (str2 = this.f22536Y0) != null && !f22474L1.equals(str2)))) {
            this.f22551g1 = Boolean.FALSE;
            this.f22584r1.m37067a(2131427519).m37070d();
            this.f22584r1.m37067a(2131427523).m37068b(m26247n0 + this.f22548f1 + this.f22541c1);
        }
        try {
            if (this.f22551g1.booleanValue()) {
                if (this.f22521R.equals("m3u")) {
                    nSTIJKPlayerEPG = this.f22526T0;
                    parse = Uri.parse(m14816W);
                } else {
                    nSTIJKPlayerEPG = this.f22526T0;
                    parse = Uri.parse(this.f22544e + m26214Q + this.f22519Q);
                }
                nSTIJKPlayerEPG.m18778b1(parse, this.f22580q0, name);
                NSTIJKPlayerEPG nSTIJKPlayerEPG2 = this.f22526T0;
                nSTIJKPlayerEPG2.f23515I = 0;
                nSTIJKPlayerEPG2.f23521K = false;
                this.f22494F0.removeCallbacksAndMessages(null);
                m18270V0();
                this.f22494F0.postDelayed(new RunnableC3747a(this, m14798E, m14810Q), 300L);
            }
        } catch (Exception e11) {
        }
    }

    /* renamed from: Z0 */
    public final void m18274Z0() {
        try {
            NSTIJKPlayerEPG nSTIJKPlayerEPG = this.f22526T0;
            if (nSTIJKPlayerEPG != null) {
                if (nSTIJKPlayerEPG.m18769S0()) {
                    this.f22526T0.m18762L0();
                } else {
                    this.f22526T0.m18786j1();
                    this.f22526T0.m18772V0(true);
                    this.f22526T0.m18783g1();
                }
                IjkMediaPlayer.native_profileEnd();
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: a1 */
    public void m18275a1() {
        if (f22476N1 || this.ll_player_header_footer.getVisibility() != 8) {
            return;
        }
        this.ll_player_header_footer.startAnimation(this.f22608z1);
        this.ll_player_header_footer.setVisibility(0);
    }

    /* renamed from: b1 */
    public void m18276b1() {
        if (f22476N1 || this.ll_player_header_footer.getVisibility() != 8) {
            return;
        }
        this.ll_player_header_footer.startAnimation(this.f22608z1);
        this.ll_player_header_footer.setVisibility(0);
        if (this.ll_brightness.getVisibility() == 8) {
            this.ll_brightness.startAnimation(this.f22608z1);
            this.ll_brightness.setVisibility(0);
        }
        if (!this.f22590t1.equals("true") && this.tv_seek_left.getVisibility() == 8) {
            this.tv_seek_left.startAnimation(this.f22608z1);
            this.tv_seek_left.setVisibility(0);
        }
        if (this.ll_pause_play.getVisibility() == 8) {
            this.ll_pause_play.startAnimation(this.f22608z1);
            this.ll_pause_play.setVisibility(0);
        }
        if (!this.f22590t1.equals("true") && this.tv_seek_right.getVisibility() == 8) {
            this.tv_seek_right.startAnimation(this.f22608z1);
            this.tv_seek_right.setVisibility(0);
        }
        if (this.ll_volume.getVisibility() == 8) {
            this.ll_volume.startAnimation(this.f22608z1);
            this.ll_volume.setVisibility(0);
        }
    }

    /* renamed from: c1 */
    public final void m18277c1() {
        if (this.rl_settings_box.getVisibility() == 8) {
            this.rl_settings_box.startAnimation(this.f22483B1);
            this.rl_settings_box.setVisibility(0);
            this.iv_back_settings.requestFocus();
        }
    }

    /* renamed from: d1 */
    public void m18278d1() {
        Handler handler;
        if (f22476N1 || (handler = this.f22526T0.f23566b1) == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    /* renamed from: e1 */
    public final void m18279e1() {
        m18278d1();
        if (this.ll_player_header_footer.getVisibility() == 0) {
            m18266Q0();
        } else {
            m18275a1();
            m18254B0(TFTP.DEFAULT_TIMEOUT);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x006a  */
    /* renamed from: f1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m18280f1(java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerEPGActivity.m18280f1(java.lang.String, java.lang.String):void");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        RelativeLayout relativeLayout;
        try {
            m18278d1();
            relativeLayout = this.rl_episodes_box;
        } catch (Exception e10) {
        }
        if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
            this.rl_episodes_box.startAnimation(this.f22504I1);
            this.rl_episodes_box.setVisibility(8);
            return;
        }
        if (this.rl_settings_box.getVisibility() == 0) {
            this.rl_settings_box.startAnimation(this.f22486C1);
            this.rl_settings_box.setVisibility(8);
            return;
        }
        if (this.f22580q0 && this.ll_player_header_footer.getVisibility() == 0) {
            this.ll_player_header_footer.startAnimation(this.f22480A1);
            if (this.ll_brightness.getVisibility() == 0) {
                this.ll_brightness.startAnimation(this.f22480A1);
            }
            if (!this.f22590t1.equals("true") && this.tv_seek_left.getVisibility() == 0) {
                this.tv_seek_left.startAnimation(this.f22480A1);
            }
            if (this.ll_pause_play.getVisibility() == 0) {
                this.ll_pause_play.startAnimation(this.f22480A1);
            }
            if (!this.f22590t1.equals("true") && this.tv_seek_right.getVisibility() == 0) {
                this.tv_seek_right.startAnimation(this.f22480A1);
            }
            if (this.ll_volume.getVisibility() == 0) {
                this.ll_volume.startAnimation(this.f22480A1);
            }
            this.ll_player_header_footer.setVisibility(8);
            if (this.ll_brightness.getVisibility() == 0) {
                this.ll_brightness.setVisibility(8);
            }
            if (!this.f22590t1.equals("true") && this.tv_seek_left.getVisibility() == 0) {
                this.tv_seek_left.setVisibility(8);
            }
            if (this.ll_pause_play.getVisibility() == 0) {
                this.ll_pause_play.setVisibility(8);
            }
            if (!this.f22590t1.equals("true") && this.tv_seek_right.getVisibility() == 0) {
                this.tv_seek_right.setVisibility(8);
            }
            if (this.ll_volume.getVisibility() == 0) {
                this.ll_volume.setVisibility(8);
                return;
            }
            return;
        }
        super.onBackPressed();
        overridePendingTransition(2130772003, 2130772000);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ImageView imageView;
        ImageView imageView2;
        switch (view.getId()) {
            case 2131428142:
            case 2131428330:
                m18278d1();
                m18266Q0();
                m18277c1();
                return;
            case 2131428144:
            case 2131428333:
            case 2131428445:
                onBackPressed();
                break;
            case 2131428148:
            case 2131428150:
                break;
            case 2131428207:
                try {
                    if (this.f22489D1.equals("tv")) {
                        m18278d1();
                        m18275a1();
                        this.f22526T0.pause();
                        this.iv_pause.setVisibility(8);
                        this.iv_play.setVisibility(0);
                        this.iv_play.requestFocus();
                    } else {
                        m18278d1();
                        m18276b1();
                        this.f22526T0.pause();
                        this.iv_pause.setVisibility(8);
                        this.iv_play.setVisibility(0);
                    }
                    return;
                } catch (Exception e10) {
                    Log.e("NSTIJPLAYERACTIVTY", "exection " + e10);
                    return;
                }
            case 2131428208:
                if (!this.f22489D1.equals("tv")) {
                    boolean playerIsPrepared = this.f22526T0.getPlayerIsPrepared();
                    m18278d1();
                    m18276b1();
                    if (playerIsPrepared) {
                        m18255C0(1000);
                        this.f22526T0.start();
                        this.iv_play.setVisibility(8);
                        imageView = this.iv_pause;
                    } else {
                        m18255C0(TFTP.DEFAULT_TIMEOUT);
                        imageView = this.iv_play;
                    }
                    imageView.setVisibility(0);
                    return;
                }
                boolean playerIsPrepared2 = this.f22526T0.getPlayerIsPrepared();
                m18278d1();
                m18275a1();
                if (playerIsPrepared2) {
                    m18254B0(1000);
                    this.f22526T0.start();
                    this.iv_play.setVisibility(8);
                    this.iv_pause.setVisibility(0);
                    imageView2 = this.iv_pause;
                } else {
                    m18254B0(TFTP.DEFAULT_TIMEOUT);
                    this.iv_play.setVisibility(0);
                    imageView2 = this.iv_play;
                }
                imageView2.requestFocus();
                return;
            case 2131428238:
                m18278d1();
                f22476N1 = false;
                this.ll_screen_locked.startAnimation(this.f22596v1);
                this.ll_screen_locked.setVisibility(8);
                m18276b1();
                m18255C0(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
                return;
            case 2131428358:
                m18278d1();
                m18266Q0();
                return;
            case 2131428363:
                m18278d1();
                m18254B0(TFTP.DEFAULT_TIMEOUT);
                NSTIJKPlayerEPG nSTIJKPlayerEPG = this.f22526T0;
                if (nSTIJKPlayerEPG != null) {
                    nSTIJKPlayerEPG.m18789m1();
                    return;
                }
                return;
            case 2131428418:
                m18278d1();
                m18266Q0();
                f22476N1 = true;
                this.f22526T0.m18780d1();
                this.f22526T0.m18757G0(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
                return;
            default:
                return;
        }
        onBackPressed();
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(37:0|1|(1:3)(1:132)|4|(1:6)(1:131)|7|(4:9|10|20|21)(1:130)|30|(24:95|(2:105|(1:113))(1:103)|104|39|(1:41)(1:94)|42|(2:91|(1:93))(2:46|(1:48))|49|(4:85|(1:87)|88|(1:90))(2:53|(1:55))|56|57|58|59|(1:61)|62|(1:64)|65|(1:67)|68|(1:72)|73|(2:75|(1:77)(1:81))(1:82)|78|79)|38|39|(0)(0)|42|(1:44)|91|(0)|49|(1:51)|85|(0)|88|(0)|56|57|58|59|(0)|62|(0)|65|(0)|68|(2:70|72)|73|(0)(0)|78|79) */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0962  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0982  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0b2a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0b48  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x05c6  */
    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r35) {
        /*
            Method dump skipped, instructions count: 2933
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerEPGActivity.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            if (this.f22526T0 != null) {
                m18274Z0();
            }
        } catch (Exception e10) {
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        View view;
        StringBuilder sb2;
        int i11;
        boolean z10 = keyEvent.getRepeatCount() == 0;
        if (i10 != 62) {
            if (i10 != 66) {
                if (i10 != 79) {
                    if (i10 == 82) {
                        Menu menu = this.f22520Q0;
                        if (menu == null) {
                            return true;
                        }
                        menu.performIdentifierAction(2131427886, 0);
                        return true;
                    }
                    if (i10 != 85) {
                        if (i10 != 86) {
                            if (i10 == 126) {
                                if (!z10 || this.f22526T0.isPlaying()) {
                                    return true;
                                }
                                this.f22526T0.start();
                                this.f22549g.requestFocus();
                                return true;
                            }
                            if (i10 != 127) {
                                switch (i10) {
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                        String str = this.f22590t1;
                                        if (str == null || !str.equals("false") || !this.f22580q0) {
                                            return true;
                                        }
                                        this.f22497G0.removeCallbacksAndMessages(null);
                                        if (i10 == 7) {
                                            this.f22510L0.append(0);
                                        } else if (i10 == 8) {
                                            this.f22510L0.append(1);
                                        } else {
                                            if (i10 == 9) {
                                                sb2 = this.f22510L0;
                                                i11 = 2;
                                            } else if (i10 == 10) {
                                                sb2 = this.f22510L0;
                                                i11 = 3;
                                            } else if (i10 == 11) {
                                                sb2 = this.f22510L0;
                                                i11 = 4;
                                            } else if (i10 == 12) {
                                                sb2 = this.f22510L0;
                                                i11 = 5;
                                            } else if (i10 == 13) {
                                                sb2 = this.f22510L0;
                                                i11 = 6;
                                            } else if (i10 == 14) {
                                                sb2 = this.f22510L0;
                                                i11 = 7;
                                            } else if (i10 == 15) {
                                                this.f22510L0.append(8);
                                            } else if (i10 == 16) {
                                                this.f22510L0.append(9);
                                            }
                                            sb2.append(i11);
                                        }
                                        this.f22514N0.setText(this.f22510L0.toString());
                                        this.f22512M0.setVisibility(0);
                                        this.f22497G0.postDelayed(new RunnableC3748b(this), 3000L);
                                        return true;
                                    default:
                                        switch (i10) {
                                            case 19:
                                            case 20:
                                            case 21:
                                            case 22:
                                                m18278d1();
                                                m18254B0(TFTP.DEFAULT_TIMEOUT);
                                                return true;
                                            case 23:
                                                break;
                                            default:
                                                return super.onKeyUp(i10, keyEvent);
                                        }
                                }
                            }
                        }
                        if (!z10 || !this.f22526T0.isPlaying()) {
                            return true;
                        }
                        this.f22526T0.pause();
                        this.f22546f.requestFocus();
                        return true;
                    }
                }
            }
            if (!this.f22580q0) {
                return true;
            }
            NSTIJKPlayerEPG nSTIJKPlayerEPG = this.f22526T0;
            if (nSTIJKPlayerEPG == null || !nSTIJKPlayerEPG.getPlayerIsPrepared()) {
                m18279e1();
                return true;
            }
            if (this.rl_settings_box.getVisibility() != 8) {
                return true;
            }
            m18279e1();
            (this.f22526T0.isPlaying() ? this.iv_pause : this.iv_play).requestFocus();
            return true;
        }
        if (!z10 || this.f22526T0.isPlaying()) {
            this.f22526T0.pause();
            view = this.f22546f;
        } else {
            this.f22526T0.start();
            view = this.f22549g;
        }
        view.requestFocus();
        return true;
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (r0.size() != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0095, code lost:
    
        m18273Y0(r4.f22537Z, r4.f22534X0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        if (r0.size() != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0092, code lost:
    
        if (r0.size() != 0) goto L31;
     */
    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            r4 = this;
            r0 = r4
            super.onResume()
            r0 = r4
            com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG r0 = r0.f22526T0
            if (r0 == 0) goto Lf
            r0 = r4
            r0.m18268S0()
        Lf:
            r0 = r4
            java.lang.String r0 = r0.f22595v0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L46
            r0 = r5
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L46
            r0 = r4
            java.lang.String r0 = r0.f22595v0
            java.lang.String r1 = "0"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
            r0 = r4
            r0.m18281x0()
            r0 = r4
            java.util.ArrayList<com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel> r0 = r0.f22537Z
            r5 = r0
            r0 = r5
            if (r0 == 0) goto La4
            r0 = r5
            int r0 = r0.size()
            if (r0 == 0) goto La4
            goto L95
        L46:
            r0 = r4
            java.lang.String r0 = r0.f22595v0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L7d
            r0 = r5
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7d
            r0 = r4
            java.lang.String r0 = r0.f22595v0
            java.lang.String r1 = "-1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7d
            r0 = r4
            r0.m18253A0()
            r0 = r4
            java.util.ArrayList<com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel> r0 = r0.f22537Z
            r5 = r0
            r0 = r5
            if (r0 == 0) goto La4
            r0 = r5
            int r0 = r0.size()
            if (r0 == 0) goto La4
            goto L95
        L7d:
            r0 = r4
            r1 = r4
            java.lang.String r1 = r1.f22595v0
            r0.m18282z0(r1)
            r0 = r4
            java.util.ArrayList<com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel> r0 = r0.f22537Z
            r5 = r0
            r0 = r5
            if (r0 == 0) goto La4
            r0 = r5
            int r0 = r0.size()
            if (r0 == 0) goto La4
        L95:
            r0 = r4
            r1 = r4
            java.util.ArrayList<com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel> r1 = r1.f22537Z
            r2 = r4
            int r2 = r2.f22534X0
            r0.m18273Y0(r1, r2)
            goto La8
        La4:
            r0 = r4
            r0.m18271W0()
        La8:
            r0 = r4
            r0.m18257G0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerEPGActivity.onResume():void");
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onStop() {
        super.onStop();
        try {
            NSTIJKPlayerEPG nSTIJKPlayerEPG = this.f22526T0;
            if (nSTIJKPlayerEPG != null) {
                nSTIJKPlayerEPG.m18763M0(Boolean.valueOf(this.f22580q0));
                m18274Z0();
            }
        } catch (Exception e10) {
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    public void toggleView(View view) {
        if (view.getVisibility() == 8) {
            view.setVisibility(0);
        } else if (view.getVisibility() == 0) {
            view.setVisibility(8);
        }
    }

    /* renamed from: x0 */
    public void m18281x0() {
        int m15189R1 = this.f22499H.m15189R1(SharepreferenceDBHandler.m15337A(this.f22542d));
        ArrayList<LiveStreamsDBModel> m15219g1 = this.f22499H.m15219g1("0", "live");
        this.f22484C = m15219g1;
        if (m15189R1 <= 0 || m15219g1 == null) {
            this.f22537Z = m15219g1;
            return;
        }
        ArrayList<String> arrayList = this.f22559j0;
        if (arrayList != null) {
            this.f22535Y = m18263N0(m15219g1, arrayList);
        }
        this.f22537Z = this.f22535Y;
    }

    /* renamed from: z0 */
    public void m18282z0(String str) {
        LiveStreamDBHandler liveStreamDBHandler = this.f22499H;
        if (liveStreamDBHandler != null) {
            this.f22550g0 = liveStreamDBHandler.m15219g1(str, "live");
        }
        this.f22537Z = this.f22550g0;
    }
}

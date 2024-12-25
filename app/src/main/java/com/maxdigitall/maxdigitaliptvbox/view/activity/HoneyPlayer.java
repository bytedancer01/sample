package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.AppOpsManager;
import android.app.PendingIntent;
import android.app.PictureInPictureParams$Builder;
import android.app.RemoteAction;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.util.Log;
import android.util.Rational;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.app.DialogC0242a;
import androidx.mediarouter.app.MediaRouteButton;
import androidx.recyclerview.widget.C0704c;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.services.p045s3.internal.Constants;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import com.google.android.gms.cast.MediaInfo;
import com.maxdigitall.maxdigitaliptvbox.miscelleneious.chromecastfeature.ExpandedControlsActivity;
import com.maxdigitall.maxdigitaliptvbox.model.EpisodesUsingSinglton;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.VodAllCategoriesSingleton;
import com.maxdigitall.maxdigitaliptvbox.model.callback.GetEpisdoeDetailsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.RecentWatchDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SeriesRecentWatchDatabase;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.PanelAvailableChannelsPojo;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.EpisodeDetailAdapter;
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.net.tftp.TFTP;
import org.apache.http.HttpHost;
import org.apache.http.client.config.CookieSpecs;
import p082ef.C4718a;
import p082ef.C4720c;
import p151if.C5251a;
import p151if.C5255e;
import p189kf.C5602m;
import p216m9.C5935a;
import p216m9.C5938b;
import p216m9.C5947e;
import p216m9.InterfaceC5993u;
import p290qf.C7920a;
import p331t5.C8632a;
import p428yg.InterfaceC9996e;
import pf.C7707c;
import pf.C7709e;
import pf.C7711g;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/HoneyPlayer.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/HoneyPlayer.class */
public class HoneyPlayer extends ActivityC0243b implements View.OnClickListener {

    /* renamed from: i1 */
    public static String f17262i1;

    /* renamed from: j1 */
    public static String f17263j1;

    /* renamed from: k1 */
    public static ProgressBar f17264k1;

    /* renamed from: l1 */
    public static boolean f17265l1 = true;

    /* renamed from: m1 */
    public static boolean f17266m1 = false;

    /* renamed from: n1 */
    public static boolean f17267n1 = true;

    /* renamed from: A */
    public SharedPreferences f17268A;

    /* renamed from: B */
    public SharedPreferences f17270B;

    /* renamed from: B0 */
    public SharedPreferences f17271B0;

    /* renamed from: C */
    public SharedPreferences f17272C;

    /* renamed from: C0 */
    public SharedPreferences.Editor f17273C0;

    /* renamed from: D */
    public SharedPreferences.Editor f17274D;

    /* renamed from: E */
    public SharedPreferences f17276E;

    /* renamed from: F */
    public SharedPreferences f17278F;

    /* renamed from: G */
    public SharedPreferences f17280G;

    /* renamed from: H */
    public SharedPreferences f17282H;

    /* renamed from: H0 */
    public SharedPreferences f17283H0;

    /* renamed from: I */
    public SharedPreferences f17284I;

    /* renamed from: I0 */
    public SharedPreferences.Editor f17285I0;

    /* renamed from: J */
    public SharedPreferences f17286J;

    /* renamed from: J0 */
    public SharedPreferences f17287J0;

    /* renamed from: K */
    public SharedPreferences.Editor f17288K;

    /* renamed from: K0 */
    public C5947e f17289K0;

    /* renamed from: L */
    public SharedPreferences.Editor f17290L;

    /* renamed from: L0 */
    public C5938b f17291L0;

    /* renamed from: M */
    public SharedPreferences.Editor f17292M;

    /* renamed from: N */
    public SharedPreferences.Editor f17294N;

    /* renamed from: O */
    public SharedPreferences.Editor f17296O;

    /* renamed from: P */
    public String f17298P;

    /* renamed from: Q */
    public String f17300Q;

    /* renamed from: R */
    public String f17302R;

    /* renamed from: S */
    public LiveStreamDBHandler f17304S;

    /* renamed from: T */
    public ArrayList<LiveStreamsDBModel> f17306T;

    /* renamed from: T0 */
    public InterfaceC5993u<C5947e> f17307T0;

    /* renamed from: U */
    public ArrayList<LiveStreamsDBModel> f17308U;

    /* renamed from: U0 */
    public ArrayList<GetEpisdoeDetailsCallback> f17309U0;

    /* renamed from: V */
    public List<GetEpisdoeDetailsCallback> f17310V;

    /* renamed from: V0 */
    public Handler f17311V0;

    /* renamed from: W0 */
    public Runnable f17313W0;

    /* renamed from: X */
    public int f17314X;

    /* renamed from: X0 */
    public DialogC0242a f17315X0;

    /* renamed from: Y0 */
    public BroadcastReceiver f17317Y0;

    /* renamed from: Z */
    public SimpleDateFormat f17318Z;

    /* renamed from: b1 */
    public PictureInPictureParams$Builder f17321b1;

    /* renamed from: c1 */
    public ArrayList<File> f17322c1;

    @BindView
    public TextView cancel_autoplay;

    @BindView
    public MediaRouteButton cast_button;

    /* renamed from: e1 */
    public SharedPreferences f17326e1;

    /* renamed from: f0 */
    public Date f17328f0;

    @BindView
    public FrameLayout fl_seek_left;

    @BindView
    public FrameLayout fl_seek_right;

    @BindView
    public FrameLayout fl_sub_font_size;

    /* renamed from: g0 */
    public DateFormat f17331g0;

    /* renamed from: h0 */
    public String f17334h0;

    @BindView
    public SeekBar hp_seekbar;

    /* renamed from: i */
    public EpisodeDetailAdapter f17336i;

    /* renamed from: i0 */
    public String f17337i0;

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
    public ImageView iv_movie_poster_box;

    @BindView
    public ImageView iv_next_episode;

    @BindView
    public ImageView iv_pause;

    @BindView
    public ImageView iv_play;

    @BindView
    public ImageView iv_playback;

    @BindView
    public ImageView iv_unlock_button;

    /* renamed from: j */
    public RecyclerView.AbstractC0685p f17338j;

    /* renamed from: j0 */
    public String f17339j0;

    /* renamed from: k */
    public Context f17340k;

    /* renamed from: k0 */
    public String f17341k0;

    /* renamed from: l */
    public Animation f17342l;

    @BindView
    public LinearLayout ll_aspect_ratio;

    @BindView
    public LinearLayout ll_audio_subtitle_settings;

    @BindView
    public LinearLayout ll_audio_subtitle_settings_click;

    @BindView
    public LinearLayout ll_auto_play_next_episode;

    @BindView
    public LinearLayout ll_back;

    @BindView
    public LinearLayout ll_back_click;

    @BindView
    public LinearLayout ll_brightness;

    @BindView
    public LinearLayout ll_casting_to_tv;

    @BindView
    public LinearLayout ll_chromecast_click;

    @BindView
    public LinearLayout ll_crop;

    @BindView
    public LinearLayout ll_episodes;

    @BindView
    public LinearLayout ll_hp_lock_click;

    @BindView
    public LinearLayout ll_next_episode;

    @BindView
    public LinearLayout ll_pause_play;

    @BindView
    public LinearLayout ll_play_button_main_layout;

    @BindView
    public LinearLayout ll_playback_speed;

    @BindView
    public LinearLayout ll_player_footer;

    @BindView
    public LinearLayout ll_player_header;

    @BindView
    public LinearLayout ll_restart;

    @BindView
    public LinearLayout ll_screen_locked;

    @BindView
    public LinearLayout ll_season_button_main_layout;

    @BindView
    public LinearLayout ll_volume;

    /* renamed from: m */
    public Animation f17344m;

    @BindView
    public TableLayout mHudView;

    @BindView
    public NSTIJKPlayerEpisodes mVideoView;

    @BindView
    public RecyclerView myRecyclerView;

    /* renamed from: n */
    public Animation f17346n;

    @BindView
    public TextView no_audio_track;

    @BindView
    public TextView no_subtitle_track;

    @BindView
    public TextView no_video_track;

    /* renamed from: o */
    public Animation f17348o;

    /* renamed from: p */
    public Animation f17350p;

    /* renamed from: q */
    public Animation f17352q;

    /* renamed from: r */
    public Animation f17354r;

    @BindView
    public RadioGroup rg_audio;

    @BindView
    public RadioGroup rg_subtitle;

    @BindView
    public RadioGroup rg_video;

    @BindView
    public RelativeLayout rl_episodes_box;

    @BindView
    public RelativeLayout rl_movie_poster_box;

    @BindView
    public RelativeLayout rl_next_episode;

    @BindView
    public RelativeLayout rl_settings_box;

    /* renamed from: s */
    public Animation f17356s;

    @BindView
    public SeekBar sb_brightness;

    @BindView
    public SeekBar sb_volume;

    /* renamed from: t */
    public Animation f17358t;

    @BindView
    public TextView tv_autoplay_next_episode_button;

    @BindView
    public TextView tv_brightness;

    @BindView
    public TextView tv_casting_status_text;

    @BindView
    public TextView tv_current_season;

    @BindView
    public TextView tv_end_time;

    @BindView
    public TextView tv_episode_name;

    @BindView
    public TextView tv_seconds_left;

    @BindView
    public TextView tv_seek_count_left;

    @BindView
    public TextView tv_seek_count_right;

    @BindView
    public TextView tv_seek_left;

    @BindView
    public TextView tv_seek_right;

    @BindView
    public TextView tv_speed;

    @BindView
    public TextView tv_start_time;

    @BindView
    public TextView tv_sub_font_size;

    @BindView
    public TextView tv_volume;

    /* renamed from: u */
    public Handler f17360u;

    /* renamed from: u0 */
    public C8632a f17361u0;

    /* renamed from: v */
    public String f17362v;

    /* renamed from: v0 */
    public LinearLayout f17363v0;

    /* renamed from: w0 */
    public SharedPreferences f17365w0;

    /* renamed from: x */
    public SeriesRecentWatchDatabase f17366x;

    /* renamed from: y */
    public RecentWatchDBHandler f17368y;

    /* renamed from: z */
    public C5602m f17370z;

    /* renamed from: d */
    public boolean f17323d = false;

    /* renamed from: e */
    public boolean f17325e = false;

    /* renamed from: f */
    public boolean f17327f = false;

    /* renamed from: g */
    public int f17330g = 0;

    /* renamed from: h */
    public List<GetEpisdoeDetailsCallback> f17333h = new ArrayList();

    /* renamed from: w */
    public String f17364w = "";

    /* renamed from: W */
    public String f17312W = "";

    /* renamed from: Y */
    public Boolean f17316Y = Boolean.TRUE;

    /* renamed from: l0 */
    public int f17343l0 = -1;

    /* renamed from: m0 */
    public int f17345m0 = -1;

    /* renamed from: n0 */
    public int f17347n0 = 0;

    /* renamed from: o0 */
    public String f17349o0 = "";

    /* renamed from: p0 */
    public String f17351p0 = "";

    /* renamed from: q0 */
    public String f17353q0 = "";

    /* renamed from: r0 */
    public String f17355r0 = "";

    /* renamed from: s0 */
    public String f17357s0 = "";

    /* renamed from: t0 */
    public String f17359t0 = "";

    /* renamed from: x0 */
    public String f17367x0 = "";

    /* renamed from: y0 */
    public String f17369y0 = "";

    /* renamed from: z0 */
    public String f17371z0 = "";

    /* renamed from: A0 */
    public String f17269A0 = "";

    /* renamed from: D0 */
    public int f17275D0 = 0;

    /* renamed from: E0 */
    public float f17277E0 = -1.0f;

    /* renamed from: F0 */
    public boolean f17279F0 = false;

    /* renamed from: G0 */
    public String f17281G0 = "mobile";

    /* renamed from: M0 */
    public String f17293M0 = "";

    /* renamed from: N0 */
    public String f17295N0 = "";

    /* renamed from: O0 */
    public String f17297O0 = "";

    /* renamed from: P0 */
    public String f17299P0 = "";

    /* renamed from: Q0 */
    public int f17301Q0 = 0;

    /* renamed from: R0 */
    public int f17303R0 = 0;

    /* renamed from: S0 */
    public int f17305S0 = 0;

    /* renamed from: Z0 */
    public boolean f17319Z0 = false;

    /* renamed from: a1 */
    public boolean f17320a1 = false;

    /* renamed from: d1 */
    public ArrayList<File> f17324d1 = new ArrayList<>();

    /* renamed from: f1 */
    public boolean f17329f1 = C5251a.f30033c0;

    /* renamed from: g1 */
    public final C4720c f17332g1 = new C4720c(this);

    /* renamed from: h1 */
    public NSTIJKPlayerEpisodes.AbstractC3878g0 f17335h1 = new C2790g(this);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/HoneyPlayer$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.HoneyPlayer$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/HoneyPlayer$a.class */
    public class C2784a implements InterfaceC9996e {

        /* renamed from: a */
        public final HoneyPlayer f17372a;

        public C2784a(HoneyPlayer honeyPlayer) {
            this.f17372a = honeyPlayer;
        }

        @Override // p428yg.InterfaceC9996e
        /* renamed from: a */
        public void mo15848a() {
            this.f17372a.m15844w1();
        }

        @Override // p428yg.InterfaceC9996e
        public void onSuccess() {
            RelativeLayout relativeLayout = this.f17372a.rl_movie_poster_box;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/HoneyPlayer$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.HoneyPlayer$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/HoneyPlayer$b.class */
    public class C2785b implements InterfaceC5993u<C5947e> {

        /* renamed from: a */
        public final HoneyPlayer f17373a;

        public C2785b(HoneyPlayer honeyPlayer) {
            this.f17373a = honeyPlayer;
        }

        /* renamed from: c */
        public final void m15849c(C5947e c5947e) {
            this.f17373a.f17289K0 = c5947e;
            try {
                String m15403z = SharepreferenceDBHandler.m15403z(this.f17373a.f17340k);
                if ((m15403z == null || !m15403z.equals("local")) && ((m15403z == null || !m15403z.equals("devicedata")) && (m15403z == null || !m15403z.equals("loadurl")))) {
                    String str = "";
                    if (m15403z != null) {
                        str = "";
                        if (m15403z.equals("series")) {
                            str = this.f17373a.getResources().getString(2132018529) + " - " + this.f17373a.f17299P0;
                        }
                    }
                    MediaInfo m23741a = C4718a.m23741a(this.f17373a.f17295N0, str, "", 0, this.f17373a.f17293M0, "videos/mp4", this.f17373a.f17297O0, "", null);
                    NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f17373a.mVideoView;
                    if (nSTIJKPlayerEpisodes != null) {
                        if (nSTIJKPlayerEpisodes.getCurrentPosition() != 0) {
                            HoneyPlayer honeyPlayer = this.f17373a;
                            honeyPlayer.f17301Q0 = honeyPlayer.mVideoView.getCurrentPosition();
                        }
                        C4718a.m23743c(this.f17373a.f17301Q0, true, m23741a, this.f17373a.f17289K0, this.f17373a.f17340k);
                    }
                } else {
                    this.f17373a.m15826e1();
                }
            } catch (Exception e10) {
                Log.e("honey", "onApplicationConnected: " + e10.getMessage());
            }
            this.f17373a.invalidateOptionsMenu();
        }

        /* renamed from: g */
        public final void m15850g() {
            this.f17373a.invalidateOptionsMenu();
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo14735a(C5947e c5947e, int i10) {
            m15850g();
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo14736b(C5947e c5947e) {
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo14740f(C5947e c5947e, int i10) {
            m15850g();
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo14744j(C5947e c5947e, boolean z10) {
            m15849c(c5947e);
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo14746l(C5947e c5947e, String str) {
            Log.e("honey", "onSessionResuming");
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void mo14748n(C5947e c5947e, int i10) {
            m15850g();
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public void mo14738d(C5947e c5947e, String str) {
            m15849c(c5947e);
        }

        @Override // p216m9.InterfaceC5993u
        @SuppressLint({"SetTextI18n"})
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo14749o(C5947e c5947e) {
            TextView textView;
            StringBuilder sb2;
            String string;
            this.f17373a.f17289K0 = c5947e;
            if (this.f17373a.f17289K0 != null) {
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f17373a.mVideoView;
                if (nSTIJKPlayerEpisodes != null) {
                    nSTIJKPlayerEpisodes.m18949x1();
                    this.f17373a.mVideoView.pause();
                }
                LinearLayout linearLayout = this.f17373a.ll_casting_to_tv;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                HoneyPlayer honeyPlayer = this.f17373a;
                if (honeyPlayer.tv_casting_status_text != null) {
                    if (honeyPlayer.f17289K0.m29289q() == null || this.f17373a.f17289K0.m29289q().m13041R() == null) {
                        textView = this.f17373a.tv_casting_status_text;
                        sb2 = new StringBuilder();
                        string = this.f17373a.getResources().getString(2132017518);
                    } else {
                        textView = this.f17373a.tv_casting_status_text;
                        sb2 = new StringBuilder();
                        sb2.append(this.f17373a.getResources().getString(2132017519));
                        sb2.append(" ");
                        string = this.f17373a.f17289K0.m29289q().m13041R();
                    }
                    sb2.append(string);
                    sb2.append("...");
                    textView.setText(sb2.toString());
                }
            }
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo14739e(C5947e c5947e, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/HoneyPlayer$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.HoneyPlayer$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/HoneyPlayer$c.class */
    public class DialogInterfaceOnClickListenerC2786c implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final HoneyPlayer f17374b;

        public DialogInterfaceOnClickListenerC2786c(HoneyPlayer honeyPlayer) {
            this.f17374b = honeyPlayer;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes;
            float f10;
            switch (i10) {
                case 0:
                    this.f17374b.m15830i1("0.25x");
                    this.f17374b.tv_speed.setText(this.f17374b.getResources().getString(2132018618) + " (0.25x)");
                    nSTIJKPlayerEpisodes = this.f17374b.mVideoView;
                    f10 = 0.25f;
                    break;
                case 1:
                    this.f17374b.m15830i1("0.5x");
                    this.f17374b.tv_speed.setText(this.f17374b.getResources().getString(2132018618) + " (0.5x)");
                    nSTIJKPlayerEpisodes = this.f17374b.mVideoView;
                    f10 = 0.5f;
                    break;
                case 2:
                    this.f17374b.m15830i1("0.75x");
                    this.f17374b.tv_speed.setText(this.f17374b.getResources().getString(2132018618) + " (0.75x)");
                    nSTIJKPlayerEpisodes = this.f17374b.mVideoView;
                    f10 = 0.75f;
                    break;
                case 3:
                    this.f17374b.m15830i1("1x (Normal)");
                    this.f17374b.tv_speed.setText(this.f17374b.getResources().getString(2132018618) + " (1x)");
                    nSTIJKPlayerEpisodes = this.f17374b.mVideoView;
                    f10 = 1.0f;
                    break;
                case 4:
                    this.f17374b.m15830i1("1.25x");
                    this.f17374b.tv_speed.setText(this.f17374b.getResources().getString(2132018618) + " (1.25x)");
                    nSTIJKPlayerEpisodes = this.f17374b.mVideoView;
                    f10 = 1.25f;
                    break;
                case 5:
                    this.f17374b.m15830i1("1.5x");
                    this.f17374b.tv_speed.setText(this.f17374b.getResources().getString(2132018618) + " (1.5x)");
                    nSTIJKPlayerEpisodes = this.f17374b.mVideoView;
                    f10 = 1.5f;
                    break;
                case 6:
                    this.f17374b.m15830i1("1.75x");
                    this.f17374b.tv_speed.setText(this.f17374b.getResources().getString(2132018618) + " (1.75x)");
                    nSTIJKPlayerEpisodes = this.f17374b.mVideoView;
                    f10 = 1.75f;
                    break;
                case 7:
                    this.f17374b.m15830i1("2x");
                    this.f17374b.tv_speed.setText(this.f17374b.getResources().getString(2132018618) + " (2x)");
                    nSTIJKPlayerEpisodes = this.f17374b.mVideoView;
                    f10 = 2.0f;
                    break;
                default:
                    return;
            }
            nSTIJKPlayerEpisodes.setSpeed(f10);
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/HoneyPlayer$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.HoneyPlayer$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/HoneyPlayer$d.class */
    public class DialogInterfaceOnDismissListenerC2787d implements DialogInterface.OnDismissListener {

        /* renamed from: b */
        public final HoneyPlayer f17375b;

        public DialogInterfaceOnDismissListenerC2787d(HoneyPlayer honeyPlayer) {
            this.f17375b = honeyPlayer;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.f17375b.mVideoView;
            if (nSTIJKPlayerEpisodes != null) {
                nSTIJKPlayerEpisodes.m18949x1();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/HoneyPlayer$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.HoneyPlayer$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/HoneyPlayer$e.class */
    public class RunnableC2788e implements Runnable {

        /* renamed from: b */
        public final HoneyPlayer f17376b;

        public RunnableC2788e(HoneyPlayer honeyPlayer) {
            this.f17376b = honeyPlayer;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f17376b.m15816T0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/HoneyPlayer$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.HoneyPlayer$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/HoneyPlayer$f.class */
    public class C2789f extends BroadcastReceiver {

        /* renamed from: a */
        public final HoneyPlayer f17377a;

        public C2789f(HoneyPlayer honeyPlayer) {
            this.f17377a = honeyPlayer;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes;
            int currentPosition;
            if (intent == null || !"media_control".equals(intent.getAction())) {
                return;
            }
            int intExtra = intent.getIntExtra("control_type", 0);
            if (intExtra == 1) {
                this.f17377a.mVideoView.start();
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f17377a.m15803A1(2131231165, "pause", 2, 2);
                    return;
                }
                return;
            }
            if (intExtra == 2) {
                this.f17377a.mVideoView.pause();
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f17377a.m15803A1(2131231136, "play", 1, 1);
                    return;
                }
                return;
            }
            if (intExtra != 4) {
                if (intExtra != 5) {
                    return;
                }
                nSTIJKPlayerEpisodes = this.f17377a.mVideoView;
                currentPosition = nSTIJKPlayerEpisodes.getCurrentPosition() + Constants.MAXIMUM_UPLOAD_PARTS;
            } else if (this.f17377a.mVideoView.getCurrentPosition() - Constants.MAXIMUM_UPLOAD_PARTS <= 0) {
                this.f17377a.mVideoView.seekTo(0);
                return;
            } else {
                nSTIJKPlayerEpisodes = this.f17377a.mVideoView;
                currentPosition = nSTIJKPlayerEpisodes.getCurrentPosition() - Constants.MAXIMUM_UPLOAD_PARTS;
            }
            nSTIJKPlayerEpisodes.seekTo(currentPosition);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/HoneyPlayer$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.HoneyPlayer$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/HoneyPlayer$g.class */
    public class C2790g extends NSTIJKPlayerEpisodes.AbstractC3878g0 {

        /* renamed from: a */
        public final HoneyPlayer f17378a;

        public C2790g(HoneyPlayer honeyPlayer) {
            this.f17378a = honeyPlayer;
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes.AbstractC3878g0
        /* renamed from: a */
        public void mo15860a() {
            this.f17378a.m15803A1(2131231165, "pause", 2, 2);
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerEpisodes.AbstractC3878g0
        /* renamed from: b */
        public void mo15861b() {
            this.f17378a.m15803A1(2131231136, "play", 1, 1);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/HoneyPlayer$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.HoneyPlayer$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/HoneyPlayer$h.class */
    public class RunnableC2791h implements Runnable {

        /* renamed from: b */
        public final HoneyPlayer f17379b;

        public RunnableC2791h(HoneyPlayer honeyPlayer) {
            this.f17379b = honeyPlayer;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f17379b.m15817V0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/HoneyPlayer$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.HoneyPlayer$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/HoneyPlayer$i.class */
    public class RunnableC2792i implements Runnable {

        /* renamed from: b */
        public final HoneyPlayer f17380b;

        public RunnableC2792i(HoneyPlayer honeyPlayer) {
            this.f17380b = honeyPlayer;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f17380b.m15840s1();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/HoneyPlayer$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.HoneyPlayer$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/HoneyPlayer$j.class */
    public class C2793j implements InterfaceC9996e {

        /* renamed from: a */
        public final HoneyPlayer f17381a;

        public C2793j(HoneyPlayer honeyPlayer) {
            this.f17381a = honeyPlayer;
        }

        @Override // p428yg.InterfaceC9996e
        /* renamed from: a */
        public void mo15848a() {
            this.f17381a.m15844w1();
        }

        @Override // p428yg.InterfaceC9996e
        public void onSuccess() {
            RelativeLayout relativeLayout = this.f17381a.rl_movie_poster_box;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/HoneyPlayer$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.HoneyPlayer$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/HoneyPlayer$k.class */
    public class ViewOnFocusChangeListenerC2794k implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f17382b;

        /* renamed from: c */
        public final HoneyPlayer f17383c;

        public ViewOnFocusChangeListenerC2794k(HoneyPlayer honeyPlayer, View view) {
            this.f17383c = honeyPlayer;
            this.f17382b = view;
        }

        /* renamed from: a */
        public final void m15862a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17382b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m15863b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17382b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m15864c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17382b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            View view2;
            View view3;
            View view4;
            int i10;
            LinearLayout linearLayout;
            int i11;
            LinearLayout linearLayout2;
            View view5;
            View view6;
            View view7;
            float f10 = 1.08f;
            if (z10) {
                if (!z10) {
                    f10 = 1.0f;
                }
                View view8 = this.f17382b;
                if (view8 == null || view8.getTag() == null || !this.f17382b.getTag().equals("1")) {
                    View view9 = this.f17382b;
                    if (view9 == null || view9.getTag() == null || !this.f17382b.getTag().equals("2")) {
                        View view10 = this.f17382b;
                        if (view10 == null || view10.getTag() == null || !this.f17382b.getTag().equals("3")) {
                            View view11 = this.f17382b;
                            if ((view11 != null && view11.getTag() != null && this.f17382b.getTag().equals("4")) || (((view5 = this.f17382b) != null && view5.getTag() != null && this.f17382b.getTag().equals("5")) || (((view6 = this.f17382b) != null && view6.getTag() != null && this.f17382b.getTag().equals("6")) || ((view7 = this.f17382b) != null && view7.getTag() != null && this.f17382b.getTag().equals("7"))))) {
                                view.setBackground(this.f17383c.getResources().getDrawable(2131231461));
                                return;
                            }
                            View view12 = this.f17382b;
                            if (view12 != null && view12.getTag() != null && this.f17382b.getTag().equals("8")) {
                                return;
                            }
                            View view13 = this.f17382b;
                            if (view13 == null || view13.getTag() == null || !this.f17382b.getTag().equals("9")) {
                                View view14 = this.f17382b;
                                if (view14 == null || view14.getTag() == null || !this.f17382b.getTag().equals("10")) {
                                    View view15 = this.f17382b;
                                    i10 = 2131230846;
                                    if (view15 == null || view15.getTag() == null || !this.f17382b.getTag().equals("11")) {
                                        View view16 = this.f17382b;
                                        if (view16 == null || view16.getTag() == null || !this.f17382b.getTag().equals("12")) {
                                            return;
                                        }
                                        linearLayout2 = this.f17383c.ll_season_button_main_layout;
                                    }
                                    linearLayout2 = this.f17383c.ll_play_button_main_layout;
                                } else {
                                    view.setBackground(this.f17383c.getResources().getDrawable(2131231460));
                                    m15863b(f10);
                                    m15864c(f10);
                                    linearLayout = this.f17383c.ll_restart;
                                }
                            }
                        }
                        view.setBackground(this.f17383c.getResources().getDrawable(2131231460));
                        m15863b(f10);
                        m15864c(f10);
                        return;
                    }
                    view.setBackground(this.f17383c.getResources().getDrawable(2131231460));
                    m15863b(f10);
                    m15864c(f10);
                    linearLayout = this.f17383c.ll_audio_subtitle_settings;
                } else {
                    view.setBackground(this.f17383c.getResources().getDrawable(2131231460));
                    m15863b(f10);
                    m15864c(f10);
                    linearLayout = this.f17383c.ll_back;
                }
                i11 = 0;
                linearLayout.setVisibility(i11);
                return;
            }
            if (z10) {
                return;
            }
            if (!z10) {
                f10 = 1.0f;
            }
            View view17 = this.f17382b;
            if (view17 == null || view17.getTag() == null || !this.f17382b.getTag().equals("1")) {
                View view18 = this.f17382b;
                if (view18 == null || view18.getTag() == null || !this.f17382b.getTag().equals("2")) {
                    View view19 = this.f17382b;
                    if (view19 == null || view19.getTag() == null || !this.f17382b.getTag().equals("3")) {
                        View view20 = this.f17382b;
                        if ((view20 != null && view20.getTag() != null && this.f17382b.getTag().equals("4")) || (((view2 = this.f17382b) != null && view2.getTag() != null && this.f17382b.getTag().equals("5")) || (((view3 = this.f17382b) != null && view3.getTag() != null && this.f17382b.getTag().equals("6")) || ((view4 = this.f17382b) != null && view4.getTag() != null && this.f17382b.getTag().equals("7"))))) {
                            view.setBackground(null);
                            return;
                        }
                        View view21 = this.f17382b;
                        if (view21 != null && view21.getTag() != null && this.f17382b.getTag().equals("8")) {
                            return;
                        }
                        View view22 = this.f17382b;
                        if (view22 == null || view22.getTag() == null || !this.f17382b.getTag().equals("9")) {
                            View view23 = this.f17382b;
                            if (view23 == null || view23.getTag() == null || !this.f17382b.getTag().equals("10")) {
                                View view24 = this.f17382b;
                                i10 = 2131230845;
                                if (view24 == null || view24.getTag() == null || !this.f17382b.getTag().equals("11")) {
                                    View view25 = this.f17382b;
                                    if (view25 == null || view25.getTag() == null || !this.f17382b.getTag().equals("12")) {
                                        return;
                                    }
                                    linearLayout2 = this.f17383c.ll_season_button_main_layout;
                                }
                                linearLayout2 = this.f17383c.ll_play_button_main_layout;
                            } else {
                                view.setBackground(this.f17383c.getResources().getDrawable(2131231458));
                                m15863b(f10);
                                m15864c(f10);
                                m15862a(z10);
                                linearLayout = this.f17383c.ll_restart;
                            }
                        }
                    }
                    view.setBackground(this.f17383c.getResources().getDrawable(2131231458));
                    m15863b(f10);
                    m15864c(f10);
                    m15862a(z10);
                    return;
                }
                view.setBackground(this.f17383c.getResources().getDrawable(2131231458));
                m15863b(f10);
                m15864c(f10);
                m15862a(z10);
                linearLayout = this.f17383c.ll_audio_subtitle_settings;
            } else {
                view.setBackground(this.f17383c.getResources().getDrawable(2131231458));
                m15863b(f10);
                m15864c(f10);
                m15862a(z10);
                linearLayout = this.f17383c.ll_back;
            }
            i11 = 8;
            linearLayout.setVisibility(i11);
            return;
            linearLayout2.setBackgroundResource(i10);
        }
    }

    /* renamed from: I0 */
    public static boolean m15790I0() {
        ProgressBar progressBar = f17264k1;
        return progressBar != null && progressBar.getVisibility() == 0;
    }

    /* renamed from: L0 */
    public static long m15791L0(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: N0 */
    public static String m15792N0(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    /* renamed from: S0 */
    public static String m15793S0(String str) {
        Matcher matcher = Pattern.compile("(?:youtube(?:-nocookie)?\\.com\\/(?:[^\\/\\n\\s]+\\/\\S+\\/|(?:v|e(?:mbed)?)\\/|\\S*?[?&]v=)|youtu\\.be\\/)([a-zA-Z0-9_-]{11})", 2).matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    /* renamed from: A1 */
    public void m15803A1(int i10, String str, int i11, int i12) {
        try {
            if (this.f17281G0.equals("mobile") && this.f17320a1 && this.f17329f1) {
                ArrayList arrayList = new ArrayList();
                PendingIntent broadcast = PendingIntent.getBroadcast(this, i12, new Intent("media_control").putExtra("control_type", i11), 0);
                Icon createWithResource = Icon.createWithResource(this, i10);
                PendingIntent broadcast2 = PendingIntent.getBroadcast(this, 4, new Intent("media_control").putExtra("control_type", 4), 0);
                PendingIntent broadcast3 = PendingIntent.getBroadcast(this, 5, new Intent("media_control").putExtra("control_type", 5), 0);
                Icon createWithResource2 = Icon.createWithResource(this, 2131231141);
                Icon createWithResource3 = Icon.createWithResource(this, 2131231134);
                arrayList.add(new RemoteAction(createWithResource2, "rewind", "rewind", broadcast2));
                arrayList.add(new RemoteAction(createWithResource, str, str, broadcast));
                arrayList.add(new RemoteAction(createWithResource3, "forward", "forward", broadcast3));
                this.f17321b1.setActions(arrayList);
                setPictureInPictureParams(this.f17321b1.build());
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: D0 */
    public final void m15804D0(Configuration configuration) {
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes;
        boolean z10;
        View decorView = getWindow().getDecorView();
        if (configuration.orientation == 2) {
            decorView.setSystemUiVisibility(5894);
            nSTIJKPlayerEpisodes = this.mVideoView;
            z10 = false;
        } else {
            decorView.setSystemUiVisibility(256);
            nSTIJKPlayerEpisodes = this.mVideoView;
            z10 = true;
        }
        nSTIJKPlayerEpisodes.setAdjustViewBounds(z10);
    }

    /* renamed from: E0 */
    public void m15805E0() {
        File[] m26198A = C5255e.m26198A(this.f17340k);
        for (File file : m26198A) {
            if (file.toString().endsWith(".ts")) {
                Arrays.asList(file);
            }
        }
        if (m26198A.length > 0) {
            ArrayList<File> arrayList = this.f17324d1;
            if (arrayList != null) {
                arrayList.clear();
            }
            for (File file2 : m26198A) {
                if (file2.toString().endsWith(".ts")) {
                    this.f17324d1.addAll(Arrays.asList(file2));
                }
            }
            Collections.reverse(this.f17324d1);
            this.f17322c1 = this.f17324d1;
        }
    }

    /* renamed from: F0 */
    public final void m15806F0(int i10) {
        if (f17266m1) {
            return;
        }
        this.mVideoView.f23708J1 = new RunnableC2788e(this);
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.mVideoView;
        nSTIJKPlayerEpisodes.f23704I1.postDelayed(nSTIJKPlayerEpisodes.f23708J1, i10);
    }

    /* renamed from: G0 */
    public void m15807G0(int i10) {
        if (f17266m1) {
            return;
        }
        this.mVideoView.f23708J1 = new RunnableC2791h(this);
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.mVideoView;
        nSTIJKPlayerEpisodes.f23704I1.postDelayed(nSTIJKPlayerEpisodes.f23708J1, i10);
    }

    /* renamed from: H0 */
    public boolean m15808H0() {
        RelativeLayout relativeLayout = this.rl_next_episode;
        return relativeLayout != null && relativeLayout.getVisibility() == 0;
    }

    /* renamed from: J0 */
    public final void m15809J0() {
        int i10;
        int i11;
        int i12;
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes;
        List<GetEpisdoeDetailsCallback> list = this.f17310V;
        if (list == null || list.size() <= 0) {
            return;
        }
        List<GetEpisdoeDetailsCallback> list2 = this.f17333h;
        if (list2 != null) {
            list2.clear();
        }
        if (this.f17366x != null) {
            if (this.mVideoView != null) {
                this.f17271B0 = this.f17340k.getSharedPreferences("currentSeekTime", 0);
                long currentPosition = this.mVideoView.getCurrentPosition();
                SharedPreferences sharedPreferences = this.f17340k.getSharedPreferences("currentSeekTime", 0);
                this.f17271B0 = sharedPreferences;
                SharedPreferences.Editor edit = sharedPreferences.edit();
                this.f17273C0 = edit;
                edit.putString("currentSeekTime", String.valueOf(currentPosition));
                this.f17273C0.apply();
                if ((this.mVideoView == null || C7920a.m34301l().m34305b() == null || !this.f17300Q.equals("m3u")) && C7920a.m34301l() != null && C7920a.m34301l().m34308k() != null && currentPosition != -1 && currentPosition != 0) {
                    ArrayList<GetEpisdoeDetailsCallback> m27652c = this.f17370z.m27652c(C7920a.m34301l().m34308k());
                    this.f17309U0 = m27652c;
                    if (m27652c != null && m27652c.size() > 0) {
                        try {
                            int m15813P0 = m15813P0(this.f17310V, C5255e.m26215R(C7920a.m34301l().m34308k()));
                            GetEpisdoeDetailsCallback getEpisdoeDetailsCallback = new GetEpisdoeDetailsCallback();
                            getEpisdoeDetailsCallback.m14937G(this.f17310V.get(m15813P0).m14958j());
                            getEpisdoeDetailsCallback.m14948R(this.f17310V.get(m15813P0).m14969u());
                            getEpisdoeDetailsCallback.m14972x(this.f17310V.get(m15813P0).m14951c());
                            getEpisdoeDetailsCallback.m14970v(this.f17310V.get(m15813P0).m14949a());
                            getEpisdoeDetailsCallback.m14944N(this.f17310V.get(m15813P0).m14965q());
                            getEpisdoeDetailsCallback.m14971w(this.f17310V.get(m15813P0).m14950b());
                            getEpisdoeDetailsCallback.m14934D(String.valueOf(currentPosition));
                            getEpisdoeDetailsCallback.m14945O(this.f17310V.get(m15813P0).m14966r());
                            getEpisdoeDetailsCallback.m14938H(this.f17310V.get(m15813P0).m14959k());
                            getEpisdoeDetailsCallback.m14941K(this.f17310V.get(m15813P0).m14962n());
                            getEpisdoeDetailsCallback.m14940J(this.f17310V.get(m15813P0).m14961m());
                            getEpisdoeDetailsCallback.m14947Q(this.f17310V.get(m15813P0).m14968t());
                            getEpisdoeDetailsCallback.m14943M(this.f17310V.get(m15813P0).m14964p());
                            getEpisdoeDetailsCallback.m14935E(this.f17310V.get(m15813P0).m14956h());
                            getEpisdoeDetailsCallback.m14946P(this.f17310V.get(m15813P0).m14967s());
                            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = this.mVideoView;
                            getEpisdoeDetailsCallback.m14933C(nSTIJKPlayerEpisodes2 != null ? String.valueOf(nSTIJKPlayerEpisodes2.getDuration() / 1000) : this.f17310V.get(m15813P0).m14954f());
                            this.f17370z.m27651b(this.f17310V.get(m15813P0).m14958j());
                            this.f17370z.m27658i(this.f17340k, this.f17310V.get(m15813P0).m14966r());
                            this.f17370z.m27656g(this.f17340k, getEpisdoeDetailsCallback);
                        } catch (Exception e10) {
                        }
                    }
                }
            }
            ArrayList<GetEpisdoeDetailsCallback> m15336y = this.f17366x.m15336y("getalldata");
            for (int i13 = 0; i13 < this.f17310V.size(); i13++) {
                if (this.f17310V.get(i13).m14964p().equals(Integer.valueOf(this.f17303R0))) {
                    GetEpisdoeDetailsCallback getEpisdoeDetailsCallback2 = this.f17310V.get(i13);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= m15336y.size()) {
                            break;
                        }
                        if (this.f17310V.get(i13).m14958j().equals(m15336y.get(i14).m14958j())) {
                            getEpisdoeDetailsCallback2.m14934D(m15336y.get(i14).m14955g());
                            try {
                                i10 = Math.round(Integer.parseInt(m15336y.get(i14).m14955g()) / 1000.0f);
                            } catch (Exception e11) {
                                i10 = 0;
                            }
                            try {
                                i11 = (!getEpisdoeDetailsCallback2.m14954f().equals("") || (nSTIJKPlayerEpisodes = this.mVideoView) == null) ? C5255e.m26215R(getEpisdoeDetailsCallback2.m14954f()) : nSTIJKPlayerEpisodes.getDuration() / 1000;
                            } catch (Exception e12) {
                                i11 = 0;
                                i12 = Math.round((i10 / i11) * 100.0f);
                                getEpisdoeDetailsCallback2.m14936F(i12);
                                this.f17333h.add(getEpisdoeDetailsCallback2);
                            }
                            try {
                                i12 = Math.round((i10 / i11) * 100.0f);
                            } catch (Exception e13) {
                                i12 = 0;
                            }
                            getEpisdoeDetailsCallback2.m14936F(i12);
                        } else {
                            i14++;
                        }
                    }
                    this.f17333h.add(getEpisdoeDetailsCallback2);
                }
            }
        }
    }

    /* renamed from: K0 */
    public final void m15810K0(String str) {
        this.f17368y.m15314t(str);
    }

    /* renamed from: M0 */
    public final void m15811M0() {
        ImageView imageView = this.iv_play;
        imageView.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2794k(this, imageView));
        ImageView imageView2 = this.iv_pause;
        imageView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2794k(this, imageView2));
        ImageView imageView3 = this.iv_back;
        imageView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2794k(this, imageView3));
        SeekBar seekBar = this.hp_seekbar;
        seekBar.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2794k(this, seekBar));
        ImageView imageView4 = this.iv_audio_subtitle_track;
        imageView4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2794k(this, imageView4));
        ImageView imageView5 = this.iv_hp_play_from_beginning;
        imageView5.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2794k(this, imageView5));
        LinearLayout linearLayout = this.ll_episodes;
        linearLayout.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2794k(this, linearLayout));
        LinearLayout linearLayout2 = this.ll_crop;
        linearLayout2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2794k(this, linearLayout2));
        LinearLayout linearLayout3 = this.ll_playback_speed;
        linearLayout3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2794k(this, linearLayout3));
        LinearLayout linearLayout4 = this.ll_next_episode;
        linearLayout4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2794k(this, linearLayout4));
        ImageView imageView6 = this.iv_back_episodes;
        imageView6.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2794k(this, imageView6));
        ImageView imageView7 = this.iv_back_settings;
        imageView7.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2794k(this, imageView7));
        ImageView imageView8 = this.iv_hp_lock;
        imageView8.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2794k(this, imageView8));
        ImageView imageView9 = this.iv_hp_lock;
        imageView9.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2794k(this, imageView9));
        TextView textView = this.cancel_autoplay;
        textView.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2794k(this, textView));
        TextView textView2 = this.tv_autoplay_next_episode_button;
        textView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2794k(this, textView2));
    }

    /* renamed from: O0 */
    public int m15812O0(ArrayList<LiveStreamsDBModel> arrayList, int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            i11 = 0;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (C5255e.m26215R(arrayList.get(i12).m14811R()) == i10) {
                i11 = i12;
                break;
            }
            i12++;
        }
        return i11;
    }

    /* renamed from: P0 */
    public int m15813P0(List<GetEpisdoeDetailsCallback> list, int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            i11 = 0;
            if (i12 >= list.size()) {
                break;
            }
            if (C5255e.m26215R(list.get(i12).m14958j()) == i10) {
                i11 = i12;
                break;
            }
            i12++;
        }
        return i11;
    }

    /* renamed from: Q0 */
    public final ArrayList<LiveStreamsDBModel> m15814Q0(int i10, int i11) {
        return this.f17368y.m15301B0(String.valueOf(i10), i11);
    }

    /* renamed from: R0 */
    public final LiveStreamsDBModel m15815R0(String str, int i10) {
        return this.f17304S.m15203Y1(str, i10);
    }

    /* renamed from: T0 */
    public final void m15816T0() {
        if (this.f17363v0.getVisibility() == 0) {
            this.f17363v0.startAnimation(this.f17354r);
            if (this.ll_brightness.getVisibility() == 0) {
                this.ll_brightness.startAnimation(this.f17354r);
            }
            if (this.tv_seek_left.getVisibility() == 0) {
                this.tv_seek_left.startAnimation(this.f17354r);
            }
            if (this.ll_pause_play.getVisibility() == 0) {
                this.ll_pause_play.startAnimation(this.f17354r);
            }
            if (this.tv_seek_right.getVisibility() == 0) {
                this.tv_seek_right.startAnimation(this.f17354r);
            }
            if (this.ll_volume.getVisibility() == 0) {
                this.ll_volume.startAnimation(this.f17354r);
            }
            this.f17363v0.setVisibility(8);
            if (this.ll_brightness.getVisibility() == 0) {
                this.ll_brightness.setVisibility(8);
            }
            if (this.tv_seek_left.getVisibility() == 0) {
                this.tv_seek_left.setVisibility(8);
            }
            if (this.ll_pause_play.getVisibility() == 0) {
                this.ll_pause_play.setVisibility(8);
            }
            if (this.tv_seek_right.getVisibility() == 0) {
                this.tv_seek_right.setVisibility(8);
            }
            if (this.ll_volume.getVisibility() == 0) {
                this.ll_volume.setVisibility(8);
            }
        }
        this.mVideoView.f23780g1 = false;
    }

    /* renamed from: V0 */
    public void m15817V0() {
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.mVideoView;
        if (nSTIJKPlayerEpisodes != null) {
            nSTIJKPlayerEpisodes.m18949x1();
            this.mVideoView.f23853y2.removeMessages(1);
        }
        if (f17266m1 || this.f17363v0.getVisibility() != 0) {
            return;
        }
        this.f17363v0.startAnimation(this.f17354r);
        if (this.ll_brightness.getVisibility() == 0) {
            this.ll_brightness.startAnimation(this.f17354r);
        }
        if (this.tv_seek_left.getVisibility() == 0) {
            this.tv_seek_left.startAnimation(this.f17354r);
        }
        if (this.ll_pause_play.getVisibility() == 0) {
            this.ll_pause_play.startAnimation(this.f17354r);
        }
        if (this.tv_seek_right.getVisibility() == 0) {
            this.tv_seek_right.startAnimation(this.f17354r);
        }
        if (this.ll_volume.getVisibility() == 0) {
            this.ll_volume.startAnimation(this.f17354r);
        }
        this.f17363v0.setVisibility(8);
        if (this.ll_brightness.getVisibility() == 0) {
            this.ll_brightness.setVisibility(8);
        }
        if (this.tv_seek_left.getVisibility() == 0) {
            this.tv_seek_left.setVisibility(8);
        }
        if (this.ll_pause_play.getVisibility() == 0) {
            this.ll_pause_play.setVisibility(8);
        }
        if (this.tv_seek_right.getVisibility() == 0) {
            this.tv_seek_right.setVisibility(8);
        }
        if (this.ll_volume.getVisibility() == 0) {
            this.ll_volume.setVisibility(8);
        }
    }

    /* renamed from: W0 */
    public final void m15818W0() {
        this.f17311V0 = new Handler();
        this.f17360u = new Handler();
        this.f17342l = AnimationUtils.loadAnimation(this.f17340k, 2130772034);
        this.f17344m = AnimationUtils.loadAnimation(this.f17340k, 2130772035);
        this.f17352q = AnimationUtils.loadAnimation(this.f17340k, 2130772017);
        this.f17354r = AnimationUtils.loadAnimation(this.f17340k, 2130772018);
        this.f17358t = AnimationUtils.loadAnimation(this.f17340k, 2130772028);
        this.f17356s = AnimationUtils.loadAnimation(this.f17340k, 2130772027);
        this.f17348o = AnimationUtils.loadAnimation(this.f17340k, 2130772036);
        this.f17350p = AnimationUtils.loadAnimation(this.f17340k, 2130772037);
        this.f17346n = AnimationUtils.loadAnimation(this.f17340k, 2130772029);
        try {
            m15836o1();
        } catch (Exception e10) {
        }
        if (this.f17281G0.equals("mobile")) {
            try {
                C5938b m29235e = C5938b.m29235e(this);
                this.f17291L0 = m29235e;
                this.f17289K0 = m29235e.m29243c().m29358c();
                C5935a.m29219b(getApplicationContext(), this.cast_button);
            } catch (Exception e11) {
            }
        }
    }

    /* renamed from: X0 */
    public void m15819X0() {
        if (this.mVideoView == null) {
            return;
        }
        m15807G0(0);
        int i10 = Build.VERSION.SDK_INT;
        Rational rational = (this.mVideoView.m18900J1() == 0 || this.mVideoView.m18899I1() == 0) ? new Rational(this.mVideoView.getWidth(), this.mVideoView.getHeight()) : new Rational(this.mVideoView.m18900J1(), this.mVideoView.m18899I1());
        if (i10 >= 26) {
            try {
                this.f17321b1.setAspectRatio(rational).build();
                enterPictureInPictureMode(this.f17321b1.build());
            } catch (Exception e10) {
                this.f17321b1.setAspectRatio(new Rational(this.mVideoView.getWidth(), this.mVideoView.getHeight())).build();
                enterPictureInPictureMode(this.f17321b1.build());
            }
        }
    }

    /* renamed from: Y0 */
    public final void m15820Y0() {
        List<GetEpisdoeDetailsCallback> list;
        int m34307j = C7920a.m34301l().m34307j();
        String str = this.f17359t0;
        str.hashCode();
        if (str.equals("series") && (list = this.f17310V) != null && list.size() > 0 && m34307j == this.f17310V.size() - 1) {
            C7920a.m34301l().m34315u(0);
        } else {
            C7920a.m34301l().m34315u(m34307j + 1);
        }
    }

    /* renamed from: Z0 */
    public void m15821Z0(String str) {
        m15816T0();
        this.f17361u0.m37067a(2131427519).m37070d();
        this.f17361u0.m37067a(2131427523).m37068b(str);
    }

    /* renamed from: a1 */
    public final void m15822a1() {
        this.iv_play.setOnClickListener(this);
        this.iv_pause.setOnClickListener(this);
        this.ll_back_click.setOnClickListener(this);
        this.iv_back.setOnClickListener(this);
        this.hp_seekbar.setOnClickListener(this);
        this.ll_audio_subtitle_settings_click.setOnClickListener(this);
        this.iv_audio_subtitle_track.setOnClickListener(this);
        this.ll_episodes.setOnClickListener(this);
        this.ll_crop.setOnClickListener(this);
        this.ll_playback_speed.setOnClickListener(this);
        this.ll_next_episode.setOnClickListener(this);
        this.iv_back_episodes.setOnClickListener(this);
        this.iv_back_settings.setOnClickListener(this);
        this.ll_hp_lock_click.setOnClickListener(this);
        this.iv_unlock_button.setOnClickListener(this);
        this.iv_hp_play_from_beginning.setOnClickListener(this);
        if (Build.VERSION.SDK_INT >= 26) {
            this.mVideoView.setMovieListener(this.f17335h1);
        }
    }

    /* renamed from: b1 */
    public final void m15823b1(ArrayList<LiveStreamsDBModel> arrayList, int i10) {
        int m14803J;
        int i11;
        int i12;
        String str;
        String str2;
        SharedPreferences.Editor editor;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        m15843v1();
        m15838q1();
        m15806F0(TFTP.DEFAULT_TIMEOUT);
        int m15812O0 = m15812O0(arrayList, i10);
        String name = arrayList.get(m15812O0).getName();
        this.f17297O0 = arrayList.get(m15812O0).m14810Q();
        this.f17295N0 = name;
        this.f17301Q0 = C5255e.m26215R(String.valueOf(arrayList.get(m15812O0).m14804K()));
        C5255e.m26247n0(C7711g.m33686a() + C7711g.m33687i());
        arrayList.get(m15812O0).m14805L();
        int m26214Q = C5255e.m26214Q(arrayList.get(m15812O0).m14811R());
        int i13 = this.f17345m0;
        String m14846x = arrayList.get(m15812O0).m14846x();
        arrayList.get(m15812O0).m14827g();
        this.f17343l0 = C5255e.m26214Q(arrayList.get(m15812O0).m14811R());
        C7920a.m34301l().m34315u(m15812O0);
        int m15846y1 = this.f17300Q.equals("m3u") ? m15846y1(String.valueOf(Uri.parse(this.f17362v)), SharepreferenceDBHandler.m15337A(this.f17340k)) : m15845x1(m26214Q, SharepreferenceDBHandler.m15337A(this.f17340k));
        SharedPreferences.Editor editor2 = this.f17288K;
        if (editor2 != null) {
            editor2.putString("currentlyPlayingVideo", String.valueOf(arrayList.get(m15812O0).m14811R()));
            this.f17288K.apply();
        }
        String str3 = this.f17359t0;
        if (str3 != null && str3.equals("movies") && (editor = this.f17288K) != null) {
            editor.putString("currentlyPlayingVideo", String.valueOf(arrayList.get(m15812O0).m14811R()));
            this.f17288K.apply();
        }
        SharedPreferences.Editor editor3 = this.f17290L;
        if (editor3 != null) {
            editor3.putString("currentlyPlayingVideoPosition", String.valueOf(m15812O0));
            this.f17290L.apply();
        }
        SimpleDateFormat simpleDateFormat = this.f17318Z;
        if (m15791L0(simpleDateFormat, simpleDateFormat.format(new Date(C7709e.m33680a(this.f17340k))), this.f17331g0.format(this.f17328f0)) >= C7707c.m33667p() && (str = this.f17339j0) != null && this.f17341k0 != null && (!f17262i1.equals(str) || (this.f17339j0 != null && (str2 = this.f17341k0) != null && !f17263j1.equals(str2)))) {
            this.f17316Y = Boolean.FALSE;
        }
        this.f17314X = m26214Q;
        this.tv_episode_name.setText(name);
        if (m15846y1 == 0 && this.f17316Y.booleanValue()) {
            m15832k1();
            this.mVideoView.setProgress(false);
            if (this.f17300Q.equals("m3u")) {
                C7920a.m34301l().m34312p("m3u");
                String str4 = this.f17362v;
                this.f17293M0 = str4;
                this.mVideoView.m18910T1(str4, true, name, 0L, 0, "", null, m15812O0, 0, this.f17300Q, "nst");
            } else {
                String valueOf = String.valueOf(Uri.parse(this.f17302R + m26214Q + InstructionFileId.DOT + m14846x));
                this.f17293M0 = valueOf;
                this.mVideoView.m18910T1(valueOf, true, name, 0L, m26214Q, "", this.f17308U, m15812O0, 0, this.f17300Q, "nst");
            }
            VodAllCategoriesSingleton.m14909b().m14921m(arrayList);
            C7920a.m34301l().m34303B(this.f17343l0);
            C7920a.m34301l().m34313r(arrayList);
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.mVideoView;
            nSTIJKPlayerEpisodes.f23706J = 0;
            nSTIJKPlayerEpisodes.f23714L = false;
            nSTIJKPlayerEpisodes.start();
        }
        if (m15846y1 > 0) {
            new LiveStreamsDBModel();
            LiveStreamsDBModel m15815R0 = this.f17300Q.equals("m3u") ? m15815R0(String.valueOf(Uri.parse(this.f17362v)), SharepreferenceDBHandler.m15337A(this.f17340k)) : m15814Q0(m26214Q, SharepreferenceDBHandler.m15337A(this.f17340k));
            long j10 = 0;
            if (m15815R0 != null) {
                if (m15815R0.size() > 0) {
                    long m14804K = m15815R0.get(0).m14804K();
                    m14803J = (int) m15815R0.get(0).m14803J();
                    j10 = m14804K;
                    if (this.mVideoView == null && this.f17316Y.booleanValue()) {
                        m15832k1();
                        String valueOf2 = String.valueOf(Uri.parse(this.f17302R + this.f17343l0 + InstructionFileId.DOT + m14846x));
                        this.f17293M0 = valueOf2;
                        this.mVideoView.setProgress(true);
                        C7920a.m34301l().m34304C(j10);
                        this.mVideoView.setCurrentPositionSeekbar((int) j10);
                        try {
                            i11 = Math.round(C5255e.m26215R(String.valueOf(j10)) / 1000.0f);
                        } catch (Exception e10) {
                            i11 = 0;
                            m14803J = 0;
                        }
                        try {
                            i12 = Math.round((i11 / m14803J) * 100.0f);
                        } catch (Exception e11) {
                            i12 = 0;
                        }
                        if (i12 >= 99) {
                            this.mVideoView.setCurrentPositionSeekbar(0);
                        }
                        VodAllCategoriesSingleton.m14909b().m14921m(arrayList);
                        C7920a.m34301l().m34303B(this.f17343l0);
                        this.mVideoView.m18910T1(valueOf2, true, name, 0L, m26214Q, "", this.f17308U, m15812O0, 0, this.f17300Q, "nst");
                        this.mVideoView.start();
                        return;
                    }
                }
            }
            m14803J = i13;
            if (this.mVideoView == null) {
            }
        }
    }

    /* renamed from: c1 */
    public final void m15824c1(ArrayList<File> arrayList, int i10) {
        String str;
        String str2;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        String name = arrayList.get(i10).getName();
        String m26247n0 = C5255e.m26247n0(C7711g.m33686a() + C7711g.m33687i());
        SimpleDateFormat simpleDateFormat = this.f17318Z;
        if (m15791L0(simpleDateFormat, simpleDateFormat.format(new Date(C7709e.m33680a(this.f17340k))), this.f17331g0.format(this.f17328f0)) >= C7707c.m33667p() && (str = this.f17339j0) != null && this.f17341k0 != null && (!f17262i1.equals(str) || (this.f17339j0 != null && (str2 = this.f17341k0) != null && !f17263j1.equals(str2)))) {
            this.f17316Y = Boolean.FALSE;
            this.f17361u0.m37067a(2131427519).m37070d();
            this.f17361u0.m37067a(2131427523).m37068b(m26247n0 + this.f17334h0 + this.f17337i0);
        }
        if (this.f17316Y.booleanValue()) {
            C7920a.m34301l().m34315u(i10);
            this.tv_episode_name.setText(name);
            m15832k1();
            String str3 = this.f17302R;
            this.f17293M0 = str3;
            this.mVideoView.m18910T1(str3, true, name, 0L, 0, "", null, 0, 0, this.f17300Q, "nst");
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.mVideoView;
            if (nSTIJKPlayerEpisodes != null) {
                nSTIJKPlayerEpisodes.f23706J = 0;
                nSTIJKPlayerEpisodes.f23714L = false;
                nSTIJKPlayerEpisodes.start();
            }
        }
    }

    /* renamed from: d1 */
    public final void m15825d1(List<GetEpisdoeDetailsCallback> list, int i10) {
        long j10;
        int i11;
        int i12;
        String str;
        String str2;
        SharedPreferences.Editor editor;
        if (list == null || list.size() <= 0) {
            return;
        }
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.mVideoView;
        if (nSTIJKPlayerEpisodes != null && nSTIJKPlayerEpisodes.getPlayerIsPrepared() && this.mVideoView.f23715L0 == i10) {
            return;
        }
        m15843v1();
        m15838q1();
        m15806F0(TFTP.DEFAULT_TIMEOUT);
        int m15813P0 = m15813P0(list, i10);
        String m14969u = list.get(m15813P0).m14969u();
        this.f17297O0 = list.get(m15813P0).m14962n();
        this.f17295N0 = m14969u;
        this.f17299P0 = String.valueOf(list.get(m15813P0).m14964p());
        this.f17301Q0 = C5255e.m26215R(list.get(m15813P0).m14955g());
        this.f17303R0 = list.get(m15813P0).m14964p().intValue();
        C5255e.m26247n0(C7711g.m33686a() + C7711g.m33687i());
        list.get(m15813P0).m14958j();
        int m26214Q = C5255e.m26214Q(list.get(m15813P0).m14958j());
        int i13 = this.f17345m0;
        String m14951c = list.get(m15813P0).m14951c();
        list.get(m15813P0).m14950b();
        this.f17312W = list.get(m15813P0).m14958j();
        C7920a.m34301l().m34315u(m15813P0);
        int m27657h = this.f17370z.m27657h(this.f17312W, SharepreferenceDBHandler.m15337A(this.f17340k));
        SharedPreferences.Editor editor2 = this.f17288K;
        if (editor2 != null) {
            editor2.putString("currentlyPlayingVideo", String.valueOf(list.get(m15813P0).m14958j()));
            this.f17288K.apply();
        }
        String str3 = this.f17359t0;
        if (str3 != null && str3.equals("series") && (editor = this.f17288K) != null) {
            editor.putString("currentlyPlayingVideo", String.valueOf(list.get(m15813P0).m14958j()));
            this.f17288K.apply();
        }
        SharedPreferences.Editor editor3 = this.f17290L;
        if (editor3 != null) {
            editor3.putString("currentlyPlayingVideoPosition", String.valueOf(m15813P0));
            this.f17290L.apply();
        }
        SimpleDateFormat simpleDateFormat = this.f17318Z;
        if (m15791L0(simpleDateFormat, simpleDateFormat.format(new Date(C7709e.m33680a(this.f17340k))), this.f17331g0.format(this.f17328f0)) >= C7707c.m33667p() && (str = this.f17339j0) != null && this.f17341k0 != null && (!f17262i1.equals(str) || (this.f17339j0 != null && (str2 = this.f17341k0) != null && !f17263j1.equals(str2)))) {
            this.f17316Y = Boolean.FALSE;
        }
        this.f17314X = m26214Q;
        this.tv_episode_name.setText(m14969u);
        if (m27657h == 0 && this.f17316Y.booleanValue()) {
            m15832k1();
            this.mVideoView.setProgress(false);
            if (this.f17300Q.equals("m3u")) {
                C7920a.m34301l().m34312p("m3u");
                String str4 = this.f17362v;
                this.f17293M0 = str4;
                this.mVideoView.m18910T1(str4, true, m14969u, 0L, 0, "", null, m15813P0, 0, this.f17300Q, "nst");
            } else {
                String valueOf = String.valueOf(Uri.parse(this.f17302R + m26214Q + InstructionFileId.DOT + m14951c));
                this.f17293M0 = valueOf;
                this.mVideoView.m18910T1(valueOf, true, m14969u, 0L, m26214Q, "", this.f17308U, m15813P0, 0, this.f17300Q, "nst");
            }
            EpisodesUsingSinglton.m14753c().m14758f(list);
            C7920a.m34301l().m34316w(this.f17312W);
            C7920a.m34301l().m34303B(m26214Q);
            C7920a.m34301l().m34314s(list);
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = this.mVideoView;
            nSTIJKPlayerEpisodes2.f23706J = 0;
            nSTIJKPlayerEpisodes2.f23714L = false;
            nSTIJKPlayerEpisodes2.start();
        }
        if (m27657h <= 0 || this.f17370z.m27650a(this.f17312W) <= 0) {
            return;
        }
        try {
            j10 = this.f17366x.m15319A0(this.f17312W).longValue();
        } catch (Exception e10) {
            j10 = 0;
        }
        if (i13 == 0) {
            i13 = C5255e.m26215R(this.f17366x.m15334v0(this.f17312W).toString());
            this.f17345m0 = i13;
        }
        if (this.mVideoView == null || !this.f17316Y.booleanValue()) {
            return;
        }
        m15832k1();
        String valueOf2 = String.valueOf(Uri.parse(this.f17302R + this.f17312W + InstructionFileId.DOT + m14951c));
        this.f17293M0 = valueOf2;
        this.mVideoView.setProgress(true);
        C7920a.m34301l().m34304C(j10);
        this.mVideoView.setCurrentPositionSeekbar((int) j10);
        try {
            i11 = Math.round(C5255e.m26215R(String.valueOf(j10)) / 1000.0f);
        } catch (Exception e11) {
            i11 = 0;
            i13 = 0;
        }
        try {
            i12 = Math.round((i11 / i13) * 100.0f);
        } catch (Exception e12) {
            i12 = 0;
        }
        if (i12 >= 99) {
            this.mVideoView.setCurrentPositionSeekbar(0);
        }
        EpisodesUsingSinglton.m14753c().m14758f(list);
        C7920a.m34301l().m34316w(this.f17312W);
        this.mVideoView.m18910T1(valueOf2, true, m14969u, 0L, m26214Q, "", this.f17308U, m15813P0, 0, this.f17300Q, "nst");
        this.mVideoView.start();
    }

    /* renamed from: e1 */
    public final void m15826e1() {
        String str;
        MediaInfo m23741a;
        C5947e c5947e;
        try {
            String m15403z = SharepreferenceDBHandler.m15403z(this.f17340k);
            str = "";
            if (m15403z.equals("loadurl")) {
                String str2 = this.f17371z0;
                this.f17269A0 = str2;
                int lastIndexOf = str2.lastIndexOf(47);
                str = lastIndexOf > 1 ? this.f17269A0.substring(lastIndexOf + 1) : "";
                String str3 = this.f17269A0;
                this.f17293M0 = str3;
                m23741a = C4718a.m23741a(str, "", "", 0, str3, "videos/mp4", this.f17297O0, "", null);
                c5947e = this.f17289K0;
            } else {
                int ipAddress = ((WifiManager) getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress();
                String format = String.format("%d.%d.%d.%d", Integer.valueOf(ipAddress & 255), Integer.valueOf((ipAddress >> 8) & 255), Integer.valueOf((ipAddress >> 16) & 255), Integer.valueOf((ipAddress >> 24) & 255));
                String str4 = InstructionFileId.DOT;
                if (m15403z.equals("devicedata")) {
                    this.f17269A0 = this.f17371z0;
                }
                int lastIndexOf2 = this.f17269A0.lastIndexOf(47);
                if (lastIndexOf2 > 1) {
                    str = this.f17269A0.substring(lastIndexOf2 + 1);
                    str4 = this.f17269A0.substring(0, lastIndexOf2);
                }
                this.f17332g1.m23791b();
                this.f17332g1.m23790a(format, str4);
                String str5 = "http://" + format + ":8080/" + str;
                this.f17293M0 = str5;
                m23741a = C4718a.m23741a(str, "", "", 0, str5, "videos/mp4", this.f17297O0, "", null);
                c5947e = this.f17289K0;
            }
            C4718a.m23743c(0, true, m23741a, c5947e, this.f17340k);
        } catch (Exception e10) {
        }
    }

    /* renamed from: f1 */
    public void m15827f1(String str, int i10, String str2, String str3) {
        if (this.mVideoView != null) {
            RelativeLayout relativeLayout = this.rl_episodes_box;
            if (relativeLayout != null) {
                relativeLayout.startAnimation(this.f17354r);
                this.rl_episodes_box.setVisibility(8);
            }
            this.f17351p0 = str2;
            TextView textView = this.tv_episode_name;
            if (textView != null) {
                textView.setText(str2);
            }
            SeekBar seekBar = this.hp_seekbar;
            if (seekBar != null) {
                seekBar.setProgress(0);
            }
            m15825d1(this.f17310V, i10);
        }
    }

    /* renamed from: g1 */
    public final void m15828g1() {
        try {
            SharedPreferences.Editor edit = this.f17283H0.edit();
            this.f17285I0 = edit;
            if (edit != null) {
                edit.putString("pref.using_playback_speed", "1x (Normal)");
                this.f17285I0.apply();
            }
            this.tv_speed.setText(getResources().getString(2132018618) + " (1x)");
        } catch (Exception e10) {
        }
    }

    /* renamed from: h1 */
    public final void m15829h1() {
        int i10;
        DialogC0242a.a aVar = new DialogC0242a.a(this);
        aVar.setTitle(getResources().getString(2132018332));
        String string = this.f17283H0.getString("pref.using_playback_speed", "1x (Normal)");
        if (!string.equals("0.25x")) {
            if (string.equals("0.5x")) {
                i10 = 1;
            } else if (string.equals("0.75x")) {
                i10 = 2;
            } else if (string.equals("1x (Normal)")) {
                i10 = 3;
            } else if (string.equals("1.25x")) {
                i10 = 4;
            } else if (string.equals("1.5x")) {
                i10 = 5;
            } else if (string.equals("1.75x")) {
                i10 = 6;
            } else if (string.equals("2x")) {
                i10 = 7;
            }
            aVar.m863k(new CharSequence[]{"0.25x", "0.5x", "0.75x", "1x (Normal)", "1.25x", "1.5x", "1.75x", "2x"}, i10, new DialogInterfaceOnClickListenerC2786c(this));
            DialogC0242a create = aVar.create();
            this.f17315X0 = create;
            create.setOnDismissListener(new DialogInterfaceOnDismissListenerC2787d(this));
            this.f17315X0.show();
        }
        i10 = 0;
        aVar.m863k(new CharSequence[]{"0.25x", "0.5x", "0.75x", "1x (Normal)", "1.25x", "1.5x", "1.75x", "2x"}, i10, new DialogInterfaceOnClickListenerC2786c(this));
        DialogC0242a create2 = aVar.create();
        this.f17315X0 = create2;
        create2.setOnDismissListener(new DialogInterfaceOnDismissListenerC2787d(this));
        this.f17315X0.show();
    }

    /* renamed from: i1 */
    public final void m15830i1(String str) {
        SharedPreferences.Editor edit = this.f17283H0.edit();
        this.f17285I0 = edit;
        if (edit != null) {
            edit.putString("pref.using_playback_speed", str);
            this.f17285I0.apply();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: j1 */
    public final void m15831j1() {
        String str;
        String str2;
        boolean z10;
        String str3;
        StringBuilder sb2;
        String sb3;
        String str4;
        String str5;
        boolean z11;
        String str6;
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes;
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2;
        MediaInfo m23741a;
        C5947e c5947e;
        Intent intent;
        boolean z12;
        StringBuilder sb4;
        str = "";
        String string = this.f17268A.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        String string2 = this.f17268A.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        this.f17298P = this.f17276E.getString("allowedFormat", "");
        String string3 = this.f17268A.getString("serverUrl", "");
        String string4 = this.f17268A.getString("serverProtocol", "");
        String string5 = this.f17268A.getString("serverPortHttps", "");
        String string6 = this.f17268A.getString("serverPort", "");
        String string7 = this.f17268A.getString("serverPortRtmp", "");
        if (string4 != null) {
            switch (string4.hashCode()) {
                case 3213448:
                    if (string4.equals(HttpHost.DEFAULT_SCHEME_NAME)) {
                        z12 = false;
                        break;
                    }
                    z12 = -1;
                    break;
                case 3504631:
                    if (string4.equals("rmtp")) {
                        z12 = true;
                        break;
                    }
                    z12 = -1;
                    break;
                case 99617003:
                    if (string4.equals(ClientConstants.DOMAIN_SCHEME)) {
                        z12 = 2;
                        break;
                    }
                    z12 = -1;
                    break;
                default:
                    z12 = -1;
                    break;
            }
            switch (z12) {
                case false:
                    str2 = string3;
                    if (string3 != null) {
                        str2 = string3;
                        if (!string3.startsWith("http://")) {
                            sb4 = new StringBuilder();
                            sb4.append("http://");
                            sb4.append(string3);
                            str2 = sb4.toString();
                            break;
                        }
                    }
                    break;
                case true:
                    str2 = string3;
                    if (string3 != null) {
                        str2 = string3;
                        if (!string3.startsWith("rmtp://")) {
                            str2 = "rmtp://" + string3;
                        }
                    }
                    string6 = string7;
                    break;
                case true:
                    str2 = string3;
                    string6 = string5;
                    if (string3 != null) {
                        str2 = string3;
                        string6 = string5;
                        if (!string3.startsWith("https://")) {
                            str2 = "https://" + string3;
                            string6 = string5;
                            break;
                        }
                    }
                    break;
                default:
                    str2 = string3;
                    if (string3 != null) {
                        str2 = string3;
                        if (!string3.startsWith("http://")) {
                            str2 = string3;
                            if (!string3.startsWith("https://")) {
                                sb4 = new StringBuilder();
                                sb4.append("http://");
                                sb4.append(string3);
                                str2 = sb4.toString();
                                break;
                            }
                        }
                    }
                    break;
            }
        } else {
            string6 = "";
            str2 = string3;
        }
        this.f17351p0 = getIntent().getStringExtra("VIDEO_TITLE");
        this.f17343l0 = getIntent().getIntExtra("OPENED_STREAM_ID", 0);
        this.f17345m0 = getIntent().getIntExtra("STREAM_TOTAL_DURATION", 0);
        this.f17362v = getIntent().getStringExtra("VIDEO_URL");
        this.f17347n0 = getIntent().getIntExtra("VIDEO_NUM", 0);
        String stringExtra = getIntent().getStringExtra("STREAM_START_TIME");
        String stringExtra2 = getIntent().getStringExtra("STREAM_STOP_TIME");
        this.tv_episode_name.setText(this.f17351p0);
        String str7 = this.f17367x0;
        if (str7 == null || str7.equals("")) {
            String str8 = this.f17359t0;
            if (str8 != null) {
                if (str8.equals("catch_up")) {
                    String str9 = this.f17298P;
                    if ((str9 == null || str9.isEmpty() || this.f17298P.equals("") || !this.f17298P.equals(CookieSpecs.DEFAULT)) && !(((str4 = this.f17298P) != null && !str4.isEmpty() && !this.f17298P.equals("") && this.f17298P.equals("ts")) || (str5 = this.f17298P) == null || str5.isEmpty() || this.f17298P.equals("") || !this.f17298P.equals("m3u8"))) {
                        this.f17298P = ".m3u8";
                    } else {
                        this.f17298P = ".ts";
                    }
                }
                SharepreferenceDBHandler.m15372e0(this.f17359t0, this.f17340k);
                String str10 = this.f17359t0;
                str10.hashCode();
                switch (str10.hashCode()) {
                    case -1811604269:
                        if (str10.equals("movies_m3u")) {
                            z10 = false;
                            break;
                        }
                        z10 = -1;
                        break;
                    case -1068259517:
                        if (str10.equals("movies")) {
                            z10 = true;
                            break;
                        }
                        z10 = -1;
                        break;
                    case -905838985:
                        if (str10.equals("series")) {
                            z10 = 2;
                            break;
                        }
                        z10 = -1;
                        break;
                    case 48678559:
                        if (str10.equals("catch_up")) {
                            z10 = 3;
                            break;
                        }
                        z10 = -1;
                        break;
                    case 336662217:
                        if (str10.equals("loadurl")) {
                            z10 = 4;
                            break;
                        }
                        z10 = -1;
                        break;
                    case 781644544:
                        if (str10.equals("devicedata")) {
                            z10 = 5;
                            break;
                        }
                        z10 = -1;
                        break;
                    case 993558001:
                        if (str10.equals("recording")) {
                            z10 = 6;
                            break;
                        }
                        z10 = -1;
                        break;
                    default:
                        z10 = -1;
                        break;
                }
                switch (z10) {
                    case false:
                        this.f17362v = getIntent().getStringExtra("VIDEO_URL");
                        break;
                    case true:
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(str2);
                        sb5.append(":");
                        sb5.append(string6);
                        str3 = "/movie/";
                        sb2 = sb5;
                        sb2.append(str3);
                        sb2.append(string);
                        sb2.append("/");
                        sb2.append(string2);
                        sb2.append("/");
                        sb3 = sb2.toString();
                        this.f17364w = sb3;
                        break;
                    case true:
                        this.f17362v = getIntent().getStringExtra("VIDEO_URL");
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(str2);
                        sb6.append(":");
                        sb6.append(string6);
                        str3 = "/series/";
                        sb2 = sb6;
                        sb2.append(str3);
                        sb2.append(string);
                        sb2.append("/");
                        sb2.append(string2);
                        sb2.append("/");
                        sb3 = sb2.toString();
                        this.f17364w = sb3;
                        break;
                    case true:
                        this.f17347n0 = getIntent().getIntExtra("VIDEO_NUM", 0);
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(str2);
                        sb7.append(":");
                        sb7.append(string6);
                        sb7.append("/timeshift/");
                        sb7.append(string);
                        sb7.append("/");
                        sb7.append(string2);
                        sb7.append("/");
                        sb7.append(stringExtra2);
                        sb7.append("/");
                        sb7.append(stringExtra);
                        sb2 = sb7;
                        sb2.append("/");
                        sb3 = sb2.toString();
                        this.f17364w = sb3;
                        break;
                    case true:
                    case true:
                        this.f17371z0 = getIntent().getStringExtra("VIDEO_PATH");
                        break;
                    case true:
                        sb3 = getIntent().getStringExtra("VIDEO_PATH");
                        this.f17364w = sb3;
                        break;
                }
            }
        } else {
            this.f17369y0 = this.f17367x0;
            SharepreferenceDBHandler.m15372e0("local", this.f17340k);
        }
        String str11 = this.f17359t0;
        this.f17302R = (str11 == null || !str11.equalsIgnoreCase("recording")) ? C5255e.m26252s(this.f17364w) : this.f17364w;
        this.f17304S = new LiveStreamDBHandler(this);
        this.f17306T = new ArrayList<>();
        this.f17308U = new ArrayList<>();
        this.f17306T = VodAllCategoriesSingleton.m14909b().m14915g();
        String str12 = this.f17367x0;
        String str13 = InstructionFileId.DOT;
        try {
            if (str12 != null && !str12.equals("")) {
                LinearLayout linearLayout = this.ll_episodes;
                if (linearLayout != null) {
                    linearLayout.setVisibility(4);
                }
                LinearLayout linearLayout2 = this.ll_next_episode;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(4);
                }
                this.f17369y0 = this.f17367x0;
                C5947e c5947e2 = this.f17289K0;
                if (c5947e2 == null || !c5947e2.m29348c()) {
                    if (this.f17316Y.booleanValue()) {
                        C7920a.m34301l().m34315u(this.f17347n0);
                        String str14 = this.f17369y0;
                        String substring = str14.substring(str14.lastIndexOf("/") + 1);
                        this.tv_episode_name.setText(substring);
                        this.f17293M0 = this.f17369y0;
                        m15832k1();
                        this.mVideoView.m18910T1(this.f17369y0, true, substring, 0L, 0, "", null, 0, 0, this.f17300Q, "dfo");
                        nSTIJKPlayerEpisodes2 = this.mVideoView;
                        if (nSTIJKPlayerEpisodes2 != null) {
                            nSTIJKPlayerEpisodes2.f23706J = 0;
                            nSTIJKPlayerEpisodes2.f23714L = false;
                            nSTIJKPlayerEpisodes2.start();
                            return;
                        }
                        return;
                    }
                    return;
                }
                C5947e c5947e3 = this.f17289K0;
                String m13058R = (c5947e3 == null || c5947e3.m29290r() == null || this.f17289K0.m29290r().m31009j() == null || this.f17289K0.m29290r().m31009j().m13058R() == null) ? "" : this.f17289K0.m29290r().m31009j().m13058R();
                int ipAddress = ((WifiManager) getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress();
                String format = String.format("%d.%d.%d.%d", Integer.valueOf(ipAddress & 255), Integer.valueOf((ipAddress >> 8) & 255), Integer.valueOf((ipAddress >> 16) & 255), Integer.valueOf((ipAddress >> 24) & 255));
                int lastIndexOf = this.f17269A0.lastIndexOf(47);
                if (lastIndexOf > 1) {
                    str = this.f17269A0.substring(lastIndexOf + 1);
                    str13 = this.f17269A0.substring(0, lastIndexOf);
                }
                this.f17332g1.m23791b();
                this.f17332g1.m23790a(format, str13);
                String str15 = "http://" + format + ":8080/" + str;
                this.f17293M0 = str15;
                if (m13058R.equals(str15)) {
                    intent = new Intent(this.f17340k, (Class<?>) ExpandedControlsActivity.class);
                    this.f17340k.startActivity(intent);
                } else {
                    m23741a = C4718a.m23741a(str, "", "", 0, this.f17293M0, "videos/mp4", this.f17297O0, "", null);
                    c5947e = this.f17289K0;
                    C4718a.m23743c(0, true, m23741a, c5947e, this.f17340k);
                    return;
                }
            }
            String str16 = this.f17359t0;
            if (str16 != null) {
                str16.hashCode();
                switch (str16.hashCode()) {
                    case -1811604269:
                        if (str16.equals("movies_m3u")) {
                            z11 = false;
                            break;
                        }
                        z11 = -1;
                        break;
                    case -1068259517:
                        if (str16.equals("movies")) {
                            z11 = true;
                            break;
                        }
                        z11 = -1;
                        break;
                    case -905838985:
                        if (str16.equals("series")) {
                            z11 = 2;
                            break;
                        }
                        z11 = -1;
                        break;
                    case 48678559:
                        if (str16.equals("catch_up")) {
                            z11 = 3;
                            break;
                        }
                        z11 = -1;
                        break;
                    case 336662217:
                        if (str16.equals("loadurl")) {
                            z11 = 4;
                            break;
                        }
                        z11 = -1;
                        break;
                    case 781644544:
                        if (str16.equals("devicedata")) {
                            z11 = 5;
                            break;
                        }
                        z11 = -1;
                        break;
                    case 993558001:
                        if (str16.equals("recording")) {
                            z11 = 6;
                            break;
                        }
                        z11 = -1;
                        break;
                    default:
                        z11 = -1;
                        break;
                }
                switch (z11) {
                    case false:
                        if (this.mVideoView == null) {
                            str6 = "Something went wrong please try again.";
                            m15821Z0(str6);
                            break;
                        } else {
                            LinearLayout linearLayout3 = this.ll_episodes;
                            if (linearLayout3 != null) {
                                linearLayout3.setVisibility(4);
                            }
                            LinearLayout linearLayout4 = this.ll_next_episode;
                            if (linearLayout4 != null) {
                                linearLayout4.setVisibility(4);
                            }
                            this.tv_seek_right.setText("+10s");
                            this.tv_seek_left.setText("-10s");
                            m15832k1();
                            this.tv_episode_name.setText(this.f17351p0);
                            String str17 = this.f17362v;
                            this.f17293M0 = str17;
                            this.mVideoView.m18910T1(str17, true, this.f17351p0, 0L, 0, "", null, 0, 0, this.f17300Q, "nst");
                            nSTIJKPlayerEpisodes = this.mVideoView;
                            if (nSTIJKPlayerEpisodes == null) {
                            }
                            nSTIJKPlayerEpisodes.f23706J = 0;
                            nSTIJKPlayerEpisodes.f23714L = false;
                            nSTIJKPlayerEpisodes.start();
                            break;
                        }
                    case true:
                        LinearLayout linearLayout5 = this.ll_episodes;
                        if (linearLayout5 != null) {
                            linearLayout5.setVisibility(4);
                        }
                        LinearLayout linearLayout6 = this.ll_next_episode;
                        if (linearLayout6 != null) {
                            linearLayout6.setVisibility(4);
                        }
                        ArrayList<LiveStreamsDBModel> arrayList = this.f17306T;
                        if (arrayList != null && arrayList.size() != 0) {
                            m15823b1(this.f17306T, this.f17343l0);
                            break;
                        } else {
                            str6 = "No Movie Found";
                            m15821Z0(str6);
                            break;
                        }
                    case true:
                        List<GetEpisdoeDetailsCallback> list = this.f17310V;
                        if (list != null && list.size() != 0) {
                            m15825d1(this.f17310V, this.f17343l0);
                            break;
                        } else {
                            str6 = "No Series Found";
                            m15821Z0(str6);
                            break;
                        }
                        break;
                    case true:
                        if (this.mVideoView == null) {
                            str6 = "No Archive Found";
                            m15821Z0(str6);
                            break;
                        } else {
                            LinearLayout linearLayout7 = this.ll_episodes;
                            if (linearLayout7 != null) {
                                linearLayout7.setVisibility(4);
                            }
                            LinearLayout linearLayout8 = this.ll_next_episode;
                            if (linearLayout8 != null) {
                                linearLayout8.setVisibility(4);
                            }
                            this.tv_seek_right.setText("+60s");
                            this.tv_seek_left.setText("-60s");
                            m15832k1();
                            this.tv_episode_name.setText(this.f17351p0);
                            String valueOf = String.valueOf(Uri.parse(this.f17302R + this.f17343l0 + this.f17298P));
                            this.f17293M0 = valueOf;
                            this.mVideoView.m18910T1(valueOf, true, this.f17351p0, 0L, 0, "", null, 0, 0, this.f17300Q, "nst");
                            nSTIJKPlayerEpisodes = this.mVideoView;
                            if (nSTIJKPlayerEpisodes == null) {
                            }
                            nSTIJKPlayerEpisodes.f23706J = 0;
                            nSTIJKPlayerEpisodes.f23714L = false;
                            nSTIJKPlayerEpisodes.start();
                            break;
                        }
                    case true:
                    case true:
                        LinearLayout linearLayout9 = this.ll_episodes;
                        if (linearLayout9 != null) {
                            linearLayout9.setVisibility(4);
                        }
                        LinearLayout linearLayout10 = this.ll_next_episode;
                        if (linearLayout10 != null) {
                            linearLayout10.setVisibility(4);
                        }
                        if (this.f17316Y.booleanValue()) {
                            if (this.f17371z0.matches(".*(youtube|youtu.be).*")) {
                                startActivity(new Intent(this, (Class<?>) YouTubePlayerActivity.class).putExtra("you_tube_trailer", m15793S0(this.f17371z0)));
                                finish();
                                break;
                            } else {
                                C5947e c5947e4 = this.f17289K0;
                                if (c5947e4 == null || !c5947e4.m29348c()) {
                                    C7920a.m34301l().m34315u(this.f17347n0);
                                    String str18 = this.f17371z0;
                                    String substring2 = str18.substring(0, str18.lastIndexOf(InstructionFileId.DOT));
                                    String substring3 = substring2.substring(substring2.lastIndexOf("/") + 1);
                                    this.tv_episode_name.setText(substring3);
                                    m15832k1();
                                    String str19 = this.f17371z0;
                                    this.f17293M0 = str19;
                                    this.mVideoView.m18910T1(str19, true, substring3, 0L, 0, "", null, 0, 0, this.f17300Q, "devicedata");
                                    nSTIJKPlayerEpisodes2 = this.mVideoView;
                                    if (nSTIJKPlayerEpisodes2 != null) {
                                        nSTIJKPlayerEpisodes2.f23706J = 0;
                                        nSTIJKPlayerEpisodes2.f23714L = false;
                                        nSTIJKPlayerEpisodes2.start();
                                        break;
                                    }
                                } else {
                                    C5947e c5947e5 = this.f17289K0;
                                    String m13058R2 = (c5947e5 == null || c5947e5.m29290r() == null || this.f17289K0.m29290r().m31009j() == null || this.f17289K0.m29290r().m31009j().m13058R() == null) ? "" : this.f17289K0.m29290r().m31009j().m13058R();
                                    if (this.f17359t0.equals("loadurl")) {
                                        String str20 = this.f17371z0;
                                        this.f17269A0 = str20;
                                        int lastIndexOf2 = str20.lastIndexOf(47);
                                        str = lastIndexOf2 > 1 ? this.f17269A0.substring(lastIndexOf2 + 1) : "";
                                        String str21 = this.f17269A0;
                                        this.f17293M0 = str21;
                                        if (!m13058R2.equals(str21)) {
                                            m23741a = C4718a.m23741a(str, "", "", 0, this.f17293M0, "videos/mp4", this.f17297O0, "", null);
                                            c5947e = this.f17289K0;
                                            C4718a.m23743c(0, true, m23741a, c5947e, this.f17340k);
                                            break;
                                        } else {
                                            intent = new Intent(this.f17340k, (Class<?>) ExpandedControlsActivity.class);
                                            this.f17340k.startActivity(intent);
                                            break;
                                        }
                                    } else {
                                        int ipAddress2 = ((WifiManager) getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress();
                                        String format2 = String.format("%d.%d.%d.%d", Integer.valueOf(ipAddress2 & 255), Integer.valueOf((ipAddress2 >> 8) & 255), Integer.valueOf((ipAddress2 >> 16) & 255), Integer.valueOf((ipAddress2 >> 24) & 255));
                                        if (this.f17359t0.equals("devicedata")) {
                                            this.f17269A0 = this.f17371z0;
                                        }
                                        int lastIndexOf3 = this.f17269A0.lastIndexOf(47);
                                        if (lastIndexOf3 > 1) {
                                            str = this.f17269A0.substring(lastIndexOf3 + 1);
                                            str13 = this.f17269A0.substring(0, lastIndexOf3);
                                        }
                                        this.f17332g1.m23791b();
                                        this.f17332g1.m23790a(format2, str13);
                                        String str22 = "http://" + format2 + ":8080/" + str;
                                        this.f17293M0 = str22;
                                        if (m13058R2.equals(str22)) {
                                            intent = new Intent(this.f17340k, (Class<?>) ExpandedControlsActivity.class);
                                            this.f17340k.startActivity(intent);
                                        } else {
                                            m23741a = C4718a.m23741a(str, "", "", 0, this.f17293M0, "videos/mp4", this.f17297O0, "", null);
                                            c5947e = this.f17289K0;
                                            C4718a.m23743c(0, true, m23741a, c5947e, this.f17340k);
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case true:
                        LinearLayout linearLayout11 = this.ll_episodes;
                        if (linearLayout11 != null) {
                            linearLayout11.setVisibility(4);
                        }
                        LinearLayout linearLayout12 = this.ll_next_episode;
                        if (linearLayout12 != null) {
                            linearLayout12.setVisibility(4);
                        }
                        this.f17322c1 = new ArrayList<>();
                        m15805E0();
                        ArrayList<File> arrayList2 = this.f17322c1;
                        if (arrayList2 != null && arrayList2.size() != 0) {
                            m15824c1(this.f17322c1, this.f17347n0);
                            break;
                        } else {
                            str6 = "No Recording Found";
                            m15821Z0(str6);
                            break;
                        }
                }
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: k1 */
    public final void m15832k1() {
        try {
            if (this.mVideoView != null) {
                this.f17271B0 = this.f17340k.getSharedPreferences("currentSeekTime", 0);
                long currentPosition = this.mVideoView.getCurrentPosition();
                SharedPreferences sharedPreferences = this.f17340k.getSharedPreferences("currentSeekTime", 0);
                this.f17271B0 = sharedPreferences;
                SharedPreferences.Editor edit = sharedPreferences.edit();
                this.f17273C0 = edit;
                edit.putString("currentSeekTime", String.valueOf(currentPosition));
                this.f17273C0.apply();
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.mVideoView;
                if (nSTIJKPlayerEpisodes != null && currentPosition != -1 && currentPosition != 0) {
                    nSTIJKPlayerEpisodes.setCurrentPositionSeekbar(nSTIJKPlayerEpisodes.getCurrentPosition());
                    this.mVideoView.setProgress(true);
                    this.mVideoView.m18898H1(true);
                }
                String str = this.f17359t0;
                if (str == null || !str.equals("movies")) {
                    String str2 = this.f17359t0;
                    if (str2 != null && str2.equals("series") && ((this.mVideoView == null || C7920a.m34301l().m34305b() == null || !this.f17300Q.equals("m3u")) && C7920a.m34301l() != null && C7920a.m34301l().m34308k() != null && currentPosition != -1 && currentPosition != 0)) {
                        ArrayList<GetEpisdoeDetailsCallback> m27652c = this.f17370z.m27652c(C7920a.m34301l().m34308k());
                        this.f17309U0 = m27652c;
                        if (m27652c != null && m27652c.size() > 0) {
                            try {
                                int m15813P0 = m15813P0(this.f17310V, C5255e.m26215R(C7920a.m34301l().m34308k()));
                                GetEpisdoeDetailsCallback getEpisdoeDetailsCallback = new GetEpisdoeDetailsCallback();
                                getEpisdoeDetailsCallback.m14937G(this.f17310V.get(m15813P0).m14958j());
                                getEpisdoeDetailsCallback.m14948R(this.f17310V.get(m15813P0).m14969u());
                                getEpisdoeDetailsCallback.m14972x(this.f17310V.get(m15813P0).m14951c());
                                getEpisdoeDetailsCallback.m14970v(this.f17310V.get(m15813P0).m14949a());
                                getEpisdoeDetailsCallback.m14944N(this.f17310V.get(m15813P0).m14965q());
                                getEpisdoeDetailsCallback.m14971w(this.f17310V.get(m15813P0).m14950b());
                                getEpisdoeDetailsCallback.m14934D(String.valueOf(currentPosition));
                                getEpisdoeDetailsCallback.m14945O(this.f17310V.get(m15813P0).m14966r());
                                getEpisdoeDetailsCallback.m14938H(this.f17310V.get(m15813P0).m14959k());
                                getEpisdoeDetailsCallback.m14941K(this.f17310V.get(m15813P0).m14962n());
                                getEpisdoeDetailsCallback.m14940J(this.f17310V.get(m15813P0).m14961m());
                                getEpisdoeDetailsCallback.m14947Q(this.f17310V.get(m15813P0).m14968t());
                                getEpisdoeDetailsCallback.m14943M(this.f17310V.get(m15813P0).m14964p());
                                getEpisdoeDetailsCallback.m14935E(this.f17310V.get(m15813P0).m14956h());
                                getEpisdoeDetailsCallback.m14946P(this.f17310V.get(m15813P0).m14967s());
                                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = this.mVideoView;
                                getEpisdoeDetailsCallback.m14933C(nSTIJKPlayerEpisodes2 != null ? String.valueOf(nSTIJKPlayerEpisodes2.getDuration() / 1000) : this.f17310V.get(m15813P0).m14954f());
                                this.f17370z.m27651b(this.f17310V.get(m15813P0).m14958j());
                                this.f17370z.m27658i(this.f17340k, this.f17310V.get(m15813P0).m14966r());
                                this.f17370z.m27656g(this.f17340k, getEpisdoeDetailsCallback);
                            } catch (Exception e10) {
                            }
                        }
                    }
                } else {
                    m15833l1(1);
                }
            }
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes3 = this.mVideoView;
            if (nSTIJKPlayerEpisodes3 != null) {
                if (nSTIJKPlayerEpisodes3.m18892B1()) {
                    this.mVideoView.m18943r1();
                } else {
                    this.mVideoView.m18924g2();
                    this.mVideoView.m18896F1(true);
                    this.mVideoView.m18919c2();
                }
                IjkMediaPlayer.native_profileEnd();
            }
        } catch (Exception e11) {
        }
    }

    /* renamed from: l1 */
    public final void m15833l1(int i10) {
        long currentPosition;
        ArrayList<LiveStreamsDBModel> m15814Q0;
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.mVideoView;
        if (nSTIJKPlayerEpisodes != null) {
            if (i10 == 0) {
                this.f17271B0 = this.f17340k.getSharedPreferences("currentSeekTime", 0);
                currentPosition = this.mVideoView.getCurrentPosition();
                SharedPreferences sharedPreferences = this.f17340k.getSharedPreferences("currentSeekTime", 0);
                this.f17271B0 = sharedPreferences;
                SharedPreferences.Editor edit = sharedPreferences.edit();
                this.f17273C0 = edit;
                edit.putString("currentSeekTime", String.valueOf(currentPosition));
                this.f17273C0.apply();
            } else {
                currentPosition = nSTIJKPlayerEpisodes.getCurrentPosition();
            }
            new LiveStreamsDBModel();
            if (this.f17300Q.equals("m3u")) {
                m15815R0(String.valueOf(Uri.parse(this.f17362v)), SharepreferenceDBHandler.m15337A(this.f17340k));
                return;
            }
            if (this.mVideoView == null || C7920a.m34301l().m34311o() == -1 || currentPosition == -1 || currentPosition == 0 || (m15814Q0 = m15814Q0(this.f17343l0, SharepreferenceDBHandler.m15337A(this.f17340k))) == null || m15814Q0.size() <= 0) {
                return;
            }
            try {
                int m15812O0 = m15812O0(this.f17306T, this.f17343l0);
                m15810K0(this.f17306T.get(m15812O0).m14811R());
                m15834m1(this.f17340k, this.f17306T, m15812O0, currentPosition);
            } catch (Exception e10) {
            }
        }
    }

    /* renamed from: m1 */
    public void m15834m1(Context context, ArrayList<LiveStreamsDBModel> arrayList, int i10, long j10) {
        long j11;
        String m14805L = arrayList.get(i10).m14805L();
        String name = arrayList.get(i10).getName();
        String m14812S = arrayList.get(i10).m14812S();
        String m14811R = arrayList.get(i10).m14811R();
        String m14810Q = arrayList.get(i10).m14810Q();
        String m14798E = arrayList.get(i10).m14798E();
        String m14823d = arrayList.get(i10).m14823d();
        String m14827g = arrayList.get(i10).m14827g();
        String m14796A = arrayList.get(i10).m14796A();
        String m14813T = arrayList.get(i10).m14813T();
        String m14797D = arrayList.get(i10).m14797D();
        String m14814U = arrayList.get(i10).m14814U();
        String m14815V = arrayList.get(i10).m14815V();
        String m14830i = arrayList.get(i10).m14830i();
        String m14809P = arrayList.get(i10).m14809P();
        String m14802I = arrayList.get(i10).m14802I();
        String m14846x = arrayList.get(i10).m14846x();
        arrayList.get(i10).m14803J();
        String valueOf = String.valueOf(arrayList.get(i10).m14808O());
        String valueOf2 = String.valueOf(arrayList.get(i10).m14807N());
        PanelAvailableChannelsPojo panelAvailableChannelsPojo = new PanelAvailableChannelsPojo();
        panelAvailableChannelsPojo.m15428H(Integer.valueOf(C5255e.m26215R(m14805L)));
        panelAvailableChannelsPojo.m15427G(name);
        panelAvailableChannelsPojo.m15434N(m14812S);
        panelAvailableChannelsPojo.m15433M(m14811R);
        panelAvailableChannelsPojo.m15432L(m14810Q);
        panelAvailableChannelsPojo.m15423C(m14798E);
        panelAvailableChannelsPojo.m15461w(m14823d);
        panelAvailableChannelsPojo.m15462x(m14827g);
        panelAvailableChannelsPojo.m15421A(m14796A);
        panelAvailableChannelsPojo.m15435O(Integer.valueOf(C5255e.m26215R(m14813T)));
        panelAvailableChannelsPojo.m15422B(m14797D);
        panelAvailableChannelsPojo.m15436P(m14814U);
        panelAvailableChannelsPojo.m15437Q(m14815V);
        panelAvailableChannelsPojo.m15463y(m14830i);
        panelAvailableChannelsPojo.m15431K(m14809P);
        panelAvailableChannelsPojo.m15424D(m14802I);
        panelAvailableChannelsPojo.m15464z(m14846x);
        panelAvailableChannelsPojo.m15438R(SharepreferenceDBHandler.m15337A(context));
        try {
            panelAvailableChannelsPojo.m15426F(j10);
        } catch (Exception e10) {
            panelAvailableChannelsPojo.m15426F(0L);
        }
        int i11 = this.f17345m0;
        if (i11 != 0) {
            try {
                panelAvailableChannelsPojo.m15425E(i11);
            } catch (Exception e11) {
                j11 = 0;
            }
            panelAvailableChannelsPojo.m15430J(valueOf);
            panelAvailableChannelsPojo.m15429I(valueOf2);
            this.f17368y.m15307f(panelAvailableChannelsPojo);
        }
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.mVideoView;
        j11 = 0;
        if (nSTIJKPlayerEpisodes != null) {
            int duration = nSTIJKPlayerEpisodes.getDuration() / 1000;
            this.f17345m0 = duration;
            j11 = duration;
        }
        panelAvailableChannelsPojo.m15425E(j11);
        panelAvailableChannelsPojo.m15430J(valueOf);
        panelAvailableChannelsPojo.m15429I(valueOf2);
        this.f17368y.m15307f(panelAvailableChannelsPojo);
    }

    /* renamed from: n1 */
    public final void m15835n1() {
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f17340k, 1);
            this.f17338j = gridLayoutManager;
            this.myRecyclerView.setLayoutManager(gridLayoutManager);
            this.myRecyclerView.setItemAnimator(new C0704c());
        }
    }

    /* renamed from: o1 */
    public final void m15836o1() {
        this.f17307T0 = new C2785b(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        RelativeLayout relativeLayout;
        RelativeLayout relativeLayout2 = this.rl_movie_poster_box;
        if (relativeLayout2 != null && relativeLayout2.getVisibility() == 0) {
            m15844w1();
            return;
        }
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.mVideoView;
        if (nSTIJKPlayerEpisodes != null) {
            nSTIJKPlayerEpisodes.m18949x1();
        }
        RelativeLayout relativeLayout3 = this.rl_next_episode;
        if (relativeLayout3 != null && relativeLayout3.getVisibility() == 0) {
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = this.mVideoView;
            if (nSTIJKPlayerEpisodes2 != null) {
                nSTIJKPlayerEpisodes2.m18946u1();
                return;
            }
            return;
        }
        RelativeLayout relativeLayout4 = this.rl_episodes_box;
        if (relativeLayout4 == null || relativeLayout4.getVisibility() != 0) {
            m15843v1();
            if (this.rl_settings_box.getVisibility() != 0) {
                if (this.f17363v0.getVisibility() != 0) {
                    C5251a.f30023V = true;
                    if (this.f17281G0.equals("mobile") && this.f17320a1 && this.f17329f1) {
                        try {
                            m15819X0();
                            return;
                        } catch (Exception e10) {
                        }
                    }
                    super.onBackPressed();
                    return;
                }
                if (this.f17363v0.getVisibility() == 0) {
                    this.f17363v0.startAnimation(this.f17354r);
                    if (this.ll_brightness.getVisibility() == 0) {
                        this.ll_brightness.startAnimation(this.f17354r);
                    }
                    if (this.tv_seek_left.getVisibility() == 0) {
                        this.tv_seek_left.startAnimation(this.f17354r);
                    }
                    if (this.ll_pause_play.getVisibility() == 0) {
                        this.ll_pause_play.startAnimation(this.f17354r);
                    }
                    if (this.tv_seek_right.getVisibility() == 0) {
                        this.tv_seek_right.startAnimation(this.f17354r);
                    }
                    if (this.ll_volume.getVisibility() == 0) {
                        this.ll_volume.startAnimation(this.f17354r);
                    }
                    this.f17363v0.setVisibility(8);
                    if (this.ll_brightness.getVisibility() == 0) {
                        this.ll_brightness.setVisibility(8);
                    }
                    if (this.tv_seek_left.getVisibility() == 0) {
                        this.tv_seek_left.setVisibility(8);
                    }
                    if (this.ll_pause_play.getVisibility() == 0) {
                        this.ll_pause_play.setVisibility(8);
                    }
                    if (this.tv_seek_right.getVisibility() == 0) {
                        this.tv_seek_right.setVisibility(8);
                    }
                    if (this.ll_volume.getVisibility() == 0) {
                        this.ll_volume.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            }
            this.rl_settings_box.startAnimation(this.f17358t);
            relativeLayout = this.rl_settings_box;
        } else {
            this.rl_episodes_box.startAnimation(this.f17354r);
            relativeLayout = this.rl_episodes_box;
        }
        relativeLayout.setVisibility(8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03f3  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onClick(android.view.View r15) {
        /*
            Method dump skipped, instructions count: 2427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.HoneyPlayer.onClick(android.view.View):void");
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m15804D0(configuration);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0127, code lost:
    
        if (r48 == null) goto L35;
     */
    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r48) {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.HoneyPlayer.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onDestroy() {
        TextView textView;
        super.onDestroy();
        try {
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.mVideoView;
            if (nSTIJKPlayerEpisodes != null && (textView = nSTIJKPlayerEpisodes.f23820q1) != null) {
                textView.performClick();
            }
        } catch (Exception e10) {
            Log.e("fsgd", "fdfh", e10);
        }
        try {
            m15832k1();
        } catch (Exception e11) {
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes;
        boolean z10 = keyEvent.getRepeatCount() == 0;
        String str = this.f17359t0;
        if (str != null && str.equals("series") && this.f17281G0.equals("tv") && i10 != 4) {
            m15844w1();
            if (this.mVideoView.getPlayerIsPrepared() && (nSTIJKPlayerEpisodes = this.mVideoView) != null && !nSTIJKPlayerEpisodes.isPlaying()) {
                m15841t1(Constants.MAXIMUM_UPLOAD_PARTS);
            }
        }
        if (i10 == 46) {
            return true;
        }
        if (i10 != 62) {
            if (i10 != 66) {
                if (i10 != 79 && i10 != 85 && i10 != 86) {
                    if (i10 != 89) {
                        if (i10 != 90) {
                            if (i10 != 126 && i10 != 127) {
                                if (i10 != 274) {
                                    if (i10 != 275) {
                                        switch (i10) {
                                            case 19:
                                                m15843v1();
                                                this.mVideoView.m18920d();
                                                if (this.rl_settings_box.getVisibility() == 0 || this.rl_episodes_box.getVisibility() == 0 || this.rl_next_episode.getVisibility() == 0 || this.rl_next_episode.getVisibility() == 0) {
                                                    return true;
                                                }
                                                if (this.f17363v0.getVisibility() == 8) {
                                                    this.f17363v0.startAnimation(this.f17352q);
                                                    this.f17363v0.setVisibility(0);
                                                    this.iv_play.requestFocus();
                                                    this.iv_pause.requestFocus();
                                                }
                                                m15806F0(TFTP.DEFAULT_TIMEOUT);
                                                return true;
                                            case 20:
                                                m15843v1();
                                                this.mVideoView.m18920d();
                                                if (this.rl_settings_box.getVisibility() == 0 || this.rl_episodes_box.getVisibility() == 0 || this.rl_next_episode.getVisibility() == 0 || this.rl_next_episode.getVisibility() == 0) {
                                                    return true;
                                                }
                                                if (this.f17363v0.getVisibility() == 8) {
                                                    this.f17363v0.startAnimation(this.f17352q);
                                                    this.f17363v0.setVisibility(0);
                                                    this.iv_play.requestFocus();
                                                    this.iv_pause.requestFocus();
                                                }
                                                m15806F0(TFTP.DEFAULT_TIMEOUT);
                                                return true;
                                            case 21:
                                                m15843v1();
                                                this.mVideoView.m18920d();
                                                if (this.rl_settings_box.getVisibility() == 0 || this.rl_episodes_box.getVisibility() == 0) {
                                                    return false;
                                                }
                                                if (this.rl_next_episode.getVisibility() == 0 || this.rl_next_episode.getVisibility() == 0) {
                                                    return true;
                                                }
                                                if (this.f17363v0.getVisibility() == 8) {
                                                    this.f17363v0.startAnimation(this.f17352q);
                                                    this.f17363v0.setVisibility(0);
                                                    if (!this.hp_seekbar.isFocused()) {
                                                        this.hp_seekbar.requestFocus();
                                                    }
                                                }
                                                if (this.hp_seekbar.isFocused()) {
                                                    m15844w1();
                                                    return true;
                                                }
                                                m15806F0(TFTP.DEFAULT_TIMEOUT);
                                                return true;
                                            case 22:
                                                m15843v1();
                                                this.mVideoView.m18920d();
                                                if (this.rl_settings_box.getVisibility() == 0 || this.rl_episodes_box.getVisibility() == 0) {
                                                    return false;
                                                }
                                                if (this.rl_next_episode.getVisibility() == 0 || this.rl_next_episode.getVisibility() == 0) {
                                                    return true;
                                                }
                                                if (this.f17363v0.getVisibility() == 8) {
                                                    this.f17363v0.startAnimation(this.f17352q);
                                                    this.f17363v0.setVisibility(0);
                                                    if (!this.hp_seekbar.isFocused()) {
                                                        this.hp_seekbar.requestFocus();
                                                    }
                                                }
                                                if (this.hp_seekbar.isFocused()) {
                                                    m15844w1();
                                                    return true;
                                                }
                                                m15806F0(TFTP.DEFAULT_TIMEOUT);
                                                return true;
                                            case 23:
                                                break;
                                            default:
                                                return super.onKeyUp(i10, keyEvent);
                                        }
                                    }
                                }
                            }
                        }
                        try {
                            m15843v1();
                            if (this.f17363v0.getVisibility() == 8) {
                                this.f17363v0.startAnimation(this.f17352q);
                                this.f17363v0.setVisibility(0);
                                if (!this.hp_seekbar.isFocused()) {
                                    this.hp_seekbar.requestFocus();
                                }
                            }
                            m15806F0(TFTP.DEFAULT_TIMEOUT);
                            this.hp_seekbar.setProgress(this.hp_seekbar.getProgress() + 10);
                            this.mVideoView.m18901K1(this.hp_seekbar.getProgress());
                            return true;
                        } catch (Exception e10) {
                            return true;
                        }
                    }
                    try {
                        m15843v1();
                        if (this.f17363v0.getVisibility() == 8) {
                            this.f17363v0.startAnimation(this.f17352q);
                            this.f17363v0.setVisibility(0);
                            if (!this.hp_seekbar.isFocused()) {
                                this.hp_seekbar.requestFocus();
                            }
                        }
                        m15806F0(TFTP.DEFAULT_TIMEOUT);
                        this.hp_seekbar.setProgress(this.hp_seekbar.getProgress() - 10);
                        this.mVideoView.m18901K1(this.hp_seekbar.getProgress());
                        return true;
                    } catch (Exception e11) {
                        return true;
                    }
                }
            }
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = this.mVideoView;
            if (nSTIJKPlayerEpisodes2 == null || !nSTIJKPlayerEpisodes2.getPlayerIsPrepared()) {
                m15847z1();
                return true;
            }
            if (this.rl_settings_box.getVisibility() != 8) {
                return true;
            }
            (this.mVideoView.isPlaying() ? this.iv_pause : this.iv_play).performClick();
            return true;
        }
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes3 = this.mVideoView;
        if (nSTIJKPlayerEpisodes3 == null || !nSTIJKPlayerEpisodes3.getPlayerIsPrepared()) {
            return true;
        }
        ((!z10 || this.mVideoView.isPlaying()) ? this.iv_pause : this.iv_play).performClick();
        return true;
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        intent.putExtra("BUNDLE_KEY_NEW_INTENT_CALLED", true);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        String str = this.f17359t0;
        if (str == null || !str.equals("movies")) {
            String str2 = this.f17359t0;
            if (str2 != null && str2.equals("series")) {
                m15809J0();
            }
        } else {
            m15833l1(0);
        }
        getIntent().getAction();
        try {
            C5938b c5938b = this.f17291L0;
            if (c5938b != null) {
                c5938b.m29243c().m29360e(this.f17307T0, C5947e.class);
            }
        } catch (Exception e10) {
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            if (z10) {
                NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.mVideoView;
                if (nSTIJKPlayerEpisodes != null && nSTIJKPlayerEpisodes.f23783h0 != null) {
                    nSTIJKPlayerEpisodes.setShowOrHideSubtitles("gone");
                    this.mVideoView.f23783h0.setVisibility(8);
                }
                C2789f c2789f = new C2789f(this);
                this.f17317Y0 = c2789f;
                registerReceiver(c2789f, new IntentFilter("media_control"));
                return;
            }
            unregisterReceiver(this.f17317Y0);
            this.f17319Z0 = false;
            this.f17317Y0 = null;
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes2 = this.mVideoView;
            if (nSTIJKPlayerEpisodes2 != null && nSTIJKPlayerEpisodes2.f23783h0 != null) {
                nSTIJKPlayerEpisodes2.setShowOrHideSubtitles("visible");
                this.mVideoView.f23783h0.setVisibility(0);
                this.mVideoView.m18949x1();
            }
            NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes3 = this.mVideoView;
            if (nSTIJKPlayerEpisodes3 != null) {
                nSTIJKPlayerEpisodes3.isPlaying();
            }
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        AppOpsManager appOpsManager;
        super.onResume();
        Context context = this.f17340k;
        boolean z10 = true;
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("auto_start", 0);
            this.f17326e1 = sharedPreferences;
            boolean z11 = sharedPreferences.getBoolean("picinpic", C5251a.f30033c0);
            this.f17329f1 = z11;
            if (z11 && this.f17281G0.equals("mobile")) {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 26) {
                    this.f17321b1 = new PictureInPictureParams$Builder();
                }
                if (i10 >= 26) {
                    try {
                        if (getPackageManager().hasSystemFeature("android.software.picture_in_picture") && (appOpsManager = (AppOpsManager) this.f17340k.getSystemService("appops")) != null && appOpsManager.checkOpNoThrow("android:picture_in_picture", Process.myUid(), this.f17340k.getPackageName()) == 0) {
                            this.f17320a1 = true;
                        }
                    } catch (Exception e10) {
                    }
                }
            }
        }
        String str = this.f17359t0;
        if (str == null || !str.equals("series")) {
            String str2 = this.f17359t0;
            if (str2 != null && str2.equals("movies")) {
                Intent intent = getIntent();
                if (intent == null || !intent.getBooleanExtra("BUNDLE_KEY_NEW_INTENT_CALLED", false)) {
                    z10 = false;
                }
                if (z10) {
                    intent.putExtra("BUNDLE_KEY_NEW_INTENT_CALLED", false);
                    setIntent(intent);
                    if (getIntent().getIntExtra("OPENED_STREAM_ID", 0) != this.f17343l0) {
                        this.f17306T = VodAllCategoriesSingleton.m14909b().m14915g();
                        m15831j1();
                    }
                }
            }
        } else {
            Intent intent2 = getIntent();
            if (intent2 != null && intent2.getBooleanExtra("BUNDLE_KEY_NEW_INTENT_CALLED", false)) {
                intent2.putExtra("BUNDLE_KEY_NEW_INTENT_CALLED", false);
                setIntent(intent2);
                if (getIntent().getIntExtra("OPENED_STREAM_ID", 0) != this.f17343l0) {
                    this.f17310V = EpisodesUsingSinglton.m14753c().m14755b();
                    m15831j1();
                }
            }
        }
        C5255e.m26233f(this.f17340k);
        NSTIJKPlayerEpisodes nSTIJKPlayerEpisodes = this.mVideoView;
        if (nSTIJKPlayerEpisodes != null) {
            nSTIJKPlayerEpisodes.m18949x1();
            if (this.f17279F0) {
                f17265l1 = false;
            }
        }
        C5938b c5938b = this.f17291L0;
        if (c5938b != null) {
            c5938b.m29243c().m29356a(this.f17307T0, C5947e.class);
        }
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onStop() {
        super.onStop();
        try {
            m15832k1();
            if (this.f17281G0.equals("mobile") && this.f17320a1 && this.f17329f1) {
                finishAndRemoveTask();
            }
        } catch (Exception e10) {
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        if (this.f17281G0.equals("mobile") && this.f17320a1 && this.f17329f1 && !isInPictureInPictureMode()) {
            try {
                m15819X0();
                this.f17319Z0 = true;
            } catch (Exception e10) {
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            m15804D0(getResources().getConfiguration());
        }
    }

    /* renamed from: p1 */
    public final void m15837p1() {
        this.f17363v0.startAnimation(this.f17354r);
        this.f17363v0.setVisibility(8);
        this.rl_episodes_box.startAnimation(this.f17352q);
        this.rl_episodes_box.setVisibility(0);
        List<GetEpisdoeDetailsCallback> list = this.f17333h;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.tv_current_season.setText(getResources().getString(2132018529) + " - " + this.f17333h.get(0).m14964p());
        try {
            m15835n1();
            EpisodeDetailAdapter episodeDetailAdapter = new EpisodeDetailAdapter(this.f17340k, null, null, null, "from_player", this.f17281G0);
            this.f17336i = episodeDetailAdapter;
            this.myRecyclerView.setAdapter(episodeDetailAdapter);
            this.myRecyclerView.requestFocus();
        } catch (Exception e10) {
        }
    }

    /* renamed from: q1 */
    public void m15838q1() {
        if (f17266m1 || m15808H0() || this.rl_settings_box.getVisibility() != 8 || this.f17363v0.getVisibility() != 8) {
            return;
        }
        this.f17363v0.startAnimation(this.f17352q);
        this.f17363v0.setVisibility(0);
    }

    /* renamed from: r1 */
    public void m15839r1() {
        if (f17266m1 || m15808H0() || this.f17363v0.getVisibility() != 8) {
            return;
        }
        this.f17363v0.startAnimation(this.f17352q);
        this.f17363v0.setVisibility(0);
        if (this.ll_brightness.getVisibility() == 8) {
            this.ll_brightness.startAnimation(this.f17352q);
            this.ll_brightness.setVisibility(0);
        }
        if (this.tv_seek_left.getVisibility() == 8) {
            this.tv_seek_left.startAnimation(this.f17352q);
            this.tv_seek_left.setVisibility(0);
        }
        if (this.ll_pause_play.getVisibility() == 8) {
            this.ll_pause_play.startAnimation(this.f17352q);
            this.ll_pause_play.setVisibility(0);
        }
        if (this.tv_seek_right.getVisibility() == 8) {
            this.tv_seek_right.startAnimation(this.f17352q);
            this.tv_seek_right.setVisibility(0);
        }
        if (this.ll_volume.getVisibility() == 8) {
            this.ll_volume.startAnimation(this.f17352q);
            this.ll_volume.setVisibility(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0134  */
    /* renamed from: s1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m15840s1() {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.HoneyPlayer.m15840s1():void");
    }

    /* renamed from: t1 */
    public void m15841t1(int i10) {
        RunnableC2792i runnableC2792i = new RunnableC2792i(this);
        this.f17313W0 = runnableC2792i;
        this.f17311V0.postDelayed(runnableC2792i, i10);
    }

    /* renamed from: u1 */
    public final void m15842u1() {
        if (this.rl_settings_box.getVisibility() == 8) {
            this.rl_settings_box.startAnimation(this.f17356s);
            this.rl_settings_box.setVisibility(0);
            this.iv_back_settings.requestFocus();
        }
    }

    /* renamed from: v1 */
    public void m15843v1() {
        Handler handler;
        if (f17266m1 || m15808H0() || (handler = this.mVideoView.f23704I1) == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    /* renamed from: w1 */
    public void m15844w1() {
        Handler handler = this.f17311V0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        RelativeLayout relativeLayout = this.rl_movie_poster_box;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
    }

    /* renamed from: x1 */
    public final int m15845x1(int i10, int i11) {
        return this.f17368y.m15303D0(String.valueOf(i10), i11);
    }

    /* renamed from: y1 */
    public final int m15846y1(String str, int i10) {
        return this.f17304S.m15231l2(str, i10);
    }

    /* renamed from: z1 */
    public final void m15847z1() {
        m15843v1();
        if (this.f17363v0.getVisibility() == 0) {
            m15816T0();
        } else {
            m15838q1();
            m15806F0(TFTP.DEFAULT_TIMEOUT);
        }
    }
}

package com.maxdigitall.maxdigitaliptvbox.view.demo;

import android.R;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Dialog;
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
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.app.DialogC0242a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.mediarouter.app.MediaRouteButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.google.android.exoplayer2.p048ui.PlayerView;
import com.google.android.material.appbar.AppBarLayout;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteM3UModel;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamCategoryIdDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.ExternalPlayerDataBase;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.MultiUserDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.PasswordStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.ExternalPlayerModelClass;
import com.maxdigitall.maxdigitaliptvbox.view.activity.NewDashboardActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.PlayExternalPlayerActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.SettingsActivity;
import com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity;
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import nf.C6783a;
import org.apache.commons.net.tftp.TFTP;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.protocol.HttpRequestExecutor;
import p009a8.C0083a1;
import p009a8.C0103k;
import p027b9.InterfaceC0854m;
import p030c0.C0936d;
import p059d9.C4372l;
import p059d9.InterfaceC4370k;
import p078e9.C4670d0;
import p078e9.C4682p;
import p082ef.C4718a;
import p151if.C5251a;
import p151if.C5255e;
import p200l9.C5782l;
import p203lf.C5864q;
import p203lf.C5865r;
import p203lf.C5867t;
import p216m9.C5938b;
import p216m9.C5947e;
import p216m9.InterfaceC5950f;
import p216m9.InterfaceC5993u;
import p218mf.C6588b;
import p218mf.C6597k;
import p235o0.C6845p;
import p267p6.AbstractC7574e2;
import p267p6.C7561b1;
import p267p6.C7562b2;
import p267p6.C7565c1;
import p267p6.C7597l1;
import p267p6.C7603n1;
import p267p6.C7609p1;
import p267p6.C7612q1;
import p267p6.InterfaceC7606o1;
import p267p6.InterfaceC7639z1;
import p268p7.AbstractC7654o;
import p268p7.C7653n;
import p268p7.C7661v;
import p283q7.C7839a;
import p290qf.C7920a;
import p301r6.C7972d;
import p347u6.C8795a;
import p402x9.C9691a;
import p421y8.AbstractC9886j;
import p421y8.C9882f;
import p421y8.C9888l;
import p428yg.C10014t;
import pf.C7707c;
import pf.C7709e;
import pf.C7711g;
import wf.C9572b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity.class */
public class NSTEXOPlayerSkyActivity extends ActivityC0243b implements SurfaceHolder.Callback, View.OnClickListener {

    /* renamed from: X3 */
    public static SharedPreferences f21337X3;

    /* renamed from: Y3 */
    public static SharedPreferences f21338Y3;

    /* renamed from: a4 */
    public static String f21340a4;

    /* renamed from: b4 */
    public static String f21341b4;

    /* renamed from: d4 */
    public static ProgressBar f21343d4;

    /* renamed from: A0 */
    public ArrayList<LiveStreamsDBModel> f21345A0;

    /* renamed from: A1 */
    public int f21346A1;

    /* renamed from: A2 */
    public SharedPreferences f21347A2;

    /* renamed from: A3 */
    public C7562b2 f21348A3;

    /* renamed from: B0 */
    public ArrayList<LiveStreamsDBModel> f21350B0;

    /* renamed from: B2 */
    public SharedPreferences.Editor f21352B2;

    /* renamed from: B3 */
    public InterfaceC0854m.a f21353B3;

    /* renamed from: C1 */
    public DatabaseHandler f21356C1;

    /* renamed from: C2 */
    public Boolean f21357C2;

    /* renamed from: C3 */
    public C9882f f21358C3;

    /* renamed from: D0 */
    public ArrayList<LiveStreamCategoryIdDBModel> f21360D0;

    /* renamed from: D1 */
    public SharedPreferences.Editor f21361D1;

    /* renamed from: D2 */
    public Boolean f21362D2;

    /* renamed from: D3 */
    public C9882f.d f21363D3;

    /* renamed from: E */
    public int f21364E;

    /* renamed from: E0 */
    public ArrayList<PasswordStatusDBModel> f21365E0;

    /* renamed from: E1 */
    public SharedPreferences.Editor f21366E1;

    /* renamed from: E2 */
    public Boolean f21367E2;

    /* renamed from: E3 */
    public Uri f21368E3;

    /* renamed from: F */
    public String f21369F;

    /* renamed from: F0 */
    public SharedPreferences f21370F0;

    /* renamed from: F1 */
    public TextView f21371F1;

    /* renamed from: F2 */
    public Boolean f21372F2;

    /* renamed from: F3 */
    public int f21373F3;

    /* renamed from: G */
    public String f21374G;

    /* renamed from: G0 */
    public SharedPreferences.Editor f21375G0;

    /* renamed from: G1 */
    public String f21376G1;

    /* renamed from: G2 */
    public Boolean f21377G2;

    /* renamed from: G3 */
    public int f21378G3;

    /* renamed from: H */
    public String f21379H;

    /* renamed from: H0 */
    public ArrayList<FavouriteDBModel> f21380H0;

    /* renamed from: H1 */
    public TextView f21381H1;

    /* renamed from: H2 */
    public Boolean f21382H2;

    /* renamed from: H3 */
    public boolean f21383H3;

    /* renamed from: I */
    public RelativeLayout f21384I;

    /* renamed from: I0 */
    public ArrayList<FavouriteM3UModel> f21385I0;

    /* renamed from: I1 */
    public Handler f21386I1;

    /* renamed from: I2 */
    public C6783a f21387I2;

    /* renamed from: I3 */
    public boolean f21388I3;

    /* renamed from: J */
    public ListView f21389J;

    /* renamed from: J0 */
    public RecyclerView f21390J0;

    /* renamed from: J1 */
    public Handler f21391J1;

    /* renamed from: J2 */
    public Handler f21392J2;

    /* renamed from: J3 */
    public GestureDetector f21393J3;

    /* renamed from: K */
    public ListView f21394K;

    /* renamed from: K0 */
    public ProgressBar f21395K0;

    /* renamed from: K1 */
    public Handler f21396K1;

    /* renamed from: K2 */
    public InterfaceC5993u<C5947e> f21397K2;

    /* renamed from: K3 */
    public AudioManager f21398K3;

    /* renamed from: L */
    public ArrayList<LiveStreamsDBModel> f21399L;

    /* renamed from: L0 */
    public Toolbar f21400L0;

    /* renamed from: L1 */
    public Handler f21401L1;

    /* renamed from: L2 */
    public C5947e f21402L2;

    /* renamed from: L3 */
    public float f21403L3;

    /* renamed from: M0 */
    public SearchView f21405M0;

    /* renamed from: M1 */
    public Handler f21406M1;

    /* renamed from: M2 */
    public C5938b f21407M2;

    /* renamed from: M3 */
    public int f21408M3;

    /* renamed from: N0 */
    public TextView f21410N0;

    /* renamed from: N1 */
    public SharedPreferences.Editor f21411N1;

    /* renamed from: N2 */
    public InterfaceC5950f f21412N2;

    /* renamed from: N3 */
    public int f21413N3;

    /* renamed from: O */
    public String f21414O;

    /* renamed from: O0 */
    public LinearLayout f21415O0;

    /* renamed from: O1 */
    public SharedPreferences.Editor f21416O1;

    /* renamed from: O2 */
    public Handler f21417O2;

    /* renamed from: O3 */
    public Handler f21418O3;

    /* renamed from: P0 */
    public AppBarLayout f21420P0;

    /* renamed from: P1 */
    public SharedPreferences.Editor f21421P1;

    /* renamed from: P2 */
    public ArrayList<ExternalPlayerModelClass> f21422P2;

    /* renamed from: P3 */
    public Runnable f21423P3;

    /* renamed from: Q */
    public LiveStreamDBHandler f21424Q;

    /* renamed from: Q1 */
    public TextView f21426Q1;

    /* renamed from: Q2 */
    public int f21427Q2;

    /* renamed from: Q3 */
    public Handler f21428Q3;

    /* renamed from: R */
    public SharedPreferences f21429R;

    /* renamed from: R2 */
    public String f21432R2;

    /* renamed from: R3 */
    public Runnable f21433R3;

    /* renamed from: S */
    public C5867t f21434S;

    /* renamed from: S2 */
    public String f21437S2;

    /* renamed from: S3 */
    public boolean f21438S3;

    /* renamed from: T */
    public SharedPreferences f21439T;

    /* renamed from: T0 */
    public String f21440T0;

    /* renamed from: T1 */
    public LinearLayout f21441T1;

    /* renamed from: T2 */
    public Boolean f21442T2;

    /* renamed from: T3 */
    public SharedPreferences f21443T3;

    /* renamed from: U */
    public SharedPreferences f21444U;

    /* renamed from: U1 */
    public TextView f21446U1;

    /* renamed from: U2 */
    public Animation f21447U2;

    /* renamed from: U3 */
    public NSTIJKPlayerSky.AbstractC3970w f21448U3;

    /* renamed from: V */
    public SharedPreferences f21449V;

    /* renamed from: V0 */
    public RelativeLayout f21450V0;

    /* renamed from: V2 */
    public Animation f21452V2;

    /* renamed from: V3 */
    public final SeekBar.OnSeekBarChangeListener f21453V3;

    /* renamed from: W */
    public SharedPreferences f21454W;

    /* renamed from: W0 */
    public RelativeLayout f21455W0;

    /* renamed from: W1 */
    public Boolean f21456W1;

    /* renamed from: W2 */
    public Animation f21457W2;

    /* renamed from: W3 */
    public final SeekBar.OnSeekBarChangeListener f21458W3;

    /* renamed from: X */
    public SharedPreferences f21459X;

    /* renamed from: X0 */
    public LinearLayout f21460X0;

    /* renamed from: X1 */
    public Boolean f21461X1;

    /* renamed from: X2 */
    public Animation f21462X2;

    /* renamed from: Y */
    public SharedPreferences f21463Y;

    /* renamed from: Y0 */
    public LinearLayout f21464Y0;

    /* renamed from: Y1 */
    public Menu f21465Y1;

    /* renamed from: Y2 */
    public Animation f21466Y2;

    /* renamed from: Z */
    public SharedPreferences f21467Z;

    /* renamed from: Z0 */
    public RelativeLayout f21468Z0;

    /* renamed from: Z1 */
    public MenuItem f21469Z1;

    /* renamed from: Z2 */
    public Animation f21470Z2;

    /* renamed from: a1 */
    public RelativeLayout f21471a1;

    /* renamed from: a2 */
    public DateFormat f21472a2;

    /* renamed from: a3 */
    public Animation f21473a3;

    /* renamed from: b1 */
    public RelativeLayout f21474b1;

    /* renamed from: b2 */
    public String f21475b2;

    /* renamed from: b3 */
    public Animation f21476b3;

    /* renamed from: c1 */
    public RelativeLayout f21477c1;

    /* renamed from: c2 */
    public String f21478c2;

    /* renamed from: c3 */
    public Animation f21479c3;

    @BindView
    public MediaRouteButton cast_button;

    /* renamed from: d */
    public Context f21480d;

    /* renamed from: d2 */
    public String f21482d2;

    /* renamed from: d3 */
    public String f21483d3;

    /* renamed from: e */
    public String f21484e;

    /* renamed from: e2 */
    public SimpleDateFormat f21486e2;

    /* renamed from: e3 */
    public C5864q f21487e3;

    /* renamed from: f */
    public View f21488f;

    /* renamed from: f0 */
    public SharedPreferences f21489f0;

    /* renamed from: f1 */
    public TextView f21490f1;

    /* renamed from: f2 */
    public PlayerView f21491f2;

    /* renamed from: f3 */
    public C5865r f21492f3;

    /* renamed from: g */
    public View f21493g;

    /* renamed from: g0 */
    public SimpleDateFormat f21494g0;

    /* renamed from: g1 */
    public TextView f21495g1;

    /* renamed from: g2 */
    public Date f21496g2;

    /* renamed from: g3 */
    public LinearLayoutManager f21497g3;

    /* renamed from: h */
    public ImageView f21498h;

    /* renamed from: h0 */
    public String f21499h0;

    /* renamed from: h1 */
    public TextView f21500h1;

    /* renamed from: h2 */
    public String f21501h2;

    /* renamed from: h3 */
    public String f21502h3;

    @BindView
    public TextView header_page_title;

    /* renamed from: i */
    public ImageView f21503i;

    /* renamed from: i0 */
    public RelativeLayout f21504i0;

    /* renamed from: i1 */
    public TextView f21505i1;

    /* renamed from: i2 */
    public Boolean f21506i2;

    /* renamed from: i3 */
    public String f21507i3;

    @BindView
    public ImageView iv_audio_subtitle_track;

    @BindView
    public ImageView iv_back;

    @BindView
    public ImageView iv_back_button;

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
    public ImageView iv_radio;

    @BindView
    public ImageView iv_unlock_button;

    /* renamed from: j */
    public View f21508j;

    /* renamed from: j1 */
    public String f21510j1;

    /* renamed from: j2 */
    public DialogC0242a f21511j2;

    /* renamed from: j3 */
    public int f21512j3;

    /* renamed from: k */
    public String f21513k;

    /* renamed from: k0 */
    public TextView f21514k0;

    /* renamed from: k1 */
    public TextView f21515k1;

    /* renamed from: k2 */
    public String f21516k2;

    /* renamed from: k3 */
    public Animation f21517k3;

    /* renamed from: l */
    public View f21518l;

    /* renamed from: l0 */
    public AppCompatImageView f21519l0;

    /* renamed from: l1 */
    public TextView f21520l1;

    /* renamed from: l2 */
    public Boolean f21521l2;

    /* renamed from: l3 */
    public Animation f21522l3;

    @BindView
    public LinearLayout ll_audio_subtitle_settings;

    @BindView
    public LinearLayout ll_audio_subtitle_settings_click;

    @BindView
    public LinearLayout ll_back;

    @BindView
    public LinearLayout ll_back_click;

    @BindView
    public LinearLayout ll_bottom_1;

    @BindView
    public LinearLayout ll_bottom_2;

    @BindView
    public LinearLayout ll_brightness;

    @BindView
    public LinearLayout ll_casting_to_tv;

    @BindView
    public LinearLayout ll_channels_list;

    @BindView
    public LinearLayout ll_chromecast_click;

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
    public LinearLayout ll_pb_left_categories;

    @BindView
    public LinearLayout ll_player_header_footer;

    @BindView
    public LinearLayout ll_restart;

    @BindView
    public LinearLayout ll_screen_locked;

    @BindView
    public LinearLayout ll_volume;

    @BindView
    public ImageView logo;

    /* renamed from: m */
    public View f21523m;

    /* renamed from: m0 */
    public AppCompatImageView f21524m0;

    /* renamed from: m1 */
    public TextView f21525m1;

    /* renamed from: m2 */
    public C9572b f21526m2;

    /* renamed from: m3 */
    public boolean f21527m3;

    /* renamed from: n0 */
    public ArrayList<LiveStreamCategoryIdDBModel> f21529n0;

    /* renamed from: n1 */
    public TextView f21530n1;

    /* renamed from: n2 */
    public String f21531n2;

    /* renamed from: n3 */
    public boolean f21532n3;

    @BindView
    public TextView no_audio_track;

    @BindView
    public TextView no_subtitle_track;

    @BindView
    public TextView no_video_track;

    /* renamed from: o */
    public LinearLayout f21533o;

    /* renamed from: o0 */
    public ArrayList<LiveStreamCategoryIdDBModel> f21534o0;

    /* renamed from: o1 */
    public TextView f21535o1;

    /* renamed from: o2 */
    public int f21536o2;

    /* renamed from: o3 */
    public PictureInPictureParams$Builder f21537o3;

    /* renamed from: p */
    public TextView f21538p;

    /* renamed from: p0 */
    public ArrayList<LiveStreamCategoryIdDBModel> f21539p0;

    /* renamed from: p1 */
    public TextView f21540p1;

    /* renamed from: p2 */
    public int f21541p2;

    /* renamed from: p3 */
    public BroadcastReceiver f21542p3;

    /* renamed from: q */
    public ImageView f21543q;

    /* renamed from: q0 */
    public ArrayList<LiveStreamCategoryIdDBModel> f21544q0;

    /* renamed from: q1 */
    public TextView f21545q1;

    /* renamed from: q2 */
    public String f21546q2;

    /* renamed from: q3 */
    public String f21547q3;

    /* renamed from: r */
    public TextView f21548r;

    /* renamed from: r0 */
    public ArrayList<LiveStreamCategoryIdDBModel> f21549r0;

    /* renamed from: r1 */
    public TextView f21550r1;

    /* renamed from: r2 */
    public Boolean f21551r2;

    /* renamed from: r3 */
    public String f21552r3;

    @BindView
    public RecyclerView recycler_view_left_sidebar;

    @BindView
    public RelativeLayout rl_episodes_box;

    @BindView
    public RelativeLayout rl_settings_box;

    /* renamed from: s */
    public TextView f21553s;

    /* renamed from: s0 */
    public ArrayList<LiveStreamsDBModel> f21554s0;

    /* renamed from: s1 */
    public LinearLayout f21555s1;

    /* renamed from: s2 */
    public AsyncTask f21556s2;

    /* renamed from: s3 */
    public String f21557s3;

    @BindView
    public SeekBar sb_brightness;

    @BindView
    public SeekBar sb_volume;

    /* renamed from: t */
    public TextView f21558t;

    /* renamed from: t0 */
    public ArrayList<LiveStreamsDBModel> f21559t0;

    /* renamed from: t1 */
    public String f21560t1;

    /* renamed from: t2 */
    public AsyncTask f21561t2;

    /* renamed from: t3 */
    public boolean f21562t3;

    @BindView
    public TextView tv_brightness;

    @BindView
    public TextView tv_casting_status_text;

    @BindView
    public TextView tv_channel_name;

    @BindView
    public TextView tv_episode_name;

    @BindView
    public TextView tv_page_name_right_side;

    @BindView
    public TextView tv_program_name;

    @BindView
    public ImageView tv_seek_left;

    @BindView
    public ImageView tv_seek_right;

    @BindView
    public TextView tv_start_stop;

    @BindView
    public TextView tv_volume;

    /* renamed from: u */
    public TextView f21563u;

    /* renamed from: u0 */
    public ArrayList<LiveStreamsDBModel> f21564u0;

    /* renamed from: u1 */
    public LinearLayout f21565u1;

    /* renamed from: u2 */
    public AsyncTask f21566u2;

    /* renamed from: u3 */
    public String f21567u3;

    /* renamed from: v */
    public LinearLayout f21568v;

    /* renamed from: v0 */
    public ArrayList<LiveStreamsDBModel> f21569v0;

    /* renamed from: v1 */
    public LinearLayout f21570v1;

    /* renamed from: v2 */
    public boolean f21571v2;

    /* renamed from: v3 */
    public SharedPreferences f21572v3;

    /* renamed from: w */
    public ProgressBar f21573w;

    /* renamed from: w0 */
    public ArrayList<LiveStreamsDBModel> f21574w0;

    /* renamed from: w1 */
    public LinearLayout f21575w1;

    /* renamed from: w2 */
    public int f21576w2;

    /* renamed from: w3 */
    public boolean f21577w3;

    /* renamed from: x */
    public ProgressBar f21578x;

    /* renamed from: x0 */
    public ArrayList<LiveStreamsDBModel> f21579x0;

    /* renamed from: x1 */
    public LinearLayout f21580x1;

    /* renamed from: x2 */
    public boolean f21581x2;

    /* renamed from: x3 */
    public MultiUserDBHandler f21582x3;

    /* renamed from: y */
    public LinearLayout f21583y;

    /* renamed from: y0 */
    public ArrayList<LiveStreamsDBModel> f21584y0;

    /* renamed from: y1 */
    public LinearLayout f21585y1;

    /* renamed from: y2 */
    public int f21586y2;

    /* renamed from: y3 */
    public String f21587y3;

    /* renamed from: z */
    public LinearLayout f21588z;

    /* renamed from: z0 */
    public ArrayList<LiveStreamsDBModel> f21589z0;

    /* renamed from: z1 */
    public String f21590z1;

    /* renamed from: z2 */
    public int f21591z2;

    /* renamed from: z3 */
    public Thread f21592z3;

    /* renamed from: Z3 */
    public static boolean f21339Z3 = false;

    /* renamed from: c4 */
    public static final int[] f21342c4 = {0, 1, 2, 3, 4, 5};

    /* renamed from: n */
    public boolean f21528n = false;

    /* renamed from: A */
    public boolean f21344A = true;

    /* renamed from: B */
    public boolean f21349B = false;

    /* renamed from: C */
    public boolean f21354C = false;

    /* renamed from: D */
    public boolean f21359D = false;

    /* renamed from: M */
    public boolean f21404M = true;

    /* renamed from: N */
    public long f21409N = 2500;

    /* renamed from: P */
    public boolean f21419P = true;

    /* renamed from: j0 */
    public int f21509j0 = 0;

    /* renamed from: C0 */
    public ArrayList<String> f21355C0 = new ArrayList<>();

    /* renamed from: Q0 */
    public boolean f21425Q0 = true;

    /* renamed from: R0 */
    public boolean f21430R0 = false;

    /* renamed from: S0 */
    public boolean f21435S0 = false;

    /* renamed from: U0 */
    public boolean f21445U0 = true;

    /* renamed from: d1 */
    public String f21481d1 = "";

    /* renamed from: e1 */
    public String f21485e1 = "";

    /* renamed from: B1 */
    public String f21351B1 = "";

    /* renamed from: R1 */
    public int f21431R1 = 0;

    /* renamed from: S1 */
    public StringBuilder f21436S1 = new StringBuilder();

    /* renamed from: V1 */
    public int f21451V1 = -1;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$a.class */
    public class C3579a implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        public final NSTEXOPlayerSkyActivity f21593b;

        public C3579a(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity) {
            this.f21593b = nSTEXOPlayerSkyActivity;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity;
            AsyncTask<String, Void, HashMap<String, ArrayList<String>>> execute;
            if (this.f21593b.f21566u2 != null && this.f21593b.f21566u2.getStatus().equals(AsyncTask.Status.RUNNING)) {
                this.f21593b.f21566u2.cancel(true);
            }
            ArrayList<LiveStreamsDBModel> m28615e = this.f21593b.f21434S.m28615e();
            if (m28615e != null && m28615e.size() > 0) {
                String m14798E = m28615e.get(i10).m14798E();
                this.f21593b.f21396K1.removeCallbacksAndMessages(null);
                nSTEXOPlayerSkyActivity = this.f21593b;
                execute = new AsyncTaskC3604m0(this.f21593b, m14798E, null).execute(new String[0]);
            } else {
                if (this.f21593b.f21564u0 == null || this.f21593b.f21564u0.size() <= 0) {
                    return;
                }
                String m14798E2 = ((LiveStreamsDBModel) this.f21593b.f21564u0.get(i10)).m14798E();
                this.f21593b.f21396K1.removeCallbacksAndMessages(null);
                nSTEXOPlayerSkyActivity = this.f21593b;
                execute = new AsyncTaskC3604m0(this.f21593b, m14798E2, null).execute(new String[0]);
            }
            nSTEXOPlayerSkyActivity.f21566u2 = execute;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$a0.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$a0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$a0.class */
    public class ViewOnClickListenerC3580a0 implements View.OnClickListener {

        /* renamed from: b */
        public final NSTEXOPlayerSkyActivity f21594b;

        public ViewOnClickListenerC3580a0(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity) {
            this.f21594b = nSTEXOPlayerSkyActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                this.f21594b.f21506i2 = Boolean.TRUE;
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", this.f21594b.getPackageName(), null));
                this.f21594b.startActivityForResult(intent, 101);
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity = this.f21594b;
                Toast.makeText(nSTEXOPlayerSkyActivity, nSTEXOPlayerSkyActivity.f21480d.getResources().getString(2132017828), 1).show();
            } catch (Exception e10) {
            }
            this.f21594b.f21511j2.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$b.class */
    public class C3581b implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        public final ArrayList f21595b;

        /* renamed from: c */
        public final NSTEXOPlayerSkyActivity f21596c;

        public C3581b(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity, ArrayList arrayList) {
            this.f21596c = nSTEXOPlayerSkyActivity;
            this.f21595b = arrayList;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity;
            try {
                if (this.f21596c.f21566u2 != null && this.f21596c.f21566u2.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    this.f21596c.f21566u2.cancel(true);
                }
                C5251a.f30008G = Boolean.TRUE;
                ArrayList<LiveStreamsDBModel> m28615e = this.f21596c.f21434S.m28615e();
                if (m28615e == null || m28615e.size() <= 0) {
                    if (this.f21596c.f21564u0 == null || this.f21596c.f21564u0.size() <= 0) {
                        return;
                    }
                    C5255e.m26215R(((LiveStreamsDBModel) this.f21596c.f21564u0.get(i10)).m14805L());
                    String m14798E = ((LiveStreamsDBModel) this.f21596c.f21564u0.get(i10)).m14798E();
                    String m14810Q = ((LiveStreamsDBModel) this.f21596c.f21564u0.get(i10)).m14810Q();
                    String m14816W = ((LiveStreamsDBModel) this.f21596c.f21564u0.get(i10)).m14816W();
                    if (this.f21596c.f21478c2.equals("m3u")) {
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity2 = this.f21596c;
                        if (!nSTEXOPlayerSkyActivity2.f21351B1.equals(((LiveStreamsDBModel) nSTEXOPlayerSkyActivity2.f21564u0.get(i10)).m14816W())) {
                            this.f21596c.f21491f2.setCurrentWindowIndex(i10);
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity3 = this.f21596c;
                            nSTEXOPlayerSkyActivity3.f21427Q2 = C5255e.m26215R(((LiveStreamsDBModel) nSTEXOPlayerSkyActivity3.f21564u0.get(i10)).m14805L());
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity4 = this.f21596c;
                            nSTEXOPlayerSkyActivity4.f21432R2 = ((LiveStreamsDBModel) nSTEXOPlayerSkyActivity4.f21564u0.get(i10)).m14827g();
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity5 = this.f21596c;
                            nSTEXOPlayerSkyActivity5.f21587y3 = nSTEXOPlayerSkyActivity5.f21481d1;
                            if (nSTEXOPlayerSkyActivity5.f21584y0 != null) {
                                this.f21596c.f21584y0.clear();
                                this.f21596c.f21584y0.addAll(this.f21595b);
                            }
                            this.f21596c.f21491f2.setTitle(((LiveStreamsDBModel) this.f21596c.f21564u0.get(i10)).m14805L() + " - " + ((LiveStreamsDBModel) this.f21596c.f21564u0.get(i10)).getName());
                            this.f21596c.f21552r3 = ((LiveStreamsDBModel) this.f21596c.f21564u0.get(i10)).m14805L() + " - " + ((LiveStreamsDBModel) this.f21596c.f21564u0.get(i10)).getName();
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity6 = this.f21596c;
                            nSTEXOPlayerSkyActivity6.f21351B1 = ((LiveStreamsDBModel) nSTEXOPlayerSkyActivity6.f21564u0.get(i10)).m14816W();
                            C7920a.m34301l().m34317z(this.f21596c.f21351B1);
                            if (!this.f21596c.f21481d1.equals("-1") && !this.f21596c.f21481d1.equals("0") && !this.f21596c.f21481d1.equals("-6")) {
                                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity7 = this.f21596c;
                                nSTEXOPlayerSkyActivity7.f21481d1 = ((LiveStreamsDBModel) nSTEXOPlayerSkyActivity7.f21564u0.get(i10)).m14827g();
                                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity8 = this.f21596c;
                                nSTEXOPlayerSkyActivity8.f21485e1 = ((LiveStreamsDBModel) nSTEXOPlayerSkyActivity8.f21564u0.get(i10)).m14830i();
                                if (this.f21596c.f21485e1.isEmpty()) {
                                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity9 = this.f21596c;
                                    nSTEXOPlayerSkyActivity9.f21485e1 = nSTEXOPlayerSkyActivity9.m17728W1(nSTEXOPlayerSkyActivity9.f21481d1);
                                }
                            }
                            this.f21596c.f21431R1 = i10;
                            this.f21596c.f21491f2.m12488B();
                            if (this.f21596c.f21521l2.booleanValue()) {
                                this.f21596c.f21368E3 = Uri.parse(m14816W);
                                this.f21596c.f21491f2.m12507t(Boolean.valueOf(NSTEXOPlayerSkyActivity.f21339Z3));
                                this.f21596c.f21547q3 = String.valueOf(Uri.parse(m14816W));
                                this.f21596c.m17768x2();
                                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity10 = this.f21596c;
                                nSTEXOPlayerSkyActivity10.f21373F3 = 0;
                                nSTEXOPlayerSkyActivity10.f21383H3 = false;
                            }
                            this.f21596c.f21401L1.removeCallbacksAndMessages(null);
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity11 = this.f21596c;
                            nSTEXOPlayerSkyActivity11.f21374G = m14798E;
                            nSTEXOPlayerSkyActivity11.f21379H = m14810Q;
                            nSTEXOPlayerSkyActivity11.f21557s3 = m14810Q;
                            this.f21596c.f21491f2.setCurrentEpgChannelID(this.f21596c.f21374G);
                            this.f21596c.f21491f2.setCurrentChannelLogo(this.f21596c.f21379H);
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity12 = this.f21596c;
                            nSTEXOPlayerSkyActivity12.m17754k3(nSTEXOPlayerSkyActivity12.f21379H);
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity13 = this.f21596c;
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity14 = this.f21596c;
                            nSTEXOPlayerSkyActivity13.f21566u2 = new AsyncTaskC3604m0(nSTEXOPlayerSkyActivity14, nSTEXOPlayerSkyActivity14.f21374G, null).execute(new String[0]);
                            this.f21596c.f21396K1.removeCallbacksAndMessages(null);
                            if (this.f21596c.f21361D1 != null) {
                                this.f21596c.f21361D1.putString("currentlyPlayingVideo", String.valueOf(((LiveStreamsDBModel) this.f21596c.f21564u0.get(i10)).m14811R()));
                                this.f21596c.f21361D1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(((LiveStreamsDBModel) this.f21596c.f21564u0.get(i10)).m14816W()));
                                this.f21596c.f21361D1.apply();
                            }
                            if (this.f21596c.f21366E1 != null) {
                                this.f21596c.f21366E1.putInt("currentlyPlayingVideoPosition", i10);
                                this.f21596c.f21366E1.apply();
                            }
                            nSTEXOPlayerSkyActivity = this.f21596c;
                            nSTEXOPlayerSkyActivity.f21434S.notifyDataSetChanged();
                            return;
                        }
                        this.f21596c.m17740d2(true);
                    }
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity15 = this.f21596c;
                    if (nSTEXOPlayerSkyActivity15.f21346A1 != C5255e.m26214Q(((LiveStreamsDBModel) nSTEXOPlayerSkyActivity15.f21564u0.get(i10)).m14811R())) {
                        this.f21596c.f21491f2.setCurrentWindowIndex(i10);
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity16 = this.f21596c;
                        nSTEXOPlayerSkyActivity16.f21427Q2 = C5255e.m26215R(((LiveStreamsDBModel) nSTEXOPlayerSkyActivity16.f21564u0.get(i10)).m14805L());
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity17 = this.f21596c;
                        nSTEXOPlayerSkyActivity17.f21432R2 = ((LiveStreamsDBModel) nSTEXOPlayerSkyActivity17.f21564u0.get(i10)).m14827g();
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity18 = this.f21596c;
                        nSTEXOPlayerSkyActivity18.f21587y3 = nSTEXOPlayerSkyActivity18.f21481d1;
                        if (nSTEXOPlayerSkyActivity18.f21584y0 != null) {
                            this.f21596c.f21584y0.clear();
                            this.f21596c.f21584y0.addAll(this.f21595b);
                        }
                        this.f21596c.f21491f2.setTitle(((LiveStreamsDBModel) this.f21596c.f21564u0.get(i10)).m14805L() + " - " + ((LiveStreamsDBModel) this.f21596c.f21564u0.get(i10)).getName());
                        this.f21596c.f21552r3 = ((LiveStreamsDBModel) this.f21596c.f21564u0.get(i10)).m14805L() + " - " + ((LiveStreamsDBModel) this.f21596c.f21564u0.get(i10)).getName();
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity19 = this.f21596c;
                        nSTEXOPlayerSkyActivity19.f21346A1 = C5255e.m26214Q(((LiveStreamsDBModel) nSTEXOPlayerSkyActivity19.f21564u0.get(i10)).m14811R());
                        C7920a.m34301l().m34317z(String.valueOf(this.f21596c.f21346A1));
                        if (!this.f21596c.f21481d1.equals("-1") && !this.f21596c.f21481d1.equals("0") && !this.f21596c.f21481d1.equals("-6")) {
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity20 = this.f21596c;
                            nSTEXOPlayerSkyActivity20.f21481d1 = ((LiveStreamsDBModel) nSTEXOPlayerSkyActivity20.f21564u0.get(i10)).m14827g();
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity21 = this.f21596c;
                            nSTEXOPlayerSkyActivity21.f21485e1 = ((LiveStreamsDBModel) nSTEXOPlayerSkyActivity21.f21564u0.get(i10)).m14830i();
                            if (this.f21596c.f21485e1.isEmpty()) {
                                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity22 = this.f21596c;
                                nSTEXOPlayerSkyActivity22.f21485e1 = nSTEXOPlayerSkyActivity22.m17728W1(nSTEXOPlayerSkyActivity22.f21481d1);
                            }
                        }
                        this.f21596c.f21431R1 = i10;
                        this.f21596c.f21491f2.m12488B();
                        if (this.f21596c.f21521l2.booleanValue()) {
                            this.f21596c.f21368E3 = Uri.parse(this.f21596c.f21484e + C5255e.m26214Q(((LiveStreamsDBModel) this.f21596c.f21564u0.get(i10)).m14811R()) + this.f21596c.f21499h0);
                            this.f21596c.f21491f2.m12507t(Boolean.valueOf(NSTEXOPlayerSkyActivity.f21339Z3));
                            this.f21596c.f21547q3 = String.valueOf(Uri.parse(this.f21596c.f21484e + C5255e.m26214Q(((LiveStreamsDBModel) this.f21596c.f21564u0.get(i10)).m14811R()) + ".m3u8"));
                            this.f21596c.m17768x2();
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity23 = this.f21596c;
                            nSTEXOPlayerSkyActivity23.f21373F3 = 0;
                            nSTEXOPlayerSkyActivity23.f21383H3 = false;
                        }
                        this.f21596c.f21401L1.removeCallbacksAndMessages(null);
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity24 = this.f21596c;
                        nSTEXOPlayerSkyActivity24.f21374G = m14798E;
                        nSTEXOPlayerSkyActivity24.f21379H = m14810Q;
                        nSTEXOPlayerSkyActivity24.f21557s3 = m14810Q;
                        this.f21596c.f21491f2.setCurrentEpgChannelID(this.f21596c.f21374G);
                        this.f21596c.f21491f2.setCurrentChannelLogo(this.f21596c.f21379H);
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity25 = this.f21596c;
                        nSTEXOPlayerSkyActivity25.m17754k3(nSTEXOPlayerSkyActivity25.f21379H);
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity26 = this.f21596c;
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity27 = this.f21596c;
                        nSTEXOPlayerSkyActivity26.f21566u2 = new AsyncTaskC3604m0(nSTEXOPlayerSkyActivity27, nSTEXOPlayerSkyActivity27.f21374G, null).execute(new String[0]);
                        this.f21596c.f21396K1.removeCallbacksAndMessages(null);
                        if (this.f21596c.f21361D1 != null) {
                            this.f21596c.f21361D1.putString("currentlyPlayingVideo", String.valueOf(((LiveStreamsDBModel) this.f21596c.f21564u0.get(i10)).m14811R()));
                            this.f21596c.f21361D1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(((LiveStreamsDBModel) this.f21596c.f21564u0.get(i10)).m14816W()));
                            this.f21596c.f21361D1.apply();
                        }
                        if (this.f21596c.f21366E1 != null) {
                            this.f21596c.f21366E1.putInt("currentlyPlayingVideoPosition", i10);
                            this.f21596c.f21366E1.apply();
                        }
                        nSTEXOPlayerSkyActivity = this.f21596c;
                        nSTEXOPlayerSkyActivity.f21434S.notifyDataSetChanged();
                        return;
                    }
                    this.f21596c.m17740d2(true);
                }
                int m26215R = C5255e.m26215R(m28615e.get(i10).m14805L());
                String m14798E2 = m28615e.get(i10).m14798E();
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity28 = this.f21596c;
                nSTEXOPlayerSkyActivity28.m17749i2(nSTEXOPlayerSkyActivity28.f21564u0, m26215R);
                String m14816W2 = m28615e.get(i10).m14816W();
                if (this.f21596c.f21478c2.equals("m3u")) {
                    if (!this.f21596c.f21351B1.equals(m28615e.get(i10).m14816W())) {
                        this.f21596c.f21491f2.setCurrentWindowIndex(i10);
                        this.f21596c.f21427Q2 = C5255e.m26215R(m28615e.get(i10).m14805L());
                        this.f21596c.f21432R2 = m28615e.get(i10).m14827g();
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity29 = this.f21596c;
                        nSTEXOPlayerSkyActivity29.f21587y3 = nSTEXOPlayerSkyActivity29.f21481d1;
                        if (nSTEXOPlayerSkyActivity29.f21584y0 != null) {
                            this.f21596c.f21584y0.clear();
                            this.f21596c.f21584y0.addAll(this.f21595b);
                        }
                        this.f21596c.f21491f2.setTitle(m28615e.get(i10).m14805L() + " - " + m28615e.get(i10).getName());
                        this.f21596c.f21552r3 = m28615e.get(i10).m14805L() + " - " + m28615e.get(i10).getName();
                        this.f21596c.f21351B1 = m28615e.get(i10).m14816W();
                        C7920a.m34301l().m34317z(this.f21596c.f21351B1);
                        if (!this.f21596c.f21481d1.equals("-1") && !this.f21596c.f21481d1.equals("0") && !this.f21596c.f21481d1.equals("-6")) {
                            this.f21596c.f21481d1 = m28615e.get(i10).m14827g();
                            this.f21596c.f21485e1 = m28615e.get(i10).m14830i();
                            if (this.f21596c.f21485e1.isEmpty()) {
                                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity30 = this.f21596c;
                                nSTEXOPlayerSkyActivity30.f21485e1 = nSTEXOPlayerSkyActivity30.m17728W1(nSTEXOPlayerSkyActivity30.f21481d1);
                            }
                        }
                        String m14810Q2 = m28615e.get(i10).m14810Q();
                        try {
                            if (m14810Q2.equals("") || m14810Q2.isEmpty()) {
                                this.f21596c.f21543q.setImageDrawable(this.f21596c.f21480d.getResources().getDrawable(2131231571));
                            } else {
                                C10014t.m42105q(this.f21596c.f21480d).m42116l(m14810Q2).m42154j(2131231571).m42148d(2131231571).m42151g(this.f21596c.f21543q);
                            }
                        } catch (Exception e10) {
                            this.f21596c.f21543q.setImageDrawable(this.f21596c.f21480d.getResources().getDrawable(2131231571));
                        }
                        this.f21596c.f21401L1.removeCallbacksAndMessages(null);
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity31 = this.f21596c;
                        nSTEXOPlayerSkyActivity31.f21374G = m14798E2;
                        nSTEXOPlayerSkyActivity31.f21379H = m14810Q2;
                        nSTEXOPlayerSkyActivity31.f21557s3 = m14810Q2;
                        this.f21596c.f21491f2.setCurrentEpgChannelID(this.f21596c.f21374G);
                        this.f21596c.f21491f2.setCurrentChannelLogo(this.f21596c.f21379H);
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity32 = this.f21596c;
                        nSTEXOPlayerSkyActivity32.m17754k3(nSTEXOPlayerSkyActivity32.f21379H);
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity33 = this.f21596c;
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity34 = this.f21596c;
                        nSTEXOPlayerSkyActivity33.f21566u2 = new AsyncTaskC3604m0(nSTEXOPlayerSkyActivity34, nSTEXOPlayerSkyActivity34.f21374G, null).execute(new String[0]);
                        this.f21596c.f21396K1.removeCallbacksAndMessages(null);
                        this.f21596c.f21431R1 = i10;
                        this.f21596c.f21491f2.m12488B();
                        if (this.f21596c.f21521l2.booleanValue()) {
                            this.f21596c.f21368E3 = Uri.parse(m14816W2);
                            this.f21596c.f21491f2.m12507t(Boolean.valueOf(NSTEXOPlayerSkyActivity.f21339Z3));
                            this.f21596c.f21547q3 = String.valueOf(Uri.parse(m14816W2));
                            this.f21596c.m17768x2();
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity35 = this.f21596c;
                            nSTEXOPlayerSkyActivity35.f21373F3 = 0;
                            nSTEXOPlayerSkyActivity35.f21383H3 = false;
                        }
                        if (this.f21596c.f21361D1 != null) {
                            this.f21596c.f21361D1.putString("currentlyPlayingVideo", String.valueOf(m28615e.get(i10).m14811R()));
                            this.f21596c.f21361D1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(m28615e.get(i10).m14816W()));
                            this.f21596c.f21361D1.apply();
                        }
                        if (this.f21596c.f21366E1 != null) {
                            this.f21596c.f21366E1.putInt("currentlyPlayingVideoPosition", i10);
                            this.f21596c.f21366E1.apply();
                        }
                        nSTEXOPlayerSkyActivity = this.f21596c;
                        nSTEXOPlayerSkyActivity.f21434S.notifyDataSetChanged();
                        return;
                    }
                    this.f21596c.m17740d2(true);
                }
                if (this.f21596c.f21346A1 != C5255e.m26214Q(m28615e.get(i10).m14811R())) {
                    this.f21596c.f21491f2.setCurrentWindowIndex(i10);
                    this.f21596c.f21427Q2 = C5255e.m26215R(m28615e.get(i10).m14805L());
                    this.f21596c.f21432R2 = m28615e.get(i10).m14827g();
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity36 = this.f21596c;
                    nSTEXOPlayerSkyActivity36.f21587y3 = nSTEXOPlayerSkyActivity36.f21481d1;
                    if (nSTEXOPlayerSkyActivity36.f21584y0 != null) {
                        this.f21596c.f21584y0.clear();
                        this.f21596c.f21584y0.addAll(this.f21595b);
                    }
                    this.f21596c.f21491f2.setTitle(m28615e.get(i10).m14805L() + " - " + m28615e.get(i10).getName());
                    this.f21596c.f21552r3 = m28615e.get(i10).m14805L() + " - " + m28615e.get(i10).getName();
                    this.f21596c.f21346A1 = C5255e.m26214Q(m28615e.get(i10).m14811R());
                    C7920a.m34301l().m34317z(String.valueOf(this.f21596c.f21346A1));
                    if (!this.f21596c.f21481d1.equals("-1") && !this.f21596c.f21481d1.equals("0") && !this.f21596c.f21481d1.equals("-6")) {
                        this.f21596c.f21481d1 = m28615e.get(i10).m14827g();
                        this.f21596c.f21485e1 = m28615e.get(i10).m14830i();
                        if (this.f21596c.f21485e1.isEmpty()) {
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity37 = this.f21596c;
                            nSTEXOPlayerSkyActivity37.f21485e1 = nSTEXOPlayerSkyActivity37.m17728W1(nSTEXOPlayerSkyActivity37.f21481d1);
                        }
                    }
                    String m14810Q3 = m28615e.get(i10).m14810Q();
                    try {
                        if (m14810Q3.equals("") || m14810Q3.isEmpty()) {
                            this.f21596c.f21543q.setImageDrawable(this.f21596c.f21480d.getResources().getDrawable(2131231571));
                        } else {
                            C10014t.m42105q(this.f21596c.f21480d).m42116l(m14810Q3).m42154j(2131231571).m42148d(2131231571).m42151g(this.f21596c.f21543q);
                        }
                    } catch (Exception e11) {
                        try {
                            this.f21596c.f21543q.setImageDrawable(this.f21596c.f21480d.getResources().getDrawable(2131231571));
                        } catch (Exception e12) {
                        }
                    }
                    this.f21596c.f21401L1.removeCallbacksAndMessages(null);
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity38 = this.f21596c;
                    nSTEXOPlayerSkyActivity38.f21374G = m14798E2;
                    nSTEXOPlayerSkyActivity38.f21379H = m14810Q3;
                    nSTEXOPlayerSkyActivity38.f21557s3 = m14810Q3;
                    this.f21596c.f21491f2.setCurrentEpgChannelID(this.f21596c.f21374G);
                    this.f21596c.f21491f2.setCurrentChannelLogo(this.f21596c.f21379H);
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity39 = this.f21596c;
                    nSTEXOPlayerSkyActivity39.m17754k3(nSTEXOPlayerSkyActivity39.f21379H);
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity40 = this.f21596c;
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity41 = this.f21596c;
                    nSTEXOPlayerSkyActivity40.f21566u2 = new AsyncTaskC3604m0(nSTEXOPlayerSkyActivity41, nSTEXOPlayerSkyActivity41.f21374G, null).execute(new String[0]);
                    this.f21596c.f21396K1.removeCallbacksAndMessages(null);
                    this.f21596c.f21431R1 = i10;
                    this.f21596c.f21491f2.m12488B();
                    if (this.f21596c.f21521l2.booleanValue()) {
                        this.f21596c.f21368E3 = Uri.parse(this.f21596c.f21484e + C5255e.m26214Q(m28615e.get(i10).m14811R()) + this.f21596c.f21499h0);
                        this.f21596c.f21491f2.m12507t(Boolean.valueOf(NSTEXOPlayerSkyActivity.f21339Z3));
                        this.f21596c.f21547q3 = String.valueOf(Uri.parse(this.f21596c.f21484e + C5255e.m26214Q(m28615e.get(i10).m14811R()) + ".m3u8"));
                        this.f21596c.m17768x2();
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity42 = this.f21596c;
                        nSTEXOPlayerSkyActivity42.f21373F3 = 0;
                        nSTEXOPlayerSkyActivity42.f21383H3 = false;
                    }
                    if (this.f21596c.f21361D1 != null) {
                        this.f21596c.f21361D1.putString("currentlyPlayingVideo", String.valueOf(m28615e.get(i10).m14811R()));
                        this.f21596c.f21361D1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(m28615e.get(i10).m14816W()));
                        this.f21596c.f21361D1.apply();
                    }
                    if (this.f21596c.f21366E1 != null) {
                        this.f21596c.f21366E1.putInt("currentlyPlayingVideoPosition", i10);
                        this.f21596c.f21366E1.apply();
                    }
                    nSTEXOPlayerSkyActivity = this.f21596c;
                    nSTEXOPlayerSkyActivity.f21434S.notifyDataSetChanged();
                    return;
                }
                this.f21596c.m17740d2(true);
            } catch (Exception e13) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$b0.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$b0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$b0.class */
    public class ViewOnClickListenerC3582b0 implements View.OnClickListener {

        /* renamed from: b */
        public final NSTEXOPlayerSkyActivity f21597b;

        public ViewOnClickListenerC3582b0(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity) {
            this.f21597b = nSTEXOPlayerSkyActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f21597b.f21511j2.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$c.class */
    public class C3583c implements AdapterView.OnItemLongClickListener {

        /* renamed from: a */
        public final NSTEXOPlayerSkyActivity f21598a;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$c$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$c$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$c$a.class */
        public class a implements PopupMenu.OnMenuItemClickListener {

            /* renamed from: a */
            public final String f21599a;

            /* renamed from: b */
            public final String f21600b;

            /* renamed from: c */
            public final String f21601c;

            /* renamed from: d */
            public final String f21602d;

            /* renamed from: e */
            public final String f21603e;

            /* renamed from: f */
            public final C3583c f21604f;

            public a(C3583c c3583c, String str, String str2, String str3, String str4, String str5) {
                this.f21604f = c3583c;
                this.f21599a = str;
                this.f21600b = str2;
                this.f21601c = str3;
                this.f21602d = str4;
                this.f21603e = str5;
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
            
                r0 = r8.f21604f.f21598a;
                r0.f21581x2 = true;
                r0.m17711N2();
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
            
                if (r8.f21604f.f21598a.f21478c2.equals("m3u") == false) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
            
                r12 = r8.f21604f.f21598a;
                r11 = r12.f21369F;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
            
                r12.f21414O = r11;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x009f, code lost:
            
                r0 = new android.content.Intent(r8.f21604f.f21598a.f21480d, (java.lang.Class<?>) com.maxdigitall.maxdigitaliptvbox.view.activity.PlayExternalPlayerActivity.class);
                r0.putExtra("url", r8.f21604f.f21598a.f21414O);
                r0.putExtra("app_name", r8.f21604f.f21598a.f21422P2.get(r10).m15415a());
                r0.putExtra("packagename", r8.f21604f.f21598a.f21422P2.get(r10).m15416b());
                r8.f21604f.f21598a.f21480d.startActivity(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
            
                r12 = r8.f21604f.f21598a;
                r11 = p151if.C5255e.m26203F(r12.f21480d, r12.f21364E, r12.f21499h0, "live");
             */
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean onMenuItemClick(android.view.MenuItem r9) {
                /*
                    Method dump skipped, instructions count: 570
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity.C3583c.a.onMenuItemClick(android.view.MenuItem):boolean");
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$c$b.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$c$b */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$c$b.class */
        public class b implements PopupMenu.OnDismissListener {

            /* renamed from: a */
            public final C3583c f21605a;

            public b(C3583c c3583c) {
                this.f21605a = c3583c;
            }

            @Override // android.widget.PopupMenu.OnDismissListener
            public void onDismiss(PopupMenu popupMenu) {
            }
        }

        public C3583c(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity) {
            this.f21598a = nSTEXOPlayerSkyActivity;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(14:4|(2:50|(12:56|11|(2:13|(3:41|42|43)(3:17|18|19))(2:44|(3:49|42|43)(3:48|18|19))|20|21|22|23|24|25|(4:29|30|(2:33|31)|34)|36|37)(2:54|55))(2:8|9)|10|11|(0)(0)|20|21|22|23|24|25|(5:27|29|30|(1:31)|34)|36|37) */
        /* JADX WARN: Removed duplicated region for block: B:13:0x017e A[Catch: Exception -> 0x0316, TRY_LEAVE, TryCatch #1 {Exception -> 0x0316, blocks: (B:2:0x0000, B:4:0x000c, B:6:0x0017, B:8:0x001f, B:11:0x0151, B:13:0x017e, B:15:0x0198, B:17:0x019f, B:19:0x01a6, B:21:0x01ae, B:22:0x0200, B:36:0x02a7, B:41:0x01b8, B:43:0x01bf, B:44:0x01c9, B:46:0x01e7, B:48:0x01ee, B:49:0x01f7, B:50:0x0097, B:52:0x00a1, B:54:0x00ae), top: B:1:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0251 A[Catch: Exception -> 0x031a, LOOP:0: B:31:0x0242->B:33:0x0251, LOOP_END, TRY_LEAVE, TryCatch #0 {Exception -> 0x031a, blocks: (B:25:0x022d, B:27:0x0238, B:31:0x0242, B:33:0x0251), top: B:24:0x022d }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x01c9 A[Catch: Exception -> 0x0316, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0316, blocks: (B:2:0x0000, B:4:0x000c, B:6:0x0017, B:8:0x001f, B:11:0x0151, B:13:0x017e, B:15:0x0198, B:17:0x019f, B:19:0x01a6, B:21:0x01ae, B:22:0x0200, B:36:0x02a7, B:41:0x01b8, B:43:0x01bf, B:44:0x01c9, B:46:0x01e7, B:48:0x01ee, B:49:0x01f7, B:50:0x0097, B:52:0x00a1, B:54:0x00ae), top: B:1:0x0000 }] */
        @Override // android.widget.AdapterView.OnItemLongClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onItemLongClick(android.widget.AdapterView<?> r9, android.view.View r10, int r11, long r12) {
            /*
                Method dump skipped, instructions count: 798
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity.C3583c.onItemLongClick(android.widget.AdapterView, android.view.View, int, long):boolean");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$c0.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$c0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$c0.class */
    public class RunnableC3584c0 implements Runnable {

        /* renamed from: b */
        public final NSTEXOPlayerSkyActivity f21606b;

        public RunnableC3584c0(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity) {
            this.f21606b = nSTEXOPlayerSkyActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String date = Calendar.getInstance().getTime().toString();
                String m26199B = C5255e.m26199B(this.f21606b.f21480d);
                String m26249p = C5255e.m26249p(date);
                TextView textView = this.f21606b.f21381H1;
                if (textView != null) {
                    textView.setText(m26199B);
                }
                TextView textView2 = this.f21606b.f21371F1;
                if (textView2 != null) {
                    textView2.setText(m26249p);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$d.class */
    public class RunnableC3585d implements Runnable {

        /* renamed from: b */
        public final NSTEXOPlayerSkyActivity f21607b;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$d$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$d$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$d$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final RunnableC3585d f21608b;

            public a(RunnableC3585d runnableC3585d) {
                this.f21608b = runnableC3585d;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f21608b.f21607b.f21446U1.setText("");
                this.f21608b.f21607b.f21441T1.setVisibility(8);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$d$b.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$d$b */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$d$b.class */
        public class b implements Runnable {

            /* renamed from: b */
            public final RunnableC3585d f21609b;

            public b(RunnableC3585d runnableC3585d) {
                this.f21609b = runnableC3585d;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f21609b.f21607b.f21446U1.setText("");
                this.f21609b.f21607b.f21441T1.setVisibility(8);
            }
        }

        public RunnableC3585d(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity) {
            this.f21607b = nSTEXOPlayerSkyActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList<LiveStreamsDBModel> m15157D1;
            Handler handler;
            Runnable bVar;
            boolean z10;
            ArrayList<LiveStreamsDBModel> m15217f1;
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity = this.f21607b;
            nSTEXOPlayerSkyActivity.f21440T0 = nSTEXOPlayerSkyActivity.f21436S1.toString();
            this.f21607b.f21446U1.setText("");
            this.f21607b.f21441T1.setVisibility(8);
            if (this.f21607b.f21567u3.equals("true")) {
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity2 = this.f21607b;
                m15157D1 = nSTEXOPlayerSkyActivity2.f21424Q.m15157D1(nSTEXOPlayerSkyActivity2.f21440T0, "radio_streams");
            } else {
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity3 = this.f21607b;
                m15157D1 = nSTEXOPlayerSkyActivity3.f21424Q.m15157D1(nSTEXOPlayerSkyActivity3.f21440T0, "live");
            }
            this.f21607b.f21436S1.setLength(0);
            if (m15157D1 == null || m15157D1.size() == 0) {
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity4 = this.f21607b;
                nSTEXOPlayerSkyActivity4.f21446U1.setText(nSTEXOPlayerSkyActivity4.f21480d.getResources().getString(2132018196));
                this.f21607b.f21441T1.setVisibility(0);
                handler = new Handler();
                bVar = new b(this);
            } else {
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity5 = this.f21607b;
                if (nSTEXOPlayerSkyActivity5.f21424Q.m15189R1(SharepreferenceDBHandler.m15337A(nSTEXOPlayerSkyActivity5.f21480d)) <= 0 || this.f21607b.f21355C0 == null) {
                    z10 = false;
                } else {
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity6 = this.f21607b;
                    z10 = nSTEXOPlayerSkyActivity6.m17753k2(m15157D1, nSTEXOPlayerSkyActivity6.f21355C0);
                }
                if (!z10) {
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity7 = this.f21607b;
                    nSTEXOPlayerSkyActivity7.f21430R0 = true;
                    nSTEXOPlayerSkyActivity7.f21435S0 = true;
                    nSTEXOPlayerSkyActivity7.f21481d1 = "0";
                    nSTEXOPlayerSkyActivity7.f21485e1 = nSTEXOPlayerSkyActivity7.f21480d.getResources().getString(2132017297);
                    this.f21607b.f21509j0 = 0;
                    String m14805L = m15157D1.get(0).m14805L();
                    String m14811R = m15157D1.get(0).m14811R();
                    String name = m15157D1.get(0).getName();
                    String m14798E = m15157D1.get(0).m14798E();
                    String m14810Q = m15157D1.get(0).m14810Q();
                    String m14816W = m15157D1.get(0).m14816W();
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity8 = this.f21607b;
                    nSTEXOPlayerSkyActivity8.f21351B1 = m14816W;
                    nSTEXOPlayerSkyActivity8.f21427Q2 = C5255e.m26215R(nSTEXOPlayerSkyActivity8.f21440T0);
                    this.f21607b.f21432R2 = "0";
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity9 = this.f21607b;
                    nSTEXOPlayerSkyActivity9.f21587y3 = nSTEXOPlayerSkyActivity9.f21481d1;
                    nSTEXOPlayerSkyActivity9.f21491f2.setTitle(this.f21607b.f21440T0 + " - " + name);
                    this.f21607b.f21552r3 = this.f21607b.f21440T0 + " - " + name;
                    if (this.f21607b.f21567u3.equals("true")) {
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity10 = this.f21607b;
                        m15217f1 = nSTEXOPlayerSkyActivity10.f21424Q.m15217f1(nSTEXOPlayerSkyActivity10.f21481d1, "radio_streams");
                    } else {
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity11 = this.f21607b;
                        m15217f1 = nSTEXOPlayerSkyActivity11.f21424Q.m15217f1(nSTEXOPlayerSkyActivity11.f21481d1, "live");
                    }
                    if (m15217f1 != null) {
                        this.f21607b.f21564u0.clear();
                    }
                    this.f21607b.f21564u0 = m15217f1;
                    if (this.f21607b.f21564u0 != null && this.f21607b.f21564u0.size() > 0) {
                        for (int i10 = 0; i10 < this.f21607b.f21564u0.size(); i10++) {
                            if (((LiveStreamsDBModel) this.f21607b.f21564u0.get(i10)).m14805L().equals(m14805L)) {
                                this.f21607b.f21491f2.setCurrentWindowIndex(i10);
                                break;
                            }
                        }
                    }
                    try {
                        if (m14810Q.equals("") || m14810Q.isEmpty()) {
                            this.f21607b.f21543q.setImageDrawable(this.f21607b.f21480d.getResources().getDrawable(2131231571));
                        } else {
                            C10014t.m42105q(this.f21607b.f21480d).m42116l(m14810Q).m42154j(2131231571).m42148d(2131231571).m42155k(80, 55).m42151g(this.f21607b.f21543q);
                        }
                    } catch (Exception e10) {
                        this.f21607b.f21543q.setImageDrawable(this.f21607b.f21480d.getResources().getDrawable(2131231571));
                    }
                    this.f21607b.f21491f2.m12488B();
                    if (this.f21607b.f21521l2.booleanValue()) {
                        if (this.f21607b.f21478c2.equals("m3u")) {
                            this.f21607b.f21368E3 = Uri.parse(m14816W);
                            this.f21607b.f21491f2.m12507t(Boolean.valueOf(NSTEXOPlayerSkyActivity.f21339Z3));
                            this.f21607b.f21547q3 = String.valueOf(Uri.parse(m14816W));
                            C7920a.m34301l().m34317z(this.f21607b.f21351B1);
                        } else {
                            this.f21607b.f21368E3 = Uri.parse(this.f21607b.f21484e + C5255e.m26214Q(m14811R) + this.f21607b.f21499h0);
                            this.f21607b.f21491f2.m12507t(Boolean.valueOf(NSTEXOPlayerSkyActivity.f21339Z3));
                            this.f21607b.f21547q3 = String.valueOf(Uri.parse(this.f21607b.f21484e + C5255e.m26214Q(m14811R) + ".m3u8"));
                            C7920a.m34301l().m34317z(m14811R);
                        }
                        this.f21607b.m17768x2();
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity12 = this.f21607b;
                        nSTEXOPlayerSkyActivity12.f21373F3 = 0;
                        nSTEXOPlayerSkyActivity12.f21383H3 = false;
                    }
                    this.f21607b.f21401L1.removeCallbacksAndMessages(null);
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity13 = this.f21607b;
                    nSTEXOPlayerSkyActivity13.f21374G = m14798E;
                    nSTEXOPlayerSkyActivity13.f21379H = m14810Q;
                    nSTEXOPlayerSkyActivity13.f21557s3 = m14810Q;
                    this.f21607b.f21491f2.setCurrentEpgChannelID(this.f21607b.f21374G);
                    this.f21607b.f21491f2.setCurrentChannelLogo(this.f21607b.f21379H);
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity14 = this.f21607b;
                    nSTEXOPlayerSkyActivity14.m17754k3(nSTEXOPlayerSkyActivity14.f21379H);
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity15 = this.f21607b;
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity16 = this.f21607b;
                    nSTEXOPlayerSkyActivity15.f21566u2 = new AsyncTaskC3604m0(nSTEXOPlayerSkyActivity16, nSTEXOPlayerSkyActivity16.f21374G, null).execute(new String[0]);
                    this.f21607b.f21396K1.removeCallbacksAndMessages(null);
                    this.f21607b.f21346A1 = C5255e.m26214Q(m14811R);
                    if (this.f21607b.f21361D1 != null) {
                        this.f21607b.f21361D1.putString("currentlyPlayingVideo", m14811R);
                        this.f21607b.f21361D1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", m14816W);
                        this.f21607b.f21361D1.apply();
                    }
                    this.f21607b.f21434S.notifyDataSetChanged();
                    m15157D1.clear();
                    return;
                }
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity17 = this.f21607b;
                nSTEXOPlayerSkyActivity17.f21446U1.setText(nSTEXOPlayerSkyActivity17.f21480d.getResources().getString(2132018196));
                this.f21607b.f21441T1.setVisibility(0);
                handler = new Handler();
                bVar = new a(this);
            }
            handler.postDelayed(bVar, 1000L);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$d0.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$d0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$d0.class */
    public class C3586d0 implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        public final ArrayList f21610b;

        /* renamed from: c */
        public final NSTEXOPlayerSkyActivity f21611c;

        public C3586d0(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity, ArrayList arrayList) {
            this.f21611c = nSTEXOPlayerSkyActivity;
            this.f21610b = arrayList;
        }

        /* JADX WARN: Removed duplicated region for block: B:58:0x105b  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x10a7  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x10d5  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x1103  */
        @Override // android.widget.AdapterView.OnItemClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onItemClick(android.widget.AdapterView<?> r6, android.view.View r7, int r8, long r9) {
            /*
                Method dump skipped, instructions count: 4411
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity.C3586d0.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$e.class */
    public class RunnableC3587e implements Runnable {

        /* renamed from: b */
        public final String f21612b;

        /* renamed from: c */
        public final int f21613c;

        /* renamed from: d */
        public final NSTEXOPlayerSkyActivity f21614d;

        public RunnableC3587e(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity, String str, int i10) {
            this.f21614d = nSTEXOPlayerSkyActivity;
            this.f21612b = str;
            this.f21613c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity;
            String str;
            if (this.f21614d.f21478c2.equals("m3u")) {
                this.f21614d.f21368E3 = Uri.parse(this.f21612b);
                this.f21614d.f21491f2.m12507t(Boolean.valueOf(NSTEXOPlayerSkyActivity.f21339Z3));
                nSTEXOPlayerSkyActivity = this.f21614d;
                str = this.f21612b;
            } else {
                this.f21614d.f21368E3 = Uri.parse(this.f21614d.f21484e + C5255e.m26214Q(((LiveStreamsDBModel) this.f21614d.f21584y0.get(this.f21613c)).m14811R()) + this.f21614d.f21499h0);
                this.f21614d.f21491f2.m12507t(Boolean.valueOf(NSTEXOPlayerSkyActivity.f21339Z3));
                nSTEXOPlayerSkyActivity = this.f21614d;
                str = this.f21614d.f21484e + C5255e.m26214Q(((LiveStreamsDBModel) this.f21614d.f21584y0.get(this.f21613c)).m14811R()) + ".m3u8";
            }
            nSTEXOPlayerSkyActivity.f21547q3 = String.valueOf(Uri.parse(str));
            this.f21614d.m17768x2();
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity2 = this.f21614d;
            nSTEXOPlayerSkyActivity2.f21373F3 = 0;
            nSTEXOPlayerSkyActivity2.f21383H3 = false;
            nSTEXOPlayerSkyActivity2.f21401L1.removeCallbacksAndMessages(null);
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity3 = this.f21614d;
            nSTEXOPlayerSkyActivity3.f21374G = ((LiveStreamsDBModel) nSTEXOPlayerSkyActivity3.f21584y0.get(this.f21613c)).m14798E();
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity4 = this.f21614d;
            nSTEXOPlayerSkyActivity4.f21379H = ((LiveStreamsDBModel) nSTEXOPlayerSkyActivity4.f21584y0.get(this.f21613c)).m14810Q();
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity5 = this.f21614d;
            nSTEXOPlayerSkyActivity5.f21557s3 = nSTEXOPlayerSkyActivity5.f21379H;
            this.f21614d.f21491f2.setCurrentEpgChannelID(this.f21614d.f21374G);
            this.f21614d.f21491f2.setCurrentChannelLogo(this.f21614d.f21379H);
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity6 = this.f21614d;
            nSTEXOPlayerSkyActivity6.m17754k3(nSTEXOPlayerSkyActivity6.f21379H);
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity7 = this.f21614d;
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity8 = this.f21614d;
            nSTEXOPlayerSkyActivity7.f21566u2 = new AsyncTaskC3604m0(nSTEXOPlayerSkyActivity8, nSTEXOPlayerSkyActivity8.f21374G, null).execute(new String[0]);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$e0.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$e0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$e0.class */
    public class RunnableC3588e0 implements Runnable {

        /* renamed from: b */
        public final NSTEXOPlayerSkyActivity f21615b;

        public RunnableC3588e0(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity) {
            this.f21615b = nSTEXOPlayerSkyActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f21615b.m17736b2();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                } catch (Exception e11) {
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$f.class */
    public class RunnableC3589f implements Runnable {

        /* renamed from: b */
        public final String f21616b;

        /* renamed from: c */
        public final int f21617c;

        /* renamed from: d */
        public final NSTEXOPlayerSkyActivity f21618d;

        public RunnableC3589f(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity, String str, int i10) {
            this.f21618d = nSTEXOPlayerSkyActivity;
            this.f21616b = str;
            this.f21617c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity;
            String str;
            if (this.f21618d.f21478c2.equals("m3u")) {
                this.f21618d.f21368E3 = Uri.parse(this.f21616b);
                this.f21618d.f21491f2.m12507t(Boolean.valueOf(NSTEXOPlayerSkyActivity.f21339Z3));
                nSTEXOPlayerSkyActivity = this.f21618d;
                str = this.f21616b;
            } else {
                this.f21618d.f21368E3 = Uri.parse(this.f21618d.f21484e + C5255e.m26214Q(((LiveStreamsDBModel) this.f21618d.f21584y0.get(this.f21617c)).m14811R()) + this.f21618d.f21499h0);
                this.f21618d.f21491f2.m12507t(Boolean.valueOf(NSTEXOPlayerSkyActivity.f21339Z3));
                nSTEXOPlayerSkyActivity = this.f21618d;
                str = this.f21618d.f21484e + C5255e.m26214Q(((LiveStreamsDBModel) this.f21618d.f21584y0.get(this.f21617c)).m14811R()) + ".m3u8";
            }
            nSTEXOPlayerSkyActivity.f21547q3 = String.valueOf(Uri.parse(str));
            this.f21618d.m17768x2();
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity2 = this.f21618d;
            nSTEXOPlayerSkyActivity2.f21373F3 = 0;
            nSTEXOPlayerSkyActivity2.f21383H3 = false;
            nSTEXOPlayerSkyActivity2.f21401L1.removeCallbacksAndMessages(null);
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity3 = this.f21618d;
            nSTEXOPlayerSkyActivity3.f21374G = ((LiveStreamsDBModel) nSTEXOPlayerSkyActivity3.f21584y0.get(this.f21617c)).m14798E();
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity4 = this.f21618d;
            nSTEXOPlayerSkyActivity4.f21379H = ((LiveStreamsDBModel) nSTEXOPlayerSkyActivity4.f21584y0.get(this.f21617c)).m14810Q();
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity5 = this.f21618d;
            nSTEXOPlayerSkyActivity5.f21557s3 = nSTEXOPlayerSkyActivity5.f21379H;
            this.f21618d.f21491f2.setCurrentEpgChannelID(this.f21618d.f21374G);
            this.f21618d.f21491f2.setCurrentChannelLogo(this.f21618d.f21379H);
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity6 = this.f21618d;
            nSTEXOPlayerSkyActivity6.m17754k3(nSTEXOPlayerSkyActivity6.f21379H);
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity7 = this.f21618d;
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity8 = this.f21618d;
            nSTEXOPlayerSkyActivity7.f21566u2 = new AsyncTaskC3604m0(nSTEXOPlayerSkyActivity8, nSTEXOPlayerSkyActivity8.f21374G, null).execute(new String[0]);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$f0.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$f0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$f0.class */
    public class AsyncTaskC3590f0 extends AsyncTask<String, Void, Boolean> {

        /* renamed from: a */
        public final NSTEXOPlayerSkyActivity f21619a;

        public AsyncTaskC3590f0(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity) {
            this.f21619a = nSTEXOPlayerSkyActivity;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return Boolean.valueOf(this.f21619a.m17767w2());
            } catch (Exception e10) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (this.f21619a.f21491f2 != null) {
                this.f21619a.f21491f2.setEPGHandler(this.f21619a.f21401L1);
                this.f21619a.f21491f2.setContext(this.f21619a.f21480d);
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$g.class */
    public class RunnableC3591g implements Runnable {

        /* renamed from: b */
        public final NSTEXOPlayerSkyActivity f21620b;

        public RunnableC3591g(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity) {
            this.f21620b = nSTEXOPlayerSkyActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21620b.m17760p2();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$g0.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$g0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$g0.class */
    public class AsyncTaskC3592g0 extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        public final NSTEXOPlayerSkyActivity f21621a;

        public AsyncTaskC3592g0(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity) {
            this.f21621a = nSTEXOPlayerSkyActivity;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            boolean z10 = false;
            String str = strArr[0];
            try {
                switch (str.hashCode()) {
                    case -74797390:
                        if (str.equals("get_fav")) {
                            z10 = 2;
                            break;
                        }
                        z10 = -1;
                        break;
                    case 47612238:
                        if (str.equals("all_channels_with_cat")) {
                            z10 = true;
                            break;
                        }
                        z10 = -1;
                        break;
                    case 301138327:
                        if (str.equals("recently_watched")) {
                            z10 = 3;
                            break;
                        }
                        z10 = -1;
                        break;
                    case 613425326:
                        if (str.equals("all_channels")) {
                            break;
                        }
                        z10 = -1;
                        break;
                    default:
                        z10 = -1;
                        break;
                }
                if (!z10) {
                    return this.f21621a.m17704K1();
                }
                if (z10) {
                    return this.f21621a.m17708M1();
                }
                if (z10 == 2) {
                    return this.f21621a.m17745g2();
                }
                if (z10 != 3) {
                    return null;
                }
                return this.f21621a.m17718R1();
            } catch (Exception e10) {
                return "error";
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            try {
                if (this.f21621a.f21569v0 != null) {
                    if (!this.f21621a.f21461X1.booleanValue()) {
                        this.f21621a.f21461X1 = Boolean.TRUE;
                        if (this.f21621a.f21569v0.size() != 0) {
                            if (this.f21621a.f21584y0 != null) {
                                this.f21621a.f21584y0.clear();
                                this.f21621a.f21584y0.addAll(this.f21621a.f21569v0);
                            }
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity = this.f21621a;
                            nSTEXOPlayerSkyActivity.m17707L2(nSTEXOPlayerSkyActivity.f21569v0);
                        } else {
                            C5251a.f30008G = Boolean.FALSE;
                            this.f21621a.m17699H2();
                            this.f21621a.f21491f2.setVisibility(8);
                            this.f21621a.f21533o.setVisibility(0);
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity2 = this.f21621a;
                            nSTEXOPlayerSkyActivity2.f21538p.setText(nSTEXOPlayerSkyActivity2.getResources().getString(2132018196));
                        }
                    }
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity3 = this.f21621a;
                    if (nSTEXOPlayerSkyActivity3.f21430R0 && nSTEXOPlayerSkyActivity3.f21435S0 && !nSTEXOPlayerSkyActivity3.f21440T0.equals("")) {
                        this.f21621a.f21576w2 = 0;
                        try {
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity4 = this.f21621a;
                            nSTEXOPlayerSkyActivity4.f21576w2 = nSTEXOPlayerSkyActivity4.m17749i2(nSTEXOPlayerSkyActivity4.f21569v0, C5255e.m26215R(this.f21621a.f21440T0));
                        } catch (NumberFormatException | Exception e10) {
                        }
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity5 = this.f21621a;
                        nSTEXOPlayerSkyActivity5.f21430R0 = false;
                        nSTEXOPlayerSkyActivity5.f21435S0 = false;
                    }
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity6 = this.f21621a;
                    nSTEXOPlayerSkyActivity6.m17717Q2(nSTEXOPlayerSkyActivity6.f21569v0);
                }
                this.f21621a.m17762r2();
            } catch (Exception e11) {
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            TextView textView;
            String string;
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity;
            super.onPreExecute();
            try {
                this.f21621a.m17735a3();
                TextView textView2 = this.f21621a.f21410N0;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity2 = this.f21621a;
                if (nSTEXOPlayerSkyActivity2.f21514k0 != null) {
                    if (!nSTEXOPlayerSkyActivity2.f21481d1.equals("") && this.f21621a.f21481d1.equals("0")) {
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity3 = this.f21621a;
                        nSTEXOPlayerSkyActivity3.f21514k0.setText(nSTEXOPlayerSkyActivity3.f21480d.getResources().getString(2132017297));
                        nSTEXOPlayerSkyActivity = this.f21621a;
                    } else if (!this.f21621a.f21481d1.equals("") && this.f21621a.f21481d1.equals("-1")) {
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity4 = this.f21621a;
                        nSTEXOPlayerSkyActivity4.f21514k0.setText(nSTEXOPlayerSkyActivity4.f21480d.getResources().getString(2132017779));
                        nSTEXOPlayerSkyActivity = this.f21621a;
                    } else if (this.f21621a.f21481d1.equals("") || !this.f21621a.f21481d1.equals("-6")) {
                        if (this.f21621a.f21485e1.equals("")) {
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity5 = this.f21621a;
                            textView = nSTEXOPlayerSkyActivity5.f21514k0;
                            string = nSTEXOPlayerSkyActivity5.getResources().getString(2132018731);
                        } else {
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity6 = this.f21621a;
                            textView = nSTEXOPlayerSkyActivity6.f21514k0;
                            string = nSTEXOPlayerSkyActivity6.f21485e1;
                        }
                        textView.setText(string);
                        nSTEXOPlayerSkyActivity = this.f21621a;
                    } else {
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity7 = this.f21621a;
                        nSTEXOPlayerSkyActivity7.f21514k0.setText(nSTEXOPlayerSkyActivity7.f21480d.getResources().getString(2132018441));
                        nSTEXOPlayerSkyActivity = this.f21621a;
                    }
                    nSTEXOPlayerSkyActivity.f21514k0.setSelected(true);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$h.class */
    public class RunnableC3593h implements Runnable {

        /* renamed from: b */
        public final NSTEXOPlayerSkyActivity f21622b;

        public RunnableC3593h(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity) {
            this.f21622b = nSTEXOPlayerSkyActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21622b.m17759o2();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$h0.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$h0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$h0.class */
    public class AsyncTaskC3594h0 extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        public final NSTEXOPlayerSkyActivity f21623a;

        public AsyncTaskC3594h0(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity) {
            this.f21623a = nSTEXOPlayerSkyActivity;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            try {
                return this.f21623a.f21437S2.equals("-1") ? this.f21623a.m17747h2() : this.f21623a.f21437S2.equals("-6") ? this.f21623a.m17718R1() : this.f21623a.m17712O1();
            } catch (Exception e10) {
                return "error";
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            try {
                if (this.f21623a.f21574w0 != null) {
                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity = this.f21623a;
                    nSTEXOPlayerSkyActivity.m17719R2(nSTEXOPlayerSkyActivity.f21574w0);
                }
                this.f21623a.m17761q2();
            } catch (Exception e10) {
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f21623a.m17734Z2();
            LinearLayout linearLayout = this.f21623a.f21415O0;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            if (this.f21623a.f21394K != null) {
                this.f21623a.f21394K.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$i.class */
    public class C3595i extends BroadcastReceiver {

        /* renamed from: a */
        public final NSTEXOPlayerSkyActivity f21624a;

        public C3595i(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity) {
            this.f21624a = nSTEXOPlayerSkyActivity;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"media_control".equals(intent.getAction())) {
                return;
            }
            int intExtra = intent.getIntExtra("control_type", 0);
            if (intExtra == 1) {
                this.f21624a.m17705K2();
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f21624a.m17756l3(2131231165, "pause", 2, 2);
                    return;
                }
                return;
            }
            if (intExtra != 2) {
                return;
            }
            this.f21624a.m17703J2();
            if (Build.VERSION.SDK_INT >= 26) {
                this.f21624a.m17756l3(2131231136, "play", 1, 1);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$i0.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$i0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$i0.class */
    public class ViewOnFocusChangeListenerC3596i0 implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f21625b;

        /* renamed from: c */
        public final NSTEXOPlayerSkyActivity f21626c;

        public ViewOnFocusChangeListenerC3596i0(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity, View view) {
            this.f21626c = nSTEXOPlayerSkyActivity;
            this.f21625b = view;
        }

        /* renamed from: a */
        public final void m17777a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f21625b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m17778b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f21625b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m17779c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f21625b, "scaleY", f10);
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
                View view8 = this.f21625b;
                if (view8 == null || view8.getTag() == null || !this.f21625b.getTag().equals("1")) {
                    View view9 = this.f21625b;
                    if (view9 == null || view9.getTag() == null || !this.f21625b.getTag().equals("2")) {
                        View view10 = this.f21625b;
                        if (view10 == null || view10.getTag() == null || !this.f21625b.getTag().equals("3")) {
                            View view11 = this.f21625b;
                            if ((view11 != null && view11.getTag() != null && this.f21625b.getTag().equals("4")) || (((view5 = this.f21625b) != null && view5.getTag() != null && this.f21625b.getTag().equals("5")) || (((view6 = this.f21625b) != null && view6.getTag() != null && this.f21625b.getTag().equals("6")) || ((view7 = this.f21625b) != null && view7.getTag() != null && this.f21625b.getTag().equals("7"))))) {
                                view.setBackground(this.f21626c.getResources().getDrawable(2131231461));
                                return;
                            }
                            View view12 = this.f21625b;
                            if (view12 != null && view12.getTag() != null && this.f21625b.getTag().equals("8")) {
                                return;
                            }
                            View view13 = this.f21625b;
                            if (view13 == null || view13.getTag() == null || !this.f21625b.getTag().equals("9")) {
                                View view14 = this.f21625b;
                                if (view14 == null || view14.getTag() == null || !this.f21625b.getTag().equals("10")) {
                                    return;
                                }
                                view.setBackground(this.f21626c.getResources().getDrawable(2131231460));
                                m17778b(f10);
                                m17779c(f10);
                                linearLayout2 = this.f21626c.ll_restart;
                            }
                        }
                        view.setBackground(this.f21626c.getResources().getDrawable(2131231460));
                        m17778b(f10);
                        m17779c(f10);
                        return;
                    }
                    view.setBackground(this.f21626c.getResources().getDrawable(2131231460));
                    m17778b(f10);
                    m17779c(f10);
                    linearLayout2 = this.f21626c.ll_audio_subtitle_settings;
                } else {
                    view.setBackground(this.f21626c.getResources().getDrawable(2131231460));
                    m17778b(f10);
                    m17779c(f10);
                    linearLayout2 = this.f21626c.ll_back;
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
            View view15 = this.f21625b;
            if (view15 == null || view15.getTag() == null || !this.f21625b.getTag().equals("1")) {
                View view16 = this.f21625b;
                if (view16 == null || view16.getTag() == null || !this.f21625b.getTag().equals("2")) {
                    View view17 = this.f21625b;
                    if (view17 == null || view17.getTag() == null || !this.f21625b.getTag().equals("3")) {
                        View view18 = this.f21625b;
                        if ((view18 != null && view18.getTag() != null && this.f21625b.getTag().equals("4")) || (((view2 = this.f21625b) != null && view2.getTag() != null && this.f21625b.getTag().equals("5")) || (((view3 = this.f21625b) != null && view3.getTag() != null && this.f21625b.getTag().equals("6")) || ((view4 = this.f21625b) != null && view4.getTag() != null && this.f21625b.getTag().equals("7"))))) {
                            view.setBackground(null);
                            return;
                        }
                        View view19 = this.f21625b;
                        if (view19 != null && view19.getTag() != null && this.f21625b.getTag().equals("8")) {
                            return;
                        }
                        View view20 = this.f21625b;
                        if (view20 == null || view20.getTag() == null || !this.f21625b.getTag().equals("9")) {
                            View view21 = this.f21625b;
                            if (view21 == null || view21.getTag() == null || !this.f21625b.getTag().equals("10")) {
                                return;
                            }
                            view.setBackground(this.f21626c.getResources().getDrawable(2131231458));
                            m17778b(f10);
                            m17779c(f10);
                            m17777a(z10);
                            linearLayout = this.f21626c.ll_restart;
                        }
                    }
                    view.setBackground(this.f21626c.getResources().getDrawable(2131231458));
                    m17778b(f10);
                    m17779c(f10);
                    m17777a(z10);
                    return;
                }
                view.setBackground(this.f21626c.getResources().getDrawable(2131231458));
                m17778b(f10);
                m17779c(f10);
                m17777a(z10);
                linearLayout = this.f21626c.ll_audio_subtitle_settings;
            } else {
                view.setBackground(this.f21626c.getResources().getDrawable(2131231458));
                m17778b(f10);
                m17779c(f10);
                m17777a(z10);
                linearLayout = this.f21626c.ll_back;
            }
            linearLayout.setVisibility(8);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$j.class */
    public class C3597j extends NSTIJKPlayerSky.AbstractC3970w {

        /* renamed from: a */
        public final NSTEXOPlayerSkyActivity f21627a;

        public C3597j(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity) {
            this.f21627a = nSTEXOPlayerSkyActivity;
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky.AbstractC3970w
        /* renamed from: a */
        public void mo17780a() {
            this.f21627a.m17756l3(2131231165, "pause", 2, 2);
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky.AbstractC3970w
        /* renamed from: b */
        public void mo17781b() {
            this.f21627a.m17756l3(2131231136, "play", 1, 1);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$j0.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$j0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$j0.class */
    public class C3598j0 implements InterfaceC4370k<C7597l1> {

        /* renamed from: a */
        public final NSTEXOPlayerSkyActivity f21628a;

        public C3598j0(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity) {
            this.f21628a = nSTEXOPlayerSkyActivity;
        }

        public /* synthetic */ C3598j0(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity, C3599k c3599k) {
            this(nSTEXOPlayerSkyActivity);
        }

        @Override // p059d9.InterfaceC4370k
        @SuppressLint({"StringFormatInvalid"})
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Pair<Integer, String> mo15749a(C7597l1 c7597l1) {
            String string = this.f21628a.getString(2132017684);
            Throwable cause = c7597l1.getCause();
            String str = string;
            if (cause instanceof AbstractC7654o.a) {
                AbstractC7654o.a aVar = (AbstractC7654o.a) cause;
                C7653n c7653n = aVar.f37288d;
                str = c7653n == null ? aVar.getCause() instanceof C7661v.c ? this.f21628a.getString(2132017690) : aVar.f37287c ? this.f21628a.getString(2132017688, aVar.f37286b) : this.f21628a.getString(2132017687, aVar.f37286b) : this.f21628a.getString(2132017686, c7653n.f37201a);
            }
            return Pair.create(0, str);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$k.class */
    public class C3599k implements InterfaceC5993u<C5947e> {

        /* renamed from: a */
        public final NSTEXOPlayerSkyActivity f21629a;

        public C3599k(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity) {
            this.f21629a = nSTEXOPlayerSkyActivity;
        }

        /* renamed from: c */
        public final void m17783c(C5947e c5947e) {
            this.f21629a.f21402L2 = c5947e;
            try {
                C5782l c5782l = new C5782l(1);
                c5782l.m28249V("com.google.android.gms.cast.metadata.TITLE", this.f21629a.f21552r3);
                c5782l.m28253b(new C9691a(Uri.parse(this.f21629a.f21557s3)));
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity = this.f21629a;
                C4718a.m23742b(nSTEXOPlayerSkyActivity.f21417O2, nSTEXOPlayerSkyActivity.f21402L2.m29290r(), this.f21629a.f21547q3, c5782l, this.f21629a.f21480d);
            } catch (Exception e10) {
            }
            this.f21629a.invalidateOptionsMenu();
        }

        /* renamed from: g */
        public final void m17784g() {
            this.f21629a.invalidateOptionsMenu();
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo14735a(C5947e c5947e, int i10) {
            m17784g();
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo14736b(C5947e c5947e) {
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo14740f(C5947e c5947e, int i10) {
            m17784g();
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo14744j(C5947e c5947e, boolean z10) {
            m17783c(c5947e);
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo14746l(C5947e c5947e, String str) {
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void mo14748n(C5947e c5947e, int i10) {
            m17784g();
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public void mo14738d(C5947e c5947e, String str) {
            m17783c(c5947e);
        }

        @Override // p216m9.InterfaceC5993u
        @SuppressLint({"SetTextI18n"})
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo14749o(C5947e c5947e) {
            TextView textView;
            StringBuilder sb2;
            String string;
            this.f21629a.f21402L2 = c5947e;
            if (this.f21629a.f21402L2 != null) {
                if (this.f21629a.f21491f2 != null) {
                    this.f21629a.m17703J2();
                }
                LinearLayout linearLayout = this.f21629a.ll_casting_to_tv;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity = this.f21629a;
                if (nSTEXOPlayerSkyActivity.tv_casting_status_text != null) {
                    if (nSTEXOPlayerSkyActivity.f21402L2.m29289q() == null || this.f21629a.f21402L2.m29289q().m13041R() == null) {
                        textView = this.f21629a.tv_casting_status_text;
                        sb2 = new StringBuilder();
                        string = this.f21629a.getResources().getString(2132017518);
                    } else {
                        textView = this.f21629a.tv_casting_status_text;
                        sb2 = new StringBuilder();
                        sb2.append(this.f21629a.getResources().getString(2132017519));
                        sb2.append(" ");
                        string = this.f21629a.f21402L2.m29289q().m13041R();
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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$k0.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$k0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$k0.class */
    public class C3600k0 implements InterfaceC7606o1.e {

        /* renamed from: b */
        public final NSTEXOPlayerSkyActivity f21630b;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$k0$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$k0$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$k0$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final C3600k0 f21631b;

            public a(C3600k0 c3600k0) {
                this.f21631b = c3600k0;
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity = this.f21631b.f21630b;
                if (nSTEXOPlayerSkyActivity.f21388I3) {
                    return;
                }
                nSTEXOPlayerSkyActivity.f21373F3++;
                C5255e.m26241k0(nSTEXOPlayerSkyActivity.f21480d, this.f21631b.f21630b.f21480d.getResources().getString(2132018322) + " (" + this.f21631b.f21630b.f21373F3 + "/" + this.f21631b.f21630b.f21378G3 + ")");
                this.f21631b.f21630b.m17711N2();
                this.f21631b.f21630b.m17768x2();
            }
        }

        public C3600k0(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity) {
            this.f21630b = nSTEXOPlayerSkyActivity;
        }

        public /* synthetic */ C3600k0(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity, C3599k c3599k) {
            this(nSTEXOPlayerSkyActivity);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: A */
        public void mo12514A(C7597l1 c7597l1) {
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity = this.f21630b;
            if (nSTEXOPlayerSkyActivity.f21388I3) {
                return;
            }
            if (c7597l1.f36854b == 1002) {
                nSTEXOPlayerSkyActivity.m17768x2();
            } else if (!c7597l1.toString().contains("com.google.android.exoplayer2.ext.ffmpeg.FfmpegDecoderException")) {
                m17794b();
            } else {
                C5255e.m26241k0(this.f21630b.f21480d, "Audio track issue found. Please change the audio track to none.");
                this.f21630b.m17768x2();
            }
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: C */
        public /* synthetic */ void mo12515C(InterfaceC7606o1 interfaceC7606o1, InterfaceC7606o1.d dVar) {
            C7612q1.m32987f(this, interfaceC7606o1, dVar);
        }

        @Override // p078e9.InterfaceC4683q
        /* renamed from: D */
        public /* synthetic */ void mo12516D() {
            C7612q1.m33000s(this);
        }

        @Override // p243o8.InterfaceC6929k
        /* renamed from: E */
        public /* synthetic */ void mo12517E(List list) {
            C7612q1.m32984c(this, list);
        }

        @Override // p078e9.InterfaceC4683q
        /* renamed from: I */
        public /* synthetic */ void mo12518I(int i10, int i11) {
            C7612q1.m33004w(this, i10, i11);
        }

        @Override // p283q7.InterfaceC7844f
        /* renamed from: L */
        public /* synthetic */ void mo12519L(C7839a c7839a) {
            C7612q1.m32992k(this, c7839a);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: M */
        public /* synthetic */ void mo12520M(int i10) {
            C7609p1.m32891l(this, i10);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: N */
        public /* synthetic */ void mo12521N(boolean z10) {
            C7612q1.m32988g(this, z10);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: O */
        public /* synthetic */ void mo12522O() {
            C7609p1.m32894o(this);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: Q */
        public /* synthetic */ void mo12523Q(InterfaceC7606o1.b bVar) {
            C7612q1.m32983b(this, bVar);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: R */
        public /* synthetic */ void mo12524R(C7597l1 c7597l1) {
            C7612q1.m32998q(this, c7597l1);
        }

        @Override // p301r6.InterfaceC7978g
        /* renamed from: S */
        public /* synthetic */ void mo12525S(C7972d c7972d) {
            C7612q1.m32982a(this, c7972d);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: Y */
        public /* synthetic */ void mo12526Y(boolean z10, int i10) {
            C7609p1.m32890k(this, z10, i10);
        }

        @Override // p301r6.InterfaceC7978g
        /* renamed from: a */
        public /* synthetic */ void mo12527a(boolean z10) {
            C7612q1.m33003v(this, z10);
        }

        @Override // p078e9.InterfaceC4683q
        /* renamed from: a0 */
        public /* synthetic */ void mo12528a0(int i10, int i11, int i12, float f10) {
            C4682p.m23609a(this, i10, i11, i12, f10);
        }

        /* renamed from: b */
        public final void m17794b() {
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity = this.f21630b;
            if (nSTEXOPlayerSkyActivity.f21373F3 >= nSTEXOPlayerSkyActivity.f21378G3) {
                m17795d(this.f21630b.f21480d.getResources().getString(2132018603));
                this.f21630b.m17711N2();
                this.f21630b.f21383H3 = false;
                NSTEXOPlayerSkyActivity.f21343d4.setVisibility(8);
                return;
            }
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity2 = this.f21630b;
            if (nSTEXOPlayerSkyActivity2.f21388I3) {
                return;
            }
            nSTEXOPlayerSkyActivity2.f21383H3 = true;
            nSTEXOPlayerSkyActivity2.f21386I1.postDelayed(new a(this), 3000L);
        }

        @Override // p078e9.InterfaceC4683q
        /* renamed from: c */
        public /* synthetic */ void mo12529c(C4670d0 c4670d0) {
            C7612q1.m33007z(this, c4670d0);
        }

        /* renamed from: d */
        public final void m17795d(String str) {
            this.f21630b.f21533o.setVisibility(0);
            this.f21630b.f21538p.setText(str);
        }

        @Override // p347u6.InterfaceC8796b
        /* renamed from: d0 */
        public /* synthetic */ void mo12531d0(C8795a c8795a) {
            C7612q1.m32985d(this, c8795a);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: e */
        public /* synthetic */ void mo12532e(C7603n1 c7603n1) {
            C7612q1.m32994m(this, c7603n1);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: e0 */
        public void mo12533e0(C0083a1 c0083a1, C9888l c9888l) {
            try {
                AbstractC9886j.a m41705g = this.f21630b.f21358C3.m41705g();
                if (m41705g != null) {
                    m41705g.m41714i(2);
                    m41705g.m41714i(1);
                }
            } catch (Exception e10) {
            }
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: f */
        public /* synthetic */ void mo12534f(int i10) {
            C7612q1.m32996o(this, i10);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: g0 */
        public /* synthetic */ void mo12535g0(boolean z10, int i10) {
            C7612q1.m32993l(this, z10, i10);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: h */
        public /* synthetic */ void mo12536h(boolean z10) {
            C7609p1.m32883d(this, z10);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: i0 */
        public /* synthetic */ void mo12537i0(InterfaceC7606o1.f fVar, InterfaceC7606o1.f fVar2, int i10) {
            C7612q1.m32999r(this, fVar, fVar2, i10);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: j */
        public /* synthetic */ void mo12538j(List list) {
            C7609p1.m32896q(this, list);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: m */
        public void mo12539m(int i10) {
            if (i10 == 2) {
                if (NSTEXOPlayerSkyActivity.m17653Z1()) {
                    return;
                }
                LinearLayout linearLayout = this.f21630b.ll_pause_play;
                if (linearLayout != null && linearLayout.getVisibility() == 0) {
                    this.f21630b.ll_pause_play.setVisibility(8);
                }
                NSTEXOPlayerSkyActivity.f21343d4.setVisibility(0);
                return;
            }
            if (i10 == 4) {
                m17794b();
                return;
            }
            if (i10 == 3) {
                if (this.f21630b.ll_player_header_footer.getVisibility() == 0) {
                    this.f21630b.ll_pause_play.setVisibility(0);
                }
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity = this.f21630b;
                nSTEXOPlayerSkyActivity.f21373F3 = 0;
                nSTEXOPlayerSkyActivity.f21488f.setVisibility(8);
                this.f21630b.f21493g.setVisibility(0);
                if (NSTEXOPlayerSkyActivity.f21339Z3) {
                    this.f21630b.f21493g.requestFocus();
                }
                NSTEXOPlayerSkyActivity.f21343d4.setVisibility(8);
                LiveStreamDBHandler liveStreamDBHandler = this.f21630b.f21424Q;
                if (liveStreamDBHandler != null) {
                    liveStreamDBHandler.m15194U0(C7920a.m34301l().m34309m());
                    this.f21630b.f21424Q.m15237o0(C7920a.m34301l().m34309m());
                    this.f21630b.f21424Q.m15184P0();
                }
            }
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: m0 */
        public /* synthetic */ void mo12540m0(boolean z10) {
            C7612q1.m32989h(this, z10);
        }

        @Override // p267p6.InterfaceC7606o1.c
        public /* synthetic */ void onRepeatModeChanged(int i10) {
            C7612q1.m33001t(this, i10);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: p */
        public /* synthetic */ void mo12541p(AbstractC7574e2 abstractC7574e2, int i10) {
            C7612q1.m33005x(this, abstractC7574e2, i10);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: s */
        public /* synthetic */ void mo12542s(boolean z10) {
            C7612q1.m33002u(this, z10);
        }

        @Override // p347u6.InterfaceC8796b
        /* renamed from: w */
        public /* synthetic */ void mo12543w(int i10, boolean z10) {
            C7612q1.m32986e(this, i10, z10);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: x */
        public /* synthetic */ void mo12544x(C7561b1 c7561b1, int i10) {
            C7612q1.m32990i(this, c7561b1, i10);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: y */
        public /* synthetic */ void mo12545y(C7565c1 c7565c1) {
            C7612q1.m32991j(this, c7565c1);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$l.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$l.class */
    public class DialogC3601l extends Dialog implements View.OnClickListener {

        /* renamed from: b */
        public Activity f21632b;

        /* renamed from: c */
        public TextView f21633c;

        /* renamed from: d */
        public TextView f21634d;

        /* renamed from: e */
        public LinearLayout f21635e;

        /* renamed from: f */
        public LinearLayout f21636f;

        /* renamed from: g */
        public RadioGroup f21637g;

        /* renamed from: h */
        public final Activity f21638h;

        /* renamed from: i */
        public final NSTEXOPlayerSkyActivity f21639i;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$l$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$l$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$l$a.class */
        public class a implements View.OnFocusChangeListener {

            /* renamed from: b */
            public View f21640b;

            /* renamed from: c */
            public final DialogC3601l f21641c;

            public a(DialogC3601l dialogC3601l, View view) {
                this.f21641c = dialogC3601l;
                this.f21640b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z10) {
                int i10;
                LinearLayout linearLayout;
                if (z10) {
                    View view2 = this.f21640b;
                    i10 = 2131230846;
                    if (view2 == null || view2.getTag() == null || !this.f21640b.getTag().equals("1")) {
                        View view3 = this.f21640b;
                        if (view3 == null || view3.getTag() == null || !this.f21640b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f21641c.f21636f;
                    }
                    linearLayout = this.f21641c.f21635e;
                } else {
                    View view4 = this.f21640b;
                    i10 = 2131230845;
                    if (view4 == null || view4.getTag() == null || !this.f21640b.getTag().equals("1")) {
                        View view5 = this.f21640b;
                        if (view5 == null || view5.getTag() == null || !this.f21640b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f21641c.f21636f;
                    }
                    linearLayout = this.f21641c.f21635e;
                }
                linearLayout.setBackgroundResource(i10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogC3601l(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity, Activity activity, Activity activity2) {
            super(activity);
            this.f21639i = nSTEXOPlayerSkyActivity;
            this.f21638h = activity2;
            this.f21632b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            String str2;
            int id2 = view.getId();
            if (id2 == 2131427653) {
                dismiss();
            } else if (id2 == 2131427681) {
                try {
                    RadioButton radioButton = (RadioButton) findViewById(this.f21637g.getCheckedRadioButtonId());
                    if (radioButton.getText().toString().equals(this.f21638h.getResources().getString(2132018611))) {
                        str = "1";
                        if (this.f21639i.f21567u3.equals("true")) {
                            str2 = "1";
                            SharepreferenceDBHandler.m15358V(str2, this.f21638h);
                        }
                        SharepreferenceDBHandler.m15357U(str, this.f21638h);
                    } else if (radioButton.getText().toString().equals(this.f21638h.getResources().getString(2132018607))) {
                        str = "2";
                        if (this.f21639i.f21567u3.equals("true")) {
                            str2 = "2";
                            SharepreferenceDBHandler.m15358V(str2, this.f21638h);
                        }
                        SharepreferenceDBHandler.m15357U(str, this.f21638h);
                    } else if (radioButton.getText().toString().equals(this.f21638h.getResources().getString(2132018615))) {
                        str = "3";
                        if (this.f21639i.f21567u3.equals("true")) {
                            str2 = "3";
                            SharepreferenceDBHandler.m15358V(str2, this.f21638h);
                        }
                        SharepreferenceDBHandler.m15357U(str, this.f21638h);
                    } else if (radioButton.getText().toString().equals(this.f21638h.getResources().getString(2132018608))) {
                        str = "4";
                        if (this.f21639i.f21567u3.equals("true")) {
                            str2 = "4";
                            SharepreferenceDBHandler.m15358V(str2, this.f21638h);
                        }
                        SharepreferenceDBHandler.m15357U(str, this.f21638h);
                    } else if (radioButton.getText().toString().equals(this.f21638h.getResources().getString(2132018609))) {
                        str = "5";
                        if (this.f21639i.f21567u3.equals("true")) {
                            str2 = "5";
                            SharepreferenceDBHandler.m15358V(str2, this.f21638h);
                        }
                        SharepreferenceDBHandler.m15357U(str, this.f21638h);
                    } else if (this.f21639i.f21567u3.equals("true")) {
                        SharepreferenceDBHandler.m15358V("0", this.f21638h);
                    } else {
                        SharepreferenceDBHandler.m15357U("0", this.f21638h);
                    }
                    if (this.f21639i.f21481d1.equals("0")) {
                        this.f21639i.m17702J1();
                    } else {
                        String str3 = this.f21639i.f21481d1;
                        if (str3 == null || str3.equals("") || !this.f21639i.f21481d1.equals("-1")) {
                            String str4 = this.f21639i.f21481d1;
                            if (str4 == null || str4.equals("") || !this.f21639i.f21481d1.equals("-6")) {
                                this.f21639i.m17706L1();
                            } else {
                                this.f21639i.m17716Q1();
                            }
                        } else {
                            this.f21639i.m17714P1();
                        }
                    }
                    dismiss();
                } catch (Exception e10) {
                }
            }
            dismiss();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x01bb, code lost:
        
            if (r7.equals("1") == false) goto L8;
         */
        @Override // android.app.Dialog
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onCreate(android.os.Bundle r7) {
            /*
                Method dump skipped, instructions count: 587
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity.DialogC3601l.onCreate(android.os.Bundle):void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$l0.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$l0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$l0.class */
    public class C3602l0 extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: b */
        public boolean f21642b;

        /* renamed from: c */
        public final NSTEXOPlayerSkyActivity f21643c;

        public C3602l0(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity) {
            this.f21643c = nSTEXOPlayerSkyActivity;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            this.f21642b = true;
            return super.onDown(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            this.f21643c.m17750i3();
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$m.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$m */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$m.class */
    public class DialogInterfaceOnClickListenerC3603m implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final NSTEXOPlayerSkyActivity f21644b;

        public DialogInterfaceOnClickListenerC3603m(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity) {
            this.f21644b = nSTEXOPlayerSkyActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$m0.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$m0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$m0.class */
    public class AsyncTaskC3604m0 extends AsyncTask<String, Void, HashMap<String, ArrayList<String>>> {

        /* renamed from: a */
        public String f21645a;

        /* renamed from: b */
        public final NSTEXOPlayerSkyActivity f21646b;

        public AsyncTaskC3604m0(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity, String str) {
            this.f21646b = nSTEXOPlayerSkyActivity;
            this.f21645a = str;
        }

        public /* synthetic */ AsyncTaskC3604m0(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity, String str, C3599k c3599k) {
            this(nSTEXOPlayerSkyActivity, str);
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public HashMap<String, ArrayList<String>> doInBackground(String... strArr) {
            try {
                return this.f21646b.m17727V2(this.f21645a);
            } catch (Exception e10) {
                return new HashMap<>();
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(HashMap<String, ArrayList<String>> hashMap) {
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity;
            ArrayList<String> arrayList;
            super.onPostExecute(hashMap);
            try {
                if (hashMap.get("2") != null) {
                    ArrayList<String> arrayList2 = hashMap.get("2");
                    if (arrayList2 == null || arrayList2.get(0) == null || !arrayList2.get(0).equals("installed")) {
                        this.f21646b.f21580x1.setVisibility(0);
                        nSTEXOPlayerSkyActivity = this.f21646b;
                    } else if (hashMap.get("0") != null) {
                        ArrayList<String> arrayList3 = hashMap.get("0");
                        if (arrayList3 != null && arrayList3.size() > 0) {
                            LinearLayout linearLayout = this.f21646b.f21585y1;
                            if (linearLayout != null) {
                                linearLayout.setVisibility(8);
                            }
                            if (hashMap.get("3") != null && this.f21646b.f21573w != null) {
                                ArrayList<String> arrayList4 = hashMap.get("3");
                                if (arrayList4 == null || arrayList4.get(0) == null) {
                                    this.f21646b.f21573w.setProgress(0);
                                } else {
                                    this.f21646b.f21573w.setProgress(Integer.parseInt(arrayList4.get(0)));
                                }
                            }
                            try {
                                if (arrayList3.get(0) != null) {
                                    this.f21646b.f21548r.setText(arrayList3.get(0));
                                } else {
                                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity2 = this.f21646b;
                                    nSTEXOPlayerSkyActivity2.f21548r.setText(nSTEXOPlayerSkyActivity2.f21480d.getResources().getString(2132018252));
                                }
                            } catch (Exception e10) {
                                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity3 = this.f21646b;
                                nSTEXOPlayerSkyActivity3.f21548r.setText(nSTEXOPlayerSkyActivity3.f21480d.getResources().getString(2132018252));
                            }
                            try {
                                if (arrayList3.get(1) != null) {
                                    this.f21646b.f21553s.setText(arrayList3.get(1));
                                } else {
                                    this.f21646b.f21553s.setText("");
                                }
                            } catch (Exception e11) {
                                this.f21646b.f21553s.setText("");
                            }
                            try {
                                if (arrayList3.get(3) != null) {
                                    this.f21646b.f21558t.setText(arrayList3.get(3));
                                } else {
                                    NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity4 = this.f21646b;
                                    nSTEXOPlayerSkyActivity4.f21558t.setText(nSTEXOPlayerSkyActivity4.f21480d.getResources().getString(2132018252));
                                }
                            } catch (Exception e12) {
                                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity5 = this.f21646b;
                                nSTEXOPlayerSkyActivity5.f21558t.setText(nSTEXOPlayerSkyActivity5.f21480d.getResources().getString(2132018252));
                            }
                            try {
                                if (arrayList3.get(4) != null) {
                                    this.f21646b.f21563u.setText(arrayList3.get(4));
                                } else {
                                    this.f21646b.f21563u.setText("");
                                }
                            } catch (Exception e13) {
                                this.f21646b.f21563u.setText("");
                            }
                            if (hashMap.get("1") != null || (arrayList = hashMap.get("1")) == null || arrayList.size() <= 0) {
                                this.f21646b.m17758n2();
                            }
                            try {
                                if (arrayList.get(0) != null) {
                                    TextView textView = this.f21646b.f21490f1;
                                    if (textView != null) {
                                        textView.setText(arrayList.get(0));
                                    }
                                    TextView textView2 = this.f21646b.tv_start_stop;
                                    if (textView2 != null) {
                                        textView2.setText(arrayList.get(0));
                                        this.f21646b.tv_start_stop.setSelected(true);
                                    }
                                } else {
                                    TextView textView3 = this.f21646b.f21490f1;
                                    if (textView3 != null) {
                                        textView3.setText("");
                                    }
                                }
                            } catch (Exception e14) {
                                TextView textView4 = this.f21646b.f21490f1;
                                if (textView4 != null) {
                                    textView4.setText("");
                                }
                            }
                            try {
                                if (arrayList.get(1) != null) {
                                    TextView textView5 = this.f21646b.f21535o1;
                                    if (textView5 != null) {
                                        textView5.setText(arrayList.get(1));
                                    }
                                    TextView textView6 = this.f21646b.tv_program_name;
                                    if (textView6 != null) {
                                        textView6.setText(arrayList.get(1));
                                        this.f21646b.tv_program_name.setSelected(true);
                                    }
                                } else {
                                    TextView textView7 = this.f21646b.f21535o1;
                                    if (textView7 != null) {
                                        textView7.setText("");
                                    }
                                }
                            } catch (Exception e15) {
                                TextView textView8 = this.f21646b.f21535o1;
                                if (textView8 != null) {
                                    textView8.setText("");
                                }
                            }
                            try {
                                if (arrayList.get(2) != null) {
                                    TextView textView9 = this.f21646b.f21495g1;
                                    if (textView9 != null) {
                                        textView9.setText(arrayList.get(2));
                                    }
                                } else {
                                    TextView textView10 = this.f21646b.f21495g1;
                                    if (textView10 != null) {
                                        textView10.setText("");
                                    }
                                }
                            } catch (Exception e16) {
                                TextView textView11 = this.f21646b.f21495g1;
                                if (textView11 != null) {
                                    textView11.setText("");
                                }
                            }
                            TextView textView12 = this.f21646b.f21535o1;
                            if (textView12 != null) {
                                textView12.setSelected(true);
                            }
                            LinearLayout linearLayout2 = this.f21646b.f21555s1;
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(0);
                            }
                            try {
                                if (arrayList.get(3) != null) {
                                    TextView textView13 = this.f21646b.f21500h1;
                                    if (textView13 != null) {
                                        textView13.setText(arrayList.get(3));
                                    }
                                } else {
                                    TextView textView14 = this.f21646b.f21500h1;
                                    if (textView14 != null) {
                                        textView14.setText("");
                                    }
                                }
                            } catch (Exception e17) {
                                TextView textView15 = this.f21646b.f21500h1;
                                if (textView15 != null) {
                                    textView15.setText("");
                                }
                            }
                            try {
                                if (arrayList.get(4) != null) {
                                    TextView textView16 = this.f21646b.f21540p1;
                                    if (textView16 != null) {
                                        textView16.setText(arrayList.get(4));
                                    }
                                } else {
                                    TextView textView17 = this.f21646b.f21540p1;
                                    if (textView17 != null) {
                                        textView17.setText("");
                                    }
                                }
                            } catch (Exception e18) {
                                TextView textView18 = this.f21646b.f21540p1;
                                if (textView18 != null) {
                                    textView18.setText("");
                                }
                            }
                            try {
                                if (arrayList.get(5) != null) {
                                    TextView textView19 = this.f21646b.f21505i1;
                                    if (textView19 != null) {
                                        textView19.setText(arrayList.get(5));
                                    }
                                } else {
                                    TextView textView20 = this.f21646b.f21505i1;
                                    if (textView20 != null) {
                                        textView20.setText("");
                                    }
                                }
                            } catch (Exception e19) {
                                TextView textView21 = this.f21646b.f21505i1;
                                if (textView21 != null) {
                                    textView21.setText("");
                                }
                            }
                            TextView textView22 = this.f21646b.f21540p1;
                            if (textView22 != null) {
                                textView22.setSelected(true);
                            }
                            LinearLayout linearLayout3 = this.f21646b.f21565u1;
                            if (linearLayout3 != null) {
                                linearLayout3.setVisibility(0);
                            }
                            try {
                                if (arrayList.get(6) != null) {
                                    TextView textView23 = this.f21646b.f21515k1;
                                    if (textView23 != null) {
                                        textView23.setText(arrayList.get(6));
                                    }
                                } else {
                                    TextView textView24 = this.f21646b.f21515k1;
                                    if (textView24 != null) {
                                        textView24.setText("");
                                    }
                                }
                            } catch (Exception e20) {
                                TextView textView25 = this.f21646b.f21515k1;
                                if (textView25 != null) {
                                    textView25.setText("");
                                }
                            }
                            try {
                                if (arrayList.get(7) != null) {
                                    TextView textView26 = this.f21646b.f21545q1;
                                    if (textView26 != null) {
                                        textView26.setText(arrayList.get(7));
                                    }
                                } else {
                                    TextView textView27 = this.f21646b.f21545q1;
                                    if (textView27 != null) {
                                        textView27.setText("");
                                    }
                                }
                            } catch (Exception e21) {
                                TextView textView28 = this.f21646b.f21545q1;
                                if (textView28 != null) {
                                    textView28.setText("");
                                }
                            }
                            try {
                                if (arrayList.get(8) != null) {
                                    TextView textView29 = this.f21646b.f21520l1;
                                    if (textView29 != null) {
                                        textView29.setText(arrayList.get(8));
                                    }
                                } else {
                                    TextView textView30 = this.f21646b.f21520l1;
                                    if (textView30 != null) {
                                        textView30.setText("");
                                    }
                                }
                            } catch (Exception e22) {
                                TextView textView31 = this.f21646b.f21520l1;
                                if (textView31 != null) {
                                    textView31.setText("");
                                }
                            }
                            TextView textView32 = this.f21646b.f21545q1;
                            if (textView32 != null) {
                                textView32.setSelected(true);
                            }
                            LinearLayout linearLayout4 = this.f21646b.f21570v1;
                            if (linearLayout4 != null) {
                                linearLayout4.setVisibility(0);
                            }
                            try {
                                if (arrayList.get(9) != null) {
                                    TextView textView33 = this.f21646b.f21525m1;
                                    if (textView33 != null) {
                                        textView33.setText(arrayList.get(9));
                                    }
                                } else {
                                    TextView textView34 = this.f21646b.f21525m1;
                                    if (textView34 != null) {
                                        textView34.setText("");
                                    }
                                }
                            } catch (Exception e23) {
                                TextView textView35 = this.f21646b.f21525m1;
                                if (textView35 != null) {
                                    textView35.setText("");
                                }
                            }
                            try {
                                if (arrayList.get(10) != null) {
                                    TextView textView36 = this.f21646b.f21550r1;
                                    if (textView36 != null) {
                                        textView36.setText(arrayList.get(10));
                                    }
                                } else {
                                    TextView textView37 = this.f21646b.f21550r1;
                                    if (textView37 != null) {
                                        textView37.setText("");
                                    }
                                }
                            } catch (Exception e24) {
                                TextView textView38 = this.f21646b.f21550r1;
                                if (textView38 != null) {
                                    textView38.setText("");
                                }
                            }
                            try {
                                if (arrayList.get(11) != null) {
                                    TextView textView39 = this.f21646b.f21530n1;
                                    if (textView39 != null) {
                                        textView39.setText(arrayList.get(11));
                                    }
                                } else {
                                    TextView textView40 = this.f21646b.f21530n1;
                                    if (textView40 != null) {
                                        textView40.setText("");
                                    }
                                }
                            } catch (Exception e25) {
                                TextView textView41 = this.f21646b.f21530n1;
                                if (textView41 != null) {
                                    textView41.setText("");
                                }
                            }
                            TextView textView42 = this.f21646b.f21550r1;
                            if (textView42 != null) {
                                textView42.setSelected(true);
                            }
                            LinearLayout linearLayout5 = this.f21646b.f21575w1;
                            if (linearLayout5 != null) {
                                linearLayout5.setVisibility(0);
                                return;
                            }
                            return;
                        }
                        nSTEXOPlayerSkyActivity = this.f21646b;
                    } else {
                        nSTEXOPlayerSkyActivity = this.f21646b;
                    }
                } else {
                    this.f21646b.f21580x1.setVisibility(0);
                    nSTEXOPlayerSkyActivity = this.f21646b;
                }
                nSTEXOPlayerSkyActivity.f21585y1.setVisibility(8);
                if (hashMap.get("1") != null) {
                }
                this.f21646b.m17758n2();
            } catch (Exception e26) {
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            try {
                this.f21646b.m17692C2();
                LinearLayout linearLayout = this.f21646b.f21555s1;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                LinearLayout linearLayout2 = this.f21646b.f21565u1;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                LinearLayout linearLayout3 = this.f21646b.f21570v1;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                }
                LinearLayout linearLayout4 = this.f21646b.f21575w1;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(8);
                }
                LinearLayout linearLayout5 = this.f21646b.f21580x1;
                if (linearLayout5 != null) {
                    linearLayout5.setVisibility(8);
                }
                LinearLayout linearLayout6 = this.f21646b.f21585y1;
                if (linearLayout6 != null) {
                    linearLayout6.setVisibility(0);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$n.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$n */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$n.class */
    public class DialogInterfaceOnClickListenerC3605n implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final NSTEXOPlayerSkyActivity f21647b;

        public DialogInterfaceOnClickListenerC3605n(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity) {
            this.f21647b = nSTEXOPlayerSkyActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f21647b.f21480d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$o.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$o */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$o.class */
    public class C3606o implements SearchView.InterfaceC0282l {

        /* renamed from: a */
        public final NSTEXOPlayerSkyActivity f21648a;

        public C3606o(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity) {
            this.f21648a = nSTEXOPlayerSkyActivity;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextChange(String str) {
            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity = this.f21648a;
            if (nSTEXOPlayerSkyActivity.f21349B) {
                nSTEXOPlayerSkyActivity.f21349B = false;
                return false;
            }
            nSTEXOPlayerSkyActivity.f21410N0.setVisibility(8);
            C5867t c5867t = this.f21648a.f21434S;
            if (c5867t == null) {
                return false;
            }
            c5867t.getFilter().filter(str);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$p.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$p */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$p.class */
    public class DialogInterfaceOnClickListenerC3607p implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final NSTEXOPlayerSkyActivity f21649b;

        public DialogInterfaceOnClickListenerC3607p(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity) {
            this.f21649b = nSTEXOPlayerSkyActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            this.f21649b.m17711N2();
            C5255e.m26210M(this.f21649b.f21480d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$q.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$q */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$q.class */
    public class DialogInterfaceOnClickListenerC3608q implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final NSTEXOPlayerSkyActivity f21650b;

        public DialogInterfaceOnClickListenerC3608q(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity) {
            this.f21650b = nSTEXOPlayerSkyActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$r.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$r */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$r.class */
    public class RunnableC3609r implements Runnable {

        /* renamed from: b */
        public final LinearLayout f21651b;

        /* renamed from: c */
        public final NSTEXOPlayerSkyActivity f21652c;

        public RunnableC3609r(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity, LinearLayout linearLayout) {
            this.f21652c = nSTEXOPlayerSkyActivity;
            this.f21651b = linearLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            LinearLayout linearLayout;
            this.f21651b.setVisibility(8);
            if (this.f21652c.ll_player_header_footer.getVisibility() != 0 || (linearLayout = this.f21652c.ll_pause_play) == null) {
                return;
            }
            linearLayout.setVisibility(0);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$s.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$s */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$s.class */
    public class ViewOnTouchListenerC3610s implements View.OnTouchListener {

        /* renamed from: b */
        public final NSTEXOPlayerSkyActivity f21653b;

        public ViewOnTouchListenerC3610s(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity) {
            this.f21653b = nSTEXOPlayerSkyActivity;
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return (this.f21653b.f21460X0.getVisibility() == 0 || motionEvent == null || !this.f21653b.f21393J3.onTouchEvent(motionEvent)) ? false : true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$t.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$t */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$t.class */
    public class RunnableC3611t implements Runnable {

        /* renamed from: b */
        public final NSTEXOPlayerSkyActivity f21654b;

        public RunnableC3611t(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity) {
            this.f21654b = nSTEXOPlayerSkyActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21654b.m17763s2();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$u.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$u */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$u.class */
    public class C3612u implements InterfaceC5950f {

        /* renamed from: a */
        public final NSTEXOPlayerSkyActivity f21655a;

        public C3612u(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity) {
            this.f21655a = nSTEXOPlayerSkyActivity;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$v.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$v */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$v.class */
    public class C3613v implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: b */
        public final NSTEXOPlayerSkyActivity f21656b;

        public C3613v(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity) {
            this.f21656b = nSTEXOPlayerSkyActivity;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            TextView textView;
            Resources resources;
            int i11;
            this.f21656b.f21403L3 = i10;
            int i12 = (int) ((this.f21656b.f21403L3 / 255.0f) * 100.0f);
            if (i12 < 20) {
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity = this.f21656b;
                textView = nSTEXOPlayerSkyActivity.tv_brightness;
                resources = nSTEXOPlayerSkyActivity.getResources();
                i11 = 2131231123;
            } else if (i12 < 30) {
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity2 = this.f21656b;
                textView = nSTEXOPlayerSkyActivity2.tv_brightness;
                resources = nSTEXOPlayerSkyActivity2.getResources();
                i11 = 2131231124;
            } else if (i12 < 40) {
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity3 = this.f21656b;
                textView = nSTEXOPlayerSkyActivity3.tv_brightness;
                resources = nSTEXOPlayerSkyActivity3.getResources();
                i11 = 2131231125;
            } else if (i12 < 50) {
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity4 = this.f21656b;
                textView = nSTEXOPlayerSkyActivity4.tv_brightness;
                resources = nSTEXOPlayerSkyActivity4.getResources();
                i11 = 2131231126;
            } else if (i12 < 60) {
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity5 = this.f21656b;
                textView = nSTEXOPlayerSkyActivity5.tv_brightness;
                resources = nSTEXOPlayerSkyActivity5.getResources();
                i11 = 2131231127;
            } else if (i12 < 70) {
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity6 = this.f21656b;
                textView = nSTEXOPlayerSkyActivity6.tv_brightness;
                resources = nSTEXOPlayerSkyActivity6.getResources();
                i11 = 2131231128;
            } else {
                NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity7 = this.f21656b;
                textView = nSTEXOPlayerSkyActivity7.tv_brightness;
                resources = nSTEXOPlayerSkyActivity7.getResources();
                i11 = 2131231129;
            }
            textView.setBackground(resources.getDrawable(i11));
            WindowManager.LayoutParams attributes = this.f21656b.getWindow().getAttributes();
            attributes.screenBrightness = this.f21656b.f21403L3 / 255.0f;
            this.f21656b.f21387I2.m31256O((int) this.f21656b.f21403L3);
            this.f21656b.getWindow().setAttributes(attributes);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            this.f21656b.m17744f3();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            this.f21656b.m17744f3();
            this.f21656b.m17722T1(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$w.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$w */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$w.class */
    public class C3614w implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: b */
        public final NSTEXOPlayerSkyActivity f21657b;

        public C3614w(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity) {
            this.f21657b = nSTEXOPlayerSkyActivity;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            TextView textView;
            Drawable drawable;
            Resources resources;
            if (this.f21657b.f21398K3 != null) {
                try {
                    this.f21657b.f21398K3.setStreamVolume(3, i10, 0);
                    int streamVolume = (int) ((this.f21657b.f21398K3.getStreamVolume(3) / this.f21657b.f21413N3) * 100.0f);
                    if (streamVolume == 0 || streamVolume < 0) {
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity = this.f21657b;
                        textView = nSTEXOPlayerSkyActivity.tv_volume;
                        drawable = nSTEXOPlayerSkyActivity.getResources().getDrawable(2131231157);
                    } else if (streamVolume < 40) {
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity2 = this.f21657b;
                        textView = nSTEXOPlayerSkyActivity2.tv_volume;
                        drawable = nSTEXOPlayerSkyActivity2.getResources().getDrawable(2131231154);
                    } else if (streamVolume < 80) {
                        NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity3 = this.f21657b;
                        textView = nSTEXOPlayerSkyActivity3.tv_volume;
                        drawable = nSTEXOPlayerSkyActivity3.getResources().getDrawable(2131231155);
                    } else {
                        if (streamVolume < 100) {
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity4 = this.f21657b;
                            textView = nSTEXOPlayerSkyActivity4.tv_volume;
                            resources = nSTEXOPlayerSkyActivity4.getResources();
                        } else {
                            NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity5 = this.f21657b;
                            textView = nSTEXOPlayerSkyActivity5.tv_volume;
                            resources = nSTEXOPlayerSkyActivity5.getResources();
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
            this.f21657b.m17744f3();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            this.f21657b.m17744f3();
            this.f21657b.m17722T1(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$x.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$x */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$x.class */
    public class ViewOnClickListenerC3615x implements View.OnClickListener {

        /* renamed from: b */
        public final NSTEXOPlayerSkyActivity f21658b;

        public ViewOnClickListenerC3615x(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity) {
            this.f21658b = nSTEXOPlayerSkyActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f21658b.m17740d2(true);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$y.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$y */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$y.class */
    public class ViewOnClickListenerC3616y implements View.OnClickListener {

        /* renamed from: b */
        public final NSTEXOPlayerSkyActivity f21659b;

        public ViewOnClickListenerC3616y(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity) {
            this.f21659b = nSTEXOPlayerSkyActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f21659b.f21480d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$z.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity$z */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyActivity$z.class */
    public class ViewOnClickListenerC3617z implements View.OnClickListener {

        /* renamed from: b */
        public final NSTEXOPlayerSkyActivity f21660b;

        public ViewOnClickListenerC3617z(NSTEXOPlayerSkyActivity nSTEXOPlayerSkyActivity) {
            this.f21660b = nSTEXOPlayerSkyActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f21660b.onBackPressed();
        }
    }

    public NSTEXOPlayerSkyActivity() {
        Boolean bool = Boolean.FALSE;
        this.f21456W1 = bool;
        this.f21461X1 = bool;
        this.f21475b2 = "";
        this.f21501h2 = "";
        this.f21506i2 = bool;
        this.f21516k2 = "";
        Boolean bool2 = Boolean.TRUE;
        this.f21521l2 = bool2;
        this.f21526m2 = null;
        this.f21536o2 = -1;
        this.f21541p2 = 0;
        this.f21546q2 = "";
        this.f21551r2 = bool2;
        this.f21556s2 = null;
        this.f21561t2 = null;
        this.f21566u2 = null;
        this.f21571v2 = false;
        this.f21576w2 = 0;
        this.f21581x2 = false;
        this.f21586y2 = 4;
        this.f21591z2 = f21342c4[0];
        this.f21357C2 = bool;
        this.f21362D2 = bool;
        this.f21367E2 = bool;
        this.f21372F2 = bool;
        this.f21377G2 = bool;
        this.f21382H2 = bool;
        this.f21427Q2 = 0;
        this.f21432R2 = "0";
        this.f21437S2 = "0";
        this.f21442T2 = bool2;
        this.f21483d3 = "mobile";
        this.f21502h3 = "0";
        this.f21507i3 = "0";
        this.f21512j3 = 0;
        this.f21527m3 = false;
        this.f21532n3 = false;
        this.f21547q3 = "";
        this.f21552r3 = "";
        this.f21557s3 = "";
        this.f21562t3 = false;
        this.f21567u3 = "false";
        this.f21577w3 = C5251a.f30033c0;
        this.f21587y3 = "-10";
        this.f21592z3 = null;
        this.f21373F3 = 0;
        this.f21378G3 = 5;
        this.f21383H3 = false;
        this.f21388I3 = false;
        this.f21403L3 = -1.0f;
        this.f21448U3 = new C3597j(this);
        this.f21453V3 = new C3613v(this);
        this.f21458W3 = new C3614w(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A2 */
    public /* synthetic */ void m17623A2(DialogInterface dialogInterface) {
        this.f21438S3 = false;
    }

    /* renamed from: Z1 */
    public static boolean m17653Z1() {
        ProgressBar progressBar = f21343d4;
        return progressBar != null && progressBar.getVisibility() == 0;
    }

    /* renamed from: a2 */
    public static long m17655a2(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: e2 */
    public static String m17660e2(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    /* renamed from: B2 */
    public void m17691B2(String str, String str2) {
        this.f21437S2 = str;
        m17710N1();
    }

    /* renamed from: C2 */
    public final void m17692C2() {
        ProgressBar progressBar = this.f21573w;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
        TextView textView = this.f21548r;
        if (textView != null) {
            textView.setText(this.f21480d.getResources().getString(2132018251));
        }
        TextView textView2 = this.f21553s;
        if (textView2 != null) {
            textView2.setText("");
        }
        TextView textView3 = this.f21558t;
        if (textView3 != null) {
            textView3.setText(this.f21480d.getResources().getString(2132018185));
        }
        TextView textView4 = this.f21563u;
        if (textView4 != null) {
            textView4.setText("");
        }
    }

    /* renamed from: D2 */
    public void m17693D2() {
        if (this.f21491f2 == null) {
            return;
        }
        m17722T1(0);
        int i10 = Build.VERSION.SDK_INT;
        Rational rational = new Rational(this.f21491f2.getWidth(), this.f21491f2.getHeight());
        if (i10 >= 26) {
            try {
                m17740d2(false);
                this.f21537o3.setAspectRatio(rational).build();
                enterPictureInPictureMode(this.f21537o3.build());
            } catch (Exception e10) {
                try {
                    m17740d2(false);
                    this.f21537o3.setAspectRatio(new Rational(547, HttpStatus.SC_TEMPORARY_REDIRECT)).build();
                    enterPictureInPictureMode(this.f21537o3.build());
                } catch (Exception e11) {
                }
            }
        }
    }

    /* renamed from: E2 */
    public final void m17694E2() {
        int currentWindowIndex = this.f21491f2.getCurrentWindowIndex();
        if (currentWindowIndex == this.f21584y0.size() - 1) {
            this.f21491f2.setCurrentWindowIndex(0);
        } else {
            this.f21491f2.setCurrentWindowIndex(currentWindowIndex + 1);
        }
    }

    /* renamed from: F2 */
    public void m17695F2() {
        m17766v2();
        int i10 = 0;
        this.f21571v2 = false;
        this.f21576w2 = 0;
        AsyncTask asyncTask = this.f21561t2;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            ArrayList<LiveStreamCategoryIdDBModel> arrayList = this.f21539p0;
            if (arrayList != null && arrayList.size() > 0) {
                if (this.f21509j0 != this.f21539p0.size() - 1) {
                    i10 = this.f21509j0 + 1;
                }
                this.f21509j0 = i10;
                if (this.f21509j0 != 0 || this.f21564u0 == null) {
                    ArrayList<LiveStreamCategoryIdDBModel> arrayList2 = this.f21539p0;
                    if (arrayList2 == null || arrayList2.size() <= 0 || this.f21509j0 >= this.f21539p0.size()) {
                        return;
                    }
                    String m14787b = this.f21539p0.get(this.f21509j0).m14787b();
                    String m14788c = this.f21539p0.get(this.f21509j0).m14788c();
                    this.f21481d1 = m14787b;
                    this.f21485e1 = m14788c;
                    if (m14787b != null && !m14787b.equals("") && this.f21481d1.equals("-1")) {
                        m17714P1();
                        return;
                    }
                    String str = this.f21481d1;
                    if (str == null || str.equals("") || !this.f21481d1.equals("-6")) {
                        m17706L1();
                        return;
                    } else {
                        m17716Q1();
                        return;
                    }
                }
                this.f21481d1 = "0";
                this.f21485e1 = this.f21480d.getResources().getString(2132017297);
            }
            m17702J1();
        }
    }

    /* renamed from: G1 */
    public final void m17696G1(String str, int i10, String str2, String str3, String str4) {
        if (this.f21480d == null || this.f21434S == null || this.f21356C1 == null) {
            return;
        }
        FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
        favouriteDBModel.m14767h(str);
        favouriteDBModel.m14772m(i10);
        favouriteDBModel.m14771l(str3);
        favouriteDBModel.m14770k(str2);
        favouriteDBModel.m14774o(SharepreferenceDBHandler.m15337A(this.f21480d));
        this.f21356C1.m15111l(favouriteDBModel, str4);
        this.f21434S.notifyDataSetChanged();
        C5255e.m26241k0(this.f21480d, str2 + this.f21480d.getResources().getString(2132017271));
    }

    /* renamed from: G2 */
    public void m17697G2() {
        LinearLayout linearLayout = this.ll_no_cat_found;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.ll_pb_left_categories;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    /* renamed from: H1 */
    public final void m17698H1(String str, String str2, String str3) {
        if (this.f21480d == null || this.f21434S == null || this.f21424Q == null) {
            return;
        }
        FavouriteM3UModel favouriteM3UModel = new FavouriteM3UModel();
        favouriteM3UModel.m14782h(str2);
        favouriteM3UModel.m14783i(SharepreferenceDBHandler.m15337A(this.f21480d));
        favouriteM3UModel.m14781g(str3);
        favouriteM3UModel.m14779e(str);
        this.f21424Q.m15156D0(favouriteM3UModel);
        this.f21434S.notifyDataSetChanged();
        C5255e.m26241k0(this.f21480d, str3 + this.f21480d.getResources().getString(2132017271));
    }

    /* renamed from: H2 */
    public void m17699H2() {
        C5251a.f30008G = Boolean.TRUE;
        this.f21359D = true;
        this.f21533o.setVisibility(0);
        this.f21538p.setText(this.f21480d.getResources().getString(2132018196));
        this.f21585y1.setVisibility(8);
        if (C5251a.f30048k.booleanValue()) {
            findViewById(2131429693).setVisibility(8);
        }
    }

    /* renamed from: I1 */
    public final void m17700I1(Configuration configuration) {
        PlayerView playerView;
        boolean z10;
        View decorView = getWindow().getDecorView();
        if (configuration.orientation == 2) {
            decorView.setSystemUiVisibility(5894);
            playerView = this.f21491f2;
            z10 = false;
        } else {
            decorView.setSystemUiVisibility(256);
            playerView = this.f21491f2;
            z10 = true;
        }
        playerView.setAdjustViewBounds(z10);
    }

    /* renamed from: I2 */
    public final void m17701I2() {
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

    /* renamed from: J1 */
    public void m17702J1() {
        m17732Y1();
        this.f21556s2 = new AsyncTaskC3592g0(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels");
    }

    /* renamed from: J2 */
    public final void m17703J2() {
        C7562b2 c7562b2;
        try {
            if (!this.f21521l2.booleanValue() || (c7562b2 = this.f21348A3) == null) {
                return;
            }
            c7562b2.m32649a0();
        } catch (Exception e10) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x014d, code lost:
    
        if (r6.f21564u0.get(r7).m14816W().equals(r18) != false) goto L41;
     */
    /* renamed from: K1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m17704K1() {
        /*
            Method dump skipped, instructions count: 920
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity.m17704K1():java.lang.String");
    }

    /* renamed from: K2 */
    public final void m17705K2() {
        C7562b2 c7562b2;
        try {
            if (!this.f21521l2.booleanValue() || (c7562b2 = this.f21348A3) == null) {
                return;
            }
            c7562b2.m32650b0();
        } catch (Exception e10) {
        }
    }

    /* renamed from: L1 */
    public void m17706L1() {
        m17732Y1();
        this.f21556s2 = new AsyncTaskC3592g0(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels_with_cat");
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: L2 */
    public final void m17707L2(ArrayList<LiveStreamsDBModel> arrayList) {
        C7920a m34301l;
        String valueOf;
        String str;
        String str2;
        String str3;
        if (arrayList == null || arrayList.size() <= 0 || this.f21431R1 >= arrayList.size()) {
            return;
        }
        int m26215R = C5255e.m26215R(arrayList.get(this.f21431R1).m14805L());
        this.f21427Q2 = m26215R;
        if (!arrayList.get(this.f21431R1).m14827g().equals("")) {
            this.f21432R2 = arrayList.get(this.f21431R1).m14827g();
        }
        int i10 = this.f21431R1;
        this.f21576w2 = i10;
        String name = arrayList.get(i10).getName();
        int m26214Q = C5255e.m26214Q(arrayList.get(this.f21431R1).m14811R());
        String m14798E = arrayList.get(this.f21431R1).m14798E();
        String m14810Q = arrayList.get(this.f21431R1).m14810Q();
        arrayList.get(this.f21431R1).m14805L();
        this.f21482d2 = arrayList.get(this.f21431R1).m14816W();
        String m26247n0 = C5255e.m26247n0(C7711g.m33686a() + C7711g.m33687i());
        try {
            if (m14810Q.equals("") || m14810Q.isEmpty()) {
                this.f21543q.setImageDrawable(this.f21480d.getResources().getDrawable(2131231571));
            } else {
                C10014t.m42105q(this.f21480d).m42116l(m14810Q).m42154j(2131231571).m42148d(2131231571).m42151g(this.f21543q);
            }
        } catch (Exception e10) {
            this.f21543q.setImageDrawable(this.f21480d.getResources().getDrawable(2131231571));
        }
        this.f21491f2.setCurrentWindowIndex(this.f21431R1);
        SharedPreferences.Editor editor = this.f21361D1;
        if (editor != null) {
            editor.putString("currentlyPlayingVideo", String.valueOf(arrayList.get(this.f21431R1).m14811R()));
            this.f21361D1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(arrayList.get(this.f21431R1).m14816W()));
            this.f21361D1.apply();
        }
        SharedPreferences.Editor editor2 = this.f21366E1;
        if (editor2 != null) {
            editor2.putInt("currentlyPlayingVideoPosition", this.f21431R1);
            this.f21366E1.apply();
        }
        SimpleDateFormat simpleDateFormat = this.f21486e2;
        if (m17655a2(simpleDateFormat, simpleDateFormat.format(new Date(C7709e.m33680a(this.f21480d))), this.f21472a2.format(this.f21496g2)) >= C7707c.m33667p() && (str2 = this.f21560t1) != null && this.f21510j1 != null && (!f21340a4.equals(str2) || (this.f21560t1 != null && (str3 = this.f21510j1) != null && !f21341b4.equals(str3)))) {
            this.f21521l2 = Boolean.FALSE;
            this.f21491f2.setVisibility(8);
            this.f21533o.setVisibility(0);
            this.f21538p.setText(m26247n0 + this.f21513k + this.f21376G1);
        }
        this.f21346A1 = m26214Q;
        this.f21590z1 = m14798E;
        this.f21351B1 = this.f21482d2;
        if (this.f21478c2.equals("m3u")) {
            m34301l = C7920a.m34301l();
            valueOf = this.f21351B1;
        } else {
            m34301l = C7920a.m34301l();
            valueOf = String.valueOf(this.f21346A1);
        }
        m34301l.m34317z(valueOf);
        this.f21491f2.setTitle(m26215R + " - " + name);
        this.f21552r3 = m26215R + " - " + name;
        this.f21491f2.m12488B();
        if (!f21339Z3) {
            if (this.f21491f2.getFullScreenValue().booleanValue()) {
                f21339Z3 = this.f21491f2.getFullScreenValue().booleanValue();
            } else {
                f21339Z3 = false;
            }
        }
        if (this.f21521l2.booleanValue()) {
            if (this.f21478c2.equals("m3u")) {
                this.f21368E3 = Uri.parse(this.f21482d2);
                this.f21491f2.m12507t(Boolean.valueOf(f21339Z3));
                str = this.f21482d2;
            } else {
                this.f21368E3 = Uri.parse(this.f21484e + m26214Q + this.f21499h0);
                this.f21491f2.m12507t(Boolean.valueOf(f21339Z3));
                str = this.f21484e + m26214Q + ".m3u8";
            }
            this.f21547q3 = String.valueOf(Uri.parse(str));
            m17768x2();
            this.f21373F3 = 0;
            this.f21383H3 = false;
        }
        this.f21401L1.removeCallbacksAndMessages(null);
        this.f21374G = m14798E;
        this.f21379H = m14810Q;
        this.f21557s3 = m14810Q;
        this.f21491f2.setCurrentEpgChannelID(m14798E);
        this.f21491f2.setCurrentChannelLogo(this.f21379H);
        m17754k3(this.f21379H);
        this.f21566u2 = new AsyncTaskC3604m0(this, this.f21374G, null).execute(new String[0]);
        ListView listView = this.f21389J;
        if (listView != null) {
            listView.requestFocus();
        }
        this.f21456W1 = Boolean.TRUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x015c, code lost:
    
        if (r6.f21564u0.get(r7).m14816W().equals(r18) != false) goto L41;
     */
    /* renamed from: M1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m17708M1() {
        /*
            Method dump skipped, instructions count: 935
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity.m17708M1():java.lang.String");
    }

    /* renamed from: M2 */
    public final void m17709M2() {
        int currentWindowIndex = this.f21491f2.getCurrentWindowIndex();
        if (currentWindowIndex == 0) {
            this.f21491f2.setCurrentWindowIndex(this.f21584y0.size() - 1);
        } else {
            this.f21491f2.setCurrentWindowIndex(currentWindowIndex - 1);
        }
    }

    /* renamed from: N1 */
    public void m17710N1() {
        m17732Y1();
        this.f21556s2 = new AsyncTaskC3594h0(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels_with_cat");
    }

    /* renamed from: N2 */
    public void m17711N2() {
        try {
            C7562b2 c7562b2 = this.f21348A3;
            if (c7562b2 != null) {
                c7562b2.m32448g1();
                this.f21348A3 = null;
                this.f21358C3 = null;
            }
        } catch (Exception e10) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x014a, code lost:
    
        if (r6.f21574w0.get(r7).m14816W().equals(r18) != false) goto L39;
     */
    /* renamed from: O1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m17712O1() {
        /*
            Method dump skipped, instructions count: 925
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity.m17712O1():java.lang.String");
    }

    /* renamed from: O2 */
    public final void m17713O2(String str, int i10, String str2, String str3) {
        DatabaseHandler databaseHandler;
        Context context = this.f21480d;
        if (context == null || this.f21434S == null || (databaseHandler = this.f21356C1) == null) {
            return;
        }
        databaseHandler.m15115t(i10, str, str3, str2, SharepreferenceDBHandler.m15337A(context));
        this.f21434S.notifyDataSetChanged();
        C5255e.m26241k0(this.f21480d, str2 + this.f21480d.getResources().getString(2132018465));
    }

    /* renamed from: P1 */
    public void m17714P1() {
        m17732Y1();
        this.f21556s2 = new AsyncTaskC3592g0(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_fav");
    }

    /* renamed from: P2 */
    public final void m17715P2(String str, String str2) {
        LiveStreamDBHandler liveStreamDBHandler;
        Context context = this.f21480d;
        if (context == null || this.f21434S == null || (liveStreamDBHandler = this.f21424Q) == null) {
            return;
        }
        liveStreamDBHandler.m15188R0(str, SharepreferenceDBHandler.m15337A(context));
        this.f21434S.notifyDataSetChanged();
        C5255e.m26241k0(this.f21480d, str2 + this.f21480d.getResources().getString(2132018465));
    }

    /* renamed from: Q1 */
    public void m17716Q1() {
        m17732Y1();
        this.f21556s2 = new AsyncTaskC3592g0(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "recently_watched");
    }

    @SuppressLint({"NewApi"})
    /* renamed from: Q2 */
    public void m17717Q2(ArrayList<LiveStreamsDBModel> arrayList) {
        LiveStreamDBHandler liveStreamDBHandler;
        String str;
        String str2;
        try {
            if (arrayList == null) {
                this.f21399L = new ArrayList<>();
                C5867t c5867t = new C5867t(this, this.f21399L);
                this.f21434S = c5867t;
                ListView listView = this.f21389J;
                if (listView != null) {
                    listView.setAdapter((ListAdapter) c5867t);
                    return;
                }
                return;
            }
            this.f21354C = false;
            this.f21410N0.setVisibility(8);
            if (arrayList.size() == 0) {
                if (this.f21571v2) {
                    TextView textView = this.f21410N0;
                    if (textView != null) {
                        this.f21354C = true;
                        textView.setFocusable(true);
                        this.f21410N0.requestFocus();
                        this.f21410N0.setVisibility(0);
                    }
                } else {
                    this.f21571v2 = true;
                    ArrayList<LiveStreamsDBModel> arrayList2 = this.f21564u0;
                    if (arrayList2 != null && this.f21554s0 != null) {
                        arrayList2.clear();
                        this.f21554s0.clear();
                    }
                    if (this.f21567u3.equals("true")) {
                        liveStreamDBHandler = this.f21424Q;
                        str = this.f21481d1;
                        str2 = "radio_streams";
                    } else {
                        liveStreamDBHandler = this.f21424Q;
                        str = this.f21481d1;
                        str2 = "live";
                    }
                    this.f21564u0 = liveStreamDBHandler.m15217f1(str, str2);
                    ArrayList<LiveStreamsDBModel> arrayList3 = this.f21564u0;
                    if (arrayList3 == null || arrayList3.size() <= 0) {
                        TextView textView2 = this.f21410N0;
                        if (textView2 != null) {
                            this.f21354C = true;
                            textView2.setFocusable(true);
                            this.f21410N0.requestFocus();
                            this.f21410N0.setVisibility(0);
                        }
                    } else {
                        m17717Q2(this.f21564u0);
                    }
                }
            }
            Log.e("honey", "if part");
            C5867t c5867t2 = new C5867t(this, arrayList);
            this.f21434S = c5867t2;
            c5867t2.m28616f(this.f21410N0);
            ListView listView2 = this.f21389J;
            if (listView2 != null) {
                listView2.setAdapter((ListAdapter) this.f21434S);
                int i10 = this.f21576w2;
                if (i10 != 0) {
                    this.f21389J.setSelection(i10);
                }
                if (this.f21442T2.booleanValue()) {
                    this.f21389J.requestFocus();
                    this.f21442T2 = Boolean.FALSE;
                }
                this.f21389J.setOnItemSelectedListener(new C3579a(this));
                this.f21389J.setOnItemClickListener(new C3581b(this, arrayList));
                this.f21389J.setOnItemLongClickListener(new C3583c(this));
            }
        } catch (Exception e10) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0147, code lost:
    
        if (r6.f21564u0.get(r7).m14816W().equals(r18) != false) goto L42;
     */
    /* renamed from: R1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m17718R1() {
        /*
            Method dump skipped, instructions count: 922
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity.m17718R1():java.lang.String");
    }

    @SuppressLint({"NewApi"})
    /* renamed from: R2 */
    public void m17719R2(ArrayList<LiveStreamsDBModel> arrayList) {
        if (arrayList != null) {
            try {
                if (arrayList.size() > 0) {
                    ListView listView = this.f21394K;
                    if (listView != null) {
                        listView.setVisibility(0);
                    }
                    this.f21354C = false;
                    C5865r c5865r = new C5865r(this, arrayList);
                    this.f21492f3 = c5865r;
                    ListView listView2 = this.f21394K;
                    if (listView2 != null) {
                        listView2.setAdapter((ListAdapter) c5865r);
                        this.f21394K.setSelection(this.f21512j3);
                        this.f21394K.setOnItemClickListener(new C3586d0(this, arrayList));
                        return;
                    }
                    return;
                }
            } catch (Exception e10) {
                return;
            }
        }
        LinearLayout linearLayout = this.f21415O0;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        ListView listView3 = this.f21394K;
        if (listView3 != null) {
            listView3.setVisibility(8);
        }
    }

    /* renamed from: S1 */
    public final void m17720S1(int i10) {
        if (PlayerView.f14189B0) {
            return;
        }
        RunnableC3593h runnableC3593h = new RunnableC3593h(this);
        this.f21433R3 = runnableC3593h;
        this.f21428Q3.postDelayed(runnableC3593h, i10);
    }

    /* renamed from: S2 */
    public void m17721S2(String str) {
        TextView textView = this.tv_channel_name;
        if (textView != null) {
            textView.setText(str);
            this.tv_channel_name.setSelected(true);
        }
    }

    /* renamed from: T1 */
    public void m17722T1(int i10) {
        if (PlayerView.f14189B0) {
            return;
        }
        RunnableC3591g runnableC3591g = new RunnableC3591g(this);
        this.f21433R3 = runnableC3591g;
        this.f21428Q3.postDelayed(runnableC3591g, i10);
    }

    /* renamed from: T2 */
    public final void m17723T2() {
        this.f21397K2 = new C3599k(this);
    }

    /* renamed from: U1 */
    public void m17724U1(int i10) {
        RunnableC3611t runnableC3611t = new RunnableC3611t(this);
        this.f21423P3 = runnableC3611t;
        this.f21418O3.postDelayed(runnableC3611t, i10);
    }

    /* renamed from: U2 */
    public final void m17725U2() {
        String str;
        String str2;
        RecyclerView recyclerView;
        this.ll_player_header_footer.startAnimation(this.f21473a3);
        this.ll_player_header_footer.setVisibility(8);
        this.rl_episodes_box.startAnimation(this.f21517k3);
        this.rl_episodes_box.setVisibility(0);
        this.ll_pb_left_categories.setVisibility(0);
        this.recycler_view_left_sidebar.setVisibility(8);
        this.f21394K.setVisibility(8);
        if (this.f21487e3 != null && (recyclerView = this.recycler_view_left_sidebar) != null) {
            recyclerView.setAdapter(null);
        }
        String str3 = this.f21587y3;
        if ((str3 != null && str3.equals("-1")) || (((str = this.f21587y3) != null && str.equals("0")) || ((str2 = this.f21587y3) != null && str2.equals("-6")))) {
            String str4 = this.f21587y3;
            this.f21432R2 = str4;
            this.f21437S2 = str4;
        }
        this.f21487e3 = new C5864q(this.f21480d, this.f21432R2, "player", this.f21567u3);
        this.f21437S2 = this.f21432R2;
        this.recycler_view_left_sidebar.setVisibility(0);
        m17710N1();
        this.recycler_view_left_sidebar.setAdapter(this.f21487e3);
        this.recycler_view_left_sidebar.setLayoutManager(this.f21497g3);
    }

    /* renamed from: V1 */
    public void m17726V1() {
        m17766v2();
        this.f21571v2 = false;
        this.f21576w2 = 0;
        AsyncTask asyncTask = this.f21561t2;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            ArrayList<LiveStreamCategoryIdDBModel> arrayList = this.f21539p0;
            if (arrayList != null && arrayList.size() > 0) {
                int i10 = this.f21509j0;
                if (i10 == 0) {
                    i10 = this.f21539p0.size();
                }
                this.f21509j0 = i10 - 1;
                if (this.f21509j0 != 0 || this.f21564u0 == null) {
                    ArrayList<LiveStreamCategoryIdDBModel> arrayList2 = this.f21539p0;
                    if (arrayList2 == null || arrayList2.size() <= 0 || this.f21509j0 >= this.f21539p0.size()) {
                        return;
                    }
                    String m14787b = this.f21539p0.get(this.f21509j0).m14787b();
                    String m14788c = this.f21539p0.get(this.f21509j0).m14788c();
                    this.f21481d1 = m14787b;
                    this.f21485e1 = m14788c;
                    if (m14787b != null && !m14787b.equals("") && this.f21481d1.equals("-1")) {
                        m17714P1();
                        return;
                    }
                    String str = this.f21481d1;
                    if (str == null || str.equals("") || !this.f21481d1.equals("-6")) {
                        m17706L1();
                        return;
                    } else {
                        m17716Q1();
                        return;
                    }
                }
                if (this.f21481d1.equals("0")) {
                    return;
                }
                this.f21481d1 = "0";
                this.f21485e1 = this.f21480d.getResources().getString(2132017297);
            }
            m17702J1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ba  */
    @android.annotation.SuppressLint({"SetTextI18n"})
    /* renamed from: V2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> m17727V2(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 1425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity.m17727V2(java.lang.String):java.util.HashMap");
    }

    /* renamed from: W1 */
    public String m17728W1(String str) {
        ArrayList<LiveStreamCategoryIdDBModel> arrayList = this.f21539p0;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<LiveStreamCategoryIdDBModel> it = this.f21539p0.iterator();
            while (it.hasNext()) {
                LiveStreamCategoryIdDBModel next = it.next();
                if (next.m14787b() != null && !next.m14787b().isEmpty() && next.m14787b().equalsIgnoreCase(str)) {
                    this.f21485e1 = next.m14788c();
                }
            }
        }
        return this.f21485e1;
    }

    /* renamed from: W2 */
    public void m17729W2() {
        if (PlayerView.f14189B0 || this.ll_player_header_footer.getVisibility() != 8) {
            return;
        }
        this.ll_player_header_footer.startAnimation(this.f21470Z2);
        this.ll_player_header_footer.setVisibility(0);
    }

    /* renamed from: X1 */
    public void m17730X1(int i10, String str, String str2) {
        RecyclerView recyclerView = this.recycler_view_left_sidebar;
        if (recyclerView != null) {
            recyclerView.mo2557n1(i10);
        }
    }

    /* renamed from: X2 */
    public void m17731X2() {
        if (PlayerView.f14189B0 || this.ll_player_header_footer.getVisibility() != 8) {
            return;
        }
        this.ll_player_header_footer.startAnimation(this.f21470Z2);
        this.ll_player_header_footer.setVisibility(0);
        if (this.ll_brightness.getVisibility() == 8) {
            this.ll_brightness.startAnimation(this.f21470Z2);
            this.ll_brightness.setVisibility(0);
        }
        if (this.tv_seek_left.getVisibility() == 8) {
            this.tv_seek_left.startAnimation(this.f21470Z2);
            this.tv_seek_left.setVisibility(0);
        }
        if (this.ll_pause_play.getVisibility() == 8) {
            this.ll_pause_play.startAnimation(this.f21470Z2);
            this.ll_pause_play.setVisibility(0);
        }
        if (this.tv_seek_right.getVisibility() == 8) {
            this.tv_seek_right.startAnimation(this.f21470Z2);
            this.tv_seek_right.setVisibility(0);
        }
        if (this.ll_volume.getVisibility() == 8) {
            this.ll_volume.startAnimation(this.f21470Z2);
            this.ll_volume.setVisibility(0);
        }
    }

    /* renamed from: Y1 */
    public final void m17732Y1() {
        AsyncTask asyncTask = this.f21556s2;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            SharepreferenceDBHandler.m15348L(0, this.f21480d);
        } else {
            SharepreferenceDBHandler.m15348L(1, this.f21480d);
            this.f21556s2.cancel(true);
        }
    }

    /* renamed from: Y2 */
    public void m17733Y2() {
        ProgressBar progressBar;
        if (!PlayerView.f14189B0 && f21339Z3 && this.ll_player_header_footer.getVisibility() == 8) {
            Handler handler = this.f21401L1;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            m17754k3(this.f21379H);
            this.f21566u2 = new AsyncTaskC3604m0(this, this.f21374G, null).execute(new String[0]);
            this.ll_player_header_footer.startAnimation(this.f21470Z2);
            this.ll_player_header_footer.setVisibility(0);
            if (this.ll_brightness.getVisibility() == 8) {
                this.ll_brightness.startAnimation(this.f21470Z2);
                this.ll_brightness.setVisibility(0);
            }
            if (this.tv_seek_left.getVisibility() == 8) {
                this.tv_seek_left.startAnimation(this.f21470Z2);
                this.tv_seek_left.setVisibility(0);
            }
            if (this.ll_pause_play.getVisibility() == 8 && (progressBar = f21343d4) != null && progressBar.getVisibility() != 0) {
                this.ll_pause_play.startAnimation(this.f21470Z2);
                this.ll_pause_play.setVisibility(0);
            }
            if (this.tv_seek_right.getVisibility() == 8) {
                this.tv_seek_right.startAnimation(this.f21470Z2);
                this.tv_seek_right.setVisibility(0);
            }
            if (this.ll_volume.getVisibility() == 8) {
                this.ll_volume.startAnimation(this.f21470Z2);
                this.ll_volume.setVisibility(0);
            }
        }
    }

    /* renamed from: Z2 */
    public final void m17734Z2() {
        LinearLayout linearLayout = this.f21583y;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
    }

    /* renamed from: a3 */
    public final void m17735a3() {
        ProgressBar progressBar = this.f21578x;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    /* renamed from: b2 */
    public void m17736b2() {
        runOnUiThread(new RunnableC3584c0(this));
    }

    /* renamed from: b3 */
    public void m17737b3() {
        if (this.ll_player_header_footer.getVisibility() == 8) {
            this.ll_screen_locked.startAnimation(this.f21447U2);
            this.ll_screen_locked.setVisibility(0);
        }
    }

    /* renamed from: c2 */
    public final void m17738c2() {
        ImageView imageView = this.iv_play;
        imageView.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3596i0(this, imageView));
        ImageView imageView2 = this.iv_pause;
        imageView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3596i0(this, imageView2));
        ImageView imageView3 = this.iv_back;
        imageView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3596i0(this, imageView3));
        ImageView imageView4 = this.iv_audio_subtitle_track;
        imageView4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3596i0(this, imageView4));
        ImageView imageView5 = this.iv_hp_play_from_beginning;
        imageView5.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3596i0(this, imageView5));
        LinearLayout linearLayout = this.ll_channels_list;
        linearLayout.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3596i0(this, linearLayout));
        LinearLayout linearLayout2 = this.ll_crop;
        linearLayout2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3596i0(this, linearLayout2));
        LinearLayout linearLayout3 = this.ll_multi_screen;
        linearLayout3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3596i0(this, linearLayout3));
        ImageView imageView6 = this.iv_back_episodes;
        imageView6.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3596i0(this, imageView6));
        ImageView imageView7 = this.iv_back_settings;
        imageView7.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3596i0(this, imageView7));
        ImageView imageView8 = this.iv_hp_lock;
        imageView8.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3596i0(this, imageView8));
        ImageView imageView9 = this.iv_hp_lock;
        imageView9.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3596i0(this, imageView9));
    }

    /* renamed from: c3 */
    public final void m17739c3(Activity activity) {
        new DialogC3601l(this, (NSTEXOPlayerSkyActivity) activity, activity).show();
    }

    /* renamed from: d2 */
    public void m17740d2(boolean z10) {
        f21339Z3 = z10;
        String m15383k = SharepreferenceDBHandler.m15383k(this.f21480d);
        if (!SharepreferenceDBHandler.m15385l(this.f21480d).equals("default_native") && !new ExternalPlayerDataBase(this.f21480d).m15130f(m15383k)) {
            SharepreferenceDBHandler.m15356T("default_native", CookieSpecs.DEFAULT, this.f21480d);
        }
        String m15385l = SharepreferenceDBHandler.m15385l(this.f21480d);
        if (!z10 || m15385l == null || m15385l.equalsIgnoreCase("default_native")) {
            PlayerView playerView = this.f21491f2;
            if (playerView != null) {
                playerView.m12507t(Boolean.valueOf(f21339Z3));
            }
            if (C5251a.f30008G.booleanValue()) {
                Toolbar toolbar = this.f21400L0;
                if (toolbar != null) {
                    toolbar.setVisibility(8);
                }
                findViewById(2131427469).setOnClickListener(null);
                this.f21460X0.setVisibility(8);
                this.f21464Y0.setVisibility(8);
                this.f21468Z0.setVisibility(8);
                this.f21471a1.setVisibility(8);
                this.f21474b1.setVisibility(8);
                getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f21477c1.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                this.f21477c1.setLayoutParams(layoutParams);
                getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
                this.f21450V0.setVisibility(8);
                C7562b2 c7562b2 = this.f21348A3;
                ((c7562b2 == null || !c7562b2.isPlaying()) ? this.f21488f : this.f21493g).requestFocus();
                return;
            }
            return;
        }
        m17711N2();
        this.f21581x2 = true;
        SharedPreferences sharedPreferences = getSharedPreferences("currentlyPlayingVideoPosition", 0);
        this.f21459X = sharedPreferences;
        int i10 = sharedPreferences.getInt("currentlyPlayingVideoPosition", 0);
        ArrayList<LiveStreamsDBModel> m28615e = this.f21434S.m28615e();
        this.f21431R1 = i10;
        if (m28615e == null || m28615e.size() <= 0 || this.f21431R1 >= m28615e.size()) {
            ArrayList<LiveStreamsDBModel> arrayList = this.f21564u0;
            if (arrayList != null && arrayList.size() > 0 && this.f21431R1 < this.f21564u0.size()) {
                this.f21536o2 = C5255e.m26215R(this.f21564u0.get(this.f21431R1).m14811R());
                this.f21482d2 = this.f21564u0.get(this.f21431R1).m14816W();
                this.f21564u0.get(this.f21431R1).getName();
            }
        } else {
            this.f21536o2 = C5255e.m26215R(m28615e.get(this.f21431R1).m14811R());
            this.f21482d2 = m28615e.get(this.f21431R1).m14816W();
        }
        this.f21364E = this.f21536o2;
        this.f21369F = this.f21482d2;
        f21339Z3 = false;
        PlayerView playerView2 = this.f21491f2;
        if (playerView2 != null) {
            playerView2.m12507t(Boolean.FALSE);
        }
        if (this.f21478c2.equals("m3u")) {
            if (this.f21521l2.booleanValue()) {
                String m15383k2 = SharepreferenceDBHandler.m15383k(this.f21480d);
                Intent intent = new Intent(this.f21480d, (Class<?>) PlayExternalPlayerActivity.class);
                intent.putExtra("url", this.f21369F);
                intent.putExtra("packagename", m15385l);
                intent.putExtra("app_name", m15383k2);
                this.f21480d.startActivity(intent);
                return;
            }
            return;
        }
        if (this.f21536o2 == -1 || !this.f21521l2.booleanValue()) {
            return;
        }
        String m26203F = C5255e.m26203F(this.f21480d, this.f21536o2, this.f21499h0, "live");
        String m15383k3 = SharepreferenceDBHandler.m15383k(this.f21480d);
        Intent intent2 = new Intent(this.f21480d, (Class<?>) PlayExternalPlayerActivity.class);
        intent2.putExtra("url", m26203F);
        intent2.putExtra("packagename", m15385l);
        intent2.putExtra("app_name", m15383k3);
        this.f21480d.startActivity(intent2);
    }

    /* renamed from: d3 */
    public final void m17741d3() {
        try {
            if (this.f21438S3 || !C6597k.m30469k0(this.f21358C3)) {
                return;
            }
            this.f21438S3 = true;
            C6597k.m30464Z(this.f21358C3, new DialogInterface.OnDismissListener(this) { // from class: mf.d

                /* renamed from: b */
                public final NSTEXOPlayerSkyActivity f34446b;

                {
                    this.f34446b = this;
                }

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f34446b.m17623A2(dialogInterface);
                }
            }).mo2024M(getSupportFragmentManager(), null);
        } catch (Exception e10) {
        }
    }

    @Override // androidx.appcompat.app.ActivityC0243b, p030c0.ActivityC0952l, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        boolean z10 = keyEvent.getAction() == 0;
        if (keyCode == 82) {
            try {
                return z10 ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent);
            } catch (Exception e10) {
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: e3 */
    public final void m17742e3() {
        ListView listView;
        try {
            if (C5251a.f30008G.booleanValue()) {
                findViewById(2131427469).setOnClickListener(this);
            }
            this.f21460X0.setVisibility(0);
            this.f21464Y0.setVisibility(0);
            this.f21468Z0.setVisibility(0);
            this.f21471a1.setVisibility(0);
            this.f21474b1.setVisibility(0);
            this.f21450V0.setVisibility(0);
            getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f21477c1.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = 0;
            this.f21477c1.setLayoutParams(layoutParams);
            getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
            f21339Z3 = false;
            if (this.f21430R0) {
                if (!this.f21435S0 || this.f21440T0.equals("")) {
                    SharedPreferences sharedPreferences = getSharedPreferences("currentlyPlayingVideoPosition", 0);
                    this.f21459X = sharedPreferences;
                    this.f21389J.setSelection(sharedPreferences.getInt("currentlyPlayingVideoPosition", 0));
                    this.f21430R0 = false;
                    this.f21435S0 = false;
                } else {
                    String str = this.f21481d1;
                    if (str != null && !str.equals("") && this.f21481d1.equals("0")) {
                        m17702J1();
                    }
                }
                listView = this.f21389J;
                if (listView == null) {
                    return;
                }
            } else {
                listView = this.f21389J;
                if (listView == null) {
                    return;
                }
            }
            listView.requestFocus();
        } catch (Exception e10) {
            Log.e("exection", "" + e10);
        }
    }

    /* renamed from: f2 */
    public void m17743f2() {
        DatabaseHandler databaseHandler;
        Context context;
        ArrayList<LiveStreamsDBModel> arrayList;
        try {
            String str = "live";
            if (this.f21478c2.equals("m3u")) {
                new ArrayList();
                LiveStreamDBHandler liveStreamDBHandler = this.f21424Q;
                if (liveStreamDBHandler == null) {
                    return;
                }
                ArrayList<FavouriteM3UModel> m15175K1 = liveStreamDBHandler.m15175K1("live");
                ArrayList<LiveStreamsDBModel> arrayList2 = new ArrayList<>();
                ArrayList<String> arrayList3 = this.f21355C0;
                ArrayList<FavouriteM3UModel> arrayList4 = m15175K1;
                if (arrayList3 != null) {
                    arrayList4 = m15175K1;
                    if (arrayList3.size() > 0) {
                        arrayList4 = m15175K1;
                        if (m15175K1 != null) {
                            arrayList4 = m15175K1;
                            if (m15175K1.size() > 0) {
                                arrayList4 = m17757m2(m15175K1, this.f21355C0);
                            }
                        }
                    }
                }
                Iterator<FavouriteM3UModel> it = arrayList4.iterator();
                while (it.hasNext()) {
                    FavouriteM3UModel next = it.next();
                    ArrayList<LiveStreamsDBModel> m15183O1 = this.f21424Q.m15183O1(next.m14775a(), next.m14777c());
                    if (m15183O1 != null && m15183O1.size() > 0) {
                        arrayList2.add(m15183O1.get(0));
                    }
                }
                if (arrayList2.size() == 0) {
                    return;
                } else {
                    arrayList = arrayList2;
                }
            } else {
                new ArrayList();
                if (this.f21356C1 == null) {
                    return;
                }
                if (this.f21567u3.equals("true")) {
                    databaseHandler = this.f21356C1;
                    str = "radio_streams";
                    context = this.f21480d;
                } else {
                    databaseHandler = this.f21356C1;
                    context = this.f21480d;
                }
                ArrayList<FavouriteDBModel> m15116v = databaseHandler.m15116v(str, SharepreferenceDBHandler.m15337A(context));
                ArrayList<LiveStreamsDBModel> arrayList5 = new ArrayList<>();
                ArrayList<String> arrayList6 = this.f21355C0;
                ArrayList<FavouriteDBModel> arrayList7 = m15116v;
                if (arrayList6 != null) {
                    arrayList7 = m15116v;
                    if (arrayList6.size() > 0) {
                        arrayList7 = m15116v;
                        if (m15116v != null) {
                            arrayList7 = m15116v;
                            if (m15116v.size() > 0) {
                                arrayList7 = m17755l2(m15116v, this.f21355C0);
                            }
                        }
                    }
                }
                Iterator<FavouriteDBModel> it2 = arrayList7.iterator();
                while (it2.hasNext()) {
                    FavouriteDBModel next2 = it2.next();
                    LiveStreamsDBModel m15179M1 = new LiveStreamDBHandler(this.f21480d).m15179M1(next2.m14760a(), String.valueOf(next2.m14764e()));
                    if (m15179M1 != null) {
                        arrayList5.add(m15179M1);
                    }
                }
                if (arrayList5.size() == 0) {
                    return;
                } else {
                    arrayList = arrayList5;
                }
            }
            this.f21399L = arrayList;
        } catch (Exception e10) {
        }
    }

    /* renamed from: f3 */
    public void m17744f3() {
        Handler handler;
        if (PlayerView.f14189B0 || (handler = this.f21428Q3) == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x012e, code lost:
    
        if (r6.f21564u0.get(r7).m14816W().equals(r18) != false) goto L34;
     */
    /* renamed from: g2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m17745g2() {
        /*
            Method dump skipped, instructions count: 889
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity.m17745g2():java.lang.String");
    }

    /* renamed from: g3 */
    public void m17746g3() {
        Handler handler = this.f21418O3;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x02f7, code lost:
    
        if (r6.f21574w0.get(r7).m14816W().equals(r18) != false) goto L104;
     */
    /* renamed from: h2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m17747h2() {
        /*
            Method dump skipped, instructions count: 1363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity.m17747h2():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00f2  */
    /* renamed from: h3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int m17748h3() {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity.m17748h3():int");
    }

    /* renamed from: i2 */
    public int m17749i2(ArrayList<LiveStreamsDBModel> arrayList, int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            i11 = 0;
            try {
                if (i12 >= arrayList.size()) {
                    break;
                }
                if (C5255e.m26215R(arrayList.get(i12).m14805L()) == i10) {
                    i11 = i12;
                    break;
                }
                i12++;
            } catch (Exception e10) {
                i11 = 0;
            }
        }
        return i11;
    }

    /* renamed from: i3 */
    public void m17750i3() {
        RelativeLayout relativeLayout;
        if (PlayerView.f14189B0) {
            m17746g3();
            if (this.ll_screen_locked.getVisibility() == 0) {
                m17763s2();
                return;
            } else {
                m17737b3();
                m17724U1(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
                return;
            }
        }
        SeekBar seekBar = this.sb_volume;
        if (seekBar != null) {
            seekBar.setProgress(this.f21398K3.getStreamVolume(3));
        }
        m17744f3();
        if (this.rl_settings_box.getVisibility() == 0) {
            this.rl_settings_box.startAnimation(this.f21479c3);
            relativeLayout = this.rl_settings_box;
        } else {
            if (this.rl_episodes_box.getVisibility() != 0) {
                if (this.ll_player_header_footer.getVisibility() == 0) {
                    m17760p2();
                    return;
                } else {
                    m17733Y2();
                    m17722T1(TFTP.DEFAULT_TIMEOUT);
                    return;
                }
            }
            this.rl_episodes_box.startAnimation(this.f21522l3);
            relativeLayout = this.rl_episodes_box;
        }
        relativeLayout.setVisibility(8);
    }

    /* renamed from: j2 */
    public final ArrayList<String> m17751j2() {
        ArrayList<PasswordStatusDBModel> m15232m1 = this.f21424Q.m15232m1(SharepreferenceDBHandler.m15337A(this.f21480d));
        this.f21365E0 = m15232m1;
        if (m15232m1 != null) {
            Iterator<PasswordStatusDBModel> it = m15232m1.iterator();
            while (it.hasNext()) {
                PasswordStatusDBModel next = it.next();
                if (next.m15290a().equals("1")) {
                    this.f21355C0.add(next.m15291b());
                }
            }
        }
        return this.f21355C0;
    }

    /* renamed from: j3 */
    public final void m17752j3() {
        LinearLayout linearLayout = this.f21588z;
        if (linearLayout != null) {
            linearLayout.setClickable(true);
            this.f21588z.setOnTouchListener(new ViewOnTouchListenerC3610s(this));
        }
    }

    /* renamed from: k2 */
    public final boolean m17753k2(ArrayList<LiveStreamsDBModel> arrayList, ArrayList<String> arrayList2) {
        try {
            Iterator<LiveStreamsDBModel> it = arrayList.iterator();
            while (it.hasNext()) {
                LiveStreamsDBModel next = it.next();
                Iterator<String> it2 = arrayList2.iterator();
                do {
                    if (it2.hasNext()) {
                    }
                } while (!next.m14827g().equals(it2.next()));
                return true;
            }
            return false;
        } catch (Exception e10) {
            return false;
        }
    }

    /* renamed from: k3 */
    public void m17754k3(String str) {
        if (str != null) {
            try {
                if (!str.equals("")) {
                    if (this.f21543q != null) {
                        C10014t.m42105q(this.f21480d).m42116l(str).m42155k(80, 55).m42154j(2131231571).m42151g(this.f21543q);
                    }
                }
            } catch (Exception e10) {
                try {
                    ImageView imageView = this.f21543q;
                    if (imageView != null) {
                        imageView.setImageDrawable(this.f21480d.getResources().getDrawable(2131231571, null));
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    return;
                }
            }
        }
        ImageView imageView2 = this.f21543q;
        if (imageView2 != null) {
            imageView2.setImageDrawable(this.f21480d.getResources().getDrawable(2131231571, null));
        }
    }

    /* renamed from: l2 */
    public final ArrayList<FavouriteDBModel> m17755l2(ArrayList<FavouriteDBModel> arrayList, ArrayList<String> arrayList2) {
        boolean z10;
        try {
            this.f21380H0 = new ArrayList<>();
            Iterator<FavouriteDBModel> it = arrayList.iterator();
            while (it.hasNext()) {
                FavouriteDBModel next = it.next();
                Iterator<String> it2 = arrayList2.iterator();
                while (true) {
                    z10 = false;
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (next.m14760a().equals(it2.next())) {
                        z10 = true;
                        break;
                    }
                }
                if (!z10) {
                    this.f21380H0.add(next);
                }
            }
        } catch (Exception e10) {
        }
        return this.f21380H0;
    }

    /* renamed from: l3 */
    public void m17756l3(int i10, String str, int i11, int i12) {
        try {
            if (this.f21483d3.equals("mobile") && this.f21527m3 && this.f21577w3) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new RemoteAction(Icon.createWithResource(this, i10), str, str, PendingIntent.getBroadcast(this, i12, new Intent("media_control").putExtra("control_type", i11), 0)));
                this.f21537o3.setActions(arrayList);
                setPictureInPictureParams(this.f21537o3.build());
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: m2 */
    public final ArrayList<FavouriteM3UModel> m17757m2(ArrayList<FavouriteM3UModel> arrayList, ArrayList<String> arrayList2) {
        boolean z10;
        this.f21385I0 = new ArrayList<>();
        if (arrayList == null) {
            return null;
        }
        try {
            Iterator<FavouriteM3UModel> it = arrayList.iterator();
            while (it.hasNext()) {
                FavouriteM3UModel next = it.next();
                if (arrayList2 != null) {
                    Iterator<String> it2 = arrayList2.iterator();
                    while (true) {
                        z10 = false;
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (next.m14775a().equals(it2.next())) {
                            z10 = true;
                            break;
                        }
                    }
                    if (!z10) {
                        this.f21385I0.add(next);
                    }
                }
            }
            return this.f21385I0;
        } catch (Exception e10) {
            return null;
        }
    }

    /* renamed from: n2 */
    public final void m17758n2() {
        ProgressBar progressBar = this.f21573w;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
        TextView textView = this.f21548r;
        if (textView != null) {
            textView.setText(this.f21480d.getResources().getString(2132018252));
        }
        TextView textView2 = this.f21553s;
        if (textView2 != null) {
            textView2.setText("");
        }
        TextView textView3 = this.f21558t;
        if (textView3 != null) {
            textView3.setText(this.f21480d.getResources().getString(2132018186));
        }
        TextView textView4 = this.f21563u;
        if (textView4 != null) {
            textView4.setText("");
        }
    }

    /* renamed from: o2 */
    public final void m17759o2() {
        if (this.ll_player_header_footer.getVisibility() == 0) {
            this.ll_player_header_footer.startAnimation(this.f21473a3);
            if (this.ll_brightness.getVisibility() == 0) {
                this.ll_brightness.startAnimation(this.f21473a3);
            }
            if (this.tv_seek_left.getVisibility() == 0) {
                this.tv_seek_left.startAnimation(this.f21473a3);
            }
            if (this.ll_pause_play.getVisibility() == 0) {
                this.ll_pause_play.startAnimation(this.f21473a3);
            }
            if (this.tv_seek_right.getVisibility() == 0) {
                this.tv_seek_right.startAnimation(this.f21473a3);
            }
            if (this.ll_volume.getVisibility() == 0) {
                this.ll_volume.startAnimation(this.f21473a3);
            }
            this.ll_player_header_footer.setVisibility(8);
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
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 101) {
            try {
                if (m17770z2()) {
                    SharedPreferences sharedPreferences = getSharedPreferences("downloadStatus", 0);
                    f21338Y3 = sharedPreferences;
                    String string = sharedPreferences.getString("downloadStatus", "");
                    C5255e c5255e = new C5255e();
                    if (string.equals("processing")) {
                        c5255e.m26262g0(this);
                    } else {
                        c5255e.m26263j0(this, this.f21531n2, this.f21499h0, this.f21484e, this.f21364E, this.f21369F);
                    }
                }
            } catch (Exception e10) {
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        RelativeLayout relativeLayout;
        try {
            m17744f3();
            relativeLayout = this.rl_episodes_box;
        } catch (Exception e10) {
        }
        if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
            this.rl_episodes_box.startAnimation(this.f21522l3);
            this.rl_episodes_box.setVisibility(8);
            return;
        }
        if (this.rl_settings_box.getVisibility() == 0) {
            this.rl_settings_box.startAnimation(this.f21479c3);
            this.rl_settings_box.setVisibility(8);
            return;
        }
        if (f21339Z3) {
            if (this.ll_player_header_footer.getVisibility() != 0) {
                Toolbar toolbar = this.f21400L0;
                if (toolbar != null) {
                    toolbar.setVisibility(0);
                }
                m17742e3();
                return;
            }
            this.ll_player_header_footer.startAnimation(this.f21473a3);
            if (this.ll_brightness.getVisibility() == 0) {
                this.ll_brightness.startAnimation(this.f21473a3);
            }
            if (this.tv_seek_left.getVisibility() == 0) {
                this.tv_seek_left.startAnimation(this.f21473a3);
            }
            if (this.ll_pause_play.getVisibility() == 0) {
                this.ll_pause_play.startAnimation(this.f21473a3);
            }
            if (this.tv_seek_right.getVisibility() == 0) {
                this.tv_seek_right.startAnimation(this.f21473a3);
            }
            if (this.ll_volume.getVisibility() == 0) {
                this.ll_volume.startAnimation(this.f21473a3);
            }
            this.ll_player_header_footer.setVisibility(8);
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
        if (this.f21483d3.equals("mobile") && this.f21527m3 && this.f21577w3) {
            try {
                m17693D2();
            } catch (Exception e11) {
            }
            overridePendingTransition(2130772003, 2130772000);
        }
        super.onBackPressed();
        overridePendingTransition(2130772003, 2130772000);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:28:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0822  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onClick(android.view.View r6) {
        /*
            Method dump skipped, instructions count: 2471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity.onClick(android.view.View):void");
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m17700I1(configuration);
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f21400L0.m1224x(2131689495);
        this.f21465Y1 = menu;
        this.f21469Z1 = menu.getItem(2).getSubMenu().findItem(2131427886);
        if (SharepreferenceDBHandler.m15373f(this.f21480d).equals("api")) {
            menu.getItem(2).getSubMenu().findItem(2131428638).setVisible(false);
        }
        TypedValue typedValue = new TypedValue();
        int i10 = 0;
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f21480d.getResources().getDisplayMetrics());
            i10 = 0;
        }
        while (i10 < this.f21400L0.getChildCount()) {
            if (this.f21400L0.getChildAt(i10) instanceof ActionMenuView) {
                ((Toolbar.C0292e) this.f21400L0.getChildAt(i10).getLayoutParams()).f26228a = 16;
            }
            i10++;
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            m17732Y1();
            this.f21388I3 = true;
            m17711N2();
            C5938b.m29235e(this.f21480d).m29243c().m29360e(this.f21397K2, C5947e.class);
        } catch (Exception e10) {
        }
    }

    @Override // androidx.appcompat.app.ActivityC0243b, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        keyEvent.getRepeatCount();
        keyEvent.getAction();
        boolean z10 = f21339Z3;
        if (z10) {
            if (i10 == 20) {
                this.f21521l2.booleanValue();
                return true;
            }
            if (i10 == 19) {
                this.f21521l2.booleanValue();
                return true;
            }
        }
        if (i10 == 166) {
            if (!z10) {
                return true;
            }
            this.f21521l2.booleanValue();
            return true;
        }
        if (i10 != 167) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (!z10) {
            return true;
        }
        this.f21521l2.booleanValue();
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        C7562b2 c7562b2;
        StringBuilder sb2;
        int i11;
        keyEvent.getRepeatCount();
        if (i10 != 62) {
            if (i10 == 66) {
                return true;
            }
            if (i10 != 79) {
                if (i10 == 82) {
                    Menu menu = this.f21465Y1;
                    if (menu == null) {
                        return true;
                    }
                    menu.performIdentifierAction(2131427886, 0);
                    return true;
                }
                if (i10 != 85 && i10 != 86 && i10 != 126 && i10 != 127) {
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
                            if (!f21339Z3) {
                                return true;
                            }
                            this.f21406M1.removeCallbacksAndMessages(null);
                            if (i10 == 7) {
                                this.f21436S1.append(0);
                            } else if (i10 == 8) {
                                this.f21436S1.append(1);
                            } else {
                                if (i10 == 9) {
                                    sb2 = this.f21436S1;
                                    i11 = 2;
                                } else if (i10 == 10) {
                                    sb2 = this.f21436S1;
                                    i11 = 3;
                                } else if (i10 == 11) {
                                    sb2 = this.f21436S1;
                                    i11 = 4;
                                } else if (i10 == 12) {
                                    sb2 = this.f21436S1;
                                    i11 = 5;
                                } else if (i10 == 13) {
                                    sb2 = this.f21436S1;
                                    i11 = 6;
                                } else if (i10 == 14) {
                                    sb2 = this.f21436S1;
                                    i11 = 7;
                                } else if (i10 == 15) {
                                    this.f21436S1.append(8);
                                } else if (i10 == 16) {
                                    this.f21436S1.append(9);
                                }
                                sb2.append(i11);
                            }
                            this.f21446U1.setText(this.f21436S1.toString());
                            this.f21441T1.setVisibility(0);
                            this.f21406M1.postDelayed(new RunnableC3585d(this), 3000L);
                            return true;
                        default:
                            switch (i10) {
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                    return true;
                                case 23:
                                    return true;
                                default:
                                    return super.onKeyUp(i10, keyEvent);
                            }
                    }
                }
            }
        }
        try {
            if (!this.f21521l2.booleanValue() || (c7562b2 = this.f21348A3) == null) {
                return true;
            }
            if (c7562b2 == null || !c7562b2.isPlaying()) {
                m17705K2();
                return true;
            }
            m17703J2();
            return true;
        } catch (Exception e10) {
            return true;
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        intent.putExtra("BUNDLE_KEY_NEW_INTENT_CALLED", true);
        setIntent(intent);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        m17766v2();
        this.f21469Z1 = menuItem;
        int itemId = menuItem.getItemId();
        if (itemId == 2131428761) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == 2131428776) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == 2131427417 && (context = this.f21480d) != null) {
            new DialogC0242a.a(context, 2132082693).setTitle(this.f21480d.getResources().getString(2132017988)).m857e(this.f21480d.getResources().getString(2132017987)).m861i(this.f21480d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3605n(this)).m858f(this.f21480d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3603m(this)).m865m();
        }
        if (itemId == 2131427425) {
            SearchView searchView = (SearchView) C6845p.m31619b(menuItem);
            this.f21405M0 = searchView;
            searchView.setQueryHint(this.f21480d.getResources().getString(2132018514));
            this.f21405M0.setIconifiedByDefault(false);
            this.f21405M0.setOnQueryTextListener(new C3606o(this));
            return true;
        }
        if (itemId == 2131428638) {
            DialogC0242a.a aVar = new DialogC0242a.a(this);
            aVar.setTitle(this.f21480d.getResources().getString(2132017514));
            aVar.m857e(this.f21480d.getResources().getString(2132017585));
            aVar.m855c(2131231731);
            aVar.m861i(this.f21480d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3607p(this));
            aVar.m858f(this.f21480d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3608q(this));
            aVar.m865m();
        }
        if (itemId == 2131428645) {
            m17739c3(this);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f21592z3;
            if (thread != null && thread.isAlive()) {
                this.f21592z3.interrupt();
            }
        } catch (Exception e10) {
        }
        this.f21388I3 = true;
        try {
            C5938b c5938b = this.f21407M2;
            if (c5938b != null) {
                c5938b.m29243c().m29360e(this.f21397K2, C5947e.class);
            }
        } catch (Exception e11) {
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            if (z10) {
                PlayerView playerView = this.f21491f2;
                if (playerView != null && playerView.f14192B != null) {
                    playerView.setShowOrHideSubtitles("gone");
                    this.f21491f2.f14192B.setVisibility(8);
                }
                C3595i c3595i = new C3595i(this);
                this.f21542p3 = c3595i;
                registerReceiver(c3595i, new IntentFilter("media_control"));
                return;
            }
            f21339Z3 = true;
            unregisterReceiver(this.f21542p3);
            this.f21532n3 = false;
            this.f21542p3 = null;
            PlayerView playerView2 = this.f21491f2;
            if (playerView2 == null || playerView2.f14192B == null) {
                return;
            }
            playerView2.setShowOrHideSubtitles("visible");
            this.f21491f2.f14192B.setVisibility(0);
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 != 101) {
            return;
        }
        try {
            if (iArr.length > 0 && iArr[0] == 0) {
                m17770z2();
            } else if (Build.VERSION.SDK_INT >= 23 && !shouldShowRequestPermissionRationale(strArr[0])) {
                DialogC0242a.a aVar = new DialogC0242a.a(this, 2132082693);
                View inflate = LayoutInflater.from(this).inflate(2131624461, (ViewGroup) null);
                Button button = (Button) inflate.findViewById(2131427646);
                Button button2 = (Button) inflate.findViewById(2131427636);
                button.setOnFocusChangeListener(new C5255e.i(button, this));
                button2.setOnFocusChangeListener(new C5255e.i(button2, this));
                button.setOnClickListener(new ViewOnClickListenerC3580a0(this));
                button2.setOnClickListener(new ViewOnClickListenerC3582b0(this));
                aVar.setView(inflate);
                this.f21511j2 = aVar.create();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = this.f21511j2.getWindow();
                Objects.requireNonNull(window);
                Window window2 = window;
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = -1;
                layoutParams.height = -2;
                this.f21511j2.show();
                this.f21511j2.getWindow().setAttributes(layoutParams);
                this.f21511j2.setCancelable(false);
                this.f21511j2.show();
            }
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        AppOpsManager appOpsManager;
        m17765u2();
        super.onResume();
        this.f21388I3 = false;
        Thread thread = this.f21592z3;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC3588e0(this));
            this.f21592z3 = thread2;
            thread2.start();
        }
        Context context = this.f21480d;
        boolean z10 = true;
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("auto_start", 0);
            this.f21572v3 = sharedPreferences;
            boolean z11 = sharedPreferences.getBoolean("picinpic", C5251a.f30033c0);
            this.f21577w3 = z11;
            if (z11 && this.f21483d3.equals("mobile")) {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 26) {
                    this.f21537o3 = new PictureInPictureParams$Builder();
                }
                if (i10 >= 26) {
                    try {
                        if (getPackageManager().hasSystemFeature("android.software.picture_in_picture") && (appOpsManager = (AppOpsManager) this.f21480d.getSystemService("appops")) != null && appOpsManager.checkOpNoThrow("android:picture_in_picture", Process.myUid(), this.f21480d.getPackageName()) == 0) {
                            this.f21527m3 = true;
                        }
                    } catch (Exception e10) {
                    }
                }
            }
        }
        Intent intent = getIntent();
        if (intent == null || !intent.getBooleanExtra("BUNDLE_KEY_NEW_INTENT_CALLED", false)) {
            z10 = false;
        }
        if (z10) {
            intent.putExtra("BUNDLE_KEY_NEW_INTENT_CALLED", false);
            setIntent(intent);
            this.f21459X = getSharedPreferences("currentlyPlayingVideo", 0);
            if (!String.valueOf(getIntent().getIntExtra("OPENED_STREAM_ID", 0)).equals(SharepreferenceDBHandler.m15373f(this.f21480d).equals("m3u") ? this.f21454W.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", "") : this.f21454W.getString("currentlyPlayingVideo", ""))) {
                this.f21546q2 = getIntent().getStringExtra("OPENED_CAT_ID");
                this.f21485e1 = getIntent().getStringExtra("OPENED_CAT_NAME");
                this.f21541p2 = getIntent().getIntExtra("OPENED_STREAM_ID", 0);
                this.f21431R1 = getIntent().getIntExtra("VIDEO_NUM", 0);
                this.f21481d1 = this.f21546q2;
                this.f21482d2 = getIntent().getStringExtra("VIDEO_URL");
                this.f21461X1 = Boolean.FALSE;
                String str = this.f21481d1;
                if (str == null || str.equals("") || !this.f21481d1.equals("0")) {
                    String str2 = this.f21481d1;
                    if (str2 == null || str2.equals("") || !this.f21481d1.equals("-1")) {
                        String str3 = this.f21481d1;
                        if (str3 == null || str3.equals("") || !this.f21481d1.equals("-6")) {
                            m17706L1();
                        } else {
                            m17716Q1();
                        }
                    } else {
                        m17714P1();
                    }
                } else {
                    m17702J1();
                }
            }
        }
        C5255e.m26233f(this.f21480d);
        try {
            C5938b c5938b = this.f21407M2;
            if (c5938b != null) {
                c5938b.m29243c().m29356a(this.f21397K2, C5947e.class);
            }
        } catch (Exception e11) {
        }
        m17766v2();
        if (!this.f21581x2) {
            if (this.f21348A3 == null) {
                m17768x2();
                return;
            }
            return;
        }
        this.f21581x2 = false;
        ArrayList<LiveStreamsDBModel> arrayList = this.f21564u0;
        if (arrayList == null || arrayList.size() == 0) {
            C5251a.f30008G = Boolean.FALSE;
            m17699H2();
        } else {
            m17707L2(this.f21564u0);
        }
        C5867t c5867t = this.f21434S;
        if (c5867t != null) {
            c5867t.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onStart() {
        super.onStart();
        try {
            C5938b.m29235e(this.f21480d).m29243c().m29356a(this.f21397K2, C5947e.class);
        } catch (Exception e10) {
        }
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onStop() {
        super.onStop();
        try {
            this.f21388I3 = true;
            m17711N2();
            if (this.f21483d3.equals("mobile") && !this.f21562t3 && this.f21527m3 && this.f21577w3) {
                finishAndRemoveTask();
            }
        } catch (Exception e10) {
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        if (this.f21483d3.equals("mobile") && this.f21527m3 && this.f21577w3 && !this.f21562t3 && !isInPictureInPictureMode()) {
            try {
                m17693D2();
                this.f21532n3 = true;
            } catch (Exception e10) {
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        m17765u2();
        if (z10) {
            m17700I1(getResources().getConfiguration());
        }
    }

    /* renamed from: p2 */
    public void m17760p2() {
        if (PlayerView.f14189B0 || this.ll_player_header_footer.getVisibility() != 0) {
            return;
        }
        this.ll_player_header_footer.startAnimation(this.f21473a3);
        if (this.ll_brightness.getVisibility() == 0) {
            this.ll_brightness.startAnimation(this.f21473a3);
        }
        if (this.tv_seek_left.getVisibility() == 0) {
            this.tv_seek_left.startAnimation(this.f21473a3);
        }
        if (this.ll_pause_play.getVisibility() == 0) {
            this.ll_pause_play.startAnimation(this.f21473a3);
        }
        if (this.tv_seek_right.getVisibility() == 0) {
            this.tv_seek_right.startAnimation(this.f21473a3);
        }
        if (this.ll_volume.getVisibility() == 0) {
            this.ll_volume.startAnimation(this.f21473a3);
        }
        this.ll_player_header_footer.setVisibility(8);
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

    /* renamed from: q2 */
    public final void m17761q2() {
        LinearLayout linearLayout = this.f21583y;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    /* renamed from: r2 */
    public final void m17762r2() {
        ProgressBar progressBar = this.f21578x;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    /* renamed from: s2 */
    public void m17763s2() {
        if (this.ll_screen_locked.getVisibility() == 0) {
            this.ll_screen_locked.startAnimation(this.f21452V2);
            this.ll_screen_locked.setVisibility(8);
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

    /* renamed from: t2 */
    public void m17764t2() {
        LinearLayout linearLayout = this.ll_no_cat_found;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    public void toggleView(View view) {
        if (view.getVisibility() == 8) {
            view.setVisibility(0);
        } else if (view.getVisibility() == 0) {
            view.setVisibility(8);
        }
    }

    /* renamed from: u2 */
    public final void m17765u2() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception e10) {
        }
    }

    /* renamed from: v2 */
    public final void m17766v2() {
        try {
            this.f21349B = true;
            this.f21400L0.m1205e();
            TextView textView = this.f21410N0;
            if (textView == null || this.f21354C) {
                return;
            }
            textView.setVisibility(8);
        } catch (Exception e10) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w2 */
    public final boolean m17767w2() {
        boolean z10;
        try {
            this.f21360D0 = this.f21567u3.equals("true") ? this.f21424Q.m15268z1() : this.f21424Q.m15263x1();
            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel2 = new LiveStreamCategoryIdDBModel();
            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel3 = new LiveStreamCategoryIdDBModel();
            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel4 = new LiveStreamCategoryIdDBModel();
            liveStreamCategoryIdDBModel.m14792g("0");
            liveStreamCategoryIdDBModel.m14793h(this.f21480d.getResources().getString(2132017297));
            liveStreamCategoryIdDBModel2.m14792g("-1");
            liveStreamCategoryIdDBModel2.m14793h(this.f21480d.getResources().getString(2132017779));
            if (this.f21478c2.equals("m3u")) {
                int m15218f2 = this.f21424Q.m15218f2("live");
                this.f21451V1 = m15218f2;
                if (m15218f2 != 0 && m15218f2 > 0) {
                    liveStreamCategoryIdDBModel3.m14792g("");
                    liveStreamCategoryIdDBModel3.m14793h(this.f21480d.getResources().getString(2132018731));
                    ArrayList<LiveStreamCategoryIdDBModel> arrayList = this.f21360D0;
                    arrayList.add(arrayList.size(), liveStreamCategoryIdDBModel3);
                }
            } else if (this.f21567u3.equals("false")) {
                int m15211c2 = this.f21424Q.m15211c2("-2", "live");
                this.f21451V1 = m15211c2;
                if (m15211c2 != 0 && m15211c2 > 0) {
                    liveStreamCategoryIdDBModel3.m14792g("-2");
                    liveStreamCategoryIdDBModel3.m14793h(this.f21480d.getResources().getString(2132018731));
                    ArrayList<LiveStreamCategoryIdDBModel> arrayList2 = this.f21360D0;
                    arrayList2.add(arrayList2.size(), liveStreamCategoryIdDBModel3);
                }
            }
            liveStreamCategoryIdDBModel4.m14792g("-6");
            liveStreamCategoryIdDBModel4.m14793h(getResources().getString(2132018441));
            ArrayList<LiveStreamCategoryIdDBModel> arrayList3 = this.f21360D0;
            if (arrayList3 != null) {
                arrayList3.add(0, liveStreamCategoryIdDBModel);
                this.f21360D0.add(1, liveStreamCategoryIdDBModel2);
                this.f21360D0.add(2, liveStreamCategoryIdDBModel4);
                this.f21539p0 = this.f21360D0;
            }
            String str = this.f21546q2;
            int hashCode = str.hashCode();
            if (hashCode == 0) {
                if (str.equals("")) {
                    z10 = 4;
                }
                z10 = -1;
            } else if (hashCode == 48) {
                if (str.equals("0")) {
                    z10 = false;
                }
                z10 = -1;
            } else if (hashCode == 1449) {
                if (str.equals("-6")) {
                    z10 = 2;
                }
                z10 = -1;
            } else if (hashCode != 1444) {
                if (hashCode == 1445 && str.equals("-2")) {
                    z10 = 3;
                }
                z10 = -1;
            } else {
                if (str.equals("-1")) {
                    z10 = true;
                }
                z10 = -1;
            }
            if (!z10) {
                this.f21481d1 = "0";
                this.f21485e1 = this.f21480d.getResources().getString(2132017297);
                try {
                    this.f21509j0 = 0;
                    return true;
                } catch (Exception e10) {
                    return false;
                }
            }
            if (z10) {
                this.f21481d1 = "-1";
                this.f21485e1 = this.f21480d.getResources().getString(2132017779);
                this.f21509j0 = 1;
                return true;
            }
            if (z10 == 2) {
                this.f21481d1 = "-6";
                this.f21485e1 = this.f21480d.getResources().getString(2132018441);
                this.f21509j0 = 2;
                return true;
            }
            if (z10 != 3 && z10 != 4) {
                if (this.f21539p0 == null) {
                    return true;
                }
                for (int i10 = 0; i10 < this.f21539p0.size(); i10++) {
                    if (this.f21539p0.get(i10).m14787b().equals(this.f21481d1)) {
                        this.f21509j0 = i10;
                        return true;
                    }
                }
                return true;
            }
            if (this.f21478c2.equals("m3u")) {
                this.f21481d1 = "";
            } else {
                this.f21481d1 = "-2";
            }
            this.f21485e1 = this.f21480d.getResources().getString(2132018731);
            ArrayList<LiveStreamCategoryIdDBModel> arrayList4 = this.f21360D0;
            if (arrayList4 == null || arrayList4.size() <= 0) {
                return true;
            }
            this.f21509j0 = this.f21360D0.size() - 1;
            return true;
        } catch (Exception e11) {
            return false;
        }
    }

    /* renamed from: x2 */
    public final void m17768x2() {
        try {
            this.f21533o.setVisibility(8);
        } catch (Exception e10) {
        }
        if (this.f21368E3 != null) {
            m17711N2();
            if (this.f21348A3 == null) {
                InterfaceC7639z1 m30437b = C6588b.m30437b(this, false);
                C0103k c0103k = new C0103k(this.f21353B3);
                C9882f c9882f = new C9882f(this);
                this.f21358C3 = c9882f;
                c9882f.m41643L(this.f21363D3);
                C7562b2 m32510z = new C7562b2.b(this, m30437b).m32508A(c0103k).m32509B(this.f21358C3).m32510z();
                this.f21348A3 = m32510z;
                m32510z.mo32447g(new C3600k0(this, null));
                this.f21348A3.m32422M0(new C4372l(this.f21358C3));
                this.f21348A3.m32466q1(C7972d.f38501f, true);
                this.f21348A3.mo32456l(true);
                this.f21491f2.setPlayer(this.f21348A3);
            }
            this.f21348A3.m32639Q(0, C7561b1.m32344b(this.f21368E3));
            this.f21348A3.prepare();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:97:0x10ad
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0be0 A[Catch: Exception -> 0x10a3, TRY_ENTER, TryCatch #2 {Exception -> 0x10a3, blocks: (B:3:0x0005, B:5:0x019c, B:7:0x01a7, B:8:0x01c0, B:8:0x01c0, B:9:0x01c3, B:12:0x0271, B:13:0x0281, B:15:0x030f, B:17:0x0317, B:19:0x0324, B:22:0x0332, B:23:0x03ab, B:25:0x0405, B:32:0x0423, B:45:0x0472, B:49:0x0481, B:51:0x048c, B:53:0x04a9, B:54:0x057d, B:56:0x05de, B:58:0x05e9, B:60:0x05fb, B:62:0x0602, B:64:0x060c, B:66:0x0614, B:68:0x061e, B:70:0x0631, B:72:0x063b, B:74:0x064c, B:75:0x0695, B:77:0x06c5, B:79:0x0717, B:80:0x0778, B:85:0x0b55, B:87:0x0b66, B:89:0x0b78, B:95:0x0ba9, B:99:0x0bac, B:101:0x0be0, B:105:0x0c0e, B:107:0x0c1d, B:109:0x0c32, B:111:0x0cea, B:113:0x0cf1, B:115:0x0d07, B:117:0x0d0e, B:119:0x0d21, B:121:0x0d28, B:123:0x0d3b, B:125:0x0d4a, B:127:0x0d67, B:129:0x0d6e, B:132:0x0df6, B:134:0x0e01, B:136:0x0e08, B:137:0x0e10, B:138:0x0e17, B:140:0x0fcf, B:142:0x0fdc, B:144:0x0fe9, B:146:0x0ffe, B:150:0x1008, B:152:0x1015, B:154:0x1022, B:155:0x1039, B:157:0x1046, B:159:0x1053, B:160:0x106a, B:162:0x1077, B:164:0x1085, B:165:0x108d, B:167:0x0beb, B:168:0x0b70, B:171:0x0723, B:173:0x0654, B:175:0x0666, B:177:0x0679, B:179:0x0683, B:183:0x04be, B:185:0x04c9, B:191:0x0507, B:193:0x0512, B:198:0x0548, B:200:0x0553, B:202:0x0433, B:206:0x0443, B:210:0x033b, B:212:0x0346, B:214:0x034e, B:216:0x035b, B:220:0x036d, B:221:0x0376, B:223:0x0381, B:225:0x0389, B:227:0x0396), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0c1d A[Catch: Exception -> 0x10a3, TryCatch #2 {Exception -> 0x10a3, blocks: (B:3:0x0005, B:5:0x019c, B:7:0x01a7, B:8:0x01c0, B:8:0x01c0, B:9:0x01c3, B:12:0x0271, B:13:0x0281, B:15:0x030f, B:17:0x0317, B:19:0x0324, B:22:0x0332, B:23:0x03ab, B:25:0x0405, B:32:0x0423, B:45:0x0472, B:49:0x0481, B:51:0x048c, B:53:0x04a9, B:54:0x057d, B:56:0x05de, B:58:0x05e9, B:60:0x05fb, B:62:0x0602, B:64:0x060c, B:66:0x0614, B:68:0x061e, B:70:0x0631, B:72:0x063b, B:74:0x064c, B:75:0x0695, B:77:0x06c5, B:79:0x0717, B:80:0x0778, B:85:0x0b55, B:87:0x0b66, B:89:0x0b78, B:95:0x0ba9, B:99:0x0bac, B:101:0x0be0, B:105:0x0c0e, B:107:0x0c1d, B:109:0x0c32, B:111:0x0cea, B:113:0x0cf1, B:115:0x0d07, B:117:0x0d0e, B:119:0x0d21, B:121:0x0d28, B:123:0x0d3b, B:125:0x0d4a, B:127:0x0d67, B:129:0x0d6e, B:132:0x0df6, B:134:0x0e01, B:136:0x0e08, B:137:0x0e10, B:138:0x0e17, B:140:0x0fcf, B:142:0x0fdc, B:144:0x0fe9, B:146:0x0ffe, B:150:0x1008, B:152:0x1015, B:154:0x1022, B:155:0x1039, B:157:0x1046, B:159:0x1053, B:160:0x106a, B:162:0x1077, B:164:0x1085, B:165:0x108d, B:167:0x0beb, B:168:0x0b70, B:171:0x0723, B:173:0x0654, B:175:0x0666, B:177:0x0679, B:179:0x0683, B:183:0x04be, B:185:0x04c9, B:191:0x0507, B:193:0x0512, B:198:0x0548, B:200:0x0553, B:202:0x0433, B:206:0x0443, B:210:0x033b, B:212:0x0346, B:214:0x034e, B:216:0x035b, B:220:0x036d, B:221:0x0376, B:223:0x0381, B:225:0x0389, B:227:0x0396), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0cea A[Catch: Exception -> 0x10a3, TRY_ENTER, TryCatch #2 {Exception -> 0x10a3, blocks: (B:3:0x0005, B:5:0x019c, B:7:0x01a7, B:8:0x01c0, B:8:0x01c0, B:9:0x01c3, B:12:0x0271, B:13:0x0281, B:15:0x030f, B:17:0x0317, B:19:0x0324, B:22:0x0332, B:23:0x03ab, B:25:0x0405, B:32:0x0423, B:45:0x0472, B:49:0x0481, B:51:0x048c, B:53:0x04a9, B:54:0x057d, B:56:0x05de, B:58:0x05e9, B:60:0x05fb, B:62:0x0602, B:64:0x060c, B:66:0x0614, B:68:0x061e, B:70:0x0631, B:72:0x063b, B:74:0x064c, B:75:0x0695, B:77:0x06c5, B:79:0x0717, B:80:0x0778, B:85:0x0b55, B:87:0x0b66, B:89:0x0b78, B:95:0x0ba9, B:99:0x0bac, B:101:0x0be0, B:105:0x0c0e, B:107:0x0c1d, B:109:0x0c32, B:111:0x0cea, B:113:0x0cf1, B:115:0x0d07, B:117:0x0d0e, B:119:0x0d21, B:121:0x0d28, B:123:0x0d3b, B:125:0x0d4a, B:127:0x0d67, B:129:0x0d6e, B:132:0x0df6, B:134:0x0e01, B:136:0x0e08, B:137:0x0e10, B:138:0x0e17, B:140:0x0fcf, B:142:0x0fdc, B:144:0x0fe9, B:146:0x0ffe, B:150:0x1008, B:152:0x1015, B:154:0x1022, B:155:0x1039, B:157:0x1046, B:159:0x1053, B:160:0x106a, B:162:0x1077, B:164:0x1085, B:165:0x108d, B:167:0x0beb, B:168:0x0b70, B:171:0x0723, B:173:0x0654, B:175:0x0666, B:177:0x0679, B:179:0x0683, B:183:0x04be, B:185:0x04c9, B:191:0x0507, B:193:0x0512, B:198:0x0548, B:200:0x0553, B:202:0x0433, B:206:0x0443, B:210:0x033b, B:212:0x0346, B:214:0x034e, B:216:0x035b, B:220:0x036d, B:221:0x0376, B:223:0x0381, B:225:0x0389, B:227:0x0396), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0d07 A[Catch: Exception -> 0x10a3, TRY_ENTER, TryCatch #2 {Exception -> 0x10a3, blocks: (B:3:0x0005, B:5:0x019c, B:7:0x01a7, B:8:0x01c0, B:8:0x01c0, B:9:0x01c3, B:12:0x0271, B:13:0x0281, B:15:0x030f, B:17:0x0317, B:19:0x0324, B:22:0x0332, B:23:0x03ab, B:25:0x0405, B:32:0x0423, B:45:0x0472, B:49:0x0481, B:51:0x048c, B:53:0x04a9, B:54:0x057d, B:56:0x05de, B:58:0x05e9, B:60:0x05fb, B:62:0x0602, B:64:0x060c, B:66:0x0614, B:68:0x061e, B:70:0x0631, B:72:0x063b, B:74:0x064c, B:75:0x0695, B:77:0x06c5, B:79:0x0717, B:80:0x0778, B:85:0x0b55, B:87:0x0b66, B:89:0x0b78, B:95:0x0ba9, B:99:0x0bac, B:101:0x0be0, B:105:0x0c0e, B:107:0x0c1d, B:109:0x0c32, B:111:0x0cea, B:113:0x0cf1, B:115:0x0d07, B:117:0x0d0e, B:119:0x0d21, B:121:0x0d28, B:123:0x0d3b, B:125:0x0d4a, B:127:0x0d67, B:129:0x0d6e, B:132:0x0df6, B:134:0x0e01, B:136:0x0e08, B:137:0x0e10, B:138:0x0e17, B:140:0x0fcf, B:142:0x0fdc, B:144:0x0fe9, B:146:0x0ffe, B:150:0x1008, B:152:0x1015, B:154:0x1022, B:155:0x1039, B:157:0x1046, B:159:0x1053, B:160:0x106a, B:162:0x1077, B:164:0x1085, B:165:0x108d, B:167:0x0beb, B:168:0x0b70, B:171:0x0723, B:173:0x0654, B:175:0x0666, B:177:0x0679, B:179:0x0683, B:183:0x04be, B:185:0x04c9, B:191:0x0507, B:193:0x0512, B:198:0x0548, B:200:0x0553, B:202:0x0433, B:206:0x0443, B:210:0x033b, B:212:0x0346, B:214:0x034e, B:216:0x035b, B:220:0x036d, B:221:0x0376, B:223:0x0381, B:225:0x0389, B:227:0x0396), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0d21 A[Catch: Exception -> 0x10a3, TRY_ENTER, TryCatch #2 {Exception -> 0x10a3, blocks: (B:3:0x0005, B:5:0x019c, B:7:0x01a7, B:8:0x01c0, B:8:0x01c0, B:9:0x01c3, B:12:0x0271, B:13:0x0281, B:15:0x030f, B:17:0x0317, B:19:0x0324, B:22:0x0332, B:23:0x03ab, B:25:0x0405, B:32:0x0423, B:45:0x0472, B:49:0x0481, B:51:0x048c, B:53:0x04a9, B:54:0x057d, B:56:0x05de, B:58:0x05e9, B:60:0x05fb, B:62:0x0602, B:64:0x060c, B:66:0x0614, B:68:0x061e, B:70:0x0631, B:72:0x063b, B:74:0x064c, B:75:0x0695, B:77:0x06c5, B:79:0x0717, B:80:0x0778, B:85:0x0b55, B:87:0x0b66, B:89:0x0b78, B:95:0x0ba9, B:99:0x0bac, B:101:0x0be0, B:105:0x0c0e, B:107:0x0c1d, B:109:0x0c32, B:111:0x0cea, B:113:0x0cf1, B:115:0x0d07, B:117:0x0d0e, B:119:0x0d21, B:121:0x0d28, B:123:0x0d3b, B:125:0x0d4a, B:127:0x0d67, B:129:0x0d6e, B:132:0x0df6, B:134:0x0e01, B:136:0x0e08, B:137:0x0e10, B:138:0x0e17, B:140:0x0fcf, B:142:0x0fdc, B:144:0x0fe9, B:146:0x0ffe, B:150:0x1008, B:152:0x1015, B:154:0x1022, B:155:0x1039, B:157:0x1046, B:159:0x1053, B:160:0x106a, B:162:0x1077, B:164:0x1085, B:165:0x108d, B:167:0x0beb, B:168:0x0b70, B:171:0x0723, B:173:0x0654, B:175:0x0666, B:177:0x0679, B:179:0x0683, B:183:0x04be, B:185:0x04c9, B:191:0x0507, B:193:0x0512, B:198:0x0548, B:200:0x0553, B:202:0x0433, B:206:0x0443, B:210:0x033b, B:212:0x0346, B:214:0x034e, B:216:0x035b, B:220:0x036d, B:221:0x0376, B:223:0x0381, B:225:0x0389, B:227:0x0396), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0d3b A[Catch: Exception -> 0x10a3, TRY_ENTER, TryCatch #2 {Exception -> 0x10a3, blocks: (B:3:0x0005, B:5:0x019c, B:7:0x01a7, B:8:0x01c0, B:8:0x01c0, B:9:0x01c3, B:12:0x0271, B:13:0x0281, B:15:0x030f, B:17:0x0317, B:19:0x0324, B:22:0x0332, B:23:0x03ab, B:25:0x0405, B:32:0x0423, B:45:0x0472, B:49:0x0481, B:51:0x048c, B:53:0x04a9, B:54:0x057d, B:56:0x05de, B:58:0x05e9, B:60:0x05fb, B:62:0x0602, B:64:0x060c, B:66:0x0614, B:68:0x061e, B:70:0x0631, B:72:0x063b, B:74:0x064c, B:75:0x0695, B:77:0x06c5, B:79:0x0717, B:80:0x0778, B:85:0x0b55, B:87:0x0b66, B:89:0x0b78, B:95:0x0ba9, B:99:0x0bac, B:101:0x0be0, B:105:0x0c0e, B:107:0x0c1d, B:109:0x0c32, B:111:0x0cea, B:113:0x0cf1, B:115:0x0d07, B:117:0x0d0e, B:119:0x0d21, B:121:0x0d28, B:123:0x0d3b, B:125:0x0d4a, B:127:0x0d67, B:129:0x0d6e, B:132:0x0df6, B:134:0x0e01, B:136:0x0e08, B:137:0x0e10, B:138:0x0e17, B:140:0x0fcf, B:142:0x0fdc, B:144:0x0fe9, B:146:0x0ffe, B:150:0x1008, B:152:0x1015, B:154:0x1022, B:155:0x1039, B:157:0x1046, B:159:0x1053, B:160:0x106a, B:162:0x1077, B:164:0x1085, B:165:0x108d, B:167:0x0beb, B:168:0x0b70, B:171:0x0723, B:173:0x0654, B:175:0x0666, B:177:0x0679, B:179:0x0683, B:183:0x04be, B:185:0x04c9, B:191:0x0507, B:193:0x0512, B:198:0x0548, B:200:0x0553, B:202:0x0433, B:206:0x0443, B:210:0x033b, B:212:0x0346, B:214:0x034e, B:216:0x035b, B:220:0x036d, B:221:0x0376, B:223:0x0381, B:225:0x0389, B:227:0x0396), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0d67 A[Catch: Exception -> 0x10a3, TRY_ENTER, TryCatch #2 {Exception -> 0x10a3, blocks: (B:3:0x0005, B:5:0x019c, B:7:0x01a7, B:8:0x01c0, B:8:0x01c0, B:9:0x01c3, B:12:0x0271, B:13:0x0281, B:15:0x030f, B:17:0x0317, B:19:0x0324, B:22:0x0332, B:23:0x03ab, B:25:0x0405, B:32:0x0423, B:45:0x0472, B:49:0x0481, B:51:0x048c, B:53:0x04a9, B:54:0x057d, B:56:0x05de, B:58:0x05e9, B:60:0x05fb, B:62:0x0602, B:64:0x060c, B:66:0x0614, B:68:0x061e, B:70:0x0631, B:72:0x063b, B:74:0x064c, B:75:0x0695, B:77:0x06c5, B:79:0x0717, B:80:0x0778, B:85:0x0b55, B:87:0x0b66, B:89:0x0b78, B:95:0x0ba9, B:99:0x0bac, B:101:0x0be0, B:105:0x0c0e, B:107:0x0c1d, B:109:0x0c32, B:111:0x0cea, B:113:0x0cf1, B:115:0x0d07, B:117:0x0d0e, B:119:0x0d21, B:121:0x0d28, B:123:0x0d3b, B:125:0x0d4a, B:127:0x0d67, B:129:0x0d6e, B:132:0x0df6, B:134:0x0e01, B:136:0x0e08, B:137:0x0e10, B:138:0x0e17, B:140:0x0fcf, B:142:0x0fdc, B:144:0x0fe9, B:146:0x0ffe, B:150:0x1008, B:152:0x1015, B:154:0x1022, B:155:0x1039, B:157:0x1046, B:159:0x1053, B:160:0x106a, B:162:0x1077, B:164:0x1085, B:165:0x108d, B:167:0x0beb, B:168:0x0b70, B:171:0x0723, B:173:0x0654, B:175:0x0666, B:177:0x0679, B:179:0x0683, B:183:0x04be, B:185:0x04c9, B:191:0x0507, B:193:0x0512, B:198:0x0548, B:200:0x0553, B:202:0x0433, B:206:0x0443, B:210:0x033b, B:212:0x0346, B:214:0x034e, B:216:0x035b, B:220:0x036d, B:221:0x0376, B:223:0x0381, B:225:0x0389, B:227:0x0396), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0df6 A[Catch: Exception -> 0x10a3, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x10a3, blocks: (B:3:0x0005, B:5:0x019c, B:7:0x01a7, B:8:0x01c0, B:8:0x01c0, B:9:0x01c3, B:12:0x0271, B:13:0x0281, B:15:0x030f, B:17:0x0317, B:19:0x0324, B:22:0x0332, B:23:0x03ab, B:25:0x0405, B:32:0x0423, B:45:0x0472, B:49:0x0481, B:51:0x048c, B:53:0x04a9, B:54:0x057d, B:56:0x05de, B:58:0x05e9, B:60:0x05fb, B:62:0x0602, B:64:0x060c, B:66:0x0614, B:68:0x061e, B:70:0x0631, B:72:0x063b, B:74:0x064c, B:75:0x0695, B:77:0x06c5, B:79:0x0717, B:80:0x0778, B:85:0x0b55, B:87:0x0b66, B:89:0x0b78, B:95:0x0ba9, B:99:0x0bac, B:101:0x0be0, B:105:0x0c0e, B:107:0x0c1d, B:109:0x0c32, B:111:0x0cea, B:113:0x0cf1, B:115:0x0d07, B:117:0x0d0e, B:119:0x0d21, B:121:0x0d28, B:123:0x0d3b, B:125:0x0d4a, B:127:0x0d67, B:129:0x0d6e, B:132:0x0df6, B:134:0x0e01, B:136:0x0e08, B:137:0x0e10, B:138:0x0e17, B:140:0x0fcf, B:142:0x0fdc, B:144:0x0fe9, B:146:0x0ffe, B:150:0x1008, B:152:0x1015, B:154:0x1022, B:155:0x1039, B:157:0x1046, B:159:0x1053, B:160:0x106a, B:162:0x1077, B:164:0x1085, B:165:0x108d, B:167:0x0beb, B:168:0x0b70, B:171:0x0723, B:173:0x0654, B:175:0x0666, B:177:0x0679, B:179:0x0683, B:183:0x04be, B:185:0x04c9, B:191:0x0507, B:193:0x0512, B:198:0x0548, B:200:0x0553, B:202:0x0433, B:206:0x0443, B:210:0x033b, B:212:0x0346, B:214:0x034e, B:216:0x035b, B:220:0x036d, B:221:0x0376, B:223:0x0381, B:225:0x0389, B:227:0x0396), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0fcf A[Catch: Exception -> 0x10a3, TryCatch #2 {Exception -> 0x10a3, blocks: (B:3:0x0005, B:5:0x019c, B:7:0x01a7, B:8:0x01c0, B:8:0x01c0, B:9:0x01c3, B:12:0x0271, B:13:0x0281, B:15:0x030f, B:17:0x0317, B:19:0x0324, B:22:0x0332, B:23:0x03ab, B:25:0x0405, B:32:0x0423, B:45:0x0472, B:49:0x0481, B:51:0x048c, B:53:0x04a9, B:54:0x057d, B:56:0x05de, B:58:0x05e9, B:60:0x05fb, B:62:0x0602, B:64:0x060c, B:66:0x0614, B:68:0x061e, B:70:0x0631, B:72:0x063b, B:74:0x064c, B:75:0x0695, B:77:0x06c5, B:79:0x0717, B:80:0x0778, B:85:0x0b55, B:87:0x0b66, B:89:0x0b78, B:95:0x0ba9, B:99:0x0bac, B:101:0x0be0, B:105:0x0c0e, B:107:0x0c1d, B:109:0x0c32, B:111:0x0cea, B:113:0x0cf1, B:115:0x0d07, B:117:0x0d0e, B:119:0x0d21, B:121:0x0d28, B:123:0x0d3b, B:125:0x0d4a, B:127:0x0d67, B:129:0x0d6e, B:132:0x0df6, B:134:0x0e01, B:136:0x0e08, B:137:0x0e10, B:138:0x0e17, B:140:0x0fcf, B:142:0x0fdc, B:144:0x0fe9, B:146:0x0ffe, B:150:0x1008, B:152:0x1015, B:154:0x1022, B:155:0x1039, B:157:0x1046, B:159:0x1053, B:160:0x106a, B:162:0x1077, B:164:0x1085, B:165:0x108d, B:167:0x0beb, B:168:0x0b70, B:171:0x0723, B:173:0x0654, B:175:0x0666, B:177:0x0679, B:179:0x0683, B:183:0x04be, B:185:0x04c9, B:191:0x0507, B:193:0x0512, B:198:0x0548, B:200:0x0553, B:202:0x0433, B:206:0x0443, B:210:0x033b, B:212:0x0346, B:214:0x034e, B:216:0x035b, B:220:0x036d, B:221:0x0376, B:223:0x0381, B:225:0x0389, B:227:0x0396), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x10a2 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0b70 A[Catch: Exception -> 0x10a3, TRY_ENTER, TryCatch #2 {Exception -> 0x10a3, blocks: (B:3:0x0005, B:5:0x019c, B:7:0x01a7, B:8:0x01c0, B:8:0x01c0, B:9:0x01c3, B:12:0x0271, B:13:0x0281, B:15:0x030f, B:17:0x0317, B:19:0x0324, B:22:0x0332, B:23:0x03ab, B:25:0x0405, B:32:0x0423, B:45:0x0472, B:49:0x0481, B:51:0x048c, B:53:0x04a9, B:54:0x057d, B:56:0x05de, B:58:0x05e9, B:60:0x05fb, B:62:0x0602, B:64:0x060c, B:66:0x0614, B:68:0x061e, B:70:0x0631, B:72:0x063b, B:74:0x064c, B:75:0x0695, B:77:0x06c5, B:79:0x0717, B:80:0x0778, B:85:0x0b55, B:87:0x0b66, B:89:0x0b78, B:95:0x0ba9, B:99:0x0bac, B:101:0x0be0, B:105:0x0c0e, B:107:0x0c1d, B:109:0x0c32, B:111:0x0cea, B:113:0x0cf1, B:115:0x0d07, B:117:0x0d0e, B:119:0x0d21, B:121:0x0d28, B:123:0x0d3b, B:125:0x0d4a, B:127:0x0d67, B:129:0x0d6e, B:132:0x0df6, B:134:0x0e01, B:136:0x0e08, B:137:0x0e10, B:138:0x0e17, B:140:0x0fcf, B:142:0x0fdc, B:144:0x0fe9, B:146:0x0ffe, B:150:0x1008, B:152:0x1015, B:154:0x1022, B:155:0x1039, B:157:0x1046, B:159:0x1053, B:160:0x106a, B:162:0x1077, B:164:0x1085, B:165:0x108d, B:167:0x0beb, B:168:0x0b70, B:171:0x0723, B:173:0x0654, B:175:0x0666, B:177:0x0679, B:179:0x0683, B:183:0x04be, B:185:0x04c9, B:191:0x0507, B:193:0x0512, B:198:0x0548, B:200:0x0553, B:202:0x0433, B:206:0x0443, B:210:0x033b, B:212:0x0346, B:214:0x034e, B:216:0x035b, B:220:0x036d, B:221:0x0376, B:223:0x0381, B:225:0x0389, B:227:0x0396), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0723 A[Catch: Exception -> 0x10a3, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x10a3, blocks: (B:3:0x0005, B:5:0x019c, B:7:0x01a7, B:8:0x01c0, B:8:0x01c0, B:9:0x01c3, B:12:0x0271, B:13:0x0281, B:15:0x030f, B:17:0x0317, B:19:0x0324, B:22:0x0332, B:23:0x03ab, B:25:0x0405, B:32:0x0423, B:45:0x0472, B:49:0x0481, B:51:0x048c, B:53:0x04a9, B:54:0x057d, B:56:0x05de, B:58:0x05e9, B:60:0x05fb, B:62:0x0602, B:64:0x060c, B:66:0x0614, B:68:0x061e, B:70:0x0631, B:72:0x063b, B:74:0x064c, B:75:0x0695, B:77:0x06c5, B:79:0x0717, B:80:0x0778, B:85:0x0b55, B:87:0x0b66, B:89:0x0b78, B:95:0x0ba9, B:99:0x0bac, B:101:0x0be0, B:105:0x0c0e, B:107:0x0c1d, B:109:0x0c32, B:111:0x0cea, B:113:0x0cf1, B:115:0x0d07, B:117:0x0d0e, B:119:0x0d21, B:121:0x0d28, B:123:0x0d3b, B:125:0x0d4a, B:127:0x0d67, B:129:0x0d6e, B:132:0x0df6, B:134:0x0e01, B:136:0x0e08, B:137:0x0e10, B:138:0x0e17, B:140:0x0fcf, B:142:0x0fdc, B:144:0x0fe9, B:146:0x0ffe, B:150:0x1008, B:152:0x1015, B:154:0x1022, B:155:0x1039, B:157:0x1046, B:159:0x1053, B:160:0x106a, B:162:0x1077, B:164:0x1085, B:165:0x108d, B:167:0x0beb, B:168:0x0b70, B:171:0x0723, B:173:0x0654, B:175:0x0666, B:177:0x0679, B:179:0x0683, B:183:0x04be, B:185:0x04c9, B:191:0x0507, B:193:0x0512, B:198:0x0548, B:200:0x0553, B:202:0x0433, B:206:0x0443, B:210:0x033b, B:212:0x0346, B:214:0x034e, B:216:0x035b, B:220:0x036d, B:221:0x0376, B:223:0x0381, B:225:0x0389, B:227:0x0396), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0666 A[Catch: Exception -> 0x10a3, TRY_ENTER, TryCatch #2 {Exception -> 0x10a3, blocks: (B:3:0x0005, B:5:0x019c, B:7:0x01a7, B:8:0x01c0, B:8:0x01c0, B:9:0x01c3, B:12:0x0271, B:13:0x0281, B:15:0x030f, B:17:0x0317, B:19:0x0324, B:22:0x0332, B:23:0x03ab, B:25:0x0405, B:32:0x0423, B:45:0x0472, B:49:0x0481, B:51:0x048c, B:53:0x04a9, B:54:0x057d, B:56:0x05de, B:58:0x05e9, B:60:0x05fb, B:62:0x0602, B:64:0x060c, B:66:0x0614, B:68:0x061e, B:70:0x0631, B:72:0x063b, B:74:0x064c, B:75:0x0695, B:77:0x06c5, B:79:0x0717, B:80:0x0778, B:85:0x0b55, B:87:0x0b66, B:89:0x0b78, B:95:0x0ba9, B:99:0x0bac, B:101:0x0be0, B:105:0x0c0e, B:107:0x0c1d, B:109:0x0c32, B:111:0x0cea, B:113:0x0cf1, B:115:0x0d07, B:117:0x0d0e, B:119:0x0d21, B:121:0x0d28, B:123:0x0d3b, B:125:0x0d4a, B:127:0x0d67, B:129:0x0d6e, B:132:0x0df6, B:134:0x0e01, B:136:0x0e08, B:137:0x0e10, B:138:0x0e17, B:140:0x0fcf, B:142:0x0fdc, B:144:0x0fe9, B:146:0x0ffe, B:150:0x1008, B:152:0x1015, B:154:0x1022, B:155:0x1039, B:157:0x1046, B:159:0x1053, B:160:0x106a, B:162:0x1077, B:164:0x1085, B:165:0x108d, B:167:0x0beb, B:168:0x0b70, B:171:0x0723, B:173:0x0654, B:175:0x0666, B:177:0x0679, B:179:0x0683, B:183:0x04be, B:185:0x04c9, B:191:0x0507, B:193:0x0512, B:198:0x0548, B:200:0x0553, B:202:0x0433, B:206:0x0443, B:210:0x033b, B:212:0x0346, B:214:0x034e, B:216:0x035b, B:220:0x036d, B:221:0x0376, B:223:0x0381, B:225:0x0389, B:227:0x0396), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0683 A[Catch: Exception -> 0x10a3, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x10a3, blocks: (B:3:0x0005, B:5:0x019c, B:7:0x01a7, B:8:0x01c0, B:8:0x01c0, B:9:0x01c3, B:12:0x0271, B:13:0x0281, B:15:0x030f, B:17:0x0317, B:19:0x0324, B:22:0x0332, B:23:0x03ab, B:25:0x0405, B:32:0x0423, B:45:0x0472, B:49:0x0481, B:51:0x048c, B:53:0x04a9, B:54:0x057d, B:56:0x05de, B:58:0x05e9, B:60:0x05fb, B:62:0x0602, B:64:0x060c, B:66:0x0614, B:68:0x061e, B:70:0x0631, B:72:0x063b, B:74:0x064c, B:75:0x0695, B:77:0x06c5, B:79:0x0717, B:80:0x0778, B:85:0x0b55, B:87:0x0b66, B:89:0x0b78, B:95:0x0ba9, B:99:0x0bac, B:101:0x0be0, B:105:0x0c0e, B:107:0x0c1d, B:109:0x0c32, B:111:0x0cea, B:113:0x0cf1, B:115:0x0d07, B:117:0x0d0e, B:119:0x0d21, B:121:0x0d28, B:123:0x0d3b, B:125:0x0d4a, B:127:0x0d67, B:129:0x0d6e, B:132:0x0df6, B:134:0x0e01, B:136:0x0e08, B:137:0x0e10, B:138:0x0e17, B:140:0x0fcf, B:142:0x0fdc, B:144:0x0fe9, B:146:0x0ffe, B:150:0x1008, B:152:0x1015, B:154:0x1022, B:155:0x1039, B:157:0x1046, B:159:0x1053, B:160:0x106a, B:162:0x1077, B:164:0x1085, B:165:0x108d, B:167:0x0beb, B:168:0x0b70, B:171:0x0723, B:173:0x0654, B:175:0x0666, B:177:0x0679, B:179:0x0683, B:183:0x04be, B:185:0x04c9, B:191:0x0507, B:193:0x0512, B:198:0x0548, B:200:0x0553, B:202:0x0433, B:206:0x0443, B:210:0x033b, B:212:0x0346, B:214:0x034e, B:216:0x035b, B:220:0x036d, B:221:0x0376, B:223:0x0381, B:225:0x0389, B:227:0x0396), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0405 A[Catch: Exception -> 0x10a3, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x10a3, blocks: (B:3:0x0005, B:5:0x019c, B:7:0x01a7, B:8:0x01c0, B:8:0x01c0, B:9:0x01c3, B:12:0x0271, B:13:0x0281, B:15:0x030f, B:17:0x0317, B:19:0x0324, B:22:0x0332, B:23:0x03ab, B:25:0x0405, B:32:0x0423, B:45:0x0472, B:49:0x0481, B:51:0x048c, B:53:0x04a9, B:54:0x057d, B:56:0x05de, B:58:0x05e9, B:60:0x05fb, B:62:0x0602, B:64:0x060c, B:66:0x0614, B:68:0x061e, B:70:0x0631, B:72:0x063b, B:74:0x064c, B:75:0x0695, B:77:0x06c5, B:79:0x0717, B:80:0x0778, B:85:0x0b55, B:87:0x0b66, B:89:0x0b78, B:95:0x0ba9, B:99:0x0bac, B:101:0x0be0, B:105:0x0c0e, B:107:0x0c1d, B:109:0x0c32, B:111:0x0cea, B:113:0x0cf1, B:115:0x0d07, B:117:0x0d0e, B:119:0x0d21, B:121:0x0d28, B:123:0x0d3b, B:125:0x0d4a, B:127:0x0d67, B:129:0x0d6e, B:132:0x0df6, B:134:0x0e01, B:136:0x0e08, B:137:0x0e10, B:138:0x0e17, B:140:0x0fcf, B:142:0x0fdc, B:144:0x0fe9, B:146:0x0ffe, B:150:0x1008, B:152:0x1015, B:154:0x1022, B:155:0x1039, B:157:0x1046, B:159:0x1053, B:160:0x106a, B:162:0x1077, B:164:0x1085, B:165:0x108d, B:167:0x0beb, B:168:0x0b70, B:171:0x0723, B:173:0x0654, B:175:0x0666, B:177:0x0679, B:179:0x0683, B:183:0x04be, B:185:0x04c9, B:191:0x0507, B:193:0x0512, B:198:0x0548, B:200:0x0553, B:202:0x0433, B:206:0x0443, B:210:0x033b, B:212:0x0346, B:214:0x034e, B:216:0x035b, B:220:0x036d, B:221:0x0376, B:223:0x0381, B:225:0x0389, B:227:0x0396), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x06c5 A[Catch: Exception -> 0x10a3, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x10a3, blocks: (B:3:0x0005, B:5:0x019c, B:7:0x01a7, B:8:0x01c0, B:8:0x01c0, B:9:0x01c3, B:12:0x0271, B:13:0x0281, B:15:0x030f, B:17:0x0317, B:19:0x0324, B:22:0x0332, B:23:0x03ab, B:25:0x0405, B:32:0x0423, B:45:0x0472, B:49:0x0481, B:51:0x048c, B:53:0x04a9, B:54:0x057d, B:56:0x05de, B:58:0x05e9, B:60:0x05fb, B:62:0x0602, B:64:0x060c, B:66:0x0614, B:68:0x061e, B:70:0x0631, B:72:0x063b, B:74:0x064c, B:75:0x0695, B:77:0x06c5, B:79:0x0717, B:80:0x0778, B:85:0x0b55, B:87:0x0b66, B:89:0x0b78, B:95:0x0ba9, B:99:0x0bac, B:101:0x0be0, B:105:0x0c0e, B:107:0x0c1d, B:109:0x0c32, B:111:0x0cea, B:113:0x0cf1, B:115:0x0d07, B:117:0x0d0e, B:119:0x0d21, B:121:0x0d28, B:123:0x0d3b, B:125:0x0d4a, B:127:0x0d67, B:129:0x0d6e, B:132:0x0df6, B:134:0x0e01, B:136:0x0e08, B:137:0x0e10, B:138:0x0e17, B:140:0x0fcf, B:142:0x0fdc, B:144:0x0fe9, B:146:0x0ffe, B:150:0x1008, B:152:0x1015, B:154:0x1022, B:155:0x1039, B:157:0x1046, B:159:0x1053, B:160:0x106a, B:162:0x1077, B:164:0x1085, B:165:0x108d, B:167:0x0beb, B:168:0x0b70, B:171:0x0723, B:173:0x0654, B:175:0x0666, B:177:0x0679, B:179:0x0683, B:183:0x04be, B:185:0x04c9, B:191:0x0507, B:193:0x0512, B:198:0x0548, B:200:0x0553, B:202:0x0433, B:206:0x0443, B:210:0x033b, B:212:0x0346, B:214:0x034e, B:216:0x035b, B:220:0x036d, B:221:0x0376, B:223:0x0381, B:225:0x0389, B:227:0x0396), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0b66 A[Catch: Exception -> 0x10a3, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x10a3, blocks: (B:3:0x0005, B:5:0x019c, B:7:0x01a7, B:8:0x01c0, B:8:0x01c0, B:9:0x01c3, B:12:0x0271, B:13:0x0281, B:15:0x030f, B:17:0x0317, B:19:0x0324, B:22:0x0332, B:23:0x03ab, B:25:0x0405, B:32:0x0423, B:45:0x0472, B:49:0x0481, B:51:0x048c, B:53:0x04a9, B:54:0x057d, B:56:0x05de, B:58:0x05e9, B:60:0x05fb, B:62:0x0602, B:64:0x060c, B:66:0x0614, B:68:0x061e, B:70:0x0631, B:72:0x063b, B:74:0x064c, B:75:0x0695, B:77:0x06c5, B:79:0x0717, B:80:0x0778, B:85:0x0b55, B:87:0x0b66, B:89:0x0b78, B:95:0x0ba9, B:99:0x0bac, B:101:0x0be0, B:105:0x0c0e, B:107:0x0c1d, B:109:0x0c32, B:111:0x0cea, B:113:0x0cf1, B:115:0x0d07, B:117:0x0d0e, B:119:0x0d21, B:121:0x0d28, B:123:0x0d3b, B:125:0x0d4a, B:127:0x0d67, B:129:0x0d6e, B:132:0x0df6, B:134:0x0e01, B:136:0x0e08, B:137:0x0e10, B:138:0x0e17, B:140:0x0fcf, B:142:0x0fdc, B:144:0x0fe9, B:146:0x0ffe, B:150:0x1008, B:152:0x1015, B:154:0x1022, B:155:0x1039, B:157:0x1046, B:159:0x1053, B:160:0x106a, B:162:0x1077, B:164:0x1085, B:165:0x108d, B:167:0x0beb, B:168:0x0b70, B:171:0x0723, B:173:0x0654, B:175:0x0666, B:177:0x0679, B:179:0x0683, B:183:0x04be, B:185:0x04c9, B:191:0x0507, B:193:0x0512, B:198:0x0548, B:200:0x0553, B:202:0x0433, B:206:0x0443, B:210:0x033b, B:212:0x0346, B:214:0x034e, B:216:0x035b, B:220:0x036d, B:221:0x0376, B:223:0x0381, B:225:0x0389, B:227:0x0396), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0b86 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: y2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m17769y2() {
        /*
            Method dump skipped, instructions count: 4274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyActivity.m17769y2():void");
    }

    /* renamed from: z2 */
    public boolean m17770z2() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23) {
            Log.v("TAG", "Permission is granted");
            return true;
        }
        if (i10 >= 33) {
            return true;
        }
        if (checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            Log.v("TAG", "Permission is granted");
            return true;
        }
        Log.v("TAG", "Permission is revoked");
        C0936d.m5641r(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 101);
        return false;
    }
}

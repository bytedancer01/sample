package com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities;

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
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Rational;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
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
import butterknife.ButterKnife;
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
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import nf.C6783a;
import org.apache.http.client.config.CookieSpecs;
import p030c0.C0936d;
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
import p235o0.C6845p;
import p290qf.C7920a;
import p402x9.C9691a;
import p428yg.C10014t;
import pf.C7707c;
import pf.C7709e;
import pf.C7711g;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import wf.C9572b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity.class */
public class NSTIJKPlayerSkyActivity extends ActivityC0243b implements SurfaceHolder.Callback, View.OnClickListener {

    /* renamed from: A3 */
    public static SharedPreferences f22732A3;

    /* renamed from: C3 */
    public static String f22734C3;

    /* renamed from: D3 */
    public static String f22735D3;

    /* renamed from: G3 */
    public static ProgressBar f22738G3;

    /* renamed from: z3 */
    public static SharedPreferences f22739z3;

    /* renamed from: A0 */
    public ArrayList<LiveStreamsDBModel> f22741A0;

    /* renamed from: A2 */
    public Boolean f22743A2;

    /* renamed from: B1 */
    public DatabaseHandler f22746B1;

    /* renamed from: B2 */
    public Boolean f22747B2;

    /* renamed from: C0 */
    public ArrayList<LiveStreamCategoryIdDBModel> f22749C0;

    /* renamed from: C1 */
    public SharedPreferences.Editor f22750C1;

    /* renamed from: C2 */
    public Boolean f22751C2;

    /* renamed from: D */
    public int f22752D;

    /* renamed from: D0 */
    public ArrayList<PasswordStatusDBModel> f22753D0;

    /* renamed from: D1 */
    public SharedPreferences.Editor f22754D1;

    /* renamed from: D2 */
    public Boolean f22755D2;

    /* renamed from: E */
    public String f22756E;

    /* renamed from: E0 */
    public SharedPreferences f22757E0;

    /* renamed from: E1 */
    public TextView f22758E1;

    /* renamed from: E2 */
    public Boolean f22759E2;

    /* renamed from: F */
    public String f22760F;

    /* renamed from: F0 */
    public SharedPreferences.Editor f22761F0;

    /* renamed from: F1 */
    public String f22762F1;

    /* renamed from: F2 */
    public Boolean f22763F2;

    /* renamed from: G */
    public String f22764G;

    /* renamed from: G0 */
    public ArrayList<FavouriteDBModel> f22765G0;

    /* renamed from: G1 */
    public TextView f22766G1;

    /* renamed from: G2 */
    public C6783a f22767G2;

    /* renamed from: H */
    public RelativeLayout f22768H;

    /* renamed from: H0 */
    public ArrayList<FavouriteM3UModel> f22769H0;

    /* renamed from: H1 */
    public Handler f22770H1;

    /* renamed from: H2 */
    public Handler f22771H2;

    /* renamed from: I */
    public ListView f22772I;

    /* renamed from: I0 */
    public RecyclerView f22773I0;

    /* renamed from: I1 */
    public Handler f22774I1;

    /* renamed from: I2 */
    public InterfaceC5993u<C5947e> f22775I2;

    /* renamed from: J */
    public ListView f22776J;

    /* renamed from: J0 */
    public ProgressBar f22777J0;

    /* renamed from: J1 */
    public Handler f22778J1;

    /* renamed from: J2 */
    public C5947e f22779J2;

    /* renamed from: K */
    public ArrayList<LiveStreamsDBModel> f22780K;

    /* renamed from: K0 */
    public Toolbar f22781K0;

    /* renamed from: K1 */
    public Handler f22782K1;

    /* renamed from: K2 */
    public C5938b f22783K2;

    /* renamed from: L0 */
    public SearchView f22785L0;

    /* renamed from: L1 */
    public Handler f22786L1;

    /* renamed from: L2 */
    public InterfaceC5950f f22787L2;

    /* renamed from: M0 */
    public TextView f22789M0;

    /* renamed from: M1 */
    public SharedPreferences.Editor f22790M1;

    /* renamed from: M2 */
    public Handler f22791M2;

    /* renamed from: N */
    public String f22792N;

    /* renamed from: N0 */
    public LinearLayout f22793N0;

    /* renamed from: N1 */
    public SharedPreferences.Editor f22794N1;

    /* renamed from: N2 */
    public ArrayList<ExternalPlayerModelClass> f22795N2;

    /* renamed from: O0 */
    public AppBarLayout f22797O0;

    /* renamed from: O1 */
    public SharedPreferences.Editor f22798O1;

    /* renamed from: O2 */
    public int f22799O2;

    /* renamed from: P */
    public LiveStreamDBHandler f22800P;

    /* renamed from: P1 */
    public TextView f22802P1;

    /* renamed from: P2 */
    public String f22803P2;

    /* renamed from: Q */
    public SharedPreferences f22804Q;

    /* renamed from: Q2 */
    public String f22807Q2;

    /* renamed from: R */
    public C5867t f22808R;

    /* renamed from: R2 */
    public Boolean f22811R2;

    /* renamed from: S */
    public SharedPreferences f22812S;

    /* renamed from: S0 */
    public String f22813S0;

    /* renamed from: S1 */
    public LinearLayout f22814S1;

    /* renamed from: S2 */
    public Animation f22815S2;

    /* renamed from: T */
    public SharedPreferences f22816T;

    /* renamed from: T1 */
    public TextView f22818T1;

    /* renamed from: T2 */
    public Animation f22819T2;

    /* renamed from: U */
    public SharedPreferences f22820U;

    /* renamed from: U0 */
    public RelativeLayout f22821U0;

    /* renamed from: U2 */
    public Animation f22823U2;

    /* renamed from: V */
    public SharedPreferences f22824V;

    /* renamed from: V0 */
    public RelativeLayout f22825V0;

    /* renamed from: V1 */
    public Boolean f22826V1;

    /* renamed from: V2 */
    public Animation f22827V2;

    /* renamed from: W */
    public SharedPreferences f22828W;

    /* renamed from: W0 */
    public LinearLayout f22829W0;

    /* renamed from: W1 */
    public Boolean f22830W1;

    /* renamed from: W2 */
    public Animation f22831W2;

    /* renamed from: X */
    public SharedPreferences f22832X;

    /* renamed from: X0 */
    public LinearLayout f22833X0;

    /* renamed from: X1 */
    public Menu f22834X1;

    /* renamed from: X2 */
    public Animation f22835X2;

    /* renamed from: Y */
    public SharedPreferences f22836Y;

    /* renamed from: Y0 */
    public RelativeLayout f22837Y0;

    /* renamed from: Y1 */
    public MenuItem f22838Y1;

    /* renamed from: Y2 */
    public Animation f22839Y2;

    /* renamed from: Z */
    public SharedPreferences f22840Z;

    /* renamed from: Z0 */
    public RelativeLayout f22841Z0;

    /* renamed from: Z1 */
    public DateFormat f22842Z1;

    /* renamed from: Z2 */
    public Animation f22843Z2;

    /* renamed from: a1 */
    public RelativeLayout f22844a1;

    /* renamed from: a2 */
    public String f22845a2;

    /* renamed from: a3 */
    public Animation f22846a3;

    /* renamed from: b1 */
    public RelativeLayout f22847b1;

    /* renamed from: b2 */
    public String f22848b2;

    /* renamed from: b3 */
    public String f22849b3;

    /* renamed from: c2 */
    public String f22851c2;

    /* renamed from: c3 */
    public C5864q f22852c3;

    @BindView
    public MediaRouteButton cast_button;

    /* renamed from: d */
    public Context f22853d;

    /* renamed from: d2 */
    public SimpleDateFormat f22855d2;

    /* renamed from: d3 */
    public C5865r f22856d3;

    /* renamed from: e */
    public String f22857e;

    /* renamed from: e1 */
    public TextView f22858e1;

    /* renamed from: e2 */
    public NSTIJKPlayerSky f22859e2;

    /* renamed from: e3 */
    public LinearLayoutManager f22860e3;

    /* renamed from: f */
    public View f22861f;

    /* renamed from: f0 */
    public SimpleDateFormat f22862f0;

    /* renamed from: f1 */
    public TextView f22863f1;

    /* renamed from: f2 */
    public Date f22864f2;

    /* renamed from: f3 */
    public String f22865f3;

    @BindView
    public FrameLayout fl_sub_font_size;

    /* renamed from: g */
    public View f22866g;

    /* renamed from: g0 */
    public String f22867g0;

    /* renamed from: g1 */
    public TextView f22868g1;

    /* renamed from: g2 */
    public String f22869g2;

    /* renamed from: g3 */
    public String f22870g3;

    /* renamed from: h */
    public ImageView f22871h;

    /* renamed from: h0 */
    public RelativeLayout f22872h0;

    /* renamed from: h1 */
    public TextView f22873h1;

    /* renamed from: h2 */
    public Boolean f22874h2;

    /* renamed from: h3 */
    public int f22875h3;

    @BindView
    public TextView header_page_title;

    /* renamed from: i */
    public ImageView f22876i;

    /* renamed from: i1 */
    public String f22878i1;

    /* renamed from: i2 */
    public DialogC0242a f22879i2;

    /* renamed from: i3 */
    public Animation f22880i3;

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
    public View f22881j;

    /* renamed from: j0 */
    public TextView f22882j0;

    /* renamed from: j1 */
    public TextView f22883j1;

    /* renamed from: j2 */
    public String f22884j2;

    /* renamed from: j3 */
    public Animation f22885j3;

    /* renamed from: k */
    public String f22886k;

    /* renamed from: k0 */
    public AppCompatImageView f22887k0;

    /* renamed from: k1 */
    public TextView f22888k1;

    /* renamed from: k2 */
    public Boolean f22889k2;

    /* renamed from: k3 */
    public boolean f22890k3;

    /* renamed from: l */
    public View f22891l;

    /* renamed from: l0 */
    public AppCompatImageView f22892l0;

    /* renamed from: l1 */
    public TextView f22893l1;

    /* renamed from: l2 */
    public C9572b f22894l2;

    /* renamed from: l3 */
    public boolean f22895l3;

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
    public View f22896m;

    /* renamed from: m0 */
    public ArrayList<LiveStreamCategoryIdDBModel> f22897m0;

    /* renamed from: m1 */
    public TextView f22898m1;

    /* renamed from: m2 */
    public String f22899m2;

    /* renamed from: m3 */
    public PictureInPictureParams$Builder f22900m3;

    /* renamed from: n0 */
    public ArrayList<LiveStreamCategoryIdDBModel> f22902n0;

    /* renamed from: n1 */
    public TextView f22903n1;

    /* renamed from: n2 */
    public int f22904n2;

    /* renamed from: n3 */
    public BroadcastReceiver f22905n3;

    @BindView
    public TextView no_audio_track;

    @BindView
    public TextView no_subtitle_track;

    @BindView
    public TextView no_video_track;

    /* renamed from: o */
    public LinearLayout f22906o;

    /* renamed from: o0 */
    public ArrayList<LiveStreamCategoryIdDBModel> f22907o0;

    /* renamed from: o1 */
    public TextView f22908o1;

    /* renamed from: o2 */
    public int f22909o2;

    /* renamed from: o3 */
    public String f22910o3;

    /* renamed from: p */
    public TextView f22911p;

    /* renamed from: p0 */
    public ArrayList<LiveStreamCategoryIdDBModel> f22912p0;

    /* renamed from: p1 */
    public TextView f22913p1;

    /* renamed from: p2 */
    public String f22914p2;

    /* renamed from: p3 */
    public String f22915p3;

    /* renamed from: q */
    public ImageView f22916q;

    /* renamed from: q0 */
    public ArrayList<LiveStreamCategoryIdDBModel> f22917q0;

    /* renamed from: q1 */
    public TextView f22918q1;

    /* renamed from: q2 */
    public Boolean f22919q2;

    /* renamed from: q3 */
    public String f22920q3;

    /* renamed from: r */
    public TextView f22921r;

    /* renamed from: r0 */
    public ArrayList<LiveStreamsDBModel> f22922r0;

    /* renamed from: r1 */
    public LinearLayout f22923r1;

    /* renamed from: r2 */
    public AsyncTask f22924r2;

    /* renamed from: r3 */
    public boolean f22925r3;

    @BindView
    public RecyclerView recycler_view_left_sidebar;

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
    public TextView f22926s;

    /* renamed from: s0 */
    public ArrayList<LiveStreamsDBModel> f22927s0;

    /* renamed from: s1 */
    public String f22928s1;

    /* renamed from: s2 */
    public AsyncTask f22929s2;

    /* renamed from: s3 */
    public String f22930s3;

    @BindView
    public SeekBar sb_brightness;

    @BindView
    public SeekBar sb_volume;

    /* renamed from: t */
    public TextView f22931t;

    /* renamed from: t0 */
    public ArrayList<LiveStreamsDBModel> f22932t0;

    /* renamed from: t1 */
    public LinearLayout f22933t1;

    /* renamed from: t2 */
    public AsyncTask f22934t2;

    /* renamed from: t3 */
    public SharedPreferences f22935t3;

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
    public TextView tv_sub_font_size;

    @BindView
    public TextView tv_volume;

    /* renamed from: u */
    public TextView f22936u;

    /* renamed from: u0 */
    public ArrayList<LiveStreamsDBModel> f22937u0;

    /* renamed from: u1 */
    public LinearLayout f22938u1;

    /* renamed from: u2 */
    public boolean f22939u2;

    /* renamed from: u3 */
    public boolean f22940u3;

    /* renamed from: v */
    public LinearLayout f22941v;

    /* renamed from: v0 */
    public ArrayList<LiveStreamsDBModel> f22942v0;

    /* renamed from: v1 */
    public LinearLayout f22943v1;

    /* renamed from: v2 */
    public int f22944v2;

    /* renamed from: v3 */
    public MultiUserDBHandler f22945v3;

    /* renamed from: w */
    public ProgressBar f22946w;

    /* renamed from: w0 */
    public ArrayList<LiveStreamsDBModel> f22947w0;

    /* renamed from: w1 */
    public LinearLayout f22948w1;

    /* renamed from: w2 */
    public boolean f22949w2;

    /* renamed from: w3 */
    public String f22950w3;

    /* renamed from: x */
    public ProgressBar f22951x;

    /* renamed from: x0 */
    public ArrayList<LiveStreamsDBModel> f22952x0;

    /* renamed from: x1 */
    public LinearLayout f22953x1;

    /* renamed from: x2 */
    public int f22954x2;

    /* renamed from: x3 */
    public Thread f22955x3;

    /* renamed from: y */
    public LinearLayout f22956y;

    /* renamed from: y0 */
    public ArrayList<LiveStreamsDBModel> f22957y0;

    /* renamed from: y1 */
    public String f22958y1;

    /* renamed from: y2 */
    public int f22959y2;

    /* renamed from: y3 */
    public NSTIJKPlayerSky.AbstractC3970w f22960y3;

    /* renamed from: z0 */
    public ArrayList<LiveStreamsDBModel> f22962z0;

    /* renamed from: z1 */
    public int f22963z1;

    /* renamed from: z2 */
    public SharedPreferences f22964z2;

    /* renamed from: B3 */
    public static boolean f22733B3 = false;

    /* renamed from: E3 */
    public static final int[] f22736E3 = {0, 1, 2, 3, 4, 5};

    /* renamed from: F3 */
    public static boolean f22737F3 = false;

    /* renamed from: n */
    public boolean f22901n = false;

    /* renamed from: z */
    public boolean f22961z = true;

    /* renamed from: A */
    public boolean f22740A = false;

    /* renamed from: B */
    public boolean f22744B = false;

    /* renamed from: C */
    public boolean f22748C = false;

    /* renamed from: L */
    public boolean f22784L = true;

    /* renamed from: M */
    public long f22788M = 2500;

    /* renamed from: O */
    public boolean f22796O = true;

    /* renamed from: i0 */
    public int f22877i0 = 0;

    /* renamed from: B0 */
    public ArrayList<String> f22745B0 = new ArrayList<>();

    /* renamed from: P0 */
    public boolean f22801P0 = true;

    /* renamed from: Q0 */
    public boolean f22805Q0 = false;

    /* renamed from: R0 */
    public boolean f22809R0 = false;

    /* renamed from: T0 */
    public boolean f22817T0 = true;

    /* renamed from: c1 */
    public String f22850c1 = "";

    /* renamed from: d1 */
    public String f22854d1 = "";

    /* renamed from: A1 */
    public String f22742A1 = "";

    /* renamed from: Q1 */
    public int f22806Q1 = 0;

    /* renamed from: R1 */
    public StringBuilder f22810R1 = new StringBuilder();

    /* renamed from: U1 */
    public int f22822U1 = -1;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$a.class */
    public class C3763a implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        public final NSTIJKPlayerSkyActivity f22965b;

        public C3763a(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity) {
            this.f22965b = nSTIJKPlayerSkyActivity;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity;
            AsyncTask<String, Void, HashMap<String, ArrayList<String>>> execute;
            if (this.f22965b.f22934t2 != null && this.f22965b.f22934t2.getStatus().equals(AsyncTask.Status.RUNNING)) {
                this.f22965b.f22934t2.cancel(true);
            }
            ArrayList<LiveStreamsDBModel> m28615e = this.f22965b.f22808R.m28615e();
            if (m28615e != null && m28615e.size() > 0) {
                String m14798E = m28615e.get(i10).m14798E();
                this.f22965b.f22778J1.removeCallbacksAndMessages(null);
                nSTIJKPlayerSkyActivity = this.f22965b;
                execute = new AsyncTaskC3772e0(this.f22965b, m14798E, null).execute(new String[0]);
            } else {
                if (this.f22965b.f22932t0 == null || this.f22965b.f22932t0.size() <= 0) {
                    return;
                }
                String m14798E2 = ((LiveStreamsDBModel) this.f22965b.f22932t0.get(i10)).m14798E();
                this.f22965b.f22778J1.removeCallbacksAndMessages(null);
                nSTIJKPlayerSkyActivity = this.f22965b;
                execute = new AsyncTaskC3772e0(this.f22965b, m14798E2, null).execute(new String[0]);
            }
            nSTIJKPlayerSkyActivity.f22934t2 = execute;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$a0.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$a0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$a0.class */
    public class AsyncTaskC3764a0 extends AsyncTask<String, Void, Boolean> {

        /* renamed from: a */
        public final NSTIJKPlayerSkyActivity f22966a;

        public AsyncTaskC3764a0(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity) {
            this.f22966a = nSTIJKPlayerSkyActivity;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return Boolean.valueOf(this.f22966a.m18427h2());
            } catch (Exception e10) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (this.f22966a.f22859e2 != null) {
                this.f22966a.f22859e2.setEPGHandler(this.f22966a.f22782K1);
                this.f22966a.f22859e2.setContext(this.f22966a.f22853d);
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$b.class */
    public class C3765b implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        public final ArrayList f22967b;

        /* renamed from: c */
        public final NSTIJKPlayerSkyActivity f22968c;

        public C3765b(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity, ArrayList arrayList) {
            this.f22968c = nSTIJKPlayerSkyActivity;
            this.f22967b = arrayList;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity;
            try {
                if (this.f22968c.f22934t2 != null && this.f22968c.f22934t2.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    this.f22968c.f22934t2.cancel(true);
                }
                C5251a.f30008G = Boolean.TRUE;
                ArrayList<LiveStreamsDBModel> m28615e = this.f22968c.f22808R.m28615e();
                if (m28615e == null || m28615e.size() <= 0) {
                    if (this.f22968c.f22932t0 == null || this.f22968c.f22932t0.size() <= 0) {
                        return;
                    }
                    C5255e.m26215R(((LiveStreamsDBModel) this.f22968c.f22932t0.get(i10)).m14805L());
                    String m14798E = ((LiveStreamsDBModel) this.f22968c.f22932t0.get(i10)).m14798E();
                    String m14810Q = ((LiveStreamsDBModel) this.f22968c.f22932t0.get(i10)).m14810Q();
                    String m14816W = ((LiveStreamsDBModel) this.f22968c.f22932t0.get(i10)).m14816W();
                    if (this.f22968c.f22848b2.equals("m3u")) {
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity2 = this.f22968c;
                        if (!nSTIJKPlayerSkyActivity2.f22742A1.equals(((LiveStreamsDBModel) nSTIJKPlayerSkyActivity2.f22932t0.get(i10)).m14816W())) {
                            this.f22968c.f22859e2.setCurrentWindowIndex(i10);
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity3 = this.f22968c;
                            nSTIJKPlayerSkyActivity3.f22799O2 = C5255e.m26215R(((LiveStreamsDBModel) nSTIJKPlayerSkyActivity3.f22932t0.get(i10)).m14805L());
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity4 = this.f22968c;
                            nSTIJKPlayerSkyActivity4.f22803P2 = ((LiveStreamsDBModel) nSTIJKPlayerSkyActivity4.f22932t0.get(i10)).m14827g();
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity5 = this.f22968c;
                            nSTIJKPlayerSkyActivity5.f22950w3 = nSTIJKPlayerSkyActivity5.f22850c1;
                            if (nSTIJKPlayerSkyActivity5.f22952x0 != null) {
                                this.f22968c.f22952x0.clear();
                                this.f22968c.f22952x0.addAll(this.f22967b);
                            }
                            this.f22968c.f22859e2.setTitle(((LiveStreamsDBModel) this.f22968c.f22932t0.get(i10)).m14805L() + " - " + ((LiveStreamsDBModel) this.f22968c.f22932t0.get(i10)).getName());
                            this.f22968c.f22915p3 = ((LiveStreamsDBModel) this.f22968c.f22932t0.get(i10)).m14805L() + " - " + ((LiveStreamsDBModel) this.f22968c.f22932t0.get(i10)).getName();
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity6 = this.f22968c;
                            nSTIJKPlayerSkyActivity6.f22742A1 = ((LiveStreamsDBModel) nSTIJKPlayerSkyActivity6.f22932t0.get(i10)).m14816W();
                            C7920a.m34301l().m34317z(this.f22968c.f22742A1);
                            if (!this.f22968c.f22850c1.equals("-1") && !this.f22968c.f22850c1.equals("0") && !this.f22968c.f22850c1.equals("-6")) {
                                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity7 = this.f22968c;
                                nSTIJKPlayerSkyActivity7.f22850c1 = ((LiveStreamsDBModel) nSTIJKPlayerSkyActivity7.f22932t0.get(i10)).m14827g();
                                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity8 = this.f22968c;
                                nSTIJKPlayerSkyActivity8.f22854d1 = ((LiveStreamsDBModel) nSTIJKPlayerSkyActivity8.f22932t0.get(i10)).m14830i();
                                if (this.f22968c.f22854d1.isEmpty()) {
                                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity9 = this.f22968c;
                                    nSTIJKPlayerSkyActivity9.f22854d1 = nSTIJKPlayerSkyActivity9.m18399I1(nSTIJKPlayerSkyActivity9.f22850c1);
                                }
                            }
                            this.f22968c.f22806Q1 = i10;
                            this.f22968c.f22859e2.m19346X0();
                            if (this.f22968c.f22889k2.booleanValue()) {
                                this.f22968c.f22859e2.m19352d1(Uri.parse(m14816W), NSTIJKPlayerSkyActivity.f22733B3, ((LiveStreamsDBModel) this.f22968c.f22932t0.get(i10)).getName());
                                this.f22968c.f22910o3 = String.valueOf(Uri.parse(m14816W));
                                this.f22968c.f22859e2.f24285I = 0;
                                this.f22968c.f22859e2.f24291K = false;
                                this.f22968c.f22859e2.start();
                            }
                            this.f22968c.f22782K1.removeCallbacksAndMessages(null);
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity10 = this.f22968c;
                            nSTIJKPlayerSkyActivity10.f22760F = m14798E;
                            nSTIJKPlayerSkyActivity10.f22764G = m14810Q;
                            nSTIJKPlayerSkyActivity10.f22920q3 = m14810Q;
                            this.f22968c.f22859e2.setCurrentEpgChannelID(this.f22968c.f22760F);
                            this.f22968c.f22859e2.setCurrentChannelLogo(this.f22968c.f22764G);
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity11 = this.f22968c;
                            nSTIJKPlayerSkyActivity11.m18405L2(nSTIJKPlayerSkyActivity11.f22764G);
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity12 = this.f22968c;
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity13 = this.f22968c;
                            nSTIJKPlayerSkyActivity12.f22934t2 = new AsyncTaskC3772e0(nSTIJKPlayerSkyActivity13, nSTIJKPlayerSkyActivity13.f22760F, null).execute(new String[0]);
                            this.f22968c.f22778J1.removeCallbacksAndMessages(null);
                            if (this.f22968c.f22750C1 != null) {
                                this.f22968c.f22750C1.putString("currentlyPlayingVideo", String.valueOf(((LiveStreamsDBModel) this.f22968c.f22932t0.get(i10)).m14811R()));
                                this.f22968c.f22750C1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(((LiveStreamsDBModel) this.f22968c.f22932t0.get(i10)).m14816W()));
                                this.f22968c.f22750C1.apply();
                            }
                            if (this.f22968c.f22754D1 != null) {
                                this.f22968c.f22754D1.putInt("currentlyPlayingVideoPosition", i10);
                                this.f22968c.f22754D1.apply();
                            }
                            nSTIJKPlayerSkyActivity = this.f22968c;
                            nSTIJKPlayerSkyActivity.f22808R.notifyDataSetChanged();
                            return;
                        }
                        this.f22968c.m18410P1(true);
                    }
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity14 = this.f22968c;
                    if (nSTIJKPlayerSkyActivity14.f22963z1 != C5255e.m26214Q(((LiveStreamsDBModel) nSTIJKPlayerSkyActivity14.f22932t0.get(i10)).m14811R())) {
                        this.f22968c.f22859e2.setCurrentWindowIndex(i10);
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity15 = this.f22968c;
                        nSTIJKPlayerSkyActivity15.f22799O2 = C5255e.m26215R(((LiveStreamsDBModel) nSTIJKPlayerSkyActivity15.f22932t0.get(i10)).m14805L());
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity16 = this.f22968c;
                        nSTIJKPlayerSkyActivity16.f22803P2 = ((LiveStreamsDBModel) nSTIJKPlayerSkyActivity16.f22932t0.get(i10)).m14827g();
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity17 = this.f22968c;
                        nSTIJKPlayerSkyActivity17.f22950w3 = nSTIJKPlayerSkyActivity17.f22850c1;
                        if (nSTIJKPlayerSkyActivity17.f22952x0 != null) {
                            this.f22968c.f22952x0.clear();
                            this.f22968c.f22952x0.addAll(this.f22967b);
                        }
                        this.f22968c.f22859e2.setTitle(((LiveStreamsDBModel) this.f22968c.f22932t0.get(i10)).m14805L() + " - " + ((LiveStreamsDBModel) this.f22968c.f22932t0.get(i10)).getName());
                        this.f22968c.f22915p3 = ((LiveStreamsDBModel) this.f22968c.f22932t0.get(i10)).m14805L() + " - " + ((LiveStreamsDBModel) this.f22968c.f22932t0.get(i10)).getName();
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity18 = this.f22968c;
                        nSTIJKPlayerSkyActivity18.f22963z1 = C5255e.m26214Q(((LiveStreamsDBModel) nSTIJKPlayerSkyActivity18.f22932t0.get(i10)).m14811R());
                        C7920a.m34301l().m34317z(String.valueOf(this.f22968c.f22963z1));
                        if (!this.f22968c.f22850c1.equals("-1") && !this.f22968c.f22850c1.equals("0") && !this.f22968c.f22850c1.equals("-6")) {
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity19 = this.f22968c;
                            nSTIJKPlayerSkyActivity19.f22850c1 = ((LiveStreamsDBModel) nSTIJKPlayerSkyActivity19.f22932t0.get(i10)).m14827g();
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity20 = this.f22968c;
                            nSTIJKPlayerSkyActivity20.f22854d1 = ((LiveStreamsDBModel) nSTIJKPlayerSkyActivity20.f22932t0.get(i10)).m14830i();
                            if (this.f22968c.f22854d1.isEmpty()) {
                                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity21 = this.f22968c;
                                nSTIJKPlayerSkyActivity21.f22854d1 = nSTIJKPlayerSkyActivity21.m18399I1(nSTIJKPlayerSkyActivity21.f22850c1);
                            }
                        }
                        this.f22968c.f22806Q1 = i10;
                        this.f22968c.f22859e2.m19346X0();
                        if (this.f22968c.f22889k2.booleanValue()) {
                            this.f22968c.f22859e2.m19352d1(Uri.parse(this.f22968c.f22857e + C5255e.m26214Q(((LiveStreamsDBModel) this.f22968c.f22932t0.get(i10)).m14811R()) + this.f22968c.f22867g0), NSTIJKPlayerSkyActivity.f22733B3, ((LiveStreamsDBModel) this.f22968c.f22932t0.get(i10)).getName());
                            this.f22968c.f22910o3 = String.valueOf(Uri.parse(this.f22968c.f22857e + C5255e.m26214Q(((LiveStreamsDBModel) this.f22968c.f22932t0.get(i10)).m14811R()) + ".m3u8"));
                            this.f22968c.f22859e2.f24285I = 0;
                            this.f22968c.f22859e2.f24291K = false;
                            this.f22968c.f22859e2.start();
                        }
                        this.f22968c.f22782K1.removeCallbacksAndMessages(null);
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity22 = this.f22968c;
                        nSTIJKPlayerSkyActivity22.f22760F = m14798E;
                        nSTIJKPlayerSkyActivity22.f22764G = m14810Q;
                        nSTIJKPlayerSkyActivity22.f22920q3 = m14810Q;
                        this.f22968c.f22859e2.setCurrentEpgChannelID(this.f22968c.f22760F);
                        this.f22968c.f22859e2.setCurrentChannelLogo(this.f22968c.f22764G);
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity23 = this.f22968c;
                        nSTIJKPlayerSkyActivity23.m18405L2(nSTIJKPlayerSkyActivity23.f22764G);
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity24 = this.f22968c;
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity25 = this.f22968c;
                        nSTIJKPlayerSkyActivity24.f22934t2 = new AsyncTaskC3772e0(nSTIJKPlayerSkyActivity25, nSTIJKPlayerSkyActivity25.f22760F, null).execute(new String[0]);
                        this.f22968c.f22778J1.removeCallbacksAndMessages(null);
                        if (this.f22968c.f22750C1 != null) {
                            this.f22968c.f22750C1.putString("currentlyPlayingVideo", String.valueOf(((LiveStreamsDBModel) this.f22968c.f22932t0.get(i10)).m14811R()));
                            this.f22968c.f22750C1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(((LiveStreamsDBModel) this.f22968c.f22932t0.get(i10)).m14816W()));
                            this.f22968c.f22750C1.apply();
                        }
                        if (this.f22968c.f22754D1 != null) {
                            this.f22968c.f22754D1.putInt("currentlyPlayingVideoPosition", i10);
                            this.f22968c.f22754D1.apply();
                        }
                        nSTIJKPlayerSkyActivity = this.f22968c;
                        nSTIJKPlayerSkyActivity.f22808R.notifyDataSetChanged();
                        return;
                    }
                    this.f22968c.m18410P1(true);
                }
                int m26215R = C5255e.m26215R(m28615e.get(i10).m14805L());
                String m14798E2 = m28615e.get(i10).m14798E();
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity26 = this.f22968c;
                nSTIJKPlayerSkyActivity26.m18414U1(nSTIJKPlayerSkyActivity26.f22932t0, m26215R);
                String m14816W2 = m28615e.get(i10).m14816W();
                if (this.f22968c.f22848b2.equals("m3u")) {
                    if (!this.f22968c.f22742A1.equals(m28615e.get(i10).m14816W())) {
                        this.f22968c.f22859e2.setCurrentWindowIndex(i10);
                        this.f22968c.f22799O2 = C5255e.m26215R(m28615e.get(i10).m14805L());
                        this.f22968c.f22803P2 = m28615e.get(i10).m14827g();
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity27 = this.f22968c;
                        nSTIJKPlayerSkyActivity27.f22950w3 = nSTIJKPlayerSkyActivity27.f22850c1;
                        if (nSTIJKPlayerSkyActivity27.f22952x0 != null) {
                            this.f22968c.f22952x0.clear();
                            this.f22968c.f22952x0.addAll(this.f22967b);
                        }
                        this.f22968c.f22859e2.setTitle(m28615e.get(i10).m14805L() + " - " + m28615e.get(i10).getName());
                        this.f22968c.f22915p3 = m28615e.get(i10).m14805L() + " - " + m28615e.get(i10).getName();
                        this.f22968c.f22742A1 = m28615e.get(i10).m14816W();
                        C7920a.m34301l().m34317z(this.f22968c.f22742A1);
                        if (!this.f22968c.f22850c1.equals("-1") && !this.f22968c.f22850c1.equals("0") && !this.f22968c.f22850c1.equals("-6")) {
                            this.f22968c.f22850c1 = m28615e.get(i10).m14827g();
                            this.f22968c.f22854d1 = m28615e.get(i10).m14830i();
                            if (this.f22968c.f22854d1.isEmpty()) {
                                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity28 = this.f22968c;
                                nSTIJKPlayerSkyActivity28.f22854d1 = nSTIJKPlayerSkyActivity28.m18399I1(nSTIJKPlayerSkyActivity28.f22850c1);
                            }
                        }
                        String m14810Q2 = m28615e.get(i10).m14810Q();
                        try {
                            if (m14810Q2.equals("") || m14810Q2.isEmpty()) {
                                this.f22968c.f22916q.setImageDrawable(this.f22968c.f22853d.getResources().getDrawable(2131231571));
                            } else {
                                C10014t.m42105q(this.f22968c.f22853d).m42116l(m14810Q2).m42154j(2131231571).m42148d(2131231571).m42151g(this.f22968c.f22916q);
                            }
                        } catch (Exception e10) {
                            this.f22968c.f22916q.setImageDrawable(this.f22968c.f22853d.getResources().getDrawable(2131231571));
                        }
                        this.f22968c.f22782K1.removeCallbacksAndMessages(null);
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity29 = this.f22968c;
                        nSTIJKPlayerSkyActivity29.f22760F = m14798E2;
                        nSTIJKPlayerSkyActivity29.f22764G = m14810Q2;
                        nSTIJKPlayerSkyActivity29.f22920q3 = m14810Q2;
                        this.f22968c.f22859e2.setCurrentEpgChannelID(this.f22968c.f22760F);
                        this.f22968c.f22859e2.setCurrentChannelLogo(this.f22968c.f22764G);
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity30 = this.f22968c;
                        nSTIJKPlayerSkyActivity30.m18405L2(nSTIJKPlayerSkyActivity30.f22764G);
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity31 = this.f22968c;
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity32 = this.f22968c;
                        nSTIJKPlayerSkyActivity31.f22934t2 = new AsyncTaskC3772e0(nSTIJKPlayerSkyActivity32, nSTIJKPlayerSkyActivity32.f22760F, null).execute(new String[0]);
                        this.f22968c.f22778J1.removeCallbacksAndMessages(null);
                        this.f22968c.f22806Q1 = i10;
                        this.f22968c.f22859e2.m19346X0();
                        if (this.f22968c.f22889k2.booleanValue()) {
                            this.f22968c.f22859e2.m19352d1(Uri.parse(m14816W2), NSTIJKPlayerSkyActivity.f22733B3, m28615e.get(i10).getName());
                            this.f22968c.f22910o3 = String.valueOf(Uri.parse(m14816W2));
                            this.f22968c.f22859e2.f24285I = 0;
                            this.f22968c.f22859e2.f24291K = false;
                            this.f22968c.f22859e2.start();
                        }
                        if (this.f22968c.f22750C1 != null) {
                            this.f22968c.f22750C1.putString("currentlyPlayingVideo", String.valueOf(m28615e.get(i10).m14811R()));
                            this.f22968c.f22750C1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(m28615e.get(i10).m14816W()));
                            this.f22968c.f22750C1.apply();
                        }
                        if (this.f22968c.f22754D1 != null) {
                            this.f22968c.f22754D1.putInt("currentlyPlayingVideoPosition", i10);
                            this.f22968c.f22754D1.apply();
                        }
                        nSTIJKPlayerSkyActivity = this.f22968c;
                        nSTIJKPlayerSkyActivity.f22808R.notifyDataSetChanged();
                        return;
                    }
                    this.f22968c.m18410P1(true);
                }
                if (this.f22968c.f22963z1 != C5255e.m26214Q(m28615e.get(i10).m14811R())) {
                    this.f22968c.f22859e2.setCurrentWindowIndex(i10);
                    this.f22968c.f22799O2 = C5255e.m26215R(m28615e.get(i10).m14805L());
                    this.f22968c.f22803P2 = m28615e.get(i10).m14827g();
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity33 = this.f22968c;
                    nSTIJKPlayerSkyActivity33.f22950w3 = nSTIJKPlayerSkyActivity33.f22850c1;
                    if (nSTIJKPlayerSkyActivity33.f22952x0 != null) {
                        this.f22968c.f22952x0.clear();
                        this.f22968c.f22952x0.addAll(this.f22967b);
                    }
                    this.f22968c.f22859e2.setTitle(m28615e.get(i10).m14805L() + " - " + m28615e.get(i10).getName());
                    this.f22968c.f22915p3 = m28615e.get(i10).m14805L() + " - " + m28615e.get(i10).getName();
                    this.f22968c.f22963z1 = C5255e.m26214Q(m28615e.get(i10).m14811R());
                    C7920a.m34301l().m34317z(String.valueOf(this.f22968c.f22963z1));
                    if (!this.f22968c.f22850c1.equals("-1") && !this.f22968c.f22850c1.equals("0") && !this.f22968c.f22850c1.equals("-6")) {
                        this.f22968c.f22850c1 = m28615e.get(i10).m14827g();
                        this.f22968c.f22854d1 = m28615e.get(i10).m14830i();
                        if (this.f22968c.f22854d1.isEmpty()) {
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity34 = this.f22968c;
                            nSTIJKPlayerSkyActivity34.f22854d1 = nSTIJKPlayerSkyActivity34.m18399I1(nSTIJKPlayerSkyActivity34.f22850c1);
                        }
                    }
                    String m14810Q3 = m28615e.get(i10).m14810Q();
                    try {
                        if (m14810Q3.equals("") || m14810Q3.isEmpty()) {
                            this.f22968c.f22916q.setImageDrawable(this.f22968c.f22853d.getResources().getDrawable(2131231571));
                        } else {
                            C10014t.m42105q(this.f22968c.f22853d).m42116l(m14810Q3).m42154j(2131231571).m42148d(2131231571).m42151g(this.f22968c.f22916q);
                        }
                    } catch (Exception e11) {
                        try {
                            this.f22968c.f22916q.setImageDrawable(this.f22968c.f22853d.getResources().getDrawable(2131231571));
                        } catch (Exception e12) {
                        }
                    }
                    this.f22968c.f22782K1.removeCallbacksAndMessages(null);
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity35 = this.f22968c;
                    nSTIJKPlayerSkyActivity35.f22760F = m14798E2;
                    nSTIJKPlayerSkyActivity35.f22764G = m14810Q3;
                    nSTIJKPlayerSkyActivity35.f22920q3 = m14810Q3;
                    this.f22968c.f22859e2.setCurrentEpgChannelID(this.f22968c.f22760F);
                    this.f22968c.f22859e2.setCurrentChannelLogo(this.f22968c.f22764G);
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity36 = this.f22968c;
                    nSTIJKPlayerSkyActivity36.m18405L2(nSTIJKPlayerSkyActivity36.f22764G);
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity37 = this.f22968c;
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity38 = this.f22968c;
                    nSTIJKPlayerSkyActivity37.f22934t2 = new AsyncTaskC3772e0(nSTIJKPlayerSkyActivity38, nSTIJKPlayerSkyActivity38.f22760F, null).execute(new String[0]);
                    this.f22968c.f22778J1.removeCallbacksAndMessages(null);
                    this.f22968c.f22806Q1 = i10;
                    this.f22968c.f22859e2.m19346X0();
                    if (this.f22968c.f22889k2.booleanValue()) {
                        this.f22968c.f22859e2.m19352d1(Uri.parse(this.f22968c.f22857e + C5255e.m26214Q(m28615e.get(i10).m14811R()) + this.f22968c.f22867g0), NSTIJKPlayerSkyActivity.f22733B3, m28615e.get(i10).getName());
                        this.f22968c.f22910o3 = String.valueOf(Uri.parse(this.f22968c.f22857e + C5255e.m26214Q(m28615e.get(i10).m14811R()) + ".m3u8"));
                        this.f22968c.f22859e2.f24285I = 0;
                        this.f22968c.f22859e2.f24291K = false;
                        this.f22968c.f22859e2.start();
                    }
                    if (this.f22968c.f22750C1 != null) {
                        this.f22968c.f22750C1.putString("currentlyPlayingVideo", String.valueOf(m28615e.get(i10).m14811R()));
                        this.f22968c.f22750C1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(m28615e.get(i10).m14816W()));
                        this.f22968c.f22750C1.apply();
                    }
                    if (this.f22968c.f22754D1 != null) {
                        this.f22968c.f22754D1.putInt("currentlyPlayingVideoPosition", i10);
                        this.f22968c.f22754D1.apply();
                    }
                    nSTIJKPlayerSkyActivity = this.f22968c;
                    nSTIJKPlayerSkyActivity.f22808R.notifyDataSetChanged();
                    return;
                }
                this.f22968c.m18410P1(true);
            } catch (Exception e13) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$b0.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$b0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$b0.class */
    public class AsyncTaskC3766b0 extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        public final NSTIJKPlayerSkyActivity f22969a;

        public AsyncTaskC3766b0(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity) {
            this.f22969a = nSTIJKPlayerSkyActivity;
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
                    return this.f22969a.m18447x1();
                }
                if (z10) {
                    return this.f22969a.m18451z1();
                }
                if (z10 == 2) {
                    return this.f22969a.m18412S1();
                }
                if (z10 != 3) {
                    return null;
                }
                return this.f22969a.m18391E1();
            } catch (Exception e10) {
                return "error";
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            try {
                if (this.f22969a.f22937u0 != null) {
                    if (!this.f22969a.f22830W1.booleanValue()) {
                        this.f22969a.f22830W1 = Boolean.TRUE;
                        if (this.f22969a.f22937u0.size() != 0) {
                            if (this.f22969a.f22952x0 != null) {
                                this.f22969a.f22952x0.clear();
                                this.f22969a.f22952x0.addAll(this.f22969a.f22937u0);
                            }
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity = this.f22969a;
                            nSTIJKPlayerSkyActivity.m18438s2(nSTIJKPlayerSkyActivity.f22937u0);
                        } else {
                            C5251a.f30008G = Boolean.FALSE;
                            this.f22969a.m18436q2();
                            this.f22969a.f22859e2.setVisibility(8);
                            this.f22969a.f22906o.setVisibility(0);
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity2 = this.f22969a;
                            nSTIJKPlayerSkyActivity2.f22911p.setText(nSTIJKPlayerSkyActivity2.getResources().getString(2132018196));
                        }
                    }
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity3 = this.f22969a;
                    if (nSTIJKPlayerSkyActivity3.f22805Q0 && nSTIJKPlayerSkyActivity3.f22809R0 && !nSTIJKPlayerSkyActivity3.f22813S0.equals("")) {
                        this.f22969a.f22944v2 = 0;
                        try {
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity4 = this.f22969a;
                            nSTIJKPlayerSkyActivity4.f22944v2 = nSTIJKPlayerSkyActivity4.m18414U1(nSTIJKPlayerSkyActivity4.f22937u0, C5255e.m26215R(this.f22969a.f22813S0));
                        } catch (NumberFormatException | Exception e10) {
                        }
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity5 = this.f22969a;
                        nSTIJKPlayerSkyActivity5.f22805Q0 = false;
                        nSTIJKPlayerSkyActivity5.f22809R0 = false;
                    }
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity6 = this.f22969a;
                    nSTIJKPlayerSkyActivity6.m18448x2(nSTIJKPlayerSkyActivity6.f22937u0);
                }
                this.f22969a.m18423d2();
            } catch (Exception e11) {
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            TextView textView;
            String string;
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity;
            super.onPreExecute();
            try {
                this.f22969a.m18396G2();
                TextView textView2 = this.f22969a.f22789M0;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity2 = this.f22969a;
                if (nSTIJKPlayerSkyActivity2.f22882j0 != null) {
                    if (!nSTIJKPlayerSkyActivity2.f22850c1.equals("") && this.f22969a.f22850c1.equals("0")) {
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity3 = this.f22969a;
                        nSTIJKPlayerSkyActivity3.f22882j0.setText(nSTIJKPlayerSkyActivity3.f22853d.getResources().getString(2132017297));
                        nSTIJKPlayerSkyActivity = this.f22969a;
                    } else if (!this.f22969a.f22850c1.equals("") && this.f22969a.f22850c1.equals("-1")) {
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity4 = this.f22969a;
                        nSTIJKPlayerSkyActivity4.f22882j0.setText(nSTIJKPlayerSkyActivity4.f22853d.getResources().getString(2132017779));
                        nSTIJKPlayerSkyActivity = this.f22969a;
                    } else if (this.f22969a.f22850c1.equals("") || !this.f22969a.f22850c1.equals("-6")) {
                        if (this.f22969a.f22854d1.equals("")) {
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity5 = this.f22969a;
                            textView = nSTIJKPlayerSkyActivity5.f22882j0;
                            string = nSTIJKPlayerSkyActivity5.getResources().getString(2132018731);
                        } else {
                            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity6 = this.f22969a;
                            textView = nSTIJKPlayerSkyActivity6.f22882j0;
                            string = nSTIJKPlayerSkyActivity6.f22854d1;
                        }
                        textView.setText(string);
                        nSTIJKPlayerSkyActivity = this.f22969a;
                    } else {
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity7 = this.f22969a;
                        nSTIJKPlayerSkyActivity7.f22882j0.setText(nSTIJKPlayerSkyActivity7.f22853d.getResources().getString(2132018441));
                        nSTIJKPlayerSkyActivity = this.f22969a;
                    }
                    nSTIJKPlayerSkyActivity.f22882j0.setSelected(true);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$c.class */
    public class C3767c implements AdapterView.OnItemLongClickListener {

        /* renamed from: a */
        public final NSTIJKPlayerSkyActivity f22970a;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$c$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$c$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$c$a.class */
        public class a implements PopupMenu.OnMenuItemClickListener {

            /* renamed from: a */
            public final String f22971a;

            /* renamed from: b */
            public final String f22972b;

            /* renamed from: c */
            public final String f22973c;

            /* renamed from: d */
            public final String f22974d;

            /* renamed from: e */
            public final String f22975e;

            /* renamed from: f */
            public final C3767c f22976f;

            public a(C3767c c3767c, String str, String str2, String str3, String str4, String str5) {
                this.f22976f = c3767c;
                this.f22971a = str;
                this.f22972b = str2;
                this.f22973c = str3;
                this.f22974d = str4;
                this.f22975e = str5;
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
            
                r0 = r8.f22976f.f22970a;
                r0.f22949w2 = true;
                r0.m18442u2();
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
            
                if (r8.f22976f.f22970a.f22848b2.equals("m3u") == false) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
            
                r11 = r8.f22976f.f22970a;
                r12 = r11.f22756E;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
            
                r11.f22792N = r12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
            
                r0 = new android.content.Intent(r8.f22976f.f22970a.f22853d, (java.lang.Class<?>) com.maxdigitall.maxdigitaliptvbox.view.activity.PlayExternalPlayerActivity.class);
                r0.putExtra("url", r8.f22976f.f22970a.f22792N);
                r0.putExtra("app_name", r8.f22976f.f22970a.f22795N2.get(r10).m15415a());
                r0.putExtra("packagename", r8.f22976f.f22970a.f22795N2.get(r10).m15416b());
                r8.f22976f.f22970a.f22853d.startActivity(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
            
                r11 = r8.f22976f.f22970a;
                r12 = p151if.C5255e.m26203F(r11.f22853d, r11.f22752D, r11.f22867g0, "live");
             */
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean onMenuItemClick(android.view.MenuItem r9) {
                /*
                    Method dump skipped, instructions count: 566
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.C3767c.a.onMenuItemClick(android.view.MenuItem):boolean");
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$c$b.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$c$b */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$c$b.class */
        public class b implements PopupMenu.OnDismissListener {

            /* renamed from: a */
            public final C3767c f22977a;

            public b(C3767c c3767c) {
                this.f22977a = c3767c;
            }

            @Override // android.widget.PopupMenu.OnDismissListener
            public void onDismiss(PopupMenu popupMenu) {
            }
        }

        public C3767c(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity) {
            this.f22970a = nSTIJKPlayerSkyActivity;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(14:4|(2:50|(12:56|11|(2:13|(3:41|42|43)(3:17|18|19))(2:44|(3:49|42|43)(3:48|18|19))|20|21|22|23|24|25|(4:29|30|(2:33|31)|34)|36|37)(2:54|55))(2:8|9)|10|11|(0)(0)|20|21|22|23|24|25|(5:27|29|30|(1:31)|34)|36|37) */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0186 A[Catch: Exception -> 0x031e, TRY_LEAVE, TryCatch #0 {Exception -> 0x031e, blocks: (B:2:0x0000, B:4:0x000c, B:6:0x0017, B:8:0x001f, B:11:0x0159, B:13:0x0186, B:15:0x01a0, B:17:0x01a7, B:19:0x01ae, B:21:0x01b6, B:22:0x0208, B:36:0x02af, B:41:0x01c0, B:43:0x01c7, B:44:0x01d1, B:46:0x01ef, B:48:0x01f6, B:49:0x01ff, B:50:0x009b, B:52:0x00a5, B:54:0x00b2), top: B:1:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0259 A[Catch: Exception -> 0x0322, LOOP:0: B:31:0x024a->B:33:0x0259, LOOP_END, TRY_LEAVE, TryCatch #1 {Exception -> 0x0322, blocks: (B:25:0x0235, B:27:0x0240, B:31:0x024a, B:33:0x0259), top: B:24:0x0235 }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x01d1 A[Catch: Exception -> 0x031e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x031e, blocks: (B:2:0x0000, B:4:0x000c, B:6:0x0017, B:8:0x001f, B:11:0x0159, B:13:0x0186, B:15:0x01a0, B:17:0x01a7, B:19:0x01ae, B:21:0x01b6, B:22:0x0208, B:36:0x02af, B:41:0x01c0, B:43:0x01c7, B:44:0x01d1, B:46:0x01ef, B:48:0x01f6, B:49:0x01ff, B:50:0x009b, B:52:0x00a5, B:54:0x00b2), top: B:1:0x0000 }] */
        @Override // android.widget.AdapterView.OnItemLongClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onItemLongClick(android.widget.AdapterView<?> r9, android.view.View r10, int r11, long r12) {
            /*
                Method dump skipped, instructions count: 806
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.C3767c.onItemLongClick(android.widget.AdapterView, android.view.View, int, long):boolean");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$c0.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$c0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$c0.class */
    public class AsyncTaskC3768c0 extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        public final NSTIJKPlayerSkyActivity f22978a;

        public AsyncTaskC3768c0(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity) {
            this.f22978a = nSTIJKPlayerSkyActivity;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            try {
                return this.f22978a.f22807Q2.equals("-1") ? this.f22978a.m18413T1() : this.f22978a.f22807Q2.equals("-6") ? this.f22978a.m18391E1() : this.f22978a.m18385B1();
            } catch (Exception e10) {
                return "error";
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            try {
                if (this.f22978a.f22942v0 != null) {
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity = this.f22978a;
                    nSTIJKPlayerSkyActivity.m18450y2(nSTIJKPlayerSkyActivity.f22942v0);
                }
                this.f22978a.m18422c2();
            } catch (Exception e10) {
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f22978a.m18394F2();
            LinearLayout linearLayout = this.f22978a.f22793N0;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            if (this.f22978a.f22776J != null) {
                this.f22978a.f22776J.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$d.class */
    public class RunnableC3769d implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerSkyActivity f22979b;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$d$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$d$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$d$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final RunnableC3769d f22980b;

            public a(RunnableC3769d runnableC3769d) {
                this.f22980b = runnableC3769d;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f22980b.f22979b.f22818T1.setText("");
                this.f22980b.f22979b.f22814S1.setVisibility(8);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$d$b.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$d$b */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$d$b.class */
        public class b implements Runnable {

            /* renamed from: b */
            public final RunnableC3769d f22981b;

            public b(RunnableC3769d runnableC3769d) {
                this.f22981b = runnableC3769d;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f22981b.f22979b.f22818T1.setText("");
                this.f22981b.f22979b.f22814S1.setVisibility(8);
            }
        }

        public RunnableC3769d(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity) {
            this.f22979b = nSTIJKPlayerSkyActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList<LiveStreamsDBModel> m15157D1;
            Handler handler;
            Runnable bVar;
            boolean z10;
            ArrayList<LiveStreamsDBModel> m15217f1;
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity = this.f22979b;
            nSTIJKPlayerSkyActivity.f22813S0 = nSTIJKPlayerSkyActivity.f22810R1.toString();
            this.f22979b.f22818T1.setText("");
            this.f22979b.f22814S1.setVisibility(8);
            if (this.f22979b.f22930s3.equals("true")) {
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity2 = this.f22979b;
                m15157D1 = nSTIJKPlayerSkyActivity2.f22800P.m15157D1(nSTIJKPlayerSkyActivity2.f22813S0, "radio_streams");
            } else {
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity3 = this.f22979b;
                m15157D1 = nSTIJKPlayerSkyActivity3.f22800P.m15157D1(nSTIJKPlayerSkyActivity3.f22813S0, "live");
            }
            this.f22979b.f22810R1.setLength(0);
            if (m15157D1 == null || m15157D1.size() == 0) {
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity4 = this.f22979b;
                nSTIJKPlayerSkyActivity4.f22818T1.setText(nSTIJKPlayerSkyActivity4.f22853d.getResources().getString(2132018196));
                this.f22979b.f22814S1.setVisibility(0);
                handler = new Handler();
                bVar = new b(this);
            } else {
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity5 = this.f22979b;
                if (nSTIJKPlayerSkyActivity5.f22800P.m15189R1(SharepreferenceDBHandler.m15337A(nSTIJKPlayerSkyActivity5.f22853d)) <= 0 || this.f22979b.f22745B0 == null) {
                    z10 = false;
                } else {
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity6 = this.f22979b;
                    z10 = nSTIJKPlayerSkyActivity6.m18416W1(m15157D1, nSTIJKPlayerSkyActivity6.f22745B0);
                }
                if (!z10) {
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity7 = this.f22979b;
                    nSTIJKPlayerSkyActivity7.f22805Q0 = true;
                    nSTIJKPlayerSkyActivity7.f22809R0 = true;
                    nSTIJKPlayerSkyActivity7.f22850c1 = "0";
                    nSTIJKPlayerSkyActivity7.f22854d1 = nSTIJKPlayerSkyActivity7.f22853d.getResources().getString(2132017297);
                    this.f22979b.f22877i0 = 0;
                    String m14805L = m15157D1.get(0).m14805L();
                    String m14811R = m15157D1.get(0).m14811R();
                    String name = m15157D1.get(0).getName();
                    String m14798E = m15157D1.get(0).m14798E();
                    String m14810Q = m15157D1.get(0).m14810Q();
                    String m14816W = m15157D1.get(0).m14816W();
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity8 = this.f22979b;
                    nSTIJKPlayerSkyActivity8.f22742A1 = m14816W;
                    nSTIJKPlayerSkyActivity8.f22799O2 = C5255e.m26215R(nSTIJKPlayerSkyActivity8.f22813S0);
                    this.f22979b.f22803P2 = "0";
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity9 = this.f22979b;
                    nSTIJKPlayerSkyActivity9.f22950w3 = nSTIJKPlayerSkyActivity9.f22850c1;
                    nSTIJKPlayerSkyActivity9.f22859e2.setTitle(this.f22979b.f22813S0 + " - " + name);
                    this.f22979b.f22915p3 = this.f22979b.f22813S0 + " - " + name;
                    if (this.f22979b.f22930s3.equals("true")) {
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity10 = this.f22979b;
                        m15217f1 = nSTIJKPlayerSkyActivity10.f22800P.m15217f1(nSTIJKPlayerSkyActivity10.f22850c1, "radio_streams");
                    } else {
                        NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity11 = this.f22979b;
                        m15217f1 = nSTIJKPlayerSkyActivity11.f22800P.m15217f1(nSTIJKPlayerSkyActivity11.f22850c1, "live");
                    }
                    if (m15217f1 != null) {
                        this.f22979b.f22932t0.clear();
                    }
                    this.f22979b.f22932t0 = m15217f1;
                    if (this.f22979b.f22932t0 != null && this.f22979b.f22932t0.size() > 0) {
                        for (int i10 = 0; i10 < this.f22979b.f22932t0.size(); i10++) {
                            if (((LiveStreamsDBModel) this.f22979b.f22932t0.get(i10)).m14805L().equals(m14805L)) {
                                this.f22979b.f22859e2.setCurrentWindowIndex(i10);
                                break;
                            }
                        }
                    }
                    try {
                        if (m14810Q.equals("") || m14810Q.isEmpty()) {
                            this.f22979b.f22916q.setImageDrawable(this.f22979b.f22853d.getResources().getDrawable(2131231571));
                        } else {
                            C10014t.m42105q(this.f22979b.f22853d).m42116l(m14810Q).m42154j(2131231571).m42148d(2131231571).m42155k(80, 55).m42151g(this.f22979b.f22916q);
                        }
                    } catch (Exception e10) {
                        this.f22979b.f22916q.setImageDrawable(this.f22979b.f22853d.getResources().getDrawable(2131231571));
                    }
                    this.f22979b.f22859e2.m19346X0();
                    if (this.f22979b.f22889k2.booleanValue()) {
                        if (this.f22979b.f22848b2.equals("m3u")) {
                            this.f22979b.f22859e2.m19352d1(Uri.parse(m14816W), NSTIJKPlayerSkyActivity.f22733B3, name);
                            this.f22979b.f22910o3 = String.valueOf(Uri.parse(m14816W));
                            C7920a.m34301l().m34317z(this.f22979b.f22742A1);
                        } else {
                            this.f22979b.f22859e2.m19352d1(Uri.parse(this.f22979b.f22857e + C5255e.m26214Q(m14811R) + this.f22979b.f22867g0), NSTIJKPlayerSkyActivity.f22733B3, name);
                            this.f22979b.f22910o3 = String.valueOf(Uri.parse(this.f22979b.f22857e + C5255e.m26214Q(m14811R) + ".m3u8"));
                            C7920a.m34301l().m34317z(m14811R);
                        }
                        this.f22979b.f22859e2.f24285I = 0;
                        this.f22979b.f22859e2.f24291K = false;
                        this.f22979b.f22859e2.start();
                    }
                    this.f22979b.f22782K1.removeCallbacksAndMessages(null);
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity12 = this.f22979b;
                    nSTIJKPlayerSkyActivity12.f22760F = m14798E;
                    nSTIJKPlayerSkyActivity12.f22764G = m14810Q;
                    nSTIJKPlayerSkyActivity12.f22920q3 = m14810Q;
                    this.f22979b.f22859e2.setCurrentEpgChannelID(this.f22979b.f22760F);
                    this.f22979b.f22859e2.setCurrentChannelLogo(this.f22979b.f22764G);
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity13 = this.f22979b;
                    nSTIJKPlayerSkyActivity13.m18405L2(nSTIJKPlayerSkyActivity13.f22764G);
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity14 = this.f22979b;
                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity15 = this.f22979b;
                    nSTIJKPlayerSkyActivity14.f22934t2 = new AsyncTaskC3772e0(nSTIJKPlayerSkyActivity15, nSTIJKPlayerSkyActivity15.f22760F, null).execute(new String[0]);
                    this.f22979b.f22778J1.removeCallbacksAndMessages(null);
                    this.f22979b.f22963z1 = C5255e.m26214Q(m14811R);
                    if (this.f22979b.f22750C1 != null) {
                        this.f22979b.f22750C1.putString("currentlyPlayingVideo", m14811R);
                        this.f22979b.f22750C1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", m14816W);
                        this.f22979b.f22750C1.apply();
                    }
                    this.f22979b.f22808R.notifyDataSetChanged();
                    m15157D1.clear();
                    return;
                }
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity16 = this.f22979b;
                nSTIJKPlayerSkyActivity16.f22818T1.setText(nSTIJKPlayerSkyActivity16.f22853d.getResources().getString(2132018196));
                this.f22979b.f22814S1.setVisibility(0);
                handler = new Handler();
                bVar = new a(this);
            }
            handler.postDelayed(bVar, 1000L);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$d0.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$d0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$d0.class */
    public class ViewOnFocusChangeListenerC3770d0 implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f22982b;

        /* renamed from: c */
        public final NSTIJKPlayerSkyActivity f22983c;

        public ViewOnFocusChangeListenerC3770d0(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity, View view) {
            this.f22983c = nSTIJKPlayerSkyActivity;
            this.f22982b = view;
        }

        /* renamed from: a */
        public final void m18459a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f22982b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m18460b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f22982b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m18461c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f22982b, "scaleY", f10);
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
                View view8 = this.f22982b;
                if (view8 == null || view8.getTag() == null || !this.f22982b.getTag().equals("1")) {
                    View view9 = this.f22982b;
                    if (view9 == null || view9.getTag() == null || !this.f22982b.getTag().equals("2")) {
                        View view10 = this.f22982b;
                        if (view10 == null || view10.getTag() == null || !this.f22982b.getTag().equals("3")) {
                            View view11 = this.f22982b;
                            if ((view11 != null && view11.getTag() != null && this.f22982b.getTag().equals("4")) || (((view5 = this.f22982b) != null && view5.getTag() != null && this.f22982b.getTag().equals("5")) || (((view6 = this.f22982b) != null && view6.getTag() != null && this.f22982b.getTag().equals("6")) || ((view7 = this.f22982b) != null && view7.getTag() != null && this.f22982b.getTag().equals("7"))))) {
                                view.setBackground(this.f22983c.getResources().getDrawable(2131231461));
                                return;
                            }
                            View view12 = this.f22982b;
                            if (view12 != null && view12.getTag() != null && this.f22982b.getTag().equals("8")) {
                                return;
                            }
                            View view13 = this.f22982b;
                            if (view13 == null || view13.getTag() == null || !this.f22982b.getTag().equals("9")) {
                                View view14 = this.f22982b;
                                if (view14 == null || view14.getTag() == null || !this.f22982b.getTag().equals("10")) {
                                    return;
                                }
                                view.setBackground(this.f22983c.getResources().getDrawable(2131231460));
                                m18460b(f10);
                                m18461c(f10);
                                linearLayout2 = this.f22983c.ll_restart;
                            }
                        }
                        view.setBackground(this.f22983c.getResources().getDrawable(2131231460));
                        m18460b(f10);
                        m18461c(f10);
                        return;
                    }
                    view.setBackground(this.f22983c.getResources().getDrawable(2131231460));
                    m18460b(f10);
                    m18461c(f10);
                    linearLayout2 = this.f22983c.ll_audio_subtitle_settings;
                } else {
                    view.setBackground(this.f22983c.getResources().getDrawable(2131231460));
                    m18460b(f10);
                    m18461c(f10);
                    linearLayout2 = this.f22983c.ll_back;
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
            View view15 = this.f22982b;
            if (view15 == null || view15.getTag() == null || !this.f22982b.getTag().equals("1")) {
                View view16 = this.f22982b;
                if (view16 == null || view16.getTag() == null || !this.f22982b.getTag().equals("2")) {
                    View view17 = this.f22982b;
                    if (view17 == null || view17.getTag() == null || !this.f22982b.getTag().equals("3")) {
                        View view18 = this.f22982b;
                        if ((view18 != null && view18.getTag() != null && this.f22982b.getTag().equals("4")) || (((view2 = this.f22982b) != null && view2.getTag() != null && this.f22982b.getTag().equals("5")) || (((view3 = this.f22982b) != null && view3.getTag() != null && this.f22982b.getTag().equals("6")) || ((view4 = this.f22982b) != null && view4.getTag() != null && this.f22982b.getTag().equals("7"))))) {
                            view.setBackground(null);
                            return;
                        }
                        View view19 = this.f22982b;
                        if (view19 != null && view19.getTag() != null && this.f22982b.getTag().equals("8")) {
                            return;
                        }
                        View view20 = this.f22982b;
                        if (view20 == null || view20.getTag() == null || !this.f22982b.getTag().equals("9")) {
                            View view21 = this.f22982b;
                            if (view21 == null || view21.getTag() == null || !this.f22982b.getTag().equals("10")) {
                                return;
                            }
                            view.setBackground(this.f22983c.getResources().getDrawable(2131231458));
                            m18460b(f10);
                            m18461c(f10);
                            m18459a(z10);
                            linearLayout = this.f22983c.ll_restart;
                        }
                    }
                    view.setBackground(this.f22983c.getResources().getDrawable(2131231458));
                    m18460b(f10);
                    m18461c(f10);
                    m18459a(z10);
                    return;
                }
                view.setBackground(this.f22983c.getResources().getDrawable(2131231458));
                m18460b(f10);
                m18461c(f10);
                m18459a(z10);
                linearLayout = this.f22983c.ll_audio_subtitle_settings;
            } else {
                view.setBackground(this.f22983c.getResources().getDrawable(2131231458));
                m18460b(f10);
                m18461c(f10);
                m18459a(z10);
                linearLayout = this.f22983c.ll_back;
            }
            linearLayout.setVisibility(8);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$e.class */
    public class RunnableC3771e implements Runnable {

        /* renamed from: b */
        public final String f22984b;

        /* renamed from: c */
        public final String f22985c;

        /* renamed from: d */
        public final int f22986d;

        /* renamed from: e */
        public final NSTIJKPlayerSkyActivity f22987e;

        public RunnableC3771e(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity, String str, String str2, int i10) {
            this.f22987e = nSTIJKPlayerSkyActivity;
            this.f22984b = str;
            this.f22985c = str2;
            this.f22986d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity;
            String str;
            if (this.f22987e.f22848b2.equals("m3u")) {
                this.f22987e.f22859e2.m19352d1(Uri.parse(this.f22984b), NSTIJKPlayerSkyActivity.f22733B3, this.f22985c);
                nSTIJKPlayerSkyActivity = this.f22987e;
                str = this.f22984b;
            } else {
                this.f22987e.f22859e2.m19352d1(Uri.parse(this.f22987e.f22857e + C5255e.m26214Q(((LiveStreamsDBModel) this.f22987e.f22952x0.get(this.f22986d)).m14811R()) + this.f22987e.f22867g0), NSTIJKPlayerSkyActivity.f22733B3, this.f22985c);
                nSTIJKPlayerSkyActivity = this.f22987e;
                str = this.f22987e.f22857e + C5255e.m26214Q(((LiveStreamsDBModel) this.f22987e.f22952x0.get(this.f22986d)).m14811R()) + ".m3u8";
            }
            nSTIJKPlayerSkyActivity.f22910o3 = String.valueOf(Uri.parse(str));
            this.f22987e.f22859e2.f24285I = 0;
            this.f22987e.f22859e2.f24291K = false;
            this.f22987e.f22859e2.start();
            this.f22987e.f22782K1.removeCallbacksAndMessages(null);
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity2 = this.f22987e;
            nSTIJKPlayerSkyActivity2.f22760F = ((LiveStreamsDBModel) nSTIJKPlayerSkyActivity2.f22952x0.get(this.f22986d)).m14798E();
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity3 = this.f22987e;
            nSTIJKPlayerSkyActivity3.f22764G = ((LiveStreamsDBModel) nSTIJKPlayerSkyActivity3.f22952x0.get(this.f22986d)).m14810Q();
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity4 = this.f22987e;
            nSTIJKPlayerSkyActivity4.f22920q3 = nSTIJKPlayerSkyActivity4.f22764G;
            this.f22987e.f22859e2.setCurrentEpgChannelID(this.f22987e.f22760F);
            this.f22987e.f22859e2.setCurrentChannelLogo(this.f22987e.f22764G);
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity5 = this.f22987e;
            nSTIJKPlayerSkyActivity5.m18405L2(nSTIJKPlayerSkyActivity5.f22764G);
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity6 = this.f22987e;
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity7 = this.f22987e;
            nSTIJKPlayerSkyActivity6.f22934t2 = new AsyncTaskC3772e0(nSTIJKPlayerSkyActivity7, nSTIJKPlayerSkyActivity7.f22760F, null).execute(new String[0]);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$e0.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$e0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$e0.class */
    public class AsyncTaskC3772e0 extends AsyncTask<String, Void, HashMap<String, ArrayList<String>>> {

        /* renamed from: a */
        public String f22988a;

        /* renamed from: b */
        public final NSTIJKPlayerSkyActivity f22989b;

        public AsyncTaskC3772e0(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity, String str) {
            this.f22989b = nSTIJKPlayerSkyActivity;
            this.f22988a = str;
        }

        public /* synthetic */ AsyncTaskC3772e0(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity, String str, C3778k c3778k) {
            this(nSTIJKPlayerSkyActivity, str);
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public HashMap<String, ArrayList<String>> doInBackground(String... strArr) {
            try {
                return this.f22989b.m18388C2(this.f22988a);
            } catch (Exception e10) {
                return new HashMap<>();
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(HashMap<String, ArrayList<String>> hashMap) {
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity;
            ArrayList<String> arrayList;
            super.onPostExecute(hashMap);
            try {
                if (hashMap.get("2") != null) {
                    ArrayList<String> arrayList2 = hashMap.get("2");
                    if (arrayList2 == null || arrayList2.get(0) == null || !arrayList2.get(0).equals("installed")) {
                        this.f22989b.f22948w1.setVisibility(0);
                        nSTIJKPlayerSkyActivity = this.f22989b;
                    } else if (hashMap.get("0") != null) {
                        ArrayList<String> arrayList3 = hashMap.get("0");
                        if (arrayList3 != null && arrayList3.size() > 0) {
                            LinearLayout linearLayout = this.f22989b.f22953x1;
                            if (linearLayout != null) {
                                linearLayout.setVisibility(8);
                            }
                            if (hashMap.get("3") != null && this.f22989b.f22946w != null) {
                                ArrayList<String> arrayList4 = hashMap.get("3");
                                if (arrayList4 == null || arrayList4.get(0) == null) {
                                    this.f22989b.f22946w.setProgress(0);
                                } else {
                                    this.f22989b.f22946w.setProgress(Integer.parseInt(arrayList4.get(0)));
                                }
                            }
                            try {
                                if (arrayList3.get(0) != null) {
                                    this.f22989b.f22921r.setText(arrayList3.get(0));
                                } else {
                                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity2 = this.f22989b;
                                    nSTIJKPlayerSkyActivity2.f22921r.setText(nSTIJKPlayerSkyActivity2.f22853d.getResources().getString(2132018252));
                                }
                            } catch (Exception e10) {
                                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity3 = this.f22989b;
                                nSTIJKPlayerSkyActivity3.f22921r.setText(nSTIJKPlayerSkyActivity3.f22853d.getResources().getString(2132018252));
                            }
                            try {
                                if (arrayList3.get(1) != null) {
                                    this.f22989b.f22926s.setText(arrayList3.get(1));
                                } else {
                                    this.f22989b.f22926s.setText("");
                                }
                            } catch (Exception e11) {
                                this.f22989b.f22926s.setText("");
                            }
                            try {
                                if (arrayList3.get(3) != null) {
                                    this.f22989b.f22931t.setText(arrayList3.get(3));
                                } else {
                                    NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity4 = this.f22989b;
                                    nSTIJKPlayerSkyActivity4.f22931t.setText(nSTIJKPlayerSkyActivity4.f22853d.getResources().getString(2132018252));
                                }
                            } catch (Exception e12) {
                                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity5 = this.f22989b;
                                nSTIJKPlayerSkyActivity5.f22931t.setText(nSTIJKPlayerSkyActivity5.f22853d.getResources().getString(2132018252));
                            }
                            try {
                                if (arrayList3.get(4) != null) {
                                    this.f22989b.f22936u.setText(arrayList3.get(4));
                                } else {
                                    this.f22989b.f22936u.setText("");
                                }
                            } catch (Exception e13) {
                                this.f22989b.f22936u.setText("");
                            }
                            if (hashMap.get("1") != null || (arrayList = hashMap.get("1")) == null || arrayList.size() <= 0) {
                                this.f22989b.m18419Z1();
                            }
                            try {
                                if (arrayList.get(0) != null) {
                                    TextView textView = this.f22989b.f22858e1;
                                    if (textView != null) {
                                        textView.setText(arrayList.get(0));
                                    }
                                    TextView textView2 = this.f22989b.tv_start_stop;
                                    if (textView2 != null) {
                                        textView2.setText(arrayList.get(0));
                                        this.f22989b.tv_start_stop.setSelected(true);
                                    }
                                } else {
                                    TextView textView3 = this.f22989b.f22858e1;
                                    if (textView3 != null) {
                                        textView3.setText("");
                                    }
                                }
                            } catch (Exception e14) {
                                TextView textView4 = this.f22989b.f22858e1;
                                if (textView4 != null) {
                                    textView4.setText("");
                                }
                            }
                            try {
                                if (arrayList.get(1) != null) {
                                    TextView textView5 = this.f22989b.f22903n1;
                                    if (textView5 != null) {
                                        textView5.setText(arrayList.get(1));
                                    }
                                    TextView textView6 = this.f22989b.tv_program_name;
                                    if (textView6 != null) {
                                        textView6.setText(arrayList.get(1));
                                        this.f22989b.tv_program_name.setSelected(true);
                                    }
                                } else {
                                    TextView textView7 = this.f22989b.f22903n1;
                                    if (textView7 != null) {
                                        textView7.setText("");
                                    }
                                }
                            } catch (Exception e15) {
                                TextView textView8 = this.f22989b.f22903n1;
                                if (textView8 != null) {
                                    textView8.setText("");
                                }
                            }
                            try {
                                if (arrayList.get(2) != null) {
                                    TextView textView9 = this.f22989b.f22863f1;
                                    if (textView9 != null) {
                                        textView9.setText(arrayList.get(2));
                                    }
                                } else {
                                    TextView textView10 = this.f22989b.f22863f1;
                                    if (textView10 != null) {
                                        textView10.setText("");
                                    }
                                }
                            } catch (Exception e16) {
                                TextView textView11 = this.f22989b.f22863f1;
                                if (textView11 != null) {
                                    textView11.setText("");
                                }
                            }
                            TextView textView12 = this.f22989b.f22903n1;
                            if (textView12 != null) {
                                textView12.setSelected(true);
                            }
                            LinearLayout linearLayout2 = this.f22989b.f22923r1;
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(0);
                            }
                            try {
                                if (arrayList.get(3) != null) {
                                    TextView textView13 = this.f22989b.f22868g1;
                                    if (textView13 != null) {
                                        textView13.setText(arrayList.get(3));
                                    }
                                } else {
                                    TextView textView14 = this.f22989b.f22868g1;
                                    if (textView14 != null) {
                                        textView14.setText("");
                                    }
                                }
                            } catch (Exception e17) {
                                TextView textView15 = this.f22989b.f22868g1;
                                if (textView15 != null) {
                                    textView15.setText("");
                                }
                            }
                            try {
                                if (arrayList.get(4) != null) {
                                    TextView textView16 = this.f22989b.f22908o1;
                                    if (textView16 != null) {
                                        textView16.setText(arrayList.get(4));
                                    }
                                } else {
                                    TextView textView17 = this.f22989b.f22908o1;
                                    if (textView17 != null) {
                                        textView17.setText("");
                                    }
                                }
                            } catch (Exception e18) {
                                TextView textView18 = this.f22989b.f22908o1;
                                if (textView18 != null) {
                                    textView18.setText("");
                                }
                            }
                            try {
                                if (arrayList.get(5) != null) {
                                    TextView textView19 = this.f22989b.f22873h1;
                                    if (textView19 != null) {
                                        textView19.setText(arrayList.get(5));
                                    }
                                } else {
                                    TextView textView20 = this.f22989b.f22873h1;
                                    if (textView20 != null) {
                                        textView20.setText("");
                                    }
                                }
                            } catch (Exception e19) {
                                TextView textView21 = this.f22989b.f22873h1;
                                if (textView21 != null) {
                                    textView21.setText("");
                                }
                            }
                            TextView textView22 = this.f22989b.f22908o1;
                            if (textView22 != null) {
                                textView22.setSelected(true);
                            }
                            LinearLayout linearLayout3 = this.f22989b.f22933t1;
                            if (linearLayout3 != null) {
                                linearLayout3.setVisibility(0);
                            }
                            try {
                                if (arrayList.get(6) != null) {
                                    TextView textView23 = this.f22989b.f22883j1;
                                    if (textView23 != null) {
                                        textView23.setText(arrayList.get(6));
                                    }
                                } else {
                                    TextView textView24 = this.f22989b.f22883j1;
                                    if (textView24 != null) {
                                        textView24.setText("");
                                    }
                                }
                            } catch (Exception e20) {
                                TextView textView25 = this.f22989b.f22883j1;
                                if (textView25 != null) {
                                    textView25.setText("");
                                }
                            }
                            try {
                                if (arrayList.get(7) != null) {
                                    TextView textView26 = this.f22989b.f22913p1;
                                    if (textView26 != null) {
                                        textView26.setText(arrayList.get(7));
                                    }
                                } else {
                                    TextView textView27 = this.f22989b.f22913p1;
                                    if (textView27 != null) {
                                        textView27.setText("");
                                    }
                                }
                            } catch (Exception e21) {
                                TextView textView28 = this.f22989b.f22913p1;
                                if (textView28 != null) {
                                    textView28.setText("");
                                }
                            }
                            try {
                                if (arrayList.get(8) != null) {
                                    TextView textView29 = this.f22989b.f22888k1;
                                    if (textView29 != null) {
                                        textView29.setText(arrayList.get(8));
                                    }
                                } else {
                                    TextView textView30 = this.f22989b.f22888k1;
                                    if (textView30 != null) {
                                        textView30.setText("");
                                    }
                                }
                            } catch (Exception e22) {
                                TextView textView31 = this.f22989b.f22888k1;
                                if (textView31 != null) {
                                    textView31.setText("");
                                }
                            }
                            TextView textView32 = this.f22989b.f22913p1;
                            if (textView32 != null) {
                                textView32.setSelected(true);
                            }
                            LinearLayout linearLayout4 = this.f22989b.f22938u1;
                            if (linearLayout4 != null) {
                                linearLayout4.setVisibility(0);
                            }
                            try {
                                if (arrayList.get(9) != null) {
                                    TextView textView33 = this.f22989b.f22893l1;
                                    if (textView33 != null) {
                                        textView33.setText(arrayList.get(9));
                                    }
                                } else {
                                    TextView textView34 = this.f22989b.f22893l1;
                                    if (textView34 != null) {
                                        textView34.setText("");
                                    }
                                }
                            } catch (Exception e23) {
                                TextView textView35 = this.f22989b.f22893l1;
                                if (textView35 != null) {
                                    textView35.setText("");
                                }
                            }
                            try {
                                if (arrayList.get(10) != null) {
                                    TextView textView36 = this.f22989b.f22918q1;
                                    if (textView36 != null) {
                                        textView36.setText(arrayList.get(10));
                                    }
                                } else {
                                    TextView textView37 = this.f22989b.f22918q1;
                                    if (textView37 != null) {
                                        textView37.setText("");
                                    }
                                }
                            } catch (Exception e24) {
                                TextView textView38 = this.f22989b.f22918q1;
                                if (textView38 != null) {
                                    textView38.setText("");
                                }
                            }
                            try {
                                if (arrayList.get(11) != null) {
                                    TextView textView39 = this.f22989b.f22898m1;
                                    if (textView39 != null) {
                                        textView39.setText(arrayList.get(11));
                                    }
                                } else {
                                    TextView textView40 = this.f22989b.f22898m1;
                                    if (textView40 != null) {
                                        textView40.setText("");
                                    }
                                }
                            } catch (Exception e25) {
                                TextView textView41 = this.f22989b.f22898m1;
                                if (textView41 != null) {
                                    textView41.setText("");
                                }
                            }
                            TextView textView42 = this.f22989b.f22918q1;
                            if (textView42 != null) {
                                textView42.setSelected(true);
                            }
                            LinearLayout linearLayout5 = this.f22989b.f22943v1;
                            if (linearLayout5 != null) {
                                linearLayout5.setVisibility(0);
                                return;
                            }
                            return;
                        }
                        nSTIJKPlayerSkyActivity = this.f22989b;
                    } else {
                        nSTIJKPlayerSkyActivity = this.f22989b;
                    }
                } else {
                    this.f22989b.f22948w1.setVisibility(0);
                    nSTIJKPlayerSkyActivity = this.f22989b;
                }
                nSTIJKPlayerSkyActivity.f22953x1.setVisibility(8);
                if (hashMap.get("1") != null) {
                }
                this.f22989b.m18419Z1();
            } catch (Exception e26) {
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            try {
                this.f22989b.m18431l2();
                LinearLayout linearLayout = this.f22989b.f22923r1;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                LinearLayout linearLayout2 = this.f22989b.f22933t1;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                LinearLayout linearLayout3 = this.f22989b.f22938u1;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                }
                LinearLayout linearLayout4 = this.f22989b.f22943v1;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(8);
                }
                LinearLayout linearLayout5 = this.f22989b.f22948w1;
                if (linearLayout5 != null) {
                    linearLayout5.setVisibility(8);
                }
                LinearLayout linearLayout6 = this.f22989b.f22953x1;
                if (linearLayout6 != null) {
                    linearLayout6.setVisibility(0);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$f.class */
    public class RunnableC3773f implements Runnable {

        /* renamed from: b */
        public final String f22990b;

        /* renamed from: c */
        public final String f22991c;

        /* renamed from: d */
        public final int f22992d;

        /* renamed from: e */
        public final NSTIJKPlayerSkyActivity f22993e;

        public RunnableC3773f(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity, String str, String str2, int i10) {
            this.f22993e = nSTIJKPlayerSkyActivity;
            this.f22990b = str;
            this.f22991c = str2;
            this.f22992d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity;
            String str;
            if (this.f22993e.f22848b2.equals("m3u")) {
                this.f22993e.f22859e2.m19352d1(Uri.parse(this.f22990b), NSTIJKPlayerSkyActivity.f22733B3, this.f22991c);
                nSTIJKPlayerSkyActivity = this.f22993e;
                str = this.f22990b;
            } else {
                this.f22993e.f22859e2.m19352d1(Uri.parse(this.f22993e.f22857e + C5255e.m26214Q(((LiveStreamsDBModel) this.f22993e.f22952x0.get(this.f22992d)).m14811R()) + this.f22993e.f22867g0), NSTIJKPlayerSkyActivity.f22733B3, this.f22991c);
                nSTIJKPlayerSkyActivity = this.f22993e;
                str = this.f22993e.f22857e + C5255e.m26214Q(((LiveStreamsDBModel) this.f22993e.f22952x0.get(this.f22992d)).m14811R()) + ".m3u8";
            }
            nSTIJKPlayerSkyActivity.f22910o3 = String.valueOf(Uri.parse(str));
            this.f22993e.f22859e2.f24285I = 0;
            this.f22993e.f22859e2.f24291K = false;
            this.f22993e.f22859e2.start();
            this.f22993e.f22782K1.removeCallbacksAndMessages(null);
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity2 = this.f22993e;
            nSTIJKPlayerSkyActivity2.f22760F = ((LiveStreamsDBModel) nSTIJKPlayerSkyActivity2.f22952x0.get(this.f22992d)).m14798E();
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity3 = this.f22993e;
            nSTIJKPlayerSkyActivity3.f22764G = ((LiveStreamsDBModel) nSTIJKPlayerSkyActivity3.f22952x0.get(this.f22992d)).m14810Q();
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity4 = this.f22993e;
            nSTIJKPlayerSkyActivity4.f22920q3 = nSTIJKPlayerSkyActivity4.f22764G;
            this.f22993e.f22859e2.setCurrentEpgChannelID(this.f22993e.f22760F);
            this.f22993e.f22859e2.setCurrentChannelLogo(this.f22993e.f22764G);
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity5 = this.f22993e;
            nSTIJKPlayerSkyActivity5.m18405L2(nSTIJKPlayerSkyActivity5.f22764G);
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity6 = this.f22993e;
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity7 = this.f22993e;
            nSTIJKPlayerSkyActivity6.f22934t2 = new AsyncTaskC3772e0(nSTIJKPlayerSkyActivity7, nSTIJKPlayerSkyActivity7.f22760F, null).execute(new String[0]);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$g.class */
    public class RunnableC3774g implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerSkyActivity f22994b;

        public RunnableC3774g(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity) {
            this.f22994b = nSTIJKPlayerSkyActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22994b.m18421b2();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$h.class */
    public class RunnableC3775h implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerSkyActivity f22995b;

        public RunnableC3775h(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity) {
            this.f22995b = nSTIJKPlayerSkyActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22995b.m18420a2();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$i.class */
    public class C3776i extends BroadcastReceiver {

        /* renamed from: a */
        public final NSTIJKPlayerSkyActivity f22996a;

        public C3776i(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity) {
            this.f22996a = nSTIJKPlayerSkyActivity;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"media_control".equals(intent.getAction())) {
                return;
            }
            int intExtra = intent.getIntExtra("control_type", 0);
            if (intExtra == 1) {
                this.f22996a.f22859e2.start();
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f22996a.m18408N2(2131231165, "pause", 2, 2);
                    return;
                }
                return;
            }
            if (intExtra != 2) {
                return;
            }
            this.f22996a.f22859e2.pause();
            if (Build.VERSION.SDK_INT >= 26) {
                this.f22996a.m18408N2(2131231136, "play", 1, 1);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$j.class */
    public class C3777j extends NSTIJKPlayerSky.AbstractC3970w {

        /* renamed from: a */
        public final NSTIJKPlayerSkyActivity f22997a;

        public C3777j(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity) {
            this.f22997a = nSTIJKPlayerSkyActivity;
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky.AbstractC3970w
        /* renamed from: a */
        public void mo17780a() {
            this.f22997a.m18408N2(2131231165, "pause", 2, 2);
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky.AbstractC3970w
        /* renamed from: b */
        public void mo17781b() {
            this.f22997a.m18408N2(2131231136, "play", 1, 1);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$k.class */
    public class C3778k implements InterfaceC5993u<C5947e> {

        /* renamed from: a */
        public final NSTIJKPlayerSkyActivity f22998a;

        public C3778k(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity) {
            this.f22998a = nSTIJKPlayerSkyActivity;
        }

        /* renamed from: c */
        public final void m18464c(C5947e c5947e) {
            this.f22998a.f22779J2 = c5947e;
            try {
                C5782l c5782l = new C5782l(1);
                c5782l.m28249V("com.google.android.gms.cast.metadata.TITLE", this.f22998a.f22915p3);
                c5782l.m28253b(new C9691a(Uri.parse(this.f22998a.f22920q3)));
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity = this.f22998a;
                C4718a.m23742b(nSTIJKPlayerSkyActivity.f22791M2, nSTIJKPlayerSkyActivity.f22779J2.m29290r(), this.f22998a.f22910o3, c5782l, this.f22998a.f22853d);
            } catch (Exception e10) {
            }
            this.f22998a.invalidateOptionsMenu();
        }

        /* renamed from: g */
        public final void m18465g() {
            this.f22998a.invalidateOptionsMenu();
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo14735a(C5947e c5947e, int i10) {
            m18465g();
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo14736b(C5947e c5947e) {
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo14740f(C5947e c5947e, int i10) {
            m18465g();
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo14744j(C5947e c5947e, boolean z10) {
            m18464c(c5947e);
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo14746l(C5947e c5947e, String str) {
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void mo14748n(C5947e c5947e, int i10) {
            m18465g();
        }

        @Override // p216m9.InterfaceC5993u
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public void mo14738d(C5947e c5947e, String str) {
            m18464c(c5947e);
        }

        @Override // p216m9.InterfaceC5993u
        @SuppressLint({"SetTextI18n"})
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo14749o(C5947e c5947e) {
            TextView textView;
            StringBuilder sb2;
            String string;
            this.f22998a.f22779J2 = c5947e;
            if (this.f22998a.f22779J2 != null) {
                if (this.f22998a.f22859e2 != null) {
                    this.f22998a.f22859e2.pause();
                }
                LinearLayout linearLayout = this.f22998a.ll_casting_to_tv;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity = this.f22998a;
                if (nSTIJKPlayerSkyActivity.tv_casting_status_text != null) {
                    if (nSTIJKPlayerSkyActivity.f22779J2.m29289q() == null || this.f22998a.f22779J2.m29289q().m13041R() == null) {
                        textView = this.f22998a.tv_casting_status_text;
                        sb2 = new StringBuilder();
                        string = this.f22998a.getResources().getString(2132017518);
                    } else {
                        textView = this.f22998a.tv_casting_status_text;
                        sb2 = new StringBuilder();
                        sb2.append(this.f22998a.getResources().getString(2132017519));
                        sb2.append(" ");
                        string = this.f22998a.f22779J2.m29289q().m13041R();
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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$l.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$l.class */
    public class DialogC3779l extends Dialog implements View.OnClickListener {

        /* renamed from: b */
        public Activity f22999b;

        /* renamed from: c */
        public TextView f23000c;

        /* renamed from: d */
        public TextView f23001d;

        /* renamed from: e */
        public LinearLayout f23002e;

        /* renamed from: f */
        public LinearLayout f23003f;

        /* renamed from: g */
        public RadioGroup f23004g;

        /* renamed from: h */
        public final Activity f23005h;

        /* renamed from: i */
        public final NSTIJKPlayerSkyActivity f23006i;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$l$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$l$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$l$a.class */
        public class a implements View.OnFocusChangeListener {

            /* renamed from: b */
            public View f23007b;

            /* renamed from: c */
            public final DialogC3779l f23008c;

            public a(DialogC3779l dialogC3779l, View view) {
                this.f23008c = dialogC3779l;
                this.f23007b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z10) {
                int i10;
                LinearLayout linearLayout;
                if (z10) {
                    View view2 = this.f23007b;
                    i10 = 2131230846;
                    if (view2 == null || view2.getTag() == null || !this.f23007b.getTag().equals("1")) {
                        View view3 = this.f23007b;
                        if (view3 == null || view3.getTag() == null || !this.f23007b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f23008c.f23003f;
                    }
                    linearLayout = this.f23008c.f23002e;
                } else {
                    View view4 = this.f23007b;
                    i10 = 2131230845;
                    if (view4 == null || view4.getTag() == null || !this.f23007b.getTag().equals("1")) {
                        View view5 = this.f23007b;
                        if (view5 == null || view5.getTag() == null || !this.f23007b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f23008c.f23003f;
                    }
                    linearLayout = this.f23008c.f23002e;
                }
                linearLayout.setBackgroundResource(i10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogC3779l(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity, Activity activity, Activity activity2) {
            super(activity);
            this.f23006i = nSTIJKPlayerSkyActivity;
            this.f23005h = activity2;
            this.f22999b = activity;
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
                    RadioButton radioButton = (RadioButton) findViewById(this.f23004g.getCheckedRadioButtonId());
                    if (radioButton.getText().toString().equals(this.f23005h.getResources().getString(2132018611))) {
                        str = "1";
                        if (this.f23006i.f22930s3.equals("true")) {
                            str2 = "1";
                            SharepreferenceDBHandler.m15358V(str2, this.f23005h);
                        }
                        SharepreferenceDBHandler.m15357U(str, this.f23005h);
                    } else if (radioButton.getText().toString().equals(this.f23005h.getResources().getString(2132018607))) {
                        str = "2";
                        if (this.f23006i.f22930s3.equals("true")) {
                            str2 = "2";
                            SharepreferenceDBHandler.m15358V(str2, this.f23005h);
                        }
                        SharepreferenceDBHandler.m15357U(str, this.f23005h);
                    } else if (radioButton.getText().toString().equals(this.f23005h.getResources().getString(2132018615))) {
                        str = "3";
                        if (this.f23006i.f22930s3.equals("true")) {
                            str2 = "3";
                            SharepreferenceDBHandler.m15358V(str2, this.f23005h);
                        }
                        SharepreferenceDBHandler.m15357U(str, this.f23005h);
                    } else if (radioButton.getText().toString().equals(this.f23005h.getResources().getString(2132018608))) {
                        str = "4";
                        if (this.f23006i.f22930s3.equals("true")) {
                            str2 = "4";
                            SharepreferenceDBHandler.m15358V(str2, this.f23005h);
                        }
                        SharepreferenceDBHandler.m15357U(str, this.f23005h);
                    } else if (radioButton.getText().toString().equals(this.f23005h.getResources().getString(2132018609))) {
                        str = "5";
                        if (this.f23006i.f22930s3.equals("true")) {
                            str2 = "5";
                            SharepreferenceDBHandler.m15358V(str2, this.f23005h);
                        }
                        SharepreferenceDBHandler.m15357U(str, this.f23005h);
                    } else if (this.f23006i.f22930s3.equals("true")) {
                        SharepreferenceDBHandler.m15358V("0", this.f23005h);
                    } else {
                        SharepreferenceDBHandler.m15357U("0", this.f23005h);
                    }
                    if (this.f23006i.f22850c1.equals("0")) {
                        this.f23006i.m18445w1();
                    } else {
                        String str3 = this.f23006i.f22850c1;
                        if (str3 == null || str3.equals("") || !this.f23006i.f22850c1.equals("-1")) {
                            String str4 = this.f23006i.f22850c1;
                            if (str4 == null || str4.equals("") || !this.f23006i.f22850c1.equals("-6")) {
                                this.f23006i.m18449y1();
                            } else {
                                this.f23006i.m18389D1();
                            }
                        } else {
                            this.f23006i.m18387C1();
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
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.DialogC3779l.onCreate(android.os.Bundle):void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$m.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$m */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$m.class */
    public class DialogInterfaceOnClickListenerC3780m implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerSkyActivity f23009b;

        public DialogInterfaceOnClickListenerC3780m(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity) {
            this.f23009b = nSTIJKPlayerSkyActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$n.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$n */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$n.class */
    public class DialogInterfaceOnClickListenerC3781n implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerSkyActivity f23010b;

        public DialogInterfaceOnClickListenerC3781n(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity) {
            this.f23010b = nSTIJKPlayerSkyActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f23010b.f22853d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$o.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$o */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$o.class */
    public class C3782o implements SearchView.InterfaceC0282l {

        /* renamed from: a */
        public final NSTIJKPlayerSkyActivity f23011a;

        public C3782o(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity) {
            this.f23011a = nSTIJKPlayerSkyActivity;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextChange(String str) {
            NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity = this.f23011a;
            if (nSTIJKPlayerSkyActivity.f22740A) {
                nSTIJKPlayerSkyActivity.f22740A = false;
                return false;
            }
            nSTIJKPlayerSkyActivity.f22789M0.setVisibility(8);
            C5867t c5867t = this.f23011a.f22808R;
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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$p.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$p */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$p.class */
    public class DialogInterfaceOnClickListenerC3783p implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerSkyActivity f23012b;

        public DialogInterfaceOnClickListenerC3783p(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity) {
            this.f23012b = nSTIJKPlayerSkyActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            this.f23012b.m18442u2();
            C5255e.m26210M(this.f23012b.f22853d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$q.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$q */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$q.class */
    public class DialogInterfaceOnClickListenerC3784q implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerSkyActivity f23013b;

        public DialogInterfaceOnClickListenerC3784q(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity) {
            this.f23013b = nSTIJKPlayerSkyActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$r.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$r */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$r.class */
    public class C3785r implements InterfaceC5950f {

        /* renamed from: a */
        public final NSTIJKPlayerSkyActivity f23014a;

        public C3785r(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity) {
            this.f23014a = nSTIJKPlayerSkyActivity;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$s.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$s */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$s.class */
    public class ViewOnClickListenerC3786s implements View.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerSkyActivity f23015b;

        public ViewOnClickListenerC3786s(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity) {
            this.f23015b = nSTIJKPlayerSkyActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f23015b.m18410P1(true);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$t.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$t */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$t.class */
    public class ViewOnClickListenerC3787t implements View.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerSkyActivity f23016b;

        public ViewOnClickListenerC3787t(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity) {
            this.f23016b = nSTIJKPlayerSkyActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f23016b.f22853d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$u.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$u */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$u.class */
    public class ViewOnClickListenerC3788u implements View.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerSkyActivity f23017b;

        public ViewOnClickListenerC3788u(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity) {
            this.f23017b = nSTIJKPlayerSkyActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f23017b.onBackPressed();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$v.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$v */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$v.class */
    public class ViewOnClickListenerC3789v implements View.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerSkyActivity f23018b;

        public ViewOnClickListenerC3789v(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity) {
            this.f23018b = nSTIJKPlayerSkyActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                this.f23018b.f22874h2 = Boolean.TRUE;
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", this.f23018b.getPackageName(), null));
                this.f23018b.startActivityForResult(intent, 101);
                NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity = this.f23018b;
                Toast.makeText(nSTIJKPlayerSkyActivity, nSTIJKPlayerSkyActivity.f22853d.getResources().getString(2132017828), 1).show();
            } catch (Exception e10) {
            }
            this.f23018b.f22879i2.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$w.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$w */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$w.class */
    public class ViewOnClickListenerC3790w implements View.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerSkyActivity f23019b;

        public ViewOnClickListenerC3790w(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity) {
            this.f23019b = nSTIJKPlayerSkyActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f23019b.f22879i2.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$x.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$x */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$x.class */
    public class RunnableC3791x implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerSkyActivity f23020b;

        public RunnableC3791x(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity) {
            this.f23020b = nSTIJKPlayerSkyActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String date = Calendar.getInstance().getTime().toString();
                String m26199B = C5255e.m26199B(this.f23020b.f22853d);
                String m26249p = C5255e.m26249p(date);
                TextView textView = this.f23020b.f22766G1;
                if (textView != null) {
                    textView.setText(m26199B);
                }
                TextView textView2 = this.f23020b.f22758E1;
                if (textView2 != null) {
                    textView2.setText(m26249p);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$y.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$y */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$y.class */
    public class C3792y implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        public final ArrayList f23021b;

        /* renamed from: c */
        public final NSTIJKPlayerSkyActivity f23022c;

        public C3792y(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity, ArrayList arrayList) {
            this.f23022c = nSTIJKPlayerSkyActivity;
            this.f23021b = arrayList;
        }

        /* JADX WARN: Removed duplicated region for block: B:58:0x1088  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x10d4  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x1102  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x1130  */
        @Override // android.widget.AdapterView.OnItemClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onItemClick(android.widget.AdapterView<?> r7, android.view.View r8, int r9, long r10) {
            /*
                Method dump skipped, instructions count: 4456
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.C3792y.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$z.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity$z */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyActivity$z.class */
    public class RunnableC3793z implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerSkyActivity f23023b;

        public RunnableC3793z(NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity) {
            this.f23023b = nSTIJKPlayerSkyActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f23023b.m18407N1();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                } catch (Exception e11) {
                }
            }
        }
    }

    public NSTIJKPlayerSkyActivity() {
        Boolean bool = Boolean.FALSE;
        this.f22826V1 = bool;
        this.f22830W1 = bool;
        this.f22845a2 = "";
        this.f22869g2 = "";
        this.f22874h2 = bool;
        this.f22884j2 = "";
        Boolean bool2 = Boolean.TRUE;
        this.f22889k2 = bool2;
        this.f22894l2 = null;
        this.f22904n2 = -1;
        this.f22909o2 = 0;
        this.f22914p2 = "";
        this.f22919q2 = bool2;
        this.f22924r2 = null;
        this.f22929s2 = null;
        this.f22934t2 = null;
        this.f22939u2 = false;
        this.f22944v2 = 0;
        this.f22949w2 = false;
        this.f22954x2 = 4;
        this.f22959y2 = f22736E3[0];
        this.f22743A2 = bool;
        this.f22747B2 = bool;
        this.f22751C2 = bool;
        this.f22755D2 = bool;
        this.f22759E2 = bool;
        this.f22763F2 = bool;
        this.f22799O2 = 0;
        this.f22803P2 = "0";
        this.f22807Q2 = "0";
        this.f22811R2 = bool2;
        this.f22849b3 = "mobile";
        this.f22865f3 = "0";
        this.f22870g3 = "0";
        this.f22875h3 = 0;
        this.f22890k3 = false;
        this.f22895l3 = false;
        this.f22910o3 = "";
        this.f22915p3 = "";
        this.f22920q3 = "";
        this.f22925r3 = false;
        this.f22930s3 = "false";
        this.f22940u3 = C5251a.f30033c0;
        this.f22950w3 = "-10";
        this.f22955x3 = null;
        this.f22960y3 = new C3777j(this);
    }

    /* renamed from: L1 */
    public static boolean m18339L1() {
        ProgressBar progressBar = f22738G3;
        return progressBar != null && progressBar.getVisibility() == 0;
    }

    /* renamed from: M1 */
    public static long m18341M1(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: Q1 */
    public static String m18346Q1(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    /* renamed from: A1 */
    public void m18383A1() {
        m18403K1();
        this.f22924r2 = new AsyncTaskC3768c0(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels_with_cat");
    }

    /* renamed from: A2 */
    public final void m18384A2() {
        this.f22775I2 = new C3778k(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x014a, code lost:
    
        if (r6.f22942v0.get(r7).m14816W().equals(r18) != false) goto L39;
     */
    /* renamed from: B1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m18385B1() {
        /*
            Method dump skipped, instructions count: 925
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.m18385B1():java.lang.String");
    }

    /* renamed from: B2 */
    public final void m18386B2() {
        String str;
        String str2;
        RecyclerView recyclerView;
        this.ll_player_header_footer.startAnimation(this.f22839Y2);
        this.ll_player_header_footer.setVisibility(8);
        this.rl_episodes_box.startAnimation(this.f22880i3);
        this.rl_episodes_box.setVisibility(0);
        this.ll_pb_left_categories.setVisibility(0);
        this.recycler_view_left_sidebar.setVisibility(8);
        this.f22776J.setVisibility(8);
        if (this.f22852c3 != null && (recyclerView = this.recycler_view_left_sidebar) != null) {
            recyclerView.setAdapter(null);
        }
        String str3 = this.f22950w3;
        if ((str3 != null && str3.equals("-1")) || (((str = this.f22950w3) != null && str.equals("0")) || ((str2 = this.f22950w3) != null && str2.equals("-6")))) {
            String str4 = this.f22950w3;
            this.f22803P2 = str4;
            this.f22807Q2 = str4;
        }
        this.f22852c3 = new C5864q(this.f22853d, this.f22803P2, "player", this.f22930s3);
        this.f22807Q2 = this.f22803P2;
        this.recycler_view_left_sidebar.setVisibility(0);
        m18383A1();
        this.recycler_view_left_sidebar.setAdapter(this.f22852c3);
        this.recycler_view_left_sidebar.setLayoutManager(this.f22860e3);
    }

    /* renamed from: C1 */
    public void m18387C1() {
        m18403K1();
        this.f22924r2 = new AsyncTaskC3766b0(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_fav");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ba  */
    @android.annotation.SuppressLint({"SetTextI18n"})
    /* renamed from: C2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> m18388C2(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 1425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.m18388C2(java.lang.String):java.util.HashMap");
    }

    /* renamed from: D1 */
    public void m18389D1() {
        m18403K1();
        this.f22924r2 = new AsyncTaskC3766b0(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "recently_watched");
    }

    /* renamed from: D2 */
    public void m18390D2() {
        if (f22737F3 || this.ll_player_header_footer.getVisibility() != 8) {
            return;
        }
        this.ll_player_header_footer.startAnimation(this.f22835X2);
        this.ll_player_header_footer.setVisibility(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0147, code lost:
    
        if (r6.f22932t0.get(r7).m14816W().equals(r18) != false) goto L42;
     */
    /* renamed from: E1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m18391E1() {
        /*
            Method dump skipped, instructions count: 922
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.m18391E1():java.lang.String");
    }

    /* renamed from: E2 */
    public void m18392E2() {
        if (f22737F3 || this.ll_player_header_footer.getVisibility() != 8) {
            return;
        }
        this.ll_player_header_footer.startAnimation(this.f22835X2);
        this.ll_player_header_footer.setVisibility(0);
        if (this.ll_brightness.getVisibility() == 8) {
            this.ll_brightness.startAnimation(this.f22835X2);
            this.ll_brightness.setVisibility(0);
        }
        if (this.tv_seek_left.getVisibility() == 8) {
            this.tv_seek_left.startAnimation(this.f22835X2);
            this.tv_seek_left.setVisibility(0);
        }
        if (this.ll_pause_play.getVisibility() == 8) {
            this.ll_pause_play.startAnimation(this.f22835X2);
            this.ll_pause_play.setVisibility(0);
        }
        if (this.tv_seek_right.getVisibility() == 8) {
            this.tv_seek_right.startAnimation(this.f22835X2);
            this.tv_seek_right.setVisibility(0);
        }
        if (this.ll_volume.getVisibility() == 8) {
            this.ll_volume.startAnimation(this.f22835X2);
            this.ll_volume.setVisibility(0);
        }
    }

    /* renamed from: F1 */
    public final void m18393F1(int i10) {
        if (f22737F3) {
            return;
        }
        this.f22859e2.f24338c1 = new RunnableC3775h(this);
        NSTIJKPlayerSky nSTIJKPlayerSky = this.f22859e2;
        nSTIJKPlayerSky.f24336b1.postDelayed(nSTIJKPlayerSky.f24338c1, i10);
    }

    /* renamed from: F2 */
    public final void m18394F2() {
        LinearLayout linearLayout = this.f22956y;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
    }

    /* renamed from: G1 */
    public void m18395G1(int i10) {
        if (f22737F3) {
            return;
        }
        this.f22859e2.f24338c1 = new RunnableC3774g(this);
        NSTIJKPlayerSky nSTIJKPlayerSky = this.f22859e2;
        nSTIJKPlayerSky.f24336b1.postDelayed(nSTIJKPlayerSky.f24338c1, i10);
    }

    /* renamed from: G2 */
    public final void m18396G2() {
        ProgressBar progressBar = this.f22951x;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    /* renamed from: H1 */
    public void m18397H1() {
        m18426g2();
        this.f22939u2 = false;
        this.f22944v2 = 0;
        AsyncTask asyncTask = this.f22929s2;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            ArrayList<LiveStreamCategoryIdDBModel> arrayList = this.f22907o0;
            if (arrayList != null && arrayList.size() > 0) {
                int i10 = this.f22877i0;
                if (i10 == 0) {
                    i10 = this.f22907o0.size();
                }
                this.f22877i0 = i10 - 1;
                if (this.f22877i0 != 0 || this.f22932t0 == null) {
                    ArrayList<LiveStreamCategoryIdDBModel> arrayList2 = this.f22907o0;
                    if (arrayList2 == null || arrayList2.size() <= 0 || this.f22877i0 >= this.f22907o0.size()) {
                        return;
                    }
                    String m14787b = this.f22907o0.get(this.f22877i0).m14787b();
                    String m14788c = this.f22907o0.get(this.f22877i0).m14788c();
                    this.f22850c1 = m14787b;
                    this.f22854d1 = m14788c;
                    if (m14787b != null && !m14787b.equals("") && this.f22850c1.equals("-1")) {
                        m18387C1();
                        return;
                    }
                    String str = this.f22850c1;
                    if (str == null || str.equals("") || !this.f22850c1.equals("-6")) {
                        m18449y1();
                        return;
                    } else {
                        m18389D1();
                        return;
                    }
                }
                if (this.f22850c1.equals("0")) {
                    return;
                }
                this.f22850c1 = "0";
                this.f22854d1 = this.f22853d.getResources().getString(2132017297);
            }
            m18445w1();
        }
    }

    /* renamed from: H2 */
    public final void m18398H2() {
        if (this.rl_settings_box.getVisibility() == 8) {
            this.rl_settings_box.startAnimation(this.f22843Z2);
            this.rl_settings_box.setVisibility(0);
            this.iv_back_settings.requestFocus();
        }
    }

    /* renamed from: I1 */
    public String m18399I1(String str) {
        ArrayList<LiveStreamCategoryIdDBModel> arrayList = this.f22907o0;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<LiveStreamCategoryIdDBModel> it = this.f22907o0.iterator();
            while (it.hasNext()) {
                LiveStreamCategoryIdDBModel next = it.next();
                if (next.m14787b() != null && !next.m14787b().isEmpty() && next.m14787b().equalsIgnoreCase(str)) {
                    this.f22854d1 = next.m14788c();
                }
            }
        }
        return this.f22854d1;
    }

    /* renamed from: I2 */
    public final void m18400I2(Activity activity) {
        new DialogC3779l(this, (NSTIJKPlayerSkyActivity) activity, activity).show();
    }

    /* renamed from: J1 */
    public void m18401J1(int i10, String str, String str2) {
        RecyclerView recyclerView = this.recycler_view_left_sidebar;
        if (recyclerView != null) {
            recyclerView.mo2557n1(i10);
        }
    }

    /* renamed from: J2 */
    public final void m18402J2() {
        ListView listView;
        try {
            if (C5251a.f30008G.booleanValue()) {
                findViewById(2131427469).setOnClickListener(this);
            }
            this.f22829W0.setVisibility(0);
            this.f22833X0.setVisibility(0);
            this.f22837Y0.setVisibility(0);
            this.f22841Z0.setVisibility(0);
            this.f22844a1.setVisibility(0);
            this.f22821U0.setVisibility(0);
            getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f22847b1.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = 0;
            this.f22847b1.setLayoutParams(layoutParams);
            getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
            f22733B3 = false;
            if (this.f22805Q0) {
                if (!this.f22809R0 || this.f22813S0.equals("")) {
                    SharedPreferences sharedPreferences = getSharedPreferences("currentlyPlayingVideoPosition", 0);
                    this.f22828W = sharedPreferences;
                    this.f22772I.setSelection(sharedPreferences.getInt("currentlyPlayingVideoPosition", 0));
                    this.f22805Q0 = false;
                    this.f22809R0 = false;
                } else {
                    String str = this.f22850c1;
                    if (str != null && !str.equals("") && this.f22850c1.equals("0")) {
                        m18445w1();
                    }
                }
                listView = this.f22772I;
                if (listView == null) {
                    return;
                }
            } else {
                listView = this.f22772I;
                if (listView == null) {
                    return;
                }
            }
            listView.requestFocus();
        } catch (Exception e10) {
            Log.e("exection", "" + e10);
        }
    }

    /* renamed from: K1 */
    public final void m18403K1() {
        AsyncTask asyncTask = this.f22924r2;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            SharepreferenceDBHandler.m15348L(0, this.f22853d);
        } else {
            SharepreferenceDBHandler.m15348L(1, this.f22853d);
            this.f22924r2.cancel(true);
        }
    }

    /* renamed from: K2 */
    public void m18404K2() {
        Handler handler;
        if (f22737F3 || (handler = this.f22859e2.f24336b1) == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    /* renamed from: L2 */
    public void m18405L2(String str) {
        if (str != null) {
            try {
                if (!str.equals("")) {
                    if (this.f22916q != null) {
                        C10014t.m42105q(this.f22853d).m42116l(str).m42155k(80, 55).m42154j(2131231571).m42151g(this.f22916q);
                    }
                }
            } catch (Exception e10) {
                try {
                    ImageView imageView = this.f22916q;
                    if (imageView != null) {
                        imageView.setImageDrawable(this.f22853d.getResources().getDrawable(2131231571, null));
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    return;
                }
            }
        }
        ImageView imageView2 = this.f22916q;
        if (imageView2 != null) {
            imageView2.setImageDrawable(this.f22853d.getResources().getDrawable(2131231571, null));
        }
    }

    /* renamed from: M2 */
    public void m18406M2(String str, String str2, LiveStreamDBHandler liveStreamDBHandler, Context context, ProgressBar progressBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12) {
        this.f22800P = liveStreamDBHandler;
        this.f22853d = context;
        this.f22946w = progressBar;
        this.f22921r = textView;
        this.f22926s = textView2;
        this.f22931t = textView3;
        this.f22936u = textView4;
        this.f22916q = imageView;
        this.f22923r1 = linearLayout;
        this.f22933t1 = linearLayout2;
        this.f22938u1 = linearLayout3;
        this.f22943v1 = linearLayout4;
        this.f22948w1 = linearLayout5;
        this.f22953x1 = linearLayout6;
        this.f22858e1 = textView5;
        this.f22868g1 = textView6;
        this.f22883j1 = textView7;
        this.f22893l1 = textView8;
        this.f22903n1 = textView9;
        this.f22908o1 = textView10;
        this.f22913p1 = textView11;
        this.f22918q1 = textView12;
        SharedPreferences sharedPreferences = context.getSharedPreferences("timeFormat", 0);
        f22739z3 = sharedPreferences;
        this.f22862f0 = new SimpleDateFormat(sharedPreferences.getString("timeFormat", C5251a.f30053m0), Locale.US);
        m18405L2(str2);
        this.f22934t2 = new AsyncTaskC3772e0(this, str, null).execute(new String[0]);
    }

    /* renamed from: N1 */
    public void m18407N1() {
        runOnUiThread(new RunnableC3791x(this));
    }

    /* renamed from: N2 */
    public void m18408N2(int i10, String str, int i11, int i12) {
        try {
            if (this.f22849b3.equals("mobile") && this.f22890k3 && this.f22940u3) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new RemoteAction(Icon.createWithResource(this, i10), str, str, PendingIntent.getBroadcast(this, i12, new Intent("media_control").putExtra("control_type", i11), 0)));
                this.f22900m3.setActions(arrayList);
                setPictureInPictureParams(this.f22900m3.build());
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: O1 */
    public final void m18409O1() {
        ImageView imageView = this.iv_play;
        imageView.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3770d0(this, imageView));
        ImageView imageView2 = this.iv_pause;
        imageView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3770d0(this, imageView2));
        ImageView imageView3 = this.iv_back;
        imageView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3770d0(this, imageView3));
        ImageView imageView4 = this.iv_audio_subtitle_track;
        imageView4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3770d0(this, imageView4));
        ImageView imageView5 = this.iv_hp_play_from_beginning;
        imageView5.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3770d0(this, imageView5));
        LinearLayout linearLayout = this.ll_channels_list;
        linearLayout.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3770d0(this, linearLayout));
        LinearLayout linearLayout2 = this.ll_crop;
        linearLayout2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3770d0(this, linearLayout2));
        LinearLayout linearLayout3 = this.ll_multi_screen;
        linearLayout3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3770d0(this, linearLayout3));
        ImageView imageView6 = this.iv_back_episodes;
        imageView6.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3770d0(this, imageView6));
        ImageView imageView7 = this.iv_back_settings;
        imageView7.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3770d0(this, imageView7));
        ImageView imageView8 = this.iv_hp_lock;
        imageView8.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3770d0(this, imageView8));
        ImageView imageView9 = this.iv_hp_lock;
        imageView9.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3770d0(this, imageView9));
    }

    /* renamed from: P1 */
    public void m18410P1(boolean z10) {
        f22733B3 = z10;
        String m15383k = SharepreferenceDBHandler.m15383k(this.f22853d);
        if (!SharepreferenceDBHandler.m15385l(this.f22853d).equals(CookieSpecs.DEFAULT) && !new ExternalPlayerDataBase(this.f22853d).m15130f(m15383k)) {
            SharepreferenceDBHandler.m15356T(CookieSpecs.DEFAULT, CookieSpecs.DEFAULT, this.f22853d);
        }
        String m15385l = SharepreferenceDBHandler.m15385l(this.f22853d);
        if (!z10 || m15385l == null || m15385l.equalsIgnoreCase(CookieSpecs.DEFAULT)) {
            if (C5251a.f30008G.booleanValue()) {
                Toolbar toolbar = this.f22781K0;
                if (toolbar != null) {
                    toolbar.setVisibility(8);
                }
                findViewById(2131427469).setOnClickListener(null);
                this.f22829W0.setVisibility(8);
                this.f22833X0.setVisibility(8);
                this.f22837Y0.setVisibility(8);
                this.f22841Z0.setVisibility(8);
                this.f22844a1.setVisibility(8);
                getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f22847b1.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                this.f22847b1.setLayoutParams(layoutParams);
                getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
                this.f22821U0.setVisibility(8);
                NSTIJKPlayerSky nSTIJKPlayerSky = this.f22859e2;
                ((nSTIJKPlayerSky == null || !nSTIJKPlayerSky.isPlaying()) ? this.f22861f : this.f22866g).requestFocus();
                return;
            }
            return;
        }
        m18442u2();
        this.f22949w2 = true;
        SharedPreferences sharedPreferences = getSharedPreferences("currentlyPlayingVideoPosition", 0);
        this.f22828W = sharedPreferences;
        int i10 = sharedPreferences.getInt("currentlyPlayingVideoPosition", 0);
        ArrayList<LiveStreamsDBModel> m28615e = this.f22808R.m28615e();
        this.f22806Q1 = i10;
        if (m28615e == null || m28615e.size() <= 0 || this.f22806Q1 >= m28615e.size()) {
            ArrayList<LiveStreamsDBModel> arrayList = this.f22932t0;
            if (arrayList != null && arrayList.size() > 0 && this.f22806Q1 < this.f22932t0.size()) {
                this.f22904n2 = C5255e.m26215R(this.f22932t0.get(this.f22806Q1).m14811R());
                this.f22851c2 = this.f22932t0.get(this.f22806Q1).m14816W();
                this.f22932t0.get(this.f22806Q1).getName();
            }
        } else {
            this.f22904n2 = C5255e.m26215R(m28615e.get(this.f22806Q1).m14811R());
            this.f22851c2 = m28615e.get(this.f22806Q1).m14816W();
        }
        this.f22752D = this.f22904n2;
        this.f22756E = this.f22851c2;
        f22733B3 = false;
        NSTIJKPlayerSky nSTIJKPlayerSky2 = this.f22859e2;
        if (nSTIJKPlayerSky2 != null) {
            nSTIJKPlayerSky2.m19335M0(Boolean.FALSE);
        }
        if (this.f22848b2.equals("m3u")) {
            if (this.f22889k2.booleanValue()) {
                String m15383k2 = SharepreferenceDBHandler.m15383k(this.f22853d);
                Intent intent = new Intent(this.f22853d, (Class<?>) PlayExternalPlayerActivity.class);
                intent.putExtra("url", this.f22756E);
                intent.putExtra("packagename", m15385l);
                intent.putExtra("app_name", m15383k2);
                this.f22853d.startActivity(intent);
                return;
            }
            return;
        }
        if (this.f22904n2 == -1 || !this.f22889k2.booleanValue()) {
            return;
        }
        String m26203F = C5255e.m26203F(this.f22853d, this.f22904n2, this.f22867g0, "live");
        String m15383k3 = SharepreferenceDBHandler.m15383k(this.f22853d);
        Intent intent2 = new Intent(this.f22853d, (Class<?>) PlayExternalPlayerActivity.class);
        intent2.putExtra("url", m26203F);
        intent2.putExtra("packagename", m15385l);
        intent2.putExtra("app_name", m15383k3);
        this.f22853d.startActivity(intent2);
    }

    /* renamed from: R1 */
    public void m18411R1() {
        DatabaseHandler databaseHandler;
        Context context;
        ArrayList<LiveStreamsDBModel> arrayList;
        try {
            String str = "live";
            if (this.f22848b2.equals("m3u")) {
                new ArrayList();
                LiveStreamDBHandler liveStreamDBHandler = this.f22800P;
                if (liveStreamDBHandler == null) {
                    return;
                }
                ArrayList<FavouriteM3UModel> m15175K1 = liveStreamDBHandler.m15175K1("live");
                ArrayList<LiveStreamsDBModel> arrayList2 = new ArrayList<>();
                ArrayList<String> arrayList3 = this.f22745B0;
                ArrayList<FavouriteM3UModel> arrayList4 = m15175K1;
                if (arrayList3 != null) {
                    arrayList4 = m15175K1;
                    if (arrayList3.size() > 0) {
                        arrayList4 = m15175K1;
                        if (m15175K1 != null) {
                            arrayList4 = m15175K1;
                            if (m15175K1.size() > 0) {
                                arrayList4 = m18418Y1(m15175K1, this.f22745B0);
                            }
                        }
                    }
                }
                Iterator<FavouriteM3UModel> it = arrayList4.iterator();
                while (it.hasNext()) {
                    FavouriteM3UModel next = it.next();
                    ArrayList<LiveStreamsDBModel> m15183O1 = this.f22800P.m15183O1(next.m14775a(), next.m14777c());
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
                if (this.f22746B1 == null) {
                    return;
                }
                if (this.f22930s3.equals("true")) {
                    databaseHandler = this.f22746B1;
                    str = "radio_streams";
                    context = this.f22853d;
                } else {
                    databaseHandler = this.f22746B1;
                    context = this.f22853d;
                }
                ArrayList<FavouriteDBModel> m15116v = databaseHandler.m15116v(str, SharepreferenceDBHandler.m15337A(context));
                ArrayList<LiveStreamsDBModel> arrayList5 = new ArrayList<>();
                ArrayList<String> arrayList6 = this.f22745B0;
                ArrayList<FavouriteDBModel> arrayList7 = m15116v;
                if (arrayList6 != null) {
                    arrayList7 = m15116v;
                    if (arrayList6.size() > 0) {
                        arrayList7 = m15116v;
                        if (m15116v != null) {
                            arrayList7 = m15116v;
                            if (m15116v.size() > 0) {
                                arrayList7 = m18417X1(m15116v, this.f22745B0);
                            }
                        }
                    }
                }
                Iterator<FavouriteDBModel> it2 = arrayList7.iterator();
                while (it2.hasNext()) {
                    FavouriteDBModel next2 = it2.next();
                    LiveStreamsDBModel m15179M1 = new LiveStreamDBHandler(this.f22853d).m15179M1(next2.m14760a(), String.valueOf(next2.m14764e()));
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
            this.f22780K = arrayList;
        } catch (Exception e10) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x012e, code lost:
    
        if (r6.f22932t0.get(r7).m14816W().equals(r18) != false) goto L34;
     */
    /* renamed from: S1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m18412S1() {
        /*
            Method dump skipped, instructions count: 889
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.m18412S1():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x02f7, code lost:
    
        if (r6.f22942v0.get(r7).m14816W().equals(r18) != false) goto L104;
     */
    /* renamed from: T1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m18413T1() {
        /*
            Method dump skipped, instructions count: 1363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.m18413T1():java.lang.String");
    }

    /* renamed from: U1 */
    public int m18414U1(ArrayList<LiveStreamsDBModel> arrayList, int i10) {
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

    /* renamed from: V1 */
    public final ArrayList<String> m18415V1() {
        ArrayList<PasswordStatusDBModel> m15232m1 = this.f22800P.m15232m1(SharepreferenceDBHandler.m15337A(this.f22853d));
        this.f22753D0 = m15232m1;
        if (m15232m1 != null) {
            Iterator<PasswordStatusDBModel> it = m15232m1.iterator();
            while (it.hasNext()) {
                PasswordStatusDBModel next = it.next();
                if (next.m15290a().equals("1")) {
                    this.f22745B0.add(next.m15291b());
                }
            }
        }
        return this.f22745B0;
    }

    /* renamed from: W1 */
    public final boolean m18416W1(ArrayList<LiveStreamsDBModel> arrayList, ArrayList<String> arrayList2) {
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

    /* renamed from: X1 */
    public final ArrayList<FavouriteDBModel> m18417X1(ArrayList<FavouriteDBModel> arrayList, ArrayList<String> arrayList2) {
        boolean z10;
        try {
            this.f22765G0 = new ArrayList<>();
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
                    this.f22765G0.add(next);
                }
            }
        } catch (Exception e10) {
        }
        return this.f22765G0;
    }

    /* renamed from: Y1 */
    public final ArrayList<FavouriteM3UModel> m18418Y1(ArrayList<FavouriteM3UModel> arrayList, ArrayList<String> arrayList2) {
        boolean z10;
        this.f22769H0 = new ArrayList<>();
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
                        this.f22769H0.add(next);
                    }
                }
            }
            return this.f22769H0;
        } catch (Exception e10) {
            return null;
        }
    }

    /* renamed from: Z1 */
    public final void m18419Z1() {
        ProgressBar progressBar = this.f22946w;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
        TextView textView = this.f22921r;
        if (textView != null) {
            textView.setText(this.f22853d.getResources().getString(2132018252));
        }
        TextView textView2 = this.f22926s;
        if (textView2 != null) {
            textView2.setText("");
        }
        TextView textView3 = this.f22931t;
        if (textView3 != null) {
            textView3.setText(this.f22853d.getResources().getString(2132018186));
        }
        TextView textView4 = this.f22936u;
        if (textView4 != null) {
            textView4.setText("");
        }
    }

    /* renamed from: a2 */
    public final void m18420a2() {
        if (this.ll_player_header_footer.getVisibility() == 0) {
            this.ll_player_header_footer.startAnimation(this.f22839Y2);
            if (this.ll_brightness.getVisibility() == 0) {
                this.ll_brightness.startAnimation(this.f22839Y2);
            }
            if (this.tv_seek_left.getVisibility() == 0) {
                this.tv_seek_left.startAnimation(this.f22839Y2);
            }
            if (this.ll_pause_play.getVisibility() == 0) {
                this.ll_pause_play.startAnimation(this.f22839Y2);
            }
            if (this.tv_seek_right.getVisibility() == 0) {
                this.tv_seek_right.startAnimation(this.f22839Y2);
            }
            if (this.ll_volume.getVisibility() == 0) {
                this.ll_volume.startAnimation(this.f22839Y2);
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

    /* renamed from: b2 */
    public void m18421b2() {
        if (f22737F3 || this.ll_player_header_footer.getVisibility() != 0) {
            return;
        }
        this.ll_player_header_footer.startAnimation(this.f22839Y2);
        if (this.ll_brightness.getVisibility() == 0) {
            this.ll_brightness.startAnimation(this.f22839Y2);
        }
        if (this.tv_seek_left.getVisibility() == 0) {
            this.tv_seek_left.startAnimation(this.f22839Y2);
        }
        if (this.ll_pause_play.getVisibility() == 0) {
            this.ll_pause_play.startAnimation(this.f22839Y2);
        }
        if (this.tv_seek_right.getVisibility() == 0) {
            this.tv_seek_right.startAnimation(this.f22839Y2);
        }
        if (this.ll_volume.getVisibility() == 0) {
            this.ll_volume.startAnimation(this.f22839Y2);
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

    /* renamed from: c2 */
    public final void m18422c2() {
        LinearLayout linearLayout = this.f22956y;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    /* renamed from: d2 */
    public final void m18423d2() {
        ProgressBar progressBar = this.f22951x;
        if (progressBar != null) {
            progressBar.setVisibility(8);
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

    /* renamed from: e2 */
    public void m18424e2() {
        LinearLayout linearLayout = this.ll_no_cat_found;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    /* renamed from: f2 */
    public final void m18425f2() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception e10) {
        }
    }

    /* renamed from: g2 */
    public final void m18426g2() {
        try {
            this.f22740A = true;
            this.f22781K0.m1205e();
            TextView textView = this.f22789M0;
            if (textView == null || this.f22744B) {
                return;
            }
            textView.setVisibility(8);
        } catch (Exception e10) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h2 */
    public final boolean m18427h2() {
        boolean z10;
        try {
            this.f22749C0 = this.f22930s3.equals("true") ? this.f22800P.m15268z1() : this.f22800P.m15263x1();
            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel2 = new LiveStreamCategoryIdDBModel();
            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel3 = new LiveStreamCategoryIdDBModel();
            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel4 = new LiveStreamCategoryIdDBModel();
            liveStreamCategoryIdDBModel.m14792g("0");
            liveStreamCategoryIdDBModel.m14793h(this.f22853d.getResources().getString(2132017297));
            liveStreamCategoryIdDBModel2.m14792g("-1");
            liveStreamCategoryIdDBModel2.m14793h(this.f22853d.getResources().getString(2132017779));
            if (this.f22848b2.equals("m3u")) {
                int m15218f2 = this.f22800P.m15218f2("live");
                this.f22822U1 = m15218f2;
                if (m15218f2 != 0 && m15218f2 > 0) {
                    liveStreamCategoryIdDBModel3.m14792g("");
                    liveStreamCategoryIdDBModel3.m14793h(this.f22853d.getResources().getString(2132018731));
                    ArrayList<LiveStreamCategoryIdDBModel> arrayList = this.f22749C0;
                    arrayList.add(arrayList.size(), liveStreamCategoryIdDBModel3);
                }
            } else if (this.f22930s3.equals("false")) {
                int m15211c2 = this.f22800P.m15211c2("-2", "live");
                this.f22822U1 = m15211c2;
                if (m15211c2 != 0 && m15211c2 > 0) {
                    liveStreamCategoryIdDBModel3.m14792g("-2");
                    liveStreamCategoryIdDBModel3.m14793h(this.f22853d.getResources().getString(2132018731));
                    ArrayList<LiveStreamCategoryIdDBModel> arrayList2 = this.f22749C0;
                    arrayList2.add(arrayList2.size(), liveStreamCategoryIdDBModel3);
                }
            }
            liveStreamCategoryIdDBModel4.m14792g("-6");
            liveStreamCategoryIdDBModel4.m14793h(getResources().getString(2132018441));
            ArrayList<LiveStreamCategoryIdDBModel> arrayList3 = this.f22749C0;
            if (arrayList3 != null) {
                arrayList3.add(0, liveStreamCategoryIdDBModel);
                this.f22749C0.add(1, liveStreamCategoryIdDBModel2);
                this.f22749C0.add(2, liveStreamCategoryIdDBModel4);
                this.f22907o0 = this.f22749C0;
            }
            String str = this.f22914p2;
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
                this.f22850c1 = "0";
                this.f22854d1 = this.f22853d.getResources().getString(2132017297);
                try {
                    this.f22877i0 = 0;
                    return true;
                } catch (Exception e10) {
                    return false;
                }
            }
            if (z10) {
                this.f22850c1 = "-1";
                this.f22854d1 = this.f22853d.getResources().getString(2132017779);
                this.f22877i0 = 1;
                return true;
            }
            if (z10 == 2) {
                this.f22850c1 = "-6";
                this.f22854d1 = this.f22853d.getResources().getString(2132018441);
                this.f22877i0 = 2;
                return true;
            }
            if (z10 != 3 && z10 != 4) {
                if (this.f22907o0 == null) {
                    return true;
                }
                for (int i10 = 0; i10 < this.f22907o0.size(); i10++) {
                    if (this.f22907o0.get(i10).m14787b().equals(this.f22850c1)) {
                        this.f22877i0 = i10;
                        return true;
                    }
                }
                return true;
            }
            if (this.f22848b2.equals("m3u")) {
                this.f22850c1 = "";
            } else {
                this.f22850c1 = "-2";
            }
            this.f22854d1 = this.f22853d.getResources().getString(2132018731);
            ArrayList<LiveStreamCategoryIdDBModel> arrayList4 = this.f22749C0;
            if (arrayList4 == null || arrayList4.size() <= 0) {
                return true;
            }
            this.f22877i0 = this.f22749C0.size() - 1;
            return true;
        } catch (Exception e11) {
            return false;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:102:0x0fb5
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0b5b A[Catch: Exception -> 0x0fab, TRY_ENTER, TryCatch #1 {Exception -> 0x0fab, blocks: (B:3:0x0004, B:5:0x019b, B:7:0x01a6, B:8:0x01bf, B:8:0x01bf, B:9:0x01c2, B:12:0x0270, B:13:0x027e, B:15:0x02e4, B:17:0x02eb, B:19:0x02f8, B:22:0x0306, B:23:0x0376, B:25:0x03ce, B:32:0x03eb, B:45:0x0435, B:49:0x0443, B:51:0x044e, B:53:0x0466, B:54:0x0522, B:56:0x0583, B:58:0x058e, B:60:0x05a0, B:62:0x05a7, B:64:0x05b1, B:66:0x05b9, B:68:0x05c3, B:70:0x05d6, B:72:0x05e0, B:74:0x05f1, B:75:0x063a, B:77:0x066a, B:79:0x06be, B:80:0x071b, B:85:0x0acd, B:90:0x0ad5, B:92:0x0ae6, B:94:0x0af8, B:100:0x0b26, B:104:0x0b29, B:106:0x0b5b, B:110:0x0b89, B:112:0x0b98, B:114:0x0bad, B:116:0x0c53, B:118:0x0c59, B:120:0x0c6c, B:122:0x0c72, B:124:0x0c82, B:126:0x0c88, B:128:0x0c98, B:130:0x0ca6, B:132:0x0cc0, B:134:0x0cc6, B:177:0x0b66, B:178:0x0af0, B:183:0x06c5, B:184:0x05f9, B:186:0x060b, B:188:0x061e, B:190:0x0628, B:194:0x0478, B:196:0x0483, B:202:0x04b9, B:204:0x04c4, B:209:0x04f2, B:211:0x04fd, B:213:0x03fa, B:217:0x0409, B:221:0x030f, B:223:0x0318, B:225:0x031f, B:227:0x032c, B:231:0x033d, B:232:0x0345, B:234:0x034e, B:236:0x0355, B:238:0x0362), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0b98 A[Catch: Exception -> 0x0fab, TryCatch #1 {Exception -> 0x0fab, blocks: (B:3:0x0004, B:5:0x019b, B:7:0x01a6, B:8:0x01bf, B:8:0x01bf, B:9:0x01c2, B:12:0x0270, B:13:0x027e, B:15:0x02e4, B:17:0x02eb, B:19:0x02f8, B:22:0x0306, B:23:0x0376, B:25:0x03ce, B:32:0x03eb, B:45:0x0435, B:49:0x0443, B:51:0x044e, B:53:0x0466, B:54:0x0522, B:56:0x0583, B:58:0x058e, B:60:0x05a0, B:62:0x05a7, B:64:0x05b1, B:66:0x05b9, B:68:0x05c3, B:70:0x05d6, B:72:0x05e0, B:74:0x05f1, B:75:0x063a, B:77:0x066a, B:79:0x06be, B:80:0x071b, B:85:0x0acd, B:90:0x0ad5, B:92:0x0ae6, B:94:0x0af8, B:100:0x0b26, B:104:0x0b29, B:106:0x0b5b, B:110:0x0b89, B:112:0x0b98, B:114:0x0bad, B:116:0x0c53, B:118:0x0c59, B:120:0x0c6c, B:122:0x0c72, B:124:0x0c82, B:126:0x0c88, B:128:0x0c98, B:130:0x0ca6, B:132:0x0cc0, B:134:0x0cc6, B:177:0x0b66, B:178:0x0af0, B:183:0x06c5, B:184:0x05f9, B:186:0x060b, B:188:0x061e, B:190:0x0628, B:194:0x0478, B:196:0x0483, B:202:0x04b9, B:204:0x04c4, B:209:0x04f2, B:211:0x04fd, B:213:0x03fa, B:217:0x0409, B:221:0x030f, B:223:0x0318, B:225:0x031f, B:227:0x032c, B:231:0x033d, B:232:0x0345, B:234:0x034e, B:236:0x0355, B:238:0x0362), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0c53 A[Catch: Exception -> 0x0fab, TRY_ENTER, TryCatch #1 {Exception -> 0x0fab, blocks: (B:3:0x0004, B:5:0x019b, B:7:0x01a6, B:8:0x01bf, B:8:0x01bf, B:9:0x01c2, B:12:0x0270, B:13:0x027e, B:15:0x02e4, B:17:0x02eb, B:19:0x02f8, B:22:0x0306, B:23:0x0376, B:25:0x03ce, B:32:0x03eb, B:45:0x0435, B:49:0x0443, B:51:0x044e, B:53:0x0466, B:54:0x0522, B:56:0x0583, B:58:0x058e, B:60:0x05a0, B:62:0x05a7, B:64:0x05b1, B:66:0x05b9, B:68:0x05c3, B:70:0x05d6, B:72:0x05e0, B:74:0x05f1, B:75:0x063a, B:77:0x066a, B:79:0x06be, B:80:0x071b, B:85:0x0acd, B:90:0x0ad5, B:92:0x0ae6, B:94:0x0af8, B:100:0x0b26, B:104:0x0b29, B:106:0x0b5b, B:110:0x0b89, B:112:0x0b98, B:114:0x0bad, B:116:0x0c53, B:118:0x0c59, B:120:0x0c6c, B:122:0x0c72, B:124:0x0c82, B:126:0x0c88, B:128:0x0c98, B:130:0x0ca6, B:132:0x0cc0, B:134:0x0cc6, B:177:0x0b66, B:178:0x0af0, B:183:0x06c5, B:184:0x05f9, B:186:0x060b, B:188:0x061e, B:190:0x0628, B:194:0x0478, B:196:0x0483, B:202:0x04b9, B:204:0x04c4, B:209:0x04f2, B:211:0x04fd, B:213:0x03fa, B:217:0x0409, B:221:0x030f, B:223:0x0318, B:225:0x031f, B:227:0x032c, B:231:0x033d, B:232:0x0345, B:234:0x034e, B:236:0x0355, B:238:0x0362), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0c6c A[Catch: Exception -> 0x0fab, TRY_ENTER, TryCatch #1 {Exception -> 0x0fab, blocks: (B:3:0x0004, B:5:0x019b, B:7:0x01a6, B:8:0x01bf, B:8:0x01bf, B:9:0x01c2, B:12:0x0270, B:13:0x027e, B:15:0x02e4, B:17:0x02eb, B:19:0x02f8, B:22:0x0306, B:23:0x0376, B:25:0x03ce, B:32:0x03eb, B:45:0x0435, B:49:0x0443, B:51:0x044e, B:53:0x0466, B:54:0x0522, B:56:0x0583, B:58:0x058e, B:60:0x05a0, B:62:0x05a7, B:64:0x05b1, B:66:0x05b9, B:68:0x05c3, B:70:0x05d6, B:72:0x05e0, B:74:0x05f1, B:75:0x063a, B:77:0x066a, B:79:0x06be, B:80:0x071b, B:85:0x0acd, B:90:0x0ad5, B:92:0x0ae6, B:94:0x0af8, B:100:0x0b26, B:104:0x0b29, B:106:0x0b5b, B:110:0x0b89, B:112:0x0b98, B:114:0x0bad, B:116:0x0c53, B:118:0x0c59, B:120:0x0c6c, B:122:0x0c72, B:124:0x0c82, B:126:0x0c88, B:128:0x0c98, B:130:0x0ca6, B:132:0x0cc0, B:134:0x0cc6, B:177:0x0b66, B:178:0x0af0, B:183:0x06c5, B:184:0x05f9, B:186:0x060b, B:188:0x061e, B:190:0x0628, B:194:0x0478, B:196:0x0483, B:202:0x04b9, B:204:0x04c4, B:209:0x04f2, B:211:0x04fd, B:213:0x03fa, B:217:0x0409, B:221:0x030f, B:223:0x0318, B:225:0x031f, B:227:0x032c, B:231:0x033d, B:232:0x0345, B:234:0x034e, B:236:0x0355, B:238:0x0362), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0c82 A[Catch: Exception -> 0x0fab, TRY_ENTER, TryCatch #1 {Exception -> 0x0fab, blocks: (B:3:0x0004, B:5:0x019b, B:7:0x01a6, B:8:0x01bf, B:8:0x01bf, B:9:0x01c2, B:12:0x0270, B:13:0x027e, B:15:0x02e4, B:17:0x02eb, B:19:0x02f8, B:22:0x0306, B:23:0x0376, B:25:0x03ce, B:32:0x03eb, B:45:0x0435, B:49:0x0443, B:51:0x044e, B:53:0x0466, B:54:0x0522, B:56:0x0583, B:58:0x058e, B:60:0x05a0, B:62:0x05a7, B:64:0x05b1, B:66:0x05b9, B:68:0x05c3, B:70:0x05d6, B:72:0x05e0, B:74:0x05f1, B:75:0x063a, B:77:0x066a, B:79:0x06be, B:80:0x071b, B:85:0x0acd, B:90:0x0ad5, B:92:0x0ae6, B:94:0x0af8, B:100:0x0b26, B:104:0x0b29, B:106:0x0b5b, B:110:0x0b89, B:112:0x0b98, B:114:0x0bad, B:116:0x0c53, B:118:0x0c59, B:120:0x0c6c, B:122:0x0c72, B:124:0x0c82, B:126:0x0c88, B:128:0x0c98, B:130:0x0ca6, B:132:0x0cc0, B:134:0x0cc6, B:177:0x0b66, B:178:0x0af0, B:183:0x06c5, B:184:0x05f9, B:186:0x060b, B:188:0x061e, B:190:0x0628, B:194:0x0478, B:196:0x0483, B:202:0x04b9, B:204:0x04c4, B:209:0x04f2, B:211:0x04fd, B:213:0x03fa, B:217:0x0409, B:221:0x030f, B:223:0x0318, B:225:0x031f, B:227:0x032c, B:231:0x033d, B:232:0x0345, B:234:0x034e, B:236:0x0355, B:238:0x0362), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0c98 A[Catch: Exception -> 0x0fab, TRY_ENTER, TryCatch #1 {Exception -> 0x0fab, blocks: (B:3:0x0004, B:5:0x019b, B:7:0x01a6, B:8:0x01bf, B:8:0x01bf, B:9:0x01c2, B:12:0x0270, B:13:0x027e, B:15:0x02e4, B:17:0x02eb, B:19:0x02f8, B:22:0x0306, B:23:0x0376, B:25:0x03ce, B:32:0x03eb, B:45:0x0435, B:49:0x0443, B:51:0x044e, B:53:0x0466, B:54:0x0522, B:56:0x0583, B:58:0x058e, B:60:0x05a0, B:62:0x05a7, B:64:0x05b1, B:66:0x05b9, B:68:0x05c3, B:70:0x05d6, B:72:0x05e0, B:74:0x05f1, B:75:0x063a, B:77:0x066a, B:79:0x06be, B:80:0x071b, B:85:0x0acd, B:90:0x0ad5, B:92:0x0ae6, B:94:0x0af8, B:100:0x0b26, B:104:0x0b29, B:106:0x0b5b, B:110:0x0b89, B:112:0x0b98, B:114:0x0bad, B:116:0x0c53, B:118:0x0c59, B:120:0x0c6c, B:122:0x0c72, B:124:0x0c82, B:126:0x0c88, B:128:0x0c98, B:130:0x0ca6, B:132:0x0cc0, B:134:0x0cc6, B:177:0x0b66, B:178:0x0af0, B:183:0x06c5, B:184:0x05f9, B:186:0x060b, B:188:0x061e, B:190:0x0628, B:194:0x0478, B:196:0x0483, B:202:0x04b9, B:204:0x04c4, B:209:0x04f2, B:211:0x04fd, B:213:0x03fa, B:217:0x0409, B:221:0x030f, B:223:0x0318, B:225:0x031f, B:227:0x032c, B:231:0x033d, B:232:0x0345, B:234:0x034e, B:236:0x0355, B:238:0x0362), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0cc0 A[Catch: Exception -> 0x0fab, TRY_ENTER, TryCatch #1 {Exception -> 0x0fab, blocks: (B:3:0x0004, B:5:0x019b, B:7:0x01a6, B:8:0x01bf, B:8:0x01bf, B:9:0x01c2, B:12:0x0270, B:13:0x027e, B:15:0x02e4, B:17:0x02eb, B:19:0x02f8, B:22:0x0306, B:23:0x0376, B:25:0x03ce, B:32:0x03eb, B:45:0x0435, B:49:0x0443, B:51:0x044e, B:53:0x0466, B:54:0x0522, B:56:0x0583, B:58:0x058e, B:60:0x05a0, B:62:0x05a7, B:64:0x05b1, B:66:0x05b9, B:68:0x05c3, B:70:0x05d6, B:72:0x05e0, B:74:0x05f1, B:75:0x063a, B:77:0x066a, B:79:0x06be, B:80:0x071b, B:85:0x0acd, B:90:0x0ad5, B:92:0x0ae6, B:94:0x0af8, B:100:0x0b26, B:104:0x0b29, B:106:0x0b5b, B:110:0x0b89, B:112:0x0b98, B:114:0x0bad, B:116:0x0c53, B:118:0x0c59, B:120:0x0c6c, B:122:0x0c72, B:124:0x0c82, B:126:0x0c88, B:128:0x0c98, B:130:0x0ca6, B:132:0x0cc0, B:134:0x0cc6, B:177:0x0b66, B:178:0x0af0, B:183:0x06c5, B:184:0x05f9, B:186:0x060b, B:188:0x061e, B:190:0x0628, B:194:0x0478, B:196:0x0483, B:202:0x04b9, B:204:0x04c4, B:209:0x04f2, B:211:0x04fd, B:213:0x03fa, B:217:0x0409, B:221:0x030f, B:223:0x0318, B:225:0x031f, B:227:0x032c, B:231:0x033d, B:232:0x0345, B:234:0x034e, B:236:0x0355, B:238:0x0362), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0ed0 A[Catch: Exception -> 0x0fb9, TryCatch #2 {Exception -> 0x0fb9, blocks: (B:140:0x0dd0, B:142:0x0ed0, B:144:0x0edd, B:146:0x0eea, B:148:0x0f04, B:152:0x0f0b, B:154:0x0f18, B:156:0x0f25, B:158:0x0f3a, B:159:0x0f41, B:161:0x0f4e, B:163:0x0f5b, B:164:0x0f72, B:166:0x0f7f, B:168:0x0f8c, B:169:0x0f93), top: B:139:0x0dd0 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0af0 A[Catch: Exception -> 0x0fab, TRY_ENTER, TryCatch #1 {Exception -> 0x0fab, blocks: (B:3:0x0004, B:5:0x019b, B:7:0x01a6, B:8:0x01bf, B:8:0x01bf, B:9:0x01c2, B:12:0x0270, B:13:0x027e, B:15:0x02e4, B:17:0x02eb, B:19:0x02f8, B:22:0x0306, B:23:0x0376, B:25:0x03ce, B:32:0x03eb, B:45:0x0435, B:49:0x0443, B:51:0x044e, B:53:0x0466, B:54:0x0522, B:56:0x0583, B:58:0x058e, B:60:0x05a0, B:62:0x05a7, B:64:0x05b1, B:66:0x05b9, B:68:0x05c3, B:70:0x05d6, B:72:0x05e0, B:74:0x05f1, B:75:0x063a, B:77:0x066a, B:79:0x06be, B:80:0x071b, B:85:0x0acd, B:90:0x0ad5, B:92:0x0ae6, B:94:0x0af8, B:100:0x0b26, B:104:0x0b29, B:106:0x0b5b, B:110:0x0b89, B:112:0x0b98, B:114:0x0bad, B:116:0x0c53, B:118:0x0c59, B:120:0x0c6c, B:122:0x0c72, B:124:0x0c82, B:126:0x0c88, B:128:0x0c98, B:130:0x0ca6, B:132:0x0cc0, B:134:0x0cc6, B:177:0x0b66, B:178:0x0af0, B:183:0x06c5, B:184:0x05f9, B:186:0x060b, B:188:0x061e, B:190:0x0628, B:194:0x0478, B:196:0x0483, B:202:0x04b9, B:204:0x04c4, B:209:0x04f2, B:211:0x04fd, B:213:0x03fa, B:217:0x0409, B:221:0x030f, B:223:0x0318, B:225:0x031f, B:227:0x032c, B:231:0x033d, B:232:0x0345, B:234:0x034e, B:236:0x0355, B:238:0x0362), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x06c5 A[Catch: Exception -> 0x0fab, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0fab, blocks: (B:3:0x0004, B:5:0x019b, B:7:0x01a6, B:8:0x01bf, B:8:0x01bf, B:9:0x01c2, B:12:0x0270, B:13:0x027e, B:15:0x02e4, B:17:0x02eb, B:19:0x02f8, B:22:0x0306, B:23:0x0376, B:25:0x03ce, B:32:0x03eb, B:45:0x0435, B:49:0x0443, B:51:0x044e, B:53:0x0466, B:54:0x0522, B:56:0x0583, B:58:0x058e, B:60:0x05a0, B:62:0x05a7, B:64:0x05b1, B:66:0x05b9, B:68:0x05c3, B:70:0x05d6, B:72:0x05e0, B:74:0x05f1, B:75:0x063a, B:77:0x066a, B:79:0x06be, B:80:0x071b, B:85:0x0acd, B:90:0x0ad5, B:92:0x0ae6, B:94:0x0af8, B:100:0x0b26, B:104:0x0b29, B:106:0x0b5b, B:110:0x0b89, B:112:0x0b98, B:114:0x0bad, B:116:0x0c53, B:118:0x0c59, B:120:0x0c6c, B:122:0x0c72, B:124:0x0c82, B:126:0x0c88, B:128:0x0c98, B:130:0x0ca6, B:132:0x0cc0, B:134:0x0cc6, B:177:0x0b66, B:178:0x0af0, B:183:0x06c5, B:184:0x05f9, B:186:0x060b, B:188:0x061e, B:190:0x0628, B:194:0x0478, B:196:0x0483, B:202:0x04b9, B:204:0x04c4, B:209:0x04f2, B:211:0x04fd, B:213:0x03fa, B:217:0x0409, B:221:0x030f, B:223:0x0318, B:225:0x031f, B:227:0x032c, B:231:0x033d, B:232:0x0345, B:234:0x034e, B:236:0x0355, B:238:0x0362), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x060b A[Catch: Exception -> 0x0fab, TRY_ENTER, TryCatch #1 {Exception -> 0x0fab, blocks: (B:3:0x0004, B:5:0x019b, B:7:0x01a6, B:8:0x01bf, B:8:0x01bf, B:9:0x01c2, B:12:0x0270, B:13:0x027e, B:15:0x02e4, B:17:0x02eb, B:19:0x02f8, B:22:0x0306, B:23:0x0376, B:25:0x03ce, B:32:0x03eb, B:45:0x0435, B:49:0x0443, B:51:0x044e, B:53:0x0466, B:54:0x0522, B:56:0x0583, B:58:0x058e, B:60:0x05a0, B:62:0x05a7, B:64:0x05b1, B:66:0x05b9, B:68:0x05c3, B:70:0x05d6, B:72:0x05e0, B:74:0x05f1, B:75:0x063a, B:77:0x066a, B:79:0x06be, B:80:0x071b, B:85:0x0acd, B:90:0x0ad5, B:92:0x0ae6, B:94:0x0af8, B:100:0x0b26, B:104:0x0b29, B:106:0x0b5b, B:110:0x0b89, B:112:0x0b98, B:114:0x0bad, B:116:0x0c53, B:118:0x0c59, B:120:0x0c6c, B:122:0x0c72, B:124:0x0c82, B:126:0x0c88, B:128:0x0c98, B:130:0x0ca6, B:132:0x0cc0, B:134:0x0cc6, B:177:0x0b66, B:178:0x0af0, B:183:0x06c5, B:184:0x05f9, B:186:0x060b, B:188:0x061e, B:190:0x0628, B:194:0x0478, B:196:0x0483, B:202:0x04b9, B:204:0x04c4, B:209:0x04f2, B:211:0x04fd, B:213:0x03fa, B:217:0x0409, B:221:0x030f, B:223:0x0318, B:225:0x031f, B:227:0x032c, B:231:0x033d, B:232:0x0345, B:234:0x034e, B:236:0x0355, B:238:0x0362), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0628 A[Catch: Exception -> 0x0fab, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0fab, blocks: (B:3:0x0004, B:5:0x019b, B:7:0x01a6, B:8:0x01bf, B:8:0x01bf, B:9:0x01c2, B:12:0x0270, B:13:0x027e, B:15:0x02e4, B:17:0x02eb, B:19:0x02f8, B:22:0x0306, B:23:0x0376, B:25:0x03ce, B:32:0x03eb, B:45:0x0435, B:49:0x0443, B:51:0x044e, B:53:0x0466, B:54:0x0522, B:56:0x0583, B:58:0x058e, B:60:0x05a0, B:62:0x05a7, B:64:0x05b1, B:66:0x05b9, B:68:0x05c3, B:70:0x05d6, B:72:0x05e0, B:74:0x05f1, B:75:0x063a, B:77:0x066a, B:79:0x06be, B:80:0x071b, B:85:0x0acd, B:90:0x0ad5, B:92:0x0ae6, B:94:0x0af8, B:100:0x0b26, B:104:0x0b29, B:106:0x0b5b, B:110:0x0b89, B:112:0x0b98, B:114:0x0bad, B:116:0x0c53, B:118:0x0c59, B:120:0x0c6c, B:122:0x0c72, B:124:0x0c82, B:126:0x0c88, B:128:0x0c98, B:130:0x0ca6, B:132:0x0cc0, B:134:0x0cc6, B:177:0x0b66, B:178:0x0af0, B:183:0x06c5, B:184:0x05f9, B:186:0x060b, B:188:0x061e, B:190:0x0628, B:194:0x0478, B:196:0x0483, B:202:0x04b9, B:204:0x04c4, B:209:0x04f2, B:211:0x04fd, B:213:0x03fa, B:217:0x0409, B:221:0x030f, B:223:0x0318, B:225:0x031f, B:227:0x032c, B:231:0x033d, B:232:0x0345, B:234:0x034e, B:236:0x0355, B:238:0x0362), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x03ce A[Catch: Exception -> 0x0fab, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0fab, blocks: (B:3:0x0004, B:5:0x019b, B:7:0x01a6, B:8:0x01bf, B:8:0x01bf, B:9:0x01c2, B:12:0x0270, B:13:0x027e, B:15:0x02e4, B:17:0x02eb, B:19:0x02f8, B:22:0x0306, B:23:0x0376, B:25:0x03ce, B:32:0x03eb, B:45:0x0435, B:49:0x0443, B:51:0x044e, B:53:0x0466, B:54:0x0522, B:56:0x0583, B:58:0x058e, B:60:0x05a0, B:62:0x05a7, B:64:0x05b1, B:66:0x05b9, B:68:0x05c3, B:70:0x05d6, B:72:0x05e0, B:74:0x05f1, B:75:0x063a, B:77:0x066a, B:79:0x06be, B:80:0x071b, B:85:0x0acd, B:90:0x0ad5, B:92:0x0ae6, B:94:0x0af8, B:100:0x0b26, B:104:0x0b29, B:106:0x0b5b, B:110:0x0b89, B:112:0x0b98, B:114:0x0bad, B:116:0x0c53, B:118:0x0c59, B:120:0x0c6c, B:122:0x0c72, B:124:0x0c82, B:126:0x0c88, B:128:0x0c98, B:130:0x0ca6, B:132:0x0cc0, B:134:0x0cc6, B:177:0x0b66, B:178:0x0af0, B:183:0x06c5, B:184:0x05f9, B:186:0x060b, B:188:0x061e, B:190:0x0628, B:194:0x0478, B:196:0x0483, B:202:0x04b9, B:204:0x04c4, B:209:0x04f2, B:211:0x04fd, B:213:0x03fa, B:217:0x0409, B:221:0x030f, B:223:0x0318, B:225:0x031f, B:227:0x032c, B:231:0x033d, B:232:0x0345, B:234:0x034e, B:236:0x0355, B:238:0x0362), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x066a A[Catch: Exception -> 0x0fab, TRY_ENTER, TryCatch #1 {Exception -> 0x0fab, blocks: (B:3:0x0004, B:5:0x019b, B:7:0x01a6, B:8:0x01bf, B:8:0x01bf, B:9:0x01c2, B:12:0x0270, B:13:0x027e, B:15:0x02e4, B:17:0x02eb, B:19:0x02f8, B:22:0x0306, B:23:0x0376, B:25:0x03ce, B:32:0x03eb, B:45:0x0435, B:49:0x0443, B:51:0x044e, B:53:0x0466, B:54:0x0522, B:56:0x0583, B:58:0x058e, B:60:0x05a0, B:62:0x05a7, B:64:0x05b1, B:66:0x05b9, B:68:0x05c3, B:70:0x05d6, B:72:0x05e0, B:74:0x05f1, B:75:0x063a, B:77:0x066a, B:79:0x06be, B:80:0x071b, B:85:0x0acd, B:90:0x0ad5, B:92:0x0ae6, B:94:0x0af8, B:100:0x0b26, B:104:0x0b29, B:106:0x0b5b, B:110:0x0b89, B:112:0x0b98, B:114:0x0bad, B:116:0x0c53, B:118:0x0c59, B:120:0x0c6c, B:122:0x0c72, B:124:0x0c82, B:126:0x0c88, B:128:0x0c98, B:130:0x0ca6, B:132:0x0cc0, B:134:0x0cc6, B:177:0x0b66, B:178:0x0af0, B:183:0x06c5, B:184:0x05f9, B:186:0x060b, B:188:0x061e, B:190:0x0628, B:194:0x0478, B:196:0x0483, B:202:0x04b9, B:204:0x04c4, B:209:0x04f2, B:211:0x04fd, B:213:0x03fa, B:217:0x0409, B:221:0x030f, B:223:0x0318, B:225:0x031f, B:227:0x032c, B:231:0x033d, B:232:0x0345, B:234:0x034e, B:236:0x0355, B:238:0x0362), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0ae6 A[Catch: Exception -> 0x0fab, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0fab, blocks: (B:3:0x0004, B:5:0x019b, B:7:0x01a6, B:8:0x01bf, B:8:0x01bf, B:9:0x01c2, B:12:0x0270, B:13:0x027e, B:15:0x02e4, B:17:0x02eb, B:19:0x02f8, B:22:0x0306, B:23:0x0376, B:25:0x03ce, B:32:0x03eb, B:45:0x0435, B:49:0x0443, B:51:0x044e, B:53:0x0466, B:54:0x0522, B:56:0x0583, B:58:0x058e, B:60:0x05a0, B:62:0x05a7, B:64:0x05b1, B:66:0x05b9, B:68:0x05c3, B:70:0x05d6, B:72:0x05e0, B:74:0x05f1, B:75:0x063a, B:77:0x066a, B:79:0x06be, B:80:0x071b, B:85:0x0acd, B:90:0x0ad5, B:92:0x0ae6, B:94:0x0af8, B:100:0x0b26, B:104:0x0b29, B:106:0x0b5b, B:110:0x0b89, B:112:0x0b98, B:114:0x0bad, B:116:0x0c53, B:118:0x0c59, B:120:0x0c6c, B:122:0x0c72, B:124:0x0c82, B:126:0x0c88, B:128:0x0c98, B:130:0x0ca6, B:132:0x0cc0, B:134:0x0cc6, B:177:0x0b66, B:178:0x0af0, B:183:0x06c5, B:184:0x05f9, B:186:0x060b, B:188:0x061e, B:190:0x0628, B:194:0x0478, B:196:0x0483, B:202:0x04b9, B:204:0x04c4, B:209:0x04f2, B:211:0x04fd, B:213:0x03fa, B:217:0x0409, B:221:0x030f, B:223:0x0318, B:225:0x031f, B:227:0x032c, B:231:0x033d, B:232:0x0345, B:234:0x034e, B:236:0x0355, B:238:0x0362), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0b06 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: i2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m18428i2() {
        /*
            Method dump skipped, instructions count: 4029
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.m18428i2():void");
    }

    /* renamed from: j2 */
    public boolean m18429j2() {
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

    /* renamed from: k2 */
    public void m18430k2(String str, String str2) {
        this.f22807Q2 = str;
        m18383A1();
    }

    /* renamed from: l2 */
    public final void m18431l2() {
        ProgressBar progressBar = this.f22946w;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
        TextView textView = this.f22921r;
        if (textView != null) {
            textView.setText(this.f22853d.getResources().getString(2132018251));
        }
        TextView textView2 = this.f22926s;
        if (textView2 != null) {
            textView2.setText("");
        }
        TextView textView3 = this.f22931t;
        if (textView3 != null) {
            textView3.setText(this.f22853d.getResources().getString(2132018185));
        }
        TextView textView4 = this.f22936u;
        if (textView4 != null) {
            textView4.setText("");
        }
    }

    /* renamed from: m2 */
    public void m18432m2() {
        if (this.f22859e2 == null) {
            return;
        }
        m18395G1(0);
        int i10 = Build.VERSION.SDK_INT;
        Rational rational = (this.f22859e2.m19348Z0() == 0 || this.f22859e2.m19347Y0() == 0) ? new Rational(this.f22859e2.getWidth(), this.f22859e2.getHeight()) : new Rational(this.f22859e2.m19348Z0(), this.f22859e2.m19347Y0());
        if (i10 >= 26) {
            try {
                m18410P1(false);
                this.f22900m3.setAspectRatio(rational).build();
                enterPictureInPictureMode(this.f22900m3.build());
            } catch (Exception e10) {
                try {
                    m18410P1(false);
                    this.f22900m3.setAspectRatio(new Rational(this.f22859e2.getWidth(), this.f22859e2.getHeight())).build();
                    enterPictureInPictureMode(this.f22900m3.build());
                } catch (Exception e11) {
                }
            }
        }
    }

    /* renamed from: n2 */
    public final void m18433n2() {
        int currentWindowIndex = this.f22859e2.getCurrentWindowIndex();
        if (currentWindowIndex == this.f22952x0.size() - 1) {
            this.f22859e2.setCurrentWindowIndex(0);
        } else {
            this.f22859e2.setCurrentWindowIndex(currentWindowIndex + 1);
        }
    }

    /* renamed from: o2 */
    public void m18434o2() {
        m18426g2();
        int i10 = 0;
        this.f22939u2 = false;
        this.f22944v2 = 0;
        AsyncTask asyncTask = this.f22929s2;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            ArrayList<LiveStreamCategoryIdDBModel> arrayList = this.f22907o0;
            if (arrayList != null && arrayList.size() > 0) {
                if (this.f22877i0 != this.f22907o0.size() - 1) {
                    i10 = this.f22877i0 + 1;
                }
                this.f22877i0 = i10;
                if (this.f22877i0 != 0 || this.f22932t0 == null) {
                    ArrayList<LiveStreamCategoryIdDBModel> arrayList2 = this.f22907o0;
                    if (arrayList2 == null || arrayList2.size() <= 0 || this.f22877i0 >= this.f22907o0.size()) {
                        return;
                    }
                    String m14787b = this.f22907o0.get(this.f22877i0).m14787b();
                    String m14788c = this.f22907o0.get(this.f22877i0).m14788c();
                    this.f22850c1 = m14787b;
                    this.f22854d1 = m14788c;
                    if (m14787b != null && !m14787b.equals("") && this.f22850c1.equals("-1")) {
                        m18387C1();
                        return;
                    }
                    String str = this.f22850c1;
                    if (str == null || str.equals("") || !this.f22850c1.equals("-6")) {
                        m18449y1();
                        return;
                    } else {
                        m18389D1();
                        return;
                    }
                }
                this.f22850c1 = "0";
                this.f22854d1 = this.f22853d.getResources().getString(2132017297);
            }
            m18445w1();
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 101) {
            try {
                if (m18429j2()) {
                    SharedPreferences sharedPreferences = getSharedPreferences("downloadStatus", 0);
                    f22732A3 = sharedPreferences;
                    String string = sharedPreferences.getString("downloadStatus", "");
                    C5255e c5255e = new C5255e();
                    if (string.equals("processing")) {
                        c5255e.m26262g0(this);
                    } else {
                        c5255e.m26263j0(this, this.f22899m2, this.f22867g0, this.f22857e, this.f22752D, this.f22756E);
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
            m18404K2();
            relativeLayout = this.rl_episodes_box;
        } catch (Exception e10) {
        }
        if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
            this.rl_episodes_box.startAnimation(this.f22885j3);
            this.rl_episodes_box.setVisibility(8);
            return;
        }
        if (this.rl_settings_box.getVisibility() == 0) {
            this.rl_settings_box.startAnimation(this.f22846a3);
            this.rl_settings_box.setVisibility(8);
            return;
        }
        if (f22733B3) {
            if (this.ll_player_header_footer.getVisibility() != 0) {
                Toolbar toolbar = this.f22781K0;
                if (toolbar != null) {
                    toolbar.setVisibility(0);
                }
                m18402J2();
                return;
            }
            this.ll_player_header_footer.startAnimation(this.f22839Y2);
            if (this.ll_brightness.getVisibility() == 0) {
                this.ll_brightness.startAnimation(this.f22839Y2);
            }
            if (this.tv_seek_left.getVisibility() == 0) {
                this.tv_seek_left.startAnimation(this.f22839Y2);
            }
            if (this.ll_pause_play.getVisibility() == 0) {
                this.ll_pause_play.startAnimation(this.f22839Y2);
            }
            if (this.tv_seek_right.getVisibility() == 0) {
                this.tv_seek_right.startAnimation(this.f22839Y2);
            }
            if (this.ll_volume.getVisibility() == 0) {
                this.ll_volume.startAnimation(this.f22839Y2);
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
        if (this.f22849b3.equals("mobile") && this.f22890k3 && this.f22940u3) {
            try {
                m18432m2();
            } catch (Exception e11) {
            }
            overridePendingTransition(2130772003, 2130772000);
        }
        super.onBackPressed();
        overridePendingTransition(2130772003, 2130772000);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:31:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x081a  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onClick(android.view.View r7) {
        /*
            Method dump skipped, instructions count: 2465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.onClick(android.view.View):void");
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m18443v1(configuration);
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f22853d = this;
        m18425f2();
        super.onCreate(bundle);
        SharedPreferences sharedPreferences = this.f22853d.getSharedPreferences("auto_start", 0);
        this.f22935t3 = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("picinpic", C5251a.f30033c0);
        this.f22940u3 = z10;
        if (z10 && Build.VERSION.SDK_INT >= 26) {
            this.f22900m3 = new PictureInPictureParams$Builder();
        }
        setContentView(2131624096);
        ButterKnife.m5626a(this);
        overridePendingTransition(2130772003, 2130772000);
        this.f22767G2 = new C6783a(this.f22853d);
        try {
            this.f22787L2 = new C3785r(this);
            this.f22783K2 = C5938b.m29235e(this);
        } catch (Exception e10) {
        }
        m18428i2();
        RelativeLayout relativeLayout = this.f22825V0;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new ViewOnClickListenerC3786s(this));
        }
        this.f22745B0 = m18415V1();
        String str = this.f22850c1;
        this.f22950w3 = str;
        if (str == null || str.equals("") || !this.f22850c1.equals("0")) {
            String str2 = this.f22850c1;
            if (str2 == null || str2.equals("") || !this.f22850c1.equals("-1")) {
                String str3 = this.f22850c1;
                if (str3 == null || str3.equals("") || !this.f22850c1.equals("-6")) {
                    m18449y1();
                } else {
                    m18389D1();
                }
            } else {
                m18387C1();
            }
        } else {
            m18445w1();
        }
        this.f22929s2 = new AsyncTaskC3764a0(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f22781K0.m1224x(2131689495);
        this.f22834X1 = menu;
        this.f22838Y1 = menu.getItem(2).getSubMenu().findItem(2131427886);
        if (SharepreferenceDBHandler.m15373f(this.f22853d).equals("api")) {
            menu.getItem(2).getSubMenu().findItem(2131428638).setVisible(false);
        }
        TypedValue typedValue = new TypedValue();
        int i10 = 0;
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f22853d.getResources().getDisplayMetrics());
            i10 = 0;
        }
        while (i10 < this.f22781K0.getChildCount()) {
            if (this.f22781K0.getChildAt(i10) instanceof ActionMenuView) {
                ((Toolbar.C0292e) this.f22781K0.getChildAt(i10).getLayoutParams()).f26228a = 16;
            }
            i10++;
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            m18403K1();
            m18442u2();
            C5938b.m29235e(this.f22853d).m29243c().m29360e(this.f22775I2, C5947e.class);
        } catch (Exception e10) {
        }
    }

    @Override // androidx.appcompat.app.ActivityC0243b, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        keyEvent.getRepeatCount();
        keyEvent.getAction();
        boolean z10 = f22733B3;
        if (z10) {
            if (i10 == 20) {
                this.f22889k2.booleanValue();
                return true;
            }
            if (i10 == 19) {
                this.f22889k2.booleanValue();
                return true;
            }
        }
        if (i10 == 166) {
            if (!z10) {
                return true;
            }
            this.f22889k2.booleanValue();
            return true;
        }
        if (i10 != 167) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (!z10) {
            return true;
        }
        this.f22889k2.booleanValue();
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        NSTIJKPlayerSky nSTIJKPlayerSky;
        StringBuilder sb2;
        int i11;
        boolean z10 = keyEvent.getRepeatCount() == 0;
        if (i10 != 62) {
            if (i10 == 66) {
                return true;
            }
            if (i10 != 79) {
                if (i10 == 82) {
                    Menu menu = this.f22834X1;
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
                            if (!f22733B3) {
                                return true;
                            }
                            this.f22786L1.removeCallbacksAndMessages(null);
                            if (i10 == 7) {
                                this.f22810R1.append(0);
                            } else if (i10 == 8) {
                                this.f22810R1.append(1);
                            } else {
                                if (i10 == 9) {
                                    sb2 = this.f22810R1;
                                    i11 = 2;
                                } else if (i10 == 10) {
                                    sb2 = this.f22810R1;
                                    i11 = 3;
                                } else if (i10 == 11) {
                                    sb2 = this.f22810R1;
                                    i11 = 4;
                                } else if (i10 == 12) {
                                    sb2 = this.f22810R1;
                                    i11 = 5;
                                } else if (i10 == 13) {
                                    sb2 = this.f22810R1;
                                    i11 = 6;
                                } else if (i10 == 14) {
                                    sb2 = this.f22810R1;
                                    i11 = 7;
                                } else if (i10 == 15) {
                                    this.f22810R1.append(8);
                                } else if (i10 == 16) {
                                    this.f22810R1.append(9);
                                }
                                sb2.append(i11);
                            }
                            this.f22818T1.setText(this.f22810R1.toString());
                            this.f22814S1.setVisibility(0);
                            this.f22786L1.postDelayed(new RunnableC3769d(this), 3000L);
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
        if (!this.f22889k2.booleanValue() || (nSTIJKPlayerSky = this.f22859e2) == null || !nSTIJKPlayerSky.getPlayerIsPrepared()) {
            return true;
        }
        ((!z10 || this.f22859e2.isPlaying()) ? this.iv_pause : this.iv_play).performClick();
        return true;
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
        m18426g2();
        this.f22838Y1 = menuItem;
        int itemId = menuItem.getItemId();
        if (itemId == 2131428761) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == 2131428776) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == 2131427417 && (context = this.f22853d) != null) {
            new DialogC0242a.a(context, 2132082693).setTitle(this.f22853d.getResources().getString(2132017988)).m857e(this.f22853d.getResources().getString(2132017987)).m861i(this.f22853d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3781n(this)).m858f(this.f22853d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3780m(this)).m865m();
        }
        if (itemId == 2131427425) {
            SearchView searchView = (SearchView) C6845p.m31619b(menuItem);
            this.f22785L0 = searchView;
            searchView.setQueryHint(this.f22853d.getResources().getString(2132018514));
            this.f22785L0.setIconifiedByDefault(false);
            this.f22785L0.setOnQueryTextListener(new C3782o(this));
            return true;
        }
        if (itemId == 2131428638) {
            DialogC0242a.a aVar = new DialogC0242a.a(this);
            aVar.setTitle(this.f22853d.getResources().getString(2132017514));
            aVar.m857e(this.f22853d.getResources().getString(2132017585));
            aVar.m855c(2131231731);
            aVar.m861i(this.f22853d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3783p(this));
            aVar.m858f(this.f22853d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3784q(this));
            aVar.m865m();
        }
        if (itemId == 2131428645) {
            m18400I2(this);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f22955x3;
            if (thread != null && thread.isAlive()) {
                this.f22955x3.interrupt();
            }
        } catch (Exception e10) {
        }
        try {
            C5938b c5938b = this.f22783K2;
            if (c5938b != null) {
                c5938b.m29243c().m29360e(this.f22775I2, C5947e.class);
            }
        } catch (Exception e11) {
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            if (z10) {
                NSTIJKPlayerSky nSTIJKPlayerSky = this.f22859e2;
                if (nSTIJKPlayerSky != null && nSTIJKPlayerSky.f24344f0 != null) {
                    nSTIJKPlayerSky.setShowOrHideSubtitles("gone");
                    this.f22859e2.f24344f0.setVisibility(8);
                }
                C3776i c3776i = new C3776i(this);
                this.f22905n3 = c3776i;
                registerReceiver(c3776i, new IntentFilter("media_control"));
                return;
            }
            f22733B3 = true;
            unregisterReceiver(this.f22905n3);
            this.f22895l3 = false;
            this.f22905n3 = null;
            NSTIJKPlayerSky nSTIJKPlayerSky2 = this.f22859e2;
            if (nSTIJKPlayerSky2 != null && nSTIJKPlayerSky2.f24344f0 != null) {
                nSTIJKPlayerSky2.setShowOrHideSubtitles("visible");
                this.f22859e2.f24344f0.setVisibility(0);
            }
            NSTIJKPlayerSky nSTIJKPlayerSky3 = this.f22859e2;
            if (nSTIJKPlayerSky3 != null) {
                nSTIJKPlayerSky3.isPlaying();
            }
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
                m18429j2();
            } else if (Build.VERSION.SDK_INT >= 23 && !shouldShowRequestPermissionRationale(strArr[0])) {
                DialogC0242a.a aVar = new DialogC0242a.a(this, 2132082693);
                View inflate = LayoutInflater.from(this).inflate(2131624461, (ViewGroup) null);
                Button button = (Button) inflate.findViewById(2131427646);
                Button button2 = (Button) inflate.findViewById(2131427636);
                button.setOnFocusChangeListener(new C5255e.i((View) button, this));
                button2.setOnFocusChangeListener(new C5255e.i((View) button2, this));
                button.setOnClickListener(new ViewOnClickListenerC3789v(this));
                button2.setOnClickListener(new ViewOnClickListenerC3790w(this));
                aVar.setView(inflate);
                this.f22879i2 = aVar.create();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = this.f22879i2.getWindow();
                Objects.requireNonNull(window);
                Window window2 = window;
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = -1;
                layoutParams.height = -2;
                this.f22879i2.show();
                this.f22879i2.getWindow().setAttributes(layoutParams);
                this.f22879i2.setCancelable(false);
                this.f22879i2.show();
            }
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        AppOpsManager appOpsManager;
        m18425f2();
        super.onResume();
        Thread thread = this.f22955x3;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC3793z(this));
            this.f22955x3 = thread2;
            thread2.start();
        }
        Context context = this.f22853d;
        boolean z10 = true;
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("auto_start", 0);
            this.f22935t3 = sharedPreferences;
            boolean z11 = sharedPreferences.getBoolean("picinpic", C5251a.f30033c0);
            this.f22940u3 = z11;
            if (z11 && this.f22849b3.equals("mobile")) {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 26) {
                    this.f22900m3 = new PictureInPictureParams$Builder();
                }
                if (i10 >= 26) {
                    try {
                        if (getPackageManager().hasSystemFeature("android.software.picture_in_picture") && (appOpsManager = (AppOpsManager) this.f22853d.getSystemService("appops")) != null && appOpsManager.checkOpNoThrow("android:picture_in_picture", Process.myUid(), this.f22853d.getPackageName()) == 0) {
                            this.f22890k3 = true;
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
            this.f22828W = getSharedPreferences("currentlyPlayingVideo", 0);
            if (!String.valueOf(getIntent().getIntExtra("OPENED_STREAM_ID", 0)).equals(SharepreferenceDBHandler.m15373f(this.f22853d).equals("m3u") ? this.f22824V.getString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", "") : this.f22824V.getString("currentlyPlayingVideo", ""))) {
                this.f22914p2 = getIntent().getStringExtra("OPENED_CAT_ID");
                this.f22854d1 = getIntent().getStringExtra("OPENED_CAT_NAME");
                this.f22909o2 = getIntent().getIntExtra("OPENED_STREAM_ID", 0);
                this.f22806Q1 = getIntent().getIntExtra("VIDEO_NUM", 0);
                this.f22850c1 = this.f22914p2;
                this.f22851c2 = getIntent().getStringExtra("VIDEO_URL");
                this.f22830W1 = Boolean.FALSE;
                String str = this.f22850c1;
                if (str == null || str.equals("") || !this.f22850c1.equals("0")) {
                    String str2 = this.f22850c1;
                    if (str2 == null || str2.equals("") || !this.f22850c1.equals("-1")) {
                        String str3 = this.f22850c1;
                        if (str3 == null || str3.equals("") || !this.f22850c1.equals("-6")) {
                            m18449y1();
                        } else {
                            m18389D1();
                        }
                    } else {
                        m18387C1();
                    }
                } else {
                    m18445w1();
                }
            }
        }
        C5255e.m26233f(this.f22853d);
        C5938b c5938b = this.f22783K2;
        if (c5938b != null) {
            c5938b.m29243c().m29356a(this.f22775I2, C5947e.class);
        }
        m18426g2();
        if (this.f22949w2) {
            this.f22949w2 = false;
            ArrayList<LiveStreamsDBModel> arrayList = this.f22932t0;
            if (arrayList == null || arrayList.size() == 0) {
                C5251a.f30008G = Boolean.FALSE;
                m18436q2();
            } else {
                m18438s2(this.f22932t0);
            }
            C5867t c5867t = this.f22808R;
            if (c5867t != null) {
                c5867t.notifyDataSetChanged();
            }
        }
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onStart() {
        super.onStart();
        try {
            C5938b.m29235e(this.f22853d).m29243c().m29356a(this.f22775I2, C5947e.class);
        } catch (Exception e10) {
        }
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onStop() {
        super.onStop();
        try {
            m18442u2();
            if (this.f22849b3.equals("mobile") && !this.f22925r3 && this.f22890k3 && this.f22940u3) {
                finishAndRemoveTask();
            }
        } catch (Exception e10) {
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        if (this.f22849b3.equals("mobile") && this.f22890k3 && this.f22940u3 && !this.f22925r3 && !isInPictureInPictureMode()) {
            try {
                m18432m2();
                this.f22895l3 = true;
            } catch (Exception e10) {
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        m18425f2();
        if (z10) {
            m18443v1(getResources().getConfiguration());
        }
    }

    /* renamed from: p2 */
    public void m18435p2() {
        LinearLayout linearLayout = this.ll_no_cat_found;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.ll_pb_left_categories;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    /* renamed from: q2 */
    public void m18436q2() {
        C5251a.f30008G = Boolean.TRUE;
        this.f22748C = true;
        this.f22906o.setVisibility(0);
        this.f22911p.setText(this.f22853d.getResources().getString(2132018196));
        this.f22953x1.setVisibility(8);
        if (C5251a.f30048k.booleanValue()) {
            findViewById(2131429693).setVisibility(8);
        }
    }

    /* renamed from: r2 */
    public final void m18437r2() {
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
        if (Build.VERSION.SDK_INT >= 26) {
            this.f22859e2.setMovieListener(this.f22960y3);
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: s2 */
    public final void m18438s2(ArrayList<LiveStreamsDBModel> arrayList) {
        C7920a m34301l;
        String valueOf;
        String str;
        String str2;
        String str3;
        if (arrayList == null || arrayList.size() <= 0 || this.f22806Q1 >= arrayList.size()) {
            return;
        }
        int m26215R = C5255e.m26215R(arrayList.get(this.f22806Q1).m14805L());
        this.f22799O2 = m26215R;
        if (!arrayList.get(this.f22806Q1).m14827g().equals("")) {
            this.f22803P2 = arrayList.get(this.f22806Q1).m14827g();
        }
        int i10 = this.f22806Q1;
        this.f22944v2 = i10;
        String name = arrayList.get(i10).getName();
        int m26214Q = C5255e.m26214Q(arrayList.get(this.f22806Q1).m14811R());
        String m14798E = arrayList.get(this.f22806Q1).m14798E();
        String m14810Q = arrayList.get(this.f22806Q1).m14810Q();
        arrayList.get(this.f22806Q1).m14805L();
        this.f22851c2 = arrayList.get(this.f22806Q1).m14816W();
        String m26247n0 = C5255e.m26247n0(C7711g.m33686a() + C7711g.m33687i());
        try {
            if (m14810Q.equals("") || m14810Q.isEmpty()) {
                this.f22916q.setImageDrawable(this.f22853d.getResources().getDrawable(2131231571));
            } else {
                C10014t.m42105q(this.f22853d).m42116l(m14810Q).m42154j(2131231571).m42148d(2131231571).m42151g(this.f22916q);
            }
        } catch (Exception e10) {
            this.f22916q.setImageDrawable(this.f22853d.getResources().getDrawable(2131231571));
        }
        this.f22859e2.setCurrentWindowIndex(this.f22806Q1);
        SharedPreferences.Editor editor = this.f22750C1;
        if (editor != null) {
            editor.putString("currentlyPlayingVideo", String.valueOf(arrayList.get(this.f22806Q1).m14811R()));
            this.f22750C1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(arrayList.get(this.f22806Q1).m14816W()));
            this.f22750C1.apply();
        }
        SharedPreferences.Editor editor2 = this.f22754D1;
        if (editor2 != null) {
            editor2.putInt("currentlyPlayingVideoPosition", this.f22806Q1);
            this.f22754D1.apply();
        }
        SimpleDateFormat simpleDateFormat = this.f22855d2;
        if (m18341M1(simpleDateFormat, simpleDateFormat.format(new Date(C7709e.m33680a(this.f22853d))), this.f22842Z1.format(this.f22864f2)) >= C7707c.m33667p() && (str2 = this.f22928s1) != null && this.f22878i1 != null && (!f22734C3.equals(str2) || (this.f22928s1 != null && (str3 = this.f22878i1) != null && !f22735D3.equals(str3)))) {
            this.f22889k2 = Boolean.FALSE;
            this.f22859e2.setVisibility(8);
            this.f22906o.setVisibility(0);
            this.f22911p.setText(m26247n0 + this.f22886k + this.f22762F1);
        }
        this.f22963z1 = m26214Q;
        this.f22958y1 = m14798E;
        this.f22742A1 = this.f22851c2;
        if (this.f22848b2.equals("m3u")) {
            m34301l = C7920a.m34301l();
            valueOf = this.f22742A1;
        } else {
            m34301l = C7920a.m34301l();
            valueOf = String.valueOf(this.f22963z1);
        }
        m34301l.m34317z(valueOf);
        this.f22859e2.setTitle(m26215R + " - " + name);
        this.f22915p3 = m26215R + " - " + name;
        this.f22859e2.m19346X0();
        if (!f22733B3) {
            if (this.f22859e2.getFullScreenValue().booleanValue()) {
                f22733B3 = this.f22859e2.getFullScreenValue().booleanValue();
            } else {
                f22733B3 = false;
            }
        }
        if (this.f22889k2.booleanValue()) {
            if (this.f22848b2.equals("m3u")) {
                this.f22859e2.m19352d1(Uri.parse(this.f22851c2), f22733B3, name);
                str = this.f22851c2;
            } else {
                this.f22859e2.m19352d1(Uri.parse(this.f22857e + m26214Q + this.f22867g0), f22733B3, name);
                str = this.f22857e + m26214Q + ".m3u8";
            }
            this.f22910o3 = String.valueOf(Uri.parse(str));
            NSTIJKPlayerSky nSTIJKPlayerSky = this.f22859e2;
            nSTIJKPlayerSky.f24285I = 0;
            nSTIJKPlayerSky.f24291K = false;
            nSTIJKPlayerSky.start();
        }
        this.f22782K1.removeCallbacksAndMessages(null);
        this.f22760F = m14798E;
        this.f22764G = m14810Q;
        this.f22920q3 = m14810Q;
        this.f22859e2.setCurrentEpgChannelID(m14798E);
        this.f22859e2.setCurrentChannelLogo(this.f22764G);
        m18405L2(this.f22764G);
        this.f22934t2 = new AsyncTaskC3772e0(this, this.f22760F, null).execute(new String[0]);
        ListView listView = this.f22772I;
        if (listView != null) {
            listView.requestFocus();
        }
        this.f22826V1 = Boolean.TRUE;
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

    /* renamed from: t1 */
    public final void m18439t1(String str, int i10, String str2, String str3, String str4) {
        if (this.f22853d == null || this.f22808R == null || this.f22746B1 == null) {
            return;
        }
        FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
        favouriteDBModel.m14767h(str);
        favouriteDBModel.m14772m(i10);
        favouriteDBModel.m14771l(str3);
        favouriteDBModel.m14770k(str2);
        favouriteDBModel.m14774o(SharepreferenceDBHandler.m15337A(this.f22853d));
        this.f22746B1.m15111l(favouriteDBModel, str4);
        this.f22808R.notifyDataSetChanged();
        C5255e.m26241k0(this.f22853d, str2 + this.f22853d.getResources().getString(2132017271));
    }

    /* renamed from: t2 */
    public final void m18440t2() {
        int currentWindowIndex = this.f22859e2.getCurrentWindowIndex();
        if (currentWindowIndex == 0) {
            this.f22859e2.setCurrentWindowIndex(this.f22952x0.size() - 1);
        } else {
            this.f22859e2.setCurrentWindowIndex(currentWindowIndex - 1);
        }
    }

    public void toggleView(View view) {
        if (view.getVisibility() == 8) {
            view.setVisibility(0);
        } else if (view.getVisibility() == 0) {
            view.setVisibility(8);
        }
    }

    /* renamed from: u1 */
    public final void m18441u1(String str, String str2, String str3) {
        if (this.f22853d == null || this.f22808R == null || this.f22800P == null) {
            return;
        }
        FavouriteM3UModel favouriteM3UModel = new FavouriteM3UModel();
        favouriteM3UModel.m14782h(str2);
        favouriteM3UModel.m14783i(SharepreferenceDBHandler.m15337A(this.f22853d));
        favouriteM3UModel.m14781g(str3);
        favouriteM3UModel.m14779e(str);
        this.f22800P.m15156D0(favouriteM3UModel);
        this.f22808R.notifyDataSetChanged();
        C5255e.m26241k0(this.f22853d, str3 + this.f22853d.getResources().getString(2132017271));
    }

    /* renamed from: u2 */
    public void m18442u2() {
        try {
            NSTIJKPlayerSky nSTIJKPlayerSky = this.f22859e2;
            if (nSTIJKPlayerSky != null) {
                if (nSTIJKPlayerSky.m19341S0()) {
                    this.f22859e2.m19334L0();
                } else {
                    this.f22859e2.m19361m1();
                    this.f22859e2.m19344V0(true);
                    this.f22859e2.m19358j1();
                }
                IjkMediaPlayer.native_profileEnd();
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: v1 */
    public final void m18443v1(Configuration configuration) {
        NSTIJKPlayerSky nSTIJKPlayerSky;
        boolean z10;
        View decorView = getWindow().getDecorView();
        if (configuration.orientation == 2) {
            decorView.setSystemUiVisibility(5894);
            nSTIJKPlayerSky = this.f22859e2;
            z10 = false;
        } else {
            decorView.setSystemUiVisibility(256);
            nSTIJKPlayerSky = this.f22859e2;
            z10 = true;
        }
        nSTIJKPlayerSky.setAdjustViewBounds(z10);
    }

    /* renamed from: v2 */
    public final void m18444v2(String str, int i10, String str2, String str3) {
        DatabaseHandler databaseHandler;
        Context context = this.f22853d;
        if (context == null || this.f22808R == null || (databaseHandler = this.f22746B1) == null) {
            return;
        }
        databaseHandler.m15115t(i10, str, str3, str2, SharepreferenceDBHandler.m15337A(context));
        this.f22808R.notifyDataSetChanged();
        C5255e.m26241k0(this.f22853d, str2 + this.f22853d.getResources().getString(2132018465));
    }

    /* renamed from: w1 */
    public void m18445w1() {
        m18403K1();
        this.f22924r2 = new AsyncTaskC3766b0(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels");
    }

    /* renamed from: w2 */
    public final void m18446w2(String str, String str2) {
        LiveStreamDBHandler liveStreamDBHandler;
        Context context = this.f22853d;
        if (context == null || this.f22808R == null || (liveStreamDBHandler = this.f22800P) == null) {
            return;
        }
        liveStreamDBHandler.m15188R0(str, SharepreferenceDBHandler.m15337A(context));
        this.f22808R.notifyDataSetChanged();
        C5255e.m26241k0(this.f22853d, str2 + this.f22853d.getResources().getString(2132018465));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x014d, code lost:
    
        if (r6.f22932t0.get(r7).m14816W().equals(r18) != false) goto L41;
     */
    /* renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m18447x1() {
        /*
            Method dump skipped, instructions count: 920
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.m18447x1():java.lang.String");
    }

    @SuppressLint({"NewApi"})
    /* renamed from: x2 */
    public void m18448x2(ArrayList<LiveStreamsDBModel> arrayList) {
        LiveStreamDBHandler liveStreamDBHandler;
        String str;
        String str2;
        try {
            if (arrayList == null) {
                this.f22780K = new ArrayList<>();
                C5867t c5867t = new C5867t(this, this.f22780K);
                this.f22808R = c5867t;
                ListView listView = this.f22772I;
                if (listView != null) {
                    listView.setAdapter((ListAdapter) c5867t);
                    return;
                }
                return;
            }
            this.f22744B = false;
            this.f22789M0.setVisibility(8);
            if (arrayList.size() == 0) {
                if (this.f22939u2) {
                    TextView textView = this.f22789M0;
                    if (textView != null) {
                        this.f22744B = true;
                        textView.setFocusable(true);
                        this.f22789M0.requestFocus();
                        this.f22789M0.setVisibility(0);
                    }
                } else {
                    this.f22939u2 = true;
                    ArrayList<LiveStreamsDBModel> arrayList2 = this.f22932t0;
                    if (arrayList2 != null && this.f22922r0 != null) {
                        arrayList2.clear();
                        this.f22922r0.clear();
                    }
                    if (this.f22930s3.equals("true")) {
                        liveStreamDBHandler = this.f22800P;
                        str = this.f22850c1;
                        str2 = "radio_streams";
                    } else {
                        liveStreamDBHandler = this.f22800P;
                        str = this.f22850c1;
                        str2 = "live";
                    }
                    this.f22932t0 = liveStreamDBHandler.m15217f1(str, str2);
                    ArrayList<LiveStreamsDBModel> arrayList3 = this.f22932t0;
                    if (arrayList3 == null || arrayList3.size() <= 0) {
                        TextView textView2 = this.f22789M0;
                        if (textView2 != null) {
                            this.f22744B = true;
                            textView2.setFocusable(true);
                            this.f22789M0.requestFocus();
                            this.f22789M0.setVisibility(0);
                        }
                    } else {
                        m18448x2(this.f22932t0);
                    }
                }
            }
            Log.e("honey", "if part");
            C5867t c5867t2 = new C5867t(this, arrayList);
            this.f22808R = c5867t2;
            c5867t2.m28616f(this.f22789M0);
            ListView listView2 = this.f22772I;
            if (listView2 != null) {
                listView2.setAdapter((ListAdapter) this.f22808R);
                int i10 = this.f22944v2;
                if (i10 != 0) {
                    this.f22772I.setSelection(i10);
                }
                if (this.f22811R2.booleanValue()) {
                    this.f22772I.requestFocus();
                    this.f22811R2 = Boolean.FALSE;
                }
                this.f22772I.setOnItemSelectedListener(new C3763a(this));
                this.f22772I.setOnItemClickListener(new C3765b(this, arrayList));
                this.f22772I.setOnItemLongClickListener(new C3767c(this));
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: y1 */
    public void m18449y1() {
        m18403K1();
        this.f22924r2 = new AsyncTaskC3766b0(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels_with_cat");
    }

    @SuppressLint({"NewApi"})
    /* renamed from: y2 */
    public void m18450y2(ArrayList<LiveStreamsDBModel> arrayList) {
        if (arrayList != null) {
            try {
                if (arrayList.size() > 0) {
                    ListView listView = this.f22776J;
                    if (listView != null) {
                        listView.setVisibility(0);
                    }
                    this.f22744B = false;
                    C5865r c5865r = new C5865r(this, arrayList);
                    this.f22856d3 = c5865r;
                    ListView listView2 = this.f22776J;
                    if (listView2 != null) {
                        listView2.setAdapter((ListAdapter) c5865r);
                        this.f22776J.setSelection(this.f22875h3);
                        this.f22776J.setOnItemClickListener(new C3792y(this, arrayList));
                        return;
                    }
                    return;
                }
            } catch (Exception e10) {
                return;
            }
        }
        LinearLayout linearLayout = this.f22793N0;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        ListView listView3 = this.f22776J;
        if (listView3 != null) {
            listView3.setVisibility(8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x015c, code lost:
    
        if (r6.f22932t0.get(r7).m14816W().equals(r18) != false) goto L41;
     */
    /* renamed from: z1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m18451z1() {
        /*
            Method dump skipped, instructions count: 935
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity.m18451z1():java.lang.String");
    }

    /* renamed from: z2 */
    public void m18452z2(String str) {
        TextView textView = this.tv_channel_name;
        if (textView != null) {
            textView.setText(str);
            this.tv_channel_name.setSelected(true);
        }
    }
}

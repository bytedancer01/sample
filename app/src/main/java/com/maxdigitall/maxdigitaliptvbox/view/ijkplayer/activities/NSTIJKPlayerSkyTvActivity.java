package com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities;

import android.R;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.Log;
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
import android.widget.ActionMenuView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
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
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.amazonaws.mobileconnectors.appsync.AWSAppSyncClient;
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
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import nf.C6783a;
import org.apache.commons.net.tftp.TFTP;
import org.apache.http.client.config.CookieSpecs;
import p030c0.C0936d;
import p151if.C5251a;
import p151if.C5255e;
import p203lf.C5864q;
import p203lf.C5865r;
import p203lf.C5866s;
import p290qf.C7920a;
import p428yg.C10014t;
import pf.C7707c;
import pf.C7709e;
import pf.C7711g;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import wf.C9572b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity.class */
public class NSTIJKPlayerSkyTvActivity extends ActivityC0243b implements SurfaceHolder.Callback, View.OnClickListener {

    /* renamed from: n3 */
    public static SharedPreferences f23025n3;

    /* renamed from: o3 */
    public static SharedPreferences f23026o3;

    /* renamed from: q3 */
    public static String f23028q3;

    /* renamed from: r3 */
    public static String f23029r3;

    /* renamed from: t3 */
    public static ProgressBar f23031t3;

    /* renamed from: A0 */
    public SharedPreferences.Editor f23033A0;

    /* renamed from: A1 */
    public Handler f23034A1;

    /* renamed from: A2 */
    public Boolean f23035A2;

    /* renamed from: B */
    public int f23036B;

    /* renamed from: B0 */
    public ArrayList<FavouriteDBModel> f23037B0;

    /* renamed from: B1 */
    public Handler f23038B1;

    /* renamed from: B2 */
    public C6783a f23039B2;

    /* renamed from: C */
    public String f23040C;

    /* renamed from: C0 */
    public ArrayList<FavouriteM3UModel> f23041C0;

    /* renamed from: C1 */
    public Handler f23042C1;

    /* renamed from: C2 */
    public Handler f23043C2;

    /* renamed from: D */
    public String f23044D;

    /* renamed from: D0 */
    public RecyclerView f23045D0;

    /* renamed from: D1 */
    public Handler f23046D1;

    /* renamed from: D2 */
    public Handler f23047D2;

    /* renamed from: E */
    public String f23048E;

    /* renamed from: E0 */
    public ProgressBar f23049E0;

    /* renamed from: E1 */
    public Handler f23050E1;

    /* renamed from: E2 */
    public ArrayList<ExternalPlayerModelClass> f23051E2;

    /* renamed from: F */
    public RelativeLayout f23052F;

    /* renamed from: F0 */
    public Toolbar f23053F0;

    /* renamed from: F1 */
    public Handler f23054F1;

    /* renamed from: F2 */
    public int f23055F2;

    /* renamed from: G */
    public ListView f23056G;

    /* renamed from: G0 */
    public SearchView f23057G0;

    /* renamed from: G1 */
    public SharedPreferences.Editor f23058G1;

    /* renamed from: G2 */
    public String f23059G2;

    /* renamed from: H */
    public ListView f23060H;

    /* renamed from: H0 */
    public TextView f23061H0;

    /* renamed from: H1 */
    public SharedPreferences.Editor f23062H1;

    /* renamed from: H2 */
    public String f23063H2;

    /* renamed from: I */
    public ArrayList<LiveStreamsDBModel> f23064I;

    /* renamed from: I0 */
    public LinearLayout f23065I0;

    /* renamed from: I1 */
    public SharedPreferences.Editor f23066I1;

    /* renamed from: I2 */
    public Boolean f23067I2;

    /* renamed from: J0 */
    public LinearLayout f23069J0;

    /* renamed from: J1 */
    public TextView f23070J1;

    /* renamed from: J2 */
    public Animation f23071J2;

    /* renamed from: K0 */
    public AppBarLayout f23073K0;

    /* renamed from: K2 */
    public Animation f23075K2;

    /* renamed from: L */
    public String f23076L;

    /* renamed from: L2 */
    public Animation f23079L2;

    /* renamed from: M1 */
    public LinearLayout f23082M1;

    /* renamed from: M2 */
    public Animation f23083M2;

    /* renamed from: N */
    public LiveStreamDBHandler f23084N;

    /* renamed from: N1 */
    public TextView f23086N1;

    /* renamed from: N2 */
    public Animation f23087N2;

    /* renamed from: O */
    public SharedPreferences f23088O;

    /* renamed from: O0 */
    public String f23089O0;

    /* renamed from: O2 */
    public Animation f23091O2;

    /* renamed from: P */
    public SharedPreferences f23092P;

    /* renamed from: P1 */
    public Boolean f23094P1;

    /* renamed from: P2 */
    public Animation f23095P2;

    /* renamed from: Q */
    public SharedPreferences f23096Q;

    /* renamed from: Q0 */
    public RelativeLayout f23097Q0;

    /* renamed from: Q1 */
    public Boolean f23098Q1;

    /* renamed from: Q2 */
    public Animation f23099Q2;

    /* renamed from: R */
    public SharedPreferences f23100R;

    /* renamed from: R0 */
    public LinearLayout f23101R0;

    /* renamed from: R1 */
    public Menu f23102R1;

    /* renamed from: R2 */
    public Animation f23103R2;

    /* renamed from: S */
    public SharedPreferences f23104S;

    /* renamed from: S0 */
    public RelativeLayout f23105S0;

    /* renamed from: S1 */
    public MenuItem f23106S1;

    /* renamed from: S2 */
    public String f23107S2;

    /* renamed from: T */
    public SharedPreferences f23108T;

    /* renamed from: T0 */
    public RelativeLayout f23109T0;

    /* renamed from: T1 */
    public DateFormat f23110T1;

    /* renamed from: T2 */
    public C5864q f23111T2;

    /* renamed from: U */
    public SharedPreferences f23112U;

    /* renamed from: U0 */
    public RelativeLayout f23113U0;

    /* renamed from: U1 */
    public String f23114U1;

    /* renamed from: U2 */
    public C5864q f23115U2;

    /* renamed from: V */
    public SharedPreferences f23116V;

    /* renamed from: V1 */
    public String f23118V1;

    /* renamed from: V2 */
    public C5865r f23119V2;

    /* renamed from: W */
    public SharedPreferences f23120W;

    /* renamed from: W1 */
    public String f23122W1;

    /* renamed from: W2 */
    public C5866s f23123W2;

    /* renamed from: X */
    public SimpleDateFormat f23124X;

    /* renamed from: X0 */
    public TextView f23125X0;

    /* renamed from: X1 */
    public SimpleDateFormat f23126X1;

    /* renamed from: X2 */
    public LinearLayoutManager f23127X2;

    /* renamed from: Y */
    public String f23128Y;

    /* renamed from: Y0 */
    public TextView f23129Y0;

    /* renamed from: Y1 */
    public NSTIJKPlayerSkyTv f23130Y1;

    /* renamed from: Y2 */
    public LinearLayoutManager f23131Y2;

    /* renamed from: Z */
    public RelativeLayout f23132Z;

    /* renamed from: Z0 */
    public TextView f23133Z0;

    /* renamed from: Z1 */
    public Date f23134Z1;

    /* renamed from: Z2 */
    public int f23135Z2;

    /* renamed from: a1 */
    public TextView f23136a1;

    /* renamed from: a2 */
    public String f23137a2;

    /* renamed from: a3 */
    public Animation f23138a3;

    /* renamed from: b1 */
    public String f23139b1;

    /* renamed from: b2 */
    public Boolean f23140b2;

    /* renamed from: b3 */
    public Animation f23141b3;

    /* renamed from: c1 */
    public TextView f23142c1;

    /* renamed from: c2 */
    public DialogC0242a f23143c2;

    /* renamed from: c3 */
    public String f23144c3;

    /* renamed from: d */
    public Context f23145d;

    /* renamed from: d1 */
    public TextView f23146d1;

    /* renamed from: d2 */
    public String f23147d2;

    /* renamed from: d3 */
    public String f23148d3;

    /* renamed from: e */
    public String f23149e;

    /* renamed from: e1 */
    public TextView f23150e1;

    /* renamed from: e2 */
    public Boolean f23151e2;

    /* renamed from: e3 */
    public String f23152e3;

    @BindView
    public EditText et_search_left_side;

    /* renamed from: f */
    public View f23153f;

    /* renamed from: f1 */
    public TextView f23155f1;

    /* renamed from: f2 */
    public C9572b f23156f2;

    /* renamed from: f3 */
    public String f23157f3;

    @BindView
    public FrameLayout fl_sub_font_size;

    /* renamed from: g */
    public View f23158g;

    /* renamed from: g0 */
    public TextView f23159g0;

    /* renamed from: g1 */
    public TextView f23160g1;

    /* renamed from: g2 */
    public String f23161g2;

    /* renamed from: g3 */
    public int f23162g3;

    /* renamed from: h */
    public View f23163h;

    /* renamed from: h0 */
    public ArrayList<LiveStreamCategoryIdDBModel> f23164h0;

    /* renamed from: h1 */
    public TextView f23165h1;

    /* renamed from: h2 */
    public int f23166h2;

    /* renamed from: h3 */
    public boolean f23167h3;

    @BindView
    public TextView header_page_title;

    /* renamed from: i */
    public String f23168i;

    /* renamed from: i0 */
    public ArrayList<LiveStreamCategoryIdDBModel> f23169i0;

    /* renamed from: i1 */
    public TextView f23170i1;

    /* renamed from: i2 */
    public int f23171i2;

    /* renamed from: i3 */
    public boolean f23172i3;

    @BindView
    public ImageView iv_audio_subtitle_track;

    @BindView
    public ImageView iv_back;

    @BindView
    public ImageView iv_back_episodes;

    @BindView
    public ImageView iv_back_settings;

    @BindView
    public ImageView iv_pause;

    @BindView
    public ImageView iv_play;

    @BindView
    public ImageView iv_radio;

    /* renamed from: j */
    public View f23173j;

    /* renamed from: j0 */
    public ArrayList<LiveStreamCategoryIdDBModel> f23174j0;

    /* renamed from: j1 */
    public TextView f23175j1;

    /* renamed from: j2 */
    public String f23176j2;

    /* renamed from: j3 */
    public MultiUserDBHandler f23177j3;

    /* renamed from: k */
    public View f23178k;

    /* renamed from: k0 */
    public ArrayList<LiveStreamCategoryIdDBModel> f23179k0;

    /* renamed from: k1 */
    public LinearLayout f23180k1;

    /* renamed from: k2 */
    public Boolean f23181k2;

    /* renamed from: k3 */
    public Thread f23182k3;

    /* renamed from: l0 */
    public ArrayList<LiveStreamCategoryIdDBModel> f23184l0;

    /* renamed from: l1 */
    public String f23185l1;

    /* renamed from: l2 */
    public AsyncTask f23186l2;

    /* renamed from: l3 */
    public Boolean f23187l3;

    @BindView
    public LinearLayout ll_audio_subtitle_settings;

    @BindView
    public LinearLayout ll_audio_subtitle_settings_click;

    @BindView
    public LinearLayout ll_back;

    @BindView
    public LinearLayout ll_back_click;

    @BindView
    public LinearLayout ll_bottom_footer_icons;

    @BindView
    public LinearLayout ll_brightness;

    @BindView
    public LinearLayout ll_channels_list;

    @BindView
    public LinearLayout ll_click_to_play;

    @BindView
    public LinearLayout ll_crop;

    @BindView
    public LinearLayout ll_multi_screen;

    @BindView
    public LinearLayout ll_next_channel;

    @BindView
    public LinearLayout ll_no_cat_found;

    @BindView
    public LinearLayout ll_no_cat_found_player;

    @BindView
    public LinearLayout ll_pause_play;

    @BindView
    public LinearLayout ll_player_header_footer;

    @BindView
    public LinearLayout ll_previous_channel;

    @BindView
    public LinearLayout ll_toolbar;

    @BindView
    public LinearLayout ll_top_left_back;

    @BindView
    public LinearLayout ll_top_right_setting;

    @BindView
    public LinearLayout ll_volume;

    /* renamed from: m */
    public LinearLayout f23188m;

    /* renamed from: m0 */
    public ArrayList<LiveStreamsDBModel> f23189m0;

    /* renamed from: m1 */
    public LinearLayout f23190m1;

    /* renamed from: m2 */
    public AsyncTask f23191m2;

    /* renamed from: m3 */
    public boolean f23192m3;

    /* renamed from: n */
    public TextView f23193n;

    /* renamed from: n0 */
    public ArrayList<LiveStreamsDBModel> f23194n0;

    /* renamed from: n1 */
    public LinearLayout f23195n1;

    /* renamed from: n2 */
    public AsyncTask f23196n2;

    @BindView
    public TextView no_audio_track;

    @BindView
    public TextView no_subtitle_track;

    @BindView
    public TextView no_video_track;

    /* renamed from: o */
    public ImageView f23197o;

    /* renamed from: o0 */
    public ArrayList<LiveStreamsDBModel> f23198o0;

    /* renamed from: o1 */
    public LinearLayout f23199o1;

    /* renamed from: o2 */
    public ProgressDialog f23200o2;

    /* renamed from: p */
    public TextView f23201p;

    /* renamed from: p0 */
    public ArrayList<LiveStreamsDBModel> f23202p0;

    /* renamed from: p1 */
    public LinearLayout f23203p1;

    /* renamed from: p2 */
    public boolean f23204p2;

    /* renamed from: q */
    public TextView f23205q;

    /* renamed from: q0 */
    public ArrayList<LiveStreamsDBModel> f23206q0;

    /* renamed from: q1 */
    public LinearLayout f23207q1;

    /* renamed from: q2 */
    public int f23208q2;

    /* renamed from: r */
    public TextView f23209r;

    /* renamed from: r0 */
    public ArrayList<LiveStreamsDBModel> f23210r0;

    /* renamed from: r1 */
    public String f23211r1;

    /* renamed from: r2 */
    public boolean f23212r2;

    @BindView
    public RecyclerView recycler_view_left_sidebar;

    @BindView
    public RecyclerView recycler_view_left_sidebar_player;

    @BindView
    public RadioGroup rg_audio;

    @BindView
    public RadioGroup rg_subtitle;

    @BindView
    public RadioGroup rg_video;

    @BindView
    public RelativeLayout rl_episodes_box;

    @BindView
    public RelativeLayout rl_episodes_box_player;

    @BindView
    public RelativeLayout rl_search_cat;

    @BindView
    public RelativeLayout rl_settings_box;

    /* renamed from: s */
    public TextView f23213s;

    /* renamed from: s0 */
    public ArrayList<LiveStreamsDBModel> f23214s0;

    /* renamed from: s1 */
    public int f23215s1;

    /* renamed from: s2 */
    public int f23216s2;

    @BindView
    public SeekBar sb_brightness;

    @BindView
    public SeekBar sb_volume;

    /* renamed from: t */
    public LinearLayout f23217t;

    /* renamed from: t0 */
    public ArrayList<LiveStreamsDBModel> f23218t0;

    /* renamed from: t2 */
    public int f23220t2;

    @BindView
    public TextView tv_brightness;

    @BindView
    public TextView tv_episode_name;

    @BindView
    public TextView tv_sub_font_size;

    @BindView
    public TextView tv_volume;

    /* renamed from: u */
    public ProgressBar f23221u;

    /* renamed from: u0 */
    public ArrayList<LiveStreamsDBModel> f23222u0;

    /* renamed from: u1 */
    public DatabaseHandler f23223u1;

    /* renamed from: u2 */
    public SharedPreferences f23224u2;

    /* renamed from: v */
    public LinearLayout f23225v;

    /* renamed from: v0 */
    public ArrayList<LiveStreamsDBModel> f23226v0;

    /* renamed from: v1 */
    public SharedPreferences.Editor f23227v1;

    /* renamed from: v2 */
    public Boolean f23228v2;

    /* renamed from: w */
    public LinearLayout f23229w;

    /* renamed from: w1 */
    public SharedPreferences.Editor f23231w1;

    /* renamed from: w2 */
    public Boolean f23232w2;

    /* renamed from: x0 */
    public ArrayList<LiveStreamCategoryIdDBModel> f23234x0;

    /* renamed from: x1 */
    public TextView f23235x1;

    /* renamed from: x2 */
    public Boolean f23236x2;

    /* renamed from: y0 */
    public ArrayList<PasswordStatusDBModel> f23238y0;

    /* renamed from: y1 */
    public String f23239y1;

    /* renamed from: y2 */
    public Boolean f23240y2;

    /* renamed from: z0 */
    public SharedPreferences f23242z0;

    /* renamed from: z1 */
    public TextView f23243z1;

    /* renamed from: z2 */
    public Boolean f23244z2;

    /* renamed from: p3 */
    public static boolean f23027p3 = false;

    /* renamed from: s3 */
    public static final int[] f23030s3 = {0, 1, 2, 3, 4, 5};

    /* renamed from: l */
    public boolean f23183l = false;

    /* renamed from: x */
    public boolean f23233x = true;

    /* renamed from: y */
    public boolean f23237y = false;

    /* renamed from: z */
    public boolean f23241z = false;

    /* renamed from: A */
    public boolean f23032A = false;

    /* renamed from: J */
    public boolean f23068J = true;

    /* renamed from: K */
    public long f23072K = 2500;

    /* renamed from: M */
    public boolean f23080M = true;

    /* renamed from: f0 */
    public int f23154f0 = 0;

    /* renamed from: w0 */
    public ArrayList<String> f23230w0 = new ArrayList<>();

    /* renamed from: L0 */
    public boolean f23077L0 = true;

    /* renamed from: M0 */
    public boolean f23081M0 = false;

    /* renamed from: N0 */
    public boolean f23085N0 = false;

    /* renamed from: P0 */
    public boolean f23093P0 = true;

    /* renamed from: V0 */
    public String f23117V0 = "";

    /* renamed from: W0 */
    public String f23121W0 = "";

    /* renamed from: t1 */
    public String f23219t1 = "";

    /* renamed from: K1 */
    public int f23074K1 = 0;

    /* renamed from: L1 */
    public StringBuilder f23078L1 = new StringBuilder();

    /* renamed from: O1 */
    public int f23090O1 = -1;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$a.class */
    public class RunnableC3794a implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerSkyTvActivity f23245b;

        public RunnableC3794a(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity) {
            this.f23245b = nSTIJKPlayerSkyTvActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23245b.m18568N2("", false);
            this.f23245b.f23187l3 = Boolean.TRUE;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$a0.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$a0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$a0.class */
    public class AsyncTaskC3795a0 extends AsyncTask<String, String, String> {

        /* renamed from: a */
        public final NSTIJKPlayerSkyTvActivity f23246a;

        public AsyncTaskC3795a0(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity) {
            this.f23246a = nSTIJKPlayerSkyTvActivity;
        }

        /* JADX WARN: Removed duplicated region for block: B:65:0x0456 A[LOOP:1: B:53:0x039c->B:65:0x0456, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x03e2 A[SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String m18614a() {
            /*
                Method dump skipped, instructions count: 1172
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.AsyncTaskC3795a0.m18614a():java.lang.String");
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            try {
                return this.f23246a.f23063H2.equals("-1") ? SharepreferenceDBHandler.m15373f(this.f23246a.f23145d).equals("m3u") ? this.f23246a.m18593f2() : this.f23246a.m18594g2() : this.f23246a.f23063H2.equals("-6") ? this.f23246a.m18571P1() : m18614a();
            } catch (Exception e10) {
                return "error";
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            try {
                if (this.f23246a.f23206q0 != null) {
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = this.f23246a;
                    nSTIJKPlayerSkyTvActivity.m18566M2(nSTIJKPlayerSkyTvActivity.f23206q0);
                    if (!this.f23246a.f23098Q1.booleanValue()) {
                        this.f23246a.f23098Q1 = Boolean.TRUE;
                        if (this.f23246a.f23206q0 == null || this.f23246a.f23206q0.size() == 0) {
                            C5251a.f30008G = Boolean.FALSE;
                            this.f23246a.m18547A2();
                        } else {
                            if (!this.f23246a.f23148d3.equals("true") && !this.f23246a.f23039B2.m31271i()) {
                                LinearLayout linearLayout = this.f23246a.ll_click_to_play;
                                if (linearLayout != null) {
                                    linearLayout.setVisibility(0);
                                }
                            }
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity2 = this.f23246a;
                            nSTIJKPlayerSkyTvActivity2.m18552F2(nSTIJKPlayerSkyTvActivity2.f23206q0);
                        }
                    }
                }
                this.f23246a.m18606s2();
                this.f23246a.m18603p2();
                this.f23246a.m18586X1();
                this.f23246a.m18584W1();
            } catch (Exception e10) {
                this.f23246a.m18606s2();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            LinearLayout linearLayout;
            super.onPreExecute();
            try {
                RelativeLayout relativeLayout = this.f23246a.rl_episodes_box_player;
                if (relativeLayout == null || relativeLayout.getVisibility() != 0) {
                    this.f23246a.f23144c3 = "";
                } else {
                    this.f23246a.f23144c3 = "player";
                }
            } catch (Exception e10) {
            }
            this.f23246a.m18578S2();
            if (this.f23246a.f23144c3.equals("player")) {
                if (this.f23246a.f23060H != null) {
                    this.f23246a.f23060H.setVisibility(8);
                }
                linearLayout = this.f23246a.f23069J0;
                if (linearLayout == null) {
                    return;
                }
            } else {
                if (this.f23246a.f23056G != null) {
                    this.f23246a.f23056G.setVisibility(8);
                }
                linearLayout = this.f23246a.f23065I0;
                if (linearLayout == null) {
                    return;
                }
            }
            linearLayout.setVisibility(8);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$b.class */
    public class RunnableC3796b implements Runnable {

        /* renamed from: b */
        public final String f23247b;

        /* renamed from: c */
        public final String f23248c;

        /* renamed from: d */
        public final int f23249d;

        /* renamed from: e */
        public final NSTIJKPlayerSkyTvActivity f23250e;

        public RunnableC3796b(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity, String str, String str2, int i10) {
            this.f23250e = nSTIJKPlayerSkyTvActivity;
            this.f23247b = str;
            this.f23248c = str2;
            this.f23249d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv;
            String str;
            if (this.f23250e.f23118V1.equals("m3u")) {
                nSTIJKPlayerSkyTv = this.f23250e.f23130Y1;
                str = this.f23247b;
            } else {
                nSTIJKPlayerSkyTv = this.f23250e.f23130Y1;
                str = this.f23250e.f23149e + C5255e.m26214Q(((LiveStreamsDBModel) this.f23250e.f23214s0.get(this.f23249d)).m14811R()) + this.f23250e.f23128Y;
            }
            nSTIJKPlayerSkyTv.m19456Z0(Uri.parse(str), NSTIJKPlayerSkyTvActivity.f23027p3, this.f23248c);
            this.f23250e.f23130Y1.f24465I = 0;
            this.f23250e.f23130Y1.f24471K = false;
            this.f23250e.f23130Y1.start();
            this.f23250e.f23046D1.removeCallbacksAndMessages(null);
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = this.f23250e;
            nSTIJKPlayerSkyTvActivity.f23044D = ((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity.f23214s0.get(this.f23249d)).m14798E();
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity2 = this.f23250e;
            nSTIJKPlayerSkyTvActivity2.f23048E = ((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity2.f23214s0.get(this.f23249d)).m14810Q();
            this.f23250e.f23130Y1.setCurrentEpgChannelID(this.f23250e.f23044D);
            this.f23250e.f23130Y1.setCurrentChannelLogo(this.f23250e.f23048E);
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity3 = this.f23250e;
            nSTIJKPlayerSkyTvActivity3.m18588Y2(nSTIJKPlayerSkyTvActivity3.f23048E);
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity4 = this.f23250e;
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity5 = this.f23250e;
            nSTIJKPlayerSkyTvActivity4.f23196n2 = new AsyncTaskC3799c0(nSTIJKPlayerSkyTvActivity5, nSTIJKPlayerSkyTvActivity5.f23044D, null).execute(new String[0]);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$b0.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$b0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$b0.class */
    public class ViewOnFocusChangeListenerC3797b0 implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f23251b;

        /* renamed from: c */
        public final NSTIJKPlayerSkyTvActivity f23252c;

        public ViewOnFocusChangeListenerC3797b0(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity, View view) {
            this.f23252c = nSTIJKPlayerSkyTvActivity;
            this.f23251b = view;
        }

        /* renamed from: a */
        public final void m18617a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f23251b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m18618b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f23251b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m18619c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f23251b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            View view2;
            View view3;
            View view4;
            View view5;
            Resources resources;
            int i10;
            LinearLayout linearLayout;
            int i11;
            Drawable drawable;
            View view6;
            View view7;
            View view8;
            View view9;
            if (z10) {
                float f10 = z10 ? 1.08f : 1.0f;
                View view10 = this.f23251b;
                if (view10 == null || view10.getTag() == null || !this.f23251b.getTag().equals("1")) {
                    View view11 = this.f23251b;
                    if (view11 == null || view11.getTag() == null || !this.f23251b.getTag().equals("2")) {
                        View view12 = this.f23251b;
                        if (view12 == null || view12.getTag() == null || !this.f23251b.getTag().equals("3")) {
                            View view13 = this.f23251b;
                            if ((view13 == null || view13.getTag() == null || !this.f23251b.getTag().equals("4")) && (((view6 = this.f23251b) == null || view6.getTag() == null || !this.f23251b.getTag().equals("5")) && (((view7 = this.f23251b) == null || view7.getTag() == null || !this.f23251b.getTag().equals("6")) && ((view8 = this.f23251b) == null || view8.getTag() == null || !this.f23251b.getTag().equals("7"))))) {
                                View view14 = this.f23251b;
                                if (view14 != null && view14.getTag() != null && this.f23251b.getTag().equals("8")) {
                                    return;
                                }
                                View view15 = this.f23251b;
                                if (view15 == null || view15.getTag() == null || !this.f23251b.getTag().equals("9")) {
                                    View view16 = this.f23251b;
                                    if (view16 != null && view16.getTag() != null && this.f23251b.getTag().equals("10")) {
                                        return;
                                    }
                                    View view17 = this.f23251b;
                                    if (view17 == null || view17.getTag() == null || !this.f23251b.getTag().equals("11")) {
                                        View view18 = this.f23251b;
                                        if (view18 == null || view18.getTag() == null || !this.f23251b.getTag().equals("12")) {
                                            View view19 = this.f23251b;
                                            if ((view19 == null || view19.getTag() == null || !this.f23251b.getTag().equals("13")) && ((view9 = this.f23251b) == null || view9.getTag() == null || !this.f23251b.getTag().equals("14"))) {
                                                return;
                                            }
                                        } else {
                                            resources = this.f23252c.getResources();
                                            i10 = 2131230846;
                                        }
                                    } else {
                                        resources = this.f23252c.getResources();
                                        i10 = 2131099870;
                                    }
                                    drawable = resources.getDrawable(i10);
                                }
                            }
                            drawable = this.f23252c.getResources().getDrawable(2131231461);
                        }
                        view.setBackground(this.f23252c.getResources().getDrawable(2131231460));
                        m18618b(f10);
                        m18619c(f10);
                        return;
                    }
                    view.setBackground(this.f23252c.getResources().getDrawable(2131231460));
                    m18618b(f10);
                    m18619c(f10);
                    linearLayout = this.f23252c.ll_audio_subtitle_settings;
                } else {
                    view.setBackground(this.f23252c.getResources().getDrawable(2131231460));
                    m18618b(f10);
                    m18619c(f10);
                    linearLayout = this.f23252c.ll_back;
                }
                i11 = 0;
                linearLayout.setVisibility(i11);
                return;
            }
            if (z10) {
                return;
            }
            float f11 = z10 ? 1.08f : 1.0f;
            View view20 = this.f23251b;
            if (view20 == null || view20.getTag() == null || !this.f23251b.getTag().equals("1")) {
                View view21 = this.f23251b;
                if (view21 == null || view21.getTag() == null || !this.f23251b.getTag().equals("2")) {
                    View view22 = this.f23251b;
                    if (view22 == null || view22.getTag() == null || !this.f23251b.getTag().equals("3")) {
                        View view23 = this.f23251b;
                        if ((view23 == null || view23.getTag() == null || !this.f23251b.getTag().equals("4")) && (((view2 = this.f23251b) == null || view2.getTag() == null || !this.f23251b.getTag().equals("5")) && (((view3 = this.f23251b) == null || view3.getTag() == null || !this.f23251b.getTag().equals("6")) && ((view4 = this.f23251b) == null || view4.getTag() == null || !this.f23251b.getTag().equals("7"))))) {
                            View view24 = this.f23251b;
                            if (view24 != null && view24.getTag() != null && this.f23251b.getTag().equals("8")) {
                                return;
                            }
                            View view25 = this.f23251b;
                            if (view25 == null || view25.getTag() == null || !this.f23251b.getTag().equals("9")) {
                                View view26 = this.f23251b;
                                if (view26 != null && view26.getTag() != null && this.f23251b.getTag().equals("10")) {
                                    return;
                                }
                                View view27 = this.f23251b;
                                if (view27 == null || view27.getTag() == null || !this.f23251b.getTag().equals("11")) {
                                    View view28 = this.f23251b;
                                    if (view28 == null || view28.getTag() == null || !this.f23251b.getTag().equals("12")) {
                                        View view29 = this.f23251b;
                                        if ((view29 == null || view29.getTag() == null || !this.f23251b.getTag().equals("13")) && ((view5 = this.f23251b) == null || view5.getTag() == null || !this.f23251b.getTag().equals("14"))) {
                                            return;
                                        }
                                    } else {
                                        resources = this.f23252c.getResources();
                                        i10 = 2131230845;
                                    }
                                } else {
                                    resources = this.f23252c.getResources();
                                    i10 = 2131099771;
                                }
                                drawable = resources.getDrawable(i10);
                            }
                        }
                        view.setBackground(null);
                        return;
                    }
                    view.setBackground(this.f23252c.getResources().getDrawable(2131231458));
                    m18618b(f11);
                    m18619c(f11);
                    m18617a(z10);
                    return;
                }
                view.setBackground(this.f23252c.getResources().getDrawable(2131231458));
                m18618b(f11);
                m18619c(f11);
                m18617a(z10);
                linearLayout = this.f23252c.ll_audio_subtitle_settings;
            } else {
                view.setBackground(this.f23252c.getResources().getDrawable(2131231458));
                m18618b(f11);
                m18619c(f11);
                m18617a(z10);
                linearLayout = this.f23252c.ll_back;
            }
            i11 = 8;
            linearLayout.setVisibility(i11);
            return;
            view.setBackground(drawable);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$c.class */
    public class RunnableC3798c implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerSkyTvActivity f23253b;

        public RunnableC3798c(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity) {
            this.f23253b = nSTIJKPlayerSkyTvActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23253b.m18568N2("", false);
            this.f23253b.f23187l3 = Boolean.TRUE;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$c0.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$c0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$c0.class */
    public class AsyncTaskC3799c0 extends AsyncTask<String, Void, HashMap<String, ArrayList<String>>> {

        /* renamed from: a */
        public String f23254a;

        /* renamed from: b */
        public final NSTIJKPlayerSkyTvActivity f23255b;

        public AsyncTaskC3799c0(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity, String str) {
            this.f23255b = nSTIJKPlayerSkyTvActivity;
            this.f23254a = str;
        }

        public /* synthetic */ AsyncTaskC3799c0(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity, String str, ViewOnClickListenerC3811k viewOnClickListenerC3811k) {
            this(nSTIJKPlayerSkyTvActivity, str);
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public HashMap<String, ArrayList<String>> doInBackground(String... strArr) {
            try {
                return this.f23255b.m18572P2(this.f23254a);
            } catch (Exception e10) {
                return new HashMap<>();
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(HashMap<String, ArrayList<String>> hashMap) {
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity;
            ArrayList<String> arrayList;
            super.onPostExecute(hashMap);
            try {
                if (hashMap.get("2") != null) {
                    ArrayList<String> arrayList2 = hashMap.get("2");
                    if (arrayList2 == null || arrayList2.get(0) == null || !arrayList2.get(0).equals("installed")) {
                        this.f23255b.f23203p1.setVisibility(0);
                        nSTIJKPlayerSkyTvActivity = this.f23255b;
                    } else if (hashMap.get("0") != null) {
                        ArrayList<String> arrayList3 = hashMap.get("0");
                        if (arrayList3 != null && arrayList3.size() > 0) {
                            LinearLayout linearLayout = this.f23255b.f23207q1;
                            if (linearLayout != null) {
                                linearLayout.setVisibility(8);
                            }
                            if (hashMap.get("3") != null && this.f23255b.f23221u != null) {
                                ArrayList<String> arrayList4 = hashMap.get("3");
                                if (arrayList4 == null || arrayList4.get(0) == null) {
                                    this.f23255b.f23221u.setProgress(0);
                                } else {
                                    this.f23255b.f23221u.setProgress(Integer.parseInt(arrayList4.get(0)));
                                }
                            }
                            try {
                                if (arrayList3.get(0) != null) {
                                    this.f23255b.f23201p.setText(arrayList3.get(0));
                                } else {
                                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity2 = this.f23255b;
                                    nSTIJKPlayerSkyTvActivity2.f23201p.setText(nSTIJKPlayerSkyTvActivity2.f23145d.getResources().getString(2132018252));
                                }
                            } catch (Exception e10) {
                                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity3 = this.f23255b;
                                nSTIJKPlayerSkyTvActivity3.f23201p.setText(nSTIJKPlayerSkyTvActivity3.f23145d.getResources().getString(2132018252));
                            }
                            try {
                                if (arrayList3.get(1) != null) {
                                    this.f23255b.f23205q.setText(arrayList3.get(1));
                                } else {
                                    this.f23255b.f23205q.setText("");
                                }
                            } catch (Exception e11) {
                                this.f23255b.f23205q.setText("");
                            }
                            try {
                                if (arrayList3.get(3) != null) {
                                    this.f23255b.f23209r.setText(arrayList3.get(3));
                                } else {
                                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity4 = this.f23255b;
                                    nSTIJKPlayerSkyTvActivity4.f23209r.setText(nSTIJKPlayerSkyTvActivity4.f23145d.getResources().getString(2132018252));
                                }
                            } catch (Exception e12) {
                                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity5 = this.f23255b;
                                nSTIJKPlayerSkyTvActivity5.f23209r.setText(nSTIJKPlayerSkyTvActivity5.f23145d.getResources().getString(2132018252));
                            }
                            try {
                                if (arrayList3.get(4) != null) {
                                    this.f23255b.f23213s.setText(arrayList3.get(4));
                                } else {
                                    this.f23255b.f23213s.setText("");
                                }
                            } catch (Exception e13) {
                                this.f23255b.f23213s.setText("");
                            }
                            if (hashMap.get("1") != null || (arrayList = hashMap.get("1")) == null || arrayList.size() <= 0) {
                                this.f23255b.m18600m2();
                            }
                            try {
                                if (arrayList.get(0) != null) {
                                    TextView textView = this.f23255b.f23125X0;
                                    if (textView != null) {
                                        textView.setText(arrayList.get(0));
                                    }
                                } else {
                                    TextView textView2 = this.f23255b.f23125X0;
                                    if (textView2 != null) {
                                        textView2.setText("");
                                    }
                                }
                            } catch (Exception e14) {
                                TextView textView3 = this.f23255b.f23125X0;
                                if (textView3 != null) {
                                    textView3.setText("");
                                }
                            }
                            try {
                                if (arrayList.get(1) != null) {
                                    TextView textView4 = this.f23255b.f23160g1;
                                    if (textView4 != null) {
                                        textView4.setText(arrayList.get(1));
                                    }
                                } else {
                                    TextView textView5 = this.f23255b.f23160g1;
                                    if (textView5 != null) {
                                        textView5.setText("");
                                    }
                                }
                            } catch (Exception e15) {
                                TextView textView6 = this.f23255b.f23160g1;
                                if (textView6 != null) {
                                    textView6.setText("");
                                }
                            }
                            try {
                                if (arrayList.get(2) != null) {
                                    TextView textView7 = this.f23255b.f23129Y0;
                                    if (textView7 != null) {
                                        textView7.setText(arrayList.get(2));
                                    }
                                } else {
                                    TextView textView8 = this.f23255b.f23129Y0;
                                    if (textView8 != null) {
                                        textView8.setText("");
                                    }
                                }
                            } catch (Exception e16) {
                                TextView textView9 = this.f23255b.f23129Y0;
                                if (textView9 != null) {
                                    textView9.setText("");
                                }
                            }
                            TextView textView10 = this.f23255b.f23160g1;
                            if (textView10 != null) {
                                textView10.setSelected(true);
                            }
                            LinearLayout linearLayout2 = this.f23255b.f23180k1;
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(0);
                            }
                            try {
                                if (arrayList.get(3) != null) {
                                    TextView textView11 = this.f23255b.f23133Z0;
                                    if (textView11 != null) {
                                        textView11.setText(arrayList.get(3));
                                    }
                                } else {
                                    TextView textView12 = this.f23255b.f23133Z0;
                                    if (textView12 != null) {
                                        textView12.setText("");
                                    }
                                }
                            } catch (Exception e17) {
                                TextView textView13 = this.f23255b.f23133Z0;
                                if (textView13 != null) {
                                    textView13.setText("");
                                }
                            }
                            try {
                                if (arrayList.get(4) != null) {
                                    TextView textView14 = this.f23255b.f23165h1;
                                    if (textView14 != null) {
                                        textView14.setText(arrayList.get(4));
                                    }
                                } else {
                                    TextView textView15 = this.f23255b.f23165h1;
                                    if (textView15 != null) {
                                        textView15.setText("");
                                    }
                                }
                            } catch (Exception e18) {
                                TextView textView16 = this.f23255b.f23165h1;
                                if (textView16 != null) {
                                    textView16.setText("");
                                }
                            }
                            try {
                                if (arrayList.get(5) != null) {
                                    TextView textView17 = this.f23255b.f23136a1;
                                    if (textView17 != null) {
                                        textView17.setText(arrayList.get(5));
                                    }
                                } else {
                                    TextView textView18 = this.f23255b.f23136a1;
                                    if (textView18 != null) {
                                        textView18.setText("");
                                    }
                                }
                            } catch (Exception e19) {
                                TextView textView19 = this.f23255b.f23136a1;
                                if (textView19 != null) {
                                    textView19.setText("");
                                }
                            }
                            TextView textView20 = this.f23255b.f23165h1;
                            if (textView20 != null) {
                                textView20.setSelected(true);
                            }
                            LinearLayout linearLayout3 = this.f23255b.f23190m1;
                            if (linearLayout3 != null) {
                                linearLayout3.setVisibility(0);
                            }
                            try {
                                if (arrayList.get(6) != null) {
                                    TextView textView21 = this.f23255b.f23142c1;
                                    if (textView21 != null) {
                                        textView21.setText(arrayList.get(6));
                                    }
                                } else {
                                    TextView textView22 = this.f23255b.f23142c1;
                                    if (textView22 != null) {
                                        textView22.setText("");
                                    }
                                }
                            } catch (Exception e20) {
                                TextView textView23 = this.f23255b.f23142c1;
                                if (textView23 != null) {
                                    textView23.setText("");
                                }
                            }
                            try {
                                if (arrayList.get(7) != null) {
                                    TextView textView24 = this.f23255b.f23170i1;
                                    if (textView24 != null) {
                                        textView24.setText(arrayList.get(7));
                                    }
                                } else {
                                    TextView textView25 = this.f23255b.f23170i1;
                                    if (textView25 != null) {
                                        textView25.setText("");
                                    }
                                }
                            } catch (Exception e21) {
                                TextView textView26 = this.f23255b.f23170i1;
                                if (textView26 != null) {
                                    textView26.setText("");
                                }
                            }
                            try {
                                if (arrayList.get(8) != null) {
                                    TextView textView27 = this.f23255b.f23146d1;
                                    if (textView27 != null) {
                                        textView27.setText(arrayList.get(8));
                                    }
                                } else {
                                    TextView textView28 = this.f23255b.f23146d1;
                                    if (textView28 != null) {
                                        textView28.setText("");
                                    }
                                }
                            } catch (Exception e22) {
                                TextView textView29 = this.f23255b.f23146d1;
                                if (textView29 != null) {
                                    textView29.setText("");
                                }
                            }
                            TextView textView30 = this.f23255b.f23170i1;
                            if (textView30 != null) {
                                textView30.setSelected(true);
                            }
                            LinearLayout linearLayout4 = this.f23255b.f23195n1;
                            if (linearLayout4 != null) {
                                linearLayout4.setVisibility(0);
                            }
                            try {
                                if (arrayList.get(9) != null) {
                                    TextView textView31 = this.f23255b.f23150e1;
                                    if (textView31 != null) {
                                        textView31.setText(arrayList.get(9));
                                    }
                                } else {
                                    TextView textView32 = this.f23255b.f23150e1;
                                    if (textView32 != null) {
                                        textView32.setText("");
                                    }
                                }
                            } catch (Exception e23) {
                                TextView textView33 = this.f23255b.f23150e1;
                                if (textView33 != null) {
                                    textView33.setText("");
                                }
                            }
                            try {
                                if (arrayList.get(10) != null) {
                                    TextView textView34 = this.f23255b.f23175j1;
                                    if (textView34 != null) {
                                        textView34.setText(arrayList.get(10));
                                    }
                                } else {
                                    TextView textView35 = this.f23255b.f23175j1;
                                    if (textView35 != null) {
                                        textView35.setText("");
                                    }
                                }
                            } catch (Exception e24) {
                                TextView textView36 = this.f23255b.f23175j1;
                                if (textView36 != null) {
                                    textView36.setText("");
                                }
                            }
                            try {
                                if (arrayList.get(11) != null) {
                                    TextView textView37 = this.f23255b.f23155f1;
                                    if (textView37 != null) {
                                        textView37.setText(arrayList.get(11));
                                    }
                                } else {
                                    TextView textView38 = this.f23255b.f23155f1;
                                    if (textView38 != null) {
                                        textView38.setText("");
                                    }
                                }
                            } catch (Exception e25) {
                                TextView textView39 = this.f23255b.f23155f1;
                                if (textView39 != null) {
                                    textView39.setText("");
                                }
                            }
                            TextView textView40 = this.f23255b.f23175j1;
                            if (textView40 != null) {
                                textView40.setSelected(true);
                            }
                            LinearLayout linearLayout5 = this.f23255b.f23199o1;
                            if (linearLayout5 != null) {
                                linearLayout5.setVisibility(0);
                                return;
                            }
                            return;
                        }
                        nSTIJKPlayerSkyTvActivity = this.f23255b;
                    } else {
                        nSTIJKPlayerSkyTvActivity = this.f23255b;
                    }
                } else {
                    this.f23255b.f23203p1.setVisibility(0);
                    nSTIJKPlayerSkyTvActivity = this.f23255b;
                }
                nSTIJKPlayerSkyTvActivity.f23207q1.setVisibility(8);
                if (hashMap.get("1") != null) {
                }
                this.f23255b.m18600m2();
            } catch (Exception e26) {
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            try {
                this.f23255b.m18611x2();
                LinearLayout linearLayout = this.f23255b.f23180k1;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                LinearLayout linearLayout2 = this.f23255b.f23190m1;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                LinearLayout linearLayout3 = this.f23255b.f23195n1;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                }
                LinearLayout linearLayout4 = this.f23255b.f23199o1;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(8);
                }
                LinearLayout linearLayout5 = this.f23255b.f23203p1;
                if (linearLayout5 != null) {
                    linearLayout5.setVisibility(8);
                }
                LinearLayout linearLayout6 = this.f23255b.f23207q1;
                if (linearLayout6 != null) {
                    linearLayout6.setVisibility(0);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$d.class */
    public class RunnableC3800d implements Runnable {

        /* renamed from: b */
        public final String f23256b;

        /* renamed from: c */
        public final String f23257c;

        /* renamed from: d */
        public final int f23258d;

        /* renamed from: e */
        public final NSTIJKPlayerSkyTvActivity f23259e;

        public RunnableC3800d(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity, String str, String str2, int i10) {
            this.f23259e = nSTIJKPlayerSkyTvActivity;
            this.f23256b = str;
            this.f23257c = str2;
            this.f23258d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv;
            String str;
            if (this.f23259e.f23118V1.equals("m3u")) {
                nSTIJKPlayerSkyTv = this.f23259e.f23130Y1;
                str = this.f23256b;
            } else {
                nSTIJKPlayerSkyTv = this.f23259e.f23130Y1;
                str = this.f23259e.f23149e + C5255e.m26214Q(((LiveStreamsDBModel) this.f23259e.f23214s0.get(this.f23258d)).m14811R()) + this.f23259e.f23128Y;
            }
            nSTIJKPlayerSkyTv.m19456Z0(Uri.parse(str), NSTIJKPlayerSkyTvActivity.f23027p3, this.f23257c);
            this.f23259e.f23130Y1.f24465I = 0;
            this.f23259e.f23130Y1.f24471K = false;
            this.f23259e.f23130Y1.start();
            this.f23259e.f23046D1.removeCallbacksAndMessages(null);
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = this.f23259e;
            nSTIJKPlayerSkyTvActivity.f23044D = ((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity.f23214s0.get(this.f23258d)).m14798E();
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity2 = this.f23259e;
            nSTIJKPlayerSkyTvActivity2.f23048E = ((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity2.f23214s0.get(this.f23258d)).m14810Q();
            this.f23259e.f23130Y1.setCurrentEpgChannelID(this.f23259e.f23044D);
            this.f23259e.f23130Y1.setCurrentChannelLogo(this.f23259e.f23048E);
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity3 = this.f23259e;
            nSTIJKPlayerSkyTvActivity3.m18588Y2(nSTIJKPlayerSkyTvActivity3.f23048E);
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity4 = this.f23259e;
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity5 = this.f23259e;
            nSTIJKPlayerSkyTvActivity4.f23196n2 = new AsyncTaskC3799c0(nSTIJKPlayerSkyTvActivity5, nSTIJKPlayerSkyTvActivity5.f23044D, null).execute(new String[0]);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$d0.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$d0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$d0.class */
    public class AsyncTaskC3801d0 extends AsyncTask<String, Void, Void> {

        /* renamed from: a */
        public final String f23260a;

        /* renamed from: b */
        public final int f23261b;

        /* renamed from: c */
        public final String f23262c;

        /* renamed from: d */
        public final String f23263d;

        /* renamed from: e */
        public final String f23264e;

        /* renamed from: f */
        public final int f23265f;

        /* renamed from: g */
        public final NSTIJKPlayerSkyTvActivity f23266g;

        public AsyncTaskC3801d0(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity, String str, int i10, String str2, String str3, String str4, int i11) {
            this.f23266g = nSTIJKPlayerSkyTvActivity;
            this.f23260a = str;
            this.f23261b = i10;
            this.f23262c = str2;
            this.f23263d = str3;
            this.f23264e = str4;
            this.f23265f = i11;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            try {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = this.f23266g;
                if (nSTIJKPlayerSkyTvActivity.f23145d == null || nSTIJKPlayerSkyTvActivity.f23119V2 == null || this.f23266g.f23223u1 == null || this.f23266g.f23111T2 == null || this.f23266g.f23056G == null) {
                    return null;
                }
                FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
                favouriteDBModel.m14767h(this.f23260a);
                favouriteDBModel.m14772m(this.f23261b);
                favouriteDBModel.m14771l(this.f23263d);
                favouriteDBModel.m14770k(this.f23262c);
                favouriteDBModel.m14774o(SharepreferenceDBHandler.m15337A(this.f23266g.f23145d));
                this.f23266g.f23223u1.m15111l(favouriteDBModel, this.f23264e);
                return null;
            } catch (Exception e10) {
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r52) {
            super.onPostExecute(r52);
            try {
                View childAt = this.f23266g.f23056G.getChildAt(this.f23265f - this.f23266g.f23056G.getFirstVisiblePosition());
                if (childAt != null) {
                    try {
                        ((ImageView) childAt.findViewById(2131428179)).setVisibility(0);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                this.f23266g.f23111T2.m4100x(1);
                this.f23266g.m18606s2();
            } catch (Exception e11) {
                this.f23266g.m18606s2();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (this.f23266g.f23200o2 == null) {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = this.f23266g;
                nSTIJKPlayerSkyTvActivity.f23200o2 = NSTIJKPlayerSkyTvActivity.m18508Y1(nSTIJKPlayerSkyTvActivity.f23145d);
                if (this.f23266g.f23200o2 == null) {
                    return;
                }
            } else if (this.f23266g.f23200o2.isShowing()) {
                return;
            }
            this.f23266g.f23200o2.show();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$e.class */
    public class C3802e implements TextWatcher {

        /* renamed from: b */
        public final NSTIJKPlayerSkyTvActivity f23267b;

        public C3802e(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity) {
            this.f23267b = nSTIJKPlayerSkyTvActivity;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity;
            boolean z10;
            if (charSequence == null || charSequence.toString().length() <= 0) {
                nSTIJKPlayerSkyTvActivity = this.f23267b;
                z10 = false;
            } else {
                nSTIJKPlayerSkyTvActivity = this.f23267b;
                z10 = true;
            }
            nSTIJKPlayerSkyTvActivity.f23192m3 = z10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x000d, code lost:
        
            if (r4.toString().length() <= 0) goto L6;
         */
        @Override // android.text.TextWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onTextChanged(java.lang.CharSequence r4, int r5, int r6, int r7) {
            /*
                r3 = this;
                r0 = r4
                if (r0 == 0) goto L10
                r0 = r4
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L40
                int r0 = r0.length()     // Catch: java.lang.Exception -> L40
                if (r0 > 0) goto L1a
            L10:
                r0 = r3
                com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity r0 = r0.f23267b     // Catch: java.lang.Exception -> L40
                boolean r0 = com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.m18546z1(r0)     // Catch: java.lang.Exception -> L40
                if (r0 == 0) goto L3f
            L1a:
                r0 = r3
                com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity r0 = r0.f23267b     // Catch: java.lang.Exception -> L40
                lf.q r0 = com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.m18539v1(r0)     // Catch: java.lang.Exception -> L40
                if (r0 == 0) goto L3f
                r0 = r3
                com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity r0 = r0.f23267b     // Catch: java.lang.Exception -> L40
                lf.q r0 = com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.m18539v1(r0)     // Catch: java.lang.Exception -> L40
                android.widget.Filter r0 = r0.getFilter()     // Catch: java.lang.Exception -> L40
                r1 = r4
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L40
                r0.filter(r1)     // Catch: java.lang.Exception -> L40
                java.lang.String r0 = "honey"
                java.lang.String r1 = "onTextChanged: notify"
                int r0 = android.util.Log.e(r0, r1)     // Catch: java.lang.Exception -> L40
            L3f:
                return
            L40:
                r4 = move-exception
                goto L3f
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.C3802e.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$e0.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$e0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$e0.class */
    public class AsyncTaskC3803e0 extends AsyncTask<String, Void, Void> {

        /* renamed from: a */
        public final String f23268a;

        /* renamed from: b */
        public final String f23269b;

        /* renamed from: c */
        public final String f23270c;

        /* renamed from: d */
        public final int f23271d;

        /* renamed from: e */
        public final NSTIJKPlayerSkyTvActivity f23272e;

        public AsyncTaskC3803e0(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity, String str, String str2, String str3, int i10) {
            this.f23272e = nSTIJKPlayerSkyTvActivity;
            this.f23268a = str;
            this.f23269b = str2;
            this.f23270c = str3;
            this.f23271d = i10;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            try {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = this.f23272e;
                if (nSTIJKPlayerSkyTvActivity.f23145d == null || nSTIJKPlayerSkyTvActivity.f23119V2 == null) {
                    return null;
                }
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity2 = this.f23272e;
                if (nSTIJKPlayerSkyTvActivity2.f23084N == null || nSTIJKPlayerSkyTvActivity2.f23111T2 == null || this.f23272e.f23056G == null) {
                    return null;
                }
                FavouriteM3UModel favouriteM3UModel = new FavouriteM3UModel();
                favouriteM3UModel.m14782h(this.f23269b);
                favouriteM3UModel.m14783i(SharepreferenceDBHandler.m15337A(this.f23272e.f23145d));
                favouriteM3UModel.m14781g(this.f23270c);
                favouriteM3UModel.m14779e(this.f23268a);
                this.f23272e.f23084N.m15156D0(favouriteM3UModel);
                return null;
            } catch (Exception e10) {
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r52) {
            super.onPostExecute(r52);
            try {
                View childAt = this.f23272e.f23056G.getChildAt(this.f23271d - this.f23272e.f23056G.getFirstVisiblePosition());
                if (childAt != null) {
                    try {
                        ((ImageView) childAt.findViewById(2131428179)).setVisibility(0);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                this.f23272e.f23111T2.m4100x(1);
                this.f23272e.m18606s2();
            } catch (Exception e11) {
                this.f23272e.m18606s2();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (this.f23272e.f23200o2 == null) {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = this.f23272e;
                nSTIJKPlayerSkyTvActivity.f23200o2 = NSTIJKPlayerSkyTvActivity.m18508Y1(nSTIJKPlayerSkyTvActivity.f23145d);
                if (this.f23272e.f23200o2 == null) {
                    return;
                }
            } else if (this.f23272e.f23200o2.isShowing()) {
                return;
            }
            this.f23272e.f23200o2.show();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$f.class */
    public class RunnableC3804f implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerSkyTvActivity f23273b;

        public RunnableC3804f(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity) {
            this.f23273b = nSTIJKPlayerSkyTvActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23273b.m18602o2();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$f0.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$f0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$f0.class */
    public class AsyncTaskC3805f0 extends AsyncTask<String, Void, Void> {

        /* renamed from: a */
        public final String f23274a;

        /* renamed from: b */
        public final int f23275b;

        /* renamed from: c */
        public final String f23276c;

        /* renamed from: d */
        public final String f23277d;

        /* renamed from: e */
        public final int f23278e;

        /* renamed from: f */
        public final NSTIJKPlayerSkyTvActivity f23279f;

        public AsyncTaskC3805f0(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity, String str, int i10, String str2, String str3, int i11) {
            this.f23279f = nSTIJKPlayerSkyTvActivity;
            this.f23274a = str;
            this.f23275b = i10;
            this.f23276c = str2;
            this.f23277d = str3;
            this.f23278e = i11;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            try {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = this.f23279f;
                if (nSTIJKPlayerSkyTvActivity.f23145d == null || nSTIJKPlayerSkyTvActivity.f23119V2 == null || this.f23279f.f23223u1 == null || this.f23279f.f23111T2 == null || this.f23279f.f23056G == null) {
                    return null;
                }
                this.f23279f.f23223u1.m15115t(this.f23275b, this.f23274a, this.f23277d, this.f23276c, SharepreferenceDBHandler.m15337A(this.f23279f.f23145d));
                return null;
            } catch (Exception e10) {
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r52) {
            super.onPostExecute(r52);
            try {
                View childAt = this.f23279f.f23056G.getChildAt(this.f23278e - this.f23279f.f23056G.getFirstVisiblePosition());
                if (childAt != null) {
                    try {
                        ((ImageView) childAt.findViewById(2131428179)).setVisibility(4);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                this.f23279f.f23111T2.m4100x(1);
                this.f23279f.m18606s2();
            } catch (Exception e11) {
                this.f23279f.m18606s2();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (this.f23279f.f23200o2 == null) {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = this.f23279f;
                nSTIJKPlayerSkyTvActivity.f23200o2 = NSTIJKPlayerSkyTvActivity.m18508Y1(nSTIJKPlayerSkyTvActivity.f23145d);
                if (this.f23279f.f23200o2 == null) {
                    return;
                }
            } else if (this.f23279f.f23200o2.isShowing()) {
                return;
            }
            this.f23279f.f23200o2.show();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$g.class */
    public class RunnableC3806g implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerSkyTvActivity f23280b;

        public RunnableC3806g(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity) {
            this.f23280b = nSTIJKPlayerSkyTvActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23280b.m18601n2();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$g0.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$g0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$g0.class */
    public class AsyncTaskC3807g0 extends AsyncTask<String, Void, Void> {

        /* renamed from: a */
        public final String f23281a;

        /* renamed from: b */
        public final int f23282b;

        /* renamed from: c */
        public final NSTIJKPlayerSkyTvActivity f23283c;

        public AsyncTaskC3807g0(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity, String str, int i10) {
            this.f23283c = nSTIJKPlayerSkyTvActivity;
            this.f23281a = str;
            this.f23282b = i10;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            try {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = this.f23283c;
                if (nSTIJKPlayerSkyTvActivity.f23145d == null || nSTIJKPlayerSkyTvActivity.f23119V2 == null) {
                    return null;
                }
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity2 = this.f23283c;
                if (nSTIJKPlayerSkyTvActivity2.f23084N == null || nSTIJKPlayerSkyTvActivity2.f23111T2 == null || this.f23283c.f23056G == null) {
                    return null;
                }
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity3 = this.f23283c;
                nSTIJKPlayerSkyTvActivity3.f23084N.m15188R0(this.f23281a, SharepreferenceDBHandler.m15337A(nSTIJKPlayerSkyTvActivity3.f23145d));
                return null;
            } catch (Exception e10) {
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r52) {
            super.onPostExecute(r52);
            try {
                View childAt = this.f23283c.f23056G.getChildAt(this.f23282b - this.f23283c.f23056G.getFirstVisiblePosition());
                if (childAt != null) {
                    try {
                        ((ImageView) childAt.findViewById(2131428179)).setVisibility(4);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                this.f23283c.f23111T2.m4100x(1);
                this.f23283c.m18606s2();
            } catch (Exception e11) {
                this.f23283c.m18606s2();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (this.f23283c.f23200o2 == null) {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = this.f23283c;
                nSTIJKPlayerSkyTvActivity.f23200o2 = NSTIJKPlayerSkyTvActivity.m18508Y1(nSTIJKPlayerSkyTvActivity.f23145d);
                if (this.f23283c.f23200o2 == null) {
                    return;
                }
            } else if (this.f23283c.f23200o2.isShowing()) {
                return;
            }
            this.f23283c.f23200o2.show();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$h.class */
    public class DialogInterfaceOnClickListenerC3808h implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerSkyTvActivity f23284b;

        public DialogInterfaceOnClickListenerC3808h(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity) {
            this.f23284b = nSTIJKPlayerSkyTvActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$i.class */
    public class DialogInterfaceOnClickListenerC3809i implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerSkyTvActivity f23285b;

        public DialogInterfaceOnClickListenerC3809i(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity) {
            this.f23285b = nSTIJKPlayerSkyTvActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f23285b.f23145d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$j.class */
    public class C3810j implements SearchView.InterfaceC0282l {

        /* renamed from: a */
        public final NSTIJKPlayerSkyTvActivity f23286a;

        public C3810j(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity) {
            this.f23286a = nSTIJKPlayerSkyTvActivity;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextChange(String str) {
            if (this.f23286a.f23119V2 == null) {
                return false;
            }
            this.f23286a.f23119V2.getFilter().filter(str);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$k.class */
    public class ViewOnClickListenerC3811k implements View.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerSkyTvActivity f23287b;

        public ViewOnClickListenerC3811k(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity) {
            this.f23287b = nSTIJKPlayerSkyTvActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f23287b.m18591c2();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$l.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$l.class */
    public class DialogC3812l extends Dialog implements View.OnClickListener {

        /* renamed from: b */
        public Activity f23288b;

        /* renamed from: c */
        public TextView f23289c;

        /* renamed from: d */
        public TextView f23290d;

        /* renamed from: e */
        public TextView f23291e;

        /* renamed from: f */
        public LinearLayout f23292f;

        /* renamed from: g */
        public LinearLayout f23293g;

        /* renamed from: h */
        public final NSTIJKPlayerSkyTvActivity f23294h;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$l$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$l$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$l$a.class */
        public class a implements View.OnFocusChangeListener {

            /* renamed from: b */
            public View f23295b;

            /* renamed from: c */
            public final DialogC3812l f23296c;

            public a(DialogC3812l dialogC3812l, View view) {
                this.f23296c = dialogC3812l;
                this.f23295b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z10) {
                int i10;
                LinearLayout linearLayout;
                if (z10) {
                    View view2 = this.f23295b;
                    i10 = 2131230846;
                    if (view2 == null || view2.getTag() == null || !this.f23295b.getTag().equals("1")) {
                        View view3 = this.f23295b;
                        if (view3 == null || view3.getTag() == null || !this.f23295b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f23296c.f23293g;
                    }
                    linearLayout = this.f23296c.f23292f;
                } else {
                    View view4 = this.f23295b;
                    i10 = 2131230845;
                    if (view4 == null || view4.getTag() == null || !this.f23295b.getTag().equals("1")) {
                        View view5 = this.f23295b;
                        if (view5 == null || view5.getTag() == null || !this.f23295b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f23296c.f23293g;
                    }
                    linearLayout = this.f23296c.f23292f;
                }
                linearLayout.setBackgroundResource(i10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogC3812l(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity, Activity activity) {
            super(activity);
            this.f23294h = nSTIJKPlayerSkyTvActivity;
            this.f23288b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity;
            int id2 = view.getId();
            if (id2 == 2131427653) {
                dismiss();
            } else if (id2 == 2131427681) {
                try {
                    if (this.f23294h.f23200o2 == null) {
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity2 = this.f23294h;
                        nSTIJKPlayerSkyTvActivity2.f23200o2 = NSTIJKPlayerSkyTvActivity.m18508Y1(nSTIJKPlayerSkyTvActivity2.f23145d);
                        if (this.f23294h.f23200o2 != null) {
                            nSTIJKPlayerSkyTvActivity = this.f23294h;
                            nSTIJKPlayerSkyTvActivity.f23200o2.show();
                        }
                        this.f23294h.f23084N.m15172J0();
                        this.f23294h.m18610w2("-6");
                        this.f23294h.f23111T2.m4099w();
                        this.f23294h.m18606s2();
                    } else {
                        if (!this.f23294h.f23200o2.isShowing()) {
                            nSTIJKPlayerSkyTvActivity = this.f23294h;
                            nSTIJKPlayerSkyTvActivity.f23200o2.show();
                        }
                        this.f23294h.f23084N.m15172J0();
                        this.f23294h.m18610w2("-6");
                        this.f23294h.f23111T2.m4099w();
                        this.f23294h.m18606s2();
                    }
                } catch (Exception e10) {
                }
            }
            dismiss();
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            try {
                super.onCreate(bundle);
                if (this.f23294h.f23039B2.m31288z().equals(C5251a.f30065s0)) {
                    setContentView(2131624128);
                } else {
                    setContentView(2131624127);
                }
                this.f23289c = (TextView) findViewById(2131427681);
                this.f23290d = (TextView) findViewById(2131427653);
                this.f23292f = (LinearLayout) findViewById(2131428448);
                this.f23293g = (LinearLayout) findViewById(2131428541);
                TextView textView = (TextView) findViewById(2131429644);
                this.f23291e = textView;
                textView.setText(this.f23294h.getResources().getString(2132018828));
                this.f23289c.setOnClickListener(this);
                this.f23290d.setOnClickListener(this);
                TextView textView2 = this.f23289c;
                textView2.setOnFocusChangeListener(new a(this, textView2));
                TextView textView3 = this.f23290d;
                textView3.setOnFocusChangeListener(new a(this, textView3));
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$m.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$m */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$m.class */
    public class DialogInterfaceOnClickListenerC3813m implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerSkyTvActivity f23297b;

        public DialogInterfaceOnClickListenerC3813m(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity) {
            this.f23297b = nSTIJKPlayerSkyTvActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            this.f23297b.m18556H2();
            C5255e.m26210M(this.f23297b.f23145d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$n.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$n */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$n.class */
    public class DialogInterfaceOnClickListenerC3814n implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerSkyTvActivity f23298b;

        public DialogInterfaceOnClickListenerC3814n(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity) {
            this.f23298b = nSTIJKPlayerSkyTvActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$o.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$o */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$o.class */
    public class ViewOnClickListenerC3815o implements View.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerSkyTvActivity f23299b;

        public ViewOnClickListenerC3815o(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity) {
            this.f23299b = nSTIJKPlayerSkyTvActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                this.f23299b.f23140b2 = Boolean.TRUE;
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", this.f23299b.getPackageName(), null));
                this.f23299b.startActivityForResult(intent, 101);
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = this.f23299b;
                Toast.makeText(nSTIJKPlayerSkyTvActivity, nSTIJKPlayerSkyTvActivity.f23145d.getResources().getString(2132017828), 1).show();
            } catch (Exception e10) {
            }
            this.f23299b.f23143c2.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$p.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$p */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$p.class */
    public class DialogC3816p extends Dialog implements View.OnClickListener {

        /* renamed from: b */
        public Activity f23300b;

        /* renamed from: c */
        public TextView f23301c;

        /* renamed from: d */
        public TextView f23302d;

        /* renamed from: e */
        public LinearLayout f23303e;

        /* renamed from: f */
        public LinearLayout f23304f;

        /* renamed from: g */
        public RadioGroup f23305g;

        /* renamed from: h */
        public final Activity f23306h;

        /* renamed from: i */
        public final NSTIJKPlayerSkyTvActivity f23307i;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$p$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$p$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$p$a.class */
        public class a implements View.OnFocusChangeListener {

            /* renamed from: b */
            public View f23308b;

            /* renamed from: c */
            public final DialogC3816p f23309c;

            public a(DialogC3816p dialogC3816p, View view) {
                this.f23309c = dialogC3816p;
                this.f23308b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z10) {
                int i10;
                LinearLayout linearLayout;
                if (z10) {
                    View view2 = this.f23308b;
                    i10 = 2131230846;
                    if (view2 == null || view2.getTag() == null || !this.f23308b.getTag().equals("1")) {
                        View view3 = this.f23308b;
                        if (view3 == null || view3.getTag() == null || !this.f23308b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f23309c.f23304f;
                    }
                    linearLayout = this.f23309c.f23303e;
                } else {
                    View view4 = this.f23308b;
                    i10 = 2131230845;
                    if (view4 == null || view4.getTag() == null || !this.f23308b.getTag().equals("1")) {
                        View view5 = this.f23308b;
                        if (view5 == null || view5.getTag() == null || !this.f23308b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f23309c.f23304f;
                    }
                    linearLayout = this.f23309c.f23303e;
                }
                linearLayout.setBackgroundResource(i10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogC3816p(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity, Activity activity, Activity activity2) {
            super(activity);
            this.f23307i = nSTIJKPlayerSkyTvActivity;
            this.f23306h = activity2;
            this.f23300b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id2 = view.getId();
            if (id2 == 2131427653) {
                dismiss();
            } else if (id2 == 2131427681) {
                try {
                    RadioButton radioButton = (RadioButton) findViewById(this.f23305g.getCheckedRadioButtonId());
                    SharepreferenceDBHandler.m15357U(radioButton.getText().toString().equals(this.f23306h.getResources().getString(2132018611)) ? "1" : radioButton.getText().toString().equals(this.f23306h.getResources().getString(2132018607)) ? "2" : radioButton.getText().toString().equals(this.f23306h.getResources().getString(2132018615)) ? "3" : radioButton.getText().toString().equals(this.f23306h.getResources().getString(2132018608)) ? "4" : radioButton.getText().toString().equals(this.f23306h.getResources().getString(2132018609)) ? "5" : "0", this.f23306h);
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = this.f23307i;
                    nSTIJKPlayerSkyTvActivity.m18610w2(nSTIJKPlayerSkyTvActivity.f23063H2);
                    dismiss();
                } catch (Exception e10) {
                }
            }
            dismiss();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            try {
                super.onCreate(bundle);
                setContentView(2131624326);
                this.f23301c = (TextView) findViewById(2131427681);
                this.f23302d = (TextView) findViewById(2131427653);
                this.f23302d = (TextView) findViewById(2131427653);
                this.f23303e = (LinearLayout) findViewById(2131428448);
                this.f23304f = (LinearLayout) findViewById(2131428541);
                this.f23305g = (RadioGroup) findViewById(2131428935);
                RadioButton radioButton = (RadioButton) findViewById(2131428909);
                RadioButton radioButton2 = (RadioButton) findViewById(2131428903);
                RadioButton radioButton3 = (RadioButton) findViewById(2131428897);
                RadioButton radioButton4 = (RadioButton) findViewById(2131428916);
                RadioButton radioButton5 = (RadioButton) findViewById(2131428898);
                RadioButton radioButton6 = (RadioButton) findViewById(2131428899);
                ((RadioButton) findViewById(2131428911)).setVisibility(8);
                boolean z10 = false;
                radioButton5.setVisibility(0);
                radioButton6.setVisibility(0);
                String m15387m = SharepreferenceDBHandler.m15387m(this.f23306h);
                switch (m15387m.hashCode()) {
                    case 49:
                        if (m15387m.equals("1")) {
                            break;
                        }
                        z10 = -1;
                        break;
                    case 50:
                        if (m15387m.equals("2")) {
                            z10 = true;
                            break;
                        }
                        z10 = -1;
                        break;
                    case 51:
                        if (m15387m.equals("3")) {
                            z10 = 2;
                            break;
                        }
                        z10 = -1;
                        break;
                    case 52:
                        if (m15387m.equals("4")) {
                            z10 = 3;
                            break;
                        }
                        z10 = -1;
                        break;
                    case 53:
                        if (m15387m.equals("5")) {
                            z10 = 4;
                            break;
                        }
                        z10 = -1;
                        break;
                    default:
                        z10 = -1;
                        break;
                }
                if (!z10) {
                    radioButton2.setChecked(true);
                } else if (z10) {
                    radioButton3.setChecked(true);
                } else if (z10 == 2) {
                    radioButton4.setChecked(true);
                } else if (z10 == 3) {
                    radioButton5.setChecked(true);
                } else if (z10 != 4) {
                    radioButton.setChecked(true);
                } else {
                    radioButton6.setChecked(true);
                }
                this.f23301c.setOnClickListener(this);
                this.f23302d.setOnClickListener(this);
                TextView textView = this.f23301c;
                textView.setOnFocusChangeListener(new a(this, textView));
                TextView textView2 = this.f23302d;
                textView2.setOnFocusChangeListener(new a(this, textView2));
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$q.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$q */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$q.class */
    public class ViewOnClickListenerC3817q implements View.OnClickListener {

        /* renamed from: b */
        public final NSTIJKPlayerSkyTvActivity f23310b;

        public ViewOnClickListenerC3817q(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity) {
            this.f23310b = nSTIJKPlayerSkyTvActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f23310b.f23143c2.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$r.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$r */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$r.class */
    public class RunnableC3818r implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerSkyTvActivity f23311b;

        public RunnableC3818r(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity) {
            this.f23311b = nSTIJKPlayerSkyTvActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String date = Calendar.getInstance().getTime().toString();
                String m26199B = C5255e.m26199B(this.f23311b.f23145d);
                String m26249p = C5255e.m26249p(date);
                TextView textView = this.f23311b.f23243z1;
                if (textView != null) {
                    textView.setText(m26199B);
                }
                TextView textView2 = this.f23311b.f23235x1;
                if (textView2 != null) {
                    textView2.setText(m26249p);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$s.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$s */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$s.class */
    public class C3819s implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        public final ArrayList f23312b;

        /* renamed from: c */
        public final NSTIJKPlayerSkyTvActivity f23313c;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$s$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$s$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$s$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final C3819s f23314b;

            public a(C3819s c3819s) {
                this.f23314b = c3819s;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f23314b.f23313c.m18601n2();
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$s$b.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$s$b */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$s$b.class */
        public class b implements Runnable {

            /* renamed from: b */
            public final C3819s f23315b;

            public b(C3819s c3819s) {
                this.f23315b = c3819s;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f23315b.f23313c.m18568N2("", false);
                this.f23315b.f23313c.f23187l3 = Boolean.TRUE;
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$s$c.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$s$c */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$s$c.class */
        public class c implements Runnable {

            /* renamed from: b */
            public final C3819s f23316b;

            public c(C3819s c3819s) {
                this.f23316b = c3819s;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f23316b.f23313c.m18568N2("", false);
                this.f23316b.f23313c.f23187l3 = Boolean.TRUE;
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$s$d.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$s$d */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$s$d.class */
        public class d implements Runnable {

            /* renamed from: b */
            public final C3819s f23317b;

            public d(C3819s c3819s) {
                this.f23317b = c3819s;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f23317b.f23313c.m18568N2("", false);
                this.f23317b.f23313c.f23187l3 = Boolean.TRUE;
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$s$e.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$s$e */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$s$e.class */
        public class e implements Runnable {

            /* renamed from: b */
            public final C3819s f23318b;

            public e(C3819s c3819s) {
                this.f23318b = c3819s;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f23318b.f23313c.m18568N2("", false);
                this.f23318b.f23313c.f23187l3 = Boolean.TRUE;
            }
        }

        public C3819s(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity, ArrayList arrayList) {
            this.f23313c = nSTIJKPlayerSkyTvActivity;
            this.f23312b = arrayList;
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x0f2c  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0f78  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0fa7  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0fd6  */
        @Override // android.widget.AdapterView.OnItemClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onItemClick(android.widget.AdapterView<?> r7, android.view.View r8, int r9, long r10) {
            /*
                Method dump skipped, instructions count: 4101
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.C3819s.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$t.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$t */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$t.class */
    public class C3820t implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        public final NSTIJKPlayerSkyTvActivity f23319b;

        public C3820t(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity) {
            this.f23319b = nSTIJKPlayerSkyTvActivity;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity;
            AsyncTask<String, Void, HashMap<String, ArrayList<String>>> execute;
            try {
                if (this.f23319b.f23196n2 != null && this.f23319b.f23196n2.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    this.f23319b.f23196n2.cancel(true);
                }
                ArrayList<LiveStreamsDBModel> m28603g = this.f23319b.f23119V2.m28603g();
                if (m28603g != null && m28603g.size() > 0) {
                    String m14798E = m28603g.get(i10).m14798E();
                    this.f23319b.f23042C1.removeCallbacksAndMessages(null);
                    nSTIJKPlayerSkyTvActivity = this.f23319b;
                    execute = new AsyncTaskC3799c0(this.f23319b, m14798E, null).execute(new String[0]);
                } else {
                    if (this.f23319b.f23206q0 == null || this.f23319b.f23206q0.size() <= 0) {
                        return;
                    }
                    String m14798E2 = ((LiveStreamsDBModel) this.f23319b.f23206q0.get(i10)).m14798E();
                    this.f23319b.f23042C1.removeCallbacksAndMessages(null);
                    nSTIJKPlayerSkyTvActivity = this.f23319b;
                    execute = new AsyncTaskC3799c0(this.f23319b, m14798E2, null).execute(new String[0]);
                }
                nSTIJKPlayerSkyTvActivity.f23196n2 = execute;
            } catch (Exception e10) {
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$u.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$u */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$u.class */
    public class C3821u implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        public final ArrayList f23320b;

        /* renamed from: c */
        public final NSTIJKPlayerSkyTvActivity f23321c;

        public C3821u(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity, ArrayList arrayList) {
            this.f23321c = nSTIJKPlayerSkyTvActivity;
            this.f23320b = arrayList;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity;
            LinearLayout linearLayout = this.f23321c.ll_click_to_play;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            try {
                if (this.f23321c.f23196n2 != null && this.f23321c.f23196n2.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    this.f23321c.f23196n2.cancel(true);
                }
                C5251a.f30008G = Boolean.TRUE;
                ArrayList<LiveStreamsDBModel> m28603g = this.f23321c.f23119V2.m28603g();
                if (m28603g == null || m28603g.size() <= 0) {
                    if (this.f23321c.f23206q0 == null || this.f23321c.f23206q0.size() <= 0) {
                        return;
                    }
                    C5255e.m26215R(((LiveStreamsDBModel) this.f23321c.f23206q0.get(i10)).m14805L());
                    String m14798E = ((LiveStreamsDBModel) this.f23321c.f23206q0.get(i10)).m14798E();
                    String m14810Q = ((LiveStreamsDBModel) this.f23321c.f23206q0.get(i10)).m14810Q();
                    String m14816W = ((LiveStreamsDBModel) this.f23321c.f23206q0.get(i10)).m14816W();
                    if (this.f23321c.f23118V1.equals("m3u")) {
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity2 = this.f23321c;
                        if (!nSTIJKPlayerSkyTvActivity2.f23219t1.equals(((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity2.f23206q0.get(i10)).m14816W())) {
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity3 = this.f23321c;
                            nSTIJKPlayerSkyTvActivity3.f23117V0 = nSTIJKPlayerSkyTvActivity3.f23063H2;
                            this.f23321c.f23130Y1.setCurrentWindowIndex(i10);
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity4 = this.f23321c;
                            nSTIJKPlayerSkyTvActivity4.f23055F2 = C5255e.m26215R(((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity4.f23206q0.get(i10)).m14805L());
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity5 = this.f23321c;
                            nSTIJKPlayerSkyTvActivity5.f23059G2 = ((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity5.f23206q0.get(i10)).m14827g();
                            if (this.f23321c.f23214s0 != null) {
                                this.f23321c.f23214s0.clear();
                                this.f23321c.f23214s0.addAll(this.f23320b);
                            }
                            this.f23321c.f23130Y1.setTitle(((LiveStreamsDBModel) this.f23321c.f23206q0.get(i10)).m14805L() + " - " + ((LiveStreamsDBModel) this.f23321c.f23206q0.get(i10)).getName());
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity6 = this.f23321c;
                            nSTIJKPlayerSkyTvActivity6.f23219t1 = ((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity6.f23206q0.get(i10)).m14816W();
                            C7920a.m34301l().m34317z(this.f23321c.f23219t1);
                            if (!this.f23321c.f23117V0.equals("-1") && !this.f23321c.f23117V0.equals("0") && !this.f23321c.f23117V0.equals("-6")) {
                                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity7 = this.f23321c;
                                nSTIJKPlayerSkyTvActivity7.f23117V0 = ((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity7.f23206q0.get(i10)).m14827g();
                                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity8 = this.f23321c;
                                nSTIJKPlayerSkyTvActivity8.f23121W0 = ((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity8.f23206q0.get(i10)).m14830i();
                                if (this.f23321c.f23121W0.isEmpty()) {
                                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity9 = this.f23321c;
                                    nSTIJKPlayerSkyTvActivity9.f23121W0 = nSTIJKPlayerSkyTvActivity9.m18577S1(nSTIJKPlayerSkyTvActivity9.f23117V0);
                                }
                            }
                            this.f23321c.f23074K1 = i10;
                            this.f23321c.f23130Y1.m19452V0();
                            if (this.f23321c.f23151e2.booleanValue()) {
                                this.f23321c.f23130Y1.m19456Z0(Uri.parse(m14816W), NSTIJKPlayerSkyTvActivity.f23027p3, ((LiveStreamsDBModel) this.f23321c.f23206q0.get(i10)).getName());
                                this.f23321c.f23130Y1.f24465I = 0;
                                this.f23321c.f23130Y1.f24471K = false;
                                this.f23321c.f23130Y1.start();
                            }
                            this.f23321c.f23046D1.removeCallbacksAndMessages(null);
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity10 = this.f23321c;
                            nSTIJKPlayerSkyTvActivity10.f23044D = m14798E;
                            nSTIJKPlayerSkyTvActivity10.f23048E = m14810Q;
                            nSTIJKPlayerSkyTvActivity10.f23130Y1.setCurrentEpgChannelID(this.f23321c.f23044D);
                            this.f23321c.f23130Y1.setCurrentChannelLogo(this.f23321c.f23048E);
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity11 = this.f23321c;
                            nSTIJKPlayerSkyTvActivity11.m18588Y2(nSTIJKPlayerSkyTvActivity11.f23048E);
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity12 = this.f23321c;
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity13 = this.f23321c;
                            nSTIJKPlayerSkyTvActivity12.f23196n2 = new AsyncTaskC3799c0(nSTIJKPlayerSkyTvActivity13, nSTIJKPlayerSkyTvActivity13.f23044D, null).execute(new String[0]);
                            this.f23321c.f23042C1.removeCallbacksAndMessages(null);
                            if (this.f23321c.f23227v1 != null) {
                                this.f23321c.f23227v1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(((LiveStreamsDBModel) this.f23321c.f23206q0.get(i10)).m14816W()));
                                this.f23321c.f23227v1.apply();
                            }
                            if (this.f23321c.f23231w1 != null) {
                                this.f23321c.f23231w1.putInt("currentlyPlayingVideoPosition", i10);
                                this.f23321c.f23231w1.apply();
                            }
                            nSTIJKPlayerSkyTvActivity = this.f23321c;
                            nSTIJKPlayerSkyTvActivity.f23119V2.notifyDataSetChanged();
                            return;
                        }
                        this.f23321c.m18591c2();
                    }
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity14 = this.f23321c;
                    if (nSTIJKPlayerSkyTvActivity14.f23215s1 != C5255e.m26214Q(((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity14.f23206q0.get(i10)).m14811R())) {
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity15 = this.f23321c;
                        nSTIJKPlayerSkyTvActivity15.f23117V0 = nSTIJKPlayerSkyTvActivity15.f23063H2;
                        this.f23321c.f23130Y1.setCurrentWindowIndex(i10);
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity16 = this.f23321c;
                        nSTIJKPlayerSkyTvActivity16.f23055F2 = C5255e.m26215R(((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity16.f23206q0.get(i10)).m14805L());
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity17 = this.f23321c;
                        nSTIJKPlayerSkyTvActivity17.f23059G2 = ((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity17.f23206q0.get(i10)).m14827g();
                        if (this.f23321c.f23214s0 != null) {
                            this.f23321c.f23214s0.clear();
                            this.f23321c.f23214s0.addAll(this.f23320b);
                        }
                        this.f23321c.f23130Y1.setTitle(((LiveStreamsDBModel) this.f23321c.f23206q0.get(i10)).m14805L() + " - " + ((LiveStreamsDBModel) this.f23321c.f23206q0.get(i10)).getName());
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity18 = this.f23321c;
                        nSTIJKPlayerSkyTvActivity18.f23215s1 = C5255e.m26214Q(((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity18.f23206q0.get(i10)).m14811R());
                        C7920a.m34301l().m34317z(String.valueOf(this.f23321c.f23215s1));
                        if (!this.f23321c.f23117V0.equals("-1") && !this.f23321c.f23117V0.equals("0") && !this.f23321c.f23117V0.equals("-6")) {
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity19 = this.f23321c;
                            nSTIJKPlayerSkyTvActivity19.f23117V0 = ((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity19.f23206q0.get(i10)).m14827g();
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity20 = this.f23321c;
                            nSTIJKPlayerSkyTvActivity20.f23121W0 = ((LiveStreamsDBModel) nSTIJKPlayerSkyTvActivity20.f23206q0.get(i10)).m14830i();
                            if (this.f23321c.f23121W0.isEmpty()) {
                                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity21 = this.f23321c;
                                nSTIJKPlayerSkyTvActivity21.f23121W0 = nSTIJKPlayerSkyTvActivity21.m18577S1(nSTIJKPlayerSkyTvActivity21.f23117V0);
                            }
                        }
                        this.f23321c.f23074K1 = i10;
                        this.f23321c.f23130Y1.m19452V0();
                        if (this.f23321c.f23151e2.booleanValue()) {
                            this.f23321c.f23130Y1.m19456Z0(Uri.parse(this.f23321c.f23149e + C5255e.m26214Q(((LiveStreamsDBModel) this.f23321c.f23206q0.get(i10)).m14811R()) + this.f23321c.f23128Y), NSTIJKPlayerSkyTvActivity.f23027p3, ((LiveStreamsDBModel) this.f23321c.f23206q0.get(i10)).getName());
                            this.f23321c.f23130Y1.f24465I = 0;
                            this.f23321c.f23130Y1.f24471K = false;
                            this.f23321c.f23130Y1.start();
                        }
                        this.f23321c.f23046D1.removeCallbacksAndMessages(null);
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity22 = this.f23321c;
                        nSTIJKPlayerSkyTvActivity22.f23044D = m14798E;
                        nSTIJKPlayerSkyTvActivity22.f23048E = m14810Q;
                        nSTIJKPlayerSkyTvActivity22.f23130Y1.setCurrentEpgChannelID(this.f23321c.f23044D);
                        this.f23321c.f23130Y1.setCurrentChannelLogo(this.f23321c.f23048E);
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity23 = this.f23321c;
                        nSTIJKPlayerSkyTvActivity23.m18588Y2(nSTIJKPlayerSkyTvActivity23.f23048E);
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity24 = this.f23321c;
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity25 = this.f23321c;
                        nSTIJKPlayerSkyTvActivity24.f23196n2 = new AsyncTaskC3799c0(nSTIJKPlayerSkyTvActivity25, nSTIJKPlayerSkyTvActivity25.f23044D, null).execute(new String[0]);
                        this.f23321c.f23042C1.removeCallbacksAndMessages(null);
                        if (this.f23321c.f23227v1 != null) {
                            this.f23321c.f23227v1.putString("currentlyPlayingVideo", String.valueOf(((LiveStreamsDBModel) this.f23321c.f23206q0.get(i10)).m14811R()));
                            this.f23321c.f23227v1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(((LiveStreamsDBModel) this.f23321c.f23206q0.get(i10)).m14816W()));
                            this.f23321c.f23227v1.apply();
                        }
                        if (this.f23321c.f23231w1 != null) {
                            this.f23321c.f23231w1.putInt("currentlyPlayingVideoPosition", i10);
                            this.f23321c.f23231w1.apply();
                        }
                        nSTIJKPlayerSkyTvActivity = this.f23321c;
                        nSTIJKPlayerSkyTvActivity.f23119V2.notifyDataSetChanged();
                        return;
                    }
                    this.f23321c.m18591c2();
                }
                int m26215R = C5255e.m26215R(m28603g.get(i10).m14805L());
                String m14798E2 = m28603g.get(i10).m14798E();
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity26 = this.f23321c;
                nSTIJKPlayerSkyTvActivity26.m18595h2(nSTIJKPlayerSkyTvActivity26.f23206q0, m26215R);
                String m14816W2 = m28603g.get(i10).m14816W();
                if (this.f23321c.f23118V1.equals("m3u")) {
                    if (!this.f23321c.f23219t1.equals(m28603g.get(i10).m14816W())) {
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity27 = this.f23321c;
                        nSTIJKPlayerSkyTvActivity27.f23117V0 = nSTIJKPlayerSkyTvActivity27.f23063H2;
                        this.f23321c.f23130Y1.setCurrentWindowIndex(i10);
                        this.f23321c.f23055F2 = C5255e.m26215R(m28603g.get(i10).m14805L());
                        this.f23321c.f23059G2 = m28603g.get(i10).m14827g();
                        if (this.f23321c.f23214s0 != null) {
                            this.f23321c.f23214s0.clear();
                            this.f23321c.f23214s0.addAll(this.f23320b);
                        }
                        this.f23321c.f23130Y1.setTitle(m28603g.get(i10).m14805L() + " - " + m28603g.get(i10).getName());
                        this.f23321c.f23219t1 = m28603g.get(i10).m14816W();
                        C7920a.m34301l().m34317z(this.f23321c.f23219t1);
                        if (!this.f23321c.f23117V0.equals("-1") && !this.f23321c.f23117V0.equals("0") && !this.f23321c.f23117V0.equals("-6")) {
                            this.f23321c.f23117V0 = m28603g.get(i10).m14827g();
                            this.f23321c.f23121W0 = m28603g.get(i10).m14830i();
                            if (this.f23321c.f23121W0.isEmpty()) {
                                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity28 = this.f23321c;
                                nSTIJKPlayerSkyTvActivity28.f23121W0 = nSTIJKPlayerSkyTvActivity28.m18577S1(nSTIJKPlayerSkyTvActivity28.f23117V0);
                            }
                        }
                        String m14810Q2 = m28603g.get(i10).m14810Q();
                        try {
                            if (m14810Q2.equals("") || m14810Q2.isEmpty()) {
                                this.f23321c.f23197o.setImageDrawable(this.f23321c.f23145d.getResources().getDrawable(2131231571));
                            } else {
                                C10014t.m42105q(this.f23321c.f23145d).m42116l(m14810Q2).m42154j(2131231571).m42148d(2131231571).m42151g(this.f23321c.f23197o);
                            }
                        } catch (Exception e10) {
                            this.f23321c.f23197o.setImageDrawable(this.f23321c.f23145d.getResources().getDrawable(2131231571));
                        }
                        this.f23321c.f23046D1.removeCallbacksAndMessages(null);
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity29 = this.f23321c;
                        nSTIJKPlayerSkyTvActivity29.f23044D = m14798E2;
                        nSTIJKPlayerSkyTvActivity29.f23048E = m14810Q2;
                        nSTIJKPlayerSkyTvActivity29.f23130Y1.setCurrentEpgChannelID(this.f23321c.f23044D);
                        this.f23321c.f23130Y1.setCurrentChannelLogo(this.f23321c.f23048E);
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity30 = this.f23321c;
                        nSTIJKPlayerSkyTvActivity30.m18588Y2(nSTIJKPlayerSkyTvActivity30.f23048E);
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity31 = this.f23321c;
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity32 = this.f23321c;
                        nSTIJKPlayerSkyTvActivity31.f23196n2 = new AsyncTaskC3799c0(nSTIJKPlayerSkyTvActivity32, nSTIJKPlayerSkyTvActivity32.f23044D, null).execute(new String[0]);
                        this.f23321c.f23042C1.removeCallbacksAndMessages(null);
                        this.f23321c.f23074K1 = i10;
                        this.f23321c.f23130Y1.m19452V0();
                        if (this.f23321c.f23151e2.booleanValue()) {
                            this.f23321c.f23130Y1.m19456Z0(Uri.parse(m14816W2), NSTIJKPlayerSkyTvActivity.f23027p3, m28603g.get(i10).getName());
                            this.f23321c.f23130Y1.f24465I = 0;
                            this.f23321c.f23130Y1.f24471K = false;
                            this.f23321c.f23130Y1.start();
                        }
                        if (this.f23321c.f23227v1 != null) {
                            this.f23321c.f23227v1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(m28603g.get(i10).m14816W()));
                            this.f23321c.f23227v1.apply();
                        }
                        if (this.f23321c.f23231w1 != null) {
                            this.f23321c.f23231w1.putInt("currentlyPlayingVideoPosition", i10);
                            this.f23321c.f23231w1.apply();
                        }
                        nSTIJKPlayerSkyTvActivity = this.f23321c;
                        nSTIJKPlayerSkyTvActivity.f23119V2.notifyDataSetChanged();
                        return;
                    }
                    this.f23321c.m18591c2();
                }
                if (this.f23321c.f23215s1 != C5255e.m26214Q(m28603g.get(i10).m14811R())) {
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity33 = this.f23321c;
                    nSTIJKPlayerSkyTvActivity33.f23117V0 = nSTIJKPlayerSkyTvActivity33.f23063H2;
                    this.f23321c.f23130Y1.setCurrentWindowIndex(i10);
                    this.f23321c.f23055F2 = C5255e.m26215R(m28603g.get(i10).m14805L());
                    this.f23321c.f23059G2 = m28603g.get(i10).m14827g();
                    if (this.f23321c.f23214s0 != null) {
                        this.f23321c.f23214s0.clear();
                        this.f23321c.f23214s0.addAll(this.f23320b);
                    }
                    this.f23321c.f23130Y1.setTitle(m28603g.get(i10).m14805L() + " - " + m28603g.get(i10).getName());
                    this.f23321c.f23215s1 = C5255e.m26214Q(m28603g.get(i10).m14811R());
                    C7920a.m34301l().m34317z(String.valueOf(this.f23321c.f23215s1));
                    if (!this.f23321c.f23117V0.equals("-1") && !this.f23321c.f23117V0.equals("0") && !this.f23321c.f23117V0.equals("-6")) {
                        this.f23321c.f23117V0 = m28603g.get(i10).m14827g();
                        this.f23321c.f23121W0 = m28603g.get(i10).m14830i();
                        if (this.f23321c.f23121W0.isEmpty()) {
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity34 = this.f23321c;
                            nSTIJKPlayerSkyTvActivity34.f23121W0 = nSTIJKPlayerSkyTvActivity34.m18577S1(nSTIJKPlayerSkyTvActivity34.f23117V0);
                        }
                    }
                    String m14810Q3 = m28603g.get(i10).m14810Q();
                    try {
                        if (m14810Q3.equals("") || m14810Q3.isEmpty()) {
                            this.f23321c.f23197o.setImageDrawable(this.f23321c.f23145d.getResources().getDrawable(2131231571));
                        } else {
                            C10014t.m42105q(this.f23321c.f23145d).m42116l(m14810Q3).m42154j(2131231571).m42148d(2131231571).m42151g(this.f23321c.f23197o);
                        }
                    } catch (Exception e11) {
                        this.f23321c.f23197o.setImageDrawable(this.f23321c.f23145d.getResources().getDrawable(2131231571));
                    }
                    this.f23321c.f23046D1.removeCallbacksAndMessages(null);
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity35 = this.f23321c;
                    nSTIJKPlayerSkyTvActivity35.f23044D = m14798E2;
                    nSTIJKPlayerSkyTvActivity35.f23048E = m14810Q3;
                    nSTIJKPlayerSkyTvActivity35.f23130Y1.setCurrentEpgChannelID(this.f23321c.f23044D);
                    this.f23321c.f23130Y1.setCurrentChannelLogo(this.f23321c.f23048E);
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity36 = this.f23321c;
                    nSTIJKPlayerSkyTvActivity36.m18588Y2(nSTIJKPlayerSkyTvActivity36.f23048E);
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity37 = this.f23321c;
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity38 = this.f23321c;
                    nSTIJKPlayerSkyTvActivity37.f23196n2 = new AsyncTaskC3799c0(nSTIJKPlayerSkyTvActivity38, nSTIJKPlayerSkyTvActivity38.f23044D, null).execute(new String[0]);
                    this.f23321c.f23042C1.removeCallbacksAndMessages(null);
                    this.f23321c.f23074K1 = i10;
                    this.f23321c.f23130Y1.m19452V0();
                    if (this.f23321c.f23151e2.booleanValue()) {
                        this.f23321c.f23130Y1.m19456Z0(Uri.parse(this.f23321c.f23149e + C5255e.m26214Q(m28603g.get(i10).m14811R()) + this.f23321c.f23128Y), NSTIJKPlayerSkyTvActivity.f23027p3, m28603g.get(i10).getName());
                        this.f23321c.f23130Y1.f24465I = 0;
                        this.f23321c.f23130Y1.f24471K = false;
                        this.f23321c.f23130Y1.start();
                    }
                    if (this.f23321c.f23227v1 != null) {
                        this.f23321c.f23227v1.putString("currentlyPlayingVideo", String.valueOf(m28603g.get(i10).m14811R()));
                        this.f23321c.f23227v1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(m28603g.get(i10).m14816W()));
                        this.f23321c.f23227v1.apply();
                    }
                    if (this.f23321c.f23231w1 != null) {
                        this.f23321c.f23231w1.putInt("currentlyPlayingVideoPosition", i10);
                        this.f23321c.f23231w1.apply();
                    }
                    nSTIJKPlayerSkyTvActivity = this.f23321c;
                    nSTIJKPlayerSkyTvActivity.f23119V2.notifyDataSetChanged();
                    return;
                }
                this.f23321c.m18591c2();
            } catch (Exception e12) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$v.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$v */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$v.class */
    public class C3822v implements AdapterView.OnItemLongClickListener {

        /* renamed from: a */
        public final NSTIJKPlayerSkyTvActivity f23322a;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$v$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$v$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$v$a.class */
        public class a implements PopupMenu.OnMenuItemClickListener {

            /* renamed from: a */
            public final String f23323a;

            /* renamed from: b */
            public final String f23324b;

            /* renamed from: c */
            public final int f23325c;

            /* renamed from: d */
            public final String f23326d;

            /* renamed from: e */
            public final String f23327e;

            /* renamed from: f */
            public final String f23328f;

            /* renamed from: g */
            public final C3822v f23329g;

            /* JADX WARN: Classes with same name are omitted:
              classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$v$a$a.class
             */
            /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$v$a$a, reason: collision with other inner class name */
            /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$v$a$a.class */
            public class DialogC10275a extends Dialog implements View.OnClickListener {

                /* renamed from: b */
                public Activity f23330b;

                /* renamed from: c */
                public TextView f23331c;

                /* renamed from: d */
                public TextView f23332d;

                /* renamed from: e */
                public TextView f23333e;

                /* renamed from: f */
                public LinearLayout f23334f;

                /* renamed from: g */
                public LinearLayout f23335g;

                /* renamed from: h */
                public final a f23336h;

                /* JADX WARN: Classes with same name are omitted:
                  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$v$a$a$a.class
                 */
                /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$v$a$a$a, reason: collision with other inner class name */
                /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$v$a$a$a.class */
                public class ViewOnFocusChangeListenerC10276a implements View.OnFocusChangeListener {

                    /* renamed from: b */
                    public View f23337b;

                    /* renamed from: c */
                    public final DialogC10275a f23338c;

                    public ViewOnFocusChangeListenerC10276a(DialogC10275a dialogC10275a, View view) {
                        this.f23338c = dialogC10275a;
                        this.f23337b = view;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    @SuppressLint({"ResourceType"})
                    public void onFocusChange(View view, boolean z10) {
                        int i10;
                        LinearLayout linearLayout;
                        if (z10) {
                            View view2 = this.f23337b;
                            i10 = 2131230846;
                            if (view2 == null || view2.getTag() == null || !this.f23337b.getTag().equals("1")) {
                                View view3 = this.f23337b;
                                if (view3 == null || view3.getTag() == null || !this.f23337b.getTag().equals("2")) {
                                    return;
                                }
                                linearLayout = this.f23338c.f23335g;
                            }
                            linearLayout = this.f23338c.f23334f;
                        } else {
                            View view4 = this.f23337b;
                            i10 = 2131230845;
                            if (view4 == null || view4.getTag() == null || !this.f23337b.getTag().equals("1")) {
                                View view5 = this.f23337b;
                                if (view5 == null || view5.getTag() == null || !this.f23337b.getTag().equals("2")) {
                                    return;
                                }
                                linearLayout = this.f23338c.f23335g;
                            }
                            linearLayout = this.f23338c.f23334f;
                        }
                        linearLayout.setBackgroundResource(i10);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public DialogC10275a(a aVar, Activity activity) {
                    super(activity);
                    this.f23336h = aVar;
                    this.f23330b = activity;
                }

                /* JADX WARN: Removed duplicated region for block: B:18:0x0096 A[Catch: Exception -> 0x0109, TryCatch #0 {Exception -> 0x0109, blocks: (B:9:0x0014, B:11:0x0024, B:13:0x004b, B:15:0x0057, B:16:0x0081, B:18:0x0096, B:20:0x00af, B:21:0x00d1, B:23:0x00b6, B:24:0x0060, B:26:0x0073), top: B:8:0x0014 }] */
                /* JADX WARN: Removed duplicated region for block: B:23:0x00b6 A[Catch: Exception -> 0x0109, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0109, blocks: (B:9:0x0014, B:11:0x0024, B:13:0x004b, B:15:0x0057, B:16:0x0081, B:18:0x0096, B:20:0x00af, B:21:0x00d1, B:23:0x00b6, B:24:0x0060, B:26:0x0073), top: B:8:0x0014 }] */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onClick(android.view.View r4) {
                    /*
                        Method dump skipped, instructions count: 269
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.C3822v.a.DialogC10275a.onClick(android.view.View):void");
                }

                @Override // android.app.Dialog
                public void onCreate(Bundle bundle) {
                    try {
                        super.onCreate(bundle);
                        if (this.f23336h.f23329g.f23322a.f23039B2.m31288z().equals(C5251a.f30065s0)) {
                            setContentView(2131624128);
                        } else {
                            setContentView(2131624127);
                        }
                        this.f23331c = (TextView) findViewById(2131427681);
                        this.f23332d = (TextView) findViewById(2131427653);
                        this.f23334f = (LinearLayout) findViewById(2131428448);
                        this.f23335g = (LinearLayout) findViewById(2131428541);
                        TextView textView = (TextView) findViewById(2131429644);
                        this.f23333e = textView;
                        textView.setText(this.f23336h.f23329g.f23322a.f23145d.getResources().getString(2132018831));
                        this.f23331c.setOnClickListener(this);
                        this.f23332d.setOnClickListener(this);
                        TextView textView2 = this.f23331c;
                        textView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC10276a(this, textView2));
                        TextView textView3 = this.f23332d;
                        textView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC10276a(this, textView3));
                    } catch (Exception e10) {
                    }
                }
            }

            public a(C3822v c3822v, String str, String str2, int i10, String str3, String str4, String str5) {
                this.f23329g = c3822v;
                this.f23323a = str;
                this.f23324b = str2;
                this.f23325c = i10;
                this.f23326d = str3;
                this.f23327e = str4;
                this.f23328f = str5;
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
            
                r0 = r8.f23329g.f23322a;
                r0.f23212r2 = true;
                r0.m18556H2();
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
            
                if (r8.f23329g.f23322a.f23118V1.equals("m3u") == false) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
            
                r11 = r8.f23329g.f23322a;
                r12 = r11.f23040C;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
            
                r11.f23076L = r12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
            
                r0 = new android.content.Intent(r8.f23329g.f23322a.f23145d, (java.lang.Class<?>) com.maxdigitall.maxdigitaliptvbox.view.activity.PlayExternalPlayerActivity.class);
                r0.putExtra("url", r8.f23329g.f23322a.f23076L);
                r0.putExtra("app_name", r8.f23329g.f23322a.f23051E2.get(r10).m15415a());
                r0.putExtra("packagename", r8.f23329g.f23322a.f23051E2.get(r10).m15416b());
                r8.f23329g.f23322a.f23145d.startActivity(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
            
                r11 = r8.f23329g.f23322a;
                r12 = p151if.C5255e.m26203F(r11.f23145d, r11.f23036B, r11.f23128Y, "live");
             */
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean onMenuItemClick(android.view.MenuItem r9) {
                /*
                    Method dump skipped, instructions count: 631
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.C3822v.a.onMenuItemClick(android.view.MenuItem):boolean");
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$v$b.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$v$b */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$v$b.class */
        public class b implements PopupMenu.OnDismissListener {

            /* renamed from: a */
            public final C3822v f23339a;

            public b(C3822v c3822v) {
                this.f23339a = c3822v;
            }

            @Override // android.widget.PopupMenu.OnDismissListener
            public void onDismiss(PopupMenu popupMenu) {
            }
        }

        public C3822v(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity) {
            this.f23322a = nSTIJKPlayerSkyTvActivity;
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            int i11;
            Menu menu;
            Menu menu2;
            MenuItem item;
            try {
                if (this.f23322a.f23119V2 == null) {
                    return false;
                }
                ArrayList<LiveStreamsDBModel> m28603g = this.f23322a.f23119V2.m28603g();
                if (m28603g != null && m28603g.size() > 0) {
                    str = m28603g.get(i10).m14827g();
                    i11 = C5255e.m26214Q(m28603g.get(i10).m14811R());
                    str2 = m28603g.get(i10).m14816W();
                    str3 = m28603g.get(i10).getName();
                    str4 = m28603g.get(i10).m14805L();
                    m28603g.get(i10).m14810Q();
                    str5 = m28603g.get(i10).m14812S();
                } else if (this.f23322a.f23206q0 == null || this.f23322a.f23206q0.size() <= 0) {
                    str = "";
                    str2 = "";
                    str3 = str2;
                    str4 = str3;
                    str5 = str4;
                    i11 = 0;
                } else {
                    str = ((LiveStreamsDBModel) this.f23322a.f23206q0.get(i10)).m14827g();
                    i11 = C5255e.m26214Q(((LiveStreamsDBModel) this.f23322a.f23206q0.get(i10)).m14811R());
                    str3 = ((LiveStreamsDBModel) this.f23322a.f23206q0.get(i10)).getName();
                    str2 = ((LiveStreamsDBModel) this.f23322a.f23206q0.get(i10)).m14816W();
                    str4 = ((LiveStreamsDBModel) this.f23322a.f23206q0.get(i10)).m14805L();
                    ((LiveStreamsDBModel) this.f23322a.f23206q0.get(i10)).m14810Q();
                    str5 = ((LiveStreamsDBModel) this.f23322a.f23206q0.get(i10)).m14812S();
                }
                PopupMenu popupMenu = new PopupMenu(this.f23322a, view);
                popupMenu.getMenuInflater().inflate(2131689491, popupMenu.getMenu());
                if (this.f23322a.f23063H2.equals("-6")) {
                    popupMenu.getMenu().getItem(6).setVisible(true);
                } else {
                    popupMenu.getMenu().getItem(6).setVisible(false);
                }
                if (this.f23322a.f23118V1.equals("m3u")) {
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = this.f23322a;
                    ArrayList<FavouriteM3UModel> m15159E0 = nSTIJKPlayerSkyTvActivity.f23084N.m15159E0(str2, SharepreferenceDBHandler.m15337A(nSTIJKPlayerSkyTvActivity.f23145d));
                    if (m15159E0 == null || m15159E0.size() <= 0) {
                        menu = popupMenu.getMenu();
                        item = menu.getItem(2);
                    } else {
                        menu2 = popupMenu.getMenu();
                        item = menu2.getItem(3);
                    }
                } else {
                    ArrayList<FavouriteDBModel> m15112o = this.f23322a.f23223u1.m15112o(i11, str, str5, SharepreferenceDBHandler.m15337A(this.f23322a.f23145d));
                    if (m15112o == null || m15112o.size() <= 0) {
                        menu = popupMenu.getMenu();
                        item = menu.getItem(2);
                    } else {
                        menu2 = popupMenu.getMenu();
                        item = menu2.getItem(3);
                    }
                }
                item.setVisible(true);
                this.f23322a.f23051E2 = new ArrayList<>();
                this.f23322a.f23051E2 = new ExternalPlayerDataBase(this.f23322a.f23145d).m15132o();
                try {
                    ArrayList<ExternalPlayerModelClass> arrayList = this.f23322a.f23051E2;
                    if (arrayList != null && arrayList.size() > 0) {
                        for (int i12 = 0; i12 < this.f23322a.f23051E2.size(); i12++) {
                            popupMenu.getMenu().add(0, i12, i12, this.f23322a.f23051E2.get(i12).m15415a());
                        }
                    }
                } catch (Exception e10) {
                }
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity2 = this.f23322a;
                nSTIJKPlayerSkyTvActivity2.f23036B = i11;
                nSTIJKPlayerSkyTvActivity2.f23040C = str2;
                nSTIJKPlayerSkyTvActivity2.f23161g2 = str3.replaceAll(" ", AWSAppSyncClient.DATABASE_NAME_DELIMITER).toLowerCase();
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity3 = this.f23322a;
                nSTIJKPlayerSkyTvActivity3.f23161g2 = nSTIJKPlayerSkyTvActivity3.f23161g2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
                popupMenu.setOnMenuItemClickListener(new a(this, str, str3, i10, str4, str5, this.f23322a.f23161g2));
                popupMenu.setOnDismissListener(new b(this));
                popupMenu.show();
                return true;
            } catch (Exception e11) {
                return false;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$w.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$w */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$w.class */
    public class RunnableC3823w implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerSkyTvActivity f23340b;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$w$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$w$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$w$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final RunnableC3823w f23341b;

            public a(RunnableC3823w runnableC3823w) {
                this.f23341b = runnableC3823w;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f23341b.f23340b.m18568N2("", false);
                this.f23341b.f23340b.f23187l3 = Boolean.TRUE;
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$w$b.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$w$b */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$w$b.class */
        public class b implements Runnable {

            /* renamed from: b */
            public final RunnableC3823w f23342b;

            public b(RunnableC3823w runnableC3823w) {
                this.f23342b = runnableC3823w;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f23342b.f23340b.f23086N1.setText("");
                this.f23342b.f23340b.f23082M1.setVisibility(8);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$w$c.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$w$c */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$w$c.class */
        public class c implements Runnable {

            /* renamed from: b */
            public final RunnableC3823w f23343b;

            public c(RunnableC3823w runnableC3823w) {
                this.f23343b = runnableC3823w;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f23343b.f23340b.f23086N1.setText("");
                this.f23343b.f23340b.f23082M1.setVisibility(8);
            }
        }

        public RunnableC3823w(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity) {
            this.f23340b = nSTIJKPlayerSkyTvActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList<LiveStreamsDBModel> m15157D1;
            Handler handler;
            Runnable cVar;
            boolean z10;
            ArrayList<LiveStreamsDBModel> m15217f1;
            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = this.f23340b;
            nSTIJKPlayerSkyTvActivity.f23089O0 = nSTIJKPlayerSkyTvActivity.f23078L1.toString();
            this.f23340b.f23086N1.setText("");
            this.f23340b.f23082M1.setVisibility(8);
            if (this.f23340b.f23152e3.equals("true")) {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity2 = this.f23340b;
                m15157D1 = nSTIJKPlayerSkyTvActivity2.f23084N.m15157D1(nSTIJKPlayerSkyTvActivity2.f23089O0, "radio_streams");
            } else {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity3 = this.f23340b;
                m15157D1 = nSTIJKPlayerSkyTvActivity3.f23084N.m15157D1(nSTIJKPlayerSkyTvActivity3.f23089O0, "live");
            }
            this.f23340b.f23078L1.setLength(0);
            if (m15157D1 == null || m15157D1.size() == 0) {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity4 = this.f23340b;
                nSTIJKPlayerSkyTvActivity4.f23086N1.setText(nSTIJKPlayerSkyTvActivity4.f23145d.getResources().getString(2132018196));
                this.f23340b.f23082M1.setVisibility(0);
                handler = new Handler();
                cVar = new c(this);
            } else {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity5 = this.f23340b;
                if (nSTIJKPlayerSkyTvActivity5.f23084N.m15189R1(SharepreferenceDBHandler.m15337A(nSTIJKPlayerSkyTvActivity5.f23145d)) <= 0 || this.f23340b.f23230w0 == null) {
                    z10 = false;
                } else {
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity6 = this.f23340b;
                    z10 = nSTIJKPlayerSkyTvActivity6.m18597j2(m15157D1, nSTIJKPlayerSkyTvActivity6.f23230w0);
                }
                if (!z10) {
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity7 = this.f23340b;
                    nSTIJKPlayerSkyTvActivity7.f23081M0 = true;
                    nSTIJKPlayerSkyTvActivity7.f23085N0 = true;
                    nSTIJKPlayerSkyTvActivity7.f23117V0 = "0";
                    nSTIJKPlayerSkyTvActivity7.f23121W0 = nSTIJKPlayerSkyTvActivity7.f23145d.getResources().getString(2132017297);
                    this.f23340b.f23154f0 = 0;
                    String m14805L = m15157D1.get(0).m14805L();
                    String m14811R = m15157D1.get(0).m14811R();
                    String name = m15157D1.get(0).getName();
                    String m14798E = m15157D1.get(0).m14798E();
                    String m14810Q = m15157D1.get(0).m14810Q();
                    String m14816W = m15157D1.get(0).m14816W();
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity8 = this.f23340b;
                    nSTIJKPlayerSkyTvActivity8.f23219t1 = m14816W;
                    nSTIJKPlayerSkyTvActivity8.f23055F2 = C5255e.m26215R(nSTIJKPlayerSkyTvActivity8.f23089O0);
                    this.f23340b.f23059G2 = "0";
                    this.f23340b.f23130Y1.setTitle(this.f23340b.f23089O0 + " - " + name);
                    if (this.f23340b.f23152e3.equals("true")) {
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity9 = this.f23340b;
                        m15217f1 = nSTIJKPlayerSkyTvActivity9.f23084N.m15217f1(nSTIJKPlayerSkyTvActivity9.f23117V0, "radio_streams");
                    } else {
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity10 = this.f23340b;
                        m15217f1 = nSTIJKPlayerSkyTvActivity10.f23084N.m15217f1(nSTIJKPlayerSkyTvActivity10.f23117V0, "live");
                    }
                    if (m15217f1 != null) {
                        this.f23340b.f23198o0.clear();
                    }
                    this.f23340b.f23198o0 = m15217f1;
                    if (this.f23340b.f23198o0 != null && this.f23340b.f23198o0.size() > 0) {
                        for (int i10 = 0; i10 < this.f23340b.f23198o0.size(); i10++) {
                            if (((LiveStreamsDBModel) this.f23340b.f23198o0.get(i10)).m14805L().equals(m14805L)) {
                                this.f23340b.f23130Y1.setCurrentWindowIndex(i10);
                                break;
                            }
                        }
                    }
                    try {
                        if (m14810Q.equals("") || m14810Q.isEmpty()) {
                            this.f23340b.f23197o.setImageDrawable(this.f23340b.f23145d.getResources().getDrawable(2131231571));
                        } else {
                            C10014t.m42105q(this.f23340b.f23145d).m42116l(m14810Q).m42154j(2131231571).m42148d(2131231571).m42155k(80, 55).m42151g(this.f23340b.f23197o);
                        }
                    } catch (Exception e10) {
                        this.f23340b.f23197o.setImageDrawable(this.f23340b.f23145d.getResources().getDrawable(2131231571));
                    }
                    this.f23340b.f23130Y1.m19452V0();
                    if (this.f23340b.f23151e2.booleanValue()) {
                        if (this.f23340b.f23118V1.equals("m3u")) {
                            this.f23340b.f23130Y1.m19456Z0(Uri.parse(m14816W), NSTIJKPlayerSkyTvActivity.f23027p3, name);
                            C7920a.m34301l().m34317z(this.f23340b.f23219t1);
                        } else {
                            this.f23340b.f23130Y1.m19456Z0(Uri.parse(this.f23340b.f23149e + C5255e.m26214Q(m14811R) + this.f23340b.f23128Y), NSTIJKPlayerSkyTvActivity.f23027p3, name);
                            C7920a.m34301l().m34317z(m14811R);
                        }
                        this.f23340b.f23130Y1.f24465I = 0;
                        this.f23340b.f23130Y1.f24471K = false;
                        this.f23340b.f23130Y1.start();
                        this.f23340b.f23187l3 = Boolean.FALSE;
                        this.f23340b.f23054F1.removeCallbacksAndMessages(null);
                        this.f23340b.f23054F1.postDelayed(new a(this), 5000L);
                        this.f23340b.m18585W2();
                        this.f23340b.m18574Q2();
                        this.f23340b.m18573Q1(TFTP.DEFAULT_TIMEOUT);
                    }
                    this.f23340b.f23046D1.removeCallbacksAndMessages(null);
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity11 = this.f23340b;
                    nSTIJKPlayerSkyTvActivity11.f23044D = m14798E;
                    nSTIJKPlayerSkyTvActivity11.f23048E = m14810Q;
                    nSTIJKPlayerSkyTvActivity11.f23130Y1.setCurrentEpgChannelID(this.f23340b.f23044D);
                    this.f23340b.f23130Y1.setCurrentChannelLogo(this.f23340b.f23048E);
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity12 = this.f23340b;
                    nSTIJKPlayerSkyTvActivity12.m18588Y2(nSTIJKPlayerSkyTvActivity12.f23048E);
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity13 = this.f23340b;
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity14 = this.f23340b;
                    nSTIJKPlayerSkyTvActivity13.f23196n2 = new AsyncTaskC3799c0(nSTIJKPlayerSkyTvActivity14, nSTIJKPlayerSkyTvActivity14.f23044D, null).execute(new String[0]);
                    this.f23340b.f23042C1.removeCallbacksAndMessages(null);
                    this.f23340b.f23215s1 = C5255e.m26214Q(m14811R);
                    if (this.f23340b.f23227v1 != null) {
                        this.f23340b.f23227v1.putString("currentlyPlayingVideo", m14811R);
                        this.f23340b.f23227v1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", m14816W);
                        this.f23340b.f23227v1.apply();
                    }
                    m15157D1.clear();
                    return;
                }
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity15 = this.f23340b;
                nSTIJKPlayerSkyTvActivity15.f23086N1.setText(nSTIJKPlayerSkyTvActivity15.f23145d.getResources().getString(2132018196));
                this.f23340b.f23082M1.setVisibility(0);
                handler = new Handler();
                cVar = new b(this);
            }
            handler.postDelayed(cVar, 1000L);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$x.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$x */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$x.class */
    public class RunnableC3824x implements Runnable {

        /* renamed from: b */
        public final NSTIJKPlayerSkyTvActivity f23344b;

        public RunnableC3824x(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity) {
            this.f23344b = nSTIJKPlayerSkyTvActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f23344b.m18589a2();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                } catch (Exception e11) {
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$y.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$y */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$y.class */
    public class AsyncTaskC3825y extends AsyncTask<String, Void, Boolean> {

        /* renamed from: a */
        public final NSTIJKPlayerSkyTvActivity f23345a;

        public AsyncTaskC3825y(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity) {
            this.f23345a = nSTIJKPlayerSkyTvActivity;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return Boolean.valueOf(this.f23345a.m18607t2());
            } catch (Exception e10) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            this.f23345a.m18568N2("", true);
            this.f23345a.f23187l3 = Boolean.TRUE;
            if (this.f23345a.f23130Y1 != null) {
                this.f23345a.f23130Y1.setEPGHandler(this.f23345a.f23046D1);
                this.f23345a.f23130Y1.setContext(this.f23345a.f23145d);
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (this.f23345a.f23200o2 == null) {
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = this.f23345a;
                nSTIJKPlayerSkyTvActivity.f23200o2 = NSTIJKPlayerSkyTvActivity.m18508Y1(nSTIJKPlayerSkyTvActivity.f23145d);
                if (this.f23345a.f23200o2 == null) {
                    return;
                }
            } else if (this.f23345a.f23200o2.isShowing()) {
                return;
            }
            this.f23345a.f23200o2.show();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$z.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$z */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/activities/NSTIJKPlayerSkyTvActivity$z.class */
    public class AsyncTaskC3826z extends AsyncTask<String, String, String> {

        /* renamed from: a */
        public final NSTIJKPlayerSkyTvActivity f23346a;

        public AsyncTaskC3826z(NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity) {
            this.f23346a = nSTIJKPlayerSkyTvActivity;
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x01ab, code lost:
        
            if (((com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel) r6.f23346a.f23198o0.get(r7)).m14816W().equals(r18) != false) goto L46;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String m18638a() {
            /*
                Method dump skipped, instructions count: 1116
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.AsyncTaskC3826z.m18638a():java.lang.String");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
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
                    return m18638a();
                }
                if (z10) {
                    return this.f23346a.m18563L1();
                }
                if (z10 == 2) {
                    return this.f23346a.m18593f2();
                }
                if (z10 != 3) {
                    return null;
                }
                return this.f23346a.m18571P1();
            } catch (Exception e10) {
                return "error";
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            try {
                if (this.f23346a.f23202p0 != null) {
                    if (!this.f23346a.f23098Q1.booleanValue()) {
                        this.f23346a.f23098Q1 = Boolean.TRUE;
                        if (this.f23346a.f23202p0.size() == 0) {
                            C5251a.f30008G = Boolean.FALSE;
                            this.f23346a.m18547A2();
                            this.f23346a.f23130Y1.setVisibility(8);
                            this.f23346a.f23188m.setVisibility(0);
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = this.f23346a;
                            nSTIJKPlayerSkyTvActivity.f23193n.setText(nSTIJKPlayerSkyTvActivity.getResources().getString(2132018196));
                        } else if (this.f23346a.f23214s0 != null) {
                            this.f23346a.f23214s0.clear();
                            this.f23346a.f23214s0.addAll(this.f23346a.f23202p0);
                        }
                    }
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity2 = this.f23346a;
                    if (nSTIJKPlayerSkyTvActivity2.f23081M0 && nSTIJKPlayerSkyTvActivity2.f23085N0 && !nSTIJKPlayerSkyTvActivity2.f23089O0.equals("")) {
                        this.f23346a.f23208q2 = 0;
                        try {
                            NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity3 = this.f23346a;
                            nSTIJKPlayerSkyTvActivity3.f23208q2 = nSTIJKPlayerSkyTvActivity3.m18595h2(nSTIJKPlayerSkyTvActivity3.f23202p0, C5255e.m26215R(this.f23346a.f23089O0));
                        } catch (NumberFormatException | Exception e10) {
                        }
                        NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity4 = this.f23346a;
                        nSTIJKPlayerSkyTvActivity4.f23081M0 = false;
                        nSTIJKPlayerSkyTvActivity4.f23085N0 = false;
                    }
                    NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity5 = this.f23346a;
                    nSTIJKPlayerSkyTvActivity5.m18564L2(nSTIJKPlayerSkyTvActivity5.f23202p0);
                }
            } catch (Exception e11) {
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            try {
                TextView textView = this.f23346a.f23061H0;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                NSTIJKPlayerSkyTvActivity nSTIJKPlayerSkyTvActivity = this.f23346a;
                TextView textView2 = nSTIJKPlayerSkyTvActivity.f23159g0;
                if (textView2 != null) {
                    textView2.setText(nSTIJKPlayerSkyTvActivity.f23121W0);
                    this.f23346a.f23159g0.setSelected(true);
                }
            } catch (Exception e10) {
            }
        }
    }

    public NSTIJKPlayerSkyTvActivity() {
        Boolean bool = Boolean.FALSE;
        this.f23094P1 = bool;
        this.f23098Q1 = bool;
        this.f23114U1 = "";
        this.f23137a2 = "";
        this.f23140b2 = bool;
        this.f23147d2 = "";
        Boolean bool2 = Boolean.TRUE;
        this.f23151e2 = bool2;
        this.f23156f2 = null;
        this.f23166h2 = -1;
        this.f23171i2 = 0;
        this.f23176j2 = "";
        this.f23181k2 = bool2;
        this.f23186l2 = null;
        this.f23191m2 = null;
        this.f23196n2 = null;
        this.f23204p2 = false;
        this.f23208q2 = 0;
        this.f23212r2 = false;
        this.f23216s2 = 4;
        this.f23220t2 = f23030s3[0];
        this.f23228v2 = bool;
        this.f23232w2 = bool;
        this.f23236x2 = bool;
        this.f23240y2 = bool;
        this.f23244z2 = bool;
        this.f23035A2 = bool;
        this.f23055F2 = 0;
        this.f23059G2 = "0";
        this.f23063H2 = "0";
        this.f23067I2 = bool2;
        this.f23107S2 = "mobile";
        this.f23135Z2 = 0;
        this.f23144c3 = "";
        this.f23148d3 = "false";
        this.f23152e3 = "false";
        this.f23157f3 = "-10";
        this.f23162g3 = 0;
        this.f23167h3 = false;
        this.f23172i3 = true;
        this.f23182k3 = null;
        this.f23187l3 = bool;
        this.f23192m3 = false;
    }

    /* renamed from: V1 */
    public static boolean m18504V1() {
        ProgressBar progressBar = f23031t3;
        return progressBar != null && progressBar.getVisibility() == 0;
    }

    /* renamed from: Y1 */
    public static ProgressDialog m18508Y1(Context context) {
        try {
            ProgressDialog progressDialog = new ProgressDialog(context);
            try {
                progressDialog.setMessage(context.getResources().getString(2132018352));
                progressDialog.show();
            } catch (Exception e10) {
            }
            progressDialog.setCancelable(false);
            return progressDialog;
        } catch (Exception e11) {
            return null;
        }
    }

    /* renamed from: Z1 */
    public static long m18510Z1(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: d2 */
    public static String m18515d2(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    /* renamed from: A2 */
    public void m18547A2() {
        C5251a.f30008G = Boolean.TRUE;
        this.f23032A = true;
        this.f23188m.setVisibility(0);
        this.f23193n.setText(this.f23145d.getResources().getString(2132018196));
        this.f23207q1.setVisibility(8);
        if (C5251a.f30048k.booleanValue()) {
            findViewById(2131429693).setVisibility(8);
        }
    }

    /* renamed from: B2 */
    public void m18548B2() {
        LinearLayout linearLayout = this.f23065I0;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f23069J0;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
    }

    /* renamed from: C2 */
    public void m18549C2(int i10) {
        try {
            C5864q c5864q = this.f23111T2;
            if (c5864q != null) {
                c5864q.m4100x(i10);
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: D2 */
    public final void m18550D2() {
        this.iv_play.setOnClickListener(this);
        this.iv_pause.setOnClickListener(this);
        this.ll_back_click.setOnClickListener(this);
        this.iv_back.setOnClickListener(this);
        this.ll_audio_subtitle_settings_click.setOnClickListener(this);
        this.iv_audio_subtitle_track.setOnClickListener(this);
        this.ll_channels_list.setOnClickListener(this);
        this.ll_previous_channel.setOnClickListener(this);
        this.ll_next_channel.setOnClickListener(this);
        this.ll_crop.setOnClickListener(this);
        this.ll_multi_screen.setOnClickListener(this);
        this.iv_back_episodes.setOnClickListener(this);
        this.iv_back_settings.setOnClickListener(this);
        this.rl_search_cat.setOnClickListener(this);
    }

    /* renamed from: E2 */
    public final void m18551E2() {
        EditText editText = this.et_search_left_side;
        if (editText != null) {
            editText.addTextChangedListener(new C3802e(this));
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: F2 */
    public final void m18552F2(ArrayList<LiveStreamsDBModel> arrayList) {
        C7920a m34301l;
        String valueOf;
        NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv;
        String str;
        String str2;
        String str3;
        if (arrayList == null || arrayList.size() <= 0 || this.f23074K1 >= arrayList.size()) {
            return;
        }
        int m26215R = C5255e.m26215R(arrayList.get(this.f23074K1).m14805L());
        this.f23055F2 = m26215R;
        this.f23059G2 = arrayList.get(this.f23074K1).m14827g();
        int i10 = this.f23074K1;
        this.f23208q2 = i10;
        String name = arrayList.get(i10).getName();
        int m26214Q = C5255e.m26214Q(arrayList.get(this.f23074K1).m14811R());
        String m14798E = arrayList.get(this.f23074K1).m14798E();
        String m14810Q = arrayList.get(this.f23074K1).m14810Q();
        arrayList.get(this.f23074K1).m14805L();
        this.f23122W1 = arrayList.get(this.f23074K1).m14816W();
        String m26247n0 = C5255e.m26247n0(C7711g.m33686a() + C7711g.m33687i());
        try {
            if (m14810Q.equals("") || m14810Q.isEmpty()) {
                this.f23197o.setImageDrawable(this.f23145d.getResources().getDrawable(2131231571));
            } else {
                C10014t.m42105q(this.f23145d).m42116l(m14810Q).m42154j(2131231571).m42148d(2131231571).m42151g(this.f23197o);
            }
        } catch (Exception e10) {
            this.f23197o.setImageDrawable(this.f23145d.getResources().getDrawable(2131231571));
        }
        this.f23130Y1.setCurrentWindowIndex(this.f23074K1);
        SharedPreferences.Editor editor = this.f23227v1;
        if (editor != null) {
            editor.putString("currentlyPlayingVideo", String.valueOf(arrayList.get(this.f23074K1).m14811R()));
            this.f23227v1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(arrayList.get(this.f23074K1).m14816W()));
            this.f23227v1.apply();
        }
        SharedPreferences.Editor editor2 = this.f23231w1;
        if (editor2 != null) {
            editor2.putInt("currentlyPlayingVideoPosition", this.f23074K1);
            this.f23231w1.apply();
        }
        SimpleDateFormat simpleDateFormat = this.f23126X1;
        if (m18510Z1(simpleDateFormat, simpleDateFormat.format(new Date(C7709e.m33680a(this.f23145d))), this.f23110T1.format(this.f23134Z1)) >= C7707c.m33667p() && (str2 = this.f23185l1) != null && this.f23139b1 != null && (!f23028q3.equals(str2) || (this.f23185l1 != null && (str3 = this.f23139b1) != null && !f23029r3.equals(str3)))) {
            this.f23151e2 = Boolean.FALSE;
            this.f23130Y1.setVisibility(8);
            this.f23188m.setVisibility(0);
            this.f23193n.setText(m26247n0 + this.f23168i + this.f23239y1);
        }
        this.f23215s1 = m26214Q;
        this.f23211r1 = m14798E;
        this.f23219t1 = this.f23122W1;
        if (this.f23118V1.equals("m3u")) {
            m34301l = C7920a.m34301l();
            valueOf = this.f23219t1;
        } else {
            m34301l = C7920a.m34301l();
            valueOf = String.valueOf(this.f23215s1);
        }
        m34301l.m34317z(valueOf);
        this.f23130Y1.setTitle(m26215R + " - " + name);
        this.f23130Y1.m19452V0();
        if (!f23027p3) {
            if (this.f23130Y1.getFullScreenValue().booleanValue()) {
                f23027p3 = this.f23130Y1.getFullScreenValue().booleanValue();
            } else {
                f23027p3 = false;
            }
        }
        if (this.f23151e2.booleanValue()) {
            if (this.f23118V1.equals("m3u")) {
                nSTIJKPlayerSkyTv = this.f23130Y1;
                str = this.f23122W1;
            } else {
                nSTIJKPlayerSkyTv = this.f23130Y1;
                str = this.f23149e + m26214Q + this.f23128Y;
            }
            nSTIJKPlayerSkyTv.m19456Z0(Uri.parse(str), f23027p3, name);
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv2 = this.f23130Y1;
            nSTIJKPlayerSkyTv2.f24465I = 0;
            nSTIJKPlayerSkyTv2.f24471K = false;
            nSTIJKPlayerSkyTv2.start();
        }
        this.f23046D1.removeCallbacksAndMessages(null);
        this.f23044D = m14798E;
        this.f23048E = m14810Q;
        this.f23130Y1.setCurrentEpgChannelID(m14798E);
        this.f23130Y1.setCurrentChannelLogo(this.f23048E);
        m18588Y2(this.f23048E);
        this.f23196n2 = new AsyncTaskC3799c0(this, this.f23044D, null).execute(new String[0]);
        this.f23094P1 = Boolean.TRUE;
    }

    /* renamed from: G1 */
    public final void m18553G1(String str, int i10, String str2, String str3, String str4, int i11) {
        new AsyncTaskC3801d0(this, str, i10, str2, str3, str4, i11).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    /* renamed from: G2 */
    public final void m18554G2() {
        int currentWindowIndex = this.f23130Y1.getCurrentWindowIndex();
        if (currentWindowIndex == 0) {
            this.f23130Y1.setCurrentWindowIndex(this.f23214s0.size() - 1);
        } else {
            this.f23130Y1.setCurrentWindowIndex(currentWindowIndex - 1);
        }
    }

    /* renamed from: H1 */
    public final void m18555H1(String str, String str2, String str3, int i10) {
        new AsyncTaskC3803e0(this, str, str2, str3, i10).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    /* renamed from: H2 */
    public void m18556H2() {
        try {
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = this.f23130Y1;
            if (nSTIJKPlayerSkyTv != null) {
                if (nSTIJKPlayerSkyTv.m19447Q0()) {
                    this.f23130Y1.m19441K0();
                } else {
                    this.f23130Y1.m19463g1();
                    this.f23130Y1.m19450T0(true);
                    this.f23130Y1.m19461e1();
                }
                IjkMediaPlayer.native_profileEnd();
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: I1 */
    public final void m18557I1(Configuration configuration) {
        NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv;
        boolean z10;
        View decorView = getWindow().getDecorView();
        if (configuration.orientation == 2) {
            decorView.setSystemUiVisibility(5894);
            nSTIJKPlayerSkyTv = this.f23130Y1;
            z10 = false;
        } else {
            decorView.setSystemUiVisibility(256);
            nSTIJKPlayerSkyTv = this.f23130Y1;
            z10 = true;
        }
        nSTIJKPlayerSkyTv.setAdjustViewBounds(z10);
    }

    /* renamed from: I2 */
    public final void m18558I2(String str, int i10, String str2, String str3, int i11) {
        new AsyncTaskC3805f0(this, str, i10, str2, str3, i11).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    /* renamed from: J1 */
    public void m18559J1() {
        m18581U1();
        this.f23186l2 = new AsyncTaskC3826z(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels");
    }

    /* renamed from: J2 */
    public final void m18560J2(String str, String str2, int i10) {
        new AsyncTaskC3807g0(this, str, i10).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    /* renamed from: K1 */
    public void m18561K1() {
        m18581U1();
        this.f23186l2 = new AsyncTaskC3826z(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels_with_cat");
    }

    /* renamed from: K2 */
    public void m18562K2() {
        this.f23191m2 = new AsyncTaskC3825y(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0172, code lost:
    
        if (r6.f23198o0.get(r7).m14816W().equals(r18) != false) goto L46;
     */
    /* renamed from: L1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m18563L1() {
        /*
            Method dump skipped, instructions count: 979
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.m18563L1():java.lang.String");
    }

    @SuppressLint({"NewApi"})
    /* renamed from: L2 */
    public void m18564L2(ArrayList<LiveStreamsDBModel> arrayList) {
        LiveStreamDBHandler liveStreamDBHandler;
        String str;
        String str2;
        try {
            if (arrayList == null) {
                this.f23064I = new ArrayList<>();
                return;
            }
            this.f23241z = false;
            this.f23061H0.setVisibility(8);
            if (arrayList.size() == 0) {
                if (this.f23204p2) {
                    TextView textView = this.f23061H0;
                    if (textView == null) {
                        return;
                    }
                    this.f23241z = true;
                    textView.setFocusable(true);
                    this.f23061H0.requestFocus();
                } else {
                    this.f23204p2 = true;
                    ArrayList<LiveStreamsDBModel> arrayList2 = this.f23198o0;
                    if (arrayList2 != null && this.f23189m0 != null) {
                        arrayList2.clear();
                        this.f23189m0.clear();
                    }
                    if (this.f23152e3.equals("true")) {
                        liveStreamDBHandler = this.f23084N;
                        str = this.f23117V0;
                        str2 = "radio_streams";
                    } else {
                        liveStreamDBHandler = this.f23084N;
                        str = this.f23117V0;
                        str2 = "live";
                    }
                    this.f23198o0 = liveStreamDBHandler.m15217f1(str, str2);
                    ArrayList<LiveStreamsDBModel> arrayList3 = this.f23198o0;
                    if (arrayList3 != null && arrayList3.size() > 0) {
                        m18564L2(this.f23198o0);
                        return;
                    }
                    TextView textView2 = this.f23061H0;
                    if (textView2 == null) {
                        return;
                    }
                    this.f23241z = true;
                    textView2.setFocusable(true);
                    this.f23061H0.requestFocus();
                }
                this.f23061H0.setVisibility(0);
            }
        } catch (Exception e10) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r10 != null) goto L12;
     */
    /* renamed from: M1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m18565M1(boolean r9) {
        /*
            r8 = this;
            r0 = r8
            r0.m18581U1()
            r0 = r9
            if (r0 == 0) goto L35
            r0 = r8
            android.app.ProgressDialog r0 = r0.f23200o2
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L25
            r0 = r8
            android.content.Context r0 = r0.f23145d
            android.app.ProgressDialog r0 = m18508Y1(r0)
            r10 = r0
            r0 = r8
            r1 = r10
            r0.f23200o2 = r1
            r0 = r10
            if (r0 == 0) goto L35
            goto L31
        L25:
            r0 = r10
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L35
            r0 = r8
            android.app.ProgressDialog r0 = r0.f23200o2
            r10 = r0
        L31:
            r0 = r10
            r0.show()
        L35:
            r0 = r8
            com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$a0 r1 = new com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity$a0
            r2 = r1
            r3 = r8
            r2.<init>(r3)
            java.util.concurrent.Executor r2 = android.os.AsyncTask.THREAD_POOL_EXECUTOR
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "all_channels_with_cat"
            r4[r5] = r6
            android.os.AsyncTask r1 = r1.executeOnExecutor(r2, r3)
            r0.f23186l2 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.m18565M1(boolean):void");
    }

    @SuppressLint({"NewApi"})
    /* renamed from: M2 */
    public void m18566M2(ArrayList<LiveStreamsDBModel> arrayList) {
        ListView listView;
        try {
            if (this.f23144c3.equals("player")) {
                if (arrayList != null && arrayList.size() > 0) {
                    ListView listView2 = this.f23060H;
                    if (listView2 != null) {
                        listView2.setVisibility(0);
                    }
                    this.f23241z = false;
                    if (this.f23060H != null) {
                        C5866s c5866s = new C5866s(this, arrayList);
                        this.f23123W2 = c5866s;
                        this.f23060H.setAdapter((ListAdapter) c5866s);
                        this.f23060H.setSelection(this.f23135Z2);
                        this.f23060H.requestFocus();
                        this.f23060H.setOnItemClickListener(new C3819s(this, arrayList));
                        return;
                    }
                    return;
                }
                LinearLayout linearLayout = this.f23065I0;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                LinearLayout linearLayout2 = this.f23069J0;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                }
                listView = this.f23060H;
                if (listView == null) {
                    return;
                }
            } else {
                if (arrayList != null && arrayList.size() > 0) {
                    ListView listView3 = this.f23056G;
                    if (listView3 != null) {
                        listView3.setVisibility(0);
                    }
                    this.f23241z = false;
                    if (this.f23056G != null) {
                        C5865r c5865r = new C5865r(this, arrayList);
                        this.f23119V2 = c5865r;
                        this.f23056G.setAdapter((ListAdapter) c5865r);
                        this.f23056G.setSelection(this.f23135Z2);
                        if (!f23027p3) {
                            this.f23056G.requestFocus();
                        }
                        this.f23056G.setOnItemSelectedListener(new C3820t(this));
                        this.f23056G.setOnItemClickListener(new C3821u(this, arrayList));
                        this.f23056G.setOnItemLongClickListener(new C3822v(this));
                        return;
                    }
                    return;
                }
                LinearLayout linearLayout3 = this.f23065I0;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(0);
                }
                LinearLayout linearLayout4 = this.f23069J0;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(0);
                }
                listView = this.f23056G;
                if (listView == null) {
                    return;
                }
            }
            listView.setVisibility(8);
        } catch (Exception e10) {
        }
    }

    /* renamed from: N1 */
    public void m18567N1() {
        m18581U1();
        this.f23186l2 = new AsyncTaskC3826z(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_fav");
    }

    /* renamed from: N2 */
    public final void m18568N2(String str, boolean z10) {
        String str2;
        String str3;
        RecyclerView recyclerView;
        LinearLayoutManager linearLayoutManager;
        if (z10 && this.ll_player_header_footer.getVisibility() == 0) {
            this.ll_player_header_footer.startAnimation(this.f23095P2);
            this.ll_player_header_footer.setVisibility(8);
        }
        this.f23144c3 = str;
        if (str.equals("player")) {
            this.rl_episodes_box_player.startAnimation(this.f23138a3);
            this.rl_episodes_box_player.setVisibility(0);
        }
        String str4 = this.f23157f3;
        if ((str4 != null && str4.equals("-1")) || (((str2 = this.f23157f3) != null && str2.equals("0")) || ((str3 = this.f23157f3) != null && str3.equals("-6")))) {
            String str5 = this.f23157f3;
            this.f23059G2 = str5;
            this.f23063H2 = str5;
        }
        if (this.f23144c3.equals("player")) {
            C5864q c5864q = new C5864q(this.f23145d, this.f23059G2, this.f23144c3, this.f23152e3);
            this.f23115U2 = c5864q;
            this.f23063H2 = this.f23059G2;
            this.recycler_view_left_sidebar_player.setAdapter(c5864q);
            recyclerView = this.recycler_view_left_sidebar_player;
            linearLayoutManager = this.f23131Y2;
        } else {
            C5864q c5864q2 = new C5864q(this.f23145d, this.f23059G2, this.f23144c3, this.f23152e3);
            this.f23111T2 = c5864q2;
            this.f23063H2 = this.f23059G2;
            this.recycler_view_left_sidebar.setAdapter(c5864q2);
            recyclerView = this.recycler_view_left_sidebar;
            linearLayoutManager = this.f23127X2;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        m18565M1(z10);
    }

    /* renamed from: O1 */
    public void m18569O1() {
        m18581U1();
        this.f23186l2 = new AsyncTaskC3826z(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "recently_watched");
    }

    /* renamed from: O2 */
    public final void m18570O2() {
        try {
            new DialogC3812l(this, this).show();
        } catch (Exception e10) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0125, code lost:
    
        if (r6.f23206q0.get(r7).m14816W().equals(r18) != false) goto L37;
     */
    /* renamed from: P1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m18571P1() {
        /*
            Method dump skipped, instructions count: 915
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.m18571P1():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ba  */
    @android.annotation.SuppressLint({"SetTextI18n"})
    /* renamed from: P2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> m18572P2(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 1425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.m18572P2(java.lang.String):java.util.HashMap");
    }

    /* renamed from: Q1 */
    public final void m18573Q1(int i10) {
        this.f23130Y1.f24514c1 = new RunnableC3806g(this);
        NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = this.f23130Y1;
        nSTIJKPlayerSkyTv.f24512b1.postDelayed(nSTIJKPlayerSkyTv.f24514c1, i10);
    }

    /* renamed from: Q2 */
    public void m18574Q2() {
        View view;
        if (this.rl_settings_box.getVisibility() == 8 && this.ll_player_header_footer.getVisibility() == 8) {
            this.f23046D1.removeCallbacksAndMessages(null);
            m18588Y2(this.f23048E);
            this.f23196n2 = new AsyncTaskC3799c0(this, this.f23044D, null).execute(new String[0]);
            this.f23042C1.removeCallbacksAndMessages(null);
            this.ll_player_header_footer.startAnimation(this.f23091O2);
            this.ll_bottom_footer_icons.startAnimation(this.f23091O2);
            this.ll_top_right_setting.startAnimation(this.f23091O2);
            this.ll_top_left_back.startAnimation(this.f23091O2);
            this.ll_bottom_footer_icons.setVisibility(0);
            this.ll_top_right_setting.setVisibility(0);
            this.ll_top_left_back.setVisibility(0);
            this.ll_player_header_footer.setVisibility(0);
            try {
                View view2 = this.f23158g;
                if (view2 == null || view2.getVisibility() != 0) {
                    View view3 = this.f23153f;
                    if (view3 == null || view3.getVisibility() != 0) {
                        return;
                    } else {
                        view = this.f23153f;
                    }
                } else {
                    view = this.f23158g;
                }
                view.requestFocus();
            } catch (Exception e10) {
            }
        }
    }

    /* renamed from: R1 */
    public void m18575R1(int i10) {
        this.f23130Y1.f24514c1 = new RunnableC3804f(this);
        NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = this.f23130Y1;
        nSTIJKPlayerSkyTv.f24512b1.postDelayed(nSTIJKPlayerSkyTv.f24514c1, i10);
    }

    /* renamed from: R2 */
    public void m18576R2() {
        if (this.ll_player_header_footer.getVisibility() == 8) {
            this.ll_player_header_footer.startAnimation(this.f23091O2);
            this.ll_player_header_footer.setVisibility(0);
            if (this.ll_brightness.getVisibility() == 8) {
                this.ll_brightness.startAnimation(this.f23091O2);
                this.ll_brightness.setVisibility(0);
            }
            if (this.ll_pause_play.getVisibility() == 8) {
                this.ll_pause_play.startAnimation(this.f23091O2);
                this.ll_pause_play.setVisibility(0);
            }
            if (this.ll_volume.getVisibility() == 8) {
                this.ll_volume.startAnimation(this.f23091O2);
                this.ll_volume.setVisibility(0);
            }
        }
    }

    /* renamed from: S1 */
    public String m18577S1(String str) {
        ArrayList<LiveStreamCategoryIdDBModel> arrayList = this.f23174j0;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<LiveStreamCategoryIdDBModel> it = this.f23174j0.iterator();
            while (it.hasNext()) {
                LiveStreamCategoryIdDBModel next = it.next();
                if (next.m14787b() != null && !next.m14787b().isEmpty() && next.m14787b().equalsIgnoreCase(str)) {
                    this.f23121W0 = next.m14788c();
                }
            }
        }
        return this.f23121W0;
    }

    /* renamed from: S2 */
    public final void m18578S2() {
        LinearLayout linearLayout;
        if (this.f23144c3.equals("player")) {
            linearLayout = this.f23229w;
            if (linearLayout == null) {
                return;
            }
        } else {
            linearLayout = this.f23225v;
            if (linearLayout == null) {
                return;
            }
        }
        linearLayout.setVisibility(0);
    }

    /* renamed from: T1 */
    public void m18579T1(int i10, String str, String str2) {
    }

    /* renamed from: T2 */
    public final void m18580T2() {
        if (this.rl_settings_box.getVisibility() == 8) {
            this.rl_settings_box.startAnimation(this.f23099Q2);
            this.rl_settings_box.setVisibility(0);
            this.iv_back_settings.requestFocus();
        }
    }

    /* renamed from: U1 */
    public final void m18581U1() {
        AsyncTask asyncTask = this.f23186l2;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            SharepreferenceDBHandler.m15348L(0, this.f23145d);
        } else {
            SharepreferenceDBHandler.m15348L(1, this.f23145d);
            this.f23186l2.cancel(true);
        }
    }

    /* renamed from: U2 */
    public final void m18582U2(Activity activity) {
        new DialogC3816p(this, (NSTIJKPlayerSkyTvActivity) activity, activity).show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00db, code lost:
    
        if (r9 != null) goto L27;
     */
    /* renamed from: V2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m18583V2() {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.m18583V2():void");
    }

    /* renamed from: W1 */
    public final void m18584W1() {
        EditText editText = this.et_search_left_side;
        if (editText != null) {
            editText.setText("");
            this.et_search_left_side.clearFocus();
        }
    }

    /* renamed from: W2 */
    public void m18585W2() {
        Handler handler = this.f23130Y1.f24512b1;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: X1 */
    public final void m18586X1() {
        try {
            SearchView searchView = this.f23057G0;
            if (searchView == null || this.f23106S1 == null) {
                return;
            }
            searchView.m1149b0("", false);
            this.f23106S1.collapseActionView();
        } catch (Exception e10) {
        }
    }

    /* renamed from: X2 */
    public final void m18587X2() {
        m18585W2();
        if (this.ll_player_header_footer.getVisibility() == 0) {
            m18601n2();
        } else {
            m18574Q2();
            m18573Q1(TFTP.DEFAULT_TIMEOUT);
        }
    }

    /* renamed from: Y2 */
    public void m18588Y2(String str) {
        if (str != null) {
            try {
                if (!str.equals("")) {
                    if (this.f23197o != null) {
                        C10014t.m42105q(this.f23145d).m42116l(str).m42155k(80, 55).m42154j(2131231571).m42151g(this.f23197o);
                    }
                }
            } catch (Exception e10) {
                ImageView imageView = this.f23197o;
                if (imageView != null) {
                    imageView.setImageDrawable(this.f23145d.getResources().getDrawable(2131231571, null));
                    return;
                }
                return;
            }
        }
        ImageView imageView2 = this.f23197o;
        if (imageView2 != null) {
            imageView2.setImageDrawable(this.f23145d.getResources().getDrawable(2131231571, null));
        }
    }

    /* renamed from: a2 */
    public void m18589a2() {
        runOnUiThread(new RunnableC3818r(this));
    }

    /* renamed from: b2 */
    public final void m18590b2() {
        ImageView imageView = this.iv_play;
        imageView.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3797b0(this, imageView));
        ImageView imageView2 = this.iv_pause;
        imageView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3797b0(this, imageView2));
        ImageView imageView3 = this.iv_back;
        imageView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3797b0(this, imageView3));
        ImageView imageView4 = this.iv_audio_subtitle_track;
        imageView4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3797b0(this, imageView4));
        LinearLayout linearLayout = this.ll_channels_list;
        linearLayout.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3797b0(this, linearLayout));
        LinearLayout linearLayout2 = this.ll_previous_channel;
        linearLayout2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3797b0(this, linearLayout2));
        LinearLayout linearLayout3 = this.ll_next_channel;
        linearLayout3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3797b0(this, linearLayout3));
        LinearLayout linearLayout4 = this.ll_crop;
        linearLayout4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3797b0(this, linearLayout4));
        LinearLayout linearLayout5 = this.ll_multi_screen;
        linearLayout5.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3797b0(this, linearLayout5));
        ImageView imageView5 = this.iv_back_episodes;
        imageView5.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3797b0(this, imageView5));
        ImageView imageView6 = this.iv_back_settings;
        imageView6.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3797b0(this, imageView6));
        RelativeLayout relativeLayout = this.rl_search_cat;
        relativeLayout.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3797b0(this, relativeLayout));
    }

    /* renamed from: c2 */
    public void m18591c2() {
        RelativeLayout relativeLayout = this.f23097Q0;
        if (relativeLayout != null) {
            relativeLayout.setPadding(0, 0, 0, 0);
        }
        f23027p3 = true;
        m18585W2();
        m18574Q2();
        m18573Q1(TFTP.DEFAULT_TIMEOUT);
        String m15383k = SharepreferenceDBHandler.m15383k(this.f23145d);
        if (!SharepreferenceDBHandler.m15385l(this.f23145d).equals(CookieSpecs.DEFAULT) && !new ExternalPlayerDataBase(this.f23145d).m15130f(m15383k)) {
            SharepreferenceDBHandler.m15356T(CookieSpecs.DEFAULT, CookieSpecs.DEFAULT, this.f23145d);
        }
        String m15385l = SharepreferenceDBHandler.m15385l(this.f23145d);
        if (m15385l == null || m15385l.equalsIgnoreCase(CookieSpecs.DEFAULT)) {
            if (C5251a.f30008G.booleanValue()) {
                LinearLayout linearLayout = this.ll_toolbar;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                findViewById(2131427469).setOnClickListener(null);
                this.f23101R0.setVisibility(8);
                this.f23105S0.setVisibility(8);
                this.f23109T0.setVisibility(8);
                getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f23113U0.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                this.f23113U0.setLayoutParams(layoutParams);
                getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
                NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = this.f23130Y1;
                ((nSTIJKPlayerSkyTv == null || !nSTIJKPlayerSkyTv.isPlaying()) ? this.f23153f : this.f23158g).requestFocus();
                return;
            }
            return;
        }
        m18556H2();
        this.f23212r2 = true;
        SharedPreferences sharedPreferences = getSharedPreferences("currentlyPlayingVideoPosition", 0);
        this.f23108T = sharedPreferences;
        int i10 = sharedPreferences.getInt("currentlyPlayingVideoPosition", 0);
        ArrayList<LiveStreamsDBModel> m28603g = this.f23119V2.m28603g();
        this.f23074K1 = i10;
        if (m28603g == null || m28603g.size() <= 0 || this.f23074K1 >= m28603g.size()) {
            ArrayList<LiveStreamsDBModel> arrayList = this.f23206q0;
            if (arrayList != null && arrayList.size() > 0 && this.f23074K1 < this.f23206q0.size()) {
                this.f23166h2 = C5255e.m26215R(this.f23206q0.get(this.f23074K1).m14811R());
                this.f23122W1 = this.f23206q0.get(this.f23074K1).m14816W();
                this.f23206q0.get(this.f23074K1).getName();
            }
        } else {
            this.f23166h2 = C5255e.m26215R(m28603g.get(this.f23074K1).m14811R());
            this.f23122W1 = m28603g.get(this.f23074K1).m14816W();
        }
        this.f23036B = this.f23166h2;
        this.f23040C = this.f23122W1;
        f23027p3 = false;
        NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv2 = this.f23130Y1;
        if (nSTIJKPlayerSkyTv2 != null) {
            nSTIJKPlayerSkyTv2.m19442L0(Boolean.FALSE);
        }
        if (this.f23118V1.equals("m3u")) {
            if (this.f23151e2.booleanValue()) {
                String m15383k2 = SharepreferenceDBHandler.m15383k(this.f23145d);
                Intent intent = new Intent(this.f23145d, (Class<?>) PlayExternalPlayerActivity.class);
                intent.putExtra("url", this.f23040C);
                intent.putExtra("packagename", m15385l);
                intent.putExtra("app_name", m15383k2);
                this.f23145d.startActivity(intent);
                return;
            }
            return;
        }
        if (this.f23166h2 == -1 || !this.f23151e2.booleanValue()) {
            return;
        }
        String m26203F = C5255e.m26203F(this.f23145d, this.f23166h2, this.f23128Y, "live");
        String m15383k3 = SharepreferenceDBHandler.m15383k(this.f23145d);
        Intent intent2 = new Intent(this.f23145d, (Class<?>) PlayExternalPlayerActivity.class);
        intent2.putExtra("url", m26203F);
        intent2.putExtra("packagename", m15385l);
        intent2.putExtra("app_name", m15383k3);
        this.f23145d.startActivity(intent2);
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
    public void m18592e2() {
        DatabaseHandler databaseHandler;
        Context context;
        ArrayList<LiveStreamsDBModel> arrayList;
        try {
            String str = "live";
            if (this.f23118V1.equals("m3u")) {
                new ArrayList();
                LiveStreamDBHandler liveStreamDBHandler = this.f23084N;
                if (liveStreamDBHandler == null) {
                    return;
                }
                ArrayList<FavouriteM3UModel> m15175K1 = liveStreamDBHandler.m15175K1("live");
                ArrayList<LiveStreamsDBModel> arrayList2 = new ArrayList<>();
                ArrayList<String> arrayList3 = this.f23230w0;
                ArrayList<FavouriteM3UModel> arrayList4 = m15175K1;
                if (arrayList3 != null) {
                    arrayList4 = m15175K1;
                    if (arrayList3.size() > 0) {
                        arrayList4 = m15175K1;
                        if (m15175K1 != null) {
                            arrayList4 = m15175K1;
                            if (m15175K1.size() > 0) {
                                arrayList4 = m18599l2(m15175K1, this.f23230w0);
                            }
                        }
                    }
                }
                Iterator<FavouriteM3UModel> it = arrayList4.iterator();
                while (it.hasNext()) {
                    FavouriteM3UModel next = it.next();
                    ArrayList<LiveStreamsDBModel> m15183O1 = this.f23084N.m15183O1(next.m14775a(), next.m14777c());
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
                if (this.f23223u1 == null) {
                    return;
                }
                if (this.f23152e3.equals("true")) {
                    databaseHandler = this.f23223u1;
                    str = "radio_streams";
                    context = this.f23145d;
                } else {
                    databaseHandler = this.f23223u1;
                    context = this.f23145d;
                }
                ArrayList<FavouriteDBModel> m15116v = databaseHandler.m15116v(str, SharepreferenceDBHandler.m15337A(context));
                ArrayList<LiveStreamsDBModel> arrayList5 = new ArrayList<>();
                ArrayList<String> arrayList6 = this.f23230w0;
                ArrayList<FavouriteDBModel> arrayList7 = m15116v;
                if (arrayList6 != null) {
                    arrayList7 = m15116v;
                    if (arrayList6.size() > 0) {
                        arrayList7 = m15116v;
                        if (m15116v != null) {
                            arrayList7 = m15116v;
                            if (m15116v.size() > 0) {
                                arrayList7 = m18598k2(m15116v, this.f23230w0);
                            }
                        }
                    }
                }
                Iterator<FavouriteDBModel> it2 = arrayList7.iterator();
                while (it2.hasNext()) {
                    FavouriteDBModel next2 = it2.next();
                    LiveStreamsDBModel m15179M1 = new LiveStreamDBHandler(this.f23145d).m15179M1(next2.m14760a(), String.valueOf(next2.m14764e()));
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
            this.f23064I = arrayList;
        } catch (Exception e10) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0144, code lost:
    
        if (r6.f23198o0.get(r7).m14816W().equals(r18) != false) goto L39;
     */
    /* renamed from: f2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m18593f2() {
        /*
            Method dump skipped, instructions count: 941
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.m18593f2():java.lang.String");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:12|(3:14|15|16)(3:73|74|75)|17|18|19|(8:27|28|(4:29|30|31|(5:33|(3:34|35|(2:37|(3:39|40|41)(1:49))(2:50|51))|42|(3:44|45|46)(1:48)|47)(0))|56|(5:60|(3:62|63|64)(1:66)|65|58|57)|67|68|(1:70))(0)|55|56|(2:58|57)|67|68|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x025a, code lost:
    
        if (r6.f23206q0.get(r7).m14816W().equals(r18) != false) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0119 A[Catch: Exception -> 0x04cc, TRY_LEAVE, TryCatch #1 {Exception -> 0x04cc, blocks: (B:56:0x0108, B:58:0x0111, B:60:0x0119, B:63:0x014c), top: B:55:0x0108 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015f A[Catch: Exception -> 0x04be, TryCatch #0 {Exception -> 0x04be, blocks: (B:2:0x0000, B:4:0x0010, B:6:0x0016, B:8:0x0020, B:9:0x0025, B:9:0x0025, B:10:0x0028, B:12:0x0036, B:14:0x0043, B:16:0x004e, B:18:0x0056, B:19:0x0079, B:21:0x008e, B:25:0x009b, B:68:0x0157, B:70:0x015f, B:73:0x0065, B:75:0x0070, B:76:0x0165, B:76:0x0165, B:77:0x0168, B:80:0x01b0, B:82:0x01bd, B:84:0x01dc, B:86:0x0202, B:88:0x020c, B:92:0x0216, B:94:0x0221, B:96:0x022c, B:100:0x0237, B:102:0x0247, B:105:0x025e, B:106:0x027e, B:110:0x03e8, B:114:0x03f2, B:116:0x03fb, B:118:0x0406, B:124:0x0411, B:128:0x0431, B:132:0x0482, B:123:0x04a2, B:138:0x0265, B:142:0x04b2, B:146:0x01f0), top: B:1:0x0000 }] */
    /* renamed from: g2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m18594g2() {
        /*
            Method dump skipped, instructions count: 1233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.m18594g2():java.lang.String");
    }

    /* renamed from: h2 */
    public int m18595h2(ArrayList<LiveStreamsDBModel> arrayList, int i10) {
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

    /* renamed from: i2 */
    public final ArrayList<String> m18596i2() {
        ArrayList<PasswordStatusDBModel> m15232m1 = this.f23084N.m15232m1(SharepreferenceDBHandler.m15337A(this.f23145d));
        this.f23238y0 = m15232m1;
        if (m15232m1 != null) {
            Iterator<PasswordStatusDBModel> it = m15232m1.iterator();
            while (it.hasNext()) {
                PasswordStatusDBModel next = it.next();
                if (next.m15290a().equals("1")) {
                    this.f23230w0.add(next.m15291b());
                }
            }
        }
        return this.f23230w0;
    }

    /* renamed from: j2 */
    public final boolean m18597j2(ArrayList<LiveStreamsDBModel> arrayList, ArrayList<String> arrayList2) {
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

    /* renamed from: k2 */
    public final ArrayList<FavouriteDBModel> m18598k2(ArrayList<FavouriteDBModel> arrayList, ArrayList<String> arrayList2) {
        boolean z10;
        try {
            this.f23037B0 = new ArrayList<>();
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
                    this.f23037B0.add(next);
                }
            }
        } catch (Exception e10) {
        }
        return this.f23037B0;
    }

    /* renamed from: l2 */
    public final ArrayList<FavouriteM3UModel> m18599l2(ArrayList<FavouriteM3UModel> arrayList, ArrayList<String> arrayList2) {
        boolean z10;
        this.f23041C0 = new ArrayList<>();
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
                        this.f23041C0.add(next);
                    }
                }
            }
            return this.f23041C0;
        } catch (Exception e10) {
            return null;
        }
    }

    /* renamed from: m2 */
    public final void m18600m2() {
        ProgressBar progressBar = this.f23221u;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
        TextView textView = this.f23201p;
        if (textView != null) {
            textView.setText(this.f23145d.getResources().getString(2132018252));
        }
        TextView textView2 = this.f23205q;
        if (textView2 != null) {
            textView2.setText("");
        }
        TextView textView3 = this.f23209r;
        if (textView3 != null) {
            textView3.setText(this.f23145d.getResources().getString(2132018186));
        }
        TextView textView4 = this.f23213s;
        if (textView4 != null) {
            textView4.setText("");
        }
    }

    /* renamed from: n2 */
    public final void m18601n2() {
        if (this.ll_player_header_footer.getVisibility() == 0) {
            this.ll_player_header_footer.startAnimation(this.f23095P2);
            this.ll_bottom_footer_icons.startAnimation(this.f23095P2);
            this.ll_top_right_setting.startAnimation(this.f23095P2);
            this.ll_top_left_back.startAnimation(this.f23095P2);
            if (this.ll_brightness.getVisibility() == 0) {
                this.ll_brightness.startAnimation(this.f23095P2);
            }
            if (this.ll_pause_play.getVisibility() == 0) {
                this.ll_pause_play.startAnimation(this.f23095P2);
            }
            if (this.ll_volume.getVisibility() == 0) {
                this.ll_volume.startAnimation(this.f23095P2);
            }
            this.ll_player_header_footer.setVisibility(8);
            if (this.ll_brightness.getVisibility() == 0) {
                this.ll_brightness.setVisibility(8);
            }
            if (this.ll_pause_play.getVisibility() == 0) {
                this.ll_pause_play.setVisibility(8);
            }
            if (this.ll_volume.getVisibility() == 0) {
                this.ll_volume.setVisibility(8);
            }
            this.ll_bottom_footer_icons.setVisibility(8);
            this.ll_top_right_setting.setVisibility(8);
            this.ll_top_left_back.setVisibility(8);
        }
    }

    /* renamed from: o2 */
    public void m18602o2() {
        if (this.ll_player_header_footer.getVisibility() == 0) {
            this.ll_player_header_footer.startAnimation(this.f23095P2);
            if (this.ll_brightness.getVisibility() == 0) {
                this.ll_brightness.startAnimation(this.f23095P2);
            }
            if (this.ll_pause_play.getVisibility() == 0) {
                this.ll_pause_play.startAnimation(this.f23095P2);
            }
            if (this.ll_volume.getVisibility() == 0) {
                this.ll_volume.startAnimation(this.f23095P2);
            }
            this.ll_player_header_footer.setVisibility(8);
            if (this.ll_brightness.getVisibility() == 0) {
                this.ll_brightness.setVisibility(8);
            }
            if (this.ll_pause_play.getVisibility() == 0) {
                this.ll_pause_play.setVisibility(8);
            }
            if (this.ll_volume.getVisibility() == 0) {
                this.ll_volume.setVisibility(8);
            }
            this.ll_bottom_footer_icons.setVisibility(8);
            this.ll_top_right_setting.setVisibility(8);
            this.ll_top_left_back.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 101) {
            try {
                if (m18609v2()) {
                    SharedPreferences sharedPreferences = getSharedPreferences("downloadStatus", 0);
                    f23026o3 = sharedPreferences;
                    String string = sharedPreferences.getString("downloadStatus", "");
                    C5255e c5255e = new C5255e();
                    if (string.equals("processing")) {
                        c5255e.m26262g0(this);
                    } else {
                        c5255e.m26263j0(this, this.f23161g2, this.f23128Y, this.f23149e, this.f23036B, this.f23040C);
                    }
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f4, code lost:
    
        if (r5 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f7, code lost:
    
        r5.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fd, code lost:
    
        m18583V2();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0109, code lost:
    
        if (r5 != null) goto L44;
     */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onBackPressed() {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.onBackPressed():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:28:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0794  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onClick(android.view.View r7) {
        /*
            Method dump skipped, instructions count: 2222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.onClick(android.view.View):void");
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m18557I1(configuration);
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f23145d = this;
        super.onCreate(bundle);
        setContentView(2131624097);
        ButterKnife.m5626a(this);
        overridePendingTransition(2130772003, 2130772000);
        m18608u2();
        RelativeLayout relativeLayout = this.f23097Q0;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new ViewOnClickListenerC3811k(this));
        }
        this.f23230w0 = m18596i2();
        SharedPreferences.Editor editor = this.f23227v1;
        if (editor != null) {
            editor.putString("currentlyPlayingVideo", String.valueOf(this.f23171i2));
            this.f23227v1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", "0");
            this.f23227v1.apply();
        }
        this.f23084N.m15184P0();
        if (this.f23148d3.equals("false")) {
            m18562K2();
        } else {
            String str = this.f23117V0;
            this.f23059G2 = str;
            C5864q c5864q = new C5864q(this.f23145d, str, "", this.f23152e3);
            this.f23111T2 = c5864q;
            this.f23063H2 = this.f23059G2;
            this.recycler_view_left_sidebar.setAdapter(c5864q);
            this.recycler_view_left_sidebar.setLayoutManager(this.f23127X2);
            m18565M1(true);
        }
        C5255e.m26206I(this.f23145d);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f23053F0.m1224x(2131689495);
        this.f23102R1 = menu;
        this.f23106S1 = menu.getItem(2).getSubMenu().findItem(2131427886);
        if (SharepreferenceDBHandler.m15373f(this.f23145d).equals("api")) {
            menu.getItem(2).getSubMenu().findItem(2131428638).setVisible(false);
        }
        TypedValue typedValue = new TypedValue();
        int i10 = 0;
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f23145d.getResources().getDisplayMetrics());
            i10 = 0;
        }
        while (i10 < this.f23053F0.getChildCount()) {
            if (this.f23053F0.getChildAt(i10) instanceof ActionMenuView) {
                ((Toolbar.C0292e) this.f23053F0.getChildAt(i10).getLayoutParams()).f26228a = 16;
            }
            i10++;
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            m18581U1();
            m18556H2();
        } catch (Exception e10) {
        }
    }

    @Override // androidx.appcompat.app.ActivityC0243b, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        keyEvent.getRepeatCount();
        keyEvent.getAction();
        if (f23027p3 && this.ll_bottom_footer_icons.getVisibility() == 8 && this.rl_settings_box.getVisibility() == 8 && this.rl_episodes_box_player.getVisibility() == 8) {
            if (i10 == 20) {
                if (!this.f23151e2.booleanValue()) {
                    return true;
                }
                findViewById(2131428477).performClick();
                return true;
            }
            if (i10 == 19) {
                if (!this.f23151e2.booleanValue()) {
                    return true;
                }
                findViewById(2131428446).performClick();
                return true;
            }
        }
        if (i10 == 166) {
            if (!f23027p3 || !this.f23151e2.booleanValue()) {
                return true;
            }
            findViewById(2131428446).performClick();
            return true;
        }
        if (i10 != 167) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (!f23027p3 || !this.f23151e2.booleanValue()) {
            return true;
        }
        findViewById(2131428477).performClick();
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv;
        StringBuilder sb2;
        int i11;
        boolean z10 = keyEvent.getRepeatCount() == 0;
        if (i10 != 62) {
            if (i10 != 66) {
                if (i10 != 79) {
                    if (i10 == 82) {
                        Menu menu = this.f23102R1;
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
                                if (!f23027p3) {
                                    return true;
                                }
                                this.f23050E1.removeCallbacksAndMessages(null);
                                if (i10 == 7) {
                                    this.f23078L1.append(0);
                                } else if (i10 == 8) {
                                    this.f23078L1.append(1);
                                } else {
                                    if (i10 == 9) {
                                        sb2 = this.f23078L1;
                                        i11 = 2;
                                    } else if (i10 == 10) {
                                        sb2 = this.f23078L1;
                                        i11 = 3;
                                    } else if (i10 == 11) {
                                        sb2 = this.f23078L1;
                                        i11 = 4;
                                    } else if (i10 == 12) {
                                        sb2 = this.f23078L1;
                                        i11 = 5;
                                    } else if (i10 == 13) {
                                        sb2 = this.f23078L1;
                                        i11 = 6;
                                    } else if (i10 == 14) {
                                        sb2 = this.f23078L1;
                                        i11 = 7;
                                    } else if (i10 == 15) {
                                        this.f23078L1.append(8);
                                    } else if (i10 == 16) {
                                        this.f23078L1.append(9);
                                    }
                                    sb2.append(i11);
                                }
                                this.f23086N1.setText(this.f23078L1.toString());
                                this.f23082M1.setVisibility(0);
                                this.f23050E1.postDelayed(new RunnableC3823w(this), 3000L);
                                return true;
                            default:
                                switch (i10) {
                                    case 19:
                                    case 20:
                                    case 22:
                                        m18585W2();
                                        m18573Q1(TFTP.DEFAULT_TIMEOUT);
                                        return true;
                                    case 21:
                                        m18585W2();
                                        m18573Q1(TFTP.DEFAULT_TIMEOUT);
                                        if (!f23027p3 || this.ll_player_header_footer.getVisibility() != 8 || this.rl_episodes_box_player.getVisibility() != 8) {
                                            return true;
                                        }
                                        m18568N2("player", true);
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
            if (!f23027p3) {
                return true;
            }
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv2 = this.f23130Y1;
            if (nSTIJKPlayerSkyTv2 == null || !nSTIJKPlayerSkyTv2.getPlayerIsPrepared()) {
                m18587X2();
                return true;
            }
            if (this.rl_settings_box.getVisibility() != 8) {
                return true;
            }
            m18587X2();
            (this.f23130Y1.isPlaying() ? this.iv_pause : this.iv_play).requestFocus();
            return true;
        }
        if (!this.f23151e2.booleanValue() || (nSTIJKPlayerSkyTv = this.f23130Y1) == null || !nSTIJKPlayerSkyTv.getPlayerIsPrepared()) {
            return true;
        }
        ((!z10 || this.f23130Y1.isPlaying()) ? this.iv_pause : this.iv_play).performClick();
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.f23106S1 = menuItem;
        int itemId = menuItem.getItemId();
        if (itemId == 2131428761) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == 2131428776) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == 2131427417 && (context = this.f23145d) != null) {
            new DialogC0242a.a(context, 2132082693).setTitle(this.f23145d.getResources().getString(2132017988)).m857e(this.f23145d.getResources().getString(2132017987)).m861i(this.f23145d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3809i(this)).m858f(this.f23145d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3808h(this)).m865m();
        }
        if (itemId == 2131427425) {
            try {
                SearchView searchView = (SearchView) menuItem.getActionView();
                this.f23057G0 = searchView;
                if (searchView != null) {
                    searchView.setQueryHint(getResources().getString(2132018514));
                    this.f23057G0.setIconifiedByDefault(false);
                    ImageView imageView = (ImageView) this.f23057G0.findViewById(2131429120);
                    ((ImageView) this.f23057G0.findViewById(2131429123)).setImageResource(2131231606);
                    imageView.setImageResource(2131231606);
                    imageView.setPadding(15, 15, 15, 15);
                    imageView.setBackground(null);
                    this.f23057G0.setOnQueryTextListener(new C3810j(this));
                    return true;
                }
            } catch (Exception e10) {
            }
        }
        if (itemId == 2131428638 && SharepreferenceDBHandler.m15373f(this.f23145d).equals("m3u")) {
            DialogC0242a.a aVar = new DialogC0242a.a(this);
            aVar.setTitle(this.f23145d.getResources().getString(2132017514));
            aVar.m857e(this.f23145d.getResources().getString(2132017585));
            aVar.m855c(2131231731);
            aVar.m861i(this.f23145d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3813m(this));
            aVar.m858f(this.f23145d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3814n(this));
            aVar.m865m();
        }
        if (itemId == 2131428645) {
            m18582U2(this);
        }
        if (itemId == 2131428757) {
            m18570O2();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        Handler handler;
        super.onPause();
        try {
            Thread thread = this.f23182k3;
            if (thread != null && thread.isAlive()) {
                this.f23182k3.interrupt();
            }
        } catch (Exception e10) {
        }
        try {
            if (this.f23187l3.booleanValue() || (handler = this.f23054F1) == null) {
                return;
            }
            handler.removeCallbacksAndMessages(null);
        } catch (Exception e11) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 != 101) {
            return;
        }
        try {
            if (iArr.length > 0 && iArr[0] == 0) {
                m18609v2();
            } else if (Build.VERSION.SDK_INT >= 23 && !shouldShowRequestPermissionRationale(strArr[0])) {
                DialogC0242a.a aVar = new DialogC0242a.a(this, 2132082693);
                View inflate = LayoutInflater.from(this).inflate(2131624461, (ViewGroup) null);
                Button button = (Button) inflate.findViewById(2131427646);
                Button button2 = (Button) inflate.findViewById(2131427636);
                button.setOnFocusChangeListener(new C5255e.i(button, this));
                button2.setOnFocusChangeListener(new C5255e.i(button2, this));
                button.setOnClickListener(new ViewOnClickListenerC3815o(this));
                button2.setOnClickListener(new ViewOnClickListenerC3817q(this));
                aVar.setView(inflate);
                this.f23143c2 = aVar.create();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = this.f23143c2.getWindow();
                Objects.requireNonNull(window);
                Window window2 = window;
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = -1;
                layoutParams.height = -2;
                this.f23143c2.show();
                this.f23143c2.getWindow().setAttributes(layoutParams);
                this.f23143c2.setCancelable(false);
                this.f23143c2.show();
            }
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f23182k3;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC3824x(this));
            this.f23182k3 = thread2;
            thread2.start();
        }
        C5255e.m26233f(this.f23145d);
        if (this.f23212r2) {
            this.f23212r2 = false;
            m18583V2();
        }
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onStop() {
        super.onStop();
        try {
            m18556H2();
        } catch (Exception e10) {
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            m18557I1(getResources().getConfiguration());
        }
    }

    /* renamed from: p2 */
    public final void m18603p2() {
        LinearLayout linearLayout = this.f23225v;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f23229w;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    /* renamed from: q2 */
    public void m18604q2() {
        LinearLayout linearLayout = this.ll_no_cat_found;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.ll_no_cat_found_player;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    /* renamed from: r2 */
    public void m18605r2() {
        LinearLayout linearLayout = this.f23065I0;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f23069J0;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    /* renamed from: s2 */
    public void m18606s2() {
        try {
            ProgressDialog progressDialog = this.f23200o2;
            if (progressDialog == null || !progressDialog.isShowing()) {
                return;
            }
            this.f23200o2.dismiss();
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02cc A[Catch: Exception -> 0x041d, TRY_ENTER, TryCatch #0 {Exception -> 0x041d, blocks: (B:2:0x0000, B:4:0x000f, B:5:0x006e, B:5:0x006e, B:6:0x0071, B:8:0x00df, B:12:0x00f7, B:14:0x0120, B:15:0x01bf, B:17:0x01df, B:19:0x0203, B:21:0x020f, B:23:0x0218, B:25:0x0220, B:26:0x025d, B:28:0x0265, B:38:0x0290, B:52:0x02f5, B:56:0x02fe, B:58:0x0309, B:62:0x0321, B:65:0x03dc, B:67:0x03e4, B:68:0x03e8, B:68:0x03e8, B:69:0x03eb, B:71:0x03fe, B:73:0x0405, B:74:0x0411, B:74:0x0411, B:75:0x0414, B:79:0x032f, B:81:0x033c, B:83:0x034e, B:85:0x0367, B:87:0x036e, B:88:0x0346, B:89:0x037e, B:90:0x039e, B:91:0x03be, B:93:0x029f, B:97:0x02ae, B:101:0x02bd, B:105:0x02cc, B:109:0x012c, B:111:0x0139, B:115:0x0154, B:116:0x017c, B:120:0x0197, B:121:0x0040), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01df A[Catch: Exception -> 0x041d, TRY_ENTER, TryCatch #0 {Exception -> 0x041d, blocks: (B:2:0x0000, B:4:0x000f, B:5:0x006e, B:5:0x006e, B:6:0x0071, B:8:0x00df, B:12:0x00f7, B:14:0x0120, B:15:0x01bf, B:17:0x01df, B:19:0x0203, B:21:0x020f, B:23:0x0218, B:25:0x0220, B:26:0x025d, B:28:0x0265, B:38:0x0290, B:52:0x02f5, B:56:0x02fe, B:58:0x0309, B:62:0x0321, B:65:0x03dc, B:67:0x03e4, B:68:0x03e8, B:68:0x03e8, B:69:0x03eb, B:71:0x03fe, B:73:0x0405, B:74:0x0411, B:74:0x0411, B:75:0x0414, B:79:0x032f, B:81:0x033c, B:83:0x034e, B:85:0x0367, B:87:0x036e, B:88:0x0346, B:89:0x037e, B:90:0x039e, B:91:0x03be, B:93:0x029f, B:97:0x02ae, B:101:0x02bd, B:105:0x02cc, B:109:0x012c, B:111:0x0139, B:115:0x0154, B:116:0x017c, B:120:0x0197, B:121:0x0040), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x020f A[Catch: Exception -> 0x041d, TRY_LEAVE, TryCatch #0 {Exception -> 0x041d, blocks: (B:2:0x0000, B:4:0x000f, B:5:0x006e, B:5:0x006e, B:6:0x0071, B:8:0x00df, B:12:0x00f7, B:14:0x0120, B:15:0x01bf, B:17:0x01df, B:19:0x0203, B:21:0x020f, B:23:0x0218, B:25:0x0220, B:26:0x025d, B:28:0x0265, B:38:0x0290, B:52:0x02f5, B:56:0x02fe, B:58:0x0309, B:62:0x0321, B:65:0x03dc, B:67:0x03e4, B:68:0x03e8, B:68:0x03e8, B:69:0x03eb, B:71:0x03fe, B:73:0x0405, B:74:0x0411, B:74:0x0411, B:75:0x0414, B:79:0x032f, B:81:0x033c, B:83:0x034e, B:85:0x0367, B:87:0x036e, B:88:0x0346, B:89:0x037e, B:90:0x039e, B:91:0x03be, B:93:0x029f, B:97:0x02ae, B:101:0x02bd, B:105:0x02cc, B:109:0x012c, B:111:0x0139, B:115:0x0154, B:116:0x017c, B:120:0x0197, B:121:0x0040), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03e4 A[Catch: Exception -> 0x041d, TRY_ENTER, TryCatch #0 {Exception -> 0x041d, blocks: (B:2:0x0000, B:4:0x000f, B:5:0x006e, B:5:0x006e, B:6:0x0071, B:8:0x00df, B:12:0x00f7, B:14:0x0120, B:15:0x01bf, B:17:0x01df, B:19:0x0203, B:21:0x020f, B:23:0x0218, B:25:0x0220, B:26:0x025d, B:28:0x0265, B:38:0x0290, B:52:0x02f5, B:56:0x02fe, B:58:0x0309, B:62:0x0321, B:65:0x03dc, B:67:0x03e4, B:68:0x03e8, B:68:0x03e8, B:69:0x03eb, B:71:0x03fe, B:73:0x0405, B:74:0x0411, B:74:0x0411, B:75:0x0414, B:79:0x032f, B:81:0x033c, B:83:0x034e, B:85:0x0367, B:87:0x036e, B:88:0x0346, B:89:0x037e, B:90:0x039e, B:91:0x03be, B:93:0x029f, B:97:0x02ae, B:101:0x02bd, B:105:0x02cc, B:109:0x012c, B:111:0x0139, B:115:0x0154, B:116:0x017c, B:120:0x0197, B:121:0x0040), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03fe A[Catch: Exception -> 0x041d, TRY_ENTER, TryCatch #0 {Exception -> 0x041d, blocks: (B:2:0x0000, B:4:0x000f, B:5:0x006e, B:5:0x006e, B:6:0x0071, B:8:0x00df, B:12:0x00f7, B:14:0x0120, B:15:0x01bf, B:17:0x01df, B:19:0x0203, B:21:0x020f, B:23:0x0218, B:25:0x0220, B:26:0x025d, B:28:0x0265, B:38:0x0290, B:52:0x02f5, B:56:0x02fe, B:58:0x0309, B:62:0x0321, B:65:0x03dc, B:67:0x03e4, B:68:0x03e8, B:68:0x03e8, B:69:0x03eb, B:71:0x03fe, B:73:0x0405, B:74:0x0411, B:74:0x0411, B:75:0x0414, B:79:0x032f, B:81:0x033c, B:83:0x034e, B:85:0x0367, B:87:0x036e, B:88:0x0346, B:89:0x037e, B:90:0x039e, B:91:0x03be, B:93:0x029f, B:97:0x02ae, B:101:0x02bd, B:105:0x02cc, B:109:0x012c, B:111:0x0139, B:115:0x0154, B:116:0x017c, B:120:0x0197, B:121:0x0040), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03be A[Catch: Exception -> 0x041d, TRY_ENTER, TryCatch #0 {Exception -> 0x041d, blocks: (B:2:0x0000, B:4:0x000f, B:5:0x006e, B:5:0x006e, B:6:0x0071, B:8:0x00df, B:12:0x00f7, B:14:0x0120, B:15:0x01bf, B:17:0x01df, B:19:0x0203, B:21:0x020f, B:23:0x0218, B:25:0x0220, B:26:0x025d, B:28:0x0265, B:38:0x0290, B:52:0x02f5, B:56:0x02fe, B:58:0x0309, B:62:0x0321, B:65:0x03dc, B:67:0x03e4, B:68:0x03e8, B:68:0x03e8, B:69:0x03eb, B:71:0x03fe, B:73:0x0405, B:74:0x0411, B:74:0x0411, B:75:0x0414, B:79:0x032f, B:81:0x033c, B:83:0x034e, B:85:0x0367, B:87:0x036e, B:88:0x0346, B:89:0x037e, B:90:0x039e, B:91:0x03be, B:93:0x029f, B:97:0x02ae, B:101:0x02bd, B:105:0x02cc, B:109:0x012c, B:111:0x0139, B:115:0x0154, B:116:0x017c, B:120:0x0197, B:121:0x0040), top: B:1:0x0000 }] */
    /* renamed from: t2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m18607t2() {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.m18607t2():boolean");
    }

    public void toggleView(View view) {
        if (view.getVisibility() == 8) {
            view.setVisibility(0);
        } else if (view.getVisibility() == 0) {
            view.setVisibility(8);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(36:0|1|(1:5)|6|(1:8)(1:131)|9|(30:112|(2:122|(1:130))(1:120)|121|18|(4:20|21|31|32)(1:111)|41|(1:43)|44|(1:46)|47|(4:49|(1:51)|52|(2:54|55))(2:92|(2:94|55))|56|(1:58)(1:91)|59|60|61|62|(1:64)(1:88)|65|(1:87)|69|(1:71)|72|(1:74)|75|(1:77)|78|(1:80)|81|(2:83|84)(1:86))|17|18|(0)(0)|41|(0)|44|(0)|47|(0)(0)|56|(0)(0)|59|60|61|62|(0)(0)|65|(1:67)|87|69|(0)|72|(0)|75|(0)|78|(0)|81|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0a24  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0b15  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0b2b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0b53  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0cd6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0cf3  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0a2b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x05c5  */
    /* renamed from: u2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m18608u2() {
        /*
            Method dump skipped, instructions count: 3320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity.m18608u2():void");
    }

    /* renamed from: v2 */
    public boolean m18609v2() {
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

    /* renamed from: w2 */
    public void m18610w2(String str) {
        this.f23063H2 = str;
        try {
            SearchView searchView = this.f23057G0;
            if (searchView != null && this.f23106S1 != null) {
                searchView.m1149b0("", false);
                this.f23106S1.collapseActionView();
            }
        } catch (Exception e10) {
        }
        try {
            if (this.f23102R1 != null) {
                if (this.f23063H2.equals("-6")) {
                    this.f23102R1.getItem(2).getSubMenu().findItem(2131428757).setVisible(true);
                } else {
                    this.f23102R1.getItem(2).getSubMenu().findItem(2131428757).setVisible(false);
                }
            }
        } catch (Exception e11) {
        }
        m18565M1(true);
    }

    /* renamed from: x2 */
    public final void m18611x2() {
        ProgressBar progressBar = this.f23221u;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
        TextView textView = this.f23201p;
        if (textView != null) {
            textView.setText(this.f23145d.getResources().getString(2132018251));
        }
        TextView textView2 = this.f23205q;
        if (textView2 != null) {
            textView2.setText("");
        }
        TextView textView3 = this.f23209r;
        if (textView3 != null) {
            textView3.setText(this.f23145d.getResources().getString(2132018185));
        }
        TextView textView4 = this.f23213s;
        if (textView4 != null) {
            textView4.setText("");
        }
    }

    /* renamed from: y2 */
    public final void m18612y2() {
        int currentWindowIndex = this.f23130Y1.getCurrentWindowIndex();
        if (currentWindowIndex == this.f23214s0.size() - 1) {
            this.f23130Y1.setCurrentWindowIndex(0);
        } else {
            this.f23130Y1.setCurrentWindowIndex(currentWindowIndex + 1);
        }
    }

    /* renamed from: z2 */
    public void m18613z2() {
        LinearLayout linearLayout = this.ll_no_cat_found;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        if (this.ll_no_cat_found != null) {
            this.ll_no_cat_found_player.setVisibility(0);
        }
    }
}

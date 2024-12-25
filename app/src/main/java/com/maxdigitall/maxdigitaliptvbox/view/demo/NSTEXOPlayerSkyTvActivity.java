package com.maxdigitall.maxdigitaliptvbox.view.demo;

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
import android.util.Pair;
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
import com.amazonaws.mobileconnectors.appsync.AWSAppSyncClient;
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
import com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity;
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
import org.apache.http.client.config.CookieSpecs;
import p009a8.C0083a1;
import p009a8.C0103k;
import p027b9.InterfaceC0854m;
import p030c0.C0936d;
import p059d9.C4372l;
import p059d9.InterfaceC4370k;
import p078e9.C4670d0;
import p078e9.C4682p;
import p151if.C5251a;
import p151if.C5255e;
import p203lf.C5864q;
import p203lf.C5865r;
import p203lf.C5866s;
import p218mf.C6588b;
import p218mf.C6597k;
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
import p421y8.AbstractC9886j;
import p421y8.C9882f;
import p421y8.C9888l;
import p428yg.C10014t;
import pf.C7707c;
import pf.C7709e;
import pf.C7711g;
import wf.C9572b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity.class */
public class NSTEXOPlayerSkyTvActivity extends ActivityC0243b implements SurfaceHolder.Callback, View.OnClickListener {

    /* renamed from: A3 */
    public static SharedPreferences f21662A3;

    /* renamed from: C3 */
    public static String f21664C3;

    /* renamed from: D3 */
    public static String f21665D3;

    /* renamed from: F3 */
    public static ProgressBar f21667F3;

    /* renamed from: z3 */
    public static SharedPreferences f21668z3;

    /* renamed from: A0 */
    public SharedPreferences.Editor f21670A0;

    /* renamed from: A1 */
    public Handler f21671A1;

    /* renamed from: A2 */
    public Boolean f21672A2;

    /* renamed from: B */
    public int f21673B;

    /* renamed from: B0 */
    public ArrayList<FavouriteDBModel> f21674B0;

    /* renamed from: B1 */
    public Handler f21675B1;

    /* renamed from: B2 */
    public Boolean f21676B2;

    /* renamed from: C */
    public String f21677C;

    /* renamed from: C0 */
    public ArrayList<FavouriteM3UModel> f21678C0;

    /* renamed from: C1 */
    public Handler f21679C1;

    /* renamed from: C2 */
    public C6783a f21680C2;

    /* renamed from: D */
    public String f21681D;

    /* renamed from: D0 */
    public RecyclerView f21682D0;

    /* renamed from: D1 */
    public Handler f21683D1;

    /* renamed from: D2 */
    public Handler f21684D2;

    /* renamed from: E */
    public String f21685E;

    /* renamed from: E0 */
    public ProgressBar f21686E0;

    /* renamed from: E1 */
    public Handler f21687E1;

    /* renamed from: E2 */
    public Handler f21688E2;

    /* renamed from: F */
    public RelativeLayout f21689F;

    /* renamed from: F0 */
    public Toolbar f21690F0;

    /* renamed from: F1 */
    public Handler f21691F1;

    /* renamed from: F2 */
    public ArrayList<ExternalPlayerModelClass> f21692F2;

    /* renamed from: G */
    public ListView f21693G;

    /* renamed from: G0 */
    public SearchView f21694G0;

    /* renamed from: G1 */
    public SharedPreferences.Editor f21695G1;

    /* renamed from: G2 */
    public int f21696G2;

    /* renamed from: H */
    public ListView f21697H;

    /* renamed from: H0 */
    public TextView f21698H0;

    /* renamed from: H1 */
    public SharedPreferences.Editor f21699H1;

    /* renamed from: H2 */
    public String f21700H2;

    /* renamed from: I */
    public ArrayList<LiveStreamsDBModel> f21701I;

    /* renamed from: I0 */
    public LinearLayout f21702I0;

    /* renamed from: I1 */
    public SharedPreferences.Editor f21703I1;

    /* renamed from: I2 */
    public String f21704I2;

    /* renamed from: J0 */
    public LinearLayout f21706J0;

    /* renamed from: J1 */
    public TextView f21707J1;

    /* renamed from: J2 */
    public Boolean f21708J2;

    /* renamed from: K0 */
    public AppBarLayout f21710K0;

    /* renamed from: K2 */
    public Animation f21712K2;

    /* renamed from: L */
    public String f21713L;

    /* renamed from: L2 */
    public Animation f21716L2;

    /* renamed from: M1 */
    public LinearLayout f21719M1;

    /* renamed from: M2 */
    public Animation f21720M2;

    /* renamed from: N */
    public LiveStreamDBHandler f21721N;

    /* renamed from: N1 */
    public TextView f21723N1;

    /* renamed from: N2 */
    public Animation f21724N2;

    /* renamed from: O */
    public SharedPreferences f21725O;

    /* renamed from: O0 */
    public String f21726O0;

    /* renamed from: O2 */
    public Animation f21728O2;

    /* renamed from: P */
    public SharedPreferences f21729P;

    /* renamed from: P1 */
    public Boolean f21731P1;

    /* renamed from: P2 */
    public Animation f21732P2;

    /* renamed from: Q */
    public SharedPreferences f21733Q;

    /* renamed from: Q0 */
    public RelativeLayout f21734Q0;

    /* renamed from: Q1 */
    public Boolean f21735Q1;

    /* renamed from: Q2 */
    public Animation f21736Q2;

    /* renamed from: R */
    public SharedPreferences f21737R;

    /* renamed from: R0 */
    public LinearLayout f21738R0;

    /* renamed from: R1 */
    public Menu f21739R1;

    /* renamed from: R2 */
    public Animation f21740R2;

    /* renamed from: S */
    public SharedPreferences f21741S;

    /* renamed from: S0 */
    public RelativeLayout f21742S0;

    /* renamed from: S1 */
    public MenuItem f21743S1;

    /* renamed from: S2 */
    public Animation f21744S2;

    /* renamed from: T */
    public SharedPreferences f21745T;

    /* renamed from: T0 */
    public RelativeLayout f21746T0;

    /* renamed from: T1 */
    public DateFormat f21747T1;

    /* renamed from: T2 */
    public String f21748T2;

    /* renamed from: U */
    public SharedPreferences f21749U;

    /* renamed from: U0 */
    public RelativeLayout f21750U0;

    /* renamed from: U1 */
    public String f21751U1;

    /* renamed from: U2 */
    public C5864q f21752U2;

    /* renamed from: V */
    public SharedPreferences f21753V;

    /* renamed from: V1 */
    public String f21755V1;

    /* renamed from: V2 */
    public C5864q f21756V2;

    /* renamed from: W */
    public SharedPreferences f21757W;

    /* renamed from: W1 */
    public String f21759W1;

    /* renamed from: W2 */
    public C5865r f21760W2;

    /* renamed from: X */
    public SimpleDateFormat f21761X;

    /* renamed from: X0 */
    public TextView f21762X0;

    /* renamed from: X1 */
    public SimpleDateFormat f21763X1;

    /* renamed from: X2 */
    public C5866s f21764X2;

    /* renamed from: Y */
    public String f21765Y;

    /* renamed from: Y0 */
    public TextView f21766Y0;

    /* renamed from: Y1 */
    public PlayerView f21767Y1;

    /* renamed from: Y2 */
    public LinearLayoutManager f21768Y2;

    /* renamed from: Z */
    public RelativeLayout f21769Z;

    /* renamed from: Z0 */
    public TextView f21770Z0;

    /* renamed from: Z1 */
    public Date f21771Z1;

    /* renamed from: Z2 */
    public LinearLayoutManager f21772Z2;

    /* renamed from: a1 */
    public TextView f21773a1;

    /* renamed from: a2 */
    public String f21774a2;

    /* renamed from: a3 */
    public int f21775a3;

    /* renamed from: b1 */
    public String f21776b1;

    /* renamed from: b2 */
    public Boolean f21777b2;

    /* renamed from: b3 */
    public Animation f21778b3;

    /* renamed from: c1 */
    public TextView f21779c1;

    /* renamed from: c2 */
    public DialogC0242a f21780c2;

    /* renamed from: c3 */
    public Animation f21781c3;

    /* renamed from: d */
    public Context f21782d;

    /* renamed from: d1 */
    public TextView f21783d1;

    /* renamed from: d2 */
    public String f21784d2;

    /* renamed from: d3 */
    public String f21785d3;

    /* renamed from: e */
    public String f21786e;

    /* renamed from: e1 */
    public TextView f21787e1;

    /* renamed from: e2 */
    public Boolean f21788e2;

    /* renamed from: e3 */
    public String f21789e3;

    @BindView
    public EditText et_search_left_side;

    /* renamed from: f */
    public View f21790f;

    /* renamed from: f1 */
    public TextView f21792f1;

    /* renamed from: f2 */
    public C9572b f21793f2;

    /* renamed from: f3 */
    public String f21794f3;

    /* renamed from: g */
    public View f21795g;

    /* renamed from: g0 */
    public TextView f21796g0;

    /* renamed from: g1 */
    public TextView f21797g1;

    /* renamed from: g2 */
    public String f21798g2;

    /* renamed from: g3 */
    public String f21799g3;

    /* renamed from: h */
    public View f21800h;

    /* renamed from: h0 */
    public ArrayList<LiveStreamCategoryIdDBModel> f21801h0;

    /* renamed from: h1 */
    public TextView f21802h1;

    /* renamed from: h2 */
    public int f21803h2;

    /* renamed from: h3 */
    public int f21804h3;

    @BindView
    public TextView header_page_title;

    /* renamed from: i */
    public String f21805i;

    /* renamed from: i0 */
    public ArrayList<LiveStreamCategoryIdDBModel> f21806i0;

    /* renamed from: i1 */
    public TextView f21807i1;

    /* renamed from: i2 */
    public int f21808i2;

    /* renamed from: i3 */
    public boolean f21809i3;

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
    public View f21810j;

    /* renamed from: j0 */
    public ArrayList<LiveStreamCategoryIdDBModel> f21811j0;

    /* renamed from: j1 */
    public TextView f21812j1;

    /* renamed from: j2 */
    public String f21813j2;

    /* renamed from: j3 */
    public boolean f21814j3;

    /* renamed from: k */
    public View f21815k;

    /* renamed from: k0 */
    public ArrayList<LiveStreamCategoryIdDBModel> f21816k0;

    /* renamed from: k1 */
    public LinearLayout f21817k1;

    /* renamed from: k2 */
    public Boolean f21818k2;

    /* renamed from: k3 */
    public MultiUserDBHandler f21819k3;

    /* renamed from: l0 */
    public ArrayList<LiveStreamCategoryIdDBModel> f21821l0;

    /* renamed from: l1 */
    public String f21822l1;

    /* renamed from: l2 */
    public AsyncTask f21823l2;

    /* renamed from: l3 */
    public Thread f21824l3;

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
    public LinearLayout f21825m;

    /* renamed from: m0 */
    public ArrayList<LiveStreamsDBModel> f21826m0;

    /* renamed from: m1 */
    public LinearLayout f21827m1;

    /* renamed from: m2 */
    public AsyncTask f21828m2;

    /* renamed from: m3 */
    public Boolean f21829m3;

    /* renamed from: n */
    public TextView f21830n;

    /* renamed from: n0 */
    public ArrayList<LiveStreamsDBModel> f21831n0;

    /* renamed from: n1 */
    public LinearLayout f21832n1;

    /* renamed from: n2 */
    public AsyncTask f21833n2;

    /* renamed from: n3 */
    public boolean f21834n3;

    /* renamed from: o */
    public ImageView f21835o;

    /* renamed from: o0 */
    public ArrayList<LiveStreamsDBModel> f21836o0;

    /* renamed from: o1 */
    public LinearLayout f21837o1;

    /* renamed from: o2 */
    public ProgressDialog f21838o2;

    /* renamed from: o3 */
    public C7562b2 f21839o3;

    /* renamed from: p */
    public TextView f21840p;

    /* renamed from: p0 */
    public ArrayList<LiveStreamsDBModel> f21841p0;

    /* renamed from: p1 */
    public LinearLayout f21842p1;

    /* renamed from: p2 */
    public boolean f21843p2;

    /* renamed from: p3 */
    public InterfaceC0854m.a f21844p3;

    /* renamed from: q */
    public TextView f21845q;

    /* renamed from: q0 */
    public ArrayList<LiveStreamsDBModel> f21846q0;

    /* renamed from: q1 */
    public LinearLayout f21847q1;

    /* renamed from: q2 */
    public int f21848q2;

    /* renamed from: q3 */
    public C9882f f21849q3;

    /* renamed from: r */
    public TextView f21850r;

    /* renamed from: r0 */
    public ArrayList<LiveStreamsDBModel> f21851r0;

    /* renamed from: r1 */
    public String f21852r1;

    /* renamed from: r2 */
    public boolean f21853r2;

    /* renamed from: r3 */
    public C9882f.d f21854r3;

    @BindView
    public RecyclerView recycler_view_left_sidebar;

    @BindView
    public RecyclerView recycler_view_left_sidebar_player;

    @BindView
    public RelativeLayout rl_episodes_box;

    @BindView
    public RelativeLayout rl_episodes_box_player;

    @BindView
    public RelativeLayout rl_search_cat;

    @BindView
    public RelativeLayout rl_settings_box;

    /* renamed from: s */
    public TextView f21855s;

    /* renamed from: s0 */
    public ArrayList<LiveStreamsDBModel> f21856s0;

    /* renamed from: s1 */
    public int f21857s1;

    /* renamed from: s2 */
    public int f21858s2;

    /* renamed from: s3 */
    public Uri f21859s3;

    @BindView
    public SeekBar sb_brightness;

    @BindView
    public SeekBar sb_volume;

    /* renamed from: t */
    public LinearLayout f21860t;

    /* renamed from: t0 */
    public ArrayList<LiveStreamsDBModel> f21861t0;

    /* renamed from: t2 */
    public int f21863t2;

    /* renamed from: t3 */
    public int f21864t3;

    @BindView
    public TextView tv_brightness;

    @BindView
    public TextView tv_episode_name;

    @BindView
    public TextView tv_volume;

    /* renamed from: u */
    public ProgressBar f21865u;

    /* renamed from: u0 */
    public ArrayList<LiveStreamsDBModel> f21866u0;

    /* renamed from: u1 */
    public DatabaseHandler f21867u1;

    /* renamed from: u2 */
    public SharedPreferences f21868u2;

    /* renamed from: u3 */
    public int f21869u3;

    /* renamed from: v */
    public LinearLayout f21870v;

    /* renamed from: v0 */
    public ArrayList<LiveStreamsDBModel> f21871v0;

    /* renamed from: v1 */
    public SharedPreferences.Editor f21872v1;

    /* renamed from: v2 */
    public SharedPreferences.Editor f21873v2;

    /* renamed from: v3 */
    public boolean f21874v3;

    /* renamed from: w */
    public LinearLayout f21875w;

    /* renamed from: w1 */
    public SharedPreferences.Editor f21877w1;

    /* renamed from: w2 */
    public Boolean f21878w2;

    /* renamed from: w3 */
    public boolean f21879w3;

    /* renamed from: x0 */
    public ArrayList<LiveStreamCategoryIdDBModel> f21881x0;

    /* renamed from: x1 */
    public TextView f21882x1;

    /* renamed from: x2 */
    public Boolean f21883x2;

    /* renamed from: x3 */
    public boolean f21884x3;

    /* renamed from: y0 */
    public ArrayList<PasswordStatusDBModel> f21886y0;

    /* renamed from: y1 */
    public String f21887y1;

    /* renamed from: y2 */
    public Boolean f21888y2;

    /* renamed from: y3 */
    public SharedPreferences f21889y3;

    /* renamed from: z0 */
    public SharedPreferences f21891z0;

    /* renamed from: z1 */
    public TextView f21892z1;

    /* renamed from: z2 */
    public Boolean f21893z2;

    /* renamed from: B3 */
    public static boolean f21663B3 = false;

    /* renamed from: E3 */
    public static final int[] f21666E3 = {0, 1, 2, 3, 4, 5};

    /* renamed from: l */
    public boolean f21820l = false;

    /* renamed from: x */
    public boolean f21880x = true;

    /* renamed from: y */
    public boolean f21885y = false;

    /* renamed from: z */
    public boolean f21890z = false;

    /* renamed from: A */
    public boolean f21669A = false;

    /* renamed from: J */
    public boolean f21705J = true;

    /* renamed from: K */
    public long f21709K = 2500;

    /* renamed from: M */
    public boolean f21717M = true;

    /* renamed from: f0 */
    public int f21791f0 = 0;

    /* renamed from: w0 */
    public ArrayList<String> f21876w0 = new ArrayList<>();

    /* renamed from: L0 */
    public boolean f21714L0 = true;

    /* renamed from: M0 */
    public boolean f21718M0 = false;

    /* renamed from: N0 */
    public boolean f21722N0 = false;

    /* renamed from: P0 */
    public boolean f21730P0 = true;

    /* renamed from: V0 */
    public String f21754V0 = "";

    /* renamed from: W0 */
    public String f21758W0 = "";

    /* renamed from: t1 */
    public String f21862t1 = "";

    /* renamed from: K1 */
    public int f21711K1 = 0;

    /* renamed from: L1 */
    public StringBuilder f21715L1 = new StringBuilder();

    /* renamed from: O1 */
    public int f21727O1 = -1;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$a.class */
    public class RunnableC3618a implements Runnable {

        /* renamed from: b */
        public final NSTEXOPlayerSkyTvActivity f21894b;

        public RunnableC3618a(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity) {
            this.f21894b = nSTEXOPlayerSkyTvActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21894b.m17903T2("", false);
            this.f21894b.f21829m3 = Boolean.TRUE;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$a0.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$a0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$a0.class */
    public class AsyncTaskC3619a0 extends AsyncTask<String, String, String> {

        /* renamed from: a */
        public final NSTEXOPlayerSkyTvActivity f21895a;

        public AsyncTaskC3619a0(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity) {
            this.f21895a = nSTEXOPlayerSkyTvActivity;
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x01ab, code lost:
        
            if (((com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel) r6.f21895a.f21836o0.get(r7)).m14816W().equals(r18) != false) goto L46;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String m17944a() {
            /*
                Method dump skipped, instructions count: 1116
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity.AsyncTaskC3619a0.m17944a():java.lang.String");
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
                    return m17944a();
                }
                if (z10) {
                    return this.f21895a.m17896Q1();
                }
                if (z10 == 2) {
                    return this.f21895a.m17928k2();
                }
                if (z10 != 3) {
                    return null;
                }
                return this.f21895a.m17904U1();
            } catch (Exception e10) {
                return "error";
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            try {
                if (this.f21895a.f21841p0 != null) {
                    if (!this.f21895a.f21735Q1.booleanValue()) {
                        this.f21895a.f21735Q1 = Boolean.TRUE;
                        if (this.f21895a.f21841p0.size() == 0) {
                            C5251a.f30008G = Boolean.FALSE;
                            this.f21895a.m17881G2();
                            this.f21895a.f21767Y1.setVisibility(8);
                            this.f21895a.f21825m.setVisibility(0);
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = this.f21895a;
                            nSTEXOPlayerSkyTvActivity.f21830n.setText(nSTEXOPlayerSkyTvActivity.getResources().getString(2132018196));
                        } else if (this.f21895a.f21856s0 != null) {
                            this.f21895a.f21856s0.clear();
                            this.f21895a.f21856s0.addAll(this.f21895a.f21841p0);
                        }
                    }
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = this.f21895a;
                    if (nSTEXOPlayerSkyTvActivity2.f21718M0 && nSTEXOPlayerSkyTvActivity2.f21722N0 && !nSTEXOPlayerSkyTvActivity2.f21726O0.equals("")) {
                        this.f21895a.f21848q2 = 0;
                        try {
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity3 = this.f21895a;
                            nSTEXOPlayerSkyTvActivity3.f21848q2 = nSTEXOPlayerSkyTvActivity3.m17930m2(nSTEXOPlayerSkyTvActivity3.f21841p0, C5255e.m26215R(this.f21895a.f21726O0));
                        } catch (NumberFormatException | Exception e10) {
                        }
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity4 = this.f21895a;
                        nSTEXOPlayerSkyTvActivity4.f21718M0 = false;
                        nSTEXOPlayerSkyTvActivity4.f21722N0 = false;
                    }
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity5 = this.f21895a;
                    nSTEXOPlayerSkyTvActivity5.m17899R2(nSTEXOPlayerSkyTvActivity5.f21841p0);
                }
            } catch (Exception e11) {
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            try {
                TextView textView = this.f21895a.f21698H0;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = this.f21895a;
                TextView textView2 = nSTEXOPlayerSkyTvActivity.f21796g0;
                if (textView2 != null) {
                    textView2.setText(nSTEXOPlayerSkyTvActivity.f21758W0);
                    this.f21895a.f21796g0.setSelected(true);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$b.class */
    public class RunnableC3620b implements Runnable {

        /* renamed from: b */
        public final String f21896b;

        /* renamed from: c */
        public final int f21897c;

        /* renamed from: d */
        public final NSTEXOPlayerSkyTvActivity f21898d;

        public RunnableC3620b(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity, String str, int i10) {
            this.f21898d = nSTEXOPlayerSkyTvActivity;
            this.f21896b = str;
            this.f21897c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity;
            String str;
            if (this.f21898d.f21755V1.equals("m3u")) {
                nSTEXOPlayerSkyTvActivity = this.f21898d;
                str = this.f21896b;
            } else {
                nSTEXOPlayerSkyTvActivity = this.f21898d;
                str = this.f21898d.f21786e + C5255e.m26214Q(((LiveStreamsDBModel) this.f21898d.f21856s0.get(this.f21897c)).m14811R()) + this.f21898d.f21765Y;
            }
            nSTEXOPlayerSkyTvActivity.f21859s3 = Uri.parse(str);
            this.f21898d.f21767Y1.m12507t(Boolean.valueOf(NSTEXOPlayerSkyTvActivity.f21663B3));
            this.f21898d.m17942y2();
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = this.f21898d;
            nSTEXOPlayerSkyTvActivity2.f21864t3 = 0;
            nSTEXOPlayerSkyTvActivity2.f21874v3 = false;
            nSTEXOPlayerSkyTvActivity2.f21683D1.removeCallbacksAndMessages(null);
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity3 = this.f21898d;
            nSTEXOPlayerSkyTvActivity3.f21681D = ((LiveStreamsDBModel) nSTEXOPlayerSkyTvActivity3.f21856s0.get(this.f21897c)).m14798E();
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity4 = this.f21898d;
            nSTEXOPlayerSkyTvActivity4.f21685E = ((LiveStreamsDBModel) nSTEXOPlayerSkyTvActivity4.f21856s0.get(this.f21897c)).m14810Q();
            this.f21898d.f21767Y1.setCurrentEpgChannelID(this.f21898d.f21681D);
            this.f21898d.f21767Y1.setCurrentChannelLogo(this.f21898d.f21685E);
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity5 = this.f21898d;
            nSTEXOPlayerSkyTvActivity5.m17924f3(nSTEXOPlayerSkyTvActivity5.f21685E);
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity6 = this.f21898d;
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity7 = this.f21898d;
            nSTEXOPlayerSkyTvActivity6.f21833n2 = new AsyncTaskC3629f0(nSTEXOPlayerSkyTvActivity7, nSTEXOPlayerSkyTvActivity7.f21681D, null).execute(new String[0]);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$b0.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$b0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$b0.class */
    public class AsyncTaskC3621b0 extends AsyncTask<String, String, String> {

        /* renamed from: a */
        public final NSTEXOPlayerSkyTvActivity f21899a;

        public AsyncTaskC3621b0(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity) {
            this.f21899a = nSTEXOPlayerSkyTvActivity;
        }

        /* JADX WARN: Removed duplicated region for block: B:65:0x0456 A[LOOP:1: B:53:0x039c->B:65:0x0456, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x03e2 A[SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String m17947a() {
            /*
                Method dump skipped, instructions count: 1172
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity.AsyncTaskC3621b0.m17947a():java.lang.String");
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            try {
                return this.f21899a.f21704I2.equals("-1") ? SharepreferenceDBHandler.m15373f(this.f21899a.f21782d).equals("m3u") ? this.f21899a.m17928k2() : this.f21899a.m17929l2() : this.f21899a.f21704I2.equals("-6") ? this.f21899a.m17904U1() : m17947a();
            } catch (Exception e10) {
                return "error";
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            try {
                if (this.f21899a.f21846q0 != null) {
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = this.f21899a;
                    nSTEXOPlayerSkyTvActivity.m17901S2(nSTEXOPlayerSkyTvActivity.f21846q0);
                    if (!this.f21899a.f21735Q1.booleanValue()) {
                        this.f21899a.f21735Q1 = Boolean.TRUE;
                        if (this.f21899a.f21846q0 == null || this.f21899a.f21846q0.size() == 0) {
                            C5251a.f30008G = Boolean.FALSE;
                            this.f21899a.m17881G2();
                        } else {
                            if (!this.f21899a.f21789e3.equals("true") && !this.f21899a.f21680C2.m31271i()) {
                                LinearLayout linearLayout = this.f21899a.ll_click_to_play;
                                if (linearLayout != null) {
                                    linearLayout.setVisibility(0);
                                }
                            }
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = this.f21899a;
                            nSTEXOPlayerSkyTvActivity2.m17887L2(nSTEXOPlayerSkyTvActivity2.f21846q0);
                        }
                    }
                }
                this.f21899a.m17940w2();
                this.f21899a.m17938u2();
                this.f21899a.m17919c2();
                this.f21899a.m17917b2();
            } catch (Exception e10) {
                this.f21899a.m17940w2();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            LinearLayout linearLayout;
            super.onPreExecute();
            try {
                RelativeLayout relativeLayout = this.f21899a.rl_episodes_box_player;
                if (relativeLayout == null || relativeLayout.getVisibility() != 0) {
                    this.f21899a.f21785d3 = "";
                } else {
                    this.f21899a.f21785d3 = "player";
                }
            } catch (Exception e10) {
            }
            this.f21899a.m17913Y2();
            if (this.f21899a.f21785d3.equals("player")) {
                if (this.f21899a.f21697H != null) {
                    this.f21899a.f21697H.setVisibility(8);
                }
                linearLayout = this.f21899a.f21706J0;
                if (linearLayout == null) {
                    return;
                }
            } else {
                if (this.f21899a.f21693G != null) {
                    this.f21899a.f21693G.setVisibility(8);
                }
                linearLayout = this.f21899a.f21702I0;
                if (linearLayout == null) {
                    return;
                }
            }
            linearLayout.setVisibility(8);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$c.class */
    public class RunnableC3622c implements Runnable {

        /* renamed from: b */
        public final NSTEXOPlayerSkyTvActivity f21900b;

        public RunnableC3622c(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity) {
            this.f21900b = nSTEXOPlayerSkyTvActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21900b.m17903T2("", false);
            this.f21900b.f21829m3 = Boolean.TRUE;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$c0.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$c0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$c0.class */
    public class ViewOnFocusChangeListenerC3623c0 implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f21901b;

        /* renamed from: c */
        public final NSTEXOPlayerSkyTvActivity f21902c;

        public ViewOnFocusChangeListenerC3623c0(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity, View view) {
            this.f21902c = nSTEXOPlayerSkyTvActivity;
            this.f21901b = view;
        }

        /* renamed from: a */
        public final void m17950a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f21901b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m17951b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f21901b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m17952c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f21901b, "scaleY", f10);
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
                View view10 = this.f21901b;
                if (view10 == null || view10.getTag() == null || !this.f21901b.getTag().equals("1")) {
                    View view11 = this.f21901b;
                    if (view11 == null || view11.getTag() == null || !this.f21901b.getTag().equals("2")) {
                        View view12 = this.f21901b;
                        if (view12 == null || view12.getTag() == null || !this.f21901b.getTag().equals("3")) {
                            View view13 = this.f21901b;
                            if ((view13 == null || view13.getTag() == null || !this.f21901b.getTag().equals("4")) && (((view6 = this.f21901b) == null || view6.getTag() == null || !this.f21901b.getTag().equals("5")) && (((view7 = this.f21901b) == null || view7.getTag() == null || !this.f21901b.getTag().equals("6")) && ((view8 = this.f21901b) == null || view8.getTag() == null || !this.f21901b.getTag().equals("7"))))) {
                                View view14 = this.f21901b;
                                if (view14 != null && view14.getTag() != null && this.f21901b.getTag().equals("8")) {
                                    return;
                                }
                                View view15 = this.f21901b;
                                if (view15 == null || view15.getTag() == null || !this.f21901b.getTag().equals("9")) {
                                    View view16 = this.f21901b;
                                    if (view16 != null && view16.getTag() != null && this.f21901b.getTag().equals("10")) {
                                        return;
                                    }
                                    View view17 = this.f21901b;
                                    if (view17 == null || view17.getTag() == null || !this.f21901b.getTag().equals("11")) {
                                        View view18 = this.f21901b;
                                        if (view18 == null || view18.getTag() == null || !this.f21901b.getTag().equals("12")) {
                                            View view19 = this.f21901b;
                                            if ((view19 == null || view19.getTag() == null || !this.f21901b.getTag().equals("13")) && ((view9 = this.f21901b) == null || view9.getTag() == null || !this.f21901b.getTag().equals("14"))) {
                                                return;
                                            }
                                        } else {
                                            resources = this.f21902c.getResources();
                                            i10 = 2131230846;
                                        }
                                    } else {
                                        resources = this.f21902c.getResources();
                                        i10 = 2131099870;
                                    }
                                    drawable = resources.getDrawable(i10);
                                }
                            }
                            drawable = this.f21902c.getResources().getDrawable(2131231461);
                        }
                        view.setBackground(this.f21902c.getResources().getDrawable(2131231460));
                        m17951b(f10);
                        m17952c(f10);
                        return;
                    }
                    view.setBackground(this.f21902c.getResources().getDrawable(2131231460));
                    m17951b(f10);
                    m17952c(f10);
                    linearLayout = this.f21902c.ll_audio_subtitle_settings;
                } else {
                    view.setBackground(this.f21902c.getResources().getDrawable(2131231460));
                    m17951b(f10);
                    m17952c(f10);
                    linearLayout = this.f21902c.ll_back;
                }
                i11 = 0;
                linearLayout.setVisibility(i11);
                return;
            }
            if (z10) {
                return;
            }
            float f11 = z10 ? 1.08f : 1.0f;
            View view20 = this.f21901b;
            if (view20 == null || view20.getTag() == null || !this.f21901b.getTag().equals("1")) {
                View view21 = this.f21901b;
                if (view21 == null || view21.getTag() == null || !this.f21901b.getTag().equals("2")) {
                    View view22 = this.f21901b;
                    if (view22 == null || view22.getTag() == null || !this.f21901b.getTag().equals("3")) {
                        View view23 = this.f21901b;
                        if ((view23 == null || view23.getTag() == null || !this.f21901b.getTag().equals("4")) && (((view2 = this.f21901b) == null || view2.getTag() == null || !this.f21901b.getTag().equals("5")) && (((view3 = this.f21901b) == null || view3.getTag() == null || !this.f21901b.getTag().equals("6")) && ((view4 = this.f21901b) == null || view4.getTag() == null || !this.f21901b.getTag().equals("7"))))) {
                            View view24 = this.f21901b;
                            if (view24 != null && view24.getTag() != null && this.f21901b.getTag().equals("8")) {
                                return;
                            }
                            View view25 = this.f21901b;
                            if (view25 == null || view25.getTag() == null || !this.f21901b.getTag().equals("9")) {
                                View view26 = this.f21901b;
                                if (view26 != null && view26.getTag() != null && this.f21901b.getTag().equals("10")) {
                                    return;
                                }
                                View view27 = this.f21901b;
                                if (view27 == null || view27.getTag() == null || !this.f21901b.getTag().equals("11")) {
                                    View view28 = this.f21901b;
                                    if (view28 == null || view28.getTag() == null || !this.f21901b.getTag().equals("12")) {
                                        View view29 = this.f21901b;
                                        if ((view29 == null || view29.getTag() == null || !this.f21901b.getTag().equals("13")) && ((view5 = this.f21901b) == null || view5.getTag() == null || !this.f21901b.getTag().equals("14"))) {
                                            return;
                                        }
                                    } else {
                                        resources = this.f21902c.getResources();
                                        i10 = 2131230845;
                                    }
                                } else {
                                    resources = this.f21902c.getResources();
                                    i10 = 2131099771;
                                }
                                drawable = resources.getDrawable(i10);
                            }
                        }
                        view.setBackground(null);
                        return;
                    }
                    view.setBackground(this.f21902c.getResources().getDrawable(2131231458));
                    m17951b(f11);
                    m17952c(f11);
                    m17950a(z10);
                    return;
                }
                view.setBackground(this.f21902c.getResources().getDrawable(2131231458));
                m17951b(f11);
                m17952c(f11);
                m17950a(z10);
                linearLayout = this.f21902c.ll_audio_subtitle_settings;
            } else {
                view.setBackground(this.f21902c.getResources().getDrawable(2131231458));
                m17951b(f11);
                m17952c(f11);
                m17950a(z10);
                linearLayout = this.f21902c.ll_back;
            }
            i11 = 8;
            linearLayout.setVisibility(i11);
            return;
            view.setBackground(drawable);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$d.class */
    public class RunnableC3624d implements Runnable {

        /* renamed from: b */
        public final String f21903b;

        /* renamed from: c */
        public final int f21904c;

        /* renamed from: d */
        public final NSTEXOPlayerSkyTvActivity f21905d;

        public RunnableC3624d(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity, String str, int i10) {
            this.f21905d = nSTEXOPlayerSkyTvActivity;
            this.f21903b = str;
            this.f21904c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity;
            String str;
            if (this.f21905d.f21755V1.equals("m3u")) {
                nSTEXOPlayerSkyTvActivity = this.f21905d;
                str = this.f21903b;
            } else {
                nSTEXOPlayerSkyTvActivity = this.f21905d;
                str = this.f21905d.f21786e + C5255e.m26214Q(((LiveStreamsDBModel) this.f21905d.f21856s0.get(this.f21904c)).m14811R()) + this.f21905d.f21765Y;
            }
            nSTEXOPlayerSkyTvActivity.f21859s3 = Uri.parse(str);
            this.f21905d.f21767Y1.m12507t(Boolean.valueOf(NSTEXOPlayerSkyTvActivity.f21663B3));
            this.f21905d.m17942y2();
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = this.f21905d;
            nSTEXOPlayerSkyTvActivity2.f21864t3 = 0;
            nSTEXOPlayerSkyTvActivity2.f21874v3 = false;
            nSTEXOPlayerSkyTvActivity2.f21683D1.removeCallbacksAndMessages(null);
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity3 = this.f21905d;
            nSTEXOPlayerSkyTvActivity3.f21681D = ((LiveStreamsDBModel) nSTEXOPlayerSkyTvActivity3.f21856s0.get(this.f21904c)).m14798E();
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity4 = this.f21905d;
            nSTEXOPlayerSkyTvActivity4.f21685E = ((LiveStreamsDBModel) nSTEXOPlayerSkyTvActivity4.f21856s0.get(this.f21904c)).m14810Q();
            this.f21905d.f21767Y1.setCurrentEpgChannelID(this.f21905d.f21681D);
            this.f21905d.f21767Y1.setCurrentChannelLogo(this.f21905d.f21685E);
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity5 = this.f21905d;
            nSTEXOPlayerSkyTvActivity5.m17924f3(nSTEXOPlayerSkyTvActivity5.f21685E);
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity6 = this.f21905d;
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity7 = this.f21905d;
            nSTEXOPlayerSkyTvActivity6.f21833n2 = new AsyncTaskC3629f0(nSTEXOPlayerSkyTvActivity7, nSTEXOPlayerSkyTvActivity7.f21681D, null).execute(new String[0]);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$d0.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$d0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$d0.class */
    public class C3625d0 implements InterfaceC4370k<C7597l1> {

        /* renamed from: a */
        public final NSTEXOPlayerSkyTvActivity f21906a;

        public C3625d0(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity) {
            this.f21906a = nSTEXOPlayerSkyTvActivity;
        }

        public /* synthetic */ C3625d0(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity, ViewOnClickListenerC3638k viewOnClickListenerC3638k) {
            this(nSTEXOPlayerSkyTvActivity);
        }

        @Override // p059d9.InterfaceC4370k
        @SuppressLint({"StringFormatInvalid"})
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Pair<Integer, String> mo15749a(C7597l1 c7597l1) {
            String string = this.f21906a.getString(2132017684);
            Throwable cause = c7597l1.getCause();
            String str = string;
            if (cause instanceof AbstractC7654o.a) {
                AbstractC7654o.a aVar = (AbstractC7654o.a) cause;
                C7653n c7653n = aVar.f37288d;
                str = c7653n == null ? aVar.getCause() instanceof C7661v.c ? this.f21906a.getString(2132017690) : aVar.f37287c ? this.f21906a.getString(2132017688, aVar.f37286b) : this.f21906a.getString(2132017687, aVar.f37286b) : this.f21906a.getString(2132017686, c7653n.f37201a);
            }
            return Pair.create(0, str);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$e.class */
    public class C3626e implements TextWatcher {

        /* renamed from: b */
        public final NSTEXOPlayerSkyTvActivity f21907b;

        public C3626e(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity) {
            this.f21907b = nSTEXOPlayerSkyTvActivity;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity;
            boolean z10;
            if (charSequence == null || charSequence.toString().length() <= 0) {
                nSTEXOPlayerSkyTvActivity = this.f21907b;
                z10 = false;
            } else {
                nSTEXOPlayerSkyTvActivity = this.f21907b;
                z10 = true;
            }
            nSTEXOPlayerSkyTvActivity.f21834n3 = z10;
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
                com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity r0 = r0.f21907b     // Catch: java.lang.Exception -> L40
                boolean r0 = com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity.m17808D1(r0)     // Catch: java.lang.Exception -> L40
                if (r0 == 0) goto L3f
            L1a:
                r0 = r3
                com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity r0 = r0.f21907b     // Catch: java.lang.Exception -> L40
                lf.q r0 = com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity.m17873y1(r0)     // Catch: java.lang.Exception -> L40
                if (r0 == 0) goto L3f
                r0 = r3
                com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity r0 = r0.f21907b     // Catch: java.lang.Exception -> L40
                lf.q r0 = com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity.m17873y1(r0)     // Catch: java.lang.Exception -> L40
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
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity.C3626e.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$e0.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$e0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$e0.class */
    public class C3627e0 implements InterfaceC7606o1.e {

        /* renamed from: b */
        public final NSTEXOPlayerSkyTvActivity f21908b;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$e0$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$e0$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$e0$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final C3627e0 f21909b;

            public a(C3627e0 c3627e0) {
                this.f21909b = c3627e0;
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = this.f21909b.f21908b;
                if (nSTEXOPlayerSkyTvActivity.f21879w3) {
                    return;
                }
                nSTEXOPlayerSkyTvActivity.f21864t3++;
                C5255e.m26241k0(nSTEXOPlayerSkyTvActivity.f21782d, this.f21909b.f21908b.f21782d.getResources().getString(2132018322) + " (" + this.f21909b.f21908b.f21864t3 + "/" + this.f21909b.f21908b.f21869u3 + ")");
                this.f21909b.f21908b.m17891N2();
                this.f21909b.f21908b.m17942y2();
            }
        }

        public C3627e0(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity) {
            this.f21908b = nSTEXOPlayerSkyTvActivity;
        }

        public /* synthetic */ C3627e0(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity, ViewOnClickListenerC3638k viewOnClickListenerC3638k) {
            this(nSTEXOPlayerSkyTvActivity);
        }

        @Override // p267p6.InterfaceC7606o1.c
        /* renamed from: A */
        public void mo12514A(C7597l1 c7597l1) {
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = this.f21908b;
            if (nSTEXOPlayerSkyTvActivity.f21879w3) {
                return;
            }
            if (c7597l1.f36854b == 1002) {
                nSTEXOPlayerSkyTvActivity.m17942y2();
            } else if (!c7597l1.toString().contains("com.google.android.exoplayer2.ext.ffmpeg.FfmpegDecoderException")) {
                m17954b();
            } else {
                C5255e.m26241k0(this.f21908b.f21782d, "Audio track issue found. Please change the audio track to none.");
                this.f21908b.m17942y2();
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
        public final void m17954b() {
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = this.f21908b;
            if (nSTEXOPlayerSkyTvActivity.f21864t3 >= nSTEXOPlayerSkyTvActivity.f21869u3) {
                m17955d(this.f21908b.f21782d.getResources().getString(2132018603));
                this.f21908b.m17891N2();
                this.f21908b.f21874v3 = false;
                NSTEXOPlayerSkyTvActivity.f21667F3.setVisibility(8);
                return;
            }
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = this.f21908b;
            if (nSTEXOPlayerSkyTvActivity2.f21879w3) {
                return;
            }
            nSTEXOPlayerSkyTvActivity2.f21874v3 = true;
            nSTEXOPlayerSkyTvActivity2.f21671A1.postDelayed(new a(this), 3000L);
        }

        @Override // p078e9.InterfaceC4683q
        /* renamed from: c */
        public /* synthetic */ void mo12529c(C4670d0 c4670d0) {
            C7612q1.m33007z(this, c4670d0);
        }

        /* renamed from: d */
        public final void m17955d(String str) {
            this.f21908b.f21825m.setVisibility(0);
            this.f21908b.f21830n.setText(str);
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
                AbstractC9886j.a m41705g = this.f21908b.f21849q3.m41705g();
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
                if (NSTEXOPlayerSkyTvActivity.m17838a2()) {
                    return;
                }
                LinearLayout linearLayout = this.f21908b.ll_pause_play;
                if (linearLayout != null && linearLayout.getVisibility() == 0) {
                    this.f21908b.ll_pause_play.setVisibility(8);
                }
                NSTEXOPlayerSkyTvActivity.f21667F3.setVisibility(0);
                return;
            }
            if (i10 == 4) {
                m17954b();
                return;
            }
            if (i10 == 3) {
                if (this.f21908b.ll_player_header_footer.getVisibility() == 0) {
                    this.f21908b.ll_pause_play.setVisibility(0);
                }
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = this.f21908b;
                nSTEXOPlayerSkyTvActivity.f21864t3 = 0;
                nSTEXOPlayerSkyTvActivity.f21790f.setVisibility(8);
                this.f21908b.f21795g.setVisibility(0);
                if (NSTEXOPlayerSkyTvActivity.f21663B3) {
                    this.f21908b.f21795g.requestFocus();
                }
                NSTEXOPlayerSkyTvActivity.f21667F3.setVisibility(8);
                LiveStreamDBHandler liveStreamDBHandler = this.f21908b.f21721N;
                if (liveStreamDBHandler != null) {
                    liveStreamDBHandler.m15194U0(C7920a.m34301l().m34309m());
                    this.f21908b.f21721N.m15237o0(C7920a.m34301l().m34309m());
                    this.f21908b.f21721N.m15184P0();
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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$f.class */
    public class RunnableC3628f implements Runnable {

        /* renamed from: b */
        public final NSTEXOPlayerSkyTvActivity f21910b;

        public RunnableC3628f(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity) {
            this.f21910b = nSTEXOPlayerSkyTvActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21910b.m17937t2();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$f0.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$f0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$f0.class */
    public class AsyncTaskC3629f0 extends AsyncTask<String, Void, HashMap<String, ArrayList<String>>> {

        /* renamed from: a */
        public String f21911a;

        /* renamed from: b */
        public final NSTEXOPlayerSkyTvActivity f21912b;

        public AsyncTaskC3629f0(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity, String str) {
            this.f21912b = nSTEXOPlayerSkyTvActivity;
            this.f21911a = str;
        }

        public /* synthetic */ AsyncTaskC3629f0(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity, String str, ViewOnClickListenerC3638k viewOnClickListenerC3638k) {
            this(nSTEXOPlayerSkyTvActivity, str);
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public HashMap<String, ArrayList<String>> doInBackground(String... strArr) {
            try {
                return this.f21912b.m17907V2(this.f21911a);
            } catch (Exception e10) {
                return new HashMap<>();
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(HashMap<String, ArrayList<String>> hashMap) {
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity;
            ArrayList<String> arrayList;
            super.onPostExecute(hashMap);
            try {
                if (hashMap.get("2") != null) {
                    ArrayList<String> arrayList2 = hashMap.get("2");
                    if (arrayList2 == null || arrayList2.get(0) == null || !arrayList2.get(0).equals("installed")) {
                        this.f21912b.f21842p1.setVisibility(0);
                        nSTEXOPlayerSkyTvActivity = this.f21912b;
                    } else if (hashMap.get("0") != null) {
                        ArrayList<String> arrayList3 = hashMap.get("0");
                        if (arrayList3 != null && arrayList3.size() > 0) {
                            LinearLayout linearLayout = this.f21912b.f21847q1;
                            if (linearLayout != null) {
                                linearLayout.setVisibility(8);
                            }
                            if (hashMap.get("3") != null && this.f21912b.f21865u != null) {
                                ArrayList<String> arrayList4 = hashMap.get("3");
                                if (arrayList4 == null || arrayList4.get(0) == null) {
                                    this.f21912b.f21865u.setProgress(0);
                                } else {
                                    this.f21912b.f21865u.setProgress(Integer.parseInt(arrayList4.get(0)));
                                }
                            }
                            try {
                                if (arrayList3.get(0) != null) {
                                    this.f21912b.f21840p.setText(arrayList3.get(0));
                                } else {
                                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = this.f21912b;
                                    nSTEXOPlayerSkyTvActivity2.f21840p.setText(nSTEXOPlayerSkyTvActivity2.f21782d.getResources().getString(2132018252));
                                }
                            } catch (Exception e10) {
                                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity3 = this.f21912b;
                                nSTEXOPlayerSkyTvActivity3.f21840p.setText(nSTEXOPlayerSkyTvActivity3.f21782d.getResources().getString(2132018252));
                            }
                            try {
                                if (arrayList3.get(1) != null) {
                                    this.f21912b.f21845q.setText(arrayList3.get(1));
                                } else {
                                    this.f21912b.f21845q.setText("");
                                }
                            } catch (Exception e11) {
                                this.f21912b.f21845q.setText("");
                            }
                            try {
                                if (arrayList3.get(3) != null) {
                                    this.f21912b.f21850r.setText(arrayList3.get(3));
                                } else {
                                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity4 = this.f21912b;
                                    nSTEXOPlayerSkyTvActivity4.f21850r.setText(nSTEXOPlayerSkyTvActivity4.f21782d.getResources().getString(2132018252));
                                }
                            } catch (Exception e12) {
                                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity5 = this.f21912b;
                                nSTEXOPlayerSkyTvActivity5.f21850r.setText(nSTEXOPlayerSkyTvActivity5.f21782d.getResources().getString(2132018252));
                            }
                            try {
                                if (arrayList3.get(4) != null) {
                                    this.f21912b.f21855s.setText(arrayList3.get(4));
                                } else {
                                    this.f21912b.f21855s.setText("");
                                }
                            } catch (Exception e13) {
                                this.f21912b.f21855s.setText("");
                            }
                            if (hashMap.get("1") != null || (arrayList = hashMap.get("1")) == null || arrayList.size() <= 0) {
                                this.f21912b.m17935r2();
                            }
                            try {
                                if (arrayList.get(0) != null) {
                                    TextView textView = this.f21912b.f21762X0;
                                    if (textView != null) {
                                        textView.setText(arrayList.get(0));
                                    }
                                } else {
                                    TextView textView2 = this.f21912b.f21762X0;
                                    if (textView2 != null) {
                                        textView2.setText("");
                                    }
                                }
                            } catch (Exception e14) {
                                TextView textView3 = this.f21912b.f21762X0;
                                if (textView3 != null) {
                                    textView3.setText("");
                                }
                            }
                            try {
                                if (arrayList.get(1) != null) {
                                    TextView textView4 = this.f21912b.f21797g1;
                                    if (textView4 != null) {
                                        textView4.setText(arrayList.get(1));
                                    }
                                } else {
                                    TextView textView5 = this.f21912b.f21797g1;
                                    if (textView5 != null) {
                                        textView5.setText("");
                                    }
                                }
                            } catch (Exception e15) {
                                TextView textView6 = this.f21912b.f21797g1;
                                if (textView6 != null) {
                                    textView6.setText("");
                                }
                            }
                            try {
                                if (arrayList.get(2) != null) {
                                    TextView textView7 = this.f21912b.f21766Y0;
                                    if (textView7 != null) {
                                        textView7.setText(arrayList.get(2));
                                    }
                                } else {
                                    TextView textView8 = this.f21912b.f21766Y0;
                                    if (textView8 != null) {
                                        textView8.setText("");
                                    }
                                }
                            } catch (Exception e16) {
                                TextView textView9 = this.f21912b.f21766Y0;
                                if (textView9 != null) {
                                    textView9.setText("");
                                }
                            }
                            TextView textView10 = this.f21912b.f21797g1;
                            if (textView10 != null) {
                                textView10.setSelected(true);
                            }
                            LinearLayout linearLayout2 = this.f21912b.f21817k1;
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(0);
                            }
                            try {
                                if (arrayList.get(3) != null) {
                                    TextView textView11 = this.f21912b.f21770Z0;
                                    if (textView11 != null) {
                                        textView11.setText(arrayList.get(3));
                                    }
                                } else {
                                    TextView textView12 = this.f21912b.f21770Z0;
                                    if (textView12 != null) {
                                        textView12.setText("");
                                    }
                                }
                            } catch (Exception e17) {
                                TextView textView13 = this.f21912b.f21770Z0;
                                if (textView13 != null) {
                                    textView13.setText("");
                                }
                            }
                            try {
                                if (arrayList.get(4) != null) {
                                    TextView textView14 = this.f21912b.f21802h1;
                                    if (textView14 != null) {
                                        textView14.setText(arrayList.get(4));
                                    }
                                } else {
                                    TextView textView15 = this.f21912b.f21802h1;
                                    if (textView15 != null) {
                                        textView15.setText("");
                                    }
                                }
                            } catch (Exception e18) {
                                TextView textView16 = this.f21912b.f21802h1;
                                if (textView16 != null) {
                                    textView16.setText("");
                                }
                            }
                            try {
                                if (arrayList.get(5) != null) {
                                    TextView textView17 = this.f21912b.f21773a1;
                                    if (textView17 != null) {
                                        textView17.setText(arrayList.get(5));
                                    }
                                } else {
                                    TextView textView18 = this.f21912b.f21773a1;
                                    if (textView18 != null) {
                                        textView18.setText("");
                                    }
                                }
                            } catch (Exception e19) {
                                TextView textView19 = this.f21912b.f21773a1;
                                if (textView19 != null) {
                                    textView19.setText("");
                                }
                            }
                            TextView textView20 = this.f21912b.f21802h1;
                            if (textView20 != null) {
                                textView20.setSelected(true);
                            }
                            LinearLayout linearLayout3 = this.f21912b.f21827m1;
                            if (linearLayout3 != null) {
                                linearLayout3.setVisibility(0);
                            }
                            try {
                                if (arrayList.get(6) != null) {
                                    TextView textView21 = this.f21912b.f21779c1;
                                    if (textView21 != null) {
                                        textView21.setText(arrayList.get(6));
                                    }
                                } else {
                                    TextView textView22 = this.f21912b.f21779c1;
                                    if (textView22 != null) {
                                        textView22.setText("");
                                    }
                                }
                            } catch (Exception e20) {
                                TextView textView23 = this.f21912b.f21779c1;
                                if (textView23 != null) {
                                    textView23.setText("");
                                }
                            }
                            try {
                                if (arrayList.get(7) != null) {
                                    TextView textView24 = this.f21912b.f21807i1;
                                    if (textView24 != null) {
                                        textView24.setText(arrayList.get(7));
                                    }
                                } else {
                                    TextView textView25 = this.f21912b.f21807i1;
                                    if (textView25 != null) {
                                        textView25.setText("");
                                    }
                                }
                            } catch (Exception e21) {
                                TextView textView26 = this.f21912b.f21807i1;
                                if (textView26 != null) {
                                    textView26.setText("");
                                }
                            }
                            try {
                                if (arrayList.get(8) != null) {
                                    TextView textView27 = this.f21912b.f21783d1;
                                    if (textView27 != null) {
                                        textView27.setText(arrayList.get(8));
                                    }
                                } else {
                                    TextView textView28 = this.f21912b.f21783d1;
                                    if (textView28 != null) {
                                        textView28.setText("");
                                    }
                                }
                            } catch (Exception e22) {
                                TextView textView29 = this.f21912b.f21783d1;
                                if (textView29 != null) {
                                    textView29.setText("");
                                }
                            }
                            TextView textView30 = this.f21912b.f21807i1;
                            if (textView30 != null) {
                                textView30.setSelected(true);
                            }
                            LinearLayout linearLayout4 = this.f21912b.f21832n1;
                            if (linearLayout4 != null) {
                                linearLayout4.setVisibility(0);
                            }
                            try {
                                if (arrayList.get(9) != null) {
                                    TextView textView31 = this.f21912b.f21787e1;
                                    if (textView31 != null) {
                                        textView31.setText(arrayList.get(9));
                                    }
                                } else {
                                    TextView textView32 = this.f21912b.f21787e1;
                                    if (textView32 != null) {
                                        textView32.setText("");
                                    }
                                }
                            } catch (Exception e23) {
                                TextView textView33 = this.f21912b.f21787e1;
                                if (textView33 != null) {
                                    textView33.setText("");
                                }
                            }
                            try {
                                if (arrayList.get(10) != null) {
                                    TextView textView34 = this.f21912b.f21812j1;
                                    if (textView34 != null) {
                                        textView34.setText(arrayList.get(10));
                                    }
                                } else {
                                    TextView textView35 = this.f21912b.f21812j1;
                                    if (textView35 != null) {
                                        textView35.setText("");
                                    }
                                }
                            } catch (Exception e24) {
                                TextView textView36 = this.f21912b.f21812j1;
                                if (textView36 != null) {
                                    textView36.setText("");
                                }
                            }
                            try {
                                if (arrayList.get(11) != null) {
                                    TextView textView37 = this.f21912b.f21792f1;
                                    if (textView37 != null) {
                                        textView37.setText(arrayList.get(11));
                                    }
                                } else {
                                    TextView textView38 = this.f21912b.f21792f1;
                                    if (textView38 != null) {
                                        textView38.setText("");
                                    }
                                }
                            } catch (Exception e25) {
                                TextView textView39 = this.f21912b.f21792f1;
                                if (textView39 != null) {
                                    textView39.setText("");
                                }
                            }
                            TextView textView40 = this.f21912b.f21812j1;
                            if (textView40 != null) {
                                textView40.setSelected(true);
                            }
                            LinearLayout linearLayout5 = this.f21912b.f21837o1;
                            if (linearLayout5 != null) {
                                linearLayout5.setVisibility(0);
                                return;
                            }
                            return;
                        }
                        nSTEXOPlayerSkyTvActivity = this.f21912b;
                    } else {
                        nSTEXOPlayerSkyTvActivity = this.f21912b;
                    }
                } else {
                    this.f21912b.f21842p1.setVisibility(0);
                    nSTEXOPlayerSkyTvActivity = this.f21912b;
                }
                nSTEXOPlayerSkyTvActivity.f21847q1.setVisibility(8);
                if (hashMap.get("1") != null) {
                }
                this.f21912b.m17935r2();
            } catch (Exception e26) {
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            try {
                this.f21912b.m17878D2();
                LinearLayout linearLayout = this.f21912b.f21817k1;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                LinearLayout linearLayout2 = this.f21912b.f21827m1;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                LinearLayout linearLayout3 = this.f21912b.f21832n1;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                }
                LinearLayout linearLayout4 = this.f21912b.f21837o1;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(8);
                }
                LinearLayout linearLayout5 = this.f21912b.f21842p1;
                if (linearLayout5 != null) {
                    linearLayout5.setVisibility(8);
                }
                LinearLayout linearLayout6 = this.f21912b.f21847q1;
                if (linearLayout6 != null) {
                    linearLayout6.setVisibility(0);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$g.class */
    public class RunnableC3630g implements Runnable {

        /* renamed from: b */
        public final NSTEXOPlayerSkyTvActivity f21913b;

        public RunnableC3630g(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity) {
            this.f21913b = nSTEXOPlayerSkyTvActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21913b.m17936s2();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$g0.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$g0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$g0.class */
    public class AsyncTaskC3631g0 extends AsyncTask<String, Void, Void> {

        /* renamed from: a */
        public final String f21914a;

        /* renamed from: b */
        public final int f21915b;

        /* renamed from: c */
        public final String f21916c;

        /* renamed from: d */
        public final String f21917d;

        /* renamed from: e */
        public final String f21918e;

        /* renamed from: f */
        public final int f21919f;

        /* renamed from: g */
        public final NSTEXOPlayerSkyTvActivity f21920g;

        public AsyncTaskC3631g0(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity, String str, int i10, String str2, String str3, String str4, int i11) {
            this.f21920g = nSTEXOPlayerSkyTvActivity;
            this.f21914a = str;
            this.f21915b = i10;
            this.f21916c = str2;
            this.f21917d = str3;
            this.f21918e = str4;
            this.f21919f = i11;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            try {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = this.f21920g;
                if (nSTEXOPlayerSkyTvActivity.f21782d == null || nSTEXOPlayerSkyTvActivity.f21760W2 == null || this.f21920g.f21867u1 == null || this.f21920g.f21752U2 == null || this.f21920g.f21693G == null) {
                    return null;
                }
                FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
                favouriteDBModel.m14767h(this.f21914a);
                favouriteDBModel.m14772m(this.f21915b);
                favouriteDBModel.m14771l(this.f21917d);
                favouriteDBModel.m14770k(this.f21916c);
                favouriteDBModel.m14774o(SharepreferenceDBHandler.m15337A(this.f21920g.f21782d));
                this.f21920g.f21867u1.m15111l(favouriteDBModel, this.f21918e);
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
                View childAt = this.f21920g.f21693G.getChildAt(this.f21919f - this.f21920g.f21693G.getFirstVisiblePosition());
                if (childAt != null) {
                    try {
                        ((ImageView) childAt.findViewById(2131428179)).setVisibility(0);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                this.f21920g.f21752U2.m4100x(1);
                this.f21920g.m17940w2();
            } catch (Exception e11) {
                this.f21920g.m17940w2();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (this.f21920g.f21838o2 == null) {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = this.f21920g;
                nSTEXOPlayerSkyTvActivity.f21838o2 = NSTEXOPlayerSkyTvActivity.m17842d2(nSTEXOPlayerSkyTvActivity.f21782d);
                if (this.f21920g.f21838o2 == null) {
                    return;
                }
            } else if (this.f21920g.f21838o2.isShowing()) {
                return;
            }
            this.f21920g.f21838o2.show();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$h.class */
    public class DialogInterfaceOnClickListenerC3632h implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final NSTEXOPlayerSkyTvActivity f21921b;

        public DialogInterfaceOnClickListenerC3632h(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity) {
            this.f21921b = nSTEXOPlayerSkyTvActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$h0.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$h0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$h0.class */
    public class AsyncTaskC3633h0 extends AsyncTask<String, Void, Void> {

        /* renamed from: a */
        public final String f21922a;

        /* renamed from: b */
        public final String f21923b;

        /* renamed from: c */
        public final String f21924c;

        /* renamed from: d */
        public final int f21925d;

        /* renamed from: e */
        public final NSTEXOPlayerSkyTvActivity f21926e;

        public AsyncTaskC3633h0(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity, String str, String str2, String str3, int i10) {
            this.f21926e = nSTEXOPlayerSkyTvActivity;
            this.f21922a = str;
            this.f21923b = str2;
            this.f21924c = str3;
            this.f21925d = i10;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            try {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = this.f21926e;
                if (nSTEXOPlayerSkyTvActivity.f21782d == null || nSTEXOPlayerSkyTvActivity.f21760W2 == null) {
                    return null;
                }
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = this.f21926e;
                if (nSTEXOPlayerSkyTvActivity2.f21721N == null || nSTEXOPlayerSkyTvActivity2.f21752U2 == null || this.f21926e.f21693G == null) {
                    return null;
                }
                FavouriteM3UModel favouriteM3UModel = new FavouriteM3UModel();
                favouriteM3UModel.m14782h(this.f21923b);
                favouriteM3UModel.m14783i(SharepreferenceDBHandler.m15337A(this.f21926e.f21782d));
                favouriteM3UModel.m14781g(this.f21924c);
                favouriteM3UModel.m14779e(this.f21922a);
                this.f21926e.f21721N.m15156D0(favouriteM3UModel);
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
                View childAt = this.f21926e.f21693G.getChildAt(this.f21925d - this.f21926e.f21693G.getFirstVisiblePosition());
                if (childAt != null) {
                    try {
                        ((ImageView) childAt.findViewById(2131428179)).setVisibility(0);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                this.f21926e.f21752U2.m4100x(1);
                this.f21926e.m17940w2();
            } catch (Exception e11) {
                this.f21926e.m17940w2();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (this.f21926e.f21838o2 == null) {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = this.f21926e;
                nSTEXOPlayerSkyTvActivity.f21838o2 = NSTEXOPlayerSkyTvActivity.m17842d2(nSTEXOPlayerSkyTvActivity.f21782d);
                if (this.f21926e.f21838o2 == null) {
                    return;
                }
            } else if (this.f21926e.f21838o2.isShowing()) {
                return;
            }
            this.f21926e.f21838o2.show();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$i.class */
    public class DialogInterfaceOnClickListenerC3634i implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final NSTEXOPlayerSkyTvActivity f21927b;

        public DialogInterfaceOnClickListenerC3634i(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity) {
            this.f21927b = nSTEXOPlayerSkyTvActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f21927b.f21782d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$i0.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$i0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$i0.class */
    public class AsyncTaskC3635i0 extends AsyncTask<String, Void, Void> {

        /* renamed from: a */
        public final String f21928a;

        /* renamed from: b */
        public final int f21929b;

        /* renamed from: c */
        public final String f21930c;

        /* renamed from: d */
        public final String f21931d;

        /* renamed from: e */
        public final int f21932e;

        /* renamed from: f */
        public final NSTEXOPlayerSkyTvActivity f21933f;

        public AsyncTaskC3635i0(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity, String str, int i10, String str2, String str3, int i11) {
            this.f21933f = nSTEXOPlayerSkyTvActivity;
            this.f21928a = str;
            this.f21929b = i10;
            this.f21930c = str2;
            this.f21931d = str3;
            this.f21932e = i11;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            try {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = this.f21933f;
                if (nSTEXOPlayerSkyTvActivity.f21782d == null || nSTEXOPlayerSkyTvActivity.f21760W2 == null || this.f21933f.f21867u1 == null || this.f21933f.f21752U2 == null || this.f21933f.f21693G == null) {
                    return null;
                }
                this.f21933f.f21867u1.m15115t(this.f21929b, this.f21928a, this.f21931d, this.f21930c, SharepreferenceDBHandler.m15337A(this.f21933f.f21782d));
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
                View childAt = this.f21933f.f21693G.getChildAt(this.f21932e - this.f21933f.f21693G.getFirstVisiblePosition());
                if (childAt != null) {
                    try {
                        ((ImageView) childAt.findViewById(2131428179)).setVisibility(4);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                this.f21933f.f21752U2.m4100x(1);
                this.f21933f.m17940w2();
            } catch (Exception e11) {
                this.f21933f.m17940w2();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (this.f21933f.f21838o2 == null) {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = this.f21933f;
                nSTEXOPlayerSkyTvActivity.f21838o2 = NSTEXOPlayerSkyTvActivity.m17842d2(nSTEXOPlayerSkyTvActivity.f21782d);
                if (this.f21933f.f21838o2 == null) {
                    return;
                }
            } else if (this.f21933f.f21838o2.isShowing()) {
                return;
            }
            this.f21933f.f21838o2.show();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$j.class */
    public class C3636j implements SearchView.InterfaceC0282l {

        /* renamed from: a */
        public final NSTEXOPlayerSkyTvActivity f21934a;

        public C3636j(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity) {
            this.f21934a = nSTEXOPlayerSkyTvActivity;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextChange(String str) {
            if (this.f21934a.f21760W2 == null) {
                return false;
            }
            this.f21934a.f21760W2.getFilter().filter(str);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$j0.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$j0 */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$j0.class */
    public class AsyncTaskC3637j0 extends AsyncTask<String, Void, Void> {

        /* renamed from: a */
        public final String f21935a;

        /* renamed from: b */
        public final int f21936b;

        /* renamed from: c */
        public final NSTEXOPlayerSkyTvActivity f21937c;

        public AsyncTaskC3637j0(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity, String str, int i10) {
            this.f21937c = nSTEXOPlayerSkyTvActivity;
            this.f21935a = str;
            this.f21936b = i10;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            try {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = this.f21937c;
                if (nSTEXOPlayerSkyTvActivity.f21782d == null || nSTEXOPlayerSkyTvActivity.f21760W2 == null) {
                    return null;
                }
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = this.f21937c;
                if (nSTEXOPlayerSkyTvActivity2.f21721N == null || nSTEXOPlayerSkyTvActivity2.f21752U2 == null || this.f21937c.f21693G == null) {
                    return null;
                }
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity3 = this.f21937c;
                nSTEXOPlayerSkyTvActivity3.f21721N.m15188R0(this.f21935a, SharepreferenceDBHandler.m15337A(nSTEXOPlayerSkyTvActivity3.f21782d));
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
                View childAt = this.f21937c.f21693G.getChildAt(this.f21936b - this.f21937c.f21693G.getFirstVisiblePosition());
                if (childAt != null) {
                    try {
                        ((ImageView) childAt.findViewById(2131428179)).setVisibility(4);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                this.f21937c.f21752U2.m4100x(1);
                this.f21937c.m17940w2();
            } catch (Exception e11) {
                this.f21937c.m17940w2();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (this.f21937c.f21838o2 == null) {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = this.f21937c;
                nSTEXOPlayerSkyTvActivity.f21838o2 = NSTEXOPlayerSkyTvActivity.m17842d2(nSTEXOPlayerSkyTvActivity.f21782d);
                if (this.f21937c.f21838o2 == null) {
                    return;
                }
            } else if (this.f21937c.f21838o2.isShowing()) {
                return;
            }
            this.f21937c.f21838o2.show();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$k.class */
    public class ViewOnClickListenerC3638k implements View.OnClickListener {

        /* renamed from: b */
        public final NSTEXOPlayerSkyTvActivity f21938b;

        public ViewOnClickListenerC3638k(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity) {
            this.f21938b = nSTEXOPlayerSkyTvActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f21938b.m17926h2();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$l.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$l.class */
    public class DialogC3639l extends Dialog implements View.OnClickListener {

        /* renamed from: b */
        public Activity f21939b;

        /* renamed from: c */
        public TextView f21940c;

        /* renamed from: d */
        public TextView f21941d;

        /* renamed from: e */
        public TextView f21942e;

        /* renamed from: f */
        public LinearLayout f21943f;

        /* renamed from: g */
        public LinearLayout f21944g;

        /* renamed from: h */
        public final NSTEXOPlayerSkyTvActivity f21945h;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$l$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$l$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$l$a.class */
        public class a implements View.OnFocusChangeListener {

            /* renamed from: b */
            public View f21946b;

            /* renamed from: c */
            public final DialogC3639l f21947c;

            public a(DialogC3639l dialogC3639l, View view) {
                this.f21947c = dialogC3639l;
                this.f21946b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z10) {
                int i10;
                LinearLayout linearLayout;
                if (z10) {
                    View view2 = this.f21946b;
                    i10 = 2131230846;
                    if (view2 == null || view2.getTag() == null || !this.f21946b.getTag().equals("1")) {
                        View view3 = this.f21946b;
                        if (view3 == null || view3.getTag() == null || !this.f21946b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f21947c.f21944g;
                    }
                    linearLayout = this.f21947c.f21943f;
                } else {
                    View view4 = this.f21946b;
                    i10 = 2131230845;
                    if (view4 == null || view4.getTag() == null || !this.f21946b.getTag().equals("1")) {
                        View view5 = this.f21946b;
                        if (view5 == null || view5.getTag() == null || !this.f21946b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f21947c.f21944g;
                    }
                    linearLayout = this.f21947c.f21943f;
                }
                linearLayout.setBackgroundResource(i10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogC3639l(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity, Activity activity) {
            super(activity);
            this.f21945h = nSTEXOPlayerSkyTvActivity;
            this.f21939b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity;
            int id2 = view.getId();
            if (id2 == 2131427653) {
                dismiss();
            } else if (id2 == 2131427681) {
                try {
                    if (this.f21945h.f21838o2 == null) {
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = this.f21945h;
                        nSTEXOPlayerSkyTvActivity2.f21838o2 = NSTEXOPlayerSkyTvActivity.m17842d2(nSTEXOPlayerSkyTvActivity2.f21782d);
                        if (this.f21945h.f21838o2 != null) {
                            nSTEXOPlayerSkyTvActivity = this.f21945h;
                            nSTEXOPlayerSkyTvActivity.f21838o2.show();
                        }
                        this.f21945h.f21721N.m15172J0();
                        this.f21945h.m17877C2("-6");
                        this.f21945h.f21752U2.m4099w();
                        this.f21945h.m17940w2();
                    } else {
                        if (!this.f21945h.f21838o2.isShowing()) {
                            nSTEXOPlayerSkyTvActivity = this.f21945h;
                            nSTEXOPlayerSkyTvActivity.f21838o2.show();
                        }
                        this.f21945h.f21721N.m15172J0();
                        this.f21945h.m17877C2("-6");
                        this.f21945h.f21752U2.m4099w();
                        this.f21945h.m17940w2();
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
                if (this.f21945h.f21680C2.m31288z().equals(C5251a.f30065s0)) {
                    setContentView(2131624128);
                } else {
                    setContentView(2131624127);
                }
                this.f21940c = (TextView) findViewById(2131427681);
                this.f21941d = (TextView) findViewById(2131427653);
                this.f21943f = (LinearLayout) findViewById(2131428448);
                this.f21944g = (LinearLayout) findViewById(2131428541);
                TextView textView = (TextView) findViewById(2131429644);
                this.f21942e = textView;
                textView.setText(this.f21945h.getResources().getString(2132018828));
                this.f21940c.setOnClickListener(this);
                this.f21941d.setOnClickListener(this);
                TextView textView2 = this.f21940c;
                textView2.setOnFocusChangeListener(new a(this, textView2));
                TextView textView3 = this.f21941d;
                textView3.setOnFocusChangeListener(new a(this, textView3));
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$m.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$m */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$m.class */
    public class DialogInterfaceOnClickListenerC3640m implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final NSTEXOPlayerSkyTvActivity f21948b;

        public DialogInterfaceOnClickListenerC3640m(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity) {
            this.f21948b = nSTEXOPlayerSkyTvActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            this.f21948b.m17891N2();
            C5255e.m26210M(this.f21948b.f21782d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$n.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$n */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$n.class */
    public class DialogInterfaceOnClickListenerC3641n implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final NSTEXOPlayerSkyTvActivity f21949b;

        public DialogInterfaceOnClickListenerC3641n(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity) {
            this.f21949b = nSTEXOPlayerSkyTvActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$o.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$o */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$o.class */
    public class RunnableC3642o implements Runnable {

        /* renamed from: b */
        public final LinearLayout f21950b;

        /* renamed from: c */
        public final NSTEXOPlayerSkyTvActivity f21951c;

        public RunnableC3642o(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity, LinearLayout linearLayout) {
            this.f21951c = nSTEXOPlayerSkyTvActivity;
            this.f21950b = linearLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            LinearLayout linearLayout;
            this.f21950b.setVisibility(8);
            if (this.f21951c.ll_player_header_footer.getVisibility() != 0 || (linearLayout = this.f21951c.ll_pause_play) == null) {
                return;
            }
            linearLayout.setVisibility(0);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$p.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$p */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$p.class */
    public class ViewOnClickListenerC3643p implements View.OnClickListener {

        /* renamed from: b */
        public final NSTEXOPlayerSkyTvActivity f21952b;

        public ViewOnClickListenerC3643p(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity) {
            this.f21952b = nSTEXOPlayerSkyTvActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                this.f21952b.f21777b2 = Boolean.TRUE;
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", this.f21952b.getPackageName(), null));
                this.f21952b.startActivityForResult(intent, 101);
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = this.f21952b;
                Toast.makeText(nSTEXOPlayerSkyTvActivity, nSTEXOPlayerSkyTvActivity.f21782d.getResources().getString(2132017828), 1).show();
            } catch (Exception e10) {
            }
            this.f21952b.f21780c2.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$q.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$q */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$q.class */
    public class DialogC3644q extends Dialog implements View.OnClickListener {

        /* renamed from: b */
        public Activity f21953b;

        /* renamed from: c */
        public TextView f21954c;

        /* renamed from: d */
        public TextView f21955d;

        /* renamed from: e */
        public LinearLayout f21956e;

        /* renamed from: f */
        public LinearLayout f21957f;

        /* renamed from: g */
        public RadioGroup f21958g;

        /* renamed from: h */
        public final Activity f21959h;

        /* renamed from: i */
        public final NSTEXOPlayerSkyTvActivity f21960i;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$q$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$q$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$q$a.class */
        public class a implements View.OnFocusChangeListener {

            /* renamed from: b */
            public View f21961b;

            /* renamed from: c */
            public final DialogC3644q f21962c;

            public a(DialogC3644q dialogC3644q, View view) {
                this.f21962c = dialogC3644q;
                this.f21961b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z10) {
                int i10;
                LinearLayout linearLayout;
                if (z10) {
                    View view2 = this.f21961b;
                    i10 = 2131230846;
                    if (view2 == null || view2.getTag() == null || !this.f21961b.getTag().equals("1")) {
                        View view3 = this.f21961b;
                        if (view3 == null || view3.getTag() == null || !this.f21961b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f21962c.f21957f;
                    }
                    linearLayout = this.f21962c.f21956e;
                } else {
                    View view4 = this.f21961b;
                    i10 = 2131230845;
                    if (view4 == null || view4.getTag() == null || !this.f21961b.getTag().equals("1")) {
                        View view5 = this.f21961b;
                        if (view5 == null || view5.getTag() == null || !this.f21961b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = this.f21962c.f21957f;
                    }
                    linearLayout = this.f21962c.f21956e;
                }
                linearLayout.setBackgroundResource(i10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogC3644q(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity, Activity activity, Activity activity2) {
            super(activity);
            this.f21960i = nSTEXOPlayerSkyTvActivity;
            this.f21959h = activity2;
            this.f21953b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id2 = view.getId();
            if (id2 == 2131427653) {
                dismiss();
            } else if (id2 == 2131427681) {
                try {
                    RadioButton radioButton = (RadioButton) findViewById(this.f21958g.getCheckedRadioButtonId());
                    SharepreferenceDBHandler.m15357U(radioButton.getText().toString().equals(this.f21959h.getResources().getString(2132018611)) ? "1" : radioButton.getText().toString().equals(this.f21959h.getResources().getString(2132018607)) ? "2" : radioButton.getText().toString().equals(this.f21959h.getResources().getString(2132018615)) ? "3" : radioButton.getText().toString().equals(this.f21959h.getResources().getString(2132018608)) ? "4" : radioButton.getText().toString().equals(this.f21959h.getResources().getString(2132018609)) ? "5" : "0", this.f21959h);
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = this.f21960i;
                    nSTEXOPlayerSkyTvActivity.m17877C2(nSTEXOPlayerSkyTvActivity.f21704I2);
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
                this.f21954c = (TextView) findViewById(2131427681);
                this.f21955d = (TextView) findViewById(2131427653);
                this.f21955d = (TextView) findViewById(2131427653);
                this.f21956e = (LinearLayout) findViewById(2131428448);
                this.f21957f = (LinearLayout) findViewById(2131428541);
                this.f21958g = (RadioGroup) findViewById(2131428935);
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
                String m15387m = SharepreferenceDBHandler.m15387m(this.f21959h);
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
                this.f21954c.setOnClickListener(this);
                this.f21955d.setOnClickListener(this);
                TextView textView = this.f21954c;
                textView.setOnFocusChangeListener(new a(this, textView));
                TextView textView2 = this.f21955d;
                textView2.setOnFocusChangeListener(new a(this, textView2));
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$r.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$r */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$r.class */
    public class ViewOnClickListenerC3645r implements View.OnClickListener {

        /* renamed from: b */
        public final NSTEXOPlayerSkyTvActivity f21963b;

        public ViewOnClickListenerC3645r(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity) {
            this.f21963b = nSTEXOPlayerSkyTvActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f21963b.f21780c2.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$s.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$s */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$s.class */
    public class RunnableC3646s implements Runnable {

        /* renamed from: b */
        public final NSTEXOPlayerSkyTvActivity f21964b;

        public RunnableC3646s(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity) {
            this.f21964b = nSTEXOPlayerSkyTvActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String date = Calendar.getInstance().getTime().toString();
                String m26199B = C5255e.m26199B(this.f21964b.f21782d);
                String m26249p = C5255e.m26249p(date);
                TextView textView = this.f21964b.f21892z1;
                if (textView != null) {
                    textView.setText(m26199B);
                }
                TextView textView2 = this.f21964b.f21882x1;
                if (textView2 != null) {
                    textView2.setText(m26249p);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$t.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$t */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$t.class */
    public class C3647t implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        public final ArrayList f21965b;

        /* renamed from: c */
        public final NSTEXOPlayerSkyTvActivity f21966c;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$t$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$t$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$t$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final C3647t f21967b;

            public a(C3647t c3647t) {
                this.f21967b = c3647t;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f21967b.f21966c.m17936s2();
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$t$b.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$t$b */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$t$b.class */
        public class b implements Runnable {

            /* renamed from: b */
            public final C3647t f21968b;

            public b(C3647t c3647t) {
                this.f21968b = c3647t;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f21968b.f21966c.m17903T2("", false);
                this.f21968b.f21966c.f21829m3 = Boolean.TRUE;
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$t$c.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$t$c */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$t$c.class */
        public class c implements Runnable {

            /* renamed from: b */
            public final C3647t f21969b;

            public c(C3647t c3647t) {
                this.f21969b = c3647t;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f21969b.f21966c.m17903T2("", false);
                this.f21969b.f21966c.f21829m3 = Boolean.TRUE;
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$t$d.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$t$d */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$t$d.class */
        public class d implements Runnable {

            /* renamed from: b */
            public final C3647t f21970b;

            public d(C3647t c3647t) {
                this.f21970b = c3647t;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f21970b.f21966c.m17903T2("", false);
                this.f21970b.f21966c.f21829m3 = Boolean.TRUE;
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$t$e.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$t$e */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$t$e.class */
        public class e implements Runnable {

            /* renamed from: b */
            public final C3647t f21971b;

            public e(C3647t c3647t) {
                this.f21971b = c3647t;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f21971b.f21966c.m17903T2("", false);
                this.f21971b.f21966c.f21829m3 = Boolean.TRUE;
            }
        }

        public C3647t(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity, ArrayList arrayList) {
            this.f21966c = nSTEXOPlayerSkyTvActivity;
            this.f21965b = arrayList;
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x0f03  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0f4f  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0f7e  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0fad  */
        @Override // android.widget.AdapterView.OnItemClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onItemClick(android.widget.AdapterView<?> r6, android.view.View r7, int r8, long r9) {
            /*
                Method dump skipped, instructions count: 4060
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity.C3647t.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$u.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$u */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$u.class */
    public class C3648u implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        public final NSTEXOPlayerSkyTvActivity f21972b;

        public C3648u(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity) {
            this.f21972b = nSTEXOPlayerSkyTvActivity;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity;
            AsyncTask<String, Void, HashMap<String, ArrayList<String>>> execute;
            try {
                if (this.f21972b.f21833n2 != null && this.f21972b.f21833n2.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    this.f21972b.f21833n2.cancel(true);
                }
                ArrayList<LiveStreamsDBModel> m28603g = this.f21972b.f21760W2.m28603g();
                if (m28603g != null && m28603g.size() > 0) {
                    String m14798E = m28603g.get(i10).m14798E();
                    this.f21972b.f21679C1.removeCallbacksAndMessages(null);
                    nSTEXOPlayerSkyTvActivity = this.f21972b;
                    execute = new AsyncTaskC3629f0(this.f21972b, m14798E, null).execute(new String[0]);
                } else {
                    if (this.f21972b.f21846q0 == null || this.f21972b.f21846q0.size() <= 0) {
                        return;
                    }
                    String m14798E2 = ((LiveStreamsDBModel) this.f21972b.f21846q0.get(i10)).m14798E();
                    this.f21972b.f21679C1.removeCallbacksAndMessages(null);
                    nSTEXOPlayerSkyTvActivity = this.f21972b;
                    execute = new AsyncTaskC3629f0(this.f21972b, m14798E2, null).execute(new String[0]);
                }
                nSTEXOPlayerSkyTvActivity.f21833n2 = execute;
            } catch (Exception e10) {
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$v.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$v */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$v.class */
    public class C3649v implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        public final ArrayList f21973b;

        /* renamed from: c */
        public final NSTEXOPlayerSkyTvActivity f21974c;

        public C3649v(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity, ArrayList arrayList) {
            this.f21974c = nSTEXOPlayerSkyTvActivity;
            this.f21973b = arrayList;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity;
            LinearLayout linearLayout = this.f21974c.ll_click_to_play;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            try {
                if (this.f21974c.f21833n2 != null && this.f21974c.f21833n2.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    this.f21974c.f21833n2.cancel(true);
                }
                C5251a.f30008G = Boolean.TRUE;
                ArrayList<LiveStreamsDBModel> m28603g = this.f21974c.f21760W2.m28603g();
                if (m28603g == null || m28603g.size() <= 0) {
                    if (this.f21974c.f21846q0 == null || this.f21974c.f21846q0.size() <= 0) {
                        return;
                    }
                    C5255e.m26215R(((LiveStreamsDBModel) this.f21974c.f21846q0.get(i10)).m14805L());
                    String m14798E = ((LiveStreamsDBModel) this.f21974c.f21846q0.get(i10)).m14798E();
                    String m14810Q = ((LiveStreamsDBModel) this.f21974c.f21846q0.get(i10)).m14810Q();
                    String m14816W = ((LiveStreamsDBModel) this.f21974c.f21846q0.get(i10)).m14816W();
                    if (this.f21974c.f21755V1.equals("m3u")) {
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = this.f21974c;
                        if (!nSTEXOPlayerSkyTvActivity2.f21862t1.equals(((LiveStreamsDBModel) nSTEXOPlayerSkyTvActivity2.f21846q0.get(i10)).m14816W())) {
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity3 = this.f21974c;
                            nSTEXOPlayerSkyTvActivity3.f21754V0 = nSTEXOPlayerSkyTvActivity3.f21704I2;
                            this.f21974c.f21767Y1.setCurrentWindowIndex(i10);
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity4 = this.f21974c;
                            nSTEXOPlayerSkyTvActivity4.f21696G2 = C5255e.m26215R(((LiveStreamsDBModel) nSTEXOPlayerSkyTvActivity4.f21846q0.get(i10)).m14805L());
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity5 = this.f21974c;
                            nSTEXOPlayerSkyTvActivity5.f21700H2 = ((LiveStreamsDBModel) nSTEXOPlayerSkyTvActivity5.f21846q0.get(i10)).m14827g();
                            if (this.f21974c.f21856s0 != null) {
                                this.f21974c.f21856s0.clear();
                                this.f21974c.f21856s0.addAll(this.f21973b);
                            }
                            this.f21974c.f21767Y1.setTitle(((LiveStreamsDBModel) this.f21974c.f21846q0.get(i10)).m14805L() + " - " + ((LiveStreamsDBModel) this.f21974c.f21846q0.get(i10)).getName());
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity6 = this.f21974c;
                            nSTEXOPlayerSkyTvActivity6.f21862t1 = ((LiveStreamsDBModel) nSTEXOPlayerSkyTvActivity6.f21846q0.get(i10)).m14816W();
                            C7920a.m34301l().m34317z(this.f21974c.f21862t1);
                            if (!this.f21974c.f21754V0.equals("-1") && !this.f21974c.f21754V0.equals("0") && !this.f21974c.f21754V0.equals("-6")) {
                                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity7 = this.f21974c;
                                nSTEXOPlayerSkyTvActivity7.f21754V0 = ((LiveStreamsDBModel) nSTEXOPlayerSkyTvActivity7.f21846q0.get(i10)).m14827g();
                                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity8 = this.f21974c;
                                nSTEXOPlayerSkyTvActivity8.f21758W0 = ((LiveStreamsDBModel) nSTEXOPlayerSkyTvActivity8.f21846q0.get(i10)).m14830i();
                                if (this.f21974c.f21758W0.isEmpty()) {
                                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity9 = this.f21974c;
                                    nSTEXOPlayerSkyTvActivity9.f21758W0 = nSTEXOPlayerSkyTvActivity9.m17910X1(nSTEXOPlayerSkyTvActivity9.f21754V0);
                                }
                            }
                            this.f21974c.f21711K1 = i10;
                            this.f21974c.f21767Y1.m12488B();
                            if (this.f21974c.f21788e2.booleanValue()) {
                                this.f21974c.f21859s3 = Uri.parse(m14816W);
                                this.f21974c.f21767Y1.m12507t(Boolean.valueOf(NSTEXOPlayerSkyTvActivity.f21663B3));
                                this.f21974c.m17942y2();
                                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity10 = this.f21974c;
                                nSTEXOPlayerSkyTvActivity10.f21864t3 = 0;
                                nSTEXOPlayerSkyTvActivity10.f21874v3 = false;
                            }
                            this.f21974c.f21683D1.removeCallbacksAndMessages(null);
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity11 = this.f21974c;
                            nSTEXOPlayerSkyTvActivity11.f21681D = m14798E;
                            nSTEXOPlayerSkyTvActivity11.f21685E = m14810Q;
                            nSTEXOPlayerSkyTvActivity11.f21767Y1.setCurrentEpgChannelID(this.f21974c.f21681D);
                            this.f21974c.f21767Y1.setCurrentChannelLogo(this.f21974c.f21685E);
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity12 = this.f21974c;
                            nSTEXOPlayerSkyTvActivity12.m17924f3(nSTEXOPlayerSkyTvActivity12.f21685E);
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity13 = this.f21974c;
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity14 = this.f21974c;
                            nSTEXOPlayerSkyTvActivity13.f21833n2 = new AsyncTaskC3629f0(nSTEXOPlayerSkyTvActivity14, nSTEXOPlayerSkyTvActivity14.f21681D, null).execute(new String[0]);
                            this.f21974c.f21679C1.removeCallbacksAndMessages(null);
                            if (this.f21974c.f21872v1 != null) {
                                this.f21974c.f21872v1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(((LiveStreamsDBModel) this.f21974c.f21846q0.get(i10)).m14816W()));
                                this.f21974c.f21872v1.apply();
                            }
                            if (this.f21974c.f21877w1 != null) {
                                this.f21974c.f21877w1.putInt("currentlyPlayingVideoPosition", i10);
                                this.f21974c.f21877w1.apply();
                            }
                            nSTEXOPlayerSkyTvActivity = this.f21974c;
                            nSTEXOPlayerSkyTvActivity.f21760W2.notifyDataSetChanged();
                            return;
                        }
                        this.f21974c.m17926h2();
                    }
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity15 = this.f21974c;
                    if (nSTEXOPlayerSkyTvActivity15.f21857s1 != C5255e.m26214Q(((LiveStreamsDBModel) nSTEXOPlayerSkyTvActivity15.f21846q0.get(i10)).m14811R())) {
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity16 = this.f21974c;
                        nSTEXOPlayerSkyTvActivity16.f21754V0 = nSTEXOPlayerSkyTvActivity16.f21704I2;
                        this.f21974c.f21767Y1.setCurrentWindowIndex(i10);
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity17 = this.f21974c;
                        nSTEXOPlayerSkyTvActivity17.f21696G2 = C5255e.m26215R(((LiveStreamsDBModel) nSTEXOPlayerSkyTvActivity17.f21846q0.get(i10)).m14805L());
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity18 = this.f21974c;
                        nSTEXOPlayerSkyTvActivity18.f21700H2 = ((LiveStreamsDBModel) nSTEXOPlayerSkyTvActivity18.f21846q0.get(i10)).m14827g();
                        if (this.f21974c.f21856s0 != null) {
                            this.f21974c.f21856s0.clear();
                            this.f21974c.f21856s0.addAll(this.f21973b);
                        }
                        this.f21974c.f21767Y1.setTitle(((LiveStreamsDBModel) this.f21974c.f21846q0.get(i10)).m14805L() + " - " + ((LiveStreamsDBModel) this.f21974c.f21846q0.get(i10)).getName());
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity19 = this.f21974c;
                        nSTEXOPlayerSkyTvActivity19.f21857s1 = C5255e.m26214Q(((LiveStreamsDBModel) nSTEXOPlayerSkyTvActivity19.f21846q0.get(i10)).m14811R());
                        C7920a.m34301l().m34317z(String.valueOf(this.f21974c.f21857s1));
                        if (!this.f21974c.f21754V0.equals("-1") && !this.f21974c.f21754V0.equals("0") && !this.f21974c.f21754V0.equals("-6")) {
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity20 = this.f21974c;
                            nSTEXOPlayerSkyTvActivity20.f21754V0 = ((LiveStreamsDBModel) nSTEXOPlayerSkyTvActivity20.f21846q0.get(i10)).m14827g();
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity21 = this.f21974c;
                            nSTEXOPlayerSkyTvActivity21.f21758W0 = ((LiveStreamsDBModel) nSTEXOPlayerSkyTvActivity21.f21846q0.get(i10)).m14830i();
                            if (this.f21974c.f21758W0.isEmpty()) {
                                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity22 = this.f21974c;
                                nSTEXOPlayerSkyTvActivity22.f21758W0 = nSTEXOPlayerSkyTvActivity22.m17910X1(nSTEXOPlayerSkyTvActivity22.f21754V0);
                            }
                        }
                        this.f21974c.f21711K1 = i10;
                        this.f21974c.f21767Y1.m12488B();
                        if (this.f21974c.f21788e2.booleanValue()) {
                            this.f21974c.f21859s3 = Uri.parse(this.f21974c.f21786e + C5255e.m26214Q(((LiveStreamsDBModel) this.f21974c.f21846q0.get(i10)).m14811R()) + this.f21974c.f21765Y);
                            this.f21974c.f21767Y1.m12507t(Boolean.valueOf(NSTEXOPlayerSkyTvActivity.f21663B3));
                            this.f21974c.m17942y2();
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity23 = this.f21974c;
                            nSTEXOPlayerSkyTvActivity23.f21864t3 = 0;
                            nSTEXOPlayerSkyTvActivity23.f21874v3 = false;
                        }
                        this.f21974c.f21683D1.removeCallbacksAndMessages(null);
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity24 = this.f21974c;
                        nSTEXOPlayerSkyTvActivity24.f21681D = m14798E;
                        nSTEXOPlayerSkyTvActivity24.f21685E = m14810Q;
                        nSTEXOPlayerSkyTvActivity24.f21767Y1.setCurrentEpgChannelID(this.f21974c.f21681D);
                        this.f21974c.f21767Y1.setCurrentChannelLogo(this.f21974c.f21685E);
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity25 = this.f21974c;
                        nSTEXOPlayerSkyTvActivity25.m17924f3(nSTEXOPlayerSkyTvActivity25.f21685E);
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity26 = this.f21974c;
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity27 = this.f21974c;
                        nSTEXOPlayerSkyTvActivity26.f21833n2 = new AsyncTaskC3629f0(nSTEXOPlayerSkyTvActivity27, nSTEXOPlayerSkyTvActivity27.f21681D, null).execute(new String[0]);
                        this.f21974c.f21679C1.removeCallbacksAndMessages(null);
                        if (this.f21974c.f21872v1 != null) {
                            this.f21974c.f21872v1.putString("currentlyPlayingVideo", String.valueOf(((LiveStreamsDBModel) this.f21974c.f21846q0.get(i10)).m14811R()));
                            this.f21974c.f21872v1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(((LiveStreamsDBModel) this.f21974c.f21846q0.get(i10)).m14816W()));
                            this.f21974c.f21872v1.apply();
                        }
                        if (this.f21974c.f21877w1 != null) {
                            this.f21974c.f21877w1.putInt("currentlyPlayingVideoPosition", i10);
                            this.f21974c.f21877w1.apply();
                        }
                        nSTEXOPlayerSkyTvActivity = this.f21974c;
                        nSTEXOPlayerSkyTvActivity.f21760W2.notifyDataSetChanged();
                        return;
                    }
                    this.f21974c.m17926h2();
                }
                int m26215R = C5255e.m26215R(m28603g.get(i10).m14805L());
                String m14798E2 = m28603g.get(i10).m14798E();
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity28 = this.f21974c;
                nSTEXOPlayerSkyTvActivity28.m17930m2(nSTEXOPlayerSkyTvActivity28.f21846q0, m26215R);
                String m14816W2 = m28603g.get(i10).m14816W();
                if (this.f21974c.f21755V1.equals("m3u")) {
                    if (!this.f21974c.f21862t1.equals(m28603g.get(i10).m14816W())) {
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity29 = this.f21974c;
                        nSTEXOPlayerSkyTvActivity29.f21754V0 = nSTEXOPlayerSkyTvActivity29.f21704I2;
                        this.f21974c.f21767Y1.setCurrentWindowIndex(i10);
                        this.f21974c.f21696G2 = C5255e.m26215R(m28603g.get(i10).m14805L());
                        this.f21974c.f21700H2 = m28603g.get(i10).m14827g();
                        if (this.f21974c.f21856s0 != null) {
                            this.f21974c.f21856s0.clear();
                            this.f21974c.f21856s0.addAll(this.f21973b);
                        }
                        this.f21974c.f21767Y1.setTitle(m28603g.get(i10).m14805L() + " - " + m28603g.get(i10).getName());
                        this.f21974c.f21862t1 = m28603g.get(i10).m14816W();
                        C7920a.m34301l().m34317z(this.f21974c.f21862t1);
                        if (!this.f21974c.f21754V0.equals("-1") && !this.f21974c.f21754V0.equals("0") && !this.f21974c.f21754V0.equals("-6")) {
                            this.f21974c.f21754V0 = m28603g.get(i10).m14827g();
                            this.f21974c.f21758W0 = m28603g.get(i10).m14830i();
                            if (this.f21974c.f21758W0.isEmpty()) {
                                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity30 = this.f21974c;
                                nSTEXOPlayerSkyTvActivity30.f21758W0 = nSTEXOPlayerSkyTvActivity30.m17910X1(nSTEXOPlayerSkyTvActivity30.f21754V0);
                            }
                        }
                        String m14810Q2 = m28603g.get(i10).m14810Q();
                        try {
                            if (m14810Q2.equals("") || m14810Q2.isEmpty()) {
                                this.f21974c.f21835o.setImageDrawable(this.f21974c.f21782d.getResources().getDrawable(2131231571));
                            } else {
                                C10014t.m42105q(this.f21974c.f21782d).m42116l(m14810Q2).m42154j(2131231571).m42148d(2131231571).m42151g(this.f21974c.f21835o);
                            }
                        } catch (Exception e10) {
                            this.f21974c.f21835o.setImageDrawable(this.f21974c.f21782d.getResources().getDrawable(2131231571));
                        }
                        this.f21974c.f21683D1.removeCallbacksAndMessages(null);
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity31 = this.f21974c;
                        nSTEXOPlayerSkyTvActivity31.f21681D = m14798E2;
                        nSTEXOPlayerSkyTvActivity31.f21685E = m14810Q2;
                        nSTEXOPlayerSkyTvActivity31.f21767Y1.setCurrentEpgChannelID(this.f21974c.f21681D);
                        this.f21974c.f21767Y1.setCurrentChannelLogo(this.f21974c.f21685E);
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity32 = this.f21974c;
                        nSTEXOPlayerSkyTvActivity32.m17924f3(nSTEXOPlayerSkyTvActivity32.f21685E);
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity33 = this.f21974c;
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity34 = this.f21974c;
                        nSTEXOPlayerSkyTvActivity33.f21833n2 = new AsyncTaskC3629f0(nSTEXOPlayerSkyTvActivity34, nSTEXOPlayerSkyTvActivity34.f21681D, null).execute(new String[0]);
                        this.f21974c.f21679C1.removeCallbacksAndMessages(null);
                        this.f21974c.f21711K1 = i10;
                        this.f21974c.f21767Y1.m12488B();
                        if (this.f21974c.f21788e2.booleanValue()) {
                            this.f21974c.f21859s3 = Uri.parse(m14816W2);
                            this.f21974c.f21767Y1.m12507t(Boolean.valueOf(NSTEXOPlayerSkyTvActivity.f21663B3));
                            this.f21974c.m17942y2();
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity35 = this.f21974c;
                            nSTEXOPlayerSkyTvActivity35.f21864t3 = 0;
                            nSTEXOPlayerSkyTvActivity35.f21874v3 = false;
                        }
                        if (this.f21974c.f21872v1 != null) {
                            this.f21974c.f21872v1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(m28603g.get(i10).m14816W()));
                            this.f21974c.f21872v1.apply();
                        }
                        if (this.f21974c.f21877w1 != null) {
                            this.f21974c.f21877w1.putInt("currentlyPlayingVideoPosition", i10);
                            this.f21974c.f21877w1.apply();
                        }
                        nSTEXOPlayerSkyTvActivity = this.f21974c;
                        nSTEXOPlayerSkyTvActivity.f21760W2.notifyDataSetChanged();
                        return;
                    }
                    this.f21974c.m17926h2();
                }
                if (this.f21974c.f21857s1 != C5255e.m26214Q(m28603g.get(i10).m14811R())) {
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity36 = this.f21974c;
                    nSTEXOPlayerSkyTvActivity36.f21754V0 = nSTEXOPlayerSkyTvActivity36.f21704I2;
                    this.f21974c.f21767Y1.setCurrentWindowIndex(i10);
                    this.f21974c.f21696G2 = C5255e.m26215R(m28603g.get(i10).m14805L());
                    this.f21974c.f21700H2 = m28603g.get(i10).m14827g();
                    if (this.f21974c.f21856s0 != null) {
                        this.f21974c.f21856s0.clear();
                        this.f21974c.f21856s0.addAll(this.f21973b);
                    }
                    this.f21974c.f21767Y1.setTitle(m28603g.get(i10).m14805L() + " - " + m28603g.get(i10).getName());
                    this.f21974c.f21857s1 = C5255e.m26214Q(m28603g.get(i10).m14811R());
                    C7920a.m34301l().m34317z(String.valueOf(this.f21974c.f21857s1));
                    if (!this.f21974c.f21754V0.equals("-1") && !this.f21974c.f21754V0.equals("0") && !this.f21974c.f21754V0.equals("-6")) {
                        this.f21974c.f21754V0 = m28603g.get(i10).m14827g();
                        this.f21974c.f21758W0 = m28603g.get(i10).m14830i();
                        if (this.f21974c.f21758W0.isEmpty()) {
                            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity37 = this.f21974c;
                            nSTEXOPlayerSkyTvActivity37.f21758W0 = nSTEXOPlayerSkyTvActivity37.m17910X1(nSTEXOPlayerSkyTvActivity37.f21754V0);
                        }
                    }
                    String m14810Q3 = m28603g.get(i10).m14810Q();
                    try {
                        if (m14810Q3.equals("") || m14810Q3.isEmpty()) {
                            this.f21974c.f21835o.setImageDrawable(this.f21974c.f21782d.getResources().getDrawable(2131231571));
                        } else {
                            C10014t.m42105q(this.f21974c.f21782d).m42116l(m14810Q3).m42154j(2131231571).m42148d(2131231571).m42151g(this.f21974c.f21835o);
                        }
                    } catch (Exception e11) {
                        this.f21974c.f21835o.setImageDrawable(this.f21974c.f21782d.getResources().getDrawable(2131231571));
                    }
                    this.f21974c.f21683D1.removeCallbacksAndMessages(null);
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity38 = this.f21974c;
                    nSTEXOPlayerSkyTvActivity38.f21681D = m14798E2;
                    nSTEXOPlayerSkyTvActivity38.f21685E = m14810Q3;
                    nSTEXOPlayerSkyTvActivity38.f21767Y1.setCurrentEpgChannelID(this.f21974c.f21681D);
                    this.f21974c.f21767Y1.setCurrentChannelLogo(this.f21974c.f21685E);
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity39 = this.f21974c;
                    nSTEXOPlayerSkyTvActivity39.m17924f3(nSTEXOPlayerSkyTvActivity39.f21685E);
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity40 = this.f21974c;
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity41 = this.f21974c;
                    nSTEXOPlayerSkyTvActivity40.f21833n2 = new AsyncTaskC3629f0(nSTEXOPlayerSkyTvActivity41, nSTEXOPlayerSkyTvActivity41.f21681D, null).execute(new String[0]);
                    this.f21974c.f21679C1.removeCallbacksAndMessages(null);
                    this.f21974c.f21711K1 = i10;
                    this.f21974c.f21767Y1.m12488B();
                    if (this.f21974c.f21788e2.booleanValue()) {
                        this.f21974c.f21859s3 = Uri.parse(this.f21974c.f21786e + C5255e.m26214Q(m28603g.get(i10).m14811R()) + this.f21974c.f21765Y);
                        this.f21974c.f21767Y1.m12507t(Boolean.valueOf(NSTEXOPlayerSkyTvActivity.f21663B3));
                        this.f21974c.m17942y2();
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity42 = this.f21974c;
                        nSTEXOPlayerSkyTvActivity42.f21864t3 = 0;
                        nSTEXOPlayerSkyTvActivity42.f21874v3 = false;
                    }
                    if (this.f21974c.f21872v1 != null) {
                        this.f21974c.f21872v1.putString("currentlyPlayingVideo", String.valueOf(m28603g.get(i10).m14811R()));
                        this.f21974c.f21872v1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(m28603g.get(i10).m14816W()));
                        this.f21974c.f21872v1.apply();
                    }
                    if (this.f21974c.f21877w1 != null) {
                        this.f21974c.f21877w1.putInt("currentlyPlayingVideoPosition", i10);
                        this.f21974c.f21877w1.apply();
                    }
                    nSTEXOPlayerSkyTvActivity = this.f21974c;
                    nSTEXOPlayerSkyTvActivity.f21760W2.notifyDataSetChanged();
                    return;
                }
                this.f21974c.m17926h2();
            } catch (Exception e12) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$w.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$w */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$w.class */
    public class C3650w implements AdapterView.OnItemLongClickListener {

        /* renamed from: a */
        public final NSTEXOPlayerSkyTvActivity f21975a;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$w$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$w$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$w$a.class */
        public class a implements PopupMenu.OnMenuItemClickListener {

            /* renamed from: a */
            public final String f21976a;

            /* renamed from: b */
            public final String f21977b;

            /* renamed from: c */
            public final int f21978c;

            /* renamed from: d */
            public final String f21979d;

            /* renamed from: e */
            public final String f21980e;

            /* renamed from: f */
            public final String f21981f;

            /* renamed from: g */
            public final C3650w f21982g;

            /* JADX WARN: Classes with same name are omitted:
              classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$w$a$a.class
             */
            /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$w$a$a, reason: collision with other inner class name */
            /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$w$a$a.class */
            public class DialogC10273a extends Dialog implements View.OnClickListener {

                /* renamed from: b */
                public Activity f21983b;

                /* renamed from: c */
                public TextView f21984c;

                /* renamed from: d */
                public TextView f21985d;

                /* renamed from: e */
                public TextView f21986e;

                /* renamed from: f */
                public LinearLayout f21987f;

                /* renamed from: g */
                public LinearLayout f21988g;

                /* renamed from: h */
                public final a f21989h;

                /* JADX WARN: Classes with same name are omitted:
                  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$w$a$a$a.class
                 */
                /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$w$a$a$a, reason: collision with other inner class name */
                /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$w$a$a$a.class */
                public class ViewOnFocusChangeListenerC10274a implements View.OnFocusChangeListener {

                    /* renamed from: b */
                    public View f21990b;

                    /* renamed from: c */
                    public final DialogC10273a f21991c;

                    public ViewOnFocusChangeListenerC10274a(DialogC10273a dialogC10273a, View view) {
                        this.f21991c = dialogC10273a;
                        this.f21990b = view;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    @SuppressLint({"ResourceType"})
                    public void onFocusChange(View view, boolean z10) {
                        int i10;
                        LinearLayout linearLayout;
                        if (z10) {
                            View view2 = this.f21990b;
                            i10 = 2131230846;
                            if (view2 == null || view2.getTag() == null || !this.f21990b.getTag().equals("1")) {
                                View view3 = this.f21990b;
                                if (view3 == null || view3.getTag() == null || !this.f21990b.getTag().equals("2")) {
                                    return;
                                }
                                linearLayout = this.f21991c.f21988g;
                            }
                            linearLayout = this.f21991c.f21987f;
                        } else {
                            View view4 = this.f21990b;
                            i10 = 2131230845;
                            if (view4 == null || view4.getTag() == null || !this.f21990b.getTag().equals("1")) {
                                View view5 = this.f21990b;
                                if (view5 == null || view5.getTag() == null || !this.f21990b.getTag().equals("2")) {
                                    return;
                                }
                                linearLayout = this.f21991c.f21988g;
                            }
                            linearLayout = this.f21991c.f21987f;
                        }
                        linearLayout.setBackgroundResource(i10);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public DialogC10273a(a aVar, Activity activity) {
                    super(activity);
                    this.f21989h = aVar;
                    this.f21983b = activity;
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
                    throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity.C3650w.a.DialogC10273a.onClick(android.view.View):void");
                }

                @Override // android.app.Dialog
                public void onCreate(Bundle bundle) {
                    try {
                        super.onCreate(bundle);
                        if (this.f21989h.f21982g.f21975a.f21680C2.m31288z().equals(C5251a.f30065s0)) {
                            setContentView(2131624128);
                        } else {
                            setContentView(2131624127);
                        }
                        this.f21984c = (TextView) findViewById(2131427681);
                        this.f21985d = (TextView) findViewById(2131427653);
                        this.f21987f = (LinearLayout) findViewById(2131428448);
                        this.f21988g = (LinearLayout) findViewById(2131428541);
                        TextView textView = (TextView) findViewById(2131429644);
                        this.f21986e = textView;
                        textView.setText(this.f21989h.f21982g.f21975a.f21782d.getResources().getString(2132018831));
                        this.f21984c.setOnClickListener(this);
                        this.f21985d.setOnClickListener(this);
                        TextView textView2 = this.f21984c;
                        textView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC10274a(this, textView2));
                        TextView textView3 = this.f21985d;
                        textView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC10274a(this, textView3));
                    } catch (Exception e10) {
                    }
                }
            }

            public a(C3650w c3650w, String str, String str2, int i10, String str3, String str4, String str5) {
                this.f21982g = c3650w;
                this.f21976a = str;
                this.f21977b = str2;
                this.f21978c = i10;
                this.f21979d = str3;
                this.f21980e = str4;
                this.f21981f = str5;
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
            
                r0 = r8.f21982g.f21975a;
                r0.f21853r2 = true;
                r0.m17891N2();
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
            
                if (r8.f21982g.f21975a.f21755V1.equals("m3u") == false) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
            
                r12 = r8.f21982g.f21975a;
                r11 = r12.f21677C;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
            
                r12.f21713L = r11;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x009f, code lost:
            
                r0 = new android.content.Intent(r8.f21982g.f21975a.f21782d, (java.lang.Class<?>) com.maxdigitall.maxdigitaliptvbox.view.activity.PlayExternalPlayerActivity.class);
                r0.putExtra("url", r8.f21982g.f21975a.f21713L);
                r0.putExtra("app_name", r8.f21982g.f21975a.f21692F2.get(r10).m15415a());
                r0.putExtra("packagename", r8.f21982g.f21975a.f21692F2.get(r10).m15416b());
                r8.f21982g.f21975a.f21782d.startActivity(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
            
                r12 = r8.f21982g.f21975a;
                r11 = p151if.C5255e.m26203F(r12.f21782d, r12.f21673B, r12.f21765Y, "live");
             */
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean onMenuItemClick(android.view.MenuItem r9) {
                /*
                    Method dump skipped, instructions count: 635
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity.C3650w.a.onMenuItemClick(android.view.MenuItem):boolean");
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$w$b.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$w$b */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$w$b.class */
        public class b implements PopupMenu.OnDismissListener {

            /* renamed from: a */
            public final C3650w f21992a;

            public b(C3650w c3650w) {
                this.f21992a = c3650w;
            }

            @Override // android.widget.PopupMenu.OnDismissListener
            public void onDismiss(PopupMenu popupMenu) {
            }
        }

        public C3650w(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity) {
            this.f21975a = nSTEXOPlayerSkyTvActivity;
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
                if (this.f21975a.f21760W2 == null) {
                    return false;
                }
                ArrayList<LiveStreamsDBModel> m28603g = this.f21975a.f21760W2.m28603g();
                if (m28603g != null && m28603g.size() > 0) {
                    str = m28603g.get(i10).m14827g();
                    i11 = C5255e.m26214Q(m28603g.get(i10).m14811R());
                    str2 = m28603g.get(i10).m14816W();
                    str3 = m28603g.get(i10).getName();
                    str4 = m28603g.get(i10).m14805L();
                    m28603g.get(i10).m14810Q();
                    str5 = m28603g.get(i10).m14812S();
                } else if (this.f21975a.f21846q0 == null || this.f21975a.f21846q0.size() <= 0) {
                    str = "";
                    str2 = "";
                    str3 = str2;
                    str4 = str3;
                    str5 = str4;
                    i11 = 0;
                } else {
                    str = ((LiveStreamsDBModel) this.f21975a.f21846q0.get(i10)).m14827g();
                    i11 = C5255e.m26214Q(((LiveStreamsDBModel) this.f21975a.f21846q0.get(i10)).m14811R());
                    str3 = ((LiveStreamsDBModel) this.f21975a.f21846q0.get(i10)).getName();
                    str2 = ((LiveStreamsDBModel) this.f21975a.f21846q0.get(i10)).m14816W();
                    str4 = ((LiveStreamsDBModel) this.f21975a.f21846q0.get(i10)).m14805L();
                    ((LiveStreamsDBModel) this.f21975a.f21846q0.get(i10)).m14810Q();
                    str5 = ((LiveStreamsDBModel) this.f21975a.f21846q0.get(i10)).m14812S();
                }
                PopupMenu popupMenu = new PopupMenu(this.f21975a, view);
                popupMenu.getMenuInflater().inflate(2131689491, popupMenu.getMenu());
                if (this.f21975a.f21704I2.equals("-6")) {
                    popupMenu.getMenu().getItem(6).setVisible(true);
                } else {
                    popupMenu.getMenu().getItem(6).setVisible(false);
                }
                if (this.f21975a.f21755V1.equals("m3u")) {
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = this.f21975a;
                    ArrayList<FavouriteM3UModel> m15159E0 = nSTEXOPlayerSkyTvActivity.f21721N.m15159E0(str2, SharepreferenceDBHandler.m15337A(nSTEXOPlayerSkyTvActivity.f21782d));
                    if (m15159E0 == null || m15159E0.size() <= 0) {
                        menu = popupMenu.getMenu();
                        item = menu.getItem(2);
                    } else {
                        menu2 = popupMenu.getMenu();
                        item = menu2.getItem(3);
                    }
                } else {
                    ArrayList<FavouriteDBModel> m15112o = this.f21975a.f21867u1.m15112o(i11, str, str5, SharepreferenceDBHandler.m15337A(this.f21975a.f21782d));
                    if (m15112o == null || m15112o.size() <= 0) {
                        menu = popupMenu.getMenu();
                        item = menu.getItem(2);
                    } else {
                        menu2 = popupMenu.getMenu();
                        item = menu2.getItem(3);
                    }
                }
                item.setVisible(true);
                this.f21975a.f21692F2 = new ArrayList<>();
                this.f21975a.f21692F2 = new ExternalPlayerDataBase(this.f21975a.f21782d).m15132o();
                try {
                    ArrayList<ExternalPlayerModelClass> arrayList = this.f21975a.f21692F2;
                    if (arrayList != null && arrayList.size() > 0) {
                        for (int i12 = 0; i12 < this.f21975a.f21692F2.size(); i12++) {
                            popupMenu.getMenu().add(0, i12, i12, this.f21975a.f21692F2.get(i12).m15415a());
                        }
                    }
                } catch (Exception e10) {
                }
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = this.f21975a;
                nSTEXOPlayerSkyTvActivity2.f21673B = i11;
                nSTEXOPlayerSkyTvActivity2.f21677C = str2;
                nSTEXOPlayerSkyTvActivity2.f21798g2 = str3.replaceAll(" ", AWSAppSyncClient.DATABASE_NAME_DELIMITER).toLowerCase();
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity3 = this.f21975a;
                nSTEXOPlayerSkyTvActivity3.f21798g2 = nSTEXOPlayerSkyTvActivity3.f21798g2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
                popupMenu.setOnMenuItemClickListener(new a(this, str, str3, i10, str4, str5, this.f21975a.f21798g2));
                popupMenu.setOnDismissListener(new b(this));
                popupMenu.show();
                return true;
            } catch (Exception e11) {
                return false;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$x.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$x */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$x.class */
    public class RunnableC3651x implements Runnable {

        /* renamed from: b */
        public final NSTEXOPlayerSkyTvActivity f21993b;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$x$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$x$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$x$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final RunnableC3651x f21994b;

            public a(RunnableC3651x runnableC3651x) {
                this.f21994b = runnableC3651x;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f21994b.f21993b.m17903T2("", false);
                this.f21994b.f21993b.f21829m3 = Boolean.TRUE;
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$x$b.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$x$b */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$x$b.class */
        public class b implements Runnable {

            /* renamed from: b */
            public final RunnableC3651x f21995b;

            public b(RunnableC3651x runnableC3651x) {
                this.f21995b = runnableC3651x;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f21995b.f21993b.f21723N1.setText("");
                this.f21995b.f21993b.f21719M1.setVisibility(8);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$x$c.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$x$c */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$x$c.class */
        public class c implements Runnable {

            /* renamed from: b */
            public final RunnableC3651x f21996b;

            public c(RunnableC3651x runnableC3651x) {
                this.f21996b = runnableC3651x;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f21996b.f21993b.f21723N1.setText("");
                this.f21996b.f21993b.f21719M1.setVisibility(8);
            }
        }

        public RunnableC3651x(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity) {
            this.f21993b = nSTEXOPlayerSkyTvActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList<LiveStreamsDBModel> m15157D1;
            Handler handler;
            Runnable cVar;
            boolean z10;
            ArrayList<LiveStreamsDBModel> m15217f1;
            NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = this.f21993b;
            nSTEXOPlayerSkyTvActivity.f21726O0 = nSTEXOPlayerSkyTvActivity.f21715L1.toString();
            this.f21993b.f21723N1.setText("");
            this.f21993b.f21719M1.setVisibility(8);
            if (this.f21993b.f21794f3.equals("true")) {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity2 = this.f21993b;
                m15157D1 = nSTEXOPlayerSkyTvActivity2.f21721N.m15157D1(nSTEXOPlayerSkyTvActivity2.f21726O0, "radio_streams");
            } else {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity3 = this.f21993b;
                m15157D1 = nSTEXOPlayerSkyTvActivity3.f21721N.m15157D1(nSTEXOPlayerSkyTvActivity3.f21726O0, "live");
            }
            this.f21993b.f21715L1.setLength(0);
            if (m15157D1 == null || m15157D1.size() == 0) {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity4 = this.f21993b;
                nSTEXOPlayerSkyTvActivity4.f21723N1.setText(nSTEXOPlayerSkyTvActivity4.f21782d.getResources().getString(2132018196));
                this.f21993b.f21719M1.setVisibility(0);
                handler = new Handler();
                cVar = new c(this);
            } else {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity5 = this.f21993b;
                if (nSTEXOPlayerSkyTvActivity5.f21721N.m15189R1(SharepreferenceDBHandler.m15337A(nSTEXOPlayerSkyTvActivity5.f21782d)) <= 0 || this.f21993b.f21876w0 == null) {
                    z10 = false;
                } else {
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity6 = this.f21993b;
                    z10 = nSTEXOPlayerSkyTvActivity6.m17932o2(m15157D1, nSTEXOPlayerSkyTvActivity6.f21876w0);
                }
                if (!z10) {
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity7 = this.f21993b;
                    nSTEXOPlayerSkyTvActivity7.f21718M0 = true;
                    nSTEXOPlayerSkyTvActivity7.f21722N0 = true;
                    nSTEXOPlayerSkyTvActivity7.f21754V0 = "0";
                    nSTEXOPlayerSkyTvActivity7.f21758W0 = nSTEXOPlayerSkyTvActivity7.f21782d.getResources().getString(2132017297);
                    this.f21993b.f21791f0 = 0;
                    String m14805L = m15157D1.get(0).m14805L();
                    String m14811R = m15157D1.get(0).m14811R();
                    String name = m15157D1.get(0).getName();
                    String m14798E = m15157D1.get(0).m14798E();
                    String m14810Q = m15157D1.get(0).m14810Q();
                    String m14816W = m15157D1.get(0).m14816W();
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity8 = this.f21993b;
                    nSTEXOPlayerSkyTvActivity8.f21862t1 = m14816W;
                    nSTEXOPlayerSkyTvActivity8.f21696G2 = C5255e.m26215R(nSTEXOPlayerSkyTvActivity8.f21726O0);
                    this.f21993b.f21700H2 = "0";
                    this.f21993b.f21767Y1.setTitle(this.f21993b.f21726O0 + " - " + name);
                    if (this.f21993b.f21794f3.equals("true")) {
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity9 = this.f21993b;
                        m15217f1 = nSTEXOPlayerSkyTvActivity9.f21721N.m15217f1(nSTEXOPlayerSkyTvActivity9.f21754V0, "radio_streams");
                    } else {
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity10 = this.f21993b;
                        m15217f1 = nSTEXOPlayerSkyTvActivity10.f21721N.m15217f1(nSTEXOPlayerSkyTvActivity10.f21754V0, "live");
                    }
                    if (m15217f1 != null) {
                        this.f21993b.f21836o0.clear();
                    }
                    this.f21993b.f21836o0 = m15217f1;
                    if (this.f21993b.f21836o0 != null && this.f21993b.f21836o0.size() > 0) {
                        for (int i10 = 0; i10 < this.f21993b.f21836o0.size(); i10++) {
                            if (((LiveStreamsDBModel) this.f21993b.f21836o0.get(i10)).m14805L().equals(m14805L)) {
                                this.f21993b.f21767Y1.setCurrentWindowIndex(i10);
                                break;
                            }
                        }
                    }
                    try {
                        if (m14810Q.equals("") || m14810Q.isEmpty()) {
                            this.f21993b.f21835o.setImageDrawable(this.f21993b.f21782d.getResources().getDrawable(2131231571));
                        } else {
                            C10014t.m42105q(this.f21993b.f21782d).m42116l(m14810Q).m42154j(2131231571).m42148d(2131231571).m42155k(80, 55).m42151g(this.f21993b.f21835o);
                        }
                    } catch (Exception e10) {
                        this.f21993b.f21835o.setImageDrawable(this.f21993b.f21782d.getResources().getDrawable(2131231571));
                    }
                    this.f21993b.f21767Y1.m12488B();
                    if (this.f21993b.f21788e2.booleanValue()) {
                        if (this.f21993b.f21755V1.equals("m3u")) {
                            this.f21993b.f21859s3 = Uri.parse(m14816W);
                            this.f21993b.f21767Y1.m12507t(Boolean.valueOf(NSTEXOPlayerSkyTvActivity.f21663B3));
                            C7920a.m34301l().m34317z(this.f21993b.f21862t1);
                        } else {
                            this.f21993b.f21859s3 = Uri.parse(m14816W);
                            this.f21993b.f21767Y1.m12507t(Boolean.valueOf(NSTEXOPlayerSkyTvActivity.f21663B3));
                            C7920a.m34301l().m34317z(m14811R);
                        }
                        this.f21993b.m17942y2();
                        NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity11 = this.f21993b;
                        nSTEXOPlayerSkyTvActivity11.f21864t3 = 0;
                        nSTEXOPlayerSkyTvActivity11.f21874v3 = false;
                        nSTEXOPlayerSkyTvActivity11.f21829m3 = Boolean.FALSE;
                        this.f21993b.f21691F1.removeCallbacksAndMessages(null);
                        this.f21993b.f21691F1.postDelayed(new a(this), 5000L);
                        this.f21993b.m17920c3();
                        this.f21993b.m17909W2();
                        this.f21993b.m17906V1(TFTP.DEFAULT_TIMEOUT);
                    }
                    this.f21993b.f21683D1.removeCallbacksAndMessages(null);
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity12 = this.f21993b;
                    nSTEXOPlayerSkyTvActivity12.f21681D = m14798E;
                    nSTEXOPlayerSkyTvActivity12.f21685E = m14810Q;
                    nSTEXOPlayerSkyTvActivity12.f21767Y1.setCurrentEpgChannelID(this.f21993b.f21681D);
                    this.f21993b.f21767Y1.setCurrentChannelLogo(this.f21993b.f21685E);
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity13 = this.f21993b;
                    nSTEXOPlayerSkyTvActivity13.m17924f3(nSTEXOPlayerSkyTvActivity13.f21685E);
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity14 = this.f21993b;
                    NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity15 = this.f21993b;
                    nSTEXOPlayerSkyTvActivity14.f21833n2 = new AsyncTaskC3629f0(nSTEXOPlayerSkyTvActivity15, nSTEXOPlayerSkyTvActivity15.f21681D, null).execute(new String[0]);
                    this.f21993b.f21679C1.removeCallbacksAndMessages(null);
                    this.f21993b.f21857s1 = C5255e.m26214Q(m14811R);
                    if (this.f21993b.f21872v1 != null) {
                        this.f21993b.f21872v1.putString("currentlyPlayingVideo", m14811R);
                        this.f21993b.f21872v1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", m14816W);
                        this.f21993b.f21872v1.apply();
                    }
                    m15157D1.clear();
                    return;
                }
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity16 = this.f21993b;
                nSTEXOPlayerSkyTvActivity16.f21723N1.setText(nSTEXOPlayerSkyTvActivity16.f21782d.getResources().getString(2132018196));
                this.f21993b.f21719M1.setVisibility(0);
                handler = new Handler();
                cVar = new b(this);
            }
            handler.postDelayed(cVar, 1000L);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$y.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$y */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$y.class */
    public class RunnableC3652y implements Runnable {

        /* renamed from: b */
        public final NSTEXOPlayerSkyTvActivity f21997b;

        public RunnableC3652y(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity) {
            this.f21997b = nSTEXOPlayerSkyTvActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f21997b.m17923f2();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                } catch (Exception e11) {
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$z.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$z */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/demo/NSTEXOPlayerSkyTvActivity$z.class */
    public class AsyncTaskC3653z extends AsyncTask<String, Void, Boolean> {

        /* renamed from: a */
        public final NSTEXOPlayerSkyTvActivity f21998a;

        public AsyncTaskC3653z(NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity) {
            this.f21998a = nSTEXOPlayerSkyTvActivity;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return Boolean.valueOf(this.f21998a.m17941x2());
            } catch (Exception e10) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            this.f21998a.m17903T2("", true);
            this.f21998a.f21829m3 = Boolean.TRUE;
            if (this.f21998a.f21767Y1 != null) {
                this.f21998a.f21767Y1.setEPGHandler(this.f21998a.f21683D1);
                this.f21998a.f21767Y1.setContext(this.f21998a.f21782d);
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (this.f21998a.f21838o2 == null) {
                NSTEXOPlayerSkyTvActivity nSTEXOPlayerSkyTvActivity = this.f21998a;
                nSTEXOPlayerSkyTvActivity.f21838o2 = NSTEXOPlayerSkyTvActivity.m17842d2(nSTEXOPlayerSkyTvActivity.f21782d);
                if (this.f21998a.f21838o2 == null) {
                    return;
                }
            } else if (this.f21998a.f21838o2.isShowing()) {
                return;
            }
            this.f21998a.f21838o2.show();
        }
    }

    public NSTEXOPlayerSkyTvActivity() {
        Boolean bool = Boolean.FALSE;
        this.f21731P1 = bool;
        this.f21735Q1 = bool;
        this.f21751U1 = "";
        this.f21774a2 = "";
        this.f21777b2 = bool;
        this.f21784d2 = "";
        Boolean bool2 = Boolean.TRUE;
        this.f21788e2 = bool2;
        this.f21793f2 = null;
        this.f21803h2 = -1;
        this.f21808i2 = 0;
        this.f21813j2 = "";
        this.f21818k2 = bool2;
        this.f21823l2 = null;
        this.f21828m2 = null;
        this.f21833n2 = null;
        this.f21843p2 = false;
        this.f21848q2 = 0;
        this.f21853r2 = false;
        this.f21858s2 = 4;
        this.f21863t2 = f21666E3[0];
        this.f21878w2 = bool;
        this.f21883x2 = bool;
        this.f21888y2 = bool;
        this.f21893z2 = bool;
        this.f21672A2 = bool;
        this.f21676B2 = bool;
        this.f21696G2 = 0;
        this.f21700H2 = "0";
        this.f21704I2 = "0";
        this.f21708J2 = bool2;
        this.f21748T2 = "mobile";
        this.f21775a3 = 0;
        this.f21785d3 = "";
        this.f21789e3 = "false";
        this.f21794f3 = "false";
        this.f21799g3 = "-10";
        this.f21804h3 = 0;
        this.f21809i3 = false;
        this.f21814j3 = true;
        this.f21824l3 = null;
        this.f21829m3 = bool;
        this.f21834n3 = false;
        this.f21864t3 = 0;
        this.f21869u3 = 5;
        this.f21874v3 = false;
        this.f21879w3 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B2 */
    public /* synthetic */ void m17804B2(DialogInterface dialogInterface) {
        this.f21884x3 = false;
    }

    /* renamed from: a2 */
    public static boolean m17838a2() {
        ProgressBar progressBar = f21667F3;
        return progressBar != null && progressBar.getVisibility() == 0;
    }

    /* renamed from: d2 */
    public static ProgressDialog m17842d2(Context context) {
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

    /* renamed from: e2 */
    public static long m17844e2(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: i2 */
    public static String m17849i2(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    /* renamed from: A2 */
    public boolean m17876A2() {
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

    /* renamed from: C2 */
    public void m17877C2(String str) {
        this.f21704I2 = str;
        try {
            SearchView searchView = this.f21694G0;
            if (searchView != null && this.f21743S1 != null) {
                searchView.m1149b0("", false);
                this.f21743S1.collapseActionView();
            }
        } catch (Exception e10) {
        }
        try {
            if (this.f21739R1 != null) {
                if (this.f21704I2.equals("-6")) {
                    this.f21739R1.getItem(2).getSubMenu().findItem(2131428757).setVisible(true);
                } else {
                    this.f21739R1.getItem(2).getSubMenu().findItem(2131428757).setVisible(false);
                }
            }
        } catch (Exception e11) {
        }
        m17898R1(true);
    }

    /* renamed from: D2 */
    public final void m17878D2() {
        ProgressBar progressBar = this.f21865u;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
        TextView textView = this.f21840p;
        if (textView != null) {
            textView.setText(this.f21782d.getResources().getString(2132018251));
        }
        TextView textView2 = this.f21845q;
        if (textView2 != null) {
            textView2.setText("");
        }
        TextView textView3 = this.f21850r;
        if (textView3 != null) {
            textView3.setText(this.f21782d.getResources().getString(2132018185));
        }
        TextView textView4 = this.f21855s;
        if (textView4 != null) {
            textView4.setText("");
        }
    }

    /* renamed from: E2 */
    public final void m17879E2() {
        int currentWindowIndex = this.f21767Y1.getCurrentWindowIndex();
        if (currentWindowIndex == this.f21856s0.size() - 1) {
            this.f21767Y1.setCurrentWindowIndex(0);
        } else {
            this.f21767Y1.setCurrentWindowIndex(currentWindowIndex + 1);
        }
    }

    /* renamed from: F2 */
    public void m17880F2() {
        LinearLayout linearLayout = this.ll_no_cat_found;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        if (this.ll_no_cat_found != null) {
            this.ll_no_cat_found_player.setVisibility(0);
        }
    }

    /* renamed from: G2 */
    public void m17881G2() {
        C5251a.f30008G = Boolean.TRUE;
        this.f21669A = true;
        this.f21825m.setVisibility(0);
        this.f21830n.setText(this.f21782d.getResources().getString(2132018196));
        this.f21847q1.setVisibility(8);
        if (C5251a.f30048k.booleanValue()) {
            findViewById(2131429693).setVisibility(8);
        }
    }

    /* renamed from: H2 */
    public final void m17882H2() {
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

    /* renamed from: I2 */
    public final void m17883I2() {
        EditText editText = this.et_search_left_side;
        if (editText != null) {
            editText.addTextChangedListener(new C3626e(this));
        }
    }

    /* renamed from: J2 */
    public final void m17884J2() {
        C7562b2 c7562b2;
        try {
            if (!this.f21788e2.booleanValue() || (c7562b2 = this.f21839o3) == null) {
                return;
            }
            c7562b2.m32649a0();
        } catch (Exception e10) {
        }
    }

    /* renamed from: K2 */
    public final void m17885K2() {
        C7562b2 c7562b2;
        try {
            if (!this.f21788e2.booleanValue() || (c7562b2 = this.f21839o3) == null) {
                return;
            }
            c7562b2.m32650b0();
        } catch (Exception e10) {
        }
    }

    /* renamed from: L1 */
    public final void m17886L1(String str, int i10, String str2, String str3, String str4, int i11) {
        new AsyncTaskC3631g0(this, str, i10, str2, str3, str4, i11).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: L2 */
    public final void m17887L2(ArrayList<LiveStreamsDBModel> arrayList) {
        C7920a m34301l;
        String valueOf;
        String str;
        String str2;
        String str3;
        if (arrayList == null || arrayList.size() <= 0 || this.f21711K1 >= arrayList.size()) {
            return;
        }
        int m26215R = C5255e.m26215R(arrayList.get(this.f21711K1).m14805L());
        this.f21696G2 = m26215R;
        this.f21700H2 = arrayList.get(this.f21711K1).m14827g();
        int i10 = this.f21711K1;
        this.f21848q2 = i10;
        String name = arrayList.get(i10).getName();
        int m26214Q = C5255e.m26214Q(arrayList.get(this.f21711K1).m14811R());
        String m14798E = arrayList.get(this.f21711K1).m14798E();
        String m14810Q = arrayList.get(this.f21711K1).m14810Q();
        arrayList.get(this.f21711K1).m14805L();
        this.f21759W1 = arrayList.get(this.f21711K1).m14816W();
        String m26247n0 = C5255e.m26247n0(C7711g.m33686a() + C7711g.m33687i());
        try {
            if (m14810Q.equals("") || m14810Q.isEmpty()) {
                this.f21835o.setImageDrawable(this.f21782d.getResources().getDrawable(2131231571));
            } else {
                C10014t.m42105q(this.f21782d).m42116l(m14810Q).m42154j(2131231571).m42148d(2131231571).m42151g(this.f21835o);
            }
        } catch (Exception e10) {
            this.f21835o.setImageDrawable(this.f21782d.getResources().getDrawable(2131231571));
        }
        this.f21767Y1.setCurrentWindowIndex(this.f21711K1);
        SharedPreferences.Editor editor = this.f21872v1;
        if (editor != null) {
            editor.putString("currentlyPlayingVideo", String.valueOf(arrayList.get(this.f21711K1).m14811R()));
            this.f21872v1.putString("LOGIN_PREF_CURRENTLY_PLAYING_VIDEO_M3U", String.valueOf(arrayList.get(this.f21711K1).m14816W()));
            this.f21872v1.apply();
        }
        SharedPreferences.Editor editor2 = this.f21877w1;
        if (editor2 != null) {
            editor2.putInt("currentlyPlayingVideoPosition", this.f21711K1);
            this.f21877w1.apply();
        }
        SimpleDateFormat simpleDateFormat = this.f21763X1;
        if (m17844e2(simpleDateFormat, simpleDateFormat.format(new Date(C7709e.m33680a(this.f21782d))), this.f21747T1.format(this.f21771Z1)) >= C7707c.m33667p() && (str2 = this.f21822l1) != null && this.f21776b1 != null && (!f21664C3.equals(str2) || (this.f21822l1 != null && (str3 = this.f21776b1) != null && !f21665D3.equals(str3)))) {
            this.f21788e2 = Boolean.FALSE;
            this.f21767Y1.setVisibility(8);
            this.f21825m.setVisibility(0);
            this.f21830n.setText(m26247n0 + this.f21805i + this.f21887y1);
        }
        this.f21857s1 = m26214Q;
        this.f21852r1 = m14798E;
        this.f21862t1 = this.f21759W1;
        if (this.f21755V1.equals("m3u")) {
            m34301l = C7920a.m34301l();
            valueOf = this.f21862t1;
        } else {
            m34301l = C7920a.m34301l();
            valueOf = String.valueOf(this.f21857s1);
        }
        m34301l.m34317z(valueOf);
        this.f21767Y1.setTitle(m26215R + " - " + name);
        this.f21767Y1.m12488B();
        if (!f21663B3) {
            if (this.f21767Y1.getFullScreenValue().booleanValue()) {
                f21663B3 = this.f21767Y1.getFullScreenValue().booleanValue();
            } else {
                f21663B3 = false;
            }
        }
        if (this.f21788e2.booleanValue()) {
            if (this.f21755V1.equals("m3u")) {
                str = this.f21759W1;
            } else {
                str = this.f21786e + m26214Q + this.f21765Y;
            }
            this.f21859s3 = Uri.parse(str);
            this.f21767Y1.m12507t(Boolean.valueOf(f21663B3));
            m17942y2();
            this.f21864t3 = 0;
            this.f21874v3 = false;
        }
        this.f21683D1.removeCallbacksAndMessages(null);
        this.f21681D = m14798E;
        this.f21685E = m14810Q;
        this.f21767Y1.setCurrentEpgChannelID(m14798E);
        this.f21767Y1.setCurrentChannelLogo(this.f21685E);
        m17924f3(this.f21685E);
        this.f21833n2 = new AsyncTaskC3629f0(this, this.f21681D, null).execute(new String[0]);
        this.f21731P1 = Boolean.TRUE;
    }

    /* renamed from: M1 */
    public final void m17888M1(String str, String str2, String str3, int i10) {
        new AsyncTaskC3633h0(this, str, str2, str3, i10).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    /* renamed from: M2 */
    public final void m17889M2() {
        int currentWindowIndex = this.f21767Y1.getCurrentWindowIndex();
        if (currentWindowIndex == 0) {
            this.f21767Y1.setCurrentWindowIndex(this.f21856s0.size() - 1);
        } else {
            this.f21767Y1.setCurrentWindowIndex(currentWindowIndex - 1);
        }
    }

    /* renamed from: N1 */
    public final void m17890N1(Configuration configuration) {
        PlayerView playerView;
        boolean z10;
        View decorView = getWindow().getDecorView();
        if (configuration.orientation == 2) {
            decorView.setSystemUiVisibility(5894);
            playerView = this.f21767Y1;
            z10 = false;
        } else {
            decorView.setSystemUiVisibility(256);
            playerView = this.f21767Y1;
            z10 = true;
        }
        playerView.setAdjustViewBounds(z10);
    }

    /* renamed from: N2 */
    public void m17891N2() {
        try {
            C7562b2 c7562b2 = this.f21839o3;
            if (c7562b2 != null) {
                c7562b2.m32448g1();
                this.f21839o3 = null;
                this.f21849q3 = null;
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: O1 */
    public void m17892O1() {
        m17914Z1();
        this.f21823l2 = new AsyncTaskC3619a0(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels");
    }

    /* renamed from: O2 */
    public final void m17893O2(String str, int i10, String str2, String str3, int i11) {
        new AsyncTaskC3635i0(this, str, i10, str2, str3, i11).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    /* renamed from: P1 */
    public void m17894P1() {
        m17914Z1();
        this.f21823l2 = new AsyncTaskC3619a0(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels_with_cat");
    }

    /* renamed from: P2 */
    public final void m17895P2(String str, String str2, int i10) {
        new AsyncTaskC3637j0(this, str, i10).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0172, code lost:
    
        if (r6.f21836o0.get(r7).m14816W().equals(r18) != false) goto L46;
     */
    /* renamed from: Q1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m17896Q1() {
        /*
            Method dump skipped, instructions count: 979
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity.m17896Q1():java.lang.String");
    }

    /* renamed from: Q2 */
    public void m17897Q2() {
        this.f21828m2 = new AsyncTaskC3653z(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r10 != null) goto L12;
     */
    /* renamed from: R1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m17898R1(boolean r9) {
        /*
            r8 = this;
            r0 = r8
            r0.m17914Z1()
            r0 = r9
            if (r0 == 0) goto L35
            r0 = r8
            android.app.ProgressDialog r0 = r0.f21838o2
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L25
            r0 = r8
            android.content.Context r0 = r0.f21782d
            android.app.ProgressDialog r0 = m17842d2(r0)
            r10 = r0
            r0 = r8
            r1 = r10
            r0.f21838o2 = r1
            r0 = r10
            if (r0 == 0) goto L35
            goto L31
        L25:
            r0 = r10
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L35
            r0 = r8
            android.app.ProgressDialog r0 = r0.f21838o2
            r10 = r0
        L31:
            r0 = r10
            r0.show()
        L35:
            r0 = r8
            com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$b0 r1 = new com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity$b0
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
            r0.f21823l2 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity.m17898R1(boolean):void");
    }

    @SuppressLint({"NewApi"})
    /* renamed from: R2 */
    public void m17899R2(ArrayList<LiveStreamsDBModel> arrayList) {
        LiveStreamDBHandler liveStreamDBHandler;
        String str;
        String str2;
        try {
            if (arrayList == null) {
                this.f21701I = new ArrayList<>();
                return;
            }
            this.f21890z = false;
            this.f21698H0.setVisibility(8);
            if (arrayList.size() == 0) {
                if (this.f21843p2) {
                    TextView textView = this.f21698H0;
                    if (textView == null) {
                        return;
                    }
                    this.f21890z = true;
                    textView.setFocusable(true);
                    this.f21698H0.requestFocus();
                } else {
                    this.f21843p2 = true;
                    ArrayList<LiveStreamsDBModel> arrayList2 = this.f21836o0;
                    if (arrayList2 != null && this.f21826m0 != null) {
                        arrayList2.clear();
                        this.f21826m0.clear();
                    }
                    if (this.f21794f3.equals("true")) {
                        liveStreamDBHandler = this.f21721N;
                        str = this.f21754V0;
                        str2 = "radio_streams";
                    } else {
                        liveStreamDBHandler = this.f21721N;
                        str = this.f21754V0;
                        str2 = "live";
                    }
                    this.f21836o0 = liveStreamDBHandler.m15217f1(str, str2);
                    ArrayList<LiveStreamsDBModel> arrayList3 = this.f21836o0;
                    if (arrayList3 != null && arrayList3.size() > 0) {
                        m17899R2(this.f21836o0);
                        return;
                    }
                    TextView textView2 = this.f21698H0;
                    if (textView2 == null) {
                        return;
                    }
                    this.f21890z = true;
                    textView2.setFocusable(true);
                    this.f21698H0.requestFocus();
                }
                this.f21698H0.setVisibility(0);
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: S1 */
    public void m17900S1() {
        m17914Z1();
        this.f21823l2 = new AsyncTaskC3619a0(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_fav");
    }

    @SuppressLint({"NewApi"})
    /* renamed from: S2 */
    public void m17901S2(ArrayList<LiveStreamsDBModel> arrayList) {
        ListView listView;
        try {
            if (this.f21785d3.equals("player")) {
                if (arrayList != null && arrayList.size() > 0) {
                    ListView listView2 = this.f21697H;
                    if (listView2 != null) {
                        listView2.setVisibility(0);
                    }
                    this.f21890z = false;
                    if (this.f21697H != null) {
                        C5866s c5866s = new C5866s(this, arrayList);
                        this.f21764X2 = c5866s;
                        this.f21697H.setAdapter((ListAdapter) c5866s);
                        this.f21697H.setSelection(this.f21775a3);
                        this.f21697H.requestFocus();
                        this.f21697H.setOnItemClickListener(new C3647t(this, arrayList));
                        return;
                    }
                    return;
                }
                LinearLayout linearLayout = this.f21702I0;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                LinearLayout linearLayout2 = this.f21706J0;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                }
                listView = this.f21697H;
                if (listView == null) {
                    return;
                }
            } else {
                if (arrayList != null && arrayList.size() > 0) {
                    ListView listView3 = this.f21693G;
                    if (listView3 != null) {
                        listView3.setVisibility(0);
                    }
                    this.f21890z = false;
                    if (this.f21693G != null) {
                        C5865r c5865r = new C5865r(this, arrayList);
                        this.f21760W2 = c5865r;
                        this.f21693G.setAdapter((ListAdapter) c5865r);
                        this.f21693G.setSelection(this.f21775a3);
                        if (!f21663B3) {
                            this.f21693G.requestFocus();
                        }
                        this.f21693G.setOnItemSelectedListener(new C3648u(this));
                        this.f21693G.setOnItemClickListener(new C3649v(this, arrayList));
                        this.f21693G.setOnItemLongClickListener(new C3650w(this));
                        return;
                    }
                    return;
                }
                LinearLayout linearLayout3 = this.f21702I0;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(0);
                }
                LinearLayout linearLayout4 = this.f21706J0;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(0);
                }
                listView = this.f21693G;
                if (listView == null) {
                    return;
                }
            }
            listView.setVisibility(8);
        } catch (Exception e10) {
        }
    }

    /* renamed from: T1 */
    public void m17902T1() {
        m17914Z1();
        this.f21823l2 = new AsyncTaskC3619a0(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "recently_watched");
    }

    /* renamed from: T2 */
    public final void m17903T2(String str, boolean z10) {
        String str2;
        String str3;
        RecyclerView recyclerView;
        LinearLayoutManager linearLayoutManager;
        if (z10 && this.ll_player_header_footer.getVisibility() == 0) {
            this.ll_player_header_footer.startAnimation(this.f21736Q2);
            this.ll_player_header_footer.setVisibility(8);
        }
        this.f21785d3 = str;
        if (str.equals("player")) {
            this.rl_episodes_box_player.startAnimation(this.f21778b3);
            this.rl_episodes_box_player.setVisibility(0);
        }
        String str4 = this.f21799g3;
        if ((str4 != null && str4.equals("-1")) || (((str2 = this.f21799g3) != null && str2.equals("0")) || ((str3 = this.f21799g3) != null && str3.equals("-6")))) {
            String str5 = this.f21799g3;
            this.f21700H2 = str5;
            this.f21704I2 = str5;
        }
        if (this.f21785d3.equals("player")) {
            C5864q c5864q = new C5864q(this.f21782d, this.f21700H2, this.f21785d3, this.f21794f3);
            this.f21756V2 = c5864q;
            this.f21704I2 = this.f21700H2;
            this.recycler_view_left_sidebar_player.setAdapter(c5864q);
            recyclerView = this.recycler_view_left_sidebar_player;
            linearLayoutManager = this.f21772Z2;
        } else {
            C5864q c5864q2 = new C5864q(this.f21782d, this.f21700H2, this.f21785d3, this.f21794f3);
            this.f21752U2 = c5864q2;
            this.f21704I2 = this.f21700H2;
            this.recycler_view_left_sidebar.setAdapter(c5864q2);
            recyclerView = this.recycler_view_left_sidebar;
            linearLayoutManager = this.f21768Y2;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        m17898R1(z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0125, code lost:
    
        if (r6.f21846q0.get(r7).m14816W().equals(r18) != false) goto L37;
     */
    /* renamed from: U1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m17904U1() {
        /*
            Method dump skipped, instructions count: 915
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity.m17904U1():java.lang.String");
    }

    /* renamed from: U2 */
    public final void m17905U2() {
        try {
            new DialogC3639l(this, this).show();
        } catch (Exception e10) {
        }
    }

    /* renamed from: V1 */
    public final void m17906V1(int i10) {
        this.f21767Y1.f14211U = new RunnableC3630g(this);
        PlayerView playerView = this.f21767Y1;
        playerView.f14210T.postDelayed(playerView.f14211U, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ba  */
    @android.annotation.SuppressLint({"SetTextI18n"})
    /* renamed from: V2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> m17907V2(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 1425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity.m17907V2(java.lang.String):java.util.HashMap");
    }

    /* renamed from: W1 */
    public void m17908W1(int i10) {
        this.f21767Y1.f14211U = new RunnableC3628f(this);
        PlayerView playerView = this.f21767Y1;
        playerView.f14210T.postDelayed(playerView.f14211U, i10);
    }

    /* renamed from: W2 */
    public void m17909W2() {
        View view;
        if (this.rl_settings_box.getVisibility() == 8 && this.ll_player_header_footer.getVisibility() == 8) {
            this.f21683D1.removeCallbacksAndMessages(null);
            m17924f3(this.f21685E);
            this.f21833n2 = new AsyncTaskC3629f0(this, this.f21681D, null).execute(new String[0]);
            this.f21679C1.removeCallbacksAndMessages(null);
            this.ll_player_header_footer.startAnimation(this.f21732P2);
            this.ll_bottom_footer_icons.startAnimation(this.f21732P2);
            this.ll_top_right_setting.startAnimation(this.f21732P2);
            this.ll_top_left_back.startAnimation(this.f21732P2);
            this.ll_bottom_footer_icons.setVisibility(0);
            this.ll_top_right_setting.setVisibility(0);
            this.ll_top_left_back.setVisibility(0);
            this.ll_player_header_footer.setVisibility(0);
            try {
                View view2 = this.f21795g;
                if (view2 == null || view2.getVisibility() != 0) {
                    View view3 = this.f21790f;
                    if (view3 == null || view3.getVisibility() != 0) {
                        return;
                    } else {
                        view = this.f21790f;
                    }
                } else {
                    view = this.f21795g;
                }
                view.requestFocus();
            } catch (Exception e10) {
            }
        }
    }

    /* renamed from: X1 */
    public String m17910X1(String str) {
        ArrayList<LiveStreamCategoryIdDBModel> arrayList = this.f21811j0;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<LiveStreamCategoryIdDBModel> it = this.f21811j0.iterator();
            while (it.hasNext()) {
                LiveStreamCategoryIdDBModel next = it.next();
                if (next.m14787b() != null && !next.m14787b().isEmpty() && next.m14787b().equalsIgnoreCase(str)) {
                    this.f21758W0 = next.m14788c();
                }
            }
        }
        return this.f21758W0;
    }

    /* renamed from: X2 */
    public void m17911X2() {
        if (this.ll_player_header_footer.getVisibility() == 8) {
            this.ll_player_header_footer.startAnimation(this.f21732P2);
            this.ll_player_header_footer.setVisibility(0);
            if (this.ll_brightness.getVisibility() == 8) {
                this.ll_brightness.startAnimation(this.f21732P2);
                this.ll_brightness.setVisibility(0);
            }
            if (this.ll_pause_play.getVisibility() == 8) {
                this.ll_pause_play.startAnimation(this.f21732P2);
                this.ll_pause_play.setVisibility(0);
            }
            if (this.ll_volume.getVisibility() == 8) {
                this.ll_volume.startAnimation(this.f21732P2);
                this.ll_volume.setVisibility(0);
            }
        }
    }

    /* renamed from: Y1 */
    public void m17912Y1(int i10, String str, String str2) {
    }

    /* renamed from: Y2 */
    public final void m17913Y2() {
        LinearLayout linearLayout;
        if (this.f21785d3.equals("player")) {
            linearLayout = this.f21875w;
            if (linearLayout == null) {
                return;
            }
        } else {
            linearLayout = this.f21870v;
            if (linearLayout == null) {
                return;
            }
        }
        linearLayout.setVisibility(0);
    }

    /* renamed from: Z1 */
    public final void m17914Z1() {
        AsyncTask asyncTask = this.f21823l2;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            SharepreferenceDBHandler.m15348L(0, this.f21782d);
        } else {
            SharepreferenceDBHandler.m15348L(1, this.f21782d);
            this.f21823l2.cancel(true);
        }
    }

    /* renamed from: Z2 */
    public final void m17915Z2(Activity activity) {
        new DialogC3644q(this, (NSTEXOPlayerSkyTvActivity) activity, activity).show();
    }

    /* renamed from: a3 */
    public final void m17916a3() {
        try {
            if (this.f21884x3 || !C6597k.m30469k0(this.f21849q3)) {
                return;
            }
            this.f21884x3 = true;
            C6597k.m30464Z(this.f21849q3, new DialogInterface.OnDismissListener(this) { // from class: mf.e

                /* renamed from: b */
                public final NSTEXOPlayerSkyTvActivity f34447b;

                {
                    this.f34447b = this;
                }

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f34447b.m17804B2(dialogInterface);
                }
            }).mo2024M(getSupportFragmentManager(), null);
        } catch (Exception e10) {
        }
    }

    /* renamed from: b2 */
    public final void m17917b2() {
        EditText editText = this.et_search_left_side;
        if (editText != null) {
            editText.setText("");
            this.et_search_left_side.clearFocus();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00db, code lost:
    
        if (r9 != null) goto L27;
     */
    /* renamed from: b3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m17918b3() {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity.m17918b3():void");
    }

    /* renamed from: c2 */
    public final void m17919c2() {
        try {
            SearchView searchView = this.f21694G0;
            if (searchView == null || this.f21743S1 == null) {
                return;
            }
            searchView.m1149b0("", false);
            this.f21743S1.collapseActionView();
        } catch (Exception e10) {
        }
    }

    /* renamed from: c3 */
    public void m17920c3() {
        Handler handler = this.f21767Y1.f14210T;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00f2  */
    /* renamed from: d3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int m17921d3() {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity.m17921d3():int");
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
    public final void m17922e3() {
        m17920c3();
        if (this.ll_player_header_footer.getVisibility() == 0) {
            m17936s2();
        } else {
            m17909W2();
            m17906V1(TFTP.DEFAULT_TIMEOUT);
        }
    }

    /* renamed from: f2 */
    public void m17923f2() {
        runOnUiThread(new RunnableC3646s(this));
    }

    /* renamed from: f3 */
    public void m17924f3(String str) {
        if (str != null) {
            try {
                if (!str.equals("")) {
                    if (this.f21835o != null) {
                        C10014t.m42105q(this.f21782d).m42116l(str).m42155k(80, 55).m42154j(2131231571).m42151g(this.f21835o);
                    }
                }
            } catch (Exception e10) {
                ImageView imageView = this.f21835o;
                if (imageView != null) {
                    imageView.setImageDrawable(this.f21782d.getResources().getDrawable(2131231571, null));
                    return;
                }
                return;
            }
        }
        ImageView imageView2 = this.f21835o;
        if (imageView2 != null) {
            imageView2.setImageDrawable(this.f21782d.getResources().getDrawable(2131231571, null));
        }
    }

    /* renamed from: g2 */
    public final void m17925g2() {
        ImageView imageView = this.iv_play;
        imageView.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3623c0(this, imageView));
        ImageView imageView2 = this.iv_pause;
        imageView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3623c0(this, imageView2));
        ImageView imageView3 = this.iv_back;
        imageView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3623c0(this, imageView3));
        ImageView imageView4 = this.iv_audio_subtitle_track;
        imageView4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3623c0(this, imageView4));
        LinearLayout linearLayout = this.ll_channels_list;
        linearLayout.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3623c0(this, linearLayout));
        LinearLayout linearLayout2 = this.ll_previous_channel;
        linearLayout2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3623c0(this, linearLayout2));
        LinearLayout linearLayout3 = this.ll_next_channel;
        linearLayout3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3623c0(this, linearLayout3));
        LinearLayout linearLayout4 = this.ll_crop;
        linearLayout4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3623c0(this, linearLayout4));
        LinearLayout linearLayout5 = this.ll_multi_screen;
        linearLayout5.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3623c0(this, linearLayout5));
        ImageView imageView5 = this.iv_back_episodes;
        imageView5.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3623c0(this, imageView5));
        ImageView imageView6 = this.iv_back_settings;
        imageView6.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3623c0(this, imageView6));
        RelativeLayout relativeLayout = this.rl_search_cat;
        relativeLayout.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3623c0(this, relativeLayout));
    }

    /* renamed from: h2 */
    public void m17926h2() {
        RelativeLayout relativeLayout = this.f21734Q0;
        if (relativeLayout != null) {
            relativeLayout.setPadding(0, 0, 0, 0);
        }
        f21663B3 = true;
        m17920c3();
        m17909W2();
        m17906V1(TFTP.DEFAULT_TIMEOUT);
        String m15383k = SharepreferenceDBHandler.m15383k(this.f21782d);
        if (!SharepreferenceDBHandler.m15385l(this.f21782d).equals("default_native") && !new ExternalPlayerDataBase(this.f21782d).m15130f(m15383k)) {
            SharepreferenceDBHandler.m15356T("default_native", CookieSpecs.DEFAULT, this.f21782d);
        }
        String m15385l = SharepreferenceDBHandler.m15385l(this.f21782d);
        if (m15385l == null || m15385l.equalsIgnoreCase("default_native")) {
            if (C5251a.f30008G.booleanValue()) {
                LinearLayout linearLayout = this.ll_toolbar;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                findViewById(2131427469).setOnClickListener(null);
                this.f21738R0.setVisibility(8);
                this.f21742S0.setVisibility(8);
                this.f21746T0.setVisibility(8);
                getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f21750U0.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                this.f21750U0.setLayoutParams(layoutParams);
                getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
                C7562b2 c7562b2 = this.f21839o3;
                ((c7562b2 == null || !c7562b2.isPlaying()) ? this.f21790f : this.f21795g).requestFocus();
                return;
            }
            return;
        }
        m17891N2();
        this.f21853r2 = true;
        SharedPreferences sharedPreferences = getSharedPreferences("currentlyPlayingVideoPosition", 0);
        this.f21745T = sharedPreferences;
        int i10 = sharedPreferences.getInt("currentlyPlayingVideoPosition", 0);
        ArrayList<LiveStreamsDBModel> m28603g = this.f21760W2.m28603g();
        this.f21711K1 = i10;
        if (m28603g == null || m28603g.size() <= 0 || this.f21711K1 >= m28603g.size()) {
            ArrayList<LiveStreamsDBModel> arrayList = this.f21846q0;
            if (arrayList != null && arrayList.size() > 0 && this.f21711K1 < this.f21846q0.size()) {
                this.f21803h2 = C5255e.m26215R(this.f21846q0.get(this.f21711K1).m14811R());
                this.f21759W1 = this.f21846q0.get(this.f21711K1).m14816W();
                this.f21846q0.get(this.f21711K1).getName();
            }
        } else {
            this.f21803h2 = C5255e.m26215R(m28603g.get(this.f21711K1).m14811R());
            this.f21759W1 = m28603g.get(this.f21711K1).m14816W();
        }
        this.f21673B = this.f21803h2;
        this.f21677C = this.f21759W1;
        f21663B3 = false;
        PlayerView playerView = this.f21767Y1;
        if (playerView != null) {
            playerView.m12507t(Boolean.FALSE);
        }
        if (this.f21755V1.equals("m3u")) {
            if (this.f21788e2.booleanValue()) {
                String m15383k2 = SharepreferenceDBHandler.m15383k(this.f21782d);
                Intent intent = new Intent(this.f21782d, (Class<?>) PlayExternalPlayerActivity.class);
                intent.putExtra("url", this.f21677C);
                intent.putExtra("packagename", m15385l);
                intent.putExtra("app_name", m15383k2);
                this.f21782d.startActivity(intent);
                return;
            }
            return;
        }
        if (this.f21803h2 == -1 || !this.f21788e2.booleanValue()) {
            return;
        }
        String m26203F = C5255e.m26203F(this.f21782d, this.f21803h2, this.f21765Y, "live");
        String m15383k3 = SharepreferenceDBHandler.m15383k(this.f21782d);
        Intent intent2 = new Intent(this.f21782d, (Class<?>) PlayExternalPlayerActivity.class);
        intent2.putExtra("url", m26203F);
        intent2.putExtra("packagename", m15385l);
        intent2.putExtra("app_name", m15383k3);
        this.f21782d.startActivity(intent2);
    }

    /* renamed from: j2 */
    public void m17927j2() {
        DatabaseHandler databaseHandler;
        Context context;
        ArrayList<LiveStreamsDBModel> arrayList;
        try {
            String str = "live";
            if (this.f21755V1.equals("m3u")) {
                new ArrayList();
                LiveStreamDBHandler liveStreamDBHandler = this.f21721N;
                if (liveStreamDBHandler == null) {
                    return;
                }
                ArrayList<FavouriteM3UModel> m15175K1 = liveStreamDBHandler.m15175K1("live");
                ArrayList<LiveStreamsDBModel> arrayList2 = new ArrayList<>();
                ArrayList<String> arrayList3 = this.f21876w0;
                ArrayList<FavouriteM3UModel> arrayList4 = m15175K1;
                if (arrayList3 != null) {
                    arrayList4 = m15175K1;
                    if (arrayList3.size() > 0) {
                        arrayList4 = m15175K1;
                        if (m15175K1 != null) {
                            arrayList4 = m15175K1;
                            if (m15175K1.size() > 0) {
                                arrayList4 = m17934q2(m15175K1, this.f21876w0);
                            }
                        }
                    }
                }
                Iterator<FavouriteM3UModel> it = arrayList4.iterator();
                while (it.hasNext()) {
                    FavouriteM3UModel next = it.next();
                    ArrayList<LiveStreamsDBModel> m15183O1 = this.f21721N.m15183O1(next.m14775a(), next.m14777c());
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
                if (this.f21867u1 == null) {
                    return;
                }
                if (this.f21794f3.equals("true")) {
                    databaseHandler = this.f21867u1;
                    str = "radio_streams";
                    context = this.f21782d;
                } else {
                    databaseHandler = this.f21867u1;
                    context = this.f21782d;
                }
                ArrayList<FavouriteDBModel> m15116v = databaseHandler.m15116v(str, SharepreferenceDBHandler.m15337A(context));
                ArrayList<LiveStreamsDBModel> arrayList5 = new ArrayList<>();
                ArrayList<String> arrayList6 = this.f21876w0;
                ArrayList<FavouriteDBModel> arrayList7 = m15116v;
                if (arrayList6 != null) {
                    arrayList7 = m15116v;
                    if (arrayList6.size() > 0) {
                        arrayList7 = m15116v;
                        if (m15116v != null) {
                            arrayList7 = m15116v;
                            if (m15116v.size() > 0) {
                                arrayList7 = m17933p2(m15116v, this.f21876w0);
                            }
                        }
                    }
                }
                Iterator<FavouriteDBModel> it2 = arrayList7.iterator();
                while (it2.hasNext()) {
                    FavouriteDBModel next2 = it2.next();
                    LiveStreamsDBModel m15179M1 = new LiveStreamDBHandler(this.f21782d).m15179M1(next2.m14760a(), String.valueOf(next2.m14764e()));
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
            this.f21701I = arrayList;
        } catch (Exception e10) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0144, code lost:
    
        if (r6.f21836o0.get(r7).m14816W().equals(r18) != false) goto L39;
     */
    /* renamed from: k2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m17928k2() {
        /*
            Method dump skipped, instructions count: 941
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity.m17928k2():java.lang.String");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:12|(3:14|15|16)(3:73|74|75)|17|18|19|(8:27|28|(4:29|30|31|(5:33|(3:34|35|(2:37|(3:39|40|41)(1:49))(2:50|51))|42|(3:44|45|46)(1:48)|47)(0))|56|(5:60|(3:62|63|64)(1:66)|65|58|57)|67|68|(1:70))(0)|55|56|(2:58|57)|67|68|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x025a, code lost:
    
        if (r6.f21846q0.get(r7).m14816W().equals(r18) != false) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0119 A[Catch: Exception -> 0x04cc, TRY_LEAVE, TryCatch #1 {Exception -> 0x04cc, blocks: (B:56:0x0108, B:58:0x0111, B:60:0x0119, B:63:0x014c), top: B:55:0x0108 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015f A[Catch: Exception -> 0x04be, TryCatch #0 {Exception -> 0x04be, blocks: (B:2:0x0000, B:4:0x0010, B:6:0x0016, B:8:0x0020, B:9:0x0025, B:9:0x0025, B:10:0x0028, B:12:0x0036, B:14:0x0043, B:16:0x004e, B:18:0x0056, B:19:0x0079, B:21:0x008e, B:25:0x009b, B:68:0x0157, B:70:0x015f, B:73:0x0065, B:75:0x0070, B:76:0x0165, B:76:0x0165, B:77:0x0168, B:80:0x01b0, B:82:0x01bd, B:84:0x01dc, B:86:0x0202, B:88:0x020c, B:92:0x0216, B:94:0x0221, B:96:0x022c, B:100:0x0237, B:102:0x0247, B:105:0x025e, B:106:0x027e, B:110:0x03e8, B:114:0x03f2, B:116:0x03fb, B:118:0x0406, B:124:0x0411, B:128:0x0431, B:132:0x0482, B:123:0x04a2, B:138:0x0265, B:142:0x04b2, B:146:0x01f0), top: B:1:0x0000 }] */
    /* renamed from: l2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m17929l2() {
        /*
            Method dump skipped, instructions count: 1233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity.m17929l2():java.lang.String");
    }

    /* renamed from: m2 */
    public int m17930m2(ArrayList<LiveStreamsDBModel> arrayList, int i10) {
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

    /* renamed from: n2 */
    public final ArrayList<String> m17931n2() {
        ArrayList<PasswordStatusDBModel> m15232m1 = this.f21721N.m15232m1(SharepreferenceDBHandler.m15337A(this.f21782d));
        this.f21886y0 = m15232m1;
        if (m15232m1 != null) {
            Iterator<PasswordStatusDBModel> it = m15232m1.iterator();
            while (it.hasNext()) {
                PasswordStatusDBModel next = it.next();
                if (next.m15290a().equals("1")) {
                    this.f21876w0.add(next.m15291b());
                }
            }
        }
        return this.f21876w0;
    }

    /* renamed from: o2 */
    public final boolean m17932o2(ArrayList<LiveStreamsDBModel> arrayList, ArrayList<String> arrayList2) {
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

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 101) {
            try {
                if (m17876A2()) {
                    SharedPreferences sharedPreferences = getSharedPreferences("downloadStatus", 0);
                    f21662A3 = sharedPreferences;
                    String string = sharedPreferences.getString("downloadStatus", "");
                    C5255e c5255e = new C5255e();
                    if (string.equals("processing")) {
                        c5255e.m26262g0(this);
                    } else {
                        c5255e.m26263j0(this, this.f21798g2, this.f21765Y, this.f21786e, this.f21673B, this.f21677C);
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
    
        m17918b3();
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
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity.onBackPressed():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0788  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onClick(android.view.View r6) {
        /*
            Method dump skipped, instructions count: 2208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity.onClick(android.view.View):void");
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m17890N1(configuration);
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r8v0 ??
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
        this.f21690F0.m1224x(2131689495);
        this.f21739R1 = menu;
        this.f21743S1 = menu.getItem(2).getSubMenu().findItem(2131427886);
        if (SharepreferenceDBHandler.m15373f(this.f21782d).equals("api")) {
            menu.getItem(2).getSubMenu().findItem(2131428638).setVisible(false);
        }
        TypedValue typedValue = new TypedValue();
        int i10 = 0;
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f21782d.getResources().getDisplayMetrics());
            i10 = 0;
        }
        while (i10 < this.f21690F0.getChildCount()) {
            if (this.f21690F0.getChildAt(i10) instanceof ActionMenuView) {
                ((Toolbar.C0292e) this.f21690F0.getChildAt(i10).getLayoutParams()).f26228a = 16;
            }
            i10++;
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            m17914Z1();
            m17891N2();
        } catch (Exception e10) {
        }
    }

    @Override // androidx.appcompat.app.ActivityC0243b, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        keyEvent.getRepeatCount();
        keyEvent.getAction();
        if (f21663B3 && this.ll_bottom_footer_icons.getVisibility() == 8 && this.rl_settings_box.getVisibility() == 8 && this.rl_episodes_box_player.getVisibility() == 8) {
            if (i10 == 20) {
                if (!this.f21788e2.booleanValue()) {
                    return true;
                }
                findViewById(2131428477).performClick();
                return true;
            }
            if (i10 == 19) {
                if (!this.f21788e2.booleanValue()) {
                    return true;
                }
                findViewById(2131428446).performClick();
                return true;
            }
        }
        if (i10 == 166) {
            if (!f21663B3 || !this.f21788e2.booleanValue()) {
                return true;
            }
            findViewById(2131428446).performClick();
            return true;
        }
        if (i10 != 167) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (!f21663B3 || !this.f21788e2.booleanValue()) {
            return true;
        }
        findViewById(2131428477).performClick();
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        StringBuilder sb2;
        int i11;
        boolean z10 = keyEvent.getRepeatCount() == 0;
        if (i10 != 62) {
            if (i10 != 66) {
                if (i10 != 79) {
                    if (i10 == 82) {
                        Menu menu = this.f21739R1;
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
                                if (!f21663B3) {
                                    return true;
                                }
                                this.f21687E1.removeCallbacksAndMessages(null);
                                if (i10 == 7) {
                                    this.f21715L1.append(0);
                                } else if (i10 == 8) {
                                    this.f21715L1.append(1);
                                } else {
                                    if (i10 == 9) {
                                        sb2 = this.f21715L1;
                                        i11 = 2;
                                    } else if (i10 == 10) {
                                        this.f21715L1.append(3);
                                    } else if (i10 == 11) {
                                        sb2 = this.f21715L1;
                                        i11 = 4;
                                    } else if (i10 == 12) {
                                        sb2 = this.f21715L1;
                                        i11 = 5;
                                    } else if (i10 == 13) {
                                        sb2 = this.f21715L1;
                                        i11 = 6;
                                    } else if (i10 == 14) {
                                        sb2 = this.f21715L1;
                                        i11 = 7;
                                    } else if (i10 == 15) {
                                        this.f21715L1.append(8);
                                    } else if (i10 == 16) {
                                        this.f21715L1.append(9);
                                    }
                                    sb2.append(i11);
                                }
                                this.f21723N1.setText(this.f21715L1.toString());
                                this.f21719M1.setVisibility(0);
                                this.f21687E1.postDelayed(new RunnableC3651x(this), 3000L);
                                return true;
                            default:
                                switch (i10) {
                                    case 19:
                                    case 20:
                                    case 22:
                                        m17920c3();
                                        m17906V1(TFTP.DEFAULT_TIMEOUT);
                                        return true;
                                    case 21:
                                        m17920c3();
                                        m17906V1(TFTP.DEFAULT_TIMEOUT);
                                        if (!f21663B3 || this.ll_player_header_footer.getVisibility() != 8 || this.rl_episodes_box_player.getVisibility() != 8) {
                                            return true;
                                        }
                                        m17903T2("player", true);
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
            if (!f21663B3) {
                return true;
            }
            C7562b2 c7562b2 = this.f21839o3;
            if (c7562b2 == null || c7562b2.getPlaybackState() != 3) {
                m17922e3();
                return true;
            }
            if (this.rl_settings_box.getVisibility() != 8) {
                return true;
            }
            m17922e3();
            (this.f21839o3.isPlaying() ? this.iv_pause : this.iv_play).requestFocus();
            return true;
        }
        if (!this.f21788e2.booleanValue()) {
            return true;
        }
        C7562b2 c7562b22 = this.f21839o3;
        ((c7562b22 == null || !z10 || c7562b22.isPlaying()) ? this.iv_pause : this.iv_play).performClick();
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.f21743S1 = menuItem;
        int itemId = menuItem.getItemId();
        if (itemId == 2131428761) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == 2131428776) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == 2131427417 && (context = this.f21782d) != null) {
            new DialogC0242a.a(context, 2132082693).setTitle(this.f21782d.getResources().getString(2132017988)).m857e(this.f21782d.getResources().getString(2132017987)).m861i(this.f21782d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3634i(this)).m858f(this.f21782d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3632h(this)).m865m();
        }
        if (itemId == 2131427425) {
            try {
                SearchView searchView = (SearchView) menuItem.getActionView();
                this.f21694G0 = searchView;
                if (searchView != null) {
                    searchView.setQueryHint(getResources().getString(2132018514));
                    this.f21694G0.setIconifiedByDefault(false);
                    ImageView imageView = (ImageView) this.f21694G0.findViewById(2131429120);
                    ((ImageView) this.f21694G0.findViewById(2131429123)).setImageResource(2131231606);
                    imageView.setImageResource(2131231606);
                    imageView.setPadding(15, 15, 15, 15);
                    imageView.setBackground(null);
                    this.f21694G0.setOnQueryTextListener(new C3636j(this));
                    return true;
                }
            } catch (Exception e10) {
            }
        }
        if (itemId == 2131428638 && SharepreferenceDBHandler.m15373f(this.f21782d).equals("m3u")) {
            DialogC0242a.a aVar = new DialogC0242a.a(this);
            aVar.setTitle(this.f21782d.getResources().getString(2132017514));
            aVar.m857e(this.f21782d.getResources().getString(2132017585));
            aVar.m855c(2131231731);
            aVar.m861i(this.f21782d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3640m(this));
            aVar.m858f(this.f21782d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3641n(this));
            aVar.m865m();
        }
        if (itemId == 2131428645) {
            m17915Z2(this);
        }
        if (itemId == 2131428757) {
            m17905U2();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        Handler handler;
        super.onPause();
        try {
            Thread thread = this.f21824l3;
            if (thread != null && thread.isAlive()) {
                this.f21824l3.interrupt();
            }
        } catch (Exception e10) {
        }
        try {
            if (this.f21829m3.booleanValue() || (handler = this.f21691F1) == null) {
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
                m17876A2();
            } else if (Build.VERSION.SDK_INT >= 23 && !shouldShowRequestPermissionRationale(strArr[0])) {
                DialogC0242a.a aVar = new DialogC0242a.a(this, 2132082693);
                View inflate = LayoutInflater.from(this).inflate(2131624461, (ViewGroup) null);
                Button button = (Button) inflate.findViewById(2131427646);
                Button button2 = (Button) inflate.findViewById(2131427636);
                button.setOnFocusChangeListener(new C5255e.i(button, this));
                button2.setOnFocusChangeListener(new C5255e.i(button2, this));
                button.setOnClickListener(new ViewOnClickListenerC3643p(this));
                button2.setOnClickListener(new ViewOnClickListenerC3645r(this));
                aVar.setView(inflate);
                this.f21780c2 = aVar.create();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = this.f21780c2.getWindow();
                Objects.requireNonNull(window);
                Window window2 = window;
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = -1;
                layoutParams.height = -2;
                this.f21780c2.show();
                this.f21780c2.getWindow().setAttributes(layoutParams);
                this.f21780c2.setCancelable(false);
                this.f21780c2.show();
            }
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f21824l3;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC3652y(this));
            this.f21824l3 = thread2;
            thread2.start();
        }
        C5255e.m26233f(this.f21782d);
        if (this.f21853r2) {
            this.f21853r2 = false;
            m17918b3();
        } else if (this.f21839o3 == null) {
            m17942y2();
        }
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onStop() {
        super.onStop();
        try {
            m17891N2();
        } catch (Exception e10) {
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            m17890N1(getResources().getConfiguration());
        }
    }

    /* renamed from: p2 */
    public final ArrayList<FavouriteDBModel> m17933p2(ArrayList<FavouriteDBModel> arrayList, ArrayList<String> arrayList2) {
        boolean z10;
        try {
            this.f21674B0 = new ArrayList<>();
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
                    this.f21674B0.add(next);
                }
            }
        } catch (Exception e10) {
        }
        return this.f21674B0;
    }

    /* renamed from: q2 */
    public final ArrayList<FavouriteM3UModel> m17934q2(ArrayList<FavouriteM3UModel> arrayList, ArrayList<String> arrayList2) {
        boolean z10;
        this.f21678C0 = new ArrayList<>();
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
                        this.f21678C0.add(next);
                    }
                }
            }
            return this.f21678C0;
        } catch (Exception e10) {
            return null;
        }
    }

    /* renamed from: r2 */
    public final void m17935r2() {
        ProgressBar progressBar = this.f21865u;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
        TextView textView = this.f21840p;
        if (textView != null) {
            textView.setText(this.f21782d.getResources().getString(2132018252));
        }
        TextView textView2 = this.f21845q;
        if (textView2 != null) {
            textView2.setText("");
        }
        TextView textView3 = this.f21850r;
        if (textView3 != null) {
            textView3.setText(this.f21782d.getResources().getString(2132018186));
        }
        TextView textView4 = this.f21855s;
        if (textView4 != null) {
            textView4.setText("");
        }
    }

    /* renamed from: s2 */
    public final void m17936s2() {
        if (this.ll_player_header_footer.getVisibility() == 0) {
            this.ll_player_header_footer.startAnimation(this.f21736Q2);
            this.ll_bottom_footer_icons.startAnimation(this.f21736Q2);
            this.ll_top_right_setting.startAnimation(this.f21736Q2);
            this.ll_top_left_back.startAnimation(this.f21736Q2);
            if (this.ll_brightness.getVisibility() == 0) {
                this.ll_brightness.startAnimation(this.f21736Q2);
            }
            if (this.ll_pause_play.getVisibility() == 0) {
                this.ll_pause_play.startAnimation(this.f21736Q2);
            }
            if (this.ll_volume.getVisibility() == 0) {
                this.ll_volume.startAnimation(this.f21736Q2);
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
    public void m17937t2() {
        if (this.ll_player_header_footer.getVisibility() == 0) {
            this.ll_player_header_footer.startAnimation(this.f21736Q2);
            if (this.ll_brightness.getVisibility() == 0) {
                this.ll_brightness.startAnimation(this.f21736Q2);
            }
            if (this.ll_pause_play.getVisibility() == 0) {
                this.ll_pause_play.startAnimation(this.f21736Q2);
            }
            if (this.ll_volume.getVisibility() == 0) {
                this.ll_volume.startAnimation(this.f21736Q2);
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

    public void toggleView(View view) {
        if (view.getVisibility() == 8) {
            view.setVisibility(0);
        } else if (view.getVisibility() == 0) {
            view.setVisibility(8);
        }
    }

    /* renamed from: u2 */
    public final void m17938u2() {
        LinearLayout linearLayout = this.f21870v;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f21875w;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    /* renamed from: v2 */
    public void m17939v2() {
        LinearLayout linearLayout = this.ll_no_cat_found;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.ll_no_cat_found_player;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    /* renamed from: w2 */
    public void m17940w2() {
        try {
            ProgressDialog progressDialog = this.f21838o2;
            if (progressDialog == null || !progressDialog.isShowing()) {
                return;
            }
            this.f21838o2.dismiss();
        } catch (Exception e10) {
        }
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
    /* renamed from: x2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m17941x2() {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity.m17941x2():boolean");
    }

    /* renamed from: y2 */
    public final void m17942y2() {
        try {
            this.f21825m.setVisibility(8);
        } catch (Exception e10) {
        }
        if (this.f21859s3 != null) {
            m17891N2();
            if (this.f21839o3 == null) {
                InterfaceC7639z1 m30437b = C6588b.m30437b(this, false);
                C0103k c0103k = new C0103k(this.f21844p3);
                C9882f c9882f = new C9882f(this);
                this.f21849q3 = c9882f;
                c9882f.m41643L(this.f21854r3);
                C7562b2 m32510z = new C7562b2.b(this, m30437b).m32508A(c0103k).m32509B(this.f21849q3).m32510z();
                this.f21839o3 = m32510z;
                m32510z.mo32447g(new C3627e0(this, null));
                this.f21839o3.m32422M0(new C4372l(this.f21849q3));
                this.f21839o3.m32466q1(C7972d.f38501f, true);
                this.f21839o3.mo32456l(true);
                this.f21767Y1.setPlayer(this.f21839o3);
            }
            this.f21839o3.m32639Q(0, C7561b1.m32344b(this.f21859s3));
            this.f21839o3.prepare();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0a1d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0b0a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0b20  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0b48  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0c83  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0ca0  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0a24  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x05c5  */
    /* renamed from: z2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m17943z2() {
        /*
            Method dump skipped, instructions count: 3237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity.m17943z2():void");
    }
}

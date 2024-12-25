package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.R;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.app.DialogC0242a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0304c1;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.C0704c;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.maxdigitall.maxdigitaliptvbox.miscelleneious.chromecastfeature.ExpandedControlsActivity;
import com.maxdigitall.maxdigitaliptvbox.model.EpisodesUsingSinglton;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.callback.GetEpisdoeDetailsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.SearchTMDBTVShowsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.SeasonsDetailCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.SeriesDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBCastsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBTVShowsInfoCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBTrailerCallback;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.ExternalPlayerDataBase;
import com.maxdigitall.maxdigitaliptvbox.model.database.SeriesRecentWatchDatabase;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.ExternalPlayerModelClass;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.CastAdapter;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.EpisodeDetailAdapter;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.SeasonsButtonAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import nf.C6783a;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.json.JSONArray;
import org.json.JSONObject;
import org.simpleframework.xml.strategy.Name;
import p050d0.C4290b;
import p082ef.C4718a;
import p151if.C5251a;
import p151if.C5255e;
import p170jf.C5374f;
import p170jf.C5375g;
import p188kd.AbstractC5557j;
import p216m9.C5938b;
import p216m9.C5947e;
import p230n9.C6721i;
import p324sf.InterfaceC8571j;
import p324sf.InterfaceC8572k;
import p428yg.C10014t;
import p428yg.InterfaceC9993c0;
import p428yg.InterfaceC9996e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity.class */
public class SeriesDetailActivity extends ActivityC0243b implements View.OnClickListener, InterfaceC8571j, InterfaceC8572k {

    /* renamed from: G */
    public DatabaseHandler f18483G;

    /* renamed from: H */
    public PopupWindow f18484H;

    /* renamed from: I */
    public Button f18485I;

    /* renamed from: J */
    public String f18486J;

    /* renamed from: K */
    public String f18487K;

    /* renamed from: L */
    public TextView f18488L;

    /* renamed from: M */
    public TextView f18489M;

    /* renamed from: N */
    public MenuItem f18490N;

    /* renamed from: O */
    public Menu f18491O;

    /* renamed from: P */
    public Button f18492P;

    /* renamed from: R */
    public C5374f f18494R;

    /* renamed from: S */
    public C5375g f18495S;

    /* renamed from: W */
    public SharedPreferences f18499W;

    /* renamed from: X */
    public SharedPreferences.Editor f18500X;

    /* renamed from: Z */
    public EpisodeDetailAdapter f18502Z;

    @BindView
    public AppBarLayout appbarToolbar;

    @BindView
    public TextView cast_tab;

    @BindView
    public TextView episode_tab;

    /* renamed from: f0 */
    public SeasonsButtonAdapter f18506f0;

    /* renamed from: h0 */
    public JSONArray f18510h0;

    @BindView
    public ImageView ivFavourite;

    @BindView
    public ImageView ivMovieImage;

    @BindView
    public ImageView iv_back_button;

    /* renamed from: j0 */
    public PopupWindow f18514j0;

    /* renamed from: l0 */
    public SeriesRecentWatchDatabase f18518l0;

    @BindView
    public LinearLayout llCastBox;

    @BindView
    public LinearLayout llCastBoxInfo;

    @BindView
    public LinearLayout llDirectorBox;

    @BindView
    public LinearLayout llDirectorBoxInfo;

    @BindView
    public LinearLayout llDurationBox;

    @BindView
    public LinearLayout llDurationBoxInfo;

    @BindView
    public LinearLayout llGenreBox;

    @BindView
    public LinearLayout llGenreBoxInfo;

    @BindView
    public LinearLayout llMovieInfoBox;

    @BindView
    public LinearLayout llReleasedBox;

    @BindView
    public LinearLayout llReleasedBoxInfo;

    @BindView
    public LinearLayout ll_play_button_main_layout;

    @BindView
    public LinearLayout ll_season_button_main_layout;

    @BindView
    public LinearLayout ll_watch_trailer;

    @BindView
    public LinearLayout ll_watch_trailer_button_main_layout;

    @BindView
    public ImageView logo;

    /* renamed from: m0 */
    public int f18520m0;

    @BindView
    public RecyclerView myRecyclerView;

    @BindView
    public NestedScrollView nestedScrollView;

    /* renamed from: o0 */
    public C5947e f18524o0;

    /* renamed from: p */
    public int f18525p;

    @BindView
    public ProgressBar pb_button_recent_watch;

    /* renamed from: q */
    public ImageView f18527q;

    /* renamed from: r */
    public CastAdapter f18529r;

    @BindView
    public RatingBar ratingBar;

    @BindView
    public RelativeLayout rlAccountInfo;

    @BindView
    public RelativeLayout rlTransparent;

    @BindView
    public RecyclerView rvCast;

    /* renamed from: s */
    public Context f18531s;

    @BindView
    public ScrollView scrollView;

    /* renamed from: t */
    public ProgressDialog f18533t;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tvCast;

    @BindView
    public TextView tvCastInfo;

    @BindView
    public TextView tvDirector;

    @BindView
    public TextView tvDirectorInfo;

    @BindView
    public TextView tvMovieDuration;

    @BindView
    public TextView tvMovieDurationInfo;

    @BindView
    public TextView tvMovieGenere;

    @BindView
    public TextView tvMovieName;

    @BindView
    public TextView tvPlay;

    @BindView
    public TextView tvReadMore;

    @BindView
    public TextView tvReleaseDate;

    @BindView
    public TextView tvReleaseDateInfo;

    @BindView
    public TextView tvSeasonButton;

    @BindView
    public TextView tvWatchTrailer;

    @BindView
    public TextView tv_genre_info;

    /* renamed from: u */
    public SharedPreferences f18535u;

    /* renamed from: d */
    public String f18503d = "";

    /* renamed from: e */
    public String f18504e = "";

    /* renamed from: f */
    public String f18505f = "";

    /* renamed from: g */
    public String f18507g = "";

    /* renamed from: h */
    public String f18509h = "";

    /* renamed from: i */
    public String f18511i = "";

    /* renamed from: j */
    public String f18513j = "";

    /* renamed from: k */
    public String f18515k = "";

    /* renamed from: l */
    public String f18517l = "";

    /* renamed from: m */
    public String f18519m = "";

    /* renamed from: n */
    public String f18521n = "";

    /* renamed from: o */
    public String f18523o = "";

    /* renamed from: v */
    public DatabaseUpdatedStatusDBModel f18537v = new DatabaseUpdatedStatusDBModel();

    /* renamed from: w */
    public DatabaseUpdatedStatusDBModel f18539w = new DatabaseUpdatedStatusDBModel();

    /* renamed from: x */
    public String f18540x = "";

    /* renamed from: y */
    public String f18541y = "";

    /* renamed from: z */
    public String f18542z = "";

    /* renamed from: A */
    public String f18477A = "";

    /* renamed from: B */
    public String f18478B = "";

    /* renamed from: C */
    public String f18479C = "";

    /* renamed from: D */
    public String f18480D = "";

    /* renamed from: E */
    public int f18481E = -1;

    /* renamed from: F */
    public String f18482F = "";

    /* renamed from: Q */
    public String f18493Q = "";

    /* renamed from: T */
    public ArrayList<GetEpisdoeDetailsCallback> f18496T = new ArrayList<>();

    /* renamed from: U */
    public ArrayList<SeasonsDetailCallback> f18497U = new ArrayList<>();

    /* renamed from: V */
    public String f18498V = "";

    /* renamed from: Y */
    public ArrayList<GetEpisdoeDetailsCallback> f18501Y = new ArrayList<>();

    /* renamed from: g0 */
    public List<SeriesDBModel> f18508g0 = new ArrayList();

    /* renamed from: i0 */
    public ArrayList<GetEpisdoeDetailsCallback> f18512i0 = new ArrayList<>();

    /* renamed from: k0 */
    public ArrayList<Integer> f18516k0 = new ArrayList<>();

    /* renamed from: n0 */
    public boolean f18522n0 = false;

    /* renamed from: p0 */
    public int f18526p0 = 0;

    /* renamed from: q0 */
    public String f18528q0 = "";

    /* renamed from: r0 */
    public String f18530r0 = "";

    /* renamed from: s0 */
    public String f18532s0 = "";

    /* renamed from: t0 */
    public int f18534t0 = 0;

    /* renamed from: u0 */
    public int f18536u0 = 0;

    /* renamed from: v0 */
    public String f18538v0 = "mobile";

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$a.class */
    public class DialogInterfaceOnClickListenerC3069a implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesDetailActivity f18543b;

        public DialogInterfaceOnClickListenerC3069a(SeriesDetailActivity seriesDetailActivity) {
            this.f18543b = seriesDetailActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f18543b.f18531s);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$b.class */
    public class DialogInterfaceOnClickListenerC3070b implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesDetailActivity f18544b;

        public DialogInterfaceOnClickListenerC3070b(SeriesDetailActivity seriesDetailActivity) {
            this.f18544b = seriesDetailActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f18544b.f18531s);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$c.class */
    public class DialogInterfaceOnClickListenerC3071c implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesDetailActivity f18545b;

        public DialogInterfaceOnClickListenerC3071c(SeriesDetailActivity seriesDetailActivity) {
            this.f18545b = seriesDetailActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$d.class */
    public class DialogInterfaceOnClickListenerC3072d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesDetailActivity f18546b;

        public DialogInterfaceOnClickListenerC3072d(SeriesDetailActivity seriesDetailActivity) {
            this.f18546b = seriesDetailActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$e.class */
    public class DialogInterfaceOnClickListenerC3073e implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesDetailActivity f18547b;

        public DialogInterfaceOnClickListenerC3073e(SeriesDetailActivity seriesDetailActivity) {
            this.f18547b = seriesDetailActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$f.class */
    public class C3074f implements C0304c1.d {

        /* renamed from: a */
        public final ArrayList f18548a;

        /* renamed from: b */
        public final SeriesDetailActivity f18549b;

        public C3074f(SeriesDetailActivity seriesDetailActivity, ArrayList arrayList) {
            this.f18549b = seriesDetailActivity;
            this.f18548a = arrayList;
        }

        @Override // androidx.appcompat.widget.C0304c1.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                ArrayList arrayList = this.f18548a;
                if (arrayList != null && arrayList.size() > 0) {
                    for (int i10 = 0; i10 < this.f18548a.size(); i10++) {
                        if (menuItem.getItemId() == i10) {
                            if (menuItem.getItemId() == 0) {
                                C5255e.m26219V(this.f18549b.f18531s, "", this.f18549b.f18526p0, "series", this.f18549b.f18528q0, "0", this.f18549b.f18530r0, null, "");
                            } else {
                                String m26252s = C5255e.m26252s(C5255e.m26202E(this.f18549b.f18531s, this.f18549b.f18526p0, this.f18549b.f18528q0, "series"));
                                Intent intent = new Intent(this.f18549b.f18531s, (Class<?>) PlayExternalPlayerActivity.class);
                                intent.putExtra("url", m26252s);
                                intent.putExtra("app_name", ((ExternalPlayerModelClass) this.f18548a.get(i10)).m15415a());
                                intent.putExtra("packagename", ((ExternalPlayerModelClass) this.f18548a.get(i10)).m15416b());
                                this.f18549b.f18531s.startActivity(intent);
                            }
                        }
                    }
                }
                return false;
            } catch (Exception e10) {
                return false;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$g.class */
    public class C3075g implements C0304c1.c {

        /* renamed from: a */
        public final SeriesDetailActivity f18550a;

        public C3075g(SeriesDetailActivity seriesDetailActivity) {
            this.f18550a = seriesDetailActivity;
        }

        @Override // androidx.appcompat.widget.C0304c1.c
        /* renamed from: a */
        public void mo1281a(C0304c1 c0304c1) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$h.class */
    public class ViewOnClickListenerC3076h implements View.OnClickListener {

        /* renamed from: b */
        public final SeriesDetailActivity f18551b;

        public ViewOnClickListenerC3076h(SeriesDetailActivity seriesDetailActivity) {
            this.f18551b = seriesDetailActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f18551b.f18514j0.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$i.class */
    public class ViewOnClickListenerC3077i implements View.OnClickListener {

        /* renamed from: b */
        public final SeriesDetailActivity f18552b;

        public ViewOnClickListenerC3077i(SeriesDetailActivity seriesDetailActivity) {
            this.f18552b = seriesDetailActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f18552b.f18484H.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$j.class */
    public class ViewOnClickListenerC3078j implements View.OnClickListener {

        /* renamed from: b */
        public final SeriesDetailActivity f18553b;

        public ViewOnClickListenerC3078j(SeriesDetailActivity seriesDetailActivity) {
            this.f18553b = seriesDetailActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f18553b.episode_tab.setBackgroundResource(2131231009);
            this.f18553b.cast_tab.setBackgroundResource(2131231006);
            RecyclerView recyclerView = this.f18553b.rvCast;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            RecyclerView recyclerView2 = this.f18553b.myRecyclerView;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$k.class */
    public class ViewOnClickListenerC3079k implements View.OnClickListener {

        /* renamed from: b */
        public final SeriesDetailActivity f18554b;

        public ViewOnClickListenerC3079k(SeriesDetailActivity seriesDetailActivity) {
            this.f18554b = seriesDetailActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f18554b.f18484H.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$l.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$l.class */
    public class ViewOnClickListenerC3080l implements View.OnClickListener {

        /* renamed from: b */
        public final SeriesDetailActivity f18555b;

        public ViewOnClickListenerC3080l(SeriesDetailActivity seriesDetailActivity) {
            this.f18555b = seriesDetailActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f18555b.f18484H.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$m.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity$m */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$m.class */
    public class ViewOnClickListenerC3081m implements View.OnClickListener {

        /* renamed from: b */
        public final SeriesDetailActivity f18556b;

        public ViewOnClickListenerC3081m(SeriesDetailActivity seriesDetailActivity) {
            this.f18556b = seriesDetailActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f18556b.cast_tab.setBackgroundResource(2131231009);
            this.f18556b.episode_tab.setBackgroundResource(2131231006);
            RecyclerView recyclerView = this.f18556b.myRecyclerView;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            RecyclerView recyclerView2 = this.f18556b.rvCast;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$n.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity$n */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$n.class */
    public class ViewOnClickListenerC3082n implements View.OnClickListener {

        /* renamed from: b */
        public final SeriesDetailActivity f18557b;

        public ViewOnClickListenerC3082n(SeriesDetailActivity seriesDetailActivity) {
            this.f18557b = seriesDetailActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f18557b.f18531s);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$o.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity$o */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$o.class */
    public class ViewOnClickListenerC3083o implements View.OnClickListener {

        /* renamed from: b */
        public final SeriesDetailActivity f18558b;

        public ViewOnClickListenerC3083o(SeriesDetailActivity seriesDetailActivity) {
            this.f18558b = seriesDetailActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f18558b.onBackPressed();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$p.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity$p */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$p.class */
    public class C3084p implements InterfaceC9993c0 {

        /* renamed from: a */
        public final SeriesDetailActivity f18559a;

        public C3084p(SeriesDetailActivity seriesDetailActivity) {
            this.f18559a = seriesDetailActivity;
        }

        @Override // p428yg.InterfaceC9993c0
        /* renamed from: a */
        public void mo16616a(Drawable drawable) {
            Log.d("TAG", "FAILED");
        }

        @Override // p428yg.InterfaceC9993c0
        /* renamed from: b */
        public void mo16617b(Bitmap bitmap, C10014t.e eVar) {
            this.f18559a.appbarToolbar.setBackground(new BitmapDrawable(this.f18559a.f18531s.getResources(), bitmap));
            SeriesDetailActivity seriesDetailActivity = this.f18559a;
            seriesDetailActivity.rlTransparent.setBackgroundColor(seriesDetailActivity.getResources().getColor(2131100140));
            SeriesDetailActivity seriesDetailActivity2 = this.f18559a;
            seriesDetailActivity2.toolbar.setBackgroundColor(seriesDetailActivity2.getResources().getColor(2131100140));
        }

        @Override // p428yg.InterfaceC9993c0
        /* renamed from: c */
        public void mo16618c(Drawable drawable) {
            Log.d("TAG", "Prepare Load");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$q.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity$q */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$q.class */
    public class ViewOnClickListenerC3085q implements View.OnClickListener {

        /* renamed from: b */
        public final Context f18560b;

        /* renamed from: c */
        public final SeriesDetailActivity f18561c;

        public ViewOnClickListenerC3085q(SeriesDetailActivity seriesDetailActivity, Context context) {
            this.f18561c = seriesDetailActivity;
            this.f18560b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                DatabaseHandler databaseHandler = this.f18561c.f18483G;
                SeriesDetailActivity seriesDetailActivity = this.f18561c;
                if (databaseHandler.m15112o(seriesDetailActivity.f18525p, seriesDetailActivity.f18515k, "series", SharepreferenceDBHandler.m15337A(this.f18560b)).size() > 0) {
                    this.f18561c.m16601O0();
                } else {
                    this.f18561c.m16594H0();
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$r.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity$r */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$r.class */
    public class C3086r implements InterfaceC9996e {

        /* renamed from: a */
        public final SeriesDetailActivity f18562a;

        public C3086r(SeriesDetailActivity seriesDetailActivity) {
            this.f18562a = seriesDetailActivity;
        }

        @Override // p428yg.InterfaceC9996e
        /* renamed from: a */
        public void mo15848a() {
            this.f18562a.ivMovieImage.setBackgroundResource(2131231660);
        }

        @Override // p428yg.InterfaceC9996e
        public void onSuccess() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$s.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity$s */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$s.class */
    public class ViewOnClickListenerC3087s implements View.OnClickListener {

        /* renamed from: b */
        public final SeriesDetailActivity f18563b;

        public ViewOnClickListenerC3087s(SeriesDetailActivity seriesDetailActivity) {
            this.f18563b = seriesDetailActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f18563b.m16600N0(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$t.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity$t */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$t.class */
    public class DialogInterfaceOnClickListenerC3088t implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesDetailActivity f18564b;

        public DialogInterfaceOnClickListenerC3088t(SeriesDetailActivity seriesDetailActivity) {
            this.f18564b = seriesDetailActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$u.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity$u */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$u.class */
    public class AsyncTaskC3089u extends AsyncTask<String, Void, List<String>> {

        /* renamed from: a */
        public final SeriesDetailActivity f18565a;

        public AsyncTaskC3089u(SeriesDetailActivity seriesDetailActivity) {
            this.f18565a = seriesDetailActivity;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<String> doInBackground(String... strArr) {
            try {
                return this.f18565a.m16609X0();
            } catch (Exception e10) {
                Log.e("honeya", "doInBackground: " + e10.getMessage());
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(List<String> list) {
            TextView textView;
            super.onPostExecute(list);
            if (list != null) {
                try {
                    if (list.get(0) != null && !list.get(0).equals("") && (textView = this.f18565a.tvPlay) != null) {
                        textView.setText(list.get(0));
                    }
                    if (list.get(1) != null && !list.get(1).equals("") && this.f18565a.pb_button_recent_watch != null) {
                        if (list.get(1).equals("gone")) {
                            this.f18565a.pb_button_recent_watch.setVisibility(8);
                        }
                        if (list.get(1).equals("visible")) {
                            this.f18565a.pb_button_recent_watch.setVisibility(0);
                        }
                    }
                    if (list.get(2) != null && !list.get(2).equals("") && this.f18565a.pb_button_recent_watch != null) {
                        if (!list.get(2).equals("0")) {
                            this.f18565a.pb_button_recent_watch.setProgress(C5255e.m26215R(list.get(2)));
                            this.f18565a.pb_button_recent_watch.setVisibility(0);
                        } else if (this.f18565a.pb_button_recent_watch.getVisibility() == 0) {
                            this.f18565a.pb_button_recent_watch.setProgress(C5255e.m26215R(list.get(2)));
                            this.f18565a.pb_button_recent_watch.setVisibility(8);
                        }
                    }
                } catch (Exception e10) {
                    return;
                }
            }
            if (this.f18565a.f18502Z != null) {
                this.f18565a.f18502Z.m4099w();
            } else {
                SeriesDetailActivity seriesDetailActivity = this.f18565a;
                if (seriesDetailActivity.myRecyclerView != null) {
                    seriesDetailActivity.f18502Z = new EpisodeDetailAdapter(seriesDetailActivity.f18531s, this.f18565a.f18511i, null, this.f18565a.f18508g0, "", this.f18565a.f18538v0);
                    SeriesDetailActivity seriesDetailActivity2 = this.f18565a;
                    seriesDetailActivity2.myRecyclerView.setAdapter(seriesDetailActivity2.f18502Z);
                }
            }
            if (this.f18565a.f18533t == null || !this.f18565a.f18533t.isShowing()) {
                return;
            }
            this.f18565a.f18533t.dismiss();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (this.f18565a.f18533t == null || this.f18565a.f18533t.isShowing()) {
                return;
            }
            this.f18565a.f18533t.show();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$v.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity$v */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesDetailActivity$v.class */
    public class ViewOnFocusChangeListenerC3090v implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f18566b;

        /* renamed from: c */
        public final SeriesDetailActivity f18567c;

        public ViewOnFocusChangeListenerC3090v(SeriesDetailActivity seriesDetailActivity, View view) {
            this.f18567c = seriesDetailActivity;
            this.f18566b = view;
        }

        /* renamed from: a */
        public final void m16621a(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18566b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: b */
        public final void m16622b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18566b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v199, types: [android.view.View] */
        /* JADX WARN: Type inference failed for: r0v79, types: [android.view.View] */
        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            View view2;
            int i10;
            int i11;
            int i12;
            Button button;
            TextView textView;
            TextView textView2;
            LinearLayout linearLayout;
            float f10 = 1.0f;
            if (!z10) {
                if (z10 || (view2 = this.f18566b) == null || view2.getTag() == null) {
                    return;
                }
                if (z10) {
                    f10 = 1.09f;
                }
                m16621a(f10);
                m16622b(f10);
                i10 = 2131231768;
                if (!this.f18566b.getTag().equals("1")) {
                    if (!this.f18566b.getTag().equals("2")) {
                        if (!this.f18566b.getTag().equals("3")) {
                            if (!this.f18566b.getTag().equals("5")) {
                                if (this.f18566b.getTag() == null || !this.f18566b.getTag().equals("8")) {
                                    if (this.f18566b.getTag() != null && this.f18566b.getTag().equals("10")) {
                                        RecyclerView recyclerView = this.f18567c.myRecyclerView;
                                        i11 = 2131231006;
                                        if (recyclerView != null) {
                                            i11 = 2131231006;
                                            if (recyclerView.getVisibility() == 0) {
                                                i12 = 2131231007;
                                                textView2 = this.f18567c.episode_tab;
                                                textView2.setBackgroundResource(i12);
                                                return;
                                            }
                                        }
                                        textView = this.f18567c.episode_tab;
                                        textView.setBackgroundResource(i11);
                                    }
                                    if (this.f18566b.getTag() == null || !this.f18566b.getTag().equals("11")) {
                                        return;
                                    }
                                    this.f18567c.cast_tab.setBackgroundResource(2131231006);
                                    RecyclerView recyclerView2 = this.f18567c.rvCast;
                                    i11 = 2131231006;
                                    if (recyclerView2 != null) {
                                        i11 = 2131231006;
                                        if (recyclerView2.getVisibility() == 0) {
                                            i12 = 2131231007;
                                            textView2 = this.f18567c.cast_tab;
                                            textView2.setBackgroundResource(i12);
                                            return;
                                        }
                                    }
                                    textView = this.f18567c.cast_tab;
                                    textView.setBackgroundResource(i11);
                                }
                                button = this.f18567c.f18492P;
                            }
                            linearLayout = this.f18567c.ll_watch_trailer_button_main_layout;
                            linearLayout.setBackgroundResource(i10);
                            return;
                        }
                        button = this.f18566b;
                        button.setBackgroundResource(2131230845);
                        return;
                    }
                    linearLayout = this.f18567c.ll_season_button_main_layout;
                    linearLayout.setBackgroundResource(i10);
                    return;
                }
                linearLayout = this.f18567c.ll_play_button_main_layout;
                linearLayout.setBackgroundResource(i10);
                return;
            }
            if (z10) {
                f10 = 1.05f;
            }
            View view3 = this.f18566b;
            if (view3 == null || view3.getTag() == null) {
                return;
            }
            i10 = 2131230846;
            if (this.f18566b.getTag().equals("1")) {
                m16621a(f10);
                m16622b(f10);
                linearLayout = this.f18567c.ll_play_button_main_layout;
                linearLayout.setBackgroundResource(i10);
                return;
            }
            if (this.f18566b.getTag().equals("2")) {
                m16621a(f10);
                m16622b(f10);
                linearLayout = this.f18567c.ll_season_button_main_layout;
                linearLayout.setBackgroundResource(i10);
                return;
            }
            if (this.f18566b.getTag().equals("3")) {
                m16621a(f10);
                m16622b(f10);
                linearLayout = this.f18566b;
                linearLayout.setBackgroundResource(i10);
                return;
            }
            if (this.f18566b.getTag().equals("5")) {
                m16621a(f10);
                m16622b(f10);
                linearLayout = this.f18567c.ll_watch_trailer_button_main_layout;
                linearLayout.setBackgroundResource(i10);
                return;
            }
            View view4 = this.f18566b;
            if (view4 != null && view4.getTag() != null && this.f18566b.getTag().equals("8")) {
                m16621a(f10);
                m16622b(f10);
                this.f18567c.f18492P.setBackgroundResource(2131230828);
                return;
            }
            View view5 = this.f18566b;
            if (view5 != null && view5.getTag() != null && this.f18566b.getTag().equals("10")) {
                RecyclerView recyclerView3 = this.f18567c.myRecyclerView;
                i11 = 2131231008;
                if (recyclerView3 != null) {
                    i11 = 2131231008;
                    if (recyclerView3.getVisibility() == 0) {
                        i12 = 2131231009;
                        textView2 = this.f18567c.episode_tab;
                        textView2.setBackgroundResource(i12);
                        return;
                    }
                }
                textView = this.f18567c.episode_tab;
                textView.setBackgroundResource(i11);
            }
            View view6 = this.f18566b;
            if (view6 == null || view6.getTag() == null || !this.f18566b.getTag().equals("11")) {
                View view7 = this.f18566b;
                float f11 = (view7 == null || view7.getTag() == null || !this.f18566b.getTag().equals("12")) ? 1.15f : 1.2f;
                m16621a(f11);
                m16622b(f11);
                return;
            }
            RecyclerView recyclerView4 = this.f18567c.rvCast;
            i11 = 2131231008;
            if (recyclerView4 != null) {
                i11 = 2131231008;
                if (recyclerView4.getVisibility() == 0) {
                    i12 = 2131231009;
                    textView2 = this.f18567c.cast_tab;
                    textView2.setBackgroundResource(i12);
                    return;
                }
            }
            textView = this.f18567c.cast_tab;
            textView.setBackgroundResource(i11);
        }
    }

    @Override // p324sf.InterfaceC8572k
    /* renamed from: C */
    public void mo16593C(String str) {
    }

    /* renamed from: H0 */
    public final void m16594H0() {
        try {
            FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
            favouriteDBModel.m14767h(this.f18515k);
            favouriteDBModel.m14772m(this.f18525p);
            favouriteDBModel.m14770k(this.f18503d);
            favouriteDBModel.m14771l(this.f18480D);
            favouriteDBModel.m14774o(SharepreferenceDBHandler.m15337A(this.f18531s));
            this.f18483G.m15111l(favouriteDBModel, "series");
            if (Build.VERSION.SDK_INT <= 21) {
                this.ivFavourite.setImageResource(2131231090);
            }
            this.ivFavourite.setImageDrawable(this.f18531s.getResources().getDrawable(2131231090, null));
        } catch (Exception e10) {
        }
    }

    /* renamed from: I0 */
    public final void m16595I0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(50:4|5|(1:135)(1:9)|10|11|(1:13)(1:134)|14|15|16|(1:133)(1:20)|21|22|(1:132)(1:26)|27|28|(1:131)(1:32)|33|34|(1:130)(1:38)|39|40|(1:129)(1:44)|45|46|(1:128)(1:50)|51|52|53|(1:55)|56|(3:57|58|(1:124)(1:62))|63|(3:64|65|(1:120)(1:69))|70|(2:71|72)|(5:74|75|76|77|(13:79|80|81|82|(5:84|85|86|87|(8:89|90|91|92|(5:94|95|96|97|(3:99|100|101))|105|100|101))|111|90|91|92|(0)|105|100|101))|117|80|81|82|(0)|111|90|91|92|(0)|105|100|101|2) */
    /* JADX WARN: Can't wrap try/catch for region: R(53:4|5|(1:135)(1:9)|10|11|(1:13)(1:134)|14|15|16|(1:133)(1:20)|21|22|(1:132)(1:26)|27|28|(1:131)(1:32)|33|34|(1:130)(1:38)|39|40|(1:129)(1:44)|45|46|(1:128)(1:50)|51|52|53|(1:55)|56|57|58|(1:124)(1:62)|63|(3:64|65|(1:120)(1:69))|70|71|72|(5:74|75|76|77|(13:79|80|81|82|(5:84|85|86|87|(8:89|90|91|92|(5:94|95|96|97|(3:99|100|101))|105|100|101))|111|90|91|92|(0)|105|100|101))|117|80|81|82|(0)|111|90|91|92|(0)|105|100|101|2) */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02aa A[Catch: Exception -> 0x02dd, TryCatch #2 {Exception -> 0x02dd, blocks: (B:82:0x02a1, B:84:0x02aa), top: B:81:0x02a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02f1 A[Catch: Exception -> 0x0324, TryCatch #7 {Exception -> 0x0324, blocks: (B:92:0x02e8, B:94:0x02f1), top: B:91:0x02e8 }] */
    /* renamed from: J0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m16596J0(org.json.JSONArray r5, int r6) {
        /*
            Method dump skipped, instructions count: 885
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity.m16596J0(org.json.JSONArray, int):void");
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: K0 */
    public void m16597K0() {
        getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    /* renamed from: L0 */
    public final void m16598L0() {
        TextView textView = this.tvMovieName;
        if (textView != null) {
            textView.setSelected(true);
        }
        if (this.f18538v0.equals("mobile")) {
            try {
                this.f18524o0 = C5938b.m29235e(this.f18531s).m29243c().m29358c();
            } catch (Exception e10) {
            }
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f18533t = progressDialog;
        progressDialog.setCanceledOnTouchOutside(false);
        this.f18533t.setMessage(this.f18531s.getResources().getString(2132018352));
        this.f18533t.show();
        this.f18518l0 = new SeriesRecentWatchDatabase(this.f18531s);
        SharedPreferences sharedPreferences = getSharedPreferences("sort_episodes", 0);
        this.f18499W = sharedPreferences;
        this.f18500X = sharedPreferences.edit();
        if (this.f18499W.getString("sort", "").equals("")) {
            this.f18500X.putString("sort", "0");
            this.f18500X.apply();
        }
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
            this.myRecyclerView.setItemAnimator(new C0704c());
        }
        this.f18483G = new DatabaseHandler(this.f18531s);
        this.tvPlay.requestFocus();
        this.tvPlay.setFocusable(true);
        SharedPreferences sharedPreferences2 = getSharedPreferences("loginPrefs", 0);
        this.f18535u = sharedPreferences2;
        String string = sharedPreferences2.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        String string2 = this.f18535u.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        if (string == null || string2 == null || string.isEmpty() || string2.isEmpty()) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else {
            m16608W0(this.f18531s, string, string2);
        }
    }

    /* renamed from: M0 */
    public final void m16599M0(SeriesDetailActivity seriesDetailActivity) {
        View inflate = ((LayoutInflater) seriesDetailActivity.getSystemService("layout_inflater")).inflate(2131624241, (RelativeLayout) seriesDetailActivity.findViewById(2131429033));
        PopupWindow popupWindow = new PopupWindow(seriesDetailActivity);
        this.f18484H = popupWindow;
        popupWindow.setContentView(inflate);
        this.f18484H.setWidth(-1);
        this.f18484H.setHeight(-1);
        this.f18484H.setFocusable(true);
        this.f18484H.setBackgroundDrawable(new BitmapDrawable());
        this.f18484H.showAtLocation(inflate, 17, 0, 0);
        this.f18492P = (Button) inflate.findViewById(2131427623);
        TextView textView = (TextView) inflate.findViewById(2131427916);
        this.f18485I = (Button) inflate.findViewById(2131427605);
        textView.setText("Series trailer is not available");
        Button button = this.f18492P;
        if (button != null) {
            button.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3090v(this, button));
        }
        Button button2 = this.f18485I;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3090v(this, button2));
        }
        this.f18485I.setOnClickListener(new ViewOnClickListenerC3079k(this));
        this.f18492P.setOnClickListener(new ViewOnClickListenerC3080l(this));
    }

    /* renamed from: N0 */
    public final void m16600N0(View view) {
        if (this.f18538v0.equals("mobile")) {
            try {
                this.f18524o0 = C5938b.m29235e(this.f18531s).m29243c().m29358c();
            } catch (Exception e10) {
            }
        }
        try {
            C5947e c5947e = this.f18524o0;
            if (c5947e != null && c5947e.m29348c()) {
                String str = this.f18531s.getResources().getString(2132018529) + " - " + this.f18534t0;
                String m26252s = C5255e.m26252s(C5255e.m26202E(this.f18531s, this.f18526p0, this.f18528q0, "series"));
                C5947e c5947e2 = this.f18524o0;
                String str2 = "";
                if (c5947e2 != null) {
                    str2 = "";
                    if (c5947e2.m29290r() != null) {
                        str2 = "";
                        if (this.f18524o0.m29290r().m31009j() != null) {
                            str2 = "";
                            if (this.f18524o0.m29290r().m31009j().m13058R() != null) {
                                str2 = this.f18524o0.m29290r().m31009j().m13058R();
                            }
                        }
                    }
                }
                if (str2.equals(m26252s)) {
                    this.f18531s.startActivity(new Intent(this.f18531s, (Class<?>) ExpandedControlsActivity.class));
                    return;
                } else {
                    C4718a.m23743c(this.f18536u0, true, C4718a.m23741a(this.f18530r0, str, "", 0, m26252s, "videos/mp4", this.f18532s0, "", null), this.f18524o0, this.f18531s);
                    return;
                }
            }
            new ArrayList();
            ArrayList arrayList = new ArrayList();
            C0304c1 c0304c1 = new C0304c1(this, view);
            c0304c1.m1276c().inflate(2131689489, c0304c1.m1275b());
            ArrayList<ExternalPlayerModelClass> m15132o = new ExternalPlayerDataBase(this.f18531s).m15132o();
            if (m15132o == null || m15132o.size() <= 0) {
                C5255e.m26219V(this.f18531s, "", this.f18526p0, "series", this.f18528q0, "0", this.f18530r0, null, "");
                return;
            }
            c0304c1.m1275b().add(0, 0, 0, this.f18531s.getResources().getString(2132018170));
            ExternalPlayerModelClass externalPlayerModelClass = new ExternalPlayerModelClass();
            externalPlayerModelClass.m15419e(0);
            externalPlayerModelClass.m15418d(this.f18531s.getResources().getString(2132018328));
            arrayList.add(externalPlayerModelClass);
            int i10 = 0;
            while (true) {
                int i11 = i10;
                if (i11 >= m15132o.size()) {
                    c0304c1.m1279f(new C3074f(this, arrayList));
                    c0304c1.m1278e(new C3075g(this));
                    c0304c1.m1280g();
                    return;
                }
                Menu m1275b = c0304c1.m1275b();
                int i12 = i11 + 1;
                m1275b.add(0, i12, 0, this.f18531s.getResources().getString(2132018328) + " " + m15132o.get(i11).m15415a());
                arrayList.add(m15132o.get(i11));
                i10 = i12;
            }
        } catch (Exception e11) {
        }
    }

    /* renamed from: O0 */
    public final void m16601O0() {
        try {
            this.f18483G.m15115t(this.f18525p, this.f18515k, "series", this.f18503d, SharepreferenceDBHandler.m15337A(this.f18531s));
            if (Build.VERSION.SDK_INT <= 21) {
                this.ivFavourite.setImageResource(2131231091);
            }
            this.ivFavourite.setImageDrawable(this.f18531s.getResources().getDrawable(2131231091, null));
        } catch (Exception e10) {
        }
    }

    /* renamed from: P0 */
    public void m16602P0() {
        new AsyncTaskC3089u(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    /* renamed from: Q0 */
    public final void m16603Q0(JSONObject jSONObject) {
        try {
            SeasonsDetailCallback seasonsDetailCallback = new SeasonsDetailCallback();
            if (jSONObject.getString("air_date") == null || jSONObject.getString("air_date").isEmpty()) {
                seasonsDetailCallback.m15017d("");
            } else {
                seasonsDetailCallback.m15017d(jSONObject.getString("air_date"));
            }
            seasonsDetailCallback.m15020g((jSONObject.getString("episode_count") == null || jSONObject.getInt("episode_count") == -1 || jSONObject.getInt("episode_count") == 0) ? -1 : Integer.valueOf(jSONObject.getInt("episode_count")));
            seasonsDetailCallback.m15021h((jSONObject.getInt(Name.MARK) == -1 || jSONObject.getInt(Name.MARK) == 0) ? -1 : Integer.valueOf(jSONObject.getInt(Name.MARK)));
            if (jSONObject.getString("name") == null || jSONObject.getString("name").isEmpty()) {
                seasonsDetailCallback.m15022i("");
            } else {
                seasonsDetailCallback.m15022i(jSONObject.getString("name"));
            }
            if (jSONObject.getString("overview") == null || jSONObject.getString("overview").isEmpty()) {
                seasonsDetailCallback.m15023j("");
            } else {
                seasonsDetailCallback.m15023j(jSONObject.getString("overview"));
            }
            seasonsDetailCallback.m15024k((jSONObject.getInt("season_number") == -1 || jSONObject.getInt("season_number") == 0) ? -1 : Integer.valueOf(jSONObject.getInt("season_number")));
            try {
                if (jSONObject.getString("cover") == null || jSONObject.getString("cover").isEmpty()) {
                    seasonsDetailCallback.m15018e("");
                } else {
                    String string = jSONObject.getString("cover");
                    this.f18498V = string;
                    seasonsDetailCallback.m15018e(string);
                }
            } catch (Exception e10) {
                seasonsDetailCallback.m15018e("");
            }
            try {
                if (jSONObject.getString("cover_big") == null || jSONObject.getString("cover_big").isEmpty()) {
                    seasonsDetailCallback.m15019f("");
                } else {
                    String string2 = jSONObject.getString("cover_big");
                    this.f18498V = string2;
                    seasonsDetailCallback.m15019f(string2);
                }
            } catch (Exception e11) {
                seasonsDetailCallback.m15019f("");
            }
            this.f18497U.add(seasonsDetailCallback);
        } catch (Exception e12) {
        }
    }

    /* renamed from: R0 */
    public final void m16604R0(JSONObject jSONObject, String str) {
        try {
            SeasonsDetailCallback seasonsDetailCallback = new SeasonsDetailCallback();
            if (((JSONObject) jSONObject.get(str)).getString("air_date") == null || ((JSONObject) jSONObject.get(str)).getString("air_date").isEmpty()) {
                seasonsDetailCallback.m15017d("");
            } else {
                seasonsDetailCallback.m15017d(((JSONObject) jSONObject.get(str)).getString("air_date"));
            }
            seasonsDetailCallback.m15020g((((JSONObject) jSONObject.get(str)).getString("episode_count") == null || Integer.valueOf(((JSONObject) jSONObject.get(str)).getInt("episode_count")).intValue() == -1 || Integer.valueOf(((JSONObject) jSONObject.get(str)).getInt("episode_count")).intValue() == 0) ? -1 : Integer.valueOf(((JSONObject) jSONObject.get(str)).getInt("episode_count")));
            seasonsDetailCallback.m15021h((Integer.valueOf(((JSONObject) jSONObject.get(str)).getInt(Name.MARK)) == null || Integer.valueOf(((JSONObject) jSONObject.get(str)).getInt(Name.MARK)).intValue() == -1 || Integer.valueOf(((JSONObject) jSONObject.get(str)).getInt(Name.MARK)).intValue() == 0) ? -1 : Integer.valueOf(((JSONObject) jSONObject.get(str)).getInt(Name.MARK)));
            if (((JSONObject) jSONObject.get(str)).getString("name") == null || ((JSONObject) jSONObject.get(str)).getString("name").isEmpty()) {
                seasonsDetailCallback.m15022i("");
            } else {
                seasonsDetailCallback.m15022i(((JSONObject) jSONObject.get(str)).getString("name"));
            }
            if (((JSONObject) jSONObject.get(str)).getString("overview") == null || ((JSONObject) jSONObject.get(str)).getString("overview").isEmpty()) {
                seasonsDetailCallback.m15023j("");
            } else {
                seasonsDetailCallback.m15023j(((JSONObject) jSONObject.get(str)).getString("overview"));
            }
            seasonsDetailCallback.m15024k((Integer.valueOf(((JSONObject) jSONObject.get(str)).getInt("season_number")) == null || Integer.valueOf(((JSONObject) jSONObject.get(str)).getInt("season_number")).intValue() == -1 || Integer.valueOf(((JSONObject) jSONObject.get(str)).getInt("season_number")).intValue() == 0) ? -1 : Integer.valueOf(((JSONObject) jSONObject.get(str)).getInt("season_number")));
            try {
                if (((JSONObject) jSONObject.get(str)).getString("cover") == null || ((JSONObject) jSONObject.get(str)).getString("cover").isEmpty()) {
                    seasonsDetailCallback.m15018e("");
                } else {
                    String string = ((JSONObject) jSONObject.get(str)).getString("cover");
                    this.f18498V = string;
                    seasonsDetailCallback.m15018e(string);
                }
            } catch (Exception e10) {
                seasonsDetailCallback.m15018e("");
            }
            try {
                if (((JSONObject) jSONObject.get(str)).getString("cover_big") == null || ((JSONObject) jSONObject.get(str)).getString("cover_big").isEmpty()) {
                    seasonsDetailCallback.m15019f("");
                } else {
                    String string2 = ((JSONObject) jSONObject.get(str)).getString("cover_big");
                    this.f18498V = string2;
                    seasonsDetailCallback.m15019f(string2);
                }
            } catch (Exception e11) {
                seasonsDetailCallback.m15019f("");
            }
            this.f18497U.add(seasonsDetailCallback);
        } catch (Exception e12) {
        }
    }

    @SuppressLint({"ResourceType"})
    /* renamed from: S0 */
    public final void m16605S0(Context context) {
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(this.f18538v0.equals("mobile") ? 2131624502 : 2131624503, (ViewGroup) null);
        PopupWindow popupWindow = new PopupWindow(context);
        this.f18514j0 = popupWindow;
        popupWindow.setContentView(inflate);
        this.f18514j0.setWidth(-1);
        this.f18514j0.setHeight(-1);
        this.f18514j0.setFocusable(true);
        this.f18514j0.showAtLocation(inflate, 0, 0, 0);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(2131429130);
        TextView textView = (TextView) inflate.findViewById(2131429389);
        if (textView != null) {
            textView.setOnClickListener(new ViewOnClickListenerC3076h(this));
        }
        if (recyclerView != null) {
            try {
                recyclerView.setLayoutManager(new GridLayoutManager((Context) this, 4, 1, false));
                recyclerView.setItemAnimator(new C0704c());
                ArrayList<Integer> arrayList = this.f18516k0;
                if (arrayList == null || arrayList.size() <= 0) {
                    return;
                }
                SeasonsButtonAdapter seasonsButtonAdapter = new SeasonsButtonAdapter(context, this.f18516k0, this.f18514j0, this.f18520m0);
                this.f18506f0 = seasonsButtonAdapter;
                recyclerView.setAdapter(seasonsButtonAdapter);
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x043c A[Catch: Exception -> 0x05da, TryCatch #5 {Exception -> 0x05da, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x001c, B:8:0x0024, B:10:0x0063, B:14:0x0113, B:16:0x0121, B:20:0x0131, B:22:0x0151, B:24:0x0171, B:26:0x01a9, B:28:0x01b3, B:33:0x021d, B:37:0x0268, B:54:0x02fc, B:57:0x030f, B:59:0x0319, B:56:0x032a, B:80:0x0333, B:82:0x033f, B:84:0x035b, B:86:0x036b, B:88:0x0374, B:92:0x0395, B:106:0x040a, B:107:0x0419, B:124:0x0424, B:126:0x043c, B:128:0x0453, B:131:0x0459, B:133:0x0460, B:135:0x046b, B:137:0x0473, B:140:0x04c1, B:142:0x04cc, B:147:0x04ec, B:150:0x054b, B:150:0x054b, B:151:0x054e, B:153:0x0560, B:155:0x0568, B:156:0x0572, B:156:0x0572, B:157:0x0575, B:165:0x05bc, B:169:0x0071, B:171:0x007c, B:173:0x00b4, B:175:0x00be, B:177:0x00ff, B:179:0x0109, B:183:0x05c0, B:185:0x05ca, B:187:0x05d2), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0453 A[SYNTHETIC] */
    @android.annotation.SuppressLint({"SetTextI18n"})
    /* renamed from: T0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m16606T0() {
        /*
            Method dump skipped, instructions count: 1536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity.m16606T0():void");
    }

    /* renamed from: V0 */
    public final void m16607V0(SeriesDetailActivity seriesDetailActivity) {
        View inflate = ((LayoutInflater) seriesDetailActivity.getSystemService("layout_inflater")).inflate(2131624235, (RelativeLayout) seriesDetailActivity.findViewById(2131429033));
        this.f18488L = (TextView) inflate.findViewById(2131429376);
        TextView textView = (TextView) inflate.findViewById(2131429550);
        this.f18489M = textView;
        textView.setText(getResources().getString(2132018358));
        this.f18488L.setText(this.f18486J);
        PopupWindow popupWindow = new PopupWindow(seriesDetailActivity);
        this.f18484H = popupWindow;
        popupWindow.setContentView(inflate);
        this.f18484H.setWidth(-1);
        this.f18484H.setHeight(-1);
        this.f18484H.setFocusable(true);
        this.f18484H.showAtLocation(inflate, 17, 0, 0);
        Button button = (Button) inflate.findViewById(2131427605);
        this.f18485I = button;
        if (button != null) {
            button.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3090v(this, button));
        }
        this.f18485I.setOnClickListener(new ViewOnClickListenerC3077i(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02ac  */
    /* renamed from: W0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m16608W0(android.content.Context r7, java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 1195
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity.m16608W0(android.content.Context, java.lang.String, java.lang.String):void");
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: X0 */
    public List<String> m16609X0() {
        boolean z10;
        Object obj;
        int i10;
        int i11;
        int i12;
        String m14954f;
        int i13;
        int i14;
        int i15;
        String valueOf;
        Object obj2;
        ArrayList arrayList = new ArrayList();
        ArrayList<GetEpisdoeDetailsCallback> m15328o0 = this.f18518l0.m15328o0(this.f18517l);
        String str = "";
        if (m15328o0 == null || m15328o0.size() <= 0) {
            if (this.tvPlay != null) {
                str = getResources().getString(2132018602) + " - S" + this.f18520m0 + ":E1";
            } else {
                str = "";
            }
            if (this.pb_button_recent_watch != null) {
                z10 = false;
                obj = "gone";
            } else {
                z10 = false;
                obj = "";
            }
        } else {
            obj = "";
            z10 = true;
        }
        ArrayList<GetEpisdoeDetailsCallback> arrayList2 = this.f18501Y;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return null;
        }
        this.f18512i0.clear();
        EpisodeDetailAdapter episodeDetailAdapter = this.f18502Z;
        if (episodeDetailAdapter != null) {
            episodeDetailAdapter.m17089w0();
        }
        ArrayList<GetEpisdoeDetailsCallback> m15336y = this.f18518l0.m15336y("getalldata");
        String str2 = "0";
        int i16 = 0;
        while (i16 < this.f18501Y.size()) {
            String str3 = str;
            Object obj3 = obj;
            String str4 = str2;
            if (z10) {
                str3 = str;
                obj3 = obj;
                str4 = str2;
                if (this.f18501Y.get(i16).m14958j().equals(m15328o0.get(0).m14958j())) {
                    if (this.tvPlay != null) {
                        str = getResources().getString(2132018604) + " - S" + this.f18501Y.get(i16).m14964p() + ":E" + this.f18501Y.get(i16).m14956h();
                        try {
                            this.f18526p0 = C5255e.m26215R(this.f18501Y.get(i16).m14958j());
                        } catch (Exception e10) {
                        }
                        this.f18528q0 = this.f18501Y.get(i16).m14951c();
                        this.f18530r0 = this.f18501Y.get(i16).m14969u();
                        this.f18532s0 = this.f18501Y.get(i16).m14962n();
                        this.f18534t0 = this.f18501Y.get(i16).m14964p().intValue();
                    }
                    str3 = str;
                    obj3 = obj;
                    str4 = str2;
                    if (this.pb_button_recent_watch != null) {
                        try {
                            int m26215R = C5255e.m26215R(m15328o0.get(0).m14955g());
                            i14 = Math.round(m26215R / 1000.0f);
                            try {
                                this.f18536u0 = m26215R;
                                i13 = C5255e.m26215R(this.f18501Y.get(i16).m14954f());
                                if (i13 == 0) {
                                    try {
                                        i13 = C5255e.m26215R(m15328o0.get(0).m14954f());
                                    } catch (Exception e11) {
                                    }
                                } else {
                                    i13 = C5255e.m26215R(this.f18501Y.get(i16).m14954f());
                                }
                            } catch (Exception e12) {
                                i13 = 0;
                            }
                        } catch (Exception e13) {
                            i13 = 0;
                            i14 = 0;
                        }
                        try {
                            i15 = Math.round((i14 / i13) * 100.0f);
                        } catch (Exception e14) {
                            i15 = 0;
                        }
                        if (i15 != 0) {
                            valueOf = String.valueOf(i15);
                            obj2 = "visible";
                        } else {
                            str3 = str;
                            obj3 = obj;
                            str4 = str2;
                            if (this.pb_button_recent_watch.getVisibility() == 0) {
                                valueOf = String.valueOf(i15);
                                obj2 = "gone";
                            }
                        }
                        str3 = str;
                        obj3 = obj2;
                        str4 = valueOf;
                    }
                }
            }
            if (this.f18501Y.get(i16).m14964p().equals(Integer.valueOf(this.f18520m0))) {
                GetEpisdoeDetailsCallback getEpisdoeDetailsCallback = this.f18501Y.get(i16);
                int i17 = 0;
                while (true) {
                    if (i17 >= m15336y.size()) {
                        break;
                    }
                    if (this.f18501Y.get(i16).m14958j().equals(m15336y.get(i17).m14958j())) {
                        getEpisdoeDetailsCallback.m14934D(m15336y.get(i17).m14955g());
                        try {
                            i10 = Math.round(C5255e.m26215R(m15336y.get(i17).m14955g()) / 1000.0f);
                            try {
                                int m26215R2 = C5255e.m26215R(getEpisdoeDetailsCallback.m14954f());
                                if (m26215R2 == 0) {
                                    try {
                                        m14954f = m15336y.get(i17).m14954f();
                                    } catch (Exception e15) {
                                        i11 = m26215R2;
                                    }
                                } else {
                                    m14954f = getEpisdoeDetailsCallback.m14954f();
                                }
                                i11 = C5255e.m26215R(m14954f);
                            } catch (Exception e16) {
                                i11 = 0;
                                i12 = Math.round((i10 / i11) * 100.0f);
                                getEpisdoeDetailsCallback.m14936F(i12);
                                this.f18512i0.add(getEpisdoeDetailsCallback);
                                i16++;
                                str = str3;
                                obj = obj3;
                                str2 = str4;
                            }
                        } catch (Exception e17) {
                            i10 = 0;
                        }
                        try {
                            i12 = Math.round((i10 / i11) * 100.0f);
                        } catch (Exception e18) {
                            i12 = 0;
                        }
                        getEpisdoeDetailsCallback.m14936F(i12);
                    } else {
                        i17++;
                    }
                }
                this.f18512i0.add(getEpisdoeDetailsCallback);
            }
            i16++;
            str = str3;
            obj = obj3;
            str2 = str4;
        }
        ArrayList<GetEpisdoeDetailsCallback> arrayList3 = this.f18512i0;
        if (arrayList3 == null || arrayList3.size() <= 0 || this.myRecyclerView == null) {
            return null;
        }
        if (!z10) {
            try {
                this.f18526p0 = C5255e.m26215R(this.f18512i0.get(0).m14958j());
            } catch (Exception e19) {
            }
            this.f18528q0 = this.f18512i0.get(0).m14951c();
            this.f18530r0 = this.f18512i0.get(0).m14969u();
            this.f18536u0 = C5255e.m26215R(this.f18512i0.get(0).m14955g());
            this.f18532s0 = this.f18512i0.get(0).m14962n();
            this.f18534t0 = this.f18512i0.get(0).m14964p().intValue();
        }
        EpisodesUsingSinglton.m14753c().m14758f(this.f18501Y);
        EpisodesUsingSinglton.m14753c().m14757e(this.f18512i0);
        arrayList.add(str);
        arrayList.add(obj);
        arrayList.add(str2);
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:72|73|(3:74|75|76)|(5:77|78|(2:93|94)(1:80)|81|82)|83|84|85|86) */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0376, code lost:
    
        r12 = 0;
     */
    @android.annotation.SuppressLint({"SetTextI18n"})
    /* renamed from: Y0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m16610Y0(int r10) {
        /*
            Method dump skipped, instructions count: 1346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity.m16610Y0(int):void");
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: a */
    public void mo15996a() {
    }

    @Override // p324sf.InterfaceC8572k
    /* renamed from: a0 */
    public void mo16611a0(AbstractC5557j abstractC5557j) {
        JSONArray jSONArray;
        if (abstractC5557j != null) {
            try {
                JSONObject jSONObject = new JSONObject(abstractC5557j.toString());
                String string = jSONObject.getString("seasons");
                String string2 = jSONObject.getString("episodes");
                try {
                    if (jSONObject.getJSONObject("info").getJSONArray("backdrop_path") != null) {
                        this.f18510h0 = jSONObject.getJSONObject("info").getJSONArray("backdrop_path");
                    }
                    if (this.appbarToolbar != null && (jSONArray = this.f18510h0) != null && jSONArray.length() > 0) {
                        this.f18523o = this.f18510h0.get(new Random().nextInt(this.f18510h0.length())).toString();
                        Context context = this.f18531s;
                        if (context != null) {
                            C10014t.m42105q(context).m42116l(this.f18523o).m42153i(new C3084p(this));
                        }
                    }
                } catch (Exception e10) {
                }
                if (!string.equals("[]")) {
                    try {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("seasons");
                        int length = jSONArray2.length();
                        this.f18497U.clear();
                        for (int i10 = 0; i10 < length; i10++) {
                            if (jSONArray2.get(i10) instanceof JSONObject) {
                                m16603Q0((JSONObject) jSONArray2.get(i10));
                            }
                        }
                    } catch (Exception e11) {
                    }
                    try {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("seasons");
                        Iterator<String> keys = jSONObject2.keys();
                        this.f18497U.clear();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            if (jSONObject2.get(next) instanceof JSONObject) {
                                m16604R0(jSONObject2, next);
                            }
                        }
                    } catch (Exception e12) {
                    }
                }
                if (!string2.equals("[]")) {
                    try {
                        JSONArray jSONArray3 = jSONObject.getJSONArray("episodes");
                        int length2 = jSONArray3.length();
                        this.f18496T.clear();
                        for (int i11 = 0; i11 < length2; i11++) {
                            if (jSONArray3.get(i11) instanceof JSONArray) {
                                JSONArray jSONArray4 = new JSONArray(jSONArray3.get(i11).toString());
                                m16596J0(jSONArray4, jSONArray4.length());
                            }
                        }
                    } catch (Exception e13) {
                    }
                    JSONObject jSONObject3 = jSONObject.getJSONObject("episodes");
                    this.f18496T.clear();
                    Iterator<String> keys2 = jSONObject3.keys();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        if (jSONObject3.get(next2) instanceof JSONArray) {
                            JSONArray jSONArray5 = new JSONArray(jSONObject3.get(next2).toString());
                            m16596J0(jSONArray5, jSONArray5.length());
                        }
                    }
                }
            } catch (Exception e14) {
            }
        }
        m16606T0();
        this.f18494R.m26722d(this.f18503d);
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: b */
    public void mo15997b() {
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: c */
    public void mo15998c(String str) {
        try {
            ProgressDialog progressDialog = this.f18533t;
            if (progressDialog == null || !progressDialog.isShowing()) {
                return;
            }
            this.f18533t.dismiss();
            Toast.makeText(this, this.f18531s.getResources().getString(2132018606), 1).show();
        } catch (Exception e10) {
        }
    }

    @Override // p324sf.InterfaceC8571j
    /* renamed from: c0 */
    public void mo16612c0(TMDBTVShowsInfoCallback tMDBTVShowsInfoCallback) {
    }

    @Override // androidx.appcompat.app.ActivityC0243b, p030c0.ActivityC0952l, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        boolean z10 = keyEvent.getAction() == 0;
        if (keyCode == 82) {
            return z10 ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // p324sf.InterfaceC8571j
    /* renamed from: k */
    public void mo16613k(TMDBTrailerCallback tMDBTrailerCallback) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        PopupWindow popupWindow = this.f18514j0;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.f18514j0.dismiss();
            return;
        }
        EpisodeDetailAdapter episodeDetailAdapter = this.f18502Z;
        if (episodeDetailAdapter != null) {
            episodeDetailAdapter.m17089w0();
        }
        C5251a.f30023V = true;
        overridePendingTransition(2130772003, 2130772000);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != 2131429468) {
            return;
        }
        startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i10;
        this.f18531s = this;
        super.onCreate(bundle);
        m16597K0();
        if (new C6783a(this.f18531s).m31288z().equals(C5251a.f30065s0)) {
            this.f18538v0 = "tv";
            i10 = 2131624054;
        } else {
            this.f18538v0 = "mobile";
            i10 = 2131624052;
        }
        setContentView(i10);
        ButterKnife.m5626a(this);
        overridePendingTransition(2130772003, 2130772000);
        AppBarLayout appBarLayout = this.appbarToolbar;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(2131230975));
        }
        TextView textView = this.tvPlay;
        if (textView != null) {
            textView.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3090v(this, textView));
        }
        TextView textView2 = this.tvSeasonButton;
        if (textView2 != null) {
            textView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3090v(this, textView2));
        }
        TextView textView3 = this.tvReadMore;
        if (textView3 != null) {
            textView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3090v(this, textView3));
        }
        TextView textView4 = this.tvWatchTrailer;
        if (textView4 != null) {
            textView4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3090v(this, textView4));
        }
        this.f18522n0 = true;
        this.f18501Y.clear();
        TextView textView5 = this.episode_tab;
        if (textView5 != null) {
            textView5.setOnClickListener(new ViewOnClickListenerC3078j(this));
            TextView textView6 = this.episode_tab;
            textView6.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3090v(this, textView6));
        }
        TextView textView7 = this.cast_tab;
        if (textView7 != null) {
            textView7.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3090v(this, textView7));
            this.cast_tab.setOnClickListener(new ViewOnClickListenerC3081m(this));
        }
        getWindow().setFlags(1024, 1024);
        m878n0((Toolbar) findViewById(2131429320));
        m16595I0();
        m16598L0();
        this.logo.setOnClickListener(new ViewOnClickListenerC3082n(this));
        this.iv_back_button.setOnClickListener(new ViewOnClickListenerC3083o(this));
        ImageView imageView = this.f18527q;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.m1224x(2131689500);
        this.f18491O = menu;
        this.f18490N = menu.getItem(1).getSubMenu().findItem(2131427886);
        if (SharepreferenceDBHandler.m15373f(this.f18531s).equals("api")) {
            menu.getItem(1).getSubMenu().findItem(2131428637).setVisible(false);
        }
        TypedValue typedValue = new TypedValue();
        int i10 = 0;
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
            i10 = 0;
        }
        while (i10 < this.toolbar.getChildCount()) {
            if (this.toolbar.getChildAt(i10) instanceof ActionMenuView) {
                ((Toolbar.C0292e) this.toolbar.getChildAt(i10).getLayoutParams()).f26228a = 16;
            }
            i10++;
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onDestroy() {
        C6721i m29290r;
        super.onDestroy();
        try {
            EpisodeDetailAdapter episodeDetailAdapter = this.f18502Z;
            if (episodeDetailAdapter != null) {
                episodeDetailAdapter.m17089w0();
            }
            C5947e c5947e = this.f18524o0;
            if (c5947e == null || this.f18502Z == null || (m29290r = c5947e.m29290r()) == null) {
                return;
            }
            m29290r.m30996W(this.f18502Z.f19680L);
        } catch (Exception e10) {
        }
    }

    @Override // androidx.appcompat.app.ActivityC0243b, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 20) {
            if (i10 != 19) {
                return super.onKeyDown(i10, keyEvent);
            }
            View currentFocus = getCurrentFocus();
            if ((currentFocus == null || currentFocus.getTag() == null || !currentFocus.getTag().equals("11")) && (currentFocus == null || currentFocus.getTag() == null || !currentFocus.getTag().equals("10"))) {
                return false;
            }
            this.scrollView.setVisibility(0);
            return false;
        }
        View currentFocus2 = getCurrentFocus();
        if ((currentFocus2 == null || currentFocus2.getTag() == null || !currentFocus2.getTag().equals("11")) && (currentFocus2 == null || currentFocus2.getTag() == null || !currentFocus2.getTag().equals("10"))) {
            return false;
        }
        this.scrollView.setVisibility(8);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView != null && recyclerView.getVisibility() == 0) {
            C5251a.f30025X = true;
            C5251a.f30024W = 0;
            EpisodeDetailAdapter episodeDetailAdapter = this.f18502Z;
            if (episodeDetailAdapter != null) {
                episodeDetailAdapter.m4099w();
            }
        }
        RecyclerView recyclerView2 = this.rvCast;
        if (recyclerView2 == null || recyclerView2.getVisibility() != 0) {
            return false;
        }
        this.rvCast.requestFocus();
        return false;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 82) {
            return super.onKeyUp(i10, keyEvent);
        }
        Menu menu = this.f18491O;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(2131427886, 0);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.f18490N = menuItem;
        int itemId = menuItem.getItemId();
        if (itemId == 2131428761) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == 2131428776) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == 2131427416 && (context = this.f18531s) != null) {
            new DialogC0242a.a(context, 2132082693).setTitle(getResources().getString(2132017988)).m857e(getResources().getString(2132017987)).m861i(getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3069a(this)).m858f(getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3088t(this)).m865m();
        }
        if (itemId == 2131428637) {
            DialogC0242a.a aVar = new DialogC0242a.a(this);
            aVar.setTitle(this.f18531s.getResources().getString(2132017514));
            aVar.m857e(this.f18531s.getResources().getString(2132017585));
            aVar.m855c(2131231731);
            aVar.m861i(this.f18531s.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3070b(this));
            aVar.m858f(this.f18531s.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3071c(this));
            aVar.m865m();
        }
        if (itemId == 2131428639) {
            DialogC0242a.a aVar2 = new DialogC0242a.a(this);
            aVar2.setTitle(this.f18531s.getResources().getString(2132017514));
            aVar2.m857e(this.f18531s.getResources().getString(2132017585));
            aVar2.m855c(2131231731);
            aVar2.m861i(this.f18531s.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3072d(this));
            aVar2.m858f(this.f18531s.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3073e(this));
            aVar2.m865m();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        m16597K0();
        super.onResume();
        C5255e.m26233f(this.f18531s);
        if (this.f18538v0.equals("mobile")) {
            try {
                this.f18524o0 = C5938b.m29235e(this.f18531s).m29243c().m29358c();
            } catch (Exception e10) {
            }
        }
        if (!this.f18522n0) {
            m16602P0();
        }
        this.f18522n0 = false;
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onStop() {
        C6721i m29290r;
        super.onStop();
        try {
            EpisodeDetailAdapter episodeDetailAdapter = this.f18502Z;
            if (episodeDetailAdapter != null) {
                episodeDetailAdapter.m17089w0();
            }
            C5947e c5947e = this.f18524o0;
            if (c5947e == null || this.f18502Z == null || (m29290r = c5947e.m29290r()) == null) {
                return;
            }
            m29290r.m30996W(this.f18502Z.f19680L);
        } catch (Exception e10) {
        }
    }

    @OnClick
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case 2131429558:
                m16600N0(view);
                break;
            case 2131429581:
                m16607V0(this);
                break;
            case 2131429594:
                m16605S0(this.f18531s);
                break;
            case 2131429642:
                String str = this.f18519m;
                if (str != null && !str.isEmpty()) {
                    startActivity(new Intent(this, (Class<?>) YouTubePlayerActivity.class).putExtra("you_tube_trailer", this.f18519m));
                    break;
                } else {
                    m16599M0(this);
                    break;
                }
                break;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        m16597K0();
    }

    @Override // p324sf.InterfaceC8571j
    /* renamed from: r */
    public void mo16614r(TMDBCastsCallback tMDBCastsCallback) {
        if (tMDBCastsCallback != null) {
            try {
                if (tMDBCastsCallback.m15066a() == null || tMDBCastsCallback.m15066a().size() <= 0) {
                    return;
                }
                this.rvCast.setLayoutManager(new LinearLayoutManager(this, 0, false));
                this.rvCast.setItemAnimator(null);
                CastAdapter castAdapter = new CastAdapter(tMDBCastsCallback.m15066a(), this.f18531s, true, this.f18523o);
                this.f18529r = castAdapter;
                this.rvCast.setAdapter(castAdapter);
            } catch (Exception e10) {
            }
        }
    }

    @Override // p324sf.InterfaceC8571j
    /* renamed from: z */
    public void mo16615z(SearchTMDBTVShowsCallback searchTMDBTVShowsCallback) {
        boolean z10;
        TextView textView;
        int i10;
        if (searchTMDBTVShowsCallback != null) {
            try {
            } catch (Exception e10) {
                z10 = true;
            }
            if (searchTMDBTVShowsCallback.m15013b() != null && searchTMDBTVShowsCallback.m15013b().equals(1) && searchTMDBTVShowsCallback.m15012a() != null && searchTMDBTVShowsCallback.m15012a().get(0) != null) {
                this.f18494R.m26720b(searchTMDBTVShowsCallback.m15012a().get(0).m15474c().intValue());
                z10 = false;
                if (z10 || (textView = this.cast_tab) == null) {
                }
                textView.setVisibility(8);
                return;
            }
        }
        if (searchTMDBTVShowsCallback != null && searchTMDBTVShowsCallback.m15013b() != null && searchTMDBTVShowsCallback.m15013b().intValue() > 1 && searchTMDBTVShowsCallback.m15012a() != null) {
            for (0; i10 < searchTMDBTVShowsCallback.m15012a().size(); i10 + 1) {
                i10 = (searchTMDBTVShowsCallback.m15012a().get(i10).m15475d().equals(this.f18503d) || searchTMDBTVShowsCallback.m15012a().get(i10).m15476e().equals(this.f18503d)) ? 0 : i10 + 1;
                this.f18494R.m26720b(searchTMDBTVShowsCallback.m15012a().get(i10).m15474c().intValue());
                z10 = false;
            }
        }
        z10 = true;
        if (z10) {
        }
    }
}

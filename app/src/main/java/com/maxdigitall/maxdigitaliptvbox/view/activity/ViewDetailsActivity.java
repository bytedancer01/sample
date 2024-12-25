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
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.maxdigitall.maxdigitaliptvbox.miscelleneious.chromecastfeature.ExpandedControlsActivity;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.callback.SearchTMDBMoviesCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBCastsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBPersonInfoCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBTrailerCallback;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.ExternalPlayerDataBase;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.RecentWatchDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.ExternalPlayerModelClass;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.CastAdapter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import nf.C6783a;
import org.apache.http.HttpHeaders;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p082ef.C4718a;
import p151if.C5251a;
import p151if.C5255e;
import p170jf.C5373e;
import p170jf.C5378j;
import p216m9.C5938b;
import p216m9.C5947e;
import p324sf.InterfaceC8570i;
import p324sf.InterfaceC8574m;
import p428yg.C10014t;
import p428yg.InterfaceC9993c0;
import p428yg.InterfaceC9996e;
import pf.C7705a;
import pf.C7707c;
import pf.C7708d;
import pf.C7709e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity.class */
public class ViewDetailsActivity extends ActivityC0243b implements View.OnClickListener, InterfaceC8574m, InterfaceC8570i {

    /* renamed from: U */
    public static String f19149U;

    /* renamed from: V */
    public static String f19150V;

    /* renamed from: A */
    public Button f19151A;

    /* renamed from: B */
    public String f19152B;

    /* renamed from: C */
    public DateFormat f19153C;

    /* renamed from: D */
    public String f19154D;

    /* renamed from: E */
    public TextView f19155E;

    /* renamed from: F */
    public MenuItem f19156F;

    /* renamed from: G */
    public Menu f19157G;

    /* renamed from: J */
    public Button f19160J;

    /* renamed from: K */
    public C5947e f19161K;

    /* renamed from: M */
    public C5373e f19163M;

    /* renamed from: N */
    public RecentWatchDBHandler f19164N;

    /* renamed from: O */
    public CastAdapter f19165O;

    @BindView
    public AppBarLayout appbarToolbar;

    /* renamed from: d */
    public String f19171d;

    /* renamed from: e */
    public String f19172e;

    /* renamed from: f */
    public SimpleDateFormat f19173f;

    /* renamed from: g */
    public Date f19174g;

    /* renamed from: i */
    public ProgressDialog f19176i;

    @BindView
    public ImageView ivFavourite;

    @BindView
    public ImageView ivMovieImage;

    @BindView
    public ImageView iv_back_button;

    /* renamed from: j */
    public SharedPreferences f19177j;

    /* renamed from: k */
    public SharedPreferences f19178k;

    /* renamed from: l */
    public LiveStreamDBHandler f19179l;

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
    public LinearLayout ll_watch_trailer;

    @BindView
    public LinearLayout ll_watch_trailer_button_main_layout;

    @BindView
    public ImageView logo;

    @BindView
    public NestedScrollView nestedScrollView;

    @BindView
    public ProgressBar pb_button_recent_watch;

    /* renamed from: q */
    public C5378j f19184q;

    @BindView
    public RatingBar ratingBar;

    @BindView
    public RelativeLayout rlAccountInfo;

    @BindView
    public RelativeLayout rlTransparent;

    @BindView
    public RecyclerView rvCast;

    @BindView
    public ScrollView scrollView;

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
    public TextView tvMovieInfo;

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
    public TextView tvWatchTrailer;

    @BindView
    public TextView tv_genre_info;

    /* renamed from: y */
    public DatabaseHandler f19192y;

    /* renamed from: z */
    public PopupWindow f19193z;

    /* renamed from: h */
    public Context f19175h = this;

    /* renamed from: m */
    public DatabaseUpdatedStatusDBModel f19180m = new DatabaseUpdatedStatusDBModel();

    /* renamed from: n */
    public DatabaseUpdatedStatusDBModel f19181n = new DatabaseUpdatedStatusDBModel();

    /* renamed from: o */
    public String f19182o = "";

    /* renamed from: p */
    public String f19183p = "";

    /* renamed from: r */
    public String f19185r = "";

    /* renamed from: s */
    public String f19186s = "";

    /* renamed from: t */
    public String f19187t = "";

    /* renamed from: u */
    public String f19188u = "";

    /* renamed from: v */
    public String f19189v = "";

    /* renamed from: w */
    public int f19190w = -1;

    /* renamed from: x */
    public String f19191x = "";

    /* renamed from: H */
    public String f19158H = "";

    /* renamed from: I */
    public Boolean f19159I = Boolean.TRUE;

    /* renamed from: L */
    public String f19162L = "";

    /* renamed from: P */
    public String f19166P = "mobile";

    /* renamed from: Q */
    public int f19167Q = 0;

    /* renamed from: R */
    public boolean f19168R = false;

    /* renamed from: S */
    public int f19169S = 0;

    /* renamed from: T */
    public String f19170T = "";

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$a.class */
    public class DialogInterfaceOnClickListenerC3241a implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ViewDetailsActivity f19194b;

        public DialogInterfaceOnClickListenerC3241a(ViewDetailsActivity viewDetailsActivity) {
            this.f19194b = viewDetailsActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$b.class */
    public class DialogInterfaceOnClickListenerC3242b implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ViewDetailsActivity f19195b;

        public DialogInterfaceOnClickListenerC3242b(ViewDetailsActivity viewDetailsActivity) {
            this.f19195b = viewDetailsActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$c.class */
    public class C3243c implements InterfaceC9993c0 {

        /* renamed from: a */
        public final ViewDetailsActivity f19196a;

        public C3243c(ViewDetailsActivity viewDetailsActivity) {
            this.f19196a = viewDetailsActivity;
        }

        @Override // p428yg.InterfaceC9993c0
        /* renamed from: a */
        public void mo16616a(Drawable drawable) {
            Log.d("TAG", "FAILED");
        }

        @Override // p428yg.InterfaceC9993c0
        /* renamed from: b */
        public void mo16617b(Bitmap bitmap, C10014t.e eVar) {
            this.f19196a.appbarToolbar.setBackground(new BitmapDrawable(this.f19196a.f19175h.getResources(), bitmap));
            ViewDetailsActivity viewDetailsActivity = this.f19196a;
            viewDetailsActivity.rlTransparent.setBackgroundColor(viewDetailsActivity.getResources().getColor(2131100140));
            ViewDetailsActivity viewDetailsActivity2 = this.f19196a;
            viewDetailsActivity2.toolbar.setBackgroundColor(viewDetailsActivity2.getResources().getColor(2131100140));
        }

        @Override // p428yg.InterfaceC9993c0
        /* renamed from: c */
        public void mo16618c(Drawable drawable) {
            Log.d("TAG", "Prepare Load");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$d.class */
    public class C3244d implements InterfaceC9996e {

        /* renamed from: a */
        public final ViewDetailsActivity f19197a;

        public C3244d(ViewDetailsActivity viewDetailsActivity) {
            this.f19197a = viewDetailsActivity;
        }

        @Override // p428yg.InterfaceC9996e
        /* renamed from: a */
        public void mo15848a() {
            this.f19197a.ivMovieImage.setBackgroundResource(2131231660);
        }

        @Override // p428yg.InterfaceC9996e
        public void onSuccess() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$e.class */
    public class C3245e implements InterfaceC9993c0 {

        /* renamed from: a */
        public final ViewDetailsActivity f19198a;

        public C3245e(ViewDetailsActivity viewDetailsActivity) {
            this.f19198a = viewDetailsActivity;
        }

        @Override // p428yg.InterfaceC9993c0
        /* renamed from: a */
        public void mo16616a(Drawable drawable) {
            Log.d("TAG", "FAILED");
        }

        @Override // p428yg.InterfaceC9993c0
        /* renamed from: b */
        public void mo16617b(Bitmap bitmap, C10014t.e eVar) {
            this.f19198a.appbarToolbar.setBackground(new BitmapDrawable(this.f19198a.f19175h.getResources(), bitmap));
            ViewDetailsActivity viewDetailsActivity = this.f19198a;
            viewDetailsActivity.rlTransparent.setBackgroundColor(viewDetailsActivity.getResources().getColor(2131100140));
            ViewDetailsActivity viewDetailsActivity2 = this.f19198a;
            viewDetailsActivity2.toolbar.setBackgroundColor(viewDetailsActivity2.getResources().getColor(2131100140));
        }

        @Override // p428yg.InterfaceC9993c0
        /* renamed from: c */
        public void mo16618c(Drawable drawable) {
            Log.d("TAG", "Prepare Load");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$f.class */
    public class C3246f implements C0304c1.d {

        /* renamed from: a */
        public final ArrayList f19199a;

        /* renamed from: b */
        public final String f19200b;

        /* renamed from: c */
        public final ViewDetailsActivity f19201c;

        public C3246f(ViewDetailsActivity viewDetailsActivity, ArrayList arrayList, String str) {
            this.f19201c = viewDetailsActivity;
            this.f19199a = arrayList;
            this.f19200b = str;
        }

        @Override // androidx.appcompat.widget.C0304c1.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            ArrayList arrayList;
            try {
                if (this.f19201c.f19159I.booleanValue() && (arrayList = this.f19199a) != null && arrayList.size() > 0) {
                    for (int i10 = 0; i10 < this.f19199a.size(); i10++) {
                        if (menuItem.getItemId() == i10) {
                            if (menuItem.getItemId() == 0) {
                                C5255e.m26220W(this.f19201c.f19175h, this.f19200b, this.f19201c.f19190w, this.f19201c.f19187t, this.f19201c.f19188u, this.f19201c.f19189v, this.f19201c.f19185r, "", this.f19201c.f19167Q);
                            } else {
                                String m26252s = C5255e.m26252s(C5255e.m26202E(this.f19201c.f19175h, this.f19201c.f19190w, this.f19201c.f19188u, "movie"));
                                Intent intent = new Intent(this.f19201c.f19175h, (Class<?>) PlayExternalPlayerActivity.class);
                                intent.putExtra("url", m26252s);
                                intent.putExtra("app_name", ((ExternalPlayerModelClass) this.f19199a.get(i10)).m15415a());
                                intent.putExtra("packagename", ((ExternalPlayerModelClass) this.f19199a.get(i10)).m15416b());
                                this.f19201c.f19175h.startActivity(intent);
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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$g.class */
    public class C3247g implements C0304c1.c {

        /* renamed from: a */
        public final ViewDetailsActivity f19202a;

        public C3247g(ViewDetailsActivity viewDetailsActivity) {
            this.f19202a = viewDetailsActivity;
        }

        @Override // androidx.appcompat.widget.C0304c1.c
        /* renamed from: a */
        public void mo1281a(C0304c1 c0304c1) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$h.class */
    public class ViewOnClickListenerC3248h implements View.OnClickListener {

        /* renamed from: b */
        public final ViewDetailsActivity f19203b;

        public ViewOnClickListenerC3248h(ViewDetailsActivity viewDetailsActivity) {
            this.f19203b = viewDetailsActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f19203b.f19193z.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsActivity$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$i.class */
    public class ViewOnClickListenerC3249i implements View.OnClickListener {

        /* renamed from: b */
        public final ViewDetailsActivity f19204b;

        public ViewOnClickListenerC3249i(ViewDetailsActivity viewDetailsActivity) {
            this.f19204b = viewDetailsActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f19204b.f19193z.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsActivity$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$j.class */
    public class ViewOnClickListenerC3250j implements View.OnClickListener {

        /* renamed from: b */
        public final ViewDetailsActivity f19205b;

        public ViewOnClickListenerC3250j(ViewDetailsActivity viewDetailsActivity) {
            this.f19205b = viewDetailsActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f19205b.f19193z.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsActivity$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$k.class */
    public class ViewOnClickListenerC3251k implements View.OnClickListener {

        /* renamed from: b */
        public final ViewDetailsActivity f19206b;

        public ViewOnClickListenerC3251k(ViewDetailsActivity viewDetailsActivity) {
            this.f19206b = viewDetailsActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f19206b.f19175h);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$l.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsActivity$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$l.class */
    public class ViewOnClickListenerC3252l implements View.OnClickListener {

        /* renamed from: b */
        public final ViewDetailsActivity f19207b;

        public ViewOnClickListenerC3252l(ViewDetailsActivity viewDetailsActivity) {
            this.f19207b = viewDetailsActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f19207b.onBackPressed();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$m.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsActivity$m */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$m.class */
    public class ViewOnClickListenerC3253m implements View.OnClickListener {

        /* renamed from: b */
        public final Context f19208b;

        /* renamed from: c */
        public final ViewDetailsActivity f19209c;

        public ViewOnClickListenerC3253m(ViewDetailsActivity viewDetailsActivity, Context context) {
            this.f19209c = viewDetailsActivity;
            this.f19208b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f19209c.f19192y.m15112o(this.f19209c.f19190w, this.f19209c.f19191x, "vod", SharepreferenceDBHandler.m15337A(this.f19208b)).size() > 0) {
                this.f19209c.m16820L0();
            } else {
                this.f19209c.m16813E0();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$n.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsActivity$n */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$n.class */
    public class DialogInterfaceOnClickListenerC3254n implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ViewDetailsActivity f19210b;

        public DialogInterfaceOnClickListenerC3254n(ViewDetailsActivity viewDetailsActivity) {
            this.f19210b = viewDetailsActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$o.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsActivity$o */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$o.class */
    public class DialogInterfaceOnClickListenerC3255o implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ViewDetailsActivity f19211b;

        public DialogInterfaceOnClickListenerC3255o(ViewDetailsActivity viewDetailsActivity) {
            this.f19211b = viewDetailsActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f19211b.f19175h);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$p.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsActivity$p */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$p.class */
    public class DialogInterfaceOnClickListenerC3256p implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ViewDetailsActivity f19212b;

        public DialogInterfaceOnClickListenerC3256p(ViewDetailsActivity viewDetailsActivity) {
            this.f19212b = viewDetailsActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f19212b.f19175h);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$q.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsActivity$q */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$q.class */
    public class DialogInterfaceOnClickListenerC3257q implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ViewDetailsActivity f19213b;

        public DialogInterfaceOnClickListenerC3257q(ViewDetailsActivity viewDetailsActivity) {
            this.f19213b = viewDetailsActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$r.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsActivity$r */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsActivity$r.class */
    public class ViewOnFocusChangeListenerC3258r implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f19214b;

        /* renamed from: c */
        public final ViewDetailsActivity f19215c;

        public ViewOnFocusChangeListenerC3258r(ViewDetailsActivity viewDetailsActivity, View view) {
            this.f19215c = viewDetailsActivity;
            this.f19214b = view;
        }

        /* renamed from: a */
        public final void m16830a(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f19214b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: b */
        public final void m16831b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f19214b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v37, types: [android.view.View] */
        /* JADX WARN: Type inference failed for: r0v89, types: [android.view.View] */
        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            int i10;
            Button button;
            LinearLayout linearLayout;
            float f10 = 1.0f;
            if (z10) {
                if (z10) {
                    f10 = 1.05f;
                }
                Log.e("id is", "" + this.f19214b.getTag());
                View view2 = this.f19214b;
                if (view2 == null || view2.getTag() == null) {
                    return;
                }
                i10 = 2131230846;
                if (this.f19214b.getTag().equals("1")) {
                    m16830a(f10);
                    m16831b(f10);
                    linearLayout = this.f19215c.ll_play_button_main_layout;
                } else if (this.f19214b.getTag().equals("2")) {
                    m16830a(f10);
                    m16831b(f10);
                    linearLayout = this.f19214b;
                } else {
                    if (!this.f19214b.getTag().equals("5")) {
                        if (!this.f19214b.getTag().equals("8")) {
                            m16830a(1.15f);
                            m16831b(1.15f);
                            return;
                        } else {
                            m16830a(f10);
                            m16831b(f10);
                            this.f19215c.f19160J.setBackgroundResource(2131230828);
                            return;
                        }
                    }
                    m16830a(f10);
                    m16831b(f10);
                    linearLayout = this.f19215c.ll_watch_trailer_button_main_layout;
                }
            } else {
                if (z10) {
                    return;
                }
                if (z10) {
                    f10 = 1.09f;
                }
                m16830a(f10);
                m16831b(f10);
                View view3 = this.f19214b;
                if (view3 == null || view3.getTag() == null) {
                    return;
                }
                i10 = 2131231768;
                if (!this.f19214b.getTag().equals("1")) {
                    if (this.f19214b.getTag().equals("3")) {
                        button = this.f19214b;
                    } else {
                        if (!this.f19214b.getTag().equals("5")) {
                            if (this.f19214b.getTag() == null || !this.f19214b.getTag().equals("8")) {
                                return;
                            } else {
                                button = this.f19215c.f19160J;
                            }
                        }
                        linearLayout = this.f19215c.ll_watch_trailer_button_main_layout;
                    }
                    button.setBackgroundResource(2131230845);
                    return;
                }
                linearLayout = this.f19215c.ll_play_button_main_layout;
            }
            linearLayout.setBackgroundResource(i10);
        }
    }

    /* renamed from: G0 */
    public static long m16802G0(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: H0 */
    public static String m16803H0(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    /* renamed from: E0 */
    public final void m16813E0() {
        FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
        favouriteDBModel.m14767h(this.f19191x);
        favouriteDBModel.m14772m(this.f19190w);
        favouriteDBModel.m14770k(this.f19185r);
        favouriteDBModel.m14771l(this.f19189v);
        favouriteDBModel.m14774o(SharepreferenceDBHandler.m15337A(this.f19175h));
        this.f19192y.m15111l(favouriteDBModel, "vod");
        if (Build.VERSION.SDK_INT <= 21) {
            this.ivFavourite.setImageResource(2131231090);
        }
        this.ivFavourite.setImageDrawable(this.f19175h.getResources().getDrawable(2131231090, null));
    }

    /* renamed from: F0 */
    public final void m16814F0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: I0 */
    public void m16815I0() {
        getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    /* renamed from: J0 */
    public final void m16816J0() {
        this.f19179l = new LiveStreamDBHandler(this.f19175h);
        this.f19192y = new DatabaseHandler(this.f19175h);
        this.f19164N = new RecentWatchDBHandler(this.f19175h);
        this.tvPlay.requestFocus();
        this.tvPlay.setFocusable(true);
        TextView textView = this.tvMovieName;
        if (textView != null) {
            textView.setSelected(true);
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f19176i = progressDialog;
        progressDialog.setCanceledOnTouchOutside(false);
        this.f19176i.setMessage(this.f19175h.getResources().getString(2132018352));
        this.f19176i.show();
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f19177j = sharedPreferences;
        String string = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        String string2 = this.f19177j.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        if (string.isEmpty() || string2.isEmpty()) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
            overridePendingTransition(2130772003, 2130772000);
        } else {
            m16822N0(this.f19175h, string, string2);
        }
        this.logo.setOnClickListener(new ViewOnClickListenerC3251k(this));
        this.iv_back_button.setOnClickListener(new ViewOnClickListenerC3252l(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:237:0x017c, code lost:
    
        if (r11 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x017f, code lost:
    
        r11.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x01a3, code lost:
    
        if (r11 != null) goto L51;
     */
    @Override // p324sf.InterfaceC8574m
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo16817K(com.maxdigitall.maxdigitaliptvbox.model.callback.VodInfoCallback r6) {
        /*
            Method dump skipped, instructions count: 1577
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsActivity.mo16817K(com.maxdigitall.maxdigitaliptvbox.model.callback.VodInfoCallback):void");
    }

    /* renamed from: K0 */
    public final void m16818K0(ViewDetailsActivity viewDetailsActivity) {
        View inflate = ((LayoutInflater) viewDetailsActivity.getSystemService("layout_inflater")).inflate(2131624241, (RelativeLayout) viewDetailsActivity.findViewById(2131429033));
        PopupWindow popupWindow = new PopupWindow(viewDetailsActivity);
        this.f19193z = popupWindow;
        popupWindow.setContentView(inflate);
        this.f19193z.setWidth(-1);
        this.f19193z.setHeight(-1);
        this.f19193z.setFocusable(true);
        this.f19193z.setBackgroundDrawable(new BitmapDrawable());
        this.f19193z.showAtLocation(inflate, 17, 0, 0);
        this.f19160J = (Button) inflate.findViewById(2131427623);
        this.f19151A = (Button) inflate.findViewById(2131427605);
        Button button = this.f19160J;
        if (button != null) {
            button.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3258r(this, button));
        }
        Button button2 = this.f19151A;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3258r(this, button2));
        }
        this.f19151A.setOnClickListener(new ViewOnClickListenerC3248h(this));
        this.f19160J.setOnClickListener(new ViewOnClickListenerC3249i(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x00f7, code lost:
    
        if (r11 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x012f, code lost:
    
        if (r11 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00fa, code lost:
    
        r11.setText("N/A");
     */
    @Override // p324sf.InterfaceC8570i
    @android.annotation.SuppressLint({"SetTextI18n"})
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo16819L(com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBGenreCallback r6) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsActivity.mo16819L(com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBGenreCallback):void");
    }

    /* renamed from: L0 */
    public final void m16820L0() {
        this.f19192y.m15115t(this.f19190w, this.f19191x, "vod", this.f19185r, SharepreferenceDBHandler.m15337A(this.f19175h));
        if (Build.VERSION.SDK_INT <= 21) {
            this.ivFavourite.setImageResource(2131231091);
        }
        this.ivFavourite.setImageDrawable(this.f19175h.getResources().getDrawable(2131231091, null));
    }

    /* renamed from: M0 */
    public final void m16821M0(ViewDetailsActivity viewDetailsActivity) {
        View inflate = ((LayoutInflater) viewDetailsActivity.getSystemService("layout_inflater")).inflate(2131624235, (RelativeLayout) viewDetailsActivity.findViewById(2131429033));
        TextView textView = (TextView) inflate.findViewById(2131429376);
        this.f19155E = textView;
        textView.setText(this.f19152B);
        PopupWindow popupWindow = new PopupWindow(viewDetailsActivity);
        this.f19193z = popupWindow;
        popupWindow.setContentView(inflate);
        this.f19193z.setWidth(-1);
        this.f19193z.setHeight(-1);
        this.f19193z.setFocusable(true);
        this.f19193z.showAtLocation(inflate, 17, 0, 0);
        Button button = (Button) inflate.findViewById(2131427605);
        this.f19151A = button;
        if (button != null) {
            button.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3258r(this, button));
        }
        this.f19151A.setOnClickListener(new ViewOnClickListenerC3250j(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x012f  */
    /* renamed from: N0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m16822N0(android.content.Context r7, java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsActivity.m16822N0(android.content.Context, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(3:9|10|11)|(2:12|13)|14|15|16|17|(2:19|20)(2:22|(1:24)(1:27))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    /* renamed from: O0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m16823O0() {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsActivity.m16823O0():void");
    }

    @Override // p324sf.InterfaceC8570i
    /* renamed from: R */
    public void mo16824R(TMDBPersonInfoCallback tMDBPersonInfoCallback) {
    }

    @Override // p324sf.InterfaceC8574m
    /* renamed from: V */
    public void mo16825V(String str) {
        TextView textView;
        try {
            this.f19152B = "";
            this.f19154D = "";
            Context context = this.f19175h;
            String str2 = this.f19185r;
            if (str2 != null && (textView = this.tvMovieName) != null) {
                textView.setText(str2);
            }
            LinearLayout linearLayout = this.llReleasedBox;
            if (linearLayout != null && this.llReleasedBoxInfo != null) {
                TextView textView2 = this.tvReleaseDateInfo;
            }
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            LinearLayout linearLayout2 = this.llReleasedBoxInfo;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            TextView textView3 = this.tvReleaseDateInfo;
            if (textView3 != null) {
                textView3.setText("N/A");
            }
            if (this.tvDirectorInfo != null && this.llDirectorBoxInfo != null) {
                LinearLayout linearLayout3 = this.llDirectorBox;
            }
            LinearLayout linearLayout4 = this.llDirectorBox;
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(0);
            }
            LinearLayout linearLayout5 = this.llDirectorBoxInfo;
            if (linearLayout5 != null) {
                linearLayout5.setVisibility(0);
            }
            TextView textView4 = this.tvDirectorInfo;
            if (textView4 != null) {
                textView4.setText("N/A");
            }
            LinearLayout linearLayout6 = this.llCastBox;
            if (linearLayout6 != null && this.llCastBoxInfo != null) {
                TextView textView5 = this.tvCastInfo;
            }
            if (linearLayout6 != null) {
                linearLayout6.setVisibility(0);
            }
            LinearLayout linearLayout7 = this.llCastBoxInfo;
            if (linearLayout7 != null) {
                linearLayout7.setVisibility(0);
            }
            TextView textView6 = this.tvReadMore;
            if (textView6 != null) {
                textView6.setVisibility(8);
            }
            TextView textView7 = this.tvCastInfo;
            if (textView7 != null) {
                textView7.setText("N/A");
            }
            RatingBar ratingBar = this.ratingBar;
            TextView textView8 = this.tvMovieInfo;
            if (textView8 != null) {
                textView8.setVisibility(8);
            }
            LinearLayout linearLayout8 = this.llGenreBox;
            if (linearLayout8 != null && this.llGenreBoxInfo != null) {
                TextView textView9 = this.tv_genre_info;
            }
            if (linearLayout8 != null) {
                linearLayout8.setVisibility(0);
            }
            LinearLayout linearLayout9 = this.llGenreBoxInfo;
            if (linearLayout9 != null) {
                linearLayout9.setVisibility(0);
            }
            TextView textView10 = this.tv_genre_info;
            if (textView10 != null) {
                textView10.setText("N/A");
            }
            LinearLayout linearLayout10 = this.llDurationBox;
            if (linearLayout10 == null || this.llDurationBoxInfo == null || this.tvMovieDurationInfo == null) {
                if (linearLayout10 != null) {
                    linearLayout10.setVisibility(0);
                }
                LinearLayout linearLayout11 = this.llDurationBoxInfo;
                if (linearLayout11 != null) {
                    linearLayout11.setVisibility(0);
                }
                TextView textView11 = this.tvMovieDurationInfo;
                if (textView11 != null) {
                    textView11.setText("N/A");
                    return;
                }
                return;
            }
            linearLayout10.setVisibility(0);
            this.llDurationBoxInfo.setVisibility(0);
            float f10 = 0;
            int i10 = (int) (f10 / 3600.0f);
            try {
                int round = Math.round((f10 % 3600.0f) / 60.0f);
                if (i10 == 0) {
                    this.tvMovieDurationInfo.setText(round + "m");
                } else {
                    this.tvMovieDurationInfo.setText(i10 + "h " + round + "m");
                }
            } catch (Exception e10) {
                this.tvMovieDurationInfo.setText(0);
            }
        } catch (Exception e11) {
        }
    }

    @Override // p324sf.InterfaceC8570i
    /* renamed from: W */
    public void mo16826W(TMDBCastsCallback tMDBCastsCallback) {
        if (tMDBCastsCallback != null) {
            try {
                if (tMDBCastsCallback.m15066a() != null && tMDBCastsCallback.m15066a().size() > 0) {
                    this.rvCast.setLayoutManager(new LinearLayoutManager(this, 0, false));
                    this.rvCast.setItemAnimator(new C0704c());
                    CastAdapter castAdapter = new CastAdapter(tMDBCastsCallback.m15066a(), this.f19175h, true, this.f19170T);
                    this.f19165O = castAdapter;
                    this.rvCast.setAdapter(castAdapter);
                    this.rvCast.setVisibility(0);
                }
            } catch (Exception e10) {
                return;
            }
        }
        this.rvCast.setVisibility(8);
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: a */
    public void mo15996a() {
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: b */
    public void mo15997b() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x011a, code lost:
    
        if (r8 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0158, code lost:
    
        if (r8 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x018f, code lost:
    
        if (r8 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x011d, code lost:
    
        r8.setText("N/A");
     */
    @Override // p324sf.InterfaceC8570i
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo16827b0(com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBCastsCallback r6) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsActivity.mo16827b0(com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBCastsCallback):void");
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: c */
    public void mo15998c(String str) {
        try {
            ProgressDialog progressDialog = this.f19176i;
            if (progressDialog == null || !progressDialog.isShowing()) {
                return;
            }
            this.f19176i.dismiss();
            Toast.makeText(this, this.f19175h.getResources().getString(2132018606), 1).show();
        } catch (Exception e10) {
        }
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

    @Override // p324sf.InterfaceC8570i
    /* renamed from: e */
    public void mo16828e(SearchTMDBMoviesCallback searchTMDBMoviesCallback) {
        StringBuilder sb2;
        TextView textView;
        Context context;
        TextView textView2;
        if (searchTMDBMoviesCallback != null) {
            try {
                if (searchTMDBMoviesCallback.m15011b() != null && searchTMDBMoviesCallback.m15011b().equals(1) && searchTMDBMoviesCallback.m15010a() != null && searchTMDBMoviesCallback.m15010a().get(0) != null) {
                    int intValue = searchTMDBMoviesCallback.m15010a().get(0).m15466b().intValue();
                    this.f19163M.m26713b(intValue);
                    this.f19163M.m26715d(intValue);
                    this.f19163M.m26718g(intValue);
                    String m15469e = searchTMDBMoviesCallback.m15010a().get(0).m15469e();
                    Double m15471g = searchTMDBMoviesCallback.m15010a().get(0).m15471g();
                    String m15468d = searchTMDBMoviesCallback.m15010a().get(0).m15468d();
                    String m15465a = searchTMDBMoviesCallback.m15010a().get(0).m15465a();
                    if (new C6783a(this.f19175h).m31288z().equals(C5251a.f30065s0)) {
                        sb2 = new StringBuilder();
                        sb2.append("https://image.tmdb.org/t/p/w1280/");
                        sb2.append(m15465a);
                    } else {
                        sb2 = new StringBuilder();
                        sb2.append("https://image.tmdb.org/t/p/w500/");
                        sb2.append(m15465a);
                    }
                    this.f19170T = sb2.toString();
                    if (this.appbarToolbar != null && m15465a != null && (context = this.f19175h) != null) {
                        C10014t.m42105q(context).m42116l(this.f19170T).m42153i(new C3245e(this));
                    }
                    if (this.llReleasedBox == null || this.llReleasedBoxInfo == null || this.tvReleaseDateInfo == null || m15469e == null || m15469e.isEmpty() || m15469e.equals("n/A")) {
                        LinearLayout linearLayout = this.llReleasedBox;
                        if (linearLayout != null) {
                            linearLayout.setVisibility(0);
                        }
                        LinearLayout linearLayout2 = this.llReleasedBoxInfo;
                        if (linearLayout2 != null) {
                            linearLayout2.setVisibility(0);
                        }
                        TextView textView3 = this.tvReleaseDateInfo;
                        if (textView3 != null) {
                            textView3.setText("N/A");
                        }
                    } else {
                        this.llReleasedBox.setVisibility(0);
                        this.llReleasedBoxInfo.setVisibility(0);
                        this.tvReleaseDateInfo.setText(m15469e);
                    }
                    if (this.ratingBar != null && m15471g != null && !m15471g.equals("n/A")) {
                        this.ratingBar.setVisibility(0);
                        try {
                            this.ratingBar.setRating(Float.parseFloat(String.valueOf(m15471g)) / 2.0f);
                        } catch (NumberFormatException e10) {
                            this.ratingBar.setRating(0.0f);
                        }
                    }
                    if (this.tvMovieInfo != null && m15468d != null && !m15468d.isEmpty() && !m15468d.equals("n/A")) {
                        this.tvMovieInfo.setText(m15468d);
                        return;
                    }
                    textView = this.tvMovieInfo;
                    if (textView == null) {
                        return;
                    }
                    textView.setVisibility(8);
                }
            } catch (Exception e11) {
                return;
            }
        }
        String str = this.f19185r;
        if (str != null && (textView2 = this.tvMovieName) != null) {
            textView2.setText(str);
        }
        LinearLayout linearLayout3 = this.llDurationBox;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(0);
        }
        LinearLayout linearLayout4 = this.llDurationBoxInfo;
        if (linearLayout4 != null) {
            linearLayout4.setVisibility(0);
        }
        TextView textView4 = this.tvMovieDurationInfo;
        if (textView4 != null) {
            textView4.setText("N/A");
        }
        TextView textView5 = this.tvCastInfo;
        if (textView5 != null) {
            textView5.setText("N/A");
        }
        TextView textView6 = this.tvDirectorInfo;
        if (textView6 != null) {
            textView6.setText("N/A");
        }
        TextView textView7 = this.tvReleaseDateInfo;
        if (textView7 != null) {
            textView7.setText("N/A");
        }
        TextView textView8 = this.tv_genre_info;
        if (textView8 != null) {
            textView8.setText("N/A");
        }
        textView = this.tvReadMore;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }

    @Override // p324sf.InterfaceC8570i
    /* renamed from: o */
    public void mo16829o(TMDBTrailerCallback tMDBTrailerCallback) {
        if (tMDBTrailerCallback != null) {
            try {
                if (tMDBTrailerCallback.m15081a() == null || tMDBTrailerCallback.m15081a().size() <= 0) {
                    return;
                }
                for (int i10 = 0; i10 < tMDBTrailerCallback.m15081a().size(); i10++) {
                    if (tMDBTrailerCallback.m15081a().get(i10).m15489b().equals(HttpHeaders.TRAILER)) {
                        this.f19158H = tMDBTrailerCallback.m15081a().get(i10).m15488a();
                        return;
                    }
                }
            } catch (Exception e10) {
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
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
        this.f19175h = this;
        super.onCreate(bundle);
        m16815I0();
        if (new C6783a(this.f19175h).m31288z().equals(C5251a.f30065s0)) {
            this.f19166P = "tv";
            i10 = 2131624086;
        } else {
            this.f19166P = "mobile";
            i10 = 2131624084;
        }
        setContentView(i10);
        ButterKnife.m5626a(this);
        overridePendingTransition(2130772003, 2130772000);
        this.f19168R = true;
        AppBarLayout appBarLayout = this.appbarToolbar;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(2131230975));
        }
        m16814F0();
        this.f19174g = new Date();
        TextView textView = this.tvPlay;
        if (textView != null) {
            textView.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3258r(this, textView));
        }
        f19149U = m16803H0(this.f19175h);
        Locale locale = Locale.US;
        this.f19153C = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        TextView textView2 = this.tvReadMore;
        if (textView2 != null) {
            textView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3258r(this, textView2));
        }
        this.f19172e = C5255e.m26247n0(C7708d.m33672d());
        f19150V = getApplicationContext().getPackageName();
        TextView textView3 = this.tvWatchTrailer;
        if (textView3 != null) {
            textView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3258r(this, textView3));
        }
        this.f19171d = C5255e.m26247n0(C7705a.m33651a());
        this.f19173f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        getWindow().setFlags(1024, 1024);
        m878n0((Toolbar) findViewById(2131429320));
        m16816J0();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.m1224x(2131689500);
        this.f19157G = menu;
        this.f19156F = menu.getItem(1).getSubMenu().findItem(2131427886);
        if (SharepreferenceDBHandler.m15373f(this.f19175h).equals("api")) {
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

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 82) {
            return super.onKeyUp(i10, keyEvent);
        }
        Menu menu = this.f19157G;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(2131427886, 0);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.f19156F = menuItem;
        int itemId = menuItem.getItemId();
        if (itemId == 2131428761) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == 2131428776) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == 2131427416 && (context = this.f19175h) != null) {
            new DialogC0242a.a(context, 2132082693).setTitle(getResources().getString(2132017988)).m857e(getResources().getString(2132017987)).m861i(getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3255o(this)).m858f(getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3254n(this)).m865m();
        }
        if (itemId == 2131428637) {
            DialogC0242a.a aVar = new DialogC0242a.a(this);
            aVar.setTitle(this.f19175h.getResources().getString(2132017514));
            aVar.m857e(this.f19175h.getResources().getString(2132017585));
            aVar.m855c(2131231731);
            aVar.m861i(this.f19175h.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3256p(this));
            aVar.m858f(this.f19175h.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3257q(this));
            aVar.m865m();
        }
        if (itemId == 2131428639) {
            DialogC0242a.a aVar2 = new DialogC0242a.a(this);
            aVar2.setTitle(this.f19175h.getResources().getString(2132017514));
            aVar2.m857e(this.f19175h.getResources().getString(2132017585));
            aVar2.m855c(2131231731);
            aVar2.m861i(this.f19175h.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3241a(this));
            aVar2.m858f(this.f19175h.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3242b(this));
            aVar2.m865m();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        m16815I0();
        super.onResume();
        C5255e.m26233f(this.f19175h);
        if (!this.f19168R) {
            m16823O0();
        }
        this.f19168R = false;
        getWindow().setFlags(1024, 1024);
    }

    @OnClick
    public void onViewClicked(View view) {
        String str;
        String str2;
        switch (view.getId()) {
            case 2131428200:
            case 2131429558:
                SharedPreferences sharedPreferences = this.f19175h.getSharedPreferences("selectedPlayer", 0);
                this.f19178k = sharedPreferences;
                String string = sharedPreferences.getString("selectedPlayer", "");
                SimpleDateFormat simpleDateFormat = this.f19173f;
                if (m16802G0(simpleDateFormat, simpleDateFormat.format(new Date(C7709e.m33680a(this.f19175h))), this.f19153C.format(this.f19174g)) >= C7707c.m33667p() && (str = this.f19171d) != null && this.f19172e != null && (!f19149U.equals(str) || (this.f19171d != null && (str2 = this.f19172e) != null && !f19150V.equals(str2)))) {
                    this.f19159I = Boolean.FALSE;
                }
                if (this.f19159I.booleanValue()) {
                    try {
                        if (this.f19166P.equals("mobile")) {
                            try {
                                this.f19161K = C5938b.m29235e(this.f19175h).m29243c().m29358c();
                            } catch (Exception e10) {
                            }
                        }
                        C5947e c5947e = this.f19161K;
                        if (c5947e != null && c5947e.m29348c()) {
                            String m26252s = C5255e.m26252s(C5255e.m26202E(this.f19175h, this.f19190w, this.f19188u, "movie"));
                            C5947e c5947e2 = this.f19161K;
                            String str3 = "";
                            if (c5947e2 != null) {
                                str3 = "";
                                if (c5947e2.m29290r() != null) {
                                    str3 = "";
                                    if (this.f19161K.m29290r().m31009j() != null) {
                                        str3 = "";
                                        if (this.f19161K.m29290r().m31009j().m13058R() != null) {
                                            str3 = this.f19161K.m29290r().m31009j().m13058R();
                                        }
                                    }
                                }
                            }
                            if (!str3.equals(m26252s)) {
                                C4718a.m23743c(this.f19169S, true, C4718a.m23741a(this.f19185r, "", "", 0, m26252s, "videos/mp4", this.f19162L, "", null), this.f19161K, this.f19175h);
                                break;
                            } else {
                                this.f19175h.startActivity(new Intent(this.f19175h, (Class<?>) ExpandedControlsActivity.class));
                                break;
                            }
                        } else {
                            new ArrayList();
                            ArrayList arrayList = new ArrayList();
                            C0304c1 c0304c1 = new C0304c1(this, view);
                            c0304c1.m1276c().inflate(2131689489, c0304c1.m1275b());
                            ArrayList<ExternalPlayerModelClass> m15132o = new ExternalPlayerDataBase(this.f19175h).m15132o();
                            if (m15132o != null) {
                                try {
                                    if (m15132o.size() > 0) {
                                        c0304c1.m1275b().add(0, 0, 0, this.f19175h.getResources().getString(2132018170));
                                        ExternalPlayerModelClass externalPlayerModelClass = new ExternalPlayerModelClass();
                                        externalPlayerModelClass.m15419e(0);
                                        externalPlayerModelClass.m15418d(this.f19175h.getResources().getString(2132018328));
                                        arrayList.add(externalPlayerModelClass);
                                        int i10 = 0;
                                        while (true) {
                                            int i11 = i10;
                                            if (i11 >= m15132o.size()) {
                                                c0304c1.m1279f(new C3246f(this, arrayList, string));
                                                c0304c1.m1278e(new C3247g(this));
                                                c0304c1.m1280g();
                                                break;
                                            } else {
                                                Menu m1275b = c0304c1.m1275b();
                                                int i12 = i11 + 1;
                                                m1275b.add(0, i12, 0, this.f19175h.getResources().getString(2132018328) + " " + m15132o.get(i11).m15415a());
                                                arrayList.add(m15132o.get(i11));
                                                i10 = i12;
                                            }
                                        }
                                    }
                                } catch (Exception e11) {
                                    return;
                                }
                            }
                            C5255e.m26220W(this.f19175h, string, this.f19190w, this.f19187t, this.f19188u, this.f19189v, this.f19185r, "", this.f19167Q);
                            break;
                        }
                    } catch (Exception e12) {
                        C5255e.m26220W(this.f19175h, string, this.f19190w, this.f19187t, this.f19188u, this.f19189v, this.f19185r, "", this.f19167Q);
                    }
                }
                break;
            case 2131429581:
                m16821M0(this);
                break;
            case 2131429642:
                String str4 = this.f19158H;
                if (str4 != null && !str4.isEmpty()) {
                    startActivity(new Intent(this, (Class<?>) YouTubePlayerActivity.class).putExtra("you_tube_trailer", this.f19158H));
                    break;
                } else {
                    m16818K0(this);
                    break;
                }
                break;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        m16815I0();
    }
}

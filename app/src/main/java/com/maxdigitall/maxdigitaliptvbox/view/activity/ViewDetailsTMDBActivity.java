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
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
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
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteM3UModel;
import com.maxdigitall.maxdigitaliptvbox.model.callback.SearchTMDBMoviesCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBCastsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBPersonInfoCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBTrailerCallback;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.ExternalPlayerDataBase;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
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
import p216m9.C5938b;
import p216m9.C5947e;
import p318s4.InterfaceC8527c;
import p324sf.InterfaceC8570i;
import p329t3.C8617g;
import p330t4.AbstractC8627g;
import pf.C7705a;
import pf.C7707c;
import pf.C7708d;
import pf.C7709e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity.class */
public class ViewDetailsTMDBActivity extends ActivityC0243b implements View.OnClickListener, InterfaceC8570i {

    /* renamed from: R */
    public static String f19262R;

    /* renamed from: S */
    public static String f19263S;

    /* renamed from: H */
    public DatabaseHandler f19271H;

    /* renamed from: I */
    public PopupWindow f19272I;

    /* renamed from: L */
    public C5373e f19275L;

    /* renamed from: O */
    public CastAdapter f19278O;

    /* renamed from: Q */
    public C5947e f19280Q;

    @BindView
    public AppBarLayout appbarToolbar;

    /* renamed from: d */
    public String f19281d;

    /* renamed from: e */
    public String f19282e;

    /* renamed from: f */
    public SimpleDateFormat f19283f;

    /* renamed from: g */
    public Date f19284g;

    /* renamed from: h */
    public Button f19285h;

    /* renamed from: i */
    public String f19286i;

    @BindView
    public ImageView ivFavourite;

    @BindView
    public ImageView ivMovieImage;

    @BindView
    public ImageView iv_back_button;

    /* renamed from: j */
    public DateFormat f19287j;

    /* renamed from: k */
    public String f19288k;

    /* renamed from: l */
    public TextView f19289l;

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

    /* renamed from: m */
    public MenuItem f19290m;

    /* renamed from: n */
    public Menu f19291n;

    @BindView
    public NestedScrollView nestedScrollView;

    /* renamed from: o */
    public Button f19292o;

    /* renamed from: q */
    public ProgressDialog f19294q;

    /* renamed from: r */
    public SharedPreferences f19295r;

    @BindView
    public RatingBar ratingBar;

    @BindView
    public RelativeLayout rlAccountInfo;

    @BindView
    public RelativeLayout rlTransparent;

    @BindView
    public RecyclerView rvCast;

    /* renamed from: s */
    public SharedPreferences f19296s;

    @BindView
    public ScrollView scrollView;

    /* renamed from: t */
    public LiveStreamDBHandler f19297t;

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

    /* renamed from: p */
    public Context f19293p = this;

    /* renamed from: u */
    public DatabaseUpdatedStatusDBModel f19298u = new DatabaseUpdatedStatusDBModel();

    /* renamed from: v */
    public DatabaseUpdatedStatusDBModel f19299v = new DatabaseUpdatedStatusDBModel();

    /* renamed from: w */
    public String f19300w = "";

    /* renamed from: x */
    public String f19301x = "";

    /* renamed from: y */
    public String f19302y = "";

    /* renamed from: z */
    public String f19303z = "";

    /* renamed from: A */
    public String f19264A = "";

    /* renamed from: B */
    public String f19265B = "";

    /* renamed from: C */
    public String f19266C = "";

    /* renamed from: D */
    public String f19267D = "";

    /* renamed from: E */
    public String f19268E = "";

    /* renamed from: F */
    public int f19269F = -1;

    /* renamed from: G */
    public String f19270G = "";

    /* renamed from: J */
    public String f19273J = "";

    /* renamed from: K */
    public Boolean f19274K = Boolean.TRUE;

    /* renamed from: M */
    public String f19276M = "mobile";

    /* renamed from: N */
    public String f19277N = "";

    /* renamed from: P */
    public String f19279P = "";

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsTMDBActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$a.class */
    public class DialogInterfaceOnClickListenerC3273a implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ViewDetailsTMDBActivity f19304b;

        public DialogInterfaceOnClickListenerC3273a(ViewDetailsTMDBActivity viewDetailsTMDBActivity) {
            this.f19304b = viewDetailsTMDBActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsTMDBActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$b.class */
    public class DialogInterfaceOnClickListenerC3274b implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ViewDetailsTMDBActivity f19305b;

        public DialogInterfaceOnClickListenerC3274b(ViewDetailsTMDBActivity viewDetailsTMDBActivity) {
            this.f19305b = viewDetailsTMDBActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsTMDBActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$c.class */
    public class DialogInterfaceOnClickListenerC3275c implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ViewDetailsTMDBActivity f19306b;

        public DialogInterfaceOnClickListenerC3275c(ViewDetailsTMDBActivity viewDetailsTMDBActivity) {
            this.f19306b = viewDetailsTMDBActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsTMDBActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$d.class */
    public class C3276d extends AbstractC8627g<Bitmap> {

        /* renamed from: d */
        public final ViewDetailsTMDBActivity f19307d;

        public C3276d(ViewDetailsTMDBActivity viewDetailsTMDBActivity) {
            this.f19307d = viewDetailsTMDBActivity;
        }

        @Override // p330t4.InterfaceC8630j
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo16635c(Bitmap bitmap, InterfaceC8527c interfaceC8527c) {
            this.f19307d.appbarToolbar.setBackground(new BitmapDrawable(bitmap));
            ViewDetailsTMDBActivity viewDetailsTMDBActivity = this.f19307d;
            viewDetailsTMDBActivity.rlTransparent.setBackgroundColor(viewDetailsTMDBActivity.getResources().getColor(2131100139));
            ViewDetailsTMDBActivity viewDetailsTMDBActivity2 = this.f19307d;
            viewDetailsTMDBActivity2.toolbar.setBackgroundColor(viewDetailsTMDBActivity2.getResources().getColor(2131100139));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsTMDBActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$e.class */
    public class C3277e extends AbstractC8627g<Bitmap> {

        /* renamed from: d */
        public final ViewDetailsTMDBActivity f19308d;

        public C3277e(ViewDetailsTMDBActivity viewDetailsTMDBActivity) {
            this.f19308d = viewDetailsTMDBActivity;
        }

        @Override // p330t4.InterfaceC8630j
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo16635c(Bitmap bitmap, InterfaceC8527c interfaceC8527c) {
            this.f19308d.appbarToolbar.setBackground(new BitmapDrawable(bitmap));
            ViewDetailsTMDBActivity viewDetailsTMDBActivity = this.f19308d;
            viewDetailsTMDBActivity.rlTransparent.setBackgroundColor(viewDetailsTMDBActivity.getResources().getColor(2131100139));
            ViewDetailsTMDBActivity viewDetailsTMDBActivity2 = this.f19308d;
            viewDetailsTMDBActivity2.toolbar.setBackgroundColor(viewDetailsTMDBActivity2.getResources().getColor(2131100139));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsTMDBActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$f.class */
    public class C3278f implements C0304c1.d {

        /* renamed from: a */
        public final ArrayList f19309a;

        /* renamed from: b */
        public final String f19310b;

        /* renamed from: c */
        public final ViewDetailsTMDBActivity f19311c;

        public C3278f(ViewDetailsTMDBActivity viewDetailsTMDBActivity, ArrayList arrayList, String str) {
            this.f19311c = viewDetailsTMDBActivity;
            this.f19309a = arrayList;
            this.f19310b = str;
        }

        @Override // androidx.appcompat.widget.C0304c1.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            ArrayList arrayList;
            try {
                if (this.f19311c.f19274K.booleanValue() && (arrayList = this.f19309a) != null && arrayList.size() > 0) {
                    for (int i10 = 0; i10 < this.f19309a.size(); i10++) {
                        if (menuItem.getItemId() == i10) {
                            if (menuItem.getItemId() == 0) {
                                C5255e.m26220W(this.f19311c.f19293p, this.f19310b, this.f19311c.f19269F, this.f19311c.f19265B, this.f19311c.f19266C, this.f19311c.f19267D, this.f19311c.f19302y, this.f19311c.f19268E, 0);
                            } else {
                                Intent intent = new Intent(this.f19311c.f19293p, (Class<?>) PlayExternalPlayerActivity.class);
                                intent.putExtra("url", this.f19311c.f19268E);
                                intent.putExtra("app_name", ((ExternalPlayerModelClass) this.f19309a.get(i10)).m15415a());
                                intent.putExtra("packagename", ((ExternalPlayerModelClass) this.f19309a.get(i10)).m15416b());
                                this.f19311c.f19293p.startActivity(intent);
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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsTMDBActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$g.class */
    public class C3279g implements C0304c1.c {

        /* renamed from: a */
        public final ViewDetailsTMDBActivity f19312a;

        public C3279g(ViewDetailsTMDBActivity viewDetailsTMDBActivity) {
            this.f19312a = viewDetailsTMDBActivity;
        }

        @Override // androidx.appcompat.widget.C0304c1.c
        /* renamed from: a */
        public void mo1281a(C0304c1 c0304c1) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsTMDBActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$h.class */
    public class ViewOnClickListenerC3280h implements View.OnClickListener {

        /* renamed from: b */
        public final ViewDetailsTMDBActivity f19313b;

        public ViewOnClickListenerC3280h(ViewDetailsTMDBActivity viewDetailsTMDBActivity) {
            this.f19313b = viewDetailsTMDBActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f19313b.f19272I.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsTMDBActivity$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$i.class */
    public class ViewOnClickListenerC3281i implements View.OnClickListener {

        /* renamed from: b */
        public final ViewDetailsTMDBActivity f19314b;

        public ViewOnClickListenerC3281i(ViewDetailsTMDBActivity viewDetailsTMDBActivity) {
            this.f19314b = viewDetailsTMDBActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f19314b.f19272I.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsTMDBActivity$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$j.class */
    public class ViewOnClickListenerC3282j implements View.OnClickListener {

        /* renamed from: b */
        public final ViewDetailsTMDBActivity f19315b;

        public ViewOnClickListenerC3282j(ViewDetailsTMDBActivity viewDetailsTMDBActivity) {
            this.f19315b = viewDetailsTMDBActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f19315b.f19272I.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsTMDBActivity$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$k.class */
    public class ViewOnClickListenerC3283k implements View.OnClickListener {

        /* renamed from: b */
        public final ViewDetailsTMDBActivity f19316b;

        public ViewOnClickListenerC3283k(ViewDetailsTMDBActivity viewDetailsTMDBActivity) {
            this.f19316b = viewDetailsTMDBActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f19316b.f19293p);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$l.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsTMDBActivity$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$l.class */
    public class ViewOnClickListenerC3284l implements View.OnClickListener {

        /* renamed from: b */
        public final ViewDetailsTMDBActivity f19317b;

        public ViewOnClickListenerC3284l(ViewDetailsTMDBActivity viewDetailsTMDBActivity) {
            this.f19317b = viewDetailsTMDBActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f19317b.onBackPressed();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$m.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsTMDBActivity$m */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$m.class */
    public class ViewOnClickListenerC3285m implements View.OnClickListener {

        /* renamed from: b */
        public final Context f19318b;

        /* renamed from: c */
        public final ViewDetailsTMDBActivity f19319c;

        public ViewOnClickListenerC3285m(ViewDetailsTMDBActivity viewDetailsTMDBActivity, Context context) {
            this.f19319c = viewDetailsTMDBActivity;
            this.f19318b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f19319c.f19297t.m15159E0(this.f19319c.f19268E, SharepreferenceDBHandler.m15337A(this.f19318b)).size() > 0) {
                this.f19319c.m16858K0();
            } else {
                this.f19319c.m16853D0();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$n.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsTMDBActivity$n */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$n.class */
    public class C3286n extends AbstractC8627g<Bitmap> {

        /* renamed from: d */
        public final ViewDetailsTMDBActivity f19320d;

        public C3286n(ViewDetailsTMDBActivity viewDetailsTMDBActivity) {
            this.f19320d = viewDetailsTMDBActivity;
        }

        @Override // p330t4.InterfaceC8630j
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo16635c(Bitmap bitmap, InterfaceC8527c interfaceC8527c) {
            this.f19320d.ivMovieImage.setBackground(new BitmapDrawable(bitmap));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$o.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsTMDBActivity$o */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$o.class */
    public class DialogInterfaceOnClickListenerC3287o implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ViewDetailsTMDBActivity f19321b;

        public DialogInterfaceOnClickListenerC3287o(ViewDetailsTMDBActivity viewDetailsTMDBActivity) {
            this.f19321b = viewDetailsTMDBActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$p.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsTMDBActivity$p */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$p.class */
    public class DialogInterfaceOnClickListenerC3288p implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ViewDetailsTMDBActivity f19322b;

        public DialogInterfaceOnClickListenerC3288p(ViewDetailsTMDBActivity viewDetailsTMDBActivity) {
            this.f19322b = viewDetailsTMDBActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f19322b.f19293p);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$q.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsTMDBActivity$q */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$q.class */
    public class DialogInterfaceOnClickListenerC3289q implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ViewDetailsTMDBActivity f19323b;

        public DialogInterfaceOnClickListenerC3289q(ViewDetailsTMDBActivity viewDetailsTMDBActivity) {
            this.f19323b = viewDetailsTMDBActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f19323b.f19293p);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$r.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsTMDBActivity$r */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ViewDetailsTMDBActivity$r.class */
    public class ViewOnFocusChangeListenerC3290r implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f19324b;

        /* renamed from: c */
        public final ViewDetailsTMDBActivity f19325c;

        public ViewOnFocusChangeListenerC3290r(ViewDetailsTMDBActivity viewDetailsTMDBActivity, View view) {
            this.f19325c = viewDetailsTMDBActivity;
            this.f19324b = view;
        }

        /* renamed from: a */
        public final void m16864a(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f19324b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: b */
        public final void m16865b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f19324b, "scaleY", f10);
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
                Log.e("id is", "" + this.f19324b.getTag());
                View view2 = this.f19324b;
                if (view2 == null || view2.getTag() == null) {
                    return;
                }
                i10 = 2131230846;
                if (this.f19324b.getTag().equals("1")) {
                    m16864a(f10);
                    m16865b(f10);
                    linearLayout = this.f19325c.ll_play_button_main_layout;
                } else if (this.f19324b.getTag().equals("2")) {
                    m16864a(f10);
                    m16865b(f10);
                    linearLayout = this.f19324b;
                } else {
                    if (!this.f19324b.getTag().equals("5")) {
                        if (!this.f19324b.getTag().equals("8")) {
                            m16864a(1.15f);
                            m16865b(1.15f);
                            return;
                        } else {
                            m16864a(f10);
                            m16865b(f10);
                            this.f19325c.f19292o.setBackgroundResource(2131230828);
                            return;
                        }
                    }
                    m16864a(f10);
                    m16865b(f10);
                    linearLayout = this.f19325c.ll_watch_trailer_button_main_layout;
                }
            } else {
                if (z10) {
                    return;
                }
                if (z10) {
                    f10 = 1.09f;
                }
                m16864a(f10);
                m16865b(f10);
                View view3 = this.f19324b;
                if (view3 == null || view3.getTag() == null) {
                    return;
                }
                i10 = 2131231768;
                if (!this.f19324b.getTag().equals("1")) {
                    if (this.f19324b.getTag().equals("3")) {
                        button = this.f19324b;
                    } else {
                        if (!this.f19324b.getTag().equals("5")) {
                            if (this.f19324b.getTag() == null || !this.f19324b.getTag().equals("8")) {
                                return;
                            } else {
                                button = this.f19325c.f19292o;
                            }
                        }
                        linearLayout = this.f19325c.ll_watch_trailer_button_main_layout;
                    }
                    button.setBackgroundResource(2131230845);
                    return;
                }
                linearLayout = this.f19325c.ll_play_button_main_layout;
            }
            linearLayout.setBackgroundResource(i10);
        }
    }

    /* renamed from: F0 */
    public static long m16842F0(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: G0 */
    public static String m16843G0(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    /* renamed from: D0 */
    public final void m16853D0() {
        FavouriteM3UModel favouriteM3UModel = new FavouriteM3UModel();
        favouriteM3UModel.m14782h(this.f19268E);
        favouriteM3UModel.m14783i(SharepreferenceDBHandler.m15337A(this.f19293p));
        favouriteM3UModel.m14781g(this.f19302y);
        favouriteM3UModel.m14779e(this.f19270G);
        this.f19297t.m15156D0(favouriteM3UModel);
        if (Build.VERSION.SDK_INT <= 21) {
            this.ivFavourite.setImageResource(2131231090);
        }
        this.ivFavourite.setImageDrawable(this.f19293p.getResources().getDrawable(2131231090, null));
    }

    /* renamed from: E0 */
    public final void m16854E0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: H0 */
    public void m16855H0() {
        getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    /* renamed from: I0 */
    public final void m16856I0() {
        this.f19297t = new LiveStreamDBHandler(this.f19293p);
        this.f19271H = new DatabaseHandler(this.f19293p);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f19295r = sharedPreferences;
        String string = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        String string2 = this.f19295r.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        if (string.isEmpty() || string2.isEmpty()) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
            overridePendingTransition(2130772003, 2130772000);
        } else {
            m16860M0(this.f19293p, string, string2);
        }
        this.logo.setOnClickListener(new ViewOnClickListenerC3283k(this));
        this.iv_back_button.setOnClickListener(new ViewOnClickListenerC3284l(this));
    }

    /* renamed from: J0 */
    public final void m16857J0(ViewDetailsTMDBActivity viewDetailsTMDBActivity) {
        View inflate = ((LayoutInflater) viewDetailsTMDBActivity.getSystemService("layout_inflater")).inflate(2131624241, (RelativeLayout) viewDetailsTMDBActivity.findViewById(2131429033));
        PopupWindow popupWindow = new PopupWindow(viewDetailsTMDBActivity);
        this.f19272I = popupWindow;
        popupWindow.setContentView(inflate);
        this.f19272I.setWidth(-1);
        this.f19272I.setHeight(-1);
        this.f19272I.setFocusable(true);
        this.f19272I.setBackgroundDrawable(new BitmapDrawable());
        this.f19272I.showAtLocation(inflate, 17, 0, 0);
        this.f19292o = (Button) inflate.findViewById(2131427623);
        this.f19285h = (Button) inflate.findViewById(2131427605);
        Button button = this.f19292o;
        if (button != null) {
            button.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3290r(this, button));
        }
        Button button2 = this.f19285h;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3290r(this, button2));
        }
        this.f19285h.setOnClickListener(new ViewOnClickListenerC3280h(this));
        this.f19292o.setOnClickListener(new ViewOnClickListenerC3281i(this));
    }

    /* renamed from: K0 */
    public final void m16858K0() {
        this.f19297t.m15188R0(this.f19268E, SharepreferenceDBHandler.m15337A(this.f19293p));
        if (Build.VERSION.SDK_INT <= 21) {
            this.ivFavourite.setImageResource(2131231091);
        }
        this.ivFavourite.setImageDrawable(this.f19293p.getResources().getDrawable(2131231091, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f6, code lost:
    
        if (r12 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0129, code lost:
    
        r12.setText("N/A");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0126, code lost:
    
        if (r12 != null) goto L41;
     */
    @Override // p324sf.InterfaceC8570i
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo16819L(com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBGenreCallback r8) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsTMDBActivity.mo16819L(com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBGenreCallback):void");
    }

    /* renamed from: L0 */
    public final void m16859L0(ViewDetailsTMDBActivity viewDetailsTMDBActivity) {
        View inflate = ((LayoutInflater) viewDetailsTMDBActivity.getSystemService("layout_inflater")).inflate(2131624235, (RelativeLayout) viewDetailsTMDBActivity.findViewById(2131429033));
        TextView textView = (TextView) inflate.findViewById(2131429376);
        this.f19289l = textView;
        textView.setText(this.f19286i);
        PopupWindow popupWindow = new PopupWindow(viewDetailsTMDBActivity);
        this.f19272I = popupWindow;
        popupWindow.setContentView(inflate);
        this.f19272I.setWidth(-1);
        this.f19272I.setHeight(-1);
        this.f19272I.setFocusable(true);
        this.f19272I.showAtLocation(inflate, 17, 0, 0);
        Button button = (Button) inflate.findViewById(2131427605);
        this.f19285h = button;
        if (button != null) {
            button.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3290r(this, button));
        }
        this.f19285h.setOnClickListener(new ViewOnClickListenerC3282j(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0130 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: M0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m16860M0(android.content.Context r7, java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsTMDBActivity.m16860M0(android.content.Context, java.lang.String, java.lang.String):void");
    }

    @Override // p324sf.InterfaceC8570i
    /* renamed from: R */
    public void mo16824R(TMDBPersonInfoCallback tMDBPersonInfoCallback) {
    }

    @Override // p324sf.InterfaceC8570i
    /* renamed from: W */
    public void mo16826W(TMDBCastsCallback tMDBCastsCallback) {
        if (tMDBCastsCallback != null) {
            try {
                if (tMDBCastsCallback.m15066a() != null && tMDBCastsCallback.m15066a().size() > 0) {
                    this.rvCast.setLayoutManager(new LinearLayoutManager(this, 0, false));
                    this.rvCast.setItemAnimator(new C0704c());
                    CastAdapter castAdapter = new CastAdapter(tMDBCastsCallback.m15066a(), this.f19293p, true, this.f19279P);
                    this.f19278O = castAdapter;
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
        ProgressDialog progressDialog = this.f19294q;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0119, code lost:
    
        if (r8 != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x018a, code lost:
    
        r8.setText("N/A");
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0150, code lost:
    
        if (r8 != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0187, code lost:
    
        if (r8 != null) goto L65;
     */
    @Override // p324sf.InterfaceC8570i
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo16827b0(com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBCastsCallback r6) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsTMDBActivity.mo16827b0(com.maxdigitall.maxdigitaliptvbox.model.callback.TMDBCastsCallback):void");
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: c */
    public void mo15998c(String str) {
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
        boolean z10;
        int i10;
        TextView textView;
        TextView textView2;
        if (searchTMDBMoviesCallback == null || searchTMDBMoviesCallback.m15011b() == null || !searchTMDBMoviesCallback.m15011b().equals(1) || searchTMDBMoviesCallback.m15010a() == null || searchTMDBMoviesCallback.m15010a().get(0) == null) {
            if (searchTMDBMoviesCallback != null && searchTMDBMoviesCallback.m15011b() != null && searchTMDBMoviesCallback.m15011b().intValue() > 1 && searchTMDBMoviesCallback.m15010a() != null) {
                String trim = (!this.f19277N.equals("") ? this.f19277N : this.f19302y).trim();
                for (int i11 = 0; i11 < searchTMDBMoviesCallback.m15010a().size(); i11++) {
                    z10 = true;
                    i10 = i11;
                    if (searchTMDBMoviesCallback.m15010a().get(i11).m15470f().equals(trim)) {
                        break;
                    }
                    if (searchTMDBMoviesCallback.m15010a().get(i11).m15467c().equals(trim)) {
                        z10 = true;
                        i10 = i11;
                        break;
                    }
                }
            }
            z10 = false;
            i10 = 0;
            if (z10) {
                try {
                    int intValue = searchTMDBMoviesCallback.m15010a().get(i10).m15466b().intValue();
                    this.f19275L.m26713b(intValue);
                    this.f19275L.m26715d(intValue);
                    this.f19275L.m26718g(intValue);
                    this.f19275L.m26714c(intValue);
                    String m15469e = searchTMDBMoviesCallback.m15010a().get(i10).m15469e();
                    Double m15471g = searchTMDBMoviesCallback.m15010a().get(i10).m15471g();
                    String m15468d = searchTMDBMoviesCallback.m15010a().get(i10).m15468d();
                    String m15465a = searchTMDBMoviesCallback.m15010a().get(i10).m15465a();
                    String str = new C6783a(this.f19293p).m31288z().equals(C5251a.f30065s0) ? "https://image.tmdb.org/t/p/w1280/" + m15465a : "https://image.tmdb.org/t/p/w500/" + m15465a;
                    if (this.appbarToolbar != null && m15465a != null) {
                        this.f19279P = str;
                        C8617g.m37004u(getApplicationContext()).m37029q(str).m36988K().m36993l(new C3277e(this));
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
                    TextView textView4 = this.tvMovieInfo;
                    if (textView4 != null) {
                        textView4.setVisibility(8);
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    return;
                }
            }
            String str2 = this.f19302y;
            if (str2 != null && (textView2 = this.tvMovieName) != null) {
                textView2.setText(str2);
            }
            LinearLayout linearLayout3 = this.llDurationBox;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(0);
            }
            LinearLayout linearLayout4 = this.llDurationBoxInfo;
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(0);
            }
            TextView textView5 = this.tvMovieDurationInfo;
            if (textView5 != null) {
                textView5.setText("N/A");
            }
            TextView textView6 = this.tvCastInfo;
            if (textView6 != null) {
                textView6.setText("N/A");
            }
            TextView textView7 = this.tvDirectorInfo;
            if (textView7 != null) {
                textView7.setText("N/A");
            }
            TextView textView8 = this.tvReleaseDateInfo;
            if (textView8 != null) {
                textView8.setText("N/A");
            }
            TextView textView9 = this.tv_genre_info;
            if (textView9 != null) {
                textView9.setText("N/A");
            }
            textView = this.tvReadMore;
            if (textView == null) {
                return;
            }
        } else {
            int intValue2 = searchTMDBMoviesCallback.m15010a().get(0).m15466b().intValue();
            this.f19275L.m26713b(intValue2);
            this.f19275L.m26715d(intValue2);
            this.f19275L.m26718g(intValue2);
            this.f19275L.m26714c(intValue2);
            String m15469e2 = searchTMDBMoviesCallback.m15010a().get(0).m15469e();
            Double m15471g2 = searchTMDBMoviesCallback.m15010a().get(0).m15471g();
            String m15468d2 = searchTMDBMoviesCallback.m15010a().get(0).m15468d();
            String m15465a2 = searchTMDBMoviesCallback.m15010a().get(0).m15465a();
            String str3 = new C6783a(this.f19293p).m31288z().equals(C5251a.f30065s0) ? "https://image.tmdb.org/t/p/w1280/" + m15465a2 : "https://image.tmdb.org/t/p/w500/" + m15465a2;
            if (this.appbarToolbar != null && m15465a2 != null) {
                this.f19279P = str3;
                C8617g.m37004u(getApplicationContext()).m37029q(str3).m36988K().m36993l(new C3276d(this));
            }
            if (this.llReleasedBox == null || this.llReleasedBoxInfo == null || this.tvReleaseDateInfo == null || m15469e2 == null || m15469e2.isEmpty() || m15469e2.equals("n/A")) {
                LinearLayout linearLayout5 = this.llReleasedBox;
                if (linearLayout5 != null) {
                    linearLayout5.setVisibility(0);
                }
                LinearLayout linearLayout6 = this.llReleasedBoxInfo;
                if (linearLayout6 != null) {
                    linearLayout6.setVisibility(0);
                }
                TextView textView10 = this.tvReleaseDateInfo;
                if (textView10 != null) {
                    textView10.setText("N/A");
                }
            } else {
                this.llReleasedBox.setVisibility(0);
                this.llReleasedBoxInfo.setVisibility(0);
                this.tvReleaseDateInfo.setText(m15469e2);
            }
            if (this.ratingBar != null && m15471g2 != null && !m15471g2.equals("n/A")) {
                this.ratingBar.setVisibility(0);
                try {
                    this.ratingBar.setRating(Float.parseFloat(String.valueOf(m15471g2)) / 2.0f);
                } catch (NumberFormatException e12) {
                    this.ratingBar.setRating(0.0f);
                }
            }
            if (this.tvMovieInfo != null && m15468d2 != null && !m15468d2.isEmpty() && !m15468d2.equals("n/A")) {
                this.tvMovieInfo.setText(m15468d2);
                return;
            } else {
                textView = this.tvMovieInfo;
                if (textView == null) {
                    return;
                }
            }
        }
        textView.setVisibility(8);
    }

    @Override // p324sf.InterfaceC8570i
    /* renamed from: o */
    public void mo16829o(TMDBTrailerCallback tMDBTrailerCallback) {
        int i10;
        LinearLayout linearLayout;
        if (tMDBTrailerCallback == null || tMDBTrailerCallback.m15081a() == null || tMDBTrailerCallback.m15081a().size() <= 0) {
            return;
        }
        for (int i11 = 0; i11 < tMDBTrailerCallback.m15081a().size(); i11++) {
            if (tMDBTrailerCallback.m15081a().get(i11).m15489b().equals(HttpHeaders.TRAILER)) {
                String m15488a = tMDBTrailerCallback.m15081a().get(i11).m15488a();
                this.f19273J = m15488a;
                if (m15488a == null || m15488a.isEmpty()) {
                    TextView textView = this.tvWatchTrailer;
                    i10 = 8;
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                    linearLayout = this.ll_watch_trailer;
                    if (linearLayout == null) {
                        return;
                    }
                } else {
                    TextView textView2 = this.tvWatchTrailer;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                    linearLayout = this.ll_watch_trailer;
                    if (linearLayout == null) {
                        return;
                    } else {
                        i10 = 0;
                    }
                }
                linearLayout.setVisibility(i10);
                return;
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
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
        super.onCreate(bundle);
        m16855H0();
        setContentView(2131624084);
        ButterKnife.m5626a(this);
        overridePendingTransition(2130772003, 2130772000);
        AppBarLayout appBarLayout = this.appbarToolbar;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(2131230975));
        }
        this.f19276M = new C6783a(this.f19293p).m31288z().equals(C5251a.f30065s0) ? "tv" : "mobile";
        m16854E0();
        this.f19284g = new Date();
        TextView textView = this.tvPlay;
        if (textView != null) {
            textView.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3290r(this, textView));
            this.tvPlay.requestFocus();
            this.tvPlay.setFocusable(true);
        }
        f19262R = m16843G0(this.f19293p);
        Locale locale = Locale.US;
        this.f19287j = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        TextView textView2 = this.tvReadMore;
        if (textView2 != null) {
            textView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3290r(this, textView2));
        }
        this.f19282e = C5255e.m26247n0(C7708d.m33672d());
        f19263S = getApplicationContext().getPackageName();
        TextView textView3 = this.tvWatchTrailer;
        if (textView3 != null) {
            textView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3290r(this, textView3));
        }
        this.f19281d = C5255e.m26247n0(C7705a.m33651a());
        this.f19283f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        getWindow().setFlags(1024, 1024);
        m878n0((Toolbar) findViewById(2131429320));
        m16856I0();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.m1224x(2131689500);
        this.f19291n = menu;
        this.f19290m = menu.getItem(1).getSubMenu().findItem(2131427886);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i10 = 0; i10 < this.toolbar.getChildCount(); i10++) {
            if (this.toolbar.getChildAt(i10) instanceof ActionMenuView) {
                ((Toolbar.C0292e) this.toolbar.getChildAt(i10).getLayoutParams()).f26228a = 16;
            }
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 82) {
            return super.onKeyUp(i10, keyEvent);
        }
        Menu menu = this.f19291n;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(2131427886, 0);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.f19290m = menuItem;
        int itemId = menuItem.getItemId();
        if (itemId == 2131428761) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == 2131428776) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == 2131427416 && (context = this.f19293p) != null) {
            new DialogC0242a.a(context, 2132082693).setTitle(getResources().getString(2132017988)).m857e(getResources().getString(2132017987)).m861i(getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3288p(this)).m858f(getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3287o(this)).m865m();
        }
        if (itemId == 2131428637) {
            DialogC0242a.a aVar = new DialogC0242a.a(this);
            aVar.setTitle(this.f19293p.getResources().getString(2132017514));
            aVar.m857e(this.f19293p.getResources().getString(2132017585));
            aVar.m855c(2131231731);
            aVar.m861i(this.f19293p.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3289q(this));
            aVar.m858f(this.f19293p.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3273a(this));
            aVar.m865m();
        }
        if (itemId == 2131428639) {
            DialogC0242a.a aVar2 = new DialogC0242a.a(this);
            aVar2.setTitle(this.f19293p.getResources().getString(2132017514));
            aVar2.m857e(this.f19293p.getResources().getString(2132017585));
            aVar2.m855c(2131231731);
            aVar2.m861i(this.f19293p.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3274b(this));
            aVar2.m858f(this.f19293p.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3275c(this));
            aVar2.m865m();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        m16855H0();
        super.onResume();
        C5255e.m26233f(this.f19293p);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f19295r = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f19295r.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f19293p != null) {
            mo15997b();
        }
    }

    @OnClick
    public void onViewClicked(View view) {
        String str;
        String str2;
        switch (view.getId()) {
            case 2131428200:
            case 2131429558:
                SharedPreferences sharedPreferences = this.f19293p.getSharedPreferences("selectedPlayer", 0);
                this.f19296s = sharedPreferences;
                String string = sharedPreferences.getString("selectedPlayer", "");
                SimpleDateFormat simpleDateFormat = this.f19283f;
                if (m16842F0(simpleDateFormat, simpleDateFormat.format(new Date(C7709e.m33680a(this.f19293p))), this.f19287j.format(this.f19284g)) >= C7707c.m33667p() && (str = this.f19281d) != null && this.f19282e != null && (!f19262R.equals(str) || (this.f19281d != null && (str2 = this.f19282e) != null && !f19263S.equals(str2)))) {
                    this.f19274K = Boolean.FALSE;
                }
                if (this.f19274K.booleanValue()) {
                    try {
                        C5947e m29358c = C5938b.m29235e(this.f19293p).m29243c().m29358c();
                        this.f19280Q = m29358c;
                        if (m29358c != null && m29358c.m29348c()) {
                            C5947e c5947e = this.f19280Q;
                            String str3 = "";
                            if (c5947e != null) {
                                str3 = "";
                                if (c5947e.m29290r() != null) {
                                    str3 = "";
                                    if (this.f19280Q.m29290r().m31009j() != null) {
                                        str3 = "";
                                        if (this.f19280Q.m29290r().m31009j().m13058R() != null) {
                                            str3 = this.f19280Q.m29290r().m31009j().m13058R();
                                        }
                                    }
                                }
                            }
                            if (!str3.contains(this.f19268E)) {
                                C4718a.m23743c(0, true, C4718a.m23741a(this.f19302y, "", "", 0, this.f19268E, "videos/mp4", this.f19264A, "", null), this.f19280Q, this.f19293p);
                                break;
                            } else {
                                this.f19293p.startActivity(new Intent(this.f19293p, (Class<?>) ExpandedControlsActivity.class));
                                break;
                            }
                        } else {
                            new ArrayList();
                            ArrayList arrayList = new ArrayList();
                            C0304c1 c0304c1 = new C0304c1(this, view);
                            c0304c1.m1276c().inflate(2131689489, c0304c1.m1275b());
                            ArrayList<ExternalPlayerModelClass> m15132o = new ExternalPlayerDataBase(this.f19293p).m15132o();
                            if (m15132o != null) {
                                try {
                                    if (m15132o.size() > 0) {
                                        c0304c1.m1275b().add(0, 0, 0, this.f19293p.getResources().getString(2132018170));
                                        ExternalPlayerModelClass externalPlayerModelClass = new ExternalPlayerModelClass();
                                        externalPlayerModelClass.m15419e(0);
                                        externalPlayerModelClass.m15418d(this.f19293p.getResources().getString(2132018328));
                                        arrayList.add(externalPlayerModelClass);
                                        int i10 = 0;
                                        while (true) {
                                            int i11 = i10;
                                            if (i11 >= m15132o.size()) {
                                                c0304c1.m1279f(new C3278f(this, arrayList, string));
                                                c0304c1.m1278e(new C3279g(this));
                                                c0304c1.m1280g();
                                                break;
                                            } else {
                                                Menu m1275b = c0304c1.m1275b();
                                                int i12 = i11 + 1;
                                                m1275b.add(0, i12, 0, this.f19293p.getResources().getString(2132018328) + " " + m15132o.get(i11).m15415a());
                                                arrayList.add(m15132o.get(i11));
                                                i10 = i12;
                                            }
                                        }
                                    }
                                } catch (Exception e10) {
                                    return;
                                }
                            }
                            if (this.f19274K.booleanValue()) {
                                C5255e.m26220W(this.f19293p, string, this.f19269F, this.f19265B, this.f19266C, this.f19267D, this.f19302y, this.f19268E, 0);
                                break;
                            }
                        }
                    } catch (Exception e11) {
                        if (this.f19274K.booleanValue()) {
                            C5255e.m26220W(this.f19293p, string, this.f19269F, this.f19265B, this.f19266C, this.f19267D, this.f19302y, this.f19268E, 0);
                        }
                        return;
                    }
                }
                break;
            case 2131429581:
                m16859L0(this);
                break;
            case 2131429642:
                String str4 = this.f19273J;
                if (str4 != null && !str4.isEmpty()) {
                    startActivity(new Intent(this, (Class<?>) YouTubePlayerActivity.class).putExtra("you_tube_trailer", this.f19273J));
                    break;
                } else {
                    m16857J0(this);
                    break;
                }
                break;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        m16855H0();
    }
}

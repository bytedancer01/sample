package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.R;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Handler;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.C0704c;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteM3UModel;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamCategoryIdDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.VodAllCategoriesSingleton;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.PasswordStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.RecentWatchDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapterNewFlow;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.VodSubCatAdpaterNew;
import java.util.ArrayList;
import java.util.Iterator;
import nf.C6783a;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5251a;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories.class */
public class VodActivityNewFlowSubCategories extends ActivityC0243b implements View.OnClickListener {

    /* renamed from: R */
    public static ArrayList<LiveStreamCategoryIdDBModel> f19474R = new ArrayList<>();

    /* renamed from: S */
    public static ArrayList<LiveStreamCategoryIdDBModel> f19475S = new ArrayList<>();

    /* renamed from: T */
    public static ArrayList<LiveStreamCategoryIdDBModel> f19476T = new ArrayList<>();

    /* renamed from: U */
    public static ProgressBar f19477U;

    /* renamed from: A */
    public SharedPreferences.Editor f19478A;

    /* renamed from: B */
    public RecyclerView.AbstractC0685p f19479B;

    /* renamed from: C */
    public SharedPreferences f19480C;

    /* renamed from: D */
    public VodAdapter f19481D;

    /* renamed from: F */
    public DatabaseHandler f19483F;

    /* renamed from: G */
    public VodAdapterNewFlow f19484G;

    /* renamed from: I */
    public PopupWindow f19486I;

    /* renamed from: J */
    public SharedPreferences f19487J;

    /* renamed from: K */
    public SharedPreferences.Editor f19488K;

    /* renamed from: L */
    public GridLayoutManager f19489L;

    /* renamed from: M */
    public Handler f19490M;

    /* renamed from: N */
    public MenuItem f19491N;

    /* renamed from: O */
    public Menu f19492O;

    /* renamed from: P */
    public RecentWatchDBHandler f19493P;

    @BindView
    public AppBarLayout appbarToolbar;

    /* renamed from: d */
    public Context f19495d;

    /* renamed from: e */
    public SharedPreferences f19496e;

    /* renamed from: g */
    public ArrayList<PasswordStatusDBModel> f19498g;

    /* renamed from: h */
    public ArrayList<LiveStreamsDBModel> f19499h;

    /* renamed from: i */
    public ArrayList<LiveStreamsDBModel> f19500i;

    @BindView
    public ImageView iv_back_button;

    /* renamed from: j */
    public ArrayList<LiveStreamsDBModel> f19501j;

    /* renamed from: k */
    public ArrayList<FavouriteDBModel> f19502k;

    /* renamed from: l */
    public ArrayList<FavouriteM3UModel> f19503l;

    @BindView
    public ImageView logo;

    @BindView
    public RecyclerView myRecyclerView;

    /* renamed from: p */
    public LiveStreamDBHandler f19507p;

    @BindView
    public ProgressBar pbLoader;

    /* renamed from: r */
    public SearchView f19509r;

    @BindView
    public RelativeLayout rl_sub_cat;

    /* renamed from: s */
    public ProgressDialog f19510s;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public TextView tvNoStream;

    @BindView
    public TextView tvViewProvider;

    @BindView
    public TextView vodCategoryName;

    /* renamed from: w */
    public VodSubCatAdpaterNew f19514w;

    /* renamed from: x */
    public SharedPreferences f19515x;

    /* renamed from: y */
    public SharedPreferences.Editor f19516y;

    /* renamed from: z */
    public SharedPreferences f19517z;

    /* renamed from: f */
    public ArrayList<String> f19497f = new ArrayList<>();

    /* renamed from: m */
    public String f19504m = "";

    /* renamed from: n */
    public String f19505n = "";

    /* renamed from: o */
    public DatabaseUpdatedStatusDBModel f19506o = new DatabaseUpdatedStatusDBModel();

    /* renamed from: q */
    public DatabaseUpdatedStatusDBModel f19508q = new DatabaseUpdatedStatusDBModel();

    /* renamed from: t */
    public String f19511t = "";

    /* renamed from: u */
    public String f19512u = "";

    /* renamed from: v */
    public boolean f19513v = false;

    /* renamed from: E */
    public ArrayList<LiveStreamsDBModel> f19482E = new ArrayList<>();

    /* renamed from: H */
    public boolean f19485H = false;

    /* renamed from: Q */
    public boolean f19494Q = true;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSubCategories$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$a.class */
    public class DialogInterfaceOnClickListenerC3328a implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VodActivityNewFlowSubCategories f19518b;

        public DialogInterfaceOnClickListenerC3328a(VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories) {
            this.f19518b = vodActivityNewFlowSubCategories;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSubCategories$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$b.class */
    public class ViewOnClickListenerC3329b implements View.OnClickListener {

        /* renamed from: b */
        public final VodActivityNewFlowSubCategories f19519b;

        public ViewOnClickListenerC3329b(VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories) {
            this.f19519b = vodActivityNewFlowSubCategories;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f19519b.f19486I.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSubCategories$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$c.class */
    public class ViewOnClickListenerC3330c implements View.OnClickListener {

        /* renamed from: b */
        public final VodActivityNewFlowSubCategories f19520b;

        public ViewOnClickListenerC3330c(VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories) {
            this.f19520b = vodActivityNewFlowSubCategories;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SharepreferenceDBHandler.m15373f(this.f19520b.f19495d).equals("m3u")) {
                this.f19520b.f19507p.m15174K0("movie", SharepreferenceDBHandler.m15337A(this.f19520b.f19495d));
            } else {
                new AsyncTaskC3345r(this.f19520b, null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            }
            this.f19520b.f19486I.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSubCategories$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$d.class */
    public class ViewOnClickListenerC3331d implements View.OnClickListener {

        /* renamed from: b */
        public final VodActivityNewFlowSubCategories f19521b;

        public ViewOnClickListenerC3331d(VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories) {
            this.f19521b = vodActivityNewFlowSubCategories;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f19521b.f19486I.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSubCategories$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$e.class */
    public class ViewOnClickListenerC3332e implements View.OnClickListener {

        /* renamed from: b */
        public final RadioGroup f19522b;

        /* renamed from: c */
        public final View f19523c;

        /* renamed from: d */
        public final Activity f19524d;

        /* renamed from: e */
        public final VodActivityNewFlowSubCategories f19525e;

        public ViewOnClickListenerC3332e(VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories, RadioGroup radioGroup, View view, Activity activity) {
            this.f19525e = vodActivityNewFlowSubCategories;
            this.f19522b = radioGroup;
            this.f19523c = view;
            this.f19524d = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Activity activity;
            String str;
            RadioButton radioButton = (RadioButton) this.f19523c.findViewById(this.f19522b.getCheckedRadioButtonId());
            if (radioButton.getText().toString().equals(this.f19525e.getResources().getString(2132018611))) {
                activity = this.f19524d;
                str = "1";
            } else if (radioButton.getText().toString().equals(this.f19525e.getResources().getString(2132018607))) {
                activity = this.f19524d;
                str = "2";
            } else if (radioButton.getText().toString().equals(this.f19525e.getResources().getString(2132018615))) {
                activity = this.f19524d;
                str = "3";
            } else {
                activity = this.f19524d;
                str = "0";
            }
            SharepreferenceDBHandler.m15384k0(str, activity);
            VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories = this.f19525e;
            vodActivityNewFlowSubCategories.f19515x = vodActivityNewFlowSubCategories.getSharedPreferences("listgridview", 0);
            VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories2 = this.f19525e;
            vodActivityNewFlowSubCategories2.f19516y = vodActivityNewFlowSubCategories2.f19515x.edit();
            int i10 = this.f19525e.f19515x.getInt("vod", 0);
            C5251a.f30070v = i10;
            if (i10 == 1) {
                this.f19525e.m16953V0();
            } else {
                this.f19525e.m16952T0();
            }
            this.f19525e.f19486I.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSubCategories$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$f.class */
    public class ViewOnClickListenerC3333f implements View.OnClickListener {

        /* renamed from: b */
        public final VodActivityNewFlowSubCategories f19526b;

        public ViewOnClickListenerC3333f(VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories) {
            this.f19526b = vodActivityNewFlowSubCategories;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f19526b.f19486I.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSubCategories$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$g.class */
    public class ViewOnClickListenerC3334g implements View.OnClickListener {

        /* renamed from: b */
        public final RecentWatchDBHandler f19527b;

        /* renamed from: c */
        public final int f19528c;

        /* renamed from: d */
        public final Context f19529d;

        /* renamed from: e */
        public final VodActivityNewFlowSubCategories f19530e;

        public ViewOnClickListenerC3334g(VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories, RecentWatchDBHandler recentWatchDBHandler, int i10, Context context) {
            this.f19530e = vodActivityNewFlowSubCategories;
            this.f19527b = recentWatchDBHandler;
            this.f19528c = i10;
            this.f19529d = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RecentWatchDBHandler recentWatchDBHandler = this.f19527b;
            if (recentWatchDBHandler != null) {
                recentWatchDBHandler.m15315v(this.f19528c, "movie");
            }
            Toast.makeText(this.f19529d, this.f19530e.getResources().getString(2132018079), 0).show();
            if (this.f19530e.f19481D != null) {
                this.f19530e.m16956Y0();
                this.f19530e.f19486I.dismiss();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSubCategories$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$h.class */
    public class ViewOnClickListenerC3335h implements View.OnClickListener {

        /* renamed from: b */
        public final VodActivityNewFlowSubCategories f19531b;

        public ViewOnClickListenerC3335h(VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories) {
            this.f19531b = vodActivityNewFlowSubCategories;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f19531b.f19495d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSubCategories$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$i.class */
    public class ViewOnClickListenerC3336i implements View.OnClickListener {

        /* renamed from: b */
        public final VodActivityNewFlowSubCategories f19532b;

        public ViewOnClickListenerC3336i(VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories) {
            this.f19532b = vodActivityNewFlowSubCategories;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f19532b.onBackPressed();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSubCategories$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$j.class */
    public class DialogInterfaceOnClickListenerC3337j implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VodActivityNewFlowSubCategories f19533b;

        public DialogInterfaceOnClickListenerC3337j(VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories) {
            this.f19533b = vodActivityNewFlowSubCategories;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSubCategories$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$k.class */
    public class DialogInterfaceOnClickListenerC3338k implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VodActivityNewFlowSubCategories f19534b;

        public DialogInterfaceOnClickListenerC3338k(VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories) {
            this.f19534b = vodActivityNewFlowSubCategories;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f19534b.f19495d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$l.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSubCategories$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$l.class */
    public class C3339l implements SearchView.InterfaceC0282l {

        /* renamed from: a */
        public final VodActivityNewFlowSubCategories f19535a;

        public C3339l(VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories) {
            this.f19535a = vodActivityNewFlowSubCategories;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            this.f19535a.tvNoRecordFound.setVisibility(8);
            if (this.f19535a.f19514w == null || (textView = this.f19535a.tvNoStream) == null || textView.getVisibility() == 0) {
                return false;
            }
            this.f19535a.f19514w.m17614o0(str, this.f19535a.tvNoRecordFound);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$m.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSubCategories$m */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$m.class */
    public class C3340m implements SearchView.InterfaceC0282l {

        /* renamed from: a */
        public final VodActivityNewFlowSubCategories f19536a;

        public C3340m(VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories) {
            this.f19536a = vodActivityNewFlowSubCategories;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            this.f19536a.tvNoRecordFound.setVisibility(8);
            if (this.f19536a.f19481D == null || (textView = this.f19536a.tvNoStream) == null || textView.getVisibility() == 0) {
                return false;
            }
            this.f19536a.f19481D.m17527s0(str, this.f19536a.tvNoRecordFound);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$n.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSubCategories$n */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$n.class */
    public class DialogInterfaceOnClickListenerC3341n implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VodActivityNewFlowSubCategories f19537b;

        public DialogInterfaceOnClickListenerC3341n(VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories) {
            this.f19537b = vodActivityNewFlowSubCategories;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f19537b.f19495d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$o.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSubCategories$o */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$o.class */
    public class DialogInterfaceOnClickListenerC3342o implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VodActivityNewFlowSubCategories f19538b;

        public DialogInterfaceOnClickListenerC3342o(VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories) {
            this.f19538b = vodActivityNewFlowSubCategories;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$p.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSubCategories$p */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$p.class */
    public class DialogInterfaceOnClickListenerC3343p implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VodActivityNewFlowSubCategories f19539b;

        public DialogInterfaceOnClickListenerC3343p(VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories) {
            this.f19539b = vodActivityNewFlowSubCategories;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$q.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSubCategories$q */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$q.class */
    public class AsyncTaskC3344q extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        public final VodActivityNewFlowSubCategories f19540a;

        public AsyncTaskC3344q(VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories) {
            this.f19540a = vodActivityNewFlowSubCategories;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            boolean z10 = false;
            String str = strArr[0];
            try {
                switch (str.hashCode()) {
                    case -998452030:
                        if (str.equals("get_fav_m3u")) {
                            break;
                        }
                        z10 = -1;
                        break;
                    case -723794989:
                        if (str.equals("get_recent_watched")) {
                            z10 = 3;
                            break;
                        }
                        z10 = -1;
                        break;
                    case -74801864:
                        if (str.equals("get_all")) {
                            z10 = 2;
                            break;
                        }
                        z10 = -1;
                        break;
                    case -74797390:
                        if (str.equals("get_fav")) {
                            z10 = true;
                            break;
                        }
                        z10 = -1;
                        break;
                    default:
                        z10 = -1;
                        break;
                }
                if (!z10) {
                    return this.f19540a.m16945M0();
                }
                if (z10) {
                    return this.f19540a.m16944L0();
                }
                if (z10 == 2) {
                    return this.f19540a.m16942J0(strArr[1]);
                }
                if (z10 != 3) {
                    return null;
                }
                return this.f19540a.m16947O0();
            } catch (Exception e10) {
                return "error";
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            str.hashCode();
            switch (str) {
                case "get_fav_m3u":
                    this.f19540a.m16941I0();
                    break;
                case "get_recent_watched":
                    this.f19540a.m16955X0();
                    break;
                case "get_all":
                    this.f19540a.m16963q0();
                    break;
                case "get_fav":
                    this.f19540a.m16940H0();
                    break;
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$r.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSubCategories$r */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$r.class */
    public class AsyncTaskC3345r extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a */
        public final VodActivityNewFlowSubCategories f19541a;

        public AsyncTaskC3345r(VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories) {
            this.f19541a = vodActivityNewFlowSubCategories;
        }

        public /* synthetic */ AsyncTaskC3345r(VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories, ViewOnClickListenerC3335h viewOnClickListenerC3335h) {
            this(vodActivityNewFlowSubCategories);
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            try {
                return this.f19541a.m16938F0();
            } catch (Exception e10) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            ProgressBar progressBar = this.f19541a.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            if (bool.booleanValue()) {
                Toast.makeText(this.f19541a.f19495d, this.f19541a.getResources().getString(2132017302), 0).show();
                this.f19541a.m16952T0();
            } else {
                this.f19541a.f19501j.clear();
                this.f19541a.f19481D.m4099w();
                this.f19541a.myRecyclerView.setVisibility(8);
                this.f19541a.tvNoRecordFound.setVisibility(0);
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            ProgressBar progressBar = this.f19541a.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$s.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSubCategories$s */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VodActivityNewFlowSubCategories$s.class */
    public class ViewOnFocusChangeListenerC3346s implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f19542b;

        /* renamed from: c */
        public final VodActivityNewFlowSubCategories f19543c;

        public ViewOnFocusChangeListenerC3346s(VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories, View view) {
            this.f19543c = vodActivityNewFlowSubCategories;
            this.f19542b = view;
        }

        /* renamed from: a */
        public final void m16968a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f19542b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m16969b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f19542b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m16970c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f19542b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            View view2;
            int i10;
            if (!z10) {
                if (z10) {
                    return;
                }
                m16968a(z10);
                if ((this.f19542b.getTag() == null || !this.f19542b.getTag().equals("1")) && (this.f19542b.getTag() == null || !this.f19542b.getTag().equals("2"))) {
                    m16969b(1.0f);
                    m16970c(1.0f);
                    return;
                } else {
                    m16969b(1.0f);
                    m16970c(1.0f);
                    this.f19542b.setBackgroundResource(2131230845);
                    return;
                }
            }
            if (this.f19542b.getTag() != null && this.f19542b.getTag().equals("1")) {
                m16969b(1.15f);
                m16970c(1.15f);
                view2 = this.f19542b;
                i10 = 2131230828;
            } else {
                if (this.f19542b.getTag() == null || !this.f19542b.getTag().equals("2")) {
                    m16969b(1.15f);
                    return;
                }
                m16969b(1.15f);
                m16970c(1.15f);
                view2 = this.f19542b;
                i10 = 2131231576;
            }
            view2.setBackgroundResource(i10);
        }
    }

    /* renamed from: E0 */
    public final void m16937E0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: F0 */
    public Boolean m16938F0() {
        ArrayList<LiveStreamsDBModel> arrayList = this.f19501j;
        if (arrayList == null || arrayList.size() <= 0) {
            return Boolean.FALSE;
        }
        for (int i10 = 0; i10 < this.f19501j.size(); i10++) {
            this.f19493P.m15315v(C5255e.m26215R(this.f19501j.get(i10).m14811R()), "movie");
        }
        return Boolean.TRUE;
    }

    /* renamed from: G0 */
    public void m16939G0(int i10, String str, Context context, RecentWatchDBHandler recentWatchDBHandler) {
        try {
            View inflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(2131624152, (RelativeLayout) findViewById(2131429033));
            PopupWindow popupWindow = new PopupWindow(this);
            this.f19486I = popupWindow;
            popupWindow.setContentView(inflate);
            this.f19486I.setWidth(-1);
            this.f19486I.setHeight(-1);
            this.f19486I.setFocusable(true);
            this.f19486I.showAtLocation(inflate, 17, 0, 0);
            ((TextView) inflate.findViewById(2131429411)).setText(getResources().getString(2132017562));
            Button button = (Button) inflate.findViewById(2131427628);
            Button button2 = (Button) inflate.findViewById(2131427605);
            if (button != null) {
                button.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3346s(this, button));
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3346s(this, button2));
            }
            button2.setOnClickListener(new ViewOnClickListenerC3333f(this));
            if (button != null) {
                button.setOnClickListener(new ViewOnClickListenerC3334g(this, recentWatchDBHandler, i10, context));
            }
        } catch (NullPointerException | Exception e10) {
        }
    }

    /* renamed from: H0 */
    public void m16940H0() {
        ArrayList<LiveStreamsDBModel> arrayList;
        ArrayList<LiveStreamsDBModel> arrayList2;
        if (this.myRecyclerView != null && (arrayList2 = this.f19482E) != null && arrayList2.size() != 0) {
            this.f19481D = new VodAdapter(this.f19482E, this.f19495d, true);
            VodAllCategoriesSingleton.m14909b().m14921m(this.f19482E);
            this.myRecyclerView.setAdapter(this.f19481D);
            C5255e.m26243l0(this.f19495d, getResources().getString(2132018759));
            this.tvNoStream.setVisibility(4);
        }
        if (this.tvNoStream != null && (arrayList = this.f19482E) != null && arrayList.size() == 0) {
            RecyclerView recyclerView = this.myRecyclerView;
            if (recyclerView != null) {
                recyclerView.setAdapter(this.f19481D);
            }
            this.tvNoStream.setText(getResources().getString(2132018205));
            this.tvNoStream.setVisibility(0);
        }
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    /* renamed from: I0 */
    public void m16941I0() {
        ArrayList<LiveStreamsDBModel> arrayList;
        ArrayList<LiveStreamsDBModel> arrayList2;
        if (this.myRecyclerView != null && (arrayList2 = this.f19482E) != null && arrayList2.size() != 0) {
            this.f19481D = new VodAdapter(this.f19482E, this.f19495d, true);
            VodAllCategoriesSingleton.m14909b().m14921m(this.f19482E);
            this.myRecyclerView.setAdapter(this.f19481D);
            C5255e.m26243l0(this.f19495d, getResources().getString(2132018759));
            this.tvNoStream.setVisibility(4);
        }
        if (this.tvNoStream != null && (arrayList = this.f19482E) != null && arrayList.size() == 0) {
            RecyclerView recyclerView = this.myRecyclerView;
            if (recyclerView != null) {
                recyclerView.setAdapter(this.f19481D);
            }
            this.tvNoStream.setText(getResources().getString(2132018205));
            this.tvNoStream.setVisibility(0);
        }
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    /* renamed from: J0 */
    public String m16942J0(String str) {
        this.f19498g = new ArrayList<>();
        this.f19499h = new ArrayList<>();
        this.f19500i = new ArrayList<>();
        this.f19501j = new ArrayList<>();
        this.f19501j = this.f19507p.m15217f1(str, "movie");
        return "get_all";
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00e9 A[Catch: NullPointerException | Exception -> 0x0205, NullPointerException | Exception -> 0x0205, TryCatch #0 {NullPointerException | Exception -> 0x0205, blocks: (B:2:0x0000, B:2:0x0000, B:5:0x0033, B:5:0x0033, B:7:0x0052, B:7:0x0052, B:9:0x0059, B:9:0x0059, B:11:0x0085, B:11:0x0085, B:12:0x00e2, B:12:0x00e2, B:14:0x00e9, B:14:0x00e9, B:18:0x0152, B:18:0x0152, B:20:0x0160, B:20:0x0160, B:22:0x016b, B:22:0x016b, B:24:0x017b, B:24:0x017b, B:26:0x0187, B:26:0x0187, B:28:0x018d, B:28:0x018d, B:30:0x0195, B:30:0x0195, B:32:0x019c, B:32:0x019c, B:34:0x01a3, B:34:0x01a3, B:36:0x01ac, B:36:0x01ac, B:37:0x01b0, B:37:0x01b0, B:37:0x01b0, B:38:0x01b3, B:39:0x01ce, B:39:0x01ce, B:41:0x01d7, B:41:0x01d7, B:43:0x01dc, B:43:0x01dc, B:45:0x01e4, B:45:0x01e4, B:47:0x01ea, B:47:0x01ea, B:49:0x01f2, B:49:0x01f2, B:50:0x0175, B:50:0x0175, B:52:0x01f8, B:52:0x01f8, B:54:0x0200, B:54:0x0200, B:59:0x008c, B:59:0x008c, B:61:0x00ab, B:61:0x00ab, B:63:0x00b2, B:63:0x00b2), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0200 A[Catch: NullPointerException | Exception -> 0x0205, NullPointerException | Exception -> 0x0205, TRY_ENTER, TryCatch #0 {NullPointerException | Exception -> 0x0205, blocks: (B:2:0x0000, B:2:0x0000, B:5:0x0033, B:5:0x0033, B:7:0x0052, B:7:0x0052, B:9:0x0059, B:9:0x0059, B:11:0x0085, B:11:0x0085, B:12:0x00e2, B:12:0x00e2, B:14:0x00e9, B:14:0x00e9, B:18:0x0152, B:18:0x0152, B:20:0x0160, B:20:0x0160, B:22:0x016b, B:22:0x016b, B:24:0x017b, B:24:0x017b, B:26:0x0187, B:26:0x0187, B:28:0x018d, B:28:0x018d, B:30:0x0195, B:30:0x0195, B:32:0x019c, B:32:0x019c, B:34:0x01a3, B:34:0x01a3, B:36:0x01ac, B:36:0x01ac, B:37:0x01b0, B:37:0x01b0, B:37:0x01b0, B:38:0x01b3, B:39:0x01ce, B:39:0x01ce, B:41:0x01d7, B:41:0x01d7, B:43:0x01dc, B:43:0x01dc, B:45:0x01e4, B:45:0x01e4, B:47:0x01ea, B:47:0x01ea, B:49:0x01f2, B:49:0x01f2, B:50:0x0175, B:50:0x0175, B:52:0x01f8, B:52:0x01f8, B:54:0x0200, B:54:0x0200, B:59:0x008c, B:59:0x008c, B:61:0x00ab, B:61:0x00ab, B:63:0x00b2, B:63:0x00b2), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* renamed from: K0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m16943K0() {
        /*
            Method dump skipped, instructions count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSubCategories.m16943K0():void");
    }

    /* renamed from: L0 */
    public String m16944L0() {
        new ArrayList();
        this.f19482E.clear();
        DatabaseHandler databaseHandler = new DatabaseHandler(this.f19495d);
        this.f19483F = databaseHandler;
        ArrayList<FavouriteDBModel> m15116v = databaseHandler.m15116v("vod", SharepreferenceDBHandler.m15337A(this.f19495d));
        if (this.f19497f != null) {
            this.f19497f = m16946N0();
        }
        ArrayList<String> arrayList = this.f19497f;
        ArrayList<FavouriteDBModel> arrayList2 = m15116v;
        if (arrayList != null) {
            arrayList2 = m15116v;
            if (arrayList.size() > 0) {
                arrayList2 = m15116v;
                if (m15116v != null) {
                    arrayList2 = m15116v;
                    if (m15116v.size() > 0) {
                        arrayList2 = m16949Q0(m15116v, this.f19497f);
                    }
                }
            }
        }
        Iterator<FavouriteDBModel> it = arrayList2.iterator();
        while (it.hasNext()) {
            FavouriteDBModel next = it.next();
            LiveStreamsDBModel m15179M1 = new LiveStreamDBHandler(this.f19495d).m15179M1(next.m14760a(), String.valueOf(next.m14764e()));
            if (m15179M1 != null) {
                this.f19482E.add(m15179M1);
            }
        }
        return "get_fav";
    }

    /* renamed from: M0 */
    public String m16945M0() {
        new ArrayList();
        this.f19482E.clear();
        ArrayList<FavouriteM3UModel> m15175K1 = this.f19507p.m15175K1("movie");
        if (this.f19497f != null) {
            this.f19497f = m16946N0();
        }
        ArrayList<String> arrayList = this.f19497f;
        ArrayList<FavouriteM3UModel> arrayList2 = m15175K1;
        if (arrayList != null) {
            arrayList2 = m15175K1;
            if (arrayList.size() > 0) {
                arrayList2 = m15175K1;
                if (m15175K1 != null) {
                    arrayList2 = m15175K1;
                    if (m15175K1.size() > 0) {
                        arrayList2 = m16950R0(m15175K1, this.f19497f);
                    }
                }
            }
        }
        Iterator<FavouriteM3UModel> it = arrayList2.iterator();
        while (it.hasNext()) {
            FavouriteM3UModel next = it.next();
            ArrayList<LiveStreamsDBModel> m15183O1 = this.f19507p.m15183O1(next.m14775a(), next.m14777c());
            if (m15183O1 != null && m15183O1.size() > 0) {
                this.f19482E.add(m15183O1.get(0));
            }
        }
        return "get_fav_m3u";
    }

    /* renamed from: N0 */
    public final ArrayList<String> m16946N0() {
        ArrayList<PasswordStatusDBModel> m15232m1 = this.f19507p.m15232m1(SharepreferenceDBHandler.m15337A(this.f19495d));
        this.f19498g = m15232m1;
        if (m15232m1 != null) {
            Iterator<PasswordStatusDBModel> it = m15232m1.iterator();
            while (it.hasNext()) {
                PasswordStatusDBModel next = it.next();
                if (next.m15290a().equals("1")) {
                    this.f19497f.add(next.m15291b());
                }
            }
        }
        return this.f19497f;
    }

    /* renamed from: O0 */
    public String m16947O0() {
        this.f19498g = new ArrayList<>();
        this.f19499h = new ArrayList<>();
        this.f19500i = new ArrayList<>();
        this.f19501j = new ArrayList<>();
        ArrayList<LiveStreamsDBModel> m15214e1 = SharepreferenceDBHandler.m15373f(this.f19495d).equals("m3u") ? this.f19507p.m15214e1("movie", SharepreferenceDBHandler.m15337A(this.f19495d), "getalldata") : this.f19493P.m15317w("movie", SharepreferenceDBHandler.m15337A(this.f19495d), "getalldata");
        ArrayList<LiveStreamsDBModel> arrayList = m15214e1;
        if (this.f19507p.m15189R1(SharepreferenceDBHandler.m15337A(this.f19495d)) > 0) {
            arrayList = m15214e1;
            if (m15214e1 != null) {
                ArrayList<String> m16946N0 = m16946N0();
                this.f19497f = m16946N0;
                if (m16946N0 != null) {
                    this.f19500i = m16948P0(m15214e1, m16946N0);
                }
                arrayList = this.f19500i;
            }
        }
        this.f19501j = arrayList;
        return "get_recent_watched";
    }

    /* renamed from: P0 */
    public final ArrayList<LiveStreamsDBModel> m16948P0(ArrayList<LiveStreamsDBModel> arrayList, ArrayList<String> arrayList2) {
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
                this.f19499h.add(next);
                next.m14827g();
            }
        }
        return this.f19499h;
    }

    /* renamed from: Q0 */
    public final ArrayList<FavouriteDBModel> m16949Q0(ArrayList<FavouriteDBModel> arrayList, ArrayList<String> arrayList2) {
        boolean z10;
        this.f19502k = new ArrayList<>();
        if (arrayList == null) {
            return null;
        }
        Iterator<FavouriteDBModel> it = arrayList.iterator();
        while (it.hasNext()) {
            FavouriteDBModel next = it.next();
            if (arrayList2 != null) {
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
                    this.f19502k.add(next);
                }
            }
        }
        return this.f19502k;
    }

    /* renamed from: R0 */
    public final ArrayList<FavouriteM3UModel> m16950R0(ArrayList<FavouriteM3UModel> arrayList, ArrayList<String> arrayList2) {
        boolean z10;
        this.f19503l = new ArrayList<>();
        if (arrayList == null) {
            return null;
        }
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
                    this.f19503l.add(next);
                }
            }
        }
        return this.f19503l;
    }

    /* renamed from: S0 */
    public void m16951S0() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception e10) {
        }
    }

    /* renamed from: T0 */
    public final void m16952T0() {
        this.f19495d = this;
        this.f19507p = new LiveStreamDBHandler(this.f19495d);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f19495d == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f19495d, 7);
        this.f19479B = gridLayoutManager;
        this.myRecyclerView.setLayoutManager(gridLayoutManager);
        this.myRecyclerView.setItemAnimator(new C0704c());
        this.f19480C = this.f19495d.getSharedPreferences("loginPrefs", 0);
        m16959a1();
    }

    /* renamed from: V0 */
    public final void m16953V0() {
        this.f19495d = this;
        this.f19507p = new LiveStreamDBHandler(this.f19495d);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f19495d == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f19495d);
        this.f19479B = linearLayoutManager;
        this.myRecyclerView.setLayoutManager(linearLayoutManager);
        this.myRecyclerView.setItemAnimator(new C0704c());
        this.f19480C = this.f19495d.getSharedPreferences("loginPrefs", 0);
        m16959a1();
    }

    /* renamed from: W0 */
    public final void m16954W0(ArrayList<LiveStreamCategoryIdDBModel> arrayList) {
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f19495d == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        this.f19489L = new C6783a(this.f19495d).m31288z().equals(C5251a.f30065s0) ? new GridLayoutManager(this, 2) : new GridLayoutManager(this, 2);
        this.myRecyclerView.setLayoutManager(this.f19489L);
        this.myRecyclerView.setHasFixedSize(true);
        m16960b();
        VodSubCatAdpaterNew vodSubCatAdpaterNew = new VodSubCatAdpaterNew(arrayList, this.f19495d, this.f19507p);
        this.f19514w = vodSubCatAdpaterNew;
        this.myRecyclerView.setAdapter(vodSubCatAdpaterNew);
    }

    /* renamed from: X0 */
    public void m16955X0() {
        ProgressDialog progressDialog = this.f19510s;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        ArrayList<LiveStreamsDBModel> arrayList = this.f19501j;
        if (arrayList == null || this.myRecyclerView == null || arrayList.size() == 0) {
            TextView textView = this.tvNoStream;
            if (textView != null) {
                textView.setVisibility(0);
                this.myRecyclerView.setVisibility(8);
            }
        } else {
            this.f19494Q = false;
            this.f19481D = new VodAdapter(this.f19501j, this.f19495d, false, this);
            VodAllCategoriesSingleton.m14909b().m14921m(this.f19501j);
            this.myRecyclerView.setAdapter(this.f19481D);
            C5255e.m26243l0(this.f19495d, getResources().getString(2132018759));
        }
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    /* renamed from: Y0 */
    public final void m16956Y0() {
        SharedPreferences sharedPreferences = getSharedPreferences("listgridview", 0);
        this.f19515x = sharedPreferences;
        this.f19516y = sharedPreferences.edit();
        int i10 = this.f19515x.getInt("vod", 0);
        C5251a.f30070v = i10;
        if (i10 == 1) {
            m16953V0();
        } else {
            m16952T0();
        }
    }

    /* renamed from: Z0 */
    public final void m16957Z0(ArrayList<LiveStreamCategoryIdDBModel> arrayList) {
        m16954W0(arrayList);
    }

    /* renamed from: a */
    public void m16958a() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    /* renamed from: a1 */
    public final void m16959a1() {
        try {
            if (this.f19495d != null) {
                String str = this.f19511t;
                boolean z10 = -1;
                int hashCode = str.hashCode();
                if (hashCode != 1444) {
                    if (hashCode == 1447 && str.equals("-4")) {
                        z10 = true;
                    }
                } else if (str.equals("-1")) {
                    z10 = false;
                }
                if (z10) {
                    if (!z10) {
                        new AsyncTaskC3344q(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_all", this.f19511t);
                    } else {
                        new AsyncTaskC3344q(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_recent_watched", this.f19511t);
                    }
                } else if (SharepreferenceDBHandler.m15373f(this.f19495d).equals("m3u")) {
                    new AsyncTaskC3344q(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_fav_m3u");
                } else {
                    new AsyncTaskC3344q(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_fav");
                }
            }
            ProgressDialog progressDialog = this.f19510s;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        } catch (NullPointerException | Exception e10) {
        }
    }

    /* renamed from: b */
    public void m16960b() {
    }

    /* renamed from: b1 */
    public final void m16961b1() {
        try {
            View inflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(2131624152, (RelativeLayout) findViewById(2131429033));
            PopupWindow popupWindow = new PopupWindow(this);
            this.f19486I = popupWindow;
            popupWindow.setContentView(inflate);
            this.f19486I.setWidth(-1);
            this.f19486I.setHeight(-1);
            this.f19486I.setFocusable(true);
            this.f19486I.showAtLocation(inflate, 17, 0, 0);
            ((TextView) inflate.findViewById(2131429411)).setText(getResources().getString(2132017561));
            Button button = (Button) inflate.findViewById(2131427628);
            Button button2 = (Button) inflate.findViewById(2131427605);
            if (button != null) {
                button.setOnFocusChangeListener(new C5255e.i((View) button, this));
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new C5255e.i((View) button2, this));
            }
            button2.setOnClickListener(new ViewOnClickListenerC3329b(this));
            if (button != null) {
                button.setOnClickListener(new ViewOnClickListenerC3330c(this));
            }
        } catch (Exception e10) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c1 */
    public final void m16962c1(Activity activity) {
        boolean z10;
        try {
            View inflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(2131624516, (RelativeLayout) activity.findViewById(2131429032));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.f19486I = popupWindow;
            popupWindow.setContentView(inflate);
            this.f19486I.setWidth(-1);
            this.f19486I.setHeight(-1);
            this.f19486I.setFocusable(true);
            this.f19486I.showAtLocation(inflate, 17, 0, 0);
            Button button = (Button) inflate.findViewById(2131427623);
            Button button2 = (Button) inflate.findViewById(2131427605);
            RadioGroup radioGroup = (RadioGroup) inflate.findViewById(2131428935);
            RadioButton radioButton = (RadioButton) inflate.findViewById(2131428909);
            RadioButton radioButton2 = (RadioButton) inflate.findViewById(2131428903);
            RadioButton radioButton3 = (RadioButton) inflate.findViewById(2131428897);
            RadioButton radioButton4 = (RadioButton) inflate.findViewById(2131428916);
            RadioButton radioButton5 = (RadioButton) inflate.findViewById(2131428898);
            radioButton5.setVisibility(8);
            RadioButton radioButton6 = (RadioButton) inflate.findViewById(2131428899);
            radioButton6.setVisibility(8);
            radioButton.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3346s(this, radioButton));
            radioButton2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3346s(this, radioButton2));
            radioButton3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3346s(this, radioButton3));
            radioButton4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3346s(this, radioButton4));
            radioButton5.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3346s(this, radioButton5));
            radioButton6.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3346s(this, radioButton6));
            if (SharepreferenceDBHandler.m15373f(activity).equals("m3u")) {
                radioButton2.setVisibility(8);
            }
            String m15342F = SharepreferenceDBHandler.m15342F(activity);
            switch (m15342F.hashCode()) {
                case 49:
                    if (m15342F.equals("1")) {
                        z10 = false;
                        break;
                    }
                    z10 = -1;
                    break;
                case 50:
                    if (m15342F.equals("2")) {
                        z10 = true;
                        break;
                    }
                    z10 = -1;
                    break;
                case 51:
                    if (m15342F.equals("3")) {
                        z10 = 2;
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
            } else if (z10 != 2) {
                radioButton.setChecked(true);
            } else {
                radioButton4.setChecked(true);
            }
            button2.setOnClickListener(new ViewOnClickListenerC3331d(this));
            button.setOnClickListener(new ViewOnClickListenerC3332e(this, radioGroup, inflate, activity));
        } catch (NullPointerException | Exception e10) {
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

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ProgressBar progressBar;
        VodAdapterNewFlow vodAdapterNewFlow = this.f19484G;
        if (vodAdapterNewFlow != null && (progressBar = f19477U) != null) {
            vodAdapterNewFlow.m17558r0(progressBar);
        }
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView != null) {
            recyclerView.setClickable(true);
        }
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x011c, code lost:
    
        if (r6 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01bc, code lost:
    
        r6.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x015a, code lost:
    
        if (r6 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01b9, code lost:
    
        if (r6 != null) goto L34;
     */
    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    @android.annotation.SuppressLint({"ApplySharedPref"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r6) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSubCategories.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        if (this.f19485H) {
            this.toolbar.m1224x(2131689495);
        } else {
            this.toolbar.m1224x(2131689497);
            int m15337A = SharepreferenceDBHandler.m15337A(this.f19495d);
            if ((SharepreferenceDBHandler.m15373f(this.f19495d).equals("m3u") ? this.f19507p.m15193T1(m15337A, "movie") : this.f19493P.m15313q0(m15337A)) > 0 && this.f19511t.equals("-4")) {
                menu.getItem(2).getSubMenu().findItem(2131428757).setVisible(true);
            }
            SharedPreferences sharedPreferences = this.f19517z;
            if (sharedPreferences != null) {
                if (sharedPreferences.getInt("vod", 1) == 1) {
                    menu.getItem(2).getSubMenu().findItem(2131428258).setVisible(false);
                    menu.getItem(2).getSubMenu().findItem(2131428254).setVisible(true);
                } else {
                    menu.getItem(2).getSubMenu().findItem(2131428258).setVisible(true);
                    menu.getItem(2).getSubMenu().findItem(2131428254).setVisible(false);
                }
            }
        }
        this.f19492O = menu;
        this.f19491N = menu.getItem(2).getSubMenu().findItem(2131427886);
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
        Menu menu = this.f19492O;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(2131427886, 0);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0447  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onOptionsItemSelected(android.view.MenuItem r7) {
        /*
            Method dump skipped, instructions count: 1228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSubCategories.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        m16951S0();
        super.onResume();
        C5255e.m26233f(this.f19495d);
        getWindow().setFlags(1024, 1024);
        this.f19484G.m17558r0(f19477U);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f19496e = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f19496e.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f19495d != null) {
            m16960b();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        m16951S0();
    }

    /* renamed from: q0 */
    public void m16963q0() {
        ProgressDialog progressDialog = this.f19510s;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        ArrayList<LiveStreamsDBModel> arrayList = this.f19501j;
        if (arrayList == null || this.myRecyclerView == null || arrayList.size() == 0) {
            TextView textView = this.tvNoStream;
            if (textView != null) {
                textView.setVisibility(0);
            }
        } else {
            this.f19494Q = true;
            this.f19481D = new VodAdapter(this.f19501j, this.f19495d, true);
            VodAllCategoriesSingleton.m14909b().m14921m(this.f19501j);
            this.myRecyclerView.setAdapter(this.f19481D);
            C5255e.m26243l0(this.f19495d, getResources().getString(2132018759));
        }
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }
}

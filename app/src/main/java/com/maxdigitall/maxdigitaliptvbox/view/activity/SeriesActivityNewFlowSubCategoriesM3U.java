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
import android.os.Bundle;
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
import butterknife.ButterKnife;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteM3UModel;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamCategoryIdDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.VodAllCategoriesSingleton;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.PasswordStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.RecentWatchDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U;
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
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U.class */
public class SeriesActivityNewFlowSubCategoriesM3U extends ActivityC0243b implements View.OnClickListener {

    /* renamed from: N */
    public static ArrayList<LiveStreamCategoryIdDBModel> f18300N = new ArrayList<>();

    /* renamed from: O */
    public static ArrayList<LiveStreamCategoryIdDBModel> f18301O = new ArrayList<>();

    /* renamed from: P */
    public static ArrayList<LiveStreamCategoryIdDBModel> f18302P = new ArrayList<>();

    /* renamed from: Q */
    public static ProgressBar f18303Q;

    /* renamed from: A */
    public SeriesAdapterM3U f18304A;

    /* renamed from: C */
    public VodAdapterNewFlow f18306C;

    /* renamed from: E */
    public PopupWindow f18308E;

    /* renamed from: F */
    public SharedPreferences f18309F;

    /* renamed from: G */
    public SharedPreferences.Editor f18310G;

    /* renamed from: H */
    public GridLayoutManager f18311H;

    /* renamed from: I */
    public Handler f18312I;

    /* renamed from: J */
    public MenuItem f18313J;

    /* renamed from: K */
    public Menu f18314K;

    /* renamed from: L */
    public RecentWatchDBHandler f18315L;

    @BindView
    public AppBarLayout appbarToolbar;

    /* renamed from: d */
    public Context f18317d;

    /* renamed from: e */
    public SharedPreferences f18318e;

    /* renamed from: g */
    public ArrayList<PasswordStatusDBModel> f18320g;

    /* renamed from: h */
    public ArrayList<LiveStreamsDBModel> f18321h;

    /* renamed from: i */
    public ArrayList<LiveStreamsDBModel> f18322i;

    /* renamed from: j */
    public ArrayList<LiveStreamsDBModel> f18323j;

    /* renamed from: k */
    public ArrayList<FavouriteM3UModel> f18324k;

    @BindView
    public ImageView logo;

    @BindView
    public RecyclerView myRecyclerView;

    /* renamed from: o */
    public LiveStreamDBHandler f18328o;

    @BindView
    public ProgressBar pbLoader;

    /* renamed from: q */
    public SearchView f18330q;

    /* renamed from: r */
    public ProgressDialog f18331r;

    @BindView
    public RelativeLayout rl_sub_cat;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public TextView tvNoStream;

    @BindView
    public TextView tvViewProvider;

    /* renamed from: v */
    public VodSubCatAdpaterNew f18335v;

    @BindView
    public TextView vodCategoryName;

    /* renamed from: w */
    public SharedPreferences f18336w;

    /* renamed from: x */
    public SharedPreferences.Editor f18337x;

    /* renamed from: y */
    public RecyclerView.AbstractC0685p f18338y;

    /* renamed from: z */
    public SharedPreferences f18339z;

    /* renamed from: f */
    public ArrayList<String> f18319f = new ArrayList<>();

    /* renamed from: l */
    public String f18325l = "";

    /* renamed from: m */
    public String f18326m = "";

    /* renamed from: n */
    public DatabaseUpdatedStatusDBModel f18327n = new DatabaseUpdatedStatusDBModel();

    /* renamed from: p */
    public DatabaseUpdatedStatusDBModel f18329p = new DatabaseUpdatedStatusDBModel();

    /* renamed from: s */
    public String f18332s = "";

    /* renamed from: t */
    public String f18333t = "";

    /* renamed from: u */
    public boolean f18334u = false;

    /* renamed from: B */
    public ArrayList<LiveStreamsDBModel> f18305B = new ArrayList<>();

    /* renamed from: D */
    public boolean f18307D = false;

    /* renamed from: M */
    public boolean f18316M = true;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowSubCategoriesM3U$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$a.class */
    public class DialogInterfaceOnClickListenerC3026a implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesActivityNewFlowSubCategoriesM3U f18340b;

        public DialogInterfaceOnClickListenerC3026a(SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U) {
            this.f18340b = seriesActivityNewFlowSubCategoriesM3U;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f18340b.f18317d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowSubCategoriesM3U$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$b.class */
    public class DialogInterfaceOnClickListenerC3027b implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesActivityNewFlowSubCategoriesM3U f18341b;

        public DialogInterfaceOnClickListenerC3027b(SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U) {
            this.f18341b = seriesActivityNewFlowSubCategoriesM3U;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowSubCategoriesM3U$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$c.class */
    public class DialogInterfaceOnClickListenerC3028c implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesActivityNewFlowSubCategoriesM3U f18342b;

        public DialogInterfaceOnClickListenerC3028c(SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U) {
            this.f18342b = seriesActivityNewFlowSubCategoriesM3U;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowSubCategoriesM3U$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$d.class */
    public class DialogInterfaceOnClickListenerC3029d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesActivityNewFlowSubCategoriesM3U f18343b;

        public DialogInterfaceOnClickListenerC3029d(SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U) {
            this.f18343b = seriesActivityNewFlowSubCategoriesM3U;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowSubCategoriesM3U$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$e.class */
    public class ViewOnClickListenerC3030e implements View.OnClickListener {

        /* renamed from: b */
        public final SeriesActivityNewFlowSubCategoriesM3U f18344b;

        public ViewOnClickListenerC3030e(SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U) {
            this.f18344b = seriesActivityNewFlowSubCategoriesM3U;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f18344b.f18308E.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowSubCategoriesM3U$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$f.class */
    public class ViewOnClickListenerC3031f implements View.OnClickListener {

        /* renamed from: b */
        public final SeriesActivityNewFlowSubCategoriesM3U f18345b;

        public ViewOnClickListenerC3031f(SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U) {
            this.f18345b = seriesActivityNewFlowSubCategoriesM3U;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Menu menu = this.f18345b.f18314K;
            if (menu != null) {
                menu.getItem(1).getSubMenu().findItem(2131428757).setVisible(false);
            }
            SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U = this.f18345b;
            seriesActivityNewFlowSubCategoriesM3U.f18315L.m15311p("movie", SharepreferenceDBHandler.m15337A(seriesActivityNewFlowSubCategoriesM3U.f18317d));
            this.f18345b.f18323j.clear();
            this.f18345b.f18304A.m4099w();
            this.f18345b.tvNoRecordFound.setVisibility(0);
            Toast.makeText(this.f18345b.f18317d, this.f18345b.getResources().getString(2132017302), 0).show();
            this.f18345b.f18308E.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowSubCategoriesM3U$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$g.class */
    public class ViewOnClickListenerC3032g implements View.OnClickListener {

        /* renamed from: b */
        public final SeriesActivityNewFlowSubCategoriesM3U f18346b;

        public ViewOnClickListenerC3032g(SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U) {
            this.f18346b = seriesActivityNewFlowSubCategoriesM3U;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f18346b.f18308E.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowSubCategoriesM3U$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$h.class */
    public class ViewOnClickListenerC3033h implements View.OnClickListener {

        /* renamed from: b */
        public final RadioGroup f18347b;

        /* renamed from: c */
        public final View f18348c;

        /* renamed from: d */
        public final Activity f18349d;

        /* renamed from: e */
        public final SeriesActivityNewFlowSubCategoriesM3U f18350e;

        public ViewOnClickListenerC3033h(SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U, RadioGroup radioGroup, View view, Activity activity) {
            this.f18350e = seriesActivityNewFlowSubCategoriesM3U;
            this.f18347b = radioGroup;
            this.f18348c = view;
            this.f18349d = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Activity activity;
            String str;
            RadioButton radioButton = (RadioButton) this.f18348c.findViewById(this.f18347b.getCheckedRadioButtonId());
            if (radioButton.getText().toString().equals(this.f18350e.getResources().getString(2132018611))) {
                activity = this.f18349d;
                str = "1";
            } else if (radioButton.getText().toString().equals(this.f18350e.getResources().getString(2132018607))) {
                activity = this.f18349d;
                str = "2";
            } else if (radioButton.getText().toString().equals(this.f18350e.getResources().getString(2132018615))) {
                activity = this.f18349d;
                str = "3";
            } else {
                activity = this.f18349d;
                str = "0";
            }
            SharepreferenceDBHandler.m15368c0(str, activity);
            SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U = this.f18350e;
            seriesActivityNewFlowSubCategoriesM3U.f18336w = seriesActivityNewFlowSubCategoriesM3U.getSharedPreferences("listgridview", 0);
            int i10 = this.f18350e.f18336w.getInt("series", 0);
            C5251a.f30072w = i10;
            if (i10 == 1) {
                this.f18350e.m16478T0();
            } else {
                this.f18350e.m16477S0();
            }
            this.f18350e.f18308E.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowSubCategoriesM3U$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$i.class */
    public class ViewOnClickListenerC3034i implements View.OnClickListener {

        /* renamed from: b */
        public final SeriesActivityNewFlowSubCategoriesM3U f18351b;

        public ViewOnClickListenerC3034i(SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U) {
            this.f18351b = seriesActivityNewFlowSubCategoriesM3U;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f18351b.f18308E.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowSubCategoriesM3U$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$j.class */
    public class ViewOnClickListenerC3035j implements View.OnClickListener {

        /* renamed from: b */
        public final RecentWatchDBHandler f18352b;

        /* renamed from: c */
        public final int f18353c;

        /* renamed from: d */
        public final Context f18354d;

        /* renamed from: e */
        public final SeriesActivityNewFlowSubCategoriesM3U f18355e;

        public ViewOnClickListenerC3035j(SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U, RecentWatchDBHandler recentWatchDBHandler, int i10, Context context) {
            this.f18355e = seriesActivityNewFlowSubCategoriesM3U;
            this.f18352b = recentWatchDBHandler;
            this.f18353c = i10;
            this.f18354d = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RecentWatchDBHandler recentWatchDBHandler = this.f18352b;
            if (recentWatchDBHandler != null) {
                recentWatchDBHandler.m15315v(this.f18353c, "movie");
            }
            Toast.makeText(this.f18354d, this.f18355e.getResources().getString(2132018079), 0).show();
            if (this.f18355e.f18304A != null) {
                this.f18355e.f18320g = new ArrayList();
                this.f18355e.f18321h = new ArrayList();
                this.f18355e.f18322i = new ArrayList();
                ArrayList<LiveStreamsDBModel> m15317w = this.f18352b.m15317w("movie", SharepreferenceDBHandler.m15337A(this.f18354d), "getalldata");
                if (this.f18355e.f18328o.m15189R1(SharepreferenceDBHandler.m15337A(this.f18354d)) <= 0 || m15317w == null) {
                    this.f18355e.f18323j.clear();
                    if (m15317w.isEmpty()) {
                        this.f18355e.tvNoRecordFound.setVisibility(0);
                        this.f18355e.f18304A.m4099w();
                    } else {
                        for (int i10 = 0; i10 < m15317w.size(); i10++) {
                            this.f18355e.f18323j.add(m15317w.get(i10));
                            this.f18355e.f18304A.m4099w();
                        }
                    }
                } else {
                    SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U = this.f18355e;
                    seriesActivityNewFlowSubCategoriesM3U.f18319f = seriesActivityNewFlowSubCategoriesM3U.m16474P0();
                    if (this.f18355e.f18319f != null) {
                        SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U2 = this.f18355e;
                        seriesActivityNewFlowSubCategoriesM3U2.f18322i = seriesActivityNewFlowSubCategoriesM3U2.m16475Q0(m15317w, seriesActivityNewFlowSubCategoriesM3U2.f18319f);
                    }
                    this.f18355e.f18323j.clear();
                    if (this.f18355e.f18322i != null) {
                        for (int i11 = 0; i11 < this.f18355e.f18322i.size(); i11++) {
                            this.f18355e.f18323j.add((LiveStreamsDBModel) this.f18355e.f18322i.get(i11));
                            this.f18355e.f18304A.m4099w();
                        }
                    }
                }
                this.f18355e.f18308E.dismiss();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowSubCategoriesM3U$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$k.class */
    public class RunnableC3036k implements Runnable {

        /* renamed from: b */
        public final SeriesActivityNewFlowSubCategoriesM3U f18356b;

        public RunnableC3036k(SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U) {
            this.f18356b = seriesActivityNewFlowSubCategoriesM3U;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18356b.m16480W0();
            ProgressBar progressBar = this.f18356b.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$l.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowSubCategoriesM3U$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$l.class */
    public class RunnableC3037l implements Runnable {

        /* renamed from: b */
        public final SeriesActivityNewFlowSubCategoriesM3U f18357b;

        public RunnableC3037l(SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U) {
            this.f18357b = seriesActivityNewFlowSubCategoriesM3U;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18357b.m16480W0();
            ProgressBar progressBar = this.f18357b.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$m.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowSubCategoriesM3U$m */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$m.class */
    public class RunnableC3038m implements Runnable {

        /* renamed from: b */
        public final SeriesActivityNewFlowSubCategoriesM3U f18358b;

        public RunnableC3038m(SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U) {
            this.f18358b = seriesActivityNewFlowSubCategoriesM3U;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18358b.m16480W0();
            ProgressBar progressBar = this.f18358b.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$n.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowSubCategoriesM3U$n */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$n.class */
    public class RunnableC3039n implements Runnable {

        /* renamed from: b */
        public final SeriesActivityNewFlowSubCategoriesM3U f18359b;

        public RunnableC3039n(SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U) {
            this.f18359b = seriesActivityNewFlowSubCategoriesM3U;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18359b.m16481X0(SeriesActivityNewFlowSubCategoriesM3U.f18301O);
            ProgressBar progressBar = this.f18359b.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$o.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowSubCategoriesM3U$o */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$o.class */
    public class ViewOnClickListenerC3040o implements View.OnClickListener {

        /* renamed from: b */
        public final SeriesActivityNewFlowSubCategoriesM3U f18360b;

        public ViewOnClickListenerC3040o(SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U) {
            this.f18360b = seriesActivityNewFlowSubCategoriesM3U;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f18360b.f18317d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$p.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowSubCategoriesM3U$p */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$p.class */
    public class DialogInterfaceOnClickListenerC3041p implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesActivityNewFlowSubCategoriesM3U f18361b;

        public DialogInterfaceOnClickListenerC3041p(SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U) {
            this.f18361b = seriesActivityNewFlowSubCategoriesM3U;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$q.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowSubCategoriesM3U$q */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$q.class */
    public class DialogInterfaceOnClickListenerC3042q implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SeriesActivityNewFlowSubCategoriesM3U f18362b;

        public DialogInterfaceOnClickListenerC3042q(SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U) {
            this.f18362b = seriesActivityNewFlowSubCategoriesM3U;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f18362b.f18317d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$r.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowSubCategoriesM3U$r */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$r.class */
    public class C3043r implements SearchView.InterfaceC0282l {

        /* renamed from: a */
        public final SeriesActivityNewFlowSubCategoriesM3U f18363a;

        public C3043r(SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U) {
            this.f18363a = seriesActivityNewFlowSubCategoriesM3U;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            this.f18363a.tvNoRecordFound.setVisibility(8);
            if (this.f18363a.f18335v == null || (textView = this.f18363a.tvNoStream) == null || textView.getVisibility() == 0) {
                return false;
            }
            this.f18363a.f18335v.m17614o0(str, this.f18363a.tvNoRecordFound);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$s.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowSubCategoriesM3U$s */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$s.class */
    public class C3044s implements SearchView.InterfaceC0282l {

        /* renamed from: a */
        public final SeriesActivityNewFlowSubCategoriesM3U f18364a;

        public C3044s(SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U) {
            this.f18364a = seriesActivityNewFlowSubCategoriesM3U;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            this.f18364a.tvNoRecordFound.setVisibility(8);
            if (this.f18364a.f18304A == null || (textView = this.f18364a.tvNoStream) == null || textView.getVisibility() == 0) {
                return false;
            }
            this.f18364a.f18304A.m17396r0(str, this.f18364a.tvNoRecordFound);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0282l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$t.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowSubCategoriesM3U$t */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SeriesActivityNewFlowSubCategoriesM3U$t.class */
    public class ViewOnFocusChangeListenerC3045t implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f18365b;

        /* renamed from: c */
        public final SeriesActivityNewFlowSubCategoriesM3U f18366c;

        public ViewOnFocusChangeListenerC3045t(SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U, View view) {
            this.f18366c = seriesActivityNewFlowSubCategoriesM3U;
            this.f18365b = view;
        }

        /* renamed from: a */
        public final void m16487a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18365b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m16488b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18365b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m16489c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18365b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            if (z10) {
                m16488b(1.15f);
                m16489c(1.15f);
            } else {
                if (z10) {
                    return;
                }
                m16488b(1.0f);
                m16489c(1.0f);
                m16487a(z10);
            }
        }
    }

    /* renamed from: M0 */
    public final void m16471M0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: N0 */
    public void m16472N0(int i10, String str, Context context, RecentWatchDBHandler recentWatchDBHandler) {
        try {
            View inflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(2131624152, (RelativeLayout) findViewById(2131429033));
            PopupWindow popupWindow = new PopupWindow(this);
            this.f18308E = popupWindow;
            popupWindow.setContentView(inflate);
            this.f18308E.setWidth(-1);
            this.f18308E.setHeight(-1);
            this.f18308E.setFocusable(true);
            this.f18308E.showAtLocation(inflate, 17, 0, 0);
            ((TextView) inflate.findViewById(2131429411)).setText(getResources().getString(2132017562));
            Button button = (Button) inflate.findViewById(2131427628);
            Button button2 = (Button) inflate.findViewById(2131427605);
            if (button != null) {
                button.setOnFocusChangeListener(new C5255e.i(button, this));
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new C5255e.i(button2, this));
            }
            button2.setOnClickListener(new ViewOnClickListenerC3034i(this));
            if (button != null) {
                button.setOnClickListener(new ViewOnClickListenerC3035j(this, recentWatchDBHandler, i10, context));
            }
        } catch (NullPointerException | Exception e10) {
        }
    }

    /* renamed from: O0 */
    public void m16473O0() {
        ArrayList<LiveStreamsDBModel> arrayList;
        ArrayList<LiveStreamsDBModel> arrayList2;
        new ArrayList();
        this.f18305B.clear();
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.f18304A);
        }
        if (this.f18317d != null) {
            ArrayList<FavouriteM3UModel> m15175K1 = this.f18328o.m15175K1("series");
            if (this.f18319f != null) {
                this.f18319f = m16474P0();
            }
            ArrayList<String> arrayList3 = this.f18319f;
            ArrayList<FavouriteM3UModel> arrayList4 = m15175K1;
            if (arrayList3 != null) {
                arrayList4 = m15175K1;
                if (arrayList3.size() > 0) {
                    arrayList4 = m15175K1;
                    if (m15175K1 != null) {
                        arrayList4 = m15175K1;
                        if (m15175K1.size() > 0) {
                            arrayList4 = m16476R0(m15175K1, this.f18319f);
                        }
                    }
                }
            }
            Iterator<FavouriteM3UModel> it = arrayList4.iterator();
            while (it.hasNext()) {
                FavouriteM3UModel next = it.next();
                ArrayList<LiveStreamsDBModel> m15183O1 = this.f18328o.m15183O1(next.m14775a(), next.m14777c());
                if (m15183O1 != null && m15183O1.size() > 0) {
                    this.f18305B.add(m15183O1.get(0));
                }
            }
            m16486b();
            if (this.myRecyclerView != null && (arrayList2 = this.f18305B) != null && arrayList2.size() != 0) {
                this.f18304A = new SeriesAdapterM3U(this.f18305B, this.f18317d, true, this.f18333t);
                VodAllCategoriesSingleton.m14909b().m14921m(this.f18305B);
                this.myRecyclerView.setAdapter(this.f18304A);
                C5255e.m26243l0(this.f18317d, getResources().getString(2132018759));
                this.tvNoStream.setVisibility(4);
            }
            if (this.tvNoStream == null || (arrayList = this.f18305B) == null || arrayList.size() != 0) {
                return;
            }
            RecyclerView recyclerView2 = this.myRecyclerView;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(this.f18304A);
            }
            ProgressBar progressBar = this.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            this.tvNoStream.setText(getResources().getString(2132018202));
            this.tvNoStream.setVisibility(0);
        }
    }

    /* renamed from: P0 */
    public final ArrayList<String> m16474P0() {
        ArrayList<PasswordStatusDBModel> m15232m1 = this.f18328o.m15232m1(SharepreferenceDBHandler.m15337A(this.f18317d));
        this.f18320g = m15232m1;
        if (m15232m1 != null) {
            Iterator<PasswordStatusDBModel> it = m15232m1.iterator();
            while (it.hasNext()) {
                PasswordStatusDBModel next = it.next();
                if (next.m15290a().equals("1")) {
                    this.f18319f.add(next.m15291b());
                }
            }
        }
        return this.f18319f;
    }

    /* renamed from: Q0 */
    public final ArrayList<LiveStreamsDBModel> m16475Q0(ArrayList<LiveStreamsDBModel> arrayList, ArrayList<String> arrayList2) {
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
                this.f18321h.add(next);
                next.m14827g();
            }
        }
        return this.f18321h;
    }

    /* renamed from: R0 */
    public final ArrayList<FavouriteM3UModel> m16476R0(ArrayList<FavouriteM3UModel> arrayList, ArrayList<String> arrayList2) {
        boolean z10;
        this.f18324k = new ArrayList<>();
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
                    this.f18324k.add(next);
                }
            }
        }
        return this.f18324k;
    }

    /* renamed from: S0 */
    public final void m16477S0() {
        this.f18317d = this;
        this.f18328o = new LiveStreamDBHandler(this.f18317d);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f18317d == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f18317d, C5255e.m26257x(this.f18317d) + 1);
        this.f18338y = gridLayoutManager;
        this.myRecyclerView.setLayoutManager(gridLayoutManager);
        this.myRecyclerView.setItemAnimator(new C0704c());
        this.f18339z = this.f18317d.getSharedPreferences("loginPrefs", 0);
        m16482Y0();
    }

    /* renamed from: T0 */
    public final void m16478T0() {
        this.f18317d = this;
        this.f18328o = new LiveStreamDBHandler(this.f18317d);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f18317d == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f18317d);
        this.f18338y = linearLayoutManager;
        this.myRecyclerView.setLayoutManager(linearLayoutManager);
        this.myRecyclerView.setItemAnimator(new C0704c());
        this.f18339z = this.f18317d.getSharedPreferences("loginPrefs", 0);
        m16482Y0();
    }

    /* renamed from: V0 */
    public final void m16479V0(ArrayList<LiveStreamCategoryIdDBModel> arrayList) {
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f18317d == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        this.f18311H = new C6783a(this.f18317d).m31288z().equals(C5251a.f30065s0) ? new GridLayoutManager(this, 2) : new GridLayoutManager(this, 2);
        this.myRecyclerView.setLayoutManager(this.f18311H);
        this.myRecyclerView.setHasFixedSize(true);
        m16486b();
        VodSubCatAdpaterNew vodSubCatAdpaterNew = new VodSubCatAdpaterNew(arrayList, this.f18317d, this.f18328o);
        this.f18335v = vodSubCatAdpaterNew;
        this.myRecyclerView.setAdapter(vodSubCatAdpaterNew);
    }

    /* renamed from: W0 */
    public final void m16480W0() {
        SharedPreferences sharedPreferences = getSharedPreferences("listgridview", 0);
        this.f18336w = sharedPreferences;
        this.f18337x = sharedPreferences.edit();
        int i10 = this.f18336w.getInt("series", 0);
        C5251a.f30072w = i10;
        if (i10 == 1) {
            m16478T0();
        } else {
            m16477S0();
        }
    }

    /* renamed from: X0 */
    public final void m16481X0(ArrayList<LiveStreamCategoryIdDBModel> arrayList) {
        m16479V0(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0147, code lost:
    
        if (r9 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x024a, code lost:
    
        if (r9 != null) goto L35;
     */
    /* renamed from: Y0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m16482Y0() {
        /*
            Method dump skipped, instructions count: 753
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowSubCategoriesM3U.m16482Y0():void");
    }

    /* renamed from: Z0 */
    public final void m16483Z0() {
        View inflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(2131624152, (RelativeLayout) findViewById(2131429033));
        PopupWindow popupWindow = new PopupWindow(this);
        this.f18308E = popupWindow;
        popupWindow.setContentView(inflate);
        this.f18308E.setWidth(-1);
        this.f18308E.setHeight(-1);
        this.f18308E.setFocusable(true);
        this.f18308E.showAtLocation(inflate, 17, 0, 0);
        ((TextView) inflate.findViewById(2131429411)).setText(getResources().getString(2132017561));
        Button button = (Button) inflate.findViewById(2131427628);
        Button button2 = (Button) inflate.findViewById(2131427605);
        if (button != null) {
            button.setOnFocusChangeListener(new C5255e.i(button, this));
        }
        if (button2 != null) {
            button2.setOnFocusChangeListener(new C5255e.i(button2, this));
        }
        button2.setOnClickListener(new ViewOnClickListenerC3030e(this));
        if (button != null) {
            button.setOnClickListener(new ViewOnClickListenerC3031f(this));
        }
    }

    /* renamed from: a */
    public void m16484a() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a1 */
    public final void m16485a1(Activity activity) {
        try {
            View inflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(2131624516, (RelativeLayout) activity.findViewById(2131429032));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.f18308E = popupWindow;
            popupWindow.setContentView(inflate);
            boolean z10 = -1;
            this.f18308E.setWidth(-1);
            this.f18308E.setHeight(-1);
            this.f18308E.setFocusable(true);
            this.f18308E.showAtLocation(inflate, 17, 0, 0);
            Button button = (Button) inflate.findViewById(2131427623);
            Button button2 = (Button) inflate.findViewById(2131427605);
            RadioGroup radioGroup = (RadioGroup) inflate.findViewById(2131428935);
            RadioButton radioButton = (RadioButton) inflate.findViewById(2131428909);
            RadioButton radioButton2 = (RadioButton) inflate.findViewById(2131428903);
            radioButton2.setVisibility(8);
            RadioButton radioButton3 = (RadioButton) inflate.findViewById(2131428898);
            radioButton3.setVisibility(8);
            RadioButton radioButton4 = (RadioButton) inflate.findViewById(2131428899);
            radioButton4.setVisibility(8);
            RadioButton radioButton5 = (RadioButton) inflate.findViewById(2131428897);
            RadioButton radioButton6 = (RadioButton) inflate.findViewById(2131428916);
            radioButton.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3045t(this, radioButton));
            radioButton2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3045t(this, radioButton2));
            radioButton5.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3045t(this, radioButton5));
            radioButton6.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3045t(this, radioButton6));
            radioButton3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3045t(this, radioButton3));
            radioButton4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3045t(this, radioButton4));
            String m15400w = SharepreferenceDBHandler.m15400w(activity);
            switch (m15400w.hashCode()) {
                case 49:
                    if (m15400w.equals("1")) {
                        z10 = false;
                        break;
                    }
                    break;
                case 50:
                    if (m15400w.equals("2")) {
                        z10 = true;
                        break;
                    }
                    break;
                case 51:
                    if (m15400w.equals("3")) {
                        z10 = 2;
                        break;
                    }
                    break;
            }
            if (!z10) {
                radioButton2.setChecked(true);
            } else if (z10) {
                radioButton5.setChecked(true);
            } else if (z10 != 2) {
                radioButton.setChecked(true);
            } else {
                radioButton6.setChecked(true);
            }
            button2.setOnClickListener(new ViewOnClickListenerC3032g(this));
            button.setOnClickListener(new ViewOnClickListenerC3033h(this, radioGroup, inflate, activity));
        } catch (NullPointerException | Exception e10) {
        }
    }

    /* renamed from: b */
    public void m16486b() {
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
        VodAdapterNewFlow vodAdapterNewFlow = this.f18306C;
        if (vodAdapterNewFlow != null && (progressBar = f18303Q) != null) {
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

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    @SuppressLint({"ApplySharedPref"})
    public void onCreate(Bundle bundle) {
        Handler handler;
        Runnable runnableC3037l;
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("sort", 0);
        this.f18309F = sharedPreferences;
        this.f18310G = sharedPreferences.edit();
        if (this.f18309F.getString("sort", "").equals("")) {
            this.f18310G.putString("sort", "0");
            this.f18310G.commit();
        }
        Intent intent = getIntent();
        if (intent != null) {
            this.f18332s = intent.getStringExtra("category_id");
            this.f18333t = intent.getStringExtra("category_name");
        }
        this.f18317d = this;
        this.f18306C = new VodAdapterNewFlow();
        this.f18328o = new LiveStreamDBHandler(this.f18317d);
        this.f18312I = new Handler();
        this.f18315L = new RecentWatchDBHandler(this.f18317d);
        String str = this.f18332s;
        str.hashCode();
        if (str.equals("0")) {
            setContentView(2131624098);
            ButterKnife.m5626a(this);
            m16484a();
            this.f18312I.removeCallbacksAndMessages(null);
            ProgressBar progressBar = this.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
            handler = this.f18312I;
            runnableC3037l = new RunnableC3037l(this);
        } else if (str.equals("-1")) {
            setContentView(2131624098);
            ButterKnife.m5626a(this);
            this.f18312I.removeCallbacksAndMessages(null);
            ProgressBar progressBar2 = this.pbLoader;
            if (progressBar2 != null) {
                progressBar2.setVisibility(0);
            }
            handler = this.f18312I;
            runnableC3037l = new RunnableC3036k(this);
        } else {
            ArrayList<LiveStreamCategoryIdDBModel> m15223i1 = this.f18328o.m15223i1(this.f18332s);
            f18301O = m15223i1;
            if (m15223i1 == null || m15223i1.size() != 0) {
                setContentView(2131624100);
                ButterKnife.m5626a(this);
                m16484a();
                this.f18307D = true;
                this.f18312I.removeCallbacksAndMessages(null);
                ProgressBar progressBar3 = this.pbLoader;
                if (progressBar3 != null) {
                    progressBar3.setVisibility(0);
                }
                handler = this.f18312I;
                runnableC3037l = new RunnableC3039n(this);
            } else {
                setContentView(2131624098);
                ButterKnife.m5626a(this);
                m16484a();
                this.f18312I.removeCallbacksAndMessages(null);
                ProgressBar progressBar4 = this.pbLoader;
                if (progressBar4 != null) {
                    progressBar4.setVisibility(0);
                }
                handler = this.f18312I;
                runnableC3037l = new RunnableC3038m(this);
            }
        }
        handler.postDelayed(runnableC3037l, 1000L);
        overridePendingTransition(2130772003, 2130772000);
        AppBarLayout appBarLayout = this.appbarToolbar;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(2131230844));
        }
        m16471M0();
        m878n0((Toolbar) findViewById(2131429320));
        this.f18317d = this;
        if (!this.f18333t.isEmpty()) {
            this.vodCategoryName.setText(this.f18333t);
        }
        this.vodCategoryName.setSelected(true);
        this.logo.setOnClickListener(new ViewOnClickListenerC3040o(this));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        if (this.f18307D) {
            this.toolbar.m1224x(2131689495);
        } else {
            this.toolbar.m1224x(2131689497);
            if (this.f18315L.m15313q0(SharepreferenceDBHandler.m15337A(this.f18317d)) > 0 && this.f18332s.equals("-4")) {
                menu.getItem(2).getSubMenu().findItem(2131428757).setVisible(true);
            }
        }
        this.f18314K = menu;
        this.f18313J = menu.getItem(2).getSubMenu().findItem(2131427886);
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
        Menu menu = this.f18314K;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(2131427886, 0);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x02ab, code lost:
    
        if (r0.size() > 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0342, code lost:
    
        if (r0.size() > 0) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0358  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onOptionsItemSelected(android.view.MenuItem r7) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowSubCategoriesM3U.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        C5255e.m26233f(this.f18317d);
        getWindow().setFlags(1024, 1024);
        this.f18306C.m17558r0(f18303Q);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f18318e = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f18318e.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f18317d != null) {
            m16486b();
        }
    }
}

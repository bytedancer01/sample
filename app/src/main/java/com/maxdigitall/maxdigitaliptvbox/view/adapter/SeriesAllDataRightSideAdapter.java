package com.maxdigitall.maxdigitaliptvbox.view.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0304c1;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.maxdigitall.maxdigitaliptvbox.miscelleneious.chromecastfeature.ExpandedControlsActivity;
import com.maxdigitall.maxdigitaliptvbox.model.EpisodesUsingSinglton;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteM3UModel;
import com.maxdigitall.maxdigitaliptvbox.model.SeriesAllCategoriesSingleton;
import com.maxdigitall.maxdigitaliptvbox.model.callback.GetEpisdoeDetailsCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.SeasonsDetailCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.SeriesDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.ExternalPlayerDataBase;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.ExternalPlayerModelClass;
import com.maxdigitall.maxdigitaliptvbox.view.activity.PlayExternalPlayerActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesAllDataSingleActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nf.C6783a;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import org.simpleframework.xml.strategy.Name;
import p082ef.C4718a;
import p151if.C5251a;
import p151if.C5255e;
import p170jf.C5375g;
import p188kd.AbstractC5557j;
import p189kf.C5602m;
import p216m9.C5938b;
import p216m9.C5947e;
import p316s2.C8522c;
import p324sf.InterfaceC8572k;
import p428yg.C10014t;
import p428yg.InterfaceC9996e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter.class */
public class SeriesAllDataRightSideAdapter extends RecyclerView.AbstractC0677h<RecyclerView.AbstractC0674e0> implements Filterable, InterfaceC8572k {

    /* renamed from: H */
    public ProgressDialog f20568H;

    /* renamed from: I */
    public C5602m f20569I;

    /* renamed from: M */
    public LiveStreamDBHandler f20573M;

    /* renamed from: N */
    public View f20574N;

    /* renamed from: i */
    public Context f20579i;

    /* renamed from: k */
    public DatabaseHandler f20581k;

    /* renamed from: l */
    public Animation f20582l;

    /* renamed from: m */
    public String f20583m;

    /* renamed from: p */
    public C5947e f20586p;

    /* renamed from: q */
    public String f20587q;

    /* renamed from: r */
    public SharedPreferences f20588r;

    /* renamed from: s */
    public C5375g f20589s;

    /* renamed from: j */
    public Boolean f20580j = Boolean.FALSE;

    /* renamed from: n */
    public C3507x f20584n = new C3507x(this, null);

    /* renamed from: o */
    public C3508y f20585o = new C3508y(this, null);

    /* renamed from: t */
    public ArrayList<GetEpisdoeDetailsCallback> f20590t = new ArrayList<>();

    /* renamed from: u */
    public ArrayList<SeasonsDetailCallback> f20591u = new ArrayList<>();

    /* renamed from: v */
    public String f20592v = "";

    /* renamed from: w */
    public String f20593w = "";

    /* renamed from: x */
    public String f20594x = "";

    /* renamed from: y */
    public String f20595y = "";

    /* renamed from: z */
    public String f20596z = "";

    /* renamed from: A */
    public String f20561A = "";

    /* renamed from: B */
    public String f20562B = "";

    /* renamed from: C */
    public String f20563C = "";

    /* renamed from: D */
    public String f20564D = "0";

    /* renamed from: E */
    public int f20565E = 0;

    /* renamed from: F */
    public String f20566F = "";

    /* renamed from: G */
    public String f20567G = "0";

    /* renamed from: J */
    public boolean f20570J = false;

    /* renamed from: K */
    public int f20571K = -1;

    /* renamed from: L */
    public ArrayList<GetEpisdoeDetailsCallback> f20572L = new ArrayList<>();

    /* renamed from: e */
    public final ArrayList<SeriesDBModel> f20575e = SeriesAllCategoriesSingleton.m14899b().m14902d();

    /* renamed from: f */
    public ArrayList<SeriesDBModel> f20576f = SeriesAllCategoriesSingleton.m14899b().m14902d();

    /* renamed from: g */
    public final List<GetEpisdoeDetailsCallback> f20577g = SeriesAllCategoriesSingleton.m14899b().m14900a();

    /* renamed from: h */
    public List<GetEpisdoeDetailsCallback> f20578h = SeriesAllCategoriesSingleton.m14899b().m14900a();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$ContinueWatchingViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$ContinueWatchingViewHolder.class */
    public static class ContinueWatchingViewHolder extends RecyclerView.AbstractC0674e0 {

        @BindView
        public RelativeLayout Movie;

        @BindView
        public ImageView MovieImage;

        @BindView
        public TextView SeriesAndEpisode;

        @BindView
        public TextView SeriesName;

        @BindView
        public CardView cardView;

        @BindView
        public CardView cv_rating;

        @BindView
        public ImageView ivFavourite;

        @BindView
        public LinearLayout ll_pb_recent_watch;

        @BindView
        public ProgressBar pb_recent_watch;

        @BindView
        public TextView tv_rating;

        public ContinueWatchingViewHolder(View view) {
            super(view);
            ButterKnife.m5627b(this, view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$ContinueWatchingViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$ContinueWatchingViewHolder_ViewBinding.class */
    public class ContinueWatchingViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public ContinueWatchingViewHolder f20597b;

        public ContinueWatchingViewHolder_ViewBinding(ContinueWatchingViewHolder continueWatchingViewHolder, View view) {
            this.f20597b = continueWatchingViewHolder;
            continueWatchingViewHolder.SeriesName = (TextView) C8522c.m36739c(view, 2131429602, "field 'SeriesName'", TextView.class);
            continueWatchingViewHolder.SeriesAndEpisode = (TextView) C8522c.m36739c(view, 2131429593, "field 'SeriesAndEpisode'", TextView.class);
            continueWatchingViewHolder.Movie = (RelativeLayout) C8522c.m36739c(view, 2131429012, "field 'Movie'", RelativeLayout.class);
            continueWatchingViewHolder.MovieImage = (ImageView) C8522c.m36739c(view, 2131428200, "field 'MovieImage'", ImageView.class);
            continueWatchingViewHolder.cardView = (CardView) C8522c.m36739c(view, 2131427703, "field 'cardView'", CardView.class);
            continueWatchingViewHolder.ivFavourite = (ImageView) C8522c.m36739c(view, 2131428179, "field 'ivFavourite'", ImageView.class);
            continueWatchingViewHolder.ll_pb_recent_watch = (LinearLayout) C8522c.m36739c(view, 2131428464, "field 'll_pb_recent_watch'", LinearLayout.class);
            continueWatchingViewHolder.pb_recent_watch = (ProgressBar) C8522c.m36739c(view, 2131428841, "field 'pb_recent_watch'", ProgressBar.class);
            continueWatchingViewHolder.cv_rating = (CardView) C8522c.m36739c(view, 2131427812, "field 'cv_rating'", CardView.class);
            continueWatchingViewHolder.tv_rating = (TextView) C8522c.m36739c(view, 2131429580, "field 'tv_rating'", TextView.class);
        }

        @Override // butterknife.Unbinder
        /* renamed from: a */
        public void mo5629a() {
            ContinueWatchingViewHolder continueWatchingViewHolder = this.f20597b;
            if (continueWatchingViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f20597b = null;
            continueWatchingViewHolder.SeriesName = null;
            continueWatchingViewHolder.SeriesAndEpisode = null;
            continueWatchingViewHolder.Movie = null;
            continueWatchingViewHolder.MovieImage = null;
            continueWatchingViewHolder.cardView = null;
            continueWatchingViewHolder.ivFavourite = null;
            continueWatchingViewHolder.ll_pb_recent_watch = null;
            continueWatchingViewHolder.pb_recent_watch = null;
            continueWatchingViewHolder.cv_rating = null;
            continueWatchingViewHolder.tv_rating = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$ViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$ViewHolder.class */
    public static class ViewHolder extends RecyclerView.AbstractC0674e0 {

        @BindView
        public RelativeLayout Movie;

        @BindView
        public ImageView MovieImage;

        @BindView
        public TextView SeriesName;

        @BindView
        public CardView cardView;

        @BindView
        public CardView cv_rating;

        @BindView
        public ImageView ivFavourite;

        @BindView
        public LinearLayout llMenu;

        @BindView
        public TextView tvStreamOptions;

        @BindView
        public TextView tv_rating;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.m5627b(this, view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$ViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$ViewHolder_ViewBinding.class */
    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public ViewHolder f20598b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f20598b = viewHolder;
            viewHolder.SeriesName = (TextView) C8522c.m36739c(view, 2131429602, "field 'SeriesName'", TextView.class);
            viewHolder.Movie = (RelativeLayout) C8522c.m36739c(view, 2131429012, "field 'Movie'", RelativeLayout.class);
            viewHolder.MovieImage = (ImageView) C8522c.m36739c(view, 2131428200, "field 'MovieImage'", ImageView.class);
            viewHolder.cardView = (CardView) C8522c.m36739c(view, 2131427703, "field 'cardView'", CardView.class);
            viewHolder.tvStreamOptions = (TextView) C8522c.m36739c(view, 2131429619, "field 'tvStreamOptions'", TextView.class);
            viewHolder.ivFavourite = (ImageView) C8522c.m36739c(view, 2131428179, "field 'ivFavourite'", ImageView.class);
            viewHolder.llMenu = (LinearLayout) C8522c.m36739c(view, 2131428441, "field 'llMenu'", LinearLayout.class);
            viewHolder.cv_rating = (CardView) C8522c.m36739c(view, 2131427812, "field 'cv_rating'", CardView.class);
            viewHolder.tv_rating = (TextView) C8522c.m36739c(view, 2131429580, "field 'tv_rating'", TextView.class);
        }

        @Override // butterknife.Unbinder
        /* renamed from: a */
        public void mo5629a() {
            ViewHolder viewHolder = this.f20598b;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f20598b = null;
            viewHolder.SeriesName = null;
            viewHolder.Movie = null;
            viewHolder.MovieImage = null;
            viewHolder.cardView = null;
            viewHolder.tvStreamOptions = null;
            viewHolder.ivFavourite = null;
            viewHolder.llMenu = null;
            viewHolder.cv_rating = null;
            viewHolder.tv_rating = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$a.class */
    public class C3484a implements InterfaceC9996e {

        /* renamed from: a */
        public final ContinueWatchingViewHolder f20599a;

        /* renamed from: b */
        public final SeriesAllDataRightSideAdapter f20600b;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$a$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter$a$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$a$a.class */
        public class a implements InterfaceC9996e {

            /* renamed from: a */
            public final C3484a f20601a;

            public a(C3484a c3484a) {
                this.f20601a = c3484a;
            }

            @Override // p428yg.InterfaceC9996e
            /* renamed from: a */
            public void mo15848a() {
            }

            @Override // p428yg.InterfaceC9996e
            public void onSuccess() {
            }
        }

        public C3484a(SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter, ContinueWatchingViewHolder continueWatchingViewHolder) {
            this.f20600b = seriesAllDataRightSideAdapter;
            this.f20599a = continueWatchingViewHolder;
        }

        @Override // p428yg.InterfaceC9996e
        /* renamed from: a */
        public void mo15848a() {
            C10014t.m42105q(this.f20600b.f20579i).m42116l(String.valueOf(this.f20600b.f20579i.getResources().getDrawable(2131231769))).m42149e().m42145a().m42152h(this.f20599a.MovieImage, new a(this));
            this.f20599a.SeriesName.setVisibility(0);
        }

        @Override // p428yg.InterfaceC9996e
        public void onSuccess() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$b.class */
    public class C3485b implements InterfaceC9996e {

        /* renamed from: a */
        public final ViewHolder f20602a;

        /* renamed from: b */
        public final SeriesAllDataRightSideAdapter f20603b;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$b$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter$b$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$b$a.class */
        public class a implements InterfaceC9996e {

            /* renamed from: a */
            public final C3485b f20604a;

            public a(C3485b c3485b) {
                this.f20604a = c3485b;
            }

            @Override // p428yg.InterfaceC9996e
            /* renamed from: a */
            public void mo15848a() {
            }

            @Override // p428yg.InterfaceC9996e
            public void onSuccess() {
            }
        }

        public C3485b(SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter, ViewHolder viewHolder) {
            this.f20603b = seriesAllDataRightSideAdapter;
            this.f20602a = viewHolder;
        }

        @Override // p428yg.InterfaceC9996e
        /* renamed from: a */
        public void mo15848a() {
            C10014t.m42105q(this.f20603b.f20579i).m42116l(String.valueOf(this.f20603b.f20579i.getResources().getDrawable(2131231769))).m42149e().m42145a().m42152h(this.f20602a.MovieImage, new a(this));
            this.f20602a.SeriesName.setVisibility(0);
        }

        @Override // p428yg.InterfaceC9996e
        public void onSuccess() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$c.class */
    public class C3486c implements InterfaceC9996e {

        /* renamed from: a */
        public final SeriesAllDataRightSideAdapter f20605a;

        public C3486c(SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter) {
            this.f20605a = seriesAllDataRightSideAdapter;
        }

        @Override // p428yg.InterfaceC9996e
        /* renamed from: a */
        public void mo15848a() {
        }

        @Override // p428yg.InterfaceC9996e
        public void onSuccess() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$d.class */
    public class C3487d implements InterfaceC9996e {

        /* renamed from: a */
        public final SeriesAllDataRightSideAdapter f20606a;

        public C3487d(SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter) {
            this.f20606a = seriesAllDataRightSideAdapter;
        }

        @Override // p428yg.InterfaceC9996e
        /* renamed from: a */
        public void mo15848a() {
        }

        @Override // p428yg.InterfaceC9996e
        public void onSuccess() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$e.class */
    public class ViewOnClickListenerC3488e implements View.OnClickListener {

        /* renamed from: b */
        public final String f20607b;

        /* renamed from: c */
        public final String f20608c;

        /* renamed from: d */
        public final String f20609d;

        /* renamed from: e */
        public final String f20610e;

        /* renamed from: f */
        public final String f20611f;

        /* renamed from: g */
        public final int f20612g;

        /* renamed from: h */
        public final String f20613h;

        /* renamed from: i */
        public final String f20614i;

        /* renamed from: j */
        public final String f20615j;

        /* renamed from: k */
        public final String f20616k;

        /* renamed from: l */
        public final String f20617l;

        /* renamed from: m */
        public final String f20618m;

        /* renamed from: n */
        public final String f20619n;

        /* renamed from: o */
        public final String f20620o;

        /* renamed from: p */
        public final String f20621p;

        /* renamed from: q */
        public final String f20622q;

        /* renamed from: r */
        public final String f20623r;

        /* renamed from: s */
        public final String f20624s;

        /* renamed from: t */
        public final int f20625t;

        /* renamed from: u */
        public final SeriesAllDataRightSideAdapter f20626u;

        public ViewOnClickListenerC3488e(SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter, String str, String str2, String str3, String str4, String str5, int i10, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i11) {
            this.f20626u = seriesAllDataRightSideAdapter;
            this.f20607b = str;
            this.f20608c = str2;
            this.f20609d = str3;
            this.f20610e = str4;
            this.f20611f = str5;
            this.f20612g = i10;
            this.f20613h = str6;
            this.f20614i = str7;
            this.f20615j = str8;
            this.f20616k = str9;
            this.f20617l = str10;
            this.f20618m = str11;
            this.f20619n = str12;
            this.f20620o = str13;
            this.f20621p = str14;
            this.f20622q = str15;
            this.f20623r = str16;
            this.f20624s = str17;
            this.f20625t = i11;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SharepreferenceDBHandler.m15373f(this.f20626u.f20579i).equals("m3u")) {
                this.f20626u.m17449S0(this.f20607b, this.f20608c, this.f20609d, view);
            } else {
                this.f20626u.m17456Z0(this.f20610e, this.f20608c, this.f20611f, this.f20612g, this.f20609d, this.f20613h, this.f20614i, this.f20615j, this.f20616k, this.f20617l, this.f20618m, this.f20619n, this.f20620o, this.f20621p, this.f20622q, this.f20623r, this.f20624s, this.f20625t);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$f.class */
    public class ViewOnClickListenerC3489f implements View.OnClickListener {

        /* renamed from: b */
        public final String f20627b;

        /* renamed from: c */
        public final String f20628c;

        /* renamed from: d */
        public final String f20629d;

        /* renamed from: e */
        public final String f20630e;

        /* renamed from: f */
        public final String f20631f;

        /* renamed from: g */
        public final int f20632g;

        /* renamed from: h */
        public final String f20633h;

        /* renamed from: i */
        public final String f20634i;

        /* renamed from: j */
        public final String f20635j;

        /* renamed from: k */
        public final String f20636k;

        /* renamed from: l */
        public final String f20637l;

        /* renamed from: m */
        public final String f20638m;

        /* renamed from: n */
        public final String f20639n;

        /* renamed from: o */
        public final String f20640o;

        /* renamed from: p */
        public final String f20641p;

        /* renamed from: q */
        public final String f20642q;

        /* renamed from: r */
        public final String f20643r;

        /* renamed from: s */
        public final String f20644s;

        /* renamed from: t */
        public final int f20645t;

        /* renamed from: u */
        public final SeriesAllDataRightSideAdapter f20646u;

        public ViewOnClickListenerC3489f(SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter, String str, String str2, String str3, String str4, String str5, int i10, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i11) {
            this.f20646u = seriesAllDataRightSideAdapter;
            this.f20627b = str;
            this.f20628c = str2;
            this.f20629d = str3;
            this.f20630e = str4;
            this.f20631f = str5;
            this.f20632g = i10;
            this.f20633h = str6;
            this.f20634i = str7;
            this.f20635j = str8;
            this.f20636k = str9;
            this.f20637l = str10;
            this.f20638m = str11;
            this.f20639n = str12;
            this.f20640o = str13;
            this.f20641p = str14;
            this.f20642q = str15;
            this.f20643r = str16;
            this.f20644s = str17;
            this.f20645t = i11;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SharepreferenceDBHandler.m15373f(this.f20646u.f20579i).equals("m3u")) {
                this.f20646u.m17449S0(this.f20627b, this.f20628c, this.f20629d, view);
            } else {
                this.f20646u.m17456Z0(this.f20630e, this.f20628c, this.f20631f, this.f20632g, this.f20629d, this.f20633h, this.f20634i, this.f20635j, this.f20636k, this.f20637l, this.f20638m, this.f20639n, this.f20640o, this.f20641p, this.f20642q, this.f20643r, this.f20644s, this.f20645t);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$g.class */
    public class ViewOnClickListenerC3490g implements View.OnClickListener {

        /* renamed from: b */
        public final String f20647b;

        /* renamed from: c */
        public final String f20648c;

        /* renamed from: d */
        public final String f20649d;

        /* renamed from: e */
        public final String f20650e;

        /* renamed from: f */
        public final String f20651f;

        /* renamed from: g */
        public final int f20652g;

        /* renamed from: h */
        public final String f20653h;

        /* renamed from: i */
        public final String f20654i;

        /* renamed from: j */
        public final String f20655j;

        /* renamed from: k */
        public final String f20656k;

        /* renamed from: l */
        public final String f20657l;

        /* renamed from: m */
        public final String f20658m;

        /* renamed from: n */
        public final String f20659n;

        /* renamed from: o */
        public final String f20660o;

        /* renamed from: p */
        public final String f20661p;

        /* renamed from: q */
        public final String f20662q;

        /* renamed from: r */
        public final String f20663r;

        /* renamed from: s */
        public final String f20664s;

        /* renamed from: t */
        public final int f20665t;

        /* renamed from: u */
        public final SeriesAllDataRightSideAdapter f20666u;

        public ViewOnClickListenerC3490g(SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter, String str, String str2, String str3, String str4, String str5, int i10, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i11) {
            this.f20666u = seriesAllDataRightSideAdapter;
            this.f20647b = str;
            this.f20648c = str2;
            this.f20649d = str3;
            this.f20650e = str4;
            this.f20651f = str5;
            this.f20652g = i10;
            this.f20653h = str6;
            this.f20654i = str7;
            this.f20655j = str8;
            this.f20656k = str9;
            this.f20657l = str10;
            this.f20658m = str11;
            this.f20659n = str12;
            this.f20660o = str13;
            this.f20661p = str14;
            this.f20662q = str15;
            this.f20663r = str16;
            this.f20664s = str17;
            this.f20665t = i11;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SharepreferenceDBHandler.m15373f(this.f20666u.f20579i).equals("m3u")) {
                this.f20666u.m17449S0(this.f20647b, this.f20648c, this.f20649d, view);
            } else {
                this.f20666u.m17456Z0(this.f20650e, this.f20648c, this.f20651f, this.f20652g, this.f20649d, this.f20653h, this.f20654i, this.f20655j, this.f20656k, this.f20657l, this.f20658m, this.f20659n, this.f20660o, this.f20661p, this.f20662q, this.f20663r, this.f20664s, this.f20665t);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$h.class */
    public class ViewOnLongClickListenerC3491h implements View.OnLongClickListener {

        /* renamed from: b */
        public final String f20667b;

        /* renamed from: c */
        public final ViewHolder f20668c;

        /* renamed from: d */
        public final int f20669d;

        /* renamed from: e */
        public final int f20670e;

        /* renamed from: f */
        public final String f20671f;

        /* renamed from: g */
        public final int f20672g;

        /* renamed from: h */
        public final SeriesAllDataRightSideAdapter f20673h;

        public ViewOnLongClickListenerC3491h(SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter, String str, ViewHolder viewHolder, int i10, int i11, String str2, int i12) {
            this.f20673h = seriesAllDataRightSideAdapter;
            this.f20667b = str;
            this.f20668c = viewHolder;
            this.f20669d = i10;
            this.f20670e = i11;
            this.f20671f = str2;
            this.f20672g = i12;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (SharepreferenceDBHandler.m15373f(this.f20673h.f20579i).equals("m3u")) {
                ArrayList<FavouriteM3UModel> m15159E0 = this.f20673h.f20573M.m15159E0(this.f20667b, SharepreferenceDBHandler.m15337A(this.f20673h.f20579i));
                SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter = this.f20673h;
                seriesAllDataRightSideAdapter.m17443M0(m15159E0, this.f20668c, this.f20669d, seriesAllDataRightSideAdapter.f20576f);
                return true;
            }
            ArrayList<FavouriteDBModel> m15112o = this.f20673h.f20581k.m15112o(this.f20670e, this.f20671f, "series", SharepreferenceDBHandler.m15337A(this.f20673h.f20579i));
            SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter2 = this.f20673h;
            seriesAllDataRightSideAdapter2.m17442L0(m15112o, this.f20668c, this.f20669d, seriesAllDataRightSideAdapter2.f20576f, this.f20673h.f20578h, this.f20672g, this.f20668c.Movie);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$i.class */
    public class ViewOnLongClickListenerC3492i implements View.OnLongClickListener {

        /* renamed from: b */
        public final String f20674b;

        /* renamed from: c */
        public final ViewHolder f20675c;

        /* renamed from: d */
        public final int f20676d;

        /* renamed from: e */
        public final int f20677e;

        /* renamed from: f */
        public final String f20678f;

        /* renamed from: g */
        public final int f20679g;

        /* renamed from: h */
        public final SeriesAllDataRightSideAdapter f20680h;

        public ViewOnLongClickListenerC3492i(SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter, String str, ViewHolder viewHolder, int i10, int i11, String str2, int i12) {
            this.f20680h = seriesAllDataRightSideAdapter;
            this.f20674b = str;
            this.f20675c = viewHolder;
            this.f20676d = i10;
            this.f20677e = i11;
            this.f20678f = str2;
            this.f20679g = i12;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (SharepreferenceDBHandler.m15373f(this.f20680h.f20579i).equals("m3u")) {
                ArrayList<FavouriteM3UModel> m15159E0 = this.f20680h.f20573M.m15159E0(this.f20674b, SharepreferenceDBHandler.m15337A(this.f20680h.f20579i));
                SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter = this.f20680h;
                seriesAllDataRightSideAdapter.m17443M0(m15159E0, this.f20675c, this.f20676d, seriesAllDataRightSideAdapter.f20576f);
                return true;
            }
            ArrayList<FavouriteDBModel> m15112o = this.f20680h.f20581k.m15112o(this.f20677e, this.f20678f, "series", SharepreferenceDBHandler.m15337A(this.f20680h.f20579i));
            SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter2 = this.f20680h;
            seriesAllDataRightSideAdapter2.m17442L0(m15112o, this.f20675c, this.f20676d, seriesAllDataRightSideAdapter2.f20576f, this.f20680h.f20578h, this.f20679g, this.f20675c.Movie);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$j.class */
    public class ViewOnLongClickListenerC3493j implements View.OnLongClickListener {

        /* renamed from: b */
        public final String f20681b;

        /* renamed from: c */
        public final ViewHolder f20682c;

        /* renamed from: d */
        public final int f20683d;

        /* renamed from: e */
        public final int f20684e;

        /* renamed from: f */
        public final String f20685f;

        /* renamed from: g */
        public final int f20686g;

        /* renamed from: h */
        public final SeriesAllDataRightSideAdapter f20687h;

        public ViewOnLongClickListenerC3493j(SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter, String str, ViewHolder viewHolder, int i10, int i11, String str2, int i12) {
            this.f20687h = seriesAllDataRightSideAdapter;
            this.f20681b = str;
            this.f20682c = viewHolder;
            this.f20683d = i10;
            this.f20684e = i11;
            this.f20685f = str2;
            this.f20686g = i12;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (SharepreferenceDBHandler.m15373f(this.f20687h.f20579i).equals("m3u")) {
                ArrayList<FavouriteM3UModel> m15159E0 = this.f20687h.f20573M.m15159E0(this.f20681b, SharepreferenceDBHandler.m15337A(this.f20687h.f20579i));
                SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter = this.f20687h;
                seriesAllDataRightSideAdapter.m17443M0(m15159E0, this.f20682c, this.f20683d, seriesAllDataRightSideAdapter.f20576f);
                return true;
            }
            ArrayList<FavouriteDBModel> m15112o = this.f20687h.f20581k.m15112o(this.f20684e, this.f20685f, "series", SharepreferenceDBHandler.m15337A(this.f20687h.f20579i));
            SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter2 = this.f20687h;
            seriesAllDataRightSideAdapter2.m17442L0(m15112o, this.f20682c, this.f20683d, seriesAllDataRightSideAdapter2.f20576f, this.f20687h.f20578h, this.f20686g, this.f20682c.Movie);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$k.class */
    public class C3494k implements C0304c1.d {

        /* renamed from: a */
        public final ArrayList f20688a;

        /* renamed from: b */
        public final String f20689b;

        /* renamed from: c */
        public final SeriesAllDataRightSideAdapter f20690c;

        public C3494k(SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter, ArrayList arrayList, String str) {
            this.f20690c = seriesAllDataRightSideAdapter;
            this.f20688a = arrayList;
            this.f20689b = str;
        }

        @Override // androidx.appcompat.widget.C0304c1.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                ArrayList arrayList = this.f20688a;
                if (arrayList != null && arrayList.size() > 0) {
                    for (int i10 = 0; i10 < this.f20688a.size(); i10++) {
                        if (menuItem.getItemId() == i10) {
                            if (menuItem.getItemId() == 0) {
                                C5255e.m26219V(this.f20690c.f20579i, "", 0, "series", this.f20690c.f20562B, "0", this.f20690c.f20563C, null, this.f20689b);
                            } else {
                                Intent intent = new Intent(this.f20690c.f20579i, (Class<?>) PlayExternalPlayerActivity.class);
                                intent.putExtra("url", this.f20689b);
                                intent.putExtra("app_name", ((ExternalPlayerModelClass) this.f20688a.get(i10)).m15415a());
                                intent.putExtra("packagename", ((ExternalPlayerModelClass) this.f20688a.get(i10)).m15416b());
                                this.f20690c.f20579i.startActivity(intent);
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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$l.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$l.class */
    public class C3495l implements C0304c1.c {

        /* renamed from: a */
        public final SeriesAllDataRightSideAdapter f20691a;

        public C3495l(SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter) {
            this.f20691a = seriesAllDataRightSideAdapter;
        }

        @Override // androidx.appcompat.widget.C0304c1.c
        /* renamed from: a */
        public void mo1281a(C0304c1 c0304c1) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$m.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter$m */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$m.class */
    public class C3496m implements C0304c1.d {

        /* renamed from: a */
        public final RecyclerView.AbstractC0674e0 f20692a;

        /* renamed from: b */
        public final int f20693b;

        /* renamed from: c */
        public final ArrayList f20694c;

        /* renamed from: d */
        public final List f20695d;

        /* renamed from: e */
        public final int f20696e;

        /* renamed from: f */
        public final SeriesAllDataRightSideAdapter f20697f;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$m$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter$m$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$m$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final C3496m f20698b;

            public a(C3496m c3496m) {
                this.f20698b = c3496m;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f20698b.f20697f.m4099w();
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$m$b.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter$m$b */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$m$b.class */
        public class b extends Dialog implements View.OnClickListener {

            /* renamed from: b */
            public Activity f20699b;

            /* renamed from: c */
            public TextView f20700c;

            /* renamed from: d */
            public TextView f20701d;

            /* renamed from: e */
            public TextView f20702e;

            /* renamed from: f */
            public LinearLayout f20703f;

            /* renamed from: g */
            public LinearLayout f20704g;

            /* renamed from: h */
            public final C3496m f20705h;

            /* JADX WARN: Classes with same name are omitted:
              classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$m$b$a.class
             */
            /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter$m$b$a */
            /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$m$b$a.class */
            public class a implements Runnable {

                /* renamed from: b */
                public final b f20706b;

                public a(b bVar) {
                    this.f20706b = bVar;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (this.f20706b.f20705h.f20697f.f20579i instanceof SeriesAllDataSingleActivity) {
                        ((SeriesAllDataSingleActivity) this.f20706b.f20705h.f20697f.f20579i).m16546e1();
                    }
                }
            }

            /* JADX WARN: Classes with same name are omitted:
              classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$m$b$b.class
             */
            /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter$m$b$b, reason: collision with other inner class name */
            /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$m$b$b.class */
            public class ViewOnFocusChangeListenerC10271b implements View.OnFocusChangeListener {

                /* renamed from: b */
                public View f20707b;

                /* renamed from: c */
                public final b f20708c;

                public ViewOnFocusChangeListenerC10271b(b bVar, View view) {
                    this.f20708c = bVar;
                    this.f20707b = view;
                }

                @Override // android.view.View.OnFocusChangeListener
                @SuppressLint({"ResourceType"})
                public void onFocusChange(View view, boolean z10) {
                    int i10;
                    LinearLayout linearLayout;
                    if (z10) {
                        View view2 = this.f20707b;
                        i10 = 2131230846;
                        if (view2 == null || view2.getTag() == null || !this.f20707b.getTag().equals("1")) {
                            View view3 = this.f20707b;
                            if (view3 == null || view3.getTag() == null || !this.f20707b.getTag().equals("2")) {
                                return;
                            }
                            linearLayout = this.f20708c.f20704g;
                        }
                        linearLayout = this.f20708c.f20703f;
                    } else {
                        View view4 = this.f20707b;
                        i10 = 2131230845;
                        if (view4 == null || view4.getTag() == null || !this.f20707b.getTag().equals("1")) {
                            View view5 = this.f20707b;
                            if (view5 == null || view5.getTag() == null || !this.f20707b.getTag().equals("2")) {
                                return;
                            }
                            linearLayout = this.f20708c.f20704g;
                        }
                        linearLayout = this.f20708c.f20703f;
                    }
                    linearLayout.setBackgroundResource(i10);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C3496m c3496m, Activity activity) {
                super(activity);
                this.f20705h = c3496m;
                this.f20699b = activity;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int id2 = view.getId();
                if (id2 == 2131427653) {
                    dismiss();
                } else if (id2 == 2131427681) {
                    try {
                        SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter = this.f20705h.f20697f;
                        C5602m c5602m = seriesAllDataRightSideAdapter.f20569I;
                        Context context = seriesAllDataRightSideAdapter.f20579i;
                        C3496m c3496m = this.f20705h;
                        c5602m.m27658i(context, ((GetEpisdoeDetailsCallback) c3496m.f20695d.get(c3496m.f20693b)).m14966r());
                        if (this.f20705h.f20697f.f20579i instanceof SeriesAllDataSingleActivity) {
                            ((SeriesAllDataSingleActivity) this.f20705h.f20697f.f20579i).m16551j1();
                        }
                        new Handler().postDelayed(new a(this), 100L);
                    } catch (Exception e10) {
                    }
                }
                dismiss();
            }

            @Override // android.app.Dialog
            public void onCreate(Bundle bundle) {
                super.onCreate(bundle);
                setContentView(new C6783a(this.f20705h.f20697f.f20579i).m31288z().equals(C5251a.f30065s0) ? 2131624128 : 2131624127);
                this.f20700c = (TextView) findViewById(2131427681);
                this.f20701d = (TextView) findViewById(2131427653);
                this.f20703f = (LinearLayout) findViewById(2131428448);
                this.f20704g = (LinearLayout) findViewById(2131428541);
                TextView textView = (TextView) findViewById(2131429644);
                this.f20702e = textView;
                textView.setText(this.f20705h.f20697f.f20579i.getResources().getString(2132018833));
                this.f20700c.setOnClickListener(this);
                this.f20701d.setOnClickListener(this);
                TextView textView2 = this.f20700c;
                textView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC10271b(this, textView2));
                TextView textView3 = this.f20701d;
                textView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC10271b(this, textView3));
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$m$c.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter$m$c */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$m$c.class */
        public class c implements Runnable {

            /* renamed from: b */
            public final C3496m f20709b;

            public c(C3496m c3496m) {
                this.f20709b = c3496m;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f20709b.f20697f.m4099w();
            }
        }

        public C3496m(SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter, RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, ArrayList arrayList, List list, int i11) {
            this.f20697f = seriesAllDataRightSideAdapter;
            this.f20692a = abstractC0674e0;
            this.f20693b = i10;
            this.f20694c = arrayList;
            this.f20695d = list;
            this.f20696e = i11;
        }

        @Override // androidx.appcompat.widget.C0304c1.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId == 2131428641) {
                new b(this, (SeriesAllDataSingleActivity) this.f20697f.f20579i).show();
                return false;
            }
            if (itemId == 2131428754) {
                this.f20697f.m17440J0(this.f20692a, this.f20693b, this.f20694c, this.f20695d, this.f20696e);
                new Handler().postDelayed(new a(this), 300L);
                if (!(this.f20697f.f20579i instanceof SeriesAllDataSingleActivity)) {
                    return false;
                }
            } else {
                if (itemId != 2131428775) {
                    return false;
                }
                this.f20697f.m17451U0(this.f20692a, this.f20693b, this.f20694c, this.f20695d, this.f20696e);
                new Handler().postDelayed(new c(this), 300L);
                if (!(this.f20697f.f20579i instanceof SeriesAllDataSingleActivity)) {
                    return false;
                }
            }
            ((SeriesAllDataSingleActivity) this.f20697f.f20579i).m16546e1();
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$n.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter$n */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$n.class */
    public class C3497n implements C0304c1.d {

        /* renamed from: a */
        public final ArrayList f20710a;

        /* renamed from: b */
        public final SeriesAllDataRightSideAdapter f20711b;

        public C3497n(SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter, ArrayList arrayList) {
            this.f20711b = seriesAllDataRightSideAdapter;
            this.f20710a = arrayList;
        }

        @Override // androidx.appcompat.widget.C0304c1.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                ArrayList arrayList = this.f20710a;
                if (arrayList != null && arrayList.size() > 0) {
                    for (int i10 = 0; i10 < this.f20710a.size(); i10++) {
                        if (menuItem.getItemId() == i10) {
                            if (menuItem.getItemId() == 0) {
                                C5255e.m26219V(this.f20711b.f20579i, "", C5255e.m26215R(this.f20711b.f20564D), "series", this.f20711b.f20562B, "0", this.f20711b.f20563C, null, "");
                            } else {
                                String m26202E = C5255e.m26202E(this.f20711b.f20579i, C5255e.m26215R(this.f20711b.f20564D), this.f20711b.f20562B, "series");
                                Intent intent = new Intent(this.f20711b.f20579i, (Class<?>) PlayExternalPlayerActivity.class);
                                intent.putExtra("url", m26202E);
                                intent.putExtra("app_name", ((ExternalPlayerModelClass) this.f20710a.get(i10)).m15415a());
                                intent.putExtra("packagename", ((ExternalPlayerModelClass) this.f20710a.get(i10)).m15416b());
                                this.f20711b.f20579i.startActivity(intent);
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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$o.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter$o */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$o.class */
    public class C3498o implements C0304c1.c {

        /* renamed from: a */
        public final SeriesAllDataRightSideAdapter f20712a;

        public C3498o(SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter) {
            this.f20712a = seriesAllDataRightSideAdapter;
        }

        @Override // androidx.appcompat.widget.C0304c1.c
        /* renamed from: a */
        public void mo1281a(C0304c1 c0304c1) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$p.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter$p */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$p.class */
    public class C3499p implements InterfaceC9996e {

        /* renamed from: a */
        public final SeriesAllDataRightSideAdapter f20713a;

        public C3499p(SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter) {
            this.f20713a = seriesAllDataRightSideAdapter;
        }

        @Override // p428yg.InterfaceC9996e
        /* renamed from: a */
        public void mo15848a() {
        }

        @Override // p428yg.InterfaceC9996e
        public void onSuccess() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$q.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter$q */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$q.class */
    public class C3500q implements InterfaceC9996e {

        /* renamed from: a */
        public final SeriesAllDataRightSideAdapter f20714a;

        public C3500q(SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter) {
            this.f20714a = seriesAllDataRightSideAdapter;
        }

        @Override // p428yg.InterfaceC9996e
        /* renamed from: a */
        public void mo15848a() {
        }

        @Override // p428yg.InterfaceC9996e
        public void onSuccess() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$r.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter$r */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$r.class */
    public class ViewOnClickListenerC3501r implements View.OnClickListener {

        /* renamed from: b */
        public final String f20715b;

        /* renamed from: c */
        public final String f20716c;

        /* renamed from: d */
        public final String f20717d;

        /* renamed from: e */
        public final String f20718e;

        /* renamed from: f */
        public final String f20719f;

        /* renamed from: g */
        public final String f20720g;

        /* renamed from: h */
        public final String f20721h;

        /* renamed from: i */
        public final int f20722i;

        /* renamed from: j */
        public final String f20723j;

        /* renamed from: k */
        public final String f20724k;

        /* renamed from: l */
        public final String f20725l;

        /* renamed from: m */
        public final int f20726m;

        /* renamed from: n */
        public final SeriesAllDataRightSideAdapter f20727n;

        public ViewOnClickListenerC3501r(SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, String str8, String str9, String str10, int i11) {
            this.f20727n = seriesAllDataRightSideAdapter;
            this.f20715b = str;
            this.f20716c = str2;
            this.f20717d = str3;
            this.f20718e = str4;
            this.f20719f = str5;
            this.f20720g = str6;
            this.f20721h = str7;
            this.f20722i = i10;
            this.f20723j = str8;
            this.f20724k = str9;
            this.f20725l = str10;
            this.f20726m = i11;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f20727n.f20561A = String.valueOf(this.f20715b);
            this.f20727n.f20596z = this.f20716c;
            this.f20727n.f20595y = this.f20717d;
            this.f20727n.f20593w = this.f20718e;
            this.f20727n.f20564D = this.f20719f;
            this.f20727n.f20563C = this.f20720g;
            this.f20727n.f20562B = this.f20721h;
            this.f20727n.f20565E = this.f20722i;
            this.f20727n.f20566F = this.f20723j;
            this.f20727n.f20567G = this.f20724k;
            this.f20727n.f20594x = this.f20725l;
            C5251a.f30022U = this.f20726m;
            this.f20727n.f20574N = view;
            this.f20727n.m17448R0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$s.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter$s */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$s.class */
    public class ViewOnClickListenerC3502s implements View.OnClickListener {

        /* renamed from: b */
        public final String f20728b;

        /* renamed from: c */
        public final String f20729c;

        /* renamed from: d */
        public final String f20730d;

        /* renamed from: e */
        public final String f20731e;

        /* renamed from: f */
        public final String f20732f;

        /* renamed from: g */
        public final String f20733g;

        /* renamed from: h */
        public final String f20734h;

        /* renamed from: i */
        public final int f20735i;

        /* renamed from: j */
        public final String f20736j;

        /* renamed from: k */
        public final String f20737k;

        /* renamed from: l */
        public final String f20738l;

        /* renamed from: m */
        public final int f20739m;

        /* renamed from: n */
        public final SeriesAllDataRightSideAdapter f20740n;

        public ViewOnClickListenerC3502s(SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, String str8, String str9, String str10, int i11) {
            this.f20740n = seriesAllDataRightSideAdapter;
            this.f20728b = str;
            this.f20729c = str2;
            this.f20730d = str3;
            this.f20731e = str4;
            this.f20732f = str5;
            this.f20733g = str6;
            this.f20734h = str7;
            this.f20735i = i10;
            this.f20736j = str8;
            this.f20737k = str9;
            this.f20738l = str10;
            this.f20739m = i11;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f20740n.f20561A = String.valueOf(this.f20728b);
            this.f20740n.f20596z = this.f20729c;
            this.f20740n.f20595y = this.f20730d;
            this.f20740n.f20593w = this.f20731e;
            this.f20740n.f20564D = this.f20732f;
            this.f20740n.f20563C = this.f20733g;
            this.f20740n.f20562B = this.f20734h;
            this.f20740n.f20565E = this.f20735i;
            this.f20740n.f20566F = this.f20736j;
            this.f20740n.f20567G = this.f20737k;
            this.f20740n.f20594x = this.f20738l;
            C5251a.f30022U = this.f20739m;
            this.f20740n.f20574N = view;
            this.f20740n.m17448R0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$t.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter$t */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$t.class */
    public class ViewOnClickListenerC3503t implements View.OnClickListener {

        /* renamed from: b */
        public final String f20741b;

        /* renamed from: c */
        public final String f20742c;

        /* renamed from: d */
        public final String f20743d;

        /* renamed from: e */
        public final String f20744e;

        /* renamed from: f */
        public final String f20745f;

        /* renamed from: g */
        public final String f20746g;

        /* renamed from: h */
        public final String f20747h;

        /* renamed from: i */
        public final int f20748i;

        /* renamed from: j */
        public final String f20749j;

        /* renamed from: k */
        public final String f20750k;

        /* renamed from: l */
        public final String f20751l;

        /* renamed from: m */
        public final int f20752m;

        /* renamed from: n */
        public final SeriesAllDataRightSideAdapter f20753n;

        public ViewOnClickListenerC3503t(SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, String str8, String str9, String str10, int i11) {
            this.f20753n = seriesAllDataRightSideAdapter;
            this.f20741b = str;
            this.f20742c = str2;
            this.f20743d = str3;
            this.f20744e = str4;
            this.f20745f = str5;
            this.f20746g = str6;
            this.f20747h = str7;
            this.f20748i = i10;
            this.f20749j = str8;
            this.f20750k = str9;
            this.f20751l = str10;
            this.f20752m = i11;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f20753n.f20561A = String.valueOf(this.f20741b);
            this.f20753n.f20596z = this.f20742c;
            this.f20753n.f20595y = this.f20743d;
            this.f20753n.f20593w = this.f20744e;
            this.f20753n.f20564D = this.f20745f;
            this.f20753n.f20563C = this.f20746g;
            this.f20753n.f20562B = this.f20747h;
            this.f20753n.f20565E = this.f20748i;
            this.f20753n.f20566F = this.f20749j;
            this.f20753n.f20567G = this.f20750k;
            this.f20753n.f20594x = this.f20751l;
            C5251a.f30022U = this.f20752m;
            this.f20753n.f20574N = view;
            this.f20753n.m17448R0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$u.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter$u */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$u.class */
    public class ViewOnLongClickListenerC3504u implements View.OnLongClickListener {

        /* renamed from: b */
        public final ContinueWatchingViewHolder f20754b;

        /* renamed from: c */
        public final int f20755c;

        /* renamed from: d */
        public final int f20756d;

        /* renamed from: e */
        public final SeriesAllDataRightSideAdapter f20757e;

        public ViewOnLongClickListenerC3504u(SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter, ContinueWatchingViewHolder continueWatchingViewHolder, int i10, int i11) {
            this.f20757e = seriesAllDataRightSideAdapter;
            this.f20754b = continueWatchingViewHolder;
            this.f20755c = i10;
            this.f20756d = i11;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter = this.f20757e;
            seriesAllDataRightSideAdapter.m17450T0(this.f20754b, this.f20755c, seriesAllDataRightSideAdapter.f20576f, this.f20757e.f20578h, this.f20756d);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$v.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter$v */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$v.class */
    public class ViewOnLongClickListenerC3505v implements View.OnLongClickListener {

        /* renamed from: b */
        public final ContinueWatchingViewHolder f20758b;

        /* renamed from: c */
        public final int f20759c;

        /* renamed from: d */
        public final int f20760d;

        /* renamed from: e */
        public final SeriesAllDataRightSideAdapter f20761e;

        public ViewOnLongClickListenerC3505v(SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter, ContinueWatchingViewHolder continueWatchingViewHolder, int i10, int i11) {
            this.f20761e = seriesAllDataRightSideAdapter;
            this.f20758b = continueWatchingViewHolder;
            this.f20759c = i10;
            this.f20760d = i11;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter = this.f20761e;
            seriesAllDataRightSideAdapter.m17450T0(this.f20758b, this.f20759c, seriesAllDataRightSideAdapter.f20576f, this.f20761e.f20578h, this.f20760d);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$w.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter$w */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$w.class */
    public class ViewOnLongClickListenerC3506w implements View.OnLongClickListener {

        /* renamed from: b */
        public final ContinueWatchingViewHolder f20762b;

        /* renamed from: c */
        public final int f20763c;

        /* renamed from: d */
        public final int f20764d;

        /* renamed from: e */
        public final SeriesAllDataRightSideAdapter f20765e;

        public ViewOnLongClickListenerC3506w(SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter, ContinueWatchingViewHolder continueWatchingViewHolder, int i10, int i11) {
            this.f20765e = seriesAllDataRightSideAdapter;
            this.f20762b = continueWatchingViewHolder;
            this.f20763c = i10;
            this.f20764d = i11;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter = this.f20765e;
            seriesAllDataRightSideAdapter.m17450T0(this.f20762b, this.f20763c, seriesAllDataRightSideAdapter.f20576f, this.f20765e.f20578h, this.f20764d);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$x.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter$x */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$x.class */
    public class C3507x extends Filter {

        /* renamed from: a */
        public final SeriesAllDataRightSideAdapter f20766a;

        public C3507x(SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter) {
            this.f20766a = seriesAllDataRightSideAdapter;
        }

        public /* synthetic */ C3507x(SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter, C3484a c3484a) {
            this(seriesAllDataRightSideAdapter);
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = this.f20766a.f20575e;
            if (arrayList == null) {
                filterResults.values = null;
                filterResults.count = 0;
                return filterResults;
            }
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                SeriesDBModel seriesDBModel = (SeriesDBModel) arrayList.get(i10);
                if (seriesDBModel.m15037d().toLowerCase().contains(lowerCase) || seriesDBModel.m15037d().contains(lowerCase)) {
                    arrayList2.add(seriesDBModel);
                }
            }
            filterResults.values = arrayList2;
            filterResults.count = arrayList2.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            try {
                this.f20766a.f20576f = (ArrayList) filterResults.values;
                if (this.f20766a.f20576f != null) {
                    this.f20766a.m4099w();
                    if (this.f20766a.f20576f == null || this.f20766a.f20576f.size() != 0) {
                        ((SeriesAllDataSingleActivity) this.f20766a.f20579i).m16561r1();
                        ((SeriesAllDataSingleActivity) this.f20766a.f20579i).m16535S0();
                    } else {
                        ((SeriesAllDataSingleActivity) this.f20766a.f20579i).m16537V0();
                        ((SeriesAllDataSingleActivity) this.f20766a.f20579i).m16557p1(this.f20766a.f20579i.getResources().getString(2132018223));
                    }
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$y.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter$y */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$y.class */
    public class C3508y extends Filter {

        /* renamed from: a */
        public final SeriesAllDataRightSideAdapter f20767a;

        public C3508y(SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter) {
            this.f20767a = seriesAllDataRightSideAdapter;
        }

        public /* synthetic */ C3508y(SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter, C3484a c3484a) {
            this(seriesAllDataRightSideAdapter);
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            List list = this.f20767a.f20577g;
            if (list == null) {
                filterResults.values = null;
                filterResults.count = 0;
                return filterResults;
            }
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                GetEpisdoeDetailsCallback getEpisdoeDetailsCallback = (GetEpisdoeDetailsCallback) list.get(i10);
                if (getEpisdoeDetailsCallback.m14967s().toLowerCase().contains(lowerCase) || getEpisdoeDetailsCallback.m14967s().contains(lowerCase)) {
                    arrayList.add(getEpisdoeDetailsCallback);
                }
            }
            filterResults.values = arrayList;
            filterResults.count = arrayList.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            try {
                this.f20767a.f20578h = (List) filterResults.values;
                if (this.f20767a.f20578h != null) {
                    this.f20767a.m4099w();
                    if (this.f20767a.f20578h.size() == 0) {
                        ((SeriesAllDataSingleActivity) this.f20767a.f20579i).m16537V0();
                        ((SeriesAllDataSingleActivity) this.f20767a.f20579i).m16557p1(this.f20767a.f20579i.getResources().getString(2132018223));
                    } else {
                        ((SeriesAllDataSingleActivity) this.f20767a.f20579i).m16561r1();
                        ((SeriesAllDataSingleActivity) this.f20767a.f20579i).m16535S0();
                    }
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$z.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter$z */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAllDataRightSideAdapter$z.class */
    public class ViewOnFocusChangeListenerC3509z implements View.OnFocusChangeListener {

        /* renamed from: b */
        public int f20768b;

        /* renamed from: c */
        public final SeriesAllDataRightSideAdapter f20769c;

        public ViewOnFocusChangeListenerC3509z(SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter, int i10) {
            this.f20769c = seriesAllDataRightSideAdapter;
            this.f20768b = i10;
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            this.f20769c.f20571K = z10 ? this.f20768b : -1;
        }
    }

    public SeriesAllDataRightSideAdapter(Context context, String str) {
        this.f20583m = "";
        this.f20587q = "mobile";
        this.f20579i = context;
        this.f20581k = new DatabaseHandler(context);
        this.f20573M = new LiveStreamDBHandler(context);
        this.f20582l = AnimationUtils.loadAnimation(context, 2130771980);
        this.f20583m = str;
        this.f20588r = context.getSharedPreferences("loginPrefs", 0);
        this.f20589s = new C5375g(context, this);
        this.f20569I = new C5602m(context);
        if (new C6783a(context).m31288z().equals(C5251a.f30065s0)) {
            this.f20587q = "tv";
        } else {
            this.f20587q = "mobile";
        }
        if (this.f20587q.equals("mobile")) {
            try {
                this.f20586p = C5938b.m29235e(context).m29243c().m29358c();
            } catch (Exception e10) {
            }
        }
    }

    @Override // p324sf.InterfaceC8572k
    /* renamed from: C */
    public void mo16593C(String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x0749 A[Catch: Exception -> 0x0916, TryCatch #7 {Exception -> 0x0916, blocks: (B:5:0x0029, B:7:0x0032, B:9:0x003b, B:11:0x0042, B:14:0x0186, B:16:0x018f, B:27:0x01e3, B:29:0x01f8, B:34:0x02c3, B:36:0x02e1, B:38:0x02f8, B:43:0x038b, B:45:0x03d8, B:47:0x03de, B:50:0x02ed, B:31:0x0280, B:33:0x0279, B:55:0x0237, B:65:0x0198, B:67:0x03fb, B:72:0x041c, B:74:0x0425, B:76:0x042c, B:78:0x0433, B:80:0x0448, B:81:0x0454, B:83:0x045c, B:84:0x046a, B:86:0x0472, B:87:0x0480, B:89:0x0489, B:90:0x0496, B:92:0x049e, B:93:0x04ac, B:95:0x04b4, B:96:0x04c2, B:98:0x04ca, B:99:0x04d8, B:101:0x04e0, B:102:0x04ee, B:104:0x04f6, B:105:0x0504, B:107:0x050c, B:108:0x051a, B:110:0x0522, B:111:0x0530, B:113:0x0538, B:114:0x0546, B:116:0x054e, B:117:0x055c, B:119:0x0564, B:120:0x0572, B:122:0x057a, B:123:0x0588, B:125:0x0590, B:126:0x059e, B:128:0x05a6, B:129:0x05b4, B:131:0x05bc, B:132:0x05ca, B:135:0x05ea, B:137:0x05f4, B:140:0x0611, B:142:0x061b, B:144:0x0625, B:146:0x0639, B:147:0x0651, B:152:0x0729, B:154:0x0749, B:156:0x075f, B:158:0x0769, B:160:0x07b5, B:174:0x0773, B:176:0x0783, B:178:0x079e, B:179:0x07aa, B:149:0x06e2, B:151:0x06db, B:184:0x0695, B:185:0x0643, B:187:0x05fe, B:52:0x0204, B:181:0x065f), top: B:2:0x0020, inners: #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x08d4 A[Catch: Exception -> 0x08fa, TRY_LEAVE, TryCatch #2 {Exception -> 0x08fa, blocks: (B:163:0x07c1, B:165:0x08d4), top: B:162:0x07c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0783 A[Catch: Exception -> 0x0916, TRY_ENTER, TryCatch #7 {Exception -> 0x0916, blocks: (B:5:0x0029, B:7:0x0032, B:9:0x003b, B:11:0x0042, B:14:0x0186, B:16:0x018f, B:27:0x01e3, B:29:0x01f8, B:34:0x02c3, B:36:0x02e1, B:38:0x02f8, B:43:0x038b, B:45:0x03d8, B:47:0x03de, B:50:0x02ed, B:31:0x0280, B:33:0x0279, B:55:0x0237, B:65:0x0198, B:67:0x03fb, B:72:0x041c, B:74:0x0425, B:76:0x042c, B:78:0x0433, B:80:0x0448, B:81:0x0454, B:83:0x045c, B:84:0x046a, B:86:0x0472, B:87:0x0480, B:89:0x0489, B:90:0x0496, B:92:0x049e, B:93:0x04ac, B:95:0x04b4, B:96:0x04c2, B:98:0x04ca, B:99:0x04d8, B:101:0x04e0, B:102:0x04ee, B:104:0x04f6, B:105:0x0504, B:107:0x050c, B:108:0x051a, B:110:0x0522, B:111:0x0530, B:113:0x0538, B:114:0x0546, B:116:0x054e, B:117:0x055c, B:119:0x0564, B:120:0x0572, B:122:0x057a, B:123:0x0588, B:125:0x0590, B:126:0x059e, B:128:0x05a6, B:129:0x05b4, B:131:0x05bc, B:132:0x05ca, B:135:0x05ea, B:137:0x05f4, B:140:0x0611, B:142:0x061b, B:144:0x0625, B:146:0x0639, B:147:0x0651, B:152:0x0729, B:154:0x0749, B:156:0x075f, B:158:0x0769, B:160:0x07b5, B:174:0x0773, B:176:0x0783, B:178:0x079e, B:179:0x07aa, B:149:0x06e2, B:151:0x06db, B:184:0x0695, B:185:0x0643, B:187:0x05fe, B:52:0x0204, B:181:0x065f), top: B:2:0x0020, inners: #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01e3 A[Catch: Exception -> 0x0916, TRY_ENTER, TryCatch #7 {Exception -> 0x0916, blocks: (B:5:0x0029, B:7:0x0032, B:9:0x003b, B:11:0x0042, B:14:0x0186, B:16:0x018f, B:27:0x01e3, B:29:0x01f8, B:34:0x02c3, B:36:0x02e1, B:38:0x02f8, B:43:0x038b, B:45:0x03d8, B:47:0x03de, B:50:0x02ed, B:31:0x0280, B:33:0x0279, B:55:0x0237, B:65:0x0198, B:67:0x03fb, B:72:0x041c, B:74:0x0425, B:76:0x042c, B:78:0x0433, B:80:0x0448, B:81:0x0454, B:83:0x045c, B:84:0x046a, B:86:0x0472, B:87:0x0480, B:89:0x0489, B:90:0x0496, B:92:0x049e, B:93:0x04ac, B:95:0x04b4, B:96:0x04c2, B:98:0x04ca, B:99:0x04d8, B:101:0x04e0, B:102:0x04ee, B:104:0x04f6, B:105:0x0504, B:107:0x050c, B:108:0x051a, B:110:0x0522, B:111:0x0530, B:113:0x0538, B:114:0x0546, B:116:0x054e, B:117:0x055c, B:119:0x0564, B:120:0x0572, B:122:0x057a, B:123:0x0588, B:125:0x0590, B:126:0x059e, B:128:0x05a6, B:129:0x05b4, B:131:0x05bc, B:132:0x05ca, B:135:0x05ea, B:137:0x05f4, B:140:0x0611, B:142:0x061b, B:144:0x0625, B:146:0x0639, B:147:0x0651, B:152:0x0729, B:154:0x0749, B:156:0x075f, B:158:0x0769, B:160:0x07b5, B:174:0x0773, B:176:0x0783, B:178:0x079e, B:179:0x07aa, B:149:0x06e2, B:151:0x06db, B:184:0x0695, B:185:0x0643, B:187:0x05fe, B:52:0x0204, B:181:0x065f), top: B:2:0x0020, inners: #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0280 A[Catch: Exception -> 0x0916, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x0916, blocks: (B:5:0x0029, B:7:0x0032, B:9:0x003b, B:11:0x0042, B:14:0x0186, B:16:0x018f, B:27:0x01e3, B:29:0x01f8, B:34:0x02c3, B:36:0x02e1, B:38:0x02f8, B:43:0x038b, B:45:0x03d8, B:47:0x03de, B:50:0x02ed, B:31:0x0280, B:33:0x0279, B:55:0x0237, B:65:0x0198, B:67:0x03fb, B:72:0x041c, B:74:0x0425, B:76:0x042c, B:78:0x0433, B:80:0x0448, B:81:0x0454, B:83:0x045c, B:84:0x046a, B:86:0x0472, B:87:0x0480, B:89:0x0489, B:90:0x0496, B:92:0x049e, B:93:0x04ac, B:95:0x04b4, B:96:0x04c2, B:98:0x04ca, B:99:0x04d8, B:101:0x04e0, B:102:0x04ee, B:104:0x04f6, B:105:0x0504, B:107:0x050c, B:108:0x051a, B:110:0x0522, B:111:0x0530, B:113:0x0538, B:114:0x0546, B:116:0x054e, B:117:0x055c, B:119:0x0564, B:120:0x0572, B:122:0x057a, B:123:0x0588, B:125:0x0590, B:126:0x059e, B:128:0x05a6, B:129:0x05b4, B:131:0x05bc, B:132:0x05ca, B:135:0x05ea, B:137:0x05f4, B:140:0x0611, B:142:0x061b, B:144:0x0625, B:146:0x0639, B:147:0x0651, B:152:0x0729, B:154:0x0749, B:156:0x075f, B:158:0x0769, B:160:0x07b5, B:174:0x0773, B:176:0x0783, B:178:0x079e, B:179:0x07aa, B:149:0x06e2, B:151:0x06db, B:184:0x0695, B:185:0x0643, B:187:0x05fe, B:52:0x0204, B:181:0x065f), top: B:2:0x0020, inners: #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02e1 A[Catch: Exception -> 0x0916, TRY_LEAVE, TryCatch #7 {Exception -> 0x0916, blocks: (B:5:0x0029, B:7:0x0032, B:9:0x003b, B:11:0x0042, B:14:0x0186, B:16:0x018f, B:27:0x01e3, B:29:0x01f8, B:34:0x02c3, B:36:0x02e1, B:38:0x02f8, B:43:0x038b, B:45:0x03d8, B:47:0x03de, B:50:0x02ed, B:31:0x0280, B:33:0x0279, B:55:0x0237, B:65:0x0198, B:67:0x03fb, B:72:0x041c, B:74:0x0425, B:76:0x042c, B:78:0x0433, B:80:0x0448, B:81:0x0454, B:83:0x045c, B:84:0x046a, B:86:0x0472, B:87:0x0480, B:89:0x0489, B:90:0x0496, B:92:0x049e, B:93:0x04ac, B:95:0x04b4, B:96:0x04c2, B:98:0x04ca, B:99:0x04d8, B:101:0x04e0, B:102:0x04ee, B:104:0x04f6, B:105:0x0504, B:107:0x050c, B:108:0x051a, B:110:0x0522, B:111:0x0530, B:113:0x0538, B:114:0x0546, B:116:0x054e, B:117:0x055c, B:119:0x0564, B:120:0x0572, B:122:0x057a, B:123:0x0588, B:125:0x0590, B:126:0x059e, B:128:0x05a6, B:129:0x05b4, B:131:0x05bc, B:132:0x05ca, B:135:0x05ea, B:137:0x05f4, B:140:0x0611, B:142:0x061b, B:144:0x0625, B:146:0x0639, B:147:0x0651, B:152:0x0729, B:154:0x0749, B:156:0x075f, B:158:0x0769, B:160:0x07b5, B:174:0x0773, B:176:0x0783, B:178:0x079e, B:179:0x07aa, B:149:0x06e2, B:151:0x06db, B:184:0x0695, B:185:0x0643, B:187:0x05fe, B:52:0x0204, B:181:0x065f), top: B:2:0x0020, inners: #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03d8 A[Catch: Exception -> 0x0916, TryCatch #7 {Exception -> 0x0916, blocks: (B:5:0x0029, B:7:0x0032, B:9:0x003b, B:11:0x0042, B:14:0x0186, B:16:0x018f, B:27:0x01e3, B:29:0x01f8, B:34:0x02c3, B:36:0x02e1, B:38:0x02f8, B:43:0x038b, B:45:0x03d8, B:47:0x03de, B:50:0x02ed, B:31:0x0280, B:33:0x0279, B:55:0x0237, B:65:0x0198, B:67:0x03fb, B:72:0x041c, B:74:0x0425, B:76:0x042c, B:78:0x0433, B:80:0x0448, B:81:0x0454, B:83:0x045c, B:84:0x046a, B:86:0x0472, B:87:0x0480, B:89:0x0489, B:90:0x0496, B:92:0x049e, B:93:0x04ac, B:95:0x04b4, B:96:0x04c2, B:98:0x04ca, B:99:0x04d8, B:101:0x04e0, B:102:0x04ee, B:104:0x04f6, B:105:0x0504, B:107:0x050c, B:108:0x051a, B:110:0x0522, B:111:0x0530, B:113:0x0538, B:114:0x0546, B:116:0x054e, B:117:0x055c, B:119:0x0564, B:120:0x0572, B:122:0x057a, B:123:0x0588, B:125:0x0590, B:126:0x059e, B:128:0x05a6, B:129:0x05b4, B:131:0x05bc, B:132:0x05ca, B:135:0x05ea, B:137:0x05f4, B:140:0x0611, B:142:0x061b, B:144:0x0625, B:146:0x0639, B:147:0x0651, B:152:0x0729, B:154:0x0749, B:156:0x075f, B:158:0x0769, B:160:0x07b5, B:174:0x0773, B:176:0x0783, B:178:0x079e, B:179:0x07aa, B:149:0x06e2, B:151:0x06db, B:184:0x0695, B:185:0x0643, B:187:0x05fe, B:52:0x0204, B:181:0x065f), top: B:2:0x0020, inners: #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02ed A[Catch: Exception -> 0x0916, TRY_ENTER, TryCatch #7 {Exception -> 0x0916, blocks: (B:5:0x0029, B:7:0x0032, B:9:0x003b, B:11:0x0042, B:14:0x0186, B:16:0x018f, B:27:0x01e3, B:29:0x01f8, B:34:0x02c3, B:36:0x02e1, B:38:0x02f8, B:43:0x038b, B:45:0x03d8, B:47:0x03de, B:50:0x02ed, B:31:0x0280, B:33:0x0279, B:55:0x0237, B:65:0x0198, B:67:0x03fb, B:72:0x041c, B:74:0x0425, B:76:0x042c, B:78:0x0433, B:80:0x0448, B:81:0x0454, B:83:0x045c, B:84:0x046a, B:86:0x0472, B:87:0x0480, B:89:0x0489, B:90:0x0496, B:92:0x049e, B:93:0x04ac, B:95:0x04b4, B:96:0x04c2, B:98:0x04ca, B:99:0x04d8, B:101:0x04e0, B:102:0x04ee, B:104:0x04f6, B:105:0x0504, B:107:0x050c, B:108:0x051a, B:110:0x0522, B:111:0x0530, B:113:0x0538, B:114:0x0546, B:116:0x054e, B:117:0x055c, B:119:0x0564, B:120:0x0572, B:122:0x057a, B:123:0x0588, B:125:0x0590, B:126:0x059e, B:128:0x05a6, B:129:0x05b4, B:131:0x05bc, B:132:0x05ca, B:135:0x05ea, B:137:0x05f4, B:140:0x0611, B:142:0x061b, B:144:0x0625, B:146:0x0639, B:147:0x0651, B:152:0x0729, B:154:0x0749, B:156:0x075f, B:158:0x0769, B:160:0x07b5, B:174:0x0773, B:176:0x0783, B:178:0x079e, B:179:0x07aa, B:149:0x06e2, B:151:0x06db, B:184:0x0695, B:185:0x0643, B:187:0x05fe, B:52:0x0204, B:181:0x065f), top: B:2:0x0020, inners: #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0204 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    @android.annotation.SuppressLint({"SetTextI18n"})
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo2996G(@org.jetbrains.annotations.NotNull androidx.recyclerview.widget.RecyclerView.AbstractC0674e0 r23, int r24) {
        /*
            Method dump skipped, instructions count: 2338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter.mo2996G(androidx.recyclerview.widget.RecyclerView$e0, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    @NotNull
    /* renamed from: J */
    public RecyclerView.AbstractC0674e0 mo2998J(@NotNull ViewGroup viewGroup, int i10) {
        return i10 == 1 ? new ContinueWatchingViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(2131624513, viewGroup, false)) : new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(2131624512, viewGroup, false));
    }

    /* renamed from: J0 */
    public final void m17440J0(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, ArrayList<SeriesDBModel> arrayList, List<GetEpisdoeDetailsCallback> list, int i11) {
        ImageView imageView;
        if (i11 == 1) {
            ContinueWatchingViewHolder continueWatchingViewHolder = (ContinueWatchingViewHolder) abstractC0674e0;
            FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
            favouriteDBModel.m14767h(list.get(i10).m14950b());
            favouriteDBModel.m14772m(C5255e.m26215R(list.get(i10).m14966r()));
            favouriteDBModel.m14770k(list.get(i10).m14969u());
            favouriteDBModel.m14771l(list.get(i10).m14968t());
            favouriteDBModel.m14774o(SharepreferenceDBHandler.m15337A(this.f20579i));
            this.f20581k.m15111l(favouriteDBModel, "series");
            continueWatchingViewHolder.ivFavourite.startAnimation(this.f20582l);
            imageView = continueWatchingViewHolder.ivFavourite;
        } else {
            ViewHolder viewHolder = (ViewHolder) abstractC0674e0;
            FavouriteDBModel favouriteDBModel2 = new FavouriteDBModel();
            favouriteDBModel2.m14767h(arrayList.get(i10).m15035b());
            favouriteDBModel2.m14772m(arrayList.get(i10).m15051r());
            favouriteDBModel2.m14770k(arrayList.get(i10).m15037d());
            favouriteDBModel2.m14771l(arrayList.get(i10).m15038e());
            favouriteDBModel2.m14774o(SharepreferenceDBHandler.m15337A(this.f20579i));
            this.f20581k.m15111l(favouriteDBModel2, "series");
            viewHolder.ivFavourite.startAnimation(this.f20582l);
            imageView = viewHolder.ivFavourite;
        }
        imageView.setVisibility(0);
    }

    /* renamed from: K0 */
    public final void m17441K0(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, ArrayList<SeriesDBModel> arrayList) {
        ViewHolder viewHolder = (ViewHolder) abstractC0674e0;
        FavouriteM3UModel favouriteM3UModel = new FavouriteM3UModel();
        favouriteM3UModel.m14782h(arrayList.get(i10).m15041h());
        favouriteM3UModel.m14783i(SharepreferenceDBHandler.m15337A(this.f20579i));
        favouriteM3UModel.m14781g(arrayList.get(i10).m15037d());
        favouriteM3UModel.m14779e(arrayList.get(i10).m15035b());
        this.f20573M.m15156D0(favouriteM3UModel);
        viewHolder.ivFavourite.startAnimation(this.f20582l);
        viewHolder.ivFavourite.setVisibility(0);
    }

    /* renamed from: L0 */
    public final void m17442L0(ArrayList<FavouriteDBModel> arrayList, RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, ArrayList<SeriesDBModel> arrayList2, List<GetEpisdoeDetailsCallback> list, int i11, RelativeLayout relativeLayout) {
        if (arrayList.size() > 0) {
            m17451U0(abstractC0674e0, i10, arrayList2, list, i11);
        } else {
            m17440J0(abstractC0674e0, i10, arrayList2, list, i11);
        }
        this.f20570J = true;
        Context context = this.f20579i;
        if (context instanceof SeriesAllDataSingleActivity) {
            ((SeriesAllDataSingleActivity) context).m16546e1();
        }
    }

    /* renamed from: M0 */
    public final void m17443M0(ArrayList<FavouriteM3UModel> arrayList, RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, ArrayList<SeriesDBModel> arrayList2) {
        if (arrayList.size() > 0) {
            m17452V0(abstractC0674e0, i10, arrayList2);
        } else {
            m17441K0(abstractC0674e0, i10, arrayList2);
        }
        this.f20570J = true;
        Context context = this.f20579i;
        if (context instanceof SeriesAllDataSingleActivity) {
            ((SeriesAllDataSingleActivity) context).m16546e1();
        }
    }

    /* renamed from: N0 */
    public boolean m17444N0() {
        return this.f20570J;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(50:4|5|(1:135)(1:9)|10|11|(1:13)(1:134)|14|15|16|(1:133)(1:20)|21|22|(1:132)(1:26)|27|28|(1:131)(1:32)|33|34|(1:130)(1:38)|39|40|(1:129)(1:44)|45|46|(1:128)(1:50)|51|52|53|(1:55)|56|(3:57|58|(1:124)(1:62))|63|(3:64|65|(1:120)(1:69))|70|(2:71|72)|(5:74|75|76|77|(13:79|80|81|82|(5:84|85|86|87|(8:89|90|91|92|(5:94|95|96|97|(3:99|100|101))|105|100|101))|111|90|91|92|(0)|105|100|101))|117|80|81|82|(0)|111|90|91|92|(0)|105|100|101|2) */
    /* JADX WARN: Can't wrap try/catch for region: R(53:4|5|(1:135)(1:9)|10|11|(1:13)(1:134)|14|15|16|(1:133)(1:20)|21|22|(1:132)(1:26)|27|28|(1:131)(1:32)|33|34|(1:130)(1:38)|39|40|(1:129)(1:44)|45|46|(1:128)(1:50)|51|52|53|(1:55)|56|57|58|(1:124)(1:62)|63|(3:64|65|(1:120)(1:69))|70|71|72|(5:74|75|76|77|(13:79|80|81|82|(5:84|85|86|87|(8:89|90|91|92|(5:94|95|96|97|(3:99|100|101))|105|100|101))|111|90|91|92|(0)|105|100|101))|117|80|81|82|(0)|111|90|91|92|(0)|105|100|101|2) */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02aa A[Catch: Exception -> 0x02dd, TryCatch #2 {Exception -> 0x02dd, blocks: (B:82:0x02a1, B:84:0x02aa), top: B:81:0x02a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02f1 A[Catch: Exception -> 0x0324, TryCatch #7 {Exception -> 0x0324, blocks: (B:92:0x02e8, B:94:0x02f1), top: B:91:0x02e8 }] */
    /* renamed from: O0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m17445O0(org.json.JSONArray r5, int r6) {
        /*
            Method dump skipped, instructions count: 885
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter.m17445O0(org.json.JSONArray, int):void");
    }

    /* renamed from: P0 */
    public int m17446P0() {
        return this.f20571K;
    }

    /* renamed from: Q0 */
    public final void m17447Q0() {
        try {
            ProgressDialog progressDialog = this.f20568H;
            if (progressDialog == null || !progressDialog.isShowing()) {
                return;
            }
            this.f20568H.dismiss();
        } catch (Exception e10) {
        }
    }

    /* renamed from: R0 */
    public final void m17448R0() {
        String string = this.f20588r.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        String string2 = this.f20588r.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        if (string == null || string2 == null || string.isEmpty() || string2.isEmpty()) {
            return;
        }
        m17455Y0();
        this.f20589s.m26725b(string, string2, String.valueOf(this.f20561A));
    }

    /* renamed from: S0 */
    public final void m17449S0(String str, String str2, String str3, View view) {
        this.f20563C = str2;
        this.f20566F = str3;
        if (this.f20587q.equals("mobile")) {
            try {
                this.f20586p = C5938b.m29235e(this.f20579i).m29243c().m29358c();
            } catch (Exception e10) {
            }
        }
        C5947e c5947e = this.f20586p;
        if (c5947e != null && c5947e.m29348c()) {
            C5947e c5947e2 = this.f20586p;
            if (((c5947e2 == null || c5947e2.m29290r() == null || this.f20586p.m29290r().m31009j() == null || this.f20586p.m29290r().m31009j().m13058R() == null) ? "" : this.f20586p.m29290r().m31009j().m13058R()).contains(str)) {
                this.f20579i.startActivity(new Intent(this.f20579i, (Class<?>) ExpandedControlsActivity.class));
                return;
            } else {
                C4718a.m23743c(0, true, C4718a.m23741a(this.f20563C, "", "", 0, str, "videos/mp4", this.f20566F, "", null), this.f20586p, this.f20579i);
                return;
            }
        }
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        C0304c1 c0304c1 = new C0304c1(this.f20579i, view);
        c0304c1.m1276c().inflate(2131689489, c0304c1.m1275b());
        ArrayList<ExternalPlayerModelClass> m15132o = new ExternalPlayerDataBase(this.f20579i).m15132o();
        if (m15132o != null) {
            try {
                if (m15132o.size() > 0) {
                    c0304c1.m1275b().add(0, 0, 0, this.f20579i.getResources().getString(2132018170));
                    ExternalPlayerModelClass externalPlayerModelClass = new ExternalPlayerModelClass();
                    externalPlayerModelClass.m15419e(0);
                    externalPlayerModelClass.m15418d(this.f20579i.getResources().getString(2132018328));
                    arrayList.add(externalPlayerModelClass);
                    int i10 = 0;
                    while (true) {
                        int i11 = i10;
                        if (i11 >= m15132o.size()) {
                            c0304c1.m1279f(new C3494k(this, arrayList, str));
                            c0304c1.m1278e(new C3495l(this));
                            c0304c1.m1280g();
                            return;
                        }
                        Menu m1275b = c0304c1.m1275b();
                        int i12 = i11 + 1;
                        m1275b.add(0, i12, 0, this.f20579i.getResources().getString(2132018328) + " " + m15132o.get(i11).m15415a());
                        arrayList.add(m15132o.get(i11));
                        i10 = i12;
                    }
                }
            } catch (Exception e11) {
                return;
            }
        }
        C5255e.m26219V(this.f20579i, "", 0, "series", this.f20562B, "0", this.f20563C, null, str);
    }

    /* renamed from: T0 */
    public final void m17450T0(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, ArrayList<SeriesDBModel> arrayList, List<GetEpisdoeDetailsCallback> list, int i11) {
        if (i11 == 1) {
            C0304c1 c0304c1 = new C0304c1(this.f20579i, ((ContinueWatchingViewHolder) abstractC0674e0).cardView);
            c0304c1.m1277d(2131689481);
            if (this.f20581k.m15112o(C5255e.m26215R(list.get(i10).m14966r()), list.get(i10).m14950b(), "series", SharepreferenceDBHandler.m15337A(this.f20579i)).size() > 0) {
                c0304c1.m1275b().getItem(0).setVisible(false);
                c0304c1.m1275b().getItem(1).setVisible(true);
            } else {
                c0304c1.m1275b().getItem(0).setVisible(true);
                c0304c1.m1275b().getItem(1).setVisible(false);
            }
            c0304c1.m1279f(new C3496m(this, abstractC0674e0, i10, arrayList, list, i11));
            c0304c1.m1280g();
        }
    }

    /* renamed from: U0 */
    public final void m17451U0(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, ArrayList<SeriesDBModel> arrayList, List<GetEpisdoeDetailsCallback> list, int i11) {
        ImageView imageView;
        if (i11 == 1) {
            this.f20581k.m15115t(C5255e.m26215R(list.get(i10).m14966r()), list.get(i10).m14950b(), "series", list.get(i10).m14967s(), SharepreferenceDBHandler.m15337A(this.f20579i));
            imageView = ((ContinueWatchingViewHolder) abstractC0674e0).ivFavourite;
        } else {
            this.f20581k.m15115t(arrayList.get(i10).m15051r(), arrayList.get(i10).m15035b(), "series", arrayList.get(i10).m15037d(), SharepreferenceDBHandler.m15337A(this.f20579i));
            imageView = ((ViewHolder) abstractC0674e0).ivFavourite;
        }
        imageView.setVisibility(4);
    }

    /* renamed from: V0 */
    public final void m17452V0(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, ArrayList<SeriesDBModel> arrayList) {
        this.f20573M.m15188R0(arrayList.get(i10).m15041h(), SharepreferenceDBHandler.m15337A(this.f20579i));
        ((ViewHolder) abstractC0674e0).ivFavourite.setVisibility(4);
    }

    /* renamed from: W0 */
    public void m17453W0() {
        this.f20570J = false;
    }

    /* renamed from: X0 */
    public final void m17454X0(JSONObject jSONObject, String str) {
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
                    this.f20592v = string;
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
                    this.f20592v = string2;
                    seasonsDetailCallback.m15019f(string2);
                }
            } catch (Exception e11) {
                seasonsDetailCallback.m15019f("");
            }
            this.f20591u.add(seasonsDetailCallback);
        } catch (Exception e12) {
        }
    }

    /* renamed from: Y0 */
    public final void m17455Y0() {
        ProgressDialog progressDialog = new ProgressDialog(this.f20579i);
        this.f20568H = progressDialog;
        progressDialog.setCanceledOnTouchOutside(false);
        this.f20568H.setMessage(this.f20579i.getResources().getString(2132018352));
        this.f20568H.show();
    }

    /* renamed from: Z0 */
    public final void m17456Z0(String str, String str2, String str3, int i10, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i11) {
        if (this.f20579i != null) {
            Intent intent = new Intent(this.f20579i, (Class<?>) SeriesDetailActivity.class);
            intent.putExtra("series_num", str);
            intent.putExtra("series_name", str2);
            intent.putExtra("series_streamType", str3);
            intent.putExtra("series_seriesID", String.valueOf(i10));
            intent.putExtra("series_cover", str4);
            intent.putExtra("series_plot", str5);
            intent.putExtra("series_cast", str6);
            intent.putExtra("series_director", str7);
            intent.putExtra("series_genre", str8);
            intent.putExtra("series_releaseDate", str9);
            intent.putExtra("series_last_modified", str10);
            intent.putExtra("series_rating", str11);
            intent.putExtra("series_categoryId", str12);
            intent.putExtra("series_youtube_trailer", str13);
            intent.putExtra("series_backdrop", str14);
            C5251a.f30022U = i11;
            this.f20579i.startActivity(intent);
        }
    }

    @Override // p324sf.InterfaceC8572k
    /* renamed from: a0 */
    public void mo16611a0(AbstractC5557j abstractC5557j) {
        if (abstractC5557j != null) {
            try {
                JSONObject jSONObject = new JSONObject(abstractC5557j.toString());
                String string = jSONObject.getString("seasons");
                String string2 = jSONObject.getString("episodes");
                if (!string.equals("[]")) {
                    try {
                        JSONArray jSONArray = jSONObject.getJSONArray("seasons");
                        int length = jSONArray.length();
                        this.f20590t.clear();
                        for (int i10 = 0; i10 < length; i10++) {
                            if (jSONArray.get(i10) instanceof JSONObject) {
                                m17454X0((JSONObject) jSONArray.get(i10), String.valueOf(i10));
                            }
                        }
                    } catch (Exception e10) {
                    }
                    try {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("seasons");
                        Iterator<String> keys = jSONObject2.keys();
                        this.f20591u.clear();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            if (jSONObject2.get(next) instanceof JSONObject) {
                                m17454X0(jSONObject2, next);
                            }
                        }
                    } catch (Exception e11) {
                    }
                }
                if (!string2.equals("[]")) {
                    try {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("episodes");
                        int length2 = jSONArray2.length();
                        this.f20590t.clear();
                        for (int i11 = 0; i11 < length2; i11++) {
                            if (jSONArray2.get(i11) instanceof JSONArray) {
                                JSONArray jSONArray3 = new JSONArray(jSONArray2.get(i11).toString());
                                m17445O0(jSONArray3, jSONArray3.length());
                            }
                        }
                    } catch (Exception e12) {
                    }
                    JSONObject jSONObject3 = jSONObject.getJSONObject("episodes");
                    this.f20590t.clear();
                    Iterator<String> keys2 = jSONObject3.keys();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        if (jSONObject3.get(next2) instanceof JSONArray) {
                            JSONArray jSONArray4 = new JSONArray(jSONObject3.get(next2).toString());
                            m17445O0(jSONArray4, jSONArray4.length());
                        }
                    }
                }
            } catch (Exception e13) {
            }
        }
        ArrayList<GetEpisdoeDetailsCallback> arrayList = this.f20590t;
        if (arrayList != null && arrayList.size() != 0) {
            EpisodesUsingSinglton.m14753c().m14758f(this.f20590t);
            this.f20572L.clear();
            for (int i12 = 0; i12 < this.f20590t.size(); i12++) {
                if (this.f20590t.get(i12).m14964p().equals(Integer.valueOf(this.f20565E))) {
                    this.f20572L.add(this.f20590t.get(i12));
                }
            }
            ArrayList<GetEpisdoeDetailsCallback> arrayList2 = this.f20572L;
            if (arrayList2 != null && arrayList2.size() > 0) {
                EpisodesUsingSinglton.m14753c().m14757e(this.f20572L);
            }
        }
        m17447Q0();
        if (this.f20587q.equals("mobile")) {
            try {
                this.f20586p = C5938b.m29235e(this.f20579i).m29243c().m29358c();
            } catch (Exception e14) {
            }
        }
        C5947e c5947e = this.f20586p;
        if (c5947e != null && c5947e.m29348c()) {
            String str = this.f20579i.getResources().getString(2132018529) + " - " + this.f20565E;
            String m26202E = C5255e.m26202E(this.f20579i, C5255e.m26215R(this.f20564D), this.f20562B, "series");
            C5947e c5947e2 = this.f20586p;
            if (((c5947e2 == null || c5947e2.m29290r() == null || this.f20586p.m29290r().m31009j() == null || this.f20586p.m29290r().m31009j().m13058R() == null) ? "" : this.f20586p.m29290r().m31009j().m13058R()).equals(m26202E)) {
                this.f20579i.startActivity(new Intent(this.f20579i, (Class<?>) ExpandedControlsActivity.class));
                return;
            } else {
                C4718a.m23743c(C5255e.m26215R(this.f20567G), true, C4718a.m23741a(this.f20563C, str, "", 0, m26202E, "videos/mp4", this.f20566F, "", null), this.f20586p, this.f20579i);
                return;
            }
        }
        new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        C0304c1 c0304c1 = new C0304c1(this.f20579i, this.f20574N);
        c0304c1.m1276c().inflate(2131689489, c0304c1.m1275b());
        ArrayList<ExternalPlayerModelClass> m15132o = new ExternalPlayerDataBase(this.f20579i).m15132o();
        if (m15132o != null) {
            try {
                if (m15132o.size() > 0) {
                    c0304c1.m1275b().add(0, 0, 0, this.f20579i.getResources().getString(2132018170));
                    ExternalPlayerModelClass externalPlayerModelClass = new ExternalPlayerModelClass();
                    externalPlayerModelClass.m15419e(0);
                    externalPlayerModelClass.m15418d(this.f20579i.getResources().getString(2132018328));
                    arrayList3.add(externalPlayerModelClass);
                    int i13 = 0;
                    while (true) {
                        int i14 = i13;
                        if (i14 >= m15132o.size()) {
                            c0304c1.m1279f(new C3497n(this, arrayList3));
                            c0304c1.m1278e(new C3498o(this));
                            c0304c1.m1280g();
                            return;
                        }
                        Menu m1275b = c0304c1.m1275b();
                        int i15 = i14 + 1;
                        m1275b.add(0, i15, 0, this.f20579i.getResources().getString(2132018328) + " " + m15132o.get(i14).m15415a());
                        arrayList3.add(m15132o.get(i14));
                        i13 = i15;
                    }
                }
            } catch (Exception e15) {
                return;
            }
        }
        C5255e.m26219V(this.f20579i, "", C5255e.m26215R(this.f20564D), "series", this.f20562B, "0", this.f20563C, null, "");
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: b */
    public void mo15997b() {
        m17447Q0();
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: c */
    public void mo15998c(String str) {
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.f20583m.equals("continue_watching") ? this.f20585o : this.f20584n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        if (this.f20583m.equals("continue_watching")) {
            List<GetEpisdoeDetailsCallback> list = this.f20578h;
            if (list == null || list.size() <= 0) {
                return 0;
            }
            return this.f20578h.size();
        }
        ArrayList<SeriesDBModel> arrayList = this.f20576f;
        if (arrayList == null || arrayList.size() <= 0) {
            return 0;
        }
        return this.f20576f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: q */
    public int mo3018q(int i10) {
        return this.f20583m.equals("continue_watching") ? 1 : 0;
    }
}

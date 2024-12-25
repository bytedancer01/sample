package com.maxdigitall.maxdigitaliptvbox.view.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
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
import com.maxdigitall.maxdigitaliptvbox.miscelleneious.chromecastfeature.ExpandedControlsActivity;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteM3UModel;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.VodAllCategoriesSingleton;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.RecentWatchDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsTMDBActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.VodAllDataSingleActivity;
import java.util.ArrayList;
import java.util.List;
import nf.C6783a;
import org.jetbrains.annotations.NotNull;
import p082ef.C4718a;
import p151if.C5251a;
import p151if.C5255e;
import p216m9.C5938b;
import p216m9.C5947e;
import p316s2.C8522c;
import p428yg.C10014t;
import p428yg.InterfaceC9996e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter.class */
public class VodAllDataRightSideAdapter extends RecyclerView.AbstractC0677h<RecyclerView.AbstractC0674e0> implements Filterable {

    /* renamed from: B */
    public RecentWatchDBHandler f21168B;

    /* renamed from: C */
    public LiveStreamDBHandler f21169C;

    /* renamed from: i */
    public Context f21174i;

    /* renamed from: k */
    public DatabaseHandler f21176k;

    /* renamed from: l */
    public Animation f21177l;

    /* renamed from: m */
    public String f21178m;

    /* renamed from: p */
    public String f21181p;

    /* renamed from: t */
    public SharedPreferences f21185t;

    /* renamed from: u */
    public C5947e f21186u;

    /* renamed from: j */
    public Boolean f21175j = Boolean.FALSE;

    /* renamed from: n */
    public C3573t f21179n = new C3573t(this, null);

    /* renamed from: o */
    public C3574u f21180o = new C3574u(this, null);

    /* renamed from: q */
    public String f21182q = "";

    /* renamed from: r */
    public boolean f21183r = false;

    /* renamed from: s */
    public int f21184s = -1;

    /* renamed from: v */
    public String f21187v = "";

    /* renamed from: w */
    public String f21188w = "0";

    /* renamed from: x */
    public String f21189x = "";

    /* renamed from: y */
    public String f21190y = "";

    /* renamed from: z */
    public String f21191z = "";

    /* renamed from: A */
    public int f21167A = 0;

    /* renamed from: e */
    public final ArrayList<LiveStreamsDBModel> f21170e = VodAllCategoriesSingleton.m14909b().m14915g();

    /* renamed from: f */
    public ArrayList<LiveStreamsDBModel> f21171f = VodAllCategoriesSingleton.m14909b().m14915g();

    /* renamed from: g */
    public final ArrayList<LiveStreamsDBModel> f21172g = VodAllCategoriesSingleton.m14909b().m14910a();

    /* renamed from: h */
    public ArrayList<LiveStreamsDBModel> f21173h = VodAllCategoriesSingleton.m14909b().m14910a();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$ContinueWatchingViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$ContinueWatchingViewHolder.class */
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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$ContinueWatchingViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$ContinueWatchingViewHolder_ViewBinding.class */
    public class ContinueWatchingViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public ContinueWatchingViewHolder f21192b;

        public ContinueWatchingViewHolder_ViewBinding(ContinueWatchingViewHolder continueWatchingViewHolder, View view) {
            this.f21192b = continueWatchingViewHolder;
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
            ContinueWatchingViewHolder continueWatchingViewHolder = this.f21192b;
            if (continueWatchingViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f21192b = null;
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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$ViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$ViewHolder.class */
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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$ViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$ViewHolder_ViewBinding.class */
    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public ViewHolder f21193b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f21193b = viewHolder;
            viewHolder.SeriesName = (TextView) C8522c.m36739c(view, 2131429602, "field 'SeriesName'", TextView.class);
            viewHolder.Movie = (RelativeLayout) C8522c.m36739c(view, 2131429012, "field 'Movie'", RelativeLayout.class);
            viewHolder.MovieImage = (ImageView) C8522c.m36739c(view, 2131428200, "field 'MovieImage'", ImageView.class);
            viewHolder.cardView = (CardView) C8522c.m36739c(view, 2131427703, "field 'cardView'", CardView.class);
            viewHolder.tvStreamOptions = (TextView) C8522c.m36739c(view, 2131429619, "field 'tvStreamOptions'", TextView.class);
            viewHolder.ivFavourite = (ImageView) C8522c.m36739c(view, 2131428179, "field 'ivFavourite'", ImageView.class);
            viewHolder.cv_rating = (CardView) C8522c.m36739c(view, 2131427812, "field 'cv_rating'", CardView.class);
            viewHolder.tv_rating = (TextView) C8522c.m36739c(view, 2131429580, "field 'tv_rating'", TextView.class);
            viewHolder.llMenu = (LinearLayout) C8522c.m36739c(view, 2131428441, "field 'llMenu'", LinearLayout.class);
        }

        @Override // butterknife.Unbinder
        /* renamed from: a */
        public void mo5629a() {
            ViewHolder viewHolder = this.f21193b;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f21193b = null;
            viewHolder.SeriesName = null;
            viewHolder.Movie = null;
            viewHolder.MovieImage = null;
            viewHolder.cardView = null;
            viewHolder.tvStreamOptions = null;
            viewHolder.ivFavourite = null;
            viewHolder.cv_rating = null;
            viewHolder.tv_rating = null;
            viewHolder.llMenu = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAllDataRightSideAdapter$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$a.class */
    public class C3554a implements InterfaceC9996e {

        /* renamed from: a */
        public final ContinueWatchingViewHolder f21194a;

        /* renamed from: b */
        public final VodAllDataRightSideAdapter f21195b;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$a$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAllDataRightSideAdapter$a$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$a$a.class */
        public class a implements InterfaceC9996e {

            /* renamed from: a */
            public final C3554a f21196a;

            public a(C3554a c3554a) {
                this.f21196a = c3554a;
            }

            @Override // p428yg.InterfaceC9996e
            /* renamed from: a */
            public void mo15848a() {
            }

            @Override // p428yg.InterfaceC9996e
            public void onSuccess() {
            }
        }

        public C3554a(VodAllDataRightSideAdapter vodAllDataRightSideAdapter, ContinueWatchingViewHolder continueWatchingViewHolder) {
            this.f21195b = vodAllDataRightSideAdapter;
            this.f21194a = continueWatchingViewHolder;
        }

        @Override // p428yg.InterfaceC9996e
        /* renamed from: a */
        public void mo15848a() {
            C10014t.m42105q(this.f21195b.f21174i).m42116l(String.valueOf(this.f21195b.f21174i.getResources().getDrawable(2131231769))).m42149e().m42145a().m42152h(this.f21194a.MovieImage, new a(this));
            this.f21194a.SeriesName.setVisibility(0);
        }

        @Override // p428yg.InterfaceC9996e
        public void onSuccess() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAllDataRightSideAdapter$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$b.class */
    public class C3555b implements InterfaceC9996e {

        /* renamed from: a */
        public final ViewHolder f21197a;

        /* renamed from: b */
        public final VodAllDataRightSideAdapter f21198b;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$b$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAllDataRightSideAdapter$b$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$b$a.class */
        public class a implements InterfaceC9996e {

            /* renamed from: a */
            public final C3555b f21199a;

            public a(C3555b c3555b) {
                this.f21199a = c3555b;
            }

            @Override // p428yg.InterfaceC9996e
            /* renamed from: a */
            public void mo15848a() {
            }

            @Override // p428yg.InterfaceC9996e
            public void onSuccess() {
            }
        }

        public C3555b(VodAllDataRightSideAdapter vodAllDataRightSideAdapter, ViewHolder viewHolder) {
            this.f21198b = vodAllDataRightSideAdapter;
            this.f21197a = viewHolder;
        }

        @Override // p428yg.InterfaceC9996e
        /* renamed from: a */
        public void mo15848a() {
            C10014t.m42105q(this.f21198b.f21174i).m42116l(String.valueOf(this.f21198b.f21174i.getResources().getDrawable(2131231769))).m42149e().m42145a().m42152h(this.f21197a.MovieImage, new a(this));
            this.f21197a.SeriesName.setVisibility(0);
        }

        @Override // p428yg.InterfaceC9996e
        public void onSuccess() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAllDataRightSideAdapter$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$c.class */
    public class C3556c implements InterfaceC9996e {

        /* renamed from: a */
        public final VodAllDataRightSideAdapter f21200a;

        public C3556c(VodAllDataRightSideAdapter vodAllDataRightSideAdapter) {
            this.f21200a = vodAllDataRightSideAdapter;
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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAllDataRightSideAdapter$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$d.class */
    public class C3557d implements InterfaceC9996e {

        /* renamed from: a */
        public final VodAllDataRightSideAdapter f21201a;

        public C3557d(VodAllDataRightSideAdapter vodAllDataRightSideAdapter) {
            this.f21201a = vodAllDataRightSideAdapter;
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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAllDataRightSideAdapter$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$e.class */
    public class ViewOnClickListenerC3558e implements View.OnClickListener {

        /* renamed from: b */
        public final int f21202b;

        /* renamed from: c */
        public final String f21203c;

        /* renamed from: d */
        public final String f21204d;

        /* renamed from: e */
        public final String f21205e;

        /* renamed from: f */
        public final String f21206f;

        /* renamed from: g */
        public final String f21207g;

        /* renamed from: h */
        public final String f21208h;

        /* renamed from: i */
        public final String f21209i;

        /* renamed from: j */
        public final String f21210j;

        /* renamed from: k */
        public final int f21211k;

        /* renamed from: l */
        public final VodAllDataRightSideAdapter f21212l;

        public ViewOnClickListenerC3558e(VodAllDataRightSideAdapter vodAllDataRightSideAdapter, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11) {
            this.f21212l = vodAllDataRightSideAdapter;
            this.f21202b = i10;
            this.f21203c = str;
            this.f21204d = str2;
            this.f21205e = str3;
            this.f21206f = str4;
            this.f21207g = str5;
            this.f21208h = str6;
            this.f21209i = str7;
            this.f21210j = str8;
            this.f21211k = i11;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f21212l.m17600M0(this.f21202b, this.f21203c, this.f21204d, this.f21205e, this.f21206f, this.f21207g, this.f21208h, this.f21209i, this.f21210j, this.f21211k);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAllDataRightSideAdapter$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$f.class */
    public class ViewOnClickListenerC3559f implements View.OnClickListener {

        /* renamed from: b */
        public final int f21213b;

        /* renamed from: c */
        public final String f21214c;

        /* renamed from: d */
        public final String f21215d;

        /* renamed from: e */
        public final String f21216e;

        /* renamed from: f */
        public final String f21217f;

        /* renamed from: g */
        public final String f21218g;

        /* renamed from: h */
        public final String f21219h;

        /* renamed from: i */
        public final String f21220i;

        /* renamed from: j */
        public final String f21221j;

        /* renamed from: k */
        public final int f21222k;

        /* renamed from: l */
        public final VodAllDataRightSideAdapter f21223l;

        public ViewOnClickListenerC3559f(VodAllDataRightSideAdapter vodAllDataRightSideAdapter, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11) {
            this.f21223l = vodAllDataRightSideAdapter;
            this.f21213b = i10;
            this.f21214c = str;
            this.f21215d = str2;
            this.f21216e = str3;
            this.f21217f = str4;
            this.f21218g = str5;
            this.f21219h = str6;
            this.f21220i = str7;
            this.f21221j = str8;
            this.f21222k = i11;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f21223l.m17600M0(this.f21213b, this.f21214c, this.f21215d, this.f21216e, this.f21217f, this.f21218g, this.f21219h, this.f21220i, this.f21221j, this.f21222k);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAllDataRightSideAdapter$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$g.class */
    public class ViewOnClickListenerC3560g implements View.OnClickListener {

        /* renamed from: b */
        public final int f21224b;

        /* renamed from: c */
        public final String f21225c;

        /* renamed from: d */
        public final String f21226d;

        /* renamed from: e */
        public final String f21227e;

        /* renamed from: f */
        public final String f21228f;

        /* renamed from: g */
        public final String f21229g;

        /* renamed from: h */
        public final String f21230h;

        /* renamed from: i */
        public final String f21231i;

        /* renamed from: j */
        public final String f21232j;

        /* renamed from: k */
        public final int f21233k;

        /* renamed from: l */
        public final VodAllDataRightSideAdapter f21234l;

        public ViewOnClickListenerC3560g(VodAllDataRightSideAdapter vodAllDataRightSideAdapter, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11) {
            this.f21234l = vodAllDataRightSideAdapter;
            this.f21224b = i10;
            this.f21225c = str;
            this.f21226d = str2;
            this.f21227e = str3;
            this.f21228f = str4;
            this.f21229g = str5;
            this.f21230h = str6;
            this.f21231i = str7;
            this.f21232j = str8;
            this.f21233k = i11;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f21234l.m17600M0(this.f21224b, this.f21225c, this.f21226d, this.f21227e, this.f21228f, this.f21229g, this.f21230h, this.f21231i, this.f21232j, this.f21233k);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAllDataRightSideAdapter$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$h.class */
    public class ViewOnLongClickListenerC3561h implements View.OnLongClickListener {

        /* renamed from: b */
        public final String f21235b;

        /* renamed from: c */
        public final ViewHolder f21236c;

        /* renamed from: d */
        public final int f21237d;

        /* renamed from: e */
        public final int f21238e;

        /* renamed from: f */
        public final String f21239f;

        /* renamed from: g */
        public final int f21240g;

        /* renamed from: h */
        public final VodAllDataRightSideAdapter f21241h;

        public ViewOnLongClickListenerC3561h(VodAllDataRightSideAdapter vodAllDataRightSideAdapter, String str, ViewHolder viewHolder, int i10, int i11, String str2, int i12) {
            this.f21241h = vodAllDataRightSideAdapter;
            this.f21235b = str;
            this.f21236c = viewHolder;
            this.f21237d = i10;
            this.f21238e = i11;
            this.f21239f = str2;
            this.f21240g = i12;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (SharepreferenceDBHandler.m15373f(this.f21241h.f21174i).equals("m3u")) {
                ArrayList<FavouriteM3UModel> m15159E0 = this.f21241h.f21169C.m15159E0(this.f21235b, SharepreferenceDBHandler.m15337A(this.f21241h.f21174i));
                VodAllDataRightSideAdapter vodAllDataRightSideAdapter = this.f21241h;
                vodAllDataRightSideAdapter.m17592E0(m15159E0, this.f21236c, this.f21237d, vodAllDataRightSideAdapter.f21171f);
                return true;
            }
            ArrayList<FavouriteDBModel> m15112o = this.f21241h.f21176k.m15112o(this.f21238e, this.f21239f, "vod", SharepreferenceDBHandler.m15337A(this.f21241h.f21174i));
            VodAllDataRightSideAdapter vodAllDataRightSideAdapter2 = this.f21241h;
            vodAllDataRightSideAdapter2.m17591D0(m15112o, this.f21236c, this.f21237d, vodAllDataRightSideAdapter2.f21171f, this.f21241h.f21173h, this.f21240g, this.f21236c.Movie);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAllDataRightSideAdapter$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$i.class */
    public class ViewOnLongClickListenerC3562i implements View.OnLongClickListener {

        /* renamed from: b */
        public final String f21242b;

        /* renamed from: c */
        public final ViewHolder f21243c;

        /* renamed from: d */
        public final int f21244d;

        /* renamed from: e */
        public final int f21245e;

        /* renamed from: f */
        public final String f21246f;

        /* renamed from: g */
        public final int f21247g;

        /* renamed from: h */
        public final VodAllDataRightSideAdapter f21248h;

        public ViewOnLongClickListenerC3562i(VodAllDataRightSideAdapter vodAllDataRightSideAdapter, String str, ViewHolder viewHolder, int i10, int i11, String str2, int i12) {
            this.f21248h = vodAllDataRightSideAdapter;
            this.f21242b = str;
            this.f21243c = viewHolder;
            this.f21244d = i10;
            this.f21245e = i11;
            this.f21246f = str2;
            this.f21247g = i12;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (SharepreferenceDBHandler.m15373f(this.f21248h.f21174i).equals("m3u")) {
                ArrayList<FavouriteM3UModel> m15159E0 = this.f21248h.f21169C.m15159E0(this.f21242b, SharepreferenceDBHandler.m15337A(this.f21248h.f21174i));
                VodAllDataRightSideAdapter vodAllDataRightSideAdapter = this.f21248h;
                vodAllDataRightSideAdapter.m17592E0(m15159E0, this.f21243c, this.f21244d, vodAllDataRightSideAdapter.f21171f);
                return true;
            }
            ArrayList<FavouriteDBModel> m15112o = this.f21248h.f21176k.m15112o(this.f21245e, this.f21246f, "vod", SharepreferenceDBHandler.m15337A(this.f21248h.f21174i));
            VodAllDataRightSideAdapter vodAllDataRightSideAdapter2 = this.f21248h;
            vodAllDataRightSideAdapter2.m17591D0(m15112o, this.f21243c, this.f21244d, vodAllDataRightSideAdapter2.f21171f, this.f21248h.f21173h, this.f21247g, this.f21243c.Movie);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAllDataRightSideAdapter$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$j.class */
    public class ViewOnLongClickListenerC3563j implements View.OnLongClickListener {

        /* renamed from: b */
        public final String f21249b;

        /* renamed from: c */
        public final ViewHolder f21250c;

        /* renamed from: d */
        public final int f21251d;

        /* renamed from: e */
        public final int f21252e;

        /* renamed from: f */
        public final String f21253f;

        /* renamed from: g */
        public final int f21254g;

        /* renamed from: h */
        public final VodAllDataRightSideAdapter f21255h;

        public ViewOnLongClickListenerC3563j(VodAllDataRightSideAdapter vodAllDataRightSideAdapter, String str, ViewHolder viewHolder, int i10, int i11, String str2, int i12) {
            this.f21255h = vodAllDataRightSideAdapter;
            this.f21249b = str;
            this.f21250c = viewHolder;
            this.f21251d = i10;
            this.f21252e = i11;
            this.f21253f = str2;
            this.f21254g = i12;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (SharepreferenceDBHandler.m15373f(this.f21255h.f21174i).equals("m3u")) {
                ArrayList<FavouriteM3UModel> m15159E0 = this.f21255h.f21169C.m15159E0(this.f21249b, SharepreferenceDBHandler.m15337A(this.f21255h.f21174i));
                VodAllDataRightSideAdapter vodAllDataRightSideAdapter = this.f21255h;
                vodAllDataRightSideAdapter.m17592E0(m15159E0, this.f21250c, this.f21251d, vodAllDataRightSideAdapter.f21171f);
                return true;
            }
            ArrayList<FavouriteDBModel> m15112o = this.f21255h.f21176k.m15112o(this.f21252e, this.f21253f, "vod", SharepreferenceDBHandler.m15337A(this.f21255h.f21174i));
            VodAllDataRightSideAdapter vodAllDataRightSideAdapter2 = this.f21255h;
            vodAllDataRightSideAdapter2.m17591D0(m15112o, this.f21250c, this.f21251d, vodAllDataRightSideAdapter2.f21171f, this.f21255h.f21173h, this.f21254g, this.f21250c.Movie);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAllDataRightSideAdapter$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$k.class */
    public class C3564k implements C0304c1.d {

        /* renamed from: a */
        public final RecyclerView.AbstractC0674e0 f21256a;

        /* renamed from: b */
        public final int f21257b;

        /* renamed from: c */
        public final ArrayList f21258c;

        /* renamed from: d */
        public final ArrayList f21259d;

        /* renamed from: e */
        public final int f21260e;

        /* renamed from: f */
        public final VodAllDataRightSideAdapter f21261f;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$k$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAllDataRightSideAdapter$k$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$k$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final C3564k f21262b;

            public a(C3564k c3564k) {
                this.f21262b = c3564k;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f21262b.f21261f.m4099w();
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$k$b.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAllDataRightSideAdapter$k$b */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$k$b.class */
        public class b extends Dialog implements View.OnClickListener {

            /* renamed from: b */
            public Activity f21263b;

            /* renamed from: c */
            public TextView f21264c;

            /* renamed from: d */
            public TextView f21265d;

            /* renamed from: e */
            public TextView f21266e;

            /* renamed from: f */
            public LinearLayout f21267f;

            /* renamed from: g */
            public LinearLayout f21268g;

            /* renamed from: h */
            public final C3564k f21269h;

            /* JADX WARN: Classes with same name are omitted:
              classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$k$b$a.class
             */
            /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAllDataRightSideAdapter$k$b$a */
            /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$k$b$a.class */
            public class a implements Runnable {

                /* renamed from: b */
                public final b f21270b;

                public a(b bVar) {
                    this.f21270b = bVar;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (this.f21270b.f21269h.f21261f.f21174i instanceof VodAllDataSingleActivity) {
                        ((VodAllDataSingleActivity) this.f21270b.f21269h.f21261f.f21174i).m17007e1();
                    }
                }
            }

            /* JADX WARN: Classes with same name are omitted:
              classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$k$b$b.class
             */
            /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAllDataRightSideAdapter$k$b$b, reason: collision with other inner class name */
            /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$k$b$b.class */
            public class ViewOnFocusChangeListenerC10272b implements View.OnFocusChangeListener {

                /* renamed from: b */
                public View f21271b;

                /* renamed from: c */
                public final b f21272c;

                public ViewOnFocusChangeListenerC10272b(b bVar, View view) {
                    this.f21272c = bVar;
                    this.f21271b = view;
                }

                @Override // android.view.View.OnFocusChangeListener
                @SuppressLint({"ResourceType"})
                public void onFocusChange(View view, boolean z10) {
                    int i10;
                    LinearLayout linearLayout;
                    if (z10) {
                        View view2 = this.f21271b;
                        i10 = 2131230846;
                        if (view2 == null || view2.getTag() == null || !this.f21271b.getTag().equals("1")) {
                            View view3 = this.f21271b;
                            if (view3 == null || view3.getTag() == null || !this.f21271b.getTag().equals("2")) {
                                return;
                            }
                            linearLayout = this.f21272c.f21268g;
                        }
                        linearLayout = this.f21272c.f21267f;
                    } else {
                        View view4 = this.f21271b;
                        i10 = 2131230845;
                        if (view4 == null || view4.getTag() == null || !this.f21271b.getTag().equals("1")) {
                            View view5 = this.f21271b;
                            if (view5 == null || view5.getTag() == null || !this.f21271b.getTag().equals("2")) {
                                return;
                            }
                            linearLayout = this.f21272c.f21268g;
                        }
                        linearLayout = this.f21272c.f21267f;
                    }
                    linearLayout.setBackgroundResource(i10);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C3564k c3564k, Activity activity) {
                super(activity);
                this.f21269h = c3564k;
                this.f21263b = activity;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int id2 = view.getId();
                if (id2 == 2131427653) {
                    dismiss();
                } else if (id2 == 2131427681) {
                    try {
                        RecentWatchDBHandler recentWatchDBHandler = this.f21269h.f21261f.f21168B;
                        C3564k c3564k = this.f21269h;
                        recentWatchDBHandler.m15305F0(((LiveStreamsDBModel) c3564k.f21259d.get(c3564k.f21257b)).m14811R());
                        if (this.f21269h.f21261f.f21174i instanceof VodAllDataSingleActivity) {
                            ((VodAllDataSingleActivity) this.f21269h.f21261f.f21174i).m17012j1();
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
                setContentView(new C6783a(this.f21269h.f21261f.f21174i).m31288z().equals(C5251a.f30065s0) ? 2131624128 : 2131624127);
                this.f21264c = (TextView) findViewById(2131427681);
                this.f21265d = (TextView) findViewById(2131427653);
                this.f21267f = (LinearLayout) findViewById(2131428448);
                this.f21268g = (LinearLayout) findViewById(2131428541);
                TextView textView = (TextView) findViewById(2131429644);
                this.f21266e = textView;
                textView.setText(this.f21269h.f21261f.f21174i.getResources().getString(2132018832));
                this.f21264c.setOnClickListener(this);
                this.f21265d.setOnClickListener(this);
                TextView textView2 = this.f21264c;
                textView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC10272b(this, textView2));
                TextView textView3 = this.f21265d;
                textView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC10272b(this, textView3));
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$k$c.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAllDataRightSideAdapter$k$c */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$k$c.class */
        public class c implements Runnable {

            /* renamed from: b */
            public final C3564k f21273b;

            public c(C3564k c3564k) {
                this.f21273b = c3564k;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f21273b.f21261f.m4099w();
            }
        }

        public C3564k(VodAllDataRightSideAdapter vodAllDataRightSideAdapter, RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, ArrayList arrayList, ArrayList arrayList2, int i11) {
            this.f21261f = vodAllDataRightSideAdapter;
            this.f21256a = abstractC0674e0;
            this.f21257b = i10;
            this.f21258c = arrayList;
            this.f21259d = arrayList2;
            this.f21260e = i11;
        }

        @Override // androidx.appcompat.widget.C0304c1.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId == 2131428641) {
                new b(this, (VodAllDataSingleActivity) this.f21261f.f21174i).show();
                return false;
            }
            if (itemId == 2131428754) {
                this.f21261f.m17589B0(this.f21256a, this.f21257b, this.f21258c, this.f21259d, this.f21260e);
                new Handler().postDelayed(new a(this), 300L);
                if (!(this.f21261f.f21174i instanceof VodAllDataSingleActivity)) {
                    return false;
                }
            } else {
                if (itemId != 2131428775) {
                    return false;
                }
                this.f21261f.m17597J0(this.f21256a, this.f21257b, this.f21258c, this.f21259d, this.f21260e);
                new Handler().postDelayed(new c(this), 300L);
                if (!(this.f21261f.f21174i instanceof VodAllDataSingleActivity)) {
                    return false;
                }
            }
            ((VodAllDataSingleActivity) this.f21261f.f21174i).m17007e1();
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$l.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAllDataRightSideAdapter$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$l.class */
    public class C3565l implements InterfaceC9996e {

        /* renamed from: a */
        public final VodAllDataRightSideAdapter f21274a;

        public C3565l(VodAllDataRightSideAdapter vodAllDataRightSideAdapter) {
            this.f21274a = vodAllDataRightSideAdapter;
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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$m.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAllDataRightSideAdapter$m */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$m.class */
    public class C3566m implements InterfaceC9996e {

        /* renamed from: a */
        public final VodAllDataRightSideAdapter f21275a;

        public C3566m(VodAllDataRightSideAdapter vodAllDataRightSideAdapter) {
            this.f21275a = vodAllDataRightSideAdapter;
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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$n.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAllDataRightSideAdapter$n */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$n.class */
    public class ViewOnClickListenerC3567n implements View.OnClickListener {

        /* renamed from: b */
        public final String f21276b;

        /* renamed from: c */
        public final String f21277c;

        /* renamed from: d */
        public final String f21278d;

        /* renamed from: e */
        public final String f21279e;

        /* renamed from: f */
        public final String f21280f;

        /* renamed from: g */
        public final String f21281g;

        /* renamed from: h */
        public final String f21282h;

        /* renamed from: i */
        public final int f21283i;

        /* renamed from: j */
        public final VodAllDataRightSideAdapter f21284j;

        public ViewOnClickListenerC3567n(VodAllDataRightSideAdapter vodAllDataRightSideAdapter, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10) {
            this.f21284j = vodAllDataRightSideAdapter;
            this.f21276b = str;
            this.f21277c = str2;
            this.f21278d = str3;
            this.f21279e = str4;
            this.f21280f = str5;
            this.f21281g = str6;
            this.f21282h = str7;
            this.f21283i = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f21284j.f21190y = String.valueOf(this.f21276b);
            this.f21284j.f21187v = this.f21277c;
            this.f21284j.f21191z = this.f21278d;
            this.f21284j.f21182q = this.f21279e;
            this.f21284j.f21188w = this.f21280f;
            this.f21284j.f21189x = this.f21281g;
            this.f21284j.f21167A = C5255e.m26215R(this.f21282h);
            C5251a.f30022U = this.f21283i;
            this.f21284j.m17595H0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$o.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAllDataRightSideAdapter$o */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$o.class */
    public class ViewOnClickListenerC3568o implements View.OnClickListener {

        /* renamed from: b */
        public final String f21285b;

        /* renamed from: c */
        public final String f21286c;

        /* renamed from: d */
        public final String f21287d;

        /* renamed from: e */
        public final String f21288e;

        /* renamed from: f */
        public final String f21289f;

        /* renamed from: g */
        public final String f21290g;

        /* renamed from: h */
        public final String f21291h;

        /* renamed from: i */
        public final int f21292i;

        /* renamed from: j */
        public final VodAllDataRightSideAdapter f21293j;

        public ViewOnClickListenerC3568o(VodAllDataRightSideAdapter vodAllDataRightSideAdapter, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10) {
            this.f21293j = vodAllDataRightSideAdapter;
            this.f21285b = str;
            this.f21286c = str2;
            this.f21287d = str3;
            this.f21288e = str4;
            this.f21289f = str5;
            this.f21290g = str6;
            this.f21291h = str7;
            this.f21292i = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f21293j.f21190y = String.valueOf(this.f21285b);
            this.f21293j.f21187v = this.f21286c;
            this.f21293j.f21191z = this.f21287d;
            this.f21293j.f21182q = this.f21288e;
            this.f21293j.f21188w = this.f21289f;
            this.f21293j.f21189x = this.f21290g;
            this.f21293j.f21167A = C5255e.m26215R(this.f21291h);
            C5251a.f30022U = this.f21292i;
            this.f21293j.m17595H0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$p.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAllDataRightSideAdapter$p */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$p.class */
    public class ViewOnClickListenerC3569p implements View.OnClickListener {

        /* renamed from: b */
        public final String f21294b;

        /* renamed from: c */
        public final String f21295c;

        /* renamed from: d */
        public final String f21296d;

        /* renamed from: e */
        public final String f21297e;

        /* renamed from: f */
        public final String f21298f;

        /* renamed from: g */
        public final String f21299g;

        /* renamed from: h */
        public final String f21300h;

        /* renamed from: i */
        public final int f21301i;

        /* renamed from: j */
        public final VodAllDataRightSideAdapter f21302j;

        public ViewOnClickListenerC3569p(VodAllDataRightSideAdapter vodAllDataRightSideAdapter, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10) {
            this.f21302j = vodAllDataRightSideAdapter;
            this.f21294b = str;
            this.f21295c = str2;
            this.f21296d = str3;
            this.f21297e = str4;
            this.f21298f = str5;
            this.f21299g = str6;
            this.f21300h = str7;
            this.f21301i = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f21302j.f21190y = String.valueOf(this.f21294b);
            this.f21302j.f21187v = this.f21295c;
            this.f21302j.f21191z = this.f21296d;
            this.f21302j.f21182q = this.f21297e;
            this.f21302j.f21188w = this.f21298f;
            this.f21302j.f21189x = this.f21299g;
            this.f21302j.f21167A = C5255e.m26215R(this.f21300h);
            C5251a.f30022U = this.f21301i;
            this.f21302j.m17595H0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$q.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAllDataRightSideAdapter$q */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$q.class */
    public class ViewOnLongClickListenerC3570q implements View.OnLongClickListener {

        /* renamed from: b */
        public final ContinueWatchingViewHolder f21303b;

        /* renamed from: c */
        public final int f21304c;

        /* renamed from: d */
        public final int f21305d;

        /* renamed from: e */
        public final VodAllDataRightSideAdapter f21306e;

        public ViewOnLongClickListenerC3570q(VodAllDataRightSideAdapter vodAllDataRightSideAdapter, ContinueWatchingViewHolder continueWatchingViewHolder, int i10, int i11) {
            this.f21306e = vodAllDataRightSideAdapter;
            this.f21303b = continueWatchingViewHolder;
            this.f21304c = i10;
            this.f21305d = i11;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            VodAllDataRightSideAdapter vodAllDataRightSideAdapter = this.f21306e;
            vodAllDataRightSideAdapter.m17596I0(this.f21303b, this.f21304c, vodAllDataRightSideAdapter.f21171f, this.f21306e.f21173h, this.f21305d);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$r.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAllDataRightSideAdapter$r */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$r.class */
    public class ViewOnLongClickListenerC3571r implements View.OnLongClickListener {

        /* renamed from: b */
        public final ContinueWatchingViewHolder f21307b;

        /* renamed from: c */
        public final int f21308c;

        /* renamed from: d */
        public final int f21309d;

        /* renamed from: e */
        public final VodAllDataRightSideAdapter f21310e;

        public ViewOnLongClickListenerC3571r(VodAllDataRightSideAdapter vodAllDataRightSideAdapter, ContinueWatchingViewHolder continueWatchingViewHolder, int i10, int i11) {
            this.f21310e = vodAllDataRightSideAdapter;
            this.f21307b = continueWatchingViewHolder;
            this.f21308c = i10;
            this.f21309d = i11;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            VodAllDataRightSideAdapter vodAllDataRightSideAdapter = this.f21310e;
            vodAllDataRightSideAdapter.m17596I0(this.f21307b, this.f21308c, vodAllDataRightSideAdapter.f21171f, this.f21310e.f21173h, this.f21309d);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$s.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAllDataRightSideAdapter$s */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$s.class */
    public class ViewOnLongClickListenerC3572s implements View.OnLongClickListener {

        /* renamed from: b */
        public final ContinueWatchingViewHolder f21311b;

        /* renamed from: c */
        public final int f21312c;

        /* renamed from: d */
        public final int f21313d;

        /* renamed from: e */
        public final VodAllDataRightSideAdapter f21314e;

        public ViewOnLongClickListenerC3572s(VodAllDataRightSideAdapter vodAllDataRightSideAdapter, ContinueWatchingViewHolder continueWatchingViewHolder, int i10, int i11) {
            this.f21314e = vodAllDataRightSideAdapter;
            this.f21311b = continueWatchingViewHolder;
            this.f21312c = i10;
            this.f21313d = i11;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            VodAllDataRightSideAdapter vodAllDataRightSideAdapter = this.f21314e;
            vodAllDataRightSideAdapter.m17596I0(this.f21311b, this.f21312c, vodAllDataRightSideAdapter.f21171f, this.f21314e.f21173h, this.f21313d);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$t.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAllDataRightSideAdapter$t */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$t.class */
    public class C3573t extends Filter {

        /* renamed from: a */
        public final VodAllDataRightSideAdapter f21315a;

        public C3573t(VodAllDataRightSideAdapter vodAllDataRightSideAdapter) {
            this.f21315a = vodAllDataRightSideAdapter;
        }

        public /* synthetic */ C3573t(VodAllDataRightSideAdapter vodAllDataRightSideAdapter, C3554a c3554a) {
            this(vodAllDataRightSideAdapter);
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = this.f21315a.f21170e;
            if (arrayList == null) {
                filterResults.values = null;
                filterResults.count = 0;
                return filterResults;
            }
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                LiveStreamsDBModel liveStreamsDBModel = (LiveStreamsDBModel) arrayList.get(i10);
                if (liveStreamsDBModel.getName().toLowerCase().contains(lowerCase) || liveStreamsDBModel.getName().contains(lowerCase)) {
                    arrayList2.add(liveStreamsDBModel);
                }
            }
            filterResults.values = arrayList2;
            filterResults.count = arrayList2.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            try {
                this.f21315a.f21171f = (ArrayList) filterResults.values;
                if (this.f21315a.f21171f != null) {
                    this.f21315a.m4099w();
                    if (this.f21315a.f21171f == null || this.f21315a.f21171f.size() != 0) {
                        ((VodAllDataSingleActivity) this.f21315a.f21174i).m17023s1();
                        ((VodAllDataSingleActivity) this.f21315a.f21174i).m16996S0();
                    } else {
                        ((VodAllDataSingleActivity) this.f21315a.f21174i).m17000X0();
                        ((VodAllDataSingleActivity) this.f21315a.f21174i).m17017o1(this.f21315a.f21174i.getResources().getString(2132018212));
                    }
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$u.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAllDataRightSideAdapter$u */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$u.class */
    public class C3574u extends Filter {

        /* renamed from: a */
        public final VodAllDataRightSideAdapter f21316a;

        public C3574u(VodAllDataRightSideAdapter vodAllDataRightSideAdapter) {
            this.f21316a = vodAllDataRightSideAdapter;
        }

        public /* synthetic */ C3574u(VodAllDataRightSideAdapter vodAllDataRightSideAdapter, C3554a c3554a) {
            this(vodAllDataRightSideAdapter);
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = this.f21316a.f21172g;
            if (arrayList == null) {
                filterResults.values = null;
                filterResults.count = 0;
                return filterResults;
            }
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                LiveStreamsDBModel liveStreamsDBModel = (LiveStreamsDBModel) arrayList.get(i10);
                if (liveStreamsDBModel.getName().toLowerCase().contains(lowerCase) || liveStreamsDBModel.getName().contains(lowerCase)) {
                    arrayList2.add(liveStreamsDBModel);
                }
            }
            filterResults.values = arrayList2;
            filterResults.count = arrayList2.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            try {
                this.f21316a.f21173h = (ArrayList) filterResults.values;
                if (this.f21316a.f21173h != null) {
                    this.f21316a.m4099w();
                    if (this.f21316a.f21173h.size() == 0) {
                        ((VodAllDataSingleActivity) this.f21316a.f21174i).m17000X0();
                        ((VodAllDataSingleActivity) this.f21316a.f21174i).m17017o1(this.f21316a.f21174i.getResources().getString(2132018212));
                    } else {
                        ((VodAllDataSingleActivity) this.f21316a.f21174i).m17023s1();
                        ((VodAllDataSingleActivity) this.f21316a.f21174i).m16996S0();
                    }
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$v.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAllDataRightSideAdapter$v */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAllDataRightSideAdapter$v.class */
    public class ViewOnFocusChangeListenerC3575v implements View.OnFocusChangeListener {

        /* renamed from: b */
        public int f21317b;

        /* renamed from: c */
        public final VodAllDataRightSideAdapter f21318c;

        public ViewOnFocusChangeListenerC3575v(VodAllDataRightSideAdapter vodAllDataRightSideAdapter, int i10) {
            this.f21318c = vodAllDataRightSideAdapter;
            this.f21317b = i10;
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            this.f21318c.f21184s = z10 ? this.f21317b : -1;
        }
    }

    public VodAllDataRightSideAdapter(Context context, String str) {
        this.f21178m = "";
        this.f21181p = "mobile";
        this.f21174i = context;
        this.f21176k = new DatabaseHandler(context);
        this.f21169C = new LiveStreamDBHandler(context);
        this.f21168B = new RecentWatchDBHandler(context);
        this.f21177l = AnimationUtils.loadAnimation(context, 2130771980);
        this.f21178m = str;
        if (new C6783a(context).m31288z().equals(C5251a.f30065s0)) {
            this.f21181p = "tv";
        } else {
            this.f21181p = "mobile";
        }
        if (this.f21181p.equals("mobile")) {
            try {
                this.f21186u = C5938b.m29235e(context).m29243c().m29358c();
            } catch (Exception e10) {
            }
        }
    }

    /* renamed from: B0 */
    public final void m17589B0(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, ArrayList<LiveStreamsDBModel> arrayList, List<LiveStreamsDBModel> list, int i11) {
        ImageView imageView;
        if (i11 == 1) {
            ContinueWatchingViewHolder continueWatchingViewHolder = (ContinueWatchingViewHolder) abstractC0674e0;
            FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
            favouriteDBModel.m14767h(list.get(i10).m14827g());
            favouriteDBModel.m14772m(C5255e.m26215R(list.get(i10).m14811R()));
            favouriteDBModel.m14770k(list.get(i10).getName());
            favouriteDBModel.m14771l(list.get(i10).m14805L());
            favouriteDBModel.m14774o(SharepreferenceDBHandler.m15337A(this.f21174i));
            this.f21176k.m15111l(favouriteDBModel, "vod");
            continueWatchingViewHolder.ivFavourite.startAnimation(this.f21177l);
            imageView = continueWatchingViewHolder.ivFavourite;
        } else {
            ViewHolder viewHolder = (ViewHolder) abstractC0674e0;
            FavouriteDBModel favouriteDBModel2 = new FavouriteDBModel();
            favouriteDBModel2.m14767h(arrayList.get(i10).m14827g());
            favouriteDBModel2.m14772m(C5255e.m26215R(arrayList.get(i10).m14811R()));
            favouriteDBModel2.m14770k(arrayList.get(i10).getName());
            favouriteDBModel2.m14771l(arrayList.get(i10).m14805L());
            favouriteDBModel2.m14774o(SharepreferenceDBHandler.m15337A(this.f21174i));
            this.f21176k.m15111l(favouriteDBModel2, "vod");
            viewHolder.ivFavourite.startAnimation(this.f21177l);
            imageView = viewHolder.ivFavourite;
        }
        imageView.setVisibility(0);
    }

    /* renamed from: C0 */
    public final void m17590C0(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, ArrayList<LiveStreamsDBModel> arrayList) {
        ViewHolder viewHolder = (ViewHolder) abstractC0674e0;
        FavouriteM3UModel favouriteM3UModel = new FavouriteM3UModel();
        favouriteM3UModel.m14782h(arrayList.get(i10).m14816W());
        favouriteM3UModel.m14783i(SharepreferenceDBHandler.m15337A(this.f21174i));
        favouriteM3UModel.m14781g(arrayList.get(i10).getName());
        favouriteM3UModel.m14779e(arrayList.get(i10).m14827g());
        this.f21169C.m15156D0(favouriteM3UModel);
        viewHolder.ivFavourite.startAnimation(this.f21177l);
        viewHolder.ivFavourite.setVisibility(0);
    }

    /* renamed from: D0 */
    public final void m17591D0(ArrayList<FavouriteDBModel> arrayList, RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, ArrayList<LiveStreamsDBModel> arrayList2, List<LiveStreamsDBModel> list, int i11, RelativeLayout relativeLayout) {
        if (arrayList.size() > 0) {
            m17597J0(abstractC0674e0, i10, arrayList2, list, i11);
        } else {
            m17589B0(abstractC0674e0, i10, arrayList2, list, i11);
        }
        this.f21183r = true;
        Context context = this.f21174i;
        if (context instanceof VodAllDataSingleActivity) {
            ((VodAllDataSingleActivity) context).m17007e1();
        }
    }

    /* renamed from: E0 */
    public final void m17592E0(ArrayList<FavouriteM3UModel> arrayList, RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, ArrayList<LiveStreamsDBModel> arrayList2) {
        if (arrayList.size() > 0) {
            m17598K0(abstractC0674e0, i10, arrayList2);
        } else {
            m17590C0(abstractC0674e0, i10, arrayList2);
        }
        this.f21183r = true;
        Context context = this.f21174i;
        if (context instanceof VodAllDataSingleActivity) {
            ((VodAllDataSingleActivity) context).m17007e1();
        }
    }

    /* renamed from: F0 */
    public boolean m17593F0() {
        return this.f21183r;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x05e2 A[Catch: Exception -> 0x0773, TryCatch #7 {Exception -> 0x0773, blocks: (B:5:0x0028, B:7:0x0033, B:9:0x003b, B:11:0x0042, B:14:0x00e7, B:17:0x0100, B:19:0x010a, B:21:0x0114, B:33:0x0171, B:35:0x0184, B:40:0x024a, B:42:0x0268, B:44:0x027c, B:46:0x034b, B:48:0x0351, B:49:0x0273, B:37:0x020b, B:39:0x0201, B:54:0x01c4, B:64:0x0128, B:65:0x00f2, B:67:0x0367, B:72:0x0386, B:74:0x038f, B:76:0x0396, B:78:0x039f, B:80:0x03cf, B:81:0x03dd, B:83:0x03e5, B:84:0x03f1, B:86:0x03f9, B:87:0x0407, B:163:0x0413, B:90:0x042b, B:92:0x0433, B:93:0x0441, B:95:0x0449, B:96:0x0457, B:98:0x045f, B:99:0x046d, B:101:0x0475, B:102:0x0483, B:105:0x04a9, B:107:0x04b2, B:108:0x04c8, B:110:0x04d2, B:112:0x04dc, B:114:0x04ef, B:115:0x0505, B:120:0x05d2, B:122:0x05e2, B:124:0x05f8, B:126:0x0601, B:127:0x0649, B:141:0x060a, B:143:0x0616, B:145:0x0631, B:147:0x063d, B:117:0x058e, B:119:0x0587, B:153:0x0546, B:154:0x04f8, B:156:0x04bb, B:150:0x0513, B:51:0x0190), top: B:2:0x0020, inners: #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0730 A[Catch: Exception -> 0x0756, TRY_LEAVE, TryCatch #4 {Exception -> 0x0756, blocks: (B:130:0x0655, B:132:0x0730), top: B:129:0x0655 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0616 A[Catch: Exception -> 0x0773, TRY_ENTER, TryCatch #7 {Exception -> 0x0773, blocks: (B:5:0x0028, B:7:0x0033, B:9:0x003b, B:11:0x0042, B:14:0x00e7, B:17:0x0100, B:19:0x010a, B:21:0x0114, B:33:0x0171, B:35:0x0184, B:40:0x024a, B:42:0x0268, B:44:0x027c, B:46:0x034b, B:48:0x0351, B:49:0x0273, B:37:0x020b, B:39:0x0201, B:54:0x01c4, B:64:0x0128, B:65:0x00f2, B:67:0x0367, B:72:0x0386, B:74:0x038f, B:76:0x0396, B:78:0x039f, B:80:0x03cf, B:81:0x03dd, B:83:0x03e5, B:84:0x03f1, B:86:0x03f9, B:87:0x0407, B:163:0x0413, B:90:0x042b, B:92:0x0433, B:93:0x0441, B:95:0x0449, B:96:0x0457, B:98:0x045f, B:99:0x046d, B:101:0x0475, B:102:0x0483, B:105:0x04a9, B:107:0x04b2, B:108:0x04c8, B:110:0x04d2, B:112:0x04dc, B:114:0x04ef, B:115:0x0505, B:120:0x05d2, B:122:0x05e2, B:124:0x05f8, B:126:0x0601, B:127:0x0649, B:141:0x060a, B:143:0x0616, B:145:0x0631, B:147:0x063d, B:117:0x058e, B:119:0x0587, B:153:0x0546, B:154:0x04f8, B:156:0x04bb, B:150:0x0513, B:51:0x0190), top: B:2:0x0020, inners: #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0171 A[Catch: Exception -> 0x0773, TRY_ENTER, TryCatch #7 {Exception -> 0x0773, blocks: (B:5:0x0028, B:7:0x0033, B:9:0x003b, B:11:0x0042, B:14:0x00e7, B:17:0x0100, B:19:0x010a, B:21:0x0114, B:33:0x0171, B:35:0x0184, B:40:0x024a, B:42:0x0268, B:44:0x027c, B:46:0x034b, B:48:0x0351, B:49:0x0273, B:37:0x020b, B:39:0x0201, B:54:0x01c4, B:64:0x0128, B:65:0x00f2, B:67:0x0367, B:72:0x0386, B:74:0x038f, B:76:0x0396, B:78:0x039f, B:80:0x03cf, B:81:0x03dd, B:83:0x03e5, B:84:0x03f1, B:86:0x03f9, B:87:0x0407, B:163:0x0413, B:90:0x042b, B:92:0x0433, B:93:0x0441, B:95:0x0449, B:96:0x0457, B:98:0x045f, B:99:0x046d, B:101:0x0475, B:102:0x0483, B:105:0x04a9, B:107:0x04b2, B:108:0x04c8, B:110:0x04d2, B:112:0x04dc, B:114:0x04ef, B:115:0x0505, B:120:0x05d2, B:122:0x05e2, B:124:0x05f8, B:126:0x0601, B:127:0x0649, B:141:0x060a, B:143:0x0616, B:145:0x0631, B:147:0x063d, B:117:0x058e, B:119:0x0587, B:153:0x0546, B:154:0x04f8, B:156:0x04bb, B:150:0x0513, B:51:0x0190), top: B:2:0x0020, inners: #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x020b A[Catch: Exception -> 0x0773, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x0773, blocks: (B:5:0x0028, B:7:0x0033, B:9:0x003b, B:11:0x0042, B:14:0x00e7, B:17:0x0100, B:19:0x010a, B:21:0x0114, B:33:0x0171, B:35:0x0184, B:40:0x024a, B:42:0x0268, B:44:0x027c, B:46:0x034b, B:48:0x0351, B:49:0x0273, B:37:0x020b, B:39:0x0201, B:54:0x01c4, B:64:0x0128, B:65:0x00f2, B:67:0x0367, B:72:0x0386, B:74:0x038f, B:76:0x0396, B:78:0x039f, B:80:0x03cf, B:81:0x03dd, B:83:0x03e5, B:84:0x03f1, B:86:0x03f9, B:87:0x0407, B:163:0x0413, B:90:0x042b, B:92:0x0433, B:93:0x0441, B:95:0x0449, B:96:0x0457, B:98:0x045f, B:99:0x046d, B:101:0x0475, B:102:0x0483, B:105:0x04a9, B:107:0x04b2, B:108:0x04c8, B:110:0x04d2, B:112:0x04dc, B:114:0x04ef, B:115:0x0505, B:120:0x05d2, B:122:0x05e2, B:124:0x05f8, B:126:0x0601, B:127:0x0649, B:141:0x060a, B:143:0x0616, B:145:0x0631, B:147:0x063d, B:117:0x058e, B:119:0x0587, B:153:0x0546, B:154:0x04f8, B:156:0x04bb, B:150:0x0513, B:51:0x0190), top: B:2:0x0020, inners: #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0268 A[Catch: Exception -> 0x0773, TRY_LEAVE, TryCatch #7 {Exception -> 0x0773, blocks: (B:5:0x0028, B:7:0x0033, B:9:0x003b, B:11:0x0042, B:14:0x00e7, B:17:0x0100, B:19:0x010a, B:21:0x0114, B:33:0x0171, B:35:0x0184, B:40:0x024a, B:42:0x0268, B:44:0x027c, B:46:0x034b, B:48:0x0351, B:49:0x0273, B:37:0x020b, B:39:0x0201, B:54:0x01c4, B:64:0x0128, B:65:0x00f2, B:67:0x0367, B:72:0x0386, B:74:0x038f, B:76:0x0396, B:78:0x039f, B:80:0x03cf, B:81:0x03dd, B:83:0x03e5, B:84:0x03f1, B:86:0x03f9, B:87:0x0407, B:163:0x0413, B:90:0x042b, B:92:0x0433, B:93:0x0441, B:95:0x0449, B:96:0x0457, B:98:0x045f, B:99:0x046d, B:101:0x0475, B:102:0x0483, B:105:0x04a9, B:107:0x04b2, B:108:0x04c8, B:110:0x04d2, B:112:0x04dc, B:114:0x04ef, B:115:0x0505, B:120:0x05d2, B:122:0x05e2, B:124:0x05f8, B:126:0x0601, B:127:0x0649, B:141:0x060a, B:143:0x0616, B:145:0x0631, B:147:0x063d, B:117:0x058e, B:119:0x0587, B:153:0x0546, B:154:0x04f8, B:156:0x04bb, B:150:0x0513, B:51:0x0190), top: B:2:0x0020, inners: #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x034b A[Catch: Exception -> 0x0773, TryCatch #7 {Exception -> 0x0773, blocks: (B:5:0x0028, B:7:0x0033, B:9:0x003b, B:11:0x0042, B:14:0x00e7, B:17:0x0100, B:19:0x010a, B:21:0x0114, B:33:0x0171, B:35:0x0184, B:40:0x024a, B:42:0x0268, B:44:0x027c, B:46:0x034b, B:48:0x0351, B:49:0x0273, B:37:0x020b, B:39:0x0201, B:54:0x01c4, B:64:0x0128, B:65:0x00f2, B:67:0x0367, B:72:0x0386, B:74:0x038f, B:76:0x0396, B:78:0x039f, B:80:0x03cf, B:81:0x03dd, B:83:0x03e5, B:84:0x03f1, B:86:0x03f9, B:87:0x0407, B:163:0x0413, B:90:0x042b, B:92:0x0433, B:93:0x0441, B:95:0x0449, B:96:0x0457, B:98:0x045f, B:99:0x046d, B:101:0x0475, B:102:0x0483, B:105:0x04a9, B:107:0x04b2, B:108:0x04c8, B:110:0x04d2, B:112:0x04dc, B:114:0x04ef, B:115:0x0505, B:120:0x05d2, B:122:0x05e2, B:124:0x05f8, B:126:0x0601, B:127:0x0649, B:141:0x060a, B:143:0x0616, B:145:0x0631, B:147:0x063d, B:117:0x058e, B:119:0x0587, B:153:0x0546, B:154:0x04f8, B:156:0x04bb, B:150:0x0513, B:51:0x0190), top: B:2:0x0020, inners: #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0273 A[Catch: Exception -> 0x0773, TRY_ENTER, TryCatch #7 {Exception -> 0x0773, blocks: (B:5:0x0028, B:7:0x0033, B:9:0x003b, B:11:0x0042, B:14:0x00e7, B:17:0x0100, B:19:0x010a, B:21:0x0114, B:33:0x0171, B:35:0x0184, B:40:0x024a, B:42:0x0268, B:44:0x027c, B:46:0x034b, B:48:0x0351, B:49:0x0273, B:37:0x020b, B:39:0x0201, B:54:0x01c4, B:64:0x0128, B:65:0x00f2, B:67:0x0367, B:72:0x0386, B:74:0x038f, B:76:0x0396, B:78:0x039f, B:80:0x03cf, B:81:0x03dd, B:83:0x03e5, B:84:0x03f1, B:86:0x03f9, B:87:0x0407, B:163:0x0413, B:90:0x042b, B:92:0x0433, B:93:0x0441, B:95:0x0449, B:96:0x0457, B:98:0x045f, B:99:0x046d, B:101:0x0475, B:102:0x0483, B:105:0x04a9, B:107:0x04b2, B:108:0x04c8, B:110:0x04d2, B:112:0x04dc, B:114:0x04ef, B:115:0x0505, B:120:0x05d2, B:122:0x05e2, B:124:0x05f8, B:126:0x0601, B:127:0x0649, B:141:0x060a, B:143:0x0616, B:145:0x0631, B:147:0x063d, B:117:0x058e, B:119:0x0587, B:153:0x0546, B:154:0x04f8, B:156:0x04bb, B:150:0x0513, B:51:0x0190), top: B:2:0x0020, inners: #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    @android.annotation.SuppressLint({"SetTextI18n"})
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo2996G(@org.jetbrains.annotations.NotNull androidx.recyclerview.widget.RecyclerView.AbstractC0674e0 r14, int r15) {
        /*
            Method dump skipped, instructions count: 1920
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAllDataRightSideAdapter.mo2996G(androidx.recyclerview.widget.RecyclerView$e0, int):void");
    }

    /* renamed from: G0 */
    public int m17594G0() {
        return this.f21184s;
    }

    /* renamed from: H0 */
    public final void m17595H0() {
        if (this.f21181p.equals("mobile")) {
            try {
                this.f21186u = C5938b.m29235e(this.f21174i).m29243c().m29358c();
            } catch (Exception e10) {
            }
        }
        C5947e c5947e = this.f21186u;
        if (c5947e == null || !c5947e.m29348c()) {
            C5251a.f30026Y = true;
            C5255e.m26220W(this.f21174i, "", C5255e.m26215R(this.f21190y), "movie", this.f21182q, "0", this.f21191z, "", this.f21167A);
            return;
        }
        String m26202E = C5255e.m26202E(this.f21174i, C5255e.m26215R(this.f21190y), this.f21182q, "movie");
        C5947e c5947e2 = this.f21186u;
        if (((c5947e2 == null || c5947e2.m29290r() == null || this.f21186u.m29290r().m31009j() == null || this.f21186u.m29290r().m31009j().m13058R() == null) ? "" : this.f21186u.m29290r().m31009j().m13058R()).equals(m26202E)) {
            this.f21174i.startActivity(new Intent(this.f21174i, (Class<?>) ExpandedControlsActivity.class));
        } else {
            C4718a.m23743c(C5255e.m26215R(this.f21188w), true, C4718a.m23741a(this.f21191z, "", "", 0, m26202E, "videos/mp4", this.f21187v, "", null), this.f21186u, this.f21174i);
        }
    }

    /* renamed from: I0 */
    public final void m17596I0(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, ArrayList<LiveStreamsDBModel> arrayList, ArrayList<LiveStreamsDBModel> arrayList2, int i11) {
        if (i11 == 1) {
            C0304c1 c0304c1 = new C0304c1(this.f21174i, ((ContinueWatchingViewHolder) abstractC0674e0).cardView);
            c0304c1.m1277d(2131689481);
            if (this.f21176k.m15112o(C5255e.m26215R(arrayList2.get(i10).m14811R()), arrayList2.get(i10).m14827g(), "vod", SharepreferenceDBHandler.m15337A(this.f21174i)).size() > 0) {
                c0304c1.m1275b().getItem(0).setVisible(false);
                c0304c1.m1275b().getItem(1).setVisible(true);
            } else {
                c0304c1.m1275b().getItem(0).setVisible(true);
                c0304c1.m1275b().getItem(1).setVisible(false);
            }
            c0304c1.m1279f(new C3564k(this, abstractC0674e0, i10, arrayList, arrayList2, i11));
            c0304c1.m1280g();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    @NotNull
    /* renamed from: J */
    public RecyclerView.AbstractC0674e0 mo2998J(@NotNull ViewGroup viewGroup, int i10) {
        return i10 == 1 ? new ContinueWatchingViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(2131624513, viewGroup, false)) : new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(2131624512, viewGroup, false));
    }

    /* renamed from: J0 */
    public final void m17597J0(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, ArrayList<LiveStreamsDBModel> arrayList, List<LiveStreamsDBModel> list, int i11) {
        ImageView imageView;
        if (i11 == 1) {
            this.f21176k.m15115t(C5255e.m26215R(list.get(i10).m14811R()), list.get(i10).m14827g(), "vod", list.get(i10).getName(), SharepreferenceDBHandler.m15337A(this.f21174i));
            imageView = ((ContinueWatchingViewHolder) abstractC0674e0).ivFavourite;
        } else {
            this.f21176k.m15115t(C5255e.m26215R(arrayList.get(i10).m14811R()), arrayList.get(i10).m14827g(), "vod", arrayList.get(i10).getName(), SharepreferenceDBHandler.m15337A(this.f21174i));
            imageView = ((ViewHolder) abstractC0674e0).ivFavourite;
        }
        imageView.setVisibility(4);
    }

    /* renamed from: K0 */
    public final void m17598K0(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, ArrayList<LiveStreamsDBModel> arrayList) {
        this.f21169C.m15188R0(arrayList.get(i10).m14816W(), SharepreferenceDBHandler.m15337A(this.f21174i));
        ((ViewHolder) abstractC0674e0).ivFavourite.setVisibility(4);
    }

    /* renamed from: L0 */
    public void m17599L0() {
        this.f21183r = false;
    }

    /* renamed from: M0 */
    public final void m17600M0(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11) {
        if (this.f21174i == null) {
            Log.e("Null hai context", ">>>>>>>>>>>True its Null");
            return;
        }
        Intent intent = (C5251a.f30036e.booleanValue() && SharepreferenceDBHandler.m15373f(this.f21174i).equals("m3u")) ? new Intent(this.f21174i, (Class<?>) ViewDetailsTMDBActivity.class) : new Intent(this.f21174i, (Class<?>) ViewDetailsActivity.class);
        intent.putExtra(C5251a.f30075y, String.valueOf(i10));
        intent.putExtra("movie", str);
        intent.putExtra("movie_icon", str7);
        intent.putExtra("selectedPlayer", str2);
        intent.putExtra("streamType", str3);
        intent.putExtra("containerExtension", str4);
        intent.putExtra("categoryID", str5);
        intent.putExtra("num", str6);
        intent.putExtra("videoURL", str8);
        C5251a.f30022U = i11;
        this.f21174i.startActivity(intent);
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.f21178m.equals("continue_watching") ? this.f21180o : this.f21179n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        ArrayList<LiveStreamsDBModel> arrayList;
        if (this.f21178m.equals("continue_watching")) {
            ArrayList<LiveStreamsDBModel> arrayList2 = this.f21173h;
            if (arrayList2 == null || arrayList2.size() <= 0) {
                return 0;
            }
            arrayList = this.f21173h;
        } else {
            ArrayList<LiveStreamsDBModel> arrayList3 = this.f21171f;
            if (arrayList3 == null || arrayList3.size() <= 0) {
                return 0;
            }
            arrayList = this.f21171f;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: q */
    public int mo3018q(int i10) {
        return this.f21178m.equals("continue_watching") ? 1 : 0;
    }
}

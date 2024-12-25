package com.maxdigitall.maxdigitaliptvbox.view.adapter;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.maxdigitall.maxdigitaliptvbox.miscelleneious.chromecastfeature.ExpandedControlsActivity;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteM3UModel;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamCategoryIdDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.VodAllCategoriesSingleton;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.activity.LiveAllDataSingleActivity;
import com.maxdigitall.maxdigitaliptvbox.view.demo.NSTEXOPlayerSkyTvActivity;
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity;
import java.util.ArrayList;
import nf.C6783a;
import org.jetbrains.annotations.NotNull;
import p082ef.C4718a;
import p151if.C5251a;
import p151if.C5255e;
import p200l9.C5782l;
import p216m9.C5938b;
import p216m9.C5947e;
import p316s2.C8522c;
import p402x9.C9691a;
import p428yg.C10014t;
import p428yg.InterfaceC9996e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch.class */
public class LiveAllDataRightSideAdapterSearch extends RecyclerView.AbstractC0677h<RecyclerView.AbstractC0674e0> {

    /* renamed from: C */
    public SharedPreferences.Editor f19907C;

    /* renamed from: D */
    public SharedPreferences f19908D;

    /* renamed from: e */
    public ArrayList<LiveStreamsDBModel> f19909e;

    /* renamed from: f */
    public Context f19910f;

    /* renamed from: h */
    public DatabaseHandler f19912h;

    /* renamed from: i */
    public Animation f19913i;

    /* renamed from: j */
    public String f19914j;

    /* renamed from: l */
    public ProgressDialog f19916l;

    /* renamed from: o */
    public SharedPreferences f19919o;

    /* renamed from: p */
    public C5947e f19920p;

    /* renamed from: r */
    public Handler f19922r;

    /* renamed from: t */
    public LiveStreamDBHandler f19924t;

    /* renamed from: x */
    public ArrayList<LiveStreamsDBModel> f19928x;

    /* renamed from: g */
    public Boolean f19911g = Boolean.FALSE;

    /* renamed from: k */
    public String f19915k = "";

    /* renamed from: m */
    public boolean f19917m = false;

    /* renamed from: n */
    public int f19918n = -1;

    /* renamed from: q */
    public String f19921q = "";

    /* renamed from: u */
    public int f19925u = -1;

    /* renamed from: v */
    public ArrayList<String> f19926v = new ArrayList<>();

    /* renamed from: y */
    public String f19929y = "";

    /* renamed from: z */
    public String f19930z = "";

    /* renamed from: A */
    public int f19905A = 0;

    /* renamed from: B */
    public String f19906B = "";

    /* renamed from: s */
    public ArrayList<LiveStreamCategoryIdDBModel> f19923s = new ArrayList<>();

    /* renamed from: w */
    public ArrayList<LiveStreamCategoryIdDBModel> f19927w = new ArrayList<>();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$ContinueWatchingViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$ContinueWatchingViewHolder.class */
    public static class ContinueWatchingViewHolder extends RecyclerView.AbstractC0674e0 {
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$ContinueWatchingViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$ContinueWatchingViewHolder_ViewBinding.class */
    public class ContinueWatchingViewHolder_ViewBinding implements Unbinder {
        public ContinueWatchingViewHolder_ViewBinding(ContinueWatchingViewHolder continueWatchingViewHolder, View view) {
            throw null;
        }

        @Override // butterknife.Unbinder
        /* renamed from: a */
        public void mo5629a() {
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$ViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$ViewHolder.class */
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
        public ImageView ivFavourite;

        @BindView
        public LinearLayout llMenu;

        @BindView
        public TextView tvStreamOptions;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.m5627b(this, view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$ViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$ViewHolder_ViewBinding.class */
    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public ViewHolder f19931b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f19931b = viewHolder;
            viewHolder.SeriesName = (TextView) C8522c.m36739c(view, 2131429602, "field 'SeriesName'", TextView.class);
            viewHolder.Movie = (RelativeLayout) C8522c.m36739c(view, 2131429012, "field 'Movie'", RelativeLayout.class);
            viewHolder.MovieImage = (ImageView) C8522c.m36739c(view, 2131428200, "field 'MovieImage'", ImageView.class);
            viewHolder.cardView = (CardView) C8522c.m36739c(view, 2131427703, "field 'cardView'", CardView.class);
            viewHolder.tvStreamOptions = (TextView) C8522c.m36739c(view, 2131429619, "field 'tvStreamOptions'", TextView.class);
            viewHolder.ivFavourite = (ImageView) C8522c.m36739c(view, 2131428179, "field 'ivFavourite'", ImageView.class);
            viewHolder.llMenu = (LinearLayout) C8522c.m36739c(view, 2131428441, "field 'llMenu'", LinearLayout.class);
        }

        @Override // butterknife.Unbinder
        /* renamed from: a */
        public void mo5629a() {
            ViewHolder viewHolder = this.f19931b;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f19931b = null;
            viewHolder.SeriesName = null;
            viewHolder.Movie = null;
            viewHolder.MovieImage = null;
            viewHolder.cardView = null;
            viewHolder.tvStreamOptions = null;
            viewHolder.ivFavourite = null;
            viewHolder.llMenu = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapterSearch$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$a.class */
    public class C3404a implements InterfaceC9996e {

        /* renamed from: a */
        public final ViewHolder f19932a;

        /* renamed from: b */
        public final LiveAllDataRightSideAdapterSearch f19933b;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$a$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapterSearch$a$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$a$a.class */
        public class a implements InterfaceC9996e {

            /* renamed from: a */
            public final C3404a f19934a;

            public a(C3404a c3404a) {
                this.f19934a = c3404a;
            }

            @Override // p428yg.InterfaceC9996e
            /* renamed from: a */
            public void mo15848a() {
            }

            @Override // p428yg.InterfaceC9996e
            public void onSuccess() {
            }
        }

        public C3404a(LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch, ViewHolder viewHolder) {
            this.f19933b = liveAllDataRightSideAdapterSearch;
            this.f19932a = viewHolder;
        }

        @Override // p428yg.InterfaceC9996e
        /* renamed from: a */
        public void mo15848a() {
            C10014t.m42105q(this.f19933b.f19910f).m42116l(String.valueOf(this.f19933b.f19910f.getResources().getDrawable(2131231769))).m42149e().m42146b().m42152h(this.f19932a.MovieImage, new a(this));
            this.f19932a.SeriesName.setVisibility(0);
        }

        @Override // p428yg.InterfaceC9996e
        public void onSuccess() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapterSearch$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$b.class */
    public class C3405b implements InterfaceC9996e {

        /* renamed from: a */
        public final LiveAllDataRightSideAdapterSearch f19935a;

        public C3405b(LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch) {
            this.f19935a = liveAllDataRightSideAdapterSearch;
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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapterSearch$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$c.class */
    public class C3406c implements InterfaceC9996e {

        /* renamed from: a */
        public final LiveAllDataRightSideAdapterSearch f19936a;

        public C3406c(LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch) {
            this.f19936a = liveAllDataRightSideAdapterSearch;
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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapterSearch$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$d.class */
    public class ViewOnClickListenerC3407d implements View.OnClickListener {

        /* renamed from: b */
        public final String f19937b;

        /* renamed from: c */
        public final int f19938c;

        /* renamed from: d */
        public final String f19939d;

        /* renamed from: e */
        public final String f19940e;

        /* renamed from: f */
        public final String f19941f;

        /* renamed from: g */
        public final LiveAllDataRightSideAdapterSearch f19942g;

        public ViewOnClickListenerC3407d(LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch, String str, int i10, String str2, String str3, String str4) {
            this.f19942g = liveAllDataRightSideAdapterSearch;
            this.f19937b = str;
            this.f19938c = i10;
            this.f19939d = str2;
            this.f19940e = str3;
            this.f19941f = str4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch = this.f19942g;
                liveAllDataRightSideAdapterSearch.f19920p = C5938b.m29235e(liveAllDataRightSideAdapterSearch.f19910f).m29243c().m29358c();
            } catch (Exception e10) {
            }
            if (this.f19942g.f19920p == null || !this.f19942g.f19920p.m29348c()) {
                this.f19942g.m17153C0(this.f19938c, this.f19941f, this.f19937b);
                return;
            }
            if (this.f19942g.f19920p != null && this.f19942g.f19920p.m29290r() != null && this.f19942g.f19920p.m29290r().m31009j() != null && this.f19942g.f19920p.m29290r().m31009j().m13058R() != null) {
                LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch2 = this.f19942g;
                liveAllDataRightSideAdapterSearch2.f19921q = liveAllDataRightSideAdapterSearch2.f19920p.m29290r().m31009j().m13058R();
            }
            String m26202E = SharepreferenceDBHandler.m15373f(this.f19942g.f19910f).equals("m3u") ? this.f19937b : C5255e.m26202E(this.f19942g.f19910f, this.f19938c, "m3u8", "live");
            if (this.f19942g.f19921q.contains(String.valueOf(m26202E))) {
                this.f19942g.f19910f.startActivity(new Intent(this.f19942g.f19910f, (Class<?>) ExpandedControlsActivity.class));
                return;
            }
            C5782l c5782l = new C5782l(1);
            c5782l.m28249V("com.google.android.gms.cast.metadata.TITLE", this.f19939d);
            c5782l.m28253b(new C9691a(Uri.parse(this.f19940e)));
            LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch3 = this.f19942g;
            C4718a.m23742b(liveAllDataRightSideAdapterSearch3.f19922r, liveAllDataRightSideAdapterSearch3.f19920p.m29290r(), m26202E, c5782l, this.f19942g.f19910f);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapterSearch$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$e.class */
    public class ViewOnClickListenerC3408e implements View.OnClickListener {

        /* renamed from: b */
        public final String f19943b;

        /* renamed from: c */
        public final int f19944c;

        /* renamed from: d */
        public final String f19945d;

        /* renamed from: e */
        public final String f19946e;

        /* renamed from: f */
        public final String f19947f;

        /* renamed from: g */
        public final LiveAllDataRightSideAdapterSearch f19948g;

        public ViewOnClickListenerC3408e(LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch, String str, int i10, String str2, String str3, String str4) {
            this.f19948g = liveAllDataRightSideAdapterSearch;
            this.f19943b = str;
            this.f19944c = i10;
            this.f19945d = str2;
            this.f19946e = str3;
            this.f19947f = str4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch = this.f19948g;
                liveAllDataRightSideAdapterSearch.f19920p = C5938b.m29235e(liveAllDataRightSideAdapterSearch.f19910f).m29243c().m29358c();
            } catch (Exception e10) {
            }
            if (this.f19948g.f19920p == null || !this.f19948g.f19920p.m29348c()) {
                this.f19948g.m17153C0(this.f19944c, this.f19947f, this.f19943b);
                return;
            }
            if (this.f19948g.f19920p != null && this.f19948g.f19920p.m29290r() != null && this.f19948g.f19920p.m29290r().m31009j() != null && this.f19948g.f19920p.m29290r().m31009j().m13058R() != null) {
                LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch2 = this.f19948g;
                liveAllDataRightSideAdapterSearch2.f19921q = liveAllDataRightSideAdapterSearch2.f19920p.m29290r().m31009j().m13058R();
            }
            String m26202E = SharepreferenceDBHandler.m15373f(this.f19948g.f19910f).equals("m3u") ? this.f19943b : C5255e.m26202E(this.f19948g.f19910f, this.f19944c, "m3u8", "live");
            if (this.f19948g.f19921q.contains(String.valueOf(m26202E))) {
                this.f19948g.f19910f.startActivity(new Intent(this.f19948g.f19910f, (Class<?>) ExpandedControlsActivity.class));
                return;
            }
            C5782l c5782l = new C5782l(1);
            c5782l.m28249V("com.google.android.gms.cast.metadata.TITLE", this.f19945d);
            c5782l.m28253b(new C9691a(Uri.parse(this.f19946e)));
            LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch3 = this.f19948g;
            C4718a.m23742b(liveAllDataRightSideAdapterSearch3.f19922r, liveAllDataRightSideAdapterSearch3.f19920p.m29290r(), m26202E, c5782l, this.f19948g.f19910f);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapterSearch$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$f.class */
    public class ViewOnClickListenerC3409f implements View.OnClickListener {

        /* renamed from: b */
        public final String f19949b;

        /* renamed from: c */
        public final int f19950c;

        /* renamed from: d */
        public final String f19951d;

        /* renamed from: e */
        public final String f19952e;

        /* renamed from: f */
        public final String f19953f;

        /* renamed from: g */
        public final LiveAllDataRightSideAdapterSearch f19954g;

        public ViewOnClickListenerC3409f(LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch, String str, int i10, String str2, String str3, String str4) {
            this.f19954g = liveAllDataRightSideAdapterSearch;
            this.f19949b = str;
            this.f19950c = i10;
            this.f19951d = str2;
            this.f19952e = str3;
            this.f19953f = str4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch = this.f19954g;
                liveAllDataRightSideAdapterSearch.f19920p = C5938b.m29235e(liveAllDataRightSideAdapterSearch.f19910f).m29243c().m29358c();
            } catch (Exception e10) {
            }
            if (this.f19954g.f19920p == null || !this.f19954g.f19920p.m29348c()) {
                this.f19954g.m17153C0(this.f19950c, this.f19953f, this.f19949b);
                return;
            }
            if (this.f19954g.f19920p != null && this.f19954g.f19920p.m29290r() != null && this.f19954g.f19920p.m29290r().m31009j() != null && this.f19954g.f19920p.m29290r().m31009j().m13058R() != null) {
                LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch2 = this.f19954g;
                liveAllDataRightSideAdapterSearch2.f19921q = liveAllDataRightSideAdapterSearch2.f19920p.m29290r().m31009j().m13058R();
            }
            String m26202E = SharepreferenceDBHandler.m15373f(this.f19954g.f19910f).equals("m3u") ? this.f19949b : C5255e.m26202E(this.f19954g.f19910f, this.f19950c, "m3u8", "live");
            if (this.f19954g.f19921q.contains(String.valueOf(m26202E))) {
                this.f19954g.f19910f.startActivity(new Intent(this.f19954g.f19910f, (Class<?>) ExpandedControlsActivity.class));
                return;
            }
            C5782l c5782l = new C5782l(1);
            c5782l.m28249V("com.google.android.gms.cast.metadata.TITLE", this.f19951d);
            c5782l.m28253b(new C9691a(Uri.parse(this.f19952e)));
            LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch3 = this.f19954g;
            C4718a.m23742b(liveAllDataRightSideAdapterSearch3.f19922r, liveAllDataRightSideAdapterSearch3.f19920p.m29290r(), m26202E, c5782l, this.f19954g.f19910f);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapterSearch$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$g.class */
    public class ViewOnLongClickListenerC3410g implements View.OnLongClickListener {

        /* renamed from: b */
        public final String f19955b;

        /* renamed from: c */
        public final ViewHolder f19956c;

        /* renamed from: d */
        public final int f19957d;

        /* renamed from: e */
        public final int f19958e;

        /* renamed from: f */
        public final String f19959f;

        /* renamed from: g */
        public final int f19960g;

        /* renamed from: h */
        public final LiveAllDataRightSideAdapterSearch f19961h;

        public ViewOnLongClickListenerC3410g(LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch, String str, ViewHolder viewHolder, int i10, int i11, String str2, int i12) {
            this.f19961h = liveAllDataRightSideAdapterSearch;
            this.f19955b = str;
            this.f19956c = viewHolder;
            this.f19957d = i10;
            this.f19958e = i11;
            this.f19959f = str2;
            this.f19960g = i12;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (SharepreferenceDBHandler.m15373f(this.f19961h.f19910f).equals("m3u")) {
                ArrayList<FavouriteM3UModel> m15159E0 = this.f19961h.f19924t.m15159E0(this.f19955b, SharepreferenceDBHandler.m15337A(this.f19961h.f19910f));
                LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch = this.f19961h;
                liveAllDataRightSideAdapterSearch.m17162w0(m15159E0, this.f19956c, this.f19957d, liveAllDataRightSideAdapterSearch.f19909e);
                return true;
            }
            ArrayList<FavouriteDBModel> m15112o = this.f19961h.f19912h.m15112o(this.f19958e, this.f19959f, "live", SharepreferenceDBHandler.m15337A(this.f19961h.f19910f));
            LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch2 = this.f19961h;
            liveAllDataRightSideAdapterSearch2.m17161v0(m15112o, this.f19956c, this.f19957d, liveAllDataRightSideAdapterSearch2.f19909e, this.f19960g, this.f19956c.Movie);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapterSearch$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$h.class */
    public class ViewOnLongClickListenerC3411h implements View.OnLongClickListener {

        /* renamed from: b */
        public final String f19962b;

        /* renamed from: c */
        public final ViewHolder f19963c;

        /* renamed from: d */
        public final int f19964d;

        /* renamed from: e */
        public final int f19965e;

        /* renamed from: f */
        public final String f19966f;

        /* renamed from: g */
        public final int f19967g;

        /* renamed from: h */
        public final LiveAllDataRightSideAdapterSearch f19968h;

        public ViewOnLongClickListenerC3411h(LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch, String str, ViewHolder viewHolder, int i10, int i11, String str2, int i12) {
            this.f19968h = liveAllDataRightSideAdapterSearch;
            this.f19962b = str;
            this.f19963c = viewHolder;
            this.f19964d = i10;
            this.f19965e = i11;
            this.f19966f = str2;
            this.f19967g = i12;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (SharepreferenceDBHandler.m15373f(this.f19968h.f19910f).equals("m3u")) {
                ArrayList<FavouriteM3UModel> m15159E0 = this.f19968h.f19924t.m15159E0(this.f19962b, SharepreferenceDBHandler.m15337A(this.f19968h.f19910f));
                LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch = this.f19968h;
                liveAllDataRightSideAdapterSearch.m17162w0(m15159E0, this.f19963c, this.f19964d, liveAllDataRightSideAdapterSearch.f19909e);
                return true;
            }
            ArrayList<FavouriteDBModel> m15112o = this.f19968h.f19912h.m15112o(this.f19965e, this.f19966f, "live", SharepreferenceDBHandler.m15337A(this.f19968h.f19910f));
            LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch2 = this.f19968h;
            liveAllDataRightSideAdapterSearch2.m17161v0(m15112o, this.f19963c, this.f19964d, liveAllDataRightSideAdapterSearch2.f19909e, this.f19967g, this.f19963c.Movie);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapterSearch$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$i.class */
    public class ViewOnLongClickListenerC3412i implements View.OnLongClickListener {

        /* renamed from: b */
        public final String f19969b;

        /* renamed from: c */
        public final ViewHolder f19970c;

        /* renamed from: d */
        public final int f19971d;

        /* renamed from: e */
        public final int f19972e;

        /* renamed from: f */
        public final String f19973f;

        /* renamed from: g */
        public final int f19974g;

        /* renamed from: h */
        public final LiveAllDataRightSideAdapterSearch f19975h;

        public ViewOnLongClickListenerC3412i(LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch, String str, ViewHolder viewHolder, int i10, int i11, String str2, int i12) {
            this.f19975h = liveAllDataRightSideAdapterSearch;
            this.f19969b = str;
            this.f19970c = viewHolder;
            this.f19971d = i10;
            this.f19972e = i11;
            this.f19973f = str2;
            this.f19974g = i12;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (SharepreferenceDBHandler.m15373f(this.f19975h.f19910f).equals("m3u")) {
                ArrayList<FavouriteM3UModel> m15159E0 = this.f19975h.f19924t.m15159E0(this.f19969b, SharepreferenceDBHandler.m15337A(this.f19975h.f19910f));
                LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch = this.f19975h;
                liveAllDataRightSideAdapterSearch.m17162w0(m15159E0, this.f19970c, this.f19971d, liveAllDataRightSideAdapterSearch.f19909e);
                return true;
            }
            ArrayList<FavouriteDBModel> m15112o = this.f19975h.f19912h.m15112o(this.f19972e, this.f19973f, "live", SharepreferenceDBHandler.m15337A(this.f19975h.f19910f));
            LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch2 = this.f19975h;
            liveAllDataRightSideAdapterSearch2.m17161v0(m15112o, this.f19970c, this.f19971d, liveAllDataRightSideAdapterSearch2.f19909e, this.f19974g, this.f19970c.Movie);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$j.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapterSearch$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$j.class */
    public class AsyncTaskC3413j extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        public final LiveAllDataRightSideAdapterSearch f19976a;

        public AsyncTaskC3413j(LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch) {
            this.f19976a = liveAllDataRightSideAdapterSearch;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            try {
                return this.f19976a.m17163x0(strArr[1]);
            } catch (Exception e10) {
                return "error";
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            this.f19976a.m17165z0();
            this.f19976a.m17158d0();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapterSearch$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$k.class */
    public class ViewOnFocusChangeListenerC3414k implements View.OnFocusChangeListener {

        /* renamed from: b */
        public int f19977b;

        /* renamed from: c */
        public final LiveAllDataRightSideAdapterSearch f19978c;

        public ViewOnFocusChangeListenerC3414k(LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch, int i10) {
            this.f19978c = liveAllDataRightSideAdapterSearch;
            this.f19977b = i10;
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            this.f19978c.f19918n = z10 ? this.f19977b : -1;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$l.class
     */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapterSearch$l */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveAllDataRightSideAdapterSearch$l.class */
    public class AsyncTaskC3415l extends AsyncTask<String, Void, Boolean> {

        /* renamed from: a */
        public final LiveAllDataRightSideAdapterSearch f19979a;

        public AsyncTaskC3415l(LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch) {
            this.f19979a = liveAllDataRightSideAdapterSearch;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return this.f19979a.m17151A0();
            } catch (Exception e10) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            this.f19979a.m17156F0();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            this.f19979a.m17157G0();
            super.onPreExecute();
        }
    }

    public LiveAllDataRightSideAdapterSearch(Context context, ArrayList<LiveStreamsDBModel> arrayList) {
        this.f19914j = "mobile";
        this.f19910f = context;
        this.f19909e = arrayList;
        this.f19912h = new DatabaseHandler(context);
        this.f19913i = AnimationUtils.loadAnimation(context, 2130771980);
        this.f19924t = new LiveStreamDBHandler(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("currentlyPlayingVideo", 0);
        this.f19908D = sharedPreferences;
        this.f19907C = sharedPreferences.edit();
        if (new C6783a(context).m31288z().equals(C5251a.f30065s0)) {
            this.f19914j = "tv";
        } else {
            this.f19914j = "mobile";
        }
        this.f19922r = new Handler(Looper.getMainLooper());
        if (this.f19914j.equals("mobile")) {
            try {
                this.f19920p = C5938b.m29235e(context).m29243c().m29358c();
            } catch (Exception e10) {
            }
        }
    }

    /* renamed from: A0 */
    public final Boolean m17151A0() {
        try {
            if (this.f19910f != null) {
                ArrayList<LiveStreamCategoryIdDBModel> arrayList = this.f19923s;
                if (arrayList != null) {
                    arrayList.clear();
                }
                this.f19923s = this.f19924t.m15263x1();
                LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
                LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel2 = new LiveStreamCategoryIdDBModel();
                LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel3 = new LiveStreamCategoryIdDBModel();
                int m15205Z1 = this.f19924t.m15205Z1("live");
                liveStreamCategoryIdDBModel.m14792g("0");
                liveStreamCategoryIdDBModel.m14793h(this.f19910f.getResources().getString(2132017297));
                liveStreamCategoryIdDBModel.m14794i(m15205Z1);
                liveStreamCategoryIdDBModel2.m14792g("-1");
                liveStreamCategoryIdDBModel2.m14793h(this.f19910f.getResources().getString(2132017779));
                int m15211c2 = this.f19924t.m15211c2("-2", "live");
                this.f19925u = m15211c2;
                if (m15211c2 != 0 && m15211c2 > 0) {
                    liveStreamCategoryIdDBModel3.m14792g("-2");
                    liveStreamCategoryIdDBModel3.m14793h(this.f19910f.getResources().getString(2132018731));
                    liveStreamCategoryIdDBModel3.m14794i(this.f19925u);
                    ArrayList<LiveStreamCategoryIdDBModel> arrayList2 = this.f19923s;
                    arrayList2.add(arrayList2.size(), liveStreamCategoryIdDBModel3);
                }
                this.f19923s.add(0, liveStreamCategoryIdDBModel);
                this.f19923s.add(1, liveStreamCategoryIdDBModel2);
            }
            return Boolean.TRUE;
        } catch (NullPointerException e10) {
            return Boolean.FALSE;
        } catch (Exception e11) {
            return Boolean.FALSE;
        }
    }

    /* renamed from: B0 */
    public final void m17152B0() {
        new AsyncTaskC3415l(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    /* renamed from: C0 */
    public final void m17153C0(int i10, String str, String str2) {
        this.f19929y = str;
        this.f19905A = i10;
        this.f19906B = str2;
        m17152B0();
    }

    /* renamed from: D0 */
    public final void m17154D0(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, ArrayList<LiveStreamsDBModel> arrayList, int i11) {
        this.f19912h.m15115t(C5255e.m26215R(arrayList.get(i10).m14811R()), arrayList.get(i10).m14827g(), "live", arrayList.get(i10).getName(), SharepreferenceDBHandler.m15337A(this.f19910f));
        ((ViewHolder) abstractC0674e0).ivFavourite.setVisibility(4);
    }

    /* renamed from: E0 */
    public final void m17155E0(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, ArrayList<LiveStreamsDBModel> arrayList) {
        this.f19924t.m15188R0(arrayList.get(i10).m14816W(), SharepreferenceDBHandler.m15337A(this.f19910f));
        ((ViewHolder) abstractC0674e0).ivFavourite.setVisibility(4);
    }

    /* renamed from: F0 */
    public final void m17156F0() {
        ArrayList<LiveStreamCategoryIdDBModel> arrayList = this.f19923s;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList<LiveStreamCategoryIdDBModel> arrayList2 = this.f19927w;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        ArrayList<LiveStreamCategoryIdDBModel> arrayList3 = new ArrayList<>();
        this.f19927w = arrayList3;
        arrayList3.addAll(this.f19923s);
        int i10 = 0;
        while (true) {
            if (i10 >= this.f19923s.size()) {
                break;
            }
            if (this.f19929y.equals(String.valueOf(this.f19923s.get(i10).m14787b()))) {
                this.f19930z = this.f19923s.get(i10).m14788c();
                break;
            }
            i10++;
        }
        ArrayList<LiveStreamCategoryIdDBModel> arrayList4 = this.f19927w;
        if (arrayList4 == null || arrayList4.size() <= 0) {
            return;
        }
        VodAllCategoriesSingleton.m14909b().m14917i(this.f19927w);
        C5255e.f30090n = new AsyncTaskC3413j(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_all", this.f19929y);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x021e, code lost:
    
        if (r9.f19924t.m15159E0(r10, com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler.m15337A(r9.f19910f)).size() > 0) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x020c A[Catch: Exception -> 0x035a, TryCatch #0 {Exception -> 0x035a, blocks: (B:3:0x0023, B:5:0x002c, B:7:0x0033, B:9:0x003c, B:11:0x006b, B:13:0x0073, B:15:0x0079, B:16:0x0087, B:18:0x008f, B:20:0x0097, B:67:0x009f, B:23:0x00b3, B:25:0x00bb, B:26:0x00c9, B:28:0x00d1, B:29:0x00dd, B:31:0x00e5, B:32:0x00f3, B:35:0x0119, B:37:0x0131, B:42:0x01fc, B:44:0x020c, B:47:0x0223, B:48:0x0256, B:50:0x0326, B:52:0x032c, B:53:0x022d, B:54:0x0239, B:39:0x01bc, B:41:0x01b2, B:61:0x0173, B:62:0x0125, B:73:0x0344, B:58:0x013d), top: B:2:0x0023, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0239 A[Catch: Exception -> 0x035a, TRY_ENTER, TryCatch #0 {Exception -> 0x035a, blocks: (B:3:0x0023, B:5:0x002c, B:7:0x0033, B:9:0x003c, B:11:0x006b, B:13:0x0073, B:15:0x0079, B:16:0x0087, B:18:0x008f, B:20:0x0097, B:67:0x009f, B:23:0x00b3, B:25:0x00bb, B:26:0x00c9, B:28:0x00d1, B:29:0x00dd, B:31:0x00e5, B:32:0x00f3, B:35:0x0119, B:37:0x0131, B:42:0x01fc, B:44:0x020c, B:47:0x0223, B:48:0x0256, B:50:0x0326, B:52:0x032c, B:53:0x022d, B:54:0x0239, B:39:0x01bc, B:41:0x01b2, B:61:0x0173, B:62:0x0125, B:73:0x0344, B:58:0x013d), top: B:2:0x0023, inners: #2 }] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    @android.annotation.SuppressLint({"SetTextI18n"})
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo2996G(@org.jetbrains.annotations.NotNull androidx.recyclerview.widget.RecyclerView.AbstractC0674e0 r10, int r11) {
        /*
            Method dump skipped, instructions count: 862
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapterSearch.mo2996G(androidx.recyclerview.widget.RecyclerView$e0, int):void");
    }

    /* renamed from: G0 */
    public final void m17157G0() {
        ProgressDialog progressDialog = new ProgressDialog(this.f19910f);
        this.f19916l = progressDialog;
        progressDialog.setCanceledOnTouchOutside(false);
        this.f19916l.setMessage(this.f19910f.getResources().getString(2132018352));
        this.f19916l.show();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    @NotNull
    /* renamed from: J */
    public RecyclerView.AbstractC0674e0 mo2998J(@NotNull ViewGroup viewGroup, int i10) {
        LayoutInflater from;
        int i11;
        if (this.f19914j.equals("tv")) {
            from = LayoutInflater.from(viewGroup.getContext());
            i11 = 2131624325;
        } else {
            from = LayoutInflater.from(viewGroup.getContext());
            i11 = 2131624323;
        }
        return new ViewHolder(from.inflate(i11, viewGroup, false));
    }

    /* renamed from: d0 */
    public void m17158d0() {
        try {
            int m17164y0 = SharepreferenceDBHandler.m15373f(this.f19910f).equals("m3u") ? m17164y0(this.f19906B, "m3u") : m17164y0(String.valueOf(this.f19905A), "api");
            if (!this.f19914j.equals("tv")) {
                ArrayList<LiveStreamsDBModel> arrayList = this.f19928x;
                if (arrayList == null || arrayList.size() <= 0) {
                    VodAllCategoriesSingleton.m14909b().m14918j(null);
                    return;
                } else {
                    VodAllCategoriesSingleton.m14909b().m14918j(this.f19928x);
                    C5255e.m26221X(this.f19910f, "Built-in Player ( Default )", this.f19905A, "live", m17164y0, "", "", "", this.f19929y, this.f19906B, this.f19930z);
                    return;
                }
            }
            String m15385l = SharepreferenceDBHandler.m15385l(this.f19910f);
            Intent intent = (m15385l == null || !m15385l.equalsIgnoreCase("default_native")) ? new Intent(this.f19910f, (Class<?>) NSTIJKPlayerSkyTvActivity.class) : new Intent(this.f19910f, (Class<?>) NSTEXOPlayerSkyTvActivity.class);
            intent.putExtra("OPENED_STREAM_ID", this.f19905A);
            intent.putExtra("VIDEO_NUM", m17164y0);
            intent.putExtra("OPENED_CAT_ID", this.f19929y);
            intent.putExtra("VIDEO_URL", this.f19906B);
            intent.putExtra("OPENED_CAT_NAME", this.f19930z);
            intent.putExtra("FROM_SEARCH", "true");
            this.f19910f.startActivity(intent);
        } catch (Exception e10) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        ArrayList<LiveStreamsDBModel> arrayList = this.f19909e;
        if (arrayList == null || arrayList.size() <= 0) {
            return 0;
        }
        return this.f19909e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: q */
    public int mo3018q(int i10) {
        return 0;
    }

    /* renamed from: t0 */
    public final void m17159t0(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, ArrayList<LiveStreamsDBModel> arrayList, int i11) {
        ViewHolder viewHolder = (ViewHolder) abstractC0674e0;
        FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
        favouriteDBModel.m14767h(arrayList.get(i10).m14827g());
        favouriteDBModel.m14772m(C5255e.m26215R(arrayList.get(i10).m14811R()));
        favouriteDBModel.m14770k(arrayList.get(i10).getName());
        favouriteDBModel.m14771l(arrayList.get(i10).m14805L());
        favouriteDBModel.m14774o(SharepreferenceDBHandler.m15337A(this.f19910f));
        this.f19912h.m15111l(favouriteDBModel, "live");
        viewHolder.ivFavourite.startAnimation(this.f19913i);
        viewHolder.ivFavourite.setVisibility(0);
    }

    /* renamed from: u0 */
    public final void m17160u0(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, ArrayList<LiveStreamsDBModel> arrayList) {
        ViewHolder viewHolder = (ViewHolder) abstractC0674e0;
        FavouriteM3UModel favouriteM3UModel = new FavouriteM3UModel();
        favouriteM3UModel.m14782h(arrayList.get(i10).m14816W());
        favouriteM3UModel.m14783i(SharepreferenceDBHandler.m15337A(this.f19910f));
        favouriteM3UModel.m14781g(arrayList.get(i10).getName());
        favouriteM3UModel.m14779e(arrayList.get(i10).m14827g());
        this.f19924t.m15156D0(favouriteM3UModel);
        viewHolder.ivFavourite.startAnimation(this.f19913i);
        viewHolder.ivFavourite.setVisibility(0);
    }

    /* renamed from: v0 */
    public final void m17161v0(ArrayList<FavouriteDBModel> arrayList, RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, ArrayList<LiveStreamsDBModel> arrayList2, int i11, RelativeLayout relativeLayout) {
        if (arrayList.size() > 0) {
            m17154D0(abstractC0674e0, i10, arrayList2, i11);
        } else {
            m17159t0(abstractC0674e0, i10, arrayList2, i11);
        }
        this.f19917m = true;
        Context context = this.f19910f;
        if (context instanceof LiveAllDataSingleActivity) {
            ((LiveAllDataSingleActivity) context).m15938e1();
        }
    }

    /* renamed from: w0 */
    public final void m17162w0(ArrayList<FavouriteM3UModel> arrayList, RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, ArrayList<LiveStreamsDBModel> arrayList2) {
        if (arrayList.size() > 0) {
            m17155E0(abstractC0674e0, i10, arrayList2);
        } else {
            m17160u0(abstractC0674e0, i10, arrayList2);
        }
        this.f19917m = true;
        Context context = this.f19910f;
        if (context instanceof LiveAllDataSingleActivity) {
            ((LiveAllDataSingleActivity) context).m15938e1();
        }
    }

    /* renamed from: x0 */
    public String m17163x0(String str) {
        try {
            this.f19928x = this.f19924t.m15217f1(str, "live");
            return "get_all";
        } catch (Exception e10) {
            return "get_all";
        }
    }

    /* renamed from: y0 */
    public int m17164y0(String str, String str2) {
        ArrayList<LiveStreamsDBModel> arrayList = this.f19928x;
        if (arrayList == null || arrayList.size() <= 0) {
            return 0;
        }
        if (str2.equals("m3u")) {
            for (int i10 = 0; i10 < this.f19928x.size(); i10++) {
                if (this.f19928x.get(i10).m14816W().equals(str)) {
                    return i10;
                }
            }
            return 0;
        }
        for (int i11 = 0; i11 < this.f19928x.size(); i11++) {
            if (this.f19928x.get(i11).m14811R().equals(str)) {
                return i11;
            }
        }
        return 0;
    }

    /* renamed from: z0 */
    public final void m17165z0() {
        ProgressDialog progressDialog = this.f19916l;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f19916l.dismiss();
    }
}

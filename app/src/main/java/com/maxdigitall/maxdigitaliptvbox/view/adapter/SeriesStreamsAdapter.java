package com.maxdigitall.maxdigitaliptvbox.view.adapter;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
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
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.callback.SeriesDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity;
import java.util.ArrayList;
import java.util.List;
import p151if.C5251a;
import p216m9.C5974n;
import p316s2.C8522c;
import p428yg.C10014t;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesStreamsAdapter.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesStreamsAdapter.class */
public class SeriesStreamsAdapter extends RecyclerView.AbstractC0677h<MyViewHolder> {

    /* renamed from: e */
    public Context f20770e;

    /* renamed from: f */
    public List<SeriesDBModel> f20771f;

    /* renamed from: g */
    public SharedPreferences f20772g;

    /* renamed from: h */
    public List<SeriesDBModel> f20773h;

    /* renamed from: i */
    public List<SeriesDBModel> f20774i;

    /* renamed from: j */
    public DatabaseHandler f20775j;

    /* renamed from: k */
    public LiveStreamDBHandler f20776k;

    /* renamed from: l */
    public MyViewHolder f20777l;

    /* renamed from: m */
    public SharedPreferences f20778m;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesStreamsAdapter$MyViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesStreamsAdapter$MyViewHolder.class */
    public static class MyViewHolder extends RecyclerView.AbstractC0674e0 {

        @BindView
        public CardView cardView;

        @BindView
        public ImageView ivChannelLogo;

        @BindView
        public ImageView ivFavourite;

        @BindView
        public LinearLayout llMenu;

        @BindView
        public ProgressBar progressBar;

        @BindView
        public RelativeLayout rlChannelBottom;

        @BindView
        public RelativeLayout rlMovieImage;

        @BindView
        public RelativeLayout rlStreamsLayout;

        @BindView
        public TextView tvChannelName;

        @BindView
        public TextView tvCurrentLive;

        @BindView
        public TextView tvStreamOptions;

        @BindView
        public TextView tvTime;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.m5627b(this, view);
            m4048L(false);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesStreamsAdapter$MyViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesStreamsAdapter$MyViewHolder_ViewBinding.class */
    public class MyViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public MyViewHolder f20779b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f20779b = myViewHolder;
            myViewHolder.ivChannelLogo = (ImageView) C8522c.m36739c(view, 2131428156, "field 'ivChannelLogo'", ImageView.class);
            myViewHolder.tvChannelName = (TextView) C8522c.m36739c(view, 2131429519, "field 'tvChannelName'", TextView.class);
            myViewHolder.cardView = (CardView) C8522c.m36739c(view, 2131427703, "field 'cardView'", CardView.class);
            myViewHolder.tvStreamOptions = (TextView) C8522c.m36739c(view, 2131429619, "field 'tvStreamOptions'", TextView.class);
            myViewHolder.ivFavourite = (ImageView) C8522c.m36739c(view, 2131428179, "field 'ivFavourite'", ImageView.class);
            myViewHolder.rlStreamsLayout = (RelativeLayout) C8522c.m36739c(view, 2131429058, "field 'rlStreamsLayout'", RelativeLayout.class);
            myViewHolder.rlChannelBottom = (RelativeLayout) C8522c.m36739c(view, 2131428966, "field 'rlChannelBottom'", RelativeLayout.class);
            myViewHolder.llMenu = (LinearLayout) C8522c.m36739c(view, 2131428441, "field 'llMenu'", LinearLayout.class);
            myViewHolder.progressBar = (ProgressBar) C8522c.m36739c(view, C5974n.f33499T, "field 'progressBar'", ProgressBar.class);
            myViewHolder.tvCurrentLive = (TextView) C8522c.m36739c(view, 2131429396, "field 'tvCurrentLive'", TextView.class);
            myViewHolder.tvTime = (TextView) C8522c.m36739c(view, 2131429630, "field 'tvTime'", TextView.class);
            myViewHolder.rlMovieImage = (RelativeLayout) C8522c.m36739c(view, 2131429014, "field 'rlMovieImage'", RelativeLayout.class);
        }

        @Override // butterknife.Unbinder
        /* renamed from: a */
        public void mo5629a() {
            MyViewHolder myViewHolder = this.f20779b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f20779b = null;
            myViewHolder.ivChannelLogo = null;
            myViewHolder.tvChannelName = null;
            myViewHolder.cardView = null;
            myViewHolder.tvStreamOptions = null;
            myViewHolder.ivFavourite = null;
            myViewHolder.rlStreamsLayout = null;
            myViewHolder.rlChannelBottom = null;
            myViewHolder.llMenu = null;
            myViewHolder.progressBar = null;
            myViewHolder.tvCurrentLive = null;
            myViewHolder.tvTime = null;
            myViewHolder.rlMovieImage = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesStreamsAdapter$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesStreamsAdapter$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesStreamsAdapter$a.class */
    public class ViewOnClickListenerC3510a implements View.OnClickListener {

        /* renamed from: b */
        public final String f20780b;

        /* renamed from: c */
        public final String f20781c;

        /* renamed from: d */
        public final String f20782d;

        /* renamed from: e */
        public final int f20783e;

        /* renamed from: f */
        public final String f20784f;

        /* renamed from: g */
        public final String f20785g;

        /* renamed from: h */
        public final String f20786h;

        /* renamed from: i */
        public final String f20787i;

        /* renamed from: j */
        public final String f20788j;

        /* renamed from: k */
        public final String f20789k;

        /* renamed from: l */
        public final String f20790l;

        /* renamed from: m */
        public final String f20791m;

        /* renamed from: n */
        public final String f20792n;

        /* renamed from: o */
        public final SeriesStreamsAdapter f20793o;

        public ViewOnClickListenerC3510a(SeriesStreamsAdapter seriesStreamsAdapter, String str, String str2, String str3, int i10, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
            this.f20793o = seriesStreamsAdapter;
            this.f20780b = str;
            this.f20781c = str2;
            this.f20782d = str3;
            this.f20783e = i10;
            this.f20784f = str4;
            this.f20785g = str5;
            this.f20786h = str6;
            this.f20787i = str7;
            this.f20788j = str8;
            this.f20789k = str9;
            this.f20790l = str10;
            this.f20791m = str11;
            this.f20792n = str12;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f20793o.m17466k0(this.f20780b, this.f20781c, this.f20782d, this.f20783e, this.f20784f, this.f20785g, this.f20786h, this.f20787i, this.f20788j, this.f20789k, this.f20790l, this.f20791m, this.f20792n);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesStreamsAdapter$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesStreamsAdapter$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesStreamsAdapter$b.class */
    public class ViewOnClickListenerC3511b implements View.OnClickListener {

        /* renamed from: b */
        public final String f20794b;

        /* renamed from: c */
        public final String f20795c;

        /* renamed from: d */
        public final String f20796d;

        /* renamed from: e */
        public final int f20797e;

        /* renamed from: f */
        public final String f20798f;

        /* renamed from: g */
        public final String f20799g;

        /* renamed from: h */
        public final String f20800h;

        /* renamed from: i */
        public final String f20801i;

        /* renamed from: j */
        public final String f20802j;

        /* renamed from: k */
        public final String f20803k;

        /* renamed from: l */
        public final String f20804l;

        /* renamed from: m */
        public final String f20805m;

        /* renamed from: n */
        public final String f20806n;

        /* renamed from: o */
        public final SeriesStreamsAdapter f20807o;

        public ViewOnClickListenerC3511b(SeriesStreamsAdapter seriesStreamsAdapter, String str, String str2, String str3, int i10, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
            this.f20807o = seriesStreamsAdapter;
            this.f20794b = str;
            this.f20795c = str2;
            this.f20796d = str3;
            this.f20797e = i10;
            this.f20798f = str4;
            this.f20799g = str5;
            this.f20800h = str6;
            this.f20801i = str7;
            this.f20802j = str8;
            this.f20803k = str9;
            this.f20804l = str10;
            this.f20805m = str11;
            this.f20806n = str12;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f20807o.m17466k0(this.f20794b, this.f20795c, this.f20796d, this.f20797e, this.f20798f, this.f20799g, this.f20800h, this.f20801i, this.f20802j, this.f20803k, this.f20804l, this.f20805m, this.f20806n);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesStreamsAdapter$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesStreamsAdapter$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesStreamsAdapter$c.class */
    public class ViewOnClickListenerC3512c implements View.OnClickListener {

        /* renamed from: b */
        public final String f20808b;

        /* renamed from: c */
        public final String f20809c;

        /* renamed from: d */
        public final String f20810d;

        /* renamed from: e */
        public final int f20811e;

        /* renamed from: f */
        public final String f20812f;

        /* renamed from: g */
        public final String f20813g;

        /* renamed from: h */
        public final String f20814h;

        /* renamed from: i */
        public final String f20815i;

        /* renamed from: j */
        public final String f20816j;

        /* renamed from: k */
        public final String f20817k;

        /* renamed from: l */
        public final String f20818l;

        /* renamed from: m */
        public final String f20819m;

        /* renamed from: n */
        public final String f20820n;

        /* renamed from: o */
        public final SeriesStreamsAdapter f20821o;

        public ViewOnClickListenerC3512c(SeriesStreamsAdapter seriesStreamsAdapter, String str, String str2, String str3, int i10, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
            this.f20821o = seriesStreamsAdapter;
            this.f20808b = str;
            this.f20809c = str2;
            this.f20810d = str3;
            this.f20811e = i10;
            this.f20812f = str4;
            this.f20813g = str5;
            this.f20814h = str6;
            this.f20815i = str7;
            this.f20816j = str8;
            this.f20817k = str9;
            this.f20818l = str10;
            this.f20819m = str11;
            this.f20820n = str12;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f20821o.m17466k0(this.f20808b, this.f20809c, this.f20810d, this.f20811e, this.f20812f, this.f20813g, this.f20814h, this.f20815i, this.f20816j, this.f20817k, this.f20818l, this.f20819m, this.f20820n);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesStreamsAdapter$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesStreamsAdapter$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesStreamsAdapter$d.class */
    public class ViewOnLongClickListenerC3513d implements View.OnLongClickListener {

        /* renamed from: b */
        public final MyViewHolder f20822b;

        /* renamed from: c */
        public final int f20823c;

        /* renamed from: d */
        public final String f20824d;

        /* renamed from: e */
        public final String f20825e;

        /* renamed from: f */
        public final String f20826f;

        /* renamed from: g */
        public final SeriesStreamsAdapter f20827g;

        public ViewOnLongClickListenerC3513d(SeriesStreamsAdapter seriesStreamsAdapter, MyViewHolder myViewHolder, int i10, String str, String str2, String str3) {
            this.f20827g = seriesStreamsAdapter;
            this.f20822b = myViewHolder;
            this.f20823c = i10;
            this.f20824d = str;
            this.f20825e = str2;
            this.f20826f = str3;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            this.f20827g.m17465j0(this.f20822b, this.f20823c, this.f20824d, this.f20825e, this.f20826f);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesStreamsAdapter$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesStreamsAdapter$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesStreamsAdapter$e.class */
    public class ViewOnLongClickListenerC3514e implements View.OnLongClickListener {

        /* renamed from: b */
        public final MyViewHolder f20828b;

        /* renamed from: c */
        public final int f20829c;

        /* renamed from: d */
        public final String f20830d;

        /* renamed from: e */
        public final String f20831e;

        /* renamed from: f */
        public final String f20832f;

        /* renamed from: g */
        public final SeriesStreamsAdapter f20833g;

        public ViewOnLongClickListenerC3514e(SeriesStreamsAdapter seriesStreamsAdapter, MyViewHolder myViewHolder, int i10, String str, String str2, String str3) {
            this.f20833g = seriesStreamsAdapter;
            this.f20828b = myViewHolder;
            this.f20829c = i10;
            this.f20830d = str;
            this.f20831e = str2;
            this.f20832f = str3;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            this.f20833g.m17465j0(this.f20828b, this.f20829c, this.f20830d, this.f20831e, this.f20832f);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesStreamsAdapter$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesStreamsAdapter$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesStreamsAdapter$f.class */
    public class ViewOnClickListenerC3515f implements View.OnClickListener {

        /* renamed from: b */
        public final MyViewHolder f20834b;

        /* renamed from: c */
        public final int f20835c;

        /* renamed from: d */
        public final String f20836d;

        /* renamed from: e */
        public final String f20837e;

        /* renamed from: f */
        public final String f20838f;

        /* renamed from: g */
        public final SeriesStreamsAdapter f20839g;

        public ViewOnClickListenerC3515f(SeriesStreamsAdapter seriesStreamsAdapter, MyViewHolder myViewHolder, int i10, String str, String str2, String str3) {
            this.f20839g = seriesStreamsAdapter;
            this.f20834b = myViewHolder;
            this.f20835c = i10;
            this.f20836d = str;
            this.f20837e = str2;
            this.f20838f = str3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f20839g.m17465j0(this.f20834b, this.f20835c, this.f20836d, this.f20837e, this.f20838f);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesStreamsAdapter$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesStreamsAdapter$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesStreamsAdapter$g.class */
    public class C3516g implements C0304c1.d {

        /* renamed from: a */
        public final MyViewHolder f20840a;

        /* renamed from: b */
        public final String f20841b;

        /* renamed from: c */
        public final int f20842c;

        /* renamed from: d */
        public final String f20843d;

        /* renamed from: e */
        public final String f20844e;

        /* renamed from: f */
        public final SeriesStreamsAdapter f20845f;

        public C3516g(SeriesStreamsAdapter seriesStreamsAdapter, MyViewHolder myViewHolder, String str, int i10, String str2, String str3) {
            this.f20845f = seriesStreamsAdapter;
            this.f20840a = myViewHolder;
            this.f20841b = str;
            this.f20842c = i10;
            this.f20843d = str2;
            this.f20844e = str3;
        }

        /* renamed from: a */
        public final void m17467a() {
            this.f20840a.cardView.performClick();
        }

        /* renamed from: b */
        public final void m17468b() {
            FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
            favouriteDBModel.m14767h(this.f20841b);
            favouriteDBModel.m14772m(this.f20842c);
            favouriteDBModel.m14770k(this.f20843d);
            favouriteDBModel.m14771l(this.f20844e);
            favouriteDBModel.m14774o(SharepreferenceDBHandler.m15337A(this.f20845f.f20770e));
            this.f20845f.f20775j.m15111l(favouriteDBModel, "series");
            this.f20840a.ivFavourite.setVisibility(0);
        }

        /* renamed from: c */
        public final void m17469c() {
            this.f20845f.f20775j.m15115t(this.f20842c, this.f20841b, "series", this.f20843d, SharepreferenceDBHandler.m15337A(this.f20845f.f20770e));
            this.f20840a.ivFavourite.setVisibility(4);
        }

        @Override // androidx.appcompat.widget.C0304c1.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId == 2131428644) {
                m17467a();
                return false;
            }
            if (itemId == 2131428754) {
                m17468b();
                return false;
            }
            if (itemId != 2131428775) {
                return false;
            }
            m17469c();
            return false;
        }
    }

    public SeriesStreamsAdapter(List<SeriesDBModel> list, Context context) {
        this.f20771f = list;
        this.f20770e = context;
        ArrayList arrayList = new ArrayList();
        this.f20773h = arrayList;
        arrayList.addAll(list);
        this.f20774i = list;
        this.f20775j = new DatabaseHandler(context);
        this.f20776k = new LiveStreamDBHandler(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(MyViewHolder myViewHolder, int i10) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        ImageView imageView;
        int i11;
        if (this.f20770e != null) {
            List<SeriesDBModel> list = this.f20771f;
            int i12 = -1;
            if (list != null) {
                SeriesDBModel seriesDBModel = list.get(i10);
                String m15038e = seriesDBModel.m15038e() != null ? seriesDBModel.m15038e() : "";
                str3 = seriesDBModel.m15037d() != null ? seriesDBModel.m15037d() : "";
                String m15040g = seriesDBModel.m15040g() != null ? seriesDBModel.m15040g() : "";
                if (seriesDBModel.m15051r() != -1) {
                    i12 = seriesDBModel.m15051r();
                }
                String m15044k = seriesDBModel.m15044k() != null ? seriesDBModel.m15044k() : "";
                String m15048o = seriesDBModel.m15048o() != null ? seriesDBModel.m15048o() : "";
                String m15043j = seriesDBModel.m15043j() != null ? seriesDBModel.m15043j() : "";
                String m15045l = seriesDBModel.m15045l() != null ? seriesDBModel.m15045l() : "";
                String m15046m = seriesDBModel.m15046m() != null ? seriesDBModel.m15046m() : "";
                str11 = seriesDBModel.m15050q() != null ? seriesDBModel.m15050q() : "";
                String m15047n = seriesDBModel.m15047n() != null ? seriesDBModel.m15047n() : "";
                str10 = seriesDBModel.m15049p() != null ? seriesDBModel.m15049p() : "";
                str12 = seriesDBModel.m15035b() != null ? seriesDBModel.m15035b() : "";
                String str13 = m15038e;
                str2 = m15040g;
                str = m15044k;
                str4 = str13;
                str5 = m15048o;
                str6 = m15043j;
                str7 = m15045l;
                str8 = m15046m;
                str9 = m15047n;
            } else {
                str = "";
                str2 = "";
                str3 = str2;
                str4 = str3;
                str5 = str4;
                str6 = str5;
                str7 = str6;
                str8 = str7;
                str9 = str8;
                str10 = str9;
                i12 = -1;
                str11 = str8;
                str12 = "";
            }
            this.f20772g = this.f20770e.getSharedPreferences("selectedPlayer", 0);
            myViewHolder.tvTime.setText("");
            myViewHolder.progressBar.setVisibility(8);
            myViewHolder.tvCurrentLive.setText("");
            myViewHolder.tvChannelName.setText(this.f20771f.get(i10).m15037d());
            myViewHolder.ivChannelLogo.setImageDrawable(null);
            if (str == null || str.equals("")) {
                myViewHolder.ivChannelLogo.setImageDrawable(this.f20770e.getResources().getDrawable(2131231660, null));
            } else {
                C10014t.m42105q(this.f20770e).m42116l(str).m42154j(2131231660).m42151g(myViewHolder.ivChannelLogo);
            }
            myViewHolder.cardView.setOnClickListener(new ViewOnClickListenerC3510a(this, str4, str3, str2, i12, str, str5, str6, str7, str8, str11, str9, str10, str12));
            myViewHolder.rlMovieImage.setOnClickListener(new ViewOnClickListenerC3511b(this, str4, str3, str2, i12, str, str5, str6, str7, str8, str11, str9, str10, str12));
            myViewHolder.rlStreamsLayout.setOnClickListener(new ViewOnClickListenerC3512c(this, str4, str3, str2, i12, str, str5, str6, str7, str8, str11, str9, str10, str12));
            ArrayList<FavouriteDBModel> m15112o = this.f20775j.m15112o(i12, str12, "series", SharepreferenceDBHandler.m15337A(this.f20770e));
            if (m15112o == null || m15112o.size() <= 0) {
                imageView = myViewHolder.ivFavourite;
                i11 = 4;
            } else {
                imageView = myViewHolder.ivFavourite;
                i11 = 0;
            }
            imageView.setVisibility(i11);
            myViewHolder.rlStreamsLayout.setOnLongClickListener(new ViewOnLongClickListenerC3513d(this, myViewHolder, i12, str12, str3, str4));
            myViewHolder.rlMovieImage.setOnLongClickListener(new ViewOnLongClickListenerC3514e(this, myViewHolder, i12, str12, str3, str4));
            myViewHolder.llMenu.setOnClickListener(new ViewOnClickListenerC3515f(this, myViewHolder, i12, str12, str3, str4));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder mo2998J(ViewGroup viewGroup, int i10) {
        SharedPreferences sharedPreferences = this.f20770e.getSharedPreferences("listgridview", 0);
        this.f20778m = sharedPreferences;
        int i11 = sharedPreferences.getInt("livestream", 0);
        C5251a.f30068u = i11;
        MyViewHolder myViewHolder = i11 == 1 ? new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(2131624330, viewGroup, false)) : new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(2131624331, viewGroup, false));
        this.f20777l = myViewHolder;
        return myViewHolder;
    }

    /* renamed from: j0 */
    public final void m17465j0(MyViewHolder myViewHolder, int i10, String str, String str2, String str3) {
        Menu m1275b;
        int i11;
        C0304c1 c0304c1 = new C0304c1(this.f20770e, myViewHolder.tvStreamOptions);
        c0304c1.m1277d(2131689478);
        if (this.f20775j.m15112o(i10, str, "series", SharepreferenceDBHandler.m15337A(this.f20770e)).size() > 0) {
            m1275b = c0304c1.m1275b();
            i11 = 2;
        } else {
            m1275b = c0304c1.m1275b();
            i11 = 1;
        }
        m1275b.getItem(i11).setVisible(false);
        c0304c1.m1279f(new C3516g(this, myViewHolder, str, i10, str2, str3));
        c0304c1.m1280g();
    }

    /* renamed from: k0 */
    public final void m17466k0(String str, String str2, String str3, int i10, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        if (this.f20770e != null) {
            Intent intent = new Intent(this.f20770e, (Class<?>) SeriesDetailActivity.class);
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
            this.f20770e.startActivity(intent);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f20771f.size();
    }
}

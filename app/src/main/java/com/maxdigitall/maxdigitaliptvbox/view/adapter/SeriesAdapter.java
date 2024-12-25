package com.maxdigitall.maxdigitaliptvbox.view.adapter;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailActivity;
import java.util.ArrayList;
import java.util.List;
import p151if.C5251a;
import p316s2.C8522c;
import p428yg.C10014t;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapter.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapter.class */
public class SeriesAdapter extends RecyclerView.AbstractC0677h<MyViewHolder> {

    /* renamed from: e */
    public Context f20331e;

    /* renamed from: f */
    public List<SeriesDBModel> f20332f;

    /* renamed from: g */
    public SharedPreferences f20333g;

    /* renamed from: h */
    public List<SeriesDBModel> f20334h;

    /* renamed from: i */
    public List<SeriesDBModel> f20335i;

    /* renamed from: j */
    public DatabaseHandler f20336j;

    /* renamed from: k */
    public SharedPreferences f20337k;

    /* renamed from: l */
    public SharedPreferences.Editor f20338l;

    /* renamed from: m */
    public Boolean f20339m = Boolean.FALSE;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapter$MyViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapter$MyViewHolder.class */
    public static class MyViewHolder extends RecyclerView.AbstractC0674e0 {

        @BindView
        public RelativeLayout Movie;

        @BindView
        public ImageView MovieImage;

        @BindView
        public TextView MovieName;

        @BindView
        public CardView cardView;

        @BindView
        public ImageView ivFavourite;

        @BindView
        public LinearLayout llMenu;

        @BindView
        public TextView tvStreamOptions;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.m5627b(this, view);
            m4048L(false);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapter$MyViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapter$MyViewHolder_ViewBinding.class */
    public class MyViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public MyViewHolder f20340b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f20340b = myViewHolder;
            myViewHolder.MovieName = (TextView) C8522c.m36739c(view, 2131429519, "field 'MovieName'", TextView.class);
            myViewHolder.Movie = (RelativeLayout) C8522c.m36739c(view, 2131429012, "field 'Movie'", RelativeLayout.class);
            myViewHolder.MovieImage = (ImageView) C8522c.m36739c(view, 2131428200, "field 'MovieImage'", ImageView.class);
            myViewHolder.cardView = (CardView) C8522c.m36739c(view, 2131427703, "field 'cardView'", CardView.class);
            myViewHolder.tvStreamOptions = (TextView) C8522c.m36739c(view, 2131429619, "field 'tvStreamOptions'", TextView.class);
            myViewHolder.ivFavourite = (ImageView) C8522c.m36739c(view, 2131428179, "field 'ivFavourite'", ImageView.class);
            myViewHolder.llMenu = (LinearLayout) C8522c.m36739c(view, 2131428441, "field 'llMenu'", LinearLayout.class);
        }

        @Override // butterknife.Unbinder
        /* renamed from: a */
        public void mo5629a() {
            MyViewHolder myViewHolder = this.f20340b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f20340b = null;
            myViewHolder.MovieName = null;
            myViewHolder.Movie = null;
            myViewHolder.MovieImage = null;
            myViewHolder.cardView = null;
            myViewHolder.tvStreamOptions = null;
            myViewHolder.ivFavourite = null;
            myViewHolder.llMenu = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapter$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapter$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapter$a.class */
    public class ViewOnClickListenerC3465a implements View.OnClickListener {

        /* renamed from: b */
        public final String f20341b;

        /* renamed from: c */
        public final String f20342c;

        /* renamed from: d */
        public final String f20343d;

        /* renamed from: e */
        public final int f20344e;

        /* renamed from: f */
        public final String f20345f;

        /* renamed from: g */
        public final String f20346g;

        /* renamed from: h */
        public final String f20347h;

        /* renamed from: i */
        public final String f20348i;

        /* renamed from: j */
        public final String f20349j;

        /* renamed from: k */
        public final String f20350k;

        /* renamed from: l */
        public final String f20351l;

        /* renamed from: m */
        public final String f20352m;

        /* renamed from: n */
        public final String f20353n;

        /* renamed from: o */
        public final String f20354o;

        /* renamed from: p */
        public final String f20355p;

        /* renamed from: q */
        public final String f20356q;

        /* renamed from: r */
        public final String f20357r;

        /* renamed from: s */
        public final SeriesAdapter f20358s;

        public ViewOnClickListenerC3465a(SeriesAdapter seriesAdapter, String str, String str2, String str3, int i10, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
            this.f20358s = seriesAdapter;
            this.f20341b = str;
            this.f20342c = str2;
            this.f20343d = str3;
            this.f20344e = i10;
            this.f20345f = str4;
            this.f20346g = str5;
            this.f20347h = str6;
            this.f20348i = str7;
            this.f20349j = str8;
            this.f20350k = str9;
            this.f20351l = str10;
            this.f20352m = str11;
            this.f20353n = str12;
            this.f20354o = str13;
            this.f20355p = str14;
            this.f20356q = str15;
            this.f20357r = str16;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f20358s.m17374j0(this.f20341b, this.f20342c, this.f20343d, this.f20344e, this.f20345f, this.f20346g, this.f20347h, this.f20348i, this.f20349j, this.f20350k, this.f20351l, this.f20352m, this.f20353n, this.f20354o, this.f20355p, this.f20356q, this.f20357r);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapter$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapter$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapter$b.class */
    public class ViewOnClickListenerC3466b implements View.OnClickListener {

        /* renamed from: b */
        public final String f20359b;

        /* renamed from: c */
        public final String f20360c;

        /* renamed from: d */
        public final String f20361d;

        /* renamed from: e */
        public final int f20362e;

        /* renamed from: f */
        public final String f20363f;

        /* renamed from: g */
        public final String f20364g;

        /* renamed from: h */
        public final String f20365h;

        /* renamed from: i */
        public final String f20366i;

        /* renamed from: j */
        public final String f20367j;

        /* renamed from: k */
        public final String f20368k;

        /* renamed from: l */
        public final String f20369l;

        /* renamed from: m */
        public final String f20370m;

        /* renamed from: n */
        public final String f20371n;

        /* renamed from: o */
        public final String f20372o;

        /* renamed from: p */
        public final String f20373p;

        /* renamed from: q */
        public final String f20374q;

        /* renamed from: r */
        public final String f20375r;

        /* renamed from: s */
        public final SeriesAdapter f20376s;

        public ViewOnClickListenerC3466b(SeriesAdapter seriesAdapter, String str, String str2, String str3, int i10, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
            this.f20376s = seriesAdapter;
            this.f20359b = str;
            this.f20360c = str2;
            this.f20361d = str3;
            this.f20362e = i10;
            this.f20363f = str4;
            this.f20364g = str5;
            this.f20365h = str6;
            this.f20366i = str7;
            this.f20367j = str8;
            this.f20368k = str9;
            this.f20369l = str10;
            this.f20370m = str11;
            this.f20371n = str12;
            this.f20372o = str13;
            this.f20373p = str14;
            this.f20374q = str15;
            this.f20375r = str16;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f20376s.m17374j0(this.f20359b, this.f20360c, this.f20361d, this.f20362e, this.f20363f, this.f20364g, this.f20365h, this.f20366i, this.f20367j, this.f20368k, this.f20369l, this.f20370m, this.f20371n, this.f20372o, this.f20373p, this.f20374q, this.f20375r);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapter$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapter$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapter$c.class */
    public class ViewOnClickListenerC3467c implements View.OnClickListener {

        /* renamed from: b */
        public final String f20377b;

        /* renamed from: c */
        public final String f20378c;

        /* renamed from: d */
        public final String f20379d;

        /* renamed from: e */
        public final int f20380e;

        /* renamed from: f */
        public final String f20381f;

        /* renamed from: g */
        public final String f20382g;

        /* renamed from: h */
        public final String f20383h;

        /* renamed from: i */
        public final String f20384i;

        /* renamed from: j */
        public final String f20385j;

        /* renamed from: k */
        public final String f20386k;

        /* renamed from: l */
        public final String f20387l;

        /* renamed from: m */
        public final String f20388m;

        /* renamed from: n */
        public final String f20389n;

        /* renamed from: o */
        public final String f20390o;

        /* renamed from: p */
        public final String f20391p;

        /* renamed from: q */
        public final String f20392q;

        /* renamed from: r */
        public final String f20393r;

        /* renamed from: s */
        public final SeriesAdapter f20394s;

        public ViewOnClickListenerC3467c(SeriesAdapter seriesAdapter, String str, String str2, String str3, int i10, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
            this.f20394s = seriesAdapter;
            this.f20377b = str;
            this.f20378c = str2;
            this.f20379d = str3;
            this.f20380e = i10;
            this.f20381f = str4;
            this.f20382g = str5;
            this.f20383h = str6;
            this.f20384i = str7;
            this.f20385j = str8;
            this.f20386k = str9;
            this.f20387l = str10;
            this.f20388m = str11;
            this.f20389n = str12;
            this.f20390o = str13;
            this.f20391p = str14;
            this.f20392q = str15;
            this.f20393r = str16;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f20394s.m17374j0(this.f20377b, this.f20378c, this.f20379d, this.f20380e, this.f20381f, this.f20382g, this.f20383h, this.f20384i, this.f20385j, this.f20386k, this.f20387l, this.f20388m, this.f20389n, this.f20390o, this.f20391p, this.f20392q, this.f20393r);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapter$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapter$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapter$d.class */
    public class ViewOnLongClickListenerC3468d implements View.OnLongClickListener {

        /* renamed from: b */
        public final MyViewHolder f20395b;

        /* renamed from: c */
        public final int f20396c;

        /* renamed from: d */
        public final String f20397d;

        /* renamed from: e */
        public final String f20398e;

        /* renamed from: f */
        public final String f20399f;

        /* renamed from: g */
        public final String f20400g;

        /* renamed from: h */
        public final SeriesAdapter f20401h;

        public ViewOnLongClickListenerC3468d(SeriesAdapter seriesAdapter, MyViewHolder myViewHolder, int i10, String str, String str2, String str3, String str4) {
            this.f20401h = seriesAdapter;
            this.f20395b = myViewHolder;
            this.f20396c = i10;
            this.f20397d = str;
            this.f20398e = str2;
            this.f20399f = str3;
            this.f20400g = str4;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            this.f20401h.m17373i0(this.f20395b, this.f20396c, this.f20397d, this.f20398e, this.f20399f, this.f20400g);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapter$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapter$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapter$e.class */
    public class ViewOnLongClickListenerC3469e implements View.OnLongClickListener {

        /* renamed from: b */
        public final MyViewHolder f20402b;

        /* renamed from: c */
        public final int f20403c;

        /* renamed from: d */
        public final String f20404d;

        /* renamed from: e */
        public final String f20405e;

        /* renamed from: f */
        public final String f20406f;

        /* renamed from: g */
        public final String f20407g;

        /* renamed from: h */
        public final SeriesAdapter f20408h;

        public ViewOnLongClickListenerC3469e(SeriesAdapter seriesAdapter, MyViewHolder myViewHolder, int i10, String str, String str2, String str3, String str4) {
            this.f20408h = seriesAdapter;
            this.f20402b = myViewHolder;
            this.f20403c = i10;
            this.f20404d = str;
            this.f20405e = str2;
            this.f20406f = str3;
            this.f20407g = str4;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            this.f20408h.m17373i0(this.f20402b, this.f20403c, this.f20404d, this.f20405e, this.f20406f, this.f20407g);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapter$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapter$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapter$f.class */
    public class ViewOnLongClickListenerC3470f implements View.OnLongClickListener {

        /* renamed from: b */
        public final MyViewHolder f20409b;

        /* renamed from: c */
        public final int f20410c;

        /* renamed from: d */
        public final String f20411d;

        /* renamed from: e */
        public final String f20412e;

        /* renamed from: f */
        public final String f20413f;

        /* renamed from: g */
        public final String f20414g;

        /* renamed from: h */
        public final SeriesAdapter f20415h;

        public ViewOnLongClickListenerC3470f(SeriesAdapter seriesAdapter, MyViewHolder myViewHolder, int i10, String str, String str2, String str3, String str4) {
            this.f20415h = seriesAdapter;
            this.f20409b = myViewHolder;
            this.f20410c = i10;
            this.f20411d = str;
            this.f20412e = str2;
            this.f20413f = str3;
            this.f20414g = str4;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            this.f20415h.m17373i0(this.f20409b, this.f20410c, this.f20411d, this.f20412e, this.f20413f, this.f20414g);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapter$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapter$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapter$g.class */
    public class ViewOnClickListenerC3471g implements View.OnClickListener {

        /* renamed from: b */
        public final String f20416b;

        /* renamed from: c */
        public final String f20417c;

        /* renamed from: d */
        public final String f20418d;

        /* renamed from: e */
        public final int f20419e;

        /* renamed from: f */
        public final String f20420f;

        /* renamed from: g */
        public final String f20421g;

        /* renamed from: h */
        public final String f20422h;

        /* renamed from: i */
        public final String f20423i;

        /* renamed from: j */
        public final String f20424j;

        /* renamed from: k */
        public final String f20425k;

        /* renamed from: l */
        public final String f20426l;

        /* renamed from: m */
        public final String f20427m;

        /* renamed from: n */
        public final String f20428n;

        /* renamed from: o */
        public final String f20429o;

        /* renamed from: p */
        public final String f20430p;

        /* renamed from: q */
        public final String f20431q;

        /* renamed from: r */
        public final String f20432r;

        /* renamed from: s */
        public final SeriesAdapter f20433s;

        public ViewOnClickListenerC3471g(SeriesAdapter seriesAdapter, String str, String str2, String str3, int i10, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
            this.f20433s = seriesAdapter;
            this.f20416b = str;
            this.f20417c = str2;
            this.f20418d = str3;
            this.f20419e = i10;
            this.f20420f = str4;
            this.f20421g = str5;
            this.f20422h = str6;
            this.f20423i = str7;
            this.f20424j = str8;
            this.f20425k = str9;
            this.f20426l = str10;
            this.f20427m = str11;
            this.f20428n = str12;
            this.f20429o = str13;
            this.f20430p = str14;
            this.f20431q = str15;
            this.f20432r = str16;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f20433s.m17374j0(this.f20416b, this.f20417c, this.f20418d, this.f20419e, this.f20420f, this.f20421g, this.f20422h, this.f20423i, this.f20424j, this.f20425k, this.f20426l, this.f20427m, this.f20428n, this.f20429o, this.f20430p, this.f20431q, this.f20432r);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapter$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapter$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapter$h.class */
    public class C3472h implements C0304c1.d {

        /* renamed from: a */
        public final MyViewHolder f20434a;

        /* renamed from: b */
        public final String f20435b;

        /* renamed from: c */
        public final int f20436c;

        /* renamed from: d */
        public final String f20437d;

        /* renamed from: e */
        public final String f20438e;

        /* renamed from: f */
        public final SeriesAdapter f20439f;

        public C3472h(SeriesAdapter seriesAdapter, MyViewHolder myViewHolder, String str, int i10, String str2, String str3) {
            this.f20439f = seriesAdapter;
            this.f20434a = myViewHolder;
            this.f20435b = str;
            this.f20436c = i10;
            this.f20437d = str2;
            this.f20438e = str3;
        }

        /* renamed from: a */
        public final void m17375a() {
            this.f20434a.cardView.performClick();
        }

        /* renamed from: b */
        public final void m17376b() {
            FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
            favouriteDBModel.m14767h(this.f20435b);
            favouriteDBModel.m14772m(this.f20436c);
            favouriteDBModel.m14770k(this.f20437d);
            favouriteDBModel.m14771l(this.f20438e);
            favouriteDBModel.m14774o(SharepreferenceDBHandler.m15337A(this.f20439f.f20331e));
            this.f20439f.f20336j.m15111l(favouriteDBModel, "series");
            this.f20434a.ivFavourite.setVisibility(0);
        }

        /* renamed from: c */
        public final void m17377c() {
            SeriesAdapter seriesAdapter = this.f20439f;
            seriesAdapter.f20336j.m15115t(this.f20436c, this.f20435b, "series", this.f20437d, SharepreferenceDBHandler.m15337A(seriesAdapter.f20331e));
            this.f20434a.ivFavourite.setVisibility(4);
        }

        @Override // androidx.appcompat.widget.C0304c1.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId == 2131428644) {
                m17375a();
                return false;
            }
            if (itemId == 2131428754) {
                m17376b();
                return false;
            }
            if (itemId != 2131428775) {
                return false;
            }
            m17377c();
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapter$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapter$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapter$i.class */
    public class ViewOnFocusChangeListenerC3473i implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f20440b;

        /* renamed from: c */
        public final SeriesAdapter f20441c;

        public ViewOnFocusChangeListenerC3473i(SeriesAdapter seriesAdapter, View view) {
            this.f20441c = seriesAdapter;
            this.f20440b = view;
        }

        /* renamed from: a */
        public final void m17378a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f20440b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m17379b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f20440b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m17380c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f20440b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            float f10 = 1.0f;
            if (z10) {
                if (z10) {
                    f10 = 1.1f;
                }
                m17379b(f10);
                Log.e("id is", "" + this.f20440b.getTag());
                return;
            }
            if (z10) {
                return;
            }
            if (z10) {
                f10 = 1.09f;
            }
            m17379b(f10);
            m17380c(f10);
            m17378a(z10);
        }
    }

    public SeriesAdapter(List<SeriesDBModel> list, Context context) {
        this.f20332f = list;
        this.f20331e = context;
        ArrayList arrayList = new ArrayList();
        this.f20334h = arrayList;
        arrayList.addAll(list);
        this.f20335i = list;
        this.f20336j = new DatabaseHandler(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
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
        String str13;
        String str14;
        String str15;
        String str16;
        if (this.f20331e != null) {
            List<SeriesDBModel> list = this.f20332f;
            int i11 = -1;
            if (list == null || list.size() <= 0) {
                str = "";
                str2 = "";
                str3 = str2;
                str4 = str3;
                str5 = str4;
                str6 = str5;
                str7 = str6;
                str8 = str7;
                str9 = str8;
                i11 = -1;
                str10 = str8;
                str11 = str7;
                str12 = str4;
                str13 = str3;
                str14 = str2;
                str15 = str2;
                str16 = "";
            } else {
                SeriesDBModel seriesDBModel = this.f20332f.get(i10);
                String m15038e = seriesDBModel.m15038e() != null ? seriesDBModel.m15038e() : "";
                String m15037d = seriesDBModel.m15037d() != null ? seriesDBModel.m15037d() : "";
                String m15040g = seriesDBModel.m15040g() != null ? seriesDBModel.m15040g() : "";
                if (seriesDBModel.m15051r() != -1) {
                    i11 = seriesDBModel.m15051r();
                }
                String m15044k = seriesDBModel.m15044k() != null ? seriesDBModel.m15044k() : "";
                String m15048o = seriesDBModel.m15048o() != null ? seriesDBModel.m15048o() : "";
                str13 = seriesDBModel.m15043j() != null ? seriesDBModel.m15043j() : "";
                String m15045l = seriesDBModel.m15045l() != null ? seriesDBModel.m15045l() : "";
                String m15046m = seriesDBModel.m15046m() != null ? seriesDBModel.m15046m() : "";
                String m15050q = seriesDBModel.m15050q() != null ? seriesDBModel.m15050q() : "";
                String m15047n = seriesDBModel.m15047n() != null ? seriesDBModel.m15047n() : "";
                String m15049p = seriesDBModel.m15049p() != null ? seriesDBModel.m15049p() : "";
                String m15035b = seriesDBModel.m15035b() != null ? seriesDBModel.m15035b() : "";
                String m15042i = seriesDBModel.m15042i() != null ? seriesDBModel.m15042i() : "";
                String m15034a = seriesDBModel.m15034a() != null ? seriesDBModel.m15034a() : "";
                String m15039f = seriesDBModel.m15039f() != null ? seriesDBModel.m15039f() : "";
                String m15036c = seriesDBModel.m15036c() != null ? seriesDBModel.m15036c() : "";
                String str17 = m15046m;
                String str18 = m15050q;
                str6 = m15047n;
                str7 = m15049p;
                String str19 = m15035b;
                str11 = m15042i;
                str8 = m15034a;
                str10 = m15039f;
                String str20 = m15038e;
                str14 = m15040g;
                str = m15037d;
                str16 = str19;
                str2 = m15044k;
                str15 = str20;
                str3 = m15048o;
                str4 = m15045l;
                str12 = str17;
                str5 = str18;
                str9 = m15036c;
            }
            SharedPreferences sharedPreferences = this.f20331e.getSharedPreferences("selectedPlayer", 0);
            this.f20333g = sharedPreferences;
            sharedPreferences.getString("selectedPlayer", "");
            if (i10 == 0 && myViewHolder.Movie != null && !this.f20339m.booleanValue()) {
                this.f20339m = Boolean.TRUE;
                myViewHolder.Movie.requestFocus();
            }
            SharedPreferences sharedPreferences2 = this.f20331e.getSharedPreferences("listgridview", 0);
            this.f20337k = sharedPreferences2;
            this.f20338l = sharedPreferences2.edit();
            C5251a.f30072w = this.f20337k.getInt("series", 0);
            myViewHolder.MovieName.setText(this.f20332f.get(i10).m15037d());
            myViewHolder.MovieImage.setImageDrawable(null);
            if (str2 == null || str2.equals("")) {
                myViewHolder.MovieImage.setImageDrawable(this.f20331e.getResources().getDrawable(2131231660, null));
            } else {
                C10014t.m42105q(this.f20331e).m42116l(str2).m42154j(2131231660).m42151g(myViewHolder.MovieImage);
            }
            String replace = str.trim().replace("'", " ");
            if (this.f20336j.m15112o(i11, str16, "series", SharepreferenceDBHandler.m15337A(this.f20331e)).size() > 0) {
                myViewHolder.ivFavourite.setVisibility(0);
            } else {
                myViewHolder.ivFavourite.setVisibility(4);
            }
            myViewHolder.cardView.setOnClickListener(new ViewOnClickListenerC3465a(this, str15, replace, str14, i11, str2, str3, str13, str4, str12, str5, str6, str7, str16, str11, str8, str10, str9));
            myViewHolder.MovieImage.setOnClickListener(new ViewOnClickListenerC3466b(this, str15, replace, str14, i11, str2, str3, str13, str4, str12, str5, str6, str7, str16, str11, str8, str10, str9));
            myViewHolder.Movie.setOnClickListener(new ViewOnClickListenerC3467c(this, str15, replace, str14, i11, str2, str3, str13, str4, str12, str5, str6, str7, str16, str11, str8, str10, str9));
            RelativeLayout relativeLayout = myViewHolder.Movie;
            relativeLayout.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3473i(this, relativeLayout));
            myViewHolder.Movie.setOnLongClickListener(new ViewOnLongClickListenerC3468d(this, myViewHolder, i11, str16, replace, str15, str9));
            myViewHolder.MovieImage.setOnLongClickListener(new ViewOnLongClickListenerC3469e(this, myViewHolder, i11, str16, replace, str15, str9));
            myViewHolder.cardView.setOnLongClickListener(new ViewOnLongClickListenerC3470f(this, myViewHolder, i11, str16, replace, str15, str9));
            myViewHolder.llMenu.setOnClickListener(new ViewOnClickListenerC3471g(this, str15, replace, str14, i11, str2, str3, str13, str4, str12, str5, str6, str7, str16, str11, str8, str10, str9));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder mo2998J(ViewGroup viewGroup, int i10) {
        LayoutInflater from;
        int i11;
        SharedPreferences sharedPreferences = this.f20331e.getSharedPreferences("listgridview", 0);
        this.f20337k = sharedPreferences;
        int i12 = sharedPreferences.getInt("series", 0);
        C5251a.f30072w = i12;
        if (i12 == 1) {
            from = LayoutInflater.from(viewGroup.getContext());
            i11 = 2131624559;
        } else {
            from = LayoutInflater.from(viewGroup.getContext());
            i11 = 2131624558;
        }
        return new MyViewHolder(from.inflate(i11, viewGroup, false));
    }

    /* renamed from: i0 */
    public final void m17373i0(MyViewHolder myViewHolder, int i10, String str, String str2, String str3, String str4) {
        Menu m1275b;
        int i11;
        C0304c1 c0304c1 = new C0304c1(this.f20331e, myViewHolder.tvStreamOptions);
        c0304c1.m1277d(2131689478);
        if (this.f20336j.m15112o(i10, str, "series", SharepreferenceDBHandler.m15337A(this.f20331e)).size() > 0) {
            m1275b = c0304c1.m1275b();
            i11 = 1;
        } else {
            m1275b = c0304c1.m1275b();
            i11 = 2;
        }
        m1275b.getItem(i11).setVisible(false);
        c0304c1.m1279f(new C3472h(this, myViewHolder, str, i10, str2, str3));
        c0304c1.m1280g();
    }

    /* renamed from: j0 */
    public final void m17374j0(String str, String str2, String str3, int i10, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        if (this.f20331e != null) {
            Intent intent = new Intent(this.f20331e, (Class<?>) SeriesDetailActivity.class);
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
            this.f20331e.startActivity(intent);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f20332f.size();
    }
}

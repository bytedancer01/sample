package com.maxdigitall.maxdigitaliptvbox.view.adapter;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
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
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteM3UModel;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.ExternalPlayerDataBase;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.RecentWatchDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.ExternalPlayerModelClass;
import com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesActivityNewFlowSubCategoriesM3U;
import com.maxdigitall.maxdigitaliptvbox.view.activity.SeriesDetailM3UActivity;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p151if.C5251a;
import p151if.C5255e;
import p316s2.C8522c;
import pf.C7705a;
import pf.C7707c;
import pf.C7708d;
import pf.C7709e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapterM3U.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapterM3U.class */
public class SeriesAdapterM3U extends RecyclerView.AbstractC0677h<MyViewHolder> {

    /* renamed from: D */
    public static String f20442D;

    /* renamed from: E */
    public static String f20443E;

    /* renamed from: A */
    public String f20444A;

    /* renamed from: B */
    public boolean f20445B;

    /* renamed from: C */
    public LiveStreamDBHandler f20446C;

    /* renamed from: e */
    public Context f20447e;

    /* renamed from: f */
    public List<LiveStreamsDBModel> f20448f;

    /* renamed from: g */
    public SharedPreferences f20449g;

    /* renamed from: h */
    public List<LiveStreamsDBModel> f20450h;

    /* renamed from: i */
    public String f20451i;

    /* renamed from: j */
    public List<LiveStreamsDBModel> f20452j;

    /* renamed from: k */
    public DatabaseHandler f20453k;

    /* renamed from: l */
    public String f20454l;

    /* renamed from: m */
    public RecentWatchDBHandler f20455m;

    /* renamed from: n */
    public SimpleDateFormat f20456n;

    /* renamed from: o */
    public SharedPreferences f20457o;

    /* renamed from: p */
    public int f20458p;

    /* renamed from: q */
    public int f20459q;

    /* renamed from: r */
    public Boolean f20460r;

    /* renamed from: s */
    public Date f20461s;

    /* renamed from: t */
    public Handler f20462t;

    /* renamed from: u */
    public int f20463u = 0;

    /* renamed from: v */
    public DateFormat f20464v;

    /* renamed from: w */
    public String f20465w;

    /* renamed from: x */
    public Boolean f20466x;

    /* renamed from: y */
    public ArrayList<ExternalPlayerModelClass> f20467y;

    /* renamed from: z */
    public SeriesActivityNewFlowSubCategoriesM3U f20468z;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapterM3U$MyViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapterM3U$MyViewHolder.class */
    public static class MyViewHolder extends RecyclerView.AbstractC0674e0 {

        @BindView
        public RelativeLayout Movie;

        @BindView
        public ImageView MovieImage;

        @BindView
        public CardView cardView;

        @BindView
        public TextView episodeName;

        @BindView
        public ImageView ivFavourite;

        @BindView
        public LinearLayout llMenu;

        @BindView
        public ImageView recentWatchIV;

        @BindView
        public TextView tvStreamOptions;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.m5627b(this, view);
            m4048L(false);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapterM3U$MyViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapterM3U$MyViewHolder_ViewBinding.class */
    public class MyViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public MyViewHolder f20469b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f20469b = myViewHolder;
            myViewHolder.episodeName = (TextView) C8522c.m36739c(view, 2131429519, "field 'episodeName'", TextView.class);
            myViewHolder.Movie = (RelativeLayout) C8522c.m36739c(view, 2131429012, "field 'Movie'", RelativeLayout.class);
            myViewHolder.MovieImage = (ImageView) C8522c.m36739c(view, 2131428200, "field 'MovieImage'", ImageView.class);
            myViewHolder.cardView = (CardView) C8522c.m36739c(view, 2131427703, "field 'cardView'", CardView.class);
            myViewHolder.tvStreamOptions = (TextView) C8522c.m36739c(view, 2131429619, "field 'tvStreamOptions'", TextView.class);
            myViewHolder.ivFavourite = (ImageView) C8522c.m36739c(view, 2131428179, "field 'ivFavourite'", ImageView.class);
            myViewHolder.llMenu = (LinearLayout) C8522c.m36739c(view, 2131428441, "field 'llMenu'", LinearLayout.class);
            myViewHolder.recentWatchIV = (ImageView) C8522c.m36739c(view, 2131428221, "field 'recentWatchIV'", ImageView.class);
        }

        @Override // butterknife.Unbinder
        /* renamed from: a */
        public void mo5629a() {
            MyViewHolder myViewHolder = this.f20469b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f20469b = null;
            myViewHolder.episodeName = null;
            myViewHolder.Movie = null;
            myViewHolder.MovieImage = null;
            myViewHolder.cardView = null;
            myViewHolder.tvStreamOptions = null;
            myViewHolder.ivFavourite = null;
            myViewHolder.llMenu = null;
            myViewHolder.recentWatchIV = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapterM3U$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapterM3U$a.class */
    public class ViewOnClickListenerC3474a implements View.OnClickListener {

        /* renamed from: b */
        public final int f20470b;

        /* renamed from: c */
        public final String f20471c;

        /* renamed from: d */
        public final String f20472d;

        /* renamed from: e */
        public final String f20473e;

        /* renamed from: f */
        public final String f20474f;

        /* renamed from: g */
        public final String f20475g;

        /* renamed from: h */
        public final String f20476h;

        /* renamed from: i */
        public final String f20477i;

        /* renamed from: j */
        public final String f20478j;

        /* renamed from: k */
        public final SeriesAdapterM3U f20479k;

        public ViewOnClickListenerC3474a(SeriesAdapterM3U seriesAdapterM3U, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f20479k = seriesAdapterM3U;
            this.f20470b = i10;
            this.f20471c = str;
            this.f20472d = str2;
            this.f20473e = str3;
            this.f20474f = str4;
            this.f20475g = str5;
            this.f20476h = str6;
            this.f20477i = str7;
            this.f20478j = str8;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f20479k.m17400w0(this.f20470b, this.f20471c, this.f20472d, this.f20473e, this.f20474f, this.f20475g, this.f20476h, this.f20477i, this.f20478j);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapterM3U$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapterM3U$b.class */
    public class ViewOnClickListenerC3475b implements View.OnClickListener {

        /* renamed from: b */
        public final int f20480b;

        /* renamed from: c */
        public final String f20481c;

        /* renamed from: d */
        public final String f20482d;

        /* renamed from: e */
        public final String f20483e;

        /* renamed from: f */
        public final String f20484f;

        /* renamed from: g */
        public final String f20485g;

        /* renamed from: h */
        public final String f20486h;

        /* renamed from: i */
        public final String f20487i;

        /* renamed from: j */
        public final String f20488j;

        /* renamed from: k */
        public final SeriesAdapterM3U f20489k;

        public ViewOnClickListenerC3475b(SeriesAdapterM3U seriesAdapterM3U, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f20489k = seriesAdapterM3U;
            this.f20480b = i10;
            this.f20481c = str;
            this.f20482d = str2;
            this.f20483e = str3;
            this.f20484f = str4;
            this.f20485g = str5;
            this.f20486h = str6;
            this.f20487i = str7;
            this.f20488j = str8;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f20489k.m17400w0(this.f20480b, this.f20481c, this.f20482d, this.f20483e, this.f20484f, this.f20485g, this.f20486h, this.f20487i, this.f20488j);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapterM3U$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapterM3U$c.class */
    public class ViewOnClickListenerC3476c implements View.OnClickListener {

        /* renamed from: b */
        public final int f20490b;

        /* renamed from: c */
        public final String f20491c;

        /* renamed from: d */
        public final String f20492d;

        /* renamed from: e */
        public final String f20493e;

        /* renamed from: f */
        public final String f20494f;

        /* renamed from: g */
        public final String f20495g;

        /* renamed from: h */
        public final String f20496h;

        /* renamed from: i */
        public final String f20497i;

        /* renamed from: j */
        public final String f20498j;

        /* renamed from: k */
        public final SeriesAdapterM3U f20499k;

        public ViewOnClickListenerC3476c(SeriesAdapterM3U seriesAdapterM3U, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f20499k = seriesAdapterM3U;
            this.f20490b = i10;
            this.f20491c = str;
            this.f20492d = str2;
            this.f20493e = str3;
            this.f20494f = str4;
            this.f20495g = str5;
            this.f20496h = str6;
            this.f20497i = str7;
            this.f20498j = str8;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f20499k.m17400w0(this.f20490b, this.f20491c, this.f20492d, this.f20493e, this.f20494f, this.f20495g, this.f20496h, this.f20497i, this.f20498j);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapterM3U$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapterM3U$d.class */
    public class ViewOnLongClickListenerC3477d implements View.OnLongClickListener {

        /* renamed from: b */
        public final MyViewHolder f20500b;

        /* renamed from: c */
        public final int f20501c;

        /* renamed from: d */
        public final String f20502d;

        /* renamed from: e */
        public final String f20503e;

        /* renamed from: f */
        public final String f20504f;

        /* renamed from: g */
        public final String f20505g;

        /* renamed from: h */
        public final String f20506h;

        /* renamed from: i */
        public final String f20507i;

        /* renamed from: j */
        public final String f20508j;

        /* renamed from: k */
        public final String f20509k;

        /* renamed from: l */
        public final SeriesAdapterM3U f20510l;

        public ViewOnLongClickListenerC3477d(SeriesAdapterM3U seriesAdapterM3U, MyViewHolder myViewHolder, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f20510l = seriesAdapterM3U;
            this.f20500b = myViewHolder;
            this.f20501c = i10;
            this.f20502d = str;
            this.f20503e = str2;
            this.f20504f = str3;
            this.f20505g = str4;
            this.f20506h = str5;
            this.f20507i = str6;
            this.f20508j = str7;
            this.f20509k = str8;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            this.f20510l.m17399v0(this.f20500b, this.f20501c, this.f20502d, this.f20503e, this.f20504f, this.f20505g, this.f20506h, this.f20507i, this.f20508j, this.f20509k);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapterM3U$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapterM3U$e.class */
    public class ViewOnLongClickListenerC3478e implements View.OnLongClickListener {

        /* renamed from: b */
        public final MyViewHolder f20511b;

        /* renamed from: c */
        public final int f20512c;

        /* renamed from: d */
        public final String f20513d;

        /* renamed from: e */
        public final String f20514e;

        /* renamed from: f */
        public final String f20515f;

        /* renamed from: g */
        public final String f20516g;

        /* renamed from: h */
        public final String f20517h;

        /* renamed from: i */
        public final String f20518i;

        /* renamed from: j */
        public final String f20519j;

        /* renamed from: k */
        public final String f20520k;

        /* renamed from: l */
        public final SeriesAdapterM3U f20521l;

        public ViewOnLongClickListenerC3478e(SeriesAdapterM3U seriesAdapterM3U, MyViewHolder myViewHolder, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f20521l = seriesAdapterM3U;
            this.f20511b = myViewHolder;
            this.f20512c = i10;
            this.f20513d = str;
            this.f20514e = str2;
            this.f20515f = str3;
            this.f20516g = str4;
            this.f20517h = str5;
            this.f20518i = str6;
            this.f20519j = str7;
            this.f20520k = str8;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            this.f20521l.m17399v0(this.f20511b, this.f20512c, this.f20513d, this.f20514e, this.f20515f, this.f20516g, this.f20517h, this.f20518i, this.f20519j, this.f20520k);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapterM3U$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapterM3U$f.class */
    public class ViewOnLongClickListenerC3479f implements View.OnLongClickListener {

        /* renamed from: b */
        public final MyViewHolder f20522b;

        /* renamed from: c */
        public final int f20523c;

        /* renamed from: d */
        public final String f20524d;

        /* renamed from: e */
        public final String f20525e;

        /* renamed from: f */
        public final String f20526f;

        /* renamed from: g */
        public final String f20527g;

        /* renamed from: h */
        public final String f20528h;

        /* renamed from: i */
        public final String f20529i;

        /* renamed from: j */
        public final String f20530j;

        /* renamed from: k */
        public final String f20531k;

        /* renamed from: l */
        public final SeriesAdapterM3U f20532l;

        public ViewOnLongClickListenerC3479f(SeriesAdapterM3U seriesAdapterM3U, MyViewHolder myViewHolder, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f20532l = seriesAdapterM3U;
            this.f20522b = myViewHolder;
            this.f20523c = i10;
            this.f20524d = str;
            this.f20525e = str2;
            this.f20526f = str3;
            this.f20527g = str4;
            this.f20528h = str5;
            this.f20529i = str6;
            this.f20530j = str7;
            this.f20531k = str8;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            this.f20532l.m17399v0(this.f20522b, this.f20523c, this.f20524d, this.f20525e, this.f20526f, this.f20527g, this.f20528h, this.f20529i, this.f20530j, this.f20531k);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapterM3U$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapterM3U$g.class */
    public class ViewOnClickListenerC3480g implements View.OnClickListener {

        /* renamed from: b */
        public final MyViewHolder f20533b;

        /* renamed from: c */
        public final int f20534c;

        /* renamed from: d */
        public final String f20535d;

        /* renamed from: e */
        public final String f20536e;

        /* renamed from: f */
        public final String f20537f;

        /* renamed from: g */
        public final String f20538g;

        /* renamed from: h */
        public final String f20539h;

        /* renamed from: i */
        public final String f20540i;

        /* renamed from: j */
        public final String f20541j;

        /* renamed from: k */
        public final String f20542k;

        /* renamed from: l */
        public final SeriesAdapterM3U f20543l;

        public ViewOnClickListenerC3480g(SeriesAdapterM3U seriesAdapterM3U, MyViewHolder myViewHolder, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f20543l = seriesAdapterM3U;
            this.f20533b = myViewHolder;
            this.f20534c = i10;
            this.f20535d = str;
            this.f20536e = str2;
            this.f20537f = str3;
            this.f20538g = str4;
            this.f20539h = str5;
            this.f20540i = str6;
            this.f20541j = str7;
            this.f20542k = str8;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f20543l.m17399v0(this.f20533b, this.f20534c, this.f20535d, this.f20536e, this.f20537f, this.f20538g, this.f20539h, this.f20540i, this.f20541j, this.f20542k);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapterM3U$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapterM3U$h.class */
    public class C3481h implements C0304c1.d {

        /* renamed from: a */
        public final String f20544a;

        /* renamed from: b */
        public final int f20545b;

        /* renamed from: c */
        public final String f20546c;

        /* renamed from: d */
        public final String f20547d;

        /* renamed from: e */
        public final String f20548e;

        /* renamed from: f */
        public final String f20549f;

        /* renamed from: g */
        public final String f20550g;

        /* renamed from: h */
        public final String f20551h;

        /* renamed from: i */
        public final String f20552i;

        /* renamed from: j */
        public final MyViewHolder f20553j;

        /* renamed from: k */
        public final SeriesAdapterM3U f20554k;

        public C3481h(SeriesAdapterM3U seriesAdapterM3U, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, MyViewHolder myViewHolder) {
            this.f20554k = seriesAdapterM3U;
            this.f20544a = str;
            this.f20545b = i10;
            this.f20546c = str2;
            this.f20547d = str3;
            this.f20548e = str4;
            this.f20549f = str5;
            this.f20550g = str6;
            this.f20551h = str7;
            this.f20552i = str8;
            this.f20553j = myViewHolder;
        }

        /* renamed from: a */
        public final void m17401a() {
            FavouriteM3UModel favouriteM3UModel = new FavouriteM3UModel();
            favouriteM3UModel.m14782h(this.f20544a);
            favouriteM3UModel.m14783i(SharepreferenceDBHandler.m15337A(this.f20554k.f20447e));
            favouriteM3UModel.m14781g(this.f20546c);
            favouriteM3UModel.m14779e(this.f20550g);
            this.f20554k.f20446C.m15156D0(favouriteM3UModel);
            this.f20553j.ivFavourite.setVisibility(0);
        }

        /* renamed from: b */
        public final void m17402b() {
            C5255e.m26220W(this.f20554k.f20447e, this.f20547d, this.f20545b, this.f20548e, this.f20549f, this.f20551h, this.f20546c, this.f20544a, 0);
        }

        /* renamed from: c */
        public final void m17403c() {
            SeriesAdapterM3U seriesAdapterM3U = this.f20554k;
            seriesAdapterM3U.f20446C.m15188R0(this.f20544a, SharepreferenceDBHandler.m15337A(seriesAdapterM3U.f20447e));
            this.f20553j.ivFavourite.setVisibility(4);
        }

        /* renamed from: d */
        public final void m17404d(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            if (this.f20554k.f20447e == null) {
                Log.e("Null hai context", ">>>>>>>>>>>True its Null");
                return;
            }
            Intent intent = new Intent(this.f20554k.f20447e, (Class<?>) SeriesDetailM3UActivity.class);
            intent.putExtra("series_num", str6);
            intent.putExtra("episode_name", str);
            intent.putExtra("series_name", this.f20554k.f20465w);
            intent.putExtra("series_icon", str7);
            intent.putExtra("episode_url", str8);
            intent.putExtra("series_categoryId", str5);
            this.f20554k.f20447e.startActivity(intent);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        
            r0 = new android.content.Intent(r11.f20554k.f20447e, (java.lang.Class<?>) com.maxdigitall.maxdigitaliptvbox.view.activity.PlayExternalPlayerActivity.class);
            r0.putExtra("url", r11.f20544a);
            r0.putExtra("app_name", ((com.maxdigitall.maxdigitaliptvbox.model.pojo.ExternalPlayerModelClass) r11.f20554k.f20467y.get(r13)).m15415a());
            r0.putExtra("packagename", ((com.maxdigitall.maxdigitaliptvbox.model.pojo.ExternalPlayerModelClass) r11.f20554k.f20467y.get(r13)).m15416b());
            r11.f20554k.f20447e.startActivity(r0);
         */
        @Override // androidx.appcompat.widget.C0304c1.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onMenuItemClick(android.view.MenuItem r12) {
            /*
                Method dump skipped, instructions count: 360
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U.C3481h.onMenuItemClick(android.view.MenuItem):boolean");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapterM3U$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapterM3U$i.class */
    public class RunnableC3482i implements Runnable {

        /* renamed from: b */
        public final String f20555b;

        /* renamed from: c */
        public final TextView f20556c;

        /* renamed from: d */
        public final SeriesAdapterM3U f20557d;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapterM3U$i$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U$i$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapterM3U$i$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final RunnableC3482i f20558b;

            public a(RunnableC3482i runnableC3482i) {
                this.f20558b = runnableC3482i;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0069  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r3 = this;
                    r0 = r3
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U$i r0 = r0.f20558b
                    java.lang.String r0 = r0.f20555b
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 == 0) goto L23
                    r0 = r3
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U$i r0 = r0.f20558b
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U r0 = r0.f20557d
                    r5 = r0
                    r0 = r5
                    java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U.m17393p0(r0)
                    r4 = r0
                L1a:
                    r0 = r5
                    r1 = r4
                    java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U.m17384g0(r0, r1)
                    goto L57
                L23:
                    r0 = r3
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U$i r0 = r0.f20558b
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U r0 = r0.f20557d
                    java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U.m17391n0(r0)
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L47
                    r0 = r3
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U$i r0 = r0.f20558b
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U r0 = r0.f20557d
                    java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U.m17391n0(r0)
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L57
                L47:
                    r0 = r3
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U$i r0 = r0.f20558b
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U r0 = r0.f20557d
                    r5 = r0
                    r0 = r5
                    java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U.m17391n0(r0)
                    r4 = r0
                    goto L1a
                L57:
                    r0 = r3
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U$i r0 = r0.f20558b
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U r0 = r0.f20557d
                    java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U.m17383f0(r0)
                    int r0 = r0.size()
                    if (r0 != 0) goto L74
                    r0 = r3
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U$i r0 = r0.f20558b
                    android.widget.TextView r0 = r0.f20556c
                    r1 = 0
                    r0.setVisibility(r1)
                L74:
                    r0 = r3
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U$i r0 = r0.f20558b
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U r0 = r0.f20557d
                    r4 = r0
                    r0 = r4
                    r1 = r4
                    int r1 = r1.f20459q
                    r0.f20458p = r1
                    r0 = r4
                    r0.m4099w()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U.RunnableC3482i.a.run():void");
            }
        }

        public RunnableC3482i(SeriesAdapterM3U seriesAdapterM3U, String str, TextView textView) {
            this.f20557d = seriesAdapterM3U;
            this.f20555b = str;
            this.f20556c = textView;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0070, code lost:
        
            if (r0.f20458p > r0.f20459q) goto L12;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r5 = this;
                r0 = r5
                com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U r0 = r0.f20557d
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = r1
                r2.<init>()
                java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U.m17392o0(r0, r1)
                r0 = r5
                com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U r0 = r0.f20557d
                r1 = r5
                java.lang.String r1 = r1.f20555b
                int r1 = r1.length()
                r0.f20459q = r1
                r0 = r5
                com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U r0 = r0.f20557d
                java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U.m17391n0(r0)
                if (r0 == 0) goto L33
                r0 = r5
                com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U r0 = r0.f20557d
                java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U.m17391n0(r0)
                r0.clear()
            L33:
                r0 = r5
                java.lang.String r0 = r0.f20555b
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L54
                r0 = r5
                com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U r0 = r0.f20557d
                java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U.m17391n0(r0)
                r1 = r5
                com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U r1 = r1.f20557d
                java.util.List r1 = com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U.m17393p0(r1)
                boolean r0 = r0.addAll(r1)
                goto Lcd
            L54:
                r0 = r5
                com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U r0 = r0.f20557d
                java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U.m17383f0(r0)
                int r0 = r0.size()
                if (r0 == 0) goto L73
                r0 = r5
                com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U r0 = r0.f20557d
                r6 = r0
                r0 = r6
                int r0 = r0.f20458p
                r1 = r6
                int r1 = r1.f20459q
                if (r0 <= r1) goto L81
            L73:
                r0 = r5
                com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U r0 = r0.f20557d
                r6 = r0
                r0 = r6
                r1 = r6
                java.util.List r1 = com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U.m17393p0(r1)
                java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U.m17384g0(r0, r1)
            L81:
                r0 = r5
                com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U r0 = r0.f20557d
                java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U.m17383f0(r0)
                java.util.Iterator r0 = r0.iterator()
                r7 = r0
            L8e:
                r0 = r7
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto Lcd
                r0 = r7
                java.lang.Object r0 = r0.next()
                com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel r0 = (com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel) r0
                r6 = r0
                r0 = r6
                java.lang.String r0 = r0.getName()
                if (r0 == 0) goto L8e
                r0 = r6
                java.lang.String r0 = r0.getName()
                java.lang.String r0 = r0.toLowerCase()
                r1 = r5
                java.lang.String r1 = r1.f20555b
                java.lang.String r1 = r1.toLowerCase()
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L8e
                r0 = r5
                com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U r0 = r0.f20557d
                java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U.m17391n0(r0)
                r1 = r6
                boolean r0 = r0.add(r1)
                goto L8e
            Lcd:
                r0 = r5
                com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U r0 = r0.f20557d
                android.content.Context r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U.m17387j0(r0)
                android.app.Activity r0 = (android.app.Activity) r0
                com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U$i$a r1 = new com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U$i$a
                r2 = r1
                r3 = r5
                r2.<init>(r3)
                r0.runOnUiThread(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U.RunnableC3482i.run():void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapterM3U$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/SeriesAdapterM3U$j.class */
    public class ViewOnFocusChangeListenerC3483j implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f20559b;

        /* renamed from: c */
        public final SeriesAdapterM3U f20560c;

        public ViewOnFocusChangeListenerC3483j(SeriesAdapterM3U seriesAdapterM3U, View view) {
            this.f20560c = seriesAdapterM3U;
            this.f20559b = view;
        }

        /* renamed from: a */
        public final void m17405a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f20559b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m17406b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f20559b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m17407c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f20559b, "scaleY", f10);
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
                m17406b(f10);
                Log.e("id is", "" + this.f20559b.getTag());
                return;
            }
            if (z10) {
                return;
            }
            if (z10) {
                f10 = 1.09f;
            }
            m17406b(f10);
            m17407c(f10);
            m17405a(z10);
        }
    }

    public SeriesAdapterM3U(List<LiveStreamsDBModel> list, Context context, boolean z10, SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U, String str) {
        String str2;
        String str3;
        this.f20460r = Boolean.TRUE;
        Boolean bool = Boolean.FALSE;
        this.f20466x = bool;
        this.f20444A = "";
        this.f20445B = true;
        this.f20448f = list;
        this.f20465w = str;
        this.f20447e = context;
        this.f20451i = C5255e.m26247n0(C7705a.m33651a());
        ArrayList arrayList = new ArrayList();
        this.f20450h = arrayList;
        arrayList.addAll(list);
        f20443E = context.getApplicationContext().getPackageName();
        this.f20452j = list;
        f20442D = m17395s0(context);
        this.f20453k = new DatabaseHandler(context);
        this.f20454l = C5255e.m26247n0(C7708d.m33672d());
        Locale locale = Locale.US;
        this.f20456n = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f20455m = new RecentWatchDBHandler(context);
        this.f20464v = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f20462t = new Handler();
        this.f20461s = new Date();
        this.f20445B = z10;
        SimpleDateFormat simpleDateFormat = this.f20456n;
        if (m17394q0(simpleDateFormat, simpleDateFormat.format(new Date(C7709e.m33680a(context))), this.f20464v.format(this.f20461s)) >= C7707c.m33667p() && (str2 = this.f20451i) != null && this.f20454l != null && (!f20442D.equals(str2) || (this.f20451i != null && (str3 = this.f20454l) != null && !f20443E.equals(str3)))) {
            this.f20460r = bool;
        }
        this.f20468z = seriesActivityNewFlowSubCategoriesM3U;
        this.f20446C = new LiveStreamDBHandler(context);
    }

    public SeriesAdapterM3U(List<LiveStreamsDBModel> list, Context context, boolean z10, String str) {
        String str2;
        String str3;
        this.f20460r = Boolean.TRUE;
        Boolean bool = Boolean.FALSE;
        this.f20466x = bool;
        this.f20444A = "";
        this.f20445B = true;
        this.f20448f = list;
        this.f20465w = str;
        this.f20447e = context;
        this.f20451i = C5255e.m26247n0(C7705a.m33651a());
        f20443E = context.getApplicationContext().getPackageName();
        this.f20450h = new ArrayList();
        f20442D = m17395s0(context);
        this.f20454l = C5255e.m26247n0(C7708d.m33672d());
        this.f20450h.addAll(list);
        Locale locale = Locale.US;
        this.f20456n = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f20452j = list;
        this.f20464v = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f20453k = new DatabaseHandler(context);
        this.f20461s = new Date();
        this.f20455m = new RecentWatchDBHandler(context);
        SimpleDateFormat simpleDateFormat = this.f20456n;
        if (m17394q0(simpleDateFormat, simpleDateFormat.format(new Date(C7709e.m33680a(context))), this.f20464v.format(this.f20461s)) >= C7707c.m33667p() && (str2 = this.f20451i) != null && this.f20454l != null && (!f20442D.equals(str2) || (this.f20451i != null && (str3 = this.f20454l) != null && !f20443E.equals(str3)))) {
            this.f20460r = bool;
        }
        this.f20462t = new Handler();
        this.f20445B = z10;
        this.f20446C = new LiveStreamDBHandler(context);
    }

    /* renamed from: q0 */
    public static long m17394q0(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: s0 */
    public static String m17395s0(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f20448f.size();
    }

    /* renamed from: r0 */
    public void m17396r0(String str, TextView textView) {
        new Thread(new RunnableC3482i(this, str, textView)).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01a2  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo2996G(com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U.MyViewHolder r16, @android.annotation.SuppressLint({"RecyclerView"}) int r17) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U.mo2996G(com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAdapterM3U$MyViewHolder, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder mo2998J(ViewGroup viewGroup, int i10) {
        LayoutInflater from;
        int i11;
        SharedPreferences sharedPreferences = this.f20447e.getSharedPreferences("listgridview", 0);
        this.f20457o = sharedPreferences;
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

    /* renamed from: v0 */
    public final void m17399v0(MyViewHolder myViewHolder, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Menu m1275b;
        int i11;
        Context context = this.f20447e;
        if (context != null) {
            C0304c1 c0304c1 = new C0304c1(context, myViewHolder.tvStreamOptions);
            c0304c1.m1277d(2131689475);
            ArrayList<FavouriteM3UModel> m15159E0 = this.f20446C.m15159E0(str7, SharepreferenceDBHandler.m15337A(this.f20447e));
            if (m15159E0 == null || m15159E0.size() <= 0) {
                m1275b = c0304c1.m1275b();
                i11 = 3;
            } else {
                m1275b = c0304c1.m1275b();
                i11 = 4;
            }
            m1275b.getItem(i11).setVisible(true);
            if (this.f20445B) {
                c0304c1.m1275b().getItem(5).setVisible(false);
            } else {
                c0304c1.m1275b().getItem(5).setVisible(true);
            }
            try {
                if (this.f20460r.booleanValue()) {
                    this.f20467y = new ArrayList<>();
                    ArrayList<ExternalPlayerModelClass> m15132o = new ExternalPlayerDataBase(this.f20447e).m15132o();
                    this.f20467y = m15132o;
                    if (m15132o != null && m15132o.size() > 0) {
                        for (int i12 = 0; i12 < this.f20467y.size(); i12++) {
                            c0304c1.m1275b().add(0, i12, i12, this.f20467y.get(i12).m15415a());
                        }
                    }
                }
            } catch (Exception e10) {
            }
            c0304c1.m1279f(new C3481h(this, str7, i10, str2, str3, str4, str5, str, str6, str8, myViewHolder));
            c0304c1.m1280g();
        }
    }

    /* renamed from: w0 */
    public final void m17400w0(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (this.f20447e == null) {
            Log.e("Null hai context", ">>>>>>>>>>>True its Null");
            return;
        }
        Intent intent = new Intent(this.f20447e, (Class<?>) SeriesDetailM3UActivity.class);
        intent.putExtra("series_num", str6);
        intent.putExtra("episode_name", str);
        intent.putExtra("series_name", this.f20465w);
        intent.putExtra("series_icon", str7);
        intent.putExtra("episode_url", str8);
        intent.putExtra("series_categoryId", str5);
        this.f20447e.startActivity(intent);
    }
}

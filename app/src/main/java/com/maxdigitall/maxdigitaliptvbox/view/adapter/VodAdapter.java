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
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.FavouriteM3UModel;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.ExternalPlayerDataBase;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.RecentWatchDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.ExternalPlayerModelClass;
import com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.ViewDetailsTMDBActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.VodActivityNewFlowSubCategories;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p151if.C5251a;
import p151if.C5255e;
import p216m9.C5938b;
import p216m9.C5947e;
import p316s2.C8522c;
import pf.C7705a;
import pf.C7707c;
import pf.C7708d;
import pf.C7709e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAdapter.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAdapter.class */
public class VodAdapter extends RecyclerView.AbstractC0677h<MyViewHolder> {

    /* renamed from: H */
    public static String f21003H;

    /* renamed from: I */
    public static String f21004I;

    /* renamed from: A */
    public Boolean f21005A;

    /* renamed from: B */
    public ArrayList<ExternalPlayerModelClass> f21006B;

    /* renamed from: C */
    public VodActivityNewFlowSubCategories f21007C;

    /* renamed from: D */
    public String f21008D;

    /* renamed from: E */
    public boolean f21009E;

    /* renamed from: F */
    public C5947e f21010F;

    /* renamed from: G */
    public int f21011G;

    /* renamed from: e */
    public Context f21012e;

    /* renamed from: f */
    public List<LiveStreamsDBModel> f21013f;

    /* renamed from: g */
    public SharedPreferences f21014g;

    /* renamed from: h */
    public List<LiveStreamsDBModel> f21015h;

    /* renamed from: i */
    public String f21016i;

    /* renamed from: j */
    public List<LiveStreamsDBModel> f21017j;

    /* renamed from: k */
    public DatabaseHandler f21018k;

    /* renamed from: l */
    public LiveStreamDBHandler f21019l;

    /* renamed from: m */
    public String f21020m;

    /* renamed from: n */
    public RecentWatchDBHandler f21021n;

    /* renamed from: o */
    public SimpleDateFormat f21022o;

    /* renamed from: p */
    public SharedPreferences f21023p;

    /* renamed from: q */
    public SharedPreferences.Editor f21024q;

    /* renamed from: r */
    public SharedPreferences f21025r;

    /* renamed from: s */
    public SharedPreferences.Editor f21026s;

    /* renamed from: t */
    public int f21027t;

    /* renamed from: u */
    public int f21028u;

    /* renamed from: v */
    public Boolean f21029v;

    /* renamed from: w */
    public Date f21030w;

    /* renamed from: x */
    public Handler f21031x;

    /* renamed from: y */
    public int f21032y = 0;

    /* renamed from: z */
    public DateFormat f21033z;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAdapter$MyViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAdapter$MyViewHolder.class */
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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAdapter$MyViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAdapter$MyViewHolder_ViewBinding.class */
    public class MyViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public MyViewHolder f21034b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f21034b = myViewHolder;
            myViewHolder.MovieName = (TextView) C8522c.m36739c(view, 2131429602, "field 'MovieName'", TextView.class);
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
            MyViewHolder myViewHolder = this.f21034b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f21034b = null;
            myViewHolder.MovieName = null;
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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAdapter$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAdapter$a.class */
    public class RunnableC3536a implements Runnable {

        /* renamed from: b */
        public final String f21035b;

        /* renamed from: c */
        public final TextView f21036c;

        /* renamed from: d */
        public final VodAdapter f21037d;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAdapter$a$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter$a$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAdapter$a$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final RunnableC3536a f21038b;

            public a(RunnableC3536a runnableC3536a) {
                this.f21038b = runnableC3536a;
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
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter$a r0 = r0.f21038b
                    java.lang.String r0 = r0.f21035b
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 == 0) goto L23
                    r0 = r3
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter$a r0 = r0.f21038b
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter r0 = r0.f21037d
                    r5 = r0
                    r0 = r5
                    java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter.m17513f0(r0)
                    r4 = r0
                L1a:
                    r0 = r5
                    r1 = r4
                    java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter.m17515h0(r0, r1)
                    goto L57
                L23:
                    r0 = r3
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter$a r0 = r0.f21038b
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter r0 = r0.f21037d
                    java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter.m17523p0(r0)
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L47
                    r0 = r3
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter$a r0 = r0.f21038b
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter r0 = r0.f21037d
                    java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter.m17523p0(r0)
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L57
                L47:
                    r0 = r3
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter$a r0 = r0.f21038b
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter r0 = r0.f21037d
                    r5 = r0
                    r0 = r5
                    java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter.m17523p0(r0)
                    r4 = r0
                    goto L1a
                L57:
                    r0 = r3
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter$a r0 = r0.f21038b
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter r0 = r0.f21037d
                    java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter.m17514g0(r0)
                    int r0 = r0.size()
                    if (r0 != 0) goto L74
                    r0 = r3
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter$a r0 = r0.f21038b
                    android.widget.TextView r0 = r0.f21036c
                    r1 = 0
                    r0.setVisibility(r1)
                L74:
                    r0 = r3
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter$a r0 = r0.f21038b
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter r0 = r0.f21037d
                    r4 = r0
                    r0 = r4
                    r1 = r4
                    int r1 = r1.f21028u
                    r0.f21027t = r1
                    r0 = r4
                    r0.m4099w()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter.RunnableC3536a.a.run():void");
            }
        }

        public RunnableC3536a(VodAdapter vodAdapter, String str, TextView textView) {
            this.f21037d = vodAdapter;
            this.f21035b = str;
            this.f21036c = textView;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
        
            if (r0.f21027t > r0.f21028u) goto L13;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 239
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter.RunnableC3536a.run():void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAdapter$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAdapter$b.class */
    public class ViewOnClickListenerC3537b implements View.OnClickListener {

        /* renamed from: b */
        public final int f21039b;

        /* renamed from: c */
        public final String f21040c;

        /* renamed from: d */
        public final String f21041d;

        /* renamed from: e */
        public final String f21042e;

        /* renamed from: f */
        public final String f21043f;

        /* renamed from: g */
        public final String f21044g;

        /* renamed from: h */
        public final String f21045h;

        /* renamed from: i */
        public final String f21046i;

        /* renamed from: j */
        public final String f21047j;

        /* renamed from: k */
        public final VodAdapter f21048k;

        public ViewOnClickListenerC3537b(VodAdapter vodAdapter, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f21048k = vodAdapter;
            this.f21039b = i10;
            this.f21040c = str;
            this.f21041d = str2;
            this.f21042e = str3;
            this.f21043f = str4;
            this.f21044g = str5;
            this.f21045h = str6;
            this.f21046i = str7;
            this.f21047j = str8;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f21048k.m17532y0(this.f21039b, this.f21040c, this.f21041d, this.f21042e, this.f21043f, this.f21044g, this.f21045h, this.f21046i, this.f21047j);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAdapter$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAdapter$c.class */
    public class ViewOnClickListenerC3538c implements View.OnClickListener {

        /* renamed from: b */
        public final int f21049b;

        /* renamed from: c */
        public final String f21050c;

        /* renamed from: d */
        public final String f21051d;

        /* renamed from: e */
        public final String f21052e;

        /* renamed from: f */
        public final String f21053f;

        /* renamed from: g */
        public final String f21054g;

        /* renamed from: h */
        public final String f21055h;

        /* renamed from: i */
        public final String f21056i;

        /* renamed from: j */
        public final String f21057j;

        /* renamed from: k */
        public final VodAdapter f21058k;

        public ViewOnClickListenerC3538c(VodAdapter vodAdapter, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f21058k = vodAdapter;
            this.f21049b = i10;
            this.f21050c = str;
            this.f21051d = str2;
            this.f21052e = str3;
            this.f21053f = str4;
            this.f21054g = str5;
            this.f21055h = str6;
            this.f21056i = str7;
            this.f21057j = str8;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f21058k.m17532y0(this.f21049b, this.f21050c, this.f21051d, this.f21052e, this.f21053f, this.f21054g, this.f21055h, this.f21056i, this.f21057j);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAdapter$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAdapter$d.class */
    public class ViewOnClickListenerC3539d implements View.OnClickListener {

        /* renamed from: b */
        public final int f21059b;

        /* renamed from: c */
        public final String f21060c;

        /* renamed from: d */
        public final String f21061d;

        /* renamed from: e */
        public final String f21062e;

        /* renamed from: f */
        public final String f21063f;

        /* renamed from: g */
        public final String f21064g;

        /* renamed from: h */
        public final String f21065h;

        /* renamed from: i */
        public final String f21066i;

        /* renamed from: j */
        public final String f21067j;

        /* renamed from: k */
        public final VodAdapter f21068k;

        public ViewOnClickListenerC3539d(VodAdapter vodAdapter, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f21068k = vodAdapter;
            this.f21059b = i10;
            this.f21060c = str;
            this.f21061d = str2;
            this.f21062e = str3;
            this.f21063f = str4;
            this.f21064g = str5;
            this.f21065h = str6;
            this.f21066i = str7;
            this.f21067j = str8;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f21068k.m17532y0(this.f21059b, this.f21060c, this.f21061d, this.f21062e, this.f21063f, this.f21064g, this.f21065h, this.f21066i, this.f21067j);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAdapter$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAdapter$e.class */
    public class ViewOnLongClickListenerC3540e implements View.OnLongClickListener {

        /* renamed from: b */
        public final MyViewHolder f21069b;

        /* renamed from: c */
        public final int f21070c;

        /* renamed from: d */
        public final String f21071d;

        /* renamed from: e */
        public final String f21072e;

        /* renamed from: f */
        public final String f21073f;

        /* renamed from: g */
        public final String f21074g;

        /* renamed from: h */
        public final String f21075h;

        /* renamed from: i */
        public final String f21076i;

        /* renamed from: j */
        public final String f21077j;

        /* renamed from: k */
        public final String f21078k;

        /* renamed from: l */
        public final VodAdapter f21079l;

        public ViewOnLongClickListenerC3540e(VodAdapter vodAdapter, MyViewHolder myViewHolder, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f21079l = vodAdapter;
            this.f21069b = myViewHolder;
            this.f21070c = i10;
            this.f21071d = str;
            this.f21072e = str2;
            this.f21073f = str3;
            this.f21074g = str4;
            this.f21075h = str5;
            this.f21076i = str6;
            this.f21077j = str7;
            this.f21078k = str8;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (SharepreferenceDBHandler.m15373f(this.f21079l.f21012e).equals("m3u")) {
                this.f21079l.m17531x0(this.f21069b, this.f21070c, this.f21071d, this.f21072e, this.f21073f, this.f21074g, this.f21075h, this.f21076i, this.f21077j, this.f21078k);
                return true;
            }
            this.f21079l.m17530w0(this.f21069b, this.f21070c, this.f21071d, this.f21072e, this.f21073f, this.f21074g, this.f21075h, this.f21076i, this.f21077j);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAdapter$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAdapter$f.class */
    public class ViewOnLongClickListenerC3541f implements View.OnLongClickListener {

        /* renamed from: b */
        public final MyViewHolder f21080b;

        /* renamed from: c */
        public final int f21081c;

        /* renamed from: d */
        public final String f21082d;

        /* renamed from: e */
        public final String f21083e;

        /* renamed from: f */
        public final String f21084f;

        /* renamed from: g */
        public final String f21085g;

        /* renamed from: h */
        public final String f21086h;

        /* renamed from: i */
        public final String f21087i;

        /* renamed from: j */
        public final String f21088j;

        /* renamed from: k */
        public final String f21089k;

        /* renamed from: l */
        public final int f21090l;

        /* renamed from: m */
        public final VodAdapter f21091m;

        public ViewOnLongClickListenerC3541f(VodAdapter vodAdapter, MyViewHolder myViewHolder, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11) {
            this.f21091m = vodAdapter;
            this.f21080b = myViewHolder;
            this.f21081c = i10;
            this.f21082d = str;
            this.f21083e = str2;
            this.f21084f = str3;
            this.f21085g = str4;
            this.f21086h = str5;
            this.f21087i = str6;
            this.f21088j = str7;
            this.f21089k = str8;
            this.f21090l = i11;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (SharepreferenceDBHandler.m15373f(this.f21091m.f21012e).equals("m3u")) {
                this.f21091m.m17531x0(this.f21080b, this.f21081c, this.f21082d, this.f21083e, this.f21084f, this.f21085g, this.f21086h, this.f21087i, this.f21088j, this.f21089k);
                return true;
            }
            this.f21091m.m17530w0(this.f21080b, this.f21090l, this.f21082d, this.f21083e, this.f21084f, this.f21085g, this.f21086h, this.f21087i, this.f21088j);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAdapter$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAdapter$g.class */
    public class ViewOnLongClickListenerC3542g implements View.OnLongClickListener {

        /* renamed from: b */
        public final MyViewHolder f21092b;

        /* renamed from: c */
        public final int f21093c;

        /* renamed from: d */
        public final String f21094d;

        /* renamed from: e */
        public final String f21095e;

        /* renamed from: f */
        public final String f21096f;

        /* renamed from: g */
        public final String f21097g;

        /* renamed from: h */
        public final String f21098h;

        /* renamed from: i */
        public final String f21099i;

        /* renamed from: j */
        public final String f21100j;

        /* renamed from: k */
        public final String f21101k;

        /* renamed from: l */
        public final int f21102l;

        /* renamed from: m */
        public final VodAdapter f21103m;

        public ViewOnLongClickListenerC3542g(VodAdapter vodAdapter, MyViewHolder myViewHolder, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11) {
            this.f21103m = vodAdapter;
            this.f21092b = myViewHolder;
            this.f21093c = i10;
            this.f21094d = str;
            this.f21095e = str2;
            this.f21096f = str3;
            this.f21097g = str4;
            this.f21098h = str5;
            this.f21099i = str6;
            this.f21100j = str7;
            this.f21101k = str8;
            this.f21102l = i11;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (SharepreferenceDBHandler.m15373f(this.f21103m.f21012e).equals("m3u")) {
                this.f21103m.m17531x0(this.f21092b, this.f21093c, this.f21094d, this.f21095e, this.f21096f, this.f21097g, this.f21098h, this.f21099i, this.f21100j, this.f21101k);
                return true;
            }
            this.f21103m.m17530w0(this.f21092b, this.f21102l, this.f21094d, this.f21095e, this.f21096f, this.f21097g, this.f21098h, this.f21099i, this.f21100j);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAdapter$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAdapter$h.class */
    public class ViewOnClickListenerC3543h implements View.OnClickListener {

        /* renamed from: b */
        public final MyViewHolder f21104b;

        /* renamed from: c */
        public final int f21105c;

        /* renamed from: d */
        public final String f21106d;

        /* renamed from: e */
        public final String f21107e;

        /* renamed from: f */
        public final String f21108f;

        /* renamed from: g */
        public final String f21109g;

        /* renamed from: h */
        public final String f21110h;

        /* renamed from: i */
        public final String f21111i;

        /* renamed from: j */
        public final String f21112j;

        /* renamed from: k */
        public final VodAdapter f21113k;

        public ViewOnClickListenerC3543h(VodAdapter vodAdapter, MyViewHolder myViewHolder, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.f21113k = vodAdapter;
            this.f21104b = myViewHolder;
            this.f21105c = i10;
            this.f21106d = str;
            this.f21107e = str2;
            this.f21108f = str3;
            this.f21109g = str4;
            this.f21110h = str5;
            this.f21111i = str6;
            this.f21112j = str7;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f21113k.m17530w0(this.f21104b, this.f21105c, this.f21106d, this.f21107e, this.f21108f, this.f21109g, this.f21110h, this.f21111i, this.f21112j);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAdapter$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAdapter$i.class */
    public class C3544i implements C0304c1.d {

        /* renamed from: a */
        public final String f21114a;

        /* renamed from: b */
        public final int f21115b;

        /* renamed from: c */
        public final String f21116c;

        /* renamed from: d */
        public final String f21117d;

        /* renamed from: e */
        public final String f21118e;

        /* renamed from: f */
        public final String f21119f;

        /* renamed from: g */
        public final String f21120g;

        /* renamed from: h */
        public final String f21121h;

        /* renamed from: i */
        public final String f21122i;

        /* renamed from: j */
        public final MyViewHolder f21123j;

        /* renamed from: k */
        public final VodAdapter f21124k;

        public C3544i(VodAdapter vodAdapter, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, MyViewHolder myViewHolder) {
            this.f21124k = vodAdapter;
            this.f21114a = str;
            this.f21115b = i10;
            this.f21116c = str2;
            this.f21117d = str3;
            this.f21118e = str4;
            this.f21119f = str5;
            this.f21120g = str6;
            this.f21121h = str7;
            this.f21122i = str8;
            this.f21123j = myViewHolder;
        }

        /* renamed from: a */
        public final void m17533a() {
            FavouriteM3UModel favouriteM3UModel = new FavouriteM3UModel();
            favouriteM3UModel.m14782h(this.f21114a);
            favouriteM3UModel.m14783i(SharepreferenceDBHandler.m15337A(this.f21124k.f21012e));
            favouriteM3UModel.m14781g(this.f21116c);
            favouriteM3UModel.m14779e(this.f21120g);
            this.f21124k.f21019l.m15156D0(favouriteM3UModel);
            this.f21123j.ivFavourite.setVisibility(0);
        }

        /* renamed from: b */
        public final void m17534b() {
            C5255e.m26220W(this.f21124k.f21012e, this.f21117d, this.f21115b, this.f21118e, this.f21119f, this.f21121h, this.f21116c, this.f21114a, 0);
        }

        /* renamed from: c */
        public final void m17535c() {
            VodAdapter vodAdapter = this.f21124k;
            vodAdapter.f21019l.m15188R0(this.f21114a, SharepreferenceDBHandler.m15337A(vodAdapter.f21012e));
            this.f21123j.ivFavourite.setVisibility(4);
        }

        /* renamed from: d */
        public final void m17536d(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            if (this.f21124k.f21012e == null) {
                Log.e("Null hai context", ">>>>>>>>>>>True its Null");
                return;
            }
            Intent intent = new Intent(this.f21124k.f21012e, (Class<?>) ViewDetailsTMDBActivity.class);
            intent.putExtra(C5251a.f30075y, String.valueOf(i10));
            intent.putExtra("movie", str);
            intent.putExtra("movie_icon", str7);
            intent.putExtra("selectedPlayer", str2);
            intent.putExtra("streamType", str3);
            intent.putExtra("containerExtension", str4);
            intent.putExtra("categoryID", str5);
            intent.putExtra("num", str6);
            intent.putExtra("videoURL", str8);
            this.f21124k.f21012e.startActivity(intent);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        
            r0 = new android.content.Intent(r11.f21124k.f21012e, (java.lang.Class<?>) com.maxdigitall.maxdigitaliptvbox.view.activity.PlayExternalPlayerActivity.class);
            r0.putExtra("url", r11.f21114a);
            r0.putExtra("app_name", ((com.maxdigitall.maxdigitaliptvbox.model.pojo.ExternalPlayerModelClass) r11.f21124k.f21006B.get(r13)).m15415a());
            r0.putExtra("packagename", ((com.maxdigitall.maxdigitaliptvbox.model.pojo.ExternalPlayerModelClass) r11.f21124k.f21006B.get(r13)).m15416b());
            r11.f21124k.f21012e.startActivity(r0);
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
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter.C3544i.onMenuItemClick(android.view.MenuItem):boolean");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAdapter$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAdapter$j.class */
    public class C3545j implements C0304c1.d {

        /* renamed from: a */
        public final int f21125a;

        /* renamed from: b */
        public final String f21126b;

        /* renamed from: c */
        public final String f21127c;

        /* renamed from: d */
        public final String f21128d;

        /* renamed from: e */
        public final String f21129e;

        /* renamed from: f */
        public final String f21130f;

        /* renamed from: g */
        public final String f21131g;

        /* renamed from: h */
        public final String f21132h;

        /* renamed from: i */
        public final MyViewHolder f21133i;

        /* renamed from: j */
        public final VodAdapter f21134j;

        public C3545j(VodAdapter vodAdapter, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, MyViewHolder myViewHolder) {
            this.f21134j = vodAdapter;
            this.f21125a = i10;
            this.f21126b = str;
            this.f21127c = str2;
            this.f21128d = str3;
            this.f21129e = str4;
            this.f21130f = str5;
            this.f21131g = str6;
            this.f21132h = str7;
            this.f21133i = myViewHolder;
        }

        /* renamed from: a */
        public final void m17537a() {
            FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
            favouriteDBModel.m14767h(this.f21130f);
            favouriteDBModel.m14772m(this.f21125a);
            favouriteDBModel.m14770k(this.f21127c);
            favouriteDBModel.m14771l(this.f21131g);
            favouriteDBModel.m14774o(SharepreferenceDBHandler.m15337A(this.f21134j.f21012e));
            this.f21134j.f21018k.m15111l(favouriteDBModel, "vod");
            this.f21133i.ivFavourite.setVisibility(0);
        }

        /* renamed from: b */
        public final void m17538b() {
            C5255e.m26220W(this.f21134j.f21012e, this.f21128d, this.f21125a, this.f21129e, this.f21126b, this.f21131g, this.f21127c, "", 0);
        }

        /* renamed from: c */
        public final void m17539c() {
            VodAdapter vodAdapter = this.f21134j;
            vodAdapter.f21018k.m15115t(this.f21125a, this.f21130f, "vod", this.f21127c, SharepreferenceDBHandler.m15337A(vodAdapter.f21012e));
            this.f21133i.ivFavourite.setVisibility(4);
        }

        /* renamed from: d */
        public final void m17540d(int i10, String str, String str2, String str3, String str4, String str5, String str6) {
            if (this.f21134j.f21012e != null) {
                Intent intent = new Intent(this.f21134j.f21012e, (Class<?>) ViewDetailsActivity.class);
                intent.putExtra(C5251a.f30075y, String.valueOf(i10));
                intent.putExtra("movie", str);
                intent.putExtra("selectedPlayer", str2);
                intent.putExtra("streamType", str3);
                intent.putExtra("containerExtension", str4);
                intent.putExtra("categoryID", str5);
                intent.putExtra("num", str6);
                this.f21134j.f21012e.startActivity(intent);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        
            r0 = p151if.C5255e.m26202E(r9.f21134j.f21012e, r9.f21125a, r9.f21126b, "movie");
            r0 = new android.content.Intent(r9.f21134j.f21012e, (java.lang.Class<?>) com.maxdigitall.maxdigitaliptvbox.view.activity.PlayExternalPlayerActivity.class);
            r0.putExtra("url", r0);
            r0.putExtra("app_name", ((com.maxdigitall.maxdigitaliptvbox.model.pojo.ExternalPlayerModelClass) r9.f21134j.f21006B.get(r11)).m15415a());
            r0.putExtra("packagename", ((com.maxdigitall.maxdigitaliptvbox.model.pojo.ExternalPlayerModelClass) r9.f21134j.f21006B.get(r11)).m15416b());
            r9.f21134j.f21012e.startActivity(r0);
         */
        @Override // androidx.appcompat.widget.C0304c1.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onMenuItemClick(android.view.MenuItem r10) {
            /*
                Method dump skipped, instructions count: 525
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter.C3545j.onMenuItemClick(android.view.MenuItem):boolean");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAdapter$k.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter$k */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/VodAdapter$k.class */
    public class ViewOnFocusChangeListenerC3546k implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f21135b;

        /* renamed from: c */
        public final VodAdapter f21136c;

        public ViewOnFocusChangeListenerC3546k(VodAdapter vodAdapter, View view) {
            this.f21136c = vodAdapter;
            this.f21135b = view;
        }

        /* renamed from: a */
        public final void m17541a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f21135b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m17542b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f21135b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m17543c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f21135b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            View view2;
            int i10;
            float f10 = 1.0f;
            if (!z10) {
                if (z10) {
                    return;
                }
                if (z10) {
                    f10 = 1.09f;
                }
                m17541a(z10);
                if ((this.f21135b.getTag() == null || !this.f21135b.getTag().equals("1")) && (this.f21135b.getTag() == null || !this.f21135b.getTag().equals("2"))) {
                    m17542b(f10);
                    m17543c(f10);
                    return;
                } else {
                    m17542b(f10);
                    m17543c(f10);
                    this.f21135b.setBackgroundResource(2131230845);
                    return;
                }
            }
            if (z10) {
                f10 = 1.1f;
            }
            Log.e("id is", "" + this.f21135b.getTag());
            if (this.f21135b.getTag() != null && this.f21135b.getTag().equals("1")) {
                m17542b(f10);
                view2 = this.f21135b;
                i10 = 2131230828;
            } else if (this.f21135b.getTag() == null || !this.f21135b.getTag().equals("2")) {
                m17542b(f10);
                return;
            } else {
                m17542b(f10);
                view2 = this.f21135b;
                i10 = 2131231576;
            }
            view2.setBackgroundResource(i10);
        }
    }

    public VodAdapter(List<LiveStreamsDBModel> list, Context context, boolean z10) {
        String str;
        String str2;
        this.f21029v = Boolean.TRUE;
        Boolean bool = Boolean.FALSE;
        this.f21005A = bool;
        this.f21008D = "";
        this.f21009E = true;
        this.f21011G = 0;
        this.f21013f = list;
        this.f21012e = context;
        this.f21016i = C5255e.m26247n0(C7705a.m33651a());
        f21004I = context.getApplicationContext().getPackageName();
        this.f21015h = new ArrayList();
        f21003H = m17526t0(context);
        this.f21020m = C5255e.m26247n0(C7708d.m33672d());
        this.f21015h.addAll(list);
        Locale locale = Locale.US;
        this.f21022o = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f21017j = list;
        this.f21033z = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f21018k = new DatabaseHandler(context);
        this.f21019l = new LiveStreamDBHandler(context);
        this.f21030w = new Date();
        this.f21021n = new RecentWatchDBHandler(context);
        SimpleDateFormat simpleDateFormat = this.f21022o;
        if (m17525r0(simpleDateFormat, simpleDateFormat.format(new Date(C7709e.m33680a(context))), this.f21033z.format(this.f21030w)) >= C7707c.m33667p() && (str = this.f21016i) != null && this.f21020m != null && (!f21003H.equals(str) || (this.f21016i != null && (str2 = this.f21020m) != null && !f21004I.equals(str2)))) {
            this.f21029v = bool;
        }
        this.f21031x = new Handler();
        this.f21009E = z10;
    }

    public VodAdapter(List<LiveStreamsDBModel> list, Context context, boolean z10, VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories) {
        String str;
        String str2;
        this.f21029v = Boolean.TRUE;
        Boolean bool = Boolean.FALSE;
        this.f21005A = bool;
        this.f21008D = "";
        this.f21009E = true;
        this.f21011G = 0;
        this.f21013f = list;
        this.f21012e = context;
        this.f21016i = C5255e.m26247n0(C7705a.m33651a());
        ArrayList arrayList = new ArrayList();
        this.f21015h = arrayList;
        arrayList.addAll(list);
        f21004I = context.getApplicationContext().getPackageName();
        this.f21017j = list;
        f21003H = m17526t0(context);
        this.f21018k = new DatabaseHandler(context);
        this.f21019l = new LiveStreamDBHandler(context);
        this.f21020m = C5255e.m26247n0(C7708d.m33672d());
        Locale locale = Locale.US;
        this.f21022o = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f21021n = new RecentWatchDBHandler(context);
        this.f21033z = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", locale);
        this.f21031x = new Handler();
        this.f21030w = new Date();
        this.f21009E = z10;
        SimpleDateFormat simpleDateFormat = this.f21022o;
        if (m17525r0(simpleDateFormat, simpleDateFormat.format(new Date(C7709e.m33680a(context))), this.f21033z.format(this.f21030w)) >= C7707c.m33667p() && (str = this.f21016i) != null && this.f21020m != null && (!f21003H.equals(str) || (this.f21016i != null && (str2 = this.f21020m) != null && !f21004I.equals(str2)))) {
            this.f21029v = bool;
        }
        this.f21007C = vodActivityNewFlowSubCategories;
    }

    /* renamed from: r0 */
    public static long m17525r0(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: t0 */
    public static String m17526t0(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f21013f.size();
    }

    /* renamed from: s0 */
    public void m17527s0(String str, TextView textView) {
        new Thread(new RunnableC3536a(this, str, textView)).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f3  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo2996G(com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter.MyViewHolder r17, @android.annotation.SuppressLint({"RecyclerView"}) int r18) {
        /*
            Method dump skipped, instructions count: 749
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter.mo2996G(com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAdapter$MyViewHolder, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder mo2998J(ViewGroup viewGroup, int i10) {
        LayoutInflater from;
        int i11;
        SharedPreferences sharedPreferences = this.f21012e.getSharedPreferences("showhidemoviename", 0);
        this.f21023p = sharedPreferences;
        this.f21011G = sharedPreferences.getInt("vod", 1);
        this.f21024q = this.f21023p.edit();
        SharedPreferences sharedPreferences2 = this.f21012e.getSharedPreferences("listgridview", 0);
        this.f21025r = sharedPreferences2;
        this.f21026s = sharedPreferences2.edit();
        int i12 = this.f21025r.getInt("vod", 0);
        C5251a.f30070v = i12;
        if (i12 == 1) {
            from = LayoutInflater.from(viewGroup.getContext());
            i11 = 2131624559;
        } else {
            from = LayoutInflater.from(viewGroup.getContext());
            i11 = 2131624512;
        }
        return new MyViewHolder(from.inflate(i11, viewGroup, false));
    }

    /* renamed from: w0 */
    public final void m17530w0(MyViewHolder myViewHolder, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Menu m1275b;
        int i11;
        Context context = this.f21012e;
        if (context != null) {
            C0304c1 c0304c1 = new C0304c1(context, myViewHolder.tvStreamOptions);
            c0304c1.m1277d(2131689479);
            ArrayList<FavouriteDBModel> m15112o = this.f21018k.m15112o(i10, str, "vod", SharepreferenceDBHandler.m15337A(this.f21012e));
            if (m15112o == null || m15112o.size() <= 0) {
                m1275b = c0304c1.m1275b();
                i11 = 3;
            } else {
                m1275b = c0304c1.m1275b();
                i11 = 4;
            }
            m1275b.getItem(i11).setVisible(true);
            if (this.f21009E) {
                c0304c1.m1275b().getItem(5).setVisible(false);
            } else {
                c0304c1.m1275b().getItem(5).setVisible(true);
            }
            try {
                C5947e m29358c = C5938b.m29235e(this.f21012e).m29243c().m29358c();
                this.f21010F = m29358c;
                if (m29358c == null || !m29358c.m29348c()) {
                    c0304c1.m1275b().getItem(7).setVisible(false);
                } else {
                    c0304c1.m1275b().getItem(7).setVisible(true);
                }
            } catch (Exception e10) {
                Log.e("sdng", "" + e10);
            }
            try {
                if (this.f21029v.booleanValue()) {
                    this.f21006B = new ArrayList<>();
                    ArrayList<ExternalPlayerModelClass> m15132o = new ExternalPlayerDataBase(this.f21012e).m15132o();
                    this.f21006B = m15132o;
                    if (m15132o != null && m15132o.size() > 0) {
                        for (int i12 = 0; i12 < this.f21006B.size(); i12++) {
                            c0304c1.m1275b().add(0, i12, i12, this.f21006B.get(i12).m15415a());
                        }
                    }
                }
            } catch (Exception e11) {
            }
            c0304c1.m1279f(new C3545j(this, i10, str5, str2, str3, str4, str, str6, str7, myViewHolder));
            c0304c1.m1280g();
        }
    }

    /* renamed from: x0 */
    public final void m17531x0(MyViewHolder myViewHolder, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Menu m1275b;
        int i11;
        Context context = this.f21012e;
        if (context != null) {
            C0304c1 c0304c1 = new C0304c1(context, myViewHolder.tvStreamOptions);
            c0304c1.m1277d(2131689479);
            ArrayList<FavouriteM3UModel> m15159E0 = this.f21019l.m15159E0(str8, SharepreferenceDBHandler.m15337A(this.f21012e));
            if (m15159E0 == null || m15159E0.size() <= 0) {
                m1275b = c0304c1.m1275b();
                i11 = 3;
            } else {
                m1275b = c0304c1.m1275b();
                i11 = 4;
            }
            m1275b.getItem(i11).setVisible(true);
            if (this.f21009E) {
                c0304c1.m1275b().getItem(5).setVisible(false);
            } else {
                c0304c1.m1275b().getItem(5).setVisible(true);
            }
            try {
                C5947e m29358c = C5938b.m29235e(this.f21012e).m29243c().m29358c();
                this.f21010F = m29358c;
                if (m29358c == null || !m29358c.m29348c()) {
                    c0304c1.m1275b().getItem(7).setVisible(false);
                } else {
                    c0304c1.m1275b().getItem(7).setVisible(true);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            this.f21006B = new ArrayList<>();
            ArrayList<ExternalPlayerModelClass> m15132o = new ExternalPlayerDataBase(this.f21012e).m15132o();
            this.f21006B = m15132o;
            if (m15132o != null && m15132o.size() > 0) {
                for (int i12 = 0; i12 < this.f21006B.size(); i12++) {
                    c0304c1.m1275b().add(0, i12, i12, this.f21006B.get(i12).m15415a());
                }
            }
            c0304c1.m1279f(new C3544i(this, str8, i10, str2, str3, str4, str5, str, str6, str7, myViewHolder));
            c0304c1.m1280g();
        }
    }

    /* renamed from: y0 */
    public final void m17532y0(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (this.f21012e == null) {
            Log.e("Null hai context", ">>>>>>>>>>>True its Null");
            return;
        }
        Intent intent = (C5251a.f30036e.booleanValue() && SharepreferenceDBHandler.m15373f(this.f21012e).equals("m3u")) ? new Intent(this.f21012e, (Class<?>) ViewDetailsTMDBActivity.class) : new Intent(this.f21012e, (Class<?>) ViewDetailsActivity.class);
        intent.putExtra(C5251a.f30075y, String.valueOf(i10));
        intent.putExtra("movie", str);
        intent.putExtra("movie_icon", str7);
        intent.putExtra("selectedPlayer", str2);
        intent.putExtra("streamType", str3);
        intent.putExtra("containerExtension", str4);
        intent.putExtra("categoryID", str5);
        intent.putExtra("num", str6);
        intent.putExtra("videoURL", str8);
        this.f21012e.startActivity(intent);
    }
}

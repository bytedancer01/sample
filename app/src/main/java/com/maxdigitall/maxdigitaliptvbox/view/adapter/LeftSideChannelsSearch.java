package com.maxdigitall.maxdigitaliptvbox.view.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
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
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamCategoryIdDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.XMLTVProgrammePojo;
import com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity;
import com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivityLowerSDK;
import java.util.ArrayList;
import nf.C6783a;
import org.jetbrains.annotations.NotNull;
import p151if.C5251a;
import p216m9.C5938b;
import p216m9.C5947e;
import p316s2.C8522c;
import p428yg.C10014t;
import p428yg.InterfaceC9996e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LeftSideChannelsSearch.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LeftSideChannelsSearch.class */
public class LeftSideChannelsSearch extends RecyclerView.AbstractC0677h<RecyclerView.AbstractC0674e0> {

    /* renamed from: e */
    public ArrayList<XMLTVProgrammePojo> f19751e;

    /* renamed from: f */
    public Context f19752f;

    /* renamed from: h */
    public DatabaseHandler f19754h;

    /* renamed from: i */
    public Animation f19755i;

    /* renamed from: j */
    public String f19756j;

    /* renamed from: n */
    public SharedPreferences f19760n;

    /* renamed from: o */
    public C5947e f19761o;

    /* renamed from: q */
    public Handler f19763q;

    /* renamed from: s */
    public LiveStreamDBHandler f19765s;

    /* renamed from: y */
    public int f19771y;

    /* renamed from: g */
    public Boolean f19753g = Boolean.FALSE;

    /* renamed from: k */
    public String f19757k = "";

    /* renamed from: l */
    public boolean f19758l = false;

    /* renamed from: m */
    public int f19759m = -1;

    /* renamed from: p */
    public String f19762p = "";

    /* renamed from: t */
    public int f19766t = -1;

    /* renamed from: v */
    public String f19768v = "";

    /* renamed from: w */
    public String f19769w = "";

    /* renamed from: x */
    public int f19770x = 0;

    /* renamed from: r */
    public ArrayList<LiveStreamCategoryIdDBModel> f19764r = new ArrayList<>();

    /* renamed from: u */
    public ArrayList<LiveStreamCategoryIdDBModel> f19767u = new ArrayList<>();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LeftSideChannelsSearch$ViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LeftSideChannelsSearch$ViewHolder.class */
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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LeftSideChannelsSearch$ViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LeftSideChannelsSearch$ViewHolder_ViewBinding.class */
    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public ViewHolder f19772b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f19772b = viewHolder;
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
            ViewHolder viewHolder = this.f19772b;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f19772b = null;
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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LeftSideChannelsSearch$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LeftSideChannelsSearch$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LeftSideChannelsSearch$a.class */
    public class C3380a implements InterfaceC9996e {

        /* renamed from: a */
        public final ViewHolder f19773a;

        /* renamed from: b */
        public final LeftSideChannelsSearch f19774b;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LeftSideChannelsSearch$a$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LeftSideChannelsSearch$a$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LeftSideChannelsSearch$a$a.class */
        public class a implements InterfaceC9996e {

            /* renamed from: a */
            public final C3380a f19775a;

            public a(C3380a c3380a) {
                this.f19775a = c3380a;
            }

            @Override // p428yg.InterfaceC9996e
            /* renamed from: a */
            public void mo15848a() {
            }

            @Override // p428yg.InterfaceC9996e
            public void onSuccess() {
            }
        }

        public C3380a(LeftSideChannelsSearch leftSideChannelsSearch, ViewHolder viewHolder) {
            this.f19774b = leftSideChannelsSearch;
            this.f19773a = viewHolder;
        }

        @Override // p428yg.InterfaceC9996e
        /* renamed from: a */
        public void mo15848a() {
            C10014t.m42105q(this.f19774b.f19752f).m42116l(String.valueOf(this.f19774b.f19752f.getResources().getDrawable(2131231769))).m42149e().m42146b().m42152h(this.f19773a.MovieImage, new a(this));
            this.f19773a.SeriesName.setVisibility(0);
        }

        @Override // p428yg.InterfaceC9996e
        public void onSuccess() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LeftSideChannelsSearch$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LeftSideChannelsSearch$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LeftSideChannelsSearch$b.class */
    public class C3381b implements InterfaceC9996e {

        /* renamed from: a */
        public final LeftSideChannelsSearch f19776a;

        public C3381b(LeftSideChannelsSearch leftSideChannelsSearch) {
            this.f19776a = leftSideChannelsSearch;
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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LeftSideChannelsSearch$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LeftSideChannelsSearch$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LeftSideChannelsSearch$c.class */
    public class C3382c implements InterfaceC9996e {

        /* renamed from: a */
        public final LeftSideChannelsSearch f19777a;

        public C3382c(LeftSideChannelsSearch leftSideChannelsSearch) {
            this.f19777a = leftSideChannelsSearch;
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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LeftSideChannelsSearch$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LeftSideChannelsSearch$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LeftSideChannelsSearch$d.class */
    public class ViewOnClickListenerC3383d implements View.OnClickListener {

        /* renamed from: b */
        public final LeftSideChannelsSearch f19778b;

        public ViewOnClickListenerC3383d(LeftSideChannelsSearch leftSideChannelsSearch) {
            this.f19778b = leftSideChannelsSearch;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LeftSideChannelsSearch$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LeftSideChannelsSearch$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LeftSideChannelsSearch$e.class */
    public class ViewOnClickListenerC3384e implements View.OnClickListener {

        /* renamed from: b */
        public final int f19779b;

        /* renamed from: c */
        public final ViewHolder f19780c;

        /* renamed from: d */
        public final String f19781d;

        /* renamed from: e */
        public final int f19782e;

        /* renamed from: f */
        public final LeftSideChannelsSearch f19783f;

        public ViewOnClickListenerC3384e(LeftSideChannelsSearch leftSideChannelsSearch, int i10, ViewHolder viewHolder, String str, int i11) {
            this.f19783f = leftSideChannelsSearch;
            this.f19779b = i10;
            this.f19780c = viewHolder;
            this.f19781d = str;
            this.f19782e = i11;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchActivityLowerSDK searchActivityLowerSDK;
            String valueOf;
            SearchActivity searchActivity;
            String valueOf2;
            this.f19783f.f19771y = this.f19779b;
            this.f19780c.MovieImage.setBackground(this.f19783f.f19752f.getResources().getDrawable(2131231901));
            if (SharepreferenceDBHandler.m15373f(this.f19783f.f19752f).equals("m3u")) {
                if (Build.VERSION.SDK_INT >= 23) {
                    searchActivity = (SearchActivity) this.f19783f.f19752f;
                    valueOf2 = String.valueOf(this.f19781d);
                    searchActivity.m16327S0(valueOf2);
                } else {
                    searchActivityLowerSDK = (SearchActivityLowerSDK) this.f19783f.f19752f;
                    valueOf = String.valueOf(this.f19781d);
                    searchActivityLowerSDK.m16363M(valueOf);
                }
            } else if (Build.VERSION.SDK_INT >= 23) {
                searchActivity = (SearchActivity) this.f19783f.f19752f;
                valueOf2 = String.valueOf(this.f19782e);
                searchActivity.m16327S0(valueOf2);
            } else {
                searchActivityLowerSDK = (SearchActivityLowerSDK) this.f19783f.f19752f;
                valueOf = String.valueOf(this.f19782e);
                searchActivityLowerSDK.m16363M(valueOf);
            }
            if (Build.VERSION.SDK_INT >= 23) {
                ((SearchActivity) this.f19783f.f19752f).m16328e0(this.f19783f.f19771y);
            } else {
                ((SearchActivityLowerSDK) this.f19783f.f19752f).m16364a(this.f19783f.f19771y);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LeftSideChannelsSearch$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LeftSideChannelsSearch$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LeftSideChannelsSearch$f.class */
    public class ViewOnClickListenerC3385f implements View.OnClickListener {

        /* renamed from: b */
        public final int f19784b;

        /* renamed from: c */
        public final ViewHolder f19785c;

        /* renamed from: d */
        public final String f19786d;

        /* renamed from: e */
        public final int f19787e;

        /* renamed from: f */
        public final LeftSideChannelsSearch f19788f;

        public ViewOnClickListenerC3385f(LeftSideChannelsSearch leftSideChannelsSearch, int i10, ViewHolder viewHolder, String str, int i11) {
            this.f19788f = leftSideChannelsSearch;
            this.f19784b = i10;
            this.f19785c = viewHolder;
            this.f19786d = str;
            this.f19787e = i11;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchActivity searchActivity;
            String valueOf;
            this.f19788f.f19771y = this.f19784b;
            this.f19785c.MovieImage.setBackground(this.f19788f.f19752f.getResources().getDrawable(2131231901));
            if (SharepreferenceDBHandler.m15373f(this.f19788f.f19752f).equals("m3u")) {
                if (Build.VERSION.SDK_INT >= 23) {
                    searchActivity = (SearchActivity) this.f19788f.f19752f;
                    valueOf = String.valueOf(this.f19786d);
                    searchActivity.m16327S0(valueOf);
                }
                ((SearchActivityLowerSDK) this.f19788f.f19752f).m16363M(String.valueOf(this.f19786d));
            } else {
                if (Build.VERSION.SDK_INT >= 23) {
                    searchActivity = (SearchActivity) this.f19788f.f19752f;
                    valueOf = String.valueOf(this.f19787e);
                    searchActivity.m16327S0(valueOf);
                }
                ((SearchActivityLowerSDK) this.f19788f.f19752f).m16363M(String.valueOf(this.f19786d));
            }
            if (Build.VERSION.SDK_INT >= 23) {
                ((SearchActivity) this.f19788f.f19752f).m16328e0(this.f19788f.f19771y);
            } else {
                ((SearchActivityLowerSDK) this.f19788f.f19752f).m16363M(String.valueOf(this.f19786d));
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LeftSideChannelsSearch$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LeftSideChannelsSearch$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LeftSideChannelsSearch$g.class */
    public class ViewOnLongClickListenerC3386g implements View.OnLongClickListener {

        /* renamed from: b */
        public final LeftSideChannelsSearch f19789b;

        public ViewOnLongClickListenerC3386g(LeftSideChannelsSearch leftSideChannelsSearch) {
            this.f19789b = leftSideChannelsSearch;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LeftSideChannelsSearch$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LeftSideChannelsSearch$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LeftSideChannelsSearch$h.class */
    public class ViewOnLongClickListenerC3387h implements View.OnLongClickListener {

        /* renamed from: b */
        public final LeftSideChannelsSearch f19790b;

        public ViewOnLongClickListenerC3387h(LeftSideChannelsSearch leftSideChannelsSearch) {
            this.f19790b = leftSideChannelsSearch;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LeftSideChannelsSearch$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LeftSideChannelsSearch$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LeftSideChannelsSearch$i.class */
    public class ViewOnLongClickListenerC3388i implements View.OnLongClickListener {

        /* renamed from: b */
        public final LeftSideChannelsSearch f19791b;

        public ViewOnLongClickListenerC3388i(LeftSideChannelsSearch leftSideChannelsSearch) {
            this.f19791b = leftSideChannelsSearch;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LeftSideChannelsSearch$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LeftSideChannelsSearch$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LeftSideChannelsSearch$j.class */
    public class ViewOnFocusChangeListenerC3389j implements View.OnFocusChangeListener {

        /* renamed from: b */
        public int f19792b;

        /* renamed from: c */
        public final LeftSideChannelsSearch f19793c;

        public ViewOnFocusChangeListenerC3389j(LeftSideChannelsSearch leftSideChannelsSearch, int i10) {
            this.f19793c = leftSideChannelsSearch;
            this.f19792b = i10;
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            this.f19793c.f19759m = z10 ? this.f19792b : -1;
        }
    }

    public LeftSideChannelsSearch(Context context, ArrayList<XMLTVProgrammePojo> arrayList, int i10) {
        this.f19756j = "mobile";
        this.f19771y = 0;
        this.f19752f = context;
        this.f19751e = arrayList;
        this.f19754h = new DatabaseHandler(context);
        this.f19755i = AnimationUtils.loadAnimation(context, 2130771980);
        this.f19765s = new LiveStreamDBHandler(context);
        this.f19771y = i10;
        if (new C6783a(context).m31288z().equals(C5251a.f30065s0)) {
            this.f19756j = "tv";
        } else {
            this.f19756j = "mobile";
        }
        this.f19763q = new Handler(Looper.getMainLooper());
        if (this.f19756j.equals("mobile")) {
            try {
                this.f19761o = C5938b.m29235e(context).m29243c().m29358c();
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x01e9, code lost:
    
        if (r7.f19765s.m15159E0(r8, com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler.m15337A(r7.f19752f)).size() > 0) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d7 A[Catch: Exception -> 0x0377, TryCatch #2 {Exception -> 0x0377, blocks: (B:3:0x000c, B:5:0x0015, B:7:0x001c, B:9:0x0025, B:11:0x003f, B:13:0x0054, B:15:0x005c, B:17:0x0062, B:18:0x0070, B:76:0x007a, B:20:0x0089, B:22:0x0091, B:24:0x0099, B:26:0x009f, B:27:0x00ad, B:29:0x00b5, B:30:0x00c1, B:32:0x00c9, B:33:0x00d7, B:38:0x01c7, B:40:0x01d7, B:43:0x01ee, B:44:0x0221, B:46:0x027e, B:48:0x02a3, B:50:0x02ab, B:52:0x02bb, B:54:0x031e, B:55:0x02c2, B:57:0x02d4, B:58:0x02dd, B:60:0x02e5, B:61:0x02f6, B:62:0x0307, B:63:0x01f8, B:64:0x0204, B:35:0x0187, B:37:0x017d, B:71:0x013e, B:82:0x0361, B:68:0x0108), top: B:2:0x000c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x027e A[Catch: Exception -> 0x0377, TryCatch #2 {Exception -> 0x0377, blocks: (B:3:0x000c, B:5:0x0015, B:7:0x001c, B:9:0x0025, B:11:0x003f, B:13:0x0054, B:15:0x005c, B:17:0x0062, B:18:0x0070, B:76:0x007a, B:20:0x0089, B:22:0x0091, B:24:0x0099, B:26:0x009f, B:27:0x00ad, B:29:0x00b5, B:30:0x00c1, B:32:0x00c9, B:33:0x00d7, B:38:0x01c7, B:40:0x01d7, B:43:0x01ee, B:44:0x0221, B:46:0x027e, B:48:0x02a3, B:50:0x02ab, B:52:0x02bb, B:54:0x031e, B:55:0x02c2, B:57:0x02d4, B:58:0x02dd, B:60:0x02e5, B:61:0x02f6, B:62:0x0307, B:63:0x01f8, B:64:0x0204, B:35:0x0187, B:37:0x017d, B:71:0x013e, B:82:0x0361, B:68:0x0108), top: B:2:0x000c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0307 A[Catch: Exception -> 0x0377, TRY_ENTER, TryCatch #2 {Exception -> 0x0377, blocks: (B:3:0x000c, B:5:0x0015, B:7:0x001c, B:9:0x0025, B:11:0x003f, B:13:0x0054, B:15:0x005c, B:17:0x0062, B:18:0x0070, B:76:0x007a, B:20:0x0089, B:22:0x0091, B:24:0x0099, B:26:0x009f, B:27:0x00ad, B:29:0x00b5, B:30:0x00c1, B:32:0x00c9, B:33:0x00d7, B:38:0x01c7, B:40:0x01d7, B:43:0x01ee, B:44:0x0221, B:46:0x027e, B:48:0x02a3, B:50:0x02ab, B:52:0x02bb, B:54:0x031e, B:55:0x02c2, B:57:0x02d4, B:58:0x02dd, B:60:0x02e5, B:61:0x02f6, B:62:0x0307, B:63:0x01f8, B:64:0x0204, B:35:0x0187, B:37:0x017d, B:71:0x013e, B:82:0x0361, B:68:0x0108), top: B:2:0x000c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0204 A[Catch: Exception -> 0x0377, TRY_ENTER, TryCatch #2 {Exception -> 0x0377, blocks: (B:3:0x000c, B:5:0x0015, B:7:0x001c, B:9:0x0025, B:11:0x003f, B:13:0x0054, B:15:0x005c, B:17:0x0062, B:18:0x0070, B:76:0x007a, B:20:0x0089, B:22:0x0091, B:24:0x0099, B:26:0x009f, B:27:0x00ad, B:29:0x00b5, B:30:0x00c1, B:32:0x00c9, B:33:0x00d7, B:38:0x01c7, B:40:0x01d7, B:43:0x01ee, B:44:0x0221, B:46:0x027e, B:48:0x02a3, B:50:0x02ab, B:52:0x02bb, B:54:0x031e, B:55:0x02c2, B:57:0x02d4, B:58:0x02dd, B:60:0x02e5, B:61:0x02f6, B:62:0x0307, B:63:0x01f8, B:64:0x0204, B:35:0x0187, B:37:0x017d, B:71:0x013e, B:82:0x0361, B:68:0x0108), top: B:2:0x000c, inners: #1 }] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    @android.annotation.SuppressLint({"SetTextI18n"})
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo2996G(@org.jetbrains.annotations.NotNull androidx.recyclerview.widget.RecyclerView.AbstractC0674e0 r8, int r9) {
        /*
            Method dump skipped, instructions count: 891
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.adapter.LeftSideChannelsSearch.mo2996G(androidx.recyclerview.widget.RecyclerView$e0, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    @NotNull
    /* renamed from: J */
    public RecyclerView.AbstractC0674e0 mo2998J(@NotNull ViewGroup viewGroup, int i10) {
        LayoutInflater from;
        int i11;
        if (this.f19756j.equals("tv")) {
            from = LayoutInflater.from(viewGroup.getContext());
            i11 = 2131624322;
        } else {
            from = LayoutInflater.from(viewGroup.getContext());
            i11 = 2131624321;
        }
        return new ViewHolder(from.inflate(i11, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        ArrayList<XMLTVProgrammePojo> arrayList = this.f19751e;
        if (arrayList == null || arrayList.size() <= 0) {
            return 0;
        }
        return this.f19751e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: q */
    public int mo3018q(int i10) {
        return 0;
    }
}

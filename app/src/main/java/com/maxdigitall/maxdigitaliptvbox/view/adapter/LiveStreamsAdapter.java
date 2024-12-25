package com.maxdigitall.maxdigitaliptvbox.view.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.LayoutInflater;
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
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.XMLTVProgrammePojo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import p151if.C5251a;
import p151if.C5255e;
import p216m9.C5974n;
import p316s2.C8522c;
import p428yg.C10014t;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveStreamsAdapter.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveStreamsAdapter.class */
public class LiveStreamsAdapter extends RecyclerView.AbstractC0677h<MyViewHolder> {

    /* renamed from: q */
    public static SharedPreferences f19980q;

    /* renamed from: e */
    public Context f19981e;

    /* renamed from: f */
    public List<LiveStreamsDBModel> f19982f;

    /* renamed from: g */
    public SharedPreferences f19983g;

    /* renamed from: h */
    public List<LiveStreamsDBModel> f19984h;

    /* renamed from: i */
    public List<LiveStreamsDBModel> f19985i;

    /* renamed from: j */
    public DatabaseHandler f19986j;

    /* renamed from: k */
    public LiveStreamDBHandler f19987k;

    /* renamed from: l */
    public MyViewHolder f19988l;

    /* renamed from: m */
    public SharedPreferences f19989m;

    /* renamed from: n */
    public SimpleDateFormat f19990n;

    /* renamed from: o */
    public int f19991o;

    /* renamed from: p */
    public int f19992p;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveStreamsAdapter$MyViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveStreamsAdapter$MyViewHolder.class */
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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveStreamsAdapter$MyViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveStreamsAdapter$MyViewHolder_ViewBinding.class */
    public class MyViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public MyViewHolder f19993b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f19993b = myViewHolder;
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
            MyViewHolder myViewHolder = this.f19993b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f19993b = null;
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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveStreamsAdapter$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveStreamsAdapter$a.class */
    public class ViewOnClickListenerC3416a implements View.OnClickListener {

        /* renamed from: b */
        public final LiveStreamsAdapter f19994b;

        public ViewOnClickListenerC3416a(LiveStreamsAdapter liveStreamsAdapter) {
            this.f19994b = liveStreamsAdapter;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveStreamsAdapter$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveStreamsAdapter$b.class */
    public class ViewOnClickListenerC3417b implements View.OnClickListener {

        /* renamed from: b */
        public final LiveStreamsAdapter f19995b;

        public ViewOnClickListenerC3417b(LiveStreamsAdapter liveStreamsAdapter) {
            this.f19995b = liveStreamsAdapter;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveStreamsAdapter$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveStreamsAdapter$c.class */
    public class ViewOnClickListenerC3418c implements View.OnClickListener {

        /* renamed from: b */
        public final LiveStreamsAdapter f19996b;

        public ViewOnClickListenerC3418c(LiveStreamsAdapter liveStreamsAdapter) {
            this.f19996b = liveStreamsAdapter;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveStreamsAdapter$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveStreamsAdapter$d.class */
    public class ViewOnLongClickListenerC3419d implements View.OnLongClickListener {

        /* renamed from: b */
        public final MyViewHolder f19997b;

        /* renamed from: c */
        public final int f19998c;

        /* renamed from: d */
        public final String f19999d;

        /* renamed from: e */
        public final String f20000e;

        /* renamed from: f */
        public final String f20001f;

        /* renamed from: g */
        public final LiveStreamsAdapter f20002g;

        public ViewOnLongClickListenerC3419d(LiveStreamsAdapter liveStreamsAdapter, MyViewHolder myViewHolder, int i10, String str, String str2, String str3) {
            this.f20002g = liveStreamsAdapter;
            this.f19997b = myViewHolder;
            this.f19998c = i10;
            this.f19999d = str;
            this.f20000e = str2;
            this.f20001f = str3;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            this.f20002g.m17181o0(this.f19997b, this.f19998c, this.f19999d, this.f20000e, this.f20001f);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveStreamsAdapter$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveStreamsAdapter$e.class */
    public class ViewOnLongClickListenerC3420e implements View.OnLongClickListener {

        /* renamed from: b */
        public final MyViewHolder f20003b;

        /* renamed from: c */
        public final int f20004c;

        /* renamed from: d */
        public final String f20005d;

        /* renamed from: e */
        public final String f20006e;

        /* renamed from: f */
        public final String f20007f;

        /* renamed from: g */
        public final LiveStreamsAdapter f20008g;

        public ViewOnLongClickListenerC3420e(LiveStreamsAdapter liveStreamsAdapter, MyViewHolder myViewHolder, int i10, String str, String str2, String str3) {
            this.f20008g = liveStreamsAdapter;
            this.f20003b = myViewHolder;
            this.f20004c = i10;
            this.f20005d = str;
            this.f20006e = str2;
            this.f20007f = str3;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            this.f20008g.m17181o0(this.f20003b, this.f20004c, this.f20005d, this.f20006e, this.f20007f);
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveStreamsAdapter$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveStreamsAdapter$f.class */
    public class ViewOnClickListenerC3421f implements View.OnClickListener {

        /* renamed from: b */
        public final MyViewHolder f20009b;

        /* renamed from: c */
        public final int f20010c;

        /* renamed from: d */
        public final String f20011d;

        /* renamed from: e */
        public final String f20012e;

        /* renamed from: f */
        public final String f20013f;

        /* renamed from: g */
        public final LiveStreamsAdapter f20014g;

        public ViewOnClickListenerC3421f(LiveStreamsAdapter liveStreamsAdapter, MyViewHolder myViewHolder, int i10, String str, String str2, String str3) {
            this.f20014g = liveStreamsAdapter;
            this.f20009b = myViewHolder;
            this.f20010c = i10;
            this.f20011d = str;
            this.f20012e = str2;
            this.f20013f = str3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f20014g.m17181o0(this.f20009b, this.f20010c, this.f20011d, this.f20012e, this.f20013f);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveStreamsAdapter$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveStreamsAdapter$g.class */
    public class C3422g implements C0304c1.d {

        /* renamed from: a */
        public final MyViewHolder f20015a;

        /* renamed from: b */
        public final String f20016b;

        /* renamed from: c */
        public final int f20017c;

        /* renamed from: d */
        public final String f20018d;

        /* renamed from: e */
        public final String f20019e;

        /* renamed from: f */
        public final LiveStreamsAdapter f20020f;

        public C3422g(LiveStreamsAdapter liveStreamsAdapter, MyViewHolder myViewHolder, String str, int i10, String str2, String str3) {
            this.f20020f = liveStreamsAdapter;
            this.f20015a = myViewHolder;
            this.f20016b = str;
            this.f20017c = i10;
            this.f20018d = str2;
            this.f20019e = str3;
        }

        /* renamed from: a */
        public final void m17182a() {
            FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
            favouriteDBModel.m14767h(this.f20016b);
            favouriteDBModel.m14772m(this.f20017c);
            favouriteDBModel.m14770k(this.f20018d);
            favouriteDBModel.m14771l(this.f20019e);
            favouriteDBModel.m14774o(SharepreferenceDBHandler.m15337A(this.f20020f.f19981e));
            this.f20020f.f19986j.m15111l(favouriteDBModel, "live");
            this.f20015a.ivFavourite.setVisibility(0);
        }

        /* renamed from: b */
        public final void m17183b() {
            this.f20015a.cardView.performClick();
        }

        /* renamed from: c */
        public final void m17184c() {
            this.f20020f.f19986j.m15115t(this.f20017c, this.f20016b, "live", this.f20018d, SharepreferenceDBHandler.m15337A(this.f20020f.f19981e));
            this.f20015a.ivFavourite.setVisibility(4);
        }

        @Override // androidx.appcompat.widget.C0304c1.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId == 2131428754) {
                m17182a();
                return false;
            }
            if (itemId == 2131428768) {
                m17183b();
                return false;
            }
            if (itemId != 2131428775) {
                return false;
            }
            m17184c();
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveStreamsAdapter$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveStreamsAdapter$h.class */
    public class RunnableC3423h implements Runnable {

        /* renamed from: b */
        public final String f20021b;

        /* renamed from: c */
        public final TextView f20022c;

        /* renamed from: d */
        public final LiveStreamsAdapter f20023d;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveStreamsAdapter$h$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter$h$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/LiveStreamsAdapter$h$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final RunnableC3423h f20024b;

            public a(RunnableC3423h runnableC3423h) {
                this.f20024b = runnableC3423h;
            }

            @Override // java.lang.Runnable
            public void run() {
                LiveStreamsAdapter liveStreamsAdapter;
                List list;
                if (!TextUtils.isEmpty(this.f20024b.f20021b)) {
                    if (!this.f20024b.f20023d.f19984h.isEmpty() || this.f20024b.f20023d.f19984h.isEmpty()) {
                        liveStreamsAdapter = this.f20024b.f20023d;
                        list = liveStreamsAdapter.f19984h;
                    }
                    if (this.f20024b.f20023d.f19982f != null && this.f20024b.f20023d.f19982f.size() == 0) {
                        this.f20024b.f20022c.setVisibility(0);
                    }
                    LiveStreamsAdapter liveStreamsAdapter2 = this.f20024b.f20023d;
                    liveStreamsAdapter2.f19991o = liveStreamsAdapter2.f19992p;
                    liveStreamsAdapter2.m4099w();
                }
                liveStreamsAdapter = this.f20024b.f20023d;
                list = liveStreamsAdapter.f19985i;
                liveStreamsAdapter.f19982f = list;
                if (this.f20024b.f20023d.f19982f != null) {
                    this.f20024b.f20022c.setVisibility(0);
                }
                LiveStreamsAdapter liveStreamsAdapter22 = this.f20024b.f20023d;
                liveStreamsAdapter22.f19991o = liveStreamsAdapter22.f19992p;
                liveStreamsAdapter22.m4099w();
            }
        }

        public RunnableC3423h(LiveStreamsAdapter liveStreamsAdapter, String str, TextView textView) {
            this.f20023d = liveStreamsAdapter;
            this.f20021b = str;
            this.f20022c = textView;
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
        
            if (r0.f19991o > r0.f19992p) goto L14;
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
                com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter r0 = r0.f20023d
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = r1
                r2.<init>()
                java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter.m17174h0(r0, r1)
                r0 = r5
                com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter r0 = r0.f20023d
                r1 = r5
                java.lang.String r1 = r1.f20021b
                int r1 = r1.length()
                r0.f19992p = r1
                r0 = r5
                com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter r0 = r0.f20023d
                java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter.m17173g0(r0)
                if (r0 == 0) goto L33
                r0 = r5
                com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter r0 = r0.f20023d
                java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter.m17173g0(r0)
                r0.clear()
            L33:
                r0 = r5
                java.lang.String r0 = r0.f20021b
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L54
                r0 = r5
                com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter r0 = r0.f20023d
                java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter.m17173g0(r0)
                r1 = r5
                com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter r1 = r1.f20023d
                java.util.List r1 = com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter.m17175i0(r1)
                boolean r0 = r0.addAll(r1)
                goto Le1
            L54:
                r0 = r5
                com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter r0 = r0.f20023d
                java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter.m17176j0(r0)
                if (r0 == 0) goto L6d
                r0 = r5
                com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter r0 = r0.f20023d
                java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter.m17176j0(r0)
                int r0 = r0.size()
                if (r0 == 0) goto L7d
            L6d:
                r0 = r5
                com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter r0 = r0.f20023d
                r6 = r0
                r0 = r6
                int r0 = r0.f19991o
                r1 = r6
                int r1 = r1.f19992p
                if (r0 <= r1) goto L8b
            L7d:
                r0 = r5
                com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter r0 = r0.f20023d
                r6 = r0
                r0 = r6
                r1 = r6
                java.util.List r1 = com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter.m17175i0(r1)
                java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter.m17177k0(r0, r1)
            L8b:
                r0 = r5
                com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter r0 = r0.f20023d
                java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter.m17176j0(r0)
                if (r0 == 0) goto Le1
                r0 = r5
                com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter r0 = r0.f20023d
                java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter.m17176j0(r0)
                java.util.Iterator r0 = r0.iterator()
                r6 = r0
            La2:
                r0 = r6
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto Le1
                r0 = r6
                java.lang.Object r0 = r0.next()
                com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel r0 = (com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel) r0
                r7 = r0
                r0 = r7
                java.lang.String r0 = r0.getName()
                if (r0 == 0) goto La2
                r0 = r7
                java.lang.String r0 = r0.getName()
                java.lang.String r0 = r0.toLowerCase()
                r1 = r5
                java.lang.String r1 = r1.f20021b
                java.lang.String r1 = r1.toLowerCase()
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto La2
                r0 = r5
                com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter r0 = r0.f20023d
                java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter.m17173g0(r0)
                r1 = r7
                boolean r0 = r0.add(r1)
                goto La2
            Le1:
                r0 = r5
                com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter r0 = r0.f20023d
                android.content.Context r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter.m17171e0(r0)
                android.app.Activity r0 = (android.app.Activity) r0
                com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter$h$a r1 = new com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter$h$a
                r2 = r1
                r3 = r5
                r2.<init>(r3)
                r0.runOnUiThread(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveStreamsAdapter.RunnableC3423h.run():void");
        }
    }

    public LiveStreamsAdapter(List<LiveStreamsDBModel> list, Context context) {
        this.f19982f = list;
        this.f19981e = context;
        ArrayList arrayList = new ArrayList();
        this.f19984h = arrayList;
        arrayList.addAll(list);
        this.f19985i = list;
        this.f19986j = new DatabaseHandler(context);
        this.f19987k = new LiveStreamDBHandler(context);
    }

    /* renamed from: l0 */
    public void m17178l0(String str, TextView textView) {
        new Thread(new RunnableC3423h(this, str, textView)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    @SuppressLint({"SimpleDateFormat", "SetTextI18n"})
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(MyViewHolder myViewHolder, int i10) {
        int i11;
        String m14810Q;
        ArrayList<FavouriteDBModel> m15112o;
        ImageView imageView;
        int i12;
        int m26258y;
        Context context = this.f19981e;
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("selectedPlayer", 0);
            this.f19983g = sharedPreferences;
            Object obj = "";
            sharedPreferences.getString("selectedPlayer", "");
            try {
                i11 = Integer.parseInt(this.f19982f.get(i10).m14811R().trim());
            } catch (NumberFormatException e10) {
                i11 = -1;
            }
            String m14827g = this.f19982f.get(i10).m14827g();
            this.f19982f.get(i10).m14812S();
            String m14798E = this.f19982f.get(i10).m14798E();
            String m14805L = this.f19982f.get(i10).m14805L();
            myViewHolder.tvTime.setText("");
            myViewHolder.progressBar.setVisibility(8);
            myViewHolder.tvCurrentLive.setText("");
            Object obj2 = obj;
            if (m14798E != null) {
                obj2 = obj;
                if (!m14798E.equals("")) {
                    LiveStreamDBHandler liveStreamDBHandler = this.f19987k;
                    obj2 = obj;
                    if (liveStreamDBHandler != null) {
                        ArrayList<XMLTVProgrammePojo> m15160E1 = liveStreamDBHandler.m15160E1(m14798E);
                        obj2 = obj;
                        if (m15160E1 != null) {
                            int i13 = 0;
                            while (true) {
                                obj2 = obj;
                                if (i13 >= m15160E1.size()) {
                                    break;
                                }
                                String m15512j = m15160E1.get(i13).m15512j();
                                String m15514l = m15160E1.get(i13).m15514l();
                                String m15515m = m15160E1.get(i13).m15515m();
                                m15160E1.get(i13).m15504b();
                                Long valueOf = Long.valueOf(C5255e.m26244m(m15512j, this.f19981e));
                                Long valueOf2 = Long.valueOf(C5255e.m26244m(m15514l, this.f19981e));
                                if (!C5255e.m26208K(valueOf.longValue(), valueOf2.longValue(), this.f19981e) || (m26258y = C5255e.m26258y(valueOf.longValue(), valueOf2.longValue(), this.f19981e)) == 0) {
                                    i13++;
                                } else {
                                    int i14 = 100 - m26258y;
                                    if (i14 == 0 || m15515m.equals(obj)) {
                                        myViewHolder.tvTime.setVisibility(8);
                                        myViewHolder.progressBar.setVisibility(8);
                                        myViewHolder.tvCurrentLive.setVisibility(8);
                                    } else {
                                        if (C5251a.f30068u == 0) {
                                            myViewHolder.tvTime.setVisibility(0);
                                            SharedPreferences sharedPreferences2 = this.f19981e.getSharedPreferences("timeFormat", 0);
                                            f19980q = sharedPreferences2;
                                            this.f19990n = new SimpleDateFormat(sharedPreferences2.getString("timeFormat", C5251a.f30053m0));
                                            myViewHolder.tvTime.setText(this.f19990n.format(valueOf) + " - " + this.f19990n.format(valueOf2));
                                        }
                                        myViewHolder.progressBar.setVisibility(0);
                                        myViewHolder.progressBar.setProgress(i14);
                                        myViewHolder.tvCurrentLive.setVisibility(0);
                                        myViewHolder.tvCurrentLive.setText(m15515m);
                                    }
                                }
                            }
                            this.f19982f.get(i10).m14805L();
                            String name = this.f19982f.get(i10).getName();
                            myViewHolder.tvChannelName.setText(this.f19982f.get(i10).getName());
                            m14810Q = this.f19982f.get(i10).m14810Q();
                            this.f19982f.get(i10).m14798E();
                            myViewHolder.ivChannelLogo.setImageDrawable(null);
                            if (m14810Q != null || m14810Q.equals(obj)) {
                                myViewHolder.ivChannelLogo.setImageDrawable(this.f19981e.getResources().getDrawable(2131231571, null));
                            } else {
                                C10014t.m42105q(this.f19981e).m42116l(m14810Q).m42154j(2131231571).m42151g(myViewHolder.ivChannelLogo);
                            }
                            myViewHolder.cardView.setOnClickListener(new ViewOnClickListenerC3416a(this));
                            myViewHolder.rlMovieImage.setOnClickListener(new ViewOnClickListenerC3417b(this));
                            myViewHolder.rlStreamsLayout.setOnClickListener(new ViewOnClickListenerC3418c(this));
                            m15112o = this.f19986j.m15112o(i11, m14827g, "live", SharepreferenceDBHandler.m15337A(this.f19981e));
                            if (m15112o != null || m15112o.size() <= 0) {
                                imageView = myViewHolder.ivFavourite;
                                i12 = 4;
                            } else {
                                imageView = myViewHolder.ivFavourite;
                                i12 = 0;
                            }
                            imageView.setVisibility(i12);
                            myViewHolder.rlStreamsLayout.setOnLongClickListener(new ViewOnLongClickListenerC3419d(this, myViewHolder, i11, m14827g, name, m14805L));
                            myViewHolder.rlMovieImage.setOnLongClickListener(new ViewOnLongClickListenerC3420e(this, myViewHolder, i11, m14827g, name, m14805L));
                            myViewHolder.llMenu.setOnClickListener(new ViewOnClickListenerC3421f(this, myViewHolder, i11, m14827g, name, m14805L));
                        }
                    }
                }
            }
            obj = obj2;
            this.f19982f.get(i10).m14805L();
            String name2 = this.f19982f.get(i10).getName();
            myViewHolder.tvChannelName.setText(this.f19982f.get(i10).getName());
            m14810Q = this.f19982f.get(i10).m14810Q();
            this.f19982f.get(i10).m14798E();
            myViewHolder.ivChannelLogo.setImageDrawable(null);
            if (m14810Q != null) {
            }
            myViewHolder.ivChannelLogo.setImageDrawable(this.f19981e.getResources().getDrawable(2131231571, null));
            myViewHolder.cardView.setOnClickListener(new ViewOnClickListenerC3416a(this));
            myViewHolder.rlMovieImage.setOnClickListener(new ViewOnClickListenerC3417b(this));
            myViewHolder.rlStreamsLayout.setOnClickListener(new ViewOnClickListenerC3418c(this));
            m15112o = this.f19986j.m15112o(i11, m14827g, "live", SharepreferenceDBHandler.m15337A(this.f19981e));
            if (m15112o != null) {
            }
            imageView = myViewHolder.ivFavourite;
            i12 = 4;
            imageView.setVisibility(i12);
            myViewHolder.rlStreamsLayout.setOnLongClickListener(new ViewOnLongClickListenerC3419d(this, myViewHolder, i11, m14827g, name2, m14805L));
            myViewHolder.rlMovieImage.setOnLongClickListener(new ViewOnLongClickListenerC3420e(this, myViewHolder, i11, m14827g, name2, m14805L));
            myViewHolder.llMenu.setOnClickListener(new ViewOnClickListenerC3421f(this, myViewHolder, i11, m14827g, name2, m14805L));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        List<LiveStreamsDBModel> list = this.f19982f;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder mo2998J(ViewGroup viewGroup, int i10) {
        SharedPreferences sharedPreferences = this.f19981e.getSharedPreferences("listgridview", 0);
        this.f19989m = sharedPreferences;
        int i11 = sharedPreferences.getInt("livestream", 0);
        C5251a.f30068u = i11;
        MyViewHolder myViewHolder = i11 == 1 ? new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(2131624329, viewGroup, false)) : new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(2131624331, viewGroup, false));
        this.f19988l = myViewHolder;
        return myViewHolder;
    }

    /* renamed from: o0 */
    public final void m17181o0(MyViewHolder myViewHolder, int i10, String str, String str2, String str3) {
        C0304c1 c0304c1 = new C0304c1(this.f19981e, myViewHolder.tvStreamOptions);
        c0304c1.m1277d(2131689476);
        (this.f19986j.m15112o(i10, str, "live", SharepreferenceDBHandler.m15337A(this.f19981e)).size() > 0 ? c0304c1.m1275b().getItem(2) : c0304c1.m1275b().getItem(1)).setVisible(true);
        c0304c1.m1279f(new C3422g(this, myViewHolder, str, i10, str2, str3));
        c0304c1.m1280g();
    }
}

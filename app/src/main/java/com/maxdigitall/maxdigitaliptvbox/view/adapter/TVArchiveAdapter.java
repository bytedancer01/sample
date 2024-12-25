package com.maxdigitall.maxdigitaliptvbox.view.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
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
import com.maxdigitall.maxdigitaliptvbox.view.activity.SubTVArchiveActivity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import p151if.C5251a;
import p151if.C5255e;
import p216m9.C5974n;
import p316s2.C8522c;
import p428yg.C10014t;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/TVArchiveAdapter.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/TVArchiveAdapter.class */
public class TVArchiveAdapter extends RecyclerView.AbstractC0677h<MyViewHolder> {

    /* renamed from: o */
    public static SharedPreferences f20949o;

    /* renamed from: e */
    public Context f20950e;

    /* renamed from: f */
    public List<LiveStreamsDBModel> f20951f;

    /* renamed from: g */
    public SharedPreferences f20952g;

    /* renamed from: h */
    public List<LiveStreamsDBModel> f20953h;

    /* renamed from: i */
    public List<LiveStreamsDBModel> f20954i;

    /* renamed from: j */
    public DatabaseHandler f20955j;

    /* renamed from: k */
    public LiveStreamDBHandler f20956k;

    /* renamed from: l */
    public MyViewHolder f20957l;

    /* renamed from: m */
    public SharedPreferences f20958m;

    /* renamed from: n */
    public SimpleDateFormat f20959n;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/TVArchiveAdapter$MyViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/TVArchiveAdapter$MyViewHolder.class */
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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/TVArchiveAdapter$MyViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/TVArchiveAdapter$MyViewHolder_ViewBinding.class */
    public class MyViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public MyViewHolder f20960b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f20960b = myViewHolder;
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
            MyViewHolder myViewHolder = this.f20960b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f20960b = null;
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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/TVArchiveAdapter$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.TVArchiveAdapter$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/TVArchiveAdapter$a.class */
    public class ViewOnClickListenerC3528a implements View.OnClickListener {

        /* renamed from: b */
        public final String f20961b;

        /* renamed from: c */
        public final int f20962c;

        /* renamed from: d */
        public final String f20963d;

        /* renamed from: e */
        public final String f20964e;

        /* renamed from: f */
        public final String f20965f;

        /* renamed from: g */
        public final String f20966g;

        /* renamed from: h */
        public final TVArchiveAdapter f20967h;

        public ViewOnClickListenerC3528a(TVArchiveAdapter tVArchiveAdapter, String str, int i10, String str2, String str3, String str4, String str5) {
            this.f20967h = tVArchiveAdapter;
            this.f20961b = str;
            this.f20962c = i10;
            this.f20963d = str2;
            this.f20964e = str3;
            this.f20965f = str4;
            this.f20966g = str5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(this.f20967h.f20950e, (Class<?>) SubTVArchiveActivity.class);
            intent.putExtra("OPENED_CHANNEL_ID", this.f20961b);
            intent.putExtra("OPENED_STREAM_ID", this.f20962c);
            intent.putExtra("OPENED_NUM", this.f20963d);
            intent.putExtra("OPENED_NAME", this.f20964e);
            intent.putExtra("OPENED_STREAM_ICON", this.f20965f);
            intent.putExtra("OPENED_ARCHIVE_DURATION", this.f20966g);
            this.f20967h.f20950e.startActivity(intent);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/TVArchiveAdapter$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.TVArchiveAdapter$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/TVArchiveAdapter$b.class */
    public class ViewOnClickListenerC3529b implements View.OnClickListener {

        /* renamed from: b */
        public final String f20968b;

        /* renamed from: c */
        public final int f20969c;

        /* renamed from: d */
        public final String f20970d;

        /* renamed from: e */
        public final String f20971e;

        /* renamed from: f */
        public final String f20972f;

        /* renamed from: g */
        public final String f20973g;

        /* renamed from: h */
        public final TVArchiveAdapter f20974h;

        public ViewOnClickListenerC3529b(TVArchiveAdapter tVArchiveAdapter, String str, int i10, String str2, String str3, String str4, String str5) {
            this.f20974h = tVArchiveAdapter;
            this.f20968b = str;
            this.f20969c = i10;
            this.f20970d = str2;
            this.f20971e = str3;
            this.f20972f = str4;
            this.f20973g = str5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(this.f20974h.f20950e, (Class<?>) SubTVArchiveActivity.class);
            intent.putExtra("OPENED_CHANNEL_ID", this.f20968b);
            intent.putExtra("OPENED_STREAM_ID", this.f20969c);
            intent.putExtra("OPENED_NUM", this.f20970d);
            intent.putExtra("OPENED_NAME", this.f20971e);
            intent.putExtra("OPENED_STREAM_ICON", this.f20972f);
            intent.putExtra("OPENED_ARCHIVE_DURATION", this.f20973g);
            this.f20974h.f20950e.startActivity(intent);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/TVArchiveAdapter$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.TVArchiveAdapter$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/TVArchiveAdapter$c.class */
    public class ViewOnClickListenerC3530c implements View.OnClickListener {

        /* renamed from: b */
        public final String f20975b;

        /* renamed from: c */
        public final int f20976c;

        /* renamed from: d */
        public final String f20977d;

        /* renamed from: e */
        public final String f20978e;

        /* renamed from: f */
        public final String f20979f;

        /* renamed from: g */
        public final String f20980g;

        /* renamed from: h */
        public final TVArchiveAdapter f20981h;

        public ViewOnClickListenerC3530c(TVArchiveAdapter tVArchiveAdapter, String str, int i10, String str2, String str3, String str4, String str5) {
            this.f20981h = tVArchiveAdapter;
            this.f20975b = str;
            this.f20976c = i10;
            this.f20977d = str2;
            this.f20978e = str3;
            this.f20979f = str4;
            this.f20980g = str5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(this.f20981h.f20950e, (Class<?>) SubTVArchiveActivity.class);
            intent.putExtra("OPENED_CHANNEL_ID", this.f20975b);
            intent.putExtra("OPENED_STREAM_ID", this.f20976c);
            intent.putExtra("OPENED_NUM", this.f20977d);
            intent.putExtra("OPENED_NAME", this.f20978e);
            intent.putExtra("OPENED_STREAM_ICON", this.f20979f);
            intent.putExtra("OPENED_ARCHIVE_DURATION", this.f20980g);
            this.f20981h.f20950e.startActivity(intent);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/TVArchiveAdapter$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.TVArchiveAdapter$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/TVArchiveAdapter$d.class */
    public class RunnableC3531d implements Runnable {

        /* renamed from: b */
        public final String f20982b;

        /* renamed from: c */
        public final TextView f20983c;

        /* renamed from: d */
        public final TVArchiveAdapter f20984d;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/TVArchiveAdapter$d$a.class
         */
        /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.TVArchiveAdapter$d$a */
        /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/TVArchiveAdapter$d$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final RunnableC3531d f20985b;

            public a(RunnableC3531d runnableC3531d) {
                this.f20985b = runnableC3531d;
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
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.TVArchiveAdapter$d r0 = r0.f20985b
                    java.lang.String r0 = r0.f20982b
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 == 0) goto L23
                    r0 = r3
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.TVArchiveAdapter$d r0 = r0.f20985b
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.TVArchiveAdapter r0 = r0.f20984d
                    r4 = r0
                    r0 = r4
                    java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.TVArchiveAdapter.m17498g0(r0)
                    r5 = r0
                L1a:
                    r0 = r4
                    r1 = r5
                    java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.TVArchiveAdapter.m17500i0(r0, r1)
                    goto L57
                L23:
                    r0 = r3
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.TVArchiveAdapter$d r0 = r0.f20985b
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.TVArchiveAdapter r0 = r0.f20984d
                    java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.TVArchiveAdapter.m17496e0(r0)
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L47
                    r0 = r3
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.TVArchiveAdapter$d r0 = r0.f20985b
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.TVArchiveAdapter r0 = r0.f20984d
                    java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.TVArchiveAdapter.m17496e0(r0)
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L57
                L47:
                    r0 = r3
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.TVArchiveAdapter$d r0 = r0.f20985b
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.TVArchiveAdapter r0 = r0.f20984d
                    r4 = r0
                    r0 = r4
                    java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.TVArchiveAdapter.m17496e0(r0)
                    r5 = r0
                    goto L1a
                L57:
                    r0 = r3
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.TVArchiveAdapter$d r0 = r0.f20985b
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.TVArchiveAdapter r0 = r0.f20984d
                    java.util.List r0 = com.maxdigitall.maxdigitaliptvbox.view.adapter.TVArchiveAdapter.m17499h0(r0)
                    int r0 = r0.size()
                    if (r0 != 0) goto L74
                    r0 = r3
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.TVArchiveAdapter$d r0 = r0.f20985b
                    android.widget.TextView r0 = r0.f20983c
                    r1 = 0
                    r0.setVisibility(r1)
                L74:
                    r0 = r3
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.TVArchiveAdapter$d r0 = r0.f20985b
                    com.maxdigitall.maxdigitaliptvbox.view.adapter.TVArchiveAdapter r0 = r0.f20984d
                    r0.m4099w()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.adapter.TVArchiveAdapter.RunnableC3531d.a.run():void");
            }
        }

        public RunnableC3531d(TVArchiveAdapter tVArchiveAdapter, String str, TextView textView) {
            this.f20984d = tVArchiveAdapter;
            this.f20982b = str;
            this.f20983c = textView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20984d.f20953h = new ArrayList();
            if (this.f20984d.f20953h != null) {
                this.f20984d.f20953h.clear();
            }
            if (TextUtils.isEmpty(this.f20982b)) {
                this.f20984d.f20953h.addAll(this.f20984d.f20954i);
            } else {
                for (LiveStreamsDBModel liveStreamsDBModel : this.f20984d.f20951f) {
                    if (liveStreamsDBModel.getName().toLowerCase().contains(this.f20982b.toLowerCase())) {
                        this.f20984d.f20953h.add(liveStreamsDBModel);
                    }
                }
            }
            ((Activity) this.f20984d.f20950e).runOnUiThread(new a(this));
        }
    }

    public TVArchiveAdapter(List<LiveStreamsDBModel> list, Context context) {
        this.f20951f = list;
        this.f20950e = context;
        ArrayList arrayList = new ArrayList();
        this.f20953h = arrayList;
        arrayList.addAll(list);
        this.f20954i = list;
        this.f20955j = new DatabaseHandler(context);
        this.f20956k = new LiveStreamDBHandler(context);
    }

    /* renamed from: j0 */
    public void m17501j0(String str, TextView textView) {
        new Thread(new RunnableC3531d(this, str, textView)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    @SuppressLint({"SimpleDateFormat", "SetTextI18n"})
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(MyViewHolder myViewHolder, int i10) {
        int i11;
        ImageView imageView;
        int i12;
        int m26258y;
        Context context = this.f20950e;
        if (context != null) {
            this.f20952g = context.getSharedPreferences("selectedPlayer", 0);
            try {
                i11 = Integer.parseInt(this.f20951f.get(i10).m14811R().trim());
            } catch (NumberFormatException e10) {
                i11 = -1;
            }
            String m14827g = this.f20951f.get(i10).m14827g();
            String m14798E = this.f20951f.get(i10).m14798E();
            myViewHolder.tvTime.setText("");
            myViewHolder.progressBar.setVisibility(8);
            myViewHolder.tvCurrentLive.setText("");
            int i13 = i11;
            if (m14798E != null) {
                i13 = i11;
                if (!m14798E.equals("")) {
                    LiveStreamDBHandler liveStreamDBHandler = this.f20956k;
                    i13 = i11;
                    if (liveStreamDBHandler != null) {
                        ArrayList<XMLTVProgrammePojo> m15160E1 = liveStreamDBHandler.m15160E1(m14798E);
                        i13 = i11;
                        if (m15160E1 != null) {
                            int i14 = 0;
                            while (true) {
                                i13 = i11;
                                if (i14 >= m15160E1.size()) {
                                    break;
                                }
                                String m15512j = m15160E1.get(i14).m15512j();
                                String m15514l = m15160E1.get(i14).m15514l();
                                String m15515m = m15160E1.get(i14).m15515m();
                                m15160E1.get(i14).m15504b();
                                Long valueOf = Long.valueOf(C5255e.m26244m(m15512j, this.f20950e));
                                Long valueOf2 = Long.valueOf(C5255e.m26244m(m15514l, this.f20950e));
                                if (!C5255e.m26208K(valueOf.longValue(), valueOf2.longValue(), this.f20950e) || (m26258y = C5255e.m26258y(valueOf.longValue(), valueOf2.longValue(), this.f20950e)) == 0) {
                                    i14++;
                                } else {
                                    int i15 = 100 - m26258y;
                                    if (i15 == 0 || m15515m.equals("")) {
                                        myViewHolder.tvTime.setVisibility(8);
                                        myViewHolder.progressBar.setVisibility(8);
                                        myViewHolder.tvCurrentLive.setVisibility(8);
                                    } else {
                                        if (C5251a.f30068u == 0) {
                                            myViewHolder.tvTime.setVisibility(0);
                                            SharedPreferences sharedPreferences = this.f20950e.getSharedPreferences("timeFormat", 0);
                                            f20949o = sharedPreferences;
                                            this.f20959n = new SimpleDateFormat(sharedPreferences.getString("timeFormat", C5251a.f30053m0));
                                            myViewHolder.tvTime.setText(this.f20959n.format(valueOf) + " - " + this.f20959n.format(valueOf2));
                                        }
                                        myViewHolder.progressBar.setVisibility(0);
                                        myViewHolder.progressBar.setProgress(i15);
                                        myViewHolder.tvCurrentLive.setVisibility(0);
                                        myViewHolder.tvCurrentLive.setText(m15515m);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i11 = i13;
            String m14805L = this.f20951f.get(i10).m14805L();
            String name = this.f20951f.get(i10).getName();
            myViewHolder.tvChannelName.setText(this.f20951f.get(i10).getName());
            String m14810Q = this.f20951f.get(i10).m14810Q();
            String m14798E2 = this.f20951f.get(i10).m14798E();
            String m14814U = this.f20951f.get(i10).m14814U();
            myViewHolder.ivChannelLogo.setImageDrawable(null);
            if (m14810Q == null || m14810Q.equals("")) {
                myViewHolder.ivChannelLogo.setImageDrawable(this.f20950e.getResources().getDrawable(2131231571, null));
            } else {
                C10014t.m42105q(this.f20950e).m42116l(m14810Q).m42154j(2131231571).m42151g(myViewHolder.ivChannelLogo);
            }
            myViewHolder.cardView.setOnClickListener(new ViewOnClickListenerC3528a(this, m14798E2, i11, m14805L, name, m14810Q, m14814U));
            myViewHolder.rlMovieImage.setOnClickListener(new ViewOnClickListenerC3529b(this, m14798E2, i11, m14805L, name, m14810Q, m14814U));
            myViewHolder.rlStreamsLayout.setOnClickListener(new ViewOnClickListenerC3530c(this, m14798E2, i11, m14805L, name, m14810Q, m14814U));
            ArrayList<FavouriteDBModel> m15112o = this.f20955j.m15112o(i11, m14827g, "live", SharepreferenceDBHandler.m15337A(this.f20950e));
            if (m15112o == null || m15112o.size() <= 0) {
                imageView = myViewHolder.ivFavourite;
                i12 = 4;
            } else {
                imageView = myViewHolder.ivFavourite;
                i12 = 0;
            }
            imageView.setVisibility(i12);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder mo2998J(ViewGroup viewGroup, int i10) {
        SharedPreferences sharedPreferences = this.f20950e.getSharedPreferences("listgridview", 0);
        this.f20958m = sharedPreferences;
        int i11 = sharedPreferences.getInt("livestream", 0);
        C5251a.f30068u = i11;
        MyViewHolder myViewHolder = i11 == 1 ? new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(2131624329, viewGroup, false)) : new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(2131624331, viewGroup, false));
        this.f20957l = myViewHolder;
        return myViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f20951f.size();
    }
}

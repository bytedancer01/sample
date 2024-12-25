package com.maxdigitall.maxdigitaliptvbox.view.adapter;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.XMLTVProgrammePojo;
import com.maxdigitall.maxdigitaliptvbox.view.activity.SubTVArchiveActivity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p099fc.AbstractC4822n;
import p151if.C5251a;
import p151if.C5255e;
import p216m9.C5974n;
import p316s2.C8522c;
import p428yg.C10014t;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/TVArchiveLiveChannelsAdapterNewFlow.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/TVArchiveLiveChannelsAdapterNewFlow.class */
public class TVArchiveLiveChannelsAdapterNewFlow extends RecyclerView.AbstractC0677h<MyViewHolder> {

    /* renamed from: m */
    public static SharedPreferences f20986m;

    /* renamed from: e */
    public List<LiveStreamsDBModel> f20987e;

    /* renamed from: f */
    public Context f20988f;

    /* renamed from: g */
    public List<LiveStreamsDBModel> f20989g;

    /* renamed from: h */
    public List<LiveStreamsDBModel> f20990h;

    /* renamed from: i */
    public LiveStreamDBHandler f20991i;

    /* renamed from: j */
    public SimpleDateFormat f20992j;

    /* renamed from: k */
    public boolean f20993k = true;

    /* renamed from: l */
    public String f20994l;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/TVArchiveLiveChannelsAdapterNewFlow$MyViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/TVArchiveLiveChannelsAdapterNewFlow$MyViewHolder.class */
    public static class MyViewHolder extends RecyclerView.AbstractC0674e0 {

        @BindView
        public ImageView ivChannelLogo;

        @BindView
        public ProgressBar pbPagingLoader;

        @BindView
        public ProgressBar progressBar;

        @BindView
        public RelativeLayout rlListOfCategories;

        @BindView
        public RelativeLayout rlOuter;

        @BindView
        public RelativeLayout testing;

        @BindView
        public TextView tvChannelId;

        @BindView
        public TextView tvCurrentLive;

        @BindView
        public TextView tvMovieCategoryName;

        @BindView
        public TextView tvTime;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.m5627b(this, view);
            m4048L(false);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/TVArchiveLiveChannelsAdapterNewFlow$MyViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/TVArchiveLiveChannelsAdapterNewFlow$MyViewHolder_ViewBinding.class */
    public class MyViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public MyViewHolder f20995b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f20995b = myViewHolder;
            myViewHolder.tvMovieCategoryName = (TextView) C8522c.m36739c(view, 2131429513, "field 'tvMovieCategoryName'", TextView.class);
            myViewHolder.pbPagingLoader = (ProgressBar) C8522c.m36739c(view, 2131428840, "field 'pbPagingLoader'", ProgressBar.class);
            myViewHolder.rlOuter = (RelativeLayout) C8522c.m36739c(view, 2131429028, "field 'rlOuter'", RelativeLayout.class);
            myViewHolder.rlListOfCategories = (RelativeLayout) C8522c.m36739c(view, 2131429008, "field 'rlListOfCategories'", RelativeLayout.class);
            myViewHolder.testing = (RelativeLayout) C8522c.m36739c(view, 2131429278, "field 'testing'", RelativeLayout.class);
            myViewHolder.tvChannelId = (TextView) C8522c.m36739c(view, 2131429383, "field 'tvChannelId'", TextView.class);
            myViewHolder.tvTime = (TextView) C8522c.m36739c(view, 2131429630, "field 'tvTime'", TextView.class);
            myViewHolder.progressBar = (ProgressBar) C8522c.m36739c(view, C5974n.f33499T, "field 'progressBar'", ProgressBar.class);
            myViewHolder.tvCurrentLive = (TextView) C8522c.m36739c(view, 2131429396, "field 'tvCurrentLive'", TextView.class);
            myViewHolder.ivChannelLogo = (ImageView) C8522c.m36739c(view, 2131428237, "field 'ivChannelLogo'", ImageView.class);
        }

        @Override // butterknife.Unbinder
        /* renamed from: a */
        public void mo5629a() {
            MyViewHolder myViewHolder = this.f20995b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f20995b = null;
            myViewHolder.tvMovieCategoryName = null;
            myViewHolder.pbPagingLoader = null;
            myViewHolder.rlOuter = null;
            myViewHolder.rlListOfCategories = null;
            myViewHolder.testing = null;
            myViewHolder.tvChannelId = null;
            myViewHolder.tvTime = null;
            myViewHolder.progressBar = null;
            myViewHolder.tvCurrentLive = null;
            myViewHolder.ivChannelLogo = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/TVArchiveLiveChannelsAdapterNewFlow$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.TVArchiveLiveChannelsAdapterNewFlow$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/TVArchiveLiveChannelsAdapterNewFlow$a.class */
    public class C3532a implements Comparator<LiveStreamsDBModel> {

        /* renamed from: b */
        public final TVArchiveLiveChannelsAdapterNewFlow f20996b;

        public C3532a(TVArchiveLiveChannelsAdapterNewFlow tVArchiveLiveChannelsAdapterNewFlow) {
            this.f20996b = tVArchiveLiveChannelsAdapterNewFlow;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(LiveStreamsDBModel liveStreamsDBModel, LiveStreamsDBModel liveStreamsDBModel2) {
            return AbstractC4822n.m24459j().mo24460d(liveStreamsDBModel.m14800G(), liveStreamsDBModel2.m14800G()).mo24465i();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/TVArchiveLiveChannelsAdapterNewFlow$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.TVArchiveLiveChannelsAdapterNewFlow$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/TVArchiveLiveChannelsAdapterNewFlow$b.class */
    public class ViewOnClickListenerC3533b implements View.OnClickListener {

        /* renamed from: b */
        public final LiveStreamsDBModel f20997b;

        /* renamed from: c */
        public final TVArchiveLiveChannelsAdapterNewFlow f20998c;

        public ViewOnClickListenerC3533b(TVArchiveLiveChannelsAdapterNewFlow tVArchiveLiveChannelsAdapterNewFlow, LiveStreamsDBModel liveStreamsDBModel) {
            this.f20998c = tVArchiveLiveChannelsAdapterNewFlow;
            this.f20997b = liveStreamsDBModel;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(this.f20998c.f20988f, (Class<?>) SubTVArchiveActivity.class);
            intent.putExtra("OPENED_CHANNEL_ID", this.f20997b.m14798E());
            intent.putExtra("OPENED_STREAM_ID", this.f20997b.m14811R());
            intent.putExtra("OPENED_NUM", this.f20997b.m14805L());
            intent.putExtra("OPENED_NAME", this.f20997b.getName());
            intent.putExtra("OPENED_STREAM_ICON", this.f20997b.m14810Q());
            intent.putExtra("OPENED_ARCHIVE_DURATION", this.f20997b.m14814U());
            this.f20998c.f20988f.startActivity(intent);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/TVArchiveLiveChannelsAdapterNewFlow$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.TVArchiveLiveChannelsAdapterNewFlow$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/TVArchiveLiveChannelsAdapterNewFlow$c.class */
    public class ViewOnClickListenerC3534c implements View.OnClickListener {

        /* renamed from: b */
        public final LiveStreamsDBModel f20999b;

        /* renamed from: c */
        public final TVArchiveLiveChannelsAdapterNewFlow f21000c;

        public ViewOnClickListenerC3534c(TVArchiveLiveChannelsAdapterNewFlow tVArchiveLiveChannelsAdapterNewFlow, LiveStreamsDBModel liveStreamsDBModel) {
            this.f21000c = tVArchiveLiveChannelsAdapterNewFlow;
            this.f20999b = liveStreamsDBModel;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Log.e("data Value Categories", ">>>>>>>>>>>>>>" + this.f20999b);
            Intent intent = new Intent(this.f21000c.f20988f, (Class<?>) SubTVArchiveActivity.class);
            intent.putExtra("OPENED_CHANNEL_ID", this.f20999b.m14798E());
            intent.putExtra("OPENED_STREAM_ID", this.f20999b.m14811R());
            intent.putExtra("OPENED_NUM", this.f20999b.m14805L());
            intent.putExtra("OPENED_NAME", this.f20999b.getName());
            intent.putExtra("OPENED_STREAM_ICON", this.f20999b.m14810Q());
            intent.putExtra("OPENED_ARCHIVE_DURATION", this.f20999b.m14814U());
            this.f21000c.f20988f.startActivity(intent);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/TVArchiveLiveChannelsAdapterNewFlow$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.TVArchiveLiveChannelsAdapterNewFlow$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/TVArchiveLiveChannelsAdapterNewFlow$d.class */
    public class ViewOnFocusChangeListenerC3535d implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f21001b;

        /* renamed from: c */
        public final TVArchiveLiveChannelsAdapterNewFlow f21002c;

        public ViewOnFocusChangeListenerC3535d(TVArchiveLiveChannelsAdapterNewFlow tVArchiveLiveChannelsAdapterNewFlow, View view) {
            this.f21002c = tVArchiveLiveChannelsAdapterNewFlow;
            this.f21001b = view;
        }

        /* renamed from: a */
        public final void m17508a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f21001b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m17509b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f21001b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m17510c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f21001b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            View view2;
            int i10;
            float f10 = 1.09f;
            if (z10) {
                if (!z10) {
                    f10 = 1.0f;
                }
                m17509b(f10);
                m17510c(f10);
                Log.e("id is", "" + this.f21001b.getTag());
                view2 = this.f21001b;
                i10 = 2131231896;
            } else {
                if (z10) {
                    return;
                }
                if (!z10) {
                    f10 = 1.0f;
                }
                m17509b(f10);
                m17510c(f10);
                m17508a(z10);
                view2 = this.f21001b;
                i10 = 2131231895;
            }
            view2.setBackgroundResource(i10);
        }
    }

    public TVArchiveLiveChannelsAdapterNewFlow(List<LiveStreamsDBModel> list, Context context) {
        this.f20994l = "";
        ArrayList arrayList = new ArrayList();
        this.f20989g = arrayList;
        arrayList.addAll(list);
        this.f20990h = list;
        this.f20987e = list;
        this.f20988f = context;
        this.f20991i = new LiveStreamDBHandler(context);
        this.f20994l = context.getSharedPreferences("selected_language", 0).getString("selected_language", "");
        Collections.sort(this.f20987e, new C3532a(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    @SuppressLint({"SimpleDateFormat", "SetTextI18n"})
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(MyViewHolder myViewHolder, int i10) {
        LiveStreamDBHandler liveStreamDBHandler;
        int m26258y;
        LiveStreamsDBModel liveStreamsDBModel = this.f20987e.get(i10);
        String name = liveStreamsDBModel.getName();
        liveStreamsDBModel.m14811R();
        String m14805L = liveStreamsDBModel.m14805L();
        String m14798E = liveStreamsDBModel.m14798E();
        String m14810Q = liveStreamsDBModel.m14810Q();
        if (name != null && !name.equals("") && !name.isEmpty()) {
            myViewHolder.tvMovieCategoryName.setText(name);
        }
        TextView textView = myViewHolder.tvChannelId;
        if (textView != null) {
            textView.setText(m14805L);
        }
        myViewHolder.tvTime.setText("");
        myViewHolder.progressBar.setVisibility(8);
        myViewHolder.tvCurrentLive.setText("");
        if (m14798E != null && !m14798E.equals("") && (liveStreamDBHandler = this.f20991i) != null) {
            ArrayList<XMLTVProgrammePojo> m15160E1 = liveStreamDBHandler.m15160E1(m14798E);
            if (m15160E1 != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= m15160E1.size()) {
                        break;
                    }
                    String m15512j = m15160E1.get(i11).m15512j();
                    String m15514l = m15160E1.get(i11).m15514l();
                    String m15515m = m15160E1.get(i11).m15515m();
                    m15160E1.get(i11).m15504b();
                    Long valueOf = Long.valueOf(C5255e.m26244m(m15512j, this.f20988f));
                    Long valueOf2 = Long.valueOf(C5255e.m26244m(m15514l, this.f20988f));
                    if (!C5255e.m26208K(valueOf.longValue(), valueOf2.longValue(), this.f20988f) || (m26258y = C5255e.m26258y(valueOf.longValue(), valueOf2.longValue(), this.f20988f)) == 0) {
                        i11++;
                    } else {
                        int i12 = 100 - m26258y;
                        if (i12 == 0 || m15515m == null || m15515m.equals("")) {
                            myViewHolder.tvTime.setVisibility(8);
                            myViewHolder.progressBar.setVisibility(8);
                            myViewHolder.tvCurrentLive.setVisibility(8);
                        } else {
                            if (C5251a.f30068u == 0) {
                                myViewHolder.tvTime.setVisibility(0);
                                SharedPreferences sharedPreferences = this.f20988f.getSharedPreferences("timeFormat", 0);
                                f20986m = sharedPreferences;
                                this.f20992j = new SimpleDateFormat(sharedPreferences.getString("timeFormat", C5251a.f30053m0));
                                myViewHolder.tvTime.setText(this.f20992j.format(valueOf) + " - " + this.f20992j.format(valueOf2));
                            }
                            myViewHolder.progressBar.setVisibility(0);
                            myViewHolder.progressBar.setProgress(i12);
                            myViewHolder.tvCurrentLive.setVisibility(0);
                            myViewHolder.tvCurrentLive.setText(m15515m);
                        }
                    }
                }
            }
            myViewHolder.ivChannelLogo.setImageDrawable(null);
            if (m14810Q == null || m14810Q.equals("")) {
                myViewHolder.ivChannelLogo.setImageDrawable(this.f20988f.getResources().getDrawable(2131231987, null));
            } else {
                C10014t.m42105q(this.f20988f).m42116l(m14810Q).m42154j(2131231987).m42151g(myViewHolder.ivChannelLogo);
            }
        }
        myViewHolder.rlOuter.setOnClickListener(new ViewOnClickListenerC3533b(this, liveStreamsDBModel));
        myViewHolder.rlListOfCategories.setOnClickListener(new ViewOnClickListenerC3534c(this, liveStreamsDBModel));
        RelativeLayout relativeLayout = myViewHolder.rlOuter;
        relativeLayout.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3535d(this, relativeLayout));
        if (i10 == 0 && this.f20993k) {
            myViewHolder.rlOuter.requestFocus();
            this.f20993k = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder mo2998J(ViewGroup viewGroup, int i10) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131624236, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(2131428181);
        if (this.f20994l.equalsIgnoreCase("Arabic")) {
            imageView.setImageResource(2131231526);
        }
        return new MyViewHolder(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f20987e.size();
    }
}

package com.maxdigitall.maxdigitaliptvbox.view.adapter;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.XMLTVProgrammePojo;
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
import p324sf.InterfaceC8568g;
import p428yg.C10014t;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerChannelsAdapter.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerChannelsAdapter.class */
public class MultiPlayerChannelsAdapter extends RecyclerView.AbstractC0677h<MyViewHolder> {

    /* renamed from: u */
    public static SharedPreferences f20074u;

    /* renamed from: e */
    public List<LiveStreamsDBModel> f20075e;

    /* renamed from: f */
    public Context f20076f;

    /* renamed from: g */
    public List<LiveStreamsDBModel> f20077g;

    /* renamed from: h */
    public List<LiveStreamsDBModel> f20078h;

    /* renamed from: i */
    public LiveStreamDBHandler f20079i;

    /* renamed from: j */
    public SimpleDateFormat f20080j;

    /* renamed from: l */
    public String f20082l;

    /* renamed from: m */
    public PopupWindow f20083m;

    /* renamed from: n */
    public PopupWindow f20084n;

    /* renamed from: o */
    public InterfaceC8568g f20085o;

    /* renamed from: p */
    public SharedPreferences f20086p;

    /* renamed from: q */
    public SharedPreferences f20087q;

    /* renamed from: r */
    public String f20088r;

    /* renamed from: t */
    public String f20090t;

    /* renamed from: k */
    public boolean f20081k = true;

    /* renamed from: s */
    public String f20089s = "";

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerChannelsAdapter$MyViewHolder.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerChannelsAdapter$MyViewHolder.class */
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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerChannelsAdapter$MyViewHolder_ViewBinding.class
     */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerChannelsAdapter$MyViewHolder_ViewBinding.class */
    public class MyViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b */
        public MyViewHolder f20091b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f20091b = myViewHolder;
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
            MyViewHolder myViewHolder = this.f20091b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f20091b = null;
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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerChannelsAdapter$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.MultiPlayerChannelsAdapter$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerChannelsAdapter$a.class */
    public class C3432a implements Comparator<LiveStreamsDBModel> {

        /* renamed from: b */
        public final MultiPlayerChannelsAdapter f20092b;

        public C3432a(MultiPlayerChannelsAdapter multiPlayerChannelsAdapter) {
            this.f20092b = multiPlayerChannelsAdapter;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(LiveStreamsDBModel liveStreamsDBModel, LiveStreamsDBModel liveStreamsDBModel2) {
            return AbstractC4822n.m24459j().mo24460d(liveStreamsDBModel.m14800G(), liveStreamsDBModel2.m14800G()).mo24465i();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerChannelsAdapter$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.MultiPlayerChannelsAdapter$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerChannelsAdapter$b.class */
    public class ViewOnClickListenerC3433b implements View.OnClickListener {

        /* renamed from: b */
        public final LiveStreamsDBModel f20093b;

        /* renamed from: c */
        public final MultiPlayerChannelsAdapter f20094c;

        public ViewOnClickListenerC3433b(MultiPlayerChannelsAdapter multiPlayerChannelsAdapter, LiveStreamsDBModel liveStreamsDBModel) {
            this.f20094c = multiPlayerChannelsAdapter;
            this.f20093b = liveStreamsDBModel;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            InterfaceC8568g interfaceC8568g;
            String str;
            if (this.f20094c.f20083m != null) {
                this.f20094c.f20083m.dismiss();
            }
            if (this.f20094c.f20084n != null) {
                this.f20094c.f20084n.dismiss();
            }
            if (this.f20094c.f20085o != null) {
                if (SharepreferenceDBHandler.m15373f(this.f20094c.f20076f).equals("m3u")) {
                    interfaceC8568g = this.f20094c.f20085o;
                    str = this.f20093b.m14816W();
                } else {
                    interfaceC8568g = this.f20094c.f20085o;
                    str = this.f20094c.f20090t + this.f20093b.m14811R() + this.f20094c.f20088r;
                }
                interfaceC8568g.mo18324j(String.valueOf(Uri.parse(str)), this.f20093b.m14805L());
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerChannelsAdapter$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.MultiPlayerChannelsAdapter$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerChannelsAdapter$c.class */
    public class ViewOnClickListenerC3434c implements View.OnClickListener {

        /* renamed from: b */
        public final LiveStreamsDBModel f20095b;

        /* renamed from: c */
        public final MultiPlayerChannelsAdapter f20096c;

        public ViewOnClickListenerC3434c(MultiPlayerChannelsAdapter multiPlayerChannelsAdapter, LiveStreamsDBModel liveStreamsDBModel) {
            this.f20096c = multiPlayerChannelsAdapter;
            this.f20095b = liveStreamsDBModel;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            InterfaceC8568g interfaceC8568g;
            String str;
            if (this.f20096c.f20083m != null) {
                this.f20096c.f20083m.dismiss();
            }
            if (this.f20096c.f20084n != null) {
                this.f20096c.f20084n.dismiss();
            }
            if (SharepreferenceDBHandler.m15373f(this.f20096c.f20076f).equals("m3u")) {
                interfaceC8568g = this.f20096c.f20085o;
                str = this.f20095b.m14816W();
            } else {
                interfaceC8568g = this.f20096c.f20085o;
                str = this.f20096c.f20090t + this.f20095b.m14811R() + this.f20096c.f20088r;
            }
            interfaceC8568g.mo18324j(String.valueOf(Uri.parse(str)), this.f20095b.m14805L());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerChannelsAdapter$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.adapter.MultiPlayerChannelsAdapter$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/adapter/MultiPlayerChannelsAdapter$d.class */
    public class ViewOnFocusChangeListenerC3435d implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f20097b;

        /* renamed from: c */
        public final MultiPlayerChannelsAdapter f20098c;

        public ViewOnFocusChangeListenerC3435d(MultiPlayerChannelsAdapter multiPlayerChannelsAdapter, View view) {
            this.f20098c = multiPlayerChannelsAdapter;
            this.f20097b = view;
        }

        /* renamed from: a */
        public final void m17233a(boolean z10) {
            if (z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f20097b, "alpha", z10 ? 0.6f : 0.5f);
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
        }

        /* renamed from: b */
        public final void m17234b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f20097b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: c */
        public final void m17235c(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f20097b, "scaleY", f10);
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
                m17234b(f10);
                m17235c(f10);
                Log.e("id is", "" + this.f20097b.getTag());
                view2 = this.f20097b;
                i10 = 2131231896;
            } else {
                if (z10) {
                    return;
                }
                if (!z10) {
                    f10 = 1.0f;
                }
                m17234b(f10);
                m17235c(f10);
                m17233a(z10);
                view2 = this.f20097b;
                i10 = 2131231895;
            }
            view2.setBackgroundResource(i10);
        }
    }

    public MultiPlayerChannelsAdapter(List<LiveStreamsDBModel> list, Context context, PopupWindow popupWindow, InterfaceC8568g interfaceC8568g, PopupWindow popupWindow2) {
        this.f20082l = "";
        ArrayList arrayList = new ArrayList();
        this.f20077g = arrayList;
        arrayList.addAll(list);
        this.f20078h = list;
        this.f20085o = interfaceC8568g;
        this.f20075e = list;
        this.f20076f = context;
        this.f20079i = new LiveStreamDBHandler(context);
        this.f20082l = context.getSharedPreferences("selected_language", 0).getString("selected_language", "");
        Collections.sort(this.f20075e, new C3432a(this));
        this.f20083m = popupWindow;
        this.f20084n = popupWindow2;
        if (SharepreferenceDBHandler.m15373f(context).equals("m3u")) {
            return;
        }
        m17231j0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    @SuppressLint({"SimpleDateFormat", "SetTextI18n"})
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void mo2996G(MyViewHolder myViewHolder, int i10) {
        LiveStreamDBHandler liveStreamDBHandler;
        int m26258y;
        LiveStreamsDBModel liveStreamsDBModel = this.f20075e.get(i10);
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
        if (m14798E != null && !m14798E.equals("") && (liveStreamDBHandler = this.f20079i) != null) {
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
                    Long valueOf = Long.valueOf(C5255e.m26244m(m15512j, this.f20076f));
                    Long valueOf2 = Long.valueOf(C5255e.m26244m(m15514l, this.f20076f));
                    if (!C5255e.m26208K(valueOf.longValue(), valueOf2.longValue(), this.f20076f) || (m26258y = C5255e.m26258y(valueOf.longValue(), valueOf2.longValue(), this.f20076f)) == 0) {
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
                                SharedPreferences sharedPreferences = this.f20076f.getSharedPreferences("timeFormat", 0);
                                f20074u = sharedPreferences;
                                this.f20080j = new SimpleDateFormat(sharedPreferences.getString("timeFormat", C5251a.f30053m0));
                                myViewHolder.tvTime.setText(this.f20080j.format(valueOf) + " - " + this.f20080j.format(valueOf2));
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
            if (m14810Q != null) {
                try {
                    if (!m14810Q.equals("")) {
                        C10014t.m42105q(this.f20076f).m42116l(m14810Q).m42154j(2131231987).m42151g(myViewHolder.ivChannelLogo);
                    }
                } catch (Exception e10) {
                    myViewHolder.ivChannelLogo.setImageDrawable(this.f20076f.getResources().getDrawable(2131231987, null));
                }
            }
            myViewHolder.ivChannelLogo.setImageDrawable(this.f20076f.getResources().getDrawable(2131231987, null));
        }
        myViewHolder.rlOuter.setOnClickListener(new ViewOnClickListenerC3433b(this, liveStreamsDBModel));
        myViewHolder.rlListOfCategories.setOnClickListener(new ViewOnClickListenerC3434c(this, liveStreamsDBModel));
        RelativeLayout relativeLayout = myViewHolder.rlOuter;
        relativeLayout.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3435d(this, relativeLayout));
        if (i10 == 0 && this.f20081k) {
            myViewHolder.rlOuter.requestFocus();
            this.f20081k = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder mo2998J(ViewGroup viewGroup, int i10) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131624236, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(2131428181);
        if (this.f20082l.equalsIgnoreCase("Arabic")) {
            imageView.setImageResource(2131231526);
        }
        return new MyViewHolder(inflate);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0190, code lost:
    
        if (r0.equals(org.apache.http.HttpHost.DEFAULT_SCHEME_NAME) == false) goto L33;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0189  */
    /* renamed from: j0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m17231j0() {
        /*
            Method dump skipped, instructions count: 745
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.adapter.MultiPlayerChannelsAdapter.m17231j0():void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677h
    /* renamed from: n */
    public int mo3013n() {
        return this.f20075e.size();
    }
}

package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamsDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.SeriesAllCategoriesSingleton;
import com.maxdigitall.maxdigitaliptvbox.model.VodAllCategoriesSingleton;
import com.maxdigitall.maxdigitaliptvbox.model.callback.SeriesDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.XMLTVProgrammePojo;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.LeftSideChannelsSearch;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.LiveAllDataRightSideAdapterSearch;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.RightSideProgramsSearch;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.SeriesAllDataRightSideAdapter;
import com.maxdigitall.maxdigitaliptvbox.view.adapter.VodAllDataRightSideAdapter;
import java.util.ArrayList;
import nf.C6783a;
import p151if.C5251a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SearchActivityLowerSDK.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SearchActivityLowerSDK.class */
public class SearchActivityLowerSDK extends Activity implements View.OnClickListener {

    /* renamed from: j */
    public static C6783a f18168j;

    /* renamed from: b */
    public LiveAllDataRightSideAdapterSearch f18169b;

    /* renamed from: c */
    public VodAllDataRightSideAdapter f18170c;

    @BindView
    public RecyclerView channelRecyclerView;

    /* renamed from: d */
    public SeriesAllDataRightSideAdapter f18171d;

    /* renamed from: e */
    public LeftSideChannelsSearch f18172e;

    /* renamed from: f */
    public ArrayList<XMLTVProgrammePojo> f18173f;

    /* renamed from: g */
    public RightSideProgramsSearch f18174g;

    /* renamed from: h */
    public Context f18175h;

    /* renamed from: i */
    public final int f18176i = 1;

    @BindView
    public ImageView iv_back_button;

    @BindView
    public RecyclerView liveRecyclerView;

    @BindView
    public TextView live_channels_tab;

    @BindView
    public LinearLayout llProgramBox;

    @BindView
    public LinearLayout ll_pb_recent_watch;

    @BindView
    public RecyclerView movieRecyclerView;

    @BindView
    public TextView movies_tab;

    @BindView
    public ProgressBar pb_recent_watch;

    @BindView
    public RecyclerView programRecyclerView;

    @BindView
    public TextView program_tab;

    @BindView
    public RecyclerView seriesRecyclerView;

    @BindView
    public TextView series_tab;

    @BindView
    public LinearLayout tabs_layout;

    @BindView
    public TextView tv_description;

    @BindView
    public TextView tv_no_record_found;

    @BindView
    public TextView tv_program_name_right_side;

    @BindView
    public TextView tv_program_start_date_right;

    @BindView
    public TextView tv_program_stop_date_right;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SearchActivityLowerSDK$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivityLowerSDK$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SearchActivityLowerSDK$a.class */
    public class RunnableC2992a implements Runnable {

        /* renamed from: b */
        public final SearchActivityLowerSDK f18177b;

        public RunnableC2992a(SearchActivityLowerSDK searchActivityLowerSDK) {
            this.f18177b = searchActivityLowerSDK;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView = this.f18177b.live_channels_tab;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SearchActivityLowerSDK$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivityLowerSDK$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SearchActivityLowerSDK$b.class */
    public class RunnableC2993b implements Runnable {

        /* renamed from: b */
        public final SearchActivityLowerSDK f18178b;

        public RunnableC2993b(SearchActivityLowerSDK searchActivityLowerSDK) {
            this.f18178b = searchActivityLowerSDK;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = this.f18178b.liveRecyclerView;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            this.f18178b.m16378o();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SearchActivityLowerSDK$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivityLowerSDK$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SearchActivityLowerSDK$c.class */
    public class RunnableC2994c implements Runnable {

        /* renamed from: b */
        public final SearchActivityLowerSDK f18179b;

        public RunnableC2994c(SearchActivityLowerSDK searchActivityLowerSDK) {
            this.f18179b = searchActivityLowerSDK;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView = this.f18179b.movies_tab;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SearchActivityLowerSDK$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivityLowerSDK$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SearchActivityLowerSDK$d.class */
    public class RunnableC2995d implements Runnable {

        /* renamed from: b */
        public final SearchActivityLowerSDK f18180b;

        public RunnableC2995d(SearchActivityLowerSDK searchActivityLowerSDK) {
            this.f18180b = searchActivityLowerSDK;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = this.f18180b.movieRecyclerView;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            this.f18180b.m16380q();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SearchActivityLowerSDK$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivityLowerSDK$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SearchActivityLowerSDK$e.class */
    public class RunnableC2996e implements Runnable {

        /* renamed from: b */
        public final SearchActivityLowerSDK f18181b;

        public RunnableC2996e(SearchActivityLowerSDK searchActivityLowerSDK) {
            this.f18181b = searchActivityLowerSDK;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView = this.f18181b.series_tab;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SearchActivityLowerSDK$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivityLowerSDK$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SearchActivityLowerSDK$f.class */
    public class RunnableC2997f implements Runnable {

        /* renamed from: b */
        public final SearchActivityLowerSDK f18182b;

        public RunnableC2997f(SearchActivityLowerSDK searchActivityLowerSDK) {
            this.f18182b = searchActivityLowerSDK;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = this.f18182b.seriesRecyclerView;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            this.f18182b.m16387x();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SearchActivityLowerSDK$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivityLowerSDK$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SearchActivityLowerSDK$g.class */
    public class RunnableC2998g implements Runnable {

        /* renamed from: b */
        public final SearchActivityLowerSDK f18183b;

        public RunnableC2998g(SearchActivityLowerSDK searchActivityLowerSDK) {
            this.f18183b = searchActivityLowerSDK;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView = this.f18183b.program_tab;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SearchActivityLowerSDK$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivityLowerSDK$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SearchActivityLowerSDK$h.class */
    public class RunnableC2999h implements Runnable {

        /* renamed from: b */
        public final SearchActivityLowerSDK f18184b;

        public RunnableC2999h(SearchActivityLowerSDK searchActivityLowerSDK) {
            this.f18184b = searchActivityLowerSDK;
        }

        @Override // java.lang.Runnable
        public void run() {
            LinearLayout linearLayout = this.f18184b.llProgramBox;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            this.f18184b.m16384u();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SearchActivityLowerSDK$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivityLowerSDK$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SearchActivityLowerSDK$i.class */
    public class RunnableC3000i implements Runnable {

        /* renamed from: b */
        public final String f18185b;

        /* renamed from: c */
        public final SearchActivityLowerSDK f18186c;

        public RunnableC3000i(SearchActivityLowerSDK searchActivityLowerSDK, String str) {
            this.f18186c = searchActivityLowerSDK;
            this.f18185b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView = this.f18186c.tv_no_record_found;
            if (textView != null) {
                textView.setText(this.f18185b);
                this.f18186c.tv_no_record_found.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SearchActivityLowerSDK$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivityLowerSDK$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SearchActivityLowerSDK$j.class */
    public class ViewOnFocusChangeListenerC3001j implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f18187b;

        /* renamed from: c */
        public final SearchActivityLowerSDK f18188c;

        public ViewOnFocusChangeListenerC3001j(SearchActivityLowerSDK searchActivityLowerSDK, View view) {
            this.f18188c = searchActivityLowerSDK;
            this.f18187b = view;
        }

        /* renamed from: a */
        public final void m16390a(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18187b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: b */
        public final void m16391b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18187b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            View view2;
            TextView textView;
            int i10;
            int i11;
            int i12;
            int i13;
            TextView textView2;
            int i14;
            TextView textView3;
            if (z10) {
                View view3 = this.f18187b;
                if (view3 == null || view3.getTag() == null) {
                    return;
                }
                if (this.f18187b.getTag().equals("10")) {
                    RecyclerView recyclerView = this.f18188c.liveRecyclerView;
                    i13 = 2131231008;
                    if (recyclerView != null) {
                        i13 = 2131231008;
                        if (recyclerView.getVisibility() == 0) {
                            textView3 = this.f18188c.live_channels_tab;
                        }
                    }
                    textView2 = this.f18188c.live_channels_tab;
                    i14 = i13;
                } else if (this.f18187b.getTag().equals("11")) {
                    RecyclerView recyclerView2 = this.f18188c.movieRecyclerView;
                    i12 = 2131231008;
                    if (recyclerView2 != null) {
                        i12 = 2131231008;
                        if (recyclerView2.getVisibility() == 0) {
                            textView3 = this.f18188c.movies_tab;
                        }
                    }
                    textView2 = this.f18188c.movies_tab;
                    i14 = i12;
                } else if (this.f18187b.getTag().equals("12")) {
                    RecyclerView recyclerView3 = this.f18188c.seriesRecyclerView;
                    i11 = 2131231008;
                    if (recyclerView3 != null) {
                        i11 = 2131231008;
                        if (recyclerView3.getVisibility() == 0) {
                            textView3 = this.f18188c.series_tab;
                        }
                    }
                    textView2 = this.f18188c.series_tab;
                    i14 = i11;
                } else {
                    if (!this.f18187b.getTag().equals("13")) {
                        m16390a(1.15f);
                        m16391b(1.15f);
                        return;
                    }
                    LinearLayout linearLayout = this.f18188c.llProgramBox;
                    i10 = 2131231008;
                    if (linearLayout != null) {
                        i10 = 2131231008;
                        if (linearLayout.getVisibility() == 0) {
                            textView3 = this.f18188c.program_tab;
                        }
                    }
                    textView2 = this.f18188c.program_tab;
                    i14 = i10;
                }
                textView3.setBackgroundResource(2131231009);
                return;
            }
            if (z10 || (view2 = this.f18187b) == null || view2.getTag() == null) {
                return;
            }
            float f10 = z10 ? 1.09f : 1.0f;
            m16390a(f10);
            m16391b(f10);
            if (this.f18187b.getTag() != null && this.f18187b.getTag().equals("10")) {
                RecyclerView recyclerView4 = this.f18188c.liveRecyclerView;
                if (recyclerView4 == null || recyclerView4.getVisibility() != 0) {
                    textView = this.f18188c.live_channels_tab;
                } else {
                    i13 = 2131231007;
                    textView2 = this.f18188c.live_channels_tab;
                    i14 = i13;
                }
            } else if (this.f18187b.getTag() != null && this.f18187b.getTag().equals("11")) {
                RecyclerView recyclerView5 = this.f18188c.movieRecyclerView;
                if (recyclerView5 == null || recyclerView5.getVisibility() != 0) {
                    textView = this.f18188c.movies_tab;
                } else {
                    i12 = 2131231007;
                    textView2 = this.f18188c.movies_tab;
                    i14 = i12;
                }
            } else if (this.f18187b.getTag() != null && this.f18187b.getTag().equals("12")) {
                RecyclerView recyclerView6 = this.f18188c.seriesRecyclerView;
                if (recyclerView6 == null || recyclerView6.getVisibility() != 0) {
                    textView = this.f18188c.series_tab;
                } else {
                    i11 = 2131231007;
                    textView2 = this.f18188c.series_tab;
                    i14 = i11;
                }
            } else {
                if (this.f18187b.getTag() == null || !this.f18187b.getTag().equals("13")) {
                    return;
                }
                LinearLayout linearLayout2 = this.f18188c.llProgramBox;
                if (linearLayout2 == null || linearLayout2.getVisibility() != 0) {
                    textView = this.f18188c.program_tab;
                } else {
                    i10 = 2131231007;
                    textView2 = this.f18188c.program_tab;
                    i14 = i10;
                }
            }
            textView.setBackgroundResource(2131231006);
            return;
            textView2.setBackgroundResource(i14);
        }
    }

    /* renamed from: A */
    public void m16351A(ArrayList<LiveStreamsDBModel> arrayList) {
        if (arrayList != null) {
            try {
                if (arrayList.size() > 0) {
                    VodAllCategoriesSingleton.m14909b().m14918j(arrayList);
                    this.liveRecyclerView.setLayoutManager(new GridLayoutManager(this, 7));
                    this.liveRecyclerView.setItemAnimator(null);
                    LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch = new LiveAllDataRightSideAdapterSearch(this.f18175h, arrayList);
                    this.f18169b = liveAllDataRightSideAdapterSearch;
                    this.liveRecyclerView.setAdapter(liveAllDataRightSideAdapterSearch);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* renamed from: B */
    public void m16352B(ArrayList<LiveStreamsDBModel> arrayList) {
        if (arrayList != null) {
            try {
                if (arrayList.size() > 0) {
                    VodAllCategoriesSingleton.m14909b().m14921m(arrayList);
                    this.movieRecyclerView.setLayoutManager(new GridLayoutManager(this, 7));
                    this.movieRecyclerView.setItemAnimator(null);
                    VodAllDataRightSideAdapter vodAllDataRightSideAdapter = new VodAllDataRightSideAdapter(this.f18175h, "vod");
                    this.f18170c = vodAllDataRightSideAdapter;
                    this.movieRecyclerView.setAdapter(vodAllDataRightSideAdapter);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* renamed from: C */
    public void m16353C(ArrayList<SeriesDBModel> arrayList) {
        if (arrayList != null) {
            try {
                if (arrayList.size() > 0) {
                    SeriesAllCategoriesSingleton.m14899b().m14905g(arrayList);
                    this.seriesRecyclerView.setLayoutManager(new GridLayoutManager(this, 7));
                    this.seriesRecyclerView.setItemAnimator(null);
                    SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter = new SeriesAllDataRightSideAdapter(this.f18175h, "series");
                    this.f18171d = seriesAllDataRightSideAdapter;
                    this.seriesRecyclerView.setAdapter(seriesAllDataRightSideAdapter);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* renamed from: D */
    public void m16354D() {
        RecyclerView recyclerView = this.liveRecyclerView;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        m16379p();
    }

    /* renamed from: E */
    public void m16355E() {
        TextView textView = this.live_channels_tab;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    /* renamed from: F */
    public void m16356F() {
        RecyclerView recyclerView = this.movieRecyclerView;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        m16381r();
    }

    /* renamed from: G */
    public void m16357G() {
        TextView textView = this.movies_tab;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    /* renamed from: H */
    public void m16358H(String str) {
        runOnUiThread(new RunnableC3000i(this, str));
    }

    /* renamed from: I */
    public void m16359I() {
        LinearLayout linearLayout = this.llProgramBox;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        m16385v();
    }

    /* renamed from: J */
    public void m16360J() {
        TextView textView = this.program_tab;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    /* renamed from: K */
    public void m16361K() {
        RecyclerView recyclerView = this.seriesRecyclerView;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        m16388y();
    }

    /* renamed from: L */
    public void m16362L() {
        TextView textView = this.series_tab;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    /* renamed from: M */
    public void m16363M(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList<XMLTVProgrammePojo> arrayList2 = this.f18173f;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        try {
            if (SharepreferenceDBHandler.m15373f(this.f18175h).equals("m3u")) {
                for (int i10 = 0; i10 < this.f18173f.size(); i10++) {
                    if (this.f18173f.get(i10).m15516n().equals(str)) {
                        arrayList.add(this.f18173f.get(i10));
                    }
                }
            } else {
                for (int i11 = 0; i11 < this.f18173f.size(); i11++) {
                    if (this.f18173f.get(i11).m15510h().equals(str)) {
                        arrayList.add(this.f18173f.get(i11));
                    }
                }
            }
            this.programRecyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
            this.programRecyclerView.setItemAnimator(null);
            RightSideProgramsSearch rightSideProgramsSearch = new RightSideProgramsSearch(this.f18175h, arrayList);
            this.f18174g = rightSideProgramsSearch;
            this.programRecyclerView.setAdapter(rightSideProgramsSearch);
        } catch (Exception e10) {
        }
    }

    /* renamed from: a */
    public void m16364a(int i10) {
        m16389z(this.f18173f, i10);
    }

    /* renamed from: b */
    public boolean m16365b() {
        TextView textView = this.live_channels_tab;
        return textView != null && textView.getVisibility() == 0;
    }

    /* renamed from: c */
    public boolean m16366c() {
        TextView textView = this.movies_tab;
        return textView != null && textView.getVisibility() == 0;
    }

    /* renamed from: d */
    public boolean m16367d() {
        TextView textView = this.series_tab;
        return textView != null && textView.getVisibility() == 0;
    }

    /* renamed from: e */
    public void m16368e() {
        runOnUiThread(new RunnableC2993b(this));
    }

    /* renamed from: f */
    public void m16369f() {
        runOnUiThread(new RunnableC2992a(this));
    }

    /* renamed from: g */
    public void m16370g() {
        runOnUiThread(new RunnableC2995d(this));
    }

    /* renamed from: h */
    public void m16371h() {
        runOnUiThread(new RunnableC2994c(this));
    }

    /* renamed from: i */
    public void m16372i() {
        TextView textView = this.tv_no_record_found;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: j */
    public void m16373j() {
        runOnUiThread(new RunnableC2999h(this));
    }

    /* renamed from: k */
    public void m16374k() {
        runOnUiThread(new RunnableC2998g(this));
    }

    /* renamed from: l */
    public void m16375l() {
        runOnUiThread(new RunnableC2997f(this));
    }

    /* renamed from: m */
    public void m16376m() {
        runOnUiThread(new RunnableC2996e(this));
    }

    /* renamed from: n */
    public final void m16377n() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception e10) {
        }
    }

    /* renamed from: o */
    public void m16378o() {
        TextView textView = this.live_channels_tab;
        if (textView != null) {
            textView.setBackgroundResource(2131231006);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case 2131428145:
                onBackPressed();
                break;
            case 2131428307:
                m16379p();
                m16370g();
                m16375l();
                m16373j();
                m16354D();
                break;
            case 2131428667:
                m16381r();
                m16368e();
                m16375l();
                m16373j();
                m16356F();
                break;
            case 2131428870:
                m16385v();
                m16368e();
                m16370g();
                m16375l();
                m16359I();
                break;
            case 2131429147:
                m16388y();
                m16368e();
                m16370g();
                m16373j();
                m16361K();
                break;
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f18175h = this;
        super.onCreate(bundle);
        f18168j = new C6783a(this.f18175h);
        if (C5251a.f30014M.booleanValue() && !f18168j.m31275m().booleanValue()) {
            finish();
        }
        setContentView(f18168j.m31288z().equals(C5251a.f30065s0) ? 2131624046 : 2131624045);
        ButterKnife.m5626a(this);
        m16382s();
        m16383t();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        m16377n();
    }

    /* renamed from: p */
    public void m16379p() {
        TextView textView = this.live_channels_tab;
        if (textView != null) {
            textView.setBackgroundResource(2131231007);
        }
        TextView textView2 = this.movies_tab;
        if (textView2 != null) {
            textView2.setBackgroundResource(2131231006);
        }
        TextView textView3 = this.series_tab;
        if (textView3 != null) {
            textView3.setBackgroundResource(2131231006);
        }
        TextView textView4 = this.program_tab;
        if (textView4 != null) {
            textView4.setBackgroundResource(2131231006);
        }
    }

    /* renamed from: q */
    public void m16380q() {
        TextView textView = this.movies_tab;
        if (textView != null) {
            textView.setBackgroundResource(2131231006);
        }
    }

    /* renamed from: r */
    public void m16381r() {
        TextView textView = this.movies_tab;
        if (textView != null) {
            textView.setBackgroundResource(2131231007);
        }
        TextView textView2 = this.live_channels_tab;
        if (textView2 != null) {
            textView2.setBackgroundResource(2131231006);
        }
        TextView textView3 = this.series_tab;
        if (textView3 != null) {
            textView3.setBackgroundResource(2131231006);
        }
        TextView textView4 = this.program_tab;
        if (textView4 != null) {
            textView4.setBackgroundResource(2131231006);
        }
    }

    /* renamed from: s */
    public final void m16382s() {
        TextView textView = this.live_channels_tab;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        TextView textView2 = this.movies_tab;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        TextView textView3 = this.series_tab;
        if (textView3 != null) {
            textView3.setOnClickListener(this);
        }
        TextView textView4 = this.program_tab;
        if (textView4 != null) {
            textView4.setOnClickListener(this);
        }
        this.iv_back_button.setOnClickListener(this);
    }

    /* renamed from: t */
    public final void m16383t() {
        TextView textView = this.live_channels_tab;
        if (textView != null) {
            textView.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3001j(this, textView));
        }
        TextView textView2 = this.movies_tab;
        if (textView2 != null) {
            textView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3001j(this, textView2));
        }
        TextView textView3 = this.series_tab;
        if (textView3 != null) {
            textView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3001j(this, textView3));
        }
        TextView textView4 = this.program_tab;
        if (textView4 != null) {
            textView4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3001j(this, textView4));
        }
    }

    /* renamed from: u */
    public void m16384u() {
        TextView textView = this.program_tab;
        if (textView != null) {
            textView.setBackgroundResource(2131231006);
        }
    }

    /* renamed from: v */
    public void m16385v() {
        TextView textView = this.program_tab;
        if (textView != null) {
            textView.setBackgroundResource(2131231007);
        }
        TextView textView2 = this.live_channels_tab;
        if (textView2 != null) {
            textView2.setBackgroundResource(2131231006);
        }
        TextView textView3 = this.movies_tab;
        if (textView3 != null) {
            textView3.setBackgroundResource(2131231006);
        }
        TextView textView4 = this.series_tab;
        if (textView4 != null) {
            textView4.setBackgroundResource(2131231006);
        }
    }

    /* renamed from: w */
    public void m16386w(String str, String str2, String str3, String str4, int i10) {
        TextView textView = this.tv_program_name_right_side;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.tv_description;
        if (textView2 != null) {
            textView2.setText(str2);
        }
        TextView textView3 = this.tv_program_start_date_right;
        if (textView3 != null) {
            textView3.setText(str3);
        }
        TextView textView4 = this.tv_program_stop_date_right;
        if (textView4 != null) {
            textView4.setText(str4);
        }
        if (i10 != 0) {
            ProgressBar progressBar = this.pb_recent_watch;
            if (progressBar != null) {
                progressBar.setProgress(i10);
            }
            LinearLayout linearLayout = this.ll_pb_recent_watch;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.ll_pb_recent_watch;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        ProgressBar progressBar2 = this.pb_recent_watch;
        if (progressBar2 != null) {
            progressBar2.setProgress(0);
        }
    }

    /* renamed from: x */
    public void m16387x() {
        TextView textView = this.series_tab;
        if (textView != null) {
            textView.setBackgroundResource(2131231006);
        }
    }

    /* renamed from: y */
    public void m16388y() {
        TextView textView = this.series_tab;
        if (textView != null) {
            textView.setBackgroundResource(2131231007);
        }
        TextView textView2 = this.live_channels_tab;
        if (textView2 != null) {
            textView2.setBackgroundResource(2131231006);
        }
        TextView textView3 = this.movies_tab;
        if (textView3 != null) {
            textView3.setBackgroundResource(2131231006);
        }
        TextView textView4 = this.program_tab;
        if (textView4 != null) {
            textView4.setBackgroundResource(2131231006);
        }
    }

    /* renamed from: z */
    public void m16389z(ArrayList<XMLTVProgrammePojo> arrayList, int i10) {
        try {
            this.f18173f = arrayList;
            if (arrayList == null || arrayList.size() <= 0) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (int i11 = 0; i11 < this.f18173f.size(); i11++) {
                if (!arrayList3.contains(this.f18173f.get(i11).m15508f())) {
                    arrayList3.add(this.f18173f.get(i11).m15508f());
                    arrayList2.add(this.f18173f.get(i11));
                }
            }
            if (arrayList2.size() > 0) {
                Log.e("honey", "setLeftChannelsAdapter: " + arrayList2.size());
            }
            this.channelRecyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
            this.channelRecyclerView.setItemAnimator(null);
            LeftSideChannelsSearch leftSideChannelsSearch = new LeftSideChannelsSearch(this.f18175h, arrayList2, i10);
            this.f18172e = leftSideChannelsSearch;
            this.channelRecyclerView.setAdapter(leftSideChannelsSearch);
            this.channelRecyclerView.mo2557n1(i10);
        } catch (Exception e10) {
        }
    }
}

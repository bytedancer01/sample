package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
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
import p030c0.C0936d;
import p050d0.C4290b;
import p151if.C5251a;
import p189kf.AbstractActivityC5601l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SearchActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SearchActivity.class */
public class SearchActivity extends AbstractActivityC5601l implements View.OnClickListener {

    /* renamed from: j */
    public static C6783a f18157j;

    /* renamed from: b */
    public LiveAllDataRightSideAdapterSearch f18158b;

    /* renamed from: c */
    public VodAllDataRightSideAdapter f18159c;

    @BindView
    public RecyclerView channelRecyclerView;

    /* renamed from: d */
    public SeriesAllDataRightSideAdapter f18160d;

    /* renamed from: e */
    public LeftSideChannelsSearch f18161e;

    /* renamed from: f */
    public ArrayList<XMLTVProgrammePojo> f18162f;

    /* renamed from: g */
    public RightSideProgramsSearch f18163g;

    /* renamed from: h */
    public Context f18164h;

    /* renamed from: i */
    public final int f18165i = 1;

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
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SearchActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SearchActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SearchActivity$a.class */
    public class ViewOnFocusChangeListenerC2991a implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f18166b;

        /* renamed from: c */
        public final SearchActivity f18167c;

        public ViewOnFocusChangeListenerC2991a(SearchActivity searchActivity, View view) {
            this.f18167c = searchActivity;
            this.f18166b = view;
        }

        /* renamed from: a */
        public final void m16349a(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18166b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: b */
        public final void m16350b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18166b, "scaleY", f10);
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
                View view3 = this.f18166b;
                if (view3 == null || view3.getTag() == null) {
                    return;
                }
                if (this.f18166b.getTag().equals("10")) {
                    RecyclerView recyclerView = this.f18167c.liveRecyclerView;
                    i13 = 2131231008;
                    if (recyclerView != null) {
                        i13 = 2131231008;
                        if (recyclerView.getVisibility() == 0) {
                            textView3 = this.f18167c.live_channels_tab;
                        }
                    }
                    textView2 = this.f18167c.live_channels_tab;
                    i14 = i13;
                } else if (this.f18166b.getTag().equals("11")) {
                    RecyclerView recyclerView2 = this.f18167c.movieRecyclerView;
                    i12 = 2131231008;
                    if (recyclerView2 != null) {
                        i12 = 2131231008;
                        if (recyclerView2.getVisibility() == 0) {
                            textView3 = this.f18167c.movies_tab;
                        }
                    }
                    textView2 = this.f18167c.movies_tab;
                    i14 = i12;
                } else if (this.f18166b.getTag().equals("12")) {
                    RecyclerView recyclerView3 = this.f18167c.seriesRecyclerView;
                    i11 = 2131231008;
                    if (recyclerView3 != null) {
                        i11 = 2131231008;
                        if (recyclerView3.getVisibility() == 0) {
                            textView3 = this.f18167c.series_tab;
                        }
                    }
                    textView2 = this.f18167c.series_tab;
                    i14 = i11;
                } else {
                    if (!this.f18166b.getTag().equals("13")) {
                        m16349a(1.15f);
                        m16350b(1.15f);
                        return;
                    }
                    LinearLayout linearLayout = this.f18167c.llProgramBox;
                    i10 = 2131231008;
                    if (linearLayout != null) {
                        i10 = 2131231008;
                        if (linearLayout.getVisibility() == 0) {
                            textView3 = this.f18167c.program_tab;
                        }
                    }
                    textView2 = this.f18167c.program_tab;
                    i14 = i10;
                }
                textView3.setBackgroundResource(2131231009);
                return;
            }
            if (z10 || (view2 = this.f18166b) == null || view2.getTag() == null) {
                return;
            }
            float f10 = z10 ? 1.09f : 1.0f;
            m16349a(f10);
            m16350b(f10);
            if (this.f18166b.getTag() != null && this.f18166b.getTag().equals("10")) {
                RecyclerView recyclerView4 = this.f18167c.liveRecyclerView;
                if (recyclerView4 == null || recyclerView4.getVisibility() != 0) {
                    textView = this.f18167c.live_channels_tab;
                } else {
                    i13 = 2131231007;
                    textView2 = this.f18167c.live_channels_tab;
                    i14 = i13;
                }
            } else if (this.f18166b.getTag() != null && this.f18166b.getTag().equals("11")) {
                RecyclerView recyclerView5 = this.f18167c.movieRecyclerView;
                if (recyclerView5 == null || recyclerView5.getVisibility() != 0) {
                    textView = this.f18167c.movies_tab;
                } else {
                    i12 = 2131231007;
                    textView2 = this.f18167c.movies_tab;
                    i14 = i12;
                }
            } else if (this.f18166b.getTag() != null && this.f18166b.getTag().equals("12")) {
                RecyclerView recyclerView6 = this.f18167c.seriesRecyclerView;
                if (recyclerView6 == null || recyclerView6.getVisibility() != 0) {
                    textView = this.f18167c.series_tab;
                } else {
                    i11 = 2131231007;
                    textView2 = this.f18167c.series_tab;
                    i14 = i11;
                }
            } else {
                if (this.f18166b.getTag() == null || !this.f18166b.getTag().equals("13")) {
                    return;
                }
                LinearLayout linearLayout2 = this.f18167c.llProgramBox;
                if (linearLayout2 == null || linearLayout2.getVisibility() != 0) {
                    textView = this.f18167c.program_tab;
                } else {
                    i10 = 2131231007;
                    textView2 = this.f18167c.program_tab;
                    i14 = i10;
                }
            }
            textView.setBackgroundResource(2131231006);
            return;
            textView2.setBackgroundResource(i14);
        }
    }

    /* renamed from: A0 */
    public void m16309A0() {
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

    /* renamed from: B0 */
    public final void m16310B0() {
        if (C4290b.m21722a(this, "android.permission.RECORD_AUDIO") == 0) {
            C4290b.m21722a(this, "android.permission.RECORD_AUDIO");
            return;
        }
        String[] strArr = {"android.permission.RECORD_AUDIO"};
        if (C0936d.m5645v(this, "android.permission.RECORD_AUDIO")) {
            C0936d.m5641r(this, strArr, 1);
        } else {
            C0936d.m5641r(this, strArr, 1);
        }
    }

    /* renamed from: C0 */
    public void m16311C0(String str, String str2, String str3, String str4, int i10) {
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

    /* renamed from: D0 */
    public void m16312D0() {
        TextView textView = this.series_tab;
        if (textView != null) {
            textView.setBackgroundResource(2131231006);
        }
    }

    /* renamed from: E0 */
    public void m16313E0() {
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

    /* renamed from: F0 */
    public void m16314F0(ArrayList<XMLTVProgrammePojo> arrayList, int i10) {
        try {
            this.f18162f = arrayList;
            if (arrayList == null || arrayList.size() <= 0) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (int i11 = 0; i11 < this.f18162f.size(); i11++) {
                if (!arrayList3.contains(this.f18162f.get(i11).m15508f())) {
                    arrayList3.add(this.f18162f.get(i11).m15508f());
                    arrayList2.add(this.f18162f.get(i11));
                }
            }
            if (arrayList2.size() > 0) {
                Log.e("honey", "setLeftChannelsAdapter: " + arrayList2.size());
            }
            this.channelRecyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
            this.channelRecyclerView.setItemAnimator(null);
            LeftSideChannelsSearch leftSideChannelsSearch = new LeftSideChannelsSearch(this.f18164h, arrayList2, i10);
            this.f18161e = leftSideChannelsSearch;
            this.channelRecyclerView.setAdapter(leftSideChannelsSearch);
            this.channelRecyclerView.mo2557n1(i10);
        } catch (Exception e10) {
        }
    }

    /* renamed from: G0 */
    public void m16315G0(ArrayList<LiveStreamsDBModel> arrayList) {
        if (arrayList != null) {
            try {
                if (arrayList.size() > 0) {
                    VodAllCategoriesSingleton.m14909b().m14918j(arrayList);
                    this.liveRecyclerView.setLayoutManager(new GridLayoutManager(this, 7));
                    this.liveRecyclerView.setItemAnimator(null);
                    LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch = new LiveAllDataRightSideAdapterSearch(this.f18164h, arrayList);
                    this.f18158b = liveAllDataRightSideAdapterSearch;
                    this.liveRecyclerView.setAdapter(liveAllDataRightSideAdapterSearch);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* renamed from: H0 */
    public void m16316H0(ArrayList<LiveStreamsDBModel> arrayList) {
        if (arrayList != null) {
            try {
                if (arrayList.size() > 0) {
                    VodAllCategoriesSingleton.m14909b().m14921m(arrayList);
                    this.movieRecyclerView.setLayoutManager(new GridLayoutManager(this, 7));
                    this.movieRecyclerView.setItemAnimator(null);
                    VodAllDataRightSideAdapter vodAllDataRightSideAdapter = new VodAllDataRightSideAdapter(this.f18164h, "vod");
                    this.f18159c = vodAllDataRightSideAdapter;
                    this.movieRecyclerView.setAdapter(vodAllDataRightSideAdapter);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* renamed from: I0 */
    public void m16317I0(ArrayList<SeriesDBModel> arrayList) {
        if (arrayList != null) {
            try {
                if (arrayList.size() > 0) {
                    SeriesAllCategoriesSingleton.m14899b().m14905g(arrayList);
                    this.seriesRecyclerView.setLayoutManager(new GridLayoutManager(this, 7));
                    this.seriesRecyclerView.setItemAnimator(null);
                    SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter = new SeriesAllDataRightSideAdapter(this.f18164h, "series");
                    this.f18160d = seriesAllDataRightSideAdapter;
                    this.seriesRecyclerView.setAdapter(seriesAllDataRightSideAdapter);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* renamed from: J0 */
    public void m16318J0() {
        RecyclerView recyclerView = this.liveRecyclerView;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        m16343t0();
    }

    /* renamed from: K0 */
    public void m16319K0() {
        TextView textView = this.live_channels_tab;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    /* renamed from: L0 */
    public void m16320L0() {
        RecyclerView recyclerView = this.movieRecyclerView;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        m16345v0();
    }

    /* renamed from: M0 */
    public void m16321M0() {
        TextView textView = this.movies_tab;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    /* renamed from: N0 */
    public void m16322N0(String str) {
        TextView textView = this.tv_no_record_found;
        if (textView != null) {
            textView.setText(str);
            this.tv_no_record_found.setVisibility(0);
        }
    }

    /* renamed from: O0 */
    public void m16323O0() {
        LinearLayout linearLayout = this.llProgramBox;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        m16309A0();
    }

    /* renamed from: P0 */
    public void m16324P0() {
        TextView textView = this.program_tab;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    /* renamed from: Q0 */
    public void m16325Q0() {
        RecyclerView recyclerView = this.seriesRecyclerView;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        m16313E0();
    }

    /* renamed from: R0 */
    public void m16326R0() {
        TextView textView = this.series_tab;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    /* renamed from: S0 */
    public void m16327S0(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList<XMLTVProgrammePojo> arrayList2 = this.f18162f;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        try {
            if (SharepreferenceDBHandler.m15373f(this.f18164h).equals("m3u")) {
                for (int i10 = 0; i10 < this.f18162f.size(); i10++) {
                    if (this.f18162f.get(i10).m15516n().equals(str)) {
                        arrayList.add(this.f18162f.get(i10));
                    }
                }
            } else {
                for (int i11 = 0; i11 < this.f18162f.size(); i11++) {
                    if (this.f18162f.get(i11).m15510h().equals(str)) {
                        arrayList.add(this.f18162f.get(i11));
                    }
                }
            }
            this.programRecyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
            this.programRecyclerView.setItemAnimator(null);
            RightSideProgramsSearch rightSideProgramsSearch = new RightSideProgramsSearch(this.f18164h, arrayList);
            this.f18163g = rightSideProgramsSearch;
            this.programRecyclerView.setAdapter(rightSideProgramsSearch);
        } catch (Exception e10) {
        }
    }

    /* renamed from: e0 */
    public void m16328e0(int i10) {
        m16314F0(this.f18162f, i10);
    }

    /* renamed from: f0 */
    public boolean m16329f0() {
        TextView textView = this.live_channels_tab;
        return textView != null && textView.getVisibility() == 0;
    }

    /* renamed from: g0 */
    public boolean m16330g0() {
        TextView textView = this.movies_tab;
        return textView != null && textView.getVisibility() == 0;
    }

    /* renamed from: h0 */
    public boolean m16331h0() {
        TextView textView = this.series_tab;
        return textView != null && textView.getVisibility() == 0;
    }

    /* renamed from: i0 */
    public void m16332i0() {
        RecyclerView recyclerView = this.liveRecyclerView;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        m16342s0();
    }

    /* renamed from: j0 */
    public void m16333j0() {
        TextView textView = this.live_channels_tab;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: k0 */
    public void m16334k0() {
        RecyclerView recyclerView = this.movieRecyclerView;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        m16344u0();
    }

    /* renamed from: l0 */
    public void m16335l0() {
        TextView textView = this.movies_tab;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: m0 */
    public void m16336m0() {
        TextView textView = this.tv_no_record_found;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: n0 */
    public void m16337n0() {
        LinearLayout linearLayout = this.llProgramBox;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        m16348z0();
    }

    /* renamed from: o0 */
    public void m16338o0() {
        TextView textView = this.program_tab;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case 2131428145:
                onBackPressed();
                break;
            case 2131428307:
                m16343t0();
                m16334k0();
                m16339p0();
                m16337n0();
                m16318J0();
                break;
            case 2131428667:
                m16345v0();
                m16332i0();
                m16339p0();
                m16337n0();
                m16320L0();
                break;
            case 2131428870:
                m16309A0();
                m16332i0();
                m16334k0();
                m16339p0();
                m16323O0();
                break;
            case 2131429147:
                m16313E0();
                m16332i0();
                m16334k0();
                m16337n0();
                m16325Q0();
                break;
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f18164h = this;
        super.onCreate(bundle);
        f18157j = new C6783a(this.f18164h);
        if (C5251a.f30014M.booleanValue() && !f18157j.m31275m().booleanValue()) {
            finish();
        }
        setContentView(f18157j.m31288z().equals(C5251a.f30065s0) ? 2131624047 : 2131624044);
        ButterKnife.m5626a(this);
        m16310B0();
        m16346w0();
        m16347x0();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 != 1) {
            return;
        }
        try {
            if (iArr.length > 0) {
                int i11 = iArr[0];
            }
        } catch (Exception e10) {
        }
    }

    @Override // p189kf.AbstractActivityC5601l, android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        m16341r0();
    }

    /* renamed from: p0 */
    public void m16339p0() {
        RecyclerView recyclerView = this.seriesRecyclerView;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        m16312D0();
    }

    /* renamed from: q0 */
    public void m16340q0() {
        TextView textView = this.series_tab;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: r0 */
    public final void m16341r0() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception e10) {
        }
    }

    /* renamed from: s0 */
    public void m16342s0() {
        TextView textView = this.live_channels_tab;
        if (textView != null) {
            textView.setBackgroundResource(2131231006);
        }
    }

    /* renamed from: t0 */
    public void m16343t0() {
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

    /* renamed from: u0 */
    public void m16344u0() {
        TextView textView = this.movies_tab;
        if (textView != null) {
            textView.setBackgroundResource(2131231006);
        }
    }

    /* renamed from: v0 */
    public void m16345v0() {
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

    /* renamed from: w0 */
    public final void m16346w0() {
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

    /* renamed from: x0 */
    public final void m16347x0() {
        TextView textView = this.live_channels_tab;
        if (textView != null) {
            textView.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2991a(this, textView));
        }
        TextView textView2 = this.movies_tab;
        if (textView2 != null) {
            textView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2991a(this, textView2));
        }
        TextView textView3 = this.series_tab;
        if (textView3 != null) {
            textView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2991a(this, textView3));
        }
        TextView textView4 = this.program_tab;
        if (textView4 != null) {
            textView4.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2991a(this, textView4));
        }
    }

    /* renamed from: z0 */
    public void m16348z0() {
        TextView textView = this.program_tab;
        if (textView != null) {
            textView.setBackgroundResource(2131231006);
        }
    }
}

package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.maxdigitall.maxdigitaliptvbox.model.LiveStreamCategoryIdDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.database.PasswordStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5255e;
import p203lf.C5872y;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivity.class */
public class TVArchiveActivity extends ActivityC0243b implements View.OnClickListener {

    @BindView
    public AppBarLayout appbarToolbar;

    /* renamed from: d */
    public Context f18963d;

    /* renamed from: e */
    public SharedPreferences f18964e;

    /* renamed from: g */
    public LiveStreamDBHandler f18966g;

    /* renamed from: h */
    public ArrayList<PasswordStatusDBModel> f18967h;

    /* renamed from: i */
    public ArrayList<LiveStreamCategoryIdDBModel> f18968i;

    /* renamed from: j */
    public ArrayList<LiveStreamCategoryIdDBModel> f18969j;

    /* renamed from: k */
    public ArrayList<LiveStreamCategoryIdDBModel> f18970k;

    /* renamed from: l */
    public ArrayList<LiveStreamCategoryIdDBModel> f18971l;

    @BindView
    public ProgressBar pbLoader;

    @BindView
    public TabLayout slidingTabs;

    @BindView
    public Toolbar toolbar;

    @BindView
    public ImageView tvHeaderTitle;

    @BindView
    public ViewPager viewpager;

    /* renamed from: f */
    public ArrayList<String> f18965f = new ArrayList<>();

    /* renamed from: m */
    public String f18972m = "";

    /* renamed from: n */
    public String f18973n = "";

    /* renamed from: o */
    public DatabaseUpdatedStatusDBModel f18974o = new DatabaseUpdatedStatusDBModel();

    /* renamed from: p */
    public DatabaseUpdatedStatusDBModel f18975p = new DatabaseUpdatedStatusDBModel();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TVArchiveActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TVArchiveActivity$a.class */
    public class C3194a implements ViewPager.InterfaceC0745j {

        /* renamed from: a */
        public final TVArchiveActivity f18976a;

        public C3194a(TVArchiveActivity tVArchiveActivity) {
            this.f18976a = tVArchiveActivity;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0745j
        /* renamed from: a */
        public void mo4794a(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0745j
        /* renamed from: b */
        public void mo4795b(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0745j
        /* renamed from: c */
        public void mo4796c(int i10) {
        }
    }

    /* renamed from: b */
    public void m16719b() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(2130772003, 2130772000);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != 2131429468) {
            return;
        }
        startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624078);
        ButterKnife.m5626a(this);
        overridePendingTransition(2130772003, 2130772000);
        m16720q0();
        m878n0((Toolbar) findViewById(2131429320));
        getWindow().setFlags(1024, 1024);
        this.f18963d = this;
        m16723t0();
        ImageView imageView = this.tvHeaderTitle;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        C5255e.m26233f(this.f18963d);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f18964e = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f18964e.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f18963d != null) {
            m16719b();
        }
    }

    /* renamed from: q0 */
    public final void m16720q0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: r0 */
    public final ArrayList<String> m16721r0() {
        ArrayList<PasswordStatusDBModel> m15232m1 = this.f18966g.m15232m1(SharepreferenceDBHandler.m15337A(this.f18963d));
        this.f18967h = m15232m1;
        if (m15232m1 != null) {
            Iterator<PasswordStatusDBModel> it = m15232m1.iterator();
            while (it.hasNext()) {
                PasswordStatusDBModel next = it.next();
                if (next.m15290a().equals("1")) {
                    this.f18965f.add(next.m15291b());
                }
            }
        }
        return this.f18965f;
    }

    /* renamed from: s0 */
    public final ArrayList<LiveStreamCategoryIdDBModel> m16722s0(ArrayList<LiveStreamCategoryIdDBModel> arrayList, ArrayList<String> arrayList2) {
        boolean z10;
        ArrayList<LiveStreamCategoryIdDBModel> arrayList3;
        if (arrayList == null) {
            return null;
        }
        Iterator<LiveStreamCategoryIdDBModel> it = arrayList.iterator();
        while (it.hasNext()) {
            LiveStreamCategoryIdDBModel next = it.next();
            if (arrayList2 != null) {
                Iterator<String> it2 = arrayList2.iterator();
                while (true) {
                    z10 = false;
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (next.m14787b().equals(it2.next())) {
                        z10 = true;
                        break;
                    }
                }
                if (!z10 && (arrayList3 = this.f18968i) != null) {
                    arrayList3.add(next);
                }
            }
        }
        return this.f18968i;
    }

    /* renamed from: t0 */
    public final void m16723t0() {
        ViewPager viewPager;
        try {
            if (this.f18963d != null) {
                this.f18966g = new LiveStreamDBHandler(this.f18963d);
                this.f18967h = new ArrayList<>();
                this.f18968i = new ArrayList<>();
                this.f18969j = new ArrayList<>();
                this.f18970k = new ArrayList<>();
                this.f18971l = new ArrayList<>();
                this.f18971l = this.f18966g.m15263x1();
                ArrayList<LiveStreamCategoryIdDBModel> m15263x1 = this.f18966g.m15263x1();
                LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
                new LiveStreamCategoryIdDBModel();
                liveStreamCategoryIdDBModel.m14792g("0");
                liveStreamCategoryIdDBModel.m14793h(getResources().getString(2132017297));
                if (this.f18966g.m15189R1(SharepreferenceDBHandler.m15337A(this.f18963d)) <= 0 || m15263x1 == null) {
                    m15263x1.add(0, liveStreamCategoryIdDBModel);
                } else {
                    ArrayList<String> m16721r0 = m16721r0();
                    this.f18965f = m16721r0;
                    this.f18969j = m16722s0(m15263x1, m16721r0);
                    this.f18968i.add(0, liveStreamCategoryIdDBModel);
                    m15263x1 = this.f18969j;
                }
                this.f18970k = m15263x1;
                ArrayList<LiveStreamCategoryIdDBModel> arrayList = this.f18970k;
                if (arrayList == null || (viewPager = this.viewpager) == null || this.slidingTabs == null) {
                    return;
                }
                viewPager.setAdapter(new C5872y(arrayList, getSupportFragmentManager(), this));
                this.slidingTabs.setupWithViewPager(this.viewpager);
                this.viewpager.setOnPageChangeListener(new C3194a(this));
            }
        } catch (NullPointerException | Exception e10) {
        }
    }
}

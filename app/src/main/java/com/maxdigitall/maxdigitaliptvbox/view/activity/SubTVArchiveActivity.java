package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.app.DialogC0242a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.maxdigitall.maxdigitaliptvbox.model.callback.LiveStreamsEpgCallback;
import com.maxdigitall.maxdigitaliptvbox.model.callback.LoginCallback;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.EpgListingPojo;
import com.maxdigitall.maxdigitaliptvbox.model.pojo.XMLTVProgrammePojo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5255e;
import p170jf.C5376h;
import p203lf.C5870w;
import p324sf.InterfaceC8566e;
import p324sf.InterfaceC8567f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SubTVArchiveActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SubTVArchiveActivity.class */
public class SubTVArchiveActivity extends ActivityC0243b implements InterfaceC8567f, InterfaceC8566e, View.OnClickListener {

    @BindView
    public AppBarLayout appbarToolbar;

    /* renamed from: d */
    public SharedPreferences f18950d;

    @BindView
    public TextView date;

    /* renamed from: e */
    public SharedPreferences f18951e;

    /* renamed from: f */
    public LiveStreamDBHandler f18952f;

    /* renamed from: g */
    public Context f18953g;

    /* renamed from: h */
    public C5376h f18954h;

    /* renamed from: i */
    public Thread f18955i = null;

    @BindView
    public ImageView iv_back_button;

    @BindView
    public ImageView logo;

    @BindView
    public ProgressBar pbLoader;

    @BindView
    public RelativeLayout rlTvArchiveTitle;

    @BindView
    public TabLayout slidingTabs;

    @BindView
    public TextView time;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tvEpgRequired;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public ViewPager viewpager;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SubTVArchiveActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SubTVArchiveActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SubTVArchiveActivity$a.class */
    public class ViewOnClickListenerC3188a implements View.OnClickListener {

        /* renamed from: b */
        public final SubTVArchiveActivity f18956b;

        public ViewOnClickListenerC3188a(SubTVArchiveActivity subTVArchiveActivity) {
            this.f18956b = subTVArchiveActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f18956b.f18953g);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SubTVArchiveActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SubTVArchiveActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SubTVArchiveActivity$b.class */
    public class ViewOnClickListenerC3189b implements View.OnClickListener {

        /* renamed from: b */
        public final SubTVArchiveActivity f18957b;

        public ViewOnClickListenerC3189b(SubTVArchiveActivity subTVArchiveActivity) {
            this.f18957b = subTVArchiveActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f18957b.onBackPressed();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SubTVArchiveActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SubTVArchiveActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SubTVArchiveActivity$c.class */
    public class RunnableC3190c implements Runnable {

        /* renamed from: b */
        public final SubTVArchiveActivity f18958b;

        public RunnableC3190c(SubTVArchiveActivity subTVArchiveActivity) {
            this.f18958b = subTVArchiveActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String date = Calendar.getInstance().getTime().toString();
                String m26199B = C5255e.m26199B(this.f18958b.f18953g);
                String m26249p = C5255e.m26249p(date);
                TextView textView = this.f18958b.time;
                if (textView != null) {
                    textView.setText(m26199B);
                }
                TextView textView2 = this.f18958b.date;
                if (textView2 != null) {
                    textView2.setText(m26249p);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SubTVArchiveActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SubTVArchiveActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SubTVArchiveActivity$d.class */
    public class DialogInterfaceOnClickListenerC3191d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SubTVArchiveActivity f18959b;

        public DialogInterfaceOnClickListenerC3191d(SubTVArchiveActivity subTVArchiveActivity) {
            this.f18959b = subTVArchiveActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SubTVArchiveActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SubTVArchiveActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SubTVArchiveActivity$e.class */
    public class DialogInterfaceOnClickListenerC3192e implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final SubTVArchiveActivity f18960b;

        public DialogInterfaceOnClickListenerC3192e(SubTVArchiveActivity subTVArchiveActivity) {
            this.f18960b = subTVArchiveActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f18960b.f18953g);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SubTVArchiveActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.SubTVArchiveActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SubTVArchiveActivity$f.class */
    public class RunnableC3193f implements Runnable {

        /* renamed from: b */
        public final SubTVArchiveActivity f18961b;

        public RunnableC3193f(SubTVArchiveActivity subTVArchiveActivity) {
            this.f18961b = subTVArchiveActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f18961b.m16715s0();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                } catch (Exception e11) {
                }
            }
        }
    }

    /* renamed from: t0 */
    public static long m16713t0(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    @Override // p324sf.InterfaceC8567f
    /* renamed from: D */
    public void mo15980D(LoginCallback loginCallback, String str, ArrayList<String> arrayList) {
    }

    @Override // p324sf.InterfaceC8567f
    /* renamed from: H */
    public void mo15984H(ArrayList<String> arrayList, String str) {
    }

    @Override // p324sf.InterfaceC8567f
    /* renamed from: P */
    public void mo15991P(String str) {
    }

    @Override // p324sf.InterfaceC8567f
    /* renamed from: Q */
    public void mo15993Q(ArrayList<String> arrayList, String str) {
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: a */
    public void mo15996a() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: b */
    public void mo15997b() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    @Override // p324sf.InterfaceC8563b
    /* renamed from: c */
    public void mo15998c(String str) {
    }

    @Override // p324sf.InterfaceC8567f
    /* renamed from: i */
    public void mo15999i(LoginCallback loginCallback, String str) {
        if (loginCallback == null || loginCallback.m15009b().m15084c().intValue() != 1) {
            return;
        }
        String m15090i = loginCallback.m15009b().m15090i();
        if (m15090i.equals("Active")) {
            return;
        }
        C5255e.m26241k0(this.f18953g, "Your Account is " + m15090i);
        Context context = this.f18953g;
        if (context != null) {
            C5255e.m26211N(context);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(2130772003, 2130772000);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f18953g = this;
        m16716u0();
        super.onCreate(bundle);
        setContentView(2131624069);
        ButterKnife.m5626a(this);
        m16714r0();
        m878n0((Toolbar) findViewById(2131429320));
        overridePendingTransition(2130772003, 2130772000);
        m16718v0();
        Thread thread = this.f18955i;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC3193f(this));
            this.f18955i = thread2;
            thread2.start();
        }
        this.logo.setOnClickListener(new ViewOnClickListenerC3188a(this));
        this.iv_back_button.setOnClickListener(new ViewOnClickListenerC3189b(this));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.m1224x(2131689482);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i10 = 0; i10 < this.toolbar.getChildCount(); i10++) {
            if (this.toolbar.getChildAt(i10) instanceof ActionMenuView) {
                ((Toolbar.C0292e) this.toolbar.getChildAt(i10).getLayoutParams()).f26228a = 16;
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        int itemId = menuItem.getItemId();
        if (itemId == 2131428761) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == 2131428776) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == 2131427416 && (context = this.f18953g) != null) {
            new DialogC0242a.a(context, 2132082693).setTitle(getResources().getString(2132017988)).m857e(getResources().getString(2132017987)).m861i(getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3192e(this)).m858f(getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3191d(this)).m865m();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f18955i;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f18955i.interrupt();
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        m16716u0();
        super.onResume();
        Thread thread = this.f18955i;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC3193f(this));
            this.f18955i = thread2;
            thread2.start();
        }
        C5255e.m26233f(this.f18953g);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f18950d = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f18950d.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        }
    }

    @Override // androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.clear();
    }

    @Override // androidx.appcompat.app.ActivityC0243b, androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        m16716u0();
    }

    /* renamed from: r0 */
    public final void m16714r0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: s0 */
    public void m16715s0() {
        runOnUiThread(new RunnableC3190c(this));
    }

    @Override // p324sf.InterfaceC8567f
    /* renamed from: t */
    public void mo16003t(String str) {
    }

    /* renamed from: u0 */
    public void m16716u0() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception e10) {
        }
    }

    @Override // p324sf.InterfaceC8566e
    /* renamed from: v */
    public void mo16717v(LiveStreamsEpgCallback liveStreamsEpgCallback, String str, String str2, String str3, String str4, String str5, String str6) {
        int i10;
        String str7;
        if (liveStreamsEpgCallback == null || liveStreamsEpgCallback.m15007a() == null || liveStreamsEpgCallback.m15007a().size() <= 0) {
            ViewPager viewPager = this.viewpager;
            if (viewPager != null) {
                viewPager.setVisibility(8);
            }
            TabLayout tabLayout = this.slidingTabs;
            if (tabLayout != null) {
                tabLayout.setVisibility(8);
            }
            RelativeLayout relativeLayout = this.rlTvArchiveTitle;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            TextView textView = this.tvNoRecordFound;
            if (textView != null) {
                textView.setVisibility(0);
            }
        } else {
            ArrayList arrayList = new ArrayList();
            new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (EpgListingPojo epgListingPojo : liveStreamsEpgCallback.m15007a()) {
                if (epgListingPojo.m15410d().intValue() == 1) {
                    arrayList.add(epgListingPojo);
                    XMLTVProgrammePojo xMLTVProgrammePojo = new XMLTVProgrammePojo();
                    xMLTVProgrammePojo.m15501A(epgListingPojo.m15414h());
                    xMLTVProgrammePojo.m15526x(epgListingPojo.m15411e());
                    xMLTVProgrammePojo.m15528z(epgListingPojo.m15409c());
                    xMLTVProgrammePojo.m15518p(epgListingPojo.m15408b());
                    xMLTVProgrammePojo.m15517o(epgListingPojo.m15407a());
                    xMLTVProgrammePojo.m15527y(epgListingPojo.m15412f());
                    xMLTVProgrammePojo.m15519q(epgListingPojo.m15413g());
                    arrayList2.add(xMLTVProgrammePojo);
                }
            }
            if (this.f18952f != null) {
                int size = arrayList2.size();
                if (size != 0) {
                    String format = new SimpleDateFormat("dd-MMM-yyyy", Locale.US).format(new Date());
                    ArrayList arrayList3 = new ArrayList();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
                    int i11 = 0;
                    int i12 = 0;
                    while (true) {
                        i10 = i12;
                        if (i11 >= size) {
                            break;
                        }
                        try {
                            str7 = new SimpleDateFormat("dd MMM yyyy").format(new SimpleDateFormat("yyyy-MM-dd").parse(((XMLTVProgrammePojo) arrayList2.get(i11)).m15512j().split("\\s+")[0]));
                        } catch (ParseException e10) {
                            e10.printStackTrace();
                            str7 = "";
                        }
                        int i13 = i10;
                        if (Long.valueOf(m16713t0(simpleDateFormat, str7, format)).longValue() >= 0) {
                            i13 = i10;
                            if (arrayList3.contains(str7)) {
                                continue;
                            } else {
                                arrayList3.add(i10, str7);
                                if (format.equals(str7)) {
                                    break;
                                } else {
                                    i13 = i10 + 1;
                                }
                            }
                        }
                        i11++;
                        i12 = i13;
                    }
                    this.viewpager.setAdapter(new C5870w(arrayList3, arrayList2, str2, str3, str4, str5, str, str6, getSupportFragmentManager(), this));
                    this.slidingTabs.setVisibility(0);
                    this.slidingTabs.setupWithViewPager(this.viewpager);
                    this.viewpager.setCurrentItem(i10 - 1);
                } else {
                    ViewPager viewPager2 = this.viewpager;
                    if (viewPager2 != null) {
                        viewPager2.setVisibility(8);
                    }
                    TabLayout tabLayout2 = this.slidingTabs;
                    if (tabLayout2 != null) {
                        tabLayout2.setVisibility(8);
                    }
                    RelativeLayout relativeLayout2 = this.rlTvArchiveTitle;
                    if (relativeLayout2 != null) {
                        relativeLayout2.setVisibility(0);
                    }
                    TextView textView2 = this.tvNoRecordFound;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                }
                mo15997b();
            }
        }
        mo15997b();
    }

    /* renamed from: v0 */
    public final void m16718v0() {
        int i10;
        this.slidingTabs.setVisibility(8);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f18951e = sharedPreferences;
        String string = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        String string2 = this.f18951e.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        String stringExtra = getIntent().getStringExtra("OPENED_STREAM_ID");
        String stringExtra2 = getIntent().getStringExtra("OPENED_NUM");
        String stringExtra3 = getIntent().getStringExtra("OPENED_CHANNEL_ID");
        String stringExtra4 = getIntent().getStringExtra("OPENED_NAME");
        String stringExtra5 = getIntent().getStringExtra("OPENED_STREAM_ICON");
        String stringExtra6 = getIntent().getStringExtra("OPENED_ARCHIVE_DURATION");
        this.f18952f = new LiveStreamDBHandler(this.f18953g);
        if (stringExtra3 != null) {
            stringExtra3.equals("");
        }
        this.f18954h = new C5376h(this, this.f18953g);
        try {
            i10 = Integer.parseInt(stringExtra);
        } catch (NumberFormatException e10) {
            i10 = -1;
        }
        this.f18954h.m26727b(string, string2, i10, stringExtra3, stringExtra, stringExtra2, stringExtra4, stringExtra5, stringExtra6);
    }
}

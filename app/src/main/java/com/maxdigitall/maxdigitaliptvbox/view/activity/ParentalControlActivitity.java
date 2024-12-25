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
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.app.DialogC0242a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.AbstractC0439y;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlCategoriesFragment;
import com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlM3UFragment;
import com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlRadioCategoriesFragment;
import com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlSeriesCatFragment;
import com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlSettingFragment;
import com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlVODCatFragment;
import com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalCotrolFragment;
import java.util.Calendar;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ParentalControlActivitity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ParentalControlActivitity.class */
public class ParentalControlActivitity extends ActivityC0243b implements View.OnClickListener, ParentalCotrolFragment.InterfaceC3711b, ParentalControlSettingFragment.InterfaceC3702a, ParentalControlCategoriesFragment.InterfaceC3683f, ParentalControlVODCatFragment.InterfaceC3709f, ParentalControlSeriesCatFragment.InterfaceC3701f, ParentalControlM3UFragment.InterfaceC3689f, ParentalControlRadioCategoriesFragment.InterfaceC3695f {

    /* renamed from: d */
    public Context f17904d;

    @BindView
    public TextView date;

    /* renamed from: e */
    public SharedPreferences f17905e;

    /* renamed from: f */
    public LiveStreamDBHandler f17906f;

    /* renamed from: g */
    public DatabaseUpdatedStatusDBModel f17907g = new DatabaseUpdatedStatusDBModel();

    /* renamed from: h */
    public DatabaseUpdatedStatusDBModel f17908h = new DatabaseUpdatedStatusDBModel();

    /* renamed from: i */
    public String f17909i = "";

    /* renamed from: j */
    public String f17910j = "";

    /* renamed from: k */
    public Thread f17911k = null;

    @BindView
    public ImageView logo;

    @BindView
    public TextView time;

    @BindView
    public Toolbar toolbar;

    @BindView
    public ImageView tvHeaderTitle;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ParentalControlActivitity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ParentalControlActivitity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ParentalControlActivitity$a.class */
    public class ViewOnClickListenerC2899a implements View.OnClickListener {

        /* renamed from: b */
        public final ParentalControlActivitity f17912b;

        public ViewOnClickListenerC2899a(ParentalControlActivitity parentalControlActivitity) {
            this.f17912b = parentalControlActivitity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f17912b.f17904d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ParentalControlActivitity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ParentalControlActivitity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ParentalControlActivitity$b.class */
    public class RunnableC2900b implements Runnable {

        /* renamed from: b */
        public final ParentalControlActivitity f17913b;

        public RunnableC2900b(ParentalControlActivitity parentalControlActivitity) {
            this.f17913b = parentalControlActivitity;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String date = Calendar.getInstance().getTime().toString();
                String m26199B = C5255e.m26199B(this.f17913b.f17904d);
                String m26249p = C5255e.m26249p(date);
                TextView textView = this.f17913b.time;
                if (textView != null) {
                    textView.setText(m26199B);
                }
                TextView textView2 = this.f17913b.date;
                if (textView2 != null) {
                    textView2.setText(m26249p);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ParentalControlActivitity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ParentalControlActivitity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ParentalControlActivitity$c.class */
    public class DialogInterfaceOnClickListenerC2901c implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ParentalControlActivitity f17914b;

        public DialogInterfaceOnClickListenerC2901c(ParentalControlActivitity parentalControlActivitity) {
            this.f17914b = parentalControlActivitity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ParentalControlActivitity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ParentalControlActivitity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ParentalControlActivitity$d.class */
    public class DialogInterfaceOnClickListenerC2902d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ParentalControlActivitity f17915b;

        public DialogInterfaceOnClickListenerC2902d(ParentalControlActivitity parentalControlActivitity) {
            this.f17915b = parentalControlActivitity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f17915b.f17904d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ParentalControlActivitity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ParentalControlActivitity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ParentalControlActivitity$e.class */
    public class DialogInterfaceOnClickListenerC2903e implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ParentalControlActivitity f17916b;

        public DialogInterfaceOnClickListenerC2903e(ParentalControlActivitity parentalControlActivitity) {
            this.f17916b = parentalControlActivitity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f17916b.f17904d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ParentalControlActivitity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ParentalControlActivitity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ParentalControlActivitity$f.class */
    public class DialogInterfaceOnClickListenerC2904f implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ParentalControlActivitity f17917b;

        public DialogInterfaceOnClickListenerC2904f(ParentalControlActivitity parentalControlActivitity) {
            this.f17917b = parentalControlActivitity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ParentalControlActivitity$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ParentalControlActivitity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ParentalControlActivitity$g.class */
    public class DialogInterfaceOnClickListenerC2905g implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ParentalControlActivitity f17918b;

        public DialogInterfaceOnClickListenerC2905g(ParentalControlActivitity parentalControlActivitity) {
            this.f17918b = parentalControlActivitity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ParentalControlActivitity$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ParentalControlActivitity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ParentalControlActivitity$h.class */
    public class DialogInterfaceOnClickListenerC2906h implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final ParentalControlActivitity f17919b;

        public DialogInterfaceOnClickListenerC2906h(ParentalControlActivitity parentalControlActivitity) {
            this.f17919b = parentalControlActivitity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ParentalControlActivitity$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ParentalControlActivitity$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ParentalControlActivitity$i.class */
    public class RunnableC2907i implements Runnable {

        /* renamed from: b */
        public final ParentalControlActivitity f17920b;

        public RunnableC2907i(ParentalControlActivitity parentalControlActivitity) {
            this.f17920b = parentalControlActivitity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f17920b.m16203s0();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                } catch (Exception e11) {
                }
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != 2131429468) {
            return;
        }
        startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
        overridePendingTransition(2130772003, 2130772000);
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624024);
        ButterKnife.m5626a(this);
        m16202r0();
        m878n0((Toolbar) findViewById(2131429320));
        m16204t0();
        Thread thread = this.f17911k;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC2907i(this));
            this.f17911k = thread2;
            thread2.start();
        }
        this.logo.setOnClickListener(new ViewOnClickListenerC2899a(this));
        ImageView imageView = this.tvHeaderTitle;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.m1224x(2131689500);
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
        if (itemId == 2131427416 && (context = this.f17904d) != null) {
            new DialogC0242a.a(context, 2132082693).setTitle(getResources().getString(2132017988)).m857e(getResources().getString(2132017987)).m861i(getResources().getString(2132018825), new DialogInterfaceOnClickListenerC2902d(this)).m858f(getResources().getString(2132018187), new DialogInterfaceOnClickListenerC2901c(this)).m865m();
        }
        if (itemId == 2131428637) {
            DialogC0242a.a aVar = new DialogC0242a.a(this);
            aVar.setTitle(this.f17904d.getResources().getString(2132017514));
            aVar.m857e(this.f17904d.getResources().getString(2132017585));
            aVar.m855c(2131231731);
            aVar.m861i(this.f17904d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC2903e(this));
            aVar.m858f(this.f17904d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC2904f(this));
            aVar.m865m();
        }
        if (itemId == 2131428639) {
            DialogC0242a.a aVar2 = new DialogC0242a.a(this);
            aVar2.setTitle(this.f17904d.getResources().getString(2132017514));
            aVar2.m857e(this.f17904d.getResources().getString(2132017585));
            aVar2.m855c(2131231731);
            aVar2.m861i(this.f17904d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC2905g(this));
            aVar2.m858f(this.f17904d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC2906h(this));
            aVar2.m865m();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f17911k;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f17911k.interrupt();
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f17911k;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC2907i(this));
            this.f17911k = thread2;
            thread2.start();
        }
        C5255e.m26233f(this.f17904d);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f17905e = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f17905e.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
            overridePendingTransition(2130772003, 2130772000);
        }
    }

    /* renamed from: r0 */
    public final void m16202r0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: s0 */
    public void m16203s0() {
        runOnUiThread(new RunnableC2900b(this));
    }

    /* renamed from: t0 */
    public final void m16204t0() {
        this.f17904d = this;
        this.f17906f = new LiveStreamDBHandler(this.f17904d);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f17905e = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f17905e.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
            overridePendingTransition(2130772003, 2130772000);
        } else if (this.f17904d != null) {
            ParentalCotrolFragment parentalCotrolFragment = new ParentalCotrolFragment();
            AbstractC0439y m2216m = getSupportFragmentManager().m2216m();
            m2216m.m2372t(R.anim.fade_in, R.anim.fade_out);
            m2216m.m2371s(2131428050, parentalCotrolFragment, "PARENTAL_CONTROL_SETTINGS");
            m2216m.mo1965k();
        }
    }
}

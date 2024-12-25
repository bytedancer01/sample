package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.R;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.app.DialogC0242a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.maxdigitall.maxdigitaliptvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.maxdigitall.maxdigitaliptvbox.model.database.LiveStreamDBHandler;
import java.util.Calendar;
import nf.C6783a;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5251a;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TimeFormatActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TimeFormatActivity.class */
public class TimeFormatActivity extends ActivityC0243b implements View.OnClickListener {

    @BindView
    public AppBarLayout appbarToolbar;

    @BindView
    public Button btSaveChanges;

    @BindView
    public Button btnBackPlayerselection;

    /* renamed from: d */
    public Context f19082d;

    @BindView
    public TextView date;

    /* renamed from: e */
    public SharedPreferences f19083e;

    /* renamed from: f */
    public SharedPreferences.Editor f19084f;

    /* renamed from: g */
    public LiveStreamDBHandler f19085g;

    /* renamed from: l */
    public C6783a f19090l;

    @BindView
    public ImageView logo;

    @BindView
    public RadioButton rb12hr;

    @BindView
    public RadioButton rb24hr;

    @BindView
    public RadioGroup rgRadio;

    @BindView
    public TextView time;

    @BindView
    public Toolbar toolbar;

    /* renamed from: h */
    public DatabaseUpdatedStatusDBModel f19086h = new DatabaseUpdatedStatusDBModel();

    /* renamed from: i */
    public DatabaseUpdatedStatusDBModel f19087i = new DatabaseUpdatedStatusDBModel();

    /* renamed from: j */
    public String f19088j = "";

    /* renamed from: k */
    public String f19089k = "";

    /* renamed from: m */
    public Thread f19091m = null;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TimeFormatActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TimeFormatActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TimeFormatActivity$a.class */
    public class RunnableC3220a implements Runnable {

        /* renamed from: b */
        public final TimeFormatActivity f19092b;

        public RunnableC3220a(TimeFormatActivity timeFormatActivity) {
            this.f19092b = timeFormatActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String date = Calendar.getInstance().getTime().toString();
                String m26199B = C5255e.m26199B(this.f19092b.f19082d);
                String m26249p = C5255e.m26249p(date);
                TextView textView = this.f19092b.time;
                if (textView != null) {
                    textView.setText(m26199B);
                }
                TextView textView2 = this.f19092b.date;
                if (textView2 != null) {
                    textView2.setText(m26249p);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TimeFormatActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TimeFormatActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TimeFormatActivity$b.class */
    public class ViewOnClickListenerC3221b implements View.OnClickListener {

        /* renamed from: b */
        public final TimeFormatActivity f19093b;

        public ViewOnClickListenerC3221b(TimeFormatActivity timeFormatActivity) {
            this.f19093b = timeFormatActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f19093b.f19082d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TimeFormatActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TimeFormatActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TimeFormatActivity$c.class */
    public class DialogInterfaceOnClickListenerC3222c implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final TimeFormatActivity f19094b;

        public DialogInterfaceOnClickListenerC3222c(TimeFormatActivity timeFormatActivity) {
            this.f19094b = timeFormatActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TimeFormatActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TimeFormatActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TimeFormatActivity$d.class */
    public class DialogInterfaceOnClickListenerC3223d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final TimeFormatActivity f19095b;

        public DialogInterfaceOnClickListenerC3223d(TimeFormatActivity timeFormatActivity) {
            this.f19095b = timeFormatActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f19095b.f19082d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TimeFormatActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TimeFormatActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TimeFormatActivity$e.class */
    public class DialogInterfaceOnClickListenerC3224e implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final TimeFormatActivity f19096b;

        public DialogInterfaceOnClickListenerC3224e(TimeFormatActivity timeFormatActivity) {
            this.f19096b = timeFormatActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f19096b.f19082d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TimeFormatActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TimeFormatActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TimeFormatActivity$f.class */
    public class DialogInterfaceOnClickListenerC3225f implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final TimeFormatActivity f19097b;

        public DialogInterfaceOnClickListenerC3225f(TimeFormatActivity timeFormatActivity) {
            this.f19097b = timeFormatActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TimeFormatActivity$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TimeFormatActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TimeFormatActivity$g.class */
    public class DialogInterfaceOnClickListenerC3226g implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final TimeFormatActivity f19098b;

        public DialogInterfaceOnClickListenerC3226g(TimeFormatActivity timeFormatActivity) {
            this.f19098b = timeFormatActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TimeFormatActivity$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TimeFormatActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TimeFormatActivity$h.class */
    public class DialogInterfaceOnClickListenerC3227h implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final TimeFormatActivity f19099b;

        public DialogInterfaceOnClickListenerC3227h(TimeFormatActivity timeFormatActivity) {
            this.f19099b = timeFormatActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TimeFormatActivity$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TimeFormatActivity$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TimeFormatActivity$i.class */
    public class RunnableC3228i implements Runnable {

        /* renamed from: b */
        public final TimeFormatActivity f19100b;

        public RunnableC3228i(TimeFormatActivity timeFormatActivity) {
            this.f19100b = timeFormatActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f19100b.m16765s0();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                } catch (Exception e11) {
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TimeFormatActivity$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TimeFormatActivity$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TimeFormatActivity$j.class */
    public class ViewOnFocusChangeListenerC3229j implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f19101b;

        /* renamed from: c */
        public final TimeFormatActivity f19102c;

        public ViewOnFocusChangeListenerC3229j(TimeFormatActivity timeFormatActivity, View view) {
            this.f19102c = timeFormatActivity;
            this.f19101b = view;
        }

        /* renamed from: a */
        public final void m16768a(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f19101b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: b */
        public final void m16769b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f19101b, "scaleY", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            View view2;
            View view3;
            int i10;
            float f10 = 1.0f;
            if (!z10) {
                if (z10) {
                    return;
                }
                if (z10) {
                    f10 = 1.09f;
                }
                m16768a(f10);
                m16769b(f10);
                View view4 = this.f19101b;
                if ((view4 == null || view4.getTag() == null || !this.f19101b.getTag().equals("1")) && ((view2 = this.f19101b) == null || view2.getTag() == null || !this.f19101b.getTag().equals("2"))) {
                    return;
                }
                this.f19101b.setBackgroundResource(2131230845);
                return;
            }
            if (z10) {
                f10 = 1.05f;
            }
            View view5 = this.f19101b;
            if (view5 == null || view5.getTag() == null || !this.f19101b.getTag().equals("1")) {
                View view6 = this.f19101b;
                if (view6 == null || view6.getTag() == null || !this.f19101b.getTag().equals("2")) {
                    View view7 = this.f19101b;
                    if (view7 == null || view7.getTag() == null) {
                        return;
                    }
                    this.f19101b.setBackground(this.f19102c.getResources().getDrawable(2131231814));
                    return;
                }
                m16768a(f10);
                m16769b(f10);
                view3 = this.f19101b;
                i10 = 2131231576;
            } else {
                m16768a(f10);
                m16769b(f10);
                view3 = this.f19101b;
                i10 = 2131230828;
            }
            view3.setBackgroundResource(i10);
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
        overridePendingTransition(2130772003, 2130772000);
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f19082d = this;
        super.onCreate(bundle);
        C6783a c6783a = new C6783a(this.f19082d);
        this.f19090l = c6783a;
        setContentView(c6783a.m31288z().equals(C5251a.f30065s0) ? 2131624075 : 2131624074);
        ButterKnife.m5626a(this);
        m16766t0();
        m16764r0();
        m878n0((Toolbar) findViewById(2131429320));
        getWindow().setFlags(1024, 1024);
        m16767u0();
        Thread thread = this.f19091m;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC3228i(this));
            this.f19091m = thread2;
            thread2.start();
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
        if (itemId == 2131427416 && (context = this.f19082d) != null) {
            new DialogC0242a.a(context, 2132082693).setTitle(getResources().getString(2132017988)).m857e(getResources().getString(2132017987)).m861i(getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3223d(this)).m858f(getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3222c(this)).m865m();
        }
        if (itemId == 2131428637) {
            DialogC0242a.a aVar = new DialogC0242a.a(this);
            aVar.setTitle(this.f19082d.getResources().getString(2132017514));
            aVar.m857e(this.f19082d.getResources().getString(2132017585));
            aVar.m855c(2131231731);
            aVar.m861i(this.f19082d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3224e(this));
            aVar.m858f(this.f19082d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3225f(this));
            aVar.m865m();
        }
        if (itemId == 2131428639) {
            DialogC0242a.a aVar2 = new DialogC0242a.a(this);
            aVar2.setTitle(this.f19082d.getResources().getString(2132017514));
            aVar2.m857e(this.f19082d.getResources().getString(2132017585));
            aVar2.m855c(2131231731);
            aVar2.m861i(this.f19082d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC3226g(this));
            aVar2.m858f(this.f19082d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC3227h(this));
            aVar2.m865m();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f19091m;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f19091m.interrupt();
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f19091m;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC3228i(this));
            this.f19091m = thread2;
            thread2.start();
        }
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f19083e = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f19083e.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
            overridePendingTransition(2130772003, 2130772000);
        }
    }

    @OnClick
    public void onViewClicked(View view) {
        SharedPreferences.Editor editor;
        String str;
        int id2 = view.getId();
        if (id2 == 2131427620) {
            RadioButton radioButton = (RadioButton) findViewById(this.rgRadio.getCheckedRadioButtonId());
            SharedPreferences sharedPreferences = getSharedPreferences("timeFormat", 0);
            this.f19083e = sharedPreferences;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            this.f19084f = edit;
            if (edit == null) {
                Toast.makeText(this, getResources().getString(2132018337), 0).show();
                return;
            }
            if (radioButton.getTag().equals(C5251a.f30055n0)) {
                editor = this.f19084f;
                str = "hh:mm a";
            } else {
                editor = this.f19084f;
                str = "HH:mm";
            }
            editor.putString("timeFormat", str);
            this.f19084f.apply();
            Toast.makeText(this, getResources().getString(2132018338), 0).show();
            Thread thread = this.f19091m;
            if (thread == null || !thread.isAlive()) {
                Thread thread2 = new Thread(new RunnableC3228i(this));
                this.f19091m = thread2;
                thread2.start();
            }
        } else if (id2 != 2131427634) {
            return;
        }
        finish();
    }

    /* renamed from: r0 */
    public final void m16764r0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: s0 */
    public void m16765s0() {
        runOnUiThread(new RunnableC3220a(this));
        this.logo.setOnClickListener(new ViewOnClickListenerC3221b(this));
    }

    /* renamed from: t0 */
    public final void m16766t0() {
        Button button = this.btSaveChanges;
        if (button != null) {
            button.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3229j(this, button));
            this.btSaveChanges.requestFocus();
            this.btSaveChanges.requestFocusFromTouch();
        }
        Button button2 = this.btnBackPlayerselection;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3229j(this, button2));
        }
        RadioButton radioButton = this.rb24hr;
        if (radioButton != null) {
            radioButton.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3229j(this, radioButton));
        }
        RadioButton radioButton2 = this.rb12hr;
        if (radioButton2 != null) {
            radioButton2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC3229j(this, radioButton2));
        }
    }

    /* renamed from: u0 */
    public final void m16767u0() {
        RadioButton radioButton;
        this.f19082d = this;
        this.f19085g = new LiveStreamDBHandler(this.f19082d);
        SharedPreferences sharedPreferences = getSharedPreferences("timeFormat", 0);
        this.f19083e = sharedPreferences;
        if (sharedPreferences.getString("timeFormat", C5251a.f30053m0).equals("hh:mm a")) {
            this.rb12hr.setChecked(true);
            radioButton = this.rb12hr;
        } else {
            this.rb24hr.setChecked(true);
            radioButton = this.rb24hr;
        }
        radioButton.requestFocus();
    }
}

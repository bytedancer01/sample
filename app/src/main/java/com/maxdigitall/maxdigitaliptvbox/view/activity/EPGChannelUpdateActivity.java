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
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGChannelUpdateActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGChannelUpdateActivity.class */
public class EPGChannelUpdateActivity extends ActivityC0243b implements View.OnClickListener {

    @BindView
    public AppBarLayout appbarToolbar;

    @BindView
    public Button btSaveChanges;

    @BindView
    public Button btnBackPlayerselection;

    /* renamed from: d */
    public Context f17017d;

    @BindView
    public TextView date;

    /* renamed from: e */
    public SharedPreferences f17018e;

    /* renamed from: f */
    public SharedPreferences.Editor f17019f;

    /* renamed from: g */
    public LiveStreamDBHandler f17020g;

    /* renamed from: h */
    public DatabaseUpdatedStatusDBModel f17021h = new DatabaseUpdatedStatusDBModel();

    /* renamed from: i */
    public DatabaseUpdatedStatusDBModel f17022i = new DatabaseUpdatedStatusDBModel();

    /* renamed from: j */
    public String f17023j = "";

    /* renamed from: k */
    public String f17024k = "";

    /* renamed from: l */
    public Thread f17025l = null;

    @BindView
    public ImageView logo;

    @BindView
    public RadioButton rballchannels;

    @BindView
    public RadioButton rbwithepg;

    @BindView
    public RadioGroup rgRadio;

    @BindView
    public TextView time;

    @BindView
    public Toolbar toolbar;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGChannelUpdateActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGChannelUpdateActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGChannelUpdateActivity$a.class */
    public class ViewOnClickListenerC2725a implements View.OnClickListener {

        /* renamed from: b */
        public final EPGChannelUpdateActivity f17026b;

        public ViewOnClickListenerC2725a(EPGChannelUpdateActivity ePGChannelUpdateActivity) {
            this.f17026b = ePGChannelUpdateActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f17026b.f17017d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGChannelUpdateActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGChannelUpdateActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGChannelUpdateActivity$b.class */
    public class RunnableC2726b implements Runnable {

        /* renamed from: b */
        public final EPGChannelUpdateActivity f17027b;

        public RunnableC2726b(EPGChannelUpdateActivity ePGChannelUpdateActivity) {
            this.f17027b = ePGChannelUpdateActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String date = Calendar.getInstance().getTime().toString();
                String m26199B = C5255e.m26199B(this.f17027b.f17017d);
                String m26249p = C5255e.m26249p(date);
                TextView textView = this.f17027b.time;
                if (textView != null) {
                    textView.setText(m26199B);
                }
                TextView textView2 = this.f17027b.date;
                if (textView2 != null) {
                    textView2.setText(m26249p);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGChannelUpdateActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGChannelUpdateActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGChannelUpdateActivity$c.class */
    public class DialogInterfaceOnClickListenerC2727c implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final EPGChannelUpdateActivity f17028b;

        public DialogInterfaceOnClickListenerC2727c(EPGChannelUpdateActivity ePGChannelUpdateActivity) {
            this.f17028b = ePGChannelUpdateActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGChannelUpdateActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGChannelUpdateActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGChannelUpdateActivity$d.class */
    public class DialogInterfaceOnClickListenerC2728d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final EPGChannelUpdateActivity f17029b;

        public DialogInterfaceOnClickListenerC2728d(EPGChannelUpdateActivity ePGChannelUpdateActivity) {
            this.f17029b = ePGChannelUpdateActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26211N(this.f17029b.f17017d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGChannelUpdateActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGChannelUpdateActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGChannelUpdateActivity$e.class */
    public class DialogInterfaceOnClickListenerC2729e implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final EPGChannelUpdateActivity f17030b;

        public DialogInterfaceOnClickListenerC2729e(EPGChannelUpdateActivity ePGChannelUpdateActivity) {
            this.f17030b = ePGChannelUpdateActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C5255e.m26210M(this.f17030b.f17017d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGChannelUpdateActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGChannelUpdateActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGChannelUpdateActivity$f.class */
    public class DialogInterfaceOnClickListenerC2730f implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final EPGChannelUpdateActivity f17031b;

        public DialogInterfaceOnClickListenerC2730f(EPGChannelUpdateActivity ePGChannelUpdateActivity) {
            this.f17031b = ePGChannelUpdateActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGChannelUpdateActivity$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGChannelUpdateActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGChannelUpdateActivity$g.class */
    public class DialogInterfaceOnClickListenerC2731g implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final EPGChannelUpdateActivity f17032b;

        public DialogInterfaceOnClickListenerC2731g(EPGChannelUpdateActivity ePGChannelUpdateActivity) {
            this.f17032b = ePGChannelUpdateActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGChannelUpdateActivity$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGChannelUpdateActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGChannelUpdateActivity$h.class */
    public class DialogInterfaceOnClickListenerC2732h implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final EPGChannelUpdateActivity f17033b;

        public DialogInterfaceOnClickListenerC2732h(EPGChannelUpdateActivity ePGChannelUpdateActivity) {
            this.f17033b = ePGChannelUpdateActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGChannelUpdateActivity$i.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGChannelUpdateActivity$i */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGChannelUpdateActivity$i.class */
    public class RunnableC2733i implements Runnable {

        /* renamed from: b */
        public final EPGChannelUpdateActivity f17034b;

        public RunnableC2733i(EPGChannelUpdateActivity ePGChannelUpdateActivity) {
            this.f17034b = ePGChannelUpdateActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f17034b.m15681s0();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                } catch (Exception e11) {
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGChannelUpdateActivity$j.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGChannelUpdateActivity$j */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGChannelUpdateActivity$j.class */
    public class ViewOnFocusChangeListenerC2734j implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f17035b;

        /* renamed from: c */
        public final EPGChannelUpdateActivity f17036c;

        public ViewOnFocusChangeListenerC2734j(EPGChannelUpdateActivity ePGChannelUpdateActivity, View view) {
            this.f17036c = ePGChannelUpdateActivity;
            this.f17035b = view;
        }

        /* renamed from: a */
        public final void m15684a(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17035b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: b */
        public final void m15685b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17035b, "scaleY", f10);
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
                m15684a(f10);
                m15685b(f10);
                View view4 = this.f17035b;
                if ((view4 == null || view4.getTag() == null || !this.f17035b.getTag().equals("1")) && ((view2 = this.f17035b) == null || view2.getTag() == null || !this.f17035b.getTag().equals("2"))) {
                    return;
                }
                this.f17035b.setBackgroundResource(2131230845);
                return;
            }
            if (z10) {
                f10 = 1.05f;
            }
            View view5 = this.f17035b;
            if (view5 == null || view5.getTag() == null || !this.f17035b.getTag().equals("1")) {
                View view6 = this.f17035b;
                if (view6 == null || view6.getTag() == null || !this.f17035b.getTag().equals("2")) {
                    View view7 = this.f17035b;
                    if (view7 == null || view7.getTag() == null) {
                        return;
                    }
                    this.f17035b.setBackground(this.f17036c.getResources().getDrawable(2131231814));
                    return;
                }
                m15684a(f10);
                m15685b(f10);
                view3 = this.f17035b;
                i10 = 2131231576;
            } else {
                m15684a(f10);
                m15685b(f10);
                view3 = this.f17035b;
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
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131623987);
        ButterKnife.m5626a(this);
        m15682t0();
        m15680r0();
        m878n0((Toolbar) findViewById(2131429320));
        getWindow().setFlags(1024, 1024);
        m15683u0();
        Thread thread = this.f17025l;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC2733i(this));
            this.f17025l = thread2;
            thread2.start();
        }
        this.logo.setOnClickListener(new ViewOnClickListenerC2725a(this));
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
        if (itemId == 2131427416 && (context = this.f17017d) != null) {
            new DialogC0242a.a(context, 2132082693).setTitle(getResources().getString(2132017988)).m857e(getResources().getString(2132017987)).m861i(getResources().getString(2132018825), new DialogInterfaceOnClickListenerC2728d(this)).m858f(getResources().getString(2132018187), new DialogInterfaceOnClickListenerC2727c(this)).m865m();
        }
        if (itemId == 2131428637) {
            DialogC0242a.a aVar = new DialogC0242a.a(this);
            aVar.setTitle(this.f17017d.getResources().getString(2132017514));
            aVar.m857e(this.f17017d.getResources().getString(2132017585));
            aVar.m855c(2131231731);
            aVar.m861i(this.f17017d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC2729e(this));
            aVar.m858f(this.f17017d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC2730f(this));
            aVar.m865m();
        }
        if (itemId == 2131428639) {
            DialogC0242a.a aVar2 = new DialogC0242a.a(this);
            aVar2.setTitle(this.f17017d.getResources().getString(2132017514));
            aVar2.m857e(this.f17017d.getResources().getString(2132017585));
            aVar2.m855c(2131231731);
            aVar2.m861i(this.f17017d.getResources().getString(2132018825), new DialogInterfaceOnClickListenerC2731g(this));
            aVar2.m858f(this.f17017d.getResources().getString(2132018187), new DialogInterfaceOnClickListenerC2732h(this));
            aVar2.m865m();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f17025l;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f17025l.interrupt();
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f17025l;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC2733i(this));
            this.f17025l = thread2;
            thread2.start();
        }
        C5255e.m26233f(this.f17017d);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f17018e = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f17018e.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        }
    }

    @OnClick
    public void onViewClicked(View view) {
        SharedPreferences.Editor editor;
        String str;
        int id2 = view.getId();
        if (id2 == 2131427620) {
            RadioButton radioButton = (RadioButton) findViewById(this.rgRadio.getCheckedRadioButtonId());
            SharedPreferences sharedPreferences = getSharedPreferences("epgchannelupdate", 0);
            this.f17018e = sharedPreferences;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            this.f17019f = edit;
            if (edit == null) {
                Toast.makeText(this, getResources().getString(2132018337), 0).show();
                return;
            }
            if (radioButton.getText().toString().equals(getResources().getString(2132017299))) {
                editor = this.f17019f;
                str = "all";
            } else {
                editor = this.f17019f;
                str = "withepg";
            }
            editor.putString("epgchannelupdate", str);
            this.f17019f.commit();
            Toast.makeText(this, getResources().getString(2132018338), 0).show();
        } else if (id2 != 2131427634) {
            return;
        }
        finish();
    }

    /* renamed from: r0 */
    public final void m15680r0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: s0 */
    public void m15681s0() {
        runOnUiThread(new RunnableC2726b(this));
    }

    /* renamed from: t0 */
    public final void m15682t0() {
        Button button = this.btSaveChanges;
        if (button != null) {
            button.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2734j(this, button));
        }
        Button button2 = this.btnBackPlayerselection;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2734j(this, button2));
        }
        RadioButton radioButton = this.rbwithepg;
        if (radioButton != null) {
            radioButton.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2734j(this, radioButton));
        }
        RadioButton radioButton2 = this.rballchannels;
        if (radioButton2 != null) {
            radioButton2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2734j(this, radioButton2));
        }
    }

    /* renamed from: u0 */
    public final void m15683u0() {
        RadioButton radioButton;
        this.f17017d = this;
        this.f17020g = new LiveStreamDBHandler(this.f17017d);
        SharedPreferences sharedPreferences = getSharedPreferences("epgchannelupdate", 0);
        this.f17018e = sharedPreferences;
        if (sharedPreferences.getString("epgchannelupdate", "").equals("all")) {
            this.rballchannels.setChecked(true);
            radioButton = this.rballchannels;
        } else {
            this.rbwithepg.setChecked(true);
            radioButton = this.rbwithepg;
        }
        radioButton.requestFocus();
    }
}

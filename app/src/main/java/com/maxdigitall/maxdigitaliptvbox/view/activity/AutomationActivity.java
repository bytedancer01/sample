package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.app.DialogC0242a;
import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
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
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AutomationActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AutomationActivity.class */
public class AutomationActivity extends ActivityC0243b implements View.OnClickListener {

    @BindView
    public AppBarLayout appbarToolbar;

    @BindView
    public Button btSaveChanges;

    @BindView
    public Button btnBackPlayerselection;

    @BindView
    public CheckBox cbAutomationEPG;

    @BindView
    public CheckBox cbAutomationLiveVod;

    /* renamed from: d */
    public Context f16916d;

    @BindView
    public TextView date;

    /* renamed from: e */
    public SharedPreferences f16917e;

    /* renamed from: f */
    public SharedPreferences.Editor f16918f;

    @BindView
    public FrameLayout fl_auto_update_days;

    @BindView
    public FrameLayout fl_auto_update_epg_days;

    /* renamed from: g */
    public SharedPreferences f16919g;

    /* renamed from: h */
    public SharedPreferences.Editor f16920h;

    /* renamed from: i */
    public LiveStreamDBHandler f16921i;

    @BindView
    public ImageView logo;

    /* renamed from: n */
    public DialogC0242a f16926n;

    /* renamed from: o */
    public C6783a f16927o;

    @BindView
    public TextView time;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tv_auto_update_days;

    @BindView
    public TextView tv_auto_update_epg_days;

    /* renamed from: j */
    public DatabaseUpdatedStatusDBModel f16922j = new DatabaseUpdatedStatusDBModel();

    /* renamed from: k */
    public DatabaseUpdatedStatusDBModel f16923k = new DatabaseUpdatedStatusDBModel();

    /* renamed from: l */
    public int f16924l = C5251a.f30051l0;

    /* renamed from: m */
    public int f16925m = C5251a.f30059p0;

    /* renamed from: p */
    public Thread f16928p = null;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AutomationActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AutomationActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AutomationActivity$a.class */
    public class ViewOnClickListenerC2695a implements View.OnClickListener {

        /* renamed from: b */
        public final AutomationActivity f16929b;

        public ViewOnClickListenerC2695a(AutomationActivity automationActivity) {
            this.f16929b = automationActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f16929b.f16916d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AutomationActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AutomationActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AutomationActivity$b.class */
    public class RunnableC2696b implements Runnable {

        /* renamed from: b */
        public final AutomationActivity f16930b;

        public RunnableC2696b(AutomationActivity automationActivity) {
            this.f16930b = automationActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String date = Calendar.getInstance().getTime().toString();
                String m26199B = C5255e.m26199B(this.f16930b.f16916d);
                String m26249p = C5255e.m26249p(date);
                TextView textView = this.f16930b.time;
                if (textView != null) {
                    textView.setText(m26199B);
                }
                TextView textView2 = this.f16930b.date;
                if (textView2 != null) {
                    textView2.setText(m26249p);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AutomationActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AutomationActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AutomationActivity$c.class */
    public class DialogInterfaceOnClickListenerC2697c implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final AutomationActivity f16931b;

        public DialogInterfaceOnClickListenerC2697c(AutomationActivity automationActivity) {
            this.f16931b = automationActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            TextView textView;
            CharSequence charSequence;
            switch (i10) {
                case 0:
                    this.f16931b.m15613z0(1);
                    textView = this.f16931b.tv_auto_update_epg_days;
                    charSequence = "1";
                    break;
                case 1:
                    this.f16931b.m15613z0(2);
                    textView = this.f16931b.tv_auto_update_epg_days;
                    charSequence = "2";
                    break;
                case 2:
                    this.f16931b.m15613z0(3);
                    textView = this.f16931b.tv_auto_update_epg_days;
                    charSequence = "3";
                    break;
                case 3:
                    this.f16931b.m15613z0(4);
                    textView = this.f16931b.tv_auto_update_epg_days;
                    charSequence = "4";
                    break;
                case 4:
                    this.f16931b.m15613z0(5);
                    textView = this.f16931b.tv_auto_update_epg_days;
                    charSequence = "5";
                    break;
                case 5:
                    this.f16931b.m15613z0(6);
                    textView = this.f16931b.tv_auto_update_epg_days;
                    charSequence = "6";
                    break;
                case 6:
                    this.f16931b.m15613z0(7);
                    textView = this.f16931b.tv_auto_update_epg_days;
                    charSequence = "7";
                    break;
                default:
                    return;
            }
            textView.setText(charSequence);
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AutomationActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AutomationActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AutomationActivity$d.class */
    public class DialogInterfaceOnDismissListenerC2698d implements DialogInterface.OnDismissListener {

        /* renamed from: b */
        public final AutomationActivity f16932b;

        public DialogInterfaceOnDismissListenerC2698d(AutomationActivity automationActivity) {
            this.f16932b = automationActivity;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AutomationActivity$e.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AutomationActivity$e */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AutomationActivity$e.class */
    public class DialogInterfaceOnClickListenerC2699e implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final AutomationActivity f16933b;

        public DialogInterfaceOnClickListenerC2699e(AutomationActivity automationActivity) {
            this.f16933b = automationActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            TextView textView;
            CharSequence charSequence;
            switch (i10) {
                case 0:
                    this.f16933b.m15611w0(1);
                    textView = this.f16933b.tv_auto_update_days;
                    charSequence = "1";
                    break;
                case 1:
                    this.f16933b.m15611w0(2);
                    textView = this.f16933b.tv_auto_update_days;
                    charSequence = "2";
                    break;
                case 2:
                    this.f16933b.m15611w0(3);
                    textView = this.f16933b.tv_auto_update_days;
                    charSequence = "3";
                    break;
                case 3:
                    this.f16933b.m15611w0(4);
                    textView = this.f16933b.tv_auto_update_days;
                    charSequence = "4";
                    break;
                case 4:
                    this.f16933b.m15611w0(5);
                    textView = this.f16933b.tv_auto_update_days;
                    charSequence = "5";
                    break;
                case 5:
                    this.f16933b.m15611w0(6);
                    textView = this.f16933b.tv_auto_update_days;
                    charSequence = "6";
                    break;
                case 6:
                    this.f16933b.m15611w0(7);
                    textView = this.f16933b.tv_auto_update_days;
                    charSequence = "7";
                    break;
                default:
                    return;
            }
            textView.setText(charSequence);
            dialogInterface.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AutomationActivity$f.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AutomationActivity$f */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AutomationActivity$f.class */
    public class DialogInterfaceOnDismissListenerC2700f implements DialogInterface.OnDismissListener {

        /* renamed from: b */
        public final AutomationActivity f16934b;

        public DialogInterfaceOnDismissListenerC2700f(AutomationActivity automationActivity) {
            this.f16934b = automationActivity;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AutomationActivity$g.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AutomationActivity$g */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AutomationActivity$g.class */
    public class RunnableC2701g implements Runnable {

        /* renamed from: b */
        public final AutomationActivity f16935b;

        public RunnableC2701g(AutomationActivity automationActivity) {
            this.f16935b = automationActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f16935b.m15612x0();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                } catch (Exception e11) {
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AutomationActivity$h.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AutomationActivity$h */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AutomationActivity$h.class */
    public class ViewOnFocusChangeListenerC2702h implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f16936b;

        /* renamed from: c */
        public final AutomationActivity f16937c;

        public ViewOnFocusChangeListenerC2702h(AutomationActivity automationActivity, View view) {
            this.f16937c = automationActivity;
            this.f16936b = view;
        }

        /* renamed from: a */
        public final void m15614a(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16936b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: b */
        public final void m15615b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16936b, "scaleY", f10);
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
                m15614a(f10);
                m15615b(f10);
                View view4 = this.f16936b;
                if ((view4 == null || view4.getTag() == null || !this.f16936b.getTag().equals("1")) && ((view2 = this.f16936b) == null || view2.getTag() == null || !this.f16936b.getTag().equals("2"))) {
                    return;
                }
                this.f16936b.setBackgroundResource(2131230845);
                return;
            }
            if (z10) {
                f10 = 1.05f;
            }
            View view5 = this.f16936b;
            if (view5 == null || view5.getTag() == null || !this.f16936b.getTag().equals("1")) {
                View view6 = this.f16936b;
                if (view6 == null || view6.getTag() == null || !this.f16936b.getTag().equals("2")) {
                    View view7 = this.f16936b;
                    if (view7 == null || view7.getTag() == null) {
                        return;
                    }
                    this.f16936b.setBackground(this.f16937c.getResources().getDrawable(2131231814));
                    return;
                }
                m15614a(f10);
                m15615b(f10);
                view3 = this.f16936b;
                i10 = 2131231576;
            } else {
                m15614a(f10);
                m15615b(f10);
                view3 = this.f16936b;
                i10 = 2131230828;
            }
            view3.setBackgroundResource(i10);
        }
    }

    /* renamed from: A0 */
    public final void m15606A0() {
        Button button = this.btSaveChanges;
        if (button != null) {
            button.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2702h(this, button));
        }
        Button button2 = this.btnBackPlayerselection;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2702h(this, button2));
        }
        CheckBox checkBox = this.cbAutomationLiveVod;
        if (checkBox != null) {
            checkBox.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2702h(this, checkBox));
        }
        CheckBox checkBox2 = this.cbAutomationEPG;
        if (checkBox2 != null) {
            checkBox2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2702h(this, checkBox2));
        }
        FrameLayout frameLayout = this.fl_auto_update_days;
        if (frameLayout != null) {
            frameLayout.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2702h(this, frameLayout));
        }
        FrameLayout frameLayout2 = this.fl_auto_update_epg_days;
        if (frameLayout2 != null) {
            frameLayout2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2702h(this, frameLayout2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0112  */
    /* renamed from: B0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m15607B0() {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.AutomationActivity.m15607B0():void");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(2130772003, 2130772000);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case 2131428022:
                m15608t0();
                break;
            case 2131428023:
                m15609u0();
                break;
            case 2131429468:
                startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
                overridePendingTransition(2130772003, 2130772000);
                break;
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f16916d = this;
        super.onCreate(bundle);
        C6783a c6783a = new C6783a(this.f16916d);
        this.f16927o = c6783a;
        setContentView(c6783a.m31288z().equals(C5251a.f30065s0) ? 2131623974 : 2131623973);
        ButterKnife.m5626a(this);
        m15606A0();
        m15610v0();
        m878n0((Toolbar) findViewById(2131429320));
        getWindow().setFlags(1024, 1024);
        this.logo.setOnClickListener(new ViewOnClickListenerC2695a(this));
        m15607B0();
        Thread thread = this.f16928p;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC2701g(this));
            this.f16928p = thread2;
            thread2.start();
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f16928p;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f16928p.interrupt();
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f16928p;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC2701g(this));
            this.f16928p = thread2;
            thread2.start();
        }
        C5255e.m26233f(this.f16916d);
    }

    @OnClick
    public void onViewClicked(View view) {
        int id2 = view.getId();
        if (id2 == 2131427620) {
            this.f16917e = getSharedPreferences("automation_channels", 0);
            this.f16919g = getSharedPreferences("automation_epg", 0);
            this.f16918f = this.f16917e.edit();
            this.f16920h = this.f16919g.edit();
            if (this.cbAutomationLiveVod.isChecked()) {
                SharedPreferences.Editor editor = this.f16918f;
                if (editor != null) {
                    editor.putString("automation_channels", "checked");
                }
            } else {
                SharedPreferences.Editor editor2 = this.f16918f;
                if (editor2 != null) {
                    editor2.putString("automation_channels", "unchecked");
                }
            }
            if (this.cbAutomationEPG.isChecked()) {
                SharedPreferences.Editor editor3 = this.f16920h;
                if (editor3 != null) {
                    editor3.putString("automation_epg", "checked");
                }
            } else {
                SharedPreferences.Editor editor4 = this.f16920h;
                if (editor4 != null) {
                    editor4.putString("automation_epg", "unchecked");
                }
            }
            this.f16918f.apply();
            this.f16920h.apply();
            Toast.makeText(this, getResources().getString(2132018338), 0).show();
        } else if (id2 != 2131427634) {
            return;
        }
        finish();
    }

    /* renamed from: t0 */
    public final void m15608t0() {
        DialogC0242a.a aVar = new DialogC0242a.a(this);
        aVar.setTitle(getResources().getString(2132017351));
        int i10 = this.f16917e.getInt("automation_channels_days", C5251a.f30051l0);
        this.f16924l = i10;
        int i11 = 0;
        switch (i10) {
            case 1:
                break;
            case 2:
                i11 = 1;
                break;
            case 3:
                i11 = 2;
                break;
            case 4:
                i11 = 3;
                break;
            case 5:
                i11 = 4;
                break;
            case 6:
                i11 = 5;
                break;
            case 7:
                i11 = 6;
                break;
            default:
                i11 = 0;
                break;
        }
        aVar.m863k(new CharSequence[]{"1", "2", "3", "4", "5", "6", "7"}, i11, new DialogInterfaceOnClickListenerC2699e(this));
        DialogC0242a create = aVar.create();
        this.f16926n = create;
        create.setOnDismissListener(new DialogInterfaceOnDismissListenerC2700f(this));
        this.f16926n.show();
    }

    /* renamed from: u0 */
    public final void m15609u0() {
        DialogC0242a.a aVar = new DialogC0242a.a(this);
        aVar.setTitle(getResources().getString(2132017351));
        int i10 = this.f16919g.getInt("automation_epg_days", C5251a.f30059p0);
        this.f16925m = i10;
        int i11 = 0;
        switch (i10) {
            case 1:
                break;
            case 2:
                i11 = 1;
                break;
            case 3:
                i11 = 2;
                break;
            case 4:
                i11 = 3;
                break;
            case 5:
                i11 = 4;
                break;
            case 6:
                i11 = 5;
                break;
            case 7:
                i11 = 6;
                break;
            default:
                i11 = 0;
                break;
        }
        aVar.m863k(new CharSequence[]{"1", "2", "3", "4", "5", "6", "7"}, i11, new DialogInterfaceOnClickListenerC2697c(this));
        DialogC0242a create = aVar.create();
        this.f16926n = create;
        create.setOnDismissListener(new DialogInterfaceOnDismissListenerC2698d(this));
        this.f16926n.show();
    }

    /* renamed from: v0 */
    public final void m15610v0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: w0 */
    public final void m15611w0(int i10) {
        SharedPreferences.Editor editor = this.f16918f;
        if (editor != null) {
            editor.putInt("automation_channels_days", i10);
            this.f16918f.apply();
        }
    }

    /* renamed from: x0 */
    public void m15612x0() {
        runOnUiThread(new RunnableC2696b(this));
    }

    /* renamed from: z0 */
    public final void m15613z0(int i10) {
        SharedPreferences.Editor editor = this.f16920h;
        if (editor != null) {
            editor.putInt("automation_epg_days", i10);
            this.f16920h.apply();
        }
    }
}

package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0243b;
import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Calendar;
import nf.C6783a;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5251a;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ScreenTypeSettingsActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ScreenTypeSettingsActivity.class */
public class ScreenTypeSettingsActivity extends ActivityC0243b implements View.OnClickListener {

    @BindView
    public AppBarLayout appbarToolbar;

    @BindView
    public Button btSaveChanges;

    @BindView
    public Button btnBackPlayerselection;

    /* renamed from: d */
    public Context f18142d;

    @BindView
    public TextView date;

    /* renamed from: e */
    public C6783a f18143e;

    /* renamed from: f */
    public Thread f18144f = null;

    @BindView
    public ImageView logo;

    @BindView
    public RadioButton rb_mobile;

    @BindView
    public RadioButton rb_tv;

    @BindView
    public RadioGroup rg_mobile_tv;

    @BindView
    public TextView time;

    @BindView
    public Toolbar toolbar;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ScreenTypeSettingsActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ScreenTypeSettingsActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ScreenTypeSettingsActivity$a.class */
    public class ViewOnClickListenerC2985a implements View.OnClickListener {

        /* renamed from: b */
        public final ScreenTypeSettingsActivity f18145b;

        public ViewOnClickListenerC2985a(ScreenTypeSettingsActivity screenTypeSettingsActivity) {
            this.f18145b = screenTypeSettingsActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5255e.m26224a(this.f18145b.f18142d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ScreenTypeSettingsActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ScreenTypeSettingsActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ScreenTypeSettingsActivity$b.class */
    public class RunnableC2986b implements Runnable {

        /* renamed from: b */
        public final ScreenTypeSettingsActivity f18146b;

        public RunnableC2986b(ScreenTypeSettingsActivity screenTypeSettingsActivity) {
            this.f18146b = screenTypeSettingsActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String date = Calendar.getInstance().getTime().toString();
                String m26199B = C5255e.m26199B(this.f18146b.f18142d);
                String m26249p = C5255e.m26249p(date);
                TextView textView = this.f18146b.time;
                if (textView != null) {
                    textView.setText(m26199B);
                }
                TextView textView2 = this.f18146b.date;
                if (textView2 != null) {
                    textView2.setText(m26249p);
                }
            } catch (Exception e10) {
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ScreenTypeSettingsActivity$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ScreenTypeSettingsActivity$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ScreenTypeSettingsActivity$c.class */
    public class RunnableC2987c implements Runnable {

        /* renamed from: b */
        public final ScreenTypeSettingsActivity f18147b;

        public RunnableC2987c(ScreenTypeSettingsActivity screenTypeSettingsActivity) {
            this.f18147b = screenTypeSettingsActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    this.f18147b.m16304s0();
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                } catch (Exception e11) {
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ScreenTypeSettingsActivity$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ScreenTypeSettingsActivity$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ScreenTypeSettingsActivity$d.class */
    public class ViewOnFocusChangeListenerC2988d implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f18148b;

        /* renamed from: c */
        public final ScreenTypeSettingsActivity f18149c;

        public ViewOnFocusChangeListenerC2988d(ScreenTypeSettingsActivity screenTypeSettingsActivity, View view) {
            this.f18149c = screenTypeSettingsActivity;
            this.f18148b = view;
        }

        /* renamed from: a */
        public final void m16307a(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18148b, "scaleX", f10);
            ofFloat.setDuration(150L);
            ofFloat.start();
        }

        /* renamed from: b */
        public final void m16308b(float f10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18148b, "scaleY", f10);
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
                m16307a(f10);
                m16308b(f10);
                View view4 = this.f18148b;
                if ((view4 == null || view4.getTag() == null || !this.f18148b.getTag().equals("1")) && ((view2 = this.f18148b) == null || view2.getTag() == null || !this.f18148b.getTag().equals("2"))) {
                    return;
                }
                this.f18148b.setBackgroundResource(2131230845);
                return;
            }
            if (z10) {
                f10 = 1.05f;
            }
            View view5 = this.f18148b;
            if (view5 == null || view5.getTag() == null || !this.f18148b.getTag().equals("1")) {
                View view6 = this.f18148b;
                if (view6 == null || view6.getTag() == null || !this.f18148b.getTag().equals("2")) {
                    View view7 = this.f18148b;
                    if (view7 == null || view7.getTag() == null) {
                        return;
                    }
                    this.f18148b.setBackground(this.f18149c.getResources().getDrawable(2131231814));
                    return;
                }
                m16307a(f10);
                m16308b(f10);
                view3 = this.f18148b;
                i10 = 2131231576;
            } else {
                m16307a(f10);
                m16308b(f10);
                view3 = this.f18148b;
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
        this.f18142d = this;
        super.onCreate(bundle);
        C6783a c6783a = new C6783a(this.f18142d);
        this.f18143e = c6783a;
        setContentView(c6783a.m31288z().equals(C5251a.f30065s0) ? 2131624043 : 2131624042);
        ButterKnife.m5626a(this);
        m16305t0();
        m16303r0();
        m878n0((Toolbar) findViewById(2131429320));
        getWindow().setFlags(1024, 1024);
        m16306u0();
        Thread thread = this.f18144f;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC2987c(this));
            this.f18144f = thread2;
            thread2.start();
        }
        this.logo.setOnClickListener(new ViewOnClickListenerC2985a(this));
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f18144f;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f18144f.interrupt();
        } catch (Exception e10) {
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f18144f;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new RunnableC2987c(this));
            this.f18144f = thread2;
            thread2.start();
        }
        C5255e.m26233f(this.f18142d);
    }

    @OnClick
    public void onViewClicked(View view) {
        C6783a c6783a;
        String str;
        int id2 = view.getId();
        if (id2 != 2131427620) {
            if (id2 != 2131427634) {
                return;
            }
            finish();
            return;
        }
        RadioButton radioButton = (RadioButton) findViewById(this.rg_mobile_tv.getCheckedRadioButtonId());
        if (!radioButton.getTag().toString().equals("Mobile")) {
            if (radioButton.getTag().toString().equals("TV")) {
                c6783a = this.f18143e;
                str = C5251a.f30065s0;
            }
            Toast.makeText(this, getResources().getString(2132018338), 0).show();
        }
        c6783a = this.f18143e;
        str = C5251a.f30067t0;
        c6783a.m31261T(str);
        Toast.makeText(this, getResources().getString(2132018338), 0).show();
    }

    /* renamed from: r0 */
    public final void m16303r0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: s0 */
    public void m16304s0() {
        runOnUiThread(new RunnableC2986b(this));
    }

    /* renamed from: t0 */
    public final void m16305t0() {
        Button button = this.btSaveChanges;
        if (button != null) {
            button.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2988d(this, button));
            this.btSaveChanges.requestFocus();
            this.btSaveChanges.requestFocusFromTouch();
        }
        Button button2 = this.btnBackPlayerselection;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2988d(this, button2));
        }
        RadioButton radioButton = this.rb_mobile;
        if (radioButton != null) {
            radioButton.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2988d(this, radioButton));
        }
        RadioButton radioButton2 = this.rb_tv;
        if (radioButton2 != null) {
            radioButton2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC2988d(this, radioButton2));
        }
    }

    /* renamed from: u0 */
    public final void m16306u0() {
        RadioButton radioButton;
        C6783a c6783a;
        String str;
        if (this.f18143e.m31288z().equals("")) {
            if ((this.f18142d.getResources().getConfiguration().screenLayout & 15) == 3) {
                c6783a = this.f18143e;
                str = C5251a.f30065s0;
            } else {
                c6783a = this.f18143e;
                str = C5251a.f30067t0;
            }
            c6783a.m31261T(str);
        }
        String m31288z = this.f18143e.m31288z();
        if (m31288z.equals(C5251a.f30067t0)) {
            radioButton = this.rb_mobile;
        } else if (!m31288z.equals(C5251a.f30065s0)) {
            return;
        } else {
            radioButton = this.rb_tv;
        }
        radioButton.setChecked(true);
    }
}

package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0243b;
import butterknife.BindView;
import nf.C6783a;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5251a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ScreenTypeActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ScreenTypeActivity.class */
public class ScreenTypeActivity extends ActivityC0243b implements View.OnClickListener {

    @BindView
    public TextView btn_save;

    /* renamed from: d */
    public Context f18137d;

    /* renamed from: e */
    public C6783a f18138e;

    @BindView
    public LinearLayout ll_yes_button_main_layout;

    @BindView
    public RadioButton rb_mobile;

    @BindView
    public RadioButton rb_tv;

    @BindView
    public RadioGroup rg_mobile_tv;

    @BindView
    public TextView tv_device_type_is;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ScreenTypeActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ScreenTypeActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ScreenTypeActivity$a.class */
    public class ViewOnFocusChangeListenerC2984a implements View.OnFocusChangeListener {

        /* renamed from: b */
        public final View f18139b;

        /* renamed from: c */
        public final ScreenTypeActivity f18140c;

        public ViewOnFocusChangeListenerC2984a(ScreenTypeActivity screenTypeActivity, View view) {
            this.f18140c = screenTypeActivity;
            this.f18139b = view;
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z10) {
            View view2;
            TextView textView;
            Resources resources;
            int i10;
            View view3;
            int i11;
            if (z10) {
                View view4 = this.f18139b;
                if (view4 == null || view4.getTag() == null || !this.f18139b.getTag().equals("1")) {
                    View view5 = this.f18139b;
                    if (view5 == null || view5.getTag() == null || !this.f18139b.getTag().equals("2")) {
                        View view6 = this.f18139b;
                        if (view6 == null || view6.getTag() == null || !this.f18139b.getTag().equals("3")) {
                            View view7 = this.f18139b;
                            if (view7 == null || view7.getTag() == null) {
                                return;
                            }
                            this.f18139b.setBackground(this.f18140c.getResources().getDrawable(2131231814));
                            return;
                        }
                        this.f18139b.setBackgroundResource(2131231557);
                        ScreenTypeActivity screenTypeActivity = this.f18140c;
                        textView = screenTypeActivity.btn_save;
                        resources = screenTypeActivity.f18137d.getResources();
                        i10 = 2131100158;
                    } else {
                        view3 = this.f18139b;
                        i11 = 2131231576;
                    }
                } else {
                    view3 = this.f18139b;
                    i11 = 2131230828;
                }
                view3.setBackgroundResource(i11);
                return;
            }
            if (z10) {
                return;
            }
            View view8 = this.f18139b;
            if ((view8 != null && view8.getTag() != null && this.f18139b.getTag().equals("1")) || ((view2 = this.f18139b) != null && view2.getTag() != null && this.f18139b.getTag().equals("2"))) {
                this.f18139b.setBackgroundResource(2131230845);
                return;
            }
            View view9 = this.f18139b;
            if (view9 == null || view9.getTag() == null || !this.f18139b.getTag().equals("3")) {
                return;
            }
            this.f18139b.setBackgroundResource(2131231558);
            ScreenTypeActivity screenTypeActivity2 = this.f18140c;
            textView = screenTypeActivity2.btn_save;
            resources = screenTypeActivity2.f18137d.getResources();
            i10 = 2131099723;
            textView.setTextColor(resources.getColor(i10));
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C6783a c6783a;
        String str;
        if (view.getId() != 2131428541) {
            return;
        }
        RadioButton radioButton = (RadioButton) findViewById(this.rg_mobile_tv.getCheckedRadioButtonId());
        if (!radioButton.getTag().toString().equals("Mobile")) {
            if (radioButton.getTag().toString().equals("TV")) {
                c6783a = this.f18138e;
                str = C5251a.f30065s0;
            }
            startActivity((!C5251a.f30036e.booleanValue() || C5251a.f30038f.booleanValue()) ? new Intent(this, (Class<?>) RoutingActivity.class) : new Intent(this, (Class<?>) LoginActivity.class));
            overridePendingTransition(2130772003, 2130772000);
            finish();
        }
        c6783a = this.f18138e;
        str = C5251a.f30067t0;
        c6783a.m31261T(str);
        startActivity((!C5251a.f30036e.booleanValue() || C5251a.f30038f.booleanValue()) ? new Intent(this, (Class<?>) RoutingActivity.class) : new Intent(this, (Class<?>) LoginActivity.class));
        overridePendingTransition(2130772003, 2130772000);
        finish();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(3:3|(1:5)(1:7)|6)|8|(1:10)(7:20|(1:22)|12|13|14|15|16)|11|12|13|14|15|16) */
    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.maxdigitall.maxdigitaliptvbox.view.activity.ScreenTypeActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        m16300r0();
    }

    /* renamed from: q0 */
    public final void m16299q0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: r0 */
    public void m16300r0() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception e10) {
        }
    }

    /* renamed from: s0 */
    public final void m16301s0() {
        this.rb_mobile.setOnClickListener(this);
        this.rb_tv.setOnClickListener(this);
        this.ll_yes_button_main_layout.setOnClickListener(this);
    }
}

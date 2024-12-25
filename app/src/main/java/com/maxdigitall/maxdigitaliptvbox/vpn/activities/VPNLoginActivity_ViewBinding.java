package com.maxdigitall.maxdigitaliptvbox.vpn.activities;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import butterknife.Unbinder;
import p316s2.AbstractViewOnClickListenerC8521b;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/VPNLoginActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/VPNLoginActivity_ViewBinding.class */
public class VPNLoginActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public VPNLoginActivity f25144b;

    /* renamed from: c */
    public View f25145c;

    /* renamed from: d */
    public View f25146d;

    /* renamed from: e */
    public View f25147e;

    /* renamed from: f */
    public View f25148f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/VPNLoginActivity_ViewBinding$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.vpn.activities.VPNLoginActivity_ViewBinding$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/VPNLoginActivity_ViewBinding$a.class */
    public class C4071a extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final VPNLoginActivity f25149d;

        /* renamed from: e */
        public final VPNLoginActivity_ViewBinding f25150e;

        public C4071a(VPNLoginActivity_ViewBinding vPNLoginActivity_ViewBinding, VPNLoginActivity vPNLoginActivity) {
            this.f25150e = vPNLoginActivity_ViewBinding;
            this.f25149d = vPNLoginActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f25149d.onclick(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/VPNLoginActivity_ViewBinding$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.vpn.activities.VPNLoginActivity_ViewBinding$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/VPNLoginActivity_ViewBinding$b.class */
    public class C4072b extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final VPNLoginActivity f25151d;

        /* renamed from: e */
        public final VPNLoginActivity_ViewBinding f25152e;

        public C4072b(VPNLoginActivity_ViewBinding vPNLoginActivity_ViewBinding, VPNLoginActivity vPNLoginActivity) {
            this.f25152e = vPNLoginActivity_ViewBinding;
            this.f25151d = vPNLoginActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f25151d.onclick(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/VPNLoginActivity_ViewBinding$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.vpn.activities.VPNLoginActivity_ViewBinding$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/VPNLoginActivity_ViewBinding$c.class */
    public class C4073c extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final VPNLoginActivity f25153d;

        /* renamed from: e */
        public final VPNLoginActivity_ViewBinding f25154e;

        public C4073c(VPNLoginActivity_ViewBinding vPNLoginActivity_ViewBinding, VPNLoginActivity vPNLoginActivity) {
            this.f25154e = vPNLoginActivity_ViewBinding;
            this.f25153d = vPNLoginActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f25153d.onclick(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/VPNLoginActivity_ViewBinding$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.vpn.activities.VPNLoginActivity_ViewBinding$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/VPNLoginActivity_ViewBinding$d.class */
    public class C4074d extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final VPNLoginActivity f25155d;

        /* renamed from: e */
        public final VPNLoginActivity_ViewBinding f25156e;

        public C4074d(VPNLoginActivity_ViewBinding vPNLoginActivity_ViewBinding, VPNLoginActivity vPNLoginActivity) {
            this.f25156e = vPNLoginActivity_ViewBinding;
            this.f25155d = vPNLoginActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f25155d.onclick(view);
        }
    }

    public VPNLoginActivity_ViewBinding(VPNLoginActivity vPNLoginActivity, View view) {
        this.f25144b = vPNLoginActivity;
        vPNLoginActivity.et_password = (EditText) C8522c.m36739c(view, 2131427916, "field 'et_password'", EditText.class);
        vPNLoginActivity.et_username = (EditText) C8522c.m36739c(view, 2131427931, "field 'et_username'", EditText.class);
        View m36738b = C8522c.m36738b(view, 2131427640, "field 'btn_connect' and method 'onclick'");
        vPNLoginActivity.btn_connect = (Button) C8522c.m36737a(m36738b, 2131427640, "field 'btn_connect'", Button.class);
        this.f25145c = m36738b;
        m36738b.setOnClickListener(new C4071a(this, vPNLoginActivity));
        View m36738b2 = C8522c.m36738b(view, 2131427632, "field 'btn_back' and method 'onclick'");
        vPNLoginActivity.btn_back = (Button) C8522c.m36737a(m36738b2, 2131427632, "field 'btn_back'", Button.class);
        this.f25146d = m36738b2;
        m36738b2.setOnClickListener(new C4072b(this, vPNLoginActivity));
        View m36738b3 = C8522c.m36738b(view, 2131427668, "field 'btn_save' and method 'onclick'");
        vPNLoginActivity.btn_save = (Button) C8522c.m36737a(m36738b3, 2131427668, "field 'btn_save'", Button.class);
        this.f25147e = m36738b3;
        m36738b3.setOnClickListener(new C4073c(this, vPNLoginActivity));
        vPNLoginActivity.iv_spinner_down = (ImageView) C8522c.m36739c(view, 2131428231, "field 'iv_spinner_down'", ImageView.class);
        vPNLoginActivity.username_p = (LinearLayout) C8522c.m36739c(view, 2131429661, "field 'username_p'", LinearLayout.class);
        vPNLoginActivity.password_p = (LinearLayout) C8522c.m36739c(view, 2131428819, "field 'password_p'", LinearLayout.class);
        vPNLoginActivity.spinner_server = (Spinner) C8522c.m36739c(view, 2131429209, "field 'spinner_server'", Spinner.class);
        View m36738b4 = C8522c.m36738b(view, 2131428421, "method 'onclick'");
        this.f25148f = m36738b4;
        m36738b4.setOnClickListener(new C4074d(this, vPNLoginActivity));
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        VPNLoginActivity vPNLoginActivity = this.f25144b;
        if (vPNLoginActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f25144b = null;
        vPNLoginActivity.et_password = null;
        vPNLoginActivity.et_username = null;
        vPNLoginActivity.btn_connect = null;
        vPNLoginActivity.btn_back = null;
        vPNLoginActivity.btn_save = null;
        vPNLoginActivity.iv_spinner_down = null;
        vPNLoginActivity.username_p = null;
        vPNLoginActivity.password_p = null;
        vPNLoginActivity.spinner_server = null;
        this.f25145c.setOnClickListener(null);
        this.f25145c = null;
        this.f25146d.setOnClickListener(null);
        this.f25146d = null;
        this.f25147e.setOnClickListener(null);
        this.f25147e = null;
        this.f25148f.setOnClickListener(null);
        this.f25148f = null;
    }
}

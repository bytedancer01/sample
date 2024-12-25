package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import p316s2.AbstractViewOnClickListenerC8521b;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity_ViewBinding.class */
public class LoginM3uActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public LoginM3uActivity f17680b;

    /* renamed from: c */
    public View f17681c;

    /* renamed from: d */
    public View f17682d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity_ViewBinding$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LoginM3uActivity_ViewBinding$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity_ViewBinding$a.class */
    public class C2845a extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final LoginM3uActivity f17683d;

        /* renamed from: e */
        public final LoginM3uActivity_ViewBinding f17684e;

        public C2845a(LoginM3uActivity_ViewBinding loginM3uActivity_ViewBinding, LoginM3uActivity loginM3uActivity) {
            this.f17684e = loginM3uActivity_ViewBinding;
            this.f17683d = loginM3uActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f17683d.onViewClicked(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity_ViewBinding$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.LoginM3uActivity_ViewBinding$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginM3uActivity_ViewBinding$b.class */
    public class C2846b extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final LoginM3uActivity f17685d;

        /* renamed from: e */
        public final LoginM3uActivity_ViewBinding f17686e;

        public C2846b(LoginM3uActivity_ViewBinding loginM3uActivity_ViewBinding, LoginM3uActivity loginM3uActivity) {
            this.f17686e = loginM3uActivity_ViewBinding;
            this.f17685d = loginM3uActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f17685d.onViewClicked(view);
        }
    }

    public LoginM3uActivity_ViewBinding(LoginM3uActivity loginM3uActivity, View view) {
        this.f17680b = loginM3uActivity;
        loginM3uActivity.etName = (EditText) C8522c.m36739c(view, 2131427915, "field 'etName'", EditText.class);
        loginM3uActivity.etM3uLine = (EditText) C8522c.m36739c(view, 2131427911, "field 'etM3uLine'", EditText.class);
        loginM3uActivity.etM3uLineFile = (EditText) C8522c.m36739c(view, 2131427912, "field 'etM3uLineFile'", EditText.class);
        View m36738b = C8522c.m36738b(view, 2131428947, "field 'rl_add_user' and method 'onViewClicked'");
        loginM3uActivity.rl_add_user = (RelativeLayout) C8522c.m36737a(m36738b, 2131428947, "field 'rl_add_user'", RelativeLayout.class);
        this.f17681c = m36738b;
        m36738b.setOnClickListener(new C2845a(this, loginM3uActivity));
        loginM3uActivity.iv_add_user = (ImageView) C8522c.m36739c(view, 2131428136, "field 'iv_add_user'", ImageView.class);
        loginM3uActivity.tv_add_user = (TextView) C8522c.m36739c(view, 2131429352, "field 'tv_add_user'", TextView.class);
        loginM3uActivity.rl_list_users = (RelativeLayout) C8522c.m36739c(view, 2131429009, "field 'rl_list_users'", RelativeLayout.class);
        loginM3uActivity.iv_list_users = (ImageView) C8522c.m36739c(view, 2131428190, "field 'iv_list_users'", ImageView.class);
        loginM3uActivity.tv_list_users = (TextView) C8522c.m36739c(view, 2131429494, "field 'tv_list_users'", TextView.class);
        View m36738b2 = C8522c.m36738b(view, 2131427599, "field 'bt_browse' and method 'onViewClicked'");
        loginM3uActivity.bt_browse = (Button) C8522c.m36737a(m36738b2, 2131427599, "field 'bt_browse'", Button.class);
        this.f17682d = m36738b2;
        m36738b2.setOnClickListener(new C2846b(this, loginM3uActivity));
        loginM3uActivity.rbFile = (RadioButton) C8522c.m36739c(view, 2131428901, "field 'rbFile'", RadioButton.class);
        loginM3uActivity.rbM3U = (RadioButton) C8522c.m36739c(view, 2131428904, "field 'rbM3U'", RadioButton.class);
        loginM3uActivity.tv_browse_error = (TextView) C8522c.m36739c(view, 2131429367, "field 'tv_browse_error'", TextView.class);
        loginM3uActivity.tv_file_path = (TextView) C8522c.m36739c(view, 2131429455, "field 'tv_file_path'", TextView.class);
        loginM3uActivity.vpn_button = (Button) C8522c.m36739c(view, 2131429691, "field 'vpn_button'", Button.class);
        loginM3uActivity.rl_playlist_name = (RelativeLayout) C8522c.m36739c(view, 2131429040, "field 'rl_playlist_name'", RelativeLayout.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        LoginM3uActivity loginM3uActivity = this.f17680b;
        if (loginM3uActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f17680b = null;
        loginM3uActivity.etName = null;
        loginM3uActivity.etM3uLine = null;
        loginM3uActivity.etM3uLineFile = null;
        loginM3uActivity.rl_add_user = null;
        loginM3uActivity.iv_add_user = null;
        loginM3uActivity.tv_add_user = null;
        loginM3uActivity.rl_list_users = null;
        loginM3uActivity.iv_list_users = null;
        loginM3uActivity.tv_list_users = null;
        loginM3uActivity.bt_browse = null;
        loginM3uActivity.rbFile = null;
        loginM3uActivity.rbM3U = null;
        loginM3uActivity.tv_browse_error = null;
        loginM3uActivity.tv_file_path = null;
        loginM3uActivity.vpn_button = null;
        loginM3uActivity.rl_playlist_name = null;
        this.f17681c.setOnClickListener(null);
        this.f17681c = null;
        this.f17682d.setOnClickListener(null);
        this.f17682d = null;
    }
}

package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/LoginActivity_ViewBinding.class */
public class LoginActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public LoginActivity f17614b;

    public LoginActivity_ViewBinding(LoginActivity loginActivity, View view) {
        this.f17614b = loginActivity;
        loginActivity.yourLogioTV = (ImageView) C8522c.m36739c(view, 2131428199, "field 'yourLogioTV'", ImageView.class);
        loginActivity.loginTV = (TextView) C8522c.m36739c(view, 2131429431, "field 'loginTV'", TextView.class);
        loginActivity.activityLogin = (LinearLayout) C8522c.m36739c(view, 2131427436, "field 'activityLogin'", LinearLayout.class);
        loginActivity.btn_free_trail = (Button) C8522c.m36739c(view, 2131427645, "field 'btn_free_trail'", Button.class);
        loginActivity.link_transform = (TextView) C8522c.m36739c(view, 2131428301, "field 'link_transform'", TextView.class);
        loginActivity.rl_name = (RelativeLayout) C8522c.m36739c(view, 2131429018, "field 'rl_name'", RelativeLayout.class);
        loginActivity.rl_email = (RelativeLayout) C8522c.m36739c(view, 2131428971, "field 'rl_email'", RelativeLayout.class);
        loginActivity.rl_password = (RelativeLayout) C8522c.m36739c(view, 2131429031, "field 'rl_password'", RelativeLayout.class);
        loginActivity.rl_server_url = (RelativeLayout) C8522c.m36739c(view, 2131429051, "field 'rl_server_url'", RelativeLayout.class);
        loginActivity.rl_bt_submit = (RelativeLayout) C8522c.m36739c(view, 2131428961, "field 'rl_bt_submit'", RelativeLayout.class);
        loginActivity.rl_bt_refresh = (Button) C8522c.m36739c(view, 2131428960, "field 'rl_bt_refresh'", Button.class);
        loginActivity.password_full = (LinearLayout) C8522c.m36739c(view, 2131428818, "field 'password_full'", LinearLayout.class);
        loginActivity.eyepass = (ImageView) C8522c.m36739c(view, 2131427994, "field 'eyepass'", ImageView.class);
        loginActivity.linearLayout = (LinearLayout) C8522c.m36739c(view, 2131428300, "field 'linearLayout'", LinearLayout.class);
        loginActivity.rl_list_users = (RelativeLayout) C8522c.m36739c(view, 2131429009, "field 'rl_list_users'", RelativeLayout.class);
        loginActivity.iv_connect_vpn = (ImageView) C8522c.m36739c(view, 2131428163, "field 'iv_connect_vpn'", ImageView.class);
        loginActivity.tv_vpn_con = (TextView) C8522c.m36739c(view, 2131429638, "field 'tv_vpn_con'", TextView.class);
        loginActivity.tv_add_user = (TextView) C8522c.m36739c(view, 2131429352, "field 'tv_add_user'", TextView.class);
        loginActivity.iv_list_users = (ImageView) C8522c.m36739c(view, 2131428190, "field 'iv_list_users'", ImageView.class);
        loginActivity.tv_list_users = (TextView) C8522c.m36739c(view, 2131429494, "field 'tv_list_users'", TextView.class);
        loginActivity.rl_connect_vpn = (RelativeLayout) C8522c.m36739c(view, 2131428968, "field 'rl_connect_vpn'", RelativeLayout.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        LoginActivity loginActivity = this.f17614b;
        if (loginActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f17614b = null;
        loginActivity.yourLogioTV = null;
        loginActivity.loginTV = null;
        loginActivity.activityLogin = null;
        loginActivity.btn_free_trail = null;
        loginActivity.link_transform = null;
        loginActivity.rl_name = null;
        loginActivity.rl_email = null;
        loginActivity.rl_password = null;
        loginActivity.rl_server_url = null;
        loginActivity.rl_bt_submit = null;
        loginActivity.rl_bt_refresh = null;
        loginActivity.password_full = null;
        loginActivity.eyepass = null;
        loginActivity.linearLayout = null;
        loginActivity.rl_list_users = null;
        loginActivity.iv_connect_vpn = null;
        loginActivity.tv_vpn_con = null;
        loginActivity.tv_add_user = null;
        loginActivity.iv_list_users = null;
        loginActivity.tv_list_users = null;
        loginActivity.rl_connect_vpn = null;
    }
}

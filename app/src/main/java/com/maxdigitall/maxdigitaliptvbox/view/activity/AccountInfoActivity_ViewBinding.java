package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AccountInfoActivity_ViewBinding.class */
public class AccountInfoActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public AccountInfoActivity f16839b;

    public AccountInfoActivity_ViewBinding(AccountInfoActivity accountInfoActivity, View view) {
        this.f16839b = accountInfoActivity;
        accountInfoActivity.toolbar = (Toolbar) C8522c.m36739c(view, 2131429320, "field 'toolbar'", Toolbar.class);
        accountInfoActivity.appbarToolbar = (AppBarLayout) C8522c.m36739c(view, 2131427548, "field 'appbarToolbar'", AppBarLayout.class);
        accountInfoActivity.tvExpiryDate = (TextView) C8522c.m36739c(view, 2131429453, "field 'tvExpiryDate'", TextView.class);
        accountInfoActivity.tvIsTrial = (TextView) C8522c.m36739c(view, 2131429481, "field 'tvIsTrial'", TextView.class);
        accountInfoActivity.tvActiveConn = (TextView) C8522c.m36739c(view, 2131429345, "field 'tvActiveConn'", TextView.class);
        accountInfoActivity.tvCreatedAt = (TextView) C8522c.m36739c(view, 2131429393, "field 'tvCreatedAt'", TextView.class);
        accountInfoActivity.tvMaxConnections = (TextView) C8522c.m36739c(view, 2131429504, "field 'tvMaxConnections'", TextView.class);
        accountInfoActivity.tvUsername = (TextView) C8522c.m36739c(view, 2131429634, "field 'tvUsername'", TextView.class);
        accountInfoActivity.tvStatus = (TextView) C8522c.m36739c(view, 2131429616, "field 'tvStatus'", TextView.class);
        accountInfoActivity.btnBackAccountInfo = (Button) C8522c.m36739c(view, 2131427633, "field 'btnBackAccountInfo'", Button.class);
        accountInfoActivity.Logout = (Button) C8522c.m36739c(view, 2131428556, "field 'Logout'", Button.class);
        accountInfoActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
        accountInfoActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        accountInfoActivity.btn_buy_now = (Button) C8522c.m36739c(view, 2131427635, "field 'btn_buy_now'", Button.class);
        accountInfoActivity.tv_username_label = (TextView) C8522c.m36739c(view, 2131429635, "field 'tv_username_label'", TextView.class);
        accountInfoActivity.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
        accountInfoActivity.iv_back_button = (ImageView) C8522c.m36739c(view, 2131428145, "field 'iv_back_button'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        AccountInfoActivity accountInfoActivity = this.f16839b;
        if (accountInfoActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f16839b = null;
        accountInfoActivity.toolbar = null;
        accountInfoActivity.appbarToolbar = null;
        accountInfoActivity.tvExpiryDate = null;
        accountInfoActivity.tvIsTrial = null;
        accountInfoActivity.tvActiveConn = null;
        accountInfoActivity.tvCreatedAt = null;
        accountInfoActivity.tvMaxConnections = null;
        accountInfoActivity.tvUsername = null;
        accountInfoActivity.tvStatus = null;
        accountInfoActivity.btnBackAccountInfo = null;
        accountInfoActivity.Logout = null;
        accountInfoActivity.date = null;
        accountInfoActivity.time = null;
        accountInfoActivity.btn_buy_now = null;
        accountInfoActivity.tv_username_label = null;
        accountInfoActivity.logo = null;
        accountInfoActivity.iv_back_button = null;
    }
}

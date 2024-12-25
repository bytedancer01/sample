package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities;

import android.view.View;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/FreeTrailActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/FreeTrailActivity_ViewBinding.class */
public class FreeTrailActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public FreeTrailActivity f15995b;

    public FreeTrailActivity_ViewBinding(FreeTrailActivity freeTrailActivity, View view) {
        this.f15995b = freeTrailActivity;
        freeTrailActivity.rl_email = (RelativeLayout) C8522c.m36739c(view, 2131428971, "field 'rl_email'", RelativeLayout.class);
        freeTrailActivity.rl_username = (RelativeLayout) C8522c.m36739c(view, 2131429069, "field 'rl_username'", RelativeLayout.class);
        freeTrailActivity.rl_password = (RelativeLayout) C8522c.m36739c(view, 2131429031, "field 'rl_password'", RelativeLayout.class);
        freeTrailActivity.rl_bt_submit = (RelativeLayout) C8522c.m36739c(view, 2131428961, "field 'rl_bt_submit'", RelativeLayout.class);
        freeTrailActivity.rl_confirmpassword = (RelativeLayout) C8522c.m36739c(view, 2131428967, "field 'rl_confirmpassword'", RelativeLayout.class);
        freeTrailActivity.rl_already_register = (RelativeLayout) C8522c.m36739c(view, 2131428949, "field 'rl_already_register'", RelativeLayout.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        FreeTrailActivity freeTrailActivity = this.f15995b;
        if (freeTrailActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f15995b = null;
        freeTrailActivity.rl_email = null;
        freeTrailActivity.rl_username = null;
        freeTrailActivity.rl_password = null;
        freeTrailActivity.rl_bt_submit = null;
        freeTrailActivity.rl_confirmpassword = null;
        freeTrailActivity.rl_already_register = null;
    }
}

package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ScreenTypeActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ScreenTypeActivity_ViewBinding.class */
public class ScreenTypeActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public ScreenTypeActivity f18141b;

    public ScreenTypeActivity_ViewBinding(ScreenTypeActivity screenTypeActivity, View view) {
        this.f18141b = screenTypeActivity;
        screenTypeActivity.rg_mobile_tv = (RadioGroup) C8522c.m36739c(view, 2131428934, "field 'rg_mobile_tv'", RadioGroup.class);
        screenTypeActivity.rb_mobile = (RadioButton) C8522c.m36739c(view, 2131428906, "field 'rb_mobile'", RadioButton.class);
        screenTypeActivity.rb_tv = (RadioButton) C8522c.m36739c(view, 2131428913, "field 'rb_tv'", RadioButton.class);
        screenTypeActivity.btn_save = (TextView) C8522c.m36739c(view, 2131427668, "field 'btn_save'", TextView.class);
        screenTypeActivity.tv_device_type_is = (TextView) C8522c.m36739c(view, 2131429418, "field 'tv_device_type_is'", TextView.class);
        screenTypeActivity.ll_yes_button_main_layout = (LinearLayout) C8522c.m36739c(view, 2131428541, "field 'll_yes_button_main_layout'", LinearLayout.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        ScreenTypeActivity screenTypeActivity = this.f18141b;
        if (screenTypeActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f18141b = null;
        screenTypeActivity.rg_mobile_tv = null;
        screenTypeActivity.rb_mobile = null;
        screenTypeActivity.rb_tv = null;
        screenTypeActivity.btn_save = null;
        screenTypeActivity.tv_device_type_is = null;
        screenTypeActivity.ll_yes_button_main_layout = null;
    }
}

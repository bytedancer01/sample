package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import butterknife.Unbinder;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiSettingActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiSettingActivity_ViewBinding.class */
public class MultiSettingActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public MultiSettingActivity f17713b;

    public MultiSettingActivity_ViewBinding(MultiSettingActivity multiSettingActivity, View view) {
        this.f17713b = multiSettingActivity;
        multiSettingActivity.btn_multi = (Button) C8522c.m36739c(view, 2131427652, "field 'btn_multi'", Button.class);
        multiSettingActivity.save = (Button) C8522c.m36739c(view, 2131429094, "field 'save'", Button.class);
        multiSettingActivity.back = (Button) C8522c.m36739c(view, 2131427562, "field 'back'", Button.class);
        multiSettingActivity.showPopup = (CheckBox) C8522c.m36739c(view, 2131429163, "field 'showPopup'", CheckBox.class);
        multiSettingActivity.screen_pic = (ImageView) C8522c.m36739c(view, 2131429111, "field 'screen_pic'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        MultiSettingActivity multiSettingActivity = this.f17713b;
        if (multiSettingActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f17713b = null;
        multiSettingActivity.btn_multi = null;
        multiSettingActivity.save = null;
        multiSettingActivity.back = null;
        multiSettingActivity.showPopup = null;
        multiSettingActivity.screen_pic = null;
    }
}

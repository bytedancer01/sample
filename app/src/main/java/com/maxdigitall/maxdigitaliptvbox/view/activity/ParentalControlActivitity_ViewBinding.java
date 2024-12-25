package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ParentalControlActivitity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ParentalControlActivitity_ViewBinding.class */
public class ParentalControlActivitity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public ParentalControlActivitity f17921b;

    public ParentalControlActivitity_ViewBinding(ParentalControlActivitity parentalControlActivitity, View view) {
        this.f17921b = parentalControlActivitity;
        parentalControlActivitity.toolbar = (Toolbar) C8522c.m36739c(view, 2131429320, "field 'toolbar'", Toolbar.class);
        parentalControlActivitity.tvHeaderTitle = (ImageView) C8522c.m36739c(view, 2131429468, "field 'tvHeaderTitle'", ImageView.class);
        parentalControlActivitity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
        parentalControlActivitity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        parentalControlActivitity.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        ParentalControlActivitity parentalControlActivitity = this.f17921b;
        if (parentalControlActivitity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f17921b = null;
        parentalControlActivitity.toolbar = null;
        parentalControlActivitity.tvHeaderTitle = null;
        parentalControlActivitity.date = null;
        parentalControlActivitity.time = null;
        parentalControlActivitity.logo = null;
    }
}

package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AnnouncementAlertActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AnnouncementAlertActivity_ViewBinding.class */
public class AnnouncementAlertActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public AnnouncementAlertActivity f16867b;

    public AnnouncementAlertActivity_ViewBinding(AnnouncementAlertActivity announcementAlertActivity, View view) {
        this.f16867b = announcementAlertActivity;
        announcementAlertActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
        announcementAlertActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        announcementAlertActivity.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        AnnouncementAlertActivity announcementAlertActivity = this.f16867b;
        if (announcementAlertActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f16867b = null;
        announcementAlertActivity.date = null;
        announcementAlertActivity.time = null;
        announcementAlertActivity.logo = null;
    }
}

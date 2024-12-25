package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AnnouncementsActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AnnouncementsActivity_ViewBinding.class */
public class AnnouncementsActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public AnnouncementsActivity f16878b;

    public AnnouncementsActivity_ViewBinding(AnnouncementsActivity announcementsActivity, View view) {
        this.f16878b = announcementsActivity;
        announcementsActivity.recyclerView = (RecyclerView) C8522c.m36739c(view, 2131428747, "field 'recyclerView'", RecyclerView.class);
        announcementsActivity.pbLoader = (ProgressBar) C8522c.m36739c(view, 2131428840, "field 'pbLoader'", ProgressBar.class);
        announcementsActivity.noRecord = (TextView) C8522c.m36739c(view, 2131428784, "field 'noRecord'", TextView.class);
        announcementsActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
        announcementsActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        announcementsActivity.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        AnnouncementsActivity announcementsActivity = this.f16878b;
        if (announcementsActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f16878b = null;
        announcementsActivity.recyclerView = null;
        announcementsActivity.pbLoader = null;
        announcementsActivity.noRecord = null;
        announcementsActivity.date = null;
        announcementsActivity.time = null;
        announcementsActivity.logo = null;
    }
}

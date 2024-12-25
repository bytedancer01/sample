package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.github.ybq.android.spinkit.SpinKitView;
import p204lg.C5876c;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/CancelledSerivceActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/CancelledSerivceActivity_ViewBinding.class */
public class CancelledSerivceActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public CancelledSerivceActivity f15946b;

    public CancelledSerivceActivity_ViewBinding(CancelledSerivceActivity cancelledSerivceActivity, View view) {
        this.f15946b = cancelledSerivceActivity;
        cancelledSerivceActivity.recyclerView = (RecyclerView) C8522c.m36739c(view, 2131428920, "field 'recyclerView'", RecyclerView.class);
        cancelledSerivceActivity.tv_no_active_services = (TextView) C8522c.m36739c(view, 2131429536, "field 'tv_no_active_services'", TextView.class);
        cancelledSerivceActivity.progress = (SpinKitView) C8522c.m36739c(view, C5876c.f32946j, "field 'progress'", SpinKitView.class);
        cancelledSerivceActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
        cancelledSerivceActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        cancelledSerivceActivity.tv_title = (TextView) C8522c.m36739c(view, 2131429631, "field 'tv_title'", TextView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        CancelledSerivceActivity cancelledSerivceActivity = this.f15946b;
        if (cancelledSerivceActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f15946b = null;
        cancelledSerivceActivity.recyclerView = null;
        cancelledSerivceActivity.tv_no_active_services = null;
        cancelledSerivceActivity.progress = null;
        cancelledSerivceActivity.date = null;
        cancelledSerivceActivity.time = null;
        cancelledSerivceActivity.tv_title = null;
    }
}

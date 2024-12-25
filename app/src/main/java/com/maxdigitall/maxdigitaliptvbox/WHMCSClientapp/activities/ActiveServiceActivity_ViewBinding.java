package com.maxdigitall.maxdigitaliptvbox.WHMCSClientapp.activities;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.github.ybq.android.spinkit.SpinKitView;
import p204lg.C5876c;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/ActiveServiceActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/WHMCSClientapp/activities/ActiveServiceActivity_ViewBinding.class */
public class ActiveServiceActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public ActiveServiceActivity f15926b;

    public ActiveServiceActivity_ViewBinding(ActiveServiceActivity activeServiceActivity, View view) {
        this.f15926b = activeServiceActivity;
        activeServiceActivity.recyclerView = (RecyclerView) C8522c.m36739c(view, 2131428920, "field 'recyclerView'", RecyclerView.class);
        activeServiceActivity.tv_no_active_services = (TextView) C8522c.m36739c(view, 2131429536, "field 'tv_no_active_services'", TextView.class);
        activeServiceActivity.progress = (SpinKitView) C8522c.m36739c(view, C5876c.f32946j, "field 'progress'", SpinKitView.class);
        activeServiceActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
        activeServiceActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        activeServiceActivity.tv_title = (TextView) C8522c.m36739c(view, 2131429631, "field 'tv_title'", TextView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        ActiveServiceActivity activeServiceActivity = this.f15926b;
        if (activeServiceActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f15926b = null;
        activeServiceActivity.recyclerView = null;
        activeServiceActivity.tv_no_active_services = null;
        activeServiceActivity.progress = null;
        activeServiceActivity.date = null;
        activeServiceActivity.time = null;
        activeServiceActivity.tv_title = null;
    }
}

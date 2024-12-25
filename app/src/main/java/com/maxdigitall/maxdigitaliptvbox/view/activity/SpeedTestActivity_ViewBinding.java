package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/SpeedTestActivity_ViewBinding.class */
public class SpeedTestActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public SpeedTestActivity f18852b;

    public SpeedTestActivity_ViewBinding(SpeedTestActivity speedTestActivity, View view) {
        this.f18852b = speedTestActivity;
        speedTestActivity.test_button = (Button) C8522c.m36739c(view, 2131429273, "field 'test_button'", Button.class);
        speedTestActivity.ping_text = (TextView) C8522c.m36739c(view, 2131428849, "field 'ping_text'", TextView.class);
        speedTestActivity.down_text = (TextView) C8522c.m36739c(view, 2131427864, "field 'down_text'", TextView.class);
        speedTestActivity.upl_text = (TextView) C8522c.m36739c(view, 2131429656, "field 'upl_text'", TextView.class);
        speedTestActivity.bar_speed = (ImageView) C8522c.m36739c(view, 2131427572, "field 'bar_speed'", ImageView.class);
        speedTestActivity.graph_chart = (LinearLayout) C8522c.m36739c(view, 2131428064, "field 'graph_chart'", LinearLayout.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        SpeedTestActivity speedTestActivity = this.f18852b;
        if (speedTestActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f18852b = null;
        speedTestActivity.test_button = null;
        speedTestActivity.ping_text = null;
        speedTestActivity.down_text = null;
        speedTestActivity.upl_text = null;
        speedTestActivity.bar_speed = null;
        speedTestActivity.graph_chart = null;
    }
}

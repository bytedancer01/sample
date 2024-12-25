package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ExternalPlayerActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ExternalPlayerActivity_ViewBinding.class */
public class ExternalPlayerActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public ExternalPlayerActivity f17204b;

    public ExternalPlayerActivity_ViewBinding(ExternalPlayerActivity externalPlayerActivity, View view) {
        this.f17204b = externalPlayerActivity;
        externalPlayerActivity.ll_progressbar = (LinearLayout) C8522c.m36739c(view, 2131428480, "field 'll_progressbar'", LinearLayout.class);
        externalPlayerActivity.ll_no_data_found = (LinearLayout) C8522c.m36739c(view, 2131428451, "field 'll_no_data_found'", LinearLayout.class);
        externalPlayerActivity.recyclerView = (RecyclerView) C8522c.m36739c(view, 2131428920, "field 'recyclerView'", RecyclerView.class);
        externalPlayerActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
        externalPlayerActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        externalPlayerActivity.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        ExternalPlayerActivity externalPlayerActivity = this.f17204b;
        if (externalPlayerActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f17204b = null;
        externalPlayerActivity.ll_progressbar = null;
        externalPlayerActivity.ll_no_data_found = null;
        externalPlayerActivity.recyclerView = null;
        externalPlayerActivity.date = null;
        externalPlayerActivity.time = null;
        externalPlayerActivity.logo = null;
    }
}

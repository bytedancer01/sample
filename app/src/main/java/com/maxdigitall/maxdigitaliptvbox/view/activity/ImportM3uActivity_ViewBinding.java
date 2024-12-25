package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.maxdigitall.maxdigitaliptvbox.view.utility.LoadingGearSpinner;
import p216m9.C5974n;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ImportM3uActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ImportM3uActivity_ViewBinding.class */
public class ImportM3uActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public ImportM3uActivity f17405b;

    public ImportM3uActivity_ViewBinding(ImportM3uActivity importM3uActivity, View view) {
        this.f17405b = importM3uActivity;
        importM3uActivity.tvSettingStreams = (TextView) C8522c.m36739c(view, 2131429606, "field 'tvSettingStreams'", TextView.class);
        importM3uActivity.tvImportingStreams = (TextView) C8522c.m36739c(view, 2131429471, "field 'tvImportingStreams'", TextView.class);
        importM3uActivity.progressBar = (ProgressBar) C8522c.m36739c(view, C5974n.f33499T, "field 'progressBar'", ProgressBar.class);
        importM3uActivity.tvPercentage = (TextView) C8522c.m36739c(view, 2131429554, "field 'tvPercentage'", TextView.class);
        importM3uActivity.tvCountings = (TextView) C8522c.m36739c(view, 2131429392, "field 'tvCountings'", TextView.class);
        importM3uActivity.rlImportProcess = (LinearLayout) C8522c.m36739c(view, 2131428994, "field 'rlImportProcess'", LinearLayout.class);
        importM3uActivity.rlImportLayout = (RelativeLayout) C8522c.m36739c(view, 2131428993, "field 'rlImportLayout'", RelativeLayout.class);
        importM3uActivity.ivGearLoader = (LoadingGearSpinner) C8522c.m36739c(view, 2131428182, "field 'ivGearLoader'", LoadingGearSpinner.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        ImportM3uActivity importM3uActivity = this.f17405b;
        if (importM3uActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f17405b = null;
        importM3uActivity.tvSettingStreams = null;
        importM3uActivity.tvImportingStreams = null;
        importM3uActivity.progressBar = null;
        importM3uActivity.tvPercentage = null;
        importM3uActivity.tvCountings = null;
        importM3uActivity.rlImportProcess = null;
        importM3uActivity.rlImportLayout = null;
        importM3uActivity.ivGearLoader = null;
    }
}

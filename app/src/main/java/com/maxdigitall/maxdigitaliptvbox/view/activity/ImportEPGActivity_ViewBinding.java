package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.maxdigitall.maxdigitaliptvbox.view.utility.LoadingGearSpinner;
import p216m9.C5974n;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ImportEPGActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ImportEPGActivity_ViewBinding.class */
public class ImportEPGActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public ImportEPGActivity f17396b;

    public ImportEPGActivity_ViewBinding(ImportEPGActivity importEPGActivity, View view) {
        this.f17396b = importEPGActivity;
        importEPGActivity.tvSettingStreams = (TextView) C8522c.m36739c(view, 2131429606, "field 'tvSettingStreams'", TextView.class);
        importEPGActivity.tvImportingEpg = (TextView) C8522c.m36739c(view, 2131429470, "field 'tvImportingEpg'", TextView.class);
        importEPGActivity.progressBar = (ProgressBar) C8522c.m36739c(view, C5974n.f33499T, "field 'progressBar'", ProgressBar.class);
        importEPGActivity.tvPercentage = (TextView) C8522c.m36739c(view, 2131429554, "field 'tvPercentage'", TextView.class);
        importEPGActivity.tvCountings = (TextView) C8522c.m36739c(view, 2131429392, "field 'tvCountings'", TextView.class);
        importEPGActivity.rlImportProcess = (RelativeLayout) C8522c.m36739c(view, 2131428994, "field 'rlImportProcess'", RelativeLayout.class);
        importEPGActivity.rlImportLayout = (RelativeLayout) C8522c.m36739c(view, 2131428993, "field 'rlImportLayout'", RelativeLayout.class);
        importEPGActivity.ivGearLoader = (LoadingGearSpinner) C8522c.m36739c(view, 2131428182, "field 'ivGearLoader'", LoadingGearSpinner.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        ImportEPGActivity importEPGActivity = this.f17396b;
        if (importEPGActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f17396b = null;
        importEPGActivity.tvSettingStreams = null;
        importEPGActivity.tvImportingEpg = null;
        importEPGActivity.progressBar = null;
        importEPGActivity.tvPercentage = null;
        importEPGActivity.tvCountings = null;
        importEPGActivity.rlImportProcess = null;
        importEPGActivity.rlImportLayout = null;
        importEPGActivity.ivGearLoader = null;
    }
}

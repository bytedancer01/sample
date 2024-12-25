package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import p316s2.AbstractViewOnClickListenerC8521b;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AutomationActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AutomationActivity_ViewBinding.class */
public class AutomationActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public AutomationActivity f16938b;

    /* renamed from: c */
    public View f16939c;

    /* renamed from: d */
    public View f16940d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AutomationActivity_ViewBinding$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AutomationActivity_ViewBinding$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AutomationActivity_ViewBinding$a.class */
    public class C2703a extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final AutomationActivity f16941d;

        /* renamed from: e */
        public final AutomationActivity_ViewBinding f16942e;

        public C2703a(AutomationActivity_ViewBinding automationActivity_ViewBinding, AutomationActivity automationActivity) {
            this.f16942e = automationActivity_ViewBinding;
            this.f16941d = automationActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f16941d.onViewClicked(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AutomationActivity_ViewBinding$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AutomationActivity_ViewBinding$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AutomationActivity_ViewBinding$b.class */
    public class C2704b extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final AutomationActivity f16943d;

        /* renamed from: e */
        public final AutomationActivity_ViewBinding f16944e;

        public C2704b(AutomationActivity_ViewBinding automationActivity_ViewBinding, AutomationActivity automationActivity) {
            this.f16944e = automationActivity_ViewBinding;
            this.f16943d = automationActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f16943d.onViewClicked(view);
        }
    }

    public AutomationActivity_ViewBinding(AutomationActivity automationActivity, View view) {
        this.f16938b = automationActivity;
        automationActivity.toolbar = (Toolbar) C8522c.m36739c(view, 2131429320, "field 'toolbar'", Toolbar.class);
        automationActivity.appbarToolbar = (AppBarLayout) C8522c.m36739c(view, 2131427548, "field 'appbarToolbar'", AppBarLayout.class);
        View m36738b = C8522c.m36738b(view, 2131427620, "field 'btSaveChanges' and method 'onViewClicked'");
        automationActivity.btSaveChanges = (Button) C8522c.m36737a(m36738b, 2131427620, "field 'btSaveChanges'", Button.class);
        this.f16939c = m36738b;
        m36738b.setOnClickListener(new C2703a(this, automationActivity));
        View m36738b2 = C8522c.m36738b(view, 2131427634, "field 'btnBackPlayerselection' and method 'onViewClicked'");
        automationActivity.btnBackPlayerselection = (Button) C8522c.m36737a(m36738b2, 2131427634, "field 'btnBackPlayerselection'", Button.class);
        this.f16940d = m36738b2;
        m36738b2.setOnClickListener(new C2704b(this, automationActivity));
        automationActivity.cbAutomationLiveVod = (CheckBox) C8522c.m36739c(view, 2131427733, "field 'cbAutomationLiveVod'", CheckBox.class);
        automationActivity.cbAutomationEPG = (CheckBox) C8522c.m36739c(view, 2131427732, "field 'cbAutomationEPG'", CheckBox.class);
        automationActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
        automationActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        automationActivity.tv_auto_update_days = (TextView) C8522c.m36739c(view, 2131429360, "field 'tv_auto_update_days'", TextView.class);
        automationActivity.fl_auto_update_days = (FrameLayout) C8522c.m36739c(view, 2131428022, "field 'fl_auto_update_days'", FrameLayout.class);
        automationActivity.tv_auto_update_epg_days = (TextView) C8522c.m36739c(view, 2131429361, "field 'tv_auto_update_epg_days'", TextView.class);
        automationActivity.fl_auto_update_epg_days = (FrameLayout) C8522c.m36739c(view, 2131428023, "field 'fl_auto_update_epg_days'", FrameLayout.class);
        automationActivity.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        AutomationActivity automationActivity = this.f16938b;
        if (automationActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f16938b = null;
        automationActivity.toolbar = null;
        automationActivity.appbarToolbar = null;
        automationActivity.btSaveChanges = null;
        automationActivity.btnBackPlayerselection = null;
        automationActivity.cbAutomationLiveVod = null;
        automationActivity.cbAutomationEPG = null;
        automationActivity.date = null;
        automationActivity.time = null;
        automationActivity.tv_auto_update_days = null;
        automationActivity.fl_auto_update_days = null;
        automationActivity.tv_auto_update_epg_days = null;
        automationActivity.fl_auto_update_epg_days = null;
        automationActivity.logo = null;
        this.f16939c.setOnClickListener(null);
        this.f16939c = null;
        this.f16940d.setOnClickListener(null);
        this.f16940d = null;
    }
}

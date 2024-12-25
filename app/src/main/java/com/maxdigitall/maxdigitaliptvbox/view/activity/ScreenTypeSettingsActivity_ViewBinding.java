package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import p316s2.AbstractViewOnClickListenerC8521b;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ScreenTypeSettingsActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ScreenTypeSettingsActivity_ViewBinding.class */
public class ScreenTypeSettingsActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public ScreenTypeSettingsActivity f18150b;

    /* renamed from: c */
    public View f18151c;

    /* renamed from: d */
    public View f18152d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ScreenTypeSettingsActivity_ViewBinding$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ScreenTypeSettingsActivity_ViewBinding$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ScreenTypeSettingsActivity_ViewBinding$a.class */
    public class C2989a extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final ScreenTypeSettingsActivity f18153d;

        /* renamed from: e */
        public final ScreenTypeSettingsActivity_ViewBinding f18154e;

        public C2989a(ScreenTypeSettingsActivity_ViewBinding screenTypeSettingsActivity_ViewBinding, ScreenTypeSettingsActivity screenTypeSettingsActivity) {
            this.f18154e = screenTypeSettingsActivity_ViewBinding;
            this.f18153d = screenTypeSettingsActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f18153d.onViewClicked(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ScreenTypeSettingsActivity_ViewBinding$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.ScreenTypeSettingsActivity_ViewBinding$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/ScreenTypeSettingsActivity_ViewBinding$b.class */
    public class C2990b extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final ScreenTypeSettingsActivity f18155d;

        /* renamed from: e */
        public final ScreenTypeSettingsActivity_ViewBinding f18156e;

        public C2990b(ScreenTypeSettingsActivity_ViewBinding screenTypeSettingsActivity_ViewBinding, ScreenTypeSettingsActivity screenTypeSettingsActivity) {
            this.f18156e = screenTypeSettingsActivity_ViewBinding;
            this.f18155d = screenTypeSettingsActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f18155d.onViewClicked(view);
        }
    }

    public ScreenTypeSettingsActivity_ViewBinding(ScreenTypeSettingsActivity screenTypeSettingsActivity, View view) {
        this.f18150b = screenTypeSettingsActivity;
        screenTypeSettingsActivity.toolbar = (Toolbar) C8522c.m36739c(view, 2131429320, "field 'toolbar'", Toolbar.class);
        screenTypeSettingsActivity.appbarToolbar = (AppBarLayout) C8522c.m36739c(view, 2131427548, "field 'appbarToolbar'", AppBarLayout.class);
        View m36738b = C8522c.m36738b(view, 2131427620, "field 'btSaveChanges' and method 'onViewClicked'");
        screenTypeSettingsActivity.btSaveChanges = (Button) C8522c.m36737a(m36738b, 2131427620, "field 'btSaveChanges'", Button.class);
        this.f18151c = m36738b;
        m36738b.setOnClickListener(new C2989a(this, screenTypeSettingsActivity));
        View m36738b2 = C8522c.m36738b(view, 2131427634, "field 'btnBackPlayerselection' and method 'onViewClicked'");
        screenTypeSettingsActivity.btnBackPlayerselection = (Button) C8522c.m36737a(m36738b2, 2131427634, "field 'btnBackPlayerselection'", Button.class);
        this.f18152d = m36738b2;
        m36738b2.setOnClickListener(new C2990b(this, screenTypeSettingsActivity));
        screenTypeSettingsActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
        screenTypeSettingsActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        screenTypeSettingsActivity.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
        screenTypeSettingsActivity.rg_mobile_tv = (RadioGroup) C8522c.m36739c(view, 2131428934, "field 'rg_mobile_tv'", RadioGroup.class);
        screenTypeSettingsActivity.rb_mobile = (RadioButton) C8522c.m36739c(view, 2131428906, "field 'rb_mobile'", RadioButton.class);
        screenTypeSettingsActivity.rb_tv = (RadioButton) C8522c.m36739c(view, 2131428913, "field 'rb_tv'", RadioButton.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        ScreenTypeSettingsActivity screenTypeSettingsActivity = this.f18150b;
        if (screenTypeSettingsActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f18150b = null;
        screenTypeSettingsActivity.toolbar = null;
        screenTypeSettingsActivity.appbarToolbar = null;
        screenTypeSettingsActivity.btSaveChanges = null;
        screenTypeSettingsActivity.btnBackPlayerselection = null;
        screenTypeSettingsActivity.date = null;
        screenTypeSettingsActivity.time = null;
        screenTypeSettingsActivity.logo = null;
        screenTypeSettingsActivity.rg_mobile_tv = null;
        screenTypeSettingsActivity.rb_mobile = null;
        screenTypeSettingsActivity.rb_tv = null;
        this.f18151c.setOnClickListener(null);
        this.f18151c = null;
        this.f18152d.setOnClickListener(null);
        this.f18152d = null;
    }
}

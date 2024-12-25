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
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TimeFormatActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TimeFormatActivity_ViewBinding.class */
public class TimeFormatActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public TimeFormatActivity f19103b;

    /* renamed from: c */
    public View f19104c;

    /* renamed from: d */
    public View f19105d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TimeFormatActivity_ViewBinding$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TimeFormatActivity_ViewBinding$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TimeFormatActivity_ViewBinding$a.class */
    public class C3230a extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final TimeFormatActivity f19106d;

        /* renamed from: e */
        public final TimeFormatActivity_ViewBinding f19107e;

        public C3230a(TimeFormatActivity_ViewBinding timeFormatActivity_ViewBinding, TimeFormatActivity timeFormatActivity) {
            this.f19107e = timeFormatActivity_ViewBinding;
            this.f19106d = timeFormatActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f19106d.onViewClicked(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TimeFormatActivity_ViewBinding$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.TimeFormatActivity_ViewBinding$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/TimeFormatActivity_ViewBinding$b.class */
    public class C3231b extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final TimeFormatActivity f19108d;

        /* renamed from: e */
        public final TimeFormatActivity_ViewBinding f19109e;

        public C3231b(TimeFormatActivity_ViewBinding timeFormatActivity_ViewBinding, TimeFormatActivity timeFormatActivity) {
            this.f19109e = timeFormatActivity_ViewBinding;
            this.f19108d = timeFormatActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f19108d.onViewClicked(view);
        }
    }

    public TimeFormatActivity_ViewBinding(TimeFormatActivity timeFormatActivity, View view) {
        this.f19103b = timeFormatActivity;
        timeFormatActivity.toolbar = (Toolbar) C8522c.m36739c(view, 2131429320, "field 'toolbar'", Toolbar.class);
        timeFormatActivity.appbarToolbar = (AppBarLayout) C8522c.m36739c(view, 2131427548, "field 'appbarToolbar'", AppBarLayout.class);
        View m36738b = C8522c.m36738b(view, 2131427620, "field 'btSaveChanges' and method 'onViewClicked'");
        timeFormatActivity.btSaveChanges = (Button) C8522c.m36737a(m36738b, 2131427620, "field 'btSaveChanges'", Button.class);
        this.f19104c = m36738b;
        m36738b.setOnClickListener(new C3230a(this, timeFormatActivity));
        View m36738b2 = C8522c.m36738b(view, 2131427634, "field 'btnBackPlayerselection' and method 'onViewClicked'");
        timeFormatActivity.btnBackPlayerselection = (Button) C8522c.m36737a(m36738b2, 2131427634, "field 'btnBackPlayerselection'", Button.class);
        this.f19105d = m36738b2;
        m36738b2.setOnClickListener(new C3231b(this, timeFormatActivity));
        timeFormatActivity.rgRadio = (RadioGroup) C8522c.m36739c(view, 2131428935, "field 'rgRadio'", RadioGroup.class);
        timeFormatActivity.rb24hr = (RadioButton) C8522c.m36739c(view, 2131428895, "field 'rb24hr'", RadioButton.class);
        timeFormatActivity.rb12hr = (RadioButton) C8522c.m36739c(view, 2131428894, "field 'rb12hr'", RadioButton.class);
        timeFormatActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
        timeFormatActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        timeFormatActivity.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        TimeFormatActivity timeFormatActivity = this.f19103b;
        if (timeFormatActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f19103b = null;
        timeFormatActivity.toolbar = null;
        timeFormatActivity.appbarToolbar = null;
        timeFormatActivity.btSaveChanges = null;
        timeFormatActivity.btnBackPlayerselection = null;
        timeFormatActivity.rgRadio = null;
        timeFormatActivity.rb24hr = null;
        timeFormatActivity.rb12hr = null;
        timeFormatActivity.date = null;
        timeFormatActivity.time = null;
        timeFormatActivity.logo = null;
        this.f19104c.setOnClickListener(null);
        this.f19104c = null;
        this.f19105d.setOnClickListener(null);
        this.f19105d = null;
    }
}

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
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGChannelUpdateActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGChannelUpdateActivity_ViewBinding.class */
public class EPGChannelUpdateActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public EPGChannelUpdateActivity f17037b;

    /* renamed from: c */
    public View f17038c;

    /* renamed from: d */
    public View f17039d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGChannelUpdateActivity_ViewBinding$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGChannelUpdateActivity_ViewBinding$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGChannelUpdateActivity_ViewBinding$a.class */
    public class C2735a extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final EPGChannelUpdateActivity f17040d;

        /* renamed from: e */
        public final EPGChannelUpdateActivity_ViewBinding f17041e;

        public C2735a(EPGChannelUpdateActivity_ViewBinding ePGChannelUpdateActivity_ViewBinding, EPGChannelUpdateActivity ePGChannelUpdateActivity) {
            this.f17041e = ePGChannelUpdateActivity_ViewBinding;
            this.f17040d = ePGChannelUpdateActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f17040d.onViewClicked(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGChannelUpdateActivity_ViewBinding$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.EPGChannelUpdateActivity_ViewBinding$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/EPGChannelUpdateActivity_ViewBinding$b.class */
    public class C2736b extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final EPGChannelUpdateActivity f17042d;

        /* renamed from: e */
        public final EPGChannelUpdateActivity_ViewBinding f17043e;

        public C2736b(EPGChannelUpdateActivity_ViewBinding ePGChannelUpdateActivity_ViewBinding, EPGChannelUpdateActivity ePGChannelUpdateActivity) {
            this.f17043e = ePGChannelUpdateActivity_ViewBinding;
            this.f17042d = ePGChannelUpdateActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f17042d.onViewClicked(view);
        }
    }

    public EPGChannelUpdateActivity_ViewBinding(EPGChannelUpdateActivity ePGChannelUpdateActivity, View view) {
        this.f17037b = ePGChannelUpdateActivity;
        ePGChannelUpdateActivity.toolbar = (Toolbar) C8522c.m36739c(view, 2131429320, "field 'toolbar'", Toolbar.class);
        ePGChannelUpdateActivity.appbarToolbar = (AppBarLayout) C8522c.m36739c(view, 2131427548, "field 'appbarToolbar'", AppBarLayout.class);
        View m36738b = C8522c.m36738b(view, 2131427620, "field 'btSaveChanges' and method 'onViewClicked'");
        ePGChannelUpdateActivity.btSaveChanges = (Button) C8522c.m36737a(m36738b, 2131427620, "field 'btSaveChanges'", Button.class);
        this.f17038c = m36738b;
        m36738b.setOnClickListener(new C2735a(this, ePGChannelUpdateActivity));
        View m36738b2 = C8522c.m36738b(view, 2131427634, "field 'btnBackPlayerselection' and method 'onViewClicked'");
        ePGChannelUpdateActivity.btnBackPlayerselection = (Button) C8522c.m36737a(m36738b2, 2131427634, "field 'btnBackPlayerselection'", Button.class);
        this.f17039d = m36738b2;
        m36738b2.setOnClickListener(new C2736b(this, ePGChannelUpdateActivity));
        ePGChannelUpdateActivity.rgRadio = (RadioGroup) C8522c.m36739c(view, 2131428935, "field 'rgRadio'", RadioGroup.class);
        ePGChannelUpdateActivity.rbwithepg = (RadioButton) C8522c.m36739c(view, 2131428915, "field 'rbwithepg'", RadioButton.class);
        ePGChannelUpdateActivity.rballchannels = (RadioButton) C8522c.m36739c(view, 2131428896, "field 'rballchannels'", RadioButton.class);
        ePGChannelUpdateActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
        ePGChannelUpdateActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        ePGChannelUpdateActivity.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        EPGChannelUpdateActivity ePGChannelUpdateActivity = this.f17037b;
        if (ePGChannelUpdateActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f17037b = null;
        ePGChannelUpdateActivity.toolbar = null;
        ePGChannelUpdateActivity.appbarToolbar = null;
        ePGChannelUpdateActivity.btSaveChanges = null;
        ePGChannelUpdateActivity.btnBackPlayerselection = null;
        ePGChannelUpdateActivity.rgRadio = null;
        ePGChannelUpdateActivity.rbwithepg = null;
        ePGChannelUpdateActivity.rballchannels = null;
        ePGChannelUpdateActivity.date = null;
        ePGChannelUpdateActivity.time = null;
        ePGChannelUpdateActivity.logo = null;
        this.f17038c.setOnClickListener(null);
        this.f17038c = null;
        this.f17039d.setOnClickListener(null);
        this.f17039d = null;
    }
}

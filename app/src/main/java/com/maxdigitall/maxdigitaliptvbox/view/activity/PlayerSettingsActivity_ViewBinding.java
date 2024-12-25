package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
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
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSettingsActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSettingsActivity_ViewBinding.class */
public class PlayerSettingsActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public PlayerSettingsActivity f18046b;

    /* renamed from: c */
    public View f18047c;

    /* renamed from: d */
    public View f18048d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSettingsActivity_ViewBinding$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayerSettingsActivity_ViewBinding$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSettingsActivity_ViewBinding$a.class */
    public class C2950a extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final PlayerSettingsActivity f18049d;

        /* renamed from: e */
        public final PlayerSettingsActivity_ViewBinding f18050e;

        public C2950a(PlayerSettingsActivity_ViewBinding playerSettingsActivity_ViewBinding, PlayerSettingsActivity playerSettingsActivity) {
            this.f18050e = playerSettingsActivity_ViewBinding;
            this.f18049d = playerSettingsActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f18049d.onViewClicked(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSettingsActivity_ViewBinding$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayerSettingsActivity_ViewBinding$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayerSettingsActivity_ViewBinding$b.class */
    public class C2951b extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final PlayerSettingsActivity f18051d;

        /* renamed from: e */
        public final PlayerSettingsActivity_ViewBinding f18052e;

        public C2951b(PlayerSettingsActivity_ViewBinding playerSettingsActivity_ViewBinding, PlayerSettingsActivity playerSettingsActivity) {
            this.f18052e = playerSettingsActivity_ViewBinding;
            this.f18051d = playerSettingsActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f18051d.onViewClicked(view);
        }
    }

    public PlayerSettingsActivity_ViewBinding(PlayerSettingsActivity playerSettingsActivity, View view) {
        this.f18046b = playerSettingsActivity;
        playerSettingsActivity.toolbar = (Toolbar) C8522c.m36739c(view, 2131429320, "field 'toolbar'", Toolbar.class);
        playerSettingsActivity.appbarToolbar = (AppBarLayout) C8522c.m36739c(view, 2131427548, "field 'appbarToolbar'", AppBarLayout.class);
        View m36738b = C8522c.m36738b(view, 2131427620, "field 'btSaveChanges' and method 'onViewClicked'");
        playerSettingsActivity.btSaveChanges = (Button) C8522c.m36737a(m36738b, 2131427620, "field 'btSaveChanges'", Button.class);
        this.f18047c = m36738b;
        m36738b.setOnClickListener(new C2950a(this, playerSettingsActivity));
        playerSettingsActivity.rgRadio = (RadioGroup) C8522c.m36739c(view, 2131428935, "field 'rgRadio'", RadioGroup.class);
        playerSettingsActivity.rbHardwareDecoder = (RadioButton) C8522c.m36739c(view, 2131428902, "field 'rbHardwareDecoder'", RadioButton.class);
        playerSettingsActivity.rbNative = (RadioButton) C8522c.m36739c(view, 2131428908, "field 'rbNative'", RadioButton.class);
        playerSettingsActivity.rbSoftwareDecoder = (RadioButton) C8522c.m36739c(view, 2131428910, "field 'rbSoftwareDecoder'", RadioButton.class);
        View m36738b2 = C8522c.m36738b(view, 2131427634, "field 'btnBackPlayerselection' and method 'onViewClicked'");
        playerSettingsActivity.btnBackPlayerselection = (Button) C8522c.m36737a(m36738b2, 2131427634, "field 'btnBackPlayerselection'", Button.class);
        this.f18048d = m36738b2;
        m36738b2.setOnClickListener(new C2951b(this, playerSettingsActivity));
        playerSettingsActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
        playerSettingsActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        playerSettingsActivity.cbOpenSLES = (CheckBox) C8522c.m36739c(view, 2131427736, "field 'cbOpenSLES'", CheckBox.class);
        playerSettingsActivity.cbOpenGL = (CheckBox) C8522c.m36739c(view, 2131427735, "field 'cbOpenGL'", CheckBox.class);
        playerSettingsActivity.cbInfBuf = (CheckBox) C8522c.m36739c(view, 2131427734, "field 'cbInfBuf'", CheckBox.class);
        playerSettingsActivity.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
        playerSettingsActivity.tv_buffer_size_limit = (TextView) C8522c.m36739c(view, 2131429368, "field 'tv_buffer_size_limit'", TextView.class);
        playerSettingsActivity.fl_buffer_size_limit = (FrameLayout) C8522c.m36739c(view, 2131428024, "field 'fl_buffer_size_limit'", FrameLayout.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        PlayerSettingsActivity playerSettingsActivity = this.f18046b;
        if (playerSettingsActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f18046b = null;
        playerSettingsActivity.toolbar = null;
        playerSettingsActivity.appbarToolbar = null;
        playerSettingsActivity.btSaveChanges = null;
        playerSettingsActivity.rgRadio = null;
        playerSettingsActivity.rbHardwareDecoder = null;
        playerSettingsActivity.rbNative = null;
        playerSettingsActivity.rbSoftwareDecoder = null;
        playerSettingsActivity.btnBackPlayerselection = null;
        playerSettingsActivity.date = null;
        playerSettingsActivity.time = null;
        playerSettingsActivity.cbOpenSLES = null;
        playerSettingsActivity.cbOpenGL = null;
        playerSettingsActivity.cbInfBuf = null;
        playerSettingsActivity.logo = null;
        playerSettingsActivity.tv_buffer_size_limit = null;
        playerSettingsActivity.fl_buffer_size_limit = null;
        this.f18047c.setOnClickListener(null);
        this.f18047c = null;
        this.f18048d.setOnClickListener(null);
        this.f18048d = null;
    }
}

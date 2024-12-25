package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import p316s2.AbstractViewOnClickListenerC8521b;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/GeneralSettingsActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/GeneralSettingsActivity_ViewBinding.class */
public class GeneralSettingsActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public GeneralSettingsActivity f17255b;

    /* renamed from: c */
    public View f17256c;

    /* renamed from: d */
    public View f17257d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/GeneralSettingsActivity_ViewBinding$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.GeneralSettingsActivity_ViewBinding$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/GeneralSettingsActivity_ViewBinding$a.class */
    public class C2782a extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final GeneralSettingsActivity f17258d;

        /* renamed from: e */
        public final GeneralSettingsActivity_ViewBinding f17259e;

        public C2782a(GeneralSettingsActivity_ViewBinding generalSettingsActivity_ViewBinding, GeneralSettingsActivity generalSettingsActivity) {
            this.f17259e = generalSettingsActivity_ViewBinding;
            this.f17258d = generalSettingsActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f17258d.onViewClicked(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/GeneralSettingsActivity_ViewBinding$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.GeneralSettingsActivity_ViewBinding$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/GeneralSettingsActivity_ViewBinding$b.class */
    public class C2783b extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final GeneralSettingsActivity f17260d;

        /* renamed from: e */
        public final GeneralSettingsActivity_ViewBinding f17261e;

        public C2783b(GeneralSettingsActivity_ViewBinding generalSettingsActivity_ViewBinding, GeneralSettingsActivity generalSettingsActivity) {
            this.f17261e = generalSettingsActivity_ViewBinding;
            this.f17260d = generalSettingsActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f17260d.onViewClicked(view);
        }
    }

    public GeneralSettingsActivity_ViewBinding(GeneralSettingsActivity generalSettingsActivity, View view) {
        this.f17255b = generalSettingsActivity;
        generalSettingsActivity.autoStart = (CheckBox) C8522c.m36739c(view, 2131427560, "field 'autoStart'", CheckBox.class);
        generalSettingsActivity.fullEPG = (CheckBox) C8522c.m36739c(view, 2131427899, "field 'fullEPG'", CheckBox.class);
        generalSettingsActivity.activesubtitle = (CheckBox) C8522c.m36739c(view, 2131429243, "field 'activesubtitle'", CheckBox.class);
        generalSettingsActivity.toolbar = (Toolbar) C8522c.m36739c(view, 2131429320, "field 'toolbar'", Toolbar.class);
        generalSettingsActivity.appbarToolbar = (AppBarLayout) C8522c.m36739c(view, 2131427548, "field 'appbarToolbar'", AppBarLayout.class);
        View m36738b = C8522c.m36738b(view, 2131427620, "field 'btSaveChanges' and method 'onViewClicked'");
        generalSettingsActivity.btSaveChanges = (Button) C8522c.m36737a(m36738b, 2131427620, "field 'btSaveChanges'", Button.class);
        this.f17256c = m36738b;
        m36738b.setOnClickListener(new C2782a(this, generalSettingsActivity));
        View m36738b2 = C8522c.m36738b(view, 2131427634, "field 'btnBackPlayerselection' and method 'onViewClicked'");
        generalSettingsActivity.btnBackPlayerselection = (Button) C8522c.m36737a(m36738b2, 2131427634, "field 'btnBackPlayerselection'", Button.class);
        this.f17257d = m36738b2;
        m36738b2.setOnClickListener(new C2783b(this, generalSettingsActivity));
        generalSettingsActivity.tv_useragent = (TextView) C8522c.m36739c(view, 2131429633, "field 'tv_useragent'", TextView.class);
        generalSettingsActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
        generalSettingsActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        generalSettingsActivity.spinnerEPG = (Spinner) C8522c.m36739c(view, 2131428246, "field 'spinnerEPG'", Spinner.class);
        generalSettingsActivity.etUserAgent = (EditText) C8522c.m36739c(view, 2131427930, "field 'etUserAgent'", EditText.class);
        generalSettingsActivity.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
        generalSettingsActivity.autoplay = (CheckBox) C8522c.m36739c(view, 2131427561, "field 'autoplay'", CheckBox.class);
        generalSettingsActivity.tv_auto_play_in = (TextView) C8522c.m36739c(view, 2131429359, "field 'tv_auto_play_in'", TextView.class);
        generalSettingsActivity.fl_auto_play_in = (FrameLayout) C8522c.m36739c(view, 2131428021, "field 'fl_auto_play_in'", FrameLayout.class);
        generalSettingsActivity.fl_recently_added_limit = (FrameLayout) C8522c.m36739c(view, 2131428027, "field 'fl_recently_added_limit'", FrameLayout.class);
        generalSettingsActivity.fl_recently_watched_limit_live = (FrameLayout) C8522c.m36739c(view, 2131428028, "field 'fl_recently_watched_limit_live'", FrameLayout.class);
        generalSettingsActivity.picinpic = (CheckBox) C8522c.m36739c(view, 2131428845, "field 'picinpic'", CheckBox.class);
        generalSettingsActivity.auto_clear_cache = (CheckBox) C8522c.m36739c(view, 2131427558, "field 'auto_clear_cache'", CheckBox.class);
        generalSettingsActivity.show_epg_in_channels_list = (CheckBox) C8522c.m36739c(view, 2131429159, "field 'show_epg_in_channels_list'", CheckBox.class);
        generalSettingsActivity.tv_recently_added_limit = (TextView) C8522c.m36739c(view, 2131429583, "field 'tv_recently_added_limit'", TextView.class);
        generalSettingsActivity.tv_recently_watched_limit_live = (TextView) C8522c.m36739c(view, 2131429584, "field 'tv_recently_watched_limit_live'", TextView.class);
        generalSettingsActivity.bt_clear_now = (TextView) C8522c.m36739c(view, 2131427604, "field 'bt_clear_now'", TextView.class);
        generalSettingsActivity.auto_play_channel_in_live = (CheckBox) C8522c.m36739c(view, 2131427559, "field 'auto_play_channel_in_live'", CheckBox.class);
        generalSettingsActivity.ll_auto_play_next_episode = (LinearLayout) C8522c.m36739c(view, 2131428331, "field 'll_auto_play_next_episode'", LinearLayout.class);
        generalSettingsActivity.ll_recently_added_limit = (LinearLayout) C8522c.m36739c(view, 2131428482, "field 'll_recently_added_limit'", LinearLayout.class);
        generalSettingsActivity.ll_recently_watched_limit_live = (LinearLayout) C8522c.m36739c(view, 2131428483, "field 'll_recently_watched_limit_live'", LinearLayout.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        GeneralSettingsActivity generalSettingsActivity = this.f17255b;
        if (generalSettingsActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f17255b = null;
        generalSettingsActivity.autoStart = null;
        generalSettingsActivity.fullEPG = null;
        generalSettingsActivity.activesubtitle = null;
        generalSettingsActivity.toolbar = null;
        generalSettingsActivity.appbarToolbar = null;
        generalSettingsActivity.btSaveChanges = null;
        generalSettingsActivity.btnBackPlayerselection = null;
        generalSettingsActivity.tv_useragent = null;
        generalSettingsActivity.date = null;
        generalSettingsActivity.time = null;
        generalSettingsActivity.spinnerEPG = null;
        generalSettingsActivity.etUserAgent = null;
        generalSettingsActivity.logo = null;
        generalSettingsActivity.autoplay = null;
        generalSettingsActivity.tv_auto_play_in = null;
        generalSettingsActivity.fl_auto_play_in = null;
        generalSettingsActivity.fl_recently_added_limit = null;
        generalSettingsActivity.fl_recently_watched_limit_live = null;
        generalSettingsActivity.picinpic = null;
        generalSettingsActivity.auto_clear_cache = null;
        generalSettingsActivity.show_epg_in_channels_list = null;
        generalSettingsActivity.tv_recently_added_limit = null;
        generalSettingsActivity.tv_recently_watched_limit_live = null;
        generalSettingsActivity.bt_clear_now = null;
        generalSettingsActivity.auto_play_channel_in_live = null;
        generalSettingsActivity.ll_auto_play_next_episode = null;
        generalSettingsActivity.ll_recently_added_limit = null;
        generalSettingsActivity.ll_recently_watched_limit_live = null;
        this.f17256c.setOnClickListener(null);
        this.f17256c = null;
        this.f17257d.setOnClickListener(null);
        this.f17257d = null;
    }
}

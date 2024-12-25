package com.maxdigitall.maxdigitaliptvbox.view.fragment;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.google.android.exoplayer2.p048ui.PlayerView;
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.NSTIJKPlayerSmallEPG;
import com.maxdigitall.maxdigitaliptvbox.view.utility.epg.EPG;
import p316s2.AbstractViewOnClickListenerC8521b;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/NewEPGFragment_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/NewEPGFragment_ViewBinding.class */
public class NewEPGFragment_ViewBinding implements Unbinder {

    /* renamed from: b */
    public NewEPGFragment f22145b;

    /* renamed from: c */
    public View f22146c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/NewEPGFragment_ViewBinding$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.NewEPGFragment_ViewBinding$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/NewEPGFragment_ViewBinding$a.class */
    public class C3677a extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final NewEPGFragment f22147d;

        /* renamed from: e */
        public final NewEPGFragment_ViewBinding f22148e;

        public C3677a(NewEPGFragment_ViewBinding newEPGFragment_ViewBinding, NewEPGFragment newEPGFragment) {
            this.f22148e = newEPGFragment_ViewBinding;
            this.f22147d = newEPGFragment;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f22147d.onViewClicked();
        }
    }

    public NewEPGFragment_ViewBinding(NewEPGFragment newEPGFragment, View view) {
        this.f22145b = newEPGFragment;
        newEPGFragment.pbLoader = (ProgressBar) C8522c.m36739c(view, 2131428830, "field 'pbLoader'", ProgressBar.class);
        newEPGFragment.tvNoRecordFound = (TextView) C8522c.m36739c(view, 2131429538, "field 'tvNoRecordFound'", TextView.class);
        newEPGFragment.tvViewProvider = (TextView) C8522c.m36739c(view, 2131429636, "field 'tvViewProvider'", TextView.class);
        newEPGFragment.epgFragment = (RelativeLayout) C8522c.m36739c(view, 2131429019, "field 'epgFragment'", RelativeLayout.class);
        newEPGFragment.epgView = (LinearLayout) C8522c.m36739c(view, 2131428400, "field 'epgView'", LinearLayout.class);
        newEPGFragment.currentEventTime = (TextView) C8522c.m36739c(view, 2131427801, "field 'currentEventTime'", TextView.class);
        newEPGFragment.currentEvent = (TextView) C8522c.m36739c(view, 2131427799, "field 'currentEvent'", TextView.class);
        newEPGFragment.player_view = (PlayerView) C8522c.m36739c(view, 2131428863, "field 'player_view'", PlayerView.class);
        newEPGFragment.currentEventDescription = (TextView) C8522c.m36739c(view, 2131427800, "field 'currentEventDescription'", TextView.class);
        newEPGFragment.epg = (EPG) C8522c.m36739c(view, 2131427898, "field 'epg'", EPG.class);
        newEPGFragment.tvNoStream = (TextView) C8522c.m36739c(view, 2131429535, "field 'tvNoStream'", TextView.class);
        newEPGFragment.app_video_loading = (ProgressBar) C8522c.m36739c(view, 2131427507, "field 'app_video_loading'", ProgressBar.class);
        newEPGFragment.app_video_status = (LinearLayout) C8522c.m36739c(view, 2131427519, "field 'app_video_status'", LinearLayout.class);
        newEPGFragment.app_video_status_text = (TextView) C8522c.m36739c(view, 2131427523, "field 'app_video_status_text'", TextView.class);
        newEPGFragment.tv_cat_title = (TextView) C8522c.m36739c(view, 2131429379, "field 'tv_cat_title'", TextView.class);
        newEPGFragment.mVideoView = (NSTIJKPlayerSmallEPG) C8522c.m36739c(view, 2131429674, "field 'mVideoView'", NSTIJKPlayerSmallEPG.class);
        View m36738b = C8522c.m36738b(view, 2131427469, "field 'app_video_box' and method 'onViewClicked'");
        newEPGFragment.app_video_box = (LinearLayout) C8522c.m36737a(m36738b, 2131427469, "field 'app_video_box'", LinearLayout.class);
        this.f22146c = m36738b;
        m36738b.setOnClickListener(new C3677a(this, newEPGFragment));
        newEPGFragment.rl_add_channel_to_fav = (RelativeLayout) C8522c.m36739c(view, 2131428946, "field 'rl_add_channel_to_fav'", RelativeLayout.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        NewEPGFragment newEPGFragment = this.f22145b;
        if (newEPGFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f22145b = null;
        newEPGFragment.pbLoader = null;
        newEPGFragment.tvNoRecordFound = null;
        newEPGFragment.tvViewProvider = null;
        newEPGFragment.epgFragment = null;
        newEPGFragment.epgView = null;
        newEPGFragment.currentEventTime = null;
        newEPGFragment.currentEvent = null;
        newEPGFragment.player_view = null;
        newEPGFragment.currentEventDescription = null;
        newEPGFragment.epg = null;
        newEPGFragment.tvNoStream = null;
        newEPGFragment.app_video_loading = null;
        newEPGFragment.app_video_status = null;
        newEPGFragment.app_video_status_text = null;
        newEPGFragment.tv_cat_title = null;
        newEPGFragment.mVideoView = null;
        newEPGFragment.app_video_box = null;
        newEPGFragment.rl_add_channel_to_fav = null;
        this.f22146c.setOnClickListener(null);
        this.f22146c = null;
    }
}

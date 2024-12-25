package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import butterknife.Unbinder;
import p316s2.C8522c;
import p440z8.C10105q;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/YouTubePlayerActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/YouTubePlayerActivity_ViewBinding.class */
public class YouTubePlayerActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public YouTubePlayerActivity f19622b;

    public YouTubePlayerActivity_ViewBinding(YouTubePlayerActivity youTubePlayerActivity, View view) {
        this.f19622b = youTubePlayerActivity;
        youTubePlayerActivity.llcontrol = (RelativeLayout) C8522c.m36739c(view, 2131427785, "field 'llcontrol'", RelativeLayout.class);
        youTubePlayerActivity.pauseBT = (AppCompatImageView) C8522c.m36739c(view, C10105q.f46301B, "field 'pauseBT'", AppCompatImageView.class);
        youTubePlayerActivity.playBT = (AppCompatImageView) C8522c.m36739c(view, C10105q.f46302C, "field 'playBT'", AppCompatImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        YouTubePlayerActivity youTubePlayerActivity = this.f19622b;
        if (youTubePlayerActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f19622b = null;
        youTubePlayerActivity.llcontrol = null;
        youTubePlayerActivity.pauseBT = null;
        youTubePlayerActivity.playBT = null;
    }
}

package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.VideoView;
import androidx.appcompat.app.ActivityC0243b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/FrontView.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/FrontView.class */
public class FrontView extends ActivityC0243b {

    /* renamed from: d */
    public boolean f17205d = false;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/FrontView$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.FrontView$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/FrontView$a.class */
    public class ViewOnClickListenerC2770a implements View.OnClickListener {

        /* renamed from: b */
        public final View f17206b;

        /* renamed from: c */
        public final View f17207c;

        /* renamed from: d */
        public final FrontView f17208d;

        public ViewOnClickListenerC2770a(FrontView frontView, View view, View view2) {
            this.f17208d = frontView;
            this.f17206b = view;
            this.f17207c = view2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FrontView frontView;
            boolean z10 = false;
            if (this.f17208d.f17205d) {
                this.f17206b.setVisibility(0);
                DisplayMetrics displayMetrics = new DisplayMetrics();
                this.f17208d.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f17207c.getLayoutParams();
                float f10 = displayMetrics.density;
                layoutParams.width = (int) (200.0f * f10);
                layoutParams.height = (int) (150.0f * f10);
                layoutParams.leftMargin = (int) (20.0f * f10);
                layoutParams.topMargin = (int) (f10 * 50.0f);
                this.f17207c.setLayoutParams(layoutParams);
                frontView = this.f17208d;
            } else {
                this.f17206b.setVisibility(8);
                DisplayMetrics displayMetrics2 = new DisplayMetrics();
                this.f17208d.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics2);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f17207c.getLayoutParams();
                layoutParams2.width = displayMetrics2.widthPixels;
                layoutParams2.height = displayMetrics2.heightPixels;
                layoutParams2.leftMargin = 0;
                layoutParams2.topMargin = 0;
                this.f17207c.setLayoutParams(layoutParams2);
                frontView = this.f17208d;
                z10 = true;
            }
            frontView.f17205d = z10;
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131623998);
        View findViewById = findViewById(2131428117);
        View findViewById2 = findViewById(2131428251);
        VideoView videoView = (VideoView) findViewById(2131429674);
        videoView.setVideoURI(Uri.parse("https://videocdn.bodybuilding.com/video/mp4/62000/62792m.mp4"));
        videoView.start();
        findViewById.setOnClickListener(new ViewOnClickListenerC2770a(this, findViewById2, findViewById));
    }
}

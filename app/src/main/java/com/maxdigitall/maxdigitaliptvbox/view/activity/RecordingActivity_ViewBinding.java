package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import p316s2.AbstractViewOnClickListenerC8521b;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RecordingActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RecordingActivity_ViewBinding.class */
public class RecordingActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public RecordingActivity f18088b;

    /* renamed from: c */
    public View f18089c;

    /* renamed from: d */
    public View f18090d;

    /* renamed from: e */
    public View f18091e;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RecordingActivity_ViewBinding$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.RecordingActivity_ViewBinding$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RecordingActivity_ViewBinding$a.class */
    public class C2965a extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final RecordingActivity f18092d;

        /* renamed from: e */
        public final RecordingActivity_ViewBinding f18093e;

        public C2965a(RecordingActivity_ViewBinding recordingActivity_ViewBinding, RecordingActivity recordingActivity) {
            this.f18093e = recordingActivity_ViewBinding;
            this.f18092d = recordingActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f18092d.NoRecordingfound();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RecordingActivity_ViewBinding$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.RecordingActivity_ViewBinding$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RecordingActivity_ViewBinding$b.class */
    public class C2966b extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final RecordingActivity f18094d;

        /* renamed from: e */
        public final RecordingActivity_ViewBinding f18095e;

        public C2966b(RecordingActivity_ViewBinding recordingActivity_ViewBinding, RecordingActivity recordingActivity) {
            this.f18095e = recordingActivity_ViewBinding;
            this.f18094d = recordingActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f18094d.onViewClicked();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RecordingActivity_ViewBinding$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.RecordingActivity_ViewBinding$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RecordingActivity_ViewBinding$c.class */
    public class C2967c extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final RecordingActivity f18096d;

        /* renamed from: e */
        public final RecordingActivity_ViewBinding f18097e;

        public C2967c(RecordingActivity_ViewBinding recordingActivity_ViewBinding, RecordingActivity recordingActivity) {
            this.f18097e = recordingActivity_ViewBinding;
            this.f18096d = recordingActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f18096d.HandleDontAsk();
        }
    }

    public RecordingActivity_ViewBinding(RecordingActivity recordingActivity, View view) {
        this.f18088b = recordingActivity;
        recordingActivity.appbarToolbar = (AppBarLayout) C8522c.m36739c(view, 2131427548, "field 'appbarToolbar'", AppBarLayout.class);
        recordingActivity.pbLoader = (ProgressBar) C8522c.m36739c(view, 2131428830, "field 'pbLoader'", ProgressBar.class);
        recordingActivity.recyclerView = (RecyclerView) C8522c.m36739c(view, 2131428747, "field 'recyclerView'", RecyclerView.class);
        View m36738b = C8522c.m36738b(view, 2131429538, "field 'tvNoRecordFound' and method 'NoRecordingfound'");
        recordingActivity.tvNoRecordFound = (TextView) C8522c.m36737a(m36738b, 2131429538, "field 'tvNoRecordFound'", TextView.class);
        this.f18089c = m36738b;
        m36738b.setOnClickListener(new C2965a(this, recordingActivity));
        recordingActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
        recordingActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        View m36738b2 = C8522c.m36738b(view, 2131427603, "field 'btBrowse' and method 'onViewClicked'");
        recordingActivity.btBrowse = (Button) C8522c.m36737a(m36738b2, 2131427603, "field 'btBrowse'", Button.class);
        this.f18090d = m36738b2;
        m36738b2.setOnClickListener(new C2966b(this, recordingActivity));
        recordingActivity.textViewRecordingDir = (TextView) C8522c.m36739c(view, 2131429586, "field 'textViewRecordingDir'", TextView.class);
        recordingActivity.rlRecordingDirChange = (LinearLayout) C8522c.m36739c(view, 2131429045, "field 'rlRecordingDirChange'", LinearLayout.class);
        View m36738b3 = C8522c.m36738b(view, 2131429539, "field 'tv_no_record_found_dontaskmeagain' and method 'HandleDontAsk'");
        recordingActivity.tv_no_record_found_dontaskmeagain = (TextView) C8522c.m36737a(m36738b3, 2131429539, "field 'tv_no_record_found_dontaskmeagain'", TextView.class);
        this.f18091e = m36738b3;
        m36738b3.setOnClickListener(new C2967c(this, recordingActivity));
        recordingActivity.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
        recordingActivity.iv_back_button = (ImageView) C8522c.m36739c(view, 2131428145, "field 'iv_back_button'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        RecordingActivity recordingActivity = this.f18088b;
        if (recordingActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f18088b = null;
        recordingActivity.appbarToolbar = null;
        recordingActivity.pbLoader = null;
        recordingActivity.recyclerView = null;
        recordingActivity.tvNoRecordFound = null;
        recordingActivity.date = null;
        recordingActivity.time = null;
        recordingActivity.btBrowse = null;
        recordingActivity.textViewRecordingDir = null;
        recordingActivity.rlRecordingDirChange = null;
        recordingActivity.tv_no_record_found_dontaskmeagain = null;
        recordingActivity.logo = null;
        recordingActivity.iv_back_button = null;
        this.f18089c.setOnClickListener(null);
        this.f18089c = null;
        this.f18090d.setOnClickListener(null);
        this.f18090d = null;
        this.f18091e.setOnClickListener(null);
        this.f18091e = null;
    }
}

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
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/StreamFormatActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/StreamFormatActivity_ViewBinding.class */
public class StreamFormatActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public StreamFormatActivity f18943b;

    /* renamed from: c */
    public View f18944c;

    /* renamed from: d */
    public View f18945d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/StreamFormatActivity_ViewBinding$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.StreamFormatActivity_ViewBinding$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/StreamFormatActivity_ViewBinding$a.class */
    public class C3186a extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final StreamFormatActivity f18946d;

        /* renamed from: e */
        public final StreamFormatActivity_ViewBinding f18947e;

        public C3186a(StreamFormatActivity_ViewBinding streamFormatActivity_ViewBinding, StreamFormatActivity streamFormatActivity) {
            this.f18947e = streamFormatActivity_ViewBinding;
            this.f18946d = streamFormatActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f18946d.onViewClicked(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/StreamFormatActivity_ViewBinding$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.StreamFormatActivity_ViewBinding$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/StreamFormatActivity_ViewBinding$b.class */
    public class C3187b extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final StreamFormatActivity f18948d;

        /* renamed from: e */
        public final StreamFormatActivity_ViewBinding f18949e;

        public C3187b(StreamFormatActivity_ViewBinding streamFormatActivity_ViewBinding, StreamFormatActivity streamFormatActivity) {
            this.f18949e = streamFormatActivity_ViewBinding;
            this.f18948d = streamFormatActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f18948d.onViewClicked(view);
        }
    }

    public StreamFormatActivity_ViewBinding(StreamFormatActivity streamFormatActivity, View view) {
        this.f18943b = streamFormatActivity;
        streamFormatActivity.toolbar = (Toolbar) C8522c.m36739c(view, 2131429320, "field 'toolbar'", Toolbar.class);
        streamFormatActivity.appbarToolbar = (AppBarLayout) C8522c.m36739c(view, 2131427548, "field 'appbarToolbar'", AppBarLayout.class);
        View m36738b = C8522c.m36738b(view, 2131427620, "field 'btSaveChanges' and method 'onViewClicked'");
        streamFormatActivity.btSaveChanges = (Button) C8522c.m36737a(m36738b, 2131427620, "field 'btSaveChanges'", Button.class);
        this.f18944c = m36738b;
        m36738b.setOnClickListener(new C3186a(this, streamFormatActivity));
        View m36738b2 = C8522c.m36738b(view, 2131427634, "field 'btnBackPlayerselection' and method 'onViewClicked'");
        streamFormatActivity.btnBackPlayerselection = (Button) C8522c.m36737a(m36738b2, 2131427634, "field 'btnBackPlayerselection'", Button.class);
        this.f18945d = m36738b2;
        m36738b2.setOnClickListener(new C3187b(this, streamFormatActivity));
        streamFormatActivity.rgRadio = (RadioGroup) C8522c.m36739c(view, 2131428935, "field 'rgRadio'", RadioGroup.class);
        streamFormatActivity.rbM3u8 = (RadioButton) C8522c.m36739c(view, 2131428905, "field 'rbM3u8'", RadioButton.class);
        streamFormatActivity.rbTs = (RadioButton) C8522c.m36739c(view, 2131428912, "field 'rbTs'", RadioButton.class);
        streamFormatActivity.rbDefault = (RadioButton) C8522c.m36739c(view, 2131428900, "field 'rbDefault'", RadioButton.class);
        streamFormatActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
        streamFormatActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        streamFormatActivity.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        StreamFormatActivity streamFormatActivity = this.f18943b;
        if (streamFormatActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f18943b = null;
        streamFormatActivity.toolbar = null;
        streamFormatActivity.appbarToolbar = null;
        streamFormatActivity.btSaveChanges = null;
        streamFormatActivity.btnBackPlayerselection = null;
        streamFormatActivity.rgRadio = null;
        streamFormatActivity.rbM3u8 = null;
        streamFormatActivity.rbTs = null;
        streamFormatActivity.rbDefault = null;
        streamFormatActivity.date = null;
        streamFormatActivity.time = null;
        streamFormatActivity.logo = null;
        this.f18944c.setOnClickListener(null);
        this.f18944c = null;
        this.f18945d.setOnClickListener(null);
        this.f18945d = null;
    }
}

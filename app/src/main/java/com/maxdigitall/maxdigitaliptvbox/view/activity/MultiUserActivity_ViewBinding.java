package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import p316s2.AbstractViewOnClickListenerC8521b;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiUserActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiUserActivity_ViewBinding.class */
public class MultiUserActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public MultiUserActivity f17728b;

    /* renamed from: c */
    public View f17729c;

    /* renamed from: d */
    public View f17730d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiUserActivity_ViewBinding$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.MultiUserActivity_ViewBinding$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiUserActivity_ViewBinding$a.class */
    public class C2859a extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final MultiUserActivity f17731d;

        /* renamed from: e */
        public final MultiUserActivity_ViewBinding f17732e;

        public C2859a(MultiUserActivity_ViewBinding multiUserActivity_ViewBinding, MultiUserActivity multiUserActivity) {
            this.f17732e = multiUserActivity_ViewBinding;
            this.f17731d = multiUserActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f17731d.onViewClicked(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiUserActivity_ViewBinding$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.MultiUserActivity_ViewBinding$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MultiUserActivity_ViewBinding$b.class */
    public class C2860b extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final MultiUserActivity f17733d;

        /* renamed from: e */
        public final MultiUserActivity_ViewBinding f17734e;

        public C2860b(MultiUserActivity_ViewBinding multiUserActivity_ViewBinding, MultiUserActivity multiUserActivity) {
            this.f17734e = multiUserActivity_ViewBinding;
            this.f17733d = multiUserActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f17733d.onViewClicked(view);
        }
    }

    public MultiUserActivity_ViewBinding(MultiUserActivity multiUserActivity, View view) {
        this.f17728b = multiUserActivity;
        multiUserActivity.pbLoader = (ProgressBar) C8522c.m36739c(view, 2131428830, "field 'pbLoader'", ProgressBar.class);
        multiUserActivity.myRecyclerView = (RecyclerView) C8522c.m36739c(view, 2131428747, "field 'myRecyclerView'", RecyclerView.class);
        multiUserActivity.emptyView = (TextView) C8522c.m36739c(view, 2131427887, "field 'emptyView'", TextView.class);
        multiUserActivity.frameLayout = (FrameLayout) C8522c.m36739c(view, 2131428025, "field 'frameLayout'", FrameLayout.class);
        multiUserActivity.ivBTUP = (ImageView) C8522c.m36739c(view, 2131428153, "field 'ivBTUP'", ImageView.class);
        multiUserActivity.tvNoStream = (TextView) C8522c.m36739c(view, 2131429535, "field 'tvNoStream'", TextView.class);
        multiUserActivity.tvNoRecordFound = (TextView) C8522c.m36739c(view, 2131429538, "field 'tvNoRecordFound'", TextView.class);
        multiUserActivity.addmore = (ImageView) C8522c.m36739c(view, 2131428134, "field 'addmore'", ImageView.class);
        View m36738b = C8522c.m36738b(view, 2131428322, "field 'll_add_user' and method 'onViewClicked'");
        multiUserActivity.ll_add_user = (LinearLayout) C8522c.m36737a(m36738b, 2131428322, "field 'll_add_user'", LinearLayout.class);
        this.f17729c = m36738b;
        m36738b.setOnClickListener(new C2859a(this, multiUserActivity));
        View m36738b2 = C8522c.m36738b(view, 2131428318, "field 'll_add_new_user' and method 'onViewClicked'");
        multiUserActivity.ll_add_new_user = (LinearLayout) C8522c.m36737a(m36738b2, 2131428318, "field 'll_add_new_user'", LinearLayout.class);
        this.f17730d = m36738b2;
        m36738b2.setOnClickListener(new C2860b(this, multiUserActivity));
        multiUserActivity.tv_list_options = (TextView) C8522c.m36739c(view, 2131429493, "field 'tv_list_options'", TextView.class);
        multiUserActivity.tv_link2 = (TextView) C8522c.m36739c(view, 2131429491, "field 'tv_link2'", TextView.class);
        multiUserActivity.ll_termsandservices = (LinearLayout) C8522c.m36739c(view, 2131428522, "field 'll_termsandservices'", LinearLayout.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        MultiUserActivity multiUserActivity = this.f17728b;
        if (multiUserActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f17728b = null;
        multiUserActivity.pbLoader = null;
        multiUserActivity.myRecyclerView = null;
        multiUserActivity.emptyView = null;
        multiUserActivity.frameLayout = null;
        multiUserActivity.ivBTUP = null;
        multiUserActivity.tvNoStream = null;
        multiUserActivity.tvNoRecordFound = null;
        multiUserActivity.addmore = null;
        multiUserActivity.ll_add_user = null;
        multiUserActivity.ll_add_new_user = null;
        multiUserActivity.tv_list_options = null;
        multiUserActivity.tv_link2 = null;
        multiUserActivity.ll_termsandservices = null;
        this.f17729c.setOnClickListener(null);
        this.f17729c = null;
        this.f17730d.setOnClickListener(null);
        this.f17730d = null;
    }
}

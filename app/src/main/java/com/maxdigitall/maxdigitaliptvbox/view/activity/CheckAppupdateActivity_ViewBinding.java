package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import butterknife.Unbinder;
import p316s2.AbstractViewOnClickListenerC8521b;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/CheckAppupdateActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/CheckAppupdateActivity_ViewBinding.class */
public class CheckAppupdateActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public CheckAppupdateActivity f17010b;

    /* renamed from: c */
    public View f17011c;

    /* renamed from: d */
    public View f17012d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/CheckAppupdateActivity_ViewBinding$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.CheckAppupdateActivity_ViewBinding$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/CheckAppupdateActivity_ViewBinding$a.class */
    public class C2723a extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final CheckAppupdateActivity f17013d;

        /* renamed from: e */
        public final CheckAppupdateActivity_ViewBinding f17014e;

        public C2723a(CheckAppupdateActivity_ViewBinding checkAppupdateActivity_ViewBinding, CheckAppupdateActivity checkAppupdateActivity) {
            this.f17014e = checkAppupdateActivity_ViewBinding;
            this.f17013d = checkAppupdateActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f17013d.onclickView(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/CheckAppupdateActivity_ViewBinding$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.CheckAppupdateActivity_ViewBinding$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/CheckAppupdateActivity_ViewBinding$b.class */
    public class C2724b extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final CheckAppupdateActivity f17015d;

        /* renamed from: e */
        public final CheckAppupdateActivity_ViewBinding f17016e;

        public C2724b(CheckAppupdateActivity_ViewBinding checkAppupdateActivity_ViewBinding, CheckAppupdateActivity checkAppupdateActivity) {
            this.f17016e = checkAppupdateActivity_ViewBinding;
            this.f17015d = checkAppupdateActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f17015d.onclickView(view);
        }
    }

    public CheckAppupdateActivity_ViewBinding(CheckAppupdateActivity checkAppupdateActivity, View view) {
        this.f17010b = checkAppupdateActivity;
        checkAppupdateActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
        checkAppupdateActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        checkAppupdateActivity.title = (TextView) C8522c.m36739c(view, 2131429387, "field 'title'", TextView.class);
        checkAppupdateActivity.message = (TextView) C8522c.m36739c(view, 2131429386, "field 'message'", TextView.class);
        checkAppupdateActivity.pbLoader = (ProgressBar) C8522c.m36739c(view, 2131428840, "field 'pbLoader'", ProgressBar.class);
        checkAppupdateActivity.nested_checkupdate = (NestedScrollView) C8522c.m36739c(view, 2131428780, "field 'nested_checkupdate'", NestedScrollView.class);
        checkAppupdateActivity.ll_marginLayout = (LinearLayout) C8522c.m36739c(view, 2131428439, "field 'll_marginLayout'", LinearLayout.class);
        View m36738b = C8522c.m36738b(view, 2131427649, "field 'btn_later' and method 'onclickView'");
        checkAppupdateActivity.btn_later = (Button) C8522c.m36737a(m36738b, 2131427649, "field 'btn_later'", Button.class);
        this.f17011c = m36738b;
        m36738b.setOnClickListener(new C2723a(this, checkAppupdateActivity));
        View m36738b2 = C8522c.m36738b(view, 2131427680, "field 'btn_update' and method 'onclickView'");
        checkAppupdateActivity.btn_update = (Button) C8522c.m36737a(m36738b2, 2131427680, "field 'btn_update'", Button.class);
        this.f17012d = m36738b2;
        m36738b2.setOnClickListener(new C2724b(this, checkAppupdateActivity));
        checkAppupdateActivity.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        CheckAppupdateActivity checkAppupdateActivity = this.f17010b;
        if (checkAppupdateActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f17010b = null;
        checkAppupdateActivity.date = null;
        checkAppupdateActivity.time = null;
        checkAppupdateActivity.title = null;
        checkAppupdateActivity.message = null;
        checkAppupdateActivity.pbLoader = null;
        checkAppupdateActivity.nested_checkupdate = null;
        checkAppupdateActivity.ll_marginLayout = null;
        checkAppupdateActivity.btn_later = null;
        checkAppupdateActivity.btn_update = null;
        checkAppupdateActivity.logo = null;
        this.f17011c.setOnClickListener(null);
        this.f17011c = null;
        this.f17012d.setOnClickListener(null);
        this.f17012d = null;
    }
}

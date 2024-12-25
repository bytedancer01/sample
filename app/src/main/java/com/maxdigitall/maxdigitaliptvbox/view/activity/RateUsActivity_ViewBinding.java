package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import p316s2.AbstractViewOnClickListenerC8521b;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RateUsActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RateUsActivity_ViewBinding.class */
public class RateUsActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public RateUsActivity f18059b;

    /* renamed from: c */
    public View f18060c;

    /* renamed from: d */
    public View f18061d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RateUsActivity_ViewBinding$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.RateUsActivity_ViewBinding$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RateUsActivity_ViewBinding$a.class */
    public class C2955a extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final RateUsActivity f18062d;

        /* renamed from: e */
        public final RateUsActivity_ViewBinding f18063e;

        public C2955a(RateUsActivity_ViewBinding rateUsActivity_ViewBinding, RateUsActivity rateUsActivity) {
            this.f18063e = rateUsActivity_ViewBinding;
            this.f18062d = rateUsActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f18062d.onViewClicked(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RateUsActivity_ViewBinding$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.RateUsActivity_ViewBinding$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/RateUsActivity_ViewBinding$b.class */
    public class C2956b extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final RateUsActivity f18064d;

        /* renamed from: e */
        public final RateUsActivity_ViewBinding f18065e;

        public C2956b(RateUsActivity_ViewBinding rateUsActivity_ViewBinding, RateUsActivity rateUsActivity) {
            this.f18065e = rateUsActivity_ViewBinding;
            this.f18064d = rateUsActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f18064d.onViewClicked(view);
        }
    }

    public RateUsActivity_ViewBinding(RateUsActivity rateUsActivity, View view) {
        this.f18059b = rateUsActivity;
        View m36738b = C8522c.m36738b(view, 2131427664, "field 'btn_rateus' and method 'onViewClicked'");
        rateUsActivity.btn_rateus = (Button) C8522c.m36737a(m36738b, 2131427664, "field 'btn_rateus'", Button.class);
        this.f18060c = m36738b;
        m36738b.setOnClickListener(new C2955a(this, rateUsActivity));
        View m36738b2 = C8522c.m36738b(view, 2131427649, "field 'btn_later' and method 'onViewClicked'");
        rateUsActivity.btn_later = (Button) C8522c.m36737a(m36738b2, 2131427649, "field 'btn_later'", Button.class);
        this.f18061d = m36738b2;
        m36738b2.setOnClickListener(new C2956b(this, rateUsActivity));
        rateUsActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
        rateUsActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        rateUsActivity.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        RateUsActivity rateUsActivity = this.f18059b;
        if (rateUsActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f18059b = null;
        rateUsActivity.btn_rateus = null;
        rateUsActivity.btn_later = null;
        rateUsActivity.date = null;
        rateUsActivity.time = null;
        rateUsActivity.logo = null;
        this.f18060c.setOnClickListener(null);
        this.f18060c = null;
        this.f18061d.setOnClickListener(null);
        this.f18061d = null;
    }
}

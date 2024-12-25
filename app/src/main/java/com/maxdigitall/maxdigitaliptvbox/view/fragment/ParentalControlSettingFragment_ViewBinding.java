package com.maxdigitall.maxdigitaliptvbox.view.fragment;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import butterknife.Unbinder;
import p316s2.AbstractViewOnClickListenerC8521b;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlSettingFragment_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlSettingFragment_ViewBinding.class */
public class ParentalControlSettingFragment_ViewBinding implements Unbinder {

    /* renamed from: b */
    public ParentalControlSettingFragment f22246b;

    /* renamed from: c */
    public View f22247c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlSettingFragment_ViewBinding$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.fragment.ParentalControlSettingFragment_ViewBinding$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/fragment/ParentalControlSettingFragment_ViewBinding$a.class */
    public class C3703a extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final ParentalControlSettingFragment f22248d;

        /* renamed from: e */
        public final ParentalControlSettingFragment_ViewBinding f22249e;

        public C3703a(ParentalControlSettingFragment_ViewBinding parentalControlSettingFragment_ViewBinding, ParentalControlSettingFragment parentalControlSettingFragment) {
            this.f22249e = parentalControlSettingFragment_ViewBinding;
            this.f22248d = parentalControlSettingFragment;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f22248d.onViewClicked();
        }
    }

    public ParentalControlSettingFragment_ViewBinding(ParentalControlSettingFragment parentalControlSettingFragment, View view) {
        this.f22246b = parentalControlSettingFragment;
        parentalControlSettingFragment.tvOldPassword = (EditText) C8522c.m36739c(view, 2131429547, "field 'tvOldPassword'", EditText.class);
        parentalControlSettingFragment.tvNewPassword = (EditText) C8522c.m36739c(view, 2131429525, "field 'tvNewPassword'", EditText.class);
        parentalControlSettingFragment.tvConfirmPassword = (EditText) C8522c.m36739c(view, 2131429390, "field 'tvConfirmPassword'", EditText.class);
        View m36738b = C8522c.m36738b(view, 2131427623, "field 'btSavePassword' and method 'onViewClicked'");
        parentalControlSettingFragment.btSavePassword = (Button) C8522c.m36737a(m36738b, 2131427623, "field 'btSavePassword'", Button.class);
        this.f22247c = m36738b;
        m36738b.setOnClickListener(new C3703a(this, parentalControlSettingFragment));
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        ParentalControlSettingFragment parentalControlSettingFragment = this.f22246b;
        if (parentalControlSettingFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f22246b = null;
        parentalControlSettingFragment.tvOldPassword = null;
        parentalControlSettingFragment.tvNewPassword = null;
        parentalControlSettingFragment.tvConfirmPassword = null;
        parentalControlSettingFragment.btSavePassword = null;
        this.f22247c.setOnClickListener(null);
        this.f22247c = null;
    }
}

package com.maxdigitall.maxdigitaliptvbox.vpn.activities;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import butterknife.Unbinder;
import p316s2.AbstractViewOnClickListenerC8521b;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ImportVPNActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ImportVPNActivity_ViewBinding.class */
public class ImportVPNActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public ImportVPNActivity f25078b;

    /* renamed from: c */
    public View f25079c;

    /* renamed from: d */
    public View f25080d;

    /* renamed from: e */
    public View f25081e;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ImportVPNActivity_ViewBinding$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.vpn.activities.ImportVPNActivity_ViewBinding$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ImportVPNActivity_ViewBinding$a.class */
    public class C4058a extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final ImportVPNActivity f25082d;

        /* renamed from: e */
        public final ImportVPNActivity_ViewBinding f25083e;

        public C4058a(ImportVPNActivity_ViewBinding importVPNActivity_ViewBinding, ImportVPNActivity importVPNActivity) {
            this.f25083e = importVPNActivity_ViewBinding;
            this.f25082d = importVPNActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f25082d.onclick(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ImportVPNActivity_ViewBinding$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.vpn.activities.ImportVPNActivity_ViewBinding$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ImportVPNActivity_ViewBinding$b.class */
    public class C4059b extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final ImportVPNActivity f25084d;

        /* renamed from: e */
        public final ImportVPNActivity_ViewBinding f25085e;

        public C4059b(ImportVPNActivity_ViewBinding importVPNActivity_ViewBinding, ImportVPNActivity importVPNActivity) {
            this.f25085e = importVPNActivity_ViewBinding;
            this.f25084d = importVPNActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f25084d.onclick(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ImportVPNActivity_ViewBinding$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.vpn.activities.ImportVPNActivity_ViewBinding$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ImportVPNActivity_ViewBinding$c.class */
    public class C4060c extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final ImportVPNActivity f25086d;

        /* renamed from: e */
        public final ImportVPNActivity_ViewBinding f25087e;

        public C4060c(ImportVPNActivity_ViewBinding importVPNActivity_ViewBinding, ImportVPNActivity importVPNActivity) {
            this.f25087e = importVPNActivity_ViewBinding;
            this.f25086d = importVPNActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f25086d.onclick(view);
        }
    }

    public ImportVPNActivity_ViewBinding(ImportVPNActivity importVPNActivity, View view) {
        this.f25078b = importVPNActivity;
        importVPNActivity.et_certificate = (EditText) C8522c.m36739c(view, 2131427904, "field 'et_certificate'", EditText.class);
        View m36738b = C8522c.m36738b(view, 2131427648, "field 'btn_import' and method 'onclick'");
        importVPNActivity.btn_import = (Button) C8522c.m36737a(m36738b, 2131427648, "field 'btn_import'", Button.class);
        this.f25079c = m36738b;
        m36738b.setOnClickListener(new C4058a(this, importVPNActivity));
        View m36738b2 = C8522c.m36738b(view, 2131427632, "field 'btn_back' and method 'onclick'");
        importVPNActivity.btn_back = (Button) C8522c.m36737a(m36738b2, 2131427632, "field 'btn_back'", Button.class);
        this.f25080d = m36738b2;
        m36738b2.setOnClickListener(new C4059b(this, importVPNActivity));
        importVPNActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
        importVPNActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        importVPNActivity.rb_file = (RadioButton) C8522c.m36739c(view, 2131428901, "field 'rb_file'", RadioButton.class);
        importVPNActivity.rb_url = (RadioButton) C8522c.m36739c(view, 2131428914, "field 'rb_url'", RadioButton.class);
        importVPNActivity.rl_browse = (LinearLayout) C8522c.m36739c(view, 2131428959, "field 'rl_browse'", LinearLayout.class);
        View m36738b3 = C8522c.m36738b(view, 2131427599, "field 'bt_browse' and method 'onclick'");
        importVPNActivity.bt_browse = (Button) C8522c.m36737a(m36738b3, 2131427599, "field 'bt_browse'", Button.class);
        this.f25081e = m36738b3;
        m36738b3.setOnClickListener(new C4060c(this, importVPNActivity));
        importVPNActivity.ll_url = (LinearLayout) C8522c.m36739c(view, 2131428532, "field 'll_url'", LinearLayout.class);
        importVPNActivity.tv_browse_error = (TextView) C8522c.m36739c(view, 2131429367, "field 'tv_browse_error'", TextView.class);
        importVPNActivity.tv_file_path = (TextView) C8522c.m36739c(view, 2131429455, "field 'tv_file_path'", TextView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        ImportVPNActivity importVPNActivity = this.f25078b;
        if (importVPNActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f25078b = null;
        importVPNActivity.et_certificate = null;
        importVPNActivity.btn_import = null;
        importVPNActivity.btn_back = null;
        importVPNActivity.date = null;
        importVPNActivity.time = null;
        importVPNActivity.rb_file = null;
        importVPNActivity.rb_url = null;
        importVPNActivity.rl_browse = null;
        importVPNActivity.bt_browse = null;
        importVPNActivity.ll_url = null;
        importVPNActivity.tv_browse_error = null;
        importVPNActivity.tv_file_path = null;
        this.f25079c.setOnClickListener(null);
        this.f25079c = null;
        this.f25080d.setOnClickListener(null);
        this.f25080d = null;
        this.f25081e.setOnClickListener(null);
        this.f25081e = null;
    }
}

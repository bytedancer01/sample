package com.maxdigitall.maxdigitaliptvbox.vpn.activities;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import p216m9.C5974n;
import p316s2.AbstractViewOnClickListenerC8521b;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ProfileActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ProfileActivity_ViewBinding.class */
public class ProfileActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public ProfileActivity f25112b;

    /* renamed from: c */
    public View f25113c;

    /* renamed from: d */
    public View f25114d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ProfileActivity_ViewBinding$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.vpn.activities.ProfileActivity_ViewBinding$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ProfileActivity_ViewBinding$a.class */
    public class C4065a extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final ProfileActivity f25115d;

        /* renamed from: e */
        public final ProfileActivity_ViewBinding f25116e;

        public C4065a(ProfileActivity_ViewBinding profileActivity_ViewBinding, ProfileActivity profileActivity) {
            this.f25116e = profileActivity_ViewBinding;
            this.f25115d = profileActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f25115d.onclick(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ProfileActivity_ViewBinding$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.vpn.activities.ProfileActivity_ViewBinding$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/vpn/activities/ProfileActivity_ViewBinding$b.class */
    public class C4066b extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final ProfileActivity f25117d;

        /* renamed from: e */
        public final ProfileActivity_ViewBinding f25118e;

        public C4066b(ProfileActivity_ViewBinding profileActivity_ViewBinding, ProfileActivity profileActivity) {
            this.f25118e = profileActivity_ViewBinding;
            this.f25117d = profileActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f25117d.onclick(view);
        }
    }

    public ProfileActivity_ViewBinding(ProfileActivity profileActivity, View view) {
        this.f25112b = profileActivity;
        View m36738b = C8522c.m36738b(view, 2131428317, "field 'll_add_new_profile' and method 'onclick'");
        profileActivity.ll_add_new_profile = (LinearLayout) C8522c.m36737a(m36738b, 2131428317, "field 'll_add_new_profile'", LinearLayout.class);
        this.f25113c = m36738b;
        m36738b.setOnClickListener(new C4065a(this, profileActivity));
        View m36738b2 = C8522c.m36738b(view, 2131428320, "field 'll_add_profile' and method 'onclick'");
        profileActivity.ll_add_profile = (LinearLayout) C8522c.m36737a(m36738b2, 2131428320, "field 'll_add_profile'", LinearLayout.class);
        this.f25114d = m36738b2;
        m36738b2.setOnClickListener(new C4066b(this, profileActivity));
        profileActivity.progressBar = (ProgressBar) C8522c.m36739c(view, C5974n.f33499T, "field 'progressBar'", ProgressBar.class);
        profileActivity.recyclerView = (RecyclerView) C8522c.m36739c(view, 2131428920, "field 'recyclerView'", RecyclerView.class);
        profileActivity.rl_bottom_message = (RelativeLayout) C8522c.m36739c(view, 2131428958, "field 'rl_bottom_message'", RelativeLayout.class);
        profileActivity.tv_no_server_found = (TextView) C8522c.m36739c(view, 2131429540, "field 'tv_no_server_found'", TextView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        ProfileActivity profileActivity = this.f25112b;
        if (profileActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f25112b = null;
        profileActivity.ll_add_new_profile = null;
        profileActivity.ll_add_profile = null;
        profileActivity.progressBar = null;
        profileActivity.recyclerView = null;
        profileActivity.rl_bottom_message = null;
        profileActivity.tv_no_server_found = null;
        this.f25113c.setOnClickListener(null);
        this.f25113c = null;
        this.f25114d.setOnClickListener(null);
        this.f25114d = null;
    }
}

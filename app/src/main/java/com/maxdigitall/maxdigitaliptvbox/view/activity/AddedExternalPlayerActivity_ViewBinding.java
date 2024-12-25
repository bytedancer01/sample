package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import p316s2.AbstractViewOnClickListenerC8521b;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AddedExternalPlayerActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AddedExternalPlayerActivity_ViewBinding.class */
public class AddedExternalPlayerActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public AddedExternalPlayerActivity f16846b;

    /* renamed from: c */
    public View f16847c;

    /* renamed from: d */
    public View f16848d;

    /* renamed from: e */
    public View f16849e;

    /* renamed from: f */
    public View f16850f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AddedExternalPlayerActivity_ViewBinding$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AddedExternalPlayerActivity_ViewBinding$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AddedExternalPlayerActivity_ViewBinding$a.class */
    public class C2676a extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final AddedExternalPlayerActivity f16851d;

        /* renamed from: e */
        public final AddedExternalPlayerActivity_ViewBinding f16852e;

        public C2676a(AddedExternalPlayerActivity_ViewBinding addedExternalPlayerActivity_ViewBinding, AddedExternalPlayerActivity addedExternalPlayerActivity) {
            this.f16852e = addedExternalPlayerActivity_ViewBinding;
            this.f16851d = addedExternalPlayerActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f16851d.onclick(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AddedExternalPlayerActivity_ViewBinding$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AddedExternalPlayerActivity_ViewBinding$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AddedExternalPlayerActivity_ViewBinding$b.class */
    public class C2677b extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final AddedExternalPlayerActivity f16853d;

        /* renamed from: e */
        public final AddedExternalPlayerActivity_ViewBinding f16854e;

        public C2677b(AddedExternalPlayerActivity_ViewBinding addedExternalPlayerActivity_ViewBinding, AddedExternalPlayerActivity addedExternalPlayerActivity) {
            this.f16854e = addedExternalPlayerActivity_ViewBinding;
            this.f16853d = addedExternalPlayerActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f16853d.onclick(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AddedExternalPlayerActivity_ViewBinding$c.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AddedExternalPlayerActivity_ViewBinding$c */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AddedExternalPlayerActivity_ViewBinding$c.class */
    public class C2678c extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final AddedExternalPlayerActivity f16855d;

        /* renamed from: e */
        public final AddedExternalPlayerActivity_ViewBinding f16856e;

        public C2678c(AddedExternalPlayerActivity_ViewBinding addedExternalPlayerActivity_ViewBinding, AddedExternalPlayerActivity addedExternalPlayerActivity) {
            this.f16856e = addedExternalPlayerActivity_ViewBinding;
            this.f16855d = addedExternalPlayerActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f16855d.onclick(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AddedExternalPlayerActivity_ViewBinding$d.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.AddedExternalPlayerActivity_ViewBinding$d */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/AddedExternalPlayerActivity_ViewBinding$d.class */
    public class C2679d extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final AddedExternalPlayerActivity f16857d;

        /* renamed from: e */
        public final AddedExternalPlayerActivity_ViewBinding f16858e;

        public C2679d(AddedExternalPlayerActivity_ViewBinding addedExternalPlayerActivity_ViewBinding, AddedExternalPlayerActivity addedExternalPlayerActivity) {
            this.f16858e = addedExternalPlayerActivity_ViewBinding;
            this.f16857d = addedExternalPlayerActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f16857d.onclick(view);
        }
    }

    public AddedExternalPlayerActivity_ViewBinding(AddedExternalPlayerActivity addedExternalPlayerActivity, View view) {
        this.f16846b = addedExternalPlayerActivity;
        addedExternalPlayerActivity.ll_progressbar = (LinearLayout) C8522c.m36739c(view, 2131428480, "field 'll_progressbar'", LinearLayout.class);
        View m36738b = C8522c.m36738b(view, 2131428451, "field 'll_no_data_found' and method 'onclick'");
        addedExternalPlayerActivity.ll_no_data_found = (LinearLayout) C8522c.m36737a(m36738b, 2131428451, "field 'll_no_data_found'", LinearLayout.class);
        this.f16847c = m36738b;
        m36738b.setOnClickListener(new C2676a(this, addedExternalPlayerActivity));
        addedExternalPlayerActivity.recyclerView = (RecyclerView) C8522c.m36739c(view, 2131428920, "field 'recyclerView'", RecyclerView.class);
        View m36738b2 = C8522c.m36738b(view, 2131428319, "field 'll_add_player' and method 'onclick'");
        addedExternalPlayerActivity.ll_add_player = (LinearLayout) C8522c.m36737a(m36738b2, 2131428319, "field 'll_add_player'", LinearLayout.class);
        this.f16848d = m36738b2;
        m36738b2.setOnClickListener(new C2677b(this, addedExternalPlayerActivity));
        addedExternalPlayerActivity.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
        View m36738b3 = C8522c.m36738b(view, 2131428135, "method 'onclick'");
        this.f16849e = m36738b3;
        m36738b3.setOnClickListener(new C2678c(this, addedExternalPlayerActivity));
        View m36738b4 = C8522c.m36738b(view, 2131429350, "method 'onclick'");
        this.f16850f = m36738b4;
        m36738b4.setOnClickListener(new C2679d(this, addedExternalPlayerActivity));
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        AddedExternalPlayerActivity addedExternalPlayerActivity = this.f16846b;
        if (addedExternalPlayerActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f16846b = null;
        addedExternalPlayerActivity.ll_progressbar = null;
        addedExternalPlayerActivity.ll_no_data_found = null;
        addedExternalPlayerActivity.recyclerView = null;
        addedExternalPlayerActivity.ll_add_player = null;
        addedExternalPlayerActivity.logo = null;
        this.f16847c.setOnClickListener(null);
        this.f16847c = null;
        this.f16848d.setOnClickListener(null);
        this.f16848d = null;
        this.f16849e.setOnClickListener(null);
        this.f16849e = null;
        this.f16850f.setOnClickListener(null);
        this.f16850f = null;
    }
}

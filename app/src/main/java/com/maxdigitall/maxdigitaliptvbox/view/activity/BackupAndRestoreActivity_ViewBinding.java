package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import p316s2.AbstractViewOnClickListenerC8521b;
import p316s2.C8522c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity_ViewBinding.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity_ViewBinding.class */
public class BackupAndRestoreActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    public BackupAndRestoreActivity f16991b;

    /* renamed from: c */
    public View f16992c;

    /* renamed from: d */
    public View f16993d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity_ViewBinding$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.BackupAndRestoreActivity_ViewBinding$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity_ViewBinding$a.class */
    public class C2717a extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final BackupAndRestoreActivity f16994d;

        /* renamed from: e */
        public final BackupAndRestoreActivity_ViewBinding f16995e;

        public C2717a(BackupAndRestoreActivity_ViewBinding backupAndRestoreActivity_ViewBinding, BackupAndRestoreActivity backupAndRestoreActivity) {
            this.f16995e = backupAndRestoreActivity_ViewBinding;
            this.f16994d = backupAndRestoreActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f16994d.onViewClicked(view);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity_ViewBinding$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.BackupAndRestoreActivity_ViewBinding$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/BackupAndRestoreActivity_ViewBinding$b.class */
    public class C2718b extends AbstractViewOnClickListenerC8521b {

        /* renamed from: d */
        public final BackupAndRestoreActivity f16996d;

        /* renamed from: e */
        public final BackupAndRestoreActivity_ViewBinding f16997e;

        public C2718b(BackupAndRestoreActivity_ViewBinding backupAndRestoreActivity_ViewBinding, BackupAndRestoreActivity backupAndRestoreActivity) {
            this.f16997e = backupAndRestoreActivity_ViewBinding;
            this.f16996d = backupAndRestoreActivity;
        }

        @Override // p316s2.AbstractViewOnClickListenerC8521b
        /* renamed from: b */
        public void mo14535b(View view) {
            this.f16996d.onViewClicked(view);
        }
    }

    public BackupAndRestoreActivity_ViewBinding(BackupAndRestoreActivity backupAndRestoreActivity, View view) {
        this.f16991b = backupAndRestoreActivity;
        backupAndRestoreActivity.toolbar = (Toolbar) C8522c.m36739c(view, 2131429320, "field 'toolbar'", Toolbar.class);
        backupAndRestoreActivity.appbarToolbar = (AppBarLayout) C8522c.m36739c(view, 2131427548, "field 'appbarToolbar'", AppBarLayout.class);
        View m36738b = C8522c.m36738b(view, 2131427598, "field 'btSaveChanges' and method 'onViewClicked'");
        backupAndRestoreActivity.btSaveChanges = (Button) C8522c.m36737a(m36738b, 2131427598, "field 'btSaveChanges'", Button.class);
        this.f16992c = m36738b;
        m36738b.setOnClickListener(new C2717a(this, backupAndRestoreActivity));
        View m36738b2 = C8522c.m36738b(view, 2131427616, "field 'btnBackPlayerselection' and method 'onViewClicked'");
        backupAndRestoreActivity.btnBackPlayerselection = (Button) C8522c.m36737a(m36738b2, 2131427616, "field 'btnBackPlayerselection'", Button.class);
        this.f16993d = m36738b2;
        m36738b2.setOnClickListener(new C2718b(this, backupAndRestoreActivity));
        backupAndRestoreActivity.date = (TextView) C8522c.m36739c(view, 2131427816, "field 'date'", TextView.class);
        backupAndRestoreActivity.time = (TextView) C8522c.m36739c(view, 2131429309, "field 'time'", TextView.class);
        backupAndRestoreActivity.logo = (ImageView) C8522c.m36739c(view, 2131428555, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    /* renamed from: a */
    public void mo5629a() {
        BackupAndRestoreActivity backupAndRestoreActivity = this.f16991b;
        if (backupAndRestoreActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f16991b = null;
        backupAndRestoreActivity.toolbar = null;
        backupAndRestoreActivity.appbarToolbar = null;
        backupAndRestoreActivity.btSaveChanges = null;
        backupAndRestoreActivity.btnBackPlayerselection = null;
        backupAndRestoreActivity.date = null;
        backupAndRestoreActivity.time = null;
        backupAndRestoreActivity.logo = null;
        this.f16992c.setOnClickListener(null);
        this.f16992c = null;
        this.f16993d.setOnClickListener(null);
        this.f16993d = null;
    }
}

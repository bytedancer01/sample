package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import androidx.appcompat.app.ActivityC0243b;
import androidx.core.content.FileProvider;
import java.io.File;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayRecordingExternalPlayerActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayRecordingExternalPlayerActivity.class */
public class PlayRecordingExternalPlayerActivity extends ActivityC0243b {

    /* renamed from: d */
    public String f17929d;

    /* renamed from: e */
    public Context f17930e;

    /* renamed from: f */
    public String f17931f = "";

    /* renamed from: g */
    public String f17932g = "";

    /* renamed from: h */
    public String f17933h = "";

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayRecordingExternalPlayerActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayRecordingExternalPlayerActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayRecordingExternalPlayerActivity$a.class */
    public class DialogInterfaceOnClickListenerC2910a implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final PlayRecordingExternalPlayerActivity f17934b;

        public DialogInterfaceOnClickListenerC2910a(PlayRecordingExternalPlayerActivity playRecordingExternalPlayerActivity) {
            this.f17934b = playRecordingExternalPlayerActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            try {
                this.f17934b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this.f17934b.f17931f)));
            } catch (ActivityNotFoundException e10) {
                try {
                    this.f17934b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + this.f17934b.f17931f)));
                } catch (ActivityNotFoundException e11) {
                    C5255e.m26241k0(this.f17934b.f17930e, String.valueOf(e11));
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayRecordingExternalPlayerActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayRecordingExternalPlayerActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayRecordingExternalPlayerActivity$b.class */
    public class DialogInterfaceOnClickListenerC2911b implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final PlayRecordingExternalPlayerActivity f17935b;

        public DialogInterfaceOnClickListenerC2911b(PlayRecordingExternalPlayerActivity playRecordingExternalPlayerActivity) {
            this.f17935b = playRecordingExternalPlayerActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            this.f17935b.finish();
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m16214t0();
        m16215u0();
        getWindow().setFlags(1024, 1024);
    }

    /* renamed from: s0 */
    public final boolean m16213s0(String str) {
        Context context = this.f17930e;
        if (context == null) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException e10) {
            return false;
        }
    }

    /* renamed from: t0 */
    public final void m16214t0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: u0 */
    public final void m16215u0() {
        this.f17930e = this;
        this.f17931f = getIntent().getStringExtra("packagename");
        this.f17932g = this.f17931f + ".ActivityScreen";
        this.f17933h = getIntent().getStringExtra("app_name");
        this.f17929d = getIntent().getStringExtra("url");
        if (m16213s0(this.f17931f)) {
            if (this.f17930e == null) {
                return;
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage(this.f17931f);
                intent.setDataAndType(Uri.parse("file://" + this.f17929d), "video/*");
                intent.addFlags(1);
                startActivity(intent);
                overridePendingTransition(2130772003, 2130772000);
                finish();
                return;
            } catch (ActivityNotFoundException | Exception e10) {
            } catch (Exception e11) {
                File file = new File(this.f17929d);
                Uri m1874e = FileProvider.m1874e(this.f17930e, this.f17930e.getApplicationContext().getPackageName() + ".provider", file);
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setPackage(this.f17931f);
                intent2.setDataAndType(m1874e, "video/*");
                intent2.addFlags(1);
                startActivity(intent2);
                overridePendingTransition(2130772003, 2130772000);
                finish();
                return;
            }
        }
        m16216v0();
    }

    /* renamed from: v0 */
    public void m16216v0() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getResources().getString(2132018032));
        builder.setMessage(this.f17933h + " " + getResources().getString(2132017295));
        builder.setPositiveButton(getResources().getString(2132017867), new DialogInterfaceOnClickListenerC2910a(this));
        builder.setNegativeButton(getResources().getString(2132017389), new DialogInterfaceOnClickListenerC2911b(this));
        builder.setCancelable(false);
        builder.create().show();
    }
}

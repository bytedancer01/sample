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
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayExternalPlayerActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayExternalPlayerActivity.class */
public class PlayExternalPlayerActivity extends ActivityC0243b {

    /* renamed from: d */
    public String f17922d;

    /* renamed from: e */
    public Context f17923e;

    /* renamed from: f */
    public String f17924f = "";

    /* renamed from: g */
    public String f17925g = "";

    /* renamed from: h */
    public String f17926h = "";

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayExternalPlayerActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayExternalPlayerActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayExternalPlayerActivity$a.class */
    public class DialogInterfaceOnClickListenerC2908a implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final PlayExternalPlayerActivity f17927b;

        public DialogInterfaceOnClickListenerC2908a(PlayExternalPlayerActivity playExternalPlayerActivity) {
            this.f17927b = playExternalPlayerActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            try {
                this.f17927b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this.f17927b.f17924f)));
            } catch (ActivityNotFoundException e10) {
                try {
                    this.f17927b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + this.f17927b.f17924f)));
                } catch (ActivityNotFoundException e11) {
                    C5255e.m26241k0(this.f17927b.f17923e, String.valueOf(e11));
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayExternalPlayerActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.PlayExternalPlayerActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/PlayExternalPlayerActivity$b.class */
    public class DialogInterfaceOnClickListenerC2909b implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final PlayExternalPlayerActivity f17928b;

        public DialogInterfaceOnClickListenerC2909b(PlayExternalPlayerActivity playExternalPlayerActivity) {
            this.f17928b = playExternalPlayerActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            this.f17928b.finish();
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m16208t0();
        m16209u0();
        getWindow().setFlags(1024, 1024);
    }

    /* renamed from: s0 */
    public final boolean m16207s0(String str) {
        Context context = this.f17923e;
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
    public final void m16208t0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: u0 */
    public final void m16209u0() {
        this.f17923e = this;
        this.f17924f = getIntent().getStringExtra("packagename");
        this.f17925g = this.f17924f + ".ActivityScreen";
        this.f17926h = getIntent().getStringExtra("app_name");
        this.f17922d = getIntent().getStringExtra("url");
        if (m16207s0(this.f17924f)) {
            if (this.f17923e == null) {
                return;
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage(this.f17924f);
                intent.setDataAndType(Uri.parse(this.f17922d), "video/*");
                intent.addFlags(1);
                startActivity(intent);
                overridePendingTransition(2130772003, 2130772000);
                finish();
                return;
            } catch (ActivityNotFoundException | Exception e10) {
            } catch (Exception e11) {
                File file = new File(this.f17922d);
                Uri m1874e = FileProvider.m1874e(this.f17923e, this.f17923e.getApplicationContext().getPackageName() + ".provider", file);
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setPackage(this.f17924f);
                intent2.setDataAndType(m1874e, "video/*");
                intent2.addFlags(1);
                startActivity(intent2);
                overridePendingTransition(2130772003, 2130772000);
                finish();
                return;
            }
        }
        m16210v0();
    }

    /* renamed from: v0 */
    public void m16210v0() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getResources().getString(2132018032));
        builder.setMessage(this.f17926h + " " + getResources().getString(2132017295));
        builder.setPositiveButton(getResources().getString(2132017867), new DialogInterfaceOnClickListenerC2908a(this));
        builder.setNegativeButton(getResources().getString(2132017389), new DialogInterfaceOnClickListenerC2909b(this));
        builder.setCancelable(false);
        builder.create().show();
    }
}

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
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MxPlayerRecordingActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MxPlayerRecordingActivity.class */
public class MxPlayerRecordingActivity extends ActivityC0243b {

    /* renamed from: d */
    public String f17735d;

    /* renamed from: e */
    public Uri f17736e;

    /* renamed from: f */
    public Context f17737f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MxPlayerRecordingActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.MxPlayerRecordingActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MxPlayerRecordingActivity$a.class */
    public class DialogInterfaceOnClickListenerC2861a implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final MxPlayerRecordingActivity f17738b;

        public DialogInterfaceOnClickListenerC2861a(MxPlayerRecordingActivity mxPlayerRecordingActivity) {
            this.f17738b = mxPlayerRecordingActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            try {
                this.f17738b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.mxtech.videoplayer.ad")));
            } catch (ActivityNotFoundException e10) {
                try {
                    this.f17738b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=com.mxtech.videoplayer.ad")));
                } catch (ActivityNotFoundException e11) {
                    C5255e.m26241k0(this.f17738b.f17737f, String.valueOf(e11));
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MxPlayerRecordingActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.MxPlayerRecordingActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/MxPlayerRecordingActivity$b.class */
    public class DialogInterfaceOnClickListenerC2862b implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final MxPlayerRecordingActivity f17739b;

        public DialogInterfaceOnClickListenerC2862b(MxPlayerRecordingActivity mxPlayerRecordingActivity) {
            this.f17739b = mxPlayerRecordingActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            this.f17739b.finish();
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m16076s0();
        m16077t0();
        getWindow().setFlags(1024, 1024);
    }

    /* renamed from: r0 */
    public final boolean m16075r0(String str) {
        Context context = this.f17737f;
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

    /* renamed from: s0 */
    public final void m16076s0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: t0 */
    public final void m16077t0() {
        this.f17737f = this;
        String stringExtra = getIntent().getStringExtra("VIDEO_PATH");
        this.f17735d = stringExtra;
        this.f17736e = Uri.parse(stringExtra);
        try {
            if (!m16075r0("com.mxtech.videoplayer.pro")) {
                Intent intent = new Intent();
                intent.setClassName("com.mxtech.videoplayer.ad", "com.mxtech.videoplayer.ad.ActivityScreen");
                intent.putExtra("package", getPackageName());
                intent.setDataAndType(this.f17736e, "application/x-mpegURL");
                startActivity(intent);
            } else {
                if (this.f17737f == null) {
                    return;
                }
                Intent intent2 = new Intent();
                intent2.setClassName("com.mxtech.videoplayer.pro", "com.mxtech.videoplayer.pro.ActivityScreen");
                intent2.putExtra("package", getPackageName());
                intent2.setDataAndType(this.f17736e, "application/x-mpegURL");
                intent2.setPackage("com.mxtech.videoplayer.pro");
                startActivity(intent2);
                overridePendingTransition(2130772003, 2130772000);
            }
            finish();
        } catch (ActivityNotFoundException e10) {
            m16078u0();
        }
    }

    /* renamed from: u0 */
    public void m16078u0() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getResources().getString(2132018032));
        builder.setMessage(getResources().getString(2132017294));
        builder.setPositiveButton(getResources().getString(2132017867), new DialogInterfaceOnClickListenerC2861a(this));
        builder.setNegativeButton(getResources().getString(2132017389), new DialogInterfaceOnClickListenerC2862b(this));
        builder.setCancelable(false);
        builder.create().show();
    }
}

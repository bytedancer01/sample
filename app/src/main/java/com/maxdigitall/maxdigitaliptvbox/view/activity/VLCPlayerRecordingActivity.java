package com.maxdigitall.maxdigitaliptvbox.view.activity;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import androidx.appcompat.app.ActivityC0243b;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p050d0.C4290b;
import p151if.C5255e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VLCPlayerRecordingActivity.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VLCPlayerRecordingActivity.class */
public class VLCPlayerRecordingActivity extends ActivityC0243b {

    /* renamed from: d */
    public String f19110d;

    /* renamed from: e */
    public Context f19111e;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VLCPlayerRecordingActivity$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VLCPlayerRecordingActivity$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VLCPlayerRecordingActivity$a.class */
    public class DialogInterfaceOnClickListenerC3232a implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VLCPlayerRecordingActivity f19112b;

        public DialogInterfaceOnClickListenerC3232a(VLCPlayerRecordingActivity vLCPlayerRecordingActivity) {
            this.f19112b = vLCPlayerRecordingActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            try {
                this.f19112b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=org.videolan.vlc")));
            } catch (ActivityNotFoundException e10) {
                try {
                    this.f19112b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=org.videolan.vlc")));
                } catch (ActivityNotFoundException e11) {
                    C5255e.m26241k0(this.f19112b.f19111e, String.valueOf(e11));
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VLCPlayerRecordingActivity$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.activity.VLCPlayerRecordingActivity$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/activity/VLCPlayerRecordingActivity$b.class */
    public class DialogInterfaceOnClickListenerC3233b implements DialogInterface.OnClickListener {

        /* renamed from: b */
        public final VLCPlayerRecordingActivity f19113b;

        public DialogInterfaceOnClickListenerC3233b(VLCPlayerRecordingActivity vLCPlayerRecordingActivity) {
            this.f19113b = vLCPlayerRecordingActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            this.f19113b.finish();
        }
    }

    @Override // androidx.fragment.app.ActivityC0416e, androidx.activity.ComponentActivity, p030c0.ActivityC0952l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m16771r0();
        m16772s0();
        getWindow().setFlags(1024, 1024);
    }

    /* renamed from: r0 */
    public final void m16771r0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        window.setStatusBarColor(C4290b.m21724c(this, 2131099776));
    }

    /* renamed from: s0 */
    public final void m16772s0() {
        this.f19111e = this;
        String stringExtra = getIntent().getStringExtra("VIDEO_PATH");
        this.f19110d = stringExtra;
        try {
            Uri parse = Uri.parse(stringExtra);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setPackage("org.videolan.vlc");
            intent.setDataAndTypeAndNormalize(parse, "video/*");
            startActivityForResult(intent, 42);
            overridePendingTransition(2130772003, 2130772000);
            finish();
        } catch (ActivityNotFoundException e10) {
            m16773t0();
        }
    }

    /* renamed from: t0 */
    public void m16773t0() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getResources().getString(2132018032));
        builder.setMessage(getResources().getString(2132017296));
        builder.setPositiveButton(getResources().getString(2132017867), new DialogInterfaceOnClickListenerC3232a(this));
        builder.setNegativeButton(getResources().getString(2132017389), new DialogInterfaceOnClickListenerC3233b(this));
        builder.setCancelable(false);
        builder.create().show();
    }
}

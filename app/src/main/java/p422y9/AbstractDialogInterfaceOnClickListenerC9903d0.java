package p422y9;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import p383w9.InterfaceC9467h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/d0.class
 */
/* renamed from: y9.d0 */
/* loaded from: combined.jar:classes2.jar:y9/d0.class */
public abstract class AbstractDialogInterfaceOnClickListenerC9903d0 implements DialogInterface.OnClickListener {
    /* renamed from: b */
    public static AbstractDialogInterfaceOnClickListenerC9903d0 m41780b(Activity activity, Intent intent, int i10) {
        return new C9897b0(intent, activity, i10);
    }

    /* renamed from: c */
    public static AbstractDialogInterfaceOnClickListenerC9903d0 m41781c(InterfaceC9467h interfaceC9467h, Intent intent, int i10) {
        return new C9900c0(intent, interfaceC9467h, 2);
    }

    /* renamed from: a */
    public abstract void mo41762a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        try {
            mo41762a();
        } catch (ActivityNotFoundException e10) {
            Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e10);
        } finally {
            dialogInterface.dismiss();
        }
    }
}

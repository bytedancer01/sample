package p350u9;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.AbstractC0428n;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0414d;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:u9/n.class
 */
/* renamed from: u9.n */
/* loaded from: combined.jar:classes2.jar:u9/n.class */
public class C8827n extends DialogInterfaceOnCancelListenerC0414d {

    /* renamed from: r */
    public Dialog f40871r;

    /* renamed from: s */
    public DialogInterface.OnCancelListener f40872s;

    /* renamed from: t */
    public Dialog f40873t;

    /* renamed from: N */
    public static C8827n m37730N(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C8827n c8827n = new C8827n();
        Dialog dialog2 = (Dialog) C9935o.m41851k(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        c8827n.f40871r = dialog2;
        if (onCancelListener != null) {
            c8827n.f40872s = onCancelListener;
        }
        return c8827n;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0414d
    /* renamed from: M */
    public void mo2024M(AbstractC0428n abstractC0428n, String str) {
        super.mo2024M(abstractC0428n, str);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0414d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f40872s;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0414d
    /* renamed from: x */
    public Dialog mo2029x(Bundle bundle) {
        Dialog dialog = this.f40871r;
        Dialog dialog2 = dialog;
        if (dialog == null) {
            m2021G(false);
            if (this.f40873t == null) {
                this.f40873t = new AlertDialog.Builder((Context) C9935o.m41850j(getContext())).create();
            }
            dialog2 = this.f40873t;
        }
        return dialog2;
    }
}

package p350u9;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:u9/c.class
 */
/* renamed from: u9.c */
/* loaded from: combined.jar:classes2.jar:u9/c.class */
public class DialogFragmentC8806c extends DialogFragment {

    /* renamed from: b */
    public Dialog f40830b;

    /* renamed from: c */
    public DialogInterface.OnCancelListener f40831c;

    /* renamed from: d */
    public Dialog f40832d;

    /* renamed from: a */
    public static DialogFragmentC8806c m37671a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC8806c dialogFragmentC8806c = new DialogFragmentC8806c();
        Dialog dialog2 = (Dialog) C9935o.m41851k(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC8806c.f40830b = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC8806c.f40831c = onCancelListener;
        }
        return dialogFragmentC8806c;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f40831c;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f40830b;
        Dialog dialog2 = dialog;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f40832d == null) {
                this.f40832d = new AlertDialog.Builder((Context) C9935o.m41850j(getActivity())).create();
            }
            dialog2 = this.f40832d;
        }
        return dialog2;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}

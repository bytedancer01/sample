package p230n9;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n9/p0.class
 */
/* renamed from: n9.p0 */
/* loaded from: combined.jar:classes2.jar:n9/p0.class */
public final class DialogInterfaceOnClickListenerC6736p0 implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final C6723j f35206b;

    public DialogInterfaceOnClickListenerC6736p0(C6723j c6723j) {
        this.f35206b = c6723j;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        Dialog dialog;
        Dialog dialog2;
        C6723j c6723j = this.f35206b;
        dialog = c6723j.f35178v;
        if (dialog != null) {
            dialog2 = c6723j.f35178v;
            dialog2.cancel();
            this.f35206b.f35178v = null;
        }
    }
}

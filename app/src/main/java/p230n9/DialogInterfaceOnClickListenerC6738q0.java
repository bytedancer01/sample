package p230n9;

import android.content.DialogInterface;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n9/q0.class
 */
/* renamed from: n9.q0 */
/* loaded from: combined.jar:classes2.jar:n9/q0.class */
public final class DialogInterfaceOnClickListenerC6738q0 implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final ViewOnClickListenerC6744t0 f35210b;

    /* renamed from: c */
    public final ViewOnClickListenerC6744t0 f35211c;

    /* renamed from: d */
    public final C6723j f35212d;

    public DialogInterfaceOnClickListenerC6738q0(C6723j c6723j, ViewOnClickListenerC6744t0 viewOnClickListenerC6744t0, ViewOnClickListenerC6744t0 viewOnClickListenerC6744t02) {
        this.f35212d = c6723j;
        this.f35210b = viewOnClickListenerC6744t0;
        this.f35211c = viewOnClickListenerC6744t02;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        C6723j.m31044T(this.f35212d, this.f35210b, this.f35211c);
    }
}

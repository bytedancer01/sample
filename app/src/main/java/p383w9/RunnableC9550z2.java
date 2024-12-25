package p383w9;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;
import p350u9.C8804b;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/z2.class
 */
/* renamed from: w9.z2 */
/* loaded from: combined.jar:classes2.jar:w9/z2.class */
public final class RunnableC9550z2 implements Runnable {

    /* renamed from: b */
    public final C9542x2 f43512b;

    /* renamed from: c */
    public final AbstractDialogInterfaceOnCancelListenerC9441b3 f43513c;

    public RunnableC9550z2(AbstractDialogInterfaceOnCancelListenerC9441b3 abstractDialogInterfaceOnCancelListenerC9441b3, C9542x2 c9542x2) {
        this.f43513c = abstractDialogInterfaceOnCancelListenerC9441b3;
        this.f43512b = c9542x2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f43513c.f43212c) {
            C8804b m40078b = this.f43512b.m40078b();
            if (m40078b.m37662S()) {
                AbstractDialogInterfaceOnCancelListenerC9441b3 abstractDialogInterfaceOnCancelListenerC9441b3 = this.f43513c;
                abstractDialogInterfaceOnCancelListenerC9441b3.f14831b.startActivityForResult(GoogleApiActivity.m13104a(abstractDialogInterfaceOnCancelListenerC9441b3.m13156b(), (PendingIntent) C9935o.m41850j(m40078b.m37661R()), this.f43512b.m40077a(), false), 1);
                return;
            }
            AbstractDialogInterfaceOnCancelListenerC9441b3 abstractDialogInterfaceOnCancelListenerC9441b32 = this.f43513c;
            if (abstractDialogInterfaceOnCancelListenerC9441b32.f43215f.mo37677d(abstractDialogInterfaceOnCancelListenerC9441b32.m13156b(), m40078b.m37659P(), null) != null) {
                AbstractDialogInterfaceOnCancelListenerC9441b3 abstractDialogInterfaceOnCancelListenerC9441b33 = this.f43513c;
                abstractDialogInterfaceOnCancelListenerC9441b33.f43215f.m37693z(abstractDialogInterfaceOnCancelListenerC9441b33.m13156b(), this.f43513c.f14831b, m40078b.m37659P(), 2, this.f43513c);
            } else {
                if (m40078b.m37659P() != 18) {
                    this.f43513c.m39804l(m40078b, this.f43512b.m40077a());
                    return;
                }
                AbstractDialogInterfaceOnCancelListenerC9441b3 abstractDialogInterfaceOnCancelListenerC9441b34 = this.f43513c;
                Dialog m37688u = abstractDialogInterfaceOnCancelListenerC9441b34.f43215f.m37688u(abstractDialogInterfaceOnCancelListenerC9441b34.m13156b(), this.f43513c);
                AbstractDialogInterfaceOnCancelListenerC9441b3 abstractDialogInterfaceOnCancelListenerC9441b35 = this.f43513c;
                abstractDialogInterfaceOnCancelListenerC9441b35.f43215f.m37689v(abstractDialogInterfaceOnCancelListenerC9441b35.m13156b().getApplicationContext(), new C9546y2(this, m37688u));
            }
        }
    }
}

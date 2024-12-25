package p422y9;

import android.app.Activity;
import android.content.Intent;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/b0.class
 */
/* renamed from: y9.b0 */
/* loaded from: combined.jar:classes2.jar:y9/b0.class */
public final class C9897b0 extends AbstractDialogInterfaceOnClickListenerC9903d0 {

    /* renamed from: b */
    public final Intent f45517b;

    /* renamed from: c */
    public final Activity f45518c;

    /* renamed from: d */
    public final int f45519d;

    public C9897b0(Intent intent, Activity activity, int i10) {
        this.f45517b = intent;
        this.f45518c = activity;
        this.f45519d = i10;
    }

    @Override // p422y9.AbstractDialogInterfaceOnClickListenerC9903d0
    /* renamed from: a */
    public final void mo41762a() {
        Intent intent = this.f45517b;
        if (intent != null) {
            this.f45518c.startActivityForResult(intent, this.f45519d);
        }
    }
}

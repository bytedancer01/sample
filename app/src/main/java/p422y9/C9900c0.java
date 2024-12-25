package p422y9;

import android.content.Intent;
import p383w9.InterfaceC9467h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/c0.class
 */
/* renamed from: y9.c0 */
/* loaded from: combined.jar:classes2.jar:y9/c0.class */
public final class C9900c0 extends AbstractDialogInterfaceOnClickListenerC9903d0 {

    /* renamed from: b */
    public final Intent f45523b;

    /* renamed from: c */
    public final InterfaceC9467h f45524c;

    public C9900c0(Intent intent, InterfaceC9467h interfaceC9467h, int i10) {
        this.f45523b = intent;
        this.f45524c = interfaceC9467h;
    }

    @Override // p422y9.AbstractDialogInterfaceOnClickListenerC9903d0
    /* renamed from: a */
    public final void mo41762a() {
        Intent intent = this.f45523b;
        if (intent != null) {
            this.f45524c.startActivityForResult(intent, 2);
        }
    }
}

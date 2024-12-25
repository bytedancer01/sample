package ua;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/l8.class
 */
/* renamed from: ua.l8 */
/* loaded from: combined.jar:classes2.jar:ua/l8.class */
public final class RunnableC8981l8 implements Runnable {

    /* renamed from: b */
    public final AtomicReference f41295b;

    /* renamed from: c */
    public final String f41296c;

    /* renamed from: d */
    public final String f41297d;

    /* renamed from: e */
    public final C8959ja f41298e;

    /* renamed from: f */
    public final C9089u8 f41299f;

    public RunnableC8981l8(C9089u8 c9089u8, AtomicReference atomicReference, String str, String str2, String str3, C8959ja c8959ja) {
        this.f41299f = c9089u8;
        this.f41295b = atomicReference;
        this.f41296c = str2;
        this.f41297d = str3;
        this.f41298e = c8959ja;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        InterfaceC9024p3 interfaceC9024p3;
        AtomicReference atomicReference2;
        List<C8852b> mo38145S;
        synchronized (this.f41295b) {
            try {
                try {
                    interfaceC9024p3 = this.f41299f.f41679d;
                } finally {
                    this.f41295b.notify();
                }
            } catch (RemoteException e10) {
                this.f41299f.f41723a.mo37780c().m38408o().m38329d("(legacy) Failed to get conditional properties; remote exception", null, this.f41296c, e10);
                this.f41295b.set(Collections.emptyList());
                atomicReference = this.f41295b;
            }
            if (interfaceC9024p3 == null) {
                this.f41299f.f41723a.mo37780c().m38408o().m38329d("(legacy) Failed to get conditional properties; not connected to service", null, this.f41296c, this.f41297d);
                this.f41295b.set(Collections.emptyList());
                return;
            }
            if (TextUtils.isEmpty(null)) {
                C9935o.m41850j(this.f41298e);
                atomicReference2 = this.f41295b;
                mo38145S = interfaceC9024p3.mo38146X0(this.f41296c, this.f41297d, this.f41298e);
            } else {
                atomicReference2 = this.f41295b;
                mo38145S = interfaceC9024p3.mo38145S(null, this.f41296c, this.f41297d);
            }
            atomicReference2.set(mo38145S);
            this.f41299f.m38287D();
            atomicReference = this.f41295b;
            atomicReference.notify();
        }
    }
}

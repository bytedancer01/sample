package ua;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/n8.class
 */
/* renamed from: ua.n8 */
/* loaded from: combined.jar:classes2.jar:ua/n8.class */
public final class RunnableC9005n8 implements Runnable {

    /* renamed from: b */
    public final AtomicReference f41451b;

    /* renamed from: c */
    public final String f41452c;

    /* renamed from: d */
    public final String f41453d;

    /* renamed from: e */
    public final C8959ja f41454e;

    /* renamed from: f */
    public final boolean f41455f;

    /* renamed from: g */
    public final C9089u8 f41456g;

    public RunnableC9005n8(C9089u8 c9089u8, AtomicReference atomicReference, String str, String str2, String str3, C8959ja c8959ja, boolean z10) {
        this.f41456g = c9089u8;
        this.f41451b = atomicReference;
        this.f41452c = str2;
        this.f41453d = str3;
        this.f41454e = c8959ja;
        this.f41455f = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        InterfaceC9024p3 interfaceC9024p3;
        AtomicReference atomicReference2;
        List<C8851aa> mo38154w0;
        synchronized (this.f41451b) {
            try {
                try {
                    interfaceC9024p3 = this.f41456g.f41679d;
                } catch (RemoteException e10) {
                    this.f41456g.f41723a.mo37780c().m38408o().m38329d("(legacy) Failed to get user properties; remote exception", null, this.f41452c, e10);
                    this.f41451b.set(Collections.emptyList());
                    atomicReference = this.f41451b;
                }
                if (interfaceC9024p3 == null) {
                    this.f41456g.f41723a.mo37780c().m38408o().m38329d("(legacy) Failed to get user properties; not connected to service", null, this.f41452c, this.f41453d);
                    this.f41451b.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    C9935o.m41850j(this.f41454e);
                    atomicReference2 = this.f41451b;
                    mo38154w0 = interfaceC9024p3.mo38142D(this.f41452c, this.f41453d, this.f41455f, this.f41454e);
                } else {
                    atomicReference2 = this.f41451b;
                    mo38154w0 = interfaceC9024p3.mo38154w0(null, this.f41452c, this.f41453d, this.f41455f);
                }
                atomicReference2.set(mo38154w0);
                this.f41456g.m38287D();
                atomicReference = this.f41451b;
                atomicReference.notify();
            } finally {
                this.f41451b.notify();
            }
        }
    }
}

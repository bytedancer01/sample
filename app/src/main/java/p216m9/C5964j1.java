package p216m9;

import android.os.RemoteException;
import p200l9.C5745a2;
import p230n9.C6721i;
import p304r9.C8015b;
import p350u9.C8804b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:m9/j1.class
 */
/* renamed from: m9.j1 */
/* loaded from: combined.jar:classes2.jar:m9/j1.class */
public final class C5964j1 extends C5745a2 {

    /* renamed from: a */
    public final C5947e f33452a;

    public /* synthetic */ C5964j1(C5947e c5947e, C5961i1 c5961i1) {
        this.f33452a = c5947e;
    }

    @Override // p200l9.C5745a2
    /* renamed from: a */
    public final void mo28144a() {
        InterfaceC5936a0 interfaceC5936a0;
        C8015b c8015b;
        C6721i c6721i;
        InterfaceC5936a0 interfaceC5936a02;
        C6721i c6721i2;
        C5947e c5947e = this.f33452a;
        interfaceC5936a0 = c5947e.f33436f;
        if (interfaceC5936a0 != null) {
            try {
                c6721i = c5947e.f33441k;
                if (c6721i != null) {
                    c6721i2 = c5947e.f33441k;
                    c6721i2.m31011k0();
                }
                interfaceC5936a02 = this.f33452a.f33436f;
                interfaceC5936a02.mo29233t(null);
            } catch (RemoteException e10) {
                c8015b = C5947e.f33433o;
                c8015b.m34874b(e10, "Unable to call %s on %s.", "onConnected", InterfaceC5936a0.class.getSimpleName());
            }
        }
    }

    @Override // p200l9.C5745a2
    /* renamed from: b */
    public final void mo28145b(int i10) {
        InterfaceC5936a0 interfaceC5936a0;
        C8015b c8015b;
        InterfaceC5936a0 interfaceC5936a02;
        C5947e c5947e = this.f33452a;
        interfaceC5936a0 = c5947e.f33436f;
        if (interfaceC5936a0 != null) {
            try {
                interfaceC5936a02 = c5947e.f33436f;
                interfaceC5936a02.mo29228Q(new C8804b(i10));
            } catch (RemoteException e10) {
                c8015b = C5947e.f33433o;
                c8015b.m34874b(e10, "Unable to call %s on %s.", "onConnectionFailed", InterfaceC5936a0.class.getSimpleName());
            }
        }
    }

    @Override // p200l9.C5745a2
    /* renamed from: c */
    public final void mo28146c(int i10) {
        InterfaceC5936a0 interfaceC5936a0;
        C8015b c8015b;
        InterfaceC5936a0 interfaceC5936a02;
        C5947e c5947e = this.f33452a;
        interfaceC5936a0 = c5947e.f33436f;
        if (interfaceC5936a0 != null) {
            try {
                interfaceC5936a02 = c5947e.f33436f;
                interfaceC5936a02.mo29231q(i10);
            } catch (RemoteException e10) {
                c8015b = C5947e.f33433o;
                c8015b.m34874b(e10, "Unable to call %s on %s.", "onConnectionSuspended", InterfaceC5936a0.class.getSimpleName());
            }
        }
    }

    @Override // p200l9.C5745a2
    /* renamed from: d */
    public final void mo28147d(int i10) {
        InterfaceC5936a0 interfaceC5936a0;
        C8015b c8015b;
        InterfaceC5936a0 interfaceC5936a02;
        C5947e c5947e = this.f33452a;
        interfaceC5936a0 = c5947e.f33436f;
        if (interfaceC5936a0 != null) {
            try {
                interfaceC5936a02 = c5947e.f33436f;
                interfaceC5936a02.mo29228Q(new C8804b(i10));
            } catch (RemoteException e10) {
                c8015b = C5947e.f33433o;
                c8015b.m34874b(e10, "Unable to call %s on %s.", "onDisconnected", InterfaceC5936a0.class.getSimpleName());
            }
        }
    }
}

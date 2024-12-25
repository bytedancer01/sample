package p383w9;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p350u9.C8804b;
import p350u9.C8812f;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/v2.class
 */
/* renamed from: w9.v2 */
/* loaded from: combined.jar:classes2.jar:w9/v2.class */
public final class C9534v2 extends AbstractDialogInterfaceOnCancelListenerC9441b3 {

    /* renamed from: g */
    public final SparseArray<C9530u2> f43471g;

    public C9534v2(InterfaceC9467h interfaceC9467h) {
        super(interfaceC9467h, C8812f.m37675q());
        this.f43471g = new SparseArray<>();
        this.f14831b.mo39917d("AutoManageHelper", this);
    }

    /* renamed from: t */
    public static C9534v2 m40059t(C9462g c9462g) {
        InterfaceC9467h m13154d = LifecycleCallback.m13154d(c9462g);
        C9534v2 c9534v2 = (C9534v2) m13154d.mo39918f("AutoManageHelper", C9534v2.class);
        return c9534v2 != null ? c9534v2 : new C9534v2(m13154d);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: a */
    public final void mo13155a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i10 = 0; i10 < this.f43471g.size(); i10++) {
            C9530u2 m40062w = m40062w(i10);
            if (m40062w != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(m40062w.f43462b);
                printWriter.println(":");
                m40062w.f43463c.mo13107d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // p383w9.AbstractDialogInterfaceOnCancelListenerC9441b3, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: j */
    public final void mo13162j() {
        super.mo13162j();
        boolean z10 = this.f43212c;
        String valueOf = String.valueOf(this.f43471g);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 14);
        sb2.append("onStart ");
        sb2.append(z10);
        sb2.append(" ");
        sb2.append(valueOf);
        Log.d("AutoManageHelper", sb2.toString());
        if (this.f43213d.get() == null) {
            for (int i10 = 0; i10 < this.f43471g.size(); i10++) {
                C9530u2 m40062w = m40062w(i10);
                if (m40062w != null) {
                    m40062w.f43463c.connect();
                }
            }
        }
    }

    @Override // p383w9.AbstractDialogInterfaceOnCancelListenerC9441b3, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: k */
    public final void mo13163k() {
        super.mo13163k();
        for (int i10 = 0; i10 < this.f43471g.size(); i10++) {
            C9530u2 m40062w = m40062w(i10);
            if (m40062w != null) {
                m40062w.f43463c.disconnect();
            }
        }
    }

    @Override // p383w9.AbstractDialogInterfaceOnCancelListenerC9441b3
    /* renamed from: m */
    public final void mo39805m(C8804b c8804b, int i10) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i10 < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        C9530u2 c9530u2 = this.f43471g.get(i10);
        if (c9530u2 != null) {
            m40061v(i10);
            GoogleApiClient.InterfaceC2413c interfaceC2413c = c9530u2.f43464d;
            if (interfaceC2413c != null) {
                interfaceC2413c.onConnectionFailed(c8804b);
            }
        }
    }

    @Override // p383w9.AbstractDialogInterfaceOnCancelListenerC9441b3
    /* renamed from: n */
    public final void mo39806n() {
        for (int i10 = 0; i10 < this.f43471g.size(); i10++) {
            C9530u2 m40062w = m40062w(i10);
            if (m40062w != null) {
                m40062w.f43463c.connect();
            }
        }
    }

    /* renamed from: u */
    public final void m40060u(int i10, GoogleApiClient googleApiClient, GoogleApiClient.InterfaceC2413c interfaceC2413c) {
        C9935o.m41851k(googleApiClient, "GoogleApiClient instance cannot be null");
        boolean z10 = this.f43471g.indexOfKey(i10) < 0;
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("Already managing a GoogleApiClient with id ");
        sb2.append(i10);
        C9935o.m41854n(z10, sb2.toString());
        C9542x2 c9542x2 = this.f43213d.get();
        boolean z11 = this.f43212c;
        String valueOf = String.valueOf(c9542x2);
        StringBuilder sb3 = new StringBuilder(valueOf.length() + 49);
        sb3.append("starting AutoManage for client ");
        sb3.append(i10);
        sb3.append(" ");
        sb3.append(z11);
        sb3.append(" ");
        sb3.append(valueOf);
        Log.d("AutoManageHelper", sb3.toString());
        C9530u2 c9530u2 = new C9530u2(this, i10, googleApiClient, interfaceC2413c);
        googleApiClient.mo13111h(c9530u2);
        this.f43471g.put(i10, c9530u2);
        if (this.f43212c && c9542x2 == null) {
            Log.d("AutoManageHelper", "connecting ".concat(googleApiClient.toString()));
            googleApiClient.connect();
        }
    }

    /* renamed from: v */
    public final void m40061v(int i10) {
        C9530u2 c9530u2 = this.f43471g.get(i10);
        this.f43471g.remove(i10);
        if (c9530u2 != null) {
            c9530u2.f43463c.mo13112i(c9530u2);
            c9530u2.f43463c.disconnect();
        }
    }

    /* renamed from: w */
    public final C9530u2 m40062w(int i10) {
        if (this.f43471g.size() <= i10) {
            return null;
        }
        SparseArray<C9530u2> sparseArray = this.f43471g;
        return sparseArray.get(sparseArray.keyAt(i10));
    }
}

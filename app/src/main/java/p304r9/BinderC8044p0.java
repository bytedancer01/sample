package p304r9;

import android.os.Handler;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;
import ma.HandlerC6385s1;
import p200l9.C5754d;
import p200l9.C5758e;
import p383w9.InterfaceC9447d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r9/p0.class
 */
/* renamed from: r9.p0 */
/* loaded from: combined.jar:classes2.jar:r9/p0.class */
public final class BinderC8044p0 extends AbstractBinderC8031j {

    /* renamed from: b */
    public final AtomicReference f38848b;

    /* renamed from: c */
    public final Handler f38849c;

    public BinderC8044p0(C8046q0 c8046q0) {
        this.f38848b = new AtomicReference(c8046q0);
        this.f38849c = new HandlerC6385s1(c8046q0.getLooper());
    }

    @Override // p304r9.InterfaceC8033k
    /* renamed from: E */
    public final void mo28361E(String str, long j10, int i10) {
        C8046q0 c8046q0 = (C8046q0) this.f38848b.get();
        if (c8046q0 == null) {
            return;
        }
        c8046q0.m34931s(j10, i10);
    }

    @Override // p304r9.InterfaceC8033k
    /* renamed from: d0 */
    public final void mo28362d0(int i10) {
    }

    @Override // p304r9.InterfaceC8033k
    /* renamed from: h0 */
    public final void mo28363h0(String str, double d10, boolean z10) {
        C8015b c8015b;
        c8015b = C8046q0.f38851y;
        c8015b.m34873a("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override // p304r9.InterfaceC8033k
    /* renamed from: h1 */
    public final void mo28364h1(String str, long j10) {
        C8046q0 c8046q0 = (C8046q0) this.f38848b.get();
        if (c8046q0 == null) {
            return;
        }
        c8046q0.m34931s(j10, 0);
    }

    @Override // p304r9.InterfaceC8033k
    /* renamed from: j0 */
    public final void mo28365j0(C8017c c8017c) {
        C8015b c8015b;
        C8046q0 c8046q0 = (C8046q0) this.f38848b.get();
        if (c8046q0 == null) {
            return;
        }
        c8015b = C8046q0.f38851y;
        c8015b.m34873a("onApplicationStatusChanged", new Object[0]);
        this.f38849c.post(new RunnableC8040n0(this, c8046q0, c8017c));
    }

    @Override // p304r9.InterfaceC8033k
    /* renamed from: k0 */
    public final void mo28366k0(C5754d c5754d, String str, String str2, boolean z10) {
        Object obj;
        InterfaceC9447d interfaceC9447d;
        InterfaceC9447d interfaceC9447d2;
        C8046q0 c8046q0 = (C8046q0) this.f38848b.get();
        if (c8046q0 == null) {
            return;
        }
        c8046q0.f38853b = c5754d;
        c8046q0.f38870s = c5754d.m28170P();
        c8046q0.f38871t = str2;
        c8046q0.f38860i = str;
        obj = C8046q0.f38852z;
        synchronized (obj) {
            interfaceC9447d = c8046q0.f38874w;
            if (interfaceC9447d != null) {
                interfaceC9447d2 = c8046q0.f38874w;
                interfaceC9447d2.mo13164a(new C8034k0(new Status(0), c5754d, str, str2, z10));
                c8046q0.f38874w = null;
            }
        }
    }

    @Override // p304r9.InterfaceC8033k
    /* renamed from: m */
    public final void mo28367m(int i10) {
        C8046q0 c8046q0 = (C8046q0) this.f38848b.get();
        if (c8046q0 == null) {
            return;
        }
        c8046q0.m34932t(i10);
    }

    @Override // p304r9.InterfaceC8033k
    /* renamed from: n */
    public final void mo28368n(int i10) {
        C8046q0 c8046q0 = (C8046q0) this.f38848b.get();
        if (c8046q0 == null) {
            return;
        }
        c8046q0.m34932t(i10);
    }

    @Override // p304r9.InterfaceC8033k
    /* renamed from: p1 */
    public final void mo28369p1(int i10) {
    }

    @Override // p304r9.InterfaceC8033k
    /* renamed from: s */
    public final void mo28370s(int i10) {
        C5758e.d dVar;
        C8046q0 c8046q0 = (C8046q0) this.f38848b.get();
        if (c8046q0 == null) {
            return;
        }
        c8046q0.f38870s = null;
        c8046q0.f38871t = null;
        c8046q0.m34932t(i10);
        dVar = c8046q0.f38855d;
        if (dVar != null) {
            this.f38849c.post(new RunnableC8036l0(this, c8046q0, i10));
        }
    }

    @Override // p304r9.InterfaceC8033k
    /* renamed from: u */
    public final void mo28371u(int i10) {
        C8046q0 c8046q0 = (C8046q0) this.f38848b.get();
        if (c8046q0 == null) {
            return;
        }
        c8046q0.m34928p(i10);
    }

    @Override // p304r9.InterfaceC8033k
    /* renamed from: u1 */
    public final void mo28372u1(C8021e c8021e) {
        C8015b c8015b;
        C8046q0 c8046q0 = (C8046q0) this.f38848b.get();
        if (c8046q0 == null) {
            return;
        }
        c8015b = C8046q0.f38851y;
        c8015b.m34873a("onDeviceStatusChanged", new Object[0]);
        this.f38849c.post(new RunnableC8038m0(this, c8046q0, c8021e));
    }

    @Override // p304r9.InterfaceC8033k
    /* renamed from: v1 */
    public final void mo28373v1(String str, byte[] bArr) {
        C8015b c8015b;
        if (((C8046q0) this.f38848b.get()) == null) {
            return;
        }
        c8015b = C8046q0.f38851y;
        c8015b.m34873a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // p304r9.InterfaceC8033k
    /* renamed from: x */
    public final void mo28374x(int i10) {
        C8015b c8015b;
        C8046q0 m34911y0 = m34911y0();
        if (m34911y0 == null) {
            return;
        }
        c8015b = C8046q0.f38851y;
        c8015b.m34873a("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i10));
        if (i10 != 0) {
            m34911y0.triggerConnectionSuspended(2);
        }
    }

    @Override // p304r9.InterfaceC8033k
    /* renamed from: y */
    public final void mo28375y(String str, String str2) {
        C8015b c8015b;
        C8046q0 c8046q0 = (C8046q0) this.f38848b.get();
        if (c8046q0 == null) {
            return;
        }
        c8015b = C8046q0.f38851y;
        c8015b.m34873a("Receive (type=text, ns=%s) %s", str, str2);
        this.f38849c.post(new RunnableC8042o0(this, c8046q0, str, str2));
    }

    /* renamed from: y0 */
    public final C8046q0 m34911y0() {
        C8046q0 c8046q0 = (C8046q0) this.f38848b.getAndSet(null);
        if (c8046q0 == null) {
            return null;
        }
        c8046q0.m34929q();
        return c8046q0;
    }
}

package p216m9;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import ma.BinderC6069d0;
import ma.C6131g;
import org.checkerframework.dataflow.qual.Pure;
import p200l9.C5754d;
import p200l9.C5758e;
import p200l9.C5816w0;
import p200l9.InterfaceC5749b2;
import p230n9.C6698a;
import p230n9.C6719h;
import p230n9.C6721i;
import p244o9.C6952v;
import p304r9.C8015b;
import p304r9.C8048r0;
import p304r9.C8049s;
import p368v9.C9315a;
import p383w9.AbstractC9515r;
import p383w9.InterfaceC9502o;
import p422y9.C9935o;
import za.AbstractC10144i;
import za.C10146j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:m9/e.class
 */
/* renamed from: m9.e */
/* loaded from: combined.jar:classes2.jar:m9/e.class */
public class C5947e extends AbstractC5989s {

    /* renamed from: o */
    public static final C8015b f33433o = new C8015b("CastSession");

    /* renamed from: d */
    public final Context f33434d;

    /* renamed from: e */
    public final Set f33435e;

    /* renamed from: f */
    public final InterfaceC5936a0 f33436f;

    /* renamed from: g */
    public final C5941c f33437g;

    /* renamed from: h */
    public final BinderC6069d0 f33438h;

    /* renamed from: i */
    public final C6952v f33439i;

    /* renamed from: j */
    public InterfaceC5749b2 f33440j;

    /* renamed from: k */
    public C6721i f33441k;

    /* renamed from: l */
    public CastDevice f33442l;

    /* renamed from: m */
    public C5758e.a f33443m;

    /* renamed from: n */
    public final C5940b1 f33444n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5947e(Context context, String str, String str2, C5941c c5941c, BinderC6069d0 binderC6069d0, C6952v c6952v) {
        super(context, str, str2);
        C5940b1 c5940b1 = new Object() { // from class: m9.b1
        };
        this.f33435e = new HashSet();
        this.f33434d = context.getApplicationContext();
        this.f33437g = c5941c;
        this.f33438h = binderC6069d0;
        this.f33439i = c6952v;
        this.f33444n = c5940b1;
        this.f33436f = C6131g.m29613b(context, c5941c, m29355o(), new BinderC5952f1(this, null));
    }

    /* renamed from: A */
    public static /* bridge */ /* synthetic */ void m29272A(C5947e c5947e, int i10) {
        c5947e.f33439i.m31927i(i10);
        InterfaceC5749b2 interfaceC5749b2 = c5947e.f33440j;
        if (interfaceC5749b2 != null) {
            interfaceC5749b2.mo28157d();
            c5947e.f33440j = null;
        }
        c5947e.f33442l = null;
        C6721i c6721i = c5947e.f33441k;
        if (c6721i != null) {
            c6721i.m31015m0(null);
            c5947e.f33441k = null;
        }
        c5947e.f33443m = null;
    }

    /* renamed from: B */
    public static /* bridge */ /* synthetic */ void m29273B(C5947e c5947e, String str, AbstractC10144i abstractC10144i) {
        if (c5947e.f33436f == null) {
            return;
        }
        try {
            if (abstractC10144i.mo42567p()) {
                C5758e.a aVar = (C5758e.a) abstractC10144i.mo42563l();
                c5947e.f33443m = aVar;
                if (aVar.mo13127w() != null && aVar.mo13127w().m13125T()) {
                    f33433o.m34873a("%s() -> success result", str);
                    C6721i c6721i = new C6721i(new C8049s(null));
                    c5947e.f33441k = c6721i;
                    c6721i.m31015m0(c5947e.f33440j);
                    c5947e.f33441k.m31011k0();
                    c5947e.f33439i.m31926h(c5947e.f33441k, c5947e.m29289q());
                    c5947e.f33436f.mo29229R0((C5754d) C9935o.m41850j(aVar.mo28178H()), aVar.mo28177B(), (String) C9935o.m41850j(aVar.getSessionId()), aVar.mo28176A());
                    return;
                }
                if (aVar.mo13127w() != null) {
                    f33433o.m34873a("%s() -> failure result", str);
                    c5947e.f33436f.mo29230m(aVar.mo13127w().m13122Q());
                    return;
                }
            } else {
                Exception mo42562k = abstractC10144i.mo42562k();
                if (mo42562k instanceof C9315a) {
                    c5947e.f33436f.mo29230m(((C9315a) mo42562k).m39314b());
                    return;
                }
            }
            c5947e.f33436f.mo29230m(2476);
        } catch (RemoteException e10) {
            f33433o.m34874b(e10, "Unable to call %s on %s.", "methods", InterfaceC5936a0.class.getSimpleName());
        }
    }

    /* renamed from: C */
    public final boolean m29279C() {
        return this.f33438h.m29520E1();
    }

    /* renamed from: D */
    public final void m29280D(Bundle bundle) {
        CastDevice m13037S = CastDevice.m13037S(bundle);
        this.f33442l = m13037S;
        if (m13037S == null) {
            if (m29350e()) {
                m29351f(2153);
                return;
            } else {
                m29352g(2151);
                return;
            }
        }
        InterfaceC5749b2 interfaceC5749b2 = this.f33440j;
        if (interfaceC5749b2 != null) {
            interfaceC5749b2.mo28157d();
            this.f33440j = null;
        }
        boolean z10 = true;
        f33433o.m34873a("Acquiring a connection to Google Play Services for %s", this.f33442l);
        CastDevice castDevice = (CastDevice) C9935o.m41850j(this.f33442l);
        Bundle bundle2 = new Bundle();
        C5941c c5941c = this.f33437g;
        C6698a m29251P = c5941c == null ? null : c5941c.m29251P();
        C6719h m30860T = m29251P == null ? null : m29251P.m30860T();
        boolean z11 = m29251P != null && m29251P.zza();
        if (m30860T == null) {
            z10 = false;
        }
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", z10);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z11);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", this.f33438h.m29520E1());
        C5758e.c.a aVar = new C5758e.c.a(castDevice, new C5958h1(this, null));
        aVar.m28182d(bundle2);
        InterfaceC5749b2 m28175a = C5758e.m28175a(this.f33434d, aVar.m28181a());
        m28175a.mo28160h(new C5964j1(this, null));
        this.f33440j = m28175a;
        m28175a.mo28156c();
    }

    @Override // p216m9.AbstractC5989s
    /* renamed from: a */
    public void mo29281a(boolean z10) {
        InterfaceC5936a0 interfaceC5936a0 = this.f33436f;
        if (interfaceC5936a0 != null) {
            try {
                interfaceC5936a0.mo29232s0(z10, 0);
            } catch (RemoteException e10) {
                f33433o.m34874b(e10, "Unable to call %s on %s.", "disconnectFromDevice", InterfaceC5936a0.class.getSimpleName());
            }
            m29353h(0);
        }
    }

    @Override // p216m9.AbstractC5989s
    /* renamed from: b */
    public long mo29282b() {
        C9935o.m41845e("Must be called from the main thread.");
        C6721i c6721i = this.f33441k;
        if (c6721i == null) {
            return 0L;
        }
        return c6721i.m31018o() - this.f33441k.m31006g();
    }

    @Override // p216m9.AbstractC5989s
    /* renamed from: i */
    public void mo29283i(Bundle bundle) {
        this.f33442l = CastDevice.m13037S(bundle);
    }

    @Override // p216m9.AbstractC5989s
    /* renamed from: j */
    public void mo29284j(Bundle bundle) {
        this.f33442l = CastDevice.m13037S(bundle);
    }

    @Override // p216m9.AbstractC5989s
    /* renamed from: k */
    public void mo29285k(Bundle bundle) {
        m29280D(bundle);
    }

    @Override // p216m9.AbstractC5989s
    /* renamed from: l */
    public void mo29286l(Bundle bundle) {
        m29280D(bundle);
    }

    @Override // p216m9.AbstractC5989s
    /* renamed from: m */
    public final void mo29287m(Bundle bundle) {
        CastDevice castDevice;
        CastDevice castDevice2;
        CastDevice m13037S = CastDevice.m13037S(bundle);
        if (m13037S == null || m13037S.equals(this.f33442l)) {
            return;
        }
        boolean z10 = !TextUtils.isEmpty(m13037S.m13041R()) && ((castDevice2 = this.f33442l) == null || !TextUtils.equals(castDevice2.m13041R(), m13037S.m13041R()));
        this.f33442l = m13037S;
        f33433o.m34873a("update to device (%s) with name %s", m13037S, true != z10 ? "unchanged" : "changed");
        if (!z10 || (castDevice = this.f33442l) == null) {
            return;
        }
        C6952v c6952v = this.f33439i;
        if (c6952v != null) {
            c6952v.m31929k(castDevice);
        }
        Iterator it = new HashSet(this.f33435e).iterator();
        while (it.hasNext()) {
            ((C5758e.d) it.next()).mo28187e();
        }
    }

    /* renamed from: p */
    public void m29288p(C5758e.d dVar) {
        C9935o.m41845e("Must be called from the main thread.");
        if (dVar != null) {
            this.f33435e.add(dVar);
        }
    }

    @Pure
    /* renamed from: q */
    public CastDevice m29289q() {
        C9935o.m41845e("Must be called from the main thread.");
        return this.f33442l;
    }

    /* renamed from: r */
    public C6721i m29290r() {
        C9935o.m41845e("Must be called from the main thread.");
        return this.f33441k;
    }

    /* renamed from: s */
    public boolean m29291s() {
        C9935o.m41845e("Must be called from the main thread.");
        InterfaceC5749b2 interfaceC5749b2 = this.f33440j;
        return interfaceC5749b2 != null && interfaceC5749b2.mo28158f() && interfaceC5749b2.mo28159g();
    }

    /* renamed from: t */
    public void m29292t(C5758e.d dVar) {
        C9935o.m41845e("Must be called from the main thread.");
        if (dVar != null) {
            this.f33435e.remove(dVar);
        }
    }

    /* renamed from: u */
    public void m29293u(final boolean z10) {
        C9935o.m41845e("Must be called from the main thread.");
        InterfaceC5749b2 interfaceC5749b2 = this.f33440j;
        if (interfaceC5749b2 == null || !interfaceC5749b2.mo28158f()) {
            return;
        }
        final C5816w0 c5816w0 = (C5816w0) interfaceC5749b2;
        c5816w0.doWrite(AbstractC9515r.m40018a().m40024b(new InterfaceC9502o(c5816w0, z10) { // from class: l9.g0

            /* renamed from: a */
            public final C5816w0 f32236a;

            /* renamed from: b */
            public final boolean f32237b;

            {
                this.f32236a = c5816w0;
                this.f32237b = z10;
            }

            @Override // p383w9.InterfaceC9502o
            public final void accept(Object obj, Object obj2) {
                this.f32236a.m28406u(this.f32237b, (C8048r0) obj, (C10146j) obj2);
            }
        }).m40027e(8412).m40023a());
    }
}

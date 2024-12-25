package ua;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import ca.C1052b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p305ra.C8175ha;
import p305ra.InterfaceC8358td;
import p350u9.C8822k;
import p422y9.C9935o;
import p441z9.AbstractC10125a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/u8.class
 */
/* renamed from: ua.u8 */
/* loaded from: combined.jar:classes2.jar:ua/u8.class */
public final class C9089u8 extends AbstractC8905f4 {

    /* renamed from: c */
    public final ServiceConnectionC9077t8 f41678c;

    /* renamed from: d */
    public InterfaceC9024p3 f41679d;

    /* renamed from: e */
    public volatile Boolean f41680e;

    /* renamed from: f */
    public final AbstractC8984m f41681f;

    /* renamed from: g */
    public final C8982l9 f41682g;

    /* renamed from: h */
    public final List<Runnable> f41683h;

    /* renamed from: i */
    public final AbstractC8984m f41684i;

    public C9089u8(C8870c5 c8870c5) {
        super(c8870c5);
        this.f41683h = new ArrayList();
        this.f41682g = new C8982l9(c8870c5.mo37778a());
        this.f41678c = new ServiceConnectionC9077t8(this);
        this.f41681f = new C8885d8(this, c8870c5);
        this.f41684i = new C8909f8(this, c8870c5);
    }

    /* renamed from: x */
    public static /* synthetic */ void m38283x(C9089u8 c9089u8, ComponentName componentName) {
        c9089u8.mo37811h();
        if (c9089u8.f41679d != null) {
            c9089u8.f41679d = null;
            c9089u8.f41723a.mo37780c().m38416w().m38327b("Disconnected from device MeasurementService", componentName);
            c9089u8.mo37811h();
            c9089u8.m38308p();
        }
    }

    /* renamed from: y */
    public static /* synthetic */ InterfaceC9024p3 m38284y(C9089u8 c9089u8, InterfaceC9024p3 interfaceC9024p3) {
        c9089u8.f41679d = null;
        return null;
    }

    /* renamed from: C */
    public final boolean m38286C() {
        this.f41723a.mo37783f();
        return true;
    }

    /* renamed from: D */
    public final void m38287D() {
        mo37811h();
        this.f41682g.m38112a();
        AbstractC8984m abstractC8984m = this.f41681f;
        this.f41723a.m37797z();
        abstractC8984m.m38121b(C8988m3.f41330K.m38108b(null).longValue());
    }

    /* renamed from: E */
    public final void m38288E(Runnable runnable) {
        mo37811h();
        if (m38291H()) {
            runnable.run();
            return;
        }
        int size = this.f41683h.size();
        this.f41723a.m37797z();
        if (size >= 1000) {
            this.f41723a.mo37780c().m38408o().m38326a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f41683h.add(runnable);
        this.f41684i.m38121b(60000L);
        m38308p();
    }

    /* renamed from: F */
    public final void m38289F() {
        mo37811h();
        this.f41723a.mo37780c().m38416w().m38327b("Processing queued up service tasks", Integer.valueOf(this.f41683h.size()));
        Iterator<Runnable> it = this.f41683h.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
            } catch (Exception e10) {
                this.f41723a.mo37780c().m38408o().m38327b("Task exception while flushing queue", e10);
            }
        }
        this.f41683h.clear();
        this.f41684i.m38123d();
    }

    /* renamed from: G */
    public final C8959ja m38290G(boolean z10) {
        this.f41723a.mo37783f();
        C9036q3 m37781d = this.f41723a.m37781d();
        String str = null;
        if (z10) {
            C9128y3 mo37780c = this.f41723a.mo37780c();
            if (mo37780c.f41723a.m37759A().f41481d == null) {
                str = null;
            } else {
                Pair<String, Long> m38129b = mo37780c.f41723a.m37759A().f41481d.m38129b();
                str = null;
                if (m38129b != null) {
                    if (m38129b == C9013o4.f41477C) {
                        str = null;
                    } else {
                        String valueOf = String.valueOf(m38129b.second);
                        String str2 = (String) m38129b.first;
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + String.valueOf(str2).length());
                        sb2.append(valueOf);
                        sb2.append(":");
                        sb2.append(str2);
                        str = sb2.toString();
                    }
                }
            }
        }
        return m37781d.m38190o(str);
    }

    /* renamed from: H */
    public final boolean m38291H() {
        mo37811h();
        m37905j();
        return this.f41679d != null;
    }

    /* renamed from: I */
    public final void m38292I() {
        mo37811h();
        m37905j();
        m38288E(new RunnableC8921g8(this, m38290G(true)));
    }

    /* renamed from: J */
    public final void m38293J(boolean z10) {
        C8175ha.m35418a();
        if (this.f41723a.m37797z().m37900w(null, C8988m3.f41323G0)) {
            mo37811h();
            m37905j();
            if (z10) {
                m38286C();
                this.f41723a.m37767I().m38216o();
            }
            if (m38314v()) {
                m38288E(new RunnableC8945i8(this, m38290G(false)));
            }
        }
    }

    /* renamed from: K */
    public final void m38294K(InterfaceC9024p3 interfaceC9024p3, AbstractC10125a abstractC10125a, C8959ja c8959ja) {
        C9106w3 m38408o;
        String str;
        mo37811h();
        m37905j();
        m38286C();
        this.f41723a.m37797z();
        int i10 = 100;
        for (int i11 = 0; i11 < 1001 && i10 == 100; i11++) {
            ArrayList arrayList = new ArrayList();
            List<AbstractC10125a> m38220s = this.f41723a.m37767I().m38220s(100);
            if (m38220s != null) {
                arrayList.addAll(m38220s);
                i10 = m38220s.size();
            } else {
                i10 = 0;
            }
            if (abstractC10125a != null && i10 < 100) {
                arrayList.add(abstractC10125a);
            }
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                AbstractC10125a abstractC10125a2 = (AbstractC10125a) arrayList.get(i12);
                if (abstractC10125a2 instanceof C9068t) {
                    try {
                        interfaceC9024p3.mo38153t1((C9068t) abstractC10125a2, c8959ja);
                    } catch (RemoteException e10) {
                        e = e10;
                        m38408o = this.f41723a.mo37780c().m38408o();
                        str = "Failed to send event to the service";
                        m38408o.m38327b(str, e);
                    }
                } else if (abstractC10125a2 instanceof C8851aa) {
                    try {
                        interfaceC9024p3.mo38152q1((C8851aa) abstractC10125a2, c8959ja);
                    } catch (RemoteException e11) {
                        e = e11;
                        m38408o = this.f41723a.mo37780c().m38408o();
                        str = "Failed to send user property to the service";
                        m38408o.m38327b(str, e);
                    }
                } else if (abstractC10125a2 instanceof C8852b) {
                    try {
                        interfaceC9024p3.mo38141C0((C8852b) abstractC10125a2, c8959ja);
                    } catch (RemoteException e12) {
                        e = e12;
                        m38408o = this.f41723a.mo37780c().m38408o();
                        str = "Failed to send conditional user property to the service";
                        m38408o.m38327b(str, e);
                    }
                } else {
                    this.f41723a.mo37780c().m38408o().m38326a("Discarding data. Unrecognized parcel type.");
                }
            }
        }
    }

    /* renamed from: L */
    public final void m38295L(C9068t c9068t, String str) {
        C9935o.m41850j(c9068t);
        mo37811h();
        m37905j();
        m38286C();
        m38288E(new RunnableC8957j8(this, true, m38290G(true), this.f41723a.m37767I().m38217p(c9068t), c9068t, str));
    }

    /* renamed from: M */
    public final void m38296M(C8852b c8852b) {
        C9935o.m41850j(c8852b);
        mo37811h();
        m37905j();
        this.f41723a.mo37783f();
        m38288E(new RunnableC8969k8(this, true, m38290G(true), this.f41723a.m37767I().m38219r(c8852b), new C8852b(c8852b), c8852b));
    }

    /* renamed from: N */
    public final void m38297N(AtomicReference<List<C8852b>> atomicReference, String str, String str2, String str3) {
        mo37811h();
        m37905j();
        m38288E(new RunnableC8981l8(this, atomicReference, null, str2, str3, m38290G(false)));
    }

    /* renamed from: O */
    public final void m38298O(InterfaceC8358td interfaceC8358td, String str, String str2) {
        mo37811h();
        m37905j();
        m38288E(new RunnableC8993m8(this, str, str2, m38290G(false), interfaceC8358td));
    }

    /* renamed from: P */
    public final void m38299P(AtomicReference<List<C8851aa>> atomicReference, String str, String str2, String str3, boolean z10) {
        mo37811h();
        m37905j();
        m38288E(new RunnableC9005n8(this, atomicReference, null, str2, str3, m38290G(false), z10));
    }

    /* renamed from: Q */
    public final void m38300Q(InterfaceC8358td interfaceC8358td, String str, String str2, boolean z10) {
        mo37811h();
        m37905j();
        m38288E(new RunnableC9099v7(this, str, str2, m38290G(false), z10, interfaceC8358td));
    }

    /* renamed from: R */
    public final void m38301R(C8851aa c8851aa) {
        mo37811h();
        m37905j();
        m38286C();
        m38288E(new RunnableC9110w7(this, m38290G(true), this.f41723a.m37767I().m38218q(c8851aa), c8851aa));
    }

    /* renamed from: S */
    public final void m38302S() {
        mo37811h();
        m37905j();
        C8959ja m38290G = m38290G(false);
        m38286C();
        this.f41723a.m37767I().m38216o();
        m38288E(new RunnableC9121x7(this, m38290G));
    }

    /* renamed from: T */
    public final void m38303T(AtomicReference<String> atomicReference) {
        mo37811h();
        m37905j();
        m38288E(new RunnableC9132y7(this, atomicReference, m38290G(false)));
    }

    /* renamed from: U */
    public final void m38304U(InterfaceC8358td interfaceC8358td) {
        mo37811h();
        m37905j();
        m38288E(new RunnableC9143z7(this, m38290G(false), interfaceC8358td));
    }

    /* renamed from: V */
    public final void m38305V() {
        mo37811h();
        m37905j();
        C8959ja m38290G = m38290G(true);
        this.f41723a.m37767I().m38221t();
        m38288E(new RunnableC8849a8(this, m38290G));
    }

    /* renamed from: W */
    public final void m38306W(C9004n7 c9004n7) {
        mo37811h();
        m37905j();
        m38288E(new RunnableC8861b8(this, c9004n7));
    }

    @Override // ua.AbstractC8905f4
    /* renamed from: m */
    public final boolean mo37908m() {
        return false;
    }

    /* renamed from: o */
    public final void m38307o(Bundle bundle) {
        mo37811h();
        m37905j();
        m38288E(new RunnableC8873c8(this, m38290G(false), bundle));
    }

    /* renamed from: p */
    public final void m38308p() {
        mo37811h();
        m37905j();
        if (m38291H()) {
            return;
        }
        if (m38310r()) {
            this.f41678c.m38241c();
            return;
        }
        if (this.f41723a.m37797z().m37886H()) {
            return;
        }
        this.f41723a.mo37783f();
        List<ResolveInfo> queryIntentServices = this.f41723a.mo37779b().getPackageManager().queryIntentServices(new Intent().setClassName(this.f41723a.mo37779b(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (queryIntentServices == null || queryIntentServices.size() <= 0) {
            this.f41723a.mo37780c().m38408o().m38326a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context mo37779b = this.f41723a.mo37779b();
        this.f41723a.mo37783f();
        intent.setComponent(new ComponentName(mo37779b, "com.google.android.gms.measurement.AppMeasurementService"));
        this.f41678c.m38239a(intent);
    }

    /* renamed from: q */
    public final Boolean m38309q() {
        return this.f41680e;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01b5  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m38310r() {
        /*
            Method dump skipped, instructions count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.C9089u8.m38310r():boolean");
    }

    /* renamed from: s */
    public final void m38311s(InterfaceC9024p3 interfaceC9024p3) {
        mo37811h();
        C9935o.m41850j(interfaceC9024p3);
        this.f41679d = interfaceC9024p3;
        m38287D();
        m38289F();
    }

    /* renamed from: t */
    public final void m38312t() {
        mo37811h();
        m37905j();
        this.f41678c.m38240b();
        try {
            C1052b.m6223b().m6228c(this.f41723a.mo37779b(), this.f41678c);
        } catch (IllegalArgumentException | IllegalStateException e10) {
        }
        this.f41679d = null;
    }

    /* renamed from: u */
    public final void m38313u(InterfaceC8358td interfaceC8358td, C9068t c9068t, String str) {
        mo37811h();
        m37905j();
        if (this.f41723a.m37765G().m37836O(C8822k.f40857a) == 0) {
            m38288E(new RunnableC8897e8(this, c9068t, str, interfaceC8358td));
        } else {
            this.f41723a.mo37780c().m38411r().m38326a("Not bundling data. Service unavailable or out of date");
            this.f41723a.m37765G().m37842U(interfaceC8358td, new byte[0]);
        }
    }

    /* renamed from: v */
    public final boolean m38314v() {
        mo37811h();
        m37905j();
        if (this.f41723a.m37797z().m37900w(null, C8988m3.f41327I0)) {
            return !m38310r() || this.f41723a.m37765G().m37835N() >= C8988m3.f41329J0.m38108b(null).intValue();
        }
        return false;
    }
}

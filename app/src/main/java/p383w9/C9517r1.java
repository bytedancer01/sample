package p383w9;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import p060da.C4403b;
import p350u9.C8804b;
import p368v9.C9315a;
import p422y9.AbstractC9899c;
import p422y9.C9905e;
import p422y9.C9929m;
import p422y9.C9938p;
import p422y9.C9941q;
import za.AbstractC10144i;
import za.InterfaceC10134d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/r1.class
 */
/* renamed from: w9.r1 */
/* loaded from: combined.jar:classes2.jar:w9/r1.class */
public final class C9517r1<T> implements InterfaceC10134d<T> {

    /* renamed from: a */
    public final C9457f f43402a;

    /* renamed from: b */
    public final int f43403b;

    /* renamed from: c */
    public final C9437b<?> f43404c;

    /* renamed from: d */
    public final long f43405d;

    /* renamed from: e */
    public final long f43406e;

    public C9517r1(C9457f c9457f, int i10, C9437b<?> c9437b, long j10, long j11, String str, String str2) {
        this.f43402a = c9457f;
        this.f43403b = i10;
        this.f43404c = c9437b;
        this.f43405d = j10;
        this.f43406e = j11;
    }

    /* renamed from: b */
    public static <T> C9517r1<T> m40028b(C9457f c9457f, int i10, C9437b<?> c9437b) {
        boolean z10;
        if (!c9457f.m39854f()) {
            return null;
        }
        C9941q m41859a = C9938p.m41858b().m41859a();
        if (m41859a == null) {
            z10 = true;
        } else {
            if (!m41859a.m41866R()) {
                return null;
            }
            boolean m41867S = m41859a.m41867S();
            C9464g1 m39861w = c9457f.m39861w(c9437b);
            z10 = m41867S;
            if (m39861w != null) {
                if (!(m39861w.m39910s() instanceof AbstractC9899c)) {
                    return null;
                }
                AbstractC9899c abstractC9899c = (AbstractC9899c) m39861w.m39910s();
                z10 = m41867S;
                if (abstractC9899c.hasConnectionInfo()) {
                    z10 = m41867S;
                    if (!abstractC9899c.isConnecting()) {
                        C9905e m40029c = m40029c(m39861w, abstractC9899c, i10);
                        if (m40029c == null) {
                            return null;
                        }
                        m39861w.m39883D();
                        z10 = m40029c.m41786T();
                    }
                }
            }
        }
        return new C9517r1<>(c9457f, i10, c9437b, z10 ? System.currentTimeMillis() : 0L, z10 ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    /* renamed from: c */
    public static C9905e m40029c(C9464g1<?> c9464g1, AbstractC9899c<?> abstractC9899c, int i10) {
        C9905e telemetryConfiguration = abstractC9899c.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.m41785S()) {
            return null;
        }
        int[] m41783Q = telemetryConfiguration.m41783Q();
        if (m41783Q == null) {
            int[] m41784R = telemetryConfiguration.m41784R();
            if (m41784R != null && C4403b.m22428b(m41784R, i10)) {
                return null;
            }
        } else if (!C4403b.m22428b(m41783Q, i10)) {
            return null;
        }
        if (c9464g1.m39908p() < telemetryConfiguration.m41782P()) {
            return telemetryConfiguration;
        }
        return null;
    }

    @Override // za.InterfaceC10134d
    /* renamed from: a */
    public final void mo26091a(AbstractC10144i<T> abstractC10144i) {
        C9464g1 m39861w;
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        int m37659P;
        long j10;
        long j11;
        int i14;
        if (this.f43402a.m39854f()) {
            C9941q m41859a = C9938p.m41858b().m41859a();
            if ((m41859a == null || m41859a.m41866R()) && (m39861w = this.f43402a.m39861w(this.f43404c)) != null && (m39861w.m39910s() instanceof AbstractC9899c)) {
                AbstractC9899c abstractC9899c = (AbstractC9899c) m39861w.m39910s();
                boolean z11 = this.f43405d > 0;
                int gCoreServiceId = abstractC9899c.getGCoreServiceId();
                if (m41859a != null) {
                    boolean m41867S = z11 & m41859a.m41867S();
                    i11 = m41859a.m41864P();
                    int m41865Q = m41859a.m41865Q();
                    i10 = m41859a.m41868T();
                    boolean z12 = m41867S;
                    int i15 = m41865Q;
                    if (abstractC9899c.hasConnectionInfo()) {
                        z12 = m41867S;
                        i15 = m41865Q;
                        if (!abstractC9899c.isConnecting()) {
                            C9905e m40029c = m40029c(m39861w, abstractC9899c, this.f43403b);
                            if (m40029c == null) {
                                return;
                            }
                            z12 = m40029c.m41786T() && this.f43405d > 0;
                            i15 = m40029c.m41782P();
                        }
                    }
                    i12 = i15;
                    z10 = z12;
                } else {
                    i10 = 0;
                    i11 = 5000;
                    i12 = 100;
                    z10 = z11;
                }
                C9457f c9457f = this.f43402a;
                if (abstractC10144i.mo42567p()) {
                    i13 = 0;
                    m37659P = 0;
                } else {
                    if (abstractC10144i.mo42565n()) {
                        i13 = 100;
                    } else {
                        Exception mo42562k = abstractC10144i.mo42562k();
                        if (mo42562k instanceof C9315a) {
                            Status m39313a = ((C9315a) mo42562k).m39313a();
                            int m13122Q = m39313a.m13122Q();
                            C8804b m13121P = m39313a.m13121P();
                            m37659P = m13121P == null ? -1 : m13121P.m37659P();
                            i13 = m13122Q;
                        } else {
                            i13 = 101;
                        }
                    }
                    m37659P = -1;
                }
                if (z10) {
                    j10 = this.f43405d;
                    j11 = System.currentTimeMillis();
                    i14 = (int) (SystemClock.elapsedRealtime() - this.f43406e);
                } else {
                    j10 = 0;
                    j11 = 0;
                    i14 = -1;
                }
                c9457f.m39848I(new C9929m(this.f43403b, i13, m37659P, j10, j11, null, null, gCoreServiceId, i14), i10, i11, i12);
            }
        }
    }
}

package p059d9;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import org.apache.commons.codec.language.p254bm.Rule;
import p009a8.C0083a1;
import p009a8.C0111o;
import p009a8.C0117r;
import p009a8.C0134z0;
import p078e9.C4670d0;
import p267p6.AbstractC7574e2;
import p267p6.C7561b1;
import p267p6.C7565c1;
import p267p6.C7583h;
import p267p6.C7597l1;
import p267p6.C7603n1;
import p267p6.C7629w0;
import p267p6.InterfaceC7606o1;
import p282q6.C7803i1;
import p282q6.InterfaceC7806j1;
import p283q7.C7839a;
import p301r6.C7972d;
import p332t6.C8636d;
import p332t6.C8639g;
import p421y8.AbstractC9886j;
import p421y8.C9888l;
import p421y8.InterfaceC9887k;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/l.class
 */
/* renamed from: d9.l */
/* loaded from: combined.jar:classes2.jar:d9/l.class */
public class C4372l implements InterfaceC7806j1 {

    /* renamed from: f */
    public static final NumberFormat f26600f;

    /* renamed from: a */
    public final AbstractC9886j f26601a;

    /* renamed from: b */
    public final String f26602b;

    /* renamed from: c */
    public final AbstractC7574e2.c f26603c;

    /* renamed from: d */
    public final AbstractC7574e2.b f26604d;

    /* renamed from: e */
    public final long f26605e;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        f26600f = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public C4372l(AbstractC9886j abstractC9886j) {
        this(abstractC9886j, "EventLogger");
    }

    public C4372l(AbstractC9886j abstractC9886j, String str) {
        this.f26601a = abstractC9886j;
        this.f26602b = str;
        this.f26603c = new AbstractC7574e2.c();
        this.f26604d = new AbstractC7574e2.b();
        this.f26605e = SystemClock.elapsedRealtime();
    }

    /* renamed from: A0 */
    public static String m22059A0(long j10) {
        return j10 == -9223372036854775807L ? "?" : f26600f.format(j10 / 1000.0f);
    }

    /* renamed from: B0 */
    public static String m22060B0(int i10) {
        return i10 != 0 ? i10 != 1 ? "?" : "SOURCE_UPDATE" : "PLAYLIST_CHANGED";
    }

    /* renamed from: C0 */
    public static String m22061C0(InterfaceC9887k interfaceC9887k, C0134z0 c0134z0, int i10) {
        return m22062D0((interfaceC9887k == null || interfaceC9887k.mo41612l() != c0134z0 || interfaceC9887k.mo41611k(i10) == -1) ? false : true);
    }

    /* renamed from: D0 */
    public static String m22062D0(boolean z10) {
        return z10 ? "[X]" : "[ ]";
    }

    /* renamed from: r0 */
    public static String m22063r0(int i10, int i11) {
        if (i10 < 2) {
            return "N/A";
        }
        if (i11 == 0) {
            return "NO";
        }
        if (i11 == 8) {
            return "YES_NOT_SEAMLESS";
        }
        if (i11 == 16) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    /* renamed from: s0 */
    public static String m22064s0(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "?" : "INTERNAL" : "REMOVE" : "SKIP" : "SEEK_ADJUSTMENT" : "SEEK" : "AUTO_TRANSITION";
    }

    /* renamed from: v0 */
    public static String m22065v0(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "?" : "PLAYLIST_CHANGED" : "SEEK" : "AUTO" : "REPEAT";
    }

    /* renamed from: w0 */
    public static String m22066w0(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "?" : "END_OF_MEDIA_ITEM" : "REMOTE" : "AUDIO_BECOMING_NOISY" : "AUDIO_FOCUS_LOSS" : "USER_REQUEST";
    }

    /* renamed from: x0 */
    public static String m22067x0(int i10) {
        return i10 != 0 ? i10 != 1 ? "?" : "TRANSIENT_AUDIO_FOCUS_LOSS" : "NONE";
    }

    /* renamed from: y0 */
    public static String m22068y0(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "?" : Rule.ALL : "ONE" : "OFF";
    }

    /* renamed from: z0 */
    public static String m22069z0(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE";
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: A */
    public void mo22070A(InterfaceC7806j1.a aVar, C7839a c7839a) {
        m22075E0("metadata [" + m22143u0(aVar));
        m22089L0(c7839a, "  ");
        m22075E0("]");
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: B */
    public void mo22071B(InterfaceC7806j1.a aVar, InterfaceC7606o1.f fVar, InterfaceC7606o1.f fVar2, int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("reason=");
        sb2.append(m22064s0(i10));
        sb2.append(", PositionInfo:old [");
        sb2.append("window=");
        sb2.append(fVar.f36910b);
        sb2.append(", period=");
        sb2.append(fVar.f36912d);
        sb2.append(", pos=");
        sb2.append(fVar.f36913e);
        if (fVar.f36915g != -1) {
            sb2.append(", contentPos=");
            sb2.append(fVar.f36914f);
            sb2.append(", adGroup=");
            sb2.append(fVar.f36915g);
            sb2.append(", ad=");
            sb2.append(fVar.f36916h);
        }
        sb2.append("], PositionInfo:new [");
        sb2.append("window=");
        sb2.append(fVar2.f36910b);
        sb2.append(", period=");
        sb2.append(fVar2.f36912d);
        sb2.append(", pos=");
        sb2.append(fVar2.f36913e);
        if (fVar2.f36915g != -1) {
            sb2.append(", contentPos=");
            sb2.append(fVar2.f36914f);
            sb2.append(", adGroup=");
            sb2.append(fVar2.f36915g);
            sb2.append(", ad=");
            sb2.append(fVar2.f36916h);
        }
        sb2.append("]");
        m22079G0(aVar, "positionDiscontinuity", sb2.toString());
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: C */
    public void mo22072C(InterfaceC7806j1.a aVar, C4670d0 c4670d0) {
        m22079G0(aVar, "videoSize", c4670d0.f27559a + ", " + c4670d0.f27560b);
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: D */
    public void mo22073D(InterfaceC7806j1.a aVar, int i10) {
        int mo509i = aVar.f37718b.mo509i();
        int mo512p = aVar.f37718b.mo512p();
        m22075E0("timeline [" + m22143u0(aVar) + ", periodCount=" + mo509i + ", windowCount=" + mo512p + ", reason=" + m22060B0(i10));
        for (int i11 = 0; i11 < Math.min(mo509i, 3); i11++) {
            aVar.f37718b.m32663f(i11, this.f26604d);
            m22075E0("  period [" + m22059A0(this.f26604d.m32678j()) + "]");
        }
        int i12 = 0;
        if (mo509i > 3) {
            m22075E0("  ...");
            i12 = 0;
        }
        while (i12 < Math.min(mo512p, 3)) {
            aVar.f37718b.m32666n(i12, this.f26603c);
            m22075E0("  window [" + m22059A0(this.f26603c.m32692d()) + ", seekable=" + this.f26603c.f36727h + ", dynamic=" + this.f26603c.f36728i + "]");
            i12++;
        }
        if (mo512p > 3) {
            m22075E0("  ...");
        }
        m22075E0("]");
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: E */
    public void mo22074E(InterfaceC7806j1.a aVar, String str, long j10) {
        m22079G0(aVar, "videoDecoderInitialized", str);
    }

    /* renamed from: E0 */
    public void m22075E0(String str) {
        C4392v.m22268b(this.f26602b, str);
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: F */
    public /* synthetic */ void mo22076F(InterfaceC7806j1.a aVar, int i10, int i11, int i12, float f10) {
        C7803i1.m34083y(this, aVar, i10, i11, i12, f10);
    }

    /* renamed from: F0 */
    public final void m22077F0(InterfaceC7806j1.a aVar, String str) {
        m22075E0(m22141t0(aVar, str, null, null));
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: G */
    public /* synthetic */ void mo22078G(InterfaceC7806j1.a aVar, C7565c1 c7565c1) {
        C7803i1.m34072n(this, aVar, c7565c1);
    }

    /* renamed from: G0 */
    public final void m22079G0(InterfaceC7806j1.a aVar, String str, String str2) {
        m22075E0(m22141t0(aVar, str, str2, null));
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: H */
    public /* synthetic */ void mo22080H(InterfaceC7606o1 interfaceC7606o1, InterfaceC7806j1.b bVar) {
        C7803i1.m34070l(this, interfaceC7606o1, bVar);
    }

    /* renamed from: H0 */
    public void m22081H0(String str) {
        C4392v.m22270d(this.f26602b, str);
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: I */
    public /* synthetic */ void mo22082I(InterfaceC7806j1.a aVar) {
        C7803i1.m34077s(this, aVar);
    }

    /* renamed from: I0 */
    public final void m22083I0(InterfaceC7806j1.a aVar, String str, String str2, Throwable th2) {
        m22081H0(m22141t0(aVar, str, str2, th2));
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: J */
    public void mo22084J(InterfaceC7806j1.a aVar, C8636d c8636d) {
        m22077F0(aVar, "audioEnabled");
    }

    /* renamed from: J0 */
    public final void m22085J0(InterfaceC7806j1.a aVar, String str, Throwable th2) {
        m22081H0(m22141t0(aVar, str, null, th2));
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: K */
    public void mo22086K(InterfaceC7806j1.a aVar, C7597l1 c7597l1) {
        m22085J0(aVar, "playerFailed", c7597l1);
    }

    /* renamed from: K0 */
    public final void m22087K0(InterfaceC7806j1.a aVar, String str, Exception exc) {
        m22083I0(aVar, "internalError", str, exc);
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: L */
    public /* synthetic */ void mo22088L(InterfaceC7806j1.a aVar) {
        C7803i1.m34073o(this, aVar);
    }

    /* renamed from: L0 */
    public final void m22089L0(C7839a c7839a, String str) {
        for (int i10 = 0; i10 < c7839a.m34087k(); i10++) {
            m22075E0(str + c7839a.m34086j(i10));
        }
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: M */
    public /* synthetic */ void mo22090M(InterfaceC7806j1.a aVar, Exception exc) {
        C7803i1.m34063e(this, aVar, exc);
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: N */
    public void mo22091N(InterfaceC7806j1.a aVar, int i10) {
        m22079G0(aVar, "state", m22069z0(i10));
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: O */
    public void mo22092O(InterfaceC7806j1.a aVar, boolean z10) {
        m22079G0(aVar, "shuffleModeEnabled", Boolean.toString(z10));
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: P */
    public void mo22093P(InterfaceC7806j1.a aVar, C8636d c8636d) {
        m22077F0(aVar, "videoEnabled");
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: Q */
    public /* synthetic */ void mo22094Q(InterfaceC7806j1.a aVar, int i10, C8636d c8636d) {
        C7803i1.m34066h(this, aVar, i10, c8636d);
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: R */
    public /* synthetic */ void mo22095R(InterfaceC7806j1.a aVar, InterfaceC7606o1.b bVar) {
        C7803i1.m34064f(this, aVar, bVar);
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: S */
    public /* synthetic */ void mo22096S(InterfaceC7806j1.a aVar, int i10, String str, long j10) {
        C7803i1.m34067i(this, aVar, i10, str, j10);
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: T */
    public /* synthetic */ void mo22097T(InterfaceC7806j1.a aVar, String str, long j10, long j11) {
        C7803i1.m34060b(this, aVar, str, j10, j11);
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: U */
    public /* synthetic */ void mo22098U(InterfaceC7806j1.a aVar, Exception exc) {
        C7803i1.m34079u(this, aVar, exc);
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: V */
    public void mo22099V(InterfaceC7806j1.a aVar, int i10, int i11) {
        m22079G0(aVar, "surfaceSize", i10 + ", " + i11);
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: W */
    public /* synthetic */ void mo22100W(InterfaceC7806j1.a aVar, long j10, int i10) {
        C7803i1.m34081w(this, aVar, j10, i10);
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: X */
    public void mo22101X(InterfaceC7806j1.a aVar) {
        m22077F0(aVar, "drmSessionReleased");
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: Y */
    public /* synthetic */ void mo22102Y(InterfaceC7806j1.a aVar, int i10, C7629w0 c7629w0) {
        C7803i1.m34068j(this, aVar, i10, c7629w0);
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: Z */
    public void mo22103Z(InterfaceC7806j1.a aVar, C0083a1 c0083a1, C9888l c9888l) {
        AbstractC9886j abstractC9886j = this.f26601a;
        AbstractC9886j.a m41705g = abstractC9886j != null ? abstractC9886j.m41705g() : null;
        if (m41705g == null) {
            m22079G0(aVar, "tracks", "[]");
            return;
        }
        m22075E0("tracks [" + m22143u0(aVar));
        int m41708c = m41705g.m41708c();
        int i10 = 0;
        while (true) {
            String str = "  ]";
            if (i10 >= m41708c) {
                break;
            }
            C0083a1 m41712g = m41705g.m41712g(i10);
            InterfaceC9887k m41716a = c9888l.m41716a(i10);
            if (m41712g.f261b == 0) {
                str = "  " + m41705g.m41709d(i10) + " []";
            } else {
                m22075E0("  " + m41705g.m41709d(i10) + " [");
                for (int i11 = 0; i11 < m41712g.f261b; i11++) {
                    C0134z0 m323b = m41712g.m323b(i11);
                    m22075E0("    Group:" + i11 + ", adaptive_supported=" + m22063r0(m323b.f618b, m41705g.m41706a(i10, i11, false)) + " [");
                    for (int i12 = 0; i12 < m323b.f618b; i12++) {
                        m22075E0("      " + m22061C0(m41716a, m323b, i12) + " Track:" + i12 + ", " + C7629w0.m33156l(m323b.m663b(i12)) + ", supported=" + C7583h.m32759c(m41705g.m41713h(i10, i11, i12)));
                    }
                    m22075E0("    ]");
                }
                if (m41716a != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= m41716a.length()) {
                            break;
                        }
                        C7839a c7839a = m41716a.mo41607e(i13).f37084k;
                        if (c7839a != null) {
                            m22075E0("    Metadata [");
                            m22089L0(c7839a, "      ");
                            m22075E0("    ]");
                            break;
                        }
                        i13++;
                    }
                }
            }
            m22075E0(str);
            i10++;
        }
        C0083a1 m41715j = m41705g.m41715j();
        if (m41715j.f261b > 0) {
            m22075E0("  Unmapped [");
            for (int i14 = 0; i14 < m41715j.f261b; i14++) {
                m22075E0("    Group:" + i14 + " [");
                C0134z0 m323b2 = m41715j.m323b(i14);
                for (int i15 = 0; i15 < m323b2.f618b; i15++) {
                    m22075E0("      " + m22062D0(false) + " Track:" + i15 + ", " + C7629w0.m33156l(m323b2.m663b(i15)) + ", supported=" + C7583h.m32759c(0));
                }
                m22075E0("    ]");
            }
            m22075E0("  ]");
        }
        m22075E0("]");
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: a */
    public /* synthetic */ void mo22104a(InterfaceC7806j1.a aVar, List list) {
        C7803i1.m34078t(this, aVar, list);
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: a0 */
    public void mo22105a0(InterfaceC7806j1.a aVar, boolean z10) {
        m22079G0(aVar, "skipSilenceEnabled", Boolean.toString(z10));
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: b */
    public void mo22106b(InterfaceC7806j1.a aVar, int i10) {
        m22079G0(aVar, "playbackSuppressionReason", m22067x0(i10));
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: b0 */
    public void mo22107b0(InterfaceC7806j1.a aVar, boolean z10, int i10) {
        m22079G0(aVar, "playWhenReady", z10 + ", " + m22066w0(i10));
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: c */
    public void mo22108c(InterfaceC7806j1.a aVar) {
        m22077F0(aVar, "drmKeysRestored");
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: c0 */
    public void mo22109c0(InterfaceC7806j1.a aVar, C7972d c7972d) {
        m22079G0(aVar, "audioAttributes", c7972d.f38503a + "," + c7972d.f38504b + "," + c7972d.f38505c + "," + c7972d.f38506d);
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: d */
    public void mo22110d(InterfaceC7806j1.a aVar, String str) {
        m22079G0(aVar, "videoDecoderReleased", str);
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: d0 */
    public /* synthetic */ void mo22111d0(InterfaceC7806j1.a aVar, Exception exc) {
        C7803i1.m34059a(this, aVar, exc);
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: e */
    public void mo22112e(InterfaceC7806j1.a aVar, C7629w0 c7629w0, C8639g c8639g) {
        m22079G0(aVar, "audioInputFormat", C7629w0.m33156l(c7629w0));
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: e0 */
    public void mo22113e0(InterfaceC7806j1.a aVar, boolean z10) {
        m22079G0(aVar, "loading", Boolean.toString(z10));
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: f */
    public void mo22114f(InterfaceC7806j1.a aVar, C0111o c0111o, C0117r c0117r) {
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: f0 */
    public /* synthetic */ void mo22115f0(InterfaceC7806j1.a aVar, int i10) {
        C7803i1.m34075q(this, aVar, i10);
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: g */
    public void mo22116g(InterfaceC7806j1.a aVar, C7629w0 c7629w0, C8639g c8639g) {
        m22079G0(aVar, "videoInputFormat", C7629w0.m33156l(c7629w0));
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: g0 */
    public void mo22117g0(InterfaceC7806j1.a aVar, C0117r c0117r) {
        m22079G0(aVar, "upstreamDiscarded", C7629w0.m33156l(c0117r.f500c));
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: h */
    public void mo22118h(InterfaceC7806j1.a aVar, int i10, long j10, long j11) {
        m22083I0(aVar, "audioTrackUnderrun", i10 + ", " + j10 + ", " + j11, null);
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: h0 */
    public void mo22119h0(InterfaceC7806j1.a aVar, C0117r c0117r) {
        m22079G0(aVar, "downstreamFormat", C7629w0.m33156l(c0117r.f500c));
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: i */
    public void mo22120i(InterfaceC7806j1.a aVar, int i10, long j10, long j11) {
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: i0 */
    public /* synthetic */ void mo22121i0(InterfaceC7806j1.a aVar, boolean z10, int i10) {
        C7803i1.m34074p(this, aVar, z10, i10);
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: j */
    public void mo22122j(InterfaceC7806j1.a aVar, int i10) {
        m22079G0(aVar, "drmSessionAcquired", "state=" + i10);
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: j0 */
    public void mo22123j0(InterfaceC7806j1.a aVar, Object obj, long j10) {
        m22079G0(aVar, "renderedFirstFrame", String.valueOf(obj));
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: k */
    public void mo22124k(InterfaceC7806j1.a aVar, int i10, long j10) {
        m22079G0(aVar, "droppedFrames", Integer.toString(i10));
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: k0 */
    public void mo22125k0(InterfaceC7806j1.a aVar, String str, long j10) {
        m22079G0(aVar, "audioDecoderInitialized", str);
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: l */
    public void mo22126l(InterfaceC7806j1.a aVar, String str) {
        m22079G0(aVar, "audioDecoderReleased", str);
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: l0 */
    public void mo22127l0(InterfaceC7806j1.a aVar) {
        m22077F0(aVar, "drmKeysLoaded");
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: m */
    public /* synthetic */ void mo22128m(InterfaceC7806j1.a aVar) {
        C7803i1.m34069k(this, aVar);
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: m0 */
    public void mo22129m0(InterfaceC7806j1.a aVar, boolean z10) {
        m22079G0(aVar, "isPlaying", Boolean.toString(z10));
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: n */
    public /* synthetic */ void mo22130n(InterfaceC7806j1.a aVar, int i10, C8636d c8636d) {
        C7803i1.m34065g(this, aVar, i10, c8636d);
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: n0 */
    public /* synthetic */ void mo22131n0(InterfaceC7806j1.a aVar) {
        C7803i1.m34076r(this, aVar);
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: o */
    public void mo22132o(InterfaceC7806j1.a aVar, Exception exc) {
        m22087K0(aVar, "drmSessionManagerError", exc);
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: o0 */
    public void mo22133o0(InterfaceC7806j1.a aVar, C7603n1 c7603n1) {
        m22079G0(aVar, "playbackParameters", c7603n1.toString());
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: p */
    public void mo22134p(InterfaceC7806j1.a aVar) {
        m22077F0(aVar, "drmKeysRemoved");
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: p0 */
    public /* synthetic */ void mo22135p0(InterfaceC7806j1.a aVar, String str, long j10, long j11) {
        C7803i1.m34080v(this, aVar, str, j10, j11);
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: q */
    public /* synthetic */ void mo22136q(InterfaceC7806j1.a aVar, C7629w0 c7629w0) {
        C7803i1.m34061c(this, aVar, c7629w0);
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: q0 */
    public void mo22137q0(InterfaceC7806j1.a aVar, int i10) {
        m22079G0(aVar, "repeatMode", m22068y0(i10));
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: r */
    public void mo22138r(InterfaceC7806j1.a aVar, C0111o c0111o, C0117r c0117r) {
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: s */
    public void mo22139s(InterfaceC7806j1.a aVar, C0111o c0111o, C0117r c0117r) {
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: t */
    public void mo22140t(InterfaceC7806j1.a aVar, C8636d c8636d) {
        m22077F0(aVar, "videoDisabled");
    }

    /* renamed from: t0 */
    public final String m22141t0(InterfaceC7806j1.a aVar, String str, String str2, Throwable th2) {
        String str3 = str + " [" + m22143u0(aVar);
        String str4 = str3;
        if (th2 instanceof C7597l1) {
            str4 = str3 + ", errorCode=" + ((C7597l1) th2).m32832a();
        }
        String str5 = str4;
        if (str2 != null) {
            str5 = str4 + ", " + str2;
        }
        String m22272f = C4392v.m22272f(th2);
        String str6 = str5;
        if (!TextUtils.isEmpty(m22272f)) {
            str6 = str5 + "\n  " + m22272f.replace("\n", "\n  ") + '\n';
        }
        return str6 + "]";
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: u */
    public /* synthetic */ void mo22142u(InterfaceC7806j1.a aVar, C7629w0 c7629w0) {
        C7803i1.m34082x(this, aVar, c7629w0);
    }

    /* renamed from: u0 */
    public final String m22143u0(InterfaceC7806j1.a aVar) {
        String str = "window=" + aVar.f37719c;
        String str2 = str;
        if (aVar.f37720d != null) {
            String str3 = str + ", period=" + aVar.f37718b.mo506b(aVar.f37720d.f544a);
            str2 = str3;
            if (aVar.f37720d.m630b()) {
                str2 = (str3 + ", adGroup=" + aVar.f37720d.f545b) + ", ad=" + aVar.f37720d.f546c;
            }
        }
        return "eventTime=" + m22059A0(aVar.f37717a - this.f26605e) + ", mediaPos=" + m22059A0(aVar.f37721e) + ", " + str2;
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: v */
    public void mo22144v(InterfaceC7806j1.a aVar, C0111o c0111o, C0117r c0117r, IOException iOException, boolean z10) {
        m22087K0(aVar, "loadError", iOException);
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: w */
    public /* synthetic */ void mo22145w(InterfaceC7806j1.a aVar, boolean z10) {
        C7803i1.m34071m(this, aVar, z10);
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: x */
    public void mo22146x(InterfaceC7806j1.a aVar, C7561b1 c7561b1, int i10) {
        m22075E0("mediaItem [" + m22143u0(aVar) + ", reason=" + m22065v0(i10) + "]");
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: y */
    public void mo22147y(InterfaceC7806j1.a aVar, C8636d c8636d) {
        m22077F0(aVar, "audioDisabled");
    }

    @Override // p282q6.InterfaceC7806j1
    /* renamed from: z */
    public /* synthetic */ void mo22148z(InterfaceC7806j1.a aVar, long j10) {
        C7803i1.m34062d(this, aVar, j10);
    }
}

package p113g7;

import java.util.Collections;
import p057d7.InterfaceC4337t;
import p059d9.C4361f0;
import p113g7.AbstractC4966e;
import p267p6.C7629w0;
import p301r6.C7966a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:g7/a.class
 */
/* renamed from: g7.a */
/* loaded from: combined.jar:classes2.jar:g7/a.class */
public final class C4962a extends AbstractC4966e {

    /* renamed from: e */
    public static final int[] f28773e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    public boolean f28774b;

    /* renamed from: c */
    public boolean f28775c;

    /* renamed from: d */
    public int f28776d;

    public C4962a(InterfaceC4337t interfaceC4337t) {
        super(interfaceC4337t);
    }

    @Override // p113g7.AbstractC4966e
    /* renamed from: b */
    public boolean mo24984b(C4361f0 c4361f0) {
        C7629w0.b m33221f0;
        if (this.f28774b) {
            c4361f0.m21984Q(1);
            return true;
        }
        int m21971D = c4361f0.m21971D();
        int i10 = (m21971D >> 4) & 15;
        this.f28776d = i10;
        if (i10 == 2) {
            m33221f0 = new C7629w0.b().m33220e0("audio/mpeg").m33197H(1).m33221f0(f28773e[(m21971D >> 2) & 3]);
        } else {
            if (i10 != 7 && i10 != 8) {
                if (i10 != 10) {
                    throw new AbstractC4966e.a("Audio format not supported: " + this.f28776d);
                }
                this.f28774b = true;
                return true;
            }
            m33221f0 = new C7629w0.b().m33220e0(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").m33197H(1).m33221f0(8000);
        }
        this.f28797a.mo608f(m33221f0.m33194E());
        this.f28775c = true;
        this.f28774b = true;
        return true;
    }

    @Override // p113g7.AbstractC4966e
    /* renamed from: c */
    public boolean mo24985c(C4361f0 c4361f0, long j10) {
        if (this.f28776d == 2) {
            int m21985a = c4361f0.m21985a();
            this.f28797a.mo606e(c4361f0, m21985a);
            this.f28797a.mo600b(j10, 1, m21985a, 0, null);
            return true;
        }
        int m21971D = c4361f0.m21971D();
        if (m21971D != 0 || this.f28775c) {
            if (this.f28776d == 10 && m21971D != 1) {
                return false;
            }
            int m21985a2 = c4361f0.m21985a();
            this.f28797a.mo606e(c4361f0, m21985a2);
            this.f28797a.mo600b(j10, 1, m21985a2, 0, null);
            return true;
        }
        int m21985a3 = c4361f0.m21985a();
        byte[] bArr = new byte[m21985a3];
        c4361f0.m21994j(bArr, 0, m21985a3);
        C7966a.b m34529g = C7966a.m34529g(bArr);
        this.f28797a.mo608f(new C7629w0.b().m33220e0("audio/mp4a-latm").m33198I(m34529g.f38458c).m33197H(m34529g.f38457b).m33221f0(m34529g.f38456a).m33209T(Collections.singletonList(bArr)).m33194E());
        this.f28775c = true;
        return false;
    }
}

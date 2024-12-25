package p058d8;

import com.google.android.exoplayer2.extractor.C2343b;
import p027b9.C0858p;
import p027b9.InterfaceC0854m;
import p038c8.C1019e;
import p038c8.C1027m;
import p038c8.InterfaceC1021g;
import p059d9.C4349a;
import p077e8.AbstractC4657j;
import p077e8.C4656i;
import p145i7.C5197e;
import p182k7.C5516g;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d8/h.class
 */
/* renamed from: d8.h */
/* loaded from: combined.jar:classes2.jar:d8/h.class */
public final class C4346h {
    /* renamed from: a */
    public static C0858p m21869a(String str, C4656i c4656i, String str2, int i10) {
        return new C0858p.b().m5391i(c4656i.m23373b(str)).m5390h(c4656i.f27454a).m5389g(c4656i.f27455b).m5388f(str2).m5384b(i10).m5383a();
    }

    /* renamed from: b */
    public static C2343b m21870b(InterfaceC0854m interfaceC0854m, int i10, AbstractC4657j abstractC4657j) {
        return m21871c(interfaceC0854m, i10, abstractC4657j, 0);
    }

    /* renamed from: c */
    public static C2343b m21871c(InterfaceC0854m interfaceC0854m, int i10, AbstractC4657j abstractC4657j, int i11) {
        if (abstractC4657j.m23380n() == null) {
            return null;
        }
        InterfaceC1021g m21874f = m21874f(i10, abstractC4657j.f27459b);
        try {
            m21873e(m21874f, interfaceC0854m, abstractC4657j, i11, true);
            m21874f.release();
            return m21874f.mo6000c();
        } catch (Throwable th2) {
            m21874f.release();
            throw th2;
        }
    }

    /* renamed from: d */
    public static void m21872d(InterfaceC0854m interfaceC0854m, AbstractC4657j abstractC4657j, int i10, InterfaceC1021g interfaceC1021g, C4656i c4656i) {
        new C1027m(interfaceC0854m, m21869a(abstractC4657j.f27460c.get(i10).f27407a, c4656i, abstractC4657j.mo23377a(), 0), abstractC4657j.f27459b, 0, null, interfaceC1021g).mo498a();
    }

    /* renamed from: e */
    public static void m21873e(InterfaceC1021g interfaceC1021g, InterfaceC0854m interfaceC0854m, AbstractC4657j abstractC4657j, int i10, boolean z10) {
        C4656i c4656i = (C4656i) C4349a.m21882e(abstractC4657j.m23380n());
        C4656i c4656i2 = c4656i;
        if (z10) {
            c4656i2 = abstractC4657j.mo23379m();
            if (c4656i2 == null) {
                return;
            }
            C4656i m23372a = c4656i.m23372a(c4656i2, abstractC4657j.f27460c.get(i10).f27407a);
            if (m23372a == null) {
                m21872d(interfaceC0854m, abstractC4657j, i10, interfaceC1021g, c4656i);
            } else {
                c4656i2 = m23372a;
            }
        }
        m21872d(interfaceC0854m, abstractC4657j, i10, interfaceC1021g, c4656i2);
    }

    /* renamed from: f */
    public static InterfaceC1021g m21874f(int i10, C7629w0 c7629w0) {
        String str = c7629w0.f37085l;
        return new C1019e(str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm")) ? new C5197e() : new C5516g(), i10, c7629w0);
    }
}

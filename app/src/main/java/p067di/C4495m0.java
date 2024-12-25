package p067di;

import fi.C4866e;
import fi.C4885x;
import org.jetbrains.annotations.NotNull;
import p172jh.C5392k;
import p172jh.C5393l;
import p172jh.C5398q;
import p233nh.InterfaceC6789d;
import p233nh.InterfaceC6792g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/m0.class
 */
/* renamed from: di.m0 */
/* loaded from: combined.jar:classes2.jar:di/m0.class */
public final class C4495m0 {
    /* renamed from: a */
    public static final <T> void m22783a(@NotNull AbstractC4492l0<? super T> abstractC4492l0, int i10) {
        InterfaceC6789d<? super T> mo22753f = abstractC4492l0.mo22753f();
        boolean z10 = i10 == 4;
        if (z10 || !(mo22753f instanceof C4866e) || m22784b(i10) != m22784b(abstractC4492l0.f26912d)) {
            m22786d(abstractC4492l0, mo22753f, z10);
            return;
        }
        AbstractC4462b0 abstractC4462b0 = ((C4866e) mo22753f).f28552e;
        InterfaceC6792g mo22619b = mo22753f.mo22619b();
        if (abstractC4462b0.mo22633B0(mo22619b)) {
            abstractC4462b0.mo22632A0(mo22619b, abstractC4492l0);
        } else {
            m22787e(abstractC4492l0);
        }
    }

    /* renamed from: b */
    public static final boolean m22784b(int i10) {
        boolean z10 = true;
        if (i10 != 1) {
            z10 = i10 == 2;
        }
        return z10;
    }

    /* renamed from: c */
    public static final boolean m22785c(int i10) {
        return i10 == 2;
    }

    /* renamed from: d */
    public static final <T> void m22786d(@NotNull AbstractC4492l0<? super T> abstractC4492l0, @NotNull InterfaceC6789d<? super T> interfaceC6789d, boolean z10) {
        Object mo22755h;
        Object mo22756j = abstractC4492l0.mo22756j();
        Throwable mo22754g = abstractC4492l0.mo22754g(mo22756j);
        if (mo22754g != null) {
            C5392k.a aVar = C5392k.f30764b;
            mo22755h = C5393l.m26745a(mo22754g);
        } else {
            C5392k.a aVar2 = C5392k.f30764b;
            mo22755h = abstractC4492l0.mo22755h(mo22756j);
        }
        Object m26741a = C5392k.m26741a(mo22755h);
        if (!z10) {
            interfaceC6789d.mo22620c(m26741a);
            return;
        }
        C4866e c4866e = (C4866e) interfaceC6789d;
        InterfaceC6789d<T> interfaceC6789d2 = c4866e.f28553f;
        Object obj = c4866e.f28555h;
        InterfaceC6792g mo22619b = interfaceC6789d2.mo22619b();
        Object m24818c = C4885x.m24818c(mo22619b, obj);
        C4523v1<?> m22630e = m24818c != C4885x.f28587a ? C4459a0.m22630e(interfaceC6789d2, mo22619b, m24818c) : null;
        try {
            c4866e.f28553f.mo22620c(m26741a);
            C5398q c5398q = C5398q.f30770a;
            if (m22630e == null || m22630e.m22847t0()) {
                C4885x.m24816a(mo22619b, m24818c);
            }
        } catch (Throwable th2) {
            if (m22630e == null || m22630e.m22847t0()) {
                C4885x.m24816a(mo22619b, m24818c);
            }
            throw th2;
        }
    }

    /* renamed from: e */
    public static final void m22787e(AbstractC4492l0<?> abstractC4492l0) {
        AbstractC4507q0 m22835a = C4517t1.f26935a.m22835a();
        if (m22835a.m22799I0()) {
            m22835a.m22796E0(abstractC4492l0);
            return;
        }
        m22835a.m22798G0(true);
        try {
            m22786d(abstractC4492l0, abstractC4492l0.mo22753f(), true);
            do {
            } while (m22835a.m22801K0());
        } finally {
            try {
            } finally {
            }
        }
    }
}

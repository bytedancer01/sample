package p114g8;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p057d7.InterfaceC4323f;
import p057d7.InterfaceC4324g;
import p059d9.C4349a;
import p059d9.C4374m;
import p059d9.C4389t0;
import p059d9.C4400z;
import p163j7.C5310f;
import p168jc.C5354c;
import p182k7.C5516g;
import p228n7.C6662b;
import p228n7.C6668e;
import p228n7.C6674h;
import p228n7.C6675h0;
import p228n7.C6678j;
import p267p6.C7629w0;
import p283q7.C7839a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:g8/d.class
 */
/* renamed from: g8.d */
/* loaded from: combined.jar:classes2.jar:g8/d.class */
public final class C4971d implements InterfaceC4975h {

    /* renamed from: d */
    public static final int[] f28813d = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: b */
    public final int f28814b;

    /* renamed from: c */
    public final boolean f28815c;

    public C4971d() {
        this(0, true);
    }

    public C4971d(int i10, boolean z10) {
        this.f28814b = i10;
        this.f28815c = z10;
    }

    /* renamed from: b */
    public static void m25016b(int i10, List<Integer> list) {
        if (C5354c.m26640f(f28813d, i10) == -1 || list.contains(Integer.valueOf(i10))) {
            return;
        }
        list.add(Integer.valueOf(i10));
    }

    /* renamed from: e */
    public static C5516g m25017e(C4389t0 c4389t0, C7629w0 c7629w0, List<C7629w0> list) {
        int i10 = m25019g(c7629w0) ? 4 : 0;
        if (list == null) {
            list = Collections.emptyList();
        }
        return new C5516g(i10, c4389t0, null, list);
    }

    /* renamed from: f */
    public static C6675h0 m25018f(int i10, boolean z10, C7629w0 c7629w0, List<C7629w0> list, C4389t0 c4389t0) {
        int i11 = i10 | 16;
        if (list != null) {
            i11 |= 32;
        } else {
            list = z10 ? Collections.singletonList(new C7629w0.b().m33220e0("application/cea-608").m33194E()) : Collections.emptyList();
        }
        String str = c7629w0.f37083j;
        int i12 = i11;
        if (!TextUtils.isEmpty(str)) {
            int i13 = i11;
            if (!C4400z.m22294b(str, "audio/mp4a-latm")) {
                i13 = i11 | 2;
            }
            i12 = i13;
            if (!C4400z.m22294b(str, "video/avc")) {
                i12 = i13 | 4;
            }
        }
        return new C6675h0(2, c4389t0, new C6678j(i12, list));
    }

    /* renamed from: g */
    public static boolean m25019g(C7629w0 c7629w0) {
        C7839a c7839a = c7629w0.f37084k;
        if (c7839a == null) {
            return false;
        }
        for (int i10 = 0; i10 < c7839a.m34087k(); i10++) {
            if (c7839a.m34086j(i10) instanceof C4986s) {
                return !((C4986s) r0).f28972d.isEmpty();
            }
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m25020h(InterfaceC4323f interfaceC4323f, InterfaceC4324g interfaceC4324g) {
        boolean z10;
        try {
            z10 = interfaceC4323f.mo12029d(interfaceC4324g);
            interfaceC4324g.mo21801f();
        } catch (EOFException e10) {
            interfaceC4324g.mo21801f();
            z10 = false;
        } catch (Throwable th2) {
            interfaceC4324g.mo21801f();
            throw th2;
        }
        return z10;
    }

    @Override // p114g8.InterfaceC4975h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C4969b mo25021a(Uri uri, C7629w0 c7629w0, List<C7629w0> list, C4389t0 c4389t0, Map<String, List<String>> map, InterfaceC4324g interfaceC4324g) {
        int m22149a = C4374m.m22149a(c7629w0.f37086m);
        int m22150b = C4374m.m22150b(map);
        int m22151c = C4374m.m22151c(uri);
        int[] iArr = f28813d;
        ArrayList arrayList = new ArrayList(iArr.length);
        m25016b(m22149a, arrayList);
        m25016b(m22150b, arrayList);
        m25016b(m22151c, arrayList);
        for (int i10 : iArr) {
            m25016b(i10, arrayList);
        }
        InterfaceC4323f interfaceC4323f = null;
        interfaceC4324g.mo21801f();
        int i11 = 0;
        while (i11 < arrayList.size()) {
            int intValue = ((Integer) arrayList.get(i11)).intValue();
            InterfaceC4323f interfaceC4323f2 = (InterfaceC4323f) C4349a.m21882e(m25023d(intValue, c7629w0, list, c4389t0));
            if (m25020h(interfaceC4323f2, interfaceC4324g)) {
                return new C4969b(interfaceC4323f2, c7629w0, c4389t0);
            }
            InterfaceC4323f interfaceC4323f3 = interfaceC4323f;
            if (interfaceC4323f == null) {
                if (intValue != m22149a && intValue != m22150b && intValue != m22151c) {
                    interfaceC4323f3 = interfaceC4323f;
                    if (intValue != 11) {
                    }
                }
                interfaceC4323f3 = interfaceC4323f2;
            }
            i11++;
            interfaceC4323f = interfaceC4323f3;
        }
        return new C4969b((InterfaceC4323f) C4349a.m21882e(interfaceC4323f), c7629w0, c4389t0);
    }

    @SuppressLint({"SwitchIntDef"})
    /* renamed from: d */
    public final InterfaceC4323f m25023d(int i10, C7629w0 c7629w0, List<C7629w0> list, C4389t0 c4389t0) {
        if (i10 == 0) {
            return new C6662b();
        }
        if (i10 == 1) {
            return new C6668e();
        }
        if (i10 == 2) {
            return new C6674h();
        }
        if (i10 == 7) {
            return new C5310f(0, 0L);
        }
        if (i10 == 8) {
            return m25017e(c4389t0, c7629w0, list);
        }
        if (i10 == 11) {
            return m25018f(this.f28814b, this.f28815c, c7629w0, list, c4389t0);
        }
        if (i10 != 13) {
            return null;
        }
        return new C4989v(c7629w0.f37077d, c4389t0);
    }
}

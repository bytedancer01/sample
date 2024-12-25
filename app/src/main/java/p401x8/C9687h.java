package p401x8;

import android.text.TextUtils;
import java.util.ArrayList;
import p059d9.C4361f0;
import p243o8.AbstractC6921c;
import p243o8.C6925g;
import p243o8.InterfaceC6923e;
import p267p6.C7594k1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:x8/h.class
 */
/* renamed from: x8.h */
/* loaded from: combined.jar:classes2.jar:x8/h.class */
public final class C9687h extends AbstractC6921c {

    /* renamed from: o */
    public final C4361f0 f44225o;

    /* renamed from: p */
    public final C9682c f44226p;

    public C9687h() {
        super("WebvttDecoder");
        this.f44225o = new C4361f0();
        this.f44226p = new C9682c();
    }

    /* renamed from: B */
    public static int m40792B(C4361f0 c4361f0) {
        int i10 = -1;
        int i11 = 0;
        while (i10 == -1) {
            i11 = c4361f0.m21989e();
            String m22000p = c4361f0.m22000p();
            i10 = m22000p == null ? 0 : "STYLE".equals(m22000p) ? 2 : m22000p.startsWith("NOTE") ? 1 : 3;
        }
        c4361f0.m21983P(i11);
        return i10;
    }

    /* renamed from: C */
    public static void m40793C(C4361f0 c4361f0) {
        while (!TextUtils.isEmpty(c4361f0.m22000p())) {
        }
    }

    @Override // p243o8.AbstractC6921c
    /* renamed from: z */
    public InterfaceC6923e mo31882z(byte[] bArr, int i10, boolean z10) {
        C9684e m40766m;
        this.f44225o.m21981N(bArr, i10);
        ArrayList arrayList = new ArrayList();
        try {
            C9688i.m40798e(this.f44225o);
            do {
            } while (!TextUtils.isEmpty(this.f44225o.m22000p()));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int m40792B = m40792B(this.f44225o);
                if (m40792B == 0) {
                    return new C9690k(arrayList2);
                }
                if (m40792B == 1) {
                    m40793C(this.f44225o);
                } else if (m40792B == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new C6925g("A style block was found after the first cue.");
                    }
                    this.f44225o.m22000p();
                    arrayList.addAll(this.f44226p.m40725d(this.f44225o));
                } else if (m40792B == 3 && (m40766m = C9685f.m40766m(this.f44225o, arrayList)) != null) {
                    arrayList2.add(m40766m);
                }
            }
        } catch (C7594k1 e10) {
            throw new C6925g(e10);
        }
    }
}

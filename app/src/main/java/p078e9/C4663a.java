package p078e9;

import java.util.ArrayList;
import java.util.List;
import p059d9.C4350a0;
import p059d9.C4356d;
import p059d9.C4361f0;
import p267p6.C7594k1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:e9/a.class
 */
/* renamed from: e9.a */
/* loaded from: combined.jar:classes2.jar:e9/a.class */
public final class C4663a {

    /* renamed from: a */
    public final List<byte[]> f27499a;

    /* renamed from: b */
    public final int f27500b;

    /* renamed from: c */
    public final int f27501c;

    /* renamed from: d */
    public final int f27502d;

    /* renamed from: e */
    public final float f27503e;

    /* renamed from: f */
    public final String f27504f;

    public C4663a(List<byte[]> list, int i10, int i11, int i12, float f10, String str) {
        this.f27499a = list;
        this.f27500b = i10;
        this.f27501c = i11;
        this.f27502d = i12;
        this.f27503e = f10;
        this.f27504f = str;
    }

    /* renamed from: a */
    public static byte[] m23397a(C4361f0 c4361f0) {
        int m21977J = c4361f0.m21977J();
        int m21989e = c4361f0.m21989e();
        c4361f0.m21984Q(m21977J);
        return C4356d.m21932d(c4361f0.m21988d(), m21989e, m21977J);
    }

    /* renamed from: b */
    public static C4663a m23398b(C4361f0 c4361f0) {
        String str;
        int i10;
        float f10;
        try {
            c4361f0.m21984Q(4);
            int m21971D = (c4361f0.m21971D() & 3) + 1;
            if (m21971D == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int m21971D2 = c4361f0.m21971D() & 31;
            for (int i11 = 0; i11 < m21971D2; i11++) {
                arrayList.add(m23397a(c4361f0));
            }
            int m21971D3 = c4361f0.m21971D();
            for (int i12 = 0; i12 < m21971D3; i12++) {
                arrayList.add(m23397a(c4361f0));
            }
            int i13 = -1;
            if (m21971D2 > 0) {
                C4350a0.b m21896i = C4350a0.m21896i((byte[]) arrayList.get(0), m21971D, ((byte[]) arrayList.get(0)).length);
                i13 = m21896i.f26531e;
                i10 = m21896i.f26532f;
                f10 = m21896i.f26533g;
                str = C4356d.m21929a(m21896i.f26527a, m21896i.f26528b, m21896i.f26529c);
            } else {
                str = null;
                i10 = -1;
                f10 = 1.0f;
            }
            return new C4663a(arrayList, m21971D, i13, i10, f10, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw C7594k1.m32822a("Error parsing AVC config", e10);
        }
    }
}

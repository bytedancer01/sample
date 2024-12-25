package p078e9;

import java.util.Collections;
import java.util.List;
import p059d9.C4350a0;
import p059d9.C4356d;
import p059d9.C4361f0;
import p059d9.C4363g0;
import p267p6.C7594k1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:e9/g.class
 */
/* renamed from: e9.g */
/* loaded from: combined.jar:classes2.jar:e9/g.class */
public final class C4673g {

    /* renamed from: a */
    public final List<byte[]> f27587a;

    /* renamed from: b */
    public final int f27588b;

    /* renamed from: c */
    public final String f27589c;

    public C4673g(List<byte[]> list, int i10, String str) {
        this.f27587a = list;
        this.f27588b = i10;
        this.f27589c = str;
    }

    /* renamed from: a */
    public static C4673g m23510a(C4361f0 c4361f0) {
        try {
            c4361f0.m21984Q(21);
            int m21971D = c4361f0.m21971D();
            int m21971D2 = c4361f0.m21971D();
            int m21989e = c4361f0.m21989e();
            int i10 = 0;
            for (int i11 = 0; i11 < m21971D2; i11++) {
                c4361f0.m21984Q(1);
                int m21977J = c4361f0.m21977J();
                for (int i12 = 0; i12 < m21977J; i12++) {
                    int m21977J2 = c4361f0.m21977J();
                    i10 += m21977J2 + 4;
                    c4361f0.m21984Q(m21977J2);
                }
            }
            c4361f0.m21983P(m21989e);
            byte[] bArr = new byte[i10];
            String str = null;
            int i13 = 0;
            for (int i14 = 0; i14 < m21971D2; i14++) {
                int m21971D3 = c4361f0.m21971D();
                int m21977J3 = c4361f0.m21977J();
                int i15 = 0;
                while (i15 < m21977J3) {
                    int m21977J4 = c4361f0.m21977J();
                    byte[] bArr2 = C4350a0.f26520a;
                    System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                    int length = i13 + bArr2.length;
                    System.arraycopy(c4361f0.m21988d(), c4361f0.m21989e(), bArr, length, m21977J4);
                    String str2 = str;
                    if ((m21971D3 & 127) == 33) {
                        str2 = str;
                        if (i15 == 0) {
                            str2 = C4356d.m21931c(new C4363g0(bArr, length, length + m21977J4));
                        }
                    }
                    i13 = length + m21977J4;
                    c4361f0.m21984Q(m21977J4);
                    i15++;
                    str = str2;
                }
            }
            return new C4673g(i10 == 0 ? null : Collections.singletonList(bArr), (m21971D & 3) + 1, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw C7594k1.m32822a("Error parsing HEVC config", e10);
        }
    }
}

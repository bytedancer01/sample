package p289qe;

import p289qe.C7919j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qe/b.class
 */
/* renamed from: qe.b */
/* loaded from: combined.jar:classes2.jar:qe/b.class */
public final class C7911b {

    /* renamed from: a */
    public final int f38046a;

    /* renamed from: b */
    public final byte[] f38047b;

    public C7911b(int i10, byte[] bArr) {
        this.f38046a = i10;
        this.f38047b = bArr;
    }

    /* renamed from: b */
    public static C7911b[] m34267b(byte[] bArr, C7919j c7919j, EnumC7915f enumC7915f) {
        if (bArr.length != c7919j.m34295h()) {
            throw new IllegalArgumentException();
        }
        C7919j.b m34294f = c7919j.m34294f(enumC7915f);
        C7919j.a[] m34299a = m34294f.m34299a();
        int i10 = 0;
        for (C7919j.a aVar : m34299a) {
            i10 += aVar.m34297a();
        }
        C7911b[] c7911bArr = new C7911b[i10];
        int i11 = 0;
        for (C7919j.a aVar2 : m34299a) {
            int i12 = 0;
            while (i12 < aVar2.m34297a()) {
                int m34298b = aVar2.m34298b();
                c7911bArr[i11] = new C7911b(m34298b, new byte[m34294f.m34300b() + m34298b]);
                i12++;
                i11++;
            }
        }
        int length = c7911bArr[0].f38047b.length;
        do {
            i10--;
            if (i10 < 0) {
                break;
            }
        } while (c7911bArr[i10].f38047b.length != length);
        int i13 = i10 + 1;
        int m34300b = length - m34294f.m34300b();
        int i14 = 0;
        for (int i15 = 0; i15 < m34300b; i15++) {
            int i16 = 0;
            while (i16 < i11) {
                c7911bArr[i16].f38047b[i15] = bArr[i14];
                i16++;
                i14++;
            }
        }
        int i17 = i13;
        int i18 = i14;
        while (i17 < i11) {
            c7911bArr[i17].f38047b[m34300b] = bArr[i18];
            i17++;
            i18++;
        }
        int length2 = c7911bArr[0].f38047b.length;
        for (int i19 = m34300b; i19 < length2; i19++) {
            int i20 = 0;
            while (i20 < i11) {
                c7911bArr[i20].f38047b[i20 < i13 ? i19 : i19 + 1] = bArr[i18];
                i20++;
                i18++;
            }
        }
        return c7911bArr;
    }

    /* renamed from: a */
    public byte[] m34268a() {
        return this.f38047b;
    }

    /* renamed from: c */
    public int m34269c() {
        return this.f38046a;
    }
}

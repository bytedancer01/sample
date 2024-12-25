package p059d9;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/d.class
 */
/* renamed from: d9.d */
/* loaded from: combined.jar:classes2.jar:d9/d.class */
public final class C4356d {

    /* renamed from: a */
    public static final byte[] f26555a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final String[] f26556b = {"", "A", "B", "C"};

    /* renamed from: a */
    public static String m21929a(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    /* renamed from: b */
    public static List<byte[]> m21930b(boolean z10) {
        return Collections.singletonList(z10 ? new byte[]{1} : new byte[]{0});
    }

    /* renamed from: c */
    public static String m21931c(C4363g0 c4363g0) {
        int i10;
        c4363g0.m22022l(24);
        int m22015e = c4363g0.m22015e(2);
        boolean m22014d = c4363g0.m22014d();
        int m22015e2 = c4363g0.m22015e(5);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = i12;
            if (i11 >= 32) {
                break;
            }
            int i13 = i10;
            if (c4363g0.m22014d()) {
                i13 = i10 | (1 << i11);
            }
            i11++;
            i12 = i13;
        }
        int[] iArr = new int[6];
        for (int i14 = 0; i14 < 6; i14++) {
            iArr[i14] = c4363g0.m22015e(8);
        }
        StringBuilder sb2 = new StringBuilder(C4401z0.m22321E("hvc1.%s%d.%X.%c%d", f26556b[m22015e], Integer.valueOf(m22015e2), Integer.valueOf(i10), Character.valueOf(m22014d ? 'H' : 'L'), Integer.valueOf(c4363g0.m22015e(8))));
        int i15 = 6;
        while (i15 > 0 && iArr[i15 - 1] == 0) {
            i15--;
        }
        for (int i16 = 0; i16 < i15; i16++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i16])));
        }
        return sb2.toString();
    }

    /* renamed from: d */
    public static byte[] m21932d(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = f26555a;
        byte[] bArr3 = new byte[bArr2.length + i11];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, bArr2.length, i11);
        return bArr3;
    }

    /* renamed from: e */
    public static int m21933e(byte[] bArr, int i10) {
        int length = bArr.length;
        int length2 = f26555a.length;
        while (i10 <= length - length2) {
            if (m21934f(bArr, i10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* renamed from: f */
    public static boolean m21934f(byte[] bArr, int i10) {
        if (bArr.length - i10 <= f26555a.length) {
            return false;
        }
        int i11 = 0;
        while (true) {
            byte[] bArr2 = f26555a;
            if (i11 >= bArr2.length) {
                return true;
            }
            if (bArr[i10 + i11] != bArr2[i11]) {
                return false;
            }
            i11++;
        }
    }

    /* renamed from: g */
    public static Pair<Integer, Integer> m21935g(byte[] bArr) {
        C4361f0 c4361f0 = new C4361f0(bArr);
        c4361f0.m21983P(9);
        int m21971D = c4361f0.m21971D();
        c4361f0.m21983P(20);
        return Pair.create(Integer.valueOf(c4361f0.m21975H()), Integer.valueOf(m21971D));
    }

    /* renamed from: h */
    public static boolean m21936h(List<byte[]> list) {
        boolean z10 = false;
        if (list.size() == 1) {
            z10 = false;
            if (list.get(0).length == 1) {
                z10 = false;
                if (list.get(0)[0] == 1) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], byte[][]] */
    /* renamed from: i */
    public static byte[][] m21937i(byte[] bArr) {
        int m21933e;
        if (!m21934f(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        do {
            arrayList.add(Integer.valueOf(i10));
            m21933e = m21933e(bArr, i10 + f26555a.length);
            i10 = m21933e;
        } while (m21933e != -1);
        ?? r02 = new byte[arrayList.size()];
        int i11 = 0;
        while (i11 < arrayList.size()) {
            int intValue = ((Integer) arrayList.get(i11)).intValue();
            int intValue2 = (i11 < arrayList.size() - 1 ? ((Integer) arrayList.get(i11 + 1)).intValue() : bArr.length) - intValue;
            byte[] bArr2 = new byte[intValue2];
            System.arraycopy(bArr, intValue, bArr2, 0, intValue2);
            r02[i11] = bArr2;
            i11++;
        }
        return r02;
    }
}

package p301r6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r6/k0.class
 */
/* renamed from: r6.k0 */
/* loaded from: combined.jar:classes2.jar:r6/k0.class */
public class C7987k0 {
    /* renamed from: a */
    public static List<byte[]> m34730a(byte[] bArr) {
        long m34737h = m34737h(m34734e(bArr));
        long m34737h2 = m34737h(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(m34731b(m34737h));
        arrayList.add(m34731b(m34737h2));
        return arrayList;
    }

    /* renamed from: b */
    public static byte[] m34731b(long j10) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j10).array();
    }

    /* renamed from: c */
    public static int m34732c(byte[] bArr) {
        return bArr[9] & 255;
    }

    /* renamed from: d */
    public static int m34733d(List<byte[]> list) {
        return list.size() == 3 ? (int) m34736g(ByteBuffer.wrap(list.get(1)).order(ByteOrder.nativeOrder()).getLong()) : m34734e(list.get(0));
    }

    /* renamed from: e */
    public static int m34734e(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    /* renamed from: f */
    public static int m34735f(List<byte[]> list) {
        if (list.size() == 3) {
            return (int) m34736g(ByteBuffer.wrap(list.get(2)).order(ByteOrder.nativeOrder()).getLong());
        }
        return 3840;
    }

    /* renamed from: g */
    public static long m34736g(long j10) {
        return (j10 * 48000) / 1000000000;
    }

    /* renamed from: h */
    public static long m34737h(long j10) {
        return (j10 * 1000000000) / 48000;
    }
}

package de;

import be.C0892a;
import be.C0894c;
import be.C0895d;
import p444zd.C10194b;
import p444zd.C10197e;
import td.C8689d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:de/d.class
 */
/* renamed from: de.d */
/* loaded from: combined.jar:classes2.jar:de/d.class */
public final class C4450d {

    /* renamed from: a */
    public final C0894c f26827a = new C0894c(C0892a.f6015m);

    /* renamed from: a */
    public final void m22586a(byte[] bArr, int i10) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        try {
            this.f26827a.m5548a(iArr, bArr.length - i10);
            for (int i12 = 0; i12 < i10; i12++) {
                bArr[i12] = (byte) iArr[i12];
            }
        } catch (C0895d e10) {
            throw C8689d.m37196a();
        }
    }

    /* renamed from: b */
    public C10197e m22587b(C10194b c10194b) {
        C4426a c4426a = new C4426a(c10194b);
        C4427b[] m22533b = C4427b.m22533b(c4426a.m22526c(), c4426a.m22525b());
        int i10 = 0;
        for (C4427b c4427b : m22533b) {
            i10 += c4427b.m22535c();
        }
        byte[] bArr = new byte[i10];
        int length = m22533b.length;
        for (int i11 = 0; i11 < length; i11++) {
            C4427b c4427b2 = m22533b[i11];
            byte[] m22534a = c4427b2.m22534a();
            int m22535c = c4427b2.m22535c();
            m22586a(m22534a, m22535c);
            for (int i12 = 0; i12 < m22535c; i12++) {
                bArr[(i12 * length) + i11] = m22534a[i12];
            }
        }
        return C4449c.m22577a(bArr);
    }
}

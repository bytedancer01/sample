package de;

import de.C4451e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:de/b.class
 */
/* renamed from: de.b */
/* loaded from: combined.jar:classes2.jar:de/b.class */
public final class C4427b {

    /* renamed from: a */
    public final int f26753a;

    /* renamed from: b */
    public final byte[] f26754b;

    public C4427b(int i10, byte[] bArr) {
        this.f26753a = i10;
        this.f26754b = bArr;
    }

    /* renamed from: b */
    public static C4427b[] m22533b(byte[] bArr, C4451e c4451e) {
        C4451e.c m22592d = c4451e.m22592d();
        C4451e.b[] m22599a = m22592d.m22599a();
        int i10 = 0;
        for (C4451e.b bVar : m22599a) {
            i10 += bVar.m22597a();
        }
        C4427b[] c4427bArr = new C4427b[i10];
        int i11 = 0;
        for (C4451e.b bVar2 : m22599a) {
            int i12 = 0;
            while (i12 < bVar2.m22597a()) {
                int m22598b = bVar2.m22598b();
                c4427bArr[i11] = new C4427b(m22598b, new byte[m22592d.m22600b() + m22598b]);
                i12++;
                i11++;
            }
        }
        int length = c4427bArr[0].f26754b.length - m22592d.m22600b();
        int i13 = length - 1;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            int i16 = 0;
            while (i16 < i11) {
                c4427bArr[i16].f26754b[i15] = bArr[i14];
                i16++;
                i14++;
            }
        }
        boolean z10 = c4451e.m22596i() == 24;
        int i17 = z10 ? 8 : i11;
        int i18 = 0;
        while (i18 < i17) {
            c4427bArr[i18].f26754b[i13] = bArr[i14];
            i18++;
            i14++;
        }
        int length2 = c4427bArr[0].f26754b.length;
        int i19 = i14;
        for (int i20 = length; i20 < length2; i20++) {
            int i21 = 0;
            while (i21 < i11) {
                int i22 = z10 ? (i21 + 8) % i11 : i21;
                c4427bArr[i22].f26754b[(!z10 || i22 <= 7) ? i20 : i20 - 1] = bArr[i19];
                i21++;
                i19++;
            }
        }
        if (i19 == bArr.length) {
            return c4427bArr;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public byte[] m22534a() {
        return this.f26754b;
    }

    /* renamed from: c */
    public int m22535c() {
        return this.f26753a;
    }
}

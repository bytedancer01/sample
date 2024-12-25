package ge;

import be.C0892a;
import be.C0894c;
import be.C0895d;
import java.util.Map;
import p444zd.C10194b;
import p444zd.C10197e;
import td.C8689d;
import td.C8691f;
import td.EnumC8690e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ge/c.class
 */
/* renamed from: ge.c */
/* loaded from: combined.jar:classes2.jar:ge/c.class */
public final class C5002c {

    /* renamed from: a */
    public final C0894c f29011a = new C0894c(C0892a.f6017o);

    /* renamed from: a */
    public final void m25175a(byte[] bArr, int i10, int i11, int i12, int i13) {
        int i14 = i11 + i12;
        int i15 = i13 == 0 ? 1 : 2;
        int[] iArr = new int[i14 / i15];
        for (int i16 = 0; i16 < i14; i16++) {
            if (i13 == 0 || i16 % 2 == i13 - 1) {
                iArr[i16 / i15] = bArr[i16 + i10] & 255;
            }
        }
        try {
            this.f29011a.m5548a(iArr, i12 / i15);
            for (int i17 = 0; i17 < i11; i17++) {
                if (i13 == 0 || i17 % 2 == i13 - 1) {
                    bArr[i17 + i10] = (byte) iArr[i17 / i15];
                }
            }
        } catch (C0895d e10) {
            throw C8689d.m37196a();
        }
    }

    /* renamed from: b */
    public C10197e m25176b(C10194b c10194b, Map<EnumC8690e, ?> map) {
        int i10;
        byte[] m25165a = new C5000a(c10194b).m25165a();
        m25175a(m25165a, 0, 10, 10, 0);
        int i11 = m25165a[0] & 15;
        if (i11 == 2 || i11 == 3 || i11 == 4) {
            m25175a(m25165a, 20, 84, 40, 1);
            m25175a(m25165a, 20, 84, 40, 2);
            i10 = 94;
        } else {
            if (i11 != 5) {
                throw C8691f.m37197a();
            }
            m25175a(m25165a, 20, 68, 56, 1);
            m25175a(m25165a, 20, 68, 56, 2);
            i10 = 78;
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(m25165a, 0, bArr, 0, 10);
        System.arraycopy(m25165a, 20, bArr, 10, bArr.length - 10);
        return C5001b.m25166a(bArr, i11);
    }
}

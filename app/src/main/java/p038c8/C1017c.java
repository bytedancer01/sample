package p038c8;

import p009a8.C0118r0;
import p038c8.InterfaceC1021g;
import p057d7.C4322e;
import p057d7.InterfaceC4337t;
import p059d9.C4392v;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:c8/c.class
 */
/* renamed from: c8.c */
/* loaded from: combined.jar:classes2.jar:c8/c.class */
public final class C1017c implements InterfaceC1021g.b {

    /* renamed from: a */
    public final int[] f6848a;

    /* renamed from: b */
    public final C0118r0[] f6849b;

    public C1017c(int[] iArr, C0118r0[] c0118r0Arr) {
        this.f6848a = iArr;
        this.f6849b = c0118r0Arr;
    }

    /* renamed from: a */
    public int[] m5992a() {
        int[] iArr = new int[this.f6849b.length];
        int i10 = 0;
        while (true) {
            C0118r0[] c0118r0Arr = this.f6849b;
            if (i10 >= c0118r0Arr.length) {
                return iArr;
            }
            iArr[i10] = c0118r0Arr[i10].m579G();
            i10++;
        }
    }

    /* renamed from: b */
    public void m5993b(long j10) {
        for (C0118r0 c0118r0 : this.f6849b) {
            c0118r0.m599a0(j10);
        }
    }

    @Override // p038c8.InterfaceC1021g.b
    /* renamed from: e */
    public InterfaceC4337t mo5994e(int i10, int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.f6848a;
            if (i12 >= iArr.length) {
                C4392v.m22270d("BaseMediaChunkOutput", "Unmatched track of type: " + i11);
                return new C4322e();
            }
            if (i11 == iArr[i12]) {
                return this.f6849b[i12];
            }
            i12++;
        }
    }
}

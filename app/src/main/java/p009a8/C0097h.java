package p009a8;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:a8/h.class
 */
/* renamed from: a8.h */
/* loaded from: combined.jar:classes2.jar:a8/h.class */
public class C0097h implements InterfaceC0122t0 {

    /* renamed from: b */
    public final InterfaceC0122t0[] f348b;

    public C0097h(InterfaceC0122t0[] interfaceC0122t0Arr) {
        this.f348b = interfaceC0122t0Arr;
    }

    @Override // p009a8.InterfaceC0122t0
    /* renamed from: b */
    public boolean mo335b() {
        for (InterfaceC0122t0 interfaceC0122t0 : this.f348b) {
            if (interfaceC0122t0.mo335b()) {
                return true;
            }
        }
        return false;
    }

    @Override // p009a8.InterfaceC0122t0
    /* renamed from: c */
    public final long mo336c() {
        long j10;
        InterfaceC0122t0[] interfaceC0122t0Arr = this.f348b;
        int length = interfaceC0122t0Arr.length;
        int i10 = 0;
        long j11 = Long.MAX_VALUE;
        while (true) {
            j10 = j11;
            if (i10 >= length) {
                break;
            }
            long mo336c = interfaceC0122t0Arr[i10].mo336c();
            long j12 = j10;
            if (mo336c != Long.MIN_VALUE) {
                j12 = Math.min(j10, mo336c);
            }
            i10++;
            j11 = j12;
        }
        long j13 = j10;
        if (j10 == Long.MAX_VALUE) {
            j13 = Long.MIN_VALUE;
        }
        return j13;
    }

    @Override // p009a8.InterfaceC0122t0
    /* renamed from: d */
    public boolean mo337d(long j10) {
        boolean z10;
        boolean mo337d;
        boolean z11 = false;
        while (true) {
            long mo336c = mo336c();
            if (mo336c == Long.MIN_VALUE) {
                break;
            }
            InterfaceC0122t0[] interfaceC0122t0Arr = this.f348b;
            int length = interfaceC0122t0Arr.length;
            int i10 = 0;
            boolean z12 = false;
            while (true) {
                z10 = z12;
                if (i10 >= length) {
                    break;
                }
                InterfaceC0122t0 interfaceC0122t0 = interfaceC0122t0Arr[i10];
                long mo336c2 = interfaceC0122t0.mo336c();
                boolean z13 = mo336c2 != Long.MIN_VALUE && mo336c2 <= j10;
                if (mo336c2 != mo336c) {
                    mo337d = z10;
                    if (!z13) {
                        i10++;
                        z12 = mo337d;
                    }
                }
                mo337d = z10 | interfaceC0122t0.mo337d(j10);
                i10++;
                z12 = mo337d;
            }
            boolean z14 = z11 | z10;
            z11 = z14;
            if (!z10) {
                z11 = z14;
                break;
            }
        }
        return z11;
    }

    @Override // p009a8.InterfaceC0122t0
    /* renamed from: g */
    public final long mo340g() {
        long j10;
        InterfaceC0122t0[] interfaceC0122t0Arr = this.f348b;
        int length = interfaceC0122t0Arr.length;
        int i10 = 0;
        long j11 = Long.MAX_VALUE;
        while (true) {
            j10 = j11;
            if (i10 >= length) {
                break;
            }
            long mo340g = interfaceC0122t0Arr[i10].mo340g();
            long j12 = j10;
            if (mo340g != Long.MIN_VALUE) {
                j12 = Math.min(j10, mo340g);
            }
            i10++;
            j11 = j12;
        }
        long j13 = j10;
        if (j10 == Long.MAX_VALUE) {
            j13 = Long.MIN_VALUE;
        }
        return j13;
    }

    @Override // p009a8.InterfaceC0122t0
    /* renamed from: h */
    public final void mo341h(long j10) {
        for (InterfaceC0122t0 interfaceC0122t0 : this.f348b) {
            interfaceC0122t0.mo341h(j10);
        }
    }
}

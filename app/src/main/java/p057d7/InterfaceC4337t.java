package p057d7;

import java.util.Arrays;
import p027b9.InterfaceC0846i;
import p059d9.C4361f0;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d7/t.class
 */
/* renamed from: d7.t */
/* loaded from: combined.jar:classes2.jar:d7/t.class */
public interface InterfaceC4337t {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:d7/t$a.class
     */
    /* renamed from: d7.t$a */
    /* loaded from: combined.jar:classes2.jar:d7/t$a.class */
    public static final class a {

        /* renamed from: a */
        public final int f26495a;

        /* renamed from: b */
        public final byte[] f26496b;

        /* renamed from: c */
        public final int f26497c;

        /* renamed from: d */
        public final int f26498d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f26495a = i10;
            this.f26496b = bArr;
            this.f26497c = i11;
            this.f26498d = i12;
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f26495a != aVar.f26495a || this.f26497c != aVar.f26497c || this.f26498d != aVar.f26498d || !Arrays.equals(this.f26496b, aVar.f26496b)) {
                z10 = false;
            }
            return z10;
        }

        public int hashCode() {
            return (((((this.f26495a * 31) + Arrays.hashCode(this.f26496b)) * 31) + this.f26497c) * 31) + this.f26498d;
        }
    }

    /* renamed from: a */
    void mo598a(C4361f0 c4361f0, int i10, int i11);

    /* renamed from: b */
    void mo600b(long j10, int i10, int i11, int i12, a aVar);

    /* renamed from: c */
    int mo602c(InterfaceC0846i interfaceC0846i, int i10, boolean z10, int i11);

    /* renamed from: d */
    int mo604d(InterfaceC0846i interfaceC0846i, int i10, boolean z10);

    /* renamed from: e */
    void mo606e(C4361f0 c4361f0, int i10);

    /* renamed from: f */
    void mo608f(C7629w0 c7629w0);
}

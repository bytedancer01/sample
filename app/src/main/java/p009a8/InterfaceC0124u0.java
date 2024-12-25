package p009a8;

import java.util.Arrays;
import java.util.Random;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:a8/u0.class
 */
/* renamed from: a8.u0 */
/* loaded from: combined.jar:classes2.jar:a8/u0.class */
public interface InterfaceC0124u0 {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:a8/u0$a.class
     */
    /* renamed from: a8.u0$a */
    /* loaded from: combined.jar:classes2.jar:a8/u0$a.class */
    public static class a implements InterfaceC0124u0 {

        /* renamed from: a */
        public final Random f549a;

        /* renamed from: b */
        public final int[] f550b;

        /* renamed from: c */
        public final int[] f551c;

        public a(int i10) {
            this(i10, new Random());
        }

        public a(int i10, Random random) {
            this(m638h(i10, random), random);
        }

        public a(int[] iArr, Random random) {
            this.f550b = iArr;
            this.f549a = random;
            this.f551c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f551c[iArr[i10]] = i10;
            }
        }

        /* renamed from: h */
        public static int[] m638h(int i10, Random random) {
            int[] iArr = new int[i10];
            int i11 = 0;
            while (true) {
                int i12 = i11;
                if (i12 >= i10) {
                    return iArr;
                }
                int i13 = i12 + 1;
                int nextInt = random.nextInt(i13);
                iArr[i12] = iArr[nextInt];
                iArr[nextInt] = i12;
                i11 = i13;
            }
        }

        @Override // p009a8.InterfaceC0124u0
        /* renamed from: a */
        public InterfaceC0124u0 mo631a(int i10, int i11) {
            int i12 = i11 - i10;
            int[] iArr = new int[this.f550b.length - i12];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr2 = this.f550b;
                if (i13 >= iArr2.length) {
                    return new a(iArr, new Random(this.f549a.nextLong()));
                }
                int i15 = iArr2[i13];
                if (i15 < i10 || i15 >= i11) {
                    int i16 = i15;
                    if (i15 >= i10) {
                        i16 = i15 - i12;
                    }
                    iArr[i13 - i14] = i16;
                } else {
                    i14++;
                }
                i13++;
            }
        }

        @Override // p009a8.InterfaceC0124u0
        /* renamed from: b */
        public int mo632b(int i10) {
            int i11 = this.f551c[i10];
            int i12 = -1;
            int i13 = i11 - 1;
            if (i13 >= 0) {
                i12 = this.f550b[i13];
            }
            return i12;
        }

        @Override // p009a8.InterfaceC0124u0
        /* renamed from: c */
        public int mo633c(int i10) {
            int i11 = this.f551c[i10] + 1;
            int[] iArr = this.f550b;
            return i11 < iArr.length ? iArr[i11] : -1;
        }

        @Override // p009a8.InterfaceC0124u0
        /* renamed from: d */
        public int mo634d() {
            int[] iArr = this.f550b;
            return iArr.length > 0 ? iArr[iArr.length - 1] : -1;
        }

        @Override // p009a8.InterfaceC0124u0
        /* renamed from: e */
        public InterfaceC0124u0 mo635e() {
            return new a(0, new Random(this.f549a.nextLong()));
        }

        @Override // p009a8.InterfaceC0124u0
        /* renamed from: f */
        public int mo636f() {
            int[] iArr = this.f550b;
            return iArr.length > 0 ? iArr[0] : -1;
        }

        @Override // p009a8.InterfaceC0124u0
        /* renamed from: g */
        public InterfaceC0124u0 mo637g(int i10, int i11) {
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int i14 = i13;
                if (i14 >= i11) {
                    break;
                }
                iArr[i14] = this.f549a.nextInt(this.f550b.length + 1);
                int i15 = i14 + 1;
                int nextInt = this.f549a.nextInt(i15);
                iArr2[i14] = iArr2[nextInt];
                iArr2[nextInt] = i14 + i10;
                i13 = i15;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f550b.length + i11];
            int i16 = 0;
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f550b;
                if (i12 >= iArr4.length + i11) {
                    return new a(iArr3, new Random(this.f549a.nextLong()));
                }
                if (i16 >= i11 || i17 != iArr[i16]) {
                    int i18 = iArr4[i17];
                    iArr3[i12] = i18;
                    if (i18 >= i10) {
                        iArr3[i12] = i18 + i11;
                    }
                    i17++;
                } else {
                    iArr3[i12] = iArr2[i16];
                    i16++;
                }
                i12++;
            }
        }

        @Override // p009a8.InterfaceC0124u0
        public int getLength() {
            return this.f550b.length;
        }
    }

    /* renamed from: a */
    InterfaceC0124u0 mo631a(int i10, int i11);

    /* renamed from: b */
    int mo632b(int i10);

    /* renamed from: c */
    int mo633c(int i10);

    /* renamed from: d */
    int mo634d();

    /* renamed from: e */
    InterfaceC0124u0 mo635e();

    /* renamed from: f */
    int mo636f();

    /* renamed from: g */
    InterfaceC0124u0 mo637g(int i10, int i11);

    int getLength();
}

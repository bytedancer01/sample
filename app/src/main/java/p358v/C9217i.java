package p358v;

import java.util.Arrays;
import java.util.HashSet;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:v/i.class
 */
/* renamed from: v.i */
/* loaded from: combined.jar:classes1.jar:v/i.class */
public class C9217i {

    /* renamed from: o */
    public static int f42074o = 1;

    /* renamed from: a */
    public boolean f42075a;

    /* renamed from: b */
    public String f42076b;

    /* renamed from: f */
    public float f42080f;

    /* renamed from: j */
    public a f42084j;

    /* renamed from: c */
    public int f42077c = -1;

    /* renamed from: d */
    public int f42078d = -1;

    /* renamed from: e */
    public int f42079e = 0;

    /* renamed from: g */
    public boolean f42081g = false;

    /* renamed from: h */
    public float[] f42082h = new float[9];

    /* renamed from: i */
    public float[] f42083i = new float[9];

    /* renamed from: k */
    public C9210b[] f42085k = new C9210b[16];

    /* renamed from: l */
    public int f42086l = 0;

    /* renamed from: m */
    public int f42087m = 0;

    /* renamed from: n */
    public HashSet<C9210b> f42088n = null;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:v/i$a.class
     */
    /* renamed from: v.i$a */
    /* loaded from: combined.jar:classes1.jar:v/i$a.class */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C9217i(a aVar, String str) {
        this.f42084j = aVar;
    }

    /* renamed from: b */
    public static void m38783b() {
        f42074o++;
    }

    /* renamed from: a */
    public final void m38784a(C9210b c9210b) {
        int i10 = 0;
        while (true) {
            int i11 = this.f42086l;
            if (i10 >= i11) {
                C9210b[] c9210bArr = this.f42085k;
                if (i11 >= c9210bArr.length) {
                    this.f42085k = (C9210b[]) Arrays.copyOf(c9210bArr, c9210bArr.length * 2);
                }
                C9210b[] c9210bArr2 = this.f42085k;
                int i12 = this.f42086l;
                c9210bArr2[i12] = c9210b;
                this.f42086l = i12 + 1;
                return;
            }
            if (this.f42085k[i10] == c9210b) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* renamed from: c */
    public final void m38785c(C9210b c9210b) {
        int i10 = this.f42086l;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f42085k[i11] == c9210b) {
                while (i11 < i10 - 1) {
                    C9210b[] c9210bArr = this.f42085k;
                    int i12 = i11 + 1;
                    c9210bArr[i11] = c9210bArr[i12];
                    i11 = i12;
                }
                this.f42086l--;
                return;
            }
            i11++;
        }
    }

    /* renamed from: d */
    public void m38786d() {
        this.f42076b = null;
        this.f42084j = a.UNKNOWN;
        this.f42079e = 0;
        this.f42077c = -1;
        this.f42078d = -1;
        this.f42080f = 0.0f;
        this.f42081g = false;
        int i10 = this.f42086l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f42085k[i11] = null;
        }
        this.f42086l = 0;
        this.f42087m = 0;
        this.f42075a = false;
        Arrays.fill(this.f42083i, 0.0f);
    }

    /* renamed from: e */
    public void m38787e(C9212d c9212d, float f10) {
        this.f42080f = f10;
        this.f42081g = true;
        int i10 = this.f42086l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f42085k[i11].m38712B(c9212d, this, false);
        }
        this.f42086l = 0;
    }

    /* renamed from: f */
    public void m38788f(a aVar, String str) {
        this.f42084j = aVar;
    }

    /* renamed from: g */
    public final void m38789g(C9210b c9210b) {
        int i10 = this.f42086l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f42085k[i11].mo38713C(c9210b, false);
        }
        this.f42086l = 0;
    }

    public String toString() {
        StringBuilder sb2;
        if (this.f42076b != null) {
            sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(this.f42076b);
        } else {
            sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(this.f42077c);
        }
        return sb2.toString();
    }
}

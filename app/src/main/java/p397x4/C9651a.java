package p397x4;

import java.io.Serializable;
import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x4/a.class
 */
/* renamed from: x4.a */
/* loaded from: combined.jar:classes1.jar:x4/a.class */
public final class C9651a implements Serializable {

    /* renamed from: b */
    public final transient int[] f44031b;

    /* renamed from: c */
    public final transient char[] f44032c;

    /* renamed from: d */
    public final transient byte[] f44033d;

    /* renamed from: e */
    public final String f44034e;

    /* renamed from: f */
    public final transient boolean f44035f;

    /* renamed from: g */
    public final transient char f44036g;

    /* renamed from: h */
    public final transient int f44037h;

    public C9651a(String str, String str2, boolean z10, char c10, int i10) {
        int[] iArr = new int[128];
        this.f44031b = iArr;
        char[] cArr = new char[64];
        this.f44032c = cArr;
        this.f44033d = new byte[64];
        this.f44034e = str;
        this.f44035f = z10;
        this.f44036g = c10;
        this.f44037h = i10;
        int length = str2.length();
        if (length != 64) {
            throw new IllegalArgumentException("Base64Alphabet length must be exactly 64 (was " + length + ")");
        }
        str2.getChars(0, length, cArr, 0);
        Arrays.fill(iArr, -1);
        for (int i11 = 0; i11 < length; i11++) {
            char c11 = this.f44032c[i11];
            this.f44033d[i11] = (byte) c11;
            this.f44031b[c11] = i11;
        }
        if (z10) {
            this.f44031b[c10] = -2;
        }
    }

    public C9651a(C9651a c9651a, String str, int i10) {
        this(c9651a, str, c9651a.f44035f, c9651a.f44036g, i10);
    }

    public C9651a(C9651a c9651a, String str, boolean z10, char c10, int i10) {
        int[] iArr = new int[128];
        this.f44031b = iArr;
        char[] cArr = new char[64];
        this.f44032c = cArr;
        byte[] bArr = new byte[64];
        this.f44033d = bArr;
        this.f44034e = str;
        byte[] bArr2 = c9651a.f44033d;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr2 = c9651a.f44032c;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        int[] iArr2 = c9651a.f44031b;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.f44035f = z10;
        this.f44036g = c10;
        this.f44037h = i10;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return this.f44034e.hashCode();
    }

    public String toString() {
        return this.f44034e;
    }
}

package p411xi;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9367f;
import p411xi.C9764h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xi/a.class
 */
/* renamed from: xi.a */
/* loaded from: combined.jar:classes2.jar:xi/a.class */
public final class C9753a {

    /* renamed from: a */
    @NotNull
    public static final byte[] f44500a;

    /* renamed from: b */
    @NotNull
    public static final byte[] f44501b;

    static {
        C9764h.a aVar = C9764h.f44531f;
        f44500a = aVar.m41212d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").m41194j();
        f44501b = aVar.m41212d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").m41194j();
    }

    @Nullable
    /* renamed from: a */
    public static final byte[] m41075a(@NotNull String str) {
        int i10;
        int i11;
        int i12;
        int i13;
        char charAt;
        C9367f.m39526e(str, "$this$decodeBase64ToArray");
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i14 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i14];
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            int i19 = i18;
            if (i15 >= length) {
                int i20 = i16 % 4;
                if (i20 == 1) {
                    return null;
                }
                if (i20 == 2) {
                    bArr[i19] = (byte) ((i17 << 12) >> 16);
                    i19++;
                } else if (i20 == 3) {
                    int i21 = i17 << 6;
                    int i22 = i19 + 1;
                    bArr[i19] = (byte) (i21 >> 16);
                    i19 = i22 + 1;
                    bArr[i22] = (byte) (i21 >> 8);
                }
                if (i19 == i14) {
                    return bArr;
                }
                byte[] copyOf = Arrays.copyOf(bArr, i19);
                C9367f.m39525d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                return copyOf;
            }
            char charAt2 = str.charAt(i15);
            if ('A' <= charAt2 && 'Z' >= charAt2) {
                i10 = charAt2 - 'A';
            } else if ('a' <= charAt2 && 'z' >= charAt2) {
                i10 = charAt2 - 'G';
            } else if ('0' <= charAt2 && '9' >= charAt2) {
                i10 = charAt2 + 4;
            } else if (charAt2 == '+' || charAt2 == '-') {
                i10 = 62;
            } else if (charAt2 == '/' || charAt2 == '_') {
                i10 = 63;
            } else {
                i11 = i16;
                i12 = i17;
                i13 = i19;
                if (charAt2 != '\n') {
                    i11 = i16;
                    i12 = i17;
                    i13 = i19;
                    if (charAt2 != '\r') {
                        i11 = i16;
                        i12 = i17;
                        i13 = i19;
                        if (charAt2 == ' ') {
                            continue;
                        } else {
                            if (charAt2 != '\t') {
                                return null;
                            }
                            i11 = i16;
                            i12 = i17;
                            i13 = i19;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
                i15++;
                i16 = i11;
                i17 = i12;
                i18 = i13;
            }
            int i23 = (i17 << 6) | i10;
            int i24 = i16 + 1;
            i11 = i24;
            i12 = i23;
            i13 = i19;
            if (i24 % 4 == 0) {
                int i25 = i19 + 1;
                bArr[i19] = (byte) (i23 >> 16);
                int i26 = i25 + 1;
                bArr[i25] = (byte) (i23 >> 8);
                bArr[i26] = (byte) i23;
                i13 = i26 + 1;
                i12 = i23;
                i11 = i24;
            }
            i15++;
            i16 = i11;
            i17 = i12;
            i18 = i13;
        }
    }

    @NotNull
    /* renamed from: b */
    public static final String m41076b(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        C9367f.m39526e(bArr, "$this$encodeBase64");
        C9367f.m39526e(bArr2, "map");
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            int i13 = i12 + 1;
            byte b11 = bArr[i12];
            byte b12 = bArr[i13];
            int i14 = i11 + 1;
            bArr3[i11] = bArr2[(b10 & 255) >> 2];
            int i15 = i14 + 1;
            bArr3[i14] = bArr2[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i16 = i15 + 1;
            bArr3[i15] = bArr2[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i11 = i16 + 1;
            bArr3[i16] = bArr2[b12 & 63];
            i10 = i13 + 1;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b13 = bArr[i10];
            int i17 = i11 + 1;
            bArr3[i11] = bArr2[(b13 & 255) >> 2];
            int i18 = i17 + 1;
            bArr3[i17] = bArr2[(b13 & 3) << 4];
            byte b14 = (byte) 61;
            bArr3[i18] = b14;
            bArr3[i18 + 1] = b14;
        } else if (length2 == 2) {
            byte b15 = bArr[i10];
            byte b16 = bArr[i10 + 1];
            int i19 = i11 + 1;
            bArr3[i11] = bArr2[(b15 & 255) >> 2];
            int i20 = i19 + 1;
            bArr3[i19] = bArr2[((b15 & 3) << 4) | ((b16 & 255) >> 4)];
            bArr3[i20] = bArr2[(b16 & 15) << 2];
            bArr3[i20 + 1] = (byte) 61;
        }
        return C9755b.m41079b(bArr3);
    }

    /* renamed from: c */
    public static /* synthetic */ String m41077c(byte[] bArr, byte[] bArr2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bArr2 = f44500a;
        }
        return m41076b(bArr, bArr2);
    }
}

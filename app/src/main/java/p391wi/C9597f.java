package p391wi;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9367f;
import p411xi.C9761e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:wi/f.class
 */
/* renamed from: wi.f */
/* loaded from: combined.jar:classes2.jar:wi/f.class */
public final class C9597f {

    /* renamed from: a */
    public static final C9597f f43827a = new C9597f();

    @Nullable
    /* renamed from: a */
    public final String m40430a(int i10) {
        StringBuilder sb2;
        String str;
        if (i10 < 1000 || i10 >= 5000) {
            sb2 = new StringBuilder();
            sb2.append("Code must be in range [1000,5000): ");
            sb2.append(i10);
        } else {
            if ((1004 > i10 || 1006 < i10) && (1015 > i10 || 2999 < i10)) {
                str = null;
                return str;
            }
            sb2 = new StringBuilder();
            sb2.append("Code ");
            sb2.append(i10);
            sb2.append(" is reserved and may not be used.");
        }
        str = sb2.toString();
        return str;
    }

    /* renamed from: b */
    public final void m40431b(@NotNull C9761e.a aVar, @NotNull byte[] bArr) {
        C9367f.m39526e(aVar, "cursor");
        C9367f.m39526e(bArr, "key");
        int length = bArr.length;
        int i10 = 0;
        do {
            byte[] bArr2 = aVar.f44525f;
            int i11 = aVar.f44526g;
            int i12 = aVar.f44527h;
            int i13 = i10;
            if (bArr2 != null) {
                while (true) {
                    i13 = i10;
                    if (i11 >= i12) {
                        break;
                    }
                    int i14 = i10 % length;
                    bArr2[i11] = (byte) (bArr2[i11] ^ bArr[i14]);
                    i11++;
                    i10 = i14 + 1;
                }
            }
            i10 = i13;
        } while (aVar.m41179f() != -1);
    }

    /* renamed from: c */
    public final void m40432c(int i10) {
        String m40430a = m40430a(i10);
        if (m40430a == null) {
            return;
        }
        C9367f.m39524c(m40430a);
        throw new IllegalArgumentException(m40430a.toString());
    }
}

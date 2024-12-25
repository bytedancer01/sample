package kh;

import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kh/f.class
 */
/* renamed from: kh.f */
/* loaded from: combined.jar:classes2.jar:kh/f.class */
public class C5612f extends C5611e {
    @NotNull
    /* renamed from: b */
    public static final <T> List<T> m27676b(@NotNull T[] tArr) {
        C9367f.m39526e(tArr, "<this>");
        List<T> m27694a = C5614h.m27694a(tArr);
        C9367f.m39525d(m27694a, "asList(this)");
        return m27694a;
    }

    @NotNull
    /* renamed from: c */
    public static final byte[] m27677c(@NotNull byte[] bArr, @NotNull byte[] bArr2, int i10, int i11, int i12) {
        C9367f.m39526e(bArr, "<this>");
        C9367f.m39526e(bArr2, CognitoUserPoolsSignInProvider.AttributeKeys.CONFIRMATION_DESTINATION);
        System.arraycopy(bArr, i11, bArr2, i10, i12 - i11);
        return bArr2;
    }

    @NotNull
    /* renamed from: d */
    public static final <T> T[] m27678d(@NotNull T[] tArr, @NotNull T[] tArr2, int i10, int i11, int i12) {
        C9367f.m39526e(tArr, "<this>");
        C9367f.m39526e(tArr2, CognitoUserPoolsSignInProvider.AttributeKeys.CONFIRMATION_DESTINATION);
        System.arraycopy(tArr, i11, tArr2, i10, i12 - i11);
        return tArr2;
    }

    /* renamed from: e */
    public static /* synthetic */ byte[] m27679e(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        return m27677c(bArr, bArr2, i10, i11, i12);
    }

    /* renamed from: f */
    public static /* synthetic */ Object[] m27680f(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return m27678d(objArr, objArr2, i10, i11, i12);
    }

    @NotNull
    /* renamed from: g */
    public static final byte[] m27681g(@NotNull byte[] bArr, int i10, int i11) {
        C9367f.m39526e(bArr, "<this>");
        C5610d.m27675a(i11, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        C9367f.m39525d(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    /* renamed from: h */
    public static final <T> void m27682h(@NotNull T[] tArr, T t10, int i10, int i11) {
        C9367f.m39526e(tArr, "<this>");
        Arrays.fill(tArr, i10, i11, t10);
    }

    /* renamed from: i */
    public static /* synthetic */ void m27683i(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        m27682h(objArr, obj, i10, i11);
    }
}

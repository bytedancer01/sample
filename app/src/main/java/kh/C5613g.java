package kh;

import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9367f;
import p448zh.C10238c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kh/g.class
 */
/* renamed from: kh.g */
/* loaded from: combined.jar:classes2.jar:kh/g.class */
public class C5613g extends C5612f {
    /* renamed from: j */
    public static final <T> boolean m27684j(@NotNull T[] tArr, T t10) {
        C9367f.m39526e(tArr, "<this>");
        return m27689o(tArr, t10) >= 0;
    }

    @NotNull
    /* renamed from: k */
    public static final <T> List<T> m27685k(@NotNull T[] tArr) {
        C9367f.m39526e(tArr, "<this>");
        return (List) m27686l(tArr, new ArrayList());
    }

    @NotNull
    /* renamed from: l */
    public static final <C extends Collection<? super T>, T> C m27686l(@NotNull T[] tArr, @NotNull C c10) {
        C9367f.m39526e(tArr, "<this>");
        C9367f.m39526e(c10, CognitoUserPoolsSignInProvider.AttributeKeys.CONFIRMATION_DESTINATION);
        for (T t10 : tArr) {
            if (t10 != null) {
                c10.add(t10);
            }
        }
        return c10;
    }

    @NotNull
    /* renamed from: m */
    public static final <T> C10238c m27687m(@NotNull T[] tArr) {
        C9367f.m39526e(tArr, "<this>");
        return new C10238c(0, m27688n(tArr));
    }

    /* renamed from: n */
    public static final <T> int m27688n(@NotNull T[] tArr) {
        C9367f.m39526e(tArr, "<this>");
        return tArr.length - 1;
    }

    /* renamed from: o */
    public static final <T> int m27689o(@NotNull T[] tArr, T t10) {
        C9367f.m39526e(tArr, "<this>");
        if (t10 != null) {
            int length = tArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (C9367f.m39522a(t10, tArr[i10])) {
                    return i10;
                }
            }
            return -1;
        }
        int length2 = tArr.length;
        for (int i11 = 0; i11 < length2; i11++) {
            if (tArr[i11] == null) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: p */
    public static final char m27690p(@NotNull char[] cArr) {
        C9367f.m39526e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @Nullable
    /* renamed from: q */
    public static final <T> T m27691q(@NotNull T[] tArr) {
        C9367f.m39526e(tArr, "<this>");
        return tArr.length == 1 ? tArr[0] : null;
    }

    @NotNull
    /* renamed from: r */
    public static final <T> List<T> m27692r(@NotNull T[] tArr) {
        C9367f.m39526e(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? m27693s(tArr) : C5615i.m27696b(tArr[0]) : C5616j.m27700f();
    }

    @NotNull
    /* renamed from: s */
    public static final <T> List<T> m27693s(@NotNull T[] tArr) {
        C9367f.m39526e(tArr, "<this>");
        return new ArrayList(C5616j.m27697c(tArr));
    }
}

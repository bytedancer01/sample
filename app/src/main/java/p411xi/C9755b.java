package p411xi;

import ci.C1117c;
import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xi/b.class
 */
/* renamed from: xi.b */
/* loaded from: combined.jar:classes2.jar:xi/b.class */
public final class C9755b {
    @NotNull
    /* renamed from: a */
    public static final byte[] m41078a(@NotNull String str) {
        C9367f.m39526e(str, "$this$asUtf8ToByteArray");
        byte[] bytes = str.getBytes(C1117c.f7455b);
        C9367f.m39525d(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @NotNull
    /* renamed from: b */
    public static final String m41079b(@NotNull byte[] bArr) {
        C9367f.m39526e(bArr, "$this$toUtf8String");
        return new String(bArr, C1117c.f7455b);
    }
}

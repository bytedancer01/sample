package ci;

import java.nio.charset.Charset;
import org.apache.commons.codec.CharEncoding;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ci/c.class
 */
/* renamed from: ci.c */
/* loaded from: combined.jar:classes2.jar:ci/c.class */
public final class C1117c {

    /* renamed from: a */
    @NotNull
    public static final C1117c f7454a = new C1117c();

    /* renamed from: b */
    @NotNull
    public static final Charset f7455b;

    /* renamed from: c */
    @NotNull
    public static final Charset f7456c;

    /* renamed from: d */
    @NotNull
    public static final Charset f7457d;

    /* renamed from: e */
    @NotNull
    public static final Charset f7458e;

    /* renamed from: f */
    @NotNull
    public static final Charset f7459f;

    /* renamed from: g */
    @NotNull
    public static final Charset f7460g;

    /* renamed from: h */
    @Nullable
    public static Charset f7461h;

    /* renamed from: i */
    @Nullable
    public static Charset f7462i;

    static {
        Charset forName = Charset.forName("UTF-8");
        C9367f.m39525d(forName, "forName(\"UTF-8\")");
        f7455b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        C9367f.m39525d(forName2, "forName(\"UTF-16\")");
        f7456c = forName2;
        Charset forName3 = Charset.forName(CharEncoding.UTF_16BE);
        C9367f.m39525d(forName3, "forName(\"UTF-16BE\")");
        f7457d = forName3;
        Charset forName4 = Charset.forName(CharEncoding.UTF_16LE);
        C9367f.m39525d(forName4, "forName(\"UTF-16LE\")");
        f7458e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        C9367f.m39525d(forName5, "forName(\"US-ASCII\")");
        f7459f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        C9367f.m39525d(forName6, "forName(\"ISO-8859-1\")");
        f7460g = forName6;
    }

    @NotNull
    /* renamed from: a */
    public final Charset m6695a() {
        Charset charset = f7462i;
        Charset charset2 = charset;
        if (charset == null) {
            charset2 = Charset.forName("UTF-32BE");
            C9367f.m39525d(charset2, "forName(\"UTF-32BE\")");
            f7462i = charset2;
        }
        return charset2;
    }

    @NotNull
    /* renamed from: b */
    public final Charset m6696b() {
        Charset charset = f7461h;
        Charset charset2 = charset;
        if (charset == null) {
            charset2 = Charset.forName("UTF-32LE");
            C9367f.m39525d(charset2, "forName(\"UTF-32LE\")");
            f7461h = charset2;
        }
        return charset2;
    }
}

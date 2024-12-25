package ci;

import java.io.Serializable;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ci/e.class
 */
/* renamed from: ci.e */
/* loaded from: combined.jar:classes2.jar:ci/e.class */
public final class C1119e implements Serializable {

    /* renamed from: c */
    @NotNull
    public static final a f7473c = new a(null);

    /* renamed from: b */
    @NotNull
    public final Pattern f7474b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ci/e$a.class
     */
    /* renamed from: ci.e$a */
    /* loaded from: combined.jar:classes2.jar:ci/e$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1119e(@org.jetbrains.annotations.NotNull java.lang.String r4) {
        /*
            r3 = this;
            r0 = r4
            java.lang.String r1 = "pattern"
            p372vh.C9367f.m39526e(r0, r1)
            r0 = r4
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r4 = r0
            r0 = r4
            java.lang.String r1 = "compile(pattern)"
            p372vh.C9367f.m39525d(r0, r1)
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ci.C1119e.<init>(java.lang.String):void");
    }

    public C1119e(@NotNull Pattern pattern) {
        C9367f.m39526e(pattern, "nativePattern");
        this.f7474b = pattern;
    }

    /* renamed from: a */
    public final boolean m6703a(@NotNull CharSequence charSequence) {
        C9367f.m39526e(charSequence, "input");
        return this.f7474b.matcher(charSequence).matches();
    }

    @NotNull
    /* renamed from: b */
    public final String m6704b(@NotNull CharSequence charSequence, @NotNull String str) {
        C9367f.m39526e(charSequence, "input");
        C9367f.m39526e(str, "replacement");
        String replaceAll = this.f7474b.matcher(charSequence).replaceAll(str);
        C9367f.m39525d(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    @NotNull
    public String toString() {
        String pattern = this.f7474b.toString();
        C9367f.m39525d(pattern, "nativePattern.toString()");
        return pattern;
    }
}

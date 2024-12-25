package p274pi;

import ci.C1128n;
import java.net.ProtocolException;
import org.jetbrains.annotations.NotNull;
import p173ji.EnumC5404c0;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:pi/k.class
 */
/* renamed from: pi.k */
/* loaded from: combined.jar:classes2.jar:pi/k.class */
public final class C7734k {

    /* renamed from: d */
    public static final a f37513d = new a(null);

    /* renamed from: a */
    @NotNull
    public final EnumC5404c0 f37514a;

    /* renamed from: b */
    public final int f37515b;

    /* renamed from: c */
    @NotNull
    public final String f37516c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:pi/k$a.class
     */
    /* renamed from: pi.k$a */
    /* loaded from: combined.jar:classes2.jar:pi/k$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final C7734k m33766a(@NotNull String str) {
            EnumC5404c0 enumC5404c0;
            String str2;
            C9367f.m39526e(str, "statusLine");
            int i10 = 9;
            if (C1128n.m6732y(str, "HTTP/1.", false, 2, null)) {
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    enumC5404c0 = EnumC5404c0.HTTP_1_0;
                } else {
                    if (charAt != 1) {
                        throw new ProtocolException("Unexpected status line: " + str);
                    }
                    enumC5404c0 = EnumC5404c0.HTTP_1_1;
                }
            } else {
                if (!C1128n.m6732y(str, "ICY ", false, 2, null)) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                enumC5404c0 = EnumC5404c0.HTTP_1_0;
                i10 = 4;
            }
            int i11 = i10 + 3;
            if (str.length() < i11) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            try {
                String substring = str.substring(i10, i11);
                C9367f.m39525d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                int parseInt = Integer.parseInt(substring);
                if (str.length() <= i11) {
                    str2 = "";
                } else {
                    if (str.charAt(i11) != ' ') {
                        throw new ProtocolException("Unexpected status line: " + str);
                    }
                    str2 = str.substring(i10 + 4);
                    C9367f.m39525d(str2, "(this as java.lang.String).substring(startIndex)");
                }
                return new C7734k(enumC5404c0, parseInt, str2);
            } catch (NumberFormatException e10) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        }
    }

    public C7734k(@NotNull EnumC5404c0 enumC5404c0, int i10, @NotNull String str) {
        C9367f.m39526e(enumC5404c0, "protocol");
        C9367f.m39526e(str, "message");
        this.f37514a = enumC5404c0;
        this.f37515b = i10;
        this.f37516c = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f37514a == EnumC5404c0.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb2.append(' ');
        sb2.append(this.f37515b);
        sb2.append(' ');
        sb2.append(this.f37516c);
        String sb3 = sb2.toString();
        C9367f.m39525d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}

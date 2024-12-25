package p173ji;

import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ji/c0.class
 */
/* renamed from: ji.c0 */
/* loaded from: combined.jar:classes2.jar:ji/c0.class */
public enum EnumC5404c0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    public static final a Companion = new a(null);
    private final String protocol;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ji/c0$a.class
     */
    /* renamed from: ji.c0$a */
    /* loaded from: combined.jar:classes2.jar:ji/c0$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final EnumC5404c0 m26854a(@NotNull String str) {
            EnumC5404c0 enumC5404c0;
            C9367f.m39526e(str, "protocol");
            EnumC5404c0 enumC5404c02 = EnumC5404c0.HTTP_1_0;
            if (C9367f.m39522a(str, enumC5404c02.protocol)) {
                enumC5404c0 = enumC5404c02;
            } else {
                EnumC5404c0 enumC5404c03 = EnumC5404c0.HTTP_1_1;
                if (C9367f.m39522a(str, enumC5404c03.protocol)) {
                    enumC5404c0 = enumC5404c03;
                } else {
                    EnumC5404c0 enumC5404c04 = EnumC5404c0.H2_PRIOR_KNOWLEDGE;
                    if (C9367f.m39522a(str, enumC5404c04.protocol)) {
                        enumC5404c0 = enumC5404c04;
                    } else {
                        EnumC5404c0 enumC5404c05 = EnumC5404c0.HTTP_2;
                        if (C9367f.m39522a(str, enumC5404c05.protocol)) {
                            enumC5404c0 = enumC5404c05;
                        } else {
                            EnumC5404c0 enumC5404c06 = EnumC5404c0.SPDY_3;
                            if (C9367f.m39522a(str, enumC5404c06.protocol)) {
                                enumC5404c0 = enumC5404c06;
                            } else {
                                EnumC5404c0 enumC5404c07 = EnumC5404c0.QUIC;
                                if (!C9367f.m39522a(str, enumC5404c07.protocol)) {
                                    throw new IOException("Unexpected protocol: " + str);
                                }
                                enumC5404c0 = enumC5404c07;
                            }
                        }
                    }
                }
            }
            return enumC5404c0;
        }
    }

    EnumC5404c0(String str) {
        this.protocol = str;
    }

    @NotNull
    public static final EnumC5404c0 get(@NotNull String str) {
        return Companion.m26854a(str);
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.protocol;
    }
}

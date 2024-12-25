package tg;

import java.io.IOException;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:tg/r.class
 */
/* renamed from: tg.r */
/* loaded from: combined.jar:classes2.jar:tg/r.class */
public enum EnumC8742r {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2-14");

    private final String protocol;

    EnumC8742r(String str) {
        this.protocol = str;
    }

    public static EnumC8742r get(String str) {
        EnumC8742r enumC8742r = HTTP_1_0;
        if (str.equals(enumC8742r.protocol)) {
            return enumC8742r;
        }
        EnumC8742r enumC8742r2 = HTTP_1_1;
        if (str.equals(enumC8742r2.protocol)) {
            return enumC8742r2;
        }
        EnumC8742r enumC8742r3 = HTTP_2;
        if (str.equals(enumC8742r3.protocol)) {
            return enumC8742r3;
        }
        EnumC8742r enumC8742r4 = SPDY_3;
        if (str.equals(enumC8742r4.protocol)) {
            return enumC8742r4;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}

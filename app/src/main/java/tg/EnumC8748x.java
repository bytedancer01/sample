package tg;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:tg/x.class
 */
/* renamed from: tg.x */
/* loaded from: combined.jar:classes2.jar:tg/x.class */
public enum EnumC8748x {
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");

    public final String javaName;

    EnumC8748x(String str) {
        this.javaName = str;
    }

    public static EnumC8748x forJavaName(String str) {
        str.hashCode();
        switch (str) {
            case "TLSv1.1":
                return TLS_1_1;
            case "TLSv1.2":
                return TLS_1_2;
            case "SSLv3":
                return SSL_3_0;
            case "TLSv1":
                return TLS_1_0;
            default:
                throw new IllegalArgumentException("Unexpected TLS version: " + str);
        }
    }
}

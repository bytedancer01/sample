package org.apache.http.client.utils;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/utils/Punycode.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/utils/Punycode.class */
public class Punycode {
    private static final Idn impl;

    static {
        Idn rfc3492Idn;
        try {
            rfc3492Idn = new JdkIdn();
        } catch (Exception e10) {
            rfc3492Idn = new Rfc3492Idn();
        }
        impl = rfc3492Idn;
    }

    public static String toUnicode(String str) {
        return impl.toUnicode(str);
    }
}

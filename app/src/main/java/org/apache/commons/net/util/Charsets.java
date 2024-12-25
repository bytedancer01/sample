package org.apache.commons.net.util;

import java.nio.charset.Charset;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/util/Charsets.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/util/Charsets.class */
public class Charsets {
    public static Charset toCharset(String str) {
        return str == null ? Charset.defaultCharset() : Charset.forName(str);
    }

    public static Charset toCharset(String str, String str2) {
        return str == null ? Charset.forName(str2) : Charset.forName(str);
    }
}

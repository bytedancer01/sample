package org.apache.commons.codec;

import java.nio.charset.Charset;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/Charsets.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/Charsets.class */
public class Charsets {

    @Deprecated
    public static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");

    @Deprecated
    public static final Charset US_ASCII = Charset.forName("US-ASCII");

    @Deprecated
    public static final Charset UTF_16 = Charset.forName("UTF-16");

    @Deprecated
    public static final Charset UTF_16BE = Charset.forName(CharEncoding.UTF_16BE);

    @Deprecated
    public static final Charset UTF_16LE = Charset.forName(CharEncoding.UTF_16LE);

    @Deprecated
    public static final Charset UTF_8 = Charset.forName("UTF-8");

    public static Charset toCharset(String str) {
        return str == null ? Charset.defaultCharset() : Charset.forName(str);
    }

    public static Charset toCharset(Charset charset) {
        Charset charset2 = charset;
        if (charset == null) {
            charset2 = Charset.defaultCharset();
        }
        return charset2;
    }
}

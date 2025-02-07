package org.apache.http.util;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* loaded from: combined.jar:classes3.jar:org/apache/http/util/CharsetUtils.class */
public class CharsetUtils {
    public static Charset get(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Charset.forName(str);
        } catch (UnsupportedCharsetException e10) {
            throw new UnsupportedEncodingException(str);
        }
    }

    public static Charset lookup(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Charset.forName(str);
        } catch (UnsupportedCharsetException e10) {
            return null;
        }
    }
}

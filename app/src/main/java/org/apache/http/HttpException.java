package org.apache.http;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/HttpException.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/HttpException.class */
public class HttpException extends Exception {
    private static final int FIRST_VALID_CHAR = 32;
    private static final long serialVersionUID = -5437299376222011036L;

    public HttpException() {
    }

    public HttpException(String str) {
        super(clean(str));
    }

    public HttpException(String str, Throwable th2) {
        super(clean(str));
        initCause(th2);
    }

    public static String clean(String str) {
        char[] charArray = str.toCharArray();
        int i10 = 0;
        while (i10 < charArray.length && charArray[i10] >= ' ') {
            i10++;
        }
        if (i10 == charArray.length) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(charArray.length * 2);
        for (int i11 = 0; i11 < charArray.length; i11++) {
            char c10 = charArray[i11];
            if (c10 < ' ') {
                sb2.append("[0x");
                String hexString = Integer.toHexString(i11);
                if (hexString.length() == 1) {
                    sb2.append("0");
                }
                sb2.append(hexString);
                sb2.append("]");
            } else {
                sb2.append(c10);
            }
        }
        return sb2.toString();
    }
}

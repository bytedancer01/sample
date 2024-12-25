package org.apache.http.message;

import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/message/BasicHeaderValueFormatter.class */
public class BasicHeaderValueFormatter implements HeaderValueFormatter {

    @Deprecated
    public static final BasicHeaderValueFormatter DEFAULT = new BasicHeaderValueFormatter();
    public static final BasicHeaderValueFormatter INSTANCE = new BasicHeaderValueFormatter();
    public static final String SEPARATORS = " ;,:@()<>\\\"/[]?={}\t";
    public static final String UNSAFE_CHARS = "\"\\";

    public static String formatElements(HeaderElement[] headerElementArr, boolean z10, HeaderValueFormatter headerValueFormatter) {
        if (headerValueFormatter == null) {
            headerValueFormatter = INSTANCE;
        }
        return headerValueFormatter.formatElements(null, headerElementArr, z10).toString();
    }

    public static String formatHeaderElement(HeaderElement headerElement, boolean z10, HeaderValueFormatter headerValueFormatter) {
        if (headerValueFormatter == null) {
            headerValueFormatter = INSTANCE;
        }
        return headerValueFormatter.formatHeaderElement(null, headerElement, z10).toString();
    }

    public static String formatNameValuePair(NameValuePair nameValuePair, boolean z10, HeaderValueFormatter headerValueFormatter) {
        if (headerValueFormatter == null) {
            headerValueFormatter = INSTANCE;
        }
        return headerValueFormatter.formatNameValuePair(null, nameValuePair, z10).toString();
    }

    public static String formatParameters(NameValuePair[] nameValuePairArr, boolean z10, HeaderValueFormatter headerValueFormatter) {
        if (headerValueFormatter == null) {
            headerValueFormatter = INSTANCE;
        }
        return headerValueFormatter.formatParameters(null, nameValuePairArr, z10).toString();
    }

    public void doFormatValue(CharArrayBuffer charArrayBuffer, String str, boolean z10) {
        boolean z11 = z10;
        if (!z10) {
            int i10 = 0;
            while (true) {
                z11 = z10;
                if (i10 >= str.length()) {
                    break;
                }
                z11 = z10;
                if (z10) {
                    break;
                }
                z10 = isSeparator(str.charAt(i10));
                i10++;
            }
        }
        int i11 = 0;
        if (z11) {
            charArrayBuffer.append('\"');
            i11 = 0;
        }
        while (i11 < str.length()) {
            char charAt = str.charAt(i11);
            if (isUnsafe(charAt)) {
                charArrayBuffer.append('\\');
            }
            charArrayBuffer.append(charAt);
            i11++;
        }
        if (z11) {
            charArrayBuffer.append('\"');
        }
    }

    public int estimateElementsLen(HeaderElement[] headerElementArr) {
        if (headerElementArr == null || headerElementArr.length < 1) {
            return 0;
        }
        int length = (headerElementArr.length - 1) * 2;
        for (HeaderElement headerElement : headerElementArr) {
            length += estimateHeaderElementLen(headerElement);
        }
        return length;
    }

    public int estimateHeaderElementLen(HeaderElement headerElement) {
        int i10 = 0;
        if (headerElement == null) {
            return 0;
        }
        int length = headerElement.getName().length();
        String value = headerElement.getValue();
        int i11 = length;
        if (value != null) {
            i11 = length + value.length() + 3;
        }
        int parameterCount = headerElement.getParameterCount();
        int i12 = i11;
        if (parameterCount > 0) {
            while (true) {
                i12 = i11;
                if (i10 >= parameterCount) {
                    break;
                }
                i11 += estimateNameValuePairLen(headerElement.getParameter(i10)) + 2;
                i10++;
            }
        }
        return i12;
    }

    public int estimateNameValuePairLen(NameValuePair nameValuePair) {
        if (nameValuePair == null) {
            return 0;
        }
        int length = nameValuePair.getName().length();
        String value = nameValuePair.getValue();
        int i10 = length;
        if (value != null) {
            i10 = length + value.length() + 3;
        }
        return i10;
    }

    public int estimateParametersLen(NameValuePair[] nameValuePairArr) {
        if (nameValuePairArr == null || nameValuePairArr.length < 1) {
            return 0;
        }
        int length = (nameValuePairArr.length - 1) * 2;
        for (NameValuePair nameValuePair : nameValuePairArr) {
            length += estimateNameValuePairLen(nameValuePair);
        }
        return length;
    }

    @Override // org.apache.http.message.HeaderValueFormatter
    public CharArrayBuffer formatElements(CharArrayBuffer charArrayBuffer, HeaderElement[] headerElementArr, boolean z10) {
        Args.notNull(headerElementArr, "Header element array");
        int estimateElementsLen = estimateElementsLen(headerElementArr);
        if (charArrayBuffer == null) {
            charArrayBuffer = new CharArrayBuffer(estimateElementsLen);
        } else {
            charArrayBuffer.ensureCapacity(estimateElementsLen);
        }
        for (int i10 = 0; i10 < headerElementArr.length; i10++) {
            if (i10 > 0) {
                charArrayBuffer.append(", ");
            }
            formatHeaderElement(charArrayBuffer, headerElementArr[i10], z10);
        }
        return charArrayBuffer;
    }

    @Override // org.apache.http.message.HeaderValueFormatter
    public CharArrayBuffer formatHeaderElement(CharArrayBuffer charArrayBuffer, HeaderElement headerElement, boolean z10) {
        Args.notNull(headerElement, "Header element");
        int estimateHeaderElementLen = estimateHeaderElementLen(headerElement);
        if (charArrayBuffer == null) {
            charArrayBuffer = new CharArrayBuffer(estimateHeaderElementLen);
        } else {
            charArrayBuffer.ensureCapacity(estimateHeaderElementLen);
        }
        charArrayBuffer.append(headerElement.getName());
        String value = headerElement.getValue();
        if (value != null) {
            charArrayBuffer.append('=');
            doFormatValue(charArrayBuffer, value, z10);
        }
        int parameterCount = headerElement.getParameterCount();
        if (parameterCount > 0) {
            for (int i10 = 0; i10 < parameterCount; i10++) {
                charArrayBuffer.append("; ");
                formatNameValuePair(charArrayBuffer, headerElement.getParameter(i10), z10);
            }
        }
        return charArrayBuffer;
    }

    @Override // org.apache.http.message.HeaderValueFormatter
    public CharArrayBuffer formatNameValuePair(CharArrayBuffer charArrayBuffer, NameValuePair nameValuePair, boolean z10) {
        Args.notNull(nameValuePair, "Name / value pair");
        int estimateNameValuePairLen = estimateNameValuePairLen(nameValuePair);
        if (charArrayBuffer == null) {
            charArrayBuffer = new CharArrayBuffer(estimateNameValuePairLen);
        } else {
            charArrayBuffer.ensureCapacity(estimateNameValuePairLen);
        }
        charArrayBuffer.append(nameValuePair.getName());
        String value = nameValuePair.getValue();
        if (value != null) {
            charArrayBuffer.append('=');
            doFormatValue(charArrayBuffer, value, z10);
        }
        return charArrayBuffer;
    }

    @Override // org.apache.http.message.HeaderValueFormatter
    public CharArrayBuffer formatParameters(CharArrayBuffer charArrayBuffer, NameValuePair[] nameValuePairArr, boolean z10) {
        Args.notNull(nameValuePairArr, "Header parameter array");
        int estimateParametersLen = estimateParametersLen(nameValuePairArr);
        if (charArrayBuffer == null) {
            charArrayBuffer = new CharArrayBuffer(estimateParametersLen);
        } else {
            charArrayBuffer.ensureCapacity(estimateParametersLen);
        }
        for (int i10 = 0; i10 < nameValuePairArr.length; i10++) {
            if (i10 > 0) {
                charArrayBuffer.append("; ");
            }
            formatNameValuePair(charArrayBuffer, nameValuePairArr[i10], z10);
        }
        return charArrayBuffer;
    }

    public boolean isSeparator(char c10) {
        return SEPARATORS.indexOf(c10) >= 0;
    }

    public boolean isUnsafe(char c10) {
        return UNSAFE_CHARS.indexOf(c10) >= 0;
    }
}

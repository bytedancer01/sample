package org.apache.http.client.utils;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Scanner;
import org.apache.http.Consts;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.entity.ContentType;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.message.ParserCursor;
import org.apache.http.message.TokenParser;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/utils/URLEncodedUtils.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/utils/URLEncodedUtils.class */
public class URLEncodedUtils {
    public static final String CONTENT_TYPE = "application/x-www-form-urlencoded";
    private static final String NAME_VALUE_SEPARATOR = "=";
    private static final char QP_SEP_A = '&';
    private static final char QP_SEP_S = ';';
    private static final int RADIX = 16;
    private static final BitSet UNRESERVED = new BitSet(256);
    private static final BitSet PUNCT = new BitSet(256);
    private static final BitSet USERINFO = new BitSet(256);
    private static final BitSet PATHSAFE = new BitSet(256);
    private static final BitSet URIC = new BitSet(256);
    private static final BitSet RESERVED = new BitSet(256);
    private static final BitSet URLENCODER = new BitSet(256);

    static {
        for (int i10 = 97; i10 <= 122; i10++) {
            UNRESERVED.set(i10);
        }
        for (int i11 = 65; i11 <= 90; i11++) {
            UNRESERVED.set(i11);
        }
        for (int i12 = 48; i12 <= 57; i12++) {
            UNRESERVED.set(i12);
        }
        BitSet bitSet = UNRESERVED;
        bitSet.set(95);
        bitSet.set(45);
        bitSet.set(46);
        bitSet.set(42);
        URLENCODER.or(bitSet);
        bitSet.set(33);
        bitSet.set(126);
        bitSet.set(39);
        bitSet.set(40);
        bitSet.set(41);
        BitSet bitSet2 = PUNCT;
        bitSet2.set(44);
        bitSet2.set(59);
        bitSet2.set(58);
        bitSet2.set(36);
        bitSet2.set(38);
        bitSet2.set(43);
        bitSet2.set(61);
        BitSet bitSet3 = USERINFO;
        bitSet3.or(bitSet);
        bitSet3.or(bitSet2);
        BitSet bitSet4 = PATHSAFE;
        bitSet4.or(bitSet);
        bitSet4.set(47);
        bitSet4.set(59);
        bitSet4.set(58);
        bitSet4.set(64);
        bitSet4.set(38);
        bitSet4.set(61);
        bitSet4.set(43);
        bitSet4.set(36);
        bitSet4.set(44);
        BitSet bitSet5 = RESERVED;
        bitSet5.set(59);
        bitSet5.set(47);
        bitSet5.set(63);
        bitSet5.set(58);
        bitSet5.set(64);
        bitSet5.set(38);
        bitSet5.set(61);
        bitSet5.set(43);
        bitSet5.set(36);
        bitSet5.set(44);
        bitSet5.set(91);
        bitSet5.set(93);
        BitSet bitSet6 = URIC;
        bitSet6.or(bitSet5);
        bitSet6.or(bitSet);
    }

    private static List<NameValuePair> createEmptyList() {
        return new ArrayList(0);
    }

    private static String decodeFormFields(String str, String str2) {
        if (str == null) {
            return null;
        }
        return urlDecode(str, str2 != null ? Charset.forName(str2) : Consts.UTF_8, true);
    }

    private static String decodeFormFields(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        if (charset == null) {
            charset = Consts.UTF_8;
        }
        return urlDecode(str, charset, true);
    }

    public static String encPath(String str, Charset charset) {
        return urlEncode(str, charset, PATHSAFE, false);
    }

    public static String encUric(String str, Charset charset) {
        return urlEncode(str, charset, URIC, false);
    }

    public static String encUserInfo(String str, Charset charset) {
        return urlEncode(str, charset, USERINFO, false);
    }

    private static String encodeFormFields(String str, String str2) {
        if (str == null) {
            return null;
        }
        return urlEncode(str, str2 != null ? Charset.forName(str2) : Consts.UTF_8, URLENCODER, true);
    }

    private static String encodeFormFields(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        if (charset == null) {
            charset = Consts.UTF_8;
        }
        return urlEncode(str, charset, URLENCODER, true);
    }

    public static String format(Iterable<? extends NameValuePair> iterable, char c10, Charset charset) {
        Args.notNull(iterable, "Parameters");
        StringBuilder sb2 = new StringBuilder();
        for (NameValuePair nameValuePair : iterable) {
            String encodeFormFields = encodeFormFields(nameValuePair.getName(), charset);
            String encodeFormFields2 = encodeFormFields(nameValuePair.getValue(), charset);
            if (sb2.length() > 0) {
                sb2.append(c10);
            }
            sb2.append(encodeFormFields);
            if (encodeFormFields2 != null) {
                sb2.append(NAME_VALUE_SEPARATOR);
                sb2.append(encodeFormFields2);
            }
        }
        return sb2.toString();
    }

    public static String format(Iterable<? extends NameValuePair> iterable, Charset charset) {
        return format(iterable, '&', charset);
    }

    public static String format(List<? extends NameValuePair> list, char c10, String str) {
        StringBuilder sb2 = new StringBuilder();
        for (NameValuePair nameValuePair : list) {
            String encodeFormFields = encodeFormFields(nameValuePair.getName(), str);
            String encodeFormFields2 = encodeFormFields(nameValuePair.getValue(), str);
            if (sb2.length() > 0) {
                sb2.append(c10);
            }
            sb2.append(encodeFormFields);
            if (encodeFormFields2 != null) {
                sb2.append(NAME_VALUE_SEPARATOR);
                sb2.append(encodeFormFields2);
            }
        }
        return sb2.toString();
    }

    public static String format(List<? extends NameValuePair> list, String str) {
        return format(list, '&', str);
    }

    public static boolean isEncoded(HttpEntity httpEntity) {
        Args.notNull(httpEntity, "HTTP entity");
        Header contentType = httpEntity.getContentType();
        if (contentType == null) {
            return false;
        }
        HeaderElement[] elements = contentType.getElements();
        if (elements.length > 0) {
            return elements[0].getName().equalsIgnoreCase("application/x-www-form-urlencoded");
        }
        return false;
    }

    public static List<NameValuePair> parse(String str, Charset charset) {
        if (str == null) {
            return createEmptyList();
        }
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        return parse(charArrayBuffer, charset, '&', ';');
    }

    public static List<NameValuePair> parse(String str, Charset charset, char... cArr) {
        if (str == null) {
            return createEmptyList();
        }
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        return parse(charArrayBuffer, charset, cArr);
    }

    public static List<NameValuePair> parse(URI uri, String str) {
        return parse(uri, str != null ? Charset.forName(str) : null);
    }

    public static List<NameValuePair> parse(URI uri, Charset charset) {
        Args.notNull(uri, "URI");
        String rawQuery = uri.getRawQuery();
        return (rawQuery == null || rawQuery.isEmpty()) ? createEmptyList() : parse(rawQuery, charset);
    }

    public static List<NameValuePair> parse(HttpEntity httpEntity) {
        Args.notNull(httpEntity, "HTTP entity");
        ContentType contentType = ContentType.get(httpEntity);
        if (contentType == null || !contentType.getMimeType().equalsIgnoreCase("application/x-www-form-urlencoded")) {
            return createEmptyList();
        }
        long contentLength = httpEntity.getContentLength();
        Args.check(contentLength <= 2147483647L, "HTTP entity is too large");
        Charset charset = contentType.getCharset() != null ? contentType.getCharset() : HTTP.DEF_CONTENT_CHARSET;
        InputStream content = httpEntity.getContent();
        if (content == null) {
            return createEmptyList();
        }
        try {
            CharArrayBuffer charArrayBuffer = new CharArrayBuffer(contentLength > 0 ? (int) contentLength : 1024);
            InputStreamReader inputStreamReader = new InputStreamReader(content, charset);
            char[] cArr = new char[1024];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read == -1) {
                    break;
                }
                charArrayBuffer.append(cArr, 0, read);
            }
            content.close();
            return charArrayBuffer.length() == 0 ? createEmptyList() : parse(charArrayBuffer, charset, '&');
        } catch (Throwable th2) {
            content.close();
            throw th2;
        }
    }

    public static List<NameValuePair> parse(CharArrayBuffer charArrayBuffer, Charset charset, char... cArr) {
        Args.notNull(charArrayBuffer, "Char array buffer");
        TokenParser tokenParser = TokenParser.INSTANCE;
        BitSet bitSet = new BitSet();
        for (char c10 : cArr) {
            bitSet.set(c10);
        }
        ParserCursor parserCursor = new ParserCursor(0, charArrayBuffer.length());
        ArrayList arrayList = new ArrayList();
        while (!parserCursor.atEnd()) {
            bitSet.set(61);
            String parseToken = tokenParser.parseToken(charArrayBuffer, parserCursor, bitSet);
            String str = null;
            if (!parserCursor.atEnd()) {
                char charAt = charArrayBuffer.charAt(parserCursor.getPos());
                parserCursor.updatePos(parserCursor.getPos() + 1);
                str = null;
                if (charAt == '=') {
                    bitSet.clear(61);
                    String parseValue = tokenParser.parseValue(charArrayBuffer, parserCursor, bitSet);
                    str = parseValue;
                    if (!parserCursor.atEnd()) {
                        parserCursor.updatePos(parserCursor.getPos() + 1);
                        str = parseValue;
                    }
                }
            }
            if (!parseToken.isEmpty()) {
                arrayList.add(new BasicNameValuePair(decodeFormFields(parseToken, charset), decodeFormFields(str, charset)));
            }
        }
        return arrayList;
    }

    @Deprecated
    public static void parse(List<NameValuePair> list, Scanner scanner, String str) {
        parse(list, scanner, "[&;]", str);
    }

    @Deprecated
    public static void parse(List<NameValuePair> list, Scanner scanner, String str, String str2) {
        String decodeFormFields;
        String str3;
        scanner.useDelimiter(str);
        while (scanner.hasNext()) {
            String next = scanner.next();
            int indexOf = next.indexOf(NAME_VALUE_SEPARATOR);
            if (indexOf != -1) {
                decodeFormFields = decodeFormFields(next.substring(0, indexOf).trim(), str2);
                str3 = decodeFormFields(next.substring(indexOf + 1).trim(), str2);
            } else {
                decodeFormFields = decodeFormFields(next.trim(), str2);
                str3 = null;
            }
            list.add(new BasicNameValuePair(decodeFormFields, str3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v46, types: [int] */
    private static String urlDecode(String str, Charset charset, boolean z10) {
        char c10;
        byte b10;
        if (str == null) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(str.length());
        CharBuffer wrap = CharBuffer.wrap(str);
        while (wrap.hasRemaining()) {
            char c11 = wrap.get();
            if (c11 != '%' || wrap.remaining() < 2) {
                c10 = c11;
                if (z10) {
                    c10 = c11;
                    if (c11 == '+') {
                        b10 = 32;
                        allocate.put(b10);
                    }
                }
                b10 = (byte) c10;
                allocate.put(b10);
            } else {
                char c12 = wrap.get();
                char c13 = wrap.get();
                int digit = Character.digit(c12, 16);
                int digit2 = Character.digit(c13, 16);
                if (digit == -1 || digit2 == -1) {
                    allocate.put((byte) 37);
                    allocate.put((byte) c12);
                    b10 = (byte) c13;
                    allocate.put(b10);
                } else {
                    c10 = (digit << 4) + digit2;
                    b10 = (byte) c10;
                    allocate.put(b10);
                }
            }
        }
        allocate.flip();
        return charset.decode(allocate).toString();
    }

    private static String urlEncode(String str, Charset charset, BitSet bitSet, boolean z10) {
        char upperCase;
        if (str == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        ByteBuffer encode = charset.encode(str);
        while (encode.hasRemaining()) {
            int i10 = encode.get() & 255;
            if (bitSet.get(i10)) {
                upperCase = (char) i10;
            } else if (z10 && i10 == 32) {
                upperCase = '+';
            } else {
                sb2.append("%");
                char upperCase2 = Character.toUpperCase(Character.forDigit((i10 >> 4) & 15, 16));
                upperCase = Character.toUpperCase(Character.forDigit(i10 & 15, 16));
                sb2.append(upperCase2);
            }
            sb2.append(upperCase);
        }
        return sb2.toString();
    }
}

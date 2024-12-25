package org.apache.http.impl.cookie;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookiePriorityComparator;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.InterfaceC7038SM;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.message.BufferedHeader;
import org.apache.http.message.ParserCursor;
import org.apache.http.message.TokenParser;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@Contract(threading = ThreadingBehavior.SAFE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/cookie/RFC6265CookieSpec.class */
public class RFC6265CookieSpec implements CookieSpec {
    private static final char COMMA_CHAR = ',';
    private static final char DQUOTE_CHAR = '\"';
    private static final char EQUAL_CHAR = '=';
    private static final char ESCAPE_CHAR = '\\';
    private static final char PARAM_DELIMITER = ';';
    private final Map<String, CookieAttributeHandler> attribHandlerMap;
    private final CookieAttributeHandler[] attribHandlers;
    private final TokenParser tokenParser;
    private static final BitSet TOKEN_DELIMS = TokenParser.INIT_BITSET(61, 59);
    private static final BitSet VALUE_DELIMS = TokenParser.INIT_BITSET(59);
    private static final BitSet SPECIAL_CHARS = TokenParser.INIT_BITSET(32, 34, 44, 59, 92);

    public RFC6265CookieSpec(CommonCookieAttributeHandler... commonCookieAttributeHandlerArr) {
        this.attribHandlers = (CookieAttributeHandler[]) commonCookieAttributeHandlerArr.clone();
        this.attribHandlerMap = new ConcurrentHashMap(commonCookieAttributeHandlerArr.length);
        for (CommonCookieAttributeHandler commonCookieAttributeHandler : commonCookieAttributeHandlerArr) {
            this.attribHandlerMap.put(commonCookieAttributeHandler.getAttributeName().toLowerCase(Locale.ROOT), commonCookieAttributeHandler);
        }
        this.tokenParser = TokenParser.INSTANCE;
    }

    public static String getDefaultDomain(CookieOrigin cookieOrigin) {
        return cookieOrigin.getHost();
    }

    public static String getDefaultPath(CookieOrigin cookieOrigin) {
        String path = cookieOrigin.getPath();
        int lastIndexOf = path.lastIndexOf(47);
        String str = path;
        if (lastIndexOf >= 0) {
            int i10 = lastIndexOf;
            if (lastIndexOf == 0) {
                i10 = 1;
            }
            str = path.substring(0, i10);
        }
        return str;
    }

    public boolean containsChars(CharSequence charSequence, BitSet bitSet) {
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (bitSet.get(charSequence.charAt(i10))) {
                return true;
            }
        }
        return false;
    }

    public boolean containsSpecialChar(CharSequence charSequence) {
        return containsChars(charSequence, SPECIAL_CHARS);
    }

    @Override // org.apache.http.cookie.CookieSpec
    public List<Header> formatCookies(List<Cookie> list) {
        Args.notEmpty(list, "List of cookies");
        List<Cookie> list2 = list;
        if (list.size() > 1) {
            list2 = new ArrayList(list);
            Collections.sort(list2, CookiePriorityComparator.INSTANCE);
        }
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(list2.size() * 20);
        charArrayBuffer.append(InterfaceC7038SM.COOKIE);
        charArrayBuffer.append(": ");
        for (int i10 = 0; i10 < list2.size(); i10++) {
            Cookie cookie = list2.get(i10);
            if (i10 > 0) {
                charArrayBuffer.append(';');
                charArrayBuffer.append(' ');
            }
            charArrayBuffer.append(cookie.getName());
            String value = cookie.getValue();
            if (value != null) {
                charArrayBuffer.append('=');
                if (containsSpecialChar(value)) {
                    charArrayBuffer.append('\"');
                    for (int i11 = 0; i11 < value.length(); i11++) {
                        char charAt = value.charAt(i11);
                        if (charAt == '\"' || charAt == '\\') {
                            charArrayBuffer.append('\\');
                        }
                        charArrayBuffer.append(charAt);
                    }
                    charArrayBuffer.append('\"');
                } else {
                    charArrayBuffer.append(value);
                }
            }
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new BufferedHeader(charArrayBuffer));
        return arrayList;
    }

    @Override // org.apache.http.cookie.CookieSpec
    public final int getVersion() {
        return 0;
    }

    @Override // org.apache.http.cookie.CookieSpec
    public final Header getVersionHeader() {
        return null;
    }

    @Override // org.apache.http.cookie.CookieSpec
    public final boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        Args.notNull(cookie, InterfaceC7038SM.COOKIE);
        Args.notNull(cookieOrigin, "Cookie origin");
        for (CookieAttributeHandler cookieAttributeHandler : this.attribHandlers) {
            if (!cookieAttributeHandler.match(cookie, cookieOrigin)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.apache.http.cookie.CookieSpec
    public final List<Cookie> parse(Header header, CookieOrigin cookieOrigin) {
        CharArrayBuffer charArrayBuffer;
        ParserCursor parserCursor;
        Args.notNull(header, "Header");
        Args.notNull(cookieOrigin, "Cookie origin");
        if (!header.getName().equalsIgnoreCase(InterfaceC7038SM.SET_COOKIE)) {
            throw new MalformedCookieException("Unrecognized cookie header: '" + header.toString() + "'");
        }
        if (header instanceof FormattedHeader) {
            FormattedHeader formattedHeader = (FormattedHeader) header;
            charArrayBuffer = formattedHeader.getBuffer();
            parserCursor = new ParserCursor(formattedHeader.getValuePos(), charArrayBuffer.length());
        } else {
            String value = header.getValue();
            if (value == null) {
                throw new MalformedCookieException("Header value is null");
            }
            charArrayBuffer = new CharArrayBuffer(value.length());
            charArrayBuffer.append(value);
            parserCursor = new ParserCursor(0, charArrayBuffer.length());
        }
        String parseToken = this.tokenParser.parseToken(charArrayBuffer, parserCursor, TOKEN_DELIMS);
        if (parseToken.length() != 0 && !parserCursor.atEnd()) {
            char charAt = charArrayBuffer.charAt(parserCursor.getPos());
            parserCursor.updatePos(parserCursor.getPos() + 1);
            if (charAt != '=') {
                throw new MalformedCookieException("Cookie value is invalid: '" + header.toString() + "'");
            }
            String parseValue = this.tokenParser.parseValue(charArrayBuffer, parserCursor, VALUE_DELIMS);
            if (!parserCursor.atEnd()) {
                parserCursor.updatePos(parserCursor.getPos() + 1);
            }
            BasicClientCookie basicClientCookie = new BasicClientCookie(parseToken, parseValue);
            basicClientCookie.setPath(getDefaultPath(cookieOrigin));
            basicClientCookie.setDomain(getDefaultDomain(cookieOrigin));
            basicClientCookie.setCreationDate(new Date());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (!parserCursor.atEnd()) {
                String lowerCase = this.tokenParser.parseToken(charArrayBuffer, parserCursor, TOKEN_DELIMS).toLowerCase(Locale.ROOT);
                String str = null;
                if (!parserCursor.atEnd()) {
                    char charAt2 = charArrayBuffer.charAt(parserCursor.getPos());
                    parserCursor.updatePos(parserCursor.getPos() + 1);
                    str = null;
                    if (charAt2 == '=') {
                        String parseToken2 = this.tokenParser.parseToken(charArrayBuffer, parserCursor, VALUE_DELIMS);
                        str = parseToken2;
                        if (!parserCursor.atEnd()) {
                            parserCursor.updatePos(parserCursor.getPos() + 1);
                            str = parseToken2;
                        }
                    }
                }
                basicClientCookie.setAttribute(lowerCase, str);
                linkedHashMap.put(lowerCase, str);
            }
            if (linkedHashMap.containsKey(ClientCookie.MAX_AGE_ATTR)) {
                linkedHashMap.remove(ClientCookie.EXPIRES_ATTR);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                CookieAttributeHandler cookieAttributeHandler = this.attribHandlerMap.get(str2);
                if (cookieAttributeHandler != null) {
                    cookieAttributeHandler.parse(basicClientCookie, str3);
                }
            }
            return Collections.singletonList(basicClientCookie);
        }
        return Collections.emptyList();
    }

    @Override // org.apache.http.cookie.CookieSpec
    public final void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        Args.notNull(cookie, InterfaceC7038SM.COOKIE);
        Args.notNull(cookieOrigin, "Cookie origin");
        for (CookieAttributeHandler cookieAttributeHandler : this.attribHandlers) {
            cookieAttributeHandler.validate(cookie, cookieOrigin);
        }
    }
}

package org.apache.http.impl.cookie;

import java.util.ArrayList;
import java.util.List;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.Obsolete;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.InterfaceC7038SM;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.message.BufferedHeader;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@Contract(threading = ThreadingBehavior.SAFE)
@Obsolete
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/cookie/NetscapeDraftSpec.class */
public class NetscapeDraftSpec extends CookieSpecBase {
    public static final String EXPIRES_PATTERN = "EEE, dd-MMM-yy HH:mm:ss z";

    public NetscapeDraftSpec() {
        this((String[]) null);
    }

    public NetscapeDraftSpec(String[] strArr) {
        super(new BasicPathHandler(), new NetscapeDomainHandler(), new BasicSecureHandler(), new BasicCommentHandler(), new BasicExpiresHandler(strArr != null ? (String[]) strArr.clone() : new String[]{EXPIRES_PATTERN}));
    }

    public NetscapeDraftSpec(CommonCookieAttributeHandler... commonCookieAttributeHandlerArr) {
        super(commonCookieAttributeHandlerArr);
    }

    @Override // org.apache.http.cookie.CookieSpec
    public List<Header> formatCookies(List<Cookie> list) {
        Args.notEmpty(list, "List of cookies");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(list.size() * 20);
        charArrayBuffer.append(InterfaceC7038SM.COOKIE);
        charArrayBuffer.append(": ");
        for (int i10 = 0; i10 < list.size(); i10++) {
            Cookie cookie = list.get(i10);
            if (i10 > 0) {
                charArrayBuffer.append("; ");
            }
            charArrayBuffer.append(cookie.getName());
            String value = cookie.getValue();
            if (value != null) {
                charArrayBuffer.append("=");
                charArrayBuffer.append(value);
            }
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new BufferedHeader(charArrayBuffer));
        return arrayList;
    }

    @Override // org.apache.http.cookie.CookieSpec
    public int getVersion() {
        return 0;
    }

    @Override // org.apache.http.cookie.CookieSpec
    public Header getVersionHeader() {
        return null;
    }

    @Override // org.apache.http.cookie.CookieSpec
    public List<Cookie> parse(Header header, CookieOrigin cookieOrigin) {
        CharArrayBuffer charArrayBuffer;
        ParserCursor parserCursor;
        Args.notNull(header, "Header");
        Args.notNull(cookieOrigin, "Cookie origin");
        if (!header.getName().equalsIgnoreCase(InterfaceC7038SM.SET_COOKIE)) {
            throw new MalformedCookieException("Unrecognized cookie header '" + header.toString() + "'");
        }
        NetscapeDraftHeaderParser netscapeDraftHeaderParser = NetscapeDraftHeaderParser.DEFAULT;
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
        return parse(new HeaderElement[]{netscapeDraftHeaderParser.parseHeader(charArrayBuffer, parserCursor)}, cookieOrigin);
    }

    public String toString() {
        return "netscape";
    }
}

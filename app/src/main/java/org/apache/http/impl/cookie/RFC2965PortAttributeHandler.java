package org.apache.http.impl.cookie;

import java.util.StringTokenizer;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.InterfaceC7038SM;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.cookie.SetCookie2;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/cookie/RFC2965PortAttributeHandler.class */
public class RFC2965PortAttributeHandler implements CommonCookieAttributeHandler {
    private static int[] parsePortAttribute(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i10 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            try {
                int parseInt = Integer.parseInt(stringTokenizer.nextToken().trim());
                iArr[i10] = parseInt;
                if (parseInt < 0) {
                    throw new MalformedCookieException("Invalid Port attribute.");
                }
                i10++;
            } catch (NumberFormatException e10) {
                throw new MalformedCookieException("Invalid Port attribute: " + e10.getMessage());
            }
        }
        return iArr;
    }

    private static boolean portMatch(int i10, int[] iArr) {
        boolean z10;
        int length = iArr.length;
        int i11 = 0;
        while (true) {
            z10 = false;
            if (i11 >= length) {
                break;
            }
            if (i10 == iArr[i11]) {
                z10 = true;
                break;
            }
            i11++;
        }
        return z10;
    }

    @Override // org.apache.http.cookie.CommonCookieAttributeHandler
    public String getAttributeName() {
        return "port";
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        Args.notNull(cookie, InterfaceC7038SM.COOKIE);
        Args.notNull(cookieOrigin, "Cookie origin");
        int port = cookieOrigin.getPort();
        if ((cookie instanceof ClientCookie) && ((ClientCookie) cookie).containsAttribute("port")) {
            return cookie.getPorts() != null && portMatch(port, cookie.getPorts());
        }
        return true;
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void parse(SetCookie setCookie, String str) {
        Args.notNull(setCookie, InterfaceC7038SM.COOKIE);
        if (setCookie instanceof SetCookie2) {
            SetCookie2 setCookie2 = (SetCookie2) setCookie;
            if (str == null || str.trim().isEmpty()) {
                return;
            }
            setCookie2.setPorts(parsePortAttribute(str));
        }
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        Args.notNull(cookie, InterfaceC7038SM.COOKIE);
        Args.notNull(cookieOrigin, "Cookie origin");
        int port = cookieOrigin.getPort();
        if ((cookie instanceof ClientCookie) && ((ClientCookie) cookie).containsAttribute("port") && !portMatch(port, cookie.getPorts())) {
            throw new CookieRestrictionViolationException("Port attribute violates RFC 2965: Request port not found in cookie's port list.");
        }
    }
}

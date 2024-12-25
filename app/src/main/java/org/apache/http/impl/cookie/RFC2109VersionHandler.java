package org.apache.http.impl.cookie;

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
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/cookie/RFC2109VersionHandler.class */
public class RFC2109VersionHandler extends AbstractCookieAttributeHandler implements CommonCookieAttributeHandler {
    @Override // org.apache.http.cookie.CommonCookieAttributeHandler
    public String getAttributeName() {
        return ClientCookie.VERSION_ATTR;
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void parse(SetCookie setCookie, String str) {
        Args.notNull(setCookie, InterfaceC7038SM.COOKIE);
        if (str == null) {
            throw new MalformedCookieException("Missing value for version attribute");
        }
        if (str.trim().isEmpty()) {
            throw new MalformedCookieException("Blank value for version attribute");
        }
        try {
            setCookie.setVersion(Integer.parseInt(str));
        } catch (NumberFormatException e10) {
            throw new MalformedCookieException("Invalid version: " + e10.getMessage());
        }
    }

    @Override // org.apache.http.impl.cookie.AbstractCookieAttributeHandler, org.apache.http.cookie.CookieAttributeHandler
    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        Args.notNull(cookie, InterfaceC7038SM.COOKIE);
        if (cookie.getVersion() < 0) {
            throw new CookieRestrictionViolationException("Cookie version may not be negative");
        }
    }
}

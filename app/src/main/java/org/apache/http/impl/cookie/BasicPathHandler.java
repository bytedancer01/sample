package org.apache.http.impl.cookie;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.InterfaceC7038SM;
import org.apache.http.cookie.SetCookie;
import org.apache.http.util.Args;
import org.apache.http.util.TextUtils;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/cookie/BasicPathHandler.class */
public class BasicPathHandler implements CommonCookieAttributeHandler {
    public static boolean pathMatch(String str, String str2) {
        String str3 = str2;
        if (str2 == null) {
            str3 = "/";
        }
        String str4 = str3;
        if (str3.length() > 1) {
            str4 = str3;
            if (str3.endsWith("/")) {
                str4 = str3.substring(0, str3.length() - 1);
            }
        }
        if (str.startsWith(str4)) {
            return str4.equals("/") || str.length() == str4.length() || str.charAt(str4.length()) == '/';
        }
        return false;
    }

    @Override // org.apache.http.cookie.CommonCookieAttributeHandler
    public String getAttributeName() {
        return ClientCookie.PATH_ATTR;
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        Args.notNull(cookie, InterfaceC7038SM.COOKIE);
        Args.notNull(cookieOrigin, "Cookie origin");
        return pathMatch(cookieOrigin.getPath(), cookie.getPath());
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void parse(SetCookie setCookie, String str) {
        Args.notNull(setCookie, InterfaceC7038SM.COOKIE);
        if (TextUtils.isBlank(str)) {
            str = "/";
        }
        setCookie.setPath(str);
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
    }
}

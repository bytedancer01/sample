package org.apache.http.impl.cookie;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.InterfaceC7038SM;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/cookie/BrowserCompatVersionAttributeHandler.class */
public class BrowserCompatVersionAttributeHandler extends AbstractCookieAttributeHandler implements CommonCookieAttributeHandler {
    @Override // org.apache.http.cookie.CommonCookieAttributeHandler
    public String getAttributeName() {
        return ClientCookie.VERSION_ATTR;
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void parse(SetCookie setCookie, String str) {
        int i10;
        Args.notNull(setCookie, InterfaceC7038SM.COOKIE);
        if (str == null) {
            throw new MalformedCookieException("Missing value for version attribute");
        }
        try {
            i10 = Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            i10 = 0;
        }
        setCookie.setVersion(i10);
    }
}

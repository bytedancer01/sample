package org.apache.http.impl.cookie;

import java.util.Date;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.InterfaceC7038SM;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/cookie/BasicMaxAgeHandler.class */
public class BasicMaxAgeHandler extends AbstractCookieAttributeHandler implements CommonCookieAttributeHandler {
    @Override // org.apache.http.cookie.CommonCookieAttributeHandler
    public String getAttributeName() {
        return ClientCookie.MAX_AGE_ATTR;
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void parse(SetCookie setCookie, String str) {
        Args.notNull(setCookie, InterfaceC7038SM.COOKIE);
        if (str == null) {
            throw new MalformedCookieException("Missing value for 'max-age' attribute");
        }
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt >= 0) {
                setCookie.setExpiryDate(new Date(System.currentTimeMillis() + (parseInt * 1000)));
                return;
            }
            throw new MalformedCookieException("Negative 'max-age' attribute: " + str);
        } catch (NumberFormatException e10) {
            throw new MalformedCookieException("Invalid 'max-age' attribute: " + str);
        }
    }
}

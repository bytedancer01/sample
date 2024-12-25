package org.apache.http.impl.cookie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.InterfaceC7038SM;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.SAFE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/cookie/CookieSpecBase.class */
public abstract class CookieSpecBase extends AbstractCookieSpec {
    public CookieSpecBase() {
    }

    public CookieSpecBase(HashMap<String, CookieAttributeHandler> hashMap) {
        super(hashMap);
    }

    public CookieSpecBase(CommonCookieAttributeHandler... commonCookieAttributeHandlerArr) {
        super(commonCookieAttributeHandlerArr);
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

    @Override // org.apache.http.cookie.CookieSpec
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        Args.notNull(cookie, InterfaceC7038SM.COOKIE);
        Args.notNull(cookieOrigin, "Cookie origin");
        Iterator<CookieAttributeHandler> it = getAttribHandlers().iterator();
        while (it.hasNext()) {
            if (!it.next().match(cookie, cookieOrigin)) {
                return false;
            }
        }
        return true;
    }

    public List<Cookie> parse(HeaderElement[] headerElementArr, CookieOrigin cookieOrigin) {
        ArrayList arrayList = new ArrayList(headerElementArr.length);
        for (HeaderElement headerElement : headerElementArr) {
            String name = headerElement.getName();
            String value = headerElement.getValue();
            if (name != null && !name.isEmpty()) {
                BasicClientCookie basicClientCookie = new BasicClientCookie(name, value);
                basicClientCookie.setPath(getDefaultPath(cookieOrigin));
                basicClientCookie.setDomain(getDefaultDomain(cookieOrigin));
                NameValuePair[] parameters = headerElement.getParameters();
                for (int length = parameters.length - 1; length >= 0; length--) {
                    NameValuePair nameValuePair = parameters[length];
                    String lowerCase = nameValuePair.getName().toLowerCase(Locale.ROOT);
                    basicClientCookie.setAttribute(lowerCase, nameValuePair.getValue());
                    CookieAttributeHandler findAttribHandler = findAttribHandler(lowerCase);
                    if (findAttribHandler != null) {
                        findAttribHandler.parse(basicClientCookie, nameValuePair.getValue());
                    }
                }
                arrayList.add(basicClientCookie);
            }
        }
        return arrayList;
    }

    @Override // org.apache.http.cookie.CookieSpec
    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        Args.notNull(cookie, InterfaceC7038SM.COOKIE);
        Args.notNull(cookieOrigin, "Cookie origin");
        Iterator<CookieAttributeHandler> it = getAttribHandlers().iterator();
        while (it.hasNext()) {
            it.next().validate(cookie, cookieOrigin);
        }
    }
}

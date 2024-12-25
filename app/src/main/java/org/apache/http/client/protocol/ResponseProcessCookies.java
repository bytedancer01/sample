package org.apache.http.client.protocol;

import com.amplifyframework.core.model.ModelIdentifier;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.InterfaceC7038SM;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/protocol/ResponseProcessCookies.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/protocol/ResponseProcessCookies.class */
public class ResponseProcessCookies implements HttpResponseInterceptor {
    private final Log log = LogFactory.getLog(getClass());

    private static String formatCooke(Cookie cookie) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cookie.getName());
        sb2.append("=\"");
        String value = cookie.getValue();
        if (value != null) {
            String str = value;
            if (value.length() > 100) {
                str = value.substring(0, 100) + "...";
            }
            sb2.append(str);
        }
        sb2.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        sb2.append(", version:");
        sb2.append(Integer.toString(cookie.getVersion()));
        sb2.append(", domain:");
        sb2.append(cookie.getDomain());
        sb2.append(", path:");
        sb2.append(cookie.getPath());
        sb2.append(", expiry:");
        sb2.append(cookie.getExpiryDate());
        return sb2.toString();
    }

    private void processCookies(HeaderIterator headerIterator, CookieSpec cookieSpec, CookieOrigin cookieOrigin, CookieStore cookieStore) {
        while (headerIterator.hasNext()) {
            Header nextHeader = headerIterator.nextHeader();
            try {
                for (Cookie cookie : cookieSpec.parse(nextHeader, cookieOrigin)) {
                    try {
                        cookieSpec.validate(cookie, cookieOrigin);
                        cookieStore.addCookie(cookie);
                        if (this.log.isDebugEnabled()) {
                            this.log.debug("Cookie accepted [" + formatCooke(cookie) + "]");
                        }
                    } catch (MalformedCookieException e10) {
                        if (this.log.isWarnEnabled()) {
                            this.log.warn("Cookie rejected [" + formatCooke(cookie) + "] " + e10.getMessage());
                        }
                    }
                }
            } catch (MalformedCookieException e11) {
                if (this.log.isWarnEnabled()) {
                    this.log.warn("Invalid cookie header: \"" + nextHeader + "\". " + e11.getMessage());
                }
            }
        }
    }

    @Override // org.apache.http.HttpResponseInterceptor
    public void process(HttpResponse httpResponse, HttpContext httpContext) {
        Log log;
        Object obj;
        Args.notNull(httpResponse, "HTTP request");
        Args.notNull(httpContext, "HTTP context");
        HttpClientContext adapt = HttpClientContext.adapt(httpContext);
        CookieSpec cookieSpec = adapt.getCookieSpec();
        if (cookieSpec == null) {
            log = this.log;
            obj = "Cookie spec not specified in HTTP context";
        } else {
            CookieStore cookieStore = adapt.getCookieStore();
            if (cookieStore == null) {
                log = this.log;
                obj = "Cookie store not specified in HTTP context";
            } else {
                CookieOrigin cookieOrigin = adapt.getCookieOrigin();
                if (cookieOrigin != null) {
                    processCookies(httpResponse.headerIterator(InterfaceC7038SM.SET_COOKIE), cookieSpec, cookieOrigin, cookieStore);
                    if (cookieSpec.getVersion() > 0) {
                        processCookies(httpResponse.headerIterator(InterfaceC7038SM.SET_COOKIE2), cookieSpec, cookieOrigin, cookieStore);
                        return;
                    }
                    return;
                }
                log = this.log;
                obj = "Cookie origin not specified in HTTP context";
            }
        }
        log.debug(obj);
    }
}

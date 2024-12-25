package org.apache.http.impl.cookie;

import com.amazonaws.services.p045s3.model.InstructionFileId;
import com.amplifyframework.core.model.ModelIdentifier;
import java.util.Locale;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.util.InetAddressUtils;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.InterfaceC7038SM;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.util.Args;
import org.apache.http.util.TextUtils;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/cookie/BasicDomainHandler.class */
public class BasicDomainHandler implements CommonCookieAttributeHandler {
    public static boolean domainMatch(String str, String str2) {
        if (InetAddressUtils.isIPv4Address(str2) || InetAddressUtils.isIPv6Address(str2)) {
            return false;
        }
        String str3 = str;
        if (str.startsWith(InstructionFileId.DOT)) {
            str3 = str.substring(1);
        }
        if (!str2.endsWith(str3)) {
            return false;
        }
        int length = str2.length() - str3.length();
        if (length == 0) {
            return true;
        }
        return length > 1 && str2.charAt(length - 1) == '.';
    }

    @Override // org.apache.http.cookie.CommonCookieAttributeHandler
    public String getAttributeName() {
        return ClientCookie.DOMAIN_ATTR;
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        Args.notNull(cookie, InterfaceC7038SM.COOKIE);
        Args.notNull(cookieOrigin, "Cookie origin");
        String host = cookieOrigin.getHost();
        String domain = cookie.getDomain();
        if (domain == null) {
            return false;
        }
        String str = domain;
        if (domain.startsWith(InstructionFileId.DOT)) {
            str = domain.substring(1);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        if (host.equals(lowerCase)) {
            return true;
        }
        if ((cookie instanceof ClientCookie) && ((ClientCookie) cookie).containsAttribute(ClientCookie.DOMAIN_ATTR)) {
            return domainMatch(lowerCase, host);
        }
        return false;
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void parse(SetCookie setCookie, String str) {
        Args.notNull(setCookie, InterfaceC7038SM.COOKIE);
        if (TextUtils.isBlank(str)) {
            throw new MalformedCookieException("Blank or null value for domain attribute");
        }
        if (str.endsWith(InstructionFileId.DOT)) {
            return;
        }
        String str2 = str;
        if (str.startsWith(InstructionFileId.DOT)) {
            str2 = str.substring(1);
        }
        setCookie.setDomain(str2.toLowerCase(Locale.ROOT));
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        Args.notNull(cookie, InterfaceC7038SM.COOKIE);
        Args.notNull(cookieOrigin, "Cookie origin");
        String host = cookieOrigin.getHost();
        String domain = cookie.getDomain();
        if (domain == null) {
            throw new CookieRestrictionViolationException("Cookie 'domain' may not be null");
        }
        if (host.equals(domain) || domainMatch(domain, host)) {
            return;
        }
        throw new CookieRestrictionViolationException("Illegal 'domain' attribute \"" + domain + "\". Domain of origin: \"" + host + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
    }
}

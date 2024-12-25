package org.apache.http.impl.cookie;

import com.amazonaws.services.p045s3.model.InstructionFileId;
import com.amplifyframework.core.model.ModelIdentifier;
import java.util.Locale;
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
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/cookie/RFC2109DomainHandler.class */
public class RFC2109DomainHandler implements CommonCookieAttributeHandler {
    @Override // org.apache.http.cookie.CommonCookieAttributeHandler
    public String getAttributeName() {
        return ClientCookie.DOMAIN_ATTR;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        if (r0.endsWith(r0) != false) goto L12;
     */
    @Override // org.apache.http.cookie.CookieAttributeHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean match(org.apache.http.cookie.Cookie r4, org.apache.http.cookie.CookieOrigin r5) {
        /*
            r3 = this;
            r0 = r4
            java.lang.String r1 = "Cookie"
            java.lang.Object r0 = org.apache.http.util.Args.notNull(r0, r1)
            r0 = r5
            java.lang.String r1 = "Cookie origin"
            java.lang.Object r0 = org.apache.http.util.Args.notNull(r0, r1)
            r0 = r5
            java.lang.String r0 = r0.getHost()
            r5 = r0
            r0 = r4
            java.lang.String r0 = r0.getDomain()
            r4 = r0
            r0 = 0
            r7 = r0
            r0 = r4
            if (r0 != 0) goto L23
            r0 = 0
            return r0
        L23:
            r0 = r5
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L42
            r0 = r7
            r6 = r0
            r0 = r4
            java.lang.String r1 = "."
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L44
            r0 = r7
            r6 = r0
            r0 = r5
            r1 = r4
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L44
        L42:
            r0 = 1
            r6 = r0
        L44:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.cookie.RFC2109DomainHandler.match(org.apache.http.cookie.Cookie, org.apache.http.cookie.CookieOrigin):boolean");
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void parse(SetCookie setCookie, String str) {
        Args.notNull(setCookie, InterfaceC7038SM.COOKIE);
        if (str == null) {
            throw new MalformedCookieException("Missing value for domain attribute");
        }
        if (str.trim().isEmpty()) {
            throw new MalformedCookieException("Blank value for domain attribute");
        }
        setCookie.setDomain(str);
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        Args.notNull(cookie, InterfaceC7038SM.COOKIE);
        Args.notNull(cookieOrigin, "Cookie origin");
        String host = cookieOrigin.getHost();
        String domain = cookie.getDomain();
        if (domain == null) {
            throw new CookieRestrictionViolationException("Cookie domain may not be null");
        }
        if (domain.equals(host)) {
            return;
        }
        if (domain.indexOf(46) == -1) {
            throw new CookieRestrictionViolationException("Domain attribute \"" + domain + "\" does not match the host \"" + host + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        }
        if (!domain.startsWith(InstructionFileId.DOT)) {
            throw new CookieRestrictionViolationException("Domain attribute \"" + domain + "\" violates RFC 2109: domain must start with a dot");
        }
        int indexOf = domain.indexOf(46, 1);
        if (indexOf < 0 || indexOf == domain.length() - 1) {
            throw new CookieRestrictionViolationException("Domain attribute \"" + domain + "\" violates RFC 2109: domain must contain an embedded dot");
        }
        String lowerCase = host.toLowerCase(Locale.ROOT);
        if (lowerCase.endsWith(domain)) {
            if (lowerCase.substring(0, lowerCase.length() - domain.length()).indexOf(46) == -1) {
                return;
            }
            throw new CookieRestrictionViolationException("Domain attribute \"" + domain + "\" violates RFC 2109: host minus domain may not contain any dots");
        }
        throw new CookieRestrictionViolationException("Illegal domain attribute \"" + domain + "\". Domain of origin: \"" + lowerCase + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
    }
}

package org.apache.http.impl.client;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthSchemeRegistry;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.client.AuthenticationHandler;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Asserts;
import org.apache.http.util.CharArrayBuffer;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/client/AbstractAuthenticationHandler.class */
public abstract class AbstractAuthenticationHandler implements AuthenticationHandler {
    private static final List<String> DEFAULT_SCHEME_PRIORITY = Collections.unmodifiableList(Arrays.asList("Negotiate", "NTLM", "Digest", "Basic"));
    private final Log log = LogFactory.getLog(getClass());

    public List<String> getAuthPreferences() {
        return DEFAULT_SCHEME_PRIORITY;
    }

    public List<String> getAuthPreferences(HttpResponse httpResponse, HttpContext httpContext) {
        return getAuthPreferences();
    }

    public Map<String, Header> parseChallenges(Header[] headerArr) {
        CharArrayBuffer charArrayBuffer;
        int i10;
        HashMap hashMap = new HashMap(headerArr.length);
        for (Header header : headerArr) {
            if (header instanceof FormattedHeader) {
                FormattedHeader formattedHeader = (FormattedHeader) header;
                charArrayBuffer = formattedHeader.getBuffer();
                i10 = formattedHeader.getValuePos();
            } else {
                String value = header.getValue();
                if (value == null) {
                    throw new MalformedChallengeException("Header value is null");
                }
                charArrayBuffer = new CharArrayBuffer(value.length());
                charArrayBuffer.append(value);
                i10 = 0;
            }
            while (i10 < charArrayBuffer.length() && HTTP.isWhitespace(charArrayBuffer.charAt(i10))) {
                i10++;
            }
            int i11 = i10;
            while (i11 < charArrayBuffer.length() && !HTTP.isWhitespace(charArrayBuffer.charAt(i11))) {
                i11++;
            }
            hashMap.put(charArrayBuffer.substring(i10, i11).toLowerCase(Locale.ROOT), header);
        }
        return hashMap;
    }

    @Override // org.apache.http.client.AuthenticationHandler
    public AuthScheme selectScheme(Map<String, Header> map, HttpResponse httpResponse, HttpContext httpContext) {
        AuthScheme authScheme;
        AuthSchemeRegistry authSchemeRegistry = (AuthSchemeRegistry) httpContext.getAttribute("http.authscheme-registry");
        Asserts.notNull(authSchemeRegistry, "AuthScheme registry");
        List<String> authPreferences = getAuthPreferences(httpResponse, httpContext);
        List<String> list = authPreferences;
        if (authPreferences == null) {
            list = DEFAULT_SCHEME_PRIORITY;
        }
        if (this.log.isDebugEnabled()) {
            this.log.debug("Authentication schemes in the order of preference: " + list);
        }
        Iterator<String> it = list.iterator();
        while (true) {
            authScheme = null;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (map.get(next.toLowerCase(Locale.ENGLISH)) != null) {
                if (this.log.isDebugEnabled()) {
                    this.log.debug(next + " authentication scheme selected");
                }
                try {
                    authScheme = authSchemeRegistry.getAuthScheme(next, httpResponse.getParams());
                    break;
                } catch (IllegalStateException e10) {
                    if (this.log.isWarnEnabled()) {
                        this.log.warn("Authentication scheme " + next + " not supported");
                    }
                }
            } else if (this.log.isDebugEnabled()) {
                this.log.debug("Challenge for " + next + " authentication scheme not available");
            }
        }
        if (authScheme != null) {
            return authScheme;
        }
        throw new AuthenticationException("Unable to respond to any of these challenges: " + map);
    }
}

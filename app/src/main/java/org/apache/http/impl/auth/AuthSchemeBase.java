package org.apache.http.impl.auth;

import java.util.Locale;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.auth.ChallengeState;
import org.apache.http.auth.ContextAwareAuthScheme;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/auth/AuthSchemeBase.class */
public abstract class AuthSchemeBase implements ContextAwareAuthScheme {
    public ChallengeState challengeState;

    public AuthSchemeBase() {
    }

    @Deprecated
    public AuthSchemeBase(ChallengeState challengeState) {
        this.challengeState = challengeState;
    }

    @Override // org.apache.http.auth.ContextAwareAuthScheme
    public Header authenticate(Credentials credentials, HttpRequest httpRequest, HttpContext httpContext) {
        return authenticate(credentials, httpRequest);
    }

    public ChallengeState getChallengeState() {
        return this.challengeState;
    }

    public boolean isProxy() {
        ChallengeState challengeState = this.challengeState;
        return challengeState != null && challengeState == ChallengeState.PROXY;
    }

    public abstract void parseChallenge(CharArrayBuffer charArrayBuffer, int i10, int i11);

    @Override // org.apache.http.auth.AuthScheme
    public void processChallenge(Header header) {
        ChallengeState challengeState;
        CharArrayBuffer charArrayBuffer;
        int i10;
        Args.notNull(header, "Header");
        String name = header.getName();
        if (name.equalsIgnoreCase("WWW-Authenticate")) {
            challengeState = ChallengeState.TARGET;
        } else {
            if (!name.equalsIgnoreCase("Proxy-Authenticate")) {
                throw new MalformedChallengeException("Unexpected header name: " + name);
            }
            challengeState = ChallengeState.PROXY;
        }
        this.challengeState = challengeState;
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
        String substring = charArrayBuffer.substring(i10, i11);
        if (substring.equalsIgnoreCase(getSchemeName())) {
            parseChallenge(charArrayBuffer, i11, charArrayBuffer.length());
            return;
        }
        throw new MalformedChallengeException("Invalid scheme identifier: " + substring);
    }

    public String toString() {
        String schemeName = getSchemeName();
        return schemeName != null ? schemeName.toUpperCase(Locale.ROOT) : super.toString();
    }
}

package org.apache.http.impl.auth;

import java.nio.charset.Charset;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.Consts;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.auth.ChallengeState;
import org.apache.http.auth.Credentials;
import org.apache.http.message.BufferedHeader;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.EncodingUtils;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/auth/BasicScheme.class */
public class BasicScheme extends RFC2617Scheme {
    private static final long serialVersionUID = -1931571557597830536L;
    private boolean complete;

    public BasicScheme() {
        this(Consts.ASCII);
    }

    public BasicScheme(Charset charset) {
        super(charset);
        this.complete = false;
    }

    @Deprecated
    public BasicScheme(ChallengeState challengeState) {
        super(challengeState);
    }

    @Deprecated
    public static Header authenticate(Credentials credentials, String str, boolean z10) {
        Args.notNull(credentials, "Credentials");
        Args.notNull(str, "charset");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(credentials.getUserPrincipal().getName());
        sb2.append(":");
        sb2.append(credentials.getPassword() == null ? "null" : credentials.getPassword());
        byte[] encodeBase64 = Base64.encodeBase64(EncodingUtils.getBytes(sb2.toString(), str), false);
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(32);
        charArrayBuffer.append(z10 ? "Proxy-Authorization" : "Authorization");
        charArrayBuffer.append(": Basic ");
        charArrayBuffer.append(encodeBase64, 0, encodeBase64.length);
        return new BufferedHeader(charArrayBuffer);
    }

    @Override // org.apache.http.auth.AuthScheme
    @Deprecated
    public Header authenticate(Credentials credentials, HttpRequest httpRequest) {
        return authenticate(credentials, httpRequest, new BasicHttpContext());
    }

    @Override // org.apache.http.impl.auth.AuthSchemeBase, org.apache.http.auth.ContextAwareAuthScheme
    public Header authenticate(Credentials credentials, HttpRequest httpRequest, HttpContext httpContext) {
        Args.notNull(credentials, "Credentials");
        Args.notNull(httpRequest, "HTTP request");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(credentials.getUserPrincipal().getName());
        sb2.append(":");
        sb2.append(credentials.getPassword() == null ? "null" : credentials.getPassword());
        byte[] encode = new Base64(0).encode(EncodingUtils.getBytes(sb2.toString(), getCredentialsCharset(httpRequest)));
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(32);
        charArrayBuffer.append(isProxy() ? "Proxy-Authorization" : "Authorization");
        charArrayBuffer.append(": Basic ");
        charArrayBuffer.append(encode, 0, encode.length);
        return new BufferedHeader(charArrayBuffer);
    }

    @Override // org.apache.http.auth.AuthScheme
    public String getSchemeName() {
        return "basic";
    }

    @Override // org.apache.http.auth.AuthScheme
    public boolean isComplete() {
        return this.complete;
    }

    @Override // org.apache.http.auth.AuthScheme
    public boolean isConnectionBased() {
        return false;
    }

    @Override // org.apache.http.impl.auth.AuthSchemeBase, org.apache.http.auth.AuthScheme
    public void processChallenge(Header header) {
        super.processChallenge(header);
        this.complete = true;
    }

    @Override // org.apache.http.impl.auth.AuthSchemeBase
    public String toString() {
        return "BASIC [complete=" + this.complete + "]";
    }
}

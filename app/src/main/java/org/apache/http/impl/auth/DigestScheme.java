package org.apache.http.impl.auth;

import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashSet;
import java.util.Locale;
import java.util.StringTokenizer;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.http.Consts;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.ChallengeState;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.message.BasicHeaderValueFormatter;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.message.BufferedHeader;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.EncodingUtils;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/auth/DigestScheme.class */
public class DigestScheme extends RFC2617Scheme {
    private static final char[] HEXADECIMAL = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final int QOP_AUTH = 2;
    private static final int QOP_AUTH_INT = 1;
    private static final int QOP_MISSING = 0;
    private static final int QOP_UNKNOWN = -1;
    private static final long serialVersionUID = 3883908186234566916L;

    /* renamed from: a1 */
    private String f36155a1;

    /* renamed from: a2 */
    private String f36156a2;
    private String cnonce;
    private boolean complete;
    private String lastNonce;
    private long nounceCount;

    public DigestScheme() {
        this(Consts.ASCII);
    }

    public DigestScheme(Charset charset) {
        super(charset);
        this.complete = false;
    }

    @Deprecated
    public DigestScheme(ChallengeState challengeState) {
        super(challengeState);
    }

    public static String createCnonce() {
        byte[] bArr = new byte[8];
        new SecureRandom().nextBytes(bArr);
        return encode(bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Header createDigestHeader(Credentials credentials, HttpRequest httpRequest) {
        boolean z10;
        String parameter = getParameter("uri");
        String parameter2 = getParameter("realm");
        String parameter3 = getParameter("nonce");
        String parameter4 = getParameter("opaque");
        String parameter5 = getParameter("methodname");
        String parameter6 = getParameter("algorithm");
        String str = parameter6;
        if (parameter6 == null) {
            str = MessageDigestAlgorithms.MD5;
        }
        HashSet hashSet = new HashSet(8);
        String str2 = MessageDigestAlgorithms.MD5;
        String parameter7 = getParameter("qop");
        if (parameter7 != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(parameter7, ",");
            while (stringTokenizer.hasMoreTokens()) {
                hashSet.add(stringTokenizer.nextToken().trim().toLowerCase(Locale.ROOT));
            }
            z10 = ((httpRequest instanceof HttpEntityEnclosingRequest) && hashSet.contains("auth-int")) ? true : hashSet.contains("auth") ? 2 : -1;
        } else {
            z10 = false;
        }
        if (z10 == -1) {
            throw new AuthenticationException("None of the qop methods is supported: " + parameter7);
        }
        String parameter8 = getParameter("charset");
        String str3 = parameter8;
        if (parameter8 == null) {
            str3 = "ISO-8859-1";
        }
        if (!str.equalsIgnoreCase("MD5-sess")) {
            str2 = str;
        }
        try {
            MessageDigest createMessageDigest = createMessageDigest(str2);
            String name = credentials.getUserPrincipal().getName();
            String password = credentials.getPassword();
            if (parameter3.equals(this.lastNonce)) {
                this.nounceCount++;
            } else {
                this.nounceCount = 1L;
                this.cnonce = null;
                this.lastNonce = parameter3;
            }
            StringBuilder sb2 = new StringBuilder(256);
            Formatter formatter = new Formatter(sb2, Locale.US);
            formatter.format("%08x", Long.valueOf(this.nounceCount));
            formatter.close();
            String sb3 = sb2.toString();
            if (this.cnonce == null) {
                this.cnonce = createCnonce();
            }
            this.f36155a1 = null;
            this.f36156a2 = null;
            if (str.equalsIgnoreCase("MD5-sess")) {
                sb2.setLength(0);
                sb2.append(name);
                sb2.append(':');
                sb2.append(parameter2);
                sb2.append(':');
                sb2.append(password);
                String encode = encode(createMessageDigest.digest(EncodingUtils.getBytes(sb2.toString(), str3)));
                sb2.setLength(0);
                sb2.append(encode);
                sb2.append(':');
                sb2.append(parameter3);
                sb2.append(':');
                password = this.cnonce;
            } else {
                sb2.setLength(0);
                sb2.append(name);
                sb2.append(':');
                sb2.append(parameter2);
                sb2.append(':');
            }
            sb2.append(password);
            this.f36155a1 = sb2.toString();
            String encode2 = encode(createMessageDigest.digest(EncodingUtils.getBytes(this.f36155a1, str3)));
            if (z10 == 2) {
                this.f36156a2 = parameter5 + ':' + parameter;
            } else if (z10) {
                HttpEntity entity = httpRequest instanceof HttpEntityEnclosingRequest ? ((HttpEntityEnclosingRequest) httpRequest).getEntity() : null;
                if (entity == null || entity.isRepeatable()) {
                    HttpEntityDigester httpEntityDigester = new HttpEntityDigester(createMessageDigest);
                    if (entity != null) {
                        try {
                            entity.writeTo(httpEntityDigester);
                        } catch (IOException e10) {
                            throw new AuthenticationException("I/O error reading entity content", e10);
                        }
                    }
                    httpEntityDigester.close();
                    this.f36156a2 = parameter5 + ':' + parameter + ':' + encode(httpEntityDigester.getDigest());
                } else {
                    if (!hashSet.contains("auth")) {
                        throw new AuthenticationException("Qop auth-int cannot be used with a non-repeatable entity");
                    }
                    this.f36156a2 = parameter5 + ':' + parameter;
                    z10 = 2;
                }
            } else {
                this.f36156a2 = parameter5 + ':' + parameter;
            }
            String encode3 = encode(createMessageDigest.digest(EncodingUtils.getBytes(this.f36156a2, str3)));
            if (z10) {
                sb2.setLength(0);
                sb2.append(encode2);
                sb2.append(':');
                sb2.append(parameter3);
                sb2.append(':');
                sb2.append(sb3);
                sb2.append(':');
                sb2.append(this.cnonce);
                sb2.append(':');
                sb2.append(z10 ? "auth-int" : "auth");
            } else {
                sb2.setLength(0);
                sb2.append(encode2);
                sb2.append(':');
                sb2.append(parameter3);
            }
            sb2.append(':');
            sb2.append(encode3);
            String encode4 = encode(createMessageDigest.digest(EncodingUtils.getAsciiBytes(sb2.toString())));
            CharArrayBuffer charArrayBuffer = new CharArrayBuffer(128);
            charArrayBuffer.append(isProxy() ? "Proxy-Authorization" : "Authorization");
            charArrayBuffer.append(": Digest ");
            ArrayList arrayList = new ArrayList(20);
            arrayList.add(new BasicNameValuePair(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, name));
            arrayList.add(new BasicNameValuePair("realm", parameter2));
            arrayList.add(new BasicNameValuePair("nonce", parameter3));
            arrayList.add(new BasicNameValuePair("uri", parameter));
            arrayList.add(new BasicNameValuePair("response", encode4));
            if (z10) {
                arrayList.add(new BasicNameValuePair("qop", z10 ? "auth-int" : "auth"));
                arrayList.add(new BasicNameValuePair("nc", sb3));
                arrayList.add(new BasicNameValuePair("cnonce", this.cnonce));
            }
            arrayList.add(new BasicNameValuePair("algorithm", str));
            if (parameter4 != null) {
                arrayList.add(new BasicNameValuePair("opaque", parameter4));
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                BasicNameValuePair basicNameValuePair = (BasicNameValuePair) arrayList.get(i10);
                if (i10 > 0) {
                    charArrayBuffer.append(", ");
                }
                String name2 = basicNameValuePair.getName();
                BasicHeaderValueFormatter.INSTANCE.formatNameValuePair(charArrayBuffer, basicNameValuePair, !("nc".equals(name2) || "qop".equals(name2) || "algorithm".equals(name2)));
            }
            return new BufferedHeader(charArrayBuffer);
        } catch (UnsupportedDigestAlgorithmException e11) {
            throw new AuthenticationException("Unsuppported digest algorithm: " + str2);
        }
    }

    private static MessageDigest createMessageDigest(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (Exception e10) {
            throw new UnsupportedDigestAlgorithmException("Unsupported algorithm in HTTP Digest authentication: " + str);
        }
    }

    public static String encode(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length * 2];
        for (int i10 = 0; i10 < length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            char[] cArr2 = HEXADECIMAL;
            cArr[i11] = cArr2[(b10 & 240) >> 4];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
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
        if (getParameter("realm") == null) {
            throw new AuthenticationException("missing realm in challenge");
        }
        if (getParameter("nonce") == null) {
            throw new AuthenticationException("missing nonce in challenge");
        }
        getParameters().put("methodname", httpRequest.getRequestLine().getMethod());
        getParameters().put("uri", httpRequest.getRequestLine().getUri());
        if (getParameter("charset") == null) {
            getParameters().put("charset", getCredentialsCharset(httpRequest));
        }
        return createDigestHeader(credentials, httpRequest);
    }

    public String getA1() {
        return this.f36155a1;
    }

    public String getA2() {
        return this.f36156a2;
    }

    public String getCnonce() {
        return this.cnonce;
    }

    @Override // org.apache.http.auth.AuthScheme
    public String getSchemeName() {
        return "digest";
    }

    @Override // org.apache.http.auth.AuthScheme
    public boolean isComplete() {
        if ("true".equalsIgnoreCase(getParameter("stale"))) {
            return false;
        }
        return this.complete;
    }

    @Override // org.apache.http.auth.AuthScheme
    public boolean isConnectionBased() {
        return false;
    }

    public void overrideParamter(String str, String str2) {
        getParameters().put(str, str2);
    }

    @Override // org.apache.http.impl.auth.AuthSchemeBase, org.apache.http.auth.AuthScheme
    public void processChallenge(Header header) {
        super.processChallenge(header);
        this.complete = true;
        if (getParameters().isEmpty()) {
            throw new MalformedChallengeException("Authentication challenge is empty");
        }
    }

    @Override // org.apache.http.impl.auth.AuthSchemeBase
    public String toString() {
        return "DIGEST [complete=" + this.complete + ", nonce=" + this.lastNonce + ", nc=" + this.nounceCount + "]";
    }
}

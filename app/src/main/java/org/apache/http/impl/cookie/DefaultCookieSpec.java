package org.apache.http.impl.cookie;

import java.util.List;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.InterfaceC7038SM;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie2;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@Contract(threading = ThreadingBehavior.SAFE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/cookie/DefaultCookieSpec.class */
public class DefaultCookieSpec implements CookieSpec {
    private final NetscapeDraftSpec netscapeDraft;
    private final RFC2109Spec obsoleteStrict;
    private final RFC2965Spec strict;

    public DefaultCookieSpec() {
        this(null, false);
    }

    public DefaultCookieSpec(RFC2965Spec rFC2965Spec, RFC2109Spec rFC2109Spec, NetscapeDraftSpec netscapeDraftSpec) {
        this.strict = rFC2965Spec;
        this.obsoleteStrict = rFC2109Spec;
        this.netscapeDraft = netscapeDraftSpec;
    }

    public DefaultCookieSpec(String[] strArr, boolean z10) {
        this.strict = new RFC2965Spec(z10, new RFC2965VersionAttributeHandler(), new BasicPathHandler(), new RFC2965DomainAttributeHandler(), new RFC2965PortAttributeHandler(), new BasicMaxAgeHandler(), new BasicSecureHandler(), new BasicCommentHandler(), new RFC2965CommentUrlAttributeHandler(), new RFC2965DiscardAttributeHandler());
        this.obsoleteStrict = new RFC2109Spec(z10, new RFC2109VersionHandler(), new BasicPathHandler(), new RFC2109DomainHandler(), new BasicMaxAgeHandler(), new BasicSecureHandler(), new BasicCommentHandler());
        this.netscapeDraft = new NetscapeDraftSpec(new BasicDomainHandler(), new BasicPathHandler(), new BasicSecureHandler(), new BasicCommentHandler(), new BasicExpiresHandler(strArr != null ? (String[]) strArr.clone() : new String[]{NetscapeDraftSpec.EXPIRES_PATTERN}));
    }

    @Override // org.apache.http.cookie.CookieSpec
    public List<Header> formatCookies(List<Cookie> list) {
        Args.notNull(list, "List of cookies");
        int i10 = Integer.MAX_VALUE;
        boolean z10 = true;
        for (Cookie cookie : list) {
            boolean z11 = z10;
            if (!(cookie instanceof SetCookie2)) {
                z11 = false;
            }
            z10 = z11;
            if (cookie.getVersion() < i10) {
                i10 = cookie.getVersion();
                z10 = z11;
            }
        }
        return i10 > 0 ? z10 ? this.strict.formatCookies(list) : this.obsoleteStrict.formatCookies(list) : this.netscapeDraft.formatCookies(list);
    }

    @Override // org.apache.http.cookie.CookieSpec
    public int getVersion() {
        return this.strict.getVersion();
    }

    @Override // org.apache.http.cookie.CookieSpec
    public Header getVersionHeader() {
        return null;
    }

    @Override // org.apache.http.cookie.CookieSpec
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        Args.notNull(cookie, InterfaceC7038SM.COOKIE);
        Args.notNull(cookieOrigin, "Cookie origin");
        return cookie.getVersion() > 0 ? cookie instanceof SetCookie2 ? this.strict.match(cookie, cookieOrigin) : this.obsoleteStrict.match(cookie, cookieOrigin) : this.netscapeDraft.match(cookie, cookieOrigin);
    }

    @Override // org.apache.http.cookie.CookieSpec
    public List<Cookie> parse(Header header, CookieOrigin cookieOrigin) {
        CharArrayBuffer charArrayBuffer;
        ParserCursor parserCursor;
        Args.notNull(header, "Header");
        Args.notNull(cookieOrigin, "Cookie origin");
        HeaderElement[] elements = header.getElements();
        boolean z10 = false;
        boolean z11 = false;
        for (HeaderElement headerElement : elements) {
            if (headerElement.getParameterByName(ClientCookie.VERSION_ATTR) != null) {
                z11 = true;
            }
            if (headerElement.getParameterByName(ClientCookie.EXPIRES_ATTR) != null) {
                z10 = true;
            }
        }
        if (!z10 && z11) {
            return InterfaceC7038SM.SET_COOKIE2.equals(header.getName()) ? this.strict.parse(elements, cookieOrigin) : this.obsoleteStrict.parse(elements, cookieOrigin);
        }
        NetscapeDraftHeaderParser netscapeDraftHeaderParser = NetscapeDraftHeaderParser.DEFAULT;
        if (header instanceof FormattedHeader) {
            FormattedHeader formattedHeader = (FormattedHeader) header;
            charArrayBuffer = formattedHeader.getBuffer();
            parserCursor = new ParserCursor(formattedHeader.getValuePos(), charArrayBuffer.length());
        } else {
            String value = header.getValue();
            if (value == null) {
                throw new MalformedCookieException("Header value is null");
            }
            charArrayBuffer = new CharArrayBuffer(value.length());
            charArrayBuffer.append(value);
            parserCursor = new ParserCursor(0, charArrayBuffer.length());
        }
        return this.netscapeDraft.parse(new HeaderElement[]{netscapeDraftHeaderParser.parseHeader(charArrayBuffer, parserCursor)}, cookieOrigin);
    }

    public String toString() {
        return CookieSpecs.DEFAULT;
    }

    @Override // org.apache.http.cookie.CookieSpec
    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        Args.notNull(cookie, InterfaceC7038SM.COOKIE);
        Args.notNull(cookieOrigin, "Cookie origin");
        if (cookie.getVersion() <= 0) {
            this.netscapeDraft.validate(cookie, cookieOrigin);
        } else if (cookie instanceof SetCookie2) {
            this.strict.validate(cookie, cookieOrigin);
        } else {
            this.obsoleteStrict.validate(cookie, cookieOrigin);
        }
    }
}

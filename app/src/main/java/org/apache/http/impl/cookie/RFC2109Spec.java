package org.apache.http.impl.cookie;

import com.amplifyframework.core.model.ModelIdentifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.Obsolete;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.params.CookiePolicy;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookiePathComparator;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.InterfaceC7038SM;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@Contract(threading = ThreadingBehavior.SAFE)
@Obsolete
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/cookie/RFC2109Spec.class */
public class RFC2109Spec extends CookieSpecBase {
    public static final String[] DATE_PATTERNS = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy"};
    private final boolean oneHeader;

    public RFC2109Spec() {
        this((String[]) null, false);
    }

    public RFC2109Spec(boolean z10, CommonCookieAttributeHandler... commonCookieAttributeHandlerArr) {
        super(commonCookieAttributeHandlerArr);
        this.oneHeader = z10;
    }

    public RFC2109Spec(String[] strArr, boolean z10) {
        super(new RFC2109VersionHandler(), new BasicPathHandler() { // from class: org.apache.http.impl.cookie.RFC2109Spec.1
            @Override // org.apache.http.impl.cookie.BasicPathHandler, org.apache.http.cookie.CookieAttributeHandler
            public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
                if (match(cookie, cookieOrigin)) {
                    return;
                }
                throw new CookieRestrictionViolationException("Illegal 'path' attribute \"" + cookie.getPath() + "\". Path of origin: \"" + cookieOrigin.getPath() + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
            }
        }, new RFC2109DomainHandler(), new BasicMaxAgeHandler(), new BasicSecureHandler(), new BasicCommentHandler(), new BasicExpiresHandler(strArr != null ? (String[]) strArr.clone() : DATE_PATTERNS));
        this.oneHeader = z10;
    }

    private List<Header> doFormatManyHeaders(List<Cookie> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Cookie cookie : list) {
            int version = cookie.getVersion();
            CharArrayBuffer charArrayBuffer = new CharArrayBuffer(40);
            charArrayBuffer.append("Cookie: ");
            charArrayBuffer.append("$Version=");
            charArrayBuffer.append(Integer.toString(version));
            charArrayBuffer.append("; ");
            formatCookieAsVer(charArrayBuffer, cookie, version);
            arrayList.add(new BufferedHeader(charArrayBuffer));
        }
        return arrayList;
    }

    private List<Header> doFormatOneHeader(List<Cookie> list) {
        int i10 = Integer.MAX_VALUE;
        for (Cookie cookie : list) {
            if (cookie.getVersion() < i10) {
                i10 = cookie.getVersion();
            }
        }
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(list.size() * 40);
        charArrayBuffer.append(InterfaceC7038SM.COOKIE);
        charArrayBuffer.append(": ");
        charArrayBuffer.append("$Version=");
        charArrayBuffer.append(Integer.toString(i10));
        for (Cookie cookie2 : list) {
            charArrayBuffer.append("; ");
            formatCookieAsVer(charArrayBuffer, cookie2, i10);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new BufferedHeader(charArrayBuffer));
        return arrayList;
    }

    public void formatCookieAsVer(CharArrayBuffer charArrayBuffer, Cookie cookie, int i10) {
        formatParamAsVer(charArrayBuffer, cookie.getName(), cookie.getValue(), i10);
        if (cookie.getPath() != null && (cookie instanceof ClientCookie) && ((ClientCookie) cookie).containsAttribute(ClientCookie.PATH_ATTR)) {
            charArrayBuffer.append("; ");
            formatParamAsVer(charArrayBuffer, "$Path", cookie.getPath(), i10);
        }
        if (cookie.getDomain() != null && (cookie instanceof ClientCookie) && ((ClientCookie) cookie).containsAttribute(ClientCookie.DOMAIN_ATTR)) {
            charArrayBuffer.append("; ");
            formatParamAsVer(charArrayBuffer, "$Domain", cookie.getDomain(), i10);
        }
    }

    @Override // org.apache.http.cookie.CookieSpec
    public List<Header> formatCookies(List<Cookie> list) {
        Args.notEmpty(list, "List of cookies");
        List<Cookie> list2 = list;
        if (list.size() > 1) {
            list2 = new ArrayList(list);
            Collections.sort(list2, CookiePathComparator.INSTANCE);
        }
        return this.oneHeader ? doFormatOneHeader(list2) : doFormatManyHeaders(list2);
    }

    public void formatParamAsVer(CharArrayBuffer charArrayBuffer, String str, String str2, int i10) {
        charArrayBuffer.append(str);
        charArrayBuffer.append("=");
        if (str2 != null) {
            if (i10 <= 0) {
                charArrayBuffer.append(str2);
                return;
            }
            charArrayBuffer.append('\"');
            charArrayBuffer.append(str2);
            charArrayBuffer.append('\"');
        }
    }

    @Override // org.apache.http.cookie.CookieSpec
    public int getVersion() {
        return 1;
    }

    @Override // org.apache.http.cookie.CookieSpec
    public Header getVersionHeader() {
        return null;
    }

    @Override // org.apache.http.cookie.CookieSpec
    public List<Cookie> parse(Header header, CookieOrigin cookieOrigin) {
        Args.notNull(header, "Header");
        Args.notNull(cookieOrigin, "Cookie origin");
        if (header.getName().equalsIgnoreCase(InterfaceC7038SM.SET_COOKIE)) {
            return parse(header.getElements(), cookieOrigin);
        }
        throw new MalformedCookieException("Unrecognized cookie header '" + header.toString() + "'");
    }

    public String toString() {
        return CookiePolicy.RFC_2109;
    }

    @Override // org.apache.http.impl.cookie.CookieSpecBase, org.apache.http.cookie.CookieSpec
    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        Args.notNull(cookie, InterfaceC7038SM.COOKIE);
        String name = cookie.getName();
        if (name.indexOf(32) != -1) {
            throw new CookieRestrictionViolationException("Cookie name may not contain blanks");
        }
        if (name.startsWith("$")) {
            throw new CookieRestrictionViolationException("Cookie name may not start with $");
        }
        super.validate(cookie, cookieOrigin);
    }
}

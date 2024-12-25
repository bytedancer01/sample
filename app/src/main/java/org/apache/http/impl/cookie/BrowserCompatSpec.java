package org.apache.http.impl.cookie;

import com.amplifyframework.core.model.ModelIdentifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.InterfaceC7038SM;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.impl.cookie.BrowserCompatSpecFactory;
import org.apache.http.message.BasicHeaderElement;
import org.apache.http.message.BasicHeaderValueFormatter;
import org.apache.http.message.BufferedHeader;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@Contract(threading = ThreadingBehavior.SAFE)
@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/cookie/BrowserCompatSpec.class */
public class BrowserCompatSpec extends CookieSpecBase {
    private static final String[] DEFAULT_DATE_PATTERNS = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z"};

    public BrowserCompatSpec() {
        this(null, BrowserCompatSpecFactory.SecurityLevel.SECURITYLEVEL_DEFAULT);
    }

    public BrowserCompatSpec(String[] strArr) {
        this(strArr, BrowserCompatSpecFactory.SecurityLevel.SECURITYLEVEL_DEFAULT);
    }

    public BrowserCompatSpec(String[] strArr, BrowserCompatSpecFactory.SecurityLevel securityLevel) {
        super(new BrowserCompatVersionAttributeHandler(), new BasicDomainHandler(), securityLevel == BrowserCompatSpecFactory.SecurityLevel.SECURITYLEVEL_IE_MEDIUM ? new BasicPathHandler() { // from class: org.apache.http.impl.cookie.BrowserCompatSpec.1
            @Override // org.apache.http.impl.cookie.BasicPathHandler, org.apache.http.cookie.CookieAttributeHandler
            public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
            }
        } : new BasicPathHandler(), new BasicMaxAgeHandler(), new BasicSecureHandler(), new BasicCommentHandler(), new BasicExpiresHandler(strArr != null ? (String[]) strArr.clone() : DEFAULT_DATE_PATTERNS));
    }

    private static boolean isQuoteEnclosed(String str) {
        return str != null && str.startsWith(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR) && str.endsWith(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
    }

    @Override // org.apache.http.cookie.CookieSpec
    public List<Header> formatCookies(List<Cookie> list) {
        Args.notEmpty(list, "List of cookies");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(list.size() * 20);
        charArrayBuffer.append(InterfaceC7038SM.COOKIE);
        charArrayBuffer.append(": ");
        for (int i10 = 0; i10 < list.size(); i10++) {
            Cookie cookie = list.get(i10);
            if (i10 > 0) {
                charArrayBuffer.append("; ");
            }
            String name = cookie.getName();
            String value = cookie.getValue();
            if (cookie.getVersion() <= 0 || isQuoteEnclosed(value)) {
                charArrayBuffer.append(name);
                charArrayBuffer.append("=");
                if (value != null) {
                    charArrayBuffer.append(value);
                }
            } else {
                BasicHeaderValueFormatter.INSTANCE.formatHeaderElement(charArrayBuffer, (HeaderElement) new BasicHeaderElement(name, value), false);
            }
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new BufferedHeader(charArrayBuffer));
        return arrayList;
    }

    @Override // org.apache.http.cookie.CookieSpec
    public int getVersion() {
        return 0;
    }

    @Override // org.apache.http.cookie.CookieSpec
    public Header getVersionHeader() {
        return null;
    }

    @Override // org.apache.http.cookie.CookieSpec
    public List<Cookie> parse(Header header, CookieOrigin cookieOrigin) {
        CharArrayBuffer charArrayBuffer;
        ParserCursor parserCursor;
        Args.notNull(header, "Header");
        Args.notNull(cookieOrigin, "Cookie origin");
        if (!header.getName().equalsIgnoreCase(InterfaceC7038SM.SET_COOKIE)) {
            throw new MalformedCookieException("Unrecognized cookie header '" + header.toString() + "'");
        }
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
            return parse(elements, cookieOrigin);
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
        HeaderElement parseHeader = netscapeDraftHeaderParser.parseHeader(charArrayBuffer, parserCursor);
        String name = parseHeader.getName();
        String value2 = parseHeader.getValue();
        if (name == null || name.isEmpty()) {
            throw new MalformedCookieException("Cookie name may not be empty");
        }
        BasicClientCookie basicClientCookie = new BasicClientCookie(name, value2);
        basicClientCookie.setPath(CookieSpecBase.getDefaultPath(cookieOrigin));
        basicClientCookie.setDomain(CookieSpecBase.getDefaultDomain(cookieOrigin));
        NameValuePair[] parameters = parseHeader.getParameters();
        for (int length = parameters.length - 1; length >= 0; length--) {
            NameValuePair nameValuePair = parameters[length];
            String lowerCase = nameValuePair.getName().toLowerCase(Locale.ROOT);
            basicClientCookie.setAttribute(lowerCase, nameValuePair.getValue());
            CookieAttributeHandler findAttribHandler = findAttribHandler(lowerCase);
            if (findAttribHandler != null) {
                findAttribHandler.parse(basicClientCookie, nameValuePair.getValue());
            }
        }
        if (z10) {
            basicClientCookie.setVersion(0);
        }
        return Collections.singletonList(basicClientCookie);
    }

    public String toString() {
        return "compatibility";
    }
}

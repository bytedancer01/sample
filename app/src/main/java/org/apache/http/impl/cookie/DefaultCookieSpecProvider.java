package org.apache.http.impl.cookie;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.util.PublicSuffixMatcher;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.protocol.HttpContext;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/cookie/DefaultCookieSpecProvider.class */
public class DefaultCookieSpecProvider implements CookieSpecProvider {
    private final CompatibilityLevel compatibilityLevel;
    private volatile CookieSpec cookieSpec;
    private final String[] datepatterns;
    private final boolean oneHeader;
    private final PublicSuffixMatcher publicSuffixMatcher;

    /* loaded from: combined.jar:classes3.jar:org/apache/http/impl/cookie/DefaultCookieSpecProvider$CompatibilityLevel.class */
    public enum CompatibilityLevel {
        DEFAULT,
        IE_MEDIUM_SECURITY
    }

    public DefaultCookieSpecProvider() {
        this(CompatibilityLevel.DEFAULT, null, null, false);
    }

    public DefaultCookieSpecProvider(PublicSuffixMatcher publicSuffixMatcher) {
        this(CompatibilityLevel.DEFAULT, publicSuffixMatcher, null, false);
    }

    public DefaultCookieSpecProvider(CompatibilityLevel compatibilityLevel, PublicSuffixMatcher publicSuffixMatcher) {
        this(compatibilityLevel, publicSuffixMatcher, null, false);
    }

    public DefaultCookieSpecProvider(CompatibilityLevel compatibilityLevel, PublicSuffixMatcher publicSuffixMatcher, String[] strArr, boolean z10) {
        this.compatibilityLevel = compatibilityLevel == null ? CompatibilityLevel.DEFAULT : compatibilityLevel;
        this.publicSuffixMatcher = publicSuffixMatcher;
        this.datepatterns = strArr;
        this.oneHeader = z10;
    }

    @Override // org.apache.http.cookie.CookieSpecProvider
    public CookieSpec create(HttpContext httpContext) {
        if (this.cookieSpec == null) {
            synchronized (this) {
                if (this.cookieSpec == null) {
                    RFC2965Spec rFC2965Spec = new RFC2965Spec(this.oneHeader, new RFC2965VersionAttributeHandler(), new BasicPathHandler(), PublicSuffixDomainFilter.decorate(new RFC2965DomainAttributeHandler(), this.publicSuffixMatcher), new RFC2965PortAttributeHandler(), new BasicMaxAgeHandler(), new BasicSecureHandler(), new BasicCommentHandler(), new RFC2965CommentUrlAttributeHandler(), new RFC2965DiscardAttributeHandler());
                    RFC2109Spec rFC2109Spec = new RFC2109Spec(this.oneHeader, new RFC2109VersionHandler(), new BasicPathHandler(), PublicSuffixDomainFilter.decorate(new RFC2109DomainHandler(), this.publicSuffixMatcher), new BasicMaxAgeHandler(), new BasicSecureHandler(), new BasicCommentHandler());
                    CommonCookieAttributeHandler decorate = PublicSuffixDomainFilter.decorate(new BasicDomainHandler(), this.publicSuffixMatcher);
                    BasicPathHandler basicPathHandler = this.compatibilityLevel == CompatibilityLevel.IE_MEDIUM_SECURITY ? new BasicPathHandler(this) { // from class: org.apache.http.impl.cookie.DefaultCookieSpecProvider.1
                        public final DefaultCookieSpecProvider this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override // org.apache.http.impl.cookie.BasicPathHandler, org.apache.http.cookie.CookieAttributeHandler
                        public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
                        }
                    } : new BasicPathHandler();
                    BasicSecureHandler basicSecureHandler = new BasicSecureHandler();
                    BasicCommentHandler basicCommentHandler = new BasicCommentHandler();
                    String[] strArr = this.datepatterns;
                    this.cookieSpec = new DefaultCookieSpec(rFC2965Spec, rFC2109Spec, new NetscapeDraftSpec(decorate, basicPathHandler, basicSecureHandler, basicCommentHandler, new BasicExpiresHandler(strArr != null ? (String[]) strArr.clone() : new String[]{NetscapeDraftSpec.EXPIRES_PATTERN})));
                }
            }
        }
        return this.cookieSpec;
    }
}

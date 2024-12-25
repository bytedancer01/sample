package org.apache.http.impl.cookie;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.util.PublicSuffixMatcher;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.protocol.HttpContext;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/cookie/RFC6265CookieSpecProvider.class */
public class RFC6265CookieSpecProvider implements CookieSpecProvider {
    private final CompatibilityLevel compatibilityLevel;
    private volatile CookieSpec cookieSpec;
    private final PublicSuffixMatcher publicSuffixMatcher;

    /* renamed from: org.apache.http.impl.cookie.RFC6265CookieSpecProvider$2 */
    /* loaded from: combined.jar:classes3.jar:org/apache/http/impl/cookie/RFC6265CookieSpecProvider$2.class */
    public static /* synthetic */ class C70612 {

        /* renamed from: $SwitchMap$org$apache$http$impl$cookie$RFC6265CookieSpecProvider$CompatibilityLevel */
        public static final int[] f36165x14f07ea0;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:8:0x0020
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                org.apache.http.impl.cookie.RFC6265CookieSpecProvider$CompatibilityLevel[] r0 = org.apache.http.impl.cookie.RFC6265CookieSpecProvider.CompatibilityLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                org.apache.http.impl.cookie.RFC6265CookieSpecProvider.C70612.f36165x14f07ea0 = r0
                r0 = r4
                org.apache.http.impl.cookie.RFC6265CookieSpecProvider$CompatibilityLevel r1 = org.apache.http.impl.cookie.RFC6265CookieSpecProvider.CompatibilityLevel.STRICT     // Catch: java.lang.NoSuchFieldError -> L20
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L20
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L20
            L14:
                int[] r0 = org.apache.http.impl.cookie.RFC6265CookieSpecProvider.C70612.f36165x14f07ea0     // Catch: java.lang.NoSuchFieldError -> L20 java.lang.NoSuchFieldError -> L24
                org.apache.http.impl.cookie.RFC6265CookieSpecProvider$CompatibilityLevel r1 = org.apache.http.impl.cookie.RFC6265CookieSpecProvider.CompatibilityLevel.IE_MEDIUM_SECURITY     // Catch: java.lang.NoSuchFieldError -> L24
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L24
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L24
            L1f:
                return
            L20:
                r4 = move-exception
                goto L14
            L24:
                r4 = move-exception
                goto L1f
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.cookie.RFC6265CookieSpecProvider.C70612.m45359clinit():void");
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/apache/http/impl/cookie/RFC6265CookieSpecProvider$CompatibilityLevel.class */
    public enum CompatibilityLevel {
        STRICT,
        RELAXED,
        IE_MEDIUM_SECURITY
    }

    public RFC6265CookieSpecProvider() {
        this(CompatibilityLevel.RELAXED, null);
    }

    public RFC6265CookieSpecProvider(PublicSuffixMatcher publicSuffixMatcher) {
        this(CompatibilityLevel.RELAXED, publicSuffixMatcher);
    }

    public RFC6265CookieSpecProvider(CompatibilityLevel compatibilityLevel, PublicSuffixMatcher publicSuffixMatcher) {
        this.compatibilityLevel = compatibilityLevel == null ? CompatibilityLevel.RELAXED : compatibilityLevel;
        this.publicSuffixMatcher = publicSuffixMatcher;
    }

    @Override // org.apache.http.cookie.CookieSpecProvider
    public CookieSpec create(HttpContext httpContext) {
        if (this.cookieSpec == null) {
            synchronized (this) {
                if (this.cookieSpec == null) {
                    int i10 = C70612.f36165x14f07ea0[this.compatibilityLevel.ordinal()];
                    this.cookieSpec = i10 != 1 ? i10 != 2 ? new RFC6265LaxSpec(new BasicPathHandler(), PublicSuffixDomainFilter.decorate(new BasicDomainHandler(), this.publicSuffixMatcher), new LaxMaxAgeHandler(), new BasicSecureHandler(), new LaxExpiresHandler()) : new RFC6265LaxSpec(new BasicPathHandler(this) { // from class: org.apache.http.impl.cookie.RFC6265CookieSpecProvider.1
                        public final RFC6265CookieSpecProvider this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override // org.apache.http.impl.cookie.BasicPathHandler, org.apache.http.cookie.CookieAttributeHandler
                        public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
                        }
                    }, PublicSuffixDomainFilter.decorate(new BasicDomainHandler(), this.publicSuffixMatcher), new BasicMaxAgeHandler(), new BasicSecureHandler(), new BasicExpiresHandler(RFC6265StrictSpec.DATE_PATTERNS)) : new RFC6265StrictSpec(new BasicPathHandler(), PublicSuffixDomainFilter.decorate(new BasicDomainHandler(), this.publicSuffixMatcher), new BasicMaxAgeHandler(), new BasicSecureHandler(), new BasicExpiresHandler(RFC6265StrictSpec.DATE_PATTERNS));
                }
            }
        }
        return this.cookieSpec;
    }
}

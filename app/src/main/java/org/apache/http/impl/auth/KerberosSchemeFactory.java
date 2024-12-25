package org.apache.http.impl.auth;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthSchemeFactory;
import org.apache.http.auth.AuthSchemeProvider;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/auth/KerberosSchemeFactory.class */
public class KerberosSchemeFactory implements AuthSchemeFactory, AuthSchemeProvider {
    private final boolean stripPort;
    private final boolean useCanonicalHostname;

    public KerberosSchemeFactory() {
        this(true, true);
    }

    public KerberosSchemeFactory(boolean z10) {
        this.stripPort = z10;
        this.useCanonicalHostname = true;
    }

    public KerberosSchemeFactory(boolean z10, boolean z11) {
        this.stripPort = z10;
        this.useCanonicalHostname = z11;
    }

    @Override // org.apache.http.auth.AuthSchemeProvider
    public AuthScheme create(HttpContext httpContext) {
        return new KerberosScheme(this.stripPort, this.useCanonicalHostname);
    }

    public boolean isStripPort() {
        return this.stripPort;
    }

    public boolean isUseCanonicalHostname() {
        return this.useCanonicalHostname;
    }

    @Override // org.apache.http.auth.AuthSchemeFactory
    public AuthScheme newInstance(HttpParams httpParams) {
        return new KerberosScheme(this.stripPort, this.useCanonicalHostname);
    }
}

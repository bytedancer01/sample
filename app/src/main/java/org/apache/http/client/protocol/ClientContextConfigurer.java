package org.apache.http.client.protocol;

import org.apache.http.auth.AuthSchemeRegistry;
import org.apache.http.client.CookieStore;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.cookie.CookieSpecRegistry;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/protocol/ClientContextConfigurer.class
 */
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/protocol/ClientContextConfigurer.class */
public class ClientContextConfigurer implements ClientContext {
    private final HttpContext context;

    public ClientContextConfigurer(HttpContext httpContext) {
        Args.notNull(httpContext, "HTTP context");
        this.context = httpContext;
    }

    public void setAuthSchemeRegistry(AuthSchemeRegistry authSchemeRegistry) {
        this.context.setAttribute("http.authscheme-registry", authSchemeRegistry);
    }

    public void setCookieSpecRegistry(CookieSpecRegistry cookieSpecRegistry) {
        this.context.setAttribute("http.cookiespec-registry", cookieSpecRegistry);
    }

    public void setCookieStore(CookieStore cookieStore) {
        this.context.setAttribute("http.cookie-store", cookieStore);
    }

    public void setCredentialsProvider(CredentialsProvider credentialsProvider) {
        this.context.setAttribute("http.auth.credentials-provider", credentialsProvider);
    }
}
package org.apache.http.auth;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.HttpRequest;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.config.Lookup;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/auth/AuthSchemeRegistry.class
 */
@Contract(threading = ThreadingBehavior.SAFE)
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/auth/AuthSchemeRegistry.class */
public final class AuthSchemeRegistry implements Lookup<AuthSchemeProvider> {
    private final ConcurrentHashMap<String, AuthSchemeFactory> registeredSchemes = new ConcurrentHashMap<>();

    public AuthScheme getAuthScheme(String str, HttpParams httpParams) {
        Args.notNull(str, "Name");
        AuthSchemeFactory authSchemeFactory = this.registeredSchemes.get(str.toLowerCase(Locale.ENGLISH));
        if (authSchemeFactory != null) {
            return authSchemeFactory.newInstance(httpParams);
        }
        throw new IllegalStateException("Unsupported authentication scheme: " + str);
    }

    public List<String> getSchemeNames() {
        return new ArrayList(this.registeredSchemes.keySet());
    }

    @Override // org.apache.http.config.Lookup
    public AuthSchemeProvider lookup(String str) {
        return new AuthSchemeProvider(this, str) { // from class: org.apache.http.auth.AuthSchemeRegistry.1
            public final AuthSchemeRegistry this$0;
            public final String val$name;

            {
                this.this$0 = this;
                this.val$name = str;
            }

            @Override // org.apache.http.auth.AuthSchemeProvider
            public AuthScheme create(HttpContext httpContext) {
                return this.this$0.getAuthScheme(this.val$name, ((HttpRequest) httpContext.getAttribute("http.request")).getParams());
            }
        };
    }

    public void register(String str, AuthSchemeFactory authSchemeFactory) {
        Args.notNull(str, "Name");
        Args.notNull(authSchemeFactory, "Authentication scheme factory");
        this.registeredSchemes.put(str.toLowerCase(Locale.ENGLISH), authSchemeFactory);
    }

    public void setItems(Map<String, AuthSchemeFactory> map) {
        if (map == null) {
            return;
        }
        this.registeredSchemes.clear();
        this.registeredSchemes.putAll(map);
    }

    public void unregister(String str) {
        Args.notNull(str, "Name");
        this.registeredSchemes.remove(str.toLowerCase(Locale.ENGLISH));
    }
}

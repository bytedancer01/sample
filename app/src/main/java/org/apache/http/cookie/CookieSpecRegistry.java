package org.apache.http.cookie;

import com.amazonaws.auth.policy.internal.JsonDocumentFields;
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
  classes1.jar:org/apache/http/cookie/CookieSpecRegistry.class
 */
@Contract(threading = ThreadingBehavior.SAFE)
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/cookie/CookieSpecRegistry.class */
public final class CookieSpecRegistry implements Lookup<CookieSpecProvider> {
    private final ConcurrentHashMap<String, CookieSpecFactory> registeredSpecs = new ConcurrentHashMap<>();

    public CookieSpec getCookieSpec(String str) {
        return getCookieSpec(str, null);
    }

    public CookieSpec getCookieSpec(String str, HttpParams httpParams) {
        Args.notNull(str, "Name");
        CookieSpecFactory cookieSpecFactory = this.registeredSpecs.get(str.toLowerCase(Locale.ENGLISH));
        if (cookieSpecFactory != null) {
            return cookieSpecFactory.newInstance(httpParams);
        }
        throw new IllegalStateException("Unsupported cookie spec: " + str);
    }

    public List<String> getSpecNames() {
        return new ArrayList(this.registeredSpecs.keySet());
    }

    @Override // org.apache.http.config.Lookup
    public CookieSpecProvider lookup(String str) {
        return new CookieSpecProvider(this, str) { // from class: org.apache.http.cookie.CookieSpecRegistry.1
            public final CookieSpecRegistry this$0;
            public final String val$name;

            {
                this.this$0 = this;
                this.val$name = str;
            }

            @Override // org.apache.http.cookie.CookieSpecProvider
            public CookieSpec create(HttpContext httpContext) {
                return this.this$0.getCookieSpec(this.val$name, ((HttpRequest) httpContext.getAttribute("http.request")).getParams());
            }
        };
    }

    public void register(String str, CookieSpecFactory cookieSpecFactory) {
        Args.notNull(str, "Name");
        Args.notNull(cookieSpecFactory, "Cookie spec factory");
        this.registeredSpecs.put(str.toLowerCase(Locale.ENGLISH), cookieSpecFactory);
    }

    public void setItems(Map<String, CookieSpecFactory> map) {
        if (map == null) {
            return;
        }
        this.registeredSpecs.clear();
        this.registeredSpecs.putAll(map);
    }

    public void unregister(String str) {
        Args.notNull(str, JsonDocumentFields.POLICY_ID);
        this.registeredSpecs.remove(str.toLowerCase(Locale.ENGLISH));
    }
}

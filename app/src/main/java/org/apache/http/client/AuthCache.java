package org.apache.http.client;

import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScheme;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/AuthCache.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/AuthCache.class */
public interface AuthCache {
    void clear();

    AuthScheme get(HttpHost httpHost);

    void put(HttpHost httpHost, AuthScheme authScheme);

    void remove(HttpHost httpHost);
}

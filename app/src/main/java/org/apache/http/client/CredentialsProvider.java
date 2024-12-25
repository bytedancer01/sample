package org.apache.http.client;

import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/CredentialsProvider.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/CredentialsProvider.class */
public interface CredentialsProvider {
    void clear();

    Credentials getCredentials(AuthScope authScope);

    void setCredentials(AuthScope authScope, Credentials credentials);
}

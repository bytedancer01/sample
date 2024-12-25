package org.apache.http.auth;

import java.security.Principal;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/auth/Credentials.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/auth/Credentials.class */
public interface Credentials {
    String getPassword();

    Principal getUserPrincipal();
}

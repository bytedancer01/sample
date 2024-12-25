package org.apache.http.conn;

import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.params.HttpParams;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/ClientConnectionManagerFactory.class
 */
@Deprecated
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/ClientConnectionManagerFactory.class */
public interface ClientConnectionManagerFactory {
    ClientConnectionManager newInstance(HttpParams httpParams, SchemeRegistry schemeRegistry);
}

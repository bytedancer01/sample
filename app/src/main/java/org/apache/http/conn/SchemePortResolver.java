package org.apache.http.conn;

import org.apache.http.HttpHost;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/SchemePortResolver.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/SchemePortResolver.class */
public interface SchemePortResolver {
    int resolve(HttpHost httpHost);
}

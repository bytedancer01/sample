package org.apache.http.conn;

import java.net.InetAddress;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/DnsResolver.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/DnsResolver.class */
public interface DnsResolver {
    InetAddress[] resolve(String str);
}

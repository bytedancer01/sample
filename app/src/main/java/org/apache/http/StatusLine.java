package org.apache.http;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/StatusLine.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/StatusLine.class */
public interface StatusLine {
    ProtocolVersion getProtocolVersion();

    String getReasonPhrase();

    int getStatusCode();
}

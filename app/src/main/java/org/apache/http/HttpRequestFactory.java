package org.apache.http;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/HttpRequestFactory.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/HttpRequestFactory.class */
public interface HttpRequestFactory {
    HttpRequest newHttpRequest(String str, String str2);

    HttpRequest newHttpRequest(RequestLine requestLine);
}

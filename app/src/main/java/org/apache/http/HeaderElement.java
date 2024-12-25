package org.apache.http;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/HeaderElement.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/HeaderElement.class */
public interface HeaderElement {
    String getName();

    NameValuePair getParameter(int i10);

    NameValuePair getParameterByName(String str);

    int getParameterCount();

    NameValuePair[] getParameters();

    String getValue();
}

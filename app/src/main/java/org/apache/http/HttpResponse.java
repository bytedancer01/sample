package org.apache.http;

import java.util.Locale;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/HttpResponse.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/HttpResponse.class */
public interface HttpResponse extends HttpMessage {
    HttpEntity getEntity();

    Locale getLocale();

    StatusLine getStatusLine();

    void setEntity(HttpEntity httpEntity);

    void setLocale(Locale locale);

    void setReasonPhrase(String str);

    void setStatusCode(int i10);

    void setStatusLine(ProtocolVersion protocolVersion, int i10);

    void setStatusLine(ProtocolVersion protocolVersion, int i10, String str);

    void setStatusLine(StatusLine statusLine);
}

package org.apache.http;

import org.apache.http.util.CharArrayBuffer;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/FormattedHeader.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/FormattedHeader.class */
public interface FormattedHeader extends Header {
    CharArrayBuffer getBuffer();

    int getValuePos();
}

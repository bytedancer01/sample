package org.apache.http.p257io;

import org.apache.http.HttpMessage;

/* loaded from: combined.jar:classes3.jar:org/apache/http/io/HttpMessageParser.class */
public interface HttpMessageParser<T extends HttpMessage> {
    T parse();
}

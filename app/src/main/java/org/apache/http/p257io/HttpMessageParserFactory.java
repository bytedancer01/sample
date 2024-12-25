package org.apache.http.p257io;

import org.apache.http.HttpMessage;
import org.apache.http.config.MessageConstraints;

/* loaded from: combined.jar:classes3.jar:org/apache/http/io/HttpMessageParserFactory.class */
public interface HttpMessageParserFactory<T extends HttpMessage> {
    HttpMessageParser<T> create(SessionInputBuffer sessionInputBuffer, MessageConstraints messageConstraints);
}

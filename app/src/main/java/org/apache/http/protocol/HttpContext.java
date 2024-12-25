package org.apache.http.protocol;

/* loaded from: combined.jar:classes3.jar:org/apache/http/protocol/HttpContext.class */
public interface HttpContext {
    public static final String RESERVED_PREFIX = "http.";

    Object getAttribute(String str);

    Object removeAttribute(String str);

    void setAttribute(String str, Object obj);
}

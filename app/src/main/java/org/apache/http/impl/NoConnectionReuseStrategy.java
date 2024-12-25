package org.apache.http.impl;

import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.protocol.HttpContext;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/NoConnectionReuseStrategy.class */
public class NoConnectionReuseStrategy implements ConnectionReuseStrategy {
    public static final NoConnectionReuseStrategy INSTANCE = new NoConnectionReuseStrategy();

    @Override // org.apache.http.ConnectionReuseStrategy
    public boolean keepAlive(HttpResponse httpResponse, HttpContext httpContext) {
        return false;
    }
}

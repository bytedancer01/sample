package org.apache.http.impl.execchain;

import org.apache.http.HttpException;
import org.apache.http.HttpResponse;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/execchain/TunnelRefusedException.class */
public class TunnelRefusedException extends HttpException {
    private static final long serialVersionUID = -8646722842745617323L;
    private final HttpResponse response;

    public TunnelRefusedException(String str, HttpResponse httpResponse) {
        super(str);
        this.response = httpResponse;
    }

    public HttpResponse getResponse() {
        return this.response;
    }
}

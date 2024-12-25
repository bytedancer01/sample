package org.apache.http.impl.p256io;

import org.apache.http.HttpResponse;
import org.apache.http.message.LineFormatter;
import org.apache.http.p257io.SessionOutputBuffer;
import org.apache.http.params.HttpParams;

@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/io/HttpResponseWriter.class */
public class HttpResponseWriter extends AbstractMessageWriter<HttpResponse> {
    public HttpResponseWriter(SessionOutputBuffer sessionOutputBuffer, LineFormatter lineFormatter, HttpParams httpParams) {
        super(sessionOutputBuffer, lineFormatter, httpParams);
    }

    @Override // org.apache.http.impl.p256io.AbstractMessageWriter
    public void writeHeadLine(HttpResponse httpResponse) {
        this.lineFormatter.formatStatusLine(this.lineBuf, httpResponse.getStatusLine());
        this.sessionBuffer.writeLine(this.lineBuf);
    }
}

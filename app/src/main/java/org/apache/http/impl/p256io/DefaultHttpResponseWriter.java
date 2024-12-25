package org.apache.http.impl.p256io;

import org.apache.http.HttpResponse;
import org.apache.http.message.LineFormatter;
import org.apache.http.p257io.SessionOutputBuffer;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/io/DefaultHttpResponseWriter.class */
public class DefaultHttpResponseWriter extends AbstractMessageWriter<HttpResponse> {
    public DefaultHttpResponseWriter(SessionOutputBuffer sessionOutputBuffer) {
        super(sessionOutputBuffer, null);
    }

    public DefaultHttpResponseWriter(SessionOutputBuffer sessionOutputBuffer, LineFormatter lineFormatter) {
        super(sessionOutputBuffer, lineFormatter);
    }

    @Override // org.apache.http.impl.p256io.AbstractMessageWriter
    public void writeHeadLine(HttpResponse httpResponse) {
        this.lineFormatter.formatStatusLine(this.lineBuf, httpResponse.getStatusLine());
        this.sessionBuffer.writeLine(this.lineBuf);
    }
}

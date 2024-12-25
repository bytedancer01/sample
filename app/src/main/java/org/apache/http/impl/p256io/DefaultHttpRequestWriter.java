package org.apache.http.impl.p256io;

import org.apache.http.HttpRequest;
import org.apache.http.message.LineFormatter;
import org.apache.http.p257io.SessionOutputBuffer;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/io/DefaultHttpRequestWriter.class */
public class DefaultHttpRequestWriter extends AbstractMessageWriter<HttpRequest> {
    public DefaultHttpRequestWriter(SessionOutputBuffer sessionOutputBuffer) {
        this(sessionOutputBuffer, null);
    }

    public DefaultHttpRequestWriter(SessionOutputBuffer sessionOutputBuffer, LineFormatter lineFormatter) {
        super(sessionOutputBuffer, lineFormatter);
    }

    @Override // org.apache.http.impl.p256io.AbstractMessageWriter
    public void writeHeadLine(HttpRequest httpRequest) {
        this.lineFormatter.formatRequestLine(this.lineBuf, httpRequest.getRequestLine());
        this.sessionBuffer.writeLine(this.lineBuf);
    }
}

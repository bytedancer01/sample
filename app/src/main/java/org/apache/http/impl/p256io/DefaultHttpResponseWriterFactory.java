package org.apache.http.impl.p256io;

import org.apache.http.HttpResponse;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.message.BasicLineFormatter;
import org.apache.http.message.LineFormatter;
import org.apache.http.p257io.HttpMessageWriter;
import org.apache.http.p257io.HttpMessageWriterFactory;
import org.apache.http.p257io.SessionOutputBuffer;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/io/DefaultHttpResponseWriterFactory.class */
public class DefaultHttpResponseWriterFactory implements HttpMessageWriterFactory<HttpResponse> {
    public static final DefaultHttpResponseWriterFactory INSTANCE = new DefaultHttpResponseWriterFactory();
    private final LineFormatter lineFormatter;

    public DefaultHttpResponseWriterFactory() {
        this(null);
    }

    public DefaultHttpResponseWriterFactory(LineFormatter lineFormatter) {
        this.lineFormatter = lineFormatter == null ? BasicLineFormatter.INSTANCE : lineFormatter;
    }

    @Override // org.apache.http.p257io.HttpMessageWriterFactory
    public HttpMessageWriter<HttpResponse> create(SessionOutputBuffer sessionOutputBuffer) {
        return new DefaultHttpResponseWriter(sessionOutputBuffer, this.lineFormatter);
    }
}

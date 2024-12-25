package org.apache.http.impl.p256io;

import org.apache.http.HttpRequest;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.message.BasicLineFormatter;
import org.apache.http.message.LineFormatter;
import org.apache.http.p257io.HttpMessageWriter;
import org.apache.http.p257io.HttpMessageWriterFactory;
import org.apache.http.p257io.SessionOutputBuffer;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/io/DefaultHttpRequestWriterFactory.class */
public class DefaultHttpRequestWriterFactory implements HttpMessageWriterFactory<HttpRequest> {
    public static final DefaultHttpRequestWriterFactory INSTANCE = new DefaultHttpRequestWriterFactory();
    private final LineFormatter lineFormatter;

    public DefaultHttpRequestWriterFactory() {
        this(null);
    }

    public DefaultHttpRequestWriterFactory(LineFormatter lineFormatter) {
        this.lineFormatter = lineFormatter == null ? BasicLineFormatter.INSTANCE : lineFormatter;
    }

    @Override // org.apache.http.p257io.HttpMessageWriterFactory
    public HttpMessageWriter<HttpRequest> create(SessionOutputBuffer sessionOutputBuffer) {
        return new DefaultHttpRequestWriter(sessionOutputBuffer, this.lineFormatter);
    }
}

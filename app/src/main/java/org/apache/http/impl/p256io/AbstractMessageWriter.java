package org.apache.http.impl.p256io;

import org.apache.http.HeaderIterator;
import org.apache.http.HttpMessage;
import org.apache.http.message.BasicLineFormatter;
import org.apache.http.message.LineFormatter;
import org.apache.http.p257io.HttpMessageWriter;
import org.apache.http.p257io.SessionOutputBuffer;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/io/AbstractMessageWriter.class */
public abstract class AbstractMessageWriter<T extends HttpMessage> implements HttpMessageWriter<T> {
    public final CharArrayBuffer lineBuf;
    public final LineFormatter lineFormatter;
    public final SessionOutputBuffer sessionBuffer;

    public AbstractMessageWriter(SessionOutputBuffer sessionOutputBuffer, LineFormatter lineFormatter) {
        this.sessionBuffer = (SessionOutputBuffer) Args.notNull(sessionOutputBuffer, "Session input buffer");
        this.lineFormatter = lineFormatter == null ? BasicLineFormatter.INSTANCE : lineFormatter;
        this.lineBuf = new CharArrayBuffer(128);
    }

    @Deprecated
    public AbstractMessageWriter(SessionOutputBuffer sessionOutputBuffer, LineFormatter lineFormatter, HttpParams httpParams) {
        Args.notNull(sessionOutputBuffer, "Session input buffer");
        this.sessionBuffer = sessionOutputBuffer;
        this.lineBuf = new CharArrayBuffer(128);
        this.lineFormatter = lineFormatter == null ? BasicLineFormatter.INSTANCE : lineFormatter;
    }

    @Override // org.apache.http.p257io.HttpMessageWriter
    public void write(T t10) {
        Args.notNull(t10, "HTTP message");
        writeHeadLine(t10);
        HeaderIterator headerIterator = t10.headerIterator();
        while (headerIterator.hasNext()) {
            this.sessionBuffer.writeLine(this.lineFormatter.formatHeader(this.lineBuf, headerIterator.nextHeader()));
        }
        this.lineBuf.clear();
        this.sessionBuffer.writeLine(this.lineBuf);
    }

    public abstract void writeHeadLine(T t10);
}

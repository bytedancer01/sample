package org.apache.http.impl.p256io;

import java.util.ArrayList;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.ParseException;
import org.apache.http.ProtocolException;
import org.apache.http.config.MessageConstraints;
import org.apache.http.message.BasicLineParser;
import org.apache.http.message.LineParser;
import org.apache.http.p257io.HttpMessageParser;
import org.apache.http.p257io.SessionInputBuffer;
import org.apache.http.params.HttpParamConfig;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/io/AbstractMessageParser.class */
public abstract class AbstractMessageParser<T extends HttpMessage> implements HttpMessageParser<T> {
    private static final int HEADERS = 1;
    private static final int HEAD_LINE = 0;
    private final List<CharArrayBuffer> headerLines;
    public final LineParser lineParser;
    private T message;
    private final MessageConstraints messageConstraints;
    private final SessionInputBuffer sessionBuffer;
    private int state;

    public AbstractMessageParser(SessionInputBuffer sessionInputBuffer, LineParser lineParser, MessageConstraints messageConstraints) {
        this.sessionBuffer = (SessionInputBuffer) Args.notNull(sessionInputBuffer, "Session input buffer");
        this.lineParser = lineParser == null ? BasicLineParser.INSTANCE : lineParser;
        this.messageConstraints = messageConstraints == null ? MessageConstraints.DEFAULT : messageConstraints;
        this.headerLines = new ArrayList();
        this.state = 0;
    }

    @Deprecated
    public AbstractMessageParser(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpParams httpParams) {
        Args.notNull(sessionInputBuffer, "Session input buffer");
        Args.notNull(httpParams, "HTTP parameters");
        this.sessionBuffer = sessionInputBuffer;
        this.messageConstraints = HttpParamConfig.getMessageConstraints(httpParams);
        this.lineParser = lineParser == null ? BasicLineParser.INSTANCE : lineParser;
        this.headerLines = new ArrayList();
        this.state = 0;
    }

    public static Header[] parseHeaders(SessionInputBuffer sessionInputBuffer, int i10, int i11, LineParser lineParser) {
        ArrayList arrayList = new ArrayList();
        if (lineParser == null) {
            lineParser = BasicLineParser.INSTANCE;
        }
        return parseHeaders(sessionInputBuffer, i10, i11, lineParser, arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0124, code lost:
    
        r0 = new org.apache.http.Header[r10.size()];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x013a, code lost:
    
        if (r7 >= r10.size()) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014a, code lost:
    
        r0[r7] = r9.parseHeader(r10.get(r7));
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x015b, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0167, code lost:
    
        throw new org.apache.http.ProtocolException(r6.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0169, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.apache.http.Header[] parseHeaders(org.apache.http.p257io.SessionInputBuffer r6, int r7, int r8, org.apache.http.message.LineParser r9, java.util.List<org.apache.http.util.CharArrayBuffer> r10) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.p256io.AbstractMessageParser.parseHeaders(org.apache.http.io.SessionInputBuffer, int, int, org.apache.http.message.LineParser, java.util.List):org.apache.http.Header[]");
    }

    @Override // org.apache.http.p257io.HttpMessageParser
    public T parse() {
        int i10 = this.state;
        if (i10 == 0) {
            try {
                this.message = parseHead(this.sessionBuffer);
                this.state = 1;
            } catch (ParseException e10) {
                throw new ProtocolException(e10.getMessage(), e10);
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("Inconsistent parser state");
        }
        this.message.setHeaders(parseHeaders(this.sessionBuffer, this.messageConstraints.getMaxHeaderCount(), this.messageConstraints.getMaxLineLength(), this.lineParser, this.headerLines));
        T t10 = this.message;
        this.message = null;
        this.headerLines.clear();
        this.state = 0;
        return t10;
    }

    public abstract T parseHead(SessionInputBuffer sessionInputBuffer);
}

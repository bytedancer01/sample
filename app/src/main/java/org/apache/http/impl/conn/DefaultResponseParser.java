package org.apache.http.impl.conn;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponseFactory;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.params.ConnConnectionPNames;
import org.apache.http.impl.p256io.AbstractMessageParser;
import org.apache.http.message.LineParser;
import org.apache.http.p257io.SessionInputBuffer;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/conn/DefaultResponseParser.class */
public class DefaultResponseParser extends AbstractMessageParser<HttpMessage> {
    private final CharArrayBuffer lineBuf;
    private final Log log;
    private final int maxGarbageLines;
    private final HttpResponseFactory responseFactory;

    public DefaultResponseParser(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpResponseFactory httpResponseFactory, HttpParams httpParams) {
        super(sessionInputBuffer, lineParser, httpParams);
        this.log = LogFactory.getLog(getClass());
        Args.notNull(httpResponseFactory, "Response factory");
        this.responseFactory = httpResponseFactory;
        this.lineBuf = new CharArrayBuffer(128);
        this.maxGarbageLines = getMaxGarbageLines(httpParams);
    }

    public int getMaxGarbageLines(HttpParams httpParams) {
        return httpParams.getIntParameter(ConnConnectionPNames.MAX_STATUS_LINE_GARBAGE, Integer.MAX_VALUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c1, code lost:
    
        throw new org.apache.http.ProtocolException("The server failed to respond with a valid HTTP response");
     */
    @Override // org.apache.http.impl.p256io.AbstractMessageParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.apache.http.HttpMessage parseHead(org.apache.http.p257io.SessionInputBuffer r6) {
        /*
            r5 = this;
            r0 = 0
            r7 = r0
        L2:
            r0 = r5
            org.apache.http.util.CharArrayBuffer r0 = r0.lineBuf
            r0.clear()
            r0 = r6
            r1 = r5
            org.apache.http.util.CharArrayBuffer r1 = r1.lineBuf
            int r0 = r0.readLine(r1)
            r8 = r0
            r0 = r8
            r1 = -1
            if (r0 != r1) goto L2a
            r0 = r7
            if (r0 == 0) goto L20
            goto L2a
        L20:
            org.apache.http.NoHttpResponseException r0 = new org.apache.http.NoHttpResponseException
            r1 = r0
            java.lang.String r2 = "The target server failed to respond"
            r1.<init>(r2)
            throw r0
        L2a:
            org.apache.http.message.ParserCursor r0 = new org.apache.http.message.ParserCursor
            r1 = r0
            r2 = 0
            r3 = r5
            org.apache.http.util.CharArrayBuffer r3 = r3.lineBuf
            int r3 = r3.length()
            r1.<init>(r2, r3)
            r9 = r0
            r0 = r5
            org.apache.http.message.LineParser r0 = r0.lineParser
            r1 = r5
            org.apache.http.util.CharArrayBuffer r1 = r1.lineBuf
            r2 = r9
            boolean r0 = r0.hasProtocolVersion(r1, r2)
            if (r0 == 0) goto L69
            r0 = r5
            org.apache.http.message.LineParser r0 = r0.lineParser
            r1 = r5
            org.apache.http.util.CharArrayBuffer r1 = r1.lineBuf
            r2 = r9
            org.apache.http.StatusLine r0 = r0.parseStatusLine(r1, r2)
            r6 = r0
            r0 = r5
            org.apache.http.HttpResponseFactory r0 = r0.responseFactory
            r1 = r6
            r2 = 0
            org.apache.http.HttpResponse r0 = r0.newHttpResponse(r1, r2)
            return r0
        L69:
            r0 = r8
            r1 = -1
            if (r0 == r1) goto Lb8
            r0 = r7
            r1 = r5
            int r1 = r1.maxGarbageLines
            if (r0 >= r1) goto Lb8
            r0 = r5
            org.apache.commons.logging.Log r0 = r0.log
            boolean r0 = r0.isDebugEnabled()
            if (r0 == 0) goto Lb2
            r0 = r5
            org.apache.commons.logging.Log r0 = r0.log
            r9 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r10
            java.lang.String r1 = "Garbage in response: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            r1 = r5
            org.apache.http.util.CharArrayBuffer r1 = r1.lineBuf
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r9
            r1 = r10
            java.lang.String r1 = r1.toString()
            r0.debug(r1)
        Lb2:
            int r7 = r7 + 1
            goto L2
        Lb8:
            org.apache.http.ProtocolException r0 = new org.apache.http.ProtocolException
            r1 = r0
            java.lang.String r2 = "The server failed to respond with a valid HTTP response"
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.DefaultResponseParser.parseHead(org.apache.http.io.SessionInputBuffer):org.apache.http.HttpMessage");
    }
}

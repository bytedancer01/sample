package org.apache.http.impl.entity;

import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpMessage;
import org.apache.http.ParseException;
import org.apache.http.ProtocolException;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/entity/LaxContentLengthStrategy.class */
public class LaxContentLengthStrategy implements ContentLengthStrategy {
    public static final LaxContentLengthStrategy INSTANCE = new LaxContentLengthStrategy();
    private final int implicitLen;

    public LaxContentLengthStrategy() {
        this(-1);
    }

    public LaxContentLengthStrategy(int i10) {
        this.implicitLen = i10;
    }

    @Override // org.apache.http.entity.ContentLengthStrategy
    public long determineLength(HttpMessage httpMessage) {
        long j10;
        Args.notNull(httpMessage, "HTTP message");
        Header firstHeader = httpMessage.getFirstHeader("Transfer-Encoding");
        if (firstHeader != null) {
            try {
                HeaderElement[] elements = firstHeader.getElements();
                int length = elements.length;
                return (!HTTP.IDENTITY_CODING.equalsIgnoreCase(firstHeader.getValue()) && length > 0 && HTTP.CHUNK_CODING.equalsIgnoreCase(elements[length - 1].getName())) ? -2L : -1L;
            } catch (ParseException e10) {
                throw new ProtocolException("Invalid Transfer-Encoding header value: " + firstHeader, e10);
            }
        }
        if (httpMessage.getFirstHeader("Content-Length") == null) {
            return this.implicitLen;
        }
        Header[] headers = httpMessage.getHeaders("Content-Length");
        int length2 = headers.length - 1;
        while (true) {
            if (length2 < 0) {
                j10 = -1;
                break;
            }
            try {
                j10 = Long.parseLong(headers[length2].getValue());
                break;
            } catch (NumberFormatException e11) {
                length2--;
            }
        }
        if (j10 >= 0) {
            return j10;
        }
        return -1L;
    }
}

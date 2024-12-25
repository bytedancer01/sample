package org.apache.http.message;

import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/message/BasicLineFormatter.class */
public class BasicLineFormatter implements LineFormatter {

    @Deprecated
    public static final BasicLineFormatter DEFAULT = new BasicLineFormatter();
    public static final BasicLineFormatter INSTANCE = new BasicLineFormatter();

    public static String formatHeader(Header header, LineFormatter lineFormatter) {
        if (lineFormatter == null) {
            lineFormatter = INSTANCE;
        }
        return lineFormatter.formatHeader(null, header).toString();
    }

    public static String formatProtocolVersion(ProtocolVersion protocolVersion, LineFormatter lineFormatter) {
        if (lineFormatter == null) {
            lineFormatter = INSTANCE;
        }
        return lineFormatter.appendProtocolVersion(null, protocolVersion).toString();
    }

    public static String formatRequestLine(RequestLine requestLine, LineFormatter lineFormatter) {
        if (lineFormatter == null) {
            lineFormatter = INSTANCE;
        }
        return lineFormatter.formatRequestLine(null, requestLine).toString();
    }

    public static String formatStatusLine(StatusLine statusLine, LineFormatter lineFormatter) {
        if (lineFormatter == null) {
            lineFormatter = INSTANCE;
        }
        return lineFormatter.formatStatusLine(null, statusLine).toString();
    }

    @Override // org.apache.http.message.LineFormatter
    public CharArrayBuffer appendProtocolVersion(CharArrayBuffer charArrayBuffer, ProtocolVersion protocolVersion) {
        Args.notNull(protocolVersion, "Protocol version");
        int estimateProtocolVersionLen = estimateProtocolVersionLen(protocolVersion);
        if (charArrayBuffer == null) {
            charArrayBuffer = new CharArrayBuffer(estimateProtocolVersionLen);
        } else {
            charArrayBuffer.ensureCapacity(estimateProtocolVersionLen);
        }
        charArrayBuffer.append(protocolVersion.getProtocol());
        charArrayBuffer.append('/');
        charArrayBuffer.append(Integer.toString(protocolVersion.getMajor()));
        charArrayBuffer.append('.');
        charArrayBuffer.append(Integer.toString(protocolVersion.getMinor()));
        return charArrayBuffer;
    }

    public void doFormatHeader(CharArrayBuffer charArrayBuffer, Header header) {
        char c10;
        String name = header.getName();
        String value = header.getValue();
        int length = name.length() + 2;
        int i10 = length;
        if (value != null) {
            i10 = length + value.length();
        }
        charArrayBuffer.ensureCapacity(i10);
        charArrayBuffer.append(name);
        charArrayBuffer.append(": ");
        if (value != null) {
            charArrayBuffer.ensureCapacity(charArrayBuffer.length() + value.length());
            for (int i11 = 0; i11 < value.length(); i11++) {
                char charAt = value.charAt(i11);
                if (charAt != '\r' && charAt != '\n' && charAt != '\f') {
                    c10 = charAt;
                    if (charAt != 11) {
                        charArrayBuffer.append(c10);
                    }
                }
                c10 = ' ';
                charArrayBuffer.append(c10);
            }
        }
    }

    public void doFormatRequestLine(CharArrayBuffer charArrayBuffer, RequestLine requestLine) {
        String method = requestLine.getMethod();
        String uri = requestLine.getUri();
        charArrayBuffer.ensureCapacity(method.length() + 1 + uri.length() + 1 + estimateProtocolVersionLen(requestLine.getProtocolVersion()));
        charArrayBuffer.append(method);
        charArrayBuffer.append(' ');
        charArrayBuffer.append(uri);
        charArrayBuffer.append(' ');
        appendProtocolVersion(charArrayBuffer, requestLine.getProtocolVersion());
    }

    public void doFormatStatusLine(CharArrayBuffer charArrayBuffer, StatusLine statusLine) {
        int estimateProtocolVersionLen = estimateProtocolVersionLen(statusLine.getProtocolVersion()) + 1 + 3 + 1;
        String reasonPhrase = statusLine.getReasonPhrase();
        int i10 = estimateProtocolVersionLen;
        if (reasonPhrase != null) {
            i10 = estimateProtocolVersionLen + reasonPhrase.length();
        }
        charArrayBuffer.ensureCapacity(i10);
        appendProtocolVersion(charArrayBuffer, statusLine.getProtocolVersion());
        charArrayBuffer.append(' ');
        charArrayBuffer.append(Integer.toString(statusLine.getStatusCode()));
        charArrayBuffer.append(' ');
        if (reasonPhrase != null) {
            charArrayBuffer.append(reasonPhrase);
        }
    }

    public int estimateProtocolVersionLen(ProtocolVersion protocolVersion) {
        return protocolVersion.getProtocol().length() + 4;
    }

    @Override // org.apache.http.message.LineFormatter
    public CharArrayBuffer formatHeader(CharArrayBuffer charArrayBuffer, Header header) {
        CharArrayBuffer initBuffer;
        Args.notNull(header, "Header");
        if (header instanceof FormattedHeader) {
            initBuffer = ((FormattedHeader) header).getBuffer();
        } else {
            initBuffer = initBuffer(charArrayBuffer);
            doFormatHeader(initBuffer, header);
        }
        return initBuffer;
    }

    @Override // org.apache.http.message.LineFormatter
    public CharArrayBuffer formatRequestLine(CharArrayBuffer charArrayBuffer, RequestLine requestLine) {
        Args.notNull(requestLine, "Request line");
        CharArrayBuffer initBuffer = initBuffer(charArrayBuffer);
        doFormatRequestLine(initBuffer, requestLine);
        return initBuffer;
    }

    @Override // org.apache.http.message.LineFormatter
    public CharArrayBuffer formatStatusLine(CharArrayBuffer charArrayBuffer, StatusLine statusLine) {
        Args.notNull(statusLine, "Status line");
        CharArrayBuffer initBuffer = initBuffer(charArrayBuffer);
        doFormatStatusLine(initBuffer, statusLine);
        return initBuffer;
    }

    public CharArrayBuffer initBuffer(CharArrayBuffer charArrayBuffer) {
        if (charArrayBuffer != null) {
            charArrayBuffer.clear();
        } else {
            charArrayBuffer = new CharArrayBuffer(64);
        }
        return charArrayBuffer;
    }
}

package org.apache.http.message;

import org.apache.http.Header;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.util.CharArrayBuffer;

/* loaded from: combined.jar:classes3.jar:org/apache/http/message/LineParser.class */
public interface LineParser {
    boolean hasProtocolVersion(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor);

    Header parseHeader(CharArrayBuffer charArrayBuffer);

    ProtocolVersion parseProtocolVersion(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor);

    RequestLine parseRequestLine(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor);

    StatusLine parseStatusLine(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor);
}

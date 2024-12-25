package org.apache.http.message;

import org.apache.http.Header;
import org.apache.http.HttpVersion;
import org.apache.http.ParseException;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/message/BasicLineParser.class */
public class BasicLineParser implements LineParser {

    @Deprecated
    public static final BasicLineParser DEFAULT = new BasicLineParser();
    public static final BasicLineParser INSTANCE = new BasicLineParser();
    public final ProtocolVersion protocol;

    public BasicLineParser() {
        this(null);
    }

    public BasicLineParser(ProtocolVersion protocolVersion) {
        this.protocol = protocolVersion == null ? HttpVersion.HTTP_1_1 : protocolVersion;
    }

    public static Header parseHeader(String str, LineParser lineParser) {
        Args.notNull(str, "Value");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        if (lineParser == null) {
            lineParser = INSTANCE;
        }
        return lineParser.parseHeader(charArrayBuffer);
    }

    public static ProtocolVersion parseProtocolVersion(String str, LineParser lineParser) {
        Args.notNull(str, "Value");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        ParserCursor parserCursor = new ParserCursor(0, str.length());
        if (lineParser == null) {
            lineParser = INSTANCE;
        }
        return lineParser.parseProtocolVersion(charArrayBuffer, parserCursor);
    }

    public static RequestLine parseRequestLine(String str, LineParser lineParser) {
        Args.notNull(str, "Value");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        ParserCursor parserCursor = new ParserCursor(0, str.length());
        if (lineParser == null) {
            lineParser = INSTANCE;
        }
        return lineParser.parseRequestLine(charArrayBuffer, parserCursor);
    }

    public static StatusLine parseStatusLine(String str, LineParser lineParser) {
        Args.notNull(str, "Value");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        ParserCursor parserCursor = new ParserCursor(0, str.length());
        if (lineParser == null) {
            lineParser = INSTANCE;
        }
        return lineParser.parseStatusLine(charArrayBuffer, parserCursor);
    }

    public ProtocolVersion createProtocolVersion(int i10, int i11) {
        return this.protocol.forVersion(i10, i11);
    }

    public RequestLine createRequestLine(String str, String str2, ProtocolVersion protocolVersion) {
        return new BasicRequestLine(str, str2, protocolVersion);
    }

    public StatusLine createStatusLine(ProtocolVersion protocolVersion, int i10, String str) {
        return new BasicStatusLine(protocolVersion, i10, str);
    }

    @Override // org.apache.http.message.LineParser
    public boolean hasProtocolVersion(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) {
        int i10;
        Args.notNull(charArrayBuffer, "Char array buffer");
        Args.notNull(parserCursor, "Parser cursor");
        int pos = parserCursor.getPos();
        String protocol = this.protocol.getProtocol();
        int length = protocol.length();
        if (charArrayBuffer.length() < length + 4) {
            return false;
        }
        if (pos < 0) {
            i10 = (charArrayBuffer.length() - 4) - length;
        } else {
            i10 = pos;
            if (pos == 0) {
                while (true) {
                    i10 = pos;
                    if (pos >= charArrayBuffer.length()) {
                        break;
                    }
                    i10 = pos;
                    if (!HTTP.isWhitespace(charArrayBuffer.charAt(pos))) {
                        break;
                    }
                    pos++;
                }
            }
        }
        int i11 = i10 + length;
        if (i11 + 4 > charArrayBuffer.length()) {
            return false;
        }
        boolean z10 = true;
        for (int i12 = 0; z10 && i12 < length; i12++) {
            z10 = charArrayBuffer.charAt(i10 + i12) == protocol.charAt(i12);
        }
        boolean z11 = z10;
        if (z10) {
            z11 = charArrayBuffer.charAt(i11) == '/';
        }
        return z11;
    }

    @Override // org.apache.http.message.LineParser
    public Header parseHeader(CharArrayBuffer charArrayBuffer) {
        return new BufferedHeader(charArrayBuffer);
    }

    @Override // org.apache.http.message.LineParser
    public ProtocolVersion parseProtocolVersion(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) {
        Args.notNull(charArrayBuffer, "Char array buffer");
        Args.notNull(parserCursor, "Parser cursor");
        String protocol = this.protocol.getProtocol();
        int length = protocol.length();
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        skipWhitespace(charArrayBuffer, parserCursor);
        int pos2 = parserCursor.getPos();
        int i10 = pos2 + length;
        if (i10 + 4 > upperBound) {
            throw new ParseException("Not a valid protocol version: " + charArrayBuffer.substring(pos, upperBound));
        }
        boolean z10 = true;
        for (int i11 = 0; z10 && i11 < length; i11++) {
            z10 = charArrayBuffer.charAt(pos2 + i11) == protocol.charAt(i11);
        }
        boolean z11 = z10;
        if (z10) {
            z11 = charArrayBuffer.charAt(i10) == '/';
        }
        if (!z11) {
            throw new ParseException("Not a valid protocol version: " + charArrayBuffer.substring(pos, upperBound));
        }
        int i12 = pos2 + length + 1;
        int indexOf = charArrayBuffer.indexOf(46, i12, upperBound);
        if (indexOf == -1) {
            throw new ParseException("Invalid protocol version number: " + charArrayBuffer.substring(pos, upperBound));
        }
        try {
            int parseInt = Integer.parseInt(charArrayBuffer.substringTrimmed(i12, indexOf));
            int i13 = indexOf + 1;
            int indexOf2 = charArrayBuffer.indexOf(32, i13, upperBound);
            int i14 = indexOf2;
            if (indexOf2 == -1) {
                i14 = upperBound;
            }
            try {
                int parseInt2 = Integer.parseInt(charArrayBuffer.substringTrimmed(i13, i14));
                parserCursor.updatePos(i14);
                return createProtocolVersion(parseInt, parseInt2);
            } catch (NumberFormatException e10) {
                throw new ParseException("Invalid protocol minor version number: " + charArrayBuffer.substring(pos, upperBound));
            }
        } catch (NumberFormatException e11) {
            throw new ParseException("Invalid protocol major version number: " + charArrayBuffer.substring(pos, upperBound));
        }
    }

    @Override // org.apache.http.message.LineParser
    public RequestLine parseRequestLine(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) {
        Args.notNull(charArrayBuffer, "Char array buffer");
        Args.notNull(parserCursor, "Parser cursor");
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        try {
            skipWhitespace(charArrayBuffer, parserCursor);
            int pos2 = parserCursor.getPos();
            int indexOf = charArrayBuffer.indexOf(32, pos2, upperBound);
            if (indexOf < 0) {
                throw new ParseException("Invalid request line: " + charArrayBuffer.substring(pos, upperBound));
            }
            String substringTrimmed = charArrayBuffer.substringTrimmed(pos2, indexOf);
            parserCursor.updatePos(indexOf);
            skipWhitespace(charArrayBuffer, parserCursor);
            int pos3 = parserCursor.getPos();
            int indexOf2 = charArrayBuffer.indexOf(32, pos3, upperBound);
            if (indexOf2 < 0) {
                throw new ParseException("Invalid request line: " + charArrayBuffer.substring(pos, upperBound));
            }
            String substringTrimmed2 = charArrayBuffer.substringTrimmed(pos3, indexOf2);
            parserCursor.updatePos(indexOf2);
            ProtocolVersion parseProtocolVersion = parseProtocolVersion(charArrayBuffer, parserCursor);
            skipWhitespace(charArrayBuffer, parserCursor);
            if (parserCursor.atEnd()) {
                return createRequestLine(substringTrimmed, substringTrimmed2, parseProtocolVersion);
            }
            throw new ParseException("Invalid request line: " + charArrayBuffer.substring(pos, upperBound));
        } catch (IndexOutOfBoundsException e10) {
            throw new ParseException("Invalid request line: " + charArrayBuffer.substring(pos, upperBound));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009f, code lost:
    
        r0 = java.lang.Integer.parseInt(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
    
        if (r8 >= r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00aa, code lost:
    
        r7 = r6.substringTrimmed(r8, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c1, code lost:
    
        return createStatusLine(r0, r0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b5, code lost:
    
        r7 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ef, code lost:
    
        throw new org.apache.http.ParseException("Status line contains invalid status code: " + r6.substring(r0, r0));
     */
    @Override // org.apache.http.message.LineParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.apache.http.StatusLine parseStatusLine(org.apache.http.util.CharArrayBuffer r6, org.apache.http.message.ParserCursor r7) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.message.BasicLineParser.parseStatusLine(org.apache.http.util.CharArrayBuffer, org.apache.http.message.ParserCursor):org.apache.http.StatusLine");
    }

    public void skipWhitespace(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) {
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        while (pos < upperBound && HTTP.isWhitespace(charArrayBuffer.charAt(pos))) {
            pos++;
        }
        parserCursor.updatePos(pos);
    }
}

package org.apache.http.message;

import java.util.BitSet;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.CharArrayBuffer;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/message/TokenParser.class */
public class TokenParser {

    /* renamed from: CR */
    public static final char f36169CR = '\r';
    public static final char DQUOTE = '\"';
    public static final char ESCAPE = '\\';

    /* renamed from: HT */
    public static final char f36170HT = '\t';
    public static final TokenParser INSTANCE = new TokenParser();

    /* renamed from: LF */
    public static final char f36171LF = '\n';

    /* renamed from: SP */
    public static final char f36172SP = ' ';

    public static BitSet INIT_BITSET(int... iArr) {
        BitSet bitSet = new BitSet();
        for (int i10 : iArr) {
            bitSet.set(i10);
        }
        return bitSet;
    }

    public static boolean isWhitespace(char c10) {
        return c10 == ' ' || c10 == '\t' || c10 == '\r' || c10 == '\n';
    }

    public void copyContent(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor, BitSet bitSet, StringBuilder sb2) {
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        for (int pos2 = parserCursor.getPos(); pos2 < upperBound; pos2++) {
            char charAt = charArrayBuffer.charAt(pos2);
            if ((bitSet != null && bitSet.get(charAt)) || isWhitespace(charAt)) {
                break;
            }
            pos++;
            sb2.append(charAt);
        }
        parserCursor.updatePos(pos);
    }

    public void copyQuotedContent(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor, StringBuilder sb2) {
        int i10;
        boolean z10;
        if (parserCursor.atEnd()) {
            return;
        }
        int pos = parserCursor.getPos();
        int pos2 = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        if (charArrayBuffer.charAt(pos) != '\"') {
            return;
        }
        int i11 = pos + 1;
        int i12 = pos2 + 1;
        boolean z11 = false;
        while (true) {
            boolean z12 = z11;
            i10 = i11;
            if (i12 >= upperBound) {
                break;
            }
            char charAt = charArrayBuffer.charAt(i12);
            if (z12) {
                if (charAt != '\"' && charAt != '\\') {
                    sb2.append('\\');
                }
                sb2.append(charAt);
                z10 = false;
            } else {
                if (charAt == '\"') {
                    i10 = i11 + 1;
                    break;
                }
                if (charAt == '\\') {
                    z10 = true;
                } else {
                    z10 = z12;
                    if (charAt != '\r') {
                        z10 = z12;
                        if (charAt != '\n') {
                            sb2.append(charAt);
                            z10 = z12;
                        }
                    }
                }
            }
            i12++;
            i11++;
            z11 = z10;
        }
        parserCursor.updatePos(i10);
    }

    public void copyUnquotedContent(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor, BitSet bitSet, StringBuilder sb2) {
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        for (int pos2 = parserCursor.getPos(); pos2 < upperBound; pos2++) {
            char charAt = charArrayBuffer.charAt(pos2);
            if ((bitSet != null && bitSet.get(charAt)) || isWhitespace(charAt) || charAt == '\"') {
                break;
            }
            pos++;
            sb2.append(charAt);
        }
        parserCursor.updatePos(pos);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (r11 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r0.length() <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        r0.append(' ');
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String parseToken(org.apache.http.util.CharArrayBuffer r7, org.apache.http.message.ParserCursor r8, java.util.BitSet r9) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r12 = r0
        L9:
            r0 = 0
            r11 = r0
        Lc:
            r0 = r8
            boolean r0 = r0.atEnd()
            if (r0 != 0) goto L62
            r0 = r7
            r1 = r8
            int r1 = r1.getPos()
            char r0 = r0.charAt(r1)
            r10 = r0
            r0 = r9
            if (r0 == 0) goto L2d
            r0 = r9
            r1 = r10
            boolean r0 = r0.get(r1)
            if (r0 == 0) goto L2d
            goto L62
        L2d:
            r0 = r10
            boolean r0 = isWhitespace(r0)
            if (r0 == 0) goto L41
            r0 = r6
            r1 = r7
            r2 = r8
            r0.skipWhiteSpace(r1, r2)
            r0 = 1
            r11 = r0
            goto Lc
        L41:
            r0 = r11
            if (r0 == 0) goto L56
            r0 = r12
            int r0 = r0.length()
            if (r0 <= 0) goto L56
            r0 = r12
            r1 = 32
            java.lang.StringBuilder r0 = r0.append(r1)
        L56:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r12
            r0.copyContent(r1, r2, r3, r4)
            goto L9
        L62:
            r0 = r12
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.message.TokenParser.parseToken(org.apache.http.util.CharArrayBuffer, org.apache.http.message.ParserCursor, java.util.BitSet):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r0 != '\"') goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        if (r11 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r0.length() <= 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        r0.append(' ');
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        copyUnquotedContent(r7, r8, r9, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004a, code lost:
    
        if (r11 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0052, code lost:
    
        if (r0.length() <= 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0055, code lost:
    
        r0.append(' ');
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005d, code lost:
    
        copyQuotedContent(r7, r8, r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String parseValue(org.apache.http.util.CharArrayBuffer r7, org.apache.http.message.ParserCursor r8, java.util.BitSet r9) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r12 = r0
        L9:
            r0 = 0
            r11 = r0
        Lc:
            r0 = r8
            boolean r0 = r0.atEnd()
            if (r0 != 0) goto L89
            r0 = r7
            r1 = r8
            int r1 = r1.getPos()
            char r0 = r0.charAt(r1)
            r10 = r0
            r0 = r9
            if (r0 == 0) goto L2d
            r0 = r9
            r1 = r10
            boolean r0 = r0.get(r1)
            if (r0 == 0) goto L2d
            goto L89
        L2d:
            r0 = r10
            boolean r0 = isWhitespace(r0)
            if (r0 == 0) goto L41
            r0 = r6
            r1 = r7
            r2 = r8
            r0.skipWhiteSpace(r1, r2)
            r0 = 1
            r11 = r0
            goto Lc
        L41:
            r0 = r10
            r1 = 34
            if (r0 != r1) goto L68
            r0 = r11
            if (r0 == 0) goto L5d
            r0 = r12
            int r0 = r0.length()
            if (r0 <= 0) goto L5d
            r0 = r12
            r1 = 32
            java.lang.StringBuilder r0 = r0.append(r1)
        L5d:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r12
            r0.copyQuotedContent(r1, r2, r3)
            goto L9
        L68:
            r0 = r11
            if (r0 == 0) goto L7d
            r0 = r12
            int r0 = r0.length()
            if (r0 <= 0) goto L7d
            r0 = r12
            r1 = 32
            java.lang.StringBuilder r0 = r0.append(r1)
        L7d:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r12
            r0.copyUnquotedContent(r1, r2, r3, r4)
            goto L9
        L89:
            r0 = r12
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.message.TokenParser.parseValue(org.apache.http.util.CharArrayBuffer, org.apache.http.message.ParserCursor, java.util.BitSet):java.lang.String");
    }

    public void skipWhiteSpace(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) {
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        for (int pos2 = parserCursor.getPos(); pos2 < upperBound && isWhitespace(charArrayBuffer.charAt(pos2)); pos2++) {
            pos++;
        }
        parserCursor.updatePos(pos);
    }
}

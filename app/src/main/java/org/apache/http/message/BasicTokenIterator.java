package org.apache.http.message;

import java.util.NoSuchElementException;
import org.apache.http.HeaderIterator;
import org.apache.http.ParseException;
import org.apache.http.TokenIterator;
import org.apache.http.util.Args;

/* loaded from: combined.jar:classes3.jar:org/apache/http/message/BasicTokenIterator.class */
public class BasicTokenIterator implements TokenIterator {
    public static final String HTTP_SEPARATORS = " ,;=()<>@:\\\"/[]?{}\t";
    public String currentHeader;
    public String currentToken;
    public final HeaderIterator headerIt;
    public int searchPos = findNext(-1);

    public BasicTokenIterator(HeaderIterator headerIterator) {
        this.headerIt = (HeaderIterator) Args.notNull(headerIterator, "Header iterator");
    }

    public String createToken(String str, int i10, int i11) {
        return str.substring(i10, i11);
    }

    public int findNext(int i10) {
        int findTokenSeparator;
        int findTokenEnd;
        String createToken;
        if (i10 >= 0) {
            findTokenSeparator = findTokenSeparator(i10);
        } else {
            if (!this.headerIt.hasNext()) {
                return -1;
            }
            this.currentHeader = this.headerIt.nextHeader().getValue();
            findTokenSeparator = 0;
        }
        int findTokenStart = findTokenStart(findTokenSeparator);
        if (findTokenStart < 0) {
            createToken = null;
            findTokenEnd = -1;
        } else {
            findTokenEnd = findTokenEnd(findTokenStart);
            createToken = createToken(this.currentHeader, findTokenStart, findTokenEnd);
        }
        this.currentToken = createToken;
        return findTokenEnd;
    }

    public int findTokenEnd(int i10) {
        Args.notNegative(i10, "Search position");
        int length = this.currentHeader.length();
        do {
            i10++;
            if (i10 >= length) {
                break;
            }
        } while (isTokenChar(this.currentHeader.charAt(i10)));
        return i10;
    }

    public int findTokenSeparator(int i10) {
        int notNegative = Args.notNegative(i10, "Search position");
        int length = this.currentHeader.length();
        boolean z10 = false;
        while (!z10 && notNegative < length) {
            char charAt = this.currentHeader.charAt(notNegative);
            if (isTokenSeparator(charAt)) {
                z10 = true;
            } else {
                if (!isWhitespace(charAt)) {
                    if (isTokenChar(charAt)) {
                        throw new ParseException("Tokens without separator (pos " + notNegative + "): " + this.currentHeader);
                    }
                    throw new ParseException("Invalid character after token (pos " + notNegative + "): " + this.currentHeader);
                }
                notNegative++;
            }
        }
        return notNegative;
    }

    public int findTokenStart(int i10) {
        String str;
        int notNegative = Args.notNegative(i10, "Search position");
        boolean z10 = false;
        while (!z10 && (str = this.currentHeader) != null) {
            int length = str.length();
            int i11 = notNegative;
            boolean z11 = z10;
            while (!z11 && i11 < length) {
                char charAt = this.currentHeader.charAt(i11);
                if (isTokenSeparator(charAt) || isWhitespace(charAt)) {
                    i11++;
                } else {
                    if (!isTokenChar(this.currentHeader.charAt(i11))) {
                        throw new ParseException("Invalid character before token (pos " + i11 + "): " + this.currentHeader);
                    }
                    z11 = true;
                }
            }
            z10 = z11;
            notNegative = i11;
            if (!z11) {
                if (this.headerIt.hasNext()) {
                    this.currentHeader = this.headerIt.nextHeader().getValue();
                    notNegative = 0;
                    z10 = z11;
                } else {
                    this.currentHeader = null;
                    z10 = z11;
                    notNegative = i11;
                }
            }
        }
        if (!z10) {
            notNegative = -1;
        }
        return notNegative;
    }

    @Override // org.apache.http.TokenIterator, java.util.Iterator
    public boolean hasNext() {
        return this.currentToken != null;
    }

    public boolean isHttpSeparator(char c10) {
        return HTTP_SEPARATORS.indexOf(c10) >= 0;
    }

    public boolean isTokenChar(char c10) {
        if (Character.isLetterOrDigit(c10)) {
            return true;
        }
        return (Character.isISOControl(c10) || isHttpSeparator(c10)) ? false : true;
    }

    public boolean isTokenSeparator(char c10) {
        return c10 == ',';
    }

    public boolean isWhitespace(char c10) {
        return c10 == '\t' || Character.isSpaceChar(c10);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return nextToken();
    }

    @Override // org.apache.http.TokenIterator
    public String nextToken() {
        String str = this.currentToken;
        if (str == null) {
            throw new NoSuchElementException("Iteration already finished.");
        }
        this.searchPos = findNext(this.searchPos);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Removing tokens is not supported.");
    }
}

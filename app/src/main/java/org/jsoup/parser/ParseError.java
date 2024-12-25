package org.jsoup.parser;

/* loaded from: combined.jar:classes3.jar:org/jsoup/parser/ParseError.class */
public class ParseError {
    private String errorMsg;
    private int pos;

    public ParseError(int i10, String str) {
        this.pos = i10;
        this.errorMsg = str;
    }

    public ParseError(int i10, String str, Object... objArr) {
        this.errorMsg = String.format(str, objArr);
        this.pos = i10;
    }

    public String getErrorMessage() {
        return this.errorMsg;
    }

    public int getPosition() {
        return this.pos;
    }

    public String toString() {
        return this.pos + ": " + this.errorMsg;
    }
}

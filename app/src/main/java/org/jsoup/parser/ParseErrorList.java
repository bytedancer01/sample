package org.jsoup.parser;

import java.util.ArrayList;

/* loaded from: combined.jar:classes3.jar:org/jsoup/parser/ParseErrorList.class */
class ParseErrorList extends ArrayList<ParseError> {
    private static final int INITIAL_CAPACITY = 16;
    private final int maxSize;

    public ParseErrorList(int i10, int i11) {
        super(i10);
        this.maxSize = i11;
    }

    public static ParseErrorList noTracking() {
        return new ParseErrorList(0, 0);
    }

    public static ParseErrorList tracking(int i10) {
        return new ParseErrorList(16, i10);
    }

    public boolean canAddError() {
        return size() < this.maxSize;
    }

    public int getMaxSize() {
        return this.maxSize;
    }
}

package org.apache.http.message;

/* loaded from: combined.jar:classes3.jar:org/apache/http/message/ParserCursor.class */
public class ParserCursor {
    private final int lowerBound;
    private int pos;
    private final int upperBound;

    public ParserCursor(int i10, int i11) {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Lower bound cannot be negative");
        }
        if (i10 > i11) {
            throw new IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
        }
        this.lowerBound = i10;
        this.upperBound = i11;
        this.pos = i10;
    }

    public boolean atEnd() {
        return this.pos >= this.upperBound;
    }

    public int getLowerBound() {
        return this.lowerBound;
    }

    public int getPos() {
        return this.pos;
    }

    public int getUpperBound() {
        return this.upperBound;
    }

    public String toString() {
        return '[' + Integer.toString(this.lowerBound) + '>' + Integer.toString(this.pos) + '>' + Integer.toString(this.upperBound) + ']';
    }

    public void updatePos(int i10) {
        if (i10 < this.lowerBound) {
            throw new IndexOutOfBoundsException("pos: " + i10 + " < lowerBound: " + this.lowerBound);
        }
        if (i10 <= this.upperBound) {
            this.pos = i10;
            return;
        }
        throw new IndexOutOfBoundsException("pos: " + i10 + " > upperBound: " + this.upperBound);
    }
}

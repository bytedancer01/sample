package org.simpleframework.xml.stream;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/stream/Splitter.class */
abstract class Splitter {
    public StringBuilder builder = new StringBuilder();
    public int count;
    public int off;
    public char[] text;

    public Splitter(String str) {
        char[] charArray = str.toCharArray();
        this.text = charArray;
        this.count = charArray.length;
    }

    private boolean acronym() {
        int i10 = this.off;
        boolean z10 = false;
        int i11 = 0;
        while (i10 < this.count && isUpper(this.text[i10])) {
            i11++;
            i10++;
        }
        if (i11 > 1) {
            int i12 = i10;
            if (i10 < this.count) {
                i12 = i10;
                if (isUpper(this.text[i10 - 1])) {
                    i12 = i10 - 1;
                }
            }
            char[] cArr = this.text;
            int i13 = this.off;
            commit(cArr, i13, i12 - i13);
            this.off = i12;
        }
        if (i11 > 1) {
            z10 = true;
        }
        return z10;
    }

    private boolean isDigit(char c10) {
        return Character.isDigit(c10);
    }

    private boolean isLetter(char c10) {
        return Character.isLetter(c10);
    }

    private boolean isSpecial(char c10) {
        return !Character.isLetterOrDigit(c10);
    }

    private boolean isUpper(char c10) {
        return Character.isUpperCase(c10);
    }

    private boolean number() {
        int i10 = this.off;
        boolean z10 = false;
        int i11 = 0;
        while (i10 < this.count && isDigit(this.text[i10])) {
            i11++;
            i10++;
        }
        if (i11 > 0) {
            char[] cArr = this.text;
            int i12 = this.off;
            commit(cArr, i12, i10 - i12);
        }
        this.off = i10;
        if (i11 > 0) {
            z10 = true;
        }
        return z10;
    }

    private void token() {
        int i10 = this.off;
        while (i10 < this.count) {
            char c10 = this.text[i10];
            if (!isLetter(c10) || (i10 > this.off && isUpper(c10))) {
                break;
            } else {
                i10++;
            }
        }
        int i11 = this.off;
        if (i10 > i11) {
            parse(this.text, i11, i10 - i11);
            char[] cArr = this.text;
            int i12 = this.off;
            commit(cArr, i12, i10 - i12);
        }
        this.off = i10;
    }

    public abstract void commit(char[] cArr, int i10, int i11);

    public abstract void parse(char[] cArr, int i10, int i11);

    public String process() {
        while (this.off < this.count) {
            while (true) {
                int i10 = this.off;
                if (i10 >= this.count || !isSpecial(this.text[i10])) {
                    break;
                }
                this.off++;
            }
            if (!acronym()) {
                token();
                number();
            }
        }
        return this.builder.toString();
    }

    public char toLower(char c10) {
        return Character.toLowerCase(c10);
    }

    public char toUpper(char c10) {
        return Character.toUpperCase(c10);
    }
}

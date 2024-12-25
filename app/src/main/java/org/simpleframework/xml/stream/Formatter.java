package org.simpleframework.xml.stream;

import java.io.BufferedWriter;
import java.io.Writer;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/stream/Formatter.class */
class Formatter {
    private OutputBuffer buffer = new OutputBuffer();
    private Indenter indenter;
    private Tag last;
    private String prolog;
    private Writer result;
    private static final char[] NAMESPACE = {'x', 'm', 'l', 'n', 's'};
    private static final char[] LESS = {'&', 'l', 't', ';'};
    private static final char[] GREATER = {'&', 'g', 't', ';'};
    private static final char[] DOUBLE = {'&', 'q', 'u', 'o', 't', ';'};
    private static final char[] SINGLE = {'&', 'a', 'p', 'o', 's', ';'};
    private static final char[] AND = {'&', 'a', 'm', 'p', ';'};
    private static final char[] OPEN = {'<', '!', '-', '-', ' '};
    private static final char[] CLOSE = {' ', '-', '-', '>'};

    /* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/stream/Formatter$Tag.class */
    public enum Tag {
        COMMENT,
        START,
        TEXT,
        END
    }

    public Formatter(Writer writer, Format format) {
        this.result = new BufferedWriter(writer, 1024);
        this.indenter = new Indenter(format);
        this.prolog = format.getProlog();
    }

    private void append(char c10) {
        this.buffer.append(c10);
    }

    private void append(String str) {
        this.buffer.append(str);
    }

    private void append(char[] cArr) {
        this.buffer.append(cArr);
    }

    private void data(String str) {
        write("<![CDATA[");
        write(str);
        write("]]>");
    }

    private void escape(char c10) {
        char[] symbol = symbol(c10);
        if (symbol != null) {
            write(symbol);
        } else {
            write(c10);
        }
    }

    private void escape(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            escape(str.charAt(i10));
        }
    }

    private boolean isEmpty(String str) {
        boolean z10 = true;
        if (str != null) {
            z10 = str.length() == 0;
        }
        return z10;
    }

    private boolean isText(char c10) {
        boolean z10 = true;
        if (c10 == '\t' || c10 == '\n' || c10 == '\r' || c10 == ' ') {
            return true;
        }
        if (c10 <= ' ' || c10 > '~') {
            return false;
        }
        if (c10 == 247) {
            z10 = false;
        }
        return z10;
    }

    private char[] symbol(char c10) {
        if (c10 == '\"') {
            return DOUBLE;
        }
        if (c10 == '<') {
            return LESS;
        }
        if (c10 == '>') {
            return GREATER;
        }
        if (c10 == '&') {
            return AND;
        }
        if (c10 != '\'') {
            return null;
        }
        return SINGLE;
    }

    private String unicode(char c10) {
        return Integer.toString(c10);
    }

    private void write(char c10) {
        this.buffer.write(this.result);
        this.buffer.clear();
        this.result.write(c10);
    }

    private void write(String str) {
        this.buffer.write(this.result);
        this.buffer.clear();
        this.result.write(str);
    }

    private void write(String str, String str2) {
        this.buffer.write(this.result);
        this.buffer.clear();
        if (!isEmpty(str2)) {
            this.result.write(str2);
            this.result.write(58);
        }
        this.result.write(str);
    }

    private void write(char[] cArr) {
        this.buffer.write(this.result);
        this.buffer.clear();
        this.result.write(cArr);
    }

    public void flush() {
        this.buffer.write(this.result);
        this.buffer.clear();
        this.result.flush();
    }

    public void writeAttribute(String str, String str2, String str3) {
        if (this.last != Tag.START) {
            throw new NodeException("Start element required");
        }
        write(' ');
        write(str, str3);
        write('=');
        write('\"');
        escape(str2);
        write('\"');
    }

    public void writeComment(String str) {
        String pVar = this.indenter.top();
        if (this.last == Tag.START) {
            append('>');
        }
        if (pVar != null) {
            append(pVar);
            append(OPEN);
            append(str);
            append(CLOSE);
        }
        this.last = Tag.COMMENT;
    }

    public void writeEnd(String str, String str2) {
        String pop = this.indenter.pop();
        Tag tag = this.last;
        Tag tag2 = Tag.START;
        if (tag != tag2) {
            if (tag != Tag.TEXT) {
                write(pop);
            }
            if (this.last != tag2) {
                write('<');
                write('/');
                write(str, str2);
            }
            this.last = Tag.END;
        }
        write('/');
        write('>');
        this.last = Tag.END;
    }

    public void writeNamespace(String str, String str2) {
        if (this.last != Tag.START) {
            throw new NodeException("Start element required");
        }
        write(' ');
        write(NAMESPACE);
        if (!isEmpty(str2)) {
            write(':');
            write(str2);
        }
        write('=');
        write('\"');
        escape(str);
        write('\"');
    }

    public void writeProlog() {
        String str = this.prolog;
        if (str != null) {
            write(str);
            write("\n");
        }
    }

    public void writeStart(String str, String str2) {
        String push = this.indenter.push();
        Tag tag = this.last;
        Tag tag2 = Tag.START;
        if (tag == tag2) {
            append('>');
        }
        flush();
        append(push);
        append('<');
        if (!isEmpty(str2)) {
            append(str2);
            append(':');
        }
        append(str);
        this.last = tag2;
    }

    public void writeText(String str) {
        writeText(str, Mode.ESCAPE);
    }

    public void writeText(String str, Mode mode) {
        if (this.last == Tag.START) {
            write('>');
        }
        if (mode == Mode.DATA) {
            data(str);
        } else {
            escape(str);
        }
        this.last = Tag.TEXT;
    }
}

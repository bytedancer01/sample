package org.slf4j.helpers;

/* loaded from: combined.jar:classes3.jar:org/slf4j/helpers/FormattingTuple.class */
public class FormattingTuple {
    public static FormattingTuple NULL = new FormattingTuple(null);
    private Object[] argArray;
    private String message;
    private Throwable throwable;

    public FormattingTuple(String str) {
        this(str, null, null);
    }

    public FormattingTuple(String str, Object[] objArr, Throwable th2) {
        this.message = str;
        this.throwable = th2;
        this.argArray = objArr;
    }

    public Object[] getArgArray() {
        return this.argArray;
    }

    public String getMessage() {
        return this.message;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }
}

package org.simpleframework.xml.convert;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/convert/ConvertException.class */
public class ConvertException extends Exception {
    public ConvertException(String str, Object... objArr) {
        super(String.format(str, objArr));
    }
}

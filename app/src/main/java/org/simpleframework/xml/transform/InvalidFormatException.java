package org.simpleframework.xml.transform;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/transform/InvalidFormatException.class */
public class InvalidFormatException extends TransformException {
    public InvalidFormatException(String str, Object... objArr) {
        super(String.format(str, objArr), new Object[0]);
    }

    public InvalidFormatException(Throwable th2, String str, Object... objArr) {
        super(String.format(str, objArr), th2);
    }
}

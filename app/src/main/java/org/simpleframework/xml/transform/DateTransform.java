package org.simpleframework.xml.transform;

import java.util.Date;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/transform/DateTransform.class */
class DateTransform<T extends Date> implements Transform<T> {
    private final DateFactory<T> factory;

    public DateTransform(Class<T> cls) {
        this.factory = new DateFactory<>(cls);
    }

    @Override // org.simpleframework.xml.transform.Transform
    public T read(String str) {
        T dateFactory;
        synchronized (this) {
            dateFactory = this.factory.getInstance(Long.valueOf(DateType.getDate(str).getTime()));
        }
        return dateFactory;
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String write(T t10) {
        String text;
        synchronized (this) {
            text = DateType.getText(t10);
        }
        return text;
    }
}

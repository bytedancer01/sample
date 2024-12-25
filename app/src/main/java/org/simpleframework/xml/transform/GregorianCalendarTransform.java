package org.simpleframework.xml.transform;

import java.util.Date;
import java.util.GregorianCalendar;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/transform/GregorianCalendarTransform.class */
class GregorianCalendarTransform implements Transform<GregorianCalendar> {
    private final DateTransform transform;

    public GregorianCalendarTransform() {
        this(Date.class);
    }

    public GregorianCalendarTransform(Class cls) {
        this.transform = new DateTransform(cls);
    }

    private GregorianCalendar read(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        if (date != null) {
            gregorianCalendar.setTime(date);
        }
        return gregorianCalendar;
    }

    @Override // org.simpleframework.xml.transform.Transform
    public GregorianCalendar read(String str) {
        return read(this.transform.read(str));
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String write(GregorianCalendar gregorianCalendar) {
        return this.transform.write((DateTransform) gregorianCalendar.getTime());
    }
}

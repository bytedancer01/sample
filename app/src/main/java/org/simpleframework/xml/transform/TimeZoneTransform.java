package org.simpleframework.xml.transform;

import java.util.TimeZone;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/transform/TimeZoneTransform.class */
class TimeZoneTransform implements Transform<TimeZone> {
    @Override // org.simpleframework.xml.transform.Transform
    public TimeZone read(String str) {
        return TimeZone.getTimeZone(str);
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String write(TimeZone timeZone) {
        return timeZone.getID();
    }
}

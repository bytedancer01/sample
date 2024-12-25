package org.simpleframework.xml.filter;

import java.util.Map;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/filter/PlatformFilter.class */
public class PlatformFilter extends StackFilter {
    public PlatformFilter() {
        this(null);
    }

    public PlatformFilter(Map map) {
        push(new EnvironmentFilter());
        push(new SystemFilter());
        push(new MapFilter(map));
    }
}

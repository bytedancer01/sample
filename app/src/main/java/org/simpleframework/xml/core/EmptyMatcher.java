package org.simpleframework.xml.core;

import org.simpleframework.xml.transform.Matcher;
import org.simpleframework.xml.transform.Transform;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/EmptyMatcher.class */
class EmptyMatcher implements Matcher {
    @Override // org.simpleframework.xml.transform.Matcher
    public Transform match(Class cls) {
        return null;
    }
}

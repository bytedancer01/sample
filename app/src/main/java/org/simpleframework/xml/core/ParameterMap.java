package org.simpleframework.xml.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/ParameterMap.class */
class ParameterMap extends LinkedHashMap<Object, Parameter> implements Iterable<Parameter> {
    public Parameter get(int i10) {
        return getAll().get(i10);
    }

    public List<Parameter> getAll() {
        Collection<Parameter> values = values();
        return !values.isEmpty() ? new ArrayList(values) : Collections.emptyList();
    }

    @Override // java.lang.Iterable
    public Iterator<Parameter> iterator() {
        return values().iterator();
    }
}

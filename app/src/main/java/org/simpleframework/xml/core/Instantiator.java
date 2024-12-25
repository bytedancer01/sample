package org.simpleframework.xml.core;

import java.util.List;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/Instantiator.class */
interface Instantiator {
    List<Creator> getCreators();

    Object getInstance();

    Object getInstance(Criteria criteria);

    Parameter getParameter(String str);

    List<Parameter> getParameters();

    boolean isDefault();
}

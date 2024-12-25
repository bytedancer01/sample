package org.slf4j.spi;

import org.slf4j.IMarkerFactory;

/* loaded from: combined.jar:classes3.jar:org/slf4j/spi/MarkerFactoryBinder.class */
public interface MarkerFactoryBinder {
    IMarkerFactory getMarkerFactory();

    String getMarkerFactoryClassStr();
}

package org.slf4j;

/* loaded from: combined.jar:classes3.jar:org/slf4j/IMarkerFactory.class */
public interface IMarkerFactory {
    boolean detachMarker(String str);

    boolean exists(String str);

    Marker getDetachedMarker(String str);

    Marker getMarker(String str);
}

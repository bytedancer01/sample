package org.slf4j.helpers;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.slf4j.IMarkerFactory;
import org.slf4j.Marker;

/* loaded from: combined.jar:classes3.jar:org/slf4j/helpers/BasicMarkerFactory.class */
public class BasicMarkerFactory implements IMarkerFactory {
    private final ConcurrentMap<String, Marker> markerMap = new ConcurrentHashMap();

    @Override // org.slf4j.IMarkerFactory
    public boolean detachMarker(String str) {
        boolean z10 = false;
        if (str == null) {
            return false;
        }
        if (this.markerMap.remove(str) != null) {
            z10 = true;
        }
        return z10;
    }

    @Override // org.slf4j.IMarkerFactory
    public boolean exists(String str) {
        if (str == null) {
            return false;
        }
        return this.markerMap.containsKey(str);
    }

    @Override // org.slf4j.IMarkerFactory
    public Marker getDetachedMarker(String str) {
        return new BasicMarker(str);
    }

    @Override // org.slf4j.IMarkerFactory
    public Marker getMarker(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Marker name cannot be null");
        }
        Marker marker = this.markerMap.get(str);
        Marker marker2 = marker;
        if (marker == null) {
            marker2 = new BasicMarker(str);
            Marker putIfAbsent = this.markerMap.putIfAbsent(str, marker2);
            if (putIfAbsent != null) {
                marker2 = putIfAbsent;
            }
        }
        return marker2;
    }
}

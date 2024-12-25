package org.slf4j.event;

import org.slf4j.Marker;

/* loaded from: combined.jar:classes3.jar:org/slf4j/event/LoggingEvent.class */
public interface LoggingEvent {
    Object[] getArgumentArray();

    Level getLevel();

    String getLoggerName();

    Marker getMarker();

    String getMessage();

    String getThreadName();

    Throwable getThrowable();

    long getTimeStamp();
}

package org.slf4j.event;

import org.apache.http.client.methods.HttpTrace;

/* loaded from: combined.jar:classes3.jar:org/slf4j/event/Level.class */
public enum Level {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, HttpTrace.METHOD_NAME);

    private int levelInt;
    private String levelStr;

    Level(int i10, String str) {
        this.levelInt = i10;
        this.levelStr = str;
    }

    public int toInt() {
        return this.levelInt;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.levelStr;
    }
}

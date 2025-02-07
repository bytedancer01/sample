package org.slf4j.spi;

import java.util.Map;

/* loaded from: combined.jar:classes3.jar:org/slf4j/spi/MDCAdapter.class */
public interface MDCAdapter {
    void clear();

    String get(String str);

    Map<String, String> getCopyOfContextMap();

    void put(String str, String str2);

    void remove(String str);

    void setContextMap(Map<String, String> map);
}

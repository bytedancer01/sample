package org.slf4j.spi;

import org.slf4j.ILoggerFactory;

/* loaded from: combined.jar:classes3.jar:org/slf4j/spi/LoggerFactoryBinder.class */
public interface LoggerFactoryBinder {
    ILoggerFactory getLoggerFactory();

    String getLoggerFactoryClassStr();
}

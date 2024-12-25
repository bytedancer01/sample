package org.slf4j.helpers;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

/* loaded from: combined.jar:classes3.jar:org/slf4j/helpers/NOPLoggerFactory.class */
public class NOPLoggerFactory implements ILoggerFactory {
    @Override // org.slf4j.ILoggerFactory
    public Logger getLogger(String str) {
        return NOPLogger.NOP_LOGGER;
    }
}

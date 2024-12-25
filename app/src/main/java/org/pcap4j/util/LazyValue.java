package org.pcap4j.util;

import java.io.ObjectOutputStream;
import java.io.Serializable;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/util/LazyValue.class */
public final class LazyValue<T1> implements Serializable {
    private static final long serialVersionUID = 1379102837076225509L;
    private final transient BuildValueCommand<T1> command;
    private final transient Object thisLock = new Object();
    private volatile T1 value = null;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/util/LazyValue$BuildValueCommand.class */
    public interface BuildValueCommand<T2> {
        T2 buildValue();
    }

    public LazyValue(BuildValueCommand<T1> buildValueCommand) {
        this.command = buildValueCommand;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        getValue();
        if (this.value == null) {
            throw new AssertionError();
        }
        objectOutputStream.defaultWriteObject();
    }

    public T1 getValue() {
        if (this.value == null) {
            synchronized (this.thisLock) {
                if (this.value == null) {
                    this.value = this.command.buildValue();
                }
            }
        }
        return this.value;
    }
}

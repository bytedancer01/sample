package org.pcap4j.core;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/core/PcapNativeException.class */
public final class PcapNativeException extends Exception {
    private static final long serialVersionUID = -6458526492950674556L;
    private Integer returnCode;

    public PcapNativeException() {
        this.returnCode = null;
    }

    public PcapNativeException(String str) {
        super(str);
        this.returnCode = null;
    }

    public PcapNativeException(String str, Integer num) {
        super(str);
        this.returnCode = num;
    }

    public PcapNativeException(String str, Throwable th2) {
        super(str, th2);
        this.returnCode = null;
    }

    public PcapNativeException(Throwable th2) {
        super(th2);
        this.returnCode = null;
    }

    public Integer getReturnCode() {
        return this.returnCode;
    }

    public void setReturnCode(Integer num) {
        this.returnCode = num;
    }
}

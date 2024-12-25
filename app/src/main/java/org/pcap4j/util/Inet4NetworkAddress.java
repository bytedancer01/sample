package org.pcap4j.util;

import java.io.Serializable;
import java.net.Inet4Address;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/util/Inet4NetworkAddress.class */
public final class Inet4NetworkAddress implements Serializable {
    private static final long serialVersionUID = -8599700451783666420L;
    private final Inet4Address mask;
    private final Inet4Address networkAddress;

    public Inet4NetworkAddress(Inet4Address inet4Address, Inet4Address inet4Address2) {
        this.networkAddress = inet4Address;
        this.mask = inet4Address2;
    }

    public Inet4Address getMask() {
        return this.mask;
    }

    public Inet4Address getNetworkAddress() {
        return this.networkAddress;
    }
}

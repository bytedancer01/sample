package org.pcap4j.core;

import java.net.InetAddress;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/core/PcapAddress.class */
public interface PcapAddress {
    InetAddress getAddress();

    InetAddress getBroadcastAddress();

    InetAddress getDestinationAddress();

    InetAddress getNetmask();
}

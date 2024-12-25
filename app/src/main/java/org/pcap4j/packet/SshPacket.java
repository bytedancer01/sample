package org.pcap4j.packet;

import org.pcap4j.packet.Packet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/SshPacket.class */
public final class SshPacket extends AbstractPacket {
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) SshPacket.class);
    private static final long serialVersionUID = 1;

    private SshPacket() {
        throw new AssertionError();
    }

    public static Packet newPacket(byte[] bArr, int i10, int i11) {
        try {
            return Ssh2VersionExchangePacket.newPacket(bArr, i10, i11);
        } catch (IllegalRawDataException e10) {
            logger.debug("rawData seems not SSH2 version exchange packet.", (Throwable) e10);
            return Ssh2BinaryPacket.newPacket(bArr, i10, i11);
        }
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet.Builder getBuilder() {
        throw new UnsupportedOperationException();
    }
}

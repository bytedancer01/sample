package org.pcap4j.util;

import java.util.Iterator;
import org.pcap4j.packet.ChecksumBuilder;
import org.pcap4j.packet.LengthBuilder;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.UnknownPacket;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/util/IcmpV6Helper.class */
public final class IcmpV6Helper {
    private IcmpV6Helper() {
        throw new AssertionError();
    }

    public static Packet makePacketForInvokingPacketField(Packet packet, int i10) {
        Packet packet2;
        int i11;
        if (packet == null || packet.getHeader() == null || packet.getPayload() == null) {
            throw new NullPointerException("packet: " + packet + " packet.getHeader(): " + packet.getHeader() + " packet.getPayload(): " + packet.getPayload());
        }
        if (packet.length() <= i10) {
            return packet;
        }
        int length = packet.getHeader().length();
        Iterator<Packet> it = packet.getPayload().iterator();
        int i12 = length;
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                packet2 = null;
                i11 = i13;
                break;
            }
            packet2 = it.next();
            if (packet2.getHeader() == null) {
                packet2.length();
                i12 = length;
                i11 = i13 + 1;
                break;
            }
            int length2 = packet2.getHeader().length() + length;
            i13++;
            if (length2 > i10) {
                i12 = length;
                i11 = i13;
                break;
            }
            i12 = length;
            length = length2;
        }
        Packet.Builder builder = packet.getBuilder();
        Iterator<Packet.Builder> it2 = builder.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Packet.Builder next = it2.next();
            if (next instanceof LengthBuilder) {
                ((LengthBuilder) next).correctLengthAtBuild(false);
            }
            if (next instanceof ChecksumBuilder) {
                ((ChecksumBuilder) next).correctChecksumAtBuild(false);
            }
            int i14 = i11 - 1;
            i11 = i14;
            if (i14 == 0) {
                int i15 = i10 - i12;
                if (i15 > 0) {
                    next.payloadBuilder(new UnknownPacket.Builder().rawData(ByteArrays.getSubArray(packet2.getRawData(), 0, i15)));
                } else {
                    next.payloadBuilder(null);
                }
            }
        }
        return builder.build();
    }

    public static Packet makePacketForRedirectHeaderOption(Packet packet, int i10) {
        if (packet.length() <= i10) {
            i10 = packet.length();
        }
        return makePacketForInvokingPacketField(packet, i10 - (i10 % 8));
    }
}

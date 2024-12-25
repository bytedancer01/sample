package org.pcap4j.packet;

import org.pcap4j.packet.GtpV1Packet;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.NotApplicable;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/GtpSelector.class */
public final class GtpSelector extends AbstractPacket {
    private static final long serialVersionUID = 5081921978086270980L;

    /* renamed from: org.pcap4j.packet.GtpSelector$1 */
    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/GtpSelector$1.class */
    public static /* synthetic */ class C72651 {
        public static final int[] $SwitchMap$org$pcap4j$packet$GtpV1Packet$ProtocolType;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:8:0x0020
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                org.pcap4j.packet.GtpV1Packet$ProtocolType[] r0 = org.pcap4j.packet.GtpV1Packet.ProtocolType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                org.pcap4j.packet.GtpSelector.C72651.$SwitchMap$org$pcap4j$packet$GtpV1Packet$ProtocolType = r0
                r0 = r4
                org.pcap4j.packet.GtpV1Packet$ProtocolType r1 = org.pcap4j.packet.GtpV1Packet.ProtocolType.GTP     // Catch: java.lang.NoSuchFieldError -> L20
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L20
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L20
            L14:
                int[] r0 = org.pcap4j.packet.GtpSelector.C72651.$SwitchMap$org$pcap4j$packet$GtpV1Packet$ProtocolType     // Catch: java.lang.NoSuchFieldError -> L20 java.lang.NoSuchFieldError -> L24
                org.pcap4j.packet.GtpV1Packet$ProtocolType r1 = org.pcap4j.packet.GtpV1Packet.ProtocolType.GTP_PRIME     // Catch: java.lang.NoSuchFieldError -> L24
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L24
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L24
            L1f:
                return
            L20:
                r4 = move-exception
                goto L14
            L24:
                r4 = move-exception
                goto L1f
            */
            throw new UnsupportedOperationException("Method not decompiled: org.pcap4j.packet.GtpSelector.C72651.m45576clinit():void");
        }
    }

    private GtpSelector() {
        throw new AssertionError();
    }

    public static Packet newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        byte b10 = bArr[i10];
        return (((b10 >> 5) & 7) == 1 && C72651.$SwitchMap$org$pcap4j$packet$GtpV1Packet$ProtocolType[GtpV1Packet.ProtocolType.getInstance((b10 & 16) != 0).ordinal()] == 1) ? GtpV1Packet.newPacket(bArr, i10, i11) : (Packet) PacketFactories.getFactory(Packet.class, NotApplicable.class).newInstance(bArr, i10, i11, NotApplicable.UNKNOWN);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet.Builder getBuilder() {
        throw new UnsupportedOperationException();
    }
}

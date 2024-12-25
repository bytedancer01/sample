package org.pcap4j.packet;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.achartengine.renderer.DefaultRenderer;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.TransportPacket;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.SctpChunkType;
import org.pcap4j.packet.namednumber.SctpPort;
import org.pcap4j.util.ByteArrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/SctpPacket.class */
public final class SctpPacket extends AbstractPacket implements TransportPacket {
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) SctpPacket.class);
    private static final long serialVersionUID = -1082956644945517426L;
    private final SctpHeader header;
    private final Packet payload;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/SctpPacket$Builder.class */
    public static final class Builder extends AbstractPacket.AbstractBuilder implements ChecksumBuilder<SctpPacket> {
        private int checksum;
        private List<SctpChunk> chunks;
        private boolean correctChecksumAtBuild;
        private SctpPort dstPort;
        private Packet.Builder payloadBuilder;
        private SctpPort srcPort;
        private int verificationTag;

        public Builder() {
        }

        public Builder(SctpPacket sctpPacket) {
            this.srcPort = sctpPacket.header.srcPort;
            this.dstPort = sctpPacket.header.dstPort;
            this.verificationTag = sctpPacket.header.verificationTag;
            this.checksum = sctpPacket.header.checksum;
            this.chunks = sctpPacket.header.chunks;
            this.payloadBuilder = sctpPacket.payload != null ? sctpPacket.payload.getBuilder() : null;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public SctpPacket build() {
            return new SctpPacket(this);
        }

        public Builder checksum(int i10) {
            this.checksum = i10;
            return this;
        }

        public Builder chunks(List<SctpChunk> list) {
            this.chunks = list;
            return this;
        }

        @Override // org.pcap4j.packet.ChecksumBuilder
        public ChecksumBuilder<SctpPacket> correctChecksumAtBuild(boolean z10) {
            this.correctChecksumAtBuild = z10;
            return this;
        }

        public Builder dstPort(SctpPort sctpPort) {
            this.dstPort = sctpPort;
            return this;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Packet.Builder getPayloadBuilder() {
            return this.payloadBuilder;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Builder payloadBuilder(Packet.Builder builder) {
            this.payloadBuilder = builder;
            return this;
        }

        public Builder srcPort(SctpPort sctpPort) {
            this.srcPort = sctpPort;
            return this;
        }

        public Builder verificationTag(int i10) {
            this.verificationTag = i10;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/SctpPacket$SctpChunk.class */
    public interface SctpChunk extends Serializable {
        byte[] getRawData();

        SctpChunkType getType();

        int length();
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/SctpPacket$SctpHeader.class */
    public static final class SctpHeader extends AbstractPacket.AbstractHeader implements TransportPacket.TransportHeader {
        private static final int CHECKSUM_OFFSET = 8;
        private static final int CHECKSUM_SIZE = 4;
        private static final int CHUNKS_OFFSET = 12;
        private static final int DST_PORT_OFFSET = 2;
        private static final int DST_PORT_SIZE = 2;
        private static final int SRC_PORT_OFFSET = 0;
        private static final int SRC_PORT_SIZE = 2;
        private static final int VERIFICAION_TAG_SIZE = 4;
        private static final int VERIFICATION_TAG_OFFSET = 4;
        private static final long serialVersionUID = -8223170335586535940L;
        private final int checksum;
        private final List<SctpChunk> chunks;
        private final SctpPort dstPort;
        private final SctpPort srcPort;
        private final int verificationTag;

        private SctpHeader(Builder builder) {
            this.srcPort = builder.srcPort;
            this.dstPort = builder.dstPort;
            this.verificationTag = builder.verificationTag;
            this.chunks = builder.chunks != null ? new ArrayList(builder.chunks) : Collections.emptyList();
            this.checksum = builder.correctChecksumAtBuild ? calcChecksum() : builder.checksum;
        }

        private SctpHeader(byte[] bArr, int i10, int i11) {
            if (i11 < 12) {
                StringBuilder sb2 = new StringBuilder(80);
                sb2.append("The data is too short to build a SCTP header(");
                sb2.append(12);
                sb2.append(" bytes). data: ");
                sb2.append(ByteArrays.toHexString(bArr, " "));
                sb2.append(", offset: ");
                sb2.append(i10);
                sb2.append(", length: ");
                sb2.append(i11);
                throw new IllegalRawDataException(sb2.toString());
            }
            this.srcPort = SctpPort.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i10 + 0)));
            this.dstPort = SctpPort.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i10 + 2)));
            this.verificationTag = ByteArrays.getInt(bArr, i10 + 4);
            this.checksum = ByteArrays.getInt(bArr, i10 + 8);
            this.chunks = new ArrayList();
            int i12 = i10 + 12;
            int i13 = i11 - 12;
            int i14 = i12;
            while (i13 != 0) {
                try {
                    SctpChunk sctpChunk = (SctpChunk) PacketFactories.getFactory(SctpChunk.class, SctpChunkType.class).newInstance(bArr, i14, i13, SctpChunkType.getInstance(Byte.valueOf(bArr[i14])));
                    this.chunks.add(sctpChunk);
                    int length = sctpChunk.length();
                    i14 += length;
                    i13 -= length;
                } catch (Exception e10) {
                    SctpPacket.logger.error("Exception occurred during analyzing SCTP chunks: ", (Throwable) e10);
                    throw new IllegalRawDataException("Exception occurred during analyzing SCTP chunks", e10);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int calcChecksum() {
            int length = length();
            byte[] bArr = new byte[length];
            System.arraycopy(buildRawData(), 0, bArr, 0, length);
            for (int i10 = 0; i10 < 4; i10++) {
                bArr[i10 + 8] = 0;
            }
            if (PacketPropertiesLoader.getInstance().sctpCalcChecksumByAdler32()) {
                return ByteArrays.calcAdler32Checksum(bArr);
            }
            int calcCrc32cChecksum = ByteArrays.calcCrc32cChecksum(bArr);
            return ((calcCrc32cChecksum & DefaultRenderer.BACKGROUND_COLOR) >>> 24) | (calcCrc32cChecksum << 24) | ((65280 & calcCrc32cChecksum) << 8) | ((16711680 & calcCrc32cChecksum) >> 8);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb2 = new StringBuilder();
            String property = System.getProperty("line.separator");
            sb2.append("[SCTP Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Source port: ");
            sb2.append(getSrcPort());
            sb2.append(property);
            sb2.append("  Destination port: ");
            sb2.append(getDstPort());
            sb2.append(property);
            sb2.append("  Verification tag: 0x");
            sb2.append(ByteArrays.toHexString(this.verificationTag, ""));
            sb2.append(property);
            sb2.append("  Checksum: 0x");
            sb2.append(ByteArrays.toHexString(this.checksum, ""));
            sb2.append(property);
            sb2.append("  Chunks:");
            sb2.append(property);
            for (SctpChunk sctpChunk : this.chunks) {
                sb2.append("    ");
                sb2.append(sctpChunk);
                sb2.append(property);
            }
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return ((((((((527 + this.srcPort.hashCode()) * 31) + this.dstPort.hashCode()) * 31) + this.verificationTag) * 31) + this.checksum) * 31) + this.chunks.hashCode();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            Iterator<SctpChunk> it = this.chunks.iterator();
            int i10 = 12;
            while (true) {
                int i11 = i10;
                if (!it.hasNext()) {
                    return i11;
                }
                i10 = i11 + it.next().length();
            }
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (obj == this) {
                return true;
            }
            if (!SctpHeader.class.isInstance(obj)) {
                return false;
            }
            SctpHeader sctpHeader = (SctpHeader) obj;
            if (this.checksum != sctpHeader.checksum || this.verificationTag != sctpHeader.verificationTag || !this.srcPort.equals(sctpHeader.srcPort) || !this.dstPort.equals(sctpHeader.dstPort) || !this.chunks.equals(sctpHeader.chunks)) {
                z10 = false;
            }
            return z10;
        }

        public int getChecksum() {
            return this.checksum;
        }

        public List<SctpChunk> getChunks() {
            return new ArrayList(this.chunks);
        }

        @Override // org.pcap4j.packet.TransportPacket.TransportHeader
        public SctpPort getDstPort() {
            return this.dstPort;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.srcPort.value().shortValue()));
            arrayList.add(ByteArrays.toByteArray(this.dstPort.value().shortValue()));
            arrayList.add(ByteArrays.toByteArray(this.verificationTag));
            arrayList.add(ByteArrays.toByteArray(this.checksum));
            Iterator<SctpChunk> it = this.chunks.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getRawData());
            }
            return arrayList;
        }

        @Override // org.pcap4j.packet.TransportPacket.TransportHeader
        public SctpPort getSrcPort() {
            return this.srcPort;
        }

        public int getVerificationTag() {
            return this.verificationTag;
        }
    }

    private SctpPacket(Builder builder) {
        if (builder != null && builder.srcPort != null && builder.dstPort != null) {
            this.payload = builder.payloadBuilder != null ? builder.payloadBuilder.build() : null;
            this.header = new SctpHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.srcPort: " + builder.srcPort + " builder.dstPort: " + builder.dstPort);
    }

    private SctpPacket(byte[] bArr, int i10, int i11) {
        this.header = new SctpHeader(bArr, i10, i11);
        this.payload = null;
    }

    public static SctpPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new SctpPacket(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder(this);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public SctpHeader getHeader() {
        return this.header;
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Packet getPayload() {
        return this.payload;
    }

    public boolean hasValidChecksum() {
        return this.header.calcChecksum() == this.header.checksum;
    }
}

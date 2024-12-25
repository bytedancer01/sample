package org.pcap4j.packet;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.IcmpV4InvokingPacketPacket;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV4RedirectPacket.class */
public final class IcmpV4RedirectPacket extends IcmpV4InvokingPacketPacket {
    private static final long serialVersionUID = 5987521162450318499L;
    private final IcmpV4RedirectHeader header;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV4RedirectPacket$Builder.class */
    public static final class Builder extends IcmpV4InvokingPacketPacket.Builder {
        private Inet4Address gatewayInternetAddress;

        public Builder() {
        }

        private Builder(IcmpV4RedirectPacket icmpV4RedirectPacket) {
            super(icmpV4RedirectPacket);
            this.gatewayInternetAddress = icmpV4RedirectPacket.header.gatewayInternetAddress;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public IcmpV4RedirectPacket build() {
            return new IcmpV4RedirectPacket(this);
        }

        public Builder gatewayInternetAddress(Inet4Address inet4Address) {
            this.gatewayInternetAddress = inet4Address;
            return this;
        }

        @Override // org.pcap4j.packet.IcmpV4InvokingPacketPacket.Builder
        public Builder payload(Packet packet) {
            super.payload(packet);
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/IcmpV4RedirectPacket$IcmpV4RedirectHeader.class */
    public static final class IcmpV4RedirectHeader extends AbstractPacket.AbstractHeader {
        private static final int GATEWAY_INTERNET_ADDRESS_OFFSET = 0;
        private static final int GATEWAY_INTERNET_ADDRESS_SIZE = 4;
        private static final int ICMPV4_REDIRECT_HEADER_SIZE = 4;
        private static final long serialVersionUID = -7093717116891501880L;
        private final Inet4Address gatewayInternetAddress;

        private IcmpV4RedirectHeader(Builder builder) {
            this.gatewayInternetAddress = builder.gatewayInternetAddress;
        }

        private IcmpV4RedirectHeader(byte[] bArr, int i10, int i11) {
            if (i11 >= 4) {
                this.gatewayInternetAddress = ByteArrays.getInet4Address(bArr, i10 + 0);
                return;
            }
            StringBuilder sb2 = new StringBuilder(80);
            sb2.append("The data is too short to build an ICMPv4 Redirect Header(");
            sb2.append(4);
            sb2.append(" bytes). data: ");
            sb2.append(ByteArrays.toHexString(bArr, " "));
            sb2.append(", offset: ");
            sb2.append(i10);
            sb2.append(", length: ");
            sb2.append(i11);
            throw new IllegalRawDataException(sb2.toString());
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb2 = new StringBuilder();
            String property = System.getProperty("line.separator");
            sb2.append("[ICMPv4 Redirect Header (");
            sb2.append(length());
            sb2.append(" bytes)]");
            sb2.append(property);
            sb2.append("  Gateway Internet Address: ");
            sb2.append(this.gatewayInternetAddress);
            sb2.append(property);
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return 527 + this.gatewayInternetAddress.hashCode();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (IcmpV4RedirectHeader.class.isInstance(obj)) {
                return this.gatewayInternetAddress.equals(((IcmpV4RedirectHeader) obj).gatewayInternetAddress);
            }
            return false;
        }

        public Inet4Address getGatewayInternetAddress() {
            return this.gatewayInternetAddress;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.gatewayInternetAddress));
            return arrayList;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            return 4;
        }
    }

    private IcmpV4RedirectPacket(Builder builder) {
        super(builder);
        if (builder.gatewayInternetAddress != null) {
            this.header = new IcmpV4RedirectHeader(builder);
            return;
        }
        throw new NullPointerException("builder.gatewayInternetAddress: " + builder.gatewayInternetAddress);
    }

    private IcmpV4RedirectPacket(IcmpV4RedirectHeader icmpV4RedirectHeader) {
        this.header = icmpV4RedirectHeader;
    }

    private IcmpV4RedirectPacket(IcmpV4RedirectHeader icmpV4RedirectHeader, byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11);
        this.header = icmpV4RedirectHeader;
    }

    public static IcmpV4RedirectPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        IcmpV4RedirectHeader icmpV4RedirectHeader = new IcmpV4RedirectHeader(bArr, i10, i11);
        int length = i11 - icmpV4RedirectHeader.length();
        return length > 0 ? new IcmpV4RedirectPacket(icmpV4RedirectHeader, bArr, i10 + icmpV4RedirectHeader.length(), length) : new IcmpV4RedirectPacket(icmpV4RedirectHeader);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public IcmpV4RedirectHeader getHeader() {
        return this.header;
    }

    @Override // org.pcap4j.packet.IcmpV4InvokingPacketPacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public /* bridge */ /* synthetic */ Packet getPayload() {
        return super.getPayload();
    }
}

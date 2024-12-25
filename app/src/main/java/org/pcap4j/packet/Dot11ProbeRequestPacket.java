package org.pcap4j.packet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.Dot11ManagementPacket;
import org.pcap4j.packet.namednumber.Dot11InformationElementId;
import org.pcap4j.util.ByteArrays;
import org.pcap4j.util.MacAddress;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11ProbeRequestPacket.class */
public final class Dot11ProbeRequestPacket extends Dot11ManagementPacket {
    private static final long serialVersionUID = -2305355759191727871L;
    private final Dot11ProbeRequestHeader header;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11ProbeRequestPacket$Builder.class */
    public static final class Builder extends Dot11ManagementPacket.Builder {
        private Dot11ChannelUsageElement channelUsage;
        private Dot11DsssParameterSetElement dsssParameterSet;
        private Dot11ExtendedCapabilitiesElement extendedCapabilities;
        private Dot11ExtendedSupportedRatesElement extendedSupportedRates;
        private Dot11HTCapabilitiesElement htCapabilities;
        private Dot11InterworkingElement interworking;
        private Dot11MeshIdElement meshId;
        private Dot11RequestElement request;
        private Dot11SsidElement ssid;
        private Dot11SsidListElement ssidList;
        private Dot11SupportedOperatingClassesElement supportedOperatingClasses;
        private Dot11SupportedRatesElement supportedRates;
        private Dot112040BssCoexistenceElement twentyFortyBssCoexistence;
        private List<Dot11VendorSpecificElement> vendorSpecificElements;

        public Builder() {
        }

        private Builder(Dot11ProbeRequestPacket dot11ProbeRequestPacket) {
            super(dot11ProbeRequestPacket);
            this.ssid = dot11ProbeRequestPacket.header.ssid;
            this.supportedRates = dot11ProbeRequestPacket.header.supportedRates;
            this.request = dot11ProbeRequestPacket.header.request;
            this.extendedSupportedRates = dot11ProbeRequestPacket.header.extendedSupportedRates;
            this.dsssParameterSet = dot11ProbeRequestPacket.header.dsssParameterSet;
            this.supportedOperatingClasses = dot11ProbeRequestPacket.header.supportedOperatingClasses;
            this.htCapabilities = dot11ProbeRequestPacket.header.htCapabilities;
            this.twentyFortyBssCoexistence = dot11ProbeRequestPacket.header.twentyFortyBssCoexistence;
            this.extendedCapabilities = dot11ProbeRequestPacket.header.extendedCapabilities;
            this.ssidList = dot11ProbeRequestPacket.header.ssidList;
            this.channelUsage = dot11ProbeRequestPacket.header.channelUsage;
            this.interworking = dot11ProbeRequestPacket.header.interworking;
            this.meshId = dot11ProbeRequestPacket.header.meshId;
            this.vendorSpecificElements = dot11ProbeRequestPacket.header.vendorSpecificElements;
        }

        @Override // org.pcap4j.packet.Dot11ManagementPacket.Builder
        public Builder address1(MacAddress macAddress) {
            super.address1(macAddress);
            return this;
        }

        @Override // org.pcap4j.packet.Dot11ManagementPacket.Builder
        public Builder address2(MacAddress macAddress) {
            super.address2(macAddress);
            return this;
        }

        @Override // org.pcap4j.packet.Dot11ManagementPacket.Builder
        public Builder address3(MacAddress macAddress) {
            super.address3(macAddress);
            return this;
        }

        @Override // org.pcap4j.packet.Dot11ManagementPacket.Builder, org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Dot11ManagementPacket build() {
            checkForNull();
            return Dot11ProbeRequestPacket.newPacket(this);
        }

        public Builder channelUsage(Dot11ChannelUsageElement dot11ChannelUsageElement) {
            this.channelUsage = dot11ChannelUsageElement;
            return this;
        }

        @Override // org.pcap4j.packet.Dot11ManagementPacket.Builder, org.pcap4j.packet.ChecksumBuilder
        public ChecksumBuilder<Dot11ManagementPacket> correctChecksumAtBuild(boolean z10) {
            super.correctChecksumAtBuild(z10);
            return this;
        }

        public Builder dsssParameterSet(Dot11DsssParameterSetElement dot11DsssParameterSetElement) {
            this.dsssParameterSet = dot11DsssParameterSetElement;
            return this;
        }

        @Override // org.pcap4j.packet.Dot11ManagementPacket.Builder
        public Builder duration(short s10) {
            super.duration(s10);
            return this;
        }

        public Builder extendedCapabilities(Dot11ExtendedCapabilitiesElement dot11ExtendedCapabilitiesElement) {
            this.extendedCapabilities = dot11ExtendedCapabilitiesElement;
            return this;
        }

        public Builder extendedSupportedRates(Dot11ExtendedSupportedRatesElement dot11ExtendedSupportedRatesElement) {
            this.extendedSupportedRates = dot11ExtendedSupportedRatesElement;
            return this;
        }

        @Override // org.pcap4j.packet.Dot11ManagementPacket.Builder
        public Builder fcs(Integer num) {
            super.fcs(num);
            return this;
        }

        @Override // org.pcap4j.packet.Dot11ManagementPacket.Builder
        public Builder frameControl(Dot11FrameControl dot11FrameControl) {
            super.frameControl(dot11FrameControl);
            return this;
        }

        public Builder htCapabilities(Dot11HTCapabilitiesElement dot11HTCapabilitiesElement) {
            this.htCapabilities = dot11HTCapabilitiesElement;
            return this;
        }

        @Override // org.pcap4j.packet.Dot11ManagementPacket.Builder
        public Builder htControl(Dot11HtControl dot11HtControl) {
            super.htControl(dot11HtControl);
            return this;
        }

        public Builder interworking(Dot11InterworkingElement dot11InterworkingElement) {
            this.interworking = dot11InterworkingElement;
            return this;
        }

        public Builder meshId(Dot11MeshIdElement dot11MeshIdElement) {
            this.meshId = dot11MeshIdElement;
            return this;
        }

        public Builder request(Dot11RequestElement dot11RequestElement) {
            this.request = dot11RequestElement;
            return this;
        }

        @Override // org.pcap4j.packet.Dot11ManagementPacket.Builder
        public Builder sequenceControl(Dot11SequenceControl dot11SequenceControl) {
            super.sequenceControl(dot11SequenceControl);
            return this;
        }

        public Builder ssid(Dot11SsidElement dot11SsidElement) {
            this.ssid = dot11SsidElement;
            return this;
        }

        public Builder ssidList(Dot11SsidListElement dot11SsidListElement) {
            this.ssidList = dot11SsidListElement;
            return this;
        }

        public Builder supportedOperatingClasses(Dot11SupportedOperatingClassesElement dot11SupportedOperatingClassesElement) {
            this.supportedOperatingClasses = dot11SupportedOperatingClassesElement;
            return this;
        }

        public Builder supportedRates(Dot11SupportedRatesElement dot11SupportedRatesElement) {
            this.supportedRates = dot11SupportedRatesElement;
            return this;
        }

        public Builder twentyFortyBssCoexistence(Dot112040BssCoexistenceElement dot112040BssCoexistenceElement) {
            this.twentyFortyBssCoexistence = dot112040BssCoexistenceElement;
            return this;
        }

        public Builder vendorSpecificElements(List<Dot11VendorSpecificElement> list) {
            this.vendorSpecificElements = list;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11ProbeRequestPacket$Dot11ProbeRequestHeader.class */
    public static final class Dot11ProbeRequestHeader extends Dot11ManagementPacket.Dot11ManagementHeader {
        private static final long serialVersionUID = -2203820242563461514L;
        private final Dot11ChannelUsageElement channelUsage;
        private final Dot11DsssParameterSetElement dsssParameterSet;
        private final Dot11ExtendedCapabilitiesElement extendedCapabilities;
        private final Dot11ExtendedSupportedRatesElement extendedSupportedRates;
        private final Dot11HTCapabilitiesElement htCapabilities;
        private final Dot11InterworkingElement interworking;
        private final Dot11MeshIdElement meshId;
        private final Dot11RequestElement request;
        private final Dot11SsidElement ssid;
        private final Dot11SsidListElement ssidList;
        private final Dot11SupportedOperatingClassesElement supportedOperatingClasses;
        private final Dot11SupportedRatesElement supportedRates;
        private final Dot112040BssCoexistenceElement twentyFortyBssCoexistence;
        private final List<Dot11VendorSpecificElement> vendorSpecificElements;

        private Dot11ProbeRequestHeader(Builder builder) {
            super(builder);
            this.ssid = builder.ssid;
            this.supportedRates = builder.supportedRates;
            this.request = builder.request;
            this.extendedSupportedRates = builder.extendedSupportedRates;
            this.dsssParameterSet = builder.dsssParameterSet;
            this.supportedOperatingClasses = builder.supportedOperatingClasses;
            this.htCapabilities = builder.htCapabilities;
            this.twentyFortyBssCoexistence = builder.twentyFortyBssCoexistence;
            this.extendedCapabilities = builder.extendedCapabilities;
            this.ssidList = builder.ssidList;
            this.channelUsage = builder.channelUsage;
            this.interworking = builder.interworking;
            this.meshId = builder.meshId;
            if (builder.vendorSpecificElements == null) {
                this.vendorSpecificElements = Collections.emptyList();
            } else {
                this.vendorSpecificElements = new ArrayList(builder.vendorSpecificElements);
            }
        }

        private Dot11ProbeRequestHeader(byte[] bArr, int i10, int i11) {
            super(bArr, i10, i11);
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int calcLength = super.calcLength();
            int i22 = i10 + calcLength;
            int i23 = i11 - calcLength;
            if (i23 <= 0 || bArr[i22] != Dot11InformationElementId.SSID.value().byteValue()) {
                this.ssid = null;
                i12 = i22;
            } else {
                Dot11SsidElement newInstance = Dot11SsidElement.newInstance(bArr, i22, i23);
                this.ssid = newInstance;
                int length = newInstance.length();
                i12 = i22 + length;
                i23 -= length;
            }
            if (i23 <= 0 || bArr[i12] != Dot11InformationElementId.SUPPORTED_RATES.value().byteValue()) {
                this.supportedRates = null;
            } else {
                Dot11SupportedRatesElement newInstance2 = Dot11SupportedRatesElement.newInstance(bArr, i12, i23);
                this.supportedRates = newInstance2;
                int length2 = newInstance2.length();
                i12 += length2;
                i23 -= length2;
            }
            if (i23 <= 0 || bArr[i12] != Dot11InformationElementId.REQUEST.value().byteValue()) {
                this.request = null;
            } else {
                Dot11RequestElement newInstance3 = Dot11RequestElement.newInstance(bArr, i12, i23);
                this.request = newInstance3;
                int length3 = newInstance3.length();
                i12 += length3;
                i23 -= length3;
            }
            if (i23 <= 0 || bArr[i12] != Dot11InformationElementId.EXTENDED_SUPPORTED_RATES.value().byteValue()) {
                this.extendedSupportedRates = null;
                i13 = i12;
            } else {
                Dot11ExtendedSupportedRatesElement newInstance4 = Dot11ExtendedSupportedRatesElement.newInstance(bArr, i12, i23);
                this.extendedSupportedRates = newInstance4;
                int length4 = newInstance4.length();
                i13 = i12 + length4;
                i23 -= length4;
            }
            if (i23 <= 0 || bArr[i13] != Dot11InformationElementId.DSSS_PARAMETER_SET.value().byteValue()) {
                this.dsssParameterSet = null;
                i14 = i23;
                i15 = i13;
            } else {
                Dot11DsssParameterSetElement newInstance5 = Dot11DsssParameterSetElement.newInstance(bArr, i13, i23);
                this.dsssParameterSet = newInstance5;
                int length5 = newInstance5.length();
                int i24 = i13 + length5;
                int i25 = i23 - length5;
                i15 = i24;
                i14 = i25;
            }
            if (i14 <= 0 || bArr[i15] != Dot11InformationElementId.SUPPORTED_OPERATING_CLASSES.value().byteValue()) {
                this.supportedOperatingClasses = null;
                i16 = i14;
                i17 = i15;
            } else {
                Dot11SupportedOperatingClassesElement newInstance6 = Dot11SupportedOperatingClassesElement.newInstance(bArr, i15, i14);
                this.supportedOperatingClasses = newInstance6;
                int length6 = newInstance6.length();
                i16 = i14 - length6;
                i17 = i15 + length6;
            }
            if (i16 <= 0 || bArr[i17] != Dot11InformationElementId.HT_CAPABILITIES.value().byteValue()) {
                this.htCapabilities = null;
                i18 = i16;
            } else {
                Dot11HTCapabilitiesElement newInstance7 = Dot11HTCapabilitiesElement.newInstance(bArr, i17, i16);
                this.htCapabilities = newInstance7;
                int length7 = newInstance7.length();
                i17 += length7;
                i18 = i16 - length7;
            }
            if (i18 <= 0 || bArr[i17] != Dot11InformationElementId.IE_20_40_BSS_COEXISTENCE.value().byteValue()) {
                this.twentyFortyBssCoexistence = null;
            } else {
                Dot112040BssCoexistenceElement newInstance8 = Dot112040BssCoexistenceElement.newInstance(bArr, i17, i18);
                this.twentyFortyBssCoexistence = newInstance8;
                int length8 = newInstance8.length();
                i17 += length8;
                i18 -= length8;
            }
            if (i18 <= 0 || bArr[i17] != Dot11InformationElementId.EXTENDED_CAPABILITIES.value().byteValue()) {
                this.extendedCapabilities = null;
            } else {
                Dot11ExtendedCapabilitiesElement newInstance9 = Dot11ExtendedCapabilitiesElement.newInstance(bArr, i17, i18);
                this.extendedCapabilities = newInstance9;
                int length9 = newInstance9.length();
                i17 += length9;
                i18 -= length9;
            }
            if (i18 <= 0 || bArr[i17] != Dot11InformationElementId.SSID_LIST.value().byteValue()) {
                this.ssidList = null;
                i19 = i18;
                i20 = i17;
            } else {
                Dot11SsidListElement newInstance10 = Dot11SsidListElement.newInstance(bArr, i17, i18);
                this.ssidList = newInstance10;
                int length10 = newInstance10.length();
                i19 = i18 - length10;
                i20 = i17 + length10;
            }
            if (i19 <= 0 || bArr[i20] != Dot11InformationElementId.CHANNEL_USAGE.value().byteValue()) {
                this.channelUsage = null;
                i21 = i19;
            } else {
                Dot11ChannelUsageElement newInstance11 = Dot11ChannelUsageElement.newInstance(bArr, i20, i19);
                this.channelUsage = newInstance11;
                int length11 = newInstance11.length();
                i20 += length11;
                i21 = i19 - length11;
            }
            if (i21 <= 0 || bArr[i20] != Dot11InformationElementId.INTERWORKING.value().byteValue()) {
                this.interworking = null;
            } else {
                Dot11InterworkingElement newInstance12 = Dot11InterworkingElement.newInstance(bArr, i20, i21);
                this.interworking = newInstance12;
                int length12 = newInstance12.length();
                i20 += length12;
                i21 -= length12;
            }
            if (i21 <= 0 || bArr[i20] != Dot11InformationElementId.MESH_ID.value().byteValue()) {
                this.meshId = null;
            } else {
                Dot11MeshIdElement newInstance13 = Dot11MeshIdElement.newInstance(bArr, i20, i21);
                this.meshId = newInstance13;
                int length13 = newInstance13.length();
                i20 += length13;
                i21 -= length13;
            }
            this.vendorSpecificElements = new ArrayList();
            while (i21 > 0 && bArr[i20] == Dot11InformationElementId.VENDOR_SPECIFIC.value().byteValue()) {
                Dot11VendorSpecificElement newInstance14 = Dot11VendorSpecificElement.newInstance(bArr, i20, i21);
                this.vendorSpecificElements.add(newInstance14);
                int length14 = newInstance14.length();
                i20 += length14;
                i21 -= length14;
            }
        }

        @Override // org.pcap4j.packet.Dot11ManagementPacket.Dot11ManagementHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb2 = new StringBuilder();
            String property = System.getProperty("line.separator");
            sb2.append(super.buildString());
            sb2.append("  Tags:");
            sb2.append(property);
            Dot11SsidElement dot11SsidElement = this.ssid;
            if (dot11SsidElement != null) {
                sb2.append(dot11SsidElement.toString("    "));
            }
            Dot11SupportedRatesElement dot11SupportedRatesElement = this.supportedRates;
            if (dot11SupportedRatesElement != null) {
                sb2.append(dot11SupportedRatesElement.toString("    "));
            }
            Dot11RequestElement dot11RequestElement = this.request;
            if (dot11RequestElement != null) {
                sb2.append(dot11RequestElement.toString("    "));
            }
            Dot11ExtendedSupportedRatesElement dot11ExtendedSupportedRatesElement = this.extendedSupportedRates;
            if (dot11ExtendedSupportedRatesElement != null) {
                sb2.append(dot11ExtendedSupportedRatesElement.toString("    "));
            }
            Dot11DsssParameterSetElement dot11DsssParameterSetElement = this.dsssParameterSet;
            if (dot11DsssParameterSetElement != null) {
                sb2.append(dot11DsssParameterSetElement.toString("    "));
            }
            Dot11SupportedOperatingClassesElement dot11SupportedOperatingClassesElement = this.supportedOperatingClasses;
            if (dot11SupportedOperatingClassesElement != null) {
                sb2.append(dot11SupportedOperatingClassesElement.toString("    "));
            }
            Dot11HTCapabilitiesElement dot11HTCapabilitiesElement = this.htCapabilities;
            if (dot11HTCapabilitiesElement != null) {
                sb2.append(dot11HTCapabilitiesElement.toString("    "));
            }
            Dot112040BssCoexistenceElement dot112040BssCoexistenceElement = this.twentyFortyBssCoexistence;
            if (dot112040BssCoexistenceElement != null) {
                sb2.append(dot112040BssCoexistenceElement.toString("    "));
            }
            Dot11ExtendedCapabilitiesElement dot11ExtendedCapabilitiesElement = this.extendedCapabilities;
            if (dot11ExtendedCapabilitiesElement != null) {
                sb2.append(dot11ExtendedCapabilitiesElement.toString("    "));
            }
            Dot11SsidListElement dot11SsidListElement = this.ssidList;
            if (dot11SsidListElement != null) {
                sb2.append(dot11SsidListElement.toString("    "));
            }
            Dot11ChannelUsageElement dot11ChannelUsageElement = this.channelUsage;
            if (dot11ChannelUsageElement != null) {
                sb2.append(dot11ChannelUsageElement.toString("    "));
            }
            Dot11InterworkingElement dot11InterworkingElement = this.interworking;
            if (dot11InterworkingElement != null) {
                sb2.append(dot11InterworkingElement.toString("    "));
            }
            Dot11MeshIdElement dot11MeshIdElement = this.meshId;
            if (dot11MeshIdElement != null) {
                sb2.append(dot11MeshIdElement.toString("    "));
            }
            Iterator<Dot11VendorSpecificElement> it = this.vendorSpecificElements.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().toString("    "));
            }
            return sb2.toString();
        }

        @Override // org.pcap4j.packet.Dot11ManagementPacket.Dot11ManagementHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            int calcHashCode = super.calcHashCode();
            Dot11ChannelUsageElement dot11ChannelUsageElement = this.channelUsage;
            int i10 = 0;
            int hashCode = dot11ChannelUsageElement == null ? 0 : dot11ChannelUsageElement.hashCode();
            Dot11DsssParameterSetElement dot11DsssParameterSetElement = this.dsssParameterSet;
            int hashCode2 = dot11DsssParameterSetElement == null ? 0 : dot11DsssParameterSetElement.hashCode();
            Dot11ExtendedCapabilitiesElement dot11ExtendedCapabilitiesElement = this.extendedCapabilities;
            int hashCode3 = dot11ExtendedCapabilitiesElement == null ? 0 : dot11ExtendedCapabilitiesElement.hashCode();
            Dot11ExtendedSupportedRatesElement dot11ExtendedSupportedRatesElement = this.extendedSupportedRates;
            int hashCode4 = dot11ExtendedSupportedRatesElement == null ? 0 : dot11ExtendedSupportedRatesElement.hashCode();
            Dot11HTCapabilitiesElement dot11HTCapabilitiesElement = this.htCapabilities;
            int hashCode5 = dot11HTCapabilitiesElement == null ? 0 : dot11HTCapabilitiesElement.hashCode();
            Dot11InterworkingElement dot11InterworkingElement = this.interworking;
            int hashCode6 = dot11InterworkingElement == null ? 0 : dot11InterworkingElement.hashCode();
            Dot11MeshIdElement dot11MeshIdElement = this.meshId;
            int hashCode7 = dot11MeshIdElement == null ? 0 : dot11MeshIdElement.hashCode();
            Dot11RequestElement dot11RequestElement = this.request;
            int hashCode8 = dot11RequestElement == null ? 0 : dot11RequestElement.hashCode();
            Dot11SsidElement dot11SsidElement = this.ssid;
            int hashCode9 = dot11SsidElement == null ? 0 : dot11SsidElement.hashCode();
            Dot11SsidListElement dot11SsidListElement = this.ssidList;
            int hashCode10 = dot11SsidListElement == null ? 0 : dot11SsidListElement.hashCode();
            Dot11SupportedOperatingClassesElement dot11SupportedOperatingClassesElement = this.supportedOperatingClasses;
            int hashCode11 = dot11SupportedOperatingClassesElement == null ? 0 : dot11SupportedOperatingClassesElement.hashCode();
            Dot11SupportedRatesElement dot11SupportedRatesElement = this.supportedRates;
            int hashCode12 = dot11SupportedRatesElement == null ? 0 : dot11SupportedRatesElement.hashCode();
            Dot112040BssCoexistenceElement dot112040BssCoexistenceElement = this.twentyFortyBssCoexistence;
            if (dot112040BssCoexistenceElement != null) {
                i10 = dot112040BssCoexistenceElement.hashCode();
            }
            return (((((((((((((((((((((((((((calcHashCode * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + i10) * 31) + this.vendorSpecificElements.hashCode();
        }

        @Override // org.pcap4j.packet.Dot11ManagementPacket.Dot11ManagementHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            int calcLength = super.calcLength();
            Dot11SsidElement dot11SsidElement = this.ssid;
            int i10 = calcLength;
            if (dot11SsidElement != null) {
                i10 = calcLength + dot11SsidElement.length();
            }
            Dot11SupportedRatesElement dot11SupportedRatesElement = this.supportedRates;
            int i11 = i10;
            if (dot11SupportedRatesElement != null) {
                i11 = i10 + dot11SupportedRatesElement.length();
            }
            Dot11RequestElement dot11RequestElement = this.request;
            int i12 = i11;
            if (dot11RequestElement != null) {
                i12 = i11 + dot11RequestElement.length();
            }
            Dot11ExtendedSupportedRatesElement dot11ExtendedSupportedRatesElement = this.extendedSupportedRates;
            int i13 = i12;
            if (dot11ExtendedSupportedRatesElement != null) {
                i13 = i12 + dot11ExtendedSupportedRatesElement.length();
            }
            Dot11DsssParameterSetElement dot11DsssParameterSetElement = this.dsssParameterSet;
            int i14 = i13;
            if (dot11DsssParameterSetElement != null) {
                i14 = i13 + dot11DsssParameterSetElement.length();
            }
            Dot11SupportedOperatingClassesElement dot11SupportedOperatingClassesElement = this.supportedOperatingClasses;
            int i15 = i14;
            if (dot11SupportedOperatingClassesElement != null) {
                i15 = i14 + dot11SupportedOperatingClassesElement.length();
            }
            Dot11HTCapabilitiesElement dot11HTCapabilitiesElement = this.htCapabilities;
            int i16 = i15;
            if (dot11HTCapabilitiesElement != null) {
                i16 = i15 + dot11HTCapabilitiesElement.length();
            }
            Dot112040BssCoexistenceElement dot112040BssCoexistenceElement = this.twentyFortyBssCoexistence;
            int i17 = i16;
            if (dot112040BssCoexistenceElement != null) {
                i17 = i16 + dot112040BssCoexistenceElement.length();
            }
            Dot11ExtendedCapabilitiesElement dot11ExtendedCapabilitiesElement = this.extendedCapabilities;
            int i18 = i17;
            if (dot11ExtendedCapabilitiesElement != null) {
                i18 = i17 + dot11ExtendedCapabilitiesElement.length();
            }
            Dot11SsidListElement dot11SsidListElement = this.ssidList;
            int i19 = i18;
            if (dot11SsidListElement != null) {
                i19 = i18 + dot11SsidListElement.length();
            }
            Dot11ChannelUsageElement dot11ChannelUsageElement = this.channelUsage;
            int i20 = i19;
            if (dot11ChannelUsageElement != null) {
                i20 = i19 + dot11ChannelUsageElement.length();
            }
            Dot11InterworkingElement dot11InterworkingElement = this.interworking;
            int i21 = i20;
            if (dot11InterworkingElement != null) {
                i21 = i20 + dot11InterworkingElement.length();
            }
            Dot11MeshIdElement dot11MeshIdElement = this.meshId;
            int i22 = i21;
            if (dot11MeshIdElement != null) {
                i22 = i21 + dot11MeshIdElement.length();
            }
            Iterator<Dot11VendorSpecificElement> it = this.vendorSpecificElements.iterator();
            while (it.hasNext()) {
                i22 += it.next().length();
            }
            return i22;
        }

        @Override // org.pcap4j.packet.Dot11ManagementPacket.Dot11ManagementHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            Dot11ProbeRequestHeader dot11ProbeRequestHeader = (Dot11ProbeRequestHeader) obj;
            Dot11ChannelUsageElement dot11ChannelUsageElement = this.channelUsage;
            if (dot11ChannelUsageElement == null) {
                if (dot11ProbeRequestHeader.channelUsage != null) {
                    return false;
                }
            } else if (!dot11ChannelUsageElement.equals(dot11ProbeRequestHeader.channelUsage)) {
                return false;
            }
            Dot11DsssParameterSetElement dot11DsssParameterSetElement = this.dsssParameterSet;
            if (dot11DsssParameterSetElement == null) {
                if (dot11ProbeRequestHeader.dsssParameterSet != null) {
                    return false;
                }
            } else if (!dot11DsssParameterSetElement.equals(dot11ProbeRequestHeader.dsssParameterSet)) {
                return false;
            }
            Dot11ExtendedCapabilitiesElement dot11ExtendedCapabilitiesElement = this.extendedCapabilities;
            if (dot11ExtendedCapabilitiesElement == null) {
                if (dot11ProbeRequestHeader.extendedCapabilities != null) {
                    return false;
                }
            } else if (!dot11ExtendedCapabilitiesElement.equals(dot11ProbeRequestHeader.extendedCapabilities)) {
                return false;
            }
            Dot11ExtendedSupportedRatesElement dot11ExtendedSupportedRatesElement = this.extendedSupportedRates;
            if (dot11ExtendedSupportedRatesElement == null) {
                if (dot11ProbeRequestHeader.extendedSupportedRates != null) {
                    return false;
                }
            } else if (!dot11ExtendedSupportedRatesElement.equals(dot11ProbeRequestHeader.extendedSupportedRates)) {
                return false;
            }
            Dot11HTCapabilitiesElement dot11HTCapabilitiesElement = this.htCapabilities;
            if (dot11HTCapabilitiesElement == null) {
                if (dot11ProbeRequestHeader.htCapabilities != null) {
                    return false;
                }
            } else if (!dot11HTCapabilitiesElement.equals(dot11ProbeRequestHeader.htCapabilities)) {
                return false;
            }
            Dot11InterworkingElement dot11InterworkingElement = this.interworking;
            if (dot11InterworkingElement == null) {
                if (dot11ProbeRequestHeader.interworking != null) {
                    return false;
                }
            } else if (!dot11InterworkingElement.equals(dot11ProbeRequestHeader.interworking)) {
                return false;
            }
            Dot11MeshIdElement dot11MeshIdElement = this.meshId;
            if (dot11MeshIdElement == null) {
                if (dot11ProbeRequestHeader.meshId != null) {
                    return false;
                }
            } else if (!dot11MeshIdElement.equals(dot11ProbeRequestHeader.meshId)) {
                return false;
            }
            Dot11RequestElement dot11RequestElement = this.request;
            if (dot11RequestElement == null) {
                if (dot11ProbeRequestHeader.request != null) {
                    return false;
                }
            } else if (!dot11RequestElement.equals(dot11ProbeRequestHeader.request)) {
                return false;
            }
            Dot11SsidElement dot11SsidElement = this.ssid;
            if (dot11SsidElement == null) {
                if (dot11ProbeRequestHeader.ssid != null) {
                    return false;
                }
            } else if (!dot11SsidElement.equals(dot11ProbeRequestHeader.ssid)) {
                return false;
            }
            Dot11SsidListElement dot11SsidListElement = this.ssidList;
            if (dot11SsidListElement == null) {
                if (dot11ProbeRequestHeader.ssidList != null) {
                    return false;
                }
            } else if (!dot11SsidListElement.equals(dot11ProbeRequestHeader.ssidList)) {
                return false;
            }
            Dot11SupportedOperatingClassesElement dot11SupportedOperatingClassesElement = this.supportedOperatingClasses;
            if (dot11SupportedOperatingClassesElement == null) {
                if (dot11ProbeRequestHeader.supportedOperatingClasses != null) {
                    return false;
                }
            } else if (!dot11SupportedOperatingClassesElement.equals(dot11ProbeRequestHeader.supportedOperatingClasses)) {
                return false;
            }
            Dot11SupportedRatesElement dot11SupportedRatesElement = this.supportedRates;
            if (dot11SupportedRatesElement == null) {
                if (dot11ProbeRequestHeader.supportedRates != null) {
                    return false;
                }
            } else if (!dot11SupportedRatesElement.equals(dot11ProbeRequestHeader.supportedRates)) {
                return false;
            }
            Dot112040BssCoexistenceElement dot112040BssCoexistenceElement = this.twentyFortyBssCoexistence;
            if (dot112040BssCoexistenceElement == null) {
                if (dot11ProbeRequestHeader.twentyFortyBssCoexistence != null) {
                    return false;
                }
            } else if (!dot112040BssCoexistenceElement.equals(dot11ProbeRequestHeader.twentyFortyBssCoexistence)) {
                return false;
            }
            return this.vendorSpecificElements.equals(dot11ProbeRequestHeader.vendorSpecificElements);
        }

        public Dot112040BssCoexistenceElement get2040BssCoexistence() {
            return this.twentyFortyBssCoexistence;
        }

        public Dot11ChannelUsageElement getChannelUsage() {
            return this.channelUsage;
        }

        public Dot11DsssParameterSetElement getDsssParameterSet() {
            return this.dsssParameterSet;
        }

        public Dot11ExtendedCapabilitiesElement getExtendedCapabilities() {
            return this.extendedCapabilities;
        }

        public Dot11ExtendedSupportedRatesElement getExtendedSupportedRates() {
            return this.extendedSupportedRates;
        }

        @Override // org.pcap4j.packet.Dot11ManagementPacket.Dot11ManagementHeader
        public String getHeaderName() {
            return "IEEE802.11 Probe Request header";
        }

        public Dot11HTCapabilitiesElement getHtCapabilities() {
            return this.htCapabilities;
        }

        public Dot11InterworkingElement getInterworking() {
            return this.interworking;
        }

        public Dot11MeshIdElement getMeshId() {
            return this.meshId;
        }

        @Override // org.pcap4j.packet.Dot11ManagementPacket.Dot11ManagementHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            List<byte[]> rawFields = super.getRawFields();
            Dot11SsidElement dot11SsidElement = this.ssid;
            if (dot11SsidElement != null) {
                rawFields.add(dot11SsidElement.getRawData());
            }
            Dot11SupportedRatesElement dot11SupportedRatesElement = this.supportedRates;
            if (dot11SupportedRatesElement != null) {
                rawFields.add(dot11SupportedRatesElement.getRawData());
            }
            Dot11RequestElement dot11RequestElement = this.request;
            if (dot11RequestElement != null) {
                rawFields.add(dot11RequestElement.getRawData());
            }
            Dot11ExtendedSupportedRatesElement dot11ExtendedSupportedRatesElement = this.extendedSupportedRates;
            if (dot11ExtendedSupportedRatesElement != null) {
                rawFields.add(dot11ExtendedSupportedRatesElement.getRawData());
            }
            Dot11DsssParameterSetElement dot11DsssParameterSetElement = this.dsssParameterSet;
            if (dot11DsssParameterSetElement != null) {
                rawFields.add(dot11DsssParameterSetElement.getRawData());
            }
            Dot11SupportedOperatingClassesElement dot11SupportedOperatingClassesElement = this.supportedOperatingClasses;
            if (dot11SupportedOperatingClassesElement != null) {
                rawFields.add(dot11SupportedOperatingClassesElement.getRawData());
            }
            Dot11HTCapabilitiesElement dot11HTCapabilitiesElement = this.htCapabilities;
            if (dot11HTCapabilitiesElement != null) {
                rawFields.add(dot11HTCapabilitiesElement.getRawData());
            }
            Dot112040BssCoexistenceElement dot112040BssCoexistenceElement = this.twentyFortyBssCoexistence;
            if (dot112040BssCoexistenceElement != null) {
                rawFields.add(dot112040BssCoexistenceElement.getRawData());
            }
            Dot11ExtendedCapabilitiesElement dot11ExtendedCapabilitiesElement = this.extendedCapabilities;
            if (dot11ExtendedCapabilitiesElement != null) {
                rawFields.add(dot11ExtendedCapabilitiesElement.getRawData());
            }
            Dot11SsidListElement dot11SsidListElement = this.ssidList;
            if (dot11SsidListElement != null) {
                rawFields.add(dot11SsidListElement.getRawData());
            }
            Dot11ChannelUsageElement dot11ChannelUsageElement = this.channelUsage;
            if (dot11ChannelUsageElement != null) {
                rawFields.add(dot11ChannelUsageElement.getRawData());
            }
            Dot11InterworkingElement dot11InterworkingElement = this.interworking;
            if (dot11InterworkingElement != null) {
                rawFields.add(dot11InterworkingElement.getRawData());
            }
            Dot11MeshIdElement dot11MeshIdElement = this.meshId;
            if (dot11MeshIdElement != null) {
                rawFields.add(dot11MeshIdElement.getRawData());
            }
            Iterator<Dot11VendorSpecificElement> it = this.vendorSpecificElements.iterator();
            while (it.hasNext()) {
                rawFields.add(it.next().getRawData());
            }
            return rawFields;
        }

        public Dot11RequestElement getRequest() {
            return this.request;
        }

        public Dot11SsidElement getSsid() {
            return this.ssid;
        }

        public Dot11SsidListElement getSsidList() {
            return this.ssidList;
        }

        public Dot11SupportedOperatingClassesElement getSupportedOperatingClasses() {
            return this.supportedOperatingClasses;
        }

        public Dot11SupportedRatesElement getSupportedRates() {
            return this.supportedRates;
        }

        public List<Dot11VendorSpecificElement> getVendorSpecificElements() {
            return new ArrayList(this.vendorSpecificElements);
        }
    }

    private Dot11ProbeRequestPacket(Builder builder, Dot11ProbeRequestHeader dot11ProbeRequestHeader) {
        super(builder, dot11ProbeRequestHeader);
        this.header = dot11ProbeRequestHeader;
    }

    private Dot11ProbeRequestPacket(byte[] bArr, int i10, int i11, Dot11ProbeRequestHeader dot11ProbeRequestHeader) {
        super(bArr, i10, i11, dot11ProbeRequestHeader.length());
        this.header = dot11ProbeRequestHeader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Dot11ProbeRequestPacket newPacket(Builder builder) {
        return new Dot11ProbeRequestPacket(builder, new Dot11ProbeRequestHeader(builder));
    }

    public static Dot11ProbeRequestPacket newPacket(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new Dot11ProbeRequestPacket(bArr, i10, i11, new Dot11ProbeRequestHeader(bArr, i10, i11));
    }

    @Override // org.pcap4j.packet.Dot11ManagementPacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.Dot11ManagementPacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Dot11ProbeRequestHeader getHeader() {
        return this.header;
    }
}

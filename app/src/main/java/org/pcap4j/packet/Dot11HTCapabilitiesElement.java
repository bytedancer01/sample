package org.pcap4j.packet;

import java.nio.ByteOrder;
import java.util.Arrays;
import org.apache.commons.net.bsd.RCommandClient;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.pcap4j.packet.Dot11InformationElement;
import org.pcap4j.packet.namednumber.Dot11InformationElementId;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11HTCapabilitiesElement.class */
public final class Dot11HTCapabilitiesElement extends Dot11InformationElement {
    private static final long serialVersionUID = -5174208022820530840L;
    private final boolean antennaIndicesFeedbackBasedTxAselSupported;
    private final boolean antennaIndicesFeedbackSupported;
    private final boolean antennaSelectionSupported;
    private final boolean bit101OfSupportedMcsSet;
    private final boolean bit102OfSupportedMcsSet;
    private final boolean bit103OfSupportedMcsSet;
    private final boolean bit104OfSupportedMcsSet;
    private final boolean bit105OfSupportedMcsSet;
    private final boolean bit106OfSupportedMcsSet;
    private final boolean bit107OfSupportedMcsSet;
    private final boolean bit108OfSupportedMcsSet;
    private final boolean bit109OfSupportedMcsSet;
    private final boolean bit110OfSupportedMcsSet;
    private final boolean bit111OfSupportedMcsSet;
    private final boolean bit112OfSupportedMcsSet;
    private final boolean bit113OfSupportedMcsSet;
    private final boolean bit114OfSupportedMcsSet;
    private final boolean bit115OfSupportedMcsSet;
    private final boolean bit116OfSupportedMcsSet;
    private final boolean bit117OfSupportedMcsSet;
    private final boolean bit118OfSupportedMcsSet;
    private final boolean bit119OfSupportedMcsSet;
    private final boolean bit120OfSupportedMcsSet;
    private final boolean bit121OfSupportedMcsSet;
    private final boolean bit122OfSupportedMcsSet;
    private final boolean bit123OfSupportedMcsSet;
    private final boolean bit124OfSupportedMcsSet;
    private final boolean bit125OfSupportedMcsSet;
    private final boolean bit126OfSupportedMcsSet;
    private final boolean bit127OfSupportedMcsSet;
    private final boolean bit12OfHtExtendedCapabilities;
    private final boolean bit13OfHtCapabilitiesInfo;
    private final boolean bit13OfHtExtendedCapabilities;
    private final boolean bit14OfHtExtendedCapabilities;
    private final boolean bit15OfHtExtendedCapabilities;
    private final boolean bit29OfTransmitBeamformingCapabilities;
    private final boolean bit30OfTransmitBeamformingCapabilities;
    private final boolean bit31OfTransmitBeamformingCapabilities;
    private final boolean bit3OfHtExtendedCapabilities;
    private final boolean bit4OfHtExtendedCapabilities;
    private final boolean bit5OfAMpduParameters;
    private final boolean bit5OfHtExtendedCapabilities;
    private final boolean bit6OfAMpduParameters;
    private final boolean bit6OfHtExtendedCapabilities;
    private final boolean bit77OfSupportedMcsSet;
    private final boolean bit78OfSupportedMcsSet;
    private final boolean bit79OfSupportedMcsSet;
    private final boolean bit7OfAMpduParameters;
    private final boolean bit7OfAselCapability;
    private final boolean bit7OfHtExtendedCapabilities;
    private final boolean bit90OfSupportedMcsSet;
    private final boolean bit91OfSupportedMcsSet;
    private final boolean bit92OfSupportedMcsSet;
    private final boolean bit93OfSupportedMcsSet;
    private final boolean bit94OfSupportedMcsSet;
    private final boolean bit95OfSupportedMcsSet;
    private final boolean both20and40MhzSupported;
    private final Calibration calibration;
    private final ChannelEstimationCapability channelEstimationCapability;
    private final NumBeamformerAntennas compressedSteeringNumBeamformerAntennasSupported;
    private final CsiNumRows csiMaxNumRowsBeamformerSupported;
    private final NumBeamformerAntennas csiNumBeamformerAntennasSupported;
    private final boolean dsssCckModeIn40MhzSupported;
    private final BeamformingFeedbackCapability explicitCompressedBeamformingFeedbackCapability;
    private final boolean explicitCompressedSteeringSupported;
    private final boolean explicitCsiFeedbackBasedTxAselSupported;
    private final boolean explicitCsiFeedbackSupported;
    private final boolean explicitCsiTxBeamformingSupported;
    private final BeamformingFeedbackCapability explicitNoncompressedBeamformingFeedbackCapability;
    private final boolean explicitNoncompressedSteeringSupported;
    private final BeamformingFeedbackCapability explicitTxBeamformingCsiFeedbackCapability;
    private final boolean fortyMhzIntolerant;
    private final boolean htControlFieldSupported;
    private final boolean htDelayedBlockAckSupported;
    private final boolean htGreenfieldSupported;
    private final boolean implicitTxBeamformingReceivingSupported;
    private final boolean implicitTxBeamformingSupported;
    private final boolean lSigTxopProtectionSupported;
    private final boolean ldpcCodingSupported;
    private final AMpduLength maxAMpduLength;
    private final AMsduLength maxAMsduLength;
    private final McsFeedbackCapability mcsFeedbackCapability;
    private final Grouping minGrouping;
    private final MpduStartSpacing minMpduStartSpacing;
    private final NumBeamformerAntennas noncompressedSteeringNumBeamformerAntennasSupported;
    private final boolean pcoSupported;
    private final PcoTransitionTime pcoTransitionTime;
    private final boolean rdResponderSupported;
    private final boolean rxAselSupported;
    private final short rxHighestSupportedDataRate;
    private final boolean rxNdpSupported;
    private final boolean rxStaggeredSoundingSupported;
    private final StbcSupport rxStbcSupport;
    private final boolean shortGiFor20MhzSupported;
    private final boolean shortGiFor40MhzSupported;
    private final SmPowerSaveMode smPowerSaveMode;
    private final boolean[] supportedRxMcsIndexes;
    private final NumSpatialStreams txMaxNumSpatialStreamsSupported;
    private final boolean txMcsSetDefined;
    private final boolean txNdpSupported;
    private final boolean txRxMcsSetNotEqual;
    private final boolean txSoundingPpdusSupported;
    private final boolean txStaggeredSoundingSupported;
    private final boolean txStbcSupported;
    private final boolean txUnequalModulationSupported;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11HTCapabilitiesElement$AMpduLength.class */
    public enum AMpduLength {
        MAX_8191(0, "8191 octets"),
        MAX_16383(1, "16383 octets"),
        MAX_32767(2, "32767 octets"),
        MAX_65535(3, "65535 octets");

        private final String name;
        private final int value;

        AMpduLength(int i10, String str) {
            this.value = i10;
            this.name = str;
        }

        public static AMpduLength getInstance(int i10) {
            for (AMpduLength aMpduLength : values()) {
                if (aMpduLength.value == i10) {
                    return aMpduLength;
                }
            }
            throw new IllegalArgumentException("Invalid value: " + i10);
        }

        public String getName() {
            return this.name;
        }

        public int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append(this.value);
            sb2.append(" (");
            sb2.append(this.name);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11HTCapabilitiesElement$AMsduLength.class */
    public enum AMsduLength {
        MAX_3839(0, "3839 octets"),
        MAX_7935(1, "7935 octets");

        private final String name;
        private final int value;

        AMsduLength(int i10, String str) {
            this.value = i10;
            this.name = str;
        }

        public static AMsduLength getInstance(int i10) {
            for (AMsduLength aMsduLength : values()) {
                if (aMsduLength.value == i10) {
                    return aMsduLength;
                }
            }
            throw new IllegalArgumentException("Invalid value: " + i10);
        }

        public String getName() {
            return this.name;
        }

        public int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append(this.value);
            sb2.append(" (");
            sb2.append(this.name);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11HTCapabilitiesElement$BeamformingFeedbackCapability.class */
    public enum BeamformingFeedbackCapability {
        NOT_SUPPORTED(0, "Not supported"),
        DELAYED(1, "Delayed"),
        IMMEDIATE(2, "Immediate"),
        DELAYED_AND_IMMEDIATE(3, "Delayed and immediate");

        private final String name;
        private final int value;

        BeamformingFeedbackCapability(int i10, String str) {
            this.value = i10;
            this.name = str;
        }

        public static BeamformingFeedbackCapability getInstance(int i10) {
            for (BeamformingFeedbackCapability beamformingFeedbackCapability : values()) {
                if (beamformingFeedbackCapability.value == i10) {
                    return beamformingFeedbackCapability;
                }
            }
            throw new IllegalArgumentException("Invalid value: " + i10);
        }

        public String getName() {
            return this.name;
        }

        public int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append(this.value);
            sb2.append(" (");
            sb2.append(this.name);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11HTCapabilitiesElement$Builder.class */
    public static final class Builder extends Dot11InformationElement.Builder {
        private boolean antennaIndicesFeedbackBasedTxAselSupported;
        private boolean antennaIndicesFeedbackSupported;
        private boolean antennaSelectionSupported;
        private boolean bit101OfSupportedMcsSet;
        private boolean bit102OfSupportedMcsSet;
        private boolean bit103OfSupportedMcsSet;
        private boolean bit104OfSupportedMcsSet;
        private boolean bit105OfSupportedMcsSet;
        private boolean bit106OfSupportedMcsSet;
        private boolean bit107OfSupportedMcsSet;
        private boolean bit108OfSupportedMcsSet;
        private boolean bit109OfSupportedMcsSet;
        private boolean bit110OfSupportedMcsSet;
        private boolean bit111OfSupportedMcsSet;
        private boolean bit112OfSupportedMcsSet;
        private boolean bit113OfSupportedMcsSet;
        private boolean bit114OfSupportedMcsSet;
        private boolean bit115OfSupportedMcsSet;
        private boolean bit116OfSupportedMcsSet;
        private boolean bit117OfSupportedMcsSet;
        private boolean bit118OfSupportedMcsSet;
        private boolean bit119OfSupportedMcsSet;
        private boolean bit120OfSupportedMcsSet;
        private boolean bit121OfSupportedMcsSet;
        private boolean bit122OfSupportedMcsSet;
        private boolean bit123OfSupportedMcsSet;
        private boolean bit124OfSupportedMcsSet;
        private boolean bit125OfSupportedMcsSet;
        private boolean bit126OfSupportedMcsSet;
        private boolean bit127OfSupportedMcsSet;
        private boolean bit12OfHtExtendedCapabilities;
        private boolean bit13OfHtCapabilitiesInfo;
        private boolean bit13OfHtExtendedCapabilities;
        private boolean bit14OfHtExtendedCapabilities;
        private boolean bit15OfHtExtendedCapabilities;
        private boolean bit29OfTransmitBeamformingCapabilities;
        private boolean bit30OfTransmitBeamformingCapabilities;
        private boolean bit31OfTransmitBeamformingCapabilities;
        private boolean bit3OfHtExtendedCapabilities;
        private boolean bit4OfHtExtendedCapabilities;
        private boolean bit5OfAMpduParameters;
        private boolean bit5OfHtExtendedCapabilities;
        private boolean bit6OfAMpduParameters;
        private boolean bit6OfHtExtendedCapabilities;
        private boolean bit77OfSupportedMcsSet;
        private boolean bit78OfSupportedMcsSet;
        private boolean bit79OfSupportedMcsSet;
        private boolean bit7OfAMpduParameters;
        private boolean bit7OfAselCapability;
        private boolean bit7OfHtExtendedCapabilities;
        private boolean bit90OfSupportedMcsSet;
        private boolean bit91OfSupportedMcsSet;
        private boolean bit92OfSupportedMcsSet;
        private boolean bit93OfSupportedMcsSet;
        private boolean bit94OfSupportedMcsSet;
        private boolean bit95OfSupportedMcsSet;
        private boolean both20and40MhzSupported;
        private Calibration calibration;
        private ChannelEstimationCapability channelEstimationCapability;
        private NumBeamformerAntennas compressedSteeringNumBeamformerAntennasSupported;
        private CsiNumRows csiMaxNumRowsBeamformerSupported;
        private NumBeamformerAntennas csiNumBeamformerAntennasSupported;
        private boolean dsssCckModeIn40MhzSupported;
        private BeamformingFeedbackCapability explicitCompressedBeamformingFeedbackCapability;
        private boolean explicitCompressedSteeringSupported;
        private boolean explicitCsiFeedbackBasedTxAselSupported;
        private boolean explicitCsiFeedbackSupported;
        private boolean explicitCsiTxBeamformingSupported;
        private BeamformingFeedbackCapability explicitNoncompressedBeamformingFeedbackCapability;
        private boolean explicitNoncompressedSteeringSupported;
        private BeamformingFeedbackCapability explicitTxBeamformingCsiFeedbackCapability;
        private boolean fortyMhzIntolerant;
        private boolean htControlFieldSupported;
        private boolean htDelayedBlockAckSupported;
        private boolean htGreenfieldSupported;
        private boolean implicitTxBeamformingReceivingSupported;
        private boolean implicitTxBeamformingSupported;
        private boolean lSigTxopProtectionSupported;
        private boolean ldpcCodingSupported;
        private AMpduLength maxAMpduLength;
        private AMsduLength maxAMsduLength;
        private McsFeedbackCapability mcsFeedbackCapability;
        private Grouping minGrouping;
        private MpduStartSpacing minMpduStartSpacing;
        private NumBeamformerAntennas noncompressedSteeringNumBeamformerAntennasSupported;
        private boolean pcoSupported;
        private PcoTransitionTime pcoTransitionTime;
        private boolean rdResponderSupported;
        private boolean rxAselSupported;
        private short rxHighestSupportedDataRate;
        private boolean rxNdpSupported;
        private boolean rxStaggeredSoundingSupported;
        private StbcSupport rxStbcSupport;
        private boolean shortGiFor20MhzSupported;
        private boolean shortGiFor40MhzSupported;
        private SmPowerSaveMode smPowerSaveMode;
        private boolean[] supportedRxMcsIndexes;
        private NumSpatialStreams txMaxNumSpatialStreamsSupported;
        private boolean txMcsSetDefined;
        private boolean txNdpSupported;
        private boolean txRxMcsSetNotEqual;
        private boolean txSoundingPpdusSupported;
        private boolean txStaggeredSoundingSupported;
        private boolean txStbcSupported;
        private boolean txUnequalModulationSupported;

        public Builder() {
            elementId(Dot11InformationElementId.getInstance(Dot11InformationElementId.HT_CAPABILITIES.value()));
        }

        private Builder(Dot11HTCapabilitiesElement dot11HTCapabilitiesElement) {
            super(dot11HTCapabilitiesElement);
            this.ldpcCodingSupported = dot11HTCapabilitiesElement.ldpcCodingSupported;
            this.both20and40MhzSupported = dot11HTCapabilitiesElement.both20and40MhzSupported;
            this.smPowerSaveMode = dot11HTCapabilitiesElement.smPowerSaveMode;
            this.htGreenfieldSupported = dot11HTCapabilitiesElement.htGreenfieldSupported;
            this.shortGiFor20MhzSupported = dot11HTCapabilitiesElement.shortGiFor20MhzSupported;
            this.shortGiFor40MhzSupported = dot11HTCapabilitiesElement.shortGiFor40MhzSupported;
            this.txStbcSupported = dot11HTCapabilitiesElement.txStbcSupported;
            this.rxStbcSupport = dot11HTCapabilitiesElement.rxStbcSupport;
            this.htDelayedBlockAckSupported = dot11HTCapabilitiesElement.htDelayedBlockAckSupported;
            this.maxAMsduLength = dot11HTCapabilitiesElement.maxAMsduLength;
            this.dsssCckModeIn40MhzSupported = dot11HTCapabilitiesElement.dsssCckModeIn40MhzSupported;
            this.bit13OfHtCapabilitiesInfo = dot11HTCapabilitiesElement.bit13OfHtCapabilitiesInfo;
            this.fortyMhzIntolerant = dot11HTCapabilitiesElement.fortyMhzIntolerant;
            this.lSigTxopProtectionSupported = dot11HTCapabilitiesElement.lSigTxopProtectionSupported;
            this.maxAMpduLength = dot11HTCapabilitiesElement.maxAMpduLength;
            this.minMpduStartSpacing = dot11HTCapabilitiesElement.minMpduStartSpacing;
            this.bit5OfAMpduParameters = dot11HTCapabilitiesElement.bit5OfAMpduParameters;
            this.bit6OfAMpduParameters = dot11HTCapabilitiesElement.bit6OfAMpduParameters;
            this.bit7OfAMpduParameters = dot11HTCapabilitiesElement.bit7OfAMpduParameters;
            this.supportedRxMcsIndexes = dot11HTCapabilitiesElement.supportedRxMcsIndexes;
            this.bit77OfSupportedMcsSet = dot11HTCapabilitiesElement.bit77OfSupportedMcsSet;
            this.bit78OfSupportedMcsSet = dot11HTCapabilitiesElement.bit78OfSupportedMcsSet;
            this.bit79OfSupportedMcsSet = dot11HTCapabilitiesElement.bit79OfSupportedMcsSet;
            this.rxHighestSupportedDataRate = dot11HTCapabilitiesElement.rxHighestSupportedDataRate;
            this.bit90OfSupportedMcsSet = dot11HTCapabilitiesElement.bit90OfSupportedMcsSet;
            this.bit91OfSupportedMcsSet = dot11HTCapabilitiesElement.bit91OfSupportedMcsSet;
            this.bit92OfSupportedMcsSet = dot11HTCapabilitiesElement.bit92OfSupportedMcsSet;
            this.bit93OfSupportedMcsSet = dot11HTCapabilitiesElement.bit93OfSupportedMcsSet;
            this.bit94OfSupportedMcsSet = dot11HTCapabilitiesElement.bit94OfSupportedMcsSet;
            this.bit95OfSupportedMcsSet = dot11HTCapabilitiesElement.bit95OfSupportedMcsSet;
            this.txMcsSetDefined = dot11HTCapabilitiesElement.txMcsSetDefined;
            this.txRxMcsSetNotEqual = dot11HTCapabilitiesElement.txRxMcsSetNotEqual;
            this.txMaxNumSpatialStreamsSupported = dot11HTCapabilitiesElement.txMaxNumSpatialStreamsSupported;
            this.txUnequalModulationSupported = dot11HTCapabilitiesElement.txUnequalModulationSupported;
            this.bit101OfSupportedMcsSet = dot11HTCapabilitiesElement.bit101OfSupportedMcsSet;
            this.bit102OfSupportedMcsSet = dot11HTCapabilitiesElement.bit102OfSupportedMcsSet;
            this.bit103OfSupportedMcsSet = dot11HTCapabilitiesElement.bit103OfSupportedMcsSet;
            this.bit104OfSupportedMcsSet = dot11HTCapabilitiesElement.bit104OfSupportedMcsSet;
            this.bit105OfSupportedMcsSet = dot11HTCapabilitiesElement.bit105OfSupportedMcsSet;
            this.bit106OfSupportedMcsSet = dot11HTCapabilitiesElement.bit106OfSupportedMcsSet;
            this.bit107OfSupportedMcsSet = dot11HTCapabilitiesElement.bit107OfSupportedMcsSet;
            this.bit108OfSupportedMcsSet = dot11HTCapabilitiesElement.bit108OfSupportedMcsSet;
            this.bit109OfSupportedMcsSet = dot11HTCapabilitiesElement.bit109OfSupportedMcsSet;
            this.bit110OfSupportedMcsSet = dot11HTCapabilitiesElement.bit110OfSupportedMcsSet;
            this.bit111OfSupportedMcsSet = dot11HTCapabilitiesElement.bit111OfSupportedMcsSet;
            this.bit112OfSupportedMcsSet = dot11HTCapabilitiesElement.bit112OfSupportedMcsSet;
            this.bit113OfSupportedMcsSet = dot11HTCapabilitiesElement.bit113OfSupportedMcsSet;
            this.bit114OfSupportedMcsSet = dot11HTCapabilitiesElement.bit114OfSupportedMcsSet;
            this.bit115OfSupportedMcsSet = dot11HTCapabilitiesElement.bit115OfSupportedMcsSet;
            this.bit116OfSupportedMcsSet = dot11HTCapabilitiesElement.bit116OfSupportedMcsSet;
            this.bit117OfSupportedMcsSet = dot11HTCapabilitiesElement.bit117OfSupportedMcsSet;
            this.bit118OfSupportedMcsSet = dot11HTCapabilitiesElement.bit118OfSupportedMcsSet;
            this.bit119OfSupportedMcsSet = dot11HTCapabilitiesElement.bit119OfSupportedMcsSet;
            this.bit120OfSupportedMcsSet = dot11HTCapabilitiesElement.bit120OfSupportedMcsSet;
            this.bit121OfSupportedMcsSet = dot11HTCapabilitiesElement.bit121OfSupportedMcsSet;
            this.bit122OfSupportedMcsSet = dot11HTCapabilitiesElement.bit122OfSupportedMcsSet;
            this.bit123OfSupportedMcsSet = dot11HTCapabilitiesElement.bit123OfSupportedMcsSet;
            this.bit124OfSupportedMcsSet = dot11HTCapabilitiesElement.bit124OfSupportedMcsSet;
            this.bit125OfSupportedMcsSet = dot11HTCapabilitiesElement.bit125OfSupportedMcsSet;
            this.bit126OfSupportedMcsSet = dot11HTCapabilitiesElement.bit126OfSupportedMcsSet;
            this.bit127OfSupportedMcsSet = dot11HTCapabilitiesElement.bit127OfSupportedMcsSet;
            this.pcoSupported = dot11HTCapabilitiesElement.pcoSupported;
            this.pcoTransitionTime = dot11HTCapabilitiesElement.pcoTransitionTime;
            this.bit3OfHtExtendedCapabilities = dot11HTCapabilitiesElement.bit3OfHtExtendedCapabilities;
            this.bit4OfHtExtendedCapabilities = dot11HTCapabilitiesElement.bit4OfHtExtendedCapabilities;
            this.bit5OfHtExtendedCapabilities = dot11HTCapabilitiesElement.bit5OfHtExtendedCapabilities;
            this.bit6OfHtExtendedCapabilities = dot11HTCapabilitiesElement.bit6OfHtExtendedCapabilities;
            this.bit7OfHtExtendedCapabilities = dot11HTCapabilitiesElement.bit7OfHtExtendedCapabilities;
            this.mcsFeedbackCapability = dot11HTCapabilitiesElement.mcsFeedbackCapability;
            this.htControlFieldSupported = dot11HTCapabilitiesElement.htControlFieldSupported;
            this.rdResponderSupported = dot11HTCapabilitiesElement.rdResponderSupported;
            this.bit12OfHtExtendedCapabilities = dot11HTCapabilitiesElement.bit12OfHtExtendedCapabilities;
            this.bit13OfHtExtendedCapabilities = dot11HTCapabilitiesElement.bit13OfHtExtendedCapabilities;
            this.bit14OfHtExtendedCapabilities = dot11HTCapabilitiesElement.bit14OfHtExtendedCapabilities;
            this.bit15OfHtExtendedCapabilities = dot11HTCapabilitiesElement.bit15OfHtExtendedCapabilities;
            this.implicitTxBeamformingReceivingSupported = dot11HTCapabilitiesElement.implicitTxBeamformingReceivingSupported;
            this.rxStaggeredSoundingSupported = dot11HTCapabilitiesElement.rxStaggeredSoundingSupported;
            this.txStaggeredSoundingSupported = dot11HTCapabilitiesElement.txStaggeredSoundingSupported;
            this.rxNdpSupported = dot11HTCapabilitiesElement.rxNdpSupported;
            this.txNdpSupported = dot11HTCapabilitiesElement.txNdpSupported;
            this.implicitTxBeamformingSupported = dot11HTCapabilitiesElement.implicitTxBeamformingSupported;
            this.calibration = dot11HTCapabilitiesElement.calibration;
            this.explicitCsiTxBeamformingSupported = dot11HTCapabilitiesElement.explicitCsiTxBeamformingSupported;
            this.explicitNoncompressedSteeringSupported = dot11HTCapabilitiesElement.explicitNoncompressedSteeringSupported;
            this.explicitCompressedSteeringSupported = dot11HTCapabilitiesElement.explicitCompressedSteeringSupported;
            this.explicitTxBeamformingCsiFeedbackCapability = dot11HTCapabilitiesElement.explicitTxBeamformingCsiFeedbackCapability;
            this.explicitNoncompressedBeamformingFeedbackCapability = dot11HTCapabilitiesElement.explicitNoncompressedBeamformingFeedbackCapability;
            this.explicitCompressedBeamformingFeedbackCapability = dot11HTCapabilitiesElement.explicitCompressedBeamformingFeedbackCapability;
            this.minGrouping = dot11HTCapabilitiesElement.minGrouping;
            this.csiNumBeamformerAntennasSupported = dot11HTCapabilitiesElement.csiNumBeamformerAntennasSupported;
            this.noncompressedSteeringNumBeamformerAntennasSupported = dot11HTCapabilitiesElement.noncompressedSteeringNumBeamformerAntennasSupported;
            this.compressedSteeringNumBeamformerAntennasSupported = dot11HTCapabilitiesElement.compressedSteeringNumBeamformerAntennasSupported;
            this.csiMaxNumRowsBeamformerSupported = dot11HTCapabilitiesElement.csiMaxNumRowsBeamformerSupported;
            this.channelEstimationCapability = dot11HTCapabilitiesElement.channelEstimationCapability;
            this.bit29OfTransmitBeamformingCapabilities = dot11HTCapabilitiesElement.bit29OfTransmitBeamformingCapabilities;
            this.bit30OfTransmitBeamformingCapabilities = dot11HTCapabilitiesElement.bit30OfTransmitBeamformingCapabilities;
            this.bit31OfTransmitBeamformingCapabilities = dot11HTCapabilitiesElement.bit31OfTransmitBeamformingCapabilities;
            this.antennaSelectionSupported = dot11HTCapabilitiesElement.antennaSelectionSupported;
            this.explicitCsiFeedbackBasedTxAselSupported = dot11HTCapabilitiesElement.explicitCsiFeedbackBasedTxAselSupported;
            this.antennaIndicesFeedbackBasedTxAselSupported = dot11HTCapabilitiesElement.antennaIndicesFeedbackBasedTxAselSupported;
            this.explicitCsiFeedbackSupported = dot11HTCapabilitiesElement.explicitCsiFeedbackSupported;
            this.antennaIndicesFeedbackSupported = dot11HTCapabilitiesElement.antennaIndicesFeedbackSupported;
            this.rxAselSupported = dot11HTCapabilitiesElement.rxAselSupported;
            this.txSoundingPpdusSupported = dot11HTCapabilitiesElement.txSoundingPpdusSupported;
            this.bit7OfAselCapability = dot11HTCapabilitiesElement.bit7OfAselCapability;
        }

        public Builder antennaIndicesFeedbackBasedTxAselSupported(boolean z10) {
            this.antennaIndicesFeedbackBasedTxAselSupported = z10;
            return this;
        }

        public Builder antennaIndicesFeedbackSupported(boolean z10) {
            this.antennaIndicesFeedbackSupported = z10;
            return this;
        }

        public Builder antennaSelectionSupported(boolean z10) {
            this.antennaSelectionSupported = z10;
            return this;
        }

        public Builder bit101OfSupportedMcsSet(boolean z10) {
            this.bit101OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit102OfSupportedMcsSet(boolean z10) {
            this.bit102OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit103OfSupportedMcsSet(boolean z10) {
            this.bit103OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit104OfSupportedMcsSet(boolean z10) {
            this.bit104OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit105OfSupportedMcsSet(boolean z10) {
            this.bit105OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit106OfSupportedMcsSet(boolean z10) {
            this.bit106OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit107OfSupportedMcsSet(boolean z10) {
            this.bit107OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit108OfSupportedMcsSet(boolean z10) {
            this.bit108OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit109OfSupportedMcsSet(boolean z10) {
            this.bit109OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit110OfSupportedMcsSet(boolean z10) {
            this.bit110OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit111OfSupportedMcsSet(boolean z10) {
            this.bit111OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit112OfSupportedMcsSet(boolean z10) {
            this.bit112OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit113OfSupportedMcsSet(boolean z10) {
            this.bit113OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit114OfSupportedMcsSet(boolean z10) {
            this.bit114OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit115OfSupportedMcsSet(boolean z10) {
            this.bit115OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit116OfSupportedMcsSet(boolean z10) {
            this.bit116OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit117OfSupportedMcsSet(boolean z10) {
            this.bit117OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit118OfSupportedMcsSet(boolean z10) {
            this.bit118OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit119OfSupportedMcsSet(boolean z10) {
            this.bit119OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit120OfSupportedMcsSet(boolean z10) {
            this.bit120OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit121OfSupportedMcsSet(boolean z10) {
            this.bit121OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit122OfSupportedMcsSet(boolean z10) {
            this.bit122OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit123OfSupportedMcsSet(boolean z10) {
            this.bit123OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit124OfSupportedMcsSet(boolean z10) {
            this.bit124OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit125OfSupportedMcsSet(boolean z10) {
            this.bit125OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit126OfSupportedMcsSet(boolean z10) {
            this.bit126OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit127OfSupportedMcsSet(boolean z10) {
            this.bit127OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit12OfHtExtendedCapabilities(boolean z10) {
            this.bit12OfHtExtendedCapabilities = z10;
            return this;
        }

        public Builder bit13OfHtCapabilitiesInfo(boolean z10) {
            this.bit13OfHtCapabilitiesInfo = z10;
            return this;
        }

        public Builder bit13OfHtExtendedCapabilities(boolean z10) {
            this.bit13OfHtExtendedCapabilities = z10;
            return this;
        }

        public Builder bit14OfHtExtendedCapabilities(boolean z10) {
            this.bit14OfHtExtendedCapabilities = z10;
            return this;
        }

        public Builder bit15OfHtExtendedCapabilities(boolean z10) {
            this.bit15OfHtExtendedCapabilities = z10;
            return this;
        }

        public Builder bit29OfTransmitBeamformingCapabilities(boolean z10) {
            this.bit29OfTransmitBeamformingCapabilities = z10;
            return this;
        }

        public Builder bit30OfTransmitBeamformingCapabilities(boolean z10) {
            this.bit30OfTransmitBeamformingCapabilities = z10;
            return this;
        }

        public Builder bit31OfTransmitBeamformingCapabilities(boolean z10) {
            this.bit31OfTransmitBeamformingCapabilities = z10;
            return this;
        }

        public Builder bit3OfHtExtendedCapabilities(boolean z10) {
            this.bit3OfHtExtendedCapabilities = z10;
            return this;
        }

        public Builder bit4OfHtExtendedCapabilities(boolean z10) {
            this.bit4OfHtExtendedCapabilities = z10;
            return this;
        }

        public Builder bit5OfAMpduParameters(boolean z10) {
            this.bit5OfAMpduParameters = z10;
            return this;
        }

        public Builder bit5OfHtExtendedCapabilities(boolean z10) {
            this.bit5OfHtExtendedCapabilities = z10;
            return this;
        }

        public Builder bit6OfAMpduParameters(boolean z10) {
            this.bit6OfAMpduParameters = z10;
            return this;
        }

        public Builder bit6OfHtExtendedCapabilities(boolean z10) {
            this.bit6OfHtExtendedCapabilities = z10;
            return this;
        }

        public Builder bit77OfSupportedMcsSet(boolean z10) {
            this.bit77OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit78OfSupportedMcsSet(boolean z10) {
            this.bit78OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit79OfSupportedMcsSet(boolean z10) {
            this.bit79OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit7OfAMpduParameters(boolean z10) {
            this.bit7OfAMpduParameters = z10;
            return this;
        }

        public Builder bit7OfAselCapability(boolean z10) {
            this.bit7OfAselCapability = z10;
            return this;
        }

        public Builder bit7OfHtExtendedCapabilities(boolean z10) {
            this.bit7OfHtExtendedCapabilities = z10;
            return this;
        }

        public Builder bit90OfSupportedMcsSet(boolean z10) {
            this.bit90OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit91OfSupportedMcsSet(boolean z10) {
            this.bit91OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit92OfSupportedMcsSet(boolean z10) {
            this.bit92OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit93OfSupportedMcsSet(boolean z10) {
            this.bit93OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit94OfSupportedMcsSet(boolean z10) {
            this.bit94OfSupportedMcsSet = z10;
            return this;
        }

        public Builder bit95OfSupportedMcsSet(boolean z10) {
            this.bit95OfSupportedMcsSet = z10;
            return this;
        }

        public Builder both20and40MhzSupported(boolean z10) {
            this.both20and40MhzSupported = z10;
            return this;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public Dot11InformationElement build() {
            if (getCorrectLengthAtBuild()) {
                length((byte) 26);
            }
            return new Dot11HTCapabilitiesElement(this);
        }

        public Builder calibration(Calibration calibration) {
            this.calibration = calibration;
            return this;
        }

        public Builder channelEstimationCapability(ChannelEstimationCapability channelEstimationCapability) {
            this.channelEstimationCapability = channelEstimationCapability;
            return this;
        }

        public Builder compressedSteeringNumBeamformerAntennasSupported(NumBeamformerAntennas numBeamformerAntennas) {
            this.compressedSteeringNumBeamformerAntennasSupported = numBeamformerAntennas;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.pcap4j.packet.Dot11InformationElement.Builder, org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild */
        public LengthBuilder<Dot11InformationElement> correctLengthAtBuild2(boolean z10) {
            super.correctLengthAtBuild2(z10);
            return this;
        }

        public Builder csiMaxNumRowsBeamformerSupported(CsiNumRows csiNumRows) {
            this.csiMaxNumRowsBeamformerSupported = csiNumRows;
            return this;
        }

        public Builder csiNumBeamformerAntennasSupported(NumBeamformerAntennas numBeamformerAntennas) {
            this.csiNumBeamformerAntennasSupported = numBeamformerAntennas;
            return this;
        }

        public Builder dsssCckModeIn40MhzSupported(boolean z10) {
            this.dsssCckModeIn40MhzSupported = z10;
            return this;
        }

        public Builder explicitCompressedBeamformingFeedbackCapability(BeamformingFeedbackCapability beamformingFeedbackCapability) {
            this.explicitCompressedBeamformingFeedbackCapability = beamformingFeedbackCapability;
            return this;
        }

        public Builder explicitCompressedSteeringSupported(boolean z10) {
            this.explicitCompressedSteeringSupported = z10;
            return this;
        }

        public Builder explicitCsiFeedbackBasedTxAselSupported(boolean z10) {
            this.explicitCsiFeedbackBasedTxAselSupported = z10;
            return this;
        }

        public Builder explicitCsiFeedbackSupported(boolean z10) {
            this.explicitCsiFeedbackSupported = z10;
            return this;
        }

        public Builder explicitCsiTxBeamformingSupported(boolean z10) {
            this.explicitCsiTxBeamformingSupported = z10;
            return this;
        }

        public Builder explicitNoncompressedBeamformingFeedbackCapability(BeamformingFeedbackCapability beamformingFeedbackCapability) {
            this.explicitNoncompressedBeamformingFeedbackCapability = beamformingFeedbackCapability;
            return this;
        }

        public Builder explicitNoncompressedSteeringSupported(boolean z10) {
            this.explicitNoncompressedSteeringSupported = z10;
            return this;
        }

        public Builder explicitTxBeamformingCsiFeedbackCapability(BeamformingFeedbackCapability beamformingFeedbackCapability) {
            this.explicitTxBeamformingCsiFeedbackCapability = beamformingFeedbackCapability;
            return this;
        }

        public Builder fortyMhzIntolerant(boolean z10) {
            this.fortyMhzIntolerant = z10;
            return this;
        }

        public Builder htControlFieldSupported(boolean z10) {
            this.htControlFieldSupported = z10;
            return this;
        }

        public Builder htDelayedBlockAckSupported(boolean z10) {
            this.htDelayedBlockAckSupported = z10;
            return this;
        }

        public Builder htGreenfieldSupported(boolean z10) {
            this.htGreenfieldSupported = z10;
            return this;
        }

        public Builder implicitTxBeamformingReceivingSupported(boolean z10) {
            this.implicitTxBeamformingReceivingSupported = z10;
            return this;
        }

        public Builder implicitTxBeamformingSupported(boolean z10) {
            this.implicitTxBeamformingSupported = z10;
            return this;
        }

        public Builder lSigTxopProtectionSupported(boolean z10) {
            this.lSigTxopProtectionSupported = z10;
            return this;
        }

        public Builder ldpcCodingSupported(boolean z10) {
            this.ldpcCodingSupported = z10;
            return this;
        }

        @Override // org.pcap4j.packet.Dot11InformationElement.Builder
        public Builder length(byte b10) {
            super.length(b10);
            return this;
        }

        public Builder maxAMpduLength(AMpduLength aMpduLength) {
            this.maxAMpduLength = aMpduLength;
            return this;
        }

        public Builder maxAMsduLength(AMsduLength aMsduLength) {
            this.maxAMsduLength = aMsduLength;
            return this;
        }

        public Builder mcsFeedbackCapability(McsFeedbackCapability mcsFeedbackCapability) {
            this.mcsFeedbackCapability = mcsFeedbackCapability;
            return this;
        }

        public Builder minGrouping(Grouping grouping) {
            this.minGrouping = grouping;
            return this;
        }

        public Builder minMpduStartSpacing(MpduStartSpacing mpduStartSpacing) {
            this.minMpduStartSpacing = mpduStartSpacing;
            return this;
        }

        public Builder noncompressedSteeringNumBeamformerAntennasSupported(NumBeamformerAntennas numBeamformerAntennas) {
            this.noncompressedSteeringNumBeamformerAntennasSupported = numBeamformerAntennas;
            return this;
        }

        public Builder pcoSupported(boolean z10) {
            this.pcoSupported = z10;
            return this;
        }

        public Builder pcoTransitionTime(PcoTransitionTime pcoTransitionTime) {
            this.pcoTransitionTime = pcoTransitionTime;
            return this;
        }

        public Builder rdResponderSupported(boolean z10) {
            this.rdResponderSupported = z10;
            return this;
        }

        public Builder rxAselSupported(boolean z10) {
            this.rxAselSupported = z10;
            return this;
        }

        public Builder rxHighestSupportedDataRate(short s10) {
            this.rxHighestSupportedDataRate = s10;
            return this;
        }

        public Builder rxNdpSupported(boolean z10) {
            this.rxNdpSupported = z10;
            return this;
        }

        public Builder rxStaggeredSoundingSupported(boolean z10) {
            this.rxStaggeredSoundingSupported = z10;
            return this;
        }

        public Builder rxStbcSupport(StbcSupport stbcSupport) {
            this.rxStbcSupport = stbcSupport;
            return this;
        }

        public Builder shortGiFor20MhzSupported(boolean z10) {
            this.shortGiFor20MhzSupported = z10;
            return this;
        }

        public Builder shortGiFor40MhzSupported(boolean z10) {
            this.shortGiFor40MhzSupported = z10;
            return this;
        }

        public Builder smPowerSaveMode(SmPowerSaveMode smPowerSaveMode) {
            this.smPowerSaveMode = smPowerSaveMode;
            return this;
        }

        public Builder supportedRxMcsIndexes(boolean[] zArr) {
            this.supportedRxMcsIndexes = zArr;
            return this;
        }

        public Builder txMaxNumSpatialStreamsSupported(NumSpatialStreams numSpatialStreams) {
            this.txMaxNumSpatialStreamsSupported = numSpatialStreams;
            return this;
        }

        public Builder txMcsSetDefined(boolean z10) {
            this.txMcsSetDefined = z10;
            return this;
        }

        public Builder txNdpSupported(boolean z10) {
            this.txNdpSupported = z10;
            return this;
        }

        public Builder txRxMcsSetNotEqual(boolean z10) {
            this.txRxMcsSetNotEqual = z10;
            return this;
        }

        public Builder txSoundingPpdusSupported(boolean z10) {
            this.txSoundingPpdusSupported = z10;
            return this;
        }

        public Builder txStaggeredSoundingSupported(boolean z10) {
            this.txStaggeredSoundingSupported = z10;
            return this;
        }

        public Builder txStbcSupported(boolean z10) {
            this.txStbcSupported = z10;
            return this;
        }

        public Builder txUnequalModulationSupported(boolean z10) {
            this.txUnequalModulationSupported = z10;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11HTCapabilitiesElement$Calibration.class */
    public enum Calibration {
        NOT_SUPPORTED(0, "Not supported"),
        RESPOND(1, "Respond"),
        RESERVED(2, "reserved"),
        INITIATE_AND_RESPOND(3, "Initiate and respond");

        private final String name;
        private final int value;

        Calibration(int i10, String str) {
            this.value = i10;
            this.name = str;
        }

        public static Calibration getInstance(int i10) {
            for (Calibration calibration : values()) {
                if (calibration.value == i10) {
                    return calibration;
                }
            }
            throw new IllegalArgumentException("Invalid value: " + i10);
        }

        public String getName() {
            return this.name;
        }

        public int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append(this.value);
            sb2.append(" (");
            sb2.append(this.name);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11HTCapabilitiesElement$ChannelEstimationCapability.class */
    public enum ChannelEstimationCapability {
        ONE_SPACE_TIME_STREAM(0, "1 space-time stream"),
        TWO_SPACE_TIME_STREAMS(1, "2 space-time streams"),
        THREE_SPACE_TIME_STREAMS(2, "3 space-time streams"),
        FOUR_SPACE_TIME_STREAMS(3, "4 space-time streams");

        private final String name;
        private final int value;

        ChannelEstimationCapability(int i10, String str) {
            this.value = i10;
            this.name = str;
        }

        public static ChannelEstimationCapability getInstance(int i10) {
            for (ChannelEstimationCapability channelEstimationCapability : values()) {
                if (channelEstimationCapability.value == i10) {
                    return channelEstimationCapability;
                }
            }
            throw new IllegalArgumentException("Invalid value: " + i10);
        }

        public String getName() {
            return this.name;
        }

        public int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append(this.value);
            sb2.append(" (");
            sb2.append(this.name);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11HTCapabilitiesElement$CsiNumRows.class */
    public enum CsiNumRows {
        SINGLE(0, "Single row of CSI"),
        TWO(1, "2 rows of CSI"),
        THREE(2, "3 rows of CSI"),
        FOUR(3, "4 rows of CSI");

        private final String name;
        private final int value;

        CsiNumRows(int i10, String str) {
            this.value = i10;
            this.name = str;
        }

        public static CsiNumRows getInstance(int i10) {
            for (CsiNumRows csiNumRows : values()) {
                if (csiNumRows.value == i10) {
                    return csiNumRows;
                }
            }
            throw new IllegalArgumentException("Invalid value: " + i10);
        }

        public String getName() {
            return this.name;
        }

        public int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append(this.value);
            sb2.append(" (");
            sb2.append(this.name);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11HTCapabilitiesElement$Grouping.class */
    public enum Grouping {
        NO_GROUPING(0, "No grouping"),
        GROUPS_OF_1_2(1, "Groups of 1, 2"),
        GROUPS_OF_1_4(2, "Groups of 1, 4"),
        GROUPS_OF_1_2_4(3, "Groups of 1, 2, 4");

        private final String name;
        private final int value;

        Grouping(int i10, String str) {
            this.value = i10;
            this.name = str;
        }

        public static Grouping getInstance(int i10) {
            for (Grouping grouping : values()) {
                if (grouping.value == i10) {
                    return grouping;
                }
            }
            throw new IllegalArgumentException("Invalid value: " + i10);
        }

        public String getName() {
            return this.name;
        }

        public int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append(this.value);
            sb2.append(" (");
            sb2.append(this.name);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11HTCapabilitiesElement$McsFeedbackCapability.class */
    public enum McsFeedbackCapability {
        NO_FEEDBACK(0, "No Feedback"),
        RESERVED(1, "reserved"),
        ONLY_UNSOLICITED(2, "Only unsolicited"),
        UNSOLICITED_AND_SOLICITED(3, "Unsolicited and solicited");

        private final String name;
        private final int value;

        McsFeedbackCapability(int i10, String str) {
            this.value = i10;
            this.name = str;
        }

        public static McsFeedbackCapability getInstance(int i10) {
            for (McsFeedbackCapability mcsFeedbackCapability : values()) {
                if (mcsFeedbackCapability.value == i10) {
                    return mcsFeedbackCapability;
                }
            }
            throw new IllegalArgumentException("Invalid value: " + i10);
        }

        public String getName() {
            return this.name;
        }

        public int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append(this.value);
            sb2.append(" (");
            sb2.append(this.name);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11HTCapabilitiesElement$MpduStartSpacing.class */
    public enum MpduStartSpacing {
        NO_RESTRICTION(0, "No restriction"),
        ONE_FOURTH_US(1, "1/4 us"),
        HALF_US(2, "1/2 us"),
        ONE_US(3, "1 us"),
        TWO_US(4, "2 us"),
        FOUR_US(5, "4 us"),
        EIGHT_US(6, "8 us"),
        SIXTEEN_US(7, "16 us");

        private final String name;
        private final int value;

        MpduStartSpacing(int i10, String str) {
            this.value = i10;
            this.name = str;
        }

        public static MpduStartSpacing getInstance(int i10) {
            for (MpduStartSpacing mpduStartSpacing : values()) {
                if (mpduStartSpacing.value == i10) {
                    return mpduStartSpacing;
                }
            }
            throw new IllegalArgumentException("Invalid value: " + i10);
        }

        public String getName() {
            return this.name;
        }

        public int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append(this.value);
            sb2.append(" (");
            sb2.append(this.name);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11HTCapabilitiesElement$NumBeamformerAntennas.class */
    public enum NumBeamformerAntennas {
        SINGLE(0, "Single Tx antenna sounding"),
        TWO(1, "2 Tx antenna sounding"),
        THREE(2, "3 Tx antenna sounding"),
        FOUR(3, "4 Tx antenna sounding");

        private final String name;
        private final int value;

        NumBeamformerAntennas(int i10, String str) {
            this.value = i10;
            this.name = str;
        }

        public static NumBeamformerAntennas getInstance(int i10) {
            for (NumBeamformerAntennas numBeamformerAntennas : values()) {
                if (numBeamformerAntennas.value == i10) {
                    return numBeamformerAntennas;
                }
            }
            throw new IllegalArgumentException("Invalid value: " + i10);
        }

        public String getName() {
            return this.name;
        }

        public int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append(this.value);
            sb2.append(" (");
            sb2.append(this.name);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11HTCapabilitiesElement$NumSpatialStreams.class */
    public enum NumSpatialStreams {
        ONE(0, "1 spatial stream"),
        TWO(1, "2 spatial stream"),
        THREE(2, "3 spatial stream"),
        FOUR(3, "4 spatial stream");

        private final String name;
        private final int value;

        NumSpatialStreams(int i10, String str) {
            this.value = i10;
            this.name = str;
        }

        public static NumSpatialStreams getInstance(int i10) {
            for (NumSpatialStreams numSpatialStreams : values()) {
                if (numSpatialStreams.value == i10) {
                    return numSpatialStreams;
                }
            }
            throw new IllegalArgumentException("Invalid value: " + i10);
        }

        public String getName() {
            return this.name;
        }

        public int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append(this.value);
            sb2.append(" (");
            sb2.append(this.name);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11HTCapabilitiesElement$PcoTransitionTime.class */
    public enum PcoTransitionTime {
        NO_TRANSITION(0, "No transition"),
        PTT_400_US(1, "400 us"),
        PTT_1_5_MS(2, "1.5 ms"),
        PTT_5_MS(3, "5 ms");

        private final String name;
        private final int value;

        PcoTransitionTime(int i10, String str) {
            this.value = i10;
            this.name = str;
        }

        public static PcoTransitionTime getInstance(int i10) {
            for (PcoTransitionTime pcoTransitionTime : values()) {
                if (pcoTransitionTime.value == i10) {
                    return pcoTransitionTime;
                }
            }
            throw new IllegalArgumentException("Invalid value: " + i10);
        }

        public String getName() {
            return this.name;
        }

        public int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append(this.value);
            sb2.append(" (");
            sb2.append(this.name);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11HTCapabilitiesElement$SmPowerSaveMode.class */
    public enum SmPowerSaveMode {
        STATIC(0),
        DYNAMIC(1),
        RESERVED(2),
        DISABLED(3);

        private final int value;

        SmPowerSaveMode(int i10) {
            this.value = i10;
        }

        public static SmPowerSaveMode getInstance(int i10) {
            for (SmPowerSaveMode smPowerSaveMode : values()) {
                if (smPowerSaveMode.value == i10) {
                    return smPowerSaveMode;
                }
            }
            throw new IllegalArgumentException("Invalid value: " + i10);
        }

        public int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            StringBuilder sb2 = new StringBuilder(20);
            sb2.append(this.value);
            sb2.append(" (");
            sb2.append(name());
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11HTCapabilitiesElement$StbcSupport.class */
    public enum StbcSupport {
        NO_SUPPORT(0, "No support"),
        ONE_SPATIAL_STREAM(1, "One spatial stream is supported"),
        ONE_AND_TWO_SPATIAL_STREAMS(2, "One and two spatial streams are supported"),
        ONE_TWO_AND_THREE_SPATIAL_STREAMS(3, "One, two and three spatial streams are supported");

        private final String name;
        private final int value;

        StbcSupport(int i10, String str) {
            this.value = i10;
            this.name = str;
        }

        public static StbcSupport getInstance(int i10) {
            for (StbcSupport stbcSupport : values()) {
                if (stbcSupport.value == i10) {
                    return stbcSupport;
                }
            }
            throw new IllegalArgumentException("Invalid value: " + i10);
        }

        public String getName() {
            return this.name;
        }

        public int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            StringBuilder sb2 = new StringBuilder(60);
            sb2.append(this.value);
            sb2.append(" (");
            sb2.append(this.name);
            sb2.append(")");
            return sb2.toString();
        }
    }

    private Dot11HTCapabilitiesElement(Builder builder) {
        super(builder);
        if (builder == null || builder.smPowerSaveMode == null || builder.rxStbcSupport == null || builder.maxAMsduLength == null || builder.maxAMpduLength == null || builder.minMpduStartSpacing == null || builder.supportedRxMcsIndexes == null || builder.txMaxNumSpatialStreamsSupported == null || builder.pcoTransitionTime == null || builder.mcsFeedbackCapability == null || builder.calibration == null || builder.explicitTxBeamformingCsiFeedbackCapability == null || builder.explicitNoncompressedBeamformingFeedbackCapability == null || builder.explicitCompressedBeamformingFeedbackCapability == null || builder.minGrouping == null || builder.csiNumBeamformerAntennasSupported == null || builder.noncompressedSteeringNumBeamformerAntennasSupported == null || builder.compressedSteeringNumBeamformerAntennasSupported == null || builder.csiMaxNumRowsBeamformerSupported == null || builder.channelEstimationCapability == null) {
            throw new NullPointerException("builder: " + builder + " builder.smPowerSaveMode: " + builder.smPowerSaveMode + " builder.rxStbcSupport: " + builder.rxStbcSupport + " builder.maxAMsduLength: " + builder.maxAMsduLength + " builder.maxAMpduLength: " + builder.maxAMpduLength + " builder.minMpduStartSpacing: " + builder.minMpduStartSpacing + " builder.supportedRxMcsIndexes: " + builder.supportedRxMcsIndexes + " builder.txMaxNumSpatialStreamsSupported: " + builder.txMaxNumSpatialStreamsSupported + " builder.pcoTransitionTime: " + builder.pcoTransitionTime + " builder.mcsFeedbackCapability: " + builder.mcsFeedbackCapability + " builder.calibration: " + builder.calibration + " builder.explicitTxBeamformingCsiFeedbackCapability: " + builder.explicitTxBeamformingCsiFeedbackCapability + " builder.explicitNoncompressedBeamformingFeedbackCapability: " + builder.explicitNoncompressedBeamformingFeedbackCapability + " builder.explicitCompressedBeamformingFeedbackCapability: " + builder.explicitCompressedBeamformingFeedbackCapability + " builder.minGrouping: " + builder.minGrouping + " builder.csiNumBeamformerAntennasSupported: " + builder.csiNumBeamformerAntennasSupported + " builder.noncompressedSteeringNumBeamformerAntennasSupported: " + builder.noncompressedSteeringNumBeamformerAntennasSupported + " builder.compressedSteeringNumBeamformerAntennasSupported: " + builder.compressedSteeringNumBeamformerAntennasSupported + " builder.csiMaxNumRowsBeamformerSupported: " + builder.csiMaxNumRowsBeamformerSupported + " builder.channelEstimationCapability: " + builder.channelEstimationCapability);
        }
        if (builder.supportedRxMcsIndexes.length != 77) {
            throw new IllegalArgumentException("supportedRxMcsIndexes.length must be 77. builder.supportedRxMcsIndexes.length: " + builder.supportedRxMcsIndexes.length);
        }
        if ((builder.rxHighestSupportedDataRate & 64512) != 0) {
            throw new IllegalArgumentException("(rxHighestSupportedDataRate & 0xFC00) must be zero. builder.rxHighestSupportedDataRate: " + ((int) builder.rxHighestSupportedDataRate));
        }
        this.ldpcCodingSupported = builder.ldpcCodingSupported;
        this.both20and40MhzSupported = builder.both20and40MhzSupported;
        this.smPowerSaveMode = builder.smPowerSaveMode;
        this.htGreenfieldSupported = builder.htGreenfieldSupported;
        this.shortGiFor20MhzSupported = builder.shortGiFor20MhzSupported;
        this.shortGiFor40MhzSupported = builder.shortGiFor40MhzSupported;
        this.txStbcSupported = builder.txStbcSupported;
        this.rxStbcSupport = builder.rxStbcSupport;
        this.htDelayedBlockAckSupported = builder.htDelayedBlockAckSupported;
        this.maxAMsduLength = builder.maxAMsduLength;
        this.dsssCckModeIn40MhzSupported = builder.dsssCckModeIn40MhzSupported;
        this.bit13OfHtCapabilitiesInfo = builder.bit13OfHtCapabilitiesInfo;
        this.fortyMhzIntolerant = builder.fortyMhzIntolerant;
        this.lSigTxopProtectionSupported = builder.lSigTxopProtectionSupported;
        this.maxAMpduLength = builder.maxAMpduLength;
        this.minMpduStartSpacing = builder.minMpduStartSpacing;
        this.bit5OfAMpduParameters = builder.bit5OfAMpduParameters;
        this.bit6OfAMpduParameters = builder.bit6OfAMpduParameters;
        this.bit7OfAMpduParameters = builder.bit7OfAMpduParameters;
        this.supportedRxMcsIndexes = builder.supportedRxMcsIndexes;
        this.bit77OfSupportedMcsSet = builder.bit77OfSupportedMcsSet;
        this.bit78OfSupportedMcsSet = builder.bit78OfSupportedMcsSet;
        this.bit79OfSupportedMcsSet = builder.bit79OfSupportedMcsSet;
        this.rxHighestSupportedDataRate = builder.rxHighestSupportedDataRate;
        this.bit90OfSupportedMcsSet = builder.bit90OfSupportedMcsSet;
        this.bit91OfSupportedMcsSet = builder.bit91OfSupportedMcsSet;
        this.bit92OfSupportedMcsSet = builder.bit92OfSupportedMcsSet;
        this.bit93OfSupportedMcsSet = builder.bit93OfSupportedMcsSet;
        this.bit94OfSupportedMcsSet = builder.bit94OfSupportedMcsSet;
        this.bit95OfSupportedMcsSet = builder.bit95OfSupportedMcsSet;
        this.txMcsSetDefined = builder.txMcsSetDefined;
        this.txRxMcsSetNotEqual = builder.txRxMcsSetNotEqual;
        this.txMaxNumSpatialStreamsSupported = builder.txMaxNumSpatialStreamsSupported;
        this.txUnequalModulationSupported = builder.txUnequalModulationSupported;
        this.bit101OfSupportedMcsSet = builder.bit101OfSupportedMcsSet;
        this.bit102OfSupportedMcsSet = builder.bit102OfSupportedMcsSet;
        this.bit103OfSupportedMcsSet = builder.bit103OfSupportedMcsSet;
        this.bit104OfSupportedMcsSet = builder.bit104OfSupportedMcsSet;
        this.bit105OfSupportedMcsSet = builder.bit105OfSupportedMcsSet;
        this.bit106OfSupportedMcsSet = builder.bit106OfSupportedMcsSet;
        this.bit107OfSupportedMcsSet = builder.bit107OfSupportedMcsSet;
        this.bit108OfSupportedMcsSet = builder.bit108OfSupportedMcsSet;
        this.bit109OfSupportedMcsSet = builder.bit109OfSupportedMcsSet;
        this.bit110OfSupportedMcsSet = builder.bit110OfSupportedMcsSet;
        this.bit111OfSupportedMcsSet = builder.bit111OfSupportedMcsSet;
        this.bit112OfSupportedMcsSet = builder.bit112OfSupportedMcsSet;
        this.bit113OfSupportedMcsSet = builder.bit113OfSupportedMcsSet;
        this.bit114OfSupportedMcsSet = builder.bit114OfSupportedMcsSet;
        this.bit115OfSupportedMcsSet = builder.bit115OfSupportedMcsSet;
        this.bit116OfSupportedMcsSet = builder.bit116OfSupportedMcsSet;
        this.bit117OfSupportedMcsSet = builder.bit117OfSupportedMcsSet;
        this.bit118OfSupportedMcsSet = builder.bit118OfSupportedMcsSet;
        this.bit119OfSupportedMcsSet = builder.bit119OfSupportedMcsSet;
        this.bit120OfSupportedMcsSet = builder.bit120OfSupportedMcsSet;
        this.bit121OfSupportedMcsSet = builder.bit121OfSupportedMcsSet;
        this.bit122OfSupportedMcsSet = builder.bit122OfSupportedMcsSet;
        this.bit123OfSupportedMcsSet = builder.bit123OfSupportedMcsSet;
        this.bit124OfSupportedMcsSet = builder.bit124OfSupportedMcsSet;
        this.bit125OfSupportedMcsSet = builder.bit125OfSupportedMcsSet;
        this.bit126OfSupportedMcsSet = builder.bit126OfSupportedMcsSet;
        this.bit127OfSupportedMcsSet = builder.bit127OfSupportedMcsSet;
        this.pcoSupported = builder.pcoSupported;
        this.pcoTransitionTime = builder.pcoTransitionTime;
        this.bit3OfHtExtendedCapabilities = builder.bit3OfHtExtendedCapabilities;
        this.bit4OfHtExtendedCapabilities = builder.bit4OfHtExtendedCapabilities;
        this.bit5OfHtExtendedCapabilities = builder.bit5OfHtExtendedCapabilities;
        this.bit6OfHtExtendedCapabilities = builder.bit6OfHtExtendedCapabilities;
        this.bit7OfHtExtendedCapabilities = builder.bit7OfHtExtendedCapabilities;
        this.mcsFeedbackCapability = builder.mcsFeedbackCapability;
        this.htControlFieldSupported = builder.htControlFieldSupported;
        this.rdResponderSupported = builder.rdResponderSupported;
        this.bit12OfHtExtendedCapabilities = builder.bit12OfHtExtendedCapabilities;
        this.bit13OfHtExtendedCapabilities = builder.bit13OfHtExtendedCapabilities;
        this.bit14OfHtExtendedCapabilities = builder.bit14OfHtExtendedCapabilities;
        this.bit15OfHtExtendedCapabilities = builder.bit15OfHtExtendedCapabilities;
        this.implicitTxBeamformingReceivingSupported = builder.implicitTxBeamformingReceivingSupported;
        this.rxStaggeredSoundingSupported = builder.rxStaggeredSoundingSupported;
        this.txStaggeredSoundingSupported = builder.txStaggeredSoundingSupported;
        this.rxNdpSupported = builder.rxNdpSupported;
        this.txNdpSupported = builder.txNdpSupported;
        this.implicitTxBeamformingSupported = builder.implicitTxBeamformingSupported;
        this.calibration = builder.calibration;
        this.explicitCsiTxBeamformingSupported = builder.explicitCsiTxBeamformingSupported;
        this.explicitNoncompressedSteeringSupported = builder.explicitNoncompressedSteeringSupported;
        this.explicitCompressedSteeringSupported = builder.explicitCompressedSteeringSupported;
        this.explicitTxBeamformingCsiFeedbackCapability = builder.explicitTxBeamformingCsiFeedbackCapability;
        this.explicitNoncompressedBeamformingFeedbackCapability = builder.explicitNoncompressedBeamformingFeedbackCapability;
        this.explicitCompressedBeamformingFeedbackCapability = builder.explicitCompressedBeamformingFeedbackCapability;
        this.minGrouping = builder.minGrouping;
        this.csiNumBeamformerAntennasSupported = builder.csiNumBeamformerAntennasSupported;
        this.noncompressedSteeringNumBeamformerAntennasSupported = builder.noncompressedSteeringNumBeamformerAntennasSupported;
        this.compressedSteeringNumBeamformerAntennasSupported = builder.compressedSteeringNumBeamformerAntennasSupported;
        this.csiMaxNumRowsBeamformerSupported = builder.csiMaxNumRowsBeamformerSupported;
        this.channelEstimationCapability = builder.channelEstimationCapability;
        this.bit29OfTransmitBeamformingCapabilities = builder.bit29OfTransmitBeamformingCapabilities;
        this.bit30OfTransmitBeamformingCapabilities = builder.bit30OfTransmitBeamformingCapabilities;
        this.bit31OfTransmitBeamformingCapabilities = builder.bit31OfTransmitBeamformingCapabilities;
        this.antennaSelectionSupported = builder.antennaSelectionSupported;
        this.explicitCsiFeedbackBasedTxAselSupported = builder.explicitCsiFeedbackBasedTxAselSupported;
        this.antennaIndicesFeedbackBasedTxAselSupported = builder.antennaIndicesFeedbackBasedTxAselSupported;
        this.explicitCsiFeedbackSupported = builder.explicitCsiFeedbackSupported;
        this.antennaIndicesFeedbackSupported = builder.antennaIndicesFeedbackSupported;
        this.rxAselSupported = builder.rxAselSupported;
        this.txSoundingPpdusSupported = builder.txSoundingPpdusSupported;
        this.bit7OfAselCapability = builder.bit7OfAselCapability;
    }

    private Dot11HTCapabilitiesElement(byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11, Dot11InformationElementId.HT_CAPABILITIES);
        if (getLengthAsInt() != 26) {
            throw new IllegalRawDataException("The length must be 26 but is actually: " + getLengthAsInt());
        }
        byte b10 = bArr[i10 + 2];
        this.ldpcCodingSupported = (b10 & 1) != 0;
        this.both20and40MhzSupported = (b10 & 2) != 0;
        this.smPowerSaveMode = SmPowerSaveMode.getInstance((b10 >> 2) & 3);
        this.htGreenfieldSupported = (b10 & 16) != 0;
        this.shortGiFor20MhzSupported = (b10 & 32) != 0;
        this.shortGiFor40MhzSupported = (b10 & 64) != 0;
        this.txStbcSupported = (b10 & 128) != 0;
        byte b11 = bArr[i10 + 3];
        this.rxStbcSupport = StbcSupport.getInstance(b11 & 3);
        this.htDelayedBlockAckSupported = (b11 & 4) != 0;
        this.maxAMsduLength = AMsduLength.getInstance((b11 >> 3) & 1);
        this.dsssCckModeIn40MhzSupported = (b11 & 16) != 0;
        this.bit13OfHtCapabilitiesInfo = (b11 & 32) != 0;
        this.fortyMhzIntolerant = (b11 & 64) != 0;
        this.lSigTxopProtectionSupported = (b11 & 128) != 0;
        byte b12 = bArr[i10 + 4];
        this.maxAMpduLength = AMpduLength.getInstance(b12 & 3);
        this.minMpduStartSpacing = MpduStartSpacing.getInstance((b12 >> 2) & 7);
        this.bit5OfAMpduParameters = (b12 & 32) != 0;
        this.bit6OfAMpduParameters = (b12 & 64) != 0;
        this.bit7OfAMpduParameters = (b12 & 128) != 0;
        this.supportedRxMcsIndexes = new boolean[77];
        for (int i12 = 0; i12 < 9; i12++) {
            byte b13 = bArr[i10 + 5 + i12];
            for (int i13 = 0; i13 < 8; i13++) {
                this.supportedRxMcsIndexes[(i12 * 8) + i13] = (b13 & 1) != 0;
                b13 = (byte) (b13 >> 1);
            }
        }
        byte b14 = bArr[i10 + 14];
        for (int i14 = 0; i14 < 5; i14++) {
            this.supportedRxMcsIndexes[i14 + 72] = (b14 & 1) != 0;
            b14 = (byte) (b14 >> 1);
        }
        this.bit77OfSupportedMcsSet = (b14 & 1) != 0;
        this.bit78OfSupportedMcsSet = (b14 & 2) != 0;
        this.bit79OfSupportedMcsSet = (b14 & 4) != 0;
        byte b15 = bArr[i10 + 16];
        this.rxHighestSupportedDataRate = (short) ((bArr[i10 + 15] | (b15 << 8)) & RCommandClient.MAX_CLIENT_PORT);
        this.bit90OfSupportedMcsSet = (b15 & 4) != 0;
        this.bit91OfSupportedMcsSet = (b15 & 8) != 0;
        this.bit92OfSupportedMcsSet = (b15 & 16) != 0;
        this.bit93OfSupportedMcsSet = (b15 & 32) != 0;
        this.bit94OfSupportedMcsSet = (b15 & 64) != 0;
        this.bit95OfSupportedMcsSet = (b15 & 128) != 0;
        byte b16 = bArr[i10 + 17];
        this.txMcsSetDefined = (b16 & 1) != 0;
        this.txRxMcsSetNotEqual = (b16 & 2) != 0;
        this.txMaxNumSpatialStreamsSupported = NumSpatialStreams.getInstance((b16 >> 2) & 3);
        this.txUnequalModulationSupported = (b16 & 16) != 0;
        this.bit101OfSupportedMcsSet = (b16 & 32) != 0;
        this.bit102OfSupportedMcsSet = (b16 & 64) != 0;
        this.bit103OfSupportedMcsSet = (b16 & 128) != 0;
        byte b17 = bArr[i10 + 18];
        this.bit104OfSupportedMcsSet = (b17 & 1) != 0;
        this.bit105OfSupportedMcsSet = (b17 & 2) != 0;
        this.bit106OfSupportedMcsSet = (b17 & 4) != 0;
        this.bit107OfSupportedMcsSet = (b17 & 8) != 0;
        this.bit108OfSupportedMcsSet = (b17 & 16) != 0;
        this.bit109OfSupportedMcsSet = (b17 & 32) != 0;
        this.bit110OfSupportedMcsSet = (b17 & 64) != 0;
        this.bit111OfSupportedMcsSet = (b17 & 128) != 0;
        byte b18 = bArr[i10 + 19];
        this.bit112OfSupportedMcsSet = (b18 & 1) != 0;
        this.bit113OfSupportedMcsSet = (b18 & 2) != 0;
        this.bit114OfSupportedMcsSet = (b18 & 4) != 0;
        this.bit115OfSupportedMcsSet = (b18 & 8) != 0;
        this.bit116OfSupportedMcsSet = (b18 & 16) != 0;
        this.bit117OfSupportedMcsSet = (b18 & 32) != 0;
        this.bit118OfSupportedMcsSet = (b18 & 64) != 0;
        this.bit119OfSupportedMcsSet = (b18 & 128) != 0;
        byte b19 = bArr[i10 + 20];
        this.bit120OfSupportedMcsSet = (b19 & 1) != 0;
        this.bit121OfSupportedMcsSet = (b19 & 2) != 0;
        this.bit122OfSupportedMcsSet = (b19 & 4) != 0;
        this.bit123OfSupportedMcsSet = (b19 & 8) != 0;
        this.bit124OfSupportedMcsSet = (b19 & 16) != 0;
        this.bit125OfSupportedMcsSet = (b19 & 32) != 0;
        this.bit126OfSupportedMcsSet = (b19 & 64) != 0;
        this.bit127OfSupportedMcsSet = (b19 & 128) != 0;
        byte b20 = bArr[i10 + 21];
        this.pcoSupported = (b20 & 1) != 0;
        this.pcoTransitionTime = PcoTransitionTime.getInstance((b20 >> 1) & 3);
        this.bit3OfHtExtendedCapabilities = (b20 & 8) != 0;
        this.bit4OfHtExtendedCapabilities = (b20 & 16) != 0;
        this.bit5OfHtExtendedCapabilities = (b20 & 32) != 0;
        this.bit6OfHtExtendedCapabilities = (b20 & 64) != 0;
        this.bit7OfHtExtendedCapabilities = (b20 & 128) != 0;
        byte b21 = bArr[i10 + 22];
        this.mcsFeedbackCapability = McsFeedbackCapability.getInstance(b21 & 3);
        this.htControlFieldSupported = (b21 & 4) != 0;
        this.rdResponderSupported = (b21 & 8) != 0;
        this.bit12OfHtExtendedCapabilities = (b21 & 16) != 0;
        this.bit13OfHtExtendedCapabilities = (b21 & 32) != 0;
        this.bit14OfHtExtendedCapabilities = (b21 & 64) != 0;
        this.bit15OfHtExtendedCapabilities = (b21 & 128) != 0;
        byte b22 = bArr[i10 + 23];
        this.implicitTxBeamformingReceivingSupported = (b22 & 1) != 0;
        this.rxStaggeredSoundingSupported = (b22 & 2) != 0;
        this.txStaggeredSoundingSupported = (b22 & 4) != 0;
        this.rxNdpSupported = (b22 & 8) != 0;
        this.txNdpSupported = (b22 & 16) != 0;
        this.implicitTxBeamformingSupported = (b22 & 32) != 0;
        this.calibration = Calibration.getInstance((b22 >> 6) & 3);
        int i15 = ByteArrays.getInt(bArr, i10 + 24, ByteOrder.LITTLE_ENDIAN);
        this.explicitCsiTxBeamformingSupported = (i15 & 1) != 0;
        this.explicitNoncompressedSteeringSupported = (i15 & 2) != 0;
        this.explicitCompressedSteeringSupported = (i15 & 4) != 0;
        this.explicitTxBeamformingCsiFeedbackCapability = BeamformingFeedbackCapability.getInstance((i15 >> 3) & 3);
        this.explicitNoncompressedBeamformingFeedbackCapability = BeamformingFeedbackCapability.getInstance((i15 >> 5) & 3);
        this.explicitCompressedBeamformingFeedbackCapability = BeamformingFeedbackCapability.getInstance((i15 >> 7) & 3);
        this.minGrouping = Grouping.getInstance((i15 >> 9) & 3);
        this.csiNumBeamformerAntennasSupported = NumBeamformerAntennas.getInstance((i15 >> 11) & 3);
        this.noncompressedSteeringNumBeamformerAntennasSupported = NumBeamformerAntennas.getInstance((i15 >> 13) & 3);
        this.compressedSteeringNumBeamformerAntennasSupported = NumBeamformerAntennas.getInstance((i15 >> 15) & 3);
        this.csiMaxNumRowsBeamformerSupported = CsiNumRows.getInstance((i15 >> 17) & 3);
        this.channelEstimationCapability = ChannelEstimationCapability.getInstance((i15 >> 19) & 3);
        this.bit29OfTransmitBeamformingCapabilities = (2097152 & i15) != 0;
        this.bit30OfTransmitBeamformingCapabilities = (4194304 & i15) != 0;
        this.bit31OfTransmitBeamformingCapabilities = (8388608 & i15) != 0;
        this.antennaSelectionSupported = (16777216 & i15) != 0;
        this.explicitCsiFeedbackBasedTxAselSupported = (33554432 & i15) != 0;
        this.antennaIndicesFeedbackBasedTxAselSupported = (67108864 & i15) != 0;
        this.explicitCsiFeedbackSupported = (134217728 & i15) != 0;
        this.antennaIndicesFeedbackSupported = (268435456 & i15) != 0;
        this.rxAselSupported = (536870912 & i15) != 0;
        this.txSoundingPpdusSupported = (1073741824 & i15) != 0;
        this.bit7OfAselCapability = (i15 & NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION) != 0;
    }

    public static Dot11HTCapabilitiesElement newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new Dot11HTCapabilitiesElement(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || Dot11HTCapabilitiesElement.class != obj.getClass()) {
            return false;
        }
        Dot11HTCapabilitiesElement dot11HTCapabilitiesElement = (Dot11HTCapabilitiesElement) obj;
        return this.antennaIndicesFeedbackBasedTxAselSupported == dot11HTCapabilitiesElement.antennaIndicesFeedbackBasedTxAselSupported && this.antennaIndicesFeedbackSupported == dot11HTCapabilitiesElement.antennaIndicesFeedbackSupported && this.antennaSelectionSupported == dot11HTCapabilitiesElement.antennaSelectionSupported && this.bit101OfSupportedMcsSet == dot11HTCapabilitiesElement.bit101OfSupportedMcsSet && this.bit102OfSupportedMcsSet == dot11HTCapabilitiesElement.bit102OfSupportedMcsSet && this.bit103OfSupportedMcsSet == dot11HTCapabilitiesElement.bit103OfSupportedMcsSet && this.bit104OfSupportedMcsSet == dot11HTCapabilitiesElement.bit104OfSupportedMcsSet && this.bit105OfSupportedMcsSet == dot11HTCapabilitiesElement.bit105OfSupportedMcsSet && this.bit106OfSupportedMcsSet == dot11HTCapabilitiesElement.bit106OfSupportedMcsSet && this.bit107OfSupportedMcsSet == dot11HTCapabilitiesElement.bit107OfSupportedMcsSet && this.bit108OfSupportedMcsSet == dot11HTCapabilitiesElement.bit108OfSupportedMcsSet && this.bit109OfSupportedMcsSet == dot11HTCapabilitiesElement.bit109OfSupportedMcsSet && this.bit110OfSupportedMcsSet == dot11HTCapabilitiesElement.bit110OfSupportedMcsSet && this.bit111OfSupportedMcsSet == dot11HTCapabilitiesElement.bit111OfSupportedMcsSet && this.bit112OfSupportedMcsSet == dot11HTCapabilitiesElement.bit112OfSupportedMcsSet && this.bit113OfSupportedMcsSet == dot11HTCapabilitiesElement.bit113OfSupportedMcsSet && this.bit114OfSupportedMcsSet == dot11HTCapabilitiesElement.bit114OfSupportedMcsSet && this.bit115OfSupportedMcsSet == dot11HTCapabilitiesElement.bit115OfSupportedMcsSet && this.bit116OfSupportedMcsSet == dot11HTCapabilitiesElement.bit116OfSupportedMcsSet && this.bit117OfSupportedMcsSet == dot11HTCapabilitiesElement.bit117OfSupportedMcsSet && this.bit118OfSupportedMcsSet == dot11HTCapabilitiesElement.bit118OfSupportedMcsSet && this.bit119OfSupportedMcsSet == dot11HTCapabilitiesElement.bit119OfSupportedMcsSet && this.bit120OfSupportedMcsSet == dot11HTCapabilitiesElement.bit120OfSupportedMcsSet && this.bit121OfSupportedMcsSet == dot11HTCapabilitiesElement.bit121OfSupportedMcsSet && this.bit122OfSupportedMcsSet == dot11HTCapabilitiesElement.bit122OfSupportedMcsSet && this.bit123OfSupportedMcsSet == dot11HTCapabilitiesElement.bit123OfSupportedMcsSet && this.bit124OfSupportedMcsSet == dot11HTCapabilitiesElement.bit124OfSupportedMcsSet && this.bit125OfSupportedMcsSet == dot11HTCapabilitiesElement.bit125OfSupportedMcsSet && this.bit126OfSupportedMcsSet == dot11HTCapabilitiesElement.bit126OfSupportedMcsSet && this.bit127OfSupportedMcsSet == dot11HTCapabilitiesElement.bit127OfSupportedMcsSet && this.bit12OfHtExtendedCapabilities == dot11HTCapabilitiesElement.bit12OfHtExtendedCapabilities && this.bit13OfHtCapabilitiesInfo == dot11HTCapabilitiesElement.bit13OfHtCapabilitiesInfo && this.bit13OfHtExtendedCapabilities == dot11HTCapabilitiesElement.bit13OfHtExtendedCapabilities && this.bit14OfHtExtendedCapabilities == dot11HTCapabilitiesElement.bit14OfHtExtendedCapabilities && this.bit15OfHtExtendedCapabilities == dot11HTCapabilitiesElement.bit15OfHtExtendedCapabilities && this.bit29OfTransmitBeamformingCapabilities == dot11HTCapabilitiesElement.bit29OfTransmitBeamformingCapabilities && this.bit30OfTransmitBeamformingCapabilities == dot11HTCapabilitiesElement.bit30OfTransmitBeamformingCapabilities && this.bit31OfTransmitBeamformingCapabilities == dot11HTCapabilitiesElement.bit31OfTransmitBeamformingCapabilities && this.bit3OfHtExtendedCapabilities == dot11HTCapabilitiesElement.bit3OfHtExtendedCapabilities && this.bit4OfHtExtendedCapabilities == dot11HTCapabilitiesElement.bit4OfHtExtendedCapabilities && this.bit5OfAMpduParameters == dot11HTCapabilitiesElement.bit5OfAMpduParameters && this.bit5OfHtExtendedCapabilities == dot11HTCapabilitiesElement.bit5OfHtExtendedCapabilities && this.bit6OfAMpduParameters == dot11HTCapabilitiesElement.bit6OfAMpduParameters && this.bit6OfHtExtendedCapabilities == dot11HTCapabilitiesElement.bit6OfHtExtendedCapabilities && this.bit77OfSupportedMcsSet == dot11HTCapabilitiesElement.bit77OfSupportedMcsSet && this.bit78OfSupportedMcsSet == dot11HTCapabilitiesElement.bit78OfSupportedMcsSet && this.bit79OfSupportedMcsSet == dot11HTCapabilitiesElement.bit79OfSupportedMcsSet && this.bit7OfAMpduParameters == dot11HTCapabilitiesElement.bit7OfAMpduParameters && this.bit7OfAselCapability == dot11HTCapabilitiesElement.bit7OfAselCapability && this.bit7OfHtExtendedCapabilities == dot11HTCapabilitiesElement.bit7OfHtExtendedCapabilities && this.bit90OfSupportedMcsSet == dot11HTCapabilitiesElement.bit90OfSupportedMcsSet && this.bit91OfSupportedMcsSet == dot11HTCapabilitiesElement.bit91OfSupportedMcsSet && this.bit92OfSupportedMcsSet == dot11HTCapabilitiesElement.bit92OfSupportedMcsSet && this.bit93OfSupportedMcsSet == dot11HTCapabilitiesElement.bit93OfSupportedMcsSet && this.bit94OfSupportedMcsSet == dot11HTCapabilitiesElement.bit94OfSupportedMcsSet && this.bit95OfSupportedMcsSet == dot11HTCapabilitiesElement.bit95OfSupportedMcsSet && this.both20and40MhzSupported == dot11HTCapabilitiesElement.both20and40MhzSupported && this.calibration == dot11HTCapabilitiesElement.calibration && this.channelEstimationCapability == dot11HTCapabilitiesElement.channelEstimationCapability && this.compressedSteeringNumBeamformerAntennasSupported == dot11HTCapabilitiesElement.compressedSteeringNumBeamformerAntennasSupported && this.csiMaxNumRowsBeamformerSupported == dot11HTCapabilitiesElement.csiMaxNumRowsBeamformerSupported && this.csiNumBeamformerAntennasSupported == dot11HTCapabilitiesElement.csiNumBeamformerAntennasSupported && this.dsssCckModeIn40MhzSupported == dot11HTCapabilitiesElement.dsssCckModeIn40MhzSupported && this.explicitCompressedBeamformingFeedbackCapability == dot11HTCapabilitiesElement.explicitCompressedBeamformingFeedbackCapability && this.explicitCompressedSteeringSupported == dot11HTCapabilitiesElement.explicitCompressedSteeringSupported && this.explicitCsiFeedbackBasedTxAselSupported == dot11HTCapabilitiesElement.explicitCsiFeedbackBasedTxAselSupported && this.explicitCsiFeedbackSupported == dot11HTCapabilitiesElement.explicitCsiFeedbackSupported && this.explicitCsiTxBeamformingSupported == dot11HTCapabilitiesElement.explicitCsiTxBeamformingSupported && this.explicitNoncompressedBeamformingFeedbackCapability == dot11HTCapabilitiesElement.explicitNoncompressedBeamformingFeedbackCapability && this.explicitNoncompressedSteeringSupported == dot11HTCapabilitiesElement.explicitNoncompressedSteeringSupported && this.explicitTxBeamformingCsiFeedbackCapability == dot11HTCapabilitiesElement.explicitTxBeamformingCsiFeedbackCapability && this.fortyMhzIntolerant == dot11HTCapabilitiesElement.fortyMhzIntolerant && this.htControlFieldSupported == dot11HTCapabilitiesElement.htControlFieldSupported && this.htDelayedBlockAckSupported == dot11HTCapabilitiesElement.htDelayedBlockAckSupported && this.htGreenfieldSupported == dot11HTCapabilitiesElement.htGreenfieldSupported && this.implicitTxBeamformingReceivingSupported == dot11HTCapabilitiesElement.implicitTxBeamformingReceivingSupported && this.implicitTxBeamformingSupported == dot11HTCapabilitiesElement.implicitTxBeamformingSupported && this.lSigTxopProtectionSupported == dot11HTCapabilitiesElement.lSigTxopProtectionSupported && this.ldpcCodingSupported == dot11HTCapabilitiesElement.ldpcCodingSupported && this.maxAMpduLength == dot11HTCapabilitiesElement.maxAMpduLength && this.maxAMsduLength == dot11HTCapabilitiesElement.maxAMsduLength && this.mcsFeedbackCapability == dot11HTCapabilitiesElement.mcsFeedbackCapability && this.minGrouping == dot11HTCapabilitiesElement.minGrouping && this.minMpduStartSpacing == dot11HTCapabilitiesElement.minMpduStartSpacing && this.noncompressedSteeringNumBeamformerAntennasSupported == dot11HTCapabilitiesElement.noncompressedSteeringNumBeamformerAntennasSupported && this.pcoSupported == dot11HTCapabilitiesElement.pcoSupported && this.pcoTransitionTime == dot11HTCapabilitiesElement.pcoTransitionTime && this.rdResponderSupported == dot11HTCapabilitiesElement.rdResponderSupported && this.rxAselSupported == dot11HTCapabilitiesElement.rxAselSupported && this.rxHighestSupportedDataRate == dot11HTCapabilitiesElement.rxHighestSupportedDataRate && this.rxNdpSupported == dot11HTCapabilitiesElement.rxNdpSupported && this.rxStaggeredSoundingSupported == dot11HTCapabilitiesElement.rxStaggeredSoundingSupported && this.rxStbcSupport == dot11HTCapabilitiesElement.rxStbcSupport && this.shortGiFor20MhzSupported == dot11HTCapabilitiesElement.shortGiFor20MhzSupported && this.shortGiFor40MhzSupported == dot11HTCapabilitiesElement.shortGiFor40MhzSupported && this.smPowerSaveMode == dot11HTCapabilitiesElement.smPowerSaveMode && Arrays.equals(this.supportedRxMcsIndexes, dot11HTCapabilitiesElement.supportedRxMcsIndexes) && this.txMaxNumSpatialStreamsSupported == dot11HTCapabilitiesElement.txMaxNumSpatialStreamsSupported && this.txMcsSetDefined == dot11HTCapabilitiesElement.txMcsSetDefined && this.txNdpSupported == dot11HTCapabilitiesElement.txNdpSupported && this.txRxMcsSetNotEqual == dot11HTCapabilitiesElement.txRxMcsSetNotEqual && this.txSoundingPpdusSupported == dot11HTCapabilitiesElement.txSoundingPpdusSupported && this.txStaggeredSoundingSupported == dot11HTCapabilitiesElement.txStaggeredSoundingSupported && this.txStbcSupported == dot11HTCapabilitiesElement.txStbcSupported && this.txUnequalModulationSupported == dot11HTCapabilitiesElement.txUnequalModulationSupported;
    }

    public boolean getBit101OfSupportedMcsSet() {
        return this.bit101OfSupportedMcsSet;
    }

    public boolean getBit102OfSupportedMcsSet() {
        return this.bit102OfSupportedMcsSet;
    }

    public boolean getBit103OfSupportedMcsSet() {
        return this.bit103OfSupportedMcsSet;
    }

    public boolean getBit104OfSupportedMcsSet() {
        return this.bit104OfSupportedMcsSet;
    }

    public boolean getBit105OfSupportedMcsSet() {
        return this.bit105OfSupportedMcsSet;
    }

    public boolean getBit106OfSupportedMcsSet() {
        return this.bit106OfSupportedMcsSet;
    }

    public boolean getBit107OfSupportedMcsSet() {
        return this.bit107OfSupportedMcsSet;
    }

    public boolean getBit108OfSupportedMcsSet() {
        return this.bit108OfSupportedMcsSet;
    }

    public boolean getBit109OfSupportedMcsSet() {
        return this.bit109OfSupportedMcsSet;
    }

    public boolean getBit110OfSupportedMcsSet() {
        return this.bit110OfSupportedMcsSet;
    }

    public boolean getBit111OfSupportedMcsSet() {
        return this.bit111OfSupportedMcsSet;
    }

    public boolean getBit112OfSupportedMcsSet() {
        return this.bit112OfSupportedMcsSet;
    }

    public boolean getBit113OfSupportedMcsSet() {
        return this.bit113OfSupportedMcsSet;
    }

    public boolean getBit114OfSupportedMcsSet() {
        return this.bit114OfSupportedMcsSet;
    }

    public boolean getBit115OfSupportedMcsSet() {
        return this.bit115OfSupportedMcsSet;
    }

    public boolean getBit116OfSupportedMcsSet() {
        return this.bit116OfSupportedMcsSet;
    }

    public boolean getBit117OfSupportedMcsSet() {
        return this.bit117OfSupportedMcsSet;
    }

    public boolean getBit118OfSupportedMcsSet() {
        return this.bit118OfSupportedMcsSet;
    }

    public boolean getBit119OfSupportedMcsSet() {
        return this.bit119OfSupportedMcsSet;
    }

    public boolean getBit120OfSupportedMcsSet() {
        return this.bit120OfSupportedMcsSet;
    }

    public boolean getBit121OfSupportedMcsSet() {
        return this.bit121OfSupportedMcsSet;
    }

    public boolean getBit122OfSupportedMcsSet() {
        return this.bit122OfSupportedMcsSet;
    }

    public boolean getBit123OfSupportedMcsSet() {
        return this.bit123OfSupportedMcsSet;
    }

    public boolean getBit124OfSupportedMcsSet() {
        return this.bit124OfSupportedMcsSet;
    }

    public boolean getBit125OfSupportedMcsSet() {
        return this.bit125OfSupportedMcsSet;
    }

    public boolean getBit126OfSupportedMcsSet() {
        return this.bit126OfSupportedMcsSet;
    }

    public boolean getBit127OfSupportedMcsSet() {
        return this.bit127OfSupportedMcsSet;
    }

    public boolean getBit12OfHtExtendedCapabilities() {
        return this.bit12OfHtExtendedCapabilities;
    }

    public boolean getBit13OfHtCapabilitiesInfo() {
        return this.bit13OfHtCapabilitiesInfo;
    }

    public boolean getBit13OfHtExtendedCapabilities() {
        return this.bit13OfHtExtendedCapabilities;
    }

    public boolean getBit14OfHtExtendedCapabilities() {
        return this.bit14OfHtExtendedCapabilities;
    }

    public boolean getBit15OfHtExtendedCapabilities() {
        return this.bit15OfHtExtendedCapabilities;
    }

    public boolean getBit29OfTransmitBeamformingCapabilities() {
        return this.bit29OfTransmitBeamformingCapabilities;
    }

    public boolean getBit30OfTransmitBeamformingCapabilities() {
        return this.bit30OfTransmitBeamformingCapabilities;
    }

    public boolean getBit31OfTransmitBeamformingCapabilities() {
        return this.bit31OfTransmitBeamformingCapabilities;
    }

    public boolean getBit3OfHtExtendedCapabilities() {
        return this.bit3OfHtExtendedCapabilities;
    }

    public boolean getBit4OfHtExtendedCapabilities() {
        return this.bit4OfHtExtendedCapabilities;
    }

    public boolean getBit5OfAMpduParameters() {
        return this.bit5OfAMpduParameters;
    }

    public boolean getBit5OfHtExtendedCapabilities() {
        return this.bit5OfHtExtendedCapabilities;
    }

    public boolean getBit6OfAMpduParameters() {
        return this.bit6OfAMpduParameters;
    }

    public boolean getBit6OfHtExtendedCapabilities() {
        return this.bit6OfHtExtendedCapabilities;
    }

    public boolean getBit77OfSupportedMcsSet() {
        return this.bit77OfSupportedMcsSet;
    }

    public boolean getBit78OfSupportedMcsSet() {
        return this.bit78OfSupportedMcsSet;
    }

    public boolean getBit79OfSupportedMcsSet() {
        return this.bit79OfSupportedMcsSet;
    }

    public boolean getBit7OfAMpduParameters() {
        return this.bit7OfAMpduParameters;
    }

    public boolean getBit7OfAselCapability() {
        return this.bit7OfAselCapability;
    }

    public boolean getBit7OfHtExtendedCapabilities() {
        return this.bit7OfHtExtendedCapabilities;
    }

    public boolean getBit90OfSupportedMcsSet() {
        return this.bit90OfSupportedMcsSet;
    }

    public boolean getBit91OfSupportedMcsSet() {
        return this.bit91OfSupportedMcsSet;
    }

    public boolean getBit92OfSupportedMcsSet() {
        return this.bit92OfSupportedMcsSet;
    }

    public boolean getBit93OfSupportedMcsSet() {
        return this.bit93OfSupportedMcsSet;
    }

    public boolean getBit94OfSupportedMcsSet() {
        return this.bit94OfSupportedMcsSet;
    }

    public boolean getBit95OfSupportedMcsSet() {
        return this.bit95OfSupportedMcsSet;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public Calibration getCalibration() {
        return this.calibration;
    }

    public ChannelEstimationCapability getChannelEstimationCapability() {
        return this.channelEstimationCapability;
    }

    public NumBeamformerAntennas getCompressedSteeringNumBeamformerAntennasSupported() {
        return this.compressedSteeringNumBeamformerAntennasSupported;
    }

    public CsiNumRows getCsiMaxNumRowsBeamformerSupported() {
        return this.csiMaxNumRowsBeamformerSupported;
    }

    public NumBeamformerAntennas getCsiNumBeamformerAntennasSupported() {
        return this.csiNumBeamformerAntennasSupported;
    }

    public BeamformingFeedbackCapability getExplicitCompressedBeamformingFeedbackCapability() {
        return this.explicitCompressedBeamformingFeedbackCapability;
    }

    public BeamformingFeedbackCapability getExplicitNoncompressedBeamformingFeedbackCapability() {
        return this.explicitNoncompressedBeamformingFeedbackCapability;
    }

    public BeamformingFeedbackCapability getExplicitTxBeamformingCsiFeedbackCapability() {
        return this.explicitTxBeamformingCsiFeedbackCapability;
    }

    public AMpduLength getMaxAMpduLength() {
        return this.maxAMpduLength;
    }

    public AMsduLength getMaxAMsduLength() {
        return this.maxAMsduLength;
    }

    public McsFeedbackCapability getMcsFeedbackCapability() {
        return this.mcsFeedbackCapability;
    }

    public Grouping getMinGrouping() {
        return this.minGrouping;
    }

    public MpduStartSpacing getMinMpduStartSpacing() {
        return this.minMpduStartSpacing;
    }

    public NumBeamformerAntennas getNoncompressedSteeringNumBeamformerAntennasSupported() {
        return this.noncompressedSteeringNumBeamformerAntennasSupported;
    }

    public PcoTransitionTime getPcoTransitionTime() {
        return this.pcoTransitionTime;
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = getElementId().value().byteValue();
        bArr[1] = getLength();
        byte b10 = (byte) (this.smPowerSaveMode.value << 2);
        bArr[2] = b10;
        if (this.ldpcCodingSupported) {
            bArr[2] = (byte) (b10 | 1);
        }
        if (this.both20and40MhzSupported) {
            bArr[2] = (byte) (bArr[2] | 2);
        }
        if (this.htGreenfieldSupported) {
            bArr[2] = (byte) (bArr[2] | 16);
        }
        if (this.shortGiFor20MhzSupported) {
            bArr[2] = (byte) (bArr[2] | 32);
        }
        if (this.shortGiFor40MhzSupported) {
            bArr[2] = (byte) (bArr[2] | 64);
        }
        if (this.txStbcSupported) {
            bArr[2] = (byte) (bArr[2] | 128);
        }
        byte b11 = (byte) (this.rxStbcSupport.value | (this.maxAMsduLength.value << 3));
        bArr[3] = b11;
        if (this.htDelayedBlockAckSupported) {
            bArr[3] = (byte) (b11 | 4);
        }
        if (this.dsssCckModeIn40MhzSupported) {
            bArr[3] = (byte) (bArr[3] | 16);
        }
        if (this.bit13OfHtCapabilitiesInfo) {
            bArr[3] = (byte) (bArr[3] | 32);
        }
        if (this.fortyMhzIntolerant) {
            bArr[3] = (byte) (bArr[3] | 64);
        }
        if (this.lSigTxopProtectionSupported) {
            bArr[3] = (byte) (bArr[3] | 128);
        }
        byte b12 = (byte) (this.maxAMpduLength.value | (this.minMpduStartSpacing.value << 2));
        bArr[4] = b12;
        if (this.bit5OfAMpduParameters) {
            bArr[4] = (byte) (b12 | 32);
        }
        if (this.bit6OfAMpduParameters) {
            bArr[4] = (byte) (bArr[4] | 64);
        }
        if (this.bit7OfAMpduParameters) {
            bArr[4] = (byte) (bArr[4] | 128);
        }
        int i10 = 0;
        while (true) {
            boolean[] zArr = this.supportedRxMcsIndexes;
            if (i10 >= zArr.length) {
                if (this.bit77OfSupportedMcsSet) {
                    bArr[14] = (byte) (bArr[14] | 32);
                }
                if (this.bit78OfSupportedMcsSet) {
                    bArr[14] = (byte) (bArr[14] | 64);
                }
                if (this.bit79OfSupportedMcsSet) {
                    bArr[14] = (byte) (bArr[14] | 128);
                }
                short s10 = this.rxHighestSupportedDataRate;
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                System.arraycopy(ByteArrays.toByteArray(s10, byteOrder), 0, bArr, 15, 2);
                if (this.bit90OfSupportedMcsSet) {
                    bArr[16] = (byte) (bArr[16] | 4);
                }
                if (this.bit91OfSupportedMcsSet) {
                    bArr[16] = (byte) (bArr[16] | 8);
                }
                if (this.bit92OfSupportedMcsSet) {
                    bArr[16] = (byte) (bArr[16] | 16);
                }
                if (this.bit93OfSupportedMcsSet) {
                    bArr[16] = (byte) (bArr[16] | 32);
                }
                if (this.bit94OfSupportedMcsSet) {
                    bArr[16] = (byte) (bArr[16] | 64);
                }
                if (this.bit95OfSupportedMcsSet) {
                    bArr[16] = (byte) (bArr[16] | 128);
                }
                byte b13 = (byte) (this.txMaxNumSpatialStreamsSupported.value << 2);
                bArr[17] = b13;
                if (this.txMcsSetDefined) {
                    bArr[17] = (byte) (b13 | 1);
                }
                if (this.txRxMcsSetNotEqual) {
                    bArr[17] = (byte) (bArr[17] | 2);
                }
                if (this.txUnequalModulationSupported) {
                    bArr[17] = (byte) (bArr[17] | 16);
                }
                if (this.bit101OfSupportedMcsSet) {
                    bArr[17] = (byte) (bArr[17] | 32);
                }
                if (this.bit102OfSupportedMcsSet) {
                    bArr[17] = (byte) (bArr[17] | 64);
                }
                if (this.bit103OfSupportedMcsSet) {
                    bArr[17] = (byte) (bArr[17] | 128);
                }
                if (this.bit104OfSupportedMcsSet) {
                    bArr[18] = (byte) (bArr[18] | 1);
                }
                if (this.bit105OfSupportedMcsSet) {
                    bArr[18] = (byte) (bArr[18] | 2);
                }
                if (this.bit106OfSupportedMcsSet) {
                    bArr[18] = (byte) (bArr[18] | 4);
                }
                if (this.bit107OfSupportedMcsSet) {
                    bArr[18] = (byte) (bArr[18] | 8);
                }
                if (this.bit108OfSupportedMcsSet) {
                    bArr[18] = (byte) (bArr[18] | 16);
                }
                if (this.bit109OfSupportedMcsSet) {
                    bArr[18] = (byte) (bArr[18] | 32);
                }
                if (this.bit110OfSupportedMcsSet) {
                    bArr[18] = (byte) (bArr[18] | 64);
                }
                if (this.bit111OfSupportedMcsSet) {
                    bArr[18] = (byte) (bArr[18] | 128);
                }
                if (this.bit112OfSupportedMcsSet) {
                    bArr[19] = (byte) (bArr[19] | 1);
                }
                if (this.bit113OfSupportedMcsSet) {
                    bArr[19] = (byte) (bArr[19] | 2);
                }
                if (this.bit114OfSupportedMcsSet) {
                    bArr[19] = (byte) (bArr[19] | 4);
                }
                if (this.bit115OfSupportedMcsSet) {
                    bArr[19] = (byte) (bArr[19] | 8);
                }
                if (this.bit116OfSupportedMcsSet) {
                    bArr[19] = (byte) (bArr[19] | 16);
                }
                if (this.bit117OfSupportedMcsSet) {
                    bArr[19] = (byte) (bArr[19] | 32);
                }
                if (this.bit118OfSupportedMcsSet) {
                    bArr[19] = (byte) (bArr[19] | 64);
                }
                if (this.bit119OfSupportedMcsSet) {
                    bArr[19] = (byte) (bArr[19] | 128);
                }
                if (this.bit120OfSupportedMcsSet) {
                    bArr[20] = (byte) (bArr[20] | 1);
                }
                if (this.bit121OfSupportedMcsSet) {
                    bArr[20] = (byte) (bArr[20] | 2);
                }
                if (this.bit122OfSupportedMcsSet) {
                    bArr[20] = (byte) (bArr[20] | 4);
                }
                if (this.bit123OfSupportedMcsSet) {
                    bArr[20] = (byte) (bArr[20] | 8);
                }
                if (this.bit124OfSupportedMcsSet) {
                    bArr[20] = (byte) (bArr[20] | 16);
                }
                if (this.bit125OfSupportedMcsSet) {
                    bArr[20] = (byte) (bArr[20] | 32);
                }
                if (this.bit126OfSupportedMcsSet) {
                    bArr[20] = (byte) (bArr[20] | 64);
                }
                if (this.bit127OfSupportedMcsSet) {
                    bArr[20] = (byte) (bArr[20] | 128);
                }
                byte b14 = (byte) (this.pcoTransitionTime.value << 1);
                bArr[21] = b14;
                if (this.pcoSupported) {
                    bArr[21] = (byte) (b14 | 1);
                }
                if (this.bit3OfHtExtendedCapabilities) {
                    bArr[21] = (byte) (bArr[21] | 8);
                }
                if (this.bit4OfHtExtendedCapabilities) {
                    bArr[21] = (byte) (bArr[21] | 16);
                }
                if (this.bit5OfHtExtendedCapabilities) {
                    bArr[21] = (byte) (bArr[21] | 32);
                }
                if (this.bit6OfHtExtendedCapabilities) {
                    bArr[21] = (byte) (bArr[21] | 64);
                }
                if (this.bit7OfHtExtendedCapabilities) {
                    bArr[21] = (byte) (bArr[21] | 128);
                }
                byte b15 = (byte) this.mcsFeedbackCapability.value;
                bArr[22] = b15;
                if (this.htControlFieldSupported) {
                    bArr[22] = (byte) (b15 | 4);
                }
                if (this.rdResponderSupported) {
                    bArr[22] = (byte) (bArr[22] | 8);
                }
                if (this.bit12OfHtExtendedCapabilities) {
                    bArr[22] = (byte) (bArr[22] | 16);
                }
                if (this.bit13OfHtExtendedCapabilities) {
                    bArr[22] = (byte) (bArr[22] | 32);
                }
                if (this.bit14OfHtExtendedCapabilities) {
                    bArr[22] = (byte) (bArr[22] | 64);
                }
                if (this.bit15OfHtExtendedCapabilities) {
                    bArr[22] = (byte) (bArr[22] | 128);
                }
                byte b16 = (byte) (this.calibration.value << 6);
                bArr[23] = b16;
                if (this.implicitTxBeamformingReceivingSupported) {
                    bArr[23] = (byte) (1 | b16);
                }
                if (this.rxStaggeredSoundingSupported) {
                    bArr[23] = (byte) (bArr[23] | 2);
                }
                if (this.txStaggeredSoundingSupported) {
                    bArr[23] = (byte) (bArr[23] | 4);
                }
                if (this.rxNdpSupported) {
                    bArr[23] = (byte) (bArr[23] | 8);
                }
                if (this.txNdpSupported) {
                    bArr[23] = (byte) (bArr[23] | 16);
                }
                if (this.implicitTxBeamformingSupported) {
                    bArr[23] = (byte) (bArr[23] | 32);
                }
                int i11 = (this.explicitTxBeamformingCsiFeedbackCapability.value << 3) | (this.explicitNoncompressedBeamformingFeedbackCapability.value << 5) | (this.explicitCompressedBeamformingFeedbackCapability.value << 7) | (this.minGrouping.value << 9) | (this.csiNumBeamformerAntennasSupported.value << 11) | (this.noncompressedSteeringNumBeamformerAntennasSupported.value << 13) | (this.compressedSteeringNumBeamformerAntennasSupported.value << 15) | (this.csiMaxNumRowsBeamformerSupported.value << 17) | (this.channelEstimationCapability.value << 19);
                int i12 = i11;
                if (this.explicitCsiTxBeamformingSupported) {
                    i12 = i11 | 1;
                }
                int i13 = i12;
                if (this.explicitNoncompressedSteeringSupported) {
                    i13 = i12 | 2;
                }
                int i14 = i13;
                if (this.explicitCompressedSteeringSupported) {
                    i14 = i13 | 4;
                }
                int i15 = i14;
                if (this.bit29OfTransmitBeamformingCapabilities) {
                    i15 = i14 | 2097152;
                }
                int i16 = i15;
                if (this.bit30OfTransmitBeamformingCapabilities) {
                    i16 = i15 | 4194304;
                }
                int i17 = i16;
                if (this.bit31OfTransmitBeamformingCapabilities) {
                    i17 = i16 | NTLMEngineImpl.FLAG_TARGETINFO_PRESENT;
                }
                int i18 = i17;
                if (this.antennaSelectionSupported) {
                    i18 = i17 | 16777216;
                }
                int i19 = i18;
                if (this.explicitCsiFeedbackBasedTxAselSupported) {
                    i19 = i18 | NTLMEngineImpl.FLAG_REQUEST_VERSION;
                }
                int i20 = i19;
                if (this.antennaIndicesFeedbackBasedTxAselSupported) {
                    i20 = i19 | 67108864;
                }
                int i21 = i20;
                if (this.explicitCsiFeedbackSupported) {
                    i21 = i20 | 134217728;
                }
                int i22 = i21;
                if (this.antennaIndicesFeedbackSupported) {
                    i22 = i21 | 268435456;
                }
                int i23 = i22;
                if (this.rxAselSupported) {
                    i23 = i22 | NTLMEngineImpl.FLAG_REQUEST_128BIT_KEY_EXCH;
                }
                int i24 = i23;
                if (this.txSoundingPpdusSupported) {
                    i24 = i23 | NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH;
                }
                int i25 = i24;
                if (this.bit7OfAselCapability) {
                    i25 = i24 | NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
                }
                System.arraycopy(ByteArrays.toByteArray(i25, byteOrder), 0, bArr, 24, 4);
                return bArr;
            }
            if (zArr[i10]) {
                int i26 = (i10 / 8) + 5;
                switch (i10 % 8) {
                    case 0:
                        bArr[i26] = (byte) (bArr[i26] | 1);
                        break;
                    case 1:
                        bArr[i26] = (byte) (bArr[i26] | 2);
                        break;
                    case 2:
                        bArr[i26] = (byte) (bArr[i26] | 4);
                        break;
                    case 3:
                        bArr[i26] = (byte) (bArr[i26] | 8);
                        break;
                    case 4:
                        bArr[i26] = (byte) (bArr[i26] | 16);
                        break;
                    case 5:
                        bArr[i26] = (byte) (bArr[i26] | 32);
                        break;
                    case 6:
                        bArr[i26] = (byte) (bArr[i26] | 64);
                        break;
                    case 7:
                        bArr[i26] = (byte) (bArr[i26] | 128);
                        break;
                }
            }
            i10++;
        }
    }

    public short getRxHighestSupportedDataRate() {
        return this.rxHighestSupportedDataRate;
    }

    public int getRxHighestSupportedDataRateAsInt() {
        return this.rxHighestSupportedDataRate;
    }

    public StbcSupport getRxStbcSupport() {
        return this.rxStbcSupport;
    }

    public SmPowerSaveMode getSmPowerSaveMode() {
        return this.smPowerSaveMode;
    }

    public boolean[] getSupportedRxMcsIndexes() {
        boolean[] zArr = new boolean[77];
        System.arraycopy(this.supportedRxMcsIndexes, 0, zArr, 0, 77);
        return zArr;
    }

    public NumSpatialStreams getTxMaxNumSpatialStreamsSupported() {
        return this.txMaxNumSpatialStreamsSupported;
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int hashCode() {
        int hashCode = super.hashCode();
        int i10 = 1231;
        int i11 = this.antennaIndicesFeedbackBasedTxAselSupported ? 1231 : 1237;
        int i12 = this.antennaIndicesFeedbackSupported ? 1231 : 1237;
        int i13 = this.antennaSelectionSupported ? 1231 : 1237;
        int i14 = this.bit101OfSupportedMcsSet ? 1231 : 1237;
        int i15 = this.bit102OfSupportedMcsSet ? 1231 : 1237;
        int i16 = this.bit103OfSupportedMcsSet ? 1231 : 1237;
        int i17 = this.bit104OfSupportedMcsSet ? 1231 : 1237;
        int i18 = this.bit105OfSupportedMcsSet ? 1231 : 1237;
        int i19 = this.bit106OfSupportedMcsSet ? 1231 : 1237;
        int i20 = this.bit107OfSupportedMcsSet ? 1231 : 1237;
        int i21 = this.bit108OfSupportedMcsSet ? 1231 : 1237;
        int i22 = this.bit109OfSupportedMcsSet ? 1231 : 1237;
        int i23 = this.bit110OfSupportedMcsSet ? 1231 : 1237;
        int i24 = this.bit111OfSupportedMcsSet ? 1231 : 1237;
        int i25 = this.bit112OfSupportedMcsSet ? 1231 : 1237;
        int i26 = this.bit113OfSupportedMcsSet ? 1231 : 1237;
        int i27 = this.bit114OfSupportedMcsSet ? 1231 : 1237;
        int i28 = this.bit115OfSupportedMcsSet ? 1231 : 1237;
        int i29 = this.bit116OfSupportedMcsSet ? 1231 : 1237;
        int i30 = this.bit117OfSupportedMcsSet ? 1231 : 1237;
        int i31 = this.bit118OfSupportedMcsSet ? 1231 : 1237;
        int i32 = this.bit119OfSupportedMcsSet ? 1231 : 1237;
        int i33 = this.bit120OfSupportedMcsSet ? 1231 : 1237;
        int i34 = this.bit121OfSupportedMcsSet ? 1231 : 1237;
        int i35 = this.bit122OfSupportedMcsSet ? 1231 : 1237;
        int i36 = this.bit123OfSupportedMcsSet ? 1231 : 1237;
        int i37 = this.bit124OfSupportedMcsSet ? 1231 : 1237;
        int i38 = this.bit125OfSupportedMcsSet ? 1231 : 1237;
        int i39 = this.bit126OfSupportedMcsSet ? 1231 : 1237;
        int i40 = this.bit127OfSupportedMcsSet ? 1231 : 1237;
        int i41 = this.bit12OfHtExtendedCapabilities ? 1231 : 1237;
        int i42 = this.bit13OfHtCapabilitiesInfo ? 1231 : 1237;
        int i43 = this.bit13OfHtExtendedCapabilities ? 1231 : 1237;
        int i44 = this.bit14OfHtExtendedCapabilities ? 1231 : 1237;
        int i45 = this.bit15OfHtExtendedCapabilities ? 1231 : 1237;
        int i46 = this.bit29OfTransmitBeamformingCapabilities ? 1231 : 1237;
        int i47 = this.bit30OfTransmitBeamformingCapabilities ? 1231 : 1237;
        int i48 = this.bit31OfTransmitBeamformingCapabilities ? 1231 : 1237;
        int i49 = this.bit3OfHtExtendedCapabilities ? 1231 : 1237;
        int i50 = this.bit4OfHtExtendedCapabilities ? 1231 : 1237;
        int i51 = this.bit5OfAMpduParameters ? 1231 : 1237;
        int i52 = this.bit5OfHtExtendedCapabilities ? 1231 : 1237;
        int i53 = this.bit6OfAMpduParameters ? 1231 : 1237;
        int i54 = this.bit6OfHtExtendedCapabilities ? 1231 : 1237;
        int i55 = this.bit77OfSupportedMcsSet ? 1231 : 1237;
        int i56 = this.bit78OfSupportedMcsSet ? 1231 : 1237;
        int i57 = this.bit79OfSupportedMcsSet ? 1231 : 1237;
        int i58 = this.bit7OfAMpduParameters ? 1231 : 1237;
        int i59 = this.bit7OfAselCapability ? 1231 : 1237;
        int i60 = this.bit7OfHtExtendedCapabilities ? 1231 : 1237;
        int i61 = this.bit90OfSupportedMcsSet ? 1231 : 1237;
        int i62 = this.bit91OfSupportedMcsSet ? 1231 : 1237;
        int i63 = this.bit92OfSupportedMcsSet ? 1231 : 1237;
        int i64 = this.bit93OfSupportedMcsSet ? 1231 : 1237;
        int i65 = this.bit94OfSupportedMcsSet ? 1231 : 1237;
        int i66 = this.bit95OfSupportedMcsSet ? 1231 : 1237;
        int i67 = this.both20and40MhzSupported ? 1231 : 1237;
        int hashCode2 = this.calibration.hashCode();
        int hashCode3 = this.channelEstimationCapability.hashCode();
        int hashCode4 = this.compressedSteeringNumBeamformerAntennasSupported.hashCode();
        int hashCode5 = this.csiMaxNumRowsBeamformerSupported.hashCode();
        int hashCode6 = this.csiNumBeamformerAntennasSupported.hashCode();
        int i68 = this.dsssCckModeIn40MhzSupported ? 1231 : 1237;
        int hashCode7 = this.explicitCompressedBeamformingFeedbackCapability.hashCode();
        int i69 = this.explicitCompressedSteeringSupported ? 1231 : 1237;
        int i70 = this.explicitCsiFeedbackBasedTxAselSupported ? 1231 : 1237;
        int i71 = this.explicitCsiFeedbackSupported ? 1231 : 1237;
        int i72 = this.explicitCsiTxBeamformingSupported ? 1231 : 1237;
        int hashCode8 = this.explicitNoncompressedBeamformingFeedbackCapability.hashCode();
        int i73 = this.explicitNoncompressedSteeringSupported ? 1231 : 1237;
        int hashCode9 = this.explicitTxBeamformingCsiFeedbackCapability.hashCode();
        int i74 = this.fortyMhzIntolerant ? 1231 : 1237;
        int i75 = this.htControlFieldSupported ? 1231 : 1237;
        int i76 = this.htDelayedBlockAckSupported ? 1231 : 1237;
        int i77 = this.htGreenfieldSupported ? 1231 : 1237;
        int i78 = this.implicitTxBeamformingReceivingSupported ? 1231 : 1237;
        int i79 = this.implicitTxBeamformingSupported ? 1231 : 1237;
        int i80 = this.lSigTxopProtectionSupported ? 1231 : 1237;
        int i81 = this.ldpcCodingSupported ? 1231 : 1237;
        int hashCode10 = this.maxAMpduLength.hashCode();
        int hashCode11 = this.maxAMsduLength.hashCode();
        int hashCode12 = this.mcsFeedbackCapability.hashCode();
        int hashCode13 = this.minGrouping.hashCode();
        int hashCode14 = this.minMpduStartSpacing.hashCode();
        int hashCode15 = this.noncompressedSteeringNumBeamformerAntennasSupported.hashCode();
        int i82 = this.pcoSupported ? 1231 : 1237;
        int hashCode16 = this.pcoTransitionTime.hashCode();
        int i83 = this.rdResponderSupported ? 1231 : 1237;
        int i84 = this.rxAselSupported ? 1231 : 1237;
        short s10 = this.rxHighestSupportedDataRate;
        int i85 = this.rxNdpSupported ? 1231 : 1237;
        int i86 = this.rxStaggeredSoundingSupported ? 1231 : 1237;
        int hashCode17 = this.rxStbcSupport.hashCode();
        int i87 = this.shortGiFor20MhzSupported ? 1231 : 1237;
        int i88 = this.shortGiFor40MhzSupported ? 1231 : 1237;
        int hashCode18 = this.smPowerSaveMode.hashCode();
        int hashCode19 = Arrays.hashCode(this.supportedRxMcsIndexes);
        int hashCode20 = this.txMaxNumSpatialStreamsSupported.hashCode();
        int i89 = this.txMcsSetDefined ? 1231 : 1237;
        int i90 = this.txNdpSupported ? 1231 : 1237;
        int i91 = this.txRxMcsSetNotEqual ? 1231 : 1237;
        int i92 = this.txSoundingPpdusSupported ? 1231 : 1237;
        int i93 = this.txStaggeredSoundingSupported ? 1231 : 1237;
        int i94 = this.txStbcSupported ? 1231 : 1237;
        if (!this.txUnequalModulationSupported) {
            i10 = 1237;
        }
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + i11) * 31) + i12) * 31) + i13) * 31) + i14) * 31) + i15) * 31) + i16) * 31) + i17) * 31) + i18) * 31) + i19) * 31) + i20) * 31) + i21) * 31) + i22) * 31) + i23) * 31) + i24) * 31) + i25) * 31) + i26) * 31) + i27) * 31) + i28) * 31) + i29) * 31) + i30) * 31) + i31) * 31) + i32) * 31) + i33) * 31) + i34) * 31) + i35) * 31) + i36) * 31) + i37) * 31) + i38) * 31) + i39) * 31) + i40) * 31) + i41) * 31) + i42) * 31) + i43) * 31) + i44) * 31) + i45) * 31) + i46) * 31) + i47) * 31) + i48) * 31) + i49) * 31) + i50) * 31) + i51) * 31) + i52) * 31) + i53) * 31) + i54) * 31) + i55) * 31) + i56) * 31) + i57) * 31) + i58) * 31) + i59) * 31) + i60) * 31) + i61) * 31) + i62) * 31) + i63) * 31) + i64) * 31) + i65) * 31) + i66) * 31) + i67) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i68) * 31) + hashCode7) * 31) + i69) * 31) + i70) * 31) + i71) * 31) + i72) * 31) + hashCode8) * 31) + i73) * 31) + hashCode9) * 31) + i74) * 31) + i75) * 31) + i76) * 31) + i77) * 31) + i78) * 31) + i79) * 31) + i80) * 31) + i81) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + i82) * 31) + hashCode16) * 31) + i83) * 31) + i84) * 31) + s10) * 31) + i85) * 31) + i86) * 31) + hashCode17) * 31) + i87) * 31) + i88) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + i89) * 31) + i90) * 31) + i91) * 31) + i92) * 31) + i93) * 31) + i94) * 31) + i10;
    }

    public boolean isAntennaIndicesFeedbackBasedTxAselSupported() {
        return this.antennaIndicesFeedbackBasedTxAselSupported;
    }

    public boolean isAntennaIndicesFeedbackSupported() {
        return this.antennaIndicesFeedbackSupported;
    }

    public boolean isAntennaSelectionSupported() {
        return this.antennaSelectionSupported;
    }

    public boolean isBoth20and40MhzSupported() {
        return this.both20and40MhzSupported;
    }

    public boolean isDsssCckModeIn40MhzSupported() {
        return this.dsssCckModeIn40MhzSupported;
    }

    public boolean isExplicitCompressedSteeringSupported() {
        return this.explicitCompressedSteeringSupported;
    }

    public boolean isExplicitCsiFeedbackBasedTxAselSupported() {
        return this.explicitCsiFeedbackBasedTxAselSupported;
    }

    public boolean isExplicitCsiFeedbackSupported() {
        return this.explicitCsiFeedbackSupported;
    }

    public boolean isExplicitCsiTxBeamformingSupported() {
        return this.explicitCsiTxBeamformingSupported;
    }

    public boolean isExplicitNoncompressedSteeringSupported() {
        return this.explicitNoncompressedSteeringSupported;
    }

    public boolean isFortyMhzIntolerant() {
        return this.fortyMhzIntolerant;
    }

    public boolean isHtControlFieldSupported() {
        return this.htControlFieldSupported;
    }

    public boolean isHtDelayedBlockAckSupported() {
        return this.htDelayedBlockAckSupported;
    }

    public boolean isHtGreenfieldSupported() {
        return this.htGreenfieldSupported;
    }

    public boolean isImplicitTxBeamformingReceivingSupported() {
        return this.implicitTxBeamformingReceivingSupported;
    }

    public boolean isImplicitTxBeamformingSupported() {
        return this.implicitTxBeamformingSupported;
    }

    public boolean isLdpcCodingSupported() {
        return this.ldpcCodingSupported;
    }

    public boolean isPcoSupported() {
        return this.pcoSupported;
    }

    public boolean isRdResponderSupported() {
        return this.rdResponderSupported;
    }

    public boolean isRxAselSupported() {
        return this.rxAselSupported;
    }

    public boolean isRxNdpSupported() {
        return this.rxNdpSupported;
    }

    public boolean isRxStaggeredSoundingSupported() {
        return this.rxStaggeredSoundingSupported;
    }

    public boolean isShortGiFor20MhzSupported() {
        return this.shortGiFor20MhzSupported;
    }

    public boolean isShortGiFor40MhzSupported() {
        return this.shortGiFor40MhzSupported;
    }

    public boolean isTxMcsSetDefined() {
        return this.txMcsSetDefined;
    }

    public boolean isTxNdpSupported() {
        return this.txNdpSupported;
    }

    public boolean isTxRxMcsSetNotEqual() {
        return this.txRxMcsSetNotEqual;
    }

    public boolean isTxSoundingPpdusSupported() {
        return this.txSoundingPpdusSupported;
    }

    public boolean isTxStaggeredSoundingSupported() {
        return this.txStaggeredSoundingSupported;
    }

    public boolean isTxStbcSupported() {
        return this.txStbcSupported;
    }

    public boolean isTxUnequalModulationSupported() {
        return this.txUnequalModulationSupported;
    }

    public boolean islSigTxopProtectionSupported() {
        return this.lSigTxopProtectionSupported;
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int length() {
        return 28;
    }

    public String toString() {
        return toString("");
    }

    public String toString(String str) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("HT Capabilities:");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Element ID: ");
        sb2.append(getElementId());
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Length: ");
        sb2.append(getLengthAsInt());
        sb2.append(" bytes");
        sb2.append(property);
        sb2.append(str);
        sb2.append("  HT Capabilities Info:");
        sb2.append(property);
        sb2.append(str);
        sb2.append("    LDPC Coding is Supported: ");
        sb2.append(this.ldpcCodingSupported);
        sb2.append(property);
        sb2.append(str);
        sb2.append("    Supported Channel Width Set: ");
        sb2.append(this.both20and40MhzSupported ? "20 MHz and 40 MHz" : "20 MHz");
        sb2.append(property);
        sb2.append(str);
        sb2.append("    SM Power Save: ");
        sb2.append(this.smPowerSaveMode);
        sb2.append(property);
        sb2.append(str);
        sb2.append("    HT-Greenfield is Supported: ");
        sb2.append(this.htGreenfieldSupported);
        sb2.append(property);
        sb2.append(str);
        sb2.append("    Short GI for 20 MHz is Supported: ");
        sb2.append(this.shortGiFor20MhzSupported);
        sb2.append(property);
        sb2.append(str);
        sb2.append("    Short GI for 40 MHz is Supported: ");
        sb2.append(this.shortGiFor40MhzSupported);
        sb2.append(property);
        sb2.append(str);
        sb2.append("    Tx STBC is Supported: ");
        sb2.append(this.txStbcSupported);
        sb2.append(property);
        sb2.append(str);
        sb2.append("    Rx STBC Support: ");
        sb2.append(this.rxStbcSupport);
        sb2.append(property);
        sb2.append(str);
        sb2.append("    HT-Delayed Block Ack is Supported: ");
        sb2.append(this.htDelayedBlockAckSupported);
        sb2.append(property);
        sb2.append(str);
        sb2.append("    Max A-MSDU Length: ");
        sb2.append(this.maxAMsduLength);
        sb2.append(" octets");
        sb2.append(property);
        sb2.append(str);
        sb2.append("    DSSS/CCK Mode in 40 MHz is Supported: ");
        sb2.append(this.dsssCckModeIn40MhzSupported);
        sb2.append(property);
        sb2.append(str);
        sb2.append("    Bit 13: ");
        sb2.append(this.bit13OfHtCapabilitiesInfo);
        sb2.append(property);
        sb2.append(str);
        sb2.append("    40 MHz is Intolerant: ");
        sb2.append(this.fortyMhzIntolerant);
        sb2.append(property);
        sb2.append(str);
        sb2.append("    L-SIG TXOP Protection is Supported: ");
        sb2.append(this.lSigTxopProtectionSupported);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  A-MPDU Parameters:");
        sb2.append(property);
        sb2.append(str);
        sb2.append("    Max A-MPDU Length: ");
        sb2.append(this.maxAMpduLength);
        sb2.append(" octets");
        sb2.append(property);
        sb2.append(str);
        sb2.append("    Min MPDU Start Spacing: ");
        sb2.append(this.minMpduStartSpacing);
        sb2.append(property);
        sb2.append(str);
        sb2.append("    Bit 5: ");
        sb2.append(this.bit5OfAMpduParameters);
        sb2.append(property);
        sb2.append(str);
        sb2.append("    Bit 6: ");
        sb2.append(this.bit6OfAMpduParameters);
        sb2.append(property);
        sb2.append(str);
        sb2.append("    Bit 7: ");
        sb2.append(this.bit7OfAMpduParameters);
        sb2.append(property);
        sb2.append(str);
        sb2.append("  Supported MCS Set:");
        sb2.append(property);
        sb2.append(str);
        sb2.append("    Supported Rx MCS Indexes: ");
        boolean z10 = true;
        int i10 = 0;
        while (true) {
            boolean[] zArr = this.supportedRxMcsIndexes;
            if (i10 >= zArr.length) {
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 77: ");
                sb2.append(this.bit77OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 78: ");
                sb2.append(this.bit78OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 79: ");
                sb2.append(this.bit79OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Rx Highest Supported Data Rate: ");
                sb2.append((int) this.rxHighestSupportedDataRate);
                sb2.append(" Mb/s");
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 90: ");
                sb2.append(this.bit90OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 91: ");
                sb2.append(this.bit91OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 92: ");
                sb2.append(this.bit92OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 93: ");
                sb2.append(this.bit93OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 94: ");
                sb2.append(this.bit94OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 95: ");
                sb2.append(this.bit95OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Tx MCS Set is Defined: ");
                sb2.append(this.txMcsSetDefined);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Tx Rx MCS Set Not Equal: ");
                sb2.append(this.txRxMcsSetNotEqual);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Tx Max Number Spatial Streams Supported: ");
                sb2.append(this.txMaxNumSpatialStreamsSupported);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Tx Unequal Modulation is Supported: ");
                sb2.append(this.txUnequalModulationSupported);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 101: ");
                sb2.append(this.bit101OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 102: ");
                sb2.append(this.bit102OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 103: ");
                sb2.append(this.bit103OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 104: ");
                sb2.append(this.bit104OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 105: ");
                sb2.append(this.bit105OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 106: ");
                sb2.append(this.bit106OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 107: ");
                sb2.append(this.bit107OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 108: ");
                sb2.append(this.bit108OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 109: ");
                sb2.append(this.bit109OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 110: ");
                sb2.append(this.bit110OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 111: ");
                sb2.append(this.bit111OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 112: ");
                sb2.append(this.bit112OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 113: ");
                sb2.append(this.bit113OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 114: ");
                sb2.append(this.bit114OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 115: ");
                sb2.append(this.bit115OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 116: ");
                sb2.append(this.bit116OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 117: ");
                sb2.append(this.bit117OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 118: ");
                sb2.append(this.bit118OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 119: ");
                sb2.append(this.bit119OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 120: ");
                sb2.append(this.bit120OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 121: ");
                sb2.append(this.bit121OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 122: ");
                sb2.append(this.bit122OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 123: ");
                sb2.append(this.bit123OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 124: ");
                sb2.append(this.bit124OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 125: ");
                sb2.append(this.bit125OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 126: ");
                sb2.append(this.bit126OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 127: ");
                sb2.append(this.bit127OfSupportedMcsSet);
                sb2.append(property);
                sb2.append(str);
                sb2.append("  HT Extended Capabilities:");
                sb2.append(property);
                sb2.append(str);
                sb2.append("    PCO is Supported: ");
                sb2.append(this.pcoSupported);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    PCO Transition Time: ");
                sb2.append(this.pcoTransitionTime);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 3: ");
                sb2.append(this.bit3OfHtExtendedCapabilities);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 4: ");
                sb2.append(this.bit4OfHtExtendedCapabilities);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 5: ");
                sb2.append(this.bit5OfHtExtendedCapabilities);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 6: ");
                sb2.append(this.bit6OfHtExtendedCapabilities);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 7: ");
                sb2.append(this.bit7OfHtExtendedCapabilities);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    MCS Feedback: ");
                sb2.append(this.mcsFeedbackCapability);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    HT Control Field is Support: ");
                sb2.append(this.htControlFieldSupported);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    RD Responder is Supported: ");
                sb2.append(this.rdResponderSupported);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 12: ");
                sb2.append(this.bit12OfHtExtendedCapabilities);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 13: ");
                sb2.append(this.bit13OfHtExtendedCapabilities);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 14: ");
                sb2.append(this.bit14OfHtExtendedCapabilities);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 15: ");
                sb2.append(this.bit15OfHtExtendedCapabilities);
                sb2.append(property);
                sb2.append(str);
                sb2.append("  Transmit Beamforming Capabilities:");
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Implicit Tx Beamforming Receiving is Supported: ");
                sb2.append(this.implicitTxBeamformingReceivingSupported);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Rx Staggered Sounding is Supported: ");
                sb2.append(this.rxStaggeredSoundingSupported);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Tx Staggered Sounding is Supported: ");
                sb2.append(this.txStaggeredSoundingSupported);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Rx NDP is Supported: ");
                sb2.append(this.rxNdpSupported);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Tx NDP is Supported: ");
                sb2.append(this.txNdpSupported);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Implicit Tx Beamforming is Supported: ");
                sb2.append(this.implicitTxBeamformingSupported);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Calibration: ");
                sb2.append(this.calibration);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Explicit CSI Tx Beamforming is Supported: ");
                sb2.append(this.explicitCsiTxBeamformingSupported);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Explicit Noncompressed Steering is Supported: ");
                sb2.append(this.explicitNoncompressedSteeringSupported);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Explicit Compressed Steering is Supported: ");
                sb2.append(this.explicitCompressedSteeringSupported);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Explicit Tx Beamforming CSI Feedback: ");
                sb2.append(this.explicitTxBeamformingCsiFeedbackCapability);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Explicit Noncompressed Beamforming Feedback: ");
                sb2.append(this.explicitNoncompressedBeamformingFeedbackCapability);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Explicit Compressed Beamforming Feedback: ");
                sb2.append(this.explicitCompressedBeamformingFeedbackCapability);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Min Grouping: ");
                sb2.append(this.minGrouping);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    CSI Number of Beamformer Antennas Supported: ");
                sb2.append(this.csiNumBeamformerAntennasSupported);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Noncompressed Steering Number of Beamformer Antennas Supported: ");
                sb2.append(this.noncompressedSteeringNumBeamformerAntennasSupported);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Compressed Steering Number of Beamformer Antennas Supported: ");
                sb2.append(this.compressedSteeringNumBeamformerAntennasSupported);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    CSI Max Number of Rows Beamformer Supported: ");
                sb2.append(this.csiMaxNumRowsBeamformerSupported);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Channel Estimation: ");
                sb2.append(this.channelEstimationCapability);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 29: ");
                sb2.append(this.bit29OfTransmitBeamformingCapabilities);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 30: ");
                sb2.append(this.bit30OfTransmitBeamformingCapabilities);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 31: ");
                sb2.append(this.bit31OfTransmitBeamformingCapabilities);
                sb2.append(property);
                sb2.append(str);
                sb2.append("  ASEL Capabilities:");
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Antenna Selection is Supported: ");
                sb2.append(this.antennaSelectionSupported);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Explicit CSI Feedback Based Tx ASEL is Supported: ");
                sb2.append(this.explicitCsiFeedbackBasedTxAselSupported);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Antenna Indices Feedback Based Tx ASEL is Supported: ");
                sb2.append(this.antennaIndicesFeedbackBasedTxAselSupported);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Explicit CSI Feedback is Supported: ");
                sb2.append(this.explicitCsiFeedbackSupported);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Antenna Indices Feedback is Supported: ");
                sb2.append(this.antennaIndicesFeedbackSupported);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Rx ASEL is Supported: ");
                sb2.append(this.rxAselSupported);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Tx Sounding PPDUs is Supported: ");
                sb2.append(this.txSoundingPpdusSupported);
                sb2.append(property);
                sb2.append(str);
                sb2.append("    Bit 7: ");
                sb2.append(this.bit7OfAselCapability);
                sb2.append(property);
                return sb2.toString();
            }
            boolean z11 = z10;
            if (zArr[i10]) {
                if (z10) {
                    z10 = false;
                } else {
                    sb2.append(", ");
                }
                sb2.append(i10);
                z11 = z10;
            }
            i10++;
            z10 = z11;
        }
    }
}

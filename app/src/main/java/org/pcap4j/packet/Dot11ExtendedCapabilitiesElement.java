package org.pcap4j.packet;

import java.util.Arrays;
import org.pcap4j.packet.Dot11InformationElement;
import org.pcap4j.packet.namednumber.Dot11InformationElementId;
import org.pcap4j.packet.namednumber.Dot11ServiceIntervalGranularity;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11ExtendedCapabilitiesElement.class */
public final class Dot11ExtendedCapabilitiesElement extends Dot11InformationElement {
    private static final long serialVersionUID = 5039470467536222487L;
    private final Boolean acStationCountActivated;
    private final int actualLength;
    private final Boolean bit1;
    private final Boolean bit3;
    private final Boolean bit35;
    private final Boolean bit47;
    private final Boolean bit49;
    private final Boolean bit5;
    private final Boolean bit50;
    private final Boolean bit51;
    private final Boolean bit52;
    private final Boolean bit53;
    private final Boolean bit54;
    private final Boolean bit55;
    private final Boolean bssTransitionActivated;
    private final Boolean channelUsageActivated;
    private final Boolean collocatedInterferenceReportingActivated;
    private final Boolean diagnosticsActivated;
    private final Boolean dmsActivated;
    private final Boolean ebrActivated;
    private final Boolean eventActivated;
    private final Boolean extendedChannelSwitchingSupported;
    private final Boolean fmsActivated;
    private final Boolean interworkingServiceActivated;
    private final Boolean locationTrackingActivated;
    private final Boolean msgcfActivated;
    private final Boolean multiBssIdActivated;
    private final Boolean multicastDiagnosticsActivated;
    private final Boolean proxyArpServiceActivated;
    private final Boolean psmpOperationSupported;
    private final Boolean qosMapActivated;
    private final Boolean qosTrafficCapabilityActivated;
    private final Boolean rejectingUnadmittedTraffic;
    private final Boolean rmCivicMeasurementActivated;
    private final Boolean rmIdentifierMeasurementActivated;
    private final Boolean rmLciMeasurementActivated;
    private final Boolean scheduledPsmpSupported;
    private final Dot11ServiceIntervalGranularity serviceIntervalGranularity;
    private final Boolean ssidListActivated;
    private final Boolean sspnInterfaceActivated;
    private final Boolean tdlsChannelSwitchingActivated;
    private final Boolean tdlsChannelSwitchingProhibited;
    private final Boolean tdlsPeerPsmSupported;
    private final Boolean tdlsPeerUapsdBufferStaSupported;
    private final Boolean tdlsProhibited;
    private final Boolean tdlsSupported;
    private final Boolean tfsActivated;
    private final Boolean timBroadcastActivated;
    private final Boolean timingMeasurementActivated;
    private final byte[] trailingData;
    private final Boolean twentyFortyBssCoexistenceManagementSupported;
    private final Boolean uapsdCoexistenceActivated;
    private final Boolean utcTsfOffsetActivated;
    private final Boolean utf8Ssid;
    private final Boolean wnmNotificationActivated;
    private final Boolean wnmSleepModeActivated;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11ExtendedCapabilitiesElement$Builder.class */
    public static final class Builder extends Dot11InformationElement.Builder {
        private Boolean acStationCountActivated;
        private Boolean bit1;
        private Boolean bit3;
        private Boolean bit35;
        private Boolean bit47;
        private Boolean bit49;
        private Boolean bit5;
        private Boolean bit50;
        private Boolean bit51;
        private Boolean bit52;
        private Boolean bit53;
        private Boolean bit54;
        private Boolean bit55;
        private Boolean bssTransitionActivated;
        private Boolean channelUsageActivated;
        private Boolean collocatedInterferenceReportingActivated;
        private Boolean diagnosticsActivated;
        private Boolean dmsActivated;
        private Boolean ebrActivated;
        private Boolean eventActivated;
        private Boolean extendedChannelSwitchingSupported;
        private Boolean fmsActivated;
        private Boolean interworkingServiceActivated;
        private Boolean locationTrackingActivated;
        private Boolean msgcfActivated;
        private Boolean multiBssIdActivated;
        private Boolean multicastDiagnosticsActivated;
        private Boolean proxyArpServiceActivated;
        private Boolean psmpOperationSupported;
        private Boolean qosMapActivated;
        private Boolean qosTrafficCapabilityActivated;
        private Boolean rejectingUnadmittedTraffic;
        private Boolean rmCivicMeasurementActivated;
        private Boolean rmIdentifierMeasurementActivated;
        private Boolean rmLciMeasurementActivated;
        private Boolean scheduledPsmpSupported;
        private Dot11ServiceIntervalGranularity serviceIntervalGranularity;
        private Boolean ssidListActivated;
        private Boolean sspnInterfaceActivated;
        private Boolean tdlsChannelSwitchingActivated;
        private Boolean tdlsChannelSwitchingProhibited;
        private Boolean tdlsPeerPsmSupported;
        private Boolean tdlsPeerUapsdBufferStaSupported;
        private Boolean tdlsProhibited;
        private Boolean tdlsSupported;
        private Boolean tfsActivated;
        private Boolean timBroadcastActivated;
        private Boolean timingMeasurementActivated;
        private byte[] trailingData;
        private Boolean twentyFortyBssCoexistenceManagementSupported;
        private Boolean uapsdCoexistenceActivated;
        private Boolean utcTsfOffsetActivated;
        private Boolean utf8Ssid;
        private Boolean wnmNotificationActivated;
        private Boolean wnmSleepModeActivated;

        public Builder() {
            elementId(Dot11InformationElementId.getInstance(Dot11InformationElementId.EXTENDED_CAPABILITIES.value()));
        }

        private Builder(Dot11ExtendedCapabilitiesElement dot11ExtendedCapabilitiesElement) {
            super(dot11ExtendedCapabilitiesElement);
            this.twentyFortyBssCoexistenceManagementSupported = dot11ExtendedCapabilitiesElement.twentyFortyBssCoexistenceManagementSupported;
            this.bit1 = dot11ExtendedCapabilitiesElement.bit1;
            this.extendedChannelSwitchingSupported = dot11ExtendedCapabilitiesElement.extendedChannelSwitchingSupported;
            this.bit3 = dot11ExtendedCapabilitiesElement.bit3;
            this.psmpOperationSupported = dot11ExtendedCapabilitiesElement.psmpOperationSupported;
            this.bit5 = dot11ExtendedCapabilitiesElement.bit5;
            this.scheduledPsmpSupported = dot11ExtendedCapabilitiesElement.scheduledPsmpSupported;
            this.eventActivated = dot11ExtendedCapabilitiesElement.eventActivated;
            this.diagnosticsActivated = dot11ExtendedCapabilitiesElement.diagnosticsActivated;
            this.multicastDiagnosticsActivated = dot11ExtendedCapabilitiesElement.multicastDiagnosticsActivated;
            this.locationTrackingActivated = dot11ExtendedCapabilitiesElement.locationTrackingActivated;
            this.fmsActivated = dot11ExtendedCapabilitiesElement.fmsActivated;
            this.proxyArpServiceActivated = dot11ExtendedCapabilitiesElement.proxyArpServiceActivated;
            this.collocatedInterferenceReportingActivated = dot11ExtendedCapabilitiesElement.collocatedInterferenceReportingActivated;
            this.rmCivicMeasurementActivated = dot11ExtendedCapabilitiesElement.rmCivicMeasurementActivated;
            this.rmLciMeasurementActivated = dot11ExtendedCapabilitiesElement.rmLciMeasurementActivated;
            this.tfsActivated = dot11ExtendedCapabilitiesElement.tfsActivated;
            this.wnmSleepModeActivated = dot11ExtendedCapabilitiesElement.wnmSleepModeActivated;
            this.timBroadcastActivated = dot11ExtendedCapabilitiesElement.timBroadcastActivated;
            this.bssTransitionActivated = dot11ExtendedCapabilitiesElement.bssTransitionActivated;
            this.qosTrafficCapabilityActivated = dot11ExtendedCapabilitiesElement.qosTrafficCapabilityActivated;
            this.acStationCountActivated = dot11ExtendedCapabilitiesElement.acStationCountActivated;
            this.multiBssIdActivated = dot11ExtendedCapabilitiesElement.multiBssIdActivated;
            this.timingMeasurementActivated = dot11ExtendedCapabilitiesElement.timingMeasurementActivated;
            this.channelUsageActivated = dot11ExtendedCapabilitiesElement.channelUsageActivated;
            this.ssidListActivated = dot11ExtendedCapabilitiesElement.ssidListActivated;
            this.dmsActivated = dot11ExtendedCapabilitiesElement.dmsActivated;
            this.utcTsfOffsetActivated = dot11ExtendedCapabilitiesElement.utcTsfOffsetActivated;
            this.tdlsPeerUapsdBufferStaSupported = dot11ExtendedCapabilitiesElement.tdlsPeerUapsdBufferStaSupported;
            this.tdlsPeerPsmSupported = dot11ExtendedCapabilitiesElement.tdlsPeerPsmSupported;
            this.tdlsChannelSwitchingActivated = dot11ExtendedCapabilitiesElement.tdlsChannelSwitchingActivated;
            this.interworkingServiceActivated = dot11ExtendedCapabilitiesElement.interworkingServiceActivated;
            this.qosMapActivated = dot11ExtendedCapabilitiesElement.qosMapActivated;
            this.ebrActivated = dot11ExtendedCapabilitiesElement.ebrActivated;
            this.sspnInterfaceActivated = dot11ExtendedCapabilitiesElement.sspnInterfaceActivated;
            this.bit35 = dot11ExtendedCapabilitiesElement.bit35;
            this.msgcfActivated = dot11ExtendedCapabilitiesElement.msgcfActivated;
            this.tdlsSupported = dot11ExtendedCapabilitiesElement.tdlsSupported;
            this.tdlsProhibited = dot11ExtendedCapabilitiesElement.tdlsProhibited;
            this.tdlsChannelSwitchingProhibited = dot11ExtendedCapabilitiesElement.tdlsChannelSwitchingProhibited;
            this.rejectingUnadmittedTraffic = dot11ExtendedCapabilitiesElement.rejectingUnadmittedTraffic;
            this.serviceIntervalGranularity = dot11ExtendedCapabilitiesElement.serviceIntervalGranularity;
            this.rmIdentifierMeasurementActivated = dot11ExtendedCapabilitiesElement.rmIdentifierMeasurementActivated;
            this.uapsdCoexistenceActivated = dot11ExtendedCapabilitiesElement.uapsdCoexistenceActivated;
            this.wnmNotificationActivated = dot11ExtendedCapabilitiesElement.wnmNotificationActivated;
            this.bit47 = dot11ExtendedCapabilitiesElement.bit47;
            this.utf8Ssid = dot11ExtendedCapabilitiesElement.utf8Ssid;
            this.bit49 = dot11ExtendedCapabilitiesElement.bit49;
            this.bit50 = dot11ExtendedCapabilitiesElement.bit50;
            this.bit51 = dot11ExtendedCapabilitiesElement.bit51;
            this.bit52 = dot11ExtendedCapabilitiesElement.bit52;
            this.bit53 = dot11ExtendedCapabilitiesElement.bit53;
            this.bit54 = dot11ExtendedCapabilitiesElement.bit54;
            this.bit55 = dot11ExtendedCapabilitiesElement.bit55;
            this.trailingData = dot11ExtendedCapabilitiesElement.trailingData;
        }

        public Builder acStationCountActivated(Boolean bool) {
            this.acStationCountActivated = bool;
            return this;
        }

        public Builder bit1(Boolean bool) {
            this.bit1 = bool;
            return this;
        }

        public Builder bit3(Boolean bool) {
            this.bit3 = bool;
            return this;
        }

        public Builder bit35(Boolean bool) {
            this.bit35 = bool;
            return this;
        }

        public Builder bit47(Boolean bool) {
            this.bit47 = bool;
            return this;
        }

        public Builder bit49(Boolean bool) {
            this.bit49 = bool;
            return this;
        }

        public Builder bit5(Boolean bool) {
            this.bit5 = bool;
            return this;
        }

        public Builder bit50(Boolean bool) {
            this.bit50 = bool;
            return this;
        }

        public Builder bit51(Boolean bool) {
            this.bit51 = bool;
            return this;
        }

        public Builder bit52(Boolean bool) {
            this.bit52 = bool;
            return this;
        }

        public Builder bit53(Boolean bool) {
            this.bit53 = bool;
            return this;
        }

        public Builder bit54(Boolean bool) {
            this.bit54 = bool;
            return this;
        }

        public Builder bit55(Boolean bool) {
            this.bit55 = bool;
            return this;
        }

        public Builder bssTransitionActivated(Boolean bool) {
            this.bssTransitionActivated = bool;
            return this;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public Dot11InformationElement build() {
            if (getCorrectLengthAtBuild()) {
                length((byte) Dot11ExtendedCapabilitiesElement.calcActualLength(this));
            }
            return new Dot11ExtendedCapabilitiesElement(this);
        }

        public Builder channelUsageActivated(Boolean bool) {
            this.channelUsageActivated = bool;
            return this;
        }

        public Builder collocatedInterferenceReportingActivated(Boolean bool) {
            this.collocatedInterferenceReportingActivated = bool;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.pcap4j.packet.Dot11InformationElement.Builder, org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild */
        public LengthBuilder<Dot11InformationElement> correctLengthAtBuild2(boolean z10) {
            super.correctLengthAtBuild2(z10);
            return this;
        }

        public Builder diagnosticsActivated(Boolean bool) {
            this.diagnosticsActivated = bool;
            return this;
        }

        public Builder dmsActivated(Boolean bool) {
            this.dmsActivated = bool;
            return this;
        }

        public Builder ebrActivated(Boolean bool) {
            this.ebrActivated = bool;
            return this;
        }

        public Builder eventActivated(Boolean bool) {
            this.eventActivated = bool;
            return this;
        }

        public Builder extendedChannelSwitchingSupported(Boolean bool) {
            this.extendedChannelSwitchingSupported = bool;
            return this;
        }

        public Builder fmsActivated(Boolean bool) {
            this.fmsActivated = bool;
            return this;
        }

        public Builder interworkingServiceActivated(Boolean bool) {
            this.interworkingServiceActivated = bool;
            return this;
        }

        @Override // org.pcap4j.packet.Dot11InformationElement.Builder
        public Builder length(byte b10) {
            super.length(b10);
            return this;
        }

        public Builder locationTrackingActivated(Boolean bool) {
            this.locationTrackingActivated = bool;
            return this;
        }

        public Builder msgcfActivated(Boolean bool) {
            this.msgcfActivated = bool;
            return this;
        }

        public Builder multiBssIdActivated(Boolean bool) {
            this.multiBssIdActivated = bool;
            return this;
        }

        public Builder multicastDiagnosticsActivated(Boolean bool) {
            this.multicastDiagnosticsActivated = bool;
            return this;
        }

        public Builder proxyArpServiceActivated(Boolean bool) {
            this.proxyArpServiceActivated = bool;
            return this;
        }

        public Builder psmpOperationSupported(Boolean bool) {
            this.psmpOperationSupported = bool;
            return this;
        }

        public Builder qosMapActivated(Boolean bool) {
            this.qosMapActivated = bool;
            return this;
        }

        public Builder qosTrafficCapabilityActivated(Boolean bool) {
            this.qosTrafficCapabilityActivated = bool;
            return this;
        }

        public Builder rejectingUnadmittedTraffic(Boolean bool) {
            this.rejectingUnadmittedTraffic = bool;
            return this;
        }

        public Builder rmCivicMeasurementActivated(Boolean bool) {
            this.rmCivicMeasurementActivated = bool;
            return this;
        }

        public Builder rmIdentifierMeasurementActivated(Boolean bool) {
            this.rmIdentifierMeasurementActivated = bool;
            return this;
        }

        public Builder rmLciMeasurementActivated(Boolean bool) {
            this.rmLciMeasurementActivated = bool;
            return this;
        }

        public Builder scheduledPsmpSupported(Boolean bool) {
            this.scheduledPsmpSupported = bool;
            return this;
        }

        public Builder serviceIntervalGranularity(Dot11ServiceIntervalGranularity dot11ServiceIntervalGranularity) {
            this.serviceIntervalGranularity = dot11ServiceIntervalGranularity;
            return this;
        }

        public Builder ssidListActivated(Boolean bool) {
            this.ssidListActivated = bool;
            return this;
        }

        public Builder sspnInterfaceActivated(Boolean bool) {
            this.sspnInterfaceActivated = bool;
            return this;
        }

        public Builder tdlsChannelSwitchingActivated(Boolean bool) {
            this.tdlsChannelSwitchingActivated = bool;
            return this;
        }

        public Builder tdlsChannelSwitchingProhibited(Boolean bool) {
            this.tdlsChannelSwitchingProhibited = bool;
            return this;
        }

        public Builder tdlsPeerPsmSupported(Boolean bool) {
            this.tdlsPeerPsmSupported = bool;
            return this;
        }

        public Builder tdlsPeerUapsdBufferStaSupported(Boolean bool) {
            this.tdlsPeerUapsdBufferStaSupported = bool;
            return this;
        }

        public Builder tdlsProhibited(Boolean bool) {
            this.tdlsProhibited = bool;
            return this;
        }

        public Builder tdlsSupported(Boolean bool) {
            this.tdlsSupported = bool;
            return this;
        }

        public Builder tfsActivated(Boolean bool) {
            this.tfsActivated = bool;
            return this;
        }

        public Builder timBroadcastActivated(Boolean bool) {
            this.timBroadcastActivated = bool;
            return this;
        }

        public Builder timingMeasurementActivated(Boolean bool) {
            this.timingMeasurementActivated = bool;
            return this;
        }

        public Builder trailingData(byte[] bArr) {
            this.trailingData = bArr;
            return this;
        }

        public Builder twentyFortyBssCoexistenceManagementSupported(Boolean bool) {
            this.twentyFortyBssCoexistenceManagementSupported = bool;
            return this;
        }

        public Builder uapsdCoexistenceActivated(Boolean bool) {
            this.uapsdCoexistenceActivated = bool;
            return this;
        }

        public Builder utcTsfOffsetActivated(Boolean bool) {
            this.utcTsfOffsetActivated = bool;
            return this;
        }

        public Builder utf8Ssid(Boolean bool) {
            this.utf8Ssid = bool;
            return this;
        }

        public Builder wnmNotificationActivated(Boolean bool) {
            this.wnmNotificationActivated = bool;
            return this;
        }

        public Builder wnmSleepModeActivated(Boolean bool) {
            this.wnmSleepModeActivated = bool;
            return this;
        }
    }

    private Dot11ExtendedCapabilitiesElement(Builder builder) {
        super(builder);
        if (builder.trailingData.length > 248) {
            throw new IllegalArgumentException("Too long trailingData: " + ByteArrays.toHexString(builder.trailingData, " "));
        }
        this.actualLength = builder.getCorrectLengthAtBuild() ? getLengthAsInt() : calcActualLength(builder);
        this.twentyFortyBssCoexistenceManagementSupported = builder.twentyFortyBssCoexistenceManagementSupported;
        this.bit1 = builder.bit1;
        this.extendedChannelSwitchingSupported = builder.extendedChannelSwitchingSupported;
        this.bit3 = builder.bit3;
        this.psmpOperationSupported = builder.psmpOperationSupported;
        this.bit5 = builder.bit5;
        this.scheduledPsmpSupported = builder.scheduledPsmpSupported;
        this.eventActivated = builder.eventActivated;
        this.diagnosticsActivated = builder.diagnosticsActivated;
        this.multicastDiagnosticsActivated = builder.multicastDiagnosticsActivated;
        this.locationTrackingActivated = builder.locationTrackingActivated;
        this.fmsActivated = builder.fmsActivated;
        this.proxyArpServiceActivated = builder.proxyArpServiceActivated;
        this.collocatedInterferenceReportingActivated = builder.collocatedInterferenceReportingActivated;
        this.rmCivicMeasurementActivated = builder.rmCivicMeasurementActivated;
        this.rmLciMeasurementActivated = builder.rmLciMeasurementActivated;
        this.tfsActivated = builder.tfsActivated;
        this.wnmSleepModeActivated = builder.wnmSleepModeActivated;
        this.timBroadcastActivated = builder.timBroadcastActivated;
        this.bssTransitionActivated = builder.bssTransitionActivated;
        this.qosTrafficCapabilityActivated = builder.qosTrafficCapabilityActivated;
        this.acStationCountActivated = builder.acStationCountActivated;
        this.multiBssIdActivated = builder.multiBssIdActivated;
        this.timingMeasurementActivated = builder.timingMeasurementActivated;
        this.channelUsageActivated = builder.channelUsageActivated;
        this.ssidListActivated = builder.ssidListActivated;
        this.dmsActivated = builder.dmsActivated;
        this.utcTsfOffsetActivated = builder.utcTsfOffsetActivated;
        this.tdlsPeerUapsdBufferStaSupported = builder.tdlsPeerUapsdBufferStaSupported;
        this.tdlsPeerPsmSupported = builder.tdlsPeerPsmSupported;
        this.tdlsChannelSwitchingActivated = builder.tdlsChannelSwitchingActivated;
        this.interworkingServiceActivated = builder.interworkingServiceActivated;
        this.qosMapActivated = builder.qosMapActivated;
        this.ebrActivated = builder.ebrActivated;
        this.sspnInterfaceActivated = builder.sspnInterfaceActivated;
        this.bit35 = builder.bit35;
        this.msgcfActivated = builder.msgcfActivated;
        this.tdlsSupported = builder.tdlsSupported;
        this.tdlsProhibited = builder.tdlsProhibited;
        this.tdlsChannelSwitchingProhibited = builder.tdlsChannelSwitchingProhibited;
        this.rejectingUnadmittedTraffic = builder.rejectingUnadmittedTraffic;
        this.serviceIntervalGranularity = builder.serviceIntervalGranularity;
        this.rmIdentifierMeasurementActivated = builder.rmIdentifierMeasurementActivated;
        this.uapsdCoexistenceActivated = builder.uapsdCoexistenceActivated;
        this.wnmNotificationActivated = builder.wnmNotificationActivated;
        this.bit47 = builder.bit47;
        this.utf8Ssid = builder.utf8Ssid;
        this.bit49 = builder.bit49;
        this.bit50 = builder.bit50;
        this.bit51 = builder.bit51;
        this.bit52 = builder.bit52;
        this.bit53 = builder.bit53;
        this.bit54 = builder.bit54;
        this.bit55 = builder.bit55;
        if (builder.trailingData != null) {
            this.trailingData = ByteArrays.clone(builder.trailingData);
        } else {
            this.trailingData = null;
        }
    }

    private Dot11ExtendedCapabilitiesElement(byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11, Dot11InformationElementId.EXTENDED_CAPABILITIES);
        int lengthAsInt = getLengthAsInt();
        this.actualLength = lengthAsInt;
        if (lengthAsInt > 0) {
            int i12 = i10 + 2;
            this.twentyFortyBssCoexistenceManagementSupported = Boolean.valueOf((bArr[i12] & 1) != 0);
            this.bit1 = Boolean.valueOf((bArr[i12] & 2) != 0);
            this.extendedChannelSwitchingSupported = Boolean.valueOf((bArr[i12] & 4) != 0);
            this.bit3 = Boolean.valueOf((bArr[i12] & 8) != 0);
            this.psmpOperationSupported = Boolean.valueOf((bArr[i12] & 16) != 0);
            this.bit5 = Boolean.valueOf((bArr[i12] & 32) != 0);
            this.scheduledPsmpSupported = Boolean.valueOf((bArr[i12] & 64) != 0);
            this.eventActivated = Boolean.valueOf((bArr[i12] & 128) != 0);
        } else {
            this.twentyFortyBssCoexistenceManagementSupported = null;
            this.bit1 = null;
            this.extendedChannelSwitchingSupported = null;
            this.bit3 = null;
            this.psmpOperationSupported = null;
            this.bit5 = null;
            this.scheduledPsmpSupported = null;
            this.eventActivated = null;
        }
        if (lengthAsInt > 1) {
            int i13 = i10 + 3;
            this.diagnosticsActivated = Boolean.valueOf((bArr[i13] & 1) != 0);
            this.multicastDiagnosticsActivated = Boolean.valueOf((bArr[i13] & 2) != 0);
            this.locationTrackingActivated = Boolean.valueOf((bArr[i13] & 4) != 0);
            this.fmsActivated = Boolean.valueOf((bArr[i13] & 8) != 0);
            this.proxyArpServiceActivated = Boolean.valueOf((bArr[i13] & 16) != 0);
            this.collocatedInterferenceReportingActivated = Boolean.valueOf((bArr[i13] & 32) != 0);
            this.rmCivicMeasurementActivated = Boolean.valueOf((bArr[i13] & 64) != 0);
            this.rmLciMeasurementActivated = Boolean.valueOf((bArr[i13] & 128) != 0);
        } else {
            this.diagnosticsActivated = null;
            this.multicastDiagnosticsActivated = null;
            this.locationTrackingActivated = null;
            this.fmsActivated = null;
            this.proxyArpServiceActivated = null;
            this.collocatedInterferenceReportingActivated = null;
            this.rmCivicMeasurementActivated = null;
            this.rmLciMeasurementActivated = null;
        }
        if (lengthAsInt > 2) {
            int i14 = i10 + 4;
            this.tfsActivated = Boolean.valueOf((bArr[i14] & 1) != 0);
            this.wnmSleepModeActivated = Boolean.valueOf((bArr[i14] & 2) != 0);
            this.timBroadcastActivated = Boolean.valueOf((bArr[i14] & 4) != 0);
            this.bssTransitionActivated = Boolean.valueOf((bArr[i14] & 8) != 0);
            this.qosTrafficCapabilityActivated = Boolean.valueOf((bArr[i14] & 16) != 0);
            this.acStationCountActivated = Boolean.valueOf((bArr[i14] & 32) != 0);
            this.multiBssIdActivated = Boolean.valueOf((bArr[i14] & 64) != 0);
            this.timingMeasurementActivated = Boolean.valueOf((bArr[i14] & 128) != 0);
        } else {
            this.tfsActivated = null;
            this.wnmSleepModeActivated = null;
            this.timBroadcastActivated = null;
            this.bssTransitionActivated = null;
            this.qosTrafficCapabilityActivated = null;
            this.acStationCountActivated = null;
            this.multiBssIdActivated = null;
            this.timingMeasurementActivated = null;
        }
        if (lengthAsInt > 3) {
            int i15 = i10 + 5;
            this.channelUsageActivated = Boolean.valueOf((bArr[i15] & 1) != 0);
            this.ssidListActivated = Boolean.valueOf((bArr[i15] & 2) != 0);
            this.dmsActivated = Boolean.valueOf((bArr[i15] & 4) != 0);
            this.utcTsfOffsetActivated = Boolean.valueOf((bArr[i15] & 8) != 0);
            this.tdlsPeerUapsdBufferStaSupported = Boolean.valueOf((bArr[i15] & 16) != 0);
            this.tdlsPeerPsmSupported = Boolean.valueOf((bArr[i15] & 32) != 0);
            this.tdlsChannelSwitchingActivated = Boolean.valueOf((bArr[i15] & 64) != 0);
            this.interworkingServiceActivated = Boolean.valueOf((bArr[i15] & 128) != 0);
        } else {
            this.channelUsageActivated = null;
            this.ssidListActivated = null;
            this.dmsActivated = null;
            this.utcTsfOffsetActivated = null;
            this.tdlsPeerUapsdBufferStaSupported = null;
            this.tdlsPeerPsmSupported = null;
            this.tdlsChannelSwitchingActivated = null;
            this.interworkingServiceActivated = null;
        }
        if (lengthAsInt > 4) {
            int i16 = i10 + 6;
            this.qosMapActivated = Boolean.valueOf((bArr[i16] & 1) != 0);
            this.ebrActivated = Boolean.valueOf((bArr[i16] & 2) != 0);
            this.sspnInterfaceActivated = Boolean.valueOf((bArr[i16] & 4) != 0);
            this.bit35 = Boolean.valueOf((bArr[i16] & 8) != 0);
            this.msgcfActivated = Boolean.valueOf((bArr[i16] & 16) != 0);
            this.tdlsSupported = Boolean.valueOf((bArr[i16] & 32) != 0);
            this.tdlsProhibited = Boolean.valueOf((bArr[i16] & 64) != 0);
            this.tdlsChannelSwitchingProhibited = Boolean.valueOf((bArr[i16] & 128) != 0);
        } else {
            this.qosMapActivated = null;
            this.ebrActivated = null;
            this.sspnInterfaceActivated = null;
            this.bit35 = null;
            this.msgcfActivated = null;
            this.tdlsSupported = null;
            this.tdlsProhibited = null;
            this.tdlsChannelSwitchingProhibited = null;
        }
        if (lengthAsInt > 5) {
            int i17 = i10 + 7;
            this.rejectingUnadmittedTraffic = Boolean.valueOf((bArr[i17] & 1) != 0);
            this.serviceIntervalGranularity = Dot11ServiceIntervalGranularity.getInstance(Byte.valueOf((byte) ((bArr[i17] & 14) >> 1)));
            this.rmIdentifierMeasurementActivated = Boolean.valueOf((bArr[i17] & 16) != 0);
            this.uapsdCoexistenceActivated = Boolean.valueOf((bArr[i17] & 32) != 0);
            this.wnmNotificationActivated = Boolean.valueOf((bArr[i17] & 64) != 0);
            this.bit47 = Boolean.valueOf((bArr[i17] & 128) != 0);
        } else {
            this.rejectingUnadmittedTraffic = null;
            this.serviceIntervalGranularity = null;
            this.rmIdentifierMeasurementActivated = null;
            this.uapsdCoexistenceActivated = null;
            this.wnmNotificationActivated = null;
            this.bit47 = null;
        }
        if (lengthAsInt > 6) {
            int i18 = i10 + 8;
            this.utf8Ssid = Boolean.valueOf((bArr[i18] & 1) != 0);
            this.bit49 = Boolean.valueOf((2 & bArr[i18]) != 0);
            this.bit50 = Boolean.valueOf((4 & bArr[i18]) != 0);
            this.bit51 = Boolean.valueOf((bArr[i18] & 8) != 0);
            this.bit52 = Boolean.valueOf((bArr[i18] & 16) != 0);
            this.bit53 = Boolean.valueOf((bArr[i18] & 32) != 0);
            this.bit54 = Boolean.valueOf((bArr[i18] & 64) != 0);
            this.bit55 = Boolean.valueOf((bArr[i18] & 128) != 0);
        } else {
            this.utf8Ssid = null;
            this.bit49 = null;
            this.bit50 = null;
            this.bit51 = null;
            this.bit52 = null;
            this.bit53 = null;
            this.bit54 = null;
            this.bit55 = null;
        }
        if (lengthAsInt > 7) {
            this.trailingData = ByteArrays.getSubArray(bArr, i10 + 9, lengthAsInt - 7);
        } else {
            this.trailingData = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int calcActualLength(Builder builder) {
        if (builder.trailingData != null) {
            return builder.trailingData.length + 7;
        }
        if (builder.utf8Ssid != null || builder.bit49 != null || builder.bit50 != null || builder.bit51 != null || builder.bit52 != null || builder.bit53 != null || builder.bit54 != null || builder.bit55 != null) {
            return 7;
        }
        if (builder.rejectingUnadmittedTraffic != null || builder.serviceIntervalGranularity != null || builder.rmIdentifierMeasurementActivated != null || builder.uapsdCoexistenceActivated != null || builder.wnmNotificationActivated != null || builder.bit47 != null) {
            return 6;
        }
        if (builder.qosMapActivated != null || builder.ebrActivated != null || builder.sspnInterfaceActivated != null || builder.bit35 != null || builder.msgcfActivated != null || builder.tdlsSupported != null || builder.tdlsProhibited != null || builder.tdlsChannelSwitchingProhibited != null) {
            return 5;
        }
        if (builder.channelUsageActivated != null || builder.ssidListActivated != null || builder.dmsActivated != null || builder.utcTsfOffsetActivated != null || builder.tdlsPeerUapsdBufferStaSupported != null || builder.tdlsPeerPsmSupported != null || builder.tdlsChannelSwitchingActivated != null || builder.interworkingServiceActivated != null) {
            return 4;
        }
        if (builder.tfsActivated != null || builder.wnmSleepModeActivated != null || builder.timBroadcastActivated != null || builder.bssTransitionActivated != null || builder.qosTrafficCapabilityActivated != null || builder.acStationCountActivated != null || builder.multiBssIdActivated != null || builder.timingMeasurementActivated != null) {
            return 3;
        }
        if (builder.diagnosticsActivated == null && builder.multicastDiagnosticsActivated == null && builder.locationTrackingActivated == null && builder.fmsActivated == null && builder.proxyArpServiceActivated == null && builder.collocatedInterferenceReportingActivated == null && builder.rmCivicMeasurementActivated == null && builder.rmLciMeasurementActivated == null) {
            return (builder.twentyFortyBssCoexistenceManagementSupported == null && builder.bit1 == null && builder.extendedChannelSwitchingSupported == null && builder.bit3 == null && builder.psmpOperationSupported == null && builder.bit5 == null && builder.scheduledPsmpSupported == null && builder.eventActivated == null) ? 0 : 1;
        }
        return 2;
    }

    public static Dot11ExtendedCapabilitiesElement newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new Dot11ExtendedCapabilitiesElement(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Dot11ExtendedCapabilitiesElement dot11ExtendedCapabilitiesElement = (Dot11ExtendedCapabilitiesElement) obj;
        Boolean bool = this.utf8Ssid;
        if (bool == null) {
            if (dot11ExtendedCapabilitiesElement.utf8Ssid != null) {
                return false;
            }
        } else if (!bool.equals(dot11ExtendedCapabilitiesElement.utf8Ssid)) {
            return false;
        }
        Boolean bool2 = this.acStationCountActivated;
        if (bool2 == null) {
            if (dot11ExtendedCapabilitiesElement.acStationCountActivated != null) {
                return false;
            }
        } else if (!bool2.equals(dot11ExtendedCapabilitiesElement.acStationCountActivated)) {
            return false;
        }
        Boolean bool3 = this.bit1;
        if (bool3 == null) {
            if (dot11ExtendedCapabilitiesElement.bit1 != null) {
                return false;
            }
        } else if (!bool3.equals(dot11ExtendedCapabilitiesElement.bit1)) {
            return false;
        }
        Boolean bool4 = this.bit3;
        if (bool4 == null) {
            if (dot11ExtendedCapabilitiesElement.bit3 != null) {
                return false;
            }
        } else if (!bool4.equals(dot11ExtendedCapabilitiesElement.bit3)) {
            return false;
        }
        Boolean bool5 = this.bit35;
        if (bool5 == null) {
            if (dot11ExtendedCapabilitiesElement.bit35 != null) {
                return false;
            }
        } else if (!bool5.equals(dot11ExtendedCapabilitiesElement.bit35)) {
            return false;
        }
        Boolean bool6 = this.bit47;
        if (bool6 == null) {
            if (dot11ExtendedCapabilitiesElement.bit47 != null) {
                return false;
            }
        } else if (!bool6.equals(dot11ExtendedCapabilitiesElement.bit47)) {
            return false;
        }
        Boolean bool7 = this.bit49;
        if (bool7 == null) {
            if (dot11ExtendedCapabilitiesElement.bit49 != null) {
                return false;
            }
        } else if (!bool7.equals(dot11ExtendedCapabilitiesElement.bit49)) {
            return false;
        }
        Boolean bool8 = this.bit5;
        if (bool8 == null) {
            if (dot11ExtendedCapabilitiesElement.bit5 != null) {
                return false;
            }
        } else if (!bool8.equals(dot11ExtendedCapabilitiesElement.bit5)) {
            return false;
        }
        Boolean bool9 = this.bit50;
        if (bool9 == null) {
            if (dot11ExtendedCapabilitiesElement.bit50 != null) {
                return false;
            }
        } else if (!bool9.equals(dot11ExtendedCapabilitiesElement.bit50)) {
            return false;
        }
        Boolean bool10 = this.bit51;
        if (bool10 == null) {
            if (dot11ExtendedCapabilitiesElement.bit51 != null) {
                return false;
            }
        } else if (!bool10.equals(dot11ExtendedCapabilitiesElement.bit51)) {
            return false;
        }
        Boolean bool11 = this.bit52;
        if (bool11 == null) {
            if (dot11ExtendedCapabilitiesElement.bit52 != null) {
                return false;
            }
        } else if (!bool11.equals(dot11ExtendedCapabilitiesElement.bit52)) {
            return false;
        }
        Boolean bool12 = this.bit53;
        if (bool12 == null) {
            if (dot11ExtendedCapabilitiesElement.bit53 != null) {
                return false;
            }
        } else if (!bool12.equals(dot11ExtendedCapabilitiesElement.bit53)) {
            return false;
        }
        Boolean bool13 = this.bit54;
        if (bool13 == null) {
            if (dot11ExtendedCapabilitiesElement.bit54 != null) {
                return false;
            }
        } else if (!bool13.equals(dot11ExtendedCapabilitiesElement.bit54)) {
            return false;
        }
        Boolean bool14 = this.bit55;
        if (bool14 == null) {
            if (dot11ExtendedCapabilitiesElement.bit55 != null) {
                return false;
            }
        } else if (!bool14.equals(dot11ExtendedCapabilitiesElement.bit55)) {
            return false;
        }
        Boolean bool15 = this.bssTransitionActivated;
        if (bool15 == null) {
            if (dot11ExtendedCapabilitiesElement.bssTransitionActivated != null) {
                return false;
            }
        } else if (!bool15.equals(dot11ExtendedCapabilitiesElement.bssTransitionActivated)) {
            return false;
        }
        Boolean bool16 = this.channelUsageActivated;
        if (bool16 == null) {
            if (dot11ExtendedCapabilitiesElement.channelUsageActivated != null) {
                return false;
            }
        } else if (!bool16.equals(dot11ExtendedCapabilitiesElement.channelUsageActivated)) {
            return false;
        }
        Boolean bool17 = this.collocatedInterferenceReportingActivated;
        if (bool17 == null) {
            if (dot11ExtendedCapabilitiesElement.collocatedInterferenceReportingActivated != null) {
                return false;
            }
        } else if (!bool17.equals(dot11ExtendedCapabilitiesElement.collocatedInterferenceReportingActivated)) {
            return false;
        }
        Boolean bool18 = this.diagnosticsActivated;
        if (bool18 == null) {
            if (dot11ExtendedCapabilitiesElement.diagnosticsActivated != null) {
                return false;
            }
        } else if (!bool18.equals(dot11ExtendedCapabilitiesElement.diagnosticsActivated)) {
            return false;
        }
        Boolean bool19 = this.dmsActivated;
        if (bool19 == null) {
            if (dot11ExtendedCapabilitiesElement.dmsActivated != null) {
                return false;
            }
        } else if (!bool19.equals(dot11ExtendedCapabilitiesElement.dmsActivated)) {
            return false;
        }
        Boolean bool20 = this.ebrActivated;
        if (bool20 == null) {
            if (dot11ExtendedCapabilitiesElement.ebrActivated != null) {
                return false;
            }
        } else if (!bool20.equals(dot11ExtendedCapabilitiesElement.ebrActivated)) {
            return false;
        }
        Boolean bool21 = this.eventActivated;
        if (bool21 == null) {
            if (dot11ExtendedCapabilitiesElement.eventActivated != null) {
                return false;
            }
        } else if (!bool21.equals(dot11ExtendedCapabilitiesElement.eventActivated)) {
            return false;
        }
        Boolean bool22 = this.extendedChannelSwitchingSupported;
        if (bool22 == null) {
            if (dot11ExtendedCapabilitiesElement.extendedChannelSwitchingSupported != null) {
                return false;
            }
        } else if (!bool22.equals(dot11ExtendedCapabilitiesElement.extendedChannelSwitchingSupported)) {
            return false;
        }
        Boolean bool23 = this.fmsActivated;
        if (bool23 == null) {
            if (dot11ExtendedCapabilitiesElement.fmsActivated != null) {
                return false;
            }
        } else if (!bool23.equals(dot11ExtendedCapabilitiesElement.fmsActivated)) {
            return false;
        }
        Boolean bool24 = this.interworkingServiceActivated;
        if (bool24 == null) {
            if (dot11ExtendedCapabilitiesElement.interworkingServiceActivated != null) {
                return false;
            }
        } else if (!bool24.equals(dot11ExtendedCapabilitiesElement.interworkingServiceActivated)) {
            return false;
        }
        Boolean bool25 = this.locationTrackingActivated;
        if (bool25 == null) {
            if (dot11ExtendedCapabilitiesElement.locationTrackingActivated != null) {
                return false;
            }
        } else if (!bool25.equals(dot11ExtendedCapabilitiesElement.locationTrackingActivated)) {
            return false;
        }
        Boolean bool26 = this.msgcfActivated;
        if (bool26 == null) {
            if (dot11ExtendedCapabilitiesElement.msgcfActivated != null) {
                return false;
            }
        } else if (!bool26.equals(dot11ExtendedCapabilitiesElement.msgcfActivated)) {
            return false;
        }
        Boolean bool27 = this.multiBssIdActivated;
        if (bool27 == null) {
            if (dot11ExtendedCapabilitiesElement.multiBssIdActivated != null) {
                return false;
            }
        } else if (!bool27.equals(dot11ExtendedCapabilitiesElement.multiBssIdActivated)) {
            return false;
        }
        Boolean bool28 = this.multicastDiagnosticsActivated;
        if (bool28 == null) {
            if (dot11ExtendedCapabilitiesElement.multicastDiagnosticsActivated != null) {
                return false;
            }
        } else if (!bool28.equals(dot11ExtendedCapabilitiesElement.multicastDiagnosticsActivated)) {
            return false;
        }
        Boolean bool29 = this.proxyArpServiceActivated;
        if (bool29 == null) {
            if (dot11ExtendedCapabilitiesElement.proxyArpServiceActivated != null) {
                return false;
            }
        } else if (!bool29.equals(dot11ExtendedCapabilitiesElement.proxyArpServiceActivated)) {
            return false;
        }
        Boolean bool30 = this.psmpOperationSupported;
        if (bool30 == null) {
            if (dot11ExtendedCapabilitiesElement.psmpOperationSupported != null) {
                return false;
            }
        } else if (!bool30.equals(dot11ExtendedCapabilitiesElement.psmpOperationSupported)) {
            return false;
        }
        Boolean bool31 = this.qosMapActivated;
        if (bool31 == null) {
            if (dot11ExtendedCapabilitiesElement.qosMapActivated != null) {
                return false;
            }
        } else if (!bool31.equals(dot11ExtendedCapabilitiesElement.qosMapActivated)) {
            return false;
        }
        Boolean bool32 = this.qosTrafficCapabilityActivated;
        if (bool32 == null) {
            if (dot11ExtendedCapabilitiesElement.qosTrafficCapabilityActivated != null) {
                return false;
            }
        } else if (!bool32.equals(dot11ExtendedCapabilitiesElement.qosTrafficCapabilityActivated)) {
            return false;
        }
        Boolean bool33 = this.rejectingUnadmittedTraffic;
        if (bool33 == null) {
            if (dot11ExtendedCapabilitiesElement.rejectingUnadmittedTraffic != null) {
                return false;
            }
        } else if (!bool33.equals(dot11ExtendedCapabilitiesElement.rejectingUnadmittedTraffic)) {
            return false;
        }
        Boolean bool34 = this.rmCivicMeasurementActivated;
        if (bool34 == null) {
            if (dot11ExtendedCapabilitiesElement.rmCivicMeasurementActivated != null) {
                return false;
            }
        } else if (!bool34.equals(dot11ExtendedCapabilitiesElement.rmCivicMeasurementActivated)) {
            return false;
        }
        Boolean bool35 = this.rmIdentifierMeasurementActivated;
        if (bool35 == null) {
            if (dot11ExtendedCapabilitiesElement.rmIdentifierMeasurementActivated != null) {
                return false;
            }
        } else if (!bool35.equals(dot11ExtendedCapabilitiesElement.rmIdentifierMeasurementActivated)) {
            return false;
        }
        Boolean bool36 = this.rmLciMeasurementActivated;
        if (bool36 == null) {
            if (dot11ExtendedCapabilitiesElement.rmLciMeasurementActivated != null) {
                return false;
            }
        } else if (!bool36.equals(dot11ExtendedCapabilitiesElement.rmLciMeasurementActivated)) {
            return false;
        }
        Boolean bool37 = this.scheduledPsmpSupported;
        if (bool37 == null) {
            if (dot11ExtendedCapabilitiesElement.scheduledPsmpSupported != null) {
                return false;
            }
        } else if (!bool37.equals(dot11ExtendedCapabilitiesElement.scheduledPsmpSupported)) {
            return false;
        }
        Dot11ServiceIntervalGranularity dot11ServiceIntervalGranularity = this.serviceIntervalGranularity;
        if (dot11ServiceIntervalGranularity == null) {
            if (dot11ExtendedCapabilitiesElement.serviceIntervalGranularity != null) {
                return false;
            }
        } else if (!dot11ServiceIntervalGranularity.equals(dot11ExtendedCapabilitiesElement.serviceIntervalGranularity)) {
            return false;
        }
        Boolean bool38 = this.ssidListActivated;
        if (bool38 == null) {
            if (dot11ExtendedCapabilitiesElement.ssidListActivated != null) {
                return false;
            }
        } else if (!bool38.equals(dot11ExtendedCapabilitiesElement.ssidListActivated)) {
            return false;
        }
        Boolean bool39 = this.sspnInterfaceActivated;
        if (bool39 == null) {
            if (dot11ExtendedCapabilitiesElement.sspnInterfaceActivated != null) {
                return false;
            }
        } else if (!bool39.equals(dot11ExtendedCapabilitiesElement.sspnInterfaceActivated)) {
            return false;
        }
        Boolean bool40 = this.tdlsChannelSwitchingActivated;
        if (bool40 == null) {
            if (dot11ExtendedCapabilitiesElement.tdlsChannelSwitchingActivated != null) {
                return false;
            }
        } else if (!bool40.equals(dot11ExtendedCapabilitiesElement.tdlsChannelSwitchingActivated)) {
            return false;
        }
        Boolean bool41 = this.tdlsChannelSwitchingProhibited;
        if (bool41 == null) {
            if (dot11ExtendedCapabilitiesElement.tdlsChannelSwitchingProhibited != null) {
                return false;
            }
        } else if (!bool41.equals(dot11ExtendedCapabilitiesElement.tdlsChannelSwitchingProhibited)) {
            return false;
        }
        Boolean bool42 = this.tdlsPeerPsmSupported;
        if (bool42 == null) {
            if (dot11ExtendedCapabilitiesElement.tdlsPeerPsmSupported != null) {
                return false;
            }
        } else if (!bool42.equals(dot11ExtendedCapabilitiesElement.tdlsPeerPsmSupported)) {
            return false;
        }
        Boolean bool43 = this.tdlsPeerUapsdBufferStaSupported;
        if (bool43 == null) {
            if (dot11ExtendedCapabilitiesElement.tdlsPeerUapsdBufferStaSupported != null) {
                return false;
            }
        } else if (!bool43.equals(dot11ExtendedCapabilitiesElement.tdlsPeerUapsdBufferStaSupported)) {
            return false;
        }
        Boolean bool44 = this.tdlsProhibited;
        if (bool44 == null) {
            if (dot11ExtendedCapabilitiesElement.tdlsProhibited != null) {
                return false;
            }
        } else if (!bool44.equals(dot11ExtendedCapabilitiesElement.tdlsProhibited)) {
            return false;
        }
        Boolean bool45 = this.tdlsSupported;
        if (bool45 == null) {
            if (dot11ExtendedCapabilitiesElement.tdlsSupported != null) {
                return false;
            }
        } else if (!bool45.equals(dot11ExtendedCapabilitiesElement.tdlsSupported)) {
            return false;
        }
        Boolean bool46 = this.tfsActivated;
        if (bool46 == null) {
            if (dot11ExtendedCapabilitiesElement.tfsActivated != null) {
                return false;
            }
        } else if (!bool46.equals(dot11ExtendedCapabilitiesElement.tfsActivated)) {
            return false;
        }
        Boolean bool47 = this.timBroadcastActivated;
        if (bool47 == null) {
            if (dot11ExtendedCapabilitiesElement.timBroadcastActivated != null) {
                return false;
            }
        } else if (!bool47.equals(dot11ExtendedCapabilitiesElement.timBroadcastActivated)) {
            return false;
        }
        Boolean bool48 = this.timingMeasurementActivated;
        if (bool48 == null) {
            if (dot11ExtendedCapabilitiesElement.timingMeasurementActivated != null) {
                return false;
            }
        } else if (!bool48.equals(dot11ExtendedCapabilitiesElement.timingMeasurementActivated)) {
            return false;
        }
        if (!Arrays.equals(this.trailingData, dot11ExtendedCapabilitiesElement.trailingData)) {
            return false;
        }
        Boolean bool49 = this.twentyFortyBssCoexistenceManagementSupported;
        if (bool49 == null) {
            if (dot11ExtendedCapabilitiesElement.twentyFortyBssCoexistenceManagementSupported != null) {
                return false;
            }
        } else if (!bool49.equals(dot11ExtendedCapabilitiesElement.twentyFortyBssCoexistenceManagementSupported)) {
            return false;
        }
        Boolean bool50 = this.uapsdCoexistenceActivated;
        if (bool50 == null) {
            if (dot11ExtendedCapabilitiesElement.uapsdCoexistenceActivated != null) {
                return false;
            }
        } else if (!bool50.equals(dot11ExtendedCapabilitiesElement.uapsdCoexistenceActivated)) {
            return false;
        }
        Boolean bool51 = this.utcTsfOffsetActivated;
        if (bool51 == null) {
            if (dot11ExtendedCapabilitiesElement.utcTsfOffsetActivated != null) {
                return false;
            }
        } else if (!bool51.equals(dot11ExtendedCapabilitiesElement.utcTsfOffsetActivated)) {
            return false;
        }
        Boolean bool52 = this.wnmNotificationActivated;
        if (bool52 == null) {
            if (dot11ExtendedCapabilitiesElement.wnmNotificationActivated != null) {
                return false;
            }
        } else if (!bool52.equals(dot11ExtendedCapabilitiesElement.wnmNotificationActivated)) {
            return false;
        }
        Boolean bool53 = this.wnmSleepModeActivated;
        Boolean bool54 = dot11ExtendedCapabilitiesElement.wnmSleepModeActivated;
        return bool53 == null ? bool54 == null : bool53.equals(bool54);
    }

    public Boolean getBit1() {
        return this.bit1;
    }

    public Boolean getBit3() {
        return this.bit3;
    }

    public Boolean getBit35() {
        return this.bit35;
    }

    public Boolean getBit47() {
        return this.bit47;
    }

    public Boolean getBit49() {
        return this.bit49;
    }

    public Boolean getBit5() {
        return this.bit5;
    }

    public Boolean getBit50() {
        return this.bit50;
    }

    public Boolean getBit51() {
        return this.bit51;
    }

    public Boolean getBit52() {
        return this.bit52;
    }

    public Boolean getBit53() {
        return this.bit53;
    }

    public Boolean getBit54() {
        return this.bit54;
    }

    public Boolean getBit55() {
        return this.bit55;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = getElementId().value().byteValue();
        bArr[1] = getLength();
        if (this.actualLength > 0) {
            Boolean bool = Boolean.TRUE;
            if (bool.equals(this.twentyFortyBssCoexistenceManagementSupported)) {
                bArr[2] = (byte) (bArr[2] | 1);
            }
            if (bool.equals(this.bit1)) {
                bArr[2] = (byte) (bArr[2] | 2);
            }
            if (bool.equals(this.extendedChannelSwitchingSupported)) {
                bArr[2] = (byte) (bArr[2] | 4);
            }
            if (bool.equals(this.bit3)) {
                bArr[2] = (byte) (bArr[2] | 8);
            }
            if (bool.equals(this.psmpOperationSupported)) {
                bArr[2] = (byte) (bArr[2] | 16);
            }
            if (bool.equals(this.bit5)) {
                bArr[2] = (byte) (bArr[2] | 32);
            }
            if (bool.equals(this.scheduledPsmpSupported)) {
                bArr[2] = (byte) (bArr[2] | 64);
            }
            if (bool.equals(this.eventActivated)) {
                bArr[2] = (byte) (bArr[2] | 128);
            }
        }
        if (this.actualLength > 1) {
            Boolean bool2 = Boolean.TRUE;
            if (bool2.equals(this.diagnosticsActivated)) {
                bArr[3] = (byte) (bArr[3] | 1);
            }
            if (bool2.equals(this.multicastDiagnosticsActivated)) {
                bArr[3] = (byte) (bArr[3] | 2);
            }
            if (bool2.equals(this.locationTrackingActivated)) {
                bArr[3] = (byte) (bArr[3] | 4);
            }
            if (bool2.equals(this.fmsActivated)) {
                bArr[3] = (byte) (bArr[3] | 8);
            }
            if (bool2.equals(this.proxyArpServiceActivated)) {
                bArr[3] = (byte) (bArr[3] | 16);
            }
            if (bool2.equals(this.collocatedInterferenceReportingActivated)) {
                bArr[3] = (byte) (bArr[3] | 32);
            }
            if (bool2.equals(this.rmCivicMeasurementActivated)) {
                bArr[3] = (byte) (bArr[3] | 64);
            }
            if (bool2.equals(this.rmLciMeasurementActivated)) {
                bArr[3] = (byte) (bArr[3] | 128);
            }
        }
        if (this.actualLength > 2) {
            Boolean bool3 = Boolean.TRUE;
            if (bool3.equals(this.tfsActivated)) {
                bArr[4] = (byte) (bArr[4] | 1);
            }
            if (bool3.equals(this.wnmSleepModeActivated)) {
                bArr[4] = (byte) (bArr[4] | 2);
            }
            if (bool3.equals(this.timBroadcastActivated)) {
                bArr[4] = (byte) (bArr[4] | 4);
            }
            if (bool3.equals(this.bssTransitionActivated)) {
                bArr[4] = (byte) (bArr[4] | 8);
            }
            if (bool3.equals(this.qosTrafficCapabilityActivated)) {
                bArr[4] = (byte) (bArr[4] | 16);
            }
            if (bool3.equals(this.acStationCountActivated)) {
                bArr[4] = (byte) (bArr[4] | 32);
            }
            if (bool3.equals(this.multiBssIdActivated)) {
                bArr[4] = (byte) (bArr[4] | 64);
            }
            if (bool3.equals(this.timingMeasurementActivated)) {
                bArr[4] = (byte) (bArr[4] | 128);
            }
        }
        if (this.actualLength > 3) {
            Boolean bool4 = Boolean.TRUE;
            if (bool4.equals(this.channelUsageActivated)) {
                bArr[5] = (byte) (bArr[5] | 1);
            }
            if (bool4.equals(this.ssidListActivated)) {
                bArr[5] = (byte) (bArr[5] | 2);
            }
            if (bool4.equals(this.dmsActivated)) {
                bArr[5] = (byte) (bArr[5] | 4);
            }
            if (bool4.equals(this.utcTsfOffsetActivated)) {
                bArr[5] = (byte) (bArr[5] | 8);
            }
            if (bool4.equals(this.tdlsPeerUapsdBufferStaSupported)) {
                bArr[5] = (byte) (bArr[5] | 16);
            }
            if (bool4.equals(this.tdlsPeerPsmSupported)) {
                bArr[5] = (byte) (bArr[5] | 32);
            }
            if (bool4.equals(this.tdlsChannelSwitchingActivated)) {
                bArr[5] = (byte) (bArr[5] | 64);
            }
            if (bool4.equals(this.interworkingServiceActivated)) {
                bArr[5] = (byte) (bArr[5] | 128);
            }
        }
        if (this.actualLength > 4) {
            Boolean bool5 = Boolean.TRUE;
            if (bool5.equals(this.qosMapActivated)) {
                bArr[6] = (byte) (bArr[6] | 1);
            }
            if (bool5.equals(this.ebrActivated)) {
                bArr[6] = (byte) (bArr[6] | 2);
            }
            if (bool5.equals(this.sspnInterfaceActivated)) {
                bArr[6] = (byte) (bArr[6] | 4);
            }
            if (bool5.equals(this.bit35)) {
                bArr[6] = (byte) (bArr[6] | 8);
            }
            if (bool5.equals(this.msgcfActivated)) {
                bArr[6] = (byte) (bArr[6] | 16);
            }
            if (bool5.equals(this.tdlsSupported)) {
                bArr[6] = (byte) (bArr[6] | 32);
            }
            if (bool5.equals(this.tdlsProhibited)) {
                bArr[6] = (byte) (bArr[6] | 64);
            }
            if (bool5.equals(this.tdlsChannelSwitchingProhibited)) {
                bArr[6] = (byte) (bArr[6] | 128);
            }
        }
        if (this.actualLength > 5) {
            bArr[7] = (byte) (this.serviceIntervalGranularity.value().byteValue() << 1);
            Boolean bool6 = Boolean.TRUE;
            if (bool6.equals(this.rejectingUnadmittedTraffic)) {
                bArr[7] = (byte) (bArr[7] | 1);
            }
            if (bool6.equals(this.rmIdentifierMeasurementActivated)) {
                bArr[7] = (byte) (bArr[7] | 16);
            }
            if (bool6.equals(this.uapsdCoexistenceActivated)) {
                bArr[7] = (byte) (bArr[7] | 32);
            }
            if (bool6.equals(this.wnmNotificationActivated)) {
                bArr[7] = (byte) (bArr[7] | 64);
            }
            if (bool6.equals(this.bit47)) {
                bArr[7] = (byte) (bArr[7] | 128);
            }
        }
        if (this.actualLength > 6) {
            Boolean bool7 = Boolean.TRUE;
            if (bool7.equals(this.utf8Ssid)) {
                bArr[8] = (byte) (1 | bArr[8]);
            }
            if (bool7.equals(this.bit49)) {
                bArr[8] = (byte) (bArr[8] | 2);
            }
            if (bool7.equals(this.bit50)) {
                bArr[8] = (byte) (bArr[8] | 4);
            }
            if (bool7.equals(this.bit51)) {
                bArr[8] = (byte) (bArr[8] | 8);
            }
            if (bool7.equals(this.bit52)) {
                bArr[8] = (byte) (bArr[8] | 16);
            }
            if (bool7.equals(this.bit53)) {
                bArr[8] = (byte) (bArr[8] | 32);
            }
            if (bool7.equals(this.bit54)) {
                bArr[8] = (byte) (bArr[8] | 64);
            }
            if (bool7.equals(this.bit55)) {
                bArr[8] = (byte) (bArr[8] | 128);
            }
        }
        if (this.actualLength > 7) {
            byte[] bArr2 = this.trailingData;
            System.arraycopy(bArr2, 0, bArr, 9, bArr2.length);
        }
        return bArr;
    }

    public Dot11ServiceIntervalGranularity getServiceIntervalGranularity() {
        return this.serviceIntervalGranularity;
    }

    public byte[] getTrailingData() {
        byte[] bArr = this.trailingData;
        return bArr != null ? ByteArrays.clone(bArr) : null;
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int hashCode() {
        int hashCode = super.hashCode();
        Boolean bool = this.utf8Ssid;
        int i10 = 0;
        int hashCode2 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.acStationCountActivated;
        int hashCode3 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.bit1;
        int hashCode4 = bool3 == null ? 0 : bool3.hashCode();
        Boolean bool4 = this.bit3;
        int hashCode5 = bool4 == null ? 0 : bool4.hashCode();
        Boolean bool5 = this.bit35;
        int hashCode6 = bool5 == null ? 0 : bool5.hashCode();
        Boolean bool6 = this.bit47;
        int hashCode7 = bool6 == null ? 0 : bool6.hashCode();
        Boolean bool7 = this.bit49;
        int hashCode8 = bool7 == null ? 0 : bool7.hashCode();
        Boolean bool8 = this.bit5;
        int hashCode9 = bool8 == null ? 0 : bool8.hashCode();
        Boolean bool9 = this.bit50;
        int hashCode10 = bool9 == null ? 0 : bool9.hashCode();
        Boolean bool10 = this.bit51;
        int hashCode11 = bool10 == null ? 0 : bool10.hashCode();
        Boolean bool11 = this.bit52;
        int hashCode12 = bool11 == null ? 0 : bool11.hashCode();
        Boolean bool12 = this.bit53;
        int hashCode13 = bool12 == null ? 0 : bool12.hashCode();
        Boolean bool13 = this.bit54;
        int hashCode14 = bool13 == null ? 0 : bool13.hashCode();
        Boolean bool14 = this.bit55;
        int hashCode15 = bool14 == null ? 0 : bool14.hashCode();
        Boolean bool15 = this.bssTransitionActivated;
        int hashCode16 = bool15 == null ? 0 : bool15.hashCode();
        Boolean bool16 = this.channelUsageActivated;
        int hashCode17 = bool16 == null ? 0 : bool16.hashCode();
        Boolean bool17 = this.collocatedInterferenceReportingActivated;
        int hashCode18 = bool17 == null ? 0 : bool17.hashCode();
        Boolean bool18 = this.diagnosticsActivated;
        int hashCode19 = bool18 == null ? 0 : bool18.hashCode();
        Boolean bool19 = this.dmsActivated;
        int hashCode20 = bool19 == null ? 0 : bool19.hashCode();
        Boolean bool20 = this.ebrActivated;
        int hashCode21 = bool20 == null ? 0 : bool20.hashCode();
        Boolean bool21 = this.eventActivated;
        int hashCode22 = bool21 == null ? 0 : bool21.hashCode();
        Boolean bool22 = this.extendedChannelSwitchingSupported;
        int hashCode23 = bool22 == null ? 0 : bool22.hashCode();
        Boolean bool23 = this.fmsActivated;
        int hashCode24 = bool23 == null ? 0 : bool23.hashCode();
        Boolean bool24 = this.interworkingServiceActivated;
        int hashCode25 = bool24 == null ? 0 : bool24.hashCode();
        Boolean bool25 = this.locationTrackingActivated;
        int hashCode26 = bool25 == null ? 0 : bool25.hashCode();
        Boolean bool26 = this.msgcfActivated;
        int hashCode27 = bool26 == null ? 0 : bool26.hashCode();
        Boolean bool27 = this.multiBssIdActivated;
        int hashCode28 = bool27 == null ? 0 : bool27.hashCode();
        Boolean bool28 = this.multicastDiagnosticsActivated;
        int hashCode29 = bool28 == null ? 0 : bool28.hashCode();
        Boolean bool29 = this.proxyArpServiceActivated;
        int hashCode30 = bool29 == null ? 0 : bool29.hashCode();
        Boolean bool30 = this.psmpOperationSupported;
        int hashCode31 = bool30 == null ? 0 : bool30.hashCode();
        Boolean bool31 = this.qosMapActivated;
        int hashCode32 = bool31 == null ? 0 : bool31.hashCode();
        Boolean bool32 = this.qosTrafficCapabilityActivated;
        int hashCode33 = bool32 == null ? 0 : bool32.hashCode();
        Boolean bool33 = this.rejectingUnadmittedTraffic;
        int hashCode34 = bool33 == null ? 0 : bool33.hashCode();
        Boolean bool34 = this.rmCivicMeasurementActivated;
        int hashCode35 = bool34 == null ? 0 : bool34.hashCode();
        Boolean bool35 = this.rmIdentifierMeasurementActivated;
        int hashCode36 = bool35 == null ? 0 : bool35.hashCode();
        Boolean bool36 = this.rmLciMeasurementActivated;
        int hashCode37 = bool36 == null ? 0 : bool36.hashCode();
        Boolean bool37 = this.scheduledPsmpSupported;
        int hashCode38 = bool37 == null ? 0 : bool37.hashCode();
        Dot11ServiceIntervalGranularity dot11ServiceIntervalGranularity = this.serviceIntervalGranularity;
        int hashCode39 = dot11ServiceIntervalGranularity == null ? 0 : dot11ServiceIntervalGranularity.hashCode();
        Boolean bool38 = this.ssidListActivated;
        int hashCode40 = bool38 == null ? 0 : bool38.hashCode();
        Boolean bool39 = this.sspnInterfaceActivated;
        int hashCode41 = bool39 == null ? 0 : bool39.hashCode();
        Boolean bool40 = this.tdlsChannelSwitchingActivated;
        int hashCode42 = bool40 == null ? 0 : bool40.hashCode();
        Boolean bool41 = this.tdlsChannelSwitchingProhibited;
        int hashCode43 = bool41 == null ? 0 : bool41.hashCode();
        Boolean bool42 = this.tdlsPeerPsmSupported;
        int hashCode44 = bool42 == null ? 0 : bool42.hashCode();
        Boolean bool43 = this.tdlsPeerUapsdBufferStaSupported;
        int hashCode45 = bool43 == null ? 0 : bool43.hashCode();
        Boolean bool44 = this.tdlsProhibited;
        int hashCode46 = bool44 == null ? 0 : bool44.hashCode();
        Boolean bool45 = this.tdlsSupported;
        int hashCode47 = bool45 == null ? 0 : bool45.hashCode();
        Boolean bool46 = this.tfsActivated;
        int hashCode48 = bool46 == null ? 0 : bool46.hashCode();
        Boolean bool47 = this.timBroadcastActivated;
        int hashCode49 = bool47 == null ? 0 : bool47.hashCode();
        Boolean bool48 = this.timingMeasurementActivated;
        int hashCode50 = bool48 == null ? 0 : bool48.hashCode();
        int hashCode51 = Arrays.hashCode(this.trailingData);
        Boolean bool49 = this.twentyFortyBssCoexistenceManagementSupported;
        int hashCode52 = bool49 == null ? 0 : bool49.hashCode();
        Boolean bool50 = this.uapsdCoexistenceActivated;
        int hashCode53 = bool50 == null ? 0 : bool50.hashCode();
        Boolean bool51 = this.utcTsfOffsetActivated;
        int hashCode54 = bool51 == null ? 0 : bool51.hashCode();
        Boolean bool52 = this.wnmNotificationActivated;
        int hashCode55 = bool52 == null ? 0 : bool52.hashCode();
        Boolean bool53 = this.wnmSleepModeActivated;
        if (bool53 != null) {
            i10 = bool53.hashCode();
        }
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + hashCode21) * 31) + hashCode22) * 31) + hashCode23) * 31) + hashCode24) * 31) + hashCode25) * 31) + hashCode26) * 31) + hashCode27) * 31) + hashCode28) * 31) + hashCode29) * 31) + hashCode30) * 31) + hashCode31) * 31) + hashCode32) * 31) + hashCode33) * 31) + hashCode34) * 31) + hashCode35) * 31) + hashCode36) * 31) + hashCode37) * 31) + hashCode38) * 31) + hashCode39) * 31) + hashCode40) * 31) + hashCode41) * 31) + hashCode42) * 31) + hashCode43) * 31) + hashCode44) * 31) + hashCode45) * 31) + hashCode46) * 31) + hashCode47) * 31) + hashCode48) * 31) + hashCode49) * 31) + hashCode50) * 31) + hashCode51) * 31) + hashCode52) * 31) + hashCode53) * 31) + hashCode54) * 31) + hashCode55) * 31) + i10;
    }

    public Boolean is2040BssCoexistenceManagementSupported() {
        return this.twentyFortyBssCoexistenceManagementSupported;
    }

    public Boolean isAcStationCountActivated() {
        return this.acStationCountActivated;
    }

    public Boolean isBssTransitionActivated() {
        return this.bssTransitionActivated;
    }

    public Boolean isChannelUsageActivated() {
        return this.channelUsageActivated;
    }

    public Boolean isCollocatedInterferenceReportingActivated() {
        return this.collocatedInterferenceReportingActivated;
    }

    public Boolean isDiagnosticsActivated() {
        return this.diagnosticsActivated;
    }

    public Boolean isDmsActivated() {
        return this.dmsActivated;
    }

    public Boolean isEbrActivated() {
        return this.ebrActivated;
    }

    public Boolean isEventActivated() {
        return this.eventActivated;
    }

    public Boolean isExtendedChannelSwitchingSupported() {
        return this.extendedChannelSwitchingSupported;
    }

    public Boolean isFmsActivated() {
        return this.fmsActivated;
    }

    public Boolean isInterworkingServiceActivated() {
        return this.interworkingServiceActivated;
    }

    public Boolean isLocationTrackingActivated() {
        return this.locationTrackingActivated;
    }

    public Boolean isMsgcfActivated() {
        return this.msgcfActivated;
    }

    public Boolean isMultiBssIdActivated() {
        return this.multiBssIdActivated;
    }

    public Boolean isMulticastDiagnosticsActivated() {
        return this.multicastDiagnosticsActivated;
    }

    public Boolean isProxyArpServiceActivated() {
        return this.proxyArpServiceActivated;
    }

    public Boolean isPsmpOperationSupported() {
        return this.psmpOperationSupported;
    }

    public Boolean isQosMapActivated() {
        return this.qosMapActivated;
    }

    public Boolean isQosTrafficCapabilityActivated() {
        return this.qosTrafficCapabilityActivated;
    }

    public Boolean isRejectingUnadmittedTraffic() {
        return this.rejectingUnadmittedTraffic;
    }

    public Boolean isRmCivicMeasurementActivated() {
        return this.rmCivicMeasurementActivated;
    }

    public Boolean isRmIdentifierMeasurementActivated() {
        return this.rmIdentifierMeasurementActivated;
    }

    public Boolean isRmLciMeasurementActivated() {
        return this.rmLciMeasurementActivated;
    }

    public Boolean isScheduledPsmpSupported() {
        return this.scheduledPsmpSupported;
    }

    public Boolean isSsidListActivated() {
        return this.ssidListActivated;
    }

    public Boolean isSspnInterfaceActivated() {
        return this.sspnInterfaceActivated;
    }

    public Boolean isTdlsChannelSwitchingActivated() {
        return this.tdlsChannelSwitchingActivated;
    }

    public Boolean isTdlsChannelSwitchingProhibited() {
        return this.tdlsChannelSwitchingProhibited;
    }

    public Boolean isTdlsPeerPsmSupported() {
        return this.tdlsPeerPsmSupported;
    }

    public Boolean isTdlsPeerUapsdBufferStaSupported() {
        return this.tdlsPeerUapsdBufferStaSupported;
    }

    public Boolean isTdlsProhibited() {
        return this.tdlsProhibited;
    }

    public Boolean isTdlsSupported() {
        return this.tdlsSupported;
    }

    public Boolean isTfsActivated() {
        return this.tfsActivated;
    }

    public Boolean isTimBroadcastActivated() {
        return this.timBroadcastActivated;
    }

    public Boolean isTimingMeasurementActivated() {
        return this.timingMeasurementActivated;
    }

    public Boolean isUapsdCoexistenceActivated() {
        return this.uapsdCoexistenceActivated;
    }

    public Boolean isUtcTsfOffsetActivated() {
        return this.utcTsfOffsetActivated;
    }

    public Boolean isWnmNotificationActivated() {
        return this.wnmNotificationActivated;
    }

    public Boolean isWnmSleepModeActivated() {
        return this.wnmSleepModeActivated;
    }

    public Boolean isutf8Ssid() {
        return this.utf8Ssid;
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int length() {
        return this.actualLength + 2;
    }

    public String toString() {
        return toString("");
    }

    public String toString(String str) {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(str);
        sb2.append("Extended Capabilities:");
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
        if (this.actualLength > 0) {
            sb2.append(str);
            sb2.append("  20/40 BSS Coexistence Management Supported: ");
            sb2.append(this.twentyFortyBssCoexistenceManagementSupported);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  Bit1: ");
            sb2.append(this.bit1);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  Extended Channel Switching Supported: ");
            sb2.append(this.extendedChannelSwitchingSupported);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  Bit3: ");
            sb2.append(this.bit3);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  PSMP Operation Supported: ");
            sb2.append(this.psmpOperationSupported);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  Bit5: ");
            sb2.append(this.bit5);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  Scheduled PSMP Supported: ");
            sb2.append(this.scheduledPsmpSupported);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  Event Activated: ");
            sb2.append(this.eventActivated);
            sb2.append(property);
        }
        if (this.actualLength > 1) {
            sb2.append(str);
            sb2.append("  Diagnostics Activated: ");
            sb2.append(this.diagnosticsActivated);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  Multicast Diagnostics Activated: ");
            sb2.append(this.multicastDiagnosticsActivated);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  Location Tracking Activated: ");
            sb2.append(this.locationTrackingActivated);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  FMS Activated: ");
            sb2.append(this.fmsActivated);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  Proxy ARP Service Activated: ");
            sb2.append(this.proxyArpServiceActivated);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  Collocated Interference Reporting Activated: ");
            sb2.append(this.collocatedInterferenceReportingActivated);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  RM Civic Measurement Activated: ");
            sb2.append(this.rmCivicMeasurementActivated);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  RM LCI Measurement Activated: ");
            sb2.append(this.rmLciMeasurementActivated);
            sb2.append(property);
        }
        if (this.actualLength > 2) {
            sb2.append(str);
            sb2.append("  TFS Activated: ");
            sb2.append(this.tfsActivated);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  WNM Sleep Mode Activated: ");
            sb2.append(this.wnmSleepModeActivated);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  TIM Broadcast Activated: ");
            sb2.append(this.timBroadcastActivated);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  BSS Transition Activated: ");
            sb2.append(this.bssTransitionActivated);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  QoS Traffic Capability Activated: ");
            sb2.append(this.qosTrafficCapabilityActivated);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  AC Station Count Activated: ");
            sb2.append(this.acStationCountActivated);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  Multi BSS ID Activated: ");
            sb2.append(this.multiBssIdActivated);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  Timing Measurement Activated: ");
            sb2.append(this.timingMeasurementActivated);
            sb2.append(property);
        }
        if (this.actualLength > 3) {
            sb2.append(str);
            sb2.append("  Channel Usage Activated: ");
            sb2.append(this.channelUsageActivated);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  SSID List Activated: ");
            sb2.append(this.ssidListActivated);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  DMS Activated: ");
            sb2.append(this.dmsActivated);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  UTC TSF Offset Activated: ");
            sb2.append(this.utcTsfOffsetActivated);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  TDLS Peer U-APSD Buffer STA Supported: ");
            sb2.append(this.tdlsPeerUapsdBufferStaSupported);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  TDLS Peer PSM Supported: ");
            sb2.append(this.tdlsPeerPsmSupported);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  TDLS Channel Switching Activated: ");
            sb2.append(this.tdlsChannelSwitchingActivated);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  Interworking Service Activated: ");
            sb2.append(this.interworkingServiceActivated);
            sb2.append(property);
        }
        if (this.actualLength > 4) {
            sb2.append(str);
            sb2.append("  QoS Map Activated: ");
            sb2.append(this.qosMapActivated);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  EBR Activated: ");
            sb2.append(this.ebrActivated);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  SSPN Interface Activated: ");
            sb2.append(this.sspnInterfaceActivated);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  Bit35: ");
            sb2.append(this.bit35);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  MSGCF Activated: ");
            sb2.append(this.msgcfActivated);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  TDLS Supported: ");
            sb2.append(this.tdlsSupported);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  TDLS Prohibited: ");
            sb2.append(this.tdlsProhibited);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  TDLS Channel Switching Prohibited: ");
            sb2.append(this.tdlsChannelSwitchingProhibited);
            sb2.append(property);
        }
        if (this.actualLength > 5) {
            sb2.append(str);
            sb2.append("  Rejecting Unadmitted Traffic: ");
            sb2.append(this.rejectingUnadmittedTraffic);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  Service Interval Granularity: ");
            sb2.append(this.serviceIntervalGranularity);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  RM Identifier Measurement Activated: ");
            sb2.append(this.rmIdentifierMeasurementActivated);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  U-APSD Coexistence Activated: ");
            sb2.append(this.uapsdCoexistenceActivated);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  WNM-Notification Activated: ");
            sb2.append(this.wnmNotificationActivated);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  Bit47: ");
            sb2.append(this.bit47);
            sb2.append(property);
        }
        if (this.actualLength > 6) {
            sb2.append(str);
            sb2.append("  UTF-8 SSID: ");
            sb2.append(this.utf8Ssid);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  Bit49: ");
            sb2.append(this.bit49);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  Bit50: ");
            sb2.append(this.bit50);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  Bit51: ");
            sb2.append(this.bit51);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  Bit52: ");
            sb2.append(this.bit52);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  Bit53: ");
            sb2.append(this.bit53);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  Bit54: ");
            sb2.append(this.bit54);
            sb2.append(property);
            sb2.append(str);
            sb2.append("  Bit55: ");
            sb2.append(this.bit55);
            sb2.append(property);
        }
        if (this.actualLength > 7) {
            sb2.append(str);
            sb2.append("  Trailing Data: 0x");
            sb2.append(ByteArrays.toHexString(this.trailingData, ""));
            sb2.append(property);
        }
        return sb2.toString();
    }
}

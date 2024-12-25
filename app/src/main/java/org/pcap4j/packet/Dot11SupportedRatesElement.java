package org.pcap4j.packet;

import java.util.List;
import org.pcap4j.packet.Dot11AbstractSupportedRatesElement;
import org.pcap4j.packet.namednumber.Dot11InformationElementId;
import org.pcap4j.util.ByteArrays;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11SupportedRatesElement.class */
public final class Dot11SupportedRatesElement extends Dot11AbstractSupportedRatesElement {
    private static final long serialVersionUID = -27225920570715871L;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/packet/Dot11SupportedRatesElement$Builder.class */
    public static final class Builder extends Dot11AbstractSupportedRatesElement.Builder {
        public Builder() {
            elementId(Dot11InformationElementId.getInstance(Dot11InformationElementId.SUPPORTED_RATES.value()));
        }

        private Builder(Dot11SupportedRatesElement dot11SupportedRatesElement) {
            super(dot11SupportedRatesElement);
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public Dot11InformationElement build() {
            preBuild();
            return new Dot11SupportedRatesElement(this);
        }

        @Override // org.pcap4j.packet.Dot11InformationElement.Builder, org.pcap4j.packet.LengthBuilder
        /* renamed from: correctLengthAtBuild, reason: avoid collision after fix types in other method */
        public LengthBuilder<Dot11InformationElement> correctLengthAtBuild2(boolean z10) {
            super.correctLengthAtBuild2(z10);
            return this;
        }

        @Override // org.pcap4j.packet.Dot11InformationElement.Builder
        public Builder length(byte b10) {
            super.length(b10);
            return this;
        }

        @Override // org.pcap4j.packet.Dot11AbstractSupportedRatesElement.Builder
        public /* bridge */ /* synthetic */ Dot11AbstractSupportedRatesElement.Builder ratesAndBssMembershipSelectors(List list) {
            return ratesAndBssMembershipSelectors((List<Dot11AbstractSupportedRatesElement.Datum>) list);
        }

        @Override // org.pcap4j.packet.Dot11AbstractSupportedRatesElement.Builder
        public Builder ratesAndBssMembershipSelectors(List<Dot11AbstractSupportedRatesElement.Datum> list) {
            super.ratesAndBssMembershipSelectors(list);
            return this;
        }
    }

    private Dot11SupportedRatesElement(Builder builder) {
        super(builder);
    }

    private Dot11SupportedRatesElement(byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11, Dot11InformationElementId.SUPPORTED_RATES);
    }

    public static Dot11SupportedRatesElement newInstance(byte[] bArr, int i10, int i11) {
        ByteArrays.validateBounds(bArr, i10, i11);
        return new Dot11SupportedRatesElement(bArr, i10, i11);
    }

    @Override // org.pcap4j.packet.Dot11AbstractSupportedRatesElement
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.Dot11AbstractSupportedRatesElement
    public String getElementName() {
        return "Supported Rates";
    }
}
